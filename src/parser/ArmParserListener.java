// Generated from H:/MyStuff/PrivateProjects/ArmEmulatorJava/src/grammar\ArmParser.g4 by ANTLR 4.8
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArmParser}.
 */
public interface ArmParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArmParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ArmParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArmParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ArmParser.CompilationUnitContext ctx);
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
	 * Enter a parse tree produced by {@link ArmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ArmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ArmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArmParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(ArmParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArmParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(ArmParser.InstructionContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link ArmParser#reg}.
	 * @param ctx the parse tree
	 */
	void enterReg(ArmParser.RegContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArmParser#reg}.
	 * @param ctx the parse tree
	 */
	void exitReg(ArmParser.RegContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArmParser#labelReference}.
	 * @param ctx the parse tree
	 */
	void enterLabelReference(ArmParser.LabelReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArmParser#labelReference}.
	 * @param ctx the parse tree
	 */
	void exitLabelReference(ArmParser.LabelReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArmParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(ArmParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArmParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(ArmParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArmParser#immediate}.
	 * @param ctx the parse tree
	 */
	void enterImmediate(ArmParser.ImmediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArmParser#immediate}.
	 * @param ctx the parse tree
	 */
	void exitImmediate(ArmParser.ImmediateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code branchToLabel}
	 * labeled alternative in {@link ArmParser#branch_instruction}.
	 * @param ctx the parse tree
	 */
	void enterBranchToLabel(ArmParser.BranchToLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code branchToLabel}
	 * labeled alternative in {@link ArmParser#branch_instruction}.
	 * @param ctx the parse tree
	 */
	void exitBranchToLabel(ArmParser.BranchToLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code branchToRegister}
	 * labeled alternative in {@link ArmParser#branch_instruction}.
	 * @param ctx the parse tree
	 */
	void enterBranchToRegister(ArmParser.BranchToRegisterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code branchToRegister}
	 * labeled alternative in {@link ArmParser#branch_instruction}.
	 * @param ctx the parse tree
	 */
	void exitBranchToRegister(ArmParser.BranchToRegisterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moveOp}
	 * labeled alternative in {@link ArmParser#data_processing_instruction}.
	 * @param ctx the parse tree
	 */
	void enterMoveOp(ArmParser.MoveOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moveOp}
	 * labeled alternative in {@link ArmParser#data_processing_instruction}.
	 * @param ctx the parse tree
	 */
	void exitMoveOp(ArmParser.MoveOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareOp}
	 * labeled alternative in {@link ArmParser#data_processing_instruction}.
	 * @param ctx the parse tree
	 */
	void enterCompareOp(ArmParser.CompareOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareOp}
	 * labeled alternative in {@link ArmParser#data_processing_instruction}.
	 * @param ctx the parse tree
	 */
	void exitCompareOp(ArmParser.CompareOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticOp}
	 * labeled alternative in {@link ArmParser#data_processing_instruction}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOp(ArmParser.ArithmeticOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticOp}
	 * labeled alternative in {@link ArmParser#data_processing_instruction}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOp(ArmParser.ArithmeticOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code op2immediate}
	 * labeled alternative in {@link ArmParser#shifter_operand}.
	 * @param ctx the parse tree
	 */
	void enterOp2immediate(ArmParser.Op2immediateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code op2immediate}
	 * labeled alternative in {@link ArmParser#shifter_operand}.
	 * @param ctx the parse tree
	 */
	void exitOp2immediate(ArmParser.Op2immediateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code op2register}
	 * labeled alternative in {@link ArmParser#shifter_operand}.
	 * @param ctx the parse tree
	 */
	void enterOp2register(ArmParser.Op2registerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code op2register}
	 * labeled alternative in {@link ArmParser#shifter_operand}.
	 * @param ctx the parse tree
	 */
	void exitOp2register(ArmParser.Op2registerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code op2inlineShift}
	 * labeled alternative in {@link ArmParser#shifter_operand}.
	 * @param ctx the parse tree
	 */
	void enterOp2inlineShift(ArmParser.Op2inlineShiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code op2inlineShift}
	 * labeled alternative in {@link ArmParser#shifter_operand}.
	 * @param ctx the parse tree
	 */
	void exitOp2inlineShift(ArmParser.Op2inlineShiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftByImmediate}
	 * labeled alternative in {@link ArmParser#shift_operation}.
	 * @param ctx the parse tree
	 */
	void enterShiftByImmediate(ArmParser.ShiftByImmediateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftByImmediate}
	 * labeled alternative in {@link ArmParser#shift_operation}.
	 * @param ctx the parse tree
	 */
	void exitShiftByImmediate(ArmParser.ShiftByImmediateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shiftByRegister}
	 * labeled alternative in {@link ArmParser#shift_operation}.
	 * @param ctx the parse tree
	 */
	void enterShiftByRegister(ArmParser.ShiftByRegisterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shiftByRegister}
	 * labeled alternative in {@link ArmParser#shift_operation}.
	 * @param ctx the parse tree
	 */
	void exitShiftByRegister(ArmParser.ShiftByRegisterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rotateWithExtend}
	 * labeled alternative in {@link ArmParser#shift_operation}.
	 * @param ctx the parse tree
	 */
	void enterRotateWithExtend(ArmParser.RotateWithExtendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rotateWithExtend}
	 * labeled alternative in {@link ArmParser#shift_operation}.
	 * @param ctx the parse tree
	 */
	void exitRotateWithExtend(ArmParser.RotateWithExtendContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArmParser#shiftopcode}.
	 * @param ctx the parse tree
	 */
	void enterShiftopcode(ArmParser.ShiftopcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArmParser#shiftopcode}.
	 * @param ctx the parse tree
	 */
	void exitShiftopcode(ArmParser.ShiftopcodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalMul}
	 * labeled alternative in {@link ArmParser#multiply_instruction}.
	 * @param ctx the parse tree
	 */
	void enterNormalMul(ArmParser.NormalMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalMul}
	 * labeled alternative in {@link ArmParser#multiply_instruction}.
	 * @param ctx the parse tree
	 */
	void exitNormalMul(ArmParser.NormalMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code longMul}
	 * labeled alternative in {@link ArmParser#multiply_instruction}.
	 * @param ctx the parse tree
	 */
	void enterLongMul(ArmParser.LongMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code longMul}
	 * labeled alternative in {@link ArmParser#multiply_instruction}.
	 * @param ctx the parse tree
	 */
	void exitLongMul(ArmParser.LongMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code firstLoadStore}
	 * labeled alternative in {@link ArmParser#load_store_instruction}.
	 * @param ctx the parse tree
	 */
	void enterFirstLoadStore(ArmParser.FirstLoadStoreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code firstLoadStore}
	 * labeled alternative in {@link ArmParser#load_store_instruction}.
	 * @param ctx the parse tree
	 */
	void exitFirstLoadStore(ArmParser.FirstLoadStoreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code secondLoadStore}
	 * labeled alternative in {@link ArmParser#load_store_instruction}.
	 * @param ctx the parse tree
	 */
	void enterSecondLoadStore(ArmParser.SecondLoadStoreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code secondLoadStore}
	 * labeled alternative in {@link ArmParser#load_store_instruction}.
	 * @param ctx the parse tree
	 */
	void exitSecondLoadStore(ArmParser.SecondLoadStoreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code normalAddressing}
	 * labeled alternative in {@link ArmParser#addressing_mode}.
	 * @param ctx the parse tree
	 */
	void enterNormalAddressing(ArmParser.NormalAddressingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code normalAddressing}
	 * labeled alternative in {@link ArmParser#addressing_mode}.
	 * @param ctx the parse tree
	 */
	void exitNormalAddressing(ArmParser.NormalAddressingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preIndexedAddressing}
	 * labeled alternative in {@link ArmParser#addressing_mode}.
	 * @param ctx the parse tree
	 */
	void enterPreIndexedAddressing(ArmParser.PreIndexedAddressingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preIndexedAddressing}
	 * labeled alternative in {@link ArmParser#addressing_mode}.
	 * @param ctx the parse tree
	 */
	void exitPreIndexedAddressing(ArmParser.PreIndexedAddressingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postIndexedAddressing}
	 * labeled alternative in {@link ArmParser#addressing_mode}.
	 * @param ctx the parse tree
	 */
	void enterPostIndexedAddressing(ArmParser.PostIndexedAddressingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postIndexedAddressing}
	 * labeled alternative in {@link ArmParser#addressing_mode}.
	 * @param ctx the parse tree
	 */
	void exitPostIndexedAddressing(ArmParser.PostIndexedAddressingContext ctx);
}