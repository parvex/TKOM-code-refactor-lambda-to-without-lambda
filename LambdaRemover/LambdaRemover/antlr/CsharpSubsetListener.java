// Generated from CsharpSubset.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CsharpSubsetParser}.
 */
public interface CsharpSubsetListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CsharpSubsetParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CsharpSubsetParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#usingStmnt}.
	 * @param ctx the parse tree
	 */
	void enterUsingStmnt(CsharpSubsetParser.UsingStmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#usingStmnt}.
	 * @param ctx the parse tree
	 */
	void exitUsingStmnt(CsharpSubsetParser.UsingStmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#classInitialization}.
	 * @param ctx the parse tree
	 */
	void enterClassInitialization(CsharpSubsetParser.ClassInitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#classInitialization}.
	 * @param ctx the parse tree
	 */
	void exitClassInitialization(CsharpSubsetParser.ClassInitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(CsharpSubsetParser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#classDefinition}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(CsharpSubsetParser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDefinition(CsharpSubsetParser.PropertyDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDefinition(CsharpSubsetParser.PropertyDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void enterMethodDefinition(CsharpSubsetParser.MethodDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#methodDefinition}.
	 * @param ctx the parse tree
	 */
	void exitMethodDefinition(CsharpSubsetParser.MethodDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#stmnt}.
	 * @param ctx the parse tree
	 */
	void enterStmnt(CsharpSubsetParser.StmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#stmnt}.
	 * @param ctx the parse tree
	 */
	void exitStmnt(CsharpSubsetParser.StmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(CsharpSubsetParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(CsharpSubsetParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#assignStmnt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmnt(CsharpSubsetParser.AssignStmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#assignStmnt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmnt(CsharpSubsetParser.AssignStmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#returnStmnt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmnt(CsharpSubsetParser.ReturnStmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#returnStmnt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmnt(CsharpSubsetParser.ReturnStmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CsharpSubsetParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CsharpSubsetParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void enterMathExpression(CsharpSubsetParser.MathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#mathExpression}.
	 * @param ctx the parse tree
	 */
	void exitMathExpression(CsharpSubsetParser.MathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#methodCallStmnt}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallStmnt(CsharpSubsetParser.MethodCallStmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#methodCallStmnt}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallStmnt(CsharpSubsetParser.MethodCallStmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(CsharpSubsetParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(CsharpSubsetParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(CsharpSubsetParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(CsharpSubsetParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#typedArgList}.
	 * @param ctx the parse tree
	 */
	void enterTypedArgList(CsharpSubsetParser.TypedArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#typedArgList}.
	 * @param ctx the parse tree
	 */
	void exitTypedArgList(CsharpSubsetParser.TypedArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(CsharpSubsetParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(CsharpSubsetParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(CsharpSubsetParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(CsharpSubsetParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CsharpSubsetParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CsharpSubsetParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(CsharpSubsetParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(CsharpSubsetParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#delegateType}.
	 * @param ctx the parse tree
	 */
	void enterDelegateType(CsharpSubsetParser.DelegateTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#delegateType}.
	 * @param ctx the parse tree
	 */
	void exitDelegateType(CsharpSubsetParser.DelegateTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsharpSubsetParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompileUnit(CsharpSubsetParser.CompileUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsharpSubsetParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompileUnit(CsharpSubsetParser.CompileUnitContext ctx);
}