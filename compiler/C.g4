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
    |   expr=postfixExpression op=('++'|'--')                                   #incrPostExpr
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
    |   op=('++'|'--') expr=unaryExpression                     #preIncUnaryExpr
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
    :   expr=conditionalExpression                                              #termAssgnExpr
    |   left=unaryExpression op=assignmentOperator right=assignmentExpression   #opAssgnExpr
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
    :   spec=declarationSpecifiers initList=initDeclaratorList ';'  #initSpecDeclaration
	| 	spec=declarationSpecifiers ';'                              #specDeclaration
    |   dec=staticAssertDeclaration                                 #staticDeclaration
    ;

declarationSpecifiers
    :   dec=declarationSpecifier+
    ;

declarationSpecifiers2
    :   dec=declarationSpecifier+
    ;

declarationSpecifier
    :   type=storageClassSpecifier  #classDecSpec
    |   type=typeSpecifier          #typeSpecDecSpec
    |   type=typeQualifier          #typeQualDecSpec
    |   type=functionSpecifier      #funcDecSpec
    |   type=alignmentSpecifier     #alignDecSpec
    ;

initDeclaratorList
    :   dec=initDeclarator                               #singleInitDecList
    |   decL=initDeclaratorList ',' dec=initDeclarator   #multInitDecList
    ;

initDeclarator
    :   dec=declarator                          #termInitDec
    |   left=declarator '=' right=initializer   #opInitDec
    ;

storageClassSpecifier
    :   type=('typedef'           
    |   'extern'
    |   'static'
    |   '_Thread_local'
    |   'auto'
    |   'register')             #typeDefStorageClassSpec  
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
    :   ojb=structOrUnion id=Identifier? '{' decL=structDeclarationList '}' #decStructUnSpec
    |   obj=structOrUnion id=Identifier                                     #singleStructUnSpec
    ;

structOrUnion
    :   id=('struct'
    |   'union')
    ;

structDeclarationList
    :   dec=structDeclaration                               #singleStructDecList
    |   decL=structDeclarationList dec=structDeclaration    #multStructDecList
    ;

structDeclaration
    :   specL=specifierQualifierList decL=structDeclaratorList? ';' #mulStructDec
    |   dec=staticAssertDeclaration                                 #singleStructDec
    ;

specifierQualifierList
    :   type=typeSpecifier specL=specifierQualifierList?    #specSpecQualList
    |   type=typeQualifier specL=specifierQualifierList?    #qualSpecQualList
    ;

structDeclaratorList
    :   dec=structDeclarator                                #singleStructDecrList
    |   decL=structDeclaratorList ',' dec=structDeclarator  #mulStructDecrList
    ;

structDeclarator
    :   dec=declarator                              #emptyStructDec
    |   dec=declarator? ':' expr=constantExpression #assgnStructDec
    ;

enumSpecifier
    :   'enum' id=Identifier? '{' enumL=enumeratorList (',')? '}'   #decEnumSpec
    // |   'enum' id=Identifier? '{' enumeratorList ',' '}'
    |   'enum' id=Identifier                                        #emptyEnumSpec
    ;

enumeratorList
    :   enume=enumerator                             #singleEnumList
    |   enumL=enumeratorList ',' enume=enumerator    #multEnumList
    ;

enumerator
    :   enume=enumerationConstant                                #emptyEnum
    |   enume=enumerationConstant '=' expr=constantExpression    #assgnEnum
    ;

enumerationConstant
    :   id=Identifier                                #enumConst                                           
    ;

atomicTypeSpecifier
    :   '_Atomic' '(' type=typeName ')'
    ;

typeQualifier
    :   type= ('const'
    |   'restrict'
    |   'volatile'
    |   '_Atomic')
    ;

functionSpecifier
    :   spec=('inline'
    |   '_Noreturn'
    |   '__inline__' // GCC extension
    |   '__stdcall')                        #baseFuncSpec
    |   spec=gccAttributeSpecifier          #gccFuncSpec
    |   '__declspec' '(' id=Identifier ')'  #declFuncSpec
    ;

alignmentSpecifier
    :   '_Alignas' '(' type=typeName ')'            #typeAlignSpec
    |   '_Alignas' '(' expr=constantExpression ')'  #exprAlignSpec
    ;

declarator
    :   ptr=pointer? directDec=directDeclarator gcc=gccDeclaratorExtension*
    ;

