// Generated from E:/Github/pl-sql-compiler/src\PLSQLKeywordParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PLSQLKeywordParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PLSQLKeywordParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PLSQLKeywordParserParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PLSQLKeywordParserParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLKeywordParserParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(PLSQLKeywordParserParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLSQLKeywordParserParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(PLSQLKeywordParserParser.ErrorContext ctx);
}