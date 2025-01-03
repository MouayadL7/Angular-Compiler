package AST.program.declaration.enumDeclaration;

import AST.Space;

import java.util.ArrayList;
import java.util.List;

public class EnumBody {
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
}
