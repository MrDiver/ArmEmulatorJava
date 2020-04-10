package parserAddons;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import parser.ArmParser;
import parser.ArmParserVisitor;

public class CommandTreeWalker implements ArmParserVisitor {
    @Override
    public Object visitProgram(ArmParser.ProgramContext ctx) {
        return null;
    }

    @Override
    public Object visitSequence(ArmParser.SequenceContext ctx) {
        return null;
    }

    @Override
    public Object visitOp(ArmParser.OpContext ctx) {
        return null;
    }

    @Override
    public Object visitMov(ArmParser.MovContext ctx) {
        return null;
    }

    @Override
    public Object visitAdd(ArmParser.AddContext ctx) {
        return null;
    }

    @Override
    public Object visitS(ArmParser.SContext ctx) {
        return null;
    }

    @Override
    public Object visitCond(ArmParser.CondContext ctx) {
        return null;
    }

    @Override
    public Object visitRd(ArmParser.RdContext ctx) {
        return null;
    }

    @Override
    public Object visitRn(ArmParser.RnContext ctx) {
        return null;
    }

    @Override
    public Object visitOperand2(ArmParser.Operand2Context ctx) {
        return null;
    }

    @Override
    public Object visitLabel(ArmParser.LabelContext ctx) {
        return null;
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
