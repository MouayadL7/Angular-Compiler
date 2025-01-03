package AST.expression;

import AST.Space;

public class ParenthesizedExpression extends Expression{
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

        stringBuilder.append("\t".repeat(Space.currentValue)).append("ParenthesizedExpression: {\n");
        Space.currentValue++;
        stringBuilder.append("(").append(expression).append(")\n");
        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");

        return stringBuilder.toString();
    }
}