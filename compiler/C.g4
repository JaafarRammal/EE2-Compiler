grammar C;

primaryExpression
    :   id=Identifier                                                           #idPrimaryExpr
    |   val=Constant                                                            #intConstPrimaryExpr
    |   val=StringLiteral+                                                      #strLitPrimaryExpr
    |   '(' expr=expression ')'                                                 #ParExprPrimaryExpr
    |   genSelec=genericSelection                                               #GSelectPrimaryExpr
    |   '__extension__'? '(' cmpStat=compoundStatement ')'                      #cmpStatPrimaryExpr // Blocks (GCC extension)
    |   '__builtin_va_arg' '(' expr=unaryExpression ',' type=typeName ')'       #vaArgPrimaryExpr
    |   '__builtin_offsetof' '(' type=typeName ',' expr=unaryExpression ')'     #offsetPrimaryExpr
    ;

genericSelection
    :   '_Generic' '(' assgnExpr=assignmentExpression ',' genAssL=genericAssocList ')'
    ;

genericAssocList
    :   genAss=genericAssociation                               #singleGenAssList
    |   genAss=genericAssocList ',' genAssL=genericAssociation  #multGenAssList
    ;

genericAssociation
    :   type=typeName ':' expr=assignmentExpression    #typeGenAss
    |   'default' ':' expr=assignmentExpression        #defaultGenAss
    ;

postfixExpression
    :   expr=primaryExpression                                                  #primPostExpr
    |   left=postfixExpression '[' right=expression ']'                         #arrPostExpr
    |   expr=postfixExpression '(' args=argumentExpressionList? ')'             #funcInvocPostExpr
    |   expr=postfixExpression '.' id=Identifier                                #funcCallPostExpr
    |   expr=postfixExpression '->' id=Identifier                               #funcCallPtrPostExpr
    |   expr=postfixExpression '++'                                             #incrPostExpr
    |   expr=postfixExpression '--'                                             #decrPostExpr
    |   '(' type=typeName ')' '{' inits=initializerList '}'                     #singleCastPostExpr
    |   '(' type=typeName ')' '{' inits=initializerList ',' '}'                 #multCastPostExpr
    |   '__extension__' '(' type=typeName ')' '{' inits=initializerList '}'     #singleExtPostExpr
    |   '__extension__' '(' type=typeName ')' '{' inits=initializerList ',' '}' #multExtPostExpr
    ;

argumentExpressionList
    :   expr=assignmentExpression                                   #singleArgExprList
    |   args=argumentExpressionList ',' expr=assignmentExpression   #multArgExprList
    ;

unaryExpression
    :   expr=postfixExpression                                  #postUnaryExpr
    |   '++' expr=unaryExpression                               #preIncUnaryExpr
    |   '--' expr=unaryExpression                               #preDecUnaryExpr
    |   left=unaryOperator right=castExpression                 #castUnaryExpr
    |   'sizeof' expr=unaryExpression                           #sizeExprUnaryExpr
    |   'sizeof' '(' type=typeName ')'                          #sizeTypeUnaryExpe
    |   '_Alignof' '(' type=typeName ')'                        #alignUnaryExpr
    |   '&&' id=Identifier                                      #idUnaryExpr        // GCC extension address of label    
    ;

unaryOperator
    // :   op=('&' | '*' | '+' | '-' | '~' | '!')
    :   op=( And | Star | Plus | Minus | Tilde | Not )
    ;

castExpression
    :   '(' type=typeName ')' expr=castExpression                   #typeCastExpr
    |   '__extension__' '(' type=typeName ')' expr=castExpression   #extensionCastExpr
    |   expr=unaryExpression                                        #unaryCastExpr
    |   seq=DigitSequence                                           #digitSeqCastExpr   // for
    ;

multiplicativeExpression
    :   expr=castExpression                                                 #termMultExpr
    // |   left=multiplicativeExpression '*' right=castExpression  #multOpMultExpr
    // |   left=multiplicativeExpression '/' right=castExpression  #divOpMultExpr
    // |   left=multiplicativeExpression '%' right=castExpression  #modOpMultExpr
    |   left=multiplicativeExpression op=(Star|Div|Mod) right=castExpression #opMultExpr    // aka ( * | / | % )
    ;

