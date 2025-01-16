package AST.typeAnnotation;

import AST.helpers.Space;
import AST.helpers.GenericType;

public class GenericTypeAnnotation extends TypeAnnotation {
    private String name;
    private GenericType genericType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenericType getGenericType() {
        return genericType;
    }

    public void setGenericType(GenericType genericType) {
        this.genericType = genericType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("GenericTypeAnnotation: {\n");

        Space.currentValue++;

        // Append name
        if (name != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("name = ").append(name).append(",\n");
        }

        // Append typeAnnotationList
        if (genericType != null) {
            stringBuilder.append(genericType).append(",\n");
        }

        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
