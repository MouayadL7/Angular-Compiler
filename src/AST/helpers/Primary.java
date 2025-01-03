package AST.helpers;

import AST.Space;

public class Primary {
    private String identifier;
    private Literal literal;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Literal getLiteral() {
        return literal;
    }

    public void setLiteral(Literal literal) {
        this.literal = literal;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("Primary: {\n");

        Space.currentValue++;

        // Append identifier
        if (identifier != null) {
            stringBuilder.append("identifier = ").append(identifier).append(",\n");
        }
        else {
            stringBuilder.append(literal).append(",\n");
        }

        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
