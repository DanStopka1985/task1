package qb.entities.sourcedb;

/**
 * Created by sdanilov on 16.09.2015.
 */
public class Sex {
    private String label;
    private String value;

    public Sex(String label, String value) {
        this.label = label;
        this.value = value;
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
}
