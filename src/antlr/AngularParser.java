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
		IMPLEMENTS=44, CONSTRUCTOR=45, NEW=46, FUNCTION=47, PRIVATE=48, PUBLIC=49, 
		PROTECTED=50, ROUTE_CONFIG=51, GT=52, GTE=53, LT=54, LTE=55, ASSIGN=56, 
		NOT=57, EQ=58, NEQ=59, STRICT_EQ=60, STRICT_NEQ=61, PLUS=62, MINUS=63, 
		MULT=64, DIV=65, MOD=66, AND=67, OR=68, BIT_AND=69, BIT_XOR=70, BIT_OR=71, 
		PLUS_ASSIGN=72, MINUS_ASSIGN=73, MULTIPLY_ASSIGN=74, DIVIDE_ASSIGN=75, 
		MODULUS_ASSIGN=76, POWER_ASSIGN=77, RIGHT_SHIFT_ARITHMETIC_ASSIGN=78, 
		LEFT_SHIFT_ARITHMETIC_ASSIGN=79, RIGHT_SHIFT_LOGICAL_ASSIGN=80, BIT_AND_ASSIGN=81, 
		BIT_XOR_ASSIGN=82, BIT_OR_ASSIGN=83, ARROW=84, NULLCOALESCE=85, PLUS_PLUS=86, 
		MINUS_MINUS=87, SEMI=88, COLON=89, COMMA=90, DOT=91, QUES=92, AT=93, HASH_TAG=94, 
		QUOTE=95, LPAREN=96, RPAREN=97, LBRACE=98, RBRACE=99, LBRACK=100, RBRACK=101, 
		FOR=102, DO=103, WHILE=104, BREAK=105, CONTINUE=106, OF=107, IN=108, STRING=109, 
		NUMBER=110, BOOL=111, NULL=112, IDENTIFIER=113, HTML_TEMPLATE=114, CSS_TEMPLATE=115, 
		OPEN_TAG=116, CLOSE_TAG=117, SLASH=118, EQUALS=119, COL=120, STRING_HTML=121, 
		QUES_HTML=122, INTERPOLATION_START=123, INTERPOLATION_END=124, BINDING=125, 
		EVENT=126, TWOBIND=127, NGFOR=128, NGIF=129, DDIRECTIVE=130, P=131, REFERENCE_VAR=132, 
		ATTRIBUTE=133, HTML_CLASS=134, WHITESPACE=135, COMMENT=136, END_HTML=137, 
		THIS=138, PATH=139, COMPONENT_ROUTE=140, REDIRECT_TO=141, PATH_MATCH=142, 
		CHILDREN=143, LAZY_LOAD=144, CAN_ACTIVATE=145, CAN_DEACTIVATE=146, OUTLET=147;
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
		RULE_structuralDirective = 85, RULE_routingDeclaration = 86, RULE_routeDefinition = 87, 
		RULE_routeProperty = 88;
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
			"routingDeclaration", "routeDefinition", "routeProperty"
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
			"'extends'", "'implements'", "'constructor'", "'new'", "'function'", 
			"'private'", "'public'", "'protected'", "'Routes'", null, "'>='", null, 
			"'<='", null, "'!'", "'=='", "'!='", "'==='", "'!=='", "'+'", "'-'", 
			"'*'", null, "'%'", "'&&'", "'||'", "'&'", "'^'", null, "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'**='", "'>>='", "'<<='", "'>>>='", "'&='", 
			"'^='", "'|='", "'=>'", "'??'", "'++'", "'--'", "';'", null, "','", "'.'", 
			null, "'@'", "'#'", null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'for'", 
			"'do'", "'while'", "'break'", "'continue'", "'of'", "'in'", null, null, 
			null, "'null'", null, null, null, null, null, null, null, null, null, 
			null, "'{{'", "'}}'", null, null, null, "'*ngFor'", "'*ngIf'", null, 
			null, null, null, null, null, null, "'`'"
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
			"CONSTRUCTOR", "NEW", "FUNCTION", "PRIVATE", "PUBLIC", "PROTECTED", "ROUTE_CONFIG", 
			"GT", "GTE", "LT", "LTE", "ASSIGN", "NOT", "EQ", "NEQ", "STRICT_EQ", 
			"STRICT_NEQ", "PLUS", "MINUS", "MULT", "DIV", "MOD", "AND", "OR", "BIT_AND", 
			"BIT_XOR", "BIT_OR", "PLUS_ASSIGN", "MINUS_ASSIGN", "MULTIPLY_ASSIGN", 
			"DIVIDE_ASSIGN", "MODULUS_ASSIGN", "POWER_ASSIGN", "RIGHT_SHIFT_ARITHMETIC_ASSIGN", 
			"LEFT_SHIFT_ARITHMETIC_ASSIGN", "RIGHT_SHIFT_LOGICAL_ASSIGN", "BIT_AND_ASSIGN", 
			"BIT_XOR_ASSIGN", "BIT_OR_ASSIGN", "ARROW", "NULLCOALESCE", "PLUS_PLUS", 
			"MINUS_MINUS", "SEMI", "COLON", "COMMA", "DOT", "QUES", "AT", "HASH_TAG", 
			"QUOTE", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"FOR", "DO", "WHILE", "BREAK", "CONTINUE", "OF", "IN", "STRING", "NUMBER", 
			"BOOL", "NULL", "IDENTIFIER", "HTML_TEMPLATE", "CSS_TEMPLATE", "OPEN_TAG", 
			"CLOSE_TAG", "SLASH", "EQUALS", "COL", "STRING_HTML", "QUES_HTML", "INTERPOLATION_START", 
			"INTERPOLATION_END", "BINDING", "EVENT", "TWOBIND", "NGFOR", "NGIF", 
			"DDIRECTIVE", "P", "REFERENCE_VAR", "ATTRIBUTE", "HTML_CLASS", "WHITESPACE", 
			"COMMENT", "END_HTML", "THIS", "PATH", "COMPONENT_ROUTE", "REDIRECT_TO", 
			"PATH_MATCH", "CHILDREN", "LAZY_LOAD", "CAN_ACTIVATE", "CAN_DEACTIVATE", 
			"OUTLET"
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
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(178);
				importStatement();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465381088587414560L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424768675L) != 0) {
				{
				setState(186);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(184);
					declaration();
					}
					break;
				case 2:
					{
					setState(185);
					statement();
					}
					break;
				}
				}
				setState(190);
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
			setState(191);
			match(IMPORT);
			setState(192);
			importDeclaration();
			setState(193);
			match(FROM);
			setState(194);
			match(STRING);
			setState(195);
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
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new DefaultSpecifierDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				importDefaultSpecifier();
				}
				break;
			case 2:
				_localctx = new NamespaceSpecifierDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				importNamespaceSpecifier();
				}
				break;
			case 3:
				_localctx = new NamedSpecifierDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
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
			setState(202);
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
			setState(204);
			match(MULT);
			setState(205);
			match(AS);
			setState(206);
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
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0 || _la==IDENTIFIER) {
				{
				{
				setState(208);
				importSpecifier();
				setState(209);
				match(COMMA);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(216);
			match(LBRACE);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0 || _la==IDENTIFIER) {
				{
				setState(217);
				importSpecifier();
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(218);
						match(COMMA);
						setState(219);
						importSpecifier();
						}
						} 
					}
					setState(224);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(225);
					match(COMMA);
					}
				}

				}
			}

			setState(230);
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
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentifierImportSpecifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(IDENTIFIER);
				}
				break;
			case PLATFORM_BROWSER_DYNAMIC:
			case BOOTSTRAP_MODULE:
			case BOOTSTRAP_APPLICATION:
				_localctx = new BootstrapImportSpecifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
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
			setState(236);
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
	public static class RoutingDeclContext extends DeclarationContext {
		public RoutingDeclarationContext routingDeclaration() {
			return getRuleContext(RoutingDeclarationContext.class,0);
		}
		public RoutingDeclContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRoutingDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRoutingDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRoutingDecl(this);
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
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new NgModuleDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				ngModuleDeclaration();
				}
				break;
			case 2:
				_localctx = new ComponentDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				componentDeclaration();
				}
				break;
			case 3:
				_localctx = new PipeDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				pipeDeclaration();
				}
				break;
			case 4:
				_localctx = new InjectableDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				injectableDeclaration();
				}
				break;
			case 5:
				_localctx = new DirectiveDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				directiveDeclaration();
				}
				break;
			case 6:
				_localctx = new InterfaceDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
				interfaceDeclaration();
				}
				break;
			case 7:
				_localctx = new ClassDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(244);
				classDeclaration();
				}
				break;
			case 8:
				_localctx = new EnumDeclContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(245);
				enumDeclaration();
				}
				break;
			case 9:
				_localctx = new VariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(246);
				variableDeclaration();
				}
				break;
			case 10:
				_localctx = new FunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(247);
				functionDeclaration();
				}
				break;
			case 11:
				_localctx = new RoutingDeclContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(248);
				routingDeclaration();
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
			setState(251);
			varHelper();
			setState(252);
			match(IDENTIFIER);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(253);
				match(COLON);
				setState(254);
				typeAnnotation();
				}
			}

			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(257);
				match(ASSIGN);
				setState(258);
				initialization();
				}
			}

			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(261);
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
			setState(264);
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
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new NormalFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				normalFunction();
				}
				break;
			case 2:
				_localctx = new AnonymousFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				anonymousFunction();
				}
				break;
			case 3:
				_localctx = new ArrowFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
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
			setState(271);
			match(FUNCTION);
			setState(272);
			match(IDENTIFIER);
			setState(273);
			match(LPAREN);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465389399282024448L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424309923L) != 0) {
				{
				setState(274);
				parameterList();
				}
			}

			setState(277);
			match(RPAREN);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(278);
				match(COLON);
				setState(279);
				typeAnnotation();
				}
			}

			setState(282);
			match(LBRACE);
			setState(283);
			block();
			setState(284);
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
			setState(286);
			match(FUNCTION);
			setState(287);
			match(LPAREN);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465389399282024448L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424309923L) != 0) {
				{
				setState(288);
				parameterList();
				}
			}

			setState(291);
			match(RPAREN);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(292);
				match(COLON);
				setState(293);
				typeAnnotation();
				}
			}

			setState(296);
			match(LBRACE);
			setState(297);
			block();
			setState(298);
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
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				{
				setState(300);
				match(LPAREN);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465389399282024448L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424309923L) != 0) {
					{
					setState(301);
					parameterList();
					}
				}

				setState(304);
				match(RPAREN);
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(305);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(308);
				match(COLON);
				setState(309);
				typeAnnotation();
				}
			}

			setState(312);
			match(ARROW);
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(313);
				statement();
				}
				break;
			case 2:
				{
				setState(314);
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
			setState(317);
			match(LBRACE);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465389334924623872L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424768675L) != 0) {
				{
				setState(320);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLATFORM_BROWSER_DYNAMIC:
				case BOOTSTRAP_MODULE:
				case BOOTSTRAP_APPLICATION:
				case IF:
				case RETURN:
				case THROW:
				case CONSOLE:
				case NEW:
				case FUNCTION:
				case PRIVATE:
				case PUBLIC:
				case PROTECTED:
				case NOT:
				case PLUS:
				case MINUS:
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
				case CSS_TEMPLATE:
				case THIS:
					{
					setState(318);
					statement();
					}
					break;
				case LET:
				case CONST:
					{
					setState(319);
					variableDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
			setState(327);
			match(MODULE);
			setState(328);
			match(LPAREN);
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(329);
				match(LBRACE);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 3768320L) != 0) {
					{
					setState(330);
					moduleMetadata();
					}
				}

				setState(333);
				match(RBRACE);
				}
			}

			setState(336);
			match(RPAREN);
			setState(337);
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
			setState(339);
			metadataModuleProperty();
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(340);
					match(COMMA);
					setState(341);
					metadataModuleProperty();
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(347);
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
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOTSTRAP:
				_localctx = new BootstrapPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				match(BOOTSTRAP);
				setState(351);
				match(COLON);
				setState(352);
				array();
				}
				break;
			case DECLARATIONS:
				_localctx = new DeclarationsModulePropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(DECLARATIONS);
				setState(354);
				match(COLON);
				setState(355);
				array();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsModulePropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
				match(IMPORTS);
				setState(357);
				match(COLON);
				setState(358);
				array();
				}
				break;
			case EXPORTS:
				_localctx = new ExportsModulePropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(359);
				match(EXPORTS);
				setState(360);
				match(COLON);
				setState(361);
				array();
				}
				break;
			case PROVIDERS:
				_localctx = new ProvidersModulePropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(362);
				match(PROVIDERS);
				setState(363);
				match(COLON);
				setState(364);
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
			setState(367);
			match(COMPONENT);
			setState(368);
			match(LPAREN);
			setState(374);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(369);
				match(LBRACE);
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 6290432L) != 0) {
					{
					setState(370);
					componentMetadata();
					}
				}

				setState(373);
				match(RBRACE);
				}
			}

			setState(376);
			match(RPAREN);
			setState(377);
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
			setState(379);
			metadataComponentProperty();
			setState(384);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(380);
					match(COMMA);
					setState(381);
					metadataComponentProperty();
					}
					} 
				}
				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(387);
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
			setState(426);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(SELECTOR);
				setState(391);
				match(COLON);
				setState(392);
				match(STRING);
				}
				break;
			case TEMPLATE_URL:
				_localctx = new TemplateUrlPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				match(TEMPLATE_URL);
				setState(394);
				match(COLON);
				setState(395);
				match(STRING);
				}
				break;
			case TEMPLATE:
				_localctx = new TemplatePropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
				match(TEMPLATE);
				setState(397);
				match(COLON);
				setState(398);
				htmlTemplate();
				}
				break;
			case STYLE_URLS:
				_localctx = new StyleUrlsPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				match(STYLE_URLS);
				setState(400);
				match(COLON);
				setState(401);
				array();
				}
				break;
			case STYLES:
				_localctx = new StylesPropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(402);
				match(STYLES);
				setState(403);
				match(COLON);
				setState(404);
				array();
				}
				break;
			case STANDALONE:
				_localctx = new StandalonePropertyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(405);
				match(STANDALONE);
				setState(406);
				match(COLON);
				setState(407);
				match(BOOL);
				}
				break;
			case INPUTS:
				_localctx = new InputsPropertyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(408);
				match(INPUTS);
				setState(409);
				match(COLON);
				setState(410);
				array();
				}
				break;
			case OUTPUTS:
				_localctx = new OutputsPropertyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(411);
				match(OUTPUTS);
				setState(412);
				match(COLON);
				setState(413);
				array();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(414);
				match(IMPORTS);
				setState(415);
				match(COLON);
				setState(416);
				array();
				}
				break;
			case EXPORTS:
				_localctx = new ExportsComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(417);
				match(EXPORTS);
				setState(418);
				match(COLON);
				setState(419);
				array();
				}
				break;
			case PROVIDERS:
				_localctx = new ProvidersComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(420);
				match(PROVIDERS);
				setState(421);
				match(COLON);
				setState(422);
				array();
				}
				break;
			case DECLARATIONS:
				_localctx = new DeclarationsComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(423);
				match(DECLARATIONS);
				setState(424);
				match(COLON);
				setState(425);
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
			setState(428);
			match(DIRECTIVE);
			setState(429);
			match(LPAREN);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(430);
				match(LBRACE);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SELECTOR || _la==IDENTIFIER) {
					{
					setState(431);
					directiveMetadata();
					}
				}

				setState(434);
				match(RBRACE);
				}
			}

			setState(437);
			match(RPAREN);
			setState(438);
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
			setState(440);
			directiveMetadataProperty();
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(441);
					match(COMMA);
					setState(442);
					directiveMetadataProperty();
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(448);
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
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorDirectivePropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				match(SELECTOR);
				setState(452);
				match(COLON);
				setState(453);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				match(IDENTIFIER);
				setState(455);
				match(COLON);
				setState(456);
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
			setState(459);
			match(AT);
			setState(460);
			match(IDENTIFIER);
			setState(461);
			match(LPAREN);
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465389399282024448L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424309923L) != 0) {
				{
				setState(462);
				parameterList();
				}
			}

			setState(465);
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
			setState(467);
			match(PIPE);
			setState(468);
			match(LPAREN);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(469);
				match(LBRACE);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(470);
					pipeMetadata();
					}
				}

				setState(473);
				match(RBRACE);
				}
			}

			setState(476);
			match(RPAREN);
			setState(477);
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
			setState(479);
			pipeMetadataProperty();
			setState(484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(480);
					match(COMMA);
					setState(481);
					pipeMetadataProperty();
					}
					} 
				}
				setState(486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(487);
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
			setState(490);
			match(IDENTIFIER);
			setState(491);
			match(COLON);
			setState(492);
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
			setState(494);
			match(INJECTABLE);
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
					injectableMetadata();
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
			setState(506);
			injectableMetadataProperty();
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(507);
					match(COMMA);
					setState(508);
					injectableMetadataProperty();
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(521);
				match(EXPORT);
				}
			}

			setState(524);
			match(CLASS);
			setState(525);
			match(IDENTIFIER);
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(526);
				match(EXTENDS);
				setState(527);
				match(IDENTIFIER);
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(528);
					match(COMMA);
					setState(529);
					match(IDENTIFIER);
					}
					}
					setState(534);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(537);
				match(IMPLEMENTS);
				setState(538);
				match(IDENTIFIER);
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(539);
					match(COMMA);
					setState(540);
					match(IDENTIFIER);
					}
					}
					setState(545);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(548);
			match(LBRACE);
			setState(549);
			classBody();
			setState(550);
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
			setState(555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(552);
					propertyDeclaration();
					}
					} 
				}
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRUCTOR) {
				{
				setState(558);
				constructorDeclaration();
				}
			}

			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465389334924623872L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424768675L) != 0) {
				{
				setState(565);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(561);
					methodDeclaration();
					}
					break;
				case 2:
					{
					setState(562);
					statement();
					}
					break;
				case 3:
					{
					setState(563);
					variableDeclaration();
					}
					break;
				case 4:
					{
					setState(564);
					functionDeclaration();
					}
					break;
				}
				}
				setState(569);
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
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(570);
				decorator();
				}
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0) {
				{
				setState(576);
				accessModifier();
				}
			}

			setState(579);
			match(IDENTIFIER);
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==QUES) {
				{
				setState(581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUES) {
					{
					setState(580);
					match(QUES);
					}
				}

				setState(583);
				match(COLON);
				setState(584);
				typeAnnotation();
				}
			}

			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(587);
				match(ASSIGN);
				setState(588);
				initialization();
				}
			}

			setState(591);
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
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
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
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(593);
				decorator();
				}
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0) {
				{
				setState(599);
				accessModifier();
				}
			}

			setState(602);
			match(IDENTIFIER);
			setState(603);
			match(LPAREN);
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465389399282024448L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424309923L) != 0) {
				{
				setState(604);
				parameterList();
				}
			}

			setState(607);
			match(RPAREN);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(608);
				match(COLON);
				setState(609);
				typeAnnotation();
				}
			}

			setState(612);
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
			setState(614);
			match(CONSTRUCTOR);
			setState(615);
			match(LPAREN);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465389399282024448L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424309923L) != 0) {
				{
				setState(616);
				parameterList();
				}
			}

			setState(619);
			match(RPAREN);
			setState(620);
			match(LBRACE);
			setState(621);
			constructorBody();
			setState(622);
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
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465389336535236608L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424768675L) != 0) {
				{
				{
				setState(624);
				statement();
				}
				}
				setState(629);
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
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(630);
				match(EXPORT);
				}
			}

			setState(633);
			match(INTERFACE);
			setState(634);
			match(IDENTIFIER);
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(635);
				match(EXTENDS);
				setState(636);
				match(IDENTIFIER);
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(637);
					match(COMMA);
					setState(638);
					match(IDENTIFIER);
					}
					}
					setState(643);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(646);
			match(LBRACE);
			setState(647);
			interfaceBody();
			setState(648);
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
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(650);
				interfaceProperty();
				}
				}
				setState(655);
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
			setState(656);
			match(IDENTIFIER);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUES) {
				{
				setState(657);
				match(QUES);
				}
			}

			setState(660);
			match(COLON);
			setState(661);
			typeAnnotation();
			setState(662);
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
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(664);
				match(EXPORT);
				}
			}

			setState(667);
			match(ENUM);
			setState(668);
			match(IDENTIFIER);
			setState(669);
			match(LBRACE);
			setState(670);
			enumBody();
			setState(671);
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
			setState(673);
			enumProperty();
			setState(678);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(674);
					match(COMMA);
					setState(675);
					enumProperty();
					}
					} 
				}
				setState(680);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(681);
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
			setState(684);
			match(IDENTIFIER);
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(685);
				match(ASSIGN);
				setState(686);
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
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				_localctx = new AssignmentStContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				assignment();
				}
				break;
			case 2:
				_localctx = new PrintStContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				printStatement();
				}
				break;
			case 3:
				_localctx = new ReturnStContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(691);
				returnStatement();
				}
				break;
			case 4:
				_localctx = new ThrowStContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(692);
				throwStatement();
				}
				break;
			case 5:
				_localctx = new ConditionalStContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(693);
				conditionalStatement();
				}
				break;
			case 6:
				_localctx = new IterationStContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(694);
				iterationStatement();
				}
				break;
			case 7:
				_localctx = new BootstrapCallStContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(695);
				bootstrapCall();
				}
				break;
			case 8:
				_localctx = new FunctionCallStContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(696);
				functionCall();
				}
				break;
			case 9:
				_localctx = new ExpressionStContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(697);
				expression(0);
				setState(699);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(698);
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
			setState(703);
			memberAccess();
			setState(704);
			match(ASSIGN);
			setState(705);
			initialization();
			setState(706);
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
			setState(708);
			match(CONSOLE);
			setState(709);
			match(DOT);
			setState(710);
			_la = _input.LA(1);
			if ( !(_la==LOG || _la==ERROR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(711);
			match(LPAREN);
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465389399282024448L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424309923L) != 0) {
				{
				setState(712);
				parameterList();
				}
			}

			setState(715);
			match(RPAREN);
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(716);
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
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(RETURN);
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465389399282024448L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424309923L) != 0) {
				{
				setState(720);
				expression(0);
				}
			}

			setState(723);
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
			setState(725);
			match(THROW);
			setState(726);
			expression(0);
			setState(727);
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
			setState(729);
			ifStatement();
			setState(733);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(730);
					elseIfStatement();
					}
					} 
				}
				setState(735);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(736);
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
			setState(739);
			match(IF);
			setState(740);
			match(LPAREN);
			setState(741);
			expression(0);
			setState(742);
			match(RPAREN);
			setState(743);
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
			setState(745);
			match(ELSE);
			setState(746);
			match(IF);
			setState(747);
			match(LPAREN);
			setState(748);
			expression(0);
			setState(749);
			match(RPAREN);
			setState(750);
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
			setState(752);
			match(ELSE);
			setState(753);
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
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(755);
				statement();
				}
				break;
			case 2:
				{
				setState(756);
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
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
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
			setState(759);
			match(IDENTIFIER);
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(760);
				genericType();
				}
			}

			setState(763);
			match(LPAREN);
			setState(765);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465389399282024448L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424309923L) != 0) {
				{
				setState(764);
				parameterList();
				}
			}

			setState(767);
			match(RPAREN);
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(768);
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
			setState(771);
			bootstrapSpecifier();
			setState(772);
			match(LPAREN);
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465389399282024448L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424309923L) != 0) {
				{
				setState(773);
				parameterList();
				}
			}

			setState(776);
			match(RPAREN);
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(777);
				match(DOT);
				setState(778);
				match(CATCH);
				setState(779);
				match(LPAREN);
				setState(780);
				arrowFunction();
				setState(781);
				match(RPAREN);
				}
			}

			setState(785);
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
			setState(834);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				_localctx = new StandardForLoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(787);
				match(FOR);
				setState(788);
				match(LPAREN);
				setState(790);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET || _la==CONST) {
					{
					setState(789);
					variableDeclaration();
					}
				}

				setState(792);
				match(SEMI);
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465389399282024448L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424309923L) != 0) {
					{
					setState(793);
					expression(0);
					}
				}

				setState(796);
				match(SEMI);
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465389399282024448L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424309923L) != 0) {
					{
					setState(797);
					expression(0);
					}
				}

				setState(800);
				match(RPAREN);
				setState(801);
				statementBody();
				}
				break;
			case 2:
				_localctx = new ForOfLoopContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				match(FOR);
				setState(803);
				match(LPAREN);
				setState(804);
				varHelper();
				setState(805);
				match(IDENTIFIER);
				setState(806);
				match(OF);
				setState(807);
				match(IDENTIFIER);
				setState(808);
				match(RPAREN);
				setState(809);
				statementBody();
				}
				break;
			case 3:
				_localctx = new ForInLoopContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(811);
				match(FOR);
				setState(812);
				match(LPAREN);
				setState(813);
				varHelper();
				setState(814);
				match(IDENTIFIER);
				setState(815);
				match(IN);
				setState(816);
				match(IDENTIFIER);
				setState(817);
				match(RPAREN);
				setState(818);
				statementBody();
				}
				break;
			case 4:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(820);
				match(WHILE);
				setState(821);
				match(LPAREN);
				setState(822);
				expression(0);
				setState(823);
				match(RPAREN);
				setState(824);
				statementBody();
				}
				break;
			case 5:
				_localctx = new DoWhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(826);
				match(DO);
				setState(827);
				statementBody();
				setState(828);
				match(WHILE);
				setState(829);
				match(LPAREN);
				setState(830);
				expression(0);
				setState(831);
				match(RPAREN);
				setState(832);
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
			setState(836);
			parameter();
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(837);
				match(COMMA);
				setState(838);
				parameter();
				}
				}
				setState(843);
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
			setState(844);
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
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(846);
				decorator();
				}
				}
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0) {
				{
				setState(852);
				accessModifier();
				}
			}

			setState(855);
			match(IDENTIFIER);
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(856);
				match(COLON);
				setState(857);
				typeAnnotation();
				}
				break;
			}
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(860);
				match(ASSIGN);
				setState(861);
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
			setState(864);
			match(LBRACK);
			setState(873);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465389399282024448L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424309923L) != 0) {
				{
				setState(865);
				expression(0);
				setState(870);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(866);
						match(COMMA);
						setState(867);
						expression(0);
						}
						} 
					}
					setState(872);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				}
			}

			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(875);
				match(COMMA);
				}
			}

			setState(878);
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
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				_localctx = new PrimaryValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				primary();
				}
				break;
			case 2:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				array();
				}
				break;
			case 3:
				_localctx = new ArrayAccessValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(882);
				arrayAccess();
				}
				break;
			case 4:
				_localctx = new MemberAccessValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(883);
				memberAccess();
				}
				break;
			case 5:
				_localctx = new ObjectValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(884);
				object();
				}
				break;
			case 6:
				_localctx = new ObjectInstantiationValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(885);
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
			setState(888);
			match(LBRACE);
			setState(890);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(889);
				attributes();
				}
			}

			setState(892);
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
			setState(894);
			attribute();
			setState(899);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(895);
					match(COMMA);
					setState(896);
					attribute();
					}
					} 
				}
				setState(901);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(902);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			match(IDENTIFIER);
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(906);
				match(COLON);
				setState(907);
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
			setState(910);
			match(NEW);
			setState(911);
			match(IDENTIFIER);
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(912);
				genericType();
				}
			}

			setState(915);
			match(LPAREN);
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & -4465389399282024448L) != 0 || (((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 4503600424309923L) != 0) {
				{
				setState(916);
				parameterList();
				}
			}

			setState(919);
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
			setState(927);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new MemberAccessIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(921);
				match(IDENTIFIER);
				setState(923);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(922);
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
				setState(925);
				match(THIS);
				setState(926);
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
			setState(929);
			match(IDENTIFIER);
			setState(930);
			match(LBRACK);
			setState(931);
			expression(0);
			setState(932);
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
			setState(934);
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
			setState(938);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case STRING:
			case NUMBER:
			case BOOL:
			case NULL:
			case CSS_TEMPLATE:
				_localctx = new LiteralPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(936);
				literal();
				}
				break;
			case IDENTIFIER:
				_localctx = new IdentifierPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(937);
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
		public TerminalNode PLUS() { return getToken(AngularParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(AngularParser.MINUS, 0); }
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(AngularParser.BOOL, 0); }
		public TerminalNode NULL() { return getToken(AngularParser.NULL, 0); }
		public TerminalNode CSS_TEMPLATE() { return getToken(AngularParser.CSS_TEMPLATE, 0); }
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
			setState(948);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(940);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(943);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(944);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(945);
				match(BOOL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(946);
				match(NULL);
				}
				break;
			case CSS_TEMPLATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(947);
				match(CSS_TEMPLATE);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(951);
				functionCall();
				setState(953);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(952);
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new FunctionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(955);
				functionDeclaration();
				}
				break;
			case 3:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(956);
				match(PLUS_PLUS);
				setState(957);
				expression(14);
				}
				break;
			case 4:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(958);
				match(MINUS_MINUS);
				setState(959);
				expression(13);
				}
				break;
			case 5:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(960);
				match(NOT);
				setState(961);
				expression(12);
				}
				break;
			case 6:
				{
				_localctx = new MemberAccessExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(962);
				match(DOT);
				setState(963);
				expression(11);
				}
				break;
			case 7:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(964);
				match(LPAREN);
				setState(965);
				expression(0);
				setState(966);
				match(RPAREN);
				}
				break;
			case 8:
				{
				_localctx = new ValueExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(968);
				value();
				}
				break;
			case 9:
				{
				_localctx = new ParameterExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(969);
				parameterDeclaration();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1002);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1000);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(972);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(973);
						_la = _input.LA(1);
						if ( !((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 7L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(974);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(975);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(976);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(977);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(978);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(979);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 67553994410557440L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(980);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(981);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(982);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 4395513236313604096L) != 0) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(983);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(984);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(985);
						match(AND);
						setState(986);
						expression(7);
						}
						break;
					case 6:
						{
						_localctx = new LogicalOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(987);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(988);
						match(OR);
						setState(989);
						expression(6);
						}
						break;
					case 7:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(990);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(991);
						match(QUES);
						setState(992);
						expression(0);
						setState(993);
						match(COLON);
						setState(994);
						expression(5);
						}
						break;
					case 8:
						{
						_localctx = new PostIncrementExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(996);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(997);
						match(PLUS_PLUS);
						}
						break;
					case 9:
						{
						_localctx = new PostDecreaseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(998);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(999);
						match(MINUS_MINUS);
						}
						break;
					}
					} 
				}
				setState(1004);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
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
		public TerminalNode GT() { return getToken(AngularParser.GT, 0); }
		public List<TypeAnnotationContext> typeAnnotation() {
			return getRuleContexts(TypeAnnotationContext.class);
		}
		public TypeAnnotationContext typeAnnotation(int i) {
			return getRuleContext(TypeAnnotationContext.class,i);
		}
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
			setState(1005);
			match(LT);
			{
			setState(1006);
			typeAnnotation();
			setState(1011);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1007);
				match(COMMA);
				setState(1008);
				typeAnnotation();
				}
				}
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(1014);
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
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
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
			setState(1038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				_localctx = new GenericTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				match(IDENTIFIER);
				setState(1017);
				genericType();
				}
				break;
			case 2:
				_localctx = new PipeTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1018);
					match(IDENTIFIER);
					}
					break;
				case 2:
					{
					setState(1019);
					match(NULL);
					}
					break;
				case 3:
					{
					setState(1020);
					literal();
					}
					break;
				}
				setState(1031);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1023);
						match(BIT_OR);
						setState(1027);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
						case 1:
							{
							setState(1024);
							match(IDENTIFIER);
							}
							break;
						case 2:
							{
							setState(1025);
							match(NULL);
							}
							break;
						case 3:
							{
							setState(1026);
							literal();
							}
							break;
						}
						}
						} 
					}
					setState(1033);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				}
				}
				break;
			case 3:
				_localctx = new ArrayTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1034);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1035);
				match(LBRACK);
				setState(1036);
				match(RBRACK);
				}
				break;
			case 4:
				_localctx = new TupleTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1037);
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
			setState(1040);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1970324836974592L) != 0) ) {
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
			setState(1042);
			match(HTML_TEMPLATE);
			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 131201L) != 0) {
				{
				{
				setState(1043);
				element();
				}
				}
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1049);
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
			setState(1062);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				_localctx = new StandardTagElContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1051);
				openTag();
				setState(1055);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1052);
						content();
						}
						} 
					}
					setState(1057);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,124,_ctx);
				}
				setState(1058);
				closeTag();
				}
				break;
			case 2:
				_localctx = new SelfClosingTagElContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1060);
				selfClosingTag();
				}
				break;
			case 3:
				_localctx = new InterpolationElContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1061);
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
			setState(1065);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_TAG) {
				{
				setState(1064);
				match(OPEN_TAG);
				}
			}

			setState(1067);
			tagName();
			setState(1071);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 447L) != 0) {
				{
				{
				setState(1068);
				attributeHTML();
				}
				}
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1074);
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
			setState(1076);
			match(OPEN_TAG);
			setState(1077);
			match(SLASH);
			setState(1078);
			tagName();
			setState(1079);
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
		public TerminalNode CLOSE_TAG() { return getToken(AngularParser.CLOSE_TAG, 0); }
		public List<AttributeHTMLContext> attributeHTML() {
			return getRuleContexts(AttributeHTMLContext.class);
		}
		public AttributeHTMLContext attributeHTML(int i) {
			return getRuleContext(AttributeHTMLContext.class,i);
		}
		public TerminalNode SLASH() { return getToken(AngularParser.SLASH, 0); }
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
			setState(1081);
			match(OPEN_TAG);
			setState(1082);
			tagName();
			setState(1086);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 447L) != 0) {
				{
				{
				setState(1083);
				attributeHTML();
				}
				}
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(1089);
				match(SLASH);
				}
			}

			setState(1092);
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
			setState(1099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				_localctx = new NestedElementContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1094);
				element();
				}
				break;
			case 2:
				_localctx = new PlainTextContentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1095);
				match(ATTRIBUTE);
				setState(1097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COL) {
					{
					setState(1096);
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
			setState(1123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				_localctx = new StandardAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1101);
				match(ATTRIBUTE);
				setState(1102);
				match(EQUALS);
				setState(1103);
				match(STRING_HTML);
				}
				break;
			case 2:
				_localctx = new PropertyBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1104);
				match(BINDING);
				setState(1105);
				match(EQUALS);
				setState(1106);
				match(STRING_HTML);
				}
				break;
			case 3:
				_localctx = new EventBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1107);
				match(EVENT);
				setState(1108);
				match(EQUALS);
				setState(1109);
				match(STRING_HTML);
				}
				break;
			case 4:
				_localctx = new TwoWayBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1110);
				match(TWOBIND);
				setState(1111);
				match(EQUALS);
				setState(1112);
				match(STRING_HTML);
				}
				break;
			case 5:
				_localctx = new StructuralDirectiveAttrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1113);
				structuralDirective();
				setState(1114);
				match(EQUALS);
				setState(1115);
				match(STRING_HTML);
				}
				break;
			case 6:
				_localctx = new TemplateReferenceVariableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1117);
				match(REFERENCE_VAR);
				setState(1120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(1118);
					match(EQUALS);
					setState(1119);
					match(STRING_HTML);
					}
				}

				}
				break;
			case 7:
				_localctx = new AttributeOnlyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1122);
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
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(1125);
				match(ATTRIBUTE);
				setState(1126);
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

			setState(1129);
			match(INTERPOLATION_START);
			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_HTML || _la==ATTRIBUTE) {
				{
				{
				setState(1130);
				interpolationElement();
				}
				setState(1138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==P) {
					{
					{
					setState(1131);
					match(P);
					setState(1133);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==P) {
						{
						setState(1132);
						match(P);
						}
					}

					setState(1135);
					interpolationElement();
					}
					}
					setState(1140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1143);
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
		public InterpolationElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolationElement; }
	 
		public InterpolationElementContext() { }
		public void copyFrom(InterpolationElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryInterpolationElementContext extends InterpolationElementContext {
		public TerminalNode ATTRIBUTE() { return getToken(AngularParser.ATTRIBUTE, 0); }
		public TerminalNode QUES_HTML() { return getToken(AngularParser.QUES_HTML, 0); }
		public List<TerminalNode> STRING_HTML() { return getTokens(AngularParser.STRING_HTML); }
		public TerminalNode STRING_HTML(int i) {
			return getToken(AngularParser.STRING_HTML, i);
		}
		public TerminalNode COL() { return getToken(AngularParser.COL, 0); }
		public TernaryInterpolationElementContext(InterpolationElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTernaryInterpolationElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTernaryInterpolationElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTernaryInterpolationElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandardInterpolationElementContext extends InterpolationElementContext {
		public List<TerminalNode> ATTRIBUTE() { return getTokens(AngularParser.ATTRIBUTE); }
		public TerminalNode ATTRIBUTE(int i) {
			return getToken(AngularParser.ATTRIBUTE, i);
		}
		public TerminalNode COL() { return getToken(AngularParser.COL, 0); }
		public TerminalNode STRING_HTML() { return getToken(AngularParser.STRING_HTML, 0); }
		public StandardInterpolationElementContext(InterpolationElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandardInterpolationElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandardInterpolationElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandardInterpolationElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringInterpolationElementContext extends InterpolationElementContext {
		public TerminalNode STRING_HTML() { return getToken(AngularParser.STRING_HTML, 0); }
		public StringInterpolationElementContext(InterpolationElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStringInterpolationElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStringInterpolationElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStringInterpolationElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationElementContext interpolationElement() throws RecognitionException {
		InterpolationElementContext _localctx = new InterpolationElementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_interpolationElement);
		int _la;
		try {
			setState(1156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				_localctx = new StandardInterpolationElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1145);
				match(ATTRIBUTE);
				setState(1148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COL) {
					{
					setState(1146);
					match(COL);
					setState(1147);
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
				break;
			case 2:
				_localctx = new TernaryInterpolationElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1150);
				match(ATTRIBUTE);
				setState(1151);
				match(QUES_HTML);
				setState(1152);
				match(STRING_HTML);
				setState(1153);
				match(COL);
				setState(1154);
				match(STRING_HTML);
				}
				break;
			case 3:
				_localctx = new StringInterpolationElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1155);
				match(STRING_HTML);
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
			setState(1158);
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
			setState(1160);
			_la = _input.LA(1);
			if ( !((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 7L) != 0) ) {
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
	public static class RoutingDeclarationContext extends ParserRuleContext {
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
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
		}
		public RoutingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routingDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRoutingDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRoutingDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRoutingDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutingDeclarationContext routingDeclaration() throws RecognitionException {
		RoutingDeclarationContext _localctx = new RoutingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_routingDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(1162);
				match(EXPORT);
				}
			}

			setState(1165);
			match(CONST);
			setState(1166);
			match(IDENTIFIER);
			setState(1167);
			match(COLON);
			setState(1168);
			match(ROUTE_CONFIG);
			setState(1169);
			match(ASSIGN);
			setState(1170);
			match(LBRACK);
			setState(1179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(1171);
				routeDefinition();
				setState(1176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1172);
					match(COMMA);
					setState(1173);
					routeDefinition();
					}
					}
					setState(1178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1181);
			match(RBRACK);
			setState(1182);
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
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
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
		enterRule(_localctx, 174, RULE_routeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1184);
			match(LBRACE);
			setState(1193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 34292629505L) != 0) {
				{
				setState(1185);
				routeProperty();
				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1186);
					match(COMMA);
					setState(1187);
					routeProperty();
					}
					}
					setState(1192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1195);
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
		public List<TerminalNode> COMMA() { return getTokens(AngularParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AngularParser.COMMA, i);
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
		enterRule(_localctx, 176, RULE_routeProperty);
		int _la;
		try {
			setState(1238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PATH:
				_localctx = new PathPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1197);
				match(PATH);
				setState(1198);
				match(COLON);
				setState(1199);
				match(STRING);
				}
				break;
			case COMPONENT_ROUTE:
				_localctx = new ComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1200);
				match(COMPONENT_ROUTE);
				setState(1201);
				match(COLON);
				setState(1202);
				match(IDENTIFIER);
				}
				break;
			case REDIRECT_TO:
				_localctx = new RedirectToPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1203);
				match(REDIRECT_TO);
				setState(1204);
				match(COLON);
				setState(1205);
				match(STRING);
				}
				break;
			case PATH_MATCH:
				_localctx = new PathMatchPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1206);
				match(PATH_MATCH);
				setState(1207);
				match(COLON);
				setState(1208);
				match(STRING);
				}
				break;
			case CHILDREN:
				_localctx = new ChildrenPropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1209);
				match(CHILDREN);
				setState(1210);
				match(COLON);
				setState(1211);
				match(LBRACK);
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(1212);
					routeDefinition();
					setState(1217);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1213);
						match(COMMA);
						setState(1214);
						routeDefinition();
						}
						}
						setState(1219);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1222);
				match(RBRACK);
				}
				break;
			case LAZY_LOAD:
				_localctx = new LazyLoadPropertyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1223);
				match(LAZY_LOAD);
				setState(1224);
				match(COLON);
				setState(1225);
				arrowFunction();
				}
				break;
			case CAN_ACTIVATE:
				_localctx = new CanActivatePropertyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1226);
				match(CAN_ACTIVATE);
				setState(1227);
				match(COLON);
				setState(1228);
				array();
				}
				break;
			case CAN_DEACTIVATE:
				_localctx = new CanDeactivatePropertyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(1229);
				match(CAN_DEACTIVATE);
				setState(1230);
				match(COLON);
				setState(1231);
				array();
				}
				break;
			case OUTLET:
				_localctx = new OutletPropertyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(1232);
				match(OUTLET);
				setState(1233);
				match(COLON);
				setState(1234);
				match(STRING);
				}
				break;
			case IDENTIFIER:
				_localctx = new GenericRoutePropertyContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(1235);
				match(IDENTIFIER);
				setState(1236);
				match(COLON);
				setState(1237);
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
		"\u0004\u0001\u0093\u04d9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0001\u0000"+
		"\u0005\u0000\u00b4\b\u0000\n\u0000\f\u0000\u00b7\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u00bb\b\u0000\n\u0000\f\u0000\u00be\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u00c9\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005\u00d4\b\u0005\n\u0005\f\u0005\u00d7\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00dd\b\u0005\n"+
		"\u0005\f\u0005\u00e0\t\u0005\u0001\u0005\u0003\u0005\u00e3\b\u0005\u0003"+
		"\u0005\u00e5\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00eb\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00fa"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0100\b\t\u0001\t\u0001\t"+
		"\u0003\t\u0104\b\t\u0001\t\u0003\t\u0107\b\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u010e\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0114\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u0119\b\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u0122"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0003\r\u0127\b\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u012f\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0133\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u0137\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u013c\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0141\b\u000f\n"+
		"\u000f\f\u000f\u0144\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u014c\b\u0010\u0001\u0010\u0003"+
		"\u0010\u014f\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u0157\b\u0011\n\u0011\f\u0011\u015a\t\u0011"+
		"\u0001\u0011\u0003\u0011\u015d\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u016e\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0174\b\u0013\u0001\u0013\u0003\u0013\u0177\b\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u017f\b\u0014\n\u0014\f\u0014\u0182\t\u0014\u0001\u0014\u0003\u0014"+
		"\u0185\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u01ab\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u01b1\b\u0016\u0001\u0016\u0003\u0016\u01b4\b"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u01bc\b\u0017\n\u0017\f\u0017\u01bf\t\u0017\u0001\u0017"+
		"\u0003\u0017\u01c2\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u01ca\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u01d0\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01d8\b\u001a"+
		"\u0001\u001a\u0003\u001a\u01db\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01e3\b\u001b\n\u001b"+
		"\f\u001b\u01e6\t\u001b\u0001\u001b\u0003\u001b\u01e9\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u01f3\b\u001d\u0001\u001d\u0003\u001d\u01f6\b"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0005\u001e\u01fe\b\u001e\n\u001e\f\u001e\u0201\t\u001e\u0001\u001e"+
		"\u0003\u001e\u0204\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0003 \u020b\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005"+
		" \u0213\b \n \f \u0216\t \u0003 \u0218\b \u0001 \u0001 \u0001 \u0001 "+
		"\u0005 \u021e\b \n \f \u0221\t \u0003 \u0223\b \u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0005!\u022a\b!\n!\f!\u022d\t!\u0001!\u0003!\u0230\b!\u0001!"+
		"\u0001!\u0001!\u0001!\u0005!\u0236\b!\n!\f!\u0239\t!\u0001\"\u0005\"\u023c"+
		"\b\"\n\"\f\"\u023f\t\"\u0001\"\u0003\"\u0242\b\"\u0001\"\u0001\"\u0003"+
		"\"\u0246\b\"\u0001\"\u0001\"\u0003\"\u024a\b\"\u0001\"\u0001\"\u0003\""+
		"\u024e\b\"\u0001\"\u0001\"\u0001#\u0005#\u0253\b#\n#\f#\u0256\t#\u0001"+
		"#\u0003#\u0259\b#\u0001#\u0001#\u0001#\u0003#\u025e\b#\u0001#\u0001#\u0001"+
		"#\u0003#\u0263\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0003$\u026a\b$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001%\u0005%\u0272\b%\n%\f%\u0275\t%\u0001"+
		"&\u0003&\u0278\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u0280"+
		"\b&\n&\f&\u0283\t&\u0003&\u0285\b&\u0001&\u0001&\u0001&\u0001&\u0001\'"+
		"\u0005\'\u028c\b\'\n\'\f\'\u028f\t\'\u0001(\u0001(\u0003(\u0293\b(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001)\u0003)\u029a\b)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0001*\u0005*\u02a5\b*\n*\f*\u02a8\t*\u0001"+
		"*\u0003*\u02ab\b*\u0001+\u0001+\u0001+\u0003+\u02b0\b+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003,\u02bc\b,\u0003"+
		",\u02be\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0003.\u02ca\b.\u0001.\u0001.\u0003.\u02ce\b.\u0001/\u0001/\u0003"+
		"/\u02d2\b/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00011\u00011\u0005"+
		"1\u02dc\b1\n1\f1\u02df\t1\u00011\u00031\u02e2\b1\u00012\u00012\u00012"+
		"\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00014\u00014\u00014\u00015\u00015\u00035\u02f6\b5\u00016\u00016\u0003"+
		"6\u02fa\b6\u00016\u00016\u00036\u02fe\b6\u00016\u00016\u00036\u0302\b"+
		"6\u00017\u00017\u00017\u00037\u0307\b7\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00037\u0310\b7\u00017\u00017\u00018\u00018\u00018\u0003"+
		"8\u0317\b8\u00018\u00018\u00038\u031b\b8\u00018\u00018\u00038\u031f\b"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00038\u0343\b8\u00019\u00019\u00019\u0005"+
		"9\u0348\b9\n9\f9\u034b\t9\u0001:\u0001:\u0001;\u0005;\u0350\b;\n;\f;\u0353"+
		"\t;\u0001;\u0003;\u0356\b;\u0001;\u0001;\u0001;\u0003;\u035b\b;\u0001"+
		";\u0001;\u0003;\u035f\b;\u0001<\u0001<\u0001<\u0001<\u0005<\u0365\b<\n"+
		"<\f<\u0368\t<\u0003<\u036a\b<\u0001<\u0003<\u036d\b<\u0001<\u0001<\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u0377\b=\u0001>\u0001>\u0003"+
		">\u037b\b>\u0001>\u0001>\u0001?\u0001?\u0001?\u0005?\u0382\b?\n?\f?\u0385"+
		"\t?\u0001?\u0003?\u0388\b?\u0001@\u0001@\u0001@\u0003@\u038d\b@\u0001"+
		"A\u0001A\u0001A\u0003A\u0392\bA\u0001A\u0001A\u0003A\u0396\bA\u0001A\u0001"+
		"A\u0001B\u0001B\u0003B\u039c\bB\u0001B\u0001B\u0003B\u03a0\bB\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001E\u0001E\u0003E\u03ab\bE\u0001"+
		"F\u0003F\u03ae\bF\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u03b5\bF\u0001"+
		"G\u0001G\u0001G\u0003G\u03ba\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003"+
		"G\u03cb\bG\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0005"+
		"G\u03e9\bG\nG\fG\u03ec\tG\u0001H\u0001H\u0001H\u0001H\u0005H\u03f2\bH"+
		"\nH\fH\u03f5\tH\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0003"+
		"I\u03fe\bI\u0001I\u0001I\u0001I\u0001I\u0003I\u0404\bI\u0005I\u0406\b"+
		"I\nI\fI\u0409\tI\u0001I\u0001I\u0001I\u0001I\u0003I\u040f\bI\u0001J\u0001"+
		"J\u0001K\u0001K\u0005K\u0415\bK\nK\fK\u0418\tK\u0001K\u0001K\u0001L\u0001"+
		"L\u0005L\u041e\bL\nL\fL\u0421\tL\u0001L\u0001L\u0001L\u0001L\u0003L\u0427"+
		"\bL\u0001M\u0003M\u042a\bM\u0001M\u0001M\u0005M\u042e\bM\nM\fM\u0431\t"+
		"M\u0001M\u0001M\u0001N\u0001N\u0001N\u0001N\u0001N\u0001O\u0001O\u0001"+
		"O\u0005O\u043d\bO\nO\fO\u0440\tO\u0001O\u0003O\u0443\bO\u0001O\u0001O"+
		"\u0001P\u0001P\u0001P\u0003P\u044a\bP\u0003P\u044c\bP\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u0461\bQ\u0001Q\u0003"+
		"Q\u0464\bQ\u0001R\u0001R\u0003R\u0468\bR\u0001R\u0001R\u0001R\u0001R\u0003"+
		"R\u046e\bR\u0001R\u0005R\u0471\bR\nR\fR\u0474\tR\u0003R\u0476\bR\u0001"+
		"R\u0001R\u0001S\u0001S\u0001S\u0003S\u047d\bS\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001S\u0003S\u0485\bS\u0001T\u0001T\u0001U\u0001U\u0001V\u0003"+
		"V\u048c\bV\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0005V\u0497\bV\nV\fV\u049a\tV\u0003V\u049c\bV\u0001V\u0001V\u0001V"+
		"\u0001W\u0001W\u0001W\u0001W\u0005W\u04a5\bW\nW\fW\u04a8\tW\u0003W\u04aa"+
		"\bW\u0001W\u0001W\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001"+
		"X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001"+
		"X\u0005X\u04c0\bX\nX\fX\u04c3\tX\u0003X\u04c5\bX\u0001X\u0001X\u0001X"+
		"\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001"+
		"X\u0001X\u0001X\u0001X\u0003X\u04d7\bX\u0001X\u0000\u0001\u008eY\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u0000\f\u0001"+
		"\u0000\u001a\u001c\u0001\u0000\u001d\u001e\u0002\u0000$$&&\u0001\u0000"+
		">?\u0001\u0000@B\u0001\u000047\u0002\u000088:=\u0001\u0000pq\u0001\u0000"+
		"02\u0001\u0000wx\u0002\u0000yy\u0085\u0085\u0001\u0000\u0080\u0082\u055f"+
		"\u0000\u00b5\u0001\u0000\u0000\u0000\u0002\u00bf\u0001\u0000\u0000\u0000"+
		"\u0004\u00c8\u0001\u0000\u0000\u0000\u0006\u00ca\u0001\u0000\u0000\u0000"+
		"\b\u00cc\u0001\u0000\u0000\u0000\n\u00d5\u0001\u0000\u0000\u0000\f\u00ea"+
		"\u0001\u0000\u0000\u0000\u000e\u00ec\u0001\u0000\u0000\u0000\u0010\u00f9"+
		"\u0001\u0000\u0000\u0000\u0012\u00fb\u0001\u0000\u0000\u0000\u0014\u0108"+
		"\u0001\u0000\u0000\u0000\u0016\u010d\u0001\u0000\u0000\u0000\u0018\u010f"+
		"\u0001\u0000\u0000\u0000\u001a\u011e\u0001\u0000\u0000\u0000\u001c\u0132"+
		"\u0001\u0000\u0000\u0000\u001e\u013d\u0001\u0000\u0000\u0000 \u0147\u0001"+
		"\u0000\u0000\u0000\"\u0153\u0001\u0000\u0000\u0000$\u016d\u0001\u0000"+
		"\u0000\u0000&\u016f\u0001\u0000\u0000\u0000(\u017b\u0001\u0000\u0000\u0000"+
		"*\u01aa\u0001\u0000\u0000\u0000,\u01ac\u0001\u0000\u0000\u0000.\u01b8"+
		"\u0001\u0000\u0000\u00000\u01c9\u0001\u0000\u0000\u00002\u01cb\u0001\u0000"+
		"\u0000\u00004\u01d3\u0001\u0000\u0000\u00006\u01df\u0001\u0000\u0000\u0000"+
		"8\u01ea\u0001\u0000\u0000\u0000:\u01ee\u0001\u0000\u0000\u0000<\u01fa"+
		"\u0001\u0000\u0000\u0000>\u0205\u0001\u0000\u0000\u0000@\u020a\u0001\u0000"+
		"\u0000\u0000B\u022b\u0001\u0000\u0000\u0000D\u023d\u0001\u0000\u0000\u0000"+
		"F\u0254\u0001\u0000\u0000\u0000H\u0266\u0001\u0000\u0000\u0000J\u0273"+
		"\u0001\u0000\u0000\u0000L\u0277\u0001\u0000\u0000\u0000N\u028d\u0001\u0000"+
		"\u0000\u0000P\u0290\u0001\u0000\u0000\u0000R\u0299\u0001\u0000\u0000\u0000"+
		"T\u02a1\u0001\u0000\u0000\u0000V\u02ac\u0001\u0000\u0000\u0000X\u02bd"+
		"\u0001\u0000\u0000\u0000Z\u02bf\u0001\u0000\u0000\u0000\\\u02c4\u0001"+
		"\u0000\u0000\u0000^\u02cf\u0001\u0000\u0000\u0000`\u02d5\u0001\u0000\u0000"+
		"\u0000b\u02d9\u0001\u0000\u0000\u0000d\u02e3\u0001\u0000\u0000\u0000f"+
		"\u02e9\u0001\u0000\u0000\u0000h\u02f0\u0001\u0000\u0000\u0000j\u02f5\u0001"+
		"\u0000\u0000\u0000l\u02f7\u0001\u0000\u0000\u0000n\u0303\u0001\u0000\u0000"+
		"\u0000p\u0342\u0001\u0000\u0000\u0000r\u0344\u0001\u0000\u0000\u0000t"+
		"\u034c\u0001\u0000\u0000\u0000v\u0351\u0001\u0000\u0000\u0000x\u0360\u0001"+
		"\u0000\u0000\u0000z\u0376\u0001\u0000\u0000\u0000|\u0378\u0001\u0000\u0000"+
		"\u0000~\u037e\u0001\u0000\u0000\u0000\u0080\u0389\u0001\u0000\u0000\u0000"+
		"\u0082\u038e\u0001\u0000\u0000\u0000\u0084\u039f\u0001\u0000\u0000\u0000"+
		"\u0086\u03a1\u0001\u0000\u0000\u0000\u0088\u03a6\u0001\u0000\u0000\u0000"+
		"\u008a\u03aa\u0001\u0000\u0000\u0000\u008c\u03b4\u0001\u0000\u0000\u0000"+
		"\u008e\u03ca\u0001\u0000\u0000\u0000\u0090\u03ed\u0001\u0000\u0000\u0000"+
		"\u0092\u040e\u0001\u0000\u0000\u0000\u0094\u0410\u0001\u0000\u0000\u0000"+
		"\u0096\u0412\u0001\u0000\u0000\u0000\u0098\u0426\u0001\u0000\u0000\u0000"+
		"\u009a\u0429\u0001\u0000\u0000\u0000\u009c\u0434\u0001\u0000\u0000\u0000"+
		"\u009e\u0439\u0001\u0000\u0000\u0000\u00a0\u044b\u0001\u0000\u0000\u0000"+
		"\u00a2\u0463\u0001\u0000\u0000\u0000\u00a4\u0467\u0001\u0000\u0000\u0000"+
		"\u00a6\u0484\u0001\u0000\u0000\u0000\u00a8\u0486\u0001\u0000\u0000\u0000"+
		"\u00aa\u0488\u0001\u0000\u0000\u0000\u00ac\u048b\u0001\u0000\u0000\u0000"+
		"\u00ae\u04a0\u0001\u0000\u0000\u0000\u00b0\u04d6\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b4\u0003\u0002\u0001\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00bc\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00bb\u0003\u0010\b\u0000\u00b9"+
		"\u00bb\u0003X,\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u0001\u0001"+
		"\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005"+
		"\u0017\u0000\u0000\u00c0\u00c1\u0003\u0004\u0002\u0000\u00c1\u00c2\u0005"+
		"\u0018\u0000\u0000\u00c2\u00c3\u0005m\u0000\u0000\u00c3\u00c4\u0005X\u0000"+
		"\u0000\u00c4\u0003\u0001\u0000\u0000\u0000\u00c5\u00c9\u0003\u0006\u0003"+
		"\u0000\u00c6\u00c9\u0003\b\u0004\u0000\u00c7\u00c9\u0003\n\u0005\u0000"+
		"\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u0005\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cb\u0005q\u0000\u0000\u00cb\u0007\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0005@\u0000\u0000\u00cd\u00ce\u0005\u0019\u0000\u0000\u00ce\u00cf"+
		"\u0005q\u0000\u0000\u00cf\t\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003"+
		"\f\u0006\u0000\u00d1\u00d2\u0005Z\u0000\u0000\u00d2\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d0\u0001\u0000\u0000\u0000\u00d4\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d8\u00e4\u0005b\u0000\u0000\u00d9\u00de\u0003\f\u0006"+
		"\u0000\u00da\u00db\u0005Z\u0000\u0000\u00db\u00dd\u0003\f\u0006\u0000"+
		"\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000"+
		"\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e3\u0005Z\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000\u0000\u0000\u00e4"+
		"\u00d9\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005c\u0000\u0000\u00e7\u000b"+
		"\u0001\u0000\u0000\u0000\u00e8\u00eb\u0005q\u0000\u0000\u00e9\u00eb\u0003"+
		"\u000e\u0007\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00ea\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\r\u0001\u0000\u0000\u0000\u00ec\u00ed\u0007\u0000"+
		"\u0000\u0000\u00ed\u000f\u0001\u0000\u0000\u0000\u00ee\u00fa\u0003 \u0010"+
		"\u0000\u00ef\u00fa\u0003&\u0013\u0000\u00f0\u00fa\u00034\u001a\u0000\u00f1"+
		"\u00fa\u0003:\u001d\u0000\u00f2\u00fa\u0003,\u0016\u0000\u00f3\u00fa\u0003"+
		"L&\u0000\u00f4\u00fa\u0003@ \u0000\u00f5\u00fa\u0003R)\u0000\u00f6\u00fa"+
		"\u0003\u0012\t\u0000\u00f7\u00fa\u0003\u0016\u000b\u0000\u00f8\u00fa\u0003"+
		"\u00acV\u0000\u00f9\u00ee\u0001\u0000\u0000\u0000\u00f9\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f0\u0001\u0000\u0000\u0000\u00f9\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f2\u0001\u0000\u0000\u0000\u00f9\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f4\u0001\u0000\u0000\u0000\u00f9\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f6\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa\u0011\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0003\u0014\n\u0000\u00fc\u00ff\u0005q\u0000"+
		"\u0000\u00fd\u00fe\u0005Y\u0000\u0000\u00fe\u0100\u0003\u0092I\u0000\u00ff"+
		"\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100"+
		"\u0103\u0001\u0000\u0000\u0000\u0101\u0102\u00058\u0000\u0000\u0102\u0104"+
		"\u0003\u0088D\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001"+
		"\u0000\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0107\u0005"+
		"X\u0000\u0000\u0106\u0105\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000"+
		"\u0000\u0000\u0107\u0013\u0001\u0000\u0000\u0000\u0108\u0109\u0007\u0001"+
		"\u0000\u0000\u0109\u0015\u0001\u0000\u0000\u0000\u010a\u010e\u0003\u0018"+
		"\f\u0000\u010b\u010e\u0003\u001a\r\u0000\u010c\u010e\u0003\u001c\u000e"+
		"\u0000\u010d\u010a\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000"+
		"\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010e\u0017\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0005/\u0000\u0000\u0110\u0111\u0005q\u0000\u0000\u0111"+
		"\u0113\u0005`\u0000\u0000\u0112\u0114\u0003r9\u0000\u0113\u0112\u0001"+
		"\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0115\u0001"+
		"\u0000\u0000\u0000\u0115\u0118\u0005a\u0000\u0000\u0116\u0117\u0005Y\u0000"+
		"\u0000\u0117\u0119\u0003\u0092I\u0000\u0118\u0116\u0001\u0000\u0000\u0000"+
		"\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0005b\u0000\u0000\u011b\u011c\u0003\u001e\u000f\u0000\u011c"+
		"\u011d\u0005c\u0000\u0000\u011d\u0019\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0005/\u0000\u0000\u011f\u0121\u0005`\u0000\u0000\u0120\u0122\u0003r"+
		"9\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0126\u0005a\u0000\u0000"+
		"\u0124\u0125\u0005Y\u0000\u0000\u0125\u0127\u0003\u0092I\u0000\u0126\u0124"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0005b\u0000\u0000\u0129\u012a\u0003"+
		"\u001e\u000f\u0000\u012a\u012b\u0005c\u0000\u0000\u012b\u001b\u0001\u0000"+
		"\u0000\u0000\u012c\u012e\u0005`\u0000\u0000\u012d\u012f\u0003r9\u0000"+
		"\u012e\u012d\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u0133\u0005a\u0000\u0000\u0131"+
		"\u0133\u0005q\u0000\u0000\u0132\u012c\u0001\u0000\u0000\u0000\u0132\u0131"+
		"\u0001\u0000\u0000\u0000\u0133\u0136\u0001\u0000\u0000\u0000\u0134\u0135"+
		"\u0005Y\u0000\u0000\u0135\u0137\u0003\u0092I\u0000\u0136\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"+
		"\u0000\u0000\u0138\u013b\u0005T\u0000\u0000\u0139\u013c\u0003X,\u0000"+
		"\u013a\u013c\u0003\u001e\u000f\u0000\u013b\u0139\u0001\u0000\u0000\u0000"+
		"\u013b\u013a\u0001\u0000\u0000\u0000\u013c\u001d\u0001\u0000\u0000\u0000"+
		"\u013d\u0142\u0005b\u0000\u0000\u013e\u0141\u0003X,\u0000\u013f\u0141"+
		"\u0003\u0012\t\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u013f\u0001"+
		"\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001"+
		"\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0145\u0001"+
		"\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0146\u0005"+
		"c\u0000\u0000\u0146\u001f\u0001\u0000\u0000\u0000\u0147\u0148\u0005\u0005"+
		"\u0000\u0000\u0148\u014e\u0005`\u0000\u0000\u0149\u014b\u0005b\u0000\u0000"+
		"\u014a\u014c\u0003\"\u0011\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d"+
		"\u014f\u0005c\u0000\u0000\u014e\u0149\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0005a\u0000\u0000\u0151\u0152\u0003@ \u0000\u0152!\u0001\u0000\u0000"+
		"\u0000\u0153\u0158\u0003$\u0012\u0000\u0154\u0155\u0005Z\u0000\u0000\u0155"+
		"\u0157\u0003$\u0012\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u015a"+
		"\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0001\u0000\u0000\u0000\u0159\u015c\u0001\u0000\u0000\u0000\u015a\u0158"+
		"\u0001\u0000\u0000\u0000\u015b\u015d\u0005Z\u0000\u0000\u015c\u015b\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d#\u0001\u0000"+
		"\u0000\u0000\u015e\u015f\u0005\u0015\u0000\u0000\u015f\u0160\u0005Y\u0000"+
		"\u0000\u0160\u016e\u0003x<\u0000\u0161\u0162\u0005\u0013\u0000\u0000\u0162"+
		"\u0163\u0005Y\u0000\u0000\u0163\u016e\u0003x<\u0000\u0164\u0165\u0005"+
		"\u000f\u0000\u0000\u0165\u0166\u0005Y\u0000\u0000\u0166\u016e\u0003x<"+
		"\u0000\u0167\u0168\u0005\u0010\u0000\u0000\u0168\u0169\u0005Y\u0000\u0000"+
		"\u0169\u016e\u0003x<\u0000\u016a\u016b\u0005\u0014\u0000\u0000\u016b\u016c"+
		"\u0005Y\u0000\u0000\u016c\u016e\u0003x<\u0000\u016d\u015e\u0001\u0000"+
		"\u0000\u0000\u016d\u0161\u0001\u0000\u0000\u0000\u016d\u0164\u0001\u0000"+
		"\u0000\u0000\u016d\u0167\u0001\u0000\u0000\u0000\u016d\u016a\u0001\u0000"+
		"\u0000\u0000\u016e%\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u0006\u0000"+
		"\u0000\u0170\u0176\u0005`\u0000\u0000\u0171\u0173\u0005b\u0000\u0000\u0172"+
		"\u0174\u0003(\u0014\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174"+
		"\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0177"+
		"\u0005c\u0000\u0000\u0176\u0171\u0001\u0000\u0000\u0000\u0176\u0177\u0001"+
		"\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000\u0178\u0179\u0005"+
		"a\u0000\u0000\u0179\u017a\u0003@ \u0000\u017a\'\u0001\u0000\u0000\u0000"+
		"\u017b\u0180\u0003*\u0015\u0000\u017c\u017d\u0005Z\u0000\u0000\u017d\u017f"+
		"\u0003*\u0015\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017f\u0182\u0001"+
		"\u0000\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0180\u0181\u0001"+
		"\u0000\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0180\u0001"+
		"\u0000\u0000\u0000\u0183\u0185\u0005Z\u0000\u0000\u0184\u0183\u0001\u0000"+
		"\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185)\u0001\u0000\u0000"+
		"\u0000\u0186\u0187\u0005\n\u0000\u0000\u0187\u0188\u0005Y\u0000\u0000"+
		"\u0188\u01ab\u0005m\u0000\u0000\u0189\u018a\u0005\u000b\u0000\u0000\u018a"+
		"\u018b\u0005Y\u0000\u0000\u018b\u01ab\u0005m\u0000\u0000\u018c\u018d\u0005"+
		"\f\u0000\u0000\u018d\u018e\u0005Y\u0000\u0000\u018e\u01ab\u0003\u0096"+
		"K\u0000\u018f\u0190\u0005\r\u0000\u0000\u0190\u0191\u0005Y\u0000\u0000"+
		"\u0191\u01ab\u0003x<\u0000\u0192\u0193\u0005\u000e\u0000\u0000\u0193\u0194"+
		"\u0005Y\u0000\u0000\u0194\u01ab\u0003x<\u0000\u0195\u0196\u0005\u0016"+
		"\u0000\u0000\u0196\u0197\u0005Y\u0000\u0000\u0197\u01ab\u0005o\u0000\u0000"+
		"\u0198\u0199\u0005\u0011\u0000\u0000\u0199\u019a\u0005Y\u0000\u0000\u019a"+
		"\u01ab\u0003x<\u0000\u019b\u019c\u0005\u0012\u0000\u0000\u019c\u019d\u0005"+
		"Y\u0000\u0000\u019d\u01ab\u0003x<\u0000\u019e\u019f\u0005\u000f\u0000"+
		"\u0000\u019f\u01a0\u0005Y\u0000\u0000\u01a0\u01ab\u0003x<\u0000\u01a1"+
		"\u01a2\u0005\u0010\u0000\u0000\u01a2\u01a3\u0005Y\u0000\u0000\u01a3\u01ab"+
		"\u0003x<\u0000\u01a4\u01a5\u0005\u0014\u0000\u0000\u01a5\u01a6\u0005Y"+
		"\u0000\u0000\u01a6\u01ab\u0003x<\u0000\u01a7\u01a8\u0005\u0013\u0000\u0000"+
		"\u01a8\u01a9\u0005Y\u0000\u0000\u01a9\u01ab\u0003x<\u0000\u01aa\u0186"+
		"\u0001\u0000\u0000\u0000\u01aa\u0189\u0001\u0000\u0000\u0000\u01aa\u018c"+
		"\u0001\u0000\u0000\u0000\u01aa\u018f\u0001\u0000\u0000\u0000\u01aa\u0192"+
		"\u0001\u0000\u0000\u0000\u01aa\u0195\u0001\u0000\u0000\u0000\u01aa\u0198"+
		"\u0001\u0000\u0000\u0000\u01aa\u019b\u0001\u0000\u0000\u0000\u01aa\u019e"+
		"\u0001\u0000\u0000\u0000\u01aa\u01a1\u0001\u0000\u0000\u0000\u01aa\u01a4"+
		"\u0001\u0000\u0000\u0000\u01aa\u01a7\u0001\u0000\u0000\u0000\u01ab+\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ad\u0005\u0007\u0000\u0000\u01ad\u01b3\u0005"+
		"`\u0000\u0000\u01ae\u01b0\u0005b\u0000\u0000\u01af\u01b1\u0003.\u0017"+
		"\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b0\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b4\u0005c\u0000\u0000"+
		"\u01b3\u01ae\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0001\u0000\u0000\u0000\u01b5\u01b6\u0005a\u0000\u0000\u01b6"+
		"\u01b7\u0003@ \u0000\u01b7-\u0001\u0000\u0000\u0000\u01b8\u01bd\u0003"+
		"0\u0018\u0000\u01b9\u01ba\u0005Z\u0000\u0000\u01ba\u01bc\u00030\u0018"+
		"\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000"+
		"\u0000\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000"+
		"\u0000\u01c0\u01c2\u0005Z\u0000\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2/\u0001\u0000\u0000\u0000\u01c3"+
		"\u01c4\u0005\n\u0000\u0000\u01c4\u01c5\u0005Y\u0000\u0000\u01c5\u01ca"+
		"\u0005m\u0000\u0000\u01c6\u01c7\u0005q\u0000\u0000\u01c7\u01c8\u0005Y"+
		"\u0000\u0000\u01c8\u01ca\u0003\u008eG\u0000\u01c9\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c9\u01c6\u0001\u0000\u0000\u0000\u01ca1\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cc\u0005]\u0000\u0000\u01cc\u01cd\u0005q\u0000\u0000\u01cd\u01cf"+
		"\u0005`\u0000\u0000\u01ce\u01d0\u0003r9\u0000\u01cf\u01ce\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d2\u0005a\u0000\u0000\u01d23\u0001\u0000\u0000\u0000"+
		"\u01d3\u01d4\u0005\b\u0000\u0000\u01d4\u01da\u0005`\u0000\u0000\u01d5"+
		"\u01d7\u0005b\u0000\u0000\u01d6\u01d8\u00036\u001b\u0000\u01d7\u01d6\u0001"+
		"\u0000\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001"+
		"\u0000\u0000\u0000\u01d9\u01db\u0005c\u0000\u0000\u01da\u01d5\u0001\u0000"+
		"\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000"+
		"\u0000\u0000\u01dc\u01dd\u0005a\u0000\u0000\u01dd\u01de\u0003@ \u0000"+
		"\u01de5\u0001\u0000\u0000\u0000\u01df\u01e4\u00038\u001c\u0000\u01e0\u01e1"+
		"\u0005Z\u0000\u0000\u01e1\u01e3\u00038\u001c\u0000\u01e2\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e8\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e7\u01e9\u0005Z\u0000"+
		"\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000"+
		"\u0000\u01e97\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005q\u0000\u0000\u01eb"+
		"\u01ec\u0005Y\u0000\u0000\u01ec\u01ed\u0003\u008eG\u0000\u01ed9\u0001"+
		"\u0000\u0000\u0000\u01ee\u01ef\u0005\t\u0000\u0000\u01ef\u01f5\u0005`"+
		"\u0000\u0000\u01f0\u01f2\u0005b\u0000\u0000\u01f1\u01f3\u0003<\u001e\u0000"+
		"\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f6\u0005c\u0000\u0000\u01f5"+
		"\u01f0\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005a\u0000\u0000\u01f8\u01f9"+
		"\u0003@ \u0000\u01f9;\u0001\u0000\u0000\u0000\u01fa\u01ff\u0003>\u001f"+
		"\u0000\u01fb\u01fc\u0005Z\u0000\u0000\u01fc\u01fe\u0003>\u001f\u0000\u01fd"+
		"\u01fb\u0001\u0000\u0000\u0000\u01fe\u0201\u0001\u0000\u0000\u0000\u01ff"+
		"\u01fd\u0001\u0000\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200"+
		"\u0203\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202"+
		"\u0204\u0005Z\u0000\u0000\u0203\u0202\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0001\u0000\u0000\u0000\u0204=\u0001\u0000\u0000\u0000\u0205\u0206\u0005"+
		"q\u0000\u0000\u0206\u0207\u0005Y\u0000\u0000\u0207\u0208\u0003\u008eG"+
		"\u0000\u0208?\u0001\u0000\u0000\u0000\u0209\u020b\u0005\'\u0000\u0000"+
		"\u020a\u0209\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020d\u0005)\u0000\u0000\u020d"+
		"\u0217\u0005q\u0000\u0000\u020e\u020f\u0005+\u0000\u0000\u020f\u0214\u0005"+
		"q\u0000\u0000\u0210\u0211\u0005Z\u0000\u0000\u0211\u0213\u0005q\u0000"+
		"\u0000\u0212\u0210\u0001\u0000\u0000\u0000\u0213\u0216\u0001\u0000\u0000"+
		"\u0000\u0214\u0212\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000"+
		"\u0000\u0215\u0218\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000"+
		"\u0000\u0217\u020e\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000"+
		"\u0000\u0218\u0222\u0001\u0000\u0000\u0000\u0219\u021a\u0005,\u0000\u0000"+
		"\u021a\u021f\u0005q\u0000\u0000\u021b\u021c\u0005Z\u0000\u0000\u021c\u021e"+
		"\u0005q\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e\u0221\u0001"+
		"\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f\u0220\u0001"+
		"\u0000\u0000\u0000\u0220\u0223\u0001\u0000\u0000\u0000\u0221\u021f\u0001"+
		"\u0000\u0000\u0000\u0222\u0219\u0001\u0000\u0000\u0000\u0222\u0223\u0001"+
		"\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224\u0225\u0005"+
		"b\u0000\u0000\u0225\u0226\u0003B!\u0000\u0226\u0227\u0005c\u0000\u0000"+
		"\u0227A\u0001\u0000\u0000\u0000\u0228\u022a\u0003D\"\u0000\u0229\u0228"+
		"\u0001\u0000\u0000\u0000\u022a\u022d\u0001\u0000\u0000\u0000\u022b\u0229"+
		"\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022f"+
		"\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022e\u0230"+
		"\u0003H$\u0000\u022f\u022e\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000"+
		"\u0000\u0000\u0230\u0237\u0001\u0000\u0000\u0000\u0231\u0236\u0003F#\u0000"+
		"\u0232\u0236\u0003X,\u0000\u0233\u0236\u0003\u0012\t\u0000\u0234\u0236"+
		"\u0003\u0016\u000b\u0000\u0235\u0231\u0001\u0000\u0000\u0000\u0235\u0232"+
		"\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0235\u0234"+
		"\u0001\u0000\u0000\u0000\u0236\u0239\u0001\u0000\u0000\u0000\u0237\u0235"+
		"\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238C\u0001"+
		"\u0000\u0000\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u023c\u0003"+
		"2\u0019\u0000\u023b\u023a\u0001\u0000\u0000\u0000\u023c\u023f\u0001\u0000"+
		"\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000"+
		"\u0000\u0000\u023e\u0241\u0001\u0000\u0000\u0000\u023f\u023d\u0001\u0000"+
		"\u0000\u0000\u0240\u0242\u0003\u0094J\u0000\u0241\u0240\u0001\u0000\u0000"+
		"\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000"+
		"\u0000\u0243\u0249\u0005q\u0000\u0000\u0244\u0246\u0005\\\u0000\u0000"+
		"\u0245\u0244\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000"+
		"\u0246\u0247\u0001\u0000\u0000\u0000\u0247\u0248\u0005Y\u0000\u0000\u0248"+
		"\u024a\u0003\u0092I\u0000\u0249\u0245\u0001\u0000\u0000\u0000\u0249\u024a"+
		"\u0001\u0000\u0000\u0000\u024a\u024d\u0001\u0000\u0000\u0000\u024b\u024c"+
		"\u00058\u0000\u0000\u024c\u024e\u0003\u0088D\u0000\u024d\u024b\u0001\u0000"+
		"\u0000\u0000\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000"+
		"\u0000\u0000\u024f\u0250\u0005X\u0000\u0000\u0250E\u0001\u0000\u0000\u0000"+
		"\u0251\u0253\u00032\u0019\u0000\u0252\u0251\u0001\u0000\u0000\u0000\u0253"+
		"\u0256\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0254"+
		"\u0255\u0001\u0000\u0000\u0000\u0255\u0258\u0001\u0000\u0000\u0000\u0256"+
		"\u0254\u0001\u0000\u0000\u0000\u0257\u0259\u0003\u0094J\u0000\u0258\u0257"+
		"\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025a"+
		"\u0001\u0000\u0000\u0000\u025a\u025b\u0005q\u0000\u0000\u025b\u025d\u0005"+
		"`\u0000\u0000\u025c\u025e\u0003r9\u0000\u025d\u025c\u0001\u0000\u0000"+
		"\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000"+
		"\u0000\u025f\u0262\u0005a\u0000\u0000\u0260\u0261\u0005Y\u0000\u0000\u0261"+
		"\u0263\u0003\u0092I\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0262\u0263"+
		"\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000\u0264\u0265"+
		"\u0003\u001e\u000f\u0000\u0265G\u0001\u0000\u0000\u0000\u0266\u0267\u0005"+
		"-\u0000\u0000\u0267\u0269\u0005`\u0000\u0000\u0268\u026a\u0003r9\u0000"+
		"\u0269\u0268\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000"+
		"\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026c\u0005a\u0000\u0000\u026c"+
		"\u026d\u0005b\u0000\u0000\u026d\u026e\u0003J%\u0000\u026e\u026f\u0005"+
		"c\u0000\u0000\u026fI\u0001\u0000\u0000\u0000\u0270\u0272\u0003X,\u0000"+
		"\u0271\u0270\u0001\u0000\u0000\u0000\u0272\u0275\u0001\u0000\u0000\u0000"+
		"\u0273\u0271\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000\u0000"+
		"\u0274K\u0001\u0000\u0000\u0000\u0275\u0273\u0001\u0000\u0000\u0000\u0276"+
		"\u0278\u0005\'\u0000\u0000\u0277\u0276\u0001\u0000\u0000\u0000\u0277\u0278"+
		"\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027a"+
		"\u0005(\u0000\u0000\u027a\u0284\u0005q\u0000\u0000\u027b\u027c\u0005+"+
		"\u0000\u0000\u027c\u0281\u0005q\u0000\u0000\u027d\u027e\u0005Z\u0000\u0000"+
		"\u027e\u0280\u0005q\u0000\u0000\u027f\u027d\u0001\u0000\u0000\u0000\u0280"+
		"\u0283\u0001\u0000\u0000\u0000\u0281\u027f\u0001\u0000\u0000\u0000\u0281"+
		"\u0282\u0001\u0000\u0000\u0000\u0282\u0285\u0001\u0000\u0000\u0000\u0283"+
		"\u0281\u0001\u0000\u0000\u0000\u0284\u027b\u0001\u0000\u0000\u0000\u0284"+
		"\u0285\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286"+
		"\u0287\u0005b\u0000\u0000\u0287\u0288\u0003N\'\u0000\u0288\u0289\u0005"+
		"c\u0000\u0000\u0289M\u0001\u0000\u0000\u0000\u028a\u028c\u0003P(\u0000"+
		"\u028b\u028a\u0001\u0000\u0000\u0000\u028c\u028f\u0001\u0000\u0000\u0000"+
		"\u028d\u028b\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000"+
		"\u028eO\u0001\u0000\u0000\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u0290"+
		"\u0292\u0005q\u0000\u0000\u0291\u0293\u0005\\\u0000\u0000\u0292\u0291"+
		"\u0001\u0000\u0000\u0000\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0294"+
		"\u0001\u0000\u0000\u0000\u0294\u0295\u0005Y\u0000\u0000\u0295\u0296\u0003"+
		"\u0092I\u0000\u0296\u0297\u0005X\u0000\u0000\u0297Q\u0001\u0000\u0000"+
		"\u0000\u0298\u029a\u0005\'\u0000\u0000\u0299\u0298\u0001\u0000\u0000\u0000"+
		"\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000\u0000"+
		"\u029b\u029c\u0005*\u0000\u0000\u029c\u029d\u0005q\u0000\u0000\u029d\u029e"+
		"\u0005b\u0000\u0000\u029e\u029f\u0003T*\u0000\u029f\u02a0\u0005c\u0000"+
		"\u0000\u02a0S\u0001\u0000\u0000\u0000\u02a1\u02a6\u0003V+\u0000\u02a2"+
		"\u02a3\u0005Z\u0000\u0000\u02a3\u02a5\u0003V+\u0000\u02a4\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a8\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001"+
		"\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02aa\u0001"+
		"\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000\u02a9\u02ab\u0005"+
		"Z\u0000\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000"+
		"\u0000\u0000\u02abU\u0001\u0000\u0000\u0000\u02ac\u02af\u0005q\u0000\u0000"+
		"\u02ad\u02ae\u00058\u0000\u0000\u02ae\u02b0\u0003\u008eG\u0000\u02af\u02ad"+
		"\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0W\u0001"+
		"\u0000\u0000\u0000\u02b1\u02be\u0003Z-\u0000\u02b2\u02be\u0003\\.\u0000"+
		"\u02b3\u02be\u0003^/\u0000\u02b4\u02be\u0003`0\u0000\u02b5\u02be\u0003"+
		"b1\u0000\u02b6\u02be\u0003p8\u0000\u02b7\u02be\u0003n7\u0000\u02b8\u02be"+
		"\u0003l6\u0000\u02b9\u02bb\u0003\u008eG\u0000\u02ba\u02bc\u0005X\u0000"+
		"\u0000\u02bb\u02ba\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000"+
		"\u0000\u02bc\u02be\u0001\u0000\u0000\u0000\u02bd\u02b1\u0001\u0000\u0000"+
		"\u0000\u02bd\u02b2\u0001\u0000\u0000\u0000\u02bd\u02b3\u0001\u0000\u0000"+
		"\u0000\u02bd\u02b4\u0001\u0000\u0000\u0000\u02bd\u02b5\u0001\u0000\u0000"+
		"\u0000\u02bd\u02b6\u0001\u0000\u0000\u0000\u02bd\u02b7\u0001\u0000\u0000"+
		"\u0000\u02bd\u02b8\u0001\u0000\u0000\u0000\u02bd\u02b9\u0001\u0000\u0000"+
		"\u0000\u02beY\u0001\u0000\u0000\u0000\u02bf\u02c0\u0003\u0084B\u0000\u02c0"+
		"\u02c1\u00058\u0000\u0000\u02c1\u02c2\u0003\u0088D\u0000\u02c2\u02c3\u0005"+
		"X\u0000\u0000\u02c3[\u0001\u0000\u0000\u0000\u02c4\u02c5\u0005#\u0000"+
		"\u0000\u02c5\u02c6\u0005[\u0000\u0000\u02c6\u02c7\u0007\u0002\u0000\u0000"+
		"\u02c7\u02c9\u0005`\u0000\u0000\u02c8\u02ca\u0003r9\u0000\u02c9\u02c8"+
		"\u0001\u0000\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca\u02cb"+
		"\u0001\u0000\u0000\u0000\u02cb\u02cd\u0005a\u0000\u0000\u02cc\u02ce\u0005"+
		"X\u0000\u0000\u02cd\u02cc\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000"+
		"\u0000\u0000\u02ce]\u0001\u0000\u0000\u0000\u02cf\u02d1\u0005!\u0000\u0000"+
		"\u02d0\u02d2\u0003\u008eG\u0000\u02d1\u02d0\u0001\u0000\u0000\u0000\u02d1"+
		"\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3"+
		"\u02d4\u0005X\u0000\u0000\u02d4_\u0001\u0000\u0000\u0000\u02d5\u02d6\u0005"+
		"\"\u0000\u0000\u02d6\u02d7\u0003\u008eG\u0000\u02d7\u02d8\u0005X\u0000"+
		"\u0000\u02d8a\u0001\u0000\u0000\u0000\u02d9\u02dd\u0003d2\u0000\u02da"+
		"\u02dc\u0003f3\u0000\u02db\u02da\u0001\u0000\u0000\u0000\u02dc\u02df\u0001"+
		"\u0000\u0000\u0000\u02dd\u02db\u0001\u0000\u0000\u0000\u02dd\u02de\u0001"+
		"\u0000\u0000\u0000\u02de\u02e1\u0001\u0000\u0000\u0000\u02df\u02dd\u0001"+
		"\u0000\u0000\u0000\u02e0\u02e2\u0003h4\u0000\u02e1\u02e0\u0001\u0000\u0000"+
		"\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2c\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e4\u0005\u001f\u0000\u0000\u02e4\u02e5\u0005`\u0000\u0000\u02e5"+
		"\u02e6\u0003\u008eG\u0000\u02e6\u02e7\u0005a\u0000\u0000\u02e7\u02e8\u0003"+
		"j5\u0000\u02e8e\u0001\u0000\u0000\u0000\u02e9\u02ea\u0005 \u0000\u0000"+
		"\u02ea\u02eb\u0005\u001f\u0000\u0000\u02eb\u02ec\u0005`\u0000\u0000\u02ec"+
		"\u02ed\u0003\u008eG\u0000\u02ed\u02ee\u0005a\u0000\u0000\u02ee\u02ef\u0003"+
		"j5\u0000\u02efg\u0001\u0000\u0000\u0000\u02f0\u02f1\u0005 \u0000\u0000"+
		"\u02f1\u02f2\u0003j5\u0000\u02f2i\u0001\u0000\u0000\u0000\u02f3\u02f6"+
		"\u0003X,\u0000\u02f4\u02f6\u0003\u001e\u000f\u0000\u02f5\u02f3\u0001\u0000"+
		"\u0000\u0000\u02f5\u02f4\u0001\u0000\u0000\u0000\u02f6k\u0001\u0000\u0000"+
		"\u0000\u02f7\u02f9\u0005q\u0000\u0000\u02f8\u02fa\u0003\u0090H\u0000\u02f9"+
		"\u02f8\u0001\u0000\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02fa"+
		"\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fd\u0005`\u0000\u0000\u02fc\u02fe"+
		"\u0003r9\u0000\u02fd\u02fc\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000"+
		"\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ff\u0301\u0005a\u0000"+
		"\u0000\u0300\u0302\u0005X\u0000\u0000\u0301\u0300\u0001\u0000\u0000\u0000"+
		"\u0301\u0302\u0001\u0000\u0000\u0000\u0302m\u0001\u0000\u0000\u0000\u0303"+
		"\u0304\u0003\u000e\u0007\u0000\u0304\u0306\u0005`\u0000\u0000\u0305\u0307"+
		"\u0003r9\u0000\u0306\u0305\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000"+
		"\u0000\u0000\u0307\u0308\u0001\u0000\u0000\u0000\u0308\u030f\u0005a\u0000"+
		"\u0000\u0309\u030a\u0005[\u0000\u0000\u030a\u030b\u0005%\u0000\u0000\u030b"+
		"\u030c\u0005`\u0000\u0000\u030c\u030d\u0003\u001c\u000e\u0000\u030d\u030e"+
		"\u0005a\u0000\u0000\u030e\u0310\u0001\u0000\u0000\u0000\u030f\u0309\u0001"+
		"\u0000\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310\u0311\u0001"+
		"\u0000\u0000\u0000\u0311\u0312\u0005X\u0000\u0000\u0312o\u0001\u0000\u0000"+
		"\u0000\u0313\u0314\u0005f\u0000\u0000\u0314\u0316\u0005`\u0000\u0000\u0315"+
		"\u0317\u0003\u0012\t\u0000\u0316\u0315\u0001\u0000\u0000\u0000\u0316\u0317"+
		"\u0001\u0000\u0000\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u031a"+
		"\u0005X\u0000\u0000\u0319\u031b\u0003\u008eG\u0000\u031a\u0319\u0001\u0000"+
		"\u0000\u0000\u031a\u031b\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000"+
		"\u0000\u0000\u031c\u031e\u0005X\u0000\u0000\u031d\u031f\u0003\u008eG\u0000"+
		"\u031e\u031d\u0001\u0000\u0000\u0000\u031e\u031f\u0001\u0000\u0000\u0000"+
		"\u031f\u0320\u0001\u0000\u0000\u0000\u0320\u0321\u0005a\u0000\u0000\u0321"+
		"\u0343\u0003j5\u0000\u0322\u0323\u0005f\u0000\u0000\u0323\u0324\u0005"+
		"`\u0000\u0000\u0324\u0325\u0003\u0014\n\u0000\u0325\u0326\u0005q\u0000"+
		"\u0000\u0326\u0327\u0005k\u0000\u0000\u0327\u0328\u0005q\u0000\u0000\u0328"+
		"\u0329\u0005a\u0000\u0000\u0329\u032a\u0003j5\u0000\u032a\u0343\u0001"+
		"\u0000\u0000\u0000\u032b\u032c\u0005f\u0000\u0000\u032c\u032d\u0005`\u0000"+
		"\u0000\u032d\u032e\u0003\u0014\n\u0000\u032e\u032f\u0005q\u0000\u0000"+
		"\u032f\u0330\u0005l\u0000\u0000\u0330\u0331\u0005q\u0000\u0000\u0331\u0332"+
		"\u0005a\u0000\u0000\u0332\u0333\u0003j5\u0000\u0333\u0343\u0001\u0000"+
		"\u0000\u0000\u0334\u0335\u0005h\u0000\u0000\u0335\u0336\u0005`\u0000\u0000"+
		"\u0336\u0337\u0003\u008eG\u0000\u0337\u0338\u0005a\u0000\u0000\u0338\u0339"+
		"\u0003j5\u0000\u0339\u0343\u0001\u0000\u0000\u0000\u033a\u033b\u0005g"+
		"\u0000\u0000\u033b\u033c\u0003j5\u0000\u033c\u033d\u0005h\u0000\u0000"+
		"\u033d\u033e\u0005`\u0000\u0000\u033e\u033f\u0003\u008eG\u0000\u033f\u0340"+
		"\u0005a\u0000\u0000\u0340\u0341\u0005X\u0000\u0000\u0341\u0343\u0001\u0000"+
		"\u0000\u0000\u0342\u0313\u0001\u0000\u0000\u0000\u0342\u0322\u0001\u0000"+
		"\u0000\u0000\u0342\u032b\u0001\u0000\u0000\u0000\u0342\u0334\u0001\u0000"+
		"\u0000\u0000\u0342\u033a\u0001\u0000\u0000\u0000\u0343q\u0001\u0000\u0000"+
		"\u0000\u0344\u0349\u0003t:\u0000\u0345\u0346\u0005Z\u0000\u0000\u0346"+
		"\u0348\u0003t:\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0348\u034b\u0001"+
		"\u0000\u0000\u0000\u0349\u0347\u0001\u0000\u0000\u0000\u0349\u034a\u0001"+
		"\u0000\u0000\u0000\u034as\u0001\u0000\u0000\u0000\u034b\u0349\u0001\u0000"+
		"\u0000\u0000\u034c\u034d\u0003\u008eG\u0000\u034du\u0001\u0000\u0000\u0000"+
		"\u034e\u0350\u00032\u0019\u0000\u034f\u034e\u0001\u0000\u0000\u0000\u0350"+
		"\u0353\u0001\u0000\u0000\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0351"+
		"\u0352\u0001\u0000\u0000\u0000\u0352\u0355\u0001\u0000\u0000\u0000\u0353"+
		"\u0351\u0001\u0000\u0000\u0000\u0354\u0356\u0003\u0094J\u0000\u0355\u0354"+
		"\u0001\u0000\u0000\u0000\u0355\u0356\u0001\u0000\u0000\u0000\u0356\u0357"+
		"\u0001\u0000\u0000\u0000\u0357\u035a\u0005q\u0000\u0000\u0358\u0359\u0005"+
		"Y\u0000\u0000\u0359\u035b\u0003\u0092I\u0000\u035a\u0358\u0001\u0000\u0000"+
		"\u0000\u035a\u035b\u0001\u0000\u0000\u0000\u035b\u035e\u0001\u0000\u0000"+
		"\u0000\u035c\u035d\u00058\u0000\u0000\u035d\u035f\u0003\u0088D\u0000\u035e"+
		"\u035c\u0001\u0000\u0000\u0000\u035e\u035f\u0001\u0000\u0000\u0000\u035f"+
		"w\u0001\u0000\u0000\u0000\u0360\u0369\u0005d\u0000\u0000\u0361\u0366\u0003"+
		"\u008eG\u0000\u0362\u0363\u0005Z\u0000\u0000\u0363\u0365\u0003\u008eG"+
		"\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0365\u0368\u0001\u0000\u0000"+
		"\u0000\u0366\u0364\u0001\u0000\u0000\u0000\u0366\u0367\u0001\u0000\u0000"+
		"\u0000\u0367\u036a\u0001\u0000\u0000\u0000\u0368\u0366\u0001\u0000\u0000"+
		"\u0000\u0369\u0361\u0001\u0000\u0000\u0000\u0369\u036a\u0001\u0000\u0000"+
		"\u0000\u036a\u036c\u0001\u0000\u0000\u0000\u036b\u036d\u0005Z\u0000\u0000"+
		"\u036c\u036b\u0001\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000\u0000"+
		"\u036d\u036e\u0001\u0000\u0000\u0000\u036e\u036f\u0005e\u0000\u0000\u036f"+
		"y\u0001\u0000\u0000\u0000\u0370\u0377\u0003\u008aE\u0000\u0371\u0377\u0003"+
		"x<\u0000\u0372\u0377\u0003\u0086C\u0000\u0373\u0377\u0003\u0084B\u0000"+
		"\u0374\u0377\u0003|>\u0000\u0375\u0377\u0003\u0082A\u0000\u0376\u0370"+
		"\u0001\u0000\u0000\u0000\u0376\u0371\u0001\u0000\u0000\u0000\u0376\u0372"+
		"\u0001\u0000\u0000\u0000\u0376\u0373\u0001\u0000\u0000\u0000\u0376\u0374"+
		"\u0001\u0000\u0000\u0000\u0376\u0375\u0001\u0000\u0000\u0000\u0377{\u0001"+
		"\u0000\u0000\u0000\u0378\u037a\u0005b\u0000\u0000\u0379\u037b\u0003~?"+
		"\u0000\u037a\u0379\u0001\u0000\u0000\u0000\u037a\u037b\u0001\u0000\u0000"+
		"\u0000\u037b\u037c\u0001\u0000\u0000\u0000\u037c\u037d\u0005c\u0000\u0000"+
		"\u037d}\u0001\u0000\u0000\u0000\u037e\u0383\u0003\u0080@\u0000\u037f\u0380"+
		"\u0005Z\u0000\u0000\u0380\u0382\u0003\u0080@\u0000\u0381\u037f\u0001\u0000"+
		"\u0000\u0000\u0382\u0385\u0001\u0000\u0000\u0000\u0383\u0381\u0001\u0000"+
		"\u0000\u0000\u0383\u0384\u0001\u0000\u0000\u0000\u0384\u0387\u0001\u0000"+
		"\u0000\u0000\u0385\u0383\u0001\u0000\u0000\u0000\u0386\u0388\u0005Z\u0000"+
		"\u0000\u0387\u0386\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000\u0000"+
		"\u0000\u0388\u007f\u0001\u0000\u0000\u0000\u0389\u038c\u0005q\u0000\u0000"+
		"\u038a\u038b\u0005Y\u0000\u0000\u038b\u038d\u0003\u008eG\u0000\u038c\u038a"+
		"\u0001\u0000\u0000\u0000\u038c\u038d\u0001\u0000\u0000\u0000\u038d\u0081"+
		"\u0001\u0000\u0000\u0000\u038e\u038f\u0005.\u0000\u0000\u038f\u0391\u0005"+
		"q\u0000\u0000\u0390\u0392\u0003\u0090H\u0000\u0391\u0390\u0001\u0000\u0000"+
		"\u0000\u0391\u0392\u0001\u0000\u0000\u0000\u0392\u0393\u0001\u0000\u0000"+
		"\u0000\u0393\u0395\u0005`\u0000\u0000\u0394\u0396\u0003r9\u0000\u0395"+
		"\u0394\u0001\u0000\u0000\u0000\u0395\u0396\u0001\u0000\u0000\u0000\u0396"+
		"\u0397\u0001\u0000\u0000\u0000\u0397\u0398\u0005a\u0000\u0000\u0398\u0083"+
		"\u0001\u0000\u0000\u0000\u0399\u039b\u0005q\u0000\u0000\u039a\u039c\u0003"+
		"\u008eG\u0000\u039b\u039a\u0001\u0000\u0000\u0000\u039b\u039c\u0001\u0000"+
		"\u0000\u0000\u039c\u03a0\u0001\u0000\u0000\u0000\u039d\u039e\u0005\u008a"+
		"\u0000\u0000\u039e\u03a0\u0003\u008eG\u0000\u039f\u0399\u0001\u0000\u0000"+
		"\u0000\u039f\u039d\u0001\u0000\u0000\u0000\u03a0\u0085\u0001\u0000\u0000"+
		"\u0000\u03a1\u03a2\u0005q\u0000\u0000\u03a2\u03a3\u0005d\u0000\u0000\u03a3"+
		"\u03a4\u0003\u008eG\u0000\u03a4\u03a5\u0005e\u0000\u0000\u03a5\u0087\u0001"+
		"\u0000\u0000\u0000\u03a6\u03a7\u0003\u008eG\u0000\u03a7\u0089\u0001\u0000"+
		"\u0000\u0000\u03a8\u03ab\u0003\u008cF\u0000\u03a9\u03ab\u0005q\u0000\u0000"+
		"\u03aa\u03a8\u0001\u0000\u0000\u0000\u03aa\u03a9\u0001\u0000\u0000\u0000"+
		"\u03ab\u008b\u0001\u0000\u0000\u0000\u03ac\u03ae\u0007\u0003\u0000\u0000"+
		"\u03ad\u03ac\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001\u0000\u0000\u0000"+
		"\u03ae\u03af\u0001\u0000\u0000\u0000\u03af\u03b5\u0005n\u0000\u0000\u03b0"+
		"\u03b5\u0005m\u0000\u0000\u03b1\u03b5\u0005o\u0000\u0000\u03b2\u03b5\u0005"+
		"p\u0000\u0000\u03b3\u03b5\u0005s\u0000\u0000\u03b4\u03ad\u0001\u0000\u0000"+
		"\u0000\u03b4\u03b0\u0001\u0000\u0000\u0000\u03b4\u03b1\u0001\u0000\u0000"+
		"\u0000\u03b4\u03b2\u0001\u0000\u0000\u0000\u03b4\u03b3\u0001\u0000\u0000"+
		"\u0000\u03b5\u008d\u0001\u0000\u0000\u0000\u03b6\u03b7\u0006G\uffff\uffff"+
		"\u0000\u03b7\u03b9\u0003l6\u0000\u03b8\u03ba\u0003\u008eG\u0000\u03b9"+
		"\u03b8\u0001\u0000\u0000\u0000\u03b9\u03ba\u0001\u0000\u0000\u0000\u03ba"+
		"\u03cb\u0001\u0000\u0000\u0000\u03bb\u03cb\u0003\u0016\u000b\u0000\u03bc"+
		"\u03bd\u0005V\u0000\u0000\u03bd\u03cb\u0003\u008eG\u000e\u03be\u03bf\u0005"+
		"W\u0000\u0000\u03bf\u03cb\u0003\u008eG\r\u03c0\u03c1\u00059\u0000\u0000"+
		"\u03c1\u03cb\u0003\u008eG\f\u03c2\u03c3\u0005[\u0000\u0000\u03c3\u03cb"+
		"\u0003\u008eG\u000b\u03c4\u03c5\u0005`\u0000\u0000\u03c5\u03c6\u0003\u008e"+
		"G\u0000\u03c6\u03c7\u0005a\u0000\u0000\u03c7\u03cb\u0001\u0000\u0000\u0000"+
		"\u03c8\u03cb\u0003z=\u0000\u03c9\u03cb\u0003v;\u0000\u03ca\u03b6\u0001"+
		"\u0000\u0000\u0000\u03ca\u03bb\u0001\u0000\u0000\u0000\u03ca\u03bc\u0001"+
		"\u0000\u0000\u0000\u03ca\u03be\u0001\u0000\u0000\u0000\u03ca\u03c0\u0001"+
		"\u0000\u0000\u0000\u03ca\u03c2\u0001\u0000\u0000\u0000\u03ca\u03c4\u0001"+
		"\u0000\u0000\u0000\u03ca\u03c8\u0001\u0000\u0000\u0000\u03ca\u03c9\u0001"+
		"\u0000\u0000\u0000\u03cb\u03ea\u0001\u0000\u0000\u0000\u03cc\u03cd\n\n"+
		"\u0000\u0000\u03cd\u03ce\u0007\u0004\u0000\u0000\u03ce\u03e9\u0003\u008e"+
		"G\u000b\u03cf\u03d0\n\t\u0000\u0000\u03d0\u03d1\u0007\u0003\u0000\u0000"+
		"\u03d1\u03e9\u0003\u008eG\n\u03d2\u03d3\n\b\u0000\u0000\u03d3\u03d4\u0007"+
		"\u0005\u0000\u0000\u03d4\u03e9\u0003\u008eG\t\u03d5\u03d6\n\u0007\u0000"+
		"\u0000\u03d6\u03d7\u0007\u0006\u0000\u0000\u03d7\u03e9\u0003\u008eG\b"+
		"\u03d8\u03d9\n\u0006\u0000\u0000\u03d9\u03da\u0005C\u0000\u0000\u03da"+
		"\u03e9\u0003\u008eG\u0007\u03db\u03dc\n\u0005\u0000\u0000\u03dc\u03dd"+
		"\u0005D\u0000\u0000\u03dd\u03e9\u0003\u008eG\u0006\u03de\u03df\n\u0004"+
		"\u0000\u0000\u03df\u03e0\u0005\\\u0000\u0000\u03e0\u03e1\u0003\u008eG"+
		"\u0000\u03e1\u03e2\u0005Y\u0000\u0000\u03e2\u03e3\u0003\u008eG\u0005\u03e3"+
		"\u03e9\u0001\u0000\u0000\u0000\u03e4\u03e5\n\u0010\u0000\u0000\u03e5\u03e9"+
		"\u0005V\u0000\u0000\u03e6\u03e7\n\u000f\u0000\u0000\u03e7\u03e9\u0005"+
		"W\u0000\u0000\u03e8\u03cc\u0001\u0000\u0000\u0000\u03e8\u03cf\u0001\u0000"+
		"\u0000\u0000\u03e8\u03d2\u0001\u0000\u0000\u0000\u03e8\u03d5\u0001\u0000"+
		"\u0000\u0000\u03e8\u03d8\u0001\u0000\u0000\u0000\u03e8\u03db\u0001\u0000"+
		"\u0000\u0000\u03e8\u03de\u0001\u0000\u0000\u0000\u03e8\u03e4\u0001\u0000"+
		"\u0000\u0000\u03e8\u03e6\u0001\u0000\u0000\u0000\u03e9\u03ec\u0001\u0000"+
		"\u0000\u0000\u03ea\u03e8\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000"+
		"\u0000\u0000\u03eb\u008f\u0001\u0000\u0000\u0000\u03ec\u03ea\u0001\u0000"+
		"\u0000\u0000\u03ed\u03ee\u00056\u0000\u0000\u03ee\u03f3\u0003\u0092I\u0000"+
		"\u03ef\u03f0\u0005Z\u0000\u0000\u03f0\u03f2\u0003\u0092I\u0000\u03f1\u03ef"+
		"\u0001\u0000\u0000\u0000\u03f2\u03f5\u0001\u0000\u0000\u0000\u03f3\u03f1"+
		"\u0001\u0000\u0000\u0000\u03f3\u03f4\u0001\u0000\u0000\u0000\u03f4\u03f6"+
		"\u0001\u0000\u0000\u0000\u03f5\u03f3\u0001\u0000\u0000\u0000\u03f6\u03f7"+
		"\u00054\u0000\u0000\u03f7\u0091\u0001\u0000\u0000\u0000\u03f8\u03f9\u0005"+
		"q\u0000\u0000\u03f9\u040f\u0003\u0090H\u0000\u03fa\u03fe\u0005q\u0000"+
		"\u0000\u03fb\u03fe\u0005p\u0000\u0000\u03fc\u03fe\u0003\u008cF\u0000\u03fd"+
		"\u03fa\u0001\u0000\u0000\u0000\u03fd\u03fb\u0001\u0000\u0000\u0000\u03fd"+
		"\u03fc\u0001\u0000\u0000\u0000\u03fe\u0407\u0001\u0000\u0000\u0000\u03ff"+
		"\u0403\u0005G\u0000\u0000\u0400\u0404\u0005q\u0000\u0000\u0401\u0404\u0005"+
		"p\u0000\u0000\u0402\u0404\u0003\u008cF\u0000\u0403\u0400\u0001\u0000\u0000"+
		"\u0000\u0403\u0401\u0001\u0000\u0000\u0000\u0403\u0402\u0001\u0000\u0000"+
		"\u0000\u0404\u0406\u0001\u0000\u0000\u0000\u0405\u03ff\u0001\u0000\u0000"+
		"\u0000\u0406\u0409\u0001\u0000\u0000\u0000\u0407\u0405\u0001\u0000\u0000"+
		"\u0000\u0407\u0408\u0001\u0000\u0000\u0000\u0408\u040f\u0001\u0000\u0000"+
		"\u0000\u0409\u0407\u0001\u0000\u0000\u0000\u040a\u040b\u0007\u0007\u0000"+
		"\u0000\u040b\u040c\u0005d\u0000\u0000\u040c\u040f\u0005e\u0000\u0000\u040d"+
		"\u040f\u0003x<\u0000\u040e\u03f8\u0001\u0000\u0000\u0000\u040e\u03fd\u0001"+
		"\u0000\u0000\u0000\u040e\u040a\u0001\u0000\u0000\u0000\u040e\u040d\u0001"+
		"\u0000\u0000\u0000\u040f\u0093\u0001\u0000\u0000\u0000\u0410\u0411\u0007"+
		"\b\u0000\u0000\u0411\u0095\u0001\u0000\u0000\u0000\u0412\u0416\u0005r"+
		"\u0000\u0000\u0413\u0415\u0003\u0098L\u0000\u0414\u0413\u0001\u0000\u0000"+
		"\u0000\u0415\u0418\u0001\u0000\u0000\u0000\u0416\u0414\u0001\u0000\u0000"+
		"\u0000\u0416\u0417\u0001\u0000\u0000\u0000\u0417\u0419\u0001\u0000\u0000"+
		"\u0000\u0418\u0416\u0001\u0000\u0000\u0000\u0419\u041a\u0005\u0089\u0000"+
		"\u0000\u041a\u0097\u0001\u0000\u0000\u0000\u041b\u041f\u0003\u009aM\u0000"+
		"\u041c\u041e\u0003\u00a0P\u0000\u041d\u041c\u0001\u0000\u0000\u0000\u041e"+
		"\u0421\u0001\u0000\u0000\u0000\u041f\u041d\u0001\u0000\u0000\u0000\u041f"+
		"\u0420\u0001\u0000\u0000\u0000\u0420\u0422\u0001\u0000\u0000\u0000\u0421"+
		"\u041f\u0001\u0000\u0000\u0000\u0422\u0423\u0003\u009cN\u0000\u0423\u0427"+
		"\u0001\u0000\u0000\u0000\u0424\u0427\u0003\u009eO\u0000\u0425\u0427\u0003"+
		"\u00a4R\u0000\u0426\u041b\u0001\u0000\u0000\u0000\u0426\u0424\u0001\u0000"+
		"\u0000\u0000\u0426\u0425\u0001\u0000\u0000\u0000\u0427\u0099\u0001\u0000"+
		"\u0000\u0000\u0428\u042a\u0005t\u0000\u0000\u0429\u0428\u0001\u0000\u0000"+
		"\u0000\u0429\u042a\u0001\u0000\u0000\u0000\u042a\u042b\u0001\u0000\u0000"+
		"\u0000\u042b\u042f\u0003\u00a8T\u0000\u042c\u042e\u0003\u00a2Q\u0000\u042d"+
		"\u042c\u0001\u0000\u0000\u0000\u042e\u0431\u0001\u0000\u0000\u0000\u042f"+
		"\u042d\u0001\u0000\u0000\u0000\u042f\u0430\u0001\u0000\u0000\u0000\u0430"+
		"\u0432\u0001\u0000\u0000\u0000\u0431\u042f\u0001\u0000\u0000\u0000\u0432"+
		"\u0433\u0005u\u0000\u0000\u0433\u009b\u0001\u0000\u0000\u0000\u0434\u0435"+
		"\u0005t\u0000\u0000\u0435\u0436\u0005v\u0000\u0000\u0436\u0437\u0003\u00a8"+
		"T\u0000\u0437\u0438\u0005u\u0000\u0000\u0438\u009d\u0001\u0000\u0000\u0000"+
		"\u0439\u043a\u0005t\u0000\u0000\u043a\u043e\u0003\u00a8T\u0000\u043b\u043d"+
		"\u0003\u00a2Q\u0000\u043c\u043b\u0001\u0000\u0000\u0000\u043d\u0440\u0001"+
		"\u0000\u0000\u0000\u043e\u043c\u0001\u0000\u0000\u0000\u043e\u043f\u0001"+
		"\u0000\u0000\u0000\u043f\u0442\u0001\u0000\u0000\u0000\u0440\u043e\u0001"+
		"\u0000\u0000\u0000\u0441\u0443\u0005v\u0000\u0000\u0442\u0441\u0001\u0000"+
		"\u0000\u0000\u0442\u0443\u0001\u0000\u0000\u0000\u0443\u0444\u0001\u0000"+
		"\u0000\u0000\u0444\u0445\u0005u\u0000\u0000\u0445\u009f\u0001\u0000\u0000"+
		"\u0000\u0446\u044c\u0003\u0098L\u0000\u0447\u0449\u0005\u0085\u0000\u0000"+
		"\u0448\u044a\u0005x\u0000\u0000\u0449\u0448\u0001\u0000\u0000\u0000\u0449"+
		"\u044a\u0001\u0000\u0000\u0000\u044a\u044c\u0001\u0000\u0000\u0000\u044b"+
		"\u0446\u0001\u0000\u0000\u0000\u044b\u0447\u0001\u0000\u0000\u0000\u044c"+
		"\u00a1\u0001\u0000\u0000\u0000\u044d\u044e\u0005\u0085\u0000\u0000\u044e"+
		"\u044f\u0005w\u0000\u0000\u044f\u0464\u0005y\u0000\u0000\u0450\u0451\u0005"+
		"}\u0000\u0000\u0451\u0452\u0005w\u0000\u0000\u0452\u0464\u0005y\u0000"+
		"\u0000\u0453\u0454\u0005~\u0000\u0000\u0454\u0455\u0005w\u0000\u0000\u0455"+
		"\u0464\u0005y\u0000\u0000\u0456\u0457\u0005\u007f\u0000\u0000\u0457\u0458"+
		"\u0005w\u0000\u0000\u0458\u0464\u0005y\u0000\u0000\u0459\u045a\u0003\u00aa"+
		"U\u0000\u045a\u045b\u0005w\u0000\u0000\u045b\u045c\u0005y\u0000\u0000"+
		"\u045c\u0464\u0001\u0000\u0000\u0000\u045d\u0460\u0005\u0084\u0000\u0000"+
		"\u045e\u045f\u0005w\u0000\u0000\u045f\u0461\u0005y\u0000\u0000\u0460\u045e"+
		"\u0001\u0000\u0000\u0000\u0460\u0461\u0001\u0000\u0000\u0000\u0461\u0464"+
		"\u0001\u0000\u0000\u0000\u0462\u0464\u0005\u0085\u0000\u0000\u0463\u044d"+
		"\u0001\u0000\u0000\u0000\u0463\u0450\u0001\u0000\u0000\u0000\u0463\u0453"+
		"\u0001\u0000\u0000\u0000\u0463\u0456\u0001\u0000\u0000\u0000\u0463\u0459"+
		"\u0001\u0000\u0000\u0000\u0463\u045d\u0001\u0000\u0000\u0000\u0463\u0462"+
		"\u0001\u0000\u0000\u0000\u0464\u00a3\u0001\u0000\u0000\u0000\u0465\u0466"+
		"\u0005\u0085\u0000\u0000\u0466\u0468\u0007\t\u0000\u0000\u0467\u0465\u0001"+
		"\u0000\u0000\u0000\u0467\u0468\u0001\u0000\u0000\u0000\u0468\u0469\u0001"+
		"\u0000\u0000\u0000\u0469\u0475\u0005{\u0000\u0000\u046a\u0472\u0003\u00a6"+
		"S\u0000\u046b\u046d\u0005\u0083\u0000\u0000\u046c\u046e\u0005\u0083\u0000"+
		"\u0000\u046d\u046c\u0001\u0000\u0000\u0000\u046d\u046e\u0001\u0000\u0000"+
		"\u0000\u046e\u046f\u0001\u0000\u0000\u0000\u046f\u0471\u0003\u00a6S\u0000"+
		"\u0470\u046b\u0001\u0000\u0000\u0000\u0471\u0474\u0001\u0000\u0000\u0000"+
		"\u0472\u0470\u0001\u0000\u0000\u0000\u0472\u0473\u0001\u0000\u0000\u0000"+
		"\u0473\u0476\u0001\u0000\u0000\u0000\u0474\u0472\u0001\u0000\u0000\u0000"+
		"\u0475\u046a\u0001\u0000\u0000\u0000\u0475\u0476\u0001\u0000\u0000\u0000"+
		"\u0476\u0477\u0001\u0000\u0000\u0000\u0477\u0478\u0005|\u0000\u0000\u0478"+
		"\u00a5\u0001\u0000\u0000\u0000\u0479\u047c\u0005\u0085\u0000\u0000\u047a"+
		"\u047b\u0005x\u0000\u0000\u047b\u047d\u0007\n\u0000\u0000\u047c\u047a"+
		"\u0001\u0000\u0000\u0000\u047c\u047d\u0001\u0000\u0000\u0000\u047d\u0485"+
		"\u0001\u0000\u0000\u0000\u047e\u047f\u0005\u0085\u0000\u0000\u047f\u0480"+
		"\u0005z\u0000\u0000\u0480\u0481\u0005y\u0000\u0000\u0481\u0482\u0005x"+
		"\u0000\u0000\u0482\u0485\u0005y\u0000\u0000\u0483\u0485\u0005y\u0000\u0000"+
		"\u0484\u0479\u0001\u0000\u0000\u0000\u0484\u047e\u0001\u0000\u0000\u0000"+
		"\u0484\u0483\u0001\u0000\u0000\u0000\u0485\u00a7\u0001\u0000\u0000\u0000"+
		"\u0486\u0487\u0005\u0085\u0000\u0000\u0487\u00a9\u0001\u0000\u0000\u0000"+
		"\u0488\u0489\u0007\u000b\u0000\u0000\u0489\u00ab\u0001\u0000\u0000\u0000"+
		"\u048a\u048c\u0005\'\u0000\u0000\u048b\u048a\u0001\u0000\u0000\u0000\u048b"+
		"\u048c\u0001\u0000\u0000\u0000\u048c\u048d\u0001\u0000\u0000\u0000\u048d"+
		"\u048e\u0005\u001e\u0000\u0000\u048e\u048f\u0005q\u0000\u0000\u048f\u0490"+
		"\u0005Y\u0000\u0000\u0490\u0491\u00053\u0000\u0000\u0491\u0492\u00058"+
		"\u0000\u0000\u0492\u049b\u0005d\u0000\u0000\u0493\u0498\u0003\u00aeW\u0000"+
		"\u0494\u0495\u0005Z\u0000\u0000\u0495\u0497\u0003\u00aeW\u0000\u0496\u0494"+
		"\u0001\u0000\u0000\u0000\u0497\u049a\u0001\u0000\u0000\u0000\u0498\u0496"+
		"\u0001\u0000\u0000\u0000\u0498\u0499\u0001\u0000\u0000\u0000\u0499\u049c"+
		"\u0001\u0000\u0000\u0000\u049a\u0498\u0001\u0000\u0000\u0000\u049b\u0493"+
		"\u0001\u0000\u0000\u0000\u049b\u049c\u0001\u0000\u0000\u0000\u049c\u049d"+
		"\u0001\u0000\u0000\u0000\u049d\u049e\u0005e\u0000\u0000\u049e\u049f\u0005"+
		"X\u0000\u0000\u049f\u00ad\u0001\u0000\u0000\u0000\u04a0\u04a9\u0005b\u0000"+
		"\u0000\u04a1\u04a6\u0003\u00b0X\u0000\u04a2\u04a3\u0005Z\u0000\u0000\u04a3"+
		"\u04a5\u0003\u00b0X\u0000\u04a4\u04a2\u0001\u0000\u0000\u0000\u04a5\u04a8"+
		"\u0001\u0000\u0000\u0000\u04a6\u04a4\u0001\u0000\u0000\u0000\u04a6\u04a7"+
		"\u0001\u0000\u0000\u0000\u04a7\u04aa\u0001\u0000\u0000\u0000\u04a8\u04a6"+
		"\u0001\u0000\u0000\u0000\u04a9\u04a1\u0001\u0000\u0000\u0000\u04a9\u04aa"+
		"\u0001\u0000\u0000\u0000\u04aa\u04ab\u0001\u0000\u0000\u0000\u04ab\u04ac"+
		"\u0005c\u0000\u0000\u04ac\u00af\u0001\u0000\u0000\u0000\u04ad\u04ae\u0005"+
		"\u008b\u0000\u0000\u04ae\u04af\u0005Y\u0000\u0000\u04af\u04d7\u0005m\u0000"+
		"\u0000\u04b0\u04b1\u0005\u008c\u0000\u0000\u04b1\u04b2\u0005Y\u0000\u0000"+
		"\u04b2\u04d7\u0005q\u0000\u0000\u04b3\u04b4\u0005\u008d\u0000\u0000\u04b4"+
		"\u04b5\u0005Y\u0000\u0000\u04b5\u04d7\u0005m\u0000\u0000\u04b6\u04b7\u0005"+
		"\u008e\u0000\u0000\u04b7\u04b8\u0005Y\u0000\u0000\u04b8\u04d7\u0005m\u0000"+
		"\u0000\u04b9\u04ba\u0005\u008f\u0000\u0000\u04ba\u04bb\u0005Y\u0000\u0000"+
		"\u04bb\u04c4\u0005d\u0000\u0000\u04bc\u04c1\u0003\u00aeW\u0000\u04bd\u04be"+
		"\u0005Z\u0000\u0000\u04be\u04c0\u0003\u00aeW\u0000\u04bf\u04bd\u0001\u0000"+
		"\u0000\u0000\u04c0\u04c3\u0001\u0000\u0000\u0000\u04c1\u04bf\u0001\u0000"+
		"\u0000\u0000\u04c1\u04c2\u0001\u0000\u0000\u0000\u04c2\u04c5\u0001\u0000"+
		"\u0000\u0000\u04c3\u04c1\u0001\u0000\u0000\u0000\u04c4\u04bc\u0001\u0000"+
		"\u0000\u0000\u04c4\u04c5\u0001\u0000\u0000\u0000\u04c5\u04c6\u0001\u0000"+
		"\u0000\u0000\u04c6\u04d7\u0005e\u0000\u0000\u04c7\u04c8\u0005\u0090\u0000"+
		"\u0000\u04c8\u04c9\u0005Y\u0000\u0000\u04c9\u04d7\u0003\u001c\u000e\u0000"+
		"\u04ca\u04cb\u0005\u0091\u0000\u0000\u04cb\u04cc\u0005Y\u0000\u0000\u04cc"+
		"\u04d7\u0003x<\u0000\u04cd\u04ce\u0005\u0092\u0000\u0000\u04ce\u04cf\u0005"+
		"Y\u0000\u0000\u04cf\u04d7\u0003x<\u0000\u04d0\u04d1\u0005\u0093\u0000"+
		"\u0000\u04d1\u04d2\u0005Y\u0000\u0000\u04d2\u04d7\u0005m\u0000\u0000\u04d3"+
		"\u04d4\u0005q\u0000\u0000\u04d4\u04d5\u0005Y\u0000\u0000\u04d5\u04d7\u0003"+
		"\u008eG\u0000\u04d6\u04ad\u0001\u0000\u0000\u0000\u04d6\u04b0\u0001\u0000"+
		"\u0000\u0000\u04d6\u04b3\u0001\u0000\u0000\u0000\u04d6\u04b6\u0001\u0000"+
		"\u0000\u0000\u04d6\u04b9\u0001\u0000\u0000\u0000\u04d6\u04c7\u0001\u0000"+
		"\u0000\u0000\u04d6\u04ca\u0001\u0000\u0000\u0000\u04d6\u04cd\u0001\u0000"+
		"\u0000\u0000\u04d6\u04d0\u0001\u0000\u0000\u0000\u04d6\u04d3\u0001\u0000"+
		"\u0000\u0000\u04d7\u00b1\u0001\u0000\u0000\u0000\u0094\u00b5\u00ba\u00bc"+
		"\u00c8\u00d5\u00de\u00e2\u00e4\u00ea\u00f9\u00ff\u0103\u0106\u010d\u0113"+
		"\u0118\u0121\u0126\u012e\u0132\u0136\u013b\u0140\u0142\u014b\u014e\u0158"+
		"\u015c\u016d\u0173\u0176\u0180\u0184\u01aa\u01b0\u01b3\u01bd\u01c1\u01c9"+
		"\u01cf\u01d7\u01da\u01e4\u01e8\u01f2\u01f5\u01ff\u0203\u020a\u0214\u0217"+
		"\u021f\u0222\u022b\u022f\u0235\u0237\u023d\u0241\u0245\u0249\u024d\u0254"+
		"\u0258\u025d\u0262\u0269\u0273\u0277\u0281\u0284\u028d\u0292\u0299\u02a6"+
		"\u02aa\u02af\u02bb\u02bd\u02c9\u02cd\u02d1\u02dd\u02e1\u02f5\u02f9\u02fd"+
		"\u0301\u0306\u030f\u0316\u031a\u031e\u0342\u0349\u0351\u0355\u035a\u035e"+
		"\u0366\u0369\u036c\u0376\u037a\u0383\u0387\u038c\u0391\u0395\u039b\u039f"+
		"\u03aa\u03ad\u03b4\u03b9\u03ca\u03e8\u03ea\u03f3\u03fd\u0403\u0407\u040e"+
		"\u0416\u041f\u0426\u0429\u042f\u043e\u0442\u0449\u044b\u0460\u0463\u0467"+
		"\u046d\u0472\u0475\u047c\u0484\u048b\u0498\u049b\u04a6\u04a9\u04c1\u04c4"+
		"\u04d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}