package parserAddons;

import de.ARMv5Processor.core.Processor;
import de.ARMv5Processor.instructions.Condition;
import de.ARMv5Processor.instructions.Instruction;
import de.ARMv5Processor.instructions.ProcessorRoutine;
import de.ARMv5Processor.instructions.SourceLocation;
import org.antlr.v4.runtime.ParserRuleContext;
import parser.ArmParser;
import parser.ArmParserBaseVisitor;

import javax.xml.transform.Source;
import java.util.LinkedList;
import java.util.List;

import static de.ARMv5Processor.architecture.Aluops.NOT;
import static de.ARMv5Processor.instructions.Condition.AL;

public class CommandPreparator extends ArmParserBaseVisitor {
    public List<Instruction> program;
    public CommandPreparator() {
        this.program = new LinkedList<>();
    }

    private <T> T specialVisit(ParserRuleContext ctx, T def)
    {
        if(ctx!=null)
        {
            return (T) visit(ctx);
        }
        else
            return def;
    }

    private SourceLocation toSL(ParserRuleContext ctx){
        return new SourceLocation(ctx.start.getLine(),ctx.start.getCharPositionInLine(),ctx.stop.getLine(),ctx.stop.getCharPositionInLine());
    }

    @Override
    public Object visitMoveOp(ArmParser.MoveOpContext ctx) {
        boolean updateFlags = ctx.UPDATEFLAG()!=null;
        int rd = (Integer) visit(ctx.reg());
        Condition cond = specialVisit(ctx.cond(),AL);

        ProcessorRoutine mov = (p)->{
            if(updateFlags)
            p.alu.updateFlags();
            ProcessorInstruction f = (ProcessorInstruction) visit(ctx.shifter_operand());
            int value = f.getValue(p);
            if(ctx.MVN()!=null)
            {
                value = p.alu.calculate(NOT,value,0);
            }
            p.rf.set(rd,value);
        };
        Instruction inst = new Instruction(cond,mov,toSL(ctx),ctx.getText());
        program.add(inst);
        return inst;
    }

    @Override
    public ProcessorInstruction visitOp2immediate(ArmParser.Op2immediateContext ctx) {
        //System.out.println("VISIT OP2 IMMEDIATE");
        ProcessorInstruction f = (p)->(Integer) visit(ctx.immediate());
        return f;
    }

    @Override
    public ProcessorInstruction visitOp2register(ArmParser.Op2registerContext ctx) {
        int rn = ((Integer)visit(ctx.reg())).intValue();
        return (p)->p.rf.get(rn);
    }

    @Override
    public Object visitOp2inlineShift(ArmParser.Op2inlineShiftContext ctx) {
        throw new RuntimeException("INLINE SHIFT NOT IMPLEMENTED");
    }

    @Override
    public Integer visitImmediate(ArmParser.ImmediateContext ctx) {
        if(ctx.HEX()!=null)
        {
            return Integer.parseInt(ctx.HEX().getText());
        }else
            return Integer.parseInt(ctx.NUMBER().getText());
    }

    @Override
    public Condition visitCond(ArmParser.CondContext ctx) {
        if(ctx.EQ()!=null)
            return Condition.EQ;
        else if(ctx.NE()!=null)
            return Condition.NE;
        else if(ctx.CS()!=null)
            return Condition.CS;
        else if(ctx.CC()!=null)
            return Condition.CC;
        else if(ctx.MI()!=null)
            return Condition.MI;
        else if(ctx.PL()!=null)
            return Condition.PL;
        else if(ctx.VS()!=null)
            return Condition.VS;
        else if(ctx.VC()!=null)
            return Condition.VC;
        else if(ctx.HI()!=null)
            return Condition.HI;
        else if(ctx.LS()!=null)
            return Condition.LS;
        else if(ctx.GE()!=null)
            return Condition.GE;
        else if(ctx.LT()!=null)
            return Condition.LT;
        else if(ctx.GT()!=null)
            return Condition.GT;
        else if(ctx.LE()!=null)
            return Condition.LE;
        else if(ctx.AL()!=null)
            return AL;
        else
            return AL;
    }

    @Override
    public Integer visitReg(ArmParser.RegContext ctx) {
        Integer n;
        if(ctx.R0()!=null)
            n = 0;
        else if(ctx.R1()!=null)
            n = 1;
        else if(ctx.R2()!=null)
            n = 2;
        else if(ctx.R3()!=null)
            n = 3;
        else if(ctx.R4()!=null)
            n = 4;
        else if(ctx.R5()!=null)
            n = 5;
        else if(ctx.R6()!=null)
            n = 6;
        else if(ctx.R7()!=null)
            n = 7;
        else if(ctx.R8()!=null)
            n = 8;
        else if(ctx.R9()!=null)
            n = 9;
        else if(ctx.R10()!=null)
            n = 10;
        else if(ctx.R11()!=null)
            n = 11;
        else if(ctx.R12()!=null)
            n = 12;
        else if(ctx.R13()!=null)
            n = 13;
        else if(ctx.R14()!=null)
            n = 14;
        else if(ctx.R15()!=null)
            n = 15;
        else
            n = -1;
        return n;
    }
}
