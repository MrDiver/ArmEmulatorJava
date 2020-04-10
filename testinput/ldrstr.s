ldr r1,[r0]
ldr r8,[r3,#4]
ldr r8,[r3,r5, LSL #2]
ldr r12,[r2,#-1]
str r2,[r1,#0100]

ldrb r1,[r0]
ldrb r8,[r3,#4]
ldrb r12,[r2,#-1]
strb r2,[r1,#0100]

ldr r1,[r0,#4]!
ldr r1,[r2,#-2]!

ldr r1,[r0],#4