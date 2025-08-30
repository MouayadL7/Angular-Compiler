package AST.declaration.classDeclaration;

import AST.Node;
import AST.helpers.Space;
import AST.helpers.*;
import AST.parameterList.ParameterList;
import AST.typeAnnotation.TypeAnnotation;

import java.util.ArrayList;
import java.util.List;

public class MethodDeclaration extends Node {
    private List<Decorator> decoratorList;
    private String name;
    private ParameterList parameterList;
    private TypeAnnotation typeAnnotation;
    private Block block;

    public MethodDeclaration() {
        this.decoratorList = new ArrayList<>();
    }

    public List<Decorator> getDecoratorList() {
        return decoratorList;
    }

    public void setDecoratorList(List<Decorator> decoratorList) {
        this.decoratorList = decoratorList;
    }

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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("MethodDeclaration: {\n");

        Space.currentValue++;

        // Append decoratorList
        if (!decoratorList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("decoratorList: [\n");
            for (Decorator property : decoratorList) {
                stringBuilder.append(property).append(",\n");
            }
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
        }

        // Append name
        stringBuilder.append("\t".repeat(Space.currentValue)).append("name = ").append(name != null ? name : "").append(",\n");

        // Append parameterList
        if (parameterList != null) {
            stringBuilder.append(parameterList).append(",\n");
        }

        // Append typeAnnotation
        if (typeAnnotation != null) {
            stringBuilder.append(typeAnnotation).append(",\n");
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
        return "";
    }

    @Override
    public String convertToCSS() {
        return "";
    }

    @Override
    public String convertToJS() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(name);
        stringBuilder.append("(");
        if (this.parameterList != null) {
            stringBuilder.append(parameterList.convertToJS());
        }
        stringBuilder.append(") ");
        stringBuilder.append("{\n");
        if (block != null) {
            stringBuilder.append(block.convertToJS());
        }
        stringBuilder.append("}");

        return stringBuilder.toString();
    }
}
