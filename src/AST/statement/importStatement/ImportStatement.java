package AST.statement.importStatement;

import AST.Node;
import AST.helpers.Space;
import AST.statement.importStatement.importDeclaration.ImportDeclaration;

public class ImportStatement extends Node {
    private ImportDeclaration importDeclaration;
    private String modulePath;

    public ImportDeclaration getImportDeclaration() {
        return importDeclaration;
    }

    public void setImportDeclaration(ImportDeclaration importDeclaration) {
        this.importDeclaration = importDeclaration;
    }

    public String getModulePath() {
        return modulePath;
    }

    public void setModulePath(String modulePath) {
        this.modulePath = modulePath;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("{\n");

        // Append importDeclaration
        Space.currentValue++;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("importDeclaration = ").append(importDeclaration).append(",\n");
        stringBuilder.append("\t".repeat(Space.currentValue)).append("modulePath = ").append(modulePath).append(",\n");

        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() { return ""; }

    @Override
    public String convertToCSS() { return ""; }

    @Override
    public String convertToJS() {
        return "// Import: " + importDeclaration.convertToJS() + " from '" + modulePath + "'\n";
    }
}
