// Generated from C.g4 by ANTLR 4.8
package compiler.antlr;
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
	 * Visit a parse tree produced by the {@code idPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdPrimaryExpr(CParser.IdPrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intConstPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntConstPrimaryExpr(CParser.IntConstPrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strLitPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrLitPrimaryExpr(CParser.StrLitPrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParExprPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExprPrimaryExpr(CParser.ParExprPrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GSelectPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGSelectPrimaryExpr(CParser.GSelectPrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpStatPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpStatPrimaryExpr(CParser.CmpStatPrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vaArgPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVaArgPrimaryExpr(CParser.VaArgPrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code offsetPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetPrimaryExpr(CParser.OffsetPrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#genericSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSelection(CParser.GenericSelectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multGenAssList}
	 * labeled alternative in {@link CParser#genericAssocList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultGenAssList(CParser.MultGenAssListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleGenAssList}
	 * labeled alternative in {@link CParser#genericAssocList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleGenAssList(CParser.SingleGenAssListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeGenAss}
	 * labeled alternative in {@link CParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeGenAss(CParser.TypeGenAssContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultGenAss}
	 * labeled alternative in {@link CParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultGenAss(CParser.DefaultGenAssContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExtPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExtPostExpr(CParser.MultExtPostExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcInvocPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncInvocPostExpr(CParser.FuncInvocPostExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallPostExpr(CParser.FuncCallPostExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleExtPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExtPostExpr(CParser.SingleExtPostExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multCastPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultCastPostExpr(CParser.MultCastPostExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleCastPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCastPostExpr(CParser.SingleCastPostExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code incrPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrPostExpr(CParser.IncrPostExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimPostExpr(CParser.PrimPostExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrPostExpr(CParser.ArrPostExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallPtrPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallPtrPostExpr(CParser.FuncCallPtrPostExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleArgExprList}
	 * labeled alternative in {@link CParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleArgExprList(CParser.SingleArgExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multArgExprList}
	 * labeled alternative in {@link CParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultArgExprList(CParser.MultArgExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostUnaryExpr(CParser.PostUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preIncUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncUnaryExpr(CParser.PreIncUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastUnaryExpr(CParser.CastUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sizeExprUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeExprUnaryExpr(CParser.SizeExprUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sizeTypeUnaryExpe}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeTypeUnaryExpe(CParser.SizeTypeUnaryExpeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alignUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignUnaryExpr(CParser.AlignUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdUnaryExpr(CParser.IdUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(CParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeCastExpr}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeCastExpr(CParser.TypeCastExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extensionCastExpr}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtensionCastExpr(CParser.ExtensionCastExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryCastExpr}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryCastExpr(CParser.UnaryCastExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code digitSeqCastExpr}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitSeqCastExpr(CParser.DigitSeqCastExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termMultExpr}
	 * labeled alternative in {@link CParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermMultExpr(CParser.TermMultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opMultExpr}
	 * labeled alternative in {@link CParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMultExpr(CParser.OpMultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAddExpr}
	 * labeled alternative in {@link CParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAddExpr(CParser.TermAddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opAddExpr}
	 * labeled alternative in {@link CParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAddExpr(CParser.OpAddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opShiftExpr}
	 * labeled alternative in {@link CParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpShiftExpr(CParser.OpShiftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termShiftExpr}
	 * labeled alternative in {@link CParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermShiftExpr(CParser.TermShiftExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opRelExpr}
	 * labeled alternative in {@link CParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpRelExpr(CParser.OpRelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termRelExpr}
	 * labeled alternative in {@link CParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermRelExpr(CParser.TermRelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termEqualExpr}
	 * labeled alternative in {@link CParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermEqualExpr(CParser.TermEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opEqualExpr}
	 * labeled alternative in {@link CParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpEqualExpr(CParser.OpEqualExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAndExpr}
	 * labeled alternative in {@link CParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAndExpr(CParser.TermAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opAndExpr}
	 * labeled alternative in {@link CParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAndExpr(CParser.OpAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termExcOrExpr}
	 * labeled alternative in {@link CParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermExcOrExpr(CParser.TermExcOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opExcOrExpr}
	 * labeled alternative in {@link CParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExcOrExpr(CParser.OpExcOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opIncOrExpr}
	 * labeled alternative in {@link CParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpIncOrExpr(CParser.OpIncOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termIncOrExpr}
	 * labeled alternative in {@link CParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermIncOrExpr(CParser.TermIncOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opLogAndExpr}
	 * labeled alternative in {@link CParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpLogAndExpr(CParser.OpLogAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termLogAndExpr}
	 * labeled alternative in {@link CParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermLogAndExpr(CParser.TermLogAndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termLogOrExpr}
	 * labeled alternative in {@link CParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermLogOrExpr(CParser.TermLogOrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opLogOrExpr}
	 * labeled alternative in {@link CParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpLogOrExpr(CParser.OpLogOrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(CParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAssgnExpr}
	 * labeled alternative in {@link CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAssgnExpr(CParser.TermAssgnExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opAssgnExpr}
	 * labeled alternative in {@link CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAssgnExpr(CParser.OpAssgnExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code digitSeqAssgnExpr}
	 * labeled alternative in {@link CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDigitSeqAssgnExpr(CParser.DigitSeqAssgnExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(CParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleExpr}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpr(CParser.SingleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(CParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(CParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initSpecDeclaration}
	 * labeled alternative in {@link CParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitSpecDeclaration(CParser.InitSpecDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specDeclaration}
	 * labeled alternative in {@link CParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecDeclaration(CParser.SpecDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticDeclaration}
	 * labeled alternative in {@link CParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticDeclaration(CParser.StaticDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(CParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers2(CParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code classDecSpec}
	 * labeled alternative in {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecSpec(CParser.ClassDecSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeSpecDecSpec}
	 * labeled alternative in {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecDecSpec(CParser.TypeSpecDecSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeQualDecSpec}
	 * labeled alternative in {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualDecSpec(CParser.TypeQualDecSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcDecSpec}
	 * labeled alternative in {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecSpec(CParser.FuncDecSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alignDecSpec}
	 * labeled alternative in {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignDecSpec(CParser.AlignDecSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleInitDecList}
	 * labeled alternative in {@link CParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleInitDecList(CParser.SingleInitDecListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multInitDecList}
	 * labeled alternative in {@link CParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultInitDecList(CParser.MultInitDecListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termInitDec}
	 * labeled alternative in {@link CParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermInitDec(CParser.TermInitDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opInitDec}
	 * labeled alternative in {@link CParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpInitDec(CParser.OpInitDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(CParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeOfSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeOfSpec(CParser.TypeOfSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeDefSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefSpec(CParser.TypeDefSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseTypeSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseTypeSpec(CParser.BaseTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extensionTypeSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtensionTypeSpec(CParser.ExtensionTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typePointerSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypePointerSpec(CParser.TypePointerSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomicTypeSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeSpec(CParser.AtomicTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structTypeSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructTypeSpec(CParser.StructTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enumTypeSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumTypeSpec(CParser.EnumTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decStructUnSpec}
	 * labeled alternative in {@link CParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecStructUnSpec(CParser.DecStructUnSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleStructUnSpec}
	 * labeled alternative in {@link CParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStructUnSpec(CParser.SingleStructUnSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#structOrUnion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnion(CParser.StructOrUnionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multStructDecList}
	 * labeled alternative in {@link CParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultStructDecList(CParser.MultStructDecListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleStructDecList}
	 * labeled alternative in {@link CParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStructDecList(CParser.SingleStructDecListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulStructDec}
	 * labeled alternative in {@link CParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulStructDec(CParser.MulStructDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleStructDec}
	 * labeled alternative in {@link CParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStructDec(CParser.SingleStructDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specSpecQualList}
	 * labeled alternative in {@link CParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecSpecQualList(CParser.SpecSpecQualListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qualSpecQualList}
	 * labeled alternative in {@link CParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualSpecQualList(CParser.QualSpecQualListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleStructDecrList}
	 * labeled alternative in {@link CParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStructDecrList(CParser.SingleStructDecrListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulStructDecrList}
	 * labeled alternative in {@link CParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulStructDecrList(CParser.MulStructDecrListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyStructDec}
	 * labeled alternative in {@link CParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStructDec(CParser.EmptyStructDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assgnStructDec}
	 * labeled alternative in {@link CParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssgnStructDec(CParser.AssgnStructDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decEnumSpec}
	 * labeled alternative in {@link CParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecEnumSpec(CParser.DecEnumSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyEnumSpec}
	 * labeled alternative in {@link CParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyEnumSpec(CParser.EmptyEnumSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleEnumList}
	 * labeled alternative in {@link CParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleEnumList(CParser.SingleEnumListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multEnumList}
	 * labeled alternative in {@link CParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultEnumList(CParser.MultEnumListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyEnum}
	 * labeled alternative in {@link CParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyEnum(CParser.EmptyEnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assgnEnum}
	 * labeled alternative in {@link CParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssgnEnum(CParser.AssgnEnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enumConst}
	 * labeled alternative in {@link CParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConst(CParser.EnumConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeSpecifier(CParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(CParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code baseFuncSpec}
	 * labeled alternative in {@link CParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseFuncSpec(CParser.BaseFuncSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gccFuncSpec}
	 * labeled alternative in {@link CParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccFuncSpec(CParser.GccFuncSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declFuncSpec}
	 * labeled alternative in {@link CParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclFuncSpec(CParser.DeclFuncSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeAlignSpec}
	 * labeled alternative in {@link CParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAlignSpec(CParser.TypeAlignSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAlignSpec}
	 * labeled alternative in {@link CParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAlignSpec(CParser.ExprAlignSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(CParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdDirDec(CParser.IdDirDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqArrDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqArrDirDec(CParser.SqArrDirDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qsArrDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQsArrDirDec(CParser.QsArrDirDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qArrDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQArrDirDec(CParser.QArrDirDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idlDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdlDirDec(CParser.IdlDirDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParDirDec(CParser.ParDirDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dsDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDsDirDec(CParser.DsDirDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eArrDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEArrDirDec(CParser.EArrDirDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramlDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlDirDec(CParser.ParamlDirDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleGccDecExt}
	 * labeled alternative in {@link CParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleGccDecExt(CParser.SingleGccDecExtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multGccDecExt}
	 * labeled alternative in {@link CParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultGccDecExt(CParser.MultGccDecExtContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeSpecifier(CParser.GccAttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gccAttList}
	 * labeled alternative in {@link CParser#gccAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttList(CParser.GccAttListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyGccAttList}
	 * labeled alternative in {@link CParser#gccAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyGccAttList(CParser.EmptyGccAttListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multGccAttr}
	 * labeled alternative in {@link CParser#gccAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultGccAttr(CParser.MultGccAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyGccAttr}
	 * labeled alternative in {@link CParser#gccAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyGccAttr(CParser.EmptyGccAttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedParenthesesBlock(CParser.NestedParenthesesBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SPointer}
	 * labeled alternative in {@link CParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSPointer(CParser.SPointerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SPPointer}
	 * labeled alternative in {@link CParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSPPointer(CParser.SPPointerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HPointer}
	 * labeled alternative in {@link CParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHPointer(CParser.HPointerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HPPointer}
	 * labeled alternative in {@link CParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHPPointer(CParser.HPPointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(CParser.TypeQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleParamTypeList}
	 * labeled alternative in {@link CParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleParamTypeList(CParser.SingleParamTypeListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extParamTypeList}
	 * labeled alternative in {@link CParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtParamTypeList(CParser.ExtParamTypeListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multParamList}
	 * labeled alternative in {@link CParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultParamList(CParser.MultParamListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleParamList}
	 * labeled alternative in {@link CParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleParamList(CParser.SingleParamListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decParamDec}
	 * labeled alternative in {@link CParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecParamDec(CParser.DecParamDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code absParamDec}
	 * labeled alternative in {@link CParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsParamDec(CParser.AbsParamDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleIdList}
	 * labeled alternative in {@link CParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleIdList(CParser.SingleIdListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multIdList}
	 * labeled alternative in {@link CParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultIdList(CParser.MultIdListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(CParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ptrAbsDec}
	 * labeled alternative in {@link CParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrAbsDec(CParser.PtrAbsDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ptrGccAbsDec}
	 * labeled alternative in {@link CParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtrGccAbsDec(CParser.PtrGccAbsDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qualDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualDirAbsDec(CParser.QualDirAbsDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decParamDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecParamDirAbsDec(CParser.DecParamDirAbsDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecDirAbsDec(CParser.DecDirAbsDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decQualDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecQualDirAbsDec(CParser.DecQualDirAbsDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decAddrDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecAddrDirAbsDec(CParser.DecAddrDirAbsDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addrDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddrDirAbsDec(CParser.AddrDirAbsDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decStaticQualDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecStaticQualDirAbsDec(CParser.DecStaticQualDirAbsDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code qualStaticDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualStaticDirAbsDec(CParser.QualStaticDirAbsDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decQualStaticDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecQualStaticDirAbsDec(CParser.DecQualStaticDirAbsDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDirAbsDec(CParser.ParamDirAbsDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code staticQualDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticQualDirAbsDec(CParser.StaticQualDirAbsDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(CParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assgnInit}
	 * labeled alternative in {@link CParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssgnInit(CParser.AssgnInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listInit}
	 * labeled alternative in {@link CParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListInit(CParser.ListInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multInitList}
	 * labeled alternative in {@link CParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultInitList(CParser.MultInitListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleInitList}
	 * labeled alternative in {@link CParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleInitList(CParser.SingleInitListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignation(CParser.DesignationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleDesList}
	 * labeled alternative in {@link CParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDesList(CParser.SingleDesListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDesList}
	 * labeled alternative in {@link CParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDesList(CParser.MultDesListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayDes}
	 * labeled alternative in {@link CParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDes(CParser.ArrayDesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcDes}
	 * labeled alternative in {@link CParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDes(CParser.FuncDesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(CParser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code labelStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelStat(CParser.LabelStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cmpStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmpStat(CParser.CmpStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStat(CParser.ExprStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStat(CParser.SelectStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterStat(CParser.IterStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code jumpStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStat(CParser.JumpStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idLabelStat}
	 * labeled alternative in {@link CParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdLabelStat(CParser.IdLabelStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseLabelStat}
	 * labeled alternative in {@link CParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseLabelStat(CParser.CaseLabelStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defLabelStat}
	 * labeled alternative in {@link CParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefLabelStat(CParser.DefLabelStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(CParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multBlockItemList}
	 * labeled alternative in {@link CParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultBlockItemList(CParser.MultBlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleBlockItemList}
	 * labeled alternative in {@link CParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleBlockItemList(CParser.SingleBlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statBlockItem}
	 * labeled alternative in {@link CParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatBlockItem(CParser.StatBlockItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decBlockItem}
	 * labeled alternative in {@link CParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecBlockItem(CParser.DecBlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(CParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifSelecStat}
	 * labeled alternative in {@link CParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfSelecStat(CParser.IfSelecStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchSelecStat}
	 * labeled alternative in {@link CParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchSelecStat(CParser.SwitchSelecStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileIterStat}
	 * labeled alternative in {@link CParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileIterStat(CParser.WhileIterStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doIterStat}
	 * labeled alternative in {@link CParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoIterStat(CParser.DoIterStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forIterStat}
	 * labeled alternative in {@link CParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIterStat(CParser.ForIterStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decForCond}
	 * labeled alternative in {@link CParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecForCond(CParser.DecForCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expForCond}
	 * labeled alternative in {@link CParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpForCond(CParser.ExpForCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multForDec}
	 * labeled alternative in {@link CParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultForDec(CParser.MultForDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleForDec}
	 * labeled alternative in {@link CParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleForDec(CParser.SingleForDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleForExpr}
	 * labeled alternative in {@link CParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleForExpr(CParser.SingleForExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multForExpr}
	 * labeled alternative in {@link CParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultForExpr(CParser.MultForExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gotoJumpStat}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoJumpStat(CParser.GotoJumpStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code continueJumpStat}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueJumpStat(CParser.ContinueJumpStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakJumpStat}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakJumpStat(CParser.BreakJumpStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnJumpStat}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnJumpStat(CParser.ReturnJumpStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gotoExpJumpStat}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoExpJumpStat(CParser.GotoExpJumpStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(CParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleTransUnit}
	 * labeled alternative in {@link CParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTransUnit(CParser.SingleTransUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multTransUnit}
	 * labeled alternative in {@link CParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultTransUnit(CParser.MultTransUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcExtDec}
	 * labeled alternative in {@link CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExtDec(CParser.FuncExtDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decExtDec}
	 * labeled alternative in {@link CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecExtDec(CParser.DecExtDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empty}
	 * labeled alternative in {@link CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(CParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(CParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleDecList}
	 * labeled alternative in {@link CParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDecList(CParser.SingleDecListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDecList}
	 * labeled alternative in {@link CParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDecList(CParser.MultDecListContext ctx);
}