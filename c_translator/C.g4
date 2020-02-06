grammar C;
import CLex;

translation_unit
	: declaration
	|	function_definition
	| translation_unit (declaration|function_definition)
	;

function_definition
	: type_specifier fun_declarator compound_statement
	;

type_specifier
	: VOID
	| INT
	;

fun_declarator
	: IDENTIFIER '(' parameter_list ')'
	| IDENTIFIER '(' ')'
	;

parameter_list
	: parameter_declaration
	| parameter_list ',' parameter_declaration
	;

parameter_declaration
	: type_specifier declarator
	;

declarator
	: IDENTIFIER
	| declarator '[' constant_expression ']'
	;

constant_expression
        : INT_CONSTANT
        ;

compound_statement
	: OP_CR CL_CR
	| OP_CR statement_list CL_CR
        | OP_CR declaration_list statement_list CL_CR
	;

statement_list
	: statement
	| statement_list statement
	;

statement
	: compound_statement
	| selection_statement
	| iteration_statement
	| assignment_statement
	| RETURN expression ';'
	;

assignment_statement
	: ';'
	|  l_expression ASS_OP expression ';'
	;

expression
	: logical_and_expression
	| expression OR_OP logical_and_expression
	;

logical_and_expression
	: equality_expression
	| logical_and_expression AND_OP equality_expression
	;

equality_expression
	: relational_expression
	| equality_expression EQ_OP relational_expression
	| equality_expression NE_OP relational_expression
	;
relational_expression
	: additive_expression
	| relational_expression LT_OP additive_expression
	| relational_expression GL_OP additive_expression
	| relational_expression LE_OP additive_expression
	| relational_expression GE_OP additive_expression
	;

additive_expression
	: multiplicative_expression
	| additive_expression ADD_OP multiplicative_expression
	| additive_expression SUB_OP multiplicative_expression
	;

multiplicative_expression
	: unary_expression
	| multiplicative_expression MUL_OP unary_expression
	| multiplicative_expression	DIV_OP unary_expression
	;
unary_expression
	: postfix_expression
	| unary_operator postfix_expression
	;

postfix_expression
	: primary_expression
	| IDENTIFIER '(' ')'
	| IDENTIFIER '(' expression_list ')'
	| l_expression INC_OP
	;

primary_expression
	: l_expression
	| INT_CONSTANT
  | STRING_LITERAL
	| '(' expression ')'
	;

l_expression
	: IDENTIFIER
	| l_expression '[' expression ']' 
	;
expression_list
	: expression
	| expression_list ',' expression
	;

unary_operator
	: SUB_OP
	| NOT_OP
	;

selection_statement
	: IF '(' expression ')' statement (ELSE statement)?
	;

iteration_statement
	: WHILE '(' expression ')' statement
	;

declaration_list
	: declaration
	| declaration_list declaration
	;

declaration
	: type_specifier declarator_list';'
	|	type_specifier	assignment_statement
	;

declarator_list
	: declarator
	| declarator_list ',' declarator
	;