additiveExpression
    :   expr=multiplicativeExpression                                           #termAddExpr
    // |   left=additiveExpression '+' right=multiplicativeExpression       #addAddExpr
    // |   left=additiveExpression '-' right=multiplicativeExpression       #subAddExpr
    |   left=additiveExpression op=(Plus|Minus) right=multiplicativeExpression  #opAddExpr  // aka ( + | - )
    ;

shiftExpression
    :   expr=additiveExpression                                                 #termShiftExpr
    // |   shiftExpression '<<' additiveExpression                             #leftShiftExpr
    // |   shiftExpression '>>' additiveExpression                             #rightShiftExpr
    |   left=shiftExpression op=(LeftShift|RightShift) right=additiveExpression    #opShiftExpr  // aka ( << | >> )
    ;

relationalExpression
    :   expr=shiftExpression                                                                        #termRelExpr
    // |   left=relationalExpression '<' right=shiftExpression                                       #ltRelExpr
    // |   left=relationalExpression '>' right=shiftExpression                                       #gtRelExpr
    // |   left=relationalExpression '<=' right=shiftExpression                                      #lteRelExpr
    // |   left=relationalExpression '>=' right=shiftExpression                                      #gteRelExpr
    |   left=relationalExpression op=(Less|Greater|LessEqual|GreaterEqual) right=shiftExpression    #opRelExpr   // aka ('<'|'>'|'<='|'>=')
    ;

equalityExpression
    :   expr=relationalExpression                                           #termEqualExpr
    // |   left=equalityExpression '==' right=relationalExpression             #eqEqualExpr
    // |   left=equalityExpression '!=' right=relationalExpression             #neqEqualExpr
    |   left=equalityExpression op=(NotEqual|Equal) right=relationalExpression   #opEqualExpr
    ;

andExpression
    :   expr=equalityExpression                         #termAndExpr
    |   left=andExpression '&' right=equalityExpression #opAndExpr
    ;

exclusiveOrExpression
    :   expr=andExpression									#termExcOrExpr
    |   left=exclusiveOrExpression '^' right=andExpression  #opExcOrExpr
    ;

inclusiveOrExpression
    :   expr=exclusiveOrExpression									#termIncOrExpr
    |   left=inclusiveOrExpression '|' right=exclusiveOrExpression  #opIncOrExpr
    ;

logicalAndExpression
    :   expr=inclusiveOrExpression									#termLogAndExpr
    |   left=logicalAndExpression '&&' right=inclusiveOrExpression  #opLogAndExpr
    ;

logicalOrExpression
    :   expr=logicalAndExpression									#termLogOrExpr
    |   left=logicalOrExpression '||' right=logicalAndExpression    #opLogOrExpr
    ;

conditionalExpression
    :   cond=logicalOrExpression ('?' true_exec=expression ':' false_exec=conditionalExpression)?
    ;

assignmentExpression
    :   expr=conditionalExpression                                              #AssgnExpr
    |   left=unaryExpression op=assignmentOperator right=assignmentExpression   #AssgnExpr
    |   expr=DigitSequence                                                      #digitSeqAssgnExpr   // for               
    ;

assignmentOperator
    // :   '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
    :   Assign | StarAssign | DivAssign | ModAssign | PlusAssign | MinusAssign | LeftShiftAssign | RightShiftAssign | AndAssign | XorAssign | OrAssign
    ;

expression
    :   expr=assignmentExpression                       #singleExpr
    |   left=expression ',' right=assignmentExpression  #multExpr
    ;

constantExpression
    :   expr=conditionalExpression
    ;

declaration
    :   declarationSpecifiers initDeclaratorList ';'
	| 	declarationSpecifiers ';'
    |   staticAssertDeclaration
    ;

declarationSpecifiers
    :   declarationSpecifier+
    ;

declarationSpecifiers2
    :   declarationSpecifier+
    ;

declarationSpecifier
    :   storageClassSpecifier
    |   typeSpecifier
    |   typeQualifier
    |   functionSpecifier
    |   alignmentSpecifier
    ;

initDeclaratorList
    :   initDeclarator
    |   initDeclaratorList ',' initDeclarator
    ;

initDeclarator
    :   declarator
    |   declarator '=' initializer
    ;

