package antlrGen;

// Generated from JaqlGrammar.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JaqlGrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__58=1, T__57=2, T__56=3, T__55=4, T__54=5, T__53=6, T__52=7, T__51=8, 
		T__50=9, T__49=10, T__48=11, T__47=12, T__46=13, T__45=14, T__44=15, T__43=16, 
		T__42=17, T__41=18, T__40=19, T__39=20, T__38=21, T__37=22, T__36=23, 
		T__35=24, T__34=25, T__33=26, T__32=27, T__31=28, T__30=29, T__29=30, 
		T__28=31, T__27=32, T__26=33, T__25=34, T__24=35, T__23=36, T__22=37, 
		T__21=38, T__20=39, T__19=40, T__18=41, T__17=42, T__16=43, T__15=44, 
		T__14=45, T__13=46, T__12=47, T__11=48, T__10=49, T__9=50, T__8=51, T__7=52, 
		T__6=53, T__5=54, T__4=55, T__3=56, T__2=57, T__1=58, T__0=59, TRUE=60, 
		FALSE=61, NULL=62, ID=63, INT=64, STRING=65, NEWLINE=66, WS=67;
	public static final String[] tokenNames = {
		"<INVALID>", "'into'", "'min'", "'*'", "'or'", "'['", "'<'", "'!='", "'<='", 
		"'range'", "'by'", "'readFromWrapper'", "'}'", "'%'", "'->'", "'max'", 
		"'now'", "')'", "'expand'", "'seconds'", "'hours'", "'group'", "'='", 
		"'transform'", "'dstream'", "'days'", "'rstream'", "'rows'", "'filter'", 
		"'window'", "'!'", "'join'", "']'", "'each'", "'in'", "','", "'-'", "':'", 
		"'('", "'as'", "'readFromWrapperAsMaster'", "'{'", "'sum'", "'and'", "'partitioned by'", 
		"'unbounded'", "'$'", "'avg'", "'.'", "'+'", "'minutes'", "'preserve'", 
		"'istream'", "';'", "'>'", "'where'", "'/'", "'=='", "'>='", "'count'", 
		"'true'", "'false'", "'null'", "ID", "INT", "STRING", "NEWLINE", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_readStream = 2, RULE_assignView = 3, 
		RULE_join = 4, RULE_joinVar = 5, RULE_pipe = 6, RULE_pipeExpr = 7, RULE_stream = 8, 
		RULE_windowRange = 9, RULE_timeRange = 10, RULE_timeUnit = 11, RULE_conditions = 12, 
		RULE_comprator = 13, RULE_jsonGen = 14, RULE_arrayGen = 15, RULE_objectGen = 16, 
		RULE_field = 17, RULE_exprs = 18, RULE_aggrFunc = 19, RULE_aggrFuncName = 20, 
		RULE_var = 21, RULE_idWithArray = 22, RULE_arraySymbol = 23, RULE_identifier = 24;
	public static final String[] ruleNames = {
		"prog", "stat", "readStream", "assignView", "join", "joinVar", "pipe", 
		"pipeExpr", "stream", "windowRange", "timeRange", "timeUnit", "conditions", 
		"comprator", "jsonGen", "arrayGen", "objectGen", "field", "exprs", "aggrFunc", 
		"aggrFuncName", "var", "idWithArray", "arraySymbol", "identifier"
	};

	@Override
	public String getGrammarFileName() { return "JaqlGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public JaqlGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50); stat();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 15) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 31) | (1L << 33) | (1L << 34) | (1L << 39) | (1L << 40) | (1L << 42) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 50) | (1L << 52) | (1L << 55) | (1L << 59) | (1L << ID))) != 0) || _la==NEWLINE );
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

	public static class StatContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(JaqlGrammarParser.NEWLINE, 0); }
		public AssignViewContext assignView() {
			return getRuleContext(AssignViewContext.class,0);
		}
		public ReadStreamContext readStream() {
			return getRuleContext(ReadStreamContext.class,0);
		}
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PipeContext pipe() {
			return getRuleContext(PipeContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); pipe();
				setState(56); match(53);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); join();
				setState(59); match(53);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61); assignView();
				setState(62); match(53);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64); readStream();
				setState(65); match(53);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67); identifier();
				setState(68); match(53);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70); match(NEWLINE);
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

	public static class ReadStreamContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(JaqlGrammarParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(JaqlGrammarParser.TRUE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JaqlGrammarParser.STRING, 0); }
		public ReadStreamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStream; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitReadStream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStreamContext readStream() throws RecognitionException {
		ReadStreamContext _localctx = new ReadStreamContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_readStream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); identifier();
			setState(74); match(22);
			setState(75); match(11);
			setState(76); match(38);
			setState(77); match(STRING);
			setState(78); match(35);
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(80); match(17);
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

	public static class AssignViewContext extends ParserRuleContext {
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PipeContext pipe() {
			return getRuleContext(PipeContext.class,0);
		}
		public AssignViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignView; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitAssignView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignViewContext assignView() throws RecognitionException {
		AssignViewContext _localctx = new AssignViewContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); identifier();
			setState(83); match(22);
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(84); pipe();
				}
				break;

			case 2:
				{
				setState(85); join();
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

	public static class JoinContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public JsonGenContext jsonGen() {
			return getRuleContext(JsonGenContext.class,0);
		}
		public List<JoinVarContext> joinVar() {
			return getRuleContexts(JoinVarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public JoinVarContext joinVar(int i) {
			return getRuleContext(JoinVarContext.class,i);
		}
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(31);
			setState(89); joinVar();
			setState(90); match(35);
			setState(91); joinVar();
			setState(92); match(55);
			setState(93); var();
			setState(94); match(57);
			setState(95); var();
			setState(96); match(1);
			setState(97); jsonGen();
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

	public static class JoinVarContext extends ParserRuleContext {
		public Token preserve;
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public JoinVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitJoinVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinVarContext joinVar() throws RecognitionException {
		JoinVarContext _localctx = new JoinVarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_joinVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if (_la==51) {
				{
				setState(99); ((JoinVarContext)_localctx).preserve = match(51);
				}
			}

			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(102); identifier();
				setState(103); match(34);
				}
				break;
			}
			setState(107); identifier();
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

	public static class PipeContext extends ParserRuleContext {
		public PipeExprContext pipeExpr(int i) {
			return getRuleContext(PipeExprContext.class,i);
		}
		public List<PipeExprContext> pipeExpr() {
			return getRuleContexts(PipeExprContext.class);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipe; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitPipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipeContext pipe() throws RecognitionException {
		PipeContext _localctx = new PipeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pipe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); identifier();
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110); match(14);
				setState(111); pipeExpr();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==14 );
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

	public static class PipeExprContext extends ParserRuleContext {
		public PipeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeExpr; }
	 
		public PipeExprContext() { }
		public void copyFrom(PipeExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GroupSingleLabelContext extends PipeExprContext {
		public Token geach;
		public Token gby;
		public Token gas;
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public JsonGenContext jsonGen() {
			return getRuleContext(JsonGenContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public GroupSingleLabelContext(PipeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitGroupSingleLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowLabelContext extends PipeExprContext {
		public WindowRangeContext windowRange() {
			return getRuleContext(WindowRangeContext.class,0);
		}
		public WindowLabelContext(PipeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitWindowLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransformLabelContext extends PipeExprContext {
		public JsonGenContext jsonGen() {
			return getRuleContext(JsonGenContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TransformLabelContext(PipeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitTransformLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterLabelContext extends PipeExprContext {
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FilterLabelContext(PipeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitFilterLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpandLabelContext extends PipeExprContext {
		public JsonGenContext jsonGen() {
			return getRuleContext(JsonGenContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpandLabelContext(PipeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitExpandLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StreamLabelContext extends PipeExprContext {
		public StreamContext stream() {
			return getRuleContext(StreamContext.class,0);
		}
		public StreamLabelContext(PipeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitStreamLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipeExprContext pipeExpr() throws RecognitionException {
		PipeExprContext _localctx = new PipeExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pipeExpr);
		int _la;
		try {
			setState(158);
			switch (_input.LA(1)) {
			case 28:
				_localctx = new FilterLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116); match(28);
				setState(119);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(117); match(33);
					setState(118); identifier();
					}
					break;
				}
				setState(121); conditions(0);
				}
				break;
			case 23:
				_localctx = new TransformLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122); match(23);
				setState(125);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(123); match(33);
					setState(124); identifier();
					}
					break;
				}
				setState(127); jsonGen();
				}
				break;
			case 21:
				_localctx = new GroupSingleLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(128); match(21);
				setState(131);
				_la = _input.LA(1);
				if (_la==33) {
					{
					setState(129); ((GroupSingleLabelContext)_localctx).geach = match(33);
					setState(130); identifier();
					}
				}

				{
				setState(133); ((GroupSingleLabelContext)_localctx).gby = match(10);
				setState(134); identifier();
				setState(135); match(22);
				setState(136); var();
				setState(139);
				_la = _input.LA(1);
				if (_la==39) {
					{
					setState(137); ((GroupSingleLabelContext)_localctx).gas = match(39);
					setState(138); identifier();
					}
				}

				}
				setState(141); match(1);
				setState(142); jsonGen();
				}
				break;
			case 29:
				_localctx = new WindowLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(144); match(29);
				setState(145); match(5);
				setState(146); windowRange();
				setState(147); match(32);
				}
				break;
			case 18:
				_localctx = new ExpandLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(149); match(18);
				setState(152);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(150); match(33);
					setState(151); identifier();
					}
					break;
				}
				setState(155);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 15) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 31) | (1L << 33) | (1L << 34) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 50) | (1L << 52) | (1L << 55) | (1L << 59) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << ID))) != 0) || _la==INT || _la==STRING) {
					{
					setState(154); jsonGen();
					}
				}

				}
				break;
			case 24:
			case 26:
			case 52:
				_localctx = new StreamLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(157); stream();
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

	public static class StreamContext extends ParserRuleContext {
		public StreamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stream; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitStream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamContext stream() throws RecognitionException {
		StreamContext _localctx = new StreamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 24) | (1L << 26) | (1L << 52))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class WindowRangeContext extends ParserRuleContext {
		public WindowRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowRange; }
	 
		public WindowRangeContext() { }
		public void copyFrom(WindowRangeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowPartitionLabelContext extends WindowRangeContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode INT() { return getToken(JaqlGrammarParser.INT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public WindowPartitionLabelContext(WindowRangeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitWindowPartitionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowRowLabelContext extends WindowRangeContext {
		public TerminalNode INT() { return getToken(JaqlGrammarParser.INT, 0); }
		public WindowRowLabelContext(WindowRangeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitWindowRowLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowTimeLabelContext extends WindowRangeContext {
		public TerminalNode INT() { return getToken(JaqlGrammarParser.INT, 0); }
		public TimeRangeContext timeRange() {
			return getRuleContext(TimeRangeContext.class,0);
		}
		public TimeUnitContext timeUnit() {
			return getRuleContext(TimeUnitContext.class,0);
		}
		public WindowTimeLabelContext(WindowRangeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitWindowTimeLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowRangeContext windowRange() throws RecognitionException {
		WindowRangeContext _localctx = new WindowRangeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_windowRange);
		int _la;
		try {
			setState(182);
			switch (_input.LA(1)) {
			case 9:
				_localctx = new WindowTimeLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162); match(9);
				setState(166);
				switch (_input.LA(1)) {
				case INT:
					{
					{
					setState(163); match(INT);
					}
					setState(164); timeUnit();
					}
					break;
				case 16:
				case 45:
					{
					setState(165); timeRange();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 27:
				_localctx = new WindowRowLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(168); match(27);
				setState(169);
				_la = _input.LA(1);
				if ( !(_la==45 || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 44:
				_localctx = new WindowPartitionLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(170); match(44);
				setState(171); identifier();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==35) {
					{
					{
					setState(172); match(35);
					setState(173); identifier();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179); match(27);
				setState(180); match(INT);
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

	public static class TimeRangeContext extends ParserRuleContext {
		public TimeRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeRange; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitTimeRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeRangeContext timeRange() throws RecognitionException {
		TimeRangeContext _localctx = new TimeRangeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_timeRange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !(_la==16 || _la==45) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TimeUnitContext extends ParserRuleContext {
		public TimeUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitTimeUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeUnitContext timeUnit() throws RecognitionException {
		TimeUnitContext _localctx = new TimeUnitContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_timeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 19) | (1L << 20) | (1L << 25) | (1L << 50))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ConditionsContext extends ParserRuleContext {
		public int _p;
		public ConditionsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ConditionsContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
	 
		public ConditionsContext() { }
		public void copyFrom(ConditionsContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class CondCompLabelContext extends ConditionsContext {
		public CompratorContext comprator() {
			return getRuleContext(CompratorContext.class,0);
		}
		public List<ExprsContext> exprs() {
			return getRuleContexts(ExprsContext.class);
		}
		public ExprsContext exprs(int i) {
			return getRuleContext(ExprsContext.class,i);
		}
		public CondCompLabelContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitCondCompLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondNegLabelContext extends ConditionsContext {
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public CondNegLabelContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitCondNegLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondAndLabelContext extends ConditionsContext {
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public CondAndLabelContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitCondAndLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondSubLabelContext extends ConditionsContext {
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public CondSubLabelContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitCondSubLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondOrLabelContext extends ConditionsContext {
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public CondOrLabelContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitCondOrLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondVarLabelContext extends ConditionsContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public CondVarLabelContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitCondVarLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionsContext _localctx = new ConditionsContext(_ctx, _parentState, _p);
		ConditionsContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_conditions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new CondNegLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(189); match(30);
				setState(190); conditions(5);
				}
				break;

			case 2:
				{
				_localctx = new CondSubLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191); match(38);
				setState(192); conditions(0);
				setState(193); match(17);
				}
				break;

			case 3:
				{
				_localctx = new CondCompLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195); exprs(0);
				setState(196); comprator();
				setState(197); exprs(0);
				}
				break;

			case 4:
				{
				_localctx = new CondVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199); var();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(208);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(202);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(203); match(43);
						setState(204); conditions(4);
						}
						break;

					case 2:
						{
						_localctx = new CondOrLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(205);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(206); match(4);
						setState(207); conditions(3);
						}
						break;
					}
					} 
				}
				setState(212);
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

	public static class CompratorContext extends ParserRuleContext {
		public CompratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comprator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitComprator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompratorContext comprator() throws RecognitionException {
		CompratorContext _localctx = new CompratorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comprator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 8) | (1L << 54) | (1L << 57) | (1L << 58))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class JsonGenContext extends ParserRuleContext {
		public ObjectGenContext objectGen() {
			return getRuleContext(ObjectGenContext.class,0);
		}
		public ArrayGenContext arrayGen() {
			return getRuleContext(ArrayGenContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public JsonGenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonGen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitJsonGen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonGenContext jsonGen() throws RecognitionException {
		JsonGenContext _localctx = new JsonGenContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jsonGen);
		try {
			setState(218);
			switch (_input.LA(1)) {
			case 5:
				enterOuterAlt(_localctx, 1);
				{
				setState(215); arrayGen();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 2);
				{
				setState(216); objectGen();
				}
				break;
			case 1:
			case 2:
			case 9:
			case 10:
			case 11:
			case 15:
			case 16:
			case 19:
			case 20:
			case 21:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 31:
			case 33:
			case 34:
			case 38:
			case 39:
			case 40:
			case 42:
			case 45:
			case 46:
			case 47:
			case 50:
			case 52:
			case 55:
			case 59:
			case TRUE:
			case FALSE:
			case NULL:
			case ID:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(217); exprs(0);
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

	public static class ArrayGenContext extends ParserRuleContext {
		public List<JsonGenContext> jsonGen() {
			return getRuleContexts(JsonGenContext.class);
		}
		public JsonGenContext jsonGen(int i) {
			return getRuleContext(JsonGenContext.class,i);
		}
		public ArrayGenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayGen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitArrayGen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayGenContext arrayGen() throws RecognitionException {
		ArrayGenContext _localctx = new ArrayGenContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayGen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); match(5);
			setState(221); jsonGen();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==35) {
				{
				{
				setState(222); match(35);
				setState(223); jsonGen();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229); match(32);
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

	public static class ObjectGenContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public ObjectGenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectGen; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitObjectGen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectGenContext objectGen() throws RecognitionException {
		ObjectGenContext _localctx = new ObjectGenContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_objectGen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); match(41);
			setState(232); field();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==35) {
				{
				{
				setState(233); match(35);
				setState(234); field();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240); match(12);
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

	public static class FieldContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public JsonGenContext jsonGen() {
			return getRuleContext(JsonGenContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_field);
		try {
			setState(247);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242); identifier();
				setState(243); match(37);
				setState(244); jsonGen();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(246); var();
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

	public static class ExprsContext extends ParserRuleContext {
		public int _p;
		public ExprsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprsContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
	 
		public ExprsContext() { }
		public void copyFrom(ExprsContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class ExprBoolLabelContext extends ExprsContext {
		public TerminalNode FALSE() { return getToken(JaqlGrammarParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(JaqlGrammarParser.TRUE, 0); }
		public ExprBoolLabelContext(ExprsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitExprBoolLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprVarLabelContext extends ExprsContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprVarLabelContext(ExprsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitExprVarLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprSubExprLabelContext extends ExprsContext {
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public ExprSubExprLabelContext(ExprsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitExprSubExprLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAddSubLabelContext extends ExprsContext {
		public Token op;
		public List<ExprsContext> exprs() {
			return getRuleContexts(ExprsContext.class);
		}
		public ExprsContext exprs(int i) {
			return getRuleContext(ExprsContext.class,i);
		}
		public ExprAddSubLabelContext(ExprsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitExprAddSubLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIntLabelContext extends ExprsContext {
		public TerminalNode INT() { return getToken(JaqlGrammarParser.INT, 0); }
		public ExprIntLabelContext(ExprsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitExprIntLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprAggrFuncLabelContext extends ExprsContext {
		public AggrFuncContext aggrFunc() {
			return getRuleContext(AggrFuncContext.class,0);
		}
		public ExprAggrFuncLabelContext(ExprsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitExprAggrFuncLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStringLabelContext extends ExprsContext {
		public TerminalNode STRING() { return getToken(JaqlGrammarParser.STRING, 0); }
		public ExprStringLabelContext(ExprsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitExprStringLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNullLabelContext extends ExprsContext {
		public TerminalNode NULL() { return getToken(JaqlGrammarParser.NULL, 0); }
		public ExprNullLabelContext(ExprsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitExprNullLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMulDivModLabelContext extends ExprsContext {
		public Token op;
		public List<ExprsContext> exprs() {
			return getRuleContexts(ExprsContext.class);
		}
		public ExprsContext exprs(int i) {
			return getRuleContext(ExprsContext.class,i);
		}
		public ExprMulDivModLabelContext(ExprsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitExprMulDivModLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprsContext exprs(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprsContext _localctx = new ExprsContext(_ctx, _parentState, _p);
		ExprsContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, RULE_exprs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new ExprVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(250); var();
				}
				break;

			case 2:
				{
				_localctx = new ExprIntLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251); match(INT);
				}
				break;

			case 3:
				{
				_localctx = new ExprBoolLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;

			case 4:
				{
				_localctx = new ExprNullLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253); match(NULL);
				}
				break;

			case 5:
				{
				_localctx = new ExprStringLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254); match(STRING);
				}
				break;

			case 6:
				{
				_localctx = new ExprSubExprLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255); match(38);
				setState(256); exprs(0);
				setState(257); match(17);
				}
				break;

			case 7:
				{
				_localctx = new ExprAggrFuncLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(259); aggrFunc();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(270);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(268);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivModLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(262);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(263);
						((ExprMulDivModLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 13) | (1L << 56))) != 0)) ) {
							((ExprMulDivModLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(264); exprs(10);
						}
						break;

					case 2:
						{
						_localctx = new ExprAddSubLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(265);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(266);
						((ExprAddSubLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==36 || _la==49) ) {
							((ExprAddSubLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(267); exprs(9);
						}
						break;
					}
					} 
				}
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class AggrFuncContext extends ParserRuleContext {
		public AggrFuncNameContext aggrFuncName() {
			return getRuleContext(AggrFuncNameContext.class,0);
		}
		public JsonGenContext jsonGen() {
			return getRuleContext(JsonGenContext.class,0);
		}
		public AggrFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggrFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitAggrFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggrFuncContext aggrFunc() throws RecognitionException {
		AggrFuncContext _localctx = new AggrFuncContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_aggrFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); aggrFuncName();
			setState(274); match(38);
			setState(275); jsonGen();
			setState(276); match(17);
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

	public static class AggrFuncNameContext extends ParserRuleContext {
		public AggrFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggrFuncName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitAggrFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggrFuncNameContext aggrFuncName() throws RecognitionException {
		AggrFuncNameContext _localctx = new AggrFuncNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_aggrFuncName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 15) | (1L << 42) | (1L << 47) | (1L << 59))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class VarContext extends ParserRuleContext {
		public List<IdWithArrayContext> idWithArray() {
			return getRuleContexts(IdWithArrayContext.class);
		}
		public IdWithArrayContext idWithArray(int i) {
			return getRuleContext(IdWithArrayContext.class,i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(280); idWithArray();
			}
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(281); match(48);
					setState(282); idWithArray();
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class IdWithArrayContext extends ParserRuleContext {
		public List<ArraySymbolContext> arraySymbol() {
			return getRuleContexts(ArraySymbolContext.class);
		}
		public ArraySymbolContext arraySymbol(int i) {
			return getRuleContext(ArraySymbolContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdWithArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idWithArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitIdWithArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdWithArrayContext idWithArray() throws RecognitionException {
		IdWithArrayContext _localctx = new IdWithArrayContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_idWithArray);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288); identifier();
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(289); arraySymbol();
					}
					} 
				}
				setState(294);
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
			exitRule();
		}
		return _localctx;
	}

	public static class ArraySymbolContext extends ParserRuleContext {
		public Token star;
		public Token range;
		public List<TerminalNode> INT() { return getTokens(JaqlGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(JaqlGrammarParser.INT, i);
		}
		public ArraySymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySymbol; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitArraySymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraySymbolContext arraySymbol() throws RecognitionException {
		ArraySymbolContext _localctx = new ArraySymbolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arraySymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(295); match(5);
			setState(301);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(296); match(INT);
				}
				break;

			case 2:
				{
				setState(297); ((ArraySymbolContext)_localctx).star = match(3);
				}
				break;

			case 3:
				{
				{
				setState(298); match(INT);
				setState(299); ((ArraySymbolContext)_localctx).range = match(37);
				setState(300); match(INT);
				}
				}
				break;
			}
			setState(303); match(32);
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

	public static class IdentifierContext extends ParserRuleContext {
		public Token dollar;
		public TerminalNode ID() { return getToken(JaqlGrammarParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_identifier);
		try {
			setState(336);
			switch (_input.LA(1)) {
			case 11:
				enterOuterAlt(_localctx, 1);
				{
				setState(305); match(11);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(306); match(40);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 3);
				{
				setState(307); match(31);
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 4);
				{
				setState(308); match(55);
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 5);
				{
				setState(309); match(1);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 6);
				{
				setState(310); match(34);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 7);
				{
				setState(311); match(28);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 8);
				{
				setState(312); match(23);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 9);
				{
				setState(313); match(21);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 10);
				{
				setState(314); match(29);
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 11);
				{
				setState(315); match(52);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 12);
				{
				setState(316); match(24);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 13);
				{
				setState(317); match(26);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 14);
				{
				setState(318); match(33);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 15);
				{
				setState(319); match(39);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 16);
				{
				setState(320); match(10);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 17);
				{
				setState(321); match(9);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 18);
				{
				setState(322); match(45);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 19);
				{
				setState(323); match(27);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 20);
				{
				setState(324); match(16);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 21);
				{
				setState(325); match(19);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 22);
				{
				setState(326); match(50);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 23);
				{
				setState(327); match(20);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 24);
				{
				setState(328); match(25);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 25);
				{
				setState(329); match(42);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 26);
				{
				setState(330); match(47);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 27);
				{
				setState(331); match(15);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 28);
				{
				setState(332); match(2);
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 29);
				{
				setState(333); match(59);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 30);
				{
				setState(334); match(ID);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 31);
				{
				setState(335); ((IdentifierContext)_localctx).dollar = match(46);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12: return conditions_sempred((ConditionsContext)_localctx, predIndex);

		case 18: return exprs_sempred((ExprsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conditions_sempred(ConditionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 3 >= _localctx._p;

		case 1: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean exprs_sempred(ExprsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return 9 >= _localctx._p;

		case 3: return 8 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3E\u0155\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\3\2\6\2\66\n\2\r\2\16\2\67\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7g\n\7\3\7\3\7\3\7\5\7l\n\7\3\7\3\7"+
		"\3\b\3\b\3\b\6\bs\n\b\r\b\16\bt\3\t\3\t\3\t\5\tz\n\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0080\n\t\3\t\3\t\3\t\3\t\5\t\u0086\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u008e\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009b\n\t\3"+
		"\t\5\t\u009e\n\t\3\t\5\t\u00a1\n\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00a9"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b1\n\13\f\13\16\13\u00b4\13"+
		"\13\3\13\3\13\3\13\5\13\u00b9\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00cb\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u00d3\n\16\f\16\16\16\u00d6\13\16\3\17\3\17\3\20"+
		"\3\20\3\20\5\20\u00dd\n\20\3\21\3\21\3\21\3\21\7\21\u00e3\n\21\f\21\16"+
		"\21\u00e6\13\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00ee\n\22\f\22\16"+
		"\22\u00f1\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00fa\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0107\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u010f\n\24\f\24\16\24\u0112\13\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\7\27\u011e\n\27\f\27\16"+
		"\27\u0121\13\27\3\30\3\30\7\30\u0125\n\30\f\30\16\30\u0128\13\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0130\n\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0153\n\32\3\32\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\2\f\3>?\5\32\32\34\34\66\66\4//BB\4\22\22//\5\25\26\33\33\64\64"+
		"\5\b\n88;<\3>?\5\5\5\17\17::\4&&\63\63\7\4\4\21\21,,\61\61==\u0188\2\65"+
		"\3\2\2\2\4I\3\2\2\2\6K\3\2\2\2\bT\3\2\2\2\nZ\3\2\2\2\ff\3\2\2\2\16o\3"+
		"\2\2\2\20\u00a0\3\2\2\2\22\u00a2\3\2\2\2\24\u00b8\3\2\2\2\26\u00ba\3\2"+
		"\2\2\30\u00bc\3\2\2\2\32\u00ca\3\2\2\2\34\u00d7\3\2\2\2\36\u00dc\3\2\2"+
		"\2 \u00de\3\2\2\2\"\u00e9\3\2\2\2$\u00f9\3\2\2\2&\u0106\3\2\2\2(\u0113"+
		"\3\2\2\2*\u0118\3\2\2\2,\u011a\3\2\2\2.\u0122\3\2\2\2\60\u0129\3\2\2\2"+
		"\62\u0152\3\2\2\2\64\66\5\4\3\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2"+
		"\2\2\678\3\2\2\28\3\3\2\2\29:\5\16\b\2:;\7\67\2\2;J\3\2\2\2<=\5\n\6\2"+
		"=>\7\67\2\2>J\3\2\2\2?@\5\b\5\2@A\7\67\2\2AJ\3\2\2\2BC\5\6\4\2CD\7\67"+
		"\2\2DJ\3\2\2\2EF\5\62\32\2FG\7\67\2\2GJ\3\2\2\2HJ\7D\2\2I9\3\2\2\2I<\3"+
		"\2\2\2I?\3\2\2\2IB\3\2\2\2IE\3\2\2\2IH\3\2\2\2J\5\3\2\2\2KL\5\62\32\2"+
		"LM\7\30\2\2MN\7\r\2\2NO\7(\2\2OP\7C\2\2PQ\7%\2\2QR\t\2\2\2RS\7\23\2\2"+
		"S\7\3\2\2\2TU\5\62\32\2UX\7\30\2\2VY\5\16\b\2WY\5\n\6\2XV\3\2\2\2XW\3"+
		"\2\2\2Y\t\3\2\2\2Z[\7!\2\2[\\\5\f\7\2\\]\7%\2\2]^\5\f\7\2^_\79\2\2_`\5"+
		",\27\2`a\7;\2\2ab\5,\27\2bc\7\3\2\2cd\5\36\20\2d\13\3\2\2\2eg\7\65\2\2"+
		"fe\3\2\2\2fg\3\2\2\2gk\3\2\2\2hi\5\62\32\2ij\7$\2\2jl\3\2\2\2kh\3\2\2"+
		"\2kl\3\2\2\2lm\3\2\2\2mn\5\62\32\2n\r\3\2\2\2or\5\62\32\2pq\7\20\2\2q"+
		"s\5\20\t\2rp\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\17\3\2\2\2vy\7\36"+
		"\2\2wx\7#\2\2xz\5\62\32\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{\u00a1\5\32\16"+
		"\2|\177\7\31\2\2}~\7#\2\2~\u0080\5\62\32\2\177}\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u00a1\5\36\20\2\u0082\u0085\7\27\2\2\u0083"+
		"\u0084\7#\2\2\u0084\u0086\5\62\32\2\u0085\u0083\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\f\2\2\u0088\u0089\5\62\32\2\u0089"+
		"\u008a\7\30\2\2\u008a\u008d\5,\27\2\u008b\u008c\7)\2\2\u008c\u008e\5\62"+
		"\32\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\7\3\2\2\u0090\u0091\5\36\20\2\u0091\u00a1\3\2\2\2\u0092\u0093\7"+
		"\37\2\2\u0093\u0094\7\7\2\2\u0094\u0095\5\24\13\2\u0095\u0096\7\"\2\2"+
		"\u0096\u00a1\3\2\2\2\u0097\u009a\7\24\2\2\u0098\u0099\7#\2\2\u0099\u009b"+
		"\5\62\32\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2"+
		"\u009c\u009e\5\36\20\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u00a1\5\22\n\2\u00a0v\3\2\2\2\u00a0|\3\2\2\2\u00a0\u0082"+
		"\3\2\2\2\u00a0\u0092\3\2\2\2\u00a0\u0097\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\21\3\2\2\2\u00a2\u00a3\t\3\2\2\u00a3\23\3\2\2\2\u00a4\u00a8\7\13\2\2"+
		"\u00a5\u00a6\7B\2\2\u00a6\u00a9\5\30\r\2\u00a7\u00a9\5\26\f\2\u00a8\u00a5"+
		"\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00b9\3\2\2\2\u00aa\u00ab\7\35\2\2"+
		"\u00ab\u00b9\t\4\2\2\u00ac\u00ad\7.\2\2\u00ad\u00b2\5\62\32\2\u00ae\u00af"+
		"\7%\2\2\u00af\u00b1\5\62\32\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b5\u00b6\7\35\2\2\u00b6\u00b7\7B\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00a4\3\2\2\2\u00b8\u00aa\3\2\2\2\u00b8\u00ac\3\2\2\2\u00b9\25\3\2\2"+
		"\2\u00ba\u00bb\t\5\2\2\u00bb\27\3\2\2\2\u00bc\u00bd\t\6\2\2\u00bd\31\3"+
		"\2\2\2\u00be\u00bf\b\16\1\2\u00bf\u00c0\7 \2\2\u00c0\u00cb\5\32\16\2\u00c1"+
		"\u00c2\7(\2\2\u00c2\u00c3\5\32\16\2\u00c3\u00c4\7\23\2\2\u00c4\u00cb\3"+
		"\2\2\2\u00c5\u00c6\5&\24\2\u00c6\u00c7\5\34\17\2\u00c7\u00c8\5&\24\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00cb\5,\27\2\u00ca\u00be\3\2\2\2\u00ca\u00c1\3\2"+
		"\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00d4\3\2\2\2\u00cc"+
		"\u00cd\6\16\2\3\u00cd\u00ce\7-\2\2\u00ce\u00d3\5\32\16\2\u00cf\u00d0\6"+
		"\16\3\3\u00d0\u00d1\7\6\2\2\u00d1\u00d3\5\32\16\2\u00d2\u00cc\3\2\2\2"+
		"\u00d2\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\33\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\t\7\2\2\u00d8"+
		"\35\3\2\2\2\u00d9\u00dd\5 \21\2\u00da\u00dd\5\"\22\2\u00db\u00dd\5&\24"+
		"\2\u00dc\u00d9\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\37"+
		"\3\2\2\2\u00de\u00df\7\7\2\2\u00df\u00e4\5\36\20\2\u00e0\u00e1\7%\2\2"+
		"\u00e1\u00e3\5\36\20\2\u00e2\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7"+
		"\u00e8\7\"\2\2\u00e8!\3\2\2\2\u00e9\u00ea\7+\2\2\u00ea\u00ef\5$\23\2\u00eb"+
		"\u00ec\7%\2\2\u00ec\u00ee\5$\23\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f2\u00f3\7\16\2\2\u00f3#\3\2\2\2\u00f4\u00f5\5\62\32"+
		"\2\u00f5\u00f6\7\'\2\2\u00f6\u00f7\5\36\20\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00fa\5,\27\2\u00f9\u00f4\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa%\3\2\2\2"+
		"\u00fb\u00fc\b\24\1\2\u00fc\u0107\5,\27\2\u00fd\u0107\7B\2\2\u00fe\u0107"+
		"\t\b\2\2\u00ff\u0107\7@\2\2\u0100\u0107\7C\2\2\u0101\u0102\7(\2\2\u0102"+
		"\u0103\5&\24\2\u0103\u0104\7\23\2\2\u0104\u0107\3\2\2\2\u0105\u0107\5"+
		"(\25\2\u0106\u00fb\3\2\2\2\u0106\u00fd\3\2\2\2\u0106\u00fe\3\2\2\2\u0106"+
		"\u00ff\3\2\2\2\u0106\u0100\3\2\2\2\u0106\u0101\3\2\2\2\u0106\u0105\3\2"+
		"\2\2\u0107\u0110\3\2\2\2\u0108\u0109\6\24\4\3\u0109\u010a\t\t\2\2\u010a"+
		"\u010f\5&\24\2\u010b\u010c\6\24\5\3\u010c\u010d\t\n\2\2\u010d\u010f\5"+
		"&\24\2\u010e\u0108\3\2\2\2\u010e\u010b\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\'\3\2\2\2\u0112\u0110\3\2\2\2"+
		"\u0113\u0114\5*\26\2\u0114\u0115\7(\2\2\u0115\u0116\5\36\20\2\u0116\u0117"+
		"\7\23\2\2\u0117)\3\2\2\2\u0118\u0119\t\13\2\2\u0119+\3\2\2\2\u011a\u011f"+
		"\5.\30\2\u011b\u011c\7\62\2\2\u011c\u011e\5.\30\2\u011d\u011b\3\2\2\2"+
		"\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120-\3"+
		"\2\2\2\u0121\u011f\3\2\2\2\u0122\u0126\5\62\32\2\u0123\u0125\5\60\31\2"+
		"\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127/\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012f\7\7\2\2\u012a"+
		"\u0130\7B\2\2\u012b\u0130\7\5\2\2\u012c\u012d\7B\2\2\u012d\u012e\7\'\2"+
		"\2\u012e\u0130\7B\2\2\u012f\u012a\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u012c"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\7\"\2\2\u0132\61\3\2\2\2\u0133"+
		"\u0153\7\r\2\2\u0134\u0153\7*\2\2\u0135\u0153\7!\2\2\u0136\u0153\79\2"+
		"\2\u0137\u0153\7\3\2\2\u0138\u0153\7$\2\2\u0139\u0153\7\36\2\2\u013a\u0153"+
		"\7\31\2\2\u013b\u0153\7\27\2\2\u013c\u0153\7\37\2\2\u013d\u0153\7\66\2"+
		"\2\u013e\u0153\7\32\2\2\u013f\u0153\7\34\2\2\u0140\u0153\7#\2\2\u0141"+
		"\u0153\7)\2\2\u0142\u0153\7\f\2\2\u0143\u0153\7\13\2\2\u0144\u0153\7/"+
		"\2\2\u0145\u0153\7\35\2\2\u0146\u0153\7\22\2\2\u0147\u0153\7\25\2\2\u0148"+
		"\u0153\7\64\2\2\u0149\u0153\7\26\2\2\u014a\u0153\7\33\2\2\u014b\u0153"+
		"\7,\2\2\u014c\u0153\7\61\2\2\u014d\u0153\7\21\2\2\u014e\u0153\7\4\2\2"+
		"\u014f\u0153\7=\2\2\u0150\u0153\7A\2\2\u0151\u0153\7\60\2\2\u0152\u0133"+
		"\3\2\2\2\u0152\u0134\3\2\2\2\u0152\u0135\3\2\2\2\u0152\u0136\3\2\2\2\u0152"+
		"\u0137\3\2\2\2\u0152\u0138\3\2\2\2\u0152\u0139\3\2\2\2\u0152\u013a\3\2"+
		"\2\2\u0152\u013b\3\2\2\2\u0152\u013c\3\2\2\2\u0152\u013d\3\2\2\2\u0152"+
		"\u013e\3\2\2\2\u0152\u013f\3\2\2\2\u0152\u0140\3\2\2\2\u0152\u0141\3\2"+
		"\2\2\u0152\u0142\3\2\2\2\u0152\u0143\3\2\2\2\u0152\u0144\3\2\2\2\u0152"+
		"\u0145\3\2\2\2\u0152\u0146\3\2\2\2\u0152\u0147\3\2\2\2\u0152\u0148\3\2"+
		"\2\2\u0152\u0149\3\2\2\2\u0152\u014a\3\2\2\2\u0152\u014b\3\2\2\2\u0152"+
		"\u014c\3\2\2\2\u0152\u014d\3\2\2\2\u0152\u014e\3\2\2\2\u0152\u014f\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0152\u0151\3\2\2\2\u0153\63\3\2\2\2 \67IXfk"+
		"ty\177\u0085\u008d\u009a\u009d\u00a0\u00a8\u00b2\u00b8\u00ca\u00d2\u00d4"+
		"\u00dc\u00e4\u00ef\u00f9\u0106\u010e\u0110\u011f\u0126\u012f\u0152";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}