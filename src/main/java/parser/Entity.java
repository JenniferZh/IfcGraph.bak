package parser;

import java.util.ArrayList;
import java.util.List;

public class Entity {
    private String name;
    private String version;
    private String parent;
    private List<String> attribute = new ArrayList<String>();

    public Entity(String name) {
        this.version = "IFC4";
        this.name = name;
    }
    public void addAttribute(String attr) {
        attribute.add(attr);
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String toString() {
        String str = name+" "+version+" "+parent+'\n';
        String attrs = "";
        for (String attr: attribute) {
            attrs += attr + " ";
        }
        return str+attrs+'\n';
    }
}