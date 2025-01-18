package AST.HTML;

import AST.HTML.element.Element;
import AST.helpers.Space;

import java.util.ArrayList;
import java.util.List;

public class Interpolation extends Element {
    private List<InterpolationElement> interpolationElementList;

    public Interpolation() {
        this.interpolationElementList = new ArrayList<>();
    }

    public List<InterpolationElement> getInterplationElementList() {
        return interpolationElementList;
    }

    public void setInterplationElementList(List<InterpolationElement> interpolationElementList) {
        this.interpolationElementList = interpolationElementList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Interpolation: {\n");

        if (!interpolationElementList.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("interpolationElementList: [ ");

            for (int i = 0; i < interpolationElementList.size(); i++) {
                stringBuilder.append(interpolationElementList.get(i));
                if (i + 1 < interpolationElementList.size()) {
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
