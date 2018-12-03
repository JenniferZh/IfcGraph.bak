package parser;
// Generated from F:/JavaWorkSpace/IfcGraph/src/main/resources\ExpressGrammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressGrammarParser}.
 */
public interface ExpressGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#schema}.
	 * @param ctx the parse tree
	 */
	void enterSchema(ExpressGrammarParser.SchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#schema}.
	 * @param ctx the parse tree
	 */
	void exitSchema(ExpressGrammarParser.SchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#beginSchema}.
	 * @param ctx the parse tree
	 */
	void enterBeginSchema(ExpressGrammarParser.BeginSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#beginSchema}.
	 * @param ctx the parse tree
	 */
	void exitBeginSchema(ExpressGrammarParser.BeginSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(ExpressGrammarParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(ExpressGrammarParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#beginEntity}.
	 * @param ctx the parse tree
	 */
	void enterBeginEntity(ExpressGrammarParser.BeginEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#beginEntity}.
	 * @param ctx the parse tree
	 */
	void exitBeginEntity(ExpressGrammarParser.BeginEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#entityType}.
	 * @param ctx the parse tree
	 */
	void enterEntityType(ExpressGrammarParser.EntityTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#entityType}.
	 * @param ctx the parse tree
	 */
	void exitEntityType(ExpressGrammarParser.EntityTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtype}
	 * labeled alternative in {@link ExpressGrammarParser#subtypeOf}.
	 * @param ctx the parse tree
	 */
	void enterSubtype(ExpressGrammarParser.SubtypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtype}
	 * labeled alternative in {@link ExpressGrammarParser#subtypeOf}.
	 * @param ctx the parse tree
	 */
	void exitSubtype(ExpressGrammarParser.SubtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#supertypeOf}.
	 * @param ctx the parse tree
	 */
	void enterSupertypeOf(ExpressGrammarParser.SupertypeOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#supertypeOf}.
	 * @param ctx the parse tree
	 */
	void exitSupertypeOf(ExpressGrammarParser.SupertypeOfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attr}
	 * labeled alternative in {@link ExpressGrammarParser#entityArgument}.
	 * @param ctx the parse tree
	 */
	void enterAttr(ExpressGrammarParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attr}
	 * labeled alternative in {@link ExpressGrammarParser#entityArgument}.
	 * @param ctx the parse tree
	 */
	void exitAttr(ExpressGrammarParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#collectionOf}.
	 * @param ctx the parse tree
	 */
	void enterCollectionOf(ExpressGrammarParser.CollectionOfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#collectionOf}.
	 * @param ctx the parse tree
	 */
	void exitCollectionOf(ExpressGrammarParser.CollectionOfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#collectionArgPart}.
	 * @param ctx the parse tree
	 */
	void enterCollectionArgPart(ExpressGrammarParser.CollectionArgPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#collectionArgPart}.
	 * @param ctx the parse tree
	 */
	void exitCollectionArgPart(ExpressGrammarParser.CollectionArgPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#beginNameList}.
	 * @param ctx the parse tree
	 */
	void enterBeginNameList(ExpressGrammarParser.BeginNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#beginNameList}.
	 * @param ctx the parse tree
	 */
	void exitBeginNameList(ExpressGrammarParser.BeginNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#endNameList}.
	 * @param ctx the parse tree
	 */
	void enterEndNameList(ExpressGrammarParser.EndNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#endNameList}.
	 * @param ctx the parse tree
	 */
	void exitEndNameList(ExpressGrammarParser.EndNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#nameList}.
	 * @param ctx the parse tree
	 */
	void enterNameList(ExpressGrammarParser.NameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#nameList}.
	 * @param ctx the parse tree
	 */
	void exitNameList(ExpressGrammarParser.NameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#names}.
	 * @param ctx the parse tree
	 */
	void enterNames(ExpressGrammarParser.NamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#names}.
	 * @param ctx the parse tree
	 */
	void exitNames(ExpressGrammarParser.NamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(ExpressGrammarParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(ExpressGrammarParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ExpressGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ExpressGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#inversePart}.
	 * @param ctx the parse tree
	 */
	void enterInversePart(ExpressGrammarParser.InversePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#inversePart}.
	 * @param ctx the parse tree
	 */
	void exitInversePart(ExpressGrammarParser.InversePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#inverseSentence}.
	 * @param ctx the parse tree
	 */
	void enterInverseSentence(ExpressGrammarParser.InverseSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#inverseSentence}.
	 * @param ctx the parse tree
	 */
	void exitInverseSentence(ExpressGrammarParser.InverseSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#derivePart}.
	 * @param ctx the parse tree
	 */
	void enterDerivePart(ExpressGrammarParser.DerivePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#derivePart}.
	 * @param ctx the parse tree
	 */
	void exitDerivePart(ExpressGrammarParser.DerivePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#deriveOverrideSentence}.
	 * @param ctx the parse tree
	 */
	void enterDeriveOverrideSentence(ExpressGrammarParser.DeriveOverrideSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#deriveOverrideSentence}.
	 * @param ctx the parse tree
	 */
	void exitDeriveOverrideSentence(ExpressGrammarParser.DeriveOverrideSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#deriveSentence}.
	 * @param ctx the parse tree
	 */
	void enterDeriveSentence(ExpressGrammarParser.DeriveSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#deriveSentence}.
	 * @param ctx the parse tree
	 */
	void exitDeriveSentence(ExpressGrammarParser.DeriveSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#uniquePart}.
	 * @param ctx the parse tree
	 */
	void enterUniquePart(ExpressGrammarParser.UniquePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#uniquePart}.
	 * @param ctx the parse tree
	 */
	void exitUniquePart(ExpressGrammarParser.UniquePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#uniqueSentence}.
	 * @param ctx the parse tree
	 */
	void enterUniqueSentence(ExpressGrammarParser.UniqueSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#uniqueSentence}.
	 * @param ctx the parse tree
	 */
	void exitUniqueSentence(ExpressGrammarParser.UniqueSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#wherePart}.
	 * @param ctx the parse tree
	 */
	void enterWherePart(ExpressGrammarParser.WherePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#wherePart}.
	 * @param ctx the parse tree
	 */
	void exitWherePart(ExpressGrammarParser.WherePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#whereSentence}.
	 * @param ctx the parse tree
	 */
	void enterWhereSentence(ExpressGrammarParser.WhereSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#whereSentence}.
	 * @param ctx the parse tree
	 */
	void exitWhereSentence(ExpressGrammarParser.WhereSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ExpressGrammarParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ExpressGrammarParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#therule}.
	 * @param ctx the parse tree
	 */
	void enterTherule(ExpressGrammarParser.TheruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#therule}.
	 * @param ctx the parse tree
	 */
	void exitTherule(ExpressGrammarParser.TheruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#commonKeyword}.
	 * @param ctx the parse tree
	 */
	void enterCommonKeyword(ExpressGrammarParser.CommonKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#commonKeyword}.
	 * @param ctx the parse tree
	 */
	void exitCommonKeyword(ExpressGrammarParser.CommonKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#commonSentence}.
	 * @param ctx the parse tree
	 */
	void enterCommonSentence(ExpressGrammarParser.CommonSentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#commonSentence}.
	 * @param ctx the parse tree
	 */
	void exitCommonSentence(ExpressGrammarParser.CommonSentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#typeSingleKeyword}.
	 * @param ctx the parse tree
	 */
	void enterTypeSingleKeyword(ExpressGrammarParser.TypeSingleKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#typeSingleKeyword}.
	 * @param ctx the parse tree
	 */
	void exitTypeSingleKeyword(ExpressGrammarParser.TypeSingleKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#typeArrayKeyword}.
	 * @param ctx the parse tree
	 */
	void enterTypeArrayKeyword(ExpressGrammarParser.TypeArrayKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#typeArrayKeyword}.
	 * @param ctx the parse tree
	 */
	void exitTypeArrayKeyword(ExpressGrammarParser.TypeArrayKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#typeKeyword}.
	 * @param ctx the parse tree
	 */
	void enterTypeKeyword(ExpressGrammarParser.TypeKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#typeKeyword}.
	 * @param ctx the parse tree
	 */
	void exitTypeKeyword(ExpressGrammarParser.TypeKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#innerKeyword}.
	 * @param ctx the parse tree
	 */
	void enterInnerKeyword(ExpressGrammarParser.InnerKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#innerKeyword}.
	 * @param ctx the parse tree
	 */
	void exitInnerKeyword(ExpressGrammarParser.InnerKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressGrammarParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(ExpressGrammarParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressGrammarParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(ExpressGrammarParser.SignContext ctx);
}