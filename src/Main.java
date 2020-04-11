import com.sun.scenario.effect.impl.prism.PrCropPeer;
import de.ARMv5Processor.core.Processor;
import de.ARMv5Processor.instructions.Instruction;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.ArmLexer;
import parser.ArmParser;
import parserAddons.CommandPreparator;
import parserAddons.CommandTreeListener;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream charStream = CharStreams.fromFileName("testinput/myprogram.s");

        ArmLexer armLexer = new ArmLexer(charStream);
        CommonTokenStream  commonTokenStream = new CommonTokenStream(armLexer);
        ArmParser armParser = new ArmParser(commonTokenStream);

        ParseTree parseTree = armParser.compilationUnit();
        CommandPreparator visitor = new CommandPreparator();
        visitor.visit(parseTree);

        visitor.program.forEach(System.out::println);

        Processor p = new Processor();
        p.imem = visitor.program.toArray(p.imem);

        while(p.nextInstruction()!=null){
            p.emulateCycle();
        }

        System.out.println("RETURN: "+Integer.toUnsignedString(p.rf.get(0)));
    }
}
