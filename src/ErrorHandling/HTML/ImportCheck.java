package ErrorHandling.HTML;

import ErrorHandling.SemanticCheck;
import ErrorHandling.SemanticError;

import java.util.ArrayList;
import java.util.List;

public class ImportCheck implements SemanticCheck {
    private final ImportSymbolTable symbolTable;
    private final List<SemanticError> errors;

    public ImportCheck(ImportSymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.errors = new ArrayList<>();
    }

    @Override
    public void check() {
        boolean commonModuleImported = symbolTable.isImported("CommonModule");

        if (!commonModuleImported) {
            for (TemplateElementInfo element : symbolTable.getElements()) {
                List<String> structuralDirectives = element.getStructuralDirectives(); // (e.g. *ngIf, *ngFor)

                if (structuralDirectives.size() > 1) {
                    errors.add(new SemanticError(
                            element.getLine(),
                            "Element <" + element.getTagName() + "> contains structural directives: " +
                                    element.getStructuralDirectives() + ". used without importing CommonModule."
                    ));
                }
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
