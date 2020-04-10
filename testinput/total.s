//Immediate Operand Value
mov r0 , #2
mov r0,#2
add r3,r3,#1
cmp r7,#1000
bic r9,r8,#0xFF00
addeq r1,r2,#0
add r2,r2,r2

//Register operand value
MOV R2,R0
ADD R4,R3,R2
CMP R7,R8

//shifts
MOV R2, R0, LSL #2
ADD R9,R5,R5, LSL #3
RSB R0,R5,R5, LSL #3
SUB R10,r9,r8,lsr #4
mov r12, r4, ror r3

ldr r1,[r0]
ldr r8 , [r3,#4]
ldr r8, [r3,r5, LSL #2]
ldr r12,[r2,#-1]
str r2,[r1,#0100]

ldrb r1,[ r0 ]
ldrb r8 , [ r3 , #4 ]
ldrb r12,[ r2 , #-1 ]
strb r2,[ r1 , #0100 ]
ldrh r9, [ r3 , #2 ]
main:
cool:ldrsb r9, [ r6 ]
ldr r1,[ r0 , #4 ]!
ldr r1,[r2,#-2]!
fine:
ldr r1 , [ r0 ] , #4

MUL R4 , R2,R1
MULS R4 , R2,R1
MLA R4,R8,R9,R3
SMULL R4,R8,R9,R3

UMULL R4,R8,R9,R3
UMLAL R4,R8,R9,R3

B MAIN
BCC MAIN
BEQ MAIN
BL TEST