// Generated from H:/MyStuff/PrivateProjects/ArmEmulatorJava/src/grammar\ArmLexer.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQ=1, NE=2, CS=3, CC=4, MI=5, PL=6, VS=7, VC=8, HI=9, LS=10, GE=11, LT=12, 
		GT=13, LE=14, AL=15, UPDATEFLAG=16, AND=17, EOR=18, SUB=19, RSB=20, ADD=21, 
		ADC=22, SBC=23, RSC=24, TST=25, TEQ=26, CMP=27, CMN=28, ORR=29, MOV=30, 
		BIC=31, MVN=32, MUL=33, MLA=34, SMULL=35, UMULL=36, SMLAL=37, UMLAL=38, 
		LDR=39, STR=40, BYTEACCESS=41, PRIVILEGE=42, DOUBLEWORD=43, HALFWORD=44, 
		SIGNEDHALFWORD=45, SIGNEDBYTE=46, Branch=47, BranchAndLink=48, BLX=49, 
		BX=50, BXJ=51, LSL=52, LSR=53, ASR=54, ROR=55, RRX=56, R0=57, R1=58, R2=59, 
		R3=60, R4=61, R5=62, R6=63, R7=64, R8=65, R9=66, R10=67, R11=68, R12=69, 
		R13=70, R14=71, R15=72, HASH=73, HEX=74, NUMBER=75, COMMENTM=76, COMMENT=77, 
		NEWLINE=78, COMMA=79, COLON=80, LBRACKET=81, RBRACKET=82, SPECIALRBRACKET=83, 
		WS=84, LABELTEXT=85;
	public static final int
		BRANCHMODE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "BRANCHMODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EQ", "NE", "CS", "CC", "MI", "PL", "VS", "VC", "HI", "LS", "GE", "LT", 
			"GT", "LE", "AL", "UPDATEFLAG", "AND", "EOR", "SUB", "RSB", "ADD", "ADC", 
			"SBC", "RSC", "TST", "TEQ", "CMP", "CMN", "ORR", "MOV", "BIC", "MVN", 
			"MUL", "MLA", "SMULL", "UMULL", "SMLAL", "UMLAL", "LDR", "STR", "BYTEACCESS", 
			"PRIVILEGE", "DOUBLEWORD", "HALFWORD", "SIGNEDHALFWORD", "SIGNEDBYTE", 
			"Branch", "BranchAndLink", "BLX", "BX", "BXJ", "LSL", "LSR", "ASR", "ROR", 
			"RRX", "R0", "R1", "R2", "R3", "R4", "R5", "R6", "R7", "R8", "R9", "R10", 
			"R11", "R12", "R13", "R14", "R15", "HASH", "HEX", "NUMBER", "COMMENTM", 
			"COMMENT", "NEWLINE", "COMMA", "COLON", "LBRACKET", "RBRACKET", "SPECIALRBRACKET", 
			"WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
			"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "LABELTEXT"
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
			"LT", "GT", "LE", "AL", "UPDATEFLAG", "AND", "EOR", "SUB", "RSB", "ADD", 
			"ADC", "SBC", "RSC", "TST", "TEQ", "CMP", "CMN", "ORR", "MOV", "BIC", 
			"MVN", "MUL", "MLA", "SMULL", "UMULL", "SMLAL", "UMLAL", "LDR", "STR", 
			"BYTEACCESS", "PRIVILEGE", "DOUBLEWORD", "HALFWORD", "SIGNEDHALFWORD", 
			"SIGNEDBYTE", "Branch", "BranchAndLink", "BLX", "BX", "BXJ", "LSL", "LSR", 
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


	public ArmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ArmLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2W\u0275\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3"+
		".\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38"+
		"\38\38\39\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?"+
		"\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3F\3F"+
		"\3F\3F\3G\3G\3G\3G\3G\3G\3G\5G\u01e7\nG\3H\3H\3H\3H\3H\3H\3H\5H\u01f0"+
		"\nH\3I\3I\3I\3I\3I\3I\3I\5I\u01f9\nI\3J\3J\3K\3K\3K\6K\u0200\nK\rK\16"+
		"K\u0201\3L\5L\u0205\nL\3L\6L\u0208\nL\rL\16L\u0209\3M\3M\3M\3M\7M\u0210"+
		"\nM\fM\16M\u0213\13M\3M\3M\3M\3M\3M\3N\3N\3N\3N\7N\u021e\nN\fN\16N\u0221"+
		"\13N\3N\3N\3N\3N\3O\5O\u0228\nO\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3"+
		"T\3U\3U\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3^\3^"+
		"\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i\3i\3j"+
		"\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\6p\u0270\np\rp\16p\u0271\3p\3p\4"+
		"\u0211\u021f\2q\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32"+
		"\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33\66"+
		"\348\35:\36<\37> @!B\"D#F$H%J&L\'N(P)R*T+V,X-Z.\\/^\60`\61b\62d\63f\64"+
		"h\65j\66l\67n8p9r:t;v<x=z>|?~@\u0080A\u0082B\u0084C\u0086D\u0088E\u008a"+
		"F\u008cG\u008eH\u0090I\u0092J\u0094K\u0096L\u0098M\u009aN\u009cO\u009e"+
		"P\u00a0Q\u00a2R\u00a4S\u00a6T\u00a8U\u00aaV\u00ac\2\u00ae\2\u00b0\2\u00b2"+
		"\2\u00b4\2\u00b6\2\u00b8\2\u00ba\2\u00bc\2\u00be\2\u00c0\2\u00c2\2\u00c4"+
		"\2\u00c6\2\u00c8\2\u00ca\2\u00cc\2\u00ce\2\u00d0\2\u00d2\2\u00d4\2\u00d6"+
		"\2\u00d8\2\u00da\2\u00dc\2\u00de\2\u00e0W\4\2\3 \5\2\62;CHch\3\2\62;\4"+
		"\2\13\13\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4"+
		"\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRr"+
		"r\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2"+
		"[[{{\4\2\\\\||\4\2C\\c|\2\u0263\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2"+
		"\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2"+
		"\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2"+
		"\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2"+
		",\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2"+
		"\2\28\3\2\2\2\2:\3\2\2\2\2<\3\2\2\2\2>\3\2\2\2\2@\3\2\2\2\2B\3\2\2\2\2"+
		"D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3"+
		"\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2"+
		"\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2"+
		"\2j\3\2\2\2\2l\3\2\2\2\2n\3\2\2\2\2p\3\2\2\2\2r\3\2\2\2\2t\3\2\2\2\2v"+
		"\3\2\2\2\2x\3\2\2\2\2z\3\2\2\2\2|\3\2\2\2\2~\3\2\2\2\2\u0080\3\2\2\2\2"+
		"\u0082\3\2\2\2\2\u0084\3\2\2\2\2\u0086\3\2\2\2\2\u0088\3\2\2\2\2\u008a"+
		"\3\2\2\2\2\u008c\3\2\2\2\2\u008e\3\2\2\2\2\u0090\3\2\2\2\2\u0092\3\2\2"+
		"\2\2\u0094\3\2\2\2\2\u0096\3\2\2\2\2\u0098\3\2\2\2\2\u009a\3\2\2\2\2\u009c"+
		"\3\2\2\2\2\u009e\3\2\2\2\2\u00a0\3\2\2\2\2\u00a2\3\2\2\2\2\u00a4\3\2\2"+
		"\2\2\u00a6\3\2\2\2\2\u00a8\3\2\2\2\2\u00aa\3\2\2\2\3\u00e0\3\2\2\2\4\u00e2"+
		"\3\2\2\2\6\u00e5\3\2\2\2\b\u00e8\3\2\2\2\n\u00eb\3\2\2\2\f\u00ee\3\2\2"+
		"\2\16\u00f1\3\2\2\2\20\u00f4\3\2\2\2\22\u00f7\3\2\2\2\24\u00fa\3\2\2\2"+
		"\26\u00fd\3\2\2\2\30\u0100\3\2\2\2\32\u0103\3\2\2\2\34\u0106\3\2\2\2\36"+
		"\u0109\3\2\2\2 \u010c\3\2\2\2\"\u010f\3\2\2\2$\u0111\3\2\2\2&\u0115\3"+
		"\2\2\2(\u0119\3\2\2\2*\u011d\3\2\2\2,\u0121\3\2\2\2.\u0125\3\2\2\2\60"+
		"\u0129\3\2\2\2\62\u012d\3\2\2\2\64\u0131\3\2\2\2\66\u0135\3\2\2\28\u0139"+
		"\3\2\2\2:\u013d\3\2\2\2<\u0141\3\2\2\2>\u0145\3\2\2\2@\u0149\3\2\2\2B"+
		"\u014d\3\2\2\2D\u0151\3\2\2\2F\u0155\3\2\2\2H\u0159\3\2\2\2J\u015f\3\2"+
		"\2\2L\u0165\3\2\2\2N\u016b\3\2\2\2P\u0171\3\2\2\2R\u0175\3\2\2\2T\u0179"+
		"\3\2\2\2V\u017b\3\2\2\2X\u017d\3\2\2\2Z\u017f\3\2\2\2\\\u0181\3\2\2\2"+
		"^\u0184\3\2\2\2`\u0187\3\2\2\2b\u018b\3\2\2\2d\u0190\3\2\2\2f\u0196\3"+
		"\2\2\2h\u019b\3\2\2\2j\u01a1\3\2\2\2l\u01a5\3\2\2\2n\u01a9\3\2\2\2p\u01ad"+
		"\3\2\2\2r\u01b1\3\2\2\2t\u01b5\3\2\2\2v\u01b8\3\2\2\2x\u01bb\3\2\2\2z"+
		"\u01be\3\2\2\2|\u01c1\3\2\2\2~\u01c4\3\2\2\2\u0080\u01c7\3\2\2\2\u0082"+
		"\u01ca\3\2\2\2\u0084\u01cd\3\2\2\2\u0086\u01d0\3\2\2\2\u0088\u01d3\3\2"+
		"\2\2\u008a\u01d7\3\2\2\2\u008c\u01db\3\2\2\2\u008e\u01e6\3\2\2\2\u0090"+
		"\u01ef\3\2\2\2\u0092\u01f8\3\2\2\2\u0094\u01fa\3\2\2\2\u0096\u01fc\3\2"+
		"\2\2\u0098\u0204\3\2\2\2\u009a\u020b\3\2\2\2\u009c\u0219\3\2\2\2\u009e"+
		"\u0227\3\2\2\2\u00a0\u022b\3\2\2\2\u00a2\u022d\3\2\2\2\u00a4\u022f\3\2"+
		"\2\2\u00a6\u0231\3\2\2\2\u00a8\u0233\3\2\2\2\u00aa\u0236\3\2\2\2\u00ac"+
		"\u023a\3\2\2\2\u00ae\u023c\3\2\2\2\u00b0\u023e\3\2\2\2\u00b2\u0240\3\2"+
		"\2\2\u00b4\u0242\3\2\2\2\u00b6\u0244\3\2\2\2\u00b8\u0246\3\2\2\2\u00ba"+
		"\u0248\3\2\2\2\u00bc\u024a\3\2\2\2\u00be\u024c\3\2\2\2\u00c0\u024e\3\2"+
		"\2\2\u00c2\u0250\3\2\2\2\u00c4\u0252\3\2\2\2\u00c6\u0254\3\2\2\2\u00c8"+
		"\u0256\3\2\2\2\u00ca\u0258\3\2\2\2\u00cc\u025a\3\2\2\2\u00ce\u025c\3\2"+
		"\2\2\u00d0\u025e\3\2\2\2\u00d2\u0260\3\2\2\2\u00d4\u0262\3\2\2\2\u00d6"+
		"\u0264\3\2\2\2\u00d8\u0266\3\2\2\2\u00da\u0268\3\2\2\2\u00dc\u026a\3\2"+
		"\2\2\u00de\u026c\3\2\2\2\u00e0\u026f\3\2\2\2\u00e2\u00e3\5\u00b4Z\2\u00e3"+
		"\u00e4\5\u00ccf\2\u00e4\5\3\2\2\2\u00e5\u00e6\5\u00c6c\2\u00e6\u00e7\5"+
		"\u00b4Z\2\u00e7\7\3\2\2\2\u00e8\u00e9\5\u00b0X\2\u00e9\u00ea\5\u00d0h"+
		"\2\u00ea\t\3\2\2\2\u00eb\u00ec\5\u00b0X\2\u00ec\u00ed\5\u00b0X\2\u00ed"+
		"\13\3\2\2\2\u00ee\u00ef\5\u00c4b\2\u00ef\u00f0\5\u00bc^\2\u00f0\r\3\2"+
		"\2\2\u00f1\u00f2\5\u00cae\2\u00f2\u00f3\5\u00c2a\2\u00f3\17\3\2\2\2\u00f4"+
		"\u00f5\5\u00d6k\2\u00f5\u00f6\5\u00d0h\2\u00f6\21\3\2\2\2\u00f7\u00f8"+
		"\5\u00d6k\2\u00f8\u00f9\5\u00b0X\2\u00f9\23\3\2\2\2\u00fa\u00fb\5\u00ba"+
		"]\2\u00fb\u00fc\5\u00bc^\2\u00fc\25\3\2\2\2\u00fd\u00fe\5\u00c2a\2\u00fe"+
		"\u00ff\5\u00d0h\2\u00ff\27\3\2\2\2\u0100\u0101\5\u00b8\\\2\u0101\u0102"+
		"\5\u00b4Z\2\u0102\31\3\2\2\2\u0103\u0104\5\u00c2a\2\u0104\u0105\5\u00d2"+
		"i\2\u0105\33\3\2\2\2\u0106\u0107\5\u00b8\\\2\u0107\u0108\5\u00d2i\2\u0108"+
		"\35\3\2\2\2\u0109\u010a\5\u00c2a\2\u010a\u010b\5\u00b4Z\2\u010b\37\3\2"+
		"\2\2\u010c\u010d\5\u00acV\2\u010d\u010e\5\u00c2a\2\u010e!\3\2\2\2\u010f"+
		"\u0110\5\u00d0h\2\u0110#\3\2\2\2\u0111\u0112\5\u00acV\2\u0112\u0113\5"+
		"\u00c6c\2\u0113\u0114\5\u00b2Y\2\u0114%\3\2\2\2\u0115\u0116\5\u00b4Z\2"+
		"\u0116\u0117\5\u00c8d\2\u0117\u0118\5\u00ceg\2\u0118\'\3\2\2\2\u0119\u011a"+
		"\5\u00d0h\2\u011a\u011b\5\u00d4j\2\u011b\u011c\5\u00aeW\2\u011c)\3\2\2"+
		"\2\u011d\u011e\5\u00ceg\2\u011e\u011f\5\u00d0h\2\u011f\u0120\5\u00aeW"+
		"\2\u0120+\3\2\2\2\u0121\u0122\5\u00acV\2\u0122\u0123\5\u00b2Y\2\u0123"+
		"\u0124\5\u00b2Y\2\u0124-\3\2\2\2\u0125\u0126\5\u00acV\2\u0126\u0127\5"+
		"\u00b2Y\2\u0127\u0128\5\u00b0X\2\u0128/\3\2\2\2\u0129\u012a\5\u00d0h\2"+
		"\u012a\u012b\5\u00aeW\2\u012b\u012c\5\u00b0X\2\u012c\61\3\2\2\2\u012d"+
		"\u012e\5\u00ceg\2\u012e\u012f\5\u00d0h\2\u012f\u0130\5\u00b0X\2\u0130"+
		"\63\3\2\2\2\u0131\u0132\5\u00d2i\2\u0132\u0133\5\u00d0h\2\u0133\u0134"+
		"\5\u00d2i\2\u0134\65\3\2\2\2\u0135\u0136\5\u00d2i\2\u0136\u0137\5\u00b4"+
		"Z\2\u0137\u0138\5\u00ccf\2\u0138\67\3\2\2\2\u0139\u013a\5\u00b0X\2\u013a"+
		"\u013b\5\u00c4b\2\u013b\u013c\5\u00cae\2\u013c9\3\2\2\2\u013d\u013e\5"+
		"\u00b0X\2\u013e\u013f\5\u00c4b\2\u013f\u0140\5\u00cae\2\u0140;\3\2\2\2"+
		"\u0141\u0142\5\u00c8d\2\u0142\u0143\5\u00ceg\2\u0143\u0144\5\u00ceg\2"+
		"\u0144=\3\2\2\2\u0145\u0146\5\u00c4b\2\u0146\u0147\5\u00c8d\2\u0147\u0148"+
		"\5\u00d6k\2\u0148?\3\2\2\2\u0149\u014a\5\u00aeW\2\u014a\u014b\5\u00bc"+
		"^\2\u014b\u014c\5\u00b0X\2\u014cA\3\2\2\2\u014d\u014e\5\u00c4b\2\u014e"+
		"\u014f\5\u00d6k\2\u014f\u0150\5\u00c6c\2\u0150C\3\2\2\2\u0151\u0152\5"+
		"\u00c4b\2\u0152\u0153\5\u00d4j\2\u0153\u0154\5\u00c2a\2\u0154E\3\2\2\2"+
		"\u0155\u0156\5\u00c4b\2\u0156\u0157\5\u00c2a\2\u0157\u0158\5\u00acV\2"+
		"\u0158G\3\2\2\2\u0159\u015a\5\u00d0h\2\u015a\u015b\5\u00c4b\2\u015b\u015c"+
		"\5\u00d4j\2\u015c\u015d\5\u00c2a\2\u015d\u015e\5\u00c2a\2\u015eI\3\2\2"+
		"\2\u015f\u0160\5\u00d4j\2\u0160\u0161\5\u00c4b\2\u0161\u0162\5\u00d4j"+
		"\2\u0162\u0163\5\u00c2a\2\u0163\u0164\5\u00c2a\2\u0164K\3\2\2\2\u0165"+
		"\u0166\5\u00d0h\2\u0166\u0167\5\u00c4b\2\u0167\u0168\5\u00c2a\2\u0168"+
		"\u0169\5\u00acV\2\u0169\u016a\5\u00c2a\2\u016aM\3\2\2\2\u016b\u016c\5"+
		"\u00d4j\2\u016c\u016d\5\u00c4b\2\u016d\u016e\5\u00c2a\2\u016e\u016f\5"+
		"\u00acV\2\u016f\u0170\5\u00c2a\2\u0170O\3\2\2\2\u0171\u0172\5\u00c2a\2"+
		"\u0172\u0173\5\u00b2Y\2\u0173\u0174\5\u00ceg\2\u0174Q\3\2\2\2\u0175\u0176"+
		"\5\u00d0h\2\u0176\u0177\5\u00d2i\2\u0177\u0178\5\u00ceg\2\u0178S\3\2\2"+
		"\2\u0179\u017a\5\u00aeW\2\u017aU\3\2\2\2\u017b\u017c\5\u00d2i\2\u017c"+
		"W\3\2\2\2\u017d\u017e\5\u00b2Y\2\u017eY\3\2\2\2\u017f\u0180\5\u00ba]\2"+
		"\u0180[\3\2\2\2\u0181\u0182\5\u00d0h\2\u0182\u0183\5\u00ba]\2\u0183]\3"+
		"\2\2\2\u0184\u0185\5\u00d0h\2\u0185\u0186\5\u00aeW\2\u0186_\3\2\2\2\u0187"+
		"\u0188\5\u00aeW\2\u0188\u0189\3\2\2\2\u0189\u018a\b\60\2\2\u018aa\3\2"+
		"\2\2\u018b\u018c\5\u00aeW\2\u018c\u018d\5\u00c2a\2\u018d\u018e\3\2\2\2"+
		"\u018e\u018f\b\61\2\2\u018fc\3\2\2\2\u0190\u0191\5\u00aeW\2\u0191\u0192"+
		"\5\u00c2a\2\u0192\u0193\5\u00dam\2\u0193\u0194\3\2\2\2\u0194\u0195\b\62"+
		"\2\2\u0195e\3\2\2\2\u0196\u0197\5\u00aeW\2\u0197\u0198\5\u00dam\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019a\b\63\2\2\u019ag\3\2\2\2\u019b\u019c\5\u00ae"+
		"W\2\u019c\u019d\5\u00dam\2\u019d\u019e\5\u00be_\2\u019e\u019f\3\2\2\2"+
		"\u019f\u01a0\b\64\2\2\u01a0i\3\2\2\2\u01a1\u01a2\5\u00c2a\2\u01a2\u01a3"+
		"\5\u00d0h\2\u01a3\u01a4\5\u00c2a\2\u01a4k\3\2\2\2\u01a5\u01a6\5\u00c2"+
		"a\2\u01a6\u01a7\5\u00d0h\2\u01a7\u01a8\5\u00ceg\2\u01a8m\3\2\2\2\u01a9"+
		"\u01aa\5\u00acV\2\u01aa\u01ab\5\u00d0h\2\u01ab\u01ac\5\u00ceg\2\u01ac"+
		"o\3\2\2\2\u01ad\u01ae\5\u00ceg\2\u01ae\u01af\5\u00c8d\2\u01af\u01b0\5"+
		"\u00ceg\2\u01b0q\3\2\2\2\u01b1\u01b2\5\u00ceg\2\u01b2\u01b3\5\u00ceg\2"+
		"\u01b3\u01b4\5\u00dam\2\u01b4s\3\2\2\2\u01b5\u01b6\5\u00ceg\2\u01b6\u01b7"+
		"\7\62\2\2\u01b7u\3\2\2\2\u01b8\u01b9\5\u00ceg\2\u01b9\u01ba\7\63\2\2\u01ba"+
		"w\3\2\2\2\u01bb\u01bc\5\u00ceg\2\u01bc\u01bd\7\64\2\2\u01bdy\3\2\2\2\u01be"+
		"\u01bf\5\u00ceg\2\u01bf\u01c0\7\65\2\2\u01c0{\3\2\2\2\u01c1\u01c2\5\u00ce"+
		"g\2\u01c2\u01c3\7\66\2\2\u01c3}\3\2\2\2\u01c4\u01c5\5\u00ceg\2\u01c5\u01c6"+
		"\7\67\2\2\u01c6\177\3\2\2\2\u01c7\u01c8\5\u00ceg\2\u01c8\u01c9\78\2\2"+
		"\u01c9\u0081\3\2\2\2\u01ca\u01cb\5\u00ceg\2\u01cb\u01cc\79\2\2\u01cc\u0083"+
		"\3\2\2\2\u01cd\u01ce\5\u00ceg\2\u01ce\u01cf\7:\2\2\u01cf\u0085\3\2\2\2"+
		"\u01d0\u01d1\5\u00ceg\2\u01d1\u01d2\7;\2\2\u01d2\u0087\3\2\2\2\u01d3\u01d4"+
		"\5\u00ceg\2\u01d4\u01d5\7\63\2\2\u01d5\u01d6\7\62\2\2\u01d6\u0089\3\2"+
		"\2\2\u01d7\u01d8\5\u00ceg\2\u01d8\u01d9\7\63\2\2\u01d9\u01da\7\63\2\2"+
		"\u01da\u008b\3\2\2\2\u01db\u01dc\5\u00ceg\2\u01dc\u01dd\7\63\2\2\u01dd"+
		"\u01de\7\64\2\2\u01de\u008d\3\2\2\2\u01df\u01e0\5\u00ceg\2\u01e0\u01e1"+
		"\7\63\2\2\u01e1\u01e2\7\65\2\2\u01e2\u01e7\3\2\2\2\u01e3\u01e4\5\u00d0"+
		"h\2\u01e4\u01e5\5\u00cae\2\u01e5\u01e7\3\2\2\2\u01e6\u01df\3\2\2\2\u01e6"+
		"\u01e3\3\2\2\2\u01e7\u008f\3\2\2\2\u01e8\u01e9\5\u00ceg\2\u01e9\u01ea"+
		"\7\63\2\2\u01ea\u01eb\7\66\2\2\u01eb\u01f0\3\2\2\2\u01ec\u01ed\5\u00c2"+
		"a\2\u01ed\u01ee\5\u00ceg\2\u01ee\u01f0\3\2\2\2\u01ef\u01e8\3\2\2\2\u01ef"+
		"\u01ec\3\2\2\2\u01f0\u0091\3\2\2\2\u01f1\u01f2\5\u00ceg\2\u01f2\u01f3"+
		"\7\63\2\2\u01f3\u01f4\7\67\2\2\u01f4\u01f9\3\2\2\2\u01f5\u01f6\5\u00ca"+
		"e\2\u01f6\u01f7\5\u00b0X\2\u01f7\u01f9\3\2\2\2\u01f8\u01f1\3\2\2\2\u01f8"+
		"\u01f5\3\2\2\2\u01f9\u0093\3\2\2\2\u01fa\u01fb\7%\2\2\u01fb\u0095\3\2"+
		"\2\2\u01fc\u01fd\7\62\2\2\u01fd\u01ff\5\u00dam\2\u01fe\u0200\t\2\2\2\u01ff"+
		"\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2"+
		"\2\2\u0202\u0097\3\2\2\2\u0203\u0205\7/\2\2\u0204\u0203\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0208\t\3\2\2\u0207\u0206\3\2"+
		"\2\2\u0208\u0209\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u0099\3\2\2\2\u020b\u020c\7\61\2\2\u020c\u020d\7,\2\2\u020d\u0211\3\2"+
		"\2\2\u020e\u0210\13\2\2\2\u020f\u020e\3\2\2\2\u0210\u0213\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0211\3\2"+
		"\2\2\u0214\u0215\7,\2\2\u0215\u0216\7\61\2\2\u0216\u0217\3\2\2\2\u0217"+
		"\u0218\bM\3\2\u0218\u009b\3\2\2\2\u0219\u021a\7\61\2\2\u021a\u021b\7\61"+
		"\2\2\u021b\u021f\3\2\2\2\u021c\u021e\13\2\2\2\u021d\u021c\3\2\2\2\u021e"+
		"\u0221\3\2\2\2\u021f\u0220\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0222\3\2"+
		"\2\2\u0221\u021f\3\2\2\2\u0222\u0223\7\f\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0225\bN\3\2\u0225\u009d\3\2\2\2\u0226\u0228\7\17\2\2\u0227\u0226\3\2"+
		"\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\7\f\2\2\u022a"+
		"\u009f\3\2\2\2\u022b\u022c\7.\2\2\u022c\u00a1\3\2\2\2\u022d\u022e\7<\2"+
		"\2\u022e\u00a3\3\2\2\2\u022f\u0230\7]\2\2\u0230\u00a5\3\2\2\2\u0231\u0232"+
		"\7_\2\2\u0232\u00a7\3\2\2\2\u0233\u0234\7_\2\2\u0234\u0235\7#\2\2\u0235"+
		"\u00a9\3\2\2\2\u0236\u0237\t\4\2\2\u0237\u0238\3\2\2\2\u0238\u0239\bU"+
		"\4\2\u0239\u00ab\3\2\2\2\u023a\u023b\t\5\2\2\u023b\u00ad\3\2\2\2\u023c"+
		"\u023d\t\6\2\2\u023d\u00af\3\2\2\2\u023e\u023f\t\7\2\2\u023f\u00b1\3\2"+
		"\2\2\u0240\u0241\t\b\2\2\u0241\u00b3\3\2\2\2\u0242\u0243\t\t\2\2\u0243"+
		"\u00b5\3\2\2\2\u0244\u0245\t\n\2\2\u0245\u00b7\3\2\2\2\u0246\u0247\t\13"+
		"\2\2\u0247\u00b9\3\2\2\2\u0248\u0249\t\f\2\2\u0249\u00bb\3\2\2\2\u024a"+
		"\u024b\t\r\2\2\u024b\u00bd\3\2\2\2\u024c\u024d\t\16\2\2\u024d\u00bf\3"+
		"\2\2\2\u024e\u024f\t\17\2\2\u024f\u00c1\3\2\2\2\u0250\u0251\t\20\2\2\u0251"+
		"\u00c3\3\2\2\2\u0252\u0253\t\21\2\2\u0253\u00c5\3\2\2\2\u0254\u0255\t"+
		"\22\2\2\u0255\u00c7\3\2\2\2\u0256\u0257\t\23\2\2\u0257\u00c9\3\2\2\2\u0258"+
		"\u0259\t\24\2\2\u0259\u00cb\3\2\2\2\u025a\u025b\t\25\2\2\u025b\u00cd\3"+
		"\2\2\2\u025c\u025d\t\26\2\2\u025d\u00cf\3\2\2\2\u025e\u025f\t\27\2\2\u025f"+
		"\u00d1\3\2\2\2\u0260\u0261\t\30\2\2\u0261\u00d3\3\2\2\2\u0262\u0263\t"+
		"\31\2\2\u0263\u00d5\3\2\2\2\u0264\u0265\t\32\2\2\u0265\u00d7\3\2\2\2\u0266"+
		"\u0267\t\33\2\2\u0267\u00d9\3\2\2\2\u0268\u0269\t\34\2\2\u0269\u00db\3"+
		"\2\2\2\u026a\u026b\t\35\2\2\u026b\u00dd\3\2\2\2\u026c\u026d\t\36\2\2\u026d"+
		"\u00df\3\2\2\2\u026e\u0270\t\37\2\2\u026f\u026e\3\2\2\2\u0270\u0271\3"+
		"\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0274\bp\5\2\u0274\u00e1\3\2\2\2\16\2\3\u01e6\u01ef\u01f8\u0201\u0204"+
		"\u0209\u0211\u021f\u0227\u0271\6\7\3\2\2\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}