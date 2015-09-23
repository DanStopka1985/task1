package qb.entities.sourcedb;

import java.util.ArrayList;

/**
 * Created by sdanilov on 15.09.2015.
 */
public class MKB10 {
    private String label;
    private String value;
    private boolean is_leaf;
    private int level;
    private boolean have_children;
    private ArrayList<MKB10> children;

    public boolean isHave_children() {
        return have_children;
    }

    public void setHave_children(boolean have_children) {
        this.have_children = have_children;
    }

    public MKB10() {
    }

    public MKB10(String label, String value, boolean is_leaf, int level, boolean have_children) {
        this.label = label;
        this.value = value;
        this.is_leaf = is_leaf;
        this.level = level;
        this.have_children = have_children;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isIs_leaf() {
        return is_leaf;
    }

    public void setIs_leaf(boolean is_leaf) {
        this.is_leaf = is_leaf;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ArrayList<MKB10> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<MKB10> children) {
        this.children = children;
    }
}