storageClassSpecifier
    :   'typedef'
    |   'extern'
    |   'static'
    |   '_Thread_local'
    |   'auto'
    |   'register'
    ;

typeSpecifier
    :   type=('void'
    |   'char'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    |   'signed'
    |   'unsigned'
    |   '_Bool'
    |   '_Complex'
    |   '__m128'
    |   '__m128d'
    |   '__m128i')                                                      #baseTypeSpec
    |   '__extension__' '(' ('__m128' | '__m128d' | '__m128i') ')'      #extensionTypeSpec
    |   type=atomicTypeSpecifier                                        #atomicTypeSpec
    |   type=structOrUnionSpecifier                                     #structTypeSpec
    |   type=enumSpecifier                                              #enumTypeSpec
    |   type=typedefName                                                #typeDefSpec
    |   type='__typeof__' '(' constantExpression ')'                    #typeOfSpec // GCC extension
    |   type=typeSpecifier ptr=pointer                                  #typePointerSpec
    ;

structOrUnionSpecifier
    :   structOrUnion Identifier? '{' structDeclarationList '}'
    |   structOrUnion Identifier
    ;

structOrUnion
    :   'struct'
    |   'union'
    ;

structDeclarationList
    :   structDeclaration
    |   structDeclarationList structDeclaration
    ;

structDeclaration
    :   specifierQualifierList structDeclaratorList? ';'
    |   staticAssertDeclaration
    ;

specifierQualifierList
    :   typeSpecifier specifierQualifierList?
    |   typeQualifier specifierQualifierList?
    ;

structDeclaratorList
    :   structDeclarator
    |   structDeclaratorList ',' structDeclarator
    ;

structDeclarator
    :   declarator
    |   declarator? ':' constantExpression
    ;

enumSpecifier
    :   'enum' Identifier? '{' enumeratorList '}'
    |   'enum' Identifier? '{' enumeratorList ',' '}'
    |   'enum' Identifier
    ;

enumeratorList
    :   enumerator
    |   enumeratorList ',' enumerator
    ;

enumerator
    :   enumerationConstant
    |   enumerationConstant '=' constantExpression
    ;

enumerationConstant
    :   Identifier
    ;

atomicTypeSpecifier
    :   '_Atomic' '(' typeName ')'
    ;

typeQualifier
    :   'const'
    |   'restrict'
    |   'volatile'
    |   '_Atomic'
    ;

functionSpecifier
    :   ('inline'
    |   '_Noreturn'
    |   '__inline__' // GCC extension
    |   '__stdcall')
    |   gccAttributeSpecifier
    |   '__declspec' '(' Identifier ')'
    ;

alignmentSpecifier
    :   '_Alignas' '(' typeName ')'
    |   '_Alignas' '(' constantExpression ')'
    ;

declarator
    :   pointer? directDeclarator gccDeclaratorExtension*
    ;

directDeclarator
    :   Identifier
    |   '(' declarator ')'
    |   directDeclarator '[' typeQualifierList? assignmentExpression? ']'
    |   directDeclarator '[' 'static' typeQualifierList? assignmentExpression ']'
    |   directDeclarator '[' typeQualifierList 'static' assignmentExpression ']'
    |   directDeclarator '[' typeQualifierList? '*' ']'
    |   directDeclarator '(' parameterTypeList ')'
    |   directDeclarator '(' identifierList? ')'
    |   Identifier ':' DigitSequence  // bit field
    |   '(' typeSpecifier? pointer directDeclarator ')' // function pointer like: (__cdecl *f)
    ;

gccDeclaratorExtension
    :   '__asm' '(' StringLiteral+ ')'
    |   gccAttributeSpecifier
    ;

gccAttributeSpecifier
    :   '__attribute__' '(' '(' gccAttributeList ')' ')'
    ;

gccAttributeList
    :   gccAttribute (',' gccAttribute)*
    |   // empty
    ;

gccAttribute
    :   ~(',' | '(' | ')') // relaxed def for "identifier or reserved word"
        ('(' argumentExpressionList? ')')?
    |   // empty
    ;

nestedParenthesesBlock
    :   (   ~('(' | ')')
        |   '(' nestedParenthesesBlock ')'
        )*
    ;

