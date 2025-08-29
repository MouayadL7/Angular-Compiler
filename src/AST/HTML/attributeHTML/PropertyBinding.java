package AST.HTML.attributeHTML;

import AST.helpers.Space;

public class PropertyBinding extends AttributeHTML{
    private String binding;
    private String value;

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Binding: { ");

        stringBuilder.append("Binding = ").append(binding);
        stringBuilder.append(", ").append("Value = ").append(value).append(" }");

        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() {
        return ""; // Property bindings don't appear in static HTML
    }

    @Override
    public String convertToCSS() {
        return "";
    }

    @Override
    public String convertToJS() {
        return "${element}." + binding + " = " + convertExpression(value) + ";\n";
    }

    private String convertExpression(String expr) {
        // Convert Angular expression to JavaScript
        return expr.replace("\"", "'");
    }
}
