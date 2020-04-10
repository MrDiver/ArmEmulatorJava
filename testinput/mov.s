//Immediate Operand Value
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