package AST.HTML.attributeHTML;

import AST.HTML.StructuralDirective;
import AST.Space;

public class StructuralDirectiveAttr {
    private StructuralDirective structuralDirective;
    private String value;

    public StructuralDirective getStructuralDirective() {
        return structuralDirective;
    }

    public void setStructuralDirective(StructuralDirective structuralDirective) {
        this.structuralDirective = structuralDirective;
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("StructuralDirective: { ");

        stringBuilder.append("Directive = ").append(structuralDirective);
        stringBuilder.append(", ").append("Value = ").append(value).append(" }");

        return stringBuilder.toString();
    }
}
