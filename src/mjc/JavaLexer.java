// Generated from Java.g4 by ANTLR 4.2

  package mjc;

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
		T__3=1, T__2=2, T__1=3, T__0=4, PUBLIC=5, STATIC=6, RETURN=7, ASSIGN=8, 
		OR=9, EQUALS=10, NOTEQUALS=11, END=12, AND=13, LESSTANOREQ=14, GREATERTHANOREQ=15, 
		LESSTHAN=16, GREATERTHAN=17, ADD=18, SUB=19, PROD=20, DOT=21, CLASS=22, 
		NEW=23, IF=24, ELSE=25, WHILE=26, FOR=27, SOUT=28, LCURL=29, RCURL=30, 
		LBRACK=31, RBRACK=32, LPAR=33, RPAR=34, INT=35, LONG=36, BOOLEAN=37, VOID=38, 
		TRUE=39, FALSE=40, THIS=41, NOT=42, ID=43, LONG_LIT=44, INT_LIT=45, BLOCKCOMMENT=46, 
		COMMENT=47, WS=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'length'", "','", "'extends'", "'String'", "'public'", "'static'", "'return'", 
		"'='", "'||'", "'=='", "'!='", "';'", "'&&'", "'<='", "'>='", "'<'", "'>'", 
		"'+'", "'-'", "'*'", "'.'", "'class'", "'new'", "'if'", "'else'", "'while'", 
		"'for'", "'System.out.println'", "'{'", "'}'", "'['", "']'", "'('", "')'", 
		"'int'", "'long'", "'boolean'", "'void'", "'true'", "'false'", "'this'", 
		"'!'", "ID", "LONG_LIT", "INT_LIT", "BLOCKCOMMENT", "COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "PUBLIC", "STATIC", "RETURN", "ASSIGN", 
		"OR", "EQUALS", "NOTEQUALS", "END", "AND", "LESSTANOREQ", "GREATERTHANOREQ", 
		"LESSTHAN", "GREATERTHAN", "ADD", "SUB", "PROD", "DOT", "CLASS", "NEW", 
		"IF", "ELSE", "WHILE", "FOR", "SOUT", "LCURL", "RCURL", "LBRACK", "RBRACK", 
		"LPAR", "RPAR", "INT", "LONG", "BOOLEAN", "VOID", "TRUE", "FALSE", "THIS", 
		"NOT", "ID", "LONG_LIT", "INT_LIT", "BLOCKCOMMENT", "COMMENT", "WS"
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
		case 45: BLOCKCOMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 46: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 47: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void BLOCKCOMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip();  break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:  skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:  skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\62\u0152\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3+\3+\3,\3,\7,\u0118\n,\f,\16,\u011b\13,\3-\3-\3-"+
		"\3-\7-\u0121\n-\f-\16-\u0124\13-\3-\5-\u0127\n-\3.\3.\3.\7.\u012c\n.\f"+
		".\16.\u012f\13.\5.\u0131\n.\3/\3/\3/\3/\7/\u0137\n/\f/\16/\u013a\13/\3"+
		"/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u0145\n\60\f\60\16\60\u0148\13"+
		"\60\3\60\3\60\3\61\6\61\u014d\n\61\r\61\16\61\u014e\3\61\3\61\3\u0138"+
		"\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62\3\2\7\5\2C\\aac|\6"+
		"\2\62;C\\aac|\4\2NNnn\4\2\f\f\17\17\5\2\13\f\16\17\"\"\u0159\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3"+
		"\2\2\2\5j\3\2\2\2\7l\3\2\2\2\tt\3\2\2\2\13{\3\2\2\2\r\u0082\3\2\2\2\17"+
		"\u0089\3\2\2\2\21\u0090\3\2\2\2\23\u0092\3\2\2\2\25\u0095\3\2\2\2\27\u0098"+
		"\3\2\2\2\31\u009b\3\2\2\2\33\u009d\3\2\2\2\35\u00a0\3\2\2\2\37\u00a3\3"+
		"\2\2\2!\u00a6\3\2\2\2#\u00a8\3\2\2\2%\u00aa\3\2\2\2\'\u00ac\3\2\2\2)\u00ae"+
		"\3\2\2\2+\u00b0\3\2\2\2-\u00b2\3\2\2\2/\u00b8\3\2\2\2\61\u00bc\3\2\2\2"+
		"\63\u00bf\3\2\2\2\65\u00c4\3\2\2\2\67\u00ca\3\2\2\29\u00ce\3\2\2\2;\u00e1"+
		"\3\2\2\2=\u00e3\3\2\2\2?\u00e5\3\2\2\2A\u00e7\3\2\2\2C\u00e9\3\2\2\2E"+
		"\u00eb\3\2\2\2G\u00ed\3\2\2\2I\u00f1\3\2\2\2K\u00f6\3\2\2\2M\u00fe\3\2"+
		"\2\2O\u0103\3\2\2\2Q\u0108\3\2\2\2S\u010e\3\2\2\2U\u0113\3\2\2\2W\u0115"+
		"\3\2\2\2Y\u0126\3\2\2\2[\u0130\3\2\2\2]\u0132\3\2\2\2_\u0140\3\2\2\2a"+
		"\u014c\3\2\2\2cd\7n\2\2de\7g\2\2ef\7p\2\2fg\7i\2\2gh\7v\2\2hi\7j\2\2i"+
		"\4\3\2\2\2jk\7.\2\2k\6\3\2\2\2lm\7g\2\2mn\7z\2\2no\7v\2\2op\7g\2\2pq\7"+
		"p\2\2qr\7f\2\2rs\7u\2\2s\b\3\2\2\2tu\7U\2\2uv\7v\2\2vw\7t\2\2wx\7k\2\2"+
		"xy\7p\2\2yz\7i\2\2z\n\3\2\2\2{|\7r\2\2|}\7w\2\2}~\7d\2\2~\177\7n\2\2\177"+
		"\u0080\7k\2\2\u0080\u0081\7e\2\2\u0081\f\3\2\2\2\u0082\u0083\7u\2\2\u0083"+
		"\u0084\7v\2\2\u0084\u0085\7c\2\2\u0085\u0086\7v\2\2\u0086\u0087\7k\2\2"+
		"\u0087\u0088\7e\2\2\u0088\16\3\2\2\2\u0089\u008a\7t\2\2\u008a\u008b\7"+
		"g\2\2\u008b\u008c\7v\2\2\u008c\u008d\7w\2\2\u008d\u008e\7t\2\2\u008e\u008f"+
		"\7p\2\2\u008f\20\3\2\2\2\u0090\u0091\7?\2\2\u0091\22\3\2\2\2\u0092\u0093"+
		"\7~\2\2\u0093\u0094\7~\2\2\u0094\24\3\2\2\2\u0095\u0096\7?\2\2\u0096\u0097"+
		"\7?\2\2\u0097\26\3\2\2\2\u0098\u0099\7#\2\2\u0099\u009a\7?\2\2\u009a\30"+
		"\3\2\2\2\u009b\u009c\7=\2\2\u009c\32\3\2\2\2\u009d\u009e\7(\2\2\u009e"+
		"\u009f\7(\2\2\u009f\34\3\2\2\2\u00a0\u00a1\7>\2\2\u00a1\u00a2\7?\2\2\u00a2"+
		"\36\3\2\2\2\u00a3\u00a4\7@\2\2\u00a4\u00a5\7?\2\2\u00a5 \3\2\2\2\u00a6"+
		"\u00a7\7>\2\2\u00a7\"\3\2\2\2\u00a8\u00a9\7@\2\2\u00a9$\3\2\2\2\u00aa"+
		"\u00ab\7-\2\2\u00ab&\3\2\2\2\u00ac\u00ad\7/\2\2\u00ad(\3\2\2\2\u00ae\u00af"+
		"\7,\2\2\u00af*\3\2\2\2\u00b0\u00b1\7\60\2\2\u00b1,\3\2\2\2\u00b2\u00b3"+
		"\7e\2\2\u00b3\u00b4\7n\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7u\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7.\3\2\2\2\u00b8\u00b9\7p\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		"\u00bb\7y\2\2\u00bb\60\3\2\2\2\u00bc\u00bd\7k\2\2\u00bd\u00be\7h\2\2\u00be"+
		"\62\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7n\2\2\u00c1\u00c2\7u\2\2\u00c2"+
		"\u00c3\7g\2\2\u00c3\64\3\2\2\2\u00c4\u00c5\7y\2\2\u00c5\u00c6\7j\2\2\u00c6"+
		"\u00c7\7k\2\2\u00c7\u00c8\7n\2\2\u00c8\u00c9\7g\2\2\u00c9\66\3\2\2\2\u00ca"+
		"\u00cb\7h\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7t\2\2\u00cd8\3\2\2\2\u00ce"+
		"\u00cf\7U\2\2\u00cf\u00d0\7{\2\2\u00d0\u00d1\7u\2\2\u00d1\u00d2\7v\2\2"+
		"\u00d2\u00d3\7g\2\2\u00d3\u00d4\7o\2\2\u00d4\u00d5\7\60\2\2\u00d5\u00d6"+
		"\7q\2\2\u00d6\u00d7\7w\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7\60\2\2\u00d9"+
		"\u00da\7r\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7p\2\2"+
		"\u00dd\u00de\7v\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7p\2\2\u00e0:\3\2\2"+
		"\2\u00e1\u00e2\7}\2\2\u00e2<\3\2\2\2\u00e3\u00e4\7\177\2\2\u00e4>\3\2"+
		"\2\2\u00e5\u00e6\7]\2\2\u00e6@\3\2\2\2\u00e7\u00e8\7_\2\2\u00e8B\3\2\2"+
		"\2\u00e9\u00ea\7*\2\2\u00eaD\3\2\2\2\u00eb\u00ec\7+\2\2\u00ecF\3\2\2\2"+
		"\u00ed\u00ee\7k\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7v\2\2\u00f0H\3\2\2"+
		"\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7q\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5"+
		"\7i\2\2\u00f5J\3\2\2\2\u00f6\u00f7\7d\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9"+
		"\7q\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7c\2\2\u00fc"+
		"\u00fd\7p\2\2\u00fdL\3\2\2\2\u00fe\u00ff\7x\2\2\u00ff\u0100\7q\2\2\u0100"+
		"\u0101\7k\2\2\u0101\u0102\7f\2\2\u0102N\3\2\2\2\u0103\u0104\7v\2\2\u0104"+
		"\u0105\7t\2\2\u0105\u0106\7w\2\2\u0106\u0107\7g\2\2\u0107P\3\2\2\2\u0108"+
		"\u0109\7h\2\2\u0109\u010a\7c\2\2\u010a\u010b\7n\2\2\u010b\u010c\7u\2\2"+
		"\u010c\u010d\7g\2\2\u010dR\3\2\2\2\u010e\u010f\7v\2\2\u010f\u0110\7j\2"+
		"\2\u0110\u0111\7k\2\2\u0111\u0112\7u\2\2\u0112T\3\2\2\2\u0113\u0114\7"+
		"#\2\2\u0114V\3\2\2\2\u0115\u0119\t\2\2\2\u0116\u0118\t\3\2\2\u0117\u0116"+
		"\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"X\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\62\2\2\u011d\u0127\t\4\2\2"+
		"\u011e\u0122\4\63;\2\u011f\u0121\4\62;\2\u0120\u011f\3\2\2\2\u0121\u0124"+
		"\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0127\t\4\2\2\u0126\u011c\3\2\2\2\u0126\u011e\3\2"+
		"\2\2\u0127Z\3\2\2\2\u0128\u0131\7\62\2\2\u0129\u012d\4\63;\2\u012a\u012c"+
		"\4\62;\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0128\3\2"+
		"\2\2\u0130\u0129\3\2\2\2\u0131\\\3\2\2\2\u0132\u0133\7\61\2\2\u0133\u0134"+
		"\7,\2\2\u0134\u0138\3\2\2\2\u0135\u0137\13\2\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013b\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7,\2\2\u013c\u013d\7\61\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013f\b/\2\2\u013f^\3\2\2\2\u0140\u0141\7\61\2\2"+
		"\u0141\u0142\7\61\2\2\u0142\u0146\3\2\2\2\u0143\u0145\n\5\2\2\u0144\u0143"+
		"\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0149\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\b\60\3\2\u014a`\3\2\2\2"+
		"\u014b\u014d\t\6\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\b\61\4\2"+
		"\u0151b\3\2\2\2\13\2\u0119\u0122\u0126\u012d\u0130\u0138\u0146\u014e\5"+
		"\3/\2\3\60\3\3\61\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}