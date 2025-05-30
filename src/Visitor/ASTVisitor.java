package Visitor;

import AST.HTML.*;
import AST.HTML.attributeHTML.*;
import AST.HTML.content.Content;
import AST.HTML.content.PlainTextContent;
import AST.HTML.element.Element;
import AST.HTML.element.StandardTagElement;
import AST.array.Array;
import AST.array.ArrayAccess;
import AST.expression.*;
import AST.helpers.*;
import AST.object.Attribute;
import AST.object.Attributes;
import AST.object.ObjectInstantiation;
import AST.parameterList.Parameter;
import AST.parameterList.ParameterDeclaration;
import AST.parameterList.ParameterList;
import AST.program.Program;
import AST.declaration.Declaration;
import AST.declaration.classDeclaration.ClassBody;
import AST.declaration.classDeclaration.ClassDeclaration;
import AST.declaration.classDeclaration.MethodDeclaration;
import AST.declaration.classDeclaration.PropertyDeclaration;
import AST.declaration.classDeclaration.constructorDeclaration.ConstructorBody;
import AST.declaration.classDeclaration.constructorDeclaration.ConstructorDeclaration;
import AST.declaration.componentDeclaration.ComponentDeclaration;
import AST.declaration.componentDeclaration.ComponentMetadata;
import AST.declaration.componentDeclaration.componentMetadataProperty.*;
import AST.declaration.directiveDeclaration.DirectiveDeclaration;
import AST.declaration.directiveDeclaration.DirectiveMetadata;
import AST.declaration.directiveDeclaration.directiveMetadataProperty.DirectiveMetadataProperty;
import AST.declaration.directiveDeclaration.directiveMetadataProperty.IdentifierProperty;
import AST.declaration.directiveDeclaration.directiveMetadataProperty.SelectorDirectiveProperty;
import AST.declaration.enumDeclaration.EnumBody;
import AST.declaration.enumDeclaration.EnumDeclaration;
import AST.declaration.enumDeclaration.EnumProperty;
import AST.declaration.functionDeclaration.AnonymousFunction;
import AST.declaration.functionDeclaration.ArrowFunction;
import AST.declaration.functionDeclaration.FunctionDeclaration;
import AST.declaration.functionDeclaration.NormalFunction;
import AST.declaration.injectableDeclaration.InjectableDeclaration;
import AST.declaration.injectableDeclaration.InjectableMetadata;
import AST.declaration.injectableDeclaration.InjectableMetadataProperty;
import AST.declaration.interfaceDeclaration.InterfaceBody;
import AST.declaration.interfaceDeclaration.InterfaceDeclaration;
import AST.declaration.interfaceDeclaration.InterfaceProperty;
import AST.declaration.ngModuleDeclaration.ModuleMetadata;
import AST.declaration.ngModuleDeclaration.moduleMetadataProperty.*;
import AST.declaration.ngModuleDeclaration.NgModuleDeclaration;
import AST.declaration.pipeDeclaration.PipeDeclaration;
import AST.declaration.pipeDeclaration.PipeMetadata;
import AST.declaration.pipeDeclaration.PipeMetadataProperty;
import AST.helpers.VarHelper;
import AST.declaration.variableDeclaration.VariableDeclaration;
import AST.statement.*;
import AST.statement.conditionalStatement.*;
import AST.statement.importStatement.*;
import AST.statement.importStatement.importDeclaration.ImportDeclaration;
import AST.statement.importStatement.importDeclaration.ImportDefaultSpecifier;
import AST.statement.importStatement.importDeclaration.ImportNamedSpecifier;
import AST.statement.importStatement.importDeclaration.ImportNamespaceSpecifier;
import AST.statement.importStatement.importSpecifier.IdentifierImportSpecifier;
import AST.statement.importStatement.importSpecifier.ImportSpecifier;
import AST.statement.iterationStatement.*;
import AST.typeAnnotation.*;
import ErrorHandling.SemanticCheck;
import SymbolTable.SymbolTable;
import SymbolTable.SymbolTable2;
import antlr.AngularParser;
import antlr.AngularParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class ASTVisitor extends AngularParserBaseVisitor {

    public SymbolTable symbolTable;
    public final SemanticCheck semanticCheck;

    public ASTVisitor(SemanticCheck semanticCheck) {
        this.symbolTable = new SymbolTable();
        this.semanticCheck = semanticCheck;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    /* ======================== Program ======================== */

    @Override
    public Program visitProgram(AngularParser.ProgramContext ctx) {
        Program program = new Program();

        List<ImportStatement> importStatementList = new ArrayList<>();
        for (AngularParser.ImportStatementContext importStatementContext : ctx.importStatement()) {
            importStatementList.add(visitImportStatement(importStatementContext));
        }
        program.setImportStatementList(importStatementList);

        List<Declaration> declarationList = new ArrayList<>();
        for (AngularParser.DeclarationContext declarationContext : ctx.declaration()) {
            declarationList.add((Declaration) visit(declarationContext));
        }
        program.setDeclarationList(declarationList);

        List<Statement> statementList = new ArrayList<>();
        for (AngularParser.StatementContext statementContext : ctx.statement()) {
            statementList.add((Statement) visit(statementContext));
        }
        program.setStatementList(statementList);

        return program;
    }

    /* ==================== Import Statements ==================== */

    @Override
    public ImportStatement visitImportStatement(AngularParser.ImportStatementContext ctx) {
        ImportStatement importStatement = new ImportStatement();

        importStatement.setImportDeclaration((ImportDeclaration) visit(ctx.importDeclaration()));

        return importStatement;
    }

    @Override
    public Object visitDefaultSpecifierDeclaration(AngularParser.DefaultSpecifierDeclarationContext ctx) {
        return visitImportDefaultSpecifier(ctx.importDefaultSpecifier());
    }

    @Override
    public Object visitNamespaceSpecifierDeclaration(AngularParser.NamespaceSpecifierDeclarationContext ctx) {
        return visitImportNamespaceSpecifier(ctx.importNamespaceSpecifier());
    }

    @Override
    public Object visitNamedSpecifierDeclaration(AngularParser.NamedSpecifierDeclarationContext ctx) {
        return visitImportNamedSpecifier(ctx.importNamedSpecifier());
    }

    @Override
    public Object visitImportDefaultSpecifier(AngularParser.ImportDefaultSpecifierContext ctx) {
        ImportDefaultSpecifier importDefaultSpecifier = new ImportDefaultSpecifier();

        if (ctx.IDENTIFIER() != null) {
            importDefaultSpecifier.setName(ctx.IDENTIFIER().getText());
        }

        return importDefaultSpecifier;
    }

    @Override
    public Object visitImportNamespaceSpecifier(AngularParser.ImportNamespaceSpecifierContext ctx) {
        ImportNamespaceSpecifier importNamespaceSpecifier = new ImportNamespaceSpecifier();

        if (ctx.IDENTIFIER() != null) {
            importNamespaceSpecifier.setName(ctx.IDENTIFIER().getText());
        }

        return importNamespaceSpecifier;
    }

    @Override
    public Object visitImportNamedSpecifier(AngularParser.ImportNamedSpecifierContext ctx) {
        ImportNamedSpecifier importNamedSpecifier = new ImportNamedSpecifier();

        List<ImportSpecifier> importSpecifierList = new ArrayList<>();
        for (AngularParser.ImportSpecifierContext importSpecifierContext : ctx.importSpecifier()) {
            importSpecifierList.add((ImportSpecifier) visit(importSpecifierContext));
        }
        importNamedSpecifier.setImportSpecifierList(importSpecifierList);

        return importNamedSpecifier;
    }

    @Override
    public Object visitIdentifierImportSpecifier(AngularParser.IdentifierImportSpecifierContext ctx) {
        IdentifierImportSpecifier identifierImportSpecifier = new IdentifierImportSpecifier();

        if (ctx.IDENTIFIER() != null) {
            identifierImportSpecifier.setIdentifier(ctx.IDENTIFIER().getText());
        }

        return identifierImportSpecifier;
    }

    @Override
    public Object visitBootstrapImportSpecifier(AngularParser.BootstrapImportSpecifierContext ctx) {
        return visitBootstrapSpecifier(ctx.bootstrapSpecifier());
    }

    @Override
    public BootstrapSpecifier visitBootstrapSpecifier(AngularParser.BootstrapSpecifierContext ctx) {
        BootstrapSpecifier bootstrapSpecifier = new BootstrapSpecifier();

        if (ctx.PLATFORM_BROWSER_DYNAMIC() != null) {
            bootstrapSpecifier.setName(ctx.PLATFORM_BROWSER_DYNAMIC().getText());
        }
        else if (ctx.BOOTSTRAP_MODULE() != null) {
            bootstrapSpecifier.setName(ctx.BOOTSTRAP_MODULE().getText());
        }
        else if (ctx.BOOTSTRAP_APPLICATION() != null) {
            bootstrapSpecifier.setName(ctx.BOOTSTRAP_APPLICATION().getText());
        }

        return bootstrapSpecifier;
    }

    /* ====================== Declarations ====================== */

    @Override
    public Object visitNgModuleDecl(AngularParser.NgModuleDeclContext ctx) {
        return visitNgModuleDeclaration(ctx.ngModuleDeclaration());
    }

    @Override
    public Object visitComponentDecl(AngularParser.ComponentDeclContext ctx) {
        return visitComponentDeclaration(ctx.componentDeclaration());
    }

    @Override
    public Object visitPipeDecl(AngularParser.PipeDeclContext ctx) {
        return visitPipeDeclaration(ctx.pipeDeclaration());
    }

    @Override
    public Object visitInjectableDecl(AngularParser.InjectableDeclContext ctx) {
        return visitInjectableDeclaration(ctx.injectableDeclaration());
    }

    @Override
    public Object visitDirectiveDecl(AngularParser.DirectiveDeclContext ctx) {
        return visitDirectiveDeclaration(ctx.directiveDeclaration());
    }

    @Override
    public Object visitInterfaceDecl(AngularParser.InterfaceDeclContext ctx) {
        return visitInterfaceDeclaration(ctx.interfaceDeclaration());
    }

    @Override
    public Object visitClassDecl(AngularParser.ClassDeclContext ctx) {
        return visitClassDeclaration(ctx.classDeclaration());
    }

    @Override
    public Object visitEnumDecl(AngularParser.EnumDeclContext ctx) {
        return visitEnumDeclaration(ctx.enumDeclaration());
    }

    @Override
    public Object visitVariableDecl(AngularParser.VariableDeclContext ctx) {
        return visitVariableDeclaration(ctx.variableDeclaration());
    }

    @Override
    public Object visitFunctionDecl(AngularParser.FunctionDeclContext ctx) {
        return (FunctionDeclaration) visit(ctx.functionDeclaration());
    }

    @Override
    public VariableDeclaration visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx) {
        VariableDeclaration variableDeclaration = new VariableDeclaration();

        variableDeclaration.setVarHelper(visitVarHelper(ctx.varHelper()));
        variableDeclaration.setName(ctx.IDENTIFIER().getText());

        if (ctx.typeAnnotation() != null) {
            variableDeclaration.setTypeAnnotation((TypeAnnotation) visit(ctx.typeAnnotation()));
        }

        if (ctx.initialization() != null) {
            variableDeclaration.setInitialization(visitInitialization(ctx.initialization()));
        }

        return variableDeclaration;
    }

    @Override
    public VarHelper visitVarHelper(AngularParser.VarHelperContext ctx) {
        VarHelper varHelper = new VarHelper();

        if (ctx.LET() != null) {
            varHelper.setType(ctx.LET().getText());
        }
        else if (ctx.CONST() != null) {
            varHelper.setType(ctx.CONST().getText());
        }

        return varHelper;
    }

    @Override
    public Object visitNormalFunctionDeclaration(AngularParser.NormalFunctionDeclarationContext ctx) {
        return visitNormalFunction(ctx.normalFunction());
    }

    @Override
    public Object visitAnonymousFunctionDeclaration(AngularParser.AnonymousFunctionDeclarationContext ctx) {
        return visitAnonymousFunction(ctx.anonymousFunction());
    }

    @Override
    public Object visitArrowFunctionDeclaration(AngularParser.ArrowFunctionDeclarationContext ctx) {
        return visitArrowFunction(ctx.arrowFunction());
    }

    @Override
    public Object visitNormalFunction(AngularParser.NormalFunctionContext ctx) {
        NormalFunction normalFunction = new NormalFunction();

        normalFunction.setName(ctx.IDENTIFIER().getText());
        normalFunction.setBlock(visitBlock(ctx.block()));

        if (ctx.parameterList() != null) {
            normalFunction.setParameterList(visitParameterList(ctx.parameterList()));
        }

        if (ctx.typeAnnotation() != null) {
            normalFunction.setTypeAnnotation((TypeAnnotation) visit(ctx.typeAnnotation()));
        }

        return normalFunction;
    }

    @Override
    public Object visitAnonymousFunction(AngularParser.AnonymousFunctionContext ctx) {
        AnonymousFunction anonymousFunction = new AnonymousFunction();

        anonymousFunction.setBlock(visitBlock(ctx.block()));

        if (ctx.parameterList() != null) {
            anonymousFunction.setParameterList(visitParameterList(ctx.parameterList()));
        }

        if (ctx.typeAnnotation() != null) {
            anonymousFunction.setTypeAnnotation((TypeAnnotation) visit(ctx.typeAnnotation()));
        }

        return anonymousFunction;
    }

    @Override
    public ArrowFunction visitArrowFunction(AngularParser.ArrowFunctionContext ctx) {
        ArrowFunction arrowFunction = new ArrowFunction();

        if (ctx.IDENTIFIER() != null) {
            arrowFunction.setIdentifier(ctx.IDENTIFIER().getText());
        }

        if (ctx.parameterList() != null) {
            arrowFunction.setParameterList(visitParameterList(ctx.parameterList()));
        }

        if (ctx.typeAnnotation() != null) {
            arrowFunction.setTypeAnnotation((TypeAnnotation) visit(ctx.typeAnnotation()));
        }

        if (ctx.statement() != null) {
            arrowFunction.setStatement((Statement) visit(ctx.statement()));
        }

        if (ctx.block() != null) {
            arrowFunction.setBlock(visitBlock(ctx.block()));
        }

        return arrowFunction;
    }

    @Override
    public Block visitBlock(AngularParser.BlockContext ctx) {
        Block block = new Block();

        List<Statement> statementList = new ArrayList<>();
        for (AngularParser.StatementContext statementContext : ctx.statement()) {
            statementList.add((Statement) visit(statementContext));
        }
        block.setStatementList(statementList);

        List<VariableDeclaration> variableDeclarationList = new ArrayList<>();
        for (AngularParser.VariableDeclarationContext variableDeclarationContext : ctx.variableDeclaration()) {
            variableDeclarationList.add(visitVariableDeclaration(variableDeclarationContext));
        }
        block.setVariableDeclarationList(variableDeclarationList);

        return block;
    }

    @Override
    public Object visitNgModuleDeclaration(AngularParser.NgModuleDeclarationContext ctx) {
        NgModuleDeclaration ngModuleDeclaration = new NgModuleDeclaration();

        ngModuleDeclaration.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));

        if (ctx.moduleMetadata() != null) {
            ngModuleDeclaration.setModuleMetadata(visitModuleMetadata(ctx.moduleMetadata()));
        }

        return ngModuleDeclaration;
    }

    @Override
    public ModuleMetadata visitModuleMetadata(AngularParser.ModuleMetadataContext ctx) {
        ModuleMetadata moduleMetadata = new ModuleMetadata();

        List<ModuleMetadataProperty> moduleMetadataPropertyList = new ArrayList<>();
        for (AngularParser.MetadataModulePropertyContext metadataModulePropertyContext: ctx.metadataModuleProperty()) {
            moduleMetadataPropertyList.add((ModuleMetadataProperty) visit(metadataModulePropertyContext));
        }
        moduleMetadata.setMetadataModulePropertyList(moduleMetadataPropertyList);

        return moduleMetadata;
    }

    @Override
    public Object visitBootstrapProperty(AngularParser.BootstrapPropertyContext ctx) {
        BootstrapProperty bootstrapProperty = new BootstrapProperty();

        bootstrapProperty.setArray(visitArray(ctx.array()));

        return bootstrapProperty;
    }

    @Override
    public Object visitDeclarationsModuleProperty(AngularParser.DeclarationsModulePropertyContext ctx) {
        DeclarationsModuleProperty declarationsModuleProperty = new DeclarationsModuleProperty();

        declarationsModuleProperty.setArray(visitArray(ctx.array()));

        return declarationsModuleProperty;
    }

    @Override
    public Object visitImportsModuleProperty(AngularParser.ImportsModulePropertyContext ctx) {
        ImportsModuleProperty importsModuleProperty = new ImportsModuleProperty();

        importsModuleProperty.setArray(visitArray(ctx.array()));

        return importsModuleProperty;
    }

    @Override
    public Object visitExportsModuleProperty(AngularParser.ExportsModulePropertyContext ctx) {
        ExportsModuleProperty exportsModuleProperty = new ExportsModuleProperty();

        exportsModuleProperty.setArray(visitArray(ctx.array()));

        return exportsModuleProperty;
    }

    @Override
    public Object visitProvidersModuleProperty(AngularParser.ProvidersModulePropertyContext ctx) {
        ProvidersModuleProperty providersModuleProperty = new ProvidersModuleProperty();

        providersModuleProperty.setArray(visitArray(ctx.array()));

        return providersModuleProperty;
    }

    @Override
    public Object visitComponentDeclaration(AngularParser.ComponentDeclarationContext ctx) {
        ComponentDeclaration componentDeclaration = new ComponentDeclaration();

        componentDeclaration.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));

        if (ctx.componentMetadata() != null) {
            componentDeclaration.setComponentMetadata(visitComponentMetadata(ctx.componentMetadata()));
        }

        return componentDeclaration;
    }

    @Override
    public ComponentMetadata visitComponentMetadata(AngularParser.ComponentMetadataContext ctx) {
        ComponentMetadata componentMetadata = new ComponentMetadata();

        List<ComponentMetadataProperty> componentMetadataPropertyList = new ArrayList<>();
        for (AngularParser.MetadataComponentPropertyContext metadataComponentPropertyContext : ctx.metadataComponentProperty()) {
            componentMetadataPropertyList.add((ComponentMetadataProperty) visit(metadataComponentPropertyContext));

        }
        componentMetadata.setMetadataComponentPropertyList(componentMetadataPropertyList);

        return componentMetadata;
    }

    @Override
    public Object visitSelectorComponentProperty(AngularParser.SelectorComponentPropertyContext ctx) {
        SelectorComponentProperty selectorComponentProperty = new SelectorComponentProperty();

        selectorComponentProperty.setString(ctx.STRING().getText());

        return selectorComponentProperty;
    }

    @Override
    public Object visitTemplateUrlProperty(AngularParser.TemplateUrlPropertyContext ctx) {
        TemplateUrlProperty templateUrlProperty = new TemplateUrlProperty();

        templateUrlProperty.setString(ctx.STRING().getText());

        return templateUrlProperty;
    }

    @Override
    public Object visitTemplateProperty(AngularParser.TemplatePropertyContext ctx) {
        TemplateProperty templateProperty = new TemplateProperty();

        templateProperty.setHtmlTemplate(visitHtmlTemplate(ctx.htmlTemplate()));

        return templateProperty;
    }

    @Override
    public Object visitStyleUrlsProperty(AngularParser.StyleUrlsPropertyContext ctx) {
        StyleUrlsProperty styleUrlsProperty = new StyleUrlsProperty();

        styleUrlsProperty.setArray(visitArray(ctx.array()));

        return styleUrlsProperty;
    }

    @Override
    public Object visitStylesProperty(AngularParser.StylesPropertyContext ctx) {
        StylesProperty stylesProperty = new StylesProperty();

        stylesProperty.setArray(visitArray(ctx.array()));

        return stylesProperty;
    }

    @Override
    public Object visitStandaloneProperty(AngularParser.StandalonePropertyContext ctx) {
        StandaloneProperty standaloneProperty = new StandaloneProperty();

        standaloneProperty.setValue(ctx.BOOL().getText());

        return standaloneProperty;
    }

    @Override
    public Object visitInputsProperty(AngularParser.InputsPropertyContext ctx) {
        InputsProperty inputsProperty = new InputsProperty();

        inputsProperty.setArray(visitArray(ctx.array()));

        return inputsProperty;
    }

    @Override
    public Object visitOutputsProperty(AngularParser.OutputsPropertyContext ctx) {
        OutputsProperty outputsProperty = new OutputsProperty();

        outputsProperty.setArray(visitArray(ctx.array()));

        return outputsProperty;
    }

    @Override
    public Object visitImportsComponentProperty(AngularParser.ImportsComponentPropertyContext ctx) {
        ImportsComponentProperty importsComponentProperty = new ImportsComponentProperty();

        importsComponentProperty.setArray(visitArray(ctx.array()));

        return importsComponentProperty;
    }

    @Override
    public Object visitExportsComponentProperty(AngularParser.ExportsComponentPropertyContext ctx) {
        ExportsComponentProperty exportsComponentProperty = new ExportsComponentProperty();

        exportsComponentProperty.setArray(visitArray(ctx.array()));

        return exportsComponentProperty;
    }

    @Override
    public Object visitProvidersComponentProperty(AngularParser.ProvidersComponentPropertyContext ctx) {
        ProvidersComponentProperty providersComponentProperty = new ProvidersComponentProperty();

        providersComponentProperty.setArray(visitArray(ctx.array()));

        return providersComponentProperty;
    }

    @Override
    public Object visitDeclarationsComponentProperty(AngularParser.DeclarationsComponentPropertyContext ctx) {
        DeclarationsComponentProperty declarationsComponentProperty = new DeclarationsComponentProperty();

        declarationsComponentProperty.setArray(visitArray(ctx.array()));

        return declarationsComponentProperty;
    }

    /* ===================== Other Angular Declarations ===================== */

    @Override
    public Object visitDirectiveDeclaration(AngularParser.DirectiveDeclarationContext ctx) {
        DirectiveDeclaration directiveDeclaration = new DirectiveDeclaration();

        directiveDeclaration.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));

        if (ctx.directiveMetadata() != null) {
            directiveDeclaration.setDirectiveMetadata(visitDirectiveMetadata(ctx.directiveMetadata()));
        }

        return directiveDeclaration;
    }

    @Override
    public DirectiveMetadata visitDirectiveMetadata(AngularParser.DirectiveMetadataContext ctx) {
        DirectiveMetadata directiveMetadata = new DirectiveMetadata();

        List<DirectiveMetadataProperty> directiveMetadataPropertyList = new ArrayList<>();
        for (AngularParser.DirectiveMetadataPropertyContext directiveMetadataPropertyContext : ctx.directiveMetadataProperty()) {
            directiveMetadataPropertyList.add((DirectiveMetadataProperty) visit(directiveMetadataPropertyContext));
        }
        directiveMetadata.setDirectiveMetadataPropertyList(directiveMetadataPropertyList);

        return directiveMetadata;
    }

    @Override
    public Object visitSelectorDirectiveProperty(AngularParser.SelectorDirectivePropertyContext ctx) {
        SelectorDirectiveProperty selectorDirectiveProperty = new SelectorDirectiveProperty();

        selectorDirectiveProperty.setString(ctx.STRING().getText());

        return selectorDirectiveProperty;
    }

    @Override
    public Object visitIdentifierProperty(AngularParser.IdentifierPropertyContext ctx) {
        IdentifierProperty identifierProperty = new IdentifierProperty();

        identifierProperty.setIdentifier(ctx.IDENTIFIER().getText());

        return identifierProperty;
    }

    @Override
    public Decorator visitDecorator(AngularParser.DecoratorContext ctx) {
        Decorator decorator = new Decorator();

        if (ctx.parameterList() != null) {
            decorator.setParameterList(visitParameterList(ctx.parameterList()));
        }

        return decorator;
    }

    @Override
    public Object visitPipeDeclaration(AngularParser.PipeDeclarationContext ctx) {
        PipeDeclaration pipeDeclaration = new PipeDeclaration();

        pipeDeclaration.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));

        if (ctx.pipeMetadata() != null) {
            pipeDeclaration.setPipeMetadata(visitPipeMetadata(ctx.pipeMetadata()));
        }

        return pipeDeclaration;
    }

    @Override
    public PipeMetadata visitPipeMetadata(AngularParser.PipeMetadataContext ctx) {
        PipeMetadata pipeMetadata = new PipeMetadata();

        List<PipeMetadataProperty> pipeMetadataPropertyList = new ArrayList<>();
        for (AngularParser.PipeMetadataPropertyContext pipeMetadataPropertyContext : ctx.pipeMetadataProperty()) {
            pipeMetadataPropertyList.add(visitPipeMetadataProperty(pipeMetadataPropertyContext));
        }
        pipeMetadata.setPipeMetadataPropertyList(pipeMetadataPropertyList);

        return pipeMetadata;
    }

    @Override
    public PipeMetadataProperty visitPipeMetadataProperty(AngularParser.PipeMetadataPropertyContext ctx) {
        PipeMetadataProperty pipeMetadataProperty = new PipeMetadataProperty();

        pipeMetadataProperty.setName(ctx.IDENTIFIER().getText());
        pipeMetadataProperty.setExpression((Expression) visit(ctx.expression()));

        return pipeMetadataProperty;
    }

    @Override
    public Object visitInjectableDeclaration(AngularParser.InjectableDeclarationContext ctx) {
        InjectableDeclaration injectableDeclaration = new InjectableDeclaration();

        injectableDeclaration.setClassDeclaration(visitClassDeclaration(ctx.classDeclaration()));

        if (ctx.injectableMetadata() != null) {
            injectableDeclaration.setInjectableMetadata(visitInjectableMetadata(ctx.injectableMetadata()));
        }

        return injectableDeclaration;
    }

    @Override
    public InjectableMetadata visitInjectableMetadata(AngularParser.InjectableMetadataContext ctx) {
        InjectableMetadata injectableMetadata = new InjectableMetadata();

        List<InjectableMetadataProperty> injectableMetadataPropertyList = new ArrayList<>();
        for (AngularParser.InjectableMetadataPropertyContext injectableMetadataPropertyContext : ctx.injectableMetadataProperty()) {
            injectableMetadataPropertyList.add(visitInjectableMetadataProperty(injectableMetadataPropertyContext));
        }
        injectableMetadata.setInjectableMetadataPropertyList(injectableMetadataPropertyList);

        return injectableMetadata;
    }

    @Override
    public InjectableMetadataProperty visitInjectableMetadataProperty(AngularParser.InjectableMetadataPropertyContext ctx) {
        InjectableMetadataProperty injectableMetadataProperty = new InjectableMetadataProperty();

        injectableMetadataProperty.setName(ctx.IDENTIFIER().getText());
        injectableMetadataProperty.setExpression((Expression) visit(ctx.expression()));

        return injectableMetadataProperty;
    }

    /* =================== Class, Interface, and Enum Declarations ==================== */

    @Override
    public ClassDeclaration visitClassDeclaration(AngularParser.ClassDeclarationContext ctx) {
        ClassDeclaration classDeclaration = new ClassDeclaration();

        if (ctx.EXPORT() != null) {
            classDeclaration.setExported(true);
        }

        classDeclaration.setName(ctx.IDENTIFIER(0).getText());

        if (ctx.EXTENDS() != null) {
            List<String> parentClasses = ctx.IDENTIFIER()
                    .subList(1, ctx.IDENTIFIER().size()) // Get the relevant sublist
                    .stream()
                    .map(TerminalNode::getText)          // Convert TerminalNode to String
                    .toList();                           // Collect as a list

            classDeclaration.setExtendsList(parentClasses);
        }

        if (ctx.IMPLEMENTS() != null) {
            int startIdx = ctx.EXTENDS() != null ? ctx.IDENTIFIER().size() : 1;
            List<String> interfaces = ctx.IDENTIFIER()
                    .subList(startIdx, ctx.IDENTIFIER().size())
                    .stream()
                    .map(TerminalNode::getText)
                    .toList();

            classDeclaration.setImplementsList(interfaces);
        }

        classDeclaration.setClassBody(visitClassBody(ctx.classBody()));

        return classDeclaration;
    }

    @Override
    public ClassBody visitClassBody(AngularParser.ClassBodyContext ctx) {
        ClassBody classBody = new ClassBody();

        List<PropertyDeclaration> propertyDeclarationList = new ArrayList<>();
        for (AngularParser.PropertyDeclarationContext propertyDeclarationContext : ctx.propertyDeclaration()) {
            propertyDeclarationList.add(visitPropertyDeclaration(propertyDeclarationContext));
        }
        classBody.setPropertyDeclarationList(propertyDeclarationList);


        if (ctx.constructorDeclaration() != null) {
            classBody.setConstructorDeclaration(visitConstructorDeclaration(ctx.constructorDeclaration()));
        }


        List<MethodDeclaration> methodDeclarationList = new ArrayList<>();
        for (AngularParser.MethodDeclarationContext methodDeclarationContext : ctx.methodDeclaration()) {
            methodDeclarationList.add(visitMethodDeclaration(methodDeclarationContext));
        }
        classBody.setMethodDeclarationList(methodDeclarationList);


        List<VariableDeclaration> variableDeclarationList = new ArrayList<>();
        for (AngularParser.VariableDeclarationContext variableDeclarationContext : ctx.variableDeclaration()) {
            variableDeclarationList.add(visitVariableDeclaration(variableDeclarationContext));
        }
        classBody.setVariableDeclarationList(variableDeclarationList);


        List<FunctionDeclaration> functionDeclarationList = new ArrayList<>();
        for (AngularParser.FunctionDeclarationContext functionDeclarationContext : ctx.functionDeclaration()) {
            functionDeclarationList.add((FunctionDeclaration) visit(functionDeclarationContext));
        }
        classBody.setFunctionDeclarationList(functionDeclarationList);

        List<Statement> statementList = new ArrayList<>();
        for (AngularParser.StatementContext statementContext : ctx.statement()) {
            statementList.add((Statement) visit(statementContext));
        }
        classBody.setStatementList(statementList);

        return classBody;
    }

    @Override
    public PropertyDeclaration visitPropertyDeclaration(AngularParser.PropertyDeclarationContext ctx) {
        PropertyDeclaration propertyDeclaration = new PropertyDeclaration();

        List<Decorator> decoratorList = new ArrayList<>();
        for (AngularParser.DecoratorContext decoratorContext : ctx.decorator()) {
            decoratorList.add(visitDecorator(decoratorContext));
        }
        propertyDeclaration.setDecoratorList(decoratorList);


        if (ctx.accessModifier() != null) {
            propertyDeclaration.setAccessModifier(visitAccessModifier(ctx.accessModifier()));
        }

        // set Name
        propertyDeclaration.setName(ctx.IDENTIFIER().getText());


        if (ctx.typeAnnotation() != null) {
            propertyDeclaration.setTypeAnnotation((TypeAnnotation) visit(ctx.typeAnnotation()));
        }

        if (ctx.initialization() != null) {
            propertyDeclaration.setInitialization(visitInitialization(ctx.initialization()));
        }

        return propertyDeclaration;
    }

    @Override
    public MethodDeclaration visitMethodDeclaration(AngularParser.MethodDeclarationContext ctx) {
        MethodDeclaration methodDeclaration = new MethodDeclaration();

        List<Decorator> decoratorList = new ArrayList<>();
        for (AngularParser.DecoratorContext decoratorContext : ctx.decorator()) {
            decoratorList.add(visitDecorator(decoratorContext));
        }
        methodDeclaration.setDecoratorList(decoratorList);

        // set Name
        methodDeclaration.setName(ctx.IDENTIFIER().getText());


        if (ctx.parameterList() != null) {
            methodDeclaration.setParameterList(visitParameterList(ctx.parameterList()));
        }

        if (ctx.typeAnnotation() != null) {
            methodDeclaration.setTypeAnnotation((TypeAnnotation) visit(ctx.typeAnnotation()));
        }

        // set Block
        methodDeclaration.setBlock(visitBlock(ctx.block()));

        return methodDeclaration;
    }

    @Override
    public ConstructorDeclaration visitConstructorDeclaration(AngularParser.ConstructorDeclarationContext ctx) {
        ConstructorDeclaration constructorDeclaration = new ConstructorDeclaration();

        if (ctx.parameterList() != null) {
            constructorDeclaration.setParameterList(visitParameterList(ctx.parameterList()));
        }

        constructorDeclaration.setConstructorBody(visitConstructorBody(ctx.constructorBody()));

        return constructorDeclaration;
    }

    @Override
    public ConstructorBody visitConstructorBody(AngularParser.ConstructorBodyContext ctx) {
        ConstructorBody constructorBody = new ConstructorBody();

        List<Statement> statementList = new ArrayList<>();
        for (AngularParser.StatementContext statementContext : ctx.statement()) {
            statementList.add((Statement) visit(statementContext));
        }
        constructorBody.setStatementList(statementList);

        return constructorBody;
    }

    @Override
    public Object visitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx) {
        InterfaceDeclaration interfaceDeclaration = new InterfaceDeclaration();

        if (ctx.EXPORT() != null) {
            interfaceDeclaration.setExported(true);
        }

        // set Name
        interfaceDeclaration.setName(ctx.IDENTIFIER().toString());

        if (ctx.EXTENDS() != null) {
            List<String> parentClasses = ctx.IDENTIFIER()
                    .subList(1, ctx.IDENTIFIER().size()) // Get the relevant sublist
                    .stream()
                    .map(TerminalNode::getText)          // Convert TerminalNode to String
                    .toList();                           // Collect as a list

            interfaceDeclaration.setExtendsList(parentClasses);
        }

        // set Body
        interfaceDeclaration.setInterfaceBody(visitInterfaceBody(ctx.interfaceBody()));

        return interfaceDeclaration;
    }

    @Override
    public InterfaceBody visitInterfaceBody(AngularParser.InterfaceBodyContext ctx) {
        InterfaceBody interfaceBody = new InterfaceBody();

        List<InterfaceProperty> interfacePropertyList = new ArrayList<>();
        for (AngularParser.InterfacePropertyContext interfacePropertyContext : ctx.interfaceProperty()) {
            interfacePropertyList.add(visitInterfaceProperty(interfacePropertyContext));
        }
        interfaceBody.setInterfacePropertyList(interfacePropertyList);

        return interfaceBody;
    }

    @Override
    public InterfaceProperty visitInterfaceProperty(AngularParser.InterfacePropertyContext ctx) {
        InterfaceProperty interfaceProperty = new InterfaceProperty();

        // set Name
        interfaceProperty.setName(ctx.IDENTIFIER().getText());

        // set TypeAnnotation
        interfaceProperty.setTypeAnnotation((TypeAnnotation) visit(ctx.typeAnnotation()));

        return interfaceProperty;
    }

    @Override
    public Object visitEnumDeclaration(AngularParser.EnumDeclarationContext ctx) {
        EnumDeclaration enumDeclaration = new EnumDeclaration();

        if (ctx.EXPORT() != null) {
            enumDeclaration.setExported(true);
        }

        // set Name
        enumDeclaration.setName(ctx.IDENTIFIER().getText());

        // set Body
        enumDeclaration.setEnumBody(visitEnumBody(ctx.enumBody()));

        return enumDeclaration;
    }

    @Override
    public EnumBody visitEnumBody(AngularParser.EnumBodyContext ctx) {
        EnumBody enumBody = new EnumBody();

        List<EnumProperty> enumPropertyList = new ArrayList<>();
        for (AngularParser.EnumPropertyContext enumPropertyContext : ctx.enumProperty()) {
            enumPropertyList.add(visitEnumProperty(enumPropertyContext));
        }
        enumBody.setEnumPropertyList(enumPropertyList);

        return enumBody;
    }

    @Override
    public EnumProperty visitEnumProperty(AngularParser.EnumPropertyContext ctx) {
        EnumProperty enumProperty = new EnumProperty();

        // set Name
        enumProperty.setName(ctx.IDENTIFIER().getText());

        if (ctx.expression() != null) {
            enumProperty.setExpression((Expression) visit(ctx.expression()));
        }

        return enumProperty;
    }

    /* ====================== Statement Rules ====================== */

    @Override
    public Object visitAssignmentSt(AngularParser.AssignmentStContext ctx) {
        return visitAssignment(ctx.assignment());
    }

    @Override
    public Object visitPrintSt(AngularParser.PrintStContext ctx) {
        return visitPrintStatement(ctx.printStatement());
    }

    @Override
    public Object visitReturnSt(AngularParser.ReturnStContext ctx) {
        return visitReturnStatement(ctx.returnStatement());
    }

    @Override
    public Object visitThrowSt(AngularParser.ThrowStContext ctx) {
        return visitThrowStatement(ctx.throwStatement());
    }

    @Override
    public Object visitConditionalSt(AngularParser.ConditionalStContext ctx) {
        return visitConditionalStatement(ctx.conditionalStatement());
    }

    @Override
    public Object visitBootstrapCallSt(AngularParser.BootstrapCallStContext ctx) {
        return visitBootstrapCall(ctx.bootstrapCall());
    }

    @Override
    public Object visitFunctionCallSt(AngularParser.FunctionCallStContext ctx) {
        return visitFunctionCall(ctx.functionCall());
    }

    @Override
    public Object visitExpressionSt(AngularParser.ExpressionStContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Object visitIterationSt(AngularParser.IterationStContext ctx) {
        return visit(ctx.iterationStatement());
    }

    @Override
    public Object visitAssignment(AngularParser.AssignmentContext ctx) {
        Assignment assignment = new Assignment();

        assignment.setMemberAccess((MemberAccess) visit(ctx.memberAccess()));
        assignment.setInitialization(visitInitialization(ctx.initialization()));

        return assignment;
    }

    @Override
    public Object visitPrintStatement(AngularParser.PrintStatementContext ctx) {
        PrintStatement printStatement = new PrintStatement();

        if (ctx.parameterList() != null) {
            printStatement.setParameterList(visitParameterList(ctx.parameterList()));
        }

        return printStatement;
    }

    @Override
    public Object visitReturnStatement(AngularParser.ReturnStatementContext ctx) {
        ReturnStatement returnStatement = new ReturnStatement();

        returnStatement.setExpression((Expression) visit(ctx.expression()));

        return returnStatement;
    }

    @Override
    public Object visitThrowStatement(AngularParser.ThrowStatementContext ctx) {
        ThrowStatement throwStatement = new ThrowStatement();

        throwStatement.setExpression((Expression) visit(ctx.expression()));

        return throwStatement;
    }

    @Override
    public Object visitConditionalStatement(AngularParser.ConditionalStatementContext ctx) {
        ConditionalStatement conditionalStatement = new ConditionalStatement();

        // set if
        conditionalStatement.setIfStatement(visitIfStatement(ctx.ifStatement()));

        // set else-if
        List<ElseIfStatement> elseIfStatementList = new ArrayList<>();
        for (AngularParser.ElseIfStatementContext elseIfStatementContext : ctx.elseIfStatement()) {
            elseIfStatementList.add(visitElseIfStatement(elseIfStatementContext));
        }
        conditionalStatement.setElseIfStatementList(elseIfStatementList);

        // set else
        if (ctx.elseStatement() != null) {
            conditionalStatement.setElseStatement(visitElseStatement(ctx.elseStatement()));
        }

        return conditionalStatement;
    }

    @Override
    public IfStatement visitIfStatement(AngularParser.IfStatementContext ctx) {
        IfStatement ifStatement = new IfStatement();

        ifStatement.setExpression((Expression) visit(ctx.expression()));

        ifStatement.setStatementBody(visitStatementBody(ctx.statementBody()));

        return ifStatement;
    }

    @Override
    public ElseIfStatement visitElseIfStatement(AngularParser.ElseIfStatementContext ctx) {
        ElseIfStatement elseIfStatement = new ElseIfStatement();

        elseIfStatement.setExpression((Expression) visit(ctx.expression()));

        elseIfStatement.setStatementBody(visitStatementBody(ctx.statementBody()));

        return elseIfStatement;
    }

    @Override
    public ElseStatement visitElseStatement(AngularParser.ElseStatementContext ctx) {
        ElseStatement elseStatement = new ElseStatement();

        elseStatement.setStatementBody(visitStatementBody(ctx.statementBody()));

        return elseStatement;
    }

    @Override
    public StatementBody visitStatementBody(AngularParser.StatementBodyContext ctx) {
        StatementBody statementBody = new StatementBody();

        if (ctx.statement() != null) {
            statementBody.setStatement((Statement) visit(ctx.statement()));
        }
        else {
            statementBody.setBlock(visitBlock(ctx.block()));
        }

        return statementBody;
    }

    @Override
    public FunctionCall visitFunctionCall(AngularParser.FunctionCallContext ctx) {
        FunctionCall functionCall = new FunctionCall();

        // set Name
        functionCall.setName(ctx.IDENTIFIER().getText());

        if (ctx.genericType() != null) {
            functionCall.setGenericType(visitGenericType(ctx.genericType()));
        }

        if (ctx.parameterList() != null) {
            functionCall.setParameterList(visitParameterList(ctx.parameterList()));
        }

        return functionCall;
    }

    @Override
    public Object visitBootstrapCall(AngularParser.BootstrapCallContext ctx) {
        BootstrapCall bootstrapCall = new BootstrapCall();

        bootstrapCall.setBootstrapSpecifier(visitBootstrapSpecifier(ctx.bootstrapSpecifier()));

        if (ctx.parameterList() != null) {
            bootstrapCall.setParameterList(visitParameterList(ctx.parameterList()));
        }

        if (ctx.arrowFunction() != null) {
            bootstrapCall.setArrowFunction(visitArrowFunction(ctx.arrowFunction()));
        }

        return bootstrapCall;
    }

    @Override
    public Object visitStandardForLoop(AngularParser.StandardForLoopContext ctx) {
        StandardForLoop standardForLoop = new StandardForLoop();

        if (ctx.variableDeclaration() != null) {
            standardForLoop.setVariableDeclaration(visitVariableDeclaration(ctx.variableDeclaration()));
        }

        if (ctx.expression(0) != null) {
            standardForLoop.setCondition((Expression) visit(ctx.expression(0)));
        }

        if (ctx.expression(1) != null) {
            standardForLoop.setUpdate((Expression) visit(ctx.expression(1)));
        }

        standardForLoop.setStatementBody(visitStatementBody(ctx.statementBody()));

        return standardForLoop;
    }

    @Override
    public Object visitForOfLoop(AngularParser.ForOfLoopContext ctx) {
        ForOfLoop forOfLoop = new ForOfLoop();

        forOfLoop.setStatementBody(visitStatementBody(ctx.statementBody()));

        return forOfLoop;
    }

    @Override
    public Object visitForInLoop(AngularParser.ForInLoopContext ctx) {
        ForInLoop forInLoop = new ForInLoop();

        forInLoop.setStatementBody(visitStatementBody(ctx.statementBody()));

        return forInLoop;
    }

    @Override
    public Object visitWhileLoop(AngularParser.WhileLoopContext ctx) {
        WhileLoop whileLoop = new WhileLoop();

        whileLoop.setCondition((Expression) visit(ctx.expression()));
        whileLoop.setStatementBody(visitStatementBody(ctx.statementBody()));

        return whileLoop;
    }

    @Override
    public Object visitDoWhileLoop(AngularParser.DoWhileLoopContext ctx) {
        DoWhileLoop doWhileLoop = new DoWhileLoop();

        doWhileLoop.setCondition((Expression) visit(ctx.expression()));
        doWhileLoop.setStatementBody(visitStatementBody(ctx.statementBody()));

        return doWhileLoop;
    }

    /* ====================== Parameter Rules ====================== */

    @Override
    public ParameterList visitParameterList(AngularParser.ParameterListContext ctx) {
        ParameterList parameterList = new ParameterList();

        List<Parameter> parameters = new ArrayList<>();
        for (AngularParser.ParameterContext parameterContext : ctx.parameter()) {
            parameters.add(visitParameter(parameterContext));
        }
        parameterList.setParameters(parameters);

        return parameterList;
    }

    @Override
    public Parameter visitParameter(AngularParser.ParameterContext ctx) {
        Parameter parameter = new Parameter();

        parameter.setExpression((Expression) visit(ctx.expression()));

        return parameter;
    }

    @Override
    public ParameterDeclaration visitParameterDeclaration(AngularParser.ParameterDeclarationContext ctx) {
        ParameterDeclaration parameterDeclaration = new ParameterDeclaration();

        List<Decorator> decoratorList = new ArrayList<>();
        for (AngularParser.DecoratorContext decoratorContext : ctx.decorator()) {
            decoratorList.add(visitDecorator(decoratorContext));
        }
        parameterDeclaration.setDecoratorList(decoratorList);


        if (ctx.accessModifier() != null) {
            parameterDeclaration.setAccessModifier(visitAccessModifier(ctx.accessModifier()));
        }

        if (ctx.typeAnnotation() != null) {
            parameterDeclaration.setTypeAnnotation((TypeAnnotation) visit(ctx.typeAnnotation()));
        }

        if (ctx.initialization() != null) {
            parameterDeclaration.setInitialization(visitInitialization(ctx.initialization()));
        }

        return parameterDeclaration;
    }

    /* ====================== Array and Value Rules ====================== */

    @Override
    public Array visitArray(AngularParser.ArrayContext ctx) {
        Array array = new Array();

        List<Expression> expressionList = new ArrayList<>();
        for (AngularParser.ExpressionContext expressionContext : ctx.expression()) {
            expressionList.add((Expression) visit(expressionContext));
        }
        array.setExpressionList(expressionList);

        return array;
    }

    @Override
    public Object visitPrimaryValue(AngularParser.PrimaryValueContext ctx) {
        return visit(ctx.primary());
    }

    @Override
    public Object visitArrayValue(AngularParser.ArrayValueContext ctx) {
        return visitArray(ctx.array());
    }

    @Override
    public Object visitArrayAccessValue(AngularParser.ArrayAccessValueContext ctx) {
        return visitArrayAccess(ctx.arrayAccess());
    }

    @Override
    public Object visitMemberAccessValue(AngularParser.MemberAccessValueContext ctx) {
        return visit(ctx.memberAccess());
    }

    @Override
    public Object visitObjectValue(AngularParser.ObjectValueContext ctx) {
        return visitObject(ctx.object());
    }

    @Override
    public Object visitObjectInstantiationValue(AngularParser.ObjectInstantiationValueContext ctx) {
        return visitObjectInstantiation(ctx.objectInstantiation());
    }

    /* ========================= Object Rules ========================= */

    @Override
    public Object visitObject(AngularParser.ObjectContext ctx) {
        AST.object.Object object = new AST.object.Object();

        if (ctx.attributes() != null) {
            object.setAttributes(visitAttributes(ctx.attributes()));
        }

        return object;
    }

    @Override
    public Attributes visitAttributes(AngularParser.AttributesContext ctx) {
        Attributes attributes = new Attributes();

        List<Attribute> attributeList = new ArrayList<>();
        for (AngularParser.AttributeContext attributeContext : ctx.attribute()) {
            attributeList.add(visitAttribute(attributeContext));
        }
        attributes.setAttributeList(attributeList);

        return attributes;
    }

    @Override
    public Attribute visitAttribute(AngularParser.AttributeContext ctx) {
        Attribute attribute = new Attribute();

        attribute.setName(ctx.IDENTIFIER().getText());

        attribute.setExpression((Expression) visit(ctx.expression()));

        return attribute;
    }

    @Override
    public Object visitObjectInstantiation(AngularParser.ObjectInstantiationContext ctx) {
        ObjectInstantiation objectInstantiation = new ObjectInstantiation();

        objectInstantiation.setName(ctx.IDENTIFIER().getText());

        if (ctx.genericType() != null) {
            objectInstantiation.setGenericType(visitGenericType(ctx.genericType()));
        }

        if (ctx.parameterList() != null) {
            objectInstantiation.setParameterList(visitParameterList(ctx.parameterList()));
        }

        return objectInstantiation;
    }

    /* ======================== Access Rules ======================== */

    @Override
    public Object visitMemberAccessIdentifier(AngularParser.MemberAccessIdentifierContext ctx) {
        MemberAccess memberAccess = new MemberAccess();

        memberAccess.setPrefix(ctx.IDENTIFIER().getText());
        memberAccess.setExpression((Expression) visit(ctx.expression()));

        return memberAccess;
    }

    @Override
    public Object visitMemberAccessThis(AngularParser.MemberAccessThisContext ctx) {
        MemberAccess memberAccess = new MemberAccess();

        memberAccess.setPrefix(ctx.THIS().getText());
        memberAccess.setExpression((Expression) visit(ctx.expression()));

        return memberAccess;
    }

    @Override
    public Object visitArrayAccess(AngularParser.ArrayAccessContext ctx) {
        ArrayAccess arrayAccess = new ArrayAccess();

        arrayAccess.setName(ctx.IDENTIFIER().getText());
        arrayAccess.setExpression((Expression) visit(ctx.expression()));

        return arrayAccess;
    }

    /* ===================== Initialization Rules ===================== */

    @Override
    public Initialization visitInitialization(AngularParser.InitializationContext ctx) {
        Initialization initialization = new Initialization();

        initialization.setExpression((Expression) visit(ctx.expression()));

        return initialization;
    }

    /* ===================== Primary Value Rules ===================== */

    @Override
    public Object visitLiteralPrimary(AngularParser.LiteralPrimaryContext ctx) {
        return visitLiteral(ctx.literal());
    }

    @Override
    public Object visitIdentifierPrimary(AngularParser.IdentifierPrimaryContext ctx) {
        IdentifierPrimary identifierPrimary = new IdentifierPrimary();

        identifierPrimary.setIdentifier(ctx.IDENTIFIER().getText());

        return identifierPrimary;
    }

    @Override
    public Object visitLiteral(AngularParser.LiteralContext ctx) {
        Literal literal = new Literal();

        if (ctx.NUMBER() != null) {
            literal.setType("Number");
            literal.setValue(ctx.NUMBER().getText());
        }
        else if (ctx.STRING() != null) {
            literal.setType("String");
            literal.setValue(ctx.STRING().getText());
        }
        else if (ctx.BOOL() != null) {
            literal.setType("Bool");
            literal.setValue(ctx.BOOL().getText());
        }
        else if (ctx.NULL() != null) {
            literal.setType("Null");
            literal.setValue(ctx.NULL().getText());
        }
        else {
            literal.setType("Template_Literal");
            literal.setValue(ctx.TEMPLATE_LITERAL().getText());
        }

        return literal;
    }

    @Override
    public Object visitParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx) {
        ParenthesizedExpression parenthesizedExpression = new ParenthesizedExpression();

        parenthesizedExpression.setExpression((Expression) visit(ctx.expression()));

        return parenthesizedExpression;
    }

    @Override
    public Object visitAdditiveExpression(AngularParser.AdditiveExpressionContext ctx) {
        AdditiveExpression additiveExpression = new AdditiveExpression();

        additiveExpression.setLeft((Expression) visit(ctx.expression(0)));
        additiveExpression.setRight((Expression) visit(ctx.expression(1)));

        if (ctx.PLUS() != null) {
            additiveExpression.setOperator(ctx.PLUS().getText());
        }
        else {
            additiveExpression.setOperator(ctx.MINUS().getText());
        }

        return additiveExpression;
    }

    @Override
    public Object visitRelationalExpression(AngularParser.RelationalExpressionContext ctx) {
        RelationalExpression relationalExpression = new RelationalExpression();

        relationalExpression.setLeftExpression((Expression) visit(ctx.expression(0)));
        relationalExpression.setRightExpression((Expression) visit(ctx.expression(1)));

        if (ctx.LT() != null) {
            relationalExpression.setOperator(ctx.LT().getText());
        }
        else if (ctx.GT() != null) {
            relationalExpression.setOperator(ctx.GT().getText());
        }
        else if (ctx.LTE() != null) {
            relationalExpression.setOperator(ctx.LTE().getText());
        }
        else {
            relationalExpression.setOperator(ctx.GTE().getText());
        }

        return relationalExpression;
    }

    @Override
    public Object visitTernaryExpression(AngularParser.TernaryExpressionContext ctx) {
        TernaryExpression ternaryExpression = new TernaryExpression();

        ternaryExpression.setCondition((Expression) visit(ctx.expression(0)));
        ternaryExpression.setTrueExpression((Expression) visit(ctx.expression(1)));
        ternaryExpression.setFalseExpression((Expression) visit(ctx.expression(2)));

        return ternaryExpression;
    }

    @Override
    public Object visitPostIncrementExpression(AngularParser.PostIncrementExpressionContext ctx) {
        PostIncrementExpression postIncrementExpression = new PostIncrementExpression();

        postIncrementExpression.setExpression((Expression) visit(ctx.expression()));

        return postIncrementExpression;
    }

    @Override
    public Object visitLogicalAndExpression(AngularParser.LogicalAndExpressionContext ctx) {
        LogicalAndExpression logicalAndExpression = new LogicalAndExpression();

        logicalAndExpression.setLeftExpression((Expression) visit(ctx.expression(0)));
        logicalAndExpression.setRightExpression((Expression) visit(ctx.expression(1)));

        return logicalAndExpression;
    }

    @Override
    public Object visitPreIncrementExpression(AngularParser.PreIncrementExpressionContext ctx) {
        PreIncrementExpression preIncrementExpression = new PreIncrementExpression();

        preIncrementExpression.setExpression((Expression) visit(ctx.expression()));

        return preIncrementExpression;
    }

    @Override
    public Object visitLogicalOrExpression(AngularParser.LogicalOrExpressionContext ctx) {
        LogicalOrExpression logicalOrExpression = new LogicalOrExpression();

        logicalOrExpression.setLeftExpression((Expression) visit(ctx.expression(0)));
        logicalOrExpression.setRightExpression((Expression) visit(ctx.expression(1)));

        return logicalOrExpression;
    }

    @Override
    public Object visitNotExpression(AngularParser.NotExpressionContext ctx) {
        NotExpression notExpression = new NotExpression();

        notExpression.setExpression((Expression) visit(ctx.expression()));

        return notExpression;
    }

    @Override
    public Object visitPreDecreaseExpression(AngularParser.PreDecreaseExpressionContext ctx) {
        PreDecreaseExpression preDecreaseExpression = new PreDecreaseExpression();

        preDecreaseExpression.setExpression((Expression) visit(ctx.expression()));

        return preDecreaseExpression;
    }

    @Override
    public Object visitFunctionCallExpression(AngularParser.FunctionCallExpressionContext ctx) {
        FunctionCallExpression functionCallExpression = new FunctionCallExpression();

        functionCallExpression.setFunctionCall(visitFunctionCall(ctx.functionCall()));

        return functionCallExpression;
    }

    @Override
    public Object visitPostDecreaseExpression(AngularParser.PostDecreaseExpressionContext ctx) {
        PostDecreaseExpression postDecreaseExpression = new PostDecreaseExpression();

        postDecreaseExpression.setExpression((Expression) visit(ctx.expression()));

        return postDecreaseExpression;
    }

    @Override
    public Object visitEqualityExpression(AngularParser.EqualityExpressionContext ctx) {
        EqualityExpression equalityExpression = new EqualityExpression();

        equalityExpression.setLeftExpression((Expression) visit(ctx.expression(0)));
        equalityExpression.setRightExpression((Expression) visit(ctx.expression(1)));

        if (ctx.EQ() != null) {
            equalityExpression.setOperator(ctx.EQ().getText());
        }
        else if (ctx.NEQ() != null) {
            equalityExpression.setOperator(ctx.NEQ().getText());
        }
        else if (ctx.STRICT_EQ() != null) {
            equalityExpression.setOperator(ctx.STRICT_EQ().getText());
        }
        else if (ctx.STRICT_NEQ() != null) {
            equalityExpression.setOperator(ctx.STRICT_NEQ().getText());
        }
        else {
            equalityExpression.setOperator(ctx.ASSIGN().getText());
        }

        return equalityExpression;
    }

    @Override
    public Object visitMultiplicativeExpression(AngularParser.MultiplicativeExpressionContext ctx) {
        MultiplicativeExpression multiplicativeExpression = new MultiplicativeExpression();

        multiplicativeExpression.setLeft((Expression) visit(ctx.expression(0)));
        multiplicativeExpression.setRight((Expression) visit(ctx.expression(1)));

        if (ctx.MULT() != null) {
            multiplicativeExpression.setOperator(ctx.MULT().getText());
        }
        else if (ctx.DIV() != null) {
            multiplicativeExpression.setOperator(ctx.DIV().getText());
        }
        else {
            multiplicativeExpression.setOperator(ctx.MOD().getText());
        }

        return multiplicativeExpression;
    }

    @Override
    public Object visitMemberAccessExpression(AngularParser.MemberAccessExpressionContext ctx) {
        MemberAccessExpression memberAccessExpression = new MemberAccessExpression();

        memberAccessExpression.setExpression((Expression) visit(ctx.expression()));

        return memberAccessExpression;
    }

    @Override
    public Object visitFunctionExpression(AngularParser.FunctionExpressionContext ctx) {
        FunctionExpression functionExpression = new FunctionExpression();

        functionExpression.setFunctionDeclaration((FunctionDeclaration) visit(ctx.functionDeclaration()));

        return functionExpression;
    }

    @Override
    public Object visitValueExpression(AngularParser.ValueExpressionContext ctx) {
        ValueExpression valueExpression = new ValueExpression();

        valueExpression.setValue((Value) visit(ctx.value()));

        return valueExpression;
    }

    @Override
    public Object visitParameterExpression(AngularParser.ParameterExpressionContext ctx) {
        ParameterExpression parameterExpression = new ParameterExpression();

        parameterExpression.setParameterDeclaration(visitParameterDeclaration(ctx.parameterDeclaration()));

        return parameterExpression;
    }

    /* ==================== Type Annotation Rules ==================== */

    @Override
    public GenericType visitGenericType(AngularParser.GenericTypeContext ctx) {
        GenericType genericType = new GenericType();

        List<TypeAnnotation> typeAnnotationList = new ArrayList<>();
        for (AngularParser.TypeAnnotationContext typeAnnotationContext : ctx.typeAnnotation()) {
            typeAnnotationList.add((TypeAnnotation) visit(typeAnnotationContext));
        }
        genericType.setTypeAnnotationList(typeAnnotationList);

        return genericType;
    }

    @Override
    public Object visitGenericTypeAnnotation(AngularParser.GenericTypeAnnotationContext ctx) {
        GenericTypeAnnotation genericTypeAnnotation = new GenericTypeAnnotation();

        genericTypeAnnotation.setName(ctx.IDENTIFIER().getText());
        genericTypeAnnotation.setGenericType(visitGenericType(ctx.genericType()));

        return genericTypeAnnotation;
    }

    @Override
    public Object visitPipeTypeAnnotation(AngularParser.PipeTypeAnnotationContext ctx) {
        PipeTypeAnnotation pipeTypeAnnotation = new PipeTypeAnnotation();

        List<String> unionTypes = ctx.children.stream()
                .filter(child -> child instanceof TerminalNode &&
                        (child.getText().matches("[a-zA-Z][a-zA-Z0-9_-]+") || child.getText().equals("null")))
                .map(ParseTree::getText)
                .toList();

        pipeTypeAnnotation.setTypeAnnotations(unionTypes);

        return pipeTypeAnnotation;
    }

    @Override
    public Object visitArrayTypeAnnotation(AngularParser.ArrayTypeAnnotationContext ctx) {
        ArrayTypeAnnotation arrayTypeAnnotation = new ArrayTypeAnnotation();

        List<String> unionTypes = ctx.children.stream()
                .filter(child -> child instanceof TerminalNode &&
                        (child.getText().matches("[a-zA-Z][a-zA-Z0-9_-]+") || child.getText().equals("null")))
                .map(ParseTree::getText)
                .toList();

        arrayTypeAnnotation.setTypeAnnotations(unionTypes);

        return arrayTypeAnnotation;
    }

    @Override
    public Object visitTupleTypeAnnotation(AngularParser.TupleTypeAnnotationContext ctx) {
        TupleTypeAnnotation tupleTypeAnnotation = new TupleTypeAnnotation();

        tupleTypeAnnotation.setArray(visitArray(ctx.array()));

        return tupleTypeAnnotation;
    }

    /* ===================== Access Modifier Rules ===================== */

    @Override
    public AccessModifier visitAccessModifier(AngularParser.AccessModifierContext ctx) {
        AccessModifier accessModifier = new AccessModifier();

        if (ctx.PUBLIC() != null) {
            accessModifier.setName(ctx.PUBLIC().getText());
        }
        else if (ctx.PRIVATE() != null) {
            accessModifier.setName(ctx.PRIVATE().getText());
        }
        else {
            accessModifier.setName(ctx.PROTECTED().getText());
        }

        return accessModifier;
    }

    /* ====================== Html Template Rules ====================== */

    @Override
    public HTMLTemplate visitHtmlTemplate(AngularParser.HtmlTemplateContext ctx) {
        HTMLTemplate htmlTemplate = new HTMLTemplate();

        List<Element> elementList = new ArrayList<>();
        for (AngularParser.ElementContext elementContext : ctx.element()) {
            elementList.add((Element) visit(elementContext));
        }
        htmlTemplate.setElementList(elementList);

        return htmlTemplate;
    }

    @Override
    public Object visitStandardTagEl(AngularParser.StandardTagElContext ctx) {
        StandardTagElement standardTagElement = new StandardTagElement();

        standardTagElement.setOpenTag(visitOpenTag(ctx.openTag()));

        List<Content> contentList = new ArrayList<>();
        for (AngularParser.ContentContext contentContext : ctx.content()) {
            contentList.add((Content) visit(contentContext));
        }
        standardTagElement.setContentList(contentList);

        standardTagElement.setCloseTag(visitCloseTag(ctx.closeTag()));

        return standardTagElement;
    }

    @Override
    public Object visitSelfClosingTagEl(AngularParser.SelfClosingTagElContext ctx) {
        return visitSelfClosingTag(ctx.selfClosingTag());
    }

    @Override
    public Object visitInterpolationEl(AngularParser.InterpolationElContext ctx) {
        return visitInterpolation(ctx.interpolation());
    }

    @Override
    public OpenTag visitOpenTag(AngularParser.OpenTagContext ctx) {
        OpenTag openTag = new OpenTag();

        openTag.setTagName(visitTagName(ctx.tagName()));

        List<AttributeHTML> attributeHTMLList = new ArrayList<>();
        for (AngularParser.AttributeHTMLContext attributeHTMLContext : ctx.attributeHTML()) {
            attributeHTMLList.add((AttributeHTML) visit(attributeHTMLContext));
        }
        openTag.setAttributeHtmlList(attributeHTMLList);

        return openTag;
    }

    @Override
    public CloseTag visitCloseTag(AngularParser.CloseTagContext ctx) {
        CloseTag closeTag = new CloseTag();

        closeTag.setTagName(visitTagName(ctx.tagName()));

        return closeTag;
    }

    @Override
    public Object visitSelfClosingTag(AngularParser.SelfClosingTagContext ctx) {
        SelfClosingTag selfClosingTag = new SelfClosingTag();

        selfClosingTag.setTagName(visitTagName(ctx.tagName()));

        List<AttributeHTML> attributeHTMLList = new ArrayList<>();
        for (AngularParser.AttributeHTMLContext attributeHTMLContext : ctx.attributeHTML()) {
            attributeHTMLList.add((AttributeHTML) visit(attributeHTMLContext));
        }
        selfClosingTag.setAttributeHtmlList(attributeHTMLList);

        return selfClosingTag;
    }

    @Override
    public Object visitNestedElementContent(AngularParser.NestedElementContentContext ctx) {
        return visit(ctx.element());
    }

    @Override
    public Object visitPlainTextContent(AngularParser.PlainTextContentContext ctx) {
        PlainTextContent plainTextContent = new PlainTextContent();

        plainTextContent.setText(ctx.ATTRIBUTE().getText());

        return plainTextContent;
    }

    @Override
    public Object visitStandardAttribute(AngularParser.StandardAttributeContext ctx) {
        StandardAttribute standardAttribute = new StandardAttribute();

        standardAttribute.setAttribute(ctx.ATTRIBUTE().getText());
        standardAttribute.setValue(ctx.STRING_HTML().getText());

        return standardAttribute;
    }

    @Override
    public Object visitPropertyBinding(AngularParser.PropertyBindingContext ctx) {
        PropertyBinding propertyBinding = new PropertyBinding();

        propertyBinding.setBinding(ctx.BINDING().getText());
        propertyBinding.setValue(ctx.STRING_HTML().getText());

        return propertyBinding;
    }

    @Override
    public Object visitEventBinding(AngularParser.EventBindingContext ctx) {
        EventBinding eventBinding = new EventBinding();

        eventBinding.setEvent(ctx.EVENT().getText());
        eventBinding.setValue(ctx.STRING_HTML().getText());

        return eventBinding;
    }

    @Override
    public Object visitTwoWayBinding(AngularParser.TwoWayBindingContext ctx) {
        TwoWayBinding twoWayBinding = new TwoWayBinding();

        twoWayBinding.setTwoBind(ctx.TWOBIND().getText());
        twoWayBinding.setValue(ctx.STRING_HTML().getText());

        return twoWayBinding;
    }

    @Override
    public Object visitStructuralDirectiveAttr(AngularParser.StructuralDirectiveAttrContext ctx) {
        StructuralDirectiveAttr structuralDirectiveAttr = new StructuralDirectiveAttr();

        structuralDirectiveAttr.setStructuralDirective(visitStructuralDirective(ctx.structuralDirective()));
        structuralDirectiveAttr.setValue(ctx.STRING_HTML().getText());

        return structuralDirectiveAttr;
    }

    @Override
    public Object visitTemplateReferenceVariable(AngularParser.TemplateReferenceVariableContext ctx) {
        TemplateReferenceVariable templateReferenceVariable = new TemplateReferenceVariable();

        templateReferenceVariable.setReferenceVar(ctx.REFERENCE_VAR().getText());
        templateReferenceVariable.setValue(ctx.STRING_HTML().getText());

        return templateReferenceVariable;
    }

    @Override
    public Object visitAttributeOnly(AngularParser.AttributeOnlyContext ctx) {
        AttributeOnly attributeOnly = new AttributeOnly();

        attributeOnly.setWord(ctx.ATTRIBUTE().getText());

        return attributeOnly;
    }

    @Override
    public Object visitInterpolation(AngularParser.InterpolationContext ctx) {
        Interpolation interpolation = new Interpolation();

        List<InterpolationElement> interpolationElementList = new ArrayList<>();
        for (AngularParser.InterpolationElementContext interpolationElementContext : ctx.interpolationElement()) {
            interpolationElementList.add(visitInterpolationElement(interpolationElementContext));
        }
        interpolation.setInterplationElementList(interpolationElementList);

        return interpolation;
    }

    @Override
    public InterpolationElement visitInterpolationElement(AngularParser.InterpolationElementContext ctx) {
        InterpolationElement interpolationElement = new InterpolationElement();

        interpolationElement.setAttribute(ctx.ATTRIBUTE(0).getText());

        if (ctx.ATTRIBUTE(1) != null) {
            interpolationElement.setValue(ctx.ATTRIBUTE(1).getText());
        }
        else if (ctx.STRING_HTML() != null) {
            interpolationElement.setValue(ctx.STRING_HTML().getText());
        }

        return interpolationElement;
    }

    @Override
    public TagName visitTagName(AngularParser.TagNameContext ctx) {
        TagName tagName = new TagName();

        tagName.setAttribute(ctx.ATTRIBUTE().getText());

        return tagName;
    }

    @Override
    public StructuralDirective visitStructuralDirective(AngularParser.StructuralDirectiveContext ctx) {
        StructuralDirective structuralDirective = new StructuralDirective();

        if (ctx.NGFOR() != null) {
            structuralDirective.setName(ctx.NGFOR().getText());
        }
        else if (ctx.NGIF() != null) {
            structuralDirective.setName(ctx.NGIF().getText());
        }
        else {
            structuralDirective.setName(ctx.DDIRECTIVE().getText());
        }

        return structuralDirective;
    }
}
