package AST.declaration.classDeclaration;

import AST.Node;
import AST.declaration.Declaration;
import AST.helpers.Space;
import AST.declaration.classDeclaration.constructorDeclaration.ConstructorDeclaration;
import AST.declaration.functionDeclaration.FunctionDeclaration;
import AST.declaration.variableDeclaration.VariableDeclaration;
import AST.statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class ClassBody extends Node {
    List<PropertyDeclaration> propertyDeclarationList;
    ConstructorDeclaration constructorDeclaration;
    List<MethodDeclaration> methodDeclarationList;
    List<VariableDeclaration> variableDeclarationList;
    List<FunctionDeclaration> functionDeclarationList;
    List<Statement> statementList;

    public ClassBody() {
        this.propertyDeclarationList = new ArrayList<>();
        this.methodDeclarationList = new ArrayList<>();
        this.variableDeclarationList = new ArrayList<>();
        this.functionDeclarationList = new ArrayList<>();
        this.statementList = new ArrayList<>();
    }

    public List<PropertyDeclaration> getPropertyDeclarationList() {
        return propertyDeclarationList;
    }

    public void setPropertyDeclarationList(List<PropertyDeclaration> propertyDeclarationList) {
        this.propertyDeclarationList = propertyDeclarationList;
    }

    public ConstructorDeclaration getConstructorDeclaration() {
        return constructorDeclaration;
    }

    public void setConstructorDeclaration(ConstructorDeclaration constructorDeclaration) {
        this.constructorDeclaration = constructorDeclaration;
    }

    public List<MethodDeclaration> getMethodDeclarationList() {
        return methodDeclarationList;
    }

    public void setMethodDeclarationList(List<MethodDeclaration> methodDeclarationList) {
        this.methodDeclarationList = methodDeclarationList;
    }

    public List<VariableDeclaration> getVariableDeclarationList() {
        return variableDeclarationList;
    }

    public void setVariableDeclarationList(List<VariableDeclaration> variableDeclarationList) {
        this.variableDeclarationList = variableDeclarationList;
    }

    public List<FunctionDeclaration> getFunctionDeclarationList() {
        return functionDeclarationList;
    }

    public void setFunctionDeclarationList(List<FunctionDeclaration> functionDeclarationList) {
        this.functionDeclarationList = functionDeclarationList;
    }

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ClassBody: {\n");

        Space.currentValue++;

        // Append propertyDeclarationList
        if (!propertyDeclarationList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("propertyDeclarationList: [\n");
            Space.currentValue++;
            for (PropertyDeclaration property : propertyDeclarationList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
        }

        // Append constructor
        if (constructorDeclaration != null) {
            stringBuilder.append(constructorDeclaration).append(",\n");
        }

        // Append methodDeclarationList
        if (!methodDeclarationList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("methodDeclarationList: [\n");
            Space.currentValue++;
            for (MethodDeclaration property : methodDeclarationList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
        }

        // Append variableDeclarationList
        if (!variableDeclarationList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("variableDeclarationList: [\n");
            Space.currentValue++;
            for (VariableDeclaration property : variableDeclarationList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
        }

        // Append functionDeclarationList
        if (!functionDeclarationList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("functionDeclarationList: [\n");
            Space.currentValue++;
            for (FunctionDeclaration property : functionDeclarationList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
        }

        // Append statementList
        if (!statementList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("statementList: [\n");
            Space.currentValue++;
            for (Statement property : statementList) {
                stringBuilder.append(property).append(",\n");
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
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("\t".repeat(1)).append("constructor() {\n");
        for (int i = 0; i < propertyDeclarationList.size(); i++) {
            stringBuilder.append(propertyDeclarationList.get(i).convertToJS()).append("\n");
            if (i + 1 == propertyDeclarationList.size()) {
                stringBuilder.append("\n");
            }
        }
        stringBuilder.append("\t".repeat(1)).append("}\n");

        for (MethodDeclaration declaration : methodDeclarationList) {
            String declarationJs = declaration.convertToJS();
            if (!declarationJs.isEmpty()) {
                stringBuilder.append(declarationJs).append("\n\n");
            }
        }

        return stringBuilder.toString();
    }
}