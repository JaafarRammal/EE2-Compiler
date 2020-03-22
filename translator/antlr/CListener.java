// Generated from C.g4 by ANTLR 4.8
package translator.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code multDef}
	 * labeled alternative in {@link CParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterMultDef(CParser.MultDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDef}
	 * labeled alternative in {@link CParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitMultDef(CParser.MultDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tuDecl}
	 * labeled alternative in {@link CParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTuDecl(CParser.TuDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tuDecl}
	 * labeled alternative in {@link CParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTuDecl(CParser.TuDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tu_funcDef}
	 * labeled alternative in {@link CParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTu_funcDef(CParser.Tu_funcDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tu_funcDef}
	 * labeled alternative in {@link CParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTu_funcDef(CParser.Tu_funcDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(CParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(CParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void enterType_specifier(CParser.Type_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#type_specifier}.
	 * @param ctx the parse tree
	 */
	void exitType_specifier(CParser.Type_specifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcDeclParam}
	 * labeled alternative in {@link CParser#fun_declarator}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclParam(CParser.FuncDeclParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDeclParam}
	 * labeled alternative in {@link CParser#fun_declarator}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclParam(CParser.FuncDeclParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcDecl}
	 * labeled alternative in {@link CParser#fun_declarator}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(CParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDecl}
	 * labeled alternative in {@link CParser#fun_declarator}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(CParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multParam}
	 * labeled alternative in {@link CParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterMultParam(CParser.MultParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multParam}
	 * labeled alternative in {@link CParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitMultParam(CParser.MultParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleParam}
	 * labeled alternative in {@link CParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterSingleParam(CParser.SingleParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleParam}
	 * labeled alternative in {@link CParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitSingleParam(CParser.SingleParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(CParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(CParser.Parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declBrackets}
	 * labeled alternative in {@link CParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclBrackets(CParser.DeclBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declBrackets}
	 * labeled alternative in {@link CParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclBrackets(CParser.DeclBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declId}
	 * labeled alternative in {@link CParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclId(CParser.DeclIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declId}
	 * labeled alternative in {@link CParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclId(CParser.DeclIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(CParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(CParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmpStatementEmpty}
	 * labeled alternative in {@link CParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCmpStatementEmpty(CParser.CmpStatementEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmpStatementEmpty}
	 * labeled alternative in {@link CParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCmpStatementEmpty(CParser.CmpStatementEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmpStatementNonEmpty}
	 * labeled alternative in {@link CParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void enterCmpStatementNonEmpty(CParser.CmpStatementNonEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmpStatementNonEmpty}
	 * labeled alternative in {@link CParser#compound_statement}.
	 * @param ctx the parse tree
	 */
	void exitCmpStatementNonEmpty(CParser.CmpStatementNonEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleStatmentsDeclarationList}
	 * labeled alternative in {@link CParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterMultipleStatmentsDeclarationList(CParser.MultipleStatmentsDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleStatmentsDeclarationList}
	 * labeled alternative in {@link CParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitMultipleStatmentsDeclarationList(CParser.MultipleStatmentsDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleDeclarationList}
	 * labeled alternative in {@link CParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterSingleDeclarationList(CParser.SingleDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleDeclarationList}
	 * labeled alternative in {@link CParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitSingleDeclarationList(CParser.SingleDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleStatement}
	 * labeled alternative in {@link CParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(CParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleStatement}
	 * labeled alternative in {@link CParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(CParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleStatments}
	 * labeled alternative in {@link CParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterMultipleStatments(CParser.MultipleStatmentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleStatments}
	 * labeled alternative in {@link CParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitMultipleStatments(CParser.MultipleStatmentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compoundStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(CParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compoundStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(CParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectionStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(CParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectionStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(CParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterationStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(CParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterationStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(CParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(CParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(CParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(CParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(CParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lexprStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLexprStatement(CParser.LexprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lexprStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLexprStatement(CParser.LexprStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(CParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStatement}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(CParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assgnOp}
	 * labeled alternative in {@link CParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssgnOp(CParser.AssgnOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assgnOp}
	 * labeled alternative in {@link CParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssgnOp(CParser.AssgnOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orOp}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrOp(CParser.OrOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orOp}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrOp(CParser.OrOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpr(CParser.LogicalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpr}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpr(CParser.LogicalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assgnExpr}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssgnExpr(CParser.AssgnExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assgnExpr}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssgnExpr(CParser.AssgnExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andOp}
	 * labeled alternative in {@link CParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterAndOp(CParser.AndOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andOp}
	 * labeled alternative in {@link CParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitAndOp(CParser.AndOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link CParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(CParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link CParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(CParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqOp}
	 * labeled alternative in {@link CParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEqOp(CParser.EqOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqOp}
	 * labeled alternative in {@link CParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEqOp(CParser.EqOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neqOp}
	 * labeled alternative in {@link CParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterNeqOp(CParser.NeqOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neqOp}
	 * labeled alternative in {@link CParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitNeqOp(CParser.NeqOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relExpr}
	 * labeled alternative in {@link CParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(CParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relExpr}
	 * labeled alternative in {@link CParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(CParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code glOp}
	 * labeled alternative in {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterGlOp(CParser.GlOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code glOp}
	 * labeled alternative in {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitGlOp(CParser.GlOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leOp}
	 * labeled alternative in {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterLeOp(CParser.LeOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leOp}
	 * labeled alternative in {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitLeOp(CParser.LeOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(CParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpr}
	 * labeled alternative in {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(CParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltOp}
	 * labeled alternative in {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterLtOp(CParser.LtOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltOp}
	 * labeled alternative in {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitLtOp(CParser.LtOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code geOp}
	 * labeled alternative in {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterGeOp(CParser.GeOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code geOp}
	 * labeled alternative in {@link CParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitGeOp(CParser.GeOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addOp}
	 * labeled alternative in {@link CParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(CParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addOp}
	 * labeled alternative in {@link CParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(CParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subOp}
	 * labeled alternative in {@link CParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterSubOp(CParser.SubOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subOp}
	 * labeled alternative in {@link CParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitSubOp(CParser.SubOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpr}
	 * labeled alternative in {@link CParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(CParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpr}
	 * labeled alternative in {@link CParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(CParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divOp}
	 * labeled alternative in {@link CParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterDivOp(CParser.DivOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divOp}
	 * labeled alternative in {@link CParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitDivOp(CParser.DivOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multOp}
	 * labeled alternative in {@link CParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(CParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multOp}
	 * labeled alternative in {@link CParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(CParser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link CParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(CParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link CParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(CParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpr}
	 * labeled alternative in {@link CParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpr(CParser.PostfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpr}
	 * labeled alternative in {@link CParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpr(CParser.PostfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOp}
	 * labeled alternative in {@link CParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(CParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOp}
	 * labeled alternative in {@link CParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(CParser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primExpr}
	 * labeled alternative in {@link CParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimExpr(CParser.PrimExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primExpr}
	 * labeled alternative in {@link CParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimExpr(CParser.PrimExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link CParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link CParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallParam}
	 * labeled alternative in {@link CParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallParam(CParser.FunctionCallParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallParam}
	 * labeled alternative in {@link CParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallParam(CParser.FunctionCallParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incrOp}
	 * labeled alternative in {@link CParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void enterIncrOp(CParser.IncrOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incrOp}
	 * labeled alternative in {@link CParser#postfix_expression}.
	 * @param ctx the parse tree
	 */
	void exitIncrOp(CParser.IncrOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lExpr}
	 * labeled alternative in {@link CParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterLExpr(CParser.LExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lExpr}
	 * labeled alternative in {@link CParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitLExpr(CParser.LExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intConst}
	 * labeled alternative in {@link CParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterIntConst(CParser.IntConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intConst}
	 * labeled alternative in {@link CParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitIntConst(CParser.IntConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLit}
	 * labeled alternative in {@link CParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterStringLit(CParser.StringLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLit}
	 * labeled alternative in {@link CParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitStringLit(CParser.StringLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link CParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(CParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link CParser#primary_expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(CParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprBrackets}
	 * labeled alternative in {@link CParser#l_expression}.
	 * @param ctx the parse tree
	 */
	void enterExprBrackets(CParser.ExprBracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprBrackets}
	 * labeled alternative in {@link CParser#l_expression}.
	 * @param ctx the parse tree
	 */
	void exitExprBrackets(CParser.ExprBracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprId}
	 * labeled alternative in {@link CParser#l_expression}.
	 * @param ctx the parse tree
	 */
	void enterExprId(CParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprId}
	 * labeled alternative in {@link CParser#l_expression}.
	 * @param ctx the parse tree
	 */
	void exitExprId(CParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleExpr}
	 * labeled alternative in {@link CParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpr(CParser.SingleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleExpr}
	 * labeled alternative in {@link CParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpr(CParser.SingleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleExpr}
	 * labeled alternative in {@link CParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterMultipleExpr(CParser.MultipleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleExpr}
	 * labeled alternative in {@link CParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitMultipleExpr(CParser.MultipleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(CParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(CParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link CParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(CParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link CParser#selection_statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(CParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elseStat}
	 * labeled alternative in {@link CParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(CParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elseStat}
	 * labeled alternative in {@link CParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(CParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link CParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(CParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link CParser#iteration_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(CParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleDecl}
	 * labeled alternative in {@link CParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterMultipleDecl(CParser.MultipleDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleDecl}
	 * labeled alternative in {@link CParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitMultipleDecl(CParser.MultipleDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleDecl}
	 * labeled alternative in {@link CParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterSingleDecl(CParser.SingleDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleDecl}
	 * labeled alternative in {@link CParser#declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitSingleDecl(CParser.SingleDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decl}
	 * labeled alternative in {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDecl(CParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decl}
	 * labeled alternative in {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDecl(CParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assgn}
	 * labeled alternative in {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterAssgn(CParser.AssgnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assgn}
	 * labeled alternative in {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitAssgn(CParser.AssgnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleDeclarator}
	 * labeled alternative in {@link CParser#declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterMultipleDeclarator(CParser.MultipleDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleDeclarator}
	 * labeled alternative in {@link CParser#declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitMultipleDeclarator(CParser.MultipleDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleDeclarator}
	 * labeled alternative in {@link CParser#declarator_list}.
	 * @param ctx the parse tree
	 */
	void enterSingleDeclarator(CParser.SingleDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleDeclarator}
	 * labeled alternative in {@link CParser#declarator_list}.
	 * @param ctx the parse tree
	 */
	void exitSingleDeclarator(CParser.SingleDeclaratorContext ctx);
}