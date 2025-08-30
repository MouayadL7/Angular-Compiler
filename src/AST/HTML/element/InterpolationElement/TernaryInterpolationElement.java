package AST.HTML.element.InterpolationElement;

import AST.expression.Expression;
import AST.helpers.Space;

public class TernaryInterpolationElement extends InterpolationElement{
    private String condition;
    private String trueVal;
    private String falseVal;

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getTrueVal() {
        return trueVal;
    }

    public void setTrueVal(String trueVal) {
        this.trueVal = trueVal;
    }

    public String getFalseVal() {
        return falseVal;
    }

    public void setFalseVal(String falseVal) {
        this.falseVal = falseVal;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("TernaryInterpolationElement: {\n");

        Space.currentValue++;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Condition = ").append(condition.toString()).append(", Operator = ?").append(" , TrueVal = ").append(trueVal.toString()).append(", Operator = :").append(" , FalseVal = ").append(falseVal.toString()).append(",\n");
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() {
        return condition;
    }

    @Override
    public String convertToCSS() {
        return "";
    }

    @Override
    public String convertToJS() {
        return condition + " ? " + trueVal + " : " + falseVal;
    }
}
