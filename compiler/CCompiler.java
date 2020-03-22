package compiler;

import compiler.antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList; 
import java.util.Stack;
import java.util.ArrayList;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import java.lang.Float.*;
import java.sql.Types;
import java.lang.Double.*;
import java.util.Arrays;


enum types {INT, CHAR, DOUBLE, FLOAT, UNSIGNED};

abstract class STO {

  // all elements have the following
  protected int size;
  protected int offset;
  protected String ID;
  protected boolean isGlobal;
  protected boolean isPointer;
  protected types type;

  // arrays extra (used by functions as well)
  public ArrayList<Integer> dimensions;

  // pointers extra
  public int pointerDepth;

  // initializers for factory
  protected void initSTO(){
    size = 0;
    offset = 0;
    ID = "";
    isGlobal = false;
    isPointer = false;
    pointerDepth = 0;
    type = types.INT;
    dimensions = null;
  }

  protected void initSTO(int s, int o, String i, boolean g, boolean p, types t, ArrayList<Integer> v){
    size = s;
    offset = o;
    ID = i;
    isGlobal = g;
    isPointer = p;
    pointerDepth = 1;
    type = t;
    dimensions = v;
  }

  // common functions
  public int getSize(){return this.size;}
  public void setSize(int s){this.size = s;}
  public int getOffset(){return this.offset;}
  public void setOffset(int o){this.offset = o;}
  public String getID(){return this.ID;}
  public void setID(String s){this.ID = s;}
  public boolean isGlobal(){return this.isGlobal;}
  public void setGlobal(boolean g){this.isGlobal = g;}
  public types getType(){return this.type;}
  public void setType(types t){this.type = t;}

  // array functions
  public ArrayList<Integer> getDimensions(){return this.dimensions;}
  public int getDimensions(int i){return this.dimensions.get(i);}
  public void addDimension(int i){this.dimensions.add(i);}
  public void setDimensions(ArrayList<Integer> d){this.dimensions = d;}
  public void updateArraySize(){
    size = typeSize(type)*dimensions.get(0);
    for(int i=1; i<dimensions.size(); i++){
      size *= typeSize(type)*dimensions.get(i);
    }
  }
  public int getElementsCount(){
    int count = dimensions.get(0);
    for(int i=1; i<dimensions.size(); i++){
      count *= dimensions.get(i);
    }
    return count;
  }

  // function functions
  public ArrayList<Integer> getParameters(){return this.dimensions;}
  public int getParameter(int i){return this.dimensions.get(i);}
  public void addParameter(int i){this.dimensions.add(i);}
  public void setParamCount(int s){this.size = s;}
  public int getParamCount(){return this.size;}
  public void setParameters(ArrayList<Integer> params){this.dimensions = params;}

  // pointers functions
  public void setDepth(int d){this.pointerDepth = d;}
  public int getDepth(){return this.pointerDepth;}

  // parse enum to int size
  protected int typeSize(types type){
    switch(type){
      case INT:
        return 4;
      case CHAR:
        return 1;
      case DOUBLE:
        return 8;
      case FLOAT:
        return 4;
      case UNSIGNED:
        return 4;
      default:
        return -1;
    }
  }

  // intialization and declaration functions
  public void initialize(double[] values){
    throw new IllegalStateException("Operation init(int[]) not implemented for current object " + getID());
  }

  public void initialize(String value){
    throw new IllegalStateException("Operation init(String) not implemented for current object " + getID());
  }

}

class Variable extends STO{
  Variable(){initSTO();}
  Variable(int size, int offset, String ID, boolean isGlobal, types type){initSTO(size, offset, ID, isGlobal, false, type, null);}
  @Override public void initialize(String value){
    if(!isGlobal()){
      int offset = getOffset();
      String reg = "$v0";
      if(value == "0")
        reg = "$zero";
      switch(getType()){
        case INT:{
            System.out.println("sw " + reg + ", " + -4*offset + "($sp)");
            break;
        }
        case CHAR:{
            System.out.println("sb " + reg + ", " + -4*offset + "($sp)");
            break;
        }
        default:
          break;
      }
    }else{
      if(value.equals("true")) value = "1";
      if(value.equals("false")) value = "0";
      Integer intValue = (int) Math.round(Double.parseDouble(value));
      switch(getType()){
        case INT:{
            System.out.println(getID() + ":\n\t.word " + intValue);
            break;
        }
        case CHAR:{
            System.out.println(getID() + ":\n\t.byte " + intValue);
            break;
        }
        default:
          break;
      }
    }
  }
}

class Array extends STO{
  Array(){initSTO();}
  Array(int size, int offset, String ID, boolean isGlobal, types type, ArrayList<Integer> dimensions){initSTO(size, offset, ID, isGlobal, false, type, dimensions);}
  @Override public void initialize(double[] values){
    if(isGlobal()){
      System.out.println(getID()+":");
      for(double val: values){
        switch(getType()){
          case INT:{
              System.out.println("\t.word " + (int)val);
              break;
          }
          case CHAR:{
              System.out.println("\t.byte " + ((((int)val)<<24) >> 24));
              break;
          }
          default:
            break;
        }
        
      }
    }else{
      for(int i=0; i<values.length; i++){
        switch(getType()){
          case INT:{
            System.out.println("li $v0, " + (int)values[i]);
            System.out.println("sw $v0, " + -4*(offset+i) + "($sp)");
            break;
        }
        case CHAR:{
            System.out.println("li $v0, " + ((((int)values[i])<<24) >> 24));
            System.out.println("sb $v0, " + -4*(offset+i) + "($sp)");
            break;
        }
          default:
            break;
        } 
      }
    }
  }
}

class Function extends STO{
  Function(){initSTO();}
  Function(int paramCount, String ID, types type, ArrayList<Integer> params){initSTO(paramCount, -1, ID, true, false, type, params);}
  
}

class Pointer extends STO{
  Pointer(){initSTO();}
  Pointer(int size, int offset, String ID, boolean isGlobal, types type, int depth){initSTO(size, offset, ID, isGlobal, true, type, null); setDepth(depth);}
  @Override public void initialize(String value){
    if(!isGlobal()){
      int offset = getOffset();
      String reg = "$v0";
      if(value == "0")
        reg = "$zero";
      switch(getType()){
        case INT:{
            System.out.println("sw " + reg + ", " + -4*offset + "($sp)");
            break;
        }
        case CHAR:{
            System.out.println("sb " + reg + ", " + -4*offset + "($sp)");
            break;
        }
        default:
          break;
      }
    }else{
      if(value.equals("true")) value = "1";
      if(value.equals("false")) value = "0";
      Integer intValue = (int) Math.round(Double.parseDouble(value));
      switch(getType()){
        case INT:{
            System.out.println(getID() + ":\n\t.word " + intValue);
            break;
        }
        case CHAR:{
            System.out.println(getID() + ":\n\t.byte " + intValue);
            break;
        }
        default:
          break;
      }
    }
  }
  
}

public class CCompiler extends CBaseVisitor<String> {

  int mem; 
  int label_id; // for unique identification of each label (branch)
  boolean debug = false;
  boolean enter_parent = false;
  int param_count = 0;  // count parameters for function definition. No nested cases
  int dec_size; 

  int enum_state; //Keeps latest value of enum

