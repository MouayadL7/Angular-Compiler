package AST.statement.iterationStatement;

import AST.expression.Expression;
import AST.helpers.Space;
import AST.statement.StatementBody;

public class WhileLoop extends IterationStatement{
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("WhileLoop: {\n");

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
