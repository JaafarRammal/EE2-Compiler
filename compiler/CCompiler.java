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
import java.util.Iterator;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

import java.lang.Float.*;
import java.sql.Types;
import java.lang.Double.*;
import java.util.Arrays;


enum types {INT, CHAR, DOUBLE, FLOAT, UNSIGNED, SIGNED, SHORT, VOID};
enum STOtypes {VAR, ARR, PTR, FUN, STR, DEF, STRUCTDEF, STRUCT};

abstract class STO {

  // all elements have the following
  protected int size;
  protected int offset;
  protected String ID;
  protected boolean isGlobal;
  protected boolean isPointer;
  protected types type;
  protected STOtypes STOtype;

  // arrays extra
  public ArrayList<Integer> dimensions;

  // functions extra
  public ArrayList<types> parameters;

  // pointers extra
  public int pointerDepth;

  // struct extra
  public Map<String, STO> members = new HashMap<String,STO>();
  protected ArrayList<Integer> sizes = new ArrayList<Integer>(); // just to make things easier, could have used ids list
  protected ArrayList<String> ids = new ArrayList<String>(); // keep IDs in order for initialization

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

  protected void initSTO(int s, int o, String i, boolean g, boolean p, types t, ArrayList<Integer> v, STOtypes st){
    size = s;
    offset = o;
    ID = i;
    isGlobal = g;
    isPointer = p;
    pointerDepth = 0;
    type = t;
    dimensions = v;
    STOtype = st;
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
  public STOtypes getSTOType(){return this.STOtype;}

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
  public ArrayList<types> getParameters(){return this.parameters;}
  public types getParameter(int i){return this.parameters.get(i);}
  public void addParameter(types i){this.parameters.add(i);}
  public void setParamCount(int s){this.size = s;}
  public int getParamCount(){return this.size;}
  public void setParameters(ArrayList<types> params){this.parameters = params;}

  // pointers functions
  public void setDepth(int d){this.pointerDepth = d;}
  public int getDepth(){return this.pointerDepth;}

  // struct functions
  public STO getMember(String ID){return members.get(ID);}
  public void setMember(String ID, STO obj){
    members.put(ID, obj);
    getSize(); //updates size
  }
  public Map<String, STO> getMembers(){return members;}
  protected void setMembers(Map<String, STO> m){
    members = m;
    getSize();
  }
  public ArrayList<Integer> getSizes(){return sizes;}
  public ArrayList<String> getIDs(){return ids;}

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
      case SIGNED:
        return 4;
      case SHORT:
        return 2;
      case VOID:
        return 1;
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

  // debuging print function
  public void print(){
    System.err.println("\nSTO type: " + STOtype);
    System.err.println("ID: " + ID);
    System.err.println("Is global: " + isGlobal);
    System.err.println("Type: " + type);
    System.err.println("Stack offset: " + offset);
    System.err.println("Size: " + size);
  }

}

class Variable extends STO{
  Variable(){initSTO();}
  Variable(int size, int offset, String ID, boolean isGlobal, types type){initSTO(size, offset, ID, isGlobal, false, type, null, STOtypes.VAR);}
  @Override public void initialize(String value){
    if(!isGlobal()){
      int offset = getOffset();
      switch(getType()){
        case CHAR:{
          System.out.println("sb $v0, " + -4*offset + "($sp)");
          break;
        }
        case SHORT:{
          System.out.println("sh $v0, " + -4*offset + "($sp)");
          break;
        }
        case FLOAT:{
          System.out.println("s.s $f0, " + -4*offset + "($sp)");
          break;
        }
        case DOUBLE:{
          System.out.println("s.d $f0, " + -4*(offset+1) + "($sp)");
          break;
        }
        default:{
          System.out.println("sw $v0, " + -4*offset + "($sp)");
          break;
        }
      }
    }else{
      value = getType() == types.FLOAT ? CCompiler.removeF(value) : value;
      value = CCompiler.interpret(value);
      if(value.equals("true")) value = "1";
      if(value.equals("false")) value = "0";
      System.out.println(".global " + getID());
      switch(getType()){
        case CHAR:{
          System.out.println(getID() + ":\n\t.byte " + (int) Math.round(Double.parseDouble(value)));
          break;
        }
        case SHORT:{
          System.out.println(getID() + ":\n\t.half " + (int) Math.round(Double.parseDouble(value)));
          break;
        }
        case FLOAT:{
          System.out.println(getID() + ":\n\t.word " + CCompiler.floatBits(Float.parseFloat(value)));
          break;
        }
        case DOUBLE:{
          System.out.println(getID() + ":\n\t.word " + CCompiler.doubleBits(Double.parseDouble(value))[1] + "\n\t.word " + CCompiler.doubleBits(Double.parseDouble(value))[0]);
          break;
        }
        default:{
          System.out.println(getID() + ":\n\t.word " + (int) Math.round(Double.parseDouble(value)));
          break;
        }
      }
    }
  }
}

class Array extends STO{
  Array(){initSTO();}
  Array(int size, int offset, String ID, boolean isGlobal, types type, ArrayList<Integer> dimensions){initSTO(size, offset, ID, isGlobal, false, type, dimensions, STOtypes.ARR);}
  @Override public void initialize(double[] values){
    if(isGlobal()){
      System.out.println(".global " + getID());
      System.out.println(getID()+":");
      for(int i=0; i<values.length;i++){
        switch(getType()){
          case CHAR:{
              System.out.println("\t.byte " + ((((int)values[values.length-i-1])<<24) >> 24));
              break;
          }
          case SHORT:{
            System.out.println("\t.half " + (int)values[i]);
            break;
          }
          case FLOAT:{
            System.out.println("\t.word " + CCompiler.floatBits(Float.parseFloat(Double.toString(values[i]))));
            break;
          }
          case DOUBLE:{
            System.out.println("\t.word " + CCompiler.doubleBits(Double.parseDouble(Double.toString(values[i])))[1] + "\n\t.word " + CCompiler.doubleBits(Double.parseDouble(Double.toString(values[i])))[0]);
            break;
          }
          default:{
            System.out.println("\t.word " + (int)values[i]);
            break;
          }
        }
        
      }
    }else{
      // store the reversed way because GCC wants it like that on the stack
      if(getType() == types.CHAR) setOffset(offset + values.length/4 + (values.length%4==0?0:1));
      for(int i=0; i<values.length; i++){
        switch(getType()){
          case CHAR:{
            System.out.println("li $v0, " + ((((int)values[values.length - i - 1])<<24) >> 24));
            System.out.println("sb $v0, " + (-4*offset+i) + "($sp)");
            break;
          }
          case SHORT:{
            System.out.println("li $v0, " + (int)values[values.length - i - 1]);
            System.out.println("sh $v0, " + -4*(offset+i) + "($sp)");
            break;
          }
          case FLOAT:{
            System.out.println("li $t1, " + CCompiler.floatBits((float)values[values.length - i - 1]));
            System.out.println("mtc1 $t1, $f0");
            System.out.println("s.s $f0, " + -4*(offset+i) + "($sp)");
            break;
          }
          case DOUBLE:{
            System.out.println("li $t1, " + CCompiler.doubleBits(values[values.length - i - 1])[1]);
            System.out.println("li $t2, " + CCompiler.doubleBits(values[values.length - i - 1])[0]);
            System.out.println("mtc1.d $t1, $f0");
            System.out.println("s.d $f0, " + -4*(offset+2*i+1) + "($sp)");
            break;
          }
          default:{
            System.out.println("li $v0, " + (int)values[values.length - i - 1]);
            System.out.println("sw $v0, " + -4*(offset+i) + "($sp)");
          }
        } 
      }
      // now finalize the reverse by pointing to the "last element" (which is the first element of the array)
      switch(getType()){
        case CHAR:
          break;
        case DOUBLE:
          setOffset(offset + 2*values.length - 1);
          break;
        default:
          setOffset(offset + values.length - 1);
      }
      
    }
  }