  Stack<String> current_break_context = new Stack<String>();   // Break: switch / while / for    (break_context)
  Stack<String> current_continue_context = new Stack<String>();   // Continue: while / for          (continue_context)
  Stack<String> current_return_context = new Stack<String>();   // Return: functions              (return_context)
  Stack<Integer> current_arguments_context = new Stack<Integer>(); // Informs us of memory location of switch. Used for nested switches
  Stack<Integer> current_mem_context = new Stack<Integer>();   // Mem context (retrieve stack offset context)

  Stack<Map<String, STO>> symbolTable = new Stack<Map<String, STO>>();

  // interpreter for arithmetic expressions
  ScriptEngineManager mgr;
  ScriptEngine interpreter;

  // STO context passing
  STO current_function_object = null;
  STO current_variable_object = null;
  STO current_array_object = null;
  STO current_enum_object = null;

  types current_type = null;
  int pointer_depth = 0;

  // array initialization
  int index_position = -1;
  int[] indexes = null;
  double[] values = null;

  CCompiler(boolean d) {
    mem = 0;
    label_id = 0;
    debug = d;
    enter_parent = true;
    dec_size = 0;
    enum_state = 0;

    mgr = new ScriptEngineManager();
    interpreter = mgr.getEngineByName("JavaScript");

    extendSymbolTable(); // init entry for globals
    
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
    ------------

    - Any scratch register is undefined when leaving a context function and therefore can be used freely in another context
    - Return registers should always contain the correct / expected return value of the context


    Symbol Table:
    -------------

    // THIS IS A SCRATCH

    Current method:
    
    a[2][3][1] = {{{}, {}, {}}, {}...}
    b[1][2][3]

    loc(a[0][1][2]) != loc(b[0][1][2])

    a[2]

    [{a:24}, {24:2}]

    a[1] = 3

    [{a:Object(a)}]
    a:
    - Type: array
    - Global: true / false
    - Vector(size): Int: {1}, a[2][3]: {2,3}, {1,1}
    - Stack offset: 24

    a:
    - Size: {2,3,1} Total = 6

    enum:
    - ID: days
    - data = {M=0, T=3, W=4}


    enum days = {M, T=3, W}

    enum days x = T

    ori $v0, 3
    sw $v0




    enum{
      getEnumValue(data_id) -> Int
      data: Map<String, Integer>;
      ID: String;
    }

    setIDSymbolTable("days", e);
    getIDSymbolTable("days"); -> _returns an enum object_ e

    
    value of x = getIDSymbolTable("days").getEnumValue("Monday");


    // END OF SCRATCH


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

    // Mem is stack offset

    this.visit(ctx.getChild(0));
    System.out.println("sw $v0, " + -4*(mem++) + "($sp)");

    this.visit(ctx.getChild(2));
    System.out.println("sw $v0, " + -4*(mem++) + "($sp)");

    System.out.println("lw $t1, " + -4*(--mem) + "($sp)");  // get right from stack
    System.out.println("lw $t0, " + -4*(--mem) + "($sp)");  // get left from stack
    return "";
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
    return this.visit(ctx.item);
  }

  @Override
  public String visitDecBlockItem(CParser.DecBlockItemContext ctx) {
    if(debug){
      int a = ctx.item.start.getStartIndex();
      int b = ctx.item.stop.getStopIndex();
      Interval interval = new Interval(a, b);
      String line = ctx.item.start.getInputStream().getText(interval);
      line = line.replaceAll("\n", "\n# ");
      System.out.println("\n# " + line);
    }
    return this.visit(ctx.item);
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
  public void insertLabel(String label){
    System.out.println(label + ":");
  }

  // extend symbol table to new scope
  public void extendSymbolTable(){
    if(debug) System.out.println("\t\t\t\t# Table was " + symbolTable); 
    Map<String, STO> extension = new HashMap<String, STO>();
    if(!symbolTable.empty()) {
      Map<String, STO> current = symbolTable.peek();
      extension.putAll(current);
    }
    symbolTable.add(extension);
    if(debug) System.out.println("\t\t\t\t# Table is " + symbolTable);
    current_mem_context.add(mem);
  }

  // remove from symbol table when leaving scope
  public void removeSymbolTable(){
    if(debug) System.out.println("\t\t\t\t# Table was " + symbolTable); 
    symbolTable.pop();
    if(debug) System.out.println("\t\t\t\t# Table is " + symbolTable);
    mem = current_mem_context.pop();
  }

  // get ID object from symbol table
  public STO getIDSymbolTable(String id){
    STO obj = symbolTable.peek().get(id);
    if(debug) System.out.println("\t\t\t\t#Returning " + obj + " for ID " + id);
    return obj;
  }

  // set ID object in symbol table
  public void setIDSymbolTable(String id, STO obj){
    symbolTable.peek().put(id, obj);
  }

  // check if global scope
  public boolean isGlobalScope(){
   return symbolTable.size() == 1;
  }

  // interpret constant expression
  public String interpret(String expression){
    if(expression.charAt(0) == '\''){
      int v = (int) expression.charAt(1);
      return "" + v;
    }
    try{
      return String.valueOf(interpreter.eval(expression));
    }catch(Exception e){
      System.out.println("#INTERPRETER EXCEPTION: " + e + " for input " + expression);
      return null;
    }
  }

  // parse type to enum
  public types parseType(String type){
    pointer_depth = type.split("\\*",-1).length-1;
    switch(type.substring(pointer_depth, type.length())){
      case "int":
        return types.INT;
      case "char":
        return types.CHAR;
      case "double":
        return types.DOUBLE;
      case "float":
        return types.FLOAT;
      case "unsigned":
        return types.UNSIGNED;
      default:
        return null;
    }
  }

  // parse type to int size
  public int typeSize(types type){
    switch(type){
      case INT:
        return 4;
      case CHAR:
        return 1;
      case DOUBLE:
        return 8;
      case FLOAT:
        return 4;
      case UNSIGNED:
        return 4;
      default:
        throwIllegalArgument(type.toString(), "typeSize conversion");
        return -1;
    }
  }

  // get floats (32 bits) / double (64 bits) binary representation
  public int floatBits(float f){
    return Float.floatToIntBits(f);
  }

  public int[] doubleBits(double d){
    int arr[] = new int[2];
    long v = Double.doubleToLongBits(d);
    arr[0] = (int) (v >> 32);
    arr[1] = (int) (v - ((v >> 32) << 32));
    return arr;
  }

  // array count update
  public void updateArrayCount(){
    if(index_position < indexes.length && index_position > -1){
      indexes[index_position] += 1;
      for(int i=index_position+1; i<indexes.length; i++){
        indexes[i] = 0;
      }
    }
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // Char helpers
  //Takes char, determines if escape sequence 
  public boolean isEscapeSequence(String str){
    if(str.charAt(0) == '\\'){ //if there's a backlash, check for escape
      int[] x = escapeSequenceValue(str);
      if(x[0]!=-1){
        return true;
      }
    }
    return false;
  }

  //returns array
  public ArrayList<Integer> interpretString(String str){

    ArrayList<Integer> charValues = new ArrayList<Integer>();

    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == '\\'){ //if there's a backlash, check for escape
        String ss = str.substring(i, str.length());
        int[] x = escapeSequenceValue(ss);

        if(x[0]!=-1){
          charValues.add(x[0]);
          i+=x[1];
        }
        else{ //if it's just a backslash...
          int ascii_val = (int) str.charAt(i);
          charValues.add(ascii_val);
        }
      } 
      else{
        int ascii_val = (int) str.charAt(i);
        charValues.add(ascii_val);
      }
    }


    return charValues;
  }

