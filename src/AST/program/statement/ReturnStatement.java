package AST.program.statement;

import AST.Space;
import AST.expression.Expression;
import AST.helpers.Value;

public class ReturnStatement extends Statement{
    Expression expression;
    Value value;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ReturnStatement: {\n");

        Space.currentValue++;

        if (expression != null) {
            stringBuilder.append(expression).append(",\n");
        }
        else {
            stringBuilder.append(value).append(",\n");
        }

        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }

}
