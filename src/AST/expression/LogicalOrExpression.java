package AST.expression;

import AST.helpers.Space;

public class LogicalOrExpression extends Expression{
    private Expression leftExpression;
    private Expression rightExpression;

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(Expression leftExpression) {
        this.leftExpression = leftExpression;
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("LogicalOrExpression: {\n");

        Space.currentValue++;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Left = ").append(leftExpression.toString()).append(", Operator = ||").append(" , Right = ").append(rightExpression.toString()).append(",\n");
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
        stringBuilder.append(leftExpression.convertToJS()).append(" || ").append(rightExpression.convertToJS());
        return stringBuilder.toString();
    }
}

