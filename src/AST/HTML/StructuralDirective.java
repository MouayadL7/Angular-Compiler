package AST.HTML;

import AST.Node;
import AST.helpers.Space;

public class StructuralDirective extends Node {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() { return name; }

    @Override
    public String convertToHTML() {
        return name;
    }

    @Override
    public String convertToCSS() {
        return "";
    }

    @Override
    public String convertToJS() {
        return "";
    }
}
