
    mov r2,#5

main:
    MOV r0,#1
    MOV r1,#1
    CMP r0,r0
    MOVNE r0,#5
    ADD r0,r0,#20
    ADD r0,r0,r0
    mov r0,r2
    bx lr