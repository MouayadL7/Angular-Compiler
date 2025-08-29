package AST.declaration.interfaceDeclaration;

import AST.Node;
import AST.helpers.Space;

import java.util.ArrayList;
import java.util.List;

public class InterfaceBody extends Node {
    List<InterfaceProperty> interfacePropertyList;

    public InterfaceBody() {
        this.interfacePropertyList = new ArrayList<>();
    }

    public List<InterfaceProperty> getInterfacePropertyList() {
        return interfacePropertyList;
    }

    public void setInterfacePropertyList(List<InterfaceProperty> interfacePropertyList) {
        this.interfacePropertyList = interfacePropertyList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("InterfaceBody: {\n");

        if (!interfacePropertyList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("interfacePropertyList: [\n");
            Space.currentValue++;
            for (InterfaceProperty property : interfacePropertyList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
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
