
main:
    mov r1,#2
    mov r2,#2
    cmp r1,r2
    BEQ else
    mov r0,#5
    B end
else:
    mov r0,#10
end:
    bx lr

