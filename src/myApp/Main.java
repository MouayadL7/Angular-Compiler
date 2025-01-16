package myApp;

import AST.program.Program;
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
        String source = "src/test/Dynamic-Counter.txt";
        CharStream input = fromFileName(source);

        AngularLexer lexer = new AngularLexer(input);
        CommonTokenStream token = new CommonTokenStream(lexer);

        AngularParser parser = new AngularParser(token);
        AngularParser.ProgramContext tree = parser.program();

        ASTVisitor astVisitor = new ASTVisitor();
        Program program = (astVisitor.visitProgram(tree));

        System.out.println(program);
    //    System.out.println(astVisitor.symbolTable);
    }
}
