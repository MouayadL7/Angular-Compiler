package AST.statement;

import AST.Node;
import AST.helpers.Space;
import AST.helpers.Block;

public class StatementBody extends Node {
    Statement statement;
    Block block;

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("StatementBody: {\n");

        Space.currentValue++;

        // Append statement
        if (statement != null) {
            stringBuilder.append(statement).append(",\n");
        }

        // Append block
        if (block != null) {
            stringBuilder.append(block).append(",\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");

        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() {
        return null;
    }

    @Override
    public String convertToCSS() {
        return null;
    }

    @Override
    public String convertToJS() {
        return null;
    }
}
