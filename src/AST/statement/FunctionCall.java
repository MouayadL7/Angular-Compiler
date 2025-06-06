package AST.statement;

import AST.helpers.Space;
import AST.helpers.GenericType;
import AST.parameterList.ParameterList;

public class FunctionCall {
    private String name;
    private GenericType genericType;
    private ParameterList parameterList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenericType getGenericType() {
        return genericType;
    }

    public void setGenericType(GenericType genericType) {
        this.genericType = genericType;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("FunctionCall: {\n");

        Space.currentValue++;

        // Append name
        if (name != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("name = ").append(name).append(",\n");
        }

        // Append genericType
        if (genericType != null) {
            stringBuilder.append(genericType).append(",\n");
        }

        // Append parameterList
        if (parameterList != null) {
            stringBuilder.append(parameterList).append(",\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");

        return stringBuilder.toString();
    }
}
