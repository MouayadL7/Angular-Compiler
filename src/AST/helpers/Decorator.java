package AST.helpers;

import AST.parameterList.ParameterList;

public class Decorator {
    ParameterList parameterList;

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Decorator: {\n");

        if (parameterList != null) {
            Space.currentValue++;
            stringBuilder.append(parameterList).append(",\n");
            Space.currentValue--;
        }

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }

}
