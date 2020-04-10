/* ARM32 Assembler Grammar */

parser grammar ArmParser;
options { tokenVocab=ArmLexer; }
//options{k=10;}
compilationUnit: program EOF;

program: statement (NEWLINE statement)*;

statement: COMMENT | COMMENTM | instruction;

instruction : data_processing_instruction
            //| multiply_instruction
            | branch_instruction
            //| status_register_transfer_instruction
            | load_store_instruction
            //| coprocessor_instruction
            //| exception_generation_instruction
            ;

cond: EQ| NE | CS | CC | MI | PL | VS | VC | HI | LS | GE | LT | GT | LE | AL;
reg: (R0|R1|R2|R3|R4|R5|R6|R7|R8|R9|R10|R11|R12|R13|R14|R15);

immediate : '#' (HEX|NUMBER);
/* ==================================

          BRANCH INSTRUCTIONS

   ==================================*/

branch_instruction: opcode=(Branch|BranchAndLink|BLX|BX|BXJ) cond? labelReference;

/* ==================================

   DATA PROCESSING OPERATIONS SECTION

   ==================================*/
data_processing_instruction : opcode=(MOV|MVN) cond? UPDATEFLAG? reg ',' shifter_operand # moveOp
                            | opcode=(CMP|CMN|TST|TEQ) cond? reg ',' shifter_operand # compareOp
                            | opcode=(ADD|SUB|RSB|ADC|SBC|RSC|AND|BIC|EOR|ORR) cond? UPDATEFLAG? reg ',' reg ',' shifter_operand # arithmeticOp;

shifter_operand : immediate                 # op2immediate
                | reg                       # op2register
                | reg ',' shift_operation   # op2inlineShift
                ;

shift_operation : shiftopcode immediate     # shiftByImmediate
                | shiftopcode reg           # shiftByRegister
                | RRX                       # rotateWithExtend
                ;

shiftopcode: LSL | LSR | ASR | ROR;



/* ==================================

       A 3.5 MULTIPLY INSTRUCTIONS
        TODO: MORE INSTRUCTIONS FOR MULTIPLICATION
   ==================================*/

multiply_instruction : opcode=(MUL|MLA) cond ? reg ',' reg ',' reg #normalMul
                     | opcode=(SMULL|UMULL|SMLAL|UMLAL) cond ? reg ',' reg ',' reg ',' reg #longMul;

/* ==================================

    TODO: A3.6 PARALLEL ADDITION

   ==================================*/

/* ==================================

  TODO: A3.7 EXTEND INSTRUCTIONS

   ==================================*/

/* ==================================

   TODO: A3.8 Miscellaneous arithmetic instructions

   ==================================*/

/* ==================================

  TODO: A3.10 CPSR Access instructions

  ==================================*/


/* ==================================

   A3.11 LOAD AND STORE WORD OR UNSIGNED BYTE

   ==================================*/

//TODO IMPLEMENT ALL
load_store_instruction : opcode=(LDR|STR) cond? BYTEACCESS? PRIVILEGE? reg ',' addressing_mode #firstLoadStore
                       | opcode=(LDR|STR) cond? (DOUBLEWORD|HALFWORD|SIGNEDHALFWORD|SIGNEDBYTE) reg ',' addressing_mode #secondLoadStore;

//TODO: A3.12 Load and Store Multiple
//TODO: A3.13 Semaphore Instructions

addressing_mode : '['  baseRegister=(R0|R1|R2|R3|R4|R5|R6|R7|R8|R9|R10|R11|R12|R13|R14|R15) (',' shifter_operand )?']'  #normalAddressing
                | '['  baseRegister=(R0|R1|R2|R3|R4|R5|R6|R7|R8|R9|R10|R11|R12|R13|R14|R15) (',' shifter_operand )?']!' #preIndexedAddressing
                | '['  baseRegister=(R0|R1|R2|R3|R4|R5|R6|R7|R8|R9|R10|R11|R12|R13|R14|R15) ']' ','  shifter_operand    #postIndexedAddressing;

labelReference: LABELTEXT;
//immediate : '#' NUMBER;