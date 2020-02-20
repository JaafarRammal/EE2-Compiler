// Generated from /Users/raphaelbijaoui/OneDrive - Imperial College London/Imperial/EIEY2/Language Processors/EE2-Compiler/c_translator/C.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "WHITESPACES", "VOID", 
		"INT", "RETURN", "IF", "ELSE", "WHILE", "IDENTIFIER", "INT_CONSTANT", 
		"STRING_LITERAL", "ASS_OP", "NOT_OP", "ADD_OP", "SUB_OP", "MUL_OP", "DIV_OP", 
		"LT_OP", "GL_OP", "LE_OP", "GE_OP", "EQ_OP", "NE_OP", "AND_OP", "OR_OP", 
		"INC_OP", "OP_CR", "CL_CR", "OTHERS"
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


	public CLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "C.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u00d5\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\7\17x\n\17\f\17\16\17{\13\17\3\20\3\20\7\20\177\n\20\f"+
		"\20\16\20\u0082\13\20\3\20\3\20\3\20\7\20\u0087\n\20\f\20\16\20\u008a"+
		"\13\20\3\20\3\20\3\20\7\20\u008f\n\20\f\20\16\20\u0092\13\20\3\20\3\20"+
		"\7\20\u0096\n\20\f\20\16\20\u0099\13\20\5\20\u009b\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\2\2$\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$\3\2\r\5\2"+
		"\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\aac|\3\2\63;\3\2\62;\4\2DDdd\3\2"+
		"\62\63\4\2ZZzz\5\2\62;CHch\3\2\629\7\2*+..==]]__\2\u00dc\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2\2\5I\3\2\2\2\7"+
		"K\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2\17S\3\2\2\2\21W\3\2\2\2\23"+
		"\\\3\2\2\2\25`\3\2\2\2\27g\3\2\2\2\31j\3\2\2\2\33o\3\2\2\2\35u\3\2\2\2"+
		"\37\u009a\3\2\2\2!\u009c\3\2\2\2#\u00aa\3\2\2\2%\u00ac\3\2\2\2\'\u00ae"+
		"\3\2\2\2)\u00b0\3\2\2\2+\u00b2\3\2\2\2-\u00b4\3\2\2\2/\u00b6\3\2\2\2\61"+
		"\u00b8\3\2\2\2\63\u00ba\3\2\2\2\65\u00bd\3\2\2\2\67\u00c0\3\2\2\29\u00c3"+
		"\3\2\2\2;\u00c6\3\2\2\2=\u00c9\3\2\2\2?\u00cc\3\2\2\2A\u00cf\3\2\2\2C"+
		"\u00d1\3\2\2\2E\u00d3\3\2\2\2GH\7*\2\2H\4\3\2\2\2IJ\7+\2\2J\6\3\2\2\2"+
		"KL\7.\2\2L\b\3\2\2\2MN\7]\2\2N\n\3\2\2\2OP\7_\2\2P\f\3\2\2\2QR\7=\2\2"+
		"R\16\3\2\2\2ST\t\2\2\2TU\3\2\2\2UV\b\b\2\2V\20\3\2\2\2WX\7x\2\2XY\7q\2"+
		"\2YZ\7k\2\2Z[\7f\2\2[\22\3\2\2\2\\]\7k\2\2]^\7p\2\2^_\7v\2\2_\24\3\2\2"+
		"\2`a\7t\2\2ab\7g\2\2bc\7v\2\2cd\7w\2\2de\7t\2\2ef\7p\2\2f\26\3\2\2\2g"+
		"h\7k\2\2hi\7h\2\2i\30\3\2\2\2jk\7g\2\2kl\7n\2\2lm\7u\2\2mn\7g\2\2n\32"+
		"\3\2\2\2op\7y\2\2pq\7j\2\2qr\7k\2\2rs\7n\2\2st\7g\2\2t\34\3\2\2\2uy\t"+
		"\3\2\2vx\t\4\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\36\3\2\2\2{"+
		"y\3\2\2\2|\u0080\t\5\2\2}\177\t\6\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u009b\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0083\u0084\7\62\2\2\u0084\u0088\t\7\2\2\u0085\u0087\t\b\2\2\u0086\u0085"+
		"\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u009b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\62\2\2\u008c\u0090\t"+
		"\t\2\2\u008d\u008f\t\n\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u009b\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0093\u0097\7\62\2\2\u0094\u0096\t\13\2\2\u0095\u0094\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2"+
		"\2\2\u0099\u0097\3\2\2\2\u009a|\3\2\2\2\u009a\u0083\3\2\2\2\u009a\u008b"+
		"\3\2\2\2\u009a\u0093\3\2\2\2\u009b \3\2\2\2\u009c\u009d\7$\2\2\u009d\u009e"+
		"\7*\2\2\u009e\u009f\7^\2\2\u009f\u00a0\7\60\2\2\u00a0\u00a1\7~\2\2\u00a1"+
		"\u00a2\7]\2\2\u00a2\u00a3\7`\2\2\u00a3\u00a4\7$\2\2\u00a4\u00a5\7^\2\2"+
		"\u00a5\u00a6\7_\2\2\u00a6\u00a7\7+\2\2\u00a7\u00a8\7,\2\2\u00a8\u00a9"+
		"\7$\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab$\3\2\2\2\u00ac\u00ad"+
		"\7#\2\2\u00ad&\3\2\2\2\u00ae\u00af\7-\2\2\u00af(\3\2\2\2\u00b0\u00b1\7"+
		"/\2\2\u00b1*\3\2\2\2\u00b2\u00b3\7,\2\2\u00b3,\3\2\2\2\u00b4\u00b5\7\61"+
		"\2\2\u00b5.\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7\60\3\2\2\2\u00b8\u00b9\7"+
		"@\2\2\u00b9\62\3\2\2\2\u00ba\u00bb\7>\2\2\u00bb\u00bc\7?\2\2\u00bc\64"+
		"\3\2\2\2\u00bd\u00be\7@\2\2\u00be\u00bf\7?\2\2\u00bf\66\3\2\2\2\u00c0"+
		"\u00c1\7?\2\2\u00c1\u00c2\7?\2\2\u00c28\3\2\2\2\u00c3\u00c4\7#\2\2\u00c4"+
		"\u00c5\7?\2\2\u00c5:\3\2\2\2\u00c6\u00c7\7(\2\2\u00c7\u00c8\7(\2\2\u00c8"+
		"<\3\2\2\2\u00c9\u00ca\7~\2\2\u00ca\u00cb\7~\2\2\u00cb>\3\2\2\2\u00cc\u00cd"+
		"\7-\2\2\u00cd\u00ce\7-\2\2\u00ce@\3\2\2\2\u00cf\u00d0\7}\2\2\u00d0B\3"+
		"\2\2\2\u00d1\u00d2\7\177\2\2\u00d2D\3\2\2\2\u00d3\u00d4\t\f\2\2\u00d4"+
		"F\3\2\2\2\t\2y\u0080\u0088\u0090\u0097\u009a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}