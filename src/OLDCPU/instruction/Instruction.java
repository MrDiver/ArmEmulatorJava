package OLDCPU.instruction;

import OLDCPU.Memory;
import OLDCPU.RegisterFile;
import OLDCPU.StatusFlags;

public abstract class Instruction implements Bits{
    int line = 0;
    public String spelling = "";

    Condition condition;

    public Instruction(Condition condition){
        this.condition = condition;
    }

    public void preExecute(RegisterFile registerFile, Memory<Integer> dataMemory, StatusFlags cpsr){
        switch (condition){
            case EQ:
                if(cpsr.Z()) break; else return;
            case NE:
                if(!cpsr.Z()) break; else return;
            case CS:
                if(cpsr.C()) break; else return;
            case CC:
                if(!cpsr.C()) break; else return;
            case MI:
                if(cpsr.N()) break; else return;
            case PL:
                if(!cpsr.N()) break; else return;
            case VS:
                if(cpsr.V()) break; else return;
            case VC:
                if(!cpsr.V()) break; else return;
            case HI:
                if(cpsr.V()&&(!cpsr.Z())) break; else return;
            case LS:
                if((!cpsr.V())||cpsr.Z()) break; else return;
            case GE:
                if(cpsr.N()==cpsr.V()) break; else return;
            case LT:
                if(cpsr.N()!=cpsr.V()) break; else return;
            case GT:
                if((!cpsr.Z())&&(cpsr.N()==cpsr.V())) break; else return;
            case LE:
                if((cpsr.Z())||(cpsr.N()!=cpsr.V())) break; else return;
            case AL:
                break;
            default:
                return;
        }
        execute(registerFile,dataMemory,cpsr);
    }

    public static void updateCPSR(StatusFlags cpsr,int value){
        updateCPSR(cpsr,value,false);
    }

    public static void updateCPSR(StatusFlags cpsr,int value,boolean isSub){
        cpsr.Z(value==0);
        cpsr.N(value<0);
        cpsr.C(value>Math.pow(2,32));
        if(isSub)
            cpsr.C(value>=0);
    }

    protected abstract void execute(RegisterFile registerFile, Memory<Integer> dataMemory, StatusFlags statusFlagRegister);
}
