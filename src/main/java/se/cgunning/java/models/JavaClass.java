package se.cgunning.java.models;

import java.util.HashMap;

/**
 * Created by christoffergunning on 3/27/14.
 */
public class JavaClass {

    String ID;
    HashMap<String, JavaType> variables = new HashMap<>();
    HashMap<String, JavaMethod> methods = new HashMap<>();

    public JavaClass(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void addVariable(String id, JavaType variable) {
        variables.put(id, variable);
    }
    public void addMethod(String id, JavaMethod method) {
        methods.put(id, method);
    }

    public JavaType getVariable(String id) {
        return variables.get(id);
    }
    public JavaMethod getMethod(String id) {
        return methods.get(id);
    }
}
