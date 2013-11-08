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
		RULE_stream = 9, RULE_windowRange = 10, RULE_aggrExpr = 11, RULE_aggrFunc = 12, 
		RULE_aggrFuncNames = 13, RULE_transExpr = 14, RULE_conditions = 15, RULE_conditions2 = 16, 
		RULE_condition = 17, RULE_comprator = 18, RULE_var = 19, RULE_varID = 20;
	public static final String[] ruleNames = {
		"prog", "stat", "readStream", "assignView", "join", "joinVar", "joinOut", 
		"pipe", "pipeExpr", "stream", "windowRange", "aggrExpr", "aggrFunc", "aggrFuncNames", 
		"transExpr", "conditions", "conditions2", "condition", "comprator", "var", 
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
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47); pipe();
				setState(48); match(45);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50); join();
				setState(51); match(45);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53); assignView();
				setState(54); match(45);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56); readStream();
				setState(57); match(45);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59); match(ID);
				setState(60); match(45);
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
			setState(65); match(19);
			setState(66); match(10);
			setState(67); match(32);
			setState(68); match(12);
			setState(69); match(ID);
			setState(70); match(12);
			setState(71); match(15);
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
			setState(74); match(19);
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
			setState(77); match(26);
			setState(78); joinVar();
			setState(79); match(30);
			setState(80); joinVar();
			setState(81); match(47);
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(82); match(32);
				setState(83); conditions();
				setState(84); match(15);
				}
				break;

			case 2:
				{
				setState(86); conditions();
				}
				break;
			}
			setState(89); match(1);
			setState(90); joinOut();
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
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(92); match(ID);
				setState(93); match(29);
				}
				break;
			}
			setState(96); match(ID);
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
			setState(98); match(36);
			setState(99); varID();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==30) {
				{
				{
				setState(100); match(30);
				setState(101); varID();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107); match(11);
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
			setState(109); match(ID);
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
			setState(151);
			switch (_input.LA(1)) {
			case 24:
				_localctx = new FilterLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116); match(24);
				setState(119);
				_la = _input.LA(1);
				if (_la==28) {
					{
					setState(117); match(28);
					setState(118); match(ID);
					}
				}

				setState(121); conditions();
				}
				break;
			case 21:
				_localctx = new TansformLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122); match(21);
				setState(125);
				_la = _input.LA(1);
				if (_la==28) {
					{
					setState(123); match(28);
					setState(124); match(ID);
					}
				}

				setState(127); transExpr();
				}
				break;
			case 18:
				_localctx = new GroupSingleLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(128); match(18);
				setState(131);
				_la = _input.LA(1);
				if (_la==28) {
					{
					setState(129); match(28);
					setState(130); match(ID);
					}
				}

				setState(141);
				_la = _input.LA(1);
				if (_la==9) {
					{
					setState(133); match(9);
					setState(134); match(ID);
					setState(135); match(19);
					setState(136); var();
					setState(139);
					_la = _input.LA(1);
					if (_la==33) {
						{
						setState(137); match(33);
						setState(138); match(ID);
						}
					}

					}
				}

				setState(143); match(1);
				setState(144); aggrExpr();
				}
				break;
			case 25:
				_localctx = new WindowLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(145); match(25);
				setState(146); match(4);
				setState(147); windowRange();
				setState(148); match(27);
				}
				break;
			case 20:
			case 22:
			case 44:
				_localctx = new StreamLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(150); stream();
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
			setState(153);
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
			setState(174);
			switch (_input.LA(1)) {
			case 8:
				_localctx = new WindowTimeLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155); match(8);
				setState(159);
				switch (_input.LA(1)) {
				case INT:
					{
					{
					setState(156); match(INT);
					setState(157);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 17) | (1L << 43))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					break;
				case 39:
					{
					setState(158); match(39);
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
				setState(161); match(23);
				setState(162);
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
				setState(163); match(38);
				setState(164); match(ID);
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==30) {
					{
					{
					setState(165); match(30);
					setState(166); match(ID);
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(172); match(23);
				setState(173); match(INT);
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
		enterRule(_localctx, 22, RULE_aggrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(36);
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(177); match(ID);
				}
				break;

			case 2:
				{
				{
				setState(178); match(ID);
				setState(179); match(31);
				setState(180); aggrFunc();
				}
				}
				break;
			}
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==30 || _la==ID) {
				{
				setState(188);
				switch (_input.LA(1)) {
				case 30:
					{
					setState(183); match(30);
					setState(184); match(ID);
					}
					break;
				case ID:
					{
					{
					setState(185); match(ID);
					setState(186); match(31);
					setState(187); aggrFunc();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193); match(11);
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
		enterRule(_localctx, 24, RULE_aggrFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); aggrFuncNames();
			setState(196); match(32);
			setState(197);
			_la = _input.LA(1);
			if ( !(_la==40 || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(198); match(35);
			setState(199); match(ID);
			setState(200); match(15);
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
		enterRule(_localctx, 26, RULE_aggrFuncNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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
		enterRule(_localctx, 28, RULE_transExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(36);
			setState(205); var();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==30) {
				{
				{
				setState(206); match(30);
				setState(207); var();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213); match(11);
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
		enterRule(_localctx, 30, RULE_conditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); conditions2();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(216); match(3);
				setState(217); conditions2();
				}
				}
				setState(222);
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
		enterRule(_localctx, 32, RULE_conditions2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223); condition();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==37) {
				{
				{
				setState(224); match(37);
				setState(225); condition();
				}
				}
				setState(230);
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
		enterRule(_localctx, 34, RULE_condition);
		try {
			setState(242);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(231); match(32);
				setState(232); conditions();
				setState(233); match(15);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235); var();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236); var();
				setState(237); comprator();
				setState(240);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(238); match(INT);
					}
					break;
				case 40:
				case ID:
					{
					setState(239); var();
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
		enterRule(_localctx, 36, RULE_comprator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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
		enterRule(_localctx, 38, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !(_la==40 || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(249);
			_la = _input.LA(1);
			if (_la==42) {
				{
				setState(247); match(42);
				setState(248); match(ID);
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
		enterRule(_localctx, 40, RULE_varID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(251); match(ID);
			}
			setState(254);
			_la = _input.LA(1);
			if (_la==42) {
				{
				setState(252); match(42);
				setState(253); match(ID);
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
		"\2\3\67\u0103\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\6"+
		"\2.\n\2\r\2\16\2/\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3A\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Z\n\6\3\6\3\6\3\6\3\7\3\7"+
		"\5\7a\n\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bi\n\b\f\b\16\bl\13\b\3\b\3\b\3\t"+
		"\3\t\3\t\6\ts\n\t\r\t\16\tt\3\n\3\n\3\n\5\nz\n\n\3\n\3\n\3\n\3\n\5\n\u0080"+
		"\n\n\3\n\3\n\3\n\3\n\5\n\u0086\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008e\n"+
		"\n\5\n\u0090\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009a\n\n\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\5\f\u00a2\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00aa\n"+
		"\f\f\f\16\f\u00ad\13\f\3\f\3\f\5\f\u00b1\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00b8"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u00bf\n\r\f\r\16\r\u00c2\13\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00d3"+
		"\n\20\f\20\16\20\u00d6\13\20\3\20\3\20\3\21\3\21\3\21\7\21\u00dd\n\21"+
		"\f\21\16\21\u00e0\13\21\3\22\3\22\3\22\7\22\u00e5\n\22\f\22\16\22\u00e8"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f3\n\23\5"+
		"\23\u00f5\n\23\3\24\3\24\3\25\3\25\3\25\5\25\u00fc\n\25\3\26\3\26\3\26"+
		"\5\26\u0101\n\26\3\26\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*\2\t\5\26\26\30\30..\4\22\23--\4))\65\65\4**\64\64\6\4\4\17\17$$++"+
		"\5\7\t\60\60\62\63\4**\64\64\u010f\2-\3\2\2\2\4@\3\2\2\2\6B\3\2\2\2\b"+
		"K\3\2\2\2\nO\3\2\2\2\f`\3\2\2\2\16d\3\2\2\2\20o\3\2\2\2\22\u0099\3\2\2"+
		"\2\24\u009b\3\2\2\2\26\u00b0\3\2\2\2\30\u00b2\3\2\2\2\32\u00c5\3\2\2\2"+
		"\34\u00cc\3\2\2\2\36\u00ce\3\2\2\2 \u00d9\3\2\2\2\"\u00e1\3\2\2\2$\u00f4"+
		"\3\2\2\2&\u00f6\3\2\2\2(\u00f8\3\2\2\2*\u00fd\3\2\2\2,.\5\4\3\2-,\3\2"+
		"\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\3\3\2\2\2\61\62\5\20\t\2\62\63"+
		"\7/\2\2\63A\3\2\2\2\64\65\5\n\6\2\65\66\7/\2\2\66A\3\2\2\2\678\5\b\5\2"+
		"89\7/\2\29A\3\2\2\2:;\5\6\4\2;<\7/\2\2<A\3\2\2\2=>\7\64\2\2>A\7/\2\2?"+
		"A\7\66\2\2@\61\3\2\2\2@\64\3\2\2\2@\67\3\2\2\2@:\3\2\2\2@=\3\2\2\2@?\3"+
		"\2\2\2A\5\3\2\2\2BC\7\64\2\2CD\7\25\2\2DE\7\f\2\2EF\7\"\2\2FG\7\16\2\2"+
		"GH\7\64\2\2HI\7\16\2\2IJ\7\21\2\2J\7\3\2\2\2KL\7\64\2\2LM\7\25\2\2MN\5"+
		"\20\t\2N\t\3\2\2\2OP\7\34\2\2PQ\5\f\7\2QR\7 \2\2RS\5\f\7\2SY\7\61\2\2"+
		"TU\7\"\2\2UV\5 \21\2VW\7\21\2\2WZ\3\2\2\2XZ\5 \21\2YT\3\2\2\2YX\3\2\2"+
		"\2Z[\3\2\2\2[\\\7\3\2\2\\]\5\16\b\2]\13\3\2\2\2^_\7\64\2\2_a\7\37\2\2"+
		"`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\64\2\2c\r\3\2\2\2de\7&\2\2ej\5*\26"+
		"\2fg\7 \2\2gi\5*\26\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2"+
		"\2lj\3\2\2\2mn\7\r\2\2n\17\3\2\2\2or\7\64\2\2pq\7\20\2\2qs\5\22\n\2rp"+
		"\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\21\3\2\2\2vy\7\32\2\2wx\7\36\2"+
		"\2xz\7\64\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{\u009a\5 \21\2|\177\7\27\2"+
		"\2}~\7\36\2\2~\u0080\7\64\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u009a\5\36\20\2\u0082\u0085\7\24\2\2\u0083\u0084\7\36\2"+
		"\2\u0084\u0086\7\64\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u008f\3\2\2\2\u0087\u0088\7\13\2\2\u0088\u0089\7\64\2\2\u0089\u008a\7"+
		"\25\2\2\u008a\u008d\5(\25\2\u008b\u008c\7#\2\2\u008c\u008e\7\64\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u0087\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7\3\2\2\u0092"+
		"\u009a\5\30\r\2\u0093\u0094\7\33\2\2\u0094\u0095\7\6\2\2\u0095\u0096\5"+
		"\26\f\2\u0096\u0097\7\35\2\2\u0097\u009a\3\2\2\2\u0098\u009a\5\24\13\2"+
		"\u0099v\3\2\2\2\u0099|\3\2\2\2\u0099\u0082\3\2\2\2\u0099\u0093\3\2\2\2"+
		"\u0099\u0098\3\2\2\2\u009a\23\3\2\2\2\u009b\u009c\t\2\2\2\u009c\25\3\2"+
		"\2\2\u009d\u00a1\7\n\2\2\u009e\u009f\7\65\2\2\u009f\u00a2\t\3\2\2\u00a0"+
		"\u00a2\7)\2\2\u00a1\u009e\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00b1\3\2"+
		"\2\2\u00a3\u00a4\7\31\2\2\u00a4\u00b1\t\4\2\2\u00a5\u00a6\7(\2\2\u00a6"+
		"\u00ab\7\64\2\2\u00a7\u00a8\7 \2\2\u00a8\u00aa\7\64\2\2\u00a9\u00a7\3"+
		"\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af\7\31\2\2\u00af\u00b1\7"+
		"\65\2\2\u00b0\u009d\3\2\2\2\u00b0\u00a3\3\2\2\2\u00b0\u00a5\3\2\2\2\u00b1"+
		"\27\3\2\2\2\u00b2\u00b7\7&\2\2\u00b3\u00b8\7\64\2\2\u00b4\u00b5\7\64\2"+
		"\2\u00b5\u00b6\7!\2\2\u00b6\u00b8\5\32\16\2\u00b7\u00b3\3\2\2\2\u00b7"+
		"\u00b4\3\2\2\2\u00b8\u00c0\3\2\2\2\u00b9\u00ba\7 \2\2\u00ba\u00bf\7\64"+
		"\2\2\u00bb\u00bc\7\64\2\2\u00bc\u00bd\7!\2\2\u00bd\u00bf\5\32\16\2\u00be"+
		"\u00b9\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c4\7\r\2\2\u00c4\31\3\2\2\2\u00c5\u00c6\5\34\17\2\u00c6\u00c7\7\""+
		"\2\2\u00c7\u00c8\t\5\2\2\u00c8\u00c9\7%\2\2\u00c9\u00ca\7\64\2\2\u00ca"+
		"\u00cb\7\21\2\2\u00cb\33\3\2\2\2\u00cc\u00cd\t\6\2\2\u00cd\35\3\2\2\2"+
		"\u00ce\u00cf\7&\2\2\u00cf\u00d4\5(\25\2\u00d0\u00d1\7 \2\2\u00d1\u00d3"+
		"\5(\25\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\r"+
		"\2\2\u00d8\37\3\2\2\2\u00d9\u00de\5\"\22\2\u00da\u00db\7\5\2\2\u00db\u00dd"+
		"\5\"\22\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2"+
		"\u00de\u00df\3\2\2\2\u00df!\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e6\5"+
		"$\23\2\u00e2\u00e3\7\'\2\2\u00e3\u00e5\5$\23\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7#\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\"\2\2\u00ea\u00eb\5 \21\2\u00eb\u00ec"+
		"\7\21\2\2\u00ec\u00f5\3\2\2\2\u00ed\u00f5\5(\25\2\u00ee\u00ef\5(\25\2"+
		"\u00ef\u00f2\5&\24\2\u00f0\u00f3\7\65\2\2\u00f1\u00f3\5(\25\2\u00f2\u00f0"+
		"\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00e9\3\2\2\2\u00f4"+
		"\u00ed\3\2\2\2\u00f4\u00ee\3\2\2\2\u00f5%\3\2\2\2\u00f6\u00f7\t\7\2\2"+
		"\u00f7\'\3\2\2\2\u00f8\u00fb\t\b\2\2\u00f9\u00fa\7,\2\2\u00fa\u00fc\7"+
		"\64\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc)\3\2\2\2\u00fd\u0100"+
		"\7\64\2\2\u00fe\u00ff\7,\2\2\u00ff\u0101\7\64\2\2\u0100\u00fe\3\2\2\2"+
		"\u0100\u0101\3\2\2\2\u0101+\3\2\2\2\33/@Y`jty\177\u0085\u008d\u008f\u0099"+
		"\u00a1\u00ab\u00b0\u00b7\u00be\u00c0\u00d4\u00de\u00e6\u00f2\u00f4\u00fb"+
		"\u0100";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}