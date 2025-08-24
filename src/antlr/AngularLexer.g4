lexer grammar AngularLexer;

// Skipping Unnecessary Characters
SPACES: [ \t\r\n]+ -> skip;                     // Whitespace
LINE_COMMENT: '//' ~[\r\n]* -> skip;            // Single-line comments
BLOCK_COMMENT: '/*' .*? '*/' -> skip;           // Multi-line comments
HTML_COMMENT: '<!--' .*? '-->' -> skip ;


// Angular-Specific Keywords
MODULE: '@NgModule';
COMPONENT: '@Component';
DIRECTIVE: '@Directive';
PIPE: '@Pipe';
INJECTABLE: '@Injectable';


// Metadata-Specific Keywords
SELECTOR: 'selector';
TEMPLATE_URL: 'templateUrl';
TEMPLATE: 'template';
STYLE_URLS: 'styleUrls';
STYLES: 'styles';
IMPORTS: 'imports';
EXPORTS: 'exports';
INPUTS: 'inputs';
OUTPUTS: 'outputs';
DECLARATIONS: 'declarations';
PROVIDERS: 'providers';
BOOTSTRAP: 'bootstrap';
STANDALONE: 'standalone';


// ImportStatement-Specific Keywords
IMPORT: 'import';
FROM: 'from';
AS : 'as';


// Bootstrap-Related Keywords
PLATFORM_BROWSER_DYNAMIC: 'platformBrowserDynamic';
BOOTSTRAP_MODULE: 'bootstrapModule';
BOOTSTRAP_APPLICATION: 'bootstrapApplication';


// General JavaScript/TypeScript Keywords
LET: 'let';
CONST: 'const';

IF: 'if';
ELSE: 'else';

RETURN: 'return';
THROW: 'throw';

CONSOLE: 'console';
LOG: 'log';
CATCH: 'catch';
ERROR: 'error';


// Class-Related Keywords
EXPORT: 'export';

INTERFACE: 'interface';
CLASS: 'class';
ENUM: 'enum';

EXTENDS: 'extends';
IMPLEMENTS: 'implements';

CONSTRUCTOR: 'constructor';
THIS: 'this';
NEW: 'new';

FUNCTION: 'function';


// Access Modifiers
PRIVATE: 'private';
PUBLIC: 'public';
PROTECTED: 'protected';


// Router / Navigation Keywords
ROUTER_MODULE: 'RouterModule';
ROUTES: 'Routes';
FOR_ROOT: 'forRoot';
FOR_CHILD: 'forChild';
ROUTER: 'Router';
NAVIGATE: 'navigate';
NAVIGATE_BY_URL: 'navigateByUrl';

// Route object keys
ROUTE_PATH: 'path';
ROUTE_COMPONENT: 'component';
ROUTE_REDIRECT_TO: 'redirectTo';
ROUTE_PATH_MATCH: 'pathMatch';
ROUTE_CHILDREN: 'children';
ROUTE_LOAD_CHILDREN: 'loadChildren';
ROUTE_CAN_ACTIVATE: 'canActivate';
ROUTE_CAN_ACTIVATE_CHILD: 'canActivateChild';
ROUTE_CAN_DEACTIVATE: 'canDeactivate';
ROUTE_CAN_MATCH: 'canMatch';
ROUTE_RESOLVE: 'resolve';
ROUTE_DATA: 'data';

// NgRx / State Management
STORE_MODULE: 'StoreModule';
EFFECTS_MODULE: 'EffectsModule';
FOR_FEATURE: 'forFeature';

CREATE_ACTION: 'createAction';
PROPS: 'props';
CREATE_REDUCER: 'createReducer';
ON_KW: 'on';                 // 'on' is a common identifier; making it a token is fine.
CREATE_SELECTOR: 'createSelector';
CREATE_FEATURE_SELECTOR: 'createFeatureSelector';
CREATE_EFFECT: 'createEffect';
OF_TYPE: 'ofType';
SELECT: 'select';
DISPATCH: 'dispatch';
ACTIONS: 'Actions';
PIPEFN: 'pipe';              // not @Pipe (that’s already PIPE). This is RxJS pipe()


