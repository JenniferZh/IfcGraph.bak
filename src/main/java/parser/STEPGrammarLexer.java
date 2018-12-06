// Generated from F:/JavaWorkSpace/IfcGraph/src/main/resources\STEPGrammar.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class STEPGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, WS=8, BLOCK_COMMENT=9, 
		LINE_COMMENT=10, NONDEF=11, OVERRIDE=12, BOOLEAN=13, INT=14, NEGINT=15, 
		INTEXP=16, FLOAT=17, ENUM=18, STRING=19, ISOSTEPSTART=20, ISOSTEPEND=21, 
		HEADER=22, DATA=23, ENDSEC=24, NAME=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "WS", "BLOCK_COMMENT", 
		"LINE_COMMENT", "NONDEF", "OVERRIDE", "BOOLEAN", "INT", "NEGINT", "INTEXP", 
		"FLOAT", "EXP", "ENUM", "STRING", "ISOSTEPSTART", "ISOSTEPEND", "HEADER", 
		"DATA", "ENDSEC", "NAME"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'#'", "'='", "'('", "')'", "'()'", "','", null, null, null, 
		"'$'", "'*'", null, null, null, null, null, null, null, null, null, "'HEADER;'", 
		"'DATA;'", "'ENDSEC;'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "WS", "BLOCK_COMMENT", 
		"LINE_COMMENT", "NONDEF", "OVERRIDE", "BOOLEAN", "INT", "NEGINT", "INTEXP", 
		"FLOAT", "ENUM", "STRING", "ISOSTEPSTART", "ISOSTEPEND", "HEADER", "DATA", 
		"ENDSEC", "NAME"
	};
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


	public STEPGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "parser/STEPGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00fd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\t\6\tH\n\t\r\t\16\tI\3\t\3\t\3\n\3\n\3\n\3\n\7\nR\n"+
		"\n\f\n\16\nU\13\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13`\n\13\f"+
		"\13\16\13c\13\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16q\n\16\3\17\3\17\3\17\7\17v\n\17\f\17\16\17y\13\17\5\17{\n\17"+
		"\3\20\3\20\3\20\3\21\3\21\5\21\u0082\n\21\3\21\3\21\3\22\3\22\6\22\u0088"+
		"\n\22\r\22\16\22\u0089\3\22\5\22\u008d\n\22\3\22\3\22\5\22\u0091\n\22"+
		"\3\22\3\22\7\22\u0095\n\22\f\22\16\22\u0098\13\22\3\22\5\22\u009b\n\22"+
		"\5\22\u009d\n\22\3\23\3\23\5\23\u00a1\n\23\3\23\7\23\u00a4\n\23\f\23\16"+
		"\23\u00a7\13\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u00b1\n\25"+
		"\f\25\16\25\u00b4\13\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\7\26\u00c2\n\26\f\26\16\26\u00c5\13\26\3\26\5\26\u00c8\n"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\7\27\u00db\n\27\f\27\16\27\u00de\13\27\3\27\5\27\u00e1"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\6\33\u00fa\n\33\r\33"+
		"\16\33\u00fb\3S\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\2\'\24)\25+\26-\27/\30\61\31\63\32"+
		"\65\33\3\2\13\5\2\13\f\17\17\"\"\4\2\f\f\17\17\3\2\63;\3\2\62;\4\2GGg"+
		"g\4\2--//\3\2))\4\2//\62;\6\2\62;C\\aac|\2\u0111\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA"+
		"\3\2\2\2\17D\3\2\2\2\21G\3\2\2\2\23M\3\2\2\2\25[\3\2\2\2\27f\3\2\2\2\31"+
		"h\3\2\2\2\33p\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!\u0081\3\2\2\2#\u009c\3"+
		"\2\2\2%\u009e\3\2\2\2\'\u00a8\3\2\2\2)\u00ac\3\2\2\2+\u00c7\3\2\2\2-\u00e0"+
		"\3\2\2\2/\u00e2\3\2\2\2\61\u00ea\3\2\2\2\63\u00f0\3\2\2\2\65\u00f9\3\2"+
		"\2\2\678\7=\2\28\4\3\2\2\29:\7%\2\2:\6\3\2\2\2;<\7?\2\2<\b\3\2\2\2=>\7"+
		"*\2\2>\n\3\2\2\2?@\7+\2\2@\f\3\2\2\2AB\7*\2\2BC\7+\2\2C\16\3\2\2\2DE\7"+
		".\2\2E\20\3\2\2\2FH\t\2\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK"+
		"\3\2\2\2KL\b\t\2\2L\22\3\2\2\2MN\7\61\2\2NO\7,\2\2OS\3\2\2\2PR\13\2\2"+
		"\2QP\3\2\2\2RU\3\2\2\2ST\3\2\2\2SQ\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7,\2"+
		"\2WX\7\61\2\2XY\3\2\2\2YZ\b\n\2\2Z\24\3\2\2\2[\\\7\61\2\2\\]\7\61\2\2"+
		"]a\3\2\2\2^`\n\3\2\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3\2\2\2"+
		"ca\3\2\2\2de\b\13\2\2e\26\3\2\2\2fg\7&\2\2g\30\3\2\2\2hi\7,\2\2i\32\3"+
		"\2\2\2jk\7\60\2\2kl\7V\2\2lq\7\60\2\2mn\7\60\2\2no\7H\2\2oq\7\60\2\2p"+
		"j\3\2\2\2pm\3\2\2\2q\34\3\2\2\2r{\7\62\2\2sw\t\4\2\2tv\t\5\2\2ut\3\2\2"+
		"\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2yw\3\2\2\2zr\3\2\2\2zs\3\2\2"+
		"\2{\36\3\2\2\2|}\7/\2\2}~\5\35\17\2~ \3\2\2\2\177\u0082\5\35\17\2\u0080"+
		"\u0082\5\37\20\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2"+
		"\2\2\u0083\u0084\5%\23\2\u0084\"\3\2\2\2\u0085\u0087\7\60\2\2\u0086\u0088"+
		"\t\5\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u008d\5%\23\2\u008c\u008b\3\2"+
		"\2\2\u008c\u008d\3\2\2\2\u008d\u009d\3\2\2\2\u008e\u0091\5\35\17\2\u008f"+
		"\u0091\5\37\20\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0096\7\60\2\2\u0093\u0095\t\5\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009a\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u009b\5%\23\2\u009a\u0099\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u0085\3\2\2\2\u009c\u0090\3\2"+
		"\2\2\u009d$\3\2\2\2\u009e\u00a0\t\6\2\2\u009f\u00a1\t\7\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a5\3\2\2\2\u00a2\u00a4\t\5\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6&\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\60\2\2\u00a9\u00aa"+
		"\5\65\33\2\u00aa\u00ab\7\60\2\2\u00ab(\3\2\2\2\u00ac\u00b2\7)\2\2\u00ad"+
		"\u00b1\n\b\2\2\u00ae\u00af\7)\2\2\u00af\u00b1\7)\2\2\u00b0\u00ad\3\2\2"+
		"\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7)\2\2\u00b6"+
		"*\3\2\2\2\u00b7\u00b8\7U\2\2\u00b8\u00b9\7V\2\2\u00b9\u00ba\7G\2\2\u00ba"+
		"\u00bb\7R\2\2\u00bb\u00c8\7=\2\2\u00bc\u00bd\7K\2\2\u00bd\u00be\7U\2\2"+
		"\u00be\u00bf\7Q\2\2\u00bf\u00c3\3\2\2\2\u00c0\u00c2\t\t\2\2\u00c1\u00c0"+
		"\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c8\7=\2\2\u00c7\u00b7\3\2"+
		"\2\2\u00c7\u00bc\3\2\2\2\u00c8,\3\2\2\2\u00c9\u00ca\7G\2\2\u00ca\u00cb"+
		"\7P\2\2\u00cb\u00cc\7F\2\2\u00cc\u00cd\7U\2\2\u00cd\u00ce\7V\2\2\u00ce"+
		"\u00cf\7G\2\2\u00cf\u00d0\7R\2\2\u00d0\u00e1\7=\2\2\u00d1\u00d2\7G\2\2"+
		"\u00d2\u00d3\7P\2\2\u00d3\u00d4\7F\2\2\u00d4\u00d5\7/\2\2\u00d5\u00d6"+
		"\7K\2\2\u00d6\u00d7\7U\2\2\u00d7\u00d8\7Q\2\2\u00d8\u00dc\3\2\2\2\u00d9"+
		"\u00db\t\t\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e1\7=\2\2\u00e0\u00c9\3\2\2\2\u00e0\u00d1\3\2\2\2\u00e1.\3\2\2\2\u00e2"+
		"\u00e3\7J\2\2\u00e3\u00e4\7G\2\2\u00e4\u00e5\7C\2\2\u00e5\u00e6\7F\2\2"+
		"\u00e6\u00e7\7G\2\2\u00e7\u00e8\7T\2\2\u00e8\u00e9\7=\2\2\u00e9\60\3\2"+
		"\2\2\u00ea\u00eb\7F\2\2\u00eb\u00ec\7C\2\2\u00ec\u00ed\7V\2\2\u00ed\u00ee"+
		"\7C\2\2\u00ee\u00ef\7=\2\2\u00ef\62\3\2\2\2\u00f0\u00f1\7G\2\2\u00f1\u00f2"+
		"\7P\2\2\u00f2\u00f3\7F\2\2\u00f3\u00f4\7U\2\2\u00f4\u00f5\7G\2\2\u00f5"+
		"\u00f6\7E\2\2\u00f6\u00f7\7=\2\2\u00f7\64\3\2\2\2\u00f8\u00fa\t\n\2\2"+
		"\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\66\3\2\2\2\31\2ISapwz\u0081\u0089\u008c\u0090\u0096\u009a"+
		"\u009c\u00a0\u00a5\u00b0\u00b2\u00c3\u00c7\u00dc\u00e0\u00fb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}