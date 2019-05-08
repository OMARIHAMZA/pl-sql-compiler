package utils;

import gen.PLHQLStatementsLexer;
import gen.PLHQLStatementsParser;
import models.Scope;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.xml.soap.Node;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class ListenerUtils {

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

    static void checkSymbolExistance(ParseTree parseTree, Scope scope) {
        ArrayList<String> symbols = new ArrayList<>();
        getScopeSymbols(symbols, parseTree);
        symbols.forEach(s -> {

        });
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

}
