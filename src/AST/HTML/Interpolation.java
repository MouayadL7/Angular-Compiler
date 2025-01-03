package AST.HTML;

import AST.Space;

import java.util.ArrayList;
import java.util.List;

public class Interpolation {
    private List<String> attributes;

    public Interpolation() {
        this.attributes = new ArrayList<>();
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Interpolation: {\n");

        if (!attributes.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("attributes: [ ");

            for (int i = 0; i < attributes.size(); i++) {
                stringBuilder.append(attributes.get(i));
                if (i + 1 < attributes.size()) {
                    stringBuilder.append(" | ");
                }
            }

            stringBuilder.append(" ]\n");
            Space.currentValue--;
        }

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
