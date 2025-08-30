parser grammar AngularParser;

options { tokenVocab = AngularLexer; }

/* ================= Entry Point ================= */
program
    : importStatement* (declaration | statement)*             // The program starts with optional import statements,
                                                              // followed by a series of declarations or statements.
    ;

/* ================= Import Statements ================= */
importStatement
    : IMPORT importDeclaration FROM STRING SEMI              // Represents an import statement with the 'from' clause
                                                              // specifying the source module.
    ;

importDeclaration
    : importDefaultSpecifier        # DefaultSpecifierDeclaration     // Default import (e.g., `import identifier from 'module';`).
    | importNamespaceSpecifier      # NamespaceSpecifierDeclaration   // Namespace import (e.g., `import * as ns from 'module';`).
    | importNamedSpecifier          # NamedSpecifierDeclaration       // Named import (e.g., `import { name1, name2 } from 'module';`).
    ;

/* Default Import */
importDefaultSpecifier
    : IDENTIFIER                                                // A single identifier as the default import.
    ;

/* Namespace Import */
importNamespaceSpecifier
    : MULT AS IDENTIFIER                                        // Imports everything under a namespace alias
                                                                // (e.g., `* as ns`).
    ;

/* Named Import */
importNamedSpecifier
    : (importSpecifier COMMA)* LBRACE                           // Optional leading specifiers followed by named imports
        (importSpecifier (COMMA importSpecifier)* COMMA?)?      // enclosed in braces, supporting multiple imports.
      RBRACE
    ;

/* Import Specifiers */
importSpecifier
    : (IDENTIFIER | ROUTE_CONFIG)       # IdentifierImportSpecifier        // Imports by an identifier.
    | bootstrapSpecifier                # BootstrapImportSpecifier         // Special bootstrap-related imports.
    ;

/* Bootstrap Specifiers */
bootstrapSpecifier
    : PLATFORM_BROWSER_DYNAMIC                                    // Represents platform-specific imports.
    | BOOTSTRAP_MODULE
    | BOOTSTRAP_APPLICATION
    ;



/* ================= Declarations ================= */
declaration
    : ngModuleDeclaration       # NgModuleDecl                 // Represents an Angular NgModule declaration.
    | componentDeclaration      # ComponentDecl                // Represents an Angular Component declaration.
    | pipeDeclaration           # PipeDecl                     // Represents an Angular Pipe declaration.
    | injectableDeclaration     # InjectableDecl               // Represents an Angular Injectable declaration.
    | directiveDeclaration      # DirectiveDecl                // Represents an Angular Directive declaration.
    | interfaceDeclaration      # InterfaceDecl                // Represents an Interface declaration.
    | classDeclaration          # ClassDecl                    // Represents a Class declaration.
    | enumDeclaration           # EnumDecl                     // Represents an Enum declaration.
    | variableDeclaration       # VariableDecl                 // Represents a Variable declaration.
    | functionDeclaration       # FunctionDecl                 // Represents a Function declaration.
    | routingDeclaration        # RoutingDecl
    ;

/* ================= Variable Declarations ================= */
variableDeclaration
    : varHelper IDENTIFIER
      (COLON typeAnnotation)?                                  // Optional type annotation for the variable.
      (ASSIGN initialization)?                                // Optional initialization for the variable.
      SEMI?                                                    // Optional Semicolon to terminate the declaration.
    ;

/* Var Helper */
varHelper
    : LET
    | CONST
    ;

/* ================= Function Declarations ================= */
functionDeclaration
    : normalFunction        # NormalFunctionDeclaration        // Represents a standard function declaration.
    | anonymousFunction     # AnonymousFunctionDeclaration     // Represents an anonymous function declaration.
    | arrowFunction         # ArrowFunctionDeclaration         // Represents an arrow function declaration.
    ;

