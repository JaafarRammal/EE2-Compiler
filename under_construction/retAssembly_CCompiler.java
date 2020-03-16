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
  boolean enterFunc;
  String current_op; //for retrieving operation of expression inside if statement
  int label_id; //for unique identification of each label (branch)
  Map<String, Integer> table = new HashMap<String, Integer>();
  boolean debug = false;

  CCompiler(boolean d) {
    mem = 0;
    current_s = 0;
    label_id = 0;
    debug = d;
    enterFunc = true;
    // scratch[0] = "$t0";
    // scratch[1] = "$t1";
    // scratch[2] = "$t2"; // r8-r15	($t0-$t7)	Temporaries, not saved
    // update: just manually use these scratch registers, easier to play around with order?
    
    /*

    MIPS allocation
    |----------|---------------|----------------------------|
    | Register | Assembly name | Comment                    |
    |----------|---------------|----------------------------|
    | r0       | $zero         | Always 0                   |
    | r1       | $at           | Reserved for assembler     |
    | r2-r3    | $v0-$v1       | Stores result              |
    | r4-r7    | $a0-$a3       | Stores arguments           |
    | r8-r15   | $t0-$t7       | Temporaries, not saved     |
    | r16-r23  | $s0-$s7       | Contents saved for later   |
    | r24-r25  | $t8-$t9       | More temporaries not saved |
    | r26-r27  | $k0-$k1       | Reserved by OS             |
    | r28      | $gp           | Global pointer             |
    | r29      | $sp           | Stack pointer              |
    | r30      | $fp           | Frame pointer              |
    | r31      | $ra           | Return address             |
    |----------|---------------|----------------------------|


    Our current usage:
    ---------------

    $v0         | return register of any context evaluation
    $t0-$t1     | scratch for LEFT OP RIGHT expressions
    $t2         | store value during self assignements OR assist comparaison



    Conventions:
    -------------

    - Any scratch register is undefined when leaving a context function and therefore can be used freely in another context
    - Return registers should always contain the correct / expected return value of the context    
    */
  }



  ////////////////////////////////////////////////////////////////////////////////////
  // HELPERS

  ////////////////////////////////////////////////////////////////////////////////////
  // expression helper
  // form LEFT OP RIGHT
  // $t0 has left
  // $t1 has right
  public String threeOp(ParserRuleContext ctx){

    String assembly_code = "";

    // NEEDS STACK IMPLEMENT OF THE $SP
    // WILL BE ADDED LATER
    // FOR NOW REFER TO MEM AS AN OFFSET ON THE STACK

    this.visit(ctx.getChild(0));

    assembly_code += "sw $v0, " + 4*(mem++) + "($sp)\n";
    System.out.println("sw $v0, " + 4*(mem++) + "($sp)");

    this.visit(ctx.getChild(2));
    assembly_code += "sw $v0, " + 4*(mem++) + "($sp)\n";
    System.out.println("sw $v0, " + 4*(mem++) + "($sp)");

    assembly_code += "lw $t1, " + 4*(--mem) + "($sp)\n" + "lw $t0, " + 4*(--mem) + "($sp)\n";
    System.out.println("lw $t1, " + 4*(--mem) + "($sp)");  // get right from stack
    System.out.println("lw $t0, " + 4*(--mem) + "($sp)");  // get left from stack
    return assembly_code;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // add comment of every line to debug easily
  @Override
  public String visitStatBlockItem(CParser.StatBlockItemContext ctx) {
    if(debug){
      int a = ctx.item.start.getStartIndex();
      int b = ctx.item.stop.getStopIndex();
      Interval interval = new Interval(a, b);
      String line = ctx.item.start.getInputStream().getText(interval);
      line = line.replaceAll("\n", "\n# ");
      System.out.println("\n# " + line);
    }
    this.visit(ctx.item);
    return "DONE";
  }

  @Override
  public String visitDecBlockItem(CParser.DecBlockItemContext ctx) {
    String assembly_code = "";
    if(debug){
      int a = ctx.item.start.getStartIndex();
      int b = ctx.item.stop.getStopIndex();
      Interval interval = new Interval(a, b);
      String line = ctx.item.start.getInputStream().getText(interval);
      line = line.replaceAll("\n", "\n# ");
      assembly_code+="\n# " + line + "\n";
      System.out.println("\n# " + line);
    }
    this.visit(ctx.item);
    return assembly_code;
  }

  // illegal argument exception helper
  public String throwIllegalArgument(String operand, String rule){
    throw new IllegalArgumentException("Found illegal operand " + operand + " when visiting context " + rule);
  }

  // makeName for label
  public String makeName(String base){
    return "_" + base + "_" + label_id++;
  }
  
  // insert label (to not forget the : )
  public String insertLabel(String label, String input_assembly){
    String assembly_code = input_assembly + label + ":\n";
    System.out.println(label + ":");

    return assembly_code;
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
    String assembly_code = "ori $v0, $v0, " + ctx.val.getText() + "\n";
    System.out.println("ori $v0, $v0, " + ctx.val.getText());
    return assembly_code;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // variable identifier
  @Override
  public String visitIdPrimaryExpr(CParser.IdPrimaryExprContext ctx) {
    String assembly_code = "lw $v0, " + table.get(ctx.id.getText())+ "($sp)\n";
    System.out.println("lw $v0, " + table.get(ctx.id.getText())+ "($sp)\n");
    return assembly_code;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // declaring a variable with initialization
  // TYPE ID = VAL
  @Override
  public String visitOpInitDec(CParser.OpInitDecContext ctx) {
    this.visit(ctx.right);
    String varName = ctx.left.getText();
    String assembly_code = "sw $v0, " + 4*(mem) + "($sp)\t\t# \"" + varName + "\" was stored in " + String.format("0x%08X", 4*(mem)) + " on stack\n";
    System.out.println("sw $v0, " + 4*(mem) + "($sp)\t\t# \"" + varName + "\" was stored in " + String.format("0x%08X", 4*(mem)) + " on stack");
    table.put(varName, mem++);
    return assembly_code;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // declaring a variable without initialization
  // TYPE ID;
  // default value to zero
  @Override
  public String visitTermInitDec(CParser.TermInitDecContext ctx){
    String assembly_code = "sw $zero, " + 4*(mem) + "($sp)\n";
    System.out.println("sw $zero, " + 4*(mem) + "($sp)");
    table.put(ctx.dec.getText(), mem++);
    return assembly_code;
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
    String successEnd = makeName("logical_or_success");
    String failEnd = makeName("logical_or_fail");
    String assembly_code = "";

    this.visit(ctx.left);
    assembly_code += "bne $v0, $zero, " + successEnd + "\nnop\n";
    System.out.println("bne $v0, $zero, " + successEnd + "\nnop"); // if left is non-zero, return true

    this.visit(ctx.right);

    assembly_code += "sw $v0, " + 4*mem + "($sp)\n";
    System.out.println("sw $v0, " + 4*mem + "($sp)");
    table.put(ctx.left.getText(), mem++);
    return assembly_code;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // logical AND
  @Override
  public String visitOpLogAndExpr(CParser.OpLogAndExprContext ctx){
    String successEnd = makeName("logical_and_success");
    String failEnd = makeName("logical_and_fail");
    String assembly_code = "";
    
    this.visit(ctx.left);
    assembly_code += "beq $v0, $zero, " + failEnd + "\nnop\n";
    System.out.println("beq $v0, $zero, " + failEnd + "\nnop"); // if left is zero, return false

    this.visit(ctx.right);
    assembly_code += "beq $v0, $zero, " + failEnd + "\nnop\n";
    System.out.println("beq $v0, $zero, " + failEnd + "\nnop"); // if right is zero, return false

    assembly_code += "addiu $v0, $zero, 1\n";
    System.out.println("addiu $v0, $zero, 1"); // both weren't zero, return true

    assembly_code += "j " + successEnd + "\nnop\n";
    System.out.println("j " + successEnd + "\nnop");
    assembly_code = insertLabel(failEnd, assembly_code);

    assembly_code += "addu $v0, $zero, $zero\n";
    System.out.println("addu $v0, $zero, $zero");
    assembly_code = insertLabel(successEnd, assembly_code);
    return assembly_code;
  }
  
  ////////////////////////////////////////////////////////////////////////////////////
  // inclusive OR
  @Override
  public String visitOpIncOrExpr(CParser.OpIncOrExprContext ctx){
    threeOp(ctx);
    String assembly_code = "";

    assembly_code += "or $v0, $t0, $t1\n";
    System.out.println("or $v0, $t0, $t1");
    return assembly_code;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // exclusive OR
  @Override
  public String visitOpExcOrExpr(CParser.OpExcOrExprContext ctx){
    threeOp(ctx);
    String assembly_code = "";

    assembly_code += "xor $v0, $t0, $t1\n";
    System.out.println("xor $v0, $t0, $t1");
    return assembly_code;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // AND
  @Override
  public String visitOpAndExpr(CParser.OpAndExprContext ctx){
    threeOp(ctx);
    String assembly_code = "";
    assembly_code += "and $v0, $t0, $t1\n";

    System.out.println("and $v0, $t0, $t1");
    return assembly_code;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // shift operations (<< and >>)
  @Override
  public String visitOpShiftExpr(CParser.OpShiftExprContext ctx){
    threeOp(ctx);
    String assembly_code = ""; 

    switch(ctx.op.getText()){
      case("<<"):
        assembly_code += "sllv $v0, $t0, $t1\n";
        System.out.println("sllv $v0, $t0, $t1");
        break;
      case(">>"):
        assembly_code += "srav $v0, $t0, $t1\n";
        System.out.println("srav $v0, $t0, $t1");
        break;
      default:
        throwIllegalArgument(ctx.op.getText(), "OpShiftExpr");
    }
    return assembly_code;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // MUL, DIV, MOD
  @Override
  public String visitOpMultExpr(CParser.OpMultExprContext ctx){
    threeOp(ctx);
    String assembly_code = "";

    switch(ctx.op.getText()){
      case("*"):
        assembly_code += "mul $v0, $t0, $t1\n";
        System.out.println("mul $v0, $t0, $t1");
        break;
      case("/"):
        assembly_code += "div $t0, $t1\n" + "mflo $v0\n";
        System.out.println("div $t0, $t1"); // left / right
        System.out.println("mflo $v0");
        break;
      case("%"):
        assembly_code += "div $t0, $t1\n" + "mfhi $v0\n";
        System.out.println("div $t0, $t1");
        System.out.println("mfhi $v0");
        break;
      default:
        throwIllegalArgument(ctx.op.getText(), "OpMultExpr");
    }
    return assembly_code;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // ADD, SUB
  @Override
  public String visitOpAddExpr(CParser.OpAddExprContext ctx) {
    threeOp(ctx);
    String assembly_code = "";

    if (ctx.op.getText().equals("+")) {
      assembly_code += "add $v0, $t0, $t1\n";
      System.out.println("add $v0, $t0, $t1");
    } else {
      assembly_code += "sub $v0, $t0, $t1\n";
      System.out.println("sub $v0, $t0, $t1");
    }
    return assembly_code;
  }

  // end arithmetic and binary expressions
  ////////////////////////////////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////















  ////////////////////////////////////////////////////////////////////////////////////
  // assignment operator


  @Override
  public String visitOpAssgnExpr(CParser.OpAssgnExprContext ctx) {
    // currently storing into int variable
    // will be modified later for arrays
    Integer destination = table.get(ctx.left.getText());
    String assembly_code = "";

    this.visit(ctx.right);
    // $v0 contains the value of whatever was on the right
    assembly_code+= "sw $v0, " + 4*(mem++) + "($sp)\n";
    System.out.println("sw $v0, " + 4*(mem++) + "($sp)"); // push right on stack
    this.visit(ctx.left); // evaluate current value (left)

    assembly_code+= "addu $t2, $v0, $zero\n" + "lw $v0, " + 4*(--mem) + "($sp)\n";
    System.out.println("addu $t2, $v0, $zero"); // store current value in $t2
    System.out.println("lw $v0, " + 4*(--mem) + "($sp)"); // pop right from stack. Ready to evaluate
    switch(ctx.op.getText()){
      case("="):
        break; // do nothing. Store into destination at the end
      case("+="):
        assembly_code+= "add $v0, $v0, $t2\n";
        System.out.println("add $v0, $v0, $t2");
        break;
      case("-="):
        assembly_code+= "sub $v0, $v0, $t2\n";
        System.out.println("sub $v0, $v0, $t2");
        break;
      case("*="):
        assembly_code+= "mul $v0, $v0, $t2\n";
        System.out.println("mul $v0, $v0, $t2");
        break;
      case("<<="):
        assembly_code+= "sllv $v0, $v0, $t2\n";
        System.out.println("sllv $v0, $v0, $t2");
        break;
      case(">>="):
        assembly_code+= "srav $v0, $v0, $t2\n";
       System.out.println("srav $v0, $v0, $t2");
       break;
      case("&="):
        assembly_code+= "and $v0, $v0, $t2\n";
        System.out.println("and $v0, $v0, $t2");
        break;
      case("|="):
        assembly_code+= "or $v0, $v0, $t2\n";
        System.out.println("or $v0, $v0, $t2");
        break;
      case("^="):
        assembly_code+= "xor $v0, $v0, $t2\n";
        System.out.println("xor $v0, $v0, $t2");
        break;
      case("/="):
        assembly_code+= "div $v0\n" + "mflo $v0, $t2\n";
        System.out.println("div $v0");
        System.out.println("mflo $v0, $t2");
        break;
      case("%="):
        assembly_code+= "div $v0\n" + "mfhi $v0, $t2\n";        
        System.out.println("div $v0");
        System.out.println("mfhi $v0, $t2");
        break;
      default:
        throwIllegalArgument(ctx.op.getText(), "OpAssgnExpr");
    }
    assembly_code+= "sw $v0, " + destination + "($sp)\n";        
    System.out.println("sw $v0, " + destination + "($sp)");
    
    return assembly_code;
  }

  // end assignement operator
  ////////////////////////////////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////










  ////////////////////////////////////////////////////////////////////////////////////
  // Selection statement
  /* for the if statement:
    - compile the condition into register _cond_
    - insert a BEQ _cond_, zero, false_label
    - compile first statement into destReg
    - insert a J end_label (skip the false exec)
    - insert false_label
    - compile second statemnt into destReg
    - insert end_label
   */

  @Override
  public String visitIfSelecStat(CParser.IfSelecStatContext ctx) {
    String falseExecLabel = makeName("if_stat_false");
    String endLabel = makeName("if_stat_end");
    String assembly_code = "";

    this.visit(ctx.cond); // $v0 holds 0 or 1 from the condition

    assembly_code+= "beq $v0, $zero, " + falseExecLabel + "\nnop\n";
    System.out.println("beq $v0, $zero, " + falseExecLabel + "\nnop");
    this.visit(ctx.trueExec);

    assembly_code+= "j " + endLabel + "\nnop\n";
    System.out.println("j " + endLabel + "\nnop");
    assembly_code = insertLabel(falseExecLabel, assembly_code);
    if(ctx.falseExec != null){
      this.visit(ctx.falseExec);
    }else{
      assembly_code+="nop\n";
      System.out.println("nop");
    }
    assembly_code = insertLabel(endLabel, assembly_code);
    return assembly_code;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // While loop expression

  /*for the while statement:
    - insert begin_label
    - compile the condition into register _cond_
    - insert a BEQ _cond_ _zero_ end_label
    - compile statement into destReg
    - insert a J begin_label 
    - insert end_label
  */

  @Override
  public String visitWhileIterStat(CParser.WhileIterStatContext ctx){
    String beginLabel = makeName("while_stat_begin");
    String endLabel = makeName("while_stat_end");
    String assembly_code = "";

    assembly_code = insertLabel(beginLabel, assembly_code);
    this.visit(ctx.cond); // condition is now in $v0

    assembly_code+="beq $v0, $zero, " + endLabel + "\nnop+\n";
    System.out.println("beq $v0, $zero, " + endLabel + "\nnop");
    this.visit(ctx.exec); // while loop execution body

    assembly_code+="j " + beginLabel + "\nnop\n";
    System.out.println("j " + beginLabel + "\nnop");

    assembly_code = insertLabel(endLabel, assembly_code);
    return assembly_code;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // For loop expression

  /*for the for statement:
    - variable declaration
    - insert begin_label
    - compile the condition into register _cond_
    - insert a BEQ _cond_ _zero_ end_label
    - compile statement into destReg
    - insert a J begin_label 
    - insert end_label
  */

  @Override
  public String visitForIterStat(CParser.ForIterStatContext ctx){
    System.out.println("For Stat");
    if(enterFunc){
      enterFunc = false;
      this.visit(ctx.cond);
    }
    return "Done";
  }

  //The two possible for conditions. 
  public String visitDecForCond(CParser.DecForCondContext ctx){
    //this.visit(ctx.getParent());
    String stuff = this.visit(ctx.init);
    //System.out.println(stuff);
    
    return "Done";
  }

  public String visitExpForCond(CParser.ExpForCondContext ctx){
    System.out.println("ExpForCond");
    return "Done";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // Relational expression
  @Override
  public String visitOpRelExpr(CParser.OpRelExprContext ctx){
    threeOp(ctx);
    String assembly_code = "";

    assembly_code += "xor $t2, $t0, $t1\n"; 
    System.out.println("xor $t2, $t0, $t1");

    assembly_code += "sltiu $t2, $t2, 1\n"; 
    System.out.println("sltiu $t2, $t2, 1");  // $t2 = (right == left)
    switch(ctx.op.getText()) {
      case ">":
        assembly_code += "slt $v0, $t1, $t0\n"; 
        System.out.println("slt $v0, $t1, $t0"); // right < left
        break;
      case "<":
        assembly_code += "slt $v0, $t0, $t1\n"; 
        System.out.println("slt $v0, $t0, $t1"); // left < right
        break;
      case "<=":
        assembly_code += "slt $v0, $t1, $t0\n" + "or $v0, $v0, $t2\n"; 
        System.out.println("slt $v0, $t1, $t0"); // right < left
        System.out.println("or $v0, $v0, $t2"); // right <= left
        break;
      case ">=": 
        assembly_code += "slt $v0, $t0, $t1\n" + "or $v0, $v0, $t2\n"; 
        System.out.println("slt $v0, $t0, $t1"); // left < right
        System.out.println("or $v0, $v0, $t2"); // left <= right
        break;
      default:
        throwIllegalArgument(ctx.op.getText(), "OpEqualExpr");
    }
    return assembly_code;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  //Equality expression
  @Override
  public String visitOpEqualExpr(CParser.OpEqualExprContext ctx){
    threeOp(ctx);
    String assembly_code = "";

    assembly_code += "xor $v0, $t0, $t1\n"; 
    System.out.println("xor $v0, $t0, $t1"); // A^B = 0 only if A=B, non-zero otherwise

    switch(ctx.op.getText()){
      case "==":
        assembly_code += "sltiu $v0, $v0, 1\n";  
        System.out.println("sltiu $v0, $v0, 1");
        break;
      case "!=":
        assembly_code += "sltu $v0, $v0, $zero\n";  
        System.out.println("sltu $v0, $v0, $zero");
        break;
      default:
        throwIllegalArgument(ctx.op.getText(), "OpEqualExpr");
    }

    return assembly_code;
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
    boolean debug = false;
    if(args.length > 0){
      if(args[0].equals("-debug"))debug = true;
    }

    // temporary function stack manipulation for now (large allocation)
    // will be later fixed when entering function context
    System.out.println(
      "addiu $sp, $sp, -192\n"+
      "sw $fp, 4($sp)\n"+
      "or $fp, $sp, $sp\n"
    );

    CCompiler compiler = new CCompiler(debug);
    compiler.visit(tree);

    System.out.println(
      "or $sp, $fp, $fp\n"+
      "lw $fp, 4($sp)\n"+
      "addiu $sp, $sp, 192\n"+
      "jr $31\n"+
      "nop\n"
    );
    
    // System.out.println("\n# END OF PROGRAM\njr $zero");
  }

}