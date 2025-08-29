package AST.declaration.enumDeclaration;

import AST.helpers.Space;
import AST.declaration.Declaration;

public class EnumDeclaration extends Declaration {
    private boolean exported;
    private String name;
    private EnumBody enumBody;

    public boolean isExported() {
        return exported;
    }

    public void setExported(boolean exported) {
        this.exported = exported;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumBody getEnumBody() {
        return enumBody;
    }

    public void setEnumBody(EnumBody enumBody) {
        this.enumBody = enumBody;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("EnumDeclaration: {\n");

        Space.currentValue++;

        // Append exported
        if (isExported()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("isExported").append("'\n");
        }

        // Append name
        stringBuilder.append("\t".repeat(Space.currentValue)).append("name = ").append(name != null ? name : "").append(",\n");

        // Append enumBody
        if (enumBody != null) {
            stringBuilder.append(enumBody).append(",\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");

        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() {
        return null;
    }

    @Override
    public String convertToCSS() {
        return null;
    }

    @Override
    public String convertToJS() {
        return null;
    }
}
