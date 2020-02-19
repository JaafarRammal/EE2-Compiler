package c_translator;

import c_translator.antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

import java.util.Set; // for the global variables tracking
import java.util.HashSet; // for the global variables tracking

public class CTranslator extends CBaseListener {

  int current_scope;
  Boolean include_main;
  Set<String> global_variables = new HashSet<String>();


  CTranslator() {
    current_scope = 0; // keep track of the scop count to tabulate correctly
    include_main = false; // keep track if we need to include a main
  }

  // function to add tabs correctly for the python generation
  public void tabulate() {
    for (int i = 0; i < current_scope; i++)
      System.out.print("\t");
  }

  // variable declaration is similar with a compulsory assignemnt (=0) and remove
  // type
  @Override
  public void enterDecl(CParser.DeclContext ctx) {
    tabulate();
    System.out.println(ctx.decl_l.getText() + "=0");
  }

  // copy the assignement
  @Override
  public void enterAssgn(CParser.AssgnContext ctx) {
    tabulate();
    System.out.println(ctx.assgn.getText());
  }

  // copy the assignment
  @Override public void enterAssgnOp(CParser.AssgnOpContext ctx) {
    tabulate();
    if(current_scope==0){
      global_variables.add(ctx.left.getText());
    }
  }

  @Override
  public void enterAssignmentStatement(CParser.AssignmentStatementContext ctx) {
    int a = ctx.stmt.start.getStartIndex();
    int b = ctx.stmt.stop.getStopIndex();
    Interval interval = new Interval(a, b);
    String operation = ctx.stmt.start.getInputStream().getText(interval);
    tabulate();
    System.out.println(operation);
  }

  // copy the assignment
  @Override public void enterSingleDeclarator(CParser.SingleDeclaratorContext ctx) {
    if(current_scope==0){
      global_variables.add(ctx.decl.getText());
    }
  }

  @Override
  public void enterFunction_definition(CParser.Function_definitionContext ctx) {
    current_scope += 1;
    int a = ctx.func_dec.start.getStartIndex();
    int b = ctx.func_dec.stop.getStopIndex();
    Interval interval = new Interval(a, b);
    String definition = ctx.start.getInputStream().getText(interval);
    System.out.println("def " + definition + ":");
    if (ctx.func_dec.getChild(0).getText().toString().equals("main")) {
      include_main = true;
      for(String gVar : global_variables){
        tabulate();System.out.println("global "+gVar);
      }
    }
    ;
  }

  @Override
  public void exitFunction_definition(CParser.Function_definitionContext ctx) {
    current_scope -= 1;
  }


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

  @Override
  public void enterWhileStat(CParser.WhileStatContext ctx) {
    current_scope += 1;
    int a = ctx.condition.start.getStartIndex();
    int b = ctx.condition.stop.getStopIndex();
    Interval interval = new Interval(a, b);
    String condition = ctx.start.getInputStream().getText(interval);
    tabulate();
    System.out.println("while(" + condition + "):");
  }

  @Override
  public void exitWhileStat(CParser.WhileStatContext ctx) {
    current_scope -= 1;
  }

  @Override
  public void enterCmpStatementEmpty(CParser.CmpStatementEmptyContext ctx) {
    //current_scope += 1;
  }

  @Override
  public void exitCmpStatementEmpty(CParser.CmpStatementEmptyContext ctx) {
    //current_scope -= 1;
  }

  @Override
  public void enterCmpStatementNonEmpty(CParser.CmpStatementNonEmptyContext ctx) {
    //current_scope += 1;
  }

  @Override
  public void exitCmpStatementNonEmpty(CParser.CmpStatementNonEmptyContext ctx) {
    //current_scope -= 1;
  }

  public static void main(String[] args) throws Exception {
    // create a CharStream that reads from standard input
    ANTLRInputStream input = new ANTLRInputStream(System.in); // create a lexer that feeds off of input CharStream
    CLexer lexer = new CLexer(input); // create a buffer of tokens pulled from the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer); // create a parser that feeds off the tokens buffer
    CParser parser = new CParser(tokens);
    ParseTree tree = parser.translation_unit(); // begin parsing at init rule
    ParseTreeWalker walker = new ParseTreeWalker();
    System.out.println("Equivalent python is:\n");
    CTranslator CtoPython = new CTranslator();
    walker.walk(CtoPython, tree);
    if (CtoPython.include_main) {
      System.out.println("if __name__ == \"__main__\":\n\timport sys\n\tret=main()\n\tsys.exit(ret)");
    }
    System.out.println();
  }

}