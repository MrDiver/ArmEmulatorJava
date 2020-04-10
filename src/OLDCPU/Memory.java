package OLDCPU;

import OLDCPU.instruction.Instruction;

import java.util.ArrayList;
import java.util.List;

public class Memory<T> {
    List<T> memory;

    public Memory() {
        this.memory = new ArrayList<>();
    }

    protected void write(int address,T value){
        if(address>=0&&address<memory.size()){
            memory.set(address,value);
        }else{
            System.err.println("Segmentation Fault: Accessing outside of Memory");
        }
    }

    protected T read(int address){
        if(address>=0&&address<memory.size()){
            return memory.get(address);
        }else{
            System.err.println("Segmentation Fault: Accessing outside of Memory");
            return null;
        }
    }

    public String readable(){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (T t:memory) {
            sb.append(i);
            if(t instanceof Instruction)
                sb.append(((Instruction) t).spelling);
            else
                sb.append(t);
            sb.append('\n');
            i+=4;
        }
        return sb.toString();
    }
}