directDeclarator
    :   id=Identifier                                                                                           #idDirDec
    |   '(' decl=declarator ')'                                                                                 #parDirDec
    |   dec=directDeclarator '[' qualL=typeQualifierList? expr=assignmentExpression? ']'                        #qArrDirDec
    |   dec=directDeclarator '[' 'static' qualL=typeQualifierList? expr=assignmentExpression ']'                #qsArrDirDec
    |   dec=directDeclarator '[' qualL=typeQualifierList 'static' expr=assignmentExpression ']'                 #sqArrDirDec
    |   dec=directDeclarator '[' qualL=typeQualifierList? '*' ']'                                               #eArrDirDec
    |   dec=directDeclarator '(' paramL=parameterTypeList ')'                                                   #paramlDirDec
    |   dec=directDeclarator '(' idL=identifierList? ')'                                                        #idlDirDec
    |   id=Identifier ':' seq=DigitSequence                                                                     #dsDirDec   // bit field
    // |   '(' type=typeSpecifier? ptr=pointer dec=directDeclarator ')'                                            #ptrDirDec  // function pointer like: (__cdecl *f)
    ;

gccDeclaratorExtension
    :   '__asm' '(' id=StringLiteral+ ')'    #singleGccDecExt
    |   spec=gccAttributeSpecifier           #multGccDecExt
    ;

gccAttributeSpecifier
    :   '__attribute__' '(' '(' attL=gccAttributeList ')' ')'
    ;

// most probably unused
gccAttributeList
    :   att=gccAttribute (',' gccAttribute)*    #gccAttList
    |                                           #emptyGccAttList // empty
    ;

// most probably unused
gccAttribute
    :   ~(',' | '(' | ')')                      // relaxed def for "identifier or reserved word"
        ('(' argL=argumentExpressionList? ')')? #multGccAttr
    |                                           #emptyGccAttr   // empty
    ;

nestedParenthesesBlock
    :   (   ~('(' | ')')
        |   '(' block=nestedParenthesesBlock ')'
        )*
    ;

pointer
    :   '*' qualL=typeQualifierList?                #SPointer
    |   '*' qualL=typeQualifierList? ptr=pointer    #SPPointer
    |   '^' qualL=typeQualifierList?                #HPointer   // Blocks language extension
    |   '^' qualL=typeQualifierList? ptr=pointer    #HPPointer   // Blocks language extension
    ;

typeQualifierList
    :   typeQualifier
    |   typeQualifierList typeQualifier
    ;

parameterTypeList
    :   paramL=parameterList            #singleParamTypeList
    |   paramL=parameterList ',' '...'  #extParamTypeList
    ;

parameterList
    :   param=parameterDeclaration                          #singleParamList
    |   paramL=parameterList ',' param=parameterDeclaration #multParamList
    ;

parameterDeclaration
    :   spec=declarationSpecifiers dec=declarator           #decParamDec
    |   spec=declarationSpecifiers2 dec=abstractDeclarator? #absParamDec
    ;

identifierList
    :   id=Identifier                           #singleIdList
    |   idL=identifierList ',' id=Identifier    #multIdList
    ;

typeName
    :   spec=specifierQualifierList dec=abstractDeclarator?
    ;

abstractDeclarator
    :   ptr=pointer                                                             #ptrAbsDec
    |   ptr=pointer? dec=directAbstractDeclarator gcc=gccDeclaratorExtension*   #ptrGccAbsDec
    ;

// probably won't need that rule as well
directAbstractDeclarator
    :   '(' dec=abstractDeclarator ')' gcc=gccDeclaratorExtension*                                          #decDirAbsDec
    |   '[' qualL=typeQualifierList? expr=assignmentExpression? ']'                                         #qualDirAbsDec
    |   '[' 'static' qualL=typeQualifierList? expr=assignmentExpression ']'                                 #staticQualDirAbsDec
    |   '[' qualL=typeQualifierList 'static' expr=assignmentExpression ']'                                  #qualStaticDirAbsDec
    |   '[' '*' ']'                                                                                         #addrDirAbsDec
    |   '(' paramL=parameterTypeList? ')' gcc=gccDeclaratorExtension*                                       #paramDirAbsDec
    |   dec=directAbstractDeclarator '[' qualL=typeQualifierList? expr=assignmentExpression? ']'            #decQualDirAbsDec
    |   dec=directAbstractDeclarator '[' 'static' qualL=typeQualifierList? expr=assignmentExpression ']'    #decStaticQualDirAbsDec
    |   dec=directAbstractDeclarator '[' qualL=typeQualifierList 'static' expr=assignmentExpression ']'     #decQualStaticDirAbsDec
    |   dec=directAbstractDeclarator '[' '*' ']'                                                            #decAddrDirAbsDec
    |   dec=directAbstractDeclarator '(' paramL=parameterTypeList? ')' gcc=gccDeclaratorExtension*          #decParamDirAbsDec
    ;



