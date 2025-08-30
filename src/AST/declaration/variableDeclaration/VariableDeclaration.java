package AST.declaration.variableDeclaration;

import AST.helpers.Initialization;
import AST.helpers.Space;
import AST.helpers.VarHelper;
import AST.typeAnnotation.TypeAnnotation;
import AST.declaration.Declaration;

public class VariableDeclaration extends Declaration {
    private VarHelper varHelper;
    private String name;
    private TypeAnnotation typeAnnotation;
    private Initialization initialization;

    public VarHelper getVarHelper() {
        return varHelper;
    }

    public void setVarHelper(VarHelper varHelper) {
        this.varHelper = varHelper;
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("VariableDeclaration: {\n");

        Space.currentValue++;

        // Append varHelper
        if (varHelper != null) {
            stringBuilder.append("\t".repeat(Space.currentValue)).append(varHelper).append(",\n");
        }

        // Append name
        stringBuilder.append("\t".repeat(Space.currentValue)).append("name = ").append(name != null ? name : "").append(",\n");

        // Append typeAnnotation
        if (typeAnnotation != null) {
            stringBuilder.append(typeAnnotation).append(",\n");
        }

        // Append initialization
        if (initialization != null) {
            stringBuilder.append(initialization.toString()).append(",\n");
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

        if (this.varHelper != null) {
            stringBuilder.append(varHelper.convertToJS()).append(" ");
        }

        stringBuilder.append(name);

        if (this.initialization != null) {
            stringBuilder.append(" = ").append(initialization.convertToJS());
        }

        return stringBuilder.toString();
    }
}
