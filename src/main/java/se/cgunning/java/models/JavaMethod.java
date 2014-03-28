package se.cgunning.java.models;

import java.util.HashMap;

/**
 * Created by christoffergunning on 3/27/14.
 */
public class JavaMethod {


    HashMap<String, JavaVariable> arguments = new HashMap<String, JavaVariable>();

    HashMap<String, JavaVariable> variables = new HashMap<String, JavaVariable>();

    public void addArgument(String id, JavaVariable argument) {
        arguments.put(id, argument);
    }

    public void addVariable(String id, JavaVariable variable) {
        variables.put(id, variable);
    }

    public JavaVariable getVariable(String id) {
        return variables.get(id);
    }

    public JavaVariable getArgument(String id) {
        return arguments.get(id);
    }

}
