package AST.declaration.classDeclaration;

import AST.Node;
import AST.helpers.Space;
import AST.helpers.AccessModifier;
import AST.helpers.Decorator;
import AST.helpers.Initialization;
import AST.typeAnnotation.TypeAnnotation;

import java.util.ArrayList;
import java.util.List;

public class PropertyDeclaration extends Node {
    private List<Decorator> decoratorList;
    private AccessModifier accessModifier;
    private String name;
    private TypeAnnotation typeAnnotation;
    private Initialization initialization;

    public PropertyDeclaration() {
        this.decoratorList = new ArrayList<>();
    }

    public List<Decorator>  getDecoratorList() {
        return decoratorList;
    }

    public void setDecoratorList(List<Decorator> decoratorList) {
        this.decoratorList = decoratorList;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(AccessModifier accessModifier) {
        this.accessModifier = accessModifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeAnnotation getTypeAnnotation() {
        return typeAnnotation;
    }

    public void setTypeAnnotation(TypeAnnotation typeAnnotation) {
        this.typeAnnotation = typeAnnotation;
    }

    public Initialization getInitialization() {
        return initialization;
    }

    public void setInitialization(Initialization initialization) {
        this.initialization = initialization;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("PropertyDeclaration: {\n");

        Space.currentValue++;

        // Append decoratorList
        if (!decoratorList.isEmpty()) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append("decoratorList: [\n");
            for (Decorator property : decoratorList) {
                stringBuilder.append(property).append(",\n");
            }
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
        }

        // Append accessModifier
        if (accessModifier != null) {
            stringBuilder.append(accessModifier).append(",\n");
        }

        // Append name
        stringBuilder.append("\t".repeat(Space.currentValue)).append("name = ").append(name != null ? name : "").append(",\n");

        // Append typeAnnotation
        if (typeAnnotation != null) {
            stringBuilder.append(typeAnnotation).append(",\n");
        }

        // Append initialization
        if (initialization != null) {
            stringBuilder.append(initialization).append(",\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");

        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() {
        return "";
    }

    @Override
    public String convertToCSS() {
        return "";
    }

    @Override
    public String convertToJS() {
        StringBuilder stringBuilder = new StringBuilder();

        if (this.initialization != null) {
            stringBuilder.append("this.").append(name).append(" = ").append(this.initialization.convertToJS());
        }

        stringBuilder.append(";");
        return stringBuilder.toString();
    }
}
