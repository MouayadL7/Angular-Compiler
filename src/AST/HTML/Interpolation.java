package AST.HTML;

import AST.HTML.element.Element;
import AST.helpers.Space;

import java.util.ArrayList;
import java.util.List;

public class Interpolation extends Element {
    private List<InterplationElement> interplationElementList;

    public Interpolation() {
        this.interplationElementList = new ArrayList<>();
    }

    public List<InterplationElement> getInterplationElementList() {
        return interplationElementList;
    }

    public void setInterplationElementList(List<InterplationElement> interplationElementList) {
        this.interplationElementList = interplationElementList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Interpolation: {\n");

        if (!interplationElementList.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("interplationElementList: [ ");

            for (int i = 0; i < interplationElementList.size(); i++) {
                stringBuilder.append(interplationElementList.get(i));
                if (i + 1 < interplationElementList.size()) {
                    stringBuilder.append(" | ");
                }
            }

            stringBuilder.append(" ]\n");
            Space.currentValue--;
        }

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
