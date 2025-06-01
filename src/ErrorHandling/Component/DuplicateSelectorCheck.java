package ErrorHandling.Component;

import ErrorHandling.SemanticCheck;
import ErrorHandling.SemanticError;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateSelectorCheck implements SemanticCheck {
    private final DuplicateSelectorSymbolTable symbolTable;
    private final List<SemanticError> errors;

    public DuplicateSelectorCheck(DuplicateSelectorSymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.errors = new ArrayList<>();
    }

    @Override
    public void check() {
        Map<String, List<Integer>> selectorLinesMap = new HashMap<>();

        for (ComponentInfo comp : symbolTable.getComponents()) {
            String selector = comp.getSelector();

            if (!comp.hasValidSelector()) {
                continue;
            }

            selectorLinesMap.putIfAbsent(selector, new ArrayList<>());
            selectorLinesMap.get(selector).add(comp.getSelectorLine());
        }

        for (Map.Entry<String, List<Integer>> entry : selectorLinesMap.entrySet()) {
            List<Integer> lines = entry.getValue();
            if (lines.size() > 1) {
                for (int line : lines) {
                    errors.add(new SemanticError(line, "Duplicate selector '" + entry.getKey() + "' used in multiple components."));
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
