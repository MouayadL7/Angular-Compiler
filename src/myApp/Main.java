package myApp;

import AST.program.Program;
import ErrorHandling.SemanticCheckManager;
import Generation.CodeGeneration;
import Visitor.ASTVisitor;
import antlr.AngularLexer;
import antlr.AngularParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import static org.antlr.v4.runtime.CharStreams.fromFileName;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String source = "src/test/Final.txt";
        CharStream input = fromFileName(source);

        AngularLexer lexer = new AngularLexer(input);
        CommonTokenStream token = new CommonTokenStream(lexer);

        AngularParser parser = new AngularParser(token);
        AngularParser.ProgramContext tree = parser.program();

        ASTVisitor astVisitor = new ASTVisitor();
        Program program = (astVisitor.visitProgram(tree));

        SemanticCheckManager semanticCheckManager = new SemanticCheckManager (
                astVisitor.getSelectorSymbolTable(),
                astVisitor.getDuplicateSelectorSymbolTable(),
                astVisitor.getMissingTemplateSymbolTable(),
                astVisitor.getTemplateSymbolTable(),
                astVisitor.getImportSymbolTable()
        );

        CodeGeneration codeGeneration = new CodeGeneration();
        codeGeneration.generateOutputFiles(program);

        System.out.println(program);

       // semanticCheckManager.runChecks();
    }
}
