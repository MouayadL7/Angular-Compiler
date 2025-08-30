package AST.typeAnnotation;

import AST.declaration.Declaration;
import AST.helpers.Literal;
import AST.helpers.Space;

import java.util.ArrayList;
import java.util.List;

public class PipeTypeAnnotation extends TypeAnnotation {
    private List<String> typeAnnotations;
    private List<Literal> literalList;

    public PipeTypeAnnotation() {
        this.typeAnnotations = new ArrayList<>();
        this.literalList = new ArrayList<>();
    }

    public List<String> getTypeAnnotations() {
        return typeAnnotations;
    }

    public void setTypeAnnotations(List<String> typeAnnotations) {
        this.typeAnnotations = typeAnnotations;
    }

    public List<Literal> getLiteralList() {
        return literalList;
    }

    public void setLiteralList(List<Literal> literalList) {
        this.literalList = literalList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("PipeTypeAnnotation: {\n");

        if (!typeAnnotations.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("[ ");
            for (int i = 0; i < typeAnnotations.size(); i++) {
                stringBuilder.append(typeAnnotations.get(i));
                if (i + 1 < typeAnnotations.size()) {
                    stringBuilder.append(" | ");
                }
            }
            stringBuilder.append(" ]\n");
            Space.currentValue--;
        }

        if (!literalList.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("[\n");
            Space.currentValue++;
            for (int i = 0; i < literalList.size(); i++) {
                stringBuilder.append(literalList.get(i));
                if (i + 1 < literalList.size()) {
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

    @Override
    public String convertToHTML() {
        return "";
    }

    @Override
    public String convertToCSS() {
        return "";
    }

    @Override
    public String convertToJS() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < typeAnnotations.size(); i++) {
            stringBuilder.append(typeAnnotations.get(i));
            if (i + 1 < typeAnnotations.size()) {
                stringBuilder.append(" | ");
            }
        }

        for (int i = 0; i < literalList.size(); i++) {
            stringBuilder.append(literalList.get(i));
            if (i + 1 < literalList.size()) {
                stringBuilder.append(" | ");
            }
        }

        return stringBuilder.toString();
    }
}
