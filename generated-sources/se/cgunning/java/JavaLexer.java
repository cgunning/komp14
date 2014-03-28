// $ANTLR 3.5.1 /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g 2014-03-26 15:15:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class JavaLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int ADD=4;
	public static final int AND=5;
	public static final int BOOLEAN=6;
	public static final int CLASS=7;
	public static final int DOT=8;
	public static final int ELSE=9;
	public static final int FALSE=10;
	public static final int FOR=11;
	public static final int ID=12;
	public static final int IF=13;
	public static final int INT=14;
	public static final int INT_LIT=15;
	public static final int LBRACK=16;
	public static final int LCURL=17;
	public static final int LESSTHAN=18;
	public static final int LPAR=19;
	public static final int NEW=20;
	public static final int NOT=21;
	public static final int PROD=22;
	public static final int PUBLIC=23;
	public static final int RBRACK=24;
	public static final int RCURL=25;
	public static final int RPAR=26;
	public static final int STATIC=27;
	public static final int SUB=28;
	public static final int SYSO=29;
	public static final int THIS=30;
	public static final int TRUE=31;
	public static final int VOID=32;
	public static final int WHILE=33;
	public static final int WS=34;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public JavaLexer() {} 
	public JavaLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public JavaLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g"; }

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:7:7: ( ',' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:7:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:8:7: ( ';' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:8:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:9:7: ( '=' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:9:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:10:7: ( 'String' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:10:9: 'String'
			{
			match("String"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:11:7: ( 'length' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:11:9: 'length'
			{
			match("length"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:12:7: ( 'main' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:12:9: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:13:7: ( 'return' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:13:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "PUBLIC"
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:101:8: ( 'public' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:101:10: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUBLIC"

	// $ANTLR start "STATIC"
	public final void mSTATIC() throws RecognitionException {
		try {
			int _type = STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:103:8: ( 'static' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:103:10: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATIC"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:105:5: ( '&&' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:105:7: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "LESSTHAN"
	public final void mLESSTHAN() throws RecognitionException {
		try {
			int _type = LESSTHAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:106:11: ( '<' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:106:13: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSTHAN"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:107:5: ( '+' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:107:7: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:108:5: ( '-' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:108:7: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB"

	// $ANTLR start "PROD"
	public final void mPROD() throws RecognitionException {
		try {
			int _type = PROD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:109:6: ( '*' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:109:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROD"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:110:5: ( '.' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:110:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:112:7: ( 'class' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:112:9: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASS"

	// $ANTLR start "NEW"
	public final void mNEW() throws RecognitionException {
		try {
			int _type = NEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:113:5: ( 'new' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:113:7: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:114:4: ( 'if' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:114:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:115:6: ( 'else' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:115:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:116:7: ( 'while' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:116:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:117:5: ( 'for' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:117:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "SYSO"
	public final void mSYSO() throws RecognitionException {
		try {
			int _type = SYSO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:119:6: ( 'System.out.println' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:119:8: 'System.out.println'
			{
			match("System.out.println"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYSO"

	// $ANTLR start "LCURL"
	public final void mLCURL() throws RecognitionException {
		try {
			int _type = LCURL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:121:7: ( '{' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:121:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURL"

	// $ANTLR start "RCURL"
	public final void mRCURL() throws RecognitionException {
		try {
			int _type = RCURL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:122:7: ( '}' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:122:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURL"

	// $ANTLR start "LBRACK"
	public final void mLBRACK() throws RecognitionException {
		try {
			int _type = LBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:123:8: ( '[' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:123:10: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACK"

	// $ANTLR start "RBRACK"
	public final void mRBRACK() throws RecognitionException {
		try {
			int _type = RBRACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:124:8: ( ']' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:124:10: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACK"

	// $ANTLR start "LPAR"
	public final void mLPAR() throws RecognitionException {
		try {
			int _type = LPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:125:6: ( '(' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:125:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAR"

	// $ANTLR start "RPAR"
	public final void mRPAR() throws RecognitionException {
		try {
			int _type = RPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:126:6: ( ')' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:126:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAR"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:128:6: ( 'int' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:128:8: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:129:9: ( 'boolean' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:129:11: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:130:6: ( 'void' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:130:8: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:132:6: ( 'true' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:132:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:133:7: ( 'false' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:133:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "THIS"
	public final void mTHIS() throws RecognitionException {
		try {
			int _type = THIS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:135:6: ( 'this' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:135:8: 'this'
			{
			match("this"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THIS"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:136:5: ( '!' )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:136:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:138:4: ( ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:138:6: ( 'a' .. 'z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:138:16: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT_LIT"
	public final void mINT_LIT() throws RecognitionException {
		try {
			int _type = INT_LIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:139:9: ( '0' | '1' .. '9' ( '0' .. '9' )* )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='0') ) {
				alt3=1;
			}
			else if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:139:11: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:139:17: '1' .. '9' ( '0' .. '9' )*
					{
					matchRange('1','9'); 
					// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:139:25: ( '0' .. '9' )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop2;
						}
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_LIT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:140:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:140:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			{
			// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:140:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||(LA4_0 >= '\f' && LA4_0 <= '\r')||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:8: ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | PUBLIC | STATIC | AND | LESSTHAN | ADD | SUB | PROD | DOT | CLASS | NEW | IF | ELSE | WHILE | FOR | SYSO | LCURL | RCURL | LBRACK | RBRACK | LPAR | RPAR | INT | BOOLEAN | VOID | TRUE | FALSE | THIS | NOT | ID | INT_LIT | WS )
		int alt5=38;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:10: T__35
				{
				mT__35(); 

				}
				break;
			case 2 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:16: T__36
				{
				mT__36(); 

				}
				break;
			case 3 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:22: T__37
				{
				mT__37(); 

				}
				break;
			case 4 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:28: T__38
				{
				mT__38(); 

				}
				break;
			case 5 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:34: T__39
				{
				mT__39(); 

				}
				break;
			case 6 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:40: T__40
				{
				mT__40(); 

				}
				break;
			case 7 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:46: T__41
				{
				mT__41(); 

				}
				break;
			case 8 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:52: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 9 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:59: STATIC
				{
				mSTATIC(); 

				}
				break;
			case 10 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:66: AND
				{
				mAND(); 

				}
				break;
			case 11 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:70: LESSTHAN
				{
				mLESSTHAN(); 

				}
				break;
			case 12 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:79: ADD
				{
				mADD(); 

				}
				break;
			case 13 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:83: SUB
				{
				mSUB(); 

				}
				break;
			case 14 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:87: PROD
				{
				mPROD(); 

				}
				break;
			case 15 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:92: DOT
				{
				mDOT(); 

				}
				break;
			case 16 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:96: CLASS
				{
				mCLASS(); 

				}
				break;
			case 17 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:102: NEW
				{
				mNEW(); 

				}
				break;
			case 18 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:106: IF
				{
				mIF(); 

				}
				break;
			case 19 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:109: ELSE
				{
				mELSE(); 

				}
				break;
			case 20 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:114: WHILE
				{
				mWHILE(); 

				}
				break;
			case 21 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:120: FOR
				{
				mFOR(); 

				}
				break;
			case 22 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:124: SYSO
				{
				mSYSO(); 

				}
				break;
			case 23 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:129: LCURL
				{
				mLCURL(); 

				}
				break;
			case 24 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:135: RCURL
				{
				mRCURL(); 

				}
				break;
			case 25 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:141: LBRACK
				{
				mLBRACK(); 

				}
				break;
			case 26 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:148: RBRACK
				{
				mRBRACK(); 

				}
				break;
			case 27 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:155: LPAR
				{
				mLPAR(); 

				}
				break;
			case 28 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:160: RPAR
				{
				mRPAR(); 

				}
				break;
			case 29 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:165: INT
				{
				mINT(); 

				}
				break;
			case 30 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:169: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 31 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:177: VOID
				{
				mVOID(); 

				}
				break;
			case 32 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:182: TRUE
				{
				mTRUE(); 

				}
				break;
			case 33 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:187: FALSE
				{
				mFALSE(); 

				}
				break;
			case 34 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:193: THIS
				{
				mTHIS(); 

				}
				break;
			case 35 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:198: NOT
				{
				mNOT(); 

				}
				break;
			case 36 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:202: ID
				{
				mID(); 

				}
				break;
			case 37 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:205: INT_LIT
				{
				mINT_LIT(); 

				}
				break;
			case 38 :
				// /home/christoffergunning/workspace/miniJava/src/se/cgunning/java/Java.g:1:213: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\5\uffff\5\40\6\uffff\6\40\6\uffff\3\40\6\uffff\7\40\1\75\17\40\1\115"+
		"\1\uffff\1\116\2\40\1\121\6\40\1\130\4\40\2\uffff\1\135\1\40\1\uffff\2"+
		"\40\1\141\1\142\1\143\1\40\1\uffff\3\40\1\150\1\uffff\1\151\1\152\1\40"+
		"\3\uffff\1\154\1\155\1\156\1\157\3\uffff\1\40\4\uffff\1\161\1\uffff";
	static final String DFA5_eofS =
		"\162\uffff";
	static final String DFA5_minS =
		"\1\11\3\uffff\1\164\1\145\1\141\1\145\1\165\1\164\6\uffff\1\154\1\145"+
		"\1\146\1\154\1\150\1\141\6\uffff\2\157\1\150\6\uffff\1\156\1\151\1\164"+
		"\1\142\2\141\1\167\1\60\1\164\1\163\1\151\1\162\1\154\1\157\1\151\1\165"+
		"\1\151\1\147\1\156\1\165\1\154\1\164\1\163\1\60\1\uffff\1\60\1\145\1\154"+
		"\1\60\1\163\1\154\1\144\1\145\1\163\1\164\1\60\1\162\2\151\1\163\2\uffff"+
		"\1\60\1\145\1\uffff\2\145\3\60\1\150\1\uffff\1\156\2\143\1\60\1\uffff"+
		"\2\60\1\141\3\uffff\4\60\3\uffff\1\156\4\uffff\1\60\1\uffff";
	static final String DFA5_maxS =
		"\1\175\3\uffff\1\171\1\145\1\141\1\145\1\165\1\164\6\uffff\1\154\1\145"+
		"\1\156\1\154\1\150\1\157\6\uffff\2\157\1\162\6\uffff\1\156\1\151\1\164"+
		"\1\142\2\141\1\167\1\172\1\164\1\163\1\151\1\162\1\154\1\157\1\151\1\165"+
		"\1\151\1\147\1\156\1\165\1\154\1\164\1\163\1\172\1\uffff\1\172\1\145\1"+
		"\154\1\172\1\163\1\154\1\144\1\145\1\163\1\164\1\172\1\162\2\151\1\163"+
		"\2\uffff\1\172\1\145\1\uffff\2\145\3\172\1\150\1\uffff\1\156\2\143\1\172"+
		"\1\uffff\2\172\1\141\3\uffff\4\172\3\uffff\1\156\4\uffff\1\172\1\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\1\2\1\3\6\uffff\1\12\1\13\1\14\1\15\1\16\1\17\6\uffff\1\27"+
		"\1\30\1\31\1\32\1\33\1\34\3\uffff\1\43\1\44\1\45\1\46\1\4\1\26\30\uffff"+
		"\1\22\17\uffff\1\21\1\35\2\uffff\1\25\6\uffff\1\6\4\uffff\1\23\3\uffff"+
		"\1\37\1\40\1\42\4\uffff\1\20\1\24\1\41\1\uffff\1\5\1\7\1\10\1\11\1\uffff"+
		"\1\36";
	static final String DFA5_specialS =
		"\162\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\42\1\uffff\2\42\22\uffff\1\42\1\37\4\uffff\1\12\1\uffff\1\32\1\33"+
			"\1\16\1\14\1\1\1\15\1\17\1\uffff\12\41\1\uffff\1\2\1\13\1\3\25\uffff"+
			"\1\4\7\uffff\1\30\1\uffff\1\31\3\uffff\1\40\1\34\1\20\1\40\1\23\1\25"+
			"\2\40\1\22\2\40\1\5\1\6\1\21\1\40\1\10\1\40\1\7\1\11\1\36\1\40\1\35\1"+
			"\24\3\40\1\26\1\uffff\1\27",
			"",
			"",
			"",
			"\1\43\4\uffff\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\52",
			"\1\53",
			"\1\54\7\uffff\1\55",
			"\1\56",
			"\1\57",
			"\1\61\15\uffff\1\60",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\62",
			"\1\63",
			"\1\65\11\uffff\1\64",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\117",
			"\1\120",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\136",
			"",
			"\1\137",
			"\1\140",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\144",
			"",
			"\1\145",
			"\1\146",
			"\1\147",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\1\153",
			"",
			"",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			"",
			"",
			"",
			"\1\160",
			"",
			"",
			"",
			"",
			"\12\40\7\uffff\32\40\6\uffff\32\40",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | PUBLIC | STATIC | AND | LESSTHAN | ADD | SUB | PROD | DOT | CLASS | NEW | IF | ELSE | WHILE | FOR | SYSO | LCURL | RCURL | LBRACK | RBRACK | LPAR | RPAR | INT | BOOLEAN | VOID | TRUE | FALSE | THIS | NOT | ID | INT_LIT | WS );";
		}
	}

}
