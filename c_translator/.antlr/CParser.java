// Generated from /Users/raphaelbijaoui/OneDrive - Imperial College London/Imperial/EIEY2/Language Processors/EE2-Compiler/c_translator/C.g4 by ANTLR 4.7.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WHITESPACES=7, VOID=8, 
		INT=9, RETURN=10, IF=11, ELSE=12, WHILE=13, IDENTIFIER=14, INT_CONSTANT=15, 
		STRING_LITERAL=16, ASS_OP=17, NOT_OP=18, ADD_OP=19, SUB_OP=20, MUL_OP=21, 
		DIV_OP=22, LT_OP=23, GL_OP=24, LE_OP=25, GE_OP=26, EQ_OP=27, NE_OP=28, 
		AND_OP=29, OR_OP=30, INC_OP=31, OP_CR=32, CL_CR=33, OTHERS=34;
	public static final int
		RULE_translation_unit = 0, RULE_function_definition = 1, RULE_type_specifier = 2, 
		RULE_fun_declarator = 3, RULE_parameter_list = 4, RULE_parameter_declaration = 5, 
		RULE_declarator = 6, RULE_constant_expression = 7, RULE_compound_statement = 8, 
		RULE_statement_list = 9, RULE_statement = 10, RULE_assignment_statement = 11, 
		RULE_expression = 12, RULE_logical_and_expression = 13, RULE_equality_expression = 14, 
		RULE_relational_expression = 15, RULE_additive_expression = 16, RULE_multiplicative_expression = 17, 
		RULE_unary_expression = 18, RULE_postfix_expression = 19, RULE_primary_expression = 20, 
		RULE_l_expression = 21, RULE_expression_list = 22, RULE_unary_operator = 23, 
		RULE_selection_statement = 24, RULE_else_statement = 25, RULE_iteration_statement = 26, 
		RULE_declaration_list = 27, RULE_declaration = 28, RULE_declarator_list = 29;
	public static final String[] ruleNames = {
		"translation_unit", "function_definition", "type_specifier", "fun_declarator", 
		"parameter_list", "parameter_declaration", "declarator", "constant_expression", 
		"compound_statement", "statement_list", "statement", "assignment_statement", 
		"expression", "logical_and_expression", "equality_expression", "relational_expression", 
		"additive_expression", "multiplicative_expression", "unary_expression", 
		"postfix_expression", "primary_expression", "l_expression", "expression_list", 
		"unary_operator", "selection_statement", "else_statement", "iteration_statement", 
		"declaration_list", "declaration", "declarator_list"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "','", "'['", "']'", "';'", null, "'void'", "'int'", 
		"'return'", "'if'", "'else'", "'while'", null, null, "'\"(\\.|[^\"\\])*\"'", 
		"'='", "'!'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", 
		"'=='", "'!='", "'&&'", "'||'", "'++'", "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "WHITESPACES", "VOID", "INT", 
		"RETURN", "IF", "ELSE", "WHILE", "IDENTIFIER", "INT_CONSTANT", "STRING_LITERAL", 
		"ASS_OP", "NOT_OP", "ADD_OP", "SUB_OP", "MUL_OP", "DIV_OP", "LT_OP", "GL_OP", 
		"LE_OP", "GE_OP", "EQ_OP", "NE_OP", "AND_OP", "OR_OP", "INC_OP", "OP_CR", 
		"CL_CR", "OTHERS"
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
	public static class Translation_unitContext extends ParserRuleContext {
		public Translation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translation_unit; }
	 
		public Translation_unitContext() { }
		public void copyFrom(Translation_unitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultDefContext extends Translation_unitContext {
		public Translation_unitContext tu;
		public DeclarationContext decl;
		public Function_definitionContext func_def;
		public Translation_unitContext translation_unit() {
			return getRuleContext(Translation_unitContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public MultDefContext(Translation_unitContext ctx) { copyFrom(ctx); }
	}
	public static class TuDeclContext extends Translation_unitContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TuDeclContext(Translation_unitContext ctx) { copyFrom(ctx); }
	}
	public static class Tu_funcDefContext extends Translation_unitContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public Tu_funcDefContext(Translation_unitContext ctx) { copyFrom(ctx); }
	}

	public final Translation_unitContext translation_unit() throws RecognitionException {
		return translation_unit(0);
	}

	private Translation_unitContext translation_unit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Translation_unitContext _localctx = new Translation_unitContext(_ctx, _parentState);
		Translation_unitContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_translation_unit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new TuDeclContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(61);
				declaration();
				}
				break;
			case 2:
				{
				_localctx = new Tu_funcDefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				function_definition();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultDefContext(new Translation_unitContext(_parentctx, _parentState));
					((MultDefContext)_localctx).tu = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_translation_unit);
					setState(65);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(66);
						((MultDefContext)_localctx).decl = declaration();
						}
						break;
					case 2:
						{
						setState(67);
						((MultDefContext)_localctx).func_def = function_definition();
						}
						break;
					}
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Function_definitionContext extends ParserRuleContext {
		public Type_specifierContext type;
		public Fun_declaratorContext func_dec;
		public Compound_statementContext comp_stat;
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Fun_declaratorContext fun_declarator() {
			return getRuleContext(Fun_declaratorContext.class,0);
		}
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			((Function_definitionContext)_localctx).type = type_specifier();
			setState(76);
			((Function_definitionContext)_localctx).func_dec = fun_declarator();
			setState(77);
			((Function_definitionContext)_localctx).comp_stat = compound_statement();
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

	public static class Type_specifierContext extends ParserRuleContext {
		public Token type;
		public TerminalNode VOID() { return getToken(CParser.VOID, 0); }
		public TerminalNode INT() { return getToken(CParser.INT, 0); }
		public Type_specifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_specifier; }
	}

	public final Type_specifierContext type_specifier() throws RecognitionException {
		Type_specifierContext _localctx = new Type_specifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type_specifier);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				((Type_specifierContext)_localctx).type = match(VOID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				((Type_specifierContext)_localctx).type = match(INT);
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

	public static class Fun_declaratorContext extends ParserRuleContext {
		public Fun_declaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_declarator; }
	 
		public Fun_declaratorContext() { }
		public void copyFrom(Fun_declaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncDeclParamContext extends Fun_declaratorContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public FuncDeclParamContext(Fun_declaratorContext ctx) { copyFrom(ctx); }
	}
	public static class FuncDeclContext extends Fun_declaratorContext {
		public Token id;
		public Parameter_listContext params;
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public FuncDeclContext(Fun_declaratorContext ctx) { copyFrom(ctx); }
	}

	public final Fun_declaratorContext fun_declarator() throws RecognitionException {
		Fun_declaratorContext _localctx = new Fun_declaratorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fun_declarator);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new FuncDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				((FuncDeclContext)_localctx).id = match(IDENTIFIER);
				setState(84);
				match(T__0);
				setState(85);
				((FuncDeclContext)_localctx).params = parameter_list(0);
				setState(86);
				match(T__1);
				}
				break;
			case 2:
				_localctx = new FuncDeclParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				((FuncDeclParamContext)_localctx).id = match(IDENTIFIER);
				setState(89);
				match(T__0);
				setState(90);
				match(T__1);
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

	public static class Parameter_listContext extends ParserRuleContext {
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
	 
		public Parameter_listContext() { }
		public void copyFrom(Parameter_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultParamContext extends Parameter_listContext {
		public Parameter_listContext params;
		public Parameter_declarationContext param;
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public Parameter_declarationContext parameter_declaration() {
			return getRuleContext(Parameter_declarationContext.class,0);
		}
		public MultParamContext(Parameter_listContext ctx) { copyFrom(ctx); }
	}
	public static class SingleParamContext extends Parameter_listContext {
		public Parameter_declarationContext param;
		public Parameter_declarationContext parameter_declaration() {
			return getRuleContext(Parameter_declarationContext.class,0);
		}
		public SingleParamContext(Parameter_listContext ctx) { copyFrom(ctx); }
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		return parameter_list(0);
	}

	private Parameter_listContext parameter_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, _parentState);
		Parameter_listContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_parameter_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleParamContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(94);
			((SingleParamContext)_localctx).param = parameter_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultParamContext(new Parameter_listContext(_parentctx, _parentState));
					((MultParamContext)_localctx).params = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_parameter_list);
					setState(96);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(97);
					match(T__2);
					setState(98);
					((MultParamContext)_localctx).param = parameter_declaration();
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Parameter_declarationContext extends ParserRuleContext {
		public Type_specifierContext type;
		public DeclaratorContext decl;
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			((Parameter_declarationContext)_localctx).type = type_specifier();
			setState(105);
			((Parameter_declarationContext)_localctx).decl = declarator(0);
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
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
	 
		public DeclaratorContext() { }
		public void copyFrom(DeclaratorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclBracketsContext extends DeclaratorContext {
		public DeclaratorContext decl;
		public Constant_expressionContext const_expr;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public DeclBracketsContext(DeclaratorContext ctx) { copyFrom(ctx); }
	}
	public static class DeclIdContext extends DeclaratorContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public DeclIdContext(DeclaratorContext ctx) { copyFrom(ctx); }
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		return declarator(0);
	}

	private DeclaratorContext declarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, _parentState);
		DeclaratorContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_declarator, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new DeclIdContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(108);
			((DeclIdContext)_localctx).id = match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclBracketsContext(new DeclaratorContext(_parentctx, _parentState));
					((DeclBracketsContext)_localctx).decl = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_declarator);
					setState(110);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(111);
					match(T__3);
					setState(112);
					((DeclBracketsContext)_localctx).const_expr = constant_expression();
					setState(113);
					match(T__4);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Constant_expressionContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(CParser.INT_CONSTANT, 0); }
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constant_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(INT_CONSTANT);
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

	public static class Compound_statementContext extends ParserRuleContext {
		public Compound_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_statement; }
	 
		public Compound_statementContext() { }
		public void copyFrom(Compound_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CmpStatementEmptyContext extends Compound_statementContext {
		public TerminalNode OP_CR() { return getToken(CParser.OP_CR, 0); }
		public TerminalNode CL_CR() { return getToken(CParser.CL_CR, 0); }
		public CmpStatementEmptyContext(Compound_statementContext ctx) { copyFrom(ctx); }
	}
	public static class CmpStatementNonEmptyContext extends Compound_statementContext {
		public Statement_listContext stat_l;
		public TerminalNode OP_CR() { return getToken(CParser.OP_CR, 0); }
		public TerminalNode CL_CR() { return getToken(CParser.CL_CR, 0); }
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public CmpStatementNonEmptyContext(Compound_statementContext ctx) { copyFrom(ctx); }
	}

	public final Compound_statementContext compound_statement() throws RecognitionException {
		Compound_statementContext _localctx = new Compound_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compound_statement);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new CmpStatementEmptyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(OP_CR);
				setState(123);
				match(CL_CR);
				}
				break;
			case 2:
				_localctx = new CmpStatementNonEmptyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(OP_CR);
				setState(125);
				((CmpStatementNonEmptyContext)_localctx).stat_l = statement_list(0);
				setState(126);
				match(CL_CR);
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

	public static class Statement_listContext extends ParserRuleContext {
		public Statement_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_list; }
	 
		public Statement_listContext() { }
		public void copyFrom(Statement_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleStatmentsDeclarationListContext extends Statement_listContext {
		public Statement_listContext stat_l;
		public Declaration_listContext decl_l;
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public Declaration_listContext declaration_list() {
			return getRuleContext(Declaration_listContext.class,0);
		}
		public MultipleStatmentsDeclarationListContext(Statement_listContext ctx) { copyFrom(ctx); }
	}
	public static class SingleDeclarationListContext extends Statement_listContext {
		public Declaration_listContext decl_l;
		public Declaration_listContext declaration_list() {
			return getRuleContext(Declaration_listContext.class,0);
		}
		public SingleDeclarationListContext(Statement_listContext ctx) { copyFrom(ctx); }
	}
	public static class SingleStatementContext extends Statement_listContext {
		public StatementContext stat;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SingleStatementContext(Statement_listContext ctx) { copyFrom(ctx); }
	}
	public static class MultipleStatmentsContext extends Statement_listContext {
		public Statement_listContext stat_l;
		public StatementContext stat;
		public Statement_listContext statement_list() {
			return getRuleContext(Statement_listContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MultipleStatmentsContext(Statement_listContext ctx) { copyFrom(ctx); }
	}

	public final Statement_listContext statement_list() throws RecognitionException {
		return statement_list(0);
	}

	private Statement_listContext statement_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Statement_listContext _localctx = new Statement_listContext(_ctx, _parentState);
		Statement_listContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_statement_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case RETURN:
			case IF:
			case WHILE:
			case IDENTIFIER:
			case INT_CONSTANT:
			case STRING_LITERAL:
			case NOT_OP:
			case SUB_OP:
			case OP_CR:
				{
				_localctx = new SingleStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(131);
				((SingleStatementContext)_localctx).stat = statement();
				}
				break;
			case VOID:
			case INT:
				{
				_localctx = new SingleDeclarationListContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				((SingleDeclarationListContext)_localctx).decl_l = declaration_list(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultipleStatmentsContext(new Statement_listContext(_parentctx, _parentState));
						((MultipleStatmentsContext)_localctx).stat_l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_statement_list);
						setState(135);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(136);
						((MultipleStatmentsContext)_localctx).stat = statement();
						}
						break;
					case 2:
						{
						_localctx = new MultipleStatmentsDeclarationListContext(new Statement_listContext(_parentctx, _parentState));
						((MultipleStatmentsDeclarationListContext)_localctx).stat_l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_statement_list);
						setState(137);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(138);
						((MultipleStatmentsDeclarationListContext)_localctx).decl_l = declaration_list(0);
						}
						break;
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
	public static class IterationStatementContext extends StatementContext {
		public Iteration_statementContext stmt;
		public Iteration_statementContext iteration_statement() {
			return getRuleContext(Iteration_statementContext.class,0);
		}
		public IterationStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class AssignmentStatementContext extends StatementContext {
		public Assignment_statementContext stmt;
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class CompoundStatementContext extends StatementContext {
		public Compound_statementContext stmt;
		public Compound_statementContext compound_statement() {
			return getRuleContext(Compound_statementContext.class,0);
		}
		public CompoundStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ExprStatementContext extends StatementContext {
		public L_expressionContext l_expr;
		public ExpressionContext expr;
		public L_expressionContext l_expression() {
			return getRuleContext(L_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class SelectionStatementContext extends StatementContext {
		public Selection_statementContext stmt;
		public Selection_statementContext selection_statement() {
			return getRuleContext(Selection_statementContext.class,0);
		}
		public SelectionStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class ReturnStatementContext extends StatementContext {
		public ExpressionContext expr;
		public TerminalNode RETURN() { return getToken(CParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new CompoundStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				((CompoundStatementContext)_localctx).stmt = compound_statement();
				}
				break;
			case 2:
				_localctx = new SelectionStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				((SelectionStatementContext)_localctx).stmt = selection_statement();
				}
				break;
			case 3:
				_localctx = new IterationStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				((IterationStatementContext)_localctx).stmt = iteration_statement();
				}
				break;
			case 4:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				((AssignmentStatementContext)_localctx).stmt = assignment_statement();
				setState(148);
				match(T__5);
				}
				break;
			case 5:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(150);
					((ExprStatementContext)_localctx).l_expr = l_expression(0);
					}
					break;
				case 2:
					{
					setState(151);
					((ExprStatementContext)_localctx).expr = expression(0);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(154);
				match(RETURN);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IDENTIFIER) | (1L << INT_CONSTANT) | (1L << STRING_LITERAL) | (1L << NOT_OP) | (1L << SUB_OP))) != 0)) {
					{
					setState(155);
					((ReturnStatementContext)_localctx).expr = expression(0);
					}
				}

				setState(158);
				match(T__5);
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
	 
		public Assignment_statementContext() { }
		public void copyFrom(Assignment_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssgnOpContext extends Assignment_statementContext {
		public L_expressionContext left;
		public ExpressionContext right;
		public TerminalNode ASS_OP() { return getToken(CParser.ASS_OP, 0); }
		public L_expressionContext l_expression() {
			return getRuleContext(L_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssgnOpContext(Assignment_statementContext ctx) { copyFrom(ctx); }
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment_statement);
		try {
			_localctx = new AssgnOpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			((AssgnOpContext)_localctx).left = l_expression(0);
			setState(162);
			match(ASS_OP);
			setState(163);
			((AssgnOpContext)_localctx).right = expression(0);
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
	public static class OrOpContext extends ExpressionContext {
		public ExpressionContext left;
		public Token op;
		public Logical_and_expressionContext right;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OR_OP() { return getToken(CParser.OR_OP, 0); }
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public OrOpContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalExprContext extends ExpressionContext {
		public Logical_and_expressionContext expr;
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public LogicalExprContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LogicalExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(166);
			((LogicalExprContext)_localctx).expr = logical_and_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrOpContext(new ExpressionContext(_parentctx, _parentState));
					((OrOpContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(168);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(169);
					((OrOpContext)_localctx).op = match(OR_OP);
					setState(170);
					((OrOpContext)_localctx).right = logical_and_expression(0);
					}
					} 
				}
				setState(175);
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

	public static class Logical_and_expressionContext extends ParserRuleContext {
		public Logical_and_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_and_expression; }
	 
		public Logical_and_expressionContext() { }
		public void copyFrom(Logical_and_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndOpContext extends Logical_and_expressionContext {
		public Logical_and_expressionContext left;
		public Token op;
		public Equality_expressionContext right;
		public Logical_and_expressionContext logical_and_expression() {
			return getRuleContext(Logical_and_expressionContext.class,0);
		}
		public TerminalNode AND_OP() { return getToken(CParser.AND_OP, 0); }
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public AndOpContext(Logical_and_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqualityExprContext extends Logical_and_expressionContext {
		public Equality_expressionContext expr;
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public EqualityExprContext(Logical_and_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Logical_and_expressionContext logical_and_expression() throws RecognitionException {
		return logical_and_expression(0);
	}

	private Logical_and_expressionContext logical_and_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_and_expressionContext _localctx = new Logical_and_expressionContext(_ctx, _parentState);
		Logical_and_expressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_logical_and_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new EqualityExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(177);
			((EqualityExprContext)_localctx).expr = equality_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndOpContext(new Logical_and_expressionContext(_parentctx, _parentState));
					((AndOpContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logical_and_expression);
					setState(179);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(180);
					((AndOpContext)_localctx).op = match(AND_OP);
					setState(181);
					((AndOpContext)_localctx).right = equality_expression(0);
					}
					} 
				}
				setState(186);
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

	public static class Equality_expressionContext extends ParserRuleContext {
		public Equality_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality_expression; }
	 
		public Equality_expressionContext() { }
		public void copyFrom(Equality_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqOpContext extends Equality_expressionContext {
		public Equality_expressionContext left;
		public Token op;
		public Relational_expressionContext right;
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public TerminalNode EQ_OP() { return getToken(CParser.EQ_OP, 0); }
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public EqOpContext(Equality_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class NeqOpContext extends Equality_expressionContext {
		public Equality_expressionContext left;
		public Token op;
		public Relational_expressionContext right;
		public Equality_expressionContext equality_expression() {
			return getRuleContext(Equality_expressionContext.class,0);
		}
		public TerminalNode NE_OP() { return getToken(CParser.NE_OP, 0); }
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public NeqOpContext(Equality_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class RelExprContext extends Equality_expressionContext {
		public Relational_expressionContext expr;
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public RelExprContext(Equality_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Equality_expressionContext equality_expression() throws RecognitionException {
		return equality_expression(0);
	}

	private Equality_expressionContext equality_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Equality_expressionContext _localctx = new Equality_expressionContext(_ctx, _parentState);
		Equality_expressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_equality_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(188);
			((RelExprContext)_localctx).expr = relational_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new EqOpContext(new Equality_expressionContext(_parentctx, _parentState));
						((EqOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(190);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(191);
						((EqOpContext)_localctx).op = match(EQ_OP);
						setState(192);
						((EqOpContext)_localctx).right = relational_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new NeqOpContext(new Equality_expressionContext(_parentctx, _parentState));
						((NeqOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_equality_expression);
						setState(193);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(194);
						((NeqOpContext)_localctx).op = match(NE_OP);
						setState(195);
						((NeqOpContext)_localctx).right = relational_expression(0);
						}
						break;
					}
					} 
				}
				setState(200);
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

	public static class Relational_expressionContext extends ParserRuleContext {
		public Relational_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational_expression; }
	 
		public Relational_expressionContext() { }
		public void copyFrom(Relational_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GlOpContext extends Relational_expressionContext {
		public Relational_expressionContext left;
		public Token op;
		public Additive_expressionContext right;
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public TerminalNode GL_OP() { return getToken(CParser.GL_OP, 0); }
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public GlOpContext(Relational_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class LeOpContext extends Relational_expressionContext {
		public Relational_expressionContext left;
		public Token op;
		public Additive_expressionContext right;
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public TerminalNode LE_OP() { return getToken(CParser.LE_OP, 0); }
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public LeOpContext(Relational_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class AdditiveExprContext extends Relational_expressionContext {
		public Additive_expressionContext expr;
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public AdditiveExprContext(Relational_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class LtOpContext extends Relational_expressionContext {
		public Relational_expressionContext left;
		public Token op;
		public Additive_expressionContext right;
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public TerminalNode LT_OP() { return getToken(CParser.LT_OP, 0); }
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public LtOpContext(Relational_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class GeOpContext extends Relational_expressionContext {
		public Relational_expressionContext left;
		public Token op;
		public Additive_expressionContext right;
		public Relational_expressionContext relational_expression() {
			return getRuleContext(Relational_expressionContext.class,0);
		}
		public TerminalNode GE_OP() { return getToken(CParser.GE_OP, 0); }
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public GeOpContext(Relational_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Relational_expressionContext relational_expression() throws RecognitionException {
		return relational_expression(0);
	}

	private Relational_expressionContext relational_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Relational_expressionContext _localctx = new Relational_expressionContext(_ctx, _parentState);
		Relational_expressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_relational_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new AdditiveExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(202);
			((AdditiveExprContext)_localctx).expr = additive_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new LtOpContext(new Relational_expressionContext(_parentctx, _parentState));
						((LtOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(204);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(205);
						((LtOpContext)_localctx).op = match(LT_OP);
						setState(206);
						((LtOpContext)_localctx).right = additive_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new GlOpContext(new Relational_expressionContext(_parentctx, _parentState));
						((GlOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(207);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(208);
						((GlOpContext)_localctx).op = match(GL_OP);
						setState(209);
						((GlOpContext)_localctx).right = additive_expression(0);
						}
						break;
					case 3:
						{
						_localctx = new LeOpContext(new Relational_expressionContext(_parentctx, _parentState));
						((LeOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(210);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(211);
						((LeOpContext)_localctx).op = match(LE_OP);
						setState(212);
						((LeOpContext)_localctx).right = additive_expression(0);
						}
						break;
					case 4:
						{
						_localctx = new GeOpContext(new Relational_expressionContext(_parentctx, _parentState));
						((GeOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_relational_expression);
						setState(213);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(214);
						((GeOpContext)_localctx).op = match(GE_OP);
						setState(215);
						((GeOpContext)_localctx).right = additive_expression(0);
						}
						break;
					}
					} 
				}
				setState(220);
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

	public static class Additive_expressionContext extends ParserRuleContext {
		public Additive_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive_expression; }
	 
		public Additive_expressionContext() { }
		public void copyFrom(Additive_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddOpContext extends Additive_expressionContext {
		public Additive_expressionContext left;
		public Token op;
		public Multiplicative_expressionContext right;
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public TerminalNode ADD_OP() { return getToken(CParser.ADD_OP, 0); }
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public AddOpContext(Additive_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class SubOpContext extends Additive_expressionContext {
		public Additive_expressionContext left;
		public Token op;
		public Multiplicative_expressionContext right;
		public Additive_expressionContext additive_expression() {
			return getRuleContext(Additive_expressionContext.class,0);
		}
		public TerminalNode SUB_OP() { return getToken(CParser.SUB_OP, 0); }
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public SubOpContext(Additive_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicativeExprContext extends Additive_expressionContext {
		public Multiplicative_expressionContext expr;
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public MultiplicativeExprContext(Additive_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Additive_expressionContext additive_expression() throws RecognitionException {
		return additive_expression(0);
	}

	private Additive_expressionContext additive_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Additive_expressionContext _localctx = new Additive_expressionContext(_ctx, _parentState);
		Additive_expressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_additive_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MultiplicativeExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(222);
			((MultiplicativeExprContext)_localctx).expr = multiplicative_expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new AddOpContext(new Additive_expressionContext(_parentctx, _parentState));
						((AddOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(224);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(225);
						((AddOpContext)_localctx).op = match(ADD_OP);
						setState(226);
						((AddOpContext)_localctx).right = multiplicative_expression(0);
						}
						break;
					case 2:
						{
						_localctx = new SubOpContext(new Additive_expressionContext(_parentctx, _parentState));
						((SubOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_additive_expression);
						setState(227);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(228);
						((SubOpContext)_localctx).op = match(SUB_OP);
						setState(229);
						((SubOpContext)_localctx).right = multiplicative_expression(0);
						}
						break;
					}
					} 
				}
				setState(234);
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

	public static class Multiplicative_expressionContext extends ParserRuleContext {
		public Multiplicative_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative_expression; }
	 
		public Multiplicative_expressionContext() { }
		public void copyFrom(Multiplicative_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivOpContext extends Multiplicative_expressionContext {
		public Multiplicative_expressionContext left;
		public Token op;
		public Unary_expressionContext right;
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public TerminalNode DIV_OP() { return getToken(CParser.DIV_OP, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public DivOpContext(Multiplicative_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultOpContext extends Multiplicative_expressionContext {
		public Multiplicative_expressionContext left;
		public Token op;
		public Unary_expressionContext right;
		public Multiplicative_expressionContext multiplicative_expression() {
			return getRuleContext(Multiplicative_expressionContext.class,0);
		}
		public TerminalNode MUL_OP() { return getToken(CParser.MUL_OP, 0); }
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public MultOpContext(Multiplicative_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryExprContext extends Multiplicative_expressionContext {
		public Unary_expressionContext expr;
		public Unary_expressionContext unary_expression() {
			return getRuleContext(Unary_expressionContext.class,0);
		}
		public UnaryExprContext(Multiplicative_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Multiplicative_expressionContext multiplicative_expression() throws RecognitionException {
		return multiplicative_expression(0);
	}

	private Multiplicative_expressionContext multiplicative_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multiplicative_expressionContext _localctx = new Multiplicative_expressionContext(_ctx, _parentState);
		Multiplicative_expressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_multiplicative_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new UnaryExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(236);
			((UnaryExprContext)_localctx).expr = unary_expression();
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MultOpContext(new Multiplicative_expressionContext(_parentctx, _parentState));
						((MultOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(238);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(239);
						((MultOpContext)_localctx).op = match(MUL_OP);
						setState(240);
						((MultOpContext)_localctx).right = unary_expression();
						}
						break;
					case 2:
						{
						_localctx = new DivOpContext(new Multiplicative_expressionContext(_parentctx, _parentState));
						((DivOpContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicative_expression);
						setState(241);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(242);
						((DivOpContext)_localctx).op = match(DIV_OP);
						setState(243);
						((DivOpContext)_localctx).right = unary_expression();
						}
						break;
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Unary_expressionContext extends ParserRuleContext {
		public Unary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expression; }
	 
		public Unary_expressionContext() { }
		public void copyFrom(Unary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryOpContext extends Unary_expressionContext {
		public Unary_operatorContext op;
		public Postfix_expressionContext expr;
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public UnaryOpContext(Unary_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostfixExprContext extends Unary_expressionContext {
		public Postfix_expressionContext expr;
		public Postfix_expressionContext postfix_expression() {
			return getRuleContext(Postfix_expressionContext.class,0);
		}
		public PostfixExprContext(Unary_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Unary_expressionContext unary_expression() throws RecognitionException {
		Unary_expressionContext _localctx = new Unary_expressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unary_expression);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case IDENTIFIER:
			case INT_CONSTANT:
			case STRING_LITERAL:
				_localctx = new PostfixExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				((PostfixExprContext)_localctx).expr = postfix_expression();
				}
				break;
			case NOT_OP:
			case SUB_OP:
				_localctx = new UnaryOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				((UnaryOpContext)_localctx).op = unary_operator();
				setState(251);
				((UnaryOpContext)_localctx).expr = postfix_expression();
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

	public static class Postfix_expressionContext extends ParserRuleContext {
		public Postfix_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expression; }
	 
		public Postfix_expressionContext() { }
		public void copyFrom(Postfix_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionCallParamContext extends Postfix_expressionContext {
		public Token id;
		public Expression_listContext expr_l;
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public FunctionCallParamContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class PrimExprContext extends Postfix_expressionContext {
		public Primary_expressionContext expr;
		public Primary_expressionContext primary_expression() {
			return getRuleContext(Primary_expressionContext.class,0);
		}
		public PrimExprContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class FunctionCallContext extends Postfix_expressionContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public FunctionCallContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class IncrOpContext extends Postfix_expressionContext {
		public L_expressionContext left;
		public Token op;
		public L_expressionContext l_expression() {
			return getRuleContext(L_expressionContext.class,0);
		}
		public TerminalNode INC_OP() { return getToken(CParser.INC_OP, 0); }
		public IncrOpContext(Postfix_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Postfix_expressionContext postfix_expression() throws RecognitionException {
		Postfix_expressionContext _localctx = new Postfix_expressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_postfix_expression);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new PrimExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				((PrimExprContext)_localctx).expr = primary_expression();
				}
				break;
			case 2:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				((FunctionCallContext)_localctx).id = match(IDENTIFIER);
				setState(257);
				match(T__0);
				setState(258);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new FunctionCallParamContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				((FunctionCallParamContext)_localctx).id = match(IDENTIFIER);
				setState(260);
				match(T__0);
				setState(261);
				((FunctionCallParamContext)_localctx).expr_l = expression_list(0);
				setState(262);
				match(T__1);
				}
				break;
			case 4:
				_localctx = new IncrOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(264);
				((IncrOpContext)_localctx).left = l_expression(0);
				setState(265);
				((IncrOpContext)_localctx).op = match(INC_OP);
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

	public static class Primary_expressionContext extends ParserRuleContext {
		public Primary_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expression; }
	 
		public Primary_expressionContext() { }
		public void copyFrom(Primary_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringLitContext extends Primary_expressionContext {
		public Token val;
		public TerminalNode STRING_LITERAL() { return getToken(CParser.STRING_LITERAL, 0); }
		public StringLitContext(Primary_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesesContext extends Primary_expressionContext {
		public ExpressionContext expr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesesContext(Primary_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class LExprContext extends Primary_expressionContext {
		public L_expressionContext expr;
		public L_expressionContext l_expression() {
			return getRuleContext(L_expressionContext.class,0);
		}
		public LExprContext(Primary_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class IntConstContext extends Primary_expressionContext {
		public Token val;
		public TerminalNode INT_CONSTANT() { return getToken(CParser.INT_CONSTANT, 0); }
		public IntConstContext(Primary_expressionContext ctx) { copyFrom(ctx); }
	}

	public final Primary_expressionContext primary_expression() throws RecognitionException {
		Primary_expressionContext _localctx = new Primary_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primary_expression);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new LExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				((LExprContext)_localctx).expr = l_expression(0);
				}
				break;
			case INT_CONSTANT:
				_localctx = new IntConstContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				((IntConstContext)_localctx).val = match(INT_CONSTANT);
				}
				break;
			case STRING_LITERAL:
				_localctx = new StringLitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				((StringLitContext)_localctx).val = match(STRING_LITERAL);
				}
				break;
			case T__0:
				_localctx = new ParenthesesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				match(T__0);
				setState(273);
				((ParenthesesContext)_localctx).expr = expression(0);
				setState(274);
				match(T__1);
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

	public static class L_expressionContext extends ParserRuleContext {
		public L_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_expression; }
	 
		public L_expressionContext() { }
		public void copyFrom(L_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprBracketsContext extends L_expressionContext {
		public L_expressionContext left;
		public ExpressionContext right;
		public L_expressionContext l_expression() {
			return getRuleContext(L_expressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExprBracketsContext(L_expressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprIdContext extends L_expressionContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(CParser.IDENTIFIER, 0); }
		public ExprIdContext(L_expressionContext ctx) { copyFrom(ctx); }
	}

	public final L_expressionContext l_expression() throws RecognitionException {
		return l_expression(0);
	}

	private L_expressionContext l_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		L_expressionContext _localctx = new L_expressionContext(_ctx, _parentState);
		L_expressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_l_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprIdContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(279);
			((ExprIdContext)_localctx).id = match(IDENTIFIER);
			}
			_ctx.stop = _input.LT(-1);
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprBracketsContext(new L_expressionContext(_parentctx, _parentState));
					((ExprBracketsContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_l_expression);
					setState(281);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(282);
					match(T__3);
					setState(283);
					((ExprBracketsContext)_localctx).right = expression(0);
					setState(284);
					match(T__4);
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class Expression_listContext extends ParserRuleContext {
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
	 
		public Expression_listContext() { }
		public void copyFrom(Expression_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleExprContext extends Expression_listContext {
		public ExpressionContext expr;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleExprContext(Expression_listContext ctx) { copyFrom(ctx); }
	}
	public static class MultipleExprContext extends Expression_listContext {
		public Expression_listContext expr_l;
		public ExpressionContext expr;
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MultipleExprContext(Expression_listContext ctx) { copyFrom(ctx); }
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		return expression_list(0);
	}

	private Expression_listContext expression_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_listContext _localctx = new Expression_listContext(_ctx, _parentState);
		Expression_listContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expression_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(292);
			((SingleExprContext)_localctx).expr = expression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleExprContext(new Expression_listContext(_parentctx, _parentState));
					((MultipleExprContext)_localctx).expr_l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression_list);
					setState(294);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(295);
					match(T__2);
					setState(296);
					((MultipleExprContext)_localctx).expr = expression(0);
					}
					} 
				}
				setState(301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public Token op;
		public TerminalNode SUB_OP() { return getToken(CParser.SUB_OP, 0); }
		public TerminalNode NOT_OP() { return getToken(CParser.NOT_OP, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unary_operator);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB_OP:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				((Unary_operatorContext)_localctx).op = match(SUB_OP);
				}
				break;
			case NOT_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(303);
				((Unary_operatorContext)_localctx).op = match(NOT_OP);
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

	public static class Selection_statementContext extends ParserRuleContext {
		public Selection_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_statement; }
	 
		public Selection_statementContext() { }
		public void copyFrom(Selection_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatContext extends Selection_statementContext {
		public ExpressionContext condition;
		public StatementContext true_exec;
		public Else_statementContext false_exec;
		public TerminalNode IF() { return getToken(CParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public IfStatContext(Selection_statementContext ctx) { copyFrom(ctx); }
	}

	public final Selection_statementContext selection_statement() throws RecognitionException {
		Selection_statementContext _localctx = new Selection_statementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_selection_statement);
		try {
			_localctx = new IfStatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(IF);
			setState(307);
			match(T__0);
			setState(308);
			((IfStatContext)_localctx).condition = expression(0);
			setState(309);
			match(T__1);
			setState(310);
			((IfStatContext)_localctx).true_exec = statement();
			setState(312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(311);
				((IfStatContext)_localctx).false_exec = else_statement();
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

	public static class Else_statementContext extends ParserRuleContext {
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
	 
		public Else_statementContext() { }
		public void copyFrom(Else_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElseStatContext extends Else_statementContext {
		public StatementContext false_exec;
		public TerminalNode ELSE() { return getToken(CParser.ELSE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStatContext(Else_statementContext ctx) { copyFrom(ctx); }
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_else_statement);
		try {
			_localctx = new ElseStatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(ELSE);
			setState(315);
			((ElseStatContext)_localctx).false_exec = statement();
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

	public static class Iteration_statementContext extends ParserRuleContext {
		public Iteration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteration_statement; }
	 
		public Iteration_statementContext() { }
		public void copyFrom(Iteration_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatContext extends Iteration_statementContext {
		public ExpressionContext condition;
		public StatementContext true_exec;
		public TerminalNode WHILE() { return getToken(CParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatContext(Iteration_statementContext ctx) { copyFrom(ctx); }
	}

	public final Iteration_statementContext iteration_statement() throws RecognitionException {
		Iteration_statementContext _localctx = new Iteration_statementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_iteration_statement);
		try {
			_localctx = new WhileStatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(WHILE);
			setState(318);
			match(T__0);
			setState(319);
			((WhileStatContext)_localctx).condition = expression(0);
			setState(320);
			match(T__1);
			setState(321);
			((WhileStatContext)_localctx).true_exec = statement();
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

	public static class Declaration_listContext extends ParserRuleContext {
		public Declaration_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_list; }
	 
		public Declaration_listContext() { }
		public void copyFrom(Declaration_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleDeclContext extends Declaration_listContext {
		public DeclarationContext decl;
		public Declaration_listContext declaration_list() {
			return getRuleContext(Declaration_listContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public MultipleDeclContext(Declaration_listContext ctx) { copyFrom(ctx); }
	}
	public static class SingleDeclContext extends Declaration_listContext {
		public DeclarationContext decl;
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public SingleDeclContext(Declaration_listContext ctx) { copyFrom(ctx); }
	}

	public final Declaration_listContext declaration_list() throws RecognitionException {
		return declaration_list(0);
	}

	private Declaration_listContext declaration_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Declaration_listContext _localctx = new Declaration_listContext(_ctx, _parentState);
		Declaration_listContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_declaration_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleDeclContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(324);
			((SingleDeclContext)_localctx).decl = declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleDeclContext(new Declaration_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_declaration_list);
					setState(326);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(327);
					((MultipleDeclContext)_localctx).decl = declaration();
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
	public static class DeclContext extends DeclarationContext {
		public Type_specifierContext type;
		public Declarator_listContext decl_l;
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Declarator_listContext declarator_list() {
			return getRuleContext(Declarator_listContext.class,0);
		}
		public DeclContext(DeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class AssgnContext extends DeclarationContext {
		public Type_specifierContext type;
		public Assignment_statementContext assgn;
		public Type_specifierContext type_specifier() {
			return getRuleContext(Type_specifierContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public AssgnContext(DeclarationContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declaration);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new DeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				((DeclContext)_localctx).type = type_specifier();
				setState(334);
				((DeclContext)_localctx).decl_l = declarator_list(0);
				setState(335);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new AssgnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				((AssgnContext)_localctx).type = type_specifier();
				setState(338);
				((AssgnContext)_localctx).assgn = assignment_statement();
				setState(339);
				match(T__5);
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

	public static class Declarator_listContext extends ParserRuleContext {
		public Declarator_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator_list; }
	 
		public Declarator_listContext() { }
		public void copyFrom(Declarator_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleDeclaratorContext extends Declarator_listContext {
		public Declarator_listContext decl_l;
		public DeclaratorContext decl;
		public Declarator_listContext declarator_list() {
			return getRuleContext(Declarator_listContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public MultipleDeclaratorContext(Declarator_listContext ctx) { copyFrom(ctx); }
	}
	public static class SingleDeclaratorContext extends Declarator_listContext {
		public DeclaratorContext decl;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public SingleDeclaratorContext(Declarator_listContext ctx) { copyFrom(ctx); }
	}

	public final Declarator_listContext declarator_list() throws RecognitionException {
		return declarator_list(0);
	}

	private Declarator_listContext declarator_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Declarator_listContext _localctx = new Declarator_listContext(_ctx, _parentState);
		Declarator_listContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_declarator_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleDeclaratorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(344);
			((SingleDeclaratorContext)_localctx).decl = declarator(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleDeclaratorContext(new Declarator_listContext(_parentctx, _parentState));
					((MultipleDeclaratorContext)_localctx).decl_l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_declarator_list);
					setState(346);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(347);
					match(T__2);
					setState(348);
					((MultipleDeclaratorContext)_localctx).decl = declarator(0);
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		case 0:
			return translation_unit_sempred((Translation_unitContext)_localctx, predIndex);
		case 4:
			return parameter_list_sempred((Parameter_listContext)_localctx, predIndex);
		case 6:
			return declarator_sempred((DeclaratorContext)_localctx, predIndex);
		case 9:
			return statement_list_sempred((Statement_listContext)_localctx, predIndex);
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 13:
			return logical_and_expression_sempred((Logical_and_expressionContext)_localctx, predIndex);
		case 14:
			return equality_expression_sempred((Equality_expressionContext)_localctx, predIndex);
		case 15:
			return relational_expression_sempred((Relational_expressionContext)_localctx, predIndex);
		case 16:
			return additive_expression_sempred((Additive_expressionContext)_localctx, predIndex);
		case 17:
			return multiplicative_expression_sempred((Multiplicative_expressionContext)_localctx, predIndex);
		case 21:
			return l_expression_sempred((L_expressionContext)_localctx, predIndex);
		case 22:
			return expression_list_sempred((Expression_listContext)_localctx, predIndex);
		case 27:
			return declaration_list_sempred((Declaration_listContext)_localctx, predIndex);
		case 29:
			return declarator_list_sempred((Declarator_listContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean translation_unit_sempred(Translation_unitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameter_list_sempred(Parameter_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarator_sempred(DeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean statement_list_sempred(Statement_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logical_and_expression_sempred(Logical_and_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equality_expression_sempred(Equality_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relational_expression_sempred(Relational_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additive_expression_sempred(Additive_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplicative_expression_sempred(Multiplicative_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean l_expression_sempred(L_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_list_sempred(Expression_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declaration_list_sempred(Declaration_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarator_list_sempred(Declarator_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0165\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\5\2B\n\2\3\2\3\2\3\2\5\2G\n\2\7\2I\n\2\f\2\16\2L\13\2\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\5\4T\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5^\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6f\n\6\f\6\16\6i\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\bv\n\b\f\b\16\by\13\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0083\n\n\3\13\3\13\3\13\5\13\u0088\n\13\3\13\3\13\3\13\3\13\7\13\u008e"+
		"\n\13\f\13\16\13\u0091\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009b"+
		"\n\f\3\f\3\f\5\f\u009f\n\f\3\f\5\f\u00a2\n\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00ae\n\16\f\16\16\16\u00b1\13\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u00b9\n\17\f\17\16\17\u00bc\13\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00c7\n\20\f\20\16\20\u00ca\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\7\21\u00db\n\21\f\21\16\21\u00de\13\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\7\22\u00e9\n\22\f\22\16\22\u00ec\13\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00f7\n\23\f\23\16\23\u00fa"+
		"\13\23\3\24\3\24\3\24\3\24\5\24\u0100\n\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u010e\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0117\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\7\27\u0121\n\27\f\27\16\27\u0124\13\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u012c\n\30\f\30\16\30\u012f\13\30\3\31\3\31\5\31\u0133\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u013b\n\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\7\35\u014b\n\35\f\35\16\35\u014e"+
		"\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0158\n\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\7\37\u0160\n\37\f\37\16\37\u0163\13\37\3\37\2"+
		"\20\2\n\16\24\32\34\36 \"$,.8< \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<\2\2\2\u0172\2A\3\2\2\2\4M\3\2\2\2\6S\3\2\2\2"+
		"\b]\3\2\2\2\n_\3\2\2\2\fj\3\2\2\2\16m\3\2\2\2\20z\3\2\2\2\22\u0082\3\2"+
		"\2\2\24\u0087\3\2\2\2\26\u00a1\3\2\2\2\30\u00a3\3\2\2\2\32\u00a7\3\2\2"+
		"\2\34\u00b2\3\2\2\2\36\u00bd\3\2\2\2 \u00cb\3\2\2\2\"\u00df\3\2\2\2$\u00ed"+
		"\3\2\2\2&\u00ff\3\2\2\2(\u010d\3\2\2\2*\u0116\3\2\2\2,\u0118\3\2\2\2."+
		"\u0125\3\2\2\2\60\u0132\3\2\2\2\62\u0134\3\2\2\2\64\u013c\3\2\2\2\66\u013f"+
		"\3\2\2\28\u0145\3\2\2\2:\u0157\3\2\2\2<\u0159\3\2\2\2>?\b\2\1\2?B\5:\36"+
		"\2@B\5\4\3\2A>\3\2\2\2A@\3\2\2\2BJ\3\2\2\2CF\f\3\2\2DG\5:\36\2EG\5\4\3"+
		"\2FD\3\2\2\2FE\3\2\2\2GI\3\2\2\2HC\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2"+
		"\2K\3\3\2\2\2LJ\3\2\2\2MN\5\6\4\2NO\5\b\5\2OP\5\22\n\2P\5\3\2\2\2QT\7"+
		"\n\2\2RT\7\13\2\2SQ\3\2\2\2SR\3\2\2\2T\7\3\2\2\2UV\7\20\2\2VW\7\3\2\2"+
		"WX\5\n\6\2XY\7\4\2\2Y^\3\2\2\2Z[\7\20\2\2[\\\7\3\2\2\\^\7\4\2\2]U\3\2"+
		"\2\2]Z\3\2\2\2^\t\3\2\2\2_`\b\6\1\2`a\5\f\7\2ag\3\2\2\2bc\f\3\2\2cd\7"+
		"\5\2\2df\5\f\7\2eb\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\13\3\2\2\2i"+
		"g\3\2\2\2jk\5\6\4\2kl\5\16\b\2l\r\3\2\2\2mn\b\b\1\2no\7\20\2\2ow\3\2\2"+
		"\2pq\f\3\2\2qr\7\6\2\2rs\5\20\t\2st\7\7\2\2tv\3\2\2\2up\3\2\2\2vy\3\2"+
		"\2\2wu\3\2\2\2wx\3\2\2\2x\17\3\2\2\2yw\3\2\2\2z{\7\21\2\2{\21\3\2\2\2"+
		"|}\7\"\2\2}\u0083\7#\2\2~\177\7\"\2\2\177\u0080\5\24\13\2\u0080\u0081"+
		"\7#\2\2\u0081\u0083\3\2\2\2\u0082|\3\2\2\2\u0082~\3\2\2\2\u0083\23\3\2"+
		"\2\2\u0084\u0085\b\13\1\2\u0085\u0088\5\26\f\2\u0086\u0088\58\35\2\u0087"+
		"\u0084\3\2\2\2\u0087\u0086\3\2\2\2\u0088\u008f\3\2\2\2\u0089\u008a\f\4"+
		"\2\2\u008a\u008e\5\26\f\2\u008b\u008c\f\3\2\2\u008c\u008e\58\35\2\u008d"+
		"\u0089\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\25\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u00a2"+
		"\5\22\n\2\u0093\u00a2\5\62\32\2\u0094\u00a2\5\66\34\2\u0095\u0096\5\30"+
		"\r\2\u0096\u0097\7\b\2\2\u0097\u00a2\3\2\2\2\u0098\u009b\5,\27\2\u0099"+
		"\u009b\5\32\16\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2\2\2\u009b\u00a2\3"+
		"\2\2\2\u009c\u009e\7\f\2\2\u009d\u009f\5\32\16\2\u009e\u009d\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\7\b\2\2\u00a1\u0092\3\2"+
		"\2\2\u00a1\u0093\3\2\2\2\u00a1\u0094\3\2\2\2\u00a1\u0095\3\2\2\2\u00a1"+
		"\u009a\3\2\2\2\u00a1\u009c\3\2\2\2\u00a2\27\3\2\2\2\u00a3\u00a4\5,\27"+
		"\2\u00a4\u00a5\7\23\2\2\u00a5\u00a6\5\32\16\2\u00a6\31\3\2\2\2\u00a7\u00a8"+
		"\b\16\1\2\u00a8\u00a9\5\34\17\2\u00a9\u00af\3\2\2\2\u00aa\u00ab\f\3\2"+
		"\2\u00ab\u00ac\7 \2\2\u00ac\u00ae\5\34\17\2\u00ad\u00aa\3\2\2\2\u00ae"+
		"\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\33\3\2\2"+
		"\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\b\17\1\2\u00b3\u00b4\5\36\20\2\u00b4"+
		"\u00ba\3\2\2\2\u00b5\u00b6\f\3\2\2\u00b6\u00b7\7\37\2\2\u00b7\u00b9\5"+
		"\36\20\2\u00b8\u00b5\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\35\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\b\20\1"+
		"\2\u00be\u00bf\5 \21\2\u00bf\u00c8\3\2\2\2\u00c0\u00c1\f\4\2\2\u00c1\u00c2"+
		"\7\35\2\2\u00c2\u00c7\5 \21\2\u00c3\u00c4\f\3\2\2\u00c4\u00c5\7\36\2\2"+
		"\u00c5\u00c7\5 \21\2\u00c6\u00c0\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7\u00ca"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\37\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00cb\u00cc\b\21\1\2\u00cc\u00cd\5\"\22\2\u00cd\u00dc\3"+
		"\2\2\2\u00ce\u00cf\f\6\2\2\u00cf\u00d0\7\31\2\2\u00d0\u00db\5\"\22\2\u00d1"+
		"\u00d2\f\5\2\2\u00d2\u00d3\7\32\2\2\u00d3\u00db\5\"\22\2\u00d4\u00d5\f"+
		"\4\2\2\u00d5\u00d6\7\33\2\2\u00d6\u00db\5\"\22\2\u00d7\u00d8\f\3\2\2\u00d8"+
		"\u00d9\7\34\2\2\u00d9\u00db\5\"\22\2\u00da\u00ce\3\2\2\2\u00da\u00d1\3"+
		"\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d7\3\2\2\2\u00db\u00de\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd!\3\2\2\2\u00de\u00dc\3\2\2\2"+
		"\u00df\u00e0\b\22\1\2\u00e0\u00e1\5$\23\2\u00e1\u00ea\3\2\2\2\u00e2\u00e3"+
		"\f\4\2\2\u00e3\u00e4\7\25\2\2\u00e4\u00e9\5$\23\2\u00e5\u00e6\f\3\2\2"+
		"\u00e6\u00e7\7\26\2\2\u00e7\u00e9\5$\23\2\u00e8\u00e2\3\2\2\2\u00e8\u00e5"+
		"\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"#\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\b\23\1\2\u00ee\u00ef\5&\24\2"+
		"\u00ef\u00f8\3\2\2\2\u00f0\u00f1\f\4\2\2\u00f1\u00f2\7\27\2\2\u00f2\u00f7"+
		"\5&\24\2\u00f3\u00f4\f\3\2\2\u00f4\u00f5\7\30\2\2\u00f5\u00f7\5&\24\2"+
		"\u00f6\u00f0\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6"+
		"\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9%\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u0100\5(\25\2\u00fc\u00fd\5\60\31\2\u00fd\u00fe\5(\25\2\u00fe\u0100\3"+
		"\2\2\2\u00ff\u00fb\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100\'\3\2\2\2\u0101\u010e"+
		"\5*\26\2\u0102\u0103\7\20\2\2\u0103\u0104\7\3\2\2\u0104\u010e\7\4\2\2"+
		"\u0105\u0106\7\20\2\2\u0106\u0107\7\3\2\2\u0107\u0108\5.\30\2\u0108\u0109"+
		"\7\4\2\2\u0109\u010e\3\2\2\2\u010a\u010b\5,\27\2\u010b\u010c\7!\2\2\u010c"+
		"\u010e\3\2\2\2\u010d\u0101\3\2\2\2\u010d\u0102\3\2\2\2\u010d\u0105\3\2"+
		"\2\2\u010d\u010a\3\2\2\2\u010e)\3\2\2\2\u010f\u0117\5,\27\2\u0110\u0117"+
		"\7\21\2\2\u0111\u0117\7\22\2\2\u0112\u0113\7\3\2\2\u0113\u0114\5\32\16"+
		"\2\u0114\u0115\7\4\2\2\u0115\u0117\3\2\2\2\u0116\u010f\3\2\2\2\u0116\u0110"+
		"\3\2\2\2\u0116\u0111\3\2\2\2\u0116\u0112\3\2\2\2\u0117+\3\2\2\2\u0118"+
		"\u0119\b\27\1\2\u0119\u011a\7\20\2\2\u011a\u0122\3\2\2\2\u011b\u011c\f"+
		"\3\2\2\u011c\u011d\7\6\2\2\u011d\u011e\5\32\16\2\u011e\u011f\7\7\2\2\u011f"+
		"\u0121\3\2\2\2\u0120\u011b\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0123\3\2\2\2\u0123-\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0126"+
		"\b\30\1\2\u0126\u0127\5\32\16\2\u0127\u012d\3\2\2\2\u0128\u0129\f\3\2"+
		"\2\u0129\u012a\7\5\2\2\u012a\u012c\5\32\16\2\u012b\u0128\3\2\2\2\u012c"+
		"\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e/\3\2\2\2"+
		"\u012f\u012d\3\2\2\2\u0130\u0133\7\26\2\2\u0131\u0133\7\24\2\2\u0132\u0130"+
		"\3\2\2\2\u0132\u0131\3\2\2\2\u0133\61\3\2\2\2\u0134\u0135\7\r\2\2\u0135"+
		"\u0136\7\3\2\2\u0136\u0137\5\32\16\2\u0137\u0138\7\4\2\2\u0138\u013a\5"+
		"\26\f\2\u0139\u013b\5\64\33\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2"+
		"\u013b\63\3\2\2\2\u013c\u013d\7\16\2\2\u013d\u013e\5\26\f\2\u013e\65\3"+
		"\2\2\2\u013f\u0140\7\17\2\2\u0140\u0141\7\3\2\2\u0141\u0142\5\32\16\2"+
		"\u0142\u0143\7\4\2\2\u0143\u0144\5\26\f\2\u0144\67\3\2\2\2\u0145\u0146"+
		"\b\35\1\2\u0146\u0147\5:\36\2\u0147\u014c\3\2\2\2\u0148\u0149\f\3\2\2"+
		"\u0149\u014b\5:\36\2\u014a\u0148\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014c\u014d\3\2\2\2\u014d9\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0150\5\6\4\2\u0150\u0151\5<\37\2\u0151\u0152\7\b\2\2\u0152\u0158\3\2"+
		"\2\2\u0153\u0154\5\6\4\2\u0154\u0155\5\30\r\2\u0155\u0156\7\b\2\2\u0156"+
		"\u0158\3\2\2\2\u0157\u014f\3\2\2\2\u0157\u0153\3\2\2\2\u0158;\3\2\2\2"+
		"\u0159\u015a\b\37\1\2\u015a\u015b\5\16\b\2\u015b\u0161\3\2\2\2\u015c\u015d"+
		"\f\3\2\2\u015d\u015e\7\5\2\2\u015e\u0160\5\16\b\2\u015f\u015c\3\2\2\2"+
		"\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162=\3"+
		"\2\2\2\u0163\u0161\3\2\2\2$AFJS]gw\u0082\u0087\u008d\u008f\u009a\u009e"+
		"\u00a1\u00af\u00ba\u00c6\u00c8\u00da\u00dc\u00e8\u00ea\u00f6\u00f8\u00ff"+
		"\u010d\u0116\u0122\u012d\u0132\u013a\u014c\u0157\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}