package antlrtest;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

public class MyListener extends ExprBaseListener {


  // override functions of interest here
  @Override public void exitExpr(ExprParser.ExprContext ctx) {
    if (ctx.children.size() == 3 && (ctx.children.get(1) instanceof TerminalNode)) {
      String leftHandSide = ctx.children.get(0).getText();
      String operator = ctx.children.get(1).getText();
      String rightHandSide = ctx.children.get(2).getText();
      System.out.printf("Full operation: leftHandSide=%s, operator=%s, rightHandSide=%s\n", leftHandSide, operator, rightHandSide);
    }
    if (ctx.children.size() == 1){
      System.out.println("Operand: " + ctx.children.get(0).getText());
    }
  }

  @Override public void enterExpr(ExprParser.ExprContext ctx) {
    // System.out.println("Parsing expression: " + ctx.getText());
  }

  public static void main(String[] args) throws Exception{
    System.out.println("Entering parser?");
    // create a CharStream that reads from standard input
    ANTLRInputStream input = new ANTLRInputStream(System.in); // create a lexer that feeds off of input CharStream
    ExprLexer lexer = new ExprLexer(input); // create a buffer of tokens pulled from the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer); // create a parser that feeds off the tokens buffer
    ExprParser parser = new ExprParser(tokens);
    ParseTree tree = parser.prog(); // begin parsing at init rule
    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk(new MyListener(), tree);
    System.out.println();
  }

}