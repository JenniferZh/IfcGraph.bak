package dao;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import parser.*;
import util.Attribute;
import util.Entity;

import java.util.*;

public class SchemaFileLoader extends ExpressGrammarBaseVisitor<Void> {

    private Entity curEntity;
    private List<Entity> entityList = new LinkedList<>();
    private Map<String, String[]> selectType = new HashMap<>();

    /**
     *
     * @param filePath file path of ifc schema file(.exp)
     * @return list of entities
     */
    public static SchemaFileLoader getSchemaLoader(String filePath) {
        try {

            CharStream input = CharStreams.fromFileName(filePath);

            ExpressGrammarLexer lexer = new ExpressGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExpressGrammarParser parser = new ExpressGrammarParser(tokens);
            ParseTree tree = parser.schema();


            SchemaFileLoader loader = new SchemaFileLoader();
            loader.visit(tree);
            loader.getDerivedAttributes();
            return loader;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public List<Entity> getEntityList() {
        return entityList;
    }

    public Map<String, String[]> getSelectType() { return selectType;}

    private void getDerivedAttributes() {
        Map<String, Entity> entityMap = new HashMap<String, Entity>();
        Set<String> visited = new HashSet<>();

        for (Entity entity: entityList) {
            entityMap.put(entity.getName(), entity);
        }
        for (Entity entity: entityList) {
            if (entity.getParentName() != null) {
                Entity parent = entityMap.get(entity.getParentName());
                entity.setParent(parent);
            }
        }
        for (Entity entity: entityList) {
            findDerivedAttribute(entity, visited);
        }
        for (Entity entity: entityList) {
            List<Attribute> attrList = entity.getAttributes();
            for (int i = 0; i < attrList.size(); i++) {
                attrList.get(i).SetIndex(i);
            }
        }
    }

    private void findDerivedAttribute(Entity entity, Set<String> visited) {
        if (visited.contains(entity.getName())) return;

        visited.add(entity.getName());
        if (entity.getParent() == null) return;
        Entity parent = entity.getParent();
        findDerivedAttribute(parent, visited);
        List<Attribute> parent_attr = parent.getAttributes();
        for (int i = parent_attr.size()-1; i >= 0; i--) {
            // do not copy reference, new an attribute here
            Attribute new_attr = new Attribute(parent_attr.get(i).getName());
            new_attr.SetType(parent_attr.get(i).getType());
            new_attr.SetDerived(true);
            entity.getAttributes().add(0, new_attr);
        }
    }

    @Override
    public Void visitBeginEntity(ExpressGrammarParser.BeginEntityContext ctx) {
        curEntity = new Entity(ctx.NAME().getText());
        entityList.add(curEntity);
        return null;
    }

    @Override
    public Void visitSubtype(ExpressGrammarParser.SubtypeContext ctx) {
        curEntity.setParentName(ctx.NAME().getText());
        return null;
    }

    @Override
    public Void visitAttr(ExpressGrammarParser.AttrContext ctx) {
        String attr = ctx.getText();
        int indexOfComma = attr.indexOf(':');
        String typeInfo = attr.substring(indexOfComma+1);
        int indexOfType = typeInfo.indexOf("Ifc");
        String type = "primitive";
        if (indexOfType != -1)
            type = typeInfo.substring(indexOfType);
        //System.out.println(type);
        curEntity.addAttribute(ctx.NAME().getText(), type);

        return null;
    }

    @Override
    public Void visitType(ExpressGrammarParser.TypeContext ctx) {
        if (ctx.SELECT() != null) {
            String nameList = ctx.nameList().getText();
            nameList = nameList.substring(1, nameList.length()-1);
            String[] names = nameList.split(",");
            selectType.put(ctx.NAME().getText(), names);
            //System.out.println(nameList);
        }
        return null;
    }



    public static void main(String[] args) {

    }
}
