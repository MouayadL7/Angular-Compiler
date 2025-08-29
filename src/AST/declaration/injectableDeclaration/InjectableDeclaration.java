package AST.declaration.injectableDeclaration;

import AST.helpers.Space;
import AST.declaration.Declaration;
import AST.declaration.classDeclaration.ClassDeclaration;

public class InjectableDeclaration extends Declaration {
    InjectableMetadata injectableMetadata;
    ClassDeclaration classDeclaration;

    public InjectableMetadata getInjectableMetadata() {
        return injectableMetadata;
    }

    public void setInjectableMetadata(InjectableMetadata injectableMetadata) {
        this.injectableMetadata = injectableMetadata;
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("InjectableDeclaration: {\n");

        Space.currentValue++;
        // Append injectableMetadata
        if (injectableMetadata != null) {
            stringBuilder.append(injectableMetadata).append(",\n");
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
