package AST.program.declaration.interfaceDeclaration;

import AST.Space;
import AST.program.declaration.Declaration;

import java.util.ArrayList;
import java.util.List;

public class InterfaceDeclaration extends Declaration {
    private boolean exported;
    private String name;
    private List<String> extendsList;
    private InterfaceBody interfaceBody;

    public InterfaceDeclaration() {
        this.extendsList = new ArrayList<>();
    }

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

    public List<String> getExtendsList() {
        return extendsList;
    }

    public void setExtendsList(List<String> extendsList) {
        this.extendsList = extendsList;
    }

    public InterfaceBody getInterfaceBody() {
        return interfaceBody;
    }

    public void setInterfaceBody(InterfaceBody interfaceBody) {
        this.interfaceBody = interfaceBody;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("InterfaceDeclaration: {\n");

        Space.currentValue++;

        // Append exported
        if (isExported()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("isExported").append(",\n");
        }

        // Append name
        stringBuilder.append("\t".repeat(Space.currentValue)).append("name = ").append(name != null ? name : "").append(",\n");

        // Append extendsList
        if (!extendsList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("extendsList: [ ");
            Space.currentValue++;
            for (String string : extendsList) {
                stringBuilder.append(string).append(", ");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append(" ],\n");
        }


        // Append interfaceBody
        if (interfaceBody != null) {
            stringBuilder.append(interfaceBody).append(",\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");

        return stringBuilder.toString();
    }
}
