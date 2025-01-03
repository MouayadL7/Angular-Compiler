package AST.HTML;

import AST.Space;

public class AttributeHTML {
    private String name;
    private String value;
    private StructuralDirective structuralDirective;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public StructuralDirective getStructuralDirective() {
        return structuralDirective;
    }

    public void setStructuralDirective(StructuralDirective structuralDirective) {
        this.structuralDirective = structuralDirective;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("AttributeHTML: {\n");

        Space.currentValue++;

        // Append name
        if (name != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Name = ").append(name).append(",\n");
        }

        // Append value
        if (value != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Value = ").append(value).append(",\n");
        }

        // Append structuralDirective
        if (structuralDirective != null) {
            stringBuilder.append(structuralDirective).append(",\n");
        }

        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