/* Normal Function */
normalFunction
    : FUNCTION IDENTIFIER
      LPAREN parameterList? RPAREN                            // Function parameters, optionally defined.
      (COLON typeAnnotation)?                                 // Optional return type annotation.
      LBRACE block RBRACE                                     // Function body enclosed in braces.
    ;

/* Anonymous Function */
anonymousFunction
    : FUNCTION
      LPAREN parameterList? RPAREN                            // Function parameters, optionally defined.
      (COLON typeAnnotation)?                                 // Optional return type annotation.
      LBRACE block RBRACE                                     // Function body enclosed in braces.
    ;

/* Arrow Function */
arrowFunction
    : ((LPAREN parameterList? RPAREN) | IDENTIFIER)           // Function parameters, optionally defined, or a single parameter as an identifier.
      (COLON typeAnnotation)?                                 // Optional return type annotation.
      ARROW (statement | block)                               // Function body as a single statement or block.
    ;

/* Block */
block
    : LBRACE (statement | variableDeclaration)* RBRACE        // A sequence of statements or variable declarations enclosed in braces.
    ;


/* ================= Angular Declarations ================= */

/* NgModule Declaration */
ngModuleDeclaration
    : MODULE LPAREN
      (LBRACE moduleMetadata? RBRACE)?                  // Optional metadata for the NgModule enclosed in braces.
      RPAREN classDeclaration                           // Class declaration for the NgModule.
    ;

/* NgModule Metadata */
moduleMetadata
    : metadataModuleProperty (COMMA metadataModuleProperty)* COMMA?
                                                       // List of NgModule metadata properties, optionally separated by commas.
    ;

/* NgModule Metadata Property */
metadataModuleProperty
    : BOOTSTRAP COLON array         # BootstrapProperty                 // Defines the bootstrap components of the module.
    | DECLARATIONS COLON array      # DeclarationsModuleProperty        // List of components, directives, and pipes declared in the module.
    | IMPORTS COLON array           # ImportsModuleProperty             // List of imported modules.
    | EXPORTS COLON array           # ExportsModuleProperty             // List of exported components, directives, and pipes.
    | PROVIDERS COLON array         # ProvidersModuleProperty           // List of service providers for the module.
    ;

/* Component Declaration */
componentDeclaration
    : COMPONENT LPAREN
      (LBRACE componentMetadata? RBRACE)?              // Optional metadata for the component enclosed in braces.
      RPAREN classDeclaration                          // Class declaration for the component.
    ;

/* Component Metadata */
componentMetadata
    : metadataComponentProperty (COMMA metadataComponentProperty)* COMMA?
                                                       // List of component metadata properties, optionally separated by commas.
    ;

/* Component Metadata Property */
metadataComponentProperty
    : SELECTOR COLON STRING             # SelectorComponentProperty         // Defines the component's CSS selector.
    | TEMPLATE_URL COLON STRING         # TemplateUrlProperty               // Path to the external HTML template.
    | TEMPLATE COLON htmlTemplate       # TemplateProperty                  // Inline HTML template.
    | STYLE_URLS COLON array            # StyleUrlsProperty                 // Path to external CSS stylesheets.
    | STYLES COLON array                # StylesProperty                    // Inline CSS styles.
    | STANDALONE COLON BOOL             # StandaloneProperty                // Flag indicating if the component is standalone.
    | INPUTS COLON array                # InputsProperty                    // List of input properties for the component.
    | OUTPUTS COLON array               # OutputsProperty                   // List of output events for the component.
    | IMPORTS COLON array               # ImportsComponentProperty          // List of modules or components to import.
    | EXPORTS COLON array               # ExportsComponentProperty          // List of items to export.
    | PROVIDERS COLON array             # ProvidersComponentProperty        // List of service providers for the component.
    | DECLARATIONS COLON array          # DeclarationsComponentProperty     // List of declarations related to the component.
    ;


/* ================= Other Angular Declarations ================= */

