package AST.expression;

import AST.Space;
import AST.array.ArrayAccess;

public class ArrayAccessExpression extends Expression{
    private ArrayAccess arrayAccess;

    public ArrayAccess getArrayDeclaration() {
        return arrayAccess;
    }

    public void setArrayDeclaration(ArrayAccess arrayAccess) {
        this.arrayAccess = arrayAccess;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ArrayAccessExpression: {\n");

        Space.currentValue++;
        stringBuilder.append(arrayAccess).append(",\n");
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
