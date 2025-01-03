package AST.program.declaration.injectableDeclaration;

import AST.Space;
import AST.helpers.Value;

public class InjectableMetadataProperty {
    String name;
    Value value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("InjectableMetadataProperty: {\n");

        Space.currentValue++;
        if (name != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("name: \"").append(name).append("\",\n");
        }

        if (value != null) {
            stringBuilder.append(value).append(",\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");

        return stringBuilder.toString();
    }
}
