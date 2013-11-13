// Generated from JaqlSample.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JaqlSampleParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__52=1, T__51=2, T__50=3, T__49=4, T__48=5, T__47=6, T__46=7, T__45=8, 
		T__44=9, T__43=10, T__42=11, T__41=12, T__40=13, T__39=14, T__38=15, T__37=16, 
		T__36=17, T__35=18, T__34=19, T__33=20, T__32=21, T__31=22, T__30=23, 
		T__29=24, T__28=25, T__27=26, T__26=27, T__25=28, T__24=29, T__23=30, 
		T__22=31, T__21=32, T__20=33, T__19=34, T__18=35, T__17=36, T__16=37, 
		T__15=38, T__14=39, T__13=40, T__12=41, T__11=42, T__10=43, T__9=44, T__8=45, 
		T__7=46, T__6=47, T__5=48, T__4=49, T__3=50, T__2=51, T__1=52, T__0=53, 
		TRUE=54, FALSE=55, NULL=56, ID=57, INT=58, STRING=59, NEWLINE=60, WS=61;
	public static final String[] tokenNames = {
		"<INVALID>", "'into'", "'min'", "'*'", "'or'", "'['", "'<'", "'!='", "'<='", 
		"'range'", "'by'", "'readFromWrapper'", "'}'", "'max'", "'->'", "')'", 
		"'seconds'", "'hours'", "'group'", "'='", "'transform'", "'dstream'", 
		"'days'", "'rstream'", "'rows'", "'filter'", "'window'", "'join'", "']'", 
		"'each'", "'in'", "','", "'-'", "':'", "'('", "'as'", "'sum'", "'[*].'", 
		"'{'", "'and'", "'partitioned by'", "'unbounded'", "'$'", "'avg'", "'.'", 
		"'+'", "'minutes'", "'istream'", "';'", "'>'", "'where'", "'=='", "'/'", 
		"'>='", "'true'", "'false'", "'null'", "ID", "INT", "STRING", "NEWLINE", 
		"WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_readStream = 2, RULE_assignView = 3, 
		RULE_join = 4, RULE_joinVar = 5, RULE_joinOut = 6, RULE_pipe = 7, RULE_pipeExpr = 8, 
		RULE_stream = 9, RULE_windowRange = 10, RULE_timeUnit = 11, RULE_aggrExpr = 12, 
		RULE_aggrFunc = 13, RULE_aggrFuncNames = 14, RULE_transExpr = 15, RULE_conditions = 16, 
		RULE_comprator = 17, RULE_exprs = 18, RULE_var = 19, RULE_varID = 20, 
		RULE_identifier = 21;
	public static final String[] ruleNames = {
		"prog", "stat", "readStream", "assignView", "join", "joinVar", "joinOut", 
		"pipe", "pipeExpr", "stream", "windowRange", "timeUnit", "aggrExpr", "aggrFunc", 
		"aggrFuncNames", "transExpr", "conditions", "comprator", "exprs", "var", 
		"varID", "identifier"
	};

	@Override
	public String getGrammarFileName() { return "JaqlSample.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public JaqlSampleParser(TokenStream input) {
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitProg(this);
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
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44); stat();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 30) | (1L << 35) | (1L << 36) | (1L << 41) | (1L << 43) | (1L << 46) | (1L << 47) | (1L << 50) | (1L << ID) | (1L << NEWLINE))) != 0) );
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
		public TerminalNode NEWLINE() { return getToken(JaqlSampleParser.NEWLINE, 0); }
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(65);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49); pipe();
				setState(50); match(48);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52); join();
				setState(53); match(48);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55); assignView();
				setState(56); match(48);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58); readStream();
				setState(59); match(48);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61); identifier();
				setState(62); match(48);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64); match(NEWLINE);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JaqlSampleParser.STRING, 0); }
		public ReadStreamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStream; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitReadStream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStreamContext readStream() throws RecognitionException {
		ReadStreamContext _localctx = new ReadStreamContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_readStream);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); identifier();
			setState(68); match(19);
			setState(69); match(11);
			setState(70); match(34);
			setState(71); match(STRING);
			setState(72); match(15);
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitAssignView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignViewContext assignView() throws RecognitionException {
		AssignViewContext _localctx = new AssignViewContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); identifier();
			setState(75); match(19);
			setState(76); pipe();
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
		public List<VarIDContext> varID() {
			return getRuleContexts(VarIDContext.class);
		}
		public JoinOutContext joinOut() {
			return getRuleContext(JoinOutContext.class,0);
		}
		public VarIDContext varID(int i) {
			return getRuleContext(VarIDContext.class,i);
		}
		public List<JoinVarContext> joinVar() {
			return getRuleContexts(JoinVarContext.class);
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(27);
			setState(79); joinVar();
			setState(80); match(31);
			setState(81); joinVar();
			setState(82); match(50);
			setState(83); varID();
			setState(84); match(51);
			setState(85); varID();
			setState(86); match(1);
			setState(87); joinOut();
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitJoinVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinVarContext joinVar() throws RecognitionException {
		JoinVarContext _localctx = new JoinVarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_joinVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(89); identifier();
				setState(90); match(30);
				}
				break;
			}
			setState(94); identifier();
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

	public static class JoinOutContext extends ParserRuleContext {
		public List<VarIDContext> varID() {
			return getRuleContexts(VarIDContext.class);
		}
		public VarIDContext varID(int i) {
			return getRuleContext(VarIDContext.class,i);
		}
		public JoinOutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinOut; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitJoinOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinOutContext joinOut() throws RecognitionException {
		JoinOutContext _localctx = new JoinOutContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_joinOut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(38);
			setState(97); varID();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==31) {
				{
				{
				setState(98); match(31);
				setState(99); varID();
				}
				}
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(105); match(12);
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitPipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipeContext pipe() throws RecognitionException {
		PipeContext _localctx = new PipeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pipe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); identifier();
			setState(110); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108); match(14);
				setState(109); pipeExpr();
				}
				}
				setState(112); 
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
		public AggrExprContext aggrExpr() {
			return getRuleContext(AggrExprContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public GroupSingleLabelContext(PipeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitGroupSingleLabel(this);
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitWindowLabel(this);
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitFilterLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TansformLabelContext extends PipeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TransExprContext transExpr() {
			return getRuleContext(TransExprContext.class,0);
		}
		public TansformLabelContext(PipeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitTansformLabel(this);
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitStreamLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipeExprContext pipeExpr() throws RecognitionException {
		PipeExprContext _localctx = new PipeExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pipeExpr);
		int _la;
		try {
			setState(149);
			switch (_input.LA(1)) {
			case 25:
				_localctx = new FilterLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114); match(25);
				setState(117);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(115); match(29);
					setState(116); identifier();
					}
					break;
				}
				setState(119); conditions(0);
				}
				break;
			case 20:
				_localctx = new TansformLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120); match(20);
				setState(123);
				_la = _input.LA(1);
				if (_la==29) {
					{
					setState(121); match(29);
					setState(122); identifier();
					}
				}

				setState(125); transExpr();
				}
				break;
			case 18:
				_localctx = new GroupSingleLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126); match(18);
				setState(129);
				_la = _input.LA(1);
				if (_la==29) {
					{
					setState(127); ((GroupSingleLabelContext)_localctx).geach = match(29);
					setState(128); identifier();
					}
				}

				setState(139);
				_la = _input.LA(1);
				if (_la==10) {
					{
					setState(131); ((GroupSingleLabelContext)_localctx).gby = match(10);
					setState(132); identifier();
					setState(133); match(19);
					setState(134); var();
					setState(137);
					_la = _input.LA(1);
					if (_la==35) {
						{
						setState(135); ((GroupSingleLabelContext)_localctx).gas = match(35);
						setState(136); identifier();
						}
					}

					}
				}

				setState(141); match(1);
				setState(142); aggrExpr();
				}
				break;
			case 26:
				_localctx = new WindowLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(143); match(26);
				setState(144); match(5);
				setState(145); windowRange();
				setState(146); match(28);
				}
				break;
			case 21:
			case 23:
			case 47:
				_localctx = new StreamLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(148); stream();
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitStream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StreamContext stream() throws RecognitionException {
		StreamContext _localctx = new StreamContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 21) | (1L << 23) | (1L << 47))) != 0)) ) {
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
		public TerminalNode INT() { return getToken(JaqlSampleParser.INT, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public WindowPartitionLabelContext(WindowRangeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitWindowPartitionLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowRowLabelContext extends WindowRangeContext {
		public TerminalNode INT() { return getToken(JaqlSampleParser.INT, 0); }
		public WindowRowLabelContext(WindowRangeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitWindowRowLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowTimeLabelContext extends WindowRangeContext {
		public TerminalNode INT() { return getToken(JaqlSampleParser.INT, 0); }
		public TimeUnitContext timeUnit() {
			return getRuleContext(TimeUnitContext.class,0);
		}
		public WindowTimeLabelContext(WindowRangeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitWindowTimeLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowRangeContext windowRange() throws RecognitionException {
		WindowRangeContext _localctx = new WindowRangeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_windowRange);
		int _la;
		try {
			setState(173);
			switch (_input.LA(1)) {
			case 9:
				_localctx = new WindowTimeLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153); match(9);
				setState(157);
				switch (_input.LA(1)) {
				case INT:
					{
					{
					setState(154); match(INT);
					}
					setState(155); timeUnit();
					}
					break;
				case 41:
					{
					setState(156); match(41);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 24:
				_localctx = new WindowRowLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159); match(24);
				setState(160);
				_la = _input.LA(1);
				if ( !(_la==41 || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 40:
				_localctx = new WindowPartitionLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161); match(40);
				setState(162); identifier();
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==31) {
					{
					{
					setState(163); match(31);
					setState(164); identifier();
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170); match(24);
				setState(171); match(INT);
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

	public static class TimeUnitContext extends ParserRuleContext {
		public TimeUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitTimeUnit(this);
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
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 17) | (1L << 22) | (1L << 46))) != 0)) ) {
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

	public static class AggrExprContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<AggrFuncContext> aggrFunc() {
			return getRuleContexts(AggrFuncContext.class);
		}
		public AggrFuncContext aggrFunc(int i) {
			return getRuleContext(AggrFuncContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public AggrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggrExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitAggrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggrExprContext aggrExpr() throws RecognitionException {
		AggrExprContext _localctx = new AggrExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aggrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); match(38);
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(178); identifier();
				}
				break;

			case 2:
				{
				{
				setState(179); identifier();
				setState(180); match(33);
				setState(181); aggrFunc();
				}
				}
				break;
			}
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 30) | (1L << 31) | (1L << 35) | (1L << 36) | (1L << 41) | (1L << 43) | (1L << 46) | (1L << 47) | (1L << 50) | (1L << ID))) != 0)) {
				{
				setState(191);
				switch (_input.LA(1)) {
				case 31:
					{
					setState(185); match(31);
					setState(186); identifier();
					}
					break;
				case 1:
				case 2:
				case 9:
				case 10:
				case 11:
				case 13:
				case 16:
				case 17:
				case 18:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 26:
				case 27:
				case 29:
				case 30:
				case 35:
				case 36:
				case 41:
				case 43:
				case 46:
				case 47:
				case 50:
				case ID:
					{
					{
					setState(187); identifier();
					setState(188); match(33);
					setState(189); aggrFunc();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196); match(12);
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

	public static class AggrFuncContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AggrFuncNamesContext aggrFuncNames() {
			return getRuleContext(AggrFuncNamesContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public AggrFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggrFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitAggrFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggrFuncContext aggrFunc() throws RecognitionException {
		AggrFuncContext _localctx = new AggrFuncContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_aggrFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); aggrFuncNames();
			setState(199); match(34);
			setState(202);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 9:
			case 10:
			case 11:
			case 13:
			case 16:
			case 17:
			case 18:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 29:
			case 30:
			case 35:
			case 36:
			case 41:
			case 43:
			case 46:
			case 47:
			case 50:
			case ID:
				{
				setState(200); identifier();
				}
				break;
			case 42:
				{
				setState(201); match(42);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(204); match(37);
			setState(205); identifier();
			setState(206); match(15);
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

	public static class AggrFuncNamesContext extends ParserRuleContext {
		public AggrFuncNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggrFuncNames; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitAggrFuncNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggrFuncNamesContext aggrFuncNames() throws RecognitionException {
		AggrFuncNamesContext _localctx = new AggrFuncNamesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_aggrFuncNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 13) | (1L << 36) | (1L << 43))) != 0)) ) {
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

	public static class TransExprContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TransExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitTransExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransExprContext transExpr() throws RecognitionException {
		TransExprContext _localctx = new TransExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_transExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); match(38);
			setState(211); var();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==31) {
				{
				{
				setState(212); match(31);
				setState(213); var();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(219); match(12);
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitCondCompLabel(this);
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitCondAndLabel(this);
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitCondSubLabel(this);
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitCondOrLabel(this);
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitCondVarLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionsContext _localctx = new ConditionsContext(_ctx, _parentState, _p);
		ConditionsContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, RULE_conditions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new CondCompLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(222); exprs(0);
				setState(223); comprator();
				setState(224); exprs(0);
				}
				break;

			case 2:
				{
				_localctx = new CondVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226); var();
				}
				break;

			case 3:
				{
				_localctx = new CondSubLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227); match(34);
				setState(228); conditions(0);
				setState(229); match(15);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(239);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(233);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(234); match(39);
						setState(235); conditions(6);
						}
						break;

					case 2:
						{
						_localctx = new CondOrLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(236);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(237); match(4);
						setState(238); conditions(5);
						}
						break;
					}
					} 
				}
				setState(243);
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

	public static class CompratorContext extends ParserRuleContext {
		public CompratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comprator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitComprator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompratorContext comprator() throws RecognitionException {
		CompratorContext _localctx = new CompratorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comprator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 8) | (1L << 49) | (1L << 51) | (1L << 53))) != 0)) ) {
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
		public TerminalNode FALSE() { return getToken(JaqlSampleParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(JaqlSampleParser.TRUE, 0); }
		public ExprBoolLabelContext(ExprsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitExprBoolLabel(this);
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitExprVarLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprMulDivLabelContext extends ExprsContext {
		public Token op;
		public List<ExprsContext> exprs() {
			return getRuleContexts(ExprsContext.class);
		}
		public ExprsContext exprs(int i) {
			return getRuleContext(ExprsContext.class,i);
		}
		public ExprMulDivLabelContext(ExprsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitExprMulDivLabel(this);
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitExprSubExprLabel(this);
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitExprAddSubLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprIntLabelContext extends ExprsContext {
		public TerminalNode INT() { return getToken(JaqlSampleParser.INT, 0); }
		public ExprIntLabelContext(ExprsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitExprIntLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStringLabelContext extends ExprsContext {
		public TerminalNode STRING() { return getToken(JaqlSampleParser.STRING, 0); }
		public ExprStringLabelContext(ExprsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitExprStringLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNullLabelContext extends ExprsContext {
		public TerminalNode NULL() { return getToken(JaqlSampleParser.NULL, 0); }
		public ExprNullLabelContext(ExprsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitExprNullLabel(this);
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
			setState(256);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 9:
			case 10:
			case 11:
			case 13:
			case 16:
			case 17:
			case 18:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 29:
			case 30:
			case 35:
			case 36:
			case 41:
			case 42:
			case 43:
			case 46:
			case 47:
			case 50:
			case ID:
				{
				_localctx = new ExprVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(247); var();
				}
				break;
			case INT:
				{
				_localctx = new ExprIntLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(248); match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				{
				_localctx = new ExprBoolLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case NULL:
				{
				_localctx = new ExprNullLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250); match(NULL);
				}
				break;
			case STRING:
				{
				_localctx = new ExprStringLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251); match(STRING);
				}
				break;
			case 34:
				{
				_localctx = new ExprSubExprLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252); match(34);
				setState(253); exprs(0);
				setState(254); match(15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(264);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(258);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(259);
						((ExprMulDivLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==52) ) {
							((ExprMulDivLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(260); exprs(9);
						}
						break;

					case 2:
						{
						_localctx = new ExprAddSubLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(261);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(262);
						((ExprAddSubLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==32 || _la==45) ) {
							((ExprAddSubLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(263); exprs(8);
						}
						break;
					}
					} 
				}
				setState(268);
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

	public static class VarContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 9:
			case 10:
			case 11:
			case 13:
			case 16:
			case 17:
			case 18:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 29:
			case 30:
			case 35:
			case 36:
			case 41:
			case 43:
			case 46:
			case 47:
			case 50:
			case ID:
				{
				setState(269); identifier();
				}
				break;
			case 42:
				{
				setState(270); match(42);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(273); match(44);
				setState(274); identifier();
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

	public static class VarIDContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public VarIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varID; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitVarID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIDContext varID() throws RecognitionException {
		VarIDContext _localctx = new VarIDContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_varID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(277); identifier();
			}
			setState(280);
			_la = _input.LA(1);
			if (_la==44) {
				{
				setState(278); match(44);
				setState(279); identifier();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JaqlSampleParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 16) | (1L << 17) | (1L << 18) | (1L << 20) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 29) | (1L << 30) | (1L << 35) | (1L << 36) | (1L << 41) | (1L << 43) | (1L << 46) | (1L << 47) | (1L << 50) | (1L << ID))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16: return conditions_sempred((ConditionsContext)_localctx, predIndex);

		case 18: return exprs_sempred((ExprsContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean conditions_sempred(ConditionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 5 >= _localctx._p;

		case 1: return 4 >= _localctx._p;
		}
		return true;
	}
	private boolean exprs_sempred(ExprsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return 8 >= _localctx._p;

		case 3: return 7 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3?\u011f\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\3\2\6\2\60\n\2\r\2\16\2\61\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3D\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7_\n"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bg\n\b\f\b\16\bj\13\b\3\b\3\b\3\t\3\t\3\t"+
		"\6\tq\n\t\r\t\16\tr\3\n\3\n\3\n\5\nx\n\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\n"+
		"\3\n\3\n\3\n\5\n\u0084\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008c\n\n\5\n\u008e"+
		"\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0098\n\n\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\5\f\u00a0\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a8\n\f\f\f\16\f\u00ab"+
		"\13\f\3\f\3\f\3\f\5\f\u00b0\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u00ba\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00c2\n\16\f\16\16"+
		"\16\u00c5\13\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00cd\n\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00d9\n\21\f\21\16\21\u00dc"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00ea\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00f2\n\22\f\22\16\22\u00f5"+
		"\13\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0103\n\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u010b\n\24\f\24\16\24\u010e"+
		"\13\24\3\25\3\25\5\25\u0112\n\25\3\25\3\25\5\25\u0116\n\25\3\26\3\26\3"+
		"\26\5\26\u011b\n\26\3\27\3\27\3\27\2\30\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,\2\13\5\27\27\31\31\61\61\4++<<\5\22\23\30\30\60\60\6"+
		"\4\4\17\17&&--\6\b\n\63\63\65\65\67\67\389\4\5\5\66\66\4\"\"//\16\3\4"+
		"\13\r\17\17\22\24\26\35\37 %&++--\60\61\64\64;;\u0131\2/\3\2\2\2\4C\3"+
		"\2\2\2\6E\3\2\2\2\bL\3\2\2\2\nP\3\2\2\2\f^\3\2\2\2\16b\3\2\2\2\20m\3\2"+
		"\2\2\22\u0097\3\2\2\2\24\u0099\3\2\2\2\26\u00af\3\2\2\2\30\u00b1\3\2\2"+
		"\2\32\u00b3\3\2\2\2\34\u00c8\3\2\2\2\36\u00d2\3\2\2\2 \u00d4\3\2\2\2\""+
		"\u00e9\3\2\2\2$\u00f6\3\2\2\2&\u0102\3\2\2\2(\u0111\3\2\2\2*\u0117\3\2"+
		"\2\2,\u011c\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61"+
		"\62\3\2\2\2\62\3\3\2\2\2\63\64\5\20\t\2\64\65\7\62\2\2\65D\3\2\2\2\66"+
		"\67\5\n\6\2\678\7\62\2\28D\3\2\2\29:\5\b\5\2:;\7\62\2\2;D\3\2\2\2<=\5"+
		"\6\4\2=>\7\62\2\2>D\3\2\2\2?@\5,\27\2@A\7\62\2\2AD\3\2\2\2BD\7>\2\2C\63"+
		"\3\2\2\2C\66\3\2\2\2C9\3\2\2\2C<\3\2\2\2C?\3\2\2\2CB\3\2\2\2D\5\3\2\2"+
		"\2EF\5,\27\2FG\7\25\2\2GH\7\r\2\2HI\7$\2\2IJ\7=\2\2JK\7\21\2\2K\7\3\2"+
		"\2\2LM\5,\27\2MN\7\25\2\2NO\5\20\t\2O\t\3\2\2\2PQ\7\35\2\2QR\5\f\7\2R"+
		"S\7!\2\2ST\5\f\7\2TU\7\64\2\2UV\5*\26\2VW\7\65\2\2WX\5*\26\2XY\7\3\2\2"+
		"YZ\5\16\b\2Z\13\3\2\2\2[\\\5,\27\2\\]\7 \2\2]_\3\2\2\2^[\3\2\2\2^_\3\2"+
		"\2\2_`\3\2\2\2`a\5,\27\2a\r\3\2\2\2bc\7(\2\2ch\5*\26\2de\7!\2\2eg\5*\26"+
		"\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2\2\2jh\3\2\2\2kl\7\16"+
		"\2\2l\17\3\2\2\2mp\5,\27\2no\7\20\2\2oq\5\22\n\2pn\3\2\2\2qr\3\2\2\2r"+
		"p\3\2\2\2rs\3\2\2\2s\21\3\2\2\2tw\7\33\2\2uv\7\37\2\2vx\5,\27\2wu\3\2"+
		"\2\2wx\3\2\2\2xy\3\2\2\2y\u0098\5\"\22\2z}\7\26\2\2{|\7\37\2\2|~\5,\27"+
		"\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0098\5 \21\2\u0080\u0083\7\24"+
		"\2\2\u0081\u0082\7\37\2\2\u0082\u0084\5,\27\2\u0083\u0081\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u008d\3\2\2\2\u0085\u0086\7\f\2\2\u0086\u0087\5,"+
		"\27\2\u0087\u0088\7\25\2\2\u0088\u008b\5(\25\2\u0089\u008a\7%\2\2\u008a"+
		"\u008c\5,\27\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2"+
		"\2\2\u008d\u0085\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\7\3\2\2\u0090\u0098\5\32\16\2\u0091\u0092\7\34\2\2\u0092\u0093"+
		"\7\7\2\2\u0093\u0094\5\26\f\2\u0094\u0095\7\36\2\2\u0095\u0098\3\2\2\2"+
		"\u0096\u0098\5\24\13\2\u0097t\3\2\2\2\u0097z\3\2\2\2\u0097\u0080\3\2\2"+
		"\2\u0097\u0091\3\2\2\2\u0097\u0096\3\2\2\2\u0098\23\3\2\2\2\u0099\u009a"+
		"\t\2\2\2\u009a\25\3\2\2\2\u009b\u009f\7\13\2\2\u009c\u009d\7<\2\2\u009d"+
		"\u00a0\5\30\r\2\u009e\u00a0\7+\2\2\u009f\u009c\3\2\2\2\u009f\u009e\3\2"+
		"\2\2\u00a0\u00b0\3\2\2\2\u00a1\u00a2\7\32\2\2\u00a2\u00b0\t\3\2\2\u00a3"+
		"\u00a4\7*\2\2\u00a4\u00a9\5,\27\2\u00a5\u00a6\7!\2\2\u00a6\u00a8\5,\27"+
		"\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7\32\2\2"+
		"\u00ad\u00ae\7<\2\2\u00ae\u00b0\3\2\2\2\u00af\u009b\3\2\2\2\u00af\u00a1"+
		"\3\2\2\2\u00af\u00a3\3\2\2\2\u00b0\27\3\2\2\2\u00b1\u00b2\t\4\2\2\u00b2"+
		"\31\3\2\2\2\u00b3\u00b9\7(\2\2\u00b4\u00ba\5,\27\2\u00b5\u00b6\5,\27\2"+
		"\u00b6\u00b7\7#\2\2\u00b7\u00b8\5\34\17\2\u00b8\u00ba\3\2\2\2\u00b9\u00b4"+
		"\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba\u00c3\3\2\2\2\u00bb\u00bc\7!\2\2\u00bc"+
		"\u00c2\5,\27\2\u00bd\u00be\5,\27\2\u00be\u00bf\7#\2\2\u00bf\u00c0\5\34"+
		"\17\2\u00c0\u00c2\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7\16\2\2\u00c7\33\3\2\2\2\u00c8\u00c9"+
		"\5\36\20\2\u00c9\u00cc\7$\2\2\u00ca\u00cd\5,\27\2\u00cb\u00cd\7,\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\'"+
		"\2\2\u00cf\u00d0\5,\27\2\u00d0\u00d1\7\21\2\2\u00d1\35\3\2\2\2\u00d2\u00d3"+
		"\t\5\2\2\u00d3\37\3\2\2\2\u00d4\u00d5\7(\2\2\u00d5\u00da\5(\25\2\u00d6"+
		"\u00d7\7!\2\2\u00d7\u00d9\5(\25\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\7\16\2\2\u00de!\3\2\2\2\u00df\u00e0\b\22\1"+
		"\2\u00e0\u00e1\5&\24\2\u00e1\u00e2\5$\23\2\u00e2\u00e3\5&\24\2\u00e3\u00ea"+
		"\3\2\2\2\u00e4\u00ea\5(\25\2\u00e5\u00e6\7$\2\2\u00e6\u00e7\5\"\22\2\u00e7"+
		"\u00e8\7\21\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00df\3\2\2\2\u00e9\u00e4\3"+
		"\2\2\2\u00e9\u00e5\3\2\2\2\u00ea\u00f3\3\2\2\2\u00eb\u00ec\6\22\2\3\u00ec"+
		"\u00ed\7)\2\2\u00ed\u00f2\5\"\22\2\u00ee\u00ef\6\22\3\3\u00ef\u00f0\7"+
		"\6\2\2\u00f0\u00f2\5\"\22\2\u00f1\u00eb\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4#\3\2\2\2"+
		"\u00f5\u00f3\3\2\2\2\u00f6\u00f7\t\6\2\2\u00f7%\3\2\2\2\u00f8\u00f9\b"+
		"\24\1\2\u00f9\u0103\5(\25\2\u00fa\u0103\7<\2\2\u00fb\u0103\t\7\2\2\u00fc"+
		"\u0103\7:\2\2\u00fd\u0103\7=\2\2\u00fe\u00ff\7$\2\2\u00ff\u0100\5&\24"+
		"\2\u0100\u0101\7\21\2\2\u0101\u0103\3\2\2\2\u0102\u00f8\3\2\2\2\u0102"+
		"\u00fa\3\2\2\2\u0102\u00fb\3\2\2\2\u0102\u00fc\3\2\2\2\u0102\u00fd\3\2"+
		"\2\2\u0102\u00fe\3\2\2\2\u0103\u010c\3\2\2\2\u0104\u0105\6\24\4\3\u0105"+
		"\u0106\t\b\2\2\u0106\u010b\5&\24\2\u0107\u0108\6\24\5\3\u0108\u0109\t"+
		"\t\2\2\u0109\u010b\5&\24\2\u010a\u0104\3\2\2\2\u010a\u0107\3\2\2\2\u010b"+
		"\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\'\3\2\2\2"+
		"\u010e\u010c\3\2\2\2\u010f\u0112\5,\27\2\u0110\u0112\7,\2\2\u0111\u010f"+
		"\3\2\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0114\7.\2\2\u0114"+
		"\u0116\5,\27\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116)\3\2\2\2"+
		"\u0117\u011a\5,\27\2\u0118\u0119\7.\2\2\u0119\u011b\5,\27\2\u011a\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b+\3\2\2\2\u011c\u011d\t\n\2\2\u011d"+
		"-\3\2\2\2\36\61C^hrw}\u0083\u008b\u008d\u0097\u009f\u00a9\u00af\u00b9"+
		"\u00c1\u00c3\u00cc\u00da\u00e9\u00f1\u00f3\u0102\u010a\u010c\u0111\u0115"+
		"\u011a";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}