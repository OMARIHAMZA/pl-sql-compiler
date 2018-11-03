// Generated from C:/Users/ALIENWARE/IdeaProjects/pl-sql-compiler/antlr\PLHQLStatements.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PLHQLStatementsParser}.
 */
public interface PLHQLStatementsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PLHQLStatementsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PLHQLStatementsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PLHQLStatementsParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PLHQLStatementsParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#error_stmt}.
	 * @param ctx the parse tree
	 */
	void enterError_stmt(PLHQLStatementsParser.Error_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#error_stmt}.
	 * @param ctx the parse tree
	 */
	void exitError_stmt(PLHQLStatementsParser.Error_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void enterBegin_end_block(PLHQLStatementsParser.Begin_end_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#begin_end_block}.
	 * @param ctx the parse tree
	 */
	void exitBegin_end_block(PLHQLStatementsParser.Begin_end_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#error_missing_end}.
	 * @param ctx the parse tree
	 */
	void enterError_missing_end(PLHQLStatementsParser.Error_missing_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#error_missing_end}.
	 * @param ctx the parse tree
	 */
	void exitError_missing_end(PLHQLStatementsParser.Error_missing_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSingle_block_stmt(PLHQLStatementsParser.Single_block_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#single_block_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSingle_block_stmt(PLHQLStatementsParser.Single_block_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#block_end}.
	 * @param ctx the parse tree
	 */
	void enterBlock_end(PLHQLStatementsParser.Block_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#block_end}.
	 * @param ctx the parse tree
	 */
	void exitBlock_end(PLHQLStatementsParser.Block_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void enterProc_block(PLHQLStatementsParser.Proc_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#proc_block}.
	 * @param ctx the parse tree
	 */
	void exitProc_block(PLHQLStatementsParser.Proc_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(PLHQLStatementsParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(PLHQLStatementsParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNull_stmt(PLHQLStatementsParser.Null_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#null_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNull_stmt(PLHQLStatementsParser.Null_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(PLHQLStatementsParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(PLHQLStatementsParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(PLHQLStatementsParser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(PLHQLStatementsParser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_item(PLHQLStatementsParser.Assignment_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#assignment_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_item(PLHQLStatementsParser.Assignment_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_single_item(PLHQLStatementsParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#assignment_stmt_single_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_single_item(PLHQLStatementsParser.Assignment_stmt_single_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_multiple_item(PLHQLStatementsParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#assignment_stmt_multiple_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_multiple_item(PLHQLStatementsParser.Assignment_stmt_multiple_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt_select_item(PLHQLStatementsParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#assignment_stmt_select_item}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt_select_item(PLHQLStatementsParser.Assignment_stmt_select_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stmt(PLHQLStatementsParser.Break_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#break_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stmt(PLHQLStatementsParser.Break_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCall_stmt(PLHQLStatementsParser.Call_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#call_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCall_stmt(PLHQLStatementsParser.Call_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt(PLHQLStatementsParser.Declare_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#declare_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt(PLHQLStatementsParser.Declare_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block(PLHQLStatementsParser.Declare_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#declare_block}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block(PLHQLStatementsParser.Declare_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_block_inplace(PLHQLStatementsParser.Declare_block_inplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#declare_block_inplace}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_block_inplace(PLHQLStatementsParser.Declare_block_inplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_stmt_item(PLHQLStatementsParser.Declare_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#declare_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_stmt_item(PLHQLStatementsParser.Declare_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_var_item(PLHQLStatementsParser.Declare_var_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#declare_var_item}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_var_item(PLHQLStatementsParser.Declare_var_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(PLHQLStatementsParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(PLHQLStatementsParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_local_temp_table_stmt(PLHQLStatementsParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_local_temp_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_local_temp_table_stmt(PLHQLStatementsParser.Create_local_temp_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_definition(PLHQLStatementsParser.Create_table_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_definition}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_definition(PLHQLStatementsParser.Create_table_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns(PLHQLStatementsParser.Create_table_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_columns}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns(PLHQLStatementsParser.Create_table_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_columns_item(PLHQLStatementsParser.Create_table_columns_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_columns_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_columns_item(PLHQLStatementsParser.Create_table_columns_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(PLHQLStatementsParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(PLHQLStatementsParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_inline_cons(PLHQLStatementsParser.Create_table_column_inline_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_column_inline_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_inline_cons(PLHQLStatementsParser.Create_table_column_inline_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_column_cons(PLHQLStatementsParser.Create_table_column_consContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_column_cons}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_column_cons(PLHQLStatementsParser.Create_table_column_consContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_fk_action(PLHQLStatementsParser.Create_table_fk_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_fk_action}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_fk_action(PLHQLStatementsParser.Create_table_fk_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions(PLHQLStatementsParser.Create_table_preoptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_preoptions}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions(PLHQLStatementsParser.Create_table_preoptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_item(PLHQLStatementsParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_preoptions_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_item(PLHQLStatementsParser.Create_table_preoptions_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_preoptions_td_item(PLHQLStatementsParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_preoptions_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_preoptions_td_item(PLHQLStatementsParser.Create_table_preoptions_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options(PLHQLStatementsParser.Create_table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_options}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options(PLHQLStatementsParser.Create_table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_item(PLHQLStatementsParser.Create_table_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_options_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_item(PLHQLStatementsParser.Create_table_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_ora_item(PLHQLStatementsParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_options_ora_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_ora_item(PLHQLStatementsParser.Create_table_options_ora_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_db2_item(PLHQLStatementsParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_options_db2_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_db2_item(PLHQLStatementsParser.Create_table_options_db2_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_td_item(PLHQLStatementsParser.Create_table_options_td_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_options_td_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_td_item(PLHQLStatementsParser.Create_table_options_td_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_hive_item(PLHQLStatementsParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_options_hive_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_hive_item(PLHQLStatementsParser.Create_table_options_hive_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format(PLHQLStatementsParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_hive_row_format}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format(PLHQLStatementsParser.Create_table_hive_row_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_hive_row_format_fields(PLHQLStatementsParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_hive_row_format_fields}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_hive_row_format_fields(PLHQLStatementsParser.Create_table_hive_row_format_fieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mssql_item(PLHQLStatementsParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_options_mssql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mssql_item(PLHQLStatementsParser.Create_table_options_mssql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_options_mysql_item(PLHQLStatementsParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_table_options_mysql_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_options_mysql_item(PLHQLStatementsParser.Create_table_options_mysql_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterDtype(PLHQLStatementsParser.DtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitDtype(PLHQLStatementsParser.DtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void enterDtype_len(PLHQLStatementsParser.Dtype_lenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void exitDtype_len(PLHQLStatementsParser.Dtype_lenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void enterDtype_attr(PLHQLStatementsParser.Dtype_attrContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#dtype_attr}.
	 * @param ctx the parse tree
	 */
	void exitDtype_attr(PLHQLStatementsParser.Dtype_attrContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void enterDtype_default(PLHQLStatementsParser.Dtype_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#dtype_default}.
	 * @param ctx the parse tree
	 */
	void exitDtype_default(PLHQLStatementsParser.Dtype_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_stmt(PLHQLStatementsParser.Create_database_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_stmt(PLHQLStatementsParser.Create_database_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_option(PLHQLStatementsParser.Create_database_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_option(PLHQLStatementsParser.Create_database_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_stmt(PLHQLStatementsParser.Create_function_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_function_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_stmt(PLHQLStatementsParser.Create_function_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_return(PLHQLStatementsParser.Create_function_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_function_return}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_return(PLHQLStatementsParser.Create_function_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_stmt(PLHQLStatementsParser.Create_package_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_package_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_stmt(PLHQLStatementsParser.Create_package_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec(PLHQLStatementsParser.Package_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#package_spec}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec(PLHQLStatementsParser.Package_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_spec_item(PLHQLStatementsParser.Package_spec_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#package_spec_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_spec_item(PLHQLStatementsParser.Package_spec_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_body_stmt(PLHQLStatementsParser.Create_package_body_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_package_body_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_body_stmt(PLHQLStatementsParser.Create_package_body_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#package_body}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body(PLHQLStatementsParser.Package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#package_body}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body(PLHQLStatementsParser.Package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void enterPackage_body_item(PLHQLStatementsParser.Package_body_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#package_body_item}.
	 * @param ctx the parse tree
	 */
	void exitPackage_body_item(PLHQLStatementsParser.Package_body_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_stmt(PLHQLStatementsParser.Create_procedure_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_stmt(PLHQLStatementsParser.Create_procedure_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_params(PLHQLStatementsParser.Create_routine_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_routine_params}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_params(PLHQLStatementsParser.Create_routine_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void enterCreate_routine_param_item(PLHQLStatementsParser.Create_routine_param_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_routine_param_item}.
	 * @param ctx the parse tree
	 */
	void exitCreate_routine_param_item(PLHQLStatementsParser.Create_routine_param_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExec_stmt(PLHQLStatementsParser.Exec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExec_stmt(PLHQLStatementsParser.Exec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(PLHQLStatementsParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(PLHQLStatementsParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_plsql_stmt(PLHQLStatementsParser.If_plsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#if_plsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_plsql_stmt(PLHQLStatementsParser.If_plsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_tsql_stmt(PLHQLStatementsParser.If_tsql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#if_tsql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_tsql_stmt(PLHQLStatementsParser.If_tsql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_bteq_stmt(PLHQLStatementsParser.If_bteq_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#if_bteq_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_bteq_stmt(PLHQLStatementsParser.If_bteq_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void enterElseif_block(PLHQLStatementsParser.Elseif_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#elseif_block}.
	 * @param ctx the parse tree
	 */
	void exitElseif_block(PLHQLStatementsParser.Elseif_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(PLHQLStatementsParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(PLHQLStatementsParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(PLHQLStatementsParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(PLHQLStatementsParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_col(PLHQLStatementsParser.Create_index_colContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#create_index_col}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_col(PLHQLStatementsParser.Create_index_colContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(PLHQLStatementsParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(PLHQLStatementsParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFor_range_stmt(PLHQLStatementsParser.For_range_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#for_range_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFor_range_stmt(PLHQLStatementsParser.For_range_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(PLHQLStatementsParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(PLHQLStatementsParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt(PLHQLStatementsParser.Cte_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt(PLHQLStatementsParser.Cte_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt_item(PLHQLStatementsParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt_item(PLHQLStatementsParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_cols(PLHQLStatementsParser.Cte_select_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_cols(PLHQLStatementsParser.Cte_select_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt(PLHQLStatementsParser.Fullselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt(PLHQLStatementsParser.Fullselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt_item(PLHQLStatementsParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt_item(PLHQLStatementsParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_set_clause(PLHQLStatementsParser.Fullselect_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_set_clause(PLHQLStatementsParser.Fullselect_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSubselect_stmt(PLHQLStatementsParser.Subselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSubselect_stmt(PLHQLStatementsParser.Subselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#error_subselect}.
	 * @param ctx the parse tree
	 */
	void enterError_subselect(PLHQLStatementsParser.Error_subselectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#error_subselect}.
	 * @param ctx the parse tree
	 */
	void exitError_subselect(PLHQLStatementsParser.Error_subselectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(PLHQLStatementsParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(PLHQLStatementsParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_set(PLHQLStatementsParser.Select_list_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_set(PLHQLStatementsParser.Select_list_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_limit(PLHQLStatementsParser.Select_list_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_limit(PLHQLStatementsParser.Select_list_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_item(PLHQLStatementsParser.Select_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_item(PLHQLStatementsParser.Select_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_alias(PLHQLStatementsParser.Select_list_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_alias(PLHQLStatementsParser.Select_list_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_asterisk(PLHQLStatementsParser.Select_list_asteriskContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_asterisk(PLHQLStatementsParser.Select_list_asteriskContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(PLHQLStatementsParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(PLHQLStatementsParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(PLHQLStatementsParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(PLHQLStatementsParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_clause(PLHQLStatementsParser.From_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_clause(PLHQLStatementsParser.From_table_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_name_clause(PLHQLStatementsParser.From_table_name_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_name_clause(PLHQLStatementsParser.From_table_name_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_subselect_clause(PLHQLStatementsParser.From_subselect_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_subselect_clause(PLHQLStatementsParser.From_subselect_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_clause(PLHQLStatementsParser.From_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_clause(PLHQLStatementsParser.From_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_type_clause(PLHQLStatementsParser.From_join_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_type_clause(PLHQLStatementsParser.From_join_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_clause(PLHQLStatementsParser.From_table_values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_clause(PLHQLStatementsParser.From_table_values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_row(PLHQLStatementsParser.From_table_values_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_row(PLHQLStatementsParser.From_table_values_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_alias_clause(PLHQLStatementsParser.From_alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_alias_clause(PLHQLStatementsParser.From_alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(PLHQLStatementsParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(PLHQLStatementsParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(PLHQLStatementsParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(PLHQLStatementsParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#error_missing_bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterError_missing_bool_expr(PLHQLStatementsParser.Error_missing_bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#error_missing_bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitError_missing_bool_expr(PLHQLStatementsParser.Error_missing_bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(PLHQLStatementsParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(PLHQLStatementsParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(PLHQLStatementsParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(PLHQLStatementsParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void enterQualify_clause(PLHQLStatementsParser.Qualify_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void exitQualify_clause(PLHQLStatementsParser.Qualify_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(PLHQLStatementsParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(PLHQLStatementsParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(PLHQLStatementsParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(PLHQLStatementsParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_atom(PLHQLStatementsParser.Bool_expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_atom(PLHQLStatementsParser.Bool_expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_unary(PLHQLStatementsParser.Bool_expr_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_unary(PLHQLStatementsParser.Bool_expr_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_single_in(PLHQLStatementsParser.Bool_expr_single_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_single_in(PLHQLStatementsParser.Bool_expr_single_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_multi_in(PLHQLStatementsParser.Bool_expr_multi_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_multi_in(PLHQLStatementsParser.Bool_expr_multi_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary(PLHQLStatementsParser.Bool_expr_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary(PLHQLStatementsParser.Bool_expr_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_logical_operator(PLHQLStatementsParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_logical_operator(PLHQLStatementsParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary_operator(PLHQLStatementsParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary_operator(PLHQLStatementsParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PLHQLStatementsParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PLHQLStatementsParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpr_atom(PLHQLStatementsParser.Expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpr_atom(PLHQLStatementsParser.Expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void enterExpr_interval(PLHQLStatementsParser.Expr_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void exitExpr_interval(PLHQLStatementsParser.Expr_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void enterInterval_item(PLHQLStatementsParser.Interval_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void exitInterval_item(PLHQLStatementsParser.Interval_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat(PLHQLStatementsParser.Expr_concatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat(PLHQLStatementsParser.Expr_concatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat_item(PLHQLStatementsParser.Expr_concat_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat_item(PLHQLStatementsParser.Expr_concat_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case(PLHQLStatementsParser.Expr_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case(PLHQLStatementsParser.Expr_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_simple(PLHQLStatementsParser.Expr_case_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_simple(PLHQLStatementsParser.Expr_case_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_searched(PLHQLStatementsParser.Expr_case_searchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_searched(PLHQLStatementsParser.Expr_case_searchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_agg_window_func(PLHQLStatementsParser.Expr_agg_window_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_agg_window_func(PLHQLStatementsParser.Expr_agg_window_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_all_distinct(PLHQLStatementsParser.Expr_func_all_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_all_distinct(PLHQLStatementsParser.Expr_func_all_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_over_clause(PLHQLStatementsParser.Expr_func_over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_over_clause(PLHQLStatementsParser.Expr_func_over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_partition_by_clause(PLHQLStatementsParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_partition_by_clause(PLHQLStatementsParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_spec_func(PLHQLStatementsParser.Expr_spec_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_spec_func(PLHQLStatementsParser.Expr_spec_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func(PLHQLStatementsParser.Expr_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func(PLHQLStatementsParser.Expr_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_params(PLHQLStatementsParser.Expr_func_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_params(PLHQLStatementsParser.Expr_func_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#func_param}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param(PLHQLStatementsParser.Func_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#func_param}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param(PLHQLStatementsParser.Func_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#error_missing_right_p}.
	 * @param ctx the parse tree
	 */
	void enterError_missing_right_p(PLHQLStatementsParser.Error_missing_right_pContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#error_missing_right_p}.
	 * @param ctx the parse tree
	 */
	void exitError_missing_right_p(PLHQLStatementsParser.Error_missing_right_pContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_literal(PLHQLStatementsParser.Date_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_literal(PLHQLStatementsParser.Date_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_literal(PLHQLStatementsParser.Timestamp_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_literal(PLHQLStatementsParser.Timestamp_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(PLHQLStatementsParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(PLHQLStatementsParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link PLHQLStatementsParser#string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_quotedString(PLHQLStatementsParser.Single_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link PLHQLStatementsParser#string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_quotedString(PLHQLStatementsParser.Single_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link PLHQLStatementsParser#string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_quotedString(PLHQLStatementsParser.Double_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link PLHQLStatementsParser#string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_quotedString(PLHQLStatementsParser.Double_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#error_string}.
	 * @param ctx the parse tree
	 */
	void enterError_string(PLHQLStatementsParser.Error_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#error_string}.
	 * @param ctx the parse tree
	 */
	void exitError_string(PLHQLStatementsParser.Error_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#int_number}.
	 * @param ctx the parse tree
	 */
	void enterInt_number(PLHQLStatementsParser.Int_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#int_number}.
	 * @param ctx the parse tree
	 */
	void exitInt_number(PLHQLStatementsParser.Int_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void enterDec_number(PLHQLStatementsParser.Dec_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void exitDec_number(PLHQLStatementsParser.Dec_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(PLHQLStatementsParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(PLHQLStatementsParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#null_const}.
	 * @param ctx the parse tree
	 */
	void enterNull_const(PLHQLStatementsParser.Null_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#null_const}.
	 * @param ctx the parse tree
	 */
	void exitNull_const(PLHQLStatementsParser.Null_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLHQLStatementsParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void enterNon_reserved_words(PLHQLStatementsParser.Non_reserved_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLHQLStatementsParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void exitNon_reserved_words(PLHQLStatementsParser.Non_reserved_wordsContext ctx);
}