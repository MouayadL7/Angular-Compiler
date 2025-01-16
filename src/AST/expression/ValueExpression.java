package AST.expression;

import AST.helpers.Space;
import AST.helpers.Value;

public class ValueExpression extends Expression {
    private Value value;

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ValueExpression: {\n");

        Space.currentValue++;
        stringBuilder.append(value).append("\n");
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
