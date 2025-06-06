package AST.declaration.classDeclaration.constructorDeclaration;

import AST.helpers.Space;
import AST.statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class ConstructorBody {
    List<Statement> statementList;

    public ConstructorBody() {
        this.statementList = new ArrayList<>();
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ConstructorBody: {\n");

        if (!statementList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("statementList: [\n");
            Space.currentValue++;
            for (Statement property : statementList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
        }

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
