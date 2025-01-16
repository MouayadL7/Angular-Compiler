package AST.expression;

import AST.helpers.Primary;
import AST.helpers.Space;

public class PrimaryExpression extends Expression{
    private Primary primary;

    public Primary getPrimary() {
        return primary;
    }

    public void setPrimary(Primary primary) {
        this.primary = primary;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("PrimaryExpression: {\n");

        Space.currentValue++;
        stringBuilder.append(primary).append(",\n");
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
