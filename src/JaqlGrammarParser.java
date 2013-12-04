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
		"<INVALID>", "'into'", "'min'", "'*'", "'or'", "'['", "'<'", "'!='", "'<='", 
		"'range'", "'by'", "'readFromWrapper'", "'}'", "'->'", "'max'", "'now'", 
		"')'", "'expand'", "'seconds'", "'hours'", "'group'", "'='", "'transform'", 
		"'dstream'", "'days'", "'rstream'", "'rows'", "'filter'", "'window'", 
		"'join'", "']'", "'each'", "'in'", "','", "'-'", "':'", "'('", "'as'", 
		"'readFromWrapperAsMaster'", "'{'", "'sum'", "'and'", "'partitioned by'", 
		"'unbounded'", "'$'", "'avg'", "'.'", "'+'", "'minutes'", "'preserve'", 
		"'istream'", "';'", "'>'", "'where'", "'/'", "'=='", "'>='", "'count'", 
		"'true'", "'false'", "'null'", "ID", "INT", "STRING", "NEWLINE", "WS"
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
			} while ( ((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (1 - 1)) | (1L << (2 - 1)) | (1L << (9 - 1)) | (1L << (10 - 1)) | (1L << (11 - 1)) | (1L << (14 - 1)) | (1L << (15 - 1)) | (1L << (18 - 1)) | (1L << (19 - 1)) | (1L << (20 - 1)) | (1L << (22 - 1)) | (1L << (23 - 1)) | (1L << (24 - 1)) | (1L << (25 - 1)) | (1L << (26 - 1)) | (1L << (27 - 1)) | (1L << (28 - 1)) | (1L << (29 - 1)) | (1L << (31 - 1)) | (1L << (32 - 1)) | (1L << (37 - 1)) | (1L << (38 - 1)) | (1L << (40 - 1)) | (1L << (43 - 1)) | (1L << (44 - 1)) | (1L << (45 - 1)) | (1L << (48 - 1)) | (1L << (50 - 1)) | (1L << (53 - 1)) | (1L << (57 - 1)) | (1L << (ID - 1)) | (1L << (NEWLINE - 1)))) != 0) );
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
			setState(71);
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
				setState(70); match(NEWLINE);
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
			setState(73); identifier();
			setState(74); match(21);
			setState(75); match(11);
			setState(76); match(36);
			setState(77); match(STRING);
			setState(78); match(33);
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(80); match(16);
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
			setState(82); identifier();
			setState(83); match(21);
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(84); pipe();
				}
				break;

			case 2:
				{
				setState(85); join();
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
			setState(88); match(29);
			setState(89); joinVar();
			setState(90); match(33);
			setState(91); joinVar();
			setState(92); match(53);
			setState(93); var();
			setState(94); match(55);
			setState(95); var();
			setState(96); match(1);
			setState(97); jsonGen();
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
			setState(100);
			_la = _input.LA(1);
			if (_la==49) {
				{
				setState(99); ((JoinVarContext)_localctx).preserve = match(49);
				}
			}

			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(102); identifier();
				setState(103); match(32);
				}
				break;
			}
			setState(107); identifier();
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
			setState(109); identifier();
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110); match(13);
				setState(111); pipeExpr();
				}
				}
				setState(114); 
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
			setState(158);
			switch (_input.LA(1)) {
			case 27:
				_localctx = new FilterLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116); match(27);
				setState(119);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(117); match(31);
					setState(118); identifier();
					}
					break;
				}
				setState(121); conditions(0);
				}
				break;
			case 22:
				_localctx = new TransformLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122); match(22);
				setState(125);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(123); match(31);
					setState(124); identifier();
					}
					break;
				}
				setState(127); jsonGen();
				}
				break;
			case 20:
				_localctx = new GroupSingleLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(128); match(20);
				setState(131);
				_la = _input.LA(1);
				if (_la==31) {
					{
					setState(129); ((GroupSingleLabelContext)_localctx).geach = match(31);
					setState(130); identifier();
					}
				}

				{
				setState(133); ((GroupSingleLabelContext)_localctx).gby = match(10);
				setState(134); identifier();
				setState(135); match(21);
				setState(136); var();
				setState(139);
				_la = _input.LA(1);
				if (_la==37) {
					{
					setState(137); ((GroupSingleLabelContext)_localctx).gas = match(37);
					setState(138); identifier();
					}
				}

				}
				setState(141); match(1);
				setState(142); jsonGen();
				}
				break;
			case 28:
				_localctx = new WindowLabelContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(144); match(28);
				setState(145); match(5);
				setState(146); windowRange();
				setState(147); match(30);
				}
				break;
			case 17:
				_localctx = new ExpandLabelContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(149); match(17);
				setState(152);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(150); match(31);
					setState(151); identifier();
					}
					break;
				}
				setState(155);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 5) | (1L << 9) | (1L << 10) | (1L << 11) | (1L << 14) | (1L << 15) | (1L << 18) | (1L << 19) | (1L << 20) | (1L << 22) | (1L << 23) | (1L << 24) | (1L << 25) | (1L << 26) | (1L << 27) | (1L << 28) | (1L << 29) | (1L << 31) | (1L << 32) | (1L << 36) | (1L << 37) | (1L << 38) | (1L << 39) | (1L << 40) | (1L << 43) | (1L << 44) | (1L << 45) | (1L << 48) | (1L << 50) | (1L << 53) | (1L << 57) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << ID) | (1L << INT) | (1L << STRING))) != 0)) {
					{
					setState(154); jsonGen();
					}
				}

				}
				break;
			case 23:
			case 25:
			case 50:
				_localctx = new StreamLabelContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(157); stream();
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
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 23) | (1L << 25) | (1L << 50))) != 0)) ) {
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
			setState(182);
			switch (_input.LA(1)) {
			case 9:
				_localctx = new WindowTimeLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(162); match(9);
				setState(166);
				switch (_input.LA(1)) {
				case INT:
					{
					{
					setState(163); match(INT);
					}
					setState(164); timeUnit();
					}
					break;
				case 15:
				case 43:
					{
					setState(165); timeRange();
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
				setState(168); match(26);
				setState(169);
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
				setState(170); match(42);
				setState(171); identifier();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==33) {
					{
					{
					setState(172); match(33);
					setState(173); identifier();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179); match(26);
				setState(180); match(INT);
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
			setState(184);
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
		enterRule(_localctx, 22, RULE_timeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
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
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_conditions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new CondCompLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(189); exprs(0);
				setState(190); comprator();
				setState(191); exprs(0);
				}
				break;

			case 2:
				{
				_localctx = new CondVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193); var();
				}
				break;

			case 3:
				{
				_localctx = new CondSubLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194); match(36);
				setState(195); conditions(0);
				setState(196); match(16);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(206);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(200);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(201); match(41);
						setState(202); conditions(6);
						}
						break;

					case 2:
						{
						_localctx = new CondOrLabelContext(new ConditionsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_conditions);
						setState(203);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(204); match(4);
						setState(205); conditions(5);
						}
						break;
					}
					} 
				}
				setState(210);
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
			setState(211);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 7) | (1L << 8) | (1L << 52) | (1L << 55) | (1L << 56))) != 0)) ) {
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
			setState(216);
			switch (_input.LA(1)) {
			case 5:
				enterOuterAlt(_localctx, 1);
				{
				setState(213); arrayGen();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 2);
				{
				setState(214); objectGen();
				}
				break;
			case 1:
			case 2:
			case 9:
			case 10:
			case 11:
			case 14:
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
			case 36:
			case 37:
			case 38:
			case 40:
			case 43:
			case 44:
			case 45:
			case 48:
			case 50:
			case 53:
			case 57:
			case TRUE:
			case FALSE:
			case NULL:
			case ID:
			case INT:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(215); exprs(0);
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
			setState(218); match(5);
			setState(219); jsonGen();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(220); match(33);
				setState(221); jsonGen();
				}
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227); match(30);
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
			setState(229); match(39);
			setState(230); field();
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(231); match(33);
				setState(232); field();
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
			setState(245);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240); identifier();
				setState(241); match(35);
				setState(242); jsonGen();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244); var();
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
	public static class ExprAggrFuncLabelContext extends ExprsContext {
		public AggrFuncNameContext aggrFuncName() {
			return getRuleContext(AggrFuncNameContext.class,0);
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
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new ExprVarLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(248); var();
				}
				break;

			case 2:
				{
				_localctx = new ExprIntLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(249); match(INT);
				}
				break;

			case 3:
				{
				_localctx = new ExprBoolLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(250);
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
				setState(251); match(NULL);
				}
				break;

			case 5:
				{
				_localctx = new ExprStringLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(252); match(STRING);
				}
				break;

			case 6:
				{
				_localctx = new ExprSubExprLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(253); match(36);
				setState(254); exprs(0);
				setState(255); match(16);
				}
				break;

			case 7:
				{
				_localctx = new ExprAggrFuncLabelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(257); aggrFuncName();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(266);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMulDivLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(260);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(261);
						((ExprMulDivLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==54) ) {
							((ExprMulDivLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(262); exprs(10);
						}
						break;

					case 2:
						{
						_localctx = new ExprAddSubLabelContext(new ExprsContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_exprs);
						setState(263);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(264);
						((ExprAddSubLabelContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==34 || _la==47) ) {
							((ExprAddSubLabelContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(265); exprs(9);
						}
						break;
					}
					} 
				}
				setState(270);
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
		public ArrayGenContext arrayGen() {
			return getRuleContext(ArrayGenContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_aggrFunc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); aggrFuncName();
			setState(272); match(36);
			setState(275);
			switch (_input.LA(1)) {
			case 1:
			case 2:
			case 9:
			case 10:
			case 11:
			case 14:
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
			case 40:
			case 43:
			case 44:
			case 45:
			case 48:
			case 50:
			case 53:
			case 57:
			case ID:
				{
				setState(273); var();
				}
				break;
			case 5:
				{
				setState(274); arrayGen();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(277); match(16);
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
			setState(279);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 14) | (1L << 40) | (1L << 45) | (1L << 57))) != 0)) ) {
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
			setState(281); idWithArray();
			}
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(282); match(46);
					setState(283); idWithArray();
					}
					} 
				}
				setState(288);
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
			setState(289); identifier();
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(290); arraySymbol();
					}
					} 
				}
				setState(295);
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
			setState(296); match(5);
			setState(302);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(297); match(INT);
				}
				break;

			case 2:
				{
				setState(298); ((ArraySymbolContext)_localctx).star = match(3);
				}
				break;

			case 3:
				{
				{
				setState(299); match(INT);
				setState(300); ((ArraySymbolContext)_localctx).range = match(35);
				setState(301); match(INT);
				}
				}
				break;
			}
			setState(304); match(30);
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
			setState(337);
			switch (_input.LA(1)) {
			case 11:
				enterOuterAlt(_localctx, 1);
				{
				setState(306); match(11);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 2);
				{
				setState(307); match(38);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 3);
				{
				setState(308); match(29);
				}
				break;
			case 53:
				enterOuterAlt(_localctx, 4);
				{
				setState(309); match(53);
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 5);
				{
				setState(310); match(1);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 6);
				{
				setState(311); match(32);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 7);
				{
				setState(312); match(27);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 8);
				{
				setState(313); match(22);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 9);
				{
				setState(314); match(20);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 10);
				{
				setState(315); match(28);
				}
				break;
			case 50:
				enterOuterAlt(_localctx, 11);
				{
				setState(316); match(50);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 12);
				{
				setState(317); match(23);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 13);
				{
				setState(318); match(25);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 14);
				{
				setState(319); match(31);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 15);
				{
				setState(320); match(37);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 16);
				{
				setState(321); match(10);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 17);
				{
				setState(322); match(9);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 18);
				{
				setState(323); match(43);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 19);
				{
				setState(324); match(26);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 20);
				{
				setState(325); match(15);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 21);
				{
				setState(326); match(18);
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 22);
				{
				setState(327); match(48);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 23);
				{
				setState(328); match(19);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(329); match(24);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 25);
				{
				setState(330); match(40);
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 26);
				{
				setState(331); match(45);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 27);
				{
				setState(332); match(14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 28);
				{
				setState(333); match(2);
				}
				break;
			case 57:
				enterOuterAlt(_localctx, 29);
				{
				setState(334); match(57);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 30);
				{
				setState(335); match(ID);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 31);
				{
				setState(336); ((IdentifierContext)_localctx).dollar = match(44);
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
		case 0: return 5 >= _localctx._p;

		case 1: return 4 >= _localctx._p;
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
		"\2\3C\u0156\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\3\2\6\2\66\n\2\r\2\16\2\67\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7g\n\7\3\7\3\7\3\7\5\7l\n\7\3\7\3\7"+
		"\3\b\3\b\3\b\6\bs\n\b\r\b\16\bt\3\t\3\t\3\t\5\tz\n\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0080\n\t\3\t\3\t\3\t\3\t\5\t\u0086\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u008e\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009b\n\t\3"+
		"\t\5\t\u009e\n\t\3\t\5\t\u00a1\n\t\3\n\3\n\3\13\3\13\3\13\3\13\5\13\u00a9"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b1\n\13\f\13\16\13\u00b4\13"+
		"\13\3\13\3\13\3\13\5\13\u00b9\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c9\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00d1\n\16\f\16\16\16\u00d4\13\16\3\17\3\17\3\20\3\20\3\20"+
		"\5\20\u00db\n\20\3\21\3\21\3\21\3\21\7\21\u00e1\n\21\f\21\16\21\u00e4"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00ec\n\22\f\22\16\22\u00ef"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00f8\n\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0105\n\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u010d\n\24\f\24\16\24\u0110\13\24\3\25\3\25"+
		"\3\25\3\25\5\25\u0116\n\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\7\27\u011f"+
		"\n\27\f\27\16\27\u0122\13\27\3\30\3\30\7\30\u0126\n\30\f\30\16\30\u0129"+
		"\13\30\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0131\n\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u0154\n\32\3\32\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\2\f\3<=\5\31\31\33\33\64\64\4--@@\4\21\21--\5\24\25"+
		"\32\32\62\62\5\b\n\66\669:\3<=\4\5\588\4$$\61\61\7\4\4\20\20**//;;\u0189"+
		"\2\65\3\2\2\2\4I\3\2\2\2\6K\3\2\2\2\bT\3\2\2\2\nZ\3\2\2\2\ff\3\2\2\2\16"+
		"o\3\2\2\2\20\u00a0\3\2\2\2\22\u00a2\3\2\2\2\24\u00b8\3\2\2\2\26\u00ba"+
		"\3\2\2\2\30\u00bc\3\2\2\2\32\u00c8\3\2\2\2\34\u00d5\3\2\2\2\36\u00da\3"+
		"\2\2\2 \u00dc\3\2\2\2\"\u00e7\3\2\2\2$\u00f7\3\2\2\2&\u0104\3\2\2\2(\u0111"+
		"\3\2\2\2*\u0119\3\2\2\2,\u011b\3\2\2\2.\u0123\3\2\2\2\60\u012a\3\2\2\2"+
		"\62\u0153\3\2\2\2\64\66\5\4\3\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2"+
		"\2\2\678\3\2\2\28\3\3\2\2\29:\5\16\b\2:;\7\65\2\2;J\3\2\2\2<=\5\n\6\2"+
		"=>\7\65\2\2>J\3\2\2\2?@\5\b\5\2@A\7\65\2\2AJ\3\2\2\2BC\5\6\4\2CD\7\65"+
		"\2\2DJ\3\2\2\2EF\5\62\32\2FG\7\65\2\2GJ\3\2\2\2HJ\7B\2\2I9\3\2\2\2I<\3"+
		"\2\2\2I?\3\2\2\2IB\3\2\2\2IE\3\2\2\2IH\3\2\2\2J\5\3\2\2\2KL\5\62\32\2"+
		"LM\7\27\2\2MN\7\r\2\2NO\7&\2\2OP\7A\2\2PQ\7#\2\2QR\t\2\2\2RS\7\22\2\2"+
		"S\7\3\2\2\2TU\5\62\32\2UX\7\27\2\2VY\5\16\b\2WY\5\n\6\2XV\3\2\2\2XW\3"+
		"\2\2\2Y\t\3\2\2\2Z[\7\37\2\2[\\\5\f\7\2\\]\7#\2\2]^\5\f\7\2^_\7\67\2\2"+
		"_`\5,\27\2`a\79\2\2ab\5,\27\2bc\7\3\2\2cd\5\36\20\2d\13\3\2\2\2eg\7\63"+
		"\2\2fe\3\2\2\2fg\3\2\2\2gk\3\2\2\2hi\5\62\32\2ij\7\"\2\2jl\3\2\2\2kh\3"+
		"\2\2\2kl\3\2\2\2lm\3\2\2\2mn\5\62\32\2n\r\3\2\2\2or\5\62\32\2pq\7\17\2"+
		"\2qs\5\20\t\2rp\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\17\3\2\2\2vy\7"+
		"\35\2\2wx\7!\2\2xz\5\62\32\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{\u00a1\5\32"+
		"\16\2|\177\7\30\2\2}~\7!\2\2~\u0080\5\62\32\2\177}\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\u00a1\5\36\20\2\u0082\u0085\7\26\2\2"+
		"\u0083\u0084\7!\2\2\u0084\u0086\5\62\32\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\7\f\2\2\u0088\u0089\5\62\32\2"+
		"\u0089\u008a\7\27\2\2\u008a\u008d\5,\27\2\u008b\u008c\7\'\2\2\u008c\u008e"+
		"\5\62\32\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2"+
		"\u008f\u0090\7\3\2\2\u0090\u0091\5\36\20\2\u0091\u00a1\3\2\2\2\u0092\u0093"+
		"\7\36\2\2\u0093\u0094\7\7\2\2\u0094\u0095\5\24\13\2\u0095\u0096\7 \2\2"+
		"\u0096\u00a1\3\2\2\2\u0097\u009a\7\23\2\2\u0098\u0099\7!\2\2\u0099\u009b"+
		"\5\62\32\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2"+
		"\u009c\u009e\5\36\20\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u00a1\5\22\n\2\u00a0v\3\2\2\2\u00a0|\3\2\2\2\u00a0\u0082"+
		"\3\2\2\2\u00a0\u0092\3\2\2\2\u00a0\u0097\3\2\2\2\u00a0\u009f\3\2\2\2\u00a1"+
		"\21\3\2\2\2\u00a2\u00a3\t\3\2\2\u00a3\23\3\2\2\2\u00a4\u00a8\7\13\2\2"+
		"\u00a5\u00a6\7@\2\2\u00a6\u00a9\5\30\r\2\u00a7\u00a9\5\26\f\2\u00a8\u00a5"+
		"\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00b9\3\2\2\2\u00aa\u00ab\7\34\2\2"+
		"\u00ab\u00b9\t\4\2\2\u00ac\u00ad\7,\2\2\u00ad\u00b2\5\62\32\2\u00ae\u00af"+
		"\7#\2\2\u00af\u00b1\5\62\32\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2"+
		"\3\2\2\2\u00b5\u00b6\7\34\2\2\u00b6\u00b7\7@\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00a4\3\2\2\2\u00b8\u00aa\3\2\2\2\u00b8\u00ac\3\2\2\2\u00b9\25\3\2\2"+
		"\2\u00ba\u00bb\t\5\2\2\u00bb\27\3\2\2\2\u00bc\u00bd\t\6\2\2\u00bd\31\3"+
		"\2\2\2\u00be\u00bf\b\16\1\2\u00bf\u00c0\5&\24\2\u00c0\u00c1\5\34\17\2"+
		"\u00c1\u00c2\5&\24\2\u00c2\u00c9\3\2\2\2\u00c3\u00c9\5,\27\2\u00c4\u00c5"+
		"\7&\2\2\u00c5\u00c6\5\32\16\2\u00c6\u00c7\7\22\2\2\u00c7\u00c9\3\2\2\2"+
		"\u00c8\u00be\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\u00d2"+
		"\3\2\2\2\u00ca\u00cb\6\16\2\3\u00cb\u00cc\7+\2\2\u00cc\u00d1\5\32\16\2"+
		"\u00cd\u00ce\6\16\3\3\u00ce\u00cf\7\6\2\2\u00cf\u00d1\5\32\16\2\u00d0"+
		"\u00ca\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\33\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6"+
		"\t\7\2\2\u00d6\35\3\2\2\2\u00d7\u00db\5 \21\2\u00d8\u00db\5\"\22\2\u00d9"+
		"\u00db\5&\24\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2"+
		"\2\2\u00db\37\3\2\2\2\u00dc\u00dd\7\7\2\2\u00dd\u00e2\5\36\20\2\u00de"+
		"\u00df\7#\2\2\u00df\u00e1\5\36\20\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3"+
		"\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\7 \2\2\u00e6!\3\2\2\2\u00e7\u00e8\7)\2\2\u00e8"+
		"\u00ed\5$\23\2\u00e9\u00ea\7#\2\2\u00ea\u00ec\5$\23\2\u00eb\u00e9\3\2"+
		"\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7\16\2\2\u00f1#\3\2\2\2"+
		"\u00f2\u00f3\5\62\32\2\u00f3\u00f4\7%\2\2\u00f4\u00f5\5\36\20\2\u00f5"+
		"\u00f8\3\2\2\2\u00f6\u00f8\5,\27\2\u00f7\u00f2\3\2\2\2\u00f7\u00f6\3\2"+
		"\2\2\u00f8%\3\2\2\2\u00f9\u00fa\b\24\1\2\u00fa\u0105\5,\27\2\u00fb\u0105"+
		"\7@\2\2\u00fc\u0105\t\b\2\2\u00fd\u0105\7>\2\2\u00fe\u0105\7A\2\2\u00ff"+
		"\u0100\7&\2\2\u0100\u0101\5&\24\2\u0101\u0102\7\22\2\2\u0102\u0105\3\2"+
		"\2\2\u0103\u0105\5*\26\2\u0104\u00f9\3\2\2\2\u0104\u00fb\3\2\2\2\u0104"+
		"\u00fc\3\2\2\2\u0104\u00fd\3\2\2\2\u0104\u00fe\3\2\2\2\u0104\u00ff\3\2"+
		"\2\2\u0104\u0103\3\2\2\2\u0105\u010e\3\2\2\2\u0106\u0107\6\24\4\3\u0107"+
		"\u0108\t\t\2\2\u0108\u010d\5&\24\2\u0109\u010a\6\24\5\3\u010a\u010b\t"+
		"\n\2\2\u010b\u010d\5&\24\2\u010c\u0106\3\2\2\2\u010c\u0109\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\'\3\2\2\2"+
		"\u0110\u010e\3\2\2\2\u0111\u0112\5*\26\2\u0112\u0115\7&\2\2\u0113\u0116"+
		"\5,\27\2\u0114\u0116\5 \21\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\7\22\2\2\u0118)\3\2\2\2\u0119\u011a\t\13\2"+
		"\2\u011a+\3\2\2\2\u011b\u0120\5.\30\2\u011c\u011d\7\60\2\2\u011d\u011f"+
		"\5.\30\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121-\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0127\5\62\32"+
		"\2\u0124\u0126\5\60\31\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128/\3\2\2\2\u0129\u0127\3\2\2\2"+
		"\u012a\u0130\7\7\2\2\u012b\u0131\7@\2\2\u012c\u0131\7\5\2\2\u012d\u012e"+
		"\7@\2\2\u012e\u012f\7%\2\2\u012f\u0131\7@\2\2\u0130\u012b\3\2\2\2\u0130"+
		"\u012c\3\2\2\2\u0130\u012d\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\7 "+
		"\2\2\u0133\61\3\2\2\2\u0134\u0154\7\r\2\2\u0135\u0154\7(\2\2\u0136\u0154"+
		"\7\37\2\2\u0137\u0154\7\67\2\2\u0138\u0154\7\3\2\2\u0139\u0154\7\"\2\2"+
		"\u013a\u0154\7\35\2\2\u013b\u0154\7\30\2\2\u013c\u0154\7\26\2\2\u013d"+
		"\u0154\7\36\2\2\u013e\u0154\7\64\2\2\u013f\u0154\7\31\2\2\u0140\u0154"+
		"\7\33\2\2\u0141\u0154\7!\2\2\u0142\u0154\7\'\2\2\u0143\u0154\7\f\2\2\u0144"+
		"\u0154\7\13\2\2\u0145\u0154\7-\2\2\u0146\u0154\7\34\2\2\u0147\u0154\7"+
		"\21\2\2\u0148\u0154\7\24\2\2\u0149\u0154\7\62\2\2\u014a\u0154\7\25\2\2"+
		"\u014b\u0154\7\32\2\2\u014c\u0154\7*\2\2\u014d\u0154\7/\2\2\u014e\u0154"+
		"\7\20\2\2\u014f\u0154\7\4\2\2\u0150\u0154\7;\2\2\u0151\u0154\7?\2\2\u0152"+
		"\u0154\7.\2\2\u0153\u0134\3\2\2\2\u0153\u0135\3\2\2\2\u0153\u0136\3\2"+
		"\2\2\u0153\u0137\3\2\2\2\u0153\u0138\3\2\2\2\u0153\u0139\3\2\2\2\u0153"+
		"\u013a\3\2\2\2\u0153\u013b\3\2\2\2\u0153\u013c\3\2\2\2\u0153\u013d\3\2"+
		"\2\2\u0153\u013e\3\2\2\2\u0153\u013f\3\2\2\2\u0153\u0140\3\2\2\2\u0153"+
		"\u0141\3\2\2\2\u0153\u0142\3\2\2\2\u0153\u0143\3\2\2\2\u0153\u0144\3\2"+
		"\2\2\u0153\u0145\3\2\2\2\u0153\u0146\3\2\2\2\u0153\u0147\3\2\2\2\u0153"+
		"\u0148\3\2\2\2\u0153\u0149\3\2\2\2\u0153\u014a\3\2\2\2\u0153\u014b\3\2"+
		"\2\2\u0153\u014c\3\2\2\2\u0153\u014d\3\2\2\2\u0153\u014e\3\2\2\2\u0153"+
		"\u014f\3\2\2\2\u0153\u0150\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0152\3\2"+
		"\2\2\u0154\63\3\2\2\2!\67IXfkty\177\u0085\u008d\u009a\u009d\u00a0\u00a8"+
		"\u00b2\u00b8\u00c8\u00d0\u00d2\u00da\u00e2\u00ed\u00f7\u0104\u010c\u010e"+
		"\u0115\u0120\u0127\u0130\u0153";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}