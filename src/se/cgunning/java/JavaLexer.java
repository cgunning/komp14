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
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, PUBLIC=6, STATIC=7, RETURN=8, 
		ASSIGN=9, OR=10, EQUALS=11, NOTEQUALS=12, END=13, AND=14, LESSTANOREQ=15, 
		GREATERTHANOREQ=16, LESSTHAN=17, GREATERTHAN=18, ADD=19, SUB=20, PROD=21, 
		DOT=22, CLASS=23, NEW=24, IF=25, ELSE=26, WHILE=27, FOR=28, SOUT=29, LCURL=30, 
		RCURL=31, LBRACK=32, RBRACK=33, LPAR=34, RPAR=35, INT=36, LONG=37, BOOLEAN=38, 
		VOID=39, TRUE=40, FALSE=41, THIS=42, NOT=43, ID=44, LONG_LIT=45, INT_LIT=46, 
		BLOCKCOMMENT=47, COMMENT=48, WS=49;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'public static void main'", "'length'", "','", "'extends'", "'String'", 
		"'public'", "'static'", "'return'", "'='", "'||'", "'=='", "'!='", "';'", 
		"'&&'", "'<='", "'>='", "'<'", "'>'", "'+'", "'-'", "'*'", "'.'", "'class'", 
		"'new'", "'if'", "'else'", "'while'", "'for'", "'System.out.println'", 
		"'{'", "'}'", "'['", "']'", "'('", "')'", "'int'", "'long'", "'boolean'", 
		"'void'", "'true'", "'false'", "'this'", "'!'", "ID", "LONG_LIT", "INT_LIT", 
		"BLOCKCOMMENT", "COMMENT", "WS"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "PUBLIC", "STATIC", "RETURN", 
		"ASSIGN", "OR", "EQUALS", "NOTEQUALS", "END", "AND", "LESSTANOREQ", "GREATERTHANOREQ", 
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
		case 46: BLOCKCOMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 47: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 48: WS_action((RuleContext)_localctx, actionIndex); break;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\63\u016c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3-\3-\7"+
		"-\u0132\n-\f-\16-\u0135\13-\3.\3.\3.\3.\7.\u013b\n.\f.\16.\u013e\13.\3"+
		".\5.\u0141\n.\3/\3/\3/\7/\u0146\n/\f/\16/\u0149\13/\5/\u014b\n/\3\60\3"+
		"\60\3\60\3\60\7\60\u0151\n\60\f\60\16\60\u0154\13\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\3\61\7\61\u015f\n\61\f\61\16\61\u0162\13\61\3"+
		"\61\3\61\3\62\6\62\u0167\n\62\r\62\16\62\u0168\3\62\3\62\3\u0152\2\63"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63\3\2\7\5\2C\\aac|\6"+
		"\2\62;C\\aac|\4\2NNnn\4\2\f\f\17\17\5\2\13\f\16\17\"\"\u0173\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\3e\3\2\2\2\5}\3\2\2\2\7\u0084\3\2\2\2\t\u0086\3\2\2\2\13\u008e"+
		"\3\2\2\2\r\u0095\3\2\2\2\17\u009c\3\2\2\2\21\u00a3\3\2\2\2\23\u00aa\3"+
		"\2\2\2\25\u00ac\3\2\2\2\27\u00af\3\2\2\2\31\u00b2\3\2\2\2\33\u00b5\3\2"+
		"\2\2\35\u00b7\3\2\2\2\37\u00ba\3\2\2\2!\u00bd\3\2\2\2#\u00c0\3\2\2\2%"+
		"\u00c2\3\2\2\2\'\u00c4\3\2\2\2)\u00c6\3\2\2\2+\u00c8\3\2\2\2-\u00ca\3"+
		"\2\2\2/\u00cc\3\2\2\2\61\u00d2\3\2\2\2\63\u00d6\3\2\2\2\65\u00d9\3\2\2"+
		"\2\67\u00de\3\2\2\29\u00e4\3\2\2\2;\u00e8\3\2\2\2=\u00fb\3\2\2\2?\u00fd"+
		"\3\2\2\2A\u00ff\3\2\2\2C\u0101\3\2\2\2E\u0103\3\2\2\2G\u0105\3\2\2\2I"+
		"\u0107\3\2\2\2K\u010b\3\2\2\2M\u0110\3\2\2\2O\u0118\3\2\2\2Q\u011d\3\2"+
		"\2\2S\u0122\3\2\2\2U\u0128\3\2\2\2W\u012d\3\2\2\2Y\u012f\3\2\2\2[\u0140"+
		"\3\2\2\2]\u014a\3\2\2\2_\u014c\3\2\2\2a\u015a\3\2\2\2c\u0166\3\2\2\2e"+
		"f\7r\2\2fg\7w\2\2gh\7d\2\2hi\7n\2\2ij\7k\2\2jk\7e\2\2kl\7\"\2\2lm\7u\2"+
		"\2mn\7v\2\2no\7c\2\2op\7v\2\2pq\7k\2\2qr\7e\2\2rs\7\"\2\2st\7x\2\2tu\7"+
		"q\2\2uv\7k\2\2vw\7f\2\2wx\7\"\2\2xy\7o\2\2yz\7c\2\2z{\7k\2\2{|\7p\2\2"+
		"|\4\3\2\2\2}~\7n\2\2~\177\7g\2\2\177\u0080\7p\2\2\u0080\u0081\7i\2\2\u0081"+
		"\u0082\7v\2\2\u0082\u0083\7j\2\2\u0083\6\3\2\2\2\u0084\u0085\7.\2\2\u0085"+
		"\b\3\2\2\2\u0086\u0087\7g\2\2\u0087\u0088\7z\2\2\u0088\u0089\7v\2\2\u0089"+
		"\u008a\7g\2\2\u008a\u008b\7p\2\2\u008b\u008c\7f\2\2\u008c\u008d\7u\2\2"+
		"\u008d\n\3\2\2\2\u008e\u008f\7U\2\2\u008f\u0090\7v\2\2\u0090\u0091\7t"+
		"\2\2\u0091\u0092\7k\2\2\u0092\u0093\7p\2\2\u0093\u0094\7i\2\2\u0094\f"+
		"\3\2\2\2\u0095\u0096\7r\2\2\u0096\u0097\7w\2\2\u0097\u0098\7d\2\2\u0098"+
		"\u0099\7n\2\2\u0099\u009a\7k\2\2\u009a\u009b\7e\2\2\u009b\16\3\2\2\2\u009c"+
		"\u009d\7u\2\2\u009d\u009e\7v\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7v\2\2"+
		"\u00a0\u00a1\7k\2\2\u00a1\u00a2\7e\2\2\u00a2\20\3\2\2\2\u00a3\u00a4\7"+
		"t\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7w\2\2\u00a7\u00a8"+
		"\7t\2\2\u00a8\u00a9\7p\2\2\u00a9\22\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab\24"+
		"\3\2\2\2\u00ac\u00ad\7~\2\2\u00ad\u00ae\7~\2\2\u00ae\26\3\2\2\2\u00af"+
		"\u00b0\7?\2\2\u00b0\u00b1\7?\2\2\u00b1\30\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3"+
		"\u00b4\7?\2\2\u00b4\32\3\2\2\2\u00b5\u00b6\7=\2\2\u00b6\34\3\2\2\2\u00b7"+
		"\u00b8\7(\2\2\u00b8\u00b9\7(\2\2\u00b9\36\3\2\2\2\u00ba\u00bb\7>\2\2\u00bb"+
		"\u00bc\7?\2\2\u00bc \3\2\2\2\u00bd\u00be\7@\2\2\u00be\u00bf\7?\2\2\u00bf"+
		"\"\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1$\3\2\2\2\u00c2\u00c3\7@\2\2\u00c3"+
		"&\3\2\2\2\u00c4\u00c5\7-\2\2\u00c5(\3\2\2\2\u00c6\u00c7\7/\2\2\u00c7*"+
		"\3\2\2\2\u00c8\u00c9\7,\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7\60\2\2\u00cb"+
		".\3\2\2\2\u00cc\u00cd\7e\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7c\2\2\u00cf"+
		"\u00d0\7u\2\2\u00d0\u00d1\7u\2\2\u00d1\60\3\2\2\2\u00d2\u00d3\7p\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\u00d5\7y\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7k\2\2\u00d7"+
		"\u00d8\7h\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7n\2\2\u00db"+
		"\u00dc\7u\2\2\u00dc\u00dd\7g\2\2\u00dd\66\3\2\2\2\u00de\u00df\7y\2\2\u00df"+
		"\u00e0\7j\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7n\2\2\u00e2\u00e3\7g\2\2"+
		"\u00e38\3\2\2\2\u00e4\u00e5\7h\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e7\7t\2"+
		"\2\u00e7:\3\2\2\2\u00e8\u00e9\7U\2\2\u00e9\u00ea\7{\2\2\u00ea\u00eb\7"+
		"u\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7o\2\2\u00ee\u00ef"+
		"\7\60\2\2\u00ef\u00f0\7q\2\2\u00f0\u00f1\7w\2\2\u00f1\u00f2\7v\2\2\u00f2"+
		"\u00f3\7\60\2\2\u00f3\u00f4\7r\2\2\u00f4\u00f5\7t\2\2\u00f5\u00f6\7k\2"+
		"\2\u00f6\u00f7\7p\2\2\u00f7\u00f8\7v\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa"+
		"\7p\2\2\u00fa<\3\2\2\2\u00fb\u00fc\7}\2\2\u00fc>\3\2\2\2\u00fd\u00fe\7"+
		"\177\2\2\u00fe@\3\2\2\2\u00ff\u0100\7]\2\2\u0100B\3\2\2\2\u0101\u0102"+
		"\7_\2\2\u0102D\3\2\2\2\u0103\u0104\7*\2\2\u0104F\3\2\2\2\u0105\u0106\7"+
		"+\2\2\u0106H\3\2\2\2\u0107\u0108\7k\2\2\u0108\u0109\7p\2\2\u0109\u010a"+
		"\7v\2\2\u010aJ\3\2\2\2\u010b\u010c\7n\2\2\u010c\u010d\7q\2\2\u010d\u010e"+
		"\7p\2\2\u010e\u010f\7i\2\2\u010fL\3\2\2\2\u0110\u0111\7d\2\2\u0111\u0112"+
		"\7q\2\2\u0112\u0113\7q\2\2\u0113\u0114\7n\2\2\u0114\u0115\7g\2\2\u0115"+
		"\u0116\7c\2\2\u0116\u0117\7p\2\2\u0117N\3\2\2\2\u0118\u0119\7x\2\2\u0119"+
		"\u011a\7q\2\2\u011a\u011b\7k\2\2\u011b\u011c\7f\2\2\u011cP\3\2\2\2\u011d"+
		"\u011e\7v\2\2\u011e\u011f\7t\2\2\u011f\u0120\7w\2\2\u0120\u0121\7g\2\2"+
		"\u0121R\3\2\2\2\u0122\u0123\7h\2\2\u0123\u0124\7c\2\2\u0124\u0125\7n\2"+
		"\2\u0125\u0126\7u\2\2\u0126\u0127\7g\2\2\u0127T\3\2\2\2\u0128\u0129\7"+
		"v\2\2\u0129\u012a\7j\2\2\u012a\u012b\7k\2\2\u012b\u012c\7u\2\2\u012cV"+
		"\3\2\2\2\u012d\u012e\7#\2\2\u012eX\3\2\2\2\u012f\u0133\t\2\2\2\u0130\u0132"+
		"\t\3\2\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134Z\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7\62\2\2"+
		"\u0137\u0141\t\4\2\2\u0138\u013c\4\63;\2\u0139\u013b\4\62;\2\u013a\u0139"+
		"\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0141\t\4\2\2\u0140\u0136\3\2"+
		"\2\2\u0140\u0138\3\2\2\2\u0141\\\3\2\2\2\u0142\u014b\7\62\2\2\u0143\u0147"+
		"\4\63;\2\u0144\u0146\4\62;\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149\u0147\3\2"+
		"\2\2\u014a\u0142\3\2\2\2\u014a\u0143\3\2\2\2\u014b^\3\2\2\2\u014c\u014d"+
		"\7\61\2\2\u014d\u014e\7,\2\2\u014e\u0152\3\2\2\2\u014f\u0151\13\2\2\2"+
		"\u0150\u014f\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0153\3\2\2\2\u0152\u0150"+
		"\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7,\2\2\u0156"+
		"\u0157\7\61\2\2\u0157\u0158\3\2\2\2\u0158\u0159\b\60\2\2\u0159`\3\2\2"+
		"\2\u015a\u015b\7\61\2\2\u015b\u015c\7\61\2\2\u015c\u0160\3\2\2\2\u015d"+
		"\u015f\n\5\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2"+
		"\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0164\b\61\3\2\u0164b\3\2\2\2\u0165\u0167\t\6\2\2\u0166\u0165\3\2\2\2"+
		"\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a"+
		"\3\2\2\2\u016a\u016b\b\62\4\2\u016bd\3\2\2\2\13\2\u0133\u013c\u0140\u0147"+
		"\u014a\u0152\u0160\u0168\5\3\60\2\3\61\3\3\62\4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}