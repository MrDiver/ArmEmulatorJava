lexer grammar ArmLexer;

// Operations
ADD: 'ADD '|'add';
MOV: 'MOV '|'mov';

// Seperator
COMMA: ',';
COLON:':';
SPACE:' ';
// Register
REG: ('R'|'r') ([0-9]|'1'[0-5]) | SP | LR | PC;
SP:'SP'|'sp';
LR:'LR'|'lr';
PC:'PC'|'pc';

// Literals
LITERAL: '#' [0-9]+;
LABEL: [a-zA-Z]+;

// Conditions
EQ: 'EQ'|'eq';
NE: 'NE'|'ne';
CS: 'CS'|'cs';
CC: 'CC'|'cc';
MI: 'MI'|'mi';


UPDATEFLAG: 'S'|'s';

COMMENT : '/*' .*? '*/' -> skip ; // .*? matches anything until the first */

WS : [ \r\t\n]+ -> skip ;