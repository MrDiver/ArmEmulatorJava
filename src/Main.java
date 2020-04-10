import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.ArmLexer;
import parser.ArmParser;
import parserAddons.CommandTreeListener;
import OLDCPU.Processor;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream charStream = CharStreams.fromFileName("testinput/mov.s");

        ArmLexer armLexer = new ArmLexer(charStream);
        CommonTokenStream  commonTokenStream = new CommonTokenStream(armLexer);
        ArmParser armParser = new ArmParser(commonTokenStream);

        ParseTree parseTree = armParser.program();
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        Processor processor = new Processor();
        CommandTreeListener treeListener = new CommandTreeListener(processor);
        treeWalker.walk(treeListener,parseTree);

    }
}