/* Directive Declaration */
directiveDeclaration
    : DIRECTIVE LPAREN
      (LBRACE directiveMetadata? RBRACE)?                  // Optional metadata for the directive enclosed in braces.
      RPAREN classDeclaration                              // Class declaration for the directive.
    ;

/* Directive Metadata */
directiveMetadata
    : directiveMetadataProperty (COMMA directiveMetadataProperty)* COMMA?
                                                          // List of directive metadata properties, optionally separated by commas.
    ;

/* Directive Metadata Property */
directiveMetadataProperty
    : SELECTOR COLON STRING         # SelectorDirectiveProperty     // Defines the directive's selector property.
    | IDENTIFIER COLON expression        # IdentifierProperty            // Generic identifier-value pair for directive metadata.

    ;

/* Decprator */
decorator
    : AT IDENTIFIER LPAREN parameterList? RPAREN          // Decorator syntax, including optional parameters.
    ;

/* Pipe Declaration */
pipeDeclaration
    : PIPE LPAREN
      (LBRACE pipeMetadata? RBRACE)?                      // Optional metadata for the pipe enclosed in braces.
      RPAREN classDeclaration                             // Class declaration for the pipe.
    ;

/* Pipe Metadata */
pipeMetadata
    : pipeMetadataProperty (COMMA pipeMetadataProperty)* COMMA?
                                                          // List of pipe metadata properties, optionally separated by commas.
    ;

/* Pipe Metadata Property */
pipeMetadataProperty
    : IDENTIFIER COLON expression                              // Generic identifier-value pair for pipe metadata.
    ;

/* Injectable Declaration */
injectableDeclaration
    : INJECTABLE LPAREN
      (LBRACE injectableMetadata? RBRACE)?                // Optional metadata for the injectable enclosed in braces.
      RPAREN classDeclaration                             // Class declaration for the injectable.
    ;

/* Injectable Metadata */
injectableMetadata
    : injectableMetadataProperty (COMMA injectableMetadataProperty)* COMMA?
                                                          // List of injectable metadata properties, optionally separated by commas.
    ;

/* Injectable Metadata Property */
injectableMetadataProperty
    : IDENTIFIER COLON expression                              // Generic identifier-value pair for injectable metadata.
    ;


/* ================= Class, Interface, and Enum Declarations ================= */

/* Class Declaration */
classDeclaration
    : EXPORT? CLASS IDENTIFIER
      (EXTENDS IDENTIFIER (COMMA IDENTIFIER)*)?               // Optional inheritance from one or more classes.
      (IMPLEMENTS IDENTIFIER (COMMA IDENTIFIER)*)?            // Optional implementation of one or more interfaces.
      LBRACE classBody RBRACE                                 // Class body enclosed in braces.
    ;

/* Class Body */
classBody
    : propertyDeclaration*                                   // Class properties, including fields and access modifiers.
      constructorDeclaration?                                // Optional constructor declaration.
      (methodDeclaration | statement | variableDeclaration | functionDeclaration)*
                                                             // Methods, statements, variable declarations, or functions.
    ;

/* Property Declaration */
propertyDeclaration
    : decorator*                                             // Optional decorators for metadata or annotations.
      accessModifier?                                        // Optional access modifier (e.g., `public`, `private`, `protected`).
      IDENTIFIER                                             // Property name.
      (QUES? COLON typeAnnotation)?                          // Optional type annotation, possibly nullable.
      (ASSIGN initialization)?                               // Optional initialization.
      SEMI                                                   // End of the property declaration.
    ;

/* Method Declaration */
methodDeclaration
    : decorator*                                             // Optional decorators for the method.
      accessModifier?
      IDENTIFIER LPAREN parameterList? RPAREN                // Method name and optional parameter list.
      (COLON typeAnnotation)?                                // Optional return type annotation.
      block                                    // Method body enclosed in braces.
    ;

/* Constructor Declaration */
constructorDeclaration
    : CONSTRUCTOR LPAREN parameterList? RPAREN               // Constructor with optional parameters.
      LBRACE constructorBody RBRACE                          // Constructor body enclosed in braces.
    ;

