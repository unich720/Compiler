// Generated from c:\GitHub\Compiler\Compiler\ANTLR\csharp\pike.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pikeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		IDENTIFIER=53, LETTER=54, FLOAT=55, NUMBER=56, DIGIT=57, STRING=58, WS=59, 
		COMMENT=60, LINE_COMMENT=61;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_function_definition = 2, RULE_variables = 3, 
		RULE_variable_names = 4, RULE_variable_name = 5, RULE_block = 6, RULE_statement = 7, 
		RULE_cond = 8, RULE_while_stmt = 9, RULE_do_while_stmt = 10, RULE_for_stmt = 11, 
		RULE_switch_stmt = 12, RULE_case_stmt = 13, RULE_default_stmt = 14, RULE_foreach_stmt = 15, 
		RULE_break_stmt = 16, RULE_continue_stmt = 17, RULE_expression = 18, RULE_expression2 = 19, 
		RULE_expression5 = 20, RULE_expression6 = 21, RULE_extension = 22, RULE_parenthesis = 23, 
		RULE_expression_list = 24, RULE_splice_expression = 25, RULE_argument = 26, 
		RULE_arguments = 27, RULE_type_ = 28, RULE_function_type = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "function_definition", "variables", "variable_names", 
			"variable_name", "block", "statement", "cond", "while_stmt", "do_while_stmt", 
			"for_stmt", "switch_stmt", "case_stmt", "default_stmt", "foreach_stmt", 
			"break_stmt", "continue_stmt", "expression", "expression2", "expression5", 
			"expression6", "extension", "parenthesis", "expression_list", "splice_expression", 
			"argument", "arguments", "type_", "function_type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "';'", "','", "'*'", "'='", "'{'", "'}'", "'if'", 
			"'else'", "'while'", "'do'", "'for'", "'switch'", "'case'", "'..'", "':'", 
			"'default'", "'foreach'", "'break'", "'continue'", "'||'", "'&&'", "'|'", 
			"'^'", "'&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'<<'", "'>>'", 
			"'+'", "'/'", "'%'", "'--'", "'++'", "'->'", "'['", "']'", "'@'", "'...'", 
			"'int'", "'string'", "'float'", "'program'", "'mapping'", "'array'", 
			"'multiset'", "'function'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "IDENTIFIER", "LETTER", "FLOAT", "NUMBER", 
			"DIGIT", "STRING", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "pike.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pikeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) {
				{
				{
				setState(60);
				definition();
				}
				}
				setState(65);
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

	public static class DefinitionContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				function_definition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				variables();
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

	public static class Function_definitionContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(pikeParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			type_();
			setState(71);
			match(IDENTIFIER);
			setState(72);
			match(T__0);
			setState(73);
			arguments();
			setState(74);
			match(T__1);
			setState(75);
			block();
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

	public static class VariablesContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Variable_namesContext variable_names() {
			return getRuleContext(Variable_namesContext.class,0);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			type_();
			setState(78);
			variable_names();
			setState(79);
			match(T__2);
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

	public static class Variable_namesContext extends ParserRuleContext {
		public List<Variable_nameContext> variable_name() {
			return getRuleContexts(Variable_nameContext.class);
		}
		public Variable_nameContext variable_name(int i) {
			return getRuleContext(Variable_nameContext.class,i);
		}
		public Variable_namesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_names; }
	}

	public final Variable_namesContext variable_names() throws RecognitionException {
		Variable_namesContext _localctx = new Variable_namesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable_names);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			variable_name();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(82);
				match(T__3);
				setState(83);
				variable_name();
				}
				}
				setState(88);
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

	public static class Variable_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(pikeParser.IDENTIFIER, 0); }
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Variable_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_name; }
	}

	public final Variable_nameContext variable_name() throws RecognitionException {
		Variable_nameContext _localctx = new Variable_nameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(89);
				match(T__4);
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(IDENTIFIER);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(96);
				match(T__5);
				setState(97);
				expression2();
				}
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__6);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__37) | (1L << T__38) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << FLOAT) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				{
				setState(101);
				statement();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(T__7);
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
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Do_while_stmtContext do_while_stmt() {
			return getRuleContext(Do_while_stmtContext.class,0);
		}
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
		}
		public Switch_stmtContext switch_stmt() {
			return getRuleContext(Switch_stmtContext.class,0);
		}
		public Case_stmtContext case_stmt() {
			return getRuleContext(Case_stmtContext.class,0);
		}
		public Default_stmtContext default_stmt() {
			return getRuleContext(Default_stmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Foreach_stmtContext foreach_stmt() {
			return getRuleContext(Foreach_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__37:
			case T__38:
			case FLOAT:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				expression2();
				setState(110);
				match(T__2);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				cond();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				while_stmt();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				do_while_stmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				for_stmt();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				switch_stmt();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				case_stmt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				default_stmt();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 9);
				{
				setState(119);
				block();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 10);
				{
				setState(120);
				foreach_stmt();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 11);
				{
				setState(121);
				break_stmt();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 12);
				{
				setState(122);
				continue_stmt();
				}
				break;
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
				enterOuterAlt(_localctx, 13);
				{
				setState(123);
				variables();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 14);
				{
				setState(124);
				match(T__2);
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

	public static class CondContext extends ParserRuleContext {
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__8);
			setState(128);
			match(T__0);
			setState(129);
			expression2();
			setState(130);
			match(T__1);
			setState(131);
			block();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(132);
				match(T__9);
				setState(133);
				statement();
				setState(134);
				block();
				}
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

	public static class While_stmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__10);
			setState(139);
			match(T__0);
			setState(140);
			expression();
			setState(141);
			match(T__1);
			setState(142);
			statement();
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

	public static class Do_while_stmtContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Do_while_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_stmt; }
	}

	public final Do_while_stmtContext do_while_stmt() throws RecognitionException {
		Do_while_stmtContext _localctx = new Do_while_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_do_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__11);
			setState(145);
			statement();
			setState(146);
			while_stmt();
			setState(147);
			match(T__0);
			setState(148);
			expression();
			setState(149);
			match(T__1);
			setState(150);
			match(T__2);
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

	public static class For_stmtContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_for_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__12);
			setState(153);
			match(T__0);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__37) | (1L << T__38) | (1L << FLOAT) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(154);
				expression();
				}
			}

			setState(157);
			match(T__2);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__37) | (1L << T__38) | (1L << FLOAT) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(158);
				expression();
				}
			}

			setState(161);
			match(T__2);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__37) | (1L << T__38) | (1L << FLOAT) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(162);
				expression();
				}
			}

			setState(165);
			match(T__1);
			setState(166);
			statement();
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

	public static class Switch_stmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Switch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_stmt; }
	}

	public final Switch_stmtContext switch_stmt() throws RecognitionException {
		Switch_stmtContext _localctx = new Switch_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_switch_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__13);
			setState(169);
			match(T__0);
			setState(170);
			expression();
			setState(171);
			match(T__1);
			setState(172);
			block();
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

	public static class Case_stmtContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Case_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_stmt; }
	}

	public final Case_stmtContext case_stmt() throws RecognitionException {
		Case_stmtContext _localctx = new Case_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_case_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__14);
			setState(175);
			expression();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(176);
				match(T__15);
				setState(177);
				expression();
				}
			}

			setState(180);
			match(T__16);
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

	public static class Default_stmtContext extends ParserRuleContext {
		public Default_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_default_stmt; }
	}

	public final Default_stmtContext default_stmt() throws RecognitionException {
		Default_stmtContext _localctx = new Default_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_default_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(T__17);
			setState(183);
			match(T__16);
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

	public static class Foreach_stmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression6Context expression6() {
			return getRuleContext(Expression6Context.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Foreach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach_stmt; }
	}

	public final Foreach_stmtContext foreach_stmt() throws RecognitionException {
		Foreach_stmtContext _localctx = new Foreach_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_foreach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__18);
			setState(186);
			match(T__0);
			setState(187);
			expression();
			setState(188);
			match(T__16);
			setState(189);
			expression6();
			setState(190);
			match(T__1);
			setState(191);
			statement();
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

	public static class Break_stmtContext extends ParserRuleContext {
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__19);
			setState(194);
			match(T__2);
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

	public static class Continue_stmtContext extends ParserRuleContext {
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__20);
			setState(197);
			match(T__2);
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
		public List<Expression2Context> expression2() {
			return getRuleContexts(Expression2Context.class);
		}
		public Expression2Context expression2(int i) {
			return getRuleContext(Expression2Context.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			expression2();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(200);
				match(T__3);
				setState(201);
				expression2();
				}
				}
				setState(206);
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

	public static class Expression2Context extends ParserRuleContext {
		public List<Expression5Context> expression5() {
			return getRuleContexts(Expression5Context.class);
		}
		public Expression5Context expression5(int i) {
			return getRuleContext(Expression5Context.class,i);
		}
		public Expression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression2; }
	}

	public final Expression2Context expression2() throws RecognitionException {
		Expression2Context _localctx = new Expression2Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression2);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(207);
					expression5();
					setState(208);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(215);
			expression5();
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

	public static class Expression5Context extends ParserRuleContext {
		public Expression6Context expression6() {
			return getRuleContext(Expression6Context.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public Expression5Context expression5() {
			return getRuleContext(Expression5Context.class,0);
		}
		public Expression5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression5; }
	}

	public final Expression5Context expression5() throws RecognitionException {
		Expression5Context _localctx = new Expression5Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression5);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				expression6();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(T__0);
				setState(219);
				type_();
				setState(220);
				match(T__1);
				setState(221);
				expression5();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(T__37);
				setState(224);
				expression6();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				match(T__38);
				setState(226);
				expression6();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				expression6();
				setState(228);
				match(T__37);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(230);
				expression6();
				setState(231);
				match(T__38);
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

	public static class Expression6Context extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(pikeParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(pikeParser.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(pikeParser.FLOAT, 0); }
		public ParenthesisContext parenthesis() {
			return getRuleContext(ParenthesisContext.class,0);
		}
		public List<ExtensionContext> extension() {
			return getRuleContexts(ExtensionContext.class);
		}
		public ExtensionContext extension(int i) {
			return getRuleContext(ExtensionContext.class,i);
		}
		public Expression6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression6; }
	}

	public final Expression6Context expression6() throws RecognitionException {
		Expression6Context _localctx = new Expression6Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression6);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(235);
				match(STRING);
				}
				break;
			case NUMBER:
				{
				setState(236);
				match(NUMBER);
				}
				break;
			case FLOAT:
				{
				setState(237);
				match(FLOAT);
				}
				break;
			case T__0:
				{
				setState(238);
				parenthesis();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__39) | (1L << T__40))) != 0)) {
				{
				{
				setState(241);
				extension();
				}
				}
				setState(246);
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

	public static class ExtensionContext extends ParserRuleContext {
		public Expression_listContext expression_list() {
			return getRuleContext(Expression_listContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(pikeParser.IDENTIFIER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension; }
	}

	public final ExtensionContext extension() throws RecognitionException {
		ExtensionContext _localctx = new ExtensionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_extension);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__0);
				setState(248);
				expression_list();
				setState(249);
				match(T__1);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(T__39);
				setState(252);
				match(IDENTIFIER);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(T__40);
				setState(254);
				expression();
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(255);
					match(T__15);
					setState(256);
					expression();
					}
				}

				setState(259);
				match(T__41);
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

	public static class ParenthesisContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis; }
	}

	public final ParenthesisContext parenthesis() throws RecognitionException {
		ParenthesisContext _localctx = new ParenthesisContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__0);
			setState(264);
			expression();
			setState(265);
			match(T__1);
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

	public static class Expression_listContext extends ParserRuleContext {
		public List<Splice_expressionContext> splice_expression() {
			return getRuleContexts(Splice_expressionContext.class);
		}
		public Splice_expressionContext splice_expression(int i) {
			return getRuleContext(Splice_expressionContext.class,i);
		}
		public Expression_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_list; }
	}

	public final Expression_listContext expression_list() throws RecognitionException {
		Expression_listContext _localctx = new Expression_listContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__37) | (1L << T__38) | (1L << T__42) | (1L << FLOAT) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(267);
				splice_expression();
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(268);
						match(T__3);
						setState(269);
						splice_expression();
						}
						} 
					}
					setState(274);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
			}

			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(277);
				match(T__3);
				}
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

	public static class Splice_expressionContext extends ParserRuleContext {
		public Expression2Context expression2() {
			return getRuleContext(Expression2Context.class,0);
		}
		public Splice_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_splice_expression; }
	}

	public final Splice_expressionContext splice_expression() throws RecognitionException {
		Splice_expressionContext _localctx = new Splice_expressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_splice_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__42) {
				{
				setState(280);
				match(T__42);
				}
			}

			setState(283);
			expression2();
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

	public static class ArgumentContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(pikeParser.IDENTIFIER, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			type_();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(286);
				match(T__43);
				}
			}

			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(289);
				match(IDENTIFIER);
				}
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arguments);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) {
				{
				setState(292);
				argument();
				setState(297);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(293);
						match(T__3);
						setState(294);
						argument();
						}
						} 
					}
					setState(299);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				}
				}
			}

			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(302);
				match(T__3);
				}
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

	public static class Type_Context extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public Function_typeContext function_type() {
			return getRuleContext(Function_typeContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_type_);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__44:
				{
				setState(305);
				match(T__44);
				}
				break;
			case T__45:
				{
				setState(306);
				match(T__45);
				}
				break;
			case T__46:
				{
				setState(307);
				match(T__46);
				}
				break;
			case T__47:
				{
				setState(308);
				match(T__47);
				}
				break;
			case T__48:
				{
				{
				setState(309);
				match(T__48);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(310);
					match(T__0);
					setState(311);
					type_();
					setState(312);
					match(T__16);
					setState(313);
					type_();
					setState(314);
					match(T__1);
					}
				}

				}
				}
				break;
			case T__49:
				{
				{
				setState(318);
				match(T__49);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(319);
					match(T__0);
					setState(320);
					type_();
					setState(321);
					match(T__1);
					}
				}

				}
				}
				break;
			case T__50:
				{
				{
				setState(325);
				match(T__50);
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(326);
					match(T__0);
					setState(327);
					type_();
					setState(328);
					match(T__1);
					}
				}

				}
				}
				break;
			case T__51:
				{
				{
				setState(332);
				match(T__51);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(333);
					function_type();
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(341);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(338);
					match(T__4);
					}
					} 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class Function_typeContext extends ParserRuleContext {
		public List<Type_Context> type_() {
			return getRuleContexts(Type_Context.class);
		}
		public Type_Context type_(int i) {
			return getRuleContext(Type_Context.class,i);
		}
		public Function_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_type; }
	}

	public final Function_typeContext function_type() throws RecognitionException {
		Function_typeContext _localctx = new Function_typeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_function_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(T__0);
			setState(345);
			type_();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(346);
				match(T__3);
				setState(347);
				type_();
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(353);
				match(T__43);
				}
			}

			setState(356);
			match(T__1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u0169\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\3\3\3\5\3G\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\7\7\7]\n\7\f\7\16\7`"+
		"\13\7\3\7\3\7\3\7\5\7e\n\7\3\b\3\b\7\bi\n\b\f\b\16\bl\13\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0080"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008b\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u009e"+
		"\n\r\3\r\3\r\5\r\u00a2\n\r\3\r\3\r\5\r\u00a6\n\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\5\17\u00b5\n\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\7\24\u00cd\n\24\f\24\16\24\u00d0\13\24\3\25"+
		"\3\25\3\25\7\25\u00d5\n\25\f\25\16\25\u00d8\13\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u00ec\n\26\3\27\3\27\3\27\3\27\5\27\u00f2\n\27\3\27\7\27\u00f5\n"+
		"\27\f\27\16\27\u00f8\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u0104\n\30\3\30\3\30\5\30\u0108\n\30\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\7\32\u0111\n\32\f\32\16\32\u0114\13\32\5\32\u0116\n\32\3"+
		"\32\5\32\u0119\n\32\3\33\5\33\u011c\n\33\3\33\3\33\3\34\3\34\5\34\u0122"+
		"\n\34\3\34\5\34\u0125\n\34\3\35\3\35\3\35\7\35\u012a\n\35\f\35\16\35\u012d"+
		"\13\35\5\35\u012f\n\35\3\35\5\35\u0132\n\35\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\5\36\u013f\n\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u0146\n\36\3\36\3\36\3\36\3\36\3\36\5\36\u014d\n\36\3\36\3\36\5"+
		"\36\u0151\n\36\5\36\u0153\n\36\3\36\7\36\u0156\n\36\f\36\16\36\u0159\13"+
		"\36\3\37\3\37\3\37\3\37\7\37\u015f\n\37\f\37\16\37\u0162\13\37\3\37\5"+
		"\37\u0165\n\37\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<\2\3\4\2\7\7\30\'\2\u0187\2A\3\2\2\2\4F\3\2"+
		"\2\2\6H\3\2\2\2\bO\3\2\2\2\nS\3\2\2\2\f^\3\2\2\2\16f\3\2\2\2\20\177\3"+
		"\2\2\2\22\u0081\3\2\2\2\24\u008c\3\2\2\2\26\u0092\3\2\2\2\30\u009a\3\2"+
		"\2\2\32\u00aa\3\2\2\2\34\u00b0\3\2\2\2\36\u00b8\3\2\2\2 \u00bb\3\2\2\2"+
		"\"\u00c3\3\2\2\2$\u00c6\3\2\2\2&\u00c9\3\2\2\2(\u00d6\3\2\2\2*\u00eb\3"+
		"\2\2\2,\u00f1\3\2\2\2.\u0107\3\2\2\2\60\u0109\3\2\2\2\62\u0115\3\2\2\2"+
		"\64\u011b\3\2\2\2\66\u011f\3\2\2\28\u012e\3\2\2\2:\u0152\3\2\2\2<\u015a"+
		"\3\2\2\2>@\5\4\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2"+
		"CA\3\2\2\2DG\5\6\4\2EG\5\b\5\2FD\3\2\2\2FE\3\2\2\2G\5\3\2\2\2HI\5:\36"+
		"\2IJ\7\67\2\2JK\7\3\2\2KL\58\35\2LM\7\4\2\2MN\5\16\b\2N\7\3\2\2\2OP\5"+
		":\36\2PQ\5\n\6\2QR\7\5\2\2R\t\3\2\2\2SX\5\f\7\2TU\7\6\2\2UW\5\f\7\2VT"+
		"\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\13\3\2\2\2ZX\3\2\2\2[]\7\7\2\2"+
		"\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ad\7\67"+
		"\2\2bc\7\b\2\2ce\5(\25\2db\3\2\2\2de\3\2\2\2e\r\3\2\2\2fj\7\t\2\2gi\5"+
		"\20\t\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn"+
		"\7\n\2\2n\17\3\2\2\2op\5(\25\2pq\7\5\2\2q\u0080\3\2\2\2r\u0080\5\22\n"+
		"\2s\u0080\5\24\13\2t\u0080\5\26\f\2u\u0080\5\30\r\2v\u0080\5\32\16\2w"+
		"\u0080\5\34\17\2x\u0080\5\36\20\2y\u0080\5\16\b\2z\u0080\5 \21\2{\u0080"+
		"\5\"\22\2|\u0080\5$\23\2}\u0080\5\b\5\2~\u0080\7\5\2\2\177o\3\2\2\2\177"+
		"r\3\2\2\2\177s\3\2\2\2\177t\3\2\2\2\177u\3\2\2\2\177v\3\2\2\2\177w\3\2"+
		"\2\2\177x\3\2\2\2\177y\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2\177|\3\2\2\2"+
		"\177}\3\2\2\2\177~\3\2\2\2\u0080\21\3\2\2\2\u0081\u0082\7\13\2\2\u0082"+
		"\u0083\7\3\2\2\u0083\u0084\5(\25\2\u0084\u0085\7\4\2\2\u0085\u008a\5\16"+
		"\b\2\u0086\u0087\7\f\2\2\u0087\u0088\5\20\t\2\u0088\u0089\5\16\b\2\u0089"+
		"\u008b\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u008b\3\2\2\2\u008b\23\3\2\2"+
		"\2\u008c\u008d\7\r\2\2\u008d\u008e\7\3\2\2\u008e\u008f\5&\24\2\u008f\u0090"+
		"\7\4\2\2\u0090\u0091\5\20\t\2\u0091\25\3\2\2\2\u0092\u0093\7\16\2\2\u0093"+
		"\u0094\5\20\t\2\u0094\u0095\5\24\13\2\u0095\u0096\7\3\2\2\u0096\u0097"+
		"\5&\24\2\u0097\u0098\7\4\2\2\u0098\u0099\7\5\2\2\u0099\27\3\2\2\2\u009a"+
		"\u009b\7\17\2\2\u009b\u009d\7\3\2\2\u009c\u009e\5&\24\2\u009d\u009c\3"+
		"\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\7\5\2\2\u00a0"+
		"\u00a2\5&\24\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a5\7\5\2\2\u00a4\u00a6\5&\24\2\u00a5\u00a4\3\2\2\2\u00a5"+
		"\u00a6\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\4\2\2\u00a8\u00a9\5\20"+
		"\t\2\u00a9\31\3\2\2\2\u00aa\u00ab\7\20\2\2\u00ab\u00ac\7\3\2\2\u00ac\u00ad"+
		"\5&\24\2\u00ad\u00ae\7\4\2\2\u00ae\u00af\5\16\b\2\u00af\33\3\2\2\2\u00b0"+
		"\u00b1\7\21\2\2\u00b1\u00b4\5&\24\2\u00b2\u00b3\7\22\2\2\u00b3\u00b5\5"+
		"&\24\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\7\23\2\2\u00b7\35\3\2\2\2\u00b8\u00b9\7\24\2\2\u00b9\u00ba\7\23"+
		"\2\2\u00ba\37\3\2\2\2\u00bb\u00bc\7\25\2\2\u00bc\u00bd\7\3\2\2\u00bd\u00be"+
		"\5&\24\2\u00be\u00bf\7\23\2\2\u00bf\u00c0\5,\27\2\u00c0\u00c1\7\4\2\2"+
		"\u00c1\u00c2\5\20\t\2\u00c2!\3\2\2\2\u00c3\u00c4\7\26\2\2\u00c4\u00c5"+
		"\7\5\2\2\u00c5#\3\2\2\2\u00c6\u00c7\7\27\2\2\u00c7\u00c8\7\5\2\2\u00c8"+
		"%\3\2\2\2\u00c9\u00ce\5(\25\2\u00ca\u00cb\7\6\2\2\u00cb\u00cd\5(\25\2"+
		"\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\'\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\5*\26\2\u00d2"+
		"\u00d3\t\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00da\5*\26\2\u00da)\3\2\2\2\u00db\u00ec\5,\27\2"+
		"\u00dc\u00dd\7\3\2\2\u00dd\u00de\5:\36\2\u00de\u00df\7\4\2\2\u00df\u00e0"+
		"\5*\26\2\u00e0\u00ec\3\2\2\2\u00e1\u00e2\7(\2\2\u00e2\u00ec\5,\27\2\u00e3"+
		"\u00e4\7)\2\2\u00e4\u00ec\5,\27\2\u00e5\u00e6\5,\27\2\u00e6\u00e7\7(\2"+
		"\2\u00e7\u00ec\3\2\2\2\u00e8\u00e9\5,\27\2\u00e9\u00ea\7)\2\2\u00ea\u00ec"+
		"\3\2\2\2\u00eb\u00db\3\2\2\2\u00eb\u00dc\3\2\2\2\u00eb\u00e1\3\2\2\2\u00eb"+
		"\u00e3\3\2\2\2\u00eb\u00e5\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec+\3\2\2\2"+
		"\u00ed\u00f2\7<\2\2\u00ee\u00f2\7:\2\2\u00ef\u00f2\79\2\2\u00f0\u00f2"+
		"\5\60\31\2\u00f1\u00ed\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2"+
		"\u00f1\u00f0\3\2\2\2\u00f2\u00f6\3\2\2\2\u00f3\u00f5\5.\30\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"-\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\7\3\2\2\u00fa\u00fb\5\62\32"+
		"\2\u00fb\u00fc\7\4\2\2\u00fc\u0108\3\2\2\2\u00fd\u00fe\7*\2\2\u00fe\u0108"+
		"\7\67\2\2\u00ff\u0100\7+\2\2\u0100\u0103\5&\24\2\u0101\u0102\7\22\2\2"+
		"\u0102\u0104\5&\24\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0106\7,\2\2\u0106\u0108\3\2\2\2\u0107\u00f9\3\2\2\2\u0107"+
		"\u00fd\3\2\2\2\u0107\u00ff\3\2\2\2\u0108/\3\2\2\2\u0109\u010a\7\3\2\2"+
		"\u010a\u010b\5&\24\2\u010b\u010c\7\4\2\2\u010c\61\3\2\2\2\u010d\u0112"+
		"\5\64\33\2\u010e\u010f\7\6\2\2\u010f\u0111\5\64\33\2\u0110\u010e\3\2\2"+
		"\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0116"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u010d\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0118\3\2\2\2\u0117\u0119\7\6\2\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\63\3\2\2\2\u011a\u011c\7-\2\2\u011b\u011a\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\5(\25\2\u011e\65\3\2\2\2\u011f"+
		"\u0121\5:\36\2\u0120\u0122\7.\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0124\3\2\2\2\u0123\u0125\7\67\2\2\u0124\u0123\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u0125\67\3\2\2\2\u0126\u012b\5\66\34\2\u0127\u0128\7\6"+
		"\2\2\u0128\u012a\5\66\34\2\u0129\u0127\3\2\2\2\u012a\u012d\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012e\u0126\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130"+
		"\u0132\7\6\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u01329\3\2\2\2"+
		"\u0133\u0153\7/\2\2\u0134\u0153\7\60\2\2\u0135\u0153\7\61\2\2\u0136\u0153"+
		"\7\62\2\2\u0137\u013e\7\63\2\2\u0138\u0139\7\3\2\2\u0139\u013a\5:\36\2"+
		"\u013a\u013b\7\23\2\2\u013b\u013c\5:\36\2\u013c\u013d\7\4\2\2\u013d\u013f"+
		"\3\2\2\2\u013e\u0138\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0153\3\2\2\2\u0140"+
		"\u0145\7\64\2\2\u0141\u0142\7\3\2\2\u0142\u0143\5:\36\2\u0143\u0144\7"+
		"\4\2\2\u0144\u0146\3\2\2\2\u0145\u0141\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0153\3\2\2\2\u0147\u014c\7\65\2\2\u0148\u0149\7\3\2\2\u0149\u014a\5"+
		":\36\2\u014a\u014b\7\4\2\2\u014b\u014d\3\2\2\2\u014c\u0148\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u0153\3\2\2\2\u014e\u0150\7\66\2\2\u014f\u0151\5"+
		"<\37\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152"+
		"\u0133\3\2\2\2\u0152\u0134\3\2\2\2\u0152\u0135\3\2\2\2\u0152\u0136\3\2"+
		"\2\2\u0152\u0137\3\2\2\2\u0152\u0140\3\2\2\2\u0152\u0147\3\2\2\2\u0152"+
		"\u014e\3\2\2\2\u0153\u0157\3\2\2\2\u0154\u0156\7\7\2\2\u0155\u0154\3\2"+
		"\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		";\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7\3\2\2\u015b\u0160\5:\36\2"+
		"\u015c\u015d\7\6\2\2\u015d\u015f\5:\36\2\u015e\u015c\3\2\2\2\u015f\u0162"+
		"\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0164\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0163\u0165\7.\2\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\u0167\7\4\2\2\u0167=\3\2\2\2&AFX^dj\177"+
		"\u008a\u009d\u00a1\u00a5\u00b4\u00ce\u00d6\u00eb\u00f1\u00f6\u0103\u0107"+
		"\u0112\u0115\u0118\u011b\u0121\u0124\u012b\u012e\u0131\u013e\u0145\u014c"+
		"\u0150\u0152\u0157\u0160\u0164";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}