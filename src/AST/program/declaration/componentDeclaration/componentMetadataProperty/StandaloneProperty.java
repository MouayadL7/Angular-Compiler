package AST.program.declaration.componentDeclaration.componentMetadataProperty;

import AST.Space;

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
}
