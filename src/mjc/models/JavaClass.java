package mjc.models;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by christoffergunning on 3/27/14.
 */
public class JavaClass {

    String ID;
    String superClass;
    HashMap<String, JavaType> variables = new HashMap<>();
    HashMap<String, JavaMethod> methods = new HashMap<>();

    public JavaClass(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setSuperClass(String superClass) {
        this.superClass = superClass;
    }

    public String getSuperClass() {
        return superClass;
    }

    public void addVariable(String id, JavaType variable) {
        if(isVariableAlreadyUsed(id))
            System.exit(1);

        variables.put(id, variable);
    }
    public void addMethod(String id, JavaMethod method) {
        if(methods.keySet().contains(id))
            System.exit(1);
        methods.put(id, method);
    }

    public JavaType getVariable(String id) {
        return variables.get(id);
    }
    public HashMap<String, JavaType> getVariables() {
        return variables;
    }
    public JavaMethod getMethod(String id) {
        return methods.get(id);
    }

    public boolean isVariableAlreadyUsed(String variableID) {
        if(variables.containsKey(variableID))
            return true;

        return false;
    }
}
