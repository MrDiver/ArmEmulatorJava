// Generated from H:/MyStuff/PrivateProjects/ArmEmulatorJava/src/grammar\ArmParser.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, MOV=2, COMMA=3, NEWLINE=4, REG=5, SP=6, LR=7, PC=8, LITERAL=9, 
		EQ=10, NE=11, CS=12, CC=13, MI=14, S=15, WS=16;
	public static final int
		RULE_program = 0, RULE_sequence = 1, RULE_op = 2, RULE_mov = 3, RULE_add = 4, 
		RULE_rd = 5, RULE_rn = 6, RULE_operand2 = 7, RULE_cond = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sequence", "op", "mov", "add", "rd", "rn", "operand2", "cond"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "','", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "MOV", "COMMA", "NEWLINE", "REG", "SP", "LR", "PC", "LITERAL", 
			"EQ", "NE", "CS", "CC", "MI", "S", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ArmParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			sequence();
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

	public static class SequenceContext extends ParserRuleContext {
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(ArmParser.NEWLINE, 0); }
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			op();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(21);
				match(NEWLINE);
				setState(22);
				op();
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

	public static class OpContext extends ParserRuleContext {
		public MovContext mov() {
			return getRuleContext(MovContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_op);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOV:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				mov();
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				add();
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

	public static class MovContext extends ParserRuleContext {
		public TerminalNode MOV() { return getToken(ArmParser.MOV, 0); }
		public RdContext rd() {
			return getRuleContext(RdContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ArmParser.COMMA, 0); }
		public Operand2Context operand2() {
			return getRuleContext(Operand2Context.class,0);
		}
		public TerminalNode S() { return getToken(ArmParser.S, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public MovContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mov; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterMov(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitMov(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitMov(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovContext mov() throws RecognitionException {
		MovContext _localctx = new MovContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mov);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(MOV);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==S) {
				{
				setState(30);
				match(S);
				}
			}

			}
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(33);
				cond();
				}
			}

			}
			setState(36);
			rd();
			setState(37);
			match(COMMA);
			setState(38);
			operand2();
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

	public static class AddContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(ArmParser.ADD, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ArmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArmParser.COMMA, i);
		}
		public RnContext rn() {
			return getRuleContext(RnContext.class,0);
		}
		public Operand2Context operand2() {
			return getRuleContext(Operand2Context.class,0);
		}
		public RdContext rd() {
			return getRuleContext(RdContext.class,0);
		}
		public TerminalNode S() { return getToken(ArmParser.S, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_add);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ADD);
			{
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==S) {
				{
				setState(41);
				match(S);
				}
			}

			}
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(44);
				cond();
				}
			}

			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REG) {
				{
				setState(47);
				rd();
				}
			}

			setState(50);
			match(COMMA);
			setState(51);
			rn();
			setState(52);
			match(COMMA);
			setState(53);
			operand2();
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

	public static class RdContext extends ParserRuleContext {
		public TerminalNode REG() { return getToken(ArmParser.REG, 0); }
		public RdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterRd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitRd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitRd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RdContext rd() throws RecognitionException {
		RdContext _localctx = new RdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(REG);
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

	public static class RnContext extends ParserRuleContext {
		public TerminalNode REG() { return getToken(ArmParser.REG, 0); }
		public RnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterRn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitRn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitRn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RnContext rn() throws RecognitionException {
		RnContext _localctx = new RnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(REG);
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

	public static class Operand2Context extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(ArmParser.LITERAL, 0); }
		public TerminalNode REG() { return getToken(ArmParser.REG, 0); }
		public Operand2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterOperand2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitOperand2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitOperand2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operand2Context operand2() throws RecognitionException {
		Operand2Context _localctx = new Operand2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_operand2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !(_la==REG || _la==LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CondContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(ArmParser.EQ, 0); }
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(EQ);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22B\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\3"+
		"\3\3\3\3\5\3\32\n\3\3\4\3\4\5\4\36\n\4\3\5\3\5\5\5\"\n\5\3\5\5\5%\n\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\5\6-\n\6\3\6\5\6\60\n\6\3\6\5\6\63\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f"+
		"\16\20\22\2\3\4\2\7\7\13\13\2?\2\24\3\2\2\2\4\26\3\2\2\2\6\35\3\2\2\2"+
		"\b\37\3\2\2\2\n*\3\2\2\2\f9\3\2\2\2\16;\3\2\2\2\20=\3\2\2\2\22?\3\2\2"+
		"\2\24\25\5\4\3\2\25\3\3\2\2\2\26\31\5\6\4\2\27\30\7\6\2\2\30\32\5\6\4"+
		"\2\31\27\3\2\2\2\31\32\3\2\2\2\32\5\3\2\2\2\33\36\5\b\5\2\34\36\5\n\6"+
		"\2\35\33\3\2\2\2\35\34\3\2\2\2\36\7\3\2\2\2\37!\7\4\2\2 \"\7\21\2\2! "+
		"\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#%\5\22\n\2$#\3\2\2\2$%\3\2\2\2%&\3\2\2"+
		"\2&\'\5\f\7\2\'(\7\5\2\2()\5\20\t\2)\t\3\2\2\2*,\7\3\2\2+-\7\21\2\2,+"+
		"\3\2\2\2,-\3\2\2\2-/\3\2\2\2.\60\5\22\n\2/.\3\2\2\2/\60\3\2\2\2\60\62"+
		"\3\2\2\2\61\63\5\f\7\2\62\61\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65"+
		"\7\5\2\2\65\66\5\16\b\2\66\67\7\5\2\2\678\5\20\t\28\13\3\2\2\29:\7\7\2"+
		"\2:\r\3\2\2\2;<\7\7\2\2<\17\3\2\2\2=>\t\2\2\2>\21\3\2\2\2?@\7\f\2\2@\23"+
		"\3\2\2\2\t\31\35!$,/\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}