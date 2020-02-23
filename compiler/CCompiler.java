package compiler;

import compiler.antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

import java.util.Map;
import java.util.HashMap;

public class CCompiler extends CBaseVisitor<String> {

  int mem;
  String[] scratch = new String[3];
  int current_s;
  String current_op; //for retrieving operation of expression inside if statement
  int label_id; //for unique identification of each label (branch)
  Map<String, Integer> table = new HashMap<String, Integer>();

  CCompiler() {
    mem = 0;
    current_s = 0;
    current_op = "";
    label_id = 0;
    scratch[0] = "$t0";
    scratch[1] = "$t1";
    scratch[2] = "$t2"; // r8-r15	($t0-$t7)	Temporaries, not saved
    // update: just manually use these scratch registers, easier to play around with order?
  }












  ////////////////////////////////////////////////////////////////////////////////////
  // HELPERS

  ////////////////////////////////////////////////////////////////////////////////////
  // 3 children operations helper
  // form LEFT OP RIGHT
  // RIGHT is pushed first
  public String threeOp(ParserRuleContext ctx){
    this.visit(ctx.getChild(0));
    System.out.println("sw $v0 " + mem++);

    this.visit(ctx.getChild(2));
    System.out.println("sw $v0 " + mem++);

    System.out.println("lw " + pushScratch() + --mem);  // push right
    System.out.println("lw " + pushScratch() + --mem);  // push left
    return "DONE";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // add comment of every line to debug easily
  @Override
  public String visitStatBlockItem(CParser.StatBlockItemContext ctx) {
    int a = ctx.item.start.getStartIndex();
    int b = ctx.item.stop.getStopIndex();
    Interval interval = new Interval(a, b);
    String line = ctx.item.start.getInputStream().getText(interval);
    System.out.println("\n# " + line);
    this.visit(ctx.item);
    return "DONE";
  }

  @Override
  public String visitDecBlockItem(CParser.DecBlockItemContext ctx) {
    int a = ctx.item.start.getStartIndex();
    int b = ctx.item.stop.getStopIndex();
    Interval interval = new Interval(a, b);
    String line = ctx.item.start.getInputStream().getText(interval);
    System.out.println("\n# " + line);
    this.visit(ctx.item);
    return "DONE";
  }

  // scratch registers helpers
  public String pushScratch(){
    return scratch[current_s++] + " ";
  }

  public String popScratch(){
    return scratch[--current_s]+ " ";
  }

  // illegal argument exception helper
  public String throwIllegalArgument(String operand, String rule){
    throw new IllegalArgumentException("Found illegal operand " + operand + " when visiting context " + rule);
  }

  // makeName for label
  public String makeName(String base){
    return "_" + base + "_" + label_id++;
  }
  

  // END OF HELPERS AND COMMON FUNCTIONS
  ////////////////////////////////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////










  ////////////////////////////////////////////////////////////////////////////////////
  // VARIABLES MANIPULATIONS

  ////////////////////////////////////////////////////////////////////////////////////
  // integer constant node
  @Override
  public String visitIntConstPrimaryExpr(CParser.IntConstPrimaryExprContext ctx) {
    System.out.println("li $v0 " + ctx.val.getText());
    return "DONE";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // variable identifier
  @Override
  public String visitIdPrimaryExpr(CParser.IdPrimaryExprContext ctx) {
    System.out.println("lw $v0 " + table.get(ctx.id.getText()));
    return "DONE";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // assignement left = right
  @Override
  public String visitOpAssgnExpr(CParser.OpAssgnExprContext ctx) {
    this.visit(ctx.right);
    System.out.println("sw $v0 " + table.get(ctx.left.getText()));
    return "DONE";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // declaring a variable with initialization
  // TYPE ID = VAL
  @Override
  public String visitOpInitDec(CParser.OpInitDecContext ctx) {
    this.visit(ctx.right);
    System.out.println("sw $v0 " + mem);
    table.put(ctx.left.getText(), mem++);
    return "DONE";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // declaring a variable without initialization
  // TYPE ID;
  // default value to zero
  @Override
  public String visitTermInitDec(CParser.TermInitDecContext ctx){
    System.out.println("sw $zero " + mem);
    table.put(ctx.dec.getText(), mem++);
    return "DONE";
  }

  // end variable manipulation
  ////////////////////////////////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////






  ////////////////////////////////////////////////////////////////////////////////////
  // arithmetic and binary expressions

  ////////////////////////////////////////////////////////////////////////////////////
  // logical OR
  @Override
  public String visitOpLogOrExpr(CParser.OpLogOrExprContext ctx){
    return "U";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // logical AND
  @Override
  public String visitOpLogAndExpr(CParser.OpLogAndExprContext ctx){
    return "U";
  }
  
  ////////////////////////////////////////////////////////////////////////////////////
  // inclusive OR
  @Override
  public String visitOpIncOrExpr(CParser.OpIncOrExprContext ctx){
    return "U";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // exclusive OR
  @Override
  public String visitOpExcOrExpr(CParser.OpExcOrExprContext ctx){
    return "U";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  //  AND
  @Override
  public String visitOpAndExpr(CParser.OpAndExprContext ctx){
    return "U";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // shift operations (<< and >>)
  @Override
  public String visitOpShiftExpr(CParser.OpShiftExprContext ctx){
    return "U";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // MUL, DIV, MOD
  @Override
  public String visitOpMultExpr(CParser.OpMultExprContext ctx){
    threeOp(ctx);
    switch(ctx.op.getText()){
      case("*"):
        System.out.println("mul $v0 " + popScratch() + popScratch());
        break;
      case("/"):
        System.out.println("div " + popScratch() + popScratch());
        System.out.println("mflo $v0");
        break;
      case("%"):
        System.out.println("div " + popScratch() + popScratch());
        System.out.println("mfhi $v0");
        break;
      default:
        throwIllegalArgument(ctx.op.getText(), "OpMultExpr");
    }
    return "DONE";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // ADD, SUB
  @Override
  public String visitOpAddExpr(CParser.OpAddExprContext ctx) {
    threeOp(ctx);
    if (ctx.op.getText().equals("+")) {
      System.out.println("add $v0 " + popScratch() + popScratch());
    } else {
      System.out.println("sub $v0 " + popScratch() + popScratch());
    }
    return "DONE";
  }

  // end arithmetic and binary expressions
  ////////////////////////////////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////















  ////////////////////////////////////////////////////////////////////////////////////
  // Selection statement
  @Override
  public String visitIfSelecStat(CParser.IfSelecStatContext ctx) {
    // Get the operation of the expression
    String operation = ctx.cond.getText(); // <'|'>'|'<='|'>=
    this.visit(ctx.cond);
    
    //TODO: formatting of labels and instructions with tabulation
    switch (current_op) {
    case ">":
      System.out.println("bne $v0, $zero, LABEL"+label_id); // if $s0 > $s1, goes to label1, which is what's inside if(){label1}
      if (ctx.falseExec != null) {
        this.visit(ctx.falseExec);
      }
      System.out.println("LABEL"+label_id+": ");
      this.visit(ctx.trueExec);
      ++label_id;
      break;
    case "<":
      System.out.println("bne $v0, $zero, LABEL"+label_id); // # $t0 == 1 != 0 if a < b
      if (ctx.falseExec != null) {
        this.visit(ctx.falseExec);
      }
      System.out.println("LABEL"+label_id+": ");
      this.visit(ctx.trueExec);
      ++label_id;
      break;
    case "<=":
      System.out.println("beq $v0, $zero, LABEL"+label_id); 
      if (ctx.falseExec != null) {
        this.visit(ctx.falseExec);
      }
      System.out.println("LABEL"+label_id+": ");
      this.visit(ctx.trueExec);
      ++label_id;
      break;
    case ">=":
      System.out.println("beq $v0, $zero, LABEL"+label_id);
      if (ctx.falseExec != null) {
        this.visit(ctx.falseExec);
      }
      System.out.println("LABEL"+label_id+": ");
      this.visit(ctx.trueExec);
      ++label_id;
      break;
    case "==":
      System.out.println("beq $v0, $zero, LABEL"+label_id); // branch to label if R2 holds zero value
      if (ctx.falseExec != null) {
        this.visit(ctx.falseExec);
      }
      System.out.println("LABEL"+label_id+": ");
      this.visit(ctx.trueExec);
      ++label_id;
      break;
    case "!=":
      System.out.println("bne $v0, $zero, LABEL"+label_id); // branch to label if R2 holds zero value
      if (ctx.falseExec != null) {
        this.visit(ctx.falseExec);
      }
      System.out.println("LABEL"+label_id+": ");
      this.visit(ctx.trueExec);
      ++label_id;
      break;
    default:
      // code block
    }
    return "DONE";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  //While loop expression
  @Override
  public String visitWhileIterStat(CParser.WhileIterStatContext ctx){
    // Get the operation of the expression in question
    String operation = ctx.cond.getText(); // <'|'>'|'<='|'>=
    this.visit(ctx.cond);

    switch (current_op) {
    case ">":
      System.out.println("bne $v0, $zero, LABEL"+label_id); // if $s0 > $s1, goes to label1, which is what's inside if(){label1}
      System.out.println("LABEL"+label_id+": ");
      this.visit(ctx.exec);
      //If condition met, go back to Label
      this.visit(ctx.cond);
      System.out.println("bne $v0, $zero, LABEL"+label_id); // if $s0 > $s1, goes to label1, which is what's inside if(){label1}
      ++label_id;
      break;
    case "<":
      System.out.println("bne $v0, $zero, LABEL"+label_id); // # $t0 == 1 != 0 if a < b
      System.out.println("LABEL"+label_id+": ");
      this.visit(ctx.exec);
      //If condition met, go back to Label
      this.visit(ctx.cond);
      System.out.println("bne $v0, $zero, LABEL"+label_id); // # $t0 == 1 != 0 if a < b
      ++label_id;
      break;
    case "<=":
      System.out.println("beq $v0, $zero, LABEL"+label_id); 
      System.out.println("LABEL"+label_id+": ");
      this.visit(ctx.exec);
      //If condition met, go back to Label
      this.visit(ctx.cond);
      System.out.println("beq $v0, $zero, LABEL"+label_id); 
      ++label_id;
      break;
    case ">=":
      System.out.println("beq $v0, $zero, LABEL"+label_id);
      System.out.println("LABEL"+label_id+": ");
      this.visit(ctx.exec);
      //If condition met, go back to Label
      this.visit(ctx.cond);
      System.out.println("beq $v0, $zero, LABEL"+label_id); 
      ++label_id;
      break;
    case "==":
      System.out.println("beq $v0, $zero, LABEL"+label_id); // branch to label if R2 holds zero value
      System.out.println("LABEL"+label_id+": ");
      this.visit(ctx.exec);
      //If condition met, go back to Label
      this.visit(ctx.cond);
      System.out.println("beq $v0, $zero, LABEL"+label_id); 
      ++label_id;
      break;
    case "!=":
      System.out.println("bne $v0, $zero, LABEL"+label_id); // branch to label if R2 holds zero value
      System.out.println("LABEL"+label_id+": ");
      this.visit(ctx.exec);
      //If condition met, go back to Label
      this.visit(ctx.cond);
      System.out.println("bne $v0, $zero, LABEL"+label_id); // branch to label if R2 holds zero value
      ++label_id;
      break;
    default:
      // code block
    }

    return "DONE";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // Relational expression
  @Override
  public String visitOpRelExpr(CParser.OpRelExprContext ctx){
    String operation = ctx.op.getText(); //<'|'>'|'<='|'>=
    current_op = operation;

    //go to the value inside LHS
    this.visit(ctx.left);
    System.out.println("SW $v0 " + mem++); //store in mem

    //go to the value of RHS
    this.visit(ctx.right);
    System.out.println("SW $v0 " + mem++); //store in mem

    //Load variables into register
    System.out.println("LW " + scratch[current_s++] + " " + --mem);
    System.out.println("LW " + scratch[current_s++] + " " + --mem);

    switch(current_op) {
      case ">":
        // System.out.println("beq $t1,1,label1"); //     if $s0 > $s1, goes to label1)
        System.out.println("slt $v0, " + scratch[--current_s] + ", " + scratch[--current_s]); //tests the two registers
        break;
      case "<":
        current_s -= 2;
        System.out.println("slt $v0, " + scratch[current_s] + ", " + scratch[++current_s]); //tests the two registers
        current_s--;
        break;
      case "<=":
        System.out.println("slt $v0, " + scratch[--current_s] + ", " + scratch[--current_s]); //tests the two registers
        break;
      case ">=": 
        current_s -= 2;
        System.out.println("slt $v0, " + scratch[current_s] + ", " + scratch[++current_s]); //tests the two registers
        current_s--;
        break;
      default:
        // code block
    }
    return "DONE";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  //Equality expression
  @Override
  public String visitOpEqualExpr(CParser.OpEqualExprContext ctx){
    String operation = ctx.op.getText(); //<'|'>'|'<='|'>=
    current_op = operation;

    //go to the value inside LHS
    this.visit(ctx.left);
    System.out.println("sw $v0 " + mem++); //store in mem

    //go to the value of RHS
    this.visit(ctx.right);
    System.out.println("sw $v0 " + mem++); //store in mem

    //Load variables into register
    System.out.println("lw " + scratch[current_s++] + " " + --mem);
    System.out.println("lw " + scratch[current_s++] + " " + --mem);

    System.out.println("sub $v0, " + scratch[--current_s] + ", " + scratch[--current_s]);

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
    compiler.visit(tree);
    System.out.println("\n #END OF PROGRAM\njr $zero");
  }

}