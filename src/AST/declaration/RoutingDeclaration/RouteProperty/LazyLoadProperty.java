package AST.declaration.RoutingDeclaration.RouteProperty;

import AST.declaration.functionDeclaration.ArrowFunction;
import AST.helpers.Space;

public class LazyLoadProperty extends RouteProperty{
    private ArrowFunction arrowFunction;

    public ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("LazyLoadProperty: {\n");

        Space.currentValue++;
        stringBuilder.append(arrowFunction).append(",\n");
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
