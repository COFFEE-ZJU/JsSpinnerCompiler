// Generated from JaqlSample.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JaqlSampleLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__48=1, T__47=2, T__46=3, T__45=4, T__44=5, T__43=6, T__42=7, T__41=8, 
		T__40=9, T__39=10, T__38=11, T__37=12, T__36=13, T__35=14, T__34=15, T__33=16, 
		T__32=17, T__31=18, T__30=19, T__29=20, T__28=21, T__27=22, T__26=23, 
		T__25=24, T__24=25, T__23=26, T__22=27, T__21=28, T__20=29, T__19=30, 
		T__18=31, T__17=32, T__16=33, T__15=34, T__14=35, T__13=36, T__12=37, 
		T__11=38, T__10=39, T__9=40, T__8=41, T__7=42, T__6=43, T__5=44, T__4=45, 
		T__3=46, T__2=47, T__1=48, T__0=49, ID=50, INT=51, NEWLINE=52, WS=53;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'into'", "'min'", "'or'", "'['", "'<'", "'!='", "'<='", "'range'", "'by'", 
		"'readFromWrapper'", "'}'", "'\"'", "'max'", "'->'", "')'", "'seconds'", 
		"'hours'", "'group'", "'='", "'dstream'", "'transform'", "'rstream'", 
		"'rows'", "'filter'", "'window'", "'join'", "']'", "'each'", "'in'", "','", 
		"':'", "'('", "'as'", "'sum'", "'[*].'", "'{'", "'and'", "'partitioned by'", 
		"'unbounded'", "'$'", "'avg'", "'.'", "'minutes'", "'istream'", "';'", 
		"'>'", "'where'", "'=='", "'>='", "ID", "INT", "NEWLINE", "WS"
	};
	public static final String[] ruleNames = {
		"T__48", "T__47", "T__46", "T__45", "T__44", "T__43", "T__42", "T__41", 
		"T__40", "T__39", "T__38", "T__37", "T__36", "T__35", "T__34", "T__33", 
		"T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", 
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"ID", "INT", "NEWLINE", "WS"
	};


	public JaqlSampleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JaqlSample.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 52: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\2\4\67\u016c\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3$\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*\3*\3*\3"+
		"+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\7\63"+
		"\u0157\n\63\f\63\16\63\u015a\13\63\3\64\6\64\u015d\n\64\r\64\16\64\u015e"+
		"\3\65\5\65\u0162\n\65\3\65\3\65\3\66\6\66\u0167\n\66\r\66\16\66\u0168"+
		"\3\66\3\66\2\67\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1"+
		"\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1"+
		";\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1["+
		"/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\2\3\2\5\4C\\c|\5\62"+
		";C\\c|\5\13\f\17\17\"\"\u016f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\3m\3\2\2\2\5r\3\2\2\2\7v\3\2\2\2\ty\3\2\2\2\13{\3"+
		"\2\2\2\r}\3\2\2\2\17\u0080\3\2\2\2\21\u0083\3\2\2\2\23\u0089\3\2\2\2\25"+
		"\u008c\3\2\2\2\27\u009c\3\2\2\2\31\u009e\3\2\2\2\33\u00a0\3\2\2\2\35\u00a4"+
		"\3\2\2\2\37\u00a7\3\2\2\2!\u00a9\3\2\2\2#\u00b1\3\2\2\2%\u00b7\3\2\2\2"+
		"\'\u00bd\3\2\2\2)\u00bf\3\2\2\2+\u00c7\3\2\2\2-\u00d1\3\2\2\2/\u00d9\3"+
		"\2\2\2\61\u00de\3\2\2\2\63\u00e5\3\2\2\2\65\u00ec\3\2\2\2\67\u00f1\3\2"+
		"\2\29\u00f3\3\2\2\2;\u00f8\3\2\2\2=\u00fb\3\2\2\2?\u00fd\3\2\2\2A\u00ff"+
		"\3\2\2\2C\u0101\3\2\2\2E\u0104\3\2\2\2G\u0108\3\2\2\2I\u010d\3\2\2\2K"+
		"\u010f\3\2\2\2M\u0113\3\2\2\2O\u0122\3\2\2\2Q\u012c\3\2\2\2S\u012e\3\2"+
		"\2\2U\u0132\3\2\2\2W\u0134\3\2\2\2Y\u013c\3\2\2\2[\u0144\3\2\2\2]\u0146"+
		"\3\2\2\2_\u0148\3\2\2\2a\u014e\3\2\2\2c\u0151\3\2\2\2e\u0154\3\2\2\2g"+
		"\u015c\3\2\2\2i\u0161\3\2\2\2k\u0166\3\2\2\2mn\7k\2\2no\7p\2\2op\7v\2"+
		"\2pq\7q\2\2q\4\3\2\2\2rs\7o\2\2st\7k\2\2tu\7p\2\2u\6\3\2\2\2vw\7q\2\2"+
		"wx\7t\2\2x\b\3\2\2\2yz\7]\2\2z\n\3\2\2\2{|\7>\2\2|\f\3\2\2\2}~\7#\2\2"+
		"~\177\7?\2\2\177\16\3\2\2\2\u0080\u0081\7>\2\2\u0081\u0082\7?\2\2\u0082"+
		"\20\3\2\2\2\u0083\u0084\7t\2\2\u0084\u0085\7c\2\2\u0085\u0086\7p\2\2\u0086"+
		"\u0087\7i\2\2\u0087\u0088\7g\2\2\u0088\22\3\2\2\2\u0089\u008a\7d\2\2\u008a"+
		"\u008b\7{\2\2\u008b\24\3\2\2\2\u008c\u008d\7t\2\2\u008d\u008e\7g\2\2\u008e"+
		"\u008f\7c\2\2\u008f\u0090\7f\2\2\u0090\u0091\7H\2\2\u0091\u0092\7t\2\2"+
		"\u0092\u0093\7q\2\2\u0093\u0094\7o\2\2\u0094\u0095\7Y\2\2\u0095\u0096"+
		"\7t\2\2\u0096\u0097\7c\2\2\u0097\u0098\7r\2\2\u0098\u0099\7r\2\2\u0099"+
		"\u009a\7g\2\2\u009a\u009b\7t\2\2\u009b\26\3\2\2\2\u009c\u009d\7\177\2"+
		"\2\u009d\30\3\2\2\2\u009e\u009f\7$\2\2\u009f\32\3\2\2\2\u00a0\u00a1\7"+
		"o\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7z\2\2\u00a3\34\3\2\2\2\u00a4\u00a5"+
		"\7/\2\2\u00a5\u00a6\7@\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7+\2\2\u00a8 "+
		"\3\2\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7e\2\2\u00ac"+
		"\u00ad\7q\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7u\2\2"+
		"\u00b0\"\3\2\2\2\u00b1\u00b2\7j\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7w"+
		"\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7u\2\2\u00b6$\3\2\2\2\u00b7\u00b8"+
		"\7i\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7w\2\2\u00bb"+
		"\u00bc\7r\2\2\u00bc&\3\2\2\2\u00bd\u00be\7?\2\2\u00be(\3\2\2\2\u00bf\u00c0"+
		"\7f\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7t\2\2\u00c3"+
		"\u00c4\7g\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7o\2\2\u00c6*\3\2\2\2\u00c7"+
		"\u00c8\7v\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7p\2\2"+
		"\u00cb\u00cc\7u\2\2\u00cc\u00cd\7h\2\2\u00cd\u00ce\7q\2\2\u00ce\u00cf"+
		"\7t\2\2\u00cf\u00d0\7o\2\2\u00d0,\3\2\2\2\u00d1\u00d2\7t\2\2\u00d2\u00d3"+
		"\7u\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7t\2\2\u00d5\u00d6\7g\2\2\u00d6"+
		"\u00d7\7c\2\2\u00d7\u00d8\7o\2\2\u00d8.\3\2\2\2\u00d9\u00da\7t\2\2\u00da"+
		"\u00db\7q\2\2\u00db\u00dc\7y\2\2\u00dc\u00dd\7u\2\2\u00dd\60\3\2\2\2\u00de"+
		"\u00df\7h\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7v\2\2"+
		"\u00e2\u00e3\7g\2\2\u00e3\u00e4\7t\2\2\u00e4\62\3\2\2\2\u00e5\u00e6\7"+
		"y\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea"+
		"\7q\2\2\u00ea\u00eb\7y\2\2\u00eb\64\3\2\2\2\u00ec\u00ed\7l\2\2\u00ed\u00ee"+
		"\7q\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0\7p\2\2\u00f0\66\3\2\2\2\u00f1\u00f2"+
		"\7_\2\2\u00f28\3\2\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6"+
		"\7e\2\2\u00f6\u00f7\7j\2\2\u00f7:\3\2\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa"+
		"\7p\2\2\u00fa<\3\2\2\2\u00fb\u00fc\7.\2\2\u00fc>\3\2\2\2\u00fd\u00fe\7"+
		"<\2\2\u00fe@\3\2\2\2\u00ff\u0100\7*\2\2\u0100B\3\2\2\2\u0101\u0102\7c"+
		"\2\2\u0102\u0103\7u\2\2\u0103D\3\2\2\2\u0104\u0105\7u\2\2\u0105\u0106"+
		"\7w\2\2\u0106\u0107\7o\2\2\u0107F\3\2\2\2\u0108\u0109\7]\2\2\u0109\u010a"+
		"\7,\2\2\u010a\u010b\7_\2\2\u010b\u010c\7\60\2\2\u010cH\3\2\2\2\u010d\u010e"+
		"\7}\2\2\u010eJ\3\2\2\2\u010f\u0110\7c\2\2\u0110\u0111\7p\2\2\u0111\u0112"+
		"\7f\2\2\u0112L\3\2\2\2\u0113\u0114\7r\2\2\u0114\u0115\7c\2\2\u0115\u0116"+
		"\7t\2\2\u0116\u0117\7v\2\2\u0117\u0118\7k\2\2\u0118\u0119\7v\2\2\u0119"+
		"\u011a\7k\2\2\u011a\u011b\7q\2\2\u011b\u011c\7p\2\2\u011c\u011d\7g\2\2"+
		"\u011d\u011e\7f\2\2\u011e\u011f\7\"\2\2\u011f\u0120\7d\2\2\u0120\u0121"+
		"\7{\2\2\u0121N\3\2\2\2\u0122\u0123\7w\2\2\u0123\u0124\7p\2\2\u0124\u0125"+
		"\7d\2\2\u0125\u0126\7q\2\2\u0126\u0127\7w\2\2\u0127\u0128\7p\2\2\u0128"+
		"\u0129\7f\2\2\u0129\u012a\7g\2\2\u012a\u012b\7f\2\2\u012bP\3\2\2\2\u012c"+
		"\u012d\7&\2\2\u012dR\3\2\2\2\u012e\u012f\7c\2\2\u012f\u0130\7x\2\2\u0130"+
		"\u0131\7i\2\2\u0131T\3\2\2\2\u0132\u0133\7\60\2\2\u0133V\3\2\2\2\u0134"+
		"\u0135\7o\2\2\u0135\u0136\7k\2\2\u0136\u0137\7p\2\2\u0137\u0138\7w\2\2"+
		"\u0138\u0139\7v\2\2\u0139\u013a\7g\2\2\u013a\u013b\7u\2\2\u013bX\3\2\2"+
		"\2\u013c\u013d\7k\2\2\u013d\u013e\7u\2\2\u013e\u013f\7v\2\2\u013f\u0140"+
		"\7t\2\2\u0140\u0141\7g\2\2\u0141\u0142\7c\2\2\u0142\u0143\7o\2\2\u0143"+
		"Z\3\2\2\2\u0144\u0145\7=\2\2\u0145\\\3\2\2\2\u0146\u0147\7@\2\2\u0147"+
		"^\3\2\2\2\u0148\u0149\7y\2\2\u0149\u014a\7j\2\2\u014a\u014b\7g\2\2\u014b"+
		"\u014c\7t\2\2\u014c\u014d\7g\2\2\u014d`\3\2\2\2\u014e\u014f\7?\2\2\u014f"+
		"\u0150\7?\2\2\u0150b\3\2\2\2\u0151\u0152\7@\2\2\u0152\u0153\7?\2\2\u0153"+
		"d\3\2\2\2\u0154\u0158\t\2\2\2\u0155\u0157\t\3\2\2\u0156\u0155\3\2\2\2"+
		"\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159f\3"+
		"\2\2\2\u015a\u0158\3\2\2\2\u015b\u015d\4\62;\2\u015c\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015fh\3\2\2\2"+
		"\u0160\u0162\7\17\2\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163"+
		"\3\2\2\2\u0163\u0164\7\f\2\2\u0164j\3\2\2\2\u0165\u0167\t\4\2\2\u0166"+
		"\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016a\3\2\2\2\u016a\u016b\b\66\2\2\u016bl\3\2\2\2\7\2\u0158"+
		"\u015e\u0161\u0168";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}