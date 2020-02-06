grammar C;

prog	:	block+;

block	:	(('int'|'void') ID '('prms?')')?'{'	stmt*	'}'
			|	 decl
			;

prms	:	'int' ID
			|	('int' ID ',')+ 'int' ID
			;

stmt	:	expr ';'	// expression
			|	'if'	'('expr')'	(stmt|block)	('else'(stmt|block))?	// if/else syntax
			|	'while'	'('expr')'	(stmt|block)	// while syntax
			|	'return' expr? ';'
			;

expr	: decl
			| asgn
			|	expr '*'	expr
			|	expr	('+'|'-'|'<'|'==') expr
			| expr	('&&'|'||') expr
			|	ID	'('expr?')'
			|	ID	'('(expr',')+expr')'
			| ('+'|'-')?term
			|	'(' expr ')'
			;

decl	:	'int' ID ('='(expr|term))?	;

asgn	:	ID ('='(expr|term));

term	:	INT
			| ID
			;

INT	:	[0-9]+	;	// decimal integer constant
ID	:	[a-zA-Z_]+[0-9a-zA-Z_]*	;	// identifier
WS	: [ \t]+ -> skip ;	// skip whitespaces
NL	:	'\r'? '\n' -> skip ;	// skip new lines