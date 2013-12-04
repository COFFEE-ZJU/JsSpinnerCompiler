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
		"')'", "'expand'", "'seconds'", "'hours'", "'group'", "'='", "'dstream'", 
		"'transform'", "'days'", "'rstream'", "'rows'", "'filter'", "'window'", 
		"'join'", "']'", "'each'", "'in'", "','", "'-'", "'('", "':'", "'as'", 
		"'readFromWrapperAsMaster'", "'sum'", "'{'", "'and'", "'partitioned by'", 
		"'unbounded'", "'$'", "'avg'", "'.'", "'+'", "'minutes'", "'preserve'", 
		"'istream'", "';'", "'>'", "'where'", "'=='", "'/'", "'>='", "'count'", 
		"'true'", "'false'", "'null'", "ID", "INT", "STRING", "NEWLINE", "WS"
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
			} while ( ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (1 - 1)) | (1L << (2 - 1)) | (1L << (9 - 1)) | (1L << (10 - 1)) | (1L << (11 - 1)) | (1L << (13 - 1)) | (1L << (15 - 1)) | (1L << (18 - 1)) | (1L << (19 - 1)) | (1L << (20 - 1)) | (1L << (22 - 1)) | (1L << (23 - 1)) | (1L << (24 - 1)) | (1L << (25 - 1)) | (1L << (26 - 1)) | (1L << (27 - 1)) | (1L << (28 - 1)) | (1L << (29 - 1)) | (1L << (31 - 1)) | (1L << (32 - 1)) | (1L << (37 - 1)) | (1L << (38 - 1)) | (1L << (39 - 1)) | (1L << (43 - 1)) | (1L << (45 - 1)) | (1L << (48 - 1)) | (1L << (50 - 1)) | (1L << (53 - 1)) | (1L << (57 - 1)) | (1L << (ID - 1)) | (1L << (NEWLINE - 1)))) != 0) );
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
				setState(62); match(51);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); join();
				setState(65); match(51);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); assignView();
				setState(68); match(51);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70); readStream();
				setState(71); match(51);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(73); identifier();
				setState(74); match(51);
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
			setState(80); match(21);
			setState(81); match(11);
			setState(82); match(35);
			setState(83); match(STRING);
			setState(84); match(33);
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
			setState(89); match(21);
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
			setState(94); match(29);
			setState(95); joinVar();
			setState(96); match(33);
			setState(97); joinVar();
			setState(98); match(53);
			setState(99); varID();
			setState(100); match(54);
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
			setState(106);
			_la = _input.LA(1);
			if (_la==49) {
				{
				setState(105); ((JoinVarContext)_localctx).preserve = match(49);
				}
			}

			setState(111);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(108); identifier();
				setState(109); match(32);
				}
				break;
			}
			setState(113); identifier();
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
			setState(115); match(40);
			setState(116); joinOutVar();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(117); match(33);
				setState(118); joinOutVar();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124); match(12);
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
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(126); identifier();
				setState(127); match(36);
				}
				break;
			}
			setState(131); varID();
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
			setState(133); identifier();
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(134); match(14);
				setState(135); pipeExpr();
				}
				}
				setState(138); 
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
	public static class ExpandLabelContext extends PipeExprContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
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
		enterRule(_localctx, 18, RULE_pipeExpr);
		int _la;
		try {
			setState(182);
			switch (_input.LA(1)) {
			case 27:
				_localctx = new FilterLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140); match(27);
				setState(143);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(141); match(31);
					setState(142); identifier();
					}
					break;
				}
				setState(145); conditions(0);
				}
				break;
			case 23:
				_localctx = new TransformLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146); match(23);
				setState(149);
				_la = _input.LA(1);
				if (_la==31) {
					{
					setState(147); match(31);
					setState(148); identifier();
					}
				}

				setState(151); transExpr();
				}
				break;
			case 20:
				_localctx = new GroupSingleLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(152); match(20);
				setState(155);
				_la = _input.LA(1);
				if (_la==31) {
					{
					setState(153); ((GroupSingleLabelContext)_localctx).geach = match(31);
					setState(154); identifier();
					}
				}

				{
				setState(157); ((GroupSingleLabelContext)_localctx).gby = match(10);
				setState(158); identifier();
				setState(159); match(21);
				setState(160); var();
				setState(163);
				_la = _input.LA(1);
				if (_la==37) {
					{
					setState(161); ((GroupSingleLabelContext)_localctx).gas = match(37);
					setState(162); identifier();
					}
				}

				}
				setState(165); match(1);
				setState(166); aggrExprs();
				}
				break;
			case 28:
				_localctx = new WindowLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(168); match(28);
				setState(169); match(4);
				setState(170); windowRange();
				setState(171); match(30);
				}
				break;
			case 17:
				_localctx = new ExpandLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(173); match(17);
				setState(176);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(174); match(31);
					setState(175); identifier();
					}
					break;
				}
				setState(179);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 15) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 48) | (1L << 50) | (1L << 53) | (1L << 57) | (1L << ID))) != 0)) {
					{
					setState(178); var();
					}
				}

				}
				break;
			case 22:
			case 25:
			case 50:
				_localctx = new StreamLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(181); stream();
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
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 22) | (1L << 25) | (1L << 50))) != 0)) ) {
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
			setState(206);
			switch (_input.LA(1)) {
			case 9:
				_localctx = new WindowTimeLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(186); match(9);
				setState(190);
				switch (_input.LA(1)) {
				case INT:
					{
					{
					setState(187); match(INT);
					}
					setState(188); timeUnit();
					}
					break;
				case 15:
				case 43:
					{
					setState(189); timeRange();
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
				setState(192); match(26);
				setState(193);
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
				setState(194); match(42);
				setState(195); identifier();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==33) {
					{
					{
					setState(196); match(33);
					setState(197); identifier();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(203); match(26);
				setState(204); match(INT);
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
			setState(208);
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
			setState(210);
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
			setState(212); match(40);
			setState(213); aggrExpr();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(214); match(33);
				setState(215); aggrExpr();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221); match(12);
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
			setState(233);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(223); identifier();
					setState(224); match(36);
					}
					break;
				}
				setState(228); varID();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(229); identifier();
				setState(230); match(36);
				setState(231); aggrFunc();
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
			setState(235); aggrFuncName();
			setState(236); match(35);
			setState(237); var();
			setState(238); match(16);
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
			setState(240);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 13) | (1L << 39) | (1L << 45) | (1L << 57))) != 0)) ) {
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
			setState(242); match(40);
			setState(243); transExprVar();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(244); match(33);
				setState(245); transExprVar();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(251); match(12);
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
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253); identifier();
				setState(254); match(36);
				setState(255); exprs(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257); var();
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
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new CondCompLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(261); exprs(0);
				setState(262); comprator();
				setState(263); exprs(0);
				}
				break;

			case 2:
				{
				_localctx = new CondVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(265); var();
				}
				break;

			case 3:
				{
				_localctx = new CondSubLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(266); match(35);
				setState(267); conditions(0);
				setState(268); match(16);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(278);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(272);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(273); match(41);
						setState(274); conditions(6);
						}
						break;

					case 2:
						{
						_localctx = new CondOrLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(275);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(276); match(3);
						setState(277); conditions(5);
						}
						break;
					}
					} 
				}
				setState(282);
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
			setState(283);
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
			setState(295);
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
			case 50:
			case 53:
			case 57:
			case ID:
				{
				_localctx = new ExprVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(286); var();
				}
				break;
			case INT:
				{
				_localctx = new ExprIntLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287); match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				{
				_localctx = new ExprBoolLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
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
				setState(289); match(NULL);
				}
				break;
			case STRING:
				{
				_localctx = new ExprStringLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290); match(STRING);
				}
				break;
			case 35:
				{
				_localctx = new ExprSubExprLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291); match(35);
				setState(292); exprs(0);
				setState(293); match(16);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(303);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(297);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(298);
						((ExprMulDivLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==55) ) {
							((ExprMulDivLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(299); exprs(9);
						}
						break;

					case 2:
						{
						_localctx = new ExprAddSubLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(300);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(301);
						((ExprAddSubLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==34 || _la==47) ) {
							((ExprAddSubLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(302); exprs(8);
						}
						break;
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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
			case 50:
			case 53:
			case 57:
			case ID:
				{
				setState(308); identifier();
				}
				break;
			case 44:
				{
				setState(309); ((VarContext)_localctx).dollar = match(44);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(312); arraySymbol();
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(318); match(46);
					setState(319); idWithArray();
					}
					} 
				}
				setState(324);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
			setState(325); idWithArray();
			}
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==46) {
				{
				{
				setState(326); match(46);
				setState(327); idWithArray();
				}
				}
				setState(332);
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
			setState(333); identifier();
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(334); arraySymbol();
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		enterRule(_localctx, 52, RULE_arraySymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(340); match(4);
			setState(346);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(341); match(INT);
				}
				break;

			case 2:
				{
				setState(342); ((ArraySymbolContext)_localctx).star = match(5);
				}
				break;

			case 3:
				{
				{
				setState(343); match(INT);
				setState(344); ((ArraySymbolContext)_localctx).range = match(36);
				setState(345); match(INT);
				}
				}
				break;
			}
			setState(348); match(30);
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
			setState(350);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 15) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 43) | (1L << 45) | (1L << 48) | (1L << 50) | (1L << 53) | (1L << 57) | (1L << ID))) != 0)) ) {
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
		"\2\3C\u0163\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\6\2<"+
		"\n\2\r\2\16\2=\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3P\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\5\5_\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7m\n\7\3\7"+
		"\3\7\3\7\5\7r\n\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3\b"+
		"\3\b\3\t\3\t\3\t\5\t\u0084\n\t\3\t\3\t\3\n\3\n\3\n\6\n\u008b\n\n\r\n\16"+
		"\n\u008c\3\13\3\13\3\13\5\13\u0092\n\13\3\13\3\13\3\13\3\13\5\13\u0098"+
		"\n\13\3\13\3\13\3\13\3\13\5\13\u009e\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00a6\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00b3\n\13\3\13\5\13\u00b6\n\13\3\13\5\13\u00b9\n\13\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\5\r\u00c1\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c9\n\r\f\r\16"+
		"\r\u00cc\13\r\3\r\3\r\3\r\5\r\u00d1\n\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\7\20\u00db\n\20\f\20\16\20\u00de\13\20\3\20\3\20\3\21\3\21"+
		"\3\21\5\21\u00e5\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ec\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24\u00f9\n\24\f\24"+
		"\16\24\u00fc\13\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u0105\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0111\n\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\7\26\u0119\n\26\f\26\16\26\u011c\13\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u012a\n\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0132\n\30\f\30\16\30\u0135\13\30"+
		"\3\31\3\31\5\31\u0139\n\31\3\31\7\31\u013c\n\31\f\31\16\31\u013f\13\31"+
		"\3\31\3\31\7\31\u0143\n\31\f\31\16\31\u0146\13\31\3\32\3\32\3\32\7\32"+
		"\u014b\n\32\f\32\16\32\u014e\13\32\3\33\3\33\7\33\u0152\n\33\f\33\16\33"+
		"\u0155\13\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u015d\n\34\3\34\3\34\3"+
		"\35\3\35\3\35\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668\2\r\3<=\5\30\30\33\33\64\64\4--@@\4\21\21--\5\24\25\32\32\62"+
		"\62\7\4\4\17\17))//;;\6\b\n\66\6688::\3<=\4\7\799\4$$\61\61\21\3\4\13"+
		"\r\17\17\21\21\24\26\30\37!\"\')--//\62\62\64\64\67\67;;??\u0178\2;\3"+
		"\2\2\2\4O\3\2\2\2\6Q\3\2\2\2\bZ\3\2\2\2\n`\3\2\2\2\fl\3\2\2\2\16u\3\2"+
		"\2\2\20\u0083\3\2\2\2\22\u0087\3\2\2\2\24\u00b8\3\2\2\2\26\u00ba\3\2\2"+
		"\2\30\u00d0\3\2\2\2\32\u00d2\3\2\2\2\34\u00d4\3\2\2\2\36\u00d6\3\2\2\2"+
		" \u00eb\3\2\2\2\"\u00ed\3\2\2\2$\u00f2\3\2\2\2&\u00f4\3\2\2\2(\u0104\3"+
		"\2\2\2*\u0110\3\2\2\2,\u011d\3\2\2\2.\u0129\3\2\2\2\60\u0138\3\2\2\2\62"+
		"\u0147\3\2\2\2\64\u014f\3\2\2\2\66\u0156\3\2\2\28\u0160\3\2\2\2:<\5\4"+
		"\3\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?@\5\22\n\2@A\7"+
		"\65\2\2AP\3\2\2\2BC\5\n\6\2CD\7\65\2\2DP\3\2\2\2EF\5\b\5\2FG\7\65\2\2"+
		"GP\3\2\2\2HI\5\6\4\2IJ\7\65\2\2JP\3\2\2\2KL\58\35\2LM\7\65\2\2MP\3\2\2"+
		"\2NP\7B\2\2O?\3\2\2\2OB\3\2\2\2OE\3\2\2\2OH\3\2\2\2OK\3\2\2\2ON\3\2\2"+
		"\2P\5\3\2\2\2QR\58\35\2RS\7\27\2\2ST\7\r\2\2TU\7%\2\2UV\7A\2\2VW\7#\2"+
		"\2WX\t\2\2\2XY\7\22\2\2Y\7\3\2\2\2Z[\58\35\2[^\7\27\2\2\\_\5\22\n\2]_"+
		"\5\n\6\2^\\\3\2\2\2^]\3\2\2\2_\t\3\2\2\2`a\7\37\2\2ab\5\f\7\2bc\7#\2\2"+
		"cd\5\f\7\2de\7\67\2\2ef\5\62\32\2fg\78\2\2gh\5\62\32\2hi\7\3\2\2ij\5\16"+
		"\b\2j\13\3\2\2\2km\7\63\2\2lk\3\2\2\2lm\3\2\2\2mq\3\2\2\2no\58\35\2op"+
		"\7\"\2\2pr\3\2\2\2qn\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\58\35\2t\r\3\2\2\2"+
		"uv\7*\2\2v{\5\20\t\2wx\7#\2\2xz\5\20\t\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2"+
		"{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\16\2\2\177\17\3\2\2\2\u0080\u0081"+
		"\58\35\2\u0081\u0082\7&\2\2\u0082\u0084\3\2\2\2\u0083\u0080\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\5\62\32\2\u0086\21\3\2"+
		"\2\2\u0087\u008a\58\35\2\u0088\u0089\7\20\2\2\u0089\u008b\5\24\13\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\23\3\2\2\2\u008e\u0091\7\35\2\2\u008f\u0090\7!\2\2\u0090\u0092"+
		"\58\35\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u00b9\5*\26\2\u0094\u0097\7\31\2\2\u0095\u0096\7!\2\2\u0096\u0098\58"+
		"\35\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u00b9\5&\24\2\u009a\u009d\7\26\2\2\u009b\u009c\7!\2\2\u009c\u009e\58"+
		"\35\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\7\f\2\2\u00a0\u00a1\58\35\2\u00a1\u00a2\7\27\2\2\u00a2\u00a5\5"+
		"\60\31\2\u00a3\u00a4\7\'\2\2\u00a4\u00a6\58\35\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\3\2\2\u00a8\u00a9\5\36"+
		"\20\2\u00a9\u00b9\3\2\2\2\u00aa\u00ab\7\36\2\2\u00ab\u00ac\7\6\2\2\u00ac"+
		"\u00ad\5\30\r\2\u00ad\u00ae\7 \2\2\u00ae\u00b9\3\2\2\2\u00af\u00b2\7\23"+
		"\2\2\u00b0\u00b1\7!\2\2\u00b1\u00b3\58\35\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b6\5\60\31\2\u00b5\u00b4\3"+
		"\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b9\5\26\f\2\u00b8"+
		"\u008e\3\2\2\2\u00b8\u0094\3\2\2\2\u00b8\u009a\3\2\2\2\u00b8\u00aa\3\2"+
		"\2\2\u00b8\u00af\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\25\3\2\2\2\u00ba\u00bb"+
		"\t\3\2\2\u00bb\27\3\2\2\2\u00bc\u00c0\7\13\2\2\u00bd\u00be\7@\2\2\u00be"+
		"\u00c1\5\34\17\2\u00bf\u00c1\5\32\16\2\u00c0\u00bd\3\2\2\2\u00c0\u00bf"+
		"\3\2\2\2\u00c1\u00d1\3\2\2\2\u00c2\u00c3\7\34\2\2\u00c3\u00d1\t\4\2\2"+
		"\u00c4\u00c5\7,\2\2\u00c5\u00ca\58\35\2\u00c6\u00c7\7#\2\2\u00c7\u00c9"+
		"\58\35\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7\34"+
		"\2\2\u00ce\u00cf\7@\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00bc\3\2\2\2\u00d0"+
		"\u00c2\3\2\2\2\u00d0\u00c4\3\2\2\2\u00d1\31\3\2\2\2\u00d2\u00d3\t\5\2"+
		"\2\u00d3\33\3\2\2\2\u00d4\u00d5\t\6\2\2\u00d5\35\3\2\2\2\u00d6\u00d7\7"+
		"*\2\2\u00d7\u00dc\5 \21\2\u00d8\u00d9\7#\2\2\u00d9\u00db\5 \21\2\u00da"+
		"\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\16\2\2\u00e0"+
		"\37\3\2\2\2\u00e1\u00e2\58\35\2\u00e2\u00e3\7&\2\2\u00e3\u00e5\3\2\2\2"+
		"\u00e4\u00e1\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00ec"+
		"\5\62\32\2\u00e7\u00e8\58\35\2\u00e8\u00e9\7&\2\2\u00e9\u00ea\5\"\22\2"+
		"\u00ea\u00ec\3\2\2\2\u00eb\u00e4\3\2\2\2\u00eb\u00e7\3\2\2\2\u00ec!\3"+
		"\2\2\2\u00ed\u00ee\5$\23\2\u00ee\u00ef\7%\2\2\u00ef\u00f0\5\60\31\2\u00f0"+
		"\u00f1\7\22\2\2\u00f1#\3\2\2\2\u00f2\u00f3\t\7\2\2\u00f3%\3\2\2\2\u00f4"+
		"\u00f5\7*\2\2\u00f5\u00fa\5(\25\2\u00f6\u00f7\7#\2\2\u00f7\u00f9\5(\25"+
		"\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7\16\2\2"+
		"\u00fe\'\3\2\2\2\u00ff\u0100\58\35\2\u0100\u0101\7&\2\2\u0101\u0102\5"+
		".\30\2\u0102\u0105\3\2\2\2\u0103\u0105\5\60\31\2\u0104\u00ff\3\2\2\2\u0104"+
		"\u0103\3\2\2\2\u0105)\3\2\2\2\u0106\u0107\b\26\1\2\u0107\u0108\5.\30\2"+
		"\u0108\u0109\5,\27\2\u0109\u010a\5.\30\2\u010a\u0111\3\2\2\2\u010b\u0111"+
		"\5\60\31\2\u010c\u010d\7%\2\2\u010d\u010e\5*\26\2\u010e\u010f\7\22\2\2"+
		"\u010f\u0111\3\2\2\2\u0110\u0106\3\2\2\2\u0110\u010b\3\2\2\2\u0110\u010c"+
		"\3\2\2\2\u0111\u011a\3\2\2\2\u0112\u0113\6\26\2\3\u0113\u0114\7+\2\2\u0114"+
		"\u0119\5*\26\2\u0115\u0116\6\26\3\3\u0116\u0117\7\5\2\2\u0117\u0119\5"+
		"*\26\2\u0118\u0112\3\2\2\2\u0118\u0115\3\2\2\2\u0119\u011c\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b+\3\2\2\2\u011c\u011a\3\2\2\2"+
		"\u011d\u011e\t\b\2\2\u011e-\3\2\2\2\u011f\u0120\b\30\1\2\u0120\u012a\5"+
		"\60\31\2\u0121\u012a\7@\2\2\u0122\u012a\t\t\2\2\u0123\u012a\7>\2\2\u0124"+
		"\u012a\7A\2\2\u0125\u0126\7%\2\2\u0126\u0127\5.\30\2\u0127\u0128\7\22"+
		"\2\2\u0128\u012a\3\2\2\2\u0129\u011f\3\2\2\2\u0129\u0121\3\2\2\2\u0129"+
		"\u0122\3\2\2\2\u0129\u0123\3\2\2\2\u0129\u0124\3\2\2\2\u0129\u0125\3\2"+
		"\2\2\u012a\u0133\3\2\2\2\u012b\u012c\6\30\4\3\u012c\u012d\t\n\2\2\u012d"+
		"\u0132\5.\30\2\u012e\u012f\6\30\5\3\u012f\u0130\t\13\2\2\u0130\u0132\5"+
		".\30\2\u0131\u012b\3\2\2\2\u0131\u012e\3\2\2\2\u0132\u0135\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134/\3\2\2\2\u0135\u0133\3\2\2\2"+
		"\u0136\u0139\58\35\2\u0137\u0139\7.\2\2\u0138\u0136\3\2\2\2\u0138\u0137"+
		"\3\2\2\2\u0139\u013d\3\2\2\2\u013a\u013c\5\66\34\2\u013b\u013a\3\2\2\2"+
		"\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0144"+
		"\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\7\60\2\2\u0141\u0143\5\64\33"+
		"\2\u0142\u0140\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\61\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u014c\5\64\33\2\u0148"+
		"\u0149\7\60\2\2\u0149\u014b\5\64\33\2\u014a\u0148\3\2\2\2\u014b\u014e"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\63\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014f\u0153\58\35\2\u0150\u0152\5\66\34\2\u0151\u0150\3"+
		"\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\65\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u015c\7\6\2\2\u0157\u015d\7@\2\2"+
		"\u0158\u015d\7\7\2\2\u0159\u015a\7@\2\2\u015a\u015b\7&\2\2\u015b\u015d"+
		"\7@\2\2\u015c\u0157\3\2\2\2\u015c\u0158\3\2\2\2\u015c\u0159\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\7 \2\2\u015f\67\3\2\2\2\u0160\u0161\t\f\2\2"+
		"\u01619\3\2\2\2%=O^lq{\u0083\u008c\u0091\u0097\u009d\u00a5\u00b2\u00b5"+
		"\u00b8\u00c0\u00ca\u00d0\u00dc\u00e4\u00eb\u00fa\u0104\u0110\u0118\u011a"+
		"\u0129\u0131\u0133\u0138\u013d\u0144\u014c\u0153\u015c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}