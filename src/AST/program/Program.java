package AST.program;

import AST.Node;
import AST.helpers.Space;
import AST.declaration.Declaration;
import AST.statement.importStatement.ImportStatement;
import AST.statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class Program extends Node {
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

    @Override
    public String convertToHTML() {
        StringBuilder html = new StringBuilder();

        // Process declarations for components that might contain templates
        for (Declaration declaration : declarationList) {
            String declarationHtml = declaration.convertToHTML();
            if (!declarationHtml.isEmpty()) {
                html.append(declarationHtml).append("\n");
            }
        }

        return html.toString();
    }

    @Override
    public String convertToCSS() {
        StringBuilder css = new StringBuilder();

        // Process declarations for components that might contain styles
        for (Declaration declaration : declarationList) {
            css.append(declaration.convertToCSS());
        }

        return css.toString();
    }

    @Override
    public String convertToJS() {
        StringBuilder js = new StringBuilder();

        // Generate imports
        for (ImportStatement importStatement : importStatementList) {
            js.append(importStatement.convertToJS());
        }

        js.append("\n// Component initialization\n");
        js.append("document.addEventListener('DOMContentLoaded', function() {\n");
        js.append("  const app = document.getElementById('app');\n\n");

        // Process declarations
        for (Declaration declaration : declarationList) {
            js.append(declaration.convertToJS());
        }

        // Process statements
        for (Statement statement : statementList) {
            js.append("  ").append(statement.convertToJS());
        }

        js.append("});\n");
        return js.toString();
    }
}
