package OLDCPU.instruction;

import OLDCPU.Memory;
import OLDCPU.RegisterFile;
import OLDCPU.StatusFlags;

public class DataProcessingInstruction extends Instruction{
    public DataOperation operation;
    public boolean updateFlags;
    public byte rd;
    public byte rn;
    public Operand2 op2Type;
    public int a,b;

    public DataProcessingInstruction(Condition condition, DataOperation operation, boolean updateFlags, byte rd, byte rn, Operand2 op2Type, int a, int b,int line) {
        super(condition);
        this.operation = operation;
        this.updateFlags = updateFlags;
        this.rd = rd;
        this.rn = rn;
        this.op2Type = op2Type;
        this.a = a;
        this.b = b;
        this.line = line;
    }

    @Override
    public String toBits() {
        return "000000000000000000000001";
    }

    @Override
    public void execute(RegisterFile rf, Memory<Integer> data, StatusFlags cpsr) {
        int valRn=0,op2=0;

        //Prepare operand 2
        switch(op2Type){
            case shift:
                op2 = b;
                System.err.println("SHIFT NOT IMPLEMENTED YET");
                break;
            case imm:
                op2 = b;
                System.err.println("SHIFT NOT IMPLEMENTED YET");
                break;
        }

        valRn = rf.get(rn);
        int result = 0;
        int tmp=0;
        switch (operation){
            case AND:
                result = valRn&op2;
                break;
            case EOR:
                result = valRn^op2;
                break;
            case SUB:
                result = valRn-op2;
                break;
            case RSB:
                result = op2-valRn;
                break;
            case ADD:
                result = valRn+op2;
                break;
            case ADC:
                result = valRn + op2  + (cpsr.C()?1:0);
                break;
            case SBC:
                result = valRn - op2  + (cpsr.C()?0:1);
                break;
            case RSC:
                result = op2 - valRn  + (cpsr.C()?0:1);
                break;
            case TST:
                tmp = valRn&op2;
                //TODO: TST
                break;
            case TEW:
                //TODO: TEW
                break;
            case CMP:
                tmp = valRn-op2;
                updateCPSR(cpsr,tmp,true);
                break;
            case CMN:
                //TODO: CMN
                break;
            case ORR:
                //TODO: ORR
                break;
            case MOV:
                result = op2;
                break;
            case BIC:
                //TODO: BIC
                break;
            case MVN:
                //TODO: MVN
                break;
        }
        rf.set(rd,result);
    }
}
