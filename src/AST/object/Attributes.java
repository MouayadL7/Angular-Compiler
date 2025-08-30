package AST.object;

import AST.Node;
import AST.helpers.Space;

import java.util.ArrayList;
import java.util.List;

public class Attributes extends Node {
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
        stringBuilder.append("[\n");

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

        stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
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
        StringBuilder stringBuilder = new StringBuilder();

        for (Attribute attribute : attributeList) {
            String attributeJs = attribute.convertToJS();
            if (!attributeJs.isEmpty()) {
                stringBuilder.append(attributeJs).append(",\n");
            }
        }

        return stringBuilder.toString();
    }
}
