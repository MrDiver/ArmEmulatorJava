// Generated from H:/MyStuff/PrivateProjects/ArmEmulatorJava/src/grammar\ArmParser.g4 by ANTLR 4.8
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArmParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ArmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArmParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(ArmParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArmParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(ArmParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArmParser#mov}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMov(ArmParser.MovContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArmParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(ArmParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArmParser#rd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRd(ArmParser.RdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArmParser#rn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRn(ArmParser.RnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArmParser#operand2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand2(ArmParser.Operand2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ArmParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(ArmParser.CondContext ctx);
}