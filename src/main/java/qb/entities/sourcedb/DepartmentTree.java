package qb.entities.sourcedb;

import java.util.ArrayList;

/**
 * Created by sdanilov on 15.09.2015.
 */
public class DepartmentTree {
    private String label;
    private String value;
    private String departmentType;
    private String depTypeName;
    private ArrayList<Department> children;

    public DepartmentTree(String depTypeName, String depType) {
        this.label = depTypeName;
        this.value = depType;
        this.departmentType = depType;
        this.depTypeName = depTypeName;
    }

    public String getDepTypeName() {
        return depTypeName;
    }

    public void setDepTypeName(String depTypeName) {
        this.depTypeName = depTypeName;
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

    public String getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType;
    }

    public ArrayList<Department> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Department> children) {
        this.children = children;
    }
}
