package parserAddons;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.ArmParser;
import parser.ArmParserListener;
import OLDCPU.Processor;

public class CommandTreeListener implements ArmParserListener{
    Processor p;
    public CommandTreeListener(Processor processor) {
        p = processor;
    }

    @Override
    public void enterProgram(ArmParser.ProgramContext ctx) {

    }

    @Override
    public void exitProgram(ArmParser.ProgramContext ctx) {

    }

    @Override
    public void enterSequence(ArmParser.SequenceContext ctx) {

    }

    @Override
    public void exitSequence(ArmParser.SequenceContext ctx) {

    }

    @Override
    public void enterOp(ArmParser.OpContext ctx) {

    }

    @Override
    public void exitOp(ArmParser.OpContext ctx) {

    }

    @Override
    public void enterMov(ArmParser.MovContext ctx) {
        System.out.println("+ "+ ctx.getText());
    }

    @Override
    public void exitMov(ArmParser.MovContext ctx) {

    }

    @Override
    public void enterAdd(ArmParser.AddContext ctx) {
        System.out.println("+ "+ ctx.getText());
    }

    @Override
    public void exitAdd(ArmParser.AddContext ctx) {

    }

    @Override
    public void enterS(ArmParser.SContext ctx) {

    }

    @Override
    public void exitS(ArmParser.SContext ctx) {

    }

    @Override
    public void enterCond(ArmParser.CondContext ctx) {

    }

    @Override
    public void exitCond(ArmParser.CondContext ctx) {

    }

    @Override
    public void enterRd(ArmParser.RdContext ctx) {

    }

    @Override
    public void exitRd(ArmParser.RdContext ctx) {

    }

    @Override
    public void enterRn(ArmParser.RnContext ctx) {

    }

    @Override
    public void exitRn(ArmParser.RnContext ctx) {

    }

    @Override
    public void enterOperand2(ArmParser.Operand2Context ctx) {

    }

    @Override
    public void exitOperand2(ArmParser.Operand2Context ctx) {

    }

    @Override
    public void enterLabel(ArmParser.LabelContext ctx) {

    }

    @Override
    public void exitLabel(ArmParser.LabelContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
