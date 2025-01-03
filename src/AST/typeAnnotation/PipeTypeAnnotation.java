package AST.typeAnnotation;

import AST.Pair;
import AST.Space;
import AST.parameterList.Parameter;

import java.util.ArrayList;
import java.util.List;

public class PipeTypeAnnotation {
    private List<String> typeAnnotations;

    public PipeTypeAnnotation() {
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("PipeTypeAnnotation: {\n");

        if (!typeAnnotations.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("[\n");
            Space.currentValue++;
            for (int i = 0; i < typeAnnotations.size(); i++) {
                stringBuilder.append(typeAnnotations.get(i));
                if (i + 1 < typeAnnotations.size()) {
                    stringBuilder.append(" | ");
                }
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
            Space.currentValue--;
        }

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
