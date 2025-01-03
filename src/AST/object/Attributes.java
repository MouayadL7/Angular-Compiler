package AST.object;

import AST.Space;

import java.util.ArrayList;
import java.util.List;

public class Attributes {
    List<Attribute> attributeList;

    public Attributes() {
        this.attributeList = new ArrayList<>();
    }

    public List<Attribute> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(List<Attribute> attributeList) {
        this.attributeList = attributeList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Attributes: [\n");

        if (!attributeList.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("attributeList: [\n");
            Space.currentValue++;
            for (Attribute property : attributeList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
            Space.currentValue--;
        }

        stringBuilder.append("\t".repeat(Space.currentValue)).append("]");
        return stringBuilder.toString();
    }
}
