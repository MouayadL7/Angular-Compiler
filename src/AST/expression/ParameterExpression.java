package AST.expression;

import AST.helpers.Space;
import AST.parameterList.ParameterDeclaration;

public class ParameterExpression extends Expression {
    private ParameterDeclaration parameterDeclaration;

    public ParameterDeclaration getParameterDeclaration() {
        return parameterDeclaration;
    }

    public void setParameterDeclaration(ParameterDeclaration parameterDeclaration) {
        this.parameterDeclaration = parameterDeclaration;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ParameterExpression: {\n");

        Space.currentValue++;
        stringBuilder.append(parameterDeclaration).append("\n");
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() {
        return "";
    }

    @Override
    public String convertToCSS() {
        return "";
    }

    @Override
    public String convertToJS() {
        return parameterDeclaration.convertToJS();
    }
}
