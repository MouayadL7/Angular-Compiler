package SymbolTable;

public class ComponentSymbol {
    public String className;
    public boolean hasSelector;
    public String selectorValue;

    public ComponentSymbol(String className) {
        this.className = className;
        this.hasSelector = false;
    }
}
