package AST.statement.importStatement.importSpecifier;

import AST.helpers.Space;

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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("IdentifierImportSpecifier: { ");

        Space.currentValue++;
        stringBuilder.append("Name = ").append(identifier);
        Space.currentValue--;

        stringBuilder.append(" }");
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
        return "";
    }
}
