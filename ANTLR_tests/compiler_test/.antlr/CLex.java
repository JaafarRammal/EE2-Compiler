// Generated from /Users/jaafarrammal/Desktop/EE2-Compiler/ANTLR_tests/compiler_test/CLex.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACES=1, VOID=2, INT=3, RETURN=4, IF=5, ELSE=6, WHILE=7, IDENTIFIER=8, 
		INT_CONSTANT=9, STRING_LITERAL=10, ASS_OP=11, NOT_OP=12, ADD_OP=13, SUB_OP=14, 
		MUL_OP=15, DIV_OP=16, LT_OP=17, GL_OP=18, LE_OP=19, GE_OP=20, EQ_OP=21, 
		NE_OP=22, AND_OP=23, OR_OP=24, INC_OP=25, OP_CR=26, CL_CR=27, OTHERS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WHITESPACES", "VOID", "INT", "RETURN", "IF", "ELSE", "WHILE", "IDENTIFIER", 
		"INT_CONSTANT", "STRING_LITERAL", "ASS_OP", "NOT_OP", "ADD_OP", "SUB_OP", 
		"MUL_OP", "DIV_OP", "LT_OP", "GL_OP", "LE_OP", "GE_OP", "EQ_OP", "NE_OP", 
		"AND_OP", "OR_OP", "INC_OP", "OP_CR", "CL_CR", "OTHERS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'void'", "'int'", "'return'", "'if'", "'else'", "'while'", 
		null, null, "'\"(\\.|[^\"\\])*\"'", "'='", "'!'", "'+'", "'-'", "'*'", 
		"'/'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'++'", 
		"'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACES", "VOID", "INT", "RETURN", "IF", "ELSE", "WHILE", "IDENTIFIER", 
		"INT_CONSTANT", "STRING_LITERAL", "ASS_OP", "NOT_OP", "ADD_OP", "SUB_OP", 
		"MUL_OP", "DIV_OP", "LT_OP", "GL_OP", "LE_OP", "GE_OP", "EQ_OP", "NE_OP", 
		"AND_OP", "OR_OP", "INC_OP", "OP_CR", "CL_CR", "OTHERS"
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


	public CLex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CLex.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00bd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\7\t`\n\t\f\t\16\tc"+
		"\13\t\3\n\3\n\7\ng\n\n\f\n\16\nj\13\n\3\n\3\n\3\n\7\no\n\n\f\n\16\nr\13"+
		"\n\3\n\3\n\3\n\7\nw\n\n\f\n\16\nz\13\n\3\n\3\n\7\n~\n\n\f\n\16\n\u0081"+
		"\13\n\5\n\u0083\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36\3\2\r\5\2\13\f\17\17\"\"\5\2C\\aac|\6\2\62;C\\"+
		"aac|\3\2\63;\3\2\62;\4\2DDdd\3\2\62\63\4\2ZZzz\5\2\62;CHch\3\2\629\7\2"+
		"*+..==]]__\2\u00c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\3;\3\2\2\2\5?\3\2\2\2\7D\3\2\2\2\tH\3\2\2\2\13O\3\2\2\2\r"+
		"R\3\2\2\2\17W\3\2\2\2\21]\3\2\2\2\23\u0082\3\2\2\2\25\u0084\3\2\2\2\27"+
		"\u0092\3\2\2\2\31\u0094\3\2\2\2\33\u0096\3\2\2\2\35\u0098\3\2\2\2\37\u009a"+
		"\3\2\2\2!\u009c\3\2\2\2#\u009e\3\2\2\2%\u00a0\3\2\2\2\'\u00a2\3\2\2\2"+
		")\u00a5\3\2\2\2+\u00a8\3\2\2\2-\u00ab\3\2\2\2/\u00ae\3\2\2\2\61\u00b1"+
		"\3\2\2\2\63\u00b4\3\2\2\2\65\u00b7\3\2\2\2\67\u00b9\3\2\2\29\u00bb\3\2"+
		"\2\2;<\t\2\2\2<=\3\2\2\2=>\b\2\2\2>\4\3\2\2\2?@\7x\2\2@A\7q\2\2AB\7k\2"+
		"\2BC\7f\2\2C\6\3\2\2\2DE\7k\2\2EF\7p\2\2FG\7v\2\2G\b\3\2\2\2HI\7t\2\2"+
		"IJ\7g\2\2JK\7v\2\2KL\7w\2\2LM\7t\2\2MN\7p\2\2N\n\3\2\2\2OP\7k\2\2PQ\7"+
		"h\2\2Q\f\3\2\2\2RS\7g\2\2ST\7n\2\2TU\7u\2\2UV\7g\2\2V\16\3\2\2\2WX\7y"+
		"\2\2XY\7j\2\2YZ\7k\2\2Z[\7n\2\2[\\\7g\2\2\\\20\3\2\2\2]a\t\3\2\2^`\t\4"+
		"\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\22\3\2\2\2ca\3\2\2\2dh\t"+
		"\5\2\2eg\t\6\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\u0083\3\2\2"+
		"\2jh\3\2\2\2kl\7\62\2\2lp\t\7\2\2mo\t\b\2\2nm\3\2\2\2or\3\2\2\2pn\3\2"+
		"\2\2pq\3\2\2\2q\u0083\3\2\2\2rp\3\2\2\2st\7\62\2\2tx\t\t\2\2uw\t\n\2\2"+
		"vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\u0083\3\2\2\2zx\3\2\2\2{\177"+
		"\7\62\2\2|~\t\13\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0082d\3\2\2\2\u0082k\3\2"+
		"\2\2\u0082s\3\2\2\2\u0082{\3\2\2\2\u0083\24\3\2\2\2\u0084\u0085\7$\2\2"+
		"\u0085\u0086\7*\2\2\u0086\u0087\7^\2\2\u0087\u0088\7\60\2\2\u0088\u0089"+
		"\7~\2\2\u0089\u008a\7]\2\2\u008a\u008b\7`\2\2\u008b\u008c\7$\2\2\u008c"+
		"\u008d\7^\2\2\u008d\u008e\7_\2\2\u008e\u008f\7+\2\2\u008f\u0090\7,\2\2"+
		"\u0090\u0091\7$\2\2\u0091\26\3\2\2\2\u0092\u0093\7?\2\2\u0093\30\3\2\2"+
		"\2\u0094\u0095\7#\2\2\u0095\32\3\2\2\2\u0096\u0097\7-\2\2\u0097\34\3\2"+
		"\2\2\u0098\u0099\7/\2\2\u0099\36\3\2\2\2\u009a\u009b\7,\2\2\u009b \3\2"+
		"\2\2\u009c\u009d\7\61\2\2\u009d\"\3\2\2\2\u009e\u009f\7>\2\2\u009f$\3"+
		"\2\2\2\u00a0\u00a1\7@\2\2\u00a1&\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3\u00a4"+
		"\7?\2\2\u00a4(\3\2\2\2\u00a5\u00a6\7@\2\2\u00a6\u00a7\7?\2\2\u00a7*\3"+
		"\2\2\2\u00a8\u00a9\7?\2\2\u00a9\u00aa\7?\2\2\u00aa,\3\2\2\2\u00ab\u00ac"+
		"\7#\2\2\u00ac\u00ad\7?\2\2\u00ad.\3\2\2\2\u00ae\u00af\7(\2\2\u00af\u00b0"+
		"\7(\2\2\u00b0\60\3\2\2\2\u00b1\u00b2\7~\2\2\u00b2\u00b3\7~\2\2\u00b3\62"+
		"\3\2\2\2\u00b4\u00b5\7-\2\2\u00b5\u00b6\7-\2\2\u00b6\64\3\2\2\2\u00b7"+
		"\u00b8\7}\2\2\u00b8\66\3\2\2\2\u00b9\u00ba\7\177\2\2\u00ba8\3\2\2\2\u00bb"+
		"\u00bc\t\f\2\2\u00bc:\3\2\2\2\t\2ahpx\177\u0082\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}