/* Constructor Body */
constructorBody
    : (statement)*                                           // Zero or more statements in the constructor body.
    ;

/* Interface Declaration */
interfaceDeclaration
    : EXPORT? INTERFACE IDENTIFIER
      (EXTENDS IDENTIFIER (COMMA IDENTIFIER)*)?              // Optional inheritance from one or more interfaces.
      LBRACE interfaceBody RBRACE                            // Interface body enclosed in braces.
    ;

/* Interface Body */
interfaceBody
    : interfaceProperty*                                     // Properties defined in the interface.
    ;

/* Interface Property */
interfaceProperty
    : IDENTIFIER                                             // Property name.
      QUES? COLON typeAnnotation SEMI                        // Optional nullable type annotation.
    ;

/* Enum Declaration */
enumDeclaration
    : EXPORT? ENUM IDENTIFIER
      LBRACE enumBody RBRACE                                 // Enum body enclosed in braces.
    ;

/* Enum Body */
enumBody
    : enumProperty (COMMA enumProperty)* COMMA?              // Enum properties, optionally separated by commas.
    ;

/* Enum Property */
enumProperty
    : IDENTIFIER                                             // Enum property name.
      (ASSIGN expression)?                                        // Optional value assignment.
    ;


/* ====================== Statement Rules ====================== */
statement
    : assignment                # AssignmentSt                // A variable assignment statement (e.g., `x = 5` or `obj.prop = value`).
    | printStatement            # PrintSt                     // A console log statement (e.g., `console.log("message")`).
    | returnStatement           # ReturnSt                    // A return statement from a function (e.g., `return value;`).
    | throwStatement            # ThrowSt                     // A throw statement to raise an exception (e.g., `throw new Error("message");`).
    | conditionalStatement      # ConditionalSt               // A conditional statement (e.g., `if`, `else if`, `else`).
    | iterationStatement        # IterationSt                 // A iteration statement (e.g. 'for loop', 'while loop', 'do while loop').
    | bootstrapCall             # BootstrapCallSt             // A bootstrap function call with optional error handling (e.g., `fetch().catch(error => { ... })`).
    | functionCall              # FunctionCallSt              // A function call (e.g., `myFunction(arg1, arg2)`).
    | expression SEMI?          # ExpressionSt                // A generic expression statement.
    ;

/* Assignment */
assignment
    : memberAccess ASSIGN initialization SEMI                      // Assign a value or initialization to a member (e.g., `obj.prop = value;`).
    ;

/* Print Statement */
printStatement
    : CONSOLE DOT (LOG | ERROR) LPAREN parameterList? RPAREN SEMI?       // Log a message to the console (e.g., `console.log("Hello, World!");`).
    ;

/* Return Statement */
returnStatement
    : RETURN expression? SEMI                       // Return a value or expression from a function (e.g., `return x + y;`).
    ;

/* Throw Statement */
throwStatement
    : THROW expression SEMI                             // Throw an exception or value (e.g., `throw new Error("Error message");`).
    ;

/* Conditional Statement */
conditionalStatement
    : ifStatement (elseIfStatement)* elseStatement?           // A full conditional statement with `if`, `else if`, and `else`.
    ;

/* If Statement */
ifStatement
    : IF LPAREN expression RPAREN statementBody               // An `if` condition with an associated statement or block.
    ;

/* Else-If Statement */
elseIfStatement
    : ELSE IF LPAREN expression RPAREN statementBody          // An `else if` condition with an associated statement or block.
    ;

/* Else Statement */
elseStatement
    : ELSE statementBody                                      // An `else` statement with an associated statement or block.
    ;

/* Statement Body */
statementBody
    : (statement | block)                                     // The body of a statement, either a single statement or a block.
    ;

/* Function Call */
functionCall
    : IDENTIFIER genericType? LPAREN parameterList? RPAREN SEMI?    // A function call with optional generics and parameters (e.g., `myFunction<T>(arg1, arg2)`).
    ;

