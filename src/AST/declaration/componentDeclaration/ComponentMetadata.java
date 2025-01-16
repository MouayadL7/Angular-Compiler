package AST.declaration.componentDeclaration;

import AST.helpers.Space;
import AST.declaration.componentDeclaration.componentMetadataProperty.ComponentMetadataProperty;

import java.util.ArrayList;
import java.util.List;

public class ComponentMetadata {
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ModuleMetadata: {\n");

        if (!componentMetadataPropertyList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("componentMetadataProperties: [\n");
            Space.currentValue++;
            for (ComponentMetadataProperty property : componentMetadataPropertyList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
        }

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
