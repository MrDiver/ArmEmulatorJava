# ARMv5 Emulator in Java

The purpose of this project is to implement a fully functional ARMv5 Emulator (maybe just a simulator in the end) in Java.

It should parse ARM Assembler files and execute them


## Current instruction set
  MOV|MVN|CMP|CMN|TST|TEQ|ADD|SUB|RSB|ADC|SBC|RSC|AND|BIC|EOR|ORR

## known issues
 - Grammar can't accept inline shifts with LSL#2 without a space
 

# planned features

- A GUI for interaction with the processor and loading files
- A debugger with breakpoints
