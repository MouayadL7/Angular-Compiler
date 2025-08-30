package AST.statement.importStatement.importSpecifier;

import AST.helpers.Space;
import AST.helpers.BootstrapSpecifier;

public class BootstrapImportSpecifier extends ImportSpecifier {
    private BootstrapSpecifier bootstrapSpecifier;

    public BootstrapSpecifier getBootstrapSpecifier() {

        return bootstrapSpecifier;
    }

    public void setBootstrapSpecifier(BootstrapSpecifier bootstrapSpecifier) {
        this.bootstrapSpecifier = bootstrapSpecifier;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("BootstrapImportSpecifier: {");

        Space.currentValue++;
        stringBuilder.append(bootstrapSpecifier).append(",\n");
        Space.currentValue--;

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
        return "";
    }
}
