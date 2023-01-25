grammar MiLenguaje;


start_grammar: (function)+ function_main EOF| (substatement)* EOF;

function_main: 'Function' 'Main' '(' ')' 'returns' 'nothing' (indentation substatement )+;

function: 'Function' ID '(' decs ')' 'returns' return_functions ( indentation substatement )+;


substatement:  dec | assign| if | while | for |print|function_call;// | while | for | print |;

decs: dec (','dec)*
|;

return_functions: dec|'nothing';

dec: type ID|
type 'array''('array_size')'ID;

array_size: '?'|INT;


type: 'integer'|'float';

function_call: ID '('(arith(',' arith)*)*')';
op_arith: '+'|'-'|'/'|'*'|'%';

op_logic: '>='|'<='|'<'|'>'|'==';

op_binarie: 'or'|'and';

index_array: ID'['arith']';

access_array: ID'.''size';

arith: '('arith')'|('+'|'-') arith|

arith op_arith arith|INT|FLOAT|ID|function_call|access_array|index_array;

condex: 'not' '('condex')' (op_binarie condex)*|arith op_logic arith (op_binarie condex)*|'('condex')' (op_binarie condex)*;

assign: ID '=' arith | ID '=' entrance |
access_array '=' arith  | access_array '=' entrance |
index_array '=' arith| index_array '=' entrance;

entrance: 'Get' 'next' 'input';

print: 'Put' arith 'to' 'output' ('with' INT 'decimal' 'places'|)|'Put' string 'to' 'output';

if: 'if' condex (indentation substatement)+ (elseif)* (else|);

elseif: 'elseif' condex (indentation substatement)+;

else: 'else' (indentation substatement)+;

while: 'while' condex (indentation substatement)+;

for: 'for' assign ';' condex ';' assign (indentation substatement)+;

indentation:|'      '|'         ';

string: STRING_LITERAL;

INT: [0-9]+;
FLOAT : [0-9]+'.'[0-9]+;


STRING_LITERAL: '"' (ESC|.)*? '"';
fragment ESC : '\\"' | '\\\\' ;


/*
STRING_LITERAL: '"' (ESC|~('\\'))*? ('"');
fragment ESC: '\\"' | '\\\\' | '\\n' |'\\t'|'/"'|'\n'|'.';
*/
ID: [a-zA-Z][0-9a-zA-Z_]*;

WS : [ \n\t\r]+ -> skip ;
LINE_COMMENT   : '//' ~[\r\n]* -> skip ;


//NL: ('\r'? '\n' ' '*);
