// Generated from H:/MyStuff/PrivateProjects/ArmEmulatorJava/src/grammar\ArmParser.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArmParser}.
 */
public interface ArmParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ArmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ArmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArmParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(ArmParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArmParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(ArmParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArmParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(ArmParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArmParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(ArmParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArmParser#mov}.
	 * @param ctx the parse tree
	 */
	void enterMov(ArmParser.MovContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArmParser#mov}.
	 * @param ctx the parse tree
	 */
	void exitMov(ArmParser.MovContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArmParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ArmParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArmParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ArmParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArmParser#rd}.
	 * @param ctx the parse tree
	 */
	void enterRd(ArmParser.RdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArmParser#rd}.
	 * @param ctx the parse tree
	 */
	void exitRd(ArmParser.RdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArmParser#rn}.
	 * @param ctx the parse tree
	 */
	void enterRn(ArmParser.RnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArmParser#rn}.
	 * @param ctx the parse tree
	 */
	void exitRn(ArmParser.RnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArmParser#operand2}.
	 * @param ctx the parse tree
	 */
	void enterOperand2(ArmParser.Operand2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ArmParser#operand2}.
	 * @param ctx the parse tree
	 */
	void exitOperand2(ArmParser.Operand2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ArmParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(ArmParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArmParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(ArmParser.CondContext ctx);
}