pointer
    :   '*' typeQualifierList?
    |   '*' typeQualifierList? pointer
    |   '^' typeQualifierList? // Blocks language extension
    |   '^' typeQualifierList? pointer // Blocks language extension
    ;

typeQualifierList
    :   typeQualifier
    |   typeQualifierList typeQualifier
    ;

parameterTypeList
    :   parameterList
    |   parameterList ',' '...'
    ;

parameterList
    :   parameterDeclaration
    |   parameterList ',' parameterDeclaration
    ;

parameterDeclaration
    :   declarationSpecifiers declarator
    |   declarationSpecifiers2 abstractDeclarator?
    ;

identifierList
    :   Identifier
    |   identifierList ',' Identifier
    ;

typeName
    :   specifierQualifierList abstractDeclarator?
    ;

abstractDeclarator
    :   pointer
    |   pointer? directAbstractDeclarator gccDeclaratorExtension*
    ;

directAbstractDeclarator
    :   '(' abstractDeclarator ')' gccDeclaratorExtension*
    |   '[' typeQualifierList? assignmentExpression? ']'
    |   '[' 'static' typeQualifierList? assignmentExpression ']'
    |   '[' typeQualifierList 'static' assignmentExpression ']'
    |   '[' '*' ']'
    |   '(' parameterTypeList? ')' gccDeclaratorExtension*
    |   directAbstractDeclarator '[' typeQualifierList? assignmentExpression? ']'
    |   directAbstractDeclarator '[' 'static' typeQualifierList? assignmentExpression ']'
    |   directAbstractDeclarator '[' typeQualifierList 'static' assignmentExpression ']'
    |   directAbstractDeclarator '[' '*' ']'
    |   directAbstractDeclarator '(' parameterTypeList? ')' gccDeclaratorExtension*
    ;

typedefName
    :   Identifier
    ;

initializer
    :   assignmentExpression
    |   '{' initializerList '}'
    |   '{' initializerList ',' '}'
    ;

initializerList
    :   designation? initializer
    |   initializerList ',' designation? initializer
    ;

designation
    :   designatorList '='
    ;

designatorList
    :   designator
    |   designatorList designator
    ;

designator
    :   '[' constantExpression ']'
    |   '.' Identifier
    ;

staticAssertDeclaration
    :   '_Static_assert' '(' constantExpression ',' StringLiteral+ ')' ';'
    ;

statement
    :   labeledStatement
    |   compoundStatement
    |   expressionStatement
    |   selectionStatement
    |   iterationStatement
    |   jumpStatement
    |   ('__asm' | '__asm__') ('volatile' | '__volatile__') '(' (logicalOrExpression (',' logicalOrExpression)*)? (':' (logicalOrExpression (',' logicalOrExpression)*)?)* ')' ';'
    ;

labeledStatement
    :   Identifier ':' statement
    |   'case' constantExpression ':' statement
    |   'default' ':' statement
    ;

compoundStatement
    :   '{' blockItemList? '}'
    ;

blockItemList
    :   blockItem
    |   blockItemList blockItem
    ;

blockItem
    :   statement
    |   declaration
    ;

expressionStatement
    :   expression? ';'
    ;

selectionStatement
    :   'if' '(' expression ')' statement ('else' statement)?
    |   'switch' '(' expression ')' statement
    ;

iterationStatement
    :   While '(' expression ')' statement
    |   Do statement While '(' expression ')' ';'
    |   For '(' forCondition ')' statement
    ;

//    |   'for' '(' expression? ';' expression?  ';' forUpdate? ')' statement
//    |   For '(' declaration  expression? ';' expression? ')' statement

forCondition
	:   forDeclaration ';' forExpression? ';' forExpression?
	|   expression? ';' forExpression? ';' forExpression?
	;

forDeclaration
    :   declarationSpecifiers initDeclaratorList
	| 	declarationSpecifiers
    ;

forExpression
    :   assignmentExpression
    |   forExpression ',' assignmentExpression
    ;

jumpStatement
    :   'goto' Identifier ';'
    |   'continue' ';'
    |   'break' ';'
    |   'return' expression? ';'
    |   'goto' unaryExpression ';' // GCC extension
    ;

compilationUnit
    :   translationUnit? EOF
    ;

