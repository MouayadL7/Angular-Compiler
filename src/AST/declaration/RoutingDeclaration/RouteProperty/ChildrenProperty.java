package AST.declaration.RoutingDeclaration.RouteProperty;

import AST.declaration.RoutingDeclaration.RouteDefinition;
import AST.helpers.Space;
import AST.parameterList.Parameter;

import java.util.List;

public class ChildrenProperty extends RouteProperty{
    private List<RouteDefinition> routeDefinitionList;

    public List<RouteDefinition> getRouteDefinitionList() {
        return routeDefinitionList;
    }

    public void setRouteDefinitionList(List<RouteDefinition> routeDefinitionList) {
        this.routeDefinitionList = routeDefinitionList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ChildrenProperty: {\n");

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
        return "";
    }

    @Override
    public String convertToCSS() {
        return "";
    }

    @Override
    public String convertToJS() {
        return "";
    }
}
