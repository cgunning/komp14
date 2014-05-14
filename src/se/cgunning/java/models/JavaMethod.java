package se.cgunning.java.models;

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
        arguments.put(argCount++, argument);
    }

    public void addVariable(String id, JavaType variable) {
        variables.put(id, variable);
    }

    public JavaType getVariable(String id) {
        return variables.get(id);
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
}
