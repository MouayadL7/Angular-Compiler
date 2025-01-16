package AST.statement;

import AST.helpers.Space;
import AST.expression.Expression;
import AST.helpers.Value;

public class ReturnStatement extends Statement{
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ReturnStatement: {\n");

        Space.currentValue++;
        stringBuilder.append(expression).append("\n");
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }

}