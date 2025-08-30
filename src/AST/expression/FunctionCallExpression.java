package AST.expression;

import AST.helpers.Space;
import AST.statement.FunctionCall;

public class FunctionCallExpression extends Expression{
    private FunctionCall functionCall;
    private Expression expression;

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("FunctionCallExpression: {\n");

        Space.currentValue++;

        stringBuilder.append(functionCall).append(",\n");

        if (expression != null) {
            stringBuilder.append(expression).append(",\n");
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
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(functionCall.convertToJS());
        if (expression != null) {
            stringBuilder.append(expression.convertToJS());
        }

        return stringBuilder.toString();
    }
}
