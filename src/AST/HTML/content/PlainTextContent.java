package AST.HTML.content;

import AST.helpers.Space;

public class PlainTextContent extends Content{
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

    @Override
    public String convertToHTML() {
        return text.replace("<", "&lt;").replace(">", "&gt;");
    }

    @Override
    public String convertToCSS() {
        return "";
    }

    @Override
    public String convertToJS() {
        String textVar = "text_" + System.identityHashCode(this);
        return "const " + textVar + " = document.createTextNode('" +
                text.replace("'", "\\'") + "');\n";
    }
}
