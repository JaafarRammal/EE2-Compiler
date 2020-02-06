grammar C;

prog	:	block+;

block	:	(('int'|'void') ID '('prms?')')?'{'	stmt*	'}';

prms	:	'int' ID
			|	('int' ID ',')+ 'int' ID
			;

stmt	:	expr ';'	// expression
			|	'if'	'('expr')'	(stmt|block)	('else'(stmt|block))?	// if/else syntax
			|	'while'	'('expr')'	(stmt|block)	// while syntax
			|	'return' expr? ';'
			;

expr	: 'int' ID ('='(expr|term))?
			|	expr	('*'|'+'|'-'|'<'|'==') term
			| expr	('&&'|'||') expr // required aside so that < and == are executed first
			|	ID	'('expr?')'
			|	ID	'('(expr',')+expr')'
			| term
			;

term	:	INT
			| ID
			;

INT	:	[0-9]+	;	// decimal integer constant
ID	:	[a-zA-Z]+[0-9a-zA-Z]*	;	// identifier
WS	: [ \t]+ -> skip ;	// skip whitespaces
NL	:	'\r'? '\n' -> skip ;	// skip new lines