package AST.program.declaration.directiveDeclaration;

import AST.Space;
import AST.program.declaration.directiveDeclaration.directiveMetadataProperty.DirectiveMetadataProperty;

import java.util.ArrayList;
import java.util.List;

public class DirectiveMetadata {
    List<DirectiveMetadataProperty> directiveMetadataPropertyList;

    public DirectiveMetadata() {
        this.directiveMetadataPropertyList = new ArrayList<>();
    }

    public List<DirectiveMetadataProperty> getDirectiveMetadataPropertyList() {
        return directiveMetadataPropertyList;
    }

    public void setDirectiveMetadataPropertyList(List<DirectiveMetadataProperty> directiveMetadataPropertyList) {
        this.directiveMetadataPropertyList = directiveMetadataPropertyList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("DirectiveMetadata: {\n");

        if (!directiveMetadataPropertyList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("directiveMetadataPropertyList: [\n");
            Space.currentValue++;
            for (DirectiveMetadataProperty property : directiveMetadataPropertyList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
        }

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
