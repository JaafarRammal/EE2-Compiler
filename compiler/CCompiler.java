package compiler;

import compiler.antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

import java.util.Map;
import java.util.HashMap;

public class CCompiler extends CBaseVisitor <String> {

  int mem;
  String[] scratch = new String[3];
  int current_s;
  Map<String, Integer> table = new HashMap<String, Integer>();

  CCompiler(){
    mem = 0;
    current_s = 0;
    scratch[0] = "R1"; scratch[1] = "R3"; scratch[2] = "R7";
  }

  // add comment of every line to debug easily
  @Override
  public String visitStatBlockItem(CParser.StatBlockItemContext ctx){
    int a = ctx.item.start.getStartIndex();
    int b = ctx.item.stop.getStopIndex();
    Interval interval = new Interval(a, b);
    String line = ctx.item.start.getInputStream().getText(interval);
    System.out.println("\n# " + line);
    this.visit(ctx.item);
    return "DONE";
  }
  @Override
  public String visitDecBlockItem(CParser.DecBlockItemContext ctx){
    int a = ctx.item.start.getStartIndex();
    int b = ctx.item.stop.getStopIndex();
    Interval interval = new Interval(a, b);
    String line = ctx.item.start.getInputStream().getText(interval);
    System.out.println("\n# " + line);
    this.visit(ctx.item);
    return "DONE";
  }
  // end debug functions

  @Override
  public String visitOpAddExpr(CParser.OpAddExprContext ctx) { 
    this.visit(ctx.left);
    System.out.println("SW R2 " + mem++);

    this.visit(ctx.right);
    System.out.println("SW R2 " + mem++);

    System.out.println("LW " + scratch[current_s++] + " " + --mem);
    System.out.println("LW " + scratch[current_s++] + " " + --mem);

    if(ctx.op.getText().equals('+')){
      System.out.println("ADD R2 " + scratch[--current_s] + " " + scratch[--current_s]);
    }else{
      System.out.println("SUB R2 " + scratch[--current_s] + " " + scratch[--current_s]);
    }

    return "DONE";
  }

  @Override
  public String visitIntConstPrimaryExpr(CParser.IntConstPrimaryExprContext ctx){
    System.out.println("LI R2 " + ctx.val.getText());
    return "DONE";
  }

  @Override
  public String visitIdPrimaryExpr(CParser.IdPrimaryExprContext ctx){
    System.out.println("LW R2 " + table.get(ctx.id.getText()));
    return "DONE";
  }

  @Override
  public String visitOpAssgnExpr(CParser.OpAssgnExprContext ctx){
    this.visit(ctx.right);
    System.out.println("SW R2 " + table.get(ctx.left.getText()));
    return "DONE";
  }

  @Override
  public String visitOpInitDec(CParser.OpInitDecContext ctx){
    this.visit(ctx.right);
    System.out.println("SW R2 " + mem);
    table.put(ctx.left.getText(), mem++);
    return "DONE";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // main class. create a tree and call a listener on the tree
  public static void main(String[] args) throws Exception {
    // create a CharStream that reads from standard input
    ANTLRInputStream input = new ANTLRInputStream(System.in); // create a lexer that feeds off of input CharStream
    CLexer lexer = new CLexer(input); // create a buffer of tokens pulled from the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer); // create a parser that feeds off the tokens buffer
    CParser parser = new CParser(tokens);
    ParseTree tree = parser.compilationUnit(); // begin parsing at init rule
    CCompiler compiler = new CCompiler();
    String assembly = compiler.visit(tree);
    System.out.println(assembly);
  }

}