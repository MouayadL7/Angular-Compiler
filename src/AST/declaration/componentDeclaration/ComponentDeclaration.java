package AST.declaration.componentDeclaration;

import AST.helpers.Space;
import AST.declaration.Declaration;
import AST.declaration.classDeclaration.ClassDeclaration;

public class ComponentDeclaration extends Declaration {
    ComponentMetadata componentMetadata;
    ClassDeclaration classDeclaration;

    public ComponentMetadata getComponentMetadata() {
        return componentMetadata;
    }

    public void setComponentMetadata(ComponentMetadata componentMetadata) {
        this.componentMetadata = componentMetadata;
    }

    public ClassDeclaration getClassDeclaration() {
        return classDeclaration;
    }

    public void setClassDeclaration(ClassDeclaration classDeclaration) {
        this.classDeclaration = classDeclaration;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t".repeat(Space.currentValue)).append("ComponentDeclaration: {\n");

        Space.currentValue++;
        // Append componentMetadata
        if (componentMetadata != null) {
            stringBuilder.append(componentMetadata).append(",\n");
        }

        // Append classDeclaration
        if (classDeclaration != null) {
            stringBuilder.append(classDeclaration).append(",\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");

        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() {
        return null;
    }

    @Override
    public String convertToCSS() {
        return null;
    }

    @Override
    public String convertToJS() {
        return null;
    }
}
