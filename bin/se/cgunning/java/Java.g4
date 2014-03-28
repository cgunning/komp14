grammar Java;

options {
  language = Java;
}

@header {
  package se.cgunning.java;
}


program
    : mainClass
    classDecl*
;


mainClass
    : CLASS ID LCURL PUBLIC STATIC VOID 'main' LPAR 'String' LBRACK RBRACK ID RPAR LCURL varDecl* stmt* RCURL RCURL
    ;

classDecl
    : CLASS ID LCURL varDecl* methodDecl* RCURL
    ;

methodDecl
    : PUBLIC type ID LPAR formalList RPAR LCURL varDecl* stmt* 'return' exp ';' RCURL
    ;
    
varDecl
    : type ID ';'
    ;


formalList
    : type ID formalRest*
    |
    ;

formalRest 
    : ',' type ID
    ;

type
    : INT LBRACK RBRACK
    | BOOLEAN
    | INT
    | ID
    ;

stmt
    : LCURL stmt* RCURL
    | IF LPAR exp RPAR stmt ELSE stmt
    | WHILE LPAR exp RPAR stmt
    | SYSO LPAR exp RPAR ';'
    | ID '=' exp ';'
    | ID LBRACK exp RBRACK '=' exp ';'
    ;

exp
    : exp1 exp2*
    ;

exp1
    : INT_LIT
    | TRUE
    | FALSE
    | ID
    | THIS
    | NEW INT LBRACK exp1 RBRACK
    | NEW ID LPAR RPAR
    | NOT exp1
    | LPAR exp RPAR
    ;

exp2
    : op exp
    | LBRACK exp1 RBRACK
    | DOT 'length'
    | DOT ID RPAR expList LPAR
    ;

op
    : AND
    | LESSTHAN
    | ADD
    | SUB
    | PROD
    ;

expList
    : exp1 expRest*
    |
    ;

expRest
    : ',' exp1
    ;


PUBLIC : 'public' ;

STATIC : 'static' ;

AND : '&&' ;
LESSTHAN  : '<' ;
ADD : '+' ;
SUB : '-' ;
PROD : '*' ;
DOT : '.' ;

CLASS : 'class' ;
NEW : 'new' ;
IF : 'if' ;
ELSE : 'else' ;
WHILE : 'while' ;
FOR : 'for' ;

SYSO : 'System.out.println' ;

LCURL : '{' ;
RCURL : '}' ;
LBRACK : '[' ;
RBRACK : ']' ;
LPAR : '(' ;
RPAR : ')' ;

INT  : 'int' ;
BOOLEAN : 'boolean' ;
VOID : 'void' ;

TRUE : 'true' ;
FALSE : 'false' ;

THIS : 'this' ;
NOT : '!' ;

ID : ('a'..'z')('a'..'z' | 'A'..'Z' | '0'..'9')* ;
INT_LIT : '0' | '1'..'9'('0'..'9')* ;
WS : (' ' | '\t' | '\n' | '\r' | '\f' )+ {skip();};