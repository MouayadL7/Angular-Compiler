package AST.declaration.directiveDeclaration;

import AST.Node;
import AST.helpers.Space;
import AST.declaration.directiveDeclaration.directiveMetadataProperty.DirectiveMetadataProperty;

import java.util.ArrayList;
import java.util.List;

public class DirectiveMetadata extends Node {
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
