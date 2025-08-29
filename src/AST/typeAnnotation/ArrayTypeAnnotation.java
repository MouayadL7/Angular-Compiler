package AST.typeAnnotation;

import AST.helpers.Space;

import java.util.ArrayList;
import java.util.List;

public class ArrayTypeAnnotation extends TypeAnnotation{
    private List<String> typeAnnotations;

    public ArrayTypeAnnotation() {
        this.typeAnnotations = new ArrayList<>();
    }

    public List<String> getTypeAnnotations() {
        return typeAnnotations;
    }

    public void setTypeAnnotations(List<String> typeAnnotations) {
        this.typeAnnotations = typeAnnotations;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ArrayTypeAnnotation: {\n");

        if (!typeAnnotations.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("[ ");
            Space.currentValue++;
            for (int i = 0; i < typeAnnotations.size(); i++) {
                stringBuilder.append(typeAnnotations.get(i));
                if (!typeAnnotations.get(i).equals("null")) {
                    stringBuilder.append("[]");
                }
                if (i + 1 < typeAnnotations.size()) {
                    stringBuilder.append(" | ");
                }
            }
            Space.currentValue--;
            stringBuilder.append(" ]\n");
            Space.currentValue--;
        }

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() {
        return null;
    }

    @Override
    public String convertToCSS() {
        return null;
    }

    @Override
    public String convertToJS() {
        return null;
    }
}