translationUnit
    :   externalDeclaration
    |   translationUnit externalDeclaration
    ;

externalDeclaration
    :   functionDefinition
    |   declaration
    |   ';' // stray ;
    ;

// i think decl_list is unused because we don't have this form to implement
functionDefinition
    :   spec=declarationSpecifiers? func_dec=declarator dec_list=declarationList? comp_stat=compoundStatement
    ;

declarationList
    :   dec=declaration                             #singleDecList
    |   dec_list=declarationList dec=declaration    #MultDecList
    ;


//////////////////////////////
///////     LEXER      /////// 
//////////////////////////////

Auto : 'auto';
Break : 'break';
Case : 'case';
Char : 'char';
Const : 'const';
Continue : 'continue';
Default : 'default';
Do : 'do';
Double : 'double';
Else : 'else';
Enum : 'enum';
Extern : 'extern';
Float : 'float';
For : 'for';
Goto : 'goto';
If : 'if';
Inline : 'inline';
Int : 'int';
Long : 'long';
Register : 'register';
Restrict : 'restrict';
Return : 'return';
Short : 'short';
Signed : 'signed';
Sizeof : 'sizeof';
Static : 'static';
Struct : 'struct';
Switch : 'switch';
Typedef : 'typedef';
Union : 'union';
Unsigned : 'unsigned';
Void : 'void';
Volatile : 'volatile';
While : 'while';

Alignas : '_Alignas';
Alignof : '_Alignof';
Atomic : '_Atomic';
Bool : '_Bool';
Complex : '_Complex';
Generic : '_Generic';
Imaginary : '_Imaginary';
Noreturn : '_Noreturn';
StaticAssert : '_Static_assert';
ThreadLocal : '_Thread_local';

LeftParen : '(';
RightParen : ')';
LeftBracket : '[';
RightBracket : ']';
LeftBrace : '{';
RightBrace : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
LeftShift : '<<';
RightShift : '>>';

Plus : '+';
PlusPlus : '++';
Minus : '-';
MinusMinus : '--';
Star : '*';
Div : '/';
Mod : '%';

And : '&';
Or : '|';
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Not : '!';
Tilde : '~';

Question : '?';
Colon : ':';
Semi : ';';
Comma : ',';

Assign : '=';
// '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|='
StarAssign : '*=';
DivAssign : '/=';
ModAssign : '%=';
PlusAssign : '+=';
MinusAssign : '-=';
LeftShiftAssign : '<<=';
RightShiftAssign : '>>=';
AndAssign : '&=';
XorAssign : '^=';
OrAssign : '|=';

Equal : '==';
NotEqual : '!=';

Arrow : '->';
Dot : '.';
Ellipsis : '...';

Identifier
    :   IdentifierNondigit
        (   IdentifierNondigit
        |   Digit
        )*
    ;

fragment
IdentifierNondigit
    :   Nondigit
    |   UniversalCharacterName
    //|   // other implementation-defined characters...
    ;

fragment
Nondigit
    :   [a-zA-Z_]
    ;

fragment
Digit
    :   [0-9]
    ;

fragment
UniversalCharacterName
    :   '\\u' HexQuad
    |   '\\U' HexQuad HexQuad
    ;

fragment
HexQuad
    :   HexadecimalDigit HexadecimalDigit HexadecimalDigit HexadecimalDigit
    ;

Constant
    :   IntegerConstant
    |   FloatingConstant
    //|   EnumerationConstant
    |   CharacterConstant
    ;

fragment
IntegerConstant
    :   DecimalConstant IntegerSuffix?
    |   OctalConstant IntegerSuffix?
    |   HexadecimalConstant IntegerSuffix?
    |	BinaryConstant
    ;

fragment
BinaryConstant
	:	'0' [bB] [0-1]+
	;

fragment
DecimalConstant
    :   NonzeroDigit Digit*
    ;

fragment
OctalConstant
    :   '0' OctalDigit*
    ;

fragment
HexadecimalConstant
    :   HexadecimalPrefix HexadecimalDigit+
    ;

fragment
HexadecimalPrefix
    :   '0' [xX]
    ;

fragment
NonzeroDigit
    :   [1-9]
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
HexadecimalDigit
    :   [0-9a-fA-F]
    ;

