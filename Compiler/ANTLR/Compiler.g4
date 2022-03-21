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
    : keyword
    | Integer_Literal
    | Real_Literal
    | String_Literal
    | operator_or_punctuator
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

fragment Sign
    : '+' | '-'
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
    | '='  | '<'  | '>'  | '&&' | '||'
    | '==' | '!=' | '<=' | '>=' 
    ;