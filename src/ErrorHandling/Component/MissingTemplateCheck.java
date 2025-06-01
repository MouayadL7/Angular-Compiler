package ErrorHandling.Component;

import ErrorHandling.SemanticCheck;
import ErrorHandling.SemanticError;

import java.util.ArrayList;
import java.util.List;

public class MissingTemplateCheck implements SemanticCheck {
    private final MissingTemplateSymbolTable symbolTable;
    private final List<SemanticError> errors;

    public MissingTemplateCheck(MissingTemplateSymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.errors = new ArrayList<>();
    }

    @Override
    public void check() {
        for (ComponentInfo comp : symbolTable.getComponents()) {
            if (!comp.isHasTemplate()) {
                errors.add(new SemanticError(comp.getComponentLine(), "Component is missing a template."));
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
