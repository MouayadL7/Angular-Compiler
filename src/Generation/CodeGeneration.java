package Generation;

import AST.program.Program;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CodeGeneration {
    private static final String HTML_TEMPLATE =
            "<!DOCTYPE html>\n" +
                    "<html lang=\"en\">\n" +
                    "<head>\n" +
                    "    <meta charset=\"UTF-8\">\n" +
                    "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "    <title>Generated Angular App</title>\n" +
                    "    <link rel=\"stylesheet\" href=\"styles.css\">\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "    <div id=\"app\">\n" +
                    "%s\n" +
                    "    </div>\n" +
                    "    <script src=\"script.js\"></script>\n" +
                    "</body>\n" +
                    "</html>";

    private static final String CSS_HEADER =
            "/* Generated CSS from Angular Compiler */\n" +
                    "\n" +
                    "body {\n" +
                    "    margin: 0;\n" +
                    "    padding: 20px;\n" +
                    "    font-family: Arial, sans-serif;\n" +
                    "}\n" +
                    "\n" +
                    "#app {\n" +
                    "    max-width: 1200px;\n" +
                    "    margin: 0 auto;\n" +
                    "}\n";

    private static final String JS_HEADER =
            "// Generated JavaScript from Angular Compiler\n" +
                    "document.addEventListener('DOMContentLoaded', function() {\n" +
                    "    const app = document.getElementById('app');\n" +
                    "\n" +
                    "    // Component data (simulate Angular component properties)\n" +
                    "    const componentData = {\n" +
                    "        // Add your data properties here\n" +
                    "    };\n" +
                    "\n" +
                    "    // Generated code:\n";

    private static final String JS_FOOTER =
            "});\n";

    public CodeGeneration() {}

    public void generateOutputFiles(Program program) {
        String outputDir = "src/OutputFiles/";

        try {
            Files.createDirectories(Paths.get(outputDir));
            System.out.println(program.convertToHTML());

            String htmlContent = String.format(HTML_TEMPLATE, program.convertToHTML());
            String cssContent = program.convertToCSS();
            String jsContent = program.convertToJS();

            writeFile(outputDir + "index.html", htmlContent);
            writeFile(outputDir + "styles.css", cssContent);
            writeFile(outputDir + "app.js", jsContent);

            // Generate additional files
            generatePackageJson(outputDir);
            generateReadme(outputDir);

            System.out.println("✅ Files generated successfully in: " + outputDir);
            System.out.println("📁 Generated files:");
            System.out.println("   - index.html (Main application)");
            System.out.println("   - styles.css (Compiled styles)");
            System.out.println("   - app.js (Application logic)");
            System.out.println("   - package.json (Project configuration)");
            System.out.println("   - README.md (Documentation)");

        } catch (IOException e) {
            System.err.println("❌ Error generating files: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void writeFile(String filePath, String content) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        }
    }

    private void generatePackageJson(String outputDir) throws IOException {
        StringBuilder packageJson = new StringBuilder();

        packageJson.append("{\n");
        packageJson.append("\t".repeat(1)).append("\"name\"").append(": ").append("\"angular-compiler-output\"").append(",\n");
        packageJson.append("\t".repeat(1)).append("\"version\"").append(": ").append("\"1.0.0\"").append(",\n");
        packageJson.append("\t".repeat(1)).append("\"description\"").append(": ").append("\"Generated from Angular Compiler\"").append(",\n");
        packageJson.append("\t".repeat(1)).append("\"main\"").append(": ").append("\"app.js\"").append(",\n");
        packageJson.append("\t".repeat(1)).append("\"scripts\"").append(": ").append("{\n");
        packageJson.append("\t".repeat(2)).append("\"start\"").append(": ").append("\"python -m http.server 8000\"").append(",\n");
        packageJson.append("\t".repeat(2)).append("\"serve\"").append(": ").append("\"live-server .\"").append(",\n");
        packageJson.append("\t".repeat(2)).append("\"build\"").append(": ").append("\"echo 'Build completed'\"").append("\n");
        packageJson.append("\t".repeat(1)).append("},\n");
        packageJson.append("\t".repeat(1)).append("\"devDependencies\"").append(": ").append("{\n");
        packageJson.append("\t".repeat(2)).append("\"live-server\"").append(": ").append("\"^1.2.2\"").append("\n");
        packageJson.append("\t".repeat(1)).append("}\n");
        packageJson.append("}\n");

        writeFile(outputDir + "package.json", packageJson.toString());
    }

    private void generateReadme(String outputDir) throws IOException {
        StringBuilder readme = new StringBuilder();

        readme.append("# Generated Angular Application").append("\n\n");
        readme.append("This application was generated from Angular TypeScript code using a custom compiler.").append("\n\n");
        readme.append("## File Structure").append("\n\n");
        readme.append("- `styles.css` - Compiled CSS styles from Angular components").append("\n\n");
        readme.append("- `app.js` - Compiled JavaScript logic and component behavior").append("\n\n");
        readme.append("- `package.json` - Project configuration").append("\n\n");
        readme.append("## Running the Application").append("\n\n");
        readme.append("1. Open `index.html` in a web browser").append("\n\n");
        readme.append("2. Or use a local server:").append("\n");
        readme.append("\t").append("```bash").append("\n");
        readme.append("\t").append("npm install -g live-server").append("\n");
        readme.append("\t").append("live-server .```").append("\n\n");
        readme.append("## Generated Features").append("\n\n");
        readme.append("- ✅ Component templates converted to HTML").append("\n");
        readme.append("- ✅ Angular bindings converted to vanilla JavaScript").append("\n");
        readme.append("- ✅ Event handlers and property bindings").append("\n");
        readme.append("- ✅ Basic routing support").append("\n");
        readme.append("- ✅ Structural directives (*ngIf, *ngFor)").append("\n");
        readme.append("- ✅ Interpolation expressions").append("\n");
        readme.append("- ✅ Component styling").append("\n\n");
        readme.append("## Notes").append("\n\n");
        readme.append("This is a compiled output from Angular TypeScript code. The original Angular features have been transpiled to work in vanilla HTML/CSS/JavaScript environment.").append("\n\n");

        writeFile(outputDir + "README.md", readme.toString());
    }
}
