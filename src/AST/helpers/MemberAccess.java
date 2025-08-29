package AST.helpers;

import AST.expression.Expression;

public class MemberAccess extends Value{
    private String prefix;
    private Expression expression;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("MemberAccess: {\n");

        Space.currentValue++;

        // Append prefix
        stringBuilder.append("\t".repeat(Space.currentValue)).append("prefix = ").append(prefix != null ? prefix : "").append(",\n");

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
