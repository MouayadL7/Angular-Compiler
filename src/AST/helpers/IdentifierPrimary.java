package AST.helpers;

public class IdentifierPrimary extends Primary{
    private String identifier;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("IdentifierPrimary: {\n");

        Space.currentValue++;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("identifier = ").append(identifier).append("\n");
        Space.currentValue--;

        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");
        return stringBuilder.toString();
    }
}
