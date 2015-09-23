package qb.entities.sourcedb;

/**
 * Created by sdanilov on 14.09.2015.
 */
public class Department {
    private String key;
    private String name;
    private String label;
    private String value;
    private String shortname;
    private String departmenttype;
    private String departmenttypename;

    public Department() {
    }

    public Department(String key, String depName, String shortName, String depType, String depTypeName) {
        this.key = key;
        this.name = depName;
        this.label = depName;
        this.value = key;
        this.shortname = shortName;
        this.departmenttype = depType;
        this.departmenttypename = depTypeName;
    }

    public String getDepartmenttypename() {
        return departmenttypename;
    }

    public void setDepartmenttypename(String departmenttypename) {
        this.departmenttypename = departmenttypename;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getDepartmenttype() {
        return departmenttype;
    }

    public void setDepartmenttype(String departmenttype) {
        this.departmenttype = departmenttype;
    }
}
