// Generated from C:/Users/HAMZA/Documents/GitHub/pl-sql-compiler/antlr\PLSQLKeywordParser.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PLSQLKeywordParserParser}.
 */
public interface PLSQLKeywordParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PLSQLKeywordParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PLSQLKeywordParserParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLKeywordParserParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PLSQLKeywordParserParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLKeywordParserParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(PLSQLKeywordParserParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLKeywordParserParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(PLSQLKeywordParserParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLKeywordParserParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(PLSQLKeywordParserParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLKeywordParserParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(PLSQLKeywordParserParser.ErrorContext ctx);
}