package AST.expression;

import AST.Space;
import AST.helpers.Primary;

public class PrimaryExpression {
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
