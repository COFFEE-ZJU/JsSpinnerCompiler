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
		T__54=1, T__53=2, T__52=3, T__51=4, T__50=5, T__49=6, T__48=7, T__47=8, 
		T__46=9, T__45=10, T__44=11, T__43=12, T__42=13, T__41=14, T__40=15, T__39=16, 
		T__38=17, T__37=18, T__36=19, T__35=20, T__34=21, T__33=22, T__32=23, 
		T__31=24, T__30=25, T__29=26, T__28=27, T__27=28, T__26=29, T__25=30, 
		T__24=31, T__23=32, T__22=33, T__21=34, T__20=35, T__19=36, T__18=37, 
		T__17=38, T__16=39, T__15=40, T__14=41, T__13=42, T__12=43, T__11=44, 
		T__10=45, T__9=46, T__8=47, T__7=48, T__6=49, T__5=50, T__4=51, T__3=52, 
		T__2=53, T__1=54, T__0=55, TRUE=56, FALSE=57, NULL=58, ID=59, INT=60, 
		STRING=61, NEWLINE=62, WS=63;
	public static final String[] tokenNames = {
		"<INVALID>", "'into'", "'min'", "'or'", "'['", "'*'", "'<'", "'!='", "'<='", 
		"'range'", "'by'", "'readFromWrapper'", "'}'", "'max'", "'->'", "'now'", 
		"')'", "'seconds'", "'hours'", "'group'", "'='", "'dstream'", "'transform'", 
		"'days'", "'rstream'", "'rows'", "'filter'", "'window'", "'join'", "']'", 
		"'each'", "'in'", "','", "'-'", "'('", "':'", "'as'", "'readFromWrapperAsMaster'", 
		"'sum'", "'{'", "'and'", "'partitioned by'", "'unbounded'", "'$'", "'avg'", 
		"'.'", "'+'", "'minutes'", "'istream'", "';'", "'>'", "'where'", "'=='", 
		"'/'", "'>='", "'count'", "'true'", "'false'", "'null'", "ID", "INT", 
		"STRING", "NEWLINE", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_readStream = 2, RULE_assignView = 3, 
		RULE_join = 4, RULE_joinVar = 5, RULE_joinOut = 6, RULE_joinOutVar = 7, 
		RULE_pipe = 8, RULE_pipeExpr = 9, RULE_stream = 10, RULE_windowRange = 11, 
		RULE_timeRange = 12, RULE_timeUnit = 13, RULE_aggrExprs = 14, RULE_aggrExpr = 15, 
		RULE_aggrFunc = 16, RULE_aggrFuncName = 17, RULE_transExpr = 18, RULE_transExprVar = 19, 
		RULE_conditions = 20, RULE_comprator = 21, RULE_exprs = 22, RULE_var = 23, 
		RULE_varID = 24, RULE_idWithArray = 25, RULE_arraySymbol = 26, RULE_identifier = 27;
	public static final String[] ruleNames = {
		"prog", "stat", "readStream", "assignView", "join", "joinVar", "joinOut", 
		"joinOutVar", "pipe", "pipeExpr", "stream", "windowRange", "timeRange", 
		"timeUnit", "aggrExprs", "aggrExpr", "aggrFunc", "aggrFuncName", "transExpr", 
		"transExprVar", "conditions", "comprator", "exprs", "var", "varID", "idWithArray", 
		"arraySymbol", "identifier"
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
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56); stat();
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 15) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 42) | (1L << 44) | (1L << 47) | (1L << 48) | (1L << 51) | (1L << 55) | (1L << ID) | (1L << NEWLINE))) != 0) );
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
			setState(77);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); pipe();
				setState(62); match(49);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); join();
				setState(65); match(49);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); assignView();
				setState(68); match(49);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70); readStream();
				setState(71); match(49);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73); identifier();
				setState(74); match(49);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(76); match(NEWLINE);
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
			setState(79); identifier();
			setState(80); match(20);
			setState(81); match(11);
			setState(82); match(34);
			setState(83); match(STRING);
			setState(84); match(32);
			setState(85);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
			setState(88); identifier();
			setState(89); match(20);
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(90); pipe();
				}
				break;

			case 2:
				{
				setState(91); join();
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
			setState(94); match(28);
			setState(95); joinVar();
			setState(96); match(32);
			setState(97); joinVar();
			setState(98); match(51);
			setState(99); varID();
			setState(100); match(52);
			setState(101); varID();
			setState(102); match(1);
			setState(103); joinOut();
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
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitJoinVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinVarContext joinVar() throws RecognitionException {
		JoinVarContext _localctx = new JoinVarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_joinVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(105); identifier();
				setState(106); match(31);
				}
				break;
			}
			setState(110); identifier();
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
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitJoinOut(this);
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
			setState(112); match(39);
			setState(113); joinOutVar();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==32) {
				{
				{
				setState(114); match(32);
				setState(115); joinOutVar();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121); match(12);
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
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitJoinOutVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinOutVarContext joinOutVar() throws RecognitionException {
		JoinOutVarContext _localctx = new JoinOutVarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_joinOutVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(123); identifier();
				setState(124); match(35);
				}
				break;
			}
			setState(128); varID();
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
		enterRule(_localctx, 16, RULE_pipe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); identifier();
			setState(133); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131); match(14);
				setState(132); pipeExpr();
				}
				}
				setState(135); 
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TransExprContext transExpr() {
			return getRuleContext(TransExprContext.class,0);
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
		enterRule(_localctx, 18, RULE_pipeExpr);
		int _la;
		try {
			setState(171);
			switch (_input.LA(1)) {
			case 26:
				_localctx = new FilterLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137); match(26);
				setState(140);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(138); match(30);
					setState(139); identifier();
					}
					break;
				}
				setState(142); conditions(0);
				}
				break;
			case 22:
				_localctx = new TransformLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143); match(22);
				setState(146);
				_la = _input.LA(1);
				if (_la==30) {
					{
					setState(144); match(30);
					setState(145); identifier();
					}
				}

				setState(148); transExpr();
				}
				break;
			case 19:
				_localctx = new GroupSingleLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(149); match(19);
				setState(152);
				_la = _input.LA(1);
				if (_la==30) {
					{
					setState(150); ((GroupSingleLabelContext)_localctx).geach = match(30);
					setState(151); identifier();
					}
				}

				{
				setState(154); ((GroupSingleLabelContext)_localctx).gby = match(10);
				setState(155); identifier();
				setState(156); match(20);
				setState(157); var();
				setState(160);
				_la = _input.LA(1);
				if (_la==36) {
					{
					setState(158); ((GroupSingleLabelContext)_localctx).gas = match(36);
					setState(159); identifier();
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
				setState(165); match(27);
				setState(166); match(4);
				setState(167); windowRange();
				setState(168); match(29);
				}
				break;
			case 21:
			case 24:
			case 48:
				_localctx = new StreamLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(170); stream();
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
		enterRule(_localctx, 20, RULE_stream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		enterRule(_localctx, 22, RULE_windowRange);
		int _la;
		try {
			setState(195);
			switch (_input.LA(1)) {
			case 9:
				_localctx = new WindowTimeLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(175); match(9);
				setState(179);
				switch (_input.LA(1)) {
				case INT:
					{
					{
					setState(176); match(INT);
					}
					setState(177); timeUnit();
					}
					break;
				case 15:
				case 42:
					{
					setState(178); timeRange();
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
				setState(183); match(41);
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
		enterRule(_localctx, 24, RULE_timeRange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !(_la==15 || _la==42) ) {
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
		enterRule(_localctx, 26, RULE_timeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitAggrExprs(this);
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
			setState(201); match(39);
			setState(202); aggrExpr();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==32) {
				{
				{
				setState(203); match(32);
				setState(204); aggrExpr();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210); match(12);
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
		public VarIDContext varID() {
			return getRuleContext(VarIDContext.class,0);
		}
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
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitAggrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggrExprContext aggrExpr() throws RecognitionException {
		AggrExprContext _localctx = new AggrExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_aggrExpr);
		try {
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(212); identifier();
					setState(213); match(35);
					}
					break;
				}
				setState(217); varID();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(218); identifier();
				setState(219); match(35);
				setState(220); aggrFunc();
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AggrFuncNameContext aggrFuncName() {
			return getRuleContext(AggrFuncNameContext.class,0);
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
		enterRule(_localctx, 32, RULE_aggrFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); aggrFuncName();
			setState(225); match(34);
			setState(226); var();
			setState(227); match(16);
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
		enterRule(_localctx, 34, RULE_aggrFuncName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 13) | (1L << 38) | (1L << 44) | (1L << 55))) != 0)) ) {
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
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitTransExpr(this);
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
			setState(231); match(39);
			setState(232); transExprVar();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==32) {
				{
				{
				setState(233); match(32);
				setState(234); transExprVar();
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
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitTransExprVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransExprVarContext transExprVar() throws RecognitionException {
		TransExprVarContext _localctx = new TransExprVarContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_transExprVar);
		try {
			setState(247);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242); identifier();
				setState(243); match(35);
				setState(244); exprs(0);
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
		int _startState = 40;
		enterRecursionRule(_localctx, RULE_conditions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new CondCompLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(250); exprs(0);
				setState(251); comprator();
				setState(252); exprs(0);
				}
				break;

			case 2:
				{
				_localctx = new CondVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(254); var();
				}
				break;

			case 3:
				{
				_localctx = new CondSubLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255); match(34);
				setState(256); conditions(0);
				setState(257); match(16);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(267);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(261);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(262); match(40);
						setState(263); conditions(6);
						}
						break;

					case 2:
						{
						_localctx = new CondOrLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(264);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(265); match(3);
						setState(266); conditions(5);
						}
						break;
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 42, RULE_comprator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
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
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitExprMulDivLabel(this);
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
			setState(284);
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
			case 42:
			case 43:
			case 44:
			case 47:
			case 48:
			case 51:
			case 55:
			case ID:
				{
				_localctx = new ExprVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(275); var();
				}
				break;
			case INT:
				{
				_localctx = new ExprIntLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276); match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				{
				_localctx = new ExprBoolLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
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
				setState(278); match(NULL);
				}
				break;
			case STRING:
				{
				_localctx = new ExprStringLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279); match(STRING);
				}
				break;
			case 34:
				{
				_localctx = new ExprSubExprLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(280); match(34);
				setState(281); exprs(0);
				setState(282); match(16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(292);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(286);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(287);
						((ExprMulDivLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==53) ) {
							((ExprMulDivLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(288); exprs(9);
						}
						break;

					case 2:
						{
						_localctx = new ExprAddSubLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(289);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(290);
						((ExprAddSubLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==33 || _la==46) ) {
							((ExprAddSubLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(291); exprs(8);
						}
						break;
					}
					} 
				}
				setState(296);
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

	public static class VarContext extends ParserRuleContext {
		public Token dollar;
		public List<IdWithArrayContext> idWithArray() {
			return getRuleContexts(IdWithArrayContext.class);
		}
		public List<ArraySymbolContext> arraySymbol() {
			return getRuleContexts(ArraySymbolContext.class);
		}
		public IdWithArrayContext idWithArray(int i) {
			return getRuleContext(IdWithArrayContext.class,i);
		}
		public ArraySymbolContext arraySymbol(int i) {
			return getRuleContext(ArraySymbolContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		enterRule(_localctx, 46, RULE_var);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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
			case 42:
			case 44:
			case 47:
			case 48:
			case 51:
			case 55:
			case ID:
				{
				setState(297); identifier();
				}
				break;
			case 43:
				{
				setState(298); ((VarContext)_localctx).dollar = match(43);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(301); arraySymbol();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(307); match(45);
					setState(308); idWithArray();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(311); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		public List<IdWithArrayContext> idWithArray() {
			return getRuleContexts(IdWithArrayContext.class);
		}
		public IdWithArrayContext idWithArray(int i) {
			return getRuleContext(IdWithArrayContext.class,i);
		}
		public VarIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varID; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JaqlGrammarVisitor ) return ((JaqlGrammarVisitor<? extends T>)visitor).visitVarID(this);
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
			setState(313); idWithArray();
			}
			setState(316); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(314); match(45);
				setState(315); idWithArray();
				}
				}
				setState(318); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==45 );
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
		enterRule(_localctx, 50, RULE_idWithArray);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320); identifier();
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(321); arraySymbol();
					}
					} 
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		public TerminalNode INT() { return getToken(JaqlGrammarParser.INT, 0); }
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
		enterRule(_localctx, 52, RULE_arraySymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(327); match(4);
			setState(330);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(328); match(INT);
				}
				break;
			case 5:
				{
				setState(329); ((ArraySymbolContext)_localctx).star = match(5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(332); match(29);
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
		enterRule(_localctx, 54, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 15) | (1L << 17) | (1L << 18) | (1L << 19) | (1L << 21) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 30) | (1L << 31) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 42) | (1L << 44) | (1L << 47) | (1L << 48) | (1L << 51) | (1L << 55) | (1L << ID))) != 0)) ) {
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
		"\2\3A\u0153\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\6\2<"+
		"\n\2\r\2\16\2=\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3P\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\5\5_\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7"+
		"o\n\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bw\n\b\f\b\16\bz\13\b\3\b\3\b\3\t\3\t"+
		"\3\t\5\t\u0081\n\t\3\t\3\t\3\n\3\n\3\n\6\n\u0088\n\n\r\n\16\n\u0089\3"+
		"\13\3\13\3\13\5\13\u008f\n\13\3\13\3\13\3\13\3\13\5\13\u0095\n\13\3\13"+
		"\3\13\3\13\3\13\5\13\u009b\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a3"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ae\n\13\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\5\r\u00b6\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00be\n"+
		"\r\f\r\16\r\u00c1\13\r\3\r\3\r\3\r\5\r\u00c6\n\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\7\20\u00d0\n\20\f\20\16\20\u00d3\13\20\3\20\3\20\3"+
		"\21\3\21\3\21\5\21\u00da\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e1\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00ee\n\24"+
		"\f\24\16\24\u00f1\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00fa"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0106\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u010e\n\26\f\26\16\26\u0111\13\26"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u011f"+
		"\n\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0127\n\30\f\30\16\30\u012a\13"+
		"\30\3\31\3\31\5\31\u012e\n\31\3\31\7\31\u0131\n\31\f\31\16\31\u0134\13"+
		"\31\3\31\3\31\6\31\u0138\n\31\r\31\16\31\u0139\3\32\3\32\3\32\6\32\u013f"+
		"\n\32\r\32\16\32\u0140\3\33\3\33\7\33\u0145\n\33\f\33\16\33\u0148\13\33"+
		"\3\34\3\34\3\34\5\34\u014d\n\34\3\34\3\34\3\35\3\35\3\35\2\36\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\r\3:;\5\27\27"+
		"\32\32\62\62\4,,>>\4\21\21,,\5\23\24\31\31\61\61\7\4\4\17\17((..99\6\b"+
		"\n\64\64\66\6688\3:;\4\7\7\67\67\4##\60\60\20\3\4\13\r\17\17\21\21\23"+
		"\25\27\36 !&(,,..\61\62\65\6599==\u0163\2;\3\2\2\2\4O\3\2\2\2\6Q\3\2\2"+
		"\2\bZ\3\2\2\2\n`\3\2\2\2\fn\3\2\2\2\16r\3\2\2\2\20\u0080\3\2\2\2\22\u0084"+
		"\3\2\2\2\24\u00ad\3\2\2\2\26\u00af\3\2\2\2\30\u00c5\3\2\2\2\32\u00c7\3"+
		"\2\2\2\34\u00c9\3\2\2\2\36\u00cb\3\2\2\2 \u00e0\3\2\2\2\"\u00e2\3\2\2"+
		"\2$\u00e7\3\2\2\2&\u00e9\3\2\2\2(\u00f9\3\2\2\2*\u0105\3\2\2\2,\u0112"+
		"\3\2\2\2.\u011e\3\2\2\2\60\u012d\3\2\2\2\62\u013b\3\2\2\2\64\u0142\3\2"+
		"\2\2\66\u0149\3\2\2\28\u0150\3\2\2\2:<\5\4\3\2;:\3\2\2\2<=\3\2\2\2=;\3"+
		"\2\2\2=>\3\2\2\2>\3\3\2\2\2?@\5\22\n\2@A\7\63\2\2AP\3\2\2\2BC\5\n\6\2"+
		"CD\7\63\2\2DP\3\2\2\2EF\5\b\5\2FG\7\63\2\2GP\3\2\2\2HI\5\6\4\2IJ\7\63"+
		"\2\2JP\3\2\2\2KL\58\35\2LM\7\63\2\2MP\3\2\2\2NP\7@\2\2O?\3\2\2\2OB\3\2"+
		"\2\2OE\3\2\2\2OH\3\2\2\2OK\3\2\2\2ON\3\2\2\2P\5\3\2\2\2QR\58\35\2RS\7"+
		"\26\2\2ST\7\r\2\2TU\7$\2\2UV\7?\2\2VW\7\"\2\2WX\t\2\2\2XY\7\22\2\2Y\7"+
		"\3\2\2\2Z[\58\35\2[^\7\26\2\2\\_\5\22\n\2]_\5\n\6\2^\\\3\2\2\2^]\3\2\2"+
		"\2_\t\3\2\2\2`a\7\36\2\2ab\5\f\7\2bc\7\"\2\2cd\5\f\7\2de\7\65\2\2ef\5"+
		"\62\32\2fg\7\66\2\2gh\5\62\32\2hi\7\3\2\2ij\5\16\b\2j\13\3\2\2\2kl\58"+
		"\35\2lm\7!\2\2mo\3\2\2\2nk\3\2\2\2no\3\2\2\2op\3\2\2\2pq\58\35\2q\r\3"+
		"\2\2\2rs\7)\2\2sx\5\20\t\2tu\7\"\2\2uw\5\20\t\2vt\3\2\2\2wz\3\2\2\2xv"+
		"\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{|\7\16\2\2|\17\3\2\2\2}~\58\35"+
		"\2~\177\7%\2\2\177\u0081\3\2\2\2\u0080}\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\5\62\32\2\u0083\21\3\2\2\2\u0084\u0087\58\35"+
		"\2\u0085\u0086\7\20\2\2\u0086\u0088\5\24\13\2\u0087\u0085\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\23\3\2\2"+
		"\2\u008b\u008e\7\34\2\2\u008c\u008d\7 \2\2\u008d\u008f\58\35\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u00ae\5*\26\2\u0091"+
		"\u0094\7\30\2\2\u0092\u0093\7 \2\2\u0093\u0095\58\35\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u00ae\5&\24\2\u0097"+
		"\u009a\7\25\2\2\u0098\u0099\7 \2\2\u0099\u009b\58\35\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\f\2\2\u009d"+
		"\u009e\58\35\2\u009e\u009f\7\26\2\2\u009f\u00a2\5\60\31\2\u00a0\u00a1"+
		"\7&\2\2\u00a1\u00a3\58\35\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\7\3\2\2\u00a5\u00a6\5\36\20\2\u00a6\u00ae\3"+
		"\2\2\2\u00a7\u00a8\7\35\2\2\u00a8\u00a9\7\6\2\2\u00a9\u00aa\5\30\r\2\u00aa"+
		"\u00ab\7\37\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00ae\5\26\f\2\u00ad\u008b\3"+
		"\2\2\2\u00ad\u0091\3\2\2\2\u00ad\u0097\3\2\2\2\u00ad\u00a7\3\2\2\2\u00ad"+
		"\u00ac\3\2\2\2\u00ae\25\3\2\2\2\u00af\u00b0\t\3\2\2\u00b0\27\3\2\2\2\u00b1"+
		"\u00b5\7\13\2\2\u00b2\u00b3\7>\2\2\u00b3\u00b6\5\34\17\2\u00b4\u00b6\5"+
		"\32\16\2\u00b5\u00b2\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00c6\3\2\2\2\u00b7"+
		"\u00b8\7\33\2\2\u00b8\u00c6\t\4\2\2\u00b9\u00ba\7+\2\2\u00ba\u00bf\58"+
		"\35\2\u00bb\u00bc\7\"\2\2\u00bc\u00be\58\35\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2"+
		"\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\33\2\2\u00c3\u00c4\7>\2\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00b1\3\2\2\2\u00c5\u00b7\3\2\2\2\u00c5\u00b9\3\2"+
		"\2\2\u00c6\31\3\2\2\2\u00c7\u00c8\t\5\2\2\u00c8\33\3\2\2\2\u00c9\u00ca"+
		"\t\6\2\2\u00ca\35\3\2\2\2\u00cb\u00cc\7)\2\2\u00cc\u00d1\5 \21\2\u00cd"+
		"\u00ce\7\"\2\2\u00ce\u00d0\5 \21\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2"+
		"\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3"+
		"\u00d1\3\2\2\2\u00d4\u00d5\7\16\2\2\u00d5\37\3\2\2\2\u00d6\u00d7\58\35"+
		"\2\u00d7\u00d8\7%\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00da"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e1\5\62\32\2\u00dc\u00dd\58\35\2"+
		"\u00dd\u00de\7%\2\2\u00de\u00df\5\"\22\2\u00df\u00e1\3\2\2\2\u00e0\u00d9"+
		"\3\2\2\2\u00e0\u00dc\3\2\2\2\u00e1!\3\2\2\2\u00e2\u00e3\5$\23\2\u00e3"+
		"\u00e4\7$\2\2\u00e4\u00e5\5\60\31\2\u00e5\u00e6\7\22\2\2\u00e6#\3\2\2"+
		"\2\u00e7\u00e8\t\7\2\2\u00e8%\3\2\2\2\u00e9\u00ea\7)\2\2\u00ea\u00ef\5"+
		"(\25\2\u00eb\u00ec\7\"\2\2\u00ec\u00ee\5(\25\2\u00ed\u00eb\3\2\2\2\u00ee"+
		"\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\16\2\2\u00f3\'\3\2\2\2\u00f4\u00f5"+
		"\58\35\2\u00f5\u00f6\7%\2\2\u00f6\u00f7\5.\30\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00fa\5\60\31\2\u00f9\u00f4\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa)\3\2\2"+
		"\2\u00fb\u00fc\b\26\1\2\u00fc\u00fd\5.\30\2\u00fd\u00fe\5,\27\2\u00fe"+
		"\u00ff\5.\30\2\u00ff\u0106\3\2\2\2\u0100\u0106\5\60\31\2\u0101\u0102\7"+
		"$\2\2\u0102\u0103\5*\26\2\u0103\u0104\7\22\2\2\u0104\u0106\3\2\2\2\u0105"+
		"\u00fb\3\2\2\2\u0105\u0100\3\2\2\2\u0105\u0101\3\2\2\2\u0106\u010f\3\2"+
		"\2\2\u0107\u0108\6\26\2\3\u0108\u0109\7*\2\2\u0109\u010e\5*\26\2\u010a"+
		"\u010b\6\26\3\3\u010b\u010c\7\5\2\2\u010c\u010e\5*\26\2\u010d\u0107\3"+
		"\2\2\2\u010d\u010a\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110+\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\t\b\2\2"+
		"\u0113-\3\2\2\2\u0114\u0115\b\30\1\2\u0115\u011f\5\60\31\2\u0116\u011f"+
		"\7>\2\2\u0117\u011f\t\t\2\2\u0118\u011f\7<\2\2\u0119\u011f\7?\2\2\u011a"+
		"\u011b\7$\2\2\u011b\u011c\5.\30\2\u011c\u011d\7\22\2\2\u011d\u011f\3\2"+
		"\2\2\u011e\u0114\3\2\2\2\u011e\u0116\3\2\2\2\u011e\u0117\3\2\2\2\u011e"+
		"\u0118\3\2\2\2\u011e\u0119\3\2\2\2\u011e\u011a\3\2\2\2\u011f\u0128\3\2"+
		"\2\2\u0120\u0121\6\30\4\3\u0121\u0122\t\n\2\2\u0122\u0127\5.\30\2\u0123"+
		"\u0124\6\30\5\3\u0124\u0125\t\13\2\2\u0125\u0127\5.\30\2\u0126\u0120\3"+
		"\2\2\2\u0126\u0123\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129/\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012e\58\35\2"+
		"\u012c\u012e\7-\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\u0132"+
		"\3\2\2\2\u012f\u0131\5\66\34\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2"+
		"\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0137\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0135\u0136\7/\2\2\u0136\u0138\5\64\33\2\u0137\u0135\3\2\2\2"+
		"\u0138\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\61"+
		"\3\2\2\2\u013b\u013e\5\64\33\2\u013c\u013d\7/\2\2\u013d\u013f\5\64\33"+
		"\2\u013e\u013c\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\63\3\2\2\2\u0142\u0146\58\35\2\u0143\u0145\5\66\34\2\u0144"+
		"\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\65\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014c\7\6\2\2\u014a\u014d"+
		"\7>\2\2\u014b\u014d\7\7\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014f\7\37\2\2\u014f\67\3\2\2\2\u0150\u0151\t\f\2"+
		"\2\u01519\3\2\2\2\"=O^nx\u0080\u0089\u008e\u0094\u009a\u00a2\u00ad\u00b5"+
		"\u00bf\u00c5\u00d1\u00d9\u00e0\u00ef\u00f9\u0105\u010d\u010f\u011e\u0126"+
		"\u0128\u012d\u0132\u0139\u0140\u0146\u014c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}