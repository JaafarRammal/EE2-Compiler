lexer grammar CLex;

WHITESPACES: [\t\n\r ];

/* keywords */
VOID: 'void';
INT:  'int';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
WHILE:  'while';

/* identifiers */
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

/* contants */
INT_CONSTANT: ([1-9][0-9]*)|('0'[bB][01]*)|('0'[xX][0-9a-fA-F]*)|('0'[0-7]*);
STRING_LITERAL: '"(\\.|[^"\\])*"';


/* Operators */
NOT_OP: '!';
ADD_OP: '+';
SUB_OP: '-';
MUL_OP: '*';
DIV_OP: '/';
LT_OP:  '<';
GL_OP:  '>';
LE_OP:  '<=';
GE_OP:  '>=';
EQ_OP:  '==';
NE_OP:  '!=';
AND_OP: '&&';
OR_OP:  '||';
INC_OP: '++';

//others
OTHERS: '('|')'|'['|']'|';'|','|'{'|'}';