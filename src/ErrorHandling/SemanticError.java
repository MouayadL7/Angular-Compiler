package ErrorHandling;

public class SemanticError {
    private final int line;
    private final String message;

    public SemanticError(int line, String message) {
        this.line = line;
        this.message = message;
    }

    public int getLine() {
        return line;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Line " + line + ": " + message;
    }
}
