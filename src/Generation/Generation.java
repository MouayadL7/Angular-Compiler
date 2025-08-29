package Generation;

import AST.program.Program;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Generation {
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
                    "/* Add your custom styles below */\n" +
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

    public Generation() {}

    public void generateOutputFiles(Program program) {
        String outputDir = "src/OutputFiles/";

        try {
            Files.createDirectories(Paths.get(outputDir));

            String htmlContent = String.format(HTML_TEMPLATE, program.convertToHTML());
            String cssContent = CSS_HEADER + program.convertToCSS();
            String jsContent = JS_HEADER + program.convertToJS() + JS_FOOTER;

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
        packageJson.append("\t".repeat(1)).append("\"name\"").append("\": \"").append("\"angular-compiler-output\"").append(",\n");
        packageJson.append("\t".repeat(1)).append("\"version\"").append(": ").append("\"1.0.0\"").append(",\n");
        packageJson.append("\t".repeat(1)).append("\"description\"").append(": ").append("\"Generated from Angular Compiler\"").append(",\n");
        packageJson.append("\t".repeat(1)).append("\"main\"").append(": ").append("\"app.js\"").append(",\n");
        packageJson.append("\t".repeat(1)).append("\"scripts\"").append(": ").append("{\n");
        packageJson.append("\t".repeat(2)).append("\"start\"").append(": ").append("\"python -m http.server 8000\"").append(",\n");
        packageJson.append("\t".repeat(2)).append("\"serve\"").append(": ").append("\"live-server .\"").append(",\n");
        packageJson.append("\t".repeat(2)).append("\"build\"").append(": ").append("\"echo 'Build completed'\"").append(",\n");
        packageJson.append("\t".repeat(1)).append("},\n");
        packageJson.append("\t".repeat(1)).append("\"devDependencies\"").append(": ").append("{\n");
        packageJson.append("\t".repeat(2)).append("\"live-server\"").append(": ").append("\"^1.2.2\"").append("\n");
        packageJson.append("\t".repeat(1)).append("},\n");
        packageJson.append("},\n");

        writeFile(outputDir + "package.json", packageJson.toString());
    }

    private void generateReadme(String outputDir) throws IOException {
        StringBuilder readme = new StringBuilder();
        readme.append("# Generated Angular Application").append("\n\n");

        readme.append("This application was generated from Angular TypeScript code using a custom compiler.").append("\n\n");

        readme.append("## File Structure").append("\n\n");

        
- `styles.css` - Compiled CSS styles from Angular components
- `app.js` - Compiled JavaScript logic and component behavior
- `package.json` - Project configuration

## Running the Application

1. Open `index.html` in a web browser
2. Or use a local server:
   ```bash
   npm install -g live-server
   live-server .
   ```

## Generated Features

- ✅ Component templates converted to HTML
- ✅ Angular bindings converted to vanilla JavaScript
- ✅ Event handlers and property bindings
- ✅ Basic routing support
- ✅ Structural directives (*ngIf, *ngFor)
- ✅ Interpolation expressions
- ✅ Component styling

## Notes

This is a compiled output from Angular TypeScript code. The original Angular features have been transpiled to work in vanilla HTML/CSS/JavaScript environment.
""";
        writeFile(outputDir + "README.md", readme);
    }
}
