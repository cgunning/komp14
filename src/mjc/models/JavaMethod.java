package mjc.models;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by christoffergunning on 3/27/14.
 */
public class JavaMethod {

    String ID;
    int argCount = 0;
    HashMap<Integer, JavaType> arguments = new HashMap<>();
    HashMap<String, JavaType> variables = new HashMap<String, JavaType>();
    HashSet<BlockStmt> blockStmts = new HashSet<>();
    boolean isMainMethod = false;

    public HashSet<BlockStmt> getBlockStmts() {
        return blockStmts;
    }

    public void addBlockStmt(BlockStmt blockStmt) {
        blockStmts.add(blockStmt);
    }

    JavaType returnType = null;

    public JavaMethod(String ID) {
        this.ID = ID;
    }

    public void addArgument(String id, JavaType argument) {
        if(isVariableAlreadyUsed(id))
            System.exit(1);
        arguments.put(argCount++, argument);
    }

    public void addVariable(String id, JavaType variable) {
        if(isVariableAlreadyUsed(id))
            System.exit(1);

        variables.put(id, variable);
    }

    public JavaType getVariable(String id) {
        return variables.get(id);
    }

    public HashMap<String, JavaType> getVariables() {
        return variables;
    }

    public JavaType getArgument(Integer index) {
        return arguments.get(index);
    }
    public HashMap<Integer, JavaType> getArguments() {
        return arguments;
    }

    public void setReturnType(JavaType type) {
        returnType = type;
    }
    public JavaType getReturnType() {
        return returnType;
    }

    public String getID() {
        return ID;
    }

    public void setMainMethod() {
        isMainMethod = true;
    }

    public boolean isMainMethod() {
        return isMainMethod;
    }

    public boolean isVariableAlreadyUsed(String variableID) {
        if(variables.containsKey(variableID))
            return true;

        for(Integer index : arguments.keySet()) {
            if(arguments.get(index).getID().equals(variableID))
                return true;
        }

        return false;
    }
}
