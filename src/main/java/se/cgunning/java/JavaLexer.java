// Generated from Java.g4 by ANTLR 4.2

  package se.cgunning.java;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, PUBLIC=7, STATIC=8, ASSIGN=9, 
		END=10, AND=11, LESSTHAN=12, ADD=13, SUB=14, PROD=15, DOT=16, CLASS=17, 
		NEW=18, IF=19, ELSE=20, WHILE=21, FOR=22, SOUT=23, LCURL=24, RCURL=25, 
		LBRACK=26, RBRACK=27, LPAR=28, RPAR=29, INT=30, BOOLEAN=31, VOID=32, TRUE=33, 
		FALSE=34, THIS=35, NOT=36, PACKAGE=37, ID=38, CLASSID=39, INT_LIT=40, 
		WS=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'package'", "'length'", "','", "'main'", "'return'", "'String'", "'public'", 
		"'static'", "'='", "';'", "'&&'", "'<'", "'+'", "'-'", "'*'", "'.'", "'class'", 
		"'new'", "'if'", "'else'", "'while'", "'for'", "'System.out.println'", 
		"'{'", "'}'", "'['", "']'", "'('", "')'", "'int'", "'boolean'", "'void'", 
		"'true'", "'false'", "'this'", "'!'", "PACKAGE", "ID", "CLASSID", "INT_LIT", 
		"WS"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "PUBLIC", "STATIC", "ASSIGN", 
		"END", "AND", "LESSTHAN", "ADD", "SUB", "PROD", "DOT", "CLASS", "NEW", 
		"IF", "ELSE", "WHILE", "FOR", "SOUT", "LCURL", "RCURL", "LBRACK", "RBRACK", 
		"LPAR", "RPAR", "INT", "BOOLEAN", "VOID", "TRUE", "FALSE", "THIS", "NOT", 
		"PACKAGE", "ID", "CLASSID", "INT_LIT", "WS"
	};


	public JavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 40: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2+\u0124\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3&\6&\u00f8\n&\r"+
		"&\16&\u00f9\3&\6&\u00fd\n&\r&\16&\u00fe\3&\6&\u0102\n&\r&\16&\u0103\3"+
		"\'\3\'\7\'\u0108\n\'\f\'\16\'\u010b\13\'\3(\3(\7(\u010f\n(\f(\16(\u0112"+
		"\13(\3)\3)\3)\7)\u0117\n)\f)\16)\u011a\13)\5)\u011c\n)\3*\6*\u011f\n*"+
		"\r*\16*\u0120\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\4\5\2\62;C\\c|\5"+
		"\2\13\f\16\17\"\"\u012b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5]\3\2\2\2\7d\3\2\2\2\tf\3\2\2\2\13k\3"+
		"\2\2\2\rr\3\2\2\2\17y\3\2\2\2\21\u0080\3\2\2\2\23\u0087\3\2\2\2\25\u0089"+
		"\3\2\2\2\27\u008b\3\2\2\2\31\u008e\3\2\2\2\33\u0090\3\2\2\2\35\u0092\3"+
		"\2\2\2\37\u0094\3\2\2\2!\u0096\3\2\2\2#\u0098\3\2\2\2%\u009e\3\2\2\2\'"+
		"\u00a2\3\2\2\2)\u00a5\3\2\2\2+\u00aa\3\2\2\2-\u00b0\3\2\2\2/\u00b4\3\2"+
		"\2\2\61\u00c7\3\2\2\2\63\u00c9\3\2\2\2\65\u00cb\3\2\2\2\67\u00cd\3\2\2"+
		"\29\u00cf\3\2\2\2;\u00d1\3\2\2\2=\u00d3\3\2\2\2?\u00d7\3\2\2\2A\u00df"+
		"\3\2\2\2C\u00e4\3\2\2\2E\u00e9\3\2\2\2G\u00ef\3\2\2\2I\u00f4\3\2\2\2K"+
		"\u00fc\3\2\2\2M\u0105\3\2\2\2O\u010c\3\2\2\2Q\u011b\3\2\2\2S\u011e\3\2"+
		"\2\2UV\7r\2\2VW\7c\2\2WX\7e\2\2XY\7m\2\2YZ\7c\2\2Z[\7i\2\2[\\\7g\2\2\\"+
		"\4\3\2\2\2]^\7n\2\2^_\7g\2\2_`\7p\2\2`a\7i\2\2ab\7v\2\2bc\7j\2\2c\6\3"+
		"\2\2\2de\7.\2\2e\b\3\2\2\2fg\7o\2\2gh\7c\2\2hi\7k\2\2ij\7p\2\2j\n\3\2"+
		"\2\2kl\7t\2\2lm\7g\2\2mn\7v\2\2no\7w\2\2op\7t\2\2pq\7p\2\2q\f\3\2\2\2"+
		"rs\7U\2\2st\7v\2\2tu\7t\2\2uv\7k\2\2vw\7p\2\2wx\7i\2\2x\16\3\2\2\2yz\7"+
		"r\2\2z{\7w\2\2{|\7d\2\2|}\7n\2\2}~\7k\2\2~\177\7e\2\2\177\20\3\2\2\2\u0080"+
		"\u0081\7u\2\2\u0081\u0082\7v\2\2\u0082\u0083\7c\2\2\u0083\u0084\7v\2\2"+
		"\u0084\u0085\7k\2\2\u0085\u0086\7e\2\2\u0086\22\3\2\2\2\u0087\u0088\7"+
		"?\2\2\u0088\24\3\2\2\2\u0089\u008a\7=\2\2\u008a\26\3\2\2\2\u008b\u008c"+
		"\7(\2\2\u008c\u008d\7(\2\2\u008d\30\3\2\2\2\u008e\u008f\7>\2\2\u008f\32"+
		"\3\2\2\2\u0090\u0091\7-\2\2\u0091\34\3\2\2\2\u0092\u0093\7/\2\2\u0093"+
		"\36\3\2\2\2\u0094\u0095\7,\2\2\u0095 \3\2\2\2\u0096\u0097\7\60\2\2\u0097"+
		"\"\3\2\2\2\u0098\u0099\7e\2\2\u0099\u009a\7n\2\2\u009a\u009b\7c\2\2\u009b"+
		"\u009c\7u\2\2\u009c\u009d\7u\2\2\u009d$\3\2\2\2\u009e\u009f\7p\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7y\2\2\u00a1&\3\2\2\2\u00a2\u00a3\7k\2\2\u00a3"+
		"\u00a4\7h\2\2\u00a4(\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7n\2\2\u00a7"+
		"\u00a8\7u\2\2\u00a8\u00a9\7g\2\2\u00a9*\3\2\2\2\u00aa\u00ab\7y\2\2\u00ab"+
		"\u00ac\7j\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af\7g\2\2"+
		"\u00af,\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7t\2"+
		"\2\u00b3.\3\2\2\2\u00b4\u00b5\7U\2\2\u00b5\u00b6\7{\2\2\u00b6\u00b7\7"+
		"u\2\2\u00b7\u00b8\7v\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7o\2\2\u00ba\u00bb"+
		"\7\60\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7w\2\2\u00bd\u00be\7v\2\2\u00be"+
		"\u00bf\7\60\2\2\u00bf\u00c0\7r\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7k\2"+
		"\2\u00c2\u00c3\7p\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6"+
		"\7p\2\2\u00c6\60\3\2\2\2\u00c7\u00c8\7}\2\2\u00c8\62\3\2\2\2\u00c9\u00ca"+
		"\7\177\2\2\u00ca\64\3\2\2\2\u00cb\u00cc\7]\2\2\u00cc\66\3\2\2\2\u00cd"+
		"\u00ce\7_\2\2\u00ce8\3\2\2\2\u00cf\u00d0\7*\2\2\u00d0:\3\2\2\2\u00d1\u00d2"+
		"\7+\2\2\u00d2<\3\2\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6"+
		"\7v\2\2\u00d6>\3\2\2\2\u00d7\u00d8\7d\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da"+
		"\7q\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7c\2\2\u00dd"+
		"\u00de\7p\2\2\u00de@\3\2\2\2\u00df\u00e0\7x\2\2\u00e0\u00e1\7q\2\2\u00e1"+
		"\u00e2\7k\2\2\u00e2\u00e3\7f\2\2\u00e3B\3\2\2\2\u00e4\u00e5\7v\2\2\u00e5"+
		"\u00e6\7t\2\2\u00e6\u00e7\7w\2\2\u00e7\u00e8\7g\2\2\u00e8D\3\2\2\2\u00e9"+
		"\u00ea\7h\2\2\u00ea\u00eb\7c\2\2\u00eb\u00ec\7n\2\2\u00ec\u00ed\7u\2\2"+
		"\u00ed\u00ee\7g\2\2\u00eeF\3\2\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7j\2"+
		"\2\u00f1\u00f2\7k\2\2\u00f2\u00f3\7u\2\2\u00f3H\3\2\2\2\u00f4\u00f5\7"+
		"#\2\2\u00f5J\3\2\2\2\u00f6\u00f8\4c|\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00fd\7\60\2\2\u00fc\u00f7\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3"+
		"\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u0102\4c|\2\u0101"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104L\3\2\2\2\u0105\u0109\4c|\2\u0106\u0108\t\2\2\2\u0107\u0106"+
		"\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"N\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0110\4C\\\2\u010d\u010f\t\2\2\2\u010e"+
		"\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111P\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u011c\7\62\2\2\u0114\u0118"+
		"\4\63;\2\u0115\u0117\4\62;\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2"+
		"\2\2\u011b\u0113\3\2\2\2\u011b\u0114\3\2\2\2\u011cR\3\2\2\2\u011d\u011f"+
		"\t\3\2\2\u011e\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b*\2\2\u0123T\3\2\2\2\13"+
		"\2\u00f9\u00fe\u0103\u0109\u0110\u0118\u011b\u0120\3\3*\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}