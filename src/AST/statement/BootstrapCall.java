package AST.statement;

import AST.helpers.Space;
import AST.parameterList.ParameterList;
import AST.declaration.functionDeclaration.ArrowFunction;
import AST.helpers.BootstrapSpecifier;

public class BootstrapCall extends Statement{
    private BootstrapSpecifier bootstrapSpecifier;
    private ParameterList parameterList;
    private ArrowFunction arrowFunction;

    public BootstrapSpecifier getBootstrapSpecifier() {
        return bootstrapSpecifier;
    }

    public void setBootstrapSpecifier(BootstrapSpecifier bootstrapSpecifier) {
        this.bootstrapSpecifier = bootstrapSpecifier;
    }

    public ParameterList getParameterList() {
        return parameterList;
    }

    public void setParameterList(ParameterList parameterList) {
        this.parameterList = parameterList;
    }

    public ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("BootstrapCall: {\n");

        Space.currentValue++;

        // Append bootstrapSpecifier
        if (bootstrapSpecifier != null) {
            stringBuilder.append(bootstrapSpecifier).append(",\n");
        }

        // Append parameterList
        if (parameterList != null) {
            stringBuilder.append(parameterList).append(",\n");
        }

        // Append arrowFunction
        if (arrowFunction != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("ErrorHandling: {\n");
            Space.currentValue++;
            stringBuilder.append(arrowFunction).append("\n");
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("},\n");
        }

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
        return "";
    }
}
