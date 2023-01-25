// Generated from C:/Reyci/Universidad Nacional/Sexto Semestre/Lenguajes/Traductor/listeners/grammar\MiLenguaje.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiLenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

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
		T__45=46, INT=47, FLOAT=48, STRING_LITERAL=49, ID=50, WS=51, LINE_COMMENT=52;
	public static final int
		RULE_start_grammar = 0, RULE_function_main = 1, RULE_function = 2, RULE_substatement = 3, 
		RULE_decs = 4, RULE_return_functions = 5, RULE_dec = 6, RULE_array_size = 7, 
		RULE_type = 8, RULE_function_call = 9, RULE_op_arith = 10, RULE_op_logic = 11, 
		RULE_op_binarie = 12, RULE_index_array = 13, RULE_access_array = 14, RULE_arith = 15, 
		RULE_condex = 16, RULE_assign = 17, RULE_entrance = 18, RULE_print = 19, 
		RULE_if = 20, RULE_elseif = 21, RULE_else = 22, RULE_while = 23, RULE_for = 24, 
		RULE_indentation = 25, RULE_string = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"start_grammar", "function_main", "function", "substatement", "decs", 
			"return_functions", "dec", "array_size", "type", "function_call", "op_arith", 
			"op_logic", "op_binarie", "index_array", "access_array", "arith", "condex", 
			"assign", "entrance", "print", "if", "elseif", "else", "while", "for", 
			"indentation", "string"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Function'", "'Main'", "'('", "')'", "'returns'", "'nothing'", 
			"','", "'array'", "'?'", "'integer'", "'float'", "'+'", "'-'", "'/'", 
			"'*'", "'%'", "'>='", "'<='", "'<'", "'>'", "'=='", "'or'", "'and'", 
			"'['", "']'", "'.'", "'size'", "'not'", "'='", "'Get'", "'next'", "'input'", 
			"'Put'", "'to'", "'output'", "'with'", "'decimal'", "'places'", "'if'", 
			"'elseif'", "'else'", "'while'", "'for'", "';'", "'      '", "'         '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "INT", 
			"FLOAT", "STRING_LITERAL", "ID", "WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "MiLenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiLenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Start_grammarContext extends ParserRuleContext {
		public Function_mainContext function_main() {
			return getRuleContext(Function_mainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiLenguajeParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<SubstatementContext> substatement() {
			return getRuleContexts(SubstatementContext.class);
		}
		public SubstatementContext substatement(int i) {
			return getRuleContext(SubstatementContext.class,i);
		}
		public Start_grammarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_grammar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterStart_grammar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitStart_grammar(this);
		}
	}

	public final Start_grammarContext start_grammar() throws RecognitionException {
		Start_grammarContext _localctx = new Start_grammarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start_grammar);
		int _la;
		try {
			int _alt;
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(54);
						function();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(57); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(59);
				function_main();
				setState(60);
				match(EOF);
				}
				break;
			case EOF:
			case T__9:
			case T__10:
			case T__32:
			case T__38:
			case T__41:
			case T__42:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__32) | (1L << T__38) | (1L << T__41) | (1L << T__42) | (1L << ID))) != 0)) {
					{
					{
					setState(62);
					substatement();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(68);
				match(EOF);
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

	public static class Function_mainContext extends ParserRuleContext {
		public List<IndentationContext> indentation() {
			return getRuleContexts(IndentationContext.class);
		}
		public IndentationContext indentation(int i) {
			return getRuleContext(IndentationContext.class,i);
		}
		public List<SubstatementContext> substatement() {
			return getRuleContexts(SubstatementContext.class);
		}
		public SubstatementContext substatement(int i) {
			return getRuleContext(SubstatementContext.class,i);
		}
		public Function_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFunction_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFunction_main(this);
		}
	}

	public final Function_mainContext function_main() throws RecognitionException {
		Function_mainContext _localctx = new Function_mainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__0);
			setState(72);
			match(T__1);
			setState(73);
			match(T__2);
			setState(74);
			match(T__3);
			setState(75);
			match(T__4);
			setState(76);
			match(T__5);
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77);
				indentation();
				setState(78);
				substatement();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__32) | (1L << T__38) | (1L << T__41) | (1L << T__42) | (1L << T__44) | (1L << T__45) | (1L << ID))) != 0) );
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public DecsContext decs() {
			return getRuleContext(DecsContext.class,0);
		}
		public Return_functionsContext return_functions() {
			return getRuleContext(Return_functionsContext.class,0);
		}
		public List<IndentationContext> indentation() {
			return getRuleContexts(IndentationContext.class);
		}
		public IndentationContext indentation(int i) {
			return getRuleContext(IndentationContext.class,i);
		}
		public List<SubstatementContext> substatement() {
			return getRuleContexts(SubstatementContext.class);
		}
		public SubstatementContext substatement(int i) {
			return getRuleContext(SubstatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__0);
			setState(85);
			match(ID);
			setState(86);
			match(T__2);
			setState(87);
			decs();
			setState(88);
			match(T__3);
			setState(89);
			match(T__4);
			setState(90);
			return_functions();
			setState(94); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				indentation();
				setState(92);
				substatement();
				}
				}
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__32) | (1L << T__38) | (1L << T__41) | (1L << T__42) | (1L << T__44) | (1L << T__45) | (1L << ID))) != 0) );
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

	public static class SubstatementContext extends ParserRuleContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public SubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterSubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitSubstatement(this);
		}
	}

	public final SubstatementContext substatement() throws RecognitionException {
		SubstatementContext _localctx = new SubstatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_substatement);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				dec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				assign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				if_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				while_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				for_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				print();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(104);
				function_call();
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

	public static class DecsContext extends ParserRuleContext {
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public DecsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDecs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDecs(this);
		}
	}

	public final DecsContext decs() throws RecognitionException {
		DecsContext _localctx = new DecsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decs);
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				dec();
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(108);
					match(T__6);
					setState(109);
					dec();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
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

	public static class Return_functionsContext extends ParserRuleContext {
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public Return_functionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterReturn_functions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitReturn_functions(this);
		}
	}

	public final Return_functionsContext return_functions() throws RecognitionException {
		Return_functionsContext _localctx = new Return_functionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_return_functions);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				dec();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(T__5);
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

	public static class DecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public Array_sizeContext array_size() {
			return getRuleContext(Array_sizeContext.class,0);
		}
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dec);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				type();
				setState(123);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				type();
				setState(126);
				match(T__7);
				setState(127);
				match(T__2);
				setState(128);
				array_size();
				setState(129);
				match(T__3);
				setState(130);
				match(ID);
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

	public static class Array_sizeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MiLenguajeParser.INT, 0); }
		public Array_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterArray_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitArray_size(this);
		}
	}

	public final Array_sizeContext array_size() throws RecognitionException {
		Array_sizeContext _localctx = new Array_sizeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array_size);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==INT) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public List<ArithContext> arith() {
			return getRuleContexts(ArithContext.class);
		}
		public ArithContext arith(int i) {
			return getRuleContext(ArithContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ID);
			setState(139);
			match(T__2);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__11) | (1L << T__12) | (1L << INT) | (1L << FLOAT) | (1L << ID))) != 0)) {
				{
				{
				setState(140);
				arith(0);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(141);
					match(T__6);
					setState(142);
					arith(0);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			match(T__3);
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

	public static class Op_arithContext extends ParserRuleContext {
		public Op_arithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_arith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOp_arith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOp_arith(this);
		}
	}

	public final Op_arithContext op_arith() throws RecognitionException {
		Op_arithContext _localctx = new Op_arithContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_op_arith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15))) != 0)) ) {
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

	public static class Op_logicContext extends ParserRuleContext {
		public Op_logicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOp_logic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOp_logic(this);
		}
	}

	public final Op_logicContext op_logic() throws RecognitionException {
		Op_logicContext _localctx = new Op_logicContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_op_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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

	public static class Op_binarieContext extends ParserRuleContext {
		public Op_binarieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_binarie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterOp_binarie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitOp_binarie(this);
		}
	}

	public final Op_binarieContext op_binarie() throws RecognitionException {
		Op_binarieContext _localctx = new Op_binarieContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_op_binarie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
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

	public static class Index_arrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public ArithContext arith() {
			return getRuleContext(ArithContext.class,0);
		}
		public Index_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIndex_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIndex_array(this);
		}
	}

	public final Index_arrayContext index_array() throws RecognitionException {
		Index_arrayContext _localctx = new Index_arrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_index_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ID);
			setState(162);
			match(T__23);
			setState(163);
			arith(0);
			setState(164);
			match(T__24);
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

	public static class Access_arrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public Access_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterAccess_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitAccess_array(this);
		}
	}

	public final Access_arrayContext access_array() throws RecognitionException {
		Access_arrayContext _localctx = new Access_arrayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_access_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(ID);
			setState(167);
			match(T__25);
			setState(168);
			match(T__26);
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

	public static class ArithContext extends ParserRuleContext {
		public List<ArithContext> arith() {
			return getRuleContexts(ArithContext.class);
		}
		public ArithContext arith(int i) {
			return getRuleContext(ArithContext.class,i);
		}
		public TerminalNode INT() { return getToken(MiLenguajeParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(MiLenguajeParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Access_arrayContext access_array() {
			return getRuleContext(Access_arrayContext.class,0);
		}
		public Index_arrayContext index_array() {
			return getRuleContext(Index_arrayContext.class,0);
		}
		public Op_arithContext op_arith() {
			return getRuleContext(Op_arithContext.class,0);
		}
		public ArithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterArith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitArith(this);
		}
	}

	public final ArithContext arith() throws RecognitionException {
		return arith(0);
	}

	private ArithContext arith(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithContext _localctx = new ArithContext(_ctx, _parentState);
		ArithContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_arith, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(171);
				match(T__2);
				setState(172);
				arith(0);
				setState(173);
				match(T__3);
				}
				break;
			case 2:
				{
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				arith(8);
				}
				break;
			case 3:
				{
				setState(177);
				match(INT);
				}
				break;
			case 4:
				{
				setState(178);
				match(FLOAT);
				}
				break;
			case 5:
				{
				setState(179);
				match(ID);
				}
				break;
			case 6:
				{
				setState(180);
				function_call();
				}
				break;
			case 7:
				{
				setState(181);
				access_array();
				}
				break;
			case 8:
				{
				setState(182);
				index_array();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arith);
					setState(185);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(186);
					op_arith();
					setState(187);
					arith(8);
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class CondexContext extends ParserRuleContext {
		public List<CondexContext> condex() {
			return getRuleContexts(CondexContext.class);
		}
		public CondexContext condex(int i) {
			return getRuleContext(CondexContext.class,i);
		}
		public List<Op_binarieContext> op_binarie() {
			return getRuleContexts(Op_binarieContext.class);
		}
		public Op_binarieContext op_binarie(int i) {
			return getRuleContext(Op_binarieContext.class,i);
		}
		public List<ArithContext> arith() {
			return getRuleContexts(ArithContext.class);
		}
		public ArithContext arith(int i) {
			return getRuleContext(ArithContext.class,i);
		}
		public Op_logicContext op_logic() {
			return getRuleContext(Op_logicContext.class,0);
		}
		public CondexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterCondex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitCondex(this);
		}
	}

	public final CondexContext condex() throws RecognitionException {
		CondexContext _localctx = new CondexContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condex);
		try {
			int _alt;
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(T__27);
				setState(195);
				match(T__2);
				setState(196);
				condex();
				setState(197);
				match(T__3);
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(198);
						op_binarie();
						setState(199);
						condex();
						}
						} 
					}
					setState(205);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				arith(0);
				setState(207);
				op_logic();
				setState(208);
				arith(0);
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(209);
						op_binarie();
						setState(210);
						condex();
						}
						} 
					}
					setState(216);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(T__2);
				setState(218);
				condex();
				setState(219);
				match(T__3);
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(220);
						op_binarie();
						setState(221);
						condex();
						}
						} 
					}
					setState(227);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiLenguajeParser.ID, 0); }
		public ArithContext arith() {
			return getRuleContext(ArithContext.class,0);
		}
		public EntranceContext entrance() {
			return getRuleContext(EntranceContext.class,0);
		}
		public Access_arrayContext access_array() {
			return getRuleContext(Access_arrayContext.class,0);
		}
		public Index_arrayContext index_array() {
			return getRuleContext(Index_arrayContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				match(ID);
				setState(231);
				match(T__28);
				setState(232);
				arith(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(ID);
				setState(234);
				match(T__28);
				setState(235);
				entrance();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				access_array();
				setState(237);
				match(T__28);
				setState(238);
				arith(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				access_array();
				setState(241);
				match(T__28);
				setState(242);
				entrance();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				index_array();
				setState(245);
				match(T__28);
				setState(246);
				arith(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				index_array();
				setState(249);
				match(T__28);
				setState(250);
				entrance();
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

	public static class EntranceContext extends ParserRuleContext {
		public EntranceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterEntrance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitEntrance(this);
		}
	}

	public final EntranceContext entrance() throws RecognitionException {
		EntranceContext _localctx = new EntranceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_entrance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__29);
			setState(255);
			match(T__30);
			setState(256);
			match(T__31);
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

	public static class PrintContext extends ParserRuleContext {
		public ArithContext arith() {
			return getRuleContext(ArithContext.class,0);
		}
		public TerminalNode INT() { return getToken(MiLenguajeParser.INT, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print);
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(T__32);
				setState(259);
				arith(0);
				setState(260);
				match(T__33);
				setState(261);
				match(T__34);
				setState(267);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__35:
					{
					setState(262);
					match(T__35);
					setState(263);
					match(INT);
					setState(264);
					match(T__36);
					setState(265);
					match(T__37);
					}
					break;
				case EOF:
				case T__0:
				case T__9:
				case T__10:
				case T__32:
				case T__38:
				case T__39:
				case T__40:
				case T__41:
				case T__42:
				case T__44:
				case T__45:
				case ID:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(T__32);
				setState(270);
				string();
				setState(271);
				match(T__33);
				setState(272);
				match(T__34);
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

	public static class IfContext extends ParserRuleContext {
		public CondexContext condex() {
			return getRuleContext(CondexContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public List<IndentationContext> indentation() {
			return getRuleContexts(IndentationContext.class);
		}
		public IndentationContext indentation(int i) {
			return getRuleContext(IndentationContext.class,i);
		}
		public List<SubstatementContext> substatement() {
			return getRuleContexts(SubstatementContext.class);
		}
		public SubstatementContext substatement(int i) {
			return getRuleContext(SubstatementContext.class,i);
		}
		public List<ElseifContext> elseif() {
			return getRuleContexts(ElseifContext.class);
		}
		public ElseifContext elseif(int i) {
			return getRuleContext(ElseifContext.class,i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIf(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__38);
			setState(277);
			condex();
			setState(281); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(278);
					indentation();
					setState(279);
					substatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(283); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(288);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(285);
					elseif();
					}
					} 
				}
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(291);
				else_();
				}
				break;
			case 2:
				{
				}
				break;
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

	public static class ElseifContext extends ParserRuleContext {
		public CondexContext condex() {
			return getRuleContext(CondexContext.class,0);
		}
		public List<SubstatementContext> substatement() {
			return getRuleContexts(SubstatementContext.class);
		}
		public SubstatementContext substatement(int i) {
			return getRuleContext(SubstatementContext.class,i);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitElseif(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elseif);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__39);
			setState(296);
			condex();
			setState(298); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(297);
					substatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(300); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ElseContext extends ParserRuleContext {
		public List<IndentationContext> indentation() {
			return getRuleContexts(IndentationContext.class);
		}
		public IndentationContext indentation(int i) {
			return getRuleContext(IndentationContext.class,i);
		}
		public List<SubstatementContext> substatement() {
			return getRuleContexts(SubstatementContext.class);
		}
		public SubstatementContext substatement(int i) {
			return getRuleContext(SubstatementContext.class,i);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitElse(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_else);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__40);
			setState(306); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(303);
					indentation();
					setState(304);
					substatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(308); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class WhileContext extends ParserRuleContext {
		public CondexContext condex() {
			return getRuleContext(CondexContext.class,0);
		}
		public List<IndentationContext> indentation() {
			return getRuleContexts(IndentationContext.class);
		}
		public IndentationContext indentation(int i) {
			return getRuleContext(IndentationContext.class,i);
		}
		public List<SubstatementContext> substatement() {
			return getRuleContexts(SubstatementContext.class);
		}
		public SubstatementContext substatement(int i) {
			return getRuleContext(SubstatementContext.class,i);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitWhile(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_while);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__41);
			setState(311);
			condex();
			setState(315); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(312);
					indentation();
					setState(313);
					substatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(317); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ForContext extends ParserRuleContext {
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public CondexContext condex() {
			return getRuleContext(CondexContext.class,0);
		}
		public List<IndentationContext> indentation() {
			return getRuleContexts(IndentationContext.class);
		}
		public IndentationContext indentation(int i) {
			return getRuleContext(IndentationContext.class,i);
		}
		public List<SubstatementContext> substatement() {
			return getRuleContexts(SubstatementContext.class);
		}
		public SubstatementContext substatement(int i) {
			return getRuleContext(SubstatementContext.class,i);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitFor(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(T__42);
			setState(320);
			assign();
			setState(321);
			match(T__43);
			setState(322);
			condex();
			setState(323);
			match(T__43);
			setState(324);
			assign();
			setState(328); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(325);
					indentation();
					setState(326);
					substatement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(330); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class IndentationContext extends ParserRuleContext {
		public IndentationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indentation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterIndentation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitIndentation(this);
		}
	}

	public final IndentationContext indentation() throws RecognitionException {
		IndentationContext _localctx = new IndentationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_indentation);
		try {
			setState(335);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case T__32:
			case T__38:
			case T__41:
			case T__42:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(T__44);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				match(T__45);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(MiLenguajeParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiLenguajeListener ) ((MiLenguajeListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(STRING_LITERAL);
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
		case 15:
			return arith_sempred((ArithContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arith_sempred(ArithContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u0154\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0001\u0000\u0004\u0000"+
		"8\b\u0000\u000b\u0000\f\u00009\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000@\b\u0000\n\u0000\f\u0000C\t\u0000\u0001\u0000\u0003"+
		"\u0000F\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001Q\b"+
		"\u0001\u000b\u0001\f\u0001R\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u0002_\b\u0002\u000b\u0002\f\u0002`\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"j\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004o\b\u0004\n\u0004"+
		"\f\u0004r\t\u0004\u0001\u0004\u0003\u0004u\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0003\u0005y\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0085\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0090\b\t\n\t\f\t\u0093\t\t"+
		"\u0005\t\u0095\b\t\n\t\f\t\u0098\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00b8\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00be\b\u000f\n\u000f\f\u000f\u00c1\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00ca"+
		"\b\u0010\n\u0010\f\u0010\u00cd\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00d5\b\u0010\n\u0010"+
		"\f\u0010\u00d8\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00e0\b\u0010\n\u0010\f\u0010\u00e3"+
		"\t\u0010\u0003\u0010\u00e5\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u00fd\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u010c\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0113\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0004\u0014\u011a\b\u0014\u000b\u0014\f\u0014\u011b\u0001\u0014\u0005"+
		"\u0014\u011f\b\u0014\n\u0014\f\u0014\u0122\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0126\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015"+
		"\u012b\b\u0015\u000b\u0015\f\u0015\u012c\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0004\u0016\u0133\b\u0016\u000b\u0016\f\u0016\u0134"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0004\u0017"+
		"\u013c\b\u0017\u000b\u0017\f\u0017\u013d\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0004\u0018\u0149\b\u0018\u000b\u0018\f\u0018\u014a\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0150\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0000\u0001\u001e\u001b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.024\u0000\u0006"+
		"\u0002\u0000\t\t//\u0001\u0000\n\u000b\u0001\u0000\f\u0010\u0001\u0000"+
		"\u0011\u0015\u0001\u0000\u0016\u0017\u0001\u0000\f\r\u0166\u0000E\u0001"+
		"\u0000\u0000\u0000\u0002G\u0001\u0000\u0000\u0000\u0004T\u0001\u0000\u0000"+
		"\u0000\u0006i\u0001\u0000\u0000\u0000\bt\u0001\u0000\u0000\u0000\nx\u0001"+
		"\u0000\u0000\u0000\f\u0084\u0001\u0000\u0000\u0000\u000e\u0086\u0001\u0000"+
		"\u0000\u0000\u0010\u0088\u0001\u0000\u0000\u0000\u0012\u008a\u0001\u0000"+
		"\u0000\u0000\u0014\u009b\u0001\u0000\u0000\u0000\u0016\u009d\u0001\u0000"+
		"\u0000\u0000\u0018\u009f\u0001\u0000\u0000\u0000\u001a\u00a1\u0001\u0000"+
		"\u0000\u0000\u001c\u00a6\u0001\u0000\u0000\u0000\u001e\u00b7\u0001\u0000"+
		"\u0000\u0000 \u00e4\u0001\u0000\u0000\u0000\"\u00fc\u0001\u0000\u0000"+
		"\u0000$\u00fe\u0001\u0000\u0000\u0000&\u0112\u0001\u0000\u0000\u0000("+
		"\u0114\u0001\u0000\u0000\u0000*\u0127\u0001\u0000\u0000\u0000,\u012e\u0001"+
		"\u0000\u0000\u0000.\u0136\u0001\u0000\u0000\u00000\u013f\u0001\u0000\u0000"+
		"\u00002\u014f\u0001\u0000\u0000\u00004\u0151\u0001\u0000\u0000\u00006"+
		"8\u0003\u0004\u0002\u000076\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;<\u0003\u0002\u0001\u0000<=\u0005\u0000\u0000\u0001=F\u0001"+
		"\u0000\u0000\u0000>@\u0003\u0006\u0003\u0000?>\u0001\u0000\u0000\u0000"+
		"@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DF\u0005\u0000"+
		"\u0000\u0001E7\u0001\u0000\u0000\u0000EA\u0001\u0000\u0000\u0000F\u0001"+
		"\u0001\u0000\u0000\u0000GH\u0005\u0001\u0000\u0000HI\u0005\u0002\u0000"+
		"\u0000IJ\u0005\u0003\u0000\u0000JK\u0005\u0004\u0000\u0000KL\u0005\u0005"+
		"\u0000\u0000LP\u0005\u0006\u0000\u0000MN\u00032\u0019\u0000NO\u0003\u0006"+
		"\u0003\u0000OQ\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000QR\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"S\u0003\u0001\u0000\u0000\u0000TU\u0005\u0001\u0000\u0000UV\u00052\u0000"+
		"\u0000VW\u0005\u0003\u0000\u0000WX\u0003\b\u0004\u0000XY\u0005\u0004\u0000"+
		"\u0000YZ\u0005\u0005\u0000\u0000Z^\u0003\n\u0005\u0000[\\\u00032\u0019"+
		"\u0000\\]\u0003\u0006\u0003\u0000]_\u0001\u0000\u0000\u0000^[\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000a\u0005\u0001\u0000\u0000\u0000bj\u0003\f\u0006\u0000"+
		"cj\u0003\"\u0011\u0000dj\u0003(\u0014\u0000ej\u0003.\u0017\u0000fj\u0003"+
		"0\u0018\u0000gj\u0003&\u0013\u0000hj\u0003\u0012\t\u0000ib\u0001\u0000"+
		"\u0000\u0000ic\u0001\u0000\u0000\u0000id\u0001\u0000\u0000\u0000ie\u0001"+
		"\u0000\u0000\u0000if\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000"+
		"ih\u0001\u0000\u0000\u0000j\u0007\u0001\u0000\u0000\u0000kp\u0003\f\u0006"+
		"\u0000lm\u0005\u0007\u0000\u0000mo\u0003\f\u0006\u0000nl\u0001\u0000\u0000"+
		"\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qu\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000su\u0001"+
		"\u0000\u0000\u0000tk\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000"+
		"u\t\u0001\u0000\u0000\u0000vy\u0003\f\u0006\u0000wy\u0005\u0006\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y\u000b\u0001"+
		"\u0000\u0000\u0000z{\u0003\u0010\b\u0000{|\u00052\u0000\u0000|\u0085\u0001"+
		"\u0000\u0000\u0000}~\u0003\u0010\b\u0000~\u007f\u0005\b\u0000\u0000\u007f"+
		"\u0080\u0005\u0003\u0000\u0000\u0080\u0081\u0003\u000e\u0007\u0000\u0081"+
		"\u0082\u0005\u0004\u0000\u0000\u0082\u0083\u00052\u0000\u0000\u0083\u0085"+
		"\u0001\u0000\u0000\u0000\u0084z\u0001\u0000\u0000\u0000\u0084}\u0001\u0000"+
		"\u0000\u0000\u0085\r\u0001\u0000\u0000\u0000\u0086\u0087\u0007\u0000\u0000"+
		"\u0000\u0087\u000f\u0001\u0000\u0000\u0000\u0088\u0089\u0007\u0001\u0000"+
		"\u0000\u0089\u0011\u0001\u0000\u0000\u0000\u008a\u008b\u00052\u0000\u0000"+
		"\u008b\u0096\u0005\u0003\u0000\u0000\u008c\u0091\u0003\u001e\u000f\u0000"+
		"\u008d\u008e\u0005\u0007\u0000\u0000\u008e\u0090\u0003\u001e\u000f\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000"+
		"\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000"+
		"\u0094\u008c\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0005\u0004\u0000\u0000\u009a\u0013\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0007\u0002\u0000\u0000\u009c\u0015\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0007\u0003\u0000\u0000\u009e\u0017\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0007\u0004\u0000\u0000\u00a0\u0019\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u00052\u0000\u0000\u00a2\u00a3\u0005\u0018\u0000\u0000\u00a3"+
		"\u00a4\u0003\u001e\u000f\u0000\u00a4\u00a5\u0005\u0019\u0000\u0000\u00a5"+
		"\u001b\u0001\u0000\u0000\u0000\u00a6\u00a7\u00052\u0000\u0000\u00a7\u00a8"+
		"\u0005\u001a\u0000\u0000\u00a8\u00a9\u0005\u001b\u0000\u0000\u00a9\u001d"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0006\u000f\uffff\uffff\u0000\u00ab"+
		"\u00ac\u0005\u0003\u0000\u0000\u00ac\u00ad\u0003\u001e\u000f\u0000\u00ad"+
		"\u00ae\u0005\u0004\u0000\u0000\u00ae\u00b8\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0007\u0005\u0000\u0000\u00b0\u00b8\u0003\u001e\u000f\b\u00b1\u00b8"+
		"\u0005/\u0000\u0000\u00b2\u00b8\u00050\u0000\u0000\u00b3\u00b8\u00052"+
		"\u0000\u0000\u00b4\u00b8\u0003\u0012\t\u0000\u00b5\u00b8\u0003\u001c\u000e"+
		"\u0000\u00b6\u00b8\u0003\u001a\r\u0000\u00b7\u00aa\u0001\u0000\u0000\u0000"+
		"\u00b7\u00af\u0001\u0000\u0000\u0000\u00b7\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b2\u0001\u0000\u0000\u0000\u00b7\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bf\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\n\u0007\u0000\u0000\u00ba\u00bb\u0003\u0014\n\u0000\u00bb"+
		"\u00bc\u0003\u001e\u000f\b\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00b9"+
		"\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u001f"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0005\u001c\u0000\u0000\u00c3\u00c4\u0005\u0003\u0000\u0000\u00c4\u00c5"+
		"\u0003 \u0010\u0000\u00c5\u00cb\u0005\u0004\u0000\u0000\u00c6\u00c7\u0003"+
		"\u0018\f\u0000\u00c7\u00c8\u0003 \u0010\u0000\u00c8\u00ca\u0001\u0000"+
		"\u0000\u0000\u00c9\u00c6\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00e5\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0003\u001e\u000f\u0000\u00cf\u00d0\u0003\u0016"+
		"\u000b\u0000\u00d0\u00d6\u0003\u001e\u000f\u0000\u00d1\u00d2\u0003\u0018"+
		"\f\u0000\u00d2\u00d3\u0003 \u0010\u0000\u00d3\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d7\u00e5\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0005\u0003\u0000\u0000\u00da\u00db\u0003 \u0010\u0000"+
		"\u00db\u00e1\u0005\u0004\u0000\u0000\u00dc\u00dd\u0003\u0018\f\u0000\u00dd"+
		"\u00de\u0003 \u0010\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00dc"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00e4\u00ce\u0001\u0000\u0000\u0000\u00e4\u00d9"+
		"\u0001\u0000\u0000\u0000\u00e5!\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005"+
		"2\u0000\u0000\u00e7\u00e8\u0005\u001d\u0000\u0000\u00e8\u00fd\u0003\u001e"+
		"\u000f\u0000\u00e9\u00ea\u00052\u0000\u0000\u00ea\u00eb\u0005\u001d\u0000"+
		"\u0000\u00eb\u00fd\u0003$\u0012\u0000\u00ec\u00ed\u0003\u001c\u000e\u0000"+
		"\u00ed\u00ee\u0005\u001d\u0000\u0000\u00ee\u00ef\u0003\u001e\u000f\u0000"+
		"\u00ef\u00fd\u0001\u0000\u0000\u0000\u00f0\u00f1\u0003\u001c\u000e\u0000"+
		"\u00f1\u00f2\u0005\u001d\u0000\u0000\u00f2\u00f3\u0003$\u0012\u0000\u00f3"+
		"\u00fd\u0001\u0000\u0000\u0000\u00f4\u00f5\u0003\u001a\r\u0000\u00f5\u00f6"+
		"\u0005\u001d\u0000\u0000\u00f6\u00f7\u0003\u001e\u000f\u0000\u00f7\u00fd"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0003\u001a\r\u0000\u00f9\u00fa\u0005"+
		"\u001d\u0000\u0000\u00fa\u00fb\u0003$\u0012\u0000\u00fb\u00fd\u0001\u0000"+
		"\u0000\u0000\u00fc\u00e6\u0001\u0000\u0000\u0000\u00fc\u00e9\u0001\u0000"+
		"\u0000\u0000\u00fc\u00ec\u0001\u0000\u0000\u0000\u00fc\u00f0\u0001\u0000"+
		"\u0000\u0000\u00fc\u00f4\u0001\u0000\u0000\u0000\u00fc\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fd#\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u001e\u0000"+
		"\u0000\u00ff\u0100\u0005\u001f\u0000\u0000\u0100\u0101\u0005 \u0000\u0000"+
		"\u0101%\u0001\u0000\u0000\u0000\u0102\u0103\u0005!\u0000\u0000\u0103\u0104"+
		"\u0003\u001e\u000f\u0000\u0104\u0105\u0005\"\u0000\u0000\u0105\u010b\u0005"+
		"#\u0000\u0000\u0106\u0107\u0005$\u0000\u0000\u0107\u0108\u0005/\u0000"+
		"\u0000\u0108\u0109\u0005%\u0000\u0000\u0109\u010c\u0005&\u0000\u0000\u010a"+
		"\u010c\u0001\u0000\u0000\u0000\u010b\u0106\u0001\u0000\u0000\u0000\u010b"+
		"\u010a\u0001\u0000\u0000\u0000\u010c\u0113\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0005!\u0000\u0000\u010e\u010f\u00034\u001a\u0000\u010f\u0110\u0005"+
		"\"\u0000\u0000\u0110\u0111\u0005#\u0000\u0000\u0111\u0113\u0001\u0000"+
		"\u0000\u0000\u0112\u0102\u0001\u0000\u0000\u0000\u0112\u010d\u0001\u0000"+
		"\u0000\u0000\u0113\'\u0001\u0000\u0000\u0000\u0114\u0115\u0005\'\u0000"+
		"\u0000\u0115\u0119\u0003 \u0010\u0000\u0116\u0117\u00032\u0019\u0000\u0117"+
		"\u0118\u0003\u0006\u0003\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119"+
		"\u0116\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b"+
		"\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c"+
		"\u0120\u0001\u0000\u0000\u0000\u011d\u011f\u0003*\u0015\u0000\u011e\u011d"+
		"\u0001\u0000\u0000\u0000\u011f\u0122\u0001\u0000\u0000\u0000\u0120\u011e"+
		"\u0001\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0125"+
		"\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0123\u0126"+
		"\u0003,\u0016\u0000\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0123\u0001"+
		"\u0000\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0126)\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0005(\u0000\u0000\u0128\u012a\u0003 \u0010\u0000"+
		"\u0129\u012b\u0003\u0006\u0003\u0000\u012a\u0129\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0001\u0000\u0000\u0000\u012d+\u0001\u0000\u0000\u0000\u012e"+
		"\u0132\u0005)\u0000\u0000\u012f\u0130\u00032\u0019\u0000\u0130\u0131\u0003"+
		"\u0006\u0003\u0000\u0131\u0133\u0001\u0000\u0000\u0000\u0132\u012f\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0132\u0001"+
		"\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135-\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0005*\u0000\u0000\u0137\u013b\u0003 \u0010\u0000"+
		"\u0138\u0139\u00032\u0019\u0000\u0139\u013a\u0003\u0006\u0003\u0000\u013a"+
		"\u013c\u0001\u0000\u0000\u0000\u013b\u0138\u0001\u0000\u0000\u0000\u013c"+
		"\u013d\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0001\u0000\u0000\u0000\u013e/\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005+\u0000\u0000\u0140\u0141\u0003\"\u0011\u0000\u0141\u0142\u0005"+
		",\u0000\u0000\u0142\u0143\u0003 \u0010\u0000\u0143\u0144\u0005,\u0000"+
		"\u0000\u0144\u0148\u0003\"\u0011\u0000\u0145\u0146\u00032\u0019\u0000"+
		"\u0146\u0147\u0003\u0006\u0003\u0000\u0147\u0149\u0001\u0000\u0000\u0000"+
		"\u0148\u0145\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014a\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000"+
		"\u014b1\u0001\u0000\u0000\u0000\u014c\u0150\u0001\u0000\u0000\u0000\u014d"+
		"\u0150\u0005-\u0000\u0000\u014e\u0150\u0005.\u0000\u0000\u014f\u014c\u0001"+
		"\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u014e\u0001"+
		"\u0000\u0000\u0000\u01503\u0001\u0000\u0000\u0000\u0151\u0152\u00051\u0000"+
		"\u0000\u01525\u0001\u0000\u0000\u0000\u001d9AER`iptx\u0084\u0091\u0096"+
		"\u00b7\u00bf\u00cb\u00d6\u00e1\u00e4\u00fc\u010b\u0112\u011b\u0120\u0125"+
		"\u012c\u0134\u013d\u014a\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}