package OLDCPU;

public class RegisterFile {
    private int[] register = new int[15];
    public void set(byte index,int value){
        register[index&0x00001111] = value;
    }
    public int get(int index){
        return register[index&0x00001111];
    }
    protected int SP(){
        return register[13];
    }
    protected int LR(){
        return register[14];
    }
    protected int PC(){
        return register[14];
    }
    protected void SP(int val){
        register[13]=val;
    }
    protected void LR(int val){
        register[14]=val;
    }
    protected void PC(int val){
        register[14]=val;
    }
}
