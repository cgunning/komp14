// Generated from ./src/main/java/se/cgunning/java/Java.g4 by ANTLR 4.2

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
		LBRACK=26, RBRACK=27, LPAR=28, RPAR=29, INT=30, LONG=31, BOOLEAN=32, VOID=33, 
		TRUE=34, FALSE=35, THIS=36, NOT=37, PACKAGE=38, ID=39, CLASSID=40, LONG_LIT=41, 
		INT_LIT=42, WS=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'package'", "'length'", "','", "'main'", "'return'", "'String'", "'public'", 
		"'static'", "'='", "';'", "'&&'", "'<'", "'+'", "'-'", "'*'", "'.'", "'class'", 
		"'new'", "'if'", "'else'", "'while'", "'for'", "'System.out.println'", 
		"'{'", "'}'", "'['", "']'", "'('", "')'", "'int'", "'long'", "'boolean'", 
		"'void'", "'true'", "'false'", "'this'", "'!'", "PACKAGE", "ID", "CLASSID", 
		"LONG_LIT", "INT_LIT", "WS"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "PUBLIC", "STATIC", "ASSIGN", 
		"END", "AND", "LESSTHAN", "ADD", "SUB", "PROD", "DOT", "CLASS", "NEW", 
		"IF", "ELSE", "WHILE", "FOR", "SOUT", "LCURL", "RCURL", "LBRACK", "RBRACK", 
		"LPAR", "RPAR", "INT", "LONG", "BOOLEAN", "VOID", "TRUE", "FALSE", "THIS", 
		"NOT", "PACKAGE", "ID", "CLASSID", "LONG_LIT", "INT_LIT", "WS"
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
		case 42: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u0139\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%"+
		"\3%\3%\3&\3&\3\'\6\'\u0101\n\'\r\'\16\'\u0102\3\'\6\'\u0106\n\'\r\'\16"+
		"\'\u0107\3\'\6\'\u010b\n\'\r\'\16\'\u010c\3(\3(\7(\u0111\n(\f(\16(\u0114"+
		"\13(\3)\3)\7)\u0118\n)\f)\16)\u011b\13)\3*\3*\3*\3*\7*\u0121\n*\f*\16"+
		"*\u0124\13*\3*\5*\u0127\n*\3+\3+\3+\7+\u012c\n+\f+\16+\u012f\13+\5+\u0131"+
		"\n+\3,\6,\u0134\n,\r,\16,\u0135\3,\3,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-\3\2\5\5\2\62;C\\c|\4\2NNnn\5\2\13\f\16\17\"\"\u0142\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\3Y\3\2\2\2\5a\3\2\2\2\7h\3\2\2\2\tj\3\2\2\2\13o\3\2\2\2\rv\3\2"+
		"\2\2\17}\3\2\2\2\21\u0084\3\2\2\2\23\u008b\3\2\2\2\25\u008d\3\2\2\2\27"+
		"\u008f\3\2\2\2\31\u0092\3\2\2\2\33\u0094\3\2\2\2\35\u0096\3\2\2\2\37\u0098"+
		"\3\2\2\2!\u009a\3\2\2\2#\u009c\3\2\2\2%\u00a2\3\2\2\2\'\u00a6\3\2\2\2"+
		")\u00a9\3\2\2\2+\u00ae\3\2\2\2-\u00b4\3\2\2\2/\u00b8\3\2\2\2\61\u00cb"+
		"\3\2\2\2\63\u00cd\3\2\2\2\65\u00cf\3\2\2\2\67\u00d1\3\2\2\29\u00d3\3\2"+
		"\2\2;\u00d5\3\2\2\2=\u00d7\3\2\2\2?\u00db\3\2\2\2A\u00e0\3\2\2\2C\u00e8"+
		"\3\2\2\2E\u00ed\3\2\2\2G\u00f2\3\2\2\2I\u00f8\3\2\2\2K\u00fd\3\2\2\2M"+
		"\u0105\3\2\2\2O\u010e\3\2\2\2Q\u0115\3\2\2\2S\u0126\3\2\2\2U\u0130\3\2"+
		"\2\2W\u0133\3\2\2\2YZ\7r\2\2Z[\7c\2\2[\\\7e\2\2\\]\7m\2\2]^\7c\2\2^_\7"+
		"i\2\2_`\7g\2\2`\4\3\2\2\2ab\7n\2\2bc\7g\2\2cd\7p\2\2de\7i\2\2ef\7v\2\2"+
		"fg\7j\2\2g\6\3\2\2\2hi\7.\2\2i\b\3\2\2\2jk\7o\2\2kl\7c\2\2lm\7k\2\2mn"+
		"\7p\2\2n\n\3\2\2\2op\7t\2\2pq\7g\2\2qr\7v\2\2rs\7w\2\2st\7t\2\2tu\7p\2"+
		"\2u\f\3\2\2\2vw\7U\2\2wx\7v\2\2xy\7t\2\2yz\7k\2\2z{\7p\2\2{|\7i\2\2|\16"+
		"\3\2\2\2}~\7r\2\2~\177\7w\2\2\177\u0080\7d\2\2\u0080\u0081\7n\2\2\u0081"+
		"\u0082\7k\2\2\u0082\u0083\7e\2\2\u0083\20\3\2\2\2\u0084\u0085\7u\2\2\u0085"+
		"\u0086\7v\2\2\u0086\u0087\7c\2\2\u0087\u0088\7v\2\2\u0088\u0089\7k\2\2"+
		"\u0089\u008a\7e\2\2\u008a\22\3\2\2\2\u008b\u008c\7?\2\2\u008c\24\3\2\2"+
		"\2\u008d\u008e\7=\2\2\u008e\26\3\2\2\2\u008f\u0090\7(\2\2\u0090\u0091"+
		"\7(\2\2\u0091\30\3\2\2\2\u0092\u0093\7>\2\2\u0093\32\3\2\2\2\u0094\u0095"+
		"\7-\2\2\u0095\34\3\2\2\2\u0096\u0097\7/\2\2\u0097\36\3\2\2\2\u0098\u0099"+
		"\7,\2\2\u0099 \3\2\2\2\u009a\u009b\7\60\2\2\u009b\"\3\2\2\2\u009c\u009d"+
		"\7e\2\2\u009d\u009e\7n\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7u\2\2\u00a0"+
		"\u00a1\7u\2\2\u00a1$\3\2\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7g\2\2\u00a4"+
		"\u00a5\7y\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7h\2\2\u00a8"+
		"(\3\2\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7u\2\2\u00ac"+
		"\u00ad\7g\2\2\u00ad*\3\2\2\2\u00ae\u00af\7y\2\2\u00af\u00b0\7j\2\2\u00b0"+
		"\u00b1\7k\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7g\2\2\u00b3,\3\2\2\2\u00b4"+
		"\u00b5\7h\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7t\2\2\u00b7.\3\2\2\2\u00b8"+
		"\u00b9\7U\2\2\u00b9\u00ba\7{\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7v\2\2"+
		"\u00bc\u00bd\7g\2\2\u00bd\u00be\7o\2\2\u00be\u00bf\7\60\2\2\u00bf\u00c0"+
		"\7q\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7\60\2\2\u00c3"+
		"\u00c4\7r\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2"+
		"\u00c7\u00c8\7v\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7p\2\2\u00ca\60\3\2"+
		"\2\2\u00cb\u00cc\7}\2\2\u00cc\62\3\2\2\2\u00cd\u00ce\7\177\2\2\u00ce\64"+
		"\3\2\2\2\u00cf\u00d0\7]\2\2\u00d0\66\3\2\2\2\u00d1\u00d2\7_\2\2\u00d2"+
		"8\3\2\2\2\u00d3\u00d4\7*\2\2\u00d4:\3\2\2\2\u00d5\u00d6\7+\2\2\u00d6<"+
		"\3\2\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7v\2\2\u00da"+
		">\3\2\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7p\2\2\u00de"+
		"\u00df\7i\2\2\u00df@\3\2\2\2\u00e0\u00e1\7d\2\2\u00e1\u00e2\7q\2\2\u00e2"+
		"\u00e3\7q\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7c\2\2"+
		"\u00e6\u00e7\7p\2\2\u00e7B\3\2\2\2\u00e8\u00e9\7x\2\2\u00e9\u00ea\7q\2"+
		"\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7f\2\2\u00ecD\3\2\2\2\u00ed\u00ee\7"+
		"v\2\2\u00ee\u00ef\7t\2\2\u00ef\u00f0\7w\2\2\u00f0\u00f1\7g\2\2\u00f1F"+
		"\3\2\2\2\u00f2\u00f3\7h\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7n\2\2\u00f5"+
		"\u00f6\7u\2\2\u00f6\u00f7\7g\2\2\u00f7H\3\2\2\2\u00f8\u00f9\7v\2\2\u00f9"+
		"\u00fa\7j\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7u\2\2\u00fcJ\3\2\2\2\u00fd"+
		"\u00fe\7#\2\2\u00feL\3\2\2\2\u00ff\u0101\4c|\2\u0100\u00ff\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104\u0106\7\60\2\2\u0105\u0100\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u010b\4c"+
		"|\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010dN\3\2\2\2\u010e\u0112\4c|\2\u010f\u0111\t\2\2\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113P\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0119\4C\\\2\u0116\u0118"+
		"\t\2\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011aR\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\62\2\2"+
		"\u011d\u0127\t\3\2\2\u011e\u0122\4\63;\2\u011f\u0121\4\62;\2\u0120\u011f"+
		"\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127\t\3\2\2\u0126\u011c\3\2"+
		"\2\2\u0126\u011e\3\2\2\2\u0127T\3\2\2\2\u0128\u0131\7\62\2\2\u0129\u012d"+
		"\4\63;\2\u012a\u012c\4\62;\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2"+
		"\2\2\u0130\u0128\3\2\2\2\u0130\u0129\3\2\2\2\u0131V\3\2\2\2\u0132\u0134"+
		"\t\4\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\b,\2\2\u0138X\3\2\2\2\r"+
		"\2\u0102\u0107\u010c\u0112\u0119\u0122\u0126\u012d\u0130\u0135\3\3,\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}