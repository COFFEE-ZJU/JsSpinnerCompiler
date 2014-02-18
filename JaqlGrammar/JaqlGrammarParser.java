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
		FALSE=61, NULL=62, ID=63, INT=64, STRING=65, WS=66;
	public static final String[] tokenNames = {
		"<INVALID>", "'into'", "'min'", "'*'", "'or'", "'['", "'<'", "'!='", "'<='", 
		"'range'", "'by'", "'readFromWrapper'", "'}'", "'->'", "'%'", "'max'", 
		"'now'", "')'", "'expand'", "'seconds'", "'hours'", "'group'", "'='", 
		"'dstream'", "'transform'", "'days'", "'rstream'", "'rows'", "'filter'", 
		"'window'", "'!'", "'join'", "']'", "'each'", "'in'", "','", "'-'", "':'", 
		"'('", "'as'", "'readFromWrapperAsMaster'", "'{'", "'sum'", "'and'", "'partitioned by'", 
		"'unbounded'", "'$'", "'avg'", "'.'", "'+'", "'minutes'", "'preserve'", 
		"'istream'", "';'", "'>'", "'where'", "'/'", "'=='", "'>='", "'count'", 
		"'true'", "'false'", "'null'", "ID", "INT", "STRING", "WS"
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 15) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 31) | (1L << 33) | (1L << 34) | (1L << 39) | (1L << 40) | (1L << 42) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 50) | (1L << 52) | (1L << 55) | (1L << 59) | (1L << ID))) != 0) );
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
			setState(70);
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
			setState(72); identifier();
			setState(73); match(22);
			setState(74); match(11);
			setState(75); match(38);
			setState(76); match(STRING);
			setState(77); match(35);
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(79); match(17);
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
			setState(81); identifier();
			setState(82); match(22);
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(83); pipe();
				}
				break;

			case 2:
				{
				setState(84); join();
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
			setState(87); match(31);
			setState(88); joinVar();
			setState(89); match(35);
			setState(90); joinVar();
			setState(91); match(55);
			setState(92); var();
			setState(93); match(57);
			setState(94); var();
			setState(95); match(1);
			setState(96); jsonGen();
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
			setState(99);
			_la = _input.LA(1);
			if (_la==51) {
				{
				setState(98); ((JoinVarContext)_localctx).preserve = match(51);
				}
			}

			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(101); identifier();
				setState(102); match(34);
				}
				break;
			}
			setState(106); identifier();
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
			setState(108); identifier();
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(109); match(13);
				setState(110); pipeExpr();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==13 );
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
			setState(157);
			switch (_input.LA(1)) {
			case 28:
				_localctx = new FilterLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115); match(28);
				setState(118);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(116); match(33);
					setState(117); identifier();
					}
					break;
				}
				setState(120); conditions(0);
				}
				break;
			case 24:
				_localctx = new TransformLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121); match(24);
				setState(124);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(122); match(33);
					setState(123); identifier();
					}
					break;
				}
				setState(126); jsonGen();
				}
				break;
			case 21:
				_localctx = new GroupSingleLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(127); match(21);
				setState(130);
				_la = _input.LA(1);
				if (_la==33) {
					{
					setState(128); ((GroupSingleLabelContext)_localctx).geach = match(33);
					setState(129); identifier();
					}
				}

				{
				setState(132); ((GroupSingleLabelContext)_localctx).gby = match(10);
				setState(133); identifier();
				setState(134); match(22);
				setState(135); var();
				setState(138);
				_la = _input.LA(1);
				if (_la==39) {
					{
					setState(136); ((GroupSingleLabelContext)_localctx).gas = match(39);
					setState(137); identifier();
					}
				}

				}
				setState(140); match(1);
				setState(141); jsonGen();
				}
				break;
			case 29:
				_localctx = new WindowLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(143); match(29);
				setState(144); match(5);
				setState(145); windowRange();
				setState(146); match(32);
				}
				break;
			case 18:
				_localctx = new ExpandLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(148); match(18);
				setState(151);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(149); match(33);
					setState(150); identifier();
					}
					break;
				}
				setState(154);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 15) | (1L << 16) | (1L << 19) | (1L << 20) | (1L << 21) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 31) | (1L << 33) | (1L << 34) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 41) | (1L << 42) | (1L << 45) | (1L << 46) | (1L << 47) | (1L << 50) | (1L << 52) | (1L << 55) | (1L << 59) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << ID))) != 0) || _la==INT || _la==STRING) {
					{
					setState(153); jsonGen();
					}
				}

				}
				break;
			case 23:
			case 26:
			case 52:
				_localctx = new StreamLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(156); stream();
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
			setState(159);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 23) | (1L << 26) | (1L << 52))) != 0)) ) {
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
			setState(181);
			switch (_input.LA(1)) {
			case 9:
				_localctx = new WindowTimeLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161); match(9);
				setState(165);
				switch (_input.LA(1)) {
				case INT:
					{
					{
					setState(162); match(INT);
					}
					setState(163); timeUnit();
					}
					break;
				case 16:
				case 45:
					{
					setState(164); timeRange();
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
				setState(167); match(27);
				setState(168);
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
				setState(169); match(44);
				setState(170); identifier();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==35) {
					{
					{
					setState(171); match(35);
					setState(172); identifier();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178); match(27);
				setState(179); match(INT);
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
			setState(183);
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
			setState(185);
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
			setState(199);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new CondNegLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(188); match(30);
				setState(189); conditions(5);
				}
				break;

			case 2:
				{
				_localctx = new CondSubLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190); match(38);
				setState(191); conditions(0);
				setState(192); match(17);
				}
				break;

			case 3:
				{
				_localctx = new CondCompLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194); exprs(0);
				setState(195); comprator();
				setState(196); exprs(0);
				}
				break;

			case 4:
				{
				_localctx = new CondVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198); var();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(207);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(201);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(202); match(43);
						setState(203); conditions(4);
						}
						break;

					case 2:
						{
						_localctx = new CondOrLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(204);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(205); match(4);
						setState(206); conditions(3);
						}
						break;
					}
					} 
				}
				setState(211);
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
			setState(212);
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
			setState(217);
			switch (_input.LA(1)) {
			case 5:
				enterOuterAlt(_localctx, 1);
				{
				setState(214); arrayGen();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 2);
				{
				setState(215); objectGen();
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
				setState(216); exprs(0);
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
			setState(219); match(5);
			setState(220); jsonGen();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==35) {
				{
				{
				setState(221); match(35);
				setState(222); jsonGen();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(228); match(32);
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
			setState(230); match(41);
			setState(231); field();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==35) {
				{
				{
				setState(232); match(35);
				setState(233); field();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239); match(12);
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
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241); identifier();
				setState(242); match(37);
				setState(243); jsonGen();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245); var();
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
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new ExprVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(249); var();
				}
				break;

			case 2:
				{
				_localctx = new ExprIntLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250); match(INT);
				}
				break;

			case 3:
				{
				_localctx = new ExprBoolLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251);
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
				setState(252); match(NULL);
				}
				break;

			case 5:
				{
				_localctx = new ExprStringLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253); match(STRING);
				}
				break;

			case 6:
				{
				_localctx = new ExprSubExprLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254); match(38);
				setState(255); exprs(0);
				setState(256); match(17);
				}
				break;

			case 7:
				{
				_localctx = new ExprAggrFuncLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(258); aggrFunc();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(267);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivModLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(261);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(262);
						((ExprMulDivModLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 14) | (1L << 56))) != 0)) ) {
							((ExprMulDivModLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(263); exprs(10);
						}
						break;

					case 2:
						{
						_localctx = new ExprAddSubLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(264);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(265);
						((ExprAddSubLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==36 || _la==49) ) {
							((ExprAddSubLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(266); exprs(9);
						}
						break;
					}
					} 
				}
				setState(271);
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
			setState(272); aggrFuncName();
			setState(273); match(38);
			setState(274); jsonGen();
			setState(275); match(17);
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
			setState(277);
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
			setState(279); idWithArray();
			}
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(280); match(48);
					setState(281); idWithArray();
					}
					} 
				}
				setState(286);
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
			setState(287); identifier();
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(288); arraySymbol();
					}
					} 
				}
				setState(293);
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
			setState(294); match(5);
			setState(300);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(295); match(INT);
				}
				break;

			case 2:
				{
				setState(296); ((ArraySymbolContext)_localctx).star = match(3);
				}
				break;

			case 3:
				{
				{
				setState(297); match(INT);
				setState(298); ((ArraySymbolContext)_localctx).range = match(37);
				setState(299); match(INT);
				}
				}
				break;
			}
			setState(302); match(32);
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
			setState(335);
			switch (_input.LA(1)) {
			case 11:
				enterOuterAlt(_localctx, 1);
				{
				setState(304); match(11);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 2);
				{
				setState(305); match(40);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 3);
				{
				setState(306); match(31);
				}
				break;
			case 55:
				enterOuterAlt(_localctx, 4);
				{
				setState(307); match(55);
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 5);
				{
				setState(308); match(1);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 6);
				{
				setState(309); match(34);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 7);
				{
				setState(310); match(28);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 8);
				{
				setState(311); match(24);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 9);
				{
				setState(312); match(21);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 10);
				{
				setState(313); match(29);
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 11);
				{
				setState(314); match(52);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 12);
				{
				setState(315); match(23);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 13);
				{
				setState(316); match(26);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 14);
				{
				setState(317); match(33);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 15);
				{
				setState(318); match(39);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 16);
				{
				setState(319); match(10);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 17);
				{
				setState(320); match(9);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 18);
				{
				setState(321); match(45);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 19);
				{
				setState(322); match(27);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 20);
				{
				setState(323); match(16);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 21);
				{
				setState(324); match(19);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 22);
				{
				setState(325); match(50);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 23);
				{
				setState(326); match(20);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 24);
				{
				setState(327); match(25);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 25);
				{
				setState(328); match(42);
				}
				break;
			case 47:
				enterOuterAlt(_localctx, 26);
				{
				setState(329); match(47);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 27);
				{
				setState(330); match(15);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 28);
				{
				setState(331); match(2);
				}
				break;
			case 59:
				enterOuterAlt(_localctx, 29);
				{
				setState(332); match(59);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 30);
				{
				setState(333); match(ID);
				}
				break;
			case 46:
				enterOuterAlt(_localctx, 31);
				{
				setState(334); ((IdentifierContext)_localctx).dollar = match(46);
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
		"\2\3D\u0154\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\3\2\6\2\66\n\2\r\2\16\2\67\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5X\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7f\n\7\3\7\3\7\3\7\5\7k\n\7\3\7\3\7\3\b"+
		"\3\b\3\b\6\br\n\b\r\b\16\bs\3\t\3\t\3\t\5\ty\n\t\3\t\3\t\3\t\3\t\5\t\177"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u0085\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008d\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009a\n\t\3\t\5\t\u009d"+
		"\n\t\3\t\5\t\u00a0\n\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00a8\n\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u00b0\n\13\f\13\16\13\u00b3\13\13\3\13"+
		"\3\13\3\13\5\13\u00b8\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ca\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u00d2\n\16\f\16\16\16\u00d5\13\16\3\17\3\17\3\20\3\20"+
		"\3\20\5\20\u00dc\n\20\3\21\3\21\3\21\3\21\7\21\u00e2\n\21\f\21\16\21\u00e5"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00ed\n\22\f\22\16\22\u00f0"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00f9\n\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0106\n\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u010e\n\24\f\24\16\24\u0111\13\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\7\27\u011d\n\27\f\27\16\27\u0120"+
		"\13\27\3\30\3\30\7\30\u0124\n\30\f\30\16\30\u0127\13\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\5\31\u012f\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0152\n\32"+
		"\3\32\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\f\3"+
		">?\5\31\31\34\34\66\66\4//BB\4\22\22//\5\25\26\33\33\64\64\5\b\n88;<\3"+
		">?\5\5\5\20\20::\4&&\63\63\7\4\4\21\21,,\61\61==\u0186\2\65\3\2\2\2\4"+
		"H\3\2\2\2\6J\3\2\2\2\bS\3\2\2\2\nY\3\2\2\2\fe\3\2\2\2\16n\3\2\2\2\20\u009f"+
		"\3\2\2\2\22\u00a1\3\2\2\2\24\u00b7\3\2\2\2\26\u00b9\3\2\2\2\30\u00bb\3"+
		"\2\2\2\32\u00c9\3\2\2\2\34\u00d6\3\2\2\2\36\u00db\3\2\2\2 \u00dd\3\2\2"+
		"\2\"\u00e8\3\2\2\2$\u00f8\3\2\2\2&\u0105\3\2\2\2(\u0112\3\2\2\2*\u0117"+
		"\3\2\2\2,\u0119\3\2\2\2.\u0121\3\2\2\2\60\u0128\3\2\2\2\62\u0151\3\2\2"+
		"\2\64\66\5\4\3\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\2"+
		"8\3\3\2\2\29:\5\16\b\2:;\7\67\2\2;I\3\2\2\2<=\5\n\6\2=>\7\67\2\2>I\3\2"+
		"\2\2?@\5\b\5\2@A\7\67\2\2AI\3\2\2\2BC\5\6\4\2CD\7\67\2\2DI\3\2\2\2EF\5"+
		"\62\32\2FG\7\67\2\2GI\3\2\2\2H9\3\2\2\2H<\3\2\2\2H?\3\2\2\2HB\3\2\2\2"+
		"HE\3\2\2\2I\5\3\2\2\2JK\5\62\32\2KL\7\30\2\2LM\7\r\2\2MN\7(\2\2NO\7C\2"+
		"\2OP\7%\2\2PQ\t\2\2\2QR\7\23\2\2R\7\3\2\2\2ST\5\62\32\2TW\7\30\2\2UX\5"+
		"\16\b\2VX\5\n\6\2WU\3\2\2\2WV\3\2\2\2X\t\3\2\2\2YZ\7!\2\2Z[\5\f\7\2[\\"+
		"\7%\2\2\\]\5\f\7\2]^\79\2\2^_\5,\27\2_`\7;\2\2`a\5,\27\2ab\7\3\2\2bc\5"+
		"\36\20\2c\13\3\2\2\2df\7\65\2\2ed\3\2\2\2ef\3\2\2\2fj\3\2\2\2gh\5\62\32"+
		"\2hi\7$\2\2ik\3\2\2\2jg\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\5\62\32\2m\r\3\2"+
		"\2\2nq\5\62\32\2op\7\17\2\2pr\5\20\t\2qo\3\2\2\2rs\3\2\2\2sq\3\2\2\2s"+
		"t\3\2\2\2t\17\3\2\2\2ux\7\36\2\2vw\7#\2\2wy\5\62\32\2xv\3\2\2\2xy\3\2"+
		"\2\2yz\3\2\2\2z\u00a0\5\32\16\2{~\7\32\2\2|}\7#\2\2}\177\5\62\32\2~|\3"+
		"\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u00a0\5\36\20\2\u0081\u0084"+
		"\7\27\2\2\u0082\u0083\7#\2\2\u0083\u0085\5\62\32\2\u0084\u0082\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\f\2\2\u0087\u0088"+
		"\5\62\32\2\u0088\u0089\7\30\2\2\u0089\u008c\5,\27\2\u008a\u008b\7)\2\2"+
		"\u008b\u008d\5\62\32\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\7\3\2\2\u008f\u0090\5\36\20\2\u0090\u00a0\3\2\2\2"+
		"\u0091\u0092\7\37\2\2\u0092\u0093\7\7\2\2\u0093\u0094\5\24\13\2\u0094"+
		"\u0095\7\"\2\2\u0095\u00a0\3\2\2\2\u0096\u0099\7\24\2\2\u0097\u0098\7"+
		"#\2\2\u0098\u009a\5\62\32\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u009d\5\36\20\2\u009c\u009b\3\2\2\2\u009c\u009d\3"+
		"\2\2\2\u009d\u00a0\3\2\2\2\u009e\u00a0\5\22\n\2\u009fu\3\2\2\2\u009f{"+
		"\3\2\2\2\u009f\u0081\3\2\2\2\u009f\u0091\3\2\2\2\u009f\u0096\3\2\2\2\u009f"+
		"\u009e\3\2\2\2\u00a0\21\3\2\2\2\u00a1\u00a2\t\3\2\2\u00a2\23\3\2\2\2\u00a3"+
		"\u00a7\7\13\2\2\u00a4\u00a5\7B\2\2\u00a5\u00a8\5\30\r\2\u00a6\u00a8\5"+
		"\26\f\2\u00a7\u00a4\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00b8\3\2\2\2\u00a9"+
		"\u00aa\7\35\2\2\u00aa\u00b8\t\4\2\2\u00ab\u00ac\7.\2\2\u00ac\u00b1\5\62"+
		"\32\2\u00ad\u00ae\7%\2\2\u00ae\u00b0\5\62\32\2\u00af\u00ad\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\35\2\2\u00b5\u00b6\7B\2\2\u00b6"+
		"\u00b8\3\2\2\2\u00b7\u00a3\3\2\2\2\u00b7\u00a9\3\2\2\2\u00b7\u00ab\3\2"+
		"\2\2\u00b8\25\3\2\2\2\u00b9\u00ba\t\5\2\2\u00ba\27\3\2\2\2\u00bb\u00bc"+
		"\t\6\2\2\u00bc\31\3\2\2\2\u00bd\u00be\b\16\1\2\u00be\u00bf\7 \2\2\u00bf"+
		"\u00ca\5\32\16\2\u00c0\u00c1\7(\2\2\u00c1\u00c2\5\32\16\2\u00c2\u00c3"+
		"\7\23\2\2\u00c3\u00ca\3\2\2\2\u00c4\u00c5\5&\24\2\u00c5\u00c6\5\34\17"+
		"\2\u00c6\u00c7\5&\24\2\u00c7\u00ca\3\2\2\2\u00c8\u00ca\5,\27\2\u00c9\u00bd"+
		"\3\2\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c4\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00d3\3\2\2\2\u00cb\u00cc\6\16\2\3\u00cc\u00cd\7-\2\2\u00cd\u00d2\5\32"+
		"\16\2\u00ce\u00cf\6\16\3\3\u00cf\u00d0\7\6\2\2\u00d0\u00d2\5\32\16\2\u00d1"+
		"\u00cb\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\33\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7"+
		"\t\7\2\2\u00d7\35\3\2\2\2\u00d8\u00dc\5 \21\2\u00d9\u00dc\5\"\22\2\u00da"+
		"\u00dc\5&\24\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2"+
		"\2\2\u00dc\37\3\2\2\2\u00dd\u00de\7\7\2\2\u00de\u00e3\5\36\20\2\u00df"+
		"\u00e0\7%\2\2\u00e0\u00e2\5\36\20\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3"+
		"\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00e7\7\"\2\2\u00e7!\3\2\2\2\u00e8\u00e9\7+\2\2\u00e9"+
		"\u00ee\5$\23\2\u00ea\u00eb\7%\2\2\u00eb\u00ed\5$\23\2\u00ec\u00ea\3\2"+
		"\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\7\16\2\2\u00f2#\3\2\2\2"+
		"\u00f3\u00f4\5\62\32\2\u00f4\u00f5\7\'\2\2\u00f5\u00f6\5\36\20\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f9\5,\27\2\u00f8\u00f3\3\2\2\2\u00f8\u00f7\3\2"+
		"\2\2\u00f9%\3\2\2\2\u00fa\u00fb\b\24\1\2\u00fb\u0106\5,\27\2\u00fc\u0106"+
		"\7B\2\2\u00fd\u0106\t\b\2\2\u00fe\u0106\7@\2\2\u00ff\u0106\7C\2\2\u0100"+
		"\u0101\7(\2\2\u0101\u0102\5&\24\2\u0102\u0103\7\23\2\2\u0103\u0106\3\2"+
		"\2\2\u0104\u0106\5(\25\2\u0105\u00fa\3\2\2\2\u0105\u00fc\3\2\2\2\u0105"+
		"\u00fd\3\2\2\2\u0105\u00fe\3\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0100\3\2"+
		"\2\2\u0105\u0104\3\2\2\2\u0106\u010f\3\2\2\2\u0107\u0108\6\24\4\3\u0108"+
		"\u0109\t\t\2\2\u0109\u010e\5&\24\2\u010a\u010b\6\24\5\3\u010b\u010c\t"+
		"\n\2\2\u010c\u010e\5&\24\2\u010d\u0107\3\2\2\2\u010d\u010a\3\2\2\2\u010e"+
		"\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\'\3\2\2\2"+
		"\u0111\u010f\3\2\2\2\u0112\u0113\5*\26\2\u0113\u0114\7(\2\2\u0114\u0115"+
		"\5\36\20\2\u0115\u0116\7\23\2\2\u0116)\3\2\2\2\u0117\u0118\t\13\2\2\u0118"+
		"+\3\2\2\2\u0119\u011e\5.\30\2\u011a\u011b\7\62\2\2\u011b\u011d\5.\30\2"+
		"\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f-\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0125\5\62\32\2\u0122"+
		"\u0124\5\60\31\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3"+
		"\2\2\2\u0125\u0126\3\2\2\2\u0126/\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012e"+
		"\7\7\2\2\u0129\u012f\7B\2\2\u012a\u012f\7\5\2\2\u012b\u012c\7B\2\2\u012c"+
		"\u012d\7\'\2\2\u012d\u012f\7B\2\2\u012e\u0129\3\2\2\2\u012e\u012a\3\2"+
		"\2\2\u012e\u012b\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7\"\2\2\u0131"+
		"\61\3\2\2\2\u0132\u0152\7\r\2\2\u0133\u0152\7*\2\2\u0134\u0152\7!\2\2"+
		"\u0135\u0152\79\2\2\u0136\u0152\7\3\2\2\u0137\u0152\7$\2\2\u0138\u0152"+
		"\7\36\2\2\u0139\u0152\7\32\2\2\u013a\u0152\7\27\2\2\u013b\u0152\7\37\2"+
		"\2\u013c\u0152\7\66\2\2\u013d\u0152\7\31\2\2\u013e\u0152\7\34\2\2\u013f"+
		"\u0152\7#\2\2\u0140\u0152\7)\2\2\u0141\u0152\7\f\2\2\u0142\u0152\7\13"+
		"\2\2\u0143\u0152\7/\2\2\u0144\u0152\7\35\2\2\u0145\u0152\7\22\2\2\u0146"+
		"\u0152\7\25\2\2\u0147\u0152\7\64\2\2\u0148\u0152\7\26\2\2\u0149\u0152"+
		"\7\33\2\2\u014a\u0152\7,\2\2\u014b\u0152\7\61\2\2\u014c\u0152\7\21\2\2"+
		"\u014d\u0152\7\4\2\2\u014e\u0152\7=\2\2\u014f\u0152\7A\2\2\u0150\u0152"+
		"\7\60\2\2\u0151\u0132\3\2\2\2\u0151\u0133\3\2\2\2\u0151\u0134\3\2\2\2"+
		"\u0151\u0135\3\2\2\2\u0151\u0136\3\2\2\2\u0151\u0137\3\2\2\2\u0151\u0138"+
		"\3\2\2\2\u0151\u0139\3\2\2\2\u0151\u013a\3\2\2\2\u0151\u013b\3\2\2\2\u0151"+
		"\u013c\3\2\2\2\u0151\u013d\3\2\2\2\u0151\u013e\3\2\2\2\u0151\u013f\3\2"+
		"\2\2\u0151\u0140\3\2\2\2\u0151\u0141\3\2\2\2\u0151\u0142\3\2\2\2\u0151"+
		"\u0143\3\2\2\2\u0151\u0144\3\2\2\2\u0151\u0145\3\2\2\2\u0151\u0146\3\2"+
		"\2\2\u0151\u0147\3\2\2\2\u0151\u0148\3\2\2\2\u0151\u0149\3\2\2\2\u0151"+
		"\u014a\3\2\2\2\u0151\u014b\3\2\2\2\u0151\u014c\3\2\2\2\u0151\u014d\3\2"+
		"\2\2\u0151\u014e\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152"+
		"\63\3\2\2\2 \67HWejsx~\u0084\u008c\u0099\u009c\u009f\u00a7\u00b1\u00b7"+
		"\u00c9\u00d1\u00d3\u00db\u00e3\u00ee\u00f8\u0105\u010d\u010f\u011e\u0125"+
		"\u012e\u0151";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}