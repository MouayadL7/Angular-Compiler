package AST.expression;

import AST.helpers.Space;

public class PreIncrementExpression extends Expression{
    private Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("PreIncrementExpression: {\n");

        Space.currentValue++;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Operator = ++ , ").append("Right = ").append(expression).append(",\n");
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
        return "++" + expression.convertToJS();
    }
}
