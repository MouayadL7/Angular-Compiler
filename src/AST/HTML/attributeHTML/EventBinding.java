package AST.HTML.attributeHTML;

import AST.Space;

public class EventBinding {
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
}
