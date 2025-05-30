package ErrorHandling;

import AST.declaration.componentDeclaration.ComponentDeclaration;
import AST.declaration.componentDeclaration.ComponentMetadata;
import AST.declaration.componentDeclaration.componentMetadataProperty.ComponentMetadataProperty;
import AST.declaration.componentDeclaration.componentMetadataProperty.SelectorComponentProperty;
import SymbolTable.SymbolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SemanticCheck {

    // List of Errors
    public static List<String> Errors = new ArrayList<>();
    private final List<ComponentDeclaration> componentList = new ArrayList<>();
    private final Map<Object, Integer> objectLineMap = new HashMap<>();

    public void addComponent(ComponentDeclaration component) {
        componentList.add(component);
    }

    public void addObject(Object object, int line) {
        objectLineMap.put(object, line);
    }

    // Symbol table
    SymbolTable symbolTable = new SymbolTable();

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void check() {
        try {
            String fileName = "test/semantic.txt";
            FileWriter test = new FileWriter(fileName);

            // Error Handling
            //checkIfVariableAlreadyDefined();

            // print Errors
            printErrors();

            test.append("Semantic Check : \n");
            for (String error : Errors) {
                test.append(error).append("\n");
            }

            test.flush();
            test.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printErrors() {
        if (!Errors.isEmpty()) {
            System.out.println("Semantic Check Errors:");
            for (String errors : Errors) {
                System.out.println(errors);
            }
        }
    }

    public void checkSelectorExists() {
        for (ComponentDeclaration component : componentList) {
            String className = component.getClassDeclaration().getName();
            int line = objectLineMap.getOrDefault(component, -1);

            ComponentMetadata metadata = component.getComponentMetadata();
            boolean hasSelector = false;

            if (metadata != null && metadata.getMetadataComponentPropertyList() != null) {
                for (ComponentMetadataProperty property : metadata.getMetadataComponentPropertyList()) {
                    if (property instanceof SelectorComponentProperty) {
                        hasSelector = true;

                        String value = ((SelectorComponentProperty) property).getString();
                        if (value.equals("\"\"")) {
                            System.err.println("Semantic Error: Component '" + className + "' has empty selector.");
                        }
                        break;
                    }
                }
            }

            if (!hasSelector) {
                System.err.println("Semantic Error: Component '" + className + "' is missing a selector.");
            }
        }
    }
}
