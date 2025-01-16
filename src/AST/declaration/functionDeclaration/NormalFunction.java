package AST.declaration.functionDeclaration;

import AST.helpers.Space;
import AST.helpers.Block;
import AST.parameterList.ParameterList;
import AST.typeAnnotation.TypeAnnotation;

public class NormalFunction extends FunctionDeclaration {
    private String name;
    ParameterList parameterList;
    TypeAnnotation typeAnnotation;
    private Block block;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("NormalFunction: {\n");

        Space.currentValue++;

        // Append name
        if (name != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Name = ").append(name).append(",\n");
        }

        // Append parameterList
        if (parameterList != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append(parameterList).append(",\n");
        }

        // Append typeAnnotation
        if (typeAnnotation != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append(typeAnnotation).append(",\n");
        }

        // Append block
        if (block != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append(block).append(",\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");

        return stringBuilder.toString();
    }
}
