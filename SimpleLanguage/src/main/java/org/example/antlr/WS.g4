grammar WS;

parse
    : wsClass EOF
    ;

wsClass
    : ClassDef Identifier '{' block '}'
    ;

block
    : (statement)*
    ;

statement
    : assignment ';'
    | functionCall ';'
    ;

assignment
    : AssignDef Identifier '=' expression
    ;

//只写了几个方法：输出方法
functionCall
    : Out '(' expression ')'                            #printFunctionCall
    | WangShun '(' expression ')'                       #wsFunctionCall
    ;

expression
    : '-' expression                                       #unaryMinusExpression
    | '!' expression                                       #notExpression
    | <assoc=right> expression '^' expression              #powerExpression
    | expression op=('*' | '/' | '%' ) expression          #multExpression
    | expression op=('+' | '-' ) expression                #addExpression
    | Number                                                #numberExpression
    | Bool                                                  #boolExpression
    | String                                                #stringExpression
    | Identifier                                            #identifierExpression
    ;












WangShun        : 'WangShun';
Out             : 'out';
AssignDef       : '$:';
ClassDef        : '@:';
Identifier
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;
Bool
    : 'true'
    | 'false'
    ;

Number
    :Int ('.' Digit*)?
    ;

String
 : ["] ( ~["\r\n\\] | '\\' ~[\r\n] )* ["]
 | ['] ( ~['\r\n\\] | '\\' ~[\r\n] )* [']
 ;

//注释省略
Comment
 : ( '//' ~[\r\n]* | '/*' .*? '*/' ) -> skip
 ;
Space
 : [ \t\r\n\u000C] -> skip
 ;

fragment Int
 : [1-9] Digit*
 | '0'
 ;

fragment Digit
 : [0-9]
 ;

Println  : 'println';
Print    : 'print';
Input    : 'input';
Assert   : 'assert';
Size     : 'size';
Def      : 'def';
If       : 'if';
Else     : 'else';
Return   : 'return';
For      : 'for';
While    : 'while';
To       : 'to';
Do       : 'do';
End      : 'end';
In       : 'in';
Null     : 'null';

Or       : '||';
And      : '&&';
Equals   : '==';
NEquals  : '!=';
GTEquals : '>=';
LTEquals : '<=';
Pow      : '^';
Excl     : '!';
GT       : '>';
LT       : '<';
Add      : '+';
Subtract : '-';
Multiply : '*';
Divide   : '/';
Modulus  : '%';
OBrace   : '{';
CBrace   : '}';
OBracket : '[';
CBracket : ']';
OParen   : '(';
CParen   : ')';
SColon   : ';';
Assign   : '=';
Comma    : ',';
QMark    : '?';
Colon    : ':';










