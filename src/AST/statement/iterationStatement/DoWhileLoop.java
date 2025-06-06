package AST.statement.iterationStatement;

import AST.expression.Expression;
import AST.helpers.Space;
import AST.statement.StatementBody;

public class DoWhileLoop {
    private StatementBody statementBody;
    private Expression condition;

    public StatementBody getStatementBody() {
        return statementBody;
    }

    public void setStatementBody(StatementBody statementBody) {
        this.statementBody = statementBody;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("DoWhileLoop: {\n");

        Space.currentValue++;

        // Append statementBody
        stringBuilder.append(statementBody).append(",\n");

        // Append condition
        if (condition != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Condition: {\n");
            stringBuilder.append(condition).append("\n");
            stringBuilder.append("\t".repeat(Space.currentValue)).append("},\n");
        }

        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
