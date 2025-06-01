package ErrorHandling.HTML;

import java.util.ArrayList;
import java.util.List;

public class ImportSymbolTable {
    private final List<String> imports = new ArrayList<>();
    private final List<TemplateElementInfo> elements = new ArrayList<>();

    public List<TemplateElementInfo> getElements() {
        return elements;
    }

    public void addElement(TemplateElementInfo element) {
        this.elements.add(element);
    }

    public void addImport(String imported) {
        if (imported != null && !imported.isBlank() && !imports.contains(imported)) {
            imports.add(imported);
        }
    }

    public boolean isImported(String imported) {
        return imports.contains(imported);
    }
}
