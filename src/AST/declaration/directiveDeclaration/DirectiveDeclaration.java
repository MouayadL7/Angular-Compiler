package AST.declaration.directiveDeclaration;

import AST.helpers.Space;
import AST.declaration.Declaration;
import AST.declaration.classDeclaration.ClassDeclaration;

public class DirectiveDeclaration extends Declaration {
    DirectiveMetadata directiveMetadata;
    ClassDeclaration classDeclaration;

    public DirectiveMetadata getDirectiveMetadata() {
        return directiveMetadata;
    }

    public void setDirectiveMetadata(DirectiveMetadata directiveMetadata) {
        this.directiveMetadata = directiveMetadata;
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("DirectiveDeclaration: {\n");

        Space.currentValue++;
        // Append directiveMetadata
        if (directiveMetadata != null) {
            stringBuilder.append(directiveMetadata).append(",\n");
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
