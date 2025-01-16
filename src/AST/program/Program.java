package AST.program;

import AST.helpers.Space;
import AST.declaration.Declaration;
import AST.statement.importStatement.ImportStatement;
import AST.statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private List<ImportStatement> importStatementList;
    private List<Declaration> declarationList;
    private List<Statement> statementList;

    public Program() {
        this.importStatementList = new ArrayList<>();
        this.declarationList = new ArrayList<>();
        this.statementList = new ArrayList<>();
    }

    public List<ImportStatement> getImportStatementList() {
        return importStatementList;
    }

    public void setImportStatementList(List<ImportStatement> importStatementList) {
        this.importStatementList = importStatementList;
    }

    public List<Declaration> getDeclarationList() {
        return declarationList;
    }

    public void setDeclarationList(List<Declaration> declarationList) {
        this.declarationList = declarationList;
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
        stringBuilder.append("Program {\n");

        // Append import statement list
        if (!importStatementList.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("ImportStatementList: [\n");
            Space.currentValue++;
            for (ImportStatement importStatement : importStatementList) {
                stringBuilder.append(importStatement.toString()).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("],\n");
            Space.currentValue--;
        }

        // Append declaration list
        if (!declarationList.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Declarations: [\n");
            Space.currentValue++;
            for (Declaration declaration : declarationList) {
                stringBuilder.append(declaration.toString()).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("],\n");
            Space.currentValue--;
        }

        // Append statement list
        if (!statementList.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Statements: [\n");
            Space.currentValue++;
            for (Statement statement : statementList) {
                stringBuilder.append(statement.toString()).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
            Space.currentValue--;
        }

        stringBuilder.append("}");
        return stringBuilder.toString();
    }

}
