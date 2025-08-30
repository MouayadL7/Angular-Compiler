package AST.declaration.RoutingDeclaration;

import AST.Node;
import AST.declaration.RoutingDeclaration.RouteProperty.RouteProperty;
import AST.helpers.Space;

import java.util.ArrayList;
import java.util.List;

public class RouteDefinition extends Node {
    private List<RouteProperty> routePropertyList;

    public RouteDefinition() {
        this.routePropertyList = new ArrayList<>();
    }

    public List<RouteProperty> getRoutePropertyList() {
        return routePropertyList;
    }

    public void setRoutePropertyList(List<RouteProperty> routePropertyList) {
        this.routePropertyList = routePropertyList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("RoutingDefinition: {\n");

        if (!routePropertyList.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("routePropertyList: [\n");
            Space.currentValue++;
            for (RouteProperty property : routePropertyList) {
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
