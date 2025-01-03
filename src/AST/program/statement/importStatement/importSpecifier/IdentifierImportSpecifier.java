package AST.program.statement.importStatement.importSpecifier;

import AST.Space;
import AST.program.statement.importStatement.ImportSpecifier;

public class IdentifierImportSpecifier extends ImportSpecifier {
    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("IdentifierImportSpecifier: {");

        Space.currentValue++;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Name = ").append(identifier).append("\n");
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
