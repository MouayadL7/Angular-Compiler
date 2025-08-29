package AST.declaration.RoutingDeclaration.RouteProperty;

import AST.helpers.Space;

public class PathMatchProperty extends RouteProperty{
    private String pathMatch;

    public String getPathMatch() {
        return pathMatch;
    }

    public void setPathMatch(String pathMatch) {
        this.pathMatch = pathMatch;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("PathMatchProperty: {\n");

        Space.currentValue++;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("pathMatch = ").append(pathMatch).append(",\n");
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
