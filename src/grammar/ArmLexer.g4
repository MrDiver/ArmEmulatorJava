lexer grammar ArmLexer;

//Data Processing Operations
AND: A N D -> pushMode(POSTCOM);
EOR: E O R -> pushMode(POSTCOM);
SUB: S U B -> pushMode(POSTCOM);
RSB: R S B -> pushMode(POSTCOM);
ADD: A D D -> pushMode(POSTCOM);
ADC: A D C -> pushMode(POSTCOM);
SBC: S B C -> pushMode(POSTCOM);
RSC: R S C -> pushMode(POSTCOM);
TST: T S T -> pushMode(POSTCOM);
TEQ: T E Q -> pushMode(POSTCOM);
CMP: C M P -> pushMode(POSTCOM);
CMN: C M P -> pushMode(POSTCOM);
ORR: O R R -> pushMode(POSTCOM);
MOV: M O V -> pushMode(POSTCOM);
BIC: B I C -> pushMode(POSTCOM);
MVN: M V N -> pushMode(POSTCOM);

//Multiplication Instructions
//normal
MUL : M U L -> pushMode(POSTCOM);
MLA : M L A -> pushMode(POSTCOM);
//Long
SMULL : S M U L L -> pushMode(POSTCOM);
UMULL : U M U L L -> pushMode(POSTCOM);
SMLAL : S M L A L -> pushMode(POSTCOM);
UMLAL : U M L A L -> pushMode(POSTCOM);

//load and store operations
LDR : L D R -> pushMode(POSTCOM);
STR : S T R -> pushMode(POSTCOM);

//Branch operations
Branch          : B     -> mode(BRANCHMODE), pushMode(POSTCOM);
BranchAndLink   : B L   -> mode(BRANCHMODE), pushMode(POSTCOM);
BLX             : B L X -> mode(BRANCHMODE), pushMode(POSTCOM);
BX              : B X   -> pushMode(POSTCOM);
BXJ             : B X J -> mode(BRANCHMODE), pushMode(POSTCOM);

// Shift operations
LSLI: L S L -> pushMode(POSTCOM);
LSRI: L S R -> pushMode(POSTCOM);
ASRI: A S R -> pushMode(POSTCOM);
RORI: R O R -> pushMode(POSTCOM);
RRXI: R R X -> pushMode(POSTCOM);

// Registers
R0 : R '0';
R1 : R '1';
R2 : R '2';
R3 : R '3';
R4 : R '4';
R5 : R '5';
R6 : R '6';
R7 : R '7';
R8 : R '8';
R9 : R '9';
R10: R '10';
R11: R '11';
R12: R '12';
R13: (R '13')|(S P);
R14: (R '14')|(L R);
R15: (R '15')|(P C);


// DATA
HASH: '#';
HEX: '0' X ([0-9a-fA-F])+;
NUMBER: '-'? [0-9]+ ;


//Whitespace
COMMENTM : '/*' .*? '*/' -> channel(HIDDEN); // .*? matches anything until the first */
COMMENT : '//' .*? '\n' -> channel(HIDDEN);
NEWLINE : '\r'? '\n';
COMMA: ',';
COLON: ':';
LBRACKET: '[';
RBRACKET: ']';
SPECIALRBRACKET: ']!';
WS:[ \t];
LABEL: LETTER+':';
LETTER: [a-zA-Z];
fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];

mode BRANCHMODE;

LABELTEXT: [a-zA-Z]+;
BRANCHEND: NEWLINE -> mode(DEFAULT_MODE);
mode POSTCOM;

// Conditions
EQ : E Q;
NE : N E;
CS : C S;
CC : C C;
MI : M I;
PL : P L;
VS : V S;
VC : V C;
HI : H I;
LS : L S;
GE : G E;
LT : L T;
GT : G T;
LE : L E;
AL : A L;
UPDATEFLAG: S;

BYTEACCESS      : B ;
PRIVILEGE       : T ;
DOUBLEWORD      : D ;
HALFWORD        : H ;
SIGNEDHALFWORD  :S H;
SIGNEDBYTE      :S B;

COMEND: [ \t] -> popMode;