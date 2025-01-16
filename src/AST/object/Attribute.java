package AST.object;

import AST.helpers.Space;
import AST.expression.Expression;
import AST.helpers.Value;

public class Attribute {
    String name;
    Expression expression;
    Value value;

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

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
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
            stringBuilder.append("\t".repeat(Space.currentValue)).append(expression).append(",\n");
        }

        // Append value
        if (value != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append(value).append(",\n");
        }

        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
