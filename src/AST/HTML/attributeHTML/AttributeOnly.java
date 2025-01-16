package AST.HTML.attributeHTML;

import AST.helpers.Space;

public class AttributeOnly extends AttributeHTML{
    private String word;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return "\t".repeat(Space.currentValue) + "{ word = " + word + " }";
    }
}
