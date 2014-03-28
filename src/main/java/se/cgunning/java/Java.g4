grammar Java;

options {
  language = Java;
}

@header {
  package se.cgunning.java;
}


program
    : packageDecl?
    mainClass
    classDecl*
;

packageDecl
    :   'package' PACKAGE END
    |
    ;

mainClass
    : CLASS CLASSID LCURL PUBLIC STATIC VOID 'main' LPAR 'String' LBRACK RBRACK ID RPAR LCURL varDecl* stmt* RCURL RCURL
    ;

classDecl
    : CLASS CLASSID LCURL varDecl* methodDecl* RCURL
    ;

methodDecl
    : PUBLIC type ID LPAR formalList RPAR LCURL varDecl* stmt* 'return' exp END RCURL
    ;
    
varDecl
    : type ID END
    ;


formalList
    : type ID formalRest*
    |
    ;

formalRest 
    : ',' type ID
    ;

type
    : INT LBRACK RBRACK                     //#
    | BOOLEAN                               //#
    | INT                                   //#
    | ID                                    //#
    ;

stmt
    : LCURL stmt* RCURL                     #BlockStmt
    | IF LPAR exp RPAR stmt ELSE stmt       #If
    | WHILE LPAR exp RPAR stmt              #While
    | SOUT LPAR exp RPAR END                #Sout
    | ID ASSIGN exp END                     #Assign
    | ID LBRACK exp RBRACK ASSIGN exp END   #ArrAssign
    ;

exp
    : INT_LIT                               #IntLit
    | TRUE                                  #True
    | FALSE                                 #False
    | ID                                    #Id
    | THIS                                  #This
    | NEW INT LBRACK exp RBRACK             #NewIntArr
    | NEW ID LPAR RPAR                      #NewObject
    | NOT exp                               #NotExp
    | LPAR exp RPAR                         #ParExp
    | exp PROD exp                          #Prod
    | exp SUB exp                           #Sub
    | exp ADD exp                           #Add
    | exp LESSTHAN exp                      #LessThan
    | exp AND exp                           #And
    | LBRACK exp RBRACK                     #BrackExp
    | DOT 'length'                          #DotLength
    | DOT ID RPAR expList LPAR              #MethodCall
    ;

op
    : AND
    | LESSTHAN
    | ADD
    | SUB
    | PROD
    ;

expList
    : exp expRest*
    |
    ;

expRest
    : ',' exp
    ;


PUBLIC : 'public' ;

STATIC : 'static' ;

ASSIGN : '=' ;
END : ';' ;
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

SOUT : 'System.out.println' ;

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

PACKAGE : (('a'..'z')+'.')+('a'..'z')+ ;
ID : ('a'..'z')('a'..'z' | 'A'..'Z' | '0'..'9')* ;
CLASSID : ('A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')* ;
INT_LIT : '0' | '1'..'9'('0'..'9')* ;
WS : (' ' | '\t' | '\n' | '\r' | '\f' )+ {skip();};