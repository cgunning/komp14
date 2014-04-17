// Generated from ./src/main/java/se/cgunning/java/Java.g4 by ANTLR 4.2

  package se.cgunning.java;

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
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, PUBLIC=7, STATIC=8, ASSIGN=9, 
		OR=10, EQUALS=11, NOTEQUALS=12, END=13, AND=14, LESSTANOREQ=15, GREATERTHANOREQ=16, 
		LESSTHAN=17, GREATERTHAN=18, ADD=19, SUB=20, PROD=21, DOT=22, CLASS=23, 
		NEW=24, IF=25, ELSE=26, WHILE=27, FOR=28, SOUT=29, LCURL=30, RCURL=31, 
		LBRACK=32, RBRACK=33, LPAR=34, RPAR=35, INT=36, LONG=37, BOOLEAN=38, VOID=39, 
		TRUE=40, FALSE=41, THIS=42, NOT=43, PACKAGE=44, ID=45, CLASSID=46, LONG_LIT=47, 
		INT_LIT=48, WS=49;
	public static final String[] tokenNames = {
		"<INVALID>", "'package'", "'length'", "','", "'main'", "'return'", "'String'", 
		"'public'", "'static'", "'='", "'||'", "'=='", "'!='", "';'", "'&&'", 
		"'<='", "'>='", "'<'", "'>'", "'+'", "'-'", "'*'", "'.'", "'class'", "'new'", 
		"'if'", "'else'", "'while'", "'for'", "'System.out.println'", "'{'", "'}'", 
		"'['", "']'", "'('", "')'", "'int'", "'long'", "'boolean'", "'void'", 
		"'true'", "'false'", "'this'", "'!'", "PACKAGE", "ID", "CLASSID", "LONG_LIT", 
		"INT_LIT", "WS"
	};
	public static final int
		RULE_program = 0, RULE_packageDecl = 1, RULE_mainClass = 2, RULE_classDecl = 3, 
		RULE_methodDecl = 4, RULE_varDecl = 5, RULE_formalList = 6, RULE_formalRest = 7, 
		RULE_type = 8, RULE_stmt = 9, RULE_exp = 10, RULE_op = 11, RULE_expList = 12, 
		RULE_expRest = 13;
	public static final String[] ruleNames = {
		"program", "packageDecl", "mainClass", "classDecl", "methodDecl", "varDecl", 
		"formalList", "formalRest", "type", "stmt", "exp", "op", "expList", "expRest"
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
		public PackageDeclContext packageDecl() {
			return getRuleContext(PackageDeclContext.class,0);
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
			setState(29);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(28); packageDecl();
				}
				break;
			}
			setState(31); mainClass();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(32); classDecl();
				}
				}
				setState(37);
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

	public static class PackageDeclContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(JavaParser.PACKAGE, 0); }
		public TerminalNode END() { return getToken(JavaParser.END, 0); }
		public PackageDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDecl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitPackageDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDeclContext packageDecl() throws RecognitionException {
		PackageDeclContext _localctx = new PackageDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDecl);
		try {
			setState(42);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); match(1);
				setState(39); match(PACKAGE);
				setState(40); match(END);
				}
				break;
			case CLASS:
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

	public static class MainClassContext extends ParserRuleContext {
		public TerminalNode RBRACK() { return getToken(JavaParser.RBRACK, 0); }
		public TerminalNode LPAR() { return getToken(JavaParser.LPAR, 0); }
		public TerminalNode RCURL(int i) {
			return getToken(JavaParser.RCURL, i);
		}
		public TerminalNode ID() { return getToken(JavaParser.ID, 0); }
		public TerminalNode VOID() { return getToken(JavaParser.VOID, 0); }
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<TerminalNode> LCURL() { return getTokens(JavaParser.LCURL); }
		public List<TerminalNode> RCURL() { return getTokens(JavaParser.RCURL); }
		public TerminalNode CLASS() { return getToken(JavaParser.CLASS, 0); }
		public TerminalNode LBRACK() { return getToken(JavaParser.LBRACK, 0); }
		public TerminalNode PUBLIC() { return getToken(JavaParser.PUBLIC, 0); }
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(JavaParser.RPAR, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public TerminalNode CLASSID() { return getToken(JavaParser.CLASSID, 0); }
		public TerminalNode STATIC() { return getToken(JavaParser.STATIC, 0); }
		public TerminalNode LCURL(int i) {
			return getToken(JavaParser.LCURL, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
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
		enterRule(_localctx, 4, RULE_mainClass);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44); match(CLASS);
			setState(45); match(CLASSID);
			setState(46); match(LCURL);
			setState(47); match(PUBLIC);
			setState(48); match(STATIC);
			setState(49); match(VOID);
			setState(50); match(4);
			setState(51); match(LPAR);
			setState(52); match(6);
			setState(53); match(LBRACK);
			setState(54); match(RBRACK);
			setState(55); match(ID);
			setState(56); match(RPAR);
			setState(57); match(LCURL);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(58); varDecl();
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SOUT) | (1L << LCURL) | (1L << ID))) != 0)) {
				{
				{
				setState(64); stmt();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70); match(RCURL);
			setState(71); match(RCURL);
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
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public TerminalNode CLASSID() { return getToken(JavaParser.CLASSID, 0); }
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
		enterRule(_localctx, 6, RULE_classDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73); match(CLASS);
			setState(74); match(CLASSID);
			setState(75); match(LCURL);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << LONG) | (1L << BOOLEAN) | (1L << ID))) != 0)) {
				{
				{
				setState(76); varDecl();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUBLIC) {
				{
				{
				setState(82); methodDecl();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88); match(RCURL);
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
			setState(90); match(PUBLIC);
			setState(91); type();
			setState(92); match(ID);
			setState(93); match(LPAR);
			setState(94); formalList();
			setState(95); match(RPAR);
			setState(96); match(LCURL);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(97); varDecl();
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SOUT) | (1L << LCURL) | (1L << ID))) != 0)) {
				{
				{
				setState(103); stmt();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109); match(5);
			setState(110); exp(0);
			setState(111); match(END);
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
			setState(114); type();
			setState(115); match(ID);
			setState(116); match(END);
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
		enterRule(_localctx, 12, RULE_formalList);
		int _la;
		try {
			setState(127);
			switch (_input.LA(1)) {
			case INT:
			case LONG:
			case BOOLEAN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); type();
				setState(119); match(ID);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(120); formalRest();
					}
					}
					setState(125);
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
		enterRule(_localctx, 14, RULE_formalRest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(3);
			setState(130); type();
			setState(131); match(ID);
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
		enterRule(_localctx, 16, RULE_type);
		try {
			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); match(INT);
				setState(134); match(LBRACK);
				setState(135); match(RBRACK);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); match(LONG);
				setState(137); match(LBRACK);
				setState(138); match(RBRACK);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139); match(BOOLEAN);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140); match(INT);
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(141); match(LONG);
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(142); match(ID);
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
		enterRule(_localctx, 18, RULE_stmt);
		int _la;
		try {
			int _alt;
			setState(192);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145); match(LCURL);
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(146); varDecl();
						}
						} 
					}
					setState(151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SOUT) | (1L << LCURL) | (1L << ID))) != 0)) {
					{
					{
					setState(152); stmt();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158); match(RCURL);
				}
				break;

			case 2:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159); match(IF);
				setState(160); match(LPAR);
				setState(161); exp(0);
				setState(162); match(RPAR);
				setState(163); stmt();
				setState(164); match(ELSE);
				setState(165); stmt();
				}
				break;

			case 3:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167); match(WHILE);
				setState(168); match(LPAR);
				setState(169); exp(0);
				setState(170); match(RPAR);
				setState(171); stmt();
				}
				break;

			case 4:
				_localctx = new SoutContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(173); match(SOUT);
				setState(174); match(LPAR);
				setState(175); exp(0);
				setState(176); match(RPAR);
				setState(177); match(END);
				}
				break;

			case 5:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(179); match(ID);
				setState(180); match(ASSIGN);
				setState(181); exp(0);
				setState(182); match(END);
				}
				break;

			case 6:
				_localctx = new ArrAssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(184); match(ID);
				setState(185); match(LBRACK);
				setState(186); exp(0);
				setState(187); match(RBRACK);
				setState(188); match(ASSIGN);
				setState(189); exp(0);
				setState(190); match(END);
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
		public TerminalNode LPAR() { return getToken(JavaParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(JavaParser.RPAR, 0); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(195); match(NOT);
				setState(196); exp(14);
				}
				break;

			case 2:
				{
				_localctx = new IntLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197); match(INT_LIT);
				}
				break;

			case 3:
				{
				_localctx = new LongLitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198); match(LONG_LIT);
				}
				break;

			case 4:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199); match(TRUE);
				}
				break;

			case 5:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200); match(FALSE);
				}
				break;

			case 6:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201); match(ID);
				}
				break;

			case 7:
				{
				_localctx = new ThisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202); match(THIS);
				}
				break;

			case 8:
				{
				_localctx = new NewIntArrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203); match(NEW);
				setState(204); match(INT);
				setState(205); match(LBRACK);
				setState(206); exp(0);
				setState(207); match(RBRACK);
				}
				break;

			case 9:
				{
				_localctx = new NewLongArrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209); match(NEW);
				setState(210); match(LONG);
				setState(211); match(LBRACK);
				setState(212); exp(0);
				setState(213); match(RBRACK);
				}
				break;

			case 10:
				{
				_localctx = new NewObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215); match(NEW);
				setState(216); match(ID);
				setState(217); match(LPAR);
				setState(218); match(RPAR);
				}
				break;

			case 11:
				{
				_localctx = new ParExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219); match(LPAR);
				setState(220); exp(0);
				setState(221); match(RPAR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(275);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(273);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ProdContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(225);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(226); match(PROD);
						setState(227); exp(13);
						}
						break;

					case 2:
						{
						_localctx = new SubContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(228);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(229); match(SUB);
						setState(230); exp(12);
						}
						break;

					case 3:
						{
						_localctx = new AddContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(231);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(232); match(ADD);
						setState(233); exp(11);
						}
						break;

					case 4:
						{
						_localctx = new LessThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(234);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(235); match(LESSTHAN);
						setState(236); exp(10);
						}
						break;

					case 5:
						{
						_localctx = new LessThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(237);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(238); match(LESSTANOREQ);
						setState(239); exp(9);
						}
						break;

					case 6:
						{
						_localctx = new GreaterThanContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(240);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(241); match(GREATERTHAN);
						setState(242); exp(8);
						}
						break;

					case 7:
						{
						_localctx = new GreaterThanOrEqualContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(243);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(244); match(GREATERTHANOREQ);
						setState(245); exp(7);
						}
						break;

					case 8:
						{
						_localctx = new EqualsContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(246);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(247); match(EQUALS);
						setState(248); exp(6);
						}
						break;

					case 9:
						{
						_localctx = new NotEqualsContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(249);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(250); match(NOTEQUALS);
						setState(251); exp(5);
						}
						break;

					case 10:
						{
						_localctx = new AndContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(252);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(253); match(AND);
						setState(254); exp(4);
						}
						break;

					case 11:
						{
						_localctx = new OrContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(255);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(256); match(OR);
						setState(257); exp(3);
						}
						break;

					case 12:
						{
						_localctx = new ArrAccessContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(258);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(259); match(LBRACK);
						setState(260); exp(0);
						setState(261); match(RBRACK);
						}
						break;

					case 13:
						{
						_localctx = new MethodCallContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(263);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(264); match(DOT);
						setState(265); match(ID);
						setState(266); match(RPAR);
						setState(267); expList();
						setState(268); match(LPAR);
						}
						break;

					case 14:
						{
						_localctx = new DotLengthContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(270);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(271); match(DOT);
						setState(272); match(2);
						}
						break;
					}
					} 
				}
				setState(277);
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

	public static class OpContext extends ParserRuleContext {
		public TerminalNode LESSTHAN() { return getToken(JavaParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(JavaParser.GREATERTHAN, 0); }
		public TerminalNode EQUALS() { return getToken(JavaParser.EQUALS, 0); }
		public TerminalNode LESSTANOREQ() { return getToken(JavaParser.LESSTANOREQ, 0); }
		public TerminalNode AND() { return getToken(JavaParser.AND, 0); }
		public TerminalNode OR() { return getToken(JavaParser.OR, 0); }
		public TerminalNode PROD() { return getToken(JavaParser.PROD, 0); }
		public TerminalNode NOTEQUALS() { return getToken(JavaParser.NOTEQUALS, 0); }
		public TerminalNode GREATERTHANOREQ() { return getToken(JavaParser.GREATERTHANOREQ, 0); }
		public TerminalNode SUB() { return getToken(JavaParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(JavaParser.ADD, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JavaVisitor ) return ((JavaVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << EQUALS) | (1L << NOTEQUALS) | (1L << AND) | (1L << LESSTANOREQ) | (1L << GREATERTHANOREQ) | (1L << LESSTHAN) | (1L << GREATERTHAN) | (1L << ADD) | (1L << SUB) | (1L << PROD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
			setState(288);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280); exp(0);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(281); expRest();
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
			setState(290); match(3);
			setState(291); exp(0);
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
		case 10: return exp_sempred((ExpContext)_localctx, predIndex);
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

		case 11: return precpred(_ctx, 17);

		case 12: return precpred(_ctx, 16);

		case 13: return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u0128\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2 \n\2\3\2\3\2\7\2$\n"+
		"\2\f\2\16\2\'\13\2\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\4\7\4D\n"+
		"\4\f\4\16\4G\13\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5P\n\5\f\5\16\5S\13\5"+
		"\3\5\7\5V\n\5\f\5\16\5Y\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6e\n\6\f\6\16\6h\13\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\b|\n\b\f\b\16\b\177\13\b\3\b\5\b\u0082"+
		"\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0092"+
		"\n\n\3\13\3\13\7\13\u0096\n\13\f\13\16\13\u0099\13\13\3\13\7\13\u009c"+
		"\n\13\f\13\16\13\u009f\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c3"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e2\n\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0114\n\f\f\f\16"+
		"\f\u0117\13\f\3\r\3\r\3\16\3\16\7\16\u011d\n\16\f\16\16\16\u0120\13\16"+
		"\3\16\5\16\u0123\n\16\3\17\3\17\3\17\3\17\2\3\26\20\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\2\3\4\2\f\16\20\27\u014a\2\37\3\2\2\2\4,\3\2\2\2\6"+
		".\3\2\2\2\bK\3\2\2\2\n\\\3\2\2\2\ft\3\2\2\2\16\u0081\3\2\2\2\20\u0083"+
		"\3\2\2\2\22\u0091\3\2\2\2\24\u00c2\3\2\2\2\26\u00e1\3\2\2\2\30\u0118\3"+
		"\2\2\2\32\u0122\3\2\2\2\34\u0124\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2\37"+
		" \3\2\2\2 !\3\2\2\2!%\5\6\4\2\"$\5\b\5\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2"+
		"\2%&\3\2\2\2&\3\3\2\2\2\'%\3\2\2\2()\7\3\2\2)*\7.\2\2*-\7\17\2\2+-\3\2"+
		"\2\2,(\3\2\2\2,+\3\2\2\2-\5\3\2\2\2./\7\31\2\2/\60\7\60\2\2\60\61\7 \2"+
		"\2\61\62\7\t\2\2\62\63\7\n\2\2\63\64\7)\2\2\64\65\7\6\2\2\65\66\7$\2\2"+
		"\66\67\7\b\2\2\678\7\"\2\289\7#\2\29:\7/\2\2:;\7%\2\2;?\7 \2\2<>\5\f\7"+
		"\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2A?\3\2\2\2BD\5\24"+
		"\13\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7"+
		"!\2\2IJ\7!\2\2J\7\3\2\2\2KL\7\31\2\2LM\7\60\2\2MQ\7 \2\2NP\5\f\7\2ON\3"+
		"\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RW\3\2\2\2SQ\3\2\2\2TV\5\n\6\2UT\3"+
		"\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YW\3\2\2\2Z[\7!\2\2[\t\3"+
		"\2\2\2\\]\7\t\2\2]^\5\22\n\2^_\7/\2\2_`\7$\2\2`a\5\16\b\2ab\7%\2\2bf\7"+
		" \2\2ce\5\f\7\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gl\3\2\2\2hf\3"+
		"\2\2\2ik\5\24\13\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2n"+
		"l\3\2\2\2op\7\7\2\2pq\5\26\f\2qr\7\17\2\2rs\7!\2\2s\13\3\2\2\2tu\5\22"+
		"\n\2uv\7/\2\2vw\7\17\2\2w\r\3\2\2\2xy\5\22\n\2y}\7/\2\2z|\5\20\t\2{z\3"+
		"\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0082\3\2\2\2\177}\3\2\2\2\u0080"+
		"\u0082\3\2\2\2\u0081x\3\2\2\2\u0081\u0080\3\2\2\2\u0082\17\3\2\2\2\u0083"+
		"\u0084\7\5\2\2\u0084\u0085\5\22\n\2\u0085\u0086\7/\2\2\u0086\21\3\2\2"+
		"\2\u0087\u0088\7&\2\2\u0088\u0089\7\"\2\2\u0089\u0092\7#\2\2\u008a\u008b"+
		"\7\'\2\2\u008b\u008c\7\"\2\2\u008c\u0092\7#\2\2\u008d\u0092\7(\2\2\u008e"+
		"\u0092\7&\2\2\u008f\u0092\7\'\2\2\u0090\u0092\7/\2\2\u0091\u0087\3\2\2"+
		"\2\u0091\u008a\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\u0091\u0090\3\2\2\2\u0092\23\3\2\2\2\u0093\u0097\7 \2\2\u0094"+
		"\u0096\5\f\7\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u009d\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009c\5\24\13\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\u00c3\7!\2\2\u00a1\u00a2\7\33\2\2\u00a2\u00a3\7$\2\2\u00a3\u00a4\5\26"+
		"\f\2\u00a4\u00a5\7%\2\2\u00a5\u00a6\5\24\13\2\u00a6\u00a7\7\34\2\2\u00a7"+
		"\u00a8\5\24\13\2\u00a8\u00c3\3\2\2\2\u00a9\u00aa\7\35\2\2\u00aa\u00ab"+
		"\7$\2\2\u00ab\u00ac\5\26\f\2\u00ac\u00ad\7%\2\2\u00ad\u00ae\5\24\13\2"+
		"\u00ae\u00c3\3\2\2\2\u00af\u00b0\7\37\2\2\u00b0\u00b1\7$\2\2\u00b1\u00b2"+
		"\5\26\f\2\u00b2\u00b3\7%\2\2\u00b3\u00b4\7\17\2\2\u00b4\u00c3\3\2\2\2"+
		"\u00b5\u00b6\7/\2\2\u00b6\u00b7\7\13\2\2\u00b7\u00b8\5\26\f\2\u00b8\u00b9"+
		"\7\17\2\2\u00b9\u00c3\3\2\2\2\u00ba\u00bb\7/\2\2\u00bb\u00bc\7\"\2\2\u00bc"+
		"\u00bd\5\26\f\2\u00bd\u00be\7#\2\2\u00be\u00bf\7\13\2\2\u00bf\u00c0\5"+
		"\26\f\2\u00c0\u00c1\7\17\2\2\u00c1\u00c3\3\2\2\2\u00c2\u0093\3\2\2\2\u00c2"+
		"\u00a1\3\2\2\2\u00c2\u00a9\3\2\2\2\u00c2\u00af\3\2\2\2\u00c2\u00b5\3\2"+
		"\2\2\u00c2\u00ba\3\2\2\2\u00c3\25\3\2\2\2\u00c4\u00c5\b\f\1\2\u00c5\u00c6"+
		"\7-\2\2\u00c6\u00e2\5\26\f\20\u00c7\u00e2\7\62\2\2\u00c8\u00e2\7\61\2"+
		"\2\u00c9\u00e2\7*\2\2\u00ca\u00e2\7+\2\2\u00cb\u00e2\7/\2\2\u00cc\u00e2"+
		"\7,\2\2\u00cd\u00ce\7\32\2\2\u00ce\u00cf\7&\2\2\u00cf\u00d0\7\"\2\2\u00d0"+
		"\u00d1\5\26\f\2\u00d1\u00d2\7#\2\2\u00d2\u00e2\3\2\2\2\u00d3\u00d4\7\32"+
		"\2\2\u00d4\u00d5\7\'\2\2\u00d5\u00d6\7\"\2\2\u00d6\u00d7\5\26\f\2\u00d7"+
		"\u00d8\7#\2\2\u00d8\u00e2\3\2\2\2\u00d9\u00da\7\32\2\2\u00da\u00db\7/"+
		"\2\2\u00db\u00dc\7$\2\2\u00dc\u00e2\7%\2\2\u00dd\u00de\7$\2\2\u00de\u00df"+
		"\5\26\f\2\u00df\u00e0\7%\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00c4\3\2\2\2\u00e1"+
		"\u00c7\3\2\2\2\u00e1\u00c8\3\2\2\2\u00e1\u00c9\3\2\2\2\u00e1\u00ca\3\2"+
		"\2\2\u00e1\u00cb\3\2\2\2\u00e1\u00cc\3\2\2\2\u00e1\u00cd\3\2\2\2\u00e1"+
		"\u00d3\3\2\2\2\u00e1\u00d9\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2\u0115\3\2"+
		"\2\2\u00e3\u00e4\f\16\2\2\u00e4\u00e5\7\27\2\2\u00e5\u0114\5\26\f\17\u00e6"+
		"\u00e7\f\r\2\2\u00e7\u00e8\7\26\2\2\u00e8\u0114\5\26\f\16\u00e9\u00ea"+
		"\f\f\2\2\u00ea\u00eb\7\25\2\2\u00eb\u0114\5\26\f\r\u00ec\u00ed\f\13\2"+
		"\2\u00ed\u00ee\7\23\2\2\u00ee\u0114\5\26\f\f\u00ef\u00f0\f\n\2\2\u00f0"+
		"\u00f1\7\21\2\2\u00f1\u0114\5\26\f\13\u00f2\u00f3\f\t\2\2\u00f3\u00f4"+
		"\7\24\2\2\u00f4\u0114\5\26\f\n\u00f5\u00f6\f\b\2\2\u00f6\u00f7\7\22\2"+
		"\2\u00f7\u0114\5\26\f\t\u00f8\u00f9\f\7\2\2\u00f9\u00fa\7\r\2\2\u00fa"+
		"\u0114\5\26\f\b\u00fb\u00fc\f\6\2\2\u00fc\u00fd\7\16\2\2\u00fd\u0114\5"+
		"\26\f\7\u00fe\u00ff\f\5\2\2\u00ff\u0100\7\20\2\2\u0100\u0114\5\26\f\6"+
		"\u0101\u0102\f\4\2\2\u0102\u0103\7\f\2\2\u0103\u0114\5\26\f\5\u0104\u0105"+
		"\f\23\2\2\u0105\u0106\7\"\2\2\u0106\u0107\5\26\f\2\u0107\u0108\7#\2\2"+
		"\u0108\u0114\3\2\2\2\u0109\u010a\f\22\2\2\u010a\u010b\7\30\2\2\u010b\u010c"+
		"\7/\2\2\u010c\u010d\7%\2\2\u010d\u010e\5\32\16\2\u010e\u010f\7$\2\2\u010f"+
		"\u0114\3\2\2\2\u0110\u0111\f\21\2\2\u0111\u0112\7\30\2\2\u0112\u0114\7"+
		"\4\2\2\u0113\u00e3\3\2\2\2\u0113\u00e6\3\2\2\2\u0113\u00e9\3\2\2\2\u0113"+
		"\u00ec\3\2\2\2\u0113\u00ef\3\2\2\2\u0113\u00f2\3\2\2\2\u0113\u00f5\3\2"+
		"\2\2\u0113\u00f8\3\2\2\2\u0113\u00fb\3\2\2\2\u0113\u00fe\3\2\2\2\u0113"+
		"\u0101\3\2\2\2\u0113\u0104\3\2\2\2\u0113\u0109\3\2\2\2\u0113\u0110\3\2"+
		"\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\27\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0119\t\2\2\2\u0119\31\3\2\2\2\u011a"+
		"\u011e\5\26\f\2\u011b\u011d\5\34\17\2\u011c\u011b\3\2\2\2\u011d\u0120"+
		"\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0123\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u011a\3\2\2\2\u0122\u0121\3\2"+
		"\2\2\u0123\33\3\2\2\2\u0124\u0125\7\5\2\2\u0125\u0126\5\26\f\2\u0126\35"+
		"\3\2\2\2\26\37%,?EQWfl}\u0081\u0091\u0097\u009d\u00c2\u00e1\u0113\u0115"+
		"\u011e\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}