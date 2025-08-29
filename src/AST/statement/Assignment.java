package AST.statement;

import AST.helpers.Space;
import AST.helpers.Initialization;
import AST.helpers.MemberAccess;

public class Assignment extends Statement {
    MemberAccess memberAccess;
    Initialization initialization;

    public MemberAccess getMemberAccess() {
        return memberAccess;
    }

    public void setMemberAccess(MemberAccess memberAccess) {
        this.memberAccess = memberAccess;
    }

    public Initialization getInitialization() {
        return initialization;
    }

    public void setInitialization(Initialization initialization) {
        this.initialization = initialization;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Assignment: {\n");

        Space.currentValue++;

        // Append memberAccess
        if (memberAccess != null) {
            stringBuilder.append(memberAccess).append(",\n");
        }

        // Append initialization
        if (initialization != null) {
            stringBuilder.append(initialization).append(",\n");
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
