package AST.HTML.attributeHTML;

import AST.HTML.StructuralDirective;
import AST.helpers.Space;

public class StructuralDirectiveAttr extends AttributeHTML{
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("StructuralDirectiveAttr: { ");

        stringBuilder.append("Directive = ").append(structuralDirective);
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
        if ("*ngIf".equals(structuralDirective.getName())) {
            return generateNgIfJS();
        } else if ("*ngFor".equals(structuralDirective.getName())) {
            return generateNgForJS();
        }
        return "";
    }

    private String generateNgIfJS() {
        StringBuilder js = new StringBuilder();
        js.append("if (").append(value).append(") {\n");
        js.append("  // Element will be rendered\n");
        js.append("} else {\n");
        js.append("  ${element}.style.display = 'none';\n");
        js.append("}\n");
        return js.toString();
    }

    private String generateNgForJS() {
        // Parse *ngFor expression: "let item of items"
        String[] parts = value.split(" of ");
        if (parts.length == 2) {
            String itemVar = parts[0].replace("let ", "").trim();
            String arrayVar = parts[1].trim();

            StringBuilder js = new StringBuilder();
            js.append(arrayVar).append(".forEach((").append(itemVar).append(", index) => {\n");
            js.append("  const clonedElement = ${element}.cloneNode(true);\n");
            js.append("  ${element}.parentNode.appendChild(clonedElement);\n");
            js.append("});\n");
            js.append("${element}.remove(); // Remove template element\n");
            return js.toString();
        }
        return "";
    }
}
