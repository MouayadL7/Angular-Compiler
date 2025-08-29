package AST.declaration.componentDeclaration;

import AST.Node;
import AST.helpers.Space;
import AST.declaration.componentDeclaration.componentMetadataProperty.ComponentMetadataProperty;

import java.util.ArrayList;
import java.util.List;

public class ComponentMetadata extends Node {
    List<ComponentMetadataProperty> componentMetadataPropertyList;

    public ComponentMetadata() {
        this.componentMetadataPropertyList = new ArrayList<>();
    }

    public List<ComponentMetadataProperty> getMetadataComponentPropertyList() {
        return componentMetadataPropertyList;
    }

    public void setMetadataComponentPropertyList(List<ComponentMetadataProperty> componentMetadataPropertyList) {
        this.componentMetadataPropertyList = componentMetadataPropertyList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ComponentMetadata: {\n");

        Space.currentValue++;

        if (!componentMetadataPropertyList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("componentMetadataProperties: [\n");
            Space.currentValue++;
            for (ComponentMetadataProperty property : componentMetadataPropertyList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
        }

        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
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
        return null;
    }
}
