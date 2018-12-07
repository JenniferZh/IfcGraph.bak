package parser;

import dao.IfcData;
import dao.IfcMetaData;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import util.ConfigReader;


import java.io.IOException;
import java.util.*;

public class IfcFileLoader extends STEPGrammarBaseVisitor<Void> {
    private Element curElement = null;
    private List<Element> elementList = new ArrayList<>();
    private List<Entity> entityList;
    private Map<String, Entity> entityMap;
    private Set<String> exclude;
    private IfcData database;

    public int cnt = 0;

    public IfcFileLoader() throws IOException{
        IfcMetaData meta = new IfcMetaData("src\\main\\resources\\IFC2X3.exp");
        entityList = meta.getEntityList();
        entityMap = new HashMap<String, Entity>();
        database = new IfcData();
        database.createDb();
        database.createIndexForLineId();

        exclude = ConfigReader.readExcluded();

        for (Entity entity: entityList) {
            entityMap.put(entity.getName().toUpperCase(), entity);
        }
    }

    public Void visitDataLine(STEPGrammarParser.DataLineContext ctx) {

        int lineId = Integer.parseInt(ctx.INT().getText());
        String type = ctx.typedListArgument().NAME().getText();

        if (exclude.contains(type)) return null;

        cnt++;
        curElement = new Element(type, lineId);

        int childCnt = ctx.typedListArgument().argumentList().getChildCount();
        for (int i = 0; i < childCnt; i++) {
            String attr = ctx.typedListArgument().argumentList().getChild(i).getText();
            if (!attr.equals(","))
                curElement.addAttribute(attr);
        }

        Entity entity = entityMap.get(type);
        if (!curElement.isValid(entity)) {
            System.out.print(entity);
            System.out.println(curElement);
            System.out.println();
        } else {
            elementList.add(curElement);
        }
        return null;
    }


    public void setRelation() {
        database.insertAll(elementList, entityMap);
        database.CreateRelation();
    }

    public void stop() {
        database.shutDown();
    }

    public static void main(String[] args) throws IOException {
        //伪代码
        long startTime=System.currentTimeMillis();   //获取开始时间

        CharStream input = CharStreams.fromFileName("E:\\1labdata\\IFC文件\\wall.ifc");

        STEPGrammarLexer lexer = new STEPGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        STEPGrammarParser parser = new STEPGrammarParser(tokens);
        ParseTree tree = parser.ifcFile();


        IfcFileLoader loader = new IfcFileLoader();
        loader.visit(tree);
        loader.setRelation();

        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");

        loader.stop();
        System.out.print(loader.cnt);




    }

}
