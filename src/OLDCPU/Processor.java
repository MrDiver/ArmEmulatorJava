package OLDCPU;

import OLDCPU.instruction.Instruction;

public class Processor {
    public RegisterFile registerFile = new RegisterFile();
    public Memory<Instruction> instructionMemory = new Memory<>();
    public Memory<Integer> dataMemory = new Memory<>();
    //CurrentProgramStatusRegister
    public StatusFlags cpsr = new StatusFlags();


    public void pulse(){
        //Fetch
        Instruction inst = instructionMemory.read(registerFile.PC());
        // Decode and Execute inside Instruction for more readable code
        inst.preExecute(registerFile,dataMemory, cpsr);
        registerFile.PC(registerFile.PC()+1);
    }

    public void addInstruction(Instruction inst){
        instructionMemory.memory.add(inst);
    }
}
