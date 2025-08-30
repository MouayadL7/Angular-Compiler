package AST.array;

import AST.expression.Expression;
import AST.helpers.Space;
import AST.helpers.Value;

import java.util.ArrayList;
import java.util.List;

public class Array extends Value {
    List<Expression> expressionList;

    public Array() {
        this.expressionList = new ArrayList<>();
    }

    public List<Expression> getExpressionList() {
        return expressionList;
    }

    public void setExpressionList(List<Expression> expressionList) {
        this.expressionList = expressionList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Array: {\n");

        if (!expressionList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("expressionList: [\n");
            Space.currentValue++;
            for (Expression expression : expressionList) {
                stringBuilder.append(expression).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
        }

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

        stringBuilder.append("[");

        for (int i = 0; i < expressionList.size(); i++) {
            stringBuilder.append(expressionList.get(i).convertToJS());
            if (i + 1 < expressionList.size()) {
                stringBuilder.append(", ");
            }
        }

        stringBuilder.append("\n]");

        return stringBuilder.toString();
    }
}
