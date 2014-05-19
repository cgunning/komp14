// Generated from ./src/mjc/Java.g4 by ANTLR 4.2

  package mjc;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JavaParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'public static void main'", "'length'", "','", "'extends'", 
		"'String'", "'public'", "'static'", "'return'", "'='", "'||'", "'=='", 
		"'!='", "';'", "'&&'", "'<='", "'>='", "'<'", "'>'", "'+'", "'-'", "'*'", 
		"'.'", "'class'", "'new'", "'if'", "'else'", "'while'", "'for'", "'System.out.println'", 
		"'{'", "'}'", "'['", "']'", "'('", "')'", "'int'", "'long'", "'boolean'", 
		"'void'", "'true'", "'false'", "'this'", "'!'", "ID", "LONG_LIT", "INT_LIT", 
		"BLOCKCOMMENT", "COMMENT", "WS"
	};
	public static final int
		RULE_program = 0, RULE_mainClass = 1, RULE_classDecl = 2, RULE_extendString = 3, 
		RULE_methodDecl = 4, RULE_varDecl = 5, RULE_mainMethod = 6, RULE_formalList = 7, 
		RULE_formalRest = 8, RULE_type = 9, RULE_stmt = 10, RULE_exp = 11, RULE_expList = 12, 
		RULE_expRest = 13;
	public static final String[] ruleNames = {
		"program", "mainClass", "classDecl", "extendString", "methodDecl", "varDecl", 
		"mainMethod", "formalList", "formalRest", "type", "stmt", "exp", "expList", 
		"expRest"
	};

	@Override
	public String getGrammarFileName() { return "Java.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public ClassDeclContext classDecl(int i) {
			return getRuleContext(ClassDeclContext.class,i);
		}
		public List<ClassDeclContext> classDecl() {
			return getRuleContexts(ClassDeclContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); mainClass();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(29); classDecl();
				}
				}
				setState(34);
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

	public static class MainClassContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode LCURL() { return getToken(JavaParser.LCURL, 0); }
		public MainMethodContext mainMethod() {
			return getRuleContext(MainMethodContext.class,0);
		}
		public TerminalNode RCURL() { return getToken(JavaParser.RCURL, 0); }
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); match(CLASS);
			setState(36); match(ID);
			setState(37); match(LCURL);
			setState(38); mainMethod();
			setState(39); match(RCURL);
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

	public static class ClassDeclContext extends ParserRuleContext {
		public MethodDeclContext methodDecl(int i) {
			return getRuleContext(MethodDeclContext.class,i);
		}
		public ExtendStringContext extendString() {
			return getRuleContext(ExtendStringContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public TerminalNode LCURL() { return getToken(JavaParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(JavaParser.RCURL, 0); }
		public List<MethodDeclContext> methodDecl() {
			return getRuleContexts(MethodDeclContext.class);
		}
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public ClassDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclContext classDecl() throws RecognitionException {
		ClassDeclContext _localctx = new ClassDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); match(CLASS);
			setState(42); match(ID);
			setState(44);
			_la = _input.LA(1);
			if (_la==4) {
				{
				setState(43); extendString();
				}
			}

			setState(46); match(LCURL);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << LONG) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(47); varDecl();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUBLIC) {
				{
				{
				setState(53); methodDecl();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59); match(RCURL);
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

	public static class ExtendStringContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public ExtendStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendString; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExtendString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendStringContext extendString() throws RecognitionException {
		ExtendStringContext _localctx = new ExtendStringContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_extendString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); match(4);
			setState(62); match(ID);
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

	public static class MethodDeclContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(JavaParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public TerminalNode LCURL() { return getToken(JavaParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(JavaParser.RCURL, 0); }
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public FormalListContext formalList() {
			return getRuleContext(FormalListContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(JavaParser.RPAR, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(JavaParser.RETURN, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public TerminalNode END() { return getToken(JavaParser.END, 0); }
		public MethodDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclContext methodDecl() throws RecognitionException {
		MethodDeclContext _localctx = new MethodDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(PUBLIC);
			setState(65); type();
			setState(66); match(ID);
			setState(67); match(LPAR);
			setState(68); formalList();
			setState(69); match(RPAR);
			setState(70); match(LCURL);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(71); varDecl();
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SOUT) | (1L << LCURL) | (1L << ID))) != 0)) {
				{
				{
				setState(77); stmt();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83); match(RETURN);
			setState(84); exp(0);
			setState(85); match(END);
			setState(86); match(RCURL);
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

	public static class VarDeclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode END() { return getToken(JavaParser.END, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); type();
			setState(89); match(ID);
			setState(90); match(END);
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

	public static class MainMethodContext extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(JavaParser.RBRACK, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(JavaParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(JavaParser.LPAR, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public TerminalNode LCURL() { return getToken(JavaParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(JavaParser.RCURL, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public TerminalNode LBRACK() { return getToken(JavaParser.LBRACK, 0); }
		public MainMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainMethod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMainMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainMethodContext mainMethod() throws RecognitionException {
		MainMethodContext _localctx = new MainMethodContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mainMethod);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(1);
			setState(93); match(LPAR);
			setState(94); match(5);
			setState(95); match(LBRACK);
			setState(96); match(RBRACK);
			setState(97); match(ID);
			setState(98); match(RPAR);
			setState(99); match(LCURL);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(100); varDecl();
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SOUT) | (1L << LCURL) | (1L << ID))) != 0)) {
				{
				{
				setState(106); stmt();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112); match(RCURL);
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

	public static class FormalListContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public List<FormalRestContext> formalRest() {
			return getRuleContexts(FormalRestContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalRestContext formalRest(int i) {
			return getRuleContext(FormalRestContext.class,i);
		}
		public FormalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalListContext formalList() throws RecognitionException {
		FormalListContext _localctx = new FormalListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_formalList);
		int _la;
		try {
			setState(123);
			switch (_input.LA(1)) {
			case INT:
			case LONG:
			case BOOLEAN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); type();
				setState(115); match(ID);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(116); formalRest();
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class FormalRestContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FormalRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFormalRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalRestContext formalRest() throws RecognitionException {
		FormalRestContext _localctx = new FormalRestContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formalRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(3);
			setState(126); type();
			setState(127); match(ID);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(JavaParser.RBRACK, 0); }
		public TerminalNode BOOLEAN() { return getToken(JavaParser.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode LONG() { return getToken(JavaParser.LONG, 0); }
		public TerminalNode LBRACK() { return getToken(JavaParser.LBRACK, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129); match(INT);
				setState(130); match(LBRACK);
				setState(131); match(RBRACK);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132); match(LONG);
				setState(133); match(LBRACK);
				setState(134); match(RBRACK);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135); match(BOOLEAN);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136); match(INT);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(137); match(LONG);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(138); match(ID);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignContext extends StmtContext {
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode END() { return getToken(JavaParser.END, 0); }
		public AssignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StmtContext {
		public TerminalNode WHILE() { return getToken(JavaParser.WHILE, 0); }
		public TerminalNode RPAR() { return getToken(JavaParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(JavaParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SoutContext extends StmtContext {
		public TerminalNode RPAR() { return getToken(JavaParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(JavaParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SOUT() { return getToken(JavaParser.SOUT, 0); }
		public TerminalNode END() { return getToken(JavaParser.END, 0); }
		public SoutContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSout(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrAssignContext extends StmtContext {
		public TerminalNode RBRACK() { return getToken(JavaParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(JavaParser.ASSIGN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode END() { return getToken(JavaParser.END, 0); }
		public TerminalNode LBRACK() { return getToken(JavaParser.LBRACK, 0); }
		public ArrAssignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArrAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStmtContext extends StmtContext {
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public TerminalNode LCURL() { return getToken(JavaParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(JavaParser.RCURL, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public BlockStmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StmtContext {
		public TerminalNode IF() { return getToken(JavaParser.IF, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(JavaParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(JavaParser.LPAR, 0); }
		public TerminalNode ELSE() { return getToken(JavaParser.ELSE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public IfContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		int _la;
		try {
			int _alt;
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(141); match(LCURL);
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(142); varDecl();
						}
						} 
					}
					setState(147);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SOUT) | (1L << LCURL) | (1L << ID))) != 0)) {
					{
					{
					setState(148); stmt();
					}
					}
					setState(153);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(154); match(RCURL);
				}
				break;

			case 2:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155); match(IF);
				setState(156); match(LPAR);
				setState(157); exp(0);
				setState(158); match(RPAR);
				setState(159); stmt();
				setState(162);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(160); match(ELSE);
					setState(161); stmt();
					}
					break;
				}
				}
				break;

			case 3:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(164); match(WHILE);
				setState(165); match(LPAR);
				setState(166); exp(0);
				setState(167); match(RPAR);
				setState(168); stmt();
				}
				break;

			case 4:
				_localctx = new SoutContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(170); match(SOUT);
				setState(171); match(LPAR);
				setState(172); exp(0);
				setState(173); match(RPAR);
				setState(174); match(END);
				}
				break;

			case 5:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(176); match(ID);
				setState(177); match(ASSIGN);
				setState(178); exp(0);
				setState(179); match(END);
				}
				break;

			case 6:
				_localctx = new ArrAssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(181); match(ID);
				setState(182); match(LBRACK);
				setState(183); exp(0);
				setState(184); match(RBRACK);
				setState(185); match(ASSIGN);
				setState(186); exp(0);
				setState(187); match(END);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode NOT() { return getToken(JavaParser.NOT, 0); }
		public NotExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNotExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotEqualsContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NOTEQUALS() { return getToken(JavaParser.NOTEQUALS, 0); }
		public NotEqualsContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNotEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LongLitContext extends ExpContext {
		public TerminalNode LONG_LIT() { return getToken(JavaParser.LONG_LIT, 0); }
		public LongLitContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLongLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends ExpContext {
		public TerminalNode LESSTHAN() { return getToken(JavaParser.LESSTHAN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LessThanContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntLitContext extends ExpContext {
		public TerminalNode INT_LIT() { return getToken(JavaParser.INT_LIT, 0); }
		public IntLitContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitIntLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrAccessContext extends ExpContext {
		public TerminalNode RBRACK() { return getToken(JavaParser.RBRACK, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(JavaParser.LBRACK, 0); }
		public ArrAccessContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitArrAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MethodCallContext extends ExpContext {
		public ExpListContext expList() {
			return getRuleContext(ExpListContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(JavaParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(JavaParser.LPAR, 0); }
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public MethodCallContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisContext extends ExpContext {
		public TerminalNode THIS() { return getToken(JavaParser.THIS, 0); }
		public ThisContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitThis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends ExpContext {
		public TerminalNode FALSE() { return getToken(JavaParser.FALSE, 0); }
		public FalseContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProdContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PROD() { return getToken(JavaParser.PROD, 0); }
		public ProdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitProd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewLongArrContext extends ExpContext {
		public TerminalNode RBRACK() { return getToken(JavaParser.RBRACK, 0); }
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode LONG() { return getToken(JavaParser.LONG, 0); }
		public TerminalNode LBRACK() { return getToken(JavaParser.LBRACK, 0); }
		public NewLongArrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNewLongArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewIntArrContext extends ExpContext {
		public TerminalNode RBRACK() { return getToken(JavaParser.RBRACK, 0); }
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public TerminalNode INT() { return getToken(JavaParser.INT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(JavaParser.LBRACK, 0); }
		public NewIntArrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNewIntArr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanOrEqualContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode GREATERTHANOREQ() { return getToken(JavaParser.GREATERTHANOREQ, 0); }
		public GreaterThanOrEqualContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitGreaterThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewObjectContext extends ExpContext {
		public TerminalNode NEW() { return getToken(JavaParser.NEW, 0); }
		public TerminalNode RPAR() { return getToken(JavaParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(JavaParser.LPAR, 0); }
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public NewObjectContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitNewObject(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanOrEqualContext extends ExpContext {
		public TerminalNode LESSTANOREQ() { return getToken(JavaParser.LESSTANOREQ, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public LessThanOrEqualContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitLessThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpContext {
		public TerminalNode OR() { return getToken(JavaParser.OR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public OrContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends ExpContext {
		public TerminalNode TRUE() { return getToken(JavaParser.TRUE, 0); }
		public TrueContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode ADD() { return getToken(JavaParser.ADD, 0); }
		public AddContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanContext extends ExpContext {
		public TerminalNode GREATERTHAN() { return getToken(JavaParser.GREATERTHAN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public GreaterThanContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitGreaterThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsContext extends ExpContext {
		public TerminalNode EQUALS() { return getToken(JavaParser.EQUALS, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public EqualsContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExpContext {
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public IdContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotLengthContext extends ExpContext {
		public TerminalNode DOT() { return getToken(JavaParser.DOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DotLengthContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitDotLength(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SUB() { return getToken(JavaParser.SUB, 0); }
		public SubContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParExpContext extends ExpContext {
		public TerminalNode RPAR() { return getToken(JavaParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(JavaParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ParExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitParExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpContext {
		public TerminalNode AND() { return getToken(JavaParser.AND, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public AndContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(192); match(NOT);
				setState(193); exp(14);
				}
				break;

			case 2:
				{
				_localctx = new IntLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194); match(INT_LIT);
				}
				break;

			case 3:
				{
				_localctx = new LongLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195); match(LONG_LIT);
				}
				break;

			case 4:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196); match(TRUE);
				}
				break;

			case 5:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197); match(FALSE);
				}
				break;

			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198); match(ID);
				}
				break;

			case 7:
				{
				_localctx = new NewIntArrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199); match(NEW);
				setState(200); match(INT);
				setState(201); match(LBRACK);
				setState(202); exp(0);
				setState(203); match(RBRACK);
				}
				break;

			case 8:
				{
				_localctx = new NewLongArrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205); match(NEW);
				setState(206); match(LONG);
				setState(207); match(LBRACK);
				setState(208); exp(0);
				setState(209); match(RBRACK);
				}
				break;

			case 9:
				{
				_localctx = new ThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211); match(THIS);
				}
				break;

			case 10:
				{
				_localctx = new NewObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212); match(NEW);
				setState(213); match(ID);
				setState(214); match(LPAR);
				setState(215); match(RPAR);
				}
				break;

			case 11:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216); match(LPAR);
				setState(217); exp(0);
				setState(218); match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(270);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ProdContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(222);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(223); match(PROD);
						setState(224); exp(13);
						}
						break;

					case 2:
						{
						_localctx = new SubContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(225);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(226); match(SUB);
						setState(227); exp(12);
						}
						break;

					case 3:
						{
						_localctx = new AddContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(228);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(229); match(ADD);
						setState(230); exp(11);
						}
						break;

					case 4:
						{
						_localctx = new LessThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(231);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(232); match(LESSTHAN);
						setState(233); exp(10);
						}
						break;

					case 5:
						{
						_localctx = new LessThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(234);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(235); match(LESSTANOREQ);
						setState(236); exp(9);
						}
						break;

					case 6:
						{
						_localctx = new GreaterThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(237);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(238); match(GREATERTHAN);
						setState(239); exp(8);
						}
						break;

					case 7:
						{
						_localctx = new GreaterThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(240);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(241); match(GREATERTHANOREQ);
						setState(242); exp(7);
						}
						break;

					case 8:
						{
						_localctx = new EqualsContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(243);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(244); match(EQUALS);
						setState(245); exp(6);
						}
						break;

					case 9:
						{
						_localctx = new NotEqualsContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(246);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(247); match(NOTEQUALS);
						setState(248); exp(5);
						}
						break;

					case 10:
						{
						_localctx = new AndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(249);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(250); match(AND);
						setState(251); exp(4);
						}
						break;

					case 11:
						{
						_localctx = new OrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(252);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(253); match(OR);
						setState(254); exp(3);
						}
						break;

					case 12:
						{
						_localctx = new ArrAccessContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(255);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(256); match(LBRACK);
						setState(257); exp(0);
						setState(258); match(RBRACK);
						}
						break;

					case 13:
						{
						_localctx = new MethodCallContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(260);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(261); match(DOT);
						setState(262); match(ID);
						setState(263); match(LPAR);
						setState(264); expList();
						setState(265); match(RPAR);
						}
						break;

					case 14:
						{
						_localctx = new DotLengthContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(267);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(268); match(DOT);
						setState(269); match(2);
						}
						break;
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpListContext extends ParserRuleContext {
		public ExpRestContext expRest(int i) {
			return getRuleContext(ExpRestContext.class,i);
		}
		public List<ExpRestContext> expRest() {
			return getRuleContexts(ExpRestContext.class);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExpList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpListContext expList() throws RecognitionException {
		ExpListContext _localctx = new ExpListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expList);
		int _la;
		try {
			setState(283);
			switch (_input.LA(1)) {
			case NEW:
			case LPAR:
			case TRUE:
			case FALSE:
			case THIS:
			case NOT:
			case ID:
			case LONG_LIT:
			case INT_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(275); exp(0);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(276); expRest();
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RPAR:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpRestContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expRest; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitExpRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpRestContext expRest() throws RecognitionException {
		ExpRestContext _localctx = new ExpRestContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(3);
			setState(286); exp(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 12);

		case 1: return precpred(_ctx, 11);

		case 2: return precpred(_ctx, 10);

		case 3: return precpred(_ctx, 9);

		case 4: return precpred(_ctx, 8);

		case 5: return precpred(_ctx, 7);

		case 6: return precpred(_ctx, 6);

		case 7: return precpred(_ctx, 5);

		case 8: return precpred(_ctx, 4);

		case 9: return precpred(_ctx, 3);

		case 10: return precpred(_ctx, 2);

		case 11: return precpred(_ctx, 18);

		case 12: return precpred(_ctx, 17);

		case 13: return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u0123\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4/\n\4\3\4\3\4\7\4\63\n\4\f\4"+
		"\16\4\66\13\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\7\6Q\n\6\f\6\16\6"+
		"T\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\bh\n\b\f\b\16\bk\13\b\3\b\7\bn\n\b\f\b\16\bq\13\b\3\b\3\b\3"+
		"\t\3\t\3\t\7\tx\n\t\f\t\16\t{\13\t\3\t\5\t~\n\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008e\n\13\3\f\3\f\7"+
		"\f\u0092\n\f\f\f\16\f\u0095\13\f\3\f\7\f\u0098\n\f\f\f\16\f\u009b\13\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00a5\n\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00c0\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00df\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0111"+
		"\n\r\f\r\16\r\u0114\13\r\3\16\3\16\7\16\u0118\n\16\f\16\16\16\u011b\13"+
		"\16\3\16\5\16\u011e\n\16\3\17\3\17\3\17\3\17\2\3\30\20\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\2\2\u0145\2\36\3\2\2\2\4%\3\2\2\2\6+\3\2\2\2\b?"+
		"\3\2\2\2\nB\3\2\2\2\fZ\3\2\2\2\16^\3\2\2\2\20}\3\2\2\2\22\177\3\2\2\2"+
		"\24\u008d\3\2\2\2\26\u00bf\3\2\2\2\30\u00de\3\2\2\2\32\u011d\3\2\2\2\34"+
		"\u011f\3\2\2\2\36\"\5\4\3\2\37!\5\6\4\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2"+
		"\2\"#\3\2\2\2#\3\3\2\2\2$\"\3\2\2\2%&\7\31\2\2&\'\7.\2\2\'(\7 \2\2()\5"+
		"\16\b\2)*\7!\2\2*\5\3\2\2\2+,\7\31\2\2,.\7.\2\2-/\5\b\5\2.-\3\2\2\2./"+
		"\3\2\2\2/\60\3\2\2\2\60\64\7 \2\2\61\63\5\f\7\2\62\61\3\2\2\2\63\66\3"+
		"\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65:\3\2\2\2\66\64\3\2\2\2\679\5\n\6"+
		"\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7!"+
		"\2\2>\7\3\2\2\2?@\7\6\2\2@A\7.\2\2A\t\3\2\2\2BC\7\b\2\2CD\5\24\13\2DE"+
		"\7.\2\2EF\7$\2\2FG\5\20\t\2GH\7%\2\2HL\7 \2\2IK\5\f\7\2JI\3\2\2\2KN\3"+
		"\2\2\2LJ\3\2\2\2LM\3\2\2\2MR\3\2\2\2NL\3\2\2\2OQ\5\26\f\2PO\3\2\2\2QT"+
		"\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\n\2\2VW\5\30\r\2"+
		"WX\7\17\2\2XY\7!\2\2Y\13\3\2\2\2Z[\5\24\13\2[\\\7.\2\2\\]\7\17\2\2]\r"+
		"\3\2\2\2^_\7\3\2\2_`\7$\2\2`a\7\7\2\2ab\7\"\2\2bc\7#\2\2cd\7.\2\2de\7"+
		"%\2\2ei\7 \2\2fh\5\f\7\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jo\3\2"+
		"\2\2ki\3\2\2\2ln\5\26\f\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3"+
		"\2\2\2qo\3\2\2\2rs\7!\2\2s\17\3\2\2\2tu\5\24\13\2uy\7.\2\2vx\5\22\n\2"+
		"wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z~\3\2\2\2{y\3\2\2\2|~\3\2\2\2"+
		"}t\3\2\2\2}|\3\2\2\2~\21\3\2\2\2\177\u0080\7\5\2\2\u0080\u0081\5\24\13"+
		"\2\u0081\u0082\7.\2\2\u0082\23\3\2\2\2\u0083\u0084\7&\2\2\u0084\u0085"+
		"\7\"\2\2\u0085\u008e\7#\2\2\u0086\u0087\7\'\2\2\u0087\u0088\7\"\2\2\u0088"+
		"\u008e\7#\2\2\u0089\u008e\7(\2\2\u008a\u008e\7&\2\2\u008b\u008e\7\'\2"+
		"\2\u008c\u008e\7.\2\2\u008d\u0083\3\2\2\2\u008d\u0086\3\2\2\2\u008d\u0089"+
		"\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008c\3\2\2\2\u008e"+
		"\25\3\2\2\2\u008f\u0093\7 \2\2\u0090\u0092\5\f\7\2\u0091\u0090\3\2\2\2"+
		"\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0099"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\5\26\f\2\u0097\u0096\3\2\2\2"+
		"\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00c0\7!\2\2\u009d\u009e\7\33\2\2\u009e"+
		"\u009f\7$\2\2\u009f\u00a0\5\30\r\2\u00a0\u00a1\7%\2\2\u00a1\u00a4\5\26"+
		"\f\2\u00a2\u00a3\7\34\2\2\u00a3\u00a5\5\26\f\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00c0\3\2\2\2\u00a6\u00a7\7\35\2\2\u00a7\u00a8\7"+
		"$\2\2\u00a8\u00a9\5\30\r\2\u00a9\u00aa\7%\2\2\u00aa\u00ab\5\26\f\2\u00ab"+
		"\u00c0\3\2\2\2\u00ac\u00ad\7\37\2\2\u00ad\u00ae\7$\2\2\u00ae\u00af\5\30"+
		"\r\2\u00af\u00b0\7%\2\2\u00b0\u00b1\7\17\2\2\u00b1\u00c0\3\2\2\2\u00b2"+
		"\u00b3\7.\2\2\u00b3\u00b4\7\13\2\2\u00b4\u00b5\5\30\r\2\u00b5\u00b6\7"+
		"\17\2\2\u00b6\u00c0\3\2\2\2\u00b7\u00b8\7.\2\2\u00b8\u00b9\7\"\2\2\u00b9"+
		"\u00ba\5\30\r\2\u00ba\u00bb\7#\2\2\u00bb\u00bc\7\13\2\2\u00bc\u00bd\5"+
		"\30\r\2\u00bd\u00be\7\17\2\2\u00be\u00c0\3\2\2\2\u00bf\u008f\3\2\2\2\u00bf"+
		"\u009d\3\2\2\2\u00bf\u00a6\3\2\2\2\u00bf\u00ac\3\2\2\2\u00bf\u00b2\3\2"+
		"\2\2\u00bf\u00b7\3\2\2\2\u00c0\27\3\2\2\2\u00c1\u00c2\b\r\1\2\u00c2\u00c3"+
		"\7-\2\2\u00c3\u00df\5\30\r\20\u00c4\u00df\7\60\2\2\u00c5\u00df\7/\2\2"+
		"\u00c6\u00df\7*\2\2\u00c7\u00df\7+\2\2\u00c8\u00df\7.\2\2\u00c9\u00ca"+
		"\7\32\2\2\u00ca\u00cb\7&\2\2\u00cb\u00cc\7\"\2\2\u00cc\u00cd\5\30\r\2"+
		"\u00cd\u00ce\7#\2\2\u00ce\u00df\3\2\2\2\u00cf\u00d0\7\32\2\2\u00d0\u00d1"+
		"\7\'\2\2\u00d1\u00d2\7\"\2\2\u00d2\u00d3\5\30\r\2\u00d3\u00d4\7#\2\2\u00d4"+
		"\u00df\3\2\2\2\u00d5\u00df\7,\2\2\u00d6\u00d7\7\32\2\2\u00d7\u00d8\7."+
		"\2\2\u00d8\u00d9\7$\2\2\u00d9\u00df\7%\2\2\u00da\u00db\7$\2\2\u00db\u00dc"+
		"\5\30\r\2\u00dc\u00dd\7%\2\2\u00dd\u00df\3\2\2\2\u00de\u00c1\3\2\2\2\u00de"+
		"\u00c4\3\2\2\2\u00de\u00c5\3\2\2\2\u00de\u00c6\3\2\2\2\u00de\u00c7\3\2"+
		"\2\2\u00de\u00c8\3\2\2\2\u00de\u00c9\3\2\2\2\u00de\u00cf\3\2\2\2\u00de"+
		"\u00d5\3\2\2\2\u00de\u00d6\3\2\2\2\u00de\u00da\3\2\2\2\u00df\u0112\3\2"+
		"\2\2\u00e0\u00e1\f\16\2\2\u00e1\u00e2\7\27\2\2\u00e2\u0111\5\30\r\17\u00e3"+
		"\u00e4\f\r\2\2\u00e4\u00e5\7\26\2\2\u00e5\u0111\5\30\r\16\u00e6\u00e7"+
		"\f\f\2\2\u00e7\u00e8\7\25\2\2\u00e8\u0111\5\30\r\r\u00e9\u00ea\f\13\2"+
		"\2\u00ea\u00eb\7\23\2\2\u00eb\u0111\5\30\r\f\u00ec\u00ed\f\n\2\2\u00ed"+
		"\u00ee\7\21\2\2\u00ee\u0111\5\30\r\13\u00ef\u00f0\f\t\2\2\u00f0\u00f1"+
		"\7\24\2\2\u00f1\u0111\5\30\r\n\u00f2\u00f3\f\b\2\2\u00f3\u00f4\7\22\2"+
		"\2\u00f4\u0111\5\30\r\t\u00f5\u00f6\f\7\2\2\u00f6\u00f7\7\r\2\2\u00f7"+
		"\u0111\5\30\r\b\u00f8\u00f9\f\6\2\2\u00f9\u00fa\7\16\2\2\u00fa\u0111\5"+
		"\30\r\7\u00fb\u00fc\f\5\2\2\u00fc\u00fd\7\20\2\2\u00fd\u0111\5\30\r\6"+
		"\u00fe\u00ff\f\4\2\2\u00ff\u0100\7\f\2\2\u0100\u0111\5\30\r\5\u0101\u0102"+
		"\f\24\2\2\u0102\u0103\7\"\2\2\u0103\u0104\5\30\r\2\u0104\u0105\7#\2\2"+
		"\u0105\u0111\3\2\2\2\u0106\u0107\f\23\2\2\u0107\u0108\7\30\2\2\u0108\u0109"+
		"\7.\2\2\u0109\u010a\7$\2\2\u010a\u010b\5\32\16\2\u010b\u010c\7%\2\2\u010c"+
		"\u0111\3\2\2\2\u010d\u010e\f\22\2\2\u010e\u010f\7\30\2\2\u010f\u0111\7"+
		"\4\2\2\u0110\u00e0\3\2\2\2\u0110\u00e3\3\2\2\2\u0110\u00e6\3\2\2\2\u0110"+
		"\u00e9\3\2\2\2\u0110\u00ec\3\2\2\2\u0110\u00ef\3\2\2\2\u0110\u00f2\3\2"+
		"\2\2\u0110\u00f5\3\2\2\2\u0110\u00f8\3\2\2\2\u0110\u00fb\3\2\2\2\u0110"+
		"\u00fe\3\2\2\2\u0110\u0101\3\2\2\2\u0110\u0106\3\2\2\2\u0110\u010d\3\2"+
		"\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\31\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0119\5\30\r\2\u0116\u0118\5\34"+
		"\17\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011e\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011e\3\2"+
		"\2\2\u011d\u0115\3\2\2\2\u011d\u011c\3\2\2\2\u011e\33\3\2\2\2\u011f\u0120"+
		"\7\5\2\2\u0120\u0121\5\30\r\2\u0121\35\3\2\2\2\26\".\64:LRioy}\u008d\u0093"+
		"\u0099\u00a4\u00bf\u00de\u0110\u0112\u0119\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}