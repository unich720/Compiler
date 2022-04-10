grammar pike;

program
   : definition*
   ;

definition
   : function_definition
   | variables
   ;

function_definition
   : type_ IDENTIFIER '(' arguments ')' block
   ;

variables
   : type_ variable_names ';'
   ;

variable_names
   : variable_name (',' variable_name)*
   ;

variable_name
   : '*'* IDENTIFIER ('=' expression2)?
   ;

block
   : '{' statement* '}'
   ;

statement
   : expression2 ';'
   | cond
   | while_stmt
   | do_while_stmt
   | for_stmt
   | switch_stmt
   | case_stmt
   | default_stmt
   | block
   | foreach_stmt
   | break_stmt
   | continue_stmt
   | variables
   | ';'
   ;

cond
   : 'if''(' expression2 ')' block ('else' statement block)?
   ;

while_stmt
   : 'while''(' expression ')' statement
   ;

do_while_stmt
   : 'do' statement while_stmt '(' expression ')' ';'
   ;

for_stmt
   : 'for' '(' expression? ';' expression? ';' expression? ')' statement
   ;

switch_stmt
   : 'switch' '(' expression ')' block
   ;

case_stmt
   : 'case' expression ('..' expression)? ':'
   ;

default_stmt
   : 'default' ':'
   ;

foreach_stmt
   : 'foreach' '(' expression ':' expression6 ')' statement
   ;

break_stmt
   : 'break' ';'
   ;

continue_stmt
   : 'continue' ';'
   ;

expression
   : expression2 (',' expression2)*
   ;

expression2
   : (expression5 ('||' | '&&' | '|' | '^' | '&' | '==' | '!=' | '>' | '<' | '>=' | '<=' | '<<' | '>>' | '+' | '*' | '/' | '%'))* expression5
   ;

expression5
   : expression6
   | '(' type_ ')' expression5
   | '--' expression6
   | '++' expression6
   | expression6 '--'
   | expression6 '++'
   ;

expression6
   :
   ( STRING
   | NUMBER
   | FLOAT
   | parenthesis
   ) extension*
   ;

extension
   : '(' expression_list ')'
   | '->' IDENTIFIER
   | '[' expression ('..' expression)? ']'
   ;


parenthesis
   : '(' expression ')'
   ;

expression_list
   : (splice_expression (',' splice_expression)*)? ','?
   ;

splice_expression
   : '@'? expression2
   ;

argument
   : type_ ('...')? (IDENTIFIER)?
   ;

arguments
   : (argument (',' argument)*)? (',')?
   ;

type_
   : ('int' | 'string' | 'float' | 'program' | ('mapping' ('(' type_ ':' type_ ')')?) | ('array' ('(' type_ ')')?) | ('multiset' ('(' type_ ')')?) | ('function' function_type?)) ('*')*
   ;

function_type
   : '(' type_ (',' type_)* ('...')? ')'
   ;


IDENTIFIER
   : LETTER (LETTER | DIGIT)*
   ;


LETTER
   : 'a' .. 'z' | 'A' .. 'Z' | '_'
   ;


FLOAT
   : DIGIT DIGIT* '.' DIGIT*
   ;


NUMBER
   : DIGIT DIGIT* | '0x' DIGIT*
   ;


DIGIT
   : '0' .. '9'
   ;


STRING
   : '"' ~ '"'* '"'
   ;


WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> channel(HIDDEN)
    ;