// Comparison Operators
GT: '>';
GTE: '>=';
LT: '<';
LTE: '<=';
ASSIGN: '=';
NOT: '!';
EQ: '==';
NEQ: '!=';
STRICT_EQ: '===';
STRICT_NEQ: '!==';


// Arithmatic Operators
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';


// Logical Operators
AND: '&&';
OR: '||';
BIT_AND: '&';
BIT_XOR: '^';
BIT_OR: '|';


// Assignment Operators
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
MULTIPLY_ASSIGN: '*=';
DIVIDE_ASSIGN: '/=';
MODULUS_ASSIGN: '%=';
POWER_ASSIGN: '**=';
RIGHT_SHIFT_ARITHMETIC_ASSIGN: '>>=';
LEFT_SHIFT_ARITHMETIC_ASSIGN: '<<=';
RIGHT_SHIFT_LOGICAL_ASSIGN: '>>>=';
BIT_AND_ASSIGN: '&=';
BIT_XOR_ASSIGN: '^=';
BIT_OR_ASSIGN: '|=';
ARROW: '=>';
NULLCOALESCE: '??';


// Increment and Decrement
PLUS_PLUS: '++';
MINUS_MINUS: '--';


// Punctuations
SEMI: ';';
COLON: ':';
COMMA: ',';
DOT: '.';
QUES: '?';
AT: '@';
HASH_TAG: '#';
QUOTE: '"' | '\'';


// Brackets
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACK: '[';
RBRACK: ']';

// Iteration-Related Keywords
FOR: 'for';
DO: 'do';
WHILE: 'while';
BREAK: 'break';
CONTINUE: 'continue';
OF: 'of';
IN: 'in';

// Literals
STRING: '"' (~["\\] | '\\' .)* '"' | '\'' (~['\\] | '\\' .)* '\'';             // Integer or decimal numbers
NUMBER: [0-9]+ ('.' [0-9]+)?;                       // Integer or decimal numbers
BOOL: 'true' | 'false';                             // Boolean literals
NULL: 'null';                                       // Null value
//TEMPLATE_LITERAL: '`' ( ~['`', '\\', '$'] | '\\' . | '$' ~['{'] | '${' | TEMPLATE_EXPRESSION )* '`';
//fragment TEMPLATE_EXPRESSION: '{' IDENTIFIER '}';

// Identifiers
IDENTIFIER: [a-zA-Z][-_a-zA-Z0-9]*; // General identifiers


// Beginning of the HTML template
HTML_TEMPLATE: '`' -> pushMode(HTML);

// CSS Style
//CSS_TEMPLATE: '`' (~["\\] | '\\' .)* '`';

fragment WS
    : SPACES
    | LINE_COMMENT
    | BLOCK_COMMENT
    | HTML_COMMENT
    ;

mode HTML;
// Tokens for standard HTML
OPEN_TAG        : '<' ;
CLOSE_TAG       : '>' ;
SLASH           : '/' ;
EQUALS          : '=' ;
COL             : ':' ;
STRING_HTML     : '"' .*? '"' | '\'' .*? '\'' ;

// Tokens for Angular-specific syntax
INTERPOLATION_START : '{{' ;
INTERPOLATION_END   : '}}' ;
BINDING         : '[' ATTRIBUTE ']' ;
EVENT           : '(' ATTRIBUTE ')' ;
TWOBIND         : '[(' ATTRIBUTE ')]' ;
NGFOR           : '*ngFor' ;
NGIF            : '*ngIf' ;
DDIRECTIVE      : '*' ATTRIBUTE ;
P               : '|' ;
REFERENCE_VAR   : '#' ATTRIBUTE ;

// Token for interpolationElementList and tag names
ATTRIBUTE       : [a-zA-Z_][a-zA-Z0-9_.!?-]* ;
HTML_CLASS      : 'class' ;

// Whitespace and comments
WHITESPACE      : [ \t\r\n]+ -> skip ;
COMMENT         : '<!--' .*? '-->' -> skip ;

// End of the HTML template
END_HTML        : '`' -> popMode;