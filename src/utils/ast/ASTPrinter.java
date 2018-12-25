package utils.ast;

import gen.PLHQLStatementsParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class ASTPrinter {

    private boolean ignoreWrapperRules = false;

    public void setIgnoreWrapperRules(boolean ignoreWrapperRules) {
        this.ignoreWrapperRules = ignoreWrapperRules;
    }

    public void print(RuleContext context) {
        System.out.println(explore(context, 0));
    }

    public String getTreeString(RuleContext ctx) {
        return explore(ctx, 0);
    }

    private String explore(RuleContext ctx, int indentation) {
        StringBuilder result = new StringBuilder();
        boolean toBeIgnored = ignoreWrapperRules
                && ctx.getChildCount() == 1
                && ctx.getChild(0) instanceof ParserRuleContext;
        if (!toBeIgnored) {
            String ruleName = PLHQLStatementsParser.ruleNames[ctx.getRuleIndex()];
            for (int i = 0; i < indentation; i++) {
                result.append("  ");
            }
            result.append(ruleName).append("\n");
        }
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree element = ctx.getChild(i);
            if (element instanceof RuleContext) {
                result.append(explore((RuleContext) element, indentation + (toBeIgnored ? 0 : 1)));
            }
        }
        return result.toString();
    }
}
