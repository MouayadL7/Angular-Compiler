package ErrorHandling.HTML;

import java.util.ArrayList;
import java.util.List;

public class TemplateSymbolTable {
    private final List<TemplateElementInfo> elements = new ArrayList<>();

    public void addElement(TemplateElementInfo element) {
        elements.add(element);
    }

    public List<TemplateElementInfo> getElements() {
        return elements;
    }
}

