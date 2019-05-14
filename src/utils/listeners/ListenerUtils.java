package utils.listeners;

import gen.PLHQLStatementsLexer;
import gen.PLHQLStatementsParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;
import utils.BooleanExpressionMatcher;
import utils.TypeRepository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import java.util.function.Consumer;

public class ListenerUtils {

    private static final String TEMPLATES_FILE_PATH = "res/Templates.stg";
    static final String JOIN_LOOP_TEMPLATE_NAME = "joinLoopTemplate";
    static final String LEFT_RIGHT_JOIN_TEMPLATE_NAME = "leftRightJoinTemplate";
    static final String SINGLE_TABLE_SELECTION_TEMPLATE_NAME = "singleTableSelection";
    static final String MULTIPLE_JOINS_TEMPLATE_NAME = "multipleJoinsTemplate";
    static final String SELECTION_COLUMN_TEMPLATE = "selectionColumnTemplate";
    static final STGroupFile ST_GROUP_FILE = new STGroupFile(TEMPLATES_FILE_PATH);


    static boolean fromSelectClause(ParseTree parseTree) {
        ParseTree currentParent = parseTree.getParent();
        while (currentParent != null) {
            if (((RuleContext) currentParent).getRuleIndex() == PLHQLStatementsParser.RULE_select_list_item) {
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

    static int getOverallSize(Stack<String> tables) {
        int count = 0;
        Object[] tablesArray = tables.toArray();
        for (Object currentString : tablesArray) {
            if (!BooleanExpressionMatcher.matches(String.valueOf(currentString))) {
                count += TypeRepository.getColumnsCount(String.valueOf(currentString));
            }
        }
        return count;
    }

}