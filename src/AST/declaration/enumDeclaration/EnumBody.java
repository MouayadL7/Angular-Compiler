package AST.declaration.enumDeclaration;

import AST.Node;
import AST.helpers.Space;

import java.util.ArrayList;
import java.util.List;

public class EnumBody extends Node {
    List<EnumProperty> enumPropertyList;

    public EnumBody() {
        this.enumPropertyList = new ArrayList<>();
    }

    public List<EnumProperty> getEnumPropertyList() {
        return enumPropertyList;
    }

    public void setEnumPropertyList(List<EnumProperty> enumPropertyList) {
        this.enumPropertyList = enumPropertyList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("EnumBody: {\n");

        if (!enumPropertyList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("enumPropertyList: [\n");
            Space.currentValue++;
            for (EnumProperty property : enumPropertyList) {
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