/* Bootstrap Call */
bootstrapCall
    : bootstrapSpecifier LPAREN parameterList? RPAREN
      (DOT CATCH LPAREN arrowFunction RPAREN)? SEMI               // A bootstrap call with optional error handling (e.g., `promise.catch(err => {})`).
    ;

/* Iteration Statement */
iterationStatement
    : FOR LPAREN variableDeclaration? SEMI expression? SEMI expression? RPAREN statementBody        # StandardForLoop
    | FOR LPAREN varHelper IDENTIFIER OF IDENTIFIER RPAREN statementBody                            # ForOfLoop
    | FOR LPAREN varHelper IDENTIFIER IN IDENTIFIER RPAREN statementBody                            # ForInLoop
    | WHILE LPAREN expression RPAREN statementBody                                                  # WhileLoop
    | DO statementBody WHILE LPAREN expression RPAREN SEMI                                          # DoWhileLoop
    ;


/* ====================== Parameter Rules ====================== */
parameterList
    : parameter (COMMA parameter)*                             // A list of parameters separated by commas.
    ;

parameter
    : expression                                              // A parameter that is an expression.
    ;

parameterDeclaration
    : decorator* accessModifier? IDENTIFIER (COLON typeAnnotation)? (ASSIGN initialization)?
                                                              // A parameter declaration with optional decorators, type, and initialization.
    ;

/* ====================== Array and Value Rules ====================== */
array
    : LBRACK (expression (COMMA expression)*)? COMMA? RBRACK            // An array declaration with optional values (e.g., `[1, 2, 3]`).
    ;

value
    : primary                   # PrimaryValue                // A basic value, such as a literal or identifier.
    | array                     # ArrayValue                  // An array value.
    | arrayAccess               # ArrayAccessValue            // Accessing an array element (e.g., `arr[0]`).
    | memberAccess              # MemberAccessValue           // Accessing a member (e.g., `obj.prop`).
    | object                    # ObjectValue                 // An object literal.
    | objectInstantiation       # ObjectInstantiationValue    // Instantiation of a new object (e.g., `new ClassName(arg1, arg2)`).
    ;

/* ====================== Object Rules ====================== */
object
    : LBRACE attributes? RBRACE                               // An object declaration with optional interpolationElementList (e.g., `{ key: value }`).
    ;

attributes
    : attribute (COMMA attribute)* COMMA?                     // A list of interpolationElementList separated by commas.
    ;

attribute
    : IDENTIFIER (COLON expression)?                             // A key-value pair in an object (e.g., `key: value`).
    ;

objectInstantiation
    : NEW IDENTIFIER genericType? LPAREN parameterList? RPAREN
                                                              // Create a new instance of a class (e.g., `new MyClass(arg1, arg2)`).
    ;


/* ===================== Access Rules ===================== */
memberAccess
    : THIS expression                  # MemberAccessThis                      // Access a member using an identifier, optionally followed by an expression (e.g., `object.property` or `object.method()`).
    | IDENTIFIER expression?           # MemberAccessIdentifier                // Access a member relative to the current instance using `this` (e.g., `this.property` or `this.method()`).
    ;

arrayAccess
    : IDENTIFIER LBRACK expression RBRACK                  // Access an element of an array using an identifier (array name) and an index within square brackets (e.g., `array[index]`).
    ;


/* ================= Initialization Rules ================= */
initialization
    : expression                                            // Initialize with an expression.
    ;

/* ================= Primary Value Rules ================= */
primary
    : literal       # LiteralPrimary                          // A literal value (e.g., `42`, `"hello"`, `true`).
    | IDENTIFIER    # IdentifierPrimary                      // An identifier representing a variable or function name.
    ;

