// Generated from D:/tk_01/IDEA project location/SimpleLanguage/src/main/java/org/example/antlr\WS.g4 by ANTLR 4.9.1
package org.example.main.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WangShun=1, Out=2, AssignDef=3, ClassDef=4, Identifier=5, Bool=6, Number=7, 
		String=8, Comment=9, Space=10, Println=11, Print=12, Input=13, Assert=14, 
		Size=15, Def=16, If=17, Else=18, Return=19, For=20, While=21, To=22, Do=23, 
		End=24, In=25, Null=26, Or=27, And=28, Equals=29, NEquals=30, GTEquals=31, 
		LTEquals=32, Pow=33, Excl=34, GT=35, LT=36, Add=37, Subtract=38, Multiply=39, 
		Divide=40, Modulus=41, OBrace=42, CBrace=43, OBracket=44, CBracket=45, 
		OParen=46, CParen=47, SColon=48, Assign=49, Comma=50, QMark=51, Colon=52;
	public static final int
		RULE_parse = 0, RULE_wsClass = 1, RULE_block = 2, RULE_statement = 3, 
		RULE_assignment = 4, RULE_functionCall = 5, RULE_expression = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "wsClass", "block", "statement", "assignment", "functionCall", 
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'WangShun'", "'out'", "'$:'", "'@:'", null, null, null, null, 
			null, null, "'println'", "'print'", "'input'", "'assert'", "'size'", 
			"'def'", "'if'", "'else'", "'return'", "'for'", "'while'", "'to'", "'do'", 
			"'end'", "'in'", "'null'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", 
			"'^'", "'!'", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'{'", 
			"'}'", "'['", "']'", "'('", "')'", "';'", "'='", "','", "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WangShun", "Out", "AssignDef", "ClassDef", "Identifier", "Bool", 
			"Number", "String", "Comment", "Space", "Println", "Print", "Input", 
			"Assert", "Size", "Def", "If", "Else", "Return", "For", "While", "To", 
			"Do", "End", "In", "Null", "Or", "And", "Equals", "NEquals", "GTEquals", 
			"LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", 
			"Divide", "Modulus", "OBrace", "CBrace", "OBracket", "CBracket", "OParen", 
			"CParen", "SColon", "Assign", "Comma", "QMark", "Colon"
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
	public String getGrammarFileName() { return "WS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public WsClassContext wsClass() {
			return getRuleContext(WsClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(WSParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSVisitor ) return ((WSVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			wsClass();
			setState(15);
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

	public static class WsClassContext extends ParserRuleContext {
		public TerminalNode ClassDef() { return getToken(WSParser.ClassDef, 0); }
		public TerminalNode Identifier() { return getToken(WSParser.Identifier, 0); }
		public TerminalNode OBrace() { return getToken(WSParser.OBrace, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode CBrace() { return getToken(WSParser.CBrace, 0); }
		public WsClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wsClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).enterWsClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).exitWsClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSVisitor ) return ((WSVisitor<? extends T>)visitor).visitWsClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsClassContext wsClass() throws RecognitionException {
		WsClassContext _localctx = new WsClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_wsClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(ClassDef);
			setState(18);
			match(Identifier);
			setState(19);
			match(OBrace);
			setState(20);
			block();
			setState(21);
			match(CBrace);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSVisitor ) return ((WSVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WangShun) | (1L << Out) | (1L << AssignDef))) != 0)) {
				{
				{
				setState(23);
				statement();
				}
				}
				setState(28);
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SColon() { return getToken(WSParser.SColon, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSVisitor ) return ((WSVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AssignDef:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				assignment();
				setState(30);
				match(SColon);
				}
				break;
			case WangShun:
			case Out:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				functionCall();
				setState(33);
				match(SColon);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode AssignDef() { return getToken(WSParser.AssignDef, 0); }
		public TerminalNode Identifier() { return getToken(WSParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(WSParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSVisitor ) return ((WSVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(AssignDef);
			setState(38);
			match(Identifier);
			setState(39);
			match(Assign);
			setState(40);
			expression(0);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WsFunctionCallContext extends FunctionCallContext {
		public TerminalNode WangShun() { return getToken(WSParser.WangShun, 0); }
		public TerminalNode OParen() { return getToken(WSParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(WSParser.CParen, 0); }
		public WsFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).enterWsFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).exitWsFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSVisitor ) return ((WSVisitor<? extends T>)visitor).visitWsFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintFunctionCallContext extends FunctionCallContext {
		public TerminalNode Out() { return getToken(WSParser.Out, 0); }
		public TerminalNode OParen() { return getToken(WSParser.OParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CParen() { return getToken(WSParser.CParen, 0); }
		public PrintFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).enterPrintFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).exitPrintFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSVisitor ) return ((WSVisitor<? extends T>)visitor).visitPrintFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionCall);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Out:
				_localctx = new PrintFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(Out);
				setState(43);
				match(OParen);
				setState(44);
				expression(0);
				setState(45);
				match(CParen);
				}
				break;
			case WangShun:
				_localctx = new WsFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(WangShun);
				setState(48);
				match(OParen);
				setState(49);
				expression(0);
				setState(50);
				match(CParen);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryMinusExpressionContext extends ExpressionContext {
		public TerminalNode Subtract() { return getToken(WSParser.Subtract, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).enterUnaryMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).exitUnaryMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSVisitor ) return ((WSVisitor<? extends T>)visitor).visitUnaryMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Pow() { return getToken(WSParser.Pow, 0); }
		public PowerExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).enterPowerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).exitPowerExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSVisitor ) return ((WSVisitor<? extends T>)visitor).visitPowerExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringExpressionContext extends ExpressionContext {
		public TerminalNode String() { return getToken(WSParser.String, 0); }
		public StringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).enterStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).exitStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSVisitor ) return ((WSVisitor<? extends T>)visitor).visitStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolExpressionContext extends ExpressionContext {
		public TerminalNode Bool() { return getToken(WSParser.Bool, 0); }
		public BoolExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).enterBoolExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).exitBoolExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSVisitor ) return ((WSVisitor<? extends T>)visitor).visitBoolExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Add() { return getToken(WSParser.Add, 0); }
		public TerminalNode Subtract() { return getToken(WSParser.Subtract, 0); }
		public AddExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSVisitor ) return ((WSVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public TerminalNode Number() { return getToken(WSParser.Number, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSVisitor ) return ((WSVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(WSParser.Identifier, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSVisitor ) return ((WSVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExpressionContext extends ExpressionContext {
		public Token op;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(WSParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(WSParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(WSParser.Modulus, 0); }
		public MultExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).enterMultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).exitMultExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSVisitor ) return ((WSVisitor<? extends T>)visitor).visitMultExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode Excl() { return getToken(WSParser.Excl, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WSListener ) ((WSListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WSVisitor ) return ((WSVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Subtract:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(55);
				match(Subtract);
				setState(56);
				expression(9);
				}
				break;
			case Excl:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(Excl);
				setState(58);
				expression(8);
				}
				break;
			case Number:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				match(Number);
				}
				break;
			case Bool:
				{
				_localctx = new BoolExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(Bool);
				}
				break;
			case String:
				{
				_localctx = new StringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(String);
				}
				break;
			case Identifier:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(74);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new PowerExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(65);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(66);
						match(Pow);
						setState(67);
						expression(7);
						}
						break;
					case 2:
						{
						_localctx = new MultExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(68);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(69);
						((MultExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
							((MultExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(70);
						expression(7);
						}
						break;
					case 3:
						{
						_localctx = new AddExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(71);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(72);
						((AddExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Subtract) ) {
							((AddExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(73);
						expression(6);
						}
						break;
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66R\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\7\4\33\n\4\f\4\16\4\36\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5&"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\67"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bB\n\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\7\bM\n\b\f\b\16\bP\13\b\3\b\2\3\16\t\2\4\6\b\n\f\16\2"+
		"\4\3\2)+\3\2\'(\2U\2\20\3\2\2\2\4\23\3\2\2\2\6\34\3\2\2\2\b%\3\2\2\2\n"+
		"\'\3\2\2\2\f\66\3\2\2\2\16A\3\2\2\2\20\21\5\4\3\2\21\22\7\2\2\3\22\3\3"+
		"\2\2\2\23\24\7\6\2\2\24\25\7\7\2\2\25\26\7,\2\2\26\27\5\6\4\2\27\30\7"+
		"-\2\2\30\5\3\2\2\2\31\33\5\b\5\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2"+
		"\2\2\34\35\3\2\2\2\35\7\3\2\2\2\36\34\3\2\2\2\37 \5\n\6\2 !\7\62\2\2!"+
		"&\3\2\2\2\"#\5\f\7\2#$\7\62\2\2$&\3\2\2\2%\37\3\2\2\2%\"\3\2\2\2&\t\3"+
		"\2\2\2\'(\7\5\2\2()\7\7\2\2)*\7\63\2\2*+\5\16\b\2+\13\3\2\2\2,-\7\4\2"+
		"\2-.\7\60\2\2./\5\16\b\2/\60\7\61\2\2\60\67\3\2\2\2\61\62\7\3\2\2\62\63"+
		"\7\60\2\2\63\64\5\16\b\2\64\65\7\61\2\2\65\67\3\2\2\2\66,\3\2\2\2\66\61"+
		"\3\2\2\2\67\r\3\2\2\289\b\b\1\29:\7(\2\2:B\5\16\b\13;<\7$\2\2<B\5\16\b"+
		"\n=B\7\t\2\2>B\7\b\2\2?B\7\n\2\2@B\7\7\2\2A8\3\2\2\2A;\3\2\2\2A=\3\2\2"+
		"\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2BN\3\2\2\2CD\f\t\2\2DE\7#\2\2EM\5\16\b"+
		"\tFG\f\b\2\2GH\t\2\2\2HM\5\16\b\tIJ\f\7\2\2JK\t\3\2\2KM\5\16\b\bLC\3\2"+
		"\2\2LF\3\2\2\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\17\3\2\2\2PN\3"+
		"\2\2\2\b\34%\66ALN";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}