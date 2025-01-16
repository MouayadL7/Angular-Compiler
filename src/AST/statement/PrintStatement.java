package AST.statement;

import AST.helpers.Space;
import AST.parameterList.ParameterList;

public class PrintStatement extends Statement {
    private ParameterList parameterList;

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("PrintStatement: {\n");

        // Append parameterList
        Space.currentValue++;
        stringBuilder.append("\t".repeat(Space.currentValue)).append(parameterList).append(",\n");
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
