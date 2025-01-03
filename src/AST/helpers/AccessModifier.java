package AST.helpers;

import AST.Space;

public class AccessModifier {
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("AccessModifier: {");

        // Append name
        stringBuilder.append("name = ").append(name);

        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

}
