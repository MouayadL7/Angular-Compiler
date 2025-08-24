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
		PUBLIC=50, PROTECTED=51, ROUTER_MODULE=52, ROUTES=53, FOR_ROOT=54, FOR_CHILD=55, 
		ROUTER=56, NAVIGATE=57, NAVIGATE_BY_URL=58, ROUTE_PATH=59, ROUTE_COMPONENT=60, 
		ROUTE_REDIRECT_TO=61, ROUTE_PATH_MATCH=62, ROUTE_CHILDREN=63, ROUTE_LOAD_CHILDREN=64, 
		ROUTE_CAN_ACTIVATE=65, ROUTE_CAN_ACTIVATE_CHILD=66, ROUTE_CAN_DEACTIVATE=67, 
		ROUTE_CAN_MATCH=68, ROUTE_RESOLVE=69, ROUTE_DATA=70, STORE_MODULE=71, 
		EFFECTS_MODULE=72, FOR_FEATURE=73, CREATE_ACTION=74, PROPS=75, CREATE_REDUCER=76, 
		ON_KW=77, CREATE_SELECTOR=78, CREATE_FEATURE_SELECTOR=79, CREATE_EFFECT=80, 
		OF_TYPE=81, SELECT=82, DISPATCH=83, ACTIONS=84, PIPEFN=85, GT=86, GTE=87, 
		LT=88, LTE=89, ASSIGN=90, NOT=91, EQ=92, NEQ=93, STRICT_EQ=94, STRICT_NEQ=95, 
		PLUS=96, MINUS=97, MULT=98, DIV=99, MOD=100, AND=101, OR=102, BIT_AND=103, 
		BIT_XOR=104, BIT_OR=105, PLUS_ASSIGN=106, MINUS_ASSIGN=107, MULTIPLY_ASSIGN=108, 
		DIVIDE_ASSIGN=109, MODULUS_ASSIGN=110, POWER_ASSIGN=111, RIGHT_SHIFT_ARITHMETIC_ASSIGN=112, 
		LEFT_SHIFT_ARITHMETIC_ASSIGN=113, RIGHT_SHIFT_LOGICAL_ASSIGN=114, BIT_AND_ASSIGN=115, 
		BIT_XOR_ASSIGN=116, BIT_OR_ASSIGN=117, ARROW=118, NULLCOALESCE=119, PLUS_PLUS=120, 
		MINUS_MINUS=121, SEMI=122, COLON=123, COMMA=124, DOT=125, QUES=126, AT=127, 
		HASH_TAG=128, QUOTE=129, LPAREN=130, RPAREN=131, LBRACE=132, RBRACE=133, 
		LBRACK=134, RBRACK=135, FOR=136, DO=137, WHILE=138, BREAK=139, CONTINUE=140, 
		OF=141, IN=142, STRING=143, NUMBER=144, BOOL=145, NULL=146, IDENTIFIER=147, 
		HTML_TEMPLATE=148, OPEN_TAG=149, CLOSE_TAG=150, SLASH=151, EQUALS=152, 
		COL=153, STRING_HTML=154, INTERPOLATION_START=155, INTERPOLATION_END=156, 
		BINDING=157, EVENT=158, TWOBIND=159, NGFOR=160, NGIF=161, DDIRECTIVE=162, 
		P=163, REFERENCE_VAR=164, ATTRIBUTE=165, HTML_CLASS=166, WHITESPACE=167, 
		COMMENT=168, END_HTML=169;
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
		RULE_memberChain = 68, RULE_callExpression = 69, RULE_initialization = 70, 
		RULE_primary = 71, RULE_literal = 72, RULE_expression = 73, RULE_genericType = 74, 
		RULE_typeAnnotation = 75, RULE_accessModifier = 76, RULE_htmlTemplate = 77, 
		RULE_element = 78, RULE_openTag = 79, RULE_closeTag = 80, RULE_selfClosingTag = 81, 
		RULE_content = 82, RULE_attributeHTML = 83, RULE_interpolation = 84, RULE_interpolationElement = 85, 
		RULE_tagName = 86, RULE_structuralDirective = 87, RULE_routesDeclaration = 88, 
		RULE_routesArray = 89, RULE_route = 90, RULE_routeProperty = 91, RULE_routerModuleCall = 92, 
		RULE_navigationStatement = 93, RULE_actionDeclaration = 94, RULE_reducerDeclaration = 95, 
		RULE_effectDeclaration = 96, RULE_storeModuleCall = 97, RULE_effectsModuleCall = 98, 
		RULE_storeDispatchStatement = 99, RULE_storeSelectExpression = 100;
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
			"arrayAccess", "memberChain", "callExpression", "initialization", "primary", 
			"literal", "expression", "genericType", "typeAnnotation", "accessModifier", 
			"htmlTemplate", "element", "openTag", "closeTag", "selfClosingTag", "content", 
			"attributeHTML", "interpolation", "interpolationElement", "tagName", 
			"structuralDirective", "routesDeclaration", "routesArray", "route", "routeProperty", 
			"routerModuleCall", "navigationStatement", "actionDeclaration", "reducerDeclaration", 
			"effectDeclaration", "storeModuleCall", "effectsModuleCall", "storeDispatchStatement", 
			"storeSelectExpression"
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
			"'private'", "'public'", "'protected'", "'RouterModule'", "'Routes'", 
			"'forRoot'", "'forChild'", "'Router'", "'navigate'", "'navigateByUrl'", 
			"'path'", "'component'", "'redirectTo'", "'pathMatch'", "'children'", 
			"'loadChildren'", "'canActivate'", "'canActivateChild'", "'canDeactivate'", 
			"'canMatch'", "'resolve'", "'data'", "'StoreModule'", "'EffectsModule'", 
			"'forFeature'", "'createAction'", "'props'", "'createReducer'", "'on'", 
			"'createSelector'", "'createFeatureSelector'", "'createEffect'", "'ofType'", 
			"'select'", "'dispatch'", "'Actions'", "'pipe'", null, "'>='", null, 
			"'<='", null, "'!'", "'=='", "'!='", "'==='", "'!=='", "'+'", "'-'", 
			"'*'", null, "'%'", "'&&'", "'||'", "'&'", "'^'", null, "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'**='", "'>>='", "'<<='", "'>>>='", "'&='", 
			"'^='", "'|='", "'=>'", "'??'", "'++'", "'--'", "';'", null, "','", "'.'", 
			"'?'", "'@'", "'#'", null, "'('", "')'", "'{'", "'}'", "'['", "']'", 
			"'for'", "'do'", "'while'", "'break'", "'continue'", "'of'", "'in'", 
			null, null, null, "'null'", null, null, null, null, null, null, null, 
			null, "'{{'", "'}}'", null, null, null, "'*ngFor'", "'*ngIf'"
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
			"ROUTER_MODULE", "ROUTES", "FOR_ROOT", "FOR_CHILD", "ROUTER", "NAVIGATE", 
			"NAVIGATE_BY_URL", "ROUTE_PATH", "ROUTE_COMPONENT", "ROUTE_REDIRECT_TO", 
			"ROUTE_PATH_MATCH", "ROUTE_CHILDREN", "ROUTE_LOAD_CHILDREN", "ROUTE_CAN_ACTIVATE", 
			"ROUTE_CAN_ACTIVATE_CHILD", "ROUTE_CAN_DEACTIVATE", "ROUTE_CAN_MATCH", 
			"ROUTE_RESOLVE", "ROUTE_DATA", "STORE_MODULE", "EFFECTS_MODULE", "FOR_FEATURE", 
			"CREATE_ACTION", "PROPS", "CREATE_REDUCER", "ON_KW", "CREATE_SELECTOR", 
			"CREATE_FEATURE_SELECTOR", "CREATE_EFFECT", "OF_TYPE", "SELECT", "DISPATCH", 
			"ACTIONS", "PIPEFN", "GT", "GTE", "LT", "LTE", "ASSIGN", "NOT", "EQ", 
			"NEQ", "STRICT_EQ", "STRICT_NEQ", "PLUS", "MINUS", "MULT", "DIV", "MOD", 
			"AND", "OR", "BIT_AND", "BIT_XOR", "BIT_OR", "PLUS_ASSIGN", "MINUS_ASSIGN", 
			"MULTIPLY_ASSIGN", "DIVIDE_ASSIGN", "MODULUS_ASSIGN", "POWER_ASSIGN", 
			"RIGHT_SHIFT_ARITHMETIC_ASSIGN", "LEFT_SHIFT_ARITHMETIC_ASSIGN", "RIGHT_SHIFT_LOGICAL_ASSIGN", 
			"BIT_AND_ASSIGN", "BIT_XOR_ASSIGN", "BIT_OR_ASSIGN", "ARROW", "NULLCOALESCE", 
			"PLUS_PLUS", "MINUS_MINUS", "SEMI", "COLON", "COMMA", "DOT", "QUES", 
			"AT", "HASH_TAG", "QUOTE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", 
			"RBRACK", "FOR", "DO", "WHILE", "BREAK", "CONTINUE", "OF", "IN", "STRING", 
			"NUMBER", "BOOL", "NULL", "IDENTIFIER", "HTML_TEMPLATE", "OPEN_TAG", 
			"CLOSE_TAG", "SLASH", "EQUALS", "COL", "STRING_HTML", "INTERPOLATION_START", 
			"INTERPOLATION_END", "BINDING", "EVENT", "TWOBIND", "NGFOR", "NGIF", 
			"DDIRECTIVE", "P", "REFERENCE_VAR", "ATTRIBUTE", "HTML_CLASS", "WHITESPACE", 
			"COMMENT", "END_HTML"
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
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(202);
				importStatement();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 8945141205173216L) != 0 || (((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & -6267321831438417917L) != 0 || (((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & 3975L) != 0) {
				{
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(208);
					declaration();
					}
					break;
				case 2:
					{
					setState(209);
					statement();
					}
					break;
				}
				}
				setState(214);
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
			setState(215);
			match(IMPORT);
			setState(216);
			importDeclaration();
			setState(217);
			match(FROM);
			setState(218);
			match(STRING);
			setState(219);
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
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new DefaultSpecifierDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				importDefaultSpecifier();
				}
				break;
			case 2:
				_localctx = new NamespaceSpecifierDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				importNamespaceSpecifier();
				}
				break;
			case 3:
				_localctx = new NamedSpecifierDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
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
			setState(226);
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
			setState(228);
			match(MULT);
			setState(229);
			match(AS);
			setState(230);
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
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0 || _la==IDENTIFIER) {
				{
				{
				setState(232);
				importSpecifier();
				setState(233);
				match(COMMA);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			match(LBRACE);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0 || _la==IDENTIFIER) {
				{
				setState(241);
				importSpecifier();
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(242);
						match(COMMA);
						setState(243);
						importSpecifier();
						}
						} 
					}
					setState(248);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(249);
					match(COMMA);
					}
				}

				}
			}

			setState(254);
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
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentifierImportSpecifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(IDENTIFIER);
				}
				break;
			case PLATFORM_BROWSER_DYNAMIC:
			case BOOTSTRAP_MODULE:
			case BOOTSTRAP_APPLICATION:
				_localctx = new BootstrapImportSpecifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
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
			setState(260);
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
	public static class ActionDeclContext extends DeclarationContext {
		public ActionDeclarationContext actionDeclaration() {
			return getRuleContext(ActionDeclarationContext.class,0);
		}
		public ActionDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
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
	public static class EffectDeclContext extends DeclarationContext {
		public EffectDeclarationContext effectDeclaration() {
			return getRuleContext(EffectDeclarationContext.class,0);
		}
		public EffectDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
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
	public static class RouteDeclContext extends DeclarationContext {
		public RoutesDeclarationContext routesDeclaration() {
			return getRuleContext(RoutesDeclarationContext.class,0);
		}
		public RouteDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouteDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouteDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouteDecl(this);
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
	public static class ReducerDeclContext extends DeclarationContext {
		public ReducerDeclarationContext reducerDeclaration() {
			return getRuleContext(ReducerDeclarationContext.class,0);
		}
		public ReducerDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReducerDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReducerDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReducerDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new NgModuleDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				ngModuleDeclaration();
				}
				break;
			case 2:
				_localctx = new ComponentDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				componentDeclaration();
				}
				break;
			case 3:
				_localctx = new PipeDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				pipeDeclaration();
				}
				break;
			case 4:
				_localctx = new InjectableDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				injectableDeclaration();
				}
				break;
			case 5:
				_localctx = new DirectiveDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				directiveDeclaration();
				}
				break;
			case 6:
				_localctx = new InterfaceDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				interfaceDeclaration();
				}
				break;
			case 7:
				_localctx = new ClassDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(268);
				classDeclaration();
				}
				break;
			case 8:
				_localctx = new EnumDeclContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(269);
				enumDeclaration();
				}
				break;
			case 9:
				_localctx = new VariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(270);
				variableDeclaration();
				}
				break;
			case 10:
				_localctx = new FunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(271);
				functionDeclaration();
				}
				break;
			case 11:
				_localctx = new ActionDeclContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(272);
				actionDeclaration();
				}
				break;
			case 12:
				_localctx = new ReducerDeclContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(273);
				reducerDeclaration();
				}
				break;
			case 13:
				_localctx = new EffectDeclContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(274);
				effectDeclaration();
				}
				break;
			case 14:
				_localctx = new RouteDeclContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(275);
				routesDeclaration();
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
			setState(278);
			varHelper();
			setState(279);
			match(IDENTIFIER);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(280);
				match(COLON);
				setState(281);
				typeAnnotation();
				}
			}

			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(284);
				match(ASSIGN);
				setState(285);
				initialization();
				}
			}

			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(288);
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
			setState(291);
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
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new NormalFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				normalFunction();
				}
				break;
			case 2:
				_localctx = new AnonymousFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				anonymousFunction();
				}
				break;
			case 3:
				_localctx = new ArrowFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(295);
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
			setState(298);
			match(FUNCTION);
			setState(299);
			match(IDENTIFIER);
			setState(300);
			match(LPAREN);
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(301);
				parameterList();
				}
			}

			setState(304);
			match(RPAREN);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(305);
				match(COLON);
				setState(306);
				typeAnnotation();
				}
			}

			setState(309);
			match(LBRACE);
			setState(310);
			block();
			setState(311);
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
			setState(313);
			match(FUNCTION);
			setState(314);
			match(LPAREN);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(315);
				parameterList();
				}
			}

			setState(318);
			match(RPAREN);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(319);
				match(COLON);
				setState(320);
				typeAnnotation();
				}
			}

			setState(323);
			match(LBRACE);
			setState(324);
			block();
			setState(325);
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
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				{
				setState(327);
				match(LPAREN);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
					{
					setState(328);
					parameterList();
					}
				}

				setState(331);
				match(RPAREN);
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(332);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(335);
				match(COLON);
				setState(336);
				typeAnnotation();
				}
			}

			setState(339);
			match(ARROW);
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(340);
				statement();
				}
				break;
			case 2:
				{
				setState(341);
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
			setState(344);
			match(LBRACE);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 105553249436607L) != 0 || (((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 139869494255288321L) != 0) {
				{
				setState(347);
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
				case ROUTER_MODULE:
				case STORE_MODULE:
				case EFFECTS_MODULE:
				case NOT:
				case PLUS_PLUS:
				case MINUS_MINUS:
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
					setState(345);
					statement();
					}
					break;
				case LET:
				case CONST:
					{
					setState(346);
					variableDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
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
			setState(354);
			match(MODULE);
			setState(355);
			match(LPAREN);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(356);
				match(LBRACE);
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 3768320L) != 0) {
					{
					setState(357);
					moduleMetadata();
					}
				}

				setState(360);
				match(RBRACE);
				}
			}

			setState(363);
			match(RPAREN);
			setState(364);
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
			setState(366);
			metadataModuleProperty();
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(367);
					match(COMMA);
					setState(368);
					metadataModuleProperty();
					}
					} 
				}
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(374);
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
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOTSTRAP:
				_localctx = new BootstrapPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(BOOTSTRAP);
				setState(378);
				match(COLON);
				setState(379);
				array();
				}
				break;
			case DECLARATIONS:
				_localctx = new DeclarationsModulePropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
				match(DECLARATIONS);
				setState(381);
				match(COLON);
				setState(382);
				array();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsModulePropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				match(IMPORTS);
				setState(384);
				match(COLON);
				setState(385);
				array();
				}
				break;
			case EXPORTS:
				_localctx = new ExportsModulePropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				match(EXPORTS);
				setState(387);
				match(COLON);
				setState(388);
				array();
				}
				break;
			case PROVIDERS:
				_localctx = new ProvidersModulePropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(389);
				match(PROVIDERS);
				setState(390);
				match(COLON);
				setState(391);
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
			setState(394);
			match(COMPONENT);
			setState(395);
			match(LPAREN);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(396);
				match(LBRACE);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 6290432L) != 0) {
					{
					setState(397);
					componentMetadata();
					}
				}

				setState(400);
				match(RBRACE);
				}
			}

			setState(403);
			match(RPAREN);
			setState(404);
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
			setState(406);
			metadataComponentProperty();
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(407);
					match(COMMA);
					setState(408);
					metadataComponentProperty();
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(414);
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
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				match(SELECTOR);
				setState(418);
				match(COLON);
				setState(419);
				match(STRING);
				}
				break;
			case TEMPLATE_URL:
				_localctx = new TemplateUrlPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				match(TEMPLATE_URL);
				setState(421);
				match(COLON);
				setState(422);
				match(STRING);
				}
				break;
			case TEMPLATE:
				_localctx = new TemplatePropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				match(TEMPLATE);
				setState(424);
				match(COLON);
				setState(425);
				htmlTemplate();
				}
				break;
			case STYLE_URLS:
				_localctx = new StyleUrlsPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(426);
				match(STYLE_URLS);
				setState(427);
				match(COLON);
				setState(428);
				array();
				}
				break;
			case STYLES:
				_localctx = new StylesPropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(429);
				match(STYLES);
				setState(430);
				match(COLON);
				setState(431);
				array();
				}
				break;
			case STANDALONE:
				_localctx = new StandalonePropertyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(432);
				match(STANDALONE);
				setState(433);
				match(COLON);
				setState(434);
				match(BOOL);
				}
				break;
			case INPUTS:
				_localctx = new InputsPropertyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(435);
				match(INPUTS);
				setState(436);
				match(COLON);
				setState(437);
				array();
				}
				break;
			case OUTPUTS:
				_localctx = new OutputsPropertyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(438);
				match(OUTPUTS);
				setState(439);
				match(COLON);
				setState(440);
				array();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(441);
				match(IMPORTS);
				setState(442);
				match(COLON);
				setState(443);
				array();
				}
				break;
			case EXPORTS:
				_localctx = new ExportsComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(444);
				match(EXPORTS);
				setState(445);
				match(COLON);
				setState(446);
				array();
				}
				break;
			case PROVIDERS:
				_localctx = new ProvidersComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(447);
				match(PROVIDERS);
				setState(448);
				match(COLON);
				setState(449);
				array();
				}
				break;
			case DECLARATIONS:
				_localctx = new DeclarationsComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(450);
				match(DECLARATIONS);
				setState(451);
				match(COLON);
				setState(452);
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
			setState(455);
			match(DIRECTIVE);
			setState(456);
			match(LPAREN);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(457);
				match(LBRACE);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SELECTOR || _la==IDENTIFIER) {
					{
					setState(458);
					directiveMetadata();
					}
				}

				setState(461);
				match(RBRACE);
				}
			}

			setState(464);
			match(RPAREN);
			setState(465);
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
			setState(467);
			directiveMetadataProperty();
			setState(472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(468);
					match(COMMA);
					setState(469);
					directiveMetadataProperty();
					}
					} 
				}
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(475);
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
			setState(484);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorDirectivePropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(SELECTOR);
				setState(479);
				match(COLON);
				setState(480);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				match(IDENTIFIER);
				setState(482);
				match(COLON);
				setState(483);
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
			setState(486);
			match(AT);
			setState(487);
			match(IDENTIFIER);
			setState(488);
			match(LPAREN);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(489);
				parameterList();
				}
			}

			setState(492);
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
			setState(494);
			match(PIPE);
			setState(495);
			match(LPAREN);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(496);
				match(LBRACE);
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(497);
					pipeMetadata();
					}
				}

				setState(500);
				match(RBRACE);
				}
			}

			setState(503);
			match(RPAREN);
			setState(504);
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
			setState(506);
			pipeMetadataProperty();
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(507);
					match(COMMA);
					setState(508);
					pipeMetadataProperty();
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(514);
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
			setState(517);
			match(IDENTIFIER);
			setState(518);
			match(COLON);
			setState(519);
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
			setState(521);
			match(INJECTABLE);
			setState(522);
			match(LPAREN);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(523);
				match(LBRACE);
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(524);
					injectableMetadata();
					}
				}

				setState(527);
				match(RBRACE);
				}
			}

			setState(530);
			match(RPAREN);
			setState(531);
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
			setState(533);
			injectableMetadataProperty();
			setState(538);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(534);
					match(COMMA);
					setState(535);
					injectableMetadataProperty();
					}
					} 
				}
				setState(540);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(541);
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
			setState(544);
			match(IDENTIFIER);
			setState(545);
			match(COLON);
			setState(546);
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
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(548);
				match(EXPORT);
				}
			}

			setState(551);
			match(CLASS);
			setState(552);
			match(IDENTIFIER);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(553);
				match(EXTENDS);
				setState(554);
				match(IDENTIFIER);
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(555);
					match(COMMA);
					setState(556);
					match(IDENTIFIER);
					}
					}
					setState(561);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(564);
				match(IMPLEMENTS);
				setState(565);
				match(IDENTIFIER);
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(566);
					match(COMMA);
					setState(567);
					match(IDENTIFIER);
					}
					}
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(575);
			match(LBRACE);
			setState(576);
			classBody();
			setState(577);
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
			setState(582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(579);
					propertyDeclaration();
					}
					} 
				}
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRUCTOR) {
				{
				setState(585);
				constructorDeclaration();
				}
			}

			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 105553249436607L) != 0 || (((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 139869494255288321L) != 0) {
				{
				setState(592);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(588);
					methodDeclaration();
					}
					break;
				case 2:
					{
					setState(589);
					statement();
					}
					break;
				case 3:
					{
					setState(590);
					variableDeclaration();
					}
					break;
				case 4:
					{
					setState(591);
					functionDeclaration();
					}
					break;
				}
				}
				setState(596);
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
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(597);
				decorator();
				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0) {
				{
				setState(603);
				accessModifier();
				}
			}

			setState(606);
			match(IDENTIFIER);
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==QUES) {
				{
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUES) {
					{
					setState(607);
					match(QUES);
					}
				}

				setState(610);
				match(COLON);
				setState(611);
				typeAnnotation();
				}
			}

			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(614);
				match(ASSIGN);
				setState(615);
				initialization();
				}
			}

			setState(618);
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
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(620);
				decorator();
				}
				}
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(626);
			match(IDENTIFIER);
			setState(627);
			match(LPAREN);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(628);
				parameterList();
				}
			}

			setState(631);
			match(RPAREN);
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(632);
				match(COLON);
				setState(633);
				typeAnnotation();
				}
			}

			setState(636);
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
			setState(638);
			match(CONSTRUCTOR);
			setState(639);
			match(LPAREN);
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(640);
				parameterList();
				}
			}

			setState(643);
			match(RPAREN);
			setState(644);
			match(LBRACE);
			setState(645);
			constructorBody();
			setState(646);
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
			setState(651);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 105553249436583L) != 0 || (((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 139869494255288321L) != 0) {
				{
				{
				setState(648);
				statement();
				}
				}
				setState(653);
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
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(654);
				match(EXPORT);
				}
			}

			setState(657);
			match(INTERFACE);
			setState(658);
			match(IDENTIFIER);
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(659);
				match(EXTENDS);
				setState(660);
				match(IDENTIFIER);
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(661);
					match(COMMA);
					setState(662);
					match(IDENTIFIER);
					}
					}
					setState(667);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(670);
			match(LBRACE);
			setState(671);
			interfaceBody();
			setState(672);
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
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(674);
				interfaceProperty();
				}
				}
				setState(679);
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
			setState(680);
			match(IDENTIFIER);
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUES) {
				{
				setState(681);
				match(QUES);
				}
			}

			setState(684);
			match(COLON);
			setState(685);
			typeAnnotation();
			setState(686);
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
			setState(689);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(688);
				match(EXPORT);
				}
			}

			setState(691);
			match(ENUM);
			setState(692);
			match(IDENTIFIER);
			setState(693);
			match(LBRACE);
			setState(694);
			enumBody();
			setState(695);
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
			setState(697);
			enumProperty();
			setState(702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(698);
					match(COMMA);
					setState(699);
					enumProperty();
					}
					} 
				}
				setState(704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			}
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(705);
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
			setState(708);
			match(IDENTIFIER);
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(709);
				match(ASSIGN);
				setState(710);
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
	public static class NavigationStContext extends StatementContext {
		public NavigationStatementContext navigationStatement() {
			return getRuleContext(NavigationStatementContext.class,0);
		}
		public NavigationStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNavigationSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNavigationSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNavigationSt(this);
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
	public static class RouterModuleStContext extends StatementContext {
		public RouterModuleCallContext routerModuleCall() {
			return getRuleContext(RouterModuleCallContext.class,0);
		}
		public RouterModuleStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouterModuleSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouterModuleSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouterModuleSt(this);
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
	public static class StoreDispatchStContext extends StatementContext {
		public StoreDispatchStatementContext storeDispatchStatement() {
			return getRuleContext(StoreDispatchStatementContext.class,0);
		}
		public StoreDispatchStContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStoreDispatchSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStoreDispatchSt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStoreDispatchSt(this);
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
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				_localctx = new AssignmentStContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(713);
				assignment();
				}
				break;
			case 2:
				_localctx = new PrintStContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(714);
				printStatement();
				}
				break;
			case 3:
				_localctx = new ReturnStContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(715);
				returnStatement();
				}
				break;
			case 4:
				_localctx = new ThrowStContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(716);
				throwStatement();
				}
				break;
			case 5:
				_localctx = new ConditionalStContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(717);
				conditionalStatement();
				}
				break;
			case 6:
				_localctx = new IterationStContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(718);
				iterationStatement();
				}
				break;
			case 7:
				_localctx = new BootstrapCallStContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(719);
				bootstrapCall();
				}
				break;
			case 8:
				_localctx = new FunctionCallStContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(720);
				functionCall();
				}
				break;
			case 9:
				_localctx = new ExpressionStContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(721);
				expression(0);
				setState(723);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(722);
					match(SEMI);
					}
					break;
				}
				}
				break;
			case 10:
				_localctx = new StoreDispatchStContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(725);
				storeDispatchStatement();
				}
				break;
			case 11:
				_localctx = new NavigationStContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(726);
				navigationStatement();
				}
				break;
			case 12:
				_localctx = new RouterModuleStContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(727);
				routerModuleCall();
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
			setState(730);
			memberAccess();
			setState(731);
			match(ASSIGN);
			setState(732);
			initialization();
			setState(733);
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
			setState(735);
			match(CONSOLE);
			setState(736);
			match(DOT);
			setState(737);
			_la = _input.LA(1);
			if ( !(_la==LOG || _la==ERROR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(738);
			match(LPAREN);
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(739);
				parameterList();
				}
			}

			setState(742);
			match(RPAREN);
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(743);
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
			setState(746);
			match(RETURN);
			setState(747);
			expression(0);
			setState(748);
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
			setState(750);
			match(THROW);
			setState(751);
			expression(0);
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
			setState(754);
			ifStatement();
			setState(758);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(755);
					elseIfStatement();
					}
					} 
				}
				setState(760);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(761);
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
			setState(764);
			match(IF);
			setState(765);
			match(LPAREN);
			setState(766);
			expression(0);
			setState(767);
			match(RPAREN);
			setState(768);
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
			setState(770);
			match(ELSE);
			setState(771);
			match(IF);
			setState(772);
			match(LPAREN);
			setState(773);
			expression(0);
			setState(774);
			match(RPAREN);
			setState(775);
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
			setState(777);
			match(ELSE);
			setState(778);
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
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(780);
				statement();
				}
				break;
			case 2:
				{
				setState(781);
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
		public MemberChainContext memberChain() {
			return getRuleContext(MemberChainContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
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
			setState(784);
			memberChain();
			setState(785);
			match(LPAREN);
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(786);
				parameterList();
				}
			}

			setState(789);
			match(RPAREN);
			setState(790);
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
			setState(792);
			bootstrapSpecifier();
			setState(793);
			match(LPAREN);
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(794);
				parameterList();
				}
			}

			setState(797);
			match(RPAREN);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(798);
				match(DOT);
				setState(799);
				match(CATCH);
				setState(800);
				match(LPAREN);
				setState(801);
				arrowFunction();
				setState(802);
				match(RPAREN);
				}
			}

			setState(806);
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
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				_localctx = new StandardForLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				match(FOR);
				setState(809);
				match(LPAREN);
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET || _la==CONST) {
					{
					setState(810);
					variableDeclaration();
					}
				}

				setState(813);
				match(SEMI);
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
					{
					setState(814);
					expression(0);
					}
				}

				setState(817);
				match(SEMI);
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
					{
					setState(818);
					expression(0);
					}
				}

				setState(821);
				match(RPAREN);
				setState(822);
				statementBody();
				}
				break;
			case 2:
				_localctx = new ForOfLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
				match(FOR);
				setState(824);
				match(LPAREN);
				setState(825);
				varHelper();
				setState(826);
				match(IDENTIFIER);
				setState(827);
				match(OF);
				setState(828);
				match(IDENTIFIER);
				setState(829);
				match(RPAREN);
				setState(830);
				statementBody();
				}
				break;
			case 3:
				_localctx = new ForInLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(832);
				match(FOR);
				setState(833);
				match(LPAREN);
				setState(834);
				varHelper();
				setState(835);
				match(IDENTIFIER);
				setState(836);
				match(IN);
				setState(837);
				match(IDENTIFIER);
				setState(838);
				match(RPAREN);
				setState(839);
				statementBody();
				}
				break;
			case 4:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(841);
				match(WHILE);
				setState(842);
				match(LPAREN);
				setState(843);
				expression(0);
				setState(844);
				match(RPAREN);
				setState(845);
				statementBody();
				}
				break;
			case 5:
				_localctx = new DoWhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(847);
				match(DO);
				setState(848);
				statementBody();
				setState(849);
				match(WHILE);
				setState(850);
				match(LPAREN);
				setState(851);
				expression(0);
				setState(852);
				match(RPAREN);
				setState(853);
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
			setState(857);
			parameter();
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(858);
				match(COMMA);
				setState(859);
				parameter();
				}
				}
				setState(864);
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
			setState(865);
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
			setState(870);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(867);
				decorator();
				}
				}
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(874);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0) {
				{
				setState(873);
				accessModifier();
				}
			}

			setState(876);
			match(IDENTIFIER);
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(877);
				match(COLON);
				setState(878);
				typeAnnotation();
				}
				break;
			}
			setState(883);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(881);
				match(ASSIGN);
				setState(882);
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
			setState(885);
			match(LBRACK);
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(886);
				expression(0);
				setState(891);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(887);
						match(COMMA);
						setState(888);
						expression(0);
						}
						} 
					}
					setState(893);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
				}
				}
			}

			setState(897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(896);
				match(COMMA);
				}
			}

			setState(899);
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
			setState(907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				_localctx = new PrimaryValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(901);
				primary();
				}
				break;
			case 2:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(902);
				array();
				}
				break;
			case 3:
				_localctx = new ArrayAccessValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(903);
				arrayAccess();
				}
				break;
			case 4:
				_localctx = new MemberAccessValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(904);
				memberAccess();
				}
				break;
			case 5:
				_localctx = new ObjectValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(905);
				object();
				}
				break;
			case 6:
				_localctx = new ObjectInstantiationValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(906);
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
			setState(909);
			match(LBRACE);
			setState(911);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(910);
				attributes();
				}
			}

			setState(913);
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
			setState(915);
			attribute();
			setState(920);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(916);
					match(COMMA);
					setState(917);
					attribute();
					}
					} 
				}
				setState(922);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(923);
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
			setState(926);
			match(IDENTIFIER);
			setState(927);
			match(COLON);
			setState(928);
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
			setState(930);
			match(NEW);
			setState(931);
			match(IDENTIFIER);
			setState(933);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(932);
				genericType();
				}
			}

			setState(935);
			match(LPAREN);
			setState(937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(936);
				parameterList();
				}
			}

			setState(939);
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
			setState(947);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new MemberAccessIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				match(IDENTIFIER);
				setState(943);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(942);
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
				setState(945);
				match(THIS);
				setState(946);
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
			setState(949);
			match(IDENTIFIER);
			setState(950);
			match(LBRACK);
			setState(951);
			expression(0);
			setState(952);
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
	public static class MemberChainContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(AngularParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AngularParser.IDENTIFIER, i);
		}
		public MemberChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMemberChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMemberChain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMemberChain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberChainContext memberChain() throws RecognitionException {
		MemberChainContext _localctx = new MemberChainContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_memberChain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			primary();
			setState(959);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(955);
					match(DOT);
					setState(956);
					match(IDENTIFIER);
					}
					} 
				}
				setState(961);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
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
	public static class CallExpressionContext extends ParserRuleContext {
		public MemberChainContext memberChain() {
			return getRuleContext(MemberChainContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public CallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallExpressionContext callExpression() throws RecognitionException {
		CallExpressionContext _localctx = new CallExpressionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_callExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(962);
			memberChain();
			setState(963);
			match(LPAREN);
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(964);
				parameterList();
				}
			}

			setState(967);
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
		enterRule(_localctx, 140, RULE_initialization);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
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
		enterRule(_localctx, 142, RULE_primary);
		try {
			setState(973);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case BOOL:
			case NULL:
				_localctx = new LiteralPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(971);
				literal();
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(972);
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
		enterRule(_localctx, 144, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_la = _input.LA(1);
			if ( !((((_la - 143)) & ~0x3f) == 0 && ((1L << (_la - 143)) & 15L) != 0) ) {
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
	public static class SelectExpressionContext extends ExpressionContext {
		public StoreSelectExpressionContext storeSelectExpression() {
			return getRuleContext(StoreSelectExpressionContext.class,0);
		}
		public SelectExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class MemberChainExpressionContext extends ExpressionContext {
		public MemberChainContext memberChain() {
			return getRuleContext(MemberChainContext.class,0);
		}
		public MemberChainExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMemberChainExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMemberChainExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMemberChainExpression(this);
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
	public static class EffectsModuleCallExprContext extends ExpressionContext {
		public EffectsModuleCallContext effectsModuleCall() {
			return getRuleContext(EffectsModuleCallContext.class,0);
		}
		public EffectsModuleCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEffectsModuleCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEffectsModuleCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEffectsModuleCallExpr(this);
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
	public static class CallExpressionnContext extends ExpressionContext {
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public CallExpressionnContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCallExpressionn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCallExpressionn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCallExpressionn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StoreModuleCallExprContext extends ExpressionContext {
		public StoreModuleCallContext storeModuleCall() {
			return getRuleContext(StoreModuleCallContext.class,0);
		}
		public StoreModuleCallExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStoreModuleCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStoreModuleCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStoreModuleCallExpr(this);
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
		int _startState = 146;
		enterRecursionRule(_localctx, 146, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(978);
				functionCall();
				}
				break;
			case 2:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(979);
				functionDeclaration();
				}
				break;
			case 3:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(980);
				match(PLUS_PLUS);
				setState(981);
				expression(18);
				}
				break;
			case 4:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(982);
				match(MINUS_MINUS);
				setState(983);
				expression(17);
				}
				break;
			case 5:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(984);
				match(NOT);
				setState(985);
				expression(16);
				}
				break;
			case 6:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(986);
				match(LPAREN);
				setState(987);
				expression(0);
				setState(988);
				match(RPAREN);
				}
				break;
			case 7:
				{
				_localctx = new ValueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(990);
				value();
				}
				break;
			case 8:
				{
				_localctx = new ParameterExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(991);
				parameterDeclaration();
				}
				break;
			case 9:
				{
				_localctx = new SelectExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(992);
				storeSelectExpression();
				}
				break;
			case 10:
				{
				_localctx = new CallExpressionnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(993);
				callExpression();
				}
				break;
			case 11:
				{
				_localctx = new MemberChainExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(994);
				memberChain();
				}
				break;
			case 12:
				{
				_localctx = new StoreModuleCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(995);
				storeModuleCall();
				}
				break;
			case 13:
				{
				_localctx = new EffectsModuleCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(996);
				effectsModuleCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1029);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1027);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(999);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1000);
						_la = _input.LA(1);
						if ( !((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 7L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1001);
						expression(16);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1002);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1003);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1004);
						expression(15);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1005);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1006);
						_la = _input.LA(1);
						if ( !((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 15L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1007);
						expression(14);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1008);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1009);
						_la = _input.LA(1);
						if ( !((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 61L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1010);
						expression(13);
						}
						break;
					case 5:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1011);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1012);
						match(AND);
						setState(1013);
						expression(12);
						}
						break;
					case 6:
						{
						_localctx = new LogicalOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1014);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1015);
						match(OR);
						setState(1016);
						expression(11);
						}
						break;
					case 7:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1017);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1018);
						match(QUES);
						setState(1019);
						expression(0);
						setState(1020);
						match(COLON);
						setState(1021);
						expression(10);
						}
						break;
					case 8:
						{
						_localctx = new PostIncrementExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1023);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1024);
						match(PLUS_PLUS);
						}
						break;
					case 9:
						{
						_localctx = new PostDecreaseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1025);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1026);
						match(MINUS_MINUS);
						}
						break;
					}
					} 
				}
				setState(1031);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
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
		enterRule(_localctx, 148, RULE_genericType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1032);
			match(LT);
			setState(1033);
			typeAnnotation();
			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1034);
				match(COMMA);
				setState(1035);
				typeAnnotation();
				}
				}
				setState(1040);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1041);
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
		enterRule(_localctx, 150, RULE_typeAnnotation);
		int _la;
		try {
			int _alt;
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				_localctx = new GenericTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1043);
				match(IDENTIFIER);
				setState(1044);
				genericType();
				}
				break;
			case 2:
				_localctx = new PipeTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1045);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1050);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1046);
						match(BIT_OR);
						setState(1047);
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
					setState(1052);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new ArrayTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1053);
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
				match(LBRACK);
				setState(1055);
				match(RBRACK);
				}
				break;
			case 4:
				_localctx = new TupleTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1056);
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
		enterRule(_localctx, 152, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
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
		enterRule(_localctx, 154, RULE_htmlTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			match(HTML_TEMPLATE);
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & 65601L) != 0) {
				{
				{
				setState(1062);
				element();
				}
				}
				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1068);
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
		enterRule(_localctx, 156, RULE_element);
		try {
			int _alt;
			setState(1081);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				_localctx = new StandardTagElContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				openTag();
				setState(1074);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1071);
						content();
						}
						} 
					}
					setState(1076);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,116,_ctx);
				}
				setState(1077);
				closeTag();
				}
				break;
			case 2:
				_localctx = new SelfClosingTagElContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1079);
				selfClosingTag();
				}
				break;
			case 3:
				_localctx = new InterpolationElContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1080);
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
		enterRule(_localctx, 158, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_TAG) {
				{
				setState(1083);
				match(OPEN_TAG);
				}
			}

			setState(1086);
			tagName();
			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & 447L) != 0) {
				{
				{
				setState(1087);
				attributeHTML();
				}
				}
				setState(1092);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1093);
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
		enterRule(_localctx, 160, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			match(OPEN_TAG);
			setState(1096);
			match(SLASH);
			setState(1097);
			tagName();
			setState(1098);
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
		enterRule(_localctx, 162, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			match(OPEN_TAG);
			setState(1101);
			tagName();
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & 447L) != 0) {
				{
				{
				setState(1102);
				attributeHTML();
				}
				}
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1108);
			match(SLASH);
			setState(1109);
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
		enterRule(_localctx, 164, RULE_content);
		int _la;
		try {
			setState(1116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				_localctx = new NestedElementContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1111);
				element();
				}
				break;
			case 2:
				_localctx = new PlainTextContentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1112);
				match(ATTRIBUTE);
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COL) {
					{
					setState(1113);
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
		enterRule(_localctx, 166, RULE_attributeHTML);
		int _la;
		try {
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				_localctx = new StandardAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1118);
				match(ATTRIBUTE);
				setState(1119);
				match(EQUALS);
				setState(1120);
				match(STRING_HTML);
				}
				break;
			case 2:
				_localctx = new PropertyBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1121);
				match(BINDING);
				setState(1122);
				match(EQUALS);
				setState(1123);
				match(STRING_HTML);
				}
				break;
			case 3:
				_localctx = new EventBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1124);
				match(EVENT);
				setState(1125);
				match(EQUALS);
				setState(1126);
				match(STRING_HTML);
				}
				break;
			case 4:
				_localctx = new TwoWayBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1127);
				match(TWOBIND);
				setState(1128);
				match(EQUALS);
				setState(1129);
				match(STRING_HTML);
				}
				break;
			case 5:
				_localctx = new StructuralDirectiveAttrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1130);
				structuralDirective();
				setState(1131);
				match(EQUALS);
				setState(1132);
				match(STRING_HTML);
				}
				break;
			case 6:
				_localctx = new TemplateReferenceVariableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1134);
				match(REFERENCE_VAR);
				setState(1137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(1135);
					match(EQUALS);
					setState(1136);
					match(STRING_HTML);
					}
				}

				}
				break;
			case 7:
				_localctx = new AttributeOnlyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1139);
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
		enterRule(_localctx, 168, RULE_interpolation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(1142);
				match(ATTRIBUTE);
				setState(1143);
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

			setState(1146);
			match(INTERPOLATION_START);
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				{
				setState(1147);
				interpolationElement();
				}
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==P) {
					{
					{
					setState(1148);
					match(P);
					setState(1149);
					interpolationElement();
					}
					}
					setState(1154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1157);
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
		enterRule(_localctx, 170, RULE_interpolationElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			match(ATTRIBUTE);
			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COL) {
				{
				setState(1160);
				match(COL);
				setState(1161);
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
		enterRule(_localctx, 172, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
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
		enterRule(_localctx, 174, RULE_structuralDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1166);
			_la = _input.LA(1);
			if ( !((((_la - 160)) & ~0x3f) == 0 && ((1L << (_la - 160)) & 7L) != 0) ) {
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
	public static class RoutesDeclarationContext extends ParserRuleContext {
		public VarHelperContext varHelper() {
			return getRuleContext(VarHelperContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public RoutesArrayContext routesArray() {
			return getRuleContext(RoutesArrayContext.class,0);
		}
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode ROUTES() { return getToken(AngularParser.ROUTES, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public RoutesDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routesDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRoutesDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRoutesDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRoutesDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutesDeclarationContext routesDeclaration() throws RecognitionException {
		RoutesDeclarationContext _localctx = new RoutesDeclarationContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_routesDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			varHelper();
			setState(1169);
			match(IDENTIFIER);
			setState(1172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1170);
				match(COLON);
				setState(1171);
				match(ROUTES);
				}
			}

			setState(1174);
			match(ASSIGN);
			setState(1175);
			routesArray();
			setState(1177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1176);
				match(SEMI);
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
	public static class RoutesArrayContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public List<RouteContext> route() {
			return getRuleContexts(RouteContext.class);
		}
		public RouteContext route(int i) {
			return getRuleContext(RouteContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public RoutesArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routesArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRoutesArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRoutesArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRoutesArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutesArrayContext routesArray() throws RecognitionException {
		RoutesArrayContext _localctx = new RoutesArrayContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_routesArray);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			match(LBRACK);
			setState(1188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1180);
				route();
				setState(1185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1181);
						match(COMMA);
						setState(1182);
						route();
						}
						} 
					}
					setState(1187);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,131,_ctx);
				}
				}
			}

			setState(1191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1190);
				match(COMMA);
				}
			}

			setState(1193);
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
	public static class RouteContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public List<RoutePropertyContext> routeProperty() {
			return getRuleContexts(RoutePropertyContext.class);
		}
		public RoutePropertyContext routeProperty(int i) {
			return getRuleContext(RoutePropertyContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public RouteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_route; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRoute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRoute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRoute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouteContext route() throws RecognitionException {
		RouteContext _localctx = new RouteContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_route);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			match(LBRACE);
			setState(1196);
			routeProperty();
			setState(1201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1197);
					match(COMMA);
					setState(1198);
					routeProperty();
					}
					} 
				}
				setState(1203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,134,_ctx);
			}
			setState(1205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1204);
				match(COMMA);
				}
			}

			setState(1207);
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
		public TerminalNode ROUTE_PATH() { return getToken(AngularParser.ROUTE_PATH, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode ROUTE_COMPONENT() { return getToken(AngularParser.ROUTE_COMPONENT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ROUTE_REDIRECT_TO() { return getToken(AngularParser.ROUTE_REDIRECT_TO, 0); }
		public TerminalNode ROUTE_PATH_MATCH() { return getToken(AngularParser.ROUTE_PATH_MATCH, 0); }
		public TerminalNode ROUTE_CHILDREN() { return getToken(AngularParser.ROUTE_CHILDREN, 0); }
		public RoutesArrayContext routesArray() {
			return getRuleContext(RoutesArrayContext.class,0);
		}
		public TerminalNode ROUTE_LOAD_CHILDREN() { return getToken(AngularParser.ROUTE_LOAD_CHILDREN, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public MemberChainContext memberChain() {
			return getRuleContext(MemberChainContext.class,0);
		}
		public TerminalNode ROUTE_CAN_ACTIVATE() { return getToken(AngularParser.ROUTE_CAN_ACTIVATE, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode ROUTE_CAN_ACTIVATE_CHILD() { return getToken(AngularParser.ROUTE_CAN_ACTIVATE_CHILD, 0); }
		public TerminalNode ROUTE_CAN_DEACTIVATE() { return getToken(AngularParser.ROUTE_CAN_DEACTIVATE, 0); }
		public TerminalNode ROUTE_CAN_MATCH() { return getToken(AngularParser.ROUTE_CAN_MATCH, 0); }
		public TerminalNode ROUTE_RESOLVE() { return getToken(AngularParser.ROUTE_RESOLVE, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode ROUTE_DATA() { return getToken(AngularParser.ROUTE_DATA, 0); }
		public RoutePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouteProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouteProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouteProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutePropertyContext routeProperty() throws RecognitionException {
		RoutePropertyContext _localctx = new RoutePropertyContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_routeProperty);
		try {
			setState(1250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ROUTE_PATH:
				enterOuterAlt(_localctx, 1);
				{
				setState(1209);
				match(ROUTE_PATH);
				setState(1210);
				match(COLON);
				setState(1211);
				match(STRING);
				}
				break;
			case ROUTE_COMPONENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1212);
				match(ROUTE_COMPONENT);
				setState(1213);
				match(COLON);
				setState(1214);
				match(IDENTIFIER);
				}
				break;
			case ROUTE_REDIRECT_TO:
				enterOuterAlt(_localctx, 3);
				{
				setState(1215);
				match(ROUTE_REDIRECT_TO);
				setState(1216);
				match(COLON);
				setState(1217);
				match(STRING);
				}
				break;
			case ROUTE_PATH_MATCH:
				enterOuterAlt(_localctx, 4);
				{
				setState(1218);
				match(ROUTE_PATH_MATCH);
				setState(1219);
				match(COLON);
				setState(1220);
				match(STRING);
				}
				break;
			case ROUTE_CHILDREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(1221);
				match(ROUTE_CHILDREN);
				setState(1222);
				match(COLON);
				setState(1223);
				routesArray();
				}
				break;
			case ROUTE_LOAD_CHILDREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(1224);
				match(ROUTE_LOAD_CHILDREN);
				setState(1225);
				match(COLON);
				setState(1230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1226);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(1227);
					arrowFunction();
					}
					break;
				case 3:
					{
					setState(1228);
					callExpression();
					}
					break;
				case 4:
					{
					setState(1229);
					memberChain();
					}
					break;
				}
				}
				break;
			case ROUTE_CAN_ACTIVATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1232);
				match(ROUTE_CAN_ACTIVATE);
				setState(1233);
				match(COLON);
				setState(1234);
				array();
				}
				break;
			case ROUTE_CAN_ACTIVATE_CHILD:
				enterOuterAlt(_localctx, 8);
				{
				setState(1235);
				match(ROUTE_CAN_ACTIVATE_CHILD);
				setState(1236);
				match(COLON);
				setState(1237);
				array();
				}
				break;
			case ROUTE_CAN_DEACTIVATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1238);
				match(ROUTE_CAN_DEACTIVATE);
				setState(1239);
				match(COLON);
				setState(1240);
				array();
				}
				break;
			case ROUTE_CAN_MATCH:
				enterOuterAlt(_localctx, 10);
				{
				setState(1241);
				match(ROUTE_CAN_MATCH);
				setState(1242);
				match(COLON);
				setState(1243);
				array();
				}
				break;
			case ROUTE_RESOLVE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1244);
				match(ROUTE_RESOLVE);
				setState(1245);
				match(COLON);
				setState(1246);
				object();
				}
				break;
			case ROUTE_DATA:
				enterOuterAlt(_localctx, 12);
				{
				setState(1247);
				match(ROUTE_DATA);
				setState(1248);
				match(COLON);
				setState(1249);
				object();
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
	public static class RouterModuleCallContext extends ParserRuleContext {
		public TerminalNode ROUTER_MODULE() { return getToken(AngularParser.ROUTER_MODULE, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode FOR_ROOT() { return getToken(AngularParser.FOR_ROOT, 0); }
		public TerminalNode FOR_CHILD() { return getToken(AngularParser.FOR_CHILD, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public RouterModuleCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerModuleCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouterModuleCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouterModuleCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouterModuleCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RouterModuleCallContext routerModuleCall() throws RecognitionException {
		RouterModuleCallContext _localctx = new RouterModuleCallContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_routerModuleCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			match(ROUTER_MODULE);
			setState(1253);
			match(DOT);
			setState(1254);
			_la = _input.LA(1);
			if ( !(_la==FOR_ROOT || _la==FOR_CHILD) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1255);
			match(LPAREN);
			setState(1257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(1256);
				parameterList();
				}
			}

			setState(1259);
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
	public static class NavigationStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode NAVIGATE() { return getToken(AngularParser.NAVIGATE, 0); }
		public TerminalNode NAVIGATE_BY_URL() { return getToken(AngularParser.NAVIGATE_BY_URL, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public NavigationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNavigationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNavigationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNavigationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavigationStatementContext navigationStatement() throws RecognitionException {
		NavigationStatementContext _localctx = new NavigationStatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_navigationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(1261);
				match(THIS);
				setState(1262);
				match(DOT);
				}
			}

			setState(1265);
			match(IDENTIFIER);
			setState(1266);
			match(DOT);
			setState(1267);
			_la = _input.LA(1);
			if ( !(_la==NAVIGATE || _la==NAVIGATE_BY_URL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1268);
			match(LPAREN);
			setState(1270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(1269);
				parameterList();
				}
			}

			setState(1272);
			match(RPAREN);
			setState(1274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1273);
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
	public static class ActionDeclarationContext extends ParserRuleContext {
		public VarHelperContext varHelper() {
			return getRuleContext(VarHelperContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode CREATE_ACTION() { return getToken(AngularParser.CREATE_ACTION, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
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
		enterRule(_localctx, 188, RULE_actionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1276);
			varHelper();
			setState(1277);
			match(IDENTIFIER);
			setState(1280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1278);
				match(COLON);
				setState(1279);
				typeAnnotation();
				}
			}

			setState(1282);
			match(ASSIGN);
			setState(1283);
			match(CREATE_ACTION);
			setState(1284);
			match(LPAREN);
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(1285);
				parameterList();
				}
			}

			setState(1288);
			match(RPAREN);
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1289);
				match(SEMI);
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
	public static class ReducerDeclarationContext extends ParserRuleContext {
		public VarHelperContext varHelper() {
			return getRuleContext(VarHelperContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode CREATE_REDUCER() { return getToken(AngularParser.CREATE_REDUCER, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ReducerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reducerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterReducerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitReducerDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitReducerDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReducerDeclarationContext reducerDeclaration() throws RecognitionException {
		ReducerDeclarationContext _localctx = new ReducerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_reducerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			varHelper();
			setState(1293);
			match(IDENTIFIER);
			setState(1296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1294);
				match(COLON);
				setState(1295);
				typeAnnotation();
				}
			}

			setState(1298);
			match(ASSIGN);
			setState(1299);
			match(CREATE_REDUCER);
			setState(1300);
			match(LPAREN);
			setState(1302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(1301);
				parameterList();
				}
			}

			setState(1304);
			match(RPAREN);
			setState(1306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1305);
				match(SEMI);
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
	public static class EffectDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public TerminalNode CREATE_EFFECT() { return getToken(AngularParser.CREATE_EFFECT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public CallExpressionContext callExpression() {
			return getRuleContext(CallExpressionContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode QUES() { return getToken(AngularParser.QUES, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
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
		enterRule(_localctx, 192, RULE_effectDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0) {
				{
				setState(1308);
				accessModifier();
				}
			}

			setState(1311);
			match(IDENTIFIER);
			setState(1313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUES) {
				{
				setState(1312);
				match(QUES);
				}
			}

			setState(1317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(1315);
				match(COLON);
				setState(1316);
				typeAnnotation();
				}
			}

			setState(1319);
			match(ASSIGN);
			setState(1320);
			match(CREATE_EFFECT);
			setState(1321);
			match(LPAREN);
			setState(1324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				{
				setState(1322);
				arrowFunction();
				}
				break;
			case 2:
				{
				setState(1323);
				callExpression();
				}
				break;
			}
			setState(1326);
			match(RPAREN);
			setState(1328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1327);
				match(SEMI);
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
	public static class StoreModuleCallContext extends ParserRuleContext {
		public TerminalNode STORE_MODULE() { return getToken(AngularParser.STORE_MODULE, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode FOR_ROOT() { return getToken(AngularParser.FOR_ROOT, 0); }
		public TerminalNode FOR_FEATURE() { return getToken(AngularParser.FOR_FEATURE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public StoreModuleCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storeModuleCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStoreModuleCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStoreModuleCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStoreModuleCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoreModuleCallContext storeModuleCall() throws RecognitionException {
		StoreModuleCallContext _localctx = new StoreModuleCallContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_storeModuleCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1330);
			match(STORE_MODULE);
			setState(1331);
			match(DOT);
			setState(1332);
			_la = _input.LA(1);
			if ( !(_la==FOR_ROOT || _la==FOR_FEATURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1333);
			match(LPAREN);
			setState(1335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(1334);
				parameterList();
				}
			}

			setState(1337);
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
	public static class EffectsModuleCallContext extends ParserRuleContext {
		public TerminalNode EFFECTS_MODULE() { return getToken(AngularParser.EFFECTS_MODULE, 0); }
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode FOR_ROOT() { return getToken(AngularParser.FOR_ROOT, 0); }
		public TerminalNode FOR_FEATURE() { return getToken(AngularParser.FOR_FEATURE, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public EffectsModuleCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectsModuleCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEffectsModuleCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEffectsModuleCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEffectsModuleCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectsModuleCallContext effectsModuleCall() throws RecognitionException {
		EffectsModuleCallContext _localctx = new EffectsModuleCallContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_effectsModuleCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339);
			match(EFFECTS_MODULE);
			setState(1340);
			match(DOT);
			setState(1341);
			_la = _input.LA(1);
			if ( !(_la==FOR_ROOT || _la==FOR_FEATURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1342);
			match(LPAREN);
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(1343);
				parameterList();
				}
			}

			setState(1346);
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
	public static class StoreDispatchStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public TerminalNode DISPATCH() { return getToken(AngularParser.DISPATCH, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public StoreDispatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storeDispatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStoreDispatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStoreDispatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStoreDispatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoreDispatchStatementContext storeDispatchStatement() throws RecognitionException {
		StoreDispatchStatementContext _localctx = new StoreDispatchStatementContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_storeDispatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(1348);
				match(THIS);
				setState(1349);
				match(DOT);
				}
			}

			setState(1352);
			match(IDENTIFIER);
			setState(1353);
			match(DOT);
			setState(1354);
			match(DISPATCH);
			setState(1355);
			match(LPAREN);
			setState(1357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(1356);
				parameterList();
				}
			}

			setState(1359);
			match(RPAREN);
			setState(1361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1360);
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
	public static class StoreSelectExpressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public List<TerminalNode> DOT() { return getTokens(AngularParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AngularParser.DOT, i);
		}
		public TerminalNode SELECT() { return getToken(AngularParser.SELECT, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode THIS() { return getToken(AngularParser.THIS, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public StoreSelectExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storeSelectExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStoreSelectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStoreSelectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStoreSelectExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StoreSelectExpressionContext storeSelectExpression() throws RecognitionException {
		StoreSelectExpressionContext _localctx = new StoreSelectExpressionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_storeSelectExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THIS) {
				{
				setState(1363);
				match(THIS);
				setState(1364);
				match(DOT);
				}
			}

			setState(1367);
			match(IDENTIFIER);
			setState(1368);
			match(DOT);
			setState(1369);
			match(SELECT);
			setState(1370);
			match(LPAREN);
			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 35184472752191L) != 0 || (((_la - 120)) & ~0x3f) == 0 && ((1L << (_la - 120)) & 260068483L) != 0) {
				{
				setState(1371);
				parameterList();
				}
			}

			setState(1374);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 73:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 15);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 20);
		case 8:
			return precpred(_ctx, 19);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00a9\u0561\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"c\u0002d\u0007d\u0001\u0000\u0005\u0000\u00cc\b\u0000\n\u0000\f\u0000"+
		"\u00cf\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00d3\b\u0000\n\u0000"+
		"\f\u0000\u00d6\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00e1\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00ec\b\u0005"+
		"\n\u0005\f\u0005\u00ef\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005\u00f5\b\u0005\n\u0005\f\u0005\u00f8\t\u0005\u0001\u0005"+
		"\u0003\u0005\u00fb\b\u0005\u0003\u0005\u00fd\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u0103\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0115\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u011b\b\t\u0001\t\u0001\t\u0003\t\u011f"+
		"\b\t\u0001\t\u0003\t\u0122\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0129\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u012f\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u0134\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u013d\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0142\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u014a\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u014e\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0152\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0157\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u015c\b\u000f\n\u000f\f\u000f\u015f\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0167\b\u0010\u0001\u0010\u0003\u0010\u016a\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u0172\b\u0011\n\u0011\f\u0011\u0175\t\u0011\u0001\u0011\u0003\u0011"+
		"\u0178\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0189\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u018f\b\u0013"+
		"\u0001\u0013\u0003\u0013\u0192\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u019a\b\u0014\n\u0014"+
		"\f\u0014\u019d\t\u0014\u0001\u0014\u0003\u0014\u01a0\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01c6\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u01cc\b\u0016\u0001\u0016\u0003\u0016\u01cf\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01d7"+
		"\b\u0017\n\u0017\f\u0017\u01da\t\u0017\u0001\u0017\u0003\u0017\u01dd\b"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0003\u0018\u01e5\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u01eb\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01f3\b\u001a\u0001\u001a\u0003"+
		"\u001a\u01f6\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u01fe\b\u001b\n\u001b\f\u001b\u0201\t\u001b"+
		"\u0001\u001b\u0003\u001b\u0204\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u020e\b\u001d\u0001\u001d\u0003\u001d\u0211\b\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u0219"+
		"\b\u001e\n\u001e\f\u001e\u021c\t\u001e\u0001\u001e\u0003\u001e\u021f\b"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0003 \u0226"+
		"\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u022e\b \n \f \u0231"+
		"\t \u0003 \u0233\b \u0001 \u0001 \u0001 \u0001 \u0005 \u0239\b \n \f "+
		"\u023c\t \u0003 \u023e\b \u0001 \u0001 \u0001 \u0001 \u0001!\u0005!\u0245"+
		"\b!\n!\f!\u0248\t!\u0001!\u0003!\u024b\b!\u0001!\u0001!\u0001!\u0001!"+
		"\u0005!\u0251\b!\n!\f!\u0254\t!\u0001\"\u0005\"\u0257\b\"\n\"\f\"\u025a"+
		"\t\"\u0001\"\u0003\"\u025d\b\"\u0001\"\u0001\"\u0003\"\u0261\b\"\u0001"+
		"\"\u0001\"\u0003\"\u0265\b\"\u0001\"\u0001\"\u0003\"\u0269\b\"\u0001\""+
		"\u0001\"\u0001#\u0005#\u026e\b#\n#\f#\u0271\t#\u0001#\u0001#\u0001#\u0003"+
		"#\u0276\b#\u0001#\u0001#\u0001#\u0003#\u027b\b#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0003$\u0282\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0005"+
		"%\u028a\b%\n%\f%\u028d\t%\u0001&\u0003&\u0290\b&\u0001&\u0001&\u0001&"+
		"\u0001&\u0001&\u0001&\u0005&\u0298\b&\n&\f&\u029b\t&\u0003&\u029d\b&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001\'\u0005\'\u02a4\b\'\n\'\f\'\u02a7\t\'\u0001"+
		"(\u0001(\u0003(\u02ab\b(\u0001(\u0001(\u0001(\u0001(\u0001)\u0003)\u02b2"+
		"\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0005"+
		"*\u02bd\b*\n*\f*\u02c0\t*\u0001*\u0003*\u02c3\b*\u0001+\u0001+\u0001+"+
		"\u0003+\u02c8\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0003,\u02d4\b,\u0001,\u0001,\u0001,\u0003,\u02d9\b,\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u02e5\b.\u0001.\u0001.\u0003.\u02e9\b.\u0001/\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00010\u00010\u00011\u00011\u00051\u02f5\b1\n1\f1\u02f8\t1\u0001"+
		"1\u00031\u02fb\b1\u00012\u00012\u00012\u00012\u00012\u00012\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00015\u0001"+
		"5\u00035\u030f\b5\u00016\u00016\u00016\u00036\u0314\b6\u00016\u00016\u0001"+
		"6\u00017\u00017\u00017\u00037\u031c\b7\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00037\u0325\b7\u00017\u00017\u00018\u00018\u00018\u0003"+
		"8\u032c\b8\u00018\u00018\u00038\u0330\b8\u00018\u00018\u00038\u0334\b"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00038\u0358\b8\u00019\u00019\u00019\u0005"+
		"9\u035d\b9\n9\f9\u0360\t9\u0001:\u0001:\u0001;\u0005;\u0365\b;\n;\f;\u0368"+
		"\t;\u0001;\u0003;\u036b\b;\u0001;\u0001;\u0001;\u0003;\u0370\b;\u0001"+
		";\u0001;\u0003;\u0374\b;\u0001<\u0001<\u0001<\u0001<\u0005<\u037a\b<\n"+
		"<\f<\u037d\t<\u0003<\u037f\b<\u0001<\u0003<\u0382\b<\u0001<\u0001<\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u038c\b=\u0001>\u0001>\u0003"+
		">\u0390\b>\u0001>\u0001>\u0001?\u0001?\u0001?\u0005?\u0397\b?\n?\f?\u039a"+
		"\t?\u0001?\u0003?\u039d\b?\u0001@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001"+
		"A\u0003A\u03a6\bA\u0001A\u0001A\u0003A\u03aa\bA\u0001A\u0001A\u0001B\u0001"+
		"B\u0003B\u03b0\bB\u0001B\u0001B\u0003B\u03b4\bB\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001D\u0001D\u0001D\u0005D\u03be\bD\nD\fD\u03c1\tD\u0001E\u0001"+
		"E\u0001E\u0003E\u03c6\bE\u0001E\u0001E\u0001F\u0001F\u0001G\u0001G\u0003"+
		"G\u03ce\bG\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0003I\u03e6\bI\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0005I\u0404\bI\nI\fI\u0407\tI\u0001J\u0001J\u0001"+
		"J\u0001J\u0005J\u040d\bJ\nJ\fJ\u0410\tJ\u0001J\u0001J\u0001K\u0001K\u0001"+
		"K\u0001K\u0001K\u0005K\u0419\bK\nK\fK\u041c\tK\u0001K\u0001K\u0001K\u0001"+
		"K\u0003K\u0422\bK\u0001L\u0001L\u0001M\u0001M\u0005M\u0428\bM\nM\fM\u042b"+
		"\tM\u0001M\u0001M\u0001N\u0001N\u0005N\u0431\bN\nN\fN\u0434\tN\u0001N"+
		"\u0001N\u0001N\u0001N\u0003N\u043a\bN\u0001O\u0003O\u043d\bO\u0001O\u0001"+
		"O\u0005O\u0441\bO\nO\fO\u0444\tO\u0001O\u0001O\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001Q\u0001Q\u0001Q\u0005Q\u0450\bQ\nQ\fQ\u0453\tQ\u0001Q\u0001"+
		"Q\u0001Q\u0001R\u0001R\u0001R\u0003R\u045b\bR\u0003R\u045d\bR\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u0472\bS\u0001"+
		"S\u0003S\u0475\bS\u0001T\u0001T\u0003T\u0479\bT\u0001T\u0001T\u0001T\u0001"+
		"T\u0005T\u047f\bT\nT\fT\u0482\tT\u0003T\u0484\bT\u0001T\u0001T\u0001U"+
		"\u0001U\u0001U\u0003U\u048b\bU\u0001V\u0001V\u0001W\u0001W\u0001X\u0001"+
		"X\u0001X\u0001X\u0003X\u0495\bX\u0001X\u0001X\u0001X\u0003X\u049a\bX\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0005Y\u04a0\bY\nY\fY\u04a3\tY\u0003Y\u04a5\bY"+
		"\u0001Y\u0003Y\u04a8\bY\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001Z\u0005"+
		"Z\u04b0\bZ\nZ\fZ\u04b3\tZ\u0001Z\u0003Z\u04b6\bZ\u0001Z\u0001Z\u0001["+
		"\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001"+
		"[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001"+
		"[\u0003[\u04cf\b[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001"+
		"[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001"+
		"[\u0003[\u04e3\b[\u0001\\\u0001\\\u0001\\\u0001\\\u0001\\\u0003\\\u04ea"+
		"\b\\\u0001\\\u0001\\\u0001]\u0001]\u0003]\u04f0\b]\u0001]\u0001]\u0001"+
		"]\u0001]\u0001]\u0003]\u04f7\b]\u0001]\u0001]\u0003]\u04fb\b]\u0001^\u0001"+
		"^\u0001^\u0001^\u0003^\u0501\b^\u0001^\u0001^\u0001^\u0001^\u0003^\u0507"+
		"\b^\u0001^\u0001^\u0003^\u050b\b^\u0001_\u0001_\u0001_\u0001_\u0003_\u0511"+
		"\b_\u0001_\u0001_\u0001_\u0001_\u0003_\u0517\b_\u0001_\u0001_\u0003_\u051b"+
		"\b_\u0001`\u0003`\u051e\b`\u0001`\u0001`\u0003`\u0522\b`\u0001`\u0001"+
		"`\u0003`\u0526\b`\u0001`\u0001`\u0001`\u0001`\u0001`\u0003`\u052d\b`\u0001"+
		"`\u0001`\u0003`\u0531\b`\u0001a\u0001a\u0001a\u0001a\u0001a\u0003a\u0538"+
		"\ba\u0001a\u0001a\u0001b\u0001b\u0001b\u0001b\u0001b\u0003b\u0541\bb\u0001"+
		"b\u0001b\u0001c\u0001c\u0003c\u0547\bc\u0001c\u0001c\u0001c\u0001c\u0001"+
		"c\u0003c\u054e\bc\u0001c\u0001c\u0003c\u0552\bc\u0001d\u0001d\u0003d\u0556"+
		"\bd\u0001d\u0001d\u0001d\u0001d\u0001d\u0003d\u055d\bd\u0001d\u0001d\u0001"+
		"d\u0000\u0001\u0092e\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u0000\u0010\u0001\u0000\u001a\u001c\u0001\u0000\u001d"+
		"\u001e\u0002\u0000$$&&\u0001\u0000\u008f\u0092\u0001\u0000bd\u0001\u0000"+
		"`a\u0001\u0000VY\u0002\u0000ZZ\\_\u0001\u0000\u0092\u0093\u0001\u0000"+
		"13\u0001\u0000\u0098\u0099\u0002\u0000\u009a\u009a\u00a5\u00a5\u0001\u0000"+
		"\u00a0\u00a2\u0001\u000067\u0001\u00009:\u0002\u000066II\u05ef\u0000\u00cd"+
		"\u0001\u0000\u0000\u0000\u0002\u00d7\u0001\u0000\u0000\u0000\u0004\u00e0"+
		"\u0001\u0000\u0000\u0000\u0006\u00e2\u0001\u0000\u0000\u0000\b\u00e4\u0001"+
		"\u0000\u0000\u0000\n\u00ed\u0001\u0000\u0000\u0000\f\u0102\u0001\u0000"+
		"\u0000\u0000\u000e\u0104\u0001\u0000\u0000\u0000\u0010\u0114\u0001\u0000"+
		"\u0000\u0000\u0012\u0116\u0001\u0000\u0000\u0000\u0014\u0123\u0001\u0000"+
		"\u0000\u0000\u0016\u0128\u0001\u0000\u0000\u0000\u0018\u012a\u0001\u0000"+
		"\u0000\u0000\u001a\u0139\u0001\u0000\u0000\u0000\u001c\u014d\u0001\u0000"+
		"\u0000\u0000\u001e\u0158\u0001\u0000\u0000\u0000 \u0162\u0001\u0000\u0000"+
		"\u0000\"\u016e\u0001\u0000\u0000\u0000$\u0188\u0001\u0000\u0000\u0000"+
		"&\u018a\u0001\u0000\u0000\u0000(\u0196\u0001\u0000\u0000\u0000*\u01c5"+
		"\u0001\u0000\u0000\u0000,\u01c7\u0001\u0000\u0000\u0000.\u01d3\u0001\u0000"+
		"\u0000\u00000\u01e4\u0001\u0000\u0000\u00002\u01e6\u0001\u0000\u0000\u0000"+
		"4\u01ee\u0001\u0000\u0000\u00006\u01fa\u0001\u0000\u0000\u00008\u0205"+
		"\u0001\u0000\u0000\u0000:\u0209\u0001\u0000\u0000\u0000<\u0215\u0001\u0000"+
		"\u0000\u0000>\u0220\u0001\u0000\u0000\u0000@\u0225\u0001\u0000\u0000\u0000"+
		"B\u0246\u0001\u0000\u0000\u0000D\u0258\u0001\u0000\u0000\u0000F\u026f"+
		"\u0001\u0000\u0000\u0000H\u027e\u0001\u0000\u0000\u0000J\u028b\u0001\u0000"+
		"\u0000\u0000L\u028f\u0001\u0000\u0000\u0000N\u02a5\u0001\u0000\u0000\u0000"+
		"P\u02a8\u0001\u0000\u0000\u0000R\u02b1\u0001\u0000\u0000\u0000T\u02b9"+
		"\u0001\u0000\u0000\u0000V\u02c4\u0001\u0000\u0000\u0000X\u02d8\u0001\u0000"+
		"\u0000\u0000Z\u02da\u0001\u0000\u0000\u0000\\\u02df\u0001\u0000\u0000"+
		"\u0000^\u02ea\u0001\u0000\u0000\u0000`\u02ee\u0001\u0000\u0000\u0000b"+
		"\u02f2\u0001\u0000\u0000\u0000d\u02fc\u0001\u0000\u0000\u0000f\u0302\u0001"+
		"\u0000\u0000\u0000h\u0309\u0001\u0000\u0000\u0000j\u030e\u0001\u0000\u0000"+
		"\u0000l\u0310\u0001\u0000\u0000\u0000n\u0318\u0001\u0000\u0000\u0000p"+
		"\u0357\u0001\u0000\u0000\u0000r\u0359\u0001\u0000\u0000\u0000t\u0361\u0001"+
		"\u0000\u0000\u0000v\u0366\u0001\u0000\u0000\u0000x\u0375\u0001\u0000\u0000"+
		"\u0000z\u038b\u0001\u0000\u0000\u0000|\u038d\u0001\u0000\u0000\u0000~"+
		"\u0393\u0001\u0000\u0000\u0000\u0080\u039e\u0001\u0000\u0000\u0000\u0082"+
		"\u03a2\u0001\u0000\u0000\u0000\u0084\u03b3\u0001\u0000\u0000\u0000\u0086"+
		"\u03b5\u0001\u0000\u0000\u0000\u0088\u03ba\u0001\u0000\u0000\u0000\u008a"+
		"\u03c2\u0001\u0000\u0000\u0000\u008c\u03c9\u0001\u0000\u0000\u0000\u008e"+
		"\u03cd\u0001\u0000\u0000\u0000\u0090\u03cf\u0001\u0000\u0000\u0000\u0092"+
		"\u03e5\u0001\u0000\u0000\u0000\u0094\u0408\u0001\u0000\u0000\u0000\u0096"+
		"\u0421\u0001\u0000\u0000\u0000\u0098\u0423\u0001\u0000\u0000\u0000\u009a"+
		"\u0425\u0001\u0000\u0000\u0000\u009c\u0439\u0001\u0000\u0000\u0000\u009e"+
		"\u043c\u0001\u0000\u0000\u0000\u00a0\u0447\u0001\u0000\u0000\u0000\u00a2"+
		"\u044c\u0001\u0000\u0000\u0000\u00a4\u045c\u0001\u0000\u0000\u0000\u00a6"+
		"\u0474\u0001\u0000\u0000\u0000\u00a8\u0478\u0001\u0000\u0000\u0000\u00aa"+
		"\u0487\u0001\u0000\u0000\u0000\u00ac\u048c\u0001\u0000\u0000\u0000\u00ae"+
		"\u048e\u0001\u0000\u0000\u0000\u00b0\u0490\u0001\u0000\u0000\u0000\u00b2"+
		"\u049b\u0001\u0000\u0000\u0000\u00b4\u04ab\u0001\u0000\u0000\u0000\u00b6"+
		"\u04e2\u0001\u0000\u0000\u0000\u00b8\u04e4\u0001\u0000\u0000\u0000\u00ba"+
		"\u04ef\u0001\u0000\u0000\u0000\u00bc\u04fc\u0001\u0000\u0000\u0000\u00be"+
		"\u050c\u0001\u0000\u0000\u0000\u00c0\u051d\u0001\u0000\u0000\u0000\u00c2"+
		"\u0532\u0001\u0000\u0000\u0000\u00c4\u053b\u0001\u0000\u0000\u0000\u00c6"+
		"\u0546\u0001\u0000\u0000\u0000\u00c8\u0555\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cc\u0003\u0002\u0001\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d4\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d3\u0003\u0010\b\u0000\u00d1\u00d3"+
		"\u0003X,\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u0001\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0017"+
		"\u0000\u0000\u00d8\u00d9\u0003\u0004\u0002\u0000\u00d9\u00da\u0005\u0018"+
		"\u0000\u0000\u00da\u00db\u0005\u008f\u0000\u0000\u00db\u00dc\u0005z\u0000"+
		"\u0000\u00dc\u0003\u0001\u0000\u0000\u0000\u00dd\u00e1\u0003\u0006\u0003"+
		"\u0000\u00de\u00e1\u0003\b\u0004\u0000\u00df\u00e1\u0003\n\u0005\u0000"+
		"\u00e0\u00dd\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000"+
		"\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u0005\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0005\u0093\u0000\u0000\u00e3\u0007\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0005b\u0000\u0000\u00e5\u00e6\u0005\u0019\u0000\u0000\u00e6"+
		"\u00e7\u0005\u0093\u0000\u0000\u00e7\t\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0003\f\u0006\u0000\u00e9\u00ea\u0005|\u0000\u0000\u00ea\u00ec\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e8\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001"+
		"\u0000\u0000\u0000\u00f0\u00fc\u0005\u0084\u0000\u0000\u00f1\u00f6\u0003"+
		"\f\u0006\u0000\u00f2\u00f3\u0005|\u0000\u0000\u00f3\u00f5\u0003\f\u0006"+
		"\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fb\u0005|\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fc\u00f1\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\u0085\u0000\u0000"+
		"\u00ff\u000b\u0001\u0000\u0000\u0000\u0100\u0103\u0005\u0093\u0000\u0000"+
		"\u0101\u0103\u0003\u000e\u0007\u0000\u0102\u0100\u0001\u0000\u0000\u0000"+
		"\u0102\u0101\u0001\u0000\u0000\u0000\u0103\r\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0007\u0000\u0000\u0000\u0105\u000f\u0001\u0000\u0000\u0000\u0106"+
		"\u0115\u0003 \u0010\u0000\u0107\u0115\u0003&\u0013\u0000\u0108\u0115\u0003"+
		"4\u001a\u0000\u0109\u0115\u0003:\u001d\u0000\u010a\u0115\u0003,\u0016"+
		"\u0000\u010b\u0115\u0003L&\u0000\u010c\u0115\u0003@ \u0000\u010d\u0115"+
		"\u0003R)\u0000\u010e\u0115\u0003\u0012\t\u0000\u010f\u0115\u0003\u0016"+
		"\u000b\u0000\u0110\u0115\u0003\u00bc^\u0000\u0111\u0115\u0003\u00be_\u0000"+
		"\u0112\u0115\u0003\u00c0`\u0000\u0113\u0115\u0003\u00b0X\u0000\u0114\u0106"+
		"\u0001\u0000\u0000\u0000\u0114\u0107\u0001\u0000\u0000\u0000\u0114\u0108"+
		"\u0001\u0000\u0000\u0000\u0114\u0109\u0001\u0000\u0000\u0000\u0114\u010a"+
		"\u0001\u0000\u0000\u0000\u0114\u010b\u0001\u0000\u0000\u0000\u0114\u010c"+
		"\u0001\u0000\u0000\u0000\u0114\u010d\u0001\u0000\u0000\u0000\u0114\u010e"+
		"\u0001\u0000\u0000\u0000\u0114\u010f\u0001\u0000\u0000\u0000\u0114\u0110"+
		"\u0001\u0000\u0000\u0000\u0114\u0111\u0001\u0000\u0000\u0000\u0114\u0112"+
		"\u0001\u0000\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u0011"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0003\u0014\n\u0000\u0117\u011a\u0005"+
		"\u0093\u0000\u0000\u0118\u0119\u0005{\u0000\u0000\u0119\u011b\u0003\u0096"+
		"K\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000"+
		"\u0000\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011d\u0005Z\u0000\u0000"+
		"\u011d\u011f\u0003\u008cF\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0001\u0000\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120"+
		"\u0122\u0005z\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0001\u0000\u0000\u0000\u0122\u0013\u0001\u0000\u0000\u0000\u0123\u0124"+
		"\u0007\u0001\u0000\u0000\u0124\u0015\u0001\u0000\u0000\u0000\u0125\u0129"+
		"\u0003\u0018\f\u0000\u0126\u0129\u0003\u001a\r\u0000\u0127\u0129\u0003"+
		"\u001c\u000e\u0000\u0128\u0125\u0001\u0000\u0000\u0000\u0128\u0126\u0001"+
		"\u0000\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000\u0129\u0017\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u00050\u0000\u0000\u012b\u012c\u0005\u0093"+
		"\u0000\u0000\u012c\u012e\u0005\u0082\u0000\u0000\u012d\u012f\u0003r9\u0000"+
		"\u012e\u012d\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0133\u0005\u0083\u0000\u0000"+
		"\u0131\u0132\u0005{\u0000\u0000\u0132\u0134\u0003\u0096K\u0000\u0133\u0131"+
		"\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0084\u0000\u0000\u0136\u0137"+
		"\u0003\u001e\u000f\u0000\u0137\u0138\u0005\u0085\u0000\u0000\u0138\u0019"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u00050\u0000\u0000\u013a\u013c\u0005"+
		"\u0082\u0000\u0000\u013b\u013d\u0003r9\u0000\u013c\u013b\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000"+
		"\u0000\u013e\u0141\u0005\u0083\u0000\u0000\u013f\u0140\u0005{\u0000\u0000"+
		"\u0140\u0142\u0003\u0096K\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0005\u0084\u0000\u0000\u0144\u0145\u0003\u001e\u000f\u0000\u0145"+
		"\u0146\u0005\u0085\u0000\u0000\u0146\u001b\u0001\u0000\u0000\u0000\u0147"+
		"\u0149\u0005\u0082\u0000\u0000\u0148\u014a\u0003r9\u0000\u0149\u0148\u0001"+
		"\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014b\u0001"+
		"\u0000\u0000\u0000\u014b\u014e\u0005\u0083\u0000\u0000\u014c\u014e\u0005"+
		"\u0093\u0000\u0000\u014d\u0147\u0001\u0000\u0000\u0000\u014d\u014c\u0001"+
		"\u0000\u0000\u0000\u014e\u0151\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		"{\u0000\u0000\u0150\u0152\u0003\u0096K\u0000\u0151\u014f\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000"+
		"\u0000\u0153\u0156\u0005v\u0000\u0000\u0154\u0157\u0003X,\u0000\u0155"+
		"\u0157\u0003\u001e\u000f\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156"+
		"\u0155\u0001\u0000\u0000\u0000\u0157\u001d\u0001\u0000\u0000\u0000\u0158"+
		"\u015d\u0005\u0084\u0000\u0000\u0159\u015c\u0003X,\u0000\u015a\u015c\u0003"+
		"\u0012\t\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015a\u0001\u0000"+
		"\u0000\u0000\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000"+
		"\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0160\u0001\u0000"+
		"\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0161\u0005\u0085"+
		"\u0000\u0000\u0161\u001f\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u0005"+
		"\u0000\u0000\u0163\u0169\u0005\u0082\u0000\u0000\u0164\u0166\u0005\u0084"+
		"\u0000\u0000\u0165\u0167\u0003\"\u0011\u0000\u0166\u0165\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000"+
		"\u0000\u0168\u016a\u0005\u0085\u0000\u0000\u0169\u0164\u0001\u0000\u0000"+
		"\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0005\u0083\u0000\u0000\u016c\u016d\u0003@ \u0000\u016d"+
		"!\u0001\u0000\u0000\u0000\u016e\u0173\u0003$\u0012\u0000\u016f\u0170\u0005"+
		"|\u0000\u0000\u0170\u0172\u0003$\u0012\u0000\u0171\u016f\u0001\u0000\u0000"+
		"\u0000\u0172\u0175\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000\u0000"+
		"\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000"+
		"\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0178\u0005|\u0000\u0000"+
		"\u0177\u0176\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000"+
		"\u0178#\u0001\u0000\u0000\u0000\u0179\u017a\u0005\u0015\u0000\u0000\u017a"+
		"\u017b\u0005{\u0000\u0000\u017b\u0189\u0003x<\u0000\u017c\u017d\u0005"+
		"\u0013\u0000\u0000\u017d\u017e\u0005{\u0000\u0000\u017e\u0189\u0003x<"+
		"\u0000\u017f\u0180\u0005\u000f\u0000\u0000\u0180\u0181\u0005{\u0000\u0000"+
		"\u0181\u0189\u0003x<\u0000\u0182\u0183\u0005\u0010\u0000\u0000\u0183\u0184"+
		"\u0005{\u0000\u0000\u0184\u0189\u0003x<\u0000\u0185\u0186\u0005\u0014"+
		"\u0000\u0000\u0186\u0187\u0005{\u0000\u0000\u0187\u0189\u0003x<\u0000"+
		"\u0188\u0179\u0001\u0000\u0000\u0000\u0188\u017c\u0001\u0000\u0000\u0000"+
		"\u0188\u017f\u0001\u0000\u0000\u0000\u0188\u0182\u0001\u0000\u0000\u0000"+
		"\u0188\u0185\u0001\u0000\u0000\u0000\u0189%\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0005\u0006\u0000\u0000\u018b\u0191\u0005\u0082\u0000\u0000\u018c"+
		"\u018e\u0005\u0084\u0000\u0000\u018d\u018f\u0003(\u0014\u0000\u018e\u018d"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0190"+
		"\u0001\u0000\u0000\u0000\u0190\u0192\u0005\u0085\u0000\u0000\u0191\u018c"+
		"\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193"+
		"\u0001\u0000\u0000\u0000\u0193\u0194\u0005\u0083\u0000\u0000\u0194\u0195"+
		"\u0003@ \u0000\u0195\'\u0001\u0000\u0000\u0000\u0196\u019b\u0003*\u0015"+
		"\u0000\u0197\u0198\u0005|\u0000\u0000\u0198\u019a\u0003*\u0015\u0000\u0199"+
		"\u0197\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000\u0000\u0000\u019b"+
		"\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c"+
		"\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019e"+
		"\u01a0\u0005|\u0000\u0000\u019f\u019e\u0001\u0000\u0000\u0000\u019f\u01a0"+
		"\u0001\u0000\u0000\u0000\u01a0)\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005"+
		"\n\u0000\u0000\u01a2\u01a3\u0005{\u0000\u0000\u01a3\u01c6\u0005\u008f"+
		"\u0000\u0000\u01a4\u01a5\u0005\u000b\u0000\u0000\u01a5\u01a6\u0005{\u0000"+
		"\u0000\u01a6\u01c6\u0005\u008f\u0000\u0000\u01a7\u01a8\u0005\f\u0000\u0000"+
		"\u01a8\u01a9\u0005{\u0000\u0000\u01a9\u01c6\u0003\u009aM\u0000\u01aa\u01ab"+
		"\u0005\r\u0000\u0000\u01ab\u01ac\u0005{\u0000\u0000\u01ac\u01c6\u0003"+
		"x<\u0000\u01ad\u01ae\u0005\u000e\u0000\u0000\u01ae\u01af\u0005{\u0000"+
		"\u0000\u01af\u01c6\u0003x<\u0000\u01b0\u01b1\u0005\u0016\u0000\u0000\u01b1"+
		"\u01b2\u0005{\u0000\u0000\u01b2\u01c6\u0005\u0091\u0000\u0000\u01b3\u01b4"+
		"\u0005\u0011\u0000\u0000\u01b4\u01b5\u0005{\u0000\u0000\u01b5\u01c6\u0003"+
		"x<\u0000\u01b6\u01b7\u0005\u0012\u0000\u0000\u01b7\u01b8\u0005{\u0000"+
		"\u0000\u01b8\u01c6\u0003x<\u0000\u01b9\u01ba\u0005\u000f\u0000\u0000\u01ba"+
		"\u01bb\u0005{\u0000\u0000\u01bb\u01c6\u0003x<\u0000\u01bc\u01bd\u0005"+
		"\u0010\u0000\u0000\u01bd\u01be\u0005{\u0000\u0000\u01be\u01c6\u0003x<"+
		"\u0000\u01bf\u01c0\u0005\u0014\u0000\u0000\u01c0\u01c1\u0005{\u0000\u0000"+
		"\u01c1\u01c6\u0003x<\u0000\u01c2\u01c3\u0005\u0013\u0000\u0000\u01c3\u01c4"+
		"\u0005{\u0000\u0000\u01c4\u01c6\u0003x<\u0000\u01c5\u01a1\u0001\u0000"+
		"\u0000\u0000\u01c5\u01a4\u0001\u0000\u0000\u0000\u01c5\u01a7\u0001\u0000"+
		"\u0000\u0000\u01c5\u01aa\u0001\u0000\u0000\u0000\u01c5\u01ad\u0001\u0000"+
		"\u0000\u0000\u01c5\u01b0\u0001\u0000\u0000\u0000\u01c5\u01b3\u0001\u0000"+
		"\u0000\u0000\u01c5\u01b6\u0001\u0000\u0000\u0000\u01c5\u01b9\u0001\u0000"+
		"\u0000\u0000\u01c5\u01bc\u0001\u0000\u0000\u0000\u01c5\u01bf\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c2\u0001\u0000\u0000\u0000\u01c6+\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c8\u0005\u0007\u0000\u0000\u01c8\u01ce\u0005\u0082\u0000"+
		"\u0000\u01c9\u01cb\u0005\u0084\u0000\u0000\u01ca\u01cc\u0003.\u0017\u0000"+
		"\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01cf\u0005\u0085\u0000\u0000"+
		"\u01ce\u01c9\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000"+
		"\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005\u0083\u0000\u0000"+
		"\u01d1\u01d2\u0003@ \u0000\u01d2-\u0001\u0000\u0000\u0000\u01d3\u01d8"+
		"\u00030\u0018\u0000\u01d4\u01d5\u0005|\u0000\u0000\u01d5\u01d7\u00030"+
		"\u0018\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000"+
		"\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000"+
		"\u0000\u0000\u01db\u01dd\u0005|\u0000\u0000\u01dc\u01db\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd/\u0001\u0000\u0000\u0000"+
		"\u01de\u01df\u0005\n\u0000\u0000\u01df\u01e0\u0005{\u0000\u0000\u01e0"+
		"\u01e5\u0005\u008f\u0000\u0000\u01e1\u01e2\u0005\u0093\u0000\u0000\u01e2"+
		"\u01e3\u0005{\u0000\u0000\u01e3\u01e5\u0003\u0092I\u0000\u01e4\u01de\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e1\u0001\u0000\u0000\u0000\u01e51\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0005\u007f\u0000\u0000\u01e7\u01e8\u0005\u0093"+
		"\u0000\u0000\u01e8\u01ea\u0005\u0082\u0000\u0000\u01e9\u01eb\u0003r9\u0000"+
		"\u01ea\u01e9\u0001\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005\u0083\u0000\u0000"+
		"\u01ed3\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005\b\u0000\u0000\u01ef"+
		"\u01f5\u0005\u0082\u0000\u0000\u01f0\u01f2\u0005\u0084\u0000\u0000\u01f1"+
		"\u01f3\u00036\u001b\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f2\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f6"+
		"\u0005\u0085\u0000\u0000\u01f5\u01f0\u0001\u0000\u0000\u0000\u01f5\u01f6"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f8"+
		"\u0005\u0083\u0000\u0000\u01f8\u01f9\u0003@ \u0000\u01f95\u0001\u0000"+
		"\u0000\u0000\u01fa\u01ff\u00038\u001c\u0000\u01fb\u01fc\u0005|\u0000\u0000"+
		"\u01fc\u01fe\u00038\u001c\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe"+
		"\u0201\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0001\u0000\u0000\u0000\u0200\u0203\u0001\u0000\u0000\u0000\u0201"+
		"\u01ff\u0001\u0000\u0000\u0000\u0202\u0204\u0005|\u0000\u0000\u0203\u0202"+
		"\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u02047\u0001"+
		"\u0000\u0000\u0000\u0205\u0206\u0005\u0093\u0000\u0000\u0206\u0207\u0005"+
		"{\u0000\u0000\u0207\u0208\u0003\u0092I\u0000\u02089\u0001\u0000\u0000"+
		"\u0000\u0209\u020a\u0005\t\u0000\u0000\u020a\u0210\u0005\u0082\u0000\u0000"+
		"\u020b\u020d\u0005\u0084\u0000\u0000\u020c\u020e\u0003<\u001e\u0000\u020d"+
		"\u020c\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e"+
		"\u020f\u0001\u0000\u0000\u0000\u020f\u0211\u0005\u0085\u0000\u0000\u0210"+
		"\u020b\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211"+
		"\u0212\u0001\u0000\u0000\u0000\u0212\u0213\u0005\u0083\u0000\u0000\u0213"+
		"\u0214\u0003@ \u0000\u0214;\u0001\u0000\u0000\u0000\u0215\u021a\u0003"+
		">\u001f\u0000\u0216\u0217\u0005|\u0000\u0000\u0217\u0219\u0003>\u001f"+
		"\u0000\u0218\u0216\u0001\u0000\u0000\u0000\u0219\u021c\u0001\u0000\u0000"+
		"\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000"+
		"\u0000\u021b\u021e\u0001\u0000\u0000\u0000\u021c\u021a\u0001\u0000\u0000"+
		"\u0000\u021d\u021f\u0005|\u0000\u0000\u021e\u021d\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0001\u0000\u0000\u0000\u021f=\u0001\u0000\u0000\u0000\u0220"+
		"\u0221\u0005\u0093\u0000\u0000\u0221\u0222\u0005{\u0000\u0000\u0222\u0223"+
		"\u0003\u0092I\u0000\u0223?\u0001\u0000\u0000\u0000\u0224\u0226\u0005\'"+
		"\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000"+
		"\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0228\u0005)\u0000"+
		"\u0000\u0228\u0232\u0005\u0093\u0000\u0000\u0229\u022a\u0005+\u0000\u0000"+
		"\u022a\u022f\u0005\u0093\u0000\u0000\u022b\u022c\u0005|\u0000\u0000\u022c"+
		"\u022e\u0005\u0093\u0000\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022e"+
		"\u0231\u0001\u0000\u0000\u0000\u022f\u022d\u0001\u0000\u0000\u0000\u022f"+
		"\u0230\u0001\u0000\u0000\u0000\u0230\u0233\u0001\u0000\u0000\u0000\u0231"+
		"\u022f\u0001\u0000\u0000\u0000\u0232\u0229\u0001\u0000\u0000\u0000\u0232"+
		"\u0233\u0001\u0000\u0000\u0000\u0233\u023d\u0001\u0000\u0000\u0000\u0234"+
		"\u0235\u0005,\u0000\u0000\u0235\u023a\u0005\u0093\u0000\u0000\u0236\u0237"+
		"\u0005|\u0000\u0000\u0237\u0239\u0005\u0093\u0000\u0000\u0238\u0236\u0001"+
		"\u0000\u0000\u0000\u0239\u023c\u0001\u0000\u0000\u0000\u023a\u0238\u0001"+
		"\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023e\u0001"+
		"\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023d\u0234\u0001"+
		"\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f\u0001"+
		"\u0000\u0000\u0000\u023f\u0240\u0005\u0084\u0000\u0000\u0240\u0241\u0003"+
		"B!\u0000\u0241\u0242\u0005\u0085\u0000\u0000\u0242A\u0001\u0000\u0000"+
		"\u0000\u0243\u0245\u0003D\"\u0000\u0244\u0243\u0001\u0000\u0000\u0000"+
		"\u0245\u0248\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000"+
		"\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u024a\u0001\u0000\u0000\u0000"+
		"\u0248\u0246\u0001\u0000\u0000\u0000\u0249\u024b\u0003H$\u0000\u024a\u0249"+
		"\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000\u0000\u0000\u024b\u0252"+
		"\u0001\u0000\u0000\u0000\u024c\u0251\u0003F#\u0000\u024d\u0251\u0003X"+
		",\u0000\u024e\u0251\u0003\u0012\t\u0000\u024f\u0251\u0003\u0016\u000b"+
		"\u0000\u0250\u024c\u0001\u0000\u0000\u0000\u0250\u024d\u0001\u0000\u0000"+
		"\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0250\u024f\u0001\u0000\u0000"+
		"\u0000\u0251\u0254\u0001\u0000\u0000\u0000\u0252\u0250\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253C\u0001\u0000\u0000\u0000"+
		"\u0254\u0252\u0001\u0000\u0000\u0000\u0255\u0257\u00032\u0019\u0000\u0256"+
		"\u0255\u0001\u0000\u0000\u0000\u0257\u025a\u0001\u0000\u0000\u0000\u0258"+
		"\u0256\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259"+
		"\u025c\u0001\u0000\u0000\u0000\u025a\u0258\u0001\u0000\u0000\u0000\u025b"+
		"\u025d\u0003\u0098L\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025c\u025d"+
		"\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u0264"+
		"\u0005\u0093\u0000\u0000\u025f\u0261\u0005~\u0000\u0000\u0260\u025f\u0001"+
		"\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0262\u0001"+
		"\u0000\u0000\u0000\u0262\u0263\u0005{\u0000\u0000\u0263\u0265\u0003\u0096"+
		"K\u0000\u0264\u0260\u0001\u0000\u0000\u0000\u0264\u0265\u0001\u0000\u0000"+
		"\u0000\u0265\u0268\u0001\u0000\u0000\u0000\u0266\u0267\u0005Z\u0000\u0000"+
		"\u0267\u0269\u0003\u008cF\u0000\u0268\u0266\u0001\u0000\u0000\u0000\u0268"+
		"\u0269\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a"+
		"\u026b\u0005z\u0000\u0000\u026bE\u0001\u0000\u0000\u0000\u026c\u026e\u0003"+
		"2\u0019\u0000\u026d\u026c\u0001\u0000\u0000\u0000\u026e\u0271\u0001\u0000"+
		"\u0000\u0000\u026f\u026d\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000"+
		"\u0000\u0000\u0270\u0272\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000"+
		"\u0000\u0000\u0272\u0273\u0005\u0093\u0000\u0000\u0273\u0275\u0005\u0082"+
		"\u0000\u0000\u0274\u0276\u0003r9\u0000\u0275\u0274\u0001\u0000\u0000\u0000"+
		"\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000"+
		"\u0277\u027a\u0005\u0083\u0000\u0000\u0278\u0279\u0005{\u0000\u0000\u0279"+
		"\u027b\u0003\u0096K\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027a\u027b"+
		"\u0001\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027d"+
		"\u0003\u001e\u000f\u0000\u027dG\u0001\u0000\u0000\u0000\u027e\u027f\u0005"+
		"-\u0000\u0000\u027f\u0281\u0005\u0082\u0000\u0000\u0280\u0282\u0003r9"+
		"\u0000\u0281\u0280\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000"+
		"\u0000\u0282\u0283\u0001\u0000\u0000\u0000\u0283\u0284\u0005\u0083\u0000"+
		"\u0000\u0284\u0285\u0005\u0084\u0000\u0000\u0285\u0286\u0003J%\u0000\u0286"+
		"\u0287\u0005\u0085\u0000\u0000\u0287I\u0001\u0000\u0000\u0000\u0288\u028a"+
		"\u0003X,\u0000\u0289\u0288\u0001\u0000\u0000\u0000\u028a\u028d\u0001\u0000"+
		"\u0000\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000"+
		"\u0000\u0000\u028cK\u0001\u0000\u0000\u0000\u028d\u028b\u0001\u0000\u0000"+
		"\u0000\u028e\u0290\u0005\'\u0000\u0000\u028f\u028e\u0001\u0000\u0000\u0000"+
		"\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000"+
		"\u0291\u0292\u0005(\u0000\u0000\u0292\u029c\u0005\u0093\u0000\u0000\u0293"+
		"\u0294\u0005+\u0000\u0000\u0294\u0299\u0005\u0093\u0000\u0000\u0295\u0296"+
		"\u0005|\u0000\u0000\u0296\u0298\u0005\u0093\u0000\u0000\u0297\u0295\u0001"+
		"\u0000\u0000\u0000\u0298\u029b\u0001\u0000\u0000\u0000\u0299\u0297\u0001"+
		"\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029d\u0001"+
		"\u0000\u0000\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029c\u0293\u0001"+
		"\u0000\u0000\u0000\u029c\u029d\u0001\u0000\u0000\u0000\u029d\u029e\u0001"+
		"\u0000\u0000\u0000\u029e\u029f\u0005\u0084\u0000\u0000\u029f\u02a0\u0003"+
		"N\'\u0000\u02a0\u02a1\u0005\u0085\u0000\u0000\u02a1M\u0001\u0000\u0000"+
		"\u0000\u02a2\u02a4\u0003P(\u0000\u02a3\u02a2\u0001\u0000\u0000\u0000\u02a4"+
		"\u02a7\u0001\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000\u0000\u02a5"+
		"\u02a6\u0001\u0000\u0000\u0000\u02a6O\u0001\u0000\u0000\u0000\u02a7\u02a5"+
		"\u0001\u0000\u0000\u0000\u02a8\u02aa\u0005\u0093\u0000\u0000\u02a9\u02ab"+
		"\u0005~\u0000\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001"+
		"\u0000\u0000\u0000\u02ab\u02ac\u0001\u0000\u0000\u0000\u02ac\u02ad\u0005"+
		"{\u0000\u0000\u02ad\u02ae\u0003\u0096K\u0000\u02ae\u02af\u0005z\u0000"+
		"\u0000\u02afQ\u0001\u0000\u0000\u0000\u02b0\u02b2\u0005\'\u0000\u0000"+
		"\u02b1\u02b0\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b4\u0005*\u0000\u0000\u02b4"+
		"\u02b5\u0005\u0093\u0000\u0000\u02b5\u02b6\u0005\u0084\u0000\u0000\u02b6"+
		"\u02b7\u0003T*\u0000\u02b7\u02b8\u0005\u0085\u0000\u0000\u02b8S\u0001"+
		"\u0000\u0000\u0000\u02b9\u02be\u0003V+\u0000\u02ba\u02bb\u0005|\u0000"+
		"\u0000\u02bb\u02bd\u0003V+\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bd"+
		"\u02c0\u0001\u0000\u0000\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02be"+
		"\u02bf\u0001\u0000\u0000\u0000\u02bf\u02c2\u0001\u0000\u0000\u0000\u02c0"+
		"\u02be\u0001\u0000\u0000\u0000\u02c1\u02c3\u0005|\u0000\u0000\u02c2\u02c1"+
		"\u0001\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3U\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c7\u0005\u0093\u0000\u0000\u02c5\u02c6\u0005"+
		"Z\u0000\u0000\u02c6\u02c8\u0003\u0092I\u0000\u02c7\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8W\u0001\u0000\u0000\u0000"+
		"\u02c9\u02d9\u0003Z-\u0000\u02ca\u02d9\u0003\\.\u0000\u02cb\u02d9\u0003"+
		"^/\u0000\u02cc\u02d9\u0003`0\u0000\u02cd\u02d9\u0003b1\u0000\u02ce\u02d9"+
		"\u0003p8\u0000\u02cf\u02d9\u0003n7\u0000\u02d0\u02d9\u0003l6\u0000\u02d1"+
		"\u02d3\u0003\u0092I\u0000\u02d2\u02d4\u0005z\u0000\u0000\u02d3\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d9\u0001"+
		"\u0000\u0000\u0000\u02d5\u02d9\u0003\u00c6c\u0000\u02d6\u02d9\u0003\u00ba"+
		"]\u0000\u02d7\u02d9\u0003\u00b8\\\u0000\u02d8\u02c9\u0001\u0000\u0000"+
		"\u0000\u02d8\u02ca\u0001\u0000\u0000\u0000\u02d8\u02cb\u0001\u0000\u0000"+
		"\u0000\u02d8\u02cc\u0001\u0000\u0000\u0000\u02d8\u02cd\u0001\u0000\u0000"+
		"\u0000\u02d8\u02ce\u0001\u0000\u0000\u0000\u02d8\u02cf\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d0\u0001\u0000\u0000\u0000\u02d8\u02d1\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d5\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d7\u0001\u0000\u0000\u0000\u02d9Y\u0001\u0000\u0000\u0000"+
		"\u02da\u02db\u0003\u0084B\u0000\u02db\u02dc\u0005Z\u0000\u0000\u02dc\u02dd"+
		"\u0003\u008cF\u0000\u02dd\u02de\u0005z\u0000\u0000\u02de[\u0001\u0000"+
		"\u0000\u0000\u02df\u02e0\u0005#\u0000\u0000\u02e0\u02e1\u0005}\u0000\u0000"+
		"\u02e1\u02e2\u0007\u0002\u0000\u0000\u02e2\u02e4\u0005\u0082\u0000\u0000"+
		"\u02e3\u02e5\u0003r9\u0000\u02e4\u02e3\u0001\u0000\u0000\u0000\u02e4\u02e5"+
		"\u0001\u0000\u0000\u0000\u02e5\u02e6\u0001\u0000\u0000\u0000\u02e6\u02e8"+
		"\u0005\u0083\u0000\u0000\u02e7\u02e9\u0005z\u0000\u0000\u02e8\u02e7\u0001"+
		"\u0000\u0000\u0000\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9]\u0001\u0000"+
		"\u0000\u0000\u02ea\u02eb\u0005!\u0000\u0000\u02eb\u02ec\u0003\u0092I\u0000"+
		"\u02ec\u02ed\u0005z\u0000\u0000\u02ed_\u0001\u0000\u0000\u0000\u02ee\u02ef"+
		"\u0005\"\u0000\u0000\u02ef\u02f0\u0003\u0092I\u0000\u02f0\u02f1\u0005"+
		"z\u0000\u0000\u02f1a\u0001\u0000\u0000\u0000\u02f2\u02f6\u0003d2\u0000"+
		"\u02f3\u02f5\u0003f3\u0000\u02f4\u02f3\u0001\u0000\u0000\u0000\u02f5\u02f8"+
		"\u0001\u0000\u0000\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f6\u02f7"+
		"\u0001\u0000\u0000\u0000\u02f7\u02fa\u0001\u0000\u0000\u0000\u02f8\u02f6"+
		"\u0001\u0000\u0000\u0000\u02f9\u02fb\u0003h4\u0000\u02fa\u02f9\u0001\u0000"+
		"\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fbc\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fd\u0005\u001f\u0000\u0000\u02fd\u02fe\u0005\u0082\u0000"+
		"\u0000\u02fe\u02ff\u0003\u0092I\u0000\u02ff\u0300\u0005\u0083\u0000\u0000"+
		"\u0300\u0301\u0003j5\u0000\u0301e\u0001\u0000\u0000\u0000\u0302\u0303"+
		"\u0005 \u0000\u0000\u0303\u0304\u0005\u001f\u0000\u0000\u0304\u0305\u0005"+
		"\u0082\u0000\u0000\u0305\u0306\u0003\u0092I\u0000\u0306\u0307\u0005\u0083"+
		"\u0000\u0000\u0307\u0308\u0003j5\u0000\u0308g\u0001\u0000\u0000\u0000"+
		"\u0309\u030a\u0005 \u0000\u0000\u030a\u030b\u0003j5\u0000\u030bi\u0001"+
		"\u0000\u0000\u0000\u030c\u030f\u0003X,\u0000\u030d\u030f\u0003\u001e\u000f"+
		"\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030e\u030d\u0001\u0000\u0000"+
		"\u0000\u030fk\u0001\u0000\u0000\u0000\u0310\u0311\u0003\u0088D\u0000\u0311"+
		"\u0313\u0005\u0082\u0000\u0000\u0312\u0314\u0003r9\u0000\u0313\u0312\u0001"+
		"\u0000\u0000\u0000\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u0315\u0001"+
		"\u0000\u0000\u0000\u0315\u0316\u0005\u0083\u0000\u0000\u0316\u0317\u0005"+
		"z\u0000\u0000\u0317m\u0001\u0000\u0000\u0000\u0318\u0319\u0003\u000e\u0007"+
		"\u0000\u0319\u031b\u0005\u0082\u0000\u0000\u031a\u031c\u0003r9\u0000\u031b"+
		"\u031a\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c"+
		"\u031d\u0001\u0000\u0000\u0000\u031d\u0324\u0005\u0083\u0000\u0000\u031e"+
		"\u031f\u0005}\u0000\u0000\u031f\u0320\u0005%\u0000\u0000\u0320\u0321\u0005"+
		"\u0082\u0000\u0000\u0321\u0322\u0003\u001c\u000e\u0000\u0322\u0323\u0005"+
		"\u0083\u0000\u0000\u0323\u0325\u0001\u0000\u0000\u0000\u0324\u031e\u0001"+
		"\u0000\u0000\u0000\u0324\u0325\u0001\u0000\u0000\u0000\u0325\u0326\u0001"+
		"\u0000\u0000\u0000\u0326\u0327\u0005z\u0000\u0000\u0327o\u0001\u0000\u0000"+
		"\u0000\u0328\u0329\u0005\u0088\u0000\u0000\u0329\u032b\u0005\u0082\u0000"+
		"\u0000\u032a\u032c\u0003\u0012\t\u0000\u032b\u032a\u0001\u0000\u0000\u0000"+
		"\u032b\u032c\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000\u0000\u0000"+
		"\u032d\u032f\u0005z\u0000\u0000\u032e\u0330\u0003\u0092I\u0000\u032f\u032e"+
		"\u0001\u0000\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u0331"+
		"\u0001\u0000\u0000\u0000\u0331\u0333\u0005z\u0000\u0000\u0332\u0334\u0003"+
		"\u0092I\u0000\u0333\u0332\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000"+
		"\u0000\u0000\u0334\u0335\u0001\u0000\u0000\u0000\u0335\u0336\u0005\u0083"+
		"\u0000\u0000\u0336\u0358\u0003j5\u0000\u0337\u0338\u0005\u0088\u0000\u0000"+
		"\u0338\u0339\u0005\u0082\u0000\u0000\u0339\u033a\u0003\u0014\n\u0000\u033a"+
		"\u033b\u0005\u0093\u0000\u0000\u033b\u033c\u0005\u008d\u0000\u0000\u033c"+
		"\u033d\u0005\u0093\u0000\u0000\u033d\u033e\u0005\u0083\u0000\u0000\u033e"+
		"\u033f\u0003j5\u0000\u033f\u0358\u0001\u0000\u0000\u0000\u0340\u0341\u0005"+
		"\u0088\u0000\u0000\u0341\u0342\u0005\u0082\u0000\u0000\u0342\u0343\u0003"+
		"\u0014\n\u0000\u0343\u0344\u0005\u0093\u0000\u0000\u0344\u0345\u0005\u008e"+
		"\u0000\u0000\u0345\u0346\u0005\u0093\u0000\u0000\u0346\u0347\u0005\u0083"+
		"\u0000\u0000\u0347\u0348\u0003j5\u0000\u0348\u0358\u0001\u0000\u0000\u0000"+
		"\u0349\u034a\u0005\u008a\u0000\u0000\u034a\u034b\u0005\u0082\u0000\u0000"+
		"\u034b\u034c\u0003\u0092I\u0000\u034c\u034d\u0005\u0083\u0000\u0000\u034d"+
		"\u034e\u0003j5\u0000\u034e\u0358\u0001\u0000\u0000\u0000\u034f\u0350\u0005"+
		"\u0089\u0000\u0000\u0350\u0351\u0003j5\u0000\u0351\u0352\u0005\u008a\u0000"+
		"\u0000\u0352\u0353\u0005\u0082\u0000\u0000\u0353\u0354\u0003\u0092I\u0000"+
		"\u0354\u0355\u0005\u0083\u0000\u0000\u0355\u0356\u0005z\u0000\u0000\u0356"+
		"\u0358\u0001\u0000\u0000\u0000\u0357\u0328\u0001\u0000\u0000\u0000\u0357"+
		"\u0337\u0001\u0000\u0000\u0000\u0357\u0340\u0001\u0000\u0000\u0000\u0357"+
		"\u0349\u0001\u0000\u0000\u0000\u0357\u034f\u0001\u0000\u0000\u0000\u0358"+
		"q\u0001\u0000\u0000\u0000\u0359\u035e\u0003t:\u0000\u035a\u035b\u0005"+
		"|\u0000\u0000\u035b\u035d\u0003t:\u0000\u035c\u035a\u0001\u0000\u0000"+
		"\u0000\u035d\u0360\u0001\u0000\u0000\u0000\u035e\u035c\u0001\u0000\u0000"+
		"\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035fs\u0001\u0000\u0000\u0000"+
		"\u0360\u035e\u0001\u0000\u0000\u0000\u0361\u0362\u0003\u0092I\u0000\u0362"+
		"u\u0001\u0000\u0000\u0000\u0363\u0365\u00032\u0019\u0000\u0364\u0363\u0001"+
		"\u0000\u0000\u0000\u0365\u0368\u0001\u0000\u0000\u0000\u0366\u0364\u0001"+
		"\u0000\u0000\u0000\u0366\u0367\u0001\u0000\u0000\u0000\u0367\u036a\u0001"+
		"\u0000\u0000\u0000\u0368\u0366\u0001\u0000\u0000\u0000\u0369\u036b\u0003"+
		"\u0098L\u0000\u036a\u0369\u0001\u0000\u0000\u0000\u036a\u036b\u0001\u0000"+
		"\u0000\u0000\u036b\u036c\u0001\u0000\u0000\u0000\u036c\u036f\u0005\u0093"+
		"\u0000\u0000\u036d\u036e\u0005{\u0000\u0000\u036e\u0370\u0003\u0096K\u0000"+
		"\u036f\u036d\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000\u0000\u0000"+
		"\u0370\u0373\u0001\u0000\u0000\u0000\u0371\u0372\u0005Z\u0000\u0000\u0372"+
		"\u0374\u0003\u008cF\u0000\u0373\u0371\u0001\u0000\u0000\u0000\u0373\u0374"+
		"\u0001\u0000\u0000\u0000\u0374w\u0001\u0000\u0000\u0000\u0375\u037e\u0005"+
		"\u0086\u0000\u0000\u0376\u037b\u0003\u0092I\u0000\u0377\u0378\u0005|\u0000"+
		"\u0000\u0378\u037a\u0003\u0092I\u0000\u0379\u0377\u0001\u0000\u0000\u0000"+
		"\u037a\u037d\u0001\u0000\u0000\u0000\u037b\u0379\u0001\u0000\u0000\u0000"+
		"\u037b\u037c\u0001\u0000\u0000\u0000\u037c\u037f\u0001\u0000\u0000\u0000"+
		"\u037d\u037b\u0001\u0000\u0000\u0000\u037e\u0376\u0001\u0000\u0000\u0000"+
		"\u037e\u037f\u0001\u0000\u0000\u0000\u037f\u0381\u0001\u0000\u0000\u0000"+
		"\u0380\u0382\u0005|\u0000\u0000\u0381\u0380\u0001\u0000\u0000\u0000\u0381"+
		"\u0382\u0001\u0000\u0000\u0000\u0382\u0383\u0001\u0000\u0000\u0000\u0383"+
		"\u0384\u0005\u0087\u0000\u0000\u0384y\u0001\u0000\u0000\u0000\u0385\u038c"+
		"\u0003\u008eG\u0000\u0386\u038c\u0003x<\u0000\u0387\u038c\u0003\u0086"+
		"C\u0000\u0388\u038c\u0003\u0084B\u0000\u0389\u038c\u0003|>\u0000\u038a"+
		"\u038c\u0003\u0082A\u0000\u038b\u0385\u0001\u0000\u0000\u0000\u038b\u0386"+
		"\u0001\u0000\u0000\u0000\u038b\u0387\u0001\u0000\u0000\u0000\u038b\u0388"+
		"\u0001\u0000\u0000\u0000\u038b\u0389\u0001\u0000\u0000\u0000\u038b\u038a"+
		"\u0001\u0000\u0000\u0000\u038c{\u0001\u0000\u0000\u0000\u038d\u038f\u0005"+
		"\u0084\u0000\u0000\u038e\u0390\u0003~?\u0000\u038f\u038e\u0001\u0000\u0000"+
		"\u0000\u038f\u0390\u0001\u0000\u0000\u0000\u0390\u0391\u0001\u0000\u0000"+
		"\u0000\u0391\u0392\u0005\u0085\u0000\u0000\u0392}\u0001\u0000\u0000\u0000"+
		"\u0393\u0398\u0003\u0080@\u0000\u0394\u0395\u0005|\u0000\u0000\u0395\u0397"+
		"\u0003\u0080@\u0000\u0396\u0394\u0001\u0000\u0000\u0000\u0397\u039a\u0001"+
		"\u0000\u0000\u0000\u0398\u0396\u0001\u0000\u0000\u0000\u0398\u0399\u0001"+
		"\u0000\u0000\u0000\u0399\u039c\u0001\u0000\u0000\u0000\u039a\u0398\u0001"+
		"\u0000\u0000\u0000\u039b\u039d\u0005|\u0000\u0000\u039c\u039b\u0001\u0000"+
		"\u0000\u0000\u039c\u039d\u0001\u0000\u0000\u0000\u039d\u007f\u0001\u0000"+
		"\u0000\u0000\u039e\u039f\u0005\u0093\u0000\u0000\u039f\u03a0\u0005{\u0000"+
		"\u0000\u03a0\u03a1\u0003\u0092I\u0000\u03a1\u0081\u0001\u0000\u0000\u0000"+
		"\u03a2\u03a3\u0005/\u0000\u0000\u03a3\u03a5\u0005\u0093\u0000\u0000\u03a4"+
		"\u03a6\u0003\u0094J\u0000\u03a5\u03a4\u0001\u0000\u0000\u0000\u03a5\u03a6"+
		"\u0001\u0000\u0000\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000\u03a7\u03a9"+
		"\u0005\u0082\u0000\u0000\u03a8\u03aa\u0003r9\u0000\u03a9\u03a8\u0001\u0000"+
		"\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa\u03ab\u0001\u0000"+
		"\u0000\u0000\u03ab\u03ac\u0005\u0083\u0000\u0000\u03ac\u0083\u0001\u0000"+
		"\u0000\u0000\u03ad\u03af\u0005\u0093\u0000\u0000\u03ae\u03b0\u0003\u0092"+
		"I\u0000\u03af\u03ae\u0001\u0000\u0000\u0000\u03af\u03b0\u0001\u0000\u0000"+
		"\u0000\u03b0\u03b4\u0001\u0000\u0000\u0000\u03b1\u03b2\u0005.\u0000\u0000"+
		"\u03b2\u03b4\u0003\u0092I\u0000\u03b3\u03ad\u0001\u0000\u0000\u0000\u03b3"+
		"\u03b1\u0001\u0000\u0000\u0000\u03b4\u0085\u0001\u0000\u0000\u0000\u03b5"+
		"\u03b6\u0005\u0093\u0000\u0000\u03b6\u03b7\u0005\u0086\u0000\u0000\u03b7"+
		"\u03b8\u0003\u0092I\u0000\u03b8\u03b9\u0005\u0087\u0000\u0000\u03b9\u0087"+
		"\u0001\u0000\u0000\u0000\u03ba\u03bf\u0003\u008eG\u0000\u03bb\u03bc\u0005"+
		"}\u0000\u0000\u03bc\u03be\u0005\u0093\u0000\u0000\u03bd\u03bb\u0001\u0000"+
		"\u0000\u0000\u03be\u03c1\u0001\u0000\u0000\u0000\u03bf\u03bd\u0001\u0000"+
		"\u0000\u0000\u03bf\u03c0\u0001\u0000\u0000\u0000\u03c0\u0089\u0001\u0000"+
		"\u0000\u0000\u03c1\u03bf\u0001\u0000\u0000\u0000\u03c2\u03c3\u0003\u0088"+
		"D\u0000\u03c3\u03c5\u0005\u0082\u0000\u0000\u03c4\u03c6\u0003r9\u0000"+
		"\u03c5\u03c4\u0001\u0000\u0000\u0000\u03c5\u03c6\u0001\u0000\u0000\u0000"+
		"\u03c6\u03c7\u0001\u0000\u0000\u0000\u03c7\u03c8\u0005\u0083\u0000\u0000"+
		"\u03c8\u008b\u0001\u0000\u0000\u0000\u03c9\u03ca\u0003\u0092I\u0000\u03ca"+
		"\u008d\u0001\u0000\u0000\u0000\u03cb\u03ce\u0003\u0090H\u0000\u03cc\u03ce"+
		"\u0005\u0093\u0000\u0000\u03cd\u03cb\u0001\u0000\u0000\u0000\u03cd\u03cc"+
		"\u0001\u0000\u0000\u0000\u03ce\u008f\u0001\u0000\u0000\u0000\u03cf\u03d0"+
		"\u0007\u0003\u0000\u0000\u03d0\u0091\u0001\u0000\u0000\u0000\u03d1\u03d2"+
		"\u0006I\uffff\uffff\u0000\u03d2\u03e6\u0003l6\u0000\u03d3\u03e6\u0003"+
		"\u0016\u000b\u0000\u03d4\u03d5\u0005x\u0000\u0000\u03d5\u03e6\u0003\u0092"+
		"I\u0012\u03d6\u03d7\u0005y\u0000\u0000\u03d7\u03e6\u0003\u0092I\u0011"+
		"\u03d8\u03d9\u0005[\u0000\u0000\u03d9\u03e6\u0003\u0092I\u0010\u03da\u03db"+
		"\u0005\u0082\u0000\u0000\u03db\u03dc\u0003\u0092I\u0000\u03dc\u03dd\u0005"+
		"\u0083\u0000\u0000\u03dd\u03e6\u0001\u0000\u0000\u0000\u03de\u03e6\u0003"+
		"z=\u0000\u03df\u03e6\u0003v;\u0000\u03e0\u03e6\u0003\u00c8d\u0000\u03e1"+
		"\u03e6\u0003\u008aE\u0000\u03e2\u03e6\u0003\u0088D\u0000\u03e3\u03e6\u0003"+
		"\u00c2a\u0000\u03e4\u03e6\u0003\u00c4b\u0000\u03e5\u03d1\u0001\u0000\u0000"+
		"\u0000\u03e5\u03d3\u0001\u0000\u0000\u0000\u03e5\u03d4\u0001\u0000\u0000"+
		"\u0000\u03e5\u03d6\u0001\u0000\u0000\u0000\u03e5\u03d8\u0001\u0000\u0000"+
		"\u0000\u03e5\u03da\u0001\u0000\u0000\u0000\u03e5\u03de\u0001\u0000\u0000"+
		"\u0000\u03e5\u03df\u0001\u0000\u0000\u0000\u03e5\u03e0\u0001\u0000\u0000"+
		"\u0000\u03e5\u03e1\u0001\u0000\u0000\u0000\u03e5\u03e2\u0001\u0000\u0000"+
		"\u0000\u03e5\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e4\u0001\u0000\u0000"+
		"\u0000\u03e6\u0405\u0001\u0000\u0000\u0000\u03e7\u03e8\n\u000f\u0000\u0000"+
		"\u03e8\u03e9\u0007\u0004\u0000\u0000\u03e9\u0404\u0003\u0092I\u0010\u03ea"+
		"\u03eb\n\u000e\u0000\u0000\u03eb\u03ec\u0007\u0005\u0000\u0000\u03ec\u0404"+
		"\u0003\u0092I\u000f\u03ed\u03ee\n\r\u0000\u0000\u03ee\u03ef\u0007\u0006"+
		"\u0000\u0000\u03ef\u0404\u0003\u0092I\u000e\u03f0\u03f1\n\f\u0000\u0000"+
		"\u03f1\u03f2\u0007\u0007\u0000\u0000\u03f2\u0404\u0003\u0092I\r\u03f3"+
		"\u03f4\n\u000b\u0000\u0000\u03f4\u03f5\u0005e\u0000\u0000\u03f5\u0404"+
		"\u0003\u0092I\f\u03f6\u03f7\n\n\u0000\u0000\u03f7\u03f8\u0005f\u0000\u0000"+
		"\u03f8\u0404\u0003\u0092I\u000b\u03f9\u03fa\n\t\u0000\u0000\u03fa\u03fb"+
		"\u0005~\u0000\u0000\u03fb\u03fc\u0003\u0092I\u0000\u03fc\u03fd\u0005{"+
		"\u0000\u0000\u03fd\u03fe\u0003\u0092I\n\u03fe\u0404\u0001\u0000\u0000"+
		"\u0000\u03ff\u0400\n\u0014\u0000\u0000\u0400\u0404\u0005x\u0000\u0000"+
		"\u0401\u0402\n\u0013\u0000\u0000\u0402\u0404\u0005y\u0000\u0000\u0403"+
		"\u03e7\u0001\u0000\u0000\u0000\u0403\u03ea\u0001\u0000\u0000\u0000\u0403"+
		"\u03ed\u0001\u0000\u0000\u0000\u0403\u03f0\u0001\u0000\u0000\u0000\u0403"+
		"\u03f3\u0001\u0000\u0000\u0000\u0403\u03f6\u0001\u0000\u0000\u0000\u0403"+
		"\u03f9\u0001\u0000\u0000\u0000\u0403\u03ff\u0001\u0000\u0000\u0000\u0403"+
		"\u0401\u0001\u0000\u0000\u0000\u0404\u0407\u0001\u0000\u0000\u0000\u0405"+
		"\u0403\u0001\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000\u0000\u0406"+
		"\u0093\u0001\u0000\u0000\u0000\u0407\u0405\u0001\u0000\u0000\u0000\u0408"+
		"\u0409\u0005X\u0000\u0000\u0409\u040e\u0003\u0096K\u0000\u040a\u040b\u0005"+
		"|\u0000\u0000\u040b\u040d\u0003\u0096K\u0000\u040c\u040a\u0001\u0000\u0000"+
		"\u0000\u040d\u0410\u0001\u0000\u0000\u0000\u040e\u040c\u0001\u0000\u0000"+
		"\u0000\u040e\u040f\u0001\u0000\u0000\u0000\u040f\u0411\u0001\u0000\u0000"+
		"\u0000\u0410\u040e\u0001\u0000\u0000\u0000\u0411\u0412\u0005V\u0000\u0000"+
		"\u0412\u0095\u0001\u0000\u0000\u0000\u0413\u0414\u0005\u0093\u0000\u0000"+
		"\u0414\u0422\u0003\u0094J\u0000\u0415\u041a\u0007\b\u0000\u0000\u0416"+
		"\u0417\u0005i\u0000\u0000\u0417\u0419\u0007\b\u0000\u0000\u0418\u0416"+
		"\u0001\u0000\u0000\u0000\u0419\u041c\u0001\u0000\u0000\u0000\u041a\u0418"+
		"\u0001\u0000\u0000\u0000\u041a\u041b\u0001\u0000\u0000\u0000\u041b\u0422"+
		"\u0001\u0000\u0000\u0000\u041c\u041a\u0001\u0000\u0000\u0000\u041d\u041e"+
		"\u0007\b\u0000\u0000\u041e\u041f\u0005\u0086\u0000\u0000\u041f\u0422\u0005"+
		"\u0087\u0000\u0000\u0420\u0422\u0003x<\u0000\u0421\u0413\u0001\u0000\u0000"+
		"\u0000\u0421\u0415\u0001\u0000\u0000\u0000\u0421\u041d\u0001\u0000\u0000"+
		"\u0000\u0421\u0420\u0001\u0000\u0000\u0000\u0422\u0097\u0001\u0000\u0000"+
		"\u0000\u0423\u0424\u0007\t\u0000\u0000\u0424\u0099\u0001\u0000\u0000\u0000"+
		"\u0425\u0429\u0005\u0094\u0000\u0000\u0426\u0428\u0003\u009cN\u0000\u0427"+
		"\u0426\u0001\u0000\u0000\u0000\u0428\u042b\u0001\u0000\u0000\u0000\u0429"+
		"\u0427\u0001\u0000\u0000\u0000\u0429\u042a\u0001\u0000\u0000\u0000\u042a"+
		"\u042c\u0001\u0000\u0000\u0000\u042b\u0429\u0001\u0000\u0000\u0000\u042c"+
		"\u042d\u0005\u00a9\u0000\u0000\u042d\u009b\u0001\u0000\u0000\u0000\u042e"+
		"\u0432\u0003\u009eO\u0000\u042f\u0431\u0003\u00a4R\u0000\u0430\u042f\u0001"+
		"\u0000\u0000\u0000\u0431\u0434\u0001\u0000\u0000\u0000\u0432\u0430\u0001"+
		"\u0000\u0000\u0000\u0432\u0433\u0001\u0000\u0000\u0000\u0433\u0435\u0001"+
		"\u0000\u0000\u0000\u0434\u0432\u0001\u0000\u0000\u0000\u0435\u0436\u0003"+
		"\u00a0P\u0000\u0436\u043a\u0001\u0000\u0000\u0000\u0437\u043a\u0003\u00a2"+
		"Q\u0000\u0438\u043a\u0003\u00a8T\u0000\u0439\u042e\u0001\u0000\u0000\u0000"+
		"\u0439\u0437\u0001\u0000\u0000\u0000\u0439\u0438\u0001\u0000\u0000\u0000"+
		"\u043a\u009d\u0001\u0000\u0000\u0000\u043b\u043d\u0005\u0095\u0000\u0000"+
		"\u043c\u043b\u0001\u0000\u0000\u0000\u043c\u043d\u0001\u0000\u0000\u0000"+
		"\u043d\u043e\u0001\u0000\u0000\u0000\u043e\u0442\u0003\u00acV\u0000\u043f"+
		"\u0441\u0003\u00a6S\u0000\u0440\u043f\u0001\u0000\u0000\u0000\u0441\u0444"+
		"\u0001\u0000\u0000\u0000\u0442\u0440\u0001\u0000\u0000\u0000\u0442\u0443"+
		"\u0001\u0000\u0000\u0000\u0443\u0445\u0001\u0000\u0000\u0000\u0444\u0442"+
		"\u0001\u0000\u0000\u0000\u0445\u0446\u0005\u0096\u0000\u0000\u0446\u009f"+
		"\u0001\u0000\u0000\u0000\u0447\u0448\u0005\u0095\u0000\u0000\u0448\u0449"+
		"\u0005\u0097\u0000\u0000\u0449\u044a\u0003\u00acV\u0000\u044a\u044b\u0005"+
		"\u0096\u0000\u0000\u044b\u00a1\u0001\u0000\u0000\u0000\u044c\u044d\u0005"+
		"\u0095\u0000\u0000\u044d\u0451\u0003\u00acV\u0000\u044e\u0450\u0003\u00a6"+
		"S\u0000\u044f\u044e\u0001\u0000\u0000\u0000\u0450\u0453\u0001\u0000\u0000"+
		"\u0000\u0451\u044f\u0001\u0000\u0000\u0000\u0451\u0452\u0001\u0000\u0000"+
		"\u0000\u0452\u0454\u0001\u0000\u0000\u0000\u0453\u0451\u0001\u0000\u0000"+
		"\u0000\u0454\u0455\u0005\u0097\u0000\u0000\u0455\u0456\u0005\u0096\u0000"+
		"\u0000\u0456\u00a3\u0001\u0000\u0000\u0000\u0457\u045d\u0003\u009cN\u0000"+
		"\u0458\u045a\u0005\u00a5\u0000\u0000\u0459\u045b\u0005\u0099\u0000\u0000"+
		"\u045a\u0459\u0001\u0000\u0000\u0000\u045a\u045b\u0001\u0000\u0000\u0000"+
		"\u045b\u045d\u0001\u0000\u0000\u0000\u045c\u0457\u0001\u0000\u0000\u0000"+
		"\u045c\u0458\u0001\u0000\u0000\u0000\u045d\u00a5\u0001\u0000\u0000\u0000"+
		"\u045e\u045f\u0005\u00a5\u0000\u0000\u045f\u0460\u0005\u0098\u0000\u0000"+
		"\u0460\u0475\u0005\u009a\u0000\u0000\u0461\u0462\u0005\u009d\u0000\u0000"+
		"\u0462\u0463\u0005\u0098\u0000\u0000\u0463\u0475\u0005\u009a\u0000\u0000"+
		"\u0464\u0465\u0005\u009e\u0000\u0000\u0465\u0466\u0005\u0098\u0000\u0000"+
		"\u0466\u0475\u0005\u009a\u0000\u0000\u0467\u0468\u0005\u009f\u0000\u0000"+
		"\u0468\u0469\u0005\u0098\u0000\u0000\u0469\u0475\u0005\u009a\u0000\u0000"+
		"\u046a\u046b\u0003\u00aeW\u0000\u046b\u046c\u0005\u0098\u0000\u0000\u046c"+
		"\u046d\u0005\u009a\u0000\u0000\u046d\u0475\u0001\u0000\u0000\u0000\u046e"+
		"\u0471\u0005\u00a4\u0000\u0000\u046f\u0470\u0005\u0098\u0000\u0000\u0470"+
		"\u0472\u0005\u009a\u0000\u0000\u0471\u046f\u0001\u0000\u0000\u0000\u0471"+
		"\u0472\u0001\u0000\u0000\u0000\u0472\u0475\u0001\u0000\u0000\u0000\u0473"+
		"\u0475\u0005\u00a5\u0000\u0000\u0474\u045e\u0001\u0000\u0000\u0000\u0474"+
		"\u0461\u0001\u0000\u0000\u0000\u0474\u0464\u0001\u0000\u0000\u0000\u0474"+
		"\u0467\u0001\u0000\u0000\u0000\u0474\u046a\u0001\u0000\u0000\u0000\u0474"+
		"\u046e\u0001\u0000\u0000\u0000\u0474\u0473\u0001\u0000\u0000\u0000\u0475"+
		"\u00a7\u0001\u0000\u0000\u0000\u0476\u0477\u0005\u00a5\u0000\u0000\u0477"+
		"\u0479\u0007\n\u0000\u0000\u0478\u0476\u0001\u0000\u0000\u0000\u0478\u0479"+
		"\u0001\u0000\u0000\u0000\u0479\u047a\u0001\u0000\u0000\u0000\u047a\u0483"+
		"\u0005\u009b\u0000\u0000\u047b\u0480\u0003\u00aaU\u0000\u047c\u047d\u0005"+
		"\u00a3\u0000\u0000\u047d\u047f\u0003\u00aaU\u0000\u047e\u047c\u0001\u0000"+
		"\u0000\u0000\u047f\u0482\u0001\u0000\u0000\u0000\u0480\u047e\u0001\u0000"+
		"\u0000\u0000\u0480\u0481\u0001\u0000\u0000\u0000\u0481\u0484\u0001\u0000"+
		"\u0000\u0000\u0482\u0480\u0001\u0000\u0000\u0000\u0483\u047b\u0001\u0000"+
		"\u0000\u0000\u0483\u0484\u0001\u0000\u0000\u0000\u0484\u0485\u0001\u0000"+
		"\u0000\u0000\u0485\u0486\u0005\u009c\u0000\u0000\u0486\u00a9\u0001\u0000"+
		"\u0000\u0000\u0487\u048a\u0005\u00a5\u0000\u0000\u0488\u0489\u0005\u0099"+
		"\u0000\u0000\u0489\u048b\u0007\u000b\u0000\u0000\u048a\u0488\u0001\u0000"+
		"\u0000\u0000\u048a\u048b\u0001\u0000\u0000\u0000\u048b\u00ab\u0001\u0000"+
		"\u0000\u0000\u048c\u048d\u0005\u00a5\u0000\u0000\u048d\u00ad\u0001\u0000"+
		"\u0000\u0000\u048e\u048f\u0007\f\u0000\u0000\u048f\u00af\u0001\u0000\u0000"+
		"\u0000\u0490\u0491\u0003\u0014\n\u0000\u0491\u0494\u0005\u0093\u0000\u0000"+
		"\u0492\u0493\u0005{\u0000\u0000\u0493\u0495\u00055\u0000\u0000\u0494\u0492"+
		"\u0001\u0000\u0000\u0000\u0494\u0495\u0001\u0000\u0000\u0000\u0495\u0496"+
		"\u0001\u0000\u0000\u0000\u0496\u0497\u0005Z\u0000\u0000\u0497\u0499\u0003"+
		"\u00b2Y\u0000\u0498\u049a\u0005z\u0000\u0000\u0499\u0498\u0001\u0000\u0000"+
		"\u0000\u0499\u049a\u0001\u0000\u0000\u0000\u049a\u00b1\u0001\u0000\u0000"+
		"\u0000\u049b\u04a4\u0005\u0086\u0000\u0000\u049c\u04a1\u0003\u00b4Z\u0000"+
		"\u049d\u049e\u0005|\u0000\u0000\u049e\u04a0\u0003\u00b4Z\u0000\u049f\u049d"+
		"\u0001\u0000\u0000\u0000\u04a0\u04a3\u0001\u0000\u0000\u0000\u04a1\u049f"+
		"\u0001\u0000\u0000\u0000\u04a1\u04a2\u0001\u0000\u0000\u0000\u04a2\u04a5"+
		"\u0001\u0000\u0000\u0000\u04a3\u04a1\u0001\u0000\u0000\u0000\u04a4\u049c"+
		"\u0001\u0000\u0000\u0000\u04a4\u04a5\u0001\u0000\u0000\u0000\u04a5\u04a7"+
		"\u0001\u0000\u0000\u0000\u04a6\u04a8\u0005|\u0000\u0000\u04a7\u04a6\u0001"+
		"\u0000\u0000\u0000\u04a7\u04a8\u0001\u0000\u0000\u0000\u04a8\u04a9\u0001"+
		"\u0000\u0000\u0000\u04a9\u04aa\u0005\u0087\u0000\u0000\u04aa\u00b3\u0001"+
		"\u0000\u0000\u0000\u04ab\u04ac\u0005\u0084\u0000\u0000\u04ac\u04b1\u0003"+
		"\u00b6[\u0000\u04ad\u04ae\u0005|\u0000\u0000\u04ae\u04b0\u0003\u00b6["+
		"\u0000\u04af\u04ad\u0001\u0000\u0000\u0000\u04b0\u04b3\u0001\u0000\u0000"+
		"\u0000\u04b1\u04af\u0001\u0000\u0000\u0000\u04b1\u04b2\u0001\u0000\u0000"+
		"\u0000\u04b2\u04b5\u0001\u0000\u0000\u0000\u04b3\u04b1\u0001\u0000\u0000"+
		"\u0000\u04b4\u04b6\u0005|\u0000\u0000\u04b5\u04b4\u0001\u0000\u0000\u0000"+
		"\u04b5\u04b6\u0001\u0000\u0000\u0000\u04b6\u04b7\u0001\u0000\u0000\u0000"+
		"\u04b7\u04b8\u0005\u0085\u0000\u0000\u04b8\u00b5\u0001\u0000\u0000\u0000"+
		"\u04b9\u04ba\u0005;\u0000\u0000\u04ba\u04bb\u0005{\u0000\u0000\u04bb\u04e3"+
		"\u0005\u008f\u0000\u0000\u04bc\u04bd\u0005<\u0000\u0000\u04bd\u04be\u0005"+
		"{\u0000\u0000\u04be\u04e3\u0005\u0093\u0000\u0000\u04bf\u04c0\u0005=\u0000"+
		"\u0000\u04c0\u04c1\u0005{\u0000\u0000\u04c1\u04e3\u0005\u008f\u0000\u0000"+
		"\u04c2\u04c3\u0005>\u0000\u0000\u04c3\u04c4\u0005{\u0000\u0000\u04c4\u04e3"+
		"\u0005\u008f\u0000\u0000\u04c5\u04c6\u0005?\u0000\u0000\u04c6\u04c7\u0005"+
		"{\u0000\u0000\u04c7\u04e3\u0003\u00b2Y\u0000\u04c8\u04c9\u0005@\u0000"+
		"\u0000\u04c9\u04ce\u0005{\u0000\u0000\u04ca\u04cf\u0005\u008f\u0000\u0000"+
		"\u04cb\u04cf\u0003\u001c\u000e\u0000\u04cc\u04cf\u0003\u008aE\u0000\u04cd"+
		"\u04cf\u0003\u0088D\u0000\u04ce\u04ca\u0001\u0000\u0000\u0000\u04ce\u04cb"+
		"\u0001\u0000\u0000\u0000\u04ce\u04cc\u0001\u0000\u0000\u0000\u04ce\u04cd"+
		"\u0001\u0000\u0000\u0000\u04cf\u04e3\u0001\u0000\u0000\u0000\u04d0\u04d1"+
		"\u0005A\u0000\u0000\u04d1\u04d2\u0005{\u0000\u0000\u04d2\u04e3\u0003x"+
		"<\u0000\u04d3\u04d4\u0005B\u0000\u0000\u04d4\u04d5\u0005{\u0000\u0000"+
		"\u04d5\u04e3\u0003x<\u0000\u04d6\u04d7\u0005C\u0000\u0000\u04d7\u04d8"+
		"\u0005{\u0000\u0000\u04d8\u04e3\u0003x<\u0000\u04d9\u04da\u0005D\u0000"+
		"\u0000\u04da\u04db\u0005{\u0000\u0000\u04db\u04e3\u0003x<\u0000\u04dc"+
		"\u04dd\u0005E\u0000\u0000\u04dd\u04de\u0005{\u0000\u0000\u04de\u04e3\u0003"+
		"|>\u0000\u04df\u04e0\u0005F\u0000\u0000\u04e0\u04e1\u0005{\u0000\u0000"+
		"\u04e1\u04e3\u0003|>\u0000\u04e2\u04b9\u0001\u0000\u0000\u0000\u04e2\u04bc"+
		"\u0001\u0000\u0000\u0000\u04e2\u04bf\u0001\u0000\u0000\u0000\u04e2\u04c2"+
		"\u0001\u0000\u0000\u0000\u04e2\u04c5\u0001\u0000\u0000\u0000\u04e2\u04c8"+
		"\u0001\u0000\u0000\u0000\u04e2\u04d0\u0001\u0000\u0000\u0000\u04e2\u04d3"+
		"\u0001\u0000\u0000\u0000\u04e2\u04d6\u0001\u0000\u0000\u0000\u04e2\u04d9"+
		"\u0001\u0000\u0000\u0000\u04e2\u04dc\u0001\u0000\u0000\u0000\u04e2\u04df"+
		"\u0001\u0000\u0000\u0000\u04e3\u00b7\u0001\u0000\u0000\u0000\u04e4\u04e5"+
		"\u00054\u0000\u0000\u04e5\u04e6\u0005}\u0000\u0000\u04e6\u04e7\u0007\r"+
		"\u0000\u0000\u04e7\u04e9\u0005\u0082\u0000\u0000\u04e8\u04ea\u0003r9\u0000"+
		"\u04e9\u04e8\u0001\u0000\u0000\u0000\u04e9\u04ea\u0001\u0000\u0000\u0000"+
		"\u04ea\u04eb\u0001\u0000\u0000\u0000\u04eb\u04ec\u0005\u0083\u0000\u0000"+
		"\u04ec\u00b9\u0001\u0000\u0000\u0000\u04ed\u04ee\u0005.\u0000\u0000\u04ee"+
		"\u04f0\u0005}\u0000\u0000\u04ef\u04ed\u0001\u0000\u0000\u0000\u04ef\u04f0"+
		"\u0001\u0000\u0000\u0000\u04f0\u04f1\u0001\u0000\u0000\u0000\u04f1\u04f2"+
		"\u0005\u0093\u0000\u0000\u04f2\u04f3\u0005}\u0000\u0000\u04f3\u04f4\u0007"+
		"\u000e\u0000\u0000\u04f4\u04f6\u0005\u0082\u0000\u0000\u04f5\u04f7\u0003"+
		"r9\u0000\u04f6\u04f5\u0001\u0000\u0000\u0000\u04f6\u04f7\u0001\u0000\u0000"+
		"\u0000\u04f7\u04f8\u0001\u0000\u0000\u0000\u04f8\u04fa\u0005\u0083\u0000"+
		"\u0000\u04f9\u04fb\u0005z\u0000\u0000\u04fa\u04f9\u0001\u0000\u0000\u0000"+
		"\u04fa\u04fb\u0001\u0000\u0000\u0000\u04fb\u00bb\u0001\u0000\u0000\u0000"+
		"\u04fc\u04fd\u0003\u0014\n\u0000\u04fd\u0500\u0005\u0093\u0000\u0000\u04fe"+
		"\u04ff\u0005{\u0000\u0000\u04ff\u0501\u0003\u0096K\u0000\u0500\u04fe\u0001"+
		"\u0000\u0000\u0000\u0500\u0501\u0001\u0000\u0000\u0000\u0501\u0502\u0001"+
		"\u0000\u0000\u0000\u0502\u0503\u0005Z\u0000\u0000\u0503\u0504\u0005J\u0000"+
		"\u0000\u0504\u0506\u0005\u0082\u0000\u0000\u0505\u0507\u0003r9\u0000\u0506"+
		"\u0505\u0001\u0000\u0000\u0000\u0506\u0507\u0001\u0000\u0000\u0000\u0507"+
		"\u0508\u0001\u0000\u0000\u0000\u0508\u050a\u0005\u0083\u0000\u0000\u0509"+
		"\u050b\u0005z\u0000\u0000\u050a\u0509\u0001\u0000\u0000\u0000\u050a\u050b"+
		"\u0001\u0000\u0000\u0000\u050b\u00bd\u0001\u0000\u0000\u0000\u050c\u050d"+
		"\u0003\u0014\n\u0000\u050d\u0510\u0005\u0093\u0000\u0000\u050e\u050f\u0005"+
		"{\u0000\u0000\u050f\u0511\u0003\u0096K\u0000\u0510\u050e\u0001\u0000\u0000"+
		"\u0000\u0510\u0511\u0001\u0000\u0000\u0000\u0511\u0512\u0001\u0000\u0000"+
		"\u0000\u0512\u0513\u0005Z\u0000\u0000\u0513\u0514\u0005L\u0000\u0000\u0514"+
		"\u0516\u0005\u0082\u0000\u0000\u0515\u0517\u0003r9\u0000\u0516\u0515\u0001"+
		"\u0000\u0000\u0000\u0516\u0517\u0001\u0000\u0000\u0000\u0517\u0518\u0001"+
		"\u0000\u0000\u0000\u0518\u051a\u0005\u0083\u0000\u0000\u0519\u051b\u0005"+
		"z\u0000\u0000\u051a\u0519\u0001\u0000\u0000\u0000\u051a\u051b\u0001\u0000"+
		"\u0000\u0000\u051b\u00bf\u0001\u0000\u0000\u0000\u051c\u051e\u0003\u0098"+
		"L\u0000\u051d\u051c\u0001\u0000\u0000\u0000\u051d\u051e\u0001\u0000\u0000"+
		"\u0000\u051e\u051f\u0001\u0000\u0000\u0000\u051f\u0521\u0005\u0093\u0000"+
		"\u0000\u0520\u0522\u0005~\u0000\u0000\u0521\u0520\u0001\u0000\u0000\u0000"+
		"\u0521\u0522\u0001\u0000\u0000\u0000\u0522\u0525\u0001\u0000\u0000\u0000"+
		"\u0523\u0524\u0005{\u0000\u0000\u0524\u0526\u0003\u0096K\u0000\u0525\u0523"+
		"\u0001\u0000\u0000\u0000\u0525\u0526\u0001\u0000\u0000\u0000\u0526\u0527"+
		"\u0001\u0000\u0000\u0000\u0527\u0528\u0005Z\u0000\u0000\u0528\u0529\u0005"+
		"P\u0000\u0000\u0529\u052c\u0005\u0082\u0000\u0000\u052a\u052d\u0003\u001c"+
		"\u000e\u0000\u052b\u052d\u0003\u008aE\u0000\u052c\u052a\u0001\u0000\u0000"+
		"\u0000\u052c\u052b\u0001\u0000\u0000\u0000\u052d\u052e\u0001\u0000\u0000"+
		"\u0000\u052e\u0530\u0005\u0083\u0000\u0000\u052f\u0531\u0005z\u0000\u0000"+
		"\u0530\u052f\u0001\u0000\u0000\u0000\u0530\u0531\u0001\u0000\u0000\u0000"+
		"\u0531\u00c1\u0001\u0000\u0000\u0000\u0532\u0533\u0005G\u0000\u0000\u0533"+
		"\u0534\u0005}\u0000\u0000\u0534\u0535\u0007\u000f\u0000\u0000\u0535\u0537"+
		"\u0005\u0082\u0000\u0000\u0536\u0538\u0003r9\u0000\u0537\u0536\u0001\u0000"+
		"\u0000\u0000\u0537\u0538\u0001\u0000\u0000\u0000\u0538\u0539\u0001\u0000"+
		"\u0000\u0000\u0539\u053a\u0005\u0083\u0000\u0000\u053a\u00c3\u0001\u0000"+
		"\u0000\u0000\u053b\u053c\u0005H\u0000\u0000\u053c\u053d\u0005}\u0000\u0000"+
		"\u053d\u053e\u0007\u000f\u0000\u0000\u053e\u0540\u0005\u0082\u0000\u0000"+
		"\u053f\u0541\u0003r9\u0000\u0540\u053f\u0001\u0000\u0000\u0000\u0540\u0541"+
		"\u0001\u0000\u0000\u0000\u0541\u0542\u0001\u0000\u0000\u0000\u0542\u0543"+
		"\u0005\u0083\u0000\u0000\u0543\u00c5\u0001\u0000\u0000\u0000\u0544\u0545"+
		"\u0005.\u0000\u0000\u0545\u0547\u0005}\u0000\u0000\u0546\u0544\u0001\u0000"+
		"\u0000\u0000\u0546\u0547\u0001\u0000\u0000\u0000\u0547\u0548\u0001\u0000"+
		"\u0000\u0000\u0548\u0549\u0005\u0093\u0000\u0000\u0549\u054a\u0005}\u0000"+
		"\u0000\u054a\u054b\u0005S\u0000\u0000\u054b\u054d\u0005\u0082\u0000\u0000"+
		"\u054c\u054e\u0003r9\u0000\u054d\u054c\u0001\u0000\u0000\u0000\u054d\u054e"+
		"\u0001\u0000\u0000\u0000\u054e\u054f\u0001\u0000\u0000\u0000\u054f\u0551"+
		"\u0005\u0083\u0000\u0000\u0550\u0552\u0005z\u0000\u0000\u0551\u0550\u0001"+
		"\u0000\u0000\u0000\u0551\u0552\u0001\u0000\u0000\u0000\u0552\u00c7\u0001"+
		"\u0000\u0000\u0000\u0553\u0554\u0005.\u0000\u0000\u0554\u0556\u0005}\u0000"+
		"\u0000\u0555\u0553\u0001\u0000\u0000\u0000\u0555\u0556\u0001\u0000\u0000"+
		"\u0000\u0556\u0557\u0001\u0000\u0000\u0000\u0557\u0558\u0005\u0093\u0000"+
		"\u0000\u0558\u0559\u0005}\u0000\u0000\u0559\u055a\u0005R\u0000\u0000\u055a"+
		"\u055c\u0005\u0082\u0000\u0000\u055b\u055d\u0003r9\u0000\u055c\u055b\u0001"+
		"\u0000\u0000\u0000\u055c\u055d\u0001\u0000\u0000\u0000\u055d\u055e\u0001"+
		"\u0000\u0000\u0000\u055e\u055f\u0005\u0083\u0000\u0000\u055f\u00c9\u0001"+
		"\u0000\u0000\u0000\u00a0\u00cd\u00d2\u00d4\u00e0\u00ed\u00f6\u00fa\u00fc"+
		"\u0102\u0114\u011a\u011e\u0121\u0128\u012e\u0133\u013c\u0141\u0149\u014d"+
		"\u0151\u0156\u015b\u015d\u0166\u0169\u0173\u0177\u0188\u018e\u0191\u019b"+
		"\u019f\u01c5\u01cb\u01ce\u01d8\u01dc\u01e4\u01ea\u01f2\u01f5\u01ff\u0203"+
		"\u020d\u0210\u021a\u021e\u0225\u022f\u0232\u023a\u023d\u0246\u024a\u0250"+
		"\u0252\u0258\u025c\u0260\u0264\u0268\u026f\u0275\u027a\u0281\u028b\u028f"+
		"\u0299\u029c\u02a5\u02aa\u02b1\u02be\u02c2\u02c7\u02d3\u02d8\u02e4\u02e8"+
		"\u02f6\u02fa\u030e\u0313\u031b\u0324\u032b\u032f\u0333\u0357\u035e\u0366"+
		"\u036a\u036f\u0373\u037b\u037e\u0381\u038b\u038f\u0398\u039c\u03a5\u03a9"+
		"\u03af\u03b3\u03bf\u03c5\u03cd\u03e5\u0403\u0405\u040e\u041a\u0421\u0429"+
		"\u0432\u0439\u043c\u0442\u0451\u045a\u045c\u0471\u0474\u0478\u0480\u0483"+
		"\u048a\u0494\u0499\u04a1\u04a4\u04a7\u04b1\u04b5\u04ce\u04e2\u04e9\u04ef"+
		"\u04f6\u04fa\u0500\u0506\u050a\u0510\u0516\u051a\u051d\u0521\u0525\u052c"+
		"\u0530\u0537\u0540\u0546\u054d\u0551\u0555\u055c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}