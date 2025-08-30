package AST.declaration.interfaceDeclaration;

import AST.Node;
import AST.helpers.Space;
import AST.typeAnnotation.TypeAnnotation;

public class InterfaceProperty extends Node {
    String name;
    TypeAnnotation typeAnnotation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("InterfaceProperty: {\n");

        Space.currentValue++;
        // Append name
        stringBuilder.append("\t".repeat(Space.currentValue)).append("name = ").append(name != null ? name : "").append(",\n");

        if (typeAnnotation != null) {
            stringBuilder.append(typeAnnotation).append("\n");
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
        return name + ": " + typeAnnotation.convertToJS();
    }
}
