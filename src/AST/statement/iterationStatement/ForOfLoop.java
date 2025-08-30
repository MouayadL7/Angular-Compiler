package AST.statement.iterationStatement;

import AST.helpers.Space;
import AST.statement.StatementBody;

public class ForOfLoop extends IterationStatement{
    private StatementBody statementBody;

    public StatementBody getStatementBody() {
        return statementBody;
    }

    public void setStatementBody(StatementBody statementBody) {
        this.statementBody = statementBody;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ForOfLoop: {\n");

        Space.currentValue++;

        // Append statementBody
        stringBuilder.append(statementBody).append(",\n");

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
        return "";
    }
}
