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
		T__56=1, T__55=2, T__54=3, T__53=4, T__52=5, T__51=6, T__50=7, T__49=8, 
		T__48=9, T__47=10, T__46=11, T__45=12, T__44=13, T__43=14, T__42=15, T__41=16, 
		T__40=17, T__39=18, T__38=19, T__37=20, T__36=21, T__35=22, T__34=23, 
		T__33=24, T__32=25, T__31=26, T__30=27, T__29=28, T__28=29, T__27=30, 
		T__26=31, T__25=32, T__24=33, T__23=34, T__22=35, T__21=36, T__20=37, 
		T__19=38, T__18=39, T__17=40, T__16=41, T__15=42, T__14=43, T__13=44, 
		T__12=45, T__11=46, T__10=47, T__9=48, T__8=49, T__7=50, T__6=51, T__5=52, 
		T__4=53, T__3=54, T__2=55, T__1=56, T__0=57, TRUE=58, FALSE=59, NULL=60, 
		ID=61, INT=62, STRING=63, NEWLINE=64, WS=65;
	public static final String[] tokenNames = {
		"<INVALID>", "'into'", "'min'", "'or'", "'['", "'*'", "'<'", "'!='", "'<='", 
		"'range'", "'by'", "'readFromWrapper'", "'}'", "'max'", "'->'", "'now'", 
		"')'", "'seconds'", "'hours'", "'group'", "'='", "'dstream'", "'transform'", 
		"'days'", "'rstream'", "'rows'", "'filter'", "'window'", "'join'", "']'", 
		"'each'", "'in'", "','", "'-'", "'('", "':'", "'as'", "'readFromWrapperAsMaster'", 
		"'sum'", "'[*].'", "'{'", "'and'", "'partitioned by'", "'unbounded'", 
		"'$'", "'avg'", "'.'", "'setMaster'", "'+'", "'minutes'", "'istream'", 
		"';'", "'>'", "'where'", "'=='", "'/'", "'>='", "'count'", "'true'", "'false'", 
		"'null'", "ID", "INT", "STRING", "NEWLINE", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_setMaster = 2, RULE_readStream = 3, 
		RULE_assignView = 4, RULE_join = 5, RULE_joinVar = 6, RULE_joinOut = 7, 
		RULE_joinOutVar = 8, RULE_pipe = 9, RULE_pipeExpr = 10, RULE_stream = 11, 
		RULE_windowRange = 12, RULE_timeRange = 13, RULE_timeUnit = 14, RULE_aggrExprs = 15, 
		RULE_aggrExpr = 16, RULE_aggrFunc = 17, RULE_aggrFuncName = 18, RULE_transExpr = 19, 
		RULE_transExprVar = 20, RULE_conditions = 21, RULE_comprator = 22, RULE_exprs = 23, 
		RULE_var = 24, RULE_varID = 25, RULE_identifier = 26;
	public static final String[] ruleNames = {
		"prog", "stat", "setMaster", "readStream", "assignView", "join", "joinVar", 
		"joinOut", "joinOutVar", "pipe", "pipeExpr", "stream", "windowRange", 
		"timeRange", "timeUnit", "aggrExprs", "aggrExpr", "aggrFunc", "aggrFuncName", 
		"transExpr", "transExprVar", "conditions", "comprator", "exprs", "var", 
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
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54); stat();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (1 - 1)) | (1L << (2 - 1)) | (1L << (9 - 1)) | (1L << (10 - 1)) | (1L << (11 - 1)) | (1L << (13 - 1)) | (1L << (15 - 1)) | (1L << (17 - 1)) | (1L << (18 - 1)) | (1L << (19 - 1)) | (1L << (21 - 1)) | (1L << (22 - 1)) | (1L << (23 - 1)) | (1L << (24 - 1)) | (1L << (25 - 1)) | (1L << (26 - 1)) | (1L << (27 - 1)) | (1L << (28 - 1)) | (1L << (30 - 1)) | (1L << (31 - 1)) | (1L << (36 - 1)) | (1L << (37 - 1)) | (1L << (38 - 1)) | (1L << (43 - 1)) | (1L << (45 - 1)) | (1L << (47 - 1)) | (1L << (49 - 1)) | (1L << (50 - 1)) | (1L << (53 - 1)) | (1L << (57 - 1)) | (1L << (ID - 1)) | (1L << (NEWLINE - 1)))) != 0) );
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
		public SetMasterContext setMaster() {
			return getRuleContext(SetMasterContext.class,0);
		}
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
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); pipe();
				setState(60); match(51);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); join();
				setState(63); match(51);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65); assignView();
				setState(66); match(51);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68); readStream();
				setState(69); match(51);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71); identifier();
				setState(72); match(51);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74); setMaster();
				setState(75); match(51);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(77); match(NEWLINE);
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

	public static class SetMasterContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetMasterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setMaster; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlSampleVisitor ) return ((JaqlSampleVisitor<? extends T>)visitor).visitSetMaster(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetMasterContext setMaster() throws RecognitionException {
		SetMasterContext _localctx = new SetMasterContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_setMaster);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(47);
			setState(81); match(34);
			setState(82); identifier();
			setState(83); match(16);
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
		enterRule(_localctx, 6, RULE_readStream);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); identifier();
			setState(86); match(20);
			setState(87); match(11);
			setState(88); match(34);
			setState(89); match(STRING);
			setState(90); match(16);
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
		enterRule(_localctx, 8, RULE_assignView);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); identifier();
			setState(93); match(20);
			setState(94); pipe();
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
		enterRule(_localctx, 10, RULE_join);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); match(28);
			setState(97); joinVar();
			setState(98); match(32);
			setState(99); joinVar();
			setState(100); match(53);
			setState(101); varID();
			setState(102); match(54);
			setState(103); varID();
			setState(104); match(1);
			setState(105); joinOut();
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
		enterRule(_localctx, 12, RULE_joinVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(107); identifier();
				setState(108); match(31);
				}
				break;
			}
			setState(112); identifier();
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
		enterRule(_localctx, 14, RULE_joinOut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(40);
			setState(115); joinOutVar();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==32) {
				{
				{
				setState(116); match(32);
				setState(117); joinOutVar();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123); match(12);
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
		enterRule(_localctx, 16, RULE_joinOutVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(125); identifier();
				setState(126); match(35);
				}
				break;
			}
			setState(130); varID();
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
		enterRule(_localctx, 18, RULE_pipe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); identifier();
			setState(135); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(133); match(14);
				setState(134); pipeExpr();
				}
				}
				setState(137); 
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
		enterRule(_localctx, 20, RULE_pipeExpr);
		int _la;
		try {
			setState(174);
			switch (_input.LA(1)) {
			case 26:
				_localctx = new FilterLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139); match(26);
				setState(142);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(140); match(30);
					setState(141); identifier();
					}
					break;
				}
				setState(144); conditions(0);
				}
				break;
			case 22:
				_localctx = new TransformLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(145); match(22);
				setState(148);
				_la = _input.LA(1);
				if (_la==30) {
					{
					setState(146); match(30);
					setState(147); identifier();
					}
				}

				setState(150); transExpr();
				}
				break;
			case 19:
				_localctx = new GroupSingleLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(151); match(19);
				setState(154);
				_la = _input.LA(1);
				if (_la==30) {
					{
					setState(152); ((GroupSingleLabelContext)_localctx).geach = match(30);
					setState(153); identifier();
					}
				}

				setState(164);
				_la = _input.LA(1);
				if (_la==10) {
					{
					setState(156); ((GroupSingleLabelContext)_localctx).gby = match(10);
					setState(157); identifier();
					setState(158); match(20);
					setState(159); var();
					setState(162);
					_la = _input.LA(1);
					if (_la==36) {
						{
						setState(160); ((GroupSingleLabelContext)_localctx).gas = match(36);
						setState(161); identifier();
						}
					}

					}
				}

				setState(166); match(1);
				setState(167); aggrExprs();
				}
				break;
			case 27:
				_localctx = new WindowLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(168); match(27);
				setState(169); match(4);
				setState(170); windowRange();
				setState(171); match(29);
				}
				break;
			case 21:
			case 24:
			case 50:
				_localctx = new StreamLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(173); stream();
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
		enterRule(_localctx, 22, RULE_stream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 21) | (1L << 24) | (1L << 50))) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_windowRange);
		int _la;
		try {
			setState(198);
			switch (_input.LA(1)) {
			case 9:
				_localctx = new WindowTimeLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178); match(9);
				setState(182);
				switch (_input.LA(1)) {
				case INT:
					{
					{
					setState(179); match(INT);
					}
					setState(180); timeUnit();
					}
					break;
				case 15:
				case 43:
					{
					setState(181); timeRange();
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
				setState(184); match(25);
				setState(185);
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
				setState(186); match(42);
				setState(187); identifier();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==32) {
					{
					{
					setState(188); match(32);
					setState(189); identifier();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195); match(25);
				setState(196); match(INT);
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
		enterRule(_localctx, 26, RULE_timeRange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
		enterRule(_localctx, 28, RULE_timeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 18) | (1L << 23) | (1L << 49))) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_aggrExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(40);
			setState(205); aggrExpr();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==32) {
				{
				{
				setState(206); match(32);
				setState(207); aggrExpr();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213); match(12);
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
		enterRule(_localctx, 32, RULE_aggrExpr);
		try {
			setState(225);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(215); identifier();
					setState(216); match(35);
					}
					break;
				}
				setState(220); identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(221); identifier();
				setState(222); match(35);
				setState(223); aggrFunc();
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
		enterRule(_localctx, 34, RULE_aggrFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); aggrFuncName();
			setState(228); match(34);
			setState(231);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 9:
			case 10:
			case 11:
			case 13:
			case 15:
			case 17:
			case 18:
			case 19:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 30:
			case 31:
			case 36:
			case 37:
			case 38:
			case 43:
			case 45:
			case 49:
			case 50:
			case 53:
			case 57:
			case ID:
				{
				setState(229); identifier();
				}
				break;
			case 44:
				{
				setState(230); match(44);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(233); match(39);
			setState(234); identifier();
			setState(235); match(16);
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
		enterRule(_localctx, 36, RULE_aggrFuncName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 13) | (1L << 38) | (1L << 45) | (1L << 57))) != 0)) ) {
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
		enterRule(_localctx, 38, RULE_transExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(40);
			setState(240); transExprVar();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==32) {
				{
				{
				setState(241); match(32);
				setState(242); transExprVar();
				}
				}
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(248); match(12);
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
		enterRule(_localctx, 40, RULE_transExprVar);
		try {
			setState(255);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250); identifier();
				setState(251); match(35);
				setState(252); exprs(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254); var();
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
		int _startState = 42;
		enterRecursionRule(_localctx, RULE_conditions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new CondCompLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(258); exprs(0);
				setState(259); comprator();
				setState(260); exprs(0);
				}
				break;

			case 2:
				{
				_localctx = new CondVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262); var();
				}
				break;

			case 3:
				{
				_localctx = new CondSubLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263); match(34);
				setState(264); conditions(0);
				setState(265); match(16);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(277);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(275);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(269);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(270); match(41);
						setState(271); conditions(6);
						}
						break;

					case 2:
						{
						_localctx = new CondOrLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(272);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(273); match(3);
						setState(274); conditions(5);
						}
						break;
					}
					} 
				}
				setState(279);
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
		enterRule(_localctx, 44, RULE_comprator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 8) | (1L << 52) | (1L << 54) | (1L << 56))) != 0)) ) {
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
		int _startState = 46;
		enterRecursionRule(_localctx, RULE_exprs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 9:
			case 10:
			case 11:
			case 13:
			case 15:
			case 17:
			case 18:
			case 19:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 30:
			case 31:
			case 36:
			case 37:
			case 38:
			case 43:
			case 44:
			case 45:
			case 49:
			case 50:
			case 53:
			case 57:
			case ID:
				{
				_localctx = new ExprVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(283); var();
				}
				break;
			case INT:
				{
				_localctx = new ExprIntLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284); match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				{
				_localctx = new ExprBoolLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285);
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
				setState(286); match(NULL);
				}
				break;
			case STRING:
				{
				_localctx = new ExprStringLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287); match(STRING);
				}
				break;
			case 34:
				{
				_localctx = new ExprSubExprLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288); match(34);
				setState(289); exprs(0);
				setState(290); match(16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(300);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(294);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(295);
						((ExprMulDivLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==55) ) {
							((ExprMulDivLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(296); exprs(9);
						}
						break;

					case 2:
						{
						_localctx = new ExprAddSubLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(297);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(298);
						((ExprAddSubLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==33 || _la==48) ) {
							((ExprAddSubLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(299); exprs(8);
						}
						break;
					}
					} 
				}
				setState(304);
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
		enterRule(_localctx, 48, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 9:
			case 10:
			case 11:
			case 13:
			case 15:
			case 17:
			case 18:
			case 19:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 30:
			case 31:
			case 36:
			case 37:
			case 38:
			case 43:
			case 45:
			case 49:
			case 50:
			case 53:
			case 57:
			case ID:
				{
				setState(305); identifier();
				}
				break;
			case 44:
				{
				setState(306); match(44);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(311);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(309); match(46);
				setState(310); identifier();
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
		enterRule(_localctx, 50, RULE_varID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(313); identifier();
			}
			setState(316);
			_la = _input.LA(1);
			if (_la==46) {
				{
				setState(314); match(46);
				setState(315); identifier();
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
		enterRule(_localctx, 52, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 15) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 43) | (1L << 45) | (1L << 49) | (1L << 50) | (1L << 53) | (1L << 57) | (1L << ID))) != 0)) ) {
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
		case 21: return conditions_sempred((ConditionsContext)_localctx, predIndex);

		case 23: return exprs_sempred((ExprsContext)_localctx, predIndex);
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
		"\2\3C\u0143\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\6\2:\n\2\r\2\16"+
		"\2;\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3Q\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\5\bq\n\b\3\b\3\b\3\t\3\t\3\t\3\t\7\ty\n\t\f\t\16\t|\13\t\3\t\3\t\3\n"+
		"\3\n\3\n\5\n\u0083\n\n\3\n\3\n\3\13\3\13\3\13\6\13\u008a\n\13\r\13\16"+
		"\13\u008b\3\f\3\f\3\f\5\f\u0091\n\f\3\f\3\f\3\f\3\f\5\f\u0097\n\f\3\f"+
		"\3\f\3\f\3\f\5\f\u009d\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a5\n\f\5\f\u00a7"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b1\n\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\5\16\u00b9\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00c1\n\16"+
		"\f\16\16\16\u00c4\13\16\3\16\3\16\3\16\5\16\u00c9\n\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\7\21\u00d3\n\21\f\21\16\21\u00d6\13\21\3\21"+
		"\3\21\3\22\3\22\3\22\5\22\u00dd\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u00e4"+
		"\n\22\3\23\3\23\3\23\3\23\5\23\u00ea\n\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\7\25\u00f6\n\25\f\25\16\25\u00f9\13\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u0102\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u010e\n\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27"+
		"\u0116\n\27\f\27\16\27\u0119\13\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\5\31\u0127\n\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\7\31\u012f\n\31\f\31\16\31\u0132\13\31\3\32\3\32\5\32\u0136\n\32\3\32"+
		"\3\32\5\32\u013a\n\32\3\33\3\33\3\33\5\33\u013f\n\33\3\34\3\34\3\34\2"+
		"\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\f\5"+
		"\27\27\32\32\64\64\4--@@\4\21\21--\5\23\24\31\31\63\63\7\4\4\17\17((/"+
		"/;;\6\b\n\66\6688::\3<=\4\7\799\4##\62\62\20\3\4\13\r\17\17\21\21\23\25"+
		"\27\36 !&(--//\63\64\67\67;;??\u0153\29\3\2\2\2\4P\3\2\2\2\6R\3\2\2\2"+
		"\bW\3\2\2\2\n^\3\2\2\2\fb\3\2\2\2\16p\3\2\2\2\20t\3\2\2\2\22\u0082\3\2"+
		"\2\2\24\u0086\3\2\2\2\26\u00b0\3\2\2\2\30\u00b2\3\2\2\2\32\u00c8\3\2\2"+
		"\2\34\u00ca\3\2\2\2\36\u00cc\3\2\2\2 \u00ce\3\2\2\2\"\u00e3\3\2\2\2$\u00e5"+
		"\3\2\2\2&\u00ef\3\2\2\2(\u00f1\3\2\2\2*\u0101\3\2\2\2,\u010d\3\2\2\2."+
		"\u011a\3\2\2\2\60\u0126\3\2\2\2\62\u0135\3\2\2\2\64\u013b\3\2\2\2\66\u0140"+
		"\3\2\2\28:\5\4\3\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\3\3\2\2\2"+
		"=>\5\24\13\2>?\7\65\2\2?Q\3\2\2\2@A\5\f\7\2AB\7\65\2\2BQ\3\2\2\2CD\5\n"+
		"\6\2DE\7\65\2\2EQ\3\2\2\2FG\5\b\5\2GH\7\65\2\2HQ\3\2\2\2IJ\5\66\34\2J"+
		"K\7\65\2\2KQ\3\2\2\2LM\5\6\4\2MN\7\65\2\2NQ\3\2\2\2OQ\7B\2\2P=\3\2\2\2"+
		"P@\3\2\2\2PC\3\2\2\2PF\3\2\2\2PI\3\2\2\2PL\3\2\2\2PO\3\2\2\2Q\5\3\2\2"+
		"\2RS\7\61\2\2ST\7$\2\2TU\5\66\34\2UV\7\22\2\2V\7\3\2\2\2WX\5\66\34\2X"+
		"Y\7\26\2\2YZ\7\r\2\2Z[\7$\2\2[\\\7A\2\2\\]\7\22\2\2]\t\3\2\2\2^_\5\66"+
		"\34\2_`\7\26\2\2`a\5\24\13\2a\13\3\2\2\2bc\7\36\2\2cd\5\16\b\2de\7\"\2"+
		"\2ef\5\16\b\2fg\7\67\2\2gh\5\64\33\2hi\78\2\2ij\5\64\33\2jk\7\3\2\2kl"+
		"\5\20\t\2l\r\3\2\2\2mn\5\66\34\2no\7!\2\2oq\3\2\2\2pm\3\2\2\2pq\3\2\2"+
		"\2qr\3\2\2\2rs\5\66\34\2s\17\3\2\2\2tu\7*\2\2uz\5\22\n\2vw\7\"\2\2wy\5"+
		"\22\n\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~"+
		"\7\16\2\2~\21\3\2\2\2\177\u0080\5\66\34\2\u0080\u0081\7%\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\177\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0085\5\64\33\2\u0085\23\3\2\2\2\u0086\u0089\5\66\34\2\u0087\u0088\7"+
		"\20\2\2\u0088\u008a\5\26\f\2\u0089\u0087\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\25\3\2\2\2\u008d\u0090\7\34\2"+
		"\2\u008e\u008f\7 \2\2\u008f\u0091\5\66\34\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u00b1\5,\27\2\u0093\u0096\7\30"+
		"\2\2\u0094\u0095\7 \2\2\u0095\u0097\5\66\34\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u00b1\5(\25\2\u0099\u009c\7\25"+
		"\2\2\u009a\u009b\7 \2\2\u009b\u009d\5\66\34\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u00a6\3\2\2\2\u009e\u009f\7\f\2\2\u009f\u00a0\5\66"+
		"\34\2\u00a0\u00a1\7\26\2\2\u00a1\u00a4\5\62\32\2\u00a2\u00a3\7&\2\2\u00a3"+
		"\u00a5\5\66\34\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7\3"+
		"\2\2\2\u00a6\u009e\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a9\7\3\2\2\u00a9\u00b1\5 \21\2\u00aa\u00ab\7\35\2\2\u00ab\u00ac\7"+
		"\6\2\2\u00ac\u00ad\5\32\16\2\u00ad\u00ae\7\37\2\2\u00ae\u00b1\3\2\2\2"+
		"\u00af\u00b1\5\30\r\2\u00b0\u008d\3\2\2\2\u00b0\u0093\3\2\2\2\u00b0\u0099"+
		"\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\27\3\2\2\2\u00b2"+
		"\u00b3\t\2\2\2\u00b3\31\3\2\2\2\u00b4\u00b8\7\13\2\2\u00b5\u00b6\7@\2"+
		"\2\u00b6\u00b9\5\36\20\2\u00b7\u00b9\5\34\17\2\u00b8\u00b5\3\2\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\u00c9\3\2\2\2\u00ba\u00bb\7\33\2\2\u00bb\u00c9\t"+
		"\3\2\2\u00bc\u00bd\7,\2\2\u00bd\u00c2\5\66\34\2\u00be\u00bf\7\"\2\2\u00bf"+
		"\u00c1\5\66\34\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5"+
		"\u00c6\7\33\2\2\u00c6\u00c7\7@\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00b4\3\2"+
		"\2\2\u00c8\u00ba\3\2\2\2\u00c8\u00bc\3\2\2\2\u00c9\33\3\2\2\2\u00ca\u00cb"+
		"\t\4\2\2\u00cb\35\3\2\2\2\u00cc\u00cd\t\5\2\2\u00cd\37\3\2\2\2\u00ce\u00cf"+
		"\7*\2\2\u00cf\u00d4\5\"\22\2\u00d0\u00d1\7\"\2\2\u00d1\u00d3\5\"\22\2"+
		"\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\16\2\2"+
		"\u00d8!\3\2\2\2\u00d9\u00da\5\66\34\2\u00da\u00db\7%\2\2\u00db\u00dd\3"+
		"\2\2\2\u00dc\u00d9\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e4\5\66\34\2\u00df\u00e0\5\66\34\2\u00e0\u00e1\7%\2\2\u00e1\u00e2"+
		"\5$\23\2\u00e2\u00e4\3\2\2\2\u00e3\u00dc\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4"+
		"#\3\2\2\2\u00e5\u00e6\5&\24\2\u00e6\u00e9\7$\2\2\u00e7\u00ea\5\66\34\2"+
		"\u00e8\u00ea\7.\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ec\7)\2\2\u00ec\u00ed\5\66\34\2\u00ed\u00ee\7\22\2\2"+
		"\u00ee%\3\2\2\2\u00ef\u00f0\t\6\2\2\u00f0\'\3\2\2\2\u00f1\u00f2\7*\2\2"+
		"\u00f2\u00f7\5*\26\2\u00f3\u00f4\7\"\2\2\u00f4\u00f6\5*\26\2\u00f5\u00f3"+
		"\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\7\16\2\2\u00fb)\3\2\2\2"+
		"\u00fc\u00fd\5\66\34\2\u00fd\u00fe\7%\2\2\u00fe\u00ff\5\60\31\2\u00ff"+
		"\u0102\3\2\2\2\u0100\u0102\5\62\32\2\u0101\u00fc\3\2\2\2\u0101\u0100\3"+
		"\2\2\2\u0102+\3\2\2\2\u0103\u0104\b\27\1\2\u0104\u0105\5\60\31\2\u0105"+
		"\u0106\5.\30\2\u0106\u0107\5\60\31\2\u0107\u010e\3\2\2\2\u0108\u010e\5"+
		"\62\32\2\u0109\u010a\7$\2\2\u010a\u010b\5,\27\2\u010b\u010c\7\22\2\2\u010c"+
		"\u010e\3\2\2\2\u010d\u0103\3\2\2\2\u010d\u0108\3\2\2\2\u010d\u0109\3\2"+
		"\2\2\u010e\u0117\3\2\2\2\u010f\u0110\6\27\2\3\u0110\u0111\7+\2\2\u0111"+
		"\u0116\5,\27\2\u0112\u0113\6\27\3\3\u0113\u0114\7\5\2\2\u0114\u0116\5"+
		",\27\2\u0115\u010f\3\2\2\2\u0115\u0112\3\2\2\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0118\3\2\2\2\u0118-\3\2\2\2\u0119\u0117\3\2\2\2"+
		"\u011a\u011b\t\7\2\2\u011b/\3\2\2\2\u011c\u011d\b\31\1\2\u011d\u0127\5"+
		"\62\32\2\u011e\u0127\7@\2\2\u011f\u0127\t\b\2\2\u0120\u0127\7>\2\2\u0121"+
		"\u0127\7A\2\2\u0122\u0123\7$\2\2\u0123\u0124\5\60\31\2\u0124\u0125\7\22"+
		"\2\2\u0125\u0127\3\2\2\2\u0126\u011c\3\2\2\2\u0126\u011e\3\2\2\2\u0126"+
		"\u011f\3\2\2\2\u0126\u0120\3\2\2\2\u0126\u0121\3\2\2\2\u0126\u0122\3\2"+
		"\2\2\u0127\u0130\3\2\2\2\u0128\u0129\6\31\4\3\u0129\u012a\t\t\2\2\u012a"+
		"\u012f\5\60\31\2\u012b\u012c\6\31\5\3\u012c\u012d\t\n\2\2\u012d\u012f"+
		"\5\60\31\2\u012e\u0128\3\2\2\2\u012e\u012b\3\2\2\2\u012f\u0132\3\2\2\2"+
		"\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\61\3\2\2\2\u0132\u0130"+
		"\3\2\2\2\u0133\u0136\5\66\34\2\u0134\u0136\7.\2\2\u0135\u0133\3\2\2\2"+
		"\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0138\7\60\2\2\u0138\u013a"+
		"\5\66\34\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\63\3\2\2\2\u013b"+
		"\u013e\5\66\34\2\u013c\u013d\7\60\2\2\u013d\u013f\5\66\34\2\u013e\u013c"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\65\3\2\2\2\u0140\u0141\t\13\2\2\u0141"+
		"\67\3\2\2\2 ;Ppz\u0082\u008b\u0090\u0096\u009c\u00a4\u00a6\u00b0\u00b8"+
		"\u00c2\u00c8\u00d4\u00dc\u00e3\u00e9\u00f7\u0101\u010d\u0115\u0117\u0126"+
		"\u012e\u0130\u0135\u0139\u013e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}