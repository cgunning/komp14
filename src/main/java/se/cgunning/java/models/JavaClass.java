package se.cgunning.java.models;

import java.util.HashMap;

/**
 * Created by christoffergunning on 3/27/14.
 */
public class JavaClass {
    HashMap<String, JavaVariable> variables = new HashMap<String, JavaVariable>();

    HashMap<String, JavaMethod> methods = new HashMap<String, JavaMethod>();

    public void addVariable(String id, JavaVariable variable) {
        variables.put(id, variable);
    }
    public void addMethod(String id, JavaMethod method) {
        methods.put(id, method);
    }

    public JavaVariable getVariable(String id) {
        return variables.get(id);
    }

    public JavaMethod getMethod(String id) {
        return methods.get(id);
    }
}
