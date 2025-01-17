package AST.HTML;

import AST.helpers.Space;

public class CloseTag {
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
}
