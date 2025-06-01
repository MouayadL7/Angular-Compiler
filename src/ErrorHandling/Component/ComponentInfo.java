package ErrorHandling.Component;

public class ComponentInfo {
    private String componentName;
    private int componentLine;
    private String selector;
    private int selectorLine;
    private boolean hasTemplate;

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public int getComponentLine() {
        return componentLine;
    }

    public void setComponentLine(int componentLine) {
        this.componentLine = componentLine;
    }

    public String getSelector() {
        return selector;
    }

    public void setSelector(String selector) {
        this.selector = selector;
    }

    public int getSelectorLine() {
        return selectorLine;
    }

    public void setSelectorLine(int selectorLine) {
        this.selectorLine = selectorLine;
    }

    public boolean isHasTemplate() {
        return hasTemplate;
    }

    public void setHasTemplate(boolean hasTemplate) {
        this.hasTemplate = hasTemplate;
    }

    public boolean hasValidSelector() {
        return selector != null && !selector.trim().isEmpty();
    }
}
