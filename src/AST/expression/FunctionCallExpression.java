package AST.expression;

import AST.Space;
import AST.program.statement.FunctionCall;

public class FunctionCallExpression extends Expression{
    private FunctionCall functionCall;

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("FunctionCallExpression: {\n");

        Space.currentValue++;
        stringBuilder.append(functionCall).append(",\n");
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