  //takes escape sequence, i.e. /x112 , returns corresponding int. 
  //-1 if no corresponding value.
  public int[] escapeSequenceValue(String str){
    int arr[] = new int[2]; //int[0] = character value, int[1] = number of characters used
    arr[1] = 1; //default only one character used

    str = str.substring(1, str.length());
    char firstc = str.charAt(0);

    switch(firstc){
      case 'a': {
        arr[0] = 7;
        return arr;
      }
      case 'b':{
        arr[0] = 8;
        return arr;
      }
      case 'e':{
        arr[0] = 27;
        return arr;
      }
      case 'f':{
        arr[0] = 12;
        return arr;
      }
      case 'n':{
        arr[0] = 10;
        return arr;
      }
      case 'r':{
        arr[0] = 13;
        return arr;
      }
      case 't':{
        arr[0] = 9;
        return arr;
      }
      case 'v':{
        arr[0] = 11;
        return arr;
      }
      case '?':{
        arr[0] = 63;
        return arr;
      }
      case '\'':{
        arr[0] = 39;
        return arr;
      }
      default:
    }
    if(str.equals("\"")) {
      arr[0] = 34;
      return arr;
    }
    else if(str.equals("\\")){
      arr[0] = 92;
      return arr;
    } 
    // else if(str.charAt(0)=='u'){
    //   //Take 4 hex digits
    //   String strConst = intConst_val.substring(0, strConst.length() - 1);
    //   if(strConst.length() > 4){
    //     return -1;
    //   }
    //   try {
    //     int n = (int) Long.parseLong(strConst, 16);
    //     return n;
    //   }
    //   catch (NumberFormatException e)
    //   {
    //     return -1;
    //   }
    // }
    // else if(str.charAt(0)=='U'){
    //   String strConst = intConst_val.substring(0, strConst.length() - 1);
    //   if(strConst.length() > 6){
    //     return -1;
    //   }
    //   try {
    //     int n = (int) Long.parseLong(strConst, 16);
    //     return n;
    //   }
    //   catch (NumberFormatException e)
    //   {
    //     return -1;
    //   }
    // }
    else if(str.charAt(0)=='x'){ //hex
      arr[1] = str.length();
      String hexConst = str.substring(1, str.length());
      try {
        arr[0] = Integer.parseInt(hexConst,16);
        return arr;
      }
      catch (NumberFormatException e)
      {
        arr[0] = -1;
        return arr;
      }
    }
    else{//check if octal
      String octConst = str;
      if(str.length()>3){
        octConst = str.substring(0, 3);
      }

      try {
        arr[0] = Integer.parseInt(octConst,8);
        arr[1] = 3;
        return arr;
      }
      catch (NumberFormatException e)
      {
        arr[0] = -1;
        return arr;
      }
    }
  }
  
  // END OF HELPERS AND COMMON FUNCTIONS
  ////////////////////////////////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////




  ////////////////////////////////////////////////////////////////////////////////////
  // functions contexts

  ////////////////////////////////////////////////////////////////////////////////////
  // function definition

  /*

  Figure 1
  --------

  80...(HIGH)
  .----------.
  |    ra    |
  .----------.
  | fp (old) |
  .----------.
  |     3    |  <- $fp and $sp
  .----------.
  |     6    |  
  .----------.
  |          | 
  .----------.
  |          |
  .----------.
  20...(LOW)

  Note that in our implementation, we relatively offset to $sp. Therefore $sp is always at $fp unless preparing arguments

  Figure 2
  --------

  Once we have a function call

  80...(HIGH)
  .----------.
  |    ra    |
  .----------.
  | fp (old) |
  .----------.
  |     3    |  <- $fp
  .----------.
  |     6    |  
  .----------.
  |    ...   | 
  .----------.
  |     D    |
  .----------.
  |     C    |
  .----------.
  |     B    |
  .----------.
  |     A    | <- $sp (ready for next function to access and store its arguments)
  .----------.
  
  20...(LOW)

  A-D are resevered for the callee subroutine to store on the caller frame $a0-$a3

  */

