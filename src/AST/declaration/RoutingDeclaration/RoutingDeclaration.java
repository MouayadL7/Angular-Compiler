package AST.declaration.RoutingDeclaration;

import AST.declaration.Declaration;
import AST.helpers.Space;
import AST.parameterList.Parameter;

import java.util.ArrayList;
import java.util.List;

public class RoutingDeclaration extends Declaration {
    private boolean exported;
    private String name;
    private List<RouteDefinition> routeDefinitionList;

    public RoutingDeclaration() {
        this.routeDefinitionList = new ArrayList<>();
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

    public List<RouteDefinition> getRouteDefinitionList() {
        return routeDefinitionList;
    }

    public void setRouteDefinitionList(List<RouteDefinition> routeDefinitionList) {
        this.routeDefinitionList = routeDefinitionList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("RoutingDeclaration: {\n");

        if (!routeDefinitionList.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("routeDefinitionList: [\n");
            Space.currentValue++;
            for (RouteDefinition property : routeDefinitionList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
            Space.currentValue--;
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
