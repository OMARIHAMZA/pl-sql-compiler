// Generated from C:/Users/ALIENWARE/IdeaProjects/pl-sql-compiler/antlr\PLHQLStatements.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PLHQLStatementsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PLHQLStatementsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PLHQLStatementsParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PLHQLStatementsParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_stmt(PLHQLStatementsParser.Error_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#begin_end_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_end_block(PLHQLStatementsParser.Begin_end_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_missing_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_missing_end(PLHQLStatementsParser.Error_missing_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#single_block_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_block_stmt(PLHQLStatementsParser.Single_block_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#block_end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_end(PLHQLStatementsParser.Block_endContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#proc_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc_block(PLHQLStatementsParser.Proc_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(PLHQLStatementsParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#semicolon_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon_stmt(PLHQLStatementsParser.Semicolon_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#null_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_stmt(PLHQLStatementsParser.Null_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(PLHQLStatementsParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#assignment_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt(PLHQLStatementsParser.Assignment_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_item(PLHQLStatementsParser.Assignment_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_single_item(PLHQLStatementsParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_multiple_item(PLHQLStatementsParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stmt_select_item(PLHQLStatementsParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#break_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_stmt(PLHQLStatementsParser.Break_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#call_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_stmt(PLHQLStatementsParser.Call_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#declare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt(PLHQLStatementsParser.Declare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_delcare_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_delcare_stmt(PLHQLStatementsParser.Error_delcare_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#declare_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block(PLHQLStatementsParser.Declare_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_block_inplace(PLHQLStatementsParser.Declare_block_inplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_stmt_item(PLHQLStatementsParser.Declare_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#declare_var_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_var_item(PLHQLStatementsParser.Declare_var_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(PLHQLStatementsParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_create_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_create_stmt(PLHQLStatementsParser.Error_create_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_create_table_stmt(PLHQLStatementsParser.Error_create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_local_temp_table_stmt(PLHQLStatementsParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_definition(PLHQLStatementsParser.Create_table_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns(PLHQLStatementsParser.Create_table_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_columns_item(PLHQLStatementsParser.Create_table_columns_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(PLHQLStatementsParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_inline_cons(PLHQLStatementsParser.Create_table_column_inline_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_column_cons(PLHQLStatementsParser.Create_table_column_consContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_fk_action(PLHQLStatementsParser.Create_table_fk_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions(PLHQLStatementsParser.Create_table_preoptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_item(PLHQLStatementsParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_preoptions_td_item(PLHQLStatementsParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options(PLHQLStatementsParser.Create_table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_item(PLHQLStatementsParser.Create_table_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_ora_item(PLHQLStatementsParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_db2_item(PLHQLStatementsParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_td_item(PLHQLStatementsParser.Create_table_options_td_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_hive_item(PLHQLStatementsParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format(PLHQLStatementsParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_hive_row_format_fields(PLHQLStatementsParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mssql_item(PLHQLStatementsParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_options_mysql_item(PLHQLStatementsParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(PLHQLStatementsParser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#dtype_len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_len(PLHQLStatementsParser.Dtype_lenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#dtype_attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_attr(PLHQLStatementsParser.Dtype_attrContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#dtype_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_default(PLHQLStatementsParser.Dtype_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_database_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_stmt(PLHQLStatementsParser.Create_database_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_database_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_option(PLHQLStatementsParser.Create_database_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#c_function_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_function_header(PLHQLStatementsParser.C_function_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#c_function_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_function_parameter_list(PLHQLStatementsParser.C_function_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#c_function_parameter_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitC_function_parameter_item(PLHQLStatementsParser.C_function_parameter_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_function_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_stmt(PLHQLStatementsParser.Create_function_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_function_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_return(PLHQLStatementsParser.Create_function_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_package_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_stmt(PLHQLStatementsParser.Create_package_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#package_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec(PLHQLStatementsParser.Package_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#package_spec_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_spec_item(PLHQLStatementsParser.Package_spec_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_package_body_stmt(PLHQLStatementsParser.Create_package_body_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#package_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body(PLHQLStatementsParser.Package_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#package_body_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackage_body_item(PLHQLStatementsParser.Package_body_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_procedure_stmt(PLHQLStatementsParser.Create_procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_create_procedure_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_create_procedure_stmt(PLHQLStatementsParser.Error_create_procedure_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_routine_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_params(PLHQLStatementsParser.Create_routine_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_routine_param_item(PLHQLStatementsParser.Create_routine_param_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#exec_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExec_stmt(PLHQLStatementsParser.Exec_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stmt(PLHQLStatementsParser.If_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_if_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_if_stmt(PLHQLStatementsParser.Error_if_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_plsql_stmt(PLHQLStatementsParser.If_plsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_if_plsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_if_plsql_stmt(PLHQLStatementsParser.Error_if_plsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_tsql_stmt(PLHQLStatementsParser.If_tsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_if_tsql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_if_tsql_stmt(PLHQLStatementsParser.Error_if_tsql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_bteq_stmt(PLHQLStatementsParser.If_bteq_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_if_bteq_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_if_bteq_stmt(PLHQLStatementsParser.Error_if_bteq_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#elseif_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif_block(PLHQLStatementsParser.Elseif_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#else_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_block(PLHQLStatementsParser.Else_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(PLHQLStatementsParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_create_index_stmt(PLHQLStatementsParser.Error_create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#create_index_col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_col(PLHQLStatementsParser.Create_index_colContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(PLHQLStatementsParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#for_range_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_range_stmt(PLHQLStatementsParser.For_range_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_for_range_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_for_range_stmt(PLHQLStatementsParser.Error_for_range_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(PLHQLStatementsParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt(PLHQLStatementsParser.Cte_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt_item(PLHQLStatementsParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#cte_select_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_cols(PLHQLStatementsParser.Cte_select_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt(PLHQLStatementsParser.Fullselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt_item(PLHQLStatementsParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_set_clause(PLHQLStatementsParser.Fullselect_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#subselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubselect_stmt(PLHQLStatementsParser.Subselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_subselect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_subselect(PLHQLStatementsParser.Error_subselectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(PLHQLStatementsParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#select_list_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_set(PLHQLStatementsParser.Select_list_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#select_list_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_limit(PLHQLStatementsParser.Select_list_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#select_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_item(PLHQLStatementsParser.Select_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#select_list_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_alias(PLHQLStatementsParser.Select_list_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_asterisk(PLHQLStatementsParser.Select_list_asteriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(PLHQLStatementsParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(PLHQLStatementsParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_from_clause(PLHQLStatementsParser.Error_from_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#from_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_clause(PLHQLStatementsParser.From_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_name_clause(PLHQLStatementsParser.From_table_name_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_subselect_clause(PLHQLStatementsParser.From_subselect_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#from_join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_clause(PLHQLStatementsParser.From_join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_type_clause(PLHQLStatementsParser.From_join_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_clause(PLHQLStatementsParser.From_table_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#from_table_values_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_row(PLHQLStatementsParser.From_table_values_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#from_alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_alias_clause(PLHQLStatementsParser.From_alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(PLHQLStatementsParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(PLHQLStatementsParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_missing_bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_missing_bool_expr(PLHQLStatementsParser.Error_missing_bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(PLHQLStatementsParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(PLHQLStatementsParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#qualify_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualify_clause(PLHQLStatementsParser.Qualify_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(PLHQLStatementsParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(PLHQLStatementsParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_atom(PLHQLStatementsParser.Bool_expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_unary(PLHQLStatementsParser.Bool_expr_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_single_in(PLHQLStatementsParser.Bool_expr_single_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_multi_in(PLHQLStatementsParser.Bool_expr_multi_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary(PLHQLStatementsParser.Bool_expr_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_logical_operator(PLHQLStatementsParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary_operator(PLHQLStatementsParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(PLHQLStatementsParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_atom(PLHQLStatementsParser.Expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#expr_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_interval(PLHQLStatementsParser.Expr_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#interval_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_item(PLHQLStatementsParser.Interval_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#expr_concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat(PLHQLStatementsParser.Expr_concatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#expr_concat_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat_item(PLHQLStatementsParser.Expr_concat_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#expr_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case(PLHQLStatementsParser.Expr_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#expr_case_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_simple(PLHQLStatementsParser.Expr_case_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#expr_case_searched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_searched(PLHQLStatementsParser.Expr_case_searchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_agg_window_func(PLHQLStatementsParser.Expr_agg_window_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_all_distinct(PLHQLStatementsParser.Expr_func_all_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_over_clause(PLHQLStatementsParser.Expr_func_over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_partition_by_clause(PLHQLStatementsParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#expr_spec_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_spec_func(PLHQLStatementsParser.Expr_spec_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#expr_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func(PLHQLStatementsParser.Expr_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#expr_func_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_params(PLHQLStatementsParser.Expr_func_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#func_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param(PLHQLStatementsParser.Func_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_missing_right_p}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_missing_right_p(PLHQLStatementsParser.Error_missing_right_pContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(PLHQLStatementsParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#timestamp_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_literal(PLHQLStatementsParser.Timestamp_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(PLHQLStatementsParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link PLHQLStatementsParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_quotedString(PLHQLStatementsParser.Single_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link PLHQLStatementsParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_quotedString(PLHQLStatementsParser.Double_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_string(PLHQLStatementsParser.Error_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#int_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_number(PLHQLStatementsParser.Int_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#dec_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_number(PLHQLStatementsParser.Dec_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(PLHQLStatementsParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#null_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_const(PLHQLStatementsParser.Null_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#non_reserved_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_reserved_words(PLHQLStatementsParser.Non_reserved_wordsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PLHQLStatementsParser#error_invalid_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_invalid_token(PLHQLStatementsParser.Error_invalid_tokenContext ctx);
}