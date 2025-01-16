package AST.helpers;

import AST.declaration.variableDeclaration.VariableDeclaration;
import AST.statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class Block {
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
        StringBuilder stringBuilder = new StringBuilder("Block: {\n");

        Space.currentValue++;
        // Append statementList
        if (!statementList.isEmpty()) {
            stringBuilder.append("statements: [\n");
            Space.currentValue++;
            for (Statement statement : statementList) {
                stringBuilder.append("\t".repeat(Space.currentValue)).append(statement).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("],\n");
        }

        // Append VariableDeclarationList
        if (!variableDeclarationList.isEmpty()) {
            stringBuilder.append("variableDeclarations: [\n");
            Space.currentValue++;
            for (VariableDeclaration variableDeclaration : variableDeclarationList) {
                stringBuilder.append("\t".repeat(Space.currentValue)).append(variableDeclaration).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("],\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
