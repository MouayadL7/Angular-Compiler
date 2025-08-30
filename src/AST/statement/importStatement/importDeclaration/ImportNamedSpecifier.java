package AST.statement.importStatement.importDeclaration;

import AST.helpers.Space;
import AST.statement.importStatement.importSpecifier.ImportSpecifier;

import java.util.ArrayList;
import java.util.List;

public class ImportNamedSpecifier extends ImportDeclaration {
    private List<ImportSpecifier> importSpecifierList;

    public ImportNamedSpecifier() {
        this.importSpecifierList = new ArrayList<>();
    }

    public List<ImportSpecifier> getImportSpecifierList() {
        return importSpecifierList;
    }

    public void setImportSpecifierList(List<ImportSpecifier> importSpecifierList) {
        this.importSpecifierList = importSpecifierList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ImportNamedSpecifier: {\n");

        // Append importSpecifiers
        Space.currentValue++;
        if (!importSpecifierList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("ImportNamedSpecifiers: [\n");
            Space.currentValue++;
            for (ImportSpecifier importSpecifier : importSpecifierList) {
                stringBuilder.append(importSpecifier).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
        }
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
