package AST.declaration.ngModuleDeclaration;

import AST.Node;
import AST.helpers.Space;
import AST.declaration.ngModuleDeclaration.moduleMetadataProperty.ModuleMetadataProperty;

import java.util.ArrayList;
import java.util.List;

public class ModuleMetadata extends Node {
    List<ModuleMetadataProperty> moduleMetadataPropertyList;

    public ModuleMetadata() {
        this.moduleMetadataPropertyList = new ArrayList<>();
    }

    public List<ModuleMetadataProperty> getMetadataModulePropertyList() {
        return moduleMetadataPropertyList;
    }

    public void setMetadataModulePropertyList(List<ModuleMetadataProperty> moduleMetadataPropertyList) {
        this.moduleMetadataPropertyList = moduleMetadataPropertyList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ModuleMetadata: {\n");

        if (!moduleMetadataPropertyList.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("moduleMetadataProperties: [\n");
            Space.currentValue++;
            for (ModuleMetadataProperty property : moduleMetadataPropertyList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
            Space.currentValue--;
        }

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() {
        return "";
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
