package AST.statement.importStatement;

import AST.helpers.Space;
import AST.statement.importStatement.importDeclaration.ImportDeclaration;

public class ImportStatement {
    private ImportDeclaration importDeclaration;

    public ImportDeclaration getImportDeclaration() {
        return importDeclaration;
    }

    public void setImportDeclaration(ImportDeclaration importDeclaration) {
        this.importDeclaration = importDeclaration;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("{\n");

        // Append importDeclaration
        Space.currentValue++;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("importDeclaration = ");
        stringBuilder.append(importDeclaration).append("\n");
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
