package AST.HTML.content;

import AST.helpers.Space;

public class PlainTextContent extends Content{
    private String text;
    private boolean colon;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isColon() {
        return colon;
    }

    public void setColon(boolean colon) {
        this.colon = colon;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\t".repeat(Space.currentValue)).append("Text = ").append("\"").append(text).append("\"");

        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() {
        return text + (isColon() ? ":" : "") + "\n";
    }

    @Override
    public String convertToCSS() {
        return "";
    }

    @Override
    public String convertToJS() { return ""; }
}