  @Override public void print(){
    super.print();
    System.err.println("Dimensions: " + getDimensions());
  }
}

class Function extends STO{
  Function(){initSTO();}
  Function(int paramCount, String ID, types type, ArrayList<types> params){
    initSTO(paramCount, -1, ID, true, false, type, null, STOtypes.FUN);
    setParameters(params);
  }
  @Override public void print(){
    super.print();
    System.err.println("Parameters count:" + size);
    if(size != 0) System.err.println("Parameters: " + getParameters());
  }
}

class Pointer extends STO{
  Pointer(){initSTO();}
  Pointer(int size, int offset, String ID, boolean isGlobal, types type, int depth){
    initSTO(size, offset, ID, isGlobal, true, type, null, STOtypes.PTR);
    setDepth(depth);
    setDimensions(new ArrayList<Integer>());
    addDimension(1);
  }
  @Override public void initialize(String value){
    if(!isGlobal()){
      int offset = getOffset();
      String reg = "$v0";
      if(value == "0")
        reg = "$zero";
        System.out.println("sw " + reg + ", " + -4*offset + "($sp)");
    }else{
      if(value.equals("true")) value = "1";
      if(value.equals("false")) value = "0";
      if(value.charAt(0) == '\"'){
        System.out.println("$LC" + getID() + ":");
        String sstr = value.substring(1, value.length()-1); //removing the " "
        int i;
        for(i=0; i<sstr.length(); i++){
          char curr = sstr.charAt(i);
          int charVal = (int)curr;
          if(curr == '\\'){
            charVal = CCompiler.escapeSequenceValue(curr+ Character.toString(sstr.charAt(i+1)))[0];
            i++;
          }
          System.out.println("\t.byte " + charVal);
        }
        System.out.println("\t.byte 0");
        System.out.println(getID() + ":\n\t.word $LC" + getID());
      }else{
        if(value.charAt(0) == '&'){
          System.out.println(".global " + getID());
          System.out.println(getID() + ":\n\t.word " + value.substring(1, value.length()));
        }else{
          Integer intValue = (int) Math.round(Double.parseDouble(value));
          System.out.println(".global " + getID());
          System.out.println(getID() + ":\n\t.word " + intValue);
        }
      }
    }
  }
  @Override public void print(){
    super.print();
    System.err.println("Pointer depth:" + this.getDepth());
  }
}

class Typedef extends STO{
  Typedef(){initSTO();}
  Typedef(String ID, boolean isGlobal, types type){initSTO(0, -1, ID, isGlobal, false,type, null, STOtypes.DEF); }
}

class Struct extends STO{
  Struct(){initSTO();}
  Struct(int offset, String ID, boolean isGlobal, STO templateStruct){
    initSTO(0, offset, ID, isGlobal, false, null, null, STOtypes.STRUCT);
    //A. copy members and sizes
    members = templateStruct.getMembers();
    sizes = templateStruct.getSizes();
    ids = templateStruct.getIDs();

    //B. set the offsets of every member correctly. Use the IDs order to retrieve from the map
    // reverse offset
    setOffset(getOffset() - getSize() + Math.min(4, getSize()));
    // max row
    int max_size = 0;
    for(int s: sizes){
      if(s>max_size){
        max_size = s;
      }
    }
    // start fitting one by one
    int local_offset = 0;
    int row = 1;
    for(int i=0; i<ids.size(); i++){
      STO obj = getMember(ids.get(i));
      int s = typeSize(obj.getType());
      if(s + local_offset > max_size){
        local_offset = max_size * row;
        row ++;
      }
      obj.setOffset(getOffset() + local_offset);
      local_offset += s;
      setMember(ids.get(i), obj);
    }

    if(isGlobal()){
      System.out.println(".global " + getID() + "\n" + getID() + ":\n\t.word 0");
      for(int i=1; i<getSize()/4; i++){
        System.out.println("\t.word 0");
      }
    }

  }
  @Override public int getSize(){
    setSize(0);
    //1. find largest variable size
    int max_size = 0;
    for(int s: sizes){
      if(s>max_size){
        max_size = s;
      }
    }
    //2. set as row size
    int row_space = max_size;
    int total_size;
    //3. loop through entries. Fit it onto the row, leave when finished
    int num_rows = 1;
    for(int s: sizes){
      // setSize(size + var.getValue().getSize());
      if(row_space < s){
        num_rows++;
        row_space = max_size; //reset to new row
      }
      row_space -= s;
    }
    setSize(num_rows*max_size);
    return size;
  }
}

class StructDef extends STO{
  StructDef(){initSTO();}
  StructDef(String ID){initSTO(0, -1, ID, true, false, null, null, STOtypes.STRUCTDEF);getSize();}
  @Override public void setMember(String id, STO obj){
    members.put(id, obj);
    sizes.add(typeSize(obj.getType()));
    ids.add(id.toString());
    getSize(); //updates size
  }
  @Override public int getSize(){
    setSize(0);
    //1. find largest variable size
    int max_size = 0;
    for(int s: sizes){
      if(s>max_size){
        max_size = s;
      }
    }
    //2. set as row size
    int row_space = max_size;
    int total_size;
    //3. loop through entries. Fit it onto the row, leave when finished
    int num_rows = 1;
    for(int s: sizes){
      // setSize(size + var.getValue().getSize());
      if(row_space < s){
        num_rows++;
        row_space = max_size; //reset to new row
      }
      row_space -= s;
    }
    setSize(num_rows*max_size);
    return size;
  }
}

public class CCompiler extends CBaseVisitor<String> {

  // debugging tools
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  int mem; 
  int label_id; // for unique identification of each label (branch)
  boolean debug = false;
  boolean enter_parent = false;
  int param_count = 0;  // count parameters for function definition. No nested cases
  int dec_size; 

  int enum_state; //Keeps latest value of enum
  ArrayList<String> local_strings = new ArrayList<String>();


  Stack<String> current_break_context = new Stack<String>();   // Break: switch / while / for    (break_context)
  Stack<String> current_continue_context = new Stack<String>();   // Continue: while / for          (continue_context)
  Stack<String> current_return_context = new Stack<String>();   // Return: functions              (return_context)
  Stack<Integer> current_arguments_context = new Stack<Integer>(); // Informs us of memory location of switch. Used for nested switches
  Stack<Integer> current_mem_context = new Stack<Integer>();   // Mem context (retrieve stack offset context)
  Stack<STO> current_struct_context = new Stack<STO>(); // Nested struct declaration tracking
  Stack<STO> current_func_invoc = new Stack<STO>(); // Nested function calls arguments type tracking


  Stack<Map<String, STO>> symbolTable = new Stack<Map<String, STO>>();

  // interpreter for arithmetic expressions
  static ScriptEngineManager mgr;
  static ScriptEngine interpreter;

  // STO context passing
  STO current_function_object = null;
  STO current_variable_object = null;
  STO current_array_object = null;
  STO current_enum_object = null;
  STO current_typedef_object = null;
  STO current_string_object = null;
  STO current_structdef_object = null;
  STO current_struct_object = null;

  types current_type = null;
  int pointer_depth = 0;
  int pointer_mul = 0;
  int pointer_jumps = 0;

  // array initialization
  int index_position = -1;
  int[] indexes = null;
  double[] values = null;
  boolean halt = false;

  // external declarations
  boolean extern = false;

  // pointer strings
  int lc_index = 0;
  String lc_out = "";

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
    System.out.println("\n.data\n"); // init data directive for globals
    
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

    // END OF SCRATCH


    */
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // HELPERS

  ////////////////////////////////////////////////////////////////////////////////////
  // expression helper
  // form LEFT OP RIGHT
  // $t0/f0 has left
  // $t1/f2 has right
  public String threeOp(ParserRuleContext ctx){

    // Mem is stack offset
    // check for pointer to shift operands accordingly if required
    pointer_mul = 0;
    this.visit(ctx.getChild(0));
    switch(current_type){
      case FLOAT:
        System.out.println("s.s $f0, " + -4*(mem++) + "($sp)");
        break;
      case DOUBLE:
        mem++;
        System.out.println("s.d $f0, " + -4*(mem++) + "($sp)");
        break;
      default:
        System.out.println("sw $v0, " + -4*(mem++) + "($sp)");
    }
    int leftPointer = pointer_mul;

    pointer_mul = 0;
    this.visit(ctx.getChild(2));
    switch(current_type){
      case FLOAT:
        System.out.println("s.s $f0, " + -4*(mem++) + "($sp)");
        break;
      case DOUBLE:
        mem++;
        System.out.println("s.d $f0, " + -4*(mem++) + "($sp)");
        break;
      default:
        System.out.println("sw $v0, " + -4*(mem++) + "($sp)");
    }
    int rightPointer = pointer_mul;

    // get right from stack (t1 or f2)
    switch(current_type){
      case FLOAT:
        System.out.println("l.s $f2, " + -4*(--mem) + "($sp)");
        break;
      case DOUBLE:
        System.out.println("l.d $f2, " + -4*(--mem) + "($sp)");
        mem--;
        break;
      default:
        System.out.println("lw $t1, " + -4*(--mem) + "($sp)");  // get right from stack
    }
    if(leftPointer != 0)System.out.println("sll $t1, $t1, " + leftPointer); // if left is a pointer, align right value
    
    // get right from stack (t0 or f0)
    switch(current_type){
      case FLOAT:
        System.out.println("l.s $f0, " + -4*(--mem) + "($sp)");
        break;
      case DOUBLE:
        System.out.println("l.d $f0, " + -4*(--mem) + "($sp)");
        mem--;
        break;
      default:
        System.out.println("lw $t0, " + -4*(--mem) + "($sp)");  // get right from stack
    }
    if(rightPointer != 0)System.out.println("sll $t1, $t1, " + rightPointer); // if right is a pointer, align left value
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
    if(!halt) symbolTable.peek().put(id, obj);
  }

