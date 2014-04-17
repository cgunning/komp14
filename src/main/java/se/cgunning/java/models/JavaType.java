package se.cgunning.java.models;

/**
 * Created by christoffergunning on 3/27/14.
 */
public class JavaType {
    private String type;

    public JavaType(String type) {
        this.type = type;
    }

    public JavaType() {
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        return ((JavaType) obj).getType().equals(type);
    }
}
