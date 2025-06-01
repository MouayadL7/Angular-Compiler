package ErrorHandling.Component;

import ErrorHandling.SemanticCheck;
import ErrorHandling.SemanticError;

import java.util.ArrayList;
import java.util.List;

public class SelectorCheck implements SemanticCheck {
    private final SelectorSymbolTable symbolTable;
    private final List<SemanticError> errors;

    public SelectorCheck(SelectorSymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.errors = new ArrayList<>();
    }

    @Override
    public void check() {
        for (ComponentInfo comp : symbolTable.getComponents()) {
            if (!comp.hasValidSelector()) {
                errors.add(new SemanticError(comp.getComponentLine(), "Component is missing a selector."));
            }
        }
    }

    @Override
    public List<SemanticError> getErrors() {
        return errors;
    }

    @Override
    public void printErrors() {
        for (SemanticError error : errors) {
            System.out.println(error);
        }
    }
}
