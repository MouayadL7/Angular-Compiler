package AST.declaration.injectableDeclaration;

import AST.Node;
import AST.expression.Expression;
import AST.helpers.Space;
import AST.helpers.Value;

public class InjectableMetadataProperty extends Node {
    private String name;
    private Expression expression;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("InjectableMetadataProperty: {\n");

        Space.currentValue++;

        if (name != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("name: \"").append(name).append("\",\n");
        }

        if (expression != null) {
            stringBuilder.append(expression).append(",\n");
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
        return "";
    }
}
