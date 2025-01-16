package AST.declaration.pipeDeclaration;

import AST.helpers.Space;
import AST.declaration.Declaration;
import AST.declaration.classDeclaration.ClassDeclaration;

public class PipeDeclaration extends Declaration {
    PipeMetadata pipeMetadata;
    ClassDeclaration classDeclaration;

    public PipeMetadata getPipeMetadata() {
        return pipeMetadata;
    }

    public void setPipeMetadata(PipeMetadata pipeMetadata) {
        this.pipeMetadata = pipeMetadata;
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
        stringBuilder.append("\t".repeat(Space.currentValue)).append("PipeDeclaration: {\n");

        Space.currentValue++;
        // Append pipeMetadata
        if (pipeMetadata != null) {
            stringBuilder.append(pipeMetadata).append(",\n");
        }

        // Append classDeclaration
        if (classDeclaration != null) {
            stringBuilder.append(classDeclaration).append(",\n");
        }

        Space.currentValue--;
        stringBuilder.append("\t".repeat(Space.currentValue)).append("}");

        return stringBuilder.toString();
    }
}
