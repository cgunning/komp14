package se.cgunning.java.models;

/**
 * Created by christoffergunning on 3/27/14.
 */
public class JavaVariable {
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        return ((JavaVariable) obj).getType().equals(type);
    }
}
