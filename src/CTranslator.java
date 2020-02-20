package src;

import src.antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

import java.util.Set; // for the global variables tracking
import java.util.HashSet; // for the global variables tracking

// antlr listeners are by default depth-first walk (therefore a full in depth anticlockwise circle)

public class CTranslator extends CBaseListener {

  ////////////////////////////////////////////////////////////////////////////////////
  // use three common helper variables for the translator object
  int current_scope; // tracks the tabulation requirement
  Boolean include_main; // checks if we include the python main call
  Set<String> global_variables = new HashSet<String>(); // set of global variables to be included

  ////////////////////////////////////////////////////////////////////////////////////
  // constructor. Set scope to 0 and main to false
  CTranslator() {
    current_scope = 0; // keep track of the scop count to tabulate correctly
    include_main = false; // keep track if we need to include a main
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // function to add tabs correctly for the python generation
  public void tabulate() {
    for (int i = 0; i < current_scope; i++)
      System.out.print("\t");
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // variable declaration is similar with a compulsory assignemnt (=0) and remove type
  @Override
  public void enterDecl(CParser.DeclContext ctx) {
    tabulate();
    System.out.println(ctx.decl_l.getText() + "=0");
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // add variable to global set
  // these are the only cases where we might declare a new variable
  @Override public void enterAssgnOp(CParser.AssgnOpContext ctx) {
    if(current_scope==0){
      global_variables.add(ctx.left.getText());
    }
  }

  @Override public void enterSingleDeclarator(CParser.SingleDeclaratorContext ctx) {
    if(current_scope==0){
      global_variables.add(ctx.decl.getText());
    }
  }

  @Override
  public void enterAssgn(CParser.AssgnContext ctx) {
    tabulate();
    System.out.println(ctx.assgn.getText());
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // assignement statement
  @Override
  public void enterAssignmentStatement(CParser.AssignmentStatementContext ctx) {
    int a = ctx.stmt.start.getStartIndex();
    int b = ctx.stmt.stop.getStopIndex();
    Interval interval = new Interval(a, b);
    String operation = ctx.stmt.start.getInputStream().getText(interval);
    tabulate();
    System.out.println(operation);
  }
  
  ////////////////////////////////////////////////////////////////////////////////////
  // mainly function calls and expressions (valid as statements)
  @Override
  public void enterExprStatement(CParser.ExprStatementContext ctx) {
    int a = ctx.stmt.start.getStartIndex();
    int b = ctx.stmt.stop.getStopIndex();
    Interval interval = new Interval(a, b);
    String functionCall = ctx.stmt.start.getInputStream().getText(interval);
    tabulate();
    System.out.println(functionCall);
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // function declartion with some params manipulation
  @Override
  public void enterFunction_definition(CParser.Function_definitionContext ctx) {
    tabulate();
    current_scope += 1;
    System.out.print("def " + ctx.func_dec.getChild(0) + "(");
    if (ctx.func_dec.getChild(0).getText().toString().equals("main")) {
      include_main = true;
    }
  }

  // very ugly solution but if this is the last param, close function definition
  // else place a comma for the next param
  // put closing parentheses (check twice unfortunatly)
  // could also directly put that in the grammar
  // please open an issue later if this needs to be resolved for a better implementation

  @Override
  public void enterParameter_declaration(CParser.Parameter_declarationContext ctx) {
    System.out.print(ctx.decl.getText());
    if(ctx.getParent().getParent().getChild(1).getText().equals("(")){
      System.out.println("):");
      for(String gVar : global_variables){
        tabulate();System.out.println("global "+gVar);
      }
    }else{
      System.out.print(", ");
    }
  }

  @Override
  public void exitFunction_definition(CParser.Function_definitionContext ctx) {
    tabulate();System.out.println("pass"); // for empty functions, python will not compile
    current_scope -= 1;
  }

  @Override
  public void exitFuncDecl(CParser.FuncDeclContext ctx){
    if(ctx.getChild(3) == null) {
      System.out.println("):");
      for(String gVar : global_variables){
        tabulate();System.out.println("global "+gVar);
      }
    }
  }

  // end of function declaration


  ////////////////////////////////////////////////////////////////////////////////////
  // if statement (with else independant)
  // note that the else is part of the if context
  @Override
  public void enterIfStat(CParser.IfStatContext ctx) {
    int a = ctx.condition.start.getStartIndex();
    int b = ctx.condition.stop.getStopIndex();
    Interval interval = new Interval(a, b);
    String condition = ctx.start.getInputStream().getText(interval);
    tabulate();
    System.out.println("if(" + condition + "):");
    current_scope += 1;
  }

  @Override
  public void exitIfStat(CParser.IfStatContext ctx) {
    current_scope -= 1;
  }

  @Override
  public void enterElseStat(CParser.ElseStatContext ctx) {
    // because in the grammar, the else is within the ifStat context, it is getting an extra tabulation
    // decrement the scope by one. An elseStat is ALWAYS part of an ifStat anyway
    current_scope -= 1; 
    tabulate();
    System.out.println("else:");
    current_scope += 1;
    // do not decrement scope when leaving an elseStat context because we are also leaving an ifStat context
    // which will already decrement the scope
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // return statement
  @Override public void enterReturnStatement(CParser.ReturnStatementContext ctx) {
    String ret = "";
    if (ctx.expr != null) {
      int a = ctx.expr.start.getStartIndex();
      int b = ctx.expr.stop.getStopIndex();
      Interval interval = new Interval(a, b);
      ret = ctx.expr.start.getInputStream().getText(interval);
    }
    tabulate();
    System.out.println("return " + ret);
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // while statement. Same concept as the if
  @Override
  public void enterWhileStat(CParser.WhileStatContext ctx) {
    int a = ctx.condition.start.getStartIndex();
    int b = ctx.condition.stop.getStopIndex();
    Interval interval = new Interval(a, b);
    String condition = ctx.start.getInputStream().getText(interval);
    tabulate();
    System.out.println("while(" + condition + "):");
    current_scope += 1;
  }

  @Override
  public void exitWhileStat(CParser.WhileStatContext ctx) {
    current_scope -= 1;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // main class. create a tree and call a listener on the tree
  public static void main(String[] args) throws Exception {
    // create a CharStream that reads from standard input
    ANTLRInputStream input = new ANTLRInputStream(System.in); // create a lexer that feeds off of input CharStream
    CLexer lexer = new CLexer(input); // create a buffer of tokens pulled from the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer); // create a parser that feeds off the tokens buffer
    CParser parser = new CParser(tokens);
    ParseTree tree = parser.translation_unit(); // begin parsing at init rule
    ParseTreeWalker walker = new ParseTreeWalker();
    CTranslator CtoPython = new CTranslator();
    walker.walk(CtoPython, tree);
    // if (CtoPython.include_main) {
    //   System.out.println("if __name__ == \"__main__\":\n\timport sys\n\tret=main()\n\tsys.exit(ret)");
    // }
    System.out.println();
  }

}