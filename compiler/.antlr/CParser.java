// Generated from /Users/jaafarrammal/Desktop/EE2-Compiler/compiler/C.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, Auto=13, Break=14, Case=15, Char=16, Const=17, 
		Continue=18, Default=19, Do=20, Double=21, Else=22, Enum=23, Extern=24, 
		Float=25, For=26, Goto=27, If=28, Inline=29, Int=30, Long=31, Register=32, 
		Restrict=33, Return=34, Short=35, Signed=36, Sizeof=37, Static=38, Struct=39, 
		Switch=40, Typedef=41, Union=42, Unsigned=43, Void=44, Volatile=45, While=46, 
		Alignas=47, Alignof=48, Atomic=49, Bool=50, Complex=51, Generic=52, Imaginary=53, 
		Noreturn=54, StaticAssert=55, ThreadLocal=56, LeftParen=57, RightParen=58, 
		LeftBracket=59, RightBracket=60, LeftBrace=61, RightBrace=62, Less=63, 
		LessEqual=64, Greater=65, GreaterEqual=66, LeftShift=67, RightShift=68, 
		Plus=69, PlusPlus=70, Minus=71, MinusMinus=72, Star=73, Div=74, Mod=75, 
		And=76, Or=77, AndAnd=78, OrOr=79, Caret=80, Not=81, Tilde=82, Question=83, 
		Colon=84, Semi=85, Comma=86, Assign=87, StarAssign=88, DivAssign=89, ModAssign=90, 
		PlusAssign=91, MinusAssign=92, LeftShiftAssign=93, RightShiftAssign=94, 
		AndAssign=95, XorAssign=96, OrAssign=97, Equal=98, NotEqual=99, Arrow=100, 
		Dot=101, Ellipsis=102, Identifier=103, Constant=104, DigitSequence=105, 
		StringLiteral=106, ComplexDefine=107, IncludeDirective=108, AsmBlock=109, 
		LineAfterPreprocessing=110, LineDirective=111, PragmaDirective=112, Whitespace=113, 
		Newline=114, BlockComment=115, LineComment=116;
	public static final int
		RULE_primaryExpression = 0, RULE_genericSelection = 1, RULE_genericAssocList = 2, 
		RULE_genericAssociation = 3, RULE_postfixExpression = 4, RULE_argumentExpressionList = 5, 
		RULE_unaryExpression = 6, RULE_unaryOperator = 7, RULE_castExpression = 8, 
		RULE_multiplicativeExpression = 9, RULE_additiveExpression = 10, RULE_shiftExpression = 11, 
		RULE_relationalExpression = 12, RULE_equalityExpression = 13, RULE_andExpression = 14, 
		RULE_exclusiveOrExpression = 15, RULE_inclusiveOrExpression = 16, RULE_logicalAndExpression = 17, 
		RULE_logicalOrExpression = 18, RULE_conditionalExpression = 19, RULE_assignmentExpression = 20, 
		RULE_assignmentOperator = 21, RULE_expression = 22, RULE_constantExpression = 23, 
		RULE_declaration = 24, RULE_declarationSpecifiers = 25, RULE_declarationSpecifiers2 = 26, 
		RULE_declarationSpecifier = 27, RULE_initDeclaratorList = 28, RULE_initDeclarator = 29, 
		RULE_storageClassSpecifier = 30, RULE_typeSpecifier = 31, RULE_structOrUnionSpecifier = 32, 
		RULE_structOrUnion = 33, RULE_structDeclarationList = 34, RULE_structDeclaration = 35, 
		RULE_specifierQualifierList = 36, RULE_structDeclaratorList = 37, RULE_structDeclarator = 38, 
		RULE_enumSpecifier = 39, RULE_enumeratorList = 40, RULE_enumerator = 41, 
		RULE_enumerationConstant = 42, RULE_atomicTypeSpecifier = 43, RULE_typeQualifier = 44, 
		RULE_functionSpecifier = 45, RULE_alignmentSpecifier = 46, RULE_declarator = 47, 
		RULE_directDeclarator = 48, RULE_gccDeclaratorExtension = 49, RULE_gccAttributeSpecifier = 50, 
		RULE_gccAttributeList = 51, RULE_gccAttribute = 52, RULE_nestedParenthesesBlock = 53, 
		RULE_pointer = 54, RULE_typeQualifierList = 55, RULE_parameterTypeList = 56, 
		RULE_parameterList = 57, RULE_parameterDeclaration = 58, RULE_identifierList = 59, 
		RULE_typeName = 60, RULE_abstractDeclarator = 61, RULE_directAbstractDeclarator = 62, 
		RULE_typedefName = 63, RULE_initializer = 64, RULE_initializerList = 65, 
		RULE_designation = 66, RULE_designatorList = 67, RULE_designator = 68, 
		RULE_staticAssertDeclaration = 69, RULE_statement = 70, RULE_labeledStatement = 71, 
		RULE_compoundStatement = 72, RULE_blockItemList = 73, RULE_blockItem = 74, 
		RULE_expressionStatement = 75, RULE_selectionStatement = 76, RULE_iterationStatement = 77, 
		RULE_forCondition = 78, RULE_forDeclaration = 79, RULE_forExpression = 80, 
		RULE_jumpStatement = 81, RULE_compilationUnit = 82, RULE_translationUnit = 83, 
		RULE_externalDeclaration = 84, RULE_functionDefinition = 85, RULE_declarationList = 86;
	public static final String[] ruleNames = {
		"primaryExpression", "genericSelection", "genericAssocList", "genericAssociation", 
		"postfixExpression", "argumentExpressionList", "unaryExpression", "unaryOperator", 
		"castExpression", "multiplicativeExpression", "additiveExpression", "shiftExpression", 
		"relationalExpression", "equalityExpression", "andExpression", "exclusiveOrExpression", 
		"inclusiveOrExpression", "logicalAndExpression", "logicalOrExpression", 
		"conditionalExpression", "assignmentExpression", "assignmentOperator", 
		"expression", "constantExpression", "declaration", "declarationSpecifiers", 
		"declarationSpecifiers2", "declarationSpecifier", "initDeclaratorList", 
		"initDeclarator", "storageClassSpecifier", "typeSpecifier", "structOrUnionSpecifier", 
		"structOrUnion", "structDeclarationList", "structDeclaration", "specifierQualifierList", 
		"structDeclaratorList", "structDeclarator", "enumSpecifier", "enumeratorList", 
		"enumerator", "enumerationConstant", "atomicTypeSpecifier", "typeQualifier", 
		"functionSpecifier", "alignmentSpecifier", "declarator", "directDeclarator", 
		"gccDeclaratorExtension", "gccAttributeSpecifier", "gccAttributeList", 
		"gccAttribute", "nestedParenthesesBlock", "pointer", "typeQualifierList", 
		"parameterTypeList", "parameterList", "parameterDeclaration", "identifierList", 
		"typeName", "abstractDeclarator", "directAbstractDeclarator", "typedefName", 
		"initializer", "initializerList", "designation", "designatorList", "designator", 
		"staticAssertDeclaration", "statement", "labeledStatement", "compoundStatement", 
		"blockItemList", "blockItem", "expressionStatement", "selectionStatement", 
		"iterationStatement", "forCondition", "forDeclaration", "forExpression", 
		"jumpStatement", "compilationUnit", "translationUnit", "externalDeclaration", 
		"functionDefinition", "declarationList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'__extension__'", "'__builtin_va_arg'", "'__builtin_offsetof'", 
		"'__m128'", "'__m128d'", "'__m128i'", "'__typeof__'", "'__inline__'", 
		"'__stdcall'", "'__declspec'", "'__asm'", "'__attribute__'", "'auto'", 
		"'break'", "'case'", "'char'", "'const'", "'continue'", "'default'", "'do'", 
		"'double'", "'else'", "'enum'", "'extern'", "'float'", "'for'", "'goto'", 
		"'if'", "'inline'", "'int'", "'long'", "'register'", "'restrict'", "'return'", 
		"'short'", "'signed'", "'sizeof'", "'static'", "'struct'", "'switch'", 
		"'typedef'", "'union'", "'unsigned'", "'void'", "'volatile'", "'while'", 
		"'_Alignas'", "'_Alignof'", "'_Atomic'", "'_Bool'", "'_Complex'", "'_Generic'", 
		"'_Imaginary'", "'_Noreturn'", "'_Static_assert'", "'_Thread_local'", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", 
		"'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", 
		"'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", "':'", "';'", "','", 
		"'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'&='", 
		"'^='", "'|='", "'=='", "'!='", "'->'", "'.'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Auto", "Break", "Case", "Char", "Const", "Continue", "Default", 
		"Do", "Double", "Else", "Enum", "Extern", "Float", "For", "Goto", "If", 
		"Inline", "Int", "Long", "Register", "Restrict", "Return", "Short", "Signed", 
		"Sizeof", "Static", "Struct", "Switch", "Typedef", "Union", "Unsigned", 
		"Void", "Volatile", "While", "Alignas", "Alignof", "Atomic", "Bool", "Complex", 
		"Generic", "Imaginary", "Noreturn", "StaticAssert", "ThreadLocal", "LeftParen", 
		"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
		"Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", "RightShift", 
		"Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", "Mod", "And", 
		"Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Question", "Colon", 
		"Semi", "Comma", "Assign", "StarAssign", "DivAssign", "ModAssign", "PlusAssign", 
		"MinusAssign", "LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign", 
		"OrAssign", "Equal", "NotEqual", "Arrow", "Dot", "Ellipsis", "Identifier", 
		"Constant", "DigitSequence", "StringLiteral", "ComplexDefine", "IncludeDirective", 
		"AsmBlock", "LineAfterPreprocessing", "LineDirective", "PragmaDirective", 
		"Whitespace", "Newline", "BlockComment", "LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdPrimaryExprContext extends PrimaryExpressionContext {
		public Token id;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public IdPrimaryExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class VaArgPrimaryExprContext extends PrimaryExpressionContext {
		public UnaryExpressionContext expr;
		public TypeNameContext type;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public VaArgPrimaryExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OffsetPrimaryExprContext extends PrimaryExpressionContext {
		public TypeNameContext type;
		public UnaryExpressionContext expr;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public OffsetPrimaryExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class GSelectPrimaryExprContext extends PrimaryExpressionContext {
		public GenericSelectionContext genSelec;
		public GenericSelectionContext genericSelection() {
			return getRuleContext(GenericSelectionContext.class,0);
		}
		public GSelectPrimaryExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IntConstPrimaryExprContext extends PrimaryExpressionContext {
		public Token val;
		public TerminalNode Constant() { return getToken(CParser.Constant, 0); }
		public IntConstPrimaryExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CmpStatPrimaryExprContext extends PrimaryExpressionContext {
		public CompoundStatementContext cmpStat;
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public CmpStatPrimaryExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class StrLitPrimaryExprContext extends PrimaryExpressionContext {
		public Token val;
		public List<TerminalNode> StringLiteral() { return getTokens(CParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CParser.StringLiteral, i);
		}
		public StrLitPrimaryExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParExprPrimaryExprContext extends PrimaryExpressionContext {
		public ExpressionContext expr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExprPrimaryExprContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primaryExpression);
		int _la;
		try {
			int _alt;
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new IdPrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				((IdPrimaryExprContext)_localctx).id = match(Identifier);
				}
				break;
			case 2:
				_localctx = new IntConstPrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				((IntConstPrimaryExprContext)_localctx).val = match(Constant);
				}
				break;
			case 3:
				_localctx = new StrLitPrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(177); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(176);
						((StrLitPrimaryExprContext)_localctx).val = match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(179); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				_localctx = new ParExprPrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(LeftParen);
				setState(182);
				((ParExprPrimaryExprContext)_localctx).expr = expression(0);
				setState(183);
				match(RightParen);
				}
				break;
			case 5:
				_localctx = new GSelectPrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				((GSelectPrimaryExprContext)_localctx).genSelec = genericSelection();
				}
				break;
			case 6:
				_localctx = new CmpStatPrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(186);
					match(T__0);
					}
				}

				setState(189);
				match(LeftParen);
				setState(190);
				((CmpStatPrimaryExprContext)_localctx).cmpStat = compoundStatement();
				setState(191);
				match(RightParen);
				}
				break;
			case 7:
				_localctx = new VaArgPrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(193);
				match(T__1);
				setState(194);
				match(LeftParen);
				setState(195);
				((VaArgPrimaryExprContext)_localctx).expr = unaryExpression();
				setState(196);
				match(Comma);
				setState(197);
				((VaArgPrimaryExprContext)_localctx).type = typeName();
				setState(198);
				match(RightParen);
				}
				break;
			case 8:
				_localctx = new OffsetPrimaryExprContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(200);
				match(T__2);
				setState(201);
				match(LeftParen);
				setState(202);
				((OffsetPrimaryExprContext)_localctx).type = typeName();
				setState(203);
				match(Comma);
				setState(204);
				((OffsetPrimaryExprContext)_localctx).expr = unaryExpression();
				setState(205);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericSelectionContext extends ParserRuleContext {
		public AssignmentExpressionContext assgnExpr;
		public GenericAssocListContext genAssL;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public GenericSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericSelection; }
	}

	public final GenericSelectionContext genericSelection() throws RecognitionException {
		GenericSelectionContext _localctx = new GenericSelectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_genericSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(Generic);
			setState(210);
			match(LeftParen);
			setState(211);
			((GenericSelectionContext)_localctx).assgnExpr = assignmentExpression();
			setState(212);
			match(Comma);
			setState(213);
			((GenericSelectionContext)_localctx).genAssL = genericAssocList(0);
			setState(214);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericAssocListContext extends ParserRuleContext {
		public GenericAssocListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssocList; }
	 
		public GenericAssocListContext() { }
		public void copyFrom(GenericAssocListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultGenAssListContext extends GenericAssocListContext {
		public GenericAssocListContext genAss;
		public GenericAssociationContext genAssL;
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public GenericAssociationContext genericAssociation() {
			return getRuleContext(GenericAssociationContext.class,0);
		}
		public MultGenAssListContext(GenericAssocListContext ctx) { copyFrom(ctx); }
	}
	public static class SingleGenAssListContext extends GenericAssocListContext {
		public GenericAssociationContext genAss;
		public GenericAssociationContext genericAssociation() {
			return getRuleContext(GenericAssociationContext.class,0);
		}
		public SingleGenAssListContext(GenericAssocListContext ctx) { copyFrom(ctx); }
	}

	public final GenericAssocListContext genericAssocList() throws RecognitionException {
		return genericAssocList(0);
	}

	private GenericAssocListContext genericAssocList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, _parentState);
		GenericAssocListContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_genericAssocList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleGenAssListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(217);
			((SingleGenAssListContext)_localctx).genAss = genericAssociation();
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultGenAssListContext(new GenericAssocListContext(_parentctx, _parentState));
					((MultGenAssListContext)_localctx).genAss = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_genericAssocList);
					setState(219);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(220);
					match(Comma);
					setState(221);
					((MultGenAssListContext)_localctx).genAssL = genericAssociation();
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GenericAssociationContext extends ParserRuleContext {
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
	 
		public GenericAssociationContext() { }
		public void copyFrom(GenericAssociationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeGenAssContext extends GenericAssociationContext {
		public TypeNameContext type;
		public AssignmentExpressionContext expr;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TypeGenAssContext(GenericAssociationContext ctx) { copyFrom(ctx); }
	}
	public static class DefaultGenAssContext extends GenericAssociationContext {
		public AssignmentExpressionContext expr;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public DefaultGenAssContext(GenericAssociationContext ctx) { copyFrom(ctx); }
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_genericAssociation);
		try {
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				_localctx = new TypeGenAssContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				((TypeGenAssContext)_localctx).type = typeName();
				setState(228);
				match(Colon);
				setState(229);
				((TypeGenAssContext)_localctx).expr = assignmentExpression();
				}
				break;
			case Default:
				_localctx = new DefaultGenAssContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(Default);
				setState(232);
				match(Colon);
				setState(233);
				((DefaultGenAssContext)_localctx).expr = assignmentExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultExtPostExprContext extends PostfixExpressionContext {
		public TypeNameContext type;
		public InitializerListContext inits;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public MultExtPostExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FuncInvocPostExprContext extends PostfixExpressionContext {
		public PostfixExpressionContext expr;
		public ArgumentExpressionListContext args;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public FuncInvocPostExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FuncCallPostExprContext extends PostfixExpressionContext {
		public PostfixExpressionContext expr;
		public Token id;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public FuncCallPostExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SingleExtPostExprContext extends PostfixExpressionContext {
		public TypeNameContext type;
		public InitializerListContext inits;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public SingleExtPostExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultCastPostExprContext extends PostfixExpressionContext {
		public TypeNameContext type;
		public InitializerListContext inits;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public MultCastPostExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SingleCastPostExprContext extends PostfixExpressionContext {
		public TypeNameContext type;
		public InitializerListContext inits;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public SingleCastPostExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IncrPostExprContext extends PostfixExpressionContext {
		public PostfixExpressionContext expr;
		public Token op;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public IncrPostExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PrimPostExprContext extends PostfixExpressionContext {
		public PrimaryExpressionContext expr;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PrimPostExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrPostExprContext extends PostfixExpressionContext {
		public PostfixExpressionContext left;
		public ExpressionContext right;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrPostExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class FuncCallPtrPostExprContext extends PostfixExpressionContext {
		public PostfixExpressionContext expr;
		public Token id;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public FuncCallPtrPostExprContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new PrimPostExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(237);
				((PrimPostExprContext)_localctx).expr = primaryExpression();
				}
				break;
			case 2:
				{
				_localctx = new SingleCastPostExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(238);
				match(LeftParen);
				setState(239);
				((SingleCastPostExprContext)_localctx).type = typeName();
				setState(240);
				match(RightParen);
				setState(241);
				match(LeftBrace);
				setState(242);
				((SingleCastPostExprContext)_localctx).inits = initializerList(0);
				setState(243);
				match(RightBrace);
				}
				break;
			case 3:
				{
				_localctx = new MultCastPostExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				match(LeftParen);
				setState(246);
				((MultCastPostExprContext)_localctx).type = typeName();
				setState(247);
				match(RightParen);
				setState(248);
				match(LeftBrace);
				setState(249);
				((MultCastPostExprContext)_localctx).inits = initializerList(0);
				setState(250);
				match(Comma);
				setState(251);
				match(RightBrace);
				}
				break;
			case 4:
				{
				_localctx = new SingleExtPostExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253);
				match(T__0);
				setState(254);
				match(LeftParen);
				setState(255);
				((SingleExtPostExprContext)_localctx).type = typeName();
				setState(256);
				match(RightParen);
				setState(257);
				match(LeftBrace);
				setState(258);
				((SingleExtPostExprContext)_localctx).inits = initializerList(0);
				setState(259);
				match(RightBrace);
				}
				break;
			case 5:
				{
				_localctx = new MultExtPostExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261);
				match(T__0);
				setState(262);
				match(LeftParen);
				setState(263);
				((MultExtPostExprContext)_localctx).type = typeName();
				setState(264);
				match(RightParen);
				setState(265);
				match(LeftBrace);
				setState(266);
				((MultExtPostExprContext)_localctx).inits = initializerList(0);
				setState(267);
				match(Comma);
				setState(268);
				match(RightBrace);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ArrPostExprContext(new PostfixExpressionContext(_parentctx, _parentState));
						((ArrPostExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(272);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(273);
						match(LeftBracket);
						setState(274);
						((ArrPostExprContext)_localctx).right = expression(0);
						setState(275);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new FuncInvocPostExprContext(new PostfixExpressionContext(_parentctx, _parentState));
						((FuncInvocPostExprContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(277);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(278);
						match(LeftParen);
						setState(280);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Plus - 69)) | (1L << (PlusPlus - 69)) | (1L << (Minus - 69)) | (1L << (MinusMinus - 69)) | (1L << (Star - 69)) | (1L << (And - 69)) | (1L << (AndAnd - 69)) | (1L << (Not - 69)) | (1L << (Tilde - 69)) | (1L << (Identifier - 69)) | (1L << (Constant - 69)) | (1L << (DigitSequence - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
							{
							setState(279);
							((FuncInvocPostExprContext)_localctx).args = argumentExpressionList(0);
							}
						}

						setState(282);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new FuncCallPostExprContext(new PostfixExpressionContext(_parentctx, _parentState));
						((FuncCallPostExprContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(283);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(284);
						match(Dot);
						setState(285);
						((FuncCallPostExprContext)_localctx).id = match(Identifier);
						}
						break;
					case 4:
						{
						_localctx = new FuncCallPtrPostExprContext(new PostfixExpressionContext(_parentctx, _parentState));
						((FuncCallPtrPostExprContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(286);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(287);
						match(Arrow);
						setState(288);
						((FuncCallPtrPostExprContext)_localctx).id = match(Identifier);
						}
						break;
					case 5:
						{
						_localctx = new IncrPostExprContext(new PostfixExpressionContext(_parentctx, _parentState));
						((IncrPostExprContext)_localctx).expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(289);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(290);
						((IncrPostExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PlusPlus || _la==MinusMinus) ) {
							((IncrPostExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
	 
		public ArgumentExpressionListContext() { }
		public void copyFrom(ArgumentExpressionListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleArgExprListContext extends ArgumentExpressionListContext {
		public AssignmentExpressionContext expr;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public SingleArgExprListContext(ArgumentExpressionListContext ctx) { copyFrom(ctx); }
	}
	public static class MultArgExprListContext extends ArgumentExpressionListContext {
		public ArgumentExpressionListContext args;
		public AssignmentExpressionContext expr;
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public MultArgExprListContext(ArgumentExpressionListContext ctx) { copyFrom(ctx); }
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		return argumentExpressionList(0);
	}

	private ArgumentExpressionListContext argumentExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, _parentState);
		ArgumentExpressionListContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_argumentExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleArgExprListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(297);
			((SingleArgExprListContext)_localctx).expr = assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultArgExprListContext(new ArgumentExpressionListContext(_parentctx, _parentState));
					((MultArgExprListContext)_localctx).args = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(299);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(300);
					match(Comma);
					setState(301);
					((MultArgExprListContext)_localctx).expr = assignmentExpression();
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
	 
		public UnaryExpressionContext() { }
		public void copyFrom(UnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostUnaryExprContext extends UnaryExpressionContext {
		public PostfixExpressionContext expr;
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostUnaryExprContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SizeTypeUnaryExpeContext extends UnaryExpressionContext {
		public TypeNameContext type;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public SizeTypeUnaryExpeContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AlignUnaryExprContext extends UnaryExpressionContext {
		public TypeNameContext type;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AlignUnaryExprContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SizeExprUnaryExprContext extends UnaryExpressionContext {
		public UnaryExpressionContext expr;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public SizeExprUnaryExprContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PreIncUnaryExprContext extends UnaryExpressionContext {
		public Token op;
		public UnaryExpressionContext expr;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public PreIncUnaryExprContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class CastUnaryExprContext extends UnaryExpressionContext {
		public UnaryOperatorContext left;
		public CastExpressionContext right;
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public CastUnaryExprContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IdUnaryExprContext extends UnaryExpressionContext {
		public Token id;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public IdUnaryExprContext(UnaryExpressionContext ctx) { copyFrom(ctx); }
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unaryExpression);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new PostUnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(307);
				((PostUnaryExprContext)_localctx).expr = postfixExpression(0);
				}
				break;
			case 2:
				_localctx = new PreIncUnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				((PreIncUnaryExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PlusPlus || _la==MinusMinus) ) {
					((PreIncUnaryExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(309);
				((PreIncUnaryExprContext)_localctx).expr = unaryExpression();
				}
				break;
			case 3:
				_localctx = new CastUnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				((CastUnaryExprContext)_localctx).left = unaryOperator();
				setState(311);
				((CastUnaryExprContext)_localctx).right = castExpression();
				}
				break;
			case 4:
				_localctx = new SizeExprUnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(313);
				match(Sizeof);
				setState(314);
				((SizeExprUnaryExprContext)_localctx).expr = unaryExpression();
				}
				break;
			case 5:
				_localctx = new SizeTypeUnaryExpeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(315);
				match(Sizeof);
				setState(316);
				match(LeftParen);
				setState(317);
				((SizeTypeUnaryExpeContext)_localctx).type = typeName();
				setState(318);
				match(RightParen);
				}
				break;
			case 6:
				_localctx = new AlignUnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(320);
				match(Alignof);
				setState(321);
				match(LeftParen);
				setState(322);
				((AlignUnaryExprContext)_localctx).type = typeName();
				setState(323);
				match(RightParen);
				}
				break;
			case 7:
				_localctx = new IdUnaryExprContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(325);
				match(AndAnd);
				setState(326);
				((IdUnaryExprContext)_localctx).id = match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public Token op;
		public TerminalNode And() { return getToken(CParser.And, 0); }
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public TerminalNode Plus() { return getToken(CParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(CParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(CParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			((UnaryOperatorContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Plus - 69)) | (1L << (Minus - 69)) | (1L << (Star - 69)) | (1L << (And - 69)) | (1L << (Not - 69)) | (1L << (Tilde - 69)))) != 0)) ) {
				((UnaryOperatorContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
	 
		public CastExpressionContext() { }
		public void copyFrom(CastExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryCastExprContext extends CastExpressionContext {
		public UnaryExpressionContext expr;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public UnaryCastExprContext(CastExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class DigitSeqCastExprContext extends CastExpressionContext {
		public Token seq;
		public TerminalNode DigitSequence() { return getToken(CParser.DigitSequence, 0); }
		public DigitSeqCastExprContext(CastExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExtensionCastExprContext extends CastExpressionContext {
		public TypeNameContext type;
		public CastExpressionContext expr;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ExtensionCastExprContext(CastExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TypeCastExprContext extends CastExpressionContext {
		public TypeNameContext type;
		public CastExpressionContext expr;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TypeCastExprContext(CastExpressionContext ctx) { copyFrom(ctx); }
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_castExpression);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new TypeCastExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(LeftParen);
				setState(332);
				((TypeCastExprContext)_localctx).type = typeName();
				setState(333);
				match(RightParen);
				setState(334);
				((TypeCastExprContext)_localctx).expr = castExpression();
				}
				break;
			case 2:
				_localctx = new ExtensionCastExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(T__0);
				setState(337);
				match(LeftParen);
				setState(338);
				((ExtensionCastExprContext)_localctx).type = typeName();
				setState(339);
				match(RightParen);
				setState(340);
				((ExtensionCastExprContext)_localctx).expr = castExpression();
				}
				break;
			case 3:
				_localctx = new UnaryCastExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				((UnaryCastExprContext)_localctx).expr = unaryExpression();
				}
				break;
			case 4:
				_localctx = new DigitSeqCastExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(343);
				((DigitSeqCastExprContext)_localctx).seq = match(DigitSequence);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
	 
		public MultiplicativeExpressionContext() { }
		public void copyFrom(MultiplicativeExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermMultExprContext extends MultiplicativeExpressionContext {
		public CastExpressionContext expr;
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TermMultExprContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OpMultExprContext extends MultiplicativeExpressionContext {
		public MultiplicativeExpressionContext left;
		public Token op;
		public CastExpressionContext right;
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode Star() { return getToken(CParser.Star, 0); }
		public TerminalNode Div() { return getToken(CParser.Div, 0); }
		public TerminalNode Mod() { return getToken(CParser.Mod, 0); }
		public OpMultExprContext(MultiplicativeExpressionContext ctx) { copyFrom(ctx); }
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_multiplicativeExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermMultExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(347);
			((TermMultExprContext)_localctx).expr = castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(354);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpMultExprContext(new MultiplicativeExpressionContext(_parentctx, _parentState));
					((OpMultExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
					setState(349);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(350);
					((OpMultExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Star - 73)) | (1L << (Div - 73)) | (1L << (Mod - 73)))) != 0)) ) {
						((OpMultExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(351);
					((OpMultExprContext)_localctx).right = castExpression();
					}
					} 
				}
				setState(356);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
	 
		public AdditiveExpressionContext() { }
		public void copyFrom(AdditiveExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermAddExprContext extends AdditiveExpressionContext {
		public MultiplicativeExpressionContext expr;
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TermAddExprContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OpAddExprContext extends AdditiveExpressionContext {
		public AdditiveExpressionContext left;
		public Token op;
		public MultiplicativeExpressionContext right;
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(CParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(CParser.Minus, 0); }
		public OpAddExprContext(AdditiveExpressionContext ctx) { copyFrom(ctx); }
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_additiveExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermAddExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(358);
			((TermAddExprContext)_localctx).expr = multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpAddExprContext(new AdditiveExpressionContext(_parentctx, _parentState));
					((OpAddExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
					setState(360);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(361);
					((OpAddExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==Plus || _la==Minus) ) {
						((OpAddExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(362);
					((OpAddExprContext)_localctx).right = multiplicativeExpression(0);
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
	 
		public ShiftExpressionContext() { }
		public void copyFrom(ShiftExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpShiftExprContext extends ShiftExpressionContext {
		public ShiftExpressionContext left;
		public Token op;
		public AdditiveExpressionContext right;
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode LeftShift() { return getToken(CParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(CParser.RightShift, 0); }
		public OpShiftExprContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TermShiftExprContext extends ShiftExpressionContext {
		public AdditiveExpressionContext expr;
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TermShiftExprContext(ShiftExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_shiftExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermShiftExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(369);
			((TermShiftExprContext)_localctx).expr = additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(376);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpShiftExprContext(new ShiftExpressionContext(_parentctx, _parentState));
					((OpShiftExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
					setState(371);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(372);
					((OpShiftExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==LeftShift || _la==RightShift) ) {
						((OpShiftExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(373);
					((OpShiftExprContext)_localctx).right = additiveExpression(0);
					}
					} 
				}
				setState(378);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
	 
		public RelationalExpressionContext() { }
		public void copyFrom(RelationalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpRelExprContext extends RelationalExpressionContext {
		public RelationalExpressionContext left;
		public Token op;
		public ShiftExpressionContext right;
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TerminalNode Less() { return getToken(CParser.Less, 0); }
		public TerminalNode Greater() { return getToken(CParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(CParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(CParser.GreaterEqual, 0); }
		public OpRelExprContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TermRelExprContext extends RelationalExpressionContext {
		public ShiftExpressionContext expr;
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TermRelExprContext(RelationalExpressionContext ctx) { copyFrom(ctx); }
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_relationalExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermRelExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(380);
			((TermRelExprContext)_localctx).expr = shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpRelExprContext(new RelationalExpressionContext(_parentctx, _parentState));
					((OpRelExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
					setState(382);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(383);
					((OpRelExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (Less - 63)) | (1L << (LessEqual - 63)) | (1L << (Greater - 63)) | (1L << (GreaterEqual - 63)))) != 0)) ) {
						((OpRelExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(384);
					((OpRelExprContext)_localctx).right = shiftExpression(0);
					}
					} 
				}
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
	 
		public EqualityExpressionContext() { }
		public void copyFrom(EqualityExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermEqualExprContext extends EqualityExpressionContext {
		public RelationalExpressionContext expr;
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TermEqualExprContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OpEqualExprContext extends EqualityExpressionContext {
		public EqualityExpressionContext left;
		public Token op;
		public RelationalExpressionContext right;
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode NotEqual() { return getToken(CParser.NotEqual, 0); }
		public TerminalNode Equal() { return getToken(CParser.Equal, 0); }
		public OpEqualExprContext(EqualityExpressionContext ctx) { copyFrom(ctx); }
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_equalityExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermEqualExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(391);
			((TermEqualExprContext)_localctx).expr = relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpEqualExprContext(new EqualityExpressionContext(_parentctx, _parentState));
					((OpEqualExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
					setState(393);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(394);
					((OpEqualExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==Equal || _la==NotEqual) ) {
						((OpEqualExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(395);
					((OpEqualExprContext)_localctx).right = relationalExpression(0);
					}
					} 
				}
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
	 
		public AndExpressionContext() { }
		public void copyFrom(AndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermAndExprContext extends AndExpressionContext {
		public EqualityExpressionContext expr;
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TermAndExprContext(AndExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OpAndExprContext extends AndExpressionContext {
		public AndExpressionContext left;
		public EqualityExpressionContext right;
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public OpAndExprContext(AndExpressionContext ctx) { copyFrom(ctx); }
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermAndExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(402);
			((TermAndExprContext)_localctx).expr = equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpAndExprContext(new AndExpressionContext(_parentctx, _parentState));
					((OpAndExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(404);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(405);
					match(And);
					setState(406);
					((OpAndExprContext)_localctx).right = equalityExpression(0);
					}
					} 
				}
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
	 
		public ExclusiveOrExpressionContext() { }
		public void copyFrom(ExclusiveOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermExcOrExprContext extends ExclusiveOrExpressionContext {
		public AndExpressionContext expr;
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TermExcOrExprContext(ExclusiveOrExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OpExcOrExprContext extends ExclusiveOrExpressionContext {
		public ExclusiveOrExpressionContext left;
		public AndExpressionContext right;
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public OpExcOrExprContext(ExclusiveOrExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermExcOrExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(413);
			((TermExcOrExprContext)_localctx).expr = andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpExcOrExprContext(new ExclusiveOrExpressionContext(_parentctx, _parentState));
					((OpExcOrExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(415);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(416);
					match(Caret);
					setState(417);
					((OpExcOrExprContext)_localctx).right = andExpression(0);
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
	 
		public InclusiveOrExpressionContext() { }
		public void copyFrom(InclusiveOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpIncOrExprContext extends InclusiveOrExpressionContext {
		public InclusiveOrExpressionContext left;
		public ExclusiveOrExpressionContext right;
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public OpIncOrExprContext(InclusiveOrExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TermIncOrExprContext extends InclusiveOrExpressionContext {
		public ExclusiveOrExpressionContext expr;
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TermIncOrExprContext(InclusiveOrExpressionContext ctx) { copyFrom(ctx); }
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermIncOrExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(424);
			((TermIncOrExprContext)_localctx).expr = exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpIncOrExprContext(new InclusiveOrExpressionContext(_parentctx, _parentState));
					((OpIncOrExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(426);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(427);
					match(Or);
					setState(428);
					((OpIncOrExprContext)_localctx).right = exclusiveOrExpression(0);
					}
					} 
				}
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
	 
		public LogicalAndExpressionContext() { }
		public void copyFrom(LogicalAndExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpLogAndExprContext extends LogicalAndExpressionContext {
		public LogicalAndExpressionContext left;
		public InclusiveOrExpressionContext right;
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public OpLogAndExprContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class TermLogAndExprContext extends LogicalAndExpressionContext {
		public InclusiveOrExpressionContext expr;
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TermLogAndExprContext(LogicalAndExpressionContext ctx) { copyFrom(ctx); }
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermLogAndExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(435);
			((TermLogAndExprContext)_localctx).expr = inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpLogAndExprContext(new LogicalAndExpressionContext(_parentctx, _parentState));
					((OpLogAndExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(437);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(438);
					match(AndAnd);
					setState(439);
					((OpLogAndExprContext)_localctx).right = inclusiveOrExpression(0);
					}
					} 
				}
				setState(444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
	 
		public LogicalOrExpressionContext() { }
		public void copyFrom(LogicalOrExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermLogOrExprContext extends LogicalOrExpressionContext {
		public LogicalAndExpressionContext expr;
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public TermLogOrExprContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OpLogOrExprContext extends LogicalOrExpressionContext {
		public LogicalOrExpressionContext left;
		public LogicalAndExpressionContext right;
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public OpLogOrExprContext(LogicalOrExpressionContext ctx) { copyFrom(ctx); }
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new TermLogOrExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(446);
			((TermLogOrExprContext)_localctx).expr = logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(453);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpLogOrExprContext(new LogicalOrExpressionContext(_parentctx, _parentState));
					((OpLogOrExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(448);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(449);
					match(OrOr);
					setState(450);
					((OpLogOrExprContext)_localctx).right = logicalAndExpression(0);
					}
					} 
				}
				setState(455);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext cond;
		public ExpressionContext true_exec;
		public ConditionalExpressionContext false_exec;
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			((ConditionalExpressionContext)_localctx).cond = logicalOrExpression(0);
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(457);
				match(Question);
				setState(458);
				((ConditionalExpressionContext)_localctx).true_exec = expression(0);
				setState(459);
				match(Colon);
				setState(460);
				((ConditionalExpressionContext)_localctx).false_exec = conditionalExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
	 
		public AssignmentExpressionContext() { }
		public void copyFrom(AssignmentExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermAssgnExprContext extends AssignmentExpressionContext {
		public ConditionalExpressionContext expr;
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public TermAssgnExprContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class DigitSeqAssgnExprContext extends AssignmentExpressionContext {
		public Token expr;
		public TerminalNode DigitSequence() { return getToken(CParser.DigitSequence, 0); }
		public DigitSeqAssgnExprContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class OpAssgnExprContext extends AssignmentExpressionContext {
		public UnaryExpressionContext left;
		public AssignmentOperatorContext op;
		public AssignmentExpressionContext right;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public OpAssgnExprContext(AssignmentExpressionContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignmentExpression);
		try {
			setState(470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new TermAssgnExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				((TermAssgnExprContext)_localctx).expr = conditionalExpression();
				}
				break;
			case 2:
				_localctx = new OpAssgnExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				((OpAssgnExprContext)_localctx).left = unaryExpression();
				setState(466);
				((OpAssgnExprContext)_localctx).op = assignmentOperator();
				setState(467);
				((OpAssgnExprContext)_localctx).right = assignmentExpression();
				}
				break;
			case 3:
				_localctx = new DigitSeqAssgnExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(469);
				((DigitSeqAssgnExprContext)_localctx).expr = match(DigitSequence);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(CParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(CParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(CParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(CParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(CParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(CParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(CParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(CParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(CParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(CParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(CParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (Assign - 87)) | (1L << (StarAssign - 87)) | (1L << (DivAssign - 87)) | (1L << (ModAssign - 87)) | (1L << (PlusAssign - 87)) | (1L << (MinusAssign - 87)) | (1L << (LeftShiftAssign - 87)) | (1L << (RightShiftAssign - 87)) | (1L << (AndAssign - 87)) | (1L << (XorAssign - 87)) | (1L << (OrAssign - 87)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleExprContext extends ExpressionContext {
		public AssignmentExpressionContext expr;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public SingleExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultExprContext extends ExpressionContext {
		public ExpressionContext left;
		public AssignmentExpressionContext right;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public MultExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(475);
			((SingleExprContext)_localctx).expr = assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultExprContext(new ExpressionContext(_parentctx, _parentState));
					((MultExprContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(477);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(478);
					match(Comma);
					setState(479);
					((MultExprContext)_localctx).right = assignmentExpression();
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext expr;
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			((ConstantExpressionContext)_localctx).expr = conditionalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SpecDeclarationContext extends DeclarationContext {
		public DeclarationSpecifiersContext spec;
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public SpecDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class StaticDeclarationContext extends DeclarationContext {
		public StaticAssertDeclarationContext dec;
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public StaticDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class InitSpecDeclarationContext extends DeclarationContext {
		public DeclarationSpecifiersContext spec;
		public InitDeclaratorListContext initList;
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public InitSpecDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declaration);
		try {
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new InitSpecDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				((InitSpecDeclarationContext)_localctx).spec = declarationSpecifiers();
				setState(488);
				((InitSpecDeclarationContext)_localctx).initList = initDeclaratorList(0);
				setState(489);
				match(Semi);
				}
				break;
			case 2:
				_localctx = new SpecDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				((SpecDeclarationContext)_localctx).spec = declarationSpecifiers();
				setState(492);
				match(Semi);
				}
				break;
			case 3:
				_localctx = new StaticDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(494);
				((StaticDeclarationContext)_localctx).dec = staticAssertDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public DeclarationSpecifierContext dec;
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(498); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(497);
					((DeclarationSpecifiersContext)_localctx).dec = declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(500); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public DeclarationSpecifierContext dec;
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_declarationSpecifiers2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(502);
					((DeclarationSpecifiers2Context)_localctx).dec = declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(505); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
	 
		public DeclarationSpecifierContext() { }
		public void copyFrom(DeclarationSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ClassDecSpecContext extends DeclarationSpecifierContext {
		public StorageClassSpecifierContext type;
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public ClassDecSpecContext(DeclarationSpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class TypeSpecDecSpecContext extends DeclarationSpecifierContext {
		public TypeSpecifierContext type;
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeSpecDecSpecContext(DeclarationSpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class AlignDecSpecContext extends DeclarationSpecifierContext {
		public AlignmentSpecifierContext type;
		public AlignmentSpecifierContext alignmentSpecifier() {
			return getRuleContext(AlignmentSpecifierContext.class,0);
		}
		public AlignDecSpecContext(DeclarationSpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class TypeQualDecSpecContext extends DeclarationSpecifierContext {
		public TypeQualifierContext type;
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TypeQualDecSpecContext(DeclarationSpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class FuncDecSpecContext extends DeclarationSpecifierContext {
		public FunctionSpecifierContext type;
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public FuncDecSpecContext(DeclarationSpecifierContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declarationSpecifier);
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new ClassDecSpecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				((ClassDecSpecContext)_localctx).type = storageClassSpecifier();
				}
				break;
			case 2:
				_localctx = new TypeSpecDecSpecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				((TypeSpecDecSpecContext)_localctx).type = typeSpecifier(0);
				}
				break;
			case 3:
				_localctx = new TypeQualDecSpecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(509);
				((TypeQualDecSpecContext)_localctx).type = typeQualifier();
				}
				break;
			case 4:
				_localctx = new FuncDecSpecContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(510);
				((FuncDecSpecContext)_localctx).type = functionSpecifier();
				}
				break;
			case 5:
				_localctx = new AlignDecSpecContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(511);
				((AlignDecSpecContext)_localctx).type = alignmentSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
	 
		public InitDeclaratorListContext() { }
		public void copyFrom(InitDeclaratorListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleInitDecListContext extends InitDeclaratorListContext {
		public InitDeclaratorContext dec;
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public SingleInitDecListContext(InitDeclaratorListContext ctx) { copyFrom(ctx); }
	}
	public static class MultInitDecListContext extends InitDeclaratorListContext {
		public InitDeclaratorListContext decL;
		public InitDeclaratorContext dec;
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public MultInitDecListContext(InitDeclaratorListContext ctx) { copyFrom(ctx); }
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		return initDeclaratorList(0);
	}

	private InitDeclaratorListContext initDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, _parentState);
		InitDeclaratorListContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_initDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleInitDecListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(515);
			((SingleInitDecListContext)_localctx).dec = initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(522);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultInitDecListContext(new InitDeclaratorListContext(_parentctx, _parentState));
					((MultInitDecListContext)_localctx).decL = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(517);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(518);
					match(Comma);
					setState(519);
					((MultInitDecListContext)_localctx).dec = initDeclarator();
					}
					} 
				}
				setState(524);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
	 
		public InitDeclaratorContext() { }
		public void copyFrom(InitDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpInitDecContext extends InitDeclaratorContext {
		public DeclaratorContext left;
		public InitializerContext right;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public OpInitDecContext(InitDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class TermInitDecContext extends InitDeclaratorContext {
		public DeclaratorContext dec;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TermInitDecContext(InitDeclaratorContext ctx) { copyFrom(ctx); }
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_initDeclarator);
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new TermInitDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				((TermInitDecContext)_localctx).dec = declarator();
				}
				break;
			case 2:
				_localctx = new OpInitDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				((OpInitDecContext)_localctx).left = declarator();
				setState(527);
				match(Assign);
				setState(528);
				((OpInitDecContext)_localctx).right = initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
	 
		public StorageClassSpecifierContext() { }
		public void copyFrom(StorageClassSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeDefStorageClassSpecContext extends StorageClassSpecifierContext {
		public Token type;
		public TypeDefStorageClassSpecContext(StorageClassSpecifierContext ctx) { copyFrom(ctx); }
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_storageClassSpecifier);
		int _la;
		try {
			_localctx = new TypeDefStorageClassSpecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			((TypeDefStorageClassSpecContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Auto) | (1L << Extern) | (1L << Register) | (1L << Static) | (1L << Typedef) | (1L << ThreadLocal))) != 0)) ) {
				((TypeDefStorageClassSpecContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
	 
		public TypeSpecifierContext() { }
		public void copyFrom(TypeSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeOfSpecContext extends TypeSpecifierContext {
		public Token type;
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TypeOfSpecContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class TypeDefSpecContext extends TypeSpecifierContext {
		public TypedefNameContext type;
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public TypeDefSpecContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class BaseTypeSpecContext extends TypeSpecifierContext {
		public Token type;
		public BaseTypeSpecContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class ExtensionTypeSpecContext extends TypeSpecifierContext {
		public ExtensionTypeSpecContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class TypePointerSpecContext extends TypeSpecifierContext {
		public TypeSpecifierContext type;
		public PointerContext ptr;
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypePointerSpecContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class AtomicTypeSpecContext extends TypeSpecifierContext {
		public AtomicTypeSpecifierContext type;
		public AtomicTypeSpecifierContext atomicTypeSpecifier() {
			return getRuleContext(AtomicTypeSpecifierContext.class,0);
		}
		public AtomicTypeSpecContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class StructTypeSpecContext extends TypeSpecifierContext {
		public StructOrUnionSpecifierContext type;
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public StructTypeSpecContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class EnumTypeSpecContext extends TypeSpecifierContext {
		public EnumSpecifierContext type;
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public EnumTypeSpecContext(TypeSpecifierContext ctx) { copyFrom(ctx); }
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		return typeSpecifier(0);
	}

	private TypeSpecifierContext typeSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, _parentState);
		TypeSpecifierContext _prevctx = _localctx;
		int _startState = 62;
		enterRecursionRule(_localctx, 62, RULE_typeSpecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case T__5:
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Complex:
				{
				_localctx = new BaseTypeSpecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(535);
				((BaseTypeSpecContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void) | (1L << Bool) | (1L << Complex))) != 0)) ) {
					((BaseTypeSpecContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__0:
				{
				_localctx = new ExtensionTypeSpecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(536);
				match(T__0);
				setState(537);
				match(LeftParen);
				setState(538);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(539);
				match(RightParen);
				}
				break;
			case Atomic:
				{
				_localctx = new AtomicTypeSpecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(540);
				((AtomicTypeSpecContext)_localctx).type = atomicTypeSpecifier();
				}
				break;
			case Struct:
			case Union:
				{
				_localctx = new StructTypeSpecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(541);
				((StructTypeSpecContext)_localctx).type = structOrUnionSpecifier();
				}
				break;
			case Enum:
				{
				_localctx = new EnumTypeSpecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(542);
				((EnumTypeSpecContext)_localctx).type = enumSpecifier();
				}
				break;
			case Identifier:
				{
				_localctx = new TypeDefSpecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(543);
				((TypeDefSpecContext)_localctx).type = typedefName();
				}
				break;
			case T__6:
				{
				_localctx = new TypeOfSpecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(544);
				((TypeOfSpecContext)_localctx).type = match(T__6);
				setState(545);
				match(LeftParen);
				setState(546);
				constantExpression();
				setState(547);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypePointerSpecContext(new TypeSpecifierContext(_parentctx, _parentState));
					((TypePointerSpecContext)_localctx).type = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_typeSpecifier);
					setState(551);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(552);
					((TypePointerSpecContext)_localctx).ptr = pointer();
					}
					} 
				}
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
	 
		public StructOrUnionSpecifierContext() { }
		public void copyFrom(StructOrUnionSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecStructUnSpecContext extends StructOrUnionSpecifierContext {
		public StructOrUnionContext ojb;
		public Token id;
		public StructDeclarationListContext decL;
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public DecStructUnSpecContext(StructOrUnionSpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class SingleStructUnSpecContext extends StructOrUnionSpecifierContext {
		public StructOrUnionContext obj;
		public Token id;
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public SingleStructUnSpecContext(StructOrUnionSpecifierContext ctx) { copyFrom(ctx); }
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new DecStructUnSpecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				((DecStructUnSpecContext)_localctx).ojb = structOrUnion();
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(559);
					((DecStructUnSpecContext)_localctx).id = match(Identifier);
					}
				}

				setState(562);
				match(LeftBrace);
				setState(563);
				((DecStructUnSpecContext)_localctx).decL = structDeclarationList(0);
				setState(564);
				match(RightBrace);
				}
				break;
			case 2:
				_localctx = new SingleStructUnSpecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				((SingleStructUnSpecContext)_localctx).obj = structOrUnion();
				setState(567);
				((SingleStructUnSpecContext)_localctx).id = match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructOrUnionContext extends ParserRuleContext {
		public Token id;
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			((StructOrUnionContext)_localctx).id = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Struct || _la==Union) ) {
				((StructOrUnionContext)_localctx).id = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationListContext extends ParserRuleContext {
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
	 
		public StructDeclarationListContext() { }
		public void copyFrom(StructDeclarationListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultStructDecListContext extends StructDeclarationListContext {
		public StructDeclarationListContext decL;
		public StructDeclarationContext dec;
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public MultStructDecListContext(StructDeclarationListContext ctx) { copyFrom(ctx); }
	}
	public static class SingleStructDecListContext extends StructDeclarationListContext {
		public StructDeclarationContext dec;
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public SingleStructDecListContext(StructDeclarationListContext ctx) { copyFrom(ctx); }
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		return structDeclarationList(0);
	}

	private StructDeclarationListContext structDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, _parentState);
		StructDeclarationListContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_structDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleStructDecListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(574);
			((SingleStructDecListContext)_localctx).dec = structDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultStructDecListContext(new StructDeclarationListContext(_parentctx, _parentState));
					((MultStructDecListContext)_localctx).decL = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclarationList);
					setState(576);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(577);
					((MultStructDecListContext)_localctx).dec = structDeclaration();
					}
					} 
				}
				setState(582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
	 
		public StructDeclarationContext() { }
		public void copyFrom(StructDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleStructDecContext extends StructDeclarationContext {
		public StaticAssertDeclarationContext dec;
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public SingleStructDecContext(StructDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class MulStructDecContext extends StructDeclarationContext {
		public SpecifierQualifierListContext specL;
		public StructDeclaratorListContext decL;
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public MulStructDecContext(StructDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_structDeclaration);
		int _la;
		try {
			setState(590);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				_localctx = new MulStructDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				((MulStructDecContext)_localctx).specL = specifierQualifierList();
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LeftParen - 57)) | (1L << (Star - 57)) | (1L << (Caret - 57)) | (1L << (Colon - 57)) | (1L << (Identifier - 57)))) != 0)) {
					{
					setState(584);
					((MulStructDecContext)_localctx).decL = structDeclaratorList(0);
					}
				}

				setState(587);
				match(Semi);
				}
				break;
			case StaticAssert:
				_localctx = new SingleStructDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				((SingleStructDecContext)_localctx).dec = staticAssertDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
	 
		public SpecifierQualifierListContext() { }
		public void copyFrom(SpecifierQualifierListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QualSpecQualListContext extends SpecifierQualifierListContext {
		public TypeQualifierContext type;
		public SpecifierQualifierListContext specL;
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public QualSpecQualListContext(SpecifierQualifierListContext ctx) { copyFrom(ctx); }
	}
	public static class SpecSpecQualListContext extends SpecifierQualifierListContext {
		public TypeSpecifierContext type;
		public SpecifierQualifierListContext specL;
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public SpecSpecQualListContext(SpecifierQualifierListContext ctx) { copyFrom(ctx); }
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_specifierQualifierList);
		try {
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new SpecSpecQualListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				((SpecSpecQualListContext)_localctx).type = typeSpecifier(0);
				setState(594);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(593);
					((SpecSpecQualListContext)_localctx).specL = specifierQualifierList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new QualSpecQualListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				((QualSpecQualListContext)_localctx).type = typeQualifier();
				setState(598);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(597);
					((QualSpecQualListContext)_localctx).specL = specifierQualifierList();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
	 
		public StructDeclaratorListContext() { }
		public void copyFrom(StructDeclaratorListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleStructDecrListContext extends StructDeclaratorListContext {
		public StructDeclaratorContext dec;
		public StructDeclaratorContext structDeclarator() {
			return getRuleContext(StructDeclaratorContext.class,0);
		}
		public SingleStructDecrListContext(StructDeclaratorListContext ctx) { copyFrom(ctx); }
	}
	public static class MulStructDecrListContext extends StructDeclaratorListContext {
		public StructDeclaratorListContext decL;
		public StructDeclaratorContext dec;
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StructDeclaratorContext structDeclarator() {
			return getRuleContext(StructDeclaratorContext.class,0);
		}
		public MulStructDecrListContext(StructDeclaratorListContext ctx) { copyFrom(ctx); }
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		return structDeclaratorList(0);
	}

	private StructDeclaratorListContext structDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, _parentState);
		StructDeclaratorListContext _prevctx = _localctx;
		int _startState = 74;
		enterRecursionRule(_localctx, 74, RULE_structDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleStructDecrListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(603);
			((SingleStructDecrListContext)_localctx).dec = structDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(610);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulStructDecrListContext(new StructDeclaratorListContext(_parentctx, _parentState));
					((MulStructDecrListContext)_localctx).decL = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclaratorList);
					setState(605);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(606);
					match(Comma);
					setState(607);
					((MulStructDecrListContext)_localctx).dec = structDeclarator();
					}
					} 
				}
				setState(612);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructDeclaratorContext extends ParserRuleContext {
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
	 
		public StructDeclaratorContext() { }
		public void copyFrom(StructDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssgnStructDecContext extends StructDeclaratorContext {
		public DeclaratorContext dec;
		public ConstantExpressionContext expr;
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AssgnStructDecContext(StructDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class EmptyStructDecContext extends StructDeclaratorContext {
		public DeclaratorContext dec;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public EmptyStructDecContext(StructDeclaratorContext ctx) { copyFrom(ctx); }
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_structDeclarator);
		int _la;
		try {
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new EmptyStructDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				((EmptyStructDecContext)_localctx).dec = declarator();
				}
				break;
			case 2:
				_localctx = new AssgnStructDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LeftParen - 57)) | (1L << (Star - 57)) | (1L << (Caret - 57)) | (1L << (Identifier - 57)))) != 0)) {
					{
					setState(614);
					((AssgnStructDecContext)_localctx).dec = declarator();
					}
				}

				setState(617);
				match(Colon);
				setState(618);
				((AssgnStructDecContext)_localctx).expr = constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumSpecifierContext extends ParserRuleContext {
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
	 
		public EnumSpecifierContext() { }
		public void copyFrom(EnumSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyEnumSpecContext extends EnumSpecifierContext {
		public Token id;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public EmptyEnumSpecContext(EnumSpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class DecEnumSpecContext extends EnumSpecifierContext {
		public Token id;
		public EnumeratorListContext enumL;
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public DecEnumSpecContext(EnumSpecifierContext ctx) { copyFrom(ctx); }
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_enumSpecifier);
		int _la;
		try {
			setState(634);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new DecEnumSpecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				match(Enum);
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(622);
					((DecEnumSpecContext)_localctx).id = match(Identifier);
					}
				}

				setState(625);
				match(LeftBrace);
				setState(626);
				((DecEnumSpecContext)_localctx).enumL = enumeratorList(0);
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(627);
					match(Comma);
					}
				}

				setState(630);
				match(RightBrace);
				}
				break;
			case 2:
				_localctx = new EmptyEnumSpecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				match(Enum);
				setState(633);
				((EmptyEnumSpecContext)_localctx).id = match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorListContext extends ParserRuleContext {
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
	 
		public EnumeratorListContext() { }
		public void copyFrom(EnumeratorListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleEnumListContext extends EnumeratorListContext {
		public EnumeratorContext enume;
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public SingleEnumListContext(EnumeratorListContext ctx) { copyFrom(ctx); }
	}
	public static class MultEnumListContext extends EnumeratorListContext {
		public EnumeratorListContext enumL;
		public EnumeratorContext enume;
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public MultEnumListContext(EnumeratorListContext ctx) { copyFrom(ctx); }
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		return enumeratorList(0);
	}

	private EnumeratorListContext enumeratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, _parentState);
		EnumeratorListContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_enumeratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleEnumListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(637);
			((SingleEnumListContext)_localctx).enume = enumerator();
			}
			_ctx.stop = _input.LT(-1);
			setState(644);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultEnumListContext(new EnumeratorListContext(_parentctx, _parentState));
					((MultEnumListContext)_localctx).enumL = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorList);
					setState(639);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(640);
					match(Comma);
					setState(641);
					((MultEnumListContext)_localctx).enume = enumerator();
					}
					} 
				}
				setState(646);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
	 
		public EnumeratorContext() { }
		public void copyFrom(EnumeratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyEnumContext extends EnumeratorContext {
		public EnumerationConstantContext enume;
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public EmptyEnumContext(EnumeratorContext ctx) { copyFrom(ctx); }
	}
	public static class AssgnEnumContext extends EnumeratorContext {
		public EnumerationConstantContext enume;
		public ConstantExpressionContext expr;
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AssgnEnumContext(EnumeratorContext ctx) { copyFrom(ctx); }
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_enumerator);
		try {
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				_localctx = new EmptyEnumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				((EmptyEnumContext)_localctx).enume = enumerationConstant();
				}
				break;
			case 2:
				_localctx = new AssgnEnumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				((AssgnEnumContext)_localctx).enume = enumerationConstant();
				setState(649);
				match(Assign);
				setState(650);
				((AssgnEnumContext)_localctx).expr = constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumerationConstantContext extends ParserRuleContext {
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
	 
		public EnumerationConstantContext() { }
		public void copyFrom(EnumerationConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EnumConstContext extends EnumerationConstantContext {
		public Token id;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public EnumConstContext(EnumerationConstantContext ctx) { copyFrom(ctx); }
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_enumerationConstant);
		try {
			_localctx = new EnumConstContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			((EnumConstContext)_localctx).id = match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicTypeSpecifierContext extends ParserRuleContext {
		public TypeNameContext type;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeSpecifier; }
	}

	public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
		AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			match(Atomic);
			setState(657);
			match(LeftParen);
			setState(658);
			((AtomicTypeSpecifierContext)_localctx).type = typeName();
			setState(659);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierContext extends ParserRuleContext {
		public Token type;
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			((TypeQualifierContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) ) {
				((TypeQualifierContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
	 
		public FunctionSpecifierContext() { }
		public void copyFrom(FunctionSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BaseFuncSpecContext extends FunctionSpecifierContext {
		public Token spec;
		public BaseFuncSpecContext(FunctionSpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class DeclFuncSpecContext extends FunctionSpecifierContext {
		public Token id;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public DeclFuncSpecContext(FunctionSpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class GccFuncSpecContext extends FunctionSpecifierContext {
		public GccAttributeSpecifierContext spec;
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public GccFuncSpecContext(FunctionSpecifierContext ctx) { copyFrom(ctx); }
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_functionSpecifier);
		int _la;
		try {
			setState(669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case Inline:
			case Noreturn:
				_localctx = new BaseFuncSpecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				((BaseFuncSpecContext)_localctx).spec = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << Inline) | (1L << Noreturn))) != 0)) ) {
					((BaseFuncSpecContext)_localctx).spec = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__11:
				_localctx = new GccFuncSpecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(664);
				((GccFuncSpecContext)_localctx).spec = gccAttributeSpecifier();
				}
				break;
			case T__9:
				_localctx = new DeclFuncSpecContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(665);
				match(T__9);
				setState(666);
				match(LeftParen);
				setState(667);
				((DeclFuncSpecContext)_localctx).id = match(Identifier);
				setState(668);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentSpecifierContext extends ParserRuleContext {
		public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentSpecifier; }
	 
		public AlignmentSpecifierContext() { }
		public void copyFrom(AlignmentSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeAlignSpecContext extends AlignmentSpecifierContext {
		public TypeNameContext type;
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeAlignSpecContext(AlignmentSpecifierContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAlignSpecContext extends AlignmentSpecifierContext {
		public ConstantExpressionContext expr;
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public ExprAlignSpecContext(AlignmentSpecifierContext ctx) { copyFrom(ctx); }
	}

	public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
		AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_alignmentSpecifier);
		try {
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new TypeAlignSpecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				match(Alignas);
				setState(672);
				match(LeftParen);
				setState(673);
				((TypeAlignSpecContext)_localctx).type = typeName();
				setState(674);
				match(RightParen);
				}
				break;
			case 2:
				_localctx = new ExprAlignSpecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				match(Alignas);
				setState(677);
				match(LeftParen);
				setState(678);
				((ExprAlignSpecContext)_localctx).expr = constantExpression();
				setState(679);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public PointerContext ptr;
		public DirectDeclaratorContext directDec;
		public GccDeclaratorExtensionContext gcc;
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_declarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(683);
				((DeclaratorContext)_localctx).ptr = pointer();
				}
			}

			setState(686);
			((DeclaratorContext)_localctx).directDec = directDeclarator(0);
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(687);
					((DeclaratorContext)_localctx).gcc = gccDeclaratorExtension();
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
	 
		public DirectDeclaratorContext() { }
		public void copyFrom(DirectDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdDirDecContext extends DirectDeclaratorContext {
		public Token id;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public IdDirDecContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class SqArrDirDecContext extends DirectDeclaratorContext {
		public DirectDeclaratorContext dec;
		public TypeQualifierListContext qualL;
		public AssignmentExpressionContext expr;
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public SqArrDirDecContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class QsArrDirDecContext extends DirectDeclaratorContext {
		public DirectDeclaratorContext dec;
		public TypeQualifierListContext qualL;
		public AssignmentExpressionContext expr;
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public QsArrDirDecContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class QArrDirDecContext extends DirectDeclaratorContext {
		public DirectDeclaratorContext dec;
		public TypeQualifierListContext qualL;
		public AssignmentExpressionContext expr;
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public QArrDirDecContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class IdlDirDecContext extends DirectDeclaratorContext {
		public DirectDeclaratorContext dec;
		public IdentifierListContext idL;
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public IdlDirDecContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class ParDirDecContext extends DirectDeclaratorContext {
		public DeclaratorContext decl;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public ParDirDecContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class DsDirDecContext extends DirectDeclaratorContext {
		public Token id;
		public Token seq;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TerminalNode DigitSequence() { return getToken(CParser.DigitSequence, 0); }
		public DsDirDecContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class EArrDirDecContext extends DirectDeclaratorContext {
		public DirectDeclaratorContext dec;
		public TypeQualifierListContext qualL;
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public EArrDirDecContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class ParamlDirDecContext extends DirectDeclaratorContext {
		public DirectDeclaratorContext dec;
		public ParameterTypeListContext paramL;
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public ParamlDirDecContext(DirectDeclaratorContext ctx) { copyFrom(ctx); }
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				_localctx = new IdDirDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(694);
				((IdDirDecContext)_localctx).id = match(Identifier);
				}
				break;
			case 2:
				{
				_localctx = new ParDirDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(695);
				match(LeftParen);
				setState(696);
				((ParDirDecContext)_localctx).decl = declarator();
				setState(697);
				match(RightParen);
				}
				break;
			case 3:
				{
				_localctx = new DsDirDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(699);
				((DsDirDecContext)_localctx).id = match(Identifier);
				setState(700);
				match(Colon);
				setState(701);
				((DsDirDecContext)_localctx).seq = match(DigitSequence);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(749);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(747);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
					case 1:
						{
						_localctx = new QArrDirDecContext(new DirectDeclaratorContext(_parentctx, _parentState));
						((QArrDirDecContext)_localctx).dec = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(704);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(705);
						match(LeftBracket);
						setState(707);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(706);
							((QArrDirDecContext)_localctx).qualL = typeQualifierList(0);
							}
						}

						setState(710);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Plus - 69)) | (1L << (PlusPlus - 69)) | (1L << (Minus - 69)) | (1L << (MinusMinus - 69)) | (1L << (Star - 69)) | (1L << (And - 69)) | (1L << (AndAnd - 69)) | (1L << (Not - 69)) | (1L << (Tilde - 69)) | (1L << (Identifier - 69)) | (1L << (Constant - 69)) | (1L << (DigitSequence - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
							{
							setState(709);
							((QArrDirDecContext)_localctx).expr = assignmentExpression();
							}
						}

						setState(712);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new QsArrDirDecContext(new DirectDeclaratorContext(_parentctx, _parentState));
						((QsArrDirDecContext)_localctx).dec = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(713);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(714);
						match(LeftBracket);
						setState(715);
						match(Static);
						setState(717);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(716);
							((QsArrDirDecContext)_localctx).qualL = typeQualifierList(0);
							}
						}

						setState(719);
						((QsArrDirDecContext)_localctx).expr = assignmentExpression();
						setState(720);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new SqArrDirDecContext(new DirectDeclaratorContext(_parentctx, _parentState));
						((SqArrDirDecContext)_localctx).dec = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(722);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(723);
						match(LeftBracket);
						setState(724);
						((SqArrDirDecContext)_localctx).qualL = typeQualifierList(0);
						setState(725);
						match(Static);
						setState(726);
						((SqArrDirDecContext)_localctx).expr = assignmentExpression();
						setState(727);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new EArrDirDecContext(new DirectDeclaratorContext(_parentctx, _parentState));
						((EArrDirDecContext)_localctx).dec = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(729);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(730);
						match(LeftBracket);
						setState(732);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(731);
							((EArrDirDecContext)_localctx).qualL = typeQualifierList(0);
							}
						}

						setState(734);
						match(Star);
						setState(735);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new ParamlDirDecContext(new DirectDeclaratorContext(_parentctx, _parentState));
						((ParamlDirDecContext)_localctx).dec = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(736);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(737);
						match(LeftParen);
						setState(738);
						((ParamlDirDecContext)_localctx).paramL = parameterTypeList();
						setState(739);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new IdlDirDecContext(new DirectDeclaratorContext(_parentctx, _parentState));
						((IdlDirDecContext)_localctx).dec = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(741);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(742);
						match(LeftParen);
						setState(744);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(743);
							((IdlDirDecContext)_localctx).idL = identifierList(0);
							}
						}

						setState(746);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(751);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GccDeclaratorExtensionContext extends ParserRuleContext {
		public GccDeclaratorExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccDeclaratorExtension; }
	 
		public GccDeclaratorExtensionContext() { }
		public void copyFrom(GccDeclaratorExtensionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleGccDecExtContext extends GccDeclaratorExtensionContext {
		public Token id;
		public List<TerminalNode> StringLiteral() { return getTokens(CParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CParser.StringLiteral, i);
		}
		public SingleGccDecExtContext(GccDeclaratorExtensionContext ctx) { copyFrom(ctx); }
	}
	public static class MultGccDecExtContext extends GccDeclaratorExtensionContext {
		public GccAttributeSpecifierContext spec;
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public MultGccDecExtContext(GccDeclaratorExtensionContext ctx) { copyFrom(ctx); }
	}

	public final GccDeclaratorExtensionContext gccDeclaratorExtension() throws RecognitionException {
		GccDeclaratorExtensionContext _localctx = new GccDeclaratorExtensionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				_localctx = new SingleGccDecExtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				match(T__10);
				setState(753);
				match(LeftParen);
				setState(755); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(754);
					((SingleGccDecExtContext)_localctx).id = match(StringLiteral);
					}
					}
					setState(757); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(759);
				match(RightParen);
				}
				break;
			case T__11:
				_localctx = new MultGccDecExtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(760);
				((MultGccDecExtContext)_localctx).spec = gccAttributeSpecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeSpecifierContext extends ParserRuleContext {
		public GccAttributeListContext attL;
		public GccAttributeListContext gccAttributeList() {
			return getRuleContext(GccAttributeListContext.class,0);
		}
		public GccAttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeSpecifier; }
	}

	public final GccAttributeSpecifierContext gccAttributeSpecifier() throws RecognitionException {
		GccAttributeSpecifierContext _localctx = new GccAttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(763);
			match(T__11);
			setState(764);
			match(LeftParen);
			setState(765);
			match(LeftParen);
			setState(766);
			((GccAttributeSpecifierContext)_localctx).attL = gccAttributeList();
			setState(767);
			match(RightParen);
			setState(768);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeListContext extends ParserRuleContext {
		public GccAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeList; }
	 
		public GccAttributeListContext() { }
		public void copyFrom(GccAttributeListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyGccAttListContext extends GccAttributeListContext {
		public EmptyGccAttListContext(GccAttributeListContext ctx) { copyFrom(ctx); }
	}
	public static class GccAttListContext extends GccAttributeListContext {
		public GccAttributeContext att;
		public List<GccAttributeContext> gccAttribute() {
			return getRuleContexts(GccAttributeContext.class);
		}
		public GccAttributeContext gccAttribute(int i) {
			return getRuleContext(GccAttributeContext.class,i);
		}
		public GccAttListContext(GccAttributeListContext ctx) { copyFrom(ctx); }
	}

	public final GccAttributeListContext gccAttributeList() throws RecognitionException {
		GccAttributeListContext _localctx = new GccAttributeListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_gccAttributeList);
		int _la;
		try {
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				_localctx = new GccAttListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				((GccAttListContext)_localctx).att = gccAttribute();
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(771);
					match(Comma);
					setState(772);
					gccAttribute();
					}
					}
					setState(777);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new EmptyGccAttListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeContext extends ParserRuleContext {
		public GccAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttribute; }
	 
		public GccAttributeContext() { }
		public void copyFrom(GccAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultGccAttrContext extends GccAttributeContext {
		public ArgumentExpressionListContext argL;
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public MultGccAttrContext(GccAttributeContext ctx) { copyFrom(ctx); }
	}
	public static class EmptyGccAttrContext extends GccAttributeContext {
		public EmptyGccAttrContext(GccAttributeContext ctx) { copyFrom(ctx); }
	}

	public final GccAttributeContext gccAttribute() throws RecognitionException {
		GccAttributeContext _localctx = new GccAttributeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_gccAttribute);
		int _la;
		try {
			setState(790);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case Auto:
			case Break:
			case Case:
			case Char:
			case Const:
			case Continue:
			case Default:
			case Do:
			case Double:
			case Else:
			case Enum:
			case Extern:
			case Float:
			case For:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Struct:
			case Switch:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case While:
			case Alignas:
			case Alignof:
			case Atomic:
			case Bool:
			case Complex:
			case Generic:
			case Imaginary:
			case Noreturn:
			case StaticAssert:
			case ThreadLocal:
			case LeftBracket:
			case RightBracket:
			case LeftBrace:
			case RightBrace:
			case Less:
			case LessEqual:
			case Greater:
			case GreaterEqual:
			case LeftShift:
			case RightShift:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case Div:
			case Mod:
			case And:
			case Or:
			case AndAnd:
			case OrOr:
			case Caret:
			case Not:
			case Tilde:
			case Question:
			case Colon:
			case Semi:
			case Assign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case PlusAssign:
			case MinusAssign:
			case LeftShiftAssign:
			case RightShiftAssign:
			case AndAssign:
			case XorAssign:
			case OrAssign:
			case Equal:
			case NotEqual:
			case Arrow:
			case Dot:
			case Ellipsis:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
			case ComplexDefine:
			case IncludeDirective:
			case AsmBlock:
			case LineAfterPreprocessing:
			case LineDirective:
			case PragmaDirective:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				_localctx = new MultGccAttrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				_la = _input.LA(1);
				if ( _la <= 0 || (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LeftParen - 57)) | (1L << (RightParen - 57)) | (1L << (Comma - 57)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(782);
					match(LeftParen);
					setState(784);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Plus - 69)) | (1L << (PlusPlus - 69)) | (1L << (Minus - 69)) | (1L << (MinusMinus - 69)) | (1L << (Star - 69)) | (1L << (And - 69)) | (1L << (AndAnd - 69)) | (1L << (Not - 69)) | (1L << (Tilde - 69)) | (1L << (Identifier - 69)) | (1L << (Constant - 69)) | (1L << (DigitSequence - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
						{
						setState(783);
						((MultGccAttrContext)_localctx).argL = argumentExpressionList(0);
						}
					}

					setState(786);
					match(RightParen);
					}
				}

				}
				break;
			case RightParen:
			case Comma:
				_localctx = new EmptyGccAttrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public NestedParenthesesBlockContext block;
		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class,i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Imaginary) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBracket) | (1L << RightBracket) | (1L << LeftBrace) | (1L << RightBrace) | (1L << Less))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (IncludeDirective - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(797);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case Auto:
				case Break:
				case Case:
				case Char:
				case Const:
				case Continue:
				case Default:
				case Do:
				case Double:
				case Else:
				case Enum:
				case Extern:
				case Float:
				case For:
				case Goto:
				case If:
				case Inline:
				case Int:
				case Long:
				case Register:
				case Restrict:
				case Return:
				case Short:
				case Signed:
				case Sizeof:
				case Static:
				case Struct:
				case Switch:
				case Typedef:
				case Union:
				case Unsigned:
				case Void:
				case Volatile:
				case While:
				case Alignas:
				case Alignof:
				case Atomic:
				case Bool:
				case Complex:
				case Generic:
				case Imaginary:
				case Noreturn:
				case StaticAssert:
				case ThreadLocal:
				case LeftBracket:
				case RightBracket:
				case LeftBrace:
				case RightBrace:
				case Less:
				case LessEqual:
				case Greater:
				case GreaterEqual:
				case LeftShift:
				case RightShift:
				case Plus:
				case PlusPlus:
				case Minus:
				case MinusMinus:
				case Star:
				case Div:
				case Mod:
				case And:
				case Or:
				case AndAnd:
				case OrOr:
				case Caret:
				case Not:
				case Tilde:
				case Question:
				case Colon:
				case Semi:
				case Comma:
				case Assign:
				case StarAssign:
				case DivAssign:
				case ModAssign:
				case PlusAssign:
				case MinusAssign:
				case LeftShiftAssign:
				case RightShiftAssign:
				case AndAssign:
				case XorAssign:
				case OrAssign:
				case Equal:
				case NotEqual:
				case Arrow:
				case Dot:
				case Ellipsis:
				case Identifier:
				case Constant:
				case DigitSequence:
				case StringLiteral:
				case ComplexDefine:
				case IncludeDirective:
				case AsmBlock:
				case LineAfterPreprocessing:
				case LineDirective:
				case PragmaDirective:
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
					{
					setState(792);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LeftParen:
					{
					setState(793);
					match(LeftParen);
					setState(794);
					((NestedParenthesesBlockContext)_localctx).block = nestedParenthesesBlock();
					setState(795);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
	 
		public PointerContext() { }
		public void copyFrom(PointerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HPPointerContext extends PointerContext {
		public TypeQualifierListContext qualL;
		public PointerContext ptr;
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public HPPointerContext(PointerContext ctx) { copyFrom(ctx); }
	}
	public static class SPointerContext extends PointerContext {
		public TypeQualifierListContext qualL;
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public SPointerContext(PointerContext ctx) { copyFrom(ctx); }
	}
	public static class SPPointerContext extends PointerContext {
		public TypeQualifierListContext qualL;
		public PointerContext ptr;
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public SPPointerContext(PointerContext ctx) { copyFrom(ctx); }
	}
	public static class HPointerContext extends PointerContext {
		public TypeQualifierListContext qualL;
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public HPointerContext(PointerContext ctx) { copyFrom(ctx); }
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_pointer);
		int _la;
		try {
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				_localctx = new SPointerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				match(Star);
				setState(804);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(803);
					((SPointerContext)_localctx).qualL = typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new SPPointerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(806);
				match(Star);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(807);
					((SPPointerContext)_localctx).qualL = typeQualifierList(0);
					}
				}

				setState(810);
				((SPPointerContext)_localctx).ptr = pointer();
				}
				break;
			case 3:
				_localctx = new HPointerContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(811);
				match(Caret);
				setState(813);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(812);
					((HPointerContext)_localctx).qualL = typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new HPPointerContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(815);
				match(Caret);
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(816);
					((HPPointerContext)_localctx).qualL = typeQualifierList(0);
					}
				}

				setState(819);
				((HPPointerContext)_localctx).ptr = pointer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierListContext extends ParserRuleContext {
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		return typeQualifierList(0);
	}

	private TypeQualifierListContext typeQualifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, _parentState);
		TypeQualifierListContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_typeQualifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(823);
			typeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(829);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeQualifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeQualifierList);
					setState(825);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(826);
					typeQualifier();
					}
					} 
				}
				setState(831);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
	 
		public ParameterTypeListContext() { }
		public void copyFrom(ParameterTypeListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExtParamTypeListContext extends ParameterTypeListContext {
		public ParameterListContext paramL;
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ExtParamTypeListContext(ParameterTypeListContext ctx) { copyFrom(ctx); }
	}
	public static class SingleParamTypeListContext extends ParameterTypeListContext {
		public ParameterListContext paramL;
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public SingleParamTypeListContext(ParameterTypeListContext ctx) { copyFrom(ctx); }
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_parameterTypeList);
		try {
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				_localctx = new SingleParamTypeListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				((SingleParamTypeListContext)_localctx).paramL = parameterList(0);
				}
				break;
			case 2:
				_localctx = new ExtParamTypeListContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				((ExtParamTypeListContext)_localctx).paramL = parameterList(0);
				setState(834);
				match(Comma);
				setState(835);
				match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
	 
		public ParameterListContext() { }
		public void copyFrom(ParameterListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultParamListContext extends ParameterListContext {
		public ParameterListContext paramL;
		public ParameterDeclarationContext param;
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public MultParamListContext(ParameterListContext ctx) { copyFrom(ctx); }
	}
	public static class SingleParamListContext extends ParameterListContext {
		public ParameterDeclarationContext param;
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public SingleParamListContext(ParameterListContext ctx) { copyFrom(ctx); }
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		return parameterList(0);
	}

	private ParameterListContext parameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterListContext _localctx = new ParameterListContext(_ctx, _parentState);
		ParameterListContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleParamListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(840);
			((SingleParamListContext)_localctx).param = parameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(847);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultParamListContext(new ParameterListContext(_parentctx, _parentState));
					((MultParamListContext)_localctx).paramL = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(842);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(843);
					match(Comma);
					setState(844);
					((MultParamListContext)_localctx).param = parameterDeclaration();
					}
					} 
				}
				setState(849);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
	 
		public ParameterDeclarationContext() { }
		public void copyFrom(ParameterDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecParamDecContext extends ParameterDeclarationContext {
		public DeclarationSpecifiersContext spec;
		public DeclaratorContext dec;
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DecParamDecContext(ParameterDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class AbsParamDecContext extends ParameterDeclarationContext {
		public DeclarationSpecifiers2Context spec;
		public AbstractDeclaratorContext dec;
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public AbsParamDecContext(ParameterDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_parameterDeclaration);
		try {
			setState(857);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				_localctx = new DecParamDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
				((DecParamDecContext)_localctx).spec = declarationSpecifiers();
				setState(851);
				((DecParamDecContext)_localctx).dec = declarator();
				}
				break;
			case 2:
				_localctx = new AbsParamDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				((AbsParamDecContext)_localctx).spec = declarationSpecifiers2();
				setState(855);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(854);
					((AbsParamDecContext)_localctx).dec = abstractDeclarator();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	 
		public IdentifierListContext() { }
		public void copyFrom(IdentifierListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleIdListContext extends IdentifierListContext {
		public Token id;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public SingleIdListContext(IdentifierListContext ctx) { copyFrom(ctx); }
	}
	public static class MultIdListContext extends IdentifierListContext {
		public IdentifierListContext idL;
		public Token id;
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public MultIdListContext(IdentifierListContext ctx) { copyFrom(ctx); }
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleIdListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(860);
			((SingleIdListContext)_localctx).id = match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(867);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultIdListContext(new IdentifierListContext(_parentctx, _parentState));
					((MultIdListContext)_localctx).idL = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(862);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(863);
					match(Comma);
					setState(864);
					((MultIdListContext)_localctx).id = match(Identifier);
					}
					} 
				}
				setState(869);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext spec;
		public AbstractDeclaratorContext dec;
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			((TypeNameContext)_localctx).spec = specifierQualifierList();
			setState(872);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (LeftParen - 57)) | (1L << (LeftBracket - 57)) | (1L << (Star - 57)) | (1L << (Caret - 57)))) != 0)) {
				{
				setState(871);
				((TypeNameContext)_localctx).dec = abstractDeclarator();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
	 
		public AbstractDeclaratorContext() { }
		public void copyFrom(AbstractDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PtrGccAbsDecContext extends AbstractDeclaratorContext {
		public PointerContext ptr;
		public DirectAbstractDeclaratorContext dec;
		public GccDeclaratorExtensionContext gcc;
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public PtrGccAbsDecContext(AbstractDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class PtrAbsDecContext extends AbstractDeclaratorContext {
		public PointerContext ptr;
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public PtrAbsDecContext(AbstractDeclaratorContext ctx) { copyFrom(ctx); }
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_abstractDeclarator);
		int _la;
		try {
			int _alt;
			setState(885);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				_localctx = new PtrAbsDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
				((PtrAbsDecContext)_localctx).ptr = pointer();
				}
				break;
			case 2:
				_localctx = new PtrGccAbsDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(875);
					((PtrGccAbsDecContext)_localctx).ptr = pointer();
					}
				}

				setState(878);
				((PtrGccAbsDecContext)_localctx).dec = directAbstractDeclarator(0);
				setState(882);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(879);
						((PtrGccAbsDecContext)_localctx).gcc = gccDeclaratorExtension();
						}
						} 
					}
					setState(884);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
	 
		public DirectAbstractDeclaratorContext() { }
		public void copyFrom(DirectAbstractDeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QualDirAbsDecContext extends DirectAbstractDeclaratorContext {
		public TypeQualifierListContext qualL;
		public AssignmentExpressionContext expr;
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public QualDirAbsDecContext(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class DecParamDirAbsDecContext extends DirectAbstractDeclaratorContext {
		public DirectAbstractDeclaratorContext dec;
		public ParameterTypeListContext paramL;
		public GccDeclaratorExtensionContext gcc;
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public DecParamDirAbsDecContext(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class DecDirAbsDecContext extends DirectAbstractDeclaratorContext {
		public AbstractDeclaratorContext dec;
		public GccDeclaratorExtensionContext gcc;
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public DecDirAbsDecContext(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class DecQualDirAbsDecContext extends DirectAbstractDeclaratorContext {
		public DirectAbstractDeclaratorContext dec;
		public TypeQualifierListContext qualL;
		public AssignmentExpressionContext expr;
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public DecQualDirAbsDecContext(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class DecAddrDirAbsDecContext extends DirectAbstractDeclaratorContext {
		public DirectAbstractDeclaratorContext dec;
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DecAddrDirAbsDecContext(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class AddrDirAbsDecContext extends DirectAbstractDeclaratorContext {
		public AddrDirAbsDecContext(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class DecStaticQualDirAbsDecContext extends DirectAbstractDeclaratorContext {
		public DirectAbstractDeclaratorContext dec;
		public TypeQualifierListContext qualL;
		public AssignmentExpressionContext expr;
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public DecStaticQualDirAbsDecContext(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class QualStaticDirAbsDecContext extends DirectAbstractDeclaratorContext {
		public TypeQualifierListContext qualL;
		public AssignmentExpressionContext expr;
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public QualStaticDirAbsDecContext(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class DecQualStaticDirAbsDecContext extends DirectAbstractDeclaratorContext {
		public DirectAbstractDeclaratorContext dec;
		public TypeQualifierListContext qualL;
		public AssignmentExpressionContext expr;
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public DecQualStaticDirAbsDecContext(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class ParamDirAbsDecContext extends DirectAbstractDeclaratorContext {
		public ParameterTypeListContext paramL;
		public GccDeclaratorExtensionContext gcc;
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public ParamDirAbsDecContext(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class StaticQualDirAbsDecContext extends DirectAbstractDeclaratorContext {
		public TypeQualifierListContext qualL;
		public AssignmentExpressionContext expr;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public StaticQualDirAbsDecContext(DirectAbstractDeclaratorContext ctx) { copyFrom(ctx); }
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				_localctx = new DecDirAbsDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(888);
				match(LeftParen);
				setState(889);
				((DecDirAbsDecContext)_localctx).dec = abstractDeclarator();
				setState(890);
				match(RightParen);
				setState(894);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(891);
						((DecDirAbsDecContext)_localctx).gcc = gccDeclaratorExtension();
						}
						} 
					}
					setState(896);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				}
				}
				break;
			case 2:
				{
				_localctx = new QualDirAbsDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(897);
				match(LeftBracket);
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(898);
					((QualDirAbsDecContext)_localctx).qualL = typeQualifierList(0);
					}
				}

				setState(902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Plus - 69)) | (1L << (PlusPlus - 69)) | (1L << (Minus - 69)) | (1L << (MinusMinus - 69)) | (1L << (Star - 69)) | (1L << (And - 69)) | (1L << (AndAnd - 69)) | (1L << (Not - 69)) | (1L << (Tilde - 69)) | (1L << (Identifier - 69)) | (1L << (Constant - 69)) | (1L << (DigitSequence - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
					{
					setState(901);
					((QualDirAbsDecContext)_localctx).expr = assignmentExpression();
					}
				}

				setState(904);
				match(RightBracket);
				}
				break;
			case 3:
				{
				_localctx = new StaticQualDirAbsDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(905);
				match(LeftBracket);
				setState(906);
				match(Static);
				setState(908);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(907);
					((StaticQualDirAbsDecContext)_localctx).qualL = typeQualifierList(0);
					}
				}

				setState(910);
				((StaticQualDirAbsDecContext)_localctx).expr = assignmentExpression();
				setState(911);
				match(RightBracket);
				}
				break;
			case 4:
				{
				_localctx = new QualStaticDirAbsDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(913);
				match(LeftBracket);
				setState(914);
				((QualStaticDirAbsDecContext)_localctx).qualL = typeQualifierList(0);
				setState(915);
				match(Static);
				setState(916);
				((QualStaticDirAbsDecContext)_localctx).expr = assignmentExpression();
				setState(917);
				match(RightBracket);
				}
				break;
			case 5:
				{
				_localctx = new AddrDirAbsDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(919);
				match(LeftBracket);
				setState(920);
				match(Star);
				setState(921);
				match(RightBracket);
				}
				break;
			case 6:
				{
				_localctx = new ParamDirAbsDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(922);
				match(LeftParen);
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
					{
					setState(923);
					((ParamDirAbsDecContext)_localctx).paramL = parameterTypeList();
					}
				}

				setState(926);
				match(RightParen);
				setState(930);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(927);
						((ParamDirAbsDecContext)_localctx).gcc = gccDeclaratorExtension();
						}
						} 
					}
					setState(932);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(978);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(976);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
					case 1:
						{
						_localctx = new DecQualDirAbsDecContext(new DirectAbstractDeclaratorContext(_parentctx, _parentState));
						((DecQualDirAbsDecContext)_localctx).dec = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(935);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(936);
						match(LeftBracket);
						setState(938);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(937);
							((DecQualDirAbsDecContext)_localctx).qualL = typeQualifierList(0);
							}
						}

						setState(941);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Plus - 69)) | (1L << (PlusPlus - 69)) | (1L << (Minus - 69)) | (1L << (MinusMinus - 69)) | (1L << (Star - 69)) | (1L << (And - 69)) | (1L << (AndAnd - 69)) | (1L << (Not - 69)) | (1L << (Tilde - 69)) | (1L << (Identifier - 69)) | (1L << (Constant - 69)) | (1L << (DigitSequence - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
							{
							setState(940);
							((DecQualDirAbsDecContext)_localctx).expr = assignmentExpression();
							}
						}

						setState(943);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DecStaticQualDirAbsDecContext(new DirectAbstractDeclaratorContext(_parentctx, _parentState));
						((DecStaticQualDirAbsDecContext)_localctx).dec = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(944);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(945);
						match(LeftBracket);
						setState(946);
						match(Static);
						setState(948);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(947);
							((DecStaticQualDirAbsDecContext)_localctx).qualL = typeQualifierList(0);
							}
						}

						setState(950);
						((DecStaticQualDirAbsDecContext)_localctx).expr = assignmentExpression();
						setState(951);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DecQualStaticDirAbsDecContext(new DirectAbstractDeclaratorContext(_parentctx, _parentState));
						((DecQualStaticDirAbsDecContext)_localctx).dec = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(953);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(954);
						match(LeftBracket);
						setState(955);
						((DecQualStaticDirAbsDecContext)_localctx).qualL = typeQualifierList(0);
						setState(956);
						match(Static);
						setState(957);
						((DecQualStaticDirAbsDecContext)_localctx).expr = assignmentExpression();
						setState(958);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DecAddrDirAbsDecContext(new DirectAbstractDeclaratorContext(_parentctx, _parentState));
						((DecAddrDirAbsDecContext)_localctx).dec = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(960);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(961);
						match(LeftBracket);
						setState(962);
						match(Star);
						setState(963);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DecParamDirAbsDecContext(new DirectAbstractDeclaratorContext(_parentctx, _parentState));
						((DecParamDirAbsDecContext)_localctx).dec = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(964);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(965);
						match(LeftParen);
						setState(967);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
							{
							setState(966);
							((DecParamDirAbsDecContext)_localctx).paramL = parameterTypeList();
							}
						}

						setState(969);
						match(RightParen);
						setState(973);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(970);
								((DecParamDirAbsDecContext)_localctx).gcc = gccDeclaratorExtension();
								}
								} 
							}
							setState(975);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(980);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypedefNameContext extends ParserRuleContext {
		public Token id;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_typedefName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			((TypedefNameContext)_localctx).id = match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	 
		public InitializerContext() { }
		public void copyFrom(InitializerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssgnInitContext extends InitializerContext {
		public AssignmentExpressionContext expr;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public AssgnInitContext(InitializerContext ctx) { copyFrom(ctx); }
	}
	public static class ListInitContext extends InitializerContext {
		public InitializerListContext initL;
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public ListInitContext(InitializerContext ctx) { copyFrom(ctx); }
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_initializer);
		int _la;
		try {
			setState(991);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case Sizeof:
			case Alignof:
			case Generic:
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case AndAnd:
			case Not:
			case Tilde:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
				_localctx = new AssgnInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(983);
				((AssgnInitContext)_localctx).expr = assignmentExpression();
				}
				break;
			case LeftBrace:
				_localctx = new ListInitContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
				match(LeftBrace);
				setState(985);
				((ListInitContext)_localctx).initL = initializerList(0);
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(986);
					match(Comma);
					}
				}

				setState(989);
				match(RightBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
	 
		public InitializerListContext() { }
		public void copyFrom(InitializerListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultInitListContext extends InitializerListContext {
		public InitializerListContext initL;
		public DesignationContext des;
		public InitializerContext init;
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DesignationContext designation() {
			return getRuleContext(DesignationContext.class,0);
		}
		public MultInitListContext(InitializerListContext ctx) { copyFrom(ctx); }
	}
	public static class SingleInitListContext extends InitializerListContext {
		public DesignationContext des;
		public InitializerContext init;
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DesignationContext designation() {
			return getRuleContext(DesignationContext.class,0);
		}
		public SingleInitListContext(InitializerListContext ctx) { copyFrom(ctx); }
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		return initializerList(0);
	}

	private InitializerListContext initializerList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerListContext _localctx = new InitializerListContext(_ctx, _parentState);
		InitializerListContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_initializerList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleInitListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(994);
				((SingleInitListContext)_localctx).des = designation();
				}
			}

			setState(997);
			((SingleInitListContext)_localctx).init = initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(1007);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultInitListContext(new InitializerListContext(_parentctx, _parentState));
					((MultInitListContext)_localctx).initL = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_initializerList);
					setState(999);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1000);
					match(Comma);
					setState(1002);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(1001);
						((MultInitListContext)_localctx).des = designation();
						}
					}

					setState(1004);
					((MultInitListContext)_localctx).init = initializer();
					}
					} 
				}
				setState(1009);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext desL;
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			((DesignationContext)_localctx).desL = designatorList(0);
			setState(1011);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorListContext extends ParserRuleContext {
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
	 
		public DesignatorListContext() { }
		public void copyFrom(DesignatorListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleDesListContext extends DesignatorListContext {
		public DesignatorContext des;
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public SingleDesListContext(DesignatorListContext ctx) { copyFrom(ctx); }
	}
	public static class MultDesListContext extends DesignatorListContext {
		public DesignatorListContext desL;
		public DesignatorContext des;
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public MultDesListContext(DesignatorListContext ctx) { copyFrom(ctx); }
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		return designatorList(0);
	}

	private DesignatorListContext designatorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, _parentState);
		DesignatorListContext _prevctx = _localctx;
		int _startState = 134;
		enterRecursionRule(_localctx, 134, RULE_designatorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleDesListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1014);
			((SingleDesListContext)_localctx).des = designator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultDesListContext(new DesignatorListContext(_parentctx, _parentState));
					((MultDesListContext)_localctx).desL = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_designatorList);
					setState(1016);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1017);
					((MultDesListContext)_localctx).des = designator();
					}
					} 
				}
				setState(1022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
	 
		public DesignatorContext() { }
		public void copyFrom(DesignatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncDesContext extends DesignatorContext {
		public Token id;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public FuncDesContext(DesignatorContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayDesContext extends DesignatorContext {
		public ConstantExpressionContext expr;
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public ArrayDesContext(DesignatorContext ctx) { copyFrom(ctx); }
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_designator);
		try {
			setState(1029);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				_localctx = new ArrayDesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1023);
				match(LeftBracket);
				setState(1024);
				((ArrayDesContext)_localctx).expr = constantExpression();
				setState(1025);
				match(RightBracket);
				}
				break;
			case Dot:
				_localctx = new FuncDesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1027);
				match(Dot);
				setState(1028);
				((FuncDesContext)_localctx).id = match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public ConstantExpressionContext expr;
		public Token id;
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(CParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(CParser.StringLiteral, i);
		}
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1031);
			match(StaticAssert);
			setState(1032);
			match(LeftParen);
			setState(1033);
			((StaticAssertDeclarationContext)_localctx).expr = constantExpression();
			setState(1034);
			match(Comma);
			setState(1036); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1035);
				((StaticAssertDeclarationContext)_localctx).id = match(StringLiteral);
				}
				}
				setState(1038); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(1040);
			match(RightParen);
			setState(1041);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CmpStatContext extends StatementContext {
		public CompoundStatementContext stmt;
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public CmpStatContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class JumpStatContext extends StatementContext {
		public JumpStatementContext stmt;
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public JumpStatContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ExprStatContext extends StatementContext {
		public ExpressionStatementContext stmt;
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public ExprStatContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class IterStatContext extends StatementContext {
		public IterationStatementContext stmt;
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public IterStatContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SelectStatContext extends StatementContext {
		public SelectionStatementContext stmt;
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public SelectStatContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class LabelStatContext extends StatementContext {
		public LabeledStatementContext stmt;
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public LabelStatContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_statement);
		try {
			setState(1049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				_localctx = new LabelStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1043);
				((LabelStatContext)_localctx).stmt = labeledStatement();
				}
				break;
			case 2:
				_localctx = new CmpStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1044);
				((CmpStatContext)_localctx).stmt = compoundStatement();
				}
				break;
			case 3:
				_localctx = new ExprStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1045);
				((ExprStatContext)_localctx).stmt = expressionStatement();
				}
				break;
			case 4:
				_localctx = new SelectStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1046);
				((SelectStatContext)_localctx).stmt = selectionStatement();
				}
				break;
			case 5:
				_localctx = new IterStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1047);
				((IterStatContext)_localctx).stmt = iterationStatement();
				}
				break;
			case 6:
				_localctx = new JumpStatContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1048);
				((JumpStatContext)_localctx).stmt = jumpStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
	 
		public LabeledStatementContext() { }
		public void copyFrom(LabeledStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CaseLabelStatContext extends LabeledStatementContext {
		public ConstantExpressionContext cond;
		public StatementContext exec;
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CaseLabelStatContext(LabeledStatementContext ctx) { copyFrom(ctx); }
	}
	public static class DefLabelStatContext extends LabeledStatementContext {
		public StatementContext exec;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DefLabelStatContext(LabeledStatementContext ctx) { copyFrom(ctx); }
	}
	public static class IdLabelStatContext extends LabeledStatementContext {
		public Token id;
		public StatementContext exec;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IdLabelStatContext(LabeledStatementContext ctx) { copyFrom(ctx); }
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_labeledStatement);
		try {
			setState(1062);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				_localctx = new IdLabelStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1051);
				((IdLabelStatContext)_localctx).id = match(Identifier);
				setState(1052);
				match(Colon);
				setState(1053);
				((IdLabelStatContext)_localctx).exec = statement();
				}
				break;
			case Case:
				_localctx = new CaseLabelStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1054);
				match(Case);
				setState(1055);
				((CaseLabelStatContext)_localctx).cond = constantExpression();
				setState(1056);
				match(Colon);
				setState(1057);
				((CaseLabelStatContext)_localctx).exec = statement();
				}
				break;
			case Default:
				_localctx = new DefLabelStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1059);
				match(Default);
				setState(1060);
				match(Colon);
				setState(1061);
				((DefLabelStatContext)_localctx).exec = statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public BlockItemListContext itemL;
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			match(LeftBrace);
			setState(1066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen) | (1L << LeftBrace))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Plus - 69)) | (1L << (PlusPlus - 69)) | (1L << (Minus - 69)) | (1L << (MinusMinus - 69)) | (1L << (Star - 69)) | (1L << (And - 69)) | (1L << (AndAnd - 69)) | (1L << (Not - 69)) | (1L << (Tilde - 69)) | (1L << (Semi - 69)) | (1L << (Identifier - 69)) | (1L << (Constant - 69)) | (1L << (DigitSequence - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
				{
				setState(1065);
				((CompoundStatementContext)_localctx).itemL = blockItemList(0);
				}
			}

			setState(1068);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemListContext extends ParserRuleContext {
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
	 
		public BlockItemListContext() { }
		public void copyFrom(BlockItemListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultBlockItemListContext extends BlockItemListContext {
		public BlockItemListContext itemL;
		public BlockItemContext item;
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public MultBlockItemListContext(BlockItemListContext ctx) { copyFrom(ctx); }
	}
	public static class SingleBlockItemListContext extends BlockItemListContext {
		public BlockItemContext item;
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public SingleBlockItemListContext(BlockItemListContext ctx) { copyFrom(ctx); }
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 146;
		enterRecursionRule(_localctx, 146, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleBlockItemListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1071);
			((SingleBlockItemListContext)_localctx).item = blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(1077);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultBlockItemListContext(new BlockItemListContext(_parentctx, _parentState));
					((MultBlockItemListContext)_localctx).itemL = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(1073);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1074);
					((MultBlockItemListContext)_localctx).item = blockItem();
					}
					} 
				}
				setState(1079);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
	 
		public BlockItemContext() { }
		public void copyFrom(BlockItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatBlockItemContext extends BlockItemContext {
		public StatementContext item;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatBlockItemContext(BlockItemContext ctx) { copyFrom(ctx); }
	}
	public static class DecBlockItemContext extends BlockItemContext {
		public DeclarationContext item;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DecBlockItemContext(BlockItemContext ctx) { copyFrom(ctx); }
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_blockItem);
		try {
			setState(1082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				_localctx = new StatBlockItemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1080);
				((StatBlockItemContext)_localctx).item = statement();
				}
				break;
			case 2:
				_localctx = new DecBlockItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1081);
				((DecBlockItemContext)_localctx).item = declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Plus - 69)) | (1L << (PlusPlus - 69)) | (1L << (Minus - 69)) | (1L << (MinusMinus - 69)) | (1L << (Star - 69)) | (1L << (And - 69)) | (1L << (AndAnd - 69)) | (1L << (Not - 69)) | (1L << (Tilde - 69)) | (1L << (Identifier - 69)) | (1L << (Constant - 69)) | (1L << (DigitSequence - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
				{
				setState(1084);
				((ExpressionStatementContext)_localctx).expr = expression(0);
				}
			}

			setState(1087);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
	 
		public SelectionStatementContext() { }
		public void copyFrom(SelectionStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SwitchSelecStatContext extends SelectionStatementContext {
		public ExpressionContext cond;
		public StatementContext trueExec;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SwitchSelecStatContext(SelectionStatementContext ctx) { copyFrom(ctx); }
	}
	public static class IfSelecStatContext extends SelectionStatementContext {
		public ExpressionContext cond;
		public StatementContext trueExec;
		public StatementContext falseExec;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfSelecStatContext(SelectionStatementContext ctx) { copyFrom(ctx); }
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_selectionStatement);
		try {
			setState(1104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				_localctx = new IfSelecStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1089);
				match(If);
				setState(1090);
				match(LeftParen);
				setState(1091);
				((IfSelecStatContext)_localctx).cond = expression(0);
				setState(1092);
				match(RightParen);
				setState(1093);
				((IfSelecStatContext)_localctx).trueExec = statement();
				setState(1096);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(1094);
					match(Else);
					setState(1095);
					((IfSelecStatContext)_localctx).falseExec = statement();
					}
					break;
				}
				}
				break;
			case Switch:
				_localctx = new SwitchSelecStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1098);
				match(Switch);
				setState(1099);
				match(LeftParen);
				setState(1100);
				((SwitchSelecStatContext)_localctx).cond = expression(0);
				setState(1101);
				match(RightParen);
				setState(1102);
				((SwitchSelecStatContext)_localctx).trueExec = statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileIterStatContext extends IterationStatementContext {
		public ExpressionContext cond;
		public StatementContext exec;
		public TerminalNode While() { return getToken(CParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileIterStatContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ForIterStatContext extends IterationStatementContext {
		public ForConditionContext cond;
		public StatementContext exec;
		public TerminalNode For() { return getToken(CParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForIterStatContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}
	public static class DoIterStatContext extends IterationStatementContext {
		public StatementContext exec;
		public ExpressionContext cond;
		public TerminalNode Do() { return getToken(CParser.Do, 0); }
		public TerminalNode While() { return getToken(CParser.While, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoIterStatContext(IterationStatementContext ctx) { copyFrom(ctx); }
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_iterationStatement);
		try {
			setState(1126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				_localctx = new WhileIterStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1106);
				match(While);
				setState(1107);
				match(LeftParen);
				setState(1108);
				((WhileIterStatContext)_localctx).cond = expression(0);
				setState(1109);
				match(RightParen);
				setState(1110);
				((WhileIterStatContext)_localctx).exec = statement();
				}
				break;
			case Do:
				_localctx = new DoIterStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
				match(Do);
				setState(1113);
				((DoIterStatContext)_localctx).exec = statement();
				setState(1114);
				match(While);
				setState(1115);
				match(LeftParen);
				setState(1116);
				((DoIterStatContext)_localctx).cond = expression(0);
				setState(1117);
				match(RightParen);
				setState(1118);
				match(Semi);
				}
				break;
			case For:
				_localctx = new ForIterStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1120);
				match(For);
				setState(1121);
				match(LeftParen);
				setState(1122);
				((ForIterStatContext)_localctx).cond = forCondition();
				setState(1123);
				match(RightParen);
				setState(1124);
				((ForIterStatContext)_localctx).exec = statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionContext extends ParserRuleContext {
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
	 
		public ForConditionContext() { }
		public void copyFrom(ForConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecForCondContext extends ForConditionContext {
		public ForDeclarationContext init;
		public ForExpressionContext cond;
		public ForExpressionContext update;
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public DecForCondContext(ForConditionContext ctx) { copyFrom(ctx); }
	}
	public static class ExpForCondContext extends ForConditionContext {
		public ExpressionContext init;
		public ForExpressionContext cond;
		public ForExpressionContext update;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpForCondContext(ForConditionContext ctx) { copyFrom(ctx); }
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_forCondition);
		int _la;
		try {
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				_localctx = new DecForCondContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1128);
				((DecForCondContext)_localctx).init = forDeclaration();
				setState(1129);
				match(Semi);
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Plus - 69)) | (1L << (PlusPlus - 69)) | (1L << (Minus - 69)) | (1L << (MinusMinus - 69)) | (1L << (Star - 69)) | (1L << (And - 69)) | (1L << (AndAnd - 69)) | (1L << (Not - 69)) | (1L << (Tilde - 69)) | (1L << (Identifier - 69)) | (1L << (Constant - 69)) | (1L << (DigitSequence - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
					{
					setState(1130);
					((DecForCondContext)_localctx).cond = forExpression(0);
					}
				}

				setState(1133);
				match(Semi);
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Plus - 69)) | (1L << (PlusPlus - 69)) | (1L << (Minus - 69)) | (1L << (MinusMinus - 69)) | (1L << (Star - 69)) | (1L << (And - 69)) | (1L << (AndAnd - 69)) | (1L << (Not - 69)) | (1L << (Tilde - 69)) | (1L << (Identifier - 69)) | (1L << (Constant - 69)) | (1L << (DigitSequence - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
					{
					setState(1134);
					((DecForCondContext)_localctx).update = forExpression(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new ExpForCondContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Plus - 69)) | (1L << (PlusPlus - 69)) | (1L << (Minus - 69)) | (1L << (MinusMinus - 69)) | (1L << (Star - 69)) | (1L << (And - 69)) | (1L << (AndAnd - 69)) | (1L << (Not - 69)) | (1L << (Tilde - 69)) | (1L << (Identifier - 69)) | (1L << (Constant - 69)) | (1L << (DigitSequence - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
					{
					setState(1137);
					((ExpForCondContext)_localctx).init = expression(0);
					}
				}

				setState(1140);
				match(Semi);
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Plus - 69)) | (1L << (PlusPlus - 69)) | (1L << (Minus - 69)) | (1L << (MinusMinus - 69)) | (1L << (Star - 69)) | (1L << (And - 69)) | (1L << (AndAnd - 69)) | (1L << (Not - 69)) | (1L << (Tilde - 69)) | (1L << (Identifier - 69)) | (1L << (Constant - 69)) | (1L << (DigitSequence - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
					{
					setState(1141);
					((ExpForCondContext)_localctx).cond = forExpression(0);
					}
				}

				setState(1144);
				match(Semi);
				setState(1146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Plus - 69)) | (1L << (PlusPlus - 69)) | (1L << (Minus - 69)) | (1L << (MinusMinus - 69)) | (1L << (Star - 69)) | (1L << (And - 69)) | (1L << (AndAnd - 69)) | (1L << (Not - 69)) | (1L << (Tilde - 69)) | (1L << (Identifier - 69)) | (1L << (Constant - 69)) | (1L << (DigitSequence - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
					{
					setState(1145);
					((ExpForCondContext)_localctx).update = forExpression(0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForDeclarationContext extends ParserRuleContext {
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
	 
		public ForDeclarationContext() { }
		public void copyFrom(ForDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultForDecContext extends ForDeclarationContext {
		public DeclarationSpecifiersContext dec;
		public InitDeclaratorListContext init;
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public MultForDecContext(ForDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class SingleForDecContext extends ForDeclarationContext {
		public DeclarationSpecifiersContext dec;
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public SingleForDecContext(ForDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_forDeclaration);
		try {
			setState(1154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				_localctx = new MultForDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1150);
				((MultForDecContext)_localctx).dec = declarationSpecifiers();
				setState(1151);
				((MultForDecContext)_localctx).init = initDeclaratorList(0);
				}
				break;
			case 2:
				_localctx = new SingleForDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1153);
				((SingleForDecContext)_localctx).dec = declarationSpecifiers();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionContext extends ParserRuleContext {
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
	 
		public ForExpressionContext() { }
		public void copyFrom(ForExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleForExprContext extends ForExpressionContext {
		public AssignmentExpressionContext expr;
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public SingleForExprContext(ForExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultForExprContext extends ForExpressionContext {
		public ForExpressionContext forExp;
		public AssignmentExpressionContext expr;
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public MultForExprContext(ForExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		return forExpression(0);
	}

	private ForExpressionContext forExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, _parentState);
		ForExpressionContext _prevctx = _localctx;
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_forExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleForExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1157);
			((SingleForExprContext)_localctx).expr = assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultForExprContext(new ForExpressionContext(_parentctx, _parentState));
					((MultForExprContext)_localctx).forExp = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_forExpression);
					setState(1159);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1160);
					match(Comma);
					setState(1161);
					((MultForExprContext)_localctx).expr = assignmentExpression();
					}
					} 
				}
				setState(1166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
	 
		public JumpStatementContext() { }
		public void copyFrom(JumpStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ContinueJumpStatContext extends JumpStatementContext {
		public ContinueJumpStatContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class GotoExpJumpStatContext extends JumpStatementContext {
		public UnaryExpressionContext expr;
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public GotoExpJumpStatContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnJumpStatContext extends JumpStatementContext {
		public ExpressionContext expr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnJumpStatContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class GotoJumpStatContext extends JumpStatementContext {
		public Token id;
		public TerminalNode Identifier() { return getToken(CParser.Identifier, 0); }
		public GotoJumpStatContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}
	public static class BreakJumpStatContext extends JumpStatementContext {
		public BreakJumpStatContext(JumpStatementContext ctx) { copyFrom(ctx); }
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_jumpStatement);
		int _la;
		try {
			setState(1183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				_localctx = new GotoJumpStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1167);
				match(Goto);
				setState(1168);
				((GotoJumpStatContext)_localctx).id = match(Identifier);
				setState(1169);
				match(Semi);
				}
				break;
			case 2:
				_localctx = new ContinueJumpStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1170);
				match(Continue);
				setState(1171);
				match(Semi);
				}
				break;
			case 3:
				_localctx = new BreakJumpStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1172);
				match(Break);
				setState(1173);
				match(Semi);
				}
				break;
			case 4:
				_localctx = new ReturnJumpStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1174);
				match(Return);
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic) | (1L << LeftParen))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Plus - 69)) | (1L << (PlusPlus - 69)) | (1L << (Minus - 69)) | (1L << (MinusMinus - 69)) | (1L << (Star - 69)) | (1L << (And - 69)) | (1L << (AndAnd - 69)) | (1L << (Not - 69)) | (1L << (Tilde - 69)) | (1L << (Identifier - 69)) | (1L << (Constant - 69)) | (1L << (DigitSequence - 69)) | (1L << (StringLiteral - 69)))) != 0)) {
					{
					setState(1175);
					((ReturnJumpStatContext)_localctx).expr = expression(0);
					}
				}

				setState(1178);
				match(Semi);
				}
				break;
			case 5:
				_localctx = new GotoExpJumpStatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1179);
				match(Goto);
				setState(1180);
				((GotoExpJumpStatContext)_localctx).expr = unaryExpression();
				setState(1181);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TranslationUnitContext tu;
		public TerminalNode EOF() { return getToken(CParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal) | (1L << LeftParen))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (Star - 73)) | (1L << (Caret - 73)) | (1L << (Semi - 73)) | (1L << (Identifier - 73)))) != 0)) {
				{
				setState(1185);
				((CompilationUnitContext)_localctx).tu = translationUnit(0);
				}
			}

			setState(1188);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
	 
		public TranslationUnitContext() { }
		public void copyFrom(TranslationUnitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleTransUnitContext extends TranslationUnitContext {
		public ExternalDeclarationContext dec;
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public SingleTransUnitContext(TranslationUnitContext ctx) { copyFrom(ctx); }
	}
	public static class MultTransUnitContext extends TranslationUnitContext {
		public TranslationUnitContext tu;
		public ExternalDeclarationContext dec;
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public MultTransUnitContext(TranslationUnitContext ctx) { copyFrom(ctx); }
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		return translationUnit(0);
	}

	private TranslationUnitContext translationUnit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, _parentState);
		TranslationUnitContext _prevctx = _localctx;
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_translationUnit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleTransUnitContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1191);
			((SingleTransUnitContext)_localctx).dec = externalDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultTransUnitContext(new TranslationUnitContext(_parentctx, _parentState));
					((MultTransUnitContext)_localctx).tu = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
					setState(1193);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1194);
					((MultTransUnitContext)_localctx).dec = externalDeclaration();
					}
					} 
				}
				setState(1199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
	 
		public ExternalDeclarationContext() { }
		public void copyFrom(ExternalDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncExtDecContext extends ExternalDeclarationContext {
		public FunctionDefinitionContext dec;
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public FuncExtDecContext(ExternalDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class DecExtDecContext extends ExternalDeclarationContext {
		public DeclarationContext dec;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DecExtDecContext(ExternalDeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class EmptyContext extends ExternalDeclarationContext {
		public EmptyContext(ExternalDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_externalDeclaration);
		try {
			setState(1203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				_localctx = new FuncExtDecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1200);
				((FuncExtDecContext)_localctx).dec = functionDefinition();
				}
				break;
			case 2:
				_localctx = new DecExtDecContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1201);
				((DecExtDecContext)_localctx).dec = declaration();
				}
				break;
			case 3:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1202);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclarationSpecifiersContext spec;
		public DeclaratorContext func_dec;
		public DeclarationListContext dec_list;
		public CompoundStatementContext comp_stat;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1205);
				((FunctionDefinitionContext)_localctx).spec = declarationSpecifiers();
				}
				break;
			}
			setState(1208);
			((FunctionDefinitionContext)_localctx).func_dec = declarator();
			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Noreturn) | (1L << StaticAssert) | (1L << ThreadLocal))) != 0) || _la==Identifier) {
				{
				setState(1209);
				((FunctionDefinitionContext)_localctx).dec_list = declarationList(0);
				}
			}

			setState(1212);
			((FunctionDefinitionContext)_localctx).comp_stat = compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
	 
		public DeclarationListContext() { }
		public void copyFrom(DeclarationListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleDecListContext extends DeclarationListContext {
		public DeclarationContext dec;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public SingleDecListContext(DeclarationListContext ctx) { copyFrom(ctx); }
	}
	public static class MultDecListContext extends DeclarationListContext {
		public DeclarationListContext dec_list;
		public DeclarationContext dec;
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public MultDecListContext(DeclarationListContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		return declarationList(0);
	}

	private DeclarationListContext declarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, _parentState);
		DeclarationListContext _prevctx = _localctx;
		int _startState = 172;
		enterRecursionRule(_localctx, 172, RULE_declarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleDecListContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1215);
			((SingleDecListContext)_localctx).dec = declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultDecListContext(new DeclarationListContext(_parentctx, _parentState));
					((MultDecListContext)_localctx).dec_list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(1217);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1218);
					((MultDecListContext)_localctx).dec = declaration();
					}
					} 
				}
				setState(1223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return genericAssocList_sempred((GenericAssocListContext)_localctx, predIndex);
		case 4:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 5:
			return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);
		case 9:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 10:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 11:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 12:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 13:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 14:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 15:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 16:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 17:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 18:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 22:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 28:
			return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);
		case 31:
			return typeSpecifier_sempred((TypeSpecifierContext)_localctx, predIndex);
		case 34:
			return structDeclarationList_sempred((StructDeclarationListContext)_localctx, predIndex);
		case 37:
			return structDeclaratorList_sempred((StructDeclaratorListContext)_localctx, predIndex);
		case 40:
			return enumeratorList_sempred((EnumeratorListContext)_localctx, predIndex);
		case 48:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 55:
			return typeQualifierList_sempred((TypeQualifierListContext)_localctx, predIndex);
		case 57:
			return parameterList_sempred((ParameterListContext)_localctx, predIndex);
		case 59:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 62:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		case 65:
			return initializerList_sempred((InitializerListContext)_localctx, predIndex);
		case 67:
			return designatorList_sempred((DesignatorListContext)_localctx, predIndex);
		case 73:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		case 80:
			return forExpression_sempred((ForExpressionContext)_localctx, predIndex);
		case 83:
			return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);
		case 86:
			return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean genericAssocList_sempred(GenericAssocListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initDeclaratorList_sempred(InitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeSpecifier_sempred(TypeSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclarationList_sempred(StructDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclaratorList_sempred(StructDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorList_sempred(EnumeratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 7);
		case 24:
			return precpred(_ctx, 6);
		case 25:
			return precpred(_ctx, 5);
		case 26:
			return precpred(_ctx, 4);
		case 27:
			return precpred(_ctx, 3);
		case 28:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean typeQualifierList_sempred(TypeQualifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 5);
		case 33:
			return precpred(_ctx, 4);
		case 34:
			return precpred(_ctx, 3);
		case 35:
			return precpred(_ctx, 2);
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializerList_sempred(InitializerListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean designatorList_sempred(DesignatorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 39:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean forExpression_sempred(ForExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 40:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean translationUnit_sempred(TranslationUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationList_sempred(DeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 42:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3v\u04cb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\3\2\6\2\u00b4\n\2\r\2\16\2\u00b5\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2\u00be\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00d2\n\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u00e1\n\4\f\4\16\4\u00e4\13\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ed\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0111\n\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u011b\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0126"+
		"\n\6\f\6\16\6\u0129\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0131\n\7\f\7\16"+
		"\7\u0134\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u014a\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u015b\n\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\7\13\u0163\n\13\f\13\16\13\u0166\13\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u016e\n\f\f\f\16\f\u0171\13\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0179\n\r\f"+
		"\r\16\r\u017c\13\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0184\n\16\f\16"+
		"\16\16\u0187\13\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u018f\n\17\f\17"+
		"\16\17\u0192\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u019a\n\20\f\20"+
		"\16\20\u019d\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u01a5\n\21\f\21"+
		"\16\21\u01a8\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01b0\n\22\f\22"+
		"\16\22\u01b3\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u01bb\n\23\f\23"+
		"\16\23\u01be\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01c6\n\24\f\24"+
		"\16\24\u01c9\13\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01d1\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u01d9\n\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u01e3\n\30\f\30\16\30\u01e6\13\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01f2\n\32\3\33\6\33\u01f5\n\33\r"+
		"\33\16\33\u01f6\3\34\6\34\u01fa\n\34\r\34\16\34\u01fb\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u0203\n\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u020b\n\36"+
		"\f\36\16\36\u020e\13\36\3\37\3\37\3\37\3\37\3\37\5\37\u0215\n\37\3 \3"+
		" \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0228\n!\3!\3!\7!\u022c"+
		"\n!\f!\16!\u022f\13!\3\"\3\"\5\"\u0233\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u023c\n\"\3#\3#\3$\3$\3$\3$\3$\7$\u0245\n$\f$\16$\u0248\13$\3%\3"+
		"%\5%\u024c\n%\3%\3%\3%\5%\u0251\n%\3&\3&\5&\u0255\n&\3&\3&\5&\u0259\n"+
		"&\5&\u025b\n&\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u0263\n\'\f\'\16\'\u0266\13"+
		"\'\3(\3(\5(\u026a\n(\3(\3(\5(\u026e\n(\3)\3)\5)\u0272\n)\3)\3)\3)\5)\u0277"+
		"\n)\3)\3)\3)\3)\5)\u027d\n)\3*\3*\3*\3*\3*\3*\7*\u0285\n*\f*\16*\u0288"+
		"\13*\3+\3+\3+\3+\3+\5+\u028f\n+\3,\3,\3-\3-\3-\3-\3-\3.\3.\3/\3/\3/\3"+
		"/\3/\3/\5/\u02a0\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u02ac\n\60\3\61\5\61\u02af\n\61\3\61\3\61\7\61\u02b3\n\61\f\61\16"+
		"\61\u02b6\13\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u02c1"+
		"\n\62\3\62\3\62\3\62\5\62\u02c6\n\62\3\62\5\62\u02c9\n\62\3\62\3\62\3"+
		"\62\3\62\3\62\5\62\u02d0\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u02df\n\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\5\62\u02eb\n\62\3\62\7\62\u02ee\n\62\f\62\16\62\u02f1"+
		"\13\62\3\63\3\63\3\63\6\63\u02f6\n\63\r\63\16\63\u02f7\3\63\3\63\5\63"+
		"\u02fc\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\7\65\u0308"+
		"\n\65\f\65\16\65\u030b\13\65\3\65\5\65\u030e\n\65\3\66\3\66\3\66\5\66"+
		"\u0313\n\66\3\66\5\66\u0316\n\66\3\66\5\66\u0319\n\66\3\67\3\67\3\67\3"+
		"\67\3\67\7\67\u0320\n\67\f\67\16\67\u0323\13\67\38\38\58\u0327\n8\38\3"+
		"8\58\u032b\n8\38\38\38\58\u0330\n8\38\38\58\u0334\n8\38\58\u0337\n8\3"+
		"9\39\39\39\39\79\u033e\n9\f9\169\u0341\139\3:\3:\3:\3:\3:\5:\u0348\n:"+
		"\3;\3;\3;\3;\3;\3;\7;\u0350\n;\f;\16;\u0353\13;\3<\3<\3<\3<\3<\5<\u035a"+
		"\n<\5<\u035c\n<\3=\3=\3=\3=\3=\3=\7=\u0364\n=\f=\16=\u0367\13=\3>\3>\5"+
		">\u036b\n>\3?\3?\5?\u036f\n?\3?\3?\7?\u0373\n?\f?\16?\u0376\13?\5?\u0378"+
		"\n?\3@\3@\3@\3@\3@\7@\u037f\n@\f@\16@\u0382\13@\3@\3@\5@\u0386\n@\3@\5"+
		"@\u0389\n@\3@\3@\3@\3@\5@\u038f\n@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\5@\u039f\n@\3@\3@\7@\u03a3\n@\f@\16@\u03a6\13@\5@\u03a8\n@\3@"+
		"\3@\3@\5@\u03ad\n@\3@\5@\u03b0\n@\3@\3@\3@\3@\3@\5@\u03b7\n@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u03ca\n@\3@\3@\7@\u03ce"+
		"\n@\f@\16@\u03d1\13@\7@\u03d3\n@\f@\16@\u03d6\13@\3A\3A\3B\3B\3B\3B\5"+
		"B\u03de\nB\3B\3B\5B\u03e2\nB\3C\3C\5C\u03e6\nC\3C\3C\3C\3C\3C\5C\u03ed"+
		"\nC\3C\7C\u03f0\nC\fC\16C\u03f3\13C\3D\3D\3D\3E\3E\3E\3E\3E\7E\u03fd\n"+
		"E\fE\16E\u0400\13E\3F\3F\3F\3F\3F\3F\5F\u0408\nF\3G\3G\3G\3G\3G\6G\u040f"+
		"\nG\rG\16G\u0410\3G\3G\3G\3H\3H\3H\3H\3H\3H\5H\u041c\nH\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3I\3I\5I\u0429\nI\3J\3J\5J\u042d\nJ\3J\3J\3K\3K\3K\3K\3"+
		"K\7K\u0436\nK\fK\16K\u0439\13K\3L\3L\5L\u043d\nL\3M\5M\u0440\nM\3M\3M"+
		"\3N\3N\3N\3N\3N\3N\3N\5N\u044b\nN\3N\3N\3N\3N\3N\3N\5N\u0453\nN\3O\3O"+
		"\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\3O\5O\u0469\nO\3P"+
		"\3P\3P\5P\u046e\nP\3P\3P\5P\u0472\nP\3P\5P\u0475\nP\3P\3P\5P\u0479\nP"+
		"\3P\3P\5P\u047d\nP\5P\u047f\nP\3Q\3Q\3Q\3Q\5Q\u0485\nQ\3R\3R\3R\3R\3R"+
		"\3R\7R\u048d\nR\fR\16R\u0490\13R\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u049b\n"+
		"S\3S\3S\3S\3S\3S\5S\u04a2\nS\3T\5T\u04a5\nT\3T\3T\3U\3U\3U\3U\3U\7U\u04ae"+
		"\nU\fU\16U\u04b1\13U\3V\3V\3V\5V\u04b6\nV\3W\5W\u04b9\nW\3W\3W\5W\u04bd"+
		"\nW\3W\3W\3X\3X\3X\3X\3X\7X\u04c6\nX\fX\16X\u04c9\13X\3X\2 \6\n\f\24\26"+
		"\30\32\34\36 \"$&.:@FLRbptx~\u0084\u0088\u0094\u00a2\u00a8\u00aeY\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP"+
		"RTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\2\22\4\2HHJJ\7\2GGIIKKNNST\3\2KM\4\2GGII\3\2"+
		"EF\3\2AD\3\2de\3\2Yc\b\2\17\17\32\32\"\"((++::\n\2\6\b\22\22\27\27\33"+
		"\33 !%&-.\64\65\3\2\6\b\4\2)),,\6\2\23\23##//\63\63\5\2\n\13\37\3788\4"+
		"\2;<XX\3\2;<\2\u052d\2\u00d1\3\2\2\2\4\u00d3\3\2\2\2\6\u00da\3\2\2\2\b"+
		"\u00ec\3\2\2\2\n\u0110\3\2\2\2\f\u012a\3\2\2\2\16\u0149\3\2\2\2\20\u014b"+
		"\3\2\2\2\22\u015a\3\2\2\2\24\u015c\3\2\2\2\26\u0167\3\2\2\2\30\u0172\3"+
		"\2\2\2\32\u017d\3\2\2\2\34\u0188\3\2\2\2\36\u0193\3\2\2\2 \u019e\3\2\2"+
		"\2\"\u01a9\3\2\2\2$\u01b4\3\2\2\2&\u01bf\3\2\2\2(\u01ca\3\2\2\2*\u01d8"+
		"\3\2\2\2,\u01da\3\2\2\2.\u01dc\3\2\2\2\60\u01e7\3\2\2\2\62\u01f1\3\2\2"+
		"\2\64\u01f4\3\2\2\2\66\u01f9\3\2\2\28\u0202\3\2\2\2:\u0204\3\2\2\2<\u0214"+
		"\3\2\2\2>\u0216\3\2\2\2@\u0227\3\2\2\2B\u023b\3\2\2\2D\u023d\3\2\2\2F"+
		"\u023f\3\2\2\2H\u0250\3\2\2\2J\u025a\3\2\2\2L\u025c\3\2\2\2N\u026d\3\2"+
		"\2\2P\u027c\3\2\2\2R\u027e\3\2\2\2T\u028e\3\2\2\2V\u0290\3\2\2\2X\u0292"+
		"\3\2\2\2Z\u0297\3\2\2\2\\\u029f\3\2\2\2^\u02ab\3\2\2\2`\u02ae\3\2\2\2"+
		"b\u02c0\3\2\2\2d\u02fb\3\2\2\2f\u02fd\3\2\2\2h\u030d\3\2\2\2j\u0318\3"+
		"\2\2\2l\u0321\3\2\2\2n\u0336\3\2\2\2p\u0338\3\2\2\2r\u0347\3\2\2\2t\u0349"+
		"\3\2\2\2v\u035b\3\2\2\2x\u035d\3\2\2\2z\u0368\3\2\2\2|\u0377\3\2\2\2~"+
		"\u03a7\3\2\2\2\u0080\u03d7\3\2\2\2\u0082\u03e1\3\2\2\2\u0084\u03e3\3\2"+
		"\2\2\u0086\u03f4\3\2\2\2\u0088\u03f7\3\2\2\2\u008a\u0407\3\2\2\2\u008c"+
		"\u0409\3\2\2\2\u008e\u041b\3\2\2\2\u0090\u0428\3\2\2\2\u0092\u042a\3\2"+
		"\2\2\u0094\u0430\3\2\2\2\u0096\u043c\3\2\2\2\u0098\u043f\3\2\2\2\u009a"+
		"\u0452\3\2\2\2\u009c\u0468\3\2\2\2\u009e\u047e\3\2\2\2\u00a0\u0484\3\2"+
		"\2\2\u00a2\u0486\3\2\2\2\u00a4\u04a1\3\2\2\2\u00a6\u04a4\3\2\2\2\u00a8"+
		"\u04a8\3\2\2\2\u00aa\u04b5\3\2\2\2\u00ac\u04b8\3\2\2\2\u00ae\u04c0\3\2"+
		"\2\2\u00b0\u00d2\7i\2\2\u00b1\u00d2\7j\2\2\u00b2\u00b4\7l\2\2\u00b3\u00b2"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00d2\3\2\2\2\u00b7\u00b8\7;\2\2\u00b8\u00b9\5.\30\2\u00b9\u00ba\7<\2"+
		"\2\u00ba\u00d2\3\2\2\2\u00bb\u00d2\5\4\3\2\u00bc\u00be\7\3\2\2\u00bd\u00bc"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7;\2\2\u00c0"+
		"\u00c1\5\u0092J\2\u00c1\u00c2\7<\2\2\u00c2\u00d2\3\2\2\2\u00c3\u00c4\7"+
		"\4\2\2\u00c4\u00c5\7;\2\2\u00c5\u00c6\5\16\b\2\u00c6\u00c7\7X\2\2\u00c7"+
		"\u00c8\5z>\2\u00c8\u00c9\7<\2\2\u00c9\u00d2\3\2\2\2\u00ca\u00cb\7\5\2"+
		"\2\u00cb\u00cc\7;\2\2\u00cc\u00cd\5z>\2\u00cd\u00ce\7X\2\2\u00ce\u00cf"+
		"\5\16\b\2\u00cf\u00d0\7<\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00b0\3\2\2\2\u00d1"+
		"\u00b1\3\2\2\2\u00d1\u00b3\3\2\2\2\u00d1\u00b7\3\2\2\2\u00d1\u00bb\3\2"+
		"\2\2\u00d1\u00bd\3\2\2\2\u00d1\u00c3\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d2"+
		"\3\3\2\2\2\u00d3\u00d4\7\66\2\2\u00d4\u00d5\7;\2\2\u00d5\u00d6\5*\26\2"+
		"\u00d6\u00d7\7X\2\2\u00d7\u00d8\5\6\4\2\u00d8\u00d9\7<\2\2\u00d9\5\3\2"+
		"\2\2\u00da\u00db\b\4\1\2\u00db\u00dc\5\b\5\2\u00dc\u00e2\3\2\2\2\u00dd"+
		"\u00de\f\3\2\2\u00de\u00df\7X\2\2\u00df\u00e1\5\b\5\2\u00e0\u00dd\3\2"+
		"\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\7\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5z>\2\u00e6\u00e7\7V\2\2\u00e7"+
		"\u00e8\5*\26\2\u00e8\u00ed\3\2\2\2\u00e9\u00ea\7\25\2\2\u00ea\u00eb\7"+
		"V\2\2\u00eb\u00ed\5*\26\2\u00ec\u00e5\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed"+
		"\t\3\2\2\2\u00ee\u00ef\b\6\1\2\u00ef\u0111\5\2\2\2\u00f0\u00f1\7;\2\2"+
		"\u00f1\u00f2\5z>\2\u00f2\u00f3\7<\2\2\u00f3\u00f4\7?\2\2\u00f4\u00f5\5"+
		"\u0084C\2\u00f5\u00f6\7@\2\2\u00f6\u0111\3\2\2\2\u00f7\u00f8\7;\2\2\u00f8"+
		"\u00f9\5z>\2\u00f9\u00fa\7<\2\2\u00fa\u00fb\7?\2\2\u00fb\u00fc\5\u0084"+
		"C\2\u00fc\u00fd\7X\2\2\u00fd\u00fe\7@\2\2\u00fe\u0111\3\2\2\2\u00ff\u0100"+
		"\7\3\2\2\u0100\u0101\7;\2\2\u0101\u0102\5z>\2\u0102\u0103\7<\2\2\u0103"+
		"\u0104\7?\2\2\u0104\u0105\5\u0084C\2\u0105\u0106\7@\2\2\u0106\u0111\3"+
		"\2\2\2\u0107\u0108\7\3\2\2\u0108\u0109\7;\2\2\u0109\u010a\5z>\2\u010a"+
		"\u010b\7<\2\2\u010b\u010c\7?\2\2\u010c\u010d\5\u0084C\2\u010d\u010e\7"+
		"X\2\2\u010e\u010f\7@\2\2\u010f\u0111\3\2\2\2\u0110\u00ee\3\2\2\2\u0110"+
		"\u00f0\3\2\2\2\u0110\u00f7\3\2\2\2\u0110\u00ff\3\2\2\2\u0110\u0107\3\2"+
		"\2\2\u0111\u0127\3\2\2\2\u0112\u0113\f\13\2\2\u0113\u0114\7=\2\2\u0114"+
		"\u0115\5.\30\2\u0115\u0116\7>\2\2\u0116\u0126\3\2\2\2\u0117\u0118\f\n"+
		"\2\2\u0118\u011a\7;\2\2\u0119\u011b\5\f\7\2\u011a\u0119\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0126\7<\2\2\u011d\u011e\f\t"+
		"\2\2\u011e\u011f\7g\2\2\u011f\u0126\7i\2\2\u0120\u0121\f\b\2\2\u0121\u0122"+
		"\7f\2\2\u0122\u0126\7i\2\2\u0123\u0124\f\7\2\2\u0124\u0126\t\2\2\2\u0125"+
		"\u0112\3\2\2\2\u0125\u0117\3\2\2\2\u0125\u011d\3\2\2\2\u0125\u0120\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\13\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\b\7\1"+
		"\2\u012b\u012c\5*\26\2\u012c\u0132\3\2\2\2\u012d\u012e\f\3\2\2\u012e\u012f"+
		"\7X\2\2\u012f\u0131\5*\26\2\u0130\u012d\3\2\2\2\u0131\u0134\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\r\3\2\2\2\u0134\u0132\3\2\2\2"+
		"\u0135\u014a\5\n\6\2\u0136\u0137\t\2\2\2\u0137\u014a\5\16\b\2\u0138\u0139"+
		"\5\20\t\2\u0139\u013a\5\22\n\2\u013a\u014a\3\2\2\2\u013b\u013c\7\'\2\2"+
		"\u013c\u014a\5\16\b\2\u013d\u013e\7\'\2\2\u013e\u013f\7;\2\2\u013f\u0140"+
		"\5z>\2\u0140\u0141\7<\2\2\u0141\u014a\3\2\2\2\u0142\u0143\7\62\2\2\u0143"+
		"\u0144\7;\2\2\u0144\u0145\5z>\2\u0145\u0146\7<\2\2\u0146\u014a\3\2\2\2"+
		"\u0147\u0148\7P\2\2\u0148\u014a\7i\2\2\u0149\u0135\3\2\2\2\u0149\u0136"+
		"\3\2\2\2\u0149\u0138\3\2\2\2\u0149\u013b\3\2\2\2\u0149\u013d\3\2\2\2\u0149"+
		"\u0142\3\2\2\2\u0149\u0147\3\2\2\2\u014a\17\3\2\2\2\u014b\u014c\t\3\2"+
		"\2\u014c\21\3\2\2\2\u014d\u014e\7;\2\2\u014e\u014f\5z>\2\u014f\u0150\7"+
		"<\2\2\u0150\u0151\5\22\n\2\u0151\u015b\3\2\2\2\u0152\u0153\7\3\2\2\u0153"+
		"\u0154\7;\2\2\u0154\u0155\5z>\2\u0155\u0156\7<\2\2\u0156\u0157\5\22\n"+
		"\2\u0157\u015b\3\2\2\2\u0158\u015b\5\16\b\2\u0159\u015b\7k\2\2\u015a\u014d"+
		"\3\2\2\2\u015a\u0152\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b"+
		"\23\3\2\2\2\u015c\u015d\b\13\1\2\u015d\u015e\5\22\n\2\u015e\u0164\3\2"+
		"\2\2\u015f\u0160\f\3\2\2\u0160\u0161\t\4\2\2\u0161\u0163\5\22\n\2\u0162"+
		"\u015f\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\25\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u0168\b\f\1\2\u0168\u0169"+
		"\5\24\13\2\u0169\u016f\3\2\2\2\u016a\u016b\f\3\2\2\u016b\u016c\t\5\2\2"+
		"\u016c\u016e\5\24\13\2\u016d\u016a\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\27\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u0173\b\r\1\2\u0173\u0174\5\26\f\2\u0174\u017a\3\2\2\2\u0175\u0176\f"+
		"\3\2\2\u0176\u0177\t\6\2\2\u0177\u0179\5\26\f\2\u0178\u0175\3\2\2\2\u0179"+
		"\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\31\3\2\2"+
		"\2\u017c\u017a\3\2\2\2\u017d\u017e\b\16\1\2\u017e\u017f\5\30\r\2\u017f"+
		"\u0185\3\2\2\2\u0180\u0181\f\3\2\2\u0181\u0182\t\7\2\2\u0182\u0184\5\30"+
		"\r\2\u0183\u0180\3\2\2\2\u0184\u0187\3\2\2\2\u0185\u0183\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\33\3\2\2\2\u0187\u0185\3\2\2\2\u0188\u0189\b\17\1"+
		"\2\u0189\u018a\5\32\16\2\u018a\u0190\3\2\2\2\u018b\u018c\f\3\2\2\u018c"+
		"\u018d\t\b\2\2\u018d\u018f\5\32\16\2\u018e\u018b\3\2\2\2\u018f\u0192\3"+
		"\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\35\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0193\u0194\b\20\1\2\u0194\u0195\5\34\17\2\u0195\u019b"+
		"\3\2\2\2\u0196\u0197\f\3\2\2\u0197\u0198\7N\2\2\u0198\u019a\5\34\17\2"+
		"\u0199\u0196\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019c\37\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\b\21\1\2\u019f"+
		"\u01a0\5\36\20\2\u01a0\u01a6\3\2\2\2\u01a1\u01a2\f\3\2\2\u01a2\u01a3\7"+
		"R\2\2\u01a3\u01a5\5\36\20\2\u01a4\u01a1\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7!\3\2\2\2\u01a8\u01a6\3\2\2\2"+
		"\u01a9\u01aa\b\22\1\2\u01aa\u01ab\5 \21\2\u01ab\u01b1\3\2\2\2\u01ac\u01ad"+
		"\f\3\2\2\u01ad\u01ae\7O\2\2\u01ae\u01b0\5 \21\2\u01af\u01ac\3\2\2\2\u01b0"+
		"\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2#\3\2\2\2"+
		"\u01b3\u01b1\3\2\2\2\u01b4\u01b5\b\23\1\2\u01b5\u01b6\5\"\22\2\u01b6\u01bc"+
		"\3\2\2\2\u01b7\u01b8\f\3\2\2\u01b8\u01b9\7P\2\2\u01b9\u01bb\5\"\22\2\u01ba"+
		"\u01b7\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd%\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\b\24\1\2\u01c0\u01c1"+
		"\5$\23\2\u01c1\u01c7\3\2\2\2\u01c2\u01c3\f\3\2\2\u01c3\u01c4\7Q\2\2\u01c4"+
		"\u01c6\5$\23\2\u01c5\u01c2\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2"+
		"\2\2\u01c7\u01c8\3\2\2\2\u01c8\'\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01d0"+
		"\5&\24\2\u01cb\u01cc\7U\2\2\u01cc\u01cd\5.\30\2\u01cd\u01ce\7V\2\2\u01ce"+
		"\u01cf\5(\25\2\u01cf\u01d1\3\2\2\2\u01d0\u01cb\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1)\3\2\2\2\u01d2\u01d9\5(\25\2\u01d3\u01d4\5\16\b\2\u01d4\u01d5"+
		"\5,\27\2\u01d5\u01d6\5*\26\2\u01d6\u01d9\3\2\2\2\u01d7\u01d9\7k\2\2\u01d8"+
		"\u01d2\3\2\2\2\u01d8\u01d3\3\2\2\2\u01d8\u01d7\3\2\2\2\u01d9+\3\2\2\2"+
		"\u01da\u01db\t\t\2\2\u01db-\3\2\2\2\u01dc\u01dd\b\30\1\2\u01dd\u01de\5"+
		"*\26\2\u01de\u01e4\3\2\2\2\u01df\u01e0\f\3\2\2\u01e0\u01e1\7X\2\2\u01e1"+
		"\u01e3\5*\26\2\u01e2\u01df\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4\u01e2\3\2"+
		"\2\2\u01e4\u01e5\3\2\2\2\u01e5/\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e7\u01e8"+
		"\5(\25\2\u01e8\61\3\2\2\2\u01e9\u01ea\5\64\33\2\u01ea\u01eb\5:\36\2\u01eb"+
		"\u01ec\7W\2\2\u01ec\u01f2\3\2\2\2\u01ed\u01ee\5\64\33\2\u01ee\u01ef\7"+
		"W\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01f2\5\u008cG\2\u01f1\u01e9\3\2\2\2\u01f1"+
		"\u01ed\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2\63\3\2\2\2\u01f3\u01f5\58\35"+
		"\2\u01f4\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7"+
		"\3\2\2\2\u01f7\65\3\2\2\2\u01f8\u01fa\58\35\2\u01f9\u01f8\3\2\2\2\u01fa"+
		"\u01fb\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\67\3\2\2"+
		"\2\u01fd\u0203\5> \2\u01fe\u0203\5@!\2\u01ff\u0203\5Z.\2\u0200\u0203\5"+
		"\\/\2\u0201\u0203\5^\60\2\u0202\u01fd\3\2\2\2\u0202\u01fe\3\2\2\2\u0202"+
		"\u01ff\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0201\3\2\2\2\u02039\3\2\2\2"+
		"\u0204\u0205\b\36\1\2\u0205\u0206\5<\37\2\u0206\u020c\3\2\2\2\u0207\u0208"+
		"\f\3\2\2\u0208\u0209\7X\2\2\u0209\u020b\5<\37\2\u020a\u0207\3\2\2\2\u020b"+
		"\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d;\3\2\2\2"+
		"\u020e\u020c\3\2\2\2\u020f\u0215\5`\61\2\u0210\u0211\5`\61\2\u0211\u0212"+
		"\7Y\2\2\u0212\u0213\5\u0082B\2\u0213\u0215\3\2\2\2\u0214\u020f\3\2\2\2"+
		"\u0214\u0210\3\2\2\2\u0215=\3\2\2\2\u0216\u0217\t\n\2\2\u0217?\3\2\2\2"+
		"\u0218\u0219\b!\1\2\u0219\u0228\t\13\2\2\u021a\u021b\7\3\2\2\u021b\u021c"+
		"\7;\2\2\u021c\u021d\t\f\2\2\u021d\u0228\7<\2\2\u021e\u0228\5X-\2\u021f"+
		"\u0228\5B\"\2\u0220\u0228\5P)\2\u0221\u0228\5\u0080A\2\u0222\u0223\7\t"+
		"\2\2\u0223\u0224\7;\2\2\u0224\u0225\5\60\31\2\u0225\u0226\7<\2\2\u0226"+
		"\u0228\3\2\2\2\u0227\u0218\3\2\2\2\u0227\u021a\3\2\2\2\u0227\u021e\3\2"+
		"\2\2\u0227\u021f\3\2\2\2\u0227\u0220\3\2\2\2\u0227\u0221\3\2\2\2\u0227"+
		"\u0222\3\2\2\2\u0228\u022d\3\2\2\2\u0229\u022a\f\3\2\2\u022a\u022c\5n"+
		"8\2\u022b\u0229\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022eA\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0232\5D#\2\u0231"+
		"\u0233\7i\2\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2"+
		"\2\2\u0234\u0235\7?\2\2\u0235\u0236\5F$\2\u0236\u0237\7@\2\2\u0237\u023c"+
		"\3\2\2\2\u0238\u0239\5D#\2\u0239\u023a\7i\2\2\u023a\u023c\3\2\2\2\u023b"+
		"\u0230\3\2\2\2\u023b\u0238\3\2\2\2\u023cC\3\2\2\2\u023d\u023e\t\r\2\2"+
		"\u023eE\3\2\2\2\u023f\u0240\b$\1\2\u0240\u0241\5H%\2\u0241\u0246\3\2\2"+
		"\2\u0242\u0243\f\3\2\2\u0243\u0245\5H%\2\u0244\u0242\3\2\2\2\u0245\u0248"+
		"\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247G\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0249\u024b\5J&\2\u024a\u024c\5L\'\2\u024b\u024a\3\2\2"+
		"\2\u024b\u024c\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u024e\7W\2\2\u024e\u0251"+
		"\3\2\2\2\u024f\u0251\5\u008cG\2\u0250\u0249\3\2\2\2\u0250\u024f\3\2\2"+
		"\2\u0251I\3\2\2\2\u0252\u0254\5@!\2\u0253\u0255\5J&\2\u0254\u0253\3\2"+
		"\2\2\u0254\u0255\3\2\2\2\u0255\u025b\3\2\2\2\u0256\u0258\5Z.\2\u0257\u0259"+
		"\5J&\2\u0258\u0257\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025b\3\2\2\2\u025a"+
		"\u0252\3\2\2\2\u025a\u0256\3\2\2\2\u025bK\3\2\2\2\u025c\u025d\b\'\1\2"+
		"\u025d\u025e\5N(\2\u025e\u0264\3\2\2\2\u025f\u0260\f\3\2\2\u0260\u0261"+
		"\7X\2\2\u0261\u0263\5N(\2\u0262\u025f\3\2\2\2\u0263\u0266\3\2\2\2\u0264"+
		"\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265M\3\2\2\2\u0266\u0264\3\2\2\2"+
		"\u0267\u026e\5`\61\2\u0268\u026a\5`\61\2\u0269\u0268\3\2\2\2\u0269\u026a"+
		"\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\7V\2\2\u026c\u026e\5\60\31\2"+
		"\u026d\u0267\3\2\2\2\u026d\u0269\3\2\2\2\u026eO\3\2\2\2\u026f\u0271\7"+
		"\31\2\2\u0270\u0272\7i\2\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2\2\2\u0272"+
		"\u0273\3\2\2\2\u0273\u0274\7?\2\2\u0274\u0276\5R*\2\u0275\u0277\7X\2\2"+
		"\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279"+
		"\7@\2\2\u0279\u027d\3\2\2\2\u027a\u027b\7\31\2\2\u027b\u027d\7i\2\2\u027c"+
		"\u026f\3\2\2\2\u027c\u027a\3\2\2\2\u027dQ\3\2\2\2\u027e\u027f\b*\1\2\u027f"+
		"\u0280\5T+\2\u0280\u0286\3\2\2\2\u0281\u0282\f\3\2\2\u0282\u0283\7X\2"+
		"\2\u0283\u0285\5T+\2\u0284\u0281\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284"+
		"\3\2\2\2\u0286\u0287\3\2\2\2\u0287S\3\2\2\2\u0288\u0286\3\2\2\2\u0289"+
		"\u028f\5V,\2\u028a\u028b\5V,\2\u028b\u028c\7Y\2\2\u028c\u028d\5\60\31"+
		"\2\u028d\u028f\3\2\2\2\u028e\u0289\3\2\2\2\u028e\u028a\3\2\2\2\u028fU"+
		"\3\2\2\2\u0290\u0291\7i\2\2\u0291W\3\2\2\2\u0292\u0293\7\63\2\2\u0293"+
		"\u0294\7;\2\2\u0294\u0295\5z>\2\u0295\u0296\7<\2\2\u0296Y\3\2\2\2\u0297"+
		"\u0298\t\16\2\2\u0298[\3\2\2\2\u0299\u02a0\t\17\2\2\u029a\u02a0\5f\64"+
		"\2\u029b\u029c\7\f\2\2\u029c\u029d\7;\2\2\u029d\u029e\7i\2\2\u029e\u02a0"+
		"\7<\2\2\u029f\u0299\3\2\2\2\u029f\u029a\3\2\2\2\u029f\u029b\3\2\2\2\u02a0"+
		"]\3\2\2\2\u02a1\u02a2\7\61\2\2\u02a2\u02a3\7;\2\2\u02a3\u02a4\5z>\2\u02a4"+
		"\u02a5\7<\2\2\u02a5\u02ac\3\2\2\2\u02a6\u02a7\7\61\2\2\u02a7\u02a8\7;"+
		"\2\2\u02a8\u02a9\5\60\31\2\u02a9\u02aa\7<\2\2\u02aa\u02ac\3\2\2\2\u02ab"+
		"\u02a1\3\2\2\2\u02ab\u02a6\3\2\2\2\u02ac_\3\2\2\2\u02ad\u02af\5n8\2\u02ae"+
		"\u02ad\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b4\5b"+
		"\62\2\u02b1\u02b3\5d\63\2\u02b2\u02b1\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4"+
		"\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5a\3\2\2\2\u02b6\u02b4\3\2\2\2"+
		"\u02b7\u02b8\b\62\1\2\u02b8\u02c1\7i\2\2\u02b9\u02ba\7;\2\2\u02ba\u02bb"+
		"\5`\61\2\u02bb\u02bc\7<\2\2\u02bc\u02c1\3\2\2\2\u02bd\u02be\7i\2\2\u02be"+
		"\u02bf\7V\2\2\u02bf\u02c1\7k\2\2\u02c0\u02b7\3\2\2\2\u02c0\u02b9\3\2\2"+
		"\2\u02c0\u02bd\3\2\2\2\u02c1\u02ef\3\2\2\2\u02c2\u02c3\f\t\2\2\u02c3\u02c5"+
		"\7=\2\2\u02c4\u02c6\5p9\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6"+
		"\u02c8\3\2\2\2\u02c7\u02c9\5*\26\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2"+
		"\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02ee\7>\2\2\u02cb\u02cc\f\b\2\2\u02cc"+
		"\u02cd\7=\2\2\u02cd\u02cf\7(\2\2\u02ce\u02d0\5p9\2\u02cf\u02ce\3\2\2\2"+
		"\u02cf\u02d0\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\5*\26\2\u02d2\u02d3"+
		"\7>\2\2\u02d3\u02ee\3\2\2\2\u02d4\u02d5\f\7\2\2\u02d5\u02d6\7=\2\2\u02d6"+
		"\u02d7\5p9\2\u02d7\u02d8\7(\2\2\u02d8\u02d9\5*\26\2\u02d9\u02da\7>\2\2"+
		"\u02da\u02ee\3\2\2\2\u02db\u02dc\f\6\2\2\u02dc\u02de\7=\2\2\u02dd\u02df"+
		"\5p9\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0"+
		"\u02e1\7K\2\2\u02e1\u02ee\7>\2\2\u02e2\u02e3\f\5\2\2\u02e3\u02e4\7;\2"+
		"\2\u02e4\u02e5\5r:\2\u02e5\u02e6\7<\2\2\u02e6\u02ee\3\2\2\2\u02e7\u02e8"+
		"\f\4\2\2\u02e8\u02ea\7;\2\2\u02e9\u02eb\5x=\2\u02ea\u02e9\3\2\2\2\u02ea"+
		"\u02eb\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\7<\2\2\u02ed\u02c2\3\2"+
		"\2\2\u02ed\u02cb\3\2\2\2\u02ed\u02d4\3\2\2\2\u02ed\u02db\3\2\2\2\u02ed"+
		"\u02e2\3\2\2\2\u02ed\u02e7\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2"+
		"\2\2\u02ef\u02f0\3\2\2\2\u02f0c\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2\u02f3"+
		"\7\r\2\2\u02f3\u02f5\7;\2\2\u02f4\u02f6\7l\2\2\u02f5\u02f4\3\2\2\2\u02f6"+
		"\u02f7\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2"+
		"\2\2\u02f9\u02fc\7<\2\2\u02fa\u02fc\5f\64\2\u02fb\u02f2\3\2\2\2\u02fb"+
		"\u02fa\3\2\2\2\u02fce\3\2\2\2\u02fd\u02fe\7\16\2\2\u02fe\u02ff\7;\2\2"+
		"\u02ff\u0300\7;\2\2\u0300\u0301\5h\65\2\u0301\u0302\7<\2\2\u0302\u0303"+
		"\7<\2\2\u0303g\3\2\2\2\u0304\u0309\5j\66\2\u0305\u0306\7X\2\2\u0306\u0308"+
		"\5j\66\2\u0307\u0305\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u0309"+
		"\u030a\3\2\2\2\u030a\u030e\3\2\2\2\u030b\u0309\3\2\2\2\u030c\u030e\3\2"+
		"\2\2\u030d\u0304\3\2\2\2\u030d\u030c\3\2\2\2\u030ei\3\2\2\2\u030f\u0315"+
		"\n\20\2\2\u0310\u0312\7;\2\2\u0311\u0313\5\f\7\2\u0312\u0311\3\2\2\2\u0312"+
		"\u0313\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0316\7<\2\2\u0315\u0310\3\2"+
		"\2\2\u0315\u0316\3\2\2\2\u0316\u0319\3\2\2\2\u0317\u0319\3\2\2\2\u0318"+
		"\u030f\3\2\2\2\u0318\u0317\3\2\2\2\u0319k\3\2\2\2\u031a\u0320\n\21\2\2"+
		"\u031b\u031c\7;\2\2\u031c\u031d\5l\67\2\u031d\u031e\7<\2\2\u031e\u0320"+
		"\3\2\2\2\u031f\u031a\3\2\2\2\u031f\u031b\3\2\2\2\u0320\u0323\3\2\2\2\u0321"+
		"\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322m\3\2\2\2\u0323\u0321\3\2\2\2"+
		"\u0324\u0326\7K\2\2\u0325\u0327\5p9\2\u0326\u0325\3\2\2\2\u0326\u0327"+
		"\3\2\2\2\u0327\u0337\3\2\2\2\u0328\u032a\7K\2\2\u0329\u032b\5p9\2\u032a"+
		"\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u0337\5n"+
		"8\2\u032d\u032f\7R\2\2\u032e\u0330\5p9\2\u032f\u032e\3\2\2\2\u032f\u0330"+
		"\3\2\2\2\u0330\u0337\3\2\2\2\u0331\u0333\7R\2\2\u0332\u0334\5p9\2\u0333"+
		"\u0332\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\5n"+
		"8\2\u0336\u0324\3\2\2\2\u0336\u0328\3\2\2\2\u0336\u032d\3\2\2\2\u0336"+
		"\u0331\3\2\2\2\u0337o\3\2\2\2\u0338\u0339\b9\1\2\u0339\u033a\5Z.\2\u033a"+
		"\u033f\3\2\2\2\u033b\u033c\f\3\2\2\u033c\u033e\5Z.\2\u033d\u033b\3\2\2"+
		"\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340q"+
		"\3\2\2\2\u0341\u033f\3\2\2\2\u0342\u0348\5t;\2\u0343\u0344\5t;\2\u0344"+
		"\u0345\7X\2\2\u0345\u0346\7h\2\2\u0346\u0348\3\2\2\2\u0347\u0342\3\2\2"+
		"\2\u0347\u0343\3\2\2\2\u0348s\3\2\2\2\u0349\u034a\b;\1\2\u034a\u034b\5"+
		"v<\2\u034b\u0351\3\2\2\2\u034c\u034d\f\3\2\2\u034d\u034e\7X\2\2\u034e"+
		"\u0350\5v<\2\u034f\u034c\3\2\2\2\u0350\u0353\3\2\2\2\u0351\u034f\3\2\2"+
		"\2\u0351\u0352\3\2\2\2\u0352u\3\2\2\2\u0353\u0351\3\2\2\2\u0354\u0355"+
		"\5\64\33\2\u0355\u0356\5`\61\2\u0356\u035c\3\2\2\2\u0357\u0359\5\66\34"+
		"\2\u0358\u035a\5|?\2\u0359\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035c"+
		"\3\2\2\2\u035b\u0354\3\2\2\2\u035b\u0357\3\2\2\2\u035cw\3\2\2\2\u035d"+
		"\u035e\b=\1\2\u035e\u035f\7i\2\2\u035f\u0365\3\2\2\2\u0360\u0361\f\3\2"+
		"\2\u0361\u0362\7X\2\2\u0362\u0364\7i\2\2\u0363\u0360\3\2\2\2\u0364\u0367"+
		"\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366y\3\2\2\2\u0367"+
		"\u0365\3\2\2\2\u0368\u036a\5J&\2\u0369\u036b\5|?\2\u036a\u0369\3\2\2\2"+
		"\u036a\u036b\3\2\2\2\u036b{\3\2\2\2\u036c\u0378\5n8\2\u036d\u036f\5n8"+
		"\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0374"+
		"\5~@\2\u0371\u0373\5d\63\2\u0372\u0371\3\2\2\2\u0373\u0376\3\2\2\2\u0374"+
		"\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0378\3\2\2\2\u0376\u0374\3\2"+
		"\2\2\u0377\u036c\3\2\2\2\u0377\u036e\3\2\2\2\u0378}\3\2\2\2\u0379\u037a"+
		"\b@\1\2\u037a\u037b\7;\2\2\u037b\u037c\5|?\2\u037c\u0380\7<\2\2\u037d"+
		"\u037f\5d\63\2\u037e\u037d\3\2\2\2\u037f\u0382\3\2\2\2\u0380\u037e\3\2"+
		"\2\2\u0380\u0381\3\2\2\2\u0381\u03a8\3\2\2\2\u0382\u0380\3\2\2\2\u0383"+
		"\u0385\7=\2\2\u0384\u0386\5p9\2\u0385\u0384\3\2\2\2\u0385\u0386\3\2\2"+
		"\2\u0386\u0388\3\2\2\2\u0387\u0389\5*\26\2\u0388\u0387\3\2\2\2\u0388\u0389"+
		"\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u03a8\7>\2\2\u038b\u038c\7=\2\2\u038c"+
		"\u038e\7(\2\2\u038d\u038f\5p9\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2"+
		"\2\u038f\u0390\3\2\2\2\u0390\u0391\5*\26\2\u0391\u0392\7>\2\2\u0392\u03a8"+
		"\3\2\2\2\u0393\u0394\7=\2\2\u0394\u0395\5p9\2\u0395\u0396\7(\2\2\u0396"+
		"\u0397\5*\26\2\u0397\u0398\7>\2\2\u0398\u03a8\3\2\2\2\u0399\u039a\7=\2"+
		"\2\u039a\u039b\7K\2\2\u039b\u03a8\7>\2\2\u039c\u039e\7;\2\2\u039d\u039f"+
		"\5r:\2\u039e\u039d\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0"+
		"\u03a4\7<\2\2\u03a1\u03a3\5d\63\2\u03a2\u03a1\3\2\2\2\u03a3\u03a6\3\2"+
		"\2\2\u03a4\u03a2\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6"+
		"\u03a4\3\2\2\2\u03a7\u0379\3\2\2\2\u03a7\u0383\3\2\2\2\u03a7\u038b\3\2"+
		"\2\2\u03a7\u0393\3\2\2\2\u03a7\u0399\3\2\2\2\u03a7\u039c\3\2\2\2\u03a8"+
		"\u03d4\3\2\2\2\u03a9\u03aa\f\7\2\2\u03aa\u03ac\7=\2\2\u03ab\u03ad\5p9"+
		"\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03af\3\2\2\2\u03ae\u03b0"+
		"\5*\26\2\u03af\u03ae\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1"+
		"\u03d3\7>\2\2\u03b2\u03b3\f\6\2\2\u03b3\u03b4\7=\2\2\u03b4\u03b6\7(\2"+
		"\2\u03b5\u03b7\5p9\2\u03b6\u03b5\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8"+
		"\3\2\2\2\u03b8\u03b9\5*\26\2\u03b9\u03ba\7>\2\2\u03ba\u03d3\3\2\2\2\u03bb"+
		"\u03bc\f\5\2\2\u03bc\u03bd\7=\2\2\u03bd\u03be\5p9\2\u03be\u03bf\7(\2\2"+
		"\u03bf\u03c0\5*\26\2\u03c0\u03c1\7>\2\2\u03c1\u03d3\3\2\2\2\u03c2\u03c3"+
		"\f\4\2\2\u03c3\u03c4\7=\2\2\u03c4\u03c5\7K\2\2\u03c5\u03d3\7>\2\2\u03c6"+
		"\u03c7\f\3\2\2\u03c7\u03c9\7;\2\2\u03c8\u03ca\5r:\2\u03c9\u03c8\3\2\2"+
		"\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03cf\7<\2\2\u03cc\u03ce"+
		"\5d\63\2\u03cd\u03cc\3\2\2\2\u03ce\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf"+
		"\u03d0\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03cf\3\2\2\2\u03d2\u03a9\3\2"+
		"\2\2\u03d2\u03b2\3\2\2\2\u03d2\u03bb\3\2\2\2\u03d2\u03c2\3\2\2\2\u03d2"+
		"\u03c6\3\2\2\2\u03d3\u03d6\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d5\3\2"+
		"\2\2\u03d5\177\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d7\u03d8\7i\2\2\u03d8\u0081"+
		"\3\2\2\2\u03d9\u03e2\5*\26\2\u03da\u03db\7?\2\2\u03db\u03dd\5\u0084C\2"+
		"\u03dc\u03de\7X\2\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df"+
		"\3\2\2\2\u03df\u03e0\7@\2\2\u03e0\u03e2\3\2\2\2\u03e1\u03d9\3\2\2\2\u03e1"+
		"\u03da\3\2\2\2\u03e2\u0083\3\2\2\2\u03e3\u03e5\bC\1\2\u03e4\u03e6\5\u0086"+
		"D\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7"+
		"\u03e8\5\u0082B\2\u03e8\u03f1\3\2\2\2\u03e9\u03ea\f\3\2\2\u03ea\u03ec"+
		"\7X\2\2\u03eb\u03ed\5\u0086D\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed\3\2\2\2"+
		"\u03ed\u03ee\3\2\2\2\u03ee\u03f0\5\u0082B\2\u03ef\u03e9\3\2\2\2\u03f0"+
		"\u03f3\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u0085\3\2"+
		"\2\2\u03f3\u03f1\3\2\2\2\u03f4\u03f5\5\u0088E\2\u03f5\u03f6\7Y\2\2\u03f6"+
		"\u0087\3\2\2\2\u03f7\u03f8\bE\1\2\u03f8\u03f9\5\u008aF\2\u03f9\u03fe\3"+
		"\2\2\2\u03fa\u03fb\f\3\2\2\u03fb\u03fd\5\u008aF\2\u03fc\u03fa\3\2\2\2"+
		"\u03fd\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0089"+
		"\3\2\2\2\u0400\u03fe\3\2\2\2\u0401\u0402\7=\2\2\u0402\u0403\5\60\31\2"+
		"\u0403\u0404\7>\2\2\u0404\u0408\3\2\2\2\u0405\u0406\7g\2\2\u0406\u0408"+
		"\7i\2\2\u0407\u0401\3\2\2\2\u0407\u0405\3\2\2\2\u0408\u008b\3\2\2\2\u0409"+
		"\u040a\79\2\2\u040a\u040b\7;\2\2\u040b\u040c\5\60\31\2\u040c\u040e\7X"+
		"\2\2\u040d\u040f\7l\2\2\u040e\u040d\3\2\2\2\u040f\u0410\3\2\2\2\u0410"+
		"\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0413\7<"+
		"\2\2\u0413\u0414\7W\2\2\u0414\u008d\3\2\2\2\u0415\u041c\5\u0090I\2\u0416"+
		"\u041c\5\u0092J\2\u0417\u041c\5\u0098M\2\u0418\u041c\5\u009aN\2\u0419"+
		"\u041c\5\u009cO\2\u041a\u041c\5\u00a4S\2\u041b\u0415\3\2\2\2\u041b\u0416"+
		"\3\2\2\2\u041b\u0417\3\2\2\2\u041b\u0418\3\2\2\2\u041b\u0419\3\2\2\2\u041b"+
		"\u041a\3\2\2\2\u041c\u008f\3\2\2\2\u041d\u041e\7i\2\2\u041e\u041f\7V\2"+
		"\2\u041f\u0429\5\u008eH\2\u0420\u0421\7\21\2\2\u0421\u0422\5\60\31\2\u0422"+
		"\u0423\7V\2\2\u0423\u0424\5\u008eH\2\u0424\u0429\3\2\2\2\u0425\u0426\7"+
		"\25\2\2\u0426\u0427\7V\2\2\u0427\u0429\5\u008eH\2\u0428\u041d\3\2\2\2"+
		"\u0428\u0420\3\2\2\2\u0428\u0425\3\2\2\2\u0429\u0091\3\2\2\2\u042a\u042c"+
		"\7?\2\2\u042b\u042d\5\u0094K\2\u042c\u042b\3\2\2\2\u042c\u042d\3\2\2\2"+
		"\u042d\u042e\3\2\2\2\u042e\u042f\7@\2\2\u042f\u0093\3\2\2\2\u0430\u0431"+
		"\bK\1\2\u0431\u0432\5\u0096L\2\u0432\u0437\3\2\2\2\u0433\u0434\f\3\2\2"+
		"\u0434\u0436\5\u0096L\2\u0435\u0433\3\2\2\2\u0436\u0439\3\2\2\2\u0437"+
		"\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0095\3\2\2\2\u0439\u0437\3\2"+
		"\2\2\u043a\u043d\5\u008eH\2\u043b\u043d\5\62\32\2\u043c\u043a\3\2\2\2"+
		"\u043c\u043b\3\2\2\2\u043d\u0097\3\2\2\2\u043e\u0440\5.\30\2\u043f\u043e"+
		"\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\7W\2\2\u0442"+
		"\u0099\3\2\2\2\u0443\u0444\7\36\2\2\u0444\u0445\7;\2\2\u0445\u0446\5."+
		"\30\2\u0446\u0447\7<\2\2\u0447\u044a\5\u008eH\2\u0448\u0449\7\30\2\2\u0449"+
		"\u044b\5\u008eH\2\u044a\u0448\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u0453"+
		"\3\2\2\2\u044c\u044d\7*\2\2\u044d\u044e\7;\2\2\u044e\u044f\5.\30\2\u044f"+
		"\u0450\7<\2\2\u0450\u0451\5\u008eH\2\u0451\u0453\3\2\2\2\u0452\u0443\3"+
		"\2\2\2\u0452\u044c\3\2\2\2\u0453\u009b\3\2\2\2\u0454\u0455\7\60\2\2\u0455"+
		"\u0456\7;\2\2\u0456\u0457\5.\30\2\u0457\u0458\7<\2\2\u0458\u0459\5\u008e"+
		"H\2\u0459\u0469\3\2\2\2\u045a\u045b\7\26\2\2\u045b\u045c\5\u008eH\2\u045c"+
		"\u045d\7\60\2\2\u045d\u045e\7;\2\2\u045e\u045f\5.\30\2\u045f\u0460\7<"+
		"\2\2\u0460\u0461\7W\2\2\u0461\u0469\3\2\2\2\u0462\u0463\7\34\2\2\u0463"+
		"\u0464\7;\2\2\u0464\u0465\5\u009eP\2\u0465\u0466\7<\2\2\u0466\u0467\5"+
		"\u008eH\2\u0467\u0469\3\2\2\2\u0468\u0454\3\2\2\2\u0468\u045a\3\2\2\2"+
		"\u0468\u0462\3\2\2\2\u0469\u009d\3\2\2\2\u046a\u046b\5\u00a0Q\2\u046b"+
		"\u046d\7W\2\2\u046c\u046e\5\u00a2R\2\u046d\u046c\3\2\2\2\u046d\u046e\3"+
		"\2\2\2\u046e\u046f\3\2\2\2\u046f\u0471\7W\2\2\u0470\u0472\5\u00a2R\2\u0471"+
		"\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u047f\3\2\2\2\u0473\u0475\5."+
		"\30\2\u0474\u0473\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476\3\2\2\2\u0476"+
		"\u0478\7W\2\2\u0477\u0479\5\u00a2R\2\u0478\u0477\3\2\2\2\u0478\u0479\3"+
		"\2\2\2\u0479\u047a\3\2\2\2\u047a\u047c\7W\2\2\u047b\u047d\5\u00a2R\2\u047c"+
		"\u047b\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047f\3\2\2\2\u047e\u046a\3\2"+
		"\2\2\u047e\u0474\3\2\2\2\u047f\u009f\3\2\2\2\u0480\u0481\5\64\33\2\u0481"+
		"\u0482\5:\36\2\u0482\u0485\3\2\2\2\u0483\u0485\5\64\33\2\u0484\u0480\3"+
		"\2\2\2\u0484\u0483\3\2\2\2\u0485\u00a1\3\2\2\2\u0486\u0487\bR\1\2\u0487"+
		"\u0488\5*\26\2\u0488\u048e\3\2\2\2\u0489\u048a\f\3\2\2\u048a\u048b\7X"+
		"\2\2\u048b\u048d\5*\26\2\u048c\u0489\3\2\2\2\u048d\u0490\3\2\2\2\u048e"+
		"\u048c\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u00a3\3\2\2\2\u0490\u048e\3\2"+
		"\2\2\u0491\u0492\7\35\2\2\u0492\u0493\7i\2\2\u0493\u04a2\7W\2\2\u0494"+
		"\u0495\7\24\2\2\u0495\u04a2\7W\2\2\u0496\u0497\7\20\2\2\u0497\u04a2\7"+
		"W\2\2\u0498\u049a\7$\2\2\u0499\u049b\5.\30\2\u049a\u0499\3\2\2\2\u049a"+
		"\u049b\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u04a2\7W\2\2\u049d\u049e\7\35"+
		"\2\2\u049e\u049f\5\16\b\2\u049f\u04a0\7W\2\2\u04a0\u04a2\3\2\2\2\u04a1"+
		"\u0491\3\2\2\2\u04a1\u0494\3\2\2\2\u04a1\u0496\3\2\2\2\u04a1\u0498\3\2"+
		"\2\2\u04a1\u049d\3\2\2\2\u04a2\u00a5\3\2\2\2\u04a3\u04a5\5\u00a8U\2\u04a4"+
		"\u04a3\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a6\u04a7\7\2"+
		"\2\3\u04a7\u00a7\3\2\2\2\u04a8\u04a9\bU\1\2\u04a9\u04aa\5\u00aaV\2\u04aa"+
		"\u04af\3\2\2\2\u04ab\u04ac\f\3\2\2\u04ac\u04ae\5\u00aaV\2\u04ad\u04ab"+
		"\3\2\2\2\u04ae\u04b1\3\2\2\2\u04af\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0"+
		"\u00a9\3\2\2\2\u04b1\u04af\3\2\2\2\u04b2\u04b6\5\u00acW\2\u04b3\u04b6"+
		"\5\62\32\2\u04b4\u04b6\7W\2\2\u04b5\u04b2\3\2\2\2\u04b5\u04b3\3\2\2\2"+
		"\u04b5\u04b4\3\2\2\2\u04b6\u00ab\3\2\2\2\u04b7\u04b9\5\64\33\2\u04b8\u04b7"+
		"\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04ba\3\2\2\2\u04ba\u04bc\5`\61\2\u04bb"+
		"\u04bd\5\u00aeX\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be"+
		"\3\2\2\2\u04be\u04bf\5\u0092J\2\u04bf\u00ad\3\2\2\2\u04c0\u04c1\bX\1\2"+
		"\u04c1\u04c2\5\62\32\2\u04c2\u04c7\3\2\2\2\u04c3\u04c4\f\3\2\2\u04c4\u04c6"+
		"\5\62\32\2\u04c5\u04c3\3\2\2\2\u04c6\u04c9\3\2\2\2\u04c7\u04c5\3\2\2\2"+
		"\u04c7\u04c8\3\2\2\2\u04c8\u00af\3\2\2\2\u04c9\u04c7\3\2\2\2\u0086\u00b5"+
		"\u00bd\u00d1\u00e2\u00ec\u0110\u011a\u0125\u0127\u0132\u0149\u015a\u0164"+
		"\u016f\u017a\u0185\u0190\u019b\u01a6\u01b1\u01bc\u01c7\u01d0\u01d8\u01e4"+
		"\u01f1\u01f6\u01fb\u0202\u020c\u0214\u0227\u022d\u0232\u023b\u0246\u024b"+
		"\u0250\u0254\u0258\u025a\u0264\u0269\u026d\u0271\u0276\u027c\u0286\u028e"+
		"\u029f\u02ab\u02ae\u02b4\u02c0\u02c5\u02c8\u02cf\u02de\u02ea\u02ed\u02ef"+
		"\u02f7\u02fb\u0309\u030d\u0312\u0315\u0318\u031f\u0321\u0326\u032a\u032f"+
		"\u0333\u0336\u033f\u0347\u0351\u0359\u035b\u0365\u036a\u036e\u0374\u0377"+
		"\u0380\u0385\u0388\u038e\u039e\u03a4\u03a7\u03ac\u03af\u03b6\u03c9\u03cf"+
		"\u03d2\u03d4\u03dd\u03e1\u03e5\u03ec\u03f1\u03fe\u0407\u0410\u041b\u0428"+
		"\u042c\u0437\u043c\u043f\u044a\u0452\u0468\u046d\u0471\u0474\u0478\u047c"+
		"\u047e\u0484\u048e\u049a\u04a1\u04a4\u04af\u04b5\u04b8\u04bc\u04c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}