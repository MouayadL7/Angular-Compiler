package AST.HTML.element;

import AST.HTML.CloseTag;
import AST.HTML.content.Content;
import AST.HTML.OpenTag;
import AST.Space;

import java.util.ArrayList;
import java.util.List;

public class StandardTagElement {
    private OpenTag openTag;
    private CloseTag closeTag;
    List<Content> contentList;

    public StandardTagElement() {
        this.contentList = new ArrayList<>();
    }

    public OpenTag getOpenTag() {
        return openTag;
    }

    public void setOpenTag(OpenTag openTag) {
        this.openTag = openTag;
    }

    public CloseTag getCloseTag() {
        return closeTag;
    }

    public void setCloseTag(CloseTag closeTag) {
        this.closeTag = closeTag;
    }

    public List<Content> getContentList() {
        return contentList;
    }

    public void setContentList(List<Content> contentList) {
        this.contentList = contentList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("StandardTagElement: {\n");

        Space.currentValue++;

        // Append openTag
        stringBuilder.append(openTag).append(",\n");

        // Append contentList
        if (!contentList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("contentList: [\n");
            Space.currentValue++;
            for (Content content : contentList) {
                stringBuilder.append(content).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
        }

        // Append closeTag
        stringBuilder.append(closeTag).append(",\n");

        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