literal
    : (PLUS | MINUS)? NUMBER                                                    // A numeric value (e.g., `42`, `3.14`).
    | STRING                                                                    // A string literal (e.g., `"hello"`, `'world'`).
    | BOOL                                                                      // A boolean value (`true` or `false`).
    | NULL                                                                      // A null value.
   // | CSS_TEMPLATE
    ;

/* ================= Expression Rules ================= */
expression
    : functionCall expression?                                                  # FunctionCallExpression        // A function call expression (e.g., `myFunction(arg1, arg2)`).
    | functionDeclaration                                                       # FunctionExpression            // A function expression (e.g. (name) => {...}).
    | expression PLUS_PLUS                                                      # PostIncrementExpression       // A post-increment operation (e.g., `i++`).
    | expression MINUS_MINUS                                                    # PostDecreaseExpression        // A post-decrement operation (e.g., `i--`).
    | PLUS_PLUS expression                                                      # PreIncrementExpression        // A pre-increment operation (e.g., `++i`).
    | MINUS_MINUS expression                                                    # PreDecreaseExpression         // A pre-decrement operation (e.g., `--i`).
    | NOT expression                                                            # NotExpression                 // A logical NOT operation (e.g., `!isValid`).
    | DOT expression                                                            # MemberAccessExpression        // A member access operation (e.g., `object.property`).
    | expression (MULT | DIV | MOD) expression                                  # MultiplicativeExpression      // Multiplicative operations (e.g., `a * b`, `a / b`, `a % b`).
    | expression (PLUS | MINUS) expression                                      # AdditiveExpression            // Additive operations (e.g., `a + b`, `a - b`).
    | expression (LT | GT | LTE | GTE) expression                               # RelationalExpression          // Relational comparisons (e.g., `a < b`, `a >= b`).
    | expression (EQ | NEQ | STRICT_EQ | STRICT_NEQ | ASSIGN) expression        # EqualityExpression            // Equality/assignment operations (e.g., `a == b`, `a = 10`).
    | expression AND expression                                                 # LogicalAndExpression          // Logical AND operation (e.g., `a && b`).
    | expression OR expression                                                  # LogicalOrExpression           // Logical OR operation (e.g., `a || b`).
    | expression QUES expression COLON expression                               # TernaryExpression             // Ternary conditional operation (e.g., `a ? b : c`).
    | LPAREN expression RPAREN                                                  # ParenthesizedExpression       // An expression enclosed in parentheses (e.g., `(a + b)`).
    | value expression?                                                         # ValueExpression               // Value expression (e.g. primary, arrayAccess).
    | parameterDeclaration                                                      # ParameterExpression          // Parameter declaration expression (e.g. name: string, id: int = 1).
    ;

/* ================= Type Annotation Rules ================= */
genericType
    : LT (typeAnnotation (COMMA typeAnnotation)*) GT                // Generic type specification (e.g., `Array<string>`, `Map<number, string>`).
    ;

typeAnnotation
    : IDENTIFIER genericType                                  # GenericTypeAnnotation
    // A type identifier with optional generic types, e.g., `Promise<string>` or `Array<number>`.

    | (IDENTIFIER | NULL | literal) (BIT_OR (IDENTIFIER | NULL  | literal))*       # PipeTypeAnnotation
    // A union type, e.g., `string | null` or `number | undefined`.

    | (IDENTIFIER | NULL) LBRACK RBRACK                      # ArrayTypeAnnotation
    // A simple array type, e.g., `null[]` or 'string[] | number[]'.

    | array                                                  # TupleTypeAnnotation
    // A tuple type, e.g., `[number, string]` or other explicit array-like structures.
    ;


/* ================= Access Modifier Rules ================= */
accessModifier
    : PRIVATE                                                     // Private access modifier (e.g., `private property`).
    | PUBLIC                                                      // Public access modifier (e.g., `public method`).
    | PROTECTED                                                   // Protected access modifier (e.g., `protected field`).
    ;


/* ====================== Html Template Rules ====================== */

