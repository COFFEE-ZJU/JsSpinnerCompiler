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
		"';'", "'>'", "'where'", "'=='", "'/'", "'count'", "'>='", "'true'", "'false'", 
		"'null'", "ID", "INT", "STRING", "NEWLINE", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_setMaster = 2, RULE_readStream = 3, 
		RULE_assignView = 4, RULE_join = 5, RULE_joinVar = 6, RULE_joinOut = 7, 
		RULE_joinOutVar = 8, RULE_pipe = 9, RULE_pipeExpr = 10, RULE_stream = 11, 
		RULE_windowRange = 12, RULE_timeUnit = 13, RULE_aggrExprs = 14, RULE_aggrExpr = 15, 
		RULE_aggrFunc = 16, RULE_aggrFuncName = 17, RULE_transExpr = 18, RULE_conditions = 19, 
		RULE_comprator = 20, RULE_exprs = 21, RULE_var = 22, RULE_varID = 23, 
		RULE_identifier = 24;
	public static final String[] ruleNames = {
		"prog", "stat", "setMaster", "readStream", "assignView", "join", "joinVar", 
		"joinOut", "joinOutVar", "pipe", "pipeExpr", "stream", "windowRange", 
		"timeUnit", "aggrExprs", "aggrExpr", "aggrFunc", "aggrFuncName", "transExpr", 
		"conditions", "comprator", "exprs", "var", "varID", "identifier"
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
			} while ( ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (1 - 1)) | (1L << (2 - 1)) | (1L << (9 - 1)) | (1L << (10 - 1)) | (1L << (11 - 1)) | (1L << (13 - 1)) | (1L << (15 - 1)) | (1L << (17 - 1)) | (1L << (18 - 1)) | (1L << (19 - 1)) | (1L << (21 - 1)) | (1L << (22 - 1)) | (1L << (23 - 1)) | (1L << (24 - 1)) | (1L << (25 - 1)) | (1L << (26 - 1)) | (1L << (27 - 1)) | (1L << (28 - 1)) | (1L << (30 - 1)) | (1L << (31 - 1)) | (1L << (36 - 1)) | (1L << (37 - 1)) | (1L << (38 - 1)) | (1L << (43 - 1)) | (1L << (45 - 1)) | (1L << (47 - 1)) | (1L << (49 - 1)) | (1L << (50 - 1)) | (1L << (53 - 1)) | (1L << (56 - 1)) | (1L << (ID - 1)) | (1L << (NEWLINE - 1)))) != 0) );
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
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); pipe();
				setState(56); match(51);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); join();
				setState(59); match(51);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61); assignView();
				setState(62); match(51);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64); readStream();
				setState(65); match(51);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(67); identifier();
				setState(68); match(51);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70); setMaster();
				setState(71); match(51);
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(73); match(NEWLINE);
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
			setState(76); match(47);
			setState(77); match(34);
			setState(78); identifier();
			setState(79); match(16);
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
			setState(81); identifier();
			setState(82); match(20);
			setState(83); match(11);
			setState(84); match(34);
			setState(85); match(STRING);
			setState(86); match(16);
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
			setState(88); identifier();
			setState(89); match(20);
			setState(90); pipe();
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
			setState(92); match(28);
			setState(93); joinVar();
			setState(94); match(32);
			setState(95); joinVar();
			setState(96); match(53);
			setState(97); varID();
			setState(98); match(54);
			setState(99); varID();
			setState(100); match(1);
			setState(101); joinOut();
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
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(103); identifier();
				setState(104); match(31);
				}
				break;
			}
			setState(108); identifier();
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
			setState(110); match(40);
			setState(111); joinOutVar();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==32) {
				{
				{
				setState(112); match(32);
				setState(113); joinOutVar();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119); match(12);
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
			setState(124);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(121); identifier();
				setState(122); match(35);
				}
				break;
			}
			setState(126); varID();
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
			setState(128); identifier();
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129); match(14);
				setState(130); pipeExpr();
				}
				}
				setState(133); 
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
		enterRule(_localctx, 20, RULE_pipeExpr);
		int _la;
		try {
			setState(170);
			switch (_input.LA(1)) {
			case 26:
				_localctx = new FilterLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(135); match(26);
				setState(138);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(136); match(30);
					setState(137); identifier();
					}
					break;
				}
				setState(140); conditions(0);
				}
				break;
			case 22:
				_localctx = new TansformLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141); match(22);
				setState(144);
				_la = _input.LA(1);
				if (_la==30) {
					{
					setState(142); match(30);
					setState(143); identifier();
					}
				}

				setState(146); transExpr();
				}
				break;
			case 19:
				_localctx = new GroupSingleLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(147); match(19);
				setState(150);
				_la = _input.LA(1);
				if (_la==30) {
					{
					setState(148); ((GroupSingleLabelContext)_localctx).geach = match(30);
					setState(149); identifier();
					}
				}

				setState(160);
				_la = _input.LA(1);
				if (_la==10) {
					{
					setState(152); ((GroupSingleLabelContext)_localctx).gby = match(10);
					setState(153); identifier();
					setState(154); match(20);
					setState(155); var();
					setState(158);
					_la = _input.LA(1);
					if (_la==36) {
						{
						setState(156); ((GroupSingleLabelContext)_localctx).gas = match(36);
						setState(157); identifier();
						}
					}

					}
				}

				setState(162); match(1);
				setState(163); aggrExprs();
				}
				break;
			case 27:
				_localctx = new WindowLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(164); match(27);
				setState(165); match(4);
				setState(166); windowRange();
				setState(167); match(29);
				}
				break;
			case 21:
			case 24:
			case 50:
				_localctx = new StreamLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(169); stream();
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
			setState(172);
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
			setState(195);
			switch (_input.LA(1)) {
			case 9:
				_localctx = new WindowTimeLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174); match(9);
				setState(179);
				switch (_input.LA(1)) {
				case INT:
					{
					{
					setState(175); match(INT);
					}
					setState(176); timeUnit();
					}
					break;
				case 43:
					{
					setState(177); match(43);
					}
					break;
				case 15:
					{
					setState(178); match(15);
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
				setState(181); match(25);
				setState(182);
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
				setState(183); match(42);
				setState(184); identifier();
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==32) {
					{
					{
					setState(185); match(32);
					setState(186); identifier();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192); match(25);
				setState(193); match(INT);
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
		enterRule(_localctx, 26, RULE_timeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
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
		enterRule(_localctx, 28, RULE_aggrExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); match(40);
			setState(200); aggrExpr();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==32) {
				{
				{
				setState(201); match(32);
				setState(202); aggrExpr();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208); match(12);
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
		public AggrFuncContext aggrFunc() {
			return getRuleContext(AggrFuncContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210); identifier();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(211); identifier();
				setState(212); match(35);
				setState(213); aggrFunc();
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
		enterRule(_localctx, 32, RULE_aggrFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); aggrFuncName();
			setState(218); match(34);
			setState(221);
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
			case 56:
			case ID:
				{
				setState(219); identifier();
				}
				break;
			case 44:
				{
				setState(220); match(44);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(223); match(39);
			setState(224); identifier();
			setState(225); match(16);
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
			setState(227);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 13) | (1L << 38) | (1L << 45) | (1L << 56))) != 0)) ) {
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
		enterRule(_localctx, 36, RULE_transExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); match(40);
			setState(230); var();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==32) {
				{
				{
				setState(231); match(32);
				setState(232); var();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238); match(12);
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
		int _startState = 38;
		enterRecursionRule(_localctx, RULE_conditions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new CondCompLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(241); exprs(0);
				setState(242); comprator();
				setState(243); exprs(0);
				}
				break;

			case 2:
				{
				_localctx = new CondVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245); var();
				}
				break;

			case 3:
				{
				_localctx = new CondSubLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(246); match(34);
				setState(247); conditions(0);
				setState(248); match(16);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(258);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(252);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(253); match(41);
						setState(254); conditions(6);
						}
						break;

					case 2:
						{
						_localctx = new CondOrLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(255);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(256); match(3);
						setState(257); conditions(5);
						}
						break;
					}
					} 
				}
				setState(262);
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
		enterRule(_localctx, 40, RULE_comprator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 8) | (1L << 52) | (1L << 54) | (1L << 57))) != 0)) ) {
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
		int _startState = 42;
		enterRecursionRule(_localctx, RULE_exprs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
			case 56:
			case ID:
				{
				_localctx = new ExprVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(266); var();
				}
				break;
			case INT:
				{
				_localctx = new ExprIntLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267); match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				{
				_localctx = new ExprBoolLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(268);
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
				setState(269); match(NULL);
				}
				break;
			case STRING:
				{
				_localctx = new ExprStringLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270); match(STRING);
				}
				break;
			case 34:
				{
				_localctx = new ExprSubExprLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(271); match(34);
				setState(272); exprs(0);
				setState(273); match(16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(283);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(277);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(278);
						((ExprMulDivLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==55) ) {
							((ExprMulDivLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(279); exprs(9);
						}
						break;

					case 2:
						{
						_localctx = new ExprAddSubLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(280);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(281);
						((ExprAddSubLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==33 || _la==48) ) {
							((ExprAddSubLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(282); exprs(8);
						}
						break;
					}
					} 
				}
				setState(287);
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
		enterRule(_localctx, 44, RULE_var);
		try {
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
			case 56:
			case ID:
				{
				setState(288); identifier();
				}
				break;
			case 44:
				{
				setState(289); match(44);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(294);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(292); match(46);
				setState(293); identifier();
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
		enterRule(_localctx, 46, RULE_varID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(296); identifier();
			}
			setState(299);
			_la = _input.LA(1);
			if (_la==46) {
				{
				setState(297); match(46);
				setState(298); identifier();
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
		enterRule(_localctx, 48, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 15) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 43) | (1L << 45) | (1L << 49) | (1L << 50) | (1L << 53) | (1L << 56) | (1L << ID))) != 0)) ) {
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
		case 19: return conditions_sempred((ConditionsContext)_localctx, predIndex);

		case 21: return exprs_sempred((ExprsContext)_localctx, predIndex);
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
		"\2\3C\u0132\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\3\2\6\2\66\n\2\r\2\16\2\67\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3M"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\bm\n\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\7\tu\n\t\f\t\16\tx\13\t\3\t\3\t\3\n\3\n\3\n\5\n\177"+
		"\n\n\3\n\3\n\3\13\3\13\3\13\6\13\u0086\n\13\r\13\16\13\u0087\3\f\3\f\3"+
		"\f\5\f\u008d\n\f\3\f\3\f\3\f\3\f\5\f\u0093\n\f\3\f\3\f\3\f\3\f\5\f\u0099"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a1\n\f\5\f\u00a3\n\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00ad\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00b6\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00be\n\16\f\16\16\16\u00c1"+
		"\13\16\3\16\3\16\3\16\5\16\u00c6\n\16\3\17\3\17\3\20\3\20\3\20\3\20\7"+
		"\20\u00ce\n\20\f\20\16\20\u00d1\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u00da\n\21\3\22\3\22\3\22\3\22\5\22\u00e0\n\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00ec\n\24\f\24\16\24\u00ef\13"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00fd"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0105\n\25\f\25\16\25\u0108\13"+
		"\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0116"+
		"\n\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u011e\n\27\f\27\16\27\u0121\13"+
		"\27\3\30\3\30\5\30\u0125\n\30\3\30\3\30\5\30\u0129\n\30\3\31\3\31\3\31"+
		"\5\31\u012e\n\31\3\32\3\32\3\32\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\2\13\5\27\27\32\32\64\64\4--@@\5\23\24\31\31\63"+
		"\63\7\4\4\17\17((//::\6\b\n\66\6688;;\3<=\4\7\799\4##\62\62\20\3\4\13"+
		"\r\17\17\21\21\23\25\27\36 !&(--//\63\64\67\67::??\u0143\2\65\3\2\2\2"+
		"\4L\3\2\2\2\6N\3\2\2\2\bS\3\2\2\2\nZ\3\2\2\2\f^\3\2\2\2\16l\3\2\2\2\20"+
		"p\3\2\2\2\22~\3\2\2\2\24\u0082\3\2\2\2\26\u00ac\3\2\2\2\30\u00ae\3\2\2"+
		"\2\32\u00c5\3\2\2\2\34\u00c7\3\2\2\2\36\u00c9\3\2\2\2 \u00d9\3\2\2\2\""+
		"\u00db\3\2\2\2$\u00e5\3\2\2\2&\u00e7\3\2\2\2(\u00fc\3\2\2\2*\u0109\3\2"+
		"\2\2,\u0115\3\2\2\2.\u0124\3\2\2\2\60\u012a\3\2\2\2\62\u012f\3\2\2\2\64"+
		"\66\5\4\3\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\3\3"+
		"\2\2\29:\5\24\13\2:;\7\65\2\2;M\3\2\2\2<=\5\f\7\2=>\7\65\2\2>M\3\2\2\2"+
		"?@\5\n\6\2@A\7\65\2\2AM\3\2\2\2BC\5\b\5\2CD\7\65\2\2DM\3\2\2\2EF\5\62"+
		"\32\2FG\7\65\2\2GM\3\2\2\2HI\5\6\4\2IJ\7\65\2\2JM\3\2\2\2KM\7B\2\2L9\3"+
		"\2\2\2L<\3\2\2\2L?\3\2\2\2LB\3\2\2\2LE\3\2\2\2LH\3\2\2\2LK\3\2\2\2M\5"+
		"\3\2\2\2NO\7\61\2\2OP\7$\2\2PQ\5\62\32\2QR\7\22\2\2R\7\3\2\2\2ST\5\62"+
		"\32\2TU\7\26\2\2UV\7\r\2\2VW\7$\2\2WX\7A\2\2XY\7\22\2\2Y\t\3\2\2\2Z[\5"+
		"\62\32\2[\\\7\26\2\2\\]\5\24\13\2]\13\3\2\2\2^_\7\36\2\2_`\5\16\b\2`a"+
		"\7\"\2\2ab\5\16\b\2bc\7\67\2\2cd\5\60\31\2de\78\2\2ef\5\60\31\2fg\7\3"+
		"\2\2gh\5\20\t\2h\r\3\2\2\2ij\5\62\32\2jk\7!\2\2km\3\2\2\2li\3\2\2\2lm"+
		"\3\2\2\2mn\3\2\2\2no\5\62\32\2o\17\3\2\2\2pq\7*\2\2qv\5\22\n\2rs\7\"\2"+
		"\2su\5\22\n\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2"+
		"\2\2yz\7\16\2\2z\21\3\2\2\2{|\5\62\32\2|}\7%\2\2}\177\3\2\2\2~{\3\2\2"+
		"\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\5\60\31\2\u0081\23\3\2\2"+
		"\2\u0082\u0085\5\62\32\2\u0083\u0084\7\20\2\2\u0084\u0086\5\26\f\2\u0085"+
		"\u0083\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\25\3\2\2\2\u0089\u008c\7\34\2\2\u008a\u008b\7 \2\2\u008b\u008d"+
		"\5\62\32\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2"+
		"\u008e\u00ad\5(\25\2\u008f\u0092\7\30\2\2\u0090\u0091\7 \2\2\u0091\u0093"+
		"\5\62\32\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2"+
		"\u0094\u00ad\5&\24\2\u0095\u0098\7\25\2\2\u0096\u0097\7 \2\2\u0097\u0099"+
		"\5\62\32\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a2\3\2\2\2"+
		"\u009a\u009b\7\f\2\2\u009b\u009c\5\62\32\2\u009c\u009d\7\26\2\2\u009d"+
		"\u00a0\5.\30\2\u009e\u009f\7&\2\2\u009f\u00a1\5\62\32\2\u00a0\u009e\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009a\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\3\2\2\u00a5\u00ad\5\36"+
		"\20\2\u00a6\u00a7\7\35\2\2\u00a7\u00a8\7\6\2\2\u00a8\u00a9\5\32\16\2\u00a9"+
		"\u00aa\7\37\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00ad\5\30\r\2\u00ac\u0089\3"+
		"\2\2\2\u00ac\u008f\3\2\2\2\u00ac\u0095\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\27\3\2\2\2\u00ae\u00af\t\2\2\2\u00af\31\3\2\2\2\u00b0"+
		"\u00b5\7\13\2\2\u00b1\u00b2\7@\2\2\u00b2\u00b6\5\34\17\2\u00b3\u00b6\7"+
		"-\2\2\u00b4\u00b6\7\21\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00c6\3\2\2\2\u00b7\u00b8\7\33\2\2\u00b8\u00c6\t"+
		"\3\2\2\u00b9\u00ba\7,\2\2\u00ba\u00bf\5\62\32\2\u00bb\u00bc\7\"\2\2\u00bc"+
		"\u00be\5\62\32\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3"+
		"\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2"+
		"\u00c3\7\33\2\2\u00c3\u00c4\7@\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00b0\3\2"+
		"\2\2\u00c5\u00b7\3\2\2\2\u00c5\u00b9\3\2\2\2\u00c6\33\3\2\2\2\u00c7\u00c8"+
		"\t\4\2\2\u00c8\35\3\2\2\2\u00c9\u00ca\7*\2\2\u00ca\u00cf\5 \21\2\u00cb"+
		"\u00cc\7\"\2\2\u00cc\u00ce\5 \21\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d3\7\16\2\2\u00d3\37\3\2\2\2\u00d4\u00da\5\62"+
		"\32\2\u00d5\u00d6\5\62\32\2\u00d6\u00d7\7%\2\2\u00d7\u00d8\5\"\22\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00d5\3\2\2\2\u00da!\3\2\2\2"+
		"\u00db\u00dc\5$\23\2\u00dc\u00df\7$\2\2\u00dd\u00e0\5\62\32\2\u00de\u00e0"+
		"\7.\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e2\7)\2\2\u00e2\u00e3\5\62\32\2\u00e3\u00e4\7\22\2\2\u00e4#\3\2\2"+
		"\2\u00e5\u00e6\t\5\2\2\u00e6%\3\2\2\2\u00e7\u00e8\7*\2\2\u00e8\u00ed\5"+
		".\30\2\u00e9\u00ea\7\"\2\2\u00ea\u00ec\5.\30\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7\16\2\2\u00f1\'\3\2\2\2\u00f2\u00f3"+
		"\b\25\1\2\u00f3\u00f4\5,\27\2\u00f4\u00f5\5*\26\2\u00f5\u00f6\5,\27\2"+
		"\u00f6\u00fd\3\2\2\2\u00f7\u00fd\5.\30\2\u00f8\u00f9\7$\2\2\u00f9\u00fa"+
		"\5(\25\2\u00fa\u00fb\7\22\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f2\3\2\2\2"+
		"\u00fc\u00f7\3\2\2\2\u00fc\u00f8\3\2\2\2\u00fd\u0106\3\2\2\2\u00fe\u00ff"+
		"\6\25\2\3\u00ff\u0100\7+\2\2\u0100\u0105\5(\25\2\u0101\u0102\6\25\3\3"+
		"\u0102\u0103\7\5\2\2\u0103\u0105\5(\25\2\u0104\u00fe\3\2\2\2\u0104\u0101"+
		"\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		")\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a\t\6\2\2\u010a+\3\2\2\2\u010b"+
		"\u010c\b\27\1\2\u010c\u0116\5.\30\2\u010d\u0116\7@\2\2\u010e\u0116\t\7"+
		"\2\2\u010f\u0116\7>\2\2\u0110\u0116\7A\2\2\u0111\u0112\7$\2\2\u0112\u0113"+
		"\5,\27\2\u0113\u0114\7\22\2\2\u0114\u0116\3\2\2\2\u0115\u010b\3\2\2\2"+
		"\u0115\u010d\3\2\2\2\u0115\u010e\3\2\2\2\u0115\u010f\3\2\2\2\u0115\u0110"+
		"\3\2\2\2\u0115\u0111\3\2\2\2\u0116\u011f\3\2\2\2\u0117\u0118\6\27\4\3"+
		"\u0118\u0119\t\b\2\2\u0119\u011e\5,\27\2\u011a\u011b\6\27\5\3\u011b\u011c"+
		"\t\t\2\2\u011c\u011e\5,\27\2\u011d\u0117\3\2\2\2\u011d\u011a\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120-\3\2\2\2"+
		"\u0121\u011f\3\2\2\2\u0122\u0125\5\62\32\2\u0123\u0125\7.\2\2\u0124\u0122"+
		"\3\2\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0127\7\60\2\2"+
		"\u0127\u0129\5\62\32\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129/"+
		"\3\2\2\2\u012a\u012d\5\62\32\2\u012b\u012c\7\60\2\2\u012c\u012e\5\62\32"+
		"\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\61\3\2\2\2\u012f\u0130"+
		"\t\n\2\2\u0130\63\3\2\2\2\36\67Llv~\u0087\u008c\u0092\u0098\u00a0\u00a2"+
		"\u00ac\u00b5\u00bf\u00c5\u00cf\u00d9\u00df\u00ed\u00fc\u0104\u0106\u0115"+
		"\u011d\u011f\u0124\u0128\u012d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}