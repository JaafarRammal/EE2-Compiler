// Generated from C.g4 by ANTLR 4.8
package compiler.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CParser}.
 */
public interface CListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code idPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdPrimaryExpr(CParser.IdPrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdPrimaryExpr(CParser.IdPrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intConstPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntConstPrimaryExpr(CParser.IntConstPrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intConstPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntConstPrimaryExpr(CParser.IntConstPrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strLitPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStrLitPrimaryExpr(CParser.StrLitPrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strLitPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStrLitPrimaryExpr(CParser.StrLitPrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParExprPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExprPrimaryExpr(CParser.ParExprPrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParExprPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExprPrimaryExpr(CParser.ParExprPrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GSelectPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterGSelectPrimaryExpr(CParser.GSelectPrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GSelectPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitGSelectPrimaryExpr(CParser.GSelectPrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmpStatPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCmpStatPrimaryExpr(CParser.CmpStatPrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmpStatPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCmpStatPrimaryExpr(CParser.CmpStatPrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vaArgPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterVaArgPrimaryExpr(CParser.VaArgPrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vaArgPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitVaArgPrimaryExpr(CParser.VaArgPrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code offsetPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterOffsetPrimaryExpr(CParser.OffsetPrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code offsetPrimaryExpr}
	 * labeled alternative in {@link CParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitOffsetPrimaryExpr(CParser.OffsetPrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(CParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(CParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multGenAssList}
	 * labeled alternative in {@link CParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterMultGenAssList(CParser.MultGenAssListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multGenAssList}
	 * labeled alternative in {@link CParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitMultGenAssList(CParser.MultGenAssListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleGenAssList}
	 * labeled alternative in {@link CParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterSingleGenAssList(CParser.SingleGenAssListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleGenAssList}
	 * labeled alternative in {@link CParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitSingleGenAssList(CParser.SingleGenAssListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeGenAss}
	 * labeled alternative in {@link CParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterTypeGenAss(CParser.TypeGenAssContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeGenAss}
	 * labeled alternative in {@link CParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitTypeGenAss(CParser.TypeGenAssContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultGenAss}
	 * labeled alternative in {@link CParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterDefaultGenAss(CParser.DefaultGenAssContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultGenAss}
	 * labeled alternative in {@link CParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitDefaultGenAss(CParser.DefaultGenAssContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExtPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultExtPostExpr(CParser.MultExtPostExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExtPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultExtPostExpr(CParser.MultExtPostExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcInvocPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterFuncInvocPostExpr(CParser.FuncInvocPostExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcInvocPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitFuncInvocPostExpr(CParser.FuncInvocPostExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallPostExpr(CParser.FuncCallPostExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallPostExpr(CParser.FuncCallPostExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleExtPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExtPostExpr(CParser.SingleExtPostExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleExtPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExtPostExpr(CParser.SingleExtPostExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multCastPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultCastPostExpr(CParser.MultCastPostExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multCastPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultCastPostExpr(CParser.MultCastPostExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleCastPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleCastPostExpr(CParser.SingleCastPostExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleCastPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleCastPostExpr(CParser.SingleCastPostExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incrPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterIncrPostExpr(CParser.IncrPostExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incrPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitIncrPostExpr(CParser.IncrPostExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimPostExpr(CParser.PrimPostExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimPostExpr(CParser.PrimPostExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrPostExpr(CParser.ArrPostExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrPostExpr(CParser.ArrPostExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallPtrPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallPtrPostExpr(CParser.FuncCallPtrPostExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallPtrPostExpr}
	 * labeled alternative in {@link CParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallPtrPostExpr(CParser.FuncCallPtrPostExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleArgExprList}
	 * labeled alternative in {@link CParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterSingleArgExprList(CParser.SingleArgExprListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleArgExprList}
	 * labeled alternative in {@link CParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitSingleArgExprList(CParser.SingleArgExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multArgExprList}
	 * labeled alternative in {@link CParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterMultArgExprList(CParser.MultArgExprListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multArgExprList}
	 * labeled alternative in {@link CParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitMultArgExprList(CParser.MultArgExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostUnaryExpr(CParser.PostUnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostUnaryExpr(CParser.PostUnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preIncUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncUnaryExpr(CParser.PreIncUnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preIncUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncUnaryExpr(CParser.PreIncUnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastUnaryExpr(CParser.CastUnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastUnaryExpr(CParser.CastUnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sizeExprUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSizeExprUnaryExpr(CParser.SizeExprUnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sizeExprUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSizeExprUnaryExpr(CParser.SizeExprUnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sizeTypeUnaryExpe}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSizeTypeUnaryExpe(CParser.SizeTypeUnaryExpeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sizeTypeUnaryExpe}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSizeTypeUnaryExpe(CParser.SizeTypeUnaryExpeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alignUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterAlignUnaryExpr(CParser.AlignUnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alignUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitAlignUnaryExpr(CParser.AlignUnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIdUnaryExpr(CParser.IdUnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idUnaryExpr}
	 * labeled alternative in {@link CParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIdUnaryExpr(CParser.IdUnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(CParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(CParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeCastExpr}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeCastExpr(CParser.TypeCastExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeCastExpr}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeCastExpr(CParser.TypeCastExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extensionCastExpr}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtensionCastExpr(CParser.ExtensionCastExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extensionCastExpr}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtensionCastExpr(CParser.ExtensionCastExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryCastExpr}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryCastExpr(CParser.UnaryCastExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryCastExpr}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryCastExpr(CParser.UnaryCastExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digitSeqCastExpr}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterDigitSeqCastExpr(CParser.DigitSeqCastExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digitSeqCastExpr}
	 * labeled alternative in {@link CParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitDigitSeqCastExpr(CParser.DigitSeqCastExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termMultExpr}
	 * labeled alternative in {@link CParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterTermMultExpr(CParser.TermMultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termMultExpr}
	 * labeled alternative in {@link CParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitTermMultExpr(CParser.TermMultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opMultExpr}
	 * labeled alternative in {@link CParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterOpMultExpr(CParser.OpMultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opMultExpr}
	 * labeled alternative in {@link CParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitOpMultExpr(CParser.OpMultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termAddExpr}
	 * labeled alternative in {@link CParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterTermAddExpr(CParser.TermAddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termAddExpr}
	 * labeled alternative in {@link CParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitTermAddExpr(CParser.TermAddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opAddExpr}
	 * labeled alternative in {@link CParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterOpAddExpr(CParser.OpAddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opAddExpr}
	 * labeled alternative in {@link CParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitOpAddExpr(CParser.OpAddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opShiftExpr}
	 * labeled alternative in {@link CParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterOpShiftExpr(CParser.OpShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opShiftExpr}
	 * labeled alternative in {@link CParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitOpShiftExpr(CParser.OpShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termShiftExpr}
	 * labeled alternative in {@link CParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterTermShiftExpr(CParser.TermShiftExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termShiftExpr}
	 * labeled alternative in {@link CParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitTermShiftExpr(CParser.TermShiftExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opRelExpr}
	 * labeled alternative in {@link CParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterOpRelExpr(CParser.OpRelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opRelExpr}
	 * labeled alternative in {@link CParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitOpRelExpr(CParser.OpRelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termRelExpr}
	 * labeled alternative in {@link CParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterTermRelExpr(CParser.TermRelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termRelExpr}
	 * labeled alternative in {@link CParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitTermRelExpr(CParser.TermRelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termEqualExpr}
	 * labeled alternative in {@link CParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterTermEqualExpr(CParser.TermEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termEqualExpr}
	 * labeled alternative in {@link CParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitTermEqualExpr(CParser.TermEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opEqualExpr}
	 * labeled alternative in {@link CParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterOpEqualExpr(CParser.OpEqualExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opEqualExpr}
	 * labeled alternative in {@link CParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitOpEqualExpr(CParser.OpEqualExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termAndExpr}
	 * labeled alternative in {@link CParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterTermAndExpr(CParser.TermAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termAndExpr}
	 * labeled alternative in {@link CParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitTermAndExpr(CParser.TermAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opAndExpr}
	 * labeled alternative in {@link CParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterOpAndExpr(CParser.OpAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opAndExpr}
	 * labeled alternative in {@link CParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitOpAndExpr(CParser.OpAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termExcOrExpr}
	 * labeled alternative in {@link CParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterTermExcOrExpr(CParser.TermExcOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termExcOrExpr}
	 * labeled alternative in {@link CParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitTermExcOrExpr(CParser.TermExcOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opExcOrExpr}
	 * labeled alternative in {@link CParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterOpExcOrExpr(CParser.OpExcOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opExcOrExpr}
	 * labeled alternative in {@link CParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitOpExcOrExpr(CParser.OpExcOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opIncOrExpr}
	 * labeled alternative in {@link CParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterOpIncOrExpr(CParser.OpIncOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opIncOrExpr}
	 * labeled alternative in {@link CParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitOpIncOrExpr(CParser.OpIncOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termIncOrExpr}
	 * labeled alternative in {@link CParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterTermIncOrExpr(CParser.TermIncOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termIncOrExpr}
	 * labeled alternative in {@link CParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitTermIncOrExpr(CParser.TermIncOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opLogAndExpr}
	 * labeled alternative in {@link CParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterOpLogAndExpr(CParser.OpLogAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opLogAndExpr}
	 * labeled alternative in {@link CParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitOpLogAndExpr(CParser.OpLogAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termLogAndExpr}
	 * labeled alternative in {@link CParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterTermLogAndExpr(CParser.TermLogAndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termLogAndExpr}
	 * labeled alternative in {@link CParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitTermLogAndExpr(CParser.TermLogAndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termLogOrExpr}
	 * labeled alternative in {@link CParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterTermLogOrExpr(CParser.TermLogOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termLogOrExpr}
	 * labeled alternative in {@link CParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitTermLogOrExpr(CParser.TermLogOrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opLogOrExpr}
	 * labeled alternative in {@link CParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterOpLogOrExpr(CParser.OpLogOrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opLogOrExpr}
	 * labeled alternative in {@link CParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitOpLogOrExpr(CParser.OpLogOrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(CParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(CParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termAssgnExpr}
	 * labeled alternative in {@link CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterTermAssgnExpr(CParser.TermAssgnExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termAssgnExpr}
	 * labeled alternative in {@link CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitTermAssgnExpr(CParser.TermAssgnExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opAssgnExpr}
	 * labeled alternative in {@link CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterOpAssgnExpr(CParser.OpAssgnExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opAssgnExpr}
	 * labeled alternative in {@link CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitOpAssgnExpr(CParser.OpAssgnExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code digitSeqAssgnExpr}
	 * labeled alternative in {@link CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterDigitSeqAssgnExpr(CParser.DigitSeqAssgnExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code digitSeqAssgnExpr}
	 * labeled alternative in {@link CParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitDigitSeqAssgnExpr(CParser.DigitSeqAssgnExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(CParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(CParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleExpr}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpr(CParser.SingleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleExpr}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpr(CParser.SingleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(CParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExpr}
	 * labeled alternative in {@link CParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(CParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(CParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(CParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initSpecDeclaration}
	 * labeled alternative in {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterInitSpecDeclaration(CParser.InitSpecDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initSpecDeclaration}
	 * labeled alternative in {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitInitSpecDeclaration(CParser.InitSpecDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specDeclaration}
	 * labeled alternative in {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterSpecDeclaration(CParser.SpecDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specDeclaration}
	 * labeled alternative in {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitSpecDeclaration(CParser.SpecDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticDeclaration}
	 * labeled alternative in {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticDeclaration(CParser.StaticDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticDeclaration}
	 * labeled alternative in {@link CParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticDeclaration(CParser.StaticDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(CParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(CParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(CParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(CParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code classDecSpec}
	 * labeled alternative in {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassDecSpec(CParser.ClassDecSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDecSpec}
	 * labeled alternative in {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassDecSpec(CParser.ClassDecSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeSpecDecSpec}
	 * labeled alternative in {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecDecSpec(CParser.TypeSpecDecSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeSpecDecSpec}
	 * labeled alternative in {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecDecSpec(CParser.TypeSpecDecSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeQualDecSpec}
	 * labeled alternative in {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualDecSpec(CParser.TypeQualDecSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeQualDecSpec}
	 * labeled alternative in {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualDecSpec(CParser.TypeQualDecSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcDecSpec}
	 * labeled alternative in {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecSpec(CParser.FuncDecSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDecSpec}
	 * labeled alternative in {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecSpec(CParser.FuncDecSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alignDecSpec}
	 * labeled alternative in {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignDecSpec(CParser.AlignDecSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alignDecSpec}
	 * labeled alternative in {@link CParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignDecSpec(CParser.AlignDecSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInitDecList}
	 * labeled alternative in {@link CParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterSingleInitDecList(CParser.SingleInitDecListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInitDecList}
	 * labeled alternative in {@link CParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitSingleInitDecList(CParser.SingleInitDecListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multInitDecList}
	 * labeled alternative in {@link CParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterMultInitDecList(CParser.MultInitDecListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multInitDecList}
	 * labeled alternative in {@link CParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitMultInitDecList(CParser.MultInitDecListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termInitDec}
	 * labeled alternative in {@link CParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterTermInitDec(CParser.TermInitDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termInitDec}
	 * labeled alternative in {@link CParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitTermInitDec(CParser.TermInitDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opInitDec}
	 * labeled alternative in {@link CParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterOpInitDec(CParser.OpInitDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opInitDec}
	 * labeled alternative in {@link CParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitOpInitDec(CParser.OpInitDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDefStorageClassSpec}
	 * labeled alternative in {@link CParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefStorageClassSpec(CParser.TypeDefStorageClassSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDefStorageClassSpec}
	 * labeled alternative in {@link CParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefStorageClassSpec(CParser.TypeDefStorageClassSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeOfSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfSpec(CParser.TypeOfSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeOfSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfSpec(CParser.TypeOfSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDefSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefSpec(CParser.TypeDefSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDefSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefSpec(CParser.TypeDefSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code baseTypeSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBaseTypeSpec(CParser.BaseTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseTypeSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBaseTypeSpec(CParser.BaseTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extensionTypeSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterExtensionTypeSpec(CParser.ExtensionTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extensionTypeSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitExtensionTypeSpec(CParser.ExtensionTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typePointerSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypePointerSpec(CParser.TypePointerSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typePointerSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypePointerSpec(CParser.TypePointerSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomicTypeSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpec(CParser.AtomicTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomicTypeSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpec(CParser.AtomicTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structTypeSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructTypeSpec(CParser.StructTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structTypeSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructTypeSpec(CParser.StructTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enumTypeSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumTypeSpec(CParser.EnumTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enumTypeSpec}
	 * labeled alternative in {@link CParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumTypeSpec(CParser.EnumTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decStructUnSpec}
	 * labeled alternative in {@link CParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDecStructUnSpec(CParser.DecStructUnSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decStructUnSpec}
	 * labeled alternative in {@link CParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDecStructUnSpec(CParser.DecStructUnSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleStructUnSpec}
	 * labeled alternative in {@link CParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleStructUnSpec(CParser.SingleStructUnSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleStructUnSpec}
	 * labeled alternative in {@link CParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleStructUnSpec(CParser.SingleStructUnSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(CParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(CParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multStructDecList}
	 * labeled alternative in {@link CParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterMultStructDecList(CParser.MultStructDecListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multStructDecList}
	 * labeled alternative in {@link CParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitMultStructDecList(CParser.MultStructDecListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleStructDecList}
	 * labeled alternative in {@link CParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterSingleStructDecList(CParser.SingleStructDecListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleStructDecList}
	 * labeled alternative in {@link CParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitSingleStructDecList(CParser.SingleStructDecListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulStructDec}
	 * labeled alternative in {@link CParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMulStructDec(CParser.MulStructDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulStructDec}
	 * labeled alternative in {@link CParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMulStructDec(CParser.MulStructDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleStructDec}
	 * labeled alternative in {@link CParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStructDec(CParser.SingleStructDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleStructDec}
	 * labeled alternative in {@link CParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStructDec(CParser.SingleStructDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specSpecQualList}
	 * labeled alternative in {@link CParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecSpecQualList(CParser.SpecSpecQualListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specSpecQualList}
	 * labeled alternative in {@link CParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecSpecQualList(CParser.SpecSpecQualListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qualSpecQualList}
	 * labeled alternative in {@link CParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterQualSpecQualList(CParser.QualSpecQualListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qualSpecQualList}
	 * labeled alternative in {@link CParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitQualSpecQualList(CParser.QualSpecQualListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleStructDecrList}
	 * labeled alternative in {@link CParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterSingleStructDecrList(CParser.SingleStructDecrListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleStructDecrList}
	 * labeled alternative in {@link CParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitSingleStructDecrList(CParser.SingleStructDecrListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulStructDecrList}
	 * labeled alternative in {@link CParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterMulStructDecrList(CParser.MulStructDecrListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulStructDecrList}
	 * labeled alternative in {@link CParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitMulStructDecrList(CParser.MulStructDecrListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyStructDec}
	 * labeled alternative in {@link CParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStructDec(CParser.EmptyStructDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyStructDec}
	 * labeled alternative in {@link CParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStructDec(CParser.EmptyStructDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assgnStructDec}
	 * labeled alternative in {@link CParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAssgnStructDec(CParser.AssgnStructDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assgnStructDec}
	 * labeled alternative in {@link CParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAssgnStructDec(CParser.AssgnStructDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decEnumSpec}
	 * labeled alternative in {@link CParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDecEnumSpec(CParser.DecEnumSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decEnumSpec}
	 * labeled alternative in {@link CParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDecEnumSpec(CParser.DecEnumSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyEnumSpec}
	 * labeled alternative in {@link CParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEmptyEnumSpec(CParser.EmptyEnumSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyEnumSpec}
	 * labeled alternative in {@link CParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEmptyEnumSpec(CParser.EmptyEnumSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleEnumList}
	 * labeled alternative in {@link CParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterSingleEnumList(CParser.SingleEnumListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleEnumList}
	 * labeled alternative in {@link CParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitSingleEnumList(CParser.SingleEnumListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multEnumList}
	 * labeled alternative in {@link CParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterMultEnumList(CParser.MultEnumListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multEnumList}
	 * labeled alternative in {@link CParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitMultEnumList(CParser.MultEnumListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyEnum}
	 * labeled alternative in {@link CParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEmptyEnum(CParser.EmptyEnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyEnum}
	 * labeled alternative in {@link CParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEmptyEnum(CParser.EmptyEnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assgnEnum}
	 * labeled alternative in {@link CParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterAssgnEnum(CParser.AssgnEnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assgnEnum}
	 * labeled alternative in {@link CParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitAssgnEnum(CParser.AssgnEnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enumConst}
	 * labeled alternative in {@link CParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConst(CParser.EnumConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enumConst}
	 * labeled alternative in {@link CParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConst(CParser.EnumConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(CParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(CParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(CParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(CParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code baseFuncSpec}
	 * labeled alternative in {@link CParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterBaseFuncSpec(CParser.BaseFuncSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code baseFuncSpec}
	 * labeled alternative in {@link CParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitBaseFuncSpec(CParser.BaseFuncSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gccFuncSpec}
	 * labeled alternative in {@link CParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccFuncSpec(CParser.GccFuncSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gccFuncSpec}
	 * labeled alternative in {@link CParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccFuncSpec(CParser.GccFuncSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declFuncSpec}
	 * labeled alternative in {@link CParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclFuncSpec(CParser.DeclFuncSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declFuncSpec}
	 * labeled alternative in {@link CParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclFuncSpec(CParser.DeclFuncSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeAlignSpec}
	 * labeled alternative in {@link CParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeAlignSpec(CParser.TypeAlignSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeAlignSpec}
	 * labeled alternative in {@link CParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeAlignSpec(CParser.TypeAlignSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAlignSpec}
	 * labeled alternative in {@link CParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterExprAlignSpec(CParser.ExprAlignSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAlignSpec}
	 * labeled alternative in {@link CParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitExprAlignSpec(CParser.ExprAlignSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(CParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(CParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterIdDirDec(CParser.IdDirDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitIdDirDec(CParser.IdDirDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqArrDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterSqArrDirDec(CParser.SqArrDirDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqArrDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitSqArrDirDec(CParser.SqArrDirDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qsArrDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterQsArrDirDec(CParser.QsArrDirDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qsArrDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitQsArrDirDec(CParser.QsArrDirDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qArrDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterQArrDirDec(CParser.QArrDirDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qArrDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitQArrDirDec(CParser.QArrDirDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idlDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterIdlDirDec(CParser.IdlDirDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idlDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitIdlDirDec(CParser.IdlDirDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterParDirDec(CParser.ParDirDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitParDirDec(CParser.ParDirDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dsDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDsDirDec(CParser.DsDirDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dsDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDsDirDec(CParser.DsDirDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eArrDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterEArrDirDec(CParser.EArrDirDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eArrDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitEArrDirDec(CParser.EArrDirDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramlDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterParamlDirDec(CParser.ParamlDirDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramlDirDec}
	 * labeled alternative in {@link CParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitParamlDirDec(CParser.ParamlDirDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleGccDecExt}
	 * labeled alternative in {@link CParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterSingleGccDecExt(CParser.SingleGccDecExtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleGccDecExt}
	 * labeled alternative in {@link CParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitSingleGccDecExt(CParser.SingleGccDecExtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multGccDecExt}
	 * labeled alternative in {@link CParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterMultGccDecExt(CParser.MultGccDecExtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multGccDecExt}
	 * labeled alternative in {@link CParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitMultGccDecExt(CParser.MultGccDecExtContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(CParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(CParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gccAttList}
	 * labeled alternative in {@link CParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttList(CParser.GccAttListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gccAttList}
	 * labeled alternative in {@link CParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttList(CParser.GccAttListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyGccAttList}
	 * labeled alternative in {@link CParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterEmptyGccAttList(CParser.EmptyGccAttListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyGccAttList}
	 * labeled alternative in {@link CParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitEmptyGccAttList(CParser.EmptyGccAttListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multGccAttr}
	 * labeled alternative in {@link CParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterMultGccAttr(CParser.MultGccAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multGccAttr}
	 * labeled alternative in {@link CParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitMultGccAttr(CParser.MultGccAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyGccAttr}
	 * labeled alternative in {@link CParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterEmptyGccAttr(CParser.EmptyGccAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyGccAttr}
	 * labeled alternative in {@link CParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitEmptyGccAttr(CParser.EmptyGccAttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(CParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(CParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SPointer}
	 * labeled alternative in {@link CParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterSPointer(CParser.SPointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SPointer}
	 * labeled alternative in {@link CParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitSPointer(CParser.SPointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SPPointer}
	 * labeled alternative in {@link CParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterSPPointer(CParser.SPPointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SPPointer}
	 * labeled alternative in {@link CParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitSPPointer(CParser.SPPointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HPointer}
	 * labeled alternative in {@link CParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterHPointer(CParser.HPointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HPointer}
	 * labeled alternative in {@link CParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitHPointer(CParser.HPointerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HPPointer}
	 * labeled alternative in {@link CParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterHPPointer(CParser.HPPointerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HPPointer}
	 * labeled alternative in {@link CParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitHPPointer(CParser.HPPointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(CParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(CParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleParamTypeList}
	 * labeled alternative in {@link CParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterSingleParamTypeList(CParser.SingleParamTypeListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleParamTypeList}
	 * labeled alternative in {@link CParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitSingleParamTypeList(CParser.SingleParamTypeListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extParamTypeList}
	 * labeled alternative in {@link CParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExtParamTypeList(CParser.ExtParamTypeListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extParamTypeList}
	 * labeled alternative in {@link CParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExtParamTypeList(CParser.ExtParamTypeListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multParamList}
	 * labeled alternative in {@link CParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterMultParamList(CParser.MultParamListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multParamList}
	 * labeled alternative in {@link CParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitMultParamList(CParser.MultParamListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleParamList}
	 * labeled alternative in {@link CParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterSingleParamList(CParser.SingleParamListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleParamList}
	 * labeled alternative in {@link CParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitSingleParamList(CParser.SingleParamListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decParamDec}
	 * labeled alternative in {@link CParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDecParamDec(CParser.DecParamDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decParamDec}
	 * labeled alternative in {@link CParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDecParamDec(CParser.DecParamDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code absParamDec}
	 * labeled alternative in {@link CParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAbsParamDec(CParser.AbsParamDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absParamDec}
	 * labeled alternative in {@link CParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAbsParamDec(CParser.AbsParamDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleIdList}
	 * labeled alternative in {@link CParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterSingleIdList(CParser.SingleIdListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleIdList}
	 * labeled alternative in {@link CParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitSingleIdList(CParser.SingleIdListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multIdList}
	 * labeled alternative in {@link CParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterMultIdList(CParser.MultIdListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multIdList}
	 * labeled alternative in {@link CParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitMultIdList(CParser.MultIdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(CParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(CParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ptrAbsDec}
	 * labeled alternative in {@link CParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPtrAbsDec(CParser.PtrAbsDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ptrAbsDec}
	 * labeled alternative in {@link CParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPtrAbsDec(CParser.PtrAbsDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ptrGccAbsDec}
	 * labeled alternative in {@link CParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPtrGccAbsDec(CParser.PtrGccAbsDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ptrGccAbsDec}
	 * labeled alternative in {@link CParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPtrGccAbsDec(CParser.PtrGccAbsDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qualDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterQualDirAbsDec(CParser.QualDirAbsDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qualDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitQualDirAbsDec(CParser.QualDirAbsDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decParamDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDecParamDirAbsDec(CParser.DecParamDirAbsDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decParamDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDecParamDirAbsDec(CParser.DecParamDirAbsDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDecDirAbsDec(CParser.DecDirAbsDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDecDirAbsDec(CParser.DecDirAbsDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decQualDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDecQualDirAbsDec(CParser.DecQualDirAbsDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decQualDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDecQualDirAbsDec(CParser.DecQualDirAbsDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decAddrDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDecAddrDirAbsDec(CParser.DecAddrDirAbsDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decAddrDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDecAddrDirAbsDec(CParser.DecAddrDirAbsDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addrDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAddrDirAbsDec(CParser.AddrDirAbsDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addrDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAddrDirAbsDec(CParser.AddrDirAbsDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decStaticQualDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDecStaticQualDirAbsDec(CParser.DecStaticQualDirAbsDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decStaticQualDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDecStaticQualDirAbsDec(CParser.DecStaticQualDirAbsDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code qualStaticDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterQualStaticDirAbsDec(CParser.QualStaticDirAbsDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code qualStaticDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitQualStaticDirAbsDec(CParser.QualStaticDirAbsDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decQualStaticDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDecQualStaticDirAbsDec(CParser.DecQualStaticDirAbsDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decQualStaticDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDecQualStaticDirAbsDec(CParser.DecQualStaticDirAbsDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterParamDirAbsDec(CParser.ParamDirAbsDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitParamDirAbsDec(CParser.ParamDirAbsDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code staticQualDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStaticQualDirAbsDec(CParser.StaticQualDirAbsDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code staticQualDirAbsDec}
	 * labeled alternative in {@link CParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStaticQualDirAbsDec(CParser.StaticQualDirAbsDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(CParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(CParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assgnInit}
	 * labeled alternative in {@link CParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterAssgnInit(CParser.AssgnInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assgnInit}
	 * labeled alternative in {@link CParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitAssgnInit(CParser.AssgnInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listInit}
	 * labeled alternative in {@link CParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterListInit(CParser.ListInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listInit}
	 * labeled alternative in {@link CParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitListInit(CParser.ListInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multInitList}
	 * labeled alternative in {@link CParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterMultInitList(CParser.MultInitListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multInitList}
	 * labeled alternative in {@link CParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitMultInitList(CParser.MultInitListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInitList}
	 * labeled alternative in {@link CParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterSingleInitList(CParser.SingleInitListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInitList}
	 * labeled alternative in {@link CParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitSingleInitList(CParser.SingleInitListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(CParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(CParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleDesList}
	 * labeled alternative in {@link CParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterSingleDesList(CParser.SingleDesListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleDesList}
	 * labeled alternative in {@link CParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitSingleDesList(CParser.SingleDesListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDesList}
	 * labeled alternative in {@link CParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterMultDesList(CParser.MultDesListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDesList}
	 * labeled alternative in {@link CParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitMultDesList(CParser.MultDesListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayDes}
	 * labeled alternative in {@link CParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterArrayDes(CParser.ArrayDesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayDes}
	 * labeled alternative in {@link CParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitArrayDes(CParser.ArrayDesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcDes}
	 * labeled alternative in {@link CParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterFuncDes(CParser.FuncDesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDes}
	 * labeled alternative in {@link CParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitFuncDes(CParser.FuncDesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(CParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(CParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code labelStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLabelStat(CParser.LabelStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code labelStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLabelStat(CParser.LabelStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cmpStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCmpStat(CParser.CmpStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cmpStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCmpStat(CParser.CmpStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStat(CParser.ExprStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStat(CParser.ExprStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStat(CParser.SelectStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStat(CParser.SelectStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIterStat(CParser.IterStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIterStat(CParser.IterStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jumpStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStat(CParser.JumpStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jumpStat}
	 * labeled alternative in {@link CParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStat(CParser.JumpStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idLabelStat}
	 * labeled alternative in {@link CParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterIdLabelStat(CParser.IdLabelStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idLabelStat}
	 * labeled alternative in {@link CParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitIdLabelStat(CParser.IdLabelStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseLabelStat}
	 * labeled alternative in {@link CParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseLabelStat(CParser.CaseLabelStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseLabelStat}
	 * labeled alternative in {@link CParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseLabelStat(CParser.CaseLabelStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defLabelStat}
	 * labeled alternative in {@link CParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefLabelStat(CParser.DefLabelStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defLabelStat}
	 * labeled alternative in {@link CParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefLabelStat(CParser.DefLabelStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(CParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(CParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multBlockItemList}
	 * labeled alternative in {@link CParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterMultBlockItemList(CParser.MultBlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multBlockItemList}
	 * labeled alternative in {@link CParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitMultBlockItemList(CParser.MultBlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleBlockItemList}
	 * labeled alternative in {@link CParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterSingleBlockItemList(CParser.SingleBlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleBlockItemList}
	 * labeled alternative in {@link CParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitSingleBlockItemList(CParser.SingleBlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statBlockItem}
	 * labeled alternative in {@link CParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterStatBlockItem(CParser.StatBlockItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statBlockItem}
	 * labeled alternative in {@link CParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitStatBlockItem(CParser.StatBlockItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decBlockItem}
	 * labeled alternative in {@link CParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterDecBlockItem(CParser.DecBlockItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decBlockItem}
	 * labeled alternative in {@link CParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitDecBlockItem(CParser.DecBlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(CParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(CParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifSelecStat}
	 * labeled alternative in {@link CParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfSelecStat(CParser.IfSelecStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifSelecStat}
	 * labeled alternative in {@link CParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfSelecStat(CParser.IfSelecStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchSelecStat}
	 * labeled alternative in {@link CParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchSelecStat(CParser.SwitchSelecStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchSelecStat}
	 * labeled alternative in {@link CParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchSelecStat(CParser.SwitchSelecStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileIterStat}
	 * labeled alternative in {@link CParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileIterStat(CParser.WhileIterStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileIterStat}
	 * labeled alternative in {@link CParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileIterStat(CParser.WhileIterStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doIterStat}
	 * labeled alternative in {@link CParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoIterStat(CParser.DoIterStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doIterStat}
	 * labeled alternative in {@link CParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoIterStat(CParser.DoIterStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forIterStat}
	 * labeled alternative in {@link CParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterForIterStat(CParser.ForIterStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forIterStat}
	 * labeled alternative in {@link CParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitForIterStat(CParser.ForIterStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decForCond}
	 * labeled alternative in {@link CParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterDecForCond(CParser.DecForCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decForCond}
	 * labeled alternative in {@link CParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitDecForCond(CParser.DecForCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expForCond}
	 * labeled alternative in {@link CParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterExpForCond(CParser.ExpForCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expForCond}
	 * labeled alternative in {@link CParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitExpForCond(CParser.ExpForCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multForDec}
	 * labeled alternative in {@link CParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMultForDec(CParser.MultForDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multForDec}
	 * labeled alternative in {@link CParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMultForDec(CParser.MultForDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleForDec}
	 * labeled alternative in {@link CParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleForDec(CParser.SingleForDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleForDec}
	 * labeled alternative in {@link CParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleForDec(CParser.SingleForDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleForExpr}
	 * labeled alternative in {@link CParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleForExpr(CParser.SingleForExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleForExpr}
	 * labeled alternative in {@link CParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleForExpr(CParser.SingleForExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multForExpr}
	 * labeled alternative in {@link CParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultForExpr(CParser.MultForExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multForExpr}
	 * labeled alternative in {@link CParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultForExpr(CParser.MultForExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gotoJumpStat}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoJumpStat(CParser.GotoJumpStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gotoJumpStat}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoJumpStat(CParser.GotoJumpStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code continueJumpStat}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueJumpStat(CParser.ContinueJumpStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code continueJumpStat}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueJumpStat(CParser.ContinueJumpStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakJumpStat}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakJumpStat(CParser.BreakJumpStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakJumpStat}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakJumpStat(CParser.BreakJumpStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnJumpStat}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnJumpStat(CParser.ReturnJumpStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnJumpStat}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnJumpStat(CParser.ReturnJumpStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gotoExpJumpStat}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoExpJumpStat(CParser.GotoExpJumpStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gotoExpJumpStat}
	 * labeled alternative in {@link CParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoExpJumpStat(CParser.GotoExpJumpStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(CParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(CParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleTransUnit}
	 * labeled alternative in {@link CParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterSingleTransUnit(CParser.SingleTransUnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleTransUnit}
	 * labeled alternative in {@link CParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitSingleTransUnit(CParser.SingleTransUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multTransUnit}
	 * labeled alternative in {@link CParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterMultTransUnit(CParser.MultTransUnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multTransUnit}
	 * labeled alternative in {@link CParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitMultTransUnit(CParser.MultTransUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcExtDec}
	 * labeled alternative in {@link CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncExtDec(CParser.FuncExtDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcExtDec}
	 * labeled alternative in {@link CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncExtDec(CParser.FuncExtDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decExtDec}
	 * labeled alternative in {@link CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDecExtDec(CParser.DecExtDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decExtDec}
	 * labeled alternative in {@link CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDecExtDec(CParser.DecExtDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empty}
	 * labeled alternative in {@link CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(CParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empty}
	 * labeled alternative in {@link CParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(CParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(CParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(CParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleDecList}
	 * labeled alternative in {@link CParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterSingleDecList(CParser.SingleDecListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleDecList}
	 * labeled alternative in {@link CParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitSingleDecList(CParser.SingleDecListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDecList}
	 * labeled alternative in {@link CParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterMultDecList(CParser.MultDecListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDecList}
	 * labeled alternative in {@link CParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitMultDecList(CParser.MultDecListContext ctx);
}