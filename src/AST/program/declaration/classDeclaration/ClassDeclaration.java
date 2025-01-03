package AST.program.declaration.classDeclaration;

import AST.Space;
import AST.program.declaration.Declaration;

import java.util.ArrayList;
import java.util.List;

public class ClassDeclaration extends Declaration {
    private boolean exported;
    private String name;
    private List<String> extendsList;
    private List<String> implementsList;
    private ClassBody classBody;

    public ClassDeclaration() {
        this.extendsList = new ArrayList<>();
        this.implementsList = new ArrayList<>();
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

    public List<String> getImplementsList() {
        return implementsList;
    }

    public void setImplementsList(List<String> implementsList) {
        this.implementsList = implementsList;
    }

    public ClassBody getClassBody() {
        return classBody;
    }

    public void setClassBody(ClassBody classBody) {
        this.classBody = classBody;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ClassDeclaration: {\n");

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

        // Append implementsList
        if (!implementsList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("implementsList: [ ");
            Space.currentValue++;
            for (String string : implementsList) {
                stringBuilder.append(string).append(", ");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append(" ],\n");
        }

        // Append classBody
        if (classBody != null) {
            stringBuilder.append(classBody).append(",\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");

        return stringBuilder.toString();
    }
}
