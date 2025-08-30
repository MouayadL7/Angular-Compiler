package AST.object;

import AST.Node;
import AST.helpers.Space;
import AST.expression.Expression;
import AST.helpers.Value;

public class Attribute extends Node {
    String name;
    Expression expression;

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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("{\n");

        Space.currentValue++;

        // Append name
        if (name != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("name = \"").append(name).append("\",\n");
        }

        // Append expression
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
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(name);
        if (expression != null) {
            stringBuilder.append(": ").append(expression.convertToJS());
        }

        return stringBuilder.toString();
    }
}
