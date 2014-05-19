package mjc.models;

/**
 * Created by christoffergunning on 3/27/14.
 */
public class JavaType {

    private final int line;
    private String ID;
    private String type;
    private boolean isClassVariable = false;

    public JavaType(String ID, String type, int line) {
        this.ID = ID;
        this.type = type;
        this.line = line;
    }

    public String getID() {
        return ID;
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

    public void setIsClassVariable() {
        isClassVariable = true;
    }

    public boolean isClassVariable() {
        return isClassVariable;
    }
}
