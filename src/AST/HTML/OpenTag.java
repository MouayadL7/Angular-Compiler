package AST.HTML;

import AST.HTML.attributeHTML.AttributeHTML;
import AST.Node;
import AST.helpers.Space;

import java.util.ArrayList;
import java.util.List;

public class OpenTag extends Node {
    private TagName tagName;
    private List<AttributeHTML> attributeHtmlList;

    public OpenTag() {
        this.attributeHtmlList = new ArrayList<>();
    }

    public TagName getTagName() {
        return tagName;
    }

    public void setTagName(TagName tagName) {
        this.tagName = tagName;
    }

    public List<AttributeHTML> getAttributeHtmlList() {
        return attributeHtmlList;
    }

    public void setAttributeHtmlList(List<AttributeHTML> attributeHtmlList) {
        this.attributeHtmlList = attributeHtmlList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("OpenTag: {\n");

        Space.currentValue++;

        // Append tagName
        if (tagName != null) {
            stringBuilder.append(tagName).append(",\n");
        }

        // Append attributeHtmlList
        if (!attributeHtmlList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("attributeHtmlList: [\n");
            Space.currentValue++;
            for (AttributeHTML property : attributeHtmlList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
        }

        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() {
        StringBuilder html = new StringBuilder();
        html.append("<").append(tagName.convertToHTML());

        for (AttributeHTML attr : attributeHtmlList) {
            String attrHtml = attr.convertToHTML();
            if (!attrHtml.isEmpty()) {
                html.append(" ").append(attrHtml);
            }
        }

        html.append(">");
        return html.toString();
    }

    @Override
    public String convertToCSS() {
        // OpenTag doesn't directly generate CSS, but attributes might
        StringBuilder css = new StringBuilder();
        for (AttributeHTML attr : attributeHtmlList) {
            String attrCss = attr.convertToCSS();
            if (!attrCss.isEmpty()) {
                css.append(attrCss);
            }
        }
        return css.toString();
    }

    @Override
    public String convertToJS() {
        StringBuilder js = new StringBuilder();

        String elementVar = "el_" + System.identityHashCode(this);
        js.append("const ").append(elementVar)
                .append(" = document.createElement('")
                .append(tagName.convertToHTML()).append("');\n");

        for (AttributeHTML attr : attributeHtmlList) {
            String attrJs = attr.convertToJS();
            if (!attrJs.isEmpty()) {
                js.append(attrJs.replace("${element}", elementVar));
            }
        }

        return js.toString();
    }
}
