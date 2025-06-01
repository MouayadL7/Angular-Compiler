package ErrorHandling.HTML;

import ErrorHandling.SemanticCheck;
import ErrorHandling.SemanticError;

import java.util.ArrayList;
import java.util.List;

public class StructuralDirectiveConflictCheck implements SemanticCheck {
    private final TemplateSymbolTable templateSymbolTable;
    private final List<SemanticError> errors;

    public StructuralDirectiveConflictCheck(TemplateSymbolTable templateSymbolTable) {
        this.templateSymbolTable = templateSymbolTable;
        this.errors = new ArrayList<>();
    }

    @Override
    public void check() {
        for (TemplateElementInfo element : templateSymbolTable.getElements()) {
            List<String> structuralDirectives = element.getStructuralDirectives(); // مثال: ["*ngIf", "*ngFor"]

            if (structuralDirectives.size() > 1) {
                errors.add(new SemanticError(
                        element.getLine(),
                        "Element <" + element.getTagName() + "> contains multiple structural directives: " +
                                element.getStructuralDirectives() + ". Only one is allowed per element."
                ));
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
