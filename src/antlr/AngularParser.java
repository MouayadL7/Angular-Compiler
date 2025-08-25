// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACES=1, LINE_COMMENT=2, BLOCK_COMMENT=3, HTML_COMMENT=4, MODULE=5, COMPONENT=6, 
		DIRECTIVE=7, PIPE=8, INJECTABLE=9, SELECTOR=10, TEMPLATE_URL=11, TEMPLATE=12, 
		STYLE_URLS=13, STYLES=14, IMPORTS=15, EXPORTS=16, INPUTS=17, OUTPUTS=18, 
		DECLARATIONS=19, PROVIDERS=20, BOOTSTRAP=21, STANDALONE=22, IMPORT=23, 
		FROM=24, AS=25, PLATFORM_BROWSER_DYNAMIC=26, BOOTSTRAP_MODULE=27, BOOTSTRAP_APPLICATION=28, 
		LET=29, CONST=30, IF=31, ELSE=32, RETURN=33, THROW=34, CONSOLE=35, LOG=36, 
		CATCH=37, ERROR=38, EXPORT=39, INTERFACE=40, CLASS=41, ENUM=42, EXTENDS=43, 
		IMPLEMENTS=44, CONSTRUCTOR=45, THIS=46, NEW=47, FUNCTION=48, PRIVATE=49, 
		PUBLIC=50, PROTECTED=51, STORE=52, ACTION=53, REDUCER=54, EFFECT=55, EFFECTS=56, 
		SELECT=57, DISPATCH=58, CREATE_ACTION=59, CREATE_REDUCER=60, CREATE_EFFECT=61, 
		CREATE_SELECTOR=62, PROPS=63, ON=64, STATE=65, PAYLOAD=66, TYPE=67, ROUTER=68, 
		ROUTER_OUTLET=69, ROUTER_LINK=70, ROUTER_LINK_ACTIVE=71, ACTIVATED_ROUTE=72, 
		NAVIGATE=73, NAVIGATE_BY_URL=74, ROUTE_CONFIG=75, PATH=76, COMPONENT_ROUTE=77, 
		REDIRECT_TO=78, PATH_MATCH=79, CHILDREN=80, LAZY_LOAD=81, CAN_ACTIVATE=82, 
		CAN_DEACTIVATE=83, RESOLVE=84, GUARD=85, OUTLET=86, OBSERVABLE=87, SUBSCRIBE=88, 
		MAP=89, FILTER=90, SWITCH_MAP=91, MERGE_MAP=92, CONCAT_MAP=93, CATCH_ERROR=94, 
		TAP=95, TAKE=96, PIPE_OP=97, SUBJECT=98, BEHAVIOR_SUBJECT=99, HTTP_CLIENT=100, 
		HTTP_GET=101, HTTP_POST=102, HTTP_PUT=103, HTTP_DELETE=104, HTTP_PATCH=105, 
		SPREAD=106, OPTIONAL_CHAINING=107, GT=108, GTE=109, LT=110, LTE=111, ASSIGN=112, 
		NOT=113, EQ=114, NEQ=115, STRICT_EQ=116, STRICT_NEQ=117, PLUS=118, MINUS=119, 
		MULT=120, DIV=121, MOD=122, AND=123, OR=124, BIT_AND=125, BIT_XOR=126, 
		BIT_OR=127, PLUS_ASSIGN=128, MINUS_ASSIGN=129, MULTIPLY_ASSIGN=130, DIVIDE_ASSIGN=131, 
		MODULUS_ASSIGN=132, POWER_ASSIGN=133, RIGHT_SHIFT_ARITHMETIC_ASSIGN=134, 
		LEFT_SHIFT_ARITHMETIC_ASSIGN=135, RIGHT_SHIFT_LOGICAL_ASSIGN=136, BIT_AND_ASSIGN=137, 
		BIT_XOR_ASSIGN=138, BIT_OR_ASSIGN=139, ARROW=140, NULLCOALESCE=141, PLUS_PLUS=142, 
		MINUS_MINUS=143, SEMI=144, COLON=145, COMMA=146, DOT=147, QUES=148, AT=149, 
		HASH_TAG=150, QUOTE=151, LPAREN=152, RPAREN=153, LBRACE=154, RBRACE=155, 
		LBRACK=156, RBRACK=157, FOR=158, DO=159, WHILE=160, BREAK=161, CONTINUE=162, 
		OF=163, IN=164, STRING=165, NUMBER=166, BOOL=167, NULL=168, IDENTIFIER=169, 
		HTML_TEMPLATE=170, IGNORE_TEMPLATE=171, TEMPLATE_LITERAL=172, OPEN_TAG=173, 
		CLOSE_TAG=174, SLASH=175, EQUALS=176, COL=177, STRING_HTML=178, INTERPOLATION_START=179, 
		INTERPOLATION_END=180, BINDING=181, EVENT=182, TWOBIND=183, NGFOR=184, 
		NGIF=185, DDIRECTIVE=186, P=187, REFERENCE_VAR=188, ATTRIBUTE=189, HTML_CLASS=190, 
		WHITESPACE=191, COMMENT=192, END_HTML=193;
	public static final int
		RULE_program = 0, RULE_importStatement = 1, RULE_importDeclaration = 2, 
		RULE_importDefaultSpecifier = 3, RULE_importNamespaceSpecifier = 4, RULE_importNamedSpecifier = 5, 
		RULE_importSpecifier = 6, RULE_bootstrapSpecifier = 7, RULE_declaration = 8, 
		RULE_variableDeclaration = 9, RULE_varHelper = 10, RULE_functionDeclaration = 11, 
		RULE_normalFunction = 12, RULE_anonymousFunction = 13, RULE_arrowFunction = 14, 
		RULE_block = 15, RULE_ngModuleDeclaration = 16, RULE_moduleMetadata = 17, 
		RULE_metadataModuleProperty = 18, RULE_componentDeclaration = 19, RULE_componentMetadata = 20, 
		RULE_metadataComponentProperty = 21, RULE_directiveDeclaration = 22, RULE_directiveMetadata = 23, 
		RULE_directiveMetadataProperty = 24, RULE_decorator = 25, RULE_pipeDeclaration = 26, 
		RULE_pipeMetadata = 27, RULE_pipeMetadataProperty = 28, RULE_injectableDeclaration = 29, 
		RULE_injectableMetadata = 30, RULE_injectableMetadataProperty = 31, RULE_classDeclaration = 32, 
		RULE_classBody = 33, RULE_propertyDeclaration = 34, RULE_methodDeclaration = 35, 
		RULE_constructorDeclaration = 36, RULE_constructorBody = 37, RULE_interfaceDeclaration = 38, 
		RULE_interfaceBody = 39, RULE_interfaceProperty = 40, RULE_enumDeclaration = 41, 
		RULE_enumBody = 42, RULE_enumProperty = 43, RULE_statement = 44, RULE_assignment = 45, 
		RULE_printStatement = 46, RULE_returnStatement = 47, RULE_throwStatement = 48, 
		RULE_conditionalStatement = 49, RULE_ifStatement = 50, RULE_elseIfStatement = 51, 
		RULE_elseStatement = 52, RULE_statementBody = 53, RULE_functionCall = 54, 
		RULE_bootstrapCall = 55, RULE_iterationStatement = 56, RULE_parameterList = 57, 
		RULE_parameter = 58, RULE_parameterDeclaration = 59, RULE_array = 60, 
		RULE_value = 61, RULE_object = 62, RULE_attributes = 63, RULE_attribute = 64, 
		RULE_objectInstantiation = 65, RULE_memberAccess = 66, RULE_arrayAccess = 67, 
		RULE_initialization = 68, RULE_primary = 69, RULE_literal = 70, RULE_expression = 71, 
		RULE_genericType = 72, RULE_typeAnnotation = 73, RULE_accessModifier = 74, 
		RULE_htmlTemplate = 75, RULE_element = 76, RULE_openTag = 77, RULE_closeTag = 78, 
		RULE_selfClosingTag = 79, RULE_content = 80, RULE_attributeHTML = 81, 
		RULE_interpolation = 82, RULE_interpolationElement = 83, RULE_tagName = 84, 
		RULE_structuralDirective = 85, RULE_stateManagementDeclaration = 86, RULE_storeDeclaration = 87, 
		RULE_storeProperty = 88, RULE_actionDeclaration = 89, RULE_propsDeclaration = 90, 
		RULE_initialState = 91, RULE_actionReference = 92, RULE_effectDeclaration = 93, 
		RULE_selectorDeclaration = 94, RULE_selectorFeature = 95, RULE_selectorProjection = 96, 
		RULE_routingDeclaration = 97, RULE_routeConfigDeclaration = 98, RULE_routeDefinition = 99, 
		RULE_routeProperty = 100, RULE_guardInterface = 101, RULE_guardBody = 102, 
		RULE_resolverDeclaration = 103, RULE_resolverBody = 104, RULE_observableExpression = 105, 
		RULE_pipeOperator = 106, RULE_subscribeCallback = 107, RULE_subscribeOptions = 108, 
		RULE_subscribeOption = 109, RULE_enhancedExpression = 110, RULE_stateExpression = 111, 
		RULE_navigationExpression = 112, RULE_stateNavigationAttribute = 113;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importStatement", "importDeclaration", "importDefaultSpecifier", 
			"importNamespaceSpecifier", "importNamedSpecifier", "importSpecifier", 
			"bootstrapSpecifier", "declaration", "variableDeclaration", "varHelper", 
			"functionDeclaration", "normalFunction", "anonymousFunction", "arrowFunction", 
			"block", "ngModuleDeclaration", "moduleMetadata", "metadataModuleProperty", 
			"componentDeclaration", "componentMetadata", "metadataComponentProperty", 
			"directiveDeclaration", "directiveMetadata", "directiveMetadataProperty", 
			"decorator", "pipeDeclaration", "pipeMetadata", "pipeMetadataProperty", 
			"injectableDeclaration", "injectableMetadata", "injectableMetadataProperty", 
			"classDeclaration", "classBody", "propertyDeclaration", "methodDeclaration", 
			"constructorDeclaration", "constructorBody", "interfaceDeclaration", 
			"interfaceBody", "interfaceProperty", "enumDeclaration", "enumBody", 
			"enumProperty", "statement", "assignment", "printStatement", "returnStatement", 
			"throwStatement", "conditionalStatement", "ifStatement", "elseIfStatement", 
			"elseStatement", "statementBody", "functionCall", "bootstrapCall", "iterationStatement", 
			"parameterList", "parameter", "parameterDeclaration", "array", "value", 
			"object", "attributes", "attribute", "objectInstantiation", "memberAccess", 
			"arrayAccess", "initialization", "primary", "literal", "expression", 
			"genericType", "typeAnnotation", "accessModifier", "htmlTemplate", "element", 
			"openTag", "closeTag", "selfClosingTag", "content", "attributeHTML", 
			"interpolation", "interpolationElement", "tagName", "structuralDirective", 
			"stateManagementDeclaration", "storeDeclaration", "storeProperty", "actionDeclaration", 
			"propsDeclaration", "initialState", "actionReference", "effectDeclaration", 
			"selectorDeclaration", "selectorFeature", "selectorProjection", "routingDeclaration", 
			"routeConfigDeclaration", "routeDefinition", "routeProperty", "guardInterface", 
			"guardBody", "resolverDeclaration", "resolverBody", "observableExpression", 
			"pipeOperator", "subscribeCallback", "subscribeOptions", "subscribeOption", 
			"enhancedExpression", "stateExpression", "navigationExpression", "stateNavigationAttribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'@NgModule'", "'@Component'", "'@Directive'", 
			"'@Pipe'", "'@Injectable'", "'selector'", "'templateUrl'", "'template'", 
			"'styleUrls'", "'styles'", "'imports'", "'exports'", "'inputs'", "'outputs'", 
			"'declarations'", "'providers'", "'bootstrap'", "'standalone'", "'import'", 
			"'from'", "'as'", "'platformBrowserDynamic'", "'bootstrapModule'", "'bootstrapApplication'", 
			"'let'", "'const'", "'if'", "'else'", "'return'", "'throw'", "'console'", 
			"'log'", "'catch'", "'error'", "'export'", "'interface'", null, "'enum'", 
			"'extends'", "'implements'", "'constructor'", "'this'", "'new'", "'function'", 
			"'private'", "'public'", "'protected'", "'Store'", "'Action'", "'reducer'", 
			"'Effect'", "'Effects'", "'select'", "'dispatch'", "'createAction'", 
			"'createReducer'", "'createEffect'", "'createSelector'", "'props'", "'on'", 
			"'state'", "'payload'", "'type'", "'Router'", "'router-outlet'", "'routerLink'", 
			"'routerLinkActive'", "'ActivatedRoute'", "'navigate'", "'navigateByUrl'", 
			"'Routes'", "'path'", "'component'", "'redirectTo'", "'pathMatch'", "'children'", 
			"'loadChildren'", "'canActivate'", "'canDeactivate'", "'resolve'", "'Guard'", 
			"'outlet'", "'Observable'", "'subscribe'", "'map'", "'filter'", "'switchMap'", 
			"'mergeMap'", "'concatMap'", "'catchError'", "'tap'", "'take'", "'pipe'", 
			"'Subject'", "'BehaviorSubject'", "'HttpClient'", "'get'", "'post'", 
			"'put'", "'delete'", "'patch'", "'...'", "'?.'", null, "'>='", null, 
			"'<='", null, "'!'", "'=='", "'!='", "'==='", "'!=='", "'+'", "'-'", 
			"'*'", null, "'%'", "'&&'", "'||'", "'&'", "'^'", null, "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'**='", "'>>='", "'<<='", "'>>>='", "'&='", 
			"'^='", "'|='", "'=>'", "'??'", "'++'", "'--'", "';'", null, "','", "'.'", 
			"'?'", "'@'", "'#'", null, "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'for'", "'do'", "'while'", "'break'", "'continue'", "'of'", "'in'", 
			null, null, null, "'null'", null, null, null, null, null, null, null, 
			null, null, null, "'{{'", "'}}'", null, null, null, "'*ngFor'", "'*ngIf'", 
			null, null, null, null, null, null, null, "'`'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACES", "LINE_COMMENT", "BLOCK_COMMENT", "HTML_COMMENT", "MODULE", 
			"COMPONENT", "DIRECTIVE", "PIPE", "INJECTABLE", "SELECTOR", "TEMPLATE_URL", 
			"TEMPLATE", "STYLE_URLS", "STYLES", "IMPORTS", "EXPORTS", "INPUTS", "OUTPUTS", 
			"DECLARATIONS", "PROVIDERS", "BOOTSTRAP", "STANDALONE", "IMPORT", "FROM", 
			"AS", "PLATFORM_BROWSER_DYNAMIC", "BOOTSTRAP_MODULE", "BOOTSTRAP_APPLICATION", 
			"LET", "CONST", "IF", "ELSE", "RETURN", "THROW", "CONSOLE", "LOG", "CATCH", 
			"ERROR", "EXPORT", "INTERFACE", "CLASS", "ENUM", "EXTENDS", "IMPLEMENTS", 
			"CONSTRUCTOR", "THIS", "NEW", "FUNCTION", "PRIVATE", "PUBLIC", "PROTECTED", 
			"STORE", "ACTION", "REDUCER", "EFFECT", "EFFECTS", "SELECT", "DISPATCH", 
			"CREATE_ACTION", "CREATE_REDUCER", "CREATE_EFFECT", "CREATE_SELECTOR", 
			"PROPS", "ON", "STATE", "PAYLOAD", "TYPE", "ROUTER", "ROUTER_OUTLET", 
			"ROUTER_LINK", "ROUTER_LINK_ACTIVE", "ACTIVATED_ROUTE", "NAVIGATE", "NAVIGATE_BY_URL", 
			"ROUTE_CONFIG", "PATH", "COMPONENT_ROUTE", "REDIRECT_TO", "PATH_MATCH", 
			"CHILDREN", "LAZY_LOAD", "CAN_ACTIVATE", "CAN_DEACTIVATE", "RESOLVE", 
			"GUARD", "OUTLET", "OBSERVABLE", "SUBSCRIBE", "MAP", "FILTER", "SWITCH_MAP", 
			"MERGE_MAP", "CONCAT_MAP", "CATCH_ERROR", "TAP", "TAKE", "PIPE_OP", "SUBJECT", 
			"BEHAVIOR_SUBJECT", "HTTP_CLIENT", "HTTP_GET", "HTTP_POST", "HTTP_PUT", 
			"HTTP_DELETE", "HTTP_PATCH", "SPREAD", "OPTIONAL_CHAINING", "GT", "GTE", 
			"LT", "LTE", "ASSIGN", "NOT", "EQ", "NEQ", "STRICT_EQ", "STRICT_NEQ", 
			"PLUS", "MINUS", "MULT", "DIV", "MOD", "AND", "OR", "BIT_AND", "BIT_XOR", 
			"BIT_OR", "PLUS_ASSIGN", "MINUS_ASSIGN", "MULTIPLY_ASSIGN", "DIVIDE_ASSIGN", 
			"MODULUS_ASSIGN", "POWER_ASSIGN", "RIGHT_SHIFT_ARITHMETIC_ASSIGN", "LEFT_SHIFT_ARITHMETIC_ASSIGN", 
			"RIGHT_SHIFT_LOGICAL_ASSIGN", "BIT_AND_ASSIGN", "BIT_XOR_ASSIGN", "BIT_OR_ASSIGN", 
			"ARROW", "NULLCOALESCE", "PLUS_PLUS", "MINUS_MINUS", "SEMI", "COLON", 
			"COMMA", "DOT", "QUES", "AT", "HASH_TAG", "QUOTE", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "FOR", "DO", "WHILE", "BREAK", 
			"CONTINUE", "OF", "IN", "STRING", "NUMBER", "BOOL", "NULL", "IDENTIFIER", 
			"HTML_TEMPLATE", "IGNORE_TEMPLATE", "TEMPLATE_LITERAL", "OPEN_TAG", "CLOSE_TAG", 
			"SLASH", "EQUALS", "COL", "STRING_HTML", "INTERPOLATION_START", "INTERPOLATION_END", 
			"BINDING", "EVENT", "TWOBIND", "NGFOR", "NGIF", "DDIRECTIVE", "P", "REFERENCE_VAR", 
			"ATTRIBUTE", "HTML_CLASS", "WHITESPACE", "COMMENT", "END_HTML"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<ImportStatementContext> importStatement() {
			return getRuleContexts(ImportStatementContext.class);
		}
		public ImportStatementContext importStatement(int i) {
			return getRuleContext(ImportStatementContext.class,i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(228);
				importStatement();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4441541577802720L) != 0 || (((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 139869511435157505L) != 0) {
				{
				setState(236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(234);
					declaration();
					}
					break;
				case 2:
					{
					setState(235);
					statement();
					}
					break;
				}
				}
				setState(240);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AngularParser.IMPORT, 0); }
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(IMPORT);
			setState(242);
			importDeclaration();
			setState(243);
			match(FROM);
			setState(244);
			match(STRING);
			setState(245);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
	 
		public ImportDeclarationContext() { }
		public void copyFrom(ImportDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultSpecifierDeclarationContext extends ImportDeclarationContext {
		public ImportDefaultSpecifierContext importDefaultSpecifier() {
			return getRuleContext(ImportDefaultSpecifierContext.class,0);
		}
		public DefaultSpecifierDeclarationContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDefaultSpecifierDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDefaultSpecifierDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDefaultSpecifierDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamespaceSpecifierDeclarationContext extends ImportDeclarationContext {
		public ImportNamespaceSpecifierContext importNamespaceSpecifier() {
			return getRuleContext(ImportNamespaceSpecifierContext.class,0);
		}
		public NamespaceSpecifierDeclarationContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNamespaceSpecifierDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNamespaceSpecifierDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNamespaceSpecifierDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NamedSpecifierDeclarationContext extends ImportDeclarationContext {
		public ImportNamedSpecifierContext importNamedSpecifier() {
			return getRuleContext(ImportNamedSpecifierContext.class,0);
		}
		public NamedSpecifierDeclarationContext(ImportDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNamedSpecifierDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNamedSpecifierDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNamedSpecifierDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		try {
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new DefaultSpecifierDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				importDefaultSpecifier();
				}
				break;
			case 2:
				_localctx = new NamespaceSpecifierDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				importNamespaceSpecifier();
				}
				break;
			case 3:
				_localctx = new NamedSpecifierDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				importNamedSpecifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportDefaultSpecifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ImportDefaultSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDefaultSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportDefaultSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportDefaultSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportDefaultSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDefaultSpecifierContext importDefaultSpecifier() throws RecognitionException {
		ImportDefaultSpecifierContext _localctx = new ImportDefaultSpecifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importDefaultSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportNamespaceSpecifierContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(AngularParser.MULT, 0); }
		public TerminalNode AS() { return getToken(AngularParser.AS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ImportNamespaceSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNamespaceSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportNamespaceSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportNamespaceSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportNamespaceSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNamespaceSpecifierContext importNamespaceSpecifier() throws RecognitionException {
		ImportNamespaceSpecifierContext _localctx = new ImportNamespaceSpecifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importNamespaceSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(MULT);
			setState(255);
			match(AS);
			setState(256);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportNamedSpecifierContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<ImportSpecifierContext> importSpecifier() {
			return getRuleContexts(ImportSpecifierContext.class);
		}
		public ImportSpecifierContext importSpecifier(int i) {
			return getRuleContext(ImportSpecifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ImportNamedSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNamedSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportNamedSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportNamedSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportNamedSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportNamedSpecifierContext importNamedSpecifier() throws RecognitionException {
		ImportNamedSpecifierContext _localctx = new ImportNamedSpecifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importNamedSpecifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0 || _la==IDENTIFIER) {
				{
				{
				setState(258);
				importSpecifier();
				setState(259);
				match(COMMA);
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(LBRACE);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0 || _la==IDENTIFIER) {
				{
				setState(267);
				importSpecifier();
				setState(272);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(268);
						match(COMMA);
						setState(269);
						importSpecifier();
						}
						} 
					}
					setState(274);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(275);
					match(COMMA);
					}
				}

				}
			}

			setState(280);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportSpecifierContext extends ParserRuleContext {
		public ImportSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importSpecifier; }
	 
		public ImportSpecifierContext() { }
		public void copyFrom(ImportSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BootstrapImportSpecifierContext extends ImportSpecifierContext {
		public BootstrapSpecifierContext bootstrapSpecifier() {
			return getRuleContext(BootstrapSpecifierContext.class,0);
		}
		public BootstrapImportSpecifierContext(ImportSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBootstrapImportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBootstrapImportSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBootstrapImportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierImportSpecifierContext extends ImportSpecifierContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IdentifierImportSpecifierContext(ImportSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierImportSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierImportSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierImportSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportSpecifierContext importSpecifier() throws RecognitionException {
		ImportSpecifierContext _localctx = new ImportSpecifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_importSpecifier);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentifierImportSpecifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				match(IDENTIFIER);
				}
				break;
			case PLATFORM_BROWSER_DYNAMIC:
			case BOOTSTRAP_MODULE:
			case BOOTSTRAP_APPLICATION:
				_localctx = new BootstrapImportSpecifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				bootstrapSpecifier();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BootstrapSpecifierContext extends ParserRuleContext {
		public TerminalNode PLATFORM_BROWSER_DYNAMIC() { return getToken(AngularParser.PLATFORM_BROWSER_DYNAMIC, 0); }
		public TerminalNode BOOTSTRAP_MODULE() { return getToken(AngularParser.BOOTSTRAP_MODULE, 0); }
		public TerminalNode BOOTSTRAP_APPLICATION() { return getToken(AngularParser.BOOTSTRAP_APPLICATION, 0); }
		public BootstrapSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bootstrapSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBootstrapSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBootstrapSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBootstrapSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BootstrapSpecifierContext bootstrapSpecifier() throws RecognitionException {
		BootstrapSpecifierContext _localctx = new BootstrapSpecifierContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bootstrapSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PipeDeclContext extends DeclarationContext {
		public PipeDeclarationContext pipeDeclaration() {
			return getRuleContext(PipeDeclarationContext.class,0);
		}
		public PipeDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPipeDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPipeDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPipeDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclContext extends DeclarationContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ClassDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InjectableDeclContext extends DeclarationContext {
		public InjectableDeclarationContext injectableDeclaration() {
			return getRuleContext(InjectableDeclarationContext.class,0);
		}
		public InjectableDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInjectableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInjectableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInjectableDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclContext extends DeclarationContext {
		public ComponentDeclarationContext componentDeclaration() {
			return getRuleContext(ComponentDeclarationContext.class,0);
		}
		public ComponentDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclContext extends DeclarationContext {
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public InterfaceDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclContext extends DeclarationContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveDeclContext extends DeclarationContext {
		public DirectiveDeclarationContext directiveDeclaration() {
			return getRuleContext(DirectiveDeclarationContext.class,0);
		}
		public DirectiveDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDirectiveDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDirectiveDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDirectiveDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclContext extends DeclarationContext {
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public EnumDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEnumDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEnumDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEnumDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NgModuleDeclContext extends DeclarationContext {
		public NgModuleDeclarationContext ngModuleDeclaration() {
			return getRuleContext(NgModuleDeclarationContext.class,0);
		}
		public NgModuleDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgModuleDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgModuleDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgModuleDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends DeclarationContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new NgModuleDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				ngModuleDeclaration();
				}
				break;
			case 2:
				_localctx = new ComponentDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				componentDeclaration();
				}
				break;
			case 3:
				_localctx = new PipeDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				pipeDeclaration();
				}
				break;
			case 4:
				_localctx = new InjectableDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				injectableDeclaration();
				}
				break;
			case 5:
				_localctx = new DirectiveDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(292);
				directiveDeclaration();
				}
				break;
			case 6:
				_localctx = new InterfaceDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(293);
				interfaceDeclaration();
				}
				break;
			case 7:
				_localctx = new ClassDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(294);
				classDeclaration();
				}
				break;
			case 8:
				_localctx = new EnumDeclContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(295);
				enumDeclaration();
				}
				break;
			case 9:
				_localctx = new VariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(296);
				variableDeclaration();
				}
				break;
			case 10:
				_localctx = new FunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(297);
				functionDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VarHelperContext varHelper() {
			return getRuleContext(VarHelperContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			varHelper();
			setState(301);
			match(IDENTIFIER);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(302);
				match(COLON);
				setState(303);
				typeAnnotation();
				}
			}

			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(306);
				match(ASSIGN);
				setState(307);
				initialization();
				}
			}

			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(310);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarHelperContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(AngularParser.LET, 0); }
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public VarHelperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varHelper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVarHelper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVarHelper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVarHelper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarHelperContext varHelper() throws RecognitionException {
		VarHelperContext _localctx = new VarHelperContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varHelper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_la = _input.LA(1);
			if ( !(_la==LET || _la==CONST) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	 
		public FunctionDeclarationContext() { }
		public void copyFrom(FunctionDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionDeclarationContext extends FunctionDeclarationContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public ArrowFunctionDeclarationContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NormalFunctionDeclarationContext extends FunctionDeclarationContext {
		public NormalFunctionContext normalFunction() {
			return getRuleContext(NormalFunctionContext.class,0);
		}
		public NormalFunctionDeclarationContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNormalFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNormalFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNormalFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AnonymousFunctionDeclarationContext extends FunctionDeclarationContext {
		public AnonymousFunctionContext anonymousFunction() {
			return getRuleContext(AnonymousFunctionContext.class,0);
		}
		public AnonymousFunctionDeclarationContext(FunctionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAnonymousFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAnonymousFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAnonymousFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionDeclaration);
		try {
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new NormalFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				normalFunction();
				}
				break;
			case 2:
				_localctx = new AnonymousFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				anonymousFunction();
				}
				break;
			case 3:
				_localctx = new ArrowFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				arrowFunction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NormalFunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public NormalFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNormalFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNormalFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNormalFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFunctionContext normalFunction() throws RecognitionException {
		NormalFunctionContext _localctx = new NormalFunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_normalFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(FUNCTION);
			setState(321);
			match(IDENTIFIER);
			setState(322);
			match(LPAREN);
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230883192832L) != 0 || (((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 139623220830535681L) != 0) {
				{
				setState(323);
				parameterList();
				}
			}

			setState(326);
			match(RPAREN);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(327);
				match(COLON);
				setState(328);
				typeAnnotation();
				}
			}

			setState(331);
			match(LBRACE);
			setState(332);
			block();
			setState(333);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnonymousFunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(AngularParser.FUNCTION, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public AnonymousFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAnonymousFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAnonymousFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAnonymousFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
		AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_anonymousFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(FUNCTION);
			setState(336);
			match(LPAREN);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230883192832L) != 0 || (((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 139623220830535681L) != 0) {
				{
				setState(337);
				parameterList();
				}
			}

			setState(340);
			match(RPAREN);
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(341);
				match(COLON);
				setState(342);
				typeAnnotation();
				}
			}

			setState(345);
			match(LBRACE);
			setState(346);
			block();
			setState(347);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(AngularParser.ARROW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				{
				setState(349);
				match(LPAREN);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230883192832L) != 0 || (((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 139623220830535681L) != 0) {
					{
					setState(350);
					parameterList();
					}
				}

				setState(353);
				match(RPAREN);
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(354);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(357);
				match(COLON);
				setState(358);
				typeAnnotation();
				}
			}

			setState(361);
			match(ARROW);
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(362);
				statement();
				}
				break;
			case 2:
				{
				setState(363);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(LBRACE);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4433295240593408L) != 0 || (((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 139869511435157505L) != 0) {
				{
				setState(369);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLATFORM_BROWSER_DYNAMIC:
				case BOOTSTRAP_MODULE:
				case BOOTSTRAP_APPLICATION:
				case IF:
				case RETURN:
				case THROW:
				case CONSOLE:
				case THIS:
				case NEW:
				case FUNCTION:
				case PRIVATE:
				case PUBLIC:
				case PROTECTED:
				case NOT:
				case PLUS_PLUS:
				case MINUS_MINUS:
				case DOT:
				case AT:
				case LPAREN:
				case LBRACE:
				case LBRACK:
				case FOR:
				case DO:
				case WHILE:
				case STRING:
				case NUMBER:
				case BOOL:
				case NULL:
				case IDENTIFIER:
					{
					setState(367);
					statement();
					}
					break;
				case LET:
				case CONST:
					{
					setState(368);
					variableDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NgModuleDeclarationContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(AngularParser.MODULE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public ModuleMetadataContext moduleMetadata() {
			return getRuleContext(ModuleMetadataContext.class,0);
		}
		public NgModuleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngModuleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgModuleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgModuleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgModuleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgModuleDeclarationContext ngModuleDeclaration() throws RecognitionException {
		NgModuleDeclarationContext _localctx = new NgModuleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ngModuleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(MODULE);
			setState(377);
			match(LPAREN);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(378);
				match(LBRACE);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 3768320L) != 0) {
					{
					setState(379);
					moduleMetadata();
					}
				}

				setState(382);
				match(RBRACE);
				}
			}

			setState(385);
			match(RPAREN);
			setState(386);
			classDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ModuleMetadataContext extends ParserRuleContext {
		public List<MetadataModulePropertyContext> metadataModuleProperty() {
			return getRuleContexts(MetadataModulePropertyContext.class);
		}
		public MetadataModulePropertyContext metadataModuleProperty(int i) {
			return getRuleContext(MetadataModulePropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ModuleMetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleMetadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterModuleMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitModuleMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitModuleMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleMetadataContext moduleMetadata() throws RecognitionException {
		ModuleMetadataContext _localctx = new ModuleMetadataContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_moduleMetadata);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			metadataModuleProperty();
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(389);
					match(COMMA);
					setState(390);
					metadataModuleProperty();
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(396);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MetadataModulePropertyContext extends ParserRuleContext {
		public MetadataModulePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataModuleProperty; }
	 
		public MetadataModulePropertyContext() { }
		public void copyFrom(MetadataModulePropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportsModulePropertyContext extends MetadataModulePropertyContext {
		public TerminalNode EXPORTS() { return getToken(AngularParser.EXPORTS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExportsModulePropertyContext(MetadataModulePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportsModuleProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportsModuleProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportsModuleProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationsModulePropertyContext extends MetadataModulePropertyContext {
		public TerminalNode DECLARATIONS() { return getToken(AngularParser.DECLARATIONS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public DeclarationsModulePropertyContext(MetadataModulePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeclarationsModuleProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeclarationsModuleProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeclarationsModuleProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProvidersModulePropertyContext extends MetadataModulePropertyContext {
		public TerminalNode PROVIDERS() { return getToken(AngularParser.PROVIDERS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ProvidersModulePropertyContext(MetadataModulePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProvidersModuleProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProvidersModuleProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProvidersModuleProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportsModulePropertyContext extends MetadataModulePropertyContext {
		public TerminalNode IMPORTS() { return getToken(AngularParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ImportsModulePropertyContext(MetadataModulePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportsModuleProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportsModuleProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportsModuleProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BootstrapPropertyContext extends MetadataModulePropertyContext {
		public TerminalNode BOOTSTRAP() { return getToken(AngularParser.BOOTSTRAP, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public BootstrapPropertyContext(MetadataModulePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBootstrapProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBootstrapProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBootstrapProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataModulePropertyContext metadataModuleProperty() throws RecognitionException {
		MetadataModulePropertyContext _localctx = new MetadataModulePropertyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_metadataModuleProperty);
		try {
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOTSTRAP:
				_localctx = new BootstrapPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(BOOTSTRAP);
				setState(400);
				match(COLON);
				setState(401);
				array();
				}
				break;
			case DECLARATIONS:
				_localctx = new DeclarationsModulePropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				match(DECLARATIONS);
				setState(403);
				match(COLON);
				setState(404);
				array();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsModulePropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				match(IMPORTS);
				setState(406);
				match(COLON);
				setState(407);
				array();
				}
				break;
			case EXPORTS:
				_localctx = new ExportsModulePropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				match(EXPORTS);
				setState(409);
				match(COLON);
				setState(410);
				array();
				}
				break;
			case PROVIDERS:
				_localctx = new ProvidersModulePropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(411);
				match(PROVIDERS);
				setState(412);
				match(COLON);
				setState(413);
				array();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentDeclarationContext extends ParserRuleContext {
		public TerminalNode COMPONENT() { return getToken(AngularParser.COMPONENT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public ComponentMetadataContext componentMetadata() {
			return getRuleContext(ComponentMetadataContext.class,0);
		}
		public ComponentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentDeclarationContext componentDeclaration() throws RecognitionException {
		ComponentDeclarationContext _localctx = new ComponentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_componentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(COMPONENT);
			setState(417);
			match(LPAREN);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(418);
				match(LBRACE);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 6290432L) != 0) {
					{
					setState(419);
					componentMetadata();
					}
				}

				setState(422);
				match(RBRACE);
				}
			}

			setState(425);
			match(RPAREN);
			setState(426);
			classDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentMetadataContext extends ParserRuleContext {
		public List<MetadataComponentPropertyContext> metadataComponentProperty() {
			return getRuleContexts(MetadataComponentPropertyContext.class);
		}
		public MetadataComponentPropertyContext metadataComponentProperty(int i) {
			return getRuleContext(MetadataComponentPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ComponentMetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentMetadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentMetadataContext componentMetadata() throws RecognitionException {
		ComponentMetadataContext _localctx = new ComponentMetadataContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_componentMetadata);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			metadataComponentProperty();
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(429);
					match(COMMA);
					setState(430);
					metadataComponentProperty();
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(436);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MetadataComponentPropertyContext extends ParserRuleContext {
		public MetadataComponentPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadataComponentProperty; }
	 
		public MetadataComponentPropertyContext() { }
		public void copyFrom(MetadataComponentPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandalonePropertyContext extends MetadataComponentPropertyContext {
		public TerminalNode STANDALONE() { return getToken(AngularParser.STANDALONE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode BOOL() { return getToken(AngularParser.BOOL, 0); }
		public StandalonePropertyContext(MetadataComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandaloneProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandaloneProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandaloneProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StyleUrlsPropertyContext extends MetadataComponentPropertyContext {
		public TerminalNode STYLE_URLS() { return getToken(AngularParser.STYLE_URLS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public StyleUrlsPropertyContext(MetadataComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStyleUrlsProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStyleUrlsProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStyleUrlsProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProvidersComponentPropertyContext extends MetadataComponentPropertyContext {
		public TerminalNode PROVIDERS() { return getToken(AngularParser.PROVIDERS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ProvidersComponentPropertyContext(MetadataComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProvidersComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProvidersComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProvidersComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplatePropertyContext extends MetadataComponentPropertyContext {
		public TerminalNode TEMPLATE() { return getToken(AngularParser.TEMPLATE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public HtmlTemplateContext htmlTemplate() {
			return getRuleContext(HtmlTemplateContext.class,0);
		}
		public TemplatePropertyContext(MetadataComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportsComponentPropertyContext extends MetadataComponentPropertyContext {
		public TerminalNode IMPORTS() { return getToken(AngularParser.IMPORTS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ImportsComponentPropertyContext(MetadataComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportsComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportsComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportsComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputsPropertyContext extends MetadataComponentPropertyContext {
		public TerminalNode INPUTS() { return getToken(AngularParser.INPUTS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public InputsPropertyContext(MetadataComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInputsProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInputsProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInputsProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorComponentPropertyContext extends MetadataComponentPropertyContext {
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public SelectorComponentPropertyContext(MetadataComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputsPropertyContext extends MetadataComponentPropertyContext {
		public TerminalNode OUTPUTS() { return getToken(AngularParser.OUTPUTS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public OutputsPropertyContext(MetadataComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOutputsProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOutputsProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOutputsProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExportsComponentPropertyContext extends MetadataComponentPropertyContext {
		public TerminalNode EXPORTS() { return getToken(AngularParser.EXPORTS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ExportsComponentPropertyContext(MetadataComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportsComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportsComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportsComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationsComponentPropertyContext extends MetadataComponentPropertyContext {
		public TerminalNode DECLARATIONS() { return getToken(AngularParser.DECLARATIONS, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public DeclarationsComponentPropertyContext(MetadataComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDeclarationsComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDeclarationsComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDeclarationsComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StylesPropertyContext extends MetadataComponentPropertyContext {
		public TerminalNode STYLES() { return getToken(AngularParser.STYLES, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public StylesPropertyContext(MetadataComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStylesProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStylesProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStylesProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateUrlPropertyContext extends MetadataComponentPropertyContext {
		public TerminalNode TEMPLATE_URL() { return getToken(AngularParser.TEMPLATE_URL, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TemplateUrlPropertyContext(MetadataComponentPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateUrlProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateUrlProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateUrlProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetadataComponentPropertyContext metadataComponentProperty() throws RecognitionException {
		MetadataComponentPropertyContext _localctx = new MetadataComponentPropertyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_metadataComponentProperty);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				match(SELECTOR);
				setState(440);
				match(COLON);
				setState(441);
				match(STRING);
				}
				break;
			case TEMPLATE_URL:
				_localctx = new TemplateUrlPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(TEMPLATE_URL);
				setState(443);
				match(COLON);
				setState(444);
				match(STRING);
				}
				break;
			case TEMPLATE:
				_localctx = new TemplatePropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(445);
				match(TEMPLATE);
				setState(446);
				match(COLON);
				setState(447);
				htmlTemplate();
				}
				break;
			case STYLE_URLS:
				_localctx = new StyleUrlsPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(448);
				match(STYLE_URLS);
				setState(449);
				match(COLON);
				setState(450);
				array();
				}
				break;
			case STYLES:
				_localctx = new StylesPropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(451);
				match(STYLES);
				setState(452);
				match(COLON);
				setState(453);
				array();
				}
				break;
			case STANDALONE:
				_localctx = new StandalonePropertyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(454);
				match(STANDALONE);
				setState(455);
				match(COLON);
				setState(456);
				match(BOOL);
				}
				break;
			case INPUTS:
				_localctx = new InputsPropertyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(457);
				match(INPUTS);
				setState(458);
				match(COLON);
				setState(459);
				array();
				}
				break;
			case OUTPUTS:
				_localctx = new OutputsPropertyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(460);
				match(OUTPUTS);
				setState(461);
				match(COLON);
				setState(462);
				array();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(463);
				match(IMPORTS);
				setState(464);
				match(COLON);
				setState(465);
				array();
				}
				break;
			case EXPORTS:
				_localctx = new ExportsComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(466);
				match(EXPORTS);
				setState(467);
				match(COLON);
				setState(468);
				array();
				}
				break;
			case PROVIDERS:
				_localctx = new ProvidersComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(469);
				match(PROVIDERS);
				setState(470);
				match(COLON);
				setState(471);
				array();
				}
				break;
			case DECLARATIONS:
				_localctx = new DeclarationsComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(472);
				match(DECLARATIONS);
				setState(473);
				match(COLON);
				setState(474);
				array();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveDeclarationContext extends ParserRuleContext {
		public TerminalNode DIRECTIVE() { return getToken(AngularParser.DIRECTIVE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public DirectiveMetadataContext directiveMetadata() {
			return getRuleContext(DirectiveMetadataContext.class,0);
		}
		public DirectiveDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDirectiveDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDirectiveDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDirectiveDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveDeclarationContext directiveDeclaration() throws RecognitionException {
		DirectiveDeclarationContext _localctx = new DirectiveDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_directiveDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(DIRECTIVE);
			setState(478);
			match(LPAREN);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(479);
				match(LBRACE);
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SELECTOR || _la==IDENTIFIER) {
					{
					setState(480);
					directiveMetadata();
					}
				}

				setState(483);
				match(RBRACE);
				}
			}

			setState(486);
			match(RPAREN);
			setState(487);
			classDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveMetadataContext extends ParserRuleContext {
		public List<DirectiveMetadataPropertyContext> directiveMetadataProperty() {
			return getRuleContexts(DirectiveMetadataPropertyContext.class);
		}
		public DirectiveMetadataPropertyContext directiveMetadataProperty(int i) {
			return getRuleContext(DirectiveMetadataPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public DirectiveMetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveMetadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDirectiveMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDirectiveMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDirectiveMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveMetadataContext directiveMetadata() throws RecognitionException {
		DirectiveMetadataContext _localctx = new DirectiveMetadataContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_directiveMetadata);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			directiveMetadataProperty();
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(490);
					match(COMMA);
					setState(491);
					directiveMetadataProperty();
					}
					} 
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(497);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectiveMetadataPropertyContext extends ParserRuleContext {
		public DirectiveMetadataPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directiveMetadataProperty; }
	 
		public DirectiveMetadataPropertyContext() { }
		public void copyFrom(DirectiveMetadataPropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierPropertyContext extends DirectiveMetadataPropertyContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierPropertyContext(DirectiveMetadataPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorDirectivePropertyContext extends DirectiveMetadataPropertyContext {
		public TerminalNode SELECTOR() { return getToken(AngularParser.SELECTOR, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public SelectorDirectivePropertyContext(DirectiveMetadataPropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorDirectiveProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorDirectiveProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorDirectiveProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveMetadataPropertyContext directiveMetadataProperty() throws RecognitionException {
		DirectiveMetadataPropertyContext _localctx = new DirectiveMetadataPropertyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_directiveMetadataProperty);
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorDirectivePropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				match(SELECTOR);
				setState(501);
				match(COLON);
				setState(502);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				match(IDENTIFIER);
				setState(504);
				match(COLON);
				setState(505);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AngularParser.AT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(AT);
			setState(509);
			match(IDENTIFIER);
			setState(510);
			match(LPAREN);
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230883192832L) != 0 || (((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 139623220830535681L) != 0) {
				{
				setState(511);
				parameterList();
				}
			}

			setState(514);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PipeDeclarationContext extends ParserRuleContext {
		public TerminalNode PIPE() { return getToken(AngularParser.PIPE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public PipeMetadataContext pipeMetadata() {
			return getRuleContext(PipeMetadataContext.class,0);
		}
		public PipeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPipeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPipeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPipeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipeDeclarationContext pipeDeclaration() throws RecognitionException {
		PipeDeclarationContext _localctx = new PipeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pipeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			match(PIPE);
			setState(517);
			match(LPAREN);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(518);
				match(LBRACE);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(519);
					pipeMetadata();
					}
				}

				setState(522);
				match(RBRACE);
				}
			}

			setState(525);
			match(RPAREN);
			setState(526);
			classDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PipeMetadataContext extends ParserRuleContext {
		public List<PipeMetadataPropertyContext> pipeMetadataProperty() {
			return getRuleContexts(PipeMetadataPropertyContext.class);
		}
		public PipeMetadataPropertyContext pipeMetadataProperty(int i) {
			return getRuleContext(PipeMetadataPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public PipeMetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeMetadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPipeMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPipeMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPipeMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipeMetadataContext pipeMetadata() throws RecognitionException {
		PipeMetadataContext _localctx = new PipeMetadataContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pipeMetadata);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			pipeMetadataProperty();
			setState(533);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(529);
					match(COMMA);
					setState(530);
					pipeMetadataProperty();
					}
					} 
				}
				setState(535);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(536);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PipeMetadataPropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PipeMetadataPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeMetadataProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPipeMetadataProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPipeMetadataProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPipeMetadataProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipeMetadataPropertyContext pipeMetadataProperty() throws RecognitionException {
		PipeMetadataPropertyContext _localctx = new PipeMetadataPropertyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pipeMetadataProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(IDENTIFIER);
			setState(540);
			match(COLON);
			setState(541);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InjectableDeclarationContext extends ParserRuleContext {
		public TerminalNode INJECTABLE() { return getToken(AngularParser.INJECTABLE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public InjectableMetadataContext injectableMetadata() {
			return getRuleContext(InjectableMetadataContext.class,0);
		}
		public InjectableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInjectableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInjectableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInjectableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectableDeclarationContext injectableDeclaration() throws RecognitionException {
		InjectableDeclarationContext _localctx = new InjectableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_injectableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(INJECTABLE);
			setState(544);
			match(LPAREN);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(545);
				match(LBRACE);
				setState(547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(546);
					injectableMetadata();
					}
				}

				setState(549);
				match(RBRACE);
				}
			}

			setState(552);
			match(RPAREN);
			setState(553);
			classDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class InjectableMetadataContext extends ParserRuleContext {
		public List<InjectableMetadataPropertyContext> injectableMetadataProperty() {
			return getRuleContexts(InjectableMetadataPropertyContext.class);
		}
		public InjectableMetadataPropertyContext injectableMetadataProperty(int i) {
			return getRuleContext(InjectableMetadataPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public InjectableMetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectableMetadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInjectableMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInjectableMetadata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInjectableMetadata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectableMetadataContext injectableMetadata() throws RecognitionException {
		InjectableMetadataContext _localctx = new InjectableMetadataContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_injectableMetadata);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			injectableMetadataProperty();
			setState(560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(556);
					match(COMMA);
					setState(557);
					injectableMetadataProperty();
					}
					} 
				}
				setState(562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(563);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InjectableMetadataPropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InjectableMetadataPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_injectableMetadataProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInjectableMetadataProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInjectableMetadataProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInjectableMetadataProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InjectableMetadataPropertyContext injectableMetadataProperty() throws RecognitionException {
		InjectableMetadataPropertyContext _localctx = new InjectableMetadataPropertyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_injectableMetadataProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(IDENTIFIER);
			setState(567);
			match(COLON);
			setState(568);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode EXTENDS() { return getToken(AngularParser.EXTENDS, 0); }
		public TerminalNode IMPLEMENTS() { return getToken(AngularParser.IMPLEMENTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(570);
				match(EXPORT);
				}
			}

			setState(573);
			match(CLASS);
			setState(574);
			match(IDENTIFIER);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(575);
				match(EXTENDS);
				setState(576);
				match(IDENTIFIER);
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(577);
					match(COMMA);
					setState(578);
					match(IDENTIFIER);
					}
					}
					setState(583);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(586);
				match(IMPLEMENTS);
				setState(587);
				match(IDENTIFIER);
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(588);
					match(COMMA);
					setState(589);
					match(IDENTIFIER);
					}
					}
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(597);
			match(LBRACE);
			setState(598);
			classBody();
			setState(599);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_classBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(601);
					propertyDeclaration();
					}
					} 
				}
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRUCTOR) {
				{
				setState(607);
				constructorDeclaration();
				}
			}

			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4433295240593408L) != 0 || (((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 139869511435157505L) != 0) {
				{
				setState(614);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(610);
					methodDeclaration();
					}
					break;
				case 2:
					{
					setState(611);
					statement();
					}
					break;
				case 3:
					{
					setState(612);
					variableDeclaration();
					}
					break;
				case 4:
					{
					setState(613);
					functionDeclaration();
					}
					break;
				}
				}
				setState(618);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public TerminalNode QUES() { return getToken(AngularParser.QUES, 0); }
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(619);
				decorator();
				}
				}
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0) {
				{
				setState(625);
				accessModifier();
				}
			}

			setState(628);
			match(IDENTIFIER);
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==QUES) {
				{
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUES) {
					{
					setState(629);
					match(QUES);
					}
				}

				setState(632);
				match(COLON);
				setState(633);
				typeAnnotation();
				}
			}

			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(636);
				match(ASSIGN);
				setState(637);
				initialization();
				}
			}

			setState(640);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(642);
				decorator();
				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(648);
			match(IDENTIFIER);
			setState(649);
			match(LPAREN);
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230883192832L) != 0 || (((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 139623220830535681L) != 0) {
				{
				setState(650);
				parameterList();
				}
			}

			setState(653);
			match(RPAREN);
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(654);
				match(COLON);
				setState(655);
				typeAnnotation();
				}
			}

			setState(658);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode CONSTRUCTOR() { return getToken(AngularParser.CONSTRUCTOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(CONSTRUCTOR);
			setState(661);
			match(LPAREN);
			setState(663);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230883192832L) != 0 || (((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 139623220830535681L) != 0) {
				{
				setState(662);
				parameterList();
				}
			}

			setState(665);
			match(RPAREN);
			setState(666);
			match(LBRACE);
			setState(667);
			constructorBody();
			setState(668);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstructorBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConstructorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConstructorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_constructorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 4433293629980672L) != 0 || (((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 139869511435157505L) != 0) {
				{
				{
				setState(670);
				statement();
				}
				}
				setState(675);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(AngularParser.INTERFACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode EXTENDS() { return getToken(AngularParser.EXTENDS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(676);
				match(EXPORT);
				}
			}

			setState(679);
			match(INTERFACE);
			setState(680);
			match(IDENTIFIER);
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(681);
				match(EXTENDS);
				setState(682);
				match(IDENTIFIER);
				setState(687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(683);
					match(COMMA);
					setState(684);
					match(IDENTIFIER);
					}
					}
					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(692);
			match(LBRACE);
			setState(693);
			interfaceBody();
			setState(694);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfacePropertyContext> interfaceProperty() {
			return getRuleContexts(InterfacePropertyContext.class);
		}
		public InterfacePropertyContext interfaceProperty(int i) {
			return getRuleContext(InterfacePropertyContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(696);
				interfaceProperty();
				}
				}
				setState(701);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfacePropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode QUES() { return getToken(AngularParser.QUES, 0); }
		public InterfacePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfacePropertyContext interfaceProperty() throws RecognitionException {
		InterfacePropertyContext _localctx = new InterfacePropertyContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_interfaceProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(IDENTIFIER);
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUES) {
				{
				setState(703);
				match(QUES);
				}
			}

			setState(706);
			match(COLON);
			setState(707);
			typeAnnotation();
			setState(708);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(AngularParser.ENUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(710);
				match(EXPORT);
				}
			}

			setState(713);
			match(ENUM);
			setState(714);
			match(IDENTIFIER);
			setState(715);
			match(LBRACE);
			setState(716);
			enumBody();
			setState(717);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumBodyContext extends ParserRuleContext {
		public List<EnumPropertyContext> enumProperty() {
			return getRuleContexts(EnumPropertyContext.class);
		}
		public EnumPropertyContext enumProperty(int i) {
			return getRuleContext(EnumPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_enumBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			enumProperty();
			setState(724);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(720);
					match(COMMA);
					setState(721);
					enumProperty();
					}
					} 
				}
				setState(726);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(727);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumPropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EnumPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEnumProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEnumProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEnumProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumPropertyContext enumProperty() throws RecognitionException {
		EnumPropertyContext _localctx = new EnumPropertyContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_enumProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(IDENTIFIER);
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(731);
				match(ASSIGN);
				setState(732);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IterationStContext extends StatementContext {
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public IterationStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIterationSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIterationSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIterationSt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalStContext extends StatementContext {
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public ConditionalStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConditionalSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConditionalSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConditionalSt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallStContext extends StatementContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCallSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCallSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCallSt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ExpressionStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionSt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStContext extends StatementContext {
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public PrintStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrintSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrintSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrintSt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStContext extends StatementContext {
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public ThrowStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterThrowSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitThrowSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThrowSt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BootstrapCallStContext extends StatementContext {
		public BootstrapCallContext bootstrapCall() {
			return getRuleContext(BootstrapCallContext.class,0);
		}
		public BootstrapCallStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBootstrapCallSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBootstrapCallSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBootstrapCallSt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignmentSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignmentSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignmentSt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ReturnStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnSt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_statement);
		try {
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				_localctx = new AssignmentStContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				assignment();
				}
				break;
			case 2:
				_localctx = new PrintStContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
				printStatement();
				}
				break;
			case 3:
				_localctx = new ReturnStContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(737);
				returnStatement();
				}
				break;
			case 4:
				_localctx = new ThrowStContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(738);
				throwStatement();
				}
				break;
			case 5:
				_localctx = new ConditionalStContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(739);
				conditionalStatement();
				}
				break;
			case 6:
				_localctx = new IterationStContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(740);
				iterationStatement();
				}
				break;
			case 7:
				_localctx = new BootstrapCallStContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(741);
				bootstrapCall();
				}
				break;
			case 8:
				_localctx = new FunctionCallStContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(742);
				functionCall();
				}
				break;
			case 9:
				_localctx = new ExpressionStContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(743);
				expression(0);
				setState(745);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(744);
					match(SEMI);
					}
					break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public MemberAccessContext memberAccess() {
			return getRuleContext(MemberAccessContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			memberAccess();
			setState(750);
			match(ASSIGN);
			setState(751);
			initialization();
			setState(752);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode CONSOLE() { return getToken(AngularParser.CONSOLE, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode LOG() { return getToken(AngularParser.LOG, 0); }
		public TerminalNode ERROR() { return getToken(AngularParser.ERROR, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_printStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			match(CONSOLE);
			setState(755);
			match(DOT);
			setState(756);
			_la = _input.LA(1);
			if ( !(_la==LOG || _la==ERROR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(757);
			match(LPAREN);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230883192832L) != 0 || (((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 139623220830535681L) != 0) {
				{
				setState(758);
				parameterList();
				}
			}

			setState(761);
			match(RPAREN);
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(762);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(RETURN);
			setState(766);
			expression(0);
			setState(767);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(AngularParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(THROW);
			setState(770);
			expression(0);
			setState(771);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_conditionalStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			ifStatement();
			setState(777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(774);
					elseIfStatement();
					}
					} 
				}
				setState(779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(780);
				elseStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementBodyContext statementBody() {
			return getRuleContext(StatementBodyContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			match(IF);
			setState(784);
			match(LPAREN);
			setState(785);
			expression(0);
			setState(786);
			match(RPAREN);
			setState(787);
			statementBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(AngularParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementBodyContext statementBody() {
			return getRuleContext(StatementBodyContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			match(ELSE);
			setState(790);
			match(IF);
			setState(791);
			match(LPAREN);
			setState(792);
			expression(0);
			setState(793);
			match(RPAREN);
			setState(794);
			statementBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(AngularParser.ELSE, 0); }
		public StatementBodyContext statementBody() {
			return getRuleContext(StatementBodyContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(ELSE);
			setState(797);
			statementBody();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementBodyContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBodyContext statementBody() throws RecognitionException {
		StatementBodyContext _localctx = new StatementBodyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_statementBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(799);
				statement();
				}
				break;
			case 2:
				{
				setState(800);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			match(IDENTIFIER);
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(804);
				genericType();
				}
			}

			setState(807);
			match(LPAREN);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230883192832L) != 0 || (((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 139623220830535681L) != 0) {
				{
				setState(808);
				parameterList();
				}
			}

			setState(811);
			match(RPAREN);
			setState(812);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BootstrapCallContext extends ParserRuleContext {
		public BootstrapSpecifierContext bootstrapSpecifier() {
			return getRuleContext(BootstrapSpecifierContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(AngularParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(AngularParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(AngularParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(AngularParser.RPAREN, i);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode CATCH() { return getToken(AngularParser.CATCH, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public BootstrapCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bootstrapCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBootstrapCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBootstrapCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBootstrapCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BootstrapCallContext bootstrapCall() throws RecognitionException {
		BootstrapCallContext _localctx = new BootstrapCallContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_bootstrapCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			bootstrapSpecifier();
			setState(815);
			match(LPAREN);
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230883192832L) != 0 || (((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 139623220830535681L) != 0) {
				{
				setState(816);
				parameterList();
				}
			}

			setState(819);
			match(RPAREN);
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(820);
				match(DOT);
				setState(821);
				match(CATCH);
				setState(822);
				match(LPAREN);
				setState(823);
				arrowFunction();
				setState(824);
				match(RPAREN);
				}
			}

			setState(828);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	 
		public IterationStatementContext() { }
		public void copyFrom(IterationStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInLoopContext extends IterationStatementContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public VarHelperContext varHelper() {
			return getRuleContext(VarHelperContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(AngularParser.IN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementBodyContext statementBody() {
			return getRuleContext(StatementBodyContext.class,0);
		}
		public ForInLoopContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForInLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForInLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForInLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileLoopContext extends IterationStatementContext {
		public TerminalNode DO() { return getToken(AngularParser.DO, 0); }
		public StatementBodyContext statementBody() {
			return getRuleContext(StatementBodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public DoWhileLoopContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDoWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDoWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDoWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForOfLoopContext extends IterationStatementContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public VarHelperContext varHelper() {
			return getRuleContext(VarHelperContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode OF() { return getToken(AngularParser.OF, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementBodyContext statementBody() {
			return getRuleContext(StatementBodyContext.class,0);
		}
		public ForOfLoopContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterForOfLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitForOfLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitForOfLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends IterationStatementContext {
		public TerminalNode WHILE() { return getToken(AngularParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementBodyContext statementBody() {
			return getRuleContext(StatementBodyContext.class,0);
		}
		public WhileLoopContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandardForLoopContext extends IterationStatementContext {
		public TerminalNode FOR() { return getToken(AngularParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(AngularParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(AngularParser.SEMI, i);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public StatementBodyContext statementBody() {
			return getRuleContext(StatementBodyContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StandardForLoopContext(IterationStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandardForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandardForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandardForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_iterationStatement);
		int _la;
		try {
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				_localctx = new StandardForLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(830);
				match(FOR);
				setState(831);
				match(LPAREN);
				setState(833);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET || _la==CONST) {
					{
					setState(832);
					variableDeclaration();
					}
				}

				setState(835);
				match(SEMI);
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230883192832L) != 0 || (((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 139623220830535681L) != 0) {
					{
					setState(836);
					expression(0);
					}
				}

				setState(839);
				match(SEMI);
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230883192832L) != 0 || (((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 139623220830535681L) != 0) {
					{
					setState(840);
					expression(0);
					}
				}

				setState(843);
				match(RPAREN);
				setState(844);
				statementBody();
				}
				break;
			case 2:
				_localctx = new ForOfLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				match(FOR);
				setState(846);
				match(LPAREN);
				setState(847);
				varHelper();
				setState(848);
				match(IDENTIFIER);
				setState(849);
				match(OF);
				setState(850);
				match(IDENTIFIER);
				setState(851);
				match(RPAREN);
				setState(852);
				statementBody();
				}
				break;
			case 3:
				_localctx = new ForInLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(854);
				match(FOR);
				setState(855);
				match(LPAREN);
				setState(856);
				varHelper();
				setState(857);
				match(IDENTIFIER);
				setState(858);
				match(IN);
				setState(859);
				match(IDENTIFIER);
				setState(860);
				match(RPAREN);
				setState(861);
				statementBody();
				}
				break;
			case 4:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(863);
				match(WHILE);
				setState(864);
				match(LPAREN);
				setState(865);
				expression(0);
				setState(866);
				match(RPAREN);
				setState(867);
				statementBody();
				}
				break;
			case 5:
				_localctx = new DoWhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(869);
				match(DO);
				setState(870);
				statementBody();
				setState(871);
				match(WHILE);
				setState(872);
				match(LPAREN);
				setState(873);
				expression(0);
				setState(874);
				match(RPAREN);
				setState(875);
				match(SEMI);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			parameter();
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(880);
				match(COMMA);
				setState(881);
				parameter();
				}
				}
				setState(886);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(889);
				decorator();
				}
				}
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0) {
				{
				setState(895);
				accessModifier();
				}
			}

			setState(898);
			match(IDENTIFIER);
			setState(901);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(899);
				match(COLON);
				setState(900);
				typeAnnotation();
				}
				break;
			}
			setState(905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(903);
				match(ASSIGN);
				setState(904);
				initialization();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			match(LBRACK);
			setState(916);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230883192832L) != 0 || (((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 139623220830535681L) != 0) {
				{
				setState(908);
				expression(0);
				setState(913);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(909);
						match(COMMA);
						setState(910);
						expression(0);
						}
						} 
					}
					setState(915);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
				}
				}
			}

			setState(919);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(918);
				match(COMMA);
				}
			}

			setState(921);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectValueContext extends ValueContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjectValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryValueContext extends ValueContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrimaryValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrimaryValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrimaryValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectInstantiationValueContext extends ValueContext {
		public ObjectInstantiationContext objectInstantiation() {
			return getRuleContext(ObjectInstantiationContext.class,0);
		}
		public ObjectInstantiationValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectInstantiationValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectInstantiationValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectInstantiationValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessValueContext extends ValueContext {
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public ArrayAccessValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayAccessValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayAccessValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayAccessValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayValueContext extends ValueContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessValueContext extends ValueContext {
		public MemberAccessContext memberAccess() {
			return getRuleContext(MemberAccessContext.class,0);
		}
		public MemberAccessValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMemberAccessValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMemberAccessValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMemberAccessValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_value);
		try {
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				_localctx = new PrimaryValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(923);
				primary();
				}
				break;
			case 2:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(924);
				array();
				}
				break;
			case 3:
				_localctx = new ArrayAccessValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(925);
				arrayAccess();
				}
				break;
			case 4:
				_localctx = new MemberAccessValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(926);
				memberAccess();
				}
				break;
			case 5:
				_localctx = new ObjectValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(927);
				object();
				}
				break;
			case 6:
				_localctx = new ObjectInstantiationValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(928);
				objectInstantiation();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			match(LBRACE);
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(932);
				attributes();
				}
			}

			setState(935);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAttributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAttributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_attributes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			attribute();
			setState(942);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(938);
					match(COMMA);
					setState(939);
					attribute();
					}
					} 
				}
				setState(944);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			setState(946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(945);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(IDENTIFIER);
			setState(949);
			match(COLON);
			setState(950);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectInstantiationContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(AngularParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ObjectInstantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectInstantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectInstantiationContext objectInstantiation() throws RecognitionException {
		ObjectInstantiationContext _localctx = new ObjectInstantiationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_objectInstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
			match(NEW);
			setState(953);
			match(IDENTIFIER);
			setState(955);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(954);
				genericType();
				}
			}

			setState(957);
			match(LPAREN);
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230883192832L) != 0 || (((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 139623220830535681L) != 0) {
				{
				setState(958);
				parameterList();
				}
			}

			setState(961);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessContext extends ParserRuleContext {
		public MemberAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberAccess; }
	 
		public MemberAccessContext() { }
		public void copyFrom(MemberAccessContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessIdentifierContext extends MemberAccessContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MemberAccessIdentifierContext(MemberAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMemberAccessIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMemberAccessIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMemberAccessIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessThisContext extends MemberAccessContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MemberAccessThisContext(MemberAccessContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMemberAccessThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMemberAccessThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMemberAccessThis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberAccessContext memberAccess() throws RecognitionException {
		MemberAccessContext _localctx = new MemberAccessContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_memberAccess);
		try {
			setState(969);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new MemberAccessIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(963);
				match(IDENTIFIER);
				setState(965);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(964);
					expression(0);
					}
					break;
				}
				}
				break;
			case THIS:
				_localctx = new MemberAccessThisContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(967);
				match(THIS);
				setState(968);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(IDENTIFIER);
			setState(972);
			match(LBRACK);
			setState(973);
			expression(0);
			setState(974);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitializationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
	 
		public PrimaryContext() { }
		public void copyFrom(PrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralPrimaryContext extends PrimaryContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteralPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteralPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteralPrimary(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierPrimaryContext extends PrimaryContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IdentifierPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_primary);
		try {
			setState(980);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case BOOL:
			case NULL:
				_localctx = new LiteralPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(978);
				literal();
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(979);
				match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(AngularParser.BOOL, 0); }
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			_la = _input.LA(1);
			if ( !((((_la - 165)) & ~0x3f) == 0 && ((1L << (_la - 165)) & 15L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ParenthesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MemberAccessExpressionContext extends ExpressionContext {
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MemberAccessExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMemberAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMemberAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMemberAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public AdditiveExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(AngularParser.LT, 0); }
		public TerminalNode GT() { return getToken(AngularParser.GT, 0); }
		public TerminalNode LTE() { return getToken(AngularParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(AngularParser.GTE, 0); }
		public RelationalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUES() { return getToken(AngularParser.QUES, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostIncrementExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(AngularParser.PLUS_PLUS, 0); }
		public PostIncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPostIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPostIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPostIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(AngularParser.AND, 0); }
		public LogicalAndExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreIncrementExpressionContext extends ExpressionContext {
		public TerminalNode PLUS_PLUS() { return getToken(AngularParser.PLUS_PLUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreIncrementExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPreIncrementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPreIncrementExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPreIncrementExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(AngularParser.OR, 0); }
		public LogicalOrExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends ExpressionContext {
		public TerminalNode NOT() { return getToken(AngularParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PreDecreaseExpressionContext extends ExpressionContext {
		public TerminalNode MINUS_MINUS() { return getToken(AngularParser.MINUS_MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreDecreaseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPreDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPreDecreaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPreDecreaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallExpressionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionExpressionContext extends ExpressionContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PostDecreaseExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MINUS_MINUS() { return getToken(AngularParser.MINUS_MINUS, 0); }
		public PostDecreaseExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPostDecreaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPostDecreaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPostDecreaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueExpressionContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParameterExpressionContext extends ExpressionContext {
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public ParameterExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(AngularParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(AngularParser.NEQ, 0); }
		public TerminalNode STRICT_EQ() { return getToken(AngularParser.STRICT_EQ, 0); }
		public TerminalNode STRICT_NEQ() { return getToken(AngularParser.STRICT_NEQ, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public EqualityExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULT() { return getToken(AngularParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(AngularParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(AngularParser.MOD, 0); }
		public MultiplicativeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
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
		int _startState = 142;
		enterRecursionRule(_localctx, 142, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(985);
				functionCall();
				}
				break;
			case 2:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(986);
				functionDeclaration();
				}
				break;
			case 3:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(987);
				match(PLUS_PLUS);
				setState(988);
				expression(14);
				}
				break;
			case 4:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(989);
				match(MINUS_MINUS);
				setState(990);
				expression(13);
				}
				break;
			case 5:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(991);
				match(NOT);
				setState(992);
				expression(12);
				}
				break;
			case 6:
				{
				_localctx = new MemberAccessExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(993);
				match(DOT);
				setState(994);
				expression(11);
				}
				break;
			case 7:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(995);
				match(LPAREN);
				setState(996);
				expression(0);
				setState(997);
				match(RPAREN);
				}
				break;
			case 8:
				{
				_localctx = new ValueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(999);
				value();
				}
				break;
			case 9:
				{
				_localctx = new ParameterExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1000);
				parameterDeclaration();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1033);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1031);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1003);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1004);
						_la = _input.LA(1);
						if ( !((((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 7L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1005);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1006);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1007);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1008);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1009);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1010);
						_la = _input.LA(1);
						if ( !((((_la - 108)) & ~0x3f) == 0 && ((1L << (_la - 108)) & 15L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1011);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1012);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1013);
						_la = _input.LA(1);
						if ( !((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 61L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1014);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1015);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1016);
						match(AND);
						setState(1017);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new LogicalOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1018);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1019);
						match(OR);
						setState(1020);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1021);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1022);
						match(QUES);
						setState(1023);
						expression(0);
						setState(1024);
						match(COLON);
						setState(1025);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new PostIncrementExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1027);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1028);
						match(PLUS_PLUS);
						}
						break;
					case 9:
						{
						_localctx = new PostDecreaseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1029);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1030);
						match(MINUS_MINUS);
						}
						break;
					}
					} 
				}
				setState(1035);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GenericTypeContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(AngularParser.LT, 0); }
		public List<TypeAnnotationContext> typeAnnotation() {
			return getRuleContexts(TypeAnnotationContext.class);
		}
		public TypeAnnotationContext typeAnnotation(int i) {
			return getRuleContext(TypeAnnotationContext.class,i);
		}
		public TerminalNode GT() { return getToken(AngularParser.GT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public GenericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGenericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGenericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericTypeContext genericType() throws RecognitionException {
		GenericTypeContext _localctx = new GenericTypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_genericType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1036);
			match(LT);
			setState(1037);
			typeAnnotation();
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1038);
				match(COMMA);
				setState(1039);
				typeAnnotation();
				}
				}
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1045);
			match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeAnnotationContext extends ParserRuleContext {
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
	 
		public TypeAnnotationContext() { }
		public void copyFrom(TypeAnnotationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeAnnotationContext extends TypeAnnotationContext {
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
		public ArrayTypeAnnotationContext(TypeAnnotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayTypeAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayTypeAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericTypeAnnotationContext extends TypeAnnotationContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public GenericTypeAnnotationContext(TypeAnnotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGenericTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGenericTypeAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGenericTypeAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleTypeAnnotationContext extends TypeAnnotationContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TupleTypeAnnotationContext(TypeAnnotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTupleTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTupleTypeAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTupleTypeAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PipeTypeAnnotationContext extends TypeAnnotationContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NULL() { return getTokens(AngularParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(AngularParser.NULL, i);
		}
		public List<TerminalNode> BIT_OR() { return getTokens(AngularParser.BIT_OR); }
		public TerminalNode BIT_OR(int i) {
			return getToken(AngularParser.BIT_OR, i);
		}
		public PipeTypeAnnotationContext(TypeAnnotationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPipeTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPipeTypeAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPipeTypeAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_typeAnnotation);
		int _la;
		try {
			int _alt;
			setState(1061);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				_localctx = new GenericTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1047);
				match(IDENTIFIER);
				setState(1048);
				genericType();
				}
				break;
			case 2:
				_localctx = new PipeTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1049);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1054);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1050);
						match(BIT_OR);
						setState(1051);
						_la = _input.LA(1);
						if ( !(_la==NULL || _la==IDENTIFIER) ) {
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
					setState(1056);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new ArrayTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1057);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1058);
				match(LBRACK);
				setState(1059);
				match(RBRACK);
				}
				break;
			case 4:
				_localctx = new TupleTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1060);
				array();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(AngularParser.PRIVATE, 0); }
		public TerminalNode PUBLIC() { return getToken(AngularParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(AngularParser.PROTECTED, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1063);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTemplateContext extends ParserRuleContext {
		public TerminalNode HTML_TEMPLATE() { return getToken(AngularParser.HTML_TEMPLATE, 0); }
		public TerminalNode END_HTML() { return getToken(AngularParser.END_HTML, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public HtmlTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtmlTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtmlTemplate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtmlTemplate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTemplateContext htmlTemplate() throws RecognitionException {
		HtmlTemplateContext _localctx = new HtmlTemplateContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_htmlTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			match(HTML_TEMPLATE);
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 173)) & ~0x3f) == 0 && ((1L << (_la - 173)) & 65601L) != 0) {
				{
				{
				setState(1066);
				element();
				}
				}
				setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1072);
			match(END_HTML);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandardTagElContext extends ElementContext {
		public OpenTagContext openTag() {
			return getRuleContext(OpenTagContext.class,0);
		}
		public CloseTagContext closeTag() {
			return getRuleContext(CloseTagContext.class,0);
		}
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public StandardTagElContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandardTagEl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandardTagEl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandardTagEl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagElContext extends ElementContext {
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public SelfClosingTagElContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelfClosingTagEl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelfClosingTagEl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelfClosingTagEl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationElContext extends ElementContext {
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public InterpolationElContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterpolationEl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterpolationEl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterpolationEl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_element);
		try {
			int _alt;
			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				_localctx = new StandardTagElContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1074);
				openTag();
				setState(1078);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1075);
						content();
						}
						} 
					}
					setState(1080);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				}
				setState(1081);
				closeTag();
				}
				break;
			case 2:
				_localctx = new SelfClosingTagElContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1083);
				selfClosingTag();
				}
				break;
			case 3:
				_localctx = new InterpolationElContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1084);
				interpolation();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OpenTagContext extends ParserRuleContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode CLOSE_TAG() { return getToken(AngularParser.CLOSE_TAG, 0); }
		public TerminalNode OPEN_TAG() { return getToken(AngularParser.OPEN_TAG, 0); }
		public List<AttributeHTMLContext> attributeHTML() {
			return getRuleContexts(AttributeHTMLContext.class);
		}
		public AttributeHTMLContext attributeHTML(int i) {
			return getRuleContext(AttributeHTMLContext.class,i);
		}
		public OpenTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOpenTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOpenTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOpenTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenTagContext openTag() throws RecognitionException {
		OpenTagContext _localctx = new OpenTagContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_TAG) {
				{
				setState(1087);
				match(OPEN_TAG);
				}
			}

			setState(1090);
			tagName();
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 181)) & ~0x3f) == 0 && ((1L << (_la - 181)) & 447L) != 0) {
				{
				{
				setState(1091);
				attributeHTML();
				}
				}
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1097);
			match(CLOSE_TAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CloseTagContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG() { return getToken(AngularParser.OPEN_TAG, 0); }
		public TerminalNode SLASH() { return getToken(AngularParser.SLASH, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode CLOSE_TAG() { return getToken(AngularParser.CLOSE_TAG, 0); }
		public CloseTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCloseTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCloseTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCloseTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseTagContext closeTag() throws RecognitionException {
		CloseTagContext _localctx = new CloseTagContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			match(OPEN_TAG);
			setState(1100);
			match(SLASH);
			setState(1101);
			tagName();
			setState(1102);
			match(CLOSE_TAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagContext extends ParserRuleContext {
		public TerminalNode OPEN_TAG() { return getToken(AngularParser.OPEN_TAG, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode SLASH() { return getToken(AngularParser.SLASH, 0); }
		public TerminalNode CLOSE_TAG() { return getToken(AngularParser.CLOSE_TAG, 0); }
		public List<AttributeHTMLContext> attributeHTML() {
			return getRuleContexts(AttributeHTMLContext.class);
		}
		public AttributeHTMLContext attributeHTML(int i) {
			return getRuleContext(AttributeHTMLContext.class,i);
		}
		public SelfClosingTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfClosingTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelfClosingTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelfClosingTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelfClosingTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfClosingTagContext selfClosingTag() throws RecognitionException {
		SelfClosingTagContext _localctx = new SelfClosingTagContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			match(OPEN_TAG);
			setState(1105);
			tagName();
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 181)) & ~0x3f) == 0 && ((1L << (_la - 181)) & 447L) != 0) {
				{
				{
				setState(1106);
				attributeHTML();
				}
				}
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1112);
			match(SLASH);
			setState(1113);
			match(CLOSE_TAG);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContentContext extends ParserRuleContext {
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
	 
		public ContentContext() { }
		public void copyFrom(ContentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlainTextContentContext extends ContentContext {
		public TerminalNode ATTRIBUTE() { return getToken(AngularParser.ATTRIBUTE, 0); }
		public TerminalNode COL() { return getToken(AngularParser.COL, 0); }
		public PlainTextContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPlainTextContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPlainTextContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPlainTextContent(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedElementContentContext extends ContentContext {
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public NestedElementContentContext(ContentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNestedElementContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNestedElementContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNestedElementContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_content);
		int _la;
		try {
			setState(1120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				_localctx = new NestedElementContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1115);
				element();
				}
				break;
			case 2:
				_localctx = new PlainTextContentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1116);
				match(ATTRIBUTE);
				setState(1118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COL) {
					{
					setState(1117);
					match(COL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeHTMLContext extends ParserRuleContext {
		public AttributeHTMLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeHTML; }
	 
		public AttributeHTMLContext() { }
		public void copyFrom(AttributeHTMLContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TwoWayBindingContext extends AttributeHTMLContext {
		public TerminalNode TWOBIND() { return getToken(AngularParser.TWOBIND, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode STRING_HTML() { return getToken(AngularParser.STRING_HTML, 0); }
		public TwoWayBindingContext(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTwoWayBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTwoWayBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTwoWayBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyBindingContext extends AttributeHTMLContext {
		public TerminalNode BINDING() { return getToken(AngularParser.BINDING, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode STRING_HTML() { return getToken(AngularParser.STRING_HTML, 0); }
		public PropertyBindingContext(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventBindingContext extends AttributeHTMLContext {
		public TerminalNode EVENT() { return getToken(AngularParser.EVENT, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode STRING_HTML() { return getToken(AngularParser.STRING_HTML, 0); }
		public EventBindingContext(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEventBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEventBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEventBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TemplateReferenceVariableContext extends AttributeHTMLContext {
		public TerminalNode REFERENCE_VAR() { return getToken(AngularParser.REFERENCE_VAR, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode STRING_HTML() { return getToken(AngularParser.STRING_HTML, 0); }
		public TemplateReferenceVariableContext(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateReferenceVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateReferenceVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateReferenceVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandardAttributeContext extends AttributeHTMLContext {
		public TerminalNode ATTRIBUTE() { return getToken(AngularParser.ATTRIBUTE, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode STRING_HTML() { return getToken(AngularParser.STRING_HTML, 0); }
		public StandardAttributeContext(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandardAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandardAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandardAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeOnlyContext extends AttributeHTMLContext {
		public TerminalNode ATTRIBUTE() { return getToken(AngularParser.ATTRIBUTE, 0); }
		public AttributeOnlyContext(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAttributeOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAttributeOnly(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAttributeOnly(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructuralDirectiveAttrContext extends AttributeHTMLContext {
		public StructuralDirectiveContext structuralDirective() {
			return getRuleContext(StructuralDirectiveContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode STRING_HTML() { return getToken(AngularParser.STRING_HTML, 0); }
		public StructuralDirectiveAttrContext(AttributeHTMLContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStructuralDirectiveAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStructuralDirectiveAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStructuralDirectiveAttr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeHTMLContext attributeHTML() throws RecognitionException {
		AttributeHTMLContext _localctx = new AttributeHTMLContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_attributeHTML);
		int _la;
		try {
			setState(1144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				_localctx = new StandardAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1122);
				match(ATTRIBUTE);
				setState(1123);
				match(EQUALS);
				setState(1124);
				match(STRING_HTML);
				}
				break;
			case 2:
				_localctx = new PropertyBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1125);
				match(BINDING);
				setState(1126);
				match(EQUALS);
				setState(1127);
				match(STRING_HTML);
				}
				break;
			case 3:
				_localctx = new EventBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1128);
				match(EVENT);
				setState(1129);
				match(EQUALS);
				setState(1130);
				match(STRING_HTML);
				}
				break;
			case 4:
				_localctx = new TwoWayBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1131);
				match(TWOBIND);
				setState(1132);
				match(EQUALS);
				setState(1133);
				match(STRING_HTML);
				}
				break;
			case 5:
				_localctx = new StructuralDirectiveAttrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1134);
				structuralDirective();
				setState(1135);
				match(EQUALS);
				setState(1136);
				match(STRING_HTML);
				}
				break;
			case 6:
				_localctx = new TemplateReferenceVariableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1138);
				match(REFERENCE_VAR);
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(1139);
					match(EQUALS);
					setState(1140);
					match(STRING_HTML);
					}
				}

				}
				break;
			case 7:
				_localctx = new AttributeOnlyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1143);
				match(ATTRIBUTE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode INTERPOLATION_START() { return getToken(AngularParser.INTERPOLATION_START, 0); }
		public TerminalNode INTERPOLATION_END() { return getToken(AngularParser.INTERPOLATION_END, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(AngularParser.ATTRIBUTE, 0); }
		public TerminalNode COL() { return getToken(AngularParser.COL, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public List<InterpolationElementContext> interpolationElement() {
			return getRuleContexts(InterpolationElementContext.class);
		}
		public InterpolationElementContext interpolationElement(int i) {
			return getRuleContext(InterpolationElementContext.class,i);
		}
		public List<TerminalNode> P() { return getTokens(AngularParser.P); }
		public TerminalNode P(int i) {
			return getToken(AngularParser.P, i);
		}
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_interpolation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(1146);
				match(ATTRIBUTE);
				setState(1147);
				_la = _input.LA(1);
				if ( !(_la==EQUALS || _la==COL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1150);
			match(INTERPOLATION_START);
			setState(1159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				{
				setState(1151);
				interpolationElement();
				}
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==P) {
					{
					{
					setState(1152);
					match(P);
					setState(1153);
					interpolationElement();
					}
					}
					setState(1158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1161);
			match(INTERPOLATION_END);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationElementContext extends ParserRuleContext {
		public List<TerminalNode> ATTRIBUTE() { return getTokens(AngularParser.ATTRIBUTE); }
		public TerminalNode ATTRIBUTE(int i) {
			return getToken(AngularParser.ATTRIBUTE, i);
		}
		public TerminalNode COL() { return getToken(AngularParser.COL, 0); }
		public TerminalNode STRING_HTML() { return getToken(AngularParser.STRING_HTML, 0); }
		public InterpolationElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolationElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterpolationElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterpolationElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterpolationElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationElementContext interpolationElement() throws RecognitionException {
		InterpolationElementContext _localctx = new InterpolationElementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_interpolationElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			match(ATTRIBUTE);
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COL) {
				{
				setState(1164);
				match(COL);
				setState(1165);
				_la = _input.LA(1);
				if ( !(_la==STRING_HTML || _la==ATTRIBUTE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode ATTRIBUTE() { return getToken(AngularParser.ATTRIBUTE, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			match(ATTRIBUTE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructuralDirectiveContext extends ParserRuleContext {
		public TerminalNode NGFOR() { return getToken(AngularParser.NGFOR, 0); }
		public TerminalNode NGIF() { return getToken(AngularParser.NGIF, 0); }
		public TerminalNode DDIRECTIVE() { return getToken(AngularParser.DDIRECTIVE, 0); }
		public StructuralDirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuralDirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStructuralDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStructuralDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStructuralDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructuralDirectiveContext structuralDirective() throws RecognitionException {
		StructuralDirectiveContext _localctx = new StructuralDirectiveContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_structuralDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			_la = _input.LA(1);
			if ( !((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & 7L) != 0) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class StateManagementDeclarationContext extends ParserRuleContext {
		public StateManagementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateManagementDeclaration; }
	 
		public StateManagementDeclarationContext() { }
		public void copyFrom(StateManagementDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EffectDeclContext extends StateManagementDeclarationContext {
		public EffectDeclarationContext effectDeclaration() {
			return getRuleContext(EffectDeclarationContext.class,0);
		}
		public EffectDeclContext(StateManagementDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEffectDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEffectDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEffectDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ActionDeclContext extends StateManagementDeclarationContext {
		public ActionDeclarationContext actionDeclaration() {
			return getRuleContext(ActionDeclarationContext.class,0);
		}
		public ActionDeclContext(StateManagementDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterActionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitActionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitActionDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StoreDeclContext extends StateManagementDeclarationContext {
		public StoreDeclarationContext storeDeclaration() {
			return getRuleContext(StoreDeclarationContext.class,0);
		}
		public StoreDeclContext(StateManagementDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStoreDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStoreDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStoreDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectorDeclContext extends StateManagementDeclarationContext {
		public SelectorDeclarationContext selectorDeclaration() {
			return getRuleContext(SelectorDeclarationContext.class,0);
		}
		public SelectorDeclContext(StateManagementDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateManagementDeclarationContext stateManagementDeclaration() throws RecognitionException {
		StateManagementDeclarationContext _localctx = new StateManagementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_stateManagementDeclaration);
		try {
			setState(1176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				_localctx = new StoreDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1172);
				storeDeclaration();
				}
				break;
			case 2:
				_localctx = new ActionDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1173);
				actionDeclaration();
				}
				break;
			case 3:
				_localctx = new EffectDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1174);
				effectDeclaration();
				}
				break;
			case 4:
				_localctx = new SelectorDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1175);
				selectorDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StoreDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(AngularParser.INTERFACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public List<StorePropertyContext> storeProperty() {
			return getRuleContexts(StorePropertyContext.class);
		}
		public StorePropertyContext storeProperty(int i) {
			return getRuleContext(StorePropertyContext.class,i);
		}
		public StoreDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStoreDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStoreDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStoreDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoreDeclarationContext storeDeclaration() throws RecognitionException {
		StoreDeclarationContext _localctx = new StoreDeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_storeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(1178);
				match(EXPORT);
				}
			}

			setState(1181);
			match(INTERFACE);
			setState(1182);
			match(IDENTIFIER);
			setState(1183);
			match(LBRACE);
			setState(1187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(1184);
				storeProperty();
				}
				}
				setState(1189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1190);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StorePropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public StorePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storeProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStoreProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStoreProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStoreProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorePropertyContext storeProperty() throws RecognitionException {
		StorePropertyContext _localctx = new StorePropertyContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_storeProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(IDENTIFIER);
			setState(1193);
			match(COLON);
			setState(1194);
			typeAnnotation();
			setState(1195);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActionDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode CREATE_ACTION() { return getToken(AngularParser.CREATE_ACTION, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public TerminalNode COMMA() { return getToken(AngularParser.COMMA, 0); }
		public PropsDeclarationContext propsDeclaration() {
			return getRuleContext(PropsDeclarationContext.class,0);
		}
		public ActionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterActionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitActionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitActionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionDeclarationContext actionDeclaration() throws RecognitionException {
		ActionDeclarationContext _localctx = new ActionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_actionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(1197);
				match(EXPORT);
				}
			}

			setState(1200);
			match(CONST);
			setState(1201);
			match(IDENTIFIER);
			setState(1202);
			match(ASSIGN);
			setState(1203);
			match(CREATE_ACTION);
			setState(1204);
			match(LPAREN);
			setState(1205);
			match(STRING);
			setState(1208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1206);
				match(COMMA);
				setState(1207);
				propsDeclaration();
				}
			}

			setState(1210);
			match(RPAREN);
			setState(1211);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PropsDeclarationContext extends ParserRuleContext {
		public TerminalNode PROPS() { return getToken(AngularParser.PROPS, 0); }
		public TerminalNode LT() { return getToken(AngularParser.LT, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode GT() { return getToken(AngularParser.GT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public PropsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropsDeclarationContext propsDeclaration() throws RecognitionException {
		PropsDeclarationContext _localctx = new PropsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_propsDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1213);
			match(PROPS);
			setState(1214);
			match(LT);
			setState(1215);
			typeAnnotation();
			setState(1216);
			match(GT);
			setState(1217);
			match(LPAREN);
			setState(1218);
			match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitialStateContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public InitialStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInitialState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInitialState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInitialState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialStateContext initialState() throws RecognitionException {
		InitialStateContext _localctx = new InitialStateContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_initialState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActionReferenceContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ActionReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterActionReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitActionReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitActionReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionReferenceContext actionReference() throws RecognitionException {
		ActionReferenceContext _localctx = new ActionReferenceContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_actionReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			match(IDENTIFIER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EffectDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode CREATE_EFFECT() { return getToken(AngularParser.CREATE_EFFECT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public EffectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEffectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEffectDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEffectDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectDeclarationContext effectDeclaration() throws RecognitionException {
		EffectDeclarationContext _localctx = new EffectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_effectDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1224);
			match(IDENTIFIER);
			setState(1225);
			match(ASSIGN);
			setState(1226);
			match(CREATE_EFFECT);
			setState(1227);
			match(LPAREN);
			setState(1228);
			arrowFunction();
			setState(1229);
			match(RPAREN);
			setState(1230);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode CREATE_SELECTOR() { return getToken(AngularParser.CREATE_SELECTOR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public List<SelectorFeatureContext> selectorFeature() {
			return getRuleContexts(SelectorFeatureContext.class);
		}
		public SelectorFeatureContext selectorFeature(int i) {
			return getRuleContext(SelectorFeatureContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public SelectorProjectionContext selectorProjection() {
			return getRuleContext(SelectorProjectionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public SelectorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorDeclarationContext selectorDeclaration() throws RecognitionException {
		SelectorDeclarationContext _localctx = new SelectorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_selectorDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(1232);
				match(EXPORT);
				}
			}

			setState(1235);
			match(CONST);
			setState(1236);
			match(IDENTIFIER);
			setState(1237);
			match(ASSIGN);
			setState(1238);
			match(CREATE_SELECTOR);
			setState(1239);
			match(LPAREN);
			setState(1240);
			selectorFeature();
			setState(1245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1241);
					match(COMMA);
					setState(1242);
					selectorFeature();
					}
					} 
				}
				setState(1247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			setState(1248);
			match(COMMA);
			setState(1249);
			selectorProjection();
			setState(1250);
			match(RPAREN);
			setState(1251);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorFeatureContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public SelectorFeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorFeature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorFeatureContext selectorFeature() throws RecognitionException {
		SelectorFeatureContext _localctx = new SelectorFeatureContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_selectorFeature);
		try {
			setState(1255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1253);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1254);
				arrowFunction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorProjectionContext extends ParserRuleContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public SelectorProjectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorProjection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectorProjection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectorProjection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectorProjection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorProjectionContext selectorProjection() throws RecognitionException {
		SelectorProjectionContext _localctx = new SelectorProjectionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_selectorProjection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1257);
			arrowFunction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoutingDeclarationContext extends ParserRuleContext {
		public RoutingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routingDeclaration; }
	 
		public RoutingDeclarationContext() { }
		public void copyFrom(RoutingDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ResolverDeclContext extends RoutingDeclarationContext {
		public ResolverDeclarationContext resolverDeclaration() {
			return getRuleContext(ResolverDeclarationContext.class,0);
		}
		public ResolverDeclContext(RoutingDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterResolverDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitResolverDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitResolverDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RouteConfigDeclContext extends RoutingDeclarationContext {
		public RouteConfigDeclarationContext routeConfigDeclaration() {
			return getRuleContext(RouteConfigDeclarationContext.class,0);
		}
		public RouteConfigDeclContext(RoutingDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouteConfigDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouteConfigDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouteConfigDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutingDeclarationContext routingDeclaration() throws RecognitionException {
		RoutingDeclarationContext _localctx = new RoutingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_routingDeclaration);
		try {
			setState(1261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
			case EXPORT:
				_localctx = new RouteConfigDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1259);
				routeConfigDeclaration();
				}
				break;
			case INJECTABLE:
				_localctx = new ResolverDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				resolverDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RouteConfigDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AngularParser.CONST, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode ROUTE_CONFIG() { return getToken(AngularParser.ROUTE_CONFIG, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public List<RouteDefinitionContext> routeDefinition() {
			return getRuleContexts(RouteDefinitionContext.class);
		}
		public RouteDefinitionContext routeDefinition(int i) {
			return getRuleContext(RouteDefinitionContext.class,i);
		}
		public RouteConfigDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeConfigDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouteConfigDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouteConfigDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouteConfigDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteConfigDeclarationContext routeConfigDeclaration() throws RecognitionException {
		RouteConfigDeclarationContext _localctx = new RouteConfigDeclarationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_routeConfigDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(1263);
				match(EXPORT);
				}
			}

			setState(1266);
			match(CONST);
			setState(1267);
			match(IDENTIFIER);
			setState(1268);
			match(COLON);
			setState(1269);
			match(ROUTE_CONFIG);
			setState(1270);
			match(ASSIGN);
			setState(1271);
			match(LBRACK);
			setState(1275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACE) {
				{
				{
				setState(1272);
				routeDefinition();
				}
				}
				setState(1277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1278);
			match(RBRACK);
			setState(1279);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RouteDefinitionContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<RoutePropertyContext> routeProperty() {
			return getRuleContexts(RoutePropertyContext.class);
		}
		public RoutePropertyContext routeProperty(int i) {
			return getRuleContext(RoutePropertyContext.class,i);
		}
		public RouteDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouteDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouteDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouteDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteDefinitionContext routeDefinition() throws RecognitionException {
		RouteDefinitionContext _localctx = new RouteDefinitionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_routeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1281);
			match(LBRACE);
			setState(1285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 1279L) != 0 || _la==IDENTIFIER) {
				{
				{
				setState(1282);
				routeProperty();
				}
				}
				setState(1287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1288);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RoutePropertyContext extends ParserRuleContext {
		public RoutePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeProperty; }
	 
		public RoutePropertyContext() { }
		public void copyFrom(RoutePropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ChildrenPropertyContext extends RoutePropertyContext {
		public TerminalNode CHILDREN() { return getToken(AngularParser.CHILDREN, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public List<RouteDefinitionContext> routeDefinition() {
			return getRuleContexts(RouteDefinitionContext.class);
		}
		public RouteDefinitionContext routeDefinition(int i) {
			return getRuleContext(RouteDefinitionContext.class,i);
		}
		public ChildrenPropertyContext(RoutePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterChildrenProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitChildrenProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitChildrenProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LazyLoadPropertyContext extends RoutePropertyContext {
		public TerminalNode LAZY_LOAD() { return getToken(AngularParser.LAZY_LOAD, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public LazyLoadPropertyContext(RoutePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLazyLoadProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLazyLoadProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLazyLoadProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PathPropertyContext extends RoutePropertyContext {
		public TerminalNode PATH() { return getToken(AngularParser.PATH, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public PathPropertyContext(RoutePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPathProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPathProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPathProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentPropertyContext extends RoutePropertyContext {
		public TerminalNode COMPONENT_ROUTE() { return getToken(AngularParser.COMPONENT_ROUTE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public ComponentPropertyContext(RoutePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponentProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponentProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponentProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RedirectToPropertyContext extends RoutePropertyContext {
		public TerminalNode REDIRECT_TO() { return getToken(AngularParser.REDIRECT_TO, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public RedirectToPropertyContext(RoutePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRedirectToProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRedirectToProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRedirectToProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PathMatchPropertyContext extends RoutePropertyContext {
		public TerminalNode PATH_MATCH() { return getToken(AngularParser.PATH_MATCH, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public PathMatchPropertyContext(RoutePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPathMatchProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPathMatchProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPathMatchProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CanDeactivatePropertyContext extends RoutePropertyContext {
		public TerminalNode CAN_DEACTIVATE() { return getToken(AngularParser.CAN_DEACTIVATE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public CanDeactivatePropertyContext(RoutePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCanDeactivateProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCanDeactivateProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCanDeactivateProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutletPropertyContext extends RoutePropertyContext {
		public TerminalNode OUTLET() { return getToken(AngularParser.OUTLET, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public OutletPropertyContext(RoutePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOutletProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOutletProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOutletProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CanActivatePropertyContext extends RoutePropertyContext {
		public TerminalNode CAN_ACTIVATE() { return getToken(AngularParser.CAN_ACTIVATE, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public CanActivatePropertyContext(RoutePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCanActivateProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCanActivateProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCanActivateProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GenericRoutePropertyContext extends RoutePropertyContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GenericRoutePropertyContext(RoutePropertyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGenericRouteProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGenericRouteProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGenericRouteProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutePropertyContext routeProperty() throws RecognitionException {
		RoutePropertyContext _localctx = new RoutePropertyContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_routeProperty);
		int _la;
		try {
			setState(1327);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PATH:
				_localctx = new PathPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1290);
				match(PATH);
				setState(1291);
				match(COLON);
				setState(1292);
				match(STRING);
				}
				break;
			case COMPONENT_ROUTE:
				_localctx = new ComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1293);
				match(COMPONENT_ROUTE);
				setState(1294);
				match(COLON);
				setState(1295);
				match(IDENTIFIER);
				}
				break;
			case REDIRECT_TO:
				_localctx = new RedirectToPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1296);
				match(REDIRECT_TO);
				setState(1297);
				match(COLON);
				setState(1298);
				match(STRING);
				}
				break;
			case PATH_MATCH:
				_localctx = new PathMatchPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1299);
				match(PATH_MATCH);
				setState(1300);
				match(COLON);
				setState(1301);
				match(STRING);
				}
				break;
			case CHILDREN:
				_localctx = new ChildrenPropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1302);
				match(CHILDREN);
				setState(1303);
				match(COLON);
				setState(1304);
				match(LBRACK);
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACE) {
					{
					{
					setState(1305);
					routeDefinition();
					}
					}
					setState(1310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1311);
				match(RBRACK);
				}
				break;
			case LAZY_LOAD:
				_localctx = new LazyLoadPropertyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1312);
				match(LAZY_LOAD);
				setState(1313);
				match(COLON);
				setState(1314);
				arrowFunction();
				}
				break;
			case CAN_ACTIVATE:
				_localctx = new CanActivatePropertyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1315);
				match(CAN_ACTIVATE);
				setState(1316);
				match(COLON);
				setState(1317);
				array();
				}
				break;
			case CAN_DEACTIVATE:
				_localctx = new CanDeactivatePropertyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1318);
				match(CAN_DEACTIVATE);
				setState(1319);
				match(COLON);
				setState(1320);
				array();
				}
				break;
			case OUTLET:
				_localctx = new OutletPropertyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1321);
				match(OUTLET);
				setState(1322);
				match(COLON);
				setState(1323);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				_localctx = new GenericRoutePropertyContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1324);
				match(IDENTIFIER);
				setState(1325);
				match(COLON);
				setState(1326);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GuardInterfaceContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public GuardInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGuardInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGuardInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGuardInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardInterfaceContext guardInterface() throws RecognitionException {
		GuardInterfaceContext _localctx = new GuardInterfaceContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_guardInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1329);
			match(IDENTIFIER);
			setState(1334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1330);
				match(COMMA);
				setState(1331);
				match(IDENTIFIER);
				}
				}
				setState(1336);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GuardBodyContext extends ParserRuleContext {
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
		}
		public GuardBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGuardBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGuardBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGuardBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardBodyContext guardBody() throws RecognitionException {
		GuardBodyContext _localctx = new GuardBodyContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_guardBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0 || _la==AT || _la==IDENTIFIER) {
				{
				setState(1339);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1337);
					methodDeclaration();
					}
					break;
				case 2:
					{
					setState(1338);
					propertyDeclaration();
					}
					break;
				}
				}
				setState(1343);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ResolverDeclarationContext extends ParserRuleContext {
		public TerminalNode INJECTABLE() { return getToken(AngularParser.INJECTABLE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(AngularParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(AngularParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(AngularParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(AngularParser.RBRACE, i);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode CLASS() { return getToken(AngularParser.CLASS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode IMPLEMENTS() { return getToken(AngularParser.IMPLEMENTS, 0); }
		public ResolverBodyContext resolverBody() {
			return getRuleContext(ResolverBodyContext.class,0);
		}
		public TerminalNode EXPORT() { return getToken(AngularParser.EXPORT, 0); }
		public ResolverDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resolverDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterResolverDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitResolverDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitResolverDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResolverDeclarationContext resolverDeclaration() throws RecognitionException {
		ResolverDeclarationContext _localctx = new ResolverDeclarationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_resolverDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1344);
			match(INJECTABLE);
			setState(1345);
			match(LPAREN);
			setState(1347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RBRACE) {
				{
				setState(1346);
				match(RBRACE);
				}
			}

			setState(1349);
			match(LBRACE);
			setState(1350);
			match(RBRACE);
			setState(1351);
			match(RPAREN);
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(1352);
				match(EXPORT);
				}
			}

			setState(1355);
			match(CLASS);
			setState(1356);
			match(IDENTIFIER);
			setState(1357);
			match(IMPLEMENTS);
			setState(1358);
			match(IDENTIFIER);
			setState(1359);
			match(LBRACE);
			setState(1360);
			resolverBody();
			setState(1361);
			match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ResolverBodyContext extends ParserRuleContext {
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<PropertyDeclarationContext> propertyDeclaration() {
			return getRuleContexts(PropertyDeclarationContext.class);
		}
		public PropertyDeclarationContext propertyDeclaration(int i) {
			return getRuleContext(PropertyDeclarationContext.class,i);
		}
		public ResolverBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resolverBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterResolverBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitResolverBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitResolverBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResolverBodyContext resolverBody() throws RecognitionException {
		ResolverBodyContext _localctx = new ResolverBodyContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_resolverBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0 || _la==AT || _la==IDENTIFIER) {
				{
				setState(1365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1363);
					methodDeclaration();
					}
					break;
				case 2:
					{
					setState(1364);
					propertyDeclaration();
					}
					break;
				}
				}
				setState(1369);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObservableExpressionContext extends ParserRuleContext {
		public ObservableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observableExpression; }
	 
		public ObservableExpressionContext() { }
		public void copyFrom(ObservableExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FromExpressionContext extends ObservableExpressionContext {
		public TerminalNode FROM() { return getToken(AngularParser.FROM, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public FromExpressionContext(ObservableExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFromExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFromExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFromExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PipeExpressionContext extends ObservableExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode PIPE_OP() { return getToken(AngularParser.PIPE_OP, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public List<PipeOperatorContext> pipeOperator() {
			return getRuleContexts(PipeOperatorContext.class);
		}
		public PipeOperatorContext pipeOperator(int i) {
			return getRuleContext(PipeOperatorContext.class,i);
		}
		public PipeExpressionContext(ObservableExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPipeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPipeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPipeExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubscribeExpressionContext extends ObservableExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode SUBSCRIBE() { return getToken(AngularParser.SUBSCRIBE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public SubscribeCallbackContext subscribeCallback() {
			return getRuleContext(SubscribeCallbackContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public SubscribeExpressionContext(ObservableExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSubscribeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSubscribeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSubscribeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObservableExpressionContext observableExpression() throws RecognitionException {
		ObservableExpressionContext _localctx = new ObservableExpressionContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_observableExpression);
		int _la;
		try {
			setState(1394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				_localctx = new PipeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1370);
				expression(0);
				setState(1371);
				match(DOT);
				setState(1372);
				match(PIPE_OP);
				setState(1373);
				match(LPAREN);
				setState(1377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & 255L) != 0) {
					{
					{
					setState(1374);
					pipeOperator();
					}
					}
					setState(1379);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1380);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new SubscribeExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1382);
				expression(0);
				setState(1383);
				match(DOT);
				setState(1384);
				match(SUBSCRIBE);
				setState(1385);
				match(LPAREN);
				setState(1386);
				subscribeCallback();
				setState(1387);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new FromExpressionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1389);
				match(FROM);
				setState(1390);
				match(LPAREN);
				setState(1391);
				expression(0);
				setState(1392);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PipeOperatorContext extends ParserRuleContext {
		public PipeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeOperator; }
	 
		public PipeOperatorContext() { }
		public void copyFrom(PipeOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CatchErrorOperatorContext extends PipeOperatorContext {
		public TerminalNode CATCH_ERROR() { return getToken(AngularParser.CATCH_ERROR, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public CatchErrorOperatorContext(PipeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCatchErrorOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCatchErrorOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCatchErrorOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FilterOperatorContext extends PipeOperatorContext {
		public TerminalNode FILTER() { return getToken(AngularParser.FILTER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public FilterOperatorContext(PipeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFilterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFilterOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFilterOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MapOperatorContext extends PipeOperatorContext {
		public TerminalNode MAP() { return getToken(AngularParser.MAP, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public MapOperatorContext(PipeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMapOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMapOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMapOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TakeOperatorContext extends PipeOperatorContext {
		public TerminalNode TAKE() { return getToken(AngularParser.TAKE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode NUMBER() { return getToken(AngularParser.NUMBER, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TakeOperatorContext(PipeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTakeOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTakeOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTakeOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchMapOperatorContext extends PipeOperatorContext {
		public TerminalNode SWITCH_MAP() { return getToken(AngularParser.SWITCH_MAP, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public SwitchMapOperatorContext(PipeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSwitchMapOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSwitchMapOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSwitchMapOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConcatMapOperatorContext extends PipeOperatorContext {
		public TerminalNode CONCAT_MAP() { return getToken(AngularParser.CONCAT_MAP, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ConcatMapOperatorContext(PipeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConcatMapOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConcatMapOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConcatMapOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TapOperatorContext extends PipeOperatorContext {
		public TerminalNode TAP() { return getToken(AngularParser.TAP, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TapOperatorContext(PipeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTapOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTapOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTapOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MergeMapOperatorContext extends PipeOperatorContext {
		public TerminalNode MERGE_MAP() { return getToken(AngularParser.MERGE_MAP, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public MergeMapOperatorContext(PipeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMergeMapOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMergeMapOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMergeMapOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipeOperatorContext pipeOperator() throws RecognitionException {
		PipeOperatorContext _localctx = new PipeOperatorContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_pipeOperator);
		try {
			setState(1435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
				_localctx = new MapOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1396);
				match(MAP);
				setState(1397);
				match(LPAREN);
				setState(1398);
				arrowFunction();
				setState(1399);
				match(RPAREN);
				}
				break;
			case FILTER:
				_localctx = new FilterOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1401);
				match(FILTER);
				setState(1402);
				match(LPAREN);
				setState(1403);
				arrowFunction();
				setState(1404);
				match(RPAREN);
				}
				break;
			case SWITCH_MAP:
				_localctx = new SwitchMapOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1406);
				match(SWITCH_MAP);
				setState(1407);
				match(LPAREN);
				setState(1408);
				arrowFunction();
				setState(1409);
				match(RPAREN);
				}
				break;
			case MERGE_MAP:
				_localctx = new MergeMapOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1411);
				match(MERGE_MAP);
				setState(1412);
				match(LPAREN);
				setState(1413);
				arrowFunction();
				setState(1414);
				match(RPAREN);
				}
				break;
			case CONCAT_MAP:
				_localctx = new ConcatMapOperatorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1416);
				match(CONCAT_MAP);
				setState(1417);
				match(LPAREN);
				setState(1418);
				arrowFunction();
				setState(1419);
				match(RPAREN);
				}
				break;
			case TAP:
				_localctx = new TapOperatorContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1421);
				match(TAP);
				setState(1422);
				match(LPAREN);
				setState(1423);
				arrowFunction();
				setState(1424);
				match(RPAREN);
				}
				break;
			case CATCH_ERROR:
				_localctx = new CatchErrorOperatorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1426);
				match(CATCH_ERROR);
				setState(1427);
				match(LPAREN);
				setState(1428);
				arrowFunction();
				setState(1429);
				match(RPAREN);
				}
				break;
			case TAKE:
				_localctx = new TakeOperatorContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1431);
				match(TAKE);
				setState(1432);
				match(LPAREN);
				setState(1433);
				match(NUMBER);
				setState(1434);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubscribeCallbackContext extends ParserRuleContext {
		public SubscribeCallbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscribeCallback; }
	 
		public SubscribeCallbackContext() { }
		public void copyFrom(SubscribeCallbackContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DetailedSubscribeContext extends SubscribeCallbackContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public SubscribeOptionsContext subscribeOptions() {
			return getRuleContext(SubscribeOptionsContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public DetailedSubscribeContext(SubscribeCallbackContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDetailedSubscribe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDetailedSubscribe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDetailedSubscribe(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSubscribeContext extends SubscribeCallbackContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public SimpleSubscribeContext(SubscribeCallbackContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSimpleSubscribe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSimpleSubscribe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSimpleSubscribe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscribeCallbackContext subscribeCallback() throws RecognitionException {
		SubscribeCallbackContext _localctx = new SubscribeCallbackContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_subscribeCallback);
		try {
			setState(1442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
			case IDENTIFIER:
				_localctx = new SimpleSubscribeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1437);
				arrowFunction();
				}
				break;
			case LBRACE:
				_localctx = new DetailedSubscribeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1438);
				match(LBRACE);
				setState(1439);
				subscribeOptions();
				setState(1440);
				match(RBRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubscribeOptionsContext extends ParserRuleContext {
		public List<SubscribeOptionContext> subscribeOption() {
			return getRuleContexts(SubscribeOptionContext.class);
		}
		public SubscribeOptionContext subscribeOption(int i) {
			return getRuleContext(SubscribeOptionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public SubscribeOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscribeOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSubscribeOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSubscribeOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSubscribeOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscribeOptionsContext subscribeOptions() throws RecognitionException {
		SubscribeOptionsContext _localctx = new SubscribeOptionsContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_subscribeOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			subscribeOption();
			setState(1449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1445);
				match(COMMA);
				setState(1446);
				subscribeOption();
				}
				}
				setState(1451);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubscribeOptionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public SubscribeOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscribeOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSubscribeOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSubscribeOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSubscribeOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubscribeOptionContext subscribeOption() throws RecognitionException {
		SubscribeOptionContext _localctx = new SubscribeOptionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_subscribeOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			match(IDENTIFIER);
			setState(1453);
			match(COLON);
			setState(1454);
			arrowFunction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnhancedExpressionContext extends ParserRuleContext {
		public EnhancedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedExpression; }
	 
		public EnhancedExpressionContext() { }
		public void copyFrom(EnhancedExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BaseExpressionContext extends EnhancedExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BaseExpressionContext(EnhancedExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StateExprContext extends EnhancedExpressionContext {
		public StateExpressionContext stateExpression() {
			return getRuleContext(StateExpressionContext.class,0);
		}
		public StateExprContext(EnhancedExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStateExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStateExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStateExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObservableExprContext extends EnhancedExpressionContext {
		public ObservableExpressionContext observableExpression() {
			return getRuleContext(ObservableExpressionContext.class,0);
		}
		public ObservableExprContext(EnhancedExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObservableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObservableExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObservableExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NavigationExprContext extends EnhancedExpressionContext {
		public NavigationExpressionContext navigationExpression() {
			return getRuleContext(NavigationExpressionContext.class,0);
		}
		public NavigationExprContext(EnhancedExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNavigationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNavigationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNavigationExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedExpressionContext enhancedExpression() throws RecognitionException {
		EnhancedExpressionContext _localctx = new EnhancedExpressionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_enhancedExpression);
		try {
			setState(1460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				_localctx = new BaseExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1456);
				expression(0);
				}
				break;
			case 2:
				_localctx = new ObservableExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1457);
				observableExpression();
				}
				break;
			case 3:
				_localctx = new StateExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1458);
				stateExpression();
				}
				break;
			case 4:
				_localctx = new NavigationExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1459);
				navigationExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StateExpressionContext extends ParserRuleContext {
		public StateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateExpression; }
	 
		public StateExpressionContext() { }
		public void copyFrom(StateExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DispatchExpressionContext extends StateExpressionContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode DISPATCH() { return getToken(AngularParser.DISPATCH, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public DispatchExpressionContext(StateExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDispatchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDispatchExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDispatchExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SelectExpressionContext extends StateExpressionContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public TerminalNode SELECT() { return getToken(AngularParser.SELECT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public SelectExpressionContext(StateExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateExpressionContext stateExpression() throws RecognitionException {
		StateExpressionContext _localctx = new StateExpressionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_stateExpression);
		try {
			setState(1479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				_localctx = new DispatchExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1462);
				match(THIS);
				setState(1463);
				match(DOT);
				setState(1464);
				match(IDENTIFIER);
				setState(1465);
				match(DOT);
				setState(1466);
				match(DISPATCH);
				setState(1467);
				match(LPAREN);
				setState(1468);
				expression(0);
				setState(1469);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new SelectExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1471);
				match(THIS);
				setState(1472);
				match(DOT);
				setState(1473);
				match(IDENTIFIER);
				setState(1474);
				match(DOT);
				setState(1475);
				match(SELECT);
				setState(1476);
				match(LPAREN);
				setState(1477);
				match(IDENTIFIER);
				setState(1478);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NavigationExpressionContext extends ParserRuleContext {
		public NavigationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigationExpression; }
	 
		public NavigationExpressionContext() { }
		public void copyFrom(NavigationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NavigateByUrlExpressionContext extends NavigationExpressionContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode NAVIGATE_BY_URL() { return getToken(AngularParser.NAVIGATE_BY_URL, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public NavigateByUrlExpressionContext(NavigationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNavigateByUrlExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNavigateByUrlExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNavigateByUrlExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NavigateExpressionContext extends NavigationExpressionContext {
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode NAVIGATE() { return getToken(AngularParser.NAVIGATE, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public NavigateExpressionContext(NavigationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNavigateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNavigateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNavigateExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigationExpressionContext navigationExpression() throws RecognitionException {
		NavigationExpressionContext _localctx = new NavigationExpressionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_navigationExpression);
		try {
			setState(1498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
			case 1:
				_localctx = new NavigateExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1481);
				match(THIS);
				setState(1482);
				match(DOT);
				setState(1483);
				match(IDENTIFIER);
				setState(1484);
				match(DOT);
				setState(1485);
				match(NAVIGATE);
				setState(1486);
				match(LPAREN);
				setState(1487);
				array();
				setState(1488);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new NavigateByUrlExpressionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1490);
				match(THIS);
				setState(1491);
				match(DOT);
				setState(1492);
				match(IDENTIFIER);
				setState(1493);
				match(DOT);
				setState(1494);
				match(NAVIGATE_BY_URL);
				setState(1495);
				match(LPAREN);
				setState(1496);
				match(STRING);
				setState(1497);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StateNavigationAttributeContext extends ParserRuleContext {
		public StateNavigationAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateNavigationAttribute; }
	 
		public StateNavigationAttributeContext() { }
		public void copyFrom(StateNavigationAttributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RouterLinkActiveAttributeContext extends StateNavigationAttributeContext {
		public TerminalNode ROUTER_LINK_ACTIVE() { return getToken(AngularParser.ROUTER_LINK_ACTIVE, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode STRING_HTML() { return getToken(AngularParser.STRING_HTML, 0); }
		public RouterLinkActiveAttributeContext(StateNavigationAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouterLinkActiveAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouterLinkActiveAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouterLinkActiveAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RouterLinkBindingContext extends StateNavigationAttributeContext {
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode ROUTER_LINK() { return getToken(AngularParser.ROUTER_LINK, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode STRING_HTML() { return getToken(AngularParser.STRING_HTML, 0); }
		public RouterLinkBindingContext(StateNavigationAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouterLinkBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouterLinkBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouterLinkBinding(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EventBindingAttrContext extends StateNavigationAttributeContext {
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode STRING_HTML() { return getToken(AngularParser.STRING_HTML, 0); }
		public EventBindingAttrContext(StateNavigationAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEventBindingAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEventBindingAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEventBindingAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RouterLinkAttributeContext extends StateNavigationAttributeContext {
		public TerminalNode ROUTER_LINK() { return getToken(AngularParser.ROUTER_LINK, 0); }
		public TerminalNode EQUALS() { return getToken(AngularParser.EQUALS, 0); }
		public TerminalNode STRING_HTML() { return getToken(AngularParser.STRING_HTML, 0); }
		public RouterLinkAttributeContext(StateNavigationAttributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouterLinkAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouterLinkAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouterLinkAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateNavigationAttributeContext stateNavigationAttribute() throws RecognitionException {
		StateNavigationAttributeContext _localctx = new StateNavigationAttributeContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_stateNavigationAttribute);
		try {
			setState(1516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROUTER_LINK:
				_localctx = new RouterLinkAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1500);
				match(ROUTER_LINK);
				setState(1501);
				match(EQUALS);
				setState(1502);
				match(STRING_HTML);
				}
				break;
			case ROUTER_LINK_ACTIVE:
				_localctx = new RouterLinkActiveAttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1503);
				match(ROUTER_LINK_ACTIVE);
				setState(1504);
				match(EQUALS);
				setState(1505);
				match(STRING_HTML);
				}
				break;
			case LBRACK:
				_localctx = new RouterLinkBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1506);
				match(LBRACK);
				setState(1507);
				match(ROUTER_LINK);
				setState(1508);
				match(RBRACK);
				setState(1509);
				match(EQUALS);
				setState(1510);
				match(STRING_HTML);
				}
				break;
			case LPAREN:
				_localctx = new EventBindingAttrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1511);
				match(LPAREN);
				setState(1512);
				match(IDENTIFIER);
				setState(1513);
				match(RPAREN);
				setState(1514);
				match(EQUALS);
				setState(1515);
				match(STRING_HTML);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 71:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00c1\u05ef\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0001\u0000"+
		"\u0005\u0000\u00e6\b\u0000\n\u0000\f\u0000\u00e9\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u00ed\b\u0000\n\u0000\f\u0000\u00f0\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u00fb\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u0106\b\u0005\n\u0005\f\u0005\u0109\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u010f\b\u0005\n"+
		"\u0005\f\u0005\u0112\t\u0005\u0001\u0005\u0003\u0005\u0115\b\u0005\u0003"+
		"\u0005\u0117\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u011d\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u012b\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u0131\b\t\u0001\t\u0001\t\u0003\t\u0135"+
		"\b\t\u0001\t\u0003\t\u0138\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u013f\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u0145\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u014a\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u0153\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0158\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0160\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0164\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0168\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u016d\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0172\b\u000f\n\u000f\f\u000f\u0175\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u017d\b\u0010\u0001\u0010\u0003\u0010\u0180\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u0188\b\u0011\n\u0011\f\u0011\u018b\t\u0011\u0001\u0011\u0003\u0011"+
		"\u018e\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u019f\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01a5\b\u0013"+
		"\u0001\u0013\u0003\u0013\u01a8\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01b0\b\u0014\n\u0014"+
		"\f\u0014\u01b3\t\u0014\u0001\u0014\u0003\u0014\u01b6\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01dc\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u01e2\b\u0016\u0001\u0016\u0003\u0016\u01e5\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01ed"+
		"\b\u0017\n\u0017\f\u0017\u01f0\t\u0017\u0001\u0017\u0003\u0017\u01f3\b"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u01fb\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0201\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0209\b\u001a\u0001\u001a\u0003"+
		"\u001a\u020c\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u0214\b\u001b\n\u001b\f\u001b\u0217\t\u001b"+
		"\u0001\u001b\u0003\u001b\u021a\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0224\b\u001d\u0001\u001d\u0003\u001d\u0227\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u022f"+
		"\b\u001e\n\u001e\f\u001e\u0232\t\u001e\u0001\u001e\u0003\u001e\u0235\b"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0003 \u023c"+
		"\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u0244\b \n \f \u0247"+
		"\t \u0003 \u0249\b \u0001 \u0001 \u0001 \u0001 \u0005 \u024f\b \n \f "+
		"\u0252\t \u0003 \u0254\b \u0001 \u0001 \u0001 \u0001 \u0001!\u0005!\u025b"+
		"\b!\n!\f!\u025e\t!\u0001!\u0003!\u0261\b!\u0001!\u0001!\u0001!\u0001!"+
		"\u0005!\u0267\b!\n!\f!\u026a\t!\u0001\"\u0005\"\u026d\b\"\n\"\f\"\u0270"+
		"\t\"\u0001\"\u0003\"\u0273\b\"\u0001\"\u0001\"\u0003\"\u0277\b\"\u0001"+
		"\"\u0001\"\u0003\"\u027b\b\"\u0001\"\u0001\"\u0003\"\u027f\b\"\u0001\""+
		"\u0001\"\u0001#\u0005#\u0284\b#\n#\f#\u0287\t#\u0001#\u0001#\u0001#\u0003"+
		"#\u028c\b#\u0001#\u0001#\u0001#\u0003#\u0291\b#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0003$\u0298\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0005"+
		"%\u02a0\b%\n%\f%\u02a3\t%\u0001&\u0003&\u02a6\b&\u0001&\u0001&\u0001&"+
		"\u0001&\u0001&\u0001&\u0005&\u02ae\b&\n&\f&\u02b1\t&\u0003&\u02b3\b&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001\'\u0005\'\u02ba\b\'\n\'\f\'\u02bd\t\'\u0001"+
		"(\u0001(\u0003(\u02c1\b(\u0001(\u0001(\u0001(\u0001(\u0001)\u0003)\u02c8"+
		"\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0005"+
		"*\u02d3\b*\n*\f*\u02d6\t*\u0001*\u0003*\u02d9\b*\u0001+\u0001+\u0001+"+
		"\u0003+\u02de\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0003,\u02ea\b,\u0003,\u02ec\b,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u02f8\b.\u0001.\u0001"+
		".\u0003.\u02fc\b.\u0001/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u0001"+
		"0\u00011\u00011\u00051\u0308\b1\n1\f1\u030b\t1\u00011\u00031\u030e\b1"+
		"\u00012\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00014\u00014\u00014\u00015\u00015\u00035\u0322"+
		"\b5\u00016\u00016\u00036\u0326\b6\u00016\u00016\u00036\u032a\b6\u0001"+
		"6\u00016\u00016\u00017\u00017\u00017\u00037\u0332\b7\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00037\u033b\b7\u00017\u00017\u00018\u0001"+
		"8\u00018\u00038\u0342\b8\u00018\u00018\u00038\u0346\b8\u00018\u00018\u0003"+
		"8\u034a\b8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00038\u036e\b8\u00019\u00019\u0001"+
		"9\u00059\u0373\b9\n9\f9\u0376\t9\u0001:\u0001:\u0001;\u0005;\u037b\b;"+
		"\n;\f;\u037e\t;\u0001;\u0003;\u0381\b;\u0001;\u0001;\u0001;\u0003;\u0386"+
		"\b;\u0001;\u0001;\u0003;\u038a\b;\u0001<\u0001<\u0001<\u0001<\u0005<\u0390"+
		"\b<\n<\f<\u0393\t<\u0003<\u0395\b<\u0001<\u0003<\u0398\b<\u0001<\u0001"+
		"<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u03a2\b=\u0001>\u0001"+
		">\u0003>\u03a6\b>\u0001>\u0001>\u0001?\u0001?\u0001?\u0005?\u03ad\b?\n"+
		"?\f?\u03b0\t?\u0001?\u0003?\u03b3\b?\u0001@\u0001@\u0001@\u0001@\u0001"+
		"A\u0001A\u0001A\u0003A\u03bc\bA\u0001A\u0001A\u0003A\u03c0\bA\u0001A\u0001"+
		"A\u0001B\u0001B\u0003B\u03c6\bB\u0001B\u0001B\u0003B\u03ca\bB\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001E\u0001E\u0003E\u03d5\bE\u0001"+
		"F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u03ea"+
		"\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0005G\u0408"+
		"\bG\nG\fG\u040b\tG\u0001H\u0001H\u0001H\u0001H\u0005H\u0411\bH\nH\fH\u0414"+
		"\tH\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0005I\u041d\bI\n"+
		"I\fI\u0420\tI\u0001I\u0001I\u0001I\u0001I\u0003I\u0426\bI\u0001J\u0001"+
		"J\u0001K\u0001K\u0005K\u042c\bK\nK\fK\u042f\tK\u0001K\u0001K\u0001L\u0001"+
		"L\u0005L\u0435\bL\nL\fL\u0438\tL\u0001L\u0001L\u0001L\u0001L\u0003L\u043e"+
		"\bL\u0001M\u0003M\u0441\bM\u0001M\u0001M\u0005M\u0445\bM\nM\fM\u0448\t"+
		"M\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0001N\u0001O\u0001O\u0001"+
		"O\u0005O\u0454\bO\nO\fO\u0457\tO\u0001O\u0001O\u0001O\u0001P\u0001P\u0001"+
		"P\u0003P\u045f\bP\u0003P\u0461\bP\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0003Q\u0476\bQ\u0001Q\u0003Q\u0479\bQ\u0001R\u0001"+
		"R\u0003R\u047d\bR\u0001R\u0001R\u0001R\u0001R\u0005R\u0483\bR\nR\fR\u0486"+
		"\tR\u0003R\u0488\bR\u0001R\u0001R\u0001S\u0001S\u0001S\u0003S\u048f\b"+
		"S\u0001T\u0001T\u0001U\u0001U\u0001V\u0001V\u0001V\u0001V\u0003V\u0499"+
		"\bV\u0001W\u0003W\u049c\bW\u0001W\u0001W\u0001W\u0001W\u0005W\u04a2\b"+
		"W\nW\fW\u04a5\tW\u0001W\u0001W\u0001X\u0001X\u0001X\u0001X\u0001X\u0001"+
		"Y\u0003Y\u04af\bY\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0003Y\u04b9\bY\u0001Y\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001[\u0001[\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0001]\u0001^\u0003^\u04d2\b^\u0001^\u0001^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001^\u0005^\u04dc\b^\n^\f^\u04df\t^\u0001"+
		"^\u0001^\u0001^\u0001^\u0001^\u0001_\u0001_\u0003_\u04e8\b_\u0001`\u0001"+
		"`\u0001a\u0001a\u0003a\u04ee\ba\u0001b\u0003b\u04f1\bb\u0001b\u0001b\u0001"+
		"b\u0001b\u0001b\u0001b\u0001b\u0005b\u04fa\bb\nb\fb\u04fd\tb\u0001b\u0001"+
		"b\u0001b\u0001c\u0001c\u0005c\u0504\bc\nc\fc\u0507\tc\u0001c\u0001c\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0001d\u0005d\u051b\bd\nd\fd\u051e\td\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001d\u0001"+
		"d\u0001d\u0001d\u0001d\u0001d\u0001d\u0003d\u0530\bd\u0001e\u0001e\u0001"+
		"e\u0005e\u0535\be\ne\fe\u0538\te\u0001f\u0001f\u0005f\u053c\bf\nf\ff\u053f"+
		"\tf\u0001g\u0001g\u0001g\u0003g\u0544\bg\u0001g\u0001g\u0001g\u0001g\u0003"+
		"g\u054a\bg\u0001g\u0001g\u0001g\u0001g\u0001g\u0001g\u0001g\u0001g\u0001"+
		"h\u0001h\u0005h\u0556\bh\nh\fh\u0559\th\u0001i\u0001i\u0001i\u0001i\u0001"+
		"i\u0005i\u0560\bi\ni\fi\u0563\ti\u0001i\u0001i\u0001i\u0001i\u0001i\u0001"+
		"i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0003i\u0573"+
		"\bi\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001"+
		"j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001"+
		"j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001"+
		"j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0001j\u0003"+
		"j\u059c\bj\u0001k\u0001k\u0001k\u0001k\u0001k\u0003k\u05a3\bk\u0001l\u0001"+
		"l\u0001l\u0005l\u05a8\bl\nl\fl\u05ab\tl\u0001m\u0001m\u0001m\u0001m\u0001"+
		"n\u0001n\u0001n\u0001n\u0003n\u05b5\bn\u0001o\u0001o\u0001o\u0001o\u0001"+
		"o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001o\u0001"+
		"o\u0001o\u0001o\u0003o\u05c8\bo\u0001p\u0001p\u0001p\u0001p\u0001p\u0001"+
		"p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001"+
		"p\u0001p\u0003p\u05db\bp\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001"+
		"q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0001q\u0003"+
		"q\u05ed\bq\u0001q\u0000\u0001\u008er\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc"+
		"\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4"+
		"\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u0000\r\u0001\u0000\u001a\u001c"+
		"\u0001\u0000\u001d\u001e\u0002\u0000$$&&\u0001\u0000\u00a5\u00a8\u0001"+
		"\u0000xz\u0001\u0000vw\u0001\u0000lo\u0002\u0000ppru\u0001\u0000\u00a8"+
		"\u00a9\u0001\u000013\u0001\u0000\u00b0\u00b1\u0002\u0000\u00b2\u00b2\u00bd"+
		"\u00bd\u0001\u0000\u00b8\u00ba\u066c\u0000\u00e7\u0001\u0000\u0000\u0000"+
		"\u0002\u00f1\u0001\u0000\u0000\u0000\u0004\u00fa\u0001\u0000\u0000\u0000"+
		"\u0006\u00fc\u0001\u0000\u0000\u0000\b\u00fe\u0001\u0000\u0000\u0000\n"+
		"\u0107\u0001\u0000\u0000\u0000\f\u011c\u0001\u0000\u0000\u0000\u000e\u011e"+
		"\u0001\u0000\u0000\u0000\u0010\u012a\u0001\u0000\u0000\u0000\u0012\u012c"+
		"\u0001\u0000\u0000\u0000\u0014\u0139\u0001\u0000\u0000\u0000\u0016\u013e"+
		"\u0001\u0000\u0000\u0000\u0018\u0140\u0001\u0000\u0000\u0000\u001a\u014f"+
		"\u0001\u0000\u0000\u0000\u001c\u0163\u0001\u0000\u0000\u0000\u001e\u016e"+
		"\u0001\u0000\u0000\u0000 \u0178\u0001\u0000\u0000\u0000\"\u0184\u0001"+
		"\u0000\u0000\u0000$\u019e\u0001\u0000\u0000\u0000&\u01a0\u0001\u0000\u0000"+
		"\u0000(\u01ac\u0001\u0000\u0000\u0000*\u01db\u0001\u0000\u0000\u0000,"+
		"\u01dd\u0001\u0000\u0000\u0000.\u01e9\u0001\u0000\u0000\u00000\u01fa\u0001"+
		"\u0000\u0000\u00002\u01fc\u0001\u0000\u0000\u00004\u0204\u0001\u0000\u0000"+
		"\u00006\u0210\u0001\u0000\u0000\u00008\u021b\u0001\u0000\u0000\u0000:"+
		"\u021f\u0001\u0000\u0000\u0000<\u022b\u0001\u0000\u0000\u0000>\u0236\u0001"+
		"\u0000\u0000\u0000@\u023b\u0001\u0000\u0000\u0000B\u025c\u0001\u0000\u0000"+
		"\u0000D\u026e\u0001\u0000\u0000\u0000F\u0285\u0001\u0000\u0000\u0000H"+
		"\u0294\u0001\u0000\u0000\u0000J\u02a1\u0001\u0000\u0000\u0000L\u02a5\u0001"+
		"\u0000\u0000\u0000N\u02bb\u0001\u0000\u0000\u0000P\u02be\u0001\u0000\u0000"+
		"\u0000R\u02c7\u0001\u0000\u0000\u0000T\u02cf\u0001\u0000\u0000\u0000V"+
		"\u02da\u0001\u0000\u0000\u0000X\u02eb\u0001\u0000\u0000\u0000Z\u02ed\u0001"+
		"\u0000\u0000\u0000\\\u02f2\u0001\u0000\u0000\u0000^\u02fd\u0001\u0000"+
		"\u0000\u0000`\u0301\u0001\u0000\u0000\u0000b\u0305\u0001\u0000\u0000\u0000"+
		"d\u030f\u0001\u0000\u0000\u0000f\u0315\u0001\u0000\u0000\u0000h\u031c"+
		"\u0001\u0000\u0000\u0000j\u0321\u0001\u0000\u0000\u0000l\u0323\u0001\u0000"+
		"\u0000\u0000n\u032e\u0001\u0000\u0000\u0000p\u036d\u0001\u0000\u0000\u0000"+
		"r\u036f\u0001\u0000\u0000\u0000t\u0377\u0001\u0000\u0000\u0000v\u037c"+
		"\u0001\u0000\u0000\u0000x\u038b\u0001\u0000\u0000\u0000z\u03a1\u0001\u0000"+
		"\u0000\u0000|\u03a3\u0001\u0000\u0000\u0000~\u03a9\u0001\u0000\u0000\u0000"+
		"\u0080\u03b4\u0001\u0000\u0000\u0000\u0082\u03b8\u0001\u0000\u0000\u0000"+
		"\u0084\u03c9\u0001\u0000\u0000\u0000\u0086\u03cb\u0001\u0000\u0000\u0000"+
		"\u0088\u03d0\u0001\u0000\u0000\u0000\u008a\u03d4\u0001\u0000\u0000\u0000"+
		"\u008c\u03d6\u0001\u0000\u0000\u0000\u008e\u03e9\u0001\u0000\u0000\u0000"+
		"\u0090\u040c\u0001\u0000\u0000\u0000\u0092\u0425\u0001\u0000\u0000\u0000"+
		"\u0094\u0427\u0001\u0000\u0000\u0000\u0096\u0429\u0001\u0000\u0000\u0000"+
		"\u0098\u043d\u0001\u0000\u0000\u0000\u009a\u0440\u0001\u0000\u0000\u0000"+
		"\u009c\u044b\u0001\u0000\u0000\u0000\u009e\u0450\u0001\u0000\u0000\u0000"+
		"\u00a0\u0460\u0001\u0000\u0000\u0000\u00a2\u0478\u0001\u0000\u0000\u0000"+
		"\u00a4\u047c\u0001\u0000\u0000\u0000\u00a6\u048b\u0001\u0000\u0000\u0000"+
		"\u00a8\u0490\u0001\u0000\u0000\u0000\u00aa\u0492\u0001\u0000\u0000\u0000"+
		"\u00ac\u0498\u0001\u0000\u0000\u0000\u00ae\u049b\u0001\u0000\u0000\u0000"+
		"\u00b0\u04a8\u0001\u0000\u0000\u0000\u00b2\u04ae\u0001\u0000\u0000\u0000"+
		"\u00b4\u04bd\u0001\u0000\u0000\u0000\u00b6\u04c4\u0001\u0000\u0000\u0000"+
		"\u00b8\u04c6\u0001\u0000\u0000\u0000\u00ba\u04c8\u0001\u0000\u0000\u0000"+
		"\u00bc\u04d1\u0001\u0000\u0000\u0000\u00be\u04e7\u0001\u0000\u0000\u0000"+
		"\u00c0\u04e9\u0001\u0000\u0000\u0000\u00c2\u04ed\u0001\u0000\u0000\u0000"+
		"\u00c4\u04f0\u0001\u0000\u0000\u0000\u00c6\u0501\u0001\u0000\u0000\u0000"+
		"\u00c8\u052f\u0001\u0000\u0000\u0000\u00ca\u0531\u0001\u0000\u0000\u0000"+
		"\u00cc\u053d\u0001\u0000\u0000\u0000\u00ce\u0540\u0001\u0000\u0000\u0000"+
		"\u00d0\u0557\u0001\u0000\u0000\u0000\u00d2\u0572\u0001\u0000\u0000\u0000"+
		"\u00d4\u059b\u0001\u0000\u0000\u0000\u00d6\u05a2\u0001\u0000\u0000\u0000"+
		"\u00d8\u05a4\u0001\u0000\u0000\u0000\u00da\u05ac\u0001\u0000\u0000\u0000"+
		"\u00dc\u05b4\u0001\u0000\u0000\u0000\u00de\u05c7\u0001\u0000\u0000\u0000"+
		"\u00e0\u05da\u0001\u0000\u0000\u0000\u00e2\u05ec\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e6\u0003\u0002\u0001\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ee\u0001\u0000\u0000\u0000"+
		"\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ed\u0003\u0010\b\u0000\u00eb"+
		"\u00ed\u0003X,\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u0001\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005"+
		"\u0017\u0000\u0000\u00f2\u00f3\u0003\u0004\u0002\u0000\u00f3\u00f4\u0005"+
		"\u0018\u0000\u0000\u00f4\u00f5\u0005\u00a5\u0000\u0000\u00f5\u00f6\u0005"+
		"\u0090\u0000\u0000\u00f6\u0003\u0001\u0000\u0000\u0000\u00f7\u00fb\u0003"+
		"\u0006\u0003\u0000\u00f8\u00fb\u0003\b\u0004\u0000\u00f9\u00fb\u0003\n"+
		"\u0005\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u0005\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0005\u00a9\u0000\u0000\u00fd\u0007\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0005x\u0000\u0000\u00ff\u0100\u0005\u0019\u0000"+
		"\u0000\u0100\u0101\u0005\u00a9\u0000\u0000\u0101\t\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0003\f\u0006\u0000\u0103\u0104\u0005\u0092\u0000\u0000\u0104"+
		"\u0106\u0001\u0000\u0000\u0000\u0105\u0102\u0001\u0000\u0000\u0000\u0106"+
		"\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u010a\u0116\u0005\u009a\u0000\u0000\u010b"+
		"\u0110\u0003\f\u0006\u0000\u010c\u010d\u0005\u0092\u0000\u0000\u010d\u010f"+
		"\u0003\f\u0006\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0112\u0001"+
		"\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001"+
		"\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001"+
		"\u0000\u0000\u0000\u0113\u0115\u0005\u0092\u0000\u0000\u0114\u0113\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0117\u0001"+
		"\u0000\u0000\u0000\u0116\u010b\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0005"+
		"\u009b\u0000\u0000\u0119\u000b\u0001\u0000\u0000\u0000\u011a\u011d\u0005"+
		"\u00a9\u0000\u0000\u011b\u011d\u0003\u000e\u0007\u0000\u011c\u011a\u0001"+
		"\u0000\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d\r\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0007\u0000\u0000\u0000\u011f\u000f\u0001\u0000"+
		"\u0000\u0000\u0120\u012b\u0003 \u0010\u0000\u0121\u012b\u0003&\u0013\u0000"+
		"\u0122\u012b\u00034\u001a\u0000\u0123\u012b\u0003:\u001d\u0000\u0124\u012b"+
		"\u0003,\u0016\u0000\u0125\u012b\u0003L&\u0000\u0126\u012b\u0003@ \u0000"+
		"\u0127\u012b\u0003R)\u0000\u0128\u012b\u0003\u0012\t\u0000\u0129\u012b"+
		"\u0003\u0016\u000b\u0000\u012a\u0120\u0001\u0000\u0000\u0000\u012a\u0121"+
		"\u0001\u0000\u0000\u0000\u012a\u0122\u0001\u0000\u0000\u0000\u012a\u0123"+
		"\u0001\u0000\u0000\u0000\u012a\u0124\u0001\u0000\u0000\u0000\u012a\u0125"+
		"\u0001\u0000\u0000\u0000\u012a\u0126\u0001\u0000\u0000\u0000\u012a\u0127"+
		"\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u0129"+
		"\u0001\u0000\u0000\u0000\u012b\u0011\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0003\u0014\n\u0000\u012d\u0130\u0005\u00a9\u0000\u0000\u012e\u012f\u0005"+
		"\u0091\u0000\u0000\u012f\u0131\u0003\u0092I\u0000\u0130\u012e\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0005p\u0000\u0000\u0133\u0135\u0003\u0088D\u0000"+
		"\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000"+
		"\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0138\u0005\u0090\u0000\u0000"+
		"\u0137\u0136\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000"+
		"\u0138\u0013\u0001\u0000\u0000\u0000\u0139\u013a\u0007\u0001\u0000\u0000"+
		"\u013a\u0015\u0001\u0000\u0000\u0000\u013b\u013f\u0003\u0018\f\u0000\u013c"+
		"\u013f\u0003\u001a\r\u0000\u013d\u013f\u0003\u001c\u000e\u0000\u013e\u013b"+
		"\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013d"+
		"\u0001\u0000\u0000\u0000\u013f\u0017\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u00050\u0000\u0000\u0141\u0142\u0005\u00a9\u0000\u0000\u0142\u0144\u0005"+
		"\u0098\u0000\u0000\u0143\u0145\u0003r9\u0000\u0144\u0143\u0001\u0000\u0000"+
		"\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000"+
		"\u0000\u0146\u0149\u0005\u0099\u0000\u0000\u0147\u0148\u0005\u0091\u0000"+
		"\u0000\u0148\u014a\u0003\u0092I\u0000\u0149\u0147\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0005\u009a\u0000\u0000\u014c\u014d\u0003\u001e\u000f\u0000"+
		"\u014d\u014e\u0005\u009b\u0000\u0000\u014e\u0019\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u00050\u0000\u0000\u0150\u0152\u0005\u0098\u0000\u0000\u0151"+
		"\u0153\u0003r9\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0152\u0153\u0001"+
		"\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0157\u0005"+
		"\u0099\u0000\u0000\u0155\u0156\u0005\u0091\u0000\u0000\u0156\u0158\u0003"+
		"\u0092I\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000"+
		"\u0000\u0000\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0005\u009a"+
		"\u0000\u0000\u015a\u015b\u0003\u001e\u000f\u0000\u015b\u015c\u0005\u009b"+
		"\u0000\u0000\u015c\u001b\u0001\u0000\u0000\u0000\u015d\u015f\u0005\u0098"+
		"\u0000\u0000\u015e\u0160\u0003r9\u0000\u015f\u015e\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000"+
		"\u0161\u0164\u0005\u0099\u0000\u0000\u0162\u0164\u0005\u00a9\u0000\u0000"+
		"\u0163\u015d\u0001\u0000\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000"+
		"\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0166\u0005\u0091\u0000\u0000"+
		"\u0166\u0168\u0003\u0092I\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169"+
		"\u016c\u0005\u008c\u0000\u0000\u016a\u016d\u0003X,\u0000\u016b\u016d\u0003"+
		"\u001e\u000f\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016b\u0001"+
		"\u0000\u0000\u0000\u016d\u001d\u0001\u0000\u0000\u0000\u016e\u0173\u0005"+
		"\u009a\u0000\u0000\u016f\u0172\u0003X,\u0000\u0170\u0172\u0003\u0012\t"+
		"\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0171\u0170\u0001\u0000\u0000"+
		"\u0000\u0172\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0176\u0001\u0000\u0000"+
		"\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0177\u0005\u009b\u0000"+
		"\u0000\u0177\u001f\u0001\u0000\u0000\u0000\u0178\u0179\u0005\u0005\u0000"+
		"\u0000\u0179\u017f\u0005\u0098\u0000\u0000\u017a\u017c\u0005\u009a\u0000"+
		"\u0000\u017b\u017d\u0003\"\u0011\u0000\u017c\u017b\u0001\u0000\u0000\u0000"+
		"\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000"+
		"\u017e\u0180\u0005\u009b\u0000\u0000\u017f\u017a\u0001\u0000\u0000\u0000"+
		"\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\u0005\u0099\u0000\u0000\u0182\u0183\u0003@ \u0000\u0183!"+
		"\u0001\u0000\u0000\u0000\u0184\u0189\u0003$\u0012\u0000\u0185\u0186\u0005"+
		"\u0092\u0000\u0000\u0186\u0188\u0003$\u0012\u0000\u0187\u0185\u0001\u0000"+
		"\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000"+
		"\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018d\u0001\u0000"+
		"\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u018e\u0005\u0092"+
		"\u0000\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000"+
		"\u0000\u0000\u018e#\u0001\u0000\u0000\u0000\u018f\u0190\u0005\u0015\u0000"+
		"\u0000\u0190\u0191\u0005\u0091\u0000\u0000\u0191\u019f\u0003x<\u0000\u0192"+
		"\u0193\u0005\u0013\u0000\u0000\u0193\u0194\u0005\u0091\u0000\u0000\u0194"+
		"\u019f\u0003x<\u0000\u0195\u0196\u0005\u000f\u0000\u0000\u0196\u0197\u0005"+
		"\u0091\u0000\u0000\u0197\u019f\u0003x<\u0000\u0198\u0199\u0005\u0010\u0000"+
		"\u0000\u0199\u019a\u0005\u0091\u0000\u0000\u019a\u019f\u0003x<\u0000\u019b"+
		"\u019c\u0005\u0014\u0000\u0000\u019c\u019d\u0005\u0091\u0000\u0000\u019d"+
		"\u019f\u0003x<\u0000\u019e\u018f\u0001\u0000\u0000\u0000\u019e\u0192\u0001"+
		"\u0000\u0000\u0000\u019e\u0195\u0001\u0000\u0000\u0000\u019e\u0198\u0001"+
		"\u0000\u0000\u0000\u019e\u019b\u0001\u0000\u0000\u0000\u019f%\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a1\u0005\u0006\u0000\u0000\u01a1\u01a7\u0005\u0098"+
		"\u0000\u0000\u01a2\u01a4\u0005\u009a\u0000\u0000\u01a3\u01a5\u0003(\u0014"+
		"\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0005\u009b\u0000"+
		"\u0000\u01a7\u01a2\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005\u0099\u0000"+
		"\u0000\u01aa\u01ab\u0003@ \u0000\u01ab\'\u0001\u0000\u0000\u0000\u01ac"+
		"\u01b1\u0003*\u0015\u0000\u01ad\u01ae\u0005\u0092\u0000\u0000\u01ae\u01b0"+
		"\u0003*\u0015\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001"+
		"\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b5\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001"+
		"\u0000\u0000\u0000\u01b4\u01b6\u0005\u0092\u0000\u0000\u01b5\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6)\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b8\u0005\n\u0000\u0000\u01b8\u01b9\u0005\u0091\u0000"+
		"\u0000\u01b9\u01dc\u0005\u00a5\u0000\u0000\u01ba\u01bb\u0005\u000b\u0000"+
		"\u0000\u01bb\u01bc\u0005\u0091\u0000\u0000\u01bc\u01dc\u0005\u00a5\u0000"+
		"\u0000\u01bd\u01be\u0005\f\u0000\u0000\u01be\u01bf\u0005\u0091\u0000\u0000"+
		"\u01bf\u01dc\u0003\u0096K\u0000\u01c0\u01c1\u0005\r\u0000\u0000\u01c1"+
		"\u01c2\u0005\u0091\u0000\u0000\u01c2\u01dc\u0003x<\u0000\u01c3\u01c4\u0005"+
		"\u000e\u0000\u0000\u01c4\u01c5\u0005\u0091\u0000\u0000\u01c5\u01dc\u0003"+
		"x<\u0000\u01c6\u01c7\u0005\u0016\u0000\u0000\u01c7\u01c8\u0005\u0091\u0000"+
		"\u0000\u01c8\u01dc\u0005\u00a7\u0000\u0000\u01c9\u01ca\u0005\u0011\u0000"+
		"\u0000\u01ca\u01cb\u0005\u0091\u0000\u0000\u01cb\u01dc\u0003x<\u0000\u01cc"+
		"\u01cd\u0005\u0012\u0000\u0000\u01cd\u01ce\u0005\u0091\u0000\u0000\u01ce"+
		"\u01dc\u0003x<\u0000\u01cf\u01d0\u0005\u000f\u0000\u0000\u01d0\u01d1\u0005"+
		"\u0091\u0000\u0000\u01d1\u01dc\u0003x<\u0000\u01d2\u01d3\u0005\u0010\u0000"+
		"\u0000\u01d3\u01d4\u0005\u0091\u0000\u0000\u01d4\u01dc\u0003x<\u0000\u01d5"+
		"\u01d6\u0005\u0014\u0000\u0000\u01d6\u01d7\u0005\u0091\u0000\u0000\u01d7"+
		"\u01dc\u0003x<\u0000\u01d8\u01d9\u0005\u0013\u0000\u0000\u01d9\u01da\u0005"+
		"\u0091\u0000\u0000\u01da\u01dc\u0003x<\u0000\u01db\u01b7\u0001\u0000\u0000"+
		"\u0000\u01db\u01ba\u0001\u0000\u0000\u0000\u01db\u01bd\u0001\u0000\u0000"+
		"\u0000\u01db\u01c0\u0001\u0000\u0000\u0000\u01db\u01c3\u0001\u0000\u0000"+
		"\u0000\u01db\u01c6\u0001\u0000\u0000\u0000\u01db\u01c9\u0001\u0000\u0000"+
		"\u0000\u01db\u01cc\u0001\u0000\u0000\u0000\u01db\u01cf\u0001\u0000\u0000"+
		"\u0000\u01db\u01d2\u0001\u0000\u0000\u0000\u01db\u01d5\u0001\u0000\u0000"+
		"\u0000\u01db\u01d8\u0001\u0000\u0000\u0000\u01dc+\u0001\u0000\u0000\u0000"+
		"\u01dd\u01de\u0005\u0007\u0000\u0000\u01de\u01e4\u0005\u0098\u0000\u0000"+
		"\u01df\u01e1\u0005\u009a\u0000\u0000\u01e0\u01e2\u0003.\u0017\u0000\u01e1"+
		"\u01e0\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e5\u0005\u009b\u0000\u0000\u01e4"+
		"\u01df\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005\u0099\u0000\u0000\u01e7"+
		"\u01e8\u0003@ \u0000\u01e8-\u0001\u0000\u0000\u0000\u01e9\u01ee\u0003"+
		"0\u0018\u0000\u01ea\u01eb\u0005\u0092\u0000\u0000\u01eb\u01ed\u00030\u0018"+
		"\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f2\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f3\u0005\u0092\u0000\u0000\u01f2\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3/\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f5\u0005\n\u0000\u0000\u01f5\u01f6\u0005\u0091\u0000\u0000\u01f6"+
		"\u01fb\u0005\u00a5\u0000\u0000\u01f7\u01f8\u0005\u00a9\u0000\u0000\u01f8"+
		"\u01f9\u0005\u0091\u0000\u0000\u01f9\u01fb\u0003\u008eG\u0000\u01fa\u01f4"+
		"\u0001\u0000\u0000\u0000\u01fa\u01f7\u0001\u0000\u0000\u0000\u01fb1\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fd\u0005\u0095\u0000\u0000\u01fd\u01fe\u0005"+
		"\u00a9\u0000\u0000\u01fe\u0200\u0005\u0098\u0000\u0000\u01ff\u0201\u0003"+
		"r9\u0000\u0200\u01ff\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000"+
		"\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u0203\u0005\u0099\u0000"+
		"\u0000\u02033\u0001\u0000\u0000\u0000\u0204\u0205\u0005\b\u0000\u0000"+
		"\u0205\u020b\u0005\u0098\u0000\u0000\u0206\u0208\u0005\u009a\u0000\u0000"+
		"\u0207\u0209\u00036\u001b\u0000\u0208\u0207\u0001\u0000\u0000\u0000\u0208"+
		"\u0209\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a"+
		"\u020c\u0005\u009b\u0000\u0000\u020b\u0206\u0001\u0000\u0000\u0000\u020b"+
		"\u020c\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d"+
		"\u020e\u0005\u0099\u0000\u0000\u020e\u020f\u0003@ \u0000\u020f5\u0001"+
		"\u0000\u0000\u0000\u0210\u0215\u00038\u001c\u0000\u0211\u0212\u0005\u0092"+
		"\u0000\u0000\u0212\u0214\u00038\u001c\u0000\u0213\u0211\u0001\u0000\u0000"+
		"\u0000\u0214\u0217\u0001\u0000\u0000\u0000\u0215\u0213\u0001\u0000\u0000"+
		"\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0219\u0001\u0000\u0000"+
		"\u0000\u0217\u0215\u0001\u0000\u0000\u0000\u0218\u021a\u0005\u0092\u0000"+
		"\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u0219\u021a\u0001\u0000\u0000"+
		"\u0000\u021a7\u0001\u0000\u0000\u0000\u021b\u021c\u0005\u00a9\u0000\u0000"+
		"\u021c\u021d\u0005\u0091\u0000\u0000\u021d\u021e\u0003\u008eG\u0000\u021e"+
		"9\u0001\u0000\u0000\u0000\u021f\u0220\u0005\t\u0000\u0000\u0220\u0226"+
		"\u0005\u0098\u0000\u0000\u0221\u0223\u0005\u009a\u0000\u0000\u0222\u0224"+
		"\u0003<\u001e\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0223\u0224\u0001"+
		"\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0227\u0005"+
		"\u009b\u0000\u0000\u0226\u0221\u0001\u0000\u0000\u0000\u0226\u0227\u0001"+
		"\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u0229\u0005"+
		"\u0099\u0000\u0000\u0229\u022a\u0003@ \u0000\u022a;\u0001\u0000\u0000"+
		"\u0000\u022b\u0230\u0003>\u001f\u0000\u022c\u022d\u0005\u0092\u0000\u0000"+
		"\u022d\u022f\u0003>\u001f\u0000\u022e\u022c\u0001\u0000\u0000\u0000\u022f"+
		"\u0232\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0230"+
		"\u0231\u0001\u0000\u0000\u0000\u0231\u0234\u0001\u0000\u0000\u0000\u0232"+
		"\u0230\u0001\u0000\u0000\u0000\u0233\u0235\u0005\u0092\u0000\u0000\u0234"+
		"\u0233\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235"+
		"=\u0001\u0000\u0000\u0000\u0236\u0237\u0005\u00a9\u0000\u0000\u0237\u0238"+
		"\u0005\u0091\u0000\u0000\u0238\u0239\u0003\u008eG\u0000\u0239?\u0001\u0000"+
		"\u0000\u0000\u023a\u023c\u0005\'\u0000\u0000\u023b\u023a\u0001\u0000\u0000"+
		"\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023d\u0001\u0000\u0000"+
		"\u0000\u023d\u023e\u0005)\u0000\u0000\u023e\u0248\u0005\u00a9\u0000\u0000"+
		"\u023f\u0240\u0005+\u0000\u0000\u0240\u0245\u0005\u00a9\u0000\u0000\u0241"+
		"\u0242\u0005\u0092\u0000\u0000\u0242\u0244\u0005\u00a9\u0000\u0000\u0243"+
		"\u0241\u0001\u0000\u0000\u0000\u0244\u0247\u0001\u0000\u0000\u0000\u0245"+
		"\u0243\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246"+
		"\u0249\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0248"+
		"\u023f\u0001\u0000\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249"+
		"\u0253\u0001\u0000\u0000\u0000\u024a\u024b\u0005,\u0000\u0000\u024b\u0250"+
		"\u0005\u00a9\u0000\u0000\u024c\u024d\u0005\u0092\u0000\u0000\u024d\u024f"+
		"\u0005\u00a9\u0000\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024f\u0252"+
		"\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0250\u0251"+
		"\u0001\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000\u0000\u0252\u0250"+
		"\u0001\u0000\u0000\u0000\u0253\u024a\u0001\u0000\u0000\u0000\u0253\u0254"+
		"\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0256"+
		"\u0005\u009a\u0000\u0000\u0256\u0257\u0003B!\u0000\u0257\u0258\u0005\u009b"+
		"\u0000\u0000\u0258A\u0001\u0000\u0000\u0000\u0259\u025b\u0003D\"\u0000"+
		"\u025a\u0259\u0001\u0000\u0000\u0000\u025b\u025e\u0001\u0000\u0000\u0000"+
		"\u025c\u025a\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000"+
		"\u025d\u0260\u0001\u0000\u0000\u0000\u025e\u025c\u0001\u0000\u0000\u0000"+
		"\u025f\u0261\u0003H$\u0000\u0260\u025f\u0001\u0000\u0000\u0000\u0260\u0261"+
		"\u0001\u0000\u0000\u0000\u0261\u0268\u0001\u0000\u0000\u0000\u0262\u0267"+
		"\u0003F#\u0000\u0263\u0267\u0003X,\u0000\u0264\u0267\u0003\u0012\t\u0000"+
		"\u0265\u0267\u0003\u0016\u000b\u0000\u0266\u0262\u0001\u0000\u0000\u0000"+
		"\u0266\u0263\u0001\u0000\u0000\u0000\u0266\u0264\u0001\u0000\u0000\u0000"+
		"\u0266\u0265\u0001\u0000\u0000\u0000\u0267\u026a\u0001\u0000\u0000\u0000"+
		"\u0268\u0266\u0001\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000"+
		"\u0269C\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026b"+
		"\u026d\u00032\u0019\u0000\u026c\u026b\u0001\u0000\u0000\u0000\u026d\u0270"+
		"\u0001\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026e\u026f"+
		"\u0001\u0000\u0000\u0000\u026f\u0272\u0001\u0000\u0000\u0000\u0270\u026e"+
		"\u0001\u0000\u0000\u0000\u0271\u0273\u0003\u0094J\u0000\u0272\u0271\u0001"+
		"\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273\u0274\u0001"+
		"\u0000\u0000\u0000\u0274\u027a\u0005\u00a9\u0000\u0000\u0275\u0277\u0005"+
		"\u0094\u0000\u0000\u0276\u0275\u0001\u0000\u0000\u0000\u0276\u0277\u0001"+
		"\u0000\u0000\u0000\u0277\u0278\u0001\u0000\u0000\u0000\u0278\u0279\u0005"+
		"\u0091\u0000\u0000\u0279\u027b\u0003\u0092I\u0000\u027a\u0276\u0001\u0000"+
		"\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u027e\u0001\u0000"+
		"\u0000\u0000\u027c\u027d\u0005p\u0000\u0000\u027d\u027f\u0003\u0088D\u0000"+
		"\u027e\u027c\u0001\u0000\u0000\u0000\u027e\u027f\u0001\u0000\u0000\u0000"+
		"\u027f\u0280\u0001\u0000\u0000\u0000\u0280\u0281\u0005\u0090\u0000\u0000"+
		"\u0281E\u0001\u0000\u0000\u0000\u0282\u0284\u00032\u0019\u0000\u0283\u0282"+
		"\u0001\u0000\u0000\u0000\u0284\u0287\u0001\u0000\u0000\u0000\u0285\u0283"+
		"\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0288"+
		"\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000\u0000\u0288\u0289"+
		"\u0005\u00a9\u0000\u0000\u0289\u028b\u0005\u0098\u0000\u0000\u028a\u028c"+
		"\u0003r9\u0000\u028b\u028a\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000"+
		"\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d\u0290\u0005\u0099"+
		"\u0000\u0000\u028e\u028f\u0005\u0091\u0000\u0000\u028f\u0291\u0003\u0092"+
		"I\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000"+
		"\u0000\u0291\u0292\u0001\u0000\u0000\u0000\u0292\u0293\u0003\u001e\u000f"+
		"\u0000\u0293G\u0001\u0000\u0000\u0000\u0294\u0295\u0005-\u0000\u0000\u0295"+
		"\u0297\u0005\u0098\u0000\u0000\u0296\u0298\u0003r9\u0000\u0297\u0296\u0001"+
		"\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000\u0298\u0299\u0001"+
		"\u0000\u0000\u0000\u0299\u029a\u0005\u0099\u0000\u0000\u029a\u029b\u0005"+
		"\u009a\u0000\u0000\u029b\u029c\u0003J%\u0000\u029c\u029d\u0005\u009b\u0000"+
		"\u0000\u029dI\u0001\u0000\u0000\u0000\u029e\u02a0\u0003X,\u0000\u029f"+
		"\u029e\u0001\u0000\u0000\u0000\u02a0\u02a3\u0001\u0000\u0000\u0000\u02a1"+
		"\u029f\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2"+
		"K\u0001\u0000\u0000\u0000\u02a3\u02a1\u0001\u0000\u0000\u0000\u02a4\u02a6"+
		"\u0005\'\u0000\u0000\u02a5\u02a4\u0001\u0000\u0000\u0000\u02a5\u02a6\u0001"+
		"\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a8\u0005"+
		"(\u0000\u0000\u02a8\u02b2\u0005\u00a9\u0000\u0000\u02a9\u02aa\u0005+\u0000"+
		"\u0000\u02aa\u02af\u0005\u00a9\u0000\u0000\u02ab\u02ac\u0005\u0092\u0000"+
		"\u0000\u02ac\u02ae\u0005\u00a9\u0000\u0000\u02ad\u02ab\u0001\u0000\u0000"+
		"\u0000\u02ae\u02b1\u0001\u0000\u0000\u0000\u02af\u02ad\u0001\u0000\u0000"+
		"\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b2\u02a9\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000"+
		"\u0000\u02b4\u02b5\u0005\u009a\u0000\u0000\u02b5\u02b6\u0003N\'\u0000"+
		"\u02b6\u02b7\u0005\u009b\u0000\u0000\u02b7M\u0001\u0000\u0000\u0000\u02b8"+
		"\u02ba\u0003P(\u0000\u02b9\u02b8\u0001\u0000\u0000\u0000\u02ba\u02bd\u0001"+
		"\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001"+
		"\u0000\u0000\u0000\u02bcO\u0001\u0000\u0000\u0000\u02bd\u02bb\u0001\u0000"+
		"\u0000\u0000\u02be\u02c0\u0005\u00a9\u0000\u0000\u02bf\u02c1\u0005\u0094"+
		"\u0000\u0000\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000"+
		"\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c3\u0005\u0091"+
		"\u0000\u0000\u02c3\u02c4\u0003\u0092I\u0000\u02c4\u02c5\u0005\u0090\u0000"+
		"\u0000\u02c5Q\u0001\u0000\u0000\u0000\u02c6\u02c8\u0005\'\u0000\u0000"+
		"\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000"+
		"\u02c8\u02c9\u0001\u0000\u0000\u0000\u02c9\u02ca\u0005*\u0000\u0000\u02ca"+
		"\u02cb\u0005\u00a9\u0000\u0000\u02cb\u02cc\u0005\u009a\u0000\u0000\u02cc"+
		"\u02cd\u0003T*\u0000\u02cd\u02ce\u0005\u009b\u0000\u0000\u02ceS\u0001"+
		"\u0000\u0000\u0000\u02cf\u02d4\u0003V+\u0000\u02d0\u02d1\u0005\u0092\u0000"+
		"\u0000\u02d1\u02d3\u0003V+\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d3"+
		"\u02d6\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d4"+
		"\u02d5\u0001\u0000\u0000\u0000\u02d5\u02d8\u0001\u0000\u0000\u0000\u02d6"+
		"\u02d4\u0001\u0000\u0000\u0000\u02d7\u02d9\u0005\u0092\u0000\u0000\u02d8"+
		"\u02d7\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d9"+
		"U\u0001\u0000\u0000\u0000\u02da\u02dd\u0005\u00a9\u0000\u0000\u02db\u02dc"+
		"\u0005p\u0000\u0000\u02dc\u02de\u0003\u008eG\u0000\u02dd\u02db\u0001\u0000"+
		"\u0000\u0000\u02dd\u02de\u0001\u0000\u0000\u0000\u02deW\u0001\u0000\u0000"+
		"\u0000\u02df\u02ec\u0003Z-\u0000\u02e0\u02ec\u0003\\.\u0000\u02e1\u02ec"+
		"\u0003^/\u0000\u02e2\u02ec\u0003`0\u0000\u02e3\u02ec\u0003b1\u0000\u02e4"+
		"\u02ec\u0003p8\u0000\u02e5\u02ec\u0003n7\u0000\u02e6\u02ec\u0003l6\u0000"+
		"\u02e7\u02e9\u0003\u008eG\u0000\u02e8\u02ea\u0005\u0090\u0000\u0000\u02e9"+
		"\u02e8\u0001\u0000\u0000\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea"+
		"\u02ec\u0001\u0000\u0000\u0000\u02eb\u02df\u0001\u0000\u0000\u0000\u02eb"+
		"\u02e0\u0001\u0000\u0000\u0000\u02eb\u02e1\u0001\u0000\u0000\u0000\u02eb"+
		"\u02e2\u0001\u0000\u0000\u0000\u02eb\u02e3\u0001\u0000\u0000\u0000\u02eb"+
		"\u02e4\u0001\u0000\u0000\u0000\u02eb\u02e5\u0001\u0000\u0000\u0000\u02eb"+
		"\u02e6\u0001\u0000\u0000\u0000\u02eb\u02e7\u0001\u0000\u0000\u0000\u02ec"+
		"Y\u0001\u0000\u0000\u0000\u02ed\u02ee\u0003\u0084B\u0000\u02ee\u02ef\u0005"+
		"p\u0000\u0000\u02ef\u02f0\u0003\u0088D\u0000\u02f0\u02f1\u0005\u0090\u0000"+
		"\u0000\u02f1[\u0001\u0000\u0000\u0000\u02f2\u02f3\u0005#\u0000\u0000\u02f3"+
		"\u02f4\u0005\u0093\u0000\u0000\u02f4\u02f5\u0007\u0002\u0000\u0000\u02f5"+
		"\u02f7\u0005\u0098\u0000\u0000\u02f6\u02f8\u0003r9\u0000\u02f7\u02f6\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001"+
		"\u0000\u0000\u0000\u02f9\u02fb\u0005\u0099\u0000\u0000\u02fa\u02fc\u0005"+
		"\u0090\u0000\u0000\u02fb\u02fa\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001"+
		"\u0000\u0000\u0000\u02fc]\u0001\u0000\u0000\u0000\u02fd\u02fe\u0005!\u0000"+
		"\u0000\u02fe\u02ff\u0003\u008eG\u0000\u02ff\u0300\u0005\u0090\u0000\u0000"+
		"\u0300_\u0001\u0000\u0000\u0000\u0301\u0302\u0005\"\u0000\u0000\u0302"+
		"\u0303\u0003\u008eG\u0000\u0303\u0304\u0005\u0090\u0000\u0000\u0304a\u0001"+
		"\u0000\u0000\u0000\u0305\u0309\u0003d2\u0000\u0306\u0308\u0003f3\u0000"+
		"\u0307\u0306\u0001\u0000\u0000\u0000\u0308\u030b\u0001\u0000\u0000\u0000"+
		"\u0309\u0307\u0001\u0000\u0000\u0000\u0309\u030a\u0001\u0000\u0000\u0000"+
		"\u030a\u030d\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000"+
		"\u030c\u030e\u0003h4\u0000\u030d\u030c\u0001\u0000\u0000\u0000\u030d\u030e"+
		"\u0001\u0000\u0000\u0000\u030ec\u0001\u0000\u0000\u0000\u030f\u0310\u0005"+
		"\u001f\u0000\u0000\u0310\u0311\u0005\u0098\u0000\u0000\u0311\u0312\u0003"+
		"\u008eG\u0000\u0312\u0313\u0005\u0099\u0000\u0000\u0313\u0314\u0003j5"+
		"\u0000\u0314e\u0001\u0000\u0000\u0000\u0315\u0316\u0005 \u0000\u0000\u0316"+
		"\u0317\u0005\u001f\u0000\u0000\u0317\u0318\u0005\u0098\u0000\u0000\u0318"+
		"\u0319\u0003\u008eG\u0000\u0319\u031a\u0005\u0099\u0000\u0000\u031a\u031b"+
		"\u0003j5\u0000\u031bg\u0001\u0000\u0000\u0000\u031c\u031d\u0005 \u0000"+
		"\u0000\u031d\u031e\u0003j5\u0000\u031ei\u0001\u0000\u0000\u0000\u031f"+
		"\u0322\u0003X,\u0000\u0320\u0322\u0003\u001e\u000f\u0000\u0321\u031f\u0001"+
		"\u0000\u0000\u0000\u0321\u0320\u0001\u0000\u0000\u0000\u0322k\u0001\u0000"+
		"\u0000\u0000\u0323\u0325\u0005\u00a9\u0000\u0000\u0324\u0326\u0003\u0090"+
		"H\u0000\u0325\u0324\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000\u0000"+
		"\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u0329\u0005\u0098\u0000"+
		"\u0000\u0328\u032a\u0003r9\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u0329"+
		"\u032a\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b"+
		"\u032c\u0005\u0099\u0000\u0000\u032c\u032d\u0005\u0090\u0000\u0000\u032d"+
		"m\u0001\u0000\u0000\u0000\u032e\u032f\u0003\u000e\u0007\u0000\u032f\u0331"+
		"\u0005\u0098\u0000\u0000\u0330\u0332\u0003r9\u0000\u0331\u0330\u0001\u0000"+
		"\u0000\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332\u0333\u0001\u0000"+
		"\u0000\u0000\u0333\u033a\u0005\u0099\u0000\u0000\u0334\u0335\u0005\u0093"+
		"\u0000\u0000\u0335\u0336\u0005%\u0000\u0000\u0336\u0337\u0005\u0098\u0000"+
		"\u0000\u0337\u0338\u0003\u001c\u000e\u0000\u0338\u0339\u0005\u0099\u0000"+
		"\u0000\u0339\u033b\u0001\u0000\u0000\u0000\u033a\u0334\u0001\u0000\u0000"+
		"\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033b\u033c\u0001\u0000\u0000"+
		"\u0000\u033c\u033d\u0005\u0090\u0000\u0000\u033do\u0001\u0000\u0000\u0000"+
		"\u033e\u033f\u0005\u009e\u0000\u0000\u033f\u0341\u0005\u0098\u0000\u0000"+
		"\u0340\u0342\u0003\u0012\t\u0000\u0341\u0340\u0001\u0000\u0000\u0000\u0341"+
		"\u0342\u0001\u0000\u0000\u0000\u0342\u0343\u0001\u0000\u0000\u0000\u0343"+
		"\u0345\u0005\u0090\u0000\u0000\u0344\u0346\u0003\u008eG\u0000\u0345\u0344"+
		"\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346\u0347"+
		"\u0001\u0000\u0000\u0000\u0347\u0349\u0005\u0090\u0000\u0000\u0348\u034a"+
		"\u0003\u008eG\u0000\u0349\u0348\u0001\u0000\u0000\u0000\u0349\u034a\u0001"+
		"\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u034c\u0005"+
		"\u0099\u0000\u0000\u034c\u036e\u0003j5\u0000\u034d\u034e\u0005\u009e\u0000"+
		"\u0000\u034e\u034f\u0005\u0098\u0000\u0000\u034f\u0350\u0003\u0014\n\u0000"+
		"\u0350\u0351\u0005\u00a9\u0000\u0000\u0351\u0352\u0005\u00a3\u0000\u0000"+
		"\u0352\u0353\u0005\u00a9\u0000\u0000\u0353\u0354\u0005\u0099\u0000\u0000"+
		"\u0354\u0355\u0003j5\u0000\u0355\u036e\u0001\u0000\u0000\u0000\u0356\u0357"+
		"\u0005\u009e\u0000\u0000\u0357\u0358\u0005\u0098\u0000\u0000\u0358\u0359"+
		"\u0003\u0014\n\u0000\u0359\u035a\u0005\u00a9\u0000\u0000\u035a\u035b\u0005"+
		"\u00a4\u0000\u0000\u035b\u035c\u0005\u00a9\u0000\u0000\u035c\u035d\u0005"+
		"\u0099\u0000\u0000\u035d\u035e\u0003j5\u0000\u035e\u036e\u0001\u0000\u0000"+
		"\u0000\u035f\u0360\u0005\u00a0\u0000\u0000\u0360\u0361\u0005\u0098\u0000"+
		"\u0000\u0361\u0362\u0003\u008eG\u0000\u0362\u0363\u0005\u0099\u0000\u0000"+
		"\u0363\u0364\u0003j5\u0000\u0364\u036e\u0001\u0000\u0000\u0000\u0365\u0366"+
		"\u0005\u009f\u0000\u0000\u0366\u0367\u0003j5\u0000\u0367\u0368\u0005\u00a0"+
		"\u0000\u0000\u0368\u0369\u0005\u0098\u0000\u0000\u0369\u036a\u0003\u008e"+
		"G\u0000\u036a\u036b\u0005\u0099\u0000\u0000\u036b\u036c\u0005\u0090\u0000"+
		"\u0000\u036c\u036e\u0001\u0000\u0000\u0000\u036d\u033e\u0001\u0000\u0000"+
		"\u0000\u036d\u034d\u0001\u0000\u0000\u0000\u036d\u0356\u0001\u0000\u0000"+
		"\u0000\u036d\u035f\u0001\u0000\u0000\u0000\u036d\u0365\u0001\u0000\u0000"+
		"\u0000\u036eq\u0001\u0000\u0000\u0000\u036f\u0374\u0003t:\u0000\u0370"+
		"\u0371\u0005\u0092\u0000\u0000\u0371\u0373\u0003t:\u0000\u0372\u0370\u0001"+
		"\u0000\u0000\u0000\u0373\u0376\u0001\u0000\u0000\u0000\u0374\u0372\u0001"+
		"\u0000\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000\u0375s\u0001\u0000"+
		"\u0000\u0000\u0376\u0374\u0001\u0000\u0000\u0000\u0377\u0378\u0003\u008e"+
		"G\u0000\u0378u\u0001\u0000\u0000\u0000\u0379\u037b\u00032\u0019\u0000"+
		"\u037a\u0379\u0001\u0000\u0000\u0000\u037b\u037e\u0001\u0000\u0000\u0000"+
		"\u037c\u037a\u0001\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000"+
		"\u037d\u0380\u0001\u0000\u0000\u0000\u037e\u037c\u0001\u0000\u0000\u0000"+
		"\u037f\u0381\u0003\u0094J\u0000\u0380\u037f\u0001\u0000\u0000\u0000\u0380"+
		"\u0381\u0001\u0000\u0000\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382"+
		"\u0385\u0005\u00a9\u0000\u0000\u0383\u0384\u0005\u0091\u0000\u0000\u0384"+
		"\u0386\u0003\u0092I\u0000\u0385\u0383\u0001\u0000\u0000\u0000\u0385\u0386"+
		"\u0001\u0000\u0000\u0000\u0386\u0389\u0001\u0000\u0000\u0000\u0387\u0388"+
		"\u0005p\u0000\u0000\u0388\u038a\u0003\u0088D\u0000\u0389\u0387\u0001\u0000"+
		"\u0000\u0000\u0389\u038a\u0001\u0000\u0000\u0000\u038aw\u0001\u0000\u0000"+
		"\u0000\u038b\u0394\u0005\u009c\u0000\u0000\u038c\u0391\u0003\u008eG\u0000"+
		"\u038d\u038e\u0005\u0092\u0000\u0000\u038e\u0390\u0003\u008eG\u0000\u038f"+
		"\u038d\u0001\u0000\u0000\u0000\u0390\u0393\u0001\u0000\u0000\u0000\u0391"+
		"\u038f\u0001\u0000\u0000\u0000\u0391\u0392\u0001\u0000\u0000\u0000\u0392"+
		"\u0395\u0001\u0000\u0000\u0000\u0393\u0391\u0001\u0000\u0000\u0000\u0394"+
		"\u038c\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395"+
		"\u0397\u0001\u0000\u0000\u0000\u0396\u0398\u0005\u0092\u0000\u0000\u0397"+
		"\u0396\u0001\u0000\u0000\u0000\u0397\u0398\u0001\u0000\u0000\u0000\u0398"+
		"\u0399\u0001\u0000\u0000\u0000\u0399\u039a\u0005\u009d\u0000\u0000\u039a"+
		"y\u0001\u0000\u0000\u0000\u039b\u03a2\u0003\u008aE\u0000\u039c\u03a2\u0003"+
		"x<\u0000\u039d\u03a2\u0003\u0086C\u0000\u039e\u03a2\u0003\u0084B\u0000"+
		"\u039f\u03a2\u0003|>\u0000\u03a0\u03a2\u0003\u0082A\u0000\u03a1\u039b"+
		"\u0001\u0000\u0000\u0000\u03a1\u039c\u0001\u0000\u0000\u0000\u03a1\u039d"+
		"\u0001\u0000\u0000\u0000\u03a1\u039e\u0001\u0000\u0000\u0000\u03a1\u039f"+
		"\u0001\u0000\u0000\u0000\u03a1\u03a0\u0001\u0000\u0000\u0000\u03a2{\u0001"+
		"\u0000\u0000\u0000\u03a3\u03a5\u0005\u009a\u0000\u0000\u03a4\u03a6\u0003"+
		"~?\u0000\u03a5\u03a4\u0001\u0000\u0000\u0000\u03a5\u03a6\u0001\u0000\u0000"+
		"\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000\u03a7\u03a8\u0005\u009b\u0000"+
		"\u0000\u03a8}\u0001\u0000\u0000\u0000\u03a9\u03ae\u0003\u0080@\u0000\u03aa"+
		"\u03ab\u0005\u0092\u0000\u0000\u03ab\u03ad\u0003\u0080@\u0000\u03ac\u03aa"+
		"\u0001\u0000\u0000\u0000\u03ad\u03b0\u0001\u0000\u0000\u0000\u03ae\u03ac"+
		"\u0001\u0000\u0000\u0000\u03ae\u03af\u0001\u0000\u0000\u0000\u03af\u03b2"+
		"\u0001\u0000\u0000\u0000\u03b0\u03ae\u0001\u0000\u0000\u0000\u03b1\u03b3"+
		"\u0005\u0092\u0000\u0000\u03b2\u03b1\u0001\u0000\u0000\u0000\u03b2\u03b3"+
		"\u0001\u0000\u0000\u0000\u03b3\u007f\u0001\u0000\u0000\u0000\u03b4\u03b5"+
		"\u0005\u00a9\u0000\u0000\u03b5\u03b6\u0005\u0091\u0000\u0000\u03b6\u03b7"+
		"\u0003\u008eG\u0000\u03b7\u0081\u0001\u0000\u0000\u0000\u03b8\u03b9\u0005"+
		"/\u0000\u0000\u03b9\u03bb\u0005\u00a9\u0000\u0000\u03ba\u03bc\u0003\u0090"+
		"H\u0000\u03bb\u03ba\u0001\u0000\u0000\u0000\u03bb\u03bc\u0001\u0000\u0000"+
		"\u0000\u03bc\u03bd\u0001\u0000\u0000\u0000\u03bd\u03bf\u0005\u0098\u0000"+
		"\u0000\u03be\u03c0\u0003r9\u0000\u03bf\u03be\u0001\u0000\u0000\u0000\u03bf"+
		"\u03c0\u0001\u0000\u0000\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1"+
		"\u03c2\u0005\u0099\u0000\u0000\u03c2\u0083\u0001\u0000\u0000\u0000\u03c3"+
		"\u03c5\u0005\u00a9\u0000\u0000\u03c4\u03c6\u0003\u008eG\u0000\u03c5\u03c4"+
		"\u0001\u0000\u0000\u0000\u03c5\u03c6\u0001\u0000\u0000\u0000\u03c6\u03ca"+
		"\u0001\u0000\u0000\u0000\u03c7\u03c8\u0005.\u0000\u0000\u03c8\u03ca\u0003"+
		"\u008eG\u0000\u03c9\u03c3\u0001\u0000\u0000\u0000\u03c9\u03c7\u0001\u0000"+
		"\u0000\u0000\u03ca\u0085\u0001\u0000\u0000\u0000\u03cb\u03cc\u0005\u00a9"+
		"\u0000\u0000\u03cc\u03cd\u0005\u009c\u0000\u0000\u03cd\u03ce\u0003\u008e"+
		"G\u0000\u03ce\u03cf\u0005\u009d\u0000\u0000\u03cf\u0087\u0001\u0000\u0000"+
		"\u0000\u03d0\u03d1\u0003\u008eG\u0000\u03d1\u0089\u0001\u0000\u0000\u0000"+
		"\u03d2\u03d5\u0003\u008cF\u0000\u03d3\u03d5\u0005\u00a9\u0000\u0000\u03d4"+
		"\u03d2\u0001\u0000\u0000\u0000\u03d4\u03d3\u0001\u0000\u0000\u0000\u03d5"+
		"\u008b\u0001\u0000\u0000\u0000\u03d6\u03d7\u0007\u0003\u0000\u0000\u03d7"+
		"\u008d\u0001\u0000\u0000\u0000\u03d8\u03d9\u0006G\uffff\uffff\u0000\u03d9"+
		"\u03ea\u0003l6\u0000\u03da\u03ea\u0003\u0016\u000b\u0000\u03db\u03dc\u0005"+
		"\u008e\u0000\u0000\u03dc\u03ea\u0003\u008eG\u000e\u03dd\u03de\u0005\u008f"+
		"\u0000\u0000\u03de\u03ea\u0003\u008eG\r\u03df\u03e0\u0005q\u0000\u0000"+
		"\u03e0\u03ea\u0003\u008eG\f\u03e1\u03e2\u0005\u0093\u0000\u0000\u03e2"+
		"\u03ea\u0003\u008eG\u000b\u03e3\u03e4\u0005\u0098\u0000\u0000\u03e4\u03e5"+
		"\u0003\u008eG\u0000\u03e5\u03e6\u0005\u0099\u0000\u0000\u03e6\u03ea\u0001"+
		"\u0000\u0000\u0000\u03e7\u03ea\u0003z=\u0000\u03e8\u03ea\u0003v;\u0000"+
		"\u03e9\u03d8\u0001\u0000\u0000\u0000\u03e9\u03da\u0001\u0000\u0000\u0000"+
		"\u03e9\u03db\u0001\u0000\u0000\u0000\u03e9\u03dd\u0001\u0000\u0000\u0000"+
		"\u03e9\u03df\u0001\u0000\u0000\u0000\u03e9\u03e1\u0001\u0000\u0000\u0000"+
		"\u03e9\u03e3\u0001\u0000\u0000\u0000\u03e9\u03e7\u0001\u0000\u0000\u0000"+
		"\u03e9\u03e8\u0001\u0000\u0000\u0000\u03ea\u0409\u0001\u0000\u0000\u0000"+
		"\u03eb\u03ec\n\n\u0000\u0000\u03ec\u03ed\u0007\u0004\u0000\u0000\u03ed"+
		"\u0408\u0003\u008eG\u000b\u03ee\u03ef\n\t\u0000\u0000\u03ef\u03f0\u0007"+
		"\u0005\u0000\u0000\u03f0\u0408\u0003\u008eG\n\u03f1\u03f2\n\b\u0000\u0000"+
		"\u03f2\u03f3\u0007\u0006\u0000\u0000\u03f3\u0408\u0003\u008eG\t\u03f4"+
		"\u03f5\n\u0007\u0000\u0000\u03f5\u03f6\u0007\u0007\u0000\u0000\u03f6\u0408"+
		"\u0003\u008eG\b\u03f7\u03f8\n\u0006\u0000\u0000\u03f8\u03f9\u0005{\u0000"+
		"\u0000\u03f9\u0408\u0003\u008eG\u0007\u03fa\u03fb\n\u0005\u0000\u0000"+
		"\u03fb\u03fc\u0005|\u0000\u0000\u03fc\u0408\u0003\u008eG\u0006\u03fd\u03fe"+
		"\n\u0004\u0000\u0000\u03fe\u03ff\u0005\u0094\u0000\u0000\u03ff\u0400\u0003"+
		"\u008eG\u0000\u0400\u0401\u0005\u0091\u0000\u0000\u0401\u0402\u0003\u008e"+
		"G\u0005\u0402\u0408\u0001\u0000\u0000\u0000\u0403\u0404\n\u0010\u0000"+
		"\u0000\u0404\u0408\u0005\u008e\u0000\u0000\u0405\u0406\n\u000f\u0000\u0000"+
		"\u0406\u0408\u0005\u008f\u0000\u0000\u0407\u03eb\u0001\u0000\u0000\u0000"+
		"\u0407\u03ee\u0001\u0000\u0000\u0000\u0407\u03f1\u0001\u0000\u0000\u0000"+
		"\u0407\u03f4\u0001\u0000\u0000\u0000\u0407\u03f7\u0001\u0000\u0000\u0000"+
		"\u0407\u03fa\u0001\u0000\u0000\u0000\u0407\u03fd\u0001\u0000\u0000\u0000"+
		"\u0407\u0403\u0001\u0000\u0000\u0000\u0407\u0405\u0001\u0000\u0000\u0000"+
		"\u0408\u040b\u0001\u0000\u0000\u0000\u0409\u0407\u0001\u0000\u0000\u0000"+
		"\u0409\u040a\u0001\u0000\u0000\u0000\u040a\u008f\u0001\u0000\u0000\u0000"+
		"\u040b\u0409\u0001\u0000\u0000\u0000\u040c\u040d\u0005n\u0000\u0000\u040d"+
		"\u0412\u0003\u0092I\u0000\u040e\u040f\u0005\u0092\u0000\u0000\u040f\u0411"+
		"\u0003\u0092I\u0000\u0410\u040e\u0001\u0000\u0000\u0000\u0411\u0414\u0001"+
		"\u0000\u0000\u0000\u0412\u0410\u0001\u0000\u0000\u0000\u0412\u0413\u0001"+
		"\u0000\u0000\u0000\u0413\u0415\u0001\u0000\u0000\u0000\u0414\u0412\u0001"+
		"\u0000\u0000\u0000\u0415\u0416\u0005l\u0000\u0000\u0416\u0091\u0001\u0000"+
		"\u0000\u0000\u0417\u0418\u0005\u00a9\u0000\u0000\u0418\u0426\u0003\u0090"+
		"H\u0000\u0419\u041e\u0007\b\u0000\u0000\u041a\u041b\u0005\u007f\u0000"+
		"\u0000\u041b\u041d\u0007\b\u0000\u0000\u041c\u041a\u0001\u0000\u0000\u0000"+
		"\u041d\u0420\u0001\u0000\u0000\u0000\u041e\u041c\u0001\u0000\u0000\u0000"+
		"\u041e\u041f\u0001\u0000\u0000\u0000\u041f\u0426\u0001\u0000\u0000\u0000"+
		"\u0420\u041e\u0001\u0000\u0000\u0000\u0421\u0422\u0007\b\u0000\u0000\u0422"+
		"\u0423\u0005\u009c\u0000\u0000\u0423\u0426\u0005\u009d\u0000\u0000\u0424"+
		"\u0426\u0003x<\u0000\u0425\u0417\u0001\u0000\u0000\u0000\u0425\u0419\u0001"+
		"\u0000\u0000\u0000\u0425\u0421\u0001\u0000\u0000\u0000\u0425\u0424\u0001"+
		"\u0000\u0000\u0000\u0426\u0093\u0001\u0000\u0000\u0000\u0427\u0428\u0007"+
		"\t\u0000\u0000\u0428\u0095\u0001\u0000\u0000\u0000\u0429\u042d\u0005\u00aa"+
		"\u0000\u0000\u042a\u042c\u0003\u0098L\u0000\u042b\u042a\u0001\u0000\u0000"+
		"\u0000\u042c\u042f\u0001\u0000\u0000\u0000\u042d\u042b\u0001\u0000\u0000"+
		"\u0000\u042d\u042e\u0001\u0000\u0000\u0000\u042e\u0430\u0001\u0000\u0000"+
		"\u0000\u042f\u042d\u0001\u0000\u0000\u0000\u0430\u0431\u0005\u00c1\u0000"+
		"\u0000\u0431\u0097\u0001\u0000\u0000\u0000\u0432\u0436\u0003\u009aM\u0000"+
		"\u0433\u0435\u0003\u00a0P\u0000\u0434\u0433\u0001\u0000\u0000\u0000\u0435"+
		"\u0438\u0001\u0000\u0000\u0000\u0436\u0434\u0001\u0000\u0000\u0000\u0436"+
		"\u0437\u0001\u0000\u0000\u0000\u0437\u0439\u0001\u0000\u0000\u0000\u0438"+
		"\u0436\u0001\u0000\u0000\u0000\u0439\u043a\u0003\u009cN\u0000\u043a\u043e"+
		"\u0001\u0000\u0000\u0000\u043b\u043e\u0003\u009eO\u0000\u043c\u043e\u0003"+
		"\u00a4R\u0000\u043d\u0432\u0001\u0000\u0000\u0000\u043d\u043b\u0001\u0000"+
		"\u0000\u0000\u043d\u043c\u0001\u0000\u0000\u0000\u043e\u0099\u0001\u0000"+
		"\u0000\u0000\u043f\u0441\u0005\u00ad\u0000\u0000\u0440\u043f\u0001\u0000"+
		"\u0000\u0000\u0440\u0441\u0001\u0000\u0000\u0000\u0441\u0442\u0001\u0000"+
		"\u0000\u0000\u0442\u0446\u0003\u00a8T\u0000\u0443\u0445\u0003\u00a2Q\u0000"+
		"\u0444\u0443\u0001\u0000\u0000\u0000\u0445\u0448\u0001\u0000\u0000\u0000"+
		"\u0446\u0444\u0001\u0000\u0000\u0000\u0446\u0447\u0001\u0000\u0000\u0000"+
		"\u0447\u0449\u0001\u0000\u0000\u0000\u0448\u0446\u0001\u0000\u0000\u0000"+
		"\u0449\u044a\u0005\u00ae\u0000\u0000\u044a\u009b\u0001\u0000\u0000\u0000"+
		"\u044b\u044c\u0005\u00ad\u0000\u0000\u044c\u044d\u0005\u00af\u0000\u0000"+
		"\u044d\u044e\u0003\u00a8T\u0000\u044e\u044f\u0005\u00ae\u0000\u0000\u044f"+
		"\u009d\u0001\u0000\u0000\u0000\u0450\u0451\u0005\u00ad\u0000\u0000\u0451"+
		"\u0455\u0003\u00a8T\u0000\u0452\u0454\u0003\u00a2Q\u0000\u0453\u0452\u0001"+
		"\u0000\u0000\u0000\u0454\u0457\u0001\u0000\u0000\u0000\u0455\u0453\u0001"+
		"\u0000\u0000\u0000\u0455\u0456\u0001\u0000\u0000\u0000\u0456\u0458\u0001"+
		"\u0000\u0000\u0000\u0457\u0455\u0001\u0000\u0000\u0000\u0458\u0459\u0005"+
		"\u00af\u0000\u0000\u0459\u045a\u0005\u00ae\u0000\u0000\u045a\u009f\u0001"+
		"\u0000\u0000\u0000\u045b\u0461\u0003\u0098L\u0000\u045c\u045e\u0005\u00bd"+
		"\u0000\u0000\u045d\u045f\u0005\u00b1\u0000\u0000\u045e\u045d\u0001\u0000"+
		"\u0000\u0000\u045e\u045f\u0001\u0000\u0000\u0000\u045f\u0461\u0001\u0000"+
		"\u0000\u0000\u0460\u045b\u0001\u0000\u0000\u0000\u0460\u045c\u0001\u0000"+
		"\u0000\u0000\u0461\u00a1\u0001\u0000\u0000\u0000\u0462\u0463\u0005\u00bd"+
		"\u0000\u0000\u0463\u0464\u0005\u00b0\u0000\u0000\u0464\u0479\u0005\u00b2"+
		"\u0000\u0000\u0465\u0466\u0005\u00b5\u0000\u0000\u0466\u0467\u0005\u00b0"+
		"\u0000\u0000\u0467\u0479\u0005\u00b2\u0000\u0000\u0468\u0469\u0005\u00b6"+
		"\u0000\u0000\u0469\u046a\u0005\u00b0\u0000\u0000\u046a\u0479\u0005\u00b2"+
		"\u0000\u0000\u046b\u046c\u0005\u00b7\u0000\u0000\u046c\u046d\u0005\u00b0"+
		"\u0000\u0000\u046d\u0479\u0005\u00b2\u0000\u0000\u046e\u046f\u0003\u00aa"+
		"U\u0000\u046f\u0470\u0005\u00b0\u0000\u0000\u0470\u0471\u0005\u00b2\u0000"+
		"\u0000\u0471\u0479\u0001\u0000\u0000\u0000\u0472\u0475\u0005\u00bc\u0000"+
		"\u0000\u0473\u0474\u0005\u00b0\u0000\u0000\u0474\u0476\u0005\u00b2\u0000"+
		"\u0000\u0475\u0473\u0001\u0000\u0000\u0000\u0475\u0476\u0001\u0000\u0000"+
		"\u0000\u0476\u0479\u0001\u0000\u0000\u0000\u0477\u0479\u0005\u00bd\u0000"+
		"\u0000\u0478\u0462\u0001\u0000\u0000\u0000\u0478\u0465\u0001\u0000\u0000"+
		"\u0000\u0478\u0468\u0001\u0000\u0000\u0000\u0478\u046b\u0001\u0000\u0000"+
		"\u0000\u0478\u046e\u0001\u0000\u0000\u0000\u0478\u0472\u0001\u0000\u0000"+
		"\u0000\u0478\u0477\u0001\u0000\u0000\u0000\u0479\u00a3\u0001\u0000\u0000"+
		"\u0000\u047a\u047b\u0005\u00bd\u0000\u0000\u047b\u047d\u0007\n\u0000\u0000"+
		"\u047c\u047a\u0001\u0000\u0000\u0000\u047c\u047d\u0001\u0000\u0000\u0000"+
		"\u047d\u047e\u0001\u0000\u0000\u0000\u047e\u0487\u0005\u00b3\u0000\u0000"+
		"\u047f\u0484\u0003\u00a6S\u0000\u0480\u0481\u0005\u00bb\u0000\u0000\u0481"+
		"\u0483\u0003\u00a6S\u0000\u0482\u0480\u0001\u0000\u0000\u0000\u0483\u0486"+
		"\u0001\u0000\u0000\u0000\u0484\u0482\u0001\u0000\u0000\u0000\u0484\u0485"+
		"\u0001\u0000\u0000\u0000\u0485\u0488\u0001\u0000\u0000\u0000\u0486\u0484"+
		"\u0001\u0000\u0000\u0000\u0487\u047f\u0001\u0000\u0000\u0000\u0487\u0488"+
		"\u0001\u0000\u0000\u0000\u0488\u0489\u0001\u0000\u0000\u0000\u0489\u048a"+
		"\u0005\u00b4\u0000\u0000\u048a\u00a5\u0001\u0000\u0000\u0000\u048b\u048e"+
		"\u0005\u00bd\u0000\u0000\u048c\u048d\u0005\u00b1\u0000\u0000\u048d\u048f"+
		"\u0007\u000b\u0000\u0000\u048e\u048c\u0001\u0000\u0000\u0000\u048e\u048f"+
		"\u0001\u0000\u0000\u0000\u048f\u00a7\u0001\u0000\u0000\u0000\u0490\u0491"+
		"\u0005\u00bd\u0000\u0000\u0491\u00a9\u0001\u0000\u0000\u0000\u0492\u0493"+
		"\u0007\f\u0000\u0000\u0493\u00ab\u0001\u0000\u0000\u0000\u0494\u0499\u0003"+
		"\u00aeW\u0000\u0495\u0499\u0003\u00b2Y\u0000\u0496\u0499\u0003\u00ba]"+
		"\u0000\u0497\u0499\u0003\u00bc^\u0000\u0498\u0494\u0001\u0000\u0000\u0000"+
		"\u0498\u0495\u0001\u0000\u0000\u0000\u0498\u0496\u0001\u0000\u0000\u0000"+
		"\u0498\u0497\u0001\u0000\u0000\u0000\u0499\u00ad\u0001\u0000\u0000\u0000"+
		"\u049a\u049c\u0005\'\u0000\u0000\u049b\u049a\u0001\u0000\u0000\u0000\u049b"+
		"\u049c\u0001\u0000\u0000\u0000\u049c\u049d\u0001\u0000\u0000\u0000\u049d"+
		"\u049e\u0005(\u0000\u0000\u049e\u049f\u0005\u00a9\u0000\u0000\u049f\u04a3"+
		"\u0005\u009a\u0000\u0000\u04a0\u04a2\u0003\u00b0X\u0000\u04a1\u04a0\u0001"+
		"\u0000\u0000\u0000\u04a2\u04a5\u0001\u0000\u0000\u0000\u04a3\u04a1\u0001"+
		"\u0000\u0000\u0000\u04a3\u04a4\u0001\u0000\u0000\u0000\u04a4\u04a6\u0001"+
		"\u0000\u0000\u0000\u04a5\u04a3\u0001\u0000\u0000\u0000\u04a6\u04a7\u0005"+
		"\u009b\u0000\u0000\u04a7\u00af\u0001\u0000\u0000\u0000\u04a8\u04a9\u0005"+
		"\u00a9\u0000\u0000\u04a9\u04aa\u0005\u0091\u0000\u0000\u04aa\u04ab\u0003"+
		"\u0092I\u0000\u04ab\u04ac\u0005\u0090\u0000\u0000\u04ac\u00b1\u0001\u0000"+
		"\u0000\u0000\u04ad\u04af\u0005\'\u0000\u0000\u04ae\u04ad\u0001\u0000\u0000"+
		"\u0000\u04ae\u04af\u0001\u0000\u0000\u0000\u04af\u04b0\u0001\u0000\u0000"+
		"\u0000\u04b0\u04b1\u0005\u001e\u0000\u0000\u04b1\u04b2\u0005\u00a9\u0000"+
		"\u0000\u04b2\u04b3\u0005p\u0000\u0000\u04b3\u04b4\u0005;\u0000\u0000\u04b4"+
		"\u04b5\u0005\u0098\u0000\u0000\u04b5\u04b8\u0005\u00a5\u0000\u0000\u04b6"+
		"\u04b7\u0005\u0092\u0000\u0000\u04b7\u04b9\u0003\u00b4Z\u0000\u04b8\u04b6"+
		"\u0001\u0000\u0000\u0000\u04b8\u04b9\u0001\u0000\u0000\u0000\u04b9\u04ba"+
		"\u0001\u0000\u0000\u0000\u04ba\u04bb\u0005\u0099\u0000\u0000\u04bb\u04bc"+
		"\u0005\u0090\u0000\u0000\u04bc\u00b3\u0001\u0000\u0000\u0000\u04bd\u04be"+
		"\u0005?\u0000\u0000\u04be\u04bf\u0005n\u0000\u0000\u04bf\u04c0\u0003\u0092"+
		"I\u0000\u04c0\u04c1\u0005l\u0000\u0000\u04c1\u04c2\u0005\u0098\u0000\u0000"+
		"\u04c2\u04c3\u0005\u0099\u0000\u0000\u04c3\u00b5\u0001\u0000\u0000\u0000"+
		"\u04c4\u04c5\u0005\u00a9\u0000\u0000\u04c5\u00b7\u0001\u0000\u0000\u0000"+
		"\u04c6\u04c7\u0005\u00a9\u0000\u0000\u04c7\u00b9\u0001\u0000\u0000\u0000"+
		"\u04c8\u04c9\u0005\u00a9\u0000\u0000\u04c9\u04ca\u0005p\u0000\u0000\u04ca"+
		"\u04cb\u0005=\u0000\u0000\u04cb\u04cc\u0005\u0098\u0000\u0000\u04cc\u04cd"+
		"\u0003\u001c\u000e\u0000\u04cd\u04ce\u0005\u0099\u0000\u0000\u04ce\u04cf"+
		"\u0005\u0090\u0000\u0000\u04cf\u00bb\u0001\u0000\u0000\u0000\u04d0\u04d2"+
		"\u0005\'\u0000\u0000\u04d1\u04d0\u0001\u0000\u0000\u0000\u04d1\u04d2\u0001"+
		"\u0000\u0000\u0000\u04d2\u04d3\u0001\u0000\u0000\u0000\u04d3\u04d4\u0005"+
		"\u001e\u0000\u0000\u04d4\u04d5\u0005\u00a9\u0000\u0000\u04d5\u04d6\u0005"+
		"p\u0000\u0000\u04d6\u04d7\u0005>\u0000\u0000\u04d7\u04d8\u0005\u0098\u0000"+
		"\u0000\u04d8\u04dd\u0003\u00be_\u0000\u04d9\u04da\u0005\u0092\u0000\u0000"+
		"\u04da\u04dc\u0003\u00be_\u0000\u04db\u04d9\u0001\u0000\u0000\u0000\u04dc"+
		"\u04df\u0001\u0000\u0000\u0000\u04dd\u04db\u0001\u0000\u0000\u0000\u04dd"+
		"\u04de\u0001\u0000\u0000\u0000\u04de\u04e0\u0001\u0000\u0000\u0000\u04df"+
		"\u04dd\u0001\u0000\u0000\u0000\u04e0\u04e1\u0005\u0092\u0000\u0000\u04e1"+
		"\u04e2\u0003\u00c0`\u0000\u04e2\u04e3\u0005\u0099\u0000\u0000\u04e3\u04e4"+
		"\u0005\u0090\u0000\u0000\u04e4\u00bd\u0001\u0000\u0000\u0000\u04e5\u04e8"+
		"\u0005\u00a9\u0000\u0000\u04e6\u04e8\u0003\u001c\u000e\u0000\u04e7\u04e5"+
		"\u0001\u0000\u0000\u0000\u04e7\u04e6\u0001\u0000\u0000\u0000\u04e8\u00bf"+
		"\u0001\u0000\u0000\u0000\u04e9\u04ea\u0003\u001c\u000e\u0000\u04ea\u00c1"+
		"\u0001\u0000\u0000\u0000\u04eb\u04ee\u0003\u00c4b\u0000\u04ec\u04ee\u0003"+
		"\u00ceg\u0000\u04ed\u04eb\u0001\u0000\u0000\u0000\u04ed\u04ec\u0001\u0000"+
		"\u0000\u0000\u04ee\u00c3\u0001\u0000\u0000\u0000\u04ef\u04f1\u0005\'\u0000"+
		"\u0000\u04f0\u04ef\u0001\u0000\u0000\u0000\u04f0\u04f1\u0001\u0000\u0000"+
		"\u0000\u04f1\u04f2\u0001\u0000\u0000\u0000\u04f2\u04f3\u0005\u001e\u0000"+
		"\u0000\u04f3\u04f4\u0005\u00a9\u0000\u0000\u04f4\u04f5\u0005\u0091\u0000"+
		"\u0000\u04f5\u04f6\u0005K\u0000\u0000\u04f6\u04f7\u0005p\u0000\u0000\u04f7"+
		"\u04fb\u0005\u009c\u0000\u0000\u04f8\u04fa\u0003\u00c6c\u0000\u04f9\u04f8"+
		"\u0001\u0000\u0000\u0000\u04fa\u04fd\u0001\u0000\u0000\u0000\u04fb\u04f9"+
		"\u0001\u0000\u0000\u0000\u04fb\u04fc\u0001\u0000\u0000\u0000\u04fc\u04fe"+
		"\u0001\u0000\u0000\u0000\u04fd\u04fb\u0001\u0000\u0000\u0000\u04fe\u04ff"+
		"\u0005\u009d\u0000\u0000\u04ff\u0500\u0005\u0090\u0000\u0000\u0500\u00c5"+
		"\u0001\u0000\u0000\u0000\u0501\u0505\u0005\u009a\u0000\u0000\u0502\u0504"+
		"\u0003\u00c8d\u0000\u0503\u0502\u0001\u0000\u0000\u0000\u0504\u0507\u0001"+
		"\u0000\u0000\u0000\u0505\u0503\u0001\u0000\u0000\u0000\u0505\u0506\u0001"+
		"\u0000\u0000\u0000\u0506\u0508\u0001\u0000\u0000\u0000\u0507\u0505\u0001"+
		"\u0000\u0000\u0000\u0508\u0509\u0005\u009b\u0000\u0000\u0509\u00c7\u0001"+
		"\u0000\u0000\u0000\u050a\u050b\u0005L\u0000\u0000\u050b\u050c\u0005\u0091"+
		"\u0000\u0000\u050c\u0530\u0005\u00a5\u0000\u0000\u050d\u050e\u0005M\u0000"+
		"\u0000\u050e\u050f\u0005\u0091\u0000\u0000\u050f\u0530\u0005\u00a9\u0000"+
		"\u0000\u0510\u0511\u0005N\u0000\u0000\u0511\u0512\u0005\u0091\u0000\u0000"+
		"\u0512\u0530\u0005\u00a5\u0000\u0000\u0513\u0514\u0005O\u0000\u0000\u0514"+
		"\u0515\u0005\u0091\u0000\u0000\u0515\u0530\u0005\u00a5\u0000\u0000\u0516"+
		"\u0517\u0005P\u0000\u0000\u0517\u0518\u0005\u0091\u0000\u0000\u0518\u051c"+
		"\u0005\u009c\u0000\u0000\u0519\u051b\u0003\u00c6c\u0000\u051a\u0519\u0001"+
		"\u0000\u0000\u0000\u051b\u051e\u0001\u0000\u0000\u0000\u051c\u051a\u0001"+
		"\u0000\u0000\u0000\u051c\u051d\u0001\u0000\u0000\u0000\u051d\u051f\u0001"+
		"\u0000\u0000\u0000\u051e\u051c\u0001\u0000\u0000\u0000\u051f\u0530\u0005"+
		"\u009d\u0000\u0000\u0520\u0521\u0005Q\u0000\u0000\u0521\u0522\u0005\u0091"+
		"\u0000\u0000\u0522\u0530\u0003\u001c\u000e\u0000\u0523\u0524\u0005R\u0000"+
		"\u0000\u0524\u0525\u0005\u0091\u0000\u0000\u0525\u0530\u0003x<\u0000\u0526"+
		"\u0527\u0005S\u0000\u0000\u0527\u0528\u0005\u0091\u0000\u0000\u0528\u0530"+
		"\u0003x<\u0000\u0529\u052a\u0005V\u0000\u0000\u052a\u052b\u0005\u0091"+
		"\u0000\u0000\u052b\u0530\u0005\u00a5\u0000\u0000\u052c\u052d\u0005\u00a9"+
		"\u0000\u0000\u052d\u052e\u0005\u0091\u0000\u0000\u052e\u0530\u0003\u008e"+
		"G\u0000\u052f\u050a\u0001\u0000\u0000\u0000\u052f\u050d\u0001\u0000\u0000"+
		"\u0000\u052f\u0510\u0001\u0000\u0000\u0000\u052f\u0513\u0001\u0000\u0000"+
		"\u0000\u052f\u0516\u0001\u0000\u0000\u0000\u052f\u0520\u0001\u0000\u0000"+
		"\u0000\u052f\u0523\u0001\u0000\u0000\u0000\u052f\u0526\u0001\u0000\u0000"+
		"\u0000\u052f\u0529\u0001\u0000\u0000\u0000\u052f\u052c\u0001\u0000\u0000"+
		"\u0000\u0530\u00c9\u0001\u0000\u0000\u0000\u0531\u0536\u0005\u00a9\u0000"+
		"\u0000\u0532\u0533\u0005\u0092\u0000\u0000\u0533\u0535\u0005\u00a9\u0000"+
		"\u0000\u0534\u0532\u0001\u0000\u0000\u0000\u0535\u0538\u0001\u0000\u0000"+
		"\u0000\u0536\u0534\u0001\u0000\u0000\u0000\u0536\u0537\u0001\u0000\u0000"+
		"\u0000\u0537\u00cb\u0001\u0000\u0000\u0000\u0538\u0536\u0001\u0000\u0000"+
		"\u0000\u0539\u053c\u0003F#\u0000\u053a\u053c\u0003D\"\u0000\u053b\u0539"+
		"\u0001\u0000\u0000\u0000\u053b\u053a\u0001\u0000\u0000\u0000\u053c\u053f"+
		"\u0001\u0000\u0000\u0000\u053d\u053b\u0001\u0000\u0000\u0000\u053d\u053e"+
		"\u0001\u0000\u0000\u0000\u053e\u00cd\u0001\u0000\u0000\u0000\u053f\u053d"+
		"\u0001\u0000\u0000\u0000\u0540\u0541\u0005\t\u0000\u0000\u0541\u0543\u0005"+
		"\u0098\u0000\u0000\u0542\u0544\u0005\u009b\u0000\u0000\u0543\u0542\u0001"+
		"\u0000\u0000\u0000\u0543\u0544\u0001\u0000\u0000\u0000\u0544\u0545\u0001"+
		"\u0000\u0000\u0000\u0545\u0546\u0005\u009a\u0000\u0000\u0546\u0547\u0005"+
		"\u009b\u0000\u0000\u0547\u0549\u0005\u0099\u0000\u0000\u0548\u054a\u0005"+
		"\'\u0000\u0000\u0549\u0548\u0001\u0000\u0000\u0000\u0549\u054a\u0001\u0000"+
		"\u0000\u0000\u054a\u054b\u0001\u0000\u0000\u0000\u054b\u054c\u0005)\u0000"+
		"\u0000\u054c\u054d\u0005\u00a9\u0000\u0000\u054d\u054e\u0005,\u0000\u0000"+
		"\u054e\u054f\u0005\u00a9\u0000\u0000\u054f\u0550\u0005\u009a\u0000\u0000"+
		"\u0550\u0551\u0003\u00d0h\u0000\u0551\u0552\u0005\u009b\u0000\u0000\u0552"+
		"\u00cf\u0001\u0000\u0000\u0000\u0553\u0556\u0003F#\u0000\u0554\u0556\u0003"+
		"D\"\u0000\u0555\u0553\u0001\u0000\u0000\u0000\u0555\u0554\u0001\u0000"+
		"\u0000\u0000\u0556\u0559\u0001\u0000\u0000\u0000\u0557\u0555\u0001\u0000"+
		"\u0000\u0000\u0557\u0558\u0001\u0000\u0000\u0000\u0558\u00d1\u0001\u0000"+
		"\u0000\u0000\u0559\u0557\u0001\u0000\u0000\u0000\u055a\u055b\u0003\u008e"+
		"G\u0000\u055b\u055c\u0005\u0093\u0000\u0000\u055c\u055d\u0005a\u0000\u0000"+
		"\u055d\u0561\u0005\u0098\u0000\u0000\u055e\u0560\u0003\u00d4j\u0000\u055f"+
		"\u055e\u0001\u0000\u0000\u0000\u0560\u0563\u0001\u0000\u0000\u0000\u0561"+
		"\u055f\u0001\u0000\u0000\u0000\u0561\u0562\u0001\u0000\u0000\u0000\u0562"+
		"\u0564\u0001\u0000\u0000\u0000\u0563\u0561\u0001\u0000\u0000\u0000\u0564"+
		"\u0565\u0005\u0099\u0000\u0000\u0565\u0573\u0001\u0000\u0000\u0000\u0566"+
		"\u0567\u0003\u008eG\u0000\u0567\u0568\u0005\u0093\u0000\u0000\u0568\u0569"+
		"\u0005X\u0000\u0000\u0569\u056a\u0005\u0098\u0000\u0000\u056a\u056b\u0003"+
		"\u00d6k\u0000\u056b\u056c\u0005\u0099\u0000\u0000\u056c\u0573\u0001\u0000"+
		"\u0000\u0000\u056d\u056e\u0005\u0018\u0000\u0000\u056e\u056f\u0005\u0098"+
		"\u0000\u0000\u056f\u0570\u0003\u008eG\u0000\u0570\u0571\u0005\u0099\u0000"+
		"\u0000\u0571\u0573\u0001\u0000\u0000\u0000\u0572\u055a\u0001\u0000\u0000"+
		"\u0000\u0572\u0566\u0001\u0000\u0000\u0000\u0572\u056d\u0001\u0000\u0000"+
		"\u0000\u0573\u00d3\u0001\u0000\u0000\u0000\u0574\u0575\u0005Y\u0000\u0000"+
		"\u0575\u0576\u0005\u0098\u0000\u0000\u0576\u0577\u0003\u001c\u000e\u0000"+
		"\u0577\u0578\u0005\u0099\u0000\u0000\u0578\u059c\u0001\u0000\u0000\u0000"+
		"\u0579\u057a\u0005Z\u0000\u0000\u057a\u057b\u0005\u0098\u0000\u0000\u057b"+
		"\u057c\u0003\u001c\u000e\u0000\u057c\u057d\u0005\u0099\u0000\u0000\u057d"+
		"\u059c\u0001\u0000\u0000\u0000\u057e\u057f\u0005[\u0000\u0000\u057f\u0580"+
		"\u0005\u0098\u0000\u0000\u0580\u0581\u0003\u001c\u000e\u0000\u0581\u0582"+
		"\u0005\u0099\u0000\u0000\u0582\u059c\u0001\u0000\u0000\u0000\u0583\u0584"+
		"\u0005\\\u0000\u0000\u0584\u0585\u0005\u0098\u0000\u0000\u0585\u0586\u0003"+
		"\u001c\u000e\u0000\u0586\u0587\u0005\u0099\u0000\u0000\u0587\u059c\u0001"+
		"\u0000\u0000\u0000\u0588\u0589\u0005]\u0000\u0000\u0589\u058a\u0005\u0098"+
		"\u0000\u0000\u058a\u058b\u0003\u001c\u000e\u0000\u058b\u058c\u0005\u0099"+
		"\u0000\u0000\u058c\u059c\u0001\u0000\u0000\u0000\u058d\u058e\u0005_\u0000"+
		"\u0000\u058e\u058f\u0005\u0098\u0000\u0000\u058f\u0590\u0003\u001c\u000e"+
		"\u0000\u0590\u0591\u0005\u0099\u0000\u0000\u0591\u059c\u0001\u0000\u0000"+
		"\u0000\u0592\u0593\u0005^\u0000\u0000\u0593\u0594\u0005\u0098\u0000\u0000"+
		"\u0594\u0595\u0003\u001c\u000e\u0000\u0595\u0596\u0005\u0099\u0000\u0000"+
		"\u0596\u059c\u0001\u0000\u0000\u0000\u0597\u0598\u0005`\u0000\u0000\u0598"+
		"\u0599\u0005\u0098\u0000\u0000\u0599\u059a\u0005\u00a6\u0000\u0000\u059a"+
		"\u059c\u0005\u0099\u0000\u0000\u059b\u0574\u0001\u0000\u0000\u0000\u059b"+
		"\u0579\u0001\u0000\u0000\u0000\u059b\u057e\u0001\u0000\u0000\u0000\u059b"+
		"\u0583\u0001\u0000\u0000\u0000\u059b\u0588\u0001\u0000\u0000\u0000\u059b"+
		"\u058d\u0001\u0000\u0000\u0000\u059b\u0592\u0001\u0000\u0000\u0000\u059b"+
		"\u0597\u0001\u0000\u0000\u0000\u059c\u00d5\u0001\u0000\u0000\u0000\u059d"+
		"\u05a3\u0003\u001c\u000e\u0000\u059e\u059f\u0005\u009a\u0000\u0000\u059f"+
		"\u05a0\u0003\u00d8l\u0000\u05a0\u05a1\u0005\u009b\u0000\u0000\u05a1\u05a3"+
		"\u0001\u0000\u0000\u0000\u05a2\u059d\u0001\u0000\u0000\u0000\u05a2\u059e"+
		"\u0001\u0000\u0000\u0000\u05a3\u00d7\u0001\u0000\u0000\u0000\u05a4\u05a9"+
		"\u0003\u00dam\u0000\u05a5\u05a6\u0005\u0092\u0000\u0000\u05a6\u05a8\u0003"+
		"\u00dam\u0000\u05a7\u05a5\u0001\u0000\u0000\u0000\u05a8\u05ab\u0001\u0000"+
		"\u0000\u0000\u05a9\u05a7\u0001\u0000\u0000\u0000\u05a9\u05aa\u0001\u0000"+
		"\u0000\u0000\u05aa\u00d9\u0001\u0000\u0000\u0000\u05ab\u05a9\u0001\u0000"+
		"\u0000\u0000\u05ac\u05ad\u0005\u00a9\u0000\u0000\u05ad\u05ae\u0005\u0091"+
		"\u0000\u0000\u05ae\u05af\u0003\u001c\u000e\u0000\u05af\u00db\u0001\u0000"+
		"\u0000\u0000\u05b0\u05b5\u0003\u008eG\u0000\u05b1\u05b5\u0003\u00d2i\u0000"+
		"\u05b2\u05b5\u0003\u00deo\u0000\u05b3\u05b5\u0003\u00e0p\u0000\u05b4\u05b0"+
		"\u0001\u0000\u0000\u0000\u05b4\u05b1\u0001\u0000\u0000\u0000\u05b4\u05b2"+
		"\u0001\u0000\u0000\u0000\u05b4\u05b3\u0001\u0000\u0000\u0000\u05b5\u00dd"+
		"\u0001\u0000\u0000\u0000\u05b6\u05b7\u0005.\u0000\u0000\u05b7\u05b8\u0005"+
		"\u0093\u0000\u0000\u05b8\u05b9\u0005\u00a9\u0000\u0000\u05b9\u05ba\u0005"+
		"\u0093\u0000\u0000\u05ba\u05bb\u0005:\u0000\u0000\u05bb\u05bc\u0005\u0098"+
		"\u0000\u0000\u05bc\u05bd\u0003\u008eG\u0000\u05bd\u05be\u0005\u0099\u0000"+
		"\u0000\u05be\u05c8\u0001\u0000\u0000\u0000\u05bf\u05c0\u0005.\u0000\u0000"+
		"\u05c0\u05c1\u0005\u0093\u0000\u0000\u05c1\u05c2\u0005\u00a9\u0000\u0000"+
		"\u05c2\u05c3\u0005\u0093\u0000\u0000\u05c3\u05c4\u00059\u0000\u0000\u05c4"+
		"\u05c5\u0005\u0098\u0000\u0000\u05c5\u05c6\u0005\u00a9\u0000\u0000\u05c6"+
		"\u05c8\u0005\u0099\u0000\u0000\u05c7\u05b6\u0001\u0000\u0000\u0000\u05c7"+
		"\u05bf\u0001\u0000\u0000\u0000\u05c8\u00df\u0001\u0000\u0000\u0000\u05c9"+
		"\u05ca\u0005.\u0000\u0000\u05ca\u05cb\u0005\u0093\u0000\u0000\u05cb\u05cc"+
		"\u0005\u00a9\u0000\u0000\u05cc\u05cd\u0005\u0093\u0000\u0000\u05cd\u05ce"+
		"\u0005I\u0000\u0000\u05ce\u05cf\u0005\u0098\u0000\u0000\u05cf\u05d0\u0003"+
		"x<\u0000\u05d0\u05d1\u0005\u0099\u0000\u0000\u05d1\u05db\u0001\u0000\u0000"+
		"\u0000\u05d2\u05d3\u0005.\u0000\u0000\u05d3\u05d4\u0005\u0093\u0000\u0000"+
		"\u05d4\u05d5\u0005\u00a9\u0000\u0000\u05d5\u05d6\u0005\u0093\u0000\u0000"+
		"\u05d6\u05d7\u0005J\u0000\u0000\u05d7\u05d8\u0005\u0098\u0000\u0000\u05d8"+
		"\u05d9\u0005\u00a5\u0000\u0000\u05d9\u05db\u0005\u0099\u0000\u0000\u05da"+
		"\u05c9\u0001\u0000\u0000\u0000\u05da\u05d2\u0001\u0000\u0000\u0000\u05db"+
		"\u00e1\u0001\u0000\u0000\u0000\u05dc\u05dd\u0005F\u0000\u0000\u05dd\u05de"+
		"\u0005\u00b0\u0000\u0000\u05de\u05ed\u0005\u00b2\u0000\u0000\u05df\u05e0"+
		"\u0005G\u0000\u0000\u05e0\u05e1\u0005\u00b0\u0000\u0000\u05e1\u05ed\u0005"+
		"\u00b2\u0000\u0000\u05e2\u05e3\u0005\u009c\u0000\u0000\u05e3\u05e4\u0005"+
		"F\u0000\u0000\u05e4\u05e5\u0005\u009d\u0000\u0000\u05e5\u05e6\u0005\u00b0"+
		"\u0000\u0000\u05e6\u05ed\u0005\u00b2\u0000\u0000\u05e7\u05e8\u0005\u0098"+
		"\u0000\u0000\u05e8\u05e9\u0005\u00a9\u0000\u0000\u05e9\u05ea\u0005\u0099"+
		"\u0000\u0000\u05ea\u05eb\u0005\u00b0\u0000\u0000\u05eb\u05ed\u0005\u00b2"+
		"\u0000\u0000\u05ec\u05dc\u0001\u0000\u0000\u0000\u05ec\u05df\u0001\u0000"+
		"\u0000\u0000\u05ec\u05e2\u0001\u0000\u0000\u0000\u05ec\u05e7\u0001\u0000"+
		"\u0000\u0000\u05ed\u00e3\u0001\u0000\u0000\u0000\u009e\u00e7\u00ec\u00ee"+
		"\u00fa\u0107\u0110\u0114\u0116\u011c\u012a\u0130\u0134\u0137\u013e\u0144"+
		"\u0149\u0152\u0157\u015f\u0163\u0167\u016c\u0171\u0173\u017c\u017f\u0189"+
		"\u018d\u019e\u01a4\u01a7\u01b1\u01b5\u01db\u01e1\u01e4\u01ee\u01f2\u01fa"+
		"\u0200\u0208\u020b\u0215\u0219\u0223\u0226\u0230\u0234\u023b\u0245\u0248"+
		"\u0250\u0253\u025c\u0260\u0266\u0268\u026e\u0272\u0276\u027a\u027e\u0285"+
		"\u028b\u0290\u0297\u02a1\u02a5\u02af\u02b2\u02bb\u02c0\u02c7\u02d4\u02d8"+
		"\u02dd\u02e9\u02eb\u02f7\u02fb\u0309\u030d\u0321\u0325\u0329\u0331\u033a"+
		"\u0341\u0345\u0349\u036d\u0374\u037c\u0380\u0385\u0389\u0391\u0394\u0397"+
		"\u03a1\u03a5\u03ae\u03b2\u03bb\u03bf\u03c5\u03c9\u03d4\u03e9\u0407\u0409"+
		"\u0412\u041e\u0425\u042d\u0436\u043d\u0440\u0446\u0455\u045e\u0460\u0475"+
		"\u0478\u047c\u0484\u0487\u048e\u0498\u049b\u04a3\u04ae\u04b8\u04d1\u04dd"+
		"\u04e7\u04ed\u04f0\u04fb\u0505\u051c\u052f\u0536\u053b\u053d\u0543\u0549"+
		"\u0555\u0557\u0561\u0572\u059b\u05a2\u05a9\u05b4\u05c7\u05da\u05ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}