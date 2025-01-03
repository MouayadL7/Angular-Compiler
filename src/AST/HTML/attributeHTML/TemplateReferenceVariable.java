package AST.HTML.attributeHTML;

import AST.Space;

public class TemplateReferenceVariable {
    private String referenceVar;
    private String value;

    public String getReferenceVar() {
        return referenceVar;
    }

    public void setReferenceVar(String referenceVar) {
        this.referenceVar = referenceVar;
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("TemplateReferenceVariable: { ");

        stringBuilder.append("referenceVariable = ").append(referenceVar);
        stringBuilder.append(", ").append("Value = ").append(value != null ? value : "").append(" }");

        return stringBuilder.toString();
    }
}
