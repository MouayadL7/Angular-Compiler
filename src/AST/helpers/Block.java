package AST.helpers;

import AST.Node;
import AST.declaration.variableDeclaration.VariableDeclaration;
import AST.statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class Block extends Node {
    List<Statement> statementList;
    List<VariableDeclaration> variableDeclarationList;

    public Block() {
        this.statementList = new ArrayList<>();
        this.variableDeclarationList = new ArrayList<>();
    }

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }

    public List<VariableDeclaration> getVariableDeclarationList() {
        return variableDeclarationList;
    }

    public void setVariableDeclarationList(List<VariableDeclaration> variableDeclarationList) {
        this.variableDeclarationList = variableDeclarationList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Block: {\n");

        Space.currentValue++;
        // Append statementList
        if (!statementList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("statements: [\n");
            Space.currentValue++;
            for (Statement statement : statementList) {
                stringBuilder.append(statement).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("],\n");
        }

        // Append VariableDeclarationList
        if (!variableDeclarationList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("variableDeclarations: [\n");
            Space.currentValue++;
            for (VariableDeclaration variableDeclaration : variableDeclarationList) {
                stringBuilder.append(variableDeclaration).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("],\n");
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
