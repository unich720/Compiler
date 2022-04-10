grammar Compiler;

// Source: §6.3.1 General
TRUE     : 'true' ;
FALSE    : 'false' ;
ASTERISK : '*' ;
SLASH    : '/' ;

// Source: §6.3.1 General
input
    : input_section?
    ;

input_section
    : input_section_part+
    ;

input_section_part
    : input_element* New_Line
    ;

input_element
    : Whitespace
    | Comment
    | token
    ;

// Source: §6.3.2 Line terminators
New_Line
    : New_Line_Character
    | '\u000D\u000A'    // carriage return, line feed 
    ;

// Source: §6.3.3 Comments
Comment
    : Single_Line_Comment
    | Delimited_Comment
    ;

fragment Single_Line_Comment
    : '//' Input_Character*
    ;

fragment Input_Character
    // anything but New_Line_Character
    : ~('\u000D' | '\u000A'   | '\u0085' | '\u2028' | '\u2029')
    ;
    
fragment New_Line_Character
    : '\u000D'  // carriage return
    | '\u000A'  // line feed
    | '\u0085'  // next line
    | '\u2028'  // line separator
    | '\u2029'  // paragraph separator
    ;
    
fragment Delimited_Comment
    : '/*' Delimited_Comment_Section* ASTERISK+ '/'
    ;
    
fragment Delimited_Comment_Section
    : SLASH
    | ASTERISK* Not_Slash_Or_Asterisk
    ;

fragment Not_Slash_Or_Asterisk
    : ~('/' | '*')    // Any except SLASH or ASTERISK
    ;

// Source: §6.3.4 White space
Whitespace
    : [\p{Zs}]  // any character with Unicode class Zs
    | '\u0009'  // horizontal tab
    | '\u000B'  // vertical tab
    | '\u000C'  // form feed
    ;

// Source: §6.4.1 General
token
    : identifier
    | keyword
    | Integer_Literal
    | Real_Literal
    | String_Literal
    | operator_or_punctuator
    ;

// Source: §6.4.3 Identifiers
identifier
    : Simple_Identifier
    ;

Simple_Identifier
    : Available_Identifier
    ;

fragment Available_Identifier
    : Basic_Identifier     // excluding keywords or contextual keywords, see note below
    ;

fragment Basic_Identifier
    : Identifier_Start_Character Identifier_Part_Character*
    ;

fragment Identifier_Start_Character
    : Letter_Character
    | Underscore_Character
    ;

fragment Underscore_Character
    : '_'           // underscore
    | '\\u005' [fF] // Unicode_Escape_Sequence for underscore
    ;

fragment Identifier_Part_Character
    : Letter_Character
    | Decimal_Digit_Character
    | Connecting_Character
    | Combining_Character
    | Formatting_Character
    ;

fragment Letter_Character
    : [\p{L}\p{Nl}]           // category Letter, all subcategories; category Number, subcategory letter
    ;

fragment Combining_Character
    : [\p{Mn}\p{Mc}]          // category Mark, subcategories non-spacing and spacing combining
    ;

fragment Decimal_Digit_Character
    : [\p{Nd}]                // category Number, subcategory decimal digit
    ;

fragment Connecting_Character
    : [\p{Pc}]                // category Punctuation, subcategory connector
    ;

fragment Formatting_Character
    : [\p{Cf}]                // category Other, subcategory format
    ;

// Source: §6.4.4 Keywords
keyword
    : 'bool'     | 'break'   | 'continue'    | 'do'  | 'double'  | 'else'
    | 'false'   | 'for'     | 'if'          | 'int' | 'return'  | 'string'
    | 'true'    | 'void'    | 'while'
    ;

// Source: §6.4.5.1 General
literal
    : boolean_literal
    | Integer_Literal
    | Real_Literal
    | String_Literal
    ;

// Source: §6.4.5.2 Boolean literals
boolean_literal
    : TRUE
    | FALSE
    ;

// Source: §6.4.5.3 Integer literals
Integer_Literal
    : '0'..'9'
    ;

// Source: §6.4.5.4 Real literals
Real_Literal
    : Integer_Literal+ '.' Integer_Literal
    | '.' Integer_Literal+
    ;

// Source: §6.4.5.6 String literals
String_Literal
    : Regular_String_Literal
    ;
    
fragment Regular_String_Literal
    : '"' Regular_String_Literal_Character* '"'
    ;
    
fragment Regular_String_Literal_Character
    : Single_Regular_String_Literal_Character
    ;

