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
		T__48=1, T__47=2, T__46=3, T__45=4, T__44=5, T__43=6, T__42=7, T__41=8, 
		T__40=9, T__39=10, T__38=11, T__37=12, T__36=13, T__35=14, T__34=15, T__33=16, 
		T__32=17, T__31=18, T__30=19, T__29=20, T__28=21, T__27=22, T__26=23, 
		T__25=24, T__24=25, T__23=26, T__22=27, T__21=28, T__20=29, T__19=30, 
		T__18=31, T__17=32, T__16=33, T__15=34, T__14=35, T__13=36, T__12=37, 
		T__11=38, T__10=39, T__9=40, T__8=41, T__7=42, T__6=43, T__5=44, T__4=45, 
		T__3=46, T__2=47, T__1=48, T__0=49, ID=50, INT=51, NEWLINE=52, WS=53;
	public static final String[] tokenNames = {
		"<INVALID>", "'into'", "'min'", "'or'", "'['", "'<'", "'!='", "'<='", 
		"'range'", "'by'", "'readFromWrapper'", "'}'", "'\"'", "'max'", "'->'", 
		"')'", "'seconds'", "'hours'", "'group'", "'='", "'dstream'", "'transform'", 
		"'rstream'", "'rows'", "'filter'", "'window'", "'join'", "']'", "'each'", 
		"'in'", "','", "':'", "'('", "'as'", "'sum'", "'[*].'", "'{'", "'and'", 
		"'partitioned by'", "'unbounded'", "'$'", "'avg'", "'.'", "'minutes'", 
		"'istream'", "';'", "'>'", "'where'", "'=='", "'>='", "ID", "INT", "NEWLINE", 
		"WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_readStream = 2, RULE_assignView = 3, 
		RULE_join = 4, RULE_joinVar = 5, RULE_joinOut = 6, RULE_pipe = 7, RULE_pipeExpr = 8, 
		RULE_stream = 9, RULE_windowRange = 10, RULE_timeUnit = 11, RULE_aggrExpr = 12, 
		RULE_aggrFunc = 13, RULE_aggrFuncNames = 14, RULE_transExpr = 15, RULE_conditions = 16, 
		RULE_conditions2 = 17, RULE_condition = 18, RULE_comprator = 19, RULE_var = 20, 
		RULE_varID = 21;
	public static final String[] ruleNames = {
		"prog", "stat", "readStream", "assignView", "join", "joinVar", "joinOut", 
		"pipe", "pipeExpr", "stream", "windowRange", "timeUnit", "aggrExpr", "aggrFunc", 
		"aggrFuncNames", "transExpr", "conditions", "conditions2", "condition", 
		"comprator", "var", "varID"
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 26) | (1L << ID) | (1L << NEWLINE))) != 0) );
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
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49); pipe();
				setState(50); match(45);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52); join();
				setState(53); match(45);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55); assignView();
				setState(56); match(45);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58); readStream();
				setState(59); match(45);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61); match(ID);
				setState(62); match(45);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63); match(NEWLINE);
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
			setState(66); match(ID);
			setState(67); match(19);
			setState(68); match(10);
			setState(69); match(32);
			setState(70); match(12);
			setState(71); match(ID);
			setState(72); match(12);
			setState(73); match(15);
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
			setState(75); match(ID);
			setState(76); match(19);
			setState(77); pipe();
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
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public JoinOutContext joinOut() {
			return getRuleContext(JoinOutContext.class,0);
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
			setState(79); match(26);
			setState(80); joinVar();
			setState(81); match(30);
			setState(82); joinVar();
			setState(83); match(47);
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(84); match(32);
				setState(85); conditions();
				setState(86); match(15);
				}
				break;

			case 2:
				{
				setState(88); conditions();
				}
				break;
			}
			setState(91); match(1);
			setState(92); joinOut();
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
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(94); match(ID);
				setState(95); match(29);
				}
				break;
			}
			setState(98); match(ID);
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
			setState(100); match(36);
			setState(101); varID();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==30) {
				{
				{
				setState(102); match(30);
				setState(103); varID();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109); match(11);
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
			setState(111); match(ID);
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112); match(14);
				setState(113); pipeExpr();
				}
				}
				setState(116); 
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
			setState(153);
			switch (_input.LA(1)) {
			case 24:
				_localctx = new FilterLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118); match(24);
				setState(121);
				_la = _input.LA(1);
				if (_la==28) {
					{
					setState(119); match(28);
					setState(120); match(ID);
					}
				}

				setState(123); conditions();
				}
				break;
			case 21:
				_localctx = new TansformLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124); match(21);
				setState(127);
				_la = _input.LA(1);
				if (_la==28) {
					{
					setState(125); match(28);
					setState(126); match(ID);
					}
				}

				setState(129); transExpr();
				}
				break;
			case 18:
				_localctx = new GroupSingleLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130); match(18);
				setState(133);
				_la = _input.LA(1);
				if (_la==28) {
					{
					setState(131); match(28);
					setState(132); match(ID);
					}
				}

				setState(143);
				_la = _input.LA(1);
				if (_la==9) {
					{
					setState(135); match(9);
					setState(136); match(ID);
					setState(137); match(19);
					setState(138); var();
					setState(141);
					_la = _input.LA(1);
					if (_la==33) {
						{
						setState(139); match(33);
						setState(140); match(ID);
						}
					}

					}
				}

				setState(145); match(1);
				setState(146); aggrExpr();
				}
				break;
			case 25:
				_localctx = new WindowLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(147); match(25);
				setState(148); match(4);
				setState(149); windowRange();
				setState(150); match(27);
				}
				break;
			case 20:
			case 22:
			case 44:
				_localctx = new StreamLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(152); stream();
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
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 20) | (1L << 22) | (1L << 44))) != 0)) ) {
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
			setState(176);
			switch (_input.LA(1)) {
			case 8:
				_localctx = new WindowTimeLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157); match(8);
				setState(161);
				switch (_input.LA(1)) {
				case INT:
					{
					{
					setState(158); match(INT);
					}
					setState(159); timeUnit();
					}
					break;
				case 39:
					{
					setState(160); match(39);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 23:
				_localctx = new WindowRowLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(163); match(23);
				setState(164);
				_la = _input.LA(1);
				if ( !(_la==39 || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 38:
				_localctx = new WindowPartitionLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(165); match(38);
				setState(166); match(ID);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==30) {
					{
					{
					setState(167); match(30);
					setState(168); match(ID);
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174); match(23);
				setState(175); match(INT);
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
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 17) | (1L << 43))) != 0)) ) {
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
			setState(180); match(36);
			setState(185);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(181); match(ID);
				}
				break;

			case 2:
				{
				{
				setState(182); match(ID);
				setState(183); match(31);
				setState(184); aggrFunc();
				}
				}
				break;
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==30 || _la==ID) {
				{
				setState(192);
				switch (_input.LA(1)) {
				case 30:
					{
					setState(187); match(30);
					setState(188); match(ID);
					}
					break;
				case ID:
					{
					{
					setState(189); match(ID);
					setState(190); match(31);
					setState(191); aggrFunc();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197); match(11);
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
			setState(199); aggrFuncNames();
			setState(200); match(32);
			setState(201);
			_la = _input.LA(1);
			if ( !(_la==40 || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(202); match(35);
			setState(203); match(ID);
			setState(204); match(15);
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
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 13) | (1L << 34) | (1L << 41))) != 0)) ) {
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
			setState(208); match(36);
			setState(209); var();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==30) {
				{
				{
				setState(210); match(30);
				setState(211); var();
				}
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(217); match(11);
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
		public List<Conditions2Context> conditions2() {
			return getRuleContexts(Conditions2Context.class);
		}
		public Conditions2Context conditions2(int i) {
			return getRuleContext(Conditions2Context.class,i);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); conditions2();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(220); match(3);
				setState(221); conditions2();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Conditions2Context extends ParserRuleContext {
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public Conditions2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions2; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitConditions2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditions2Context conditions2() throws RecognitionException {
		Conditions2Context _localctx = new Conditions2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_conditions2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); condition();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==37) {
				{
				{
				setState(228); match(37);
				setState(229); condition();
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public CompratorContext comprator() {
			return getRuleContext(CompratorContext.class,0);
		}
		public TerminalNode INT() { return getToken(JaqlSampleParser.INT, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		try {
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235); match(32);
				setState(236); conditions();
				setState(237); match(15);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239); var();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240); var();
				setState(241); comprator();
				setState(244);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(242); match(INT);
					}
					break;
				case 40:
				case ID:
					{
					setState(243); var();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
		enterRule(_localctx, 38, RULE_comprator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 6) | (1L << 7) | (1L << 46) | (1L << 48) | (1L << 49))) != 0)) ) {
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
		enterRule(_localctx, 40, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !(_la==40 || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(253);
			_la = _input.LA(1);
			if (_la==42) {
				{
				setState(251); match(42);
				setState(252); match(ID);
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
		enterRule(_localctx, 42, RULE_varID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(255); match(ID);
			}
			setState(258);
			_la = _input.LA(1);
			if (_la==42) {
				{
				setState(256); match(42);
				setState(257); match(ID);
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

	public static final String _serializedATN =
		"\2\3\67\u0107\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t"+
		"\27\3\2\6\2\60\n\2\r\2\16\2\61\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3C\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\6\3\6"+
		"\3\6\3\7\3\7\5\7c\n\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b"+
		"\3\b\3\b\3\t\3\t\3\t\6\tu\n\t\r\t\16\tv\3\n\3\n\3\n\5\n|\n\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0082\n\n\3\n\3\n\3\n\3\n\5\n\u0088\n\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0090\n\n\5\n\u0092\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009c"+
		"\n\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00a4\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00ac\n\f\f\f\16\f\u00af\13\f\3\f\3\f\5\f\u00b3\n\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\5\16\u00bc\n\16\3\16\3\16\3\16\3\16\3\16\7\16\u00c3"+
		"\n\16\f\16\16\16\u00c6\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00d7\n\21\f\21\16\21\u00da\13"+
		"\21\3\21\3\21\3\22\3\22\3\22\7\22\u00e1\n\22\f\22\16\22\u00e4\13\22\3"+
		"\23\3\23\3\23\7\23\u00e9\n\23\f\23\16\23\u00ec\13\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f7\n\24\5\24\u00f9\n\24\3\25\3\25"+
		"\3\26\3\26\3\26\5\26\u0100\n\26\3\27\3\27\3\27\5\27\u0105\n\27\3\27\2"+
		"\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\t\5\26\26\30\30."+
		".\4))\65\65\4\22\23--\4**\64\64\6\4\4\17\17$$++\5\7\t\60\60\62\63\4**"+
		"\64\64\u0112\2/\3\2\2\2\4B\3\2\2\2\6D\3\2\2\2\bM\3\2\2\2\nQ\3\2\2\2\f"+
		"b\3\2\2\2\16f\3\2\2\2\20q\3\2\2\2\22\u009b\3\2\2\2\24\u009d\3\2\2\2\26"+
		"\u00b2\3\2\2\2\30\u00b4\3\2\2\2\32\u00b6\3\2\2\2\34\u00c9\3\2\2\2\36\u00d0"+
		"\3\2\2\2 \u00d2\3\2\2\2\"\u00dd\3\2\2\2$\u00e5\3\2\2\2&\u00f8\3\2\2\2"+
		"(\u00fa\3\2\2\2*\u00fc\3\2\2\2,\u0101\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60"+
		"\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\64\5\20\t\2\64\65"+
		"\7/\2\2\65C\3\2\2\2\66\67\5\n\6\2\678\7/\2\28C\3\2\2\29:\5\b\5\2:;\7/"+
		"\2\2;C\3\2\2\2<=\5\6\4\2=>\7/\2\2>C\3\2\2\2?@\7\64\2\2@C\7/\2\2AC\7\66"+
		"\2\2B\63\3\2\2\2B\66\3\2\2\2B9\3\2\2\2B<\3\2\2\2B?\3\2\2\2BA\3\2\2\2C"+
		"\5\3\2\2\2DE\7\64\2\2EF\7\25\2\2FG\7\f\2\2GH\7\"\2\2HI\7\16\2\2IJ\7\64"+
		"\2\2JK\7\16\2\2KL\7\21\2\2L\7\3\2\2\2MN\7\64\2\2NO\7\25\2\2OP\5\20\t\2"+
		"P\t\3\2\2\2QR\7\34\2\2RS\5\f\7\2ST\7 \2\2TU\5\f\7\2U[\7\61\2\2VW\7\"\2"+
		"\2WX\5\"\22\2XY\7\21\2\2Y\\\3\2\2\2Z\\\5\"\22\2[V\3\2\2\2[Z\3\2\2\2\\"+
		"]\3\2\2\2]^\7\3\2\2^_\5\16\b\2_\13\3\2\2\2`a\7\64\2\2ac\7\37\2\2b`\3\2"+
		"\2\2bc\3\2\2\2cd\3\2\2\2de\7\64\2\2e\r\3\2\2\2fg\7&\2\2gl\5,\27\2hi\7"+
		" \2\2ik\5,\27\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3"+
		"\2\2\2op\7\r\2\2p\17\3\2\2\2qt\7\64\2\2rs\7\20\2\2su\5\22\n\2tr\3\2\2"+
		"\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\21\3\2\2\2x{\7\32\2\2yz\7\36\2\2z|\7"+
		"\64\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}\u009c\5\"\22\2~\u0081\7\27\2\2"+
		"\177\u0080\7\36\2\2\u0080\u0082\7\64\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u009c\5 \21\2\u0084\u0087\7\24\2\2"+
		"\u0085\u0086\7\36\2\2\u0086\u0088\7\64\2\2\u0087\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0091\3\2\2\2\u0089\u008a\7\13\2\2\u008a\u008b\7\64\2\2"+
		"\u008b\u008c\7\25\2\2\u008c\u008f\5*\26\2\u008d\u008e\7#\2\2\u008e\u0090"+
		"\7\64\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2"+
		"\u0091\u0089\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094"+
		"\7\3\2\2\u0094\u009c\5\32\16\2\u0095\u0096\7\33\2\2\u0096\u0097\7\6\2"+
		"\2\u0097\u0098\5\26\f\2\u0098\u0099\7\35\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u009c\5\24\13\2\u009bx\3\2\2\2\u009b~\3\2\2\2\u009b\u0084\3\2\2\2\u009b"+
		"\u0095\3\2\2\2\u009b\u009a\3\2\2\2\u009c\23\3\2\2\2\u009d\u009e\t\2\2"+
		"\2\u009e\25\3\2\2\2\u009f\u00a3\7\n\2\2\u00a0\u00a1\7\65\2\2\u00a1\u00a4"+
		"\5\30\r\2\u00a2\u00a4\7)\2\2\u00a3\u00a0\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\u00b3\3\2\2\2\u00a5\u00a6\7\31\2\2\u00a6\u00b3\t\3\2\2\u00a7\u00a8\7"+
		"(\2\2\u00a8\u00ad\7\64\2\2\u00a9\u00aa\7 \2\2\u00aa\u00ac\7\64\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\31\2\2\u00b1"+
		"\u00b3\7\65\2\2\u00b2\u009f\3\2\2\2\u00b2\u00a5\3\2\2\2\u00b2\u00a7\3"+
		"\2\2\2\u00b3\27\3\2\2\2\u00b4\u00b5\t\4\2\2\u00b5\31\3\2\2\2\u00b6\u00bb"+
		"\7&\2\2\u00b7\u00bc\7\64\2\2\u00b8\u00b9\7\64\2\2\u00b9\u00ba\7!\2\2\u00ba"+
		"\u00bc\5\34\17\2\u00bb\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bc\u00c4\3"+
		"\2\2\2\u00bd\u00be\7 \2\2\u00be\u00c3\7\64\2\2\u00bf\u00c0\7\64\2\2\u00c0"+
		"\u00c1\7!\2\2\u00c1\u00c3\5\34\17\2\u00c2\u00bd\3\2\2\2\u00c2\u00bf\3"+
		"\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7\r\2\2\u00c8\33\3\2\2"+
		"\2\u00c9\u00ca\5\36\20\2\u00ca\u00cb\7\"\2\2\u00cb\u00cc\t\5\2\2\u00cc"+
		"\u00cd\7%\2\2\u00cd\u00ce\7\64\2\2\u00ce\u00cf\7\21\2\2\u00cf\35\3\2\2"+
		"\2\u00d0\u00d1\t\6\2\2\u00d1\37\3\2\2\2\u00d2\u00d3\7&\2\2\u00d3\u00d8"+
		"\5*\26\2\u00d4\u00d5\7 \2\2\u00d5\u00d7\5*\26\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7\r\2\2\u00dc!\3\2\2\2\u00dd\u00e2"+
		"\5$\23\2\u00de\u00df\7\5\2\2\u00df\u00e1\5$\23\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3#\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e5\u00ea\5&\24\2\u00e6\u00e7\7\'\2\2\u00e7\u00e9"+
		"\5&\24\2\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb%\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ee\7\"\2\2"+
		"\u00ee\u00ef\5\"\22\2\u00ef\u00f0\7\21\2\2\u00f0\u00f9\3\2\2\2\u00f1\u00f9"+
		"\5*\26\2\u00f2\u00f3\5*\26\2\u00f3\u00f6\5(\25\2\u00f4\u00f7\7\65\2\2"+
		"\u00f5\u00f7\5*\26\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f9"+
		"\3\2\2\2\u00f8\u00ed\3\2\2\2\u00f8\u00f1\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f9"+
		"\'\3\2\2\2\u00fa\u00fb\t\7\2\2\u00fb)\3\2\2\2\u00fc\u00ff\t\b\2\2\u00fd"+
		"\u00fe\7,\2\2\u00fe\u0100\7\64\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100+\3\2\2\2\u0101\u0104\7\64\2\2\u0102\u0103\7,\2\2\u0103\u0105"+
		"\7\64\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105-\3\2\2\2\33\61"+
		"B[blv{\u0081\u0087\u008f\u0091\u009b\u00a3\u00ad\u00b2\u00bb\u00c2\u00c4"+
		"\u00d8\u00e2\u00ea\u00f6\u00f8\u00ff\u0104";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}