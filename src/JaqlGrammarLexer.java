// Generated from JaqlGrammar.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JaqlGrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__56=1, T__55=2, T__54=3, T__53=4, T__52=5, T__51=6, T__50=7, T__49=8, 
		T__48=9, T__47=10, T__46=11, T__45=12, T__44=13, T__43=14, T__42=15, T__41=16, 
		T__40=17, T__39=18, T__38=19, T__37=20, T__36=21, T__35=22, T__34=23, 
		T__33=24, T__32=25, T__31=26, T__30=27, T__29=28, T__28=29, T__27=30, 
		T__26=31, T__25=32, T__24=33, T__23=34, T__22=35, T__21=36, T__20=37, 
		T__19=38, T__18=39, T__17=40, T__16=41, T__15=42, T__14=43, T__13=44, 
		T__12=45, T__11=46, T__10=47, T__9=48, T__8=49, T__7=50, T__6=51, T__5=52, 
		T__4=53, T__3=54, T__2=55, T__1=56, T__0=57, TRUE=58, FALSE=59, NULL=60, 
		ID=61, INT=62, STRING=63, NEWLINE=64, WS=65;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'into'", "'min'", "'*'", "'or'", "'['", "'<'", "'!='", "'<='", "'range'", 
		"'by'", "'readFromWrapper'", "'}'", "'->'", "'max'", "'now'", "')'", "'expand'", 
		"'seconds'", "'hours'", "'group'", "'='", "'dstream'", "'transform'", 
		"'days'", "'rstream'", "'rows'", "'filter'", "'window'", "'join'", "']'", 
		"'each'", "'in'", "','", "'-'", "':'", "'('", "'as'", "'readFromWrapperAsMaster'", 
		"'{'", "'sum'", "'and'", "'partitioned by'", "'unbounded'", "'$'", "'avg'", 
		"'.'", "'+'", "'minutes'", "'preserve'", "'istream'", "';'", "'>'", "'where'", 
		"'/'", "'=='", "'>='", "'count'", "'true'", "'false'", "'null'", "ID", 
		"INT", "STRING", "NEWLINE", "WS"
	};
	public static final String[] ruleNames = {
		"T__56", "T__55", "T__54", "T__53", "T__52", "T__51", "T__50", "T__49", 
		"T__48", "T__47", "T__46", "T__45", "T__44", "T__43", "T__42", "T__41", 
		"T__40", "T__39", "T__38", "T__37", "T__36", "T__35", "T__34", "T__33", 
		"T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", 
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"TRUE", "FALSE", "NULL", "ID", "INT", "STRING", "NEWLINE", "WS"
	};


	public JaqlGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JaqlGrammar.g4"; }

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
		case 64: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\2\4C\u01d5\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62"+
		"\t\62\4\63\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4"+
		":\t:\4;\t;\4<\t<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3"+
		" \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3.\3.\3.\3.\3/\3/\3\60\3\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\38\38\38\39\39\39\3:\3:"+
		"\3:\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\7>"+
		"\u01b7\n>\f>\16>\u01ba\13>\3?\6?\u01bd\n?\r?\16?\u01be\3@\3@\7@\u01c3"+
		"\n@\f@\16@\u01c6\13@\3@\3@\3A\5A\u01cb\nA\3A\3A\3B\6B\u01d0\nB\rB\16B"+
		"\u01d1\3B\3B\3\u01c4C\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n"+
		"\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%"+
		"\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19"+
		"\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1"+
		"Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1m8\1o9\1q:\1s"+
		";\1u<\1w=\1y>\1{?\1}@\1\177A\1\u0081B\1\u0083C\2\3\2\5\4C\\c|\6\62;C\\"+
		"aac|\5\13\f\17\17\"\"\u01d9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\3\u0085\3\2\2\2\5\u008a\3\2\2\2\7\u008e\3\2\2"+
		"\2\t\u0090\3\2\2\2\13\u0093\3\2\2\2\r\u0095\3\2\2\2\17\u0097\3\2\2\2\21"+
		"\u009a\3\2\2\2\23\u009d\3\2\2\2\25\u00a3\3\2\2\2\27\u00a6\3\2\2\2\31\u00b6"+
		"\3\2\2\2\33\u00b8\3\2\2\2\35\u00bb\3\2\2\2\37\u00bf\3\2\2\2!\u00c3\3\2"+
		"\2\2#\u00c5\3\2\2\2%\u00cc\3\2\2\2\'\u00d4\3\2\2\2)\u00da\3\2\2\2+\u00e0"+
		"\3\2\2\2-\u00e2\3\2\2\2/\u00ea\3\2\2\2\61\u00f4\3\2\2\2\63\u00f9\3\2\2"+
		"\2\65\u0101\3\2\2\2\67\u0106\3\2\2\29\u010d\3\2\2\2;\u0114\3\2\2\2=\u0119"+
		"\3\2\2\2?\u011b\3\2\2\2A\u0120\3\2\2\2C\u0123\3\2\2\2E\u0125\3\2\2\2G"+
		"\u0127\3\2\2\2I\u0129\3\2\2\2K\u012b\3\2\2\2M\u012e\3\2\2\2O\u0146\3\2"+
		"\2\2Q\u0148\3\2\2\2S\u014c\3\2\2\2U\u0150\3\2\2\2W\u015f\3\2\2\2Y\u0169"+
		"\3\2\2\2[\u016b\3\2\2\2]\u016f\3\2\2\2_\u0171\3\2\2\2a\u0173\3\2\2\2c"+
		"\u017b\3\2\2\2e\u0184\3\2\2\2g\u018c\3\2\2\2i\u018e\3\2\2\2k\u0190\3\2"+
		"\2\2m\u0196\3\2\2\2o\u0198\3\2\2\2q\u019b\3\2\2\2s\u019e\3\2\2\2u\u01a4"+
		"\3\2\2\2w\u01a9\3\2\2\2y\u01af\3\2\2\2{\u01b4\3\2\2\2}\u01bc\3\2\2\2\177"+
		"\u01c0\3\2\2\2\u0081\u01ca\3\2\2\2\u0083\u01cf\3\2\2\2\u0085\u0086\7k"+
		"\2\2\u0086\u0087\7p\2\2\u0087\u0088\7v\2\2\u0088\u0089\7q\2\2\u0089\4"+
		"\3\2\2\2\u008a\u008b\7o\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d"+
		"\6\3\2\2\2\u008e\u008f\7,\2\2\u008f\b\3\2\2\2\u0090\u0091\7q\2\2\u0091"+
		"\u0092\7t\2\2\u0092\n\3\2\2\2\u0093\u0094\7]\2\2\u0094\f\3\2\2\2\u0095"+
		"\u0096\7>\2\2\u0096\16\3\2\2\2\u0097\u0098\7#\2\2\u0098\u0099\7?\2\2\u0099"+
		"\20\3\2\2\2\u009a\u009b\7>\2\2\u009b\u009c\7?\2\2\u009c\22\3\2\2\2\u009d"+
		"\u009e\7t\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7i\2\2"+
		"\u00a1\u00a2\7g\2\2\u00a2\24\3\2\2\2\u00a3\u00a4\7d\2\2\u00a4\u00a5\7"+
		"{\2\2\u00a5\26\3\2\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9"+
		"\7c\2\2\u00a9\u00aa\7f\2\2\u00aa\u00ab\7H\2\2\u00ab\u00ac\7t\2\2\u00ac"+
		"\u00ad\7q\2\2\u00ad\u00ae\7o\2\2\u00ae\u00af\7Y\2\2\u00af\u00b0\7t\2\2"+
		"\u00b0\u00b1\7c\2\2\u00b1\u00b2\7r\2\2\u00b2\u00b3\7r\2\2\u00b3\u00b4"+
		"\7g\2\2\u00b4\u00b5\7t\2\2\u00b5\30\3\2\2\2\u00b6\u00b7\7\177\2\2\u00b7"+
		"\32\3\2\2\2\u00b8\u00b9\7/\2\2\u00b9\u00ba\7@\2\2\u00ba\34\3\2\2\2\u00bb"+
		"\u00bc\7o\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7z\2\2\u00be\36\3\2\2\2\u00bf"+
		"\u00c0\7p\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7y\2\2\u00c2 \3\2\2\2\u00c3"+
		"\u00c4\7+\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\7g\2\2\u00c6\u00c7\7z\2\2\u00c7"+
		"\u00c8\7r\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7f\2\2"+
		"\u00cb$\3\2\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7e\2"+
		"\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7f\2\2\u00d2\u00d3"+
		"\7u\2\2\u00d3&\3\2\2\2\u00d4\u00d5\7j\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7"+
		"\7w\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7u\2\2\u00d9(\3\2\2\2\u00da\u00db"+
		"\7i\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7w\2\2\u00de"+
		"\u00df\7r\2\2\u00df*\3\2\2\2\u00e0\u00e1\7?\2\2\u00e1,\3\2\2\2\u00e2\u00e3"+
		"\7f\2\2\u00e3\u00e4\7u\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7t\2\2\u00e6"+
		"\u00e7\7g\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7o\2\2\u00e9.\3\2\2\2\u00ea"+
		"\u00eb\7v\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee\7p\2\2"+
		"\u00ee\u00ef\7u\2\2\u00ef\u00f0\7h\2\2\u00f0\u00f1\7q\2\2\u00f1\u00f2"+
		"\7t\2\2\u00f2\u00f3\7o\2\2\u00f3\60\3\2\2\2\u00f4\u00f5\7f\2\2\u00f5\u00f6"+
		"\7c\2\2\u00f6\u00f7\7{\2\2\u00f7\u00f8\7u\2\2\u00f8\62\3\2\2\2\u00f9\u00fa"+
		"\7t\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7v\2\2\u00fc\u00fd\7t\2\2\u00fd"+
		"\u00fe\7g\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7o\2\2\u0100\64\3\2\2\2\u0101"+
		"\u0102\7t\2\2\u0102\u0103\7q\2\2\u0103\u0104\7y\2\2\u0104\u0105\7u\2\2"+
		"\u0105\66\3\2\2\2\u0106\u0107\7h\2\2\u0107\u0108\7k\2\2\u0108\u0109\7"+
		"n\2\2\u0109\u010a\7v\2\2\u010a\u010b\7g\2\2\u010b\u010c\7t\2\2\u010c8"+
		"\3\2\2\2\u010d\u010e\7y\2\2\u010e\u010f\7k\2\2\u010f\u0110\7p\2\2\u0110"+
		"\u0111\7f\2\2\u0111\u0112\7q\2\2\u0112\u0113\7y\2\2\u0113:\3\2\2\2\u0114"+
		"\u0115\7l\2\2\u0115\u0116\7q\2\2\u0116\u0117\7k\2\2\u0117\u0118\7p\2\2"+
		"\u0118<\3\2\2\2\u0119\u011a\7_\2\2\u011a>\3\2\2\2\u011b\u011c\7g\2\2\u011c"+
		"\u011d\7c\2\2\u011d\u011e\7e\2\2\u011e\u011f\7j\2\2\u011f@\3\2\2\2\u0120"+
		"\u0121\7k\2\2\u0121\u0122\7p\2\2\u0122B\3\2\2\2\u0123\u0124\7.\2\2\u0124"+
		"D\3\2\2\2\u0125\u0126\7/\2\2\u0126F\3\2\2\2\u0127\u0128\7<\2\2\u0128H"+
		"\3\2\2\2\u0129\u012a\7*\2\2\u012aJ\3\2\2\2\u012b\u012c\7c\2\2\u012c\u012d"+
		"\7u\2\2\u012dL\3\2\2\2\u012e\u012f\7t\2\2\u012f\u0130\7g\2\2\u0130\u0131"+
		"\7c\2\2\u0131\u0132\7f\2\2\u0132\u0133\7H\2\2\u0133\u0134\7t\2\2\u0134"+
		"\u0135\7q\2\2\u0135\u0136\7o\2\2\u0136\u0137\7Y\2\2\u0137\u0138\7t\2\2"+
		"\u0138\u0139\7c\2\2\u0139\u013a\7r\2\2\u013a\u013b\7r\2\2\u013b\u013c"+
		"\7g\2\2\u013c\u013d\7t\2\2\u013d\u013e\7C\2\2\u013e\u013f\7u\2\2\u013f"+
		"\u0140\7O\2\2\u0140\u0141\7c\2\2\u0141\u0142\7u\2\2\u0142\u0143\7v\2\2"+
		"\u0143\u0144\7g\2\2\u0144\u0145\7t\2\2\u0145N\3\2\2\2\u0146\u0147\7}\2"+
		"\2\u0147P\3\2\2\2\u0148\u0149\7u\2\2\u0149\u014a\7w\2\2\u014a\u014b\7"+
		"o\2\2\u014bR\3\2\2\2\u014c\u014d\7c\2\2\u014d\u014e\7p\2\2\u014e\u014f"+
		"\7f\2\2\u014fT\3\2\2\2\u0150\u0151\7r\2\2\u0151\u0152\7c\2\2\u0152\u0153"+
		"\7t\2\2\u0153\u0154\7v\2\2\u0154\u0155\7k\2\2\u0155\u0156\7v\2\2\u0156"+
		"\u0157\7k\2\2\u0157\u0158\7q\2\2\u0158\u0159\7p\2\2\u0159\u015a\7g\2\2"+
		"\u015a\u015b\7f\2\2\u015b\u015c\7\"\2\2\u015c\u015d\7d\2\2\u015d\u015e"+
		"\7{\2\2\u015eV\3\2\2\2\u015f\u0160\7w\2\2\u0160\u0161\7p\2\2\u0161\u0162"+
		"\7d\2\2\u0162\u0163\7q\2\2\u0163\u0164\7w\2\2\u0164\u0165\7p\2\2\u0165"+
		"\u0166\7f\2\2\u0166\u0167\7g\2\2\u0167\u0168\7f\2\2\u0168X\3\2\2\2\u0169"+
		"\u016a\7&\2\2\u016aZ\3\2\2\2\u016b\u016c\7c\2\2\u016c\u016d\7x\2\2\u016d"+
		"\u016e\7i\2\2\u016e\\\3\2\2\2\u016f\u0170\7\60\2\2\u0170^\3\2\2\2\u0171"+
		"\u0172\7-\2\2\u0172`\3\2\2\2\u0173\u0174\7o\2\2\u0174\u0175\7k\2\2\u0175"+
		"\u0176\7p\2\2\u0176\u0177\7w\2\2\u0177\u0178\7v\2\2\u0178\u0179\7g\2\2"+
		"\u0179\u017a\7u\2\2\u017ab\3\2\2\2\u017b\u017c\7r\2\2\u017c\u017d\7t\2"+
		"\2\u017d\u017e\7g\2\2\u017e\u017f\7u\2\2\u017f\u0180\7g\2\2\u0180\u0181"+
		"\7t\2\2\u0181\u0182\7x\2\2\u0182\u0183\7g\2\2\u0183d\3\2\2\2\u0184\u0185"+
		"\7k\2\2\u0185\u0186\7u\2\2\u0186\u0187\7v\2\2\u0187\u0188\7t\2\2\u0188"+
		"\u0189\7g\2\2\u0189\u018a\7c\2\2\u018a\u018b\7o\2\2\u018bf\3\2\2\2\u018c"+
		"\u018d\7=\2\2\u018dh\3\2\2\2\u018e\u018f\7@\2\2\u018fj\3\2\2\2\u0190\u0191"+
		"\7y\2\2\u0191\u0192\7j\2\2\u0192\u0193\7g\2\2\u0193\u0194\7t\2\2\u0194"+
		"\u0195\7g\2\2\u0195l\3\2\2\2\u0196\u0197\7\61\2\2\u0197n\3\2\2\2\u0198"+
		"\u0199\7?\2\2\u0199\u019a\7?\2\2\u019ap\3\2\2\2\u019b\u019c\7@\2\2\u019c"+
		"\u019d\7?\2\2\u019dr\3\2\2\2\u019e\u019f\7e\2\2\u019f\u01a0\7q\2\2\u01a0"+
		"\u01a1\7w\2\2\u01a1\u01a2\7p\2\2\u01a2\u01a3\7v\2\2\u01a3t\3\2\2\2\u01a4"+
		"\u01a5\7v\2\2\u01a5\u01a6\7t\2\2\u01a6\u01a7\7w\2\2\u01a7\u01a8\7g\2\2"+
		"\u01a8v\3\2\2\2\u01a9\u01aa\7h\2\2\u01aa\u01ab\7c\2\2\u01ab\u01ac\7n\2"+
		"\2\u01ac\u01ad\7u\2\2\u01ad\u01ae\7g\2\2\u01aex\3\2\2\2\u01af\u01b0\7"+
		"p\2\2\u01b0\u01b1\7w\2\2\u01b1\u01b2\7n\2\2\u01b2\u01b3\7n\2\2\u01b3z"+
		"\3\2\2\2\u01b4\u01b8\t\2\2\2\u01b5\u01b7\t\3\2\2\u01b6\u01b5\3\2\2\2\u01b7"+
		"\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9|\3\2\2\2"+
		"\u01ba\u01b8\3\2\2\2\u01bb\u01bd\4\62;\2\u01bc\u01bb\3\2\2\2\u01bd\u01be"+
		"\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf~\3\2\2\2\u01c0"+
		"\u01c4\7$\2\2\u01c1\u01c3\13\2\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2"+
		"\2\2\u01c4\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c7\u01c8\7$\2\2\u01c8\u0080\3\2\2\2\u01c9\u01cb\7\17"+
		"\2\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01cd\7\f\2\2\u01cd\u0082\3\2\2\2\u01ce\u01d0\t\4\2\2\u01cf\u01ce\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u01d3\3\2\2\2\u01d3\u01d4\bB\2\2\u01d4\u0084\3\2\2\2\b\2\u01b8\u01be"+
		"\u01c4\u01ca\u01d1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}