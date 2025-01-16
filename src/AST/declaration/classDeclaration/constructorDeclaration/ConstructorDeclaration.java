package AST.declaration.classDeclaration.constructorDeclaration;

import AST.helpers.Space;
import AST.parameterList.ParameterList;

public class ConstructorDeclaration {
    ParameterList parameterList;
    ConstructorBody constructorBody;

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public ConstructorBody getConstructorBody() {
        return constructorBody;
    }

    public void setConstructorBody(ConstructorBody constructorBody) {
        this.constructorBody = constructorBody;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ConstructorDeclaration: {\n");

        Space.currentValue++;
        // Append parameterList
        if (parameterList != null) {
            stringBuilder.append(parameterList).append(",\n");
        }

        // Append constructorBody
        if (constructorBody != null) {
            stringBuilder.append(constructorBody).append(",\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");

        return stringBuilder.toString();
    }
}
