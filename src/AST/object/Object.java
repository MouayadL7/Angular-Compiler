package AST.object;

import AST.helpers.Initialization;
import AST.helpers.Space;
import AST.helpers.Value;

public class Object extends Value {
    Attributes attributes;

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Object: {\n");

        Space.currentValue++;

        // Append attributes
        if (attributes != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("attributes: ").append(attributes.toString());
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
        return "\n{\n" + attributes.convertToJS() + "}";
    }
}
