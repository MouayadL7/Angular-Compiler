package AST.expression;

import AST.helpers.Space;

public class RelationalExpression extends Expression{
    private Expression leftExpression;
    private String operator;
    private Expression rightExpression;

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(Expression leftExpression) {
        this.leftExpression = leftExpression;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    public void setRightExpression(Expression rightExpression) {
        this.rightExpression = rightExpression;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("RelationalExpression: {\n");

        Space.currentValue++;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Left = ").append(leftExpression.toString()).append(", Operator = ").append(operator).append(" , Right = ").append(rightExpression.toString()).append(",\n");
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
        stringBuilder.append(leftExpression.convertToJS()).append(" ").append(operator).append(" ").append(rightExpression.convertToJS());
        return stringBuilder.toString();
    }
}
