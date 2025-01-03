package AST.HTML;

import AST.HTML.element.Element;
import AST.Space;

public class Content {
    private Element element;
    private String text;

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Content: {\n");

        Space.currentValue++;

        if (element != null) {
            stringBuilder.append(element).append(",\n");
        }
        else {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Text = ").append(text).append("\n");
        }

        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
