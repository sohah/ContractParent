// Generated from /Users/sohanabel/git/ShadowContractDiscovery/ContractDiscovery/RangerDiscovery/src/ast/parser/SMTLIBv2.g4 by ANTLR 4.7.2
package ast.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SMTLIBv2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Comment=1, ParOpen=2, ParClose=3, Semicolon=4, String=5, QuotedSymbol=6, 
		PS_Not=7, PS_Bool=8, PS_ContinuedExecution=9, PS_Error=10, PS_False=11, 
		PS_ImmediateExit=12, PS_Incomplete=13, PS_Logic=14, PS_Memout=15, PS_Sat=16, 
		PS_Success=17, PS_Theory=18, PS_True=19, PS_Unknown=20, PS_Unsupported=21, 
		PS_Unsat=22, CMD_Assert=23, CMD_CheckSat=24, CMD_CheckSatAssuming=25, 
		CMD_DeclareConst=26, CMD_DeclareDatatype=27, CMD_DeclareDatatypes=28, 
		CMD_DeclareFun=29, CMD_DeclareSort=30, CMD_DefineFun=31, CMD_DefineFunRec=32, 
		CMD_DefineFunsRec=33, CMD_DefineSort=34, CMD_Echo=35, CMD_Exit=36, CMD_GetAssertions=37, 
		CMD_GetAssignment=38, CMD_GetInfo=39, CMD_GetModel=40, CMD_GetOption=41, 
		CMD_GetProof=42, CMD_GetUnsatAssumptions=43, CMD_GetUnsatCore=44, CMD_GetValue=45, 
		CMD_Pop=46, CMD_Push=47, CMD_Reset=48, CMD_ResetAssertions=49, CMD_SetInfo=50, 
		CMD_SetLogic=51, CMD_SetOption=52, GRW_Exclamation=53, GRW_Underscore=54, 
		GRW_As=55, GRW_Binary=56, GRW_Decimal=57, GRW_Exists=58, GRW_Hexadecimal=59, 
		GRW_Forall=60, GRW_Let=61, GRW_Match=62, GRW_Numeral=63, GRW_Par=64, GRW_String=65, 
		Numeral=66, Binary=67, HexDecimal=68, Decimal=69, Colon=70, PK_AllStatistics=71, 
		PK_AssertionStackLevels=72, PK_Authors=73, PK_Category=74, PK_Chainable=75, 
		PK_Definition=76, PK_DiagnosticOutputChannel=77, PK_ErrorBehaviour=78, 
		PK_Extension=79, PK_Funs=80, PK_FunsDescription=81, PK_GlobalDeclarations=82, 
		PK_InteractiveMode=83, PK_Language=84, PK_LeftAssoc=85, PK_License=86, 
		PK_Named=87, PK_Name=88, PK_Notes=89, PK_Pattern=90, PK_PrintSuccess=91, 
		PK_ProduceAssertions=92, PK_ProduceAssignments=93, PK_ProduceModels=94, 
		PK_ProduceProofs=95, PK_ProduceUnsatAssumptions=96, PK_ProduceUnsatCores=97, 
		PK_RandomSeed=98, PK_ReasonUnknown=99, PK_RegularOutputChannel=100, PK_ReproducibleResourceLimit=101, 
		PK_RightAssoc=102, PK_SmtLibVersion=103, PK_Sorts=104, PK_SortsDescription=105, 
		PK_Source=106, PK_Status=107, PK_Theories=108, PK_Values=109, PK_Verbosity=110, 
		PK_Version=111, UndefinedSymbol=112, WS=113;
	public static final int
		RULE_start = 0, RULE_response = 1, RULE_generalReservedWord = 2, RULE_simpleSymbol = 3, 
		RULE_quotedSymbol = 4, RULE_predefSymbol = 5, RULE_predefKeyword = 6, 
		RULE_symbol = 7, RULE_numeral = 8, RULE_decimal = 9, RULE_hexadecimal = 10, 
		RULE_binary = 11, RULE_string = 12, RULE_keyword = 13, RULE_spec_constant = 14, 
		RULE_s_expr = 15, RULE_index = 16, RULE_identifier = 17, RULE_attribute_value = 18, 
		RULE_attribute = 19, RULE_sort = 20, RULE_qual_identifer = 21, RULE_var_binding = 22, 
		RULE_sorted_var = 23, RULE_pattern = 24, RULE_match_case = 25, RULE_term = 26, 
		RULE_sort_symbol_decl = 27, RULE_meta_spec_constant = 28, RULE_fun_symbol_decl = 29, 
		RULE_par_fun_symbol_decl = 30, RULE_theory_attribute = 31, RULE_theory_decl = 32, 
		RULE_logic_attribue = 33, RULE_logic = 34, RULE_sort_dec = 35, RULE_selector_dec = 36, 
		RULE_constructor_dec = 37, RULE_datatype_dec = 38, RULE_function_dec = 39, 
		RULE_function_def = 40, RULE_body = 41, RULE_prop_literal = 42, RULE_script = 43, 
		RULE_cmd_assert = 44, RULE_cmd_checkSat = 45, RULE_cmd_checkSatAssuming = 46, 
		RULE_cmd_declareConst = 47, RULE_cmd_declareDatatype = 48, RULE_cmd_declareDatatypes = 49, 
		RULE_cmd_declareFun = 50, RULE_cmd_declareSort = 51, RULE_cmd_defineFun = 52, 
		RULE_cmd_defineFunRec = 53, RULE_cmd_defineFunsRec = 54, RULE_cmd_defineSort = 55, 
		RULE_cmd_echo = 56, RULE_cmd_exit = 57, RULE_cmd_getAssertions = 58, RULE_cmd_getAssignment = 59, 
		RULE_cmd_getInfo = 60, RULE_cmd_getModel = 61, RULE_cmd_getOption = 62, 
		RULE_cmd_getProof = 63, RULE_cmd_getUnsatAssumptions = 64, RULE_cmd_getUnsatCore = 65, 
		RULE_cmd_getValue = 66, RULE_cmd_pop = 67, RULE_cmd_push = 68, RULE_cmd_reset = 69, 
		RULE_cmd_resetAssertions = 70, RULE_cmd_setInfo = 71, RULE_cmd_setLogic = 72, 
		RULE_cmd_setOption = 73, RULE_command = 74, RULE_b_value = 75, RULE_option = 76, 
		RULE_info_flag = 77, RULE_error_behaviour = 78, RULE_reason_unknown = 79, 
		RULE_model_response = 80, RULE_info_response = 81, RULE_valuation_pair = 82, 
		RULE_t_valuation_pair = 83, RULE_check_sat_response = 84, RULE_echo_response = 85, 
		RULE_get_assertions_response = 86, RULE_get_assignment_response = 87, 
		RULE_get_info_response = 88, RULE_get_model_response = 89, RULE_get_option_response = 90, 
		RULE_get_proof_response = 91, RULE_get_unsat_assump_response = 92, RULE_get_unsat_core_response = 93, 
		RULE_get_value_response = 94, RULE_specific_success_response = 95, RULE_general_response = 96;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "response", "generalReservedWord", "simpleSymbol", "quotedSymbol", 
			"predefSymbol", "predefKeyword", "symbol", "numeral", "decimal", "hexadecimal", 
			"binary", "string", "keyword", "spec_constant", "s_expr", "index", "identifier", 
			"attribute_value", "attribute", "sort", "qual_identifer", "var_binding", 
			"sorted_var", "pattern", "match_case", "term", "sort_symbol_decl", "meta_spec_constant", 
			"fun_symbol_decl", "par_fun_symbol_decl", "theory_attribute", "theory_decl", 
			"logic_attribue", "logic", "sort_dec", "selector_dec", "constructor_dec", 
			"datatype_dec", "function_dec", "function_def", "body", "prop_literal", 
			"script", "cmd_assert", "cmd_checkSat", "cmd_checkSatAssuming", "cmd_declareConst", 
			"cmd_declareDatatype", "cmd_declareDatatypes", "cmd_declareFun", "cmd_declareSort", 
			"cmd_defineFun", "cmd_defineFunRec", "cmd_defineFunsRec", "cmd_defineSort", 
			"cmd_echo", "cmd_exit", "cmd_getAssertions", "cmd_getAssignment", "cmd_getInfo", 
			"cmd_getModel", "cmd_getOption", "cmd_getProof", "cmd_getUnsatAssumptions", 
			"cmd_getUnsatCore", "cmd_getValue", "cmd_pop", "cmd_push", "cmd_reset", 
			"cmd_resetAssertions", "cmd_setInfo", "cmd_setLogic", "cmd_setOption", 
			"command", "b_value", "option", "info_flag", "error_behaviour", "reason_unknown", 
			"model_response", "info_response", "valuation_pair", "t_valuation_pair", 
			"check_sat_response", "echo_response", "get_assertions_response", "get_assignment_response", 
			"get_info_response", "get_model_response", "get_option_response", "get_proof_response", 
			"get_unsat_assump_response", "get_unsat_core_response", "get_value_response", 
			"specific_success_response", "general_response"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "';'", null, null, "'not'", "'Bool'", "'continued-execution'", 
			"'error'", "'false'", "'immediate-exit'", "'incomplete'", "'logic'", 
			"'memout'", "'sat'", "'success'", "'theory'", "'true'", "'unknown'", 
			"'unsupported'", "'unsat'", "'assert'", "'check-sat'", "'check-sat-assuming'", 
			"'declare-const'", "'declare-datatype'", "'declare-datatypes'", "'declare-fun'", 
			"'declare-sort'", "'define-fun'", "'define-fun-rec'", "'define-funs-rec'", 
			"'define-sort'", "'echo'", "'exit'", "'get-assertions'", "'get-assignment'", 
			"'get-info'", "'get-model'", "'get-option'", "'get-proof'", "'get-unsat-assumptions'", 
			"'get-unsat-core'", "'get-value'", "'pop'", "'push'", "'reset'", "'reset-assertions'", 
			"'set-info'", "'set-logic'", "'set-option'", "'!'", "'_'", "'as'", "'BINARY'", 
			"'DECIMAL'", "'exists'", "'HEXADECIMAL'", "'forall'", "'let'", "'match'", 
			"'NUMERAL'", "'par'", "'string'", null, null, null, null, "':'", "':all-statistics'", 
			"':assertion-stack-levels'", "':authors'", "':category'", "':chainable'", 
			"':definition'", "':diagnostic-output-channel'", "':error-behavior'", 
			"':extensions'", "':funs'", "':funs-description'", "':global-declarations'", 
			"':interactive-mode'", "':language'", "':left-assoc'", "':license'", 
			"':named'", "':name'", "':notes'", "':pattern'", "':print-success'", 
			"':produce-assertions'", "':produce-assignments'", "':produce-models'", 
			"':produce-proofs'", "':produce-unsat-assumptions'", "':produce-unsat-cores'", 
			"':random-seed'", "':reason-unknown'", "':regular-output-channel'", "':reproducible-resource-limit'", 
			"':right-assoc'", "':smt-lib-version'", "':sorts'", "':sorts-description'", 
			"':source'", "':status'", "':theories'", "':values'", "':verbosity'", 
			"':version'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Comment", "ParOpen", "ParClose", "Semicolon", "String", "QuotedSymbol", 
			"PS_Not", "PS_Bool", "PS_ContinuedExecution", "PS_Error", "PS_False", 
			"PS_ImmediateExit", "PS_Incomplete", "PS_Logic", "PS_Memout", "PS_Sat", 
			"PS_Success", "PS_Theory", "PS_True", "PS_Unknown", "PS_Unsupported", 
			"PS_Unsat", "CMD_Assert", "CMD_CheckSat", "CMD_CheckSatAssuming", "CMD_DeclareConst", 
			"CMD_DeclareDatatype", "CMD_DeclareDatatypes", "CMD_DeclareFun", "CMD_DeclareSort", 
			"CMD_DefineFun", "CMD_DefineFunRec", "CMD_DefineFunsRec", "CMD_DefineSort", 
			"CMD_Echo", "CMD_Exit", "CMD_GetAssertions", "CMD_GetAssignment", "CMD_GetInfo", 
			"CMD_GetModel", "CMD_GetOption", "CMD_GetProof", "CMD_GetUnsatAssumptions", 
			"CMD_GetUnsatCore", "CMD_GetValue", "CMD_Pop", "CMD_Push", "CMD_Reset", 
			"CMD_ResetAssertions", "CMD_SetInfo", "CMD_SetLogic", "CMD_SetOption", 
			"GRW_Exclamation", "GRW_Underscore", "GRW_As", "GRW_Binary", "GRW_Decimal", 
			"GRW_Exists", "GRW_Hexadecimal", "GRW_Forall", "GRW_Let", "GRW_Match", 
			"GRW_Numeral", "GRW_Par", "GRW_String", "Numeral", "Binary", "HexDecimal", 
			"Decimal", "Colon", "PK_AllStatistics", "PK_AssertionStackLevels", "PK_Authors", 
			"PK_Category", "PK_Chainable", "PK_Definition", "PK_DiagnosticOutputChannel", 
			"PK_ErrorBehaviour", "PK_Extension", "PK_Funs", "PK_FunsDescription", 
			"PK_GlobalDeclarations", "PK_InteractiveMode", "PK_Language", "PK_LeftAssoc", 
			"PK_License", "PK_Named", "PK_Name", "PK_Notes", "PK_Pattern", "PK_PrintSuccess", 
			"PK_ProduceAssertions", "PK_ProduceAssignments", "PK_ProduceModels", 
			"PK_ProduceProofs", "PK_ProduceUnsatAssumptions", "PK_ProduceUnsatCores", 
			"PK_RandomSeed", "PK_ReasonUnknown", "PK_RegularOutputChannel", "PK_ReproducibleResourceLimit", 
			"PK_RightAssoc", "PK_SmtLibVersion", "PK_Sorts", "PK_SortsDescription", 
			"PK_Source", "PK_Status", "PK_Theories", "PK_Values", "PK_Verbosity", 
			"PK_Version", "UndefinedSymbol", "WS"
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
	public String getGrammarFileName() { return "SMTLIBv2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SMTLIBv2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SMTLIBv2Parser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			script();
			setState(195);
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

	public static class ResponseContext extends ParserRuleContext {
		public General_responseContext general_response() {
			return getRuleContext(General_responseContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SMTLIBv2Parser.EOF, 0); }
		public ResponseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterResponse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitResponse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitResponse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResponseContext response() throws RecognitionException {
		ResponseContext _localctx = new ResponseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_response);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			general_response();
			setState(198);
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

	public static class GeneralReservedWordContext extends ParserRuleContext {
		public TerminalNode GRW_Exclamation() { return getToken(SMTLIBv2Parser.GRW_Exclamation, 0); }
		public TerminalNode GRW_Underscore() { return getToken(SMTLIBv2Parser.GRW_Underscore, 0); }
		public TerminalNode GRW_As() { return getToken(SMTLIBv2Parser.GRW_As, 0); }
		public TerminalNode GRW_Binary() { return getToken(SMTLIBv2Parser.GRW_Binary, 0); }
		public TerminalNode GRW_Decimal() { return getToken(SMTLIBv2Parser.GRW_Decimal, 0); }
		public TerminalNode GRW_Exists() { return getToken(SMTLIBv2Parser.GRW_Exists, 0); }
		public TerminalNode GRW_Hexadecimal() { return getToken(SMTLIBv2Parser.GRW_Hexadecimal, 0); }
		public TerminalNode GRW_Forall() { return getToken(SMTLIBv2Parser.GRW_Forall, 0); }
		public TerminalNode GRW_Let() { return getToken(SMTLIBv2Parser.GRW_Let, 0); }
		public TerminalNode GRW_Match() { return getToken(SMTLIBv2Parser.GRW_Match, 0); }
		public TerminalNode GRW_Numeral() { return getToken(SMTLIBv2Parser.GRW_Numeral, 0); }
		public TerminalNode GRW_Par() { return getToken(SMTLIBv2Parser.GRW_Par, 0); }
		public TerminalNode GRW_String() { return getToken(SMTLIBv2Parser.GRW_String, 0); }
		public GeneralReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalReservedWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterGeneralReservedWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitGeneralReservedWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitGeneralReservedWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralReservedWordContext generalReservedWord() throws RecognitionException {
		GeneralReservedWordContext _localctx = new GeneralReservedWordContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_generalReservedWord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (GRW_Exclamation - 53)) | (1L << (GRW_Underscore - 53)) | (1L << (GRW_As - 53)) | (1L << (GRW_Binary - 53)) | (1L << (GRW_Decimal - 53)) | (1L << (GRW_Exists - 53)) | (1L << (GRW_Hexadecimal - 53)) | (1L << (GRW_Forall - 53)) | (1L << (GRW_Let - 53)) | (1L << (GRW_Match - 53)) | (1L << (GRW_Numeral - 53)) | (1L << (GRW_Par - 53)) | (1L << (GRW_String - 53)))) != 0)) ) {
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

	public static class SimpleSymbolContext extends ParserRuleContext {
		public PredefSymbolContext predefSymbol() {
			return getRuleContext(PredefSymbolContext.class,0);
		}
		public TerminalNode UndefinedSymbol() { return getToken(SMTLIBv2Parser.UndefinedSymbol, 0); }
		public SimpleSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterSimpleSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitSimpleSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitSimpleSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSymbolContext simpleSymbol() throws RecognitionException {
		SimpleSymbolContext _localctx = new SimpleSymbolContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simpleSymbol);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PS_Not:
			case PS_Bool:
			case PS_ContinuedExecution:
			case PS_Error:
			case PS_False:
			case PS_ImmediateExit:
			case PS_Incomplete:
			case PS_Logic:
			case PS_Memout:
			case PS_Sat:
			case PS_Success:
			case PS_Theory:
			case PS_True:
			case PS_Unknown:
			case PS_Unsupported:
			case PS_Unsat:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				predefSymbol();
				}
				break;
			case UndefinedSymbol:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(UndefinedSymbol);
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

	public static class QuotedSymbolContext extends ParserRuleContext {
		public TerminalNode QuotedSymbol() { return getToken(SMTLIBv2Parser.QuotedSymbol, 0); }
		public QuotedSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterQuotedSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitQuotedSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitQuotedSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedSymbolContext quotedSymbol() throws RecognitionException {
		QuotedSymbolContext _localctx = new QuotedSymbolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_quotedSymbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(QuotedSymbol);
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

	public static class PredefSymbolContext extends ParserRuleContext {
		public TerminalNode PS_Not() { return getToken(SMTLIBv2Parser.PS_Not, 0); }
		public TerminalNode PS_Bool() { return getToken(SMTLIBv2Parser.PS_Bool, 0); }
		public TerminalNode PS_ContinuedExecution() { return getToken(SMTLIBv2Parser.PS_ContinuedExecution, 0); }
		public TerminalNode PS_Error() { return getToken(SMTLIBv2Parser.PS_Error, 0); }
		public TerminalNode PS_False() { return getToken(SMTLIBv2Parser.PS_False, 0); }
		public TerminalNode PS_ImmediateExit() { return getToken(SMTLIBv2Parser.PS_ImmediateExit, 0); }
		public TerminalNode PS_Incomplete() { return getToken(SMTLIBv2Parser.PS_Incomplete, 0); }
		public TerminalNode PS_Logic() { return getToken(SMTLIBv2Parser.PS_Logic, 0); }
		public TerminalNode PS_Memout() { return getToken(SMTLIBv2Parser.PS_Memout, 0); }
		public TerminalNode PS_Sat() { return getToken(SMTLIBv2Parser.PS_Sat, 0); }
		public TerminalNode PS_Success() { return getToken(SMTLIBv2Parser.PS_Success, 0); }
		public TerminalNode PS_Theory() { return getToken(SMTLIBv2Parser.PS_Theory, 0); }
		public TerminalNode PS_True() { return getToken(SMTLIBv2Parser.PS_True, 0); }
		public TerminalNode PS_Unknown() { return getToken(SMTLIBv2Parser.PS_Unknown, 0); }
		public TerminalNode PS_Unsupported() { return getToken(SMTLIBv2Parser.PS_Unsupported, 0); }
		public TerminalNode PS_Unsat() { return getToken(SMTLIBv2Parser.PS_Unsat, 0); }
		public PredefSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterPredefSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitPredefSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitPredefSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredefSymbolContext predefSymbol() throws RecognitionException {
		PredefSymbolContext _localctx = new PredefSymbolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_predefSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0)) ) {
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

	public static class PredefKeywordContext extends ParserRuleContext {
		public TerminalNode PK_AllStatistics() { return getToken(SMTLIBv2Parser.PK_AllStatistics, 0); }
		public TerminalNode PK_AssertionStackLevels() { return getToken(SMTLIBv2Parser.PK_AssertionStackLevels, 0); }
		public TerminalNode PK_Authors() { return getToken(SMTLIBv2Parser.PK_Authors, 0); }
		public TerminalNode PK_Category() { return getToken(SMTLIBv2Parser.PK_Category, 0); }
		public TerminalNode PK_Chainable() { return getToken(SMTLIBv2Parser.PK_Chainable, 0); }
		public TerminalNode PK_Definition() { return getToken(SMTLIBv2Parser.PK_Definition, 0); }
		public TerminalNode PK_DiagnosticOutputChannel() { return getToken(SMTLIBv2Parser.PK_DiagnosticOutputChannel, 0); }
		public TerminalNode PK_ErrorBehaviour() { return getToken(SMTLIBv2Parser.PK_ErrorBehaviour, 0); }
		public TerminalNode PK_Extension() { return getToken(SMTLIBv2Parser.PK_Extension, 0); }
		public TerminalNode PK_Funs() { return getToken(SMTLIBv2Parser.PK_Funs, 0); }
		public TerminalNode PK_FunsDescription() { return getToken(SMTLIBv2Parser.PK_FunsDescription, 0); }
		public TerminalNode PK_GlobalDeclarations() { return getToken(SMTLIBv2Parser.PK_GlobalDeclarations, 0); }
		public TerminalNode PK_InteractiveMode() { return getToken(SMTLIBv2Parser.PK_InteractiveMode, 0); }
		public TerminalNode PK_Language() { return getToken(SMTLIBv2Parser.PK_Language, 0); }
		public TerminalNode PK_LeftAssoc() { return getToken(SMTLIBv2Parser.PK_LeftAssoc, 0); }
		public TerminalNode PK_License() { return getToken(SMTLIBv2Parser.PK_License, 0); }
		public TerminalNode PK_Named() { return getToken(SMTLIBv2Parser.PK_Named, 0); }
		public TerminalNode PK_Name() { return getToken(SMTLIBv2Parser.PK_Name, 0); }
		public TerminalNode PK_Notes() { return getToken(SMTLIBv2Parser.PK_Notes, 0); }
		public TerminalNode PK_Pattern() { return getToken(SMTLIBv2Parser.PK_Pattern, 0); }
		public TerminalNode PK_PrintSuccess() { return getToken(SMTLIBv2Parser.PK_PrintSuccess, 0); }
		public TerminalNode PK_ProduceAssertions() { return getToken(SMTLIBv2Parser.PK_ProduceAssertions, 0); }
		public TerminalNode PK_ProduceAssignments() { return getToken(SMTLIBv2Parser.PK_ProduceAssignments, 0); }
		public TerminalNode PK_ProduceModels() { return getToken(SMTLIBv2Parser.PK_ProduceModels, 0); }
		public TerminalNode PK_ProduceProofs() { return getToken(SMTLIBv2Parser.PK_ProduceProofs, 0); }
		public TerminalNode PK_ProduceUnsatAssumptions() { return getToken(SMTLIBv2Parser.PK_ProduceUnsatAssumptions, 0); }
		public TerminalNode PK_ProduceUnsatCores() { return getToken(SMTLIBv2Parser.PK_ProduceUnsatCores, 0); }
		public TerminalNode PK_RandomSeed() { return getToken(SMTLIBv2Parser.PK_RandomSeed, 0); }
		public TerminalNode PK_ReasonUnknown() { return getToken(SMTLIBv2Parser.PK_ReasonUnknown, 0); }
		public TerminalNode PK_RegularOutputChannel() { return getToken(SMTLIBv2Parser.PK_RegularOutputChannel, 0); }
		public TerminalNode PK_ReproducibleResourceLimit() { return getToken(SMTLIBv2Parser.PK_ReproducibleResourceLimit, 0); }
		public TerminalNode PK_RightAssoc() { return getToken(SMTLIBv2Parser.PK_RightAssoc, 0); }
		public TerminalNode PK_SmtLibVersion() { return getToken(SMTLIBv2Parser.PK_SmtLibVersion, 0); }
		public TerminalNode PK_Sorts() { return getToken(SMTLIBv2Parser.PK_Sorts, 0); }
		public TerminalNode PK_SortsDescription() { return getToken(SMTLIBv2Parser.PK_SortsDescription, 0); }
		public TerminalNode PK_Source() { return getToken(SMTLIBv2Parser.PK_Source, 0); }
		public TerminalNode PK_Status() { return getToken(SMTLIBv2Parser.PK_Status, 0); }
		public TerminalNode PK_Theories() { return getToken(SMTLIBv2Parser.PK_Theories, 0); }
		public TerminalNode PK_Values() { return getToken(SMTLIBv2Parser.PK_Values, 0); }
		public TerminalNode PK_Verbosity() { return getToken(SMTLIBv2Parser.PK_Verbosity, 0); }
		public TerminalNode PK_Version() { return getToken(SMTLIBv2Parser.PK_Version, 0); }
		public PredefKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predefKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterPredefKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitPredefKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitPredefKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredefKeywordContext predefKeyword() throws RecognitionException {
		PredefKeywordContext _localctx = new PredefKeywordContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_predefKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (PK_AllStatistics - 71)) | (1L << (PK_AssertionStackLevels - 71)) | (1L << (PK_Authors - 71)) | (1L << (PK_Category - 71)) | (1L << (PK_Chainable - 71)) | (1L << (PK_Definition - 71)) | (1L << (PK_DiagnosticOutputChannel - 71)) | (1L << (PK_ErrorBehaviour - 71)) | (1L << (PK_Extension - 71)) | (1L << (PK_Funs - 71)) | (1L << (PK_FunsDescription - 71)) | (1L << (PK_GlobalDeclarations - 71)) | (1L << (PK_InteractiveMode - 71)) | (1L << (PK_Language - 71)) | (1L << (PK_LeftAssoc - 71)) | (1L << (PK_License - 71)) | (1L << (PK_Named - 71)) | (1L << (PK_Name - 71)) | (1L << (PK_Notes - 71)) | (1L << (PK_Pattern - 71)) | (1L << (PK_PrintSuccess - 71)) | (1L << (PK_ProduceAssertions - 71)) | (1L << (PK_ProduceAssignments - 71)) | (1L << (PK_ProduceModels - 71)) | (1L << (PK_ProduceProofs - 71)) | (1L << (PK_ProduceUnsatAssumptions - 71)) | (1L << (PK_ProduceUnsatCores - 71)) | (1L << (PK_RandomSeed - 71)) | (1L << (PK_ReasonUnknown - 71)) | (1L << (PK_RegularOutputChannel - 71)) | (1L << (PK_ReproducibleResourceLimit - 71)) | (1L << (PK_RightAssoc - 71)) | (1L << (PK_SmtLibVersion - 71)) | (1L << (PK_Sorts - 71)) | (1L << (PK_SortsDescription - 71)) | (1L << (PK_Source - 71)) | (1L << (PK_Status - 71)) | (1L << (PK_Theories - 71)) | (1L << (PK_Values - 71)) | (1L << (PK_Verbosity - 71)) | (1L << (PK_Version - 71)))) != 0)) ) {
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

	public static class SymbolContext extends ParserRuleContext {
		public SimpleSymbolContext simpleSymbol() {
			return getRuleContext(SimpleSymbolContext.class,0);
		}
		public QuotedSymbolContext quotedSymbol() {
			return getRuleContext(QuotedSymbolContext.class,0);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_symbol);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PS_Not:
			case PS_Bool:
			case PS_ContinuedExecution:
			case PS_Error:
			case PS_False:
			case PS_ImmediateExit:
			case PS_Incomplete:
			case PS_Logic:
			case PS_Memout:
			case PS_Sat:
			case PS_Success:
			case PS_Theory:
			case PS_True:
			case PS_Unknown:
			case PS_Unsupported:
			case PS_Unsat:
			case UndefinedSymbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				simpleSymbol();
				}
				break;
			case QuotedSymbol:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				quotedSymbol();
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

	public static class NumeralContext extends ParserRuleContext {
		public TerminalNode Numeral() { return getToken(SMTLIBv2Parser.Numeral, 0); }
		public NumeralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numeral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterNumeral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitNumeral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitNumeral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeralContext numeral() throws RecognitionException {
		NumeralContext _localctx = new NumeralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_numeral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(Numeral);
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

	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode Decimal() { return getToken(SMTLIBv2Parser.Decimal, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_decimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(Decimal);
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

	public static class HexadecimalContext extends ParserRuleContext {
		public TerminalNode HexDecimal() { return getToken(SMTLIBv2Parser.HexDecimal, 0); }
		public HexadecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterHexadecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitHexadecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitHexadecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalContext hexadecimal() throws RecognitionException {
		HexadecimalContext _localctx = new HexadecimalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_hexadecimal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(HexDecimal);
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

	public static class BinaryContext extends ParserRuleContext {
		public TerminalNode Binary() { return getToken(SMTLIBv2Parser.Binary, 0); }
		public BinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryContext binary() throws RecognitionException {
		BinaryContext _localctx = new BinaryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(Binary);
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
		public TerminalNode String() { return getToken(SMTLIBv2Parser.String, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(String);
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
		public PredefKeywordContext predefKeyword() {
			return getRuleContext(PredefKeywordContext.class,0);
		}
		public TerminalNode Colon() { return getToken(SMTLIBv2Parser.Colon, 0); }
		public SimpleSymbolContext simpleSymbol() {
			return getRuleContext(SimpleSymbolContext.class,0);
		}
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_keyword);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PK_AllStatistics:
			case PK_AssertionStackLevels:
			case PK_Authors:
			case PK_Category:
			case PK_Chainable:
			case PK_Definition:
			case PK_DiagnosticOutputChannel:
			case PK_ErrorBehaviour:
			case PK_Extension:
			case PK_Funs:
			case PK_FunsDescription:
			case PK_GlobalDeclarations:
			case PK_InteractiveMode:
			case PK_Language:
			case PK_LeftAssoc:
			case PK_License:
			case PK_Named:
			case PK_Name:
			case PK_Notes:
			case PK_Pattern:
			case PK_PrintSuccess:
			case PK_ProduceAssertions:
			case PK_ProduceAssignments:
			case PK_ProduceModels:
			case PK_ProduceProofs:
			case PK_ProduceUnsatAssumptions:
			case PK_ProduceUnsatCores:
			case PK_RandomSeed:
			case PK_ReasonUnknown:
			case PK_RegularOutputChannel:
			case PK_ReproducibleResourceLimit:
			case PK_RightAssoc:
			case PK_SmtLibVersion:
			case PK_Sorts:
			case PK_SortsDescription:
			case PK_Source:
			case PK_Status:
			case PK_Theories:
			case PK_Values:
			case PK_Verbosity:
			case PK_Version:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				predefKeyword();
				}
				break;
			case Colon:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(Colon);
				setState(228);
				simpleSymbol();
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

	public static class Spec_constantContext extends ParserRuleContext {
		public NumeralContext numeral() {
			return getRuleContext(NumeralContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public HexadecimalContext hexadecimal() {
			return getRuleContext(HexadecimalContext.class,0);
		}
		public BinaryContext binary() {
			return getRuleContext(BinaryContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Spec_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterSpec_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitSpec_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitSpec_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Spec_constantContext spec_constant() throws RecognitionException {
		Spec_constantContext _localctx = new Spec_constantContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_spec_constant);
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Numeral:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				numeral();
				}
				break;
			case Decimal:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				decimal();
				}
				break;
			case HexDecimal:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				hexadecimal();
				}
				break;
			case Binary:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				binary();
				}
				break;
			case String:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				string();
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

	public static class S_exprContext extends ParserRuleContext {
		public Spec_constantContext spec_constant() {
			return getRuleContext(Spec_constantContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<S_exprContext> s_expr() {
			return getRuleContexts(S_exprContext.class);
		}
		public S_exprContext s_expr(int i) {
			return getRuleContext(S_exprContext.class,i);
		}
		public S_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterS_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitS_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitS_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_exprContext s_expr() throws RecognitionException {
		S_exprContext _localctx = new S_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_s_expr);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
			case Numeral:
			case Binary:
			case HexDecimal:
			case Decimal:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				spec_constant();
				}
				break;
			case QuotedSymbol:
			case PS_Not:
			case PS_Bool:
			case PS_ContinuedExecution:
			case PS_Error:
			case PS_False:
			case PS_ImmediateExit:
			case PS_Incomplete:
			case PS_Logic:
			case PS_Memout:
			case PS_Sat:
			case PS_Success:
			case PS_Theory:
			case PS_True:
			case PS_Unknown:
			case PS_Unsupported:
			case PS_Unsat:
			case UndefinedSymbol:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				symbol();
				}
				break;
			case Colon:
			case PK_AllStatistics:
			case PK_AssertionStackLevels:
			case PK_Authors:
			case PK_Category:
			case PK_Chainable:
			case PK_Definition:
			case PK_DiagnosticOutputChannel:
			case PK_ErrorBehaviour:
			case PK_Extension:
			case PK_Funs:
			case PK_FunsDescription:
			case PK_GlobalDeclarations:
			case PK_InteractiveMode:
			case PK_Language:
			case PK_LeftAssoc:
			case PK_License:
			case PK_Named:
			case PK_Name:
			case PK_Notes:
			case PK_Pattern:
			case PK_PrintSuccess:
			case PK_ProduceAssertions:
			case PK_ProduceAssignments:
			case PK_ProduceModels:
			case PK_ProduceProofs:
			case PK_ProduceUnsatAssumptions:
			case PK_ProduceUnsatCores:
			case PK_RandomSeed:
			case PK_ReasonUnknown:
			case PK_RegularOutputChannel:
			case PK_ReproducibleResourceLimit:
			case PK_RightAssoc:
			case PK_SmtLibVersion:
			case PK_Sorts:
			case PK_SortsDescription:
			case PK_Source:
			case PK_Status:
			case PK_Theories:
			case PK_Values:
			case PK_Verbosity:
			case PK_Version:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				keyword();
				}
				break;
			case ParOpen:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(ParOpen);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ParOpen) | (1L << String) | (1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Numeral - 66)) | (1L << (Binary - 66)) | (1L << (HexDecimal - 66)) | (1L << (Decimal - 66)) | (1L << (Colon - 66)) | (1L << (PK_AllStatistics - 66)) | (1L << (PK_AssertionStackLevels - 66)) | (1L << (PK_Authors - 66)) | (1L << (PK_Category - 66)) | (1L << (PK_Chainable - 66)) | (1L << (PK_Definition - 66)) | (1L << (PK_DiagnosticOutputChannel - 66)) | (1L << (PK_ErrorBehaviour - 66)) | (1L << (PK_Extension - 66)) | (1L << (PK_Funs - 66)) | (1L << (PK_FunsDescription - 66)) | (1L << (PK_GlobalDeclarations - 66)) | (1L << (PK_InteractiveMode - 66)) | (1L << (PK_Language - 66)) | (1L << (PK_LeftAssoc - 66)) | (1L << (PK_License - 66)) | (1L << (PK_Named - 66)) | (1L << (PK_Name - 66)) | (1L << (PK_Notes - 66)) | (1L << (PK_Pattern - 66)) | (1L << (PK_PrintSuccess - 66)) | (1L << (PK_ProduceAssertions - 66)) | (1L << (PK_ProduceAssignments - 66)) | (1L << (PK_ProduceModels - 66)) | (1L << (PK_ProduceProofs - 66)) | (1L << (PK_ProduceUnsatAssumptions - 66)) | (1L << (PK_ProduceUnsatCores - 66)) | (1L << (PK_RandomSeed - 66)) | (1L << (PK_ReasonUnknown - 66)) | (1L << (PK_RegularOutputChannel - 66)) | (1L << (PK_ReproducibleResourceLimit - 66)) | (1L << (PK_RightAssoc - 66)) | (1L << (PK_SmtLibVersion - 66)) | (1L << (PK_Sorts - 66)) | (1L << (PK_SortsDescription - 66)) | (1L << (PK_Source - 66)) | (1L << (PK_Status - 66)) | (1L << (PK_Theories - 66)) | (1L << (PK_Values - 66)) | (1L << (PK_Verbosity - 66)) | (1L << (PK_Version - 66)) | (1L << (UndefinedSymbol - 66)))) != 0)) {
					{
					{
					setState(242);
					s_expr();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
				match(ParClose);
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

	public static class IndexContext extends ParserRuleContext {
		public NumeralContext numeral() {
			return getRuleContext(NumeralContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_index);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Numeral:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				numeral();
				}
				break;
			case QuotedSymbol:
			case PS_Not:
			case PS_Bool:
			case PS_ContinuedExecution:
			case PS_Error:
			case PS_False:
			case PS_ImmediateExit:
			case PS_Incomplete:
			case PS_Logic:
			case PS_Memout:
			case PS_Sat:
			case PS_Success:
			case PS_Theory:
			case PS_True:
			case PS_Unknown:
			case PS_Unsupported:
			case PS_Unsat:
			case UndefinedSymbol:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				symbol();
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

	public static class IdentifierContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode GRW_Underscore() { return getToken(SMTLIBv2Parser.GRW_Underscore, 0); }
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<IndexContext> index() {
			return getRuleContexts(IndexContext.class);
		}
		public IndexContext index(int i) {
			return getRuleContext(IndexContext.class,i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_identifier);
		int _la;
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QuotedSymbol:
			case PS_Not:
			case PS_Bool:
			case PS_ContinuedExecution:
			case PS_Error:
			case PS_False:
			case PS_ImmediateExit:
			case PS_Incomplete:
			case PS_Logic:
			case PS_Memout:
			case PS_Sat:
			case PS_Success:
			case PS_Theory:
			case PS_True:
			case PS_Unknown:
			case PS_Unsupported:
			case PS_Unsat:
			case UndefinedSymbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				symbol();
				}
				break;
			case ParOpen:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(ParOpen);
				setState(257);
				match(GRW_Underscore);
				setState(258);
				symbol();
				setState(260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(259);
					index();
					}
					}
					setState(262); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || _la==Numeral || _la==UndefinedSymbol );
				setState(264);
				match(ParClose);
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

	public static class Attribute_valueContext extends ParserRuleContext {
		public Spec_constantContext spec_constant() {
			return getRuleContext(Spec_constantContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<S_exprContext> s_expr() {
			return getRuleContexts(S_exprContext.class);
		}
		public S_exprContext s_expr(int i) {
			return getRuleContext(S_exprContext.class,i);
		}
		public Attribute_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterAttribute_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitAttribute_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitAttribute_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_valueContext attribute_value() throws RecognitionException {
		Attribute_valueContext _localctx = new Attribute_valueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_attribute_value);
		int _la;
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case String:
			case Numeral:
			case Binary:
			case HexDecimal:
			case Decimal:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				spec_constant();
				}
				break;
			case QuotedSymbol:
			case PS_Not:
			case PS_Bool:
			case PS_ContinuedExecution:
			case PS_Error:
			case PS_False:
			case PS_ImmediateExit:
			case PS_Incomplete:
			case PS_Logic:
			case PS_Memout:
			case PS_Sat:
			case PS_Success:
			case PS_Theory:
			case PS_True:
			case PS_Unknown:
			case PS_Unsupported:
			case PS_Unsat:
			case UndefinedSymbol:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				symbol();
				}
				break;
			case ParOpen:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				match(ParOpen);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ParOpen) | (1L << String) | (1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Numeral - 66)) | (1L << (Binary - 66)) | (1L << (HexDecimal - 66)) | (1L << (Decimal - 66)) | (1L << (Colon - 66)) | (1L << (PK_AllStatistics - 66)) | (1L << (PK_AssertionStackLevels - 66)) | (1L << (PK_Authors - 66)) | (1L << (PK_Category - 66)) | (1L << (PK_Chainable - 66)) | (1L << (PK_Definition - 66)) | (1L << (PK_DiagnosticOutputChannel - 66)) | (1L << (PK_ErrorBehaviour - 66)) | (1L << (PK_Extension - 66)) | (1L << (PK_Funs - 66)) | (1L << (PK_FunsDescription - 66)) | (1L << (PK_GlobalDeclarations - 66)) | (1L << (PK_InteractiveMode - 66)) | (1L << (PK_Language - 66)) | (1L << (PK_LeftAssoc - 66)) | (1L << (PK_License - 66)) | (1L << (PK_Named - 66)) | (1L << (PK_Name - 66)) | (1L << (PK_Notes - 66)) | (1L << (PK_Pattern - 66)) | (1L << (PK_PrintSuccess - 66)) | (1L << (PK_ProduceAssertions - 66)) | (1L << (PK_ProduceAssignments - 66)) | (1L << (PK_ProduceModels - 66)) | (1L << (PK_ProduceProofs - 66)) | (1L << (PK_ProduceUnsatAssumptions - 66)) | (1L << (PK_ProduceUnsatCores - 66)) | (1L << (PK_RandomSeed - 66)) | (1L << (PK_ReasonUnknown - 66)) | (1L << (PK_RegularOutputChannel - 66)) | (1L << (PK_ReproducibleResourceLimit - 66)) | (1L << (PK_RightAssoc - 66)) | (1L << (PK_SmtLibVersion - 66)) | (1L << (PK_Sorts - 66)) | (1L << (PK_SortsDescription - 66)) | (1L << (PK_Source - 66)) | (1L << (PK_Status - 66)) | (1L << (PK_Theories - 66)) | (1L << (PK_Values - 66)) | (1L << (PK_Verbosity - 66)) | (1L << (PK_Version - 66)) | (1L << (UndefinedSymbol - 66)))) != 0)) {
					{
					{
					setState(271);
					s_expr();
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277);
				match(ParClose);
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

	public static class AttributeContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Attribute_valueContext attribute_value() {
			return getRuleContext(Attribute_valueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_attribute);
		try {
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				keyword();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				keyword();
				setState(282);
				attribute_value();
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

	public static class SortContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<SortContext> sort() {
			return getRuleContexts(SortContext.class);
		}
		public SortContext sort(int i) {
			return getRuleContext(SortContext.class,i);
		}
		public SortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitSort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortContext sort() throws RecognitionException {
		SortContext _localctx = new SortContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sort);
		int _la;
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(ParOpen);
				setState(288);
				identifier();
				setState(290); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(289);
					sort();
					}
					}
					setState(292); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ParOpen) | (1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || _la==UndefinedSymbol );
				setState(294);
				match(ParClose);
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

	public static class Qual_identiferContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode GRW_As() { return getToken(SMTLIBv2Parser.GRW_As, 0); }
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public Qual_identiferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qual_identifer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterQual_identifer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitQual_identifer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitQual_identifer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qual_identiferContext qual_identifer() throws RecognitionException {
		Qual_identiferContext _localctx = new Qual_identiferContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_qual_identifer);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(ParOpen);
				setState(300);
				match(GRW_As);
				setState(301);
				identifier();
				setState(302);
				sort();
				setState(303);
				match(ParClose);
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

	public static class Var_bindingContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public Var_bindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterVar_binding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitVar_binding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitVar_binding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_bindingContext var_binding() throws RecognitionException {
		Var_bindingContext _localctx = new Var_bindingContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_var_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(ParOpen);
			setState(308);
			symbol();
			setState(309);
			term();
			setState(310);
			match(ParClose);
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

	public static class Sorted_varContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public Sorted_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sorted_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterSorted_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitSorted_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitSorted_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sorted_varContext sorted_var() throws RecognitionException {
		Sorted_varContext _localctx = new Sorted_varContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sorted_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(ParOpen);
			setState(313);
			symbol();
			setState(314);
			sort();
			setState(315);
			match(ParClose);
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

	public static class PatternContext extends ParserRuleContext {
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pattern);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QuotedSymbol:
			case PS_Not:
			case PS_Bool:
			case PS_ContinuedExecution:
			case PS_Error:
			case PS_False:
			case PS_ImmediateExit:
			case PS_Incomplete:
			case PS_Logic:
			case PS_Memout:
			case PS_Sat:
			case PS_Success:
			case PS_Theory:
			case PS_True:
			case PS_Unknown:
			case PS_Unsupported:
			case PS_Unsat:
			case UndefinedSymbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(317);
				symbol();
				}
				break;
			case ParOpen:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(ParOpen);
				setState(319);
				symbol();
				setState(321); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(320);
					symbol();
					}
					}
					setState(323); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || _la==UndefinedSymbol );
				setState(325);
				match(ParClose);
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

	public static class Match_caseContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public Match_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterMatch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitMatch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitMatch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_caseContext match_case() throws RecognitionException {
		Match_caseContext _localctx = new Match_caseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_match_case);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(ParOpen);
			setState(330);
			pattern();
			setState(331);
			term();
			setState(332);
			match(ParClose);
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

	public static class TermContext extends ParserRuleContext {
		public Spec_constantContext spec_constant() {
			return getRuleContext(Spec_constantContext.class,0);
		}
		public Qual_identiferContext qual_identifer() {
			return getRuleContext(Qual_identiferContext.class,0);
		}
		public List<TerminalNode> ParOpen() { return getTokens(SMTLIBv2Parser.ParOpen); }
		public TerminalNode ParOpen(int i) {
			return getToken(SMTLIBv2Parser.ParOpen, i);
		}
		public List<TerminalNode> ParClose() { return getTokens(SMTLIBv2Parser.ParClose); }
		public TerminalNode ParClose(int i) {
			return getToken(SMTLIBv2Parser.ParClose, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode GRW_Let() { return getToken(SMTLIBv2Parser.GRW_Let, 0); }
		public List<Var_bindingContext> var_binding() {
			return getRuleContexts(Var_bindingContext.class);
		}
		public Var_bindingContext var_binding(int i) {
			return getRuleContext(Var_bindingContext.class,i);
		}
		public TerminalNode GRW_Forall() { return getToken(SMTLIBv2Parser.GRW_Forall, 0); }
		public List<Sorted_varContext> sorted_var() {
			return getRuleContexts(Sorted_varContext.class);
		}
		public Sorted_varContext sorted_var(int i) {
			return getRuleContext(Sorted_varContext.class,i);
		}
		public TerminalNode GRW_Exists() { return getToken(SMTLIBv2Parser.GRW_Exists, 0); }
		public TerminalNode GRW_Match() { return getToken(SMTLIBv2Parser.GRW_Match, 0); }
		public List<Match_caseContext> match_case() {
			return getRuleContexts(Match_caseContext.class);
		}
		public Match_caseContext match_case(int i) {
			return getRuleContext(Match_caseContext.class,i);
		}
		public TerminalNode GRW_Exclamation() { return getToken(SMTLIBv2Parser.GRW_Exclamation, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_term);
		int _la;
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				spec_constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				qual_identifer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				match(ParOpen);
				setState(337);
				qual_identifer();
				setState(339); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(338);
					term();
					}
					}
					setState(341); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ParOpen) | (1L << String) | (1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Numeral - 66)) | (1L << (Binary - 66)) | (1L << (HexDecimal - 66)) | (1L << (Decimal - 66)) | (1L << (UndefinedSymbol - 66)))) != 0) );
				setState(343);
				match(ParClose);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(345);
				match(ParOpen);
				setState(346);
				match(GRW_Let);
				setState(347);
				match(ParOpen);
				setState(349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(348);
					var_binding();
					}
					}
					setState(351); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ParOpen );
				setState(353);
				match(ParClose);
				setState(354);
				term();
				setState(355);
				match(ParClose);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(357);
				match(ParOpen);
				setState(358);
				match(GRW_Forall);
				setState(359);
				match(ParOpen);
				setState(361); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(360);
					sorted_var();
					}
					}
					setState(363); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ParOpen );
				setState(365);
				match(ParClose);
				setState(366);
				term();
				setState(367);
				match(ParClose);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(369);
				match(ParOpen);
				setState(370);
				match(GRW_Exists);
				setState(371);
				match(ParOpen);
				setState(373); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(372);
					sorted_var();
					}
					}
					setState(375); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ParOpen );
				setState(377);
				match(ParClose);
				setState(378);
				term();
				setState(379);
				match(ParClose);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(381);
				match(ParOpen);
				setState(382);
				match(GRW_Match);
				setState(383);
				term();
				setState(384);
				match(ParOpen);
				setState(386); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(385);
					match_case();
					}
					}
					setState(388); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ParOpen );
				setState(390);
				match(ParClose);
				setState(391);
				match(ParClose);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(393);
				match(ParOpen);
				setState(394);
				match(GRW_Exclamation);
				setState(395);
				term();
				setState(397); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(396);
					attribute();
					}
					}
					setState(399); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Colon - 70)) | (1L << (PK_AllStatistics - 70)) | (1L << (PK_AssertionStackLevels - 70)) | (1L << (PK_Authors - 70)) | (1L << (PK_Category - 70)) | (1L << (PK_Chainable - 70)) | (1L << (PK_Definition - 70)) | (1L << (PK_DiagnosticOutputChannel - 70)) | (1L << (PK_ErrorBehaviour - 70)) | (1L << (PK_Extension - 70)) | (1L << (PK_Funs - 70)) | (1L << (PK_FunsDescription - 70)) | (1L << (PK_GlobalDeclarations - 70)) | (1L << (PK_InteractiveMode - 70)) | (1L << (PK_Language - 70)) | (1L << (PK_LeftAssoc - 70)) | (1L << (PK_License - 70)) | (1L << (PK_Named - 70)) | (1L << (PK_Name - 70)) | (1L << (PK_Notes - 70)) | (1L << (PK_Pattern - 70)) | (1L << (PK_PrintSuccess - 70)) | (1L << (PK_ProduceAssertions - 70)) | (1L << (PK_ProduceAssignments - 70)) | (1L << (PK_ProduceModels - 70)) | (1L << (PK_ProduceProofs - 70)) | (1L << (PK_ProduceUnsatAssumptions - 70)) | (1L << (PK_ProduceUnsatCores - 70)) | (1L << (PK_RandomSeed - 70)) | (1L << (PK_ReasonUnknown - 70)) | (1L << (PK_RegularOutputChannel - 70)) | (1L << (PK_ReproducibleResourceLimit - 70)) | (1L << (PK_RightAssoc - 70)) | (1L << (PK_SmtLibVersion - 70)) | (1L << (PK_Sorts - 70)) | (1L << (PK_SortsDescription - 70)) | (1L << (PK_Source - 70)) | (1L << (PK_Status - 70)) | (1L << (PK_Theories - 70)) | (1L << (PK_Values - 70)) | (1L << (PK_Verbosity - 70)) | (1L << (PK_Version - 70)))) != 0) );
				setState(401);
				match(ParClose);
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

	public static class Sort_symbol_declContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumeralContext numeral() {
			return getRuleContext(NumeralContext.class,0);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Sort_symbol_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_symbol_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterSort_symbol_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitSort_symbol_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitSort_symbol_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sort_symbol_declContext sort_symbol_decl() throws RecognitionException {
		Sort_symbol_declContext _localctx = new Sort_symbol_declContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sort_symbol_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(ParOpen);
			setState(406);
			identifier();
			setState(407);
			numeral();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Colon - 70)) | (1L << (PK_AllStatistics - 70)) | (1L << (PK_AssertionStackLevels - 70)) | (1L << (PK_Authors - 70)) | (1L << (PK_Category - 70)) | (1L << (PK_Chainable - 70)) | (1L << (PK_Definition - 70)) | (1L << (PK_DiagnosticOutputChannel - 70)) | (1L << (PK_ErrorBehaviour - 70)) | (1L << (PK_Extension - 70)) | (1L << (PK_Funs - 70)) | (1L << (PK_FunsDescription - 70)) | (1L << (PK_GlobalDeclarations - 70)) | (1L << (PK_InteractiveMode - 70)) | (1L << (PK_Language - 70)) | (1L << (PK_LeftAssoc - 70)) | (1L << (PK_License - 70)) | (1L << (PK_Named - 70)) | (1L << (PK_Name - 70)) | (1L << (PK_Notes - 70)) | (1L << (PK_Pattern - 70)) | (1L << (PK_PrintSuccess - 70)) | (1L << (PK_ProduceAssertions - 70)) | (1L << (PK_ProduceAssignments - 70)) | (1L << (PK_ProduceModels - 70)) | (1L << (PK_ProduceProofs - 70)) | (1L << (PK_ProduceUnsatAssumptions - 70)) | (1L << (PK_ProduceUnsatCores - 70)) | (1L << (PK_RandomSeed - 70)) | (1L << (PK_ReasonUnknown - 70)) | (1L << (PK_RegularOutputChannel - 70)) | (1L << (PK_ReproducibleResourceLimit - 70)) | (1L << (PK_RightAssoc - 70)) | (1L << (PK_SmtLibVersion - 70)) | (1L << (PK_Sorts - 70)) | (1L << (PK_SortsDescription - 70)) | (1L << (PK_Source - 70)) | (1L << (PK_Status - 70)) | (1L << (PK_Theories - 70)) | (1L << (PK_Values - 70)) | (1L << (PK_Verbosity - 70)) | (1L << (PK_Version - 70)))) != 0)) {
				{
				{
				setState(408);
				attribute();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			match(ParClose);
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

	public static class Meta_spec_constantContext extends ParserRuleContext {
		public TerminalNode GRW_Numeral() { return getToken(SMTLIBv2Parser.GRW_Numeral, 0); }
		public TerminalNode GRW_Decimal() { return getToken(SMTLIBv2Parser.GRW_Decimal, 0); }
		public TerminalNode GRW_String() { return getToken(SMTLIBv2Parser.GRW_String, 0); }
		public Meta_spec_constantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_meta_spec_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterMeta_spec_constant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitMeta_spec_constant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitMeta_spec_constant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Meta_spec_constantContext meta_spec_constant() throws RecognitionException {
		Meta_spec_constantContext _localctx = new Meta_spec_constantContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_meta_spec_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !(((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & ((1L << (GRW_Decimal - 57)) | (1L << (GRW_Numeral - 57)) | (1L << (GRW_String - 57)))) != 0)) ) {
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

	public static class Fun_symbol_declContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public Spec_constantContext spec_constant() {
			return getRuleContext(Spec_constantContext.class,0);
		}
		public List<SortContext> sort() {
			return getRuleContexts(SortContext.class);
		}
		public SortContext sort(int i) {
			return getRuleContext(SortContext.class,i);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Meta_spec_constantContext meta_spec_constant() {
			return getRuleContext(Meta_spec_constantContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Fun_symbol_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_symbol_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterFun_symbol_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitFun_symbol_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitFun_symbol_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_symbol_declContext fun_symbol_decl() throws RecognitionException {
		Fun_symbol_declContext _localctx = new Fun_symbol_declContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_fun_symbol_decl);
		int _la;
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				match(ParOpen);
				setState(419);
				spec_constant();
				setState(420);
				sort();
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Colon - 70)) | (1L << (PK_AllStatistics - 70)) | (1L << (PK_AssertionStackLevels - 70)) | (1L << (PK_Authors - 70)) | (1L << (PK_Category - 70)) | (1L << (PK_Chainable - 70)) | (1L << (PK_Definition - 70)) | (1L << (PK_DiagnosticOutputChannel - 70)) | (1L << (PK_ErrorBehaviour - 70)) | (1L << (PK_Extension - 70)) | (1L << (PK_Funs - 70)) | (1L << (PK_FunsDescription - 70)) | (1L << (PK_GlobalDeclarations - 70)) | (1L << (PK_InteractiveMode - 70)) | (1L << (PK_Language - 70)) | (1L << (PK_LeftAssoc - 70)) | (1L << (PK_License - 70)) | (1L << (PK_Named - 70)) | (1L << (PK_Name - 70)) | (1L << (PK_Notes - 70)) | (1L << (PK_Pattern - 70)) | (1L << (PK_PrintSuccess - 70)) | (1L << (PK_ProduceAssertions - 70)) | (1L << (PK_ProduceAssignments - 70)) | (1L << (PK_ProduceModels - 70)) | (1L << (PK_ProduceProofs - 70)) | (1L << (PK_ProduceUnsatAssumptions - 70)) | (1L << (PK_ProduceUnsatCores - 70)) | (1L << (PK_RandomSeed - 70)) | (1L << (PK_ReasonUnknown - 70)) | (1L << (PK_RegularOutputChannel - 70)) | (1L << (PK_ReproducibleResourceLimit - 70)) | (1L << (PK_RightAssoc - 70)) | (1L << (PK_SmtLibVersion - 70)) | (1L << (PK_Sorts - 70)) | (1L << (PK_SortsDescription - 70)) | (1L << (PK_Source - 70)) | (1L << (PK_Status - 70)) | (1L << (PK_Theories - 70)) | (1L << (PK_Values - 70)) | (1L << (PK_Verbosity - 70)) | (1L << (PK_Version - 70)))) != 0)) {
					{
					{
					setState(421);
					attribute();
					}
					}
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(427);
				match(ParClose);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(ParOpen);
				setState(430);
				meta_spec_constant();
				setState(431);
				sort();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Colon - 70)) | (1L << (PK_AllStatistics - 70)) | (1L << (PK_AssertionStackLevels - 70)) | (1L << (PK_Authors - 70)) | (1L << (PK_Category - 70)) | (1L << (PK_Chainable - 70)) | (1L << (PK_Definition - 70)) | (1L << (PK_DiagnosticOutputChannel - 70)) | (1L << (PK_ErrorBehaviour - 70)) | (1L << (PK_Extension - 70)) | (1L << (PK_Funs - 70)) | (1L << (PK_FunsDescription - 70)) | (1L << (PK_GlobalDeclarations - 70)) | (1L << (PK_InteractiveMode - 70)) | (1L << (PK_Language - 70)) | (1L << (PK_LeftAssoc - 70)) | (1L << (PK_License - 70)) | (1L << (PK_Named - 70)) | (1L << (PK_Name - 70)) | (1L << (PK_Notes - 70)) | (1L << (PK_Pattern - 70)) | (1L << (PK_PrintSuccess - 70)) | (1L << (PK_ProduceAssertions - 70)) | (1L << (PK_ProduceAssignments - 70)) | (1L << (PK_ProduceModels - 70)) | (1L << (PK_ProduceProofs - 70)) | (1L << (PK_ProduceUnsatAssumptions - 70)) | (1L << (PK_ProduceUnsatCores - 70)) | (1L << (PK_RandomSeed - 70)) | (1L << (PK_ReasonUnknown - 70)) | (1L << (PK_RegularOutputChannel - 70)) | (1L << (PK_ReproducibleResourceLimit - 70)) | (1L << (PK_RightAssoc - 70)) | (1L << (PK_SmtLibVersion - 70)) | (1L << (PK_Sorts - 70)) | (1L << (PK_SortsDescription - 70)) | (1L << (PK_Source - 70)) | (1L << (PK_Status - 70)) | (1L << (PK_Theories - 70)) | (1L << (PK_Values - 70)) | (1L << (PK_Verbosity - 70)) | (1L << (PK_Version - 70)))) != 0)) {
					{
					{
					setState(432);
					attribute();
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(438);
				match(ParClose);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(440);
				match(ParOpen);
				setState(441);
				identifier();
				setState(443); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(442);
					sort();
					}
					}
					setState(445); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ParOpen) | (1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || _la==UndefinedSymbol );
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Colon - 70)) | (1L << (PK_AllStatistics - 70)) | (1L << (PK_AssertionStackLevels - 70)) | (1L << (PK_Authors - 70)) | (1L << (PK_Category - 70)) | (1L << (PK_Chainable - 70)) | (1L << (PK_Definition - 70)) | (1L << (PK_DiagnosticOutputChannel - 70)) | (1L << (PK_ErrorBehaviour - 70)) | (1L << (PK_Extension - 70)) | (1L << (PK_Funs - 70)) | (1L << (PK_FunsDescription - 70)) | (1L << (PK_GlobalDeclarations - 70)) | (1L << (PK_InteractiveMode - 70)) | (1L << (PK_Language - 70)) | (1L << (PK_LeftAssoc - 70)) | (1L << (PK_License - 70)) | (1L << (PK_Named - 70)) | (1L << (PK_Name - 70)) | (1L << (PK_Notes - 70)) | (1L << (PK_Pattern - 70)) | (1L << (PK_PrintSuccess - 70)) | (1L << (PK_ProduceAssertions - 70)) | (1L << (PK_ProduceAssignments - 70)) | (1L << (PK_ProduceModels - 70)) | (1L << (PK_ProduceProofs - 70)) | (1L << (PK_ProduceUnsatAssumptions - 70)) | (1L << (PK_ProduceUnsatCores - 70)) | (1L << (PK_RandomSeed - 70)) | (1L << (PK_ReasonUnknown - 70)) | (1L << (PK_RegularOutputChannel - 70)) | (1L << (PK_ReproducibleResourceLimit - 70)) | (1L << (PK_RightAssoc - 70)) | (1L << (PK_SmtLibVersion - 70)) | (1L << (PK_Sorts - 70)) | (1L << (PK_SortsDescription - 70)) | (1L << (PK_Source - 70)) | (1L << (PK_Status - 70)) | (1L << (PK_Theories - 70)) | (1L << (PK_Values - 70)) | (1L << (PK_Verbosity - 70)) | (1L << (PK_Version - 70)))) != 0)) {
					{
					{
					setState(447);
					attribute();
					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(453);
				match(ParClose);
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

	public static class Par_fun_symbol_declContext extends ParserRuleContext {
		public Fun_symbol_declContext fun_symbol_decl() {
			return getRuleContext(Fun_symbol_declContext.class,0);
		}
		public List<TerminalNode> ParOpen() { return getTokens(SMTLIBv2Parser.ParOpen); }
		public TerminalNode ParOpen(int i) {
			return getToken(SMTLIBv2Parser.ParOpen, i);
		}
		public TerminalNode GRW_Par() { return getToken(SMTLIBv2Parser.GRW_Par, 0); }
		public List<TerminalNode> ParClose() { return getTokens(SMTLIBv2Parser.ParClose); }
		public TerminalNode ParClose(int i) {
			return getToken(SMTLIBv2Parser.ParClose, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public List<SortContext> sort() {
			return getRuleContexts(SortContext.class);
		}
		public SortContext sort(int i) {
			return getRuleContext(SortContext.class,i);
		}
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Par_fun_symbol_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par_fun_symbol_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterPar_fun_symbol_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitPar_fun_symbol_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitPar_fun_symbol_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Par_fun_symbol_declContext par_fun_symbol_decl() throws RecognitionException {
		Par_fun_symbol_declContext _localctx = new Par_fun_symbol_declContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_par_fun_symbol_decl);
		int _la;
		try {
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				fun_symbol_decl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(ParOpen);
				setState(459);
				match(GRW_Par);
				setState(460);
				match(ParOpen);
				setState(462); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(461);
					symbol();
					}
					}
					setState(464); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || _la==UndefinedSymbol );
				setState(466);
				match(ParClose);
				setState(467);
				match(ParOpen);
				setState(468);
				identifier();
				setState(470); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(469);
					sort();
					}
					}
					setState(472); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ParOpen) | (1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || _la==UndefinedSymbol );
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Colon - 70)) | (1L << (PK_AllStatistics - 70)) | (1L << (PK_AssertionStackLevels - 70)) | (1L << (PK_Authors - 70)) | (1L << (PK_Category - 70)) | (1L << (PK_Chainable - 70)) | (1L << (PK_Definition - 70)) | (1L << (PK_DiagnosticOutputChannel - 70)) | (1L << (PK_ErrorBehaviour - 70)) | (1L << (PK_Extension - 70)) | (1L << (PK_Funs - 70)) | (1L << (PK_FunsDescription - 70)) | (1L << (PK_GlobalDeclarations - 70)) | (1L << (PK_InteractiveMode - 70)) | (1L << (PK_Language - 70)) | (1L << (PK_LeftAssoc - 70)) | (1L << (PK_License - 70)) | (1L << (PK_Named - 70)) | (1L << (PK_Name - 70)) | (1L << (PK_Notes - 70)) | (1L << (PK_Pattern - 70)) | (1L << (PK_PrintSuccess - 70)) | (1L << (PK_ProduceAssertions - 70)) | (1L << (PK_ProduceAssignments - 70)) | (1L << (PK_ProduceModels - 70)) | (1L << (PK_ProduceProofs - 70)) | (1L << (PK_ProduceUnsatAssumptions - 70)) | (1L << (PK_ProduceUnsatCores - 70)) | (1L << (PK_RandomSeed - 70)) | (1L << (PK_ReasonUnknown - 70)) | (1L << (PK_RegularOutputChannel - 70)) | (1L << (PK_ReproducibleResourceLimit - 70)) | (1L << (PK_RightAssoc - 70)) | (1L << (PK_SmtLibVersion - 70)) | (1L << (PK_Sorts - 70)) | (1L << (PK_SortsDescription - 70)) | (1L << (PK_Source - 70)) | (1L << (PK_Status - 70)) | (1L << (PK_Theories - 70)) | (1L << (PK_Values - 70)) | (1L << (PK_Verbosity - 70)) | (1L << (PK_Version - 70)))) != 0)) {
					{
					{
					setState(474);
					attribute();
					}
					}
					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(480);
				match(ParClose);
				setState(481);
				match(ParClose);
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

	public static class Theory_attributeContext extends ParserRuleContext {
		public TerminalNode PK_Sorts() { return getToken(SMTLIBv2Parser.PK_Sorts, 0); }
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<Sort_symbol_declContext> sort_symbol_decl() {
			return getRuleContexts(Sort_symbol_declContext.class);
		}
		public Sort_symbol_declContext sort_symbol_decl(int i) {
			return getRuleContext(Sort_symbol_declContext.class,i);
		}
		public TerminalNode PK_Funs() { return getToken(SMTLIBv2Parser.PK_Funs, 0); }
		public List<Par_fun_symbol_declContext> par_fun_symbol_decl() {
			return getRuleContexts(Par_fun_symbol_declContext.class);
		}
		public Par_fun_symbol_declContext par_fun_symbol_decl(int i) {
			return getRuleContext(Par_fun_symbol_declContext.class,i);
		}
		public TerminalNode PK_SortsDescription() { return getToken(SMTLIBv2Parser.PK_SortsDescription, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode PK_FunsDescription() { return getToken(SMTLIBv2Parser.PK_FunsDescription, 0); }
		public TerminalNode PK_Definition() { return getToken(SMTLIBv2Parser.PK_Definition, 0); }
		public TerminalNode PK_Values() { return getToken(SMTLIBv2Parser.PK_Values, 0); }
		public TerminalNode PK_Notes() { return getToken(SMTLIBv2Parser.PK_Notes, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public Theory_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theory_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterTheory_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitTheory_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitTheory_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Theory_attributeContext theory_attribute() throws RecognitionException {
		Theory_attributeContext _localctx = new Theory_attributeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_theory_attribute);
		int _la;
		try {
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				match(PK_Sorts);
				setState(486);
				match(ParOpen);
				setState(488); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(487);
					sort_symbol_decl();
					}
					}
					setState(490); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ParOpen );
				setState(492);
				match(ParClose);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(494);
				match(PK_Funs);
				setState(495);
				match(ParOpen);
				setState(497); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(496);
					par_fun_symbol_decl();
					}
					}
					setState(499); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ParOpen );
				setState(501);
				match(ParClose);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(503);
				match(PK_SortsDescription);
				setState(504);
				string();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				match(PK_FunsDescription);
				setState(506);
				string();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(507);
				match(PK_Definition);
				setState(508);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(509);
				match(PK_Values);
				setState(510);
				string();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(511);
				match(PK_Notes);
				setState(512);
				string();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(513);
				attribute();
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

	public static class Theory_declContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode PS_Theory() { return getToken(SMTLIBv2Parser.PS_Theory, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<Theory_attributeContext> theory_attribute() {
			return getRuleContexts(Theory_attributeContext.class);
		}
		public Theory_attributeContext theory_attribute(int i) {
			return getRuleContext(Theory_attributeContext.class,i);
		}
		public Theory_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_theory_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterTheory_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitTheory_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitTheory_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Theory_declContext theory_decl() throws RecognitionException {
		Theory_declContext _localctx = new Theory_declContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_theory_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(ParOpen);
			setState(517);
			match(PS_Theory);
			setState(518);
			symbol();
			setState(520); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(519);
				theory_attribute();
				}
				}
				setState(522); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Colon - 70)) | (1L << (PK_AllStatistics - 70)) | (1L << (PK_AssertionStackLevels - 70)) | (1L << (PK_Authors - 70)) | (1L << (PK_Category - 70)) | (1L << (PK_Chainable - 70)) | (1L << (PK_Definition - 70)) | (1L << (PK_DiagnosticOutputChannel - 70)) | (1L << (PK_ErrorBehaviour - 70)) | (1L << (PK_Extension - 70)) | (1L << (PK_Funs - 70)) | (1L << (PK_FunsDescription - 70)) | (1L << (PK_GlobalDeclarations - 70)) | (1L << (PK_InteractiveMode - 70)) | (1L << (PK_Language - 70)) | (1L << (PK_LeftAssoc - 70)) | (1L << (PK_License - 70)) | (1L << (PK_Named - 70)) | (1L << (PK_Name - 70)) | (1L << (PK_Notes - 70)) | (1L << (PK_Pattern - 70)) | (1L << (PK_PrintSuccess - 70)) | (1L << (PK_ProduceAssertions - 70)) | (1L << (PK_ProduceAssignments - 70)) | (1L << (PK_ProduceModels - 70)) | (1L << (PK_ProduceProofs - 70)) | (1L << (PK_ProduceUnsatAssumptions - 70)) | (1L << (PK_ProduceUnsatCores - 70)) | (1L << (PK_RandomSeed - 70)) | (1L << (PK_ReasonUnknown - 70)) | (1L << (PK_RegularOutputChannel - 70)) | (1L << (PK_ReproducibleResourceLimit - 70)) | (1L << (PK_RightAssoc - 70)) | (1L << (PK_SmtLibVersion - 70)) | (1L << (PK_Sorts - 70)) | (1L << (PK_SortsDescription - 70)) | (1L << (PK_Source - 70)) | (1L << (PK_Status - 70)) | (1L << (PK_Theories - 70)) | (1L << (PK_Values - 70)) | (1L << (PK_Verbosity - 70)) | (1L << (PK_Version - 70)))) != 0) );
			setState(524);
			match(ParClose);
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

	public static class Logic_attribueContext extends ParserRuleContext {
		public TerminalNode PK_Theories() { return getToken(SMTLIBv2Parser.PK_Theories, 0); }
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public TerminalNode PK_Language() { return getToken(SMTLIBv2Parser.PK_Language, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode PK_Extension() { return getToken(SMTLIBv2Parser.PK_Extension, 0); }
		public TerminalNode PK_Values() { return getToken(SMTLIBv2Parser.PK_Values, 0); }
		public TerminalNode PK_Notes() { return getToken(SMTLIBv2Parser.PK_Notes, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public Logic_attribueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_attribue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterLogic_attribue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitLogic_attribue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitLogic_attribue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_attribueContext logic_attribue() throws RecognitionException {
		Logic_attribueContext _localctx = new Logic_attribueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_logic_attribue);
		int _la;
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				match(PK_Theories);
				setState(527);
				match(ParOpen);
				setState(529); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(528);
					symbol();
					}
					}
					setState(531); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || _la==UndefinedSymbol );
				setState(533);
				match(ParClose);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				match(PK_Language);
				setState(536);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(537);
				match(PK_Extension);
				setState(538);
				string();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(539);
				match(PK_Values);
				setState(540);
				string();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(541);
				match(PK_Notes);
				setState(542);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(543);
				attribute();
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

	public static class LogicContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode PS_Logic() { return getToken(SMTLIBv2Parser.PS_Logic, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<Logic_attribueContext> logic_attribue() {
			return getRuleContexts(Logic_attribueContext.class);
		}
		public Logic_attribueContext logic_attribue(int i) {
			return getRuleContext(Logic_attribueContext.class,i);
		}
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_logic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			match(ParOpen);
			setState(547);
			match(PS_Logic);
			setState(548);
			symbol();
			setState(550); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(549);
				logic_attribue();
				}
				}
				setState(552); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Colon - 70)) | (1L << (PK_AllStatistics - 70)) | (1L << (PK_AssertionStackLevels - 70)) | (1L << (PK_Authors - 70)) | (1L << (PK_Category - 70)) | (1L << (PK_Chainable - 70)) | (1L << (PK_Definition - 70)) | (1L << (PK_DiagnosticOutputChannel - 70)) | (1L << (PK_ErrorBehaviour - 70)) | (1L << (PK_Extension - 70)) | (1L << (PK_Funs - 70)) | (1L << (PK_FunsDescription - 70)) | (1L << (PK_GlobalDeclarations - 70)) | (1L << (PK_InteractiveMode - 70)) | (1L << (PK_Language - 70)) | (1L << (PK_LeftAssoc - 70)) | (1L << (PK_License - 70)) | (1L << (PK_Named - 70)) | (1L << (PK_Name - 70)) | (1L << (PK_Notes - 70)) | (1L << (PK_Pattern - 70)) | (1L << (PK_PrintSuccess - 70)) | (1L << (PK_ProduceAssertions - 70)) | (1L << (PK_ProduceAssignments - 70)) | (1L << (PK_ProduceModels - 70)) | (1L << (PK_ProduceProofs - 70)) | (1L << (PK_ProduceUnsatAssumptions - 70)) | (1L << (PK_ProduceUnsatCores - 70)) | (1L << (PK_RandomSeed - 70)) | (1L << (PK_ReasonUnknown - 70)) | (1L << (PK_RegularOutputChannel - 70)) | (1L << (PK_ReproducibleResourceLimit - 70)) | (1L << (PK_RightAssoc - 70)) | (1L << (PK_SmtLibVersion - 70)) | (1L << (PK_Sorts - 70)) | (1L << (PK_SortsDescription - 70)) | (1L << (PK_Source - 70)) | (1L << (PK_Status - 70)) | (1L << (PK_Theories - 70)) | (1L << (PK_Values - 70)) | (1L << (PK_Verbosity - 70)) | (1L << (PK_Version - 70)))) != 0) );
			setState(554);
			match(ParClose);
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

	public static class Sort_decContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public NumeralContext numeral() {
			return getRuleContext(NumeralContext.class,0);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public Sort_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterSort_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitSort_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitSort_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sort_decContext sort_dec() throws RecognitionException {
		Sort_decContext _localctx = new Sort_decContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sort_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(ParOpen);
			setState(557);
			symbol();
			setState(558);
			numeral();
			setState(559);
			match(ParClose);
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

	public static class Selector_decContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public Selector_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterSelector_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitSelector_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitSelector_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selector_decContext selector_dec() throws RecognitionException {
		Selector_decContext _localctx = new Selector_decContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_selector_dec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(ParOpen);
			setState(562);
			symbol();
			setState(563);
			sort();
			setState(564);
			match(ParClose);
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

	public static class Constructor_decContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<Selector_decContext> selector_dec() {
			return getRuleContexts(Selector_decContext.class);
		}
		public Selector_decContext selector_dec(int i) {
			return getRuleContext(Selector_decContext.class,i);
		}
		public Constructor_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterConstructor_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitConstructor_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitConstructor_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constructor_decContext constructor_dec() throws RecognitionException {
		Constructor_decContext _localctx = new Constructor_decContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_constructor_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(ParOpen);
			setState(567);
			symbol();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ParOpen) {
				{
				{
				setState(568);
				selector_dec();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(574);
			match(ParClose);
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

	public static class Datatype_decContext extends ParserRuleContext {
		public List<TerminalNode> ParOpen() { return getTokens(SMTLIBv2Parser.ParOpen); }
		public TerminalNode ParOpen(int i) {
			return getToken(SMTLIBv2Parser.ParOpen, i);
		}
		public List<TerminalNode> ParClose() { return getTokens(SMTLIBv2Parser.ParClose); }
		public TerminalNode ParClose(int i) {
			return getToken(SMTLIBv2Parser.ParClose, i);
		}
		public List<Constructor_decContext> constructor_dec() {
			return getRuleContexts(Constructor_decContext.class);
		}
		public Constructor_decContext constructor_dec(int i) {
			return getRuleContext(Constructor_decContext.class,i);
		}
		public TerminalNode GRW_Par() { return getToken(SMTLIBv2Parser.GRW_Par, 0); }
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public Datatype_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterDatatype_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitDatatype_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitDatatype_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Datatype_decContext datatype_dec() throws RecognitionException {
		Datatype_decContext _localctx = new Datatype_decContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_datatype_dec);
		int _la;
		try {
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				match(ParOpen);
				setState(578); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(577);
					constructor_dec();
					}
					}
					setState(580); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ParOpen );
				setState(582);
				match(ParClose);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				match(ParOpen);
				setState(585);
				match(GRW_Par);
				setState(586);
				match(ParOpen);
				setState(588); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(587);
					symbol();
					}
					}
					setState(590); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || _la==UndefinedSymbol );
				setState(592);
				match(ParClose);
				setState(593);
				match(ParOpen);
				setState(595); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(594);
					constructor_dec();
					}
					}
					setState(597); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ParOpen );
				setState(599);
				match(ParClose);
				setState(600);
				match(ParClose);
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

	public static class Function_decContext extends ParserRuleContext {
		public List<TerminalNode> ParOpen() { return getTokens(SMTLIBv2Parser.ParOpen); }
		public TerminalNode ParOpen(int i) {
			return getToken(SMTLIBv2Parser.ParOpen, i);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public List<TerminalNode> ParClose() { return getTokens(SMTLIBv2Parser.ParClose); }
		public TerminalNode ParClose(int i) {
			return getToken(SMTLIBv2Parser.ParClose, i);
		}
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public List<Sorted_varContext> sorted_var() {
			return getRuleContexts(Sorted_varContext.class);
		}
		public Sorted_varContext sorted_var(int i) {
			return getRuleContext(Sorted_varContext.class,i);
		}
		public Function_decContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterFunction_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitFunction_dec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitFunction_dec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_decContext function_dec() throws RecognitionException {
		Function_decContext _localctx = new Function_decContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_function_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			match(ParOpen);
			setState(605);
			symbol();
			setState(606);
			match(ParOpen);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ParOpen) {
				{
				{
				setState(607);
				sorted_var();
				}
				}
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(613);
			match(ParClose);
			setState(614);
			sort();
			setState(615);
			match(ParClose);
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

	public static class Function_defContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public SortContext sort() {
			return getRuleContext(SortContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<Sorted_varContext> sorted_var() {
			return getRuleContexts(Sorted_varContext.class);
		}
		public Sorted_varContext sorted_var(int i) {
			return getRuleContext(Sorted_varContext.class,i);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitFunction_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitFunction_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			symbol();
			setState(618);
			match(ParOpen);
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ParOpen) {
				{
				{
				setState(619);
				sorted_var();
				}
				}
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(625);
			match(ParClose);
			setState(626);
			sort();
			setState(627);
			body();
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

	public static class BodyContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			term();
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

	public static class Prop_literalContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode PS_Not() { return getToken(SMTLIBv2Parser.PS_Not, 0); }
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public Prop_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterProp_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitProp_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitProp_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prop_literalContext prop_literal() throws RecognitionException {
		Prop_literalContext _localctx = new Prop_literalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_prop_literal);
		try {
			setState(637);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QuotedSymbol:
			case PS_Not:
			case PS_Bool:
			case PS_ContinuedExecution:
			case PS_Error:
			case PS_False:
			case PS_ImmediateExit:
			case PS_Incomplete:
			case PS_Logic:
			case PS_Memout:
			case PS_Sat:
			case PS_Success:
			case PS_Theory:
			case PS_True:
			case PS_Unknown:
			case PS_Unsupported:
			case PS_Unsat:
			case UndefinedSymbol:
				enterOuterAlt(_localctx, 1);
				{
				setState(631);
				symbol();
				}
				break;
			case ParOpen:
				enterOuterAlt(_localctx, 2);
				{
				setState(632);
				match(ParOpen);
				setState(633);
				match(PS_Not);
				setState(634);
				symbol();
				setState(635);
				match(ParClose);
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

	public static class ScriptContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ParOpen) {
				{
				{
				setState(639);
				command();
				}
				}
				setState(644);
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

	public static class Cmd_assertContext extends ParserRuleContext {
		public TerminalNode CMD_Assert() { return getToken(SMTLIBv2Parser.CMD_Assert, 0); }
		public Cmd_assertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_assert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_assert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_assert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_assert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_assertContext cmd_assert() throws RecognitionException {
		Cmd_assertContext _localctx = new Cmd_assertContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_cmd_assert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(CMD_Assert);
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

	public static class Cmd_checkSatContext extends ParserRuleContext {
		public TerminalNode CMD_CheckSat() { return getToken(SMTLIBv2Parser.CMD_CheckSat, 0); }
		public Cmd_checkSatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_checkSat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_checkSat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_checkSat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_checkSat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_checkSatContext cmd_checkSat() throws RecognitionException {
		Cmd_checkSatContext _localctx = new Cmd_checkSatContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_cmd_checkSat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(CMD_CheckSat);
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

	public static class Cmd_checkSatAssumingContext extends ParserRuleContext {
		public TerminalNode CMD_CheckSatAssuming() { return getToken(SMTLIBv2Parser.CMD_CheckSatAssuming, 0); }
		public Cmd_checkSatAssumingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_checkSatAssuming; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_checkSatAssuming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_checkSatAssuming(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_checkSatAssuming(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_checkSatAssumingContext cmd_checkSatAssuming() throws RecognitionException {
		Cmd_checkSatAssumingContext _localctx = new Cmd_checkSatAssumingContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_cmd_checkSatAssuming);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			match(CMD_CheckSatAssuming);
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

	public static class Cmd_declareConstContext extends ParserRuleContext {
		public TerminalNode CMD_DeclareConst() { return getToken(SMTLIBv2Parser.CMD_DeclareConst, 0); }
		public Cmd_declareConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_declareConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_declareConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_declareConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_declareConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_declareConstContext cmd_declareConst() throws RecognitionException {
		Cmd_declareConstContext _localctx = new Cmd_declareConstContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_cmd_declareConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(CMD_DeclareConst);
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

	public static class Cmd_declareDatatypeContext extends ParserRuleContext {
		public TerminalNode CMD_DeclareDatatype() { return getToken(SMTLIBv2Parser.CMD_DeclareDatatype, 0); }
		public Cmd_declareDatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_declareDatatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_declareDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_declareDatatype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_declareDatatype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_declareDatatypeContext cmd_declareDatatype() throws RecognitionException {
		Cmd_declareDatatypeContext _localctx = new Cmd_declareDatatypeContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_cmd_declareDatatype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			match(CMD_DeclareDatatype);
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

	public static class Cmd_declareDatatypesContext extends ParserRuleContext {
		public TerminalNode CMD_DeclareDatatypes() { return getToken(SMTLIBv2Parser.CMD_DeclareDatatypes, 0); }
		public Cmd_declareDatatypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_declareDatatypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_declareDatatypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_declareDatatypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_declareDatatypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_declareDatatypesContext cmd_declareDatatypes() throws RecognitionException {
		Cmd_declareDatatypesContext _localctx = new Cmd_declareDatatypesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_cmd_declareDatatypes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			match(CMD_DeclareDatatypes);
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

	public static class Cmd_declareFunContext extends ParserRuleContext {
		public TerminalNode CMD_DeclareFun() { return getToken(SMTLIBv2Parser.CMD_DeclareFun, 0); }
		public Cmd_declareFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_declareFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_declareFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_declareFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_declareFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_declareFunContext cmd_declareFun() throws RecognitionException {
		Cmd_declareFunContext _localctx = new Cmd_declareFunContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_cmd_declareFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(CMD_DeclareFun);
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

	public static class Cmd_declareSortContext extends ParserRuleContext {
		public TerminalNode CMD_DeclareSort() { return getToken(SMTLIBv2Parser.CMD_DeclareSort, 0); }
		public Cmd_declareSortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_declareSort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_declareSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_declareSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_declareSort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_declareSortContext cmd_declareSort() throws RecognitionException {
		Cmd_declareSortContext _localctx = new Cmd_declareSortContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_cmd_declareSort);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(CMD_DeclareSort);
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

	public static class Cmd_defineFunContext extends ParserRuleContext {
		public TerminalNode CMD_DefineFun() { return getToken(SMTLIBv2Parser.CMD_DefineFun, 0); }
		public Cmd_defineFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_defineFun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_defineFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_defineFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_defineFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_defineFunContext cmd_defineFun() throws RecognitionException {
		Cmd_defineFunContext _localctx = new Cmd_defineFunContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_cmd_defineFun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			match(CMD_DefineFun);
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

	public static class Cmd_defineFunRecContext extends ParserRuleContext {
		public TerminalNode CMD_DefineFunRec() { return getToken(SMTLIBv2Parser.CMD_DefineFunRec, 0); }
		public Cmd_defineFunRecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_defineFunRec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_defineFunRec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_defineFunRec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_defineFunRec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_defineFunRecContext cmd_defineFunRec() throws RecognitionException {
		Cmd_defineFunRecContext _localctx = new Cmd_defineFunRecContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_cmd_defineFunRec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(CMD_DefineFunRec);
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

	public static class Cmd_defineFunsRecContext extends ParserRuleContext {
		public TerminalNode CMD_DefineFunsRec() { return getToken(SMTLIBv2Parser.CMD_DefineFunsRec, 0); }
		public Cmd_defineFunsRecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_defineFunsRec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_defineFunsRec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_defineFunsRec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_defineFunsRec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_defineFunsRecContext cmd_defineFunsRec() throws RecognitionException {
		Cmd_defineFunsRecContext _localctx = new Cmd_defineFunsRecContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_cmd_defineFunsRec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(CMD_DefineFunsRec);
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

	public static class Cmd_defineSortContext extends ParserRuleContext {
		public TerminalNode CMD_DefineSort() { return getToken(SMTLIBv2Parser.CMD_DefineSort, 0); }
		public Cmd_defineSortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_defineSort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_defineSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_defineSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_defineSort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_defineSortContext cmd_defineSort() throws RecognitionException {
		Cmd_defineSortContext _localctx = new Cmd_defineSortContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_cmd_defineSort);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(CMD_DefineSort);
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

	public static class Cmd_echoContext extends ParserRuleContext {
		public TerminalNode CMD_Echo() { return getToken(SMTLIBv2Parser.CMD_Echo, 0); }
		public Cmd_echoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_echo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_echo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_echo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_echo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_echoContext cmd_echo() throws RecognitionException {
		Cmd_echoContext _localctx = new Cmd_echoContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_cmd_echo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(CMD_Echo);
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

	public static class Cmd_exitContext extends ParserRuleContext {
		public TerminalNode CMD_Exit() { return getToken(SMTLIBv2Parser.CMD_Exit, 0); }
		public Cmd_exitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_exit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_exit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_exit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_exit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_exitContext cmd_exit() throws RecognitionException {
		Cmd_exitContext _localctx = new Cmd_exitContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_cmd_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(CMD_Exit);
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

	public static class Cmd_getAssertionsContext extends ParserRuleContext {
		public TerminalNode CMD_GetAssertions() { return getToken(SMTLIBv2Parser.CMD_GetAssertions, 0); }
		public Cmd_getAssertionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_getAssertions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_getAssertions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_getAssertions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_getAssertions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_getAssertionsContext cmd_getAssertions() throws RecognitionException {
		Cmd_getAssertionsContext _localctx = new Cmd_getAssertionsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_cmd_getAssertions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(CMD_GetAssertions);
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

	public static class Cmd_getAssignmentContext extends ParserRuleContext {
		public TerminalNode CMD_GetAssignment() { return getToken(SMTLIBv2Parser.CMD_GetAssignment, 0); }
		public Cmd_getAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_getAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_getAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_getAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_getAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_getAssignmentContext cmd_getAssignment() throws RecognitionException {
		Cmd_getAssignmentContext _localctx = new Cmd_getAssignmentContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_cmd_getAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(CMD_GetAssignment);
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

	public static class Cmd_getInfoContext extends ParserRuleContext {
		public TerminalNode CMD_GetInfo() { return getToken(SMTLIBv2Parser.CMD_GetInfo, 0); }
		public Cmd_getInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_getInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_getInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_getInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_getInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_getInfoContext cmd_getInfo() throws RecognitionException {
		Cmd_getInfoContext _localctx = new Cmd_getInfoContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_cmd_getInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(CMD_GetInfo);
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

	public static class Cmd_getModelContext extends ParserRuleContext {
		public TerminalNode CMD_GetModel() { return getToken(SMTLIBv2Parser.CMD_GetModel, 0); }
		public Cmd_getModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_getModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_getModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_getModel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_getModel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_getModelContext cmd_getModel() throws RecognitionException {
		Cmd_getModelContext _localctx = new Cmd_getModelContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_cmd_getModel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(CMD_GetModel);
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

	public static class Cmd_getOptionContext extends ParserRuleContext {
		public TerminalNode CMD_GetOption() { return getToken(SMTLIBv2Parser.CMD_GetOption, 0); }
		public Cmd_getOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_getOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_getOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_getOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_getOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_getOptionContext cmd_getOption() throws RecognitionException {
		Cmd_getOptionContext _localctx = new Cmd_getOptionContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_cmd_getOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(CMD_GetOption);
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

	public static class Cmd_getProofContext extends ParserRuleContext {
		public TerminalNode CMD_GetProof() { return getToken(SMTLIBv2Parser.CMD_GetProof, 0); }
		public Cmd_getProofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_getProof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_getProof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_getProof(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_getProof(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_getProofContext cmd_getProof() throws RecognitionException {
		Cmd_getProofContext _localctx = new Cmd_getProofContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_cmd_getProof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			match(CMD_GetProof);
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

	public static class Cmd_getUnsatAssumptionsContext extends ParserRuleContext {
		public TerminalNode CMD_GetUnsatAssumptions() { return getToken(SMTLIBv2Parser.CMD_GetUnsatAssumptions, 0); }
		public Cmd_getUnsatAssumptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_getUnsatAssumptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_getUnsatAssumptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_getUnsatAssumptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_getUnsatAssumptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_getUnsatAssumptionsContext cmd_getUnsatAssumptions() throws RecognitionException {
		Cmd_getUnsatAssumptionsContext _localctx = new Cmd_getUnsatAssumptionsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_cmd_getUnsatAssumptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(CMD_GetUnsatAssumptions);
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

	public static class Cmd_getUnsatCoreContext extends ParserRuleContext {
		public TerminalNode CMD_GetUnsatCore() { return getToken(SMTLIBv2Parser.CMD_GetUnsatCore, 0); }
		public Cmd_getUnsatCoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_getUnsatCore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_getUnsatCore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_getUnsatCore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_getUnsatCore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_getUnsatCoreContext cmd_getUnsatCore() throws RecognitionException {
		Cmd_getUnsatCoreContext _localctx = new Cmd_getUnsatCoreContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_cmd_getUnsatCore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(CMD_GetUnsatCore);
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

	public static class Cmd_getValueContext extends ParserRuleContext {
		public TerminalNode CMD_GetValue() { return getToken(SMTLIBv2Parser.CMD_GetValue, 0); }
		public Cmd_getValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_getValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_getValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_getValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_getValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_getValueContext cmd_getValue() throws RecognitionException {
		Cmd_getValueContext _localctx = new Cmd_getValueContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_cmd_getValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(CMD_GetValue);
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

	public static class Cmd_popContext extends ParserRuleContext {
		public TerminalNode CMD_Pop() { return getToken(SMTLIBv2Parser.CMD_Pop, 0); }
		public Cmd_popContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_pop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_pop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_pop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_pop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_popContext cmd_pop() throws RecognitionException {
		Cmd_popContext _localctx = new Cmd_popContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_cmd_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(CMD_Pop);
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

	public static class Cmd_pushContext extends ParserRuleContext {
		public TerminalNode CMD_Push() { return getToken(SMTLIBv2Parser.CMD_Push, 0); }
		public Cmd_pushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_push(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_push(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_push(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_pushContext cmd_push() throws RecognitionException {
		Cmd_pushContext _localctx = new Cmd_pushContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_cmd_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			match(CMD_Push);
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

	public static class Cmd_resetContext extends ParserRuleContext {
		public TerminalNode CMD_Reset() { return getToken(SMTLIBv2Parser.CMD_Reset, 0); }
		public Cmd_resetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_reset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_reset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_reset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_reset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_resetContext cmd_reset() throws RecognitionException {
		Cmd_resetContext _localctx = new Cmd_resetContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_cmd_reset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(CMD_Reset);
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

	public static class Cmd_resetAssertionsContext extends ParserRuleContext {
		public TerminalNode CMD_ResetAssertions() { return getToken(SMTLIBv2Parser.CMD_ResetAssertions, 0); }
		public Cmd_resetAssertionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_resetAssertions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_resetAssertions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_resetAssertions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_resetAssertions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_resetAssertionsContext cmd_resetAssertions() throws RecognitionException {
		Cmd_resetAssertionsContext _localctx = new Cmd_resetAssertionsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_cmd_resetAssertions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			match(CMD_ResetAssertions);
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

	public static class Cmd_setInfoContext extends ParserRuleContext {
		public TerminalNode CMD_SetInfo() { return getToken(SMTLIBv2Parser.CMD_SetInfo, 0); }
		public Cmd_setInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_setInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_setInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_setInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_setInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_setInfoContext cmd_setInfo() throws RecognitionException {
		Cmd_setInfoContext _localctx = new Cmd_setInfoContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_cmd_setInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(CMD_SetInfo);
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

	public static class Cmd_setLogicContext extends ParserRuleContext {
		public TerminalNode CMD_SetLogic() { return getToken(SMTLIBv2Parser.CMD_SetLogic, 0); }
		public Cmd_setLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_setLogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_setLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_setLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_setLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_setLogicContext cmd_setLogic() throws RecognitionException {
		Cmd_setLogicContext _localctx = new Cmd_setLogicContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_cmd_setLogic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(CMD_SetLogic);
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

	public static class Cmd_setOptionContext extends ParserRuleContext {
		public TerminalNode CMD_SetOption() { return getToken(SMTLIBv2Parser.CMD_SetOption, 0); }
		public Cmd_setOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd_setOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCmd_setOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCmd_setOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCmd_setOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmd_setOptionContext cmd_setOption() throws RecognitionException {
		Cmd_setOptionContext _localctx = new Cmd_setOptionContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_cmd_setOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(CMD_SetOption);
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

	public static class CommandContext extends ParserRuleContext {
		public List<TerminalNode> ParOpen() { return getTokens(SMTLIBv2Parser.ParOpen); }
		public TerminalNode ParOpen(int i) {
			return getToken(SMTLIBv2Parser.ParOpen, i);
		}
		public Cmd_assertContext cmd_assert() {
			return getRuleContext(Cmd_assertContext.class,0);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ParClose() { return getTokens(SMTLIBv2Parser.ParClose); }
		public TerminalNode ParClose(int i) {
			return getToken(SMTLIBv2Parser.ParClose, i);
		}
		public Cmd_checkSatContext cmd_checkSat() {
			return getRuleContext(Cmd_checkSatContext.class,0);
		}
		public Cmd_checkSatAssumingContext cmd_checkSatAssuming() {
			return getRuleContext(Cmd_checkSatAssumingContext.class,0);
		}
		public Cmd_declareConstContext cmd_declareConst() {
			return getRuleContext(Cmd_declareConstContext.class,0);
		}
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public List<SortContext> sort() {
			return getRuleContexts(SortContext.class);
		}
		public SortContext sort(int i) {
			return getRuleContext(SortContext.class,i);
		}
		public Cmd_declareDatatypeContext cmd_declareDatatype() {
			return getRuleContext(Cmd_declareDatatypeContext.class,0);
		}
		public List<Datatype_decContext> datatype_dec() {
			return getRuleContexts(Datatype_decContext.class);
		}
		public Datatype_decContext datatype_dec(int i) {
			return getRuleContext(Datatype_decContext.class,i);
		}
		public Cmd_declareDatatypesContext cmd_declareDatatypes() {
			return getRuleContext(Cmd_declareDatatypesContext.class,0);
		}
		public List<Sort_decContext> sort_dec() {
			return getRuleContexts(Sort_decContext.class);
		}
		public Sort_decContext sort_dec(int i) {
			return getRuleContext(Sort_decContext.class,i);
		}
		public Cmd_declareFunContext cmd_declareFun() {
			return getRuleContext(Cmd_declareFunContext.class,0);
		}
		public Cmd_declareSortContext cmd_declareSort() {
			return getRuleContext(Cmd_declareSortContext.class,0);
		}
		public NumeralContext numeral() {
			return getRuleContext(NumeralContext.class,0);
		}
		public Cmd_defineFunContext cmd_defineFun() {
			return getRuleContext(Cmd_defineFunContext.class,0);
		}
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public Cmd_defineFunRecContext cmd_defineFunRec() {
			return getRuleContext(Cmd_defineFunRecContext.class,0);
		}
		public Cmd_defineFunsRecContext cmd_defineFunsRec() {
			return getRuleContext(Cmd_defineFunsRecContext.class,0);
		}
		public List<Function_decContext> function_dec() {
			return getRuleContexts(Function_decContext.class);
		}
		public Function_decContext function_dec(int i) {
			return getRuleContext(Function_decContext.class,i);
		}
		public Cmd_defineSortContext cmd_defineSort() {
			return getRuleContext(Cmd_defineSortContext.class,0);
		}
		public Cmd_echoContext cmd_echo() {
			return getRuleContext(Cmd_echoContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Cmd_exitContext cmd_exit() {
			return getRuleContext(Cmd_exitContext.class,0);
		}
		public Cmd_getAssertionsContext cmd_getAssertions() {
			return getRuleContext(Cmd_getAssertionsContext.class,0);
		}
		public Cmd_getAssignmentContext cmd_getAssignment() {
			return getRuleContext(Cmd_getAssignmentContext.class,0);
		}
		public Cmd_getInfoContext cmd_getInfo() {
			return getRuleContext(Cmd_getInfoContext.class,0);
		}
		public Info_flagContext info_flag() {
			return getRuleContext(Info_flagContext.class,0);
		}
		public Cmd_getModelContext cmd_getModel() {
			return getRuleContext(Cmd_getModelContext.class,0);
		}
		public Cmd_getOptionContext cmd_getOption() {
			return getRuleContext(Cmd_getOptionContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Cmd_getProofContext cmd_getProof() {
			return getRuleContext(Cmd_getProofContext.class,0);
		}
		public Cmd_getUnsatAssumptionsContext cmd_getUnsatAssumptions() {
			return getRuleContext(Cmd_getUnsatAssumptionsContext.class,0);
		}
		public Cmd_getUnsatCoreContext cmd_getUnsatCore() {
			return getRuleContext(Cmd_getUnsatCoreContext.class,0);
		}
		public Cmd_getValueContext cmd_getValue() {
			return getRuleContext(Cmd_getValueContext.class,0);
		}
		public Cmd_popContext cmd_pop() {
			return getRuleContext(Cmd_popContext.class,0);
		}
		public Cmd_pushContext cmd_push() {
			return getRuleContext(Cmd_pushContext.class,0);
		}
		public Cmd_resetContext cmd_reset() {
			return getRuleContext(Cmd_resetContext.class,0);
		}
		public Cmd_resetAssertionsContext cmd_resetAssertions() {
			return getRuleContext(Cmd_resetAssertionsContext.class,0);
		}
		public Cmd_setInfoContext cmd_setInfo() {
			return getRuleContext(Cmd_setInfoContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public Cmd_setLogicContext cmd_setLogic() {
			return getRuleContext(Cmd_setLogicContext.class,0);
		}
		public Cmd_setOptionContext cmd_setOption() {
			return getRuleContext(Cmd_setOptionContext.class,0);
		}
		public OptionContext option() {
			return getRuleContext(OptionContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_command);
		int _la;
		try {
			setState(897);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				match(ParOpen);
				setState(706);
				cmd_assert();
				setState(707);
				term();
				setState(708);
				match(ParClose);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				match(ParOpen);
				setState(711);
				cmd_checkSat();
				setState(712);
				match(ParClose);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(714);
				match(ParOpen);
				setState(715);
				cmd_checkSatAssuming();
				setState(716);
				match(ParClose);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(718);
				match(ParOpen);
				setState(719);
				cmd_declareConst();
				setState(720);
				symbol();
				setState(721);
				sort();
				setState(722);
				match(ParClose);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(724);
				match(ParOpen);
				setState(725);
				cmd_declareDatatype();
				setState(726);
				symbol();
				setState(727);
				datatype_dec();
				setState(728);
				match(ParClose);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(730);
				match(ParOpen);
				setState(731);
				cmd_declareDatatypes();
				setState(732);
				match(ParOpen);
				setState(734); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(733);
					sort_dec();
					}
					}
					setState(736); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ParOpen );
				setState(738);
				match(ParClose);
				setState(739);
				match(ParOpen);
				setState(741); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(740);
					datatype_dec();
					}
					}
					setState(743); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ParOpen );
				setState(745);
				match(ParClose);
				setState(746);
				match(ParClose);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(748);
				match(ParOpen);
				setState(749);
				cmd_declareFun();
				setState(750);
				symbol();
				setState(751);
				match(ParOpen);
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ParOpen) | (1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || _la==UndefinedSymbol) {
					{
					{
					setState(752);
					sort();
					}
					}
					setState(757);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(758);
				match(ParClose);
				setState(759);
				sort();
				setState(760);
				match(ParClose);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(762);
				match(ParOpen);
				setState(763);
				cmd_declareSort();
				setState(764);
				symbol();
				setState(765);
				numeral();
				setState(766);
				match(ParClose);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(768);
				match(ParOpen);
				setState(769);
				cmd_defineFun();
				setState(770);
				function_def();
				setState(771);
				match(ParClose);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(773);
				match(ParOpen);
				setState(774);
				cmd_defineFunRec();
				setState(775);
				function_def();
				setState(776);
				match(ParClose);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(778);
				match(ParOpen);
				setState(779);
				cmd_defineFunsRec();
				setState(780);
				match(ParOpen);
				setState(782); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(781);
					function_dec();
					}
					}
					setState(784); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ParOpen );
				setState(786);
				match(ParClose);
				setState(787);
				match(ParOpen);
				setState(789); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(788);
					term();
					}
					}
					setState(791); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ParOpen) | (1L << String) | (1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Numeral - 66)) | (1L << (Binary - 66)) | (1L << (HexDecimal - 66)) | (1L << (Decimal - 66)) | (1L << (UndefinedSymbol - 66)))) != 0) );
				setState(793);
				match(ParClose);
				setState(794);
				match(ParClose);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(796);
				match(ParOpen);
				setState(797);
				cmd_defineSort();
				setState(798);
				symbol();
				setState(799);
				match(ParOpen);
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || _la==UndefinedSymbol) {
					{
					{
					setState(800);
					symbol();
					}
					}
					setState(805);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(806);
				match(ParClose);
				setState(807);
				sort();
				setState(808);
				match(ParClose);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(810);
				match(ParOpen);
				setState(811);
				cmd_echo();
				setState(812);
				string();
				setState(813);
				match(ParClose);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(815);
				match(ParOpen);
				setState(816);
				cmd_exit();
				setState(817);
				match(ParClose);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(819);
				match(ParOpen);
				setState(820);
				cmd_getAssertions();
				setState(821);
				match(ParClose);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(823);
				match(ParOpen);
				setState(824);
				cmd_getAssignment();
				setState(825);
				match(ParClose);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(827);
				match(ParOpen);
				setState(828);
				cmd_getInfo();
				setState(829);
				info_flag();
				setState(830);
				match(ParClose);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(832);
				match(ParOpen);
				setState(833);
				cmd_getModel();
				setState(834);
				match(ParClose);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(836);
				match(ParOpen);
				setState(837);
				cmd_getOption();
				setState(838);
				keyword();
				setState(839);
				match(ParClose);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(841);
				match(ParOpen);
				setState(842);
				cmd_getProof();
				setState(843);
				match(ParClose);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(845);
				match(ParOpen);
				setState(846);
				cmd_getUnsatAssumptions();
				setState(847);
				match(ParClose);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(849);
				match(ParOpen);
				setState(850);
				cmd_getUnsatCore();
				setState(851);
				match(ParClose);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(853);
				match(ParOpen);
				setState(854);
				cmd_getValue();
				setState(855);
				match(ParOpen);
				setState(857); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(856);
					term();
					}
					}
					setState(859); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ParOpen) | (1L << String) | (1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Numeral - 66)) | (1L << (Binary - 66)) | (1L << (HexDecimal - 66)) | (1L << (Decimal - 66)) | (1L << (UndefinedSymbol - 66)))) != 0) );
				setState(861);
				match(ParClose);
				setState(862);
				match(ParClose);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(864);
				match(ParOpen);
				setState(865);
				cmd_pop();
				setState(866);
				numeral();
				setState(867);
				match(ParClose);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(869);
				match(ParOpen);
				setState(870);
				cmd_push();
				setState(871);
				numeral();
				setState(872);
				match(ParClose);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(874);
				match(ParOpen);
				setState(875);
				cmd_reset();
				setState(876);
				match(ParClose);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(878);
				match(ParOpen);
				setState(879);
				cmd_resetAssertions();
				setState(880);
				match(ParClose);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(882);
				match(ParOpen);
				setState(883);
				cmd_setInfo();
				setState(884);
				attribute();
				setState(885);
				match(ParClose);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(887);
				match(ParOpen);
				setState(888);
				cmd_setLogic();
				setState(889);
				symbol();
				setState(890);
				match(ParClose);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(892);
				match(ParOpen);
				setState(893);
				cmd_setOption();
				setState(894);
				option();
				setState(895);
				match(ParClose);
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

	public static class B_valueContext extends ParserRuleContext {
		public TerminalNode PS_True() { return getToken(SMTLIBv2Parser.PS_True, 0); }
		public TerminalNode PS_False() { return getToken(SMTLIBv2Parser.PS_False, 0); }
		public B_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterB_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitB_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitB_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B_valueContext b_value() throws RecognitionException {
		B_valueContext _localctx = new B_valueContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_b_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			_la = _input.LA(1);
			if ( !(_la==PS_False || _la==PS_True) ) {
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

	public static class OptionContext extends ParserRuleContext {
		public TerminalNode PK_DiagnosticOutputChannel() { return getToken(SMTLIBv2Parser.PK_DiagnosticOutputChannel, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode PK_GlobalDeclarations() { return getToken(SMTLIBv2Parser.PK_GlobalDeclarations, 0); }
		public B_valueContext b_value() {
			return getRuleContext(B_valueContext.class,0);
		}
		public TerminalNode PK_InteractiveMode() { return getToken(SMTLIBv2Parser.PK_InteractiveMode, 0); }
		public TerminalNode PK_PrintSuccess() { return getToken(SMTLIBv2Parser.PK_PrintSuccess, 0); }
		public TerminalNode PK_ProduceAssertions() { return getToken(SMTLIBv2Parser.PK_ProduceAssertions, 0); }
		public TerminalNode PK_ProduceAssignments() { return getToken(SMTLIBv2Parser.PK_ProduceAssignments, 0); }
		public TerminalNode PK_ProduceModels() { return getToken(SMTLIBv2Parser.PK_ProduceModels, 0); }
		public TerminalNode PK_ProduceProofs() { return getToken(SMTLIBv2Parser.PK_ProduceProofs, 0); }
		public TerminalNode PK_ProduceUnsatAssumptions() { return getToken(SMTLIBv2Parser.PK_ProduceUnsatAssumptions, 0); }
		public TerminalNode PK_ProduceUnsatCores() { return getToken(SMTLIBv2Parser.PK_ProduceUnsatCores, 0); }
		public TerminalNode PK_RandomSeed() { return getToken(SMTLIBv2Parser.PK_RandomSeed, 0); }
		public NumeralContext numeral() {
			return getRuleContext(NumeralContext.class,0);
		}
		public TerminalNode PK_RegularOutputChannel() { return getToken(SMTLIBv2Parser.PK_RegularOutputChannel, 0); }
		public TerminalNode PK_ReproducibleResourceLimit() { return getToken(SMTLIBv2Parser.PK_ReproducibleResourceLimit, 0); }
		public TerminalNode PK_Verbosity() { return getToken(SMTLIBv2Parser.PK_Verbosity, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_option);
		try {
			setState(930);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(901);
				match(PK_DiagnosticOutputChannel);
				setState(902);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(903);
				match(PK_GlobalDeclarations);
				setState(904);
				b_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(905);
				match(PK_InteractiveMode);
				setState(906);
				b_value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(907);
				match(PK_PrintSuccess);
				setState(908);
				b_value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(909);
				match(PK_ProduceAssertions);
				setState(910);
				b_value();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(911);
				match(PK_ProduceAssignments);
				setState(912);
				b_value();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(913);
				match(PK_ProduceModels);
				setState(914);
				b_value();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(915);
				match(PK_ProduceProofs);
				setState(916);
				b_value();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(917);
				match(PK_ProduceUnsatAssumptions);
				setState(918);
				b_value();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(919);
				match(PK_ProduceUnsatCores);
				setState(920);
				b_value();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(921);
				match(PK_RandomSeed);
				setState(922);
				numeral();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(923);
				match(PK_RegularOutputChannel);
				setState(924);
				string();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(925);
				match(PK_ReproducibleResourceLimit);
				setState(926);
				numeral();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(927);
				match(PK_Verbosity);
				setState(928);
				numeral();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(929);
				attribute();
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

	public static class Info_flagContext extends ParserRuleContext {
		public TerminalNode PK_AllStatistics() { return getToken(SMTLIBv2Parser.PK_AllStatistics, 0); }
		public TerminalNode PK_AssertionStackLevels() { return getToken(SMTLIBv2Parser.PK_AssertionStackLevels, 0); }
		public TerminalNode PK_Authors() { return getToken(SMTLIBv2Parser.PK_Authors, 0); }
		public TerminalNode PK_ErrorBehaviour() { return getToken(SMTLIBv2Parser.PK_ErrorBehaviour, 0); }
		public TerminalNode PK_Name() { return getToken(SMTLIBv2Parser.PK_Name, 0); }
		public TerminalNode PK_ReasonUnknown() { return getToken(SMTLIBv2Parser.PK_ReasonUnknown, 0); }
		public TerminalNode PK_Version() { return getToken(SMTLIBv2Parser.PK_Version, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public Info_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterInfo_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitInfo_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitInfo_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Info_flagContext info_flag() throws RecognitionException {
		Info_flagContext _localctx = new Info_flagContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_info_flag);
		try {
			setState(940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				match(PK_AllStatistics);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(933);
				match(PK_AssertionStackLevels);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(934);
				match(PK_Authors);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(935);
				match(PK_ErrorBehaviour);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(936);
				match(PK_Name);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(937);
				match(PK_ReasonUnknown);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(938);
				match(PK_Version);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(939);
				keyword();
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

	public static class Error_behaviourContext extends ParserRuleContext {
		public TerminalNode PS_ImmediateExit() { return getToken(SMTLIBv2Parser.PS_ImmediateExit, 0); }
		public TerminalNode PS_ContinuedExecution() { return getToken(SMTLIBv2Parser.PS_ContinuedExecution, 0); }
		public Error_behaviourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_behaviour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterError_behaviour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitError_behaviour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitError_behaviour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_behaviourContext error_behaviour() throws RecognitionException {
		Error_behaviourContext _localctx = new Error_behaviourContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_error_behaviour);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942);
			_la = _input.LA(1);
			if ( !(_la==PS_ContinuedExecution || _la==PS_ImmediateExit) ) {
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

	public static class Reason_unknownContext extends ParserRuleContext {
		public TerminalNode PS_Memout() { return getToken(SMTLIBv2Parser.PS_Memout, 0); }
		public TerminalNode PS_Incomplete() { return getToken(SMTLIBv2Parser.PS_Incomplete, 0); }
		public S_exprContext s_expr() {
			return getRuleContext(S_exprContext.class,0);
		}
		public Reason_unknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reason_unknown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterReason_unknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitReason_unknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitReason_unknown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reason_unknownContext reason_unknown() throws RecognitionException {
		Reason_unknownContext _localctx = new Reason_unknownContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_reason_unknown);
		try {
			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(944);
				match(PS_Memout);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(945);
				match(PS_Incomplete);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(946);
				s_expr();
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

	public static class Model_responseContext extends ParserRuleContext {
		public List<TerminalNode> ParOpen() { return getTokens(SMTLIBv2Parser.ParOpen); }
		public TerminalNode ParOpen(int i) {
			return getToken(SMTLIBv2Parser.ParOpen, i);
		}
		public TerminalNode CMD_DefineFun() { return getToken(SMTLIBv2Parser.CMD_DefineFun, 0); }
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public List<TerminalNode> ParClose() { return getTokens(SMTLIBv2Parser.ParClose); }
		public TerminalNode ParClose(int i) {
			return getToken(SMTLIBv2Parser.ParClose, i);
		}
		public TerminalNode CMD_DefineFunRec() { return getToken(SMTLIBv2Parser.CMD_DefineFunRec, 0); }
		public TerminalNode CMD_DefineFunsRec() { return getToken(SMTLIBv2Parser.CMD_DefineFunsRec, 0); }
		public List<Function_decContext> function_dec() {
			return getRuleContexts(Function_decContext.class);
		}
		public Function_decContext function_dec(int i) {
			return getRuleContext(Function_decContext.class,i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Model_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterModel_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitModel_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitModel_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Model_responseContext model_response() throws RecognitionException {
		Model_responseContext _localctx = new Model_responseContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_model_response);
		int _la;
		try {
			setState(977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				match(ParOpen);
				setState(950);
				match(CMD_DefineFun);
				setState(951);
				function_def();
				setState(952);
				match(ParClose);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				match(ParOpen);
				setState(955);
				match(CMD_DefineFunRec);
				setState(956);
				function_def();
				setState(957);
				match(ParClose);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(959);
				match(ParOpen);
				setState(960);
				match(CMD_DefineFunsRec);
				setState(961);
				match(ParOpen);
				setState(963); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(962);
					function_dec();
					}
					}
					setState(965); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ParOpen );
				setState(967);
				match(ParClose);
				setState(968);
				match(ParOpen);
				setState(970); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(969);
					term();
					}
					}
					setState(972); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ParOpen) | (1L << String) | (1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Numeral - 66)) | (1L << (Binary - 66)) | (1L << (HexDecimal - 66)) | (1L << (Decimal - 66)) | (1L << (UndefinedSymbol - 66)))) != 0) );
				setState(974);
				match(ParClose);
				setState(975);
				match(ParClose);
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

	public static class Info_responseContext extends ParserRuleContext {
		public TerminalNode PK_AssertionStackLevels() { return getToken(SMTLIBv2Parser.PK_AssertionStackLevels, 0); }
		public NumeralContext numeral() {
			return getRuleContext(NumeralContext.class,0);
		}
		public TerminalNode PK_Authors() { return getToken(SMTLIBv2Parser.PK_Authors, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode PK_ErrorBehaviour() { return getToken(SMTLIBv2Parser.PK_ErrorBehaviour, 0); }
		public Error_behaviourContext error_behaviour() {
			return getRuleContext(Error_behaviourContext.class,0);
		}
		public TerminalNode PK_Name() { return getToken(SMTLIBv2Parser.PK_Name, 0); }
		public TerminalNode PK_ReasonUnknown() { return getToken(SMTLIBv2Parser.PK_ReasonUnknown, 0); }
		public Reason_unknownContext reason_unknown() {
			return getRuleContext(Reason_unknownContext.class,0);
		}
		public TerminalNode PK_Version() { return getToken(SMTLIBv2Parser.PK_Version, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public Info_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_info_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterInfo_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitInfo_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitInfo_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Info_responseContext info_response() throws RecognitionException {
		Info_responseContext _localctx = new Info_responseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_info_response);
		try {
			setState(992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(979);
				match(PK_AssertionStackLevels);
				setState(980);
				numeral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(981);
				match(PK_Authors);
				setState(982);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(983);
				match(PK_ErrorBehaviour);
				setState(984);
				error_behaviour();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(985);
				match(PK_Name);
				setState(986);
				string();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(987);
				match(PK_ReasonUnknown);
				setState(988);
				reason_unknown();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(989);
				match(PK_Version);
				setState(990);
				string();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(991);
				attribute();
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

	public static class Valuation_pairContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public Valuation_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuation_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterValuation_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitValuation_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitValuation_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valuation_pairContext valuation_pair() throws RecognitionException {
		Valuation_pairContext _localctx = new Valuation_pairContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_valuation_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(ParOpen);
			setState(995);
			term();
			setState(996);
			term();
			setState(997);
			match(ParClose);
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

	public static class T_valuation_pairContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public B_valueContext b_value() {
			return getRuleContext(B_valueContext.class,0);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public T_valuation_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t_valuation_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterT_valuation_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitT_valuation_pair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitT_valuation_pair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T_valuation_pairContext t_valuation_pair() throws RecognitionException {
		T_valuation_pairContext _localctx = new T_valuation_pairContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_t_valuation_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			match(ParOpen);
			setState(1000);
			symbol();
			setState(1001);
			b_value();
			setState(1002);
			match(ParClose);
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

	public static class Check_sat_responseContext extends ParserRuleContext {
		public TerminalNode PS_Sat() { return getToken(SMTLIBv2Parser.PS_Sat, 0); }
		public TerminalNode PS_Unsat() { return getToken(SMTLIBv2Parser.PS_Unsat, 0); }
		public TerminalNode PS_Unknown() { return getToken(SMTLIBv2Parser.PS_Unknown, 0); }
		public Check_sat_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_sat_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterCheck_sat_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitCheck_sat_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitCheck_sat_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Check_sat_responseContext check_sat_response() throws RecognitionException {
		Check_sat_responseContext _localctx = new Check_sat_responseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_check_sat_response);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PS_Sat) | (1L << PS_Unknown) | (1L << PS_Unsat))) != 0)) ) {
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

	public static class Echo_responseContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Echo_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_echo_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterEcho_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitEcho_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitEcho_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Echo_responseContext echo_response() throws RecognitionException {
		Echo_responseContext _localctx = new Echo_responseContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_echo_response);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			string();
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

	public static class Get_assertions_responseContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Get_assertions_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_assertions_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterGet_assertions_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitGet_assertions_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitGet_assertions_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_assertions_responseContext get_assertions_response() throws RecognitionException {
		Get_assertions_responseContext _localctx = new Get_assertions_responseContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_get_assertions_response);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1008);
			match(ParOpen);
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ParOpen) | (1L << String) | (1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (Numeral - 66)) | (1L << (Binary - 66)) | (1L << (HexDecimal - 66)) | (1L << (Decimal - 66)) | (1L << (UndefinedSymbol - 66)))) != 0)) {
				{
				{
				setState(1009);
				term();
				}
				}
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1015);
			match(ParClose);
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

	public static class Get_assignment_responseContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<T_valuation_pairContext> t_valuation_pair() {
			return getRuleContexts(T_valuation_pairContext.class);
		}
		public T_valuation_pairContext t_valuation_pair(int i) {
			return getRuleContext(T_valuation_pairContext.class,i);
		}
		public Get_assignment_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_assignment_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterGet_assignment_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitGet_assignment_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitGet_assignment_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_assignment_responseContext get_assignment_response() throws RecognitionException {
		Get_assignment_responseContext _localctx = new Get_assignment_responseContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_get_assignment_response);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(ParOpen);
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ParOpen) {
				{
				{
				setState(1018);
				t_valuation_pair();
				}
				}
				setState(1023);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1024);
			match(ParClose);
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

	public static class Get_info_responseContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<Info_responseContext> info_response() {
			return getRuleContexts(Info_responseContext.class);
		}
		public Info_responseContext info_response(int i) {
			return getRuleContext(Info_responseContext.class,i);
		}
		public Get_info_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_info_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterGet_info_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitGet_info_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitGet_info_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_info_responseContext get_info_response() throws RecognitionException {
		Get_info_responseContext _localctx = new Get_info_responseContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_get_info_response);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(ParOpen);
			setState(1028); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1027);
				info_response();
				}
				}
				setState(1030); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (Colon - 70)) | (1L << (PK_AllStatistics - 70)) | (1L << (PK_AssertionStackLevels - 70)) | (1L << (PK_Authors - 70)) | (1L << (PK_Category - 70)) | (1L << (PK_Chainable - 70)) | (1L << (PK_Definition - 70)) | (1L << (PK_DiagnosticOutputChannel - 70)) | (1L << (PK_ErrorBehaviour - 70)) | (1L << (PK_Extension - 70)) | (1L << (PK_Funs - 70)) | (1L << (PK_FunsDescription - 70)) | (1L << (PK_GlobalDeclarations - 70)) | (1L << (PK_InteractiveMode - 70)) | (1L << (PK_Language - 70)) | (1L << (PK_LeftAssoc - 70)) | (1L << (PK_License - 70)) | (1L << (PK_Named - 70)) | (1L << (PK_Name - 70)) | (1L << (PK_Notes - 70)) | (1L << (PK_Pattern - 70)) | (1L << (PK_PrintSuccess - 70)) | (1L << (PK_ProduceAssertions - 70)) | (1L << (PK_ProduceAssignments - 70)) | (1L << (PK_ProduceModels - 70)) | (1L << (PK_ProduceProofs - 70)) | (1L << (PK_ProduceUnsatAssumptions - 70)) | (1L << (PK_ProduceUnsatCores - 70)) | (1L << (PK_RandomSeed - 70)) | (1L << (PK_ReasonUnknown - 70)) | (1L << (PK_RegularOutputChannel - 70)) | (1L << (PK_ReproducibleResourceLimit - 70)) | (1L << (PK_RightAssoc - 70)) | (1L << (PK_SmtLibVersion - 70)) | (1L << (PK_Sorts - 70)) | (1L << (PK_SortsDescription - 70)) | (1L << (PK_Source - 70)) | (1L << (PK_Status - 70)) | (1L << (PK_Theories - 70)) | (1L << (PK_Values - 70)) | (1L << (PK_Verbosity - 70)) | (1L << (PK_Version - 70)))) != 0) );
			setState(1032);
			match(ParClose);
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

	public static class Get_model_responseContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<Model_responseContext> model_response() {
			return getRuleContexts(Model_responseContext.class);
		}
		public Model_responseContext model_response(int i) {
			return getRuleContext(Model_responseContext.class,i);
		}
		public Get_model_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_model_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterGet_model_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitGet_model_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitGet_model_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_model_responseContext get_model_response() throws RecognitionException {
		Get_model_responseContext _localctx = new Get_model_responseContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_get_model_response);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			match(ParOpen);
			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ParOpen) {
				{
				{
				setState(1035);
				model_response();
				}
				}
				setState(1040);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1041);
			match(ParClose);
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

	public static class Get_option_responseContext extends ParserRuleContext {
		public Attribute_valueContext attribute_value() {
			return getRuleContext(Attribute_valueContext.class,0);
		}
		public Get_option_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_option_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterGet_option_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitGet_option_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitGet_option_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_option_responseContext get_option_response() throws RecognitionException {
		Get_option_responseContext _localctx = new Get_option_responseContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_get_option_response);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			attribute_value();
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

	public static class Get_proof_responseContext extends ParserRuleContext {
		public S_exprContext s_expr() {
			return getRuleContext(S_exprContext.class,0);
		}
		public Get_proof_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_proof_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterGet_proof_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitGet_proof_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitGet_proof_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_proof_responseContext get_proof_response() throws RecognitionException {
		Get_proof_responseContext _localctx = new Get_proof_responseContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_get_proof_response);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			s_expr();
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

	public static class Get_unsat_assump_responseContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public Get_unsat_assump_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_unsat_assump_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterGet_unsat_assump_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitGet_unsat_assump_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitGet_unsat_assump_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_unsat_assump_responseContext get_unsat_assump_response() throws RecognitionException {
		Get_unsat_assump_responseContext _localctx = new Get_unsat_assump_responseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_get_unsat_assump_response);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			match(ParOpen);
			setState(1051);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || _la==UndefinedSymbol) {
				{
				{
				setState(1048);
				symbol();
				}
				}
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1054);
			match(ParClose);
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

	public static class Get_unsat_core_responseContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public Get_unsat_core_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_unsat_core_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterGet_unsat_core_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitGet_unsat_core_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitGet_unsat_core_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_unsat_core_responseContext get_unsat_core_response() throws RecognitionException {
		Get_unsat_core_responseContext _localctx = new Get_unsat_core_responseContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_get_unsat_core_response);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(ParOpen);
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QuotedSymbol) | (1L << PS_Not) | (1L << PS_Bool) | (1L << PS_ContinuedExecution) | (1L << PS_Error) | (1L << PS_False) | (1L << PS_ImmediateExit) | (1L << PS_Incomplete) | (1L << PS_Logic) | (1L << PS_Memout) | (1L << PS_Sat) | (1L << PS_Success) | (1L << PS_Theory) | (1L << PS_True) | (1L << PS_Unknown) | (1L << PS_Unsupported) | (1L << PS_Unsat))) != 0) || _la==UndefinedSymbol) {
				{
				{
				setState(1057);
				symbol();
				}
				}
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1063);
			match(ParClose);
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

	public static class Get_value_responseContext extends ParserRuleContext {
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public List<Valuation_pairContext> valuation_pair() {
			return getRuleContexts(Valuation_pairContext.class);
		}
		public Valuation_pairContext valuation_pair(int i) {
			return getRuleContext(Valuation_pairContext.class,i);
		}
		public Get_value_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_value_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterGet_value_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitGet_value_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitGet_value_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_value_responseContext get_value_response() throws RecognitionException {
		Get_value_responseContext _localctx = new Get_value_responseContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_get_value_response);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			match(ParOpen);
			setState(1067); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1066);
				valuation_pair();
				}
				}
				setState(1069); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ParOpen );
			setState(1071);
			match(ParClose);
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

	public static class Specific_success_responseContext extends ParserRuleContext {
		public Check_sat_responseContext check_sat_response() {
			return getRuleContext(Check_sat_responseContext.class,0);
		}
		public Echo_responseContext echo_response() {
			return getRuleContext(Echo_responseContext.class,0);
		}
		public Get_assertions_responseContext get_assertions_response() {
			return getRuleContext(Get_assertions_responseContext.class,0);
		}
		public Get_assignment_responseContext get_assignment_response() {
			return getRuleContext(Get_assignment_responseContext.class,0);
		}
		public Get_info_responseContext get_info_response() {
			return getRuleContext(Get_info_responseContext.class,0);
		}
		public Get_model_responseContext get_model_response() {
			return getRuleContext(Get_model_responseContext.class,0);
		}
		public Get_option_responseContext get_option_response() {
			return getRuleContext(Get_option_responseContext.class,0);
		}
		public Get_proof_responseContext get_proof_response() {
			return getRuleContext(Get_proof_responseContext.class,0);
		}
		public Get_unsat_assump_responseContext get_unsat_assump_response() {
			return getRuleContext(Get_unsat_assump_responseContext.class,0);
		}
		public Get_unsat_core_responseContext get_unsat_core_response() {
			return getRuleContext(Get_unsat_core_responseContext.class,0);
		}
		public Get_value_responseContext get_value_response() {
			return getRuleContext(Get_value_responseContext.class,0);
		}
		public Specific_success_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specific_success_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterSpecific_success_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitSpecific_success_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitSpecific_success_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Specific_success_responseContext specific_success_response() throws RecognitionException {
		Specific_success_responseContext _localctx = new Specific_success_responseContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_specific_success_response);
		try {
			setState(1084);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1073);
				check_sat_response();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				echo_response();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1075);
				get_assertions_response();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1076);
				get_assignment_response();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1077);
				get_info_response();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1078);
				get_model_response();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1079);
				get_option_response();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1080);
				get_proof_response();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1081);
				get_unsat_assump_response();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1082);
				get_unsat_core_response();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1083);
				get_value_response();
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

	public static class General_responseContext extends ParserRuleContext {
		public TerminalNode PS_Success() { return getToken(SMTLIBv2Parser.PS_Success, 0); }
		public Specific_success_responseContext specific_success_response() {
			return getRuleContext(Specific_success_responseContext.class,0);
		}
		public TerminalNode PS_Unsupported() { return getToken(SMTLIBv2Parser.PS_Unsupported, 0); }
		public TerminalNode ParOpen() { return getToken(SMTLIBv2Parser.ParOpen, 0); }
		public TerminalNode PS_Error() { return getToken(SMTLIBv2Parser.PS_Error, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode ParClose() { return getToken(SMTLIBv2Parser.ParClose, 0); }
		public General_responseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_response; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).enterGeneral_response(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SMTLIBv2Listener ) ((SMTLIBv2Listener)listener).exitGeneral_response(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SMTLIBv2Visitor ) return ((SMTLIBv2Visitor<? extends T>)visitor).visitGeneral_response(this);
			else return visitor.visitChildren(this);
		}
	}

	public final General_responseContext general_response() throws RecognitionException {
		General_responseContext _localctx = new General_responseContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_general_response);
		try {
			setState(1094);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1086);
				match(PS_Success);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1087);
				specific_success_response();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1088);
				match(PS_Unsupported);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1089);
				match(ParOpen);
				setState(1090);
				match(PS_Error);
				setState(1091);
				string();
				setState(1092);
				match(ParClose);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3s\u044b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\5\5\u00cf\n\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\5\t\u00d9\n\t\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\5\17\u00e8\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00ef\n\20\3\21\3\21\3\21\3\21\3\21\7\21\u00f6\n\21\f\21\16"+
		"\21\u00f9\13\21\3\21\5\21\u00fc\n\21\3\22\3\22\5\22\u0100\n\22\3\23\3"+
		"\23\3\23\3\23\3\23\6\23\u0107\n\23\r\23\16\23\u0108\3\23\3\23\5\23\u010d"+
		"\n\23\3\24\3\24\3\24\3\24\7\24\u0113\n\24\f\24\16\24\u0116\13\24\3\24"+
		"\5\24\u0119\n\24\3\25\3\25\3\25\3\25\5\25\u011f\n\25\3\26\3\26\3\26\3"+
		"\26\6\26\u0125\n\26\r\26\16\26\u0126\3\26\3\26\5\26\u012b\n\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u0134\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\6\32\u0144\n\32\r\32\16"+
		"\32\u0145\3\32\3\32\5\32\u014a\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\6\34\u0156\n\34\r\34\16\34\u0157\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\6\34\u0160\n\34\r\34\16\34\u0161\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\6\34\u016c\n\34\r\34\16\34\u016d\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\6\34\u0178\n\34\r\34\16\34\u0179\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\6\34\u0185\n\34\r\34\16\34\u0186\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\6\34\u0190\n\34\r\34\16\34\u0191\3\34\3\34\5\34\u0196"+
		"\n\34\3\35\3\35\3\35\3\35\7\35\u019c\n\35\f\35\16\35\u019f\13\35\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u01a9\n\37\f\37\16\37\u01ac\13"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u01b4\n\37\f\37\16\37\u01b7\13"+
		"\37\3\37\3\37\3\37\3\37\3\37\6\37\u01be\n\37\r\37\16\37\u01bf\3\37\7\37"+
		"\u01c3\n\37\f\37\16\37\u01c6\13\37\3\37\3\37\5\37\u01ca\n\37\3 \3 \3 "+
		"\3 \3 \6 \u01d1\n \r \16 \u01d2\3 \3 \3 \3 \6 \u01d9\n \r \16 \u01da\3"+
		" \7 \u01de\n \f \16 \u01e1\13 \3 \3 \3 \5 \u01e6\n \3!\3!\3!\6!\u01eb"+
		"\n!\r!\16!\u01ec\3!\3!\3!\3!\3!\6!\u01f4\n!\r!\16!\u01f5\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u0205\n!\3\"\3\"\3\"\3\"\6\"\u020b\n\"\r"+
		"\"\16\"\u020c\3\"\3\"\3#\3#\3#\6#\u0214\n#\r#\16#\u0215\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\5#\u0223\n#\3$\3$\3$\3$\6$\u0229\n$\r$\16$\u022a\3"+
		"$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\7\'\u023c\n\'\f\'\16\'"+
		"\u023f\13\'\3\'\3\'\3(\3(\6(\u0245\n(\r(\16(\u0246\3(\3(\3(\3(\3(\3(\6"+
		"(\u024f\n(\r(\16(\u0250\3(\3(\3(\6(\u0256\n(\r(\16(\u0257\3(\3(\3(\5("+
		"\u025d\n(\3)\3)\3)\3)\7)\u0263\n)\f)\16)\u0266\13)\3)\3)\3)\3)\3*\3*\3"+
		"*\7*\u026f\n*\f*\16*\u0272\13*\3*\3*\3*\3*\3+\3+\3,\3,\3,\3,\3,\3,\5,"+
		"\u0280\n,\3-\7-\u0283\n-\f-\16-\u0286\13-\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38"+
		"\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D"+
		"\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\6L\u02e1"+
		"\nL\rL\16L\u02e2\3L\3L\3L\6L\u02e8\nL\rL\16L\u02e9\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\7L\u02f4\nL\fL\16L\u02f7\13L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L"+
		"\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\6L\u0311\nL\rL\16L\u0312\3L\3L\3"+
		"L\6L\u0318\nL\rL\16L\u0319\3L\3L\3L\3L\3L\3L\3L\3L\7L\u0324\nL\fL\16L"+
		"\u0327\13L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\6L\u035c\nL\rL\16L\u035d\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3L\3"+
		"L\3L\3L\3L\3L\3L\3L\5L\u0384\nL\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u03a5\nN\3"+
		"O\3O\3O\3O\3O\3O\3O\3O\5O\u03af\nO\3P\3P\3Q\3Q\3Q\5Q\u03b6\nQ\3R\3R\3"+
		"R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\6R\u03c6\nR\rR\16R\u03c7\3R\3R\3R\6"+
		"R\u03cd\nR\rR\16R\u03ce\3R\3R\3R\5R\u03d4\nR\3S\3S\3S\3S\3S\3S\3S\3S\3"+
		"S\3S\3S\3S\3S\5S\u03e3\nS\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3V\3V\3W\3W\3"+
		"X\3X\7X\u03f5\nX\fX\16X\u03f8\13X\3X\3X\3Y\3Y\7Y\u03fe\nY\fY\16Y\u0401"+
		"\13Y\3Y\3Y\3Z\3Z\6Z\u0407\nZ\rZ\16Z\u0408\3Z\3Z\3[\3[\7[\u040f\n[\f[\16"+
		"[\u0412\13[\3[\3[\3\\\3\\\3]\3]\3^\3^\7^\u041c\n^\f^\16^\u041f\13^\3^"+
		"\3^\3_\3_\7_\u0425\n_\f_\16_\u0428\13_\3_\3_\3`\3`\6`\u042e\n`\r`\16`"+
		"\u042f\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3a\5a\u043f\na\3b\3b\3b\3b"+
		"\3b\3b\3b\3b\5b\u0449\nb\3b\2\2c\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\2\t\3\2\67C\3\2\t\30"+
		"\3\2Iq\5\2;;AACC\4\2\r\r\25\25\4\2\13\13\16\16\5\2\22\22\26\26\30\30\2"+
		"\u048b\2\u00c4\3\2\2\2\4\u00c7\3\2\2\2\6\u00ca\3\2\2\2\b\u00ce\3\2\2\2"+
		"\n\u00d0\3\2\2\2\f\u00d2\3\2\2\2\16\u00d4\3\2\2\2\20\u00d8\3\2\2\2\22"+
		"\u00da\3\2\2\2\24\u00dc\3\2\2\2\26\u00de\3\2\2\2\30\u00e0\3\2\2\2\32\u00e2"+
		"\3\2\2\2\34\u00e7\3\2\2\2\36\u00ee\3\2\2\2 \u00fb\3\2\2\2\"\u00ff\3\2"+
		"\2\2$\u010c\3\2\2\2&\u0118\3\2\2\2(\u011e\3\2\2\2*\u012a\3\2\2\2,\u0133"+
		"\3\2\2\2.\u0135\3\2\2\2\60\u013a\3\2\2\2\62\u0149\3\2\2\2\64\u014b\3\2"+
		"\2\2\66\u0195\3\2\2\28\u0197\3\2\2\2:\u01a2\3\2\2\2<\u01c9\3\2\2\2>\u01e5"+
		"\3\2\2\2@\u0204\3\2\2\2B\u0206\3\2\2\2D\u0222\3\2\2\2F\u0224\3\2\2\2H"+
		"\u022e\3\2\2\2J\u0233\3\2\2\2L\u0238\3\2\2\2N\u025c\3\2\2\2P\u025e\3\2"+
		"\2\2R\u026b\3\2\2\2T\u0277\3\2\2\2V\u027f\3\2\2\2X\u0284\3\2\2\2Z\u0287"+
		"\3\2\2\2\\\u0289\3\2\2\2^\u028b\3\2\2\2`\u028d\3\2\2\2b\u028f\3\2\2\2"+
		"d\u0291\3\2\2\2f\u0293\3\2\2\2h\u0295\3\2\2\2j\u0297\3\2\2\2l\u0299\3"+
		"\2\2\2n\u029b\3\2\2\2p\u029d\3\2\2\2r\u029f\3\2\2\2t\u02a1\3\2\2\2v\u02a3"+
		"\3\2\2\2x\u02a5\3\2\2\2z\u02a7\3\2\2\2|\u02a9\3\2\2\2~\u02ab\3\2\2\2\u0080"+
		"\u02ad\3\2\2\2\u0082\u02af\3\2\2\2\u0084\u02b1\3\2\2\2\u0086\u02b3\3\2"+
		"\2\2\u0088\u02b5\3\2\2\2\u008a\u02b7\3\2\2\2\u008c\u02b9\3\2\2\2\u008e"+
		"\u02bb\3\2\2\2\u0090\u02bd\3\2\2\2\u0092\u02bf\3\2\2\2\u0094\u02c1\3\2"+
		"\2\2\u0096\u0383\3\2\2\2\u0098\u0385\3\2\2\2\u009a\u03a4\3\2\2\2\u009c"+
		"\u03ae\3\2\2\2\u009e\u03b0\3\2\2\2\u00a0\u03b5\3\2\2\2\u00a2\u03d3\3\2"+
		"\2\2\u00a4\u03e2\3\2\2\2\u00a6\u03e4\3\2\2\2\u00a8\u03e9\3\2\2\2\u00aa"+
		"\u03ee\3\2\2\2\u00ac\u03f0\3\2\2\2\u00ae\u03f2\3\2\2\2\u00b0\u03fb\3\2"+
		"\2\2\u00b2\u0404\3\2\2\2\u00b4\u040c\3\2\2\2\u00b6\u0415\3\2\2\2\u00b8"+
		"\u0417\3\2\2\2\u00ba\u0419\3\2\2\2\u00bc\u0422\3\2\2\2\u00be\u042b\3\2"+
		"\2\2\u00c0\u043e\3\2\2\2\u00c2\u0448\3\2\2\2\u00c4\u00c5\5X-\2\u00c5\u00c6"+
		"\7\2\2\3\u00c6\3\3\2\2\2\u00c7\u00c8\5\u00c2b\2\u00c8\u00c9\7\2\2\3\u00c9"+
		"\5\3\2\2\2\u00ca\u00cb\t\2\2\2\u00cb\7\3\2\2\2\u00cc\u00cf\5\f\7\2\u00cd"+
		"\u00cf\7r\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\t\3\2\2\2"+
		"\u00d0\u00d1\7\b\2\2\u00d1\13\3\2\2\2\u00d2\u00d3\t\3\2\2\u00d3\r\3\2"+
		"\2\2\u00d4\u00d5\t\4\2\2\u00d5\17\3\2\2\2\u00d6\u00d9\5\b\5\2\u00d7\u00d9"+
		"\5\n\6\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\21\3\2\2\2\u00da"+
		"\u00db\7D\2\2\u00db\23\3\2\2\2\u00dc\u00dd\7G\2\2\u00dd\25\3\2\2\2\u00de"+
		"\u00df\7F\2\2\u00df\27\3\2\2\2\u00e0\u00e1\7E\2\2\u00e1\31\3\2\2\2\u00e2"+
		"\u00e3\7\7\2\2\u00e3\33\3\2\2\2\u00e4\u00e8\5\16\b\2\u00e5\u00e6\7H\2"+
		"\2\u00e6\u00e8\5\b\5\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\35"+
		"\3\2\2\2\u00e9\u00ef\5\22\n\2\u00ea\u00ef\5\24\13\2\u00eb\u00ef\5\26\f"+
		"\2\u00ec\u00ef\5\30\r\2\u00ed\u00ef\5\32\16\2\u00ee\u00e9\3\2\2\2\u00ee"+
		"\u00ea\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2"+
		"\2\2\u00ef\37\3\2\2\2\u00f0\u00fc\5\36\20\2\u00f1\u00fc\5\20\t\2\u00f2"+
		"\u00fc\5\34\17\2\u00f3\u00f7\7\4\2\2\u00f4\u00f6\5 \21\2\u00f5\u00f4\3"+
		"\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\7\5\2\2\u00fb\u00f0\3\2"+
		"\2\2\u00fb\u00f1\3\2\2\2\u00fb\u00f2\3\2\2\2\u00fb\u00f3\3\2\2\2\u00fc"+
		"!\3\2\2\2\u00fd\u0100\5\22\n\2\u00fe\u0100\5\20\t\2\u00ff\u00fd\3\2\2"+
		"\2\u00ff\u00fe\3\2\2\2\u0100#\3\2\2\2\u0101\u010d\5\20\t\2\u0102\u0103"+
		"\7\4\2\2\u0103\u0104\78\2\2\u0104\u0106\5\20\t\2\u0105\u0107\5\"\22\2"+
		"\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7\5\2\2\u010b\u010d\3\2\2\2\u010c"+
		"\u0101\3\2\2\2\u010c\u0102\3\2\2\2\u010d%\3\2\2\2\u010e\u0119\5\36\20"+
		"\2\u010f\u0119\5\20\t\2\u0110\u0114\7\4\2\2\u0111\u0113\5 \21\2\u0112"+
		"\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\7\5\2\2\u0118"+
		"\u010e\3\2\2\2\u0118\u010f\3\2\2\2\u0118\u0110\3\2\2\2\u0119\'\3\2\2\2"+
		"\u011a\u011f\5\34\17\2\u011b\u011c\5\34\17\2\u011c\u011d\5&\24\2\u011d"+
		"\u011f\3\2\2\2\u011e\u011a\3\2\2\2\u011e\u011b\3\2\2\2\u011f)\3\2\2\2"+
		"\u0120\u012b\5$\23\2\u0121\u0122\7\4\2\2\u0122\u0124\5$\23\2\u0123\u0125"+
		"\5*\26\2\u0124\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7\5\2\2\u0129\u012b\3\2"+
		"\2\2\u012a\u0120\3\2\2\2\u012a\u0121\3\2\2\2\u012b+\3\2\2\2\u012c\u0134"+
		"\5$\23\2\u012d\u012e\7\4\2\2\u012e\u012f\79\2\2\u012f\u0130\5$\23\2\u0130"+
		"\u0131\5*\26\2\u0131\u0132\7\5\2\2\u0132\u0134\3\2\2\2\u0133\u012c\3\2"+
		"\2\2\u0133\u012d\3\2\2\2\u0134-\3\2\2\2\u0135\u0136\7\4\2\2\u0136\u0137"+
		"\5\20\t\2\u0137\u0138\5\66\34\2\u0138\u0139\7\5\2\2\u0139/\3\2\2\2\u013a"+
		"\u013b\7\4\2\2\u013b\u013c\5\20\t\2\u013c\u013d\5*\26\2\u013d\u013e\7"+
		"\5\2\2\u013e\61\3\2\2\2\u013f\u014a\5\20\t\2\u0140\u0141\7\4\2\2\u0141"+
		"\u0143\5\20\t\2\u0142\u0144\5\20\t\2\u0143\u0142\3\2\2\2\u0144\u0145\3"+
		"\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0148\7\5\2\2\u0148\u014a\3\2\2\2\u0149\u013f\3\2\2\2\u0149\u0140\3\2"+
		"\2\2\u014a\63\3\2\2\2\u014b\u014c\7\4\2\2\u014c\u014d\5\62\32\2\u014d"+
		"\u014e\5\66\34\2\u014e\u014f\7\5\2\2\u014f\65\3\2\2\2\u0150\u0196\5\36"+
		"\20\2\u0151\u0196\5,\27\2\u0152\u0153\7\4\2\2\u0153\u0155\5,\27\2\u0154"+
		"\u0156\5\66\34\2\u0155\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0155\3"+
		"\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\7\5\2\2\u015a"+
		"\u0196\3\2\2\2\u015b\u015c\7\4\2\2\u015c\u015d\7?\2\2\u015d\u015f\7\4"+
		"\2\2\u015e\u0160\5.\30\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\7\5"+
		"\2\2\u0164\u0165\5\66\34\2\u0165\u0166\7\5\2\2\u0166\u0196\3\2\2\2\u0167"+
		"\u0168\7\4\2\2\u0168\u0169\7>\2\2\u0169\u016b\7\4\2\2\u016a\u016c\5\60"+
		"\31\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0170\7\5\2\2\u0170\u0171\5\66"+
		"\34\2\u0171\u0172\7\5\2\2\u0172\u0196\3\2\2\2\u0173\u0174\7\4\2\2\u0174"+
		"\u0175\7<\2\2\u0175\u0177\7\4\2\2\u0176\u0178\5\60\31\2\u0177\u0176\3"+
		"\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u017c\7\5\2\2\u017c\u017d\5\66\34\2\u017d\u017e\7"+
		"\5\2\2\u017e\u0196\3\2\2\2\u017f\u0180\7\4\2\2\u0180\u0181\7@\2\2\u0181"+
		"\u0182\5\66\34\2\u0182\u0184\7\4\2\2\u0183\u0185\5\64\33\2\u0184\u0183"+
		"\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0189\7\5\2\2\u0189\u018a\7\5\2\2\u018a\u0196\3\2"+
		"\2\2\u018b\u018c\7\4\2\2\u018c\u018d\7\67\2\2\u018d\u018f\5\66\34\2\u018e"+
		"\u0190\5(\25\2\u018f\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\7\5\2\2\u0194"+
		"\u0196\3\2\2\2\u0195\u0150\3\2\2\2\u0195\u0151\3\2\2\2\u0195\u0152\3\2"+
		"\2\2\u0195\u015b\3\2\2\2\u0195\u0167\3\2\2\2\u0195\u0173\3\2\2\2\u0195"+
		"\u017f\3\2\2\2\u0195\u018b\3\2\2\2\u0196\67\3\2\2\2\u0197\u0198\7\4\2"+
		"\2\u0198\u0199\5$\23\2\u0199\u019d\5\22\n\2\u019a\u019c\5(\25\2\u019b"+
		"\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2"+
		"\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7\5\2\2\u01a1"+
		"9\3\2\2\2\u01a2\u01a3\t\5\2\2\u01a3;\3\2\2\2\u01a4\u01a5\7\4\2\2\u01a5"+
		"\u01a6\5\36\20\2\u01a6\u01aa\5*\26\2\u01a7\u01a9\5(\25\2\u01a8\u01a7\3"+
		"\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01ad\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\u01ae\7\5\2\2\u01ae\u01ca\3\2"+
		"\2\2\u01af\u01b0\7\4\2\2\u01b0\u01b1\5:\36\2\u01b1\u01b5\5*\26\2\u01b2"+
		"\u01b4\5(\25\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2"+
		"\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8"+
		"\u01b9\7\5\2\2\u01b9\u01ca\3\2\2\2\u01ba\u01bb\7\4\2\2\u01bb\u01bd\5$"+
		"\23\2\u01bc\u01be\5*\26\2\u01bd\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c4\3\2\2\2\u01c1\u01c3\5("+
		"\25\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\7\5"+
		"\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01a4\3\2\2\2\u01c9\u01af\3\2\2\2\u01c9"+
		"\u01ba\3\2\2\2\u01ca=\3\2\2\2\u01cb\u01e6\5<\37\2\u01cc\u01cd\7\4\2\2"+
		"\u01cd\u01ce\7B\2\2\u01ce\u01d0\7\4\2\2\u01cf\u01d1\5\20\t\2\u01d0\u01cf"+
		"\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\u01d5\7\5\2\2\u01d5\u01d6\7\4\2\2\u01d6\u01d8\5$"+
		"\23\2\u01d7\u01d9\5*\26\2\u01d8\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da"+
		"\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01df\3\2\2\2\u01dc\u01de\5("+
		"\25\2\u01dd\u01dc\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\7\5"+
		"\2\2\u01e3\u01e4\7\5\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01cb\3\2\2\2\u01e5"+
		"\u01cc\3\2\2\2\u01e6?\3\2\2\2\u01e7\u01e8\7j\2\2\u01e8\u01ea\7\4\2\2\u01e9"+
		"\u01eb\58\35\2\u01ea\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ea\3\2"+
		"\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\7\5\2\2\u01ef"+
		"\u0205\3\2\2\2\u01f0\u01f1\7R\2\2\u01f1\u01f3\7\4\2\2\u01f2\u01f4\5> "+
		"\2\u01f3\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6"+
		"\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\7\5\2\2\u01f8\u0205\3\2\2\2\u01f9"+
		"\u01fa\7k\2\2\u01fa\u0205\5\32\16\2\u01fb\u01fc\7S\2\2\u01fc\u0205\5\32"+
		"\16\2\u01fd\u01fe\7N\2\2\u01fe\u0205\5\32\16\2\u01ff\u0200\7o\2\2\u0200"+
		"\u0205\5\32\16\2\u0201\u0202\7[\2\2\u0202\u0205\5\32\16\2\u0203\u0205"+
		"\5(\25\2\u0204\u01e7\3\2\2\2\u0204\u01f0\3\2\2\2\u0204\u01f9\3\2\2\2\u0204"+
		"\u01fb\3\2\2\2\u0204\u01fd\3\2\2\2\u0204\u01ff\3\2\2\2\u0204\u0201\3\2"+
		"\2\2\u0204\u0203\3\2\2\2\u0205A\3\2\2\2\u0206\u0207\7\4\2\2\u0207\u0208"+
		"\7\24\2\2\u0208\u020a\5\20\t\2\u0209\u020b\5@!\2\u020a\u0209\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2"+
		"\2\2\u020e\u020f\7\5\2\2\u020fC\3\2\2\2\u0210\u0211\7n\2\2\u0211\u0213"+
		"\7\4\2\2\u0212\u0214\5\20\t\2\u0213\u0212\3\2\2\2\u0214\u0215\3\2\2\2"+
		"\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218"+
		"\7\5\2\2\u0218\u0223\3\2\2\2\u0219\u021a\7V\2\2\u021a\u0223\5\32\16\2"+
		"\u021b\u021c\7Q\2\2\u021c\u0223\5\32\16\2\u021d\u021e\7o\2\2\u021e\u0223"+
		"\5\32\16\2\u021f\u0220\7[\2\2\u0220\u0223\5\32\16\2\u0221\u0223\5(\25"+
		"\2\u0222\u0210\3\2\2\2\u0222\u0219\3\2\2\2\u0222\u021b\3\2\2\2\u0222\u021d"+
		"\3\2\2\2\u0222\u021f\3\2\2\2\u0222\u0221\3\2\2\2\u0223E\3\2\2\2\u0224"+
		"\u0225\7\4\2\2\u0225\u0226\7\20\2\2\u0226\u0228\5\20\t\2\u0227\u0229\5"+
		"D#\2\u0228\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u0228\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\7\5\2\2\u022dG\3\2\2\2"+
		"\u022e\u022f\7\4\2\2\u022f\u0230\5\20\t\2\u0230\u0231\5\22\n\2\u0231\u0232"+
		"\7\5\2\2\u0232I\3\2\2\2\u0233\u0234\7\4\2\2\u0234\u0235\5\20\t\2\u0235"+
		"\u0236\5*\26\2\u0236\u0237\7\5\2\2\u0237K\3\2\2\2\u0238\u0239\7\4\2\2"+
		"\u0239\u023d\5\20\t\2\u023a\u023c\5J&\2\u023b\u023a\3\2\2\2\u023c\u023f"+
		"\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u0240\u0241\7\5\2\2\u0241M\3\2\2\2\u0242\u0244\7\4\2\2"+
		"\u0243\u0245\5L\'\2\u0244\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0244"+
		"\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\7\5\2\2\u0249"+
		"\u025d\3\2\2\2\u024a\u024b\7\4\2\2\u024b\u024c\7B\2\2\u024c\u024e\7\4"+
		"\2\2\u024d\u024f\5\20\t\2\u024e\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250"+
		"\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\7\5"+
		"\2\2\u0253\u0255\7\4\2\2\u0254\u0256\5L\'\2\u0255\u0254\3\2\2\2\u0256"+
		"\u0257\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\3\2"+
		"\2\2\u0259\u025a\7\5\2\2\u025a\u025b\7\5\2\2\u025b\u025d\3\2\2\2\u025c"+
		"\u0242\3\2\2\2\u025c\u024a\3\2\2\2\u025dO\3\2\2\2\u025e\u025f\7\4\2\2"+
		"\u025f\u0260\5\20\t\2\u0260\u0264\7\4\2\2\u0261\u0263\5\60\31\2\u0262"+
		"\u0261\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2"+
		"\2\2\u0265\u0267\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u0268\7\5\2\2\u0268"+
		"\u0269\5*\26\2\u0269\u026a\7\5\2\2\u026aQ\3\2\2\2\u026b\u026c\5\20\t\2"+
		"\u026c\u0270\7\4\2\2\u026d\u026f\5\60\31\2\u026e\u026d\3\2\2\2\u026f\u0272"+
		"\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0273\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0273\u0274\7\5\2\2\u0274\u0275\5*\26\2\u0275\u0276\5T"+
		"+\2\u0276S\3\2\2\2\u0277\u0278\5\66\34\2\u0278U\3\2\2\2\u0279\u0280\5"+
		"\20\t\2\u027a\u027b\7\4\2\2\u027b\u027c\7\t\2\2\u027c\u027d\5\20\t\2\u027d"+
		"\u027e\7\5\2\2\u027e\u0280\3\2\2\2\u027f\u0279\3\2\2\2\u027f\u027a\3\2"+
		"\2\2\u0280W\3\2\2\2\u0281\u0283\5\u0096L\2\u0282\u0281\3\2\2\2\u0283\u0286"+
		"\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285Y\3\2\2\2\u0286"+
		"\u0284\3\2\2\2\u0287\u0288\7\31\2\2\u0288[\3\2\2\2\u0289\u028a\7\32\2"+
		"\2\u028a]\3\2\2\2\u028b\u028c\7\33\2\2\u028c_\3\2\2\2\u028d\u028e\7\34"+
		"\2\2\u028ea\3\2\2\2\u028f\u0290\7\35\2\2\u0290c\3\2\2\2\u0291\u0292\7"+
		"\36\2\2\u0292e\3\2\2\2\u0293\u0294\7\37\2\2\u0294g\3\2\2\2\u0295\u0296"+
		"\7 \2\2\u0296i\3\2\2\2\u0297\u0298\7!\2\2\u0298k\3\2\2\2\u0299\u029a\7"+
		"\"\2\2\u029am\3\2\2\2\u029b\u029c\7#\2\2\u029co\3\2\2\2\u029d\u029e\7"+
		"$\2\2\u029eq\3\2\2\2\u029f\u02a0\7%\2\2\u02a0s\3\2\2\2\u02a1\u02a2\7&"+
		"\2\2\u02a2u\3\2\2\2\u02a3\u02a4\7\'\2\2\u02a4w\3\2\2\2\u02a5\u02a6\7("+
		"\2\2\u02a6y\3\2\2\2\u02a7\u02a8\7)\2\2\u02a8{\3\2\2\2\u02a9\u02aa\7*\2"+
		"\2\u02aa}\3\2\2\2\u02ab\u02ac\7+\2\2\u02ac\177\3\2\2\2\u02ad\u02ae\7,"+
		"\2\2\u02ae\u0081\3\2\2\2\u02af\u02b0\7-\2\2\u02b0\u0083\3\2\2\2\u02b1"+
		"\u02b2\7.\2\2\u02b2\u0085\3\2\2\2\u02b3\u02b4\7/\2\2\u02b4\u0087\3\2\2"+
		"\2\u02b5\u02b6\7\60\2\2\u02b6\u0089\3\2\2\2\u02b7\u02b8\7\61\2\2\u02b8"+
		"\u008b\3\2\2\2\u02b9\u02ba\7\62\2\2\u02ba\u008d\3\2\2\2\u02bb\u02bc\7"+
		"\63\2\2\u02bc\u008f\3\2\2\2\u02bd\u02be\7\64\2\2\u02be\u0091\3\2\2\2\u02bf"+
		"\u02c0\7\65\2\2\u02c0\u0093\3\2\2\2\u02c1\u02c2\7\66\2\2\u02c2\u0095\3"+
		"\2\2\2\u02c3\u02c4\7\4\2\2\u02c4\u02c5\5Z.\2\u02c5\u02c6\5\66\34\2\u02c6"+
		"\u02c7\7\5\2\2\u02c7\u0384\3\2\2\2\u02c8\u02c9\7\4\2\2\u02c9\u02ca\5\\"+
		"/\2\u02ca\u02cb\7\5\2\2\u02cb\u0384\3\2\2\2\u02cc\u02cd\7\4\2\2\u02cd"+
		"\u02ce\5^\60\2\u02ce\u02cf\7\5\2\2\u02cf\u0384\3\2\2\2\u02d0\u02d1\7\4"+
		"\2\2\u02d1\u02d2\5`\61\2\u02d2\u02d3\5\20\t\2\u02d3\u02d4\5*\26\2\u02d4"+
		"\u02d5\7\5\2\2\u02d5\u0384\3\2\2\2\u02d6\u02d7\7\4\2\2\u02d7\u02d8\5b"+
		"\62\2\u02d8\u02d9\5\20\t\2\u02d9\u02da\5N(\2\u02da\u02db\7\5\2\2\u02db"+
		"\u0384\3\2\2\2\u02dc\u02dd\7\4\2\2\u02dd\u02de\5d\63\2\u02de\u02e0\7\4"+
		"\2\2\u02df\u02e1\5H%\2\u02e0\u02df\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e0"+
		"\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5\7\5\2\2\u02e5"+
		"\u02e7\7\4\2\2\u02e6\u02e8\5N(\2\u02e7\u02e6\3\2\2\2\u02e8\u02e9\3\2\2"+
		"\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec"+
		"\7\5\2\2\u02ec\u02ed\7\5\2\2\u02ed\u0384\3\2\2\2\u02ee\u02ef\7\4\2\2\u02ef"+
		"\u02f0\5f\64\2\u02f0\u02f1\5\20\t\2\u02f1\u02f5\7\4\2\2\u02f2\u02f4\5"+
		"*\26\2\u02f3\u02f2\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5"+
		"\u02f6\3\2\2\2\u02f6\u02f8\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02f9\7\5"+
		"\2\2\u02f9\u02fa\5*\26\2\u02fa\u02fb\7\5\2\2\u02fb\u0384\3\2\2\2\u02fc"+
		"\u02fd\7\4\2\2\u02fd\u02fe\5h\65\2\u02fe\u02ff\5\20\t\2\u02ff\u0300\5"+
		"\22\n\2\u0300\u0301\7\5\2\2\u0301\u0384\3\2\2\2\u0302\u0303\7\4\2\2\u0303"+
		"\u0304\5j\66\2\u0304\u0305\5R*\2\u0305\u0306\7\5\2\2\u0306\u0384\3\2\2"+
		"\2\u0307\u0308\7\4\2\2\u0308\u0309\5l\67\2\u0309\u030a\5R*\2\u030a\u030b"+
		"\7\5\2\2\u030b\u0384\3\2\2\2\u030c\u030d\7\4\2\2\u030d\u030e\5n8\2\u030e"+
		"\u0310\7\4\2\2\u030f\u0311\5P)\2\u0310\u030f\3\2\2\2\u0311\u0312\3\2\2"+
		"\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315"+
		"\7\5\2\2\u0315\u0317\7\4\2\2\u0316\u0318\5\66\34\2\u0317\u0316\3\2\2\2"+
		"\u0318\u0319\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031b"+
		"\3\2\2\2\u031b\u031c\7\5\2\2\u031c\u031d\7\5\2\2\u031d\u0384\3\2\2\2\u031e"+
		"\u031f\7\4\2\2\u031f\u0320\5p9\2\u0320\u0321\5\20\t\2\u0321\u0325\7\4"+
		"\2\2\u0322\u0324\5\20\t\2\u0323\u0322\3\2\2\2\u0324\u0327\3\2\2\2\u0325"+
		"\u0323\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u0325\3\2"+
		"\2\2\u0328\u0329\7\5\2\2\u0329\u032a\5*\26\2\u032a\u032b\7\5\2\2\u032b"+
		"\u0384\3\2\2\2\u032c\u032d\7\4\2\2\u032d\u032e\5r:\2\u032e\u032f\5\32"+
		"\16\2\u032f\u0330\7\5\2\2\u0330\u0384\3\2\2\2\u0331\u0332\7\4\2\2\u0332"+
		"\u0333\5t;\2\u0333\u0334\7\5\2\2\u0334\u0384\3\2\2\2\u0335\u0336\7\4\2"+
		"\2\u0336\u0337\5v<\2\u0337\u0338\7\5\2\2\u0338\u0384\3\2\2\2\u0339\u033a"+
		"\7\4\2\2\u033a\u033b\5x=\2\u033b\u033c\7\5\2\2\u033c\u0384\3\2\2\2\u033d"+
		"\u033e\7\4\2\2\u033e\u033f\5z>\2\u033f\u0340\5\u009cO\2\u0340\u0341\7"+
		"\5\2\2\u0341\u0384\3\2\2\2\u0342\u0343\7\4\2\2\u0343\u0344\5|?\2\u0344"+
		"\u0345\7\5\2\2\u0345\u0384\3\2\2\2\u0346\u0347\7\4\2\2\u0347\u0348\5~"+
		"@\2\u0348\u0349\5\34\17\2\u0349\u034a\7\5\2\2\u034a\u0384\3\2\2\2\u034b"+
		"\u034c\7\4\2\2\u034c\u034d\5\u0080A\2\u034d\u034e\7\5\2\2\u034e\u0384"+
		"\3\2\2\2\u034f\u0350\7\4\2\2\u0350\u0351\5\u0082B\2\u0351\u0352\7\5\2"+
		"\2\u0352\u0384\3\2\2\2\u0353\u0354\7\4\2\2\u0354\u0355\5\u0084C\2\u0355"+
		"\u0356\7\5\2\2\u0356\u0384\3\2\2\2\u0357\u0358\7\4\2\2\u0358\u0359\5\u0086"+
		"D\2\u0359\u035b\7\4\2\2\u035a\u035c\5\66\34\2\u035b\u035a\3\2\2\2\u035c"+
		"\u035d\3\2\2\2\u035d\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u035f\3\2"+
		"\2\2\u035f\u0360\7\5\2\2\u0360\u0361\7\5\2\2\u0361\u0384\3\2\2\2\u0362"+
		"\u0363\7\4\2\2\u0363\u0364\5\u0088E\2\u0364\u0365\5\22\n\2\u0365\u0366"+
		"\7\5\2\2\u0366\u0384\3\2\2\2\u0367\u0368\7\4\2\2\u0368\u0369\5\u008aF"+
		"\2\u0369\u036a\5\22\n\2\u036a\u036b\7\5\2\2\u036b\u0384\3\2\2\2\u036c"+
		"\u036d\7\4\2\2\u036d\u036e\5\u008cG\2\u036e\u036f\7\5\2\2\u036f\u0384"+
		"\3\2\2\2\u0370\u0371\7\4\2\2\u0371\u0372\5\u008eH\2\u0372\u0373\7\5\2"+
		"\2\u0373\u0384\3\2\2\2\u0374\u0375\7\4\2\2\u0375\u0376\5\u0090I\2\u0376"+
		"\u0377\5(\25\2\u0377\u0378\7\5\2\2\u0378\u0384\3\2\2\2\u0379\u037a\7\4"+
		"\2\2\u037a\u037b\5\u0092J\2\u037b\u037c\5\20\t\2\u037c\u037d\7\5\2\2\u037d"+
		"\u0384\3\2\2\2\u037e\u037f\7\4\2\2\u037f\u0380\5\u0094K\2\u0380\u0381"+
		"\5\u009aN\2\u0381\u0382\7\5\2\2\u0382\u0384\3\2\2\2\u0383\u02c3\3\2\2"+
		"\2\u0383\u02c8\3\2\2\2\u0383\u02cc\3\2\2\2\u0383\u02d0\3\2\2\2\u0383\u02d6"+
		"\3\2\2\2\u0383\u02dc\3\2\2\2\u0383\u02ee\3\2\2\2\u0383\u02fc\3\2\2\2\u0383"+
		"\u0302\3\2\2\2\u0383\u0307\3\2\2\2\u0383\u030c\3\2\2\2\u0383\u031e\3\2"+
		"\2\2\u0383\u032c\3\2\2\2\u0383\u0331\3\2\2\2\u0383\u0335\3\2\2\2\u0383"+
		"\u0339\3\2\2\2\u0383\u033d\3\2\2\2\u0383\u0342\3\2\2\2\u0383\u0346\3\2"+
		"\2\2\u0383\u034b\3\2\2\2\u0383\u034f\3\2\2\2\u0383\u0353\3\2\2\2\u0383"+
		"\u0357\3\2\2\2\u0383\u0362\3\2\2\2\u0383\u0367\3\2\2\2\u0383\u036c\3\2"+
		"\2\2\u0383\u0370\3\2\2\2\u0383\u0374\3\2\2\2\u0383\u0379\3\2\2\2\u0383"+
		"\u037e\3\2\2\2\u0384\u0097\3\2\2\2\u0385\u0386\t\6\2\2\u0386\u0099\3\2"+
		"\2\2\u0387\u0388\7O\2\2\u0388\u03a5\5\32\16\2\u0389\u038a\7T\2\2\u038a"+
		"\u03a5\5\u0098M\2\u038b\u038c\7U\2\2\u038c\u03a5\5\u0098M\2\u038d\u038e"+
		"\7]\2\2\u038e\u03a5\5\u0098M\2\u038f\u0390\7^\2\2\u0390\u03a5\5\u0098"+
		"M\2\u0391\u0392\7_\2\2\u0392\u03a5\5\u0098M\2\u0393\u0394\7`\2\2\u0394"+
		"\u03a5\5\u0098M\2\u0395\u0396\7a\2\2\u0396\u03a5\5\u0098M\2\u0397\u0398"+
		"\7b\2\2\u0398\u03a5\5\u0098M\2\u0399\u039a\7c\2\2\u039a\u03a5\5\u0098"+
		"M\2\u039b\u039c\7d\2\2\u039c\u03a5\5\22\n\2\u039d\u039e\7f\2\2\u039e\u03a5"+
		"\5\32\16\2\u039f\u03a0\7g\2\2\u03a0\u03a5\5\22\n\2\u03a1\u03a2\7p\2\2"+
		"\u03a2\u03a5\5\22\n\2\u03a3\u03a5\5(\25\2\u03a4\u0387\3\2\2\2\u03a4\u0389"+
		"\3\2\2\2\u03a4\u038b\3\2\2\2\u03a4\u038d\3\2\2\2\u03a4\u038f\3\2\2\2\u03a4"+
		"\u0391\3\2\2\2\u03a4\u0393\3\2\2\2\u03a4\u0395\3\2\2\2\u03a4\u0397\3\2"+
		"\2\2\u03a4\u0399\3\2\2\2\u03a4\u039b\3\2\2\2\u03a4\u039d\3\2\2\2\u03a4"+
		"\u039f\3\2\2\2\u03a4\u03a1\3\2\2\2\u03a4\u03a3\3\2\2\2\u03a5\u009b\3\2"+
		"\2\2\u03a6\u03af\7I\2\2\u03a7\u03af\7J\2\2\u03a8\u03af\7K\2\2\u03a9\u03af"+
		"\7P\2\2\u03aa\u03af\7Z\2\2\u03ab\u03af\7e\2\2\u03ac\u03af\7q\2\2\u03ad"+
		"\u03af\5\34\17\2\u03ae\u03a6\3\2\2\2\u03ae\u03a7\3\2\2\2\u03ae\u03a8\3"+
		"\2\2\2\u03ae\u03a9\3\2\2\2\u03ae\u03aa\3\2\2\2\u03ae\u03ab\3\2\2\2\u03ae"+
		"\u03ac\3\2\2\2\u03ae\u03ad\3\2\2\2\u03af\u009d\3\2\2\2\u03b0\u03b1\t\7"+
		"\2\2\u03b1\u009f\3\2\2\2\u03b2\u03b6\7\21\2\2\u03b3\u03b6\7\17\2\2\u03b4"+
		"\u03b6\5 \21\2\u03b5\u03b2\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b4\3\2"+
		"\2\2\u03b6\u00a1\3\2\2\2\u03b7\u03b8\7\4\2\2\u03b8\u03b9\7!\2\2\u03b9"+
		"\u03ba\5R*\2\u03ba\u03bb\7\5\2\2\u03bb\u03d4\3\2\2\2\u03bc\u03bd\7\4\2"+
		"\2\u03bd\u03be\7\"\2\2\u03be\u03bf\5R*\2\u03bf\u03c0\7\5\2\2\u03c0\u03d4"+
		"\3\2\2\2\u03c1\u03c2\7\4\2\2\u03c2\u03c3\7#\2\2\u03c3\u03c5\7\4\2\2\u03c4"+
		"\u03c6\5P)\2\u03c5\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c5\3\2\2"+
		"\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03ca\7\5\2\2\u03ca\u03cc"+
		"\7\4\2\2\u03cb\u03cd\5\66\34\2\u03cc\u03cb\3\2\2\2\u03cd\u03ce\3\2\2\2"+
		"\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1"+
		"\7\5\2\2\u03d1\u03d2\7\5\2\2\u03d2\u03d4\3\2\2\2\u03d3\u03b7\3\2\2\2\u03d3"+
		"\u03bc\3\2\2\2\u03d3\u03c1\3\2\2\2\u03d4\u00a3\3\2\2\2\u03d5\u03d6\7J"+
		"\2\2\u03d6\u03e3\5\22\n\2\u03d7\u03d8\7K\2\2\u03d8\u03e3\5\32\16\2\u03d9"+
		"\u03da\7P\2\2\u03da\u03e3\5\u009eP\2\u03db\u03dc\7Z\2\2\u03dc\u03e3\5"+
		"\32\16\2\u03dd\u03de\7e\2\2\u03de\u03e3\5\u00a0Q\2\u03df\u03e0\7q\2\2"+
		"\u03e0\u03e3\5\32\16\2\u03e1\u03e3\5(\25\2\u03e2\u03d5\3\2\2\2\u03e2\u03d7"+
		"\3\2\2\2\u03e2\u03d9\3\2\2\2\u03e2\u03db\3\2\2\2\u03e2\u03dd\3\2\2\2\u03e2"+
		"\u03df\3\2\2\2\u03e2\u03e1\3\2\2\2\u03e3\u00a5\3\2\2\2\u03e4\u03e5\7\4"+
		"\2\2\u03e5\u03e6\5\66\34\2\u03e6\u03e7\5\66\34\2\u03e7\u03e8\7\5\2\2\u03e8"+
		"\u00a7\3\2\2\2\u03e9\u03ea\7\4\2\2\u03ea\u03eb\5\20\t\2\u03eb\u03ec\5"+
		"\u0098M\2\u03ec\u03ed\7\5\2\2\u03ed\u00a9\3\2\2\2\u03ee\u03ef\t\b\2\2"+
		"\u03ef\u00ab\3\2\2\2\u03f0\u03f1\5\32\16\2\u03f1\u00ad\3\2\2\2\u03f2\u03f6"+
		"\7\4\2\2\u03f3\u03f5\5\66\34\2\u03f4\u03f3\3\2\2\2\u03f5\u03f8\3\2\2\2"+
		"\u03f6\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f9\3\2\2\2\u03f8\u03f6"+
		"\3\2\2\2\u03f9\u03fa\7\5\2\2\u03fa\u00af\3\2\2\2\u03fb\u03ff\7\4\2\2\u03fc"+
		"\u03fe\5\u00a8U\2\u03fd\u03fc\3\2\2\2\u03fe\u0401\3\2\2\2\u03ff\u03fd"+
		"\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0402\3\2\2\2\u0401\u03ff\3\2\2\2\u0402"+
		"\u0403\7\5\2\2\u0403\u00b1\3\2\2\2\u0404\u0406\7\4\2\2\u0405\u0407\5\u00a4"+
		"S\2\u0406\u0405\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u0406\3\2\2\2\u0408"+
		"\u0409\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040b\7\5\2\2\u040b\u00b3\3\2"+
		"\2\2\u040c\u0410\7\4\2\2\u040d\u040f\5\u00a2R\2\u040e\u040d\3\2\2\2\u040f"+
		"\u0412\3\2\2\2\u0410\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0413\3\2"+
		"\2\2\u0412\u0410\3\2\2\2\u0413\u0414\7\5\2\2\u0414\u00b5\3\2\2\2\u0415"+
		"\u0416\5&\24\2\u0416\u00b7\3\2\2\2\u0417\u0418\5 \21\2\u0418\u00b9\3\2"+
		"\2\2\u0419\u041d\7\4\2\2\u041a\u041c\5\20\t\2\u041b\u041a\3\2\2\2\u041c"+
		"\u041f\3\2\2\2\u041d\u041b\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u0420\3\2"+
		"\2\2\u041f\u041d\3\2\2\2\u0420\u0421\7\5\2\2\u0421\u00bb\3\2\2\2\u0422"+
		"\u0426\7\4\2\2\u0423\u0425\5\20\t\2\u0424\u0423\3\2\2\2\u0425\u0428\3"+
		"\2\2\2\u0426\u0424\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0429\3\2\2\2\u0428"+
		"\u0426\3\2\2\2\u0429\u042a\7\5\2\2\u042a\u00bd\3\2\2\2\u042b\u042d\7\4"+
		"\2\2\u042c\u042e\5\u00a6T\2\u042d\u042c\3\2\2\2\u042e\u042f\3\2\2\2\u042f"+
		"\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431\3\2\2\2\u0431\u0432\7\5"+
		"\2\2\u0432\u00bf\3\2\2\2\u0433\u043f\5\u00aaV\2\u0434\u043f\5\u00acW\2"+
		"\u0435\u043f\5\u00aeX\2\u0436\u043f\5\u00b0Y\2\u0437\u043f\5\u00b2Z\2"+
		"\u0438\u043f\5\u00b4[\2\u0439\u043f\5\u00b6\\\2\u043a\u043f\5\u00b8]\2"+
		"\u043b\u043f\5\u00ba^\2\u043c\u043f\5\u00bc_\2\u043d\u043f\5\u00be`\2"+
		"\u043e\u0433\3\2\2\2\u043e\u0434\3\2\2\2\u043e\u0435\3\2\2\2\u043e\u0436"+
		"\3\2\2\2\u043e\u0437\3\2\2\2\u043e\u0438\3\2\2\2\u043e\u0439\3\2\2\2\u043e"+
		"\u043a\3\2\2\2\u043e\u043b\3\2\2\2\u043e\u043c\3\2\2\2\u043e\u043d\3\2"+
		"\2\2\u043f\u00c1\3\2\2\2\u0440\u0449\7\23\2\2\u0441\u0449\5\u00c0a\2\u0442"+
		"\u0449\7\27\2\2\u0443\u0444\7\4\2\2\u0444\u0445\7\f\2\2\u0445\u0446\5"+
		"\32\16\2\u0446\u0447\7\5\2\2\u0447\u0449\3\2\2\2\u0448\u0440\3\2\2\2\u0448"+
		"\u0441\3\2\2\2\u0448\u0442\3\2\2\2\u0448\u0443\3\2\2\2\u0449\u00c3\3\2"+
		"\2\2L\u00ce\u00d8\u00e7\u00ee\u00f7\u00fb\u00ff\u0108\u010c\u0114\u0118"+
		"\u011e\u0126\u012a\u0133\u0145\u0149\u0157\u0161\u016d\u0179\u0186\u0191"+
		"\u0195\u019d\u01aa\u01b5\u01bf\u01c4\u01c9\u01d2\u01da\u01df\u01e5\u01ec"+
		"\u01f5\u0204\u020c\u0215\u0222\u022a\u023d\u0246\u0250\u0257\u025c\u0264"+
		"\u0270\u027f\u0284\u02e2\u02e9\u02f5\u0312\u0319\u0325\u035d\u0383\u03a4"+
		"\u03ae\u03b5\u03c7\u03ce\u03d3\u03e2\u03f6\u03ff\u0408\u0410\u041d\u0426"+
		"\u042f\u043e\u0448";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}