grammar CsharpSubset;

/*
 * Parser Rules
 */
program : (usingStmnt* classDefinition* EOF); 

usingStmnt : 'using' NAME ';';
classInitialization : reference NAME '=' 'new' NAME '(' argList? ')' ';';
classDefinition : 'class' NAME '{'  (propertyDefinition | methodDefinition)* '}';
  
propertyDefinition : ('public' | 'private')? 'static'? varDeclaration; 
methodDefinition : ('public' | 'private')? 'static'? (type | 'void') NAME '(' parameterList? ')' '{' stmnt* returnStmnt? '}'; 

stmnt : varDeclaration | assignStmnt | (methodCallStmnt ';') | methodDefinition | classInitialization | lambdaExpression | ';';

varDeclaration : type NAME ('=' expression)? ';';
assignStmnt : reference '=' (mathExpression | methodCallStmnt | lambdaExpression) ';'; 
returnStmnt : 'return' expression ';';

expression:  mathExpression | lambdaExpression | reference;
mathExpression:	NUMBER | reference |'(' mathExpression ')' |<assoc=right> mathExpression '^' mathExpression 
   | ('+' | '-') mathExpression| mathExpression ('/' | '*') mathExpression | mathExpression ('+' | '-') mathExpression;

methodCallStmnt: reference '(' argList? ')';

lambdaBody:  (stmnt | mathExpression)* returnStmnt?;
lambdaExpression : '(' (argList | typedArgList)? ')' '=>' '{' lambdaBody '}';
 
parameterList : type reference (',' type reference)*;
typedArgList: type reference (',' type reference)*;
argList: parameter  (',' parameter)*;

parameter: reference | NUMBER | methodCallStmnt;
type: SIMPLETYPE | delegateType;
reference: REFERENCE | NAME;
delegateType: ('Action' | 'Func') ('<' SIMPLETYPE (',' SIMPLETYPE)* '>')?;

compileUnit: EOF;

/*
 * Lexer Rules
 */

WS: [ \n\t\r]+ -> channel(HIDDEN);

fragment LETTER: ([a-zA-Z]);
fragment DIGIT: ([0-9]);

SIMPLETYPE: 'int' | 'double';
NAME: LETTER (LETTER | DIGIT)*;
TEXT: '"' .*? '"';
COMMENT: '//' .*? '\n';
NUMBER: '-'? DIGIT+;
REFERENCE: NAME ('.' NAME)+;

ErrorChar : . ;