package AST.HTML.element.InterpolationElement;

public class StandardInterpolationElement extends InterpolationElement{
    private String attribute;
    private String value;

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return attribute + (value != null ? " : " + value : "");
    }

    @Override
    public String convertToHTML() {
        return null;
    }

    @Override
    public String convertToCSS() {
        return null;
    }

    @Override
    public String convertToJS() {
        if (value != null) {
            return attribute + "." + value;
        }
        return attribute;
    }
}
