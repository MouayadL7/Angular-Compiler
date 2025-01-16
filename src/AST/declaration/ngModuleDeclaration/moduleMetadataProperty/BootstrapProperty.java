package AST.declaration.ngModuleDeclaration.moduleMetadataProperty;

import AST.helpers.Space;
import AST.array.Array;

public class BootstrapProperty extends ModuleMetadataProperty {
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("name = Bootstrap,\n");
        stringBuilder.append(array).append(",\n");
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
