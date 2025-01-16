package AST.declaration.functionDeclaration;

import AST.helpers.Space;
import AST.helpers.Block;
import AST.parameterList.ParameterList;
import AST.typeAnnotation.TypeAnnotation;
import AST.statement.Statement;

public class ArrowFunction extends FunctionDeclaration {
    private ParameterList  parameterList;
    private String identifier;
    private TypeAnnotation typeAnnotation;
    private Statement statement;
    private Block block;

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

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
        StringBuilder stringBuilder = new StringBuilder("ArrowFunction { ");

        Space.currentValue++;

        // Append parameterList
        if (parameterList != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append(parameterList).append(",\n");
        }
        else {
            stringBuilder.append("\t".repeat(Space.currentValue)).append(identifier).append(",\n");
        }

        if (typeAnnotation != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append(typeAnnotation).append(",\n");
        }

        if (statement != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append(statement).append(",\n");
        }
        else {
            stringBuilder.append("\t".repeat(Space.currentValue)).append(block).append(",\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");

        return stringBuilder.toString();
    }
}
