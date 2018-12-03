package parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class ExpressSchemaParser implements ExpressGrammarListener{

    private Entity curEntity;
    private List<Entity> entityList = new ArrayList<Entity>();

    public List<Entity> GetEntityList() {
        return entityList;
    }

    @Override
    public void enterSchema(ExpressGrammarParser.SchemaContext ctx) {

    }

    @Override
    public void exitSchema(ExpressGrammarParser.SchemaContext ctx) {

    }

    @Override
    public void enterBeginSchema(ExpressGrammarParser.BeginSchemaContext ctx) {

    }

    @Override
    public void exitBeginSchema(ExpressGrammarParser.BeginSchemaContext ctx) {

    }

    @Override
    public void enterEntity(ExpressGrammarParser.EntityContext ctx) {

    }

    @Override
    public void exitEntity(ExpressGrammarParser.EntityContext ctx) {
        entityList.add(curEntity);
    }

    @Override
    public void enterBeginEntity(ExpressGrammarParser.BeginEntityContext ctx) {
        curEntity = new Entity(ctx.NAME().getText());
    }

    @Override
    public void exitBeginEntity(ExpressGrammarParser.BeginEntityContext ctx) {

    }

    @Override
    public void enterEntityType(ExpressGrammarParser.EntityTypeContext ctx) {

    }

    @Override
    public void exitEntityType(ExpressGrammarParser.EntityTypeContext ctx) {

    }

    @Override
    public void enterSubtype(ExpressGrammarParser.SubtypeContext ctx) {
        curEntity.setParent(ctx.NAME().getText());
    }

    @Override
    public void exitSubtype(ExpressGrammarParser.SubtypeContext ctx) {

    }

    @Override
    public void enterSupertypeOf(ExpressGrammarParser.SupertypeOfContext ctx) {

    }

    @Override
    public void exitSupertypeOf(ExpressGrammarParser.SupertypeOfContext ctx) {

    }

    @Override
    public void enterAttr(ExpressGrammarParser.AttrContext ctx) {
        curEntity.addAttribute(ctx.NAME().getText());
    }

    @Override
    public void exitAttr(ExpressGrammarParser.AttrContext ctx) {

    }

    @Override
    public void enterCollectionOf(ExpressGrammarParser.CollectionOfContext ctx) {

    }

    @Override
    public void exitCollectionOf(ExpressGrammarParser.CollectionOfContext ctx) {

    }

    @Override
    public void enterCollectionArgPart(ExpressGrammarParser.CollectionArgPartContext ctx) {

    }

    @Override
    public void exitCollectionArgPart(ExpressGrammarParser.CollectionArgPartContext ctx) {

    }

    @Override
    public void enterBeginNameList(ExpressGrammarParser.BeginNameListContext ctx) {

    }

    @Override
    public void exitBeginNameList(ExpressGrammarParser.BeginNameListContext ctx) {

    }

    @Override
    public void enterEndNameList(ExpressGrammarParser.EndNameListContext ctx) {

    }

    @Override
    public void exitEndNameList(ExpressGrammarParser.EndNameListContext ctx) {

    }

    @Override
    public void enterNameList(ExpressGrammarParser.NameListContext ctx) {

    }

    @Override
    public void exitNameList(ExpressGrammarParser.NameListContext ctx) {

    }

    @Override
    public void enterNames(ExpressGrammarParser.NamesContext ctx) {

    }

    @Override
    public void exitNames(ExpressGrammarParser.NamesContext ctx) {

    }

    @Override
    public void enterTypeName(ExpressGrammarParser.TypeNameContext ctx) {

    }

    @Override
    public void exitTypeName(ExpressGrammarParser.TypeNameContext ctx) {

    }

    @Override
    public void enterType(ExpressGrammarParser.TypeContext ctx) {

    }

    @Override
    public void exitType(ExpressGrammarParser.TypeContext ctx) {

    }

    @Override
    public void enterInversePart(ExpressGrammarParser.InversePartContext ctx) {

    }

    @Override
    public void exitInversePart(ExpressGrammarParser.InversePartContext ctx) {

    }

    @Override
    public void enterInverseSentence(ExpressGrammarParser.InverseSentenceContext ctx) {

    }

    @Override
    public void exitInverseSentence(ExpressGrammarParser.InverseSentenceContext ctx) {

    }

    @Override
    public void enterDerivePart(ExpressGrammarParser.DerivePartContext ctx) {

    }

    @Override
    public void exitDerivePart(ExpressGrammarParser.DerivePartContext ctx) {

    }

    @Override
    public void enterDeriveOverrideSentence(ExpressGrammarParser.DeriveOverrideSentenceContext ctx) {

    }

    @Override
    public void exitDeriveOverrideSentence(ExpressGrammarParser.DeriveOverrideSentenceContext ctx) {

    }

    @Override
    public void enterDeriveSentence(ExpressGrammarParser.DeriveSentenceContext ctx) {

    }

    @Override
    public void exitDeriveSentence(ExpressGrammarParser.DeriveSentenceContext ctx) {

    }

    @Override
    public void enterUniquePart(ExpressGrammarParser.UniquePartContext ctx) {

    }

    @Override
    public void exitUniquePart(ExpressGrammarParser.UniquePartContext ctx) {

    }

    @Override
    public void enterUniqueSentence(ExpressGrammarParser.UniqueSentenceContext ctx) {

    }

    @Override
    public void exitUniqueSentence(ExpressGrammarParser.UniqueSentenceContext ctx) {

    }

    @Override
    public void enterWherePart(ExpressGrammarParser.WherePartContext ctx) {

    }

    @Override
    public void exitWherePart(ExpressGrammarParser.WherePartContext ctx) {

    }

    @Override
    public void enterWhereSentence(ExpressGrammarParser.WhereSentenceContext ctx) {

    }

    @Override
    public void exitWhereSentence(ExpressGrammarParser.WhereSentenceContext ctx) {

    }

    @Override
    public void enterFunction(ExpressGrammarParser.FunctionContext ctx) {

    }

    @Override
    public void exitFunction(ExpressGrammarParser.FunctionContext ctx) {

    }

    @Override
    public void enterTherule(ExpressGrammarParser.TheruleContext ctx) {

    }

    @Override
    public void exitTherule(ExpressGrammarParser.TheruleContext ctx) {

    }

    @Override
    public void enterCommonKeyword(ExpressGrammarParser.CommonKeywordContext ctx) {

    }

    @Override
    public void exitCommonKeyword(ExpressGrammarParser.CommonKeywordContext ctx) {

    }

    @Override
    public void enterCommonSentence(ExpressGrammarParser.CommonSentenceContext ctx) {

    }

    @Override
    public void exitCommonSentence(ExpressGrammarParser.CommonSentenceContext ctx) {

    }

    @Override
    public void enterTypeSingleKeyword(ExpressGrammarParser.TypeSingleKeywordContext ctx) {

    }

    @Override
    public void exitTypeSingleKeyword(ExpressGrammarParser.TypeSingleKeywordContext ctx) {

    }

    @Override
    public void enterTypeArrayKeyword(ExpressGrammarParser.TypeArrayKeywordContext ctx) {

    }

    @Override
    public void exitTypeArrayKeyword(ExpressGrammarParser.TypeArrayKeywordContext ctx) {

    }

    @Override
    public void enterTypeKeyword(ExpressGrammarParser.TypeKeywordContext ctx) {

    }

    @Override
    public void exitTypeKeyword(ExpressGrammarParser.TypeKeywordContext ctx) {

    }

    @Override
    public void enterInnerKeyword(ExpressGrammarParser.InnerKeywordContext ctx) {

    }

    @Override
    public void exitInnerKeyword(ExpressGrammarParser.InnerKeywordContext ctx) {

    }

    @Override
    public void enterSign(ExpressGrammarParser.SignContext ctx) {

    }

    @Override
    public void exitSign(ExpressGrammarParser.SignContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }

    public static void main(String[] args) {
        try {

            CharStream input = CharStreams.fromFileName("src\\main\\resources\\ifc4.exp");

            ExpressGrammarLexer lexer = new ExpressGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExpressGrammarParser parser = new ExpressGrammarParser(tokens);
            ParseTree tree = parser.schema();


            ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
            ExpressSchemaParser extractor = new ExpressSchemaParser();
            walker.walk(extractor, tree); // initiate walk of tree with listener
            List<Entity> res = extractor.GetEntityList();
            for (Entity e: res) System.out.println(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
