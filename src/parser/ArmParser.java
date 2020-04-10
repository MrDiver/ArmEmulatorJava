// Generated from H:/MyStuff/PrivateProjects/ArmEmulatorJava/src/grammar\ArmParser.g4 by ANTLR 4.8
package parser;
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
		EQ=1, NE=2, CS=3, CC=4, MI=5, PL=6, VS=7, VC=8, HI=9, LS=10, GE=11, LT=12, 
		GT=13, LE=14, AL=15, UPDATEFLAG=16, Branch=17, BranchAndLink=18, BLX=19, 
		BX=20, BXJ=21, AND=22, EOR=23, SUB=24, RSB=25, ADD=26, ADC=27, SBC=28, 
		RSC=29, TST=30, TEQ=31, CMP=32, CMN=33, ORR=34, MOV=35, BIC=36, MVN=37, 
		MUL=38, MLA=39, SMULL=40, UMULL=41, SMLAL=42, UMLAL=43, LDR=44, STR=45, 
		BYTEACCESS=46, PRIVILEGE=47, DOUBLEWORD=48, HALFWORD=49, SIGNEDHALFWORD=50, 
		SIGNEDBYTE=51, LSL=52, LSR=53, ASR=54, ROR=55, RRX=56, R0=57, R1=58, R2=59, 
		R3=60, R4=61, R5=62, R6=63, R7=64, R8=65, R9=66, R10=67, R11=68, R12=69, 
		R13=70, R14=71, R15=72, HASH=73, HEX=74, NUMBER=75, COMMENTM=76, COMMENT=77, 
		NEWLINE=78, COMMA=79, COLON=80, LBRACKET=81, RBRACKET=82, SPECIALRBRACKET=83, 
		WS=84, LABELTEXT=85;
	public static final int
		RULE_compilationUnit = 0, RULE_program = 1, RULE_statement = 2, RULE_instruction = 3, 
		RULE_cond = 4, RULE_reg = 5, RULE_immediate = 6, RULE_branch_instruction = 7, 
		RULE_data_processing_instruction = 8, RULE_shifter_operand = 9, RULE_shift_operation = 10, 
		RULE_shiftopcode = 11, RULE_multiply_instruction = 12, RULE_load_store_instruction = 13, 
		RULE_addressing_mode = 14, RULE_labelReference = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "program", "statement", "instruction", "cond", "reg", 
			"immediate", "branch_instruction", "data_processing_instruction", "shifter_operand", 
			"shift_operation", "shiftopcode", "multiply_instruction", "load_store_instruction", 
			"addressing_mode", "labelReference"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'#'", null, null, null, null, null, "','", "':'", "'['", "']'", 
			"']!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQ", "NE", "CS", "CC", "MI", "PL", "VS", "VC", "HI", "LS", "GE", 
			"LT", "GT", "LE", "AL", "UPDATEFLAG", "Branch", "BranchAndLink", "BLX", 
			"BX", "BXJ", "AND", "EOR", "SUB", "RSB", "ADD", "ADC", "SBC", "RSC", 
			"TST", "TEQ", "CMP", "CMN", "ORR", "MOV", "BIC", "MVN", "MUL", "MLA", 
			"SMULL", "UMULL", "SMLAL", "UMLAL", "LDR", "STR", "BYTEACCESS", "PRIVILEGE", 
			"DOUBLEWORD", "HALFWORD", "SIGNEDHALFWORD", "SIGNEDBYTE", "LSL", "LSR", 
			"ASR", "ROR", "RRX", "R0", "R1", "R2", "R3", "R4", "R5", "R6", "R7", 
			"R8", "R9", "R10", "R11", "R12", "R13", "R14", "R15", "HASH", "HEX", 
			"NUMBER", "COMMENTM", "COMMENT", "NEWLINE", "COMMA", "COLON", "LBRACKET", 
			"RBRACKET", "SPECIALRBRACKET", "WS", "LABELTEXT"
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

	public static class CompilationUnitContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ArmParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			program();
			setState(33);
			match(EOF);
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

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ArmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ArmParser.NEWLINE, i);
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
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			statement();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(36);
				match(NEWLINE);
				setState(37);
				statement();
				}
				}
				setState(42);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(ArmParser.COMMENT, 0); }
		public TerminalNode COMMENTM() { return getToken(ArmParser.COMMENTM, 0); }
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(COMMENT);
				}
				break;
			case COMMENTM:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(COMMENTM);
				}
				break;
			case AND:
			case EOR:
			case SUB:
			case RSB:
			case ADD:
			case ADC:
			case SBC:
			case RSC:
			case TST:
			case TEQ:
			case CMP:
			case CMN:
			case ORR:
			case MOV:
			case BIC:
			case MVN:
			case LDR:
			case STR:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				instruction();
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

	public static class InstructionContext extends ParserRuleContext {
		public Data_processing_instructionContext data_processing_instruction() {
			return getRuleContext(Data_processing_instructionContext.class,0);
		}
		public Load_store_instructionContext load_store_instruction() {
			return getRuleContext(Load_store_instructionContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
			case EOR:
			case SUB:
			case RSB:
			case ADD:
			case ADC:
			case SBC:
			case RSC:
			case TST:
			case TEQ:
			case CMP:
			case CMN:
			case ORR:
			case MOV:
			case BIC:
			case MVN:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				data_processing_instruction();
				}
				break;
			case LDR:
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				load_store_instruction();
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

	public static class CondContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(ArmParser.EQ, 0); }
		public TerminalNode NE() { return getToken(ArmParser.NE, 0); }
		public TerminalNode CS() { return getToken(ArmParser.CS, 0); }
		public TerminalNode CC() { return getToken(ArmParser.CC, 0); }
		public TerminalNode MI() { return getToken(ArmParser.MI, 0); }
		public TerminalNode PL() { return getToken(ArmParser.PL, 0); }
		public TerminalNode VS() { return getToken(ArmParser.VS, 0); }
		public TerminalNode VC() { return getToken(ArmParser.VC, 0); }
		public TerminalNode HI() { return getToken(ArmParser.HI, 0); }
		public TerminalNode LS() { return getToken(ArmParser.LS, 0); }
		public TerminalNode GE() { return getToken(ArmParser.GE, 0); }
		public TerminalNode LT() { return getToken(ArmParser.LT, 0); }
		public TerminalNode GT() { return getToken(ArmParser.GT, 0); }
		public TerminalNode LE() { return getToken(ArmParser.LE, 0); }
		public TerminalNode AL() { return getToken(ArmParser.AL, 0); }
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
		enterRule(_localctx, 8, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << CS) | (1L << CC) | (1L << MI) | (1L << PL) | (1L << VS) | (1L << VC) | (1L << HI) | (1L << LS) | (1L << GE) | (1L << LT) | (1L << GT) | (1L << LE) | (1L << AL))) != 0)) ) {
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

	public static class RegContext extends ParserRuleContext {
		public TerminalNode R0() { return getToken(ArmParser.R0, 0); }
		public TerminalNode R1() { return getToken(ArmParser.R1, 0); }
		public TerminalNode R2() { return getToken(ArmParser.R2, 0); }
		public TerminalNode R3() { return getToken(ArmParser.R3, 0); }
		public TerminalNode R4() { return getToken(ArmParser.R4, 0); }
		public TerminalNode R5() { return getToken(ArmParser.R5, 0); }
		public TerminalNode R6() { return getToken(ArmParser.R6, 0); }
		public TerminalNode R7() { return getToken(ArmParser.R7, 0); }
		public TerminalNode R8() { return getToken(ArmParser.R8, 0); }
		public TerminalNode R9() { return getToken(ArmParser.R9, 0); }
		public TerminalNode R10() { return getToken(ArmParser.R10, 0); }
		public TerminalNode R11() { return getToken(ArmParser.R11, 0); }
		public TerminalNode R12() { return getToken(ArmParser.R12, 0); }
		public TerminalNode R13() { return getToken(ArmParser.R13, 0); }
		public TerminalNode R14() { return getToken(ArmParser.R14, 0); }
		public TerminalNode R15() { return getToken(ArmParser.R15, 0); }
		public RegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitReg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitReg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegContext reg() throws RecognitionException {
		RegContext _localctx = new RegContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_reg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (R0 - 57)) | (1L << (R1 - 57)) | (1L << (R2 - 57)) | (1L << (R3 - 57)) | (1L << (R4 - 57)) | (1L << (R5 - 57)) | (1L << (R6 - 57)) | (1L << (R7 - 57)) | (1L << (R8 - 57)) | (1L << (R9 - 57)) | (1L << (R10 - 57)) | (1L << (R11 - 57)) | (1L << (R12 - 57)) | (1L << (R13 - 57)) | (1L << (R14 - 57)) | (1L << (R15 - 57)))) != 0)) ) {
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

	public static class ImmediateContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(ArmParser.HASH, 0); }
		public TerminalNode HEX() { return getToken(ArmParser.HEX, 0); }
		public TerminalNode NUMBER() { return getToken(ArmParser.NUMBER, 0); }
		public ImmediateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immediate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterImmediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitImmediate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitImmediate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImmediateContext immediate() throws RecognitionException {
		ImmediateContext _localctx = new ImmediateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_immediate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(HASH);
			setState(57);
			_la = _input.LA(1);
			if ( !(_la==HEX || _la==NUMBER) ) {
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

	public static class Branch_instructionContext extends ParserRuleContext {
		public Token opcode;
		public LabelReferenceContext labelReference() {
			return getRuleContext(LabelReferenceContext.class,0);
		}
		public TerminalNode Branch() { return getToken(ArmParser.Branch, 0); }
		public TerminalNode BranchAndLink() { return getToken(ArmParser.BranchAndLink, 0); }
		public TerminalNode BLX() { return getToken(ArmParser.BLX, 0); }
		public TerminalNode BX() { return getToken(ArmParser.BX, 0); }
		public TerminalNode BXJ() { return getToken(ArmParser.BXJ, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public Branch_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterBranch_instruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitBranch_instruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitBranch_instruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Branch_instructionContext branch_instruction() throws RecognitionException {
		Branch_instructionContext _localctx = new Branch_instructionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_branch_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((Branch_instructionContext)_localctx).opcode = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Branch) | (1L << BranchAndLink) | (1L << BLX) | (1L << BX) | (1L << BXJ))) != 0)) ) {
				((Branch_instructionContext)_localctx).opcode = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << CS) | (1L << CC) | (1L << MI) | (1L << PL) | (1L << VS) | (1L << VC) | (1L << HI) | (1L << LS) | (1L << GE) | (1L << LT) | (1L << GT) | (1L << LE) | (1L << AL))) != 0)) {
				{
				setState(60);
				cond();
				}
			}

			setState(63);
			labelReference();
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

	public static class Data_processing_instructionContext extends ParserRuleContext {
		public Data_processing_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_processing_instruction; }
	 
		public Data_processing_instructionContext() { }
		public void copyFrom(Data_processing_instructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MoveOpContext extends Data_processing_instructionContext {
		public Token opcode;
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ArmParser.COMMA, 0); }
		public Shifter_operandContext shifter_operand() {
			return getRuleContext(Shifter_operandContext.class,0);
		}
		public TerminalNode MOV() { return getToken(ArmParser.MOV, 0); }
		public TerminalNode MVN() { return getToken(ArmParser.MVN, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode UPDATEFLAG() { return getToken(ArmParser.UPDATEFLAG, 0); }
		public MoveOpContext(Data_processing_instructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterMoveOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitMoveOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitMoveOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticOpContext extends Data_processing_instructionContext {
		public Token opcode;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArmParser.COMMA, i);
		}
		public Shifter_operandContext shifter_operand() {
			return getRuleContext(Shifter_operandContext.class,0);
		}
		public TerminalNode ADD() { return getToken(ArmParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ArmParser.SUB, 0); }
		public TerminalNode RSB() { return getToken(ArmParser.RSB, 0); }
		public TerminalNode ADC() { return getToken(ArmParser.ADC, 0); }
		public TerminalNode SBC() { return getToken(ArmParser.SBC, 0); }
		public TerminalNode RSC() { return getToken(ArmParser.RSC, 0); }
		public TerminalNode AND() { return getToken(ArmParser.AND, 0); }
		public TerminalNode BIC() { return getToken(ArmParser.BIC, 0); }
		public TerminalNode EOR() { return getToken(ArmParser.EOR, 0); }
		public TerminalNode ORR() { return getToken(ArmParser.ORR, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode UPDATEFLAG() { return getToken(ArmParser.UPDATEFLAG, 0); }
		public ArithmeticOpContext(Data_processing_instructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterArithmeticOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitArithmeticOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitArithmeticOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareOpContext extends Data_processing_instructionContext {
		public Token opcode;
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ArmParser.COMMA, 0); }
		public Shifter_operandContext shifter_operand() {
			return getRuleContext(Shifter_operandContext.class,0);
		}
		public TerminalNode CMP() { return getToken(ArmParser.CMP, 0); }
		public TerminalNode CMN() { return getToken(ArmParser.CMN, 0); }
		public TerminalNode TST() { return getToken(ArmParser.TST, 0); }
		public TerminalNode TEQ() { return getToken(ArmParser.TEQ, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CompareOpContext(Data_processing_instructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterCompareOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitCompareOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitCompareOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_processing_instructionContext data_processing_instruction() throws RecognitionException {
		Data_processing_instructionContext _localctx = new Data_processing_instructionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_data_processing_instruction);
		int _la;
		try {
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOV:
			case MVN:
				_localctx = new MoveOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				((MoveOpContext)_localctx).opcode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MOV || _la==MVN) ) {
					((MoveOpContext)_localctx).opcode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << CS) | (1L << CC) | (1L << MI) | (1L << PL) | (1L << VS) | (1L << VC) | (1L << HI) | (1L << LS) | (1L << GE) | (1L << LT) | (1L << GT) | (1L << LE) | (1L << AL))) != 0)) {
					{
					setState(66);
					cond();
					}
				}

				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UPDATEFLAG) {
					{
					setState(69);
					match(UPDATEFLAG);
					}
				}

				setState(72);
				reg();
				setState(73);
				match(COMMA);
				setState(74);
				shifter_operand();
				}
				break;
			case TST:
			case TEQ:
			case CMP:
			case CMN:
				_localctx = new CompareOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				((CompareOpContext)_localctx).opcode = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TST) | (1L << TEQ) | (1L << CMP) | (1L << CMN))) != 0)) ) {
					((CompareOpContext)_localctx).opcode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << CS) | (1L << CC) | (1L << MI) | (1L << PL) | (1L << VS) | (1L << VC) | (1L << HI) | (1L << LS) | (1L << GE) | (1L << LT) | (1L << GT) | (1L << LE) | (1L << AL))) != 0)) {
					{
					setState(77);
					cond();
					}
				}

				setState(80);
				reg();
				setState(81);
				match(COMMA);
				setState(82);
				shifter_operand();
				}
				break;
			case AND:
			case EOR:
			case SUB:
			case RSB:
			case ADD:
			case ADC:
			case SBC:
			case RSC:
			case ORR:
			case BIC:
				_localctx = new ArithmeticOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				((ArithmeticOpContext)_localctx).opcode = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << EOR) | (1L << SUB) | (1L << RSB) | (1L << ADD) | (1L << ADC) | (1L << SBC) | (1L << RSC) | (1L << ORR) | (1L << BIC))) != 0)) ) {
					((ArithmeticOpContext)_localctx).opcode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << CS) | (1L << CC) | (1L << MI) | (1L << PL) | (1L << VS) | (1L << VC) | (1L << HI) | (1L << LS) | (1L << GE) | (1L << LT) | (1L << GT) | (1L << LE) | (1L << AL))) != 0)) {
					{
					setState(85);
					cond();
					}
				}

				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UPDATEFLAG) {
					{
					setState(88);
					match(UPDATEFLAG);
					}
				}

				setState(91);
				reg();
				setState(92);
				match(COMMA);
				setState(93);
				reg();
				setState(94);
				match(COMMA);
				setState(95);
				shifter_operand();
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

	public static class Shifter_operandContext extends ParserRuleContext {
		public Shifter_operandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shifter_operand; }
	 
		public Shifter_operandContext() { }
		public void copyFrom(Shifter_operandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Op2registerContext extends Shifter_operandContext {
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public Op2registerContext(Shifter_operandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterOp2register(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitOp2register(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitOp2register(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Op2immediateContext extends Shifter_operandContext {
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public Op2immediateContext(Shifter_operandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterOp2immediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitOp2immediate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitOp2immediate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Op2inlineShiftContext extends Shifter_operandContext {
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ArmParser.COMMA, 0); }
		public Shift_operationContext shift_operation() {
			return getRuleContext(Shift_operationContext.class,0);
		}
		public Op2inlineShiftContext(Shifter_operandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterOp2inlineShift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitOp2inlineShift(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitOp2inlineShift(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shifter_operandContext shifter_operand() throws RecognitionException {
		Shifter_operandContext _localctx = new Shifter_operandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_shifter_operand);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new Op2immediateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				immediate();
				}
				break;
			case 2:
				_localctx = new Op2registerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				reg();
				}
				break;
			case 3:
				_localctx = new Op2inlineShiftContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				reg();
				setState(102);
				match(COMMA);
				setState(103);
				shift_operation();
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

	public static class Shift_operationContext extends ParserRuleContext {
		public Shift_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_operation; }
	 
		public Shift_operationContext() { }
		public void copyFrom(Shift_operationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ShiftByImmediateContext extends Shift_operationContext {
		public ShiftopcodeContext shiftopcode() {
			return getRuleContext(ShiftopcodeContext.class,0);
		}
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public ShiftByImmediateContext(Shift_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterShiftByImmediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitShiftByImmediate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitShiftByImmediate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShiftByRegisterContext extends Shift_operationContext {
		public ShiftopcodeContext shiftopcode() {
			return getRuleContext(ShiftopcodeContext.class,0);
		}
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public ShiftByRegisterContext(Shift_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterShiftByRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitShiftByRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitShiftByRegister(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RotateWithExtendContext extends Shift_operationContext {
		public TerminalNode RRX() { return getToken(ArmParser.RRX, 0); }
		public RotateWithExtendContext(Shift_operationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterRotateWithExtend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitRotateWithExtend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitRotateWithExtend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shift_operationContext shift_operation() throws RecognitionException {
		Shift_operationContext _localctx = new Shift_operationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_shift_operation);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ShiftByImmediateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				shiftopcode();
				setState(108);
				immediate();
				}
				break;
			case 2:
				_localctx = new ShiftByRegisterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				shiftopcode();
				setState(111);
				reg();
				}
				break;
			case 3:
				_localctx = new RotateWithExtendContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(RRX);
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

	public static class ShiftopcodeContext extends ParserRuleContext {
		public TerminalNode LSL() { return getToken(ArmParser.LSL, 0); }
		public TerminalNode LSR() { return getToken(ArmParser.LSR, 0); }
		public TerminalNode ASR() { return getToken(ArmParser.ASR, 0); }
		public TerminalNode ROR() { return getToken(ArmParser.ROR, 0); }
		public ShiftopcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftopcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterShiftopcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitShiftopcode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitShiftopcode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftopcodeContext shiftopcode() throws RecognitionException {
		ShiftopcodeContext _localctx = new ShiftopcodeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_shiftopcode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LSL) | (1L << LSR) | (1L << ASR) | (1L << ROR))) != 0)) ) {
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

	public static class Multiply_instructionContext extends ParserRuleContext {
		public Multiply_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply_instruction; }
	 
		public Multiply_instructionContext() { }
		public void copyFrom(Multiply_instructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LongMulContext extends Multiply_instructionContext {
		public Token opcode;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArmParser.COMMA, i);
		}
		public TerminalNode SMULL() { return getToken(ArmParser.SMULL, 0); }
		public TerminalNode UMULL() { return getToken(ArmParser.UMULL, 0); }
		public TerminalNode SMLAL() { return getToken(ArmParser.SMLAL, 0); }
		public TerminalNode UMLAL() { return getToken(ArmParser.UMLAL, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public LongMulContext(Multiply_instructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterLongMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitLongMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitLongMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalMulContext extends Multiply_instructionContext {
		public Token opcode;
		public List<RegContext> reg() {
			return getRuleContexts(RegContext.class);
		}
		public RegContext reg(int i) {
			return getRuleContext(RegContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ArmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ArmParser.COMMA, i);
		}
		public TerminalNode MUL() { return getToken(ArmParser.MUL, 0); }
		public TerminalNode MLA() { return getToken(ArmParser.MLA, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public NormalMulContext(Multiply_instructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterNormalMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitNormalMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitNormalMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiply_instructionContext multiply_instruction() throws RecognitionException {
		Multiply_instructionContext _localctx = new Multiply_instructionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multiply_instruction);
		int _la;
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUL:
			case MLA:
				_localctx = new NormalMulContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				((NormalMulContext)_localctx).opcode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==MLA) ) {
					((NormalMulContext)_localctx).opcode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << CS) | (1L << CC) | (1L << MI) | (1L << PL) | (1L << VS) | (1L << VC) | (1L << HI) | (1L << LS) | (1L << GE) | (1L << LT) | (1L << GT) | (1L << LE) | (1L << AL))) != 0)) {
					{
					setState(119);
					cond();
					}
				}

				setState(122);
				reg();
				setState(123);
				match(COMMA);
				setState(124);
				reg();
				setState(125);
				match(COMMA);
				setState(126);
				reg();
				}
				break;
			case SMULL:
			case UMULL:
			case SMLAL:
			case UMLAL:
				_localctx = new LongMulContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				((LongMulContext)_localctx).opcode = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SMULL) | (1L << UMULL) | (1L << SMLAL) | (1L << UMLAL))) != 0)) ) {
					((LongMulContext)_localctx).opcode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << CS) | (1L << CC) | (1L << MI) | (1L << PL) | (1L << VS) | (1L << VC) | (1L << HI) | (1L << LS) | (1L << GE) | (1L << LT) | (1L << GT) | (1L << LE) | (1L << AL))) != 0)) {
					{
					setState(129);
					cond();
					}
				}

				setState(132);
				reg();
				setState(133);
				match(COMMA);
				setState(134);
				reg();
				setState(135);
				match(COMMA);
				setState(136);
				reg();
				setState(137);
				match(COMMA);
				setState(138);
				reg();
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

	public static class Load_store_instructionContext extends ParserRuleContext {
		public Load_store_instructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load_store_instruction; }
	 
		public Load_store_instructionContext() { }
		public void copyFrom(Load_store_instructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SecondLoadStoreContext extends Load_store_instructionContext {
		public Token opcode;
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ArmParser.COMMA, 0); }
		public Addressing_modeContext addressing_mode() {
			return getRuleContext(Addressing_modeContext.class,0);
		}
		public TerminalNode DOUBLEWORD() { return getToken(ArmParser.DOUBLEWORD, 0); }
		public TerminalNode HALFWORD() { return getToken(ArmParser.HALFWORD, 0); }
		public TerminalNode SIGNEDHALFWORD() { return getToken(ArmParser.SIGNEDHALFWORD, 0); }
		public TerminalNode SIGNEDBYTE() { return getToken(ArmParser.SIGNEDBYTE, 0); }
		public TerminalNode LDR() { return getToken(ArmParser.LDR, 0); }
		public TerminalNode STR() { return getToken(ArmParser.STR, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public SecondLoadStoreContext(Load_store_instructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterSecondLoadStore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitSecondLoadStore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitSecondLoadStore(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstLoadStoreContext extends Load_store_instructionContext {
		public Token opcode;
		public RegContext reg() {
			return getRuleContext(RegContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ArmParser.COMMA, 0); }
		public Addressing_modeContext addressing_mode() {
			return getRuleContext(Addressing_modeContext.class,0);
		}
		public TerminalNode LDR() { return getToken(ArmParser.LDR, 0); }
		public TerminalNode STR() { return getToken(ArmParser.STR, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode BYTEACCESS() { return getToken(ArmParser.BYTEACCESS, 0); }
		public TerminalNode PRIVILEGE() { return getToken(ArmParser.PRIVILEGE, 0); }
		public FirstLoadStoreContext(Load_store_instructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterFirstLoadStore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitFirstLoadStore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitFirstLoadStore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Load_store_instructionContext load_store_instruction() throws RecognitionException {
		Load_store_instructionContext _localctx = new Load_store_instructionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_load_store_instruction);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new FirstLoadStoreContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((FirstLoadStoreContext)_localctx).opcode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LDR || _la==STR) ) {
					((FirstLoadStoreContext)_localctx).opcode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << CS) | (1L << CC) | (1L << MI) | (1L << PL) | (1L << VS) | (1L << VC) | (1L << HI) | (1L << LS) | (1L << GE) | (1L << LT) | (1L << GT) | (1L << LE) | (1L << AL))) != 0)) {
					{
					setState(143);
					cond();
					}
				}

				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BYTEACCESS) {
					{
					setState(146);
					match(BYTEACCESS);
					}
				}

				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRIVILEGE) {
					{
					setState(149);
					match(PRIVILEGE);
					}
				}

				setState(152);
				reg();
				setState(153);
				match(COMMA);
				setState(154);
				addressing_mode();
				}
				break;
			case 2:
				_localctx = new SecondLoadStoreContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				((SecondLoadStoreContext)_localctx).opcode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LDR || _la==STR) ) {
					((SecondLoadStoreContext)_localctx).opcode = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << CS) | (1L << CC) | (1L << MI) | (1L << PL) | (1L << VS) | (1L << VC) | (1L << HI) | (1L << LS) | (1L << GE) | (1L << LT) | (1L << GT) | (1L << LE) | (1L << AL))) != 0)) {
					{
					setState(157);
					cond();
					}
				}

				setState(160);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLEWORD) | (1L << HALFWORD) | (1L << SIGNEDHALFWORD) | (1L << SIGNEDBYTE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(161);
				reg();
				setState(162);
				match(COMMA);
				setState(163);
				addressing_mode();
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

	public static class Addressing_modeContext extends ParserRuleContext {
		public Addressing_modeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addressing_mode; }
	 
		public Addressing_modeContext() { }
		public void copyFrom(Addressing_modeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PostIndexedAddressingContext extends Addressing_modeContext {
		public Token baseRegister;
		public TerminalNode LBRACKET() { return getToken(ArmParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ArmParser.RBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(ArmParser.COMMA, 0); }
		public Shifter_operandContext shifter_operand() {
			return getRuleContext(Shifter_operandContext.class,0);
		}
		public TerminalNode R0() { return getToken(ArmParser.R0, 0); }
		public TerminalNode R1() { return getToken(ArmParser.R1, 0); }
		public TerminalNode R2() { return getToken(ArmParser.R2, 0); }
		public TerminalNode R3() { return getToken(ArmParser.R3, 0); }
		public TerminalNode R4() { return getToken(ArmParser.R4, 0); }
		public TerminalNode R5() { return getToken(ArmParser.R5, 0); }
		public TerminalNode R6() { return getToken(ArmParser.R6, 0); }
		public TerminalNode R7() { return getToken(ArmParser.R7, 0); }
		public TerminalNode R8() { return getToken(ArmParser.R8, 0); }
		public TerminalNode R9() { return getToken(ArmParser.R9, 0); }
		public TerminalNode R10() { return getToken(ArmParser.R10, 0); }
		public TerminalNode R11() { return getToken(ArmParser.R11, 0); }
		public TerminalNode R12() { return getToken(ArmParser.R12, 0); }
		public TerminalNode R13() { return getToken(ArmParser.R13, 0); }
		public TerminalNode R14() { return getToken(ArmParser.R14, 0); }
		public TerminalNode R15() { return getToken(ArmParser.R15, 0); }
		public PostIndexedAddressingContext(Addressing_modeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterPostIndexedAddressing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitPostIndexedAddressing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitPostIndexedAddressing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreIndexedAddressingContext extends Addressing_modeContext {
		public Token baseRegister;
		public TerminalNode LBRACKET() { return getToken(ArmParser.LBRACKET, 0); }
		public TerminalNode SPECIALRBRACKET() { return getToken(ArmParser.SPECIALRBRACKET, 0); }
		public TerminalNode R0() { return getToken(ArmParser.R0, 0); }
		public TerminalNode R1() { return getToken(ArmParser.R1, 0); }
		public TerminalNode R2() { return getToken(ArmParser.R2, 0); }
		public TerminalNode R3() { return getToken(ArmParser.R3, 0); }
		public TerminalNode R4() { return getToken(ArmParser.R4, 0); }
		public TerminalNode R5() { return getToken(ArmParser.R5, 0); }
		public TerminalNode R6() { return getToken(ArmParser.R6, 0); }
		public TerminalNode R7() { return getToken(ArmParser.R7, 0); }
		public TerminalNode R8() { return getToken(ArmParser.R8, 0); }
		public TerminalNode R9() { return getToken(ArmParser.R9, 0); }
		public TerminalNode R10() { return getToken(ArmParser.R10, 0); }
		public TerminalNode R11() { return getToken(ArmParser.R11, 0); }
		public TerminalNode R12() { return getToken(ArmParser.R12, 0); }
		public TerminalNode R13() { return getToken(ArmParser.R13, 0); }
		public TerminalNode R14() { return getToken(ArmParser.R14, 0); }
		public TerminalNode R15() { return getToken(ArmParser.R15, 0); }
		public TerminalNode COMMA() { return getToken(ArmParser.COMMA, 0); }
		public Shifter_operandContext shifter_operand() {
			return getRuleContext(Shifter_operandContext.class,0);
		}
		public PreIndexedAddressingContext(Addressing_modeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterPreIndexedAddressing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitPreIndexedAddressing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitPreIndexedAddressing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalAddressingContext extends Addressing_modeContext {
		public Token baseRegister;
		public TerminalNode LBRACKET() { return getToken(ArmParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(ArmParser.RBRACKET, 0); }
		public TerminalNode R0() { return getToken(ArmParser.R0, 0); }
		public TerminalNode R1() { return getToken(ArmParser.R1, 0); }
		public TerminalNode R2() { return getToken(ArmParser.R2, 0); }
		public TerminalNode R3() { return getToken(ArmParser.R3, 0); }
		public TerminalNode R4() { return getToken(ArmParser.R4, 0); }
		public TerminalNode R5() { return getToken(ArmParser.R5, 0); }
		public TerminalNode R6() { return getToken(ArmParser.R6, 0); }
		public TerminalNode R7() { return getToken(ArmParser.R7, 0); }
		public TerminalNode R8() { return getToken(ArmParser.R8, 0); }
		public TerminalNode R9() { return getToken(ArmParser.R9, 0); }
		public TerminalNode R10() { return getToken(ArmParser.R10, 0); }
		public TerminalNode R11() { return getToken(ArmParser.R11, 0); }
		public TerminalNode R12() { return getToken(ArmParser.R12, 0); }
		public TerminalNode R13() { return getToken(ArmParser.R13, 0); }
		public TerminalNode R14() { return getToken(ArmParser.R14, 0); }
		public TerminalNode R15() { return getToken(ArmParser.R15, 0); }
		public TerminalNode COMMA() { return getToken(ArmParser.COMMA, 0); }
		public Shifter_operandContext shifter_operand() {
			return getRuleContext(Shifter_operandContext.class,0);
		}
		public NormalAddressingContext(Addressing_modeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterNormalAddressing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitNormalAddressing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitNormalAddressing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Addressing_modeContext addressing_mode() throws RecognitionException {
		Addressing_modeContext _localctx = new Addressing_modeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_addressing_mode);
		int _la;
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new NormalAddressingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(LBRACKET);
				setState(168);
				((NormalAddressingContext)_localctx).baseRegister = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (R0 - 57)) | (1L << (R1 - 57)) | (1L << (R2 - 57)) | (1L << (R3 - 57)) | (1L << (R4 - 57)) | (1L << (R5 - 57)) | (1L << (R6 - 57)) | (1L << (R7 - 57)) | (1L << (R8 - 57)) | (1L << (R9 - 57)) | (1L << (R10 - 57)) | (1L << (R11 - 57)) | (1L << (R12 - 57)) | (1L << (R13 - 57)) | (1L << (R14 - 57)) | (1L << (R15 - 57)))) != 0)) ) {
					((NormalAddressingContext)_localctx).baseRegister = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(169);
					match(COMMA);
					setState(170);
					shifter_operand();
					}
				}

				setState(173);
				match(RBRACKET);
				}
				break;
			case 2:
				_localctx = new PreIndexedAddressingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(LBRACKET);
				setState(175);
				((PreIndexedAddressingContext)_localctx).baseRegister = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (R0 - 57)) | (1L << (R1 - 57)) | (1L << (R2 - 57)) | (1L << (R3 - 57)) | (1L << (R4 - 57)) | (1L << (R5 - 57)) | (1L << (R6 - 57)) | (1L << (R7 - 57)) | (1L << (R8 - 57)) | (1L << (R9 - 57)) | (1L << (R10 - 57)) | (1L << (R11 - 57)) | (1L << (R12 - 57)) | (1L << (R13 - 57)) | (1L << (R14 - 57)) | (1L << (R15 - 57)))) != 0)) ) {
					((PreIndexedAddressingContext)_localctx).baseRegister = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(176);
					match(COMMA);
					setState(177);
					shifter_operand();
					}
				}

				setState(180);
				match(SPECIALRBRACKET);
				}
				break;
			case 3:
				_localctx = new PostIndexedAddressingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(LBRACKET);
				setState(182);
				((PostIndexedAddressingContext)_localctx).baseRegister = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (R0 - 57)) | (1L << (R1 - 57)) | (1L << (R2 - 57)) | (1L << (R3 - 57)) | (1L << (R4 - 57)) | (1L << (R5 - 57)) | (1L << (R6 - 57)) | (1L << (R7 - 57)) | (1L << (R8 - 57)) | (1L << (R9 - 57)) | (1L << (R10 - 57)) | (1L << (R11 - 57)) | (1L << (R12 - 57)) | (1L << (R13 - 57)) | (1L << (R14 - 57)) | (1L << (R15 - 57)))) != 0)) ) {
					((PostIndexedAddressingContext)_localctx).baseRegister = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(183);
				match(RBRACKET);
				setState(184);
				match(COMMA);
				setState(185);
				shifter_operand();
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

	public static class LabelReferenceContext extends ParserRuleContext {
		public TerminalNode LABELTEXT() { return getToken(ArmParser.LABELTEXT, 0); }
		public LabelReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).enterLabelReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArmParserListener ) ((ArmParserListener)listener).exitLabelReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArmParserVisitor ) return ((ArmParserVisitor<? extends T>)visitor).visitLabelReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelReferenceContext labelReference() throws RecognitionException {
		LabelReferenceContext _localctx = new LabelReferenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_labelReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(LABELTEXT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3W\u00c1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\4\3\4\3\4\5\4\61\n\4\3\5\3\5"+
		"\5\5\65\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\5\t@\n\t\3\t\3\t\3\n\3"+
		"\n\5\nF\n\n\3\n\5\nI\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nQ\n\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\nY\n\n\3\n\5\n\\\n\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nd\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\5\13l\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\fu\n\f\3\r\3\r\3\16\3\16\5\16{\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0085\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008f"+
		"\n\16\3\17\3\17\5\17\u0093\n\17\3\17\5\17\u0096\n\17\3\17\5\17\u0099\n"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a1\n\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00a8\n\17\3\20\3\20\3\20\3\20\5\20\u00ae\n\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00b5\n\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00bd"+
		"\n\20\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2"+
		"\16\3\2\3\21\3\2;J\3\2LM\3\2\23\27\4\2%%\'\'\3\2 #\5\2\30\37$$&&\3\2\66"+
		"9\3\2()\3\2*-\3\2./\3\2\62\65\2\u00cc\2\"\3\2\2\2\4%\3\2\2\2\6\60\3\2"+
		"\2\2\b\64\3\2\2\2\n\66\3\2\2\2\f8\3\2\2\2\16:\3\2\2\2\20=\3\2\2\2\22c"+
		"\3\2\2\2\24k\3\2\2\2\26t\3\2\2\2\30v\3\2\2\2\32\u008e\3\2\2\2\34\u00a7"+
		"\3\2\2\2\36\u00bc\3\2\2\2 \u00be\3\2\2\2\"#\5\4\3\2#$\7\2\2\3$\3\3\2\2"+
		"\2%*\5\6\4\2&\'\7P\2\2\')\5\6\4\2(&\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2"+
		"\2\2+\5\3\2\2\2,*\3\2\2\2-\61\7O\2\2.\61\7N\2\2/\61\5\b\5\2\60-\3\2\2"+
		"\2\60.\3\2\2\2\60/\3\2\2\2\61\7\3\2\2\2\62\65\5\22\n\2\63\65\5\34\17\2"+
		"\64\62\3\2\2\2\64\63\3\2\2\2\65\t\3\2\2\2\66\67\t\2\2\2\67\13\3\2\2\2"+
		"89\t\3\2\29\r\3\2\2\2:;\7K\2\2;<\t\4\2\2<\17\3\2\2\2=?\t\5\2\2>@\5\n\6"+
		"\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\5 \21\2B\21\3\2\2\2CE\t\6\2\2DF\5\n"+
		"\6\2ED\3\2\2\2EF\3\2\2\2FH\3\2\2\2GI\7\22\2\2HG\3\2\2\2HI\3\2\2\2IJ\3"+
		"\2\2\2JK\5\f\7\2KL\7Q\2\2LM\5\24\13\2Md\3\2\2\2NP\t\7\2\2OQ\5\n\6\2PO"+
		"\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\5\f\7\2ST\7Q\2\2TU\5\24\13\2Ud\3\2\2\2"+
		"VX\t\b\2\2WY\5\n\6\2XW\3\2\2\2XY\3\2\2\2Y[\3\2\2\2Z\\\7\22\2\2[Z\3\2\2"+
		"\2[\\\3\2\2\2\\]\3\2\2\2]^\5\f\7\2^_\7Q\2\2_`\5\f\7\2`a\7Q\2\2ab\5\24"+
		"\13\2bd\3\2\2\2cC\3\2\2\2cN\3\2\2\2cV\3\2\2\2d\23\3\2\2\2el\5\16\b\2f"+
		"l\5\f\7\2gh\5\f\7\2hi\7Q\2\2ij\5\26\f\2jl\3\2\2\2ke\3\2\2\2kf\3\2\2\2"+
		"kg\3\2\2\2l\25\3\2\2\2mn\5\30\r\2no\5\16\b\2ou\3\2\2\2pq\5\30\r\2qr\5"+
		"\f\7\2ru\3\2\2\2su\7:\2\2tm\3\2\2\2tp\3\2\2\2ts\3\2\2\2u\27\3\2\2\2vw"+
		"\t\t\2\2w\31\3\2\2\2xz\t\n\2\2y{\5\n\6\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2"+
		"|}\5\f\7\2}~\7Q\2\2~\177\5\f\7\2\177\u0080\7Q\2\2\u0080\u0081\5\f\7\2"+
		"\u0081\u008f\3\2\2\2\u0082\u0084\t\13\2\2\u0083\u0085\5\n\6\2\u0084\u0083"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\5\f\7\2\u0087"+
		"\u0088\7Q\2\2\u0088\u0089\5\f\7\2\u0089\u008a\7Q\2\2\u008a\u008b\5\f\7"+
		"\2\u008b\u008c\7Q\2\2\u008c\u008d\5\f\7\2\u008d\u008f\3\2\2\2\u008ex\3"+
		"\2\2\2\u008e\u0082\3\2\2\2\u008f\33\3\2\2\2\u0090\u0092\t\f\2\2\u0091"+
		"\u0093\5\n\6\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2"+
		"\2\2\u0094\u0096\7\60\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0099\7\61\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3"+
		"\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\5\f\7\2\u009b\u009c\7Q\2\2\u009c"+
		"\u009d\5\36\20\2\u009d\u00a8\3\2\2\2\u009e\u00a0\t\f\2\2\u009f\u00a1\5"+
		"\n\6\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\t\r\2\2\u00a3\u00a4\5\f\7\2\u00a4\u00a5\7Q\2\2\u00a5\u00a6\5\36"+
		"\20\2\u00a6\u00a8\3\2\2\2\u00a7\u0090\3\2\2\2\u00a7\u009e\3\2\2\2\u00a8"+
		"\35\3\2\2\2\u00a9\u00aa\7S\2\2\u00aa\u00ad\t\3\2\2\u00ab\u00ac\7Q\2\2"+
		"\u00ac\u00ae\5\24\13\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00bd\7T\2\2\u00b0\u00b1\7S\2\2\u00b1\u00b4\t\3\2\2\u00b2"+
		"\u00b3\7Q\2\2\u00b3\u00b5\5\24\13\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3"+
		"\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00bd\7U\2\2\u00b7\u00b8\7S\2\2\u00b8"+
		"\u00b9\t\3\2\2\u00b9\u00ba\7T\2\2\u00ba\u00bb\7Q\2\2\u00bb\u00bd\5\24"+
		"\13\2\u00bc\u00a9\3\2\2\2\u00bc\u00b0\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bd"+
		"\37\3\2\2\2\u00be\u00bf\7W\2\2\u00bf!\3\2\2\2\31*\60\64?EHPX[cktz\u0084"+
		"\u008e\u0092\u0095\u0098\u00a0\u00a7\u00ad\u00b4\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}