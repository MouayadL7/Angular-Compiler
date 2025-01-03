// Generated from C:/Users/MEED/IdeaProjects/Angular/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACES=1, LINE_COMMENT=2, BLOCK_COMMENT=3, MODULE=4, COMPONENT=5, DIRECTIVE=6, 
		PIPE=7, INJECTABLE=8, SELECTOR=9, TEMPLATE_URL=10, TEMPLATE=11, STYLE_URLS=12, 
		STYLES=13, IMPORTS=14, EXPORTS=15, INPUTS=16, OUTPUTS=17, DECLARATIONS=18, 
		PROVIDERS=19, BOOTSTRAP=20, STANDALONE=21, IMPORT=22, FROM=23, AS=24, 
		PLATFORM_BROWSER_DYNAMIC=25, BOOTSTRAP_MODULE=26, BOOTSTRAP_APPLICATION=27, 
		LET=28, CONST=29, IF=30, ELSE=31, RETURN=32, THROW=33, CONSOLE=34, LOG=35, 
		CATCH=36, EXPORT=37, INTERFACE=38, CLASS=39, ENUM=40, EXTENDS=41, IMPLEMENTS=42, 
		CONSTRUCTOR=43, THIS=44, NEW=45, FUNCTION=46, PRIVATE=47, PUBLIC=48, PROTECTED=49, 
		GT=50, GTE=51, LT=52, LTE=53, ASSIGN=54, NOT=55, EQ=56, NEQ=57, STRICT_EQ=58, 
		STRICT_NEQ=59, PLUS=60, MINUS=61, MULT=62, DIV=63, MOD=64, AND=65, OR=66, 
		BIT_AND=67, BIT_XOR=68, BIT_OR=69, PLUS_ASSIGN=70, MINUS_ASSIGN=71, MULTIPLY_ASSIGN=72, 
		DIVIDE_ASSIGN=73, MODULUS_ASSIGN=74, POWER_ASSIGN=75, RIGHT_SHIFT_ARITHMETIC_ASSIGN=76, 
		LEFT_SHIFT_ARITHMETIC_ASSIGN=77, RIGHT_SHIFT_LOGICAL_ASSIGN=78, BIT_AND_ASSIGN=79, 
		BIT_XOR_ASSIGN=80, BIT_OR_ASSIGN=81, ARROW=82, NULLCOALESCE=83, PLUS_PLUS=84, 
		MINUS_MINUS=85, SEMI=86, COLON=87, COMMA=88, DOT=89, QUES=90, AT=91, HASH_TAG=92, 
		QUOTE=93, LPAREN=94, RPAREN=95, LBRACE=96, RBRACE=97, LBRACK=98, RBRACK=99, 
		STRING=100, NUMBER=101, BOOL=102, NULL=103, IDENTIFIER=104, BEGINNING_HTML=105, 
		OPEN_TAG=106, CLOSE_TAG=107, SLASH=108, EQUALS=109, STRING_HTML=110, INTERPOLATION_START=111, 
		INTERPOLATION_END=112, BINDING=113, EVENT=114, TWOBIND=115, NGFOR=116, 
		NGIF=117, DDIRECTIVE=118, P=119, REFERENCE_VAR=120, ATTRIBUTE=121, WHITESPACE=122, 
		COMMENT=123, END_HTML=124;
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
		RULE_bootstrapCall = 55, RULE_parameterList = 56, RULE_parameter = 57, 
		RULE_parameterDeclaration = 58, RULE_array = 59, RULE_value = 60, RULE_object = 61, 
		RULE_attributes = 62, RULE_attribute = 63, RULE_objectInstantiation = 64, 
		RULE_memberAccess = 65, RULE_arrayAccess = 66, RULE_initialization = 67, 
		RULE_primary = 68, RULE_literal = 69, RULE_expression = 70, RULE_genericType = 71, 
		RULE_typeAnnotation = 72, RULE_accessModifier = 73, RULE_htmlTemplate = 74, 
		RULE_element = 75, RULE_openTag = 76, RULE_closeTag = 77, RULE_selfClosingTag = 78, 
		RULE_content = 79, RULE_attributeHTML = 80, RULE_interpolation = 81, RULE_tagName = 82, 
		RULE_structuralDirective = 83;
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
			"elseStatement", "statementBody", "functionCall", "bootstrapCall", "parameterList", 
			"parameter", "parameterDeclaration", "array", "value", "object", "attributes", 
			"attribute", "objectInstantiation", "memberAccess", "arrayAccess", "initialization", 
			"primary", "literal", "expression", "genericType", "typeAnnotation", 
			"accessModifier", "htmlTemplate", "element", "openTag", "closeTag", "selfClosingTag", 
			"content", "attributeHTML", "interpolation", "tagName", "structuralDirective"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'@NgModule'", "'@Component'", "'@Directive'", 
			"'@Pipe'", "'@Injectable'", "'selector'", "'templateUrl'", "'template'", 
			"'styleUrls'", "'styles'", "'imports'", "'exports'", "'inputs'", "'outputs'", 
			"'declarations'", "'providers'", "'bootstrap'", "'standalone'", "'import'", 
			"'from'", "'as'", "'platformBrowserDynamic'", "'bootstrapModule'", "'bootstrapApplication'", 
			"'let'", "'const'", "'if'", "'else'", "'return'", "'throw'", "'console'", 
			"'log'", "'catch'", "'export'", "'interface'", "'class'", "'enum'", "'extends'", 
			"'implements'", "'constructor'", "'this'", "'new'", "'function'", "'private'", 
			"'public'", "'protected'", null, "'>='", null, "'<='", null, "'!'", "'=='", 
			"'!='", "'==='", "'!=='", "'+'", "'-'", "'*'", null, "'%'", "'&&'", "'||'", 
			"'&'", "'^'", null, "'+='", "'-='", "'*='", "'/='", "'%='", "'**='", 
			"'>>='", "'<<='", "'>>>='", "'&='", "'^='", "'|='", "'=>'", "'??'", "'++'", 
			"'--'", "';'", "':'", "','", "'.'", "'?'", "'@'", "'#'", null, "'('", 
			"')'", "'{'", "'}'", "'['", "']'", null, null, null, "'null'", null, 
			null, null, null, null, null, null, "'{{'", "'}}'", null, null, null, 
			"'*ngFor'", "'*ngIf'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACES", "LINE_COMMENT", "BLOCK_COMMENT", "MODULE", "COMPONENT", 
			"DIRECTIVE", "PIPE", "INJECTABLE", "SELECTOR", "TEMPLATE_URL", "TEMPLATE", 
			"STYLE_URLS", "STYLES", "IMPORTS", "EXPORTS", "INPUTS", "OUTPUTS", "DECLARATIONS", 
			"PROVIDERS", "BOOTSTRAP", "STANDALONE", "IMPORT", "FROM", "AS", "PLATFORM_BROWSER_DYNAMIC", 
			"BOOTSTRAP_MODULE", "BOOTSTRAP_APPLICATION", "LET", "CONST", "IF", "ELSE", 
			"RETURN", "THROW", "CONSOLE", "LOG", "CATCH", "EXPORT", "INTERFACE", 
			"CLASS", "ENUM", "EXTENDS", "IMPLEMENTS", "CONSTRUCTOR", "THIS", "NEW", 
			"FUNCTION", "PRIVATE", "PUBLIC", "PROTECTED", "GT", "GTE", "LT", "LTE", 
			"ASSIGN", "NOT", "EQ", "NEQ", "STRICT_EQ", "STRICT_NEQ", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "AND", "OR", "BIT_AND", "BIT_XOR", "BIT_OR", "PLUS_ASSIGN", 
			"MINUS_ASSIGN", "MULTIPLY_ASSIGN", "DIVIDE_ASSIGN", "MODULUS_ASSIGN", 
			"POWER_ASSIGN", "RIGHT_SHIFT_ARITHMETIC_ASSIGN", "LEFT_SHIFT_ARITHMETIC_ASSIGN", 
			"RIGHT_SHIFT_LOGICAL_ASSIGN", "BIT_AND_ASSIGN", "BIT_XOR_ASSIGN", "BIT_OR_ASSIGN", 
			"ARROW", "NULLCOALESCE", "PLUS_PLUS", "MINUS_MINUS", "SEMI", "COLON", 
			"COMMA", "DOT", "QUES", "AT", "HASH_TAG", "QUOTE", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "STRING", "NUMBER", "BOOL", "NULL", 
			"IDENTIFIER", "BEGINNING_HTML", "OPEN_TAG", "CLOSE_TAG", "SLASH", "EQUALS", 
			"STRING_HTML", "INTERPOLATION_START", "INTERPOLATION_END", "BINDING", 
			"EVENT", "TWOBIND", "NGFOR", "NGIF", "DDIRECTIVE", "P", "REFERENCE_VAR", 
			"ATTRIBUTE", "WHITESPACE", "COMMENT", "END_HTML"
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
	public String getGrammarFileName() { return "AngularParser.g4"; }

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
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(168);
				importStatement();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36118851712188912L) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 2032643L) != 0)) {
				{
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(174);
					declaration();
					}
					break;
				case 2:
					{
					setState(175);
					statement();
					}
					break;
				}
				}
				setState(180);
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
			setState(181);
			match(IMPORT);
			setState(182);
			importDeclaration();
			setState(183);
			match(FROM);
			setState(184);
			match(STRING);
			setState(185);
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new DefaultSpecifierDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				importDefaultSpecifier();
				}
				break;
			case 2:
				_localctx = new NamespaceSpecifierDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				importNamespaceSpecifier();
				}
				break;
			case 3:
				_localctx = new NamedSpecifierDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
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
			setState(192);
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
			setState(194);
			match(MULT);
			setState(195);
			match(AS);
			setState(196);
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
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(198);
				importSpecifier();
				setState(199);
				match(COMMA);
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(LBRACE);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0) || _la==IDENTIFIER) {
				{
				setState(207);
				importSpecifier();
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(208);
						match(COMMA);
						setState(209);
						importSpecifier();
						}
						} 
					}
					setState(214);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(215);
					match(COMMA);
					}
				}

				}
			}

			setState(220);
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
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new IdentifierImportSpecifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(IDENTIFIER);
				}
				break;
			case PLATFORM_BROWSER_DYNAMIC:
			case BOOTSTRAP_MODULE:
			case BOOTSTRAP_APPLICATION:
				_localctx = new BootstrapImportSpecifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
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
			setState(226);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 234881024L) != 0)) ) {
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
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new NgModuleDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				ngModuleDeclaration();
				}
				break;
			case 2:
				_localctx = new ComponentDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				componentDeclaration();
				}
				break;
			case 3:
				_localctx = new PipeDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				pipeDeclaration();
				}
				break;
			case 4:
				_localctx = new InjectableDeclContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				injectableDeclaration();
				}
				break;
			case 5:
				_localctx = new DirectiveDeclContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				directiveDeclaration();
				}
				break;
			case 6:
				_localctx = new InterfaceDeclContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(233);
				interfaceDeclaration();
				}
				break;
			case 7:
				_localctx = new ClassDeclContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(234);
				classDeclaration();
				}
				break;
			case 8:
				_localctx = new EnumDeclContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(235);
				enumDeclaration();
				}
				break;
			case 9:
				_localctx = new VariableDeclContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(236);
				variableDeclaration();
				}
				break;
			case 10:
				_localctx = new FunctionDeclContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(237);
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
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AngularParser.ASSIGN, 0); }
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
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
			setState(240);
			varHelper();
			setState(241);
			match(IDENTIFIER);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(242);
				match(COLON);
				setState(243);
				typeAnnotation();
				}
			}

			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(246);
				match(ASSIGN);
				setState(247);
				initialization();
				}
			}

			setState(250);
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
			setState(252);
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
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new NormalFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				normalFunction();
				}
				break;
			case 2:
				_localctx = new AnonymousFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				anonymousFunction();
				}
				break;
			case 3:
				_localctx = new ArrowFunctionDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
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
			setState(259);
			match(FUNCTION);
			setState(260);
			match(IDENTIFIER);
			setState(261);
			match(LPAREN);
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 2257573349242701883L) != 0)) {
				{
				setState(262);
				parameterList();
				}
			}

			setState(265);
			match(RPAREN);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(266);
				match(COLON);
				setState(267);
				typeAnnotation();
				}
			}

			setState(270);
			match(LBRACE);
			setState(271);
			block();
			setState(272);
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
			setState(274);
			match(FUNCTION);
			setState(275);
			match(LPAREN);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 2257573349242701883L) != 0)) {
				{
				setState(276);
				parameterList();
				}
			}

			setState(279);
			match(RPAREN);
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

			setState(284);
			match(LBRACE);
			setState(285);
			block();
			setState(286);
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
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				{
				setState(288);
				match(LPAREN);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 2257573349242701883L) != 0)) {
					{
					setState(289);
					parameterList();
					}
				}

				setState(292);
				match(RPAREN);
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(293);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(296);
				match(COLON);
				setState(297);
				typeAnnotation();
				}
			}

			setState(300);
			match(ARROW);
			setState(303);
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
			case NOT:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case LPAREN:
			case STRING:
			case NUMBER:
			case BOOL:
			case NULL:
			case IDENTIFIER:
				{
				setState(301);
				statement();
				}
				break;
			case LBRACE:
				{
				setState(302);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(305);
			match(LBRACE);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36046421383708672L) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 2032643L) != 0)) {
				{
				setState(308);
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
				case NOT:
				case PLUS_PLUS:
				case MINUS_MINUS:
				case LPAREN:
				case STRING:
				case NUMBER:
				case BOOL:
				case NULL:
				case IDENTIFIER:
					{
					setState(306);
					statement();
					}
					break;
				case LET:
				case CONST:
					{
					setState(307);
					variableDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
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
			setState(315);
			match(MODULE);
			setState(316);
			match(LPAREN);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(317);
				match(LBRACE);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1884160L) != 0)) {
					{
					setState(318);
					moduleMetadata();
					}
				}

				setState(321);
				match(RBRACE);
				}
			}

			setState(324);
			match(RPAREN);
			setState(325);
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
			setState(327);
			metadataModuleProperty();
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(328);
					match(COMMA);
					setState(329);
					metadataModuleProperty();
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(335);
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
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOTSTRAP:
				_localctx = new BootstrapPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(BOOTSTRAP);
				setState(339);
				match(COLON);
				setState(340);
				array();
				}
				break;
			case DECLARATIONS:
				_localctx = new DeclarationsModulePropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(DECLARATIONS);
				setState(342);
				match(COLON);
				setState(343);
				array();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsModulePropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(344);
				match(IMPORTS);
				setState(345);
				match(COLON);
				setState(346);
				array();
				}
				break;
			case EXPORTS:
				_localctx = new ExportsModulePropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				match(EXPORTS);
				setState(348);
				match(COLON);
				setState(349);
				array();
				}
				break;
			case PROVIDERS:
				_localctx = new ProvidersModulePropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(350);
				match(PROVIDERS);
				setState(351);
				match(COLON);
				setState(352);
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
			setState(355);
			match(COMPONENT);
			setState(356);
			match(LPAREN);
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(357);
				match(LBRACE);
				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145216L) != 0)) {
					{
					setState(358);
					componentMetadata();
					}
				}

				setState(361);
				match(RBRACE);
				}
			}

			setState(364);
			match(RPAREN);
			setState(365);
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
			setState(367);
			metadataComponentProperty();
			setState(372);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(368);
					match(COMMA);
					setState(369);
					metadataComponentProperty();
					}
					} 
				}
				setState(374);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(375);
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
		public TerminalNode STRING() { return getToken(AngularParser.STRING, 0); }
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
			setState(414);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(SELECTOR);
				setState(379);
				match(COLON);
				setState(380);
				match(STRING);
				}
				break;
			case TEMPLATE_URL:
				_localctx = new TemplateUrlPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				match(TEMPLATE_URL);
				setState(382);
				match(COLON);
				setState(383);
				match(STRING);
				}
				break;
			case TEMPLATE:
				_localctx = new TemplatePropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				match(TEMPLATE);
				setState(385);
				match(COLON);
				setState(386);
				htmlTemplate();
				}
				break;
			case STYLE_URLS:
				_localctx = new StyleUrlsPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				match(STYLE_URLS);
				setState(388);
				match(COLON);
				setState(389);
				array();
				}
				break;
			case STYLES:
				_localctx = new StylesPropertyContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(390);
				match(STYLES);
				setState(391);
				match(COLON);
				setState(392);
				array();
				}
				break;
			case STANDALONE:
				_localctx = new StandalonePropertyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(393);
				match(STANDALONE);
				setState(394);
				match(COLON);
				setState(395);
				match(STRING);
				}
				break;
			case INPUTS:
				_localctx = new InputsPropertyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(396);
				match(INPUTS);
				setState(397);
				match(COLON);
				setState(398);
				array();
				}
				break;
			case OUTPUTS:
				_localctx = new OutputsPropertyContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(399);
				match(OUTPUTS);
				setState(400);
				match(COLON);
				setState(401);
				array();
				}
				break;
			case IMPORTS:
				_localctx = new ImportsComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(402);
				match(IMPORTS);
				setState(403);
				match(COLON);
				setState(404);
				array();
				}
				break;
			case EXPORTS:
				_localctx = new ExportsComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(405);
				match(EXPORTS);
				setState(406);
				match(COLON);
				setState(407);
				array();
				}
				break;
			case PROVIDERS:
				_localctx = new ProvidersComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(408);
				match(PROVIDERS);
				setState(409);
				match(COLON);
				setState(410);
				array();
				}
				break;
			case DECLARATIONS:
				_localctx = new DeclarationsComponentPropertyContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(411);
				match(DECLARATIONS);
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
			setState(416);
			match(DIRECTIVE);
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
				if (_la==SELECTOR || _la==IDENTIFIER) {
					{
					setState(419);
					directiveMetadata();
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
			setState(428);
			directiveMetadataProperty();
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(429);
					match(COMMA);
					setState(430);
					directiveMetadataProperty();
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECTOR:
				_localctx = new SelectorDirectivePropertyContext(_localctx);
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
			case IDENTIFIER:
				_localctx = new IdentifierPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(IDENTIFIER);
				setState(443);
				match(COLON);
				setState(444);
				value();
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
			setState(447);
			match(AT);
			setState(448);
			match(IDENTIFIER);
			setState(449);
			match(LPAREN);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 2257573349242701883L) != 0)) {
				{
				setState(450);
				parameterList();
				}
			}

			setState(453);
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
			setState(455);
			match(PIPE);
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
				if (_la==IDENTIFIER) {
					{
					setState(458);
					pipeMetadata();
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
			setState(467);
			pipeMetadataProperty();
			setState(472);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(468);
					match(COMMA);
					setState(469);
					pipeMetadataProperty();
					}
					} 
				}
				setState(474);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
	public static class PipeMetadataPropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(AngularParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
			setState(478);
			match(IDENTIFIER);
			setState(479);
			match(COLON);
			setState(480);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
			setState(482);
			match(INJECTABLE);
			setState(483);
			match(LPAREN);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(484);
				match(LBRACE);
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(485);
					injectableMetadata();
					}
				}

				setState(488);
				match(RBRACE);
				}
			}

			setState(491);
			match(RPAREN);
			setState(492);
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
			setState(494);
			injectableMetadataProperty();
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(495);
					match(COMMA);
					setState(496);
					injectableMetadataProperty();
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(502);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
			setState(505);
			match(IDENTIFIER);
			setState(506);
			match(COLON);
			setState(507);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(509);
				match(EXPORT);
				}
			}

			setState(512);
			match(CLASS);
			setState(513);
			match(IDENTIFIER);
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(514);
				match(EXTENDS);
				setState(515);
				match(IDENTIFIER);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(516);
					match(COMMA);
					setState(517);
					match(IDENTIFIER);
					}
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(525);
				match(IMPLEMENTS);
				setState(526);
				match(IDENTIFIER);
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(527);
					match(COMMA);
					setState(528);
					match(IDENTIFIER);
					}
					}
					setState(533);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(536);
			match(LBRACE);
			setState(537);
			classBody();
			setState(538);
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
			setState(543);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(540);
					propertyDeclaration();
					}
					} 
				}
				setState(545);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRUCTOR) {
				{
				setState(546);
				constructorDeclaration();
				}
			}

			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36116790127886336L) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 2032771L) != 0)) {
				{
				setState(553);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(549);
					methodDeclaration();
					}
					break;
				case 2:
					{
					setState(550);
					statement();
					}
					break;
				case 3:
					{
					setState(551);
					variableDeclaration();
					}
					break;
				case 4:
					{
					setState(552);
					functionDeclaration();
					}
					break;
				}
				}
				setState(557);
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
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(558);
				decorator();
				}
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) {
				{
				setState(564);
				accessModifier();
				}
			}

			setState(567);
			match(IDENTIFIER);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON || _la==QUES) {
				{
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUES) {
					{
					setState(568);
					match(QUES);
					}
				}

				setState(571);
				match(COLON);
				setState(572);
				typeAnnotation();
				}
			}

			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(575);
				match(ASSIGN);
				setState(576);
				initialization();
				}
			}

			setState(579);
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
		public TerminalNode LBRACE() { return getToken(AngularParser.LBRACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(AngularParser.RBRACE, 0); }
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
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(581);
				decorator();
				}
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(587);
			match(IDENTIFIER);
			setState(588);
			match(LPAREN);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 2257573349242701883L) != 0)) {
				{
				setState(589);
				parameterList();
				}
			}

			setState(592);
			match(RPAREN);
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(593);
				match(COLON);
				setState(594);
				typeAnnotation();
				}
			}

			setState(597);
			match(LBRACE);
			setState(598);
			block();
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
			setState(601);
			match(CONSTRUCTOR);
			setState(602);
			match(LPAREN);
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 2257573349242701883L) != 0)) {
				{
				setState(603);
				parameterList();
				}
			}

			setState(606);
			match(RPAREN);
			setState(607);
			match(LBRACE);
			setState(608);
			constructorBody();
			setState(609);
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
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36046420578402304L) != 0) || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & 2032643L) != 0)) {
				{
				{
				setState(611);
				statement();
				}
				}
				setState(616);
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
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(617);
				match(EXPORT);
				}
			}

			setState(620);
			match(INTERFACE);
			setState(621);
			match(IDENTIFIER);
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(622);
				match(EXTENDS);
				setState(623);
				match(IDENTIFIER);
				setState(628);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(624);
					match(COMMA);
					setState(625);
					match(IDENTIFIER);
					}
					}
					setState(630);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(633);
			match(LBRACE);
			setState(634);
			interfaceBody();
			setState(635);
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
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(637);
				interfaceProperty();
				}
				}
				setState(642);
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
			setState(643);
			match(IDENTIFIER);
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==QUES) {
				{
				setState(644);
				match(QUES);
				}
			}

			setState(647);
			match(COLON);
			setState(648);
			typeAnnotation();
			setState(649);
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
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(651);
				match(EXPORT);
				}
			}

			setState(654);
			match(ENUM);
			setState(655);
			match(IDENTIFIER);
			setState(656);
			match(LBRACE);
			setState(657);
			enumBody();
			setState(658);
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
			setState(660);
			enumProperty();
			setState(665);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(661);
					match(COMMA);
					setState(662);
					enumProperty();
					}
					} 
				}
				setState(667);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(668);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
			setState(671);
			match(IDENTIFIER);
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(672);
				match(ASSIGN);
				setState(673);
				value();
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
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				_localctx = new AssignmentStContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				assignment();
				}
				break;
			case 2:
				_localctx = new PrintStContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(677);
				printStatement();
				}
				break;
			case 3:
				_localctx = new ReturnStContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(678);
				returnStatement();
				}
				break;
			case 4:
				_localctx = new ThrowStContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(679);
				throwStatement();
				}
				break;
			case 5:
				_localctx = new ConditionalStContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(680);
				conditionalStatement();
				}
				break;
			case 6:
				_localctx = new BootstrapCallStContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(681);
				bootstrapCall();
				}
				break;
			case 7:
				_localctx = new FunctionCallStContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(682);
				functionCall();
				}
				break;
			case 8:
				_localctx = new ExpressionStContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(683);
				expression(0);
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
			setState(686);
			memberAccess();
			setState(687);
			match(ASSIGN);
			setState(688);
			initialization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public TerminalNode LOG() { return getToken(AngularParser.LOG, 0); }
		public TerminalNode LPAREN() { return getToken(AngularParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(AngularParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(AngularParser.SEMI, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
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
			setState(690);
			match(CONSOLE);
			setState(691);
			match(DOT);
			setState(692);
			match(LOG);
			setState(693);
			match(LPAREN);
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 2257573349242701883L) != 0)) {
				{
				setState(694);
				parameterList();
				}
			}

			setState(697);
			match(RPAREN);
			setState(698);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(AngularParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(RETURN);
			setState(703);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(701);
				expression(0);
				}
				break;
			case 2:
				{
				setState(702);
				value();
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
	public static class ThrowStatementContext extends ParserRuleContext {
		public TerminalNode THROW() { return getToken(AngularParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
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
			setState(705);
			match(THROW);
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(706);
				expression(0);
				}
				break;
			case 2:
				{
				setState(707);
				value();
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
			setState(710);
			ifStatement();
			setState(714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(711);
					elseIfStatement();
					}
					} 
				}
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(717);
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
			setState(720);
			match(IF);
			setState(721);
			match(LPAREN);
			setState(722);
			expression(0);
			setState(723);
			match(RPAREN);
			setState(724);
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
			setState(726);
			match(ELSE);
			setState(727);
			match(IF);
			setState(728);
			match(LPAREN);
			setState(729);
			expression(0);
			setState(730);
			match(RPAREN);
			setState(731);
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
			setState(733);
			match(ELSE);
			setState(734);
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
			setState(738);
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
			case NOT:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case LPAREN:
			case STRING:
			case NUMBER:
			case BOOL:
			case NULL:
			case IDENTIFIER:
				{
				setState(736);
				statement();
				}
				break;
			case LBRACE:
				{
				setState(737);
				block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(740);
			match(IDENTIFIER);
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(741);
				genericType();
				}
			}

			setState(744);
			match(LPAREN);
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 2257573349242701883L) != 0)) {
				{
				setState(745);
				parameterList();
				}
			}

			setState(748);
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
			setState(750);
			bootstrapSpecifier();
			setState(751);
			match(LPAREN);
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 2257573349242701883L) != 0)) {
				{
				setState(752);
				parameterList();
				}
			}

			setState(755);
			match(RPAREN);
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(756);
				match(DOT);
				setState(757);
				match(CATCH);
				setState(758);
				match(LPAREN);
				setState(759);
				arrowFunction();
				setState(760);
				match(RPAREN);
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
		enterRule(_localctx, 112, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			parameter();
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(765);
				match(COMMA);
				setState(766);
				parameter();
				}
				}
				setState(771);
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
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	 
		public ParameterContext() { }
		public void copyFrom(ParameterContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueParameterContext extends ParameterContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueParameterContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValueParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValueParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValueParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationParContext extends ParameterContext {
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public ParameterDeclarationParContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameterDeclarationPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameterDeclarationPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameterDeclarationPar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionParameterContext extends ParameterContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionParameterContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionParameterContext extends ParameterContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public ArrowFunctionParameterContext(ParameterContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunctionParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunctionParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunctionParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_parameter);
		try {
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				_localctx = new ParameterDeclarationParContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(772);
				parameterDeclaration();
				}
				break;
			case 2:
				_localctx = new ValueParameterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(773);
				value();
				}
				break;
			case 3:
				_localctx = new ArrowFunctionParameterContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(774);
				arrowFunction();
				}
				break;
			case 4:
				_localctx = new ExpressionParameterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(775);
				expression(0);
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
		enterRule(_localctx, 116, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(778);
				decorator();
				}
				}
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) {
				{
				setState(784);
				accessModifier();
				}
			}

			setState(787);
			match(IDENTIFIER);
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(788);
				match(COLON);
				setState(789);
				typeAnnotation();
				}
			}

			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(792);
				match(ASSIGN);
				setState(793);
				initialization();
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
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(AngularParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(AngularParser.RBRACK, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
		enterRule(_localctx, 118, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			match(LBRACK);
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 2256303413312618499L) != 0)) {
				{
				setState(797);
				value();
				setState(802);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(798);
						match(COMMA);
						setState(799);
						value();
						}
						} 
					}
					setState(804);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				}
			}

			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(807);
				match(COMMA);
				}
			}

			setState(810);
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
		enterRule(_localctx, 120, RULE_value);
		try {
			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				_localctx = new PrimaryValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(812);
				primary();
				}
				break;
			case 2:
				_localctx = new ArrayValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(813);
				array();
				}
				break;
			case 3:
				_localctx = new ArrayAccessValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(814);
				arrayAccess();
				}
				break;
			case 4:
				_localctx = new MemberAccessValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(815);
				memberAccess();
				}
				break;
			case 5:
				_localctx = new ObjectValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(816);
				object();
				}
				break;
			case 6:
				_localctx = new ObjectInstantiationValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(817);
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
		enterRule(_localctx, 122, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(LBRACE);
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(821);
				attributes();
				}
			}

			setState(824);
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
		enterRule(_localctx, 124, RULE_attributes);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			attribute();
			setState(831);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(827);
					match(COMMA);
					setState(828);
					attribute();
					}
					} 
				}
				setState(833);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
			}
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(834);
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
		enterRule(_localctx, 126, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(IDENTIFIER);
			setState(838);
			match(COLON);
			setState(839);
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
		enterRule(_localctx, 128, RULE_objectInstantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(NEW);
			setState(842);
			match(IDENTIFIER);
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(843);
				genericType();
				}
			}

			setState(846);
			match(LPAREN);
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 2257573349242701883L) != 0)) {
				{
				setState(847);
				parameterList();
				}
			}

			setState(850);
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
		enterRule(_localctx, 130, RULE_memberAccess);
		try {
			setState(858);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new MemberAccessIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				match(IDENTIFIER);
				setState(854);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(853);
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
				setState(856);
				match(THIS);
				setState(857);
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
		enterRule(_localctx, 132, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			match(IDENTIFIER);
			setState(861);
			match(LBRACK);
			setState(862);
			expression(0);
			setState(863);
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
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
	 
		public InitializationContext() { }
		public void copyFrom(InitializationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionInitializationContext extends InitializationContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionInitializationContext(InitializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpressionInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpressionInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpressionInitialization(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValueInitializationContext extends InitializationContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueInitializationContext(InitializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterValueInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitValueInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitValueInitialization(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationInitializationContext extends InitializationContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionDeclarationInitializationContext(InitializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclarationInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclarationInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclarationInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_initialization);
		try {
			setState(868);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				_localctx = new ValueInitializationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(865);
				value();
				}
				break;
			case 2:
				_localctx = new ExpressionInitializationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(866);
				expression(0);
				}
				break;
			case 3:
				_localctx = new FunctionDeclarationInitializationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(867);
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
	public static class IDENTIFIERPrimaryContext extends PrimaryContext {
		public TerminalNode IDENTIFIER() { return getToken(AngularParser.IDENTIFIER, 0); }
		public IDENTIFIERPrimaryContext(PrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIDENTIFIERPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIDENTIFIERPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIDENTIFIERPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_primary);
		try {
			setState(872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case NUMBER:
			case BOOL:
			case NULL:
				_localctx = new LiteralPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				literal();
				}
				break;
			case IDENTIFIER:
				_localctx = new IDENTIFIERPrimaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(871);
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
		enterRule(_localctx, 138, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_la = _input.LA(1);
			if ( !(((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 15L) != 0)) ) {
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
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOT() { return getToken(AngularParser.DOT, 0); }
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
	public static class PrimaryExpressionContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
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
		int _startState = 140;
		enterRecursionRule(_localctx, 140, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(890);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionCallExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(877);
				functionCall();
				}
				break;
			case 2:
				{
				_localctx = new PreIncrementExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(878);
				match(PLUS_PLUS);
				setState(879);
				expression(14);
				}
				break;
			case 3:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(880);
				match(MINUS_MINUS);
				setState(881);
				expression(13);
				}
				break;
			case 4:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(882);
				match(NOT);
				setState(883);
				expression(12);
				}
				break;
			case 5:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(884);
				match(LPAREN);
				setState(885);
				expression(0);
				setState(886);
				match(RPAREN);
				}
				break;
			case 6:
				{
				_localctx = new PrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(888);
				primary();
				}
				break;
			case 7:
				{
				_localctx = new MemberAccessExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(889);
				arrayAccess();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(925);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(923);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
					case 1:
						{
						_localctx = new MemberAccessExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(892);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(893);
						match(DOT);
						setState(894);
						expression(12);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(895);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(896);
						_la = _input.LA(1);
						if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & 7L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(897);
						expression(11);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(898);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(899);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(900);
						expression(10);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(901);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(902);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16888498602639360L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(903);
						expression(9);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(904);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(905);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1098878309078401024L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(906);
						expression(8);
						}
						break;
					case 6:
						{
						_localctx = new LogicalAndExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(907);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(908);
						match(AND);
						setState(909);
						expression(7);
						}
						break;
					case 7:
						{
						_localctx = new LogicalOrExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(910);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(911);
						match(OR);
						setState(912);
						expression(6);
						}
						break;
					case 8:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(913);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(914);
						match(QUES);
						setState(915);
						expression(0);
						setState(916);
						match(COLON);
						setState(917);
						expression(5);
						}
						break;
					case 9:
						{
						_localctx = new PostIncrementExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(919);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(920);
						match(PLUS_PLUS);
						}
						break;
					case 10:
						{
						_localctx = new PostDecreaseExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(921);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(922);
						match(MINUS_MINUS);
						}
						break;
					}
					} 
				}
				setState(927);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
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
		enterRule(_localctx, 142, RULE_genericType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			match(LT);
			setState(929);
			typeAnnotation();
			setState(934);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(930);
				match(COMMA);
				setState(931);
				typeAnnotation();
				}
				}
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(937);
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
		enterRule(_localctx, 144, RULE_typeAnnotation);
		int _la;
		try {
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
			case 1:
				_localctx = new GenericTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				match(IDENTIFIER);
				setState(940);
				genericType();
				}
				break;
			case 2:
				_localctx = new PipeTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BIT_OR) {
					{
					{
					setState(942);
					match(BIT_OR);
					setState(943);
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
					setState(948);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				_localctx = new ArrayTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(949);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(950);
				match(LBRACK);
				setState(951);
				match(RBRACK);
				}
				break;
			case 4:
				_localctx = new TupleTypeAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(952);
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
		enterRule(_localctx, 146, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 985162418487296L) != 0)) ) {
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
		public TerminalNode BEGINNING_HTML() { return getToken(AngularParser.BEGINNING_HTML, 0); }
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
		enterRule(_localctx, 148, RULE_htmlTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(BEGINNING_HTML);
			setState(961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPEN_TAG || _la==INTERPOLATION_START) {
				{
				{
				setState(958);
				element();
				}
				}
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(964);
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
	public static class InterpolationElementContext extends ElementContext {
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public InterpolationElementContext(ElementContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class SelfClosingTagElementContext extends ElementContext {
		public SelfClosingTagContext selfClosingTag() {
			return getRuleContext(SelfClosingTagContext.class,0);
		}
		public SelfClosingTagElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSelfClosingTagElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSelfClosingTagElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSelfClosingTagElement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StandardTagElementContext extends ElementContext {
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
		public StandardTagElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStandardTagElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStandardTagElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStandardTagElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_element);
		try {
			int _alt;
			setState(977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				_localctx = new StandardTagElementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(966);
				openTag();
				setState(970);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(967);
						content();
						}
						} 
					}
					setState(972);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
				}
				setState(973);
				closeTag();
				}
				break;
			case 2:
				_localctx = new SelfClosingTagElementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(975);
				selfClosingTag();
				}
				break;
			case 3:
				_localctx = new InterpolationElementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(976);
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
		enterRule(_localctx, 152, RULE_openTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(OPEN_TAG);
			setState(980);
			tagName();
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 447L) != 0)) {
				{
				{
				setState(981);
				attributeHTML();
				}
				}
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(987);
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
		enterRule(_localctx, 154, RULE_closeTag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(OPEN_TAG);
			setState(990);
			match(SLASH);
			setState(991);
			tagName();
			setState(992);
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
		enterRule(_localctx, 156, RULE_selfClosingTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(OPEN_TAG);
			setState(995);
			tagName();
			setState(999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 447L) != 0)) {
				{
				{
				setState(996);
				attributeHTML();
				}
				}
				setState(1001);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1002);
			match(SLASH);
			setState(1003);
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
		enterRule(_localctx, 158, RULE_content);
		try {
			setState(1007);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_TAG:
			case INTERPOLATION_START:
				_localctx = new NestedElementContentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1005);
				element();
				}
				break;
			case ATTRIBUTE:
				_localctx = new PlainTextContentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1006);
				match(ATTRIBUTE);
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
		enterRule(_localctx, 160, RULE_attributeHTML);
		int _la;
		try {
			setState(1031);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				_localctx = new StandardAttributeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1009);
				match(ATTRIBUTE);
				setState(1010);
				match(EQUALS);
				setState(1011);
				match(STRING_HTML);
				}
				break;
			case 2:
				_localctx = new PropertyBindingContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1012);
				match(BINDING);
				setState(1013);
				match(EQUALS);
				setState(1014);
				match(STRING_HTML);
				}
				break;
			case 3:
				_localctx = new EventBindingContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1015);
				match(EVENT);
				setState(1016);
				match(EQUALS);
				setState(1017);
				match(STRING_HTML);
				}
				break;
			case 4:
				_localctx = new TwoWayBindingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1018);
				match(TWOBIND);
				setState(1019);
				match(EQUALS);
				setState(1020);
				match(STRING_HTML);
				}
				break;
			case 5:
				_localctx = new StructuralDirectiveAttrContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1021);
				structuralDirective();
				setState(1022);
				match(EQUALS);
				setState(1023);
				match(STRING_HTML);
				}
				break;
			case 6:
				_localctx = new TemplateReferenceVariableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(1025);
				match(REFERENCE_VAR);
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUALS) {
					{
					setState(1026);
					match(EQUALS);
					setState(1027);
					match(STRING_HTML);
					}
				}

				}
				break;
			case 7:
				_localctx = new AttributeOnlyContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(1030);
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
		public List<TerminalNode> ATTRIBUTE() { return getTokens(AngularParser.ATTRIBUTE); }
		public TerminalNode ATTRIBUTE(int i) {
			return getToken(AngularParser.ATTRIBUTE, i);
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
		enterRule(_localctx, 162, RULE_interpolation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1033);
			match(INTERPOLATION_START);
			setState(1042);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE) {
				{
				setState(1034);
				match(ATTRIBUTE);
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==P) {
					{
					{
					setState(1035);
					match(P);
					setState(1036);
					match(ATTRIBUTE);
					}
					}
					setState(1041);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1044);
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
		enterRule(_localctx, 164, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1046);
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
		enterRule(_localctx, 166, RULE_structuralDirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			_la = _input.LA(1);
			if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & 7L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 70:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 16);
		case 9:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001|\u041b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0001\u0000\u0005\u0000"+
		"\u00aa\b\u0000\n\u0000\f\u0000\u00ad\t\u0000\u0001\u0000\u0001\u0000\u0005"+
		"\u0000\u00b1\b\u0000\n\u0000\f\u0000\u00b4\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u00bf\b\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u00ca\b\u0005\n\u0005\f\u0005\u00cd\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00d3\b\u0005\n\u0005\f\u0005"+
		"\u00d6\t\u0005\u0001\u0005\u0003\u0005\u00d9\b\u0005\u0003\u0005\u00db"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u00e1"+
		"\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ef\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00f5\b\t\u0001\t\u0001\t\u0003\t\u00f9\b\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u0102\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0108\b\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u010d\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0003\r\u0116\b\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u011b\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0123\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0127\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u012b\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0130\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u0135\b\u000f\n\u000f\f\u000f\u0138\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0140"+
		"\b\u0010\u0001\u0010\u0003\u0010\u0143\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u014b\b\u0011"+
		"\n\u0011\f\u0011\u014e\t\u0011\u0001\u0011\u0003\u0011\u0151\b\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0162\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0168\b\u0013\u0001\u0013\u0003"+
		"\u0013\u016b\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0005\u0014\u0173\b\u0014\n\u0014\f\u0014\u0176\t\u0014"+
		"\u0001\u0014\u0003\u0014\u0179\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u019f\b\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01a5\b\u0016\u0001\u0016"+
		"\u0003\u0016\u01a8\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u01b0\b\u0017\n\u0017\f\u0017\u01b3"+
		"\t\u0017\u0001\u0017\u0003\u0017\u01b6\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01be\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01c4\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u01cc\b\u001a\u0001\u001a\u0003\u001a\u01cf\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u01d7\b\u001b\n\u001b\f\u001b\u01da\t\u001b\u0001\u001b\u0003\u001b"+
		"\u01dd\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01e7\b\u001d\u0001\u001d"+
		"\u0003\u001d\u01ea\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u01f2\b\u001e\n\u001e\f\u001e\u01f5"+
		"\t\u001e\u0001\u001e\u0003\u001e\u01f8\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0003 \u01ff\b \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0005 \u0207\b \n \f \u020a\t \u0003 \u020c\b \u0001 "+
		"\u0001 \u0001 \u0001 \u0005 \u0212\b \n \f \u0215\t \u0003 \u0217\b \u0001"+
		" \u0001 \u0001 \u0001 \u0001!\u0005!\u021e\b!\n!\f!\u0221\t!\u0001!\u0003"+
		"!\u0224\b!\u0001!\u0001!\u0001!\u0001!\u0005!\u022a\b!\n!\f!\u022d\t!"+
		"\u0001\"\u0005\"\u0230\b\"\n\"\f\"\u0233\t\"\u0001\"\u0003\"\u0236\b\""+
		"\u0001\"\u0001\"\u0003\"\u023a\b\"\u0001\"\u0001\"\u0003\"\u023e\b\"\u0001"+
		"\"\u0001\"\u0003\"\u0242\b\"\u0001\"\u0001\"\u0001#\u0005#\u0247\b#\n"+
		"#\f#\u024a\t#\u0001#\u0001#\u0001#\u0003#\u024f\b#\u0001#\u0001#\u0001"+
		"#\u0003#\u0254\b#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0003"+
		"$\u025d\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0005%\u0265\b%\n"+
		"%\f%\u0268\t%\u0001&\u0003&\u026b\b&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0005&\u0273\b&\n&\f&\u0276\t&\u0003&\u0278\b&\u0001&\u0001&"+
		"\u0001&\u0001&\u0001\'\u0005\'\u027f\b\'\n\'\f\'\u0282\t\'\u0001(\u0001"+
		"(\u0003(\u0286\b(\u0001(\u0001(\u0001(\u0001(\u0001)\u0003)\u028d\b)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0005*\u0298"+
		"\b*\n*\f*\u029b\t*\u0001*\u0003*\u029e\b*\u0001+\u0001+\u0001+\u0003+"+
		"\u02a3\b+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0003"+
		",\u02ad\b,\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0003.\u02b8\b.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0003/\u02c0"+
		"\b/\u00010\u00010\u00010\u00030\u02c5\b0\u00011\u00011\u00051\u02c9\b"+
		"1\n1\f1\u02cc\t1\u00011\u00031\u02cf\b1\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u00013\u00014\u0001"+
		"4\u00014\u00015\u00015\u00035\u02e3\b5\u00016\u00016\u00036\u02e7\b6\u0001"+
		"6\u00016\u00036\u02eb\b6\u00016\u00016\u00017\u00017\u00017\u00037\u02f2"+
		"\b7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u02fb\b7\u0001"+
		"8\u00018\u00018\u00058\u0300\b8\n8\f8\u0303\t8\u00019\u00019\u00019\u0001"+
		"9\u00039\u0309\b9\u0001:\u0005:\u030c\b:\n:\f:\u030f\t:\u0001:\u0003:"+
		"\u0312\b:\u0001:\u0001:\u0001:\u0003:\u0317\b:\u0001:\u0001:\u0003:\u031b"+
		"\b:\u0001;\u0001;\u0001;\u0001;\u0005;\u0321\b;\n;\f;\u0324\t;\u0003;"+
		"\u0326\b;\u0001;\u0003;\u0329\b;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0003<\u0333\b<\u0001=\u0001=\u0003=\u0337\b=\u0001=\u0001"+
		"=\u0001>\u0001>\u0001>\u0005>\u033e\b>\n>\f>\u0341\t>\u0001>\u0003>\u0344"+
		"\b>\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0003@\u034d\b@\u0001"+
		"@\u0001@\u0003@\u0351\b@\u0001@\u0001@\u0001A\u0001A\u0003A\u0357\bA\u0001"+
		"A\u0001A\u0003A\u035b\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001C\u0001"+
		"C\u0001C\u0003C\u0365\bC\u0001D\u0001D\u0003D\u0369\bD\u0001E\u0001E\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0003F\u037b\bF\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0005F\u039c\bF\nF\fF\u039f"+
		"\tF\u0001G\u0001G\u0001G\u0001G\u0005G\u03a5\bG\nG\fG\u03a8\tG\u0001G"+
		"\u0001G\u0001H\u0001H\u0001H\u0001H\u0001H\u0005H\u03b1\bH\nH\fH\u03b4"+
		"\tH\u0001H\u0001H\u0001H\u0001H\u0003H\u03ba\bH\u0001I\u0001I\u0001J\u0001"+
		"J\u0005J\u03c0\bJ\nJ\fJ\u03c3\tJ\u0001J\u0001J\u0001K\u0001K\u0005K\u03c9"+
		"\bK\nK\fK\u03cc\tK\u0001K\u0001K\u0001K\u0001K\u0003K\u03d2\bK\u0001L"+
		"\u0001L\u0001L\u0005L\u03d7\bL\nL\fL\u03da\tL\u0001L\u0001L\u0001M\u0001"+
		"M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001N\u0005N\u03e6\bN\nN\fN\u03e9"+
		"\tN\u0001N\u0001N\u0001N\u0001O\u0001O\u0003O\u03f0\bO\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u0405\bP\u0001P\u0003"+
		"P\u0408\bP\u0001Q\u0001Q\u0001Q\u0001Q\u0005Q\u040e\bQ\nQ\fQ\u0411\tQ"+
		"\u0003Q\u0413\bQ\u0001Q\u0001Q\u0001R\u0001R\u0001S\u0001S\u0001S\u0000"+
		"\u0001\u008cT\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u0000\n\u0001\u0000"+
		"\u0019\u001b\u0001\u0000\u001c\u001d\u0001\u0000dg\u0001\u0000>@\u0001"+
		"\u0000<=\u0001\u000025\u0002\u0000668;\u0001\u0000gh\u0001\u0000/1\u0001"+
		"\u0000tv\u047a\u0000\u00ab\u0001\u0000\u0000\u0000\u0002\u00b5\u0001\u0000"+
		"\u0000\u0000\u0004\u00be\u0001\u0000\u0000\u0000\u0006\u00c0\u0001\u0000"+
		"\u0000\u0000\b\u00c2\u0001\u0000\u0000\u0000\n\u00cb\u0001\u0000\u0000"+
		"\u0000\f\u00e0\u0001\u0000\u0000\u0000\u000e\u00e2\u0001\u0000\u0000\u0000"+
		"\u0010\u00ee\u0001\u0000\u0000\u0000\u0012\u00f0\u0001\u0000\u0000\u0000"+
		"\u0014\u00fc\u0001\u0000\u0000\u0000\u0016\u0101\u0001\u0000\u0000\u0000"+
		"\u0018\u0103\u0001\u0000\u0000\u0000\u001a\u0112\u0001\u0000\u0000\u0000"+
		"\u001c\u0126\u0001\u0000\u0000\u0000\u001e\u0131\u0001\u0000\u0000\u0000"+
		" \u013b\u0001\u0000\u0000\u0000\"\u0147\u0001\u0000\u0000\u0000$\u0161"+
		"\u0001\u0000\u0000\u0000&\u0163\u0001\u0000\u0000\u0000(\u016f\u0001\u0000"+
		"\u0000\u0000*\u019e\u0001\u0000\u0000\u0000,\u01a0\u0001\u0000\u0000\u0000"+
		".\u01ac\u0001\u0000\u0000\u00000\u01bd\u0001\u0000\u0000\u00002\u01bf"+
		"\u0001\u0000\u0000\u00004\u01c7\u0001\u0000\u0000\u00006\u01d3\u0001\u0000"+
		"\u0000\u00008\u01de\u0001\u0000\u0000\u0000:\u01e2\u0001\u0000\u0000\u0000"+
		"<\u01ee\u0001\u0000\u0000\u0000>\u01f9\u0001\u0000\u0000\u0000@\u01fe"+
		"\u0001\u0000\u0000\u0000B\u021f\u0001\u0000\u0000\u0000D\u0231\u0001\u0000"+
		"\u0000\u0000F\u0248\u0001\u0000\u0000\u0000H\u0259\u0001\u0000\u0000\u0000"+
		"J\u0266\u0001\u0000\u0000\u0000L\u026a\u0001\u0000\u0000\u0000N\u0280"+
		"\u0001\u0000\u0000\u0000P\u0283\u0001\u0000\u0000\u0000R\u028c\u0001\u0000"+
		"\u0000\u0000T\u0294\u0001\u0000\u0000\u0000V\u029f\u0001\u0000\u0000\u0000"+
		"X\u02ac\u0001\u0000\u0000\u0000Z\u02ae\u0001\u0000\u0000\u0000\\\u02b2"+
		"\u0001\u0000\u0000\u0000^\u02bc\u0001\u0000\u0000\u0000`\u02c1\u0001\u0000"+
		"\u0000\u0000b\u02c6\u0001\u0000\u0000\u0000d\u02d0\u0001\u0000\u0000\u0000"+
		"f\u02d6\u0001\u0000\u0000\u0000h\u02dd\u0001\u0000\u0000\u0000j\u02e2"+
		"\u0001\u0000\u0000\u0000l\u02e4\u0001\u0000\u0000\u0000n\u02ee\u0001\u0000"+
		"\u0000\u0000p\u02fc\u0001\u0000\u0000\u0000r\u0308\u0001\u0000\u0000\u0000"+
		"t\u030d\u0001\u0000\u0000\u0000v\u031c\u0001\u0000\u0000\u0000x\u0332"+
		"\u0001\u0000\u0000\u0000z\u0334\u0001\u0000\u0000\u0000|\u033a\u0001\u0000"+
		"\u0000\u0000~\u0345\u0001\u0000\u0000\u0000\u0080\u0349\u0001\u0000\u0000"+
		"\u0000\u0082\u035a\u0001\u0000\u0000\u0000\u0084\u035c\u0001\u0000\u0000"+
		"\u0000\u0086\u0364\u0001\u0000\u0000\u0000\u0088\u0368\u0001\u0000\u0000"+
		"\u0000\u008a\u036a\u0001\u0000\u0000\u0000\u008c\u037a\u0001\u0000\u0000"+
		"\u0000\u008e\u03a0\u0001\u0000\u0000\u0000\u0090\u03b9\u0001\u0000\u0000"+
		"\u0000\u0092\u03bb\u0001\u0000\u0000\u0000\u0094\u03bd\u0001\u0000\u0000"+
		"\u0000\u0096\u03d1\u0001\u0000\u0000\u0000\u0098\u03d3\u0001\u0000\u0000"+
		"\u0000\u009a\u03dd\u0001\u0000\u0000\u0000\u009c\u03e2\u0001\u0000\u0000"+
		"\u0000\u009e\u03ef\u0001\u0000\u0000\u0000\u00a0\u0407\u0001\u0000\u0000"+
		"\u0000\u00a2\u0409\u0001\u0000\u0000\u0000\u00a4\u0416\u0001\u0000\u0000"+
		"\u0000\u00a6\u0418\u0001\u0000\u0000\u0000\u00a8\u00aa\u0003\u0002\u0001"+
		"\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u00b2\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ae\u00b1\u0003\u0010\b\u0000\u00af\u00b1\u0003X,\u0000\u00b0"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u0001\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0016\u0000\u0000\u00b6"+
		"\u00b7\u0003\u0004\u0002\u0000\u00b7\u00b8\u0005\u0017\u0000\u0000\u00b8"+
		"\u00b9\u0005d\u0000\u0000\u00b9\u00ba\u0005V\u0000\u0000\u00ba\u0003\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bf\u0003\u0006\u0003\u0000\u00bc\u00bf\u0003"+
		"\b\u0004\u0000\u00bd\u00bf\u0003\n\u0005\u0000\u00be\u00bb\u0001\u0000"+
		"\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bf\u0005\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005h\u0000"+
		"\u0000\u00c1\u0007\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005>\u0000\u0000"+
		"\u00c3\u00c4\u0005\u0018\u0000\u0000\u00c4\u00c5\u0005h\u0000\u0000\u00c5"+
		"\t\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003\f\u0006\u0000\u00c7\u00c8"+
		"\u0005X\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c6\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00da\u0005"+
		"`\u0000\u0000\u00cf\u00d4\u0003\f\u0006\u0000\u00d0\u00d1\u0005X\u0000"+
		"\u0000\u00d1\u00d3\u0003\f\u0006\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d9\u0005X\u0000\u0000\u00d8"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00db\u0001\u0000\u0000\u0000\u00da\u00cf\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0005a\u0000\u0000\u00dd\u000b\u0001\u0000\u0000\u0000\u00de\u00e1"+
		"\u0005h\u0000\u0000\u00df\u00e1\u0003\u000e\u0007\u0000\u00e0\u00de\u0001"+
		"\u0000\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\r\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0007\u0000\u0000\u0000\u00e3\u000f\u0001\u0000"+
		"\u0000\u0000\u00e4\u00ef\u0003 \u0010\u0000\u00e5\u00ef\u0003&\u0013\u0000"+
		"\u00e6\u00ef\u00034\u001a\u0000\u00e7\u00ef\u0003:\u001d\u0000\u00e8\u00ef"+
		"\u0003,\u0016\u0000\u00e9\u00ef\u0003L&\u0000\u00ea\u00ef\u0003@ \u0000"+
		"\u00eb\u00ef\u0003R)\u0000\u00ec\u00ef\u0003\u0012\t\u0000\u00ed\u00ef"+
		"\u0003\u0016\u000b\u0000\u00ee\u00e4\u0001\u0000\u0000\u0000\u00ee\u00e5"+
		"\u0001\u0000\u0000\u0000\u00ee\u00e6\u0001\u0000\u0000\u0000\u00ee\u00e7"+
		"\u0001\u0000\u0000\u0000\u00ee\u00e8\u0001\u0000\u0000\u0000\u00ee\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ea\u0001\u0000\u0000\u0000\u00ee\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ef\u0011\u0001\u0000\u0000\u0000\u00f0\u00f1"+
		"\u0003\u0014\n\u0000\u00f1\u00f4\u0005h\u0000\u0000\u00f2\u00f3\u0005"+
		"W\u0000\u0000\u00f3\u00f5\u0003\u0090H\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u00056\u0000\u0000\u00f7\u00f9\u0003\u0086C\u0000\u00f8"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005V\u0000\u0000\u00fb\u0013"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0007\u0001\u0000\u0000\u00fd\u0015"+
		"\u0001\u0000\u0000\u0000\u00fe\u0102\u0003\u0018\f\u0000\u00ff\u0102\u0003"+
		"\u001a\r\u0000\u0100\u0102\u0003\u001c\u000e\u0000\u0101\u00fe\u0001\u0000"+
		"\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000"+
		"\u0000\u0000\u0102\u0017\u0001\u0000\u0000\u0000\u0103\u0104\u0005.\u0000"+
		"\u0000\u0104\u0105\u0005h\u0000\u0000\u0105\u0107\u0005^\u0000\u0000\u0106"+
		"\u0108\u0003p8\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0107\u0108\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010c\u0005"+
		"_\u0000\u0000\u010a\u010b\u0005W\u0000\u0000\u010b\u010d\u0003\u0090H"+
		"\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000"+
		"\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0005`\u0000\u0000"+
		"\u010f\u0110\u0003\u001e\u000f\u0000\u0110\u0111\u0005a\u0000\u0000\u0111"+
		"\u0019\u0001\u0000\u0000\u0000\u0112\u0113\u0005.\u0000\u0000\u0113\u0115"+
		"\u0005^\u0000\u0000\u0114\u0116\u0003p8\u0000\u0115\u0114\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000"+
		"\u0000\u0000\u0117\u011a\u0005_\u0000\u0000\u0118\u0119\u0005W\u0000\u0000"+
		"\u0119\u011b\u0003\u0090H\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0005`\u0000\u0000\u011d\u011e\u0003\u001e\u000f\u0000\u011e\u011f"+
		"\u0005a\u0000\u0000\u011f\u001b\u0001\u0000\u0000\u0000\u0120\u0122\u0005"+
		"^\u0000\u0000\u0121\u0123\u0003p8\u0000\u0122\u0121\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000"+
		"\u0000\u0124\u0127\u0005_\u0000\u0000\u0125\u0127\u0005h\u0000\u0000\u0126"+
		"\u0120\u0001\u0000\u0000\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127"+
		"\u012a\u0001\u0000\u0000\u0000\u0128\u0129\u0005W\u0000\u0000\u0129\u012b"+
		"\u0003\u0090H\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001"+
		"\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012c\u012f\u0005"+
		"R\u0000\u0000\u012d\u0130\u0003X,\u0000\u012e\u0130\u0003\u001e\u000f"+
		"\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u012e\u0001\u0000\u0000"+
		"\u0000\u0130\u001d\u0001\u0000\u0000\u0000\u0131\u0136\u0005`\u0000\u0000"+
		"\u0132\u0135\u0003X,\u0000\u0133\u0135\u0003\u0012\t\u0000\u0134\u0132"+
		"\u0001\u0000\u0000\u0000\u0134\u0133\u0001\u0000\u0000\u0000\u0135\u0138"+
		"\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137"+
		"\u0001\u0000\u0000\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u0136"+
		"\u0001\u0000\u0000\u0000\u0139\u013a\u0005a\u0000\u0000\u013a\u001f\u0001"+
		"\u0000\u0000\u0000\u013b\u013c\u0005\u0004\u0000\u0000\u013c\u0142\u0005"+
		"^\u0000\u0000\u013d\u013f\u0005`\u0000\u0000\u013e\u0140\u0003\"\u0011"+
		"\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000"+
		"\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0143\u0005a\u0000\u0000"+
		"\u0142\u013d\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000"+
		"\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0005_\u0000\u0000\u0145"+
		"\u0146\u0003@ \u0000\u0146!\u0001\u0000\u0000\u0000\u0147\u014c\u0003"+
		"$\u0012\u0000\u0148\u0149\u0005X\u0000\u0000\u0149\u014b\u0003$\u0012"+
		"\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000"+
		"\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000"+
		"\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000"+
		"\u0000\u014f\u0151\u0005X\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000"+
		"\u0150\u0151\u0001\u0000\u0000\u0000\u0151#\u0001\u0000\u0000\u0000\u0152"+
		"\u0153\u0005\u0014\u0000\u0000\u0153\u0154\u0005W\u0000\u0000\u0154\u0162"+
		"\u0003v;\u0000\u0155\u0156\u0005\u0012\u0000\u0000\u0156\u0157\u0005W"+
		"\u0000\u0000\u0157\u0162\u0003v;\u0000\u0158\u0159\u0005\u000e\u0000\u0000"+
		"\u0159\u015a\u0005W\u0000\u0000\u015a\u0162\u0003v;\u0000\u015b\u015c"+
		"\u0005\u000f\u0000\u0000\u015c\u015d\u0005W\u0000\u0000\u015d\u0162\u0003"+
		"v;\u0000\u015e\u015f\u0005\u0013\u0000\u0000\u015f\u0160\u0005W\u0000"+
		"\u0000\u0160\u0162\u0003v;\u0000\u0161\u0152\u0001\u0000\u0000\u0000\u0161"+
		"\u0155\u0001\u0000\u0000\u0000\u0161\u0158\u0001\u0000\u0000\u0000\u0161"+
		"\u015b\u0001\u0000\u0000\u0000\u0161\u015e\u0001\u0000\u0000\u0000\u0162"+
		"%\u0001\u0000\u0000\u0000\u0163\u0164\u0005\u0005\u0000\u0000\u0164\u016a"+
		"\u0005^\u0000\u0000\u0165\u0167\u0005`\u0000\u0000\u0166\u0168\u0003("+
		"\u0014\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016b\u0005a\u0000"+
		"\u0000\u016a\u0165\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016d\u0005_\u0000\u0000"+
		"\u016d\u016e\u0003@ \u0000\u016e\'\u0001\u0000\u0000\u0000\u016f\u0174"+
		"\u0003*\u0015\u0000\u0170\u0171\u0005X\u0000\u0000\u0171\u0173\u0003*"+
		"\u0015\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u0176\u0001\u0000"+
		"\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000"+
		"\u0000\u0000\u0175\u0178\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000"+
		"\u0000\u0000\u0177\u0179\u0005X\u0000\u0000\u0178\u0177\u0001\u0000\u0000"+
		"\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179)\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0005\t\u0000\u0000\u017b\u017c\u0005W\u0000\u0000\u017c"+
		"\u019f\u0005d\u0000\u0000\u017d\u017e\u0005\n\u0000\u0000\u017e\u017f"+
		"\u0005W\u0000\u0000\u017f\u019f\u0005d\u0000\u0000\u0180\u0181\u0005\u000b"+
		"\u0000\u0000\u0181\u0182\u0005W\u0000\u0000\u0182\u019f\u0003\u0094J\u0000"+
		"\u0183\u0184\u0005\f\u0000\u0000\u0184\u0185\u0005W\u0000\u0000\u0185"+
		"\u019f\u0003v;\u0000\u0186\u0187\u0005\r\u0000\u0000\u0187\u0188\u0005"+
		"W\u0000\u0000\u0188\u019f\u0003v;\u0000\u0189\u018a\u0005\u0015\u0000"+
		"\u0000\u018a\u018b\u0005W\u0000\u0000\u018b\u019f\u0005d\u0000\u0000\u018c"+
		"\u018d\u0005\u0010\u0000\u0000\u018d\u018e\u0005W\u0000\u0000\u018e\u019f"+
		"\u0003v;\u0000\u018f\u0190\u0005\u0011\u0000\u0000\u0190\u0191\u0005W"+
		"\u0000\u0000\u0191\u019f\u0003v;\u0000\u0192\u0193\u0005\u000e\u0000\u0000"+
		"\u0193\u0194\u0005W\u0000\u0000\u0194\u019f\u0003v;\u0000\u0195\u0196"+
		"\u0005\u000f\u0000\u0000\u0196\u0197\u0005W\u0000\u0000\u0197\u019f\u0003"+
		"v;\u0000\u0198\u0199\u0005\u0013\u0000\u0000\u0199\u019a\u0005W\u0000"+
		"\u0000\u019a\u019f\u0003v;\u0000\u019b\u019c\u0005\u0012\u0000\u0000\u019c"+
		"\u019d\u0005W\u0000\u0000\u019d\u019f\u0003v;\u0000\u019e\u017a\u0001"+
		"\u0000\u0000\u0000\u019e\u017d\u0001\u0000\u0000\u0000\u019e\u0180\u0001"+
		"\u0000\u0000\u0000\u019e\u0183\u0001\u0000\u0000\u0000\u019e\u0186\u0001"+
		"\u0000\u0000\u0000\u019e\u0189\u0001\u0000\u0000\u0000\u019e\u018c\u0001"+
		"\u0000\u0000\u0000\u019e\u018f\u0001\u0000\u0000\u0000\u019e\u0192\u0001"+
		"\u0000\u0000\u0000\u019e\u0195\u0001\u0000\u0000\u0000\u019e\u0198\u0001"+
		"\u0000\u0000\u0000\u019e\u019b\u0001\u0000\u0000\u0000\u019f+\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a1\u0005\u0006\u0000\u0000\u01a1\u01a7\u0005^\u0000"+
		"\u0000\u01a2\u01a4\u0005`\u0000\u0000\u01a3\u01a5\u0003.\u0017\u0000\u01a4"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0005a\u0000\u0000\u01a7\u01a2"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005_\u0000\u0000\u01aa\u01ab\u0003"+
		"@ \u0000\u01ab-\u0001\u0000\u0000\u0000\u01ac\u01b1\u00030\u0018\u0000"+
		"\u01ad\u01ae\u0005X\u0000\u0000\u01ae\u01b0\u00030\u0018\u0000\u01af\u01ad"+
		"\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1\u01af"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b5"+
		"\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b6"+
		"\u0005X\u0000\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b6/\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005\t"+
		"\u0000\u0000\u01b8\u01b9\u0005W\u0000\u0000\u01b9\u01be\u0005d\u0000\u0000"+
		"\u01ba\u01bb\u0005h\u0000\u0000\u01bb\u01bc\u0005W\u0000\u0000\u01bc\u01be"+
		"\u0003x<\u0000\u01bd\u01b7\u0001\u0000\u0000\u0000\u01bd\u01ba\u0001\u0000"+
		"\u0000\u0000\u01be1\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005[\u0000\u0000"+
		"\u01c0\u01c1\u0005h\u0000\u0000\u01c1\u01c3\u0005^\u0000\u0000\u01c2\u01c4"+
		"\u0003p8\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005_\u0000"+
		"\u0000\u01c63\u0001\u0000\u0000\u0000\u01c7\u01c8\u0005\u0007\u0000\u0000"+
		"\u01c8\u01ce\u0005^\u0000\u0000\u01c9\u01cb\u0005`\u0000\u0000\u01ca\u01cc"+
		"\u00036\u001b\u0000\u01cb\u01ca\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001"+
		"\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000\u0000\u0000\u01cd\u01cf\u0005"+
		"a\u0000\u0000\u01ce\u01c9\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005_\u0000"+
		"\u0000\u01d1\u01d2\u0003@ \u0000\u01d25\u0001\u0000\u0000\u0000\u01d3"+
		"\u01d8\u00038\u001c\u0000\u01d4\u01d5\u0005X\u0000\u0000\u01d5\u01d7\u0003"+
		"8\u001c\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01da\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000"+
		"\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000"+
		"\u0000\u0000\u01db\u01dd\u0005X\u0000\u0000\u01dc\u01db\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0001\u0000\u0000\u0000\u01dd7\u0001\u0000\u0000\u0000"+
		"\u01de\u01df\u0005h\u0000\u0000\u01df\u01e0\u0005W\u0000\u0000\u01e0\u01e1"+
		"\u0003x<\u0000\u01e19\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005\b\u0000"+
		"\u0000\u01e3\u01e9\u0005^\u0000\u0000\u01e4\u01e6\u0005`\u0000\u0000\u01e5"+
		"\u01e7\u0003<\u001e\u0000\u01e6\u01e5\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01ea"+
		"\u0005a\u0000\u0000\u01e9\u01e4\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001"+
		"\u0000\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005"+
		"_\u0000\u0000\u01ec\u01ed\u0003@ \u0000\u01ed;\u0001\u0000\u0000\u0000"+
		"\u01ee\u01f3\u0003>\u001f\u0000\u01ef\u01f0\u0005X\u0000\u0000\u01f0\u01f2"+
		"\u0003>\u001f\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f2\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f7\u0001\u0000\u0000\u0000\u01f5\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f8\u0005X\u0000\u0000\u01f7\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8=\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fa\u0005h\u0000\u0000\u01fa\u01fb\u0005W\u0000\u0000\u01fb"+
		"\u01fc\u0003x<\u0000\u01fc?\u0001\u0000\u0000\u0000\u01fd\u01ff\u0005"+
		"%\u0000\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000"+
		"\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0201\u0005\'\u0000"+
		"\u0000\u0201\u020b\u0005h\u0000\u0000\u0202\u0203\u0005)\u0000\u0000\u0203"+
		"\u0208\u0005h\u0000\u0000\u0204\u0205\u0005X\u0000\u0000\u0205\u0207\u0005"+
		"h\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0207\u020a\u0001\u0000"+
		"\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000"+
		"\u0000\u0000\u0209\u020c\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000"+
		"\u0000\u0000\u020b\u0202\u0001\u0000\u0000\u0000\u020b\u020c\u0001\u0000"+
		"\u0000\u0000\u020c\u0216\u0001\u0000\u0000\u0000\u020d\u020e\u0005*\u0000"+
		"\u0000\u020e\u0213\u0005h\u0000\u0000\u020f\u0210\u0005X\u0000\u0000\u0210"+
		"\u0212\u0005h\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0212\u0215"+
		"\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000\u0213\u0214"+
		"\u0001\u0000\u0000\u0000\u0214\u0217\u0001\u0000\u0000\u0000\u0215\u0213"+
		"\u0001\u0000\u0000\u0000\u0216\u020d\u0001\u0000\u0000\u0000\u0216\u0217"+
		"\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0219"+
		"\u0005`\u0000\u0000\u0219\u021a\u0003B!\u0000\u021a\u021b\u0005a\u0000"+
		"\u0000\u021bA\u0001\u0000\u0000\u0000\u021c\u021e\u0003D\"\u0000\u021d"+
		"\u021c\u0001\u0000\u0000\u0000\u021e\u0221\u0001\u0000\u0000\u0000\u021f"+
		"\u021d\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220"+
		"\u0223\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0222"+
		"\u0224\u0003H$\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0223\u0224\u0001"+
		"\u0000\u0000\u0000\u0224\u022b\u0001\u0000\u0000\u0000\u0225\u022a\u0003"+
		"F#\u0000\u0226\u022a\u0003X,\u0000\u0227\u022a\u0003\u0012\t\u0000\u0228"+
		"\u022a\u0003\u0016\u000b\u0000\u0229\u0225\u0001\u0000\u0000\u0000\u0229"+
		"\u0226\u0001\u0000\u0000\u0000\u0229\u0227\u0001\u0000\u0000\u0000\u0229"+
		"\u0228\u0001\u0000\u0000\u0000\u022a\u022d\u0001\u0000\u0000\u0000\u022b"+
		"\u0229\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c"+
		"C\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022e\u0230"+
		"\u00032\u0019\u0000\u022f\u022e\u0001\u0000\u0000\u0000\u0230\u0233\u0001"+
		"\u0000\u0000\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0231\u0232\u0001"+
		"\u0000\u0000\u0000\u0232\u0235\u0001\u0000\u0000\u0000\u0233\u0231\u0001"+
		"\u0000\u0000\u0000\u0234\u0236\u0003\u0092I\u0000\u0235\u0234\u0001\u0000"+
		"\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000"+
		"\u0000\u0000\u0237\u023d\u0005h\u0000\u0000\u0238\u023a\u0005Z\u0000\u0000"+
		"\u0239\u0238\u0001\u0000\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000"+
		"\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023c\u0005W\u0000\u0000\u023c"+
		"\u023e\u0003\u0090H\u0000\u023d\u0239\u0001\u0000\u0000\u0000\u023d\u023e"+
		"\u0001\u0000\u0000\u0000\u023e\u0241\u0001\u0000\u0000\u0000\u023f\u0240"+
		"\u00056\u0000\u0000\u0240\u0242\u0003\u0086C\u0000\u0241\u023f\u0001\u0000"+
		"\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000"+
		"\u0000\u0000\u0243\u0244\u0005V\u0000\u0000\u0244E\u0001\u0000\u0000\u0000"+
		"\u0245\u0247\u00032\u0019\u0000\u0246\u0245\u0001\u0000\u0000\u0000\u0247"+
		"\u024a\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0248"+
		"\u0249\u0001\u0000\u0000\u0000\u0249\u024b\u0001\u0000\u0000\u0000\u024a"+
		"\u0248\u0001\u0000\u0000\u0000\u024b\u024c\u0005h\u0000\u0000\u024c\u024e"+
		"\u0005^\u0000\u0000\u024d\u024f\u0003p8\u0000\u024e\u024d\u0001\u0000"+
		"\u0000\u0000\u024e\u024f\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000"+
		"\u0000\u0000\u0250\u0253\u0005_\u0000\u0000\u0251\u0252\u0005W\u0000\u0000"+
		"\u0252\u0254\u0003\u0090H\u0000\u0253\u0251\u0001\u0000\u0000\u0000\u0253"+
		"\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255"+
		"\u0256\u0005`\u0000\u0000\u0256\u0257\u0003\u001e\u000f\u0000\u0257\u0258"+
		"\u0005a\u0000\u0000\u0258G\u0001\u0000\u0000\u0000\u0259\u025a\u0005+"+
		"\u0000\u0000\u025a\u025c\u0005^\u0000\u0000\u025b\u025d\u0003p8\u0000"+
		"\u025c\u025b\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000"+
		"\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u025f\u0005_\u0000\u0000\u025f"+
		"\u0260\u0005`\u0000\u0000\u0260\u0261\u0003J%\u0000\u0261\u0262\u0005"+
		"a\u0000\u0000\u0262I\u0001\u0000\u0000\u0000\u0263\u0265\u0003X,\u0000"+
		"\u0264\u0263\u0001\u0000\u0000\u0000\u0265\u0268\u0001\u0000\u0000\u0000"+
		"\u0266\u0264\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000"+
		"\u0267K\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000\u0269"+
		"\u026b\u0005%\u0000\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026a\u026b"+
		"\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026d"+
		"\u0005&\u0000\u0000\u026d\u0277\u0005h\u0000\u0000\u026e\u026f\u0005)"+
		"\u0000\u0000\u026f\u0274\u0005h\u0000\u0000\u0270\u0271\u0005X\u0000\u0000"+
		"\u0271\u0273\u0005h\u0000\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0273"+
		"\u0276\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274"+
		"\u0275\u0001\u0000\u0000\u0000\u0275\u0278\u0001\u0000\u0000\u0000\u0276"+
		"\u0274\u0001\u0000\u0000\u0000\u0277\u026e\u0001\u0000\u0000\u0000\u0277"+
		"\u0278\u0001\u0000\u0000\u0000\u0278\u0279\u0001\u0000\u0000\u0000\u0279"+
		"\u027a\u0005`\u0000\u0000\u027a\u027b\u0003N\'\u0000\u027b\u027c\u0005"+
		"a\u0000\u0000\u027cM\u0001\u0000\u0000\u0000\u027d\u027f\u0003P(\u0000"+
		"\u027e\u027d\u0001\u0000\u0000\u0000\u027f\u0282\u0001\u0000\u0000\u0000"+
		"\u0280\u027e\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000"+
		"\u0281O\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0283"+
		"\u0285\u0005h\u0000\u0000\u0284\u0286\u0005Z\u0000\u0000\u0285\u0284\u0001"+
		"\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0287\u0001"+
		"\u0000\u0000\u0000\u0287\u0288\u0005W\u0000\u0000\u0288\u0289\u0003\u0090"+
		"H\u0000\u0289\u028a\u0005V\u0000\u0000\u028aQ\u0001\u0000\u0000\u0000"+
		"\u028b\u028d\u0005%\u0000\u0000\u028c\u028b\u0001\u0000\u0000\u0000\u028c"+
		"\u028d\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e"+
		"\u028f\u0005(\u0000\u0000\u028f\u0290\u0005h\u0000\u0000\u0290\u0291\u0005"+
		"`\u0000\u0000\u0291\u0292\u0003T*\u0000\u0292\u0293\u0005a\u0000\u0000"+
		"\u0293S\u0001\u0000\u0000\u0000\u0294\u0299\u0003V+\u0000\u0295\u0296"+
		"\u0005X\u0000\u0000\u0296\u0298\u0003V+\u0000\u0297\u0295\u0001\u0000"+
		"\u0000\u0000\u0298\u029b\u0001\u0000\u0000\u0000\u0299\u0297\u0001\u0000"+
		"\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029d\u0001\u0000"+
		"\u0000\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029c\u029e\u0005X\u0000"+
		"\u0000\u029d\u029c\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000"+
		"\u0000\u029eU\u0001\u0000\u0000\u0000\u029f\u02a2\u0005h\u0000\u0000\u02a0"+
		"\u02a1\u00056\u0000\u0000\u02a1\u02a3\u0003x<\u0000\u02a2\u02a0\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3W\u0001\u0000"+
		"\u0000\u0000\u02a4\u02ad\u0003Z-\u0000\u02a5\u02ad\u0003\\.\u0000\u02a6"+
		"\u02ad\u0003^/\u0000\u02a7\u02ad\u0003`0\u0000\u02a8\u02ad\u0003b1\u0000"+
		"\u02a9\u02ad\u0003n7\u0000\u02aa\u02ad\u0003l6\u0000\u02ab\u02ad\u0003"+
		"\u008cF\u0000\u02ac\u02a4\u0001\u0000\u0000\u0000\u02ac\u02a5\u0001\u0000"+
		"\u0000\u0000\u02ac\u02a6\u0001\u0000\u0000\u0000\u02ac\u02a7\u0001\u0000"+
		"\u0000\u0000\u02ac\u02a8\u0001\u0000\u0000\u0000\u02ac\u02a9\u0001\u0000"+
		"\u0000\u0000\u02ac\u02aa\u0001\u0000\u0000\u0000\u02ac\u02ab\u0001\u0000"+
		"\u0000\u0000\u02adY\u0001\u0000\u0000\u0000\u02ae\u02af\u0003\u0082A\u0000"+
		"\u02af\u02b0\u00056\u0000\u0000\u02b0\u02b1\u0003\u0086C\u0000\u02b1["+
		"\u0001\u0000\u0000\u0000\u02b2\u02b3\u0005\"\u0000\u0000\u02b3\u02b4\u0005"+
		"Y\u0000\u0000\u02b4\u02b5\u0005#\u0000\u0000\u02b5\u02b7\u0005^\u0000"+
		"\u0000\u02b6\u02b8\u0003p8\u0000\u02b7\u02b6\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b8\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000\u0000\u02b9"+
		"\u02ba\u0005_\u0000\u0000\u02ba\u02bb\u0005V\u0000\u0000\u02bb]\u0001"+
		"\u0000\u0000\u0000\u02bc\u02bf\u0005 \u0000\u0000\u02bd\u02c0\u0003\u008c"+
		"F\u0000\u02be\u02c0\u0003x<\u0000\u02bf\u02bd\u0001\u0000\u0000\u0000"+
		"\u02bf\u02be\u0001\u0000\u0000\u0000\u02c0_\u0001\u0000\u0000\u0000\u02c1"+
		"\u02c4\u0005!\u0000\u0000\u02c2\u02c5\u0003\u008cF\u0000\u02c3\u02c5\u0003"+
		"x<\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c4\u02c3\u0001\u0000\u0000"+
		"\u0000\u02c5a\u0001\u0000\u0000\u0000\u02c6\u02ca\u0003d2\u0000\u02c7"+
		"\u02c9\u0003f3\u0000\u02c8\u02c7\u0001\u0000\u0000\u0000\u02c9\u02cc\u0001"+
		"\u0000\u0000\u0000\u02ca\u02c8\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001"+
		"\u0000\u0000\u0000\u02cb\u02ce\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001"+
		"\u0000\u0000\u0000\u02cd\u02cf\u0003h4\u0000\u02ce\u02cd\u0001\u0000\u0000"+
		"\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cfc\u0001\u0000\u0000\u0000"+
		"\u02d0\u02d1\u0005\u001e\u0000\u0000\u02d1\u02d2\u0005^\u0000\u0000\u02d2"+
		"\u02d3\u0003\u008cF\u0000\u02d3\u02d4\u0005_\u0000\u0000\u02d4\u02d5\u0003"+
		"j5\u0000\u02d5e\u0001\u0000\u0000\u0000\u02d6\u02d7\u0005\u001f\u0000"+
		"\u0000\u02d7\u02d8\u0005\u001e\u0000\u0000\u02d8\u02d9\u0005^\u0000\u0000"+
		"\u02d9\u02da\u0003\u008cF\u0000\u02da\u02db\u0005_\u0000\u0000\u02db\u02dc"+
		"\u0003j5\u0000\u02dcg\u0001\u0000\u0000\u0000\u02dd\u02de\u0005\u001f"+
		"\u0000\u0000\u02de\u02df\u0003j5\u0000\u02dfi\u0001\u0000\u0000\u0000"+
		"\u02e0\u02e3\u0003X,\u0000\u02e1\u02e3\u0003\u001e\u000f\u0000\u02e2\u02e0"+
		"\u0001\u0000\u0000\u0000\u02e2\u02e1\u0001\u0000\u0000\u0000\u02e3k\u0001"+
		"\u0000\u0000\u0000\u02e4\u02e6\u0005h\u0000\u0000\u02e5\u02e7\u0003\u008e"+
		"G\u0000\u02e6\u02e5\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000"+
		"\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u02ea\u0005^\u0000\u0000"+
		"\u02e9\u02eb\u0003p8\u0000\u02ea\u02e9\u0001\u0000\u0000\u0000\u02ea\u02eb"+
		"\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000\u0000\u02ec\u02ed"+
		"\u0005_\u0000\u0000\u02edm\u0001\u0000\u0000\u0000\u02ee\u02ef\u0003\u000e"+
		"\u0007\u0000\u02ef\u02f1\u0005^\u0000\u0000\u02f0\u02f2\u0003p8\u0000"+
		"\u02f1\u02f0\u0001\u0000\u0000\u0000\u02f1\u02f2\u0001\u0000\u0000\u0000"+
		"\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02fa\u0005_\u0000\u0000\u02f4"+
		"\u02f5\u0005Y\u0000\u0000\u02f5\u02f6\u0005$\u0000\u0000\u02f6\u02f7\u0005"+
		"^\u0000\u0000\u02f7\u02f8\u0003\u001c\u000e\u0000\u02f8\u02f9\u0005_\u0000"+
		"\u0000\u02f9\u02fb\u0001\u0000\u0000\u0000\u02fa\u02f4\u0001\u0000\u0000"+
		"\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fbo\u0001\u0000\u0000\u0000"+
		"\u02fc\u0301\u0003r9\u0000\u02fd\u02fe\u0005X\u0000\u0000\u02fe\u0300"+
		"\u0003r9\u0000\u02ff\u02fd\u0001\u0000\u0000\u0000\u0300\u0303\u0001\u0000"+
		"\u0000\u0000\u0301\u02ff\u0001\u0000\u0000\u0000\u0301\u0302\u0001\u0000"+
		"\u0000\u0000\u0302q\u0001\u0000\u0000\u0000\u0303\u0301\u0001\u0000\u0000"+
		"\u0000\u0304\u0309\u0003t:\u0000\u0305\u0309\u0003x<\u0000\u0306\u0309"+
		"\u0003\u001c\u000e\u0000\u0307\u0309\u0003\u008cF\u0000\u0308\u0304\u0001"+
		"\u0000\u0000\u0000\u0308\u0305\u0001\u0000\u0000\u0000\u0308\u0306\u0001"+
		"\u0000\u0000\u0000\u0308\u0307\u0001\u0000\u0000\u0000\u0309s\u0001\u0000"+
		"\u0000\u0000\u030a\u030c\u00032\u0019\u0000\u030b\u030a\u0001\u0000\u0000"+
		"\u0000\u030c\u030f\u0001\u0000\u0000\u0000\u030d\u030b\u0001\u0000\u0000"+
		"\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u0311\u0001\u0000\u0000"+
		"\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u0310\u0312\u0003\u0092I\u0000"+
		"\u0311\u0310\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000"+
		"\u0312\u0313\u0001\u0000\u0000\u0000\u0313\u0316\u0005h\u0000\u0000\u0314"+
		"\u0315\u0005W\u0000\u0000\u0315\u0317\u0003\u0090H\u0000\u0316\u0314\u0001"+
		"\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000\u0317\u031a\u0001"+
		"\u0000\u0000\u0000\u0318\u0319\u00056\u0000\u0000\u0319\u031b\u0003\u0086"+
		"C\u0000\u031a\u0318\u0001\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000"+
		"\u0000\u031bu\u0001\u0000\u0000\u0000\u031c\u0325\u0005b\u0000\u0000\u031d"+
		"\u0322\u0003x<\u0000\u031e\u031f\u0005X\u0000\u0000\u031f\u0321\u0003"+
		"x<\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0321\u0324\u0001\u0000\u0000"+
		"\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000"+
		"\u0000\u0323\u0326\u0001\u0000\u0000\u0000\u0324\u0322\u0001\u0000\u0000"+
		"\u0000\u0325\u031d\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000\u0000"+
		"\u0000\u0326\u0328\u0001\u0000\u0000\u0000\u0327\u0329\u0005X\u0000\u0000"+
		"\u0328\u0327\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000\u0000\u0000"+
		"\u0329\u032a\u0001\u0000\u0000\u0000\u032a\u032b\u0005c\u0000\u0000\u032b"+
		"w\u0001\u0000\u0000\u0000\u032c\u0333\u0003\u0088D\u0000\u032d\u0333\u0003"+
		"v;\u0000\u032e\u0333\u0003\u0084B\u0000\u032f\u0333\u0003\u0082A\u0000"+
		"\u0330\u0333\u0003z=\u0000\u0331\u0333\u0003\u0080@\u0000\u0332\u032c"+
		"\u0001\u0000\u0000\u0000\u0332\u032d\u0001\u0000\u0000\u0000\u0332\u032e"+
		"\u0001\u0000\u0000\u0000\u0332\u032f\u0001\u0000\u0000\u0000\u0332\u0330"+
		"\u0001\u0000\u0000\u0000\u0332\u0331\u0001\u0000\u0000\u0000\u0333y\u0001"+
		"\u0000\u0000\u0000\u0334\u0336\u0005`\u0000\u0000\u0335\u0337\u0003|>"+
		"\u0000\u0336\u0335\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000\u0000"+
		"\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338\u0339\u0005a\u0000\u0000"+
		"\u0339{\u0001\u0000\u0000\u0000\u033a\u033f\u0003~?\u0000\u033b\u033c"+
		"\u0005X\u0000\u0000\u033c\u033e\u0003~?\u0000\u033d\u033b\u0001\u0000"+
		"\u0000\u0000\u033e\u0341\u0001\u0000\u0000\u0000\u033f\u033d\u0001\u0000"+
		"\u0000\u0000\u033f\u0340\u0001\u0000\u0000\u0000\u0340\u0343\u0001\u0000"+
		"\u0000\u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0342\u0344\u0005X\u0000"+
		"\u0000\u0343\u0342\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000"+
		"\u0000\u0344}\u0001\u0000\u0000\u0000\u0345\u0346\u0005h\u0000\u0000\u0346"+
		"\u0347\u0005W\u0000\u0000\u0347\u0348\u0003\u008cF\u0000\u0348\u007f\u0001"+
		"\u0000\u0000\u0000\u0349\u034a\u0005-\u0000\u0000\u034a\u034c\u0005h\u0000"+
		"\u0000\u034b\u034d\u0003\u008eG\u0000\u034c\u034b\u0001\u0000\u0000\u0000"+
		"\u034c\u034d\u0001\u0000\u0000\u0000\u034d\u034e\u0001\u0000\u0000\u0000"+
		"\u034e\u0350\u0005^\u0000\u0000\u034f\u0351\u0003p8\u0000\u0350\u034f"+
		"\u0001\u0000\u0000\u0000\u0350\u0351\u0001\u0000\u0000\u0000\u0351\u0352"+
		"\u0001\u0000\u0000\u0000\u0352\u0353\u0005_\u0000\u0000\u0353\u0081\u0001"+
		"\u0000\u0000\u0000\u0354\u0356\u0005h\u0000\u0000\u0355\u0357\u0003\u008c"+
		"F\u0000\u0356\u0355\u0001\u0000\u0000\u0000\u0356\u0357\u0001\u0000\u0000"+
		"\u0000\u0357\u035b\u0001\u0000\u0000\u0000\u0358\u0359\u0005,\u0000\u0000"+
		"\u0359\u035b\u0003\u008cF\u0000\u035a\u0354\u0001\u0000\u0000\u0000\u035a"+
		"\u0358\u0001\u0000\u0000\u0000\u035b\u0083\u0001\u0000\u0000\u0000\u035c"+
		"\u035d\u0005h\u0000\u0000\u035d\u035e\u0005b\u0000\u0000\u035e\u035f\u0003"+
		"\u008cF\u0000\u035f\u0360\u0005c\u0000\u0000\u0360\u0085\u0001\u0000\u0000"+
		"\u0000\u0361\u0365\u0003x<\u0000\u0362\u0365\u0003\u008cF\u0000\u0363"+
		"\u0365\u0003\u0016\u000b\u0000\u0364\u0361\u0001\u0000\u0000\u0000\u0364"+
		"\u0362\u0001\u0000\u0000\u0000\u0364\u0363\u0001\u0000\u0000\u0000\u0365"+
		"\u0087\u0001\u0000\u0000\u0000\u0366\u0369\u0003\u008aE\u0000\u0367\u0369"+
		"\u0005h\u0000\u0000\u0368\u0366\u0001\u0000\u0000\u0000\u0368\u0367\u0001"+
		"\u0000\u0000\u0000\u0369\u0089\u0001\u0000\u0000\u0000\u036a\u036b\u0007"+
		"\u0002\u0000\u0000\u036b\u008b\u0001\u0000\u0000\u0000\u036c\u036d\u0006"+
		"F\uffff\uffff\u0000\u036d\u037b\u0003l6\u0000\u036e\u036f\u0005T\u0000"+
		"\u0000\u036f\u037b\u0003\u008cF\u000e\u0370\u0371\u0005U\u0000\u0000\u0371"+
		"\u037b\u0003\u008cF\r\u0372\u0373\u00057\u0000\u0000\u0373\u037b\u0003"+
		"\u008cF\f\u0374\u0375\u0005^\u0000\u0000\u0375\u0376\u0003\u008cF\u0000"+
		"\u0376\u0377\u0005_\u0000\u0000\u0377\u037b\u0001\u0000\u0000\u0000\u0378"+
		"\u037b\u0003\u0088D\u0000\u0379\u037b\u0003\u0084B\u0000\u037a\u036c\u0001"+
		"\u0000\u0000\u0000\u037a\u036e\u0001\u0000\u0000\u0000\u037a\u0370\u0001"+
		"\u0000\u0000\u0000\u037a\u0372\u0001\u0000\u0000\u0000\u037a\u0374\u0001"+
		"\u0000\u0000\u0000\u037a\u0378\u0001\u0000\u0000\u0000\u037a\u0379\u0001"+
		"\u0000\u0000\u0000\u037b\u039d\u0001\u0000\u0000\u0000\u037c\u037d\n\u000b"+
		"\u0000\u0000\u037d\u037e\u0005Y\u0000\u0000\u037e\u039c\u0003\u008cF\f"+
		"\u037f\u0380\n\n\u0000\u0000\u0380\u0381\u0007\u0003\u0000\u0000\u0381"+
		"\u039c\u0003\u008cF\u000b\u0382\u0383\n\t\u0000\u0000\u0383\u0384\u0007"+
		"\u0004\u0000\u0000\u0384\u039c\u0003\u008cF\n\u0385\u0386\n\b\u0000\u0000"+
		"\u0386\u0387\u0007\u0005\u0000\u0000\u0387\u039c\u0003\u008cF\t\u0388"+
		"\u0389\n\u0007\u0000\u0000\u0389\u038a\u0007\u0006\u0000\u0000\u038a\u039c"+
		"\u0003\u008cF\b\u038b\u038c\n\u0006\u0000\u0000\u038c\u038d\u0005A\u0000"+
		"\u0000\u038d\u039c\u0003\u008cF\u0007\u038e\u038f\n\u0005\u0000\u0000"+
		"\u038f\u0390\u0005B\u0000\u0000\u0390\u039c\u0003\u008cF\u0006\u0391\u0392"+
		"\n\u0004\u0000\u0000\u0392\u0393\u0005Z\u0000\u0000\u0393\u0394\u0003"+
		"\u008cF\u0000\u0394\u0395\u0005W\u0000\u0000\u0395\u0396\u0003\u008cF"+
		"\u0005\u0396\u039c\u0001\u0000\u0000\u0000\u0397\u0398\n\u0010\u0000\u0000"+
		"\u0398\u039c\u0005T\u0000\u0000\u0399\u039a\n\u000f\u0000\u0000\u039a"+
		"\u039c\u0005U\u0000\u0000\u039b\u037c\u0001\u0000\u0000\u0000\u039b\u037f"+
		"\u0001\u0000\u0000\u0000\u039b\u0382\u0001\u0000\u0000\u0000\u039b\u0385"+
		"\u0001\u0000\u0000\u0000\u039b\u0388\u0001\u0000\u0000\u0000\u039b\u038b"+
		"\u0001\u0000\u0000\u0000\u039b\u038e\u0001\u0000\u0000\u0000\u039b\u0391"+
		"\u0001\u0000\u0000\u0000\u039b\u0397\u0001\u0000\u0000\u0000\u039b\u0399"+
		"\u0001\u0000\u0000\u0000\u039c\u039f\u0001\u0000\u0000\u0000\u039d\u039b"+
		"\u0001\u0000\u0000\u0000\u039d\u039e\u0001\u0000\u0000\u0000\u039e\u008d"+
		"\u0001\u0000\u0000\u0000\u039f\u039d\u0001\u0000\u0000\u0000\u03a0\u03a1"+
		"\u00054\u0000\u0000\u03a1\u03a6\u0003\u0090H\u0000\u03a2\u03a3\u0005X"+
		"\u0000\u0000\u03a3\u03a5\u0003\u0090H\u0000\u03a4\u03a2\u0001\u0000\u0000"+
		"\u0000\u03a5\u03a8\u0001\u0000\u0000\u0000\u03a6\u03a4\u0001\u0000\u0000"+
		"\u0000\u03a6\u03a7\u0001\u0000\u0000\u0000\u03a7\u03a9\u0001\u0000\u0000"+
		"\u0000\u03a8\u03a6\u0001\u0000\u0000\u0000\u03a9\u03aa\u00052\u0000\u0000"+
		"\u03aa\u008f\u0001\u0000\u0000\u0000\u03ab\u03ac\u0005h\u0000\u0000\u03ac"+
		"\u03ba\u0003\u008eG\u0000\u03ad\u03b2\u0007\u0007\u0000\u0000\u03ae\u03af"+
		"\u0005E\u0000\u0000\u03af\u03b1\u0007\u0007\u0000\u0000\u03b0\u03ae\u0001"+
		"\u0000\u0000\u0000\u03b1\u03b4\u0001\u0000\u0000\u0000\u03b2\u03b0\u0001"+
		"\u0000\u0000\u0000\u03b2\u03b3\u0001\u0000\u0000\u0000\u03b3\u03ba\u0001"+
		"\u0000\u0000\u0000\u03b4\u03b2\u0001\u0000\u0000\u0000\u03b5\u03b6\u0007"+
		"\u0007\u0000\u0000\u03b6\u03b7\u0005b\u0000\u0000\u03b7\u03ba\u0005c\u0000"+
		"\u0000\u03b8\u03ba\u0003v;\u0000\u03b9\u03ab\u0001\u0000\u0000\u0000\u03b9"+
		"\u03ad\u0001\u0000\u0000\u0000\u03b9\u03b5\u0001\u0000\u0000\u0000\u03b9"+
		"\u03b8\u0001\u0000\u0000\u0000\u03ba\u0091\u0001\u0000\u0000\u0000\u03bb"+
		"\u03bc\u0007\b\u0000\u0000\u03bc\u0093\u0001\u0000\u0000\u0000\u03bd\u03c1"+
		"\u0005i\u0000\u0000\u03be\u03c0\u0003\u0096K\u0000\u03bf\u03be\u0001\u0000"+
		"\u0000\u0000\u03c0\u03c3\u0001\u0000\u0000\u0000\u03c1\u03bf\u0001\u0000"+
		"\u0000\u0000\u03c1\u03c2\u0001\u0000\u0000\u0000\u03c2\u03c4\u0001\u0000"+
		"\u0000\u0000\u03c3\u03c1\u0001\u0000\u0000\u0000\u03c4\u03c5\u0005|\u0000"+
		"\u0000\u03c5\u0095\u0001\u0000\u0000\u0000\u03c6\u03ca\u0003\u0098L\u0000"+
		"\u03c7\u03c9\u0003\u009eO\u0000\u03c8\u03c7\u0001\u0000\u0000\u0000\u03c9"+
		"\u03cc\u0001\u0000\u0000\u0000\u03ca\u03c8\u0001\u0000\u0000\u0000\u03ca"+
		"\u03cb\u0001\u0000\u0000\u0000\u03cb\u03cd\u0001\u0000\u0000\u0000\u03cc"+
		"\u03ca\u0001\u0000\u0000\u0000\u03cd\u03ce\u0003\u009aM\u0000\u03ce\u03d2"+
		"\u0001\u0000\u0000\u0000\u03cf\u03d2\u0003\u009cN\u0000\u03d0\u03d2\u0003"+
		"\u00a2Q\u0000\u03d1\u03c6\u0001\u0000\u0000\u0000\u03d1\u03cf\u0001\u0000"+
		"\u0000\u0000\u03d1\u03d0\u0001\u0000\u0000\u0000\u03d2\u0097\u0001\u0000"+
		"\u0000\u0000\u03d3\u03d4\u0005j\u0000\u0000\u03d4\u03d8\u0003\u00a4R\u0000"+
		"\u03d5\u03d7\u0003\u00a0P\u0000\u03d6\u03d5\u0001\u0000\u0000\u0000\u03d7"+
		"\u03da\u0001\u0000\u0000\u0000\u03d8\u03d6\u0001\u0000\u0000\u0000\u03d8"+
		"\u03d9\u0001\u0000\u0000\u0000\u03d9\u03db\u0001\u0000\u0000\u0000\u03da"+
		"\u03d8\u0001\u0000\u0000\u0000\u03db\u03dc\u0005k\u0000\u0000\u03dc\u0099"+
		"\u0001\u0000\u0000\u0000\u03dd\u03de\u0005j\u0000\u0000\u03de\u03df\u0005"+
		"l\u0000\u0000\u03df\u03e0\u0003\u00a4R\u0000\u03e0\u03e1\u0005k\u0000"+
		"\u0000\u03e1\u009b\u0001\u0000\u0000\u0000\u03e2\u03e3\u0005j\u0000\u0000"+
		"\u03e3\u03e7\u0003\u00a4R\u0000\u03e4\u03e6\u0003\u00a0P\u0000\u03e5\u03e4"+
		"\u0001\u0000\u0000\u0000\u03e6\u03e9\u0001\u0000\u0000\u0000\u03e7\u03e5"+
		"\u0001\u0000\u0000\u0000\u03e7\u03e8\u0001\u0000\u0000\u0000\u03e8\u03ea"+
		"\u0001\u0000\u0000\u0000\u03e9\u03e7\u0001\u0000\u0000\u0000\u03ea\u03eb"+
		"\u0005l\u0000\u0000\u03eb\u03ec\u0005k\u0000\u0000\u03ec\u009d\u0001\u0000"+
		"\u0000\u0000\u03ed\u03f0\u0003\u0096K\u0000\u03ee\u03f0\u0005y\u0000\u0000"+
		"\u03ef\u03ed\u0001\u0000\u0000\u0000\u03ef\u03ee\u0001\u0000\u0000\u0000"+
		"\u03f0\u009f\u0001\u0000\u0000\u0000\u03f1\u03f2\u0005y\u0000\u0000\u03f2"+
		"\u03f3\u0005m\u0000\u0000\u03f3\u0408\u0005n\u0000\u0000\u03f4\u03f5\u0005"+
		"q\u0000\u0000\u03f5\u03f6\u0005m\u0000\u0000\u03f6\u0408\u0005n\u0000"+
		"\u0000\u03f7\u03f8\u0005r\u0000\u0000\u03f8\u03f9\u0005m\u0000\u0000\u03f9"+
		"\u0408\u0005n\u0000\u0000\u03fa\u03fb\u0005s\u0000\u0000\u03fb\u03fc\u0005"+
		"m\u0000\u0000\u03fc\u0408\u0005n\u0000\u0000\u03fd\u03fe\u0003\u00a6S"+
		"\u0000\u03fe\u03ff\u0005m\u0000\u0000\u03ff\u0400\u0005n\u0000\u0000\u0400"+
		"\u0408\u0001\u0000\u0000\u0000\u0401\u0404\u0005x\u0000\u0000\u0402\u0403"+
		"\u0005m\u0000\u0000\u0403\u0405\u0005n\u0000\u0000\u0404\u0402\u0001\u0000"+
		"\u0000\u0000\u0404\u0405\u0001\u0000\u0000\u0000\u0405\u0408\u0001\u0000"+
		"\u0000\u0000\u0406\u0408\u0005y\u0000\u0000\u0407\u03f1\u0001\u0000\u0000"+
		"\u0000\u0407\u03f4\u0001\u0000\u0000\u0000\u0407\u03f7\u0001\u0000\u0000"+
		"\u0000\u0407\u03fa\u0001\u0000\u0000\u0000\u0407\u03fd\u0001\u0000\u0000"+
		"\u0000\u0407\u0401\u0001\u0000\u0000\u0000\u0407\u0406\u0001\u0000\u0000"+
		"\u0000\u0408\u00a1\u0001\u0000\u0000\u0000\u0409\u0412\u0005o\u0000\u0000"+
		"\u040a\u040f\u0005y\u0000\u0000\u040b\u040c\u0005w\u0000\u0000\u040c\u040e"+
		"\u0005y\u0000\u0000\u040d\u040b\u0001\u0000\u0000\u0000\u040e\u0411\u0001"+
		"\u0000\u0000\u0000\u040f\u040d\u0001\u0000\u0000\u0000\u040f\u0410\u0001"+
		"\u0000\u0000\u0000\u0410\u0413\u0001\u0000\u0000\u0000\u0411\u040f\u0001"+
		"\u0000\u0000\u0000\u0412\u040a\u0001\u0000\u0000\u0000\u0412\u0413\u0001"+
		"\u0000\u0000\u0000\u0413\u0414\u0001\u0000\u0000\u0000\u0414\u0415\u0005"+
		"p\u0000\u0000\u0415\u00a3\u0001\u0000\u0000\u0000\u0416\u0417\u0005y\u0000"+
		"\u0000\u0417\u00a5\u0001\u0000\u0000\u0000\u0418\u0419\u0007\t\u0000\u0000"+
		"\u0419\u00a7\u0001\u0000\u0000\u0000y\u00ab\u00b0\u00b2\u00be\u00cb\u00d4"+
		"\u00d8\u00da\u00e0\u00ee\u00f4\u00f8\u0101\u0107\u010c\u0115\u011a\u0122"+
		"\u0126\u012a\u012f\u0134\u0136\u013f\u0142\u014c\u0150\u0161\u0167\u016a"+
		"\u0174\u0178\u019e\u01a4\u01a7\u01b1\u01b5\u01bd\u01c3\u01cb\u01ce\u01d8"+
		"\u01dc\u01e6\u01e9\u01f3\u01f7\u01fe\u0208\u020b\u0213\u0216\u021f\u0223"+
		"\u0229\u022b\u0231\u0235\u0239\u023d\u0241\u0248\u024e\u0253\u025c\u0266"+
		"\u026a\u0274\u0277\u0280\u0285\u028c\u0299\u029d\u02a2\u02ac\u02b7\u02bf"+
		"\u02c4\u02ca\u02ce\u02e2\u02e6\u02ea\u02f1\u02fa\u0301\u0308\u030d\u0311"+
		"\u0316\u031a\u0322\u0325\u0328\u0332\u0336\u033f\u0343\u034c\u0350\u0356"+
		"\u035a\u0364\u0368\u037a\u039b\u039d\u03a6\u03b2\u03b9\u03c1\u03ca\u03d1"+
		"\u03d8\u03e7\u03ef\u0404\u0407\u040f\u0412";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}