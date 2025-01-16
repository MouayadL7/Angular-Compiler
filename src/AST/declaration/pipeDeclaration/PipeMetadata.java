package AST.declaration.pipeDeclaration;

import AST.helpers.Space;

import java.util.ArrayList;
import java.util.List;

public class PipeMetadata {
    List<PipeMetadataProperty> pipeMetadataPropertyList;

    public PipeMetadata() {
        this.pipeMetadataPropertyList = new ArrayList<>();
    }

    public List<PipeMetadataProperty> getPipeMetadataPropertyList() {
        return pipeMetadataPropertyList;
    }

    public void setPipeMetadataPropertyList(List<PipeMetadataProperty> pipeMetadataPropertyList) {
        this.pipeMetadataPropertyList = pipeMetadataPropertyList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("PipeMetadata: {\n");

        if (!pipeMetadataPropertyList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("pipeMetadataPropertyList: [\n");
            Space.currentValue++;
            for (PipeMetadataProperty property : pipeMetadataPropertyList) {
                stringBuilder.append(property).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
        }

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
