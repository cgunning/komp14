package mjc.models;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by christoffergunning on 5/3/14.
 */
public class BlockStmt {

    int ID;

    BlockStmt superBlock = null;
    JavaMethod superMethod = null;

    HashMap<String, JavaType> variables = new HashMap<String, JavaType>();

    public void addVariable(String id, JavaType variable) {
        if(isVariableAlreadyUsed(variable.getID()))
            System.exit(1);
        variables.put(id, variable);

    }

    public JavaType getVariable(String id) {
        return variables.get(id);
    }

    public HashMap<String, JavaType> getVariables() {
        return variables;
    }

    HashSet<BlockStmt> blockStmts = new HashSet<>();

    public BlockStmt(int ID) {
        this.ID = ID;
    }

    public HashSet<BlockStmt> getBlockStmts() {
        return blockStmts;
    }

    public void addBlockStmt(BlockStmt blockStmt) {
        blockStmts.add(blockStmt);
    }

    public BlockStmt getSuperBlock() {
        return superBlock;
    }

    public JavaMethod getSuperMethod() {
        return superMethod;
    }

    public void setSuperBlock(BlockStmt superBlock) {
        this.superBlock = superBlock;
    }

    public int getID() {
        return ID;
    }

    public void setSuperMethod(JavaMethod jm) {
        this.superMethod = jm;
    }

    public boolean isVariableAlreadyUsed(String variableID) {
        if(variables.containsKey(variableID))
            return true;

        return false;
    }
}
