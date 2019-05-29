// Generated from /home/ahmed/IdeaProjects/Cool/src/Cool.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEGATE=1, WHILE=2, FALSE=3, AT=4, CASE=5, CLASS=6, COLON=7, COMMA=8, DIVIDE=9, 
		MUL=10, DOT=11, ELSE=12, STRING=13, EQUALS=14, ESAC=15, NEW=16, FI=17, 
		NOT=18, TRUE=19, OF=20, POOL=21, IF=22, IN=23, INHERITS=24, INTEGER=25, 
		ISVOID=26, LBRACE=27, LE=28, LET=29, LARROW=30, LOOP=31, LPAREN=32, LT=33, 
		MINUS=34, RARROW=35, RBRACE=36, RPAREN=37, SEMI=38, THEN=39, TILDE=40, 
		TIMES=41, ID=42, LETTER=43, DIGIT=44, UNDERSCORE=45, PLUS=46, WS=47, ERRORCHARACTER=48;
	public static final int
		RULE_program = 0, RULE_cls = 1, RULE_stmt = 2, RULE_param = 3, RULE_st = 4, 
		RULE_expr = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "cls", "stmt", "param", "st", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'~'", null, null, "'@'", null, null, "':'", "','", "'/'", "'*'", 
			"'.'", null, null, "'='", null, null, null, null, null, null, null, null, 
			null, null, null, null, "'{'", "'<='", null, "'<-'", null, "'('", "'<'", 
			"'-'", "'=>'", "'}'", "')'", "';'", null, null, null, null, null, null, 
			"'_'", "'+'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEGATE", "WHILE", "FALSE", "AT", "CASE", "CLASS", "COLON", "COMMA", 
			"DIVIDE", "MUL", "DOT", "ELSE", "STRING", "EQUALS", "ESAC", "NEW", "FI", 
			"NOT", "TRUE", "OF", "POOL", "IF", "IN", "INHERITS", "INTEGER", "ISVOID", 
			"LBRACE", "LE", "LET", "LARROW", "LOOP", "LPAREN", "LT", "MINUS", "RARROW", 
			"RBRACE", "RPAREN", "SEMI", "THEN", "TILDE", "TIMES", "ID", "LETTER", 
			"DIGIT", "UNDERSCORE", "PLUS", "WS", "ERRORCHARACTER"
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
	public String getGrammarFileName() { return "Cool.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<ClsContext> cls() {
			return getRuleContexts(ClsContext.class);
		}
		public ClsContext cls(int i) {
			return getRuleContext(ClsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				cls();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
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

	public static class ClsContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(CoolParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(CoolParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public TerminalNode INHERITS() { return getToken(CoolParser.INHERITS, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ClsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterCls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitCls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitCls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClsContext cls() throws RecognitionException {
		ClsContext _localctx = new ClsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(CLASS);
			setState(18);
			match(ID);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(19);
				match(INHERITS);
				setState(20);
				match(ID);
				}
			}

			setState(23);
			match(LBRACE);
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(24);
				stmt();
				setState(25);
				match(SEMI);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(RBRACE);
			setState(33);
			match(SEMI);
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
	public static class VarialeDeclareContext extends StmtContext {
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode LARROW() { return getToken(CoolParser.LARROW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarialeDeclareContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterVarialeDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitVarialeDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitVarialeDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionDeclareContext extends StmtContext {
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public StContext st() {
			return getRuleContext(StContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public FunctionDeclareContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterFunctionDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitFunctionDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitFunctionDeclare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new FunctionDeclareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(ID);
				setState(36);
				match(LPAREN);
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(37);
					param();
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(38);
						match(COMMA);
						setState(39);
						param();
						}
						}
						setState(44);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(47);
				match(RPAREN);
				setState(48);
				match(COLON);
				setState(49);
				match(ID);
				setState(50);
				match(LBRACE);
				setState(51);
				st();
				setState(52);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new VarialeDeclareContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(ID);
				setState(55);
				match(COLON);
				setState(56);
				match(ID);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LARROW) {
					{
					setState(57);
					match(LARROW);
					setState(58);
					expr(0);
					}
				}

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

	public static class ParamContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(ID);
			setState(64);
			match(COLON);
			setState(65);
			match(ID);
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

	public static class StContext extends ParserRuleContext {
		public StContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st; }
	 
		public StContext() { }
		public void copyFrom(StContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpritionContext extends StContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpritionContext(StContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterExprition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitExprition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitExprition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends StContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode LARROW() { return getToken(CoolParser.LARROW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(StContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StContext st() throws RecognitionException {
		StContext _localctx = new StContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_st);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(ID);
				setState(68);
				match(LARROW);
				setState(69);
				expr(0);
				}
				break;
			case 2:
				_localctx = new ExpritionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				expr(0);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CoolParser.PLUS, 0); }
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends ExprContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public IdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(CoolParser.MINUS, 0); }
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(CoolParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CoolParser.MUL, 0); }
		public MulContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsvoidContext extends ExprContext {
		public TerminalNode ISVOID() { return getToken(CoolParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IsvoidContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterIsvoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitIsvoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitIsvoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(CoolParser.FALSE, 0); }
		public FalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallFunctionContext extends ExprContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public CallFunctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerContext extends ExprContext {
		public TerminalNode INTEGER() { return getToken(CoolParser.INTEGER, 0); }
		public IntegerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassCallFunctionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOT() { return getToken(CoolParser.DOT, 0); }
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public TerminalNode AT() { return getToken(CoolParser.AT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public ClassCallFunctionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterClassCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitClassCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitClassCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends ExprContext {
		public TerminalNode WHILE() { return getToken(CoolParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(CoolParser.LOOP, 0); }
		public StContext st() {
			return getRuleContext(StContext.class,0);
		}
		public TerminalNode POOL() { return getToken(CoolParser.POOL, 0); }
		public WhileContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockLetContext extends ExprContext {
		public TerminalNode LET() { return getToken(CoolParser.LET, 0); }
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(CoolParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CoolParser.COLON, i);
		}
		public TerminalNode IN() { return getToken(CoolParser.IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> LARROW() { return getTokens(CoolParser.LARROW); }
		public TerminalNode LARROW(int i) {
			return getToken(CoolParser.LARROW, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public BlockLetContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterBlockLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitBlockLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitBlockLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(CoolParser.DIVIDE, 0); }
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParantesiesContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public ParantesiesContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterParantesies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitParantesies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitParantesies(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(CoolParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateContext extends ExprContext {
		public TerminalNode NEGATE() { return getToken(CoolParser.NEGATE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterNegate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitNegate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitNegate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(CoolParser.LT, 0); }
		public LessThanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanOrEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(CoolParser.LE, 0); }
		public LessThanOrEqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterLessThanOrEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitLessThanOrEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitLessThanOrEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(CoolParser.EQUALS, 0); }
		public EqualsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(CoolParser.TRUE, 0); }
		public TrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends ExprContext {
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public List<StContext> st() {
			return getRuleContexts(StContext.class);
		}
		public StContext st(int i) {
			return getRuleContext(StContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoolParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public BlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends ExprContext {
		public TerminalNode IF() { return getToken(CoolParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(CoolParser.THEN, 0); }
		public List<StContext> st() {
			return getRuleContexts(StContext.class);
		}
		public StContext st(int i) {
			return getRuleContext(StContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CoolParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(CoolParser.FI, 0); }
		public IfContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaseContext extends ExprContext {
		public TerminalNode CASE() { return getToken(CoolParser.CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OF() { return getToken(CoolParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(CoolParser.ESAC, 0); }
		public List<TerminalNode> ID() { return getTokens(CoolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CoolParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(CoolParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CoolParser.COLON, i);
		}
		public List<TerminalNode> RARROW() { return getTokens(CoolParser.RARROW); }
		public TerminalNode RARROW(int i) {
			return getToken(CoolParser.RARROW, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoolParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public CaseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectContext extends ExprContext {
		public TerminalNode NEW() { return getToken(CoolParser.NEW, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public ObjectContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolListener ) ((CoolListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolVisitor ) return ((CoolVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(74);
				match(LBRACE);
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(75);
					st();
					setState(76);
					match(SEMI);
					}
					}
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEGATE) | (1L << WHILE) | (1L << FALSE) | (1L << CASE) | (1L << STRING) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << IF) | (1L << INTEGER) | (1L << ISVOID) | (1L << LBRACE) | (1L << LET) | (1L << LPAREN) | (1L << ID))) != 0) );
				setState(82);
				match(RBRACE);
				}
				break;
			case 2:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(IF);
				setState(85);
				expr(0);
				setState(86);
				match(THEN);
				setState(87);
				st();
				setState(88);
				match(ELSE);
				setState(89);
				st();
				setState(90);
				match(FI);
				}
				break;
			case 3:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(INTEGER);
				}
				break;
			case 4:
				{
				_localctx = new ParantesiesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(LPAREN);
				setState(94);
				expr(0);
				setState(95);
				match(RPAREN);
				}
				break;
			case 5:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				match(NEGATE);
				setState(98);
				expr(16);
				}
				break;
			case 6:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(NOT);
				setState(100);
				expr(12);
				}
				break;
			case 7:
				{
				_localctx = new ObjectContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(NEW);
				setState(102);
				match(ID);
				}
				break;
			case 8:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(TRUE);
				}
				break;
			case 9:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(WHILE);
				setState(105);
				expr(0);
				setState(106);
				match(LOOP);
				setState(107);
				st();
				setState(108);
				match(POOL);
				}
				break;
			case 10:
				{
				_localctx = new BlockLetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(LET);
				setState(111);
				match(ID);
				setState(112);
				match(COLON);
				setState(113);
				match(ID);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LARROW) {
					{
					setState(114);
					match(LARROW);
					setState(115);
					expr(0);
					}
				}

				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(118);
					match(COMMA);
					setState(119);
					match(ID);
					setState(120);
					match(COLON);
					setState(121);
					match(ID);
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LARROW) {
						{
						setState(122);
						match(LARROW);
						setState(123);
						expr(0);
						}
					}

					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				match(IN);
				setState(132);
				expr(8);
				}
				break;
			case 11:
				{
				_localctx = new CallFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(ID);
				setState(134);
				match(LPAREN);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEGATE) | (1L << WHILE) | (1L << FALSE) | (1L << CASE) | (1L << STRING) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << IF) | (1L << INTEGER) | (1L << ISVOID) | (1L << LBRACE) | (1L << LET) | (1L << LPAREN) | (1L << ID))) != 0)) {
					{
					setState(135);
					expr(0);
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(136);
						match(COMMA);
						setState(137);
						expr(0);
						}
						}
						setState(142);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(145);
				match(RPAREN);
				}
				break;
			case 12:
				{
				_localctx = new CaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(CASE);
				setState(147);
				expr(0);
				setState(148);
				match(OF);
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(149);
					match(ID);
					setState(150);
					match(COLON);
					setState(151);
					match(ID);
					setState(152);
					match(RARROW);
					setState(153);
					expr(0);
					setState(154);
					match(SEMI);
					}
					}
					setState(158); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(160);
				match(ESAC);
				}
				break;
			case 13:
				{
				_localctx = new IsvoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(ISVOID);
				setState(163);
				expr(4);
				}
				break;
			case 14:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(ID);
				}
				break;
			case 15:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(STRING);
				}
				break;
			case 16:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(170);
						match(MUL);
						setState(171);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(173);
						match(DIVIDE);
						setState(174);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(176);
						match(PLUS);
						setState(177);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(179);
						match(MINUS);
						setState(180);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new LessThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(182);
						match(LT);
						setState(183);
						expr(16);
						}
						break;
					case 6:
						{
						_localctx = new LessThanOrEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(185);
						match(LE);
						setState(186);
						expr(15);
						}
						break;
					case 7:
						{
						_localctx = new EqualsContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(188);
						match(EQUALS);
						setState(189);
						expr(14);
						}
						break;
					case 8:
						{
						_localctx = new ClassCallFunctionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(193);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(191);
							match(AT);
							setState(192);
							match(ID);
							}
						}

						setState(195);
						match(DOT);
						setState(196);
						match(ID);
						setState(197);
						match(LPAREN);
						setState(206);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEGATE) | (1L << WHILE) | (1L << FALSE) | (1L << CASE) | (1L << STRING) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << IF) | (1L << INTEGER) | (1L << ISVOID) | (1L << LBRACE) | (1L << LET) | (1L << LPAREN) | (1L << ID))) != 0)) {
							{
							setState(198);
							expr(0);
							setState(203);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(199);
								match(COMMA);
								setState(200);
								expr(0);
								}
								}
								setState(205);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(208);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u00d9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3"+
		"\3\3\3\3\3\3\3\5\3\30\n\3\3\3\3\3\3\3\3\3\7\3\36\n\3\f\3\16\3!\13\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\5\4\60\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\5\4@\n\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\5\6J\n\6\3\7\3\7\3\7\3\7\3\7\6\7Q\n\7\r\7\16"+
		"\7R\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7w\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\177\n\7\7\7\u0081\n\7\f\7\16\7\u0084"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u008d\n\7\f\7\16\7\u0090\13\7\5"+
		"\7\u0092\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u009f\n\7"+
		"\r\7\16\7\u00a0\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00aa\n\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00c4\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00cc\n\7\f\7"+
		"\16\7\u00cf\13\7\5\7\u00d1\n\7\3\7\7\7\u00d4\n\7\f\7\16\7\u00d7\13\7\3"+
		"\7\2\3\f\b\2\4\6\b\n\f\2\2\2\u00fb\2\17\3\2\2\2\4\23\3\2\2\2\6?\3\2\2"+
		"\2\bA\3\2\2\2\nI\3\2\2\2\f\u00a9\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20"+
		"\21\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\24\7\b\2\2\24"+
		"\27\7,\2\2\25\26\7\32\2\2\26\30\7,\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30"+
		"\31\3\2\2\2\31\37\7\35\2\2\32\33\5\6\4\2\33\34\7(\2\2\34\36\3\2\2\2\35"+
		"\32\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2"+
		"\2\"#\7&\2\2#$\7(\2\2$\5\3\2\2\2%&\7,\2\2&/\7\"\2\2\',\5\b\5\2()\7\n\2"+
		"\2)+\5\b\5\2*(\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\60\3\2\2\2.,\3\2"+
		"\2\2/\'\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\7\'\2\2\62\63\7\t\2\2"+
		"\63\64\7,\2\2\64\65\7\35\2\2\65\66\5\n\6\2\66\67\7&\2\2\67@\3\2\2\289"+
		"\7,\2\29:\7\t\2\2:=\7,\2\2;<\7 \2\2<>\5\f\7\2=;\3\2\2\2=>\3\2\2\2>@\3"+
		"\2\2\2?%\3\2\2\2?8\3\2\2\2@\7\3\2\2\2AB\7,\2\2BC\7\t\2\2CD\7,\2\2D\t\3"+
		"\2\2\2EF\7,\2\2FG\7 \2\2GJ\5\f\7\2HJ\5\f\7\2IE\3\2\2\2IH\3\2\2\2J\13\3"+
		"\2\2\2KL\b\7\1\2LP\7\35\2\2MN\5\n\6\2NO\7(\2\2OQ\3\2\2\2PM\3\2\2\2QR\3"+
		"\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7&\2\2U\u00aa\3\2\2\2VW\7\30\2"+
		"\2WX\5\f\7\2XY\7)\2\2YZ\5\n\6\2Z[\7\16\2\2[\\\5\n\6\2\\]\7\23\2\2]\u00aa"+
		"\3\2\2\2^\u00aa\7\33\2\2_`\7\"\2\2`a\5\f\7\2ab\7\'\2\2b\u00aa\3\2\2\2"+
		"cd\7\3\2\2d\u00aa\5\f\7\22ef\7\24\2\2f\u00aa\5\f\7\16gh\7\22\2\2h\u00aa"+
		"\7,\2\2i\u00aa\7\25\2\2jk\7\4\2\2kl\5\f\7\2lm\7!\2\2mn\5\n\6\2no\7\27"+
		"\2\2o\u00aa\3\2\2\2pq\7\37\2\2qr\7,\2\2rs\7\t\2\2sv\7,\2\2tu\7 \2\2uw"+
		"\5\f\7\2vt\3\2\2\2vw\3\2\2\2w\u0082\3\2\2\2xy\7\n\2\2yz\7,\2\2z{\7\t\2"+
		"\2{~\7,\2\2|}\7 \2\2}\177\5\f\7\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2"+
		"\2\2\u0080x\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7\31\2\2"+
		"\u0086\u00aa\5\f\7\n\u0087\u0088\7,\2\2\u0088\u0091\7\"\2\2\u0089\u008e"+
		"\5\f\7\2\u008a\u008b\7\n\2\2\u008b\u008d\5\f\7\2\u008c\u008a\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0091\u0089\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u00aa\7\'\2\2\u0094\u0095\7\7\2\2\u0095\u0096\5\f"+
		"\7\2\u0096\u009e\7\26\2\2\u0097\u0098\7,\2\2\u0098\u0099\7\t\2\2\u0099"+
		"\u009a\7,\2\2\u009a\u009b\7%\2\2\u009b\u009c\5\f\7\2\u009c\u009d\7(\2"+
		"\2\u009d\u009f\3\2\2\2\u009e\u0097\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\21\2\2"+
		"\u00a3\u00aa\3\2\2\2\u00a4\u00a5\7\34\2\2\u00a5\u00aa\5\f\7\6\u00a6\u00aa"+
		"\7,\2\2\u00a7\u00aa\7\17\2\2\u00a8\u00aa\7\5\2\2\u00a9K\3\2\2\2\u00a9"+
		"V\3\2\2\2\u00a9^\3\2\2\2\u00a9_\3\2\2\2\u00a9c\3\2\2\2\u00a9e\3\2\2\2"+
		"\u00a9g\3\2\2\2\u00a9i\3\2\2\2\u00a9j\3\2\2\2\u00a9p\3\2\2\2\u00a9\u0087"+
		"\3\2\2\2\u00a9\u0094\3\2\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a6\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00d5\3\2\2\2\u00ab\u00ac\f\26"+
		"\2\2\u00ac\u00ad\7\f\2\2\u00ad\u00d4\5\f\7\27\u00ae\u00af\f\25\2\2\u00af"+
		"\u00b0\7\13\2\2\u00b0\u00d4\5\f\7\26\u00b1\u00b2\f\24\2\2\u00b2\u00b3"+
		"\7\60\2\2\u00b3\u00d4\5\f\7\25\u00b4\u00b5\f\23\2\2\u00b5\u00b6\7$\2\2"+
		"\u00b6\u00d4\5\f\7\24\u00b7\u00b8\f\21\2\2\u00b8\u00b9\7#\2\2\u00b9\u00d4"+
		"\5\f\7\22\u00ba\u00bb\f\20\2\2\u00bb\u00bc\7\36\2\2\u00bc\u00d4\5\f\7"+
		"\21\u00bd\u00be\f\17\2\2\u00be\u00bf\7\20\2\2\u00bf\u00d4\5\f\7\20\u00c0"+
		"\u00c3\f\t\2\2\u00c1\u00c2\7\6\2\2\u00c2\u00c4\7,\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\r\2\2\u00c6"+
		"\u00c7\7,\2\2\u00c7\u00d0\7\"\2\2\u00c8\u00cd\5\f\7\2\u00c9\u00ca\7\n"+
		"\2\2\u00ca\u00cc\5\f\7\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d4\7\'\2\2\u00d3\u00ab\3\2\2\2\u00d3\u00ae\3\2\2\2\u00d3\u00b1\3\2"+
		"\2\2\u00d3\u00b4\3\2\2\2\u00d3\u00b7\3\2\2\2\u00d3\u00ba\3\2\2\2\u00d3"+
		"\u00bd\3\2\2\2\u00d3\u00c0\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\r\3\2\2\2\u00d7\u00d5\3\2\2\2\27\21\27"+
		"\37,/=?IRv~\u0082\u008e\u0091\u00a0\u00a9\u00c3\u00cd\u00d0\u00d3\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}