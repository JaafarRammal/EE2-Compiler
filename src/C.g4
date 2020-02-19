grammar C;
import CLex;

translation_unit
	: declaration	#tuDecl
	|	function_definition	#tu_funcDef
	| tu=translation_unit (decl=declaration|func_def=function_definition)	#multDef
	;

function_definition
	: type=type_specifier func_dec=fun_declarator comp_stat=compound_statement
	;

type_specifier
	: type=VOID
	| type=INT
	;

fun_declarator
	: id=IDENTIFIER '(' params=parameter_list ')'	#funcDeclParam
	| id=IDENTIFIER '(' ')'												#funcDecl
	;

parameter_list
	: param=parameter_declaration															#singleParam
	| params=parameter_list ',' param=parameter_declaration		#multParam
	;

parameter_declaration
	: type=type_specifier decl=declarator
	;

declarator
	: id=IDENTIFIER																						#declId
	| decl=declarator '[' const_expr=constant_expression ']'	#declBrackets
	;

constant_expression
	: INT_CONSTANT
	;

compound_statement
	: OP_CR CL_CR												#cmpStatementEmpty
	| OP_CR stat_l=statement_list CL_CR	#cmpStatementNonEmpty
	;

statement_list
	: stat=statement																#singleStatement
	| decl_l=declaration_list												#singleDeclarationList
	| stat_l=statement_list stat=statement					#multipleStatments
	| stat_l=statement_list decl_l=declaration_list	#multipleStatmentsDeclarationList
	;

statement
	: stmt=compound_statement											#compoundStatement
	| stmt=selection_statement										#selectionStatement
	| stmt=iteration_statement										#iterationStatement
	| stmt=assignment_statement	 ';'   						#assignmentStatement
	|	stmt=expression	';'													#exprStatement
	|	stmt=l_expression	';'												#lexprStatement
	| RETURN expr=expression? ';'									#returnStatement
	;

assignment_statement
	:	left=l_expression ASS_OP right=expression	#assgnOp
	;

expression
	: expr=logical_and_expression														#logicalExpr
	| left=expression op=OR_OP right=logical_and_expression	#orOp
	;

logical_and_expression
	: expr=equality_expression																				#equalityExpr
	| left=logical_and_expression op=AND_OP right=equality_expression	#andOp
	;

equality_expression
	: expr=relational_expression																		#relExpr
	| left=equality_expression op=EQ_OP right=relational_expression	#eqOp		
	| left=equality_expression op=NE_OP right=relational_expression	#neqOp
	;
relational_expression
	: expr=additive_expression																			#additiveExpr
	| left=relational_expression op=LT_OP right=additive_expression	#ltOp
	| left=relational_expression op=GL_OP right=additive_expression	#glOp
	| left=relational_expression op=LE_OP right=additive_expression	#leOp
	| left=relational_expression op=GE_OP right=additive_expression	#geOp
	;

additive_expression
	: expr=multiplicative_expression																			#multiplicativeExpr
	| left=additive_expression op=ADD_OP right=multiplicative_expression	#addOp
	| left=additive_expression op=SUB_OP right=multiplicative_expression	#subOp
	;

multiplicative_expression
	: expr=unary_expression																							#unaryExpr
	| left=multiplicative_expression	op=MUL_OP	right=unary_expression	#multOp
	| left=multiplicative_expression	op=DIV_OP	right=unary_expression	#divOp
	;
unary_expression
	: expr=postfix_expression										#postfixExpr
	| op=unary_operator expr=postfix_expression	#unaryOp
	;

postfix_expression
	: expr=primary_expression											#primExpr
	| id=IDENTIFIER '(' ')'												#functionCall
	| id=IDENTIFIER '(' expr_l=expression_list ')'#functionCallParam
	| left=l_expression op=INC_OP									#incrOp
	;

primary_expression
	: expr=l_expression				#lExpr
	| val=INT_CONSTANT				#intConst
  | val=STRING_LITERAL			#stringLit
	| '(' expr=expression ')'	#parentheses
	;

l_expression
	: id=IDENTIFIER																#exprId
	| left=l_expression '[' right=expression ']' 	#exprBrackets
	;
expression_list
	: expr=expression															#singleExpr
	| expr_l=expression_list ',' expr=expression	#multipleExpr
	;

unary_operator
	: op=SUB_OP
	| op=NOT_OP
	;

selection_statement
	: IF '(' condition=expression ')' true_exec=statement (false_exec=else_statement)?	#ifStat
	;

else_statement
	:	ELSE false_exec=statement	#elseStat
	;

iteration_statement
	: WHILE '(' condition=expression ')' true_exec=statement	#whileStat
	;

declaration_list
	: decl=declaration									#singleDecl
	| declaration_list decl=declaration	#multipleDecl
	;

declaration
	: type=type_specifier decl_l=declarator_list	';'     #decl
	|	type=type_specifier	assgn=assignment_statement ';'	#assgn
	;

declarator_list
	: decl=declarator															#singleDeclarator
	| decl_l=declarator_list ',' decl=declarator	#multipleDeclarator
	;

/*

TO BE ADDED / ANY BUGS NOTICED:

- Add support for nested function definitions:

int main(){
	void a(){}	// this is not being parsed
	a();
}

UPDATE: THIS IS NOT A THING haha


- problem with declaration outside a scope (rest is not parsed)

 */