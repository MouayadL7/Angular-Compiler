package ErrorHandling.HTML;

import java.util.ArrayList;
import java.util.List;

public class TemplateElementInfo {
    private String tagName;
    private int line;
    private final List<String> structuralDirectives = new ArrayList<>();

    public void addStructuralDirective(String directive) {
        structuralDirectives.add(directive);
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getLine() {
        return line;
    }

    public List<String> getStructuralDirectives() {
        return structuralDirectives;
    }
}
