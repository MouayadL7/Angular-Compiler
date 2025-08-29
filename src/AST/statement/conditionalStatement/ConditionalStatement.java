package AST.statement.conditionalStatement;

import AST.helpers.Space;
import AST.statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class ConditionalStatement extends Statement {
    IfStatement ifStatement;
    List<ElseIfStatement> elseIfStatementList;
    ElseStatement elseStatement;

    public ConditionalStatement() {
        this.elseIfStatementList = new ArrayList<>();
    }

    public IfStatement getIfStatement() {
        return ifStatement;
    }

    public void setIfStatement(IfStatement ifStatement) {
        this.ifStatement = ifStatement;
    }

    public List<ElseIfStatement> getElseIfStatementList() {
        return elseIfStatementList;
    }

    public void setElseIfStatementList(List<ElseIfStatement> elseIfStatementList) {
        this.elseIfStatementList = elseIfStatementList;
    }

    public ElseStatement getElseStatement() {
        return elseStatement;
    }

    public void setElseStatement(ElseStatement elseStatement) {
        this.elseStatement = elseStatement;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ConditionalStatement: {\n");

        Space.currentValue++;
        // Append ifStatement
        if (ifStatement != null) {
            stringBuilder.append(ifStatement).append(",\n");
        }

        // Append elseIfStatement
        if (!elseIfStatementList.isEmpty()) {
            for (ElseIfStatement property : elseIfStatementList) {
                stringBuilder.append(property).append(",\n");
            }
        }

        // Append elseStatement
        if (elseStatement != null) {
            stringBuilder.append(elseStatement).append(",\n");
        }

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
