package AST.declaration.componentDeclaration.componentMetadataProperty;

import AST.helpers.Space;

public class StandaloneProperty extends ComponentMetadataProperty {
    private String value;

    public String isValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("{\n");

        Space.currentValue++;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("name = Standalone");
        stringBuilder.append(", value = ").append(value).append(",\n");
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
        return "";
    }
}
