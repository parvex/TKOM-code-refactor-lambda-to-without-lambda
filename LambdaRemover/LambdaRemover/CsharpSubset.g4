grammar CsharpSubset;

/*
 * Parser Rules
 */
program : (usingStmnt+ classDefinition classDefinition*); 

classInitialization : 'class' NAME '=' 'new' NAME '(' argList ')' ';';
classDefinition : 'class' NAME '{' (('public' | 'private') 'static'? varDeclaration | methodDefinition)+ '}';
usingStmnt : 'using' NAME ';';

lambdaExpression : '(' (argList | typedArgList)? ')' '=>' '{' stmnt | expression '}';
methodDefinition : TYPE | 'void' REFERENCE '(' parameterList ')' '{' stmnt '}';
stmnt : varDeclaration+ | assignStmnt+ | methodCallStmnt+ | methodDefinition + | printStmnt+ | lambdaExpression+ | returnStmnt;

varDeclaration : TYPE REFERENCE ('=' expression)? ';';
assignStmnt : REFERENCE '=' expression | methodCallStmnt ';';
returnStmnt : 'return' expression';';

expression : '(' expression ')' | simpleExpr (MATHOP simpleExpr)*; //it should work
simpleExpr :  '-'? ( NUMBER | REFERENCE | methodCallStmnt);

printStmnt : 'Console' '.' 'WriteLine'  '(' TEXT ')' ';';
methodCallStmnt: REFERENCE '(' argList ')' ';';

parameterList : TYPE REFERENCE (',' TYPE REFERENCE)+;
typedArgList: TYPE REFERENCE (',' TYPE REFERENCE)+;
argList: REFERENCE (',' REFERENCE)+; 


compileUnit: EOF;

/*
 * Lexer Rules
 */

WS: [ \n\t\r]+ -> channel(HIDDEN);

fragment LETTER: ([a-zA-Z]);
fragment DIGIT: ([0-9]);
fragment DELEGATETYPE: ('Action' | 'Func') (('<' TYPE ',' TYPE)+ '>')?;


NAME: LETTER (LETTER | DIGIT)+;
TEXT: '"' (LETTER|DIGIT)+ '"';
TYPE: 'int' | DELEGATETYPE | NAME;
COMMENT: '//' .*? '\n';
MATHOP: '+' | '-' | '/' | '*';
NUMBER: '-'? DIGIT+;
REFERENCE: NAME ('.' NAME)+;