  // check if global scope
  public boolean isGlobalScope(){
   return symbolTable.size() == 1;
  }

  // interpret constant expression
  public static String interpret(String expression){
    if(expression.charAt(0) == '\''){
      int v = (int) expression.charAt(1);
      return "" + v;
    }
    try{
      String output = String.valueOf(interpreter.eval(expression));
      if(output.equals("true")) output = "1";
      if(output.equals("false")) output = "0";
      return output;
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
      case "signed":
        return types.SIGNED;
      case "short":
        return types.SHORT;
      case "void":
        return types.VOID;
      default:
          if(type.charAt(0)=='*'){
            return types.INT;
          } else{
            STO typedefObj = getIDSymbolTable(type);
            types typedef_val = typedefObj.type;
            return typedef_val;
          }
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
      case SIGNED:
        return 4;
      case SHORT:
        return 2;
      case VOID:
        return 1;
      default:
        throwIllegalArgument(type.toString(), "typeSize conversion");
        return -1;
    }
  }

  // get floats (32 bits) / double (64 bits) binary representation
  public static int floatBits(float f){
    return Float.floatToIntBits(f);
  }

  public static int[] doubleBits(double d){
    int arr[] = new int[2];
    long v = Double.doubleToLongBits(d);
    arr[0] = (int) (v >> 32);
    arr[1] = (int) (v - ((v >> 32) << 32));
    return arr;
  }

