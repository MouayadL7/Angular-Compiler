package AST.program.statement.importStatement.importSpecifier;

import AST.Space;
import AST.program.statement.importStatement.BootstrapSpecifier;
import AST.program.statement.importStatement.ImportSpecifier;

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
}
