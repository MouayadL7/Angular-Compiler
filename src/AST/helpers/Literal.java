package AST.helpers;

public class Literal extends Primary{
    private String type;
    private String value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Literal: {\n");

        Space.currentValue++;
        if (type.equals("String")) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Type = ").append(type).append(", Value = \"").append(value).append("\"");
        } else {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Type = ").append(type).append(", Value = ").append(value);
        }
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