  // remove float indicator
  public static String removeF(String s){
    s = s.replaceAll("f", "");
    s = s.replaceAll("F", "");
    s = s.replaceAll("l", "");
    s = s.replaceAll("L", "");
    return s;
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

  //Takes string, outputs string size- including escape sequences
  public int getStringSize(String sstr){
    ArrayList<Integer> charVal = new ArrayList<>(); //holds int value of char, includes escape sequences
    charVal = interpretString(sstr);

    return charVal.size();
  }

  //takes escape sequence, i.e. /x112 , returns corresponding int. 
  //-1 if no corresponding value.
  static public int[] escapeSequenceValue(String str){
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
    symbolTable.peek().remove(functionName);
    this.visit(ctx.spec);
    current_function_object = new Function(0, functionName, current_type, new ArrayList<types>());
    setIDSymbolTable(("1" + functionName), current_function_object);
    extendSymbolTable();
    this.visit(ctx.func_dec);
    current_return_context.add("_return_" + functionName);
    System.out.println("# " + functionName + ": function full");
    System.out.println("\t.set noreorder\n\t.text\n\t.align 2\n\t.globl " + functionName);
    insertLabel(functionName);
    if(!functionName.equals("main")){
      // System.out.println("# store function arguments\nsw $a0, 0($sp)\nsw $a1, 4($sp)\nsw $a2, 8($sp)\nsw $a3, 12($sp)\n"); // store arguments on caller stack (NOT NEEDED ?)
      System.out.println("move $t0, $sp"); // remember where the stack pointer was
    }
    System.out.println("# " + functionName + ": function entry");
    // figure 1: get function header ready
    System.out.println("addiu $sp, $sp, -12\nsw $fp, 4($sp)\nsw $ra, 8($sp)\nmove $fp, $sp\n");
    // now load all input parameters on the function stack
    mem = 0;
    boolean seenInt = false;
    int arg = 0;
    // current_function_object.setParamCount(param_count);
    setIDSymbolTable(("1" + functionName), current_function_object);
    for(int i=0; i<param_count; i++){
      switch(current_function_object.getParameter(i)){
        case DOUBLE:
          mem++;
          if(arg < 3){
            if(seenInt){
              if(arg == 1) arg++;
              System.out.println("sw $a" + arg++ + ", " + -4*(mem++) + "($sp)");
              System.out.println("sw $a" + arg++ + ", " + -4*(mem) + "($sp)");
            }
            else
              if(i==0)
                {System.out.println("s.d $f12, " + -4*(mem++) + "($sp)");arg+=2;}
              else if(i==1)
                {System.out.println("s.d $f14, " + -4*(mem++) + "($sp)");arg+=2;}
              else
                {System.out.println("sw $a" + arg++ + ", " + -4*(mem++) + "($sp)"); System.out.println("sw $a" + arg++ + ", " + -4*(mem) + "($sp)");}
          }else{
            if(arg == 3) mem++;
            System.out.println("lw $t1, " + 4*mem + "($t0)");System.out.println("sw $t1, " + -4*(mem++) + "($sp)");
            System.out.println("lw $t1, " + 4*mem + "($t0)");System.out.println("sw $t1, " + -4*(mem) + "($sp)");
          }
          break;
        case FLOAT:
          if(arg < 4){
            if(seenInt)
              System.out.println("sw $a" + arg++ + ", " + -4*(mem++) + "($sp)");
            else
              if(i==0)
                {System.out.println("s.s $f12, " + -4*(mem++) + "($sp)");arg++;}
              else if(i==1)
                {System.out.println("s.s $f14, " + -4*(mem++) + "($sp)");arg++;}
              else
                System.out.println("sw $a" + arg++ + ", " + -4*(mem++) + "($sp)");
          }else{
            System.out.println("lw $t1, " + 4*mem + "($t0)");
            System.out.println("sw $t1, " + -4*(mem++) + "($sp)");
          }
          break;
        default:
          seenInt = true;
          String op = "w";
          switch(current_function_object.getParameter(i)){
            case CHAR:
              op = "b";
              break;
            case SHORT:
              op = "h";
              break;
          }
          if(arg < 4){
            System.out.println("s" + op +  " $a" + arg++ + ", " + -4*(mem++) + "($sp)");
          }else{
            System.out.println("l" + op +  " $t1, " + 4*mem + "($t0)");
            System.out.println("s" + op +  " $t1, " + -4*(mem++) + "($sp)");
          }
      }
    }
    System.out.println("# " + functionName + ": function body");
    this.visit(ctx.comp_stat);
    insertLabel("# " + functionName + ": function return\n_return_" + functionName);
    // exit function: setback $fp and $sp as before. Get correct return address for subroutine
    System.out.println("move $sp, $fp\nlw $ra, 8($fp)\nlw $fp, 4($fp)\naddiu $sp, $sp, 12\njr $ra\nnop");
    current_return_context.pop();
    removeSymbolTable(); // using remove means we did great xD test with remove later, should work
    setIDSymbolTable(("1" + functionName), current_function_object);
    current_function_object = null;
    System.out.println("\n.data\n"); // data directive for globals
    System.out.println(lc_out);
    lc_out = "";
    return "";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // The ID of any direct declaration, i.e. int a = 1; or int a;
  // LHS of direct declaration retrieved, returns ID
  @Override
  public String visitIdDirDec(CParser.IdDirDecContext ctx){
    String ID = ctx.id.getText();
    if(halt) return ID;
    if((current_function_object == null) == isGlobalScope()){
      STO varObj;
      if(pointer_depth == 0){
        varObj = new Variable(1, mem++, ID, isGlobalScope(), current_type);
        if(current_type == types.DOUBLE) mem++;
      }
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
    current_function_object = new Function(param_count, functionName, current_type, new ArrayList<types>());
    mem = 0;
    this.visit(ctx.paramL);
    current_function_object.setParamCount(param_count);
    setIDSymbolTable(("1" + functionName), current_function_object);
    return functionName;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // function identifiers list ( TYPE ID (IDL?) or TYPE ID())
  @Override
  public String visitIdlDirDec(CParser.IdlDirDecContext ctx){
    String functionName = this.visit(ctx.dec);
    param_count = 0;
    current_function_object = new Function(param_count, functionName, current_type, new ArrayList<types>());
    mem = 0;
    if(ctx.idL != null) this.visit(ctx.idL);
    current_function_object.setParamCount(param_count);
    setIDSymbolTable(("1" + functionName), current_function_object);
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
    current_func_invoc.add(getIDSymbolTable(("1" + functionName)));
    int argsCount = getIDSymbolTable(("1" + functionName)).getParamCount(); // prepare to move the stack pointer accordingly
    mem += Math.max(4, argsCount); // allocate at least 4 locations as subroutine is allowed to write over the 4 arguments
    // current_arguments_context.add(argsCount-1); // save the count state for parameters (for nested cases like f(g(1), h(2, 3)) where another function gets ready for parameters). -1 because index starts at 0
    current_arguments_context.add(0); // start at offset zero in the argument context
    current_mem_context.add(0);
    System.out.println("addiu $sp, $sp, " + -4*(mem)); // secure memory locations for arguments. CURRENTLY INTEGERS. LATER USE THE TABLE
    if(ctx.args != null) this.visit(ctx.args); // get parameters
    int arg = 0;
    boolean seenInt = false;
    int offset = 0;
    for(int i=0; i<4 && i<argsCount; i++){  // store parameters in $a0-$a3 or $f12-$f14
      switch(getIDSymbolTable(("1" + functionName)).getParameter(i)){
        case DOUBLE:
          if(arg < 3){
            offset++;
            if(seenInt){
              if(arg == 1) arg++;
              System.out.println("lw $a" + arg++ + ", " + 4*(offset++) + "($sp)");
              System.out.println("lw $a" + arg++ + ", " + 4*(offset) + "($sp)");
            }
            else
              if(i==0)
                {System.out.println("l.d $f12, " + 4*(offset++) + "($sp)");arg+=2;}
              else if(i==1)
                {System.out.println("l.d $f14, " + 4*(offset++) + "($sp)");arg+=2;}
              else
                {System.out.println("lw $a" + arg++ + ", " + 4*(offset++) + "($sp)"); System.out.println("lw $a" + arg++ + ", " + -4*(offset) + "($sp)");}
          }
          break;
        case FLOAT:
          if(arg < 4){
            if(seenInt)
              System.out.println("lw $a" + arg++ + ", " + 4*(offset++) + "($sp)");
            else
              if(i==0)
                {System.out.println("l.s $f12, " + 4*(offset++) + "($sp)");arg++;}
              else if(i==1)
                {System.out.println("l.s $f14, " + 4*(offset++) + "($sp)");arg++;}
              else
                System.out.println("lw $a" + arg++ + ", " + 4*(offset++) + "($sp)");
          }
          break;
        default:
          seenInt = true;
          if(arg < 4){
            switch(getIDSymbolTable(("1" + functionName)).getParameter(i)){
              case CHAR:
                System.out.println("lb $a" + arg++ + ", " + 4*(offset++) + "($sp)");
                break;
              case SHORT:
                System.out.println("lh $a" + arg++ + ", " + 4*(offset++) + "($sp)");
                break;
              default:
                System.out.println("lw $a" + arg++ + ", " + 4*(offset++) + "($sp)");
            }
          }
      }
    }
    System.out.println("jal " + functionName + "\nnop"); // jump and link
    System.out.println("addiu $sp, $sp, " + 4*(mem)); // restore stack
    current_type = current_func_invoc.pop().getType();
    current_mem_context.pop();
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
    if(pointer_depth != 0) current_type = types.INT;
    current_function_object.addParameter(current_type);
    return "";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // function invocation arguments
  @Override
  public String visitSingleArgExprList(CParser.SingleArgExprListContext ctx) { 
    Integer currentArgumentCount = current_arguments_context.pop();
    Integer offset = current_mem_context.pop();
    current_type = current_func_invoc.peek().getParameter(current_func_invoc.peek().getSize() - currentArgumentCount - 1);
    this.visit(ctx.expr); // value is in $v0 or $f0. Only bottom part of stack is being used
    switch(current_type){
      case DOUBLE:{
        System.out.println("s.d $f0, " + 4*(++offset) + "($sp)");
        break;
      }
      case FLOAT:{
        System.out.println("s.s $f0, " + 4*offset + "($sp)");
        break;
      }
      default:
        System.out.println("sw $v0, " + 4*offset + "($sp)");
    }
    current_mem_context.add(offset+1);
    current_arguments_context.add(currentArgumentCount+1);  // argument currently treated as integer with size 1 not 4. Later refer to typeSize table
    return "";
  }

  @Override
  public String visitMultArgExprList(CParser.MultArgExprListContext ctx) { 
    this.visit(ctx.args);
    Integer currentArgumentCount = current_arguments_context.pop();
    Integer offset = current_mem_context.pop();
    current_type = current_func_invoc.peek().getParameter(current_func_invoc.peek().getSize() - currentArgumentCount - 1);
    this.visit(ctx.expr); // value is in $v0 or $f0. Only bottom part of stack is being used
    switch(current_type){
      case DOUBLE:{
        System.out.println("s.d $f0, " + 4*(++offset) + "($sp)");
        break;
      }
      case FLOAT:{
        System.out.println("s.s $f0, " + 4*offset + "($sp)");
        break;
      }
      default:
        System.out.println("sw $v0, " + 4*offset + "($sp)");
    }
    current_mem_context.add(offset+1);
    current_arguments_context.add(currentArgumentCount+1);
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

    if(!isGlobalScope() && !halt){
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
      else{ // not a character cases
        if(current_type == types.FLOAT) intConst_val = removeF(intConst_val);
        switch(current_type){
          case FLOAT:
            int f0 = floatBits(Float.parseFloat(intConst_val));
            System.out.println("li $t4, " + f0 + "\nsw $t4, " + -4*mem + "($sp)\nl.s $f0, " + -4*mem + "($sp)"); // $sp because inside function arguments as well. Maybe offseted at that stage
            break;
          case DOUBLE:
            f0 = doubleBits(Double.parseDouble(intConst_val))[1];
            int f1 = doubleBits(Double.parseDouble(intConst_val))[0];
            System.out.println("li $t4, " + f0 + "\nsw $t4, " + -4*(mem++) + "($sp)");
            System.out.println("li $t4, " + f1 + "\nsw $t4, " + -4*mem + "($sp)");
            System.out.println("l.d $f0, " + -4*mem-- + "($sp)");

            break;
          default:
            System.out.println("li $v0, " + intConst_val);
        }
      }
    }
    return intConst_val;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // variable identifier
  @Override public String visitIdPrimaryExpr(CParser.IdPrimaryExprContext ctx) {
    pointer_jumps = 0;
    String id = ctx.id.getText();
    STO var = getIDSymbolTable(id);
    if(var != null && !halt){
      if(var.getSTOType() == STOtypes.STRUCT) return id;
      if(!var.isGlobal()){
        if(var.getSTOType() == STOtypes.ARR){
          System.out.println("addiu $v0, $fp, " + -4*getIDSymbolTable(id).getOffset()); // address of array. Ex: {int a[3]; return a;} returns address of array
        }else{
          if(var.getSTOType() == STOtypes.PTR){
            System.out.println("lw $v0, " + -4*getIDSymbolTable(id).getOffset() + "($fp)"); // value of pointer is always in a word despite the type
          }else{
            switch(var.getType()){
              case CHAR:{
                System.out.println("lb $v0, " + -4*getIDSymbolTable(id).getOffset() + "($fp)");
                break;
              }
              case SHORT:{
                System.out.println("lh $v0, " + -4*getIDSymbolTable(id).getOffset() + "($fp)");
                break;
              }
              case FLOAT:{
                System.out.println("l.s $f0, " + -4*getIDSymbolTable(id).getOffset() + "($fp)");
                break;
              }
              case DOUBLE:{
                System.out.println("l.d $f0, " + -4*(getIDSymbolTable(id).getOffset()+1) + "($fp)"); // should load te pair into $f0, $f1
                break;
              }
              default:
                System.out.println("lw $v0, " + -4*getIDSymbolTable(id).getOffset() + "($fp)");
                break;
            }
          }
        }
      }else{
        if(var.getSTOType() == STOtypes.ARR){
          System.out.println("lui $v0, %hi(" + id +")\naddiu $v0, $v0, %lo(" + id + ")");
        }else{
          if(var.getSTOType() == STOtypes.PTR){
            System.out.println("lui $v0,%hi(" + id + ")\nlw $v0,%lo(" + id + ")($v0)");
          } else{
            switch(var.getType()){
              case CHAR:{
                  System.out.println("lui $v0,%hi(" + id + ")\nlb $v0,%lo(" + id + ")($v0)");
                  break;
              }
              case SHORT:{
                  System.out.println("lui $v0,%hi(" + id + ")\nlh $v0,%lo(" + id + ")($v0)");
                  break;
              }
              case FLOAT:{
                  System.out.println("lui $v0,%hi(" + id + ")\nl.s $f0,%lo(" + id + ")($v0)");
                  break;
              }
              case DOUBLE:{
                  System.out.println("lui $v0,%hi(" + id + ")\nl.d $f0,%lo(" + id + "+4)($v0)");
                  break;
              }
              default:{
                System.out.println("lui $v0,%hi(" + id + ")\nlw $v0,%lo(" + id + ")($v0)");
                break;
              }
            }
          }
        }
      }
    }else{
      // could be a function
      if(getIDSymbolTable("1" + id) == null)
        // if(!halt) throwIllegalArgument(id, "IdPrimaryExpr (ID NOT FOUND)"); // or tell the users "yo you didn't define that function"
        if(!halt) System.err.println(ANSI_RED + "ERROR: reference to '" + id + "' was never defined" + ANSI_RESET);
      return id;
    }

    // check if pointer / array
    if(var.getDepth() != 0){
      pointer_mul = 2; // default multiply by 4 (one memory location)
      if(var.getType() == types.CHAR) pointer_mul = 0; // no multiply for char
      if(var.getType() == types.SHORT) pointer_mul = 1; // multiply by 2 for shorts
      if(var.getType() == types.DOUBLE) pointer_mul = 3; // multiply by 8 for doubles (2 memory locations)
    }

    if(var.getSTOType() == STOtypes.PTR) current_type = types.INT;
    else current_type = var.getType();

    return id;  // return function name to caller (invoke in case of function at parent level)
  }


  ////////////////////////////////////////////////////////////////////////////////////
  // declaring a variable with initialization
  // TYPE DEC = VAL
  @Override
  public String visitOpInitDec(CParser.OpInitDecContext ctx) {
    String id = this.visit(ctx.left); // creates the variable object

    if(current_array_object != null){
      values = new double[current_array_object.getElementsCount()];
      indexes = new int[current_array_object.getDimensions().size()];
      this.visit(ctx.right);

      if(current_string_object != null){ //char array
        //initialize blank string in mem

        current_string_object.size = getStringSize(current_string_object.ID);
        setIDSymbolTable(id, current_string_object);
        if(!current_string_object.isGlobal){
          local_strings.add(current_string_object.ID);
        }
        current_string_object = null;
      } 
      else{ //int array
        // System.out.println(Arrays.toString(values));
        getIDSymbolTable(id).initialize(values);
        mem += current_array_object.getElementsCount();
        indexes = null;
      }
    }else{
      if(!getIDSymbolTable(id).isGlobal()){
        this.visit(ctx.right);
        getIDSymbolTable(id).initialize("");
      }else
        getIDSymbolTable(id).initialize(ctx.right.getText());
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
    
    //update ID, type in typedef object. Store in symbol table
    if(current_typedef_object != null){
      current_typedef_object.ID = id;
      current_typedef_object.type = current_type;
      setIDSymbolTable(id, current_typedef_object);
      current_typedef_object = null;
    }  
    else if(current_array_object != null){
      //int array
        values = new double[current_array_object.getElementsCount()];
        if(!extern) getIDSymbolTable(id).initialize(values);
        switch(getIDSymbolTable(id).getType()){
          case CHAR:
            mem += (current_array_object.getElementsCount()/4 + (current_array_object.getElementsCount()%4 == 0 ? 0 : 1));
            break;
          case DOUBLE:
            mem += 2*current_array_object.getElementsCount();
            break;
          default:
            mem += current_array_object.getElementsCount();
        }
    }else if(current_function_object == null && current_struct_object == null){
      if(!extern) getIDSymbolTable(id).initialize("0");
    }
    current_array_object = null; // we are done initializing the array
    current_function_object = isGlobalScope() ? null : current_function_object; // we are done declaring the function
    extern = false;
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

      if(ctx.expr.getText().charAt(0) == '\"'){ // for string inputs
        String str = ctx.expr.getText();
        String sstr = str.substring(1, str.length()-1); //removing the ""s or ''
        int i;
        for(i=0; i<sstr.length(); i++){
          char curr = sstr.charAt(sstr.length()-i-1);
          int charVal = (int)curr;
          if(i+1 != sstr.length() && sstr.charAt(sstr.length()-i-2) == '\\'){
            charVal = escapeSequenceValue("\\" + Character.toString(curr))[0];
            i++;
          }
          values[index++] =  charVal;
        }
      } 
      else{ // for int arrays
        // System.out.println(Arrays.toString(indexes) + " for value " + ctx.expr.getText() + " stored at " + index);
        switch(current_type){
          default:
            values[index] = Double.parseDouble(interpret(ctx.expr.getText()));
        }
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
    if(halt) return id;
    switch(unaryOp){
      case "+":
        break;
      case "-":
        switch(current_type){
          case DOUBLE:
            System.out.println("neg.d $f0, $f0");
            break;
          case FLOAT:
            System.out.println("neg.s $f0, $f0");
            break;
          default:
            System.out.println("subu $v0, $zero, $v0"); // return v0/f0 becomes -v0/-f0
        }
        break;
      case "~":
        System.out.println("not $v0, $v0"); // ~v0 = bitwiseNOT($v0)
        break;
      case "!": // TODO FOR DOUBLES AND FLOAT
        switch(current_type){
          case DOUBLE:
            System.out.println("li $t1,1072693248\nmtc1.d $t1, $f4");
            System.out.println("c.eq.s $f4, $f0\nl.s $f0, " + -4*mem-- + "($sp)");
            break;
          case FLOAT:
            System.out.println("li $t1,1065353216\nmtc1.d $t1, $f4");
            System.out.println("c.eq.s $f4, $f0\nl.s $f0, " + -4*mem-- + "($sp)");
            break;
          default:
          System.out.println("seq $v0, $v0, $zero"); // !v0 = $v0 == 0 ? 1 : 0
        }
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
          case CHAR:
            System.out.println("lb $v0, 0($v0)");
            break;
          case SHORT:
            System.out.println("lh $v0, 0($v0)");
            break;
          default:
            System.out.println("lw $v0, 0($v0)");
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
    String typeval = this.visit(ctx.spec);
    current_type = parseType(typeval);
    if(getIDSymbolTable(typeval) != null && getIDSymbolTable(typeval).getSTOType() == STOtypes.STRUCTDEF) current_struct_object = new Struct();
    this.visit(ctx.initList);
    String id = ctx.initList.getText();
    if(getIDSymbolTable(typeval) != null && getIDSymbolTable(typeval).getSTOType() == STOtypes.STRUCTDEF){
      STO templateStruct = getIDSymbolTable(typeval);
      STO obj = new Struct(-(--mem), id, isGlobalScope(), templateStruct);
      setIDSymbolTable(id, obj);
      mem += obj.getSize();
    }
    extern = false;
    return id;
  }

  @Override public String visitBaseTypeSpec(CParser.BaseTypeSpecContext ctx) { 
    current_type = parseType(ctx.type.getText());
    return ctx.type.getText();
  }

  @Override public String visitTypePointerSpec(CParser.TypePointerSpecContext ctx) { 
    return ("*" + this.visit(ctx.type));
  }

  @Override public String visitEnumTypeSpec(CParser.EnumTypeSpecContext ctx) {
    visitChildren(ctx);
    return "int";
  }


  ////////////////////////////////////////////////////////////////////////////////////
  // string initialization for char pointers
  @Override public String visitStrLitPrimaryExpr(CParser.StrLitPrimaryExprContext ctx) {
    String str = ctx.val.getText();
    String sstr = str.substring(1, str.length()-1); //removing the ""s or ''


    lc_out += "\n$LC" + lc_index + ":";
    int i;
    for(i=0; i<sstr.length(); i++){
      char curr = sstr.charAt(i);
      int charVal = (int)curr;
      if(curr == '\\'){
        charVal = CCompiler.escapeSequenceValue(curr+ Character.toString(sstr.charAt(i+1)))[0];
        i++;
      }
      lc_out += "\n\t.byte " + charVal;
    }
    lc_out += "\n\t.byte 0";
    System.out.println("lui $v0,%hi($LC" + lc_index + ")\naddiu $v0,$v0,%lo($LC" + lc_index++ + ")");
    return "";
  }

  // end variable manipulation
  ////////////////////////////////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////


  ////////////////////////////////////////////////////////////////////////////////////
  // structs

  @Override public String visitFuncCallPostExpr(CParser.FuncCallPostExprContext ctx) {
    String id = ctx.expr.getText();
    String invo = ctx.id.getText();
    // load value into $v0 / $f0
    // load address into $v1
    STO obj = getIDSymbolTable(id).getMember(invo);  // TODO: could be a pointer or an array, copy the necessary conditions check
    current_type = obj.getType();
    if(halt) return id;
    if(!getIDSymbolTable(id).isGlobal()){
      System.out.println("addiu $v1, $fp, " + obj.getOffset());
      switch(obj.getType()){
        case DOUBLE:
          System.out.println("l.d $f0, " + obj.getOffset() + "($fp)");
          break;
        case FLOAT:
          System.out.println("l.s $f0, " + obj.getOffset() + "($fp)");
          break;
        case CHAR:
          System.out.println("lb $v0, " + obj.getOffset() + "($fp)");
          break;
        case SHORT:
          System.out.println("lh $v0, " + obj.getOffset() + "($fp)");
          break;
        default:
          System.out.println("lw $v0, " + obj.getOffset() + "($fp)");
      }
    }else{
      int offset = obj.getOffset();
      System.out.println("la $v1, " + id + "+" + offset);
      switch(obj.getType()){
        case DOUBLE:
          System.out.println("l.d $f0, 0($v1)");
          break;
        case FLOAT:
          System.out.println("l.s $f0, 0($v1)");
          break;
        case CHAR:
          System.out.println("lb $v0, 0($v1)");
          break;
        case SHORT:
          System.out.println("lh $v0, 0($v1)");
          break;
        default:
          System.out.println("lw $v0, 0($v1)");;
      }
    }
      return id;
  }

  @Override public String visitSpecDeclaration(CParser.SpecDeclarationContext ctx) {
    visitChildren(ctx);

    return "";
  }
  
  // struct a;
  @Override public String visitSingleStructUnSpec(CParser.SingleStructUnSpecContext ctx) {
    return ctx.id.getText();
  }

  //struct a{int x; char b};
  @Override public String visitDecStructUnSpec(CParser.DecStructUnSpecContext ctx) {
    String id = ctx.id.getText();
  
    //detect that it's a struct
    if(ctx.obj.getText().equals("struct")){
      if(current_structdef_object != null){
        current_struct_context.add(current_structdef_object);    
      } 
      //create struct variable, save ID 
      STO strObj = new StructDef(id);
      current_structdef_object = strObj;    

      halt = true;
      //visit rhs, adding variables to members
      this.visit(ctx.decL);
      halt = false;
      //save struct in symbol table
      setIDSymbolTable(id, current_structdef_object);

      //pop off stack when done, reload previous struct variable
      if(!current_struct_context.empty()){
        current_structdef_object = current_struct_context.pop();
      }
      else{
        current_structdef_object = null;
      }
    }
    return id;
  }

  @Override public String visitSingleStructDecList(CParser.SingleStructDecListContext ctx) {
    visitChildren(ctx);
    return current_structdef_object.getID();
  }
  
  // left is type (visit) and right is ID but in typedefName context (just getText)
  @Override public String visitSpecSpecQualList(CParser.SpecSpecQualListContext ctx) {
    String type = ctx.type.getText();
    current_type = parseType(type);

    try{
      //add member to struct
      String id = ctx.specL.getText();
      STO varObj = new Variable(1, -1, id, isGlobalScope(), current_type);
      current_structdef_object.setMember(id,varObj);
    }
    catch(NullPointerException e){
      System.err.println("hmmm something wrong happened I'm not a perfect compiler");
    }

    return "";
  }

  @Override public String visitEmptyStructDec(CParser.EmptyStructDecContext ctx){
    visitChildren(ctx);
    return current_structdef_object.getID();
  }

  // end structs
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
    current_type = current_function_object.getType();
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
    System.out.println("bne $v0, $zero, " + successEnd + "\nnop"); // if left not zero, return true

    this.visit(ctx.right);
    System.out.println("bne $v0, $zero, " + successEnd + "\nnop"); // if right not zero, return true

    System.out.println("li $v0, 0"); // both were zero, return false
    System.out.println("j " + failEnd + "\nnop");
    insertLabel(successEnd);
    System.out.println("li $v0, 1");
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

    System.out.println("li $v0, 1"); // both weren't zero, return true
    System.out.println("j " + successEnd + "\nnop");
    insertLabel(failEnd);
    System.out.println("li $v0, 0");
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
    String op = " ";
    switch(ctx.op.getText()){
      case("*"):
        switch(current_type){
          case DOUBLE:
            System.out.println("mul.d $f0, $f0, $f2");
            break;
          case FLOAT:
            System.out.println("mul.s $f0, $f0, $f2");
            break;
          default:
            System.out.println("mul $v0, $t0, $t1");
        }
        break;
      case("/"):
        switch(current_type){
          case DOUBLE:
            System.out.println("div.d $f0, $f0, $f2");
            break;
          case FLOAT:
            System.out.println("div.s $f0, $f0, $f2");
            break;
          case UNSIGNED:
            System.out.println("divu $v0, $t0, $t1");
            break;
          default:
            System.out.println("div $v0, $t0, $t1");
        }
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
    String op = ctx.op.getText().equals("+") ? "add" : "sub";
    switch(current_type){
      case DOUBLE:
        System.out.println(op + ".d $f0, $f0, $f2");
        break;
      case FLOAT:
        System.out.println(op + ".s $f0, $f0, $f2");
        break;
      default:
        System.out.println(op + "u $v0, $t0, $t1");
    }
    return "";
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // Increments
  @Override public String visitIncrPostExpr(CParser.IncrPostExprContext ctx) {
    String id = this.visit(ctx.expr);
    Integer offset = getIDSymbolTable(id).getOffset(); // get variable location
    
    int sign = (ctx.op.getText().equals("--") ? -1 : 1);

    switch(current_type){
      case FLOAT:
        int const_1 = floatBits(sign);
        System.out.println("li $t4, " + const_1 + "\nsw $t4, " + -4*mem + "($sp)\nl.s $f4, " + -4*mem + "($sp)"); // $sp because inside function arguments as well. Maybe offseted at that stage
        System.out.println("add.s $f2, $f0, $f4");
        System.out.println("s.s $f2, " + -4*offset + "($fp)");
        break;
      case DOUBLE:
        const_1 = doubleBits(sign)[1];
        int const_2 = doubleBits(sign)[0];
        System.out.println("li $t4, " + const_1 + "\nsw $t4, " + -4*mem + "($sp)\nl.s $f4, " + -4*mem + "($sp)");
        System.out.println("li $t4, " + const_2 + "\nsw $t4, " + -4*mem + "($sp)\nl.s $f5, " + -4*mem + "($sp)");
        System.out.println("add.d $f2, $f0, $f4");
        System.out.println("s.d $f2, " + -4*(offset+1) + "($fp)");
        break;
      case CHAR:
        System.out.println("addi $t1, $v0, " + sign);
        System.out.println("sb $t1, " + -4*offset + "($fp)");
        break;
      case SHORT:
        System.out.println("addi $t1, $v0, " + sign);
        System.out.println("sh $t1, " + -4*offset + "($fp)");
        break;
      default:
        System.out.println("addi $t1, $v0, " + sign);
        System.out.println("sw $t1, " + -4*offset + "($fp)");
    }
    return id; 
  }

  @Override
  public String visitPreIncUnaryExpr(CParser.PreIncUnaryExprContext ctx) { 
    String id = this.visit(ctx.expr);
    Integer offset = getIDSymbolTable(id).getOffset(); // get variable location
    // 1 = 1065353216 for floating point bits
    // 1 = 1072693248-0 for double bits
    // since immediates are not allowed for floats and doubles, we need to manually create the +/- 1 int $f4 then add it to $f0
    int sign = (ctx.op.getText().equals("--") ? -1 : 1);

    switch(current_type){
      case FLOAT:
        int const_1 = floatBits(sign);
        System.out.println("li $t4, " + const_1 + "\nsw $t4, " + -4*mem + "($sp)\nl.s $f4, " + -4*mem + "($sp)"); // $sp because inside function arguments as well. Maybe offseted at that stage
        System.out.println("add.s $f0, $f0, $f4");
        System.out.println("s.s $f0, " + -4*offset + "($fp)");
        break;
      case DOUBLE:
        const_1 = doubleBits(sign)[1];
        int const_2 = doubleBits(sign)[0];
        System.out.println("li $t4, " + const_1 + "\nsw $t4, " + -4*mem + "($sp)\nl.s $f4, " + -4*mem + "($sp)");
        System.out.println("li $t4, " + const_2 + "\nsw $t4, " + -4*mem + "($sp)\nl.s $f5, " + -4*mem + "($sp)");
        System.out.println("add.d $f0, $f0, $f4");
        System.out.println("s.d $f0, " + -4*(offset+1) + "($fp)");
        break;
      case CHAR:
        System.out.println("addi $v0, $v0, " + sign);
        System.out.println("sb $v0, " + -4*offset + "($fp)");
        break;
      case SHORT:
        System.out.println("addi $v0, $v0, " + sign);
        System.out.println("sh $v0, " + -4*offset + "($fp)");
        break;
      default:
        System.out.println("addi $v0, $v0, " + sign);
        System.out.println("sw $v0, " + -4*offset + "($fp)");
    }

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

    halt = true;
    String a = this.visit(ctx.left); // very ugly, will generate garbage assembly unused. This is because we need to update the current_type
    halt = false;

    String b = this.visit(ctx.right);
    String store = "sw ";
    String load = "lw ";
    // $v0 contains the value of whatever was on the right
    // push right on stack
    
    //for equating structs using memcpy if current_type == null, it's probably a struct on the side
    if(getIDSymbolTable(a) != null && current_type == null && getIDSymbolTable(a).getSTOType() == STOtypes.STRUCT){
      STO varObj1 = getIDSymbolTable(a);
      STO varObj2 = getIDSymbolTable(b);

      System.out.println("addiu   $v0,$fp,"+ 4*(varObj1.getOffset())); 
      System.out.println("addiu   $v1,$fp,"+ 4*(varObj2.getOffset())); 

      //storing $a0-$a2
      int temp_mem = mem;
      System.out.println("sw $a0, " + -4*(mem++) + "($sp)\nsw $a1, " + -4*(mem++) + "($sp)\nsw $a2, " + -4*(mem++) + "($sp)");

      //preparing procedure call in $a0 - $a2
      System.out.println("li $a0,"+varObj1.getSize()); //setting up arguments for procedure call
      System.out.println("move    $a2,$a0");
      System.out.println("move    $a1,$v1");
      System.out.println("move    $a0,$v0");
      System.out.println("jal    memcpy");
      System.out.println("nop");

      //reload values to preserve $a0-$a2
      System.out.println("lw $a0, " + -4*(temp_mem++) + "($sp)\nlw $a1, " + -4*(temp_mem++) + "($sp)\nlw $a2, " + -4*(temp_mem++) + "($sp)");

      return a; //id of the first variable
    } else{

    switch(current_type){
      case FLOAT:
        System.out.println("s.s $f0, " + -4*(mem++) + "($sp)");
        store = "s.s "; 
        load = "l.s "; 
        break;
      case DOUBLE:
        mem++;
        System.out.println("s.d $f0, " + -4*(mem++) + "($sp)"); 
        store = "s.d "; 
        load = "l.d ";
        break;
      case CHAR:
        System.out.println("sb $v0, " + -4*(mem++) + "($sp)"); 
        store = "sb ";
        load = "lb ";  
        break;
      case SHORT:
        System.out.println("sh $v0, " + -4*(mem++) + "($sp)"); 
        store = "sh ";
        load = "lh ";  
        break;
      default:
        System.out.println("sw $v0, " + -4*(mem++) + "($sp)");
    }
    indexes = null;
    String id = this.visit(ctx.left); // a struct or an array or a pointer dereference will return the destination instead in $v1
    int destination = 0;
    if(getIDSymbolTable(id) != null && getIDSymbolTable(id).getSTOType() != STOtypes.STRUCT){
      if(getIDSymbolTable(id).isGlobal())
        System.out.println("lui $v1,%hi(" + id + ")\naddiu $v1, $v1, %lo(" + id + ")");
      else{
        destination = -4*getIDSymbolTable(id).getOffset();
        System.out.println("li $v1, " + destination);
        System.out.println("addu $v1, $fp, $v1");
      }
    }
    String reg = "$v0";
    String temp = "$t2";
    String extraOp = "e ";
    switch(current_type){
      case DOUBLE:
        extraOp = ".d ";
        reg = "$f0";
        temp = "$f2";
        break;
      case FLOAT:
        extraOp = ".s ";
        reg = "$f0";
        temp = "$f2";
        break;
      default:
        break;
    }
    
    System.out.println("mov" + extraOp + temp + ", " + reg); // store current value in $t2 (or temp)
    if(extraOp.equals("e ")) extraOp = " ";
    System.out.println(load + reg + ", " + -4*(--mem) + "($sp)"); // pop right from stack. Ready to evaluate
    if(current_type == types.DOUBLE) mem--;
    switch(ctx.op.getText()){
      case("="):
        break; // do nothing. Store into destination at the end
      case("+="):
        System.out.println("add" + extraOp + reg + ", " + reg + ", " + temp);
        break;
      case("-="):
        System.out.println("sub" + extraOp + reg + ", " + temp + ", " + reg);
        break;
      case("*="):
        System.out.println("mul" + extraOp + reg + ", " + reg + ", " + temp);
        break;
      case("<<="):
        System.out.println("sllv $v0, $v0, $t2");
        break;
      case(">>="):
       System.out.println("srav $v0, $t2, $v0");
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
        System.out.println("div" + extraOp + reg + ", " + temp + ", " + reg);
        break;
      case("%="):
        System.out.println("div $t2, $v0");
        System.out.println("mfhi $v0");
        break;
      default:
        throwIllegalArgument(ctx.op.getText(), "OpAssgnExpr");
    }
    System.out.println(store + reg + ", 0($v1)");

    return id;
    }
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
    System.out.println("li $v0, 0");
    System.out.println("li $t3, 1");
    switch(ctx.op.getText()) {
      case ">":
        switch(current_type){
          case DOUBLE:
            System.out.println("c.lt.d $f2, $f0");
            System.out.println("cfc1 $v0, $25\nandi $v0, 1");
            break;
          case FLOAT:
            System.out.println("c.lt.s $f2, $f0");
            System.out.println("cfc1 $v0, $25\nandi $v0, 1");
            break;
          default:
            if(current_type == types.UNSIGNED) System.out.println("sltu $v0, $t1, $t0");
            else System.out.println("slt $v0, $t1, $t0"); // right < left
        }
        break;
      case "<":
        switch(current_type){
          case DOUBLE:
            System.out.println("c.lt.d $f0, $f2");
            System.out.println("cfc1 $v0, $25\nandi $v0, 1");
            break;
          case FLOAT:
            System.out.println("c.lt.s $f0, $f2");
            System.out.println("cfc1 $v0, $25\nandi $v0, 1");
            break;
          default:
            if(current_type == types.UNSIGNED) System.out.println("sltu $v0, $t0, $t1");
            else System.out.println("slt $v0, $t0, $t1"); // right < left
        }
        break;
      case ">=":
        switch(current_type){
          case DOUBLE:
            System.out.println("c.le.d $f2, $f0");
            System.out.println("cfc1 $v0, $25\nandi $v0, 1");
            break;
          case FLOAT:
            System.out.println("c.le.s $f2, $f0");
            System.out.println("cfc1 $v0, $25\nandi $v0, 1");
            break;
          default:
            if(current_type == types.UNSIGNED) System.out.println("slt $v0, $t0, $t1");
            else System.out.println("slt $v0, $t0, $t1"); // left < right
            System.out.println("xori $v0, $v0, 1"); // !(left < right) = right <= left
        }
        break;
      case "<=": 
        switch(current_type){
          case DOUBLE:
            System.out.println("c.le.d $f0, $f2");
            System.out.println("cfc1 $v0, $25\nandi $v0, 1");
            break;
          case FLOAT:
            System.out.println("c.le.s $f0, $f2");
            System.out.println("cfc1 $v0, $25\nandi $v0, 1");
            break;
          default:
            if(current_type == types.UNSIGNED) System.out.println("slt $v0, $t1, $t0");
            else System.out.println("slt $v0, $t1, $t0"); // right < left
            System.out.println("xori $v0, $v0, 1"); // !(right<left) = right >= left
        }
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
        switch(current_type){
          case DOUBLE:
            System.out.println("c.eq.d $f0, $f2");
            System.out.println("cfc1 $v0, $25\nandi $v0, 1");
            break;
          case FLOAT:
            System.out.println("c.eq.s $f0, $f2");
            System.out.println("cfc1 $v0, $25\nandi $v0, 1");
            break;
          default:
            System.out.println("sltiu $v0, $v0, 1");
        }
        break;
      case "!=":
        switch(current_type){
          case DOUBLE:
            System.out.println("c.eq.d $f0, $f2");
            System.out.println("cfc1 $v0, $25\nandi $v0, 1\nxori $v0, $v0, 1");
            break;
          case FLOAT:
            System.out.println("c.eq.s $f0, $f2");
            System.out.println("cfc1 $v0, $25\nandi $v0, 1\nxori $v0, $v0, 1");
            break;
          default:
            System.out.println("sltu $v0, $zero, $v0");
        }
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
    current_continue_context.add(beginLabel);
    insertLabel(beginLabel);
    this.visit(ctx.cond); // condition is now in $v0
    System.out.println("beq $v0, $zero, " + endLabel + "\nnop");
    this.visit(ctx.exec); // while loop execution body
    System.out.println("j " + beginLabel + "\nnop");
    insertLabel(endLabel);
    current_continue_context.pop();
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
    String updateLabel = makeName("for_stat_update");
    String endLabel = makeName("for_stat_end");
    current_break_context.add(endLabel);
    current_continue_context.add(updateLabel);
    insertLabel(beginLabel);
    
    if(ctx.cond != null){
      this.visit(ctx.cond);
      System.out.println("beq $v0, $zero, " + endLabel + "\nnop"); // skip if condition was not met
    }

    // compiles body from parent
    this.visit(ctx.getParent());

    insertLabel(updateLabel);
    if(ctx.update != null)  this.visit(ctx.update); // increment variable (or whatever update)

    //return to top of loop
    System.out.println("j " + beginLabel + "\nnop");
    insertLabel(endLabel);
    current_continue_context.pop();
    current_break_context.pop();
    return "";
  }

  @Override
  public String visitExpForCond(CParser.ExpForCondContext ctx){ //For loop 2
    //variable init
    if(ctx.init != null) this.visit(ctx.init);

    //for loop
    String beginLabel = makeName("for_stat_begin");
    String updateLabel = makeName("for_stat_update");
    String endLabel = makeName("for_stat_end");
    current_break_context.add(endLabel);
    current_continue_context.add(updateLabel);
    insertLabel(beginLabel);

    if(ctx.cond != null){
      this.visit(ctx.cond);
      System.out.println("beq $v0, $zero, " + endLabel + "\nnop"); // skip if condition was not met
    }

    // compiles body from parent
    this.visit(ctx.getParent());

    insertLabel(updateLabel);
    if(ctx.update != null)  this.visit(ctx.update); // increment variable (or whatever update)

    //return to top of loop
    System.out.println("j " + beginLabel + "\nnop");
    insertLabel(endLabel);
    current_continue_context.pop();
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
    if(current_structdef_object != null){
      System.out.println("id: "+id+"array: "+current_array_object.size);
      current_structdef_object.setMember(id,current_array_object);
    }
    return id;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // Array access OR pointer access
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
    if(halt) return id;
    current_type = types.INT;
    this.visit(ctx.right);
    current_type = getIDSymbolTable(id).getType();
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
      
      // // for array, use the offset directly
      // // for pointer, get address pointed by the pointer
      int offset = getIDSymbolTable(id).getOffset(); // offset of the variable
      if(getIDSymbolTable(id).getDepth() == 0){
        // it's an array, use it's offset
        if(getIDSymbolTable(id).isGlobal()) System.out.println("lui $t0, %hi(" + id +")\naddiu $t0, $t0, %lo(" + id + ")");
        else {
          System.out.println("li $t0, " + -4*offset); // address
          System.out.println("addu $t0, $fp, $t0");
        } 
      }else{
        // it's a pointer, get the variable being pointed to. Address is right now the pointer itself. We want it to be the value of the pointer
        if(getIDSymbolTable(id).isGlobal())System.out.println("lui $v0,%hi(" + id + ")\nlw $v0,%lo(" + id + ")($v0)");
        else System.out.println("lw $v0, " + -4*offset + "($fp)");
        System.out.println("addu $t0, $v0, $zero"); // put the value of the pointer (which is the address of interest) in t0
      }
      switch(current_type){
        case DOUBLE:
          System.out.println("li $t1, 8");
          break;
        case CHAR:
          System.out.println("li $t1, 1");
          break;
        default:
          System.out.println("li $t1, 4");
      }
      System.out.println("nop\nmult $t1, $t2");
      System.out.println("mflo $t2"); // index = 4 * index GCC policy (or 8 for doubles, 1 for chars)
      System.out.println("addu $t2, $t2, $t0"); // index = (address + index);
      // load in $v0 or $f0
      switch(getIDSymbolTable(id).getType()){
        case CHAR:{
          System.out.println("lb $v0, 0($t2)");
          break;
        }
        case SHORT:{
          System.out.println("lh $v0, 0($t2)");
          break;
        }
        case FLOAT:{
          System.out.println("l.s $f0, 0($t2)");
          break;
        }
        case DOUBLE:{
          System.out.println("l.d $f0, 0($t2)");
          break;
        }
        default:
          System.out.println("lw $v0, 0($t2)");
          break;
      }
      // indexes = null; // clean indexing for next array
      index_position = -1;
      // put destination in $v1
      System.out.println("addu $v1, $t2, $zero");
      return "123";
    }
    return id;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // Enum

  //E.g. enum point{x = 1, y, z = 4}
  @Override
  public String visitDecEnumSpec(CParser.DecEnumSpecContext ctx){
    enum_state = 0;
    // String enumID = ctx.id.getText(); unused and optional
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
    System.out.println("li $v0, " + enumVal_s);
    getIDSymbolTable(enumConstId).initialize(interpret(enumVal_s));

    enum_state++;
    
    return "";
  }

  //e.g. {x = 0;}
  public String visitAssgnEnum(CParser.AssgnEnumContext ctx){

    String enumConstId = this.visit(ctx.enume);
    // this.visit(ctx.expr); // will put the value in $v0
    String enumVal_s = interpret(ctx.expr.getText()); // get the numerical value
    Integer enumVal = Integer.parseInt(enumVal_s);
    if(!isGlobalScope())System.out.println("li $v0, " + enumVal);

    enum_state = enumVal+1; //reset enum to previous value

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

    String id = this.visit(ctx.expr);

    STO var = getIDSymbolTable(id);
    if(var.getSTOType() == STOtypes.STRUCT){
      System.out.println("li $v0, " + var.getSize());
    }else{
      types t = var.getType();
      int size = typeSize(t);
      String ret_size = Integer.toString(size);
      System.out.println("li $v0, " + ret_size);
    }

    return "";
  }

  // int a = sizeof(int);

  //sizeof(int)
  @Override
  public String visitSizeTypeUnaryExpe(CParser.SizeTypeUnaryExpeContext ctx){

    String size_type = ctx.type.getText();
    String[] arr = size_type.substring(0, size_type.length()).split("\\["); //separate square brackets from type

    types t = parseType(arr[0]);
    int size = typeSize(t);

    for(int i = 1; (arr.length>1)&&(i<arr.length);i++){   //for each value inside square bracket
      arr[i] = arr[i].substring(0,arr[i].length()-1);
      size *= Integer.parseInt(arr[i]);
    }

    String ret_size = Integer.toString(size);
    System.out.println("li $v0, " + ret_size);

    return ret_size;
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // Typedef

  //picks up "typedef" in typedef int a;
  @Override
  public String visitTypeDefStorageClassSpec(CParser.TypeDefStorageClassSpecContext ctx){
    //Add new typedef entry to typedefTable.
    String keyword = ctx.type.getText();

    if(keyword.equals("typedef")){
      STO typedefObj = new Typedef("", isGlobalScope(), current_type);   //ID and type will be overwritten later on
      current_typedef_object = typedefObj;
    }
    
    if(keyword.equals("extern")){
      extern = true;
    }

    return "";
  }

  //picks up typedef string i.e. the "CHARACTER" in CHARACTER c = 'a';
  @Override
  public String visitTypeDefSpec(CParser.TypeDefSpecContext ctx){
    return ctx.type.getText();
  }

  ////////////////////////////////////////////////////////////////////////////////////
  // main class. create a tree and call a listener on the tree
  public static void main(String[] args) throws Exception {
    // create a CharStream that reads from standard input
    ANTLRInputStream input = new ANTLRInputStream(System.in); // create a lexer that feeds off of input CharStream
    CLexer lexer = new CLexer(input); // create a buffer of tokens pulled from the lexer
    CommonTokenStream tokens = new CommonTokenStream(lexer); // create a parser that feeds off the tokens buffer
    System.err.println("\n\n\n--------------------------------");
    System.err.println("=======     Compiling    =======");
    System.err.println("--------------------------------");
    CParser parser = new CParser(tokens);
    ParseTree tree = parser.compilationUnit(); // begin parsing at init rule
    boolean debug = false;
    if(args.length > 0){
      if(args[0].equals("-debug"))debug = true;
    }
    CCompiler compiler = new CCompiler(debug);
    compiler.visit(tree);
    System.err.println("\n\n\nSymbol table (should have one entry of global declarations): " + compiler.symbolTable);
    System.err.println("Final mem: "+compiler.mem);
    for(Map.Entry<String, STO> e: compiler.symbolTable.pop().entrySet()){
      e.getValue().print();
    }
    System.err.println("\n\n\n--------------------------------");
    System.err.println("=======       Done       =======");
    System.err.println("--------------------------------");
  }

}
