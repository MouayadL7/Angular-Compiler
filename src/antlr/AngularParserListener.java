// Generated from java-escape by ANTLR 4.11.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AngularParser}.
 */
public interface AngularParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AngularParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DefaultSpecifierDeclaration}
	 * labeled alternative in {@link AngularParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDefaultSpecifierDeclaration(AngularParser.DefaultSpecifierDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DefaultSpecifierDeclaration}
	 * labeled alternative in {@link AngularParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDefaultSpecifierDeclaration(AngularParser.DefaultSpecifierDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamespaceSpecifierDeclaration}
	 * labeled alternative in {@link AngularParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNamespaceSpecifierDeclaration(AngularParser.NamespaceSpecifierDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamespaceSpecifierDeclaration}
	 * labeled alternative in {@link AngularParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNamespaceSpecifierDeclaration(AngularParser.NamespaceSpecifierDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NamedSpecifierDeclaration}
	 * labeled alternative in {@link AngularParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNamedSpecifierDeclaration(AngularParser.NamedSpecifierDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NamedSpecifierDeclaration}
	 * labeled alternative in {@link AngularParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNamedSpecifierDeclaration(AngularParser.NamedSpecifierDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importDefaultSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportDefaultSpecifier(AngularParser.ImportDefaultSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importDefaultSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportDefaultSpecifier(AngularParser.ImportDefaultSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importNamespaceSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportNamespaceSpecifier(AngularParser.ImportNamespaceSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importNamespaceSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportNamespaceSpecifier(AngularParser.ImportNamespaceSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#importNamedSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterImportNamedSpecifier(AngularParser.ImportNamedSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#importNamedSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitImportNamedSpecifier(AngularParser.ImportNamedSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierImportSpecifier}
	 * labeled alternative in {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierImportSpecifier(AngularParser.IdentifierImportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierImportSpecifier}
	 * labeled alternative in {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierImportSpecifier(AngularParser.IdentifierImportSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BootstrapImportSpecifier}
	 * labeled alternative in {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBootstrapImportSpecifier(AngularParser.BootstrapImportSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BootstrapImportSpecifier}
	 * labeled alternative in {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBootstrapImportSpecifier(AngularParser.BootstrapImportSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#bootstrapSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBootstrapSpecifier(AngularParser.BootstrapSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#bootstrapSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBootstrapSpecifier(AngularParser.BootstrapSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NgModuleDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterNgModuleDecl(AngularParser.NgModuleDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NgModuleDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitNgModuleDecl(AngularParser.NgModuleDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ComponentDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDecl(AngularParser.ComponentDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ComponentDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDecl(AngularParser.ComponentDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PipeDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterPipeDecl(AngularParser.PipeDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PipeDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitPipeDecl(AngularParser.PipeDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InjectableDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterInjectableDecl(AngularParser.InjectableDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InjectableDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitInjectableDecl(AngularParser.InjectableDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DirectiveDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveDecl(AngularParser.DirectiveDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DirectiveDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveDecl(AngularParser.DirectiveDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterfaceDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDecl(AngularParser.InterfaceDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterfaceDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDecl(AngularParser.InterfaceDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(AngularParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(AngularParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EnumDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDecl(AngularParser.EnumDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EnumDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDecl(AngularParser.EnumDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDecl(AngularParser.VariableDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDecl(AngularParser.VariableDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(AngularParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(AngularParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#varHelper}.
	 * @param ctx the parse tree
	 */
	void enterVarHelper(AngularParser.VarHelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#varHelper}.
	 * @param ctx the parse tree
	 */
	void exitVarHelper(AngularParser.VarHelperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalFunctionDeclaration}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalFunctionDeclaration(AngularParser.NormalFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalFunctionDeclaration}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalFunctionDeclaration(AngularParser.NormalFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AnonymousFunctionDeclaration}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunctionDeclaration(AngularParser.AnonymousFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AnonymousFunctionDeclaration}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunctionDeclaration(AngularParser.AnonymousFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrowFunctionDeclaration}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunctionDeclaration(AngularParser.ArrowFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrowFunctionDeclaration}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunctionDeclaration(AngularParser.ArrowFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#normalFunction}.
	 * @param ctx the parse tree
	 */
	void enterNormalFunction(AngularParser.NormalFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#normalFunction}.
	 * @param ctx the parse tree
	 */
	void exitNormalFunction(AngularParser.NormalFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousFunction(AngularParser.AnonymousFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#anonymousFunction}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousFunction(AngularParser.AnonymousFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void enterArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 */
	void exitArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AngularParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AngularParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ngModuleDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNgModuleDeclaration(AngularParser.NgModuleDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ngModuleDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNgModuleDeclaration(AngularParser.NgModuleDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#moduleMetadata}.
	 * @param ctx the parse tree
	 */
	void enterModuleMetadata(AngularParser.ModuleMetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#moduleMetadata}.
	 * @param ctx the parse tree
	 */
	void exitModuleMetadata(AngularParser.ModuleMetadataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BootstrapProperty}
	 * labeled alternative in {@link AngularParser#metadataModuleProperty}.
	 * @param ctx the parse tree
	 */
	void enterBootstrapProperty(AngularParser.BootstrapPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BootstrapProperty}
	 * labeled alternative in {@link AngularParser#metadataModuleProperty}.
	 * @param ctx the parse tree
	 */
	void exitBootstrapProperty(AngularParser.BootstrapPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationsModuleProperty}
	 * labeled alternative in {@link AngularParser#metadataModuleProperty}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationsModuleProperty(AngularParser.DeclarationsModulePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationsModuleProperty}
	 * labeled alternative in {@link AngularParser#metadataModuleProperty}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationsModuleProperty(AngularParser.DeclarationsModulePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportsModuleProperty}
	 * labeled alternative in {@link AngularParser#metadataModuleProperty}.
	 * @param ctx the parse tree
	 */
	void enterImportsModuleProperty(AngularParser.ImportsModulePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportsModuleProperty}
	 * labeled alternative in {@link AngularParser#metadataModuleProperty}.
	 * @param ctx the parse tree
	 */
	void exitImportsModuleProperty(AngularParser.ImportsModulePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportsModuleProperty}
	 * labeled alternative in {@link AngularParser#metadataModuleProperty}.
	 * @param ctx the parse tree
	 */
	void enterExportsModuleProperty(AngularParser.ExportsModulePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportsModuleProperty}
	 * labeled alternative in {@link AngularParser#metadataModuleProperty}.
	 * @param ctx the parse tree
	 */
	void exitExportsModuleProperty(AngularParser.ExportsModulePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProvidersModuleProperty}
	 * labeled alternative in {@link AngularParser#metadataModuleProperty}.
	 * @param ctx the parse tree
	 */
	void enterProvidersModuleProperty(AngularParser.ProvidersModulePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProvidersModuleProperty}
	 * labeled alternative in {@link AngularParser#metadataModuleProperty}.
	 * @param ctx the parse tree
	 */
	void exitProvidersModuleProperty(AngularParser.ProvidersModulePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#componentMetadata}.
	 * @param ctx the parse tree
	 */
	void enterComponentMetadata(AngularParser.ComponentMetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#componentMetadata}.
	 * @param ctx the parse tree
	 */
	void exitComponentMetadata(AngularParser.ComponentMetadataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorComponentProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void enterSelectorComponentProperty(AngularParser.SelectorComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorComponentProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void exitSelectorComponentProperty(AngularParser.SelectorComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateUrlProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateUrlProperty(AngularParser.TemplateUrlPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateUrlProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateUrlProperty(AngularParser.TemplateUrlPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void enterTemplateProperty(AngularParser.TemplatePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void exitTemplateProperty(AngularParser.TemplatePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StyleUrlsProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void enterStyleUrlsProperty(AngularParser.StyleUrlsPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StyleUrlsProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void exitStyleUrlsProperty(AngularParser.StyleUrlsPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StylesProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void enterStylesProperty(AngularParser.StylesPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StylesProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void exitStylesProperty(AngularParser.StylesPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StandaloneProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void enterStandaloneProperty(AngularParser.StandalonePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StandaloneProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void exitStandaloneProperty(AngularParser.StandalonePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InputsProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void enterInputsProperty(AngularParser.InputsPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InputsProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void exitInputsProperty(AngularParser.InputsPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OutputsProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void enterOutputsProperty(AngularParser.OutputsPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OutputsProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void exitOutputsProperty(AngularParser.OutputsPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportsComponentProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void enterImportsComponentProperty(AngularParser.ImportsComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportsComponentProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void exitImportsComponentProperty(AngularParser.ImportsComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportsComponentProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void enterExportsComponentProperty(AngularParser.ExportsComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportsComponentProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void exitExportsComponentProperty(AngularParser.ExportsComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ProvidersComponentProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void enterProvidersComponentProperty(AngularParser.ProvidersComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ProvidersComponentProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void exitProvidersComponentProperty(AngularParser.ProvidersComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationsComponentProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationsComponentProperty(AngularParser.DeclarationsComponentPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationsComponentProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationsComponentProperty(AngularParser.DeclarationsComponentPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#directiveDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveDeclaration(AngularParser.DirectiveDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#directiveDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveDeclaration(AngularParser.DirectiveDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#directiveMetadata}.
	 * @param ctx the parse tree
	 */
	void enterDirectiveMetadata(AngularParser.DirectiveMetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#directiveMetadata}.
	 * @param ctx the parse tree
	 */
	void exitDirectiveMetadata(AngularParser.DirectiveMetadataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectorDirectiveProperty}
	 * labeled alternative in {@link AngularParser#directiveMetadataProperty}.
	 * @param ctx the parse tree
	 */
	void enterSelectorDirectiveProperty(AngularParser.SelectorDirectivePropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectorDirectiveProperty}
	 * labeled alternative in {@link AngularParser#directiveMetadataProperty}.
	 * @param ctx the parse tree
	 */
	void exitSelectorDirectiveProperty(AngularParser.SelectorDirectivePropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierProperty}
	 * labeled alternative in {@link AngularParser#directiveMetadataProperty}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierProperty(AngularParser.IdentifierPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierProperty}
	 * labeled alternative in {@link AngularParser#directiveMetadataProperty}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierProperty(AngularParser.IdentifierPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#pipeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPipeDeclaration(AngularParser.PipeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#pipeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPipeDeclaration(AngularParser.PipeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#pipeMetadata}.
	 * @param ctx the parse tree
	 */
	void enterPipeMetadata(AngularParser.PipeMetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#pipeMetadata}.
	 * @param ctx the parse tree
	 */
	void exitPipeMetadata(AngularParser.PipeMetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#pipeMetadataProperty}.
	 * @param ctx the parse tree
	 */
	void enterPipeMetadataProperty(AngularParser.PipeMetadataPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#pipeMetadataProperty}.
	 * @param ctx the parse tree
	 */
	void exitPipeMetadataProperty(AngularParser.PipeMetadataPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#injectableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInjectableDeclaration(AngularParser.InjectableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#injectableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInjectableDeclaration(AngularParser.InjectableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#injectableMetadata}.
	 * @param ctx the parse tree
	 */
	void enterInjectableMetadata(AngularParser.InjectableMetadataContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#injectableMetadata}.
	 * @param ctx the parse tree
	 */
	void exitInjectableMetadata(AngularParser.InjectableMetadataContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#injectableMetadataProperty}.
	 * @param ctx the parse tree
	 */
	void enterInjectableMetadataProperty(AngularParser.InjectableMetadataPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#injectableMetadataProperty}.
	 * @param ctx the parse tree
	 */
	void exitInjectableMetadataProperty(AngularParser.InjectableMetadataPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(AngularParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(AngularParser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interfaceProperty}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceProperty(AngularParser.InterfacePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interfaceProperty}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceProperty(AngularParser.InterfacePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(AngularParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(AngularParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(AngularParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(AngularParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#enumProperty}.
	 * @param ctx the parse tree
	 */
	void enterEnumProperty(AngularParser.EnumPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#enumProperty}.
	 * @param ctx the parse tree
	 */
	void exitEnumProperty(AngularParser.EnumPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentSt(AngularParser.AssignmentStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentSt(AngularParser.AssignmentStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintSt(AngularParser.PrintStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintSt(AngularParser.PrintStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnSt(AngularParser.ReturnStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnSt(AngularParser.ReturnStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThrowSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterThrowSt(AngularParser.ThrowStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThrowSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitThrowSt(AngularParser.ThrowStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConditionalSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalSt(AngularParser.ConditionalStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConditionalSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalSt(AngularParser.ConditionalStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IterationSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIterationSt(AngularParser.IterationStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IterationSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIterationSt(AngularParser.IterationStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BootstrapCallSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBootstrapCallSt(AngularParser.BootstrapCallStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BootstrapCallSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBootstrapCallSt(AngularParser.BootstrapCallStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallSt(AngularParser.FunctionCallStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallSt(AngularParser.FunctionCallStContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpressionSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSt(AngularParser.ExpressionStContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpressionSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSt(AngularParser.ExpressionStContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(AngularParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(AngularParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(AngularParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(AngularParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(AngularParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(AngularParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStatement(AngularParser.ElseIfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#elseIfStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStatement(AngularParser.ElseIfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(AngularParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(AngularParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#statementBody}.
	 * @param ctx the parse tree
	 */
	void enterStatementBody(AngularParser.StatementBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#statementBody}.
	 * @param ctx the parse tree
	 */
	void exitStatementBody(AngularParser.StatementBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#bootstrapCall}.
	 * @param ctx the parse tree
	 */
	void enterBootstrapCall(AngularParser.BootstrapCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#bootstrapCall}.
	 * @param ctx the parse tree
	 */
	void exitBootstrapCall(AngularParser.BootstrapCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StandardForLoop}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterStandardForLoop(AngularParser.StandardForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StandardForLoop}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitStandardForLoop(AngularParser.StandardForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForOfLoop}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForOfLoop(AngularParser.ForOfLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForOfLoop}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForOfLoop(AngularParser.ForOfLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForInLoop}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInLoop(AngularParser.ForInLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForInLoop}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInLoop(AngularParser.ForInLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(AngularParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(AngularParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileLoop(AngularParser.DoWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileLoop(AngularParser.DoWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AngularParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(AngularParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(AngularParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(AngularParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(AngularParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryValue(AngularParser.PrimaryValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryValue(AngularParser.PrimaryValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayValue(AngularParser.ArrayValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayValue(AngularParser.ArrayValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccessValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessValue(AngularParser.ArrayAccessValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccessValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessValue(AngularParser.ArrayAccessValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberAccessValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessValue(AngularParser.MemberAccessValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAccessValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessValue(AngularParser.MemberAccessValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObjectValue(AngularParser.ObjectValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObjectValue(AngularParser.ObjectValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectInstantiationValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void enterObjectInstantiationValue(AngularParser.ObjectInstantiationValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectInstantiationValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 */
	void exitObjectInstantiationValue(AngularParser.ObjectInstantiationValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(AngularParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(AngularParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(AngularParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(AngularParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(AngularParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(AngularParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#objectInstantiation}.
	 * @param ctx the parse tree
	 */
	void enterObjectInstantiation(AngularParser.ObjectInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#objectInstantiation}.
	 * @param ctx the parse tree
	 */
	void exitObjectInstantiation(AngularParser.ObjectInstantiationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberAccessIdentifier}
	 * labeled alternative in {@link AngularParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessIdentifier(AngularParser.MemberAccessIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAccessIdentifier}
	 * labeled alternative in {@link AngularParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessIdentifier(AngularParser.MemberAccessIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberAccessThis}
	 * labeled alternative in {@link AngularParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessThis(AngularParser.MemberAccessThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAccessThis}
	 * labeled alternative in {@link AngularParser#memberAccess}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessThis(AngularParser.MemberAccessThisContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(AngularParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(AngularParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(AngularParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(AngularParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralPrimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLiteralPrimary(AngularParser.LiteralPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralPrimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLiteralPrimary(AngularParser.LiteralPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierPrimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierPrimary(AngularParser.IdentifierPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierPrimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierPrimary(AngularParser.IdentifierPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MemberAccessExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMemberAccessExpression(AngularParser.MemberAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MemberAccessExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMemberAccessExpression(AngularParser.MemberAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(AngularParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(AngularParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(AngularParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(AngularParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(AngularParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(AngularParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(AngularParser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(AngularParser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(AngularParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(AngularParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(AngularParser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(AngularParser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(AngularParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(AngularParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(AngularParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(AngularParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecreaseExpression(AngularParser.PreDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecreaseExpression(AngularParser.PreDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(AngularParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(AngularParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(AngularParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(AngularParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecreaseExpression(AngularParser.PostDecreaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecreaseExpression(AngularParser.PostDecreaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpression(AngularParser.ValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpression(AngularParser.ValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParameterExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParameterExpression(AngularParser.ParameterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParameterExpression(AngularParser.ParameterExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(AngularParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(AngularParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(AngularParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(AngularParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#genericType}.
	 * @param ctx the parse tree
	 */
	void enterGenericType(AngularParser.GenericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#genericType}.
	 * @param ctx the parse tree
	 */
	void exitGenericType(AngularParser.GenericTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericTypeAnnotation}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterGenericTypeAnnotation(AngularParser.GenericTypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericTypeAnnotation}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitGenericTypeAnnotation(AngularParser.GenericTypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PipeTypeAnnotation}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterPipeTypeAnnotation(AngularParser.PipeTypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PipeTypeAnnotation}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitPipeTypeAnnotation(AngularParser.PipeTypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayTypeAnnotation}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeAnnotation(AngularParser.ArrayTypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayTypeAnnotation}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeAnnotation(AngularParser.ArrayTypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TupleTypeAnnotation}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTupleTypeAnnotation(AngularParser.TupleTypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TupleTypeAnnotation}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTupleTypeAnnotation(AngularParser.TupleTypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(AngularParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(AngularParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#htmlTemplate}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTemplate(AngularParser.HtmlTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#htmlTemplate}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTemplate(AngularParser.HtmlTemplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StandardTagEl}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterStandardTagEl(AngularParser.StandardTagElContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StandardTagEl}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitStandardTagEl(AngularParser.StandardTagElContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfClosingTagEl}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTagEl(AngularParser.SelfClosingTagElContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfClosingTagEl}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTagEl(AngularParser.SelfClosingTagElContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InterpolationEl}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void enterInterpolationEl(AngularParser.InterpolationElContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InterpolationEl}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 */
	void exitInterpolationEl(AngularParser.InterpolationElContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#openTag}.
	 * @param ctx the parse tree
	 */
	void enterOpenTag(AngularParser.OpenTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#openTag}.
	 * @param ctx the parse tree
	 */
	void exitOpenTag(AngularParser.OpenTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(AngularParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(AngularParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NestedElementContent}
	 * labeled alternative in {@link AngularParser#content}.
	 * @param ctx the parse tree
	 */
	void enterNestedElementContent(AngularParser.NestedElementContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NestedElementContent}
	 * labeled alternative in {@link AngularParser#content}.
	 * @param ctx the parse tree
	 */
	void exitNestedElementContent(AngularParser.NestedElementContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PlainTextContent}
	 * labeled alternative in {@link AngularParser#content}.
	 * @param ctx the parse tree
	 */
	void enterPlainTextContent(AngularParser.PlainTextContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PlainTextContent}
	 * labeled alternative in {@link AngularParser#content}.
	 * @param ctx the parse tree
	 */
	void exitPlainTextContent(AngularParser.PlainTextContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StandardAttribute}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterStandardAttribute(AngularParser.StandardAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StandardAttribute}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitStandardAttribute(AngularParser.StandardAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PropertyBinding}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PropertyBinding}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EventBinding}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EventBinding}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TwoWayBinding}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterTwoWayBinding(AngularParser.TwoWayBindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TwoWayBinding}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitTwoWayBinding(AngularParser.TwoWayBindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StructuralDirectiveAttr}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterStructuralDirectiveAttr(AngularParser.StructuralDirectiveAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StructuralDirectiveAttr}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitStructuralDirectiveAttr(AngularParser.StructuralDirectiveAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TemplateReferenceVariable}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterTemplateReferenceVariable(AngularParser.TemplateReferenceVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TemplateReferenceVariable}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitTemplateReferenceVariable(AngularParser.TemplateReferenceVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeOnly}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void enterAttributeOnly(AngularParser.AttributeOnlyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeOnly}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 */
	void exitAttributeOnly(AngularParser.AttributeOnlyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#interpolationElement}.
	 * @param ctx the parse tree
	 */
	void enterInterpolationElement(AngularParser.InterpolationElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#interpolationElement}.
	 * @param ctx the parse tree
	 */
	void exitInterpolationElement(AngularParser.InterpolationElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(AngularParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(AngularParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link AngularParser#structuralDirective}.
	 * @param ctx the parse tree
	 */
	void enterStructuralDirective(AngularParser.StructuralDirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link AngularParser#structuralDirective}.
	 * @param ctx the parse tree
	 */
	void exitStructuralDirective(AngularParser.StructuralDirectiveContext ctx);
}