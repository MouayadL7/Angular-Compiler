package AST.program.declaration.ngModuleDeclaration;

import AST.Space;
import AST.program.declaration.ngModuleDeclaration.moduleMetadataProperty.ModuleMetadataProperty;

import java.util.ArrayList;
import java.util.List;

public class ModuleMetadata {
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

}
