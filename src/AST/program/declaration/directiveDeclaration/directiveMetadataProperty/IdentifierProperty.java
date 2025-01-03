package AST.program.declaration.directiveDeclaration.directiveMetadataProperty;

import AST.Space;
import AST.helpers.Value;

public class IdentifierProperty extends DirectiveMetadataProperty {
    private String identifier;
    private Value value;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("{\n");

        Space.currentValue++;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("name = ").append(identifier).append(",\n");
        stringBuilder.append(value).append(",\n");
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
