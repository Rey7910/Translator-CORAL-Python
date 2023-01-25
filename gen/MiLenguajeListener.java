// Generated from C:/Reyci/Universidad Nacional/Sexto Semestre/Lenguajes/Traductor/listeners/grammar\MiLenguaje.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeParser}.
 */
public interface MiLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#start_grammar}.
	 * @param ctx the parse tree
	 */
	void enterStart_grammar(MiLenguajeParser.Start_grammarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#start_grammar}.
	 * @param ctx the parse tree
	 */
	void exitStart_grammar(MiLenguajeParser.Start_grammarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#function_main}.
	 * @param ctx the parse tree
	 */
	void enterFunction_main(MiLenguajeParser.Function_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#function_main}.
	 * @param ctx the parse tree
	 */
	void exitFunction_main(MiLenguajeParser.Function_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MiLenguajeParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MiLenguajeParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#substatement}.
	 * @param ctx the parse tree
	 */
	void enterSubstatement(MiLenguajeParser.SubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#substatement}.
	 * @param ctx the parse tree
	 */
	void exitSubstatement(MiLenguajeParser.SubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#decs}.
	 * @param ctx the parse tree
	 */
	void enterDecs(MiLenguajeParser.DecsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#decs}.
	 * @param ctx the parse tree
	 */
	void exitDecs(MiLenguajeParser.DecsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#return_functions}.
	 * @param ctx the parse tree
	 */
	void enterReturn_functions(MiLenguajeParser.Return_functionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#return_functions}.
	 * @param ctx the parse tree
	 */
	void exitReturn_functions(MiLenguajeParser.Return_functionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(MiLenguajeParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(MiLenguajeParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#array_size}.
	 * @param ctx the parse tree
	 */
	void enterArray_size(MiLenguajeParser.Array_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#array_size}.
	 * @param ctx the parse tree
	 */
	void exitArray_size(MiLenguajeParser.Array_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiLenguajeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiLenguajeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(MiLenguajeParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(MiLenguajeParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#op_arith}.
	 * @param ctx the parse tree
	 */
	void enterOp_arith(MiLenguajeParser.Op_arithContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#op_arith}.
	 * @param ctx the parse tree
	 */
	void exitOp_arith(MiLenguajeParser.Op_arithContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#op_logic}.
	 * @param ctx the parse tree
	 */
	void enterOp_logic(MiLenguajeParser.Op_logicContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#op_logic}.
	 * @param ctx the parse tree
	 */
	void exitOp_logic(MiLenguajeParser.Op_logicContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#op_binarie}.
	 * @param ctx the parse tree
	 */
	void enterOp_binarie(MiLenguajeParser.Op_binarieContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#op_binarie}.
	 * @param ctx the parse tree
	 */
	void exitOp_binarie(MiLenguajeParser.Op_binarieContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#index_array}.
	 * @param ctx the parse tree
	 */
	void enterIndex_array(MiLenguajeParser.Index_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#index_array}.
	 * @param ctx the parse tree
	 */
	void exitIndex_array(MiLenguajeParser.Index_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#access_array}.
	 * @param ctx the parse tree
	 */
	void enterAccess_array(MiLenguajeParser.Access_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#access_array}.
	 * @param ctx the parse tree
	 */
	void exitAccess_array(MiLenguajeParser.Access_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#arith}.
	 * @param ctx the parse tree
	 */
	void enterArith(MiLenguajeParser.ArithContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#arith}.
	 * @param ctx the parse tree
	 */
	void exitArith(MiLenguajeParser.ArithContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#condex}.
	 * @param ctx the parse tree
	 */
	void enterCondex(MiLenguajeParser.CondexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#condex}.
	 * @param ctx the parse tree
	 */
	void exitCondex(MiLenguajeParser.CondexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MiLenguajeParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MiLenguajeParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#entrance}.
	 * @param ctx the parse tree
	 */
	void enterEntrance(MiLenguajeParser.EntranceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#entrance}.
	 * @param ctx the parse tree
	 */
	void exitEntrance(MiLenguajeParser.EntranceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MiLenguajeParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MiLenguajeParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(MiLenguajeParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(MiLenguajeParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(MiLenguajeParser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(MiLenguajeParser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(MiLenguajeParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(MiLenguajeParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(MiLenguajeParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(MiLenguajeParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(MiLenguajeParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(MiLenguajeParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#indentation}.
	 * @param ctx the parse tree
	 */
	void enterIndentation(MiLenguajeParser.IndentationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#indentation}.
	 * @param ctx the parse tree
	 */
	void exitIndentation(MiLenguajeParser.IndentationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(MiLenguajeParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(MiLenguajeParser.StringContext ctx);
}