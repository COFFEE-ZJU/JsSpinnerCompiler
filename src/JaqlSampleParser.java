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
		T__55=1, T__54=2, T__53=3, T__52=4, T__51=5, T__50=6, T__49=7, T__48=8, 
		T__47=9, T__46=10, T__45=11, T__44=12, T__43=13, T__42=14, T__41=15, T__40=16, 
		T__39=17, T__38=18, T__37=19, T__36=20, T__35=21, T__34=22, T__33=23, 
		T__32=24, T__31=25, T__30=26, T__29=27, T__28=28, T__27=29, T__26=30, 
		T__25=31, T__24=32, T__23=33, T__22=34, T__21=35, T__20=36, T__19=37, 
		T__18=38, T__17=39, T__16=40, T__15=41, T__14=42, T__13=43, T__12=44, 
		T__11=45, T__10=46, T__9=47, T__8=48, T__7=49, T__6=50, T__5=51, T__4=52, 
		T__3=53, T__2=54, T__1=55, T__0=56, TRUE=57, FALSE=58, NULL=59, ID=60, 
		INT=61, STRING=62, NEWLINE=63, WS=64;
	public static final String[] tokenNames = {
		"<INVALID>", "'into'", "'min'", "'or'", "'['", "'*'", "'<'", "'!='", "'<='", 
		"'range'", "'by'", "'readFromWrapper'", "'}'", "'max'", "'->'", "'now'", 
		"')'", "'[*]'", "'seconds'", "'hours'", "'group'", "'='", "'dstream'", 
		"'transform'", "'days'", "'rstream'", "'rows'", "'filter'", "'window'", 
		"'join'", "']'", "'each'", "'in'", "','", "'-'", "'('", "':'", "'as'", 
		"'readFromWrapperAsMaster'", "'sum'", "'{'", "'and'", "'partitioned by'", 
		"'unbounded'", "'$'", "'avg'", "'.'", "'+'", "'minutes'", "'istream'", 
		"';'", "'>'", "'where'", "'=='", "'/'", "'count'", "'>='", "'true'", "'false'", 
		"'null'", "ID", "INT", "STRING", "NEWLINE", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_readStream = 2, RULE_assignView = 3, 
		RULE_join = 4, RULE_joinVar = 5, RULE_joinOut = 6, RULE_joinOutVar = 7, 
		RULE_pipe = 8, RULE_pipeExpr = 9, RULE_stream = 10, RULE_windowRange = 11, 
		RULE_timeRange = 12, RULE_timeUnit = 13, RULE_aggrExprs = 14, RULE_aggrExpr = 15, 
		RULE_aggrFunc = 16, RULE_aggrFuncName = 17, RULE_transExpr = 18, RULE_transExprVar = 19, 
		RULE_conditions = 20, RULE_comprator = 21, RULE_exprs = 22, RULE_var = 23, 
		RULE_varID = 24, RULE_identifier = 25;
	public static final String[] ruleNames = {
		"prog", "stat", "readStream", "assignView", "join", "joinVar", "joinOut", 
		"joinOutVar", "pipe", "pipeExpr", "stream", "windowRange", "timeRange", 
		"timeUnit", "aggrExprs", "aggrExpr", "aggrFunc", "aggrFuncName", "transExpr", 
		"transExprVar", "conditions", "comprator", "exprs", "var", "varID", "identifier"
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
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52); stat();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 15) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 43) | (1L << 45) | (1L << 48) | (1L << 49) | (1L << 52) | (1L << 55) | (1L << ID) | (1L << NEWLINE))) != 0) );
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
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); pipe();
				setState(58); match(50);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60); join();
				setState(61); match(50);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63); assignView();
				setState(64); match(50);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66); readStream();
				setState(67); match(50);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69); identifier();
				setState(70); match(50);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(72); match(NEWLINE);
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
		public TerminalNode FALSE() { return getToken(JaqlSampleParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(JaqlSampleParser.TRUE, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); identifier();
			setState(76); match(21);
			setState(77); match(11);
			setState(78); match(35);
			setState(79); match(STRING);
			setState(80); match(33);
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(82); match(16);
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
			setState(84); identifier();
			setState(85); match(21);
			setState(88);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(86); pipe();
				}
				break;

			case 2:
				{
				setState(87); join();
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
			setState(90); match(29);
			setState(91); joinVar();
			setState(92); match(33);
			setState(93); joinVar();
			setState(94); match(52);
			setState(95); varID();
			setState(96); match(53);
			setState(97); varID();
			setState(98); match(1);
			setState(99); joinOut();
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
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(101); identifier();
				setState(102); match(32);
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

	public static class JoinOutContext extends ParserRuleContext {
		public List<JoinOutVarContext> joinOutVar() {
			return getRuleContexts(JoinOutVarContext.class);
		}
		public JoinOutVarContext joinOutVar(int i) {
			return getRuleContext(JoinOutVarContext.class,i);
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
			setState(108); match(40);
			setState(109); joinOutVar();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(110); match(33);
				setState(111); joinOutVar();
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117); match(12);
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

	public static class JoinOutVarContext extends ParserRuleContext {
		public VarIDContext varID() {
			return getRuleContext(VarIDContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public JoinOutVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinOutVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitJoinOutVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinOutVarContext joinOutVar() throws RecognitionException {
		JoinOutVarContext _localctx = new JoinOutVarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_joinOutVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(119); identifier();
				setState(120); match(36);
				}
				break;
			}
			setState(124); varID();
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
		enterRule(_localctx, 16, RULE_pipe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); identifier();
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127); match(14);
				setState(128); pipeExpr();
				}
				}
				setState(131); 
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public AggrExprsContext aggrExprs() {
			return getRuleContext(AggrExprsContext.class,0);
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
	public static class TransformLabelContext extends PipeExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TransExprContext transExpr() {
			return getRuleContext(TransExprContext.class,0);
		}
		public TransformLabelContext(PipeExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitTransformLabel(this);
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
		enterRule(_localctx, 18, RULE_pipeExpr);
		int _la;
		try {
			setState(167);
			switch (_input.LA(1)) {
			case 27:
				_localctx = new FilterLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133); match(27);
				setState(136);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(134); match(31);
					setState(135); identifier();
					}
					break;
				}
				setState(138); conditions(0);
				}
				break;
			case 23:
				_localctx = new TransformLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(139); match(23);
				setState(142);
				_la = _input.LA(1);
				if (_la==31) {
					{
					setState(140); match(31);
					setState(141); identifier();
					}
				}

				setState(144); transExpr();
				}
				break;
			case 20:
				_localctx = new GroupSingleLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(145); match(20);
				setState(148);
				_la = _input.LA(1);
				if (_la==31) {
					{
					setState(146); ((GroupSingleLabelContext)_localctx).geach = match(31);
					setState(147); identifier();
					}
				}

				{
				setState(150); ((GroupSingleLabelContext)_localctx).gby = match(10);
				setState(151); identifier();
				setState(152); match(21);
				setState(153); var();
				setState(156);
				_la = _input.LA(1);
				if (_la==37) {
					{
					setState(154); ((GroupSingleLabelContext)_localctx).gas = match(37);
					setState(155); identifier();
					}
				}

				}
				setState(158); match(1);
				setState(159); aggrExprs();
				}
				break;
			case 28:
				_localctx = new WindowLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(161); match(28);
				setState(162); match(4);
				setState(163); windowRange();
				setState(164); match(30);
				}
				break;
			case 22:
			case 25:
			case 49:
				_localctx = new StreamLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(166); stream();
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
		enterRule(_localctx, 20, RULE_stream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 22) | (1L << 25) | (1L << 49))) != 0)) ) {
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
		public TimeRangeContext timeRange() {
			return getRuleContext(TimeRangeContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_windowRange);
		int _la;
		try {
			setState(191);
			switch (_input.LA(1)) {
			case 9:
				_localctx = new WindowTimeLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171); match(9);
				setState(175);
				switch (_input.LA(1)) {
				case INT:
					{
					{
					setState(172); match(INT);
					}
					setState(173); timeUnit();
					}
					break;
				case 15:
				case 43:
					{
					setState(174); timeRange();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 26:
				_localctx = new WindowRowLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(177); match(26);
				setState(178);
				_la = _input.LA(1);
				if ( !(_la==43 || _la==INT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 42:
				_localctx = new WindowPartitionLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(179); match(42);
				setState(180); identifier();
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==33) {
					{
					{
					setState(181); match(33);
					setState(182); identifier();
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(188); match(26);
				setState(189); match(INT);
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitTimeRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeRangeContext timeRange() throws RecognitionException {
		TimeRangeContext _localctx = new TimeRangeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_timeRange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==15 || _la==43) ) {
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitTimeUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeUnitContext timeUnit() throws RecognitionException {
		TimeUnitContext _localctx = new TimeUnitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_timeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 18) | (1L << 19) | (1L << 24) | (1L << 48))) != 0)) ) {
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

	public static class AggrExprsContext extends ParserRuleContext {
		public List<AggrExprContext> aggrExpr() {
			return getRuleContexts(AggrExprContext.class);
		}
		public AggrExprContext aggrExpr(int i) {
			return getRuleContext(AggrExprContext.class,i);
		}
		public AggrExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggrExprs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitAggrExprs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggrExprsContext aggrExprs() throws RecognitionException {
		AggrExprsContext _localctx = new AggrExprsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_aggrExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(40);
			setState(198); aggrExpr();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(199); match(33);
				setState(200); aggrExpr();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206); match(12);
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
		public AggrFuncContext aggrFunc() {
			return getRuleContext(AggrFuncContext.class,0);
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
		enterRule(_localctx, 30, RULE_aggrExpr);
		try {
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(208); identifier();
					setState(209); match(36);
					}
					break;
				}
				setState(213); identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(214); identifier();
				setState(215); match(36);
				setState(216); aggrFunc();
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

	public static class AggrFuncContext extends ParserRuleContext {
		public Token dollar;
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AggrFuncNameContext aggrFuncName() {
			return getRuleContext(AggrFuncNameContext.class,0);
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
		enterRule(_localctx, 32, RULE_aggrFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); aggrFuncName();
			setState(221); match(35);
			setState(224);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 9:
			case 10:
			case 11:
			case 13:
			case 15:
			case 18:
			case 19:
			case 20:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 31:
			case 32:
			case 37:
			case 38:
			case 39:
			case 43:
			case 45:
			case 48:
			case 49:
			case 52:
			case 55:
			case ID:
				{
				setState(222); identifier();
				}
				break;
			case 44:
				{
				setState(223); ((AggrFuncContext)_localctx).dollar = match(44);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(226); match(17);
			setState(229); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(227); match(46);
				setState(228); identifier();
				}
				}
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==46 );
			setState(233); match(16);
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
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitAggrFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggrFuncNameContext aggrFuncName() throws RecognitionException {
		AggrFuncNameContext _localctx = new AggrFuncNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_aggrFuncName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 13) | (1L << 39) | (1L << 45) | (1L << 55))) != 0)) ) {
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
		public TransExprVarContext transExprVar(int i) {
			return getRuleContext(TransExprVarContext.class,i);
		}
		public List<TransExprVarContext> transExprVar() {
			return getRuleContexts(TransExprVarContext.class);
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
		enterRule(_localctx, 36, RULE_transExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); match(40);
			setState(238); transExprVar();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(239); match(33);
				setState(240); transExprVar();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(246); match(12);
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

	public static class TransExprVarContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprsContext exprs() {
			return getRuleContext(ExprsContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TransExprVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transExprVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitTransExprVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransExprVarContext transExprVar() throws RecognitionException {
		TransExprVarContext _localctx = new TransExprVarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_transExprVar);
		try {
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248); identifier();
				setState(249); match(36);
				setState(250); exprs(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252); var();
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
		int _startState = 40;
		enterRecursionRule(_localctx, RULE_conditions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new CondCompLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(256); exprs(0);
				setState(257); comprator();
				setState(258); exprs(0);
				}
				break;

			case 2:
				{
				_localctx = new CondVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260); var();
				}
				break;

			case 3:
				{
				_localctx = new CondSubLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(261); match(35);
				setState(262); conditions(0);
				setState(263); match(16);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(273);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(267);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(268); match(41);
						setState(269); conditions(6);
						}
						break;

					case 2:
						{
						_localctx = new CondOrLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(270);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(271); match(3);
						setState(272); conditions(5);
						}
						break;
					}
					} 
				}
				setState(277);
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
		enterRule(_localctx, 42, RULE_comprator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 8) | (1L << 51) | (1L << 53) | (1L << 56))) != 0)) ) {
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
		int _startState = 44;
		enterRecursionRule(_localctx, RULE_exprs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 9:
			case 10:
			case 11:
			case 13:
			case 15:
			case 18:
			case 19:
			case 20:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 31:
			case 32:
			case 37:
			case 38:
			case 39:
			case 43:
			case 44:
			case 45:
			case 48:
			case 49:
			case 52:
			case 55:
			case ID:
				{
				_localctx = new ExprVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(281); var();
				}
				break;
			case INT:
				{
				_localctx = new ExprIntLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282); match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				{
				_localctx = new ExprBoolLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
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
				setState(284); match(NULL);
				}
				break;
			case STRING:
				{
				_localctx = new ExprStringLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285); match(STRING);
				}
				break;
			case 35:
				{
				_localctx = new ExprSubExprLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286); match(35);
				setState(287); exprs(0);
				setState(288); match(16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(298);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(292);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(293);
						((ExprMulDivLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==54) ) {
							((ExprMulDivLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(294); exprs(9);
						}
						break;

					case 2:
						{
						_localctx = new ExprAddSubLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(295);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(296);
						((ExprAddSubLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==34 || _la==47) ) {
							((ExprAddSubLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(297); exprs(8);
						}
						break;
					}
					} 
				}
				setState(302);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public Token dollar;
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
		enterRule(_localctx, 46, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 9:
			case 10:
			case 11:
			case 13:
			case 15:
			case 18:
			case 19:
			case 20:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 31:
			case 32:
			case 37:
			case 38:
			case 39:
			case 43:
			case 45:
			case 48:
			case 49:
			case 52:
			case 55:
			case ID:
				{
				setState(303); identifier();
				}
				break;
			case 44:
				{
				setState(304); ((VarContext)_localctx).dollar = match(44);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(309); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(307); match(46);
					setState(308); identifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(311); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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
		enterRule(_localctx, 48, RULE_varID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(313); identifier();
			}
			setState(316); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(314); match(46);
				setState(315); identifier();
				}
				}
				setState(318); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==46 );
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
		enterRule(_localctx, 50, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 15) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 43) | (1L << 45) | (1L << 48) | (1L << 49) | (1L << 52) | (1L << 55) | (1L << ID))) != 0)) ) {
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
		case 20: return conditions_sempred((ConditionsContext)_localctx, predIndex);

		case 22: return exprs_sempred((ExprsContext)_localctx, predIndex);
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
		"\2\3B\u0145\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\6\28\n\2\r\2\16\29\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5[\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7k\n\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\7\bs\n\b\f\b\16\bv\13\b\3\b\3\b\3\t\3\t\3\t\5\t}\n\t\3\t\3"+
		"\t\3\n\3\n\3\n\6\n\u0084\n\n\r\n\16\n\u0085\3\13\3\13\3\13\5\13\u008b"+
		"\n\13\3\13\3\13\3\13\3\13\5\13\u0091\n\13\3\13\3\13\3\13\3\13\5\13\u0097"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009f\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00aa\n\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r"+
		"\u00b2\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ba\n\r\f\r\16\r\u00bd\13\r\3"+
		"\r\3\r\3\r\5\r\u00c2\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\7\20"+
		"\u00cc\n\20\f\20\16\20\u00cf\13\20\3\20\3\20\3\21\3\21\3\21\5\21\u00d6"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u00dd\n\21\3\22\3\22\3\22\3\22\5\22"+
		"\u00e3\n\22\3\22\3\22\3\22\6\22\u00e8\n\22\r\22\16\22\u00e9\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00f4\n\24\f\24\16\24\u00f7\13\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u0100\n\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u010c\n\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u0114\n\26\f\26\16\26\u0117\13\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0125\n\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u012d\n\30\f\30\16\30\u0130\13\30\3\31\3\31\5\31\u0134"+
		"\n\31\3\31\3\31\6\31\u0138\n\31\r\31\16\31\u0139\3\32\3\32\3\32\6\32\u013f"+
		"\n\32\r\32\16\32\u0140\3\33\3\33\3\33\2\34\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\2\r\3;<\5\30\30\33\33\63\63\4--??\4\21"+
		"\21--\5\24\25\32\32\62\62\7\4\4\17\17))//99\6\b\n\65\65\67\67::\3;<\4"+
		"\7\788\4$$\61\61\20\3\4\13\r\17\17\21\21\24\26\30\37!\"\')--//\62\63\66"+
		"\6699>>\u0156\2\67\3\2\2\2\4K\3\2\2\2\6M\3\2\2\2\bV\3\2\2\2\n\\\3\2\2"+
		"\2\fj\3\2\2\2\16n\3\2\2\2\20|\3\2\2\2\22\u0080\3\2\2\2\24\u00a9\3\2\2"+
		"\2\26\u00ab\3\2\2\2\30\u00c1\3\2\2\2\32\u00c3\3\2\2\2\34\u00c5\3\2\2\2"+
		"\36\u00c7\3\2\2\2 \u00dc\3\2\2\2\"\u00de\3\2\2\2$\u00ed\3\2\2\2&\u00ef"+
		"\3\2\2\2(\u00ff\3\2\2\2*\u010b\3\2\2\2,\u0118\3\2\2\2.\u0124\3\2\2\2\60"+
		"\u0133\3\2\2\2\62\u013b\3\2\2\2\64\u0142\3\2\2\2\668\5\4\3\2\67\66\3\2"+
		"\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2\2;<\5\22\n\2<=\7\64\2\2"+
		"=L\3\2\2\2>?\5\n\6\2?@\7\64\2\2@L\3\2\2\2AB\5\b\5\2BC\7\64\2\2CL\3\2\2"+
		"\2DE\5\6\4\2EF\7\64\2\2FL\3\2\2\2GH\5\64\33\2HI\7\64\2\2IL\3\2\2\2JL\7"+
		"A\2\2K;\3\2\2\2K>\3\2\2\2KA\3\2\2\2KD\3\2\2\2KG\3\2\2\2KJ\3\2\2\2L\5\3"+
		"\2\2\2MN\5\64\33\2NO\7\27\2\2OP\7\r\2\2PQ\7%\2\2QR\7@\2\2RS\7#\2\2ST\t"+
		"\2\2\2TU\7\22\2\2U\7\3\2\2\2VW\5\64\33\2WZ\7\27\2\2X[\5\22\n\2Y[\5\n\6"+
		"\2ZX\3\2\2\2ZY\3\2\2\2[\t\3\2\2\2\\]\7\37\2\2]^\5\f\7\2^_\7#\2\2_`\5\f"+
		"\7\2`a\7\66\2\2ab\5\62\32\2bc\7\67\2\2cd\5\62\32\2de\7\3\2\2ef\5\16\b"+
		"\2f\13\3\2\2\2gh\5\64\33\2hi\7\"\2\2ik\3\2\2\2jg\3\2\2\2jk\3\2\2\2kl\3"+
		"\2\2\2lm\5\64\33\2m\r\3\2\2\2no\7*\2\2ot\5\20\t\2pq\7#\2\2qs\5\20\t\2"+
		"rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\16\2"+
		"\2x\17\3\2\2\2yz\5\64\33\2z{\7&\2\2{}\3\2\2\2|y\3\2\2\2|}\3\2\2\2}~\3"+
		"\2\2\2~\177\5\62\32\2\177\21\3\2\2\2\u0080\u0083\5\64\33\2\u0081\u0082"+
		"\7\20\2\2\u0082\u0084\5\24\13\2\u0083\u0081\3\2\2\2\u0084\u0085\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\23\3\2\2\2\u0087\u008a"+
		"\7\35\2\2\u0088\u0089\7!\2\2\u0089\u008b\5\64\33\2\u008a\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u00aa\5*\26\2\u008d\u0090"+
		"\7\31\2\2\u008e\u008f\7!\2\2\u008f\u0091\5\64\33\2\u0090\u008e\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u00aa\5&\24\2\u0093\u0096"+
		"\7\26\2\2\u0094\u0095\7!\2\2\u0095\u0097\5\64\33\2\u0096\u0094\3\2\2\2"+
		"\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\f\2\2\u0099\u009a"+
		"\5\64\33\2\u009a\u009b\7\27\2\2\u009b\u009e\5\60\31\2\u009c\u009d\7\'"+
		"\2\2\u009d\u009f\5\64\33\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\7\3\2\2\u00a1\u00a2\5\36\20\2\u00a2\u00aa\3"+
		"\2\2\2\u00a3\u00a4\7\36\2\2\u00a4\u00a5\7\6\2\2\u00a5\u00a6\5\30\r\2\u00a6"+
		"\u00a7\7 \2\2\u00a7\u00aa\3\2\2\2\u00a8\u00aa\5\26\f\2\u00a9\u0087\3\2"+
		"\2\2\u00a9\u008d\3\2\2\2\u00a9\u0093\3\2\2\2\u00a9\u00a3\3\2\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\25\3\2\2\2\u00ab\u00ac\t\3\2\2\u00ac\27\3\2\2\2\u00ad"+
		"\u00b1\7\13\2\2\u00ae\u00af\7?\2\2\u00af\u00b2\5\34\17\2\u00b0\u00b2\5"+
		"\32\16\2\u00b1\u00ae\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00c2\3\2\2\2\u00b3"+
		"\u00b4\7\34\2\2\u00b4\u00c2\t\4\2\2\u00b5\u00b6\7,\2\2\u00b6\u00bb\5\64"+
		"\33\2\u00b7\u00b8\7#\2\2\u00b8\u00ba\5\64\33\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\34\2\2\u00bf\u00c0\7?\2\2\u00c0"+
		"\u00c2\3\2\2\2\u00c1\u00ad\3\2\2\2\u00c1\u00b3\3\2\2\2\u00c1\u00b5\3\2"+
		"\2\2\u00c2\31\3\2\2\2\u00c3\u00c4\t\5\2\2\u00c4\33\3\2\2\2\u00c5\u00c6"+
		"\t\6\2\2\u00c6\35\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8\u00cd\5 \21\2\u00c9"+
		"\u00ca\7#\2\2\u00ca\u00cc\5 \21\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d1\7\16\2\2\u00d1\37\3\2\2\2\u00d2\u00d3\5\64"+
		"\33\2\u00d3\u00d4\7&\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d2\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00dd\5\64\33\2\u00d8\u00d9\5"+
		"\64\33\2\u00d9\u00da\7&\2\2\u00da\u00db\5\"\22\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00d5\3\2\2\2\u00dc\u00d8\3\2\2\2\u00dd!\3\2\2\2\u00de\u00df\5$\23\2"+
		"\u00df\u00e2\7%\2\2\u00e0\u00e3\5\64\33\2\u00e1\u00e3\7.\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7\7\23\2\2"+
		"\u00e5\u00e6\7\60\2\2\u00e6\u00e8\5\64\33\2\u00e7\u00e5\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2"+
		"\2\2\u00eb\u00ec\7\22\2\2\u00ec#\3\2\2\2\u00ed\u00ee\t\7\2\2\u00ee%\3"+
		"\2\2\2\u00ef\u00f0\7*\2\2\u00f0\u00f5\5(\25\2\u00f1\u00f2\7#\2\2\u00f2"+
		"\u00f4\5(\25\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u00f9\7\16\2\2\u00f9\'\3\2\2\2\u00fa\u00fb\5\64\33\2\u00fb\u00fc\7&\2"+
		"\2\u00fc\u00fd\5.\30\2\u00fd\u0100\3\2\2\2\u00fe\u0100\5\60\31\2\u00ff"+
		"\u00fa\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100)\3\2\2\2\u0101\u0102\b\26\1\2"+
		"\u0102\u0103\5.\30\2\u0103\u0104\5,\27\2\u0104\u0105\5.\30\2\u0105\u010c"+
		"\3\2\2\2\u0106\u010c\5\60\31\2\u0107\u0108\7%\2\2\u0108\u0109\5*\26\2"+
		"\u0109\u010a\7\22\2\2\u010a\u010c\3\2\2\2\u010b\u0101\3\2\2\2\u010b\u0106"+
		"\3\2\2\2\u010b\u0107\3\2\2\2\u010c\u0115\3\2\2\2\u010d\u010e\6\26\2\3"+
		"\u010e\u010f\7+\2\2\u010f\u0114\5*\26\2\u0110\u0111\6\26\3\3\u0111\u0112"+
		"\7\5\2\2\u0112\u0114\5*\26\2\u0113\u010d\3\2\2\2\u0113\u0110\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116+\3\2\2\2"+
		"\u0117\u0115\3\2\2\2\u0118\u0119\t\b\2\2\u0119-\3\2\2\2\u011a\u011b\b"+
		"\30\1\2\u011b\u0125\5\60\31\2\u011c\u0125\7?\2\2\u011d\u0125\t\t\2\2\u011e"+
		"\u0125\7=\2\2\u011f\u0125\7@\2\2\u0120\u0121\7%\2\2\u0121\u0122\5.\30"+
		"\2\u0122\u0123\7\22\2\2\u0123\u0125\3\2\2\2\u0124\u011a\3\2\2\2\u0124"+
		"\u011c\3\2\2\2\u0124\u011d\3\2\2\2\u0124\u011e\3\2\2\2\u0124\u011f\3\2"+
		"\2\2\u0124\u0120\3\2\2\2\u0125\u012e\3\2\2\2\u0126\u0127\6\30\4\3\u0127"+
		"\u0128\t\n\2\2\u0128\u012d\5.\30\2\u0129\u012a\6\30\5\3\u012a\u012b\t"+
		"\13\2\2\u012b\u012d\5.\30\2\u012c\u0126\3\2\2\2\u012c\u0129\3\2\2\2\u012d"+
		"\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f/\3\2\2\2"+
		"\u0130\u012e\3\2\2\2\u0131\u0134\5\64\33\2\u0132\u0134\7.\2\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0136\7\60\2\2"+
		"\u0136\u0138\5\64\33\2\u0137\u0135\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u0139\u013a\3\2\2\2\u013a\61\3\2\2\2\u013b\u013e\5\64\33\2\u013c"+
		"\u013d\7\60\2\2\u013d\u013f\5\64\33\2\u013e\u013c\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\63\3\2\2\2\u0142"+
		"\u0143\t\f\2\2\u0143\65\3\2\2\2!9KZjt|\u0085\u008a\u0090\u0096\u009e\u00a9"+
		"\u00b1\u00bb\u00c1\u00cd\u00d5\u00dc\u00e2\u00e9\u00f5\u00ff\u010b\u0113"+
		"\u0115\u0124\u012c\u012e\u0133\u0139\u0140";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}