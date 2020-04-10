/* ARM32 Assembler Grammar */
parser grammar ArmParser;
options { tokenVocab=ArmLexer; }



program: sequence EOF;

sequence: op op*;

//Operations
op: mov | add;

mov: MOV (s?) (cond?) ' ' rd ',' operand2;

add: ADD (s?) (cond?) ' ' rd? ',' rn ',' operand2;

//Parameters
s: UPDATEFLAG;
cond: EQ;//EQ | NE | CS | CC | MI | PL | VS | VC | HI | LS | GE | LT | GT | LE | AL;
rd: REG;
rn: REG;

operand2: LITERAL | REG; //TODO: REG (',' shift);

// Additional

label: LABEL ':';