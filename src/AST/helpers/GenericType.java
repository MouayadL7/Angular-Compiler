package AST.helpers;

import AST.typeAnnotation.TypeAnnotation;

import java.util.ArrayList;
import java.util.List;

public class GenericType {
    List<TypeAnnotation> typeAnnotationList;

    public GenericType() {
        this.typeAnnotationList = new ArrayList<>();
    }

    public List<TypeAnnotation> getTypeAnnotationList() {
        return typeAnnotationList;
    }

    public void setTypeAnnotationList(List<TypeAnnotation> typeAnnotationList) {
        this.typeAnnotationList = typeAnnotationList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("GenericType: {\n");

        if (!typeAnnotationList.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("typeAnnotationList: [\n");
            Space.currentValue++;
            for (TypeAnnotation property : typeAnnotationList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
            Space.currentValue--;
        }

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }

}
