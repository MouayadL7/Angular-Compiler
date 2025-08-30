// Generated from C:/Users/Lenovo/Desktop/Angular-Compiler/src/antlr/AngularParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefaultSpecifierDeclaration}
	 * labeled alternative in {@link AngularParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultSpecifierDeclaration(AngularParser.DefaultSpecifierDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamespaceSpecifierDeclaration}
	 * labeled alternative in {@link AngularParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespaceSpecifierDeclaration(AngularParser.NamespaceSpecifierDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NamedSpecifierDeclaration}
	 * labeled alternative in {@link AngularParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedSpecifierDeclaration(AngularParser.NamedSpecifierDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importDefaultSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDefaultSpecifier(AngularParser.ImportDefaultSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importNamespaceSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNamespaceSpecifier(AngularParser.ImportNamespaceSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importNamedSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportNamedSpecifier(AngularParser.ImportNamedSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierImportSpecifier}
	 * labeled alternative in {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierImportSpecifier(AngularParser.IdentifierImportSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BootstrapImportSpecifier}
	 * labeled alternative in {@link AngularParser#importSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBootstrapImportSpecifier(AngularParser.BootstrapImportSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#bootstrapSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBootstrapSpecifier(AngularParser.BootstrapSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NgModuleDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgModuleDecl(AngularParser.NgModuleDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDecl(AngularParser.ComponentDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PipeDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeDecl(AngularParser.PipeDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InjectableDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectableDecl(AngularParser.InjectableDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DirectiveDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveDecl(AngularParser.DirectiveDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterfaceDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDecl(AngularParser.InterfaceDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(AngularParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EnumDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDecl(AngularParser.EnumDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDecl(AngularParser.VariableDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(AngularParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RoutingDecl}
	 * labeled alternative in {@link AngularParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutingDecl(AngularParser.RoutingDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#varHelper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarHelper(AngularParser.VarHelperContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NormalFunctionDeclaration}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFunctionDeclaration(AngularParser.NormalFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AnonymousFunctionDeclaration}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunctionDeclaration(AngularParser.AnonymousFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunctionDeclaration}
	 * labeled alternative in {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunctionDeclaration(AngularParser.ArrowFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#normalFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalFunction(AngularParser.NormalFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#anonymousFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousFunction(AngularParser.AnonymousFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AngularParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngModuleDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgModuleDeclaration(AngularParser.NgModuleDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#moduleMetadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleMetadata(AngularParser.ModuleMetadataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BootstrapProperty}
	 * labeled alternative in {@link AngularParser#metadataModuleProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBootstrapProperty(AngularParser.BootstrapPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationsModuleProperty}
	 * labeled alternative in {@link AngularParser#metadataModuleProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationsModuleProperty(AngularParser.DeclarationsModulePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportsModuleProperty}
	 * labeled alternative in {@link AngularParser#metadataModuleProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsModuleProperty(AngularParser.ImportsModulePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportsModuleProperty}
	 * labeled alternative in {@link AngularParser#metadataModuleProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportsModuleProperty(AngularParser.ExportsModulePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProvidersModuleProperty}
	 * labeled alternative in {@link AngularParser#metadataModuleProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProvidersModuleProperty(AngularParser.ProvidersModulePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#componentMetadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentMetadata(AngularParser.ComponentMetadataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorComponentProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorComponentProperty(AngularParser.SelectorComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateUrlProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateUrlProperty(AngularParser.TemplateUrlPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateProperty(AngularParser.TemplatePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StyleUrlsProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleUrlsProperty(AngularParser.StyleUrlsPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StylesProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesProperty(AngularParser.StylesPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandaloneProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandaloneProperty(AngularParser.StandalonePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputsProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputsProperty(AngularParser.InputsPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OutputsProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputsProperty(AngularParser.OutputsPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportsComponentProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportsComponentProperty(AngularParser.ImportsComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportsComponentProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportsComponentProperty(AngularParser.ExportsComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProvidersComponentProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProvidersComponentProperty(AngularParser.ProvidersComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationsComponentProperty}
	 * labeled alternative in {@link AngularParser#metadataComponentProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationsComponentProperty(AngularParser.DeclarationsComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#directiveDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveDeclaration(AngularParser.DirectiveDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#directiveMetadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectiveMetadata(AngularParser.DirectiveMetadataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectorDirectiveProperty}
	 * labeled alternative in {@link AngularParser#directiveMetadataProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorDirectiveProperty(AngularParser.SelectorDirectivePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierProperty}
	 * labeled alternative in {@link AngularParser#directiveMetadataProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierProperty(AngularParser.IdentifierPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#pipeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeDeclaration(AngularParser.PipeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#pipeMetadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeMetadata(AngularParser.PipeMetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#pipeMetadataProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeMetadataProperty(AngularParser.PipeMetadataPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#injectableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectableDeclaration(AngularParser.InjectableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#injectableMetadata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectableMetadata(AngularParser.InjectableMetadataContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#injectableMetadataProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInjectableMetadataProperty(AngularParser.InjectableMetadataPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#propertyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#constructorBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorBody(AngularParser.ConstructorBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(AngularParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceProperty(AngularParser.InterfacePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(AngularParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#enumBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBody(AngularParser.EnumBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#enumProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumProperty(AngularParser.EnumPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentSt(AngularParser.AssignmentStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintSt(AngularParser.PrintStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnSt(AngularParser.ReturnStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThrowSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowSt(AngularParser.ThrowStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionalSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalSt(AngularParser.ConditionalStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IterationSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationSt(AngularParser.IterationStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BootstrapCallSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBootstrapCallSt(AngularParser.BootstrapCallStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallSt(AngularParser.FunctionCallStContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionSt}
	 * labeled alternative in {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionSt(AngularParser.ExpressionStContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(AngularParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(AngularParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AngularParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#throwStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowStatement(AngularParser.ThrowStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(AngularParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(AngularParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(AngularParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#statementBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBody(AngularParser.StatementBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AngularParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#bootstrapCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBootstrapCall(AngularParser.BootstrapCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandardForLoop}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardForLoop(AngularParser.StandardForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForOfLoop}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForOfLoop(AngularParser.ForOfLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForInLoop}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInLoop(AngularParser.ForInLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(AngularParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileLoop}
	 * labeled alternative in {@link AngularParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoop(AngularParser.DoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(AngularParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(AngularParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(AngularParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimaryValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryValue(AngularParser.PrimaryValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayValue(AngularParser.ArrayValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayAccessValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccessValue(AngularParser.ArrayAccessValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAccessValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessValue(AngularParser.MemberAccessValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectValue(AngularParser.ObjectValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObjectInstantiationValue}
	 * labeled alternative in {@link AngularParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInstantiationValue(AngularParser.ObjectInstantiationValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(AngularParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(AngularParser.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(AngularParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectInstantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInstantiation(AngularParser.ObjectInstantiationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAccessThis}
	 * labeled alternative in {@link AngularParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessThis(AngularParser.MemberAccessThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAccessIdentifier}
	 * labeled alternative in {@link AngularParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessIdentifier(AngularParser.MemberAccessIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAccess(AngularParser.ArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitialization(AngularParser.InitializationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralPrimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralPrimary(AngularParser.LiteralPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierPrimary}
	 * labeled alternative in {@link AngularParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierPrimary(AngularParser.IdentifierPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(AngularParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MemberAccessExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccessExpression(AngularParser.MemberAccessExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AdditiveExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(AngularParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RelationalExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(AngularParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryExpression(AngularParser.TernaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostIncrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncrementExpression(AngularParser.PostIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(AngularParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreIncrementExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncrementExpression(AngularParser.PreIncrementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(AngularParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(AngularParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PreDecreaseExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreDecreaseExpression(AngularParser.PreDecreaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(AngularParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(AngularParser.FunctionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PostDecreaseExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostDecreaseExpression(AngularParser.PostDecreaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpression(AngularParser.ValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParameterExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterExpression(AngularParser.ParameterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(AngularParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultiplicativeExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(AngularParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#genericType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericType(AngularParser.GenericTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenericTypeAnnotation}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeAnnotation(AngularParser.GenericTypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PipeTypeAnnotation}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPipeTypeAnnotation(AngularParser.PipeTypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayTypeAnnotation}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeAnnotation(AngularParser.ArrayTypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleTypeAnnotation}
	 * labeled alternative in {@link AngularParser#typeAnnotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleTypeAnnotation(AngularParser.TupleTypeAnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(AngularParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#htmlTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTemplate(AngularParser.HtmlTemplateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandardTagEl}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardTagEl(AngularParser.StandardTagElContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfClosingTagEl}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTagEl(AngularParser.SelfClosingTagElContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InterpolationEl}
	 * labeled alternative in {@link AngularParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolationEl(AngularParser.InterpolationElContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#openTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenTag(AngularParser.OpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(AngularParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#selfClosingTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingTag(AngularParser.SelfClosingTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NestedElementContent}
	 * labeled alternative in {@link AngularParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedElementContent(AngularParser.NestedElementContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PlainTextContent}
	 * labeled alternative in {@link AngularParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainTextContent(AngularParser.PlainTextContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandardAttribute}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardAttribute(AngularParser.StandardAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyBinding}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyBinding(AngularParser.PropertyBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EventBinding}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventBinding(AngularParser.EventBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TwoWayBinding}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTwoWayBinding(AngularParser.TwoWayBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StructuralDirectiveAttr}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuralDirectiveAttr(AngularParser.StructuralDirectiveAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TemplateReferenceVariable}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateReferenceVariable(AngularParser.TemplateReferenceVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributeOnly}
	 * labeled alternative in {@link AngularParser#attributeHTML}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeOnly(AngularParser.AttributeOnlyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(AngularParser.InterpolationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StandardInterpolationElement}
	 * labeled alternative in {@link AngularParser#interpolationElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardInterpolationElement(AngularParser.StandardInterpolationElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TernaryInterpolationElement}
	 * labeled alternative in {@link AngularParser#interpolationElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryInterpolationElement(AngularParser.TernaryInterpolationElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringInterpolationElement}
	 * labeled alternative in {@link AngularParser#interpolationElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringInterpolationElement(AngularParser.StringInterpolationElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(AngularParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#structuralDirective}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuralDirective(AngularParser.StructuralDirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routingDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutingDeclaration(AngularParser.RoutingDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouteDefinition(AngularParser.RouteDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PathProperty}
	 * labeled alternative in {@link AngularParser#routeProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathProperty(AngularParser.PathPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ComponentProperty}
	 * labeled alternative in {@link AngularParser#routeProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentProperty(AngularParser.ComponentPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RedirectToProperty}
	 * labeled alternative in {@link AngularParser#routeProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRedirectToProperty(AngularParser.RedirectToPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PathMatchProperty}
	 * labeled alternative in {@link AngularParser#routeProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPathMatchProperty(AngularParser.PathMatchPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ChildrenProperty}
	 * labeled alternative in {@link AngularParser#routeProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildrenProperty(AngularParser.ChildrenPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LazyLoadProperty}
	 * labeled alternative in {@link AngularParser#routeProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLazyLoadProperty(AngularParser.LazyLoadPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CanActivateProperty}
	 * labeled alternative in {@link AngularParser#routeProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCanActivateProperty(AngularParser.CanActivatePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CanDeactivateProperty}
	 * labeled alternative in {@link AngularParser#routeProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCanDeactivateProperty(AngularParser.CanDeactivatePropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OutletProperty}
	 * labeled alternative in {@link AngularParser#routeProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutletProperty(AngularParser.OutletPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GenericRouteProperty}
	 * labeled alternative in {@link AngularParser#routeProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericRouteProperty(AngularParser.GenericRoutePropertyContext ctx);
}