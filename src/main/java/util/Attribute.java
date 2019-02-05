package util;

public class Attribute {
    private String name;
    private boolean isDerived = false;
    private int index = -1;
    private String type;

    //default attribute is direct and has no index
    public Attribute(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void SetDerived(boolean isDerived) {
        this.isDerived = isDerived;
    }

    public void SetIndex(int index) {
        this.index = index;
    }

    public void SetType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getIndex() {
        return index;
    }

    public String toString() {
        String str = "";
        str += "{name:"+name+",";
        str += "isderived:"+isDerived+",";
        str += "index:"+index+"}";
        return str;
    }
}
