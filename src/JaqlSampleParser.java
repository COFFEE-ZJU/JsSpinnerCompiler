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
		T__53=1, T__52=2, T__51=3, T__50=4, T__49=5, T__48=6, T__47=7, T__46=8, 
		T__45=9, T__44=10, T__43=11, T__42=12, T__41=13, T__40=14, T__39=15, T__38=16, 
		T__37=17, T__36=18, T__35=19, T__34=20, T__33=21, T__32=22, T__31=23, 
		T__30=24, T__29=25, T__28=26, T__27=27, T__26=28, T__25=29, T__24=30, 
		T__23=31, T__22=32, T__21=33, T__20=34, T__19=35, T__18=36, T__17=37, 
		T__16=38, T__15=39, T__14=40, T__13=41, T__12=42, T__11=43, T__10=44, 
		T__9=45, T__8=46, T__7=47, T__6=48, T__5=49, T__4=50, T__3=51, T__2=52, 
		T__1=53, T__0=54, TRUE=55, FALSE=56, NULL=57, ID=58, INT=59, STRING=60, 
		NEWLINE=61, WS=62;
	public static final String[] tokenNames = {
		"<INVALID>", "'into'", "'min'", "'or'", "'['", "'*'", "'<'", "'!='", "'<='", 
		"'range'", "'by'", "'readFromWrapper'", "'}'", "'\"'", "'max'", "'->'", 
		"')'", "'seconds'", "'hours'", "'group'", "'='", "'dstream'", "'transform'", 
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
		RULE_comprator = 17, RULE_exprs = 18, RULE_var = 19, RULE_varID = 20;
	public static final String[] ruleNames = {
		"prog", "stat", "readStream", "assignView", "join", "joinVar", "joinOut", 
		"pipe", "pipeExpr", "stream", "windowRange", "timeUnit", "aggrExpr", "aggrFunc", 
		"aggrFuncNames", "transExpr", "conditions", "comprator", "exprs", "var", 
		"varID"
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
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42); stat();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 28) | (1L << ID) | (1L << NEWLINE))) != 0) );
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
		public TerminalNode ID() { return getToken(JaqlSampleParser.ID, 0); }
		public AssignViewContext assignView() {
			return getRuleContext(AssignViewContext.class,0);
		}
		public ReadStreamContext readStream() {
			return getRuleContext(ReadStreamContext.class,0);
		}
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
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
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47); pipe();
				setState(48); match(49);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50); join();
				setState(51); match(49);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53); assignView();
				setState(54); match(49);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56); readStream();
				setState(57); match(49);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59); match(ID);
				setState(60); match(49);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(61); match(NEWLINE);
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
		public TerminalNode ID(int i) {
			return getToken(JaqlSampleParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(JaqlSampleParser.ID); }
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
			setState(64); match(ID);
			setState(65); match(20);
			setState(66); match(11);
			setState(67); match(35);
			setState(68); match(13);
			setState(69); match(ID);
			setState(70); match(13);
			setState(71); match(16);
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
		public TerminalNode ID() { return getToken(JaqlSampleParser.ID, 0); }
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
			setState(73); match(ID);
			setState(74); match(20);
			setState(75); pipe();
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
			setState(77); match(28);
			setState(78); joinVar();
			setState(79); match(32);
			setState(80); joinVar();
			setState(81); match(51);
			setState(82); varID();
			setState(83); match(52);
			setState(84); varID();
			setState(85); match(1);
			setState(86); joinOut();
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
		public TerminalNode ID(int i) {
			return getToken(JaqlSampleParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(JaqlSampleParser.ID); }
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
			setState(90);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(88); match(ID);
				setState(89); match(31);
				}
				break;
			}
			setState(92); match(ID);
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
			setState(94); match(39);
			setState(95); varID();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==32) {
				{
				{
				setState(96); match(32);
				setState(97); varID();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103); match(12);
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
		public TerminalNode ID() { return getToken(JaqlSampleParser.ID, 0); }
		public List<PipeExprContext> pipeExpr() {
			return getRuleContexts(PipeExprContext.class);
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
			setState(105); match(ID);
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(106); match(15);
				setState(107); pipeExpr();
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==15 );
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
		public TerminalNode ID(int i) {
			return getToken(JaqlSampleParser.ID, i);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(JaqlSampleParser.ID); }
		public AggrExprContext aggrExpr() {
			return getRuleContext(AggrExprContext.class,0);
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
		public TerminalNode ID() { return getToken(JaqlSampleParser.ID, 0); }
		public FilterLabelContext(PipeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitFilterLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TansformLabelContext extends PipeExprContext {
		public TerminalNode ID() { return getToken(JaqlSampleParser.ID, 0); }
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
			setState(147);
			switch (_input.LA(1)) {
			case 26:
				_localctx = new FilterLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112); match(26);
				setState(115);
				_la = _input.LA(1);
				if (_la==30) {
					{
					setState(113); match(30);
					setState(114); match(ID);
					}
				}

				setState(117); conditions(0);
				}
				break;
			case 22:
				_localctx = new TansformLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118); match(22);
				setState(121);
				_la = _input.LA(1);
				if (_la==30) {
					{
					setState(119); match(30);
					setState(120); match(ID);
					}
				}

				setState(123); transExpr();
				}
				break;
			case 19:
				_localctx = new GroupSingleLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(124); match(19);
				setState(127);
				_la = _input.LA(1);
				if (_la==30) {
					{
					setState(125); ((GroupSingleLabelContext)_localctx).geach = match(30);
					setState(126); match(ID);
					}
				}

				setState(137);
				_la = _input.LA(1);
				if (_la==10) {
					{
					setState(129); ((GroupSingleLabelContext)_localctx).gby = match(10);
					setState(130); match(ID);
					setState(131); match(20);
					setState(132); var();
					setState(135);
					_la = _input.LA(1);
					if (_la==36) {
						{
						setState(133); ((GroupSingleLabelContext)_localctx).gas = match(36);
						setState(134); match(ID);
						}
					}

					}
				}

				setState(139); match(1);
				setState(140); aggrExpr();
				}
				break;
			case 27:
				_localctx = new WindowLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(141); match(27);
				setState(142); match(4);
				setState(143); windowRange();
				setState(144); match(29);
				}
				break;
			case 21:
			case 24:
			case 48:
				_localctx = new StreamLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(146); stream();
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
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 21) | (1L << 24) | (1L << 48))) != 0)) ) {
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
		public TerminalNode ID(int i) {
			return getToken(JaqlSampleParser.ID, i);
		}
		public TerminalNode INT() { return getToken(JaqlSampleParser.INT, 0); }
		public List<TerminalNode> ID() { return getTokens(JaqlSampleParser.ID); }
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
			setState(170);
			switch (_input.LA(1)) {
			case 9:
				_localctx = new WindowTimeLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151); match(9);
				setState(155);
				switch (_input.LA(1)) {
				case INT:
					{
					{
					setState(152); match(INT);
					}
					setState(153); timeUnit();
					}
					break;
				case 42:
					{
					setState(154); match(42);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 25:
				_localctx = new WindowRowLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157); match(25);
				setState(158);
				_la = _input.LA(1);
				if ( !(_la==42 || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 41:
				_localctx = new WindowPartitionLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159); match(41);
				setState(160); match(ID);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==32) {
					{
					{
					setState(161); match(32);
					setState(162); match(ID);
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168); match(25);
				setState(169); match(INT);
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
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 18) | (1L << 23) | (1L << 47))) != 0)) ) {
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
		public TerminalNode ID(int i) {
			return getToken(JaqlSampleParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(JaqlSampleParser.ID); }
		public List<AggrFuncContext> aggrFunc() {
			return getRuleContexts(AggrFuncContext.class);
		}
		public AggrFuncContext aggrFunc(int i) {
			return getRuleContext(AggrFuncContext.class,i);
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
			setState(174); match(39);
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(175); match(ID);
				}
				break;

			case 2:
				{
				{
				setState(176); match(ID);
				setState(177); match(34);
				setState(178); aggrFunc();
				}
				}
				break;
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==32 || _la==ID) {
				{
				setState(186);
				switch (_input.LA(1)) {
				case 32:
					{
					setState(181); match(32);
					setState(182); match(ID);
					}
					break;
				case ID:
					{
					{
					setState(183); match(ID);
					setState(184); match(34);
					setState(185); aggrFunc();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191); match(12);
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
		public TerminalNode ID(int i) {
			return getToken(JaqlSampleParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(JaqlSampleParser.ID); }
		public AggrFuncNamesContext aggrFuncNames() {
			return getRuleContext(AggrFuncNamesContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); aggrFuncNames();
			setState(194); match(35);
			setState(195);
			_la = _input.LA(1);
			if ( !(_la==43 || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(196); match(38);
			setState(197); match(ID);
			setState(198); match(16);
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
			setState(200);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 14) | (1L << 37) | (1L << 44))) != 0)) ) {
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
			setState(202); match(39);
			setState(203); var();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==32) {
				{
				{
				setState(204); match(32);
				setState(205); var();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211); match(12);
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
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new CondCompLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(214); exprs(0);
				setState(215); comprator();
				setState(216); exprs(0);
				}
				break;

			case 2:
				{
				_localctx = new CondVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218); var();
				}
				break;

			case 3:
				{
				_localctx = new CondSubLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219); match(35);
				setState(220); conditions(0);
				setState(221); match(16);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(231);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(225);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(226); match(40);
						setState(227); conditions(6);
						}
						break;

					case 2:
						{
						_localctx = new CondOrLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(228);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(229); match(3);
						setState(230); conditions(5);
						}
						break;
					}
					} 
				}
				setState(235);
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
			setState(236);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 8) | (1L << 50) | (1L << 52) | (1L << 54))) != 0)) ) {
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
		public Token op;
		public TerminalNode INT() { return getToken(JaqlSampleParser.INT, 0); }
		public TerminalNode FALSE() { return getToken(JaqlSampleParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(JaqlSampleParser.TRUE, 0); }
		public List<ExprsContext> exprs() {
			return getRuleContexts(ExprsContext.class);
		}
		public TerminalNode NULL() { return getToken(JaqlSampleParser.NULL, 0); }
		public TerminalNode STRING() { return getToken(JaqlSampleParser.STRING, 0); }
		public ExprsContext exprs(int i) {
			return getRuleContext(ExprsContext.class,i);
		}
		public ExprsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprsContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_exprs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitExprs(this);
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
			setState(247);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(239); match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				{
				setState(240);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case NULL:
				{
				setState(241); match(NULL);
				}
				break;
			case STRING:
				{
				setState(242); match(STRING);
				}
				break;
			case 35:
				{
				setState(243); match(35);
				setState(244); exprs(0);
				setState(245); match(16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(255);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprsContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(249);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(250);
						((ExprsContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==53) ) {
							((ExprsContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(251); exprs(8);
						}
						break;

					case 2:
						{
						_localctx = new ExprsContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(252);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(253);
						((ExprsContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==33 || _la==46) ) {
							((ExprsContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(254); exprs(7);
						}
						break;
					}
					} 
				}
				setState(259);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID(int i) {
			return getToken(JaqlSampleParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(JaqlSampleParser.ID); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			_la = _input.LA(1);
			if ( !(_la==43 || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(263);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(261); match(45);
				setState(262); match(ID);
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
		public TerminalNode ID(int i) {
			return getToken(JaqlSampleParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(JaqlSampleParser.ID); }
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
			setState(265); match(ID);
			}
			setState(268);
			_la = _input.LA(1);
			if (_la==45) {
				{
				setState(266); match(45);
				setState(267); match(ID);
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
		case 2: return 7 >= _localctx._p;

		case 3: return 6 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3@\u0111\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6\2."+
		"\n\2\r\2\16\2/\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3A\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\5\7]\n\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\7\be\n\b\f\b\16\bh\13\b\3\b\3\b\3\t\3\t\3\t\6\to\n\t\r\t"+
		"\16\tp\3\n\3\n\3\n\5\nv\n\n\3\n\3\n\3\n\3\n\5\n|\n\n\3\n\3\n\3\n\3\n\5"+
		"\n\u0082\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008a\n\n\5\n\u008c\n\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0096\n\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f"+
		"\u009e\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a6\n\f\f\f\16\f\u00a9\13\f\3"+
		"\f\3\f\5\f\u00ad\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u00b6\n\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u00bd\n\16\f\16\16\16\u00c0\13\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\7\21\u00d1\n\21\f\21\16\21\u00d4\13\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e2\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u00ea\n\22\f\22\16\22\u00ed\13\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00fa\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u0102\n\24\f\24\16\24\u0105\13\24\3\25\3\25\3\25\5\25\u010a"+
		"\n\25\3\26\3\26\3\26\5\26\u010f\n\26\3\26\2\27\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*\2\f\5\27\27\32\32\62\62\4,,==\5\23\24\31\31\61"+
		"\61\4--<<\6\4\4\20\20\'\'..\6\b\n\64\64\66\6688\39:\4\7\7\67\67\4##\60"+
		"\60\4--<<\u0121\2-\3\2\2\2\4@\3\2\2\2\6B\3\2\2\2\bK\3\2\2\2\nO\3\2\2\2"+
		"\f\\\3\2\2\2\16`\3\2\2\2\20k\3\2\2\2\22\u0095\3\2\2\2\24\u0097\3\2\2\2"+
		"\26\u00ac\3\2\2\2\30\u00ae\3\2\2\2\32\u00b0\3\2\2\2\34\u00c3\3\2\2\2\36"+
		"\u00ca\3\2\2\2 \u00cc\3\2\2\2\"\u00e1\3\2\2\2$\u00ee\3\2\2\2&\u00f9\3"+
		"\2\2\2(\u0106\3\2\2\2*\u010b\3\2\2\2,.\5\4\3\2-,\3\2\2\2./\3\2\2\2/-\3"+
		"\2\2\2/\60\3\2\2\2\60\3\3\2\2\2\61\62\5\20\t\2\62\63\7\63\2\2\63A\3\2"+
		"\2\2\64\65\5\n\6\2\65\66\7\63\2\2\66A\3\2\2\2\678\5\b\5\289\7\63\2\29"+
		"A\3\2\2\2:;\5\6\4\2;<\7\63\2\2<A\3\2\2\2=>\7<\2\2>A\7\63\2\2?A\7?\2\2"+
		"@\61\3\2\2\2@\64\3\2\2\2@\67\3\2\2\2@:\3\2\2\2@=\3\2\2\2@?\3\2\2\2A\5"+
		"\3\2\2\2BC\7<\2\2CD\7\26\2\2DE\7\r\2\2EF\7%\2\2FG\7\17\2\2GH\7<\2\2HI"+
		"\7\17\2\2IJ\7\22\2\2J\7\3\2\2\2KL\7<\2\2LM\7\26\2\2MN\5\20\t\2N\t\3\2"+
		"\2\2OP\7\36\2\2PQ\5\f\7\2QR\7\"\2\2RS\5\f\7\2ST\7\65\2\2TU\5*\26\2UV\7"+
		"\66\2\2VW\5*\26\2WX\7\3\2\2XY\5\16\b\2Y\13\3\2\2\2Z[\7<\2\2[]\7!\2\2\\"+
		"Z\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7<\2\2_\r\3\2\2\2`a\7)\2\2af\5*\26\2"+
		"bc\7\"\2\2ce\5*\26\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2"+
		"hf\3\2\2\2ij\7\16\2\2j\17\3\2\2\2kn\7<\2\2lm\7\21\2\2mo\5\22\n\2nl\3\2"+
		"\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\21\3\2\2\2ru\7\34\2\2st\7 \2\2tv\7"+
		"<\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2w\u0096\5\"\22\2x{\7\30\2\2yz\7 \2"+
		"\2z|\7<\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u0096\5 \21\2~\u0081\7\25\2"+
		"\2\177\u0080\7 \2\2\u0080\u0082\7<\2\2\u0081\177\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u008b\3\2\2\2\u0083\u0084\7\f\2\2\u0084\u0085\7<\2\2\u0085"+
		"\u0086\7\26\2\2\u0086\u0089\5(\25\2\u0087\u0088\7&\2\2\u0088\u008a\7<"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0083\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\3"+
		"\2\2\u008e\u0096\5\32\16\2\u008f\u0090\7\35\2\2\u0090\u0091\7\6\2\2\u0091"+
		"\u0092\5\26\f\2\u0092\u0093\7\37\2\2\u0093\u0096\3\2\2\2\u0094\u0096\5"+
		"\24\13\2\u0095r\3\2\2\2\u0095x\3\2\2\2\u0095~\3\2\2\2\u0095\u008f\3\2"+
		"\2\2\u0095\u0094\3\2\2\2\u0096\23\3\2\2\2\u0097\u0098\t\2\2\2\u0098\25"+
		"\3\2\2\2\u0099\u009d\7\13\2\2\u009a\u009b\7=\2\2\u009b\u009e\5\30\r\2"+
		"\u009c\u009e\7,\2\2\u009d\u009a\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u00ad"+
		"\3\2\2\2\u009f\u00a0\7\33\2\2\u00a0\u00ad\t\3\2\2\u00a1\u00a2\7+\2\2\u00a2"+
		"\u00a7\7<\2\2\u00a3\u00a4\7\"\2\2\u00a4\u00a6\7<\2\2\u00a5\u00a3\3\2\2"+
		"\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7\33\2\2\u00ab\u00ad\7=\2\2\u00ac"+
		"\u0099\3\2\2\2\u00ac\u009f\3\2\2\2\u00ac\u00a1\3\2\2\2\u00ad\27\3\2\2"+
		"\2\u00ae\u00af\t\4\2\2\u00af\31\3\2\2\2\u00b0\u00b5\7)\2\2\u00b1\u00b6"+
		"\7<\2\2\u00b2\u00b3\7<\2\2\u00b3\u00b4\7$\2\2\u00b4\u00b6\5\34\17\2\u00b5"+
		"\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6\u00be\3\2\2\2\u00b7\u00b8\7\""+
		"\2\2\u00b8\u00bd\7<\2\2\u00b9\u00ba\7<\2\2\u00ba\u00bb\7$\2\2\u00bb\u00bd"+
		"\5\34\17\2\u00bc\u00b7\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3\2\2\2"+
		"\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c1\u00c2\7\16\2\2\u00c2\33\3\2\2\2\u00c3\u00c4\5\36\20\2\u00c4"+
		"\u00c5\7%\2\2\u00c5\u00c6\t\5\2\2\u00c6\u00c7\7(\2\2\u00c7\u00c8\7<\2"+
		"\2\u00c8\u00c9\7\22\2\2\u00c9\35\3\2\2\2\u00ca\u00cb\t\6\2\2\u00cb\37"+
		"\3\2\2\2\u00cc\u00cd\7)\2\2\u00cd\u00d2\5(\25\2\u00ce\u00cf\7\"\2\2\u00cf"+
		"\u00d1\5(\25\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d6\7\16\2\2\u00d6!\3\2\2\2\u00d7\u00d8\b\22\1\2\u00d8\u00d9\5&\24"+
		"\2\u00d9\u00da\5$\23\2\u00da\u00db\5&\24\2\u00db\u00e2\3\2\2\2\u00dc\u00e2"+
		"\5(\25\2\u00dd\u00de\7%\2\2\u00de\u00df\5\"\22\2\u00df\u00e0\7\22\2\2"+
		"\u00e0\u00e2\3\2\2\2\u00e1\u00d7\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00dd"+
		"\3\2\2\2\u00e2\u00eb\3\2\2\2\u00e3\u00e4\6\22\2\3\u00e4\u00e5\7*\2\2\u00e5"+
		"\u00ea\5\"\22\2\u00e6\u00e7\6\22\3\3\u00e7\u00e8\7\5\2\2\u00e8\u00ea\5"+
		"\"\22\2\u00e9\u00e3\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec#\3\2\2\2\u00ed\u00eb\3\2\2\2"+
		"\u00ee\u00ef\t\7\2\2\u00ef%\3\2\2\2\u00f0\u00f1\b\24\1\2\u00f1\u00fa\7"+
		"=\2\2\u00f2\u00fa\t\b\2\2\u00f3\u00fa\7;\2\2\u00f4\u00fa\7>\2\2\u00f5"+
		"\u00f6\7%\2\2\u00f6\u00f7\5&\24\2\u00f7\u00f8\7\22\2\2\u00f8\u00fa\3\2"+
		"\2\2\u00f9\u00f0\3\2\2\2\u00f9\u00f2\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9"+
		"\u00f4\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa\u0103\3\2\2\2\u00fb\u00fc\6\24"+
		"\4\3\u00fc\u00fd\t\t\2\2\u00fd\u0102\5&\24\2\u00fe\u00ff\6\24\5\3\u00ff"+
		"\u0100\t\n\2\2\u0100\u0102\5&\24\2\u0101\u00fb\3\2\2\2\u0101\u00fe\3\2"+
		"\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\'\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0109\t\13\2\2\u0107\u0108\7/\2\2"+
		"\u0108\u010a\7<\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a)\3\2"+
		"\2\2\u010b\u010e\7<\2\2\u010c\u010d\7/\2\2\u010d\u010f\7<\2\2\u010e\u010c"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f+\3\2\2\2\34/@\\fpu{\u0081\u0089\u008b"+
		"\u0095\u009d\u00a7\u00ac\u00b5\u00bc\u00be\u00d2\u00e1\u00e9\u00eb\u00f9"+
		"\u0101\u0103\u0109\u010e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}