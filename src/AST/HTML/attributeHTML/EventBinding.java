package AST.HTML.attributeHTML;

import AST.helpers.Space;

public class EventBinding extends AttributeHTML{
    private String event;
    private String value;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("EeventBinding: { ");

        // Append event
        stringBuilder.append("Event = ").append(event);

        // Append value
        stringBuilder.append(", ").append("Value = ").append(value).append(" }");

        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() {
        return String.format("", this.event, this.value);
    }

    @Override
    public String convertToCSS() {
        return "";
    }

    @Override
    public String convertToJS() {
        return "${element}.addEventListener('" + event + "', " + convertHandler(value) + ");\n";
    }

    private String convertHandler(String handler) {
        if (handler.endsWith("()")) {
            return "() => " + handler;
        }
        return handler;
    }
}
