package utils.listeners;

import gen.PLHQLStatementsLexer;
import gen.PLHQLStatementsParser;
import org.antlr.runtime.tree.TreePatternParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;
import utils.BooleanExpressionMatcher;
import utils.TypeRepository;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ListenerUtils {

    private static final String TEMPLATES_FILE_PATH = "res/Templates.stg";
    static final String JOIN_LOOP_TEMPLATE_NAME = "joinLoopTemplate";
    static final String SINGLE_TABLE_SELECTION_TEMPLATE_NAME = "singleTableSelection";
    static final String MULTIPLE_JOINS_TEMPLATE_NAME = "multipleJoinsTemplate";
    static final String SELECTION_COLUMN_TEMPLATE = "selectionColumnTemplate";
    static final String ORDERING_COLUMNS_TEMPLATE_NAME = "orderingColumnTemplate";
    static final String ORDER_BY_STATEMENT_TEMPLATE = "orderByStatementTemplate";
    static final String MAP_REDUCE_TEMPLATE_NAME = "mapReduceTemplate";
    static final String RUBY_MAIN_CLASS_TEMPLATE = "rubyMainClassTemplate";
    static final String OUTER_JOIN_TEMPLATE = "OuterJoinTemplate";
    static final STGroupFile ST_GROUP_FILE = new STGroupFile(TEMPLATES_FILE_PATH);


    static boolean fromSelectClause(ParseTree parseTree) {
        ParseTree currentParent = parseTree.getParent();
        while (currentParent != null) {
            if (((RuleContext) currentParent).getRuleIndex() == PLHQLStatementsParser.RULE_select_stmt) {
                return true;
            }
            currentParent = currentParent.getParent();
        }
        return false;
    }

    static boolean checkDataMemberExistence(String columnName, ParseTree parseTree) {
        ParseTree currentParent = parseTree.getParent();
        while ((((RuleContext) currentParent).getRuleIndex()) != PLHQLStatementsParser.RULE_subselect_stmt) {
            currentParent = currentParent.getParent();
        }

        currentParent = ((PLHQLStatementsParser.Subselect_stmtContext) currentParent).from_clause();

        ArrayList<String> dataTypes = new ArrayList<>();
        for (int i = 0; i < currentParent.getChildCount(); i++) {
            getDataTypesFromNode(dataTypes, currentParent.getChild(i));
        }

        for (String dataType : dataTypes) {
            if (TypeRepository.dataMemberExists(dataType, columnName)) return true;
        }

        return false;

    }

    private static void getDataTypesFromNode(ArrayList<String> dataTypes, ParseTree currentNode) {
        if ((currentNode instanceof TerminalNode)) {
            if (((TerminalNode) currentNode).getSymbol().getType() == PLHQLStatementsLexer.L_ID) {
                dataTypes.add(currentNode.getText());
            }
        } else {
            for (int i = 0; i < currentNode.getChildCount(); i++) {
                getDataTypesFromNode(dataTypes, currentNode.getChild(i));
            }
        }
    }

    private static void getScopeSymbols(ArrayList<String> strings, ParseTree context) {
        if ((context instanceof TerminalNode)) {
            if (((TerminalNode) context).getSymbol().getType() == PLHQLStatementsLexer.L_ID) {
                strings.add(context.getText());
            }
        } else {
            for (int i = 0; i < context.getChildCount(); i++) {
                getScopeSymbols(strings, context.getChild(i));
            }
        }
    }

    public static void createRubyFile() {
        try {
            new File("Generated.rb").createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String getConversion(String type) {
        if (type.equalsIgnoreCase("INT")) {
            return ".to_i";
        } else if (type.equalsIgnoreCase("FLOAT")) {
            return ".to_f";
        } else {
            return "";
        }
    }

    static String getConversion(String whereCondition, String group, String type, ST termValueST) {
        if (type.equalsIgnoreCase("INT")) {
            termValueST.add("conversion", ".to_i");
        } else if (type.equalsIgnoreCase("FLOAT")) {
            termValueST.add("conversion", ".to_f");
        } else {
            termValueST.add("conversion", "");
        }
        whereCondition = whereCondition.replaceFirst(group, termValueST.render());
        return whereCondition;
    }

    static int getOverallSize(Stack<String> tables, PLHQLStatementsParser.Subselect_stmtContext ctx) {
        int count = 0;
        Object[] tablesArray = tables.toArray();
        for (Object currentString : tablesArray) {
            if (!BooleanExpressionMatcher.matches(String.valueOf(currentString))) {
                count += TypeRepository.getColumnsCount(String.valueOf(currentString));

            }
        }
        return count;
    }

    static boolean isSubselectStatement(ParseTree currentParent) {
        while (currentParent != null) {
            if (((RuleContext) currentParent).getRuleIndex() == PLHQLStatementsParser.RULE_subselect_stmt)
                return true;
            currentParent = currentParent.getParent();
        }
        return false;
    }

    static String getSubselectStmtAlias(ParseTree currentParent) {
        while (currentParent != null) {
            if (((RuleContext) currentParent).getRuleIndex() == PLHQLStatementsParser.RULE_from_subselect_clause)
                return ((PLHQLStatementsParser.From_subselect_clauseContext) currentParent).from_alias_clause().getText();
            currentParent = currentParent.getParent();
        }
        return "";
    }

    static void checkSemanticError(PLHQLStatementsParser.From_clauseContext ctx, String dataTypeName) {
        if (!TypeRepository.dataTypeExists(dataTypeName)) {
            SyntaxSemanticErrorListener.INSTANCE.semanticError(
                    ctx.start.getLine(),
                    "Usage of undefined DataType: " + dataTypeName); //Log semantic error
        }
    }

    static void runRubyProgram() {
        try {
            Process process = Runtime.getRuntime().exec("ruby C:/Users/ASUS/Documents/Github/pl-sql-compiler/ruby/GeneratedMain.rb");
            process.waitFor();
            BufferedReader processIn = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = processIn.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*
     * Semantic Error Section
     */

    /**
     * Check usage of unassigned variable in c function
     *
     * @param ctx : variable's context used to access c_function rule contents
     */
    static void checkVariableAssignment(PLHQLStatementsParser.Expr_atomContext ctx) {
        if (ctx.ident() == null) return;
        //get unassigned variables from c_function rule and check if the atom exist in it
        String variableName = ctx.ident().getText();
        int variableLine = ctx.start.getLine();
        RuleContext currentParent = ctx.parent;
        while (currentParent != null) {
            if (currentParent.getRuleIndex() == PLHQLStatementsParser.RULE_c_function) {
                if (((PLHQLStatementsParser.C_functionContext) currentParent).unassignedVariables.contains(variableName)) {
                    SyntaxSemanticErrorListener.INSTANCE.warningMessage(variableLine, "Usage of unassigned variable (" + variableName + ")");
                }
                return;
            }
            currentParent = currentParent.parent;
        }
    }

    static void checkReturnStatementsType(PLHQLStatementsParser.C_functionContext ctx) {
        String functionReturnType = ctx.dtype().getText();
        for (String returnStatementValue : ctx.returnStatements) {
            if (!returnTypeMatch(functionReturnType, returnStatementValue, ctx)) {
                SyntaxSemanticErrorListener.INSTANCE.semanticError(ctx.start.getLine(), "Incompatible return type (Required: " + functionReturnType + " , found: " + getExpressionType(functionReturnType, returnStatementValue, ctx) + ")");
            }
        }
    }

    private static boolean returnTypeMatch(String returnType, String returnStatement, PLHQLStatementsParser.C_functionContext ctx) {
        return returnType.equalsIgnoreCase(getExpressionType(returnType, returnStatement, ctx));
    }

    private static String getExpressionType(String returnType, String expression, PLHQLStatementsParser.C_functionContext ctx) {
        //Evaluate Expression
        String regex = "\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(expression);
        while (matcher.find()) {
            switch (getVariableType(matcher.group(), ctx.functionVariables)) {
                case "INT":
                    expression = expression.replace(matcher.group(), "1");
                    break;
                case "FLOAT":
                    expression = expression.replace(matcher.group(), "1.0");
                    break;
                case "STRING":
                    expression = expression.replace(matcher.group(), "\"1\"");
                    break;
                case "BOOL":
                    expression = expression.replace(matcher.group(), "true");
                    break;
            }
        }
        if (returnType.equalsIgnoreCase("bool")) {
            if (BooleanExpressionMatcher.matches(expression)) return "bool";
        }
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            Object result = engine.eval(expression);
            if (result instanceof Integer) return "int";
            else if (result instanceof Float) return "float";
            else if (result instanceof String) return "string";
            else if (result instanceof Boolean) return "bool";
            else if (BooleanExpressionMatcher.matches(expression)) return "bool";
            else return "invalid expression";
        } catch (ScriptException e) {
            e.printStackTrace();
            return "invalid expression";
        }
    }

    private static String getVariableType(String variableName, ArrayList<Pair<String, String>> variables) {
        for (Pair<String, String> pair : variables) {
            if (pair.b.equalsIgnoreCase(variableName)) return pair.a.toUpperCase();
        }
        return "null";
    }

    static void validateGroupingColumns(PLHQLStatementsParser.Subselect_stmtContext ctx) {
        if (ctx.selectionColumns.contains("*") || ctx.groupByColumns.isEmpty()) return;
        List<String> filteredSelectionColumns = ctx.selectionColumns.stream()
                .filter(ListenerUtils::matchesColumnSyntax)
                .collect(Collectors.toList());
        for (String column : filteredSelectionColumns) {
            if (!ctx.groupByColumns.contains(column)){
                SyntaxSemanticErrorListener.INSTANCE.semanticError(ctx.start.getLine(), "Everything in select statement should be in grouping (" + column + ")");
            }
        }
    }

    static boolean matchesColumnSyntax(String s){
        String regex = "(\\w)+\\.(\\w)+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    static boolean fromDeclarationStatement(ParseTree parseTree){
        ParseTree currentParent = parseTree.getParent();
        while (currentParent != null) {
            if (((RuleContext) currentParent).getRuleIndex() == PLHQLStatementsParser.RULE_general_delcaration_c_stmt) {
                return true;
            }
            currentParent = currentParent.getParent();
        }
        return false;
    }
}
