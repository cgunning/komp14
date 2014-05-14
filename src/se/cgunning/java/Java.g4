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
    : CLASS ID LCURL mainMethod RCURL
    ;

classDecl
    : CLASS ID extendString? LCURL varDecl* methodDecl* RCURL
    ;

extendString
    : 'extends' ID
    ;

methodDecl
    : PUBLIC type ID LPAR formalList RPAR LCURL varDecl* stmt* RETURN exp END RCURL
    ;
    
varDecl
    : type ID END
    ;

mainMethod
    : 'public static void main' LPAR 'String' LBRACK RBRACK ID RPAR LCURL varDecl* stmt* RCURL
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
    | LONG LBRACK RBRACK                     //#
    | BOOLEAN                               //#
    | INT                                   //#
    | LONG
    | ID                                    //#
    ;

stmt
    : LCURL varDecl* stmt* RCURL            #BlockStmt
    | IF LPAR exp RPAR stmt (ELSE stmt)?    #If
    | WHILE LPAR exp RPAR stmt              #While
    | SOUT LPAR exp RPAR END                #Sout
    | ID ASSIGN exp END                     #Assign
    | ID LBRACK exp RBRACK ASSIGN exp END   #ArrAssign
    ;

exp
    : INT_LIT                               #IntLit
    | LONG_LIT                              #LongLit
    | TRUE                                  #True
    | FALSE                                 #False
    | ID                                    #Id
    | NEW INT LBRACK exp RBRACK             #NewIntArr
    | NEW LONG LBRACK exp RBRACK            #NewLongArr
    | exp LBRACK exp RBRACK                 #ArrAccess
    | exp DOT ID LPAR expList RPAR          #MethodCall
    | exp DOT 'length'                      #DotLength
    | THIS                                  #This
    | NOT exp                               #NotExp
    | NEW ID LPAR RPAR                      #NewObject
    | exp PROD exp                          #Prod
    | exp SUB exp                           #Sub
    | exp ADD exp                           #Add
    | exp LESSTHAN exp                      #LessThan
    | exp LESSTANOREQ exp                   #LessThanOrEqual
    | exp GREATERTHAN exp                   #GreaterThan
    | exp GREATERTHANOREQ exp               #GreaterThanOrEqual
    | exp EQUALS exp                        #Equals
    | exp NOTEQUALS exp                     #NotEquals
    | exp AND exp                           #And
    | exp OR exp                            #Or
    | LPAR exp RPAR                         #ParExp
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

RETURN : 'return' ;

ASSIGN : '=' ;
OR : '||' ;
EQUALS : '==' ;
NOTEQUALS : '!=' ;
END : ';' ;
AND : '&&' ;
LESSTANOREQ : '<=' ;
GREATERTHANOREQ : '>=' ;
LESSTHAN  : '<' ;
GREATERTHAN  : '>' ;
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
LONG : 'long' ;
BOOLEAN : 'boolean' ;
VOID : 'void' ;

TRUE : 'true' ;
FALSE : 'false' ;

THIS : 'this' ;
NOT : '!' ;

ID : ('a'..'z' | 'A'..'Z' | '_')('a'..'z' | 'A'..'Z' | '0'..'9' | '_')* ;
LONG_LIT : '0'[lL] | '1'..'9'('0'..'9')*[lL] ;
INT_LIT : '0' | '1'..'9'('0'..'9')* ;

BLOCKCOMMENT : '/*' (.)*? '*/' { skip(); };
COMMENT : '//' ~('\r' | '\n')* { skip(); };
WS : (' ' | '\t' | '\n' | '\r' | '\f' )+ { skip(); };