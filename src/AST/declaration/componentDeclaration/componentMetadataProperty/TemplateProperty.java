package AST.declaration.componentDeclaration.componentMetadataProperty;

import AST.HTML.HTMLTemplate;
import AST.helpers.Space;

public class TemplateProperty extends ComponentMetadataProperty {
    private HTMLTemplate htmlTemplate;

    public HTMLTemplate getHtmlTemplate() {
        return htmlTemplate;
    }

    public void setHtmlTemplate(HTMLTemplate htmlTemplate) {
        this.htmlTemplate = htmlTemplate;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("{\n");

        Space.currentValue++;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("name = Template,\n");
        stringBuilder.append(htmlTemplate).append(",\n");
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() {
        return null;
    }

    @Override
    public String convertToCSS() {
        return null;
    }

    @Override
    public String convertToJS() {
        return null;
    }
}
