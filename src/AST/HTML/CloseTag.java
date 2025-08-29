package AST.HTML;

import AST.Node;
import AST.helpers.Space;

public class CloseTag extends Node {
    private TagName tagName;

    public TagName getTagName() {
        return tagName;
    }

    public void setTagName(TagName tagName) {
        this.tagName = tagName;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("CloseTag: {\n");

        Space.currentValue++;
        stringBuilder.append(tagName).append("\n");
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() {
        return "</" + tagName.convertToHTML() + ">";
    }

    @Override
    public String convertToCSS() {
        return ""; // Close tags don't generate CSS
    }

    @Override
    public String convertToJS() {
        return ""; // Close tags are handled by the parent element
    }
}
