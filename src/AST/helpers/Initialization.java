package AST.helpers;

import AST.expression.Expression;
import AST.declaration.functionDeclaration.FunctionDeclaration;
import AST.statement.Assignment;

public  class Initialization {
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Initialization: {\n");

        Space.currentValue++;
        stringBuilder.append(expression).append("\n");
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
