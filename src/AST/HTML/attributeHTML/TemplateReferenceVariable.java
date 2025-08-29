package AST.HTML.attributeHTML;

import AST.helpers.Space;

public class TemplateReferenceVariable extends AttributeHTML{
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
