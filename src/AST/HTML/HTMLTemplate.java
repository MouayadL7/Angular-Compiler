package AST.HTML;

import AST.HTML.element.Element;
import AST.helpers.Space;

import java.util.ArrayList;
import java.util.List;

public class HTMLTemplate {
    private List<Element> elementList;

    public HTMLTemplate() {
        this.elementList = new ArrayList<>();
    }

    public List<Element> getElementList() {
        return elementList;
    }

    public void setElementList(List<Element> elementList) {
        this.elementList = elementList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("HTMLTemplate: {\n");

        if (!elementList.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("elements: [\n");
            Space.currentValue++;
            for (Element property : elementList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
            Space.currentValue--;
        }

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
