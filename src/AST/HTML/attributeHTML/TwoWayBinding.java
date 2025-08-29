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
        StringBuilder js = new StringBuilder();
        // Set initial value
        js.append("${element}.").append(twoBind).append(" = ").append(value).append(";\n");
        // Add event listener for updates
        js.append("${element}.addEventListener('input', (e) => {\n");
        js.append("  ").append(value).append(" = e.target.").append(twoBind).append(";\n");
        js.append("});\n");
        return js.toString();
    }
}
