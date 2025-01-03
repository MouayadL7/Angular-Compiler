package AST.program.declaration.interfaceDeclaration;

import AST.Space;

import java.util.ArrayList;
import java.util.List;

public class InterfaceBody {
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
}