fragment Single_Regular_String_Literal_Character
    : ~["\\\u000D\u000A\u0085\u2028\u2029]     // anything but ", \, and New_Line_Character
    ;

// Source: §6.4.6 Operators and punctuators
operator_or_punctuator
    : '{'  | '}'  | '('   | ')'  | '.'  | ','  | ';'
    | '+'  | '-'  | ASTERISK    | SLASH
    | '='  | '<'  | '>'         | '++' | '--' | '&&' | '||'
    | '==' | '!=' | '<=' | '>=' 
    ;

//Syntactic grammar

type_name
    : identifier
    ;

// Source: §8.1 General
type
    : reference_type
    | value_type
    ;

// Source: §8.2.1 General
reference_type
    : class_type
    ;

class_type
    : type_name
    | 'string'
    ;

// Source: §8.3.1 General
value_type
    : non_nullable_value_type
    ;

non_nullable_value_type
    : struct_type
    ;

struct_type
    : type_name
    | simple_type
    ;

simple_type
    : numeric_type
    | 'bool'
    ;

numeric_type
    : integral_type
    | floating_point_type
    ;

integral_type
    : 'int'
    ;

floating_point_type
    : 'double'
    ;

// Source: §11.6.2.1 General
argument_list
    : argument (',' argument)*
    ;

argument
    : argument_value
    ;

// Source: §11.7.1 General
primary_expression
    : primary_no_array_creation_expression
    ;

primary_no_array_creation_expression
    : literal
    | simple_name
    ;

simple_name
    : identifier
    ;

argument_value
    : expression
    ;

// Source: §11.8.1 General
unary_expression
    : primary_expression
    | '+' unary_expression
    | '-' unary_expression
    | '!' unary_expression
    | pre_increment_expression
    | pre_decrement_expression
    ;

// Source: §11.9.1 General
multiplicative_expression
    : unary_expression
    | multiplicative_expression '*' unary_expression
    | multiplicative_expression '/' unary_expression
    ;

additive_expression
    : multiplicative_expression
    | additive_expression '+' multiplicative_expression
    | additive_expression '-' multiplicative_expression
    ;

// Source: §11.11.1 General
relational_expression
    : additive_expression
    | relational_expression '<' additive_expression
    | relational_expression '>' additive_expression
    | relational_expression '<=' additive_expression
    | relational_expression '>=' additive_expression
    ;

equality_expression
    : relational_expression
    | equality_expression '==' relational_expression
    | equality_expression '!=' relational_expression
    ;


// Source: §11.13.1 General
conditional_and_expression
    : equality_expression
    | conditional_and_expression '&&' equality_expression
    ;

conditional_or_expression
    : conditional_and_expression
    | conditional_or_expression '||' conditional_and_expression
    ;

// Source: §12.1 General
statement
    : embedded_statement
    | declaration_statement
    ;

declaration_statement
    : local_variable_declaration ';'
    ;

// Source: §12.6.2 Local variable declarations
local_variable_declaration
    : local_variable_type local_variable_declarators
    ;

local_variable_type
    : type
    ;

local_variable_declarators
    : local_variable_declarator
    ;

local_variable_declarator
    : identifier
    | identifier '=' local_variable_initializer
    ;

local_variable_initializer
    : expression
    ;

embedded_statement
    : block
    | empty_statement
    | expression_statement
    | selection_statement
    | iteration_statement
    | jump_statement
    ;

// Source: §12.7 Expression statements
expression_statement
    : statement_expression ';'
    ;

// Source: §12.3.1 General
block
    : '{' statement_list? '}'
    ;

// Source: §12.3.2 Statement lists
statement_list
    : statement+
    ;

// Source: §12.4 The empty statement
empty_statement
    : ';'
    ;

// Source: §11.19 Expression
expression
    : assignment
    ;

// Source: §11.18.1 General
assignment
    : unary_expression assignment_operator expression
    ;

assignment_operator
    : '='
    ;


// Source: §11.21 Boolean expressions
boolean_expression
    : expression
    ;

// Source: §12.8.1 General
selection_statement
    : if_statement
    ;

// Source: §12.8.2 The if statement
if_statement
    : 'if' '(' boolean_expression ')' embedded_statement
    | 'if' '(' boolean_expression ')' embedded_statement 'else' embedded_statement
    ;

// Source: §12.9.1 General
iteration_statement
    : while_statement
    | do_statement
    | for_statement
    ;

// Source: §12.9.2 The while statement
while_statement
    : 'while' '(' boolean_expression ')' embedded_statement
    ;

// Source: §12.9.3 The do statement
do_statement
    : 'do' embedded_statement 'while' '(' boolean_expression ')' ';'
    ;

// Source: §12.9.4 The for statement
for_statement
    : 'for' '(' for_initializer? ';' for_condition? ';' for_iterator? ')' embedded_statement
    ;

for_initializer
    : statement_expression_list
    ;

for_condition
    : boolean_expression
    ;

for_iterator
    : statement_expression_list
    ;

statement_expression_list
    : statement_expression
    ;

statement_expression
    : assignment
    | post_increment_expression
    | post_decrement_expression
    | pre_increment_expression
    | pre_decrement_expression
    ;

// Source: §11.7.14 Postfix increment and decrement operators
post_increment_expression
    : primary_expression '++'
    ;

post_decrement_expression
    : primary_expression '--'
    ;

// Source: §11.8.6 Prefix increment and decrement operators
pre_increment_expression
    : '++' unary_expression
    ;

pre_decrement_expression
    : '--' unary_expression
    ;

// Source: §12.10.1 General
jump_statement
    : break_statement
    | continue_statement
    | return_statement
    ;

// Source: §12.10.2 The break statement
break_statement
    : 'break' ';'
    ;

// Source: §12.10.3 The continue statement
continue_statement
    : 'continue' ';'
    ;

// Source: §12.10.5 The return statement
return_statement
    : 'return' expression? ';'
    ;