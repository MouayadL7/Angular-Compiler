package AST.HTML.attributeHTML;

import AST.Space;

public class AttributeOnly {
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
