package se.cgunning.java.models;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by christoffergunning on 5/3/14.
 */
public class BlockStmt {

    int ID;

    BlockStmt superBlock;

    HashMap<String, JavaType> variables = new HashMap<String, JavaType>();

    public void addVariable(String id, JavaType variable) {
        variables.put(id, variable);
    }

    public JavaType getVariable(String id) {
        return variables.get(id);
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

    public void setSuperBlock(BlockStmt superBlock) {
        this.superBlock = superBlock;
    }

    public int getID() {
        return ID;
    }
}
