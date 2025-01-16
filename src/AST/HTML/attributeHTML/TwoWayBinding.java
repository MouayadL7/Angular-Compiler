package AST.HTML.attributeHTML;

import AST.helpers.Space;

public class TwoWayBinding extends AttributeHTML{
    private String twoBind;
    private String value;

    public String getTwoBind() {
        return twoBind;
    }

    public void setTwoBind(String twoBind) {
        this.twoBind = twoBind;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("TwoBind: { ");

        stringBuilder.append("Bind = ").append(twoBind);
        stringBuilder.append(", ").append("Value = ").append(value).append(" }");

        return stringBuilder.toString();
    }
}
