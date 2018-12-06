// Generated from F:/JavaWorkSpace/IfcGraph/src/main/resources\STEPGrammar.g4 by ANTLR 4.7
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link STEPGrammarParser}.
 */
public interface STEPGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link STEPGrammarParser#ifcFile}.
	 * @param ctx the parse tree
	 */
	void enterIfcFile(STEPGrammarParser.IfcFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link STEPGrammarParser#ifcFile}.
	 * @param ctx the parse tree
	 */
	void exitIfcFile(STEPGrammarParser.IfcFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link STEPGrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(STEPGrammarParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link STEPGrammarParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(STEPGrammarParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link STEPGrammarParser#headerLine}.
	 * @param ctx the parse tree
	 */
	void enterHeaderLine(STEPGrammarParser.HeaderLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link STEPGrammarParser#headerLine}.
	 * @param ctx the parse tree
	 */
	void exitHeaderLine(STEPGrammarParser.HeaderLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link STEPGrammarParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(STEPGrammarParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link STEPGrammarParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(STEPGrammarParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link STEPGrammarParser#dataLine}.
	 * @param ctx the parse tree
	 */
	void enterDataLine(STEPGrammarParser.DataLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link STEPGrammarParser#dataLine}.
	 * @param ctx the parse tree
	 */
	void exitDataLine(STEPGrammarParser.DataLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link STEPGrammarParser#typedListArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypedListArgument(STEPGrammarParser.TypedListArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link STEPGrammarParser#typedListArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypedListArgument(STEPGrammarParser.TypedListArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link STEPGrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(STEPGrammarParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link STEPGrammarParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(STEPGrammarParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link STEPGrammarParser#listArgument}.
	 * @param ctx the parse tree
	 */
	void enterListArgument(STEPGrammarParser.ListArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link STEPGrammarParser#listArgument}.
	 * @param ctx the parse tree
	 */
	void exitListArgument(STEPGrammarParser.ListArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link STEPGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(STEPGrammarParser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link STEPGrammarParser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(STEPGrammarParser.ArgumentListContext ctx);
}