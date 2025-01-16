package AST.declaration.injectableDeclaration;

import AST.helpers.Space;

import java.util.ArrayList;
import java.util.List;

public class InjectableMetadata {
    List<InjectableMetadataProperty> injectableMetadataPropertyList;

    public InjectableMetadata() {
        this.injectableMetadataPropertyList  = new ArrayList<>();
    }

    public List<InjectableMetadataProperty> getInjectableMetadataPropertyList() {
        return injectableMetadataPropertyList;
    }

    public void setInjectableMetadataPropertyList(List<InjectableMetadataProperty> injectableMetadataPropertyList) {
        this.injectableMetadataPropertyList = injectableMetadataPropertyList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("InjectableMetadata: {\n");

        if (!injectableMetadataPropertyList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("injectableMetadataPropertyList: [\n");
            Space.currentValue++;
            for (InjectableMetadataProperty property : injectableMetadataPropertyList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
        }

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