  @Override
  public String visitFunctionDefinition(CParser.FunctionDefinitionContext ctx){
    mem = 0;
    String functionName = this.visit(ctx.func_dec);
    current_function_object = new Function(0, functionName, types.INT, new ArrayList<Integer>());
    setIDSymbolTable(functionName, current_function_object);
    extendSymbolTable();
    this.visit(ctx.func_dec);
    current_return_context.add("_return_" + functionName);
    System.out.println("# " + functionName + ": function full");
    insertLabel(functionName);
    System.out.println("\t.set noreorder\n\t.text\n\t.align 2\n\t.globl " + functionName);
    if(!functionName.equals("main")){
      System.out.println("# store function arguments\nsw $a0, 0($sp)\nsw $a1, 4($sp)\nsw $a2, 8($sp)\nsw $a3, 12($sp)\n"); // store arguments on main stack
      System.out.println("move $t0, $sp"); // remember where the stack pointer was
    }
    System.out.println("# " + functionName + ": function entry");
    // figure 1: get function header ready
    System.out.println("addiu $sp, $sp, -12\nsw $fp, 4($sp)\nsw $ra, 8($sp)\nmove $fp, $sp\n");
    // now load all input parameters on the function stack
    mem = 0;
    // current_function_object.setParamCount(param_count);
    setIDSymbolTable(functionName, current_function_object);
    for(int i=0; i<param_count; i++){
      System.out.println("lw $t1, " + 4*i + "($t0)");
      System.out.println("sw $t1, " + -4*(mem++) + "($sp)");
    }
    System.out.println("# " + functionName + ": function body");
    this.visit(ctx.comp_stat);
    insertLabel("# " + functionName + ": function return\n_return_" + functionName);
    // exit function: setback $fp and $sp as before. Get correct return address for subroutine
    System.out.println("move $sp, $fp\nlw $ra, 8($fp)\nlw $fp, 4($fp)\naddiu $sp, $sp, 12\njr $ra\nnop");
    current_return_context.pop();
    removeSymbolTable(); // using remove means we did great xD test with remove later, should work
    setIDSymbolTable(functionName, current_function_object);
    current_function_object = null;
    return "";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // The ID of any direct declaration, i.e. int a = 1; or int a;
  // LHS of direct declaration retrieved, returns ID
  @Override
  public String visitIdDirDec(CParser.IdDirDecContext ctx){
    String ID = ctx.id.getText();
    if((current_function_object == null) == isGlobalScope()){
      STO varObj;
      if(pointer_depth == 0)
        varObj = new Variable(1, mem++, ID, isGlobalScope(), current_type);
      else 
        varObj = new Pointer(1, mem++, ID, isGlobalScope(), current_type, pointer_depth);
      current_variable_object = varObj;
      setIDSymbolTable(ID, varObj);
    }else{
      mem++;
    }
    return ID;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // function params context ( TYPE ID (PARAM_LIST) )
  @Override
  public String visitParamlDirDec(CParser.ParamlDirDecContext ctx){
    String functionName = this.visit(ctx.dec);
    param_count = 0;
    current_function_object = new Function(param_count, functionName, types.INT, new ArrayList<Integer>());
    mem = 0;
    this.visit(ctx.paramL);
    current_function_object.setParamCount(param_count);
    setIDSymbolTable(functionName, current_function_object);
    return functionName;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // function identifiers list ( TYPE ID (IDL?) or TYPE ID())
  @Override
  public String visitIdlDirDec(CParser.IdlDirDecContext ctx){
    String functionName = this.visit(ctx.dec);
    param_count = 0;
    current_function_object = new Function(param_count, functionName, types.INT, new ArrayList<Integer>());
    mem = 0;
    if(ctx.idL != null) this.visit(ctx.idL);
    current_function_object.setParamCount(param_count);
    setIDSymbolTable(functionName, current_function_object);
    return functionName;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // function invocation with n parameters (integers for now)
  // function returns in $v0. If type is double or float, use the $f registers discard $v0
  // we CANNOT get from symbol table because what if we have same function name, different param count?
  // count the parameters IN the call and then call the appropriate function
  @Override
  public String visitFuncInvocPostExpr(CParser.FuncInvocPostExprContext ctx){
    String functionName = this.visit(ctx.expr); // get function ID. From symbol table with type return later
    int argsCount = getIDSymbolTable(functionName).getParamCount(); // prepare to move the stack pointer accordingly
    mem += Math.max(4, argsCount); // allocate at least 4 locations as subroutine is allowed to write over the 4 arguments
    // current_arguments_context.add(argsCount-1); // save the count state for parameters (for nested cases like f(g(1), h(2, 3)) where another function gets ready for parameters). -1 because index starts at 0
    current_arguments_context.add(0); // start at offset zero in the argument context
    System.out.println("addiu $sp, $sp, " + -4*(mem)); // secure memory locations for arguments. CURRENTLY INTEGERS. LATER USE THE TABLE
    if(ctx.args != null) this.visit(ctx.args); // get parameters
    for(int i=0; i<4 && i<argsCount; i++){  // store parameters in $a0-$a3
      System.out.println("lw $a"+ i + ", " + 4*i + "($sp)"); // CURRENTLY INTEGERS. LATER USE THE TABLE
    }
    System.out.println("jal " + functionName + "\nnop"); // jump and link
    System.out.println("addiu $sp, $sp, " + 4*(mem)); // restore stack
    current_arguments_context.pop();
    mem -= Math.max(4, argsCount);
    return "";
  }

  // end of function contexts
  ////////////////////////////////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////


  ////////////////////////////////////////////////////////////////////////////////////
  // parameters, initalizatiors, arguments

  ////////////////////////////////////////////////////////////////////////////////////
  // single parameter declaration in function declaration
  // should later add to param_count based on type for stack resizing
  @Override
  public String visitDecParamDec(CParser.DecParamDecContext ctx){
    param_count += 1;
    current_type = parseType(this.visit(ctx.spec));
    this.visit(ctx.dec);
    current_function_object.addParameter(typeSize(current_type));
    return "";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // function invocation arguments
  @Override
  public String visitSingleArgExprList(CParser.SingleArgExprListContext ctx) { 
    Integer currentArgumentCount = current_arguments_context.pop();
    this.visit(ctx.expr); // value is in $v0. Only bottom part of stack is being used
    System.out.println("sw $v0, " + 4*currentArgumentCount + "($sp)");
    current_arguments_context.add(currentArgumentCount+1);  // argument currently treated as integer with size 1 not 4. Later refer to typeSize table
    return "";
  }

  @Override
  public String visitMultArgExprList(CParser.MultArgExprListContext ctx) { 
    Integer currentArgumentCount = current_arguments_context.pop();
    this.visit(ctx.expr); // value is in $v0. Only bottom part of stack is being used
    System.out.println("sw $v0, " + 4*currentArgumentCount + "($sp)");
    current_arguments_context.add(currentArgumentCount+1);
    this.visit(ctx.args);
    return "";
  }









  ////////////////////////////////////////////////////////////////////////////////////
  // VARIABLES MANIPULATIONS

  ////////////////////////////////////////////////////////////////////////////////////
  // Parentheses expression
  @Override
  public String visitParExprPrimaryExpr(CParser.ParExprPrimaryExprContext ctx) {
    return this.visit(ctx.expr);
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // integer, floating point, and character constant node. Returns value of const as a string
  @Override
  public String visitIntConstPrimaryExpr(CParser.IntConstPrimaryExprContext ctx) {
    String intConst_val = ctx.val.getText();

    if(!isGlobalScope()){
      //If character literal (starts and ends with ')
      if((intConst_val.charAt(0) == '\'') & (intConst_val.charAt(intConst_val.length()-1) == '\'')){
        intConst_val = intConst_val.substring(1, intConst_val.length() - 1); //cutting out the ' '

        if(isEscapeSequence(intConst_val)){
          int[] escape_val = escapeSequenceValue(intConst_val);
          intConst_val =  Integer.toString(escape_val[0]);
          System.out.println("li $v0, " + intConst_val);
        } 
        else{
          int ascii_val = (int) intConst_val.charAt(0);
          intConst_val =  Integer.toString(ascii_val);
          System.out.println("li $v0, " + intConst_val);
        }
      } 
      else{ //if int const
        System.out.println("li $v0, " + intConst_val);
      }
    }
    return intConst_val;
  }


  // integer constant node. Returns value
  // @Override
  // public String visitStrLitPrimaryExpr(CParser.StrLitPrimaryExprContext ctx) {
  //   String strLit_val = ctx.val.getText();
  //   return strLit_val;
  // }

  ////////////////////////////////////////////////////////////////////////////////////
  // variable identifier
  @Override

  public String visitIdPrimaryExpr(CParser.IdPrimaryExprContext ctx) {
    String id = ctx.id.getText();
    STO var = getIDSymbolTable(id);
    if(var != null){
      if(!var.isGlobal()){
        switch(var.getType()){
          case INT: {
            System.out.println("lw $v0, " + -4*getIDSymbolTable(id).getOffset() + "($fp)");
            break;
          }
          case CHAR:{
            System.out.println("lbu $v0, " + -4*getIDSymbolTable(id).getOffset() + "($fp)");
            break;
          }
          default:
            break;
        }
      }else{
        switch(var.getType()){
        case INT:{
            System.out.println("lui $v0,%hi(" + id + ")\nlw $v0,%lo(" + id + ")($v0)");
            break;
        }
        case CHAR:{
            System.out.println("lui $v0,%hi(" + id + ")\nlb $v0,%lo(" + id + ")($v0)");
            break;
        }
        default:
          break;
      }
      }
    }else{
      throwIllegalArgument(id, "IdPrimaryExpr (ID NOT FOUND)");
    }
    return id;  // return function name to caller (invoke in case of function at parent level)
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // declaring a variable with initialization
  // TYPE DEC = VAL
  @Override
  public String visitOpInitDec(CParser.OpInitDecContext ctx) {
    String id = this.visit(ctx.left); // creates the variable object

    // currently supported creations on the left: INT, ARRAY
    // current_TYPE_object contains ref to symbol table (or just use the ID)
    if(current_array_object != null){
      values = new double[current_array_object.getElementsCount()];
      indexes = new int[current_array_object.getDimensions().size()];
      this.visit(ctx.right);
      // System.out.println(Arrays.toString(values));
      getIDSymbolTable(id).initialize(values);
      mem += current_array_object.getElementsCount(); // ints for now
      indexes = null; // so other functions can use it now
    }else{
      if(!getIDSymbolTable(id).isGlobal()){
        this.visit(ctx.right);
        getIDSymbolTable(id).initialize("");
      }else
        getIDSymbolTable(id).initialize(interpret(ctx.right.getText()));
    }
    current_array_object = null; // we are done initializing the array
    return "";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // declaring a variable without initialization
  // TYPE DEC;
  // default value to zero
  @Override
  public String visitTermInitDec(CParser.TermInitDecContext ctx){
    String id = this.visit(ctx.dec); // creates the variable object
    // currently supported creations on the left: INT, ARRAY
    // current_TYPE_object contains ref to symbol table (or just use the ID)
    if(current_array_object != null){
      values = new double[current_array_object.getElementsCount()];
      getIDSymbolTable(id).initialize(values);
      mem += current_array_object.getElementsCount(); // ints for now
    }else if(current_function_object == null){
      getIDSymbolTable(id).initialize("0");
    }
    current_array_object = null; // we are done initializing the array
    current_function_object = isGlobalScope() ? null : current_function_object; // we are done declaring the function
    return "";
  }
  
  ////////////////////////////////////////////////////////////////////////////////////
  // Initializing a variable in an initializer list
  // I.e. {4, 3, 2} - 4, 3, 2 each will have single call to AssgnInit
  // https://stackoverflow.com/questions/7367770/how-to-flatten-or-index-3d-array-in-1d-array
  @Override
  public String visitAssgnInit(CParser.AssgnInitContext ctx){
    if(current_array_object != null){
      int index = 0;
      for(int i=0; i<indexes.length-1; i++){
        index += indexes[i];
        index *= current_array_object.getDimensions().get(i+1);
      }
      index += indexes[indexes.length-1];

      if(current_type == types.CHAR){ //for char arrays
        String str = ctx.expr.getText();
        String sstr = str.substring(1, str.length()-1); //removing the ""s or ''

        ArrayList<Integer> charVal = new ArrayList<>(); //holds int value of char, includes escape sequences
        charVal = interpretString(sstr);

        if(str.charAt(0)=='\"'){ //if char a[6] = "hello";
        for(int x = 0; x<charVal.size(); x++){
          values[x] = charVal.get(x);
        }
          values[charVal.size()] = 0; //NULL-terminated
        }
        else{ //if char a[6] = {'h','e','l','l','o','\0'};
          values[index] = charVal.get(0);
          indexes[index_position]++;
        }
      } 
      else{
        values[index] = Integer.parseInt(interpret(ctx.expr.getText()));
        // System.out.println(Arrays.toString(indexes) + " for value " + ctx.expr.getText() + " stored at " + index);
        indexes[index_position]++;
      }

    }else{
      this.visit(ctx.expr);
    }
    return ctx.expr.getText();
  }

  @Override
  public String visitListInit(CParser.ListInitContext ctx) {
    index_position += 1;
    String ret = visitChildren(ctx);
    index_position -= 1;
    updateArrayCount();
    return ret;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // unary manipulation
  // ADD POINTERS IMPLEMENTATION HERE
  @Override
  public String visitCastUnaryExpr(CParser.CastUnaryExprContext ctx){
    String id = this.visit(ctx.right);
    String unaryOp = this.visit(ctx.left);
    switch(unaryOp){
      case "+":
        break;
      case "-":
        System.out.println("subu $v0, $zero, $v0"); // return v0 becomes -v0
        break;
      case "~":
        System.out.println("not $v0, $v0"); // ~v0 = bitwiseNOT($v0)
        break;
      case "!":
        System.out.println("seq $v0, $v0, $zero"); // !v0 = $v0 == 0 ? 1 : 0
        break;
      case "&":
        // we want the address of x, which is the offset of variable x added to frame pointer if it's a local variable
        // otherwise use the semantic for global variables
        if(getIDSymbolTable(id).isGlobal()) System.out.println("lui $v0, %hi(" + id +")\naddiu $v0, $v0, %lo(" + id + ")");
        else System.out.println("addiu $v0, $fp, " + -4*getIDSymbolTable(id).getOffset());
        break;
      case "*":
        // store destination in $v1
        System.out.println("addu $v1, $v0, $zero");
        switch(getIDSymbolTable(id).getType()){
          case INT:
            System.out.println("lw $v0, 0($v0)");
            break;
          case CHAR:
            System.out.println("lb $v0, 0($v0)");
            break;
        }
        return "*";
      default:
        throwIllegalArgument(unaryOp, "CastUnaryExpr");
    }
    return id;
  }

  @Override
  public String visitUnaryOperator(CParser.UnaryOperatorContext ctx) { 
    return ctx.op.getText(); 
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // Getting variable type
  @Override public String visitInitSpecDeclaration(CParser.InitSpecDeclarationContext ctx) { 
    current_type = parseType(this.visit(ctx.spec));
    String id = this.visit(ctx.initList);
    return id;
  }

  @Override public String visitBaseTypeSpec(CParser.BaseTypeSpecContext ctx) { 
    return ctx.type.getText();
  }

  @Override public String visitTypePointerSpec(CParser.TypePointerSpecContext ctx) { 
    return "*" + this.visit(ctx.type);
  }

  // end variable manipulation
  ////////////////////////////////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////








  ////////////////////////////////////////////////////////////////////////////////////
  // jump statements

  ////////////////////////////////////////////////////////////////////////////////////
  // break statement
  @Override
  public String visitBreakJumpStat(CParser.BreakJumpStatContext ctx) {
    System.out.println("j " + current_break_context.peek() + "\nnop");
    return "";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // continue statement
  @Override
  public String visitContinueJumpStat(CParser.ContinueJumpStatContext ctx) {
    System.out.println("j " + current_continue_context.peek() + "\nnop");
    return "";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // return statement
  @Override
  public String visitReturnJumpStat(CParser.ReturnJumpStatContext ctx){
    if(ctx.expr != null) this.visit(ctx.expr);
    System.out.println("j " + current_return_context.peek() + "\nnop");
    return "";
  }

  // end jump statements
  ////////////////////////////////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////









  ////////////////////////////////////////////////////////////////////////////////////
  // ARITHMETIC AND BINARY EXPRESSIONS

  ////////////////////////////////////////////////////////////////////////////////////
  // logical OR
  @Override
  public String visitOpLogOrExpr(CParser.OpLogOrExprContext ctx){
    String successEnd = makeName("logical_or_success");
    String failEnd = makeName("logical_or_fail");

    this.visit(ctx.left);
    System.out.println("bne $v0, $zero, " + successEnd + "\nnop"); // if left is zero, return false

    this.visit(ctx.right);
    System.out.println("bne $v0, $zero, " + successEnd + "\nnop"); // if right is zero, return false

    System.out.println("addu $v0, $zero, $zero"); // both weren't zero, return true
    System.out.println("j " + failEnd + "\nnop");
    insertLabel(successEnd);
    System.out.println("addiu $v0, $zero, 1");
    insertLabel(failEnd);
    return "";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // logical AND
  @Override
  public String visitOpLogAndExpr(CParser.OpLogAndExprContext ctx){
    String successEnd = makeName("logical_and_success");
    String failEnd = makeName("logical_and_fail");

    this.visit(ctx.left);
    System.out.println("beq $v0, $zero, " + failEnd + "\nnop"); // if left is zero, return false

    this.visit(ctx.right);
    System.out.println("beq $v0, $zero, " + failEnd + "\nnop"); // if right is zero, return false

    System.out.println("addiu $v0, $zero, 1"); // both weren't zero, return true
    System.out.println("j " + successEnd + "\nnop");
    insertLabel(failEnd);
    System.out.println("addu $v0, $zero, $zero");
    insertLabel(successEnd);
    return "";
  }
  
  ////////////////////////////////////////////////////////////////////////////////////
  // inclusive OR
  @Override
  public String visitOpIncOrExpr(CParser.OpIncOrExprContext ctx){
    threeOp(ctx);
    System.out.println("or $v0, $t0, $t1");
    return "";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // exclusive OR
  @Override
  public String visitOpExcOrExpr(CParser.OpExcOrExprContext ctx){
    threeOp(ctx);
    System.out.println("xor $v0, $t0, $t1");
    return "";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // AND
  @Override
  public String visitOpAndExpr(CParser.OpAndExprContext ctx){
    threeOp(ctx);
    System.out.println("and $v0, $t0, $t1");
    return "";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // shift operations (<< and >>)
  @Override
  public String visitOpShiftExpr(CParser.OpShiftExprContext ctx){
    threeOp(ctx);
    switch(ctx.op.getText()){
      case("<<"):
        System.out.println("sllv $v0, $t0, $t1");
        break;
      case(">>"):
        System.out.println("srav $v0, $t0, $t1");
        break;
      default:
        throwIllegalArgument(ctx.op.getText(), "OpShiftExpr");
    }
    return "";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // MUL, DIV, MOD
  @Override
  public String visitOpMultExpr(CParser.OpMultExprContext ctx){
    threeOp(ctx);
    switch(ctx.op.getText()){
      case("*"):
        System.out.println("mul $v0, $t0, $t1");
        break;
      case("/"):
        System.out.println("div $t0, $t1"); // left / right
        System.out.println("mflo $v0");
        break;
      case("%"):
        System.out.println("div $t0, $t1");
        System.out.println("mfhi $v0");
        break;
      default:
        throwIllegalArgument(ctx.op.getText(), "OpMultExpr");
    }
    return "";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // ADD, SUB
  @Override
  public String visitOpAddExpr(CParser.OpAddExprContext ctx) {
    threeOp(ctx);
    if (ctx.op.getText().equals("+")) {
      System.out.println("add $v0, $t0, $t1");
    } else {
      System.out.println("sub $v0, $t0, $t1");
    }
    return "";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // Increments
  @Override public String visitIncrPostExpr(CParser.IncrPostExprContext ctx) {
    String id = this.visit(ctx.expr);
    Integer offset = getIDSymbolTable(id).getOffset(); // get variable location
    switch(ctx.op.getText()){
      case("++"):
        System.out.println("addi $t1, $v0, 1");
        break;
      case("--"):
        System.out.println("addi $t1, $v0, -1");
        break;
      default:
        throwIllegalArgument(ctx.op.getText(), "IncrPostExpr");
    }
    
    System.out.println("sw $t1, " + -4*offset + "($fp)"); // replace 4 by variable.getSize() later
    return id; 
  }

  @Override
  public String visitPreIncUnaryExpr(CParser.PreIncUnaryExprContext ctx) { 
    String id = this.visit(ctx.expr);
    Integer offset = getIDSymbolTable(id).getOffset(); // get variable location
    switch(ctx.op.getText()){
      case("++"):
        System.out.println("addi $v0, $v0, 1");
        break;
      case("--"):
        System.out.println("addi $v0, $v0, -1");
        break;
      default:
        throwIllegalArgument(ctx.op.getText(), "IncrPostExpr");
    }
    
    System.out.println("sw $v0, " + -4*offset + "($fp)");
    return id; 
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
    this.visit(ctx.right);
    // $v0 contains the value of whatever was on the right
    System.out.println("sw $v0, " + -4*(mem++) + "($sp)"); // push right on stack
    indexes = null;
    String id = this.visit(ctx.left); // an array or a pointer dereference will return the destination instead in $v1
    int destination = 0;
    if(getIDSymbolTable(id) != null){
      destination = -4*getIDSymbolTable(id).getOffset();
      System.out.println("li $v1, " + destination);
      System.out.println("addu $v1, $fp, $v1");
    }
  
    
    System.out.println("addu $t2, $v0, $zero"); // store current value in $t2
    System.out.println("lw $v0, " + -4*(--mem) + "($sp)"); // pop right from stack. Ready to evaluate
    switch(ctx.op.getText()){
      case("="):
        break; // do nothing. Store into destination at the end
      case("+="):
        System.out.println("add $v0, $v0, $t2");
        break;
      case("-="):
        System.out.println("sub $v0, $t2, $v0");
        break;
      case("*="):
        System.out.println("mul $v0, $v0, $t2");
        break;
      case("<<="):
        System.out.println("sllv $v0, $v0, $t2");
        break;
      case(">>="):
       System.out.println("srav $v0, $v0, $t2");
       break;
      case("&="):
        System.out.println("and $v0, $v0, $t2");
        break;
      case("|="):
        System.out.println("or $v0, $v0, $t2");
        break;
      case("^="):
        System.out.println("xor $v0, $v0, $t2");
        break;
      case("/="):
        System.out.println("div $v0, $t2");
        System.out.println("mflo $v0");
        break;
      case("%="):
        System.out.println("div $v0, $t2");
        System.out.println("mfhi $v0");
        break;
      default:
        throwIllegalArgument(ctx.op.getText(), "OpAssgnExpr");
    }
    System.out.println("sw $v0, 0($v1)");
    
    return id;
  }

  // end assignment operator
  ////////////////////////////////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////

  
  ////////////////////////////////////////////////////////////////////////////////////
  // Comparaison based expressions


  ////////////////////////////////////////////////////////////////////////////////////
  // Relational expression
  @Override
  public String visitOpRelExpr(CParser.OpRelExprContext ctx){
    threeOp(ctx);
    //System.out.println("xor $t2, $t0, $t1");
    //System.out.println("sltiu $t2, $t2, 1");  // $t2 = (right == left)
    switch(ctx.op.getText()) {
      case ">":
        System.out.println("slt $v0, $t1, $t0"); // right < left
        break;
      case "<":
        System.out.println("slt $v0, $t0, $t1"); // left < right
        break;
      case ">=":
        System.out.println("slt $v0, $t0, $t1"); // left < right
        System.out.println("xori $v0, $v0, 1"); // !(left < right) = right <= left
        break;
      case "<=": 
        System.out.println("slt $v0, $t1, $t0"); // right < left
        System.out.println("xori $v0, $v0, 1"); // !(right<left) = right >= left
        break;
      default:
        throwIllegalArgument(ctx.op.getText(), "OpEqualExpr");
    }
    return "";
  }


  ////////////////////////////////////////////////////////////////////////////////////
  //Equality expression
  @Override
  public String visitOpEqualExpr(CParser.OpEqualExprContext ctx){
    threeOp(ctx);
    System.out.println("xor $v0, $t0, $t1"); // A^B = 0 only if A=B, non-zero otherwise
    switch(ctx.op.getText()){
      case "==":
        System.out.println("sltiu $v0, $v0, 1");
        break;
      case "!=":
        System.out.println("sltu $v0, $v0, $zero");
        break;
      default:
        throwIllegalArgument(ctx.op.getText(), "OpEqualExpr");
    }

    return "";
  }

  // end of comparison based expressions
  ////////////////////////////////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////




  ////////////////////////////////////////////////////////////////////////////////////
  // Scoped contexts


  ////////////////////////////////////////////////////////////////////////////////////
  // Compound Statement
	@Override
  public String visitCompoundStatement(CParser.CompoundStatementContext ctx) {
    String ret = "";
    if(ctx.itemL != null){
      extendSymbolTable();
      ret = this.visit(ctx.itemL);
      removeSymbolTable();
    }
    return ret;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // Block Item List (Multiple items -> append strings together in return)
  @Override
  public String visitMultBlockItemList(CParser.MultBlockItemListContext ctx) {
    return this.visit(ctx.itemL) + "\n" + this.visit(ctx.item); 
  }

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
    extendSymbolTable();
    String falseExecLabel = makeName("if_stat_false");
    String endLabel = makeName("if_stat_end");
    this.visit(ctx.cond); // $v0 holds 0 or 1 from the condition
    System.out.println("beq $v0, $zero, " + falseExecLabel + "\nnop");
    this.visit(ctx.trueExec);
    System.out.println("j " + endLabel + "\nnop");
    insertLabel(falseExecLabel);
    if(ctx.falseExec != null){
      this.visit(ctx.falseExec);
    }else{
      System.out.println("nop");
    }
    insertLabel(endLabel);
    removeSymbolTable();
    return "";
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
    extendSymbolTable();
    String beginLabel = makeName("while_stat_begin");
    String endLabel = makeName("while_stat_end");
    current_break_context.add(endLabel);
    insertLabel(beginLabel);
    this.visit(ctx.cond); // condition is now in $v0
    System.out.println("beq $v0, $zero, " + endLabel + "\nnop");
    this.visit(ctx.exec); // while loop execution body
    System.out.println("j " + beginLabel + "\nnop");
    insertLabel(endLabel);
    current_break_context.pop();
    removeSymbolTable();
    return "";
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
    extendSymbolTable();
    if(enter_parent){
      enter_parent = false;
      this.visit(ctx.cond);
    } else {
      enter_parent = true;
      this.visit(ctx.exec);
    }
    removeSymbolTable();
    return "";
  }

  //The two possible for conditions. NOTE: can edit grammar to avoid repetition
  @Override
  public String visitDecForCond(CParser.DecForCondContext ctx){ //For loop 1

    //variable init
    this.visit(ctx.init);

    //for loop
    String beginLabel = makeName("for_stat_begin");
    String endLabel = makeName("for_stat_end");
    current_break_context.add(endLabel);
    insertLabel(beginLabel);
    
    if(ctx.cond != null){
      this.visit(ctx.cond);
      System.out.println("beq $v0, $zero, " + endLabel + "\nnop"); // skip if condition was not met
    }

    // compiles body from parent
    this.visit(ctx.getParent());

    if(ctx.update != null)  this.visit(ctx.update); // increment variable (or whatever update)

    //return to top of loop
    System.out.println("j " + beginLabel + "\nnop");
    insertLabel(endLabel);
    current_break_context.pop();
    return "";
  }

  @Override
  public String visitExpForCond(CParser.ExpForCondContext ctx){ //For loop 2
    //variable init
    if(ctx.init != null) this.visit(ctx.init);

    //for loop
    String beginLabel = makeName("for_stat_begin");
    String endLabel = makeName("for_stat_end");
    current_break_context.add(endLabel);
    insertLabel(beginLabel);

    if(ctx.cond != null){
      this.visit(ctx.cond);
      System.out.println("beq $v0, $zero, " + endLabel + "\nnop"); // skip if condition was not met
    }

    // compiles body from parent
    this.visit(ctx.getParent());

    if(ctx.update != null)  this.visit(ctx.update); // increment variable (or whatever update)

    //return to top of loop
    System.out.println("j " + beginLabel + "\nnop");
    insertLabel(endLabel);
    current_break_context.pop();
    return "";
  }

   ////////////////////////////////////////////////////////////////////////////////////
  // Switch case expression

  @Override
  public String visitSwitchSelecStat(CParser.SwitchSelecStatContext ctx){ 
    extendSymbolTable();
    String conditionLabel = makeName("switch_stat_condition");
    String endLabel = makeName("switch_stat_end");
    current_break_context.add(endLabel);
    this.visit(ctx.cond); //switch value loaded into register 2 ($v0) 
    System.out.println("sw $v0, " + -4*(mem++) + "($sp)"); // save condition in stack in case of nested switches
    System.out.println("j " + conditionLabel + "\nnop"); // check where to go (since the cases are compiled before that)
    String cases = this.visit(ctx.trueExec); // now cases is a list of all labeled statement within the switch. They are compiled as well with labels
    if(debug) System.out.println("\n#####\nRecived this:\n" + cases + "\n######\n");
    System.out.println("j " + endLabel + "\nnop"); // avoid rechecking

    insertLabel(conditionLabel); // this is where the swich determines to what labeled statement it has to jump
    System.out.println("lw $v0, " + -4*(--mem) + "($sp)"); // load condition from stack
    String[] lines = cases.split(System.getProperty("line.separator")); // each line has format LABEL:CONDITION (exception default:null)
    for(String line: lines){
      if(!line.contains(":")) continue;
      String[] data = line.split(":");
      if(data[1].equals("null")) System.out.println("j " + data[0] + "\nnop");
      else {
        System.out.println("li $t1, " + data[1]);
        System.out.println("beq $v0, $t1, " + data[0] + "\nnop");
      }
    }
    insertLabel(endLabel);
    current_break_context.pop();
    removeSymbolTable();
    return "";
  }

  @Override
  public String visitCaseLabelStat(CParser.CaseLabelStatContext ctx){ 
    extendSymbolTable();
    String beginLabel = makeName("case_stat_begin");
    insertLabel(beginLabel);
    // the condition is a constant expression, interpret and return to switch, which will jump accordingly
    this.visit(ctx.exec);
    removeSymbolTable();
    return beginLabel + ":" + interpret(ctx.cond.getText());
  }

  //Default case
  @Override
  public String visitDefLabelStat(CParser.DefLabelStatContext ctx){ 
    extendSymbolTable();
    String beginLabel = makeName("default_stat_begin");
    insertLabel(beginLabel); 
    //execute default
    this.visit(ctx.exec);
    removeSymbolTable();
    return beginLabel + ":null";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // one line conditional
  @Override
  public String visitConditionalExpression(CParser.ConditionalExpressionContext ctx) { 
    String ret = this.visit(ctx.cond); // $v0 holds 0 or 1 from the condition if a conditional
    if(ctx.true_exec != null){
      extendSymbolTable();
      String falseExecLabel = makeName("if_stat_false");
      String endLabel = makeName("if_stat_end");
      System.out.println("beq $v0, $zero, " + falseExecLabel + "\nnop");
      this.visit(ctx.true_exec);
      System.out.println("j " + endLabel + "\nnop");
      insertLabel(falseExecLabel);
      this.visit(ctx.false_exec);
      System.out.println("nop");
      insertLabel(endLabel);
      removeSymbolTable();
    }
    return ret;
  }

  
  // end of scoped contexts
  ////////////////////////////////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////


  ////////////////////////////////////////////////////////////////////////////////////
  // Multidimensional objects

  ////////////////////////////////////////////////////////////////////////////////////
  // Array declarations
  
  //i.e. int a[3];  
  //returns ID, to be evalutated in OpInit

  @Override
  public String visitQArrDirDec(CParser.QArrDirDecContext ctx){ 

    String id = "";

    // recursive visit for multidimensional and avoid declaraing as variable for the ID
    if(ctx.dec.getChildCount() == 1){
      id = ctx.dec.getText();
    }else{
      id = this.visit(ctx.dec);
    }

    if(current_array_object == null){
      current_array_object = new Array(0, mem, id, isGlobalScope(), current_type, new ArrayList<Integer>());
    }

    current_array_object.addDimension(Integer.parseInt(interpret(ctx.expr.getText())));

    int array_size = Integer.parseInt(interpret(ctx.expr.getText()));

    current_array_object.updateArraySize();
    setIDSymbolTable(id, current_array_object);
    return id;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // Array access
  // all we want is to have the offset of the corresponding location returned
  // and then treat as a single object in operations
  // value is outputed into $v0 (and later into $f0 for floats / doubles)
  @Override
  public String visitArrPostExpr(CParser.ArrPostExprContext ctx) {
    String id = "";
    if(ctx.left.getChildCount() != 1){
      id = this.visit(ctx.left);
    }else{
      id = ctx.left.getText();
      indexes = new int[getIDSymbolTable(id).getDimensions().size()];
    }
    this.visit(ctx.right);
    System.out.println("sw $v0, " + -4*(mem++) + "($sp)"); // store the indexes as they can be an expression
    index_position++;
    // indexes[++index_position] = Integer.parseInt(ctx.right.getText());
    if(index_position == getIDSymbolTable(id).getDimensions().size()-1){
      // now indexes on the stack contains what element we want to access. we can calculate the offset of that element and put in $v0 / $f0 the value of the element
      System.out.println("li $t2, 0"); // prepare the flatten index and calculate from the indexes and the array size
      mem--; mem-= index_position; // set mem to beginning of sizes stack
      for(int i=0; i<getIDSymbolTable(id).getDimensions().size()-1; i++){
        System.out.println("lw $t0, " + -4*(mem++) + "($sp)");
        System.out.println("addu $t2, $t2, $t0"); // index += indexes[i];
        
        System.out.println("li $t0, " + getIDSymbolTable(id).getDimensions().get(i+1));
        System.out.println("nop\nmult $t0, $t2");
        System.out.println("mflo $t2"); //index *= getIDSymbolTable(id).getDimensions().get(i+1);
      }
      System.out.println("lw $t0, " + -4*(mem++) + "($sp)");
      System.out.println("addu $t2, $t2, $t0"); // index += indexes[indexes.length-1];
      mem--; mem -= index_position; // set memory back in place
      
      System.out.println("li $t0, " + getIDSymbolTable(id).getOffset());
      System.out.println("addu $t2, $t2, $t0"); // index = (getIDSymbolTable(id).getOffset() + index);
      
      System.out.println("li $t0, -4");
      System.out.println("nop\nmult $t0, $t2");
      System.out.println("mflo $t2"); // index = -4 * index
      // load in $v0 or $f0
      System.out.println("addu $t2, $fp, $t2");
      switch(getIDSymbolTable(id).getType()){
        case INT:{
          System.out.println("lw $v0, 0($t2)");
          break;
        }
        case CHAR:{
          System.out.println("lb $v0, 0($t2)");
          break;
        }
        default:
          break;
      } 
      // indexes = null; // clean indexing for next array
      index_position = -1;
      // put destination in $v1
      System.out.println("addu $v1, $t2, $zero");
      return "123"; // just an invalid ID basically... sorry about that
    }
    return id;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // Enum

  //E.g. enum point{x = 1, y, z = 4}
  @Override
  public String visitDecEnumSpec(CParser.DecEnumSpecContext ctx){
    enum_state = 0;
    System.err.println("In dec enum");
    String enumID = ctx.id.getText();
    this.visit(ctx.enumL); //evaluates each expression in brackets
    
    return "";
  }

  //E.g. the "enum day" part in enum day X = tuesday;
  //Must communicate the ID of enum for symbol table access
  @Override
  public String visitEmptyEnumSpec(CParser.EmptyEnumSpecContext ctx){
    //enum_state = 0;

    //return ctx.id.getText(); //Only necessary if storing "day"
    return ""; 
  }

  //e.g {x}
  public String visitEmptyEnum(CParser.EmptyEnumContext ctx){

    //create new var
    //interpret RHS
    String enumConstId = this.visit(ctx.enume);
    String enumVal_s = Integer.toString(enum_state);

    STO varObj = new Variable(1, mem++, enumConstId, isGlobalScope(), types.INT);
    current_enum_object = varObj;
    setIDSymbolTable(enumConstId,varObj);
    getIDSymbolTable(enumConstId).initialize(interpret(enumVal_s));

    enum_state++;
    
    return "";
  }

  //e.g. {x = 0;}
  public String visitAssgnEnum(CParser.AssgnEnumContext ctx){

    String enumConstId = this.visit(ctx.enume);
    String enumVal_s = this.visit(ctx.expr); 
    Integer enumVal = Integer.parseInt(enumVal_s);

    enum_state = enumVal; //reset enum to previous value

    STO varObj = new Variable(1, mem++, enumConstId, isGlobalScope(), types.INT);
    current_enum_object = varObj;
    setIDSymbolTable(enumConstId, varObj);
    getIDSymbolTable(enumConstId).initialize(interpret(enumVal_s));

    return "";
  }

  //returns id of enum const
  @Override
  public String visitEnumConst(CParser.EnumConstContext ctx){

    return ctx.id.getText();
  }

    ////////////////////////////////////////////////////////////////////////////////////
  // Sizeof

  // sizeof(a)
  @Override
  public String visitSizeExprUnaryExpr(CParser.SizeExprUnaryExprContext ctx){

    //1. eval
    String id = this.visit(ctx.expr);

    //lookup var in symbol table
    STO var = getIDSymbolTable(id);
    types t = var.getType();
    int size = typeSize(t);

    String ret_size = Integer.toString(size);
    System.out.println("li $v0, " + ret_size);

    return "";
  }

  // int a = sizeof(int);

  //sizeof(int)
  @Override
  public String visitSizeTypeUnaryExpe(CParser.SizeTypeUnaryExpeContext ctx){

    String size_type = ctx.type.getText();
    types t = parseType(size_type);
    int size = typeSize(t);

    String ret_size = Integer.toString(size);
    System.out.println("li $v0, " + ret_size);

    return ret_size;
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
    CCompiler compiler = new CCompiler(debug);
    compiler.visit(tree);
    System.err.println("Symbol table (should have one entry of global declarations): " + compiler.symbolTable);
    System.err.println("Final mem: "+compiler.mem);
  }

}
