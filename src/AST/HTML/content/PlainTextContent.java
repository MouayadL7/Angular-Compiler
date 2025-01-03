package AST.HTML.content;

import AST.Space;

public class PlainTextContent {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\t".repeat(Space.currentValue)).append("Text = ").append("\"").append(text).append("\"");

        return stringBuilder.toString();
    }
}