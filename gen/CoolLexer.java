// Generated from /home/ahmed/IdeaProjects/Cool/src/Cool.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEGATE=1, WHILE=2, FALSE=3, AT=4, CASE=5, CLASS=6, COLON=7, COMMA=8, DIVIDE=9, 
		MUL=10, DOT=11, ELSE=12, STRING=13, EQUALS=14, ESAC=15, NEW=16, FI=17, 
		NOT=18, TRUE=19, OF=20, POOL=21, IF=22, IN=23, INHERITS=24, INTEGER=25, 
		ISVOID=26, LBRACE=27, LE=28, LET=29, LARROW=30, LOOP=31, LPAREN=32, LT=33, 
		MINUS=34, RARROW=35, RBRACE=36, RPAREN=37, SEMI=38, THEN=39, TILDE=40, 
		TIMES=41, ID=42, LETTER=43, DIGIT=44, UNDERSCORE=45, PLUS=46, WS=47, ERRORCHARACTER=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEGATE", "WHILE", "FALSE", "AT", "CASE", "CLASS", "COLON", "COMMA", 
			"DIVIDE", "MUL", "DOT", "ELSE", "STRING", "EQUALS", "ESAC", "NEW", "FI", 
			"NOT", "TRUE", "OF", "POOL", "IF", "IN", "INHERITS", "INTEGER", "ISVOID", 
			"LBRACE", "LE", "LET", "LARROW", "LOOP", "LPAREN", "LT", "MINUS", "RARROW", 
			"RBRACE", "RPAREN", "SEMI", "THEN", "TILDE", "TIMES", "ID", "LETTER", 
			"DIGIT", "UNDERSCORE", "PLUS", "WS", "ERRORCHARACTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'~'", null, null, "'@'", null, null, "':'", "','", "'/'", "'*'", 
			"'.'", null, null, "'='", null, null, null, null, null, null, null, null, 
			null, null, null, null, "'{'", "'<='", null, "'<-'", null, "'('", "'<'", 
			"'-'", "'=>'", "'}'", "')'", "';'", null, null, null, null, null, null, 
			"'_'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEGATE", "WHILE", "FALSE", "AT", "CASE", "CLASS", "COLON", "COMMA", 
			"DIVIDE", "MUL", "DOT", "ELSE", "STRING", "EQUALS", "ESAC", "NEW", "FI", 
			"NOT", "TRUE", "OF", "POOL", "IF", "IN", "INHERITS", "INTEGER", "ISVOID", 
			"LBRACE", "LE", "LET", "LARROW", "LOOP", "LPAREN", "LT", "MINUS", "RARROW", 
			"RBRACE", "RPAREN", "SEMI", "THEN", "TILDE", "TIMES", "ID", "LETTER", 
			"DIGIT", "UNDERSCORE", "PLUS", "WS", "ERRORCHARACTER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cool.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u011b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\7\16\u0090\n\16\f\16\16\16\u0093\13\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\6\32\u00c6\n\32\r\32\16\32\u00c7\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\5+\u0104\n"+
		"+\3+\3+\3+\7+\u0109\n+\f+\16+\u010c\13+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3"+
		"\60\3\60\3\60\3\61\3\61\2\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62\3\2\32\4\2YYyy\4\2JJjj\4\2KKkk\4\2NNnn\4\2GGgg\3\2hh\4\2CCcc\4\2"+
		"UUuu\4\2EEee\13\2\"#%\'--/\60\62<B\\^^``c|\4\2PPpp\4\2HHhh\4\2QQqq\4\2"+
		"VVvv\3\2vv\4\2TTtt\4\2WWww\4\2RRrr\4\2XXxx\4\2FFff\4\2OOoo\4\2C\\c|\3"+
		"\2\62;\5\2\13\f\17\17\"\"\2\u0120\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7k\3\2\2"+
		"\2\tq\3\2\2\2\13s\3\2\2\2\rx\3\2\2\2\17~\3\2\2\2\21\u0080\3\2\2\2\23\u0082"+
		"\3\2\2\2\25\u0084\3\2\2\2\27\u0086\3\2\2\2\31\u0088\3\2\2\2\33\u008d\3"+
		"\2\2\2\35\u0096\3\2\2\2\37\u0098\3\2\2\2!\u009d\3\2\2\2#\u00a1\3\2\2\2"+
		"%\u00a4\3\2\2\2\'\u00a8\3\2\2\2)\u00ad\3\2\2\2+\u00b0\3\2\2\2-\u00b5\3"+
		"\2\2\2/\u00b8\3\2\2\2\61\u00bb\3\2\2\2\63\u00c5\3\2\2\2\65\u00c9\3\2\2"+
		"\2\67\u00d0\3\2\2\29\u00d2\3\2\2\2;\u00d5\3\2\2\2=\u00d9\3\2\2\2?\u00dc"+
		"\3\2\2\2A\u00e1\3\2\2\2C\u00e3\3\2\2\2E\u00e5\3\2\2\2G\u00e7\3\2\2\2I"+
		"\u00ea\3\2\2\2K\u00ec\3\2\2\2M\u00ee\3\2\2\2O\u00f0\3\2\2\2Q\u00f5\3\2"+
		"\2\2S\u00fb\3\2\2\2U\u0103\3\2\2\2W\u010d\3\2\2\2Y\u010f\3\2\2\2[\u0111"+
		"\3\2\2\2]\u0113\3\2\2\2_\u0115\3\2\2\2a\u0119\3\2\2\2cd\7\u0080\2\2d\4"+
		"\3\2\2\2ef\t\2\2\2fg\t\3\2\2gh\t\4\2\2hi\t\5\2\2ij\t\6\2\2j\6\3\2\2\2"+
		"kl\t\7\2\2lm\t\b\2\2mn\t\5\2\2no\t\t\2\2op\t\6\2\2p\b\3\2\2\2qr\7B\2\2"+
		"r\n\3\2\2\2st\t\n\2\2tu\t\b\2\2uv\t\t\2\2vw\t\6\2\2w\f\3\2\2\2xy\t\n\2"+
		"\2yz\t\5\2\2z{\t\b\2\2{|\t\t\2\2|}\t\t\2\2}\16\3\2\2\2~\177\7<\2\2\177"+
		"\20\3\2\2\2\u0080\u0081\7.\2\2\u0081\22\3\2\2\2\u0082\u0083\7\61\2\2\u0083"+
		"\24\3\2\2\2\u0084\u0085\7,\2\2\u0085\26\3\2\2\2\u0086\u0087\7\60\2\2\u0087"+
		"\30\3\2\2\2\u0088\u0089\t\6\2\2\u0089\u008a\t\5\2\2\u008a\u008b\t\t\2"+
		"\2\u008b\u008c\t\6\2\2\u008c\32\3\2\2\2\u008d\u0091\7$\2\2\u008e\u0090"+
		"\t\13\2\2\u008f\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095"+
		"\7$\2\2\u0095\34\3\2\2\2\u0096\u0097\7?\2\2\u0097\36\3\2\2\2\u0098\u0099"+
		"\t\6\2\2\u0099\u009a\t\t\2\2\u009a\u009b\t\b\2\2\u009b\u009c\t\n\2\2\u009c"+
		" \3\2\2\2\u009d\u009e\t\f\2\2\u009e\u009f\t\6\2\2\u009f\u00a0\t\2\2\2"+
		"\u00a0\"\3\2\2\2\u00a1\u00a2\t\r\2\2\u00a2\u00a3\t\4\2\2\u00a3$\3\2\2"+
		"\2\u00a4\u00a5\t\f\2\2\u00a5\u00a6\t\16\2\2\u00a6\u00a7\t\17\2\2\u00a7"+
		"&\3\2\2\2\u00a8\u00a9\t\20\2\2\u00a9\u00aa\t\21\2\2\u00aa\u00ab\t\22\2"+
		"\2\u00ab\u00ac\t\6\2\2\u00ac(\3\2\2\2\u00ad\u00ae\t\16\2\2\u00ae\u00af"+
		"\t\r\2\2\u00af*\3\2\2\2\u00b0\u00b1\t\23\2\2\u00b1\u00b2\t\16\2\2\u00b2"+
		"\u00b3\t\16\2\2\u00b3\u00b4\t\5\2\2\u00b4,\3\2\2\2\u00b5\u00b6\t\4\2\2"+
		"\u00b6\u00b7\t\r\2\2\u00b7.\3\2\2\2\u00b8\u00b9\t\4\2\2\u00b9\u00ba\t"+
		"\f\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\t\4\2\2\u00bc\u00bd\t\f\2\2\u00bd"+
		"\u00be\t\3\2\2\u00be\u00bf\t\6\2\2\u00bf\u00c0\t\21\2\2\u00c0\u00c1\t"+
		"\4\2\2\u00c1\u00c2\t\17\2\2\u00c2\u00c3\t\t\2\2\u00c3\62\3\2\2\2\u00c4"+
		"\u00c6\5Y-\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2"+
		"\2\u00c7\u00c8\3\2\2\2\u00c8\64\3\2\2\2\u00c9\u00ca\t\4\2\2\u00ca\u00cb"+
		"\t\t\2\2\u00cb\u00cc\t\24\2\2\u00cc\u00cd\t\16\2\2\u00cd\u00ce\t\4\2\2"+
		"\u00ce\u00cf\t\25\2\2\u00cf\66\3\2\2\2\u00d0\u00d1\7}\2\2\u00d18\3\2\2"+
		"\2\u00d2\u00d3\7>\2\2\u00d3\u00d4\7?\2\2\u00d4:\3\2\2\2\u00d5\u00d6\t"+
		"\5\2\2\u00d6\u00d7\t\6\2\2\u00d7\u00d8\t\17\2\2\u00d8<\3\2\2\2\u00d9\u00da"+
		"\7>\2\2\u00da\u00db\7/\2\2\u00db>\3\2\2\2\u00dc\u00dd\t\5\2\2\u00dd\u00de"+
		"\t\16\2\2\u00de\u00df\t\16\2\2\u00df\u00e0\t\23\2\2\u00e0@\3\2\2\2\u00e1"+
		"\u00e2\7*\2\2\u00e2B\3\2\2\2\u00e3\u00e4\7>\2\2\u00e4D\3\2\2\2\u00e5\u00e6"+
		"\7/\2\2\u00e6F\3\2\2\2\u00e7\u00e8\7?\2\2\u00e8\u00e9\7@\2\2\u00e9H\3"+
		"\2\2\2\u00ea\u00eb\7\177\2\2\u00ebJ\3\2\2\2\u00ec\u00ed\7+\2\2\u00edL"+
		"\3\2\2\2\u00ee\u00ef\7=\2\2\u00efN\3\2\2\2\u00f0\u00f1\t\17\2\2\u00f1"+
		"\u00f2\t\3\2\2\u00f2\u00f3\t\6\2\2\u00f3\u00f4\t\f\2\2\u00f4P\3\2\2\2"+
		"\u00f5\u00f6\t\17\2\2\u00f6\u00f7\t\4\2\2\u00f7\u00f8\t\5\2\2\u00f8\u00f9"+
		"\t\25\2\2\u00f9\u00fa\t\6\2\2\u00faR\3\2\2\2\u00fb\u00fc\t\17\2\2\u00fc"+
		"\u00fd\t\4\2\2\u00fd\u00fe\t\26\2\2\u00fe\u00ff\t\6\2\2\u00ff\u0100\t"+
		"\t\2\2\u0100T\3\2\2\2\u0101\u0104\5[.\2\u0102\u0104\5W,\2\u0103\u0101"+
		"\3\2\2\2\u0103\u0102\3\2\2\2\u0104\u010a\3\2\2\2\u0105\u0109\5[.\2\u0106"+
		"\u0109\5W,\2\u0107\u0109\5Y-\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2\2\2"+
		"\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b"+
		"\3\2\2\2\u010bV\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\t\27\2\2\u010e"+
		"X\3\2\2\2\u010f\u0110\t\30\2\2\u0110Z\3\2\2\2\u0111\u0112\7a\2\2\u0112"+
		"\\\3\2\2\2\u0113\u0114\7-\2\2\u0114^\3\2\2\2\u0115\u0116\t\31\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\b\60\2\2\u0118`\3\2\2\2\u0119\u011a\13\2\2"+
		"\2\u011ab\3\2\2\2\t\2\u008f\u0091\u00c7\u0103\u0108\u010a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}