package AST.program.declaration.variableDeclaration;

import AST.Space;
import AST.helpers.Initialization;
import AST.typeAnnotation.TypeAnnotation;
import AST.program.declaration.Declaration;

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
}
