package AST.HTML.attributeHTML;

import AST.helpers.Space;

public class StandardAttribute extends AttributeHTML{
    private String attribute;
    private String value;

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("StandardAttribute: { ");

        stringBuilder.append("Attribute = ").append(attribute);
        stringBuilder.append(", ").append("Value = ").append(value).append(" }");

        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() {
        return attribute + "=\"" + escapeHtml(value) + "\"";
    }

    @Override
    public String convertToCSS() {
        if ("class".equals(attribute)) {
            StringBuilder css = new StringBuilder();
            String[] classes = value.split("\\s+");
            for (String className : classes) {
                css.append(".").append(className).append(" {\n")
                        .append("  /* Add styles for ").append(className).append(" */\n")
                        .append("}\n\n");
            }
            return css.toString();
        }
        return "";
    }

    @Override
    public String convertToJS() {
        return "${element}.setAttribute('" + attribute + "', '" + escapeJs(value) + "');\n";
    }

    private String escapeHtml(String text) {
        return text.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;");
    }

    private String escapeJs(String text) {
        return text.replace("'", "\\'").replace("\"", "\\\"").replace("\n", "\\n");
    }
}
