package AST.declaration.componentDeclaration.componentMetadataProperty;

import AST.helpers.Space;
import AST.array.Array;

public class StyleUrlsProperty extends ComponentMetadataProperty {
    private Array array;

    public Array getArray() {
        return array;
    }

    public void setArray(Array array) {
        this.array = array;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("{\n");

        Space.currentValue++;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("name = StyleUrls,\n");
        stringBuilder.append(array).append(",\n");
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
