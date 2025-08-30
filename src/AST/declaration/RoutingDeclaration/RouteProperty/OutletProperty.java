package AST.declaration.RoutingDeclaration.RouteProperty;

import AST.helpers.Space;

public class OutletProperty extends RouteProperty{
    private String outlet;

    public String getOutlet() {
        return outlet;
    }

    public void setOutlet(String outlet) {
        this.outlet = outlet;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("OutletProperty: {\n");

        Space.currentValue++;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("outlet = ").append(outlet).append(",\n");
        Space.currentValue--;

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
