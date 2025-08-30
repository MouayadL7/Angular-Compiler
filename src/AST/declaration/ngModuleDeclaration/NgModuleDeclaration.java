package AST.declaration.ngModuleDeclaration;

import AST.helpers.Space;
import AST.declaration.Declaration;
import AST.declaration.classDeclaration.ClassDeclaration;

public class NgModuleDeclaration extends Declaration {
    ModuleMetadata moduleMetadata;
    ClassDeclaration classDeclaration;

    public ModuleMetadata getModuleMetadata() {
        return moduleMetadata;
    }

    public void setModuleMetadata(ModuleMetadata moduleMetadata) {
        this.moduleMetadata = moduleMetadata;
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("NgModuleDeclaration: {\n");

        Space.currentValue++;
        // Append moduleMetadata
        if (moduleMetadata != null) {
            stringBuilder.append(moduleMetadata).append(",\n");
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
        return "";
    }

    @Override
    public String convertToCSS() {
        return "";
    }

    @Override
    public String convertToJS() {
        return "";
    }
}
