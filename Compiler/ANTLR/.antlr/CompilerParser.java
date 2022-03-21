// Generated from d:\GitHub\Compiler\Compiler\ANTLR\Compiler.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CompilerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		TRUE=32, FALSE=33, ASTERISK=34, SLASH=35, New_Line=36, Comment=37, Whitespace=38, 
		Integer_Literal=39, Real_Literal=40, String_Literal=41;
	public static final int
		RULE_input = 0, RULE_input_section = 1, RULE_input_section_part = 2, RULE_input_element = 3, 
		RULE_token = 4, RULE_keyword = 5, RULE_literal = 6, RULE_boolean_literal = 7, 
		RULE_operator_or_punctuator = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "input_section", "input_section_part", "input_element", "token", 
			"keyword", "literal", "boolean_literal", "operator_or_punctuator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'bool'", "'break'", "'continue'", "'do'", "'double'", "'else'", 
			"'for'", "'if'", "'int'", "'return'", "'string'", "'void'", "'while'", 
			"'{'", "'}'", "'('", "')'", "'.'", "','", "';'", "'+'", "'-'", "'='", 
			"'<'", "'>'", "'&&'", "'||'", "'=='", "'!='", "'<='", "'>='", "'true'", 
			"'false'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "TRUE", "FALSE", "ASTERISK", 
			"SLASH", "New_Line", "Comment", "Whitespace", "Integer_Literal", "Real_Literal", 
			"String_Literal"
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
	public String getGrammarFileName() { return "Compiler.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CompilerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InputContext extends ParserRuleContext {
		public Input_sectionContext input_section() {
			return getRuleContext(Input_sectionContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << TRUE) | (1L << FALSE) | (1L << ASTERISK) | (1L << SLASH) | (1L << New_Line) | (1L << Comment) | (1L << Whitespace) | (1L << Integer_Literal) | (1L << Real_Literal) | (1L << String_Literal))) != 0)) {
				{
				setState(18);
				input_section();
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

	public static class Input_sectionContext extends ParserRuleContext {
		public List<Input_section_partContext> input_section_part() {
			return getRuleContexts(Input_section_partContext.class);
		}
		public Input_section_partContext input_section_part(int i) {
			return getRuleContext(Input_section_partContext.class,i);
		}
		public Input_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_section; }
	}

	public final Input_sectionContext input_section() throws RecognitionException {
		Input_sectionContext _localctx = new Input_sectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_input_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				input_section_part();
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << TRUE) | (1L << FALSE) | (1L << ASTERISK) | (1L << SLASH) | (1L << New_Line) | (1L << Comment) | (1L << Whitespace) | (1L << Integer_Literal) | (1L << Real_Literal) | (1L << String_Literal))) != 0) );
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

	public static class Input_section_partContext extends ParserRuleContext {
		public TerminalNode New_Line() { return getToken(CompilerParser.New_Line, 0); }
		public List<Input_elementContext> input_element() {
			return getRuleContexts(Input_elementContext.class);
		}
		public Input_elementContext input_element(int i) {
			return getRuleContext(Input_elementContext.class,i);
		}
		public Input_section_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_section_part; }
	}

	public final Input_section_partContext input_section_part() throws RecognitionException {
		Input_section_partContext _localctx = new Input_section_partContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_input_section_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << TRUE) | (1L << FALSE) | (1L << ASTERISK) | (1L << SLASH) | (1L << Comment) | (1L << Whitespace) | (1L << Integer_Literal) | (1L << Real_Literal) | (1L << String_Literal))) != 0)) {
				{
				{
				setState(26);
				input_element();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(New_Line);
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

	public static class Input_elementContext extends ParserRuleContext {
		public TerminalNode Whitespace() { return getToken(CompilerParser.Whitespace, 0); }
		public TerminalNode Comment() { return getToken(CompilerParser.Comment, 0); }
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
		}
		public Input_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_element; }
	}

	public final Input_elementContext input_element() throws RecognitionException {
		Input_elementContext _localctx = new Input_elementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input_element);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Whitespace:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(Whitespace);
				}
				break;
			case Comment:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(Comment);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case TRUE:
			case FALSE:
			case ASTERISK:
			case SLASH:
			case Integer_Literal:
			case Real_Literal:
			case String_Literal:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				token();
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

	public static class TokenContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode Integer_Literal() { return getToken(CompilerParser.Integer_Literal, 0); }
		public TerminalNode Real_Literal() { return getToken(CompilerParser.Real_Literal, 0); }
		public TerminalNode String_Literal() { return getToken(CompilerParser.String_Literal, 0); }
		public Operator_or_punctuatorContext operator_or_punctuator() {
			return getRuleContext(Operator_or_punctuatorContext.class,0);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_token);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				keyword();
				}
				break;
			case Integer_Literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(Integer_Literal);
				}
				break;
			case Real_Literal:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				match(Real_Literal);
				}
				break;
			case String_Literal:
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(String_Literal);
				}
				break;
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case ASTERISK:
			case SLASH:
				enterOuterAlt(_localctx, 5);
				{
				setState(43);
				operator_or_punctuator();
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(CompilerParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(CompilerParser.TRUE, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << TRUE) | (1L << FALSE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LiteralContext extends ParserRuleContext {
		public Boolean_literalContext boolean_literal() {
			return getRuleContext(Boolean_literalContext.class,0);
		}
		public TerminalNode Integer_Literal() { return getToken(CompilerParser.Integer_Literal, 0); }
		public TerminalNode Real_Literal() { return getToken(CompilerParser.Real_Literal, 0); }
		public TerminalNode String_Literal() { return getToken(CompilerParser.String_Literal, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_literal);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				boolean_literal();
				}
				break;
			case Integer_Literal:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(Integer_Literal);
				}
				break;
			case Real_Literal:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(Real_Literal);
				}
				break;
			case String_Literal:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				match(String_Literal);
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

	public static class Boolean_literalContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CompilerParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CompilerParser.FALSE, 0); }
		public Boolean_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_literal; }
	}

	public final Boolean_literalContext boolean_literal() throws RecognitionException {
		Boolean_literalContext _localctx = new Boolean_literalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolean_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Operator_or_punctuatorContext extends ParserRuleContext {
		public TerminalNode ASTERISK() { return getToken(CompilerParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(CompilerParser.SLASH, 0); }
		public Operator_or_punctuatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_or_punctuator; }
	}

	public final Operator_or_punctuatorContext operator_or_punctuator() throws RecognitionException {
		Operator_or_punctuatorContext _localctx = new Operator_or_punctuatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operator_or_punctuator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << ASTERISK) | (1L << SLASH))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+=\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\5\2\26\n"+
		"\2\3\3\6\3\31\n\3\r\3\16\3\32\3\4\7\4\36\n\4\f\4\16\4!\13\4\3\4\3\4\3"+
		"\5\3\5\3\5\5\5(\n\5\3\6\3\6\3\6\3\6\3\6\5\6/\n\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\5\b\67\n\b\3\t\3\t\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\5\4\2"+
		"\3\17\"#\3\2\"#\4\2\20!$%\2?\2\25\3\2\2\2\4\30\3\2\2\2\6\37\3\2\2\2\b"+
		"\'\3\2\2\2\n.\3\2\2\2\f\60\3\2\2\2\16\66\3\2\2\2\208\3\2\2\2\22:\3\2\2"+
		"\2\24\26\5\4\3\2\25\24\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27\31\5\6\4"+
		"\2\30\27\3\2\2\2\31\32\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\5\3\2\2"+
		"\2\34\36\5\b\5\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 "+
		"\"\3\2\2\2!\37\3\2\2\2\"#\7&\2\2#\7\3\2\2\2$(\7(\2\2%(\7\'\2\2&(\5\n\6"+
		"\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\t\3\2\2\2)/\5\f\7\2*/\7)\2\2+/\7"+
		"*\2\2,/\7+\2\2-/\5\22\n\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3"+
		"\2\2\2/\13\3\2\2\2\60\61\t\2\2\2\61\r\3\2\2\2\62\67\5\20\t\2\63\67\7)"+
		"\2\2\64\67\7*\2\2\65\67\7+\2\2\66\62\3\2\2\2\66\63\3\2\2\2\66\64\3\2\2"+
		"\2\66\65\3\2\2\2\67\17\3\2\2\289\t\3\2\29\21\3\2\2\2:;\t\4\2\2;\23\3\2"+
		"\2\2\b\25\32\37\'.\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}