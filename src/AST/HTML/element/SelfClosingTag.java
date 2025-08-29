package AST.HTML.element;

import AST.HTML.TagName;
import AST.HTML.attributeHTML.AttributeHTML;
import AST.HTML.element.Element;
import AST.helpers.Space;

import java.util.ArrayList;
import java.util.List;

public class SelfClosingTag extends Element {
    private TagName tagName;
    private List<AttributeHTML> attributeHtmlList;

    public SelfClosingTag() {
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("SelfClosingTag: {\n");

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
