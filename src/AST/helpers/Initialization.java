package AST.helpers;

import AST.Space;
import AST.expression.Expression;
import AST.program.declaration.functionDeclaration.FunctionDeclaration;

public class Initialization {
    private Value value;
    private Expression expression;
    private FunctionDeclaration functionDeclaration;

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public FunctionDeclaration getFunctionDeclaration() {
        return functionDeclaration;
    }

    public void setFunctionDeclaration(FunctionDeclaration functionDeclaration) {
        this.functionDeclaration = functionDeclaration;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Initialization: {\n");

        Space.currentValue++;

        if (value != null) {
            stringBuilder.append(value).append(",\n");
        }
        else if (expression != null) {
            stringBuilder.append(expression).append(",\n");
        }
        else {
            stringBuilder.append(functionDeclaration).append(",\n");
        }

        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }

}
