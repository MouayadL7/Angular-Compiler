package AST.statement.iterationStatement;

import AST.declaration.variableDeclaration.VariableDeclaration;
import AST.expression.Expression;
import AST.helpers.Space;
import AST.statement.StatementBody;

public class StandardForLoop extends IterationStatement{
    private VariableDeclaration variableDeclaration;
    private Expression condition;
    private Expression update;
    private StatementBody statementBody;


    public VariableDeclaration getVariableDeclaration() {
        return variableDeclaration;
    }

    public void setVariableDeclaration(VariableDeclaration variableDeclaration) {
        this.variableDeclaration = variableDeclaration;
    }

    public Expression getCondition() {
        return condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }

    public Expression getUpdate() {
        return update;
    }

    public void setUpdate(Expression update) {
        this.update = update;
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("StandardForLoop: {\n");

        Space.currentValue++;

        // Append variableDeclaration
        if (variableDeclaration != null) {
            stringBuilder.append(variableDeclaration).append(",\n");
        }

        // Append condition
        if (condition != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Condition: {\n");
            stringBuilder.append(condition).append("\n");
            stringBuilder.append("\t".repeat(Space.currentValue)).append("},\n");
        }

        if (update != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Update: {\n");
            stringBuilder.append(update).append("\n");
            stringBuilder.append("\t".repeat(Space.currentValue)).append("},\n");
        }

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
