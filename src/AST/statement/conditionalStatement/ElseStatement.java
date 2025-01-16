package AST.statement.conditionalStatement;

import AST.helpers.Space;
import AST.statement.StatementBody;

public class ElseStatement extends ConditionalStatement{
    StatementBody statementBody;

    public StatementBody getStatementBody() {
        return statementBody;
    }

    public void setStatementBody(StatementBody statementBody) {
        this.statementBody = statementBody;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ElseStatement: {\n");

        Space.currentValue++;

        // Append statementBody
        if (statementBody != null) {
            stringBuilder.append(statementBody).append(",\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");

        return stringBuilder.toString();
    }
}