typedefName
    :   id=Identifier
    ;

initializer
    :   expr=assignmentExpression               #assgnInit
    |   '{' initL=initializerList (',')? '}'    #listInit
    ;

initializerList
    :   des=designation? init=initializer                           #singleInitList
    |   initL=initializerList ',' des=designation? init=initializer #multInitList
    ;

designation
    :   desL=designatorList '='
    ;

designatorList
    :   des=designator                      #singleDesList
    |   desL=designatorList des=designator  #multDesList
    ;

designator
    :   '[' expr=constantExpression ']' #arrayDes
    |   '.' id=Identifier               #funcDes
    ;

staticAssertDeclaration
    :   '_Static_assert' '(' expr=constantExpression ',' id=StringLiteral+ ')' ';'
    ;

statement
    :   stmt=labeledStatement       #labelStat
    |   stmt=compoundStatement      #cmpStat
    |   stmt=expressionStatement    #exprStat
    |   stmt=selectionStatement     #selectStat
    |   stmt=iterationStatement     #iterStat
    |   stmt=jumpStatement          #jumpStat
    // |   ('__asm' | '__asm__') ('volatile' | '__volatile__') '(' (logicalOrExpression (',' logicalOrExpression)*)? (':' (logicalOrExpression (',' logicalOrExpression)*)?)* ')' ';'
    ;

labeledStatement
    :   id=Identifier ':' exec=statement                                       #idLabelStat
    |   'case' cond=constantExpression ':' exec=statement                      #caseLabelStat
    |   'default' ':' exec=statement                                           #defLabelStat
    ;

compoundStatement
    :   '{' itemL=blockItemList? '}'
    ;

blockItemList
    :   item=blockItem                      #singleBlockItemList
    |   itemL=blockItemList item=blockItem  #multBlockItemList
    ;

blockItem
    :   item=statement  #statBlockItem
    |   item=declaration #decBlockItem
    ;

expressionStatement
    :   expr=expression? ';'
    ;

selectionStatement
    :   'if' '(' cond=expression ')' trueExec=statement ('else' falseExec=statement)?   #ifSelecStat
    |   'switch' '(' cond=expression ')' trueExec=statement                                  #switchSelecStat
    ;

iterationStatement
    :   While '(' cond=expression ')' exec=statement        #whileIterStat
    |   Do exec=statement While '(' cond=expression ')' ';' #doIterStat
    |   For '(' cond=forCondition ')' exec=statement        #forIterStat
    ;

//    |   'for' '(' expression? ';' expression?  ';' forUpdate? ')' statement
//    |   For '(' declaration  expression? ';' expression? ')' statement

forCondition
	:   init=forDeclaration ';' cond=forExpression? ';' update=forExpression?   #decForCond
	|   init=expression? ';' cond=forExpression? ';' update=forExpression?      #expForCond
	;

forDeclaration
    :   dec=declarationSpecifiers init=initDeclaratorList   #multForDec
	| 	dec=declarationSpecifiers                           #singleForDec
    ;

forExpression
    :   expr=assignmentExpression                       #singleForExpr
    |   forExp=forExpression ',' expr=assignmentExpression #multForExpr
    ;

jumpStatement
    :   'goto' id=Identifier ';'        #gotoJumpStat
    |   'continue' ';'                  #continueJumpStat
    |   'break' ';'                     #breakJumpStat
    |   'return' expr=expression? ';'   #returnJumpStat
    |   'goto' expr=unaryExpression ';' #gotoExpJumpStat    // GCC extension
    ;

compilationUnit
    :   tu=translationUnit? EOF
    ;

translationUnit
    :   dec=externalDeclaration                     #singleTransUnit
    |   tu=translationUnit dec=externalDeclaration  #multTransUnit
    ;

externalDeclaration
    :   dec=functionDefinition  #funcExtDec
    |   dec=declaration         #decExtDec
    |   ';'                     #empty      // stray ;
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