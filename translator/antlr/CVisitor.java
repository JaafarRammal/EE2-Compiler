// Generated from C.g4 by ANTLR 4.8
package translator.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code multDef}
	 * labeled alternative in {@link CParser#translation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDef(CParser.MultDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tuDecl}
	 * labeled alternative in {@link CParser#translation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuDecl(CParser.TuDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tu_funcDef}
	 * labeled alternative in {@link CParser#translation_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTu_funcDef(CParser.Tu_funcDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(CParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#type_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_specifier(CParser.Type_specifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcDeclParam}
	 * labeled alternative in {@link CParser#fun_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclParam(CParser.FuncDeclParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcDecl}
	 * labeled alternative in {@link CParser#fun_declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(CParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multParam}
	 * labeled alternative in {@link CParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultParam(CParser.MultParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleParam}
	 * labeled alternative in {@link CParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleParam(CParser.SingleParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(CParser.Parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declBrackets}
	 * labeled alternative in {@link CParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclBrackets(CParser.DeclBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declId}
	 * labeled alternative in {@link CParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclId(CParser.DeclIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(CParser.Constant_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpStatementEmpty}
	 * labeled alternative in {@link CParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpStatementEmpty(CParser.CmpStatementEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpStatementNonEmpty}
	 * labeled alternative in {@link CParser#compound_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpStatementNonEmpty(CParser.CmpStatementNonEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleStatmentsDeclarationList}
	 * labeled alternative in {@link CParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleStatmentsDeclarationList(CParser.MultipleStatmentsDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleDeclarationList}
	 * labeled alternative in {@link CParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDeclarationList(CParser.SingleDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleStatement}
	 * labeled alternative in {@link CParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(CParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleStatments}
	 * labeled alternative in {@link CParser#statement_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleStatments(CParser.MultipleStatmentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(CParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectionStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(CParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterationStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(CParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(CParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(CParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lexprStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexprStatement(CParser.LexprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(CParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(CParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assgnOp}
	 * labeled alternative in {@link CParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssgnOp(CParser.AssgnOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orOp}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOp(CParser.OrOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpr(CParser.LogicalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assgnExpr}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssgnExpr(CParser.AssgnExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andOp}
	 * labeled alternative in {@link CParser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOp(CParser.AndOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link CParser#logical_and_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(CParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqOp}
	 * labeled alternative in {@link CParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOp(CParser.EqOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neqOp}
	 * labeled alternative in {@link CParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeqOp(CParser.NeqOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relExpr}
	 * labeled alternative in {@link CParser#equality_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(CParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code glOp}
	 * labeled alternative in {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlOp(CParser.GlOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leOp}
	 * labeled alternative in {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeOp(CParser.LeOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(CParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltOp}
	 * labeled alternative in {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtOp(CParser.LtOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code geOp}
	 * labeled alternative in {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeOp(CParser.GeOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addOp}
	 * labeled alternative in {@link CParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(CParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subOp}
	 * labeled alternative in {@link CParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubOp(CParser.SubOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpr}
	 * labeled alternative in {@link CParser#additive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(CParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divOp}
	 * labeled alternative in {@link CParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivOp(CParser.DivOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multOp}
	 * labeled alternative in {@link CParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOp(CParser.MultOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link CParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(CParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpr}
	 * labeled alternative in {@link CParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpr(CParser.PostfixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryOp}
	 * labeled alternative in {@link CParser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(CParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primExpr}
	 * labeled alternative in {@link CParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimExpr(CParser.PrimExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link CParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallParam}
	 * labeled alternative in {@link CParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallParam(CParser.FunctionCallParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrOp}
	 * labeled alternative in {@link CParser#postfix_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrOp(CParser.IncrOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lExpr}
	 * labeled alternative in {@link CParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLExpr(CParser.LExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intConst}
	 * labeled alternative in {@link CParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntConst(CParser.IntConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLit}
	 * labeled alternative in {@link CParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLit(CParser.StringLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link CParser#primary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(CParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprBrackets}
	 * labeled alternative in {@link CParser#l_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBrackets(CParser.ExprBracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprId}
	 * labeled alternative in {@link CParser#l_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(CParser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleExpr}
	 * labeled alternative in {@link CParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpr(CParser.SingleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleExpr}
	 * labeled alternative in {@link CParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleExpr(CParser.MultipleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(CParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link CParser#selection_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(CParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseStat}
	 * labeled alternative in {@link CParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(CParser.ElseStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link CParser#iteration_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(CParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleDecl}
	 * labeled alternative in {@link CParser#declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleDecl(CParser.MultipleDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleDecl}
	 * labeled alternative in {@link CParser#declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDecl(CParser.SingleDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decl}
	 * labeled alternative in {@link CParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(CParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assgn}
	 * labeled alternative in {@link CParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssgn(CParser.AssgnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleDeclarator}
	 * labeled alternative in {@link CParser#declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleDeclarator(CParser.MultipleDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleDeclarator}
	 * labeled alternative in {@link CParser#declarator_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDeclarator(CParser.SingleDeclaratorContext ctx);
}