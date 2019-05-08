package utils;

import gen.PLHQLStatementsLexer;
import gen.PLHQLStatementsParser;
import models.Scope;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

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
