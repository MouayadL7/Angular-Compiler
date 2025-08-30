package AST.program;

import AST.HTML.attributeHTML.AttributeHTML;
import AST.Node;
import AST.declaration.componentDeclaration.ComponentDeclaration;
import AST.helpers.Space;
import AST.declaration.Declaration;
import AST.statement.importStatement.ImportStatement;
import AST.statement.Statement;

import java.util.ArrayList;
import java.util.List;

public class Program extends Node {
    private List<ImportStatement> importStatementList;
    private List<Declaration> declarationList;
    private List<Statement> statementList;

    public Program() {
        this.importStatementList = new ArrayList<>();
        this.declarationList = new ArrayList<>();
        this.statementList = new ArrayList<>();
    }

    public List<ImportStatement> getImportStatementList() {
        return importStatementList;
    }

    public void setImportStatementList(List<ImportStatement> importStatementList) {
        this.importStatementList = importStatementList;
    }

    public List<Declaration> getDeclarationList() {
        return declarationList;
    }

    public void setDeclarationList(List<Declaration> declarationList) {
        this.declarationList = declarationList;
    }

    public List<Statement> getStatementList() {
        return statementList;
    }

    public void setStatementList(List<Statement> statementList) {
        this.statementList = statementList;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Program {\n");

        // Append import statement list
        if (!importStatementList.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("ImportStatementList: [\n");
            Space.currentValue++;
            for (ImportStatement importStatement : importStatementList) {
                stringBuilder.append(importStatement.toString()).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("],\n");
            Space.currentValue--;
        }

        // Append declaration list
        if (!declarationList.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Declarations: [\n");
            Space.currentValue++;
            for (Declaration declaration : declarationList) {
                stringBuilder.append(declaration.toString()).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("],\n");
            Space.currentValue--;
        }

        // Append statement list
        if (!statementList.isEmpty()) {
            Space.currentValue++;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("Statements: [\n");
            Space.currentValue++;
            for (Statement statement : statementList) {
                stringBuilder.append(statement.toString()).append(",\n");
            }
            Space.currentValue--;
            stringBuilder.append("\t".repeat(Space.currentValue)).append("]\n");
            Space.currentValue--;
        }

        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public String convertToHTML() {
        StringBuilder html = new StringBuilder();

        // Process declarations for components that might contain templates
        for (Declaration declaration : declarationList) {
            if (declaration instanceof ComponentDeclaration) {
                String declarationHtml = declaration.convertToHTML();
                if (!declarationHtml.isEmpty()) {
                    html.append(declarationHtml).append("\n");
                }
            }
        }

        return html.toString();
    }

    @Override
    public String convertToCSS() {
        StringBuilder css = new StringBuilder();

        css.append("/* Global Styles */\n" +
                ":host {\n" +
                "      display: block;\n" +
                "    }\n" +
                "* {\n" +
                "  box-sizing: border-box;\n" +
                "  margin: 0;\n" +
                "  padding: 0;\n" +
                "}\n" +
                "\n" +
                "body {\n" +
                "  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n" +
                "}\n" +
                "\n" +
                ".container {\n" +
                "  max-width: 1200px;\n" +
                "  margin: 0 auto;\n" +
                "  padding: 20px;\n" +
                "  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n" +
                "  background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);\n" +
                "  min-height: 100vh;\n" +
                "}\n" +
                "\n" +
                ".btn-primary {\n" +
                "      background: linear-gradient(45deg, #667eea, #764ba2);\n" +
                "      color: white;\n" +
                "      border: none;\n" +
                "      padding: 12px 25px;\n" +
                "      border-radius: 25px;\n" +
                "      font-size: 16px;\n" +
                "      font-weight: bold;\n" +
                "      cursor: pointer;\n" +
                "      transition: all 0.3s ease;\n" +
                "      box-shadow: 0 4px 15px rgba(102, 126, 234, 0.4);\n" +
                "    }\n" +
                "\n" +
                "    .btn-primary:hover {\n" +
                "      transform: translateY(-2px);\n" +
                "      box-shadow: 0 8px 25px rgba(102, 126, 234, 0.6);\n" +
                "    }\n" +
                "\n" +
                "    .btn-secondary {\n" +
                "      background: #6c757d;\n" +
                "      color: white;\n" +
                "      border: none;\n" +
                "      padding: 12px 25px;\n" +
                "      border-radius: 25px;\n" +
                "      font-size: 16px;\n" +
                "      cursor: pointer;\n" +
                "      transition: all 0.3s ease;\n" +
                "    }\n" +
                "\n" +
                "    .btn-secondary:hover {\n" +
                "      background: #5a6268;\n" +
                "      transform: translateY(-1px);\n" +
                "    }\n" +
                "\n" +
                "    .btn-back {\n" +
                "      background: #f8f9fa;\n" +
                "      border: 2px solid #dee2e6;\n" +
                "      padding: 10px 20px;\n" +
                "      border-radius: 20px;\n" +
                "      cursor: pointer;\n" +
                "      font-size: 16px;\n" +
                "      transition: all 0.3s ease;\n" +
                "    }\n" +
                "\n" +
                "    .btn-back:hover {\n" +
                "      background: #e9ecef;\n" +
                "      transform: translateX(-3px);\n" +
                "    }\n" +
                "\n" +
                "    .btn-edit {\n" +
                "      background: linear-gradient(45deg, #ffc107, #fd7e14);\n" +
                "      color: white;\n" +
                "      border: none;\n" +
                "      padding: 8px 20px;\n" +
                "      border-radius: 20px;\n" +
                "      cursor: pointer;\n" +
                "      font-weight: bold;\n" +
                "      transition: all 0.3s ease;\n" +
                "    }\n" +
                "\n" +
                "    .btn-edit:hover {\n" +
                "      transform: translateY(-2px);\n" +
                "      box-shadow: 0 4px 15px rgba(255, 193, 7, 0.4);\n" +
                "    }\n" +
                "\n" +
                "    .btn-delete {\n" +
                "      background: linear-gradient(45deg, #dc3545, #c82333);\n" +
                "      color: white;\n" +
                "      border: none;\n" +
                "      padding: 8px 20px;\n" +
                "      border-radius: 20px;\n" +
                "      cursor: pointer;\n" +
                "      font-weight: bold;\n" +
                "      transition: all 0.3s ease;\n" +
                "    }\n" +
                "\n" +
                "    .btn-delete:hover {\n" +
                "      transform: translateY(-2px);\n" +
                "      box-shadow: 0 4px 15px rgba(220, 53, 69, 0.4);\n" +
                "    }\n" +
                "\n" +
                "    .header {\n" +
                "      background: white;\n" +
                "      padding: 30px;\n" +
                "      border-radius: 15px;\n" +
                "      box-shadow: 0 10px 30px rgba(0,0,0,0.1);\n" +
                "      margin-bottom: 30px;\n" +
                "      display: flex;\n" +
                "      justify-content: space-between;\n" +
                "      align-items: center;\n" +
                "      flex-wrap: wrap;\n" +
                "      gap: 20px;\n" +
                "    }\n" +
                "\n" +
                "    .header h1 {\n" +
                "      color: #333;\n" +
                "      font-size: 2.5em;\n" +
                "      font-weight: bold;\n" +
                "    }\n" +
                "\n" +
                "    .header-actions {\n" +
                "      display: flex;\n" +
                "      gap: 15px;\n" +
                "      align-items: center;\n" +
                "      flex-wrap: wrap;\n" +
                "    }\n" +
                "\n" +
                "    .search-box {\n" +
                "      position: relative;\n" +
                "    }\n" +
                "\n" +
                "    .search-input {\n" +
                "      padding: 12px 20px;\n" +
                "      border: 2px solid #e1e8ed;\n" +
                "      border-radius: 25px;\n" +
                "      font-size: 16px;\n" +
                "      width: 300px;\n" +
                "      outline: none;\n" +
                "      transition: all 0.3s ease;\n" +
                "    }\n" +
                "\n" +
                "    .search-input:focus {\n" +
                "      border-color: #667eea;\n" +
                "      box-shadow: 0 0 0 3px rgba(102, 126, 234, 0.1);\n" +
                "    }\n" +
                "\n" +
                "    .products-grid {\n" +
                "      display: grid;\n" +
                "      grid-template-columns: repeat(auto-fill, minmax(320px, 1fr));\n" +
                "      gap: 25px;\n" +
                "    }\n" +
                "\n" +
                "    .product-card {\n" +
                "      background: white;\n" +
                "      border-radius: 20px;\n" +
                "      overflow: hidden;\n" +
                "      box-shadow: 0 10px 30px rgba(0,0,0,0.1);\n" +
                "      transition: all 0.3s ease;\n" +
                "      cursor: pointer;\n" +
                "    }\n" +
                "\n" +
                "    .product-card:hover {\n" +
                "      transform: translateY(-10px);\n" +
                "      box-shadow: 0 20px 40px rgba(0,0,0,0.2);\n" +
                "    }\n" +
                "\n" +
                "    .product-image {\n" +
                "      position: relative;\n" +
                "      height: 220px;\n" +
                "      overflow: hidden;\n" +
                "    }\n" +
                "\n" +
                "    .product-image img {\n" +
                "      width: 100%;\n" +
                "      height: 100%;\n" +
                "      object-fit: cover;\n" +
                "      transition: transform 0.3s ease;\n" +
                "    }\n" +
                "\n" +
                "    .product-card:hover .product-image img {\n" +
                "      transform: scale(1.1);\n" +
                "    }\n" +
                "\n" +
                "    .product-price {\n" +
                "      position: absolute;\n" +
                "      top: 15px;\n" +
                "      right: 15px;\n" +
                "      background: linear-gradient(45deg, #28a745, #20c997);\n" +
                "      color: white;\n" +
                "      padding: 8px 15px;\n" +
                "      border-radius: 20px;\n" +
                "      font-weight: bold;\n" +
                "      font-size: 16px;\n" +
                "    }\n" +
                "\n" +
                "    .product-info {\n" +
                "      padding: 25px;\n" +
                "    }\n" +
                "\n" +
                "    .product-info h3 {\n" +
                "      color: #333;\n" +
                "      font-size: 1.4em;\n" +
                "      margin-bottom: 10px;\n" +
                "      font-weight: bold;\n" +
                "    }\n" +
                "\n" +
                "    .product-info p {\n" +
                "      color: #666;\n" +
                "      line-height: 1.6;\n" +
                "    }\n" +
                "\n" +
                "    .empty-state {\n" +
                "      text-align: center;\n" +
                "      padding: 80px 20px;\n" +
                "      background: white;\n" +
                "      border-radius: 20px;\n" +
                "      box-shadow: 0 10px 30px rgba(0,0,0,0.1);\n" +
                "      grid-column: 1 / -1;\n" +
                "    }\n" +
                "\n" +
                "    .empty-icon {\n" +
                "      font-size: 4em;\n" +
                "      margin-bottom: 20px;\n" +
                "    }\n" +
                "\n" +
                "    .empty-state h3 {\n" +
                "      color: #333;\n" +
                "      font-size: 1.8em;\n" +
                "      margin-bottom: 10px;\n" +
                "    }\n" +
                "\n" +
                "    .empty-state p {\n" +
                "      color: #666;\n" +
                "      margin-bottom: 30px;\n" +
                "      font-size: 1.1em;\n" +
                "    }\n" +
                "\n" +
                "    @media (max-width: 768px) {\n" +
                "      .header {\n" +
                "        flex-direction: column;\n" +
                "        text-align: center;\n" +
                "      }\n" +
                "\n" +
                "      .header-actions {\n" +
                "        width: 100%;\n" +
                "        justify-content: center;\n" +
                "      }\n" +
                "\n" +
                "      .search-input {\n" +
                "        width: 100%;\n" +
                "        max-width: 300px;\n" +
                "      }\n" +
                "\n" +
                "      .products-grid {\n" +
                "        grid-template-columns: 1fr;\n" +
                "      }\n" +
                "    }\n" +
                "\n" +
                "    .product-form {\n" +
                "      background: white;\n" +
                "      border-radius: 20px;\n" +
                "      box-shadow: 0 10px 30px rgba(0,0,0,0.1);\n" +
                "      overflow: hidden;\n" +
                "    }\n" +
                "\n" +
                "    .form-header {\n" +
                "      padding: 30px;\n" +
                "      border-bottom: 1px solid #f1f1f1;\n" +
                "      display: flex;\n" +
                "      align-items: center;\n" +
                "      gap: 20px;\n" +
                "    }\n" +
                "\n" +
                "    .form-header h2 {\n" +
                "      color: #333;\n" +
                "      font-size: 2em;\n" +
                "      font-weight: bold;\n" +
                "    }\n" +
                "\n" +
                "    .form-content {\n" +
                "      padding: 40px;\n" +
                "    }\n" +
                "\n" +
                "    .form-group {\n" +
                "      margin-bottom: 25px;\n" +
                "    }\n" +
                "\n" +
                "    .form-group label {\n" +
                "      display: block;\n" +
                "      color: #333;\n" +
                "      font-weight: bold;\n" +
                "      margin-bottom: 8px;\n" +
                "      font-size: 1.1em;\n" +
                "    }\n" +
                "\n" +
                "    .form-input, .form-textarea {\n" +
                "      width: 100%;\n" +
                "      padding: 15px 20px;\n" +
                "      border: 2px solid #e1e8ed;\n" +
                "      border-radius: 10px;\n" +
                "      font-size: 16px;\n" +
                "      outline: none;\n" +
                "      transition: all 0.3s ease;\n" +
                "    }\n" +
                "\n" +
                "    .form-input:focus, .form-textarea:focus {\n" +
                "      border-color: #667eea;\n" +
                "      box-shadow: 0 0 0 3px rgba(102, 126, 234, 0.1);\n" +
                "    }\n" +
                "\n" +
                "    .form-textarea {\n" +
                "      resize: vertical;\n" +
                "      min-height: 120px;\n" +
                "      font-family: inherit;\n" +
                "    }\n" +
                "\n" +
                "    .image-preview {\n" +
                "      margin-top: 15px;\n" +
                "    }\n" +
                "\n" +
                "    .image-preview img {\n" +
                "      width: 150px;\n" +
                "      height: 150px;\n" +
                "      object-fit: cover;\n" +
                "      border-radius: 10px;\n" +
                "      border: 3px solid #f1f1f1;\n" +
                "    }\n" +
                "\n" +
                "    .form-actions {\n" +
                "      display: flex;\n" +
                "      gap: 15px;\n" +
                "      margin-top: 40px;\n" +
                "    }\n" +
                "\n" +
                "    @media (max-width: 768px) {\n" +
                "      .form-content {\n" +
                "        padding: 20px;\n" +
                "      }\n" +
                "\n" +
                "      .form-actions {\n" +
                "        flex-direction: column;\n" +
                "      }\n" +
                "    }\n" +
                "\n" +
                "    .product-details {\n" +
                "      background: white;\n" +
                "      border-radius: 20px;\n" +
                "      box-shadow: 0 10px 30px rgba(0,0,0,0.1);\n" +
                "      overflow: hidden;\n" +
                "    }\n" +
                "\n" +
                "    .details-header {\n" +
                "      padding: 30px;\n" +
                "      border-bottom: 1px solid #f1f1f1;\n" +
                "      display: flex;\n" +
                "      justify-content: space-between;\n" +
                "      align-items: center;\n" +
                "    }\n" +
                "\n" +
                "    .details-actions {\n" +
                "      display: flex;\n" +
                "      gap: 10px;\n" +
                "    }\n" +
                "\n" +
                "    .details-content {\n" +
                "      display: grid;\n" +
                "      grid-template-columns: 1fr 1fr;\n" +
                "      gap: 40px;\n" +
                "      padding: 40px;\n" +
                "    }\n" +
                "\n" +
                "    .details-image img {\n" +
                "      width: 100%;\n" +
                "      height: 400px;\n" +
                "      object-fit: cover;\n" +
                "      border-radius: 15px;\n" +
                "    }\n" +
                "\n" +
                "    .details-info h2 {\n" +
                "      color: #333;\n" +
                "      font-size: 2.5em;\n" +
                "      margin-bottom: 20px;\n" +
                "      font-weight: bold;\n" +
                "    }\n" +
                "\n" +
                "    .price-tag {\n" +
                "      background: linear-gradient(45deg, #28a745, #20c997);\n" +
                "      color: white;\n" +
                "      padding: 15px 25px;\n" +
                "      border-radius: 25px;\n" +
                "      font-size: 1.5em;\n" +
                "      font-weight: bold;\n" +
                "      display: inline-block;\n" +
                "      margin-bottom: 30px;\n" +
                "    }\n" +
                "\n" +
                "    .description {\n" +
                "      margin-bottom: 30px;\n" +
                "    }\n" +
                "\n" +
                "    .description h4 {\n" +
                "      color: #333;\n" +
                "      font-size: 1.3em;\n" +
                "      margin-bottom: 10px;\n" +
                "      font-weight: bold;\n" +
                "    }\n" +
                "\n" +
                "    .description p {\n" +
                "      color: #666;\n" +
                "      line-height: 1.8;\n" +
                "      font-size: 1.1em;\n" +
                "    }\n" +
                "\n" +
                "    .product-meta {\n" +
                "      background: #f8f9fa;\n" +
                "      padding: 20px;\n" +
                "      border-radius: 15px;\n" +
                "    }\n" +
                "\n" +
                "    .meta-item {\n" +
                "      display: flex;\n" +
                "      justify-content: space-between;\n" +
                "      margin-bottom: 10px;\n" +
                "    }\n" +
                "\n" +
                "    .meta-item .label {\n" +
                "      font-weight: bold;\n" +
                "      color: #333;\n" +
                "    }\n" +
                "\n" +
                "    .meta-item .value {\n" +
                "      color: #666;\n" +
                "    }\n" +
                "\n" +
                "    .status-available {\n" +
                "      color: #28a745 !important;\n" +
                "      font-weight: bold !important;\n" +
                "    }\n" +
                "\n" +
                "    @media (max-width: 768px) {\n" +
                "      .details-content {\n" +
                "        grid-template-columns: 1fr;\n" +
                "        gap: 20px;\n" +
                "        padding: 20px;\n" +
                "      }\n" +
                "\n" +
                "      .details-header {\n" +
                "        flex-direction: column;\n" +
                "        gap: 15px;\n" +
                "        align-items: stretch;\n" +
                "      }\n" +
                "\n" +
                "      .details-actions {\n" +
                "        justify-content: center;\n" +
                "      }\n" +
                "    }");

        return css.toString();
    }

    @Override
    public String convertToJS() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Declaration declaration : declarationList) {
            String declarationJs = declaration.convertToJS();
            if (!declarationJs.isEmpty()) {
                stringBuilder.append(declarationJs).append("\n\n");
            }
        }

        return stringBuilder.toString();
    }
}