fragment
IntegerSuffix
    :   UnsignedSuffix LongSuffix?
    |   UnsignedSuffix LongLongSuffix
    |   LongSuffix UnsignedSuffix?
    |   LongLongSuffix UnsignedSuffix?
    ;

fragment
UnsignedSuffix
    :   [uU]
    ;

fragment
LongSuffix
    :   [lL]
    ;

fragment
LongLongSuffix
    :   'll' | 'LL'
    ;

fragment
FloatingConstant
    :   DecimalFloatingConstant
    |   HexadecimalFloatingConstant
    ;

fragment
DecimalFloatingConstant
    :   FractionalConstant ExponentPart? FloatingSuffix?
    |   DigitSequence ExponentPart FloatingSuffix?
    ;

fragment
HexadecimalFloatingConstant
    :   HexadecimalPrefix HexadecimalFractionalConstant BinaryExponentPart FloatingSuffix?
    |   HexadecimalPrefix HexadecimalDigitSequence BinaryExponentPart FloatingSuffix?
    ;

fragment
FractionalConstant
    :   DigitSequence? '.' DigitSequence
    |   DigitSequence '.'
    ;

fragment
ExponentPart
    :   'e' Sign? DigitSequence
    |   'E' Sign? DigitSequence
    ;

fragment
Sign
    :   '+' | '-'
    ;

DigitSequence
    :   Digit+
    ;

fragment
HexadecimalFractionalConstant
    :   HexadecimalDigitSequence? '.' HexadecimalDigitSequence
    |   HexadecimalDigitSequence '.'
    ;

fragment
BinaryExponentPart
    :   'p' Sign? DigitSequence
    |   'P' Sign? DigitSequence
    ;

fragment
HexadecimalDigitSequence
    :   HexadecimalDigit+
    ;

fragment
FloatingSuffix
    :   'f' | 'l' | 'F' | 'L'
    ;

fragment
CharacterConstant
    :   '\'' CCharSequence '\''
    |   'L\'' CCharSequence '\''
    |   'u\'' CCharSequence '\''
    |   'U\'' CCharSequence '\''
    ;

fragment
CCharSequence
    :   CChar+
    ;

fragment
CChar
    :   ~['\\\r\n]
    |   EscapeSequence
    ;
fragment
EscapeSequence
    :   SimpleEscapeSequence
    |   OctalEscapeSequence
    |   HexadecimalEscapeSequence
    |   UniversalCharacterName
    ;
fragment
SimpleEscapeSequence
    :   '\\' ['"?abfnrtv\\]
    ;
fragment
OctalEscapeSequence
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' OctalDigit OctalDigit OctalDigit
    ;
fragment
HexadecimalEscapeSequence
    :   '\\x' HexadecimalDigit+
    ;
StringLiteral
    :   EncodingPrefix? '"' SCharSequence? '"'
    ;
fragment
EncodingPrefix
    :   'u8'
    |   'u'
    |   'U'
    |   'L'
    ;
fragment
SCharSequence
    :   SChar+
    ;
fragment
SChar
    :   ~["\\\r\n]
    |   EscapeSequence
    |   '\\\n'   // Added line
    |   '\\\r\n' // Added line
    ;

ComplexDefine
    :   '#' Whitespace? 'define'  ~[#]*
        -> skip
    ;
         
IncludeDirective
    :   '#' Whitespace? 'include' Whitespace? (('"' ~[\r\n]* '"') | ('<' ~[\r\n]* '>' )) Whitespace? Newline
        -> skip
    ;

// ignore the following asm blocks:
/*
    asm
    {
        mfspr x, 286;
    }
 */
AsmBlock
    :   'asm' ~'{'* '{' ~'}'* '}'
	-> skip
    ;
	
// ignore the lines generated by c preprocessor                                   
// sample line : '#line 1 "/home/dm/files/dk1.h" 1'                           
LineAfterPreprocessing
    :   '#line' Whitespace* ~[\r\n]*
        -> skip
    ;  

LineDirective
    :   '#' Whitespace? DecimalConstant Whitespace? StringLiteral ~[\r\n]*
        -> skip
    ;

PragmaDirective
    :   '#' Whitespace? 'pragma' Whitespace ~[\r\n]*
        -> skip
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;