package AST.expression;

import AST.helpers.Space;
import AST.helpers.Value;

public class ValueExpression extends Expression {
    private Value value;
    private Expression expression;

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ValueExpression: {\n");

        Space.currentValue++;
        stringBuilder.append(value).append(",\n");
        if (expression != null) {
            stringBuilder.append(expression).append("\n");
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
        return value.convertToJS() + (expression != null ? expression.convertToJS() : "");
    }
}
