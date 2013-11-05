// Generated from JaqlSample.g4 by ANTLR 4.0
package jaqlSample;
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
		T__33=1, T__32=2, T__31=3, T__30=4, T__29=5, T__28=6, T__27=7, T__26=8, 
		T__25=9, T__24=10, T__23=11, T__22=12, T__21=13, T__20=14, T__19=15, T__18=16, 
		T__17=17, T__16=18, T__15=19, T__14=20, T__13=21, T__12=22, T__11=23, 
		T__10=24, T__9=25, T__8=26, T__7=27, T__6=28, T__5=29, T__4=30, T__3=31, 
		T__2=32, T__1=33, T__0=34, ID=35, INT=36, NEWLINE=37, WS=38;
	public static final String[] tokenNames = {
		"<INVALID>", "'each'", "'in'", "','", "'into'", "'min'", "'or'", "':'", 
		"'('", "'<'", "'!='", "'<='", "'as'", "'sum'", "'[*].'", "'{'", "'by'", 
		"'and'", "'}'", "'$'", "'max'", "'avg'", "'->'", "')'", "'.'", "'group'", 
		"'='", "';'", "'>'", "'transform'", "'where'", "'=='", "'>='", "'filter'", 
		"'join'", "ID", "INT", "NEWLINE", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_join = 2, RULE_joinOut = 3, RULE_pipe = 4, 
		RULE_pipeExpr = 5, RULE_aggrExpr = 6, RULE_aggrFunc = 7, RULE_aggrFuncNames = 8, 
		RULE_transExpr = 9, RULE_conditions = 10, RULE_conditions2 = 11, RULE_condition = 12, 
		RULE_var = 13, RULE_varID = 14;
	public static final String[] ruleNames = {
		"prog", "stat", "join", "joinOut", "pipe", "pipeExpr", "aggrExpr", "aggrFunc", 
		"aggrFuncNames", "transExpr", "conditions", "conditions2", "condition", 
		"var", "varID"
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
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30); stat();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 34) | (1L << ID) | (1L << NEWLINE))) != 0) );
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
			setState(42);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(35); pipe();
				setState(36); match(27);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 2);
				{
				setState(38); join();
				setState(39); match(27);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(41); match(NEWLINE);
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

	public static class JoinContext extends ParserRuleContext {
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(JaqlSampleParser.ID, i);
		}
		public JoinOutContext joinOut() {
			return getRuleContext(JoinOutContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(JaqlSampleParser.ID); }
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
		enterRule(_localctx, 4, RULE_join);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(34);
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(45); match(ID);
				setState(46); match(2);
				}
				break;
			}
			setState(49); match(ID);
			setState(50); match(3);
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(51); match(ID);
				setState(52); match(2);
				}
				break;
			}
			setState(55); match(ID);
			setState(56); match(30);
			setState(62);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(57); match(8);
				setState(58); conditions();
				setState(59); match(23);
				}
				break;

			case 2:
				{
				setState(61); conditions();
				}
				break;
			}
			setState(66);
			_la = _input.LA(1);
			if (_la==4) {
				{
				setState(64); match(4);
				setState(65); joinOut();
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
		enterRule(_localctx, 6, RULE_joinOut);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(15);
			setState(69); varID();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(70); match(3);
				setState(71); varID();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77); match(18);
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
		enterRule(_localctx, 8, RULE_pipe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); match(ID);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80); match(22);
				setState(81); pipeExpr();
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==22 );
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

	public final PipeExprContext pipeExpr() throws RecognitionException {
		PipeExprContext _localctx = new PipeExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pipeExpr);
		int _la;
		try {
			setState(115);
			switch (_input.LA(1)) {
			case 33:
				_localctx = new FilterLabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86); match(33);
				setState(89);
				_la = _input.LA(1);
				if (_la==1) {
					{
					setState(87); match(1);
					setState(88); match(ID);
					}
				}

				setState(91); conditions();
				}
				break;
			case 29:
				_localctx = new TansformLabelContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92); match(29);
				setState(95);
				_la = _input.LA(1);
				if (_la==1) {
					{
					setState(93); match(1);
					setState(94); match(ID);
					}
				}

				setState(97); transExpr();
				}
				break;
			case 25:
				_localctx = new GroupSingleLabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98); match(25);
				setState(101);
				_la = _input.LA(1);
				if (_la==1) {
					{
					setState(99); match(1);
					setState(100); match(ID);
					}
				}

				setState(111);
				_la = _input.LA(1);
				if (_la==16) {
					{
					setState(103); match(16);
					setState(104); match(ID);
					setState(105); match(26);
					setState(106); var();
					setState(109);
					_la = _input.LA(1);
					if (_la==12) {
						{
						setState(107); match(12);
						setState(108); match(ID);
						}
					}

					}
				}

				setState(113); match(4);
				setState(114); aggrExpr();
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
		enterRule(_localctx, 12, RULE_aggrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(15);
			setState(122);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(118); match(ID);
				}
				break;

			case 2:
				{
				{
				setState(119); match(ID);
				setState(120); match(7);
				setState(121); aggrFunc();
				}
				}
				break;
			}
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3 || _la==ID) {
				{
				setState(129);
				switch (_input.LA(1)) {
				case 3:
					{
					setState(124); match(3);
					setState(125); match(ID);
					}
					break;
				case ID:
					{
					{
					setState(126); match(ID);
					setState(127); match(7);
					setState(128); aggrFunc();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134); match(18);
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
		enterRule(_localctx, 14, RULE_aggrFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); aggrFuncNames();
			setState(137); match(8);
			setState(138);
			_la = _input.LA(1);
			if ( !(_la==19 || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(139); match(14);
			setState(140); match(ID);
			setState(141); match(23);
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
		enterRule(_localctx, 16, RULE_aggrFuncNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 13) | (1L << 20) | (1L << 21))) != 0)) ) {
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
		enterRule(_localctx, 18, RULE_transExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(15);
			setState(146); var();
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(147); match(3);
				setState(148); var();
				}
				}
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154); match(18);
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
		enterRule(_localctx, 20, RULE_conditions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); conditions2();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==6) {
				{
				{
				setState(157); match(6);
				setState(158); conditions2();
				}
				}
				setState(163);
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
		enterRule(_localctx, 22, RULE_conditions2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); condition();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==17) {
				{
				{
				setState(165); match(17);
				setState(166); condition();
				}
				}
				setState(171);
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
		enterRule(_localctx, 24, RULE_condition);
		int _la;
		try {
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172); match(8);
				setState(173); conditions();
				setState(174); match(23);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176); var();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177); var();
				setState(178);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 10) | (1L << 11) | (1L << 28) | (1L << 31) | (1L << 32))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(181);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(179); match(INT);
					}
					break;
				case 19:
				case ID:
					{
					setState(180); var();
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
		enterRule(_localctx, 26, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==19 || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(188);
			_la = _input.LA(1);
			if (_la==24) {
				{
				setState(186); match(24);
				setState(187); match(ID);
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
		enterRule(_localctx, 28, RULE_varID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(190); match(ID);
			}
			setState(193);
			_la = _input.LA(1);
			if (_la==24) {
				{
				setState(191); match(24);
				setState(192); match(ID);
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
		"\2\3(\u00c6\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\3\2\6\2\"\n\2\r\2\16\2#\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4"+
		"\3\4\5\4\62\n\4\3\4\3\4\3\4\3\4\5\48\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4A\n\4\3\4\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\3"+
		"\5\3\6\3\6\3\6\6\6U\n\6\r\6\16\6V\3\7\3\7\3\7\5\7\\\n\7\3\7\3\7\3\7\3"+
		"\7\5\7b\n\7\3\7\3\7\3\7\3\7\5\7h\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7p\n\7"+
		"\5\7r\n\7\3\7\3\7\5\7v\n\7\3\b\3\b\3\b\3\b\3\b\5\b}\n\b\3\b\3\b\3\b\3"+
		"\b\3\b\7\b\u0084\n\b\f\b\16\b\u0087\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u0098\n\13\f\13\16\13\u009b\13"+
		"\13\3\13\3\13\3\f\3\f\3\f\7\f\u00a2\n\f\f\f\16\f\u00a5\13\f\3\r\3\r\3"+
		"\r\7\r\u00aa\n\r\f\r\16\r\u00ad\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00b8\n\16\5\16\u00ba\n\16\3\17\3\17\3\17\5\17\u00bf\n"+
		"\17\3\20\3\20\3\20\5\20\u00c4\n\20\3\20\2\21\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36\2\6\4\25\25%%\5\7\7\17\17\26\27\5\13\r\36\36!\"\4\25\25%"+
		"%\u00d1\2!\3\2\2\2\4,\3\2\2\2\6.\3\2\2\2\bF\3\2\2\2\nQ\3\2\2\2\fu\3\2"+
		"\2\2\16w\3\2\2\2\20\u008a\3\2\2\2\22\u0091\3\2\2\2\24\u0093\3\2\2\2\26"+
		"\u009e\3\2\2\2\30\u00a6\3\2\2\2\32\u00b9\3\2\2\2\34\u00bb\3\2\2\2\36\u00c0"+
		"\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2"+
		"\2%&\5\n\6\2&\'\7\35\2\2\'-\3\2\2\2()\5\6\4\2)*\7\35\2\2*-\3\2\2\2+-\7"+
		"\'\2\2,%\3\2\2\2,(\3\2\2\2,+\3\2\2\2-\5\3\2\2\2.\61\7$\2\2/\60\7%\2\2"+
		"\60\62\7\4\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7%\2\2\64"+
		"\67\7\5\2\2\65\66\7%\2\2\668\7\4\2\2\67\65\3\2\2\2\678\3\2\2\289\3\2\2"+
		"\29:\7%\2\2:@\7 \2\2;<\7\n\2\2<=\5\26\f\2=>\7\31\2\2>A\3\2\2\2?A\5\26"+
		"\f\2@;\3\2\2\2@?\3\2\2\2AD\3\2\2\2BC\7\6\2\2CE\5\b\5\2DB\3\2\2\2DE\3\2"+
		"\2\2E\7\3\2\2\2FG\7\21\2\2GL\5\36\20\2HI\7\5\2\2IK\5\36\20\2JH\3\2\2\2"+
		"KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\24\2\2P\t\3\2\2"+
		"\2QT\7%\2\2RS\7\30\2\2SU\5\f\7\2TR\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2"+
		"\2W\13\3\2\2\2X[\7#\2\2YZ\7\3\2\2Z\\\7%\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3"+
		"\2\2\2]v\5\26\f\2^a\7\37\2\2_`\7\3\2\2`b\7%\2\2a_\3\2\2\2ab\3\2\2\2bc"+
		"\3\2\2\2cv\5\24\13\2dg\7\33\2\2ef\7\3\2\2fh\7%\2\2ge\3\2\2\2gh\3\2\2\2"+
		"hq\3\2\2\2ij\7\22\2\2jk\7%\2\2kl\7\34\2\2lo\5\34\17\2mn\7\16\2\2np\7%"+
		"\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qi\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\7\6"+
		"\2\2tv\5\16\b\2uX\3\2\2\2u^\3\2\2\2ud\3\2\2\2v\r\3\2\2\2w|\7\21\2\2x}"+
		"\7%\2\2yz\7%\2\2z{\7\t\2\2{}\5\20\t\2|x\3\2\2\2|y\3\2\2\2}\u0085\3\2\2"+
		"\2~\177\7\5\2\2\177\u0084\7%\2\2\u0080\u0081\7%\2\2\u0081\u0082\7\t\2"+
		"\2\u0082\u0084\5\20\t\2\u0083~\3\2\2\2\u0083\u0080\3\2\2\2\u0084\u0087"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u0089\7\24\2\2\u0089\17\3\2\2\2\u008a\u008b\5\22"+
		"\n\2\u008b\u008c\7\n\2\2\u008c\u008d\t\2\2\2\u008d\u008e\7\20\2\2\u008e"+
		"\u008f\7%\2\2\u008f\u0090\7\31\2\2\u0090\21\3\2\2\2\u0091\u0092\t\3\2"+
		"\2\u0092\23\3\2\2\2\u0093\u0094\7\21\2\2\u0094\u0099\5\34\17\2\u0095\u0096"+
		"\7\5\2\2\u0096\u0098\5\34\17\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009c\u009d\7\24\2\2\u009d\25\3\2\2\2\u009e\u00a3\5\30\r\2\u009f"+
		"\u00a0\7\b\2\2\u00a0\u00a2\5\30\r\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3"+
		"\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\27\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00ab\5\32\16\2\u00a7\u00a8\7\23\2\2\u00a8\u00aa"+
		"\5\32\16\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\u00ab\u00ac\3\2\2\2\u00ac\31\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00af"+
		"\7\n\2\2\u00af\u00b0\5\26\f\2\u00b0\u00b1\7\31\2\2\u00b1\u00ba\3\2\2\2"+
		"\u00b2\u00ba\5\34\17\2\u00b3\u00b4\5\34\17\2\u00b4\u00b7\t\4\2\2\u00b5"+
		"\u00b8\7&\2\2\u00b6\u00b8\5\34\17\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3"+
		"\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00ae\3\2\2\2\u00b9\u00b2\3\2\2\2\u00b9"+
		"\u00b3\3\2\2\2\u00ba\33\3\2\2\2\u00bb\u00be\t\5\2\2\u00bc\u00bd\7\32\2"+
		"\2\u00bd\u00bf\7%\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\35"+
		"\3\2\2\2\u00c0\u00c3\7%\2\2\u00c1\u00c2\7\32\2\2\u00c2\u00c4\7%\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\37\3\2\2\2\32#,\61\67@DLV[ag"+
		"oqu|\u0083\u0085\u0099\u00a3\u00ab\u00b7\u00b9\u00be\u00c3";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}