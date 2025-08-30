package AST.statement.importStatement.importDeclaration;

import AST.helpers.Space;

public class ImportNamespaceSpecifier extends ImportDeclaration {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ImportNamespaceSpecifier: {\n");

        Space.currentValue++;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Name = ").append(name != null ? name : "").append(",\n");
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
