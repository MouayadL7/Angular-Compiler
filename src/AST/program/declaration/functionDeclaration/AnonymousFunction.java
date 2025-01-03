package AST.program.declaration.functionDeclaration;

import AST.Space;
import AST.helpers.Block;
import AST.typeAnnotation.TypeAnnotation;
import AST.parameterList.ParameterList;

public class AnonymousFunction extends FunctionDeclaration {
    private ParameterList parameterList;
    private TypeAnnotation typeAnnotation;
    private Block block;

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
