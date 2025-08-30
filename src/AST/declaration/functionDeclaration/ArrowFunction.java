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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ArrowFunction {\n");

        Space.currentValue++;

        // Append parameterList
        if (parameterList != null) {
            stringBuilder.append(parameterList).append(",\n");
        }
        else {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("rejectionReason  = ").append(identifier).append(",\n");
        }

        if (typeAnnotation != null) {
            stringBuilder.append(typeAnnotation).append(",\n");
        }

        if (statement != null) {
            stringBuilder.append(statement).append(",\n");
        }
        else {
            stringBuilder.append(block).append(",\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");

        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() {
        return "";
    }

    @Override
    public String convertToCSS() {
        return "";
    }

    @Override
    public String convertToJS() {
        StringBuilder stringBuilder = new StringBuilder();

        if (identifier != null) {
            stringBuilder.append(identifier).append(" ");
        }
        else {
            stringBuilder.append("(").append(parameterList.convertToJS()).append(") ");
        }

        stringBuilder.append(" => ");

        if (statement != null) {
            stringBuilder.append(statement.convertToJS());
        }
        else {
            stringBuilder.append(block.convertToJS());
        }

        return stringBuilder.toString();
    }
}
