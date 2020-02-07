package c_translator;

import c_translator.antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

import java.util.Set; // for the global variables tracking

public class CTranslator extends CBaseListener {

  int current_scope;
  Boolean include_main;

  CTranslator(){
    current_scope = 0;
    include_main = false;
    // Set<String> global_variables = new Set<String>();
  }

  public void tabulate(){
    for(int i=0; i<current_scope; i++)
      System.out.print("\t");
  }

  @Override public void enterDecl(CParser.DeclContext ctx) {
    tabulate();System.out.println(ctx.decl_l.getText()+"=0");
  }

  @Override public void enterAssgn(CParser.AssgnContext ctx) {
    tabulate();System.out.println(ctx.assgn.getText());
  }

  @Override public void enterFunction_definition(CParser.Function_definitionContext ctx) { 
    tabulate();System.out.println("def " + ctx.func_dec.getText() + ":");
  }

  @Override public void enterCmpStatementEmpty(CParser.CmpStatementEmptyContext ctx) { current_scope += 1 ;}
  @Override public void exitCmpStatementEmpty(CParser.CmpStatementEmptyContext ctx) { current_scope -= 1 ;}
  @Override public void enterCmpStatementNonEmpty(CParser.CmpStatementNonEmptyContext ctx) { current_scope += 1 ;}
  @Override public void exitCmpStatementNonEmpty(CParser.CmpStatementNonEmptyContext ctx) { current_scope -= 1 ;}

  public static void main(String[] args) throws Exception{
    // create a CharStream that reads from standard input
    ANTLRInputStream input = new ANTLRInputStream(System.in); // create a lexer that feeds off of input CharStream
    CLexer lexer = new CLexer(input); // create a buffer of tokens pulled from the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer); // create a parser that feeds off the tokens buffer
    CParser parser = new CParser(tokens);
    ParseTree tree = parser.translation_unit(); // begin parsing at init rule
    ParseTreeWalker walker = new ParseTreeWalker();
    System.out.println("Equivalent python is:\n");
    walker.walk(new CTranslator(), tree);
    System.out.println();
  }

}