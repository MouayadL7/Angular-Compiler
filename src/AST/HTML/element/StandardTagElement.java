package AST.HTML.element;

import AST.HTML.CloseTag;
import AST.HTML.attributeHTML.AttributeHTML;
import AST.HTML.content.Content;
import AST.HTML.OpenTag;
import AST.helpers.Space;

import java.util.ArrayList;
import java.util.List;

public class StandardTagElement extends Element{
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

    @Override
    public String convertToHTML() {
        StringBuilder html = new StringBuilder();
        html.append(openTag.convertToHTML());

        for (Content content : contentList) {
            html.append(content.convertToHTML());
        }

        html.append(closeTag.convertToHTML());
        return html.toString();
    }

    @Override
    public String convertToCSS() {
        StringBuilder css = new StringBuilder();
        css.append(openTag.convertToCSS());

        for (Content content : contentList) {
            css.append(content.convertToCSS());
        }

        return css.toString();
    }

    @Override
    public String convertToJS() {
        StringBuilder js = new StringBuilder();
        String elementVar = "el_" + System.identityHashCode(this);

        // Create element
        js.append("const ").append(elementVar)
                .append(" = document.createElement('")
                .append(openTag.getTagName().convertToHTML()).append("');\n");

        // Process attributes
        for (AttributeHTML attr : openTag.getAttributeHtmlList()) {
            String attrJs = attr.convertToJS();
            if (!attrJs.isEmpty()) {
                js.append(attrJs.replace("${element}", elementVar));
            }
        }

        // Process content
        for (Content content : contentList) {
            String contentJs = content.convertToJS();
            if (!contentJs.isEmpty()) {
                js.append(contentJs);
                // If content creates elements, append them to this element
                if (content instanceof Element) {
                    js.append(elementVar).append(".appendChild(")
                            .append("el_").append(System.identityHashCode(content))
                            .append(");\n");
                }
            }
        }

        return js.toString();
    }
}
