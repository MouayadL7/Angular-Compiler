package AST.HTML.element;

import AST.HTML.element.InterpolationElement.InterpolationElement;
import AST.helpers.Space;

import java.util.ArrayList;
import java.util.List;

public class Interpolation extends Element {
    private String attribute;
    private String signal;
    private List<InterpolationElement> interpolationElementList;

    public Interpolation() {
        this.interpolationElementList = new ArrayList<>();
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getSignal() {
        return signal;
    }

    public void setSignal(String signal) {
        this.signal = signal;
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

    @Override
    public String convertToHTML() {
        StringBuilder html = new StringBuilder();
        if (getAttribute() != null) {
            html.append(getAttribute()).append(getSignal());
        }

        html.append("<span data-binding=").append(interpolationElementList.getFirst().convertToHTML()).append(">");
        html.append("</span>\n");

        return html.toString();
    }

    @Override
    public String convertToCSS() {
        return "";
    }

    @Override
    public String convertToJS() {
        StringBuilder js = new StringBuilder();
        String textVar = "text_" + System.identityHashCode(this);

        js.append("const ").append(textVar).append(" = document.createTextNode(");

        if (interpolationElementList.size() == 1) {
            js.append(interpolationElementList.get(0).convertToJS());
        } else {
            js.append("String(").append(interpolationElementList.get(0).convertToJS()).append(")");
            for (int i = 1; i < interpolationElementList.size(); i++) {
                js.append(" + ' | ' + String(").append(interpolationElementList.get(i).convertToJS()).append(")");
            }
        }

        js.append(");\n");
        return js.toString();
    }
}
