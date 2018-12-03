package parser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;



public class XmlSchemaParser {

    private Document doc = null;
    private List<Entity> entities = new ArrayList<Entity>();

    /**
     * read IFC Schema
     * @param path schema's file path
     */
    public XmlSchemaParser(String path) {
        try {
            File schema = new File(path);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(schema);
            ParseDoc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ParseDoc() {
        //get all <complextype> with the name starts with "ifc"
        NodeList entityList = doc.getElementsByTagName("xs:complexType");
        //filter with name
        for (int i = 0; i < entityList.getLength(); i++) {
            Element node = (Element) entityList.item(i);
            if (node.hasAttribute("name") && node.getAttribute("name").startsWith("Ifc")) {
                //System.out.println(node.getAttribute("name"));
                entities.add(ParseComplexType(node));
            }
        }
    }

    public Entity ParseComplexType(Element entity) {
        if (entity == null) throw new IllegalArgumentException();
        String entityType = entity.getAttribute("name");
        Entity en = new Entity(entityType);

        if (entity.getElementsByTagName("xs:extension").getLength() == 0) return en;

        Element info = (Element) entity.getElementsByTagName("xs:extension").item(0);
        if (info.hasAttribute("base") && info.getAttribute("base").startsWith("ifc:Ifc")) {
            String parent = info.getAttribute("base");
            parent = parent.substring(4);
            en.setParent(parent);
        }
        NodeList attrs = info.getChildNodes();
        for (int i = 0; i < attrs.getLength(); i++) {
            if (attrs.item(i).getNodeType() != Node.ELEMENT_NODE) continue;

            Element el = (Element) attrs.item(i);
            // if it's xs:sequence tag, get its direct childs' name attribute
            if (el.getTagName().equals("xs:sequence")) {
                NodeList tmpNodes = el.getChildNodes();
                for (int j = 0; j < tmpNodes.getLength(); j++) {
                    if (tmpNodes.item(j).getNodeType() != Node.ELEMENT_NODE) continue;
                    Element tmpEle = (Element) tmpNodes.item(j);
                    en.addAttribute(tmpEle.getAttribute("name"));
                }
            }
            if (el.getTagName().equals("xs:attribute")) {
                String attrName = el.getAttribute("name");
                en.addAttribute(attrName);
            }
        }
        return en;
    }

    public void PrintEntities() {
        for (Entity en: entities) {
            System.out.println(en);
        }
    }

    public static void main(String[] args) {
        XmlSchemaParser parser = new XmlSchemaParser("E:\\1schema\\ifcXML4.xsd");
        parser.PrintEntities();
    }
}
