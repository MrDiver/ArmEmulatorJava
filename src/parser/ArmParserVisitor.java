// Generated from H:/MyStuff/PrivateProjects/ArmEmulatorJava/src/grammar\ArmParser.g4 by ANTLR 4.8
package parser;
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
	 * Visit a parse tree produced by {@link ArmParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(ArmParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ArmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ArmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArmParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(ArmParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArmParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(ArmParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArmParser#reg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReg(ArmParser.RegContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArmParser#immediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmediate(ArmParser.ImmediateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArmParser#branch_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch_instruction(ArmParser.Branch_instructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moveOp}
	 * labeled alternative in {@link ArmParser#data_processing_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveOp(ArmParser.MoveOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareOp}
	 * labeled alternative in {@link ArmParser#data_processing_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOp(ArmParser.CompareOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticOp}
	 * labeled alternative in {@link ArmParser#data_processing_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOp(ArmParser.ArithmeticOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code op2immediate}
	 * labeled alternative in {@link ArmParser#shifter_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2immediate(ArmParser.Op2immediateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code op2register}
	 * labeled alternative in {@link ArmParser#shifter_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2register(ArmParser.Op2registerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code op2inlineShift}
	 * labeled alternative in {@link ArmParser#shifter_operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2inlineShift(ArmParser.Op2inlineShiftContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftByImmediate}
	 * labeled alternative in {@link ArmParser#shift_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftByImmediate(ArmParser.ShiftByImmediateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shiftByRegister}
	 * labeled alternative in {@link ArmParser#shift_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftByRegister(ArmParser.ShiftByRegisterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rotateWithExtend}
	 * labeled alternative in {@link ArmParser#shift_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotateWithExtend(ArmParser.RotateWithExtendContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArmParser#shiftopcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftopcode(ArmParser.ShiftopcodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalMul}
	 * labeled alternative in {@link ArmParser#multiply_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalMul(ArmParser.NormalMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code longMul}
	 * labeled alternative in {@link ArmParser#multiply_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongMul(ArmParser.LongMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code firstLoadStore}
	 * labeled alternative in {@link ArmParser#load_store_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstLoadStore(ArmParser.FirstLoadStoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code secondLoadStore}
	 * labeled alternative in {@link ArmParser#load_store_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondLoadStore(ArmParser.SecondLoadStoreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code normalAddressing}
	 * labeled alternative in {@link ArmParser#addressing_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalAddressing(ArmParser.NormalAddressingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preIndexedAddressing}
	 * labeled alternative in {@link ArmParser#addressing_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIndexedAddressing(ArmParser.PreIndexedAddressingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postIndexedAddressing}
	 * labeled alternative in {@link ArmParser#addressing_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIndexedAddressing(ArmParser.PostIndexedAddressingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArmParser#labelReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelReference(ArmParser.LabelReferenceContext ctx);
}