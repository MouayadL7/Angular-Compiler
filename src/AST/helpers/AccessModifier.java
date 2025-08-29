package AST.helpers;

import AST.Node;

public class AccessModifier extends Node {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String accessModifier) {
        this.name = accessModifier;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("AccessModifier: { ");

        // Append name
        stringBuilder.append("name = ").append(name);

        stringBuilder.append(" }");
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