/* Entry rule for the template */
htmlTemplate
    : HTML_TEMPLATE element* END_HTML
    ;

/* Element definition */
element
    : openTag content* closeTag         # StandardTagEl        // e.g., <div> ... </div>
    | selfClosingTag                    # SelfClosingTagEl     // e.g., <input ... />
    | interpolation                     # InterpolationEl      // e.g., {{ post.userName }}
    ;

/* Open and close tag rules */
openTag
    : OPEN_TAG? tagName attributeHTML* CLOSE_TAG
    ;

closeTag
    : OPEN_TAG SLASH tagName CLOSE_TAG
    ;

selfClosingTag
    : OPEN_TAG tagName attributeHTML* SLASH? CLOSE_TAG
    ;

/* Content inside tags */
content
    : element               # NestedElementContent
    | ATTRIBUTE COL?        # PlainTextContent
    ;

/* Attribute rules for various cases */
attributeHTML
    : ATTRIBUTE EQUALS STRING_HTML                  # StandardAttribute             // e.g., id="header" or class="container"
    | BINDING EQUALS STRING_HTML                    # PropertyBinding               // e.g., [src]="image.url"
    | EVENT EQUALS STRING_HTML                      # EventBinding                  // e.g., (click)="handleClick()"
    | TWOBIND EQUALS STRING_HTML                    # TwoWayBinding                 // e.g., [(ngModel)]="value"
    | structuralDirective EQUALS STRING_HTML        # StructuralDirectiveAttr       // e.g., *ngIf="condition"
    | REFERENCE_VAR (EQUALS STRING_HTML)?           # TemplateReferenceVariable     // Optionally includes a value assignment, (e.g., #elementRef="customRef")
    | ATTRIBUTE                                     # AttributeOnly                 // Matches interpolationElementList without values, e.g., disabled or checked
    ;

/* Interpolation rule for Angular syntax */
interpolation
    : (ATTRIBUTE (COL | EQUALS))? INTERPOLATION_START interpolationElement (P interpolationElement)* INTERPOLATION_END
    ;

interpolationElement
    : ATTRIBUTE (COL (ATTRIBUTE | STRING_HTML))?                # StandardInterpolationElement
    | ATTRIBUTE QUES_HTML STRING_HTML COL STRING_HTML           # TernaryInterpolationElement
    | (ATTRIBUTE || STRING_HTML)                                # StringInterpolationElement
    ;

/* Tag names */
tagName
    : ATTRIBUTE
    ;

/* Structural directives like *ngFor and *ngIf */
structuralDirective
    : NGFOR           // *ngFor directive
    | NGIF            // *ngIf directive
    | DDIRECTIVE      // Any other directive
    ;


/* ================= State Management Declarations ================= */

/* ================= Navigation/Routing Declarations ================= */

routingDeclaration
    : EXPORT? CONST IDENTIFIER COLON ROUTE_CONFIG ASSIGN
        LBRACK (routeDefinition (COMMA routeDefinition)*)? RBRACK SEMI
    ;

routeDefinition
    : LBRACE (routeProperty (COMMA routeProperty)*)? RBRACE
    ;

routeProperty
    : PATH COLON STRING                                                            # PathProperty
    | COMPONENT_ROUTE COLON IDENTIFIER                                             # ComponentProperty
    | REDIRECT_TO COLON STRING                                                     # RedirectToProperty
    | PATH_MATCH COLON STRING                                                      # PathMatchProperty
    | CHILDREN COLON LBRACK (routeDefinition (COMMA routeDefinition)*)? RBRACK     # ChildrenProperty
    | LAZY_LOAD COLON arrowFunction                                                # LazyLoadProperty
    | CAN_ACTIVATE COLON array                                                     # CanActivateProperty
    | CAN_DEACTIVATE COLON array                                                   # CanDeactivateProperty
    | OUTLET COLON STRING                                                          # OutletProperty
    | IDENTIFIER COLON expression                                                  # GenericRouteProperty
    ;