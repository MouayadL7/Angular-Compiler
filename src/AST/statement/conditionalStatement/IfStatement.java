package AST.statement.conditionalStatement;

import AST.helpers.Space;
import AST.expression.Expression;
import AST.statement.StatementBody;

public class IfStatement extends ConditionalStatement{
    Expression expression;
    StatementBody statementBody;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public StatementBody getStatementBody() {
        return statementBody;
    }

    public void setStatementBody(StatementBody statementBody) {
        this.statementBody = statementBody;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("IfStatement: {\n");

        Space.currentValue++;

        // Append expression
        if (expression != null) {
            stringBuilder.append(expression).append(",\n");
        }

        // Append statementBody
        if (statementBody != null) {
            stringBuilder.append(statementBody).append(",\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");

        return stringBuilder.toString();
    }
}
