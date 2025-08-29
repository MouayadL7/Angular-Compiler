package AST.statement.conditionalStatement;

import AST.helpers.Space;
import AST.statement.Statement;
import AST.statement.StatementBody;

public class ElseStatement extends Statement {
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
