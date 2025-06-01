package ErrorHandling.Component;

import java.util.ArrayList;
import java.util.List;

public class MissingTemplateSymbolTable {
    private final List<ComponentInfo> components = new ArrayList<>();

    public void add(ComponentInfo info) {
        components.add(info);
    }

    public List<ComponentInfo> getComponents() {
        return components;
    }
}
