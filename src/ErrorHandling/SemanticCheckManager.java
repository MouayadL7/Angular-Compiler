package ErrorHandling;

import ErrorHandling.Component.*;
import ErrorHandling.HTML.ImportCheck;
import ErrorHandling.HTML.ImportSymbolTable;
import ErrorHandling.HTML.StructuralDirectiveConflictCheck;
import ErrorHandling.HTML.TemplateSymbolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SemanticCheckManager {
    private final SelectorSymbolTable selectorSymbolTable;
    private final DuplicateSelectorSymbolTable duplicateSelectorSymbolTable;
    private final MissingTemplateSymbolTable missingTemplateSymbolTable;
    private final TemplateSymbolTable templateSymbolTable;
    private final ImportSymbolTable importSymbolTable;
    private final List<SemanticCheck> checks;
    private final List<SemanticError> errors;

    public SemanticCheckManager(SelectorSymbolTable selectorSymbolTable,
                                DuplicateSelectorSymbolTable duplicateSelectorSymbolTable,
                                MissingTemplateSymbolTable missingTemplateSymbolTable,
                                TemplateSymbolTable templateSymbolTable,
                                ImportSymbolTable importSymbolTable) {
        this.selectorSymbolTable = selectorSymbolTable;
        this.duplicateSelectorSymbolTable = duplicateSelectorSymbolTable;
        this.missingTemplateSymbolTable = missingTemplateSymbolTable;
        this.templateSymbolTable = templateSymbolTable;
        this.importSymbolTable = importSymbolTable;

        this.checks = new ArrayList<>();
        this.errors = new ArrayList<>();

        initializeChecks();
    }

    private void initializeChecks() {
        checks.add(new SelectorCheck(selectorSymbolTable));
        checks.add(new DuplicateSelectorCheck(duplicateSelectorSymbolTable));
        checks.add(new MissingTemplateCheck(missingTemplateSymbolTable));
        checks.add(new StructuralDirectiveConflictCheck(templateSymbolTable));
        checks.add(new ImportCheck(importSymbolTable));
    }

    public void runChecks() {
        try {
            String fileName = "src/semantic.txt";
            FileWriter test = new FileWriter(fileName);

            for (SemanticCheck check : checks) {
                check.check();
                errors.addAll(check.getErrors());
            }

            test.append("Semantic Check : \n");
            for (SemanticError error : errors) {
                test.append(error.toString()).append("\n");
            }
            test.flush();
            test.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<SemanticError> getErrors() {
        return errors;
    }
}
