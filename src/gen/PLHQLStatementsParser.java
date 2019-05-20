// Generated from C:/Users/ASUS/Documents/GitHub/pl-sql-compiler/src\PLHQLStatements.g4 by ANTLR 4.7.2
package gen;

import java.util.*;
import org.antlr.v4.runtime.misc.Pair;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PLHQLStatementsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T_ACTION=5, T_ADD2=6, T_ALL=7, T_ALLOCATE=8, 
		T_ALTER=9, T_AND=10, T_ANSI_NULLS=11, T_ANSI_PADDING=12, T_AS=13, T_ASC=14, 
		T_ASSOCIATE=15, T_AT=16, T_AUTO_INCREMENT=17, T_AVG=18, T_BATCHSIZE=19, 
		T_BEGIN=20, T_BETWEEN=21, T_BIGINT=22, T_BINARY_DOUBLE=23, T_BINARY_FLOAT=24, 
		T_BINARY_INTEGER=25, T_BIT=26, T_BODY=27, T_BREAK=28, T_BY=29, T_BYTE=30, 
		T_CALL=31, T_CALLER=32, T_CASCADE=33, T_CASE=34, T_CASESPECIFIC=35, T_CAST=36, 
		T_CHAR=37, T_CHARACTER=38, T_CHARSET=39, T_CLIENT=40, T_CLOSE=41, T_CLUSTERED=42, 
		T_CMP=43, T_COLLECT=44, T_COLLECTION=45, T_COLUMN=46, T_COMMENT=47, T_CONSTANT=48, 
		T_COMMIT=49, T_COMPRESS=50, T_CONCAT=51, T_CONDITION=52, T_CONSTRAINT=53, 
		T_CONTINUE=54, T_COPY=55, T_COUNT=56, T_COUNT_BIG=57, T_CREATE=58, T_CREATION=59, 
		T_CREATOR=60, T_CS=61, T_CURRENT=62, T_CURRENT_SCHEMA=63, T_CURSOR=64, 
		T_DATABASE=65, T_DATA=66, T_DATE=67, T_DATETIME=68, T_DAY=69, T_DAYS=70, 
		T_DEC=71, T_DECIMAL=72, T_DECLARE=73, T_DEFAULT=74, T_DEFERRED=75, T_DEFINED=76, 
		T_DEFINER=77, T_DEFINITION=78, T_DELETE=79, T_DELIMITED=80, T_DELIMITER=81, 
		T_DESC=82, T_DESCRIBE=83, T_DIAGNOSTICS=84, T_DIR=85, T_DIRECTORY=86, 
		T_DISTINCT=87, T_DISTRIBUTE=88, T_DO=89, T_DOUBLE=90, T_DROP=91, T_DYNAMIC=92, 
		T_ELSE=93, T_ELSEIF=94, T_ELSIF=95, T_ENABLE=96, T_END=97, T_ENGINE=98, 
		T_ESCAPED=99, T_EXCEPT=100, T_EXEC=101, T_EXECUTE=102, T_EXCEPTION=103, 
		T_EXCLUSIVE=104, T_EXISTS=105, T_EXIT=106, T_FALLBACK=107, T_FALSE=108, 
		T_FETCH=109, T_FIELDS=110, T_FILE=111, T_FILES=112, T_FLOAT=113, T_FOR=114, 
		T_FOREIGN=115, T_FORMAT=116, T_FOUND=117, T_FROM=118, T_FULL=119, T_FUNCTION=120, 
		T_GET=121, T_GLOBAL=122, T_GO=123, T_GRANT=124, T_GROUP=125, T_HANDLER=126, 
		T_HASH=127, T_HAVING=128, T_HDFS=129, T_HIVE=130, T_HOST=131, T_IDENTITY=132, 
		T_IF=133, T_IGNORE=134, T_IMMEDIATE=135, T_IN=136, T_INCLUDE=137, T_INDEX=138, 
		T_INITRANS=139, T_INNER=140, T_INOUT=141, T_INSERT=142, T_INT=143, T_INT2=144, 
		T_INT4=145, T_INT8=146, T_INTEGER=147, T_INTERSECT=148, T_INTERVAL=149, 
		T_INTO=150, T_INVOKER=151, T_IS=152, T_ISOPEN=153, T_ITEMS=154, T_JOIN=155, 
		T_KEEP=156, T_KEY=157, T_KEYS=158, T_LANGUAGE=159, T_LEAVE=160, T_LEFT=161, 
		T_LIKE=162, T_LIMIT=163, T_LINES=164, T_LOCAL=165, T_LOCATION=166, T_LOCATOR=167, 
		T_LOCATORS=168, T_LOCKS=169, T_LOG=170, T_LOGGED=171, T_LOGGING=172, T_LOOP=173, 
		T_MAP=174, T_MATCHED=175, T_MAX=176, T_MAXTRANS=177, T_MERGE=178, T_MESSAGE_TEXT=179, 
		T_MICROSECOND=180, T_MICROSECONDS=181, T_MIN=182, T_MULTISET=183, T_NCHAR=184, 
		T_NEW=185, T_NVARCHAR=186, T_NO=187, T_NOCOUNT=188, T_NOCOMPRESS=189, 
		T_NOLOGGING=190, T_NONE=191, T_NOT=192, T_NOTFOUND=193, T_NULL=194, T_NUMERIC=195, 
		T_NUMBER=196, T_OBJECT=197, T_OFF=198, T_ON=199, T_ONLY=200, T_OPEN=201, 
		T_OR=202, T_ORDER=203, T_OUT=204, T_OUTER=205, T_OVER=206, T_OVERWRITE=207, 
		T_OWNER=208, T_PACKAGE=209, T_PARTITION=210, T_PCTFREE=211, T_PCTUSED=212, 
		T_PLS_INTEGER=213, T_PRECISION=214, T_PRESERVE=215, T_PRIMARY=216, T_PRINT=217, 
		T_PROC=218, T_PROCEDURE=219, T_QUALIFY=220, T_QUERY_BAND=221, T_QUIT=222, 
		T_QUOTED_IDENTIFIER=223, T_RAISE=224, T_REAL=225, T_REFERENCES=226, T_REGEXP=227, 
		T_REPLACE=228, T_RESIGNAL=229, T_RESTRICT=230, T_RESULT=231, T_RESULT_SET_LOCATOR=232, 
		T_RETURN=233, T_RETURNS=234, T_REVERSE=235, T_RIGHT=236, T_RLIKE=237, 
		T_ROLE=238, T_ROLLBACK=239, T_ROW=240, T_ROWS=241, T_ROWTYPE=242, T_ROW_COUNT=243, 
		T_RR=244, T_RS=245, T_PWD=246, T_TRIM=247, T_SCHEMA=248, T_SECOND=249, 
		T_SECONDS=250, T_SECURITY=251, T_SEGMENT=252, T_SEL=253, T_SELECT=254, 
		T_SET=255, T_SESSION=256, T_SESSIONS=257, T_SETS=258, T_SHARE=259, T_SIGNAL=260, 
		T_SIMPLE_DOUBLE=261, T_SIMPLE_FLOAT=262, T_SIMPLE_INTEGER=263, T_SMALLDATETIME=264, 
		T_SMALLINT=265, T_SQL=266, T_SQLEXCEPTION=267, T_SQLINSERT=268, T_SQLSTATE=269, 
		T_SQLWARNING=270, T_STATS=271, T_STATISTICS=272, T_STEP=273, T_STORAGE=274, 
		T_STORED=275, T_STRING=276, T_SUBDIR=277, T_SUBSTRING=278, T_SUM=279, 
		T_SUMMARY=280, T_SYS_REFCURSOR=281, T_TABLE=282, T_TABLESPACE=283, T_TEMPORARY=284, 
		T_TERMINATED=285, T_TEXTIMAGE_ON=286, T_THEN=287, T_TIMESTAMP=288, T_TINYINT=289, 
		T_TITLE=290, T_TO=291, T_TOP=292, T_TRANSACTION=293, T_TRUE=294, T_TRUNCATE=295, 
		T_TYPE=296, T_UNION=297, T_UNIQUE=298, T_UPDATE=299, T_UR=300, T_USE=301, 
		T_USING=302, T_VALUE=303, T_VALUES=304, T_VAR=305, T_VARCHAR=306, T_VARCHAR2=307, 
		T_VARYING=308, T_VOID=309, T_VOLATILE=310, T_WHEN=311, T_WHERE=312, T_WHILE=313, 
		T_WITH=314, T_WITHOUT=315, T_WORK=316, T_XACT_ABORT=317, T_XML=318, T_YES=319, 
		T_SUMMARIZE=320, T_ACTIVITY_COUNT=321, T_CUME_DIST=322, T_CURRENT_DATE=323, 
		T_CURRENT_TIMESTAMP=324, T_CURRENT_USER=325, T_DENSE_RANK=326, T_FIRST_VALUE=327, 
		T_LAG=328, T_LAST_VALUE=329, T_LEAD=330, T_MAX_PART_STRING=331, T_MIN_PART_STRING=332, 
		T_MAX_PART_INT=333, T_MIN_PART_INT=334, T_MAX_PART_DATE=335, T_MIN_PART_DATE=336, 
		T_PART_COUNT=337, T_PART_LOC=338, T_RANK=339, T_ROW_NUMBER=340, T_STDEV=341, 
		T_SYSDATE=342, T_VARIANCE=343, T_USER=344, T_ADD=345, T_AND_AND=346, T_COLON=347, 
		T_COMMA=348, T_PIPE=349, T_DIV=350, T_DOT2=351, T_PLUS_EQUAL=352, T_MINUS_EQUAL=353, 
		T_TIMES_EQUAL=354, T_DIVIDE_EQUAL=355, T_MOD_EQUAL=356, T_EQUAL=357, T_EQUAL2=358, 
		T_NOTEQUAL=359, T_NOTEQUAL2=360, T_GREATER=361, T_GREATEREQUAL=362, T_LESS=363, 
		T_LESSEQUAL=364, T_MUL=365, T_MINUS_MINUS=366, T_OPEN_B=367, T_OPEN_P=368, 
		T_OPEN_SB=369, T_PLUS_PLUS=370, T_CLOSE_B=371, T_CLOSE_P=372, T_CLOSE_SB=373, 
		T_SEMICOLON=374, T_SUB=375, L_ID=376, L_S_STRING=377, L_S_STRING_MISSING_RIGHT=378, 
		L_D_STRING=379, L_D_STRING_MISSING_RIGHT=380, L_INT=381, L_DEC=382, L_WS=383, 
		L_M_COMMENT=384, L_S_COMMENT=385, L_FILE=386, L_LABEL=387, L_INVALID_TOKEN=388;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_error_stmt = 2, RULE_begin_end_block = 3, 
		RULE_error_missing_end = 4, RULE_single_block_stmt = 5, RULE_block_end = 6, 
		RULE_proc_block = 7, RULE_c_stmt = 8, RULE_c_block = 9, RULE_stmt = 10, 
		RULE_semicolon_stmt = 11, RULE_null_stmt = 12, RULE_assignment_stmt = 13, 
		RULE_assignment_c_stmt = 14, RULE_assignment_stmt_item = 15, RULE_assignment_c_stmt_item = 16, 
		RULE_assignment_stmt_single_item = 17, RULE_assignment_c_stmt_single_item = 18, 
		RULE_increment_decrement_assignment = 19, RULE_assignment_stmt_multiple_item = 20, 
		RULE_assignment_c_stmt_multiple_item = 21, RULE_assignment_stmt_select_item = 22, 
		RULE_break_stmt = 23, RULE_call_stmt = 24, RULE_declare_stmt = 25, RULE_error_delcare_stmt = 26, 
		RULE_declare_block = 27, RULE_declare_block_inplace = 28, RULE_declare_stmt_item = 29, 
		RULE_declare_var_item = 30, RULE_create_table_stmt = 31, RULE_error_create_stmt = 32, 
		RULE_error_create_table_stmt = 33, RULE_create_local_temp_table_stmt = 34, 
		RULE_create_table_definition = 35, RULE_create_table_columns = 36, RULE_create_table_columns_item = 37, 
		RULE_column_name = 38, RULE_create_table_column_inline_cons = 39, RULE_create_table_column_cons = 40, 
		RULE_create_table_fk_action = 41, RULE_create_table_preoptions = 42, RULE_create_table_preoptions_td_item = 43, 
		RULE_create_table_options = 44, RULE_create_table_options_item = 45, RULE_create_table_options_ora_item = 46, 
		RULE_create_table_options_db2_item = 47, RULE_create_table_options_td_item = 48, 
		RULE_create_table_options_hive_item = 49, RULE_create_table_hive_row_format = 50, 
		RULE_create_table_options_mssql_item = 51, RULE_create_table_options_mysql_item = 52, 
		RULE_dtype = 53, RULE_dtype_len = 54, RULE_dtype_attr = 55, RULE_dtype_default = 56, 
		RULE_create_database_stmt = 57, RULE_create_database_option = 58, RULE_c_function = 59, 
		RULE_c_function_parameter_list = 60, RULE_c_function_parameter_item = 61, 
		RULE_error_create_procedure_stmt = 62, RULE_create_routine_params = 63, 
		RULE_create_routine_param_item = 64, RULE_exec_stmt = 65, RULE_if_stmt = 66, 
		RULE_if_c_stmt = 67, RULE_error_if_stmt = 68, RULE_if_plsql_stmt = 69, 
		RULE_error_if_plsql_stmt = 70, RULE_if_tsql_stmt = 71, RULE_error_if_tsql_stmt = 72, 
		RULE_if_bteq_stmt = 73, RULE_error_if_bteq_stmt = 74, RULE_elseif_block = 75, 
		RULE_else_block = 76, RULE_create_index_stmt = 77, RULE_error_create_index_stmt = 78, 
		RULE_create_index_col = 79, RULE_return_stmt = 80, RULE_for_range_stmt = 81, 
		RULE_for_c_stmt = 82, RULE_general_delcaration_c_stmt = 83, RULE_for_delcaration_c_stmt = 84, 
		RULE_error_for_range_stmt = 85, RULE_select_stmt = 86, RULE_cte_select_stmt = 87, 
		RULE_cte_select_stmt_item = 88, RULE_cte_select_cols = 89, RULE_fullselect_stmt = 90, 
		RULE_fullselect_stmt_item = 91, RULE_fullselect_set_clause = 92, RULE_subselect_stmt = 93, 
		RULE_error_subselect = 94, RULE_select_list = 95, RULE_select_list_set = 96, 
		RULE_select_list_limit = 97, RULE_select_list_item = 98, RULE_select_list_alias = 99, 
		RULE_select_list_asterisk = 100, RULE_into_clause = 101, RULE_from_clause = 102, 
		RULE_error_from_clause = 103, RULE_from_table_clause = 104, RULE_from_table_name_clause = 105, 
		RULE_from_subselect_clause = 106, RULE_from_join_clause = 107, RULE_from_join_type_clause = 108, 
		RULE_from_table_values_clause = 109, RULE_from_table_values_row = 110, 
		RULE_from_alias_clause = 111, RULE_table_name = 112, RULE_where_clause = 113, 
		RULE_error_missing_bool_expr = 114, RULE_group_by_clause = 115, RULE_having_clause = 116, 
		RULE_qualify_clause = 117, RULE_order_by_clause = 118, RULE_sort_type = 119, 
		RULE_bool_expr = 120, RULE_having_bool_expr = 121, RULE_having_expr_atom = 122, 
		RULE_bool_expr_atom = 123, RULE_bool_expr_unary = 124, RULE_bool_expr_single_in = 125, 
		RULE_bool_expr_multi_in = 126, RULE_bool_expr_binary = 127, RULE_having_bool_expr_binary = 128, 
		RULE_bool_expr_logical_operator = 129, RULE_bool_and = 130, RULE_bool_or = 131, 
		RULE_bool_expr_binary_operator = 132, RULE_group_by_expr = 133, RULE_expr = 134, 
		RULE_expr_atom = 135, RULE_expr_interval = 136, RULE_interval_item = 137, 
		RULE_expr_concat = 138, RULE_expr_concat_item = 139, RULE_expr_case = 140, 
		RULE_expr_case_simple = 141, RULE_expr_case_searched = 142, RULE_expr_agg_window_func = 143, 
		RULE_expr_func_all_distinct = 144, RULE_expr_func_over_clause = 145, RULE_expr_func_partition_by_clause = 146, 
		RULE_expr_spec_func = 147, RULE_expr_func = 148, RULE_expr_func_params = 149, 
		RULE_func_param = 150, RULE_error_missing_right_p = 151, RULE_date_literal = 152, 
		RULE_timestamp_literal = 153, RULE_assignment_operator = 154, RULE_ident = 155, 
		RULE_string = 156, RULE_error_string = 157, RULE_int_number = 158, RULE_dec_number = 159, 
		RULE_bool_literal = 160, RULE_null_const = 161, RULE_non_reserved_words = 162, 
		RULE_error_invalid_token = 163;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "error_stmt", "begin_end_block", "error_missing_end", 
			"single_block_stmt", "block_end", "proc_block", "c_stmt", "c_block", 
			"stmt", "semicolon_stmt", "null_stmt", "assignment_stmt", "assignment_c_stmt", 
			"assignment_stmt_item", "assignment_c_stmt_item", "assignment_stmt_single_item", 
			"assignment_c_stmt_single_item", "increment_decrement_assignment", "assignment_stmt_multiple_item", 
			"assignment_c_stmt_multiple_item", "assignment_stmt_select_item", "break_stmt", 
			"call_stmt", "declare_stmt", "error_delcare_stmt", "declare_block", "declare_block_inplace", 
			"declare_stmt_item", "declare_var_item", "create_table_stmt", "error_create_stmt", 
			"error_create_table_stmt", "create_local_temp_table_stmt", "create_table_definition", 
			"create_table_columns", "create_table_columns_item", "column_name", "create_table_column_inline_cons", 
			"create_table_column_cons", "create_table_fk_action", "create_table_preoptions", 
			"create_table_preoptions_td_item", "create_table_options", "create_table_options_item", 
			"create_table_options_ora_item", "create_table_options_db2_item", "create_table_options_td_item", 
			"create_table_options_hive_item", "create_table_hive_row_format", "create_table_options_mssql_item", 
			"create_table_options_mysql_item", "dtype", "dtype_len", "dtype_attr", 
			"dtype_default", "create_database_stmt", "create_database_option", "c_function", 
			"c_function_parameter_list", "c_function_parameter_item", "error_create_procedure_stmt", 
			"create_routine_params", "create_routine_param_item", "exec_stmt", "if_stmt", 
			"if_c_stmt", "error_if_stmt", "if_plsql_stmt", "error_if_plsql_stmt", 
			"if_tsql_stmt", "error_if_tsql_stmt", "if_bteq_stmt", "error_if_bteq_stmt", 
			"elseif_block", "else_block", "create_index_stmt", "error_create_index_stmt", 
			"create_index_col", "return_stmt", "for_range_stmt", "for_c_stmt", "general_delcaration_c_stmt", 
			"for_delcaration_c_stmt", "error_for_range_stmt", "select_stmt", "cte_select_stmt", 
			"cte_select_stmt_item", "cte_select_cols", "fullselect_stmt", "fullselect_stmt_item", 
			"fullselect_set_clause", "subselect_stmt", "error_subselect", "select_list", 
			"select_list_set", "select_list_limit", "select_list_item", "select_list_alias", 
			"select_list_asterisk", "into_clause", "from_clause", "error_from_clause", 
			"from_table_clause", "from_table_name_clause", "from_subselect_clause", 
			"from_join_clause", "from_join_type_clause", "from_table_values_clause", 
			"from_table_values_row", "from_alias_clause", "table_name", "where_clause", 
			"error_missing_bool_expr", "group_by_clause", "having_clause", "qualify_clause", 
			"order_by_clause", "sort_type", "bool_expr", "having_bool_expr", "having_expr_atom", 
			"bool_expr_atom", "bool_expr_unary", "bool_expr_single_in", "bool_expr_multi_in", 
			"bool_expr_binary", "having_bool_expr_binary", "bool_expr_logical_operator", 
			"bool_and", "bool_or", "bool_expr_binary_operator", "group_by_expr", 
			"expr", "expr_atom", "expr_interval", "interval_item", "expr_concat", 
			"expr_concat_item", "expr_case", "expr_case_simple", "expr_case_searched", 
			"expr_agg_window_func", "expr_func_all_distinct", "expr_func_over_clause", 
			"expr_func_partition_by_clause", "expr_spec_func", "expr_func", "expr_func_params", 
			"func_param", "error_missing_right_p", "date_literal", "timestamp_literal", 
			"assignment_operator", "ident", "string", "error_string", "int_number", 
			"dec_number", "bool_literal", "null_const", "non_reserved_words", "error_invalid_token"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'@'", "'#'", "'%'", "'.'", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'+'", "'&&'", 
			"':'", "','", "'||'", "'/'", "'..'", "'+='", "'-='", "'*='", "'/='", 
			"'%='", "'='", "'=='", "'<>'", "'!='", "'>'", "'>='", "'<'", "'<='", 
			"'*'", "'--'", "'{'", "'('", "'['", "'++'", "'}'", "')'", "']'", "';'", 
			"'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "T_ACTION", "T_ADD2", "T_ALL", "T_ALLOCATE", 
			"T_ALTER", "T_AND", "T_ANSI_NULLS", "T_ANSI_PADDING", "T_AS", "T_ASC", 
			"T_ASSOCIATE", "T_AT", "T_AUTO_INCREMENT", "T_AVG", "T_BATCHSIZE", "T_BEGIN", 
			"T_BETWEEN", "T_BIGINT", "T_BINARY_DOUBLE", "T_BINARY_FLOAT", "T_BINARY_INTEGER", 
			"T_BIT", "T_BODY", "T_BREAK", "T_BY", "T_BYTE", "T_CALL", "T_CALLER", 
			"T_CASCADE", "T_CASE", "T_CASESPECIFIC", "T_CAST", "T_CHAR", "T_CHARACTER", 
			"T_CHARSET", "T_CLIENT", "T_CLOSE", "T_CLUSTERED", "T_CMP", "T_COLLECT", 
			"T_COLLECTION", "T_COLUMN", "T_COMMENT", "T_CONSTANT", "T_COMMIT", "T_COMPRESS", 
			"T_CONCAT", "T_CONDITION", "T_CONSTRAINT", "T_CONTINUE", "T_COPY", "T_COUNT", 
			"T_COUNT_BIG", "T_CREATE", "T_CREATION", "T_CREATOR", "T_CS", "T_CURRENT", 
			"T_CURRENT_SCHEMA", "T_CURSOR", "T_DATABASE", "T_DATA", "T_DATE", "T_DATETIME", 
			"T_DAY", "T_DAYS", "T_DEC", "T_DECIMAL", "T_DECLARE", "T_DEFAULT", "T_DEFERRED", 
			"T_DEFINED", "T_DEFINER", "T_DEFINITION", "T_DELETE", "T_DELIMITED", 
			"T_DELIMITER", "T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", "T_DIR", "T_DIRECTORY", 
			"T_DISTINCT", "T_DISTRIBUTE", "T_DO", "T_DOUBLE", "T_DROP", "T_DYNAMIC", 
			"T_ELSE", "T_ELSEIF", "T_ELSIF", "T_ENABLE", "T_END", "T_ENGINE", "T_ESCAPED", 
			"T_EXCEPT", "T_EXEC", "T_EXECUTE", "T_EXCEPTION", "T_EXCLUSIVE", "T_EXISTS", 
			"T_EXIT", "T_FALLBACK", "T_FALSE", "T_FETCH", "T_FIELDS", "T_FILE", "T_FILES", 
			"T_FLOAT", "T_FOR", "T_FOREIGN", "T_FORMAT", "T_FOUND", "T_FROM", "T_FULL", 
			"T_FUNCTION", "T_GET", "T_GLOBAL", "T_GO", "T_GRANT", "T_GROUP", "T_HANDLER", 
			"T_HASH", "T_HAVING", "T_HDFS", "T_HIVE", "T_HOST", "T_IDENTITY", "T_IF", 
			"T_IGNORE", "T_IMMEDIATE", "T_IN", "T_INCLUDE", "T_INDEX", "T_INITRANS", 
			"T_INNER", "T_INOUT", "T_INSERT", "T_INT", "T_INT2", "T_INT4", "T_INT8", 
			"T_INTEGER", "T_INTERSECT", "T_INTERVAL", "T_INTO", "T_INVOKER", "T_IS", 
			"T_ISOPEN", "T_ITEMS", "T_JOIN", "T_KEEP", "T_KEY", "T_KEYS", "T_LANGUAGE", 
			"T_LEAVE", "T_LEFT", "T_LIKE", "T_LIMIT", "T_LINES", "T_LOCAL", "T_LOCATION", 
			"T_LOCATOR", "T_LOCATORS", "T_LOCKS", "T_LOG", "T_LOGGED", "T_LOGGING", 
			"T_LOOP", "T_MAP", "T_MATCHED", "T_MAX", "T_MAXTRANS", "T_MERGE", "T_MESSAGE_TEXT", 
			"T_MICROSECOND", "T_MICROSECONDS", "T_MIN", "T_MULTISET", "T_NCHAR", 
			"T_NEW", "T_NVARCHAR", "T_NO", "T_NOCOUNT", "T_NOCOMPRESS", "T_NOLOGGING", 
			"T_NONE", "T_NOT", "T_NOTFOUND", "T_NULL", "T_NUMERIC", "T_NUMBER", "T_OBJECT", 
			"T_OFF", "T_ON", "T_ONLY", "T_OPEN", "T_OR", "T_ORDER", "T_OUT", "T_OUTER", 
			"T_OVER", "T_OVERWRITE", "T_OWNER", "T_PACKAGE", "T_PARTITION", "T_PCTFREE", 
			"T_PCTUSED", "T_PLS_INTEGER", "T_PRECISION", "T_PRESERVE", "T_PRIMARY", 
			"T_PRINT", "T_PROC", "T_PROCEDURE", "T_QUALIFY", "T_QUERY_BAND", "T_QUIT", 
			"T_QUOTED_IDENTIFIER", "T_RAISE", "T_REAL", "T_REFERENCES", "T_REGEXP", 
			"T_REPLACE", "T_RESIGNAL", "T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", 
			"T_RETURN", "T_RETURNS", "T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROLE", 
			"T_ROLLBACK", "T_ROW", "T_ROWS", "T_ROWTYPE", "T_ROW_COUNT", "T_RR", 
			"T_RS", "T_PWD", "T_TRIM", "T_SCHEMA", "T_SECOND", "T_SECONDS", "T_SECURITY", 
			"T_SEGMENT", "T_SEL", "T_SELECT", "T_SET", "T_SESSION", "T_SESSIONS", 
			"T_SETS", "T_SHARE", "T_SIGNAL", "T_SIMPLE_DOUBLE", "T_SIMPLE_FLOAT", 
			"T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", "T_SQL", "T_SQLEXCEPTION", 
			"T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", "T_STATS", "T_STATISTICS", 
			"T_STEP", "T_STORAGE", "T_STORED", "T_STRING", "T_SUBDIR", "T_SUBSTRING", 
			"T_SUM", "T_SUMMARY", "T_SYS_REFCURSOR", "T_TABLE", "T_TABLESPACE", "T_TEMPORARY", 
			"T_TERMINATED", "T_TEXTIMAGE_ON", "T_THEN", "T_TIMESTAMP", "T_TINYINT", 
			"T_TITLE", "T_TO", "T_TOP", "T_TRANSACTION", "T_TRUE", "T_TRUNCATE", 
			"T_TYPE", "T_UNION", "T_UNIQUE", "T_UPDATE", "T_UR", "T_USE", "T_USING", 
			"T_VALUE", "T_VALUES", "T_VAR", "T_VARCHAR", "T_VARCHAR2", "T_VARYING", 
			"T_VOID", "T_VOLATILE", "T_WHEN", "T_WHERE", "T_WHILE", "T_WITH", "T_WITHOUT", 
			"T_WORK", "T_XACT_ABORT", "T_XML", "T_YES", "T_SUMMARIZE", "T_ACTIVITY_COUNT", 
			"T_CUME_DIST", "T_CURRENT_DATE", "T_CURRENT_TIMESTAMP", "T_CURRENT_USER", 
			"T_DENSE_RANK", "T_FIRST_VALUE", "T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", 
			"T_MIN_PART_STRING", "T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", 
			"T_MIN_PART_DATE", "T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", 
			"T_STDEV", "T_SYSDATE", "T_VARIANCE", "T_USER", "T_ADD", "T_AND_AND", 
			"T_COLON", "T_COMMA", "T_PIPE", "T_DIV", "T_DOT2", "T_PLUS_EQUAL", "T_MINUS_EQUAL", 
			"T_TIMES_EQUAL", "T_DIVIDE_EQUAL", "T_MOD_EQUAL", "T_EQUAL", "T_EQUAL2", 
			"T_NOTEQUAL", "T_NOTEQUAL2", "T_GREATER", "T_GREATEREQUAL", "T_LESS", 
			"T_LESSEQUAL", "T_MUL", "T_MINUS_MINUS", "T_OPEN_B", "T_OPEN_P", "T_OPEN_SB", 
			"T_PLUS_PLUS", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", 
			"T_SUB", "L_ID", "L_S_STRING", "L_S_STRING_MISSING_RIGHT", "L_D_STRING", 
			"L_D_STRING_MISSING_RIGHT", "L_INT", "L_DEC", "L_WS", "L_M_COMMENT", 
			"L_S_COMMENT", "L_FILE", "L_LABEL", "L_INVALID_TOKEN"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PLHQLStatements.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PLHQLStatementsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ArrayList<String> functions = new ArrayList();
		public TerminalNode EOF() { return getToken(PLHQLStatementsParser.EOF, 0); }
		public List<C_functionContext> c_function() {
			return getRuleContexts(C_functionContext.class);
		}
		public C_functionContext c_function(int i) {
			return getRuleContext(C_functionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(328);
				c_function();
				}
				}
				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (T_BIGINT - 22)) | (1L << (T_BINARY_DOUBLE - 22)) | (1L << (T_BINARY_FLOAT - 22)) | (1L << (T_BINARY_INTEGER - 22)) | (1L << (T_BIT - 22)) | (1L << (T_CHAR - 22)) | (1L << (T_DATE - 22)) | (1L << (T_DATETIME - 22)) | (1L << (T_DEC - 22)) | (1L << (T_DECIMAL - 22)))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (T_DOUBLE - 90)) | (1L << (T_FLOAT - 90)) | (1L << (T_INT - 90)) | (1L << (T_INT2 - 90)) | (1L << (T_INT4 - 90)) | (1L << (T_INT8 - 90)) | (1L << (T_INTEGER - 90)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (T_NCHAR - 184)) | (1L << (T_NVARCHAR - 184)) | (1L << (T_NUMERIC - 184)) | (1L << (T_NUMBER - 184)) | (1L << (T_PLS_INTEGER - 184)) | (1L << (T_REAL - 184)) | (1L << (T_RESULT_SET_LOCATOR - 184)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (T_SIMPLE_DOUBLE - 261)) | (1L << (T_SIMPLE_FLOAT - 261)) | (1L << (T_SIMPLE_INTEGER - 261)) | (1L << (T_SMALLDATETIME - 261)) | (1L << (T_SMALLINT - 261)) | (1L << (T_STRING - 261)) | (1L << (T_SYS_REFCURSOR - 261)) | (1L << (T_TIMESTAMP - 261)) | (1L << (T_TINYINT - 261)) | (1L << (T_VARCHAR - 261)) | (1L << (T_VARCHAR2 - 261)) | (1L << (T_VOID - 261)) | (1L << (T_XML - 261)))) != 0) || _la==L_ID );
			setState(333);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<Begin_end_blockContext> begin_end_block() {
			return getRuleContexts(Begin_end_blockContext.class);
		}
		public Begin_end_blockContext begin_end_block(int i) {
			return getRuleContext(Begin_end_blockContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<Error_stmtContext> error_stmt() {
			return getRuleContexts(Error_stmtContext.class);
		}
		public Error_stmtContext error_stmt(int i) {
			return getRuleContext(Error_stmtContext.class,i);
		}
		public List<TerminalNode> T_GO() { return getTokens(PLHQLStatementsParser.T_GO); }
		public TerminalNode T_GO(int i) {
			return getToken(PLHQLStatementsParser.T_GO, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(338);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(335);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(336);
						stmt();
						}
						break;
					case 3:
						{
						setState(337);
						error_stmt();
						}
						break;
					}
					setState(341);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(340);
						match(T_GO);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(345); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_stmtContext extends ParserRuleContext {
		public Error_subselectContext error_subselect() {
			return getRuleContext(Error_subselectContext.class,0);
		}
		public Error_missing_right_pContext error_missing_right_p() {
			return getRuleContext(Error_missing_right_pContext.class,0);
		}
		public Error_missing_endContext error_missing_end() {
			return getRuleContext(Error_missing_endContext.class,0);
		}
		public Error_stringContext error_string() {
			return getRuleContext(Error_stringContext.class,0);
		}
		public Error_missing_bool_exprContext error_missing_bool_expr() {
			return getRuleContext(Error_missing_bool_exprContext.class,0);
		}
		public Error_if_stmtContext error_if_stmt() {
			return getRuleContext(Error_if_stmtContext.class,0);
		}
		public Error_create_stmtContext error_create_stmt() {
			return getRuleContext(Error_create_stmtContext.class,0);
		}
		public Error_for_range_stmtContext error_for_range_stmt() {
			return getRuleContext(Error_for_range_stmtContext.class,0);
		}
		public Error_delcare_stmtContext error_delcare_stmt() {
			return getRuleContext(Error_delcare_stmtContext.class,0);
		}
		public Error_invalid_tokenContext error_invalid_token() {
			return getRuleContext(Error_invalid_tokenContext.class,0);
		}
		public Error_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_stmt(this);
		}
	}

	public final Error_stmtContext error_stmt() throws RecognitionException {
		Error_stmtContext _localctx = new Error_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_error_stmt);
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FROM:
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				error_subselect();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				error_missing_right_p();
				}
				break;
			case T_BEGIN:
			case T_DECLARE:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				error_missing_end();
				}
				break;
			case L_S_STRING_MISSING_RIGHT:
			case L_D_STRING_MISSING_RIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				error_string();
				}
				break;
			case T_WHERE:
				enterOuterAlt(_localctx, 5);
				{
				setState(351);
				error_missing_bool_expr();
				}
				break;
			case T__3:
			case T_IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(352);
				error_if_stmt();
				}
				break;
			case T_CREATE:
			case T_PROC:
			case T_PROCEDURE:
			case T_REPLACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(353);
				error_create_stmt();
				}
				break;
			case T_FOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(354);
				error_for_range_stmt();
				}
				break;
			case L_ID:
				enterOuterAlt(_localctx, 9);
				{
				setState(355);
				error_delcare_stmt();
				}
				break;
			case L_INVALID_TOKEN:
				enterOuterAlt(_localctx, 10);
				{
				setState(356);
				error_invalid_token();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_end_blockContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(PLHQLStatementsParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public Declare_blockContext declare_block() {
			return getRuleContext(Declare_blockContext.class,0);
		}
		public Begin_end_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_end_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterBegin_end_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitBegin_end_block(this);
		}
	}

	public final Begin_end_blockContext begin_end_block() throws RecognitionException {
		Begin_end_blockContext _localctx = new Begin_end_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_begin_end_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(359);
				declare_block();
				}
			}

			setState(362);
			match(T_BEGIN);
			setState(363);
			block();
			setState(364);
			block_end();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_missing_endContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(PLHQLStatementsParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Declare_blockContext declare_block() {
			return getRuleContext(Declare_blockContext.class,0);
		}
		public Error_missing_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_missing_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_missing_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_missing_end(this);
		}
	}

	public final Error_missing_endContext error_missing_end() throws RecognitionException {
		Error_missing_endContext _localctx = new Error_missing_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_error_missing_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(366);
				declare_block();
				}
			}

			setState(369);
			match(T_BEGIN);
			setState(370);
			block();
			notifyErrorListeners("Expected 'END' at the end of the block");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Single_block_stmtContext extends ParserRuleContext {
		public TerminalNode T_BEGIN() { return getToken(PLHQLStatementsParser.T_BEGIN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_endContext block_end() {
			return getRuleContext(Block_endContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(PLHQLStatementsParser.T_SEMICOLON, 0); }
		public Single_block_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_block_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterSingle_block_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitSingle_block_stmt(this);
		}
	}

	public final Single_block_stmtContext single_block_stmt() throws RecognitionException {
		Single_block_stmtContext _localctx = new Single_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_single_block_stmt);
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(T_BEGIN);
				setState(374);
				block();
				setState(375);
				block_end();
				}
				break;
			case T__0:
			case T__1:
			case T__3:
			case T_AVG:
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BINARY_INTEGER:
			case T_BIT:
			case T_BREAK:
			case T_CASE:
			case T_CAST:
			case T_CHAR:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CREATE:
			case T_CURRENT:
			case T_DATE:
			case T_DATETIME:
			case T_DEC:
			case T_DECIMAL:
			case T_DECLARE:
			case T_DOUBLE:
			case T_EXEC:
			case T_EXECUTE:
			case T_FALSE:
			case T_FLOAT:
			case T_FOR:
			case T_IF:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_INTERVAL:
			case T_MAX:
			case T_MIN:
			case T_NCHAR:
			case T_NVARCHAR:
			case T_NULL:
			case T_NUMERIC:
			case T_NUMBER:
			case T_PLS_INTEGER:
			case T_REAL:
			case T_RESULT_SET_LOCATOR:
			case T_RETURN:
			case T_TRIM:
			case T_SEL:
			case T_SELECT:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SIMPLE_INTEGER:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_STRING:
			case T_SUBSTRING:
			case T_SUM:
			case T_SYS_REFCURSOR:
			case T_TIMESTAMP:
			case T_TINYINT:
			case T_TRUE:
			case T_VAR:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VOID:
			case T_WITH:
			case T_XML:
			case T_SUMMARIZE:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_MAX_PART_STRING:
			case T_MIN_PART_STRING:
			case T_MAX_PART_INT:
			case T_MIN_PART_INT:
			case T_MAX_PART_DATE:
			case T_MIN_PART_DATE:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_ADD:
			case T_DIV:
			case T_MINUS_MINUS:
			case T_OPEN_B:
			case T_OPEN_P:
			case T_PLUS_PLUS:
			case T_SEMICOLON:
			case T_SUB:
			case L_ID:
			case L_S_STRING:
			case L_D_STRING:
			case L_INT:
			case L_DEC:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				stmt();
				setState(379);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(378);
					match(T_SEMICOLON);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Block_endContext extends ParserRuleContext {
		public TerminalNode T_END() { return getToken(PLHQLStatementsParser.T_END, 0); }
		public Block_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterBlock_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitBlock_end(this);
		}
	}

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(384);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Proc_blockContext extends ParserRuleContext {
		public Begin_end_blockContext begin_end_block() {
			return getRuleContext(Begin_end_blockContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode T_GO() { return getToken(PLHQLStatementsParser.T_GO, 0); }
		public Proc_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterProc_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitProc_block(this);
		}
	}

	public final Proc_blockContext proc_block() throws RecognitionException {
		Proc_blockContext _localctx = new Proc_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_proc_block);
		try {
			int _alt;
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(388); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(387);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(390); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(393);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(392);
					match(T_GO);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class C_stmtContext extends ParserRuleContext {
		public Assignment_c_stmtContext assignment_c_stmt() {
			return getRuleContext(Assignment_c_stmtContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(PLHQLStatementsParser.T_SEMICOLON, 0); }
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public If_c_stmtContext if_c_stmt() {
			return getRuleContext(If_c_stmtContext.class,0);
		}
		public For_c_stmtContext for_c_stmt() {
			return getRuleContext(For_c_stmtContext.class,0);
		}
		public C_functionContext c_function() {
			return getRuleContext(C_functionContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public C_blockContext c_block() {
			return getRuleContext(C_blockContext.class,0);
		}
		public General_delcaration_c_stmtContext general_delcaration_c_stmt() {
			return getRuleContext(General_delcaration_c_stmtContext.class,0);
		}
		public Call_stmtContext call_stmt() {
			return getRuleContext(Call_stmtContext.class,0);
		}
		public C_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterC_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitC_stmt(this);
		}
	}

	public final C_stmtContext c_stmt() throws RecognitionException {
		C_stmtContext _localctx = new C_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_c_stmt);
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				assignment_c_stmt();
				setState(398);
				match(T_SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				break_stmt();
				setState(401);
				match(T_SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				if_c_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(404);
				for_c_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(405);
				c_function();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(406);
				return_stmt();
				setState(407);
				match(T_SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(409);
				c_block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(410);
				general_delcaration_c_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(411);
				call_stmt();
				setState(412);
				match(T_SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class C_blockContext extends ParserRuleContext {
		public TerminalNode T_OPEN_B() { return getToken(PLHQLStatementsParser.T_OPEN_B, 0); }
		public TerminalNode T_CLOSE_B() { return getToken(PLHQLStatementsParser.T_CLOSE_B, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public C_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterC_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitC_block(this);
		}
	}

	public final C_blockContext c_block() throws RecognitionException {
		C_blockContext _localctx = new C_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_c_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(T_OPEN_B);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T_AVG) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BINARY_INTEGER) | (1L << T_BIT) | (1L << T_BREAK) | (1L << T_CASE) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CURRENT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T_DATE - 67)) | (1L << (T_DATETIME - 67)) | (1L << (T_DEC - 67)) | (1L << (T_DECIMAL - 67)) | (1L << (T_DECLARE - 67)) | (1L << (T_DOUBLE - 67)) | (1L << (T_EXEC - 67)) | (1L << (T_EXECUTE - 67)) | (1L << (T_FALSE - 67)) | (1L << (T_FLOAT - 67)) | (1L << (T_FOR - 67)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (T_IF - 133)) | (1L << (T_INT - 133)) | (1L << (T_INT2 - 133)) | (1L << (T_INT4 - 133)) | (1L << (T_INT8 - 133)) | (1L << (T_INTEGER - 133)) | (1L << (T_INTERVAL - 133)) | (1L << (T_MAX - 133)) | (1L << (T_MIN - 133)) | (1L << (T_NCHAR - 133)) | (1L << (T_NVARCHAR - 133)) | (1L << (T_NULL - 133)) | (1L << (T_NUMERIC - 133)) | (1L << (T_NUMBER - 133)))) != 0) || ((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (T_PLS_INTEGER - 213)) | (1L << (T_REAL - 213)) | (1L << (T_RESULT_SET_LOCATOR - 213)) | (1L << (T_RETURN - 213)) | (1L << (T_TRIM - 213)) | (1L << (T_SEL - 213)) | (1L << (T_SELECT - 213)) | (1L << (T_SIMPLE_DOUBLE - 213)) | (1L << (T_SIMPLE_FLOAT - 213)) | (1L << (T_SIMPLE_INTEGER - 213)) | (1L << (T_SMALLDATETIME - 213)) | (1L << (T_SMALLINT - 213)) | (1L << (T_STRING - 213)))) != 0) || ((((_la - 278)) & ~0x3f) == 0 && ((1L << (_la - 278)) & ((1L << (T_SUBSTRING - 278)) | (1L << (T_SUM - 278)) | (1L << (T_SYS_REFCURSOR - 278)) | (1L << (T_TIMESTAMP - 278)) | (1L << (T_TINYINT - 278)) | (1L << (T_TRUE - 278)) | (1L << (T_VAR - 278)) | (1L << (T_VARCHAR - 278)) | (1L << (T_VARCHAR2 - 278)) | (1L << (T_VOID - 278)) | (1L << (T_WITH - 278)) | (1L << (T_XML - 278)) | (1L << (T_SUMMARIZE - 278)) | (1L << (T_ACTIVITY_COUNT - 278)) | (1L << (T_CUME_DIST - 278)) | (1L << (T_CURRENT_DATE - 278)) | (1L << (T_CURRENT_TIMESTAMP - 278)) | (1L << (T_CURRENT_USER - 278)) | (1L << (T_DENSE_RANK - 278)) | (1L << (T_FIRST_VALUE - 278)) | (1L << (T_LAG - 278)) | (1L << (T_LAST_VALUE - 278)) | (1L << (T_LEAD - 278)) | (1L << (T_MAX_PART_STRING - 278)) | (1L << (T_MIN_PART_STRING - 278)) | (1L << (T_MAX_PART_INT - 278)) | (1L << (T_MIN_PART_INT - 278)) | (1L << (T_MAX_PART_DATE - 278)) | (1L << (T_MIN_PART_DATE - 278)) | (1L << (T_PART_COUNT - 278)) | (1L << (T_PART_LOC - 278)) | (1L << (T_RANK - 278)) | (1L << (T_ROW_NUMBER - 278)) | (1L << (T_STDEV - 278)))) != 0) || ((((_la - 342)) & ~0x3f) == 0 && ((1L << (_la - 342)) & ((1L << (T_SYSDATE - 342)) | (1L << (T_VARIANCE - 342)) | (1L << (T_USER - 342)) | (1L << (T_ADD - 342)) | (1L << (T_DIV - 342)) | (1L << (T_MINUS_MINUS - 342)) | (1L << (T_OPEN_B - 342)) | (1L << (T_OPEN_P - 342)) | (1L << (T_PLUS_PLUS - 342)) | (1L << (T_SEMICOLON - 342)) | (1L << (T_SUB - 342)) | (1L << (L_ID - 342)) | (1L << (L_S_STRING - 342)) | (1L << (L_D_STRING - 342)) | (1L << (L_INT - 342)) | (1L << (L_DEC - 342)))) != 0)) {
				{
				{
				setState(417);
				stmt();
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(423);
			match(T_CLOSE_B);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public Assignment_stmtContext assignment_stmt() {
			return getRuleContext(Assignment_stmtContext.class,0);
		}
		public Break_stmtContext break_stmt() {
			return getRuleContext(Break_stmtContext.class,0);
		}
		public Call_stmtContext call_stmt() {
			return getRuleContext(Call_stmtContext.class,0);
		}
		public Create_database_stmtContext create_database_stmt() {
			return getRuleContext(Create_database_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_local_temp_table_stmtContext create_local_temp_table_stmt() {
			return getRuleContext(Create_local_temp_table_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Declare_stmtContext declare_stmt() {
			return getRuleContext(Declare_stmtContext.class,0);
		}
		public Exec_stmtContext exec_stmt() {
			return getRuleContext(Exec_stmtContext.class,0);
		}
		public For_range_stmtContext for_range_stmt() {
			return getRuleContext(For_range_stmtContext.class,0);
		}
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public C_stmtContext c_stmt() {
			return getRuleContext(C_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Null_stmtContext null_stmt() {
			return getRuleContext(Null_stmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Semicolon_stmtContext semicolon_stmt() {
			return getRuleContext(Semicolon_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stmt);
		try {
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(426);
				break_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(427);
				call_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(428);
				create_database_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(429);
				create_index_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(430);
				create_local_temp_table_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(431);
				create_table_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(432);
				declare_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(433);
				exec_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(434);
				for_range_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(435);
				if_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(436);
				c_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(437);
				return_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(438);
				null_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(439);
				expr(0);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(440);
				semicolon_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Semicolon_stmtContext extends ParserRuleContext {
		public TerminalNode T_SEMICOLON() { return getToken(PLHQLStatementsParser.T_SEMICOLON, 0); }
		public TerminalNode T_DIV() { return getToken(PLHQLStatementsParser.T_DIV, 0); }
		public Semicolon_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterSemicolon_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitSemicolon_stmt(this);
		}
	}

	public final Semicolon_stmtContext semicolon_stmt() throws RecognitionException {
		Semicolon_stmtContext _localctx = new Semicolon_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_semicolon_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1 || _la==T_DIV || _la==T_SEMICOLON) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_stmtContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(PLHQLStatementsParser.T_NULL, 0); }
		public Null_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterNull_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitNull_stmt(this);
		}
	}

	public final Null_stmtContext null_stmt() throws RecognitionException {
		Null_stmtContext _localctx = new Null_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_null_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmtContext extends ParserRuleContext {
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Assignment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterAssignment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitAssignment_stmt(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			assignment_stmt_item();
			setState(452);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(448);
					match(T_COMMA);
					setState(449);
					assignment_stmt_item();
					}
					} 
				}
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_c_stmtContext extends ParserRuleContext {
		public List<Assignment_c_stmt_itemContext> assignment_c_stmt_item() {
			return getRuleContexts(Assignment_c_stmt_itemContext.class);
		}
		public Assignment_c_stmt_itemContext assignment_c_stmt_item(int i) {
			return getRuleContext(Assignment_c_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Assignment_c_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_c_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterAssignment_c_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitAssignment_c_stmt(this);
		}
	}

	public final Assignment_c_stmtContext assignment_c_stmt() throws RecognitionException {
		Assignment_c_stmtContext _localctx = new Assignment_c_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment_c_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			assignment_c_stmt_item();
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(456);
				match(T_COMMA);
				setState(457);
				assignment_c_stmt_item();
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_itemContext extends ParserRuleContext {
		public Assignment_stmt_single_itemContext assignment_stmt_single_item() {
			return getRuleContext(Assignment_stmt_single_itemContext.class,0);
		}
		public Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() {
			return getRuleContext(Assignment_stmt_multiple_itemContext.class,0);
		}
		public Assignment_stmt_select_itemContext assignment_stmt_select_item() {
			return getRuleContext(Assignment_stmt_select_itemContext.class,0);
		}
		public Assignment_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterAssignment_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitAssignment_stmt_item(this);
		}
	}

	public final Assignment_stmt_itemContext assignment_stmt_item() throws RecognitionException {
		Assignment_stmt_itemContext _localctx = new Assignment_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment_stmt_item);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				assignment_stmt_single_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				assignment_stmt_multiple_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				assignment_stmt_select_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_c_stmt_itemContext extends ParserRuleContext {
		public Assignment_c_stmt_single_itemContext assignment_c_stmt_single_item() {
			return getRuleContext(Assignment_c_stmt_single_itemContext.class,0);
		}
		public Assignment_c_stmt_multiple_itemContext assignment_c_stmt_multiple_item() {
			return getRuleContext(Assignment_c_stmt_multiple_itemContext.class,0);
		}
		public Assignment_c_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_c_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterAssignment_c_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitAssignment_c_stmt_item(this);
		}
	}

	public final Assignment_c_stmt_itemContext assignment_c_stmt_item() throws RecognitionException {
		Assignment_c_stmt_itemContext _localctx = new Assignment_c_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment_c_stmt_item);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_MINUS_MINUS:
			case T_PLUS_PLUS:
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(468);
				assignment_c_stmt_single_item();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				assignment_c_stmt_multiple_item();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_single_itemContext extends ParserRuleContext {
		public IdentContext ident;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(PLHQLStatementsParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(PLHQLStatementsParser.T_COLON, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public Assignment_stmt_single_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_single_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterAssignment_stmt_single_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitAssignment_stmt_single_item(this);
		}
	}

	public final Assignment_stmt_single_itemContext assignment_stmt_single_item() throws RecognitionException {
		Assignment_stmt_single_itemContext _localctx = new Assignment_stmt_single_itemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment_stmt_single_item);
		int _la;
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				((Assignment_stmt_single_itemContext)_localctx).ident = ident();
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(473);
					match(T_COLON);
					}
				}

				setState(476);
				match(T_EQUAL);
				setState(477);
				expr(0);
				((C_functionContext)getInvokingContext(59)).unassignedVariables.remove((((Assignment_stmt_single_itemContext)_localctx).ident!=null?_input.getText(((Assignment_stmt_single_itemContext)_localctx).ident.start,((Assignment_stmt_single_itemContext)_localctx).ident.stop):null));
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(T_OPEN_P);
				setState(481);
				((Assignment_stmt_single_itemContext)_localctx).ident = ident();
				setState(482);
				match(T_CLOSE_P);
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(483);
					match(T_COLON);
					}
				}

				setState(486);
				match(T_EQUAL);
				setState(487);
				expr(0);
				((C_functionContext)getInvokingContext(59)).unassignedVariables.remove((((Assignment_stmt_single_itemContext)_localctx).ident!=null?_input.getText(((Assignment_stmt_single_itemContext)_localctx).ident.start,((Assignment_stmt_single_itemContext)_localctx).ident.stop):null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_c_stmt_single_itemContext extends ParserRuleContext {
		public IdentContext ident;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Increment_decrement_assignmentContext increment_decrement_assignment() {
			return getRuleContext(Increment_decrement_assignmentContext.class,0);
		}
		public Assignment_c_stmt_single_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_c_stmt_single_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterAssignment_c_stmt_single_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitAssignment_c_stmt_single_item(this);
		}
	}

	public final Assignment_c_stmt_single_itemContext assignment_c_stmt_single_item() throws RecognitionException {
		Assignment_c_stmt_single_itemContext _localctx = new Assignment_c_stmt_single_itemContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment_c_stmt_single_item);
		try {
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				((Assignment_c_stmt_single_itemContext)_localctx).ident = ident();
				setState(493);
				assignment_operator();
				setState(494);
				expr(0);
				((C_functionContext)getInvokingContext(59)).unassignedVariables.remove((((Assignment_c_stmt_single_itemContext)_localctx).ident!=null?_input.getText(((Assignment_c_stmt_single_itemContext)_localctx).ident.start,((Assignment_c_stmt_single_itemContext)_localctx).ident.stop):null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(497);
				increment_decrement_assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Increment_decrement_assignmentContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_PLUS_PLUS() { return getToken(PLHQLStatementsParser.T_PLUS_PLUS, 0); }
		public TerminalNode T_MINUS_MINUS() { return getToken(PLHQLStatementsParser.T_MINUS_MINUS, 0); }
		public Increment_decrement_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment_decrement_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterIncrement_decrement_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitIncrement_decrement_assignment(this);
		}
	}

	public final Increment_decrement_assignmentContext increment_decrement_assignment() throws RecognitionException {
		Increment_decrement_assignmentContext _localctx = new Increment_decrement_assignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_increment_decrement_assignment);
		int _la;
		try {
			setState(505);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(500);
				ident();
				setState(501);
				_la = _input.LA(1);
				if ( !(_la==T_MINUS_MINUS || _la==T_PLUS_PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_MINUS_MINUS:
			case T_PLUS_PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				_la = _input.LA(1);
				if ( !(_la==T_MINUS_MINUS || _la==T_PLUS_PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(504);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_multiple_itemContext extends ParserRuleContext {
		public IdentContext ident;
		public List<TerminalNode> T_OPEN_P() { return getTokens(PLHQLStatementsParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(PLHQLStatementsParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(PLHQLStatementsParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(PLHQLStatementsParser.T_CLOSE_P, i);
		}
		public Assignment_operatorContext assignment_operator() {
			return getRuleContext(Assignment_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public TerminalNode T_COLON() { return getToken(PLHQLStatementsParser.T_COLON, 0); }
		public Assignment_stmt_multiple_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_multiple_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterAssignment_stmt_multiple_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitAssignment_stmt_multiple_item(this);
		}
	}

	public final Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() throws RecognitionException {
		Assignment_stmt_multiple_itemContext _localctx = new Assignment_stmt_multiple_itemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_assignment_stmt_multiple_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(T_OPEN_P);
			setState(508);
			((Assignment_stmt_multiple_itemContext)_localctx).ident = ident();
			((C_functionContext)getInvokingContext(59)).unassignedVariables.remove((((Assignment_stmt_multiple_itemContext)_localctx).ident!=null?_input.getText(((Assignment_stmt_multiple_itemContext)_localctx).ident.start,((Assignment_stmt_multiple_itemContext)_localctx).ident.stop):null));
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(510);
				match(T_COMMA);
				setState(511);
				((Assignment_stmt_multiple_itemContext)_localctx).ident = ident();
				((C_functionContext)getInvokingContext(59)).unassignedVariables.remove((((Assignment_stmt_multiple_itemContext)_localctx).ident!=null?_input.getText(((Assignment_stmt_multiple_itemContext)_localctx).ident.start,((Assignment_stmt_multiple_itemContext)_localctx).ident.stop):null));
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519);
			match(T_CLOSE_P);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(520);
				match(T_COLON);
				}
			}

			setState(523);
			assignment_operator();
			setState(524);
			match(T_OPEN_P);
			setState(525);
			expr(0);
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(526);
				match(T_COMMA);
				setState(527);
				expr(0);
				}
				}
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(533);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_c_stmt_multiple_itemContext extends ParserRuleContext {
		public IdentContext ident;
		public List<TerminalNode> T_OPEN_P() { return getTokens(PLHQLStatementsParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(PLHQLStatementsParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(PLHQLStatementsParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(PLHQLStatementsParser.T_CLOSE_P, i);
		}
		public TerminalNode T_EQUAL() { return getToken(PLHQLStatementsParser.T_EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Assignment_c_stmt_multiple_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_c_stmt_multiple_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterAssignment_c_stmt_multiple_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitAssignment_c_stmt_multiple_item(this);
		}
	}

	public final Assignment_c_stmt_multiple_itemContext assignment_c_stmt_multiple_item() throws RecognitionException {
		Assignment_c_stmt_multiple_itemContext _localctx = new Assignment_c_stmt_multiple_itemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment_c_stmt_multiple_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(T_OPEN_P);
			setState(536);
			((Assignment_c_stmt_multiple_itemContext)_localctx).ident = ident();
			((C_functionContext)getInvokingContext(59)).unassignedVariables.remove((((Assignment_c_stmt_multiple_itemContext)_localctx).ident!=null?_input.getText(((Assignment_c_stmt_multiple_itemContext)_localctx).ident.start,((Assignment_c_stmt_multiple_itemContext)_localctx).ident.stop):null));
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(538);
				match(T_COMMA);
				setState(539);
				((Assignment_c_stmt_multiple_itemContext)_localctx).ident = ident();
				((C_functionContext)getInvokingContext(59)).unassignedVariables.remove((((Assignment_c_stmt_multiple_itemContext)_localctx).ident!=null?_input.getText(((Assignment_c_stmt_multiple_itemContext)_localctx).ident.start,((Assignment_c_stmt_multiple_itemContext)_localctx).ident.stop):null));
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
			match(T_CLOSE_P);
			setState(548);
			match(T_EQUAL);
			setState(549);
			match(T_OPEN_P);
			setState(550);
			expr(0);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(551);
				match(T_COMMA);
				setState(552);
				expr(0);
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(558);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_stmt_select_itemContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(PLHQLStatementsParser.T_EQUAL, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(PLHQLStatementsParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(PLHQLStatementsParser.T_OPEN_P, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(PLHQLStatementsParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(PLHQLStatementsParser.T_CLOSE_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_COLON() { return getToken(PLHQLStatementsParser.T_COLON, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Assignment_stmt_select_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_stmt_select_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterAssignment_stmt_select_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitAssignment_stmt_select_item(this);
		}
	}

	public final Assignment_stmt_select_itemContext assignment_stmt_select_item() throws RecognitionException {
		Assignment_stmt_select_itemContext _localctx = new Assignment_stmt_select_itemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignment_stmt_select_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(560);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(561);
				match(T_OPEN_P);
				setState(562);
				ident();
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(563);
					match(T_COMMA);
					setState(564);
					ident();
					}
					}
					setState(569);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(570);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(574);
				match(T_COLON);
				}
			}

			setState(577);
			match(T_EQUAL);
			setState(578);
			match(T_OPEN_P);
			setState(579);
			select_stmt();
			setState(580);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Break_stmtContext extends ParserRuleContext {
		public TerminalNode T_BREAK() { return getToken(PLHQLStatementsParser.T_BREAK, 0); }
		public Break_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterBreak_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitBreak_stmt(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(T_BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Call_stmtContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Call_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCall_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCall_stmt(this);
		}
	}

	public final Call_stmtContext call_stmt() throws RecognitionException {
		Call_stmtContext _localctx = new Call_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			ident();
			{
			setState(585);
			match(T_OPEN_P);
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(586);
				expr_func_params();
				}
				break;
			}
			setState(589);
			match(T_CLOSE_P);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_stmtContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(PLHQLStatementsParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Declare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterDeclare_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitDeclare_stmt(this);
		}
	}

	public final Declare_stmtContext declare_stmt() throws RecognitionException {
		Declare_stmtContext _localctx = new Declare_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(T_DECLARE);
			setState(592);
			declare_stmt_item();
			setState(597);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(593);
					match(T_COMMA);
					setState(594);
					declare_stmt_item();
					}
					} 
				}
				setState(599);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_delcare_stmtContext extends ParserRuleContext {
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Error_delcare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_delcare_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_delcare_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_delcare_stmt(this);
		}
	}

	public final Error_delcare_stmtContext error_delcare_stmt() throws RecognitionException {
		Error_delcare_stmtContext _localctx = new Error_delcare_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_error_delcare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			declare_stmt_item();
			setState(605);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(601);
					match(T_COMMA);
					setState(602);
					declare_stmt_item();
					}
					} 
				}
				setState(607);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			notifyErrorListeners("Expected 'DECLARE' keyword");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_blockContext extends ParserRuleContext {
		public TerminalNode T_DECLARE() { return getToken(PLHQLStatementsParser.T_DECLARE, 0); }
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(PLHQLStatementsParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(PLHQLStatementsParser.T_SEMICOLON, i);
		}
		public Declare_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterDeclare_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitDeclare_block(this);
		}
	}

	public final Declare_blockContext declare_block() throws RecognitionException {
		Declare_blockContext _localctx = new Declare_blockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declare_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			match(T_DECLARE);
			setState(611);
			declare_stmt_item();
			setState(612);
			match(T_SEMICOLON);
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==L_ID) {
				{
				{
				setState(613);
				declare_stmt_item();
				setState(614);
				match(T_SEMICOLON);
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_block_inplaceContext extends ParserRuleContext {
		public List<Declare_stmt_itemContext> declare_stmt_item() {
			return getRuleContexts(Declare_stmt_itemContext.class);
		}
		public Declare_stmt_itemContext declare_stmt_item(int i) {
			return getRuleContext(Declare_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(PLHQLStatementsParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(PLHQLStatementsParser.T_SEMICOLON, i);
		}
		public Declare_block_inplaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_block_inplace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterDeclare_block_inplace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitDeclare_block_inplace(this);
		}
	}

	public final Declare_block_inplaceContext declare_block_inplace() throws RecognitionException {
		Declare_block_inplaceContext _localctx = new Declare_block_inplaceContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			declare_stmt_item();
			setState(622);
			match(T_SEMICOLON);
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(623);
					declare_stmt_item();
					setState(624);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_stmt_itemContext extends ParserRuleContext {
		public Declare_var_itemContext declare_var_item() {
			return getRuleContext(Declare_var_itemContext.class,0);
		}
		public Declare_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterDeclare_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitDeclare_stmt_item(this);
		}
	}

	public final Declare_stmt_itemContext declare_stmt_item() throws RecognitionException {
		Declare_stmt_itemContext _localctx = new Declare_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_declare_stmt_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			declare_var_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_var_itemContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public TerminalNode T_AS() { return getToken(PLHQLStatementsParser.T_AS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_CONSTANT() { return getToken(PLHQLStatementsParser.T_CONSTANT, 0); }
		public Declare_var_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_var_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterDeclare_var_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitDeclare_var_item(this);
		}
	}

	public final Declare_var_itemContext declare_var_item() throws RecognitionException {
		Declare_var_itemContext _localctx = new Declare_var_itemContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_declare_var_item);
		int _la;
		try {
			int _alt;
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(633);
				ident();
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(634);
					match(T_COMMA);
					setState(635);
					ident();
					}
					}
					setState(640);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(641);
					match(T_AS);
					}
				}

				setState(644);
				dtype();
				setState(646);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(645);
					dtype_len();
					}
					break;
				}
				setState(651);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(648);
						dtype_attr();
						}
						} 
					}
					setState(653);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(655);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(654);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(657);
				ident();
				setState(658);
				match(T_CONSTANT);
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(659);
					match(T_AS);
					}
				}

				setState(662);
				dtype();
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(663);
					dtype_len();
					}
				}

				setState(666);
				dtype_default();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(PLHQLStatementsParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(PLHQLStatementsParser.T_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(PLHQLStatementsParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(PLHQLStatementsParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(PLHQLStatementsParser.T_EXISTS, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_stmt(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			match(T_CREATE);
			setState(671);
			match(T_TABLE);
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IF) {
				{
				setState(672);
				match(T_IF);
				setState(673);
				match(T_NOT);
				setState(674);
				match(T_EXISTS);
				}
			}

			setState(677);
			table_name();
			setState(678);
			create_table_preoptions();
			setState(679);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_create_stmtContext extends ParserRuleContext {
		public Error_create_table_stmtContext error_create_table_stmt() {
			return getRuleContext(Error_create_table_stmtContext.class,0);
		}
		public Error_create_index_stmtContext error_create_index_stmt() {
			return getRuleContext(Error_create_index_stmtContext.class,0);
		}
		public Error_create_procedure_stmtContext error_create_procedure_stmt() {
			return getRuleContext(Error_create_procedure_stmtContext.class,0);
		}
		public Error_create_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_create_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_create_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_create_stmt(this);
		}
	}

	public final Error_create_stmtContext error_create_stmt() throws RecognitionException {
		Error_create_stmtContext _localctx = new Error_create_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_error_create_stmt);
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				error_create_table_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				error_create_index_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(683);
				error_create_procedure_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_create_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(PLHQLStatementsParser.T_CREATE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(PLHQLStatementsParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(PLHQLStatementsParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(PLHQLStatementsParser.T_EXISTS, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public Error_create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_create_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_create_table_stmt(this);
		}
	}

	public final Error_create_table_stmtContext error_create_table_stmt() throws RecognitionException {
		Error_create_table_stmtContext _localctx = new Error_create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_error_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(T_CREATE);
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IF) {
				{
				setState(687);
				match(T_IF);
				setState(688);
				match(T_NOT);
				setState(689);
				match(T_EXISTS);
				}
			}

			setState(692);
			table_name();
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED) {
				{
				setState(693);
				create_table_preoptions();
				}
			}

			setState(696);
			create_table_definition();
			notifyErrorListeners("Expected 'TABLE' keyword");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_local_temp_table_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(PLHQLStatementsParser.T_CREATE, 0); }
		public TerminalNode T_TABLE() { return getToken(PLHQLStatementsParser.T_TABLE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_LOCAL() { return getToken(PLHQLStatementsParser.T_LOCAL, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(PLHQLStatementsParser.T_TEMPORARY, 0); }
		public TerminalNode T_VOLATILE() { return getToken(PLHQLStatementsParser.T_VOLATILE, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
		public TerminalNode T_SET() { return getToken(PLHQLStatementsParser.T_SET, 0); }
		public TerminalNode T_MULTISET() { return getToken(PLHQLStatementsParser.T_MULTISET, 0); }
		public Create_local_temp_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_local_temp_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_local_temp_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_local_temp_table_stmt(this);
		}
	}

	public final Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		Create_local_temp_table_stmtContext _localctx = new Create_local_temp_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			match(T_CREATE);
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(700);
				match(T_LOCAL);
				setState(701);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(702);
					_la = _input.LA(1);
					if ( !(_la==T_MULTISET || _la==T_SET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(705);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(708);
			match(T_TABLE);
			setState(709);
			ident();
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED) {
				{
				setState(710);
				create_table_preoptions();
				}
			}

			setState(713);
			create_table_definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_definitionContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public Create_table_columnsContext create_table_columns() {
			return getRuleContext(Create_table_columnsContext.class,0);
		}
		public Create_table_optionsContext create_table_options() {
			return getRuleContext(Create_table_optionsContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(PLHQLStatementsParser.T_AS, 0); }
		public Create_table_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_definition(this);
		}
	}

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(715);
					match(T_AS);
					}
				}

				setState(718);
				match(T_OPEN_P);
				setState(719);
				select_stmt();
				setState(720);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(722);
					match(T_AS);
					}
				}

				setState(725);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(726);
				match(T_OPEN_P);
				setState(727);
				create_table_columns();
				setState(728);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(733);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(732);
				create_table_options();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_columnsContext extends ParserRuleContext {
		public List<Create_table_columns_itemContext> create_table_columns_item() {
			return getRuleContexts(Create_table_columns_itemContext.class);
		}
		public Create_table_columns_itemContext create_table_columns_item(int i) {
			return getRuleContext(Create_table_columns_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Create_table_columnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_columns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_columns(this);
		}
	}

	public final Create_table_columnsContext create_table_columns() throws RecognitionException {
		Create_table_columnsContext _localctx = new Create_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			create_table_columns_item();
			setState(740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(736);
				match(T_COMMA);
				setState(737);
				create_table_columns_item();
				}
				}
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_columns_itemContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public List<Create_table_column_inline_consContext> create_table_column_inline_cons() {
			return getRuleContexts(Create_table_column_inline_consContext.class);
		}
		public Create_table_column_inline_consContext create_table_column_inline_cons(int i) {
			return getRuleContext(Create_table_column_inline_consContext.class,i);
		}
		public Create_table_column_consContext create_table_column_cons() {
			return getRuleContext(Create_table_column_consContext.class,0);
		}
		public TerminalNode T_CONSTRAINT() { return getToken(PLHQLStatementsParser.T_CONSTRAINT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_columns_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_columns_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_columns_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_columns_item(this);
		}
	}

	public final Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		Create_table_columns_itemContext _localctx = new Create_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_create_table_columns_item);
		int _la;
		try {
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BINARY_INTEGER:
			case T_BIT:
			case T_CHAR:
			case T_DATE:
			case T_DATETIME:
			case T_DEC:
			case T_DECIMAL:
			case T_DOUBLE:
			case T_FLOAT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_NCHAR:
			case T_NVARCHAR:
			case T_NUMERIC:
			case T_NUMBER:
			case T_PLS_INTEGER:
			case T_REAL:
			case T_RESULT_SET_LOCATOR:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SIMPLE_INTEGER:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_STRING:
			case T_SYS_REFCURSOR:
			case T_TIMESTAMP:
			case T_TINYINT:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VOID:
			case T_XML:
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(743);
				dtype();
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(744);
					dtype_len();
					}
				}

				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_CASESPECIFIC) | (1L << T_CHARACTER) | (1L << T_CS))) != 0) || _la==T_NOT || _la==T_NULL) {
					{
					{
					setState(747);
					dtype_attr();
					}
					}
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(753);
				column_name();
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T_DEFAULT - 74)) | (1L << (T_ENABLE - 74)) | (1L << (T_IDENTITY - 74)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOT - 192)) | (1L << (T_NULL - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_REFERENCES - 192)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (T_UNIQUE - 298)) | (1L << (T_WITH - 298)) | (1L << (T_COLON - 298)) | (1L << (T_EQUAL - 298)))) != 0)) {
					{
					{
					setState(754);
					create_table_column_inline_cons();
					}
					}
					setState(759);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_CONSTRAINT:
			case T_FOREIGN:
			case T_PRIMARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(760);
					match(T_CONSTRAINT);
					setState(761);
					ident();
					}
				}

				setState(764);
				create_table_column_cons();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_column_inline_consContext extends ParserRuleContext {
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public TerminalNode T_NULL() { return getToken(PLHQLStatementsParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(PLHQLStatementsParser.T_NOT, 0); }
		public TerminalNode T_PRIMARY() { return getToken(PLHQLStatementsParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(PLHQLStatementsParser.T_KEY, 0); }
		public TerminalNode T_UNIQUE() { return getToken(PLHQLStatementsParser.T_UNIQUE, 0); }
		public TerminalNode T_REFERENCES() { return getToken(PLHQLStatementsParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public TerminalNode T_IDENTITY() { return getToken(PLHQLStatementsParser.T_IDENTITY, 0); }
		public List<TerminalNode> L_INT() { return getTokens(PLHQLStatementsParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(PLHQLStatementsParser.L_INT, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public TerminalNode T_AUTO_INCREMENT() { return getToken(PLHQLStatementsParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_ENABLE() { return getToken(PLHQLStatementsParser.T_ENABLE, 0); }
		public Create_table_column_inline_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_inline_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_column_inline_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_column_inline_cons(this);
		}
	}

	public final Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		Create_table_column_inline_consContext _localctx = new Create_table_column_inline_consContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(801);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(769);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(770);
					match(T_NOT);
					}
				}

				setState(773);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(774);
				match(T_PRIMARY);
				setState(775);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(776);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(777);
				match(T_REFERENCES);
				setState(778);
				table_name();
				setState(779);
				match(T_OPEN_P);
				setState(780);
				ident();
				setState(781);
				match(T_CLOSE_P);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(782);
					create_table_fk_action();
					}
					}
					setState(787);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(788);
				match(T_IDENTITY);
				setState(789);
				match(T_OPEN_P);
				setState(790);
				match(L_INT);
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(791);
					match(T_COMMA);
					setState(792);
					match(L_INT);
					}
					}
					setState(797);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(798);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(799);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(800);
				match(T_ENABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_column_consContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(PLHQLStatementsParser.T_PRIMARY, 0); }
		public TerminalNode T_KEY() { return getToken(PLHQLStatementsParser.T_KEY, 0); }
		public List<TerminalNode> T_OPEN_P() { return getTokens(PLHQLStatementsParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(PLHQLStatementsParser.T_OPEN_P, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(PLHQLStatementsParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(PLHQLStatementsParser.T_CLOSE_P, i);
		}
		public TerminalNode T_CLUSTERED() { return getToken(PLHQLStatementsParser.T_CLUSTERED, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public TerminalNode T_ENABLE() { return getToken(PLHQLStatementsParser.T_ENABLE, 0); }
		public List<TerminalNode> T_ASC() { return getTokens(PLHQLStatementsParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(PLHQLStatementsParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(PLHQLStatementsParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(PLHQLStatementsParser.T_DESC, i);
		}
		public TerminalNode T_FOREIGN() { return getToken(PLHQLStatementsParser.T_FOREIGN, 0); }
		public TerminalNode T_REFERENCES() { return getToken(PLHQLStatementsParser.T_REFERENCES, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<Create_table_fk_actionContext> create_table_fk_action() {
			return getRuleContexts(Create_table_fk_actionContext.class);
		}
		public Create_table_fk_actionContext create_table_fk_action(int i) {
			return getRuleContext(Create_table_fk_actionContext.class,i);
		}
		public Create_table_column_consContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_column_cons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_column_cons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_column_cons(this);
		}
	}

	public final Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		Create_table_column_consContext _localctx = new Create_table_column_consContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_create_table_column_cons);
		int _la;
		try {
			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(803);
				match(T_PRIMARY);
				setState(804);
				match(T_KEY);
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(805);
					match(T_CLUSTERED);
					}
				}

				setState(808);
				match(T_OPEN_P);
				setState(809);
				ident();
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(810);
					_la = _input.LA(1);
					if ( !(_la==T_ASC || _la==T_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(813);
					match(T_COMMA);
					setState(814);
					ident();
					setState(816);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(815);
						_la = _input.LA(1);
						if ( !(_la==T_ASC || _la==T_DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(822);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(823);
				match(T_CLOSE_P);
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(824);
					match(T_ENABLE);
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(827);
				match(T_FOREIGN);
				setState(828);
				match(T_KEY);
				setState(829);
				match(T_OPEN_P);
				setState(830);
				ident();
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(831);
					match(T_COMMA);
					setState(832);
					ident();
					}
					}
					setState(837);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(838);
				match(T_CLOSE_P);
				setState(839);
				match(T_REFERENCES);
				setState(840);
				table_name();
				setState(841);
				match(T_OPEN_P);
				setState(842);
				ident();
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(843);
					match(T_COMMA);
					setState(844);
					ident();
					}
					}
					setState(849);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(850);
				match(T_CLOSE_P);
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(851);
					create_table_fk_action();
					}
					}
					setState(856);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_fk_actionContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(PLHQLStatementsParser.T_ON, 0); }
		public TerminalNode T_UPDATE() { return getToken(PLHQLStatementsParser.T_UPDATE, 0); }
		public TerminalNode T_DELETE() { return getToken(PLHQLStatementsParser.T_DELETE, 0); }
		public TerminalNode T_NO() { return getToken(PLHQLStatementsParser.T_NO, 0); }
		public TerminalNode T_ACTION() { return getToken(PLHQLStatementsParser.T_ACTION, 0); }
		public TerminalNode T_RESTRICT() { return getToken(PLHQLStatementsParser.T_RESTRICT, 0); }
		public TerminalNode T_SET() { return getToken(PLHQLStatementsParser.T_SET, 0); }
		public TerminalNode T_NULL() { return getToken(PLHQLStatementsParser.T_NULL, 0); }
		public TerminalNode T_DEFAULT() { return getToken(PLHQLStatementsParser.T_DEFAULT, 0); }
		public TerminalNode T_CASCADE() { return getToken(PLHQLStatementsParser.T_CASCADE, 0); }
		public Create_table_fk_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_fk_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_fk_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_fk_action(this);
		}
	}

	public final Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		Create_table_fk_actionContext _localctx = new Create_table_fk_actionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(T_ON);
			setState(860);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(861);
				match(T_NO);
				setState(862);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(863);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(864);
				match(T_SET);
				setState(865);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(866);
				match(T_SET);
				setState(867);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(868);
				match(T_CASCADE);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptionsContext extends ParserRuleContext {
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public TerminalNode T_LOCATION() { return getToken(PLHQLStatementsParser.T_LOCATION, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Create_table_preoptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_preoptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_preoptions(this);
		}
	}

	public final Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		Create_table_preoptionsContext _localctx = new Create_table_preoptionsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_create_table_preoptions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			create_table_options_hive_item();
			setState(872);
			match(T_LOCATION);
			setState(873);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptions_td_itemContext extends ParserRuleContext {
		public TerminalNode T_LOG() { return getToken(PLHQLStatementsParser.T_LOG, 0); }
		public TerminalNode T_FALLBACK() { return getToken(PLHQLStatementsParser.T_FALLBACK, 0); }
		public TerminalNode T_NO() { return getToken(PLHQLStatementsParser.T_NO, 0); }
		public Create_table_preoptions_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_preoptions_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_preoptions_td_item(this);
		}
	}

	public final Create_table_preoptions_td_itemContext create_table_preoptions_td_item() throws RecognitionException {
		Create_table_preoptions_td_itemContext _localctx = new Create_table_preoptions_td_itemContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(875);
				match(T_NO);
				}
			}

			setState(878);
			_la = _input.LA(1);
			if ( !(_la==T_FALLBACK || _la==T_LOG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_optionsContext extends ParserRuleContext {
		public List<Create_table_options_itemContext> create_table_options_item() {
			return getRuleContexts(Create_table_options_itemContext.class);
		}
		public Create_table_options_itemContext create_table_options_item(int i) {
			return getRuleContext(Create_table_options_itemContext.class,i);
		}
		public Create_table_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_options(this);
		}
	}

	public final Create_table_optionsContext create_table_options() throws RecognitionException {
		Create_table_optionsContext _localctx = new Create_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_create_table_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(881); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(880);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(883); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(PLHQLStatementsParser.T_ON, 0); }
		public TerminalNode T_COMMIT() { return getToken(PLHQLStatementsParser.T_COMMIT, 0); }
		public TerminalNode T_ROWS() { return getToken(PLHQLStatementsParser.T_ROWS, 0); }
		public TerminalNode T_DELETE() { return getToken(PLHQLStatementsParser.T_DELETE, 0); }
		public TerminalNode T_PRESERVE() { return getToken(PLHQLStatementsParser.T_PRESERVE, 0); }
		public Create_table_options_ora_itemContext create_table_options_ora_item() {
			return getRuleContext(Create_table_options_ora_itemContext.class,0);
		}
		public Create_table_options_db2_itemContext create_table_options_db2_item() {
			return getRuleContext(Create_table_options_db2_itemContext.class,0);
		}
		public Create_table_options_td_itemContext create_table_options_td_item() {
			return getRuleContext(Create_table_options_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_options_mssql_itemContext create_table_options_mssql_item() {
			return getRuleContext(Create_table_options_mssql_itemContext.class,0);
		}
		public Create_table_options_mysql_itemContext create_table_options_mysql_item() {
			return getRuleContext(Create_table_options_mysql_itemContext.class,0);
		}
		public Create_table_options_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_options_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_options_item(this);
		}
	}

	public final Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		Create_table_options_itemContext _localctx = new Create_table_options_itemContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_create_table_options_item);
		int _la;
		try {
			setState(895);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				match(T_ON);
				setState(886);
				match(T_COMMIT);
				setState(887);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(888);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(889);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(890);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(891);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(892);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(893);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(894);
				create_table_options_mysql_item();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_ora_itemContext extends ParserRuleContext {
		public TerminalNode T_SEGMENT() { return getToken(PLHQLStatementsParser.T_SEGMENT, 0); }
		public TerminalNode T_CREATION() { return getToken(PLHQLStatementsParser.T_CREATION, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(PLHQLStatementsParser.T_IMMEDIATE, 0); }
		public TerminalNode T_DEFERRED() { return getToken(PLHQLStatementsParser.T_DEFERRED, 0); }
		public List<TerminalNode> L_INT() { return getTokens(PLHQLStatementsParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(PLHQLStatementsParser.L_INT, i);
		}
		public TerminalNode T_PCTFREE() { return getToken(PLHQLStatementsParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(PLHQLStatementsParser.T_PCTUSED, 0); }
		public TerminalNode T_INITRANS() { return getToken(PLHQLStatementsParser.T_INITRANS, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(PLHQLStatementsParser.T_MAXTRANS, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(PLHQLStatementsParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_LOGGING() { return getToken(PLHQLStatementsParser.T_LOGGING, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(PLHQLStatementsParser.T_NOLOGGING, 0); }
		public TerminalNode T_STORAGE() { return getToken(PLHQLStatementsParser.T_STORAGE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_TABLESPACE() { return getToken(PLHQLStatementsParser.T_TABLESPACE, 0); }
		public Create_table_options_ora_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_ora_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_options_ora_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_options_ora_item(this);
		}
	}

	public final Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		Create_table_options_ora_itemContext _localctx = new Create_table_options_ora_itemContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(915);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(897);
				match(T_SEGMENT);
				setState(898);
				match(T_CREATION);
				setState(899);
				_la = _input.LA(1);
				if ( !(_la==T_DEFERRED || _la==T_IMMEDIATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_INITRANS:
			case T_MAXTRANS:
			case T_PCTFREE:
			case T_PCTUSED:
				enterOuterAlt(_localctx, 2);
				{
				setState(900);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(901);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(902);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(903);
				_la = _input.LA(1);
				if ( !(_la==T_LOGGING || _la==T_NOLOGGING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T_STORAGE:
				enterOuterAlt(_localctx, 5);
				{
				setState(904);
				match(T_STORAGE);
				setState(905);
				match(T_OPEN_P);
				setState(908); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(908);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(906);
						ident();
						}
						break;
					case L_INT:
						{
						setState(907);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(910); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==L_ID || _la==L_INT );
				setState(912);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(913);
				match(T_TABLESPACE);
				setState(914);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_db2_itemContext extends ParserRuleContext {
		public TerminalNode T_IN() { return getToken(PLHQLStatementsParser.T_IN, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_INDEX() { return getToken(PLHQLStatementsParser.T_INDEX, 0); }
		public TerminalNode T_WITH() { return getToken(PLHQLStatementsParser.T_WITH, 0); }
		public TerminalNode T_REPLACE() { return getToken(PLHQLStatementsParser.T_REPLACE, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(PLHQLStatementsParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_BY() { return getToken(PLHQLStatementsParser.T_BY, 0); }
		public TerminalNode T_HASH() { return getToken(PLHQLStatementsParser.T_HASH, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public TerminalNode T_LOGGED() { return getToken(PLHQLStatementsParser.T_LOGGED, 0); }
		public TerminalNode T_NOT() { return getToken(PLHQLStatementsParser.T_NOT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(PLHQLStatementsParser.T_COMPRESS, 0); }
		public TerminalNode T_YES() { return getToken(PLHQLStatementsParser.T_YES, 0); }
		public TerminalNode T_NO() { return getToken(PLHQLStatementsParser.T_NO, 0); }
		public TerminalNode T_DEFINITION() { return getToken(PLHQLStatementsParser.T_DEFINITION, 0); }
		public TerminalNode T_ONLY() { return getToken(PLHQLStatementsParser.T_ONLY, 0); }
		public TerminalNode T_RESTRICT() { return getToken(PLHQLStatementsParser.T_RESTRICT, 0); }
		public TerminalNode T_ON() { return getToken(PLHQLStatementsParser.T_ON, 0); }
		public TerminalNode T_DROP() { return getToken(PLHQLStatementsParser.T_DROP, 0); }
		public Create_table_options_db2_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_db2_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_options_db2_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_options_db2_item(this);
		}
	}

	public final Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		Create_table_options_db2_itemContext _localctx = new Create_table_options_db2_itemContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(950);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(917);
					match(T_INDEX);
					}
				}

				setState(920);
				match(T_IN);
				setState(921);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				match(T_WITH);
				setState(923);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(924);
				match(T_DISTRIBUTE);
				setState(925);
				match(T_BY);
				setState(926);
				match(T_HASH);
				setState(927);
				match(T_OPEN_P);
				setState(928);
				ident();
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(929);
					match(T_COMMA);
					setState(930);
					ident();
					}
					}
					setState(935);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(936);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(939);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(938);
					match(T_NOT);
					}
				}

				setState(941);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(942);
				match(T_COMPRESS);
				setState(943);
				_la = _input.LA(1);
				if ( !(_la==T_NO || _la==T_YES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(944);
				match(T_DEFINITION);
				setState(945);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(946);
				match(T_WITH);
				setState(947);
				match(T_RESTRICT);
				setState(948);
				match(T_ON);
				setState(949);
				match(T_DROP);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_td_itemContext extends ParserRuleContext {
		public TerminalNode T_PRIMARY() { return getToken(PLHQLStatementsParser.T_PRIMARY, 0); }
		public TerminalNode T_INDEX() { return getToken(PLHQLStatementsParser.T_INDEX, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(PLHQLStatementsParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public TerminalNode T_WITH() { return getToken(PLHQLStatementsParser.T_WITH, 0); }
		public TerminalNode T_DATA() { return getToken(PLHQLStatementsParser.T_DATA, 0); }
		public Create_table_options_td_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_td_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_options_td_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_options_td_item(this);
		}
	}

	public final Create_table_options_td_itemContext create_table_options_td_item() throws RecognitionException {
		Create_table_options_td_itemContext _localctx = new Create_table_options_td_itemContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(953);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(952);
					match(T_UNIQUE);
					}
				}

				setState(955);
				match(T_PRIMARY);
				setState(956);
				match(T_INDEX);
				setState(957);
				match(T_OPEN_P);
				setState(958);
				ident();
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(959);
					match(T_COMMA);
					setState(960);
					ident();
					}
					}
					setState(965);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(966);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(968);
				match(T_WITH);
				setState(969);
				match(T_DATA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_hive_itemContext extends ParserRuleContext {
		public Create_table_hive_row_formatContext create_table_hive_row_format() {
			return getRuleContext(Create_table_hive_row_formatContext.class,0);
		}
		public TerminalNode T_STORED() { return getToken(PLHQLStatementsParser.T_STORED, 0); }
		public TerminalNode T_AS() { return getToken(PLHQLStatementsParser.T_AS, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_table_options_hive_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_hive_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_options_hive_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_options_hive_item(this);
		}
	}

	public final Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		Create_table_options_hive_itemContext _localctx = new Create_table_options_hive_itemContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_create_table_options_hive_item);
		try {
			setState(976);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(972);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(973);
				match(T_STORED);
				setState(974);
				match(T_AS);
				setState(975);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_hive_row_formatContext extends ParserRuleContext {
		public TerminalNode T_ROW() { return getToken(PLHQLStatementsParser.T_ROW, 0); }
		public TerminalNode T_FORMAT() { return getToken(PLHQLStatementsParser.T_FORMAT, 0); }
		public TerminalNode T_DELIMITED() { return getToken(PLHQLStatementsParser.T_DELIMITED, 0); }
		public TerminalNode T_FIELDS() { return getToken(PLHQLStatementsParser.T_FIELDS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(PLHQLStatementsParser.T_TERMINATED, 0); }
		public TerminalNode T_BY() { return getToken(PLHQLStatementsParser.T_BY, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Create_table_hive_row_formatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_hive_row_format(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_hive_row_format(this);
		}
	}

	public final Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		Create_table_hive_row_formatContext _localctx = new Create_table_hive_row_formatContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_create_table_hive_row_format);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(T_ROW);
			setState(979);
			match(T_FORMAT);
			setState(980);
			match(T_DELIMITED);
			setState(981);
			match(T_FIELDS);
			setState(982);
			match(T_TERMINATED);
			setState(983);
			match(T_BY);
			setState(984);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_mssql_itemContext extends ParserRuleContext {
		public TerminalNode T_ON() { return getToken(PLHQLStatementsParser.T_ON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(PLHQLStatementsParser.T_TEXTIMAGE_ON, 0); }
		public Create_table_options_mssql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mssql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_options_mssql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_options_mssql_item(this);
		}
	}

	public final Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		Create_table_options_mssql_itemContext _localctx = new Create_table_options_mssql_itemContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_create_table_options_mssql_item);
		try {
			setState(990);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(986);
				match(T_ON);
				setState(987);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(988);
				match(T_TEXTIMAGE_ON);
				setState(989);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_options_mysql_itemContext extends ParserRuleContext {
		public TerminalNode T_AUTO_INCREMENT() { return getToken(PLHQLStatementsParser.T_AUTO_INCREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(PLHQLStatementsParser.T_EQUAL, 0); }
		public TerminalNode T_COMMENT() { return getToken(PLHQLStatementsParser.T_COMMENT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(PLHQLStatementsParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(PLHQLStatementsParser.T_SET, 0); }
		public TerminalNode T_CHARSET() { return getToken(PLHQLStatementsParser.T_CHARSET, 0); }
		public TerminalNode T_DEFAULT() { return getToken(PLHQLStatementsParser.T_DEFAULT, 0); }
		public TerminalNode T_ENGINE() { return getToken(PLHQLStatementsParser.T_ENGINE, 0); }
		public Create_table_options_mysql_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_options_mysql_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_options_mysql_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_options_mysql_item(this);
		}
	}

	public final Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		Create_table_options_mysql_itemContext _localctx = new Create_table_options_mysql_itemContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(1019);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(992);
				match(T_AUTO_INCREMENT);
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(993);
					match(T_EQUAL);
					}
				}

				setState(996);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(997);
				match(T_COMMENT);
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(998);
					match(T_EQUAL);
					}
				}

				setState(1001);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(1002);
					match(T_DEFAULT);
					}
				}

				setState(1008);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(1005);
					match(T_CHARACTER);
					setState(1006);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(1007);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1010);
					match(T_EQUAL);
					}
				}

				setState(1013);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1014);
				match(T_ENGINE);
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1015);
					match(T_EQUAL);
					}
				}

				setState(1018);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode T_CHAR() { return getToken(PLHQLStatementsParser.T_CHAR, 0); }
		public TerminalNode T_BIGINT() { return getToken(PLHQLStatementsParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(PLHQLStatementsParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(PLHQLStatementsParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BINARY_INTEGER() { return getToken(PLHQLStatementsParser.T_BINARY_INTEGER, 0); }
		public TerminalNode T_BIT() { return getToken(PLHQLStatementsParser.T_BIT, 0); }
		public TerminalNode T_DATE() { return getToken(PLHQLStatementsParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(PLHQLStatementsParser.T_DATETIME, 0); }
		public TerminalNode T_DEC() { return getToken(PLHQLStatementsParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(PLHQLStatementsParser.T_DECIMAL, 0); }
		public TerminalNode T_DOUBLE() { return getToken(PLHQLStatementsParser.T_DOUBLE, 0); }
		public TerminalNode T_PRECISION() { return getToken(PLHQLStatementsParser.T_PRECISION, 0); }
		public TerminalNode T_FLOAT() { return getToken(PLHQLStatementsParser.T_FLOAT, 0); }
		public TerminalNode T_INT() { return getToken(PLHQLStatementsParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(PLHQLStatementsParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(PLHQLStatementsParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(PLHQLStatementsParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(PLHQLStatementsParser.T_INTEGER, 0); }
		public TerminalNode T_NCHAR() { return getToken(PLHQLStatementsParser.T_NCHAR, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(PLHQLStatementsParser.T_NVARCHAR, 0); }
		public TerminalNode T_NUMBER() { return getToken(PLHQLStatementsParser.T_NUMBER, 0); }
		public TerminalNode T_NUMERIC() { return getToken(PLHQLStatementsParser.T_NUMERIC, 0); }
		public TerminalNode T_PLS_INTEGER() { return getToken(PLHQLStatementsParser.T_PLS_INTEGER, 0); }
		public TerminalNode T_REAL() { return getToken(PLHQLStatementsParser.T_REAL, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(PLHQLStatementsParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_VARYING() { return getToken(PLHQLStatementsParser.T_VARYING, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(PLHQLStatementsParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(PLHQLStatementsParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_INTEGER() { return getToken(PLHQLStatementsParser.T_SIMPLE_INTEGER, 0); }
		public TerminalNode T_SMALLINT() { return getToken(PLHQLStatementsParser.T_SMALLINT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(PLHQLStatementsParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_STRING() { return getToken(PLHQLStatementsParser.T_STRING, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(PLHQLStatementsParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(PLHQLStatementsParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TINYINT() { return getToken(PLHQLStatementsParser.T_TINYINT, 0); }
		public TerminalNode T_VARCHAR() { return getToken(PLHQLStatementsParser.T_VARCHAR, 0); }
		public TerminalNode T_VOID() { return getToken(PLHQLStatementsParser.T_VOID, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(PLHQLStatementsParser.T_VARCHAR2, 0); }
		public TerminalNode T_XML() { return getToken(PLHQLStatementsParser.T_XML, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_TYPE() { return getToken(PLHQLStatementsParser.T_TYPE, 0); }
		public TerminalNode T_ROWTYPE() { return getToken(PLHQLStatementsParser.T_ROWTYPE, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitDtype(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_dtype);
		int _la;
		try {
			setState(1067);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1021);
				match(T_CHAR);
				}
				break;
			case T_BIGINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1022);
				match(T_BIGINT);
				}
				break;
			case T_BINARY_DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1023);
				match(T_BINARY_DOUBLE);
				}
				break;
			case T_BINARY_FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1024);
				match(T_BINARY_FLOAT);
				}
				break;
			case T_BINARY_INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1025);
				match(T_BINARY_INTEGER);
				}
				break;
			case T_BIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1026);
				match(T_BIT);
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1027);
				match(T_DATE);
				}
				break;
			case T_DATETIME:
				enterOuterAlt(_localctx, 8);
				{
				setState(1028);
				match(T_DATETIME);
				}
				break;
			case T_DEC:
				enterOuterAlt(_localctx, 9);
				{
				setState(1029);
				match(T_DEC);
				}
				break;
			case T_DECIMAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(1030);
				match(T_DECIMAL);
				}
				break;
			case T_DOUBLE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1031);
				match(T_DOUBLE);
				setState(1033);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(1032);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 12);
				{
				setState(1035);
				match(T_FLOAT);
				}
				break;
			case T_INT:
				enterOuterAlt(_localctx, 13);
				{
				setState(1036);
				match(T_INT);
				}
				break;
			case T_INT2:
				enterOuterAlt(_localctx, 14);
				{
				setState(1037);
				match(T_INT2);
				}
				break;
			case T_INT4:
				enterOuterAlt(_localctx, 15);
				{
				setState(1038);
				match(T_INT4);
				}
				break;
			case T_INT8:
				enterOuterAlt(_localctx, 16);
				{
				setState(1039);
				match(T_INT8);
				}
				break;
			case T_INTEGER:
				enterOuterAlt(_localctx, 17);
				{
				setState(1040);
				match(T_INTEGER);
				}
				break;
			case T_NCHAR:
				enterOuterAlt(_localctx, 18);
				{
				setState(1041);
				match(T_NCHAR);
				}
				break;
			case T_NVARCHAR:
				enterOuterAlt(_localctx, 19);
				{
				setState(1042);
				match(T_NVARCHAR);
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 20);
				{
				setState(1043);
				match(T_NUMBER);
				}
				break;
			case T_NUMERIC:
				enterOuterAlt(_localctx, 21);
				{
				setState(1044);
				match(T_NUMERIC);
				}
				break;
			case T_PLS_INTEGER:
				enterOuterAlt(_localctx, 22);
				{
				setState(1045);
				match(T_PLS_INTEGER);
				}
				break;
			case T_REAL:
				enterOuterAlt(_localctx, 23);
				{
				setState(1046);
				match(T_REAL);
				}
				break;
			case T_RESULT_SET_LOCATOR:
				enterOuterAlt(_localctx, 24);
				{
				setState(1047);
				match(T_RESULT_SET_LOCATOR);
				setState(1048);
				match(T_VARYING);
				}
				break;
			case T_SIMPLE_FLOAT:
				enterOuterAlt(_localctx, 25);
				{
				setState(1049);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case T_SIMPLE_DOUBLE:
				enterOuterAlt(_localctx, 26);
				{
				setState(1050);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case T_SIMPLE_INTEGER:
				enterOuterAlt(_localctx, 27);
				{
				setState(1051);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case T_SMALLINT:
				enterOuterAlt(_localctx, 28);
				{
				setState(1052);
				match(T_SMALLINT);
				}
				break;
			case T_SMALLDATETIME:
				enterOuterAlt(_localctx, 29);
				{
				setState(1053);
				match(T_SMALLDATETIME);
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 30);
				{
				setState(1054);
				match(T_STRING);
				}
				break;
			case T_SYS_REFCURSOR:
				enterOuterAlt(_localctx, 31);
				{
				setState(1055);
				match(T_SYS_REFCURSOR);
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 32);
				{
				setState(1056);
				match(T_TIMESTAMP);
				}
				break;
			case T_TINYINT:
				enterOuterAlt(_localctx, 33);
				{
				setState(1057);
				match(T_TINYINT);
				}
				break;
			case T_VARCHAR:
				enterOuterAlt(_localctx, 34);
				{
				setState(1058);
				match(T_VARCHAR);
				}
				break;
			case T_VOID:
				enterOuterAlt(_localctx, 35);
				{
				setState(1059);
				match(T_VOID);
				}
				break;
			case T_VARCHAR2:
				enterOuterAlt(_localctx, 36);
				{
				setState(1060);
				match(T_VARCHAR2);
				}
				break;
			case T_XML:
				enterOuterAlt(_localctx, 37);
				{
				setState(1061);
				match(T_XML);
				}
				break;
			case L_ID:
				enterOuterAlt(_localctx, 38);
				{
				setState(1062);
				ident();
				setState(1065);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					{
					setState(1063);
					match(T__2);
					}
					setState(1064);
					_la = _input.LA(1);
					if ( !(_la==T_ROWTYPE || _la==T_TYPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_lenContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public List<TerminalNode> L_INT() { return getTokens(PLHQLStatementsParser.L_INT); }
		public TerminalNode L_INT(int i) {
			return getToken(PLHQLStatementsParser.L_INT, i);
		}
		public TerminalNode T_MAX() { return getToken(PLHQLStatementsParser.T_MAX, 0); }
		public TerminalNode T_COMMA() { return getToken(PLHQLStatementsParser.T_COMMA, 0); }
		public TerminalNode T_CHAR() { return getToken(PLHQLStatementsParser.T_CHAR, 0); }
		public TerminalNode T_BYTE() { return getToken(PLHQLStatementsParser.T_BYTE, 0); }
		public Dtype_lenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterDtype_len(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitDtype_len(this);
		}
	}

	public final Dtype_lenContext dtype_len() throws RecognitionException {
		Dtype_lenContext _localctx = new Dtype_lenContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1069);
			match(T_OPEN_P);
			setState(1070);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1071);
				_la = _input.LA(1);
				if ( !(_la==T_BYTE || _la==T_CHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1076);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1074);
				match(T_COMMA);
				setState(1075);
				match(L_INT);
				}
			}

			setState(1078);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_attrContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(PLHQLStatementsParser.T_NULL, 0); }
		public TerminalNode T_NOT() { return getToken(PLHQLStatementsParser.T_NOT, 0); }
		public TerminalNode T_CHARACTER() { return getToken(PLHQLStatementsParser.T_CHARACTER, 0); }
		public TerminalNode T_SET() { return getToken(PLHQLStatementsParser.T_SET, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_CASESPECIFIC() { return getToken(PLHQLStatementsParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CS() { return getToken(PLHQLStatementsParser.T_CS, 0); }
		public Dtype_attrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterDtype_attr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitDtype_attr(this);
		}
	}

	public final Dtype_attrContext dtype_attr() throws RecognitionException {
		Dtype_attrContext _localctx = new Dtype_attrContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_dtype_attr);
		int _la;
		try {
			setState(1091);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1080);
					match(T_NOT);
					}
				}

				setState(1083);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1084);
				match(T_CHARACTER);
				setState(1085);
				match(T_SET);
				setState(1086);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1088);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1087);
					match(T_NOT);
					}
				}

				setState(1090);
				_la = _input.LA(1);
				if ( !(_la==T_CASESPECIFIC || _la==T_CS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dtype_defaultContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(PLHQLStatementsParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_COLON() { return getToken(PLHQLStatementsParser.T_COLON, 0); }
		public TerminalNode T_DEFAULT() { return getToken(PLHQLStatementsParser.T_DEFAULT, 0); }
		public TerminalNode T_WITH() { return getToken(PLHQLStatementsParser.T_WITH, 0); }
		public Dtype_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterDtype_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitDtype_default(this);
		}
	}

	public final Dtype_defaultContext dtype_default() throws RecognitionException {
		Dtype_defaultContext _localctx = new Dtype_defaultContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_dtype_default);
		int _la;
		try {
			setState(1105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1093);
					match(T_COLON);
					}
				}

				setState(1096);
				match(T_EQUAL);
				setState(1097);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1099);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1098);
					match(T_WITH);
					}
				}

				setState(1101);
				match(T_DEFAULT);
				setState(1103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1102);
					expr(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(PLHQLStatementsParser.T_CREATE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_DATABASE() { return getToken(PLHQLStatementsParser.T_DATABASE, 0); }
		public TerminalNode T_SCHEMA() { return getToken(PLHQLStatementsParser.T_SCHEMA, 0); }
		public TerminalNode T_IF() { return getToken(PLHQLStatementsParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(PLHQLStatementsParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(PLHQLStatementsParser.T_EXISTS, 0); }
		public List<Create_database_optionContext> create_database_option() {
			return getRuleContexts(Create_database_optionContext.class);
		}
		public Create_database_optionContext create_database_option(int i) {
			return getRuleContext(Create_database_optionContext.class,i);
		}
		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_database_stmt(this);
		}
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_create_database_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(T_CREATE);
			setState(1108);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IF) {
				{
				setState(1109);
				match(T_IF);
				setState(1110);
				match(T_NOT);
				setState(1111);
				match(T_EXISTS);
				}
			}

			setState(1114);
			expr(0);
			setState(1118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1115);
					create_database_option();
					}
					} 
				}
				setState(1120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_optionContext extends ParserRuleContext {
		public TerminalNode T_COMMENT() { return getToken(PLHQLStatementsParser.T_COMMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_LOCATION() { return getToken(PLHQLStatementsParser.T_LOCATION, 0); }
		public Create_database_optionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_database_option(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_database_option(this);
		}
	}

	public final Create_database_optionContext create_database_option() throws RecognitionException {
		Create_database_optionContext _localctx = new Create_database_optionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_create_database_option);
		try {
			setState(1125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1121);
				match(T_COMMENT);
				setState(1122);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1123);
				match(T_LOCATION);
				setState(1124);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class C_functionContext extends ParserRuleContext {
		public ArrayList<Pair<String, String>> functionVariables = new ArrayList<>();
		public ArrayList<String> unassignedVariables = new ArrayList<>();
		public ArrayList<String> returnStatements = new ArrayList<>();
		public IdentContext ident;
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public C_blockContext c_block() {
			return getRuleContext(C_blockContext.class,0);
		}
		public C_function_parameter_listContext c_function_parameter_list() {
			return getRuleContext(C_function_parameter_listContext.class,0);
		}
		public C_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterC_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitC_function(this);
		}
	}

	public final C_functionContext c_function() throws RecognitionException {
		C_functionContext _localctx = new C_functionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_c_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			dtype();
			setState(1128);
			((C_functionContext)_localctx).ident = ident();
			setState(1129);
			match(T_OPEN_P);
			setState(1131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (T_BIGINT - 22)) | (1L << (T_BINARY_DOUBLE - 22)) | (1L << (T_BINARY_FLOAT - 22)) | (1L << (T_BINARY_INTEGER - 22)) | (1L << (T_BIT - 22)) | (1L << (T_CHAR - 22)) | (1L << (T_DATE - 22)) | (1L << (T_DATETIME - 22)) | (1L << (T_DEC - 22)) | (1L << (T_DECIMAL - 22)))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (T_DOUBLE - 90)) | (1L << (T_FLOAT - 90)) | (1L << (T_INT - 90)) | (1L << (T_INT2 - 90)) | (1L << (T_INT4 - 90)) | (1L << (T_INT8 - 90)) | (1L << (T_INTEGER - 90)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (T_NCHAR - 184)) | (1L << (T_NVARCHAR - 184)) | (1L << (T_NUMERIC - 184)) | (1L << (T_NUMBER - 184)) | (1L << (T_PLS_INTEGER - 184)) | (1L << (T_REAL - 184)) | (1L << (T_RESULT_SET_LOCATOR - 184)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (T_SIMPLE_DOUBLE - 261)) | (1L << (T_SIMPLE_FLOAT - 261)) | (1L << (T_SIMPLE_INTEGER - 261)) | (1L << (T_SMALLDATETIME - 261)) | (1L << (T_SMALLINT - 261)) | (1L << (T_STRING - 261)) | (1L << (T_SYS_REFCURSOR - 261)) | (1L << (T_TIMESTAMP - 261)) | (1L << (T_TINYINT - 261)) | (1L << (T_VARCHAR - 261)) | (1L << (T_VARCHAR2 - 261)) | (1L << (T_VOID - 261)) | (1L << (T_XML - 261)))) != 0) || _la==L_ID) {
				{
				setState(1130);
				c_function_parameter_list();
				}
			}

			setState(1133);
			match(T_CLOSE_P);
			setState(1134);
			c_block();
			((ProgramContext)getInvokingContext(0)).functions.add((((C_functionContext)_localctx).ident!=null?_input.getText(((C_functionContext)_localctx).ident.start,((C_functionContext)_localctx).ident.stop):null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class C_function_parameter_listContext extends ParserRuleContext {
		public List<C_function_parameter_itemContext> c_function_parameter_item() {
			return getRuleContexts(C_function_parameter_itemContext.class);
		}
		public C_function_parameter_itemContext c_function_parameter_item(int i) {
			return getRuleContext(C_function_parameter_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public C_function_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_function_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterC_function_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitC_function_parameter_list(this);
		}
	}

	public final C_function_parameter_listContext c_function_parameter_list() throws RecognitionException {
		C_function_parameter_listContext _localctx = new C_function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_c_function_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			c_function_parameter_item();
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1138);
				match(T_COMMA);
				setState(1139);
				c_function_parameter_item();
				}
				}
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class C_function_parameter_itemContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public C_function_parameter_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_function_parameter_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterC_function_parameter_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitC_function_parameter_item(this);
		}
	}

	public final C_function_parameter_itemContext c_function_parameter_item() throws RecognitionException {
		C_function_parameter_itemContext _localctx = new C_function_parameter_itemContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_c_function_parameter_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			dtype();
			setState(1146);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_create_procedure_stmtContext extends ParserRuleContext {
		public Proc_blockContext proc_block() {
			return getRuleContext(Proc_blockContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(PLHQLStatementsParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(PLHQLStatementsParser.T_PROC, 0); }
		public TerminalNode T_CREATE() { return getToken(PLHQLStatementsParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(PLHQLStatementsParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_SEMICOLON() { return getToken(PLHQLStatementsParser.T_SEMICOLON, 0); }
		public TerminalNode T_AS() { return getToken(PLHQLStatementsParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(PLHQLStatementsParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(PLHQLStatementsParser.T_OR, 0); }
		public Error_create_procedure_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_create_procedure_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_create_procedure_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_create_procedure_stmt(this);
		}
	}

	public final Error_create_procedure_stmtContext error_create_procedure_stmt() throws RecognitionException {
		Error_create_procedure_stmtContext _localctx = new Error_create_procedure_stmtContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_error_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CREATE:
				{
				setState(1148);
				match(T_CREATE);
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1149);
					match(T_OR);
					setState(1150);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1153);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
			}
			setState(1156);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1157);
				create_routine_params();
				}
				break;
			}
			setState(1161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS || _la==T_IS) {
				{
				setState(1160);
				_la = _input.LA(1);
				if ( !(_la==T_AS || _la==T_IS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1163);
				declare_block_inplace();
				}
				break;
			}
			setState(1166);
			proc_block();
			setState(1170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1167);
				ident();
				setState(1168);
				match(T_SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_paramsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public List<Create_routine_param_itemContext> create_routine_param_item() {
			return getRuleContexts(Create_routine_param_itemContext.class);
		}
		public Create_routine_param_itemContext create_routine_param_item(int i) {
			return getRuleContext(Create_routine_param_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Create_routine_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_routine_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_routine_params(this);
		}
	}

	public final Create_routine_paramsContext create_routine_params() throws RecognitionException {
		Create_routine_paramsContext _localctx = new Create_routine_paramsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_create_routine_params);
		int _la;
		try {
			setState(1194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1172);
				match(T_OPEN_P);
				setState(1173);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1174);
				match(T_OPEN_P);
				setState(1175);
				create_routine_param_item();
				setState(1180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1176);
					match(T_COMMA);
					setState(1177);
					create_routine_param_item();
					}
					}
					setState(1182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1183);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1185);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
				setState(1186);
				create_routine_param_item();
				setState(1191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1187);
					match(T_COMMA);
					setState(1188);
					create_routine_param_item();
					}
					}
					setState(1193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_routine_param_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_IN() { return getToken(PLHQLStatementsParser.T_IN, 0); }
		public TerminalNode T_OUT() { return getToken(PLHQLStatementsParser.T_OUT, 0); }
		public TerminalNode T_INOUT() { return getToken(PLHQLStatementsParser.T_INOUT, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public List<Dtype_attrContext> dtype_attr() {
			return getRuleContexts(Dtype_attrContext.class);
		}
		public Dtype_attrContext dtype_attr(int i) {
			return getRuleContext(Dtype_attrContext.class,i);
		}
		public Dtype_defaultContext dtype_default() {
			return getRuleContext(Dtype_defaultContext.class,0);
		}
		public Create_routine_param_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_routine_param_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_routine_param_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_routine_param_item(this);
		}
	}

	public final Create_routine_param_itemContext create_routine_param_item() throws RecognitionException {
		Create_routine_param_itemContext _localctx = new Create_routine_param_itemContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_create_routine_param_item);
		try {
			int _alt;
			setState(1238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1196);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1197);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1198);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1199);
					match(T_IN);
					setState(1200);
					match(T_OUT);
					}
					break;
				}
				setState(1203);
				ident();
				setState(1204);
				dtype();
				setState(1206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1205);
					dtype_len();
					}
					break;
				}
				setState(1211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1208);
						dtype_attr();
						}
						} 
					}
					setState(1213);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				}
				setState(1215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1214);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1217);
				ident();
				setState(1223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1218);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1219);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1220);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1221);
					match(T_IN);
					setState(1222);
					match(T_OUT);
					}
					break;
				}
				setState(1225);
				dtype();
				setState(1227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1226);
					dtype_len();
					}
					break;
				}
				setState(1232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1229);
						dtype_attr();
						}
						} 
					}
					setState(1234);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				}
				setState(1236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1235);
					dtype_default();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exec_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_EXEC() { return getToken(PLHQLStatementsParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(PLHQLStatementsParser.T_EXECUTE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(PLHQLStatementsParser.T_IMMEDIATE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public TerminalNode T_INTO() { return getToken(PLHQLStatementsParser.T_INTO, 0); }
		public List<TerminalNode> L_ID() { return getTokens(PLHQLStatementsParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(PLHQLStatementsParser.L_ID, i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Exec_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exec_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterExec_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitExec_stmt(this);
		}
	}

	public final Exec_stmtContext exec_stmt() throws RecognitionException {
		Exec_stmtContext _localctx = new Exec_stmtContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_exec_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			_la = _input.LA(1);
			if ( !(_la==T_EXEC || _la==T_EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IMMEDIATE) {
				{
				setState(1241);
				match(T_IMMEDIATE);
				}
			}

			setState(1244);
			expr(0);
			setState(1250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1245);
				match(T_OPEN_P);
				setState(1246);
				expr_func_params();
				setState(1247);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1249);
				expr_func_params();
				}
				break;
			}
			setState(1261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1252);
				match(T_INTO);
				setState(1253);
				match(L_ID);
				setState(1258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1254);
						match(T_COMMA);
						setState(1255);
						match(L_ID);
						}
						} 
					}
					setState(1260);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_stmtContext extends ParserRuleContext {
		public If_plsql_stmtContext if_plsql_stmt() {
			return getRuleContext(If_plsql_stmtContext.class,0);
		}
		public If_tsql_stmtContext if_tsql_stmt() {
			return getRuleContext(If_tsql_stmtContext.class,0);
		}
		public If_bteq_stmtContext if_bteq_stmt() {
			return getRuleContext(If_bteq_stmtContext.class,0);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterIf_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitIf_stmt(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_if_stmt);
		try {
			setState(1266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1263);
				if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1264);
				if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1265);
				if_bteq_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_c_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(PLHQLStatementsParser.T_IF, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public C_stmtContext c_stmt() {
			return getRuleContext(C_stmtContext.class,0);
		}
		public If_c_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_c_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterIf_c_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitIf_c_stmt(this);
		}
	}

	public final If_c_stmtContext if_c_stmt() throws RecognitionException {
		If_c_stmtContext _localctx = new If_c_stmtContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_if_c_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			match(T_IF);
			setState(1269);
			match(T_OPEN_P);
			setState(1270);
			bool_expr(0);
			setState(1271);
			match(T_CLOSE_P);
			setState(1272);
			c_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_if_stmtContext extends ParserRuleContext {
		public Error_if_plsql_stmtContext error_if_plsql_stmt() {
			return getRuleContext(Error_if_plsql_stmtContext.class,0);
		}
		public Error_if_tsql_stmtContext error_if_tsql_stmt() {
			return getRuleContext(Error_if_tsql_stmtContext.class,0);
		}
		public Error_if_bteq_stmtContext error_if_bteq_stmt() {
			return getRuleContext(Error_if_bteq_stmtContext.class,0);
		}
		public Error_if_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_if_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_if_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_if_stmt(this);
		}
	}

	public final Error_if_stmtContext error_if_stmt() throws RecognitionException {
		Error_if_stmtContext _localctx = new Error_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_error_if_stmt);
		try {
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1274);
				error_if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1275);
				error_if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1276);
				error_if_bteq_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_plsql_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_IF() { return getTokens(PLHQLStatementsParser.T_IF); }
		public TerminalNode T_IF(int i) {
			return getToken(PLHQLStatementsParser.T_IF, i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(PLHQLStatementsParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(PLHQLStatementsParser.T_END, 0); }
		public List<Elseif_blockContext> elseif_block() {
			return getRuleContexts(Elseif_blockContext.class);
		}
		public Elseif_blockContext elseif_block(int i) {
			return getRuleContext(Elseif_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public If_plsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_plsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterIf_plsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitIf_plsql_stmt(this);
		}
	}

	public final If_plsql_stmtContext if_plsql_stmt() throws RecognitionException {
		If_plsql_stmtContext _localctx = new If_plsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			match(T_IF);
			setState(1280);
			bool_expr(0);
			setState(1281);
			match(T_THEN);
			setState(1282);
			block();
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1283);
				elseif_block();
				}
				}
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1289);
				else_block();
				}
			}

			setState(1292);
			match(T_END);
			setState(1293);
			match(T_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_if_plsql_stmtContext extends ParserRuleContext {
		public List<TerminalNode> T_IF() { return getTokens(PLHQLStatementsParser.T_IF); }
		public TerminalNode T_IF(int i) {
			return getToken(PLHQLStatementsParser.T_IF, i);
		}
		public TerminalNode T_THEN() { return getToken(PLHQLStatementsParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(PLHQLStatementsParser.T_END, 0); }
		public List<Elseif_blockContext> elseif_block() {
			return getRuleContexts(Elseif_blockContext.class);
		}
		public Elseif_blockContext elseif_block(int i) {
			return getRuleContext(Elseif_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public Error_if_plsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_if_plsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_if_plsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_if_plsql_stmt(this);
		}
	}

	public final Error_if_plsql_stmtContext error_if_plsql_stmt() throws RecognitionException {
		Error_if_plsql_stmtContext _localctx = new Error_if_plsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_error_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
			match(T_IF);
			setState(1296);
			match(T_THEN);
			setState(1297);
			block();
			setState(1301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1298);
				elseif_block();
				}
				}
				setState(1303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1304);
				else_block();
				}
			}

			setState(1307);
			match(T_END);
			setState(1308);
			match(T_IF);
			notifyErrorListeners("Missing if block");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_tsql_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(PLHQLStatementsParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public List<Single_block_stmtContext> single_block_stmt() {
			return getRuleContexts(Single_block_stmtContext.class);
		}
		public Single_block_stmtContext single_block_stmt(int i) {
			return getRuleContext(Single_block_stmtContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(PLHQLStatementsParser.T_ELSE, 0); }
		public If_tsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_tsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterIf_tsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitIf_tsql_stmt(this);
		}
	}

	public final If_tsql_stmtContext if_tsql_stmt() throws RecognitionException {
		If_tsql_stmtContext _localctx = new If_tsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			match(T_IF);
			setState(1312);
			bool_expr(0);
			setState(1313);
			single_block_stmt();
			setState(1316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1314);
				match(T_ELSE);
				setState(1315);
				single_block_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_if_tsql_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(PLHQLStatementsParser.T_IF, 0); }
		public List<Single_block_stmtContext> single_block_stmt() {
			return getRuleContexts(Single_block_stmtContext.class);
		}
		public Single_block_stmtContext single_block_stmt(int i) {
			return getRuleContext(Single_block_stmtContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(PLHQLStatementsParser.T_ELSE, 0); }
		public Error_if_tsql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_if_tsql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_if_tsql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_if_tsql_stmt(this);
		}
	}

	public final Error_if_tsql_stmtContext error_if_tsql_stmt() throws RecognitionException {
		Error_if_tsql_stmtContext _localctx = new Error_if_tsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_error_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1318);
			match(T_IF);
			setState(1319);
			single_block_stmt();
			setState(1322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1320);
				match(T_ELSE);
				setState(1321);
				single_block_stmt();
				}
				break;
			}
			notifyErrorListeners("Expected boolean expression");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_bteq_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(PLHQLStatementsParser.T_IF, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(PLHQLStatementsParser.T_THEN, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public If_bteq_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_bteq_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterIf_bteq_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitIf_bteq_stmt(this);
		}
	}

	public final If_bteq_stmtContext if_bteq_stmt() throws RecognitionException {
		If_bteq_stmtContext _localctx = new If_bteq_stmtContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			match(T__3);
			setState(1327);
			match(T_IF);
			setState(1328);
			bool_expr(0);
			setState(1329);
			match(T_THEN);
			setState(1330);
			single_block_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_if_bteq_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(PLHQLStatementsParser.T_IF, 0); }
		public TerminalNode T_THEN() { return getToken(PLHQLStatementsParser.T_THEN, 0); }
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public Error_if_bteq_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_if_bteq_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_if_bteq_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_if_bteq_stmt(this);
		}
	}

	public final Error_if_bteq_stmtContext error_if_bteq_stmt() throws RecognitionException {
		Error_if_bteq_stmtContext _localctx = new Error_if_bteq_stmtContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_error_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1332);
			match(T__3);
			setState(1333);
			match(T_IF);
			setState(1334);
			match(T_THEN);
			setState(1335);
			single_block_stmt();
			notifyErrorListeners("Expected boolean expression");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elseif_blockContext extends ParserRuleContext {
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_THEN() { return getToken(PLHQLStatementsParser.T_THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_ELSIF() { return getToken(PLHQLStatementsParser.T_ELSIF, 0); }
		public TerminalNode T_ELSEIF() { return getToken(PLHQLStatementsParser.T_ELSEIF, 0); }
		public Elseif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterElseif_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitElseif_block(this);
		}
	}

	public final Elseif_blockContext elseif_block() throws RecognitionException {
		Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1339);
			bool_expr(0);
			setState(1340);
			match(T_THEN);
			setState(1341);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode T_ELSE() { return getToken(PLHQLStatementsParser.T_ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitElse_block(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1343);
			match(T_ELSE);
			setState(1344);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(PLHQLStatementsParser.T_CREATE, 0); }
		public TerminalNode T_INDEX() { return getToken(PLHQLStatementsParser.T_INDEX, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(PLHQLStatementsParser.T_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public List<Create_index_colContext> create_index_col() {
			return getRuleContexts(Create_index_colContext.class);
		}
		public Create_index_colContext create_index_col(int i) {
			return getRuleContext(Create_index_colContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(PLHQLStatementsParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_index_stmt(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			match(T_CREATE);
			setState(1348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1347);
				match(T_UNIQUE);
				}
			}

			setState(1350);
			match(T_INDEX);
			setState(1351);
			ident();
			setState(1352);
			match(T_ON);
			setState(1353);
			table_name();
			setState(1354);
			match(T_OPEN_P);
			setState(1355);
			create_index_col();
			setState(1360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1356);
				match(T_COMMA);
				setState(1357);
				create_index_col();
				}
				}
				setState(1362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1363);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_create_index_stmtContext extends ParserRuleContext {
		public TerminalNode T_CREATE() { return getToken(PLHQLStatementsParser.T_CREATE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public List<Create_index_colContext> create_index_col() {
			return getRuleContexts(Create_index_colContext.class);
		}
		public Create_index_colContext create_index_col(int i) {
			return getRuleContext(Create_index_colContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public TerminalNode T_UNIQUE() { return getToken(PLHQLStatementsParser.T_UNIQUE, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Error_create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_create_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_create_index_stmt(this);
		}
	}

	public final Error_create_index_stmtContext error_create_index_stmt() throws RecognitionException {
		Error_create_index_stmtContext _localctx = new Error_create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_error_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			match(T_CREATE);
			setState(1367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1366);
				match(T_UNIQUE);
				}
			}

			setState(1369);
			match(T_OPEN_P);
			setState(1370);
			create_index_col();
			setState(1375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1371);
				match(T_COMMA);
				setState(1372);
				create_index_col();
				}
				}
				setState(1377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1378);
			match(T_CLOSE_P);
			notifyErrorListeners("Expected 'INDEX' keyword");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_colContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_ASC() { return getToken(PLHQLStatementsParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(PLHQLStatementsParser.T_DESC, 0); }
		public Create_index_colContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_index_col(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_index_col(this);
		}
	}

	public final Create_index_colContext create_index_col() throws RecognitionException {
		Create_index_colContext _localctx = new Create_index_colContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1381);
			ident();
			setState(1383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(1382);
				_la = _input.LA(1);
				if ( !(_la==T_ASC || _la==T_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_stmtContext extends ParserRuleContext {
		public ExprContext expr;
		public TerminalNode T_RETURN() { return getToken(PLHQLStatementsParser.T_RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Return_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterReturn_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitReturn_stmt(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			match(T_RETURN);
			setState(1390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1386);
				((Return_stmtContext)_localctx).expr = expr(0);
				((C_functionContext)getInvokingContext(59)).returnStatements.add((((Return_stmtContext)_localctx).expr!=null?_input.getText(((Return_stmtContext)_localctx).expr.start,((Return_stmtContext)_localctx).expr.stop):null));
				}
				break;
			case 2:
				{
				((C_functionContext)getInvokingContext(59)).returnStatements.add("void");
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_range_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(PLHQLStatementsParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(PLHQLStatementsParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(PLHQLStatementsParser.T_IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_DOT2() { return getToken(PLHQLStatementsParser.T_DOT2, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(PLHQLStatementsParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(PLHQLStatementsParser.T_LOOP, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(PLHQLStatementsParser.T_END, 0); }
		public TerminalNode T_REVERSE() { return getToken(PLHQLStatementsParser.T_REVERSE, 0); }
		public TerminalNode T_BY() { return getToken(PLHQLStatementsParser.T_BY, 0); }
		public TerminalNode T_STEP() { return getToken(PLHQLStatementsParser.T_STEP, 0); }
		public For_range_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_range_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterFor_range_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitFor_range_stmt(this);
		}
	}

	public final For_range_stmtContext for_range_stmt() throws RecognitionException {
		For_range_stmtContext _localctx = new For_range_stmtContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			match(T_FOR);
			setState(1393);
			match(L_ID);
			setState(1394);
			match(T_IN);
			setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_REVERSE) {
				{
				setState(1395);
				match(T_REVERSE);
				}
			}

			setState(1398);
			expr(0);
			setState(1399);
			match(T_DOT2);
			setState(1400);
			expr(0);
			setState(1403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
				{
				setState(1401);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1402);
				expr(0);
				}
			}

			setState(1405);
			match(T_LOOP);
			setState(1406);
			block();
			setState(1407);
			match(T_END);
			setState(1408);
			match(T_LOOP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_c_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(PLHQLStatementsParser.T_FOR, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public List<TerminalNode> T_SEMICOLON() { return getTokens(PLHQLStatementsParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(PLHQLStatementsParser.T_SEMICOLON, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public C_stmtContext c_stmt() {
			return getRuleContext(C_stmtContext.class,0);
		}
		public For_delcaration_c_stmtContext for_delcaration_c_stmt() {
			return getRuleContext(For_delcaration_c_stmtContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Assignment_c_stmtContext assignment_c_stmt() {
			return getRuleContext(Assignment_c_stmtContext.class,0);
		}
		public For_c_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_c_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterFor_c_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitFor_c_stmt(this);
		}
	}

	public final For_c_stmtContext for_c_stmt() throws RecognitionException {
		For_c_stmtContext _localctx = new For_c_stmtContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_for_c_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			match(T_FOR);
			setState(1411);
			match(T_OPEN_P);
			setState(1413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (T_BIGINT - 22)) | (1L << (T_BINARY_DOUBLE - 22)) | (1L << (T_BINARY_FLOAT - 22)) | (1L << (T_BINARY_INTEGER - 22)) | (1L << (T_BIT - 22)) | (1L << (T_CHAR - 22)) | (1L << (T_DATE - 22)) | (1L << (T_DATETIME - 22)) | (1L << (T_DEC - 22)) | (1L << (T_DECIMAL - 22)))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (T_DOUBLE - 90)) | (1L << (T_FLOAT - 90)) | (1L << (T_INT - 90)) | (1L << (T_INT2 - 90)) | (1L << (T_INT4 - 90)) | (1L << (T_INT8 - 90)) | (1L << (T_INTEGER - 90)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (T_NCHAR - 184)) | (1L << (T_NVARCHAR - 184)) | (1L << (T_NUMERIC - 184)) | (1L << (T_NUMBER - 184)) | (1L << (T_PLS_INTEGER - 184)) | (1L << (T_REAL - 184)) | (1L << (T_RESULT_SET_LOCATOR - 184)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (T_SIMPLE_DOUBLE - 261)) | (1L << (T_SIMPLE_FLOAT - 261)) | (1L << (T_SIMPLE_INTEGER - 261)) | (1L << (T_SMALLDATETIME - 261)) | (1L << (T_SMALLINT - 261)) | (1L << (T_STRING - 261)) | (1L << (T_SYS_REFCURSOR - 261)) | (1L << (T_TIMESTAMP - 261)) | (1L << (T_TINYINT - 261)) | (1L << (T_VARCHAR - 261)) | (1L << (T_VARCHAR2 - 261)) | (1L << (T_VOID - 261)) | (1L << (T_XML - 261)))) != 0) || _la==L_ID) {
				{
				setState(1412);
				for_delcaration_c_stmt();
				}
			}

			setState(1415);
			match(T_SEMICOLON);
			setState(1417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_AVG) | (1L << T_CASE) | (1L << T_CAST) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CURRENT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T_DATE - 67)) | (1L << (T_EXISTS - 67)) | (1L << (T_FALSE - 67)))) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & ((1L << (T_INTERVAL - 149)) | (1L << (T_MAX - 149)) | (1L << (T_MIN - 149)) | (1L << (T_NOT - 149)) | (1L << (T_NULL - 149)))) != 0) || ((((_la - 247)) & ~0x3f) == 0 && ((1L << (_la - 247)) & ((1L << (T_TRIM - 247)) | (1L << (T_SEL - 247)) | (1L << (T_SELECT - 247)) | (1L << (T_SUBSTRING - 247)) | (1L << (T_SUM - 247)) | (1L << (T_TIMESTAMP - 247)) | (1L << (T_TRUE - 247)))) != 0) || ((((_la - 314)) & ~0x3f) == 0 && ((1L << (_la - 314)) & ((1L << (T_WITH - 314)) | (1L << (T_SUMMARIZE - 314)) | (1L << (T_ACTIVITY_COUNT - 314)) | (1L << (T_CUME_DIST - 314)) | (1L << (T_CURRENT_DATE - 314)) | (1L << (T_CURRENT_TIMESTAMP - 314)) | (1L << (T_CURRENT_USER - 314)) | (1L << (T_DENSE_RANK - 314)) | (1L << (T_FIRST_VALUE - 314)) | (1L << (T_LAG - 314)) | (1L << (T_LAST_VALUE - 314)) | (1L << (T_LEAD - 314)) | (1L << (T_MAX_PART_STRING - 314)) | (1L << (T_MIN_PART_STRING - 314)) | (1L << (T_MAX_PART_INT - 314)) | (1L << (T_MIN_PART_INT - 314)) | (1L << (T_MAX_PART_DATE - 314)) | (1L << (T_MIN_PART_DATE - 314)) | (1L << (T_PART_COUNT - 314)) | (1L << (T_PART_LOC - 314)) | (1L << (T_RANK - 314)) | (1L << (T_ROW_NUMBER - 314)) | (1L << (T_STDEV - 314)) | (1L << (T_SYSDATE - 314)) | (1L << (T_VARIANCE - 314)) | (1L << (T_USER - 314)) | (1L << (T_ADD - 314)) | (1L << (T_OPEN_P - 314)) | (1L << (T_SUB - 314)) | (1L << (L_ID - 314)) | (1L << (L_S_STRING - 314)))) != 0) || ((((_la - 379)) & ~0x3f) == 0 && ((1L << (_la - 379)) & ((1L << (L_D_STRING - 379)) | (1L << (L_INT - 379)) | (1L << (L_DEC - 379)))) != 0)) {
				{
				setState(1416);
				bool_expr(0);
				}
			}

			setState(1419);
			match(T_SEMICOLON);
			setState(1421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 366)) & ~0x3f) == 0 && ((1L << (_la - 366)) & ((1L << (T_MINUS_MINUS - 366)) | (1L << (T_OPEN_P - 366)) | (1L << (T_PLUS_PLUS - 366)) | (1L << (L_ID - 366)))) != 0)) {
				{
				setState(1420);
				assignment_c_stmt();
				}
			}

			setState(1423);
			match(T_CLOSE_P);
			setState(1424);
			c_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class General_delcaration_c_stmtContext extends ParserRuleContext {
		public DtypeContext dtype;
		public IdentContext ident;
		public TerminalNode T_SEMICOLON() { return getToken(PLHQLStatementsParser.T_SEMICOLON, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_VAR() { return getToken(PLHQLStatementsParser.T_VAR, 0); }
		public List<TerminalNode> T_EQUAL() { return getTokens(PLHQLStatementsParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(PLHQLStatementsParser.T_EQUAL, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public General_delcaration_c_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_delcaration_c_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterGeneral_delcaration_c_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitGeneral_delcaration_c_stmt(this);
		}
	}

	public final General_delcaration_c_stmtContext general_delcaration_c_stmt() throws RecognitionException {
		General_delcaration_c_stmtContext _localctx = new General_delcaration_c_stmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_general_delcaration_c_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_BIGINT:
			case T_BINARY_DOUBLE:
			case T_BINARY_FLOAT:
			case T_BINARY_INTEGER:
			case T_BIT:
			case T_CHAR:
			case T_DATE:
			case T_DATETIME:
			case T_DEC:
			case T_DECIMAL:
			case T_DOUBLE:
			case T_FLOAT:
			case T_INT:
			case T_INT2:
			case T_INT4:
			case T_INT8:
			case T_INTEGER:
			case T_NCHAR:
			case T_NVARCHAR:
			case T_NUMERIC:
			case T_NUMBER:
			case T_PLS_INTEGER:
			case T_REAL:
			case T_RESULT_SET_LOCATOR:
			case T_SIMPLE_DOUBLE:
			case T_SIMPLE_FLOAT:
			case T_SIMPLE_INTEGER:
			case T_SMALLDATETIME:
			case T_SMALLINT:
			case T_STRING:
			case T_SYS_REFCURSOR:
			case T_TIMESTAMP:
			case T_TINYINT:
			case T_VARCHAR:
			case T_VARCHAR2:
			case T_VOID:
			case T_XML:
			case L_ID:
				{
				setState(1426);
				((General_delcaration_c_stmtContext)_localctx).dtype = dtype();
				setState(1427);
				((General_delcaration_c_stmtContext)_localctx).ident = ident();
				((C_functionContext)getInvokingContext(59)).functionVariables.add(new Pair((((General_delcaration_c_stmtContext)_localctx).dtype!=null?_input.getText(((General_delcaration_c_stmtContext)_localctx).dtype.start,((General_delcaration_c_stmtContext)_localctx).dtype.stop):null), (((General_delcaration_c_stmtContext)_localctx).ident!=null?_input.getText(((General_delcaration_c_stmtContext)_localctx).ident.start,((General_delcaration_c_stmtContext)_localctx).ident.stop):null)));
				}
				break;
			case T_VAR:
				{
				setState(1430);
				match(T_VAR);
				setState(1431);
				((General_delcaration_c_stmtContext)_localctx).ident = ident();
				((C_functionContext)getInvokingContext(59)).functionVariables.add(new Pair("VAR", (((General_delcaration_c_stmtContext)_localctx).ident!=null?_input.getText(((General_delcaration_c_stmtContext)_localctx).ident.start,((General_delcaration_c_stmtContext)_localctx).ident.stop):null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				{
				setState(1436);
				match(T_EQUAL);
				setState(1437);
				expr(0);
				}
				break;
			case T_COMMA:
			case T_SEMICOLON:
				{
				((C_functionContext)getInvokingContext(59)).unassignedVariables.add((((General_delcaration_c_stmtContext)_localctx).ident!=null?_input.getText(((General_delcaration_c_stmtContext)_localctx).ident.start,((General_delcaration_c_stmtContext)_localctx).ident.stop):null));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1441);
				match(T_COMMA);
				setState(1442);
				((General_delcaration_c_stmtContext)_localctx).ident = ident();
				setState(1446);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_EQUAL:
					{
					setState(1443);
					match(T_EQUAL);
					setState(1444);
					expr(0);
					}
					break;
				case T_COMMA:
				case T_SEMICOLON:
					{
					((C_functionContext)getInvokingContext(59)).unassignedVariables.add((((General_delcaration_c_stmtContext)_localctx).ident!=null?_input.getText(((General_delcaration_c_stmtContext)_localctx).ident.start,((General_delcaration_c_stmtContext)_localctx).ident.stop):null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1452);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1453);
			match(T_SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_delcaration_c_stmtContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(PLHQLStatementsParser.T_EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public For_delcaration_c_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_delcaration_c_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterFor_delcaration_c_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitFor_delcaration_c_stmt(this);
		}
	}

	public final For_delcaration_c_stmtContext for_delcaration_c_stmt() throws RecognitionException {
		For_delcaration_c_stmtContext _localctx = new For_delcaration_c_stmtContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_for_delcaration_c_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1455);
				dtype();
				}
				break;
			}
			setState(1458);
			ident();
			setState(1459);
			match(T_EQUAL);
			setState(1460);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_for_range_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(PLHQLStatementsParser.T_FOR, 0); }
		public TerminalNode L_ID() { return getToken(PLHQLStatementsParser.L_ID, 0); }
		public TerminalNode T_IN() { return getToken(PLHQLStatementsParser.T_IN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_DOT2() { return getToken(PLHQLStatementsParser.T_DOT2, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_END() { return getToken(PLHQLStatementsParser.T_END, 0); }
		public List<TerminalNode> T_LOOP() { return getTokens(PLHQLStatementsParser.T_LOOP); }
		public TerminalNode T_LOOP(int i) {
			return getToken(PLHQLStatementsParser.T_LOOP, i);
		}
		public TerminalNode T_REVERSE() { return getToken(PLHQLStatementsParser.T_REVERSE, 0); }
		public TerminalNode T_BY() { return getToken(PLHQLStatementsParser.T_BY, 0); }
		public TerminalNode T_STEP() { return getToken(PLHQLStatementsParser.T_STEP, 0); }
		public Error_for_range_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_for_range_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_for_range_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_for_range_stmt(this);
		}
	}

	public final Error_for_range_stmtContext error_for_range_stmt() throws RecognitionException {
		Error_for_range_stmtContext _localctx = new Error_for_range_stmtContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_error_for_range_stmt);
		int _la;
		try {
			setState(1515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1462);
				match(T_FOR);
				setState(1463);
				match(L_ID);
				setState(1464);
				match(T_IN);
				setState(1466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_REVERSE) {
					{
					setState(1465);
					match(T_REVERSE);
					}
				}

				setState(1468);
				expr(0);
				setState(1469);
				match(T_DOT2);
				setState(1470);
				expr(0);
				setState(1473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_BY || _la==T_STEP) {
					{
					setState(1471);
					_la = _input.LA(1);
					if ( !(_la==T_BY || _la==T_STEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1472);
					expr(0);
					}
				}

				setState(1475);
				block();
				setState(1476);
				match(T_END);
				setState(1477);
				match(T_LOOP);
				notifyErrorListeners("Expected 'LOOP' keyword");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1480);
				match(T_FOR);
				setState(1481);
				match(L_ID);
				setState(1482);
				match(T_IN);
				setState(1484);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_REVERSE) {
					{
					setState(1483);
					match(T_REVERSE);
					}
				}

				setState(1486);
				expr(0);
				setState(1487);
				match(T_DOT2);
				setState(1488);
				expr(0);
				setState(1491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_BY || _la==T_STEP) {
					{
					setState(1489);
					_la = _input.LA(1);
					if ( !(_la==T_BY || _la==T_STEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1490);
					expr(0);
					}
				}

				setState(1493);
				match(T_LOOP);
				setState(1494);
				block();
				notifyErrorListeners("Expected 'END LOOP' keywords");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1497);
				match(T_FOR);
				setState(1498);
				match(L_ID);
				setState(1499);
				match(T_IN);
				setState(1501);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_REVERSE) {
					{
					setState(1500);
					match(T_REVERSE);
					}
				}

				setState(1503);
				expr(0);
				setState(1504);
				match(T_DOT2);
				setState(1505);
				expr(0);
				setState(1508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_BY || _la==T_STEP) {
					{
					setState(1506);
					_la = _input.LA(1);
					if ( !(_la==T_BY || _la==T_STEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1507);
					expr(0);
					}
				}

				setState(1510);
				match(T_LOOP);
				setState(1511);
				match(T_END);
				setState(1512);
				match(T_LOOP);
				notifyErrorListeners("Expected block clause");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public ArrayList<String> tempTables = new ArrayList<>();
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public Cte_select_stmtContext cte_select_stmt() {
			return getRuleContext(Cte_select_stmtContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitSelect_stmt(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(1517);
				cte_select_stmt();
				}
			}

			setState(1520);
			fullselect_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_stmtContext extends ParserRuleContext {
		public TerminalNode T_WITH() { return getToken(PLHQLStatementsParser.T_WITH, 0); }
		public List<Cte_select_stmt_itemContext> cte_select_stmt_item() {
			return getRuleContexts(Cte_select_stmt_itemContext.class);
		}
		public Cte_select_stmt_itemContext cte_select_stmt_item(int i) {
			return getRuleContext(Cte_select_stmt_itemContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Cte_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCte_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCte_select_stmt(this);
		}
	}

	public final Cte_select_stmtContext cte_select_stmt() throws RecognitionException {
		Cte_select_stmtContext _localctx = new Cte_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_cte_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1522);
			match(T_WITH);
			setState(1523);
			cte_select_stmt_item();
			setState(1528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1524);
				match(T_COMMA);
				setState(1525);
				cte_select_stmt_item();
				}
				}
				setState(1530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_stmt_itemContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(PLHQLStatementsParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public Cte_select_colsContext cte_select_cols() {
			return getRuleContext(Cte_select_colsContext.class,0);
		}
		public Cte_select_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCte_select_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCte_select_stmt_item(this);
		}
	}

	public final Cte_select_stmt_itemContext cte_select_stmt_item() throws RecognitionException {
		Cte_select_stmt_itemContext _localctx = new Cte_select_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_cte_select_stmt_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1531);
			ident();
			setState(1533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1532);
				cte_select_cols();
				}
			}

			setState(1535);
			match(T_AS);
			setState(1536);
			match(T_OPEN_P);
			setState(1537);
			fullselect_stmt();
			setState(1538);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_select_colsContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Cte_select_colsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_select_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCte_select_cols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCte_select_cols(this);
		}
	}

	public final Cte_select_colsContext cte_select_cols() throws RecognitionException {
		Cte_select_colsContext _localctx = new Cte_select_colsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_cte_select_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1540);
			match(T_OPEN_P);
			setState(1541);
			ident();
			setState(1546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1542);
				match(T_COMMA);
				setState(1543);
				ident();
				}
				}
				setState(1548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1549);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_stmtContext extends ParserRuleContext {
		public List<Fullselect_stmt_itemContext> fullselect_stmt_item() {
			return getRuleContexts(Fullselect_stmt_itemContext.class);
		}
		public Fullselect_stmt_itemContext fullselect_stmt_item(int i) {
			return getRuleContext(Fullselect_stmt_itemContext.class,i);
		}
		public List<Fullselect_set_clauseContext> fullselect_set_clause() {
			return getRuleContexts(Fullselect_set_clauseContext.class);
		}
		public Fullselect_set_clauseContext fullselect_set_clause(int i) {
			return getRuleContext(Fullselect_set_clauseContext.class,i);
		}
		public Fullselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterFullselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitFullselect_stmt(this);
		}
	}

	public final Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		Fullselect_stmtContext _localctx = new Fullselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			fullselect_stmt_item();
			setState(1557);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1552);
					fullselect_set_clause();
					setState(1553);
					fullselect_stmt_item();
					}
					} 
				}
				setState(1559);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_stmt_itemContext extends ParserRuleContext {
		public Subselect_stmtContext subselect_stmt() {
			return getRuleContext(Subselect_stmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public Fullselect_stmtContext fullselect_stmt() {
			return getRuleContext(Fullselect_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public Fullselect_stmt_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_stmt_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterFullselect_stmt_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitFullselect_stmt_item(this);
		}
	}

	public final Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		Fullselect_stmt_itemContext _localctx = new Fullselect_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_fullselect_stmt_item);
		try {
			setState(1565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1560);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1561);
				match(T_OPEN_P);
				setState(1562);
				fullselect_stmt();
				setState(1563);
				match(T_CLOSE_P);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fullselect_set_clauseContext extends ParserRuleContext {
		public TerminalNode T_UNION() { return getToken(PLHQLStatementsParser.T_UNION, 0); }
		public TerminalNode T_ALL() { return getToken(PLHQLStatementsParser.T_ALL, 0); }
		public TerminalNode T_EXCEPT() { return getToken(PLHQLStatementsParser.T_EXCEPT, 0); }
		public TerminalNode T_INTERSECT() { return getToken(PLHQLStatementsParser.T_INTERSECT, 0); }
		public Fullselect_set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullselect_set_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterFullselect_set_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitFullselect_set_clause(this);
		}
	}

	public final Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		Fullselect_set_clauseContext _localctx = new Fullselect_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(1579);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1567);
				match(T_UNION);
				setState(1569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1568);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1571);
				match(T_EXCEPT);
				setState(1573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1572);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1575);
				match(T_INTERSECT);
				setState(1577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1576);
					match(T_ALL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subselect_stmtContext extends ParserRuleContext {
		public String whereCondition = "";
		public ArrayList<String> selectionColumns = new ArrayList();
		public HashMap<String, String> orderingColumnsMap = new HashMap<>();
		public boolean isDistinct = false;
		public Set<Pair<String, String>> aggregateFunctionColumns = new LinkedHashSet<>();
		public ArrayList<String> groupByColumns = new ArrayList<>();
		public ArrayList<String> tables = new ArrayList<>();
		public HashMap<String, Integer> tablesOffset = new HashMap<>();;
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public TerminalNode T_SELECT() { return getToken(PLHQLStatementsParser.T_SELECT, 0); }
		public TerminalNode T_SEL() { return getToken(PLHQLStatementsParser.T_SEL, 0); }
		public Into_clauseContext into_clause() {
			return getRuleContext(Into_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Qualify_clauseContext qualify_clause() {
			return getRuleContext(Qualify_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Subselect_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subselect_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterSubselect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitSubselect_stmt(this);
		}
	}

	public final Subselect_stmtContext subselect_stmt() throws RecognitionException {
		Subselect_stmtContext _localctx = new Subselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1581);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1582);
			select_list();
			setState(1584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_INTO) {
				{
				setState(1583);
				into_clause();
				}
			}

			setState(1586);
			from_clause();
			setState(1588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1587);
				where_clause();
				}
				break;
			}
			setState(1591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1590);
				group_by_clause();
				}
				break;
			}
			setState(1595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1593);
				having_clause();
				}
				break;
			case 2:
				{
				setState(1594);
				qualify_clause();
				}
				break;
			}
			setState(1598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1597);
				order_by_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_subselectContext extends ParserRuleContext {
		public Select_listContext select_list() {
			return getRuleContext(Select_listContext.class,0);
		}
		public TerminalNode T_SELECT() { return getToken(PLHQLStatementsParser.T_SELECT, 0); }
		public TerminalNode T_SEL() { return getToken(PLHQLStatementsParser.T_SEL, 0); }
		public Into_clauseContext into_clause() {
			return getRuleContext(Into_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Qualify_clauseContext qualify_clause() {
			return getRuleContext(Qualify_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Error_from_clauseContext error_from_clause() {
			return getRuleContext(Error_from_clauseContext.class,0);
		}
		public Error_subselectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_subselect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_subselect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_subselect(this);
		}
	}

	public final Error_subselectContext error_subselect() throws RecognitionException {
		Error_subselectContext _localctx = new Error_subselectContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_error_subselect);
		int _la;
		try {
			setState(1621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1600);
				_la = _input.LA(1);
				if ( !(_la==T_SEL || _la==T_SELECT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1601);
				select_list();
				setState(1603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1602);
					into_clause();
					}
					break;
				}
				setState(1606);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1605);
					where_clause();
					}
					break;
				}
				setState(1609);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1608);
					group_by_clause();
					}
					break;
				}
				setState(1613);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1611);
					having_clause();
					}
					break;
				case 2:
					{
					setState(1612);
					qualify_clause();
					}
					break;
				}
				setState(1616);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1615);
					order_by_clause();
					}
					break;
				}
				}
				break;
			case T_FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1618);
				error_from_clause();
				notifyErrorListeners("Missing 'FROM' clause");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_listContext extends ParserRuleContext {
		public List<Select_list_itemContext> select_list_item() {
			return getRuleContexts(Select_list_itemContext.class);
		}
		public Select_list_itemContext select_list_item(int i) {
			return getRuleContext(Select_list_itemContext.class,i);
		}
		public Select_list_setContext select_list_set() {
			return getRuleContext(Select_list_setContext.class,0);
		}
		public Select_list_limitContext select_list_limit() {
			return getRuleContext(Select_list_limitContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Select_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterSelect_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitSelect_list(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_select_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ALL || _la==T_DISTINCT) {
				{
				setState(1623);
				select_list_set();
				}
			}

			setState(1627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TOP) {
				{
				setState(1626);
				select_list_limit();
				}
			}

			setState(1629);
			select_list_item();
			setState(1634);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1630);
					match(T_COMMA);
					setState(1631);
					select_list_item();
					}
					} 
				}
				setState(1636);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_setContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(PLHQLStatementsParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(PLHQLStatementsParser.T_DISTINCT, 0); }
		public Select_list_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterSelect_list_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitSelect_list_set(this);
		}
	}

	public final Select_list_setContext select_list_set() throws RecognitionException {
		Select_list_setContext _localctx = new Select_list_setContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_select_list_set);
		try {
			setState(1640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1637);
				match(T_ALL);
				}
				break;
			case T_DISTINCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1638);
				match(T_DISTINCT);
				((Subselect_stmtContext)getInvokingContext(93)).isDistinct = true;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_limitContext extends ParserRuleContext {
		public TerminalNode T_TOP() { return getToken(PLHQLStatementsParser.T_TOP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_limitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_limit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterSelect_list_limit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitSelect_list_limit(this);
		}
	}

	public final Select_list_limitContext select_list_limit() throws RecognitionException {
		Select_list_limitContext _localctx = new Select_list_limitContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1642);
			match(T_TOP);
			setState(1643);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_itemContext extends ParserRuleContext {
		public IdentContext ident;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_list_asteriskContext select_list_asterisk() {
			return getRuleContext(Select_list_asteriskContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(PLHQLStatementsParser.T_EQUAL, 0); }
		public Select_list_aliasContext select_list_alias() {
			return getRuleContext(Select_list_aliasContext.class,0);
		}
		public Select_list_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterSelect_list_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitSelect_list_item(this);
		}
	}

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1649);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1645);
					((Select_list_itemContext)_localctx).ident = ident();
					setState(1646);
					match(T_EQUAL);
					((Subselect_stmtContext)getInvokingContext(93)).selectionColumns.add((((Select_list_itemContext)_localctx).ident!=null?_input.getText(((Select_list_itemContext)_localctx).ident.start,((Select_list_itemContext)_localctx).ident.stop):null));
					}
					break;
				}
				setState(1651);
				expr(0);
				setState(1653);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1652);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1655);
				select_list_asterisk();
				}
				break;
			}
			((Subselect_stmtContext)getInvokingContext(93)).selectionColumns.add(_input.getText(_localctx.start, _input.LT(-1)));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_aliasContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(PLHQLStatementsParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public TerminalNode T_TITLE() { return getToken(PLHQLStatementsParser.T_TITLE, 0); }
		public TerminalNode L_S_STRING() { return getToken(PLHQLStatementsParser.L_S_STRING, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public Select_list_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterSelect_list_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitSelect_list_alias(this);
		}
	}

	public final Select_list_aliasContext select_list_alias() throws RecognitionException {
		Select_list_aliasContext _localctx = new Select_list_aliasContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_select_list_alias);
		int _la;
		try {
			setState(1669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1660);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(1662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1661);
					match(T_AS);
					}
				}

				setState(1664);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1665);
				match(T_OPEN_P);
				setState(1666);
				match(T_TITLE);
				setState(1667);
				match(L_S_STRING);
				setState(1668);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_list_asteriskContext extends ParserRuleContext {
		public TerminalNode T_MUL() { return getToken(PLHQLStatementsParser.T_MUL, 0); }
		public TerminalNode L_ID() { return getToken(PLHQLStatementsParser.L_ID, 0); }
		public Select_list_asteriskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_list_asterisk; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterSelect_list_asterisk(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitSelect_list_asterisk(this);
		}
	}

	public final Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		Select_list_asteriskContext _localctx = new Select_list_asteriskContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(1671);
				match(L_ID);
				setState(1672);
				match(T__3);
				}
			}

			setState(1675);
			match(T_MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Into_clauseContext extends ParserRuleContext {
		public TerminalNode T_INTO() { return getToken(PLHQLStatementsParser.T_INTO, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Into_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_into_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterInto_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitInto_clause(this);
		}
	}

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1677);
			match(T_INTO);
			setState(1678);
			ident();
			setState(1683);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1679);
					match(T_COMMA);
					setState(1680);
					ident();
					}
					} 
				}
				setState(1685);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public java.util.Stack<String> tables = new java.util.Stack<>();
		public String joinType;
		public int tablesCount = 0;
		public TerminalNode T_FROM() { return getToken(PLHQLStatementsParser.T_FROM, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public List<From_join_clauseContext> from_join_clause() {
			return getRuleContexts(From_join_clauseContext.class);
		}
		public From_join_clauseContext from_join_clause(int i) {
			return getRuleContext(From_join_clauseContext.class,i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitFrom_clause(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1686);
			match(T_FROM);
			setState(1687);
			from_table_clause();
			setState(1691);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1688);
					from_join_clause();
					}
					} 
				}
				setState(1693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_from_clauseContext extends ParserRuleContext {
		public TerminalNode T_FROM() { return getToken(PLHQLStatementsParser.T_FROM, 0); }
		public List<From_join_clauseContext> from_join_clause() {
			return getRuleContexts(From_join_clauseContext.class);
		}
		public From_join_clauseContext from_join_clause(int i) {
			return getRuleContext(From_join_clauseContext.class,i);
		}
		public Error_from_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_from_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_from_clause(this);
		}
	}

	public final Error_from_clauseContext error_from_clause() throws RecognitionException {
		Error_from_clauseContext _localctx = new Error_from_clauseContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_error_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			match(T_FROM);
			setState(1698);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1695);
					from_join_clause();
					}
					} 
				}
				setState(1700);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_clauseContext extends ParserRuleContext {
		public From_table_name_clauseContext from_table_name_clause() {
			return getRuleContext(From_table_name_clauseContext.class,0);
		}
		public From_subselect_clauseContext from_subselect_clause() {
			return getRuleContext(From_subselect_clauseContext.class,0);
		}
		public From_table_values_clauseContext from_table_values_clause() {
			return getRuleContext(From_table_values_clauseContext.class,0);
		}
		public From_table_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterFrom_table_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitFrom_table_clause(this);
		}
	}

	public final From_table_clauseContext from_table_clause() throws RecognitionException {
		From_table_clauseContext _localctx = new From_table_clauseContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_from_table_clause);
		try {
			setState(1704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1701);
				from_table_name_clause();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1702);
				from_subselect_clause();
				}
				break;
			case T_TABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1703);
				from_table_values_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_name_clauseContext extends ParserRuleContext {
		public Table_nameContext table_name;
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_name_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_name_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterFrom_table_name_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitFrom_table_name_clause(this);
		}
	}

	public final From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		From_table_name_clauseContext _localctx = new From_table_name_clauseContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			((From_table_name_clauseContext)_localctx).table_name = table_name();
			setState(1708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1707);
				from_alias_clause();
				}
				break;
			}

			       ((From_clauseContext)getInvokingContext(102)).tables.push((((From_table_name_clauseContext)_localctx).table_name!=null?_input.getText(((From_table_name_clauseContext)_localctx).table_name.start,((From_table_name_clauseContext)_localctx).table_name.stop):null));
			       ((From_clauseContext)getInvokingContext(102)).tablesCount+=1;
			       ((Subselect_stmtContext)getInvokingContext(93)).tables.add((((From_table_name_clauseContext)_localctx).table_name!=null?_input.getText(((From_table_name_clauseContext)_localctx).table_name.start,((From_table_name_clauseContext)_localctx).table_name.stop):null));
			       
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_subselect_clauseContext extends ParserRuleContext {
		public From_alias_clauseContext from_alias_clause;
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_subselect_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_subselect_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterFrom_subselect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitFrom_subselect_clause(this);
		}
	}

	public final From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		From_subselect_clauseContext _localctx = new From_subselect_clauseContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			match(T_OPEN_P);
			setState(1713);
			select_stmt();
			setState(1714);
			match(T_CLOSE_P);
			setState(1715);
			((From_subselect_clauseContext)_localctx).from_alias_clause = from_alias_clause();

			       ((From_clauseContext)getInvokingContext(102)).tables.push((((From_subselect_clauseContext)_localctx).from_alias_clause!=null?_input.getText(((From_subselect_clauseContext)_localctx).from_alias_clause.start,((From_subselect_clauseContext)_localctx).from_alias_clause.stop):null));
			       ((From_clauseContext)getInvokingContext(102)).tablesCount+=1;
			       ((Select_stmtContext)getInvokingContext(86)).tempTables.add((((From_subselect_clauseContext)_localctx).from_alias_clause!=null?_input.getText(((From_subselect_clauseContext)_localctx).from_alias_clause.start,((From_subselect_clauseContext)_localctx).from_alias_clause.stop):null));
			       
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_clauseContext extends ParserRuleContext {
		public From_join_type_clauseContext from_join_type_clause;
		public Bool_exprContext bool_expr;
		public TerminalNode T_COMMA() { return getToken(PLHQLStatementsParser.T_COMMA, 0); }
		public From_table_clauseContext from_table_clause() {
			return getRuleContext(From_table_clauseContext.class,0);
		}
		public From_join_type_clauseContext from_join_type_clause() {
			return getRuleContext(From_join_type_clauseContext.class,0);
		}
		public TerminalNode T_ON() { return getToken(PLHQLStatementsParser.T_ON, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public From_join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterFrom_join_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitFrom_join_clause(this);
		}
	}

	public final From_join_clauseContext from_join_clause() throws RecognitionException {
		From_join_clauseContext _localctx = new From_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_from_join_clause);
		try {
			setState(1726);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1718);
				match(T_COMMA);
				setState(1719);
				from_table_clause();
				}
				break;
			case T_FULL:
			case T_INNER:
			case T_JOIN:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1720);
				((From_join_clauseContext)_localctx).from_join_type_clause = from_join_type_clause();
				setState(1721);
				from_table_clause();
				setState(1722);
				match(T_ON);
				setState(1723);
				((From_join_clauseContext)_localctx).bool_expr = bool_expr(0);

				       ((From_clauseContext)getInvokingContext(102)).tables.push((((From_join_clauseContext)_localctx).bool_expr!=null?_input.getText(((From_join_clauseContext)_localctx).bool_expr.start,((From_join_clauseContext)_localctx).bool_expr.stop):null));
				       ((From_clauseContext)getInvokingContext(102)).joinType = (((From_join_clauseContext)_localctx).from_join_type_clause!=null?_input.getText(((From_join_clauseContext)_localctx).from_join_type_clause.start,((From_join_clauseContext)_localctx).from_join_type_clause.stop):null);
				     
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_join_type_clauseContext extends ParserRuleContext {
		public TerminalNode T_JOIN() { return getToken(PLHQLStatementsParser.T_JOIN, 0); }
		public TerminalNode T_INNER() { return getToken(PLHQLStatementsParser.T_INNER, 0); }
		public TerminalNode T_LEFT() { return getToken(PLHQLStatementsParser.T_LEFT, 0); }
		public TerminalNode T_RIGHT() { return getToken(PLHQLStatementsParser.T_RIGHT, 0); }
		public TerminalNode T_FULL() { return getToken(PLHQLStatementsParser.T_FULL, 0); }
		public TerminalNode T_OUTER() { return getToken(PLHQLStatementsParser.T_OUTER, 0); }
		public From_join_type_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_join_type_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterFrom_join_type_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitFrom_join_type_clause(this);
		}
	}

	public final From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		From_join_type_clauseContext _localctx = new From_join_type_clauseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_from_join_type_clause);
		int _la;
		try {
			setState(1737);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1729);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1728);
					match(T_INNER);
					}
				}

				setState(1731);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1732);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(1733);
					match(T_OUTER);
					}
				}

				setState(1736);
				match(T_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_values_clauseContext extends ParserRuleContext {
		public TerminalNode T_TABLE() { return getToken(PLHQLStatementsParser.T_TABLE, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public TerminalNode T_VALUES() { return getToken(PLHQLStatementsParser.T_VALUES, 0); }
		public List<From_table_values_rowContext> from_table_values_row() {
			return getRuleContexts(From_table_values_rowContext.class);
		}
		public From_table_values_rowContext from_table_values_row(int i) {
			return getRuleContext(From_table_values_rowContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public From_alias_clauseContext from_alias_clause() {
			return getRuleContext(From_alias_clauseContext.class,0);
		}
		public From_table_values_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterFrom_table_values_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitFrom_table_values_clause(this);
		}
	}

	public final From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		From_table_values_clauseContext _localctx = new From_table_values_clauseContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1739);
			match(T_TABLE);
			setState(1740);
			match(T_OPEN_P);
			setState(1741);
			match(T_VALUES);
			setState(1742);
			from_table_values_row();
			setState(1747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1743);
				match(T_COMMA);
				setState(1744);
				from_table_values_row();
				}
				}
				setState(1749);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1750);
			match(T_CLOSE_P);
			setState(1752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1751);
				from_alias_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_table_values_rowContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public From_table_values_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_table_values_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterFrom_table_values_row(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitFrom_table_values_row(this);
		}
	}

	public final From_table_values_rowContext from_table_values_row() throws RecognitionException {
		From_table_values_rowContext _localctx = new From_table_values_rowContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_from_table_values_row);
		int _la;
		try {
			setState(1766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1754);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1755);
				match(T_OPEN_P);
				setState(1756);
				expr(0);
				setState(1761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1757);
					match(T_COMMA);
					setState(1758);
					expr(0);
					}
					}
					setState(1763);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1764);
				match(T_CLOSE_P);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_alias_clauseContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(PLHQLStatementsParser.T_AS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public List<TerminalNode> L_ID() { return getTokens(PLHQLStatementsParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(PLHQLStatementsParser.L_ID, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public From_alias_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_alias_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterFrom_alias_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitFrom_alias_clause(this);
		}
	}

	public final From_alias_clauseContext from_alias_clause() throws RecognitionException {
		From_alias_clauseContext _localctx = new From_alias_clauseContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(1770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS) {
				{
				setState(1769);
				match(T_AS);
				}
			}

			setState(1772);
			ident();
			setState(1783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1773);
				match(T_OPEN_P);
				setState(1774);
				match(L_ID);
				setState(1779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1775);
					match(T_COMMA);
					setState(1776);
					match(L_ID);
					}
					}
					setState(1781);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1782);
				match(T_CLOSE_P);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public Bool_exprContext bool_expr;
		public TerminalNode T_WHERE() { return getToken(PLHQLStatementsParser.T_WHERE, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitWhere_clause(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			match(T_WHERE);
			setState(1788);
			((Where_clauseContext)_localctx).bool_expr = bool_expr(0);

			       ((Subselect_stmtContext)getInvokingContext(93)).whereCondition = (((Where_clauseContext)_localctx).bool_expr!=null?_input.getText(((Where_clauseContext)_localctx).bool_expr.start,((Where_clauseContext)_localctx).bool_expr.stop):null);
			       
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_missing_bool_exprContext extends ParserRuleContext {
		public TerminalNode T_WHERE() { return getToken(PLHQLStatementsParser.T_WHERE, 0); }
		public Error_missing_bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_missing_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_missing_bool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_missing_bool_expr(this);
		}
	}

	public final Error_missing_bool_exprContext error_missing_bool_expr() throws RecognitionException {
		Error_missing_bool_exprContext _localctx = new Error_missing_bool_exprContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_error_missing_bool_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1791);
			match(T_WHERE);
			notifyErrorListeners("Expected boolean expression");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_clauseContext extends ParserRuleContext {
		public Group_by_exprContext group_by_expr;
		public TerminalNode T_GROUP() { return getToken(PLHQLStatementsParser.T_GROUP, 0); }
		public TerminalNode T_BY() { return getToken(PLHQLStatementsParser.T_BY, 0); }
		public List<Group_by_exprContext> group_by_expr() {
			return getRuleContexts(Group_by_exprContext.class);
		}
		public Group_by_exprContext group_by_expr(int i) {
			return getRuleContext(Group_by_exprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterGroup_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitGroup_by_clause(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			match(T_GROUP);
			setState(1795);
			match(T_BY);
			setState(1796);
			((Group_by_clauseContext)_localctx).group_by_expr = group_by_expr(0);
			 ((Subselect_stmtContext)getInvokingContext(93)).groupByColumns.add((((Group_by_clauseContext)_localctx).group_by_expr!=null?_input.getText(((Group_by_clauseContext)_localctx).group_by_expr.start,((Group_by_clauseContext)_localctx).group_by_expr.stop):null)); 
			setState(1804);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1798);
					match(T_COMMA);
					setState(1799);
					((Group_by_clauseContext)_localctx).group_by_expr = group_by_expr(0);
					 ((Subselect_stmtContext)getInvokingContext(93)).groupByColumns.add((((Group_by_clauseContext)_localctx).group_by_expr!=null?_input.getText(((Group_by_clauseContext)_localctx).group_by_expr.start,((Group_by_clauseContext)_localctx).group_by_expr.stop):null)); 
					}
					} 
				}
				setState(1806);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public LinkedList<Pair<String, String>> aggregateFunctionColumns = new LinkedList<>();
		public LinkedList<Pair<String, String>> conditions = new LinkedList<>();
		public TerminalNode T_HAVING() { return getToken(PLHQLStatementsParser.T_HAVING, 0); }
		public Having_bool_exprContext having_bool_expr() {
			return getRuleContext(Having_bool_exprContext.class,0);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitHaving_clause(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1807);
			match(T_HAVING);
			setState(1808);
			having_bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualify_clauseContext extends ParserRuleContext {
		public TerminalNode T_QUALIFY() { return getToken(PLHQLStatementsParser.T_QUALIFY, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Qualify_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualify_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterQualify_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitQualify_clause(this);
		}
	}

	public final Qualify_clauseContext qualify_clause() throws RecognitionException {
		Qualify_clauseContext _localctx = new Qualify_clauseContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1810);
			match(T_QUALIFY);
			setState(1811);
			bool_expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public ExprContext expr;
		public Sort_typeContext sort_type;
		public TerminalNode T_ORDER() { return getToken(PLHQLStatementsParser.T_ORDER, 0); }
		public TerminalNode T_BY() { return getToken(PLHQLStatementsParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Sort_typeContext> sort_type() {
			return getRuleContexts(Sort_typeContext.class);
		}
		public Sort_typeContext sort_type(int i) {
			return getRuleContext(Sort_typeContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitOrder_by_clause(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_order_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			match(T_ORDER);
			setState(1814);
			match(T_BY);
			setState(1815);
			((Order_by_clauseContext)_localctx).expr = expr(0);
			setState(1816);
			((Order_by_clauseContext)_localctx).sort_type = sort_type();
			 ((Subselect_stmtContext)getInvokingContext(93)).orderingColumnsMap.put((((Order_by_clauseContext)_localctx).expr!=null?_input.getText(((Order_by_clauseContext)_localctx).expr.start,((Order_by_clauseContext)_localctx).expr.stop):null),(((Order_by_clauseContext)_localctx).sort_type!=null?_input.getText(((Order_by_clauseContext)_localctx).sort_type.start,((Order_by_clauseContext)_localctx).sort_type.stop):null)); 
			setState(1825);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1818);
					match(T_COMMA);
					setState(1819);
					((Order_by_clauseContext)_localctx).expr = expr(0);
					setState(1820);
					((Order_by_clauseContext)_localctx).sort_type = sort_type();
					 ((Subselect_stmtContext)getInvokingContext(93)).orderingColumnsMap.put((((Order_by_clauseContext)_localctx).expr!=null?_input.getText(((Order_by_clauseContext)_localctx).expr.start,((Order_by_clauseContext)_localctx).expr.stop):null),(((Order_by_clauseContext)_localctx).sort_type!=null?_input.getText(((Order_by_clauseContext)_localctx).sort_type.start,((Order_by_clauseContext)_localctx).sort_type.stop):null)); 
					}
					} 
				}
				setState(1827);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sort_typeContext extends ParserRuleContext {
		public TerminalNode T_ASC() { return getToken(PLHQLStatementsParser.T_ASC, 0); }
		public TerminalNode T_DESC() { return getToken(PLHQLStatementsParser.T_DESC, 0); }
		public Sort_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sort_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterSort_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitSort_type(this);
		}
	}

	public final Sort_typeContext sort_type() throws RecognitionException {
		Sort_typeContext _localctx = new Sort_typeContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_sort_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1828);
				match(T_ASC);
				}
				break;
			case 2:
				{
				setState(1829);
				match(T_DESC);
				}
				break;
			case 3:
				{
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public TerminalNode T_NOT() { return getToken(PLHQLStatementsParser.T_NOT, 0); }
		public Bool_expr_atomContext bool_expr_atom() {
			return getRuleContext(Bool_expr_atomContext.class,0);
		}
		public Bool_expr_logical_operatorContext bool_expr_logical_operator() {
			return getRuleContext(Bool_expr_logical_operatorContext.class,0);
		}
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitBool_expr(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 240;
		enterRecursionRule(_localctx, 240, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				{
				setState(1835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1834);
					match(T_NOT);
					}
				}

				setState(1837);
				match(T_OPEN_P);
				setState(1838);
				bool_expr(0);
				setState(1839);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1841);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1850);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(1844);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1845);
					bool_expr_logical_operator();
					setState(1846);
					bool_expr(3);
					}
					} 
				}
				setState(1852);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Having_bool_exprContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public List<Having_bool_exprContext> having_bool_expr() {
			return getRuleContexts(Having_bool_exprContext.class);
		}
		public Having_bool_exprContext having_bool_expr(int i) {
			return getRuleContext(Having_bool_exprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public TerminalNode T_NOT() { return getToken(PLHQLStatementsParser.T_NOT, 0); }
		public Having_expr_atomContext having_expr_atom() {
			return getRuleContext(Having_expr_atomContext.class,0);
		}
		public Bool_expr_logical_operatorContext bool_expr_logical_operator() {
			return getRuleContext(Bool_expr_logical_operatorContext.class,0);
		}
		public Having_bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterHaving_bool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitHaving_bool_expr(this);
		}
	}

	public final Having_bool_exprContext having_bool_expr() throws RecognitionException {
		return having_bool_expr(0);
	}

	private Having_bool_exprContext having_bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Having_bool_exprContext _localctx = new Having_bool_exprContext(_ctx, _parentState);
		Having_bool_exprContext _prevctx = _localctx;
		int _startState = 242;
		enterRecursionRule(_localctx, 242, RULE_having_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1854);
					match(T_NOT);
					}
				}

				setState(1857);
				match(T_OPEN_P);
				setState(1858);
				having_bool_expr(0);
				setState(1859);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1861);
				having_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1870);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Having_bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_having_bool_expr);
					setState(1864);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1865);
					bool_expr_logical_operator();
					setState(1866);
					having_bool_expr(3);
					}
					} 
				}
				setState(1872);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Having_expr_atomContext extends ParserRuleContext {
		public Having_bool_expr_binaryContext having_bool_expr_binary() {
			return getRuleContext(Having_bool_expr_binaryContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public Having_expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterHaving_expr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitHaving_expr_atom(this);
		}
	}

	public final Having_expr_atomContext having_expr_atom() throws RecognitionException {
		Having_expr_atomContext _localctx = new Having_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_having_expr_atom);
		try {
			setState(1875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1873);
				having_bool_expr_binary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1874);
				bool_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_atomContext extends ParserRuleContext {
		public Bool_expr_unaryContext bool_expr_unary() {
			return getRuleContext(Bool_expr_unaryContext.class,0);
		}
		public Bool_expr_binaryContext bool_expr_binary() {
			return getRuleContext(Bool_expr_binaryContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public Bool_expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterBool_expr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitBool_expr_atom(this);
		}
	}

	public final Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		Bool_expr_atomContext _localctx = new Bool_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_bool_expr_atom);
		try {
			setState(1880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1877);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1878);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1879);
				bool_literal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_unaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IS() { return getToken(PLHQLStatementsParser.T_IS, 0); }
		public TerminalNode T_NULL() { return getToken(PLHQLStatementsParser.T_NULL, 0); }
		public TerminalNode T_FALSE() { return getToken(PLHQLStatementsParser.T_FALSE, 0); }
		public TerminalNode T_TRUE() { return getToken(PLHQLStatementsParser.T_TRUE, 0); }
		public TerminalNode T_NOT() { return getToken(PLHQLStatementsParser.T_NOT, 0); }
		public TerminalNode T_BETWEEN() { return getToken(PLHQLStatementsParser.T_BETWEEN, 0); }
		public TerminalNode T_AND() { return getToken(PLHQLStatementsParser.T_AND, 0); }
		public TerminalNode T_EXISTS() { return getToken(PLHQLStatementsParser.T_EXISTS, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public Bool_expr_single_inContext bool_expr_single_in() {
			return getRuleContext(Bool_expr_single_inContext.class,0);
		}
		public Bool_expr_multi_inContext bool_expr_multi_in() {
			return getRuleContext(Bool_expr_multi_inContext.class,0);
		}
		public Bool_expr_unaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterBool_expr_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitBool_expr_unary(this);
		}
	}

	public final Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		Bool_expr_unaryContext _localctx = new Bool_expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_bool_expr_unary);
		int _la;
		try {
			setState(1905);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1882);
				expr(0);
				setState(1883);
				match(T_IS);
				setState(1885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1884);
					match(T_NOT);
					}
				}

				setState(1887);
				_la = _input.LA(1);
				if ( !(_la==T_FALSE || _la==T_NULL || _la==T_TRUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1889);
				expr(0);
				setState(1890);
				match(T_BETWEEN);
				setState(1891);
				expr(0);
				setState(1892);
				match(T_AND);
				setState(1893);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1895);
					match(T_NOT);
					}
				}

				setState(1898);
				match(T_EXISTS);
				setState(1899);
				match(T_OPEN_P);
				setState(1900);
				select_stmt();
				setState(1901);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1903);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1904);
				bool_expr_multi_in();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_single_inContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_IN() { return getToken(PLHQLStatementsParser.T_IN, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_NOT() { return getToken(PLHQLStatementsParser.T_NOT, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Bool_expr_single_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_single_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterBool_expr_single_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitBool_expr_single_in(this);
		}
	}

	public final Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		Bool_expr_single_inContext _localctx = new Bool_expr_single_inContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			expr(0);
			setState(1909);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(1908);
				match(T_NOT);
				}
			}

			setState(1911);
			match(T_IN);
			setState(1912);
			match(T_OPEN_P);
			setState(1922);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				{
				setState(1913);
				expr(0);
				setState(1918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1914);
					match(T_COMMA);
					setState(1915);
					expr(0);
					}
					}
					setState(1920);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(1921);
				select_stmt();
				}
				break;
			}
			setState(1924);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_multi_inContext extends ParserRuleContext {
		public List<TerminalNode> T_OPEN_P() { return getTokens(PLHQLStatementsParser.T_OPEN_P); }
		public TerminalNode T_OPEN_P(int i) {
			return getToken(PLHQLStatementsParser.T_OPEN_P, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_CLOSE_P() { return getTokens(PLHQLStatementsParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(PLHQLStatementsParser.T_CLOSE_P, i);
		}
		public TerminalNode T_IN() { return getToken(PLHQLStatementsParser.T_IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public TerminalNode T_NOT() { return getToken(PLHQLStatementsParser.T_NOT, 0); }
		public Bool_expr_multi_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_multi_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterBool_expr_multi_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitBool_expr_multi_in(this);
		}
	}

	public final Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		Bool_expr_multi_inContext _localctx = new Bool_expr_multi_inContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1926);
			match(T_OPEN_P);
			setState(1927);
			expr(0);
			setState(1932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1928);
				match(T_COMMA);
				setState(1929);
				expr(0);
				}
				}
				setState(1934);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1935);
			match(T_CLOSE_P);
			setState(1937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(1936);
				match(T_NOT);
				}
			}

			setState(1939);
			match(T_IN);
			setState(1940);
			match(T_OPEN_P);
			setState(1941);
			select_stmt();
			setState(1942);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binaryContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Bool_expr_binary_operatorContext bool_expr_binary_operator() {
			return getRuleContext(Bool_expr_binary_operatorContext.class,0);
		}
		public Bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterBool_expr_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitBool_expr_binary(this);
		}
	}

	public final Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		Bool_expr_binaryContext _localctx = new Bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1944);
			expr(0);
			setState(1945);
			bool_expr_binary_operator();
			setState(1946);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_bool_expr_binaryContext extends ParserRuleContext {
		public ExprContext expr;
		public Bool_expr_binary_operatorContext bool_expr_binary_operator;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Bool_expr_binary_operatorContext bool_expr_binary_operator() {
			return getRuleContext(Bool_expr_binary_operatorContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Having_bool_expr_binaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_bool_expr_binary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterHaving_bool_expr_binary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitHaving_bool_expr_binary(this);
		}
	}

	public final Having_bool_expr_binaryContext having_bool_expr_binary() throws RecognitionException {
		Having_bool_expr_binaryContext _localctx = new Having_bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_having_bool_expr_binary);
		try {
			setState(1958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1948);
				((Having_bool_expr_binaryContext)_localctx).expr = expr(0);
				setState(1949);
				((Having_bool_expr_binaryContext)_localctx).bool_expr_binary_operator = bool_expr_binary_operator();
				setState(1950);
				expr_agg_window_func();
				((Having_clauseContext)getInvokingContext(116)).conditions.add(new Pair<>("AFTER", (((Having_bool_expr_binaryContext)_localctx).expr!=null?_input.getText(((Having_bool_expr_binaryContext)_localctx).expr.start,((Having_bool_expr_binaryContext)_localctx).expr.stop):null) + (((Having_bool_expr_binaryContext)_localctx).bool_expr_binary_operator!=null?_input.getText(((Having_bool_expr_binaryContext)_localctx).bool_expr_binary_operator.start,((Having_bool_expr_binaryContext)_localctx).bool_expr_binary_operator.stop):null)));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1953);
				expr_agg_window_func();
				setState(1954);
				((Having_bool_expr_binaryContext)_localctx).bool_expr_binary_operator = bool_expr_binary_operator();
				setState(1955);
				((Having_bool_expr_binaryContext)_localctx).expr = expr(0);
				((Having_clauseContext)getInvokingContext(116)).conditions.add(new Pair<>("BEFORE", (((Having_bool_expr_binaryContext)_localctx).bool_expr_binary_operator!=null?_input.getText(((Having_bool_expr_binaryContext)_localctx).bool_expr_binary_operator.start,((Having_bool_expr_binaryContext)_localctx).bool_expr_binary_operator.stop):null) + (((Having_bool_expr_binaryContext)_localctx).expr!=null?_input.getText(((Having_bool_expr_binaryContext)_localctx).expr.start,((Having_bool_expr_binaryContext)_localctx).expr.stop):null) ));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_logical_operatorContext extends ParserRuleContext {
		public Bool_andContext bool_and() {
			return getRuleContext(Bool_andContext.class,0);
		}
		public Bool_orContext bool_or() {
			return getRuleContext(Bool_orContext.class,0);
		}
		public Bool_expr_logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterBool_expr_logical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitBool_expr_logical_operator(this);
		}
	}

	public final Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		Bool_expr_logical_operatorContext _localctx = new Bool_expr_logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_bool_expr_logical_operator);
		try {
			setState(1962);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AND_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(1960);
				bool_and();
				}
				break;
			case T_PIPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1961);
				bool_or();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_andContext extends ParserRuleContext {
		public TerminalNode T_AND_AND() { return getToken(PLHQLStatementsParser.T_AND_AND, 0); }
		public Bool_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterBool_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitBool_and(this);
		}
	}

	public final Bool_andContext bool_and() throws RecognitionException {
		Bool_andContext _localctx = new Bool_andContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_bool_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1964);
			match(T_AND_AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_orContext extends ParserRuleContext {
		public TerminalNode T_PIPE() { return getToken(PLHQLStatementsParser.T_PIPE, 0); }
		public Bool_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterBool_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitBool_or(this);
		}
	}

	public final Bool_orContext bool_or() throws RecognitionException {
		Bool_orContext _localctx = new Bool_orContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_bool_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1966);
			match(T_PIPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_expr_binary_operatorContext extends ParserRuleContext {
		public TerminalNode T_EQUAL2() { return getToken(PLHQLStatementsParser.T_EQUAL2, 0); }
		public TerminalNode T_NOTEQUAL() { return getToken(PLHQLStatementsParser.T_NOTEQUAL, 0); }
		public TerminalNode T_NOTEQUAL2() { return getToken(PLHQLStatementsParser.T_NOTEQUAL2, 0); }
		public TerminalNode T_LESS() { return getToken(PLHQLStatementsParser.T_LESS, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(PLHQLStatementsParser.T_LESSEQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(PLHQLStatementsParser.T_GREATER, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(PLHQLStatementsParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_LIKE() { return getToken(PLHQLStatementsParser.T_LIKE, 0); }
		public TerminalNode T_RLIKE() { return getToken(PLHQLStatementsParser.T_RLIKE, 0); }
		public TerminalNode T_REGEXP() { return getToken(PLHQLStatementsParser.T_REGEXP, 0); }
		public TerminalNode T_NOT() { return getToken(PLHQLStatementsParser.T_NOT, 0); }
		public Bool_expr_binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterBool_expr_binary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitBool_expr_binary_operator(this);
		}
	}

	public final Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		Bool_expr_binary_operatorContext _localctx = new Bool_expr_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(1979);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL2:
				enterOuterAlt(_localctx, 1);
				{
				setState(1968);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1969);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 3);
				{
				setState(1970);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 4);
				{
				setState(1971);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1972);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 6);
				{
				setState(1973);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1974);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1975);
					match(T_NOT);
					}
				}

				setState(1978);
				_la = _input.LA(1);
				if ( !(_la==T_LIKE || _la==T_REGEXP || _la==T_RLIKE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_exprContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public List<Group_by_exprContext> group_by_expr() {
			return getRuleContexts(Group_by_exprContext.class);
		}
		public Group_by_exprContext group_by_expr(int i) {
			return getRuleContext(Group_by_exprContext.class,i);
		}
		public Expr_intervalContext expr_interval() {
			return getRuleContext(Expr_intervalContext.class,0);
		}
		public Expr_concatContext expr_concat() {
			return getRuleContext(Expr_concatContext.class,0);
		}
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public TerminalNode T_MUL() { return getToken(PLHQLStatementsParser.T_MUL, 0); }
		public TerminalNode T_DIV() { return getToken(PLHQLStatementsParser.T_DIV, 0); }
		public TerminalNode T_ADD() { return getToken(PLHQLStatementsParser.T_ADD, 0); }
		public TerminalNode T_SUB() { return getToken(PLHQLStatementsParser.T_SUB, 0); }
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public TerminalNode T_OPEN_SB() { return getToken(PLHQLStatementsParser.T_OPEN_SB, 0); }
		public TerminalNode T_CLOSE_SB() { return getToken(PLHQLStatementsParser.T_CLOSE_SB, 0); }
		public Group_by_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterGroup_by_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitGroup_by_expr(this);
		}
	}

	public final Group_by_exprContext group_by_expr() throws RecognitionException {
		return group_by_expr(0);
	}

	private Group_by_exprContext group_by_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Group_by_exprContext _localctx = new Group_by_exprContext(_ctx, _parentState);
		Group_by_exprContext _prevctx = _localctx;
		int _startState = 266;
		enterRecursionRule(_localctx, 266, RULE_group_by_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				{
				setState(1982);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(1983);
				match(T_OPEN_P);
				setState(1984);
				select_stmt();
				setState(1985);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(1987);
				match(T_OPEN_P);
				setState(1988);
				group_by_expr(0);
				setState(1989);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				{
				setState(1991);
				expr_interval();
				}
				break;
			case 5:
				{
				setState(1992);
				expr_concat();
				}
				break;
			case 6:
				{
				setState(1993);
				expr_case();
				}
				break;
			case 7:
				{
				setState(1994);
				expr_spec_func();
				}
				break;
			case 8:
				{
				setState(1995);
				expr_func();
				}
				break;
			case 9:
				{
				setState(1996);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2020);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2018);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
					case 1:
						{
						_localctx = new Group_by_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_group_by_expr);
						setState(1999);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2000);
						match(T_MUL);
						setState(2001);
						group_by_expr(14);
						}
						break;
					case 2:
						{
						_localctx = new Group_by_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_group_by_expr);
						setState(2002);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2003);
						match(T_DIV);
						setState(2004);
						group_by_expr(13);
						}
						break;
					case 3:
						{
						_localctx = new Group_by_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_group_by_expr);
						setState(2005);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2006);
						match(T_ADD);
						setState(2007);
						group_by_expr(12);
						}
						break;
					case 4:
						{
						_localctx = new Group_by_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_group_by_expr);
						setState(2008);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2009);
						match(T_SUB);
						setState(2010);
						group_by_expr(11);
						}
						break;
					case 5:
						{
						_localctx = new Group_by_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_group_by_expr);
						setState(2011);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2012);
						interval_item();
						}
						break;
					case 6:
						{
						_localctx = new Group_by_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_group_by_expr);
						setState(2013);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2014);
						match(T_OPEN_SB);
						setState(2015);
						group_by_expr(0);
						setState(2016);
						match(T_CLOSE_SB);
						}
						break;
					}
					} 
				}
				setState(2022);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,240,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_intervalContext expr_interval() {
			return getRuleContext(Expr_intervalContext.class,0);
		}
		public Expr_concatContext expr_concat() {
			return getRuleContext(Expr_concatContext.class,0);
		}
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public TerminalNode T_MUL() { return getToken(PLHQLStatementsParser.T_MUL, 0); }
		public TerminalNode T_DIV() { return getToken(PLHQLStatementsParser.T_DIV, 0); }
		public TerminalNode T_ADD() { return getToken(PLHQLStatementsParser.T_ADD, 0); }
		public TerminalNode T_SUB() { return getToken(PLHQLStatementsParser.T_SUB, 0); }
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public TerminalNode T_OPEN_SB() { return getToken(PLHQLStatementsParser.T_OPEN_SB, 0); }
		public TerminalNode T_CLOSE_SB() { return getToken(PLHQLStatementsParser.T_CLOSE_SB, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 268;
		enterRecursionRule(_localctx, 268, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(2024);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(2025);
				match(T_OPEN_P);
				setState(2026);
				select_stmt();
				setState(2027);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(2029);
				match(T_OPEN_P);
				setState(2030);
				expr(0);
				setState(2031);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				{
				setState(2033);
				expr_interval();
				}
				break;
			case 5:
				{
				setState(2034);
				expr_concat();
				}
				break;
			case 6:
				{
				setState(2035);
				expr_case();
				}
				break;
			case 7:
				{
				setState(2036);
				expr_agg_window_func();
				}
				break;
			case 8:
				{
				setState(2037);
				expr_spec_func();
				}
				break;
			case 9:
				{
				setState(2038);
				expr_func();
				}
				break;
			case 10:
				{
				setState(2039);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2063);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2061);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2042);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2043);
						match(T_MUL);
						setState(2044);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2045);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2046);
						match(T_DIV);
						setState(2047);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2048);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2049);
						match(T_ADD);
						setState(2050);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2051);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2052);
						match(T_SUB);
						setState(2053);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2054);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(2055);
						interval_item();
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2056);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2057);
						match(T_OPEN_SB);
						setState(2058);
						expr(0);
						setState(2059);
						match(T_CLOSE_SB);
						}
						break;
					}
					} 
				}
				setState(2065);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_atomContext extends ParserRuleContext {
		public Date_literalContext date_literal() {
			return getRuleContext(Date_literalContext.class,0);
		}
		public Timestamp_literalContext timestamp_literal() {
			return getRuleContext(Timestamp_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Dec_numberContext dec_number() {
			return getRuleContext(Dec_numberContext.class,0);
		}
		public Int_numberContext int_number() {
			return getRuleContext(Int_numberContext.class,0);
		}
		public Null_constContext null_const() {
			return getRuleContext(Null_constContext.class,0);
		}
		public Expr_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterExpr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitExpr_atom(this);
		}
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_expr_atom);
		try {
			setState(2074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2066);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2067);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2068);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2069);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2070);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2071);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2072);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2073);
				null_const();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_intervalContext extends ParserRuleContext {
		public TerminalNode T_INTERVAL() { return getToken(PLHQLStatementsParser.T_INTERVAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Interval_itemContext interval_item() {
			return getRuleContext(Interval_itemContext.class,0);
		}
		public Expr_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterExpr_interval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitExpr_interval(this);
		}
	}

	public final Expr_intervalContext expr_interval() throws RecognitionException {
		Expr_intervalContext _localctx = new Expr_intervalContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2076);
			match(T_INTERVAL);
			setState(2077);
			expr(0);
			setState(2078);
			interval_item();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Interval_itemContext extends ParserRuleContext {
		public TerminalNode T_DAY() { return getToken(PLHQLStatementsParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(PLHQLStatementsParser.T_DAYS, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(PLHQLStatementsParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(PLHQLStatementsParser.T_MICROSECONDS, 0); }
		public TerminalNode T_SECOND() { return getToken(PLHQLStatementsParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(PLHQLStatementsParser.T_SECONDS, 0); }
		public Interval_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterInterval_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitInterval_item(this);
		}
	}

	public final Interval_itemContext interval_item() throws RecognitionException {
		Interval_itemContext _localctx = new Interval_itemContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2080);
			_la = _input.LA(1);
			if ( !(_la==T_DAY || _la==T_DAYS || _la==T_MICROSECOND || _la==T_MICROSECONDS || _la==T_SECOND || _la==T_SECONDS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_concatContext extends ParserRuleContext {
		public List<Expr_concat_itemContext> expr_concat_item() {
			return getRuleContexts(Expr_concat_itemContext.class);
		}
		public Expr_concat_itemContext expr_concat_item(int i) {
			return getRuleContext(Expr_concat_itemContext.class,i);
		}
		public List<TerminalNode> T_CONCAT() { return getTokens(PLHQLStatementsParser.T_CONCAT); }
		public TerminalNode T_CONCAT(int i) {
			return getToken(PLHQLStatementsParser.T_CONCAT, i);
		}
		public Expr_concatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterExpr_concat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitExpr_concat(this);
		}
	}

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_expr_concat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2082);
			expr_concat_item();
			{
			setState(2083);
			match(T_CONCAT);
			}
			setState(2084);
			expr_concat_item();
			setState(2089);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(2085);
					match(T_CONCAT);
					}
					setState(2086);
					expr_concat_item();
					}
					} 
				}
				setState(2091);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,245,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_concat_itemContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public Expr_caseContext expr_case() {
			return getRuleContext(Expr_caseContext.class,0);
		}
		public Expr_agg_window_funcContext expr_agg_window_func() {
			return getRuleContext(Expr_agg_window_funcContext.class,0);
		}
		public Expr_spec_funcContext expr_spec_func() {
			return getRuleContext(Expr_spec_funcContext.class,0);
		}
		public Expr_funcContext expr_func() {
			return getRuleContext(Expr_funcContext.class,0);
		}
		public Expr_atomContext expr_atom() {
			return getRuleContext(Expr_atomContext.class,0);
		}
		public Expr_concat_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_concat_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterExpr_concat_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitExpr_concat_item(this);
		}
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_expr_concat_item);
		try {
			setState(2101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2092);
				match(T_OPEN_P);
				setState(2093);
				expr(0);
				setState(2094);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2096);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2097);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2098);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2099);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2100);
				expr_atom();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_caseContext extends ParserRuleContext {
		public Expr_case_simpleContext expr_case_simple() {
			return getRuleContext(Expr_case_simpleContext.class,0);
		}
		public Expr_case_searchedContext expr_case_searched() {
			return getRuleContext(Expr_case_searchedContext.class,0);
		}
		public Expr_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterExpr_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitExpr_case(this);
		}
	}

	public final Expr_caseContext expr_case() throws RecognitionException {
		Expr_caseContext _localctx = new Expr_caseContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_expr_case);
		try {
			setState(2105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2103);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2104);
				expr_case_searched();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_simpleContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(PLHQLStatementsParser.T_CASE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_END() { return getToken(PLHQLStatementsParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(PLHQLStatementsParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(PLHQLStatementsParser.T_WHEN, i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(PLHQLStatementsParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(PLHQLStatementsParser.T_THEN, i);
		}
		public TerminalNode T_ELSE() { return getToken(PLHQLStatementsParser.T_ELSE, 0); }
		public Expr_case_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterExpr_case_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitExpr_case_simple(this);
		}
	}

	public final Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		Expr_case_simpleContext _localctx = new Expr_case_simpleContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2107);
			match(T_CASE);
			setState(2108);
			expr(0);
			setState(2114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2109);
				match(T_WHEN);
				setState(2110);
				expr(0);
				setState(2111);
				match(T_THEN);
				setState(2112);
				expr(0);
				}
				}
				setState(2116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2118);
				match(T_ELSE);
				setState(2119);
				expr(0);
				}
			}

			setState(2122);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_case_searchedContext extends ParserRuleContext {
		public TerminalNode T_CASE() { return getToken(PLHQLStatementsParser.T_CASE, 0); }
		public TerminalNode T_END() { return getToken(PLHQLStatementsParser.T_END, 0); }
		public List<TerminalNode> T_WHEN() { return getTokens(PLHQLStatementsParser.T_WHEN); }
		public TerminalNode T_WHEN(int i) {
			return getToken(PLHQLStatementsParser.T_WHEN, i);
		}
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public List<TerminalNode> T_THEN() { return getTokens(PLHQLStatementsParser.T_THEN); }
		public TerminalNode T_THEN(int i) {
			return getToken(PLHQLStatementsParser.T_THEN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ELSE() { return getToken(PLHQLStatementsParser.T_ELSE, 0); }
		public Expr_case_searchedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_case_searched; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterExpr_case_searched(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitExpr_case_searched(this);
		}
	}

	public final Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		Expr_case_searchedContext _localctx = new Expr_case_searchedContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2124);
			match(T_CASE);
			setState(2130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2125);
				match(T_WHEN);
				setState(2126);
				bool_expr(0);
				setState(2127);
				match(T_THEN);
				setState(2128);
				expr(0);
				}
				}
				setState(2132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2134);
				match(T_ELSE);
				setState(2135);
				expr(0);
				}
			}

			setState(2138);
			match(T_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_agg_window_funcContext extends ParserRuleContext {
		public Expr_func_all_distinctContext expr_func_all_distinct;
		public ExprContext expr;
		public TerminalNode T_AVG() { return getToken(PLHQLStatementsParser.T_AVG, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public Expr_func_all_distinctContext expr_func_all_distinct() {
			return getRuleContext(Expr_func_all_distinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public Expr_func_over_clauseContext expr_func_over_clause() {
			return getRuleContext(Expr_func_over_clauseContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(PLHQLStatementsParser.T_COUNT, 0); }
		public TerminalNode T_MUL() { return getToken(PLHQLStatementsParser.T_MUL, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(PLHQLStatementsParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(PLHQLStatementsParser.T_CUME_DIST, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(PLHQLStatementsParser.T_DENSE_RANK, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(PLHQLStatementsParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_LAG() { return getToken(PLHQLStatementsParser.T_LAG, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public TerminalNode T_LAST_VALUE() { return getToken(PLHQLStatementsParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(PLHQLStatementsParser.T_LEAD, 0); }
		public TerminalNode T_MAX() { return getToken(PLHQLStatementsParser.T_MAX, 0); }
		public TerminalNode T_MIN() { return getToken(PLHQLStatementsParser.T_MIN, 0); }
		public TerminalNode T_RANK() { return getToken(PLHQLStatementsParser.T_RANK, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(PLHQLStatementsParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_STDEV() { return getToken(PLHQLStatementsParser.T_STDEV, 0); }
		public TerminalNode T_SUM() { return getToken(PLHQLStatementsParser.T_SUM, 0); }
		public TerminalNode T_VARIANCE() { return getToken(PLHQLStatementsParser.T_VARIANCE, 0); }
		public TerminalNode T_SUMMARIZE() { return getToken(PLHQLStatementsParser.T_SUMMARIZE, 0); }
		public Expr_agg_window_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_agg_window_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterExpr_agg_window_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitExpr_agg_window_func(this);
		}
	}

	public final Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		Expr_agg_window_funcContext _localctx = new Expr_agg_window_funcContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(2283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2140);
				match(T_AVG);
				setState(2141);
				match(T_OPEN_P);
				setState(2142);
				((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct = expr_func_all_distinct();
				setState(2143);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);


				       ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("AVG", (((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.start,((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.stop):null) + ":" + (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null)));

				       try{

				       ((Having_clauseContext)getInvokingContext(116)).aggregateFunctionColumns.add(new Pair<>("AVG", (((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.start,((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.stop):null) + ":" + (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null)));

				       }catch(NullPointerException ignored){

				       }

				       
				setState(2145);
				match(T_CLOSE_P);
				setState(2147);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2146);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2149);
				match(T_COUNT);
				setState(2150);
				match(T_OPEN_P);
				setState(2157);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ALL:
				case T_AVG:
				case T_CASE:
				case T_CAST:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CURRENT:
				case T_DATE:
				case T_DISTINCT:
				case T_FALSE:
				case T_INTERVAL:
				case T_MAX:
				case T_MIN:
				case T_NULL:
				case T_TRIM:
				case T_SEL:
				case T_SELECT:
				case T_SUBSTRING:
				case T_SUM:
				case T_TIMESTAMP:
				case T_TRUE:
				case T_WITH:
				case T_SUMMARIZE:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(2151);
					((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct = expr_func_all_distinct();
					setState(2152);
					((Expr_agg_window_funcContext)_localctx).expr = expr(0);


					         ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("COUNT", (((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.start,((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.stop):null) + ":" + (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null)));

					         try{

					         ((Having_clauseContext)getInvokingContext(116)).aggregateFunctionColumns.add(new Pair<>("COUNT", (((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.start,((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.stop):null) + ":" + (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null)));

					         }catch(NullPointerException ignored){

					         }

					      
					}
					}
					break;
				case T_MUL:
					{
					setState(2155);
					match(T_MUL);


					         ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("COUNT",  ":" + "*"));

					         try{

					         ((Having_clauseContext)getInvokingContext(116)).aggregateFunctionColumns.add(new Pair<>("COUNT",  ":" + "*"));

					         }catch(NullPointerException ignored){

					         }

					         
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2159);
				match(T_CLOSE_P);
				setState(2161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
				case 1:
					{
					setState(2160);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2163);
				match(T_COUNT_BIG);
				setState(2164);
				match(T_OPEN_P);
				setState(2170);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_ALL:
				case T_AVG:
				case T_CASE:
				case T_CAST:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CURRENT:
				case T_DATE:
				case T_DISTINCT:
				case T_FALSE:
				case T_INTERVAL:
				case T_MAX:
				case T_MIN:
				case T_NULL:
				case T_TRIM:
				case T_SEL:
				case T_SELECT:
				case T_SUBSTRING:
				case T_SUM:
				case T_TIMESTAMP:
				case T_TRUE:
				case T_WITH:
				case T_SUMMARIZE:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					{
					setState(2165);
					expr_func_all_distinct();
					setState(2166);
					((Expr_agg_window_funcContext)_localctx).expr = expr(0);


					      ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("COUNTBIG",  ":" + (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null)));

					      try{

					      ((Having_clauseContext)getInvokingContext(116)).aggregateFunctionColumns.add(new Pair<>("COUNTBIG",  ":" + (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null)));

					      }catch(NullPointerException ignored){

					      }

					      
					}
					}
					break;
				case T_MUL:
					{
					setState(2169);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2172);
				match(T_CLOSE_P);
				setState(2174);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
				case 1:
					{
					setState(2173);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2176);
				match(T_CUME_DIST);
				setState(2177);
				match(T_OPEN_P);
				setState(2178);
				match(T_CLOSE_P);
				setState(2179);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2180);
				match(T_DENSE_RANK);
				setState(2181);
				match(T_OPEN_P);
				setState(2182);
				match(T_CLOSE_P);
				setState(2183);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2184);
				match(T_FIRST_VALUE);
				setState(2185);
				match(T_OPEN_P);
				setState(2186);
				expr(0);
				setState(2187);
				match(T_CLOSE_P);
				setState(2188);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2190);
				match(T_LAG);
				setState(2191);
				match(T_OPEN_P);
				setState(2192);
				expr(0);
				setState(2199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2193);
					match(T_COMMA);
					setState(2194);
					expr(0);
					setState(2197);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2195);
						match(T_COMMA);
						setState(2196);
						expr(0);
						}
					}

					}
				}

				setState(2201);
				match(T_CLOSE_P);
				setState(2202);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2204);
				match(T_LAST_VALUE);
				setState(2205);
				match(T_OPEN_P);
				setState(2206);
				expr(0);
				setState(2207);
				match(T_CLOSE_P);
				setState(2208);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(2210);
				match(T_LEAD);
				setState(2211);
				match(T_OPEN_P);
				setState(2212);
				expr(0);
				setState(2219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2213);
					match(T_COMMA);
					setState(2214);
					expr(0);
					setState(2217);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2215);
						match(T_COMMA);
						setState(2216);
						expr(0);
						}
					}

					}
				}

				setState(2221);
				match(T_CLOSE_P);
				setState(2222);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(2224);
				match(T_MAX);
				setState(2225);
				match(T_OPEN_P);
				setState(2226);
				((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct = expr_func_all_distinct();
				setState(2227);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);


				     ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("MAX", (((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.start,((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.stop):null) + ":" +(((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null)));

				     try{

				     ((Having_clauseContext)getInvokingContext(116)).aggregateFunctionColumns.add(new Pair<>("MAX", (((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.start,((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.stop):null) + ":" +(((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null)));

				     }catch(NullPointerException ignored){

				     }

				     
				setState(2229);
				match(T_CLOSE_P);
				setState(2231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
				case 1:
					{
					setState(2230);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(2233);
				match(T_MIN);
				setState(2234);
				match(T_OPEN_P);
				setState(2235);
				((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct = expr_func_all_distinct();
				setState(2236);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);


				     ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("MIN", (((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.start,((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.stop):null) + ":" + (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null)));

				     try{

				     ((Having_clauseContext)getInvokingContext(116)).aggregateFunctionColumns.add(new Pair<>("MIN", (((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.start,((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.stop):null) + ":" + (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null)));

				     }catch(NullPointerException ignored){

				     }

				     
				setState(2238);
				match(T_CLOSE_P);
				setState(2240);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(2239);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(2242);
				match(T_RANK);
				setState(2243);
				match(T_OPEN_P);
				setState(2244);
				match(T_CLOSE_P);
				setState(2245);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(2246);
				match(T_ROW_NUMBER);
				setState(2247);
				match(T_OPEN_P);
				setState(2248);
				match(T_CLOSE_P);
				setState(2249);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(2250);
				match(T_STDEV);
				setState(2251);
				match(T_OPEN_P);
				setState(2252);
				((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct = expr_func_all_distinct();
				setState(2253);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);


				     ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("STDEV", (((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.start,((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.stop):null) + ":" + (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null)));

				     try{

				     ((Having_clauseContext)getInvokingContext(116)).aggregateFunctionColumns.add(new Pair<>("STDEV", (((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.start,((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.stop):null) + ":" + (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null)));

				     }catch(NullPointerException ignored){

				     }


				     
				setState(2255);
				match(T_CLOSE_P);
				setState(2257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(2256);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(2259);
				match(T_SUM);
				setState(2260);
				match(T_OPEN_P);
				setState(2261);
				((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct = expr_func_all_distinct();
				setState(2262);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);


				     try{

				     ((Having_clauseContext)getInvokingContext(116)).aggregateFunctionColumns.add(new Pair<>("SUM", (((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.start,((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.stop):null) + ":" + (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null)));

				     }catch(NullPointerException ignored){

				     }

				     ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("SUM", (((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.start,((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.stop):null) + ":" + (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null)));


				     
				setState(2264);
				match(T_CLOSE_P);
				setState(2266);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(2265);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 16);
				{
				setState(2268);
				match(T_VARIANCE);
				setState(2269);
				match(T_OPEN_P);
				setState(2270);
				((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct = expr_func_all_distinct();
				setState(2271);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);


				     ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("VARIANCE", (((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.start,((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.stop):null) + ":" + (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null)));

				     try{

				     ((Having_clauseContext)getInvokingContext(116)).aggregateFunctionColumns.add(new Pair<>("VARIANCE", (((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.start,((Expr_agg_window_funcContext)_localctx).expr_func_all_distinct.stop):null) + ":" + (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null)));

				     }catch(NullPointerException ignored){

				     }


				     
				setState(2273);
				match(T_CLOSE_P);
				setState(2275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(2274);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUMMARIZE:
				enterOuterAlt(_localctx, 17);
				{
				setState(2277);
				match(T_SUMMARIZE);
				setState(2278);
				match(T_OPEN_P);
				setState(2279);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				setState(2280);
				match(T_CLOSE_P);


				      ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("SUMMARIZE", ":" + (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null)));

				     
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_all_distinctContext extends ParserRuleContext {
		public TerminalNode T_ALL() { return getToken(PLHQLStatementsParser.T_ALL, 0); }
		public TerminalNode T_DISTINCT() { return getToken(PLHQLStatementsParser.T_DISTINCT, 0); }
		public Expr_func_all_distinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_all_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterExpr_func_all_distinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitExpr_func_all_distinct(this);
		}
	}

	public final Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		Expr_func_all_distinctContext _localctx = new Expr_func_all_distinctContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_expr_func_all_distinct);
		try {
			setState(2288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2285);
				match(T_ALL);
				}
				break;
			case T_DISTINCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2286);
				match(T_DISTINCT);
				}
				break;
			case T_AVG:
			case T_CASE:
			case T_CAST:
			case T_COUNT:
			case T_COUNT_BIG:
			case T_CURRENT:
			case T_DATE:
			case T_FALSE:
			case T_INTERVAL:
			case T_MAX:
			case T_MIN:
			case T_NULL:
			case T_TRIM:
			case T_SEL:
			case T_SELECT:
			case T_SUBSTRING:
			case T_SUM:
			case T_TIMESTAMP:
			case T_TRUE:
			case T_WITH:
			case T_SUMMARIZE:
			case T_ACTIVITY_COUNT:
			case T_CUME_DIST:
			case T_CURRENT_DATE:
			case T_CURRENT_TIMESTAMP:
			case T_CURRENT_USER:
			case T_DENSE_RANK:
			case T_FIRST_VALUE:
			case T_LAG:
			case T_LAST_VALUE:
			case T_LEAD:
			case T_MAX_PART_STRING:
			case T_MIN_PART_STRING:
			case T_MAX_PART_INT:
			case T_MIN_PART_INT:
			case T_MAX_PART_DATE:
			case T_MIN_PART_DATE:
			case T_PART_COUNT:
			case T_PART_LOC:
			case T_RANK:
			case T_ROW_NUMBER:
			case T_STDEV:
			case T_SYSDATE:
			case T_VARIANCE:
			case T_USER:
			case T_ADD:
			case T_OPEN_P:
			case T_SUB:
			case L_ID:
			case L_S_STRING:
			case L_D_STRING:
			case L_INT:
			case L_DEC:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_over_clauseContext extends ParserRuleContext {
		public TerminalNode T_OVER() { return getToken(PLHQLStatementsParser.T_OVER, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public Expr_func_partition_by_clauseContext expr_func_partition_by_clause() {
			return getRuleContext(Expr_func_partition_by_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Expr_func_over_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_over_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterExpr_func_over_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitExpr_func_over_clause(this);
		}
	}

	public final Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		Expr_func_over_clauseContext _localctx = new Expr_func_over_clauseContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2290);
			match(T_OVER);
			setState(2291);
			match(T_OPEN_P);
			setState(2293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(2292);
				expr_func_partition_by_clause();
				}
			}

			setState(2296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(2295);
				order_by_clause();
				}
			}

			setState(2298);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_partition_by_clauseContext extends ParserRuleContext {
		public TerminalNode T_PARTITION() { return getToken(PLHQLStatementsParser.T_PARTITION, 0); }
		public TerminalNode T_BY() { return getToken(PLHQLStatementsParser.T_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Expr_func_partition_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_partition_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterExpr_func_partition_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitExpr_func_partition_by_clause(this);
		}
	}

	public final Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		Expr_func_partition_by_clauseContext _localctx = new Expr_func_partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2300);
			match(T_PARTITION);
			setState(2301);
			match(T_BY);
			setState(2302);
			expr(0);
			setState(2307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2303);
				match(T_COMMA);
				setState(2304);
				expr(0);
				}
				}
				setState(2309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_spec_funcContext extends ParserRuleContext {
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(PLHQLStatementsParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_CAST() { return getToken(PLHQLStatementsParser.T_CAST, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_AS() { return getToken(PLHQLStatementsParser.T_AS, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public TerminalNode T_COUNT() { return getToken(PLHQLStatementsParser.T_COUNT, 0); }
		public TerminalNode T_MUL() { return getToken(PLHQLStatementsParser.T_MUL, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(PLHQLStatementsParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT() { return getToken(PLHQLStatementsParser.T_CURRENT, 0); }
		public TerminalNode T_DATE() { return getToken(PLHQLStatementsParser.T_DATE, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(PLHQLStatementsParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(PLHQLStatementsParser.T_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(PLHQLStatementsParser.T_CURRENT_USER, 0); }
		public TerminalNode T_USER() { return getToken(PLHQLStatementsParser.T_USER, 0); }
		public TerminalNode T_MAX_PART_STRING() { return getToken(PLHQLStatementsParser.T_MAX_PART_STRING, 0); }
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public List<TerminalNode> T_EQUAL() { return getTokens(PLHQLStatementsParser.T_EQUAL); }
		public TerminalNode T_EQUAL(int i) {
			return getToken(PLHQLStatementsParser.T_EQUAL, i);
		}
		public TerminalNode T_MIN_PART_STRING() { return getToken(PLHQLStatementsParser.T_MIN_PART_STRING, 0); }
		public TerminalNode T_MAX_PART_INT() { return getToken(PLHQLStatementsParser.T_MAX_PART_INT, 0); }
		public TerminalNode T_MIN_PART_INT() { return getToken(PLHQLStatementsParser.T_MIN_PART_INT, 0); }
		public TerminalNode T_MAX_PART_DATE() { return getToken(PLHQLStatementsParser.T_MAX_PART_DATE, 0); }
		public TerminalNode T_MIN_PART_DATE() { return getToken(PLHQLStatementsParser.T_MIN_PART_DATE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(PLHQLStatementsParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(PLHQLStatementsParser.T_PART_LOC, 0); }
		public TerminalNode T_TRIM() { return getToken(PLHQLStatementsParser.T_TRIM, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(PLHQLStatementsParser.T_SUBSTRING, 0); }
		public TerminalNode T_FROM() { return getToken(PLHQLStatementsParser.T_FROM, 0); }
		public TerminalNode T_FOR() { return getToken(PLHQLStatementsParser.T_FOR, 0); }
		public TerminalNode T_SYSDATE() { return getToken(PLHQLStatementsParser.T_SYSDATE, 0); }
		public Expr_spec_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_spec_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterExpr_spec_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitExpr_spec_func(this);
		}
	}

	public final Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		Expr_spec_funcContext _localctx = new Expr_spec_funcContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(2510);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2310);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2311);
				match(T_CAST);
				setState(2312);
				match(T_OPEN_P);
				setState(2313);
				expr(0);
				setState(2314);
				match(T_AS);
				setState(2315);
				dtype();
				setState(2317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2316);
					dtype_len();
					}
				}

				setState(2319);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2321);
				match(T_COUNT);
				setState(2322);
				match(T_OPEN_P);
				setState(2325);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_AVG:
				case T_CASE:
				case T_CAST:
				case T_COUNT:
				case T_COUNT_BIG:
				case T_CURRENT:
				case T_DATE:
				case T_FALSE:
				case T_INTERVAL:
				case T_MAX:
				case T_MIN:
				case T_NULL:
				case T_TRIM:
				case T_SEL:
				case T_SELECT:
				case T_SUBSTRING:
				case T_SUM:
				case T_TIMESTAMP:
				case T_TRUE:
				case T_WITH:
				case T_SUMMARIZE:
				case T_ACTIVITY_COUNT:
				case T_CUME_DIST:
				case T_CURRENT_DATE:
				case T_CURRENT_TIMESTAMP:
				case T_CURRENT_USER:
				case T_DENSE_RANK:
				case T_FIRST_VALUE:
				case T_LAG:
				case T_LAST_VALUE:
				case T_LEAD:
				case T_MAX_PART_STRING:
				case T_MIN_PART_STRING:
				case T_MAX_PART_INT:
				case T_MIN_PART_INT:
				case T_MAX_PART_DATE:
				case T_MIN_PART_DATE:
				case T_PART_COUNT:
				case T_PART_LOC:
				case T_RANK:
				case T_ROW_NUMBER:
				case T_STDEV:
				case T_SYSDATE:
				case T_VARIANCE:
				case T_USER:
				case T_ADD:
				case T_OPEN_P:
				case T_SUB:
				case L_ID:
				case L_S_STRING:
				case L_D_STRING:
				case L_INT:
				case L_DEC:
					{
					setState(2323);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(2324);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2327);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2328);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2329);
				match(T_CURRENT);
				setState(2330);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2334);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(2331);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(2332);
					match(T_CURRENT);
					setState(2333);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2340);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(2336);
					match(T_OPEN_P);
					setState(2337);
					expr(0);
					setState(2338);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2342);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2343);
				match(T_CURRENT);
				setState(2344);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2345);
				match(T_MAX_PART_STRING);
				setState(2346);
				match(T_OPEN_P);
				setState(2347);
				expr(0);
				setState(2360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2348);
					match(T_COMMA);
					setState(2349);
					expr(0);
					setState(2357);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2350);
						match(T_COMMA);
						setState(2351);
						expr(0);
						setState(2352);
						match(T_EQUAL);
						setState(2353);
						expr(0);
						}
						}
						setState(2359);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2362);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2364);
				match(T_MIN_PART_STRING);
				setState(2365);
				match(T_OPEN_P);
				setState(2366);
				expr(0);
				setState(2379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2367);
					match(T_COMMA);
					setState(2368);
					expr(0);
					setState(2376);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2369);
						match(T_COMMA);
						setState(2370);
						expr(0);
						setState(2371);
						match(T_EQUAL);
						setState(2372);
						expr(0);
						}
						}
						setState(2378);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2381);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2383);
				match(T_MAX_PART_INT);
				setState(2384);
				match(T_OPEN_P);
				setState(2385);
				expr(0);
				setState(2398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2386);
					match(T_COMMA);
					setState(2387);
					expr(0);
					setState(2395);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2388);
						match(T_COMMA);
						setState(2389);
						expr(0);
						setState(2390);
						match(T_EQUAL);
						setState(2391);
						expr(0);
						}
						}
						setState(2397);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2400);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2402);
				match(T_MIN_PART_INT);
				setState(2403);
				match(T_OPEN_P);
				setState(2404);
				expr(0);
				setState(2417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2405);
					match(T_COMMA);
					setState(2406);
					expr(0);
					setState(2414);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2407);
						match(T_COMMA);
						setState(2408);
						expr(0);
						setState(2409);
						match(T_EQUAL);
						setState(2410);
						expr(0);
						}
						}
						setState(2416);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2419);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2421);
				match(T_MAX_PART_DATE);
				setState(2422);
				match(T_OPEN_P);
				setState(2423);
				expr(0);
				setState(2436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2424);
					match(T_COMMA);
					setState(2425);
					expr(0);
					setState(2433);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2426);
						match(T_COMMA);
						setState(2427);
						expr(0);
						setState(2428);
						match(T_EQUAL);
						setState(2429);
						expr(0);
						}
						}
						setState(2435);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2438);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2440);
				match(T_MIN_PART_DATE);
				setState(2441);
				match(T_OPEN_P);
				setState(2442);
				expr(0);
				setState(2455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2443);
					match(T_COMMA);
					setState(2444);
					expr(0);
					setState(2452);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2445);
						match(T_COMMA);
						setState(2446);
						expr(0);
						setState(2447);
						match(T_EQUAL);
						setState(2448);
						expr(0);
						}
						}
						setState(2454);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2457);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2459);
				match(T_PART_COUNT);
				setState(2460);
				match(T_OPEN_P);
				setState(2461);
				expr(0);
				setState(2469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2462);
					match(T_COMMA);
					setState(2463);
					expr(0);
					setState(2464);
					match(T_EQUAL);
					setState(2465);
					expr(0);
					}
					}
					setState(2471);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2472);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2474);
				match(T_PART_LOC);
				setState(2475);
				match(T_OPEN_P);
				setState(2476);
				expr(0);
				setState(2482); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2477);
						match(T_COMMA);
						setState(2478);
						expr(0);
						setState(2479);
						match(T_EQUAL);
						setState(2480);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2484); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2486);
					match(T_COMMA);
					setState(2487);
					expr(0);
					}
				}

				setState(2490);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2492);
				match(T_TRIM);
				setState(2493);
				match(T_OPEN_P);
				setState(2494);
				expr(0);
				setState(2495);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2497);
				match(T_SUBSTRING);
				setState(2498);
				match(T_OPEN_P);
				setState(2499);
				expr(0);
				setState(2500);
				match(T_FROM);
				setState(2501);
				expr(0);
				setState(2504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(2502);
					match(T_FOR);
					setState(2503);
					expr(0);
					}
				}

				setState(2506);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2508);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2509);
				match(T_USER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_funcContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public Expr_func_paramsContext expr_func_params() {
			return getRuleContext(Expr_func_paramsContext.class,0);
		}
		public Expr_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterExpr_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitExpr_func(this);
		}
	}

	public final Expr_funcContext expr_func() throws RecognitionException {
		Expr_funcContext _localctx = new Expr_funcContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2512);
			ident();
			setState(2513);
			match(T_OPEN_P);
			setState(2515);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				{
				setState(2514);
				expr_func_params();
				}
				break;
			}
			setState(2517);
			match(T_CLOSE_P);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_func_paramsContext extends ParserRuleContext {
		public List<Func_paramContext> func_param() {
			return getRuleContexts(Func_paramContext.class);
		}
		public Func_paramContext func_param(int i) {
			return getRuleContext(Func_paramContext.class,i);
		}
		public List<TerminalNode> T_COMMA() { return getTokens(PLHQLStatementsParser.T_COMMA); }
		public TerminalNode T_COMMA(int i) {
			return getToken(PLHQLStatementsParser.T_COMMA, i);
		}
		public Expr_func_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_func_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterExpr_func_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitExpr_func_params(this);
		}
	}

	public final Expr_func_paramsContext expr_func_params() throws RecognitionException {
		Expr_func_paramsContext _localctx = new Expr_func_paramsContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_expr_func_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2519);
			func_param();
			setState(2524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2520);
					match(T_COMMA);
					setState(2521);
					func_param();
					}
					} 
				}
				setState(2526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_paramContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_EQUAL() { return getToken(PLHQLStatementsParser.T_EQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(PLHQLStatementsParser.T_GREATER, 0); }
		public Func_paramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterFunc_param(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitFunc_param(this);
		}
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2527);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(2533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				{
				setState(2528);
				ident();
				setState(2529);
				match(T_EQUAL);
				setState(2531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
					{
					setState(2530);
					match(T_GREATER);
					}
				}

				}
				break;
			}
			setState(2535);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_missing_right_pContext extends ParserRuleContext {
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public List<TerminalNode> T_CLOSE_P() { return getTokens(PLHQLStatementsParser.T_CLOSE_P); }
		public TerminalNode T_CLOSE_P(int i) {
			return getToken(PLHQLStatementsParser.T_CLOSE_P, i);
		}
		public Error_missing_right_pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_missing_right_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_missing_right_p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_missing_right_p(this);
		}
	}

	public final Error_missing_right_pContext error_missing_right_p() throws RecognitionException {
		Error_missing_right_pContext _localctx = new Error_missing_right_pContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_error_missing_right_p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2537);
			match(T_OPEN_P);
			setState(2541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2538);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==T_CLOSE_P) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(2543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			}
			notifyErrorListeners("Missing right parentheses");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Date_literalContext extends ParserRuleContext {
		public TerminalNode T_DATE() { return getToken(PLHQLStatementsParser.T_DATE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Date_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterDate_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitDate_literal(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2546);
			match(T_DATE);
			setState(2547);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Timestamp_literalContext extends ParserRuleContext {
		public TerminalNode T_TIMESTAMP() { return getToken(PLHQLStatementsParser.T_TIMESTAMP, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public Timestamp_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterTimestamp_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitTimestamp_literal(this);
		}
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2549);
			match(T_TIMESTAMP);
			setState(2550);
			string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_operatorContext extends ParserRuleContext {
		public TerminalNode T_EQUAL() { return getToken(PLHQLStatementsParser.T_EQUAL, 0); }
		public TerminalNode T_MOD_EQUAL() { return getToken(PLHQLStatementsParser.T_MOD_EQUAL, 0); }
		public TerminalNode T_DIVIDE_EQUAL() { return getToken(PLHQLStatementsParser.T_DIVIDE_EQUAL, 0); }
		public TerminalNode T_TIMES_EQUAL() { return getToken(PLHQLStatementsParser.T_TIMES_EQUAL, 0); }
		public TerminalNode T_MINUS_EQUAL() { return getToken(PLHQLStatementsParser.T_MINUS_EQUAL, 0); }
		public TerminalNode T_PLUS_EQUAL() { return getToken(PLHQLStatementsParser.T_PLUS_EQUAL, 0); }
		public Assignment_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterAssignment_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitAssignment_operator(this);
		}
	}

	public final Assignment_operatorContext assignment_operator() throws RecognitionException {
		Assignment_operatorContext _localctx = new Assignment_operatorContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2552);
			_la = _input.LA(1);
			if ( !(((((_la - 352)) & ~0x3f) == 0 && ((1L << (_la - 352)) & ((1L << (T_PLUS_EQUAL - 352)) | (1L << (T_MINUS_EQUAL - 352)) | (1L << (T_TIMES_EQUAL - 352)) | (1L << (T_DIVIDE_EQUAL - 352)) | (1L << (T_MOD_EQUAL - 352)) | (1L << (T_EQUAL - 352)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentContext extends ParserRuleContext {
		public List<TerminalNode> L_ID() { return getTokens(PLHQLStatementsParser.L_ID); }
		public TerminalNode L_ID(int i) {
			return getToken(PLHQLStatementsParser.L_ID, i);
		}
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitIdent(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2554);
			match(L_ID);
			}
			setState(2559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2555);
					match(T__3);
					{
					setState(2556);
					match(L_ID);
					}
					}
					} 
				}
				setState(2561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Double_quotedStringContext extends StringContext {
		public TerminalNode L_D_STRING() { return getToken(PLHQLStatementsParser.L_D_STRING, 0); }
		public Double_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterDouble_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitDouble_quotedString(this);
		}
	}
	public static class Single_quotedStringContext extends StringContext {
		public TerminalNode L_S_STRING() { return getToken(PLHQLStatementsParser.L_S_STRING, 0); }
		public Single_quotedStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterSingle_quotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitSingle_quotedString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_string);
		try {
			setState(2564);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2562);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2563);
				match(L_D_STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_stringContext extends ParserRuleContext {
		public TerminalNode L_S_STRING_MISSING_RIGHT() { return getToken(PLHQLStatementsParser.L_S_STRING_MISSING_RIGHT, 0); }
		public TerminalNode L_D_STRING_MISSING_RIGHT() { return getToken(PLHQLStatementsParser.L_D_STRING_MISSING_RIGHT, 0); }
		public Error_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_string(this);
		}
	}

	public final Error_stringContext error_string() throws RecognitionException {
		Error_stringContext _localctx = new Error_stringContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_error_string);
		try {
			setState(2570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING_MISSING_RIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2566);
				match(L_S_STRING_MISSING_RIGHT);
				notifyErrorListeners("Expected right quote");
				}
				break;
			case L_D_STRING_MISSING_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2568);
				match(L_D_STRING_MISSING_RIGHT);
				notifyErrorListeners("Expected right quotes");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_numberContext extends ParserRuleContext {
		public TerminalNode L_INT() { return getToken(PLHQLStatementsParser.L_INT, 0); }
		public TerminalNode T_SUB() { return getToken(PLHQLStatementsParser.T_SUB, 0); }
		public TerminalNode T_ADD() { return getToken(PLHQLStatementsParser.T_ADD, 0); }
		public Int_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterInt_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitInt_number(this);
		}
	}

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2572);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2575);
			match(L_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dec_numberContext extends ParserRuleContext {
		public TerminalNode L_DEC() { return getToken(PLHQLStatementsParser.L_DEC, 0); }
		public TerminalNode T_SUB() { return getToken(PLHQLStatementsParser.T_SUB, 0); }
		public TerminalNode T_ADD() { return getToken(PLHQLStatementsParser.T_ADD, 0); }
		public Dec_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterDec_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitDec_number(this);
		}
	}

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2577);
				_la = _input.LA(1);
				if ( !(_la==T_ADD || _la==T_SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2580);
			match(L_DEC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode T_TRUE() { return getToken(PLHQLStatementsParser.T_TRUE, 0); }
		public TerminalNode T_FALSE() { return getToken(PLHQLStatementsParser.T_FALSE, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitBool_literal(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2582);
			_la = _input.LA(1);
			if ( !(_la==T_FALSE || _la==T_TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_constContext extends ParserRuleContext {
		public TerminalNode T_NULL() { return getToken(PLHQLStatementsParser.T_NULL, 0); }
		public Null_constContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_const; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterNull_const(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitNull_const(this);
		}
	}

	public final Null_constContext null_const() throws RecognitionException {
		Null_constContext _localctx = new Null_constContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2584);
			match(T_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Non_reserved_wordsContext extends ParserRuleContext {
		public TerminalNode T_ACTION() { return getToken(PLHQLStatementsParser.T_ACTION, 0); }
		public TerminalNode T_ACTIVITY_COUNT() { return getToken(PLHQLStatementsParser.T_ACTIVITY_COUNT, 0); }
		public TerminalNode T_ADD2() { return getToken(PLHQLStatementsParser.T_ADD2, 0); }
		public TerminalNode T_ALL() { return getToken(PLHQLStatementsParser.T_ALL, 0); }
		public TerminalNode T_ALLOCATE() { return getToken(PLHQLStatementsParser.T_ALLOCATE, 0); }
		public TerminalNode T_ALTER() { return getToken(PLHQLStatementsParser.T_ALTER, 0); }
		public TerminalNode T_AND() { return getToken(PLHQLStatementsParser.T_AND, 0); }
		public TerminalNode T_ANSI_NULLS() { return getToken(PLHQLStatementsParser.T_ANSI_NULLS, 0); }
		public TerminalNode T_ANSI_PADDING() { return getToken(PLHQLStatementsParser.T_ANSI_PADDING, 0); }
		public TerminalNode T_AS() { return getToken(PLHQLStatementsParser.T_AS, 0); }
		public TerminalNode T_ASC() { return getToken(PLHQLStatementsParser.T_ASC, 0); }
		public TerminalNode T_ASSOCIATE() { return getToken(PLHQLStatementsParser.T_ASSOCIATE, 0); }
		public TerminalNode T_AT() { return getToken(PLHQLStatementsParser.T_AT, 0); }
		public TerminalNode T_AUTO_INCREMENT() { return getToken(PLHQLStatementsParser.T_AUTO_INCREMENT, 0); }
		public TerminalNode T_AVG() { return getToken(PLHQLStatementsParser.T_AVG, 0); }
		public TerminalNode T_BATCHSIZE() { return getToken(PLHQLStatementsParser.T_BATCHSIZE, 0); }
		public TerminalNode T_BEGIN() { return getToken(PLHQLStatementsParser.T_BEGIN, 0); }
		public TerminalNode T_BETWEEN() { return getToken(PLHQLStatementsParser.T_BETWEEN, 0); }
		public TerminalNode T_BIGINT() { return getToken(PLHQLStatementsParser.T_BIGINT, 0); }
		public TerminalNode T_BINARY_DOUBLE() { return getToken(PLHQLStatementsParser.T_BINARY_DOUBLE, 0); }
		public TerminalNode T_BINARY_FLOAT() { return getToken(PLHQLStatementsParser.T_BINARY_FLOAT, 0); }
		public TerminalNode T_BIT() { return getToken(PLHQLStatementsParser.T_BIT, 0); }
		public TerminalNode T_BODY() { return getToken(PLHQLStatementsParser.T_BODY, 0); }
		public TerminalNode T_BREAK() { return getToken(PLHQLStatementsParser.T_BREAK, 0); }
		public TerminalNode T_BY() { return getToken(PLHQLStatementsParser.T_BY, 0); }
		public TerminalNode T_BYTE() { return getToken(PLHQLStatementsParser.T_BYTE, 0); }
		public TerminalNode T_CALL() { return getToken(PLHQLStatementsParser.T_CALL, 0); }
		public TerminalNode T_CALLER() { return getToken(PLHQLStatementsParser.T_CALLER, 0); }
		public TerminalNode T_CASCADE() { return getToken(PLHQLStatementsParser.T_CASCADE, 0); }
		public TerminalNode T_CASE() { return getToken(PLHQLStatementsParser.T_CASE, 0); }
		public TerminalNode T_CASESPECIFIC() { return getToken(PLHQLStatementsParser.T_CASESPECIFIC, 0); }
		public TerminalNode T_CAST() { return getToken(PLHQLStatementsParser.T_CAST, 0); }
		public TerminalNode T_CHAR() { return getToken(PLHQLStatementsParser.T_CHAR, 0); }
		public TerminalNode T_CHARACTER() { return getToken(PLHQLStatementsParser.T_CHARACTER, 0); }
		public TerminalNode T_CHARSET() { return getToken(PLHQLStatementsParser.T_CHARSET, 0); }
		public TerminalNode T_CLIENT() { return getToken(PLHQLStatementsParser.T_CLIENT, 0); }
		public TerminalNode T_CLOSE() { return getToken(PLHQLStatementsParser.T_CLOSE, 0); }
		public TerminalNode T_CLUSTERED() { return getToken(PLHQLStatementsParser.T_CLUSTERED, 0); }
		public TerminalNode T_CMP() { return getToken(PLHQLStatementsParser.T_CMP, 0); }
		public TerminalNode T_COLLECT() { return getToken(PLHQLStatementsParser.T_COLLECT, 0); }
		public TerminalNode T_COLLECTION() { return getToken(PLHQLStatementsParser.T_COLLECTION, 0); }
		public TerminalNode T_COLUMN() { return getToken(PLHQLStatementsParser.T_COLUMN, 0); }
		public TerminalNode T_COMMENT() { return getToken(PLHQLStatementsParser.T_COMMENT, 0); }
		public TerminalNode T_COMPRESS() { return getToken(PLHQLStatementsParser.T_COMPRESS, 0); }
		public TerminalNode T_CONSTANT() { return getToken(PLHQLStatementsParser.T_CONSTANT, 0); }
		public TerminalNode T_COPY() { return getToken(PLHQLStatementsParser.T_COPY, 0); }
		public TerminalNode T_COMMIT() { return getToken(PLHQLStatementsParser.T_COMMIT, 0); }
		public TerminalNode T_CONCAT() { return getToken(PLHQLStatementsParser.T_CONCAT, 0); }
		public TerminalNode T_CONDITION() { return getToken(PLHQLStatementsParser.T_CONDITION, 0); }
		public TerminalNode T_CONSTRAINT() { return getToken(PLHQLStatementsParser.T_CONSTRAINT, 0); }
		public TerminalNode T_CONTINUE() { return getToken(PLHQLStatementsParser.T_CONTINUE, 0); }
		public TerminalNode T_COUNT() { return getToken(PLHQLStatementsParser.T_COUNT, 0); }
		public TerminalNode T_COUNT_BIG() { return getToken(PLHQLStatementsParser.T_COUNT_BIG, 0); }
		public TerminalNode T_CREATE() { return getToken(PLHQLStatementsParser.T_CREATE, 0); }
		public TerminalNode T_CREATION() { return getToken(PLHQLStatementsParser.T_CREATION, 0); }
		public TerminalNode T_CREATOR() { return getToken(PLHQLStatementsParser.T_CREATOR, 0); }
		public TerminalNode T_CS() { return getToken(PLHQLStatementsParser.T_CS, 0); }
		public TerminalNode T_CUME_DIST() { return getToken(PLHQLStatementsParser.T_CUME_DIST, 0); }
		public TerminalNode T_CURRENT() { return getToken(PLHQLStatementsParser.T_CURRENT, 0); }
		public TerminalNode T_CURRENT_DATE() { return getToken(PLHQLStatementsParser.T_CURRENT_DATE, 0); }
		public TerminalNode T_CURRENT_SCHEMA() { return getToken(PLHQLStatementsParser.T_CURRENT_SCHEMA, 0); }
		public TerminalNode T_CURRENT_TIMESTAMP() { return getToken(PLHQLStatementsParser.T_CURRENT_TIMESTAMP, 0); }
		public TerminalNode T_CURRENT_USER() { return getToken(PLHQLStatementsParser.T_CURRENT_USER, 0); }
		public TerminalNode T_CURSOR() { return getToken(PLHQLStatementsParser.T_CURSOR, 0); }
		public TerminalNode T_DATA() { return getToken(PLHQLStatementsParser.T_DATA, 0); }
		public TerminalNode T_DATABASE() { return getToken(PLHQLStatementsParser.T_DATABASE, 0); }
		public TerminalNode T_DATE() { return getToken(PLHQLStatementsParser.T_DATE, 0); }
		public TerminalNode T_DATETIME() { return getToken(PLHQLStatementsParser.T_DATETIME, 0); }
		public TerminalNode T_DAY() { return getToken(PLHQLStatementsParser.T_DAY, 0); }
		public TerminalNode T_DAYS() { return getToken(PLHQLStatementsParser.T_DAYS, 0); }
		public TerminalNode T_DEC() { return getToken(PLHQLStatementsParser.T_DEC, 0); }
		public TerminalNode T_DECIMAL() { return getToken(PLHQLStatementsParser.T_DECIMAL, 0); }
		public TerminalNode T_DECLARE() { return getToken(PLHQLStatementsParser.T_DECLARE, 0); }
		public TerminalNode T_DEFAULT() { return getToken(PLHQLStatementsParser.T_DEFAULT, 0); }
		public TerminalNode T_DEFERRED() { return getToken(PLHQLStatementsParser.T_DEFERRED, 0); }
		public TerminalNode T_DEFINED() { return getToken(PLHQLStatementsParser.T_DEFINED, 0); }
		public TerminalNode T_DEFINER() { return getToken(PLHQLStatementsParser.T_DEFINER, 0); }
		public TerminalNode T_DEFINITION() { return getToken(PLHQLStatementsParser.T_DEFINITION, 0); }
		public TerminalNode T_DELETE() { return getToken(PLHQLStatementsParser.T_DELETE, 0); }
		public TerminalNode T_DELIMITED() { return getToken(PLHQLStatementsParser.T_DELIMITED, 0); }
		public TerminalNode T_DELIMITER() { return getToken(PLHQLStatementsParser.T_DELIMITER, 0); }
		public TerminalNode T_DENSE_RANK() { return getToken(PLHQLStatementsParser.T_DENSE_RANK, 0); }
		public TerminalNode T_DESC() { return getToken(PLHQLStatementsParser.T_DESC, 0); }
		public TerminalNode T_DESCRIBE() { return getToken(PLHQLStatementsParser.T_DESCRIBE, 0); }
		public TerminalNode T_DIAGNOSTICS() { return getToken(PLHQLStatementsParser.T_DIAGNOSTICS, 0); }
		public TerminalNode T_DIR() { return getToken(PLHQLStatementsParser.T_DIR, 0); }
		public TerminalNode T_DIRECTORY() { return getToken(PLHQLStatementsParser.T_DIRECTORY, 0); }
		public TerminalNode T_DISTINCT() { return getToken(PLHQLStatementsParser.T_DISTINCT, 0); }
		public TerminalNode T_DISTRIBUTE() { return getToken(PLHQLStatementsParser.T_DISTRIBUTE, 0); }
		public TerminalNode T_DO() { return getToken(PLHQLStatementsParser.T_DO, 0); }
		public TerminalNode T_DOUBLE() { return getToken(PLHQLStatementsParser.T_DOUBLE, 0); }
		public TerminalNode T_DROP() { return getToken(PLHQLStatementsParser.T_DROP, 0); }
		public TerminalNode T_DYNAMIC() { return getToken(PLHQLStatementsParser.T_DYNAMIC, 0); }
		public TerminalNode T_ENABLE() { return getToken(PLHQLStatementsParser.T_ENABLE, 0); }
		public TerminalNode T_ENGINE() { return getToken(PLHQLStatementsParser.T_ENGINE, 0); }
		public TerminalNode T_ESCAPED() { return getToken(PLHQLStatementsParser.T_ESCAPED, 0); }
		public TerminalNode T_EXCEPT() { return getToken(PLHQLStatementsParser.T_EXCEPT, 0); }
		public TerminalNode T_EXEC() { return getToken(PLHQLStatementsParser.T_EXEC, 0); }
		public TerminalNode T_EXECUTE() { return getToken(PLHQLStatementsParser.T_EXECUTE, 0); }
		public TerminalNode T_EXCEPTION() { return getToken(PLHQLStatementsParser.T_EXCEPTION, 0); }
		public TerminalNode T_EXCLUSIVE() { return getToken(PLHQLStatementsParser.T_EXCLUSIVE, 0); }
		public TerminalNode T_EXISTS() { return getToken(PLHQLStatementsParser.T_EXISTS, 0); }
		public TerminalNode T_EXIT() { return getToken(PLHQLStatementsParser.T_EXIT, 0); }
		public TerminalNode T_FALLBACK() { return getToken(PLHQLStatementsParser.T_FALLBACK, 0); }
		public TerminalNode T_FALSE() { return getToken(PLHQLStatementsParser.T_FALSE, 0); }
		public TerminalNode T_FETCH() { return getToken(PLHQLStatementsParser.T_FETCH, 0); }
		public TerminalNode T_FIELDS() { return getToken(PLHQLStatementsParser.T_FIELDS, 0); }
		public TerminalNode T_FILE() { return getToken(PLHQLStatementsParser.T_FILE, 0); }
		public TerminalNode T_FILES() { return getToken(PLHQLStatementsParser.T_FILES, 0); }
		public TerminalNode T_FIRST_VALUE() { return getToken(PLHQLStatementsParser.T_FIRST_VALUE, 0); }
		public TerminalNode T_FLOAT() { return getToken(PLHQLStatementsParser.T_FLOAT, 0); }
		public TerminalNode T_FOR() { return getToken(PLHQLStatementsParser.T_FOR, 0); }
		public TerminalNode T_FOREIGN() { return getToken(PLHQLStatementsParser.T_FOREIGN, 0); }
		public TerminalNode T_FORMAT() { return getToken(PLHQLStatementsParser.T_FORMAT, 0); }
		public TerminalNode T_FOUND() { return getToken(PLHQLStatementsParser.T_FOUND, 0); }
		public TerminalNode T_FROM() { return getToken(PLHQLStatementsParser.T_FROM, 0); }
		public TerminalNode T_FULL() { return getToken(PLHQLStatementsParser.T_FULL, 0); }
		public TerminalNode T_FUNCTION() { return getToken(PLHQLStatementsParser.T_FUNCTION, 0); }
		public TerminalNode T_GET() { return getToken(PLHQLStatementsParser.T_GET, 0); }
		public TerminalNode T_GLOBAL() { return getToken(PLHQLStatementsParser.T_GLOBAL, 0); }
		public TerminalNode T_GO() { return getToken(PLHQLStatementsParser.T_GO, 0); }
		public TerminalNode T_GRANT() { return getToken(PLHQLStatementsParser.T_GRANT, 0); }
		public TerminalNode T_GROUP() { return getToken(PLHQLStatementsParser.T_GROUP, 0); }
		public TerminalNode T_HANDLER() { return getToken(PLHQLStatementsParser.T_HANDLER, 0); }
		public TerminalNode T_HASH() { return getToken(PLHQLStatementsParser.T_HASH, 0); }
		public TerminalNode T_HAVING() { return getToken(PLHQLStatementsParser.T_HAVING, 0); }
		public TerminalNode T_HDFS() { return getToken(PLHQLStatementsParser.T_HDFS, 0); }
		public TerminalNode T_HIVE() { return getToken(PLHQLStatementsParser.T_HIVE, 0); }
		public TerminalNode T_HOST() { return getToken(PLHQLStatementsParser.T_HOST, 0); }
		public TerminalNode T_IDENTITY() { return getToken(PLHQLStatementsParser.T_IDENTITY, 0); }
		public TerminalNode T_IF() { return getToken(PLHQLStatementsParser.T_IF, 0); }
		public TerminalNode T_IGNORE() { return getToken(PLHQLStatementsParser.T_IGNORE, 0); }
		public TerminalNode T_IMMEDIATE() { return getToken(PLHQLStatementsParser.T_IMMEDIATE, 0); }
		public TerminalNode T_IN() { return getToken(PLHQLStatementsParser.T_IN, 0); }
		public TerminalNode T_INCLUDE() { return getToken(PLHQLStatementsParser.T_INCLUDE, 0); }
		public TerminalNode T_INDEX() { return getToken(PLHQLStatementsParser.T_INDEX, 0); }
		public TerminalNode T_INITRANS() { return getToken(PLHQLStatementsParser.T_INITRANS, 0); }
		public TerminalNode T_INNER() { return getToken(PLHQLStatementsParser.T_INNER, 0); }
		public TerminalNode T_INOUT() { return getToken(PLHQLStatementsParser.T_INOUT, 0); }
		public TerminalNode T_INSERT() { return getToken(PLHQLStatementsParser.T_INSERT, 0); }
		public TerminalNode T_INT() { return getToken(PLHQLStatementsParser.T_INT, 0); }
		public TerminalNode T_INT2() { return getToken(PLHQLStatementsParser.T_INT2, 0); }
		public TerminalNode T_INT4() { return getToken(PLHQLStatementsParser.T_INT4, 0); }
		public TerminalNode T_INT8() { return getToken(PLHQLStatementsParser.T_INT8, 0); }
		public TerminalNode T_INTEGER() { return getToken(PLHQLStatementsParser.T_INTEGER, 0); }
		public TerminalNode T_INTERSECT() { return getToken(PLHQLStatementsParser.T_INTERSECT, 0); }
		public TerminalNode T_INTERVAL() { return getToken(PLHQLStatementsParser.T_INTERVAL, 0); }
		public TerminalNode T_INTO() { return getToken(PLHQLStatementsParser.T_INTO, 0); }
		public TerminalNode T_INVOKER() { return getToken(PLHQLStatementsParser.T_INVOKER, 0); }
		public TerminalNode T_ITEMS() { return getToken(PLHQLStatementsParser.T_ITEMS, 0); }
		public TerminalNode T_IS() { return getToken(PLHQLStatementsParser.T_IS, 0); }
		public TerminalNode T_ISOPEN() { return getToken(PLHQLStatementsParser.T_ISOPEN, 0); }
		public TerminalNode T_JOIN() { return getToken(PLHQLStatementsParser.T_JOIN, 0); }
		public TerminalNode T_KEEP() { return getToken(PLHQLStatementsParser.T_KEEP, 0); }
		public TerminalNode T_KEY() { return getToken(PLHQLStatementsParser.T_KEY, 0); }
		public TerminalNode T_KEYS() { return getToken(PLHQLStatementsParser.T_KEYS, 0); }
		public TerminalNode T_LAG() { return getToken(PLHQLStatementsParser.T_LAG, 0); }
		public TerminalNode T_LANGUAGE() { return getToken(PLHQLStatementsParser.T_LANGUAGE, 0); }
		public TerminalNode T_LAST_VALUE() { return getToken(PLHQLStatementsParser.T_LAST_VALUE, 0); }
		public TerminalNode T_LEAD() { return getToken(PLHQLStatementsParser.T_LEAD, 0); }
		public TerminalNode T_LEAVE() { return getToken(PLHQLStatementsParser.T_LEAVE, 0); }
		public TerminalNode T_LEFT() { return getToken(PLHQLStatementsParser.T_LEFT, 0); }
		public TerminalNode T_LIKE() { return getToken(PLHQLStatementsParser.T_LIKE, 0); }
		public TerminalNode T_LIMIT() { return getToken(PLHQLStatementsParser.T_LIMIT, 0); }
		public TerminalNode T_LINES() { return getToken(PLHQLStatementsParser.T_LINES, 0); }
		public TerminalNode T_LOCAL() { return getToken(PLHQLStatementsParser.T_LOCAL, 0); }
		public TerminalNode T_LOCATION() { return getToken(PLHQLStatementsParser.T_LOCATION, 0); }
		public TerminalNode T_LOCATOR() { return getToken(PLHQLStatementsParser.T_LOCATOR, 0); }
		public TerminalNode T_LOCATORS() { return getToken(PLHQLStatementsParser.T_LOCATORS, 0); }
		public TerminalNode T_LOCKS() { return getToken(PLHQLStatementsParser.T_LOCKS, 0); }
		public TerminalNode T_LOG() { return getToken(PLHQLStatementsParser.T_LOG, 0); }
		public TerminalNode T_LOGGED() { return getToken(PLHQLStatementsParser.T_LOGGED, 0); }
		public TerminalNode T_LOGGING() { return getToken(PLHQLStatementsParser.T_LOGGING, 0); }
		public TerminalNode T_LOOP() { return getToken(PLHQLStatementsParser.T_LOOP, 0); }
		public TerminalNode T_MAP() { return getToken(PLHQLStatementsParser.T_MAP, 0); }
		public TerminalNode T_MATCHED() { return getToken(PLHQLStatementsParser.T_MATCHED, 0); }
		public TerminalNode T_MAX() { return getToken(PLHQLStatementsParser.T_MAX, 0); }
		public TerminalNode T_MAXTRANS() { return getToken(PLHQLStatementsParser.T_MAXTRANS, 0); }
		public TerminalNode T_MERGE() { return getToken(PLHQLStatementsParser.T_MERGE, 0); }
		public TerminalNode T_MESSAGE_TEXT() { return getToken(PLHQLStatementsParser.T_MESSAGE_TEXT, 0); }
		public TerminalNode T_MICROSECOND() { return getToken(PLHQLStatementsParser.T_MICROSECOND, 0); }
		public TerminalNode T_MICROSECONDS() { return getToken(PLHQLStatementsParser.T_MICROSECONDS, 0); }
		public TerminalNode T_MIN() { return getToken(PLHQLStatementsParser.T_MIN, 0); }
		public TerminalNode T_MULTISET() { return getToken(PLHQLStatementsParser.T_MULTISET, 0); }
		public TerminalNode T_NCHAR() { return getToken(PLHQLStatementsParser.T_NCHAR, 0); }
		public TerminalNode T_NEW() { return getToken(PLHQLStatementsParser.T_NEW, 0); }
		public TerminalNode T_NVARCHAR() { return getToken(PLHQLStatementsParser.T_NVARCHAR, 0); }
		public TerminalNode T_NO() { return getToken(PLHQLStatementsParser.T_NO, 0); }
		public TerminalNode T_NOCOMPRESS() { return getToken(PLHQLStatementsParser.T_NOCOMPRESS, 0); }
		public TerminalNode T_NOCOUNT() { return getToken(PLHQLStatementsParser.T_NOCOUNT, 0); }
		public TerminalNode T_NOLOGGING() { return getToken(PLHQLStatementsParser.T_NOLOGGING, 0); }
		public TerminalNode T_NONE() { return getToken(PLHQLStatementsParser.T_NONE, 0); }
		public TerminalNode T_NOT() { return getToken(PLHQLStatementsParser.T_NOT, 0); }
		public TerminalNode T_NOTFOUND() { return getToken(PLHQLStatementsParser.T_NOTFOUND, 0); }
		public TerminalNode T_NUMERIC() { return getToken(PLHQLStatementsParser.T_NUMERIC, 0); }
		public TerminalNode T_NUMBER() { return getToken(PLHQLStatementsParser.T_NUMBER, 0); }
		public TerminalNode T_OBJECT() { return getToken(PLHQLStatementsParser.T_OBJECT, 0); }
		public TerminalNode T_OFF() { return getToken(PLHQLStatementsParser.T_OFF, 0); }
		public TerminalNode T_ON() { return getToken(PLHQLStatementsParser.T_ON, 0); }
		public TerminalNode T_ONLY() { return getToken(PLHQLStatementsParser.T_ONLY, 0); }
		public TerminalNode T_OPEN() { return getToken(PLHQLStatementsParser.T_OPEN, 0); }
		public TerminalNode T_OR() { return getToken(PLHQLStatementsParser.T_OR, 0); }
		public TerminalNode T_ORDER() { return getToken(PLHQLStatementsParser.T_ORDER, 0); }
		public TerminalNode T_OUT() { return getToken(PLHQLStatementsParser.T_OUT, 0); }
		public TerminalNode T_OUTER() { return getToken(PLHQLStatementsParser.T_OUTER, 0); }
		public TerminalNode T_OVER() { return getToken(PLHQLStatementsParser.T_OVER, 0); }
		public TerminalNode T_OVERWRITE() { return getToken(PLHQLStatementsParser.T_OVERWRITE, 0); }
		public TerminalNode T_OWNER() { return getToken(PLHQLStatementsParser.T_OWNER, 0); }
		public TerminalNode T_PACKAGE() { return getToken(PLHQLStatementsParser.T_PACKAGE, 0); }
		public TerminalNode T_PART_COUNT() { return getToken(PLHQLStatementsParser.T_PART_COUNT, 0); }
		public TerminalNode T_PART_LOC() { return getToken(PLHQLStatementsParser.T_PART_LOC, 0); }
		public TerminalNode T_PARTITION() { return getToken(PLHQLStatementsParser.T_PARTITION, 0); }
		public TerminalNode T_PCTFREE() { return getToken(PLHQLStatementsParser.T_PCTFREE, 0); }
		public TerminalNode T_PCTUSED() { return getToken(PLHQLStatementsParser.T_PCTUSED, 0); }
		public TerminalNode T_PRECISION() { return getToken(PLHQLStatementsParser.T_PRECISION, 0); }
		public TerminalNode T_PRESERVE() { return getToken(PLHQLStatementsParser.T_PRESERVE, 0); }
		public TerminalNode T_PRIMARY() { return getToken(PLHQLStatementsParser.T_PRIMARY, 0); }
		public TerminalNode T_PRINT() { return getToken(PLHQLStatementsParser.T_PRINT, 0); }
		public TerminalNode T_PROC() { return getToken(PLHQLStatementsParser.T_PROC, 0); }
		public TerminalNode T_PROCEDURE() { return getToken(PLHQLStatementsParser.T_PROCEDURE, 0); }
		public TerminalNode T_PWD() { return getToken(PLHQLStatementsParser.T_PWD, 0); }
		public TerminalNode T_QUALIFY() { return getToken(PLHQLStatementsParser.T_QUALIFY, 0); }
		public TerminalNode T_QUERY_BAND() { return getToken(PLHQLStatementsParser.T_QUERY_BAND, 0); }
		public TerminalNode T_QUIT() { return getToken(PLHQLStatementsParser.T_QUIT, 0); }
		public TerminalNode T_QUOTED_IDENTIFIER() { return getToken(PLHQLStatementsParser.T_QUOTED_IDENTIFIER, 0); }
		public TerminalNode T_RAISE() { return getToken(PLHQLStatementsParser.T_RAISE, 0); }
		public TerminalNode T_RANK() { return getToken(PLHQLStatementsParser.T_RANK, 0); }
		public TerminalNode T_REAL() { return getToken(PLHQLStatementsParser.T_REAL, 0); }
		public TerminalNode T_REFERENCES() { return getToken(PLHQLStatementsParser.T_REFERENCES, 0); }
		public TerminalNode T_REGEXP() { return getToken(PLHQLStatementsParser.T_REGEXP, 0); }
		public TerminalNode T_RR() { return getToken(PLHQLStatementsParser.T_RR, 0); }
		public TerminalNode T_REPLACE() { return getToken(PLHQLStatementsParser.T_REPLACE, 0); }
		public TerminalNode T_RESIGNAL() { return getToken(PLHQLStatementsParser.T_RESIGNAL, 0); }
		public TerminalNode T_RESTRICT() { return getToken(PLHQLStatementsParser.T_RESTRICT, 0); }
		public TerminalNode T_RESULT() { return getToken(PLHQLStatementsParser.T_RESULT, 0); }
		public TerminalNode T_RESULT_SET_LOCATOR() { return getToken(PLHQLStatementsParser.T_RESULT_SET_LOCATOR, 0); }
		public TerminalNode T_RETURN() { return getToken(PLHQLStatementsParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(PLHQLStatementsParser.T_RETURNS, 0); }
		public TerminalNode T_REVERSE() { return getToken(PLHQLStatementsParser.T_REVERSE, 0); }
		public TerminalNode T_RIGHT() { return getToken(PLHQLStatementsParser.T_RIGHT, 0); }
		public TerminalNode T_RLIKE() { return getToken(PLHQLStatementsParser.T_RLIKE, 0); }
		public TerminalNode T_RS() { return getToken(PLHQLStatementsParser.T_RS, 0); }
		public TerminalNode T_ROLE() { return getToken(PLHQLStatementsParser.T_ROLE, 0); }
		public TerminalNode T_ROLLBACK() { return getToken(PLHQLStatementsParser.T_ROLLBACK, 0); }
		public TerminalNode T_ROW() { return getToken(PLHQLStatementsParser.T_ROW, 0); }
		public TerminalNode T_ROWS() { return getToken(PLHQLStatementsParser.T_ROWS, 0); }
		public TerminalNode T_ROW_COUNT() { return getToken(PLHQLStatementsParser.T_ROW_COUNT, 0); }
		public TerminalNode T_ROW_NUMBER() { return getToken(PLHQLStatementsParser.T_ROW_NUMBER, 0); }
		public TerminalNode T_SCHEMA() { return getToken(PLHQLStatementsParser.T_SCHEMA, 0); }
		public TerminalNode T_SECOND() { return getToken(PLHQLStatementsParser.T_SECOND, 0); }
		public TerminalNode T_SECONDS() { return getToken(PLHQLStatementsParser.T_SECONDS, 0); }
		public TerminalNode T_SECURITY() { return getToken(PLHQLStatementsParser.T_SECURITY, 0); }
		public TerminalNode T_SEGMENT() { return getToken(PLHQLStatementsParser.T_SEGMENT, 0); }
		public TerminalNode T_SEL() { return getToken(PLHQLStatementsParser.T_SEL, 0); }
		public TerminalNode T_SELECT() { return getToken(PLHQLStatementsParser.T_SELECT, 0); }
		public TerminalNode T_SESSION() { return getToken(PLHQLStatementsParser.T_SESSION, 0); }
		public TerminalNode T_SESSIONS() { return getToken(PLHQLStatementsParser.T_SESSIONS, 0); }
		public TerminalNode T_SET() { return getToken(PLHQLStatementsParser.T_SET, 0); }
		public TerminalNode T_SETS() { return getToken(PLHQLStatementsParser.T_SETS, 0); }
		public TerminalNode T_SHARE() { return getToken(PLHQLStatementsParser.T_SHARE, 0); }
		public TerminalNode T_SIGNAL() { return getToken(PLHQLStatementsParser.T_SIGNAL, 0); }
		public TerminalNode T_SIMPLE_DOUBLE() { return getToken(PLHQLStatementsParser.T_SIMPLE_DOUBLE, 0); }
		public TerminalNode T_SIMPLE_FLOAT() { return getToken(PLHQLStatementsParser.T_SIMPLE_FLOAT, 0); }
		public TerminalNode T_SMALLDATETIME() { return getToken(PLHQLStatementsParser.T_SMALLDATETIME, 0); }
		public TerminalNode T_SMALLINT() { return getToken(PLHQLStatementsParser.T_SMALLINT, 0); }
		public TerminalNode T_SQL() { return getToken(PLHQLStatementsParser.T_SQL, 0); }
		public TerminalNode T_SQLEXCEPTION() { return getToken(PLHQLStatementsParser.T_SQLEXCEPTION, 0); }
		public TerminalNode T_SQLINSERT() { return getToken(PLHQLStatementsParser.T_SQLINSERT, 0); }
		public TerminalNode T_SQLSTATE() { return getToken(PLHQLStatementsParser.T_SQLSTATE, 0); }
		public TerminalNode T_SQLWARNING() { return getToken(PLHQLStatementsParser.T_SQLWARNING, 0); }
		public TerminalNode T_STATS() { return getToken(PLHQLStatementsParser.T_STATS, 0); }
		public TerminalNode T_STATISTICS() { return getToken(PLHQLStatementsParser.T_STATISTICS, 0); }
		public TerminalNode T_STEP() { return getToken(PLHQLStatementsParser.T_STEP, 0); }
		public TerminalNode T_STDEV() { return getToken(PLHQLStatementsParser.T_STDEV, 0); }
		public TerminalNode T_STORAGE() { return getToken(PLHQLStatementsParser.T_STORAGE, 0); }
		public TerminalNode T_STORED() { return getToken(PLHQLStatementsParser.T_STORED, 0); }
		public TerminalNode T_STRING() { return getToken(PLHQLStatementsParser.T_STRING, 0); }
		public TerminalNode T_SUBDIR() { return getToken(PLHQLStatementsParser.T_SUBDIR, 0); }
		public TerminalNode T_SUBSTRING() { return getToken(PLHQLStatementsParser.T_SUBSTRING, 0); }
		public TerminalNode T_SUM() { return getToken(PLHQLStatementsParser.T_SUM, 0); }
		public TerminalNode T_SUMMARY() { return getToken(PLHQLStatementsParser.T_SUMMARY, 0); }
		public TerminalNode T_SYSDATE() { return getToken(PLHQLStatementsParser.T_SYSDATE, 0); }
		public TerminalNode T_SYS_REFCURSOR() { return getToken(PLHQLStatementsParser.T_SYS_REFCURSOR, 0); }
		public TerminalNode T_TABLE() { return getToken(PLHQLStatementsParser.T_TABLE, 0); }
		public TerminalNode T_TABLESPACE() { return getToken(PLHQLStatementsParser.T_TABLESPACE, 0); }
		public TerminalNode T_TEMPORARY() { return getToken(PLHQLStatementsParser.T_TEMPORARY, 0); }
		public TerminalNode T_TERMINATED() { return getToken(PLHQLStatementsParser.T_TERMINATED, 0); }
		public TerminalNode T_TEXTIMAGE_ON() { return getToken(PLHQLStatementsParser.T_TEXTIMAGE_ON, 0); }
		public TerminalNode T_THEN() { return getToken(PLHQLStatementsParser.T_THEN, 0); }
		public TerminalNode T_TIMESTAMP() { return getToken(PLHQLStatementsParser.T_TIMESTAMP, 0); }
		public TerminalNode T_TITLE() { return getToken(PLHQLStatementsParser.T_TITLE, 0); }
		public TerminalNode T_TO() { return getToken(PLHQLStatementsParser.T_TO, 0); }
		public TerminalNode T_TOP() { return getToken(PLHQLStatementsParser.T_TOP, 0); }
		public TerminalNode T_TRANSACTION() { return getToken(PLHQLStatementsParser.T_TRANSACTION, 0); }
		public TerminalNode T_TRIM() { return getToken(PLHQLStatementsParser.T_TRIM, 0); }
		public TerminalNode T_TRUE() { return getToken(PLHQLStatementsParser.T_TRUE, 0); }
		public TerminalNode T_TRUNCATE() { return getToken(PLHQLStatementsParser.T_TRUNCATE, 0); }
		public TerminalNode T_UNIQUE() { return getToken(PLHQLStatementsParser.T_UNIQUE, 0); }
		public TerminalNode T_UPDATE() { return getToken(PLHQLStatementsParser.T_UPDATE, 0); }
		public TerminalNode T_UR() { return getToken(PLHQLStatementsParser.T_UR, 0); }
		public TerminalNode T_USE() { return getToken(PLHQLStatementsParser.T_USE, 0); }
		public TerminalNode T_USER() { return getToken(PLHQLStatementsParser.T_USER, 0); }
		public TerminalNode T_USING() { return getToken(PLHQLStatementsParser.T_USING, 0); }
		public TerminalNode T_VALUE() { return getToken(PLHQLStatementsParser.T_VALUE, 0); }
		public TerminalNode T_VALUES() { return getToken(PLHQLStatementsParser.T_VALUES, 0); }
		public TerminalNode T_VAR() { return getToken(PLHQLStatementsParser.T_VAR, 0); }
		public TerminalNode T_VARCHAR() { return getToken(PLHQLStatementsParser.T_VARCHAR, 0); }
		public TerminalNode T_VARCHAR2() { return getToken(PLHQLStatementsParser.T_VARCHAR2, 0); }
		public TerminalNode T_VARYING() { return getToken(PLHQLStatementsParser.T_VARYING, 0); }
		public TerminalNode T_VARIANCE() { return getToken(PLHQLStatementsParser.T_VARIANCE, 0); }
		public TerminalNode T_VOLATILE() { return getToken(PLHQLStatementsParser.T_VOLATILE, 0); }
		public TerminalNode T_WHILE() { return getToken(PLHQLStatementsParser.T_WHILE, 0); }
		public TerminalNode T_WITH() { return getToken(PLHQLStatementsParser.T_WITH, 0); }
		public TerminalNode T_WITHOUT() { return getToken(PLHQLStatementsParser.T_WITHOUT, 0); }
		public TerminalNode T_WORK() { return getToken(PLHQLStatementsParser.T_WORK, 0); }
		public TerminalNode T_XACT_ABORT() { return getToken(PLHQLStatementsParser.T_XACT_ABORT, 0); }
		public TerminalNode T_XML() { return getToken(PLHQLStatementsParser.T_XML, 0); }
		public TerminalNode T_YES() { return getToken(PLHQLStatementsParser.T_YES, 0); }
		public TerminalNode T_SUMMARIZE() { return getToken(PLHQLStatementsParser.T_SUMMARIZE, 0); }
		public Non_reserved_wordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_reserved_words; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterNon_reserved_words(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitNon_reserved_words(this);
		}
	}

	public final Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
		Non_reserved_wordsContext _localctx = new Non_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2586);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_SUMMARIZE - 320)) | (1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_invalid_tokenContext extends ParserRuleContext {
		public TerminalNode L_INVALID_TOKEN() { return getToken(PLHQLStatementsParser.L_INVALID_TOKEN, 0); }
		public Error_invalid_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_invalid_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterError_invalid_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitError_invalid_token(this);
		}
	}

	public final Error_invalid_tokenContext error_invalid_token() throws RecognitionException {
		Error_invalid_tokenContext _localctx = new Error_invalid_tokenContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_error_invalid_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2588);
			match(L_INVALID_TOKEN);
			notifyErrorListeners("Unexpected Token");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return block_end_sempred((Block_endContext)_localctx, predIndex);
		case 63:
			return create_routine_params_sempred((Create_routine_paramsContext)_localctx, predIndex);
		case 99:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 111:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 120:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 121:
			return having_bool_expr_sempred((Having_bool_exprContext)_localctx, predIndex);
		case 133:
			return group_by_expr_sempred((Group_by_exprContext)_localctx, predIndex);
		case 134:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 150:
			return func_param_sempred((Func_paramContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean block_end_sempred(Block_endContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_input.LT(2).getText().equalsIgnoreCase("TRANSACTION");
		}
		return true;
	}
	private boolean create_routine_params_sempred(Create_routine_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !_input.LT(1).getText().equalsIgnoreCase("IS") &&
		        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
		        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
		        ;
		}
		return true;
	}
	private boolean select_list_alias_sempred(Select_list_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM");
		}
		return true;
	}
	private boolean from_alias_clause_sempred(From_alias_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
		        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
		        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
		        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
		        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
		        !_input.LT(1).getText().equalsIgnoreCase("WITH");
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean having_bool_expr_sempred(Having_bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean group_by_expr_sempred(Group_by_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 15);
		case 11:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 14);
		case 13:
			return precpred(_ctx, 13);
		case 14:
			return precpred(_ctx, 12);
		case 15:
			return precpred(_ctx, 11);
		case 16:
			return precpred(_ctx, 16);
		case 17:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean func_param_sempred(Func_paramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO");
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0186\u0a22\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\3\2\6\2\u014c\n\2\r\2\16\2\u014d\3\2\3\2\3\3\3\3\3\3"+
		"\5\3\u0155\n\3\3\3\5\3\u0158\n\3\6\3\u015a\n\3\r\3\16\3\u015b\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0168\n\4\3\5\5\5\u016b\n\5\3\5\3"+
		"\5\3\5\3\5\3\6\5\6\u0172\n\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u017e\n\7\5\7\u0180\n\7\3\b\3\b\3\b\3\t\3\t\6\t\u0187\n\t\r\t\16\t"+
		"\u0188\3\t\5\t\u018c\n\t\5\t\u018e\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u01a1\n\n\3\13\3\13\7\13\u01a5"+
		"\n\13\f\13\16\13\u01a8\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01bc\n\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\7\17\u01c5\n\17\f\17\16\17\u01c8\13\17\3\20\3\20\3\20\7\20"+
		"\u01cd\n\20\f\20\16\20\u01d0\13\20\3\21\3\21\3\21\5\21\u01d5\n\21\3\22"+
		"\3\22\5\22\u01d9\n\22\3\23\3\23\5\23\u01dd\n\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u01e7\n\23\3\23\3\23\3\23\3\23\5\23\u01ed\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01f5\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u01fc\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0205\n\26\f"+
		"\26\16\26\u0208\13\26\3\26\3\26\5\26\u020c\n\26\3\26\3\26\3\26\3\26\3"+
		"\26\7\26\u0213\n\26\f\26\16\26\u0216\13\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\7\27\u0221\n\27\f\27\16\27\u0224\13\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\7\27\u022c\n\27\f\27\16\27\u022f\13\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\7\30\u0238\n\30\f\30\16\30\u023b\13\30\3\30\3"+
		"\30\5\30\u023f\n\30\3\30\5\30\u0242\n\30\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\32\5\32\u024e\n\32\3\32\3\32\3\33\3\33\3\33\3\33\7\33"+
		"\u0256\n\33\f\33\16\33\u0259\13\33\3\34\3\34\3\34\7\34\u025e\n\34\f\34"+
		"\16\34\u0261\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\7\35\u026b"+
		"\n\35\f\35\16\35\u026e\13\35\3\36\3\36\3\36\3\36\3\36\7\36\u0275\n\36"+
		"\f\36\16\36\u0278\13\36\3\37\3\37\3 \3 \3 \7 \u027f\n \f \16 \u0282\13"+
		" \3 \5 \u0285\n \3 \3 \5 \u0289\n \3 \7 \u028c\n \f \16 \u028f\13 \3 "+
		"\5 \u0292\n \3 \3 \3 \5 \u0297\n \3 \3 \5 \u029b\n \3 \3 \5 \u029f\n "+
		"\3!\3!\3!\3!\3!\5!\u02a6\n!\3!\3!\3!\3!\3\"\3\"\3\"\5\"\u02af\n\"\3#\3"+
		"#\3#\3#\5#\u02b5\n#\3#\3#\5#\u02b9\n#\3#\3#\3#\3$\3$\3$\3$\5$\u02c2\n"+
		"$\3$\5$\u02c5\n$\3$\3$\3$\5$\u02ca\n$\3$\3$\3%\5%\u02cf\n%\3%\3%\3%\3"+
		"%\3%\5%\u02d6\n%\3%\3%\3%\3%\3%\5%\u02dd\n%\3%\5%\u02e0\n%\3&\3&\3&\7"+
		"&\u02e5\n&\f&\16&\u02e8\13&\3\'\3\'\5\'\u02ec\n\'\3\'\7\'\u02ef\n\'\f"+
		"\'\16\'\u02f2\13\'\3\'\3\'\7\'\u02f6\n\'\f\'\16\'\u02f9\13\'\3\'\3\'\5"+
		"\'\u02fd\n\'\3\'\5\'\u0300\n\'\3(\3(\3)\3)\5)\u0306\n)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\7)\u0312\n)\f)\16)\u0315\13)\3)\3)\3)\3)\3)\7)\u031c\n"+
		")\f)\16)\u031f\13)\3)\3)\3)\5)\u0324\n)\3*\3*\3*\5*\u0329\n*\3*\3*\3*"+
		"\5*\u032e\n*\3*\3*\3*\5*\u0333\n*\7*\u0335\n*\f*\16*\u0338\13*\3*\3*\5"+
		"*\u033c\n*\3*\3*\3*\3*\3*\3*\7*\u0344\n*\f*\16*\u0347\13*\3*\3*\3*\3*"+
		"\3*\3*\3*\7*\u0350\n*\f*\16*\u0353\13*\3*\3*\7*\u0357\n*\f*\16*\u035a"+
		"\13*\5*\u035c\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0368\n+\3,\3,\3,\3"+
		",\3-\5-\u036f\n-\3-\3-\3.\6.\u0374\n.\r.\16.\u0375\3/\3/\3/\3/\3/\3/\3"+
		"/\3/\3/\3/\5/\u0382\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\6\60\u038f\n\60\r\60\16\60\u0390\3\60\3\60\3\60\5\60\u0396\n"+
		"\60\3\61\5\61\u0399\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\7\61\u03a6\n\61\f\61\16\61\u03a9\13\61\3\61\3\61\3\61\5\61"+
		"\u03ae\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u03b9\n"+
		"\61\3\62\5\62\u03bc\n\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u03c4\n\62"+
		"\f\62\16\62\u03c7\13\62\3\62\3\62\3\62\3\62\5\62\u03cd\n\62\3\63\3\63"+
		"\3\63\3\63\5\63\u03d3\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\5\65\u03e1\n\65\3\66\3\66\5\66\u03e5\n\66\3\66\3\66\3"+
		"\66\5\66\u03ea\n\66\3\66\3\66\5\66\u03ee\n\66\3\66\3\66\3\66\5\66\u03f3"+
		"\n\66\3\66\5\66\u03f6\n\66\3\66\3\66\3\66\5\66\u03fb\n\66\3\66\5\66\u03fe"+
		"\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67"+
		"\u040c\n\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\5\67\u042c\n\67\5\67\u042e\n\67\38\38\38\58\u0433"+
		"\n8\38\38\58\u0437\n8\38\38\39\59\u043c\n9\39\39\39\39\39\59\u0443\n9"+
		"\39\59\u0446\n9\3:\5:\u0449\n:\3:\3:\3:\5:\u044e\n:\3:\3:\5:\u0452\n:"+
		"\5:\u0454\n:\3;\3;\3;\3;\3;\5;\u045b\n;\3;\3;\7;\u045f\n;\f;\16;\u0462"+
		"\13;\3<\3<\3<\3<\5<\u0468\n<\3=\3=\3=\3=\5=\u046e\n=\3=\3=\3=\3=\3>\3"+
		">\3>\7>\u0477\n>\f>\16>\u047a\13>\3?\3?\3?\3@\3@\3@\5@\u0482\n@\3@\5@"+
		"\u0485\n@\3@\3@\5@\u0489\n@\3@\5@\u048c\n@\3@\5@\u048f\n@\3@\3@\3@\3@"+
		"\5@\u0495\n@\3A\3A\3A\3A\3A\3A\7A\u049d\nA\fA\16A\u04a0\13A\3A\3A\3A\3"+
		"A\3A\3A\7A\u04a8\nA\fA\16A\u04ab\13A\5A\u04ad\nA\3B\3B\3B\3B\3B\5B\u04b4"+
		"\nB\3B\3B\3B\5B\u04b9\nB\3B\7B\u04bc\nB\fB\16B\u04bf\13B\3B\5B\u04c2\n"+
		"B\3B\3B\3B\3B\3B\3B\5B\u04ca\nB\3B\3B\5B\u04ce\nB\3B\7B\u04d1\nB\fB\16"+
		"B\u04d4\13B\3B\5B\u04d7\nB\5B\u04d9\nB\3C\3C\5C\u04dd\nC\3C\3C\3C\3C\3"+
		"C\3C\5C\u04e5\nC\3C\3C\3C\3C\7C\u04eb\nC\fC\16C\u04ee\13C\5C\u04f0\nC"+
		"\3D\3D\3D\5D\u04f5\nD\3E\3E\3E\3E\3E\3E\3F\3F\3F\5F\u0500\nF\3G\3G\3G"+
		"\3G\3G\7G\u0507\nG\fG\16G\u050a\13G\3G\5G\u050d\nG\3G\3G\3G\3H\3H\3H\3"+
		"H\7H\u0516\nH\fH\16H\u0519\13H\3H\5H\u051c\nH\3H\3H\3H\3H\3I\3I\3I\3I"+
		"\3I\5I\u0527\nI\3J\3J\3J\3J\5J\u052d\nJ\3J\3J\3K\3K\3K\3K\3K\3K\3L\3L"+
		"\3L\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3O\3O\5O\u0547\nO\3O\3O\3O\3O\3O"+
		"\3O\3O\3O\7O\u0551\nO\fO\16O\u0554\13O\3O\3O\3P\3P\5P\u055a\nP\3P\3P\3"+
		"P\3P\7P\u0560\nP\fP\16P\u0563\13P\3P\3P\3P\3Q\3Q\5Q\u056a\nQ\3R\3R\3R"+
		"\3R\3R\5R\u0571\nR\3S\3S\3S\3S\5S\u0577\nS\3S\3S\3S\3S\3S\5S\u057e\nS"+
		"\3S\3S\3S\3S\3S\3T\3T\3T\5T\u0588\nT\3T\3T\5T\u058c\nT\3T\3T\5T\u0590"+
		"\nT\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\5U\u059d\nU\3U\3U\3U\5U\u05a2\nU"+
		"\3U\3U\3U\3U\3U\5U\u05a9\nU\7U\u05ab\nU\fU\16U\u05ae\13U\3U\3U\3V\5V\u05b3"+
		"\nV\3V\3V\3V\3V\3W\3W\3W\3W\5W\u05bd\nW\3W\3W\3W\3W\3W\5W\u05c4\nW\3W"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\5W\u05cf\nW\3W\3W\3W\3W\3W\5W\u05d6\nW\3W\3W"+
		"\3W\3W\3W\3W\3W\3W\5W\u05e0\nW\3W\3W\3W\3W\3W\5W\u05e7\nW\3W\3W\3W\3W"+
		"\3W\5W\u05ee\nW\3X\5X\u05f1\nX\3X\3X\3Y\3Y\3Y\3Y\7Y\u05f9\nY\fY\16Y\u05fc"+
		"\13Y\3Z\3Z\5Z\u0600\nZ\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\7[\u060b\n[\f[\16[\u060e"+
		"\13[\3[\3[\3\\\3\\\3\\\3\\\7\\\u0616\n\\\f\\\16\\\u0619\13\\\3]\3]\3]"+
		"\3]\3]\5]\u0620\n]\3^\3^\5^\u0624\n^\3^\3^\5^\u0628\n^\3^\3^\5^\u062c"+
		"\n^\5^\u062e\n^\3_\3_\3_\5_\u0633\n_\3_\3_\5_\u0637\n_\3_\5_\u063a\n_"+
		"\3_\3_\5_\u063e\n_\3_\5_\u0641\n_\3`\3`\3`\5`\u0646\n`\3`\5`\u0649\n`"+
		"\3`\5`\u064c\n`\3`\3`\5`\u0650\n`\3`\5`\u0653\n`\3`\3`\3`\5`\u0658\n`"+
		"\3a\5a\u065b\na\3a\5a\u065e\na\3a\3a\3a\7a\u0663\na\fa\16a\u0666\13a\3"+
		"b\3b\3b\5b\u066b\nb\3c\3c\3c\3d\3d\3d\3d\5d\u0674\nd\3d\3d\5d\u0678\n"+
		"d\3d\5d\u067b\nd\3d\3d\3e\3e\5e\u0681\ne\3e\3e\3e\3e\3e\5e\u0688\ne\3"+
		"f\3f\5f\u068c\nf\3f\3f\3g\3g\3g\3g\7g\u0694\ng\fg\16g\u0697\13g\3h\3h"+
		"\3h\7h\u069c\nh\fh\16h\u069f\13h\3i\3i\7i\u06a3\ni\fi\16i\u06a6\13i\3"+
		"j\3j\3j\5j\u06ab\nj\3k\3k\5k\u06af\nk\3k\3k\3l\3l\3l\3l\3l\3l\3m\3m\3"+
		"m\3m\3m\3m\3m\3m\5m\u06c1\nm\3n\5n\u06c4\nn\3n\3n\3n\5n\u06c9\nn\3n\5"+
		"n\u06cc\nn\3o\3o\3o\3o\3o\3o\7o\u06d4\no\fo\16o\u06d7\13o\3o\3o\5o\u06db"+
		"\no\3p\3p\3p\3p\3p\7p\u06e2\np\fp\16p\u06e5\13p\3p\3p\5p\u06e9\np\3q\3"+
		"q\5q\u06ed\nq\3q\3q\3q\3q\3q\7q\u06f4\nq\fq\16q\u06f7\13q\3q\5q\u06fa"+
		"\nq\3r\3r\3s\3s\3s\3s\3t\3t\3t\3u\3u\3u\3u\3u\3u\3u\3u\7u\u070d\nu\fu"+
		"\16u\u0710\13u\3v\3v\3v\3w\3w\3w\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\7x\u0722"+
		"\nx\fx\16x\u0725\13x\3y\3y\3y\5y\u072a\ny\3z\3z\5z\u072e\nz\3z\3z\3z\3"+
		"z\3z\5z\u0735\nz\3z\3z\3z\3z\7z\u073b\nz\fz\16z\u073e\13z\3{\3{\5{\u0742"+
		"\n{\3{\3{\3{\3{\3{\5{\u0749\n{\3{\3{\3{\3{\7{\u074f\n{\f{\16{\u0752\13"+
		"{\3|\3|\5|\u0756\n|\3}\3}\3}\5}\u075b\n}\3~\3~\3~\5~\u0760\n~\3~\3~\3"+
		"~\3~\3~\3~\3~\3~\3~\5~\u076b\n~\3~\3~\3~\3~\3~\3~\3~\5~\u0774\n~\3\177"+
		"\3\177\5\177\u0778\n\177\3\177\3\177\3\177\3\177\3\177\7\177\u077f\n\177"+
		"\f\177\16\177\u0782\13\177\3\177\5\177\u0785\n\177\3\177\3\177\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\7\u0080\u078d\n\u0080\f\u0080\16\u0080\u0790"+
		"\13\u0080\3\u0080\3\u0080\5\u0080\u0794\n\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\5\u0082\u07a9"+
		"\n\u0082\3\u0083\3\u0083\5\u0083\u07ad\n\u0083\3\u0084\3\u0084\3\u0085"+
		"\3\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\5\u0086\u07bb\n\u0086\3\u0086\5\u0086\u07be\n\u0086\3\u0087\3\u0087\3"+
		"\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u07d0\n\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\7\u0087\u07e5\n\u0087\f\u0087\16\u0087\u07e8\13\u0087\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u07fb\n\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\7\u0088\u0810\n\u0088\f\u0088\16\u0088\u0813\13\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u081d"+
		"\n\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\7\u008c\u082a\n\u008c\f\u008c\16\u008c\u082d"+
		"\13\u008c\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\5\u008d\u0838\n\u008d\3\u008e\3\u008e\5\u008e\u083c\n\u008e\3"+
		"\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\6\u008f\u0845\n"+
		"\u008f\r\u008f\16\u008f\u0846\3\u008f\3\u008f\5\u008f\u084b\n\u008f\3"+
		"\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\6\u0090"+
		"\u0855\n\u0090\r\u0090\16\u0090\u0856\3\u0090\3\u0090\5\u0090\u085b\n"+
		"\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\5\u0091\u0866\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\5\u0091\u0870\n\u0091\3\u0091\3\u0091\5\u0091"+
		"\u0874\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\5\u0091\u087d\n\u0091\3\u0091\3\u0091\5\u0091\u0881\n\u0091\3\u0091\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\5\u0091\u0898\n\u0091\5\u0091\u089a\n\u0091\3\u0091\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u08ac\n\u0091"+
		"\5\u0091\u08ae\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u08ba\n\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u08c3\n\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u08d4\n\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u08dd\n\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u08e6"+
		"\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u08ee"+
		"\n\u0091\3\u0092\3\u0092\3\u0092\5\u0092\u08f3\n\u0092\3\u0093\3\u0093"+
		"\3\u0093\5\u0093\u08f8\n\u0093\3\u0093\5\u0093\u08fb\n\u0093\3\u0093\3"+
		"\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\7\u0094\u0904\n\u0094\f"+
		"\u0094\16\u0094\u0907\13\u0094\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\5\u0095\u0910\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\5\u0095\u0918\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\5\u0095\u0921\n\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\5\u0095\u0927\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\7\u0095"+
		"\u0936\n\u0095\f\u0095\16\u0095\u0939\13\u0095\5\u0095\u093b\n\u0095\3"+
		"\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\7\u0095\u0949\n\u0095\f\u0095\16\u0095\u094c"+
		"\13\u0095\5\u0095\u094e\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\7\u0095\u095c"+
		"\n\u0095\f\u0095\16\u0095\u095f\13\u0095\5\u0095\u0961\n\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\7\u0095\u096f\n\u0095\f\u0095\16\u0095\u0972\13\u0095"+
		"\5\u0095\u0974\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\7\u0095\u0982\n\u0095"+
		"\f\u0095\16\u0095\u0985\13\u0095\5\u0095\u0987\n\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\7\u0095\u0995\n\u0095\f\u0095\16\u0095\u0998\13\u0095\5\u0095"+
		"\u099a\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\7\u0095\u09a6\n\u0095\f\u0095\16\u0095\u09a9"+
		"\13\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\6\u0095\u09b5\n\u0095\r\u0095\16\u0095\u09b6\3\u0095"+
		"\3\u0095\5\u0095\u09bb\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\5\u0095\u09cb\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095\u09d1\n"+
		"\u0095\3\u0096\3\u0096\3\u0096\5\u0096\u09d6\n\u0096\3\u0096\3\u0096\3"+
		"\u0097\3\u0097\3\u0097\7\u0097\u09dd\n\u0097\f\u0097\16\u0097\u09e0\13"+
		"\u0097\3\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u09e6\n\u0098\5\u0098\u09e8"+
		"\n\u0098\3\u0098\3\u0098\3\u0099\3\u0099\7\u0099\u09ee\n\u0099\f\u0099"+
		"\16\u0099\u09f1\13\u0099\3\u0099\3\u0099\3\u009a\3\u009a\3\u009a\3\u009b"+
		"\3\u009b\3\u009b\3\u009c\3\u009c\3\u009d\3\u009d\3\u009d\7\u009d\u0a00"+
		"\n\u009d\f\u009d\16\u009d\u0a03\13\u009d\3\u009e\3\u009e\5\u009e\u0a07"+
		"\n\u009e\3\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0a0d\n\u009f\3\u00a0"+
		"\5\u00a0\u0a10\n\u00a0\3\u00a0\3\u00a0\3\u00a1\5\u00a1\u0a15\n\u00a1\3"+
		"\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a4\3\u00a4\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\2\6\u00f2\u00f4\u010c\u010e\u00a6\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0"+
		"\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8"+
		"\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0"+
		"\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108"+
		"\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120"+
		"\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138"+
		"\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\2!\5\2\3\4\u0160\u0160"+
		"\u0178\u0178\4\2\u0170\u0170\u0174\u0174\4\2\u00b9\u00b9\u0101\u0101\4"+
		"\2\20\20TT\4\2QQ\u012d\u012d\4\2mm\u00ac\u00ac\4\2QQ\u00d9\u00d9\4\2M"+
		"M\u0089\u0089\5\2\u008d\u008d\u00b3\u00b3\u00d5\u00d6\4\2\u00ae\u00ae"+
		"\u00c0\u00c0\4\2\u00bd\u00bd\u0141\u0141\4\2\u00f4\u00f4\u012a\u012a\4"+
		"\2\u00b2\u00b2\u017f\u017f\4\2  \'\'\4\2%%??\4\2CC\u00fa\u00fa\3\2\u00dc"+
		"\u00dd\4\2\17\17\u009a\u009a\3\2gh\3\2`a\4\2\37\37\u0113\u0113\3\2\u00ff"+
		"\u0100\5\2yy\u00a3\u00a3\u00ee\u00ee\5\2nn\u00c4\u00c4\u0128\u0128\5\2"+
		"\u00a4\u00a4\u00e5\u00e5\u00ef\u00ef\5\2GH\u00b6\u00b7\u00fb\u00fc\3\2"+
		"\u0176\u0176\3\2\u0162\u0167\4\2\u015b\u015b\u0179\u0179\4\2nn\u0128\u0128"+
		"\17\2\7\32\34^bbd\u00c3\u00c5\u00d6\u00d8\u00f3\u00f5\u0108\u010a\u0122"+
		"\u0124\u0129\u012c\u0136\u0138\u0138\u013b\u014c\u0153\u015a\2\u0b68\2"+
		"\u014b\3\2\2\2\4\u0159\3\2\2\2\6\u0167\3\2\2\2\b\u016a\3\2\2\2\n\u0171"+
		"\3\2\2\2\f\u017f\3\2\2\2\16\u0181\3\2\2\2\20\u018d\3\2\2\2\22\u01a0\3"+
		"\2\2\2\24\u01a2\3\2\2\2\26\u01bb\3\2\2\2\30\u01bd\3\2\2\2\32\u01bf\3\2"+
		"\2\2\34\u01c1\3\2\2\2\36\u01c9\3\2\2\2 \u01d4\3\2\2\2\"\u01d8\3\2\2\2"+
		"$\u01ec\3\2\2\2&\u01f4\3\2\2\2(\u01fb\3\2\2\2*\u01fd\3\2\2\2,\u0219\3"+
		"\2\2\2.\u023e\3\2\2\2\60\u0248\3\2\2\2\62\u024a\3\2\2\2\64\u0251\3\2\2"+
		"\2\66\u025a\3\2\2\28\u0264\3\2\2\2:\u026f\3\2\2\2<\u0279\3\2\2\2>\u029e"+
		"\3\2\2\2@\u02a0\3\2\2\2B\u02ae\3\2\2\2D\u02b0\3\2\2\2F\u02bd\3\2\2\2H"+
		"\u02dc\3\2\2\2J\u02e1\3\2\2\2L\u02ff\3\2\2\2N\u0301\3\2\2\2P\u0323\3\2"+
		"\2\2R\u035b\3\2\2\2T\u035d\3\2\2\2V\u0369\3\2\2\2X\u036e\3\2\2\2Z\u0373"+
		"\3\2\2\2\\\u0381\3\2\2\2^\u0395\3\2\2\2`\u03b8\3\2\2\2b\u03cc\3\2\2\2"+
		"d\u03d2\3\2\2\2f\u03d4\3\2\2\2h\u03e0\3\2\2\2j\u03fd\3\2\2\2l\u042d\3"+
		"\2\2\2n\u042f\3\2\2\2p\u0445\3\2\2\2r\u0453\3\2\2\2t\u0455\3\2\2\2v\u0467"+
		"\3\2\2\2x\u0469\3\2\2\2z\u0473\3\2\2\2|\u047b\3\2\2\2~\u0484\3\2\2\2\u0080"+
		"\u04ac\3\2\2\2\u0082\u04d8\3\2\2\2\u0084\u04da\3\2\2\2\u0086\u04f4\3\2"+
		"\2\2\u0088\u04f6\3\2\2\2\u008a\u04ff\3\2\2\2\u008c\u0501\3\2\2\2\u008e"+
		"\u0511\3\2\2\2\u0090\u0521\3\2\2\2\u0092\u0528\3\2\2\2\u0094\u0530\3\2"+
		"\2\2\u0096\u0536\3\2\2\2\u0098\u053c\3\2\2\2\u009a\u0541\3\2\2\2\u009c"+
		"\u0544\3\2\2\2\u009e\u0557\3\2\2\2\u00a0\u0567\3\2\2\2\u00a2\u056b\3\2"+
		"\2\2\u00a4\u0572\3\2\2\2\u00a6\u0584\3\2\2\2\u00a8\u059c\3\2\2\2\u00aa"+
		"\u05b2\3\2\2\2\u00ac\u05ed\3\2\2\2\u00ae\u05f0\3\2\2\2\u00b0\u05f4\3\2"+
		"\2\2\u00b2\u05fd\3\2\2\2\u00b4\u0606\3\2\2\2\u00b6\u0611\3\2\2\2\u00b8"+
		"\u061f\3\2\2\2\u00ba\u062d\3\2\2\2\u00bc\u062f\3\2\2\2\u00be\u0657\3\2"+
		"\2\2\u00c0\u065a\3\2\2\2\u00c2\u066a\3\2\2\2\u00c4\u066c\3\2\2\2\u00c6"+
		"\u067a\3\2\2\2\u00c8\u0687\3\2\2\2\u00ca\u068b\3\2\2\2\u00cc\u068f\3\2"+
		"\2\2\u00ce\u0698\3\2\2\2\u00d0\u06a0\3\2\2\2\u00d2\u06aa\3\2\2\2\u00d4"+
		"\u06ac\3\2\2\2\u00d6\u06b2\3\2\2\2\u00d8\u06c0\3\2\2\2\u00da\u06cb\3\2"+
		"\2\2\u00dc\u06cd\3\2\2\2\u00de\u06e8\3\2\2\2\u00e0\u06ea\3\2\2\2\u00e2"+
		"\u06fb\3\2\2\2\u00e4\u06fd\3\2\2\2\u00e6\u0701\3\2\2\2\u00e8\u0704\3\2"+
		"\2\2\u00ea\u0711\3\2\2\2\u00ec\u0714\3\2\2\2\u00ee\u0717\3\2\2\2\u00f0"+
		"\u0729\3\2\2\2\u00f2\u0734\3\2\2\2\u00f4\u0748\3\2\2\2\u00f6\u0755\3\2"+
		"\2\2\u00f8\u075a\3\2\2\2\u00fa\u0773\3\2\2\2\u00fc\u0775\3\2\2\2\u00fe"+
		"\u0788\3\2\2\2\u0100\u079a\3\2\2\2\u0102\u07a8\3\2\2\2\u0104\u07ac\3\2"+
		"\2\2\u0106\u07ae\3\2\2\2\u0108\u07b0\3\2\2\2\u010a\u07bd\3\2\2\2\u010c"+
		"\u07cf\3\2\2\2\u010e\u07fa\3\2\2\2\u0110\u081c\3\2\2\2\u0112\u081e\3\2"+
		"\2\2\u0114\u0822\3\2\2\2\u0116\u0824\3\2\2\2\u0118\u0837\3\2\2\2\u011a"+
		"\u083b\3\2\2\2\u011c\u083d\3\2\2\2\u011e\u084e\3\2\2\2\u0120\u08ed\3\2"+
		"\2\2\u0122\u08f2\3\2\2\2\u0124\u08f4\3\2\2\2\u0126\u08fe\3\2\2\2\u0128"+
		"\u09d0\3\2\2\2\u012a\u09d2\3\2\2\2\u012c\u09d9\3\2\2\2\u012e\u09e1\3\2"+
		"\2\2\u0130\u09eb\3\2\2\2\u0132\u09f4\3\2\2\2\u0134\u09f7\3\2\2\2\u0136"+
		"\u09fa\3\2\2\2\u0138\u09fc\3\2\2\2\u013a\u0a06\3\2\2\2\u013c\u0a0c\3\2"+
		"\2\2\u013e\u0a0f\3\2\2\2\u0140\u0a14\3\2\2\2\u0142\u0a18\3\2\2\2\u0144"+
		"\u0a1a\3\2\2\2\u0146\u0a1c\3\2\2\2\u0148\u0a1e\3\2\2\2\u014a\u014c\5x"+
		"=\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7\2\2\3\u0150\3\3\2\2\2"+
		"\u0151\u0155\5\b\5\2\u0152\u0155\5\26\f\2\u0153\u0155\5\6\4\2\u0154\u0151"+
		"\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155\u0157\3\2\2\2\u0156"+
		"\u0158\7}\2\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a\3\2"+
		"\2\2\u0159\u0154\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c\5\3\2\2\2\u015d\u0168\5\u00be`\2\u015e\u0168\5\u0130"+
		"\u0099\2\u015f\u0168\5\n\6\2\u0160\u0168\5\u013c\u009f\2\u0161\u0168\5"+
		"\u00e6t\2\u0162\u0168\5\u008aF\2\u0163\u0168\5B\"\2\u0164\u0168\5\u00ac"+
		"W\2\u0165\u0168\5\66\34\2\u0166\u0168\5\u0148\u00a5\2\u0167\u015d\3\2"+
		"\2\2\u0167\u015e\3\2\2\2\u0167\u015f\3\2\2\2\u0167\u0160\3\2\2\2\u0167"+
		"\u0161\3\2\2\2\u0167\u0162\3\2\2\2\u0167\u0163\3\2\2\2\u0167\u0164\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168\7\3\2\2\2\u0169\u016b"+
		"\58\35\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016d\7\26\2\2\u016d\u016e\5\4\3\2\u016e\u016f\5\16\b\2\u016f\t\3\2\2"+
		"\2\u0170\u0172\58\35\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173"+
		"\3\2\2\2\u0173\u0174\7\26\2\2\u0174\u0175\5\4\3\2\u0175\u0176\b\6\1\2"+
		"\u0176\13\3\2\2\2\u0177\u0178\7\26\2\2\u0178\u0179\5\4\3\2\u0179\u017a"+
		"\5\16\b\2\u017a\u0180\3\2\2\2\u017b\u017d\5\26\f\2\u017c\u017e\7\u0178"+
		"\2\2\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\3\2\2\2\u017f"+
		"\u0177\3\2\2\2\u017f\u017b\3\2\2\2\u0180\r\3\2\2\2\u0181\u0182\6\b\2\2"+
		"\u0182\u0183\7c\2\2\u0183\17\3\2\2\2\u0184\u018e\5\b\5\2\u0185\u0187\5"+
		"\26\f\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u018b\3\2\2\2\u018a\u018c\7}\2\2\u018b\u018a\3\2"+
		"\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u0184\3\2\2\2\u018d"+
		"\u0186\3\2\2\2\u018e\21\3\2\2\2\u018f\u0190\5\36\20\2\u0190\u0191\7\u0178"+
		"\2\2\u0191\u01a1\3\2\2\2\u0192\u0193\5\60\31\2\u0193\u0194\7\u0178\2\2"+
		"\u0194\u01a1\3\2\2\2\u0195\u01a1\5\u0088E\2\u0196\u01a1\5\u00a6T\2\u0197"+
		"\u01a1\5x=\2\u0198\u0199\5\u00a2R\2\u0199\u019a\7\u0178\2\2\u019a\u01a1"+
		"\3\2\2\2\u019b\u01a1\5\24\13\2\u019c\u01a1\5\u00a8U\2\u019d\u019e\5\62"+
		"\32\2\u019e\u019f\7\u0178\2\2\u019f\u01a1\3\2\2\2\u01a0\u018f\3\2\2\2"+
		"\u01a0\u0192\3\2\2\2\u01a0\u0195\3\2\2\2\u01a0\u0196\3\2\2\2\u01a0\u0197"+
		"\3\2\2\2\u01a0\u0198\3\2\2\2\u01a0\u019b\3\2\2\2\u01a0\u019c\3\2\2\2\u01a0"+
		"\u019d\3\2\2\2\u01a1\23\3\2\2\2\u01a2\u01a6\7\u0171\2\2\u01a3\u01a5\5"+
		"\26\f\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7\u0175"+
		"\2\2\u01aa\25\3\2\2\2\u01ab\u01bc\5\34\17\2\u01ac\u01bc\5\60\31\2\u01ad"+
		"\u01bc\5\62\32\2\u01ae\u01bc\5t;\2\u01af\u01bc\5\u009cO\2\u01b0\u01bc"+
		"\5F$\2\u01b1\u01bc\5@!\2\u01b2\u01bc\5\64\33\2\u01b3\u01bc\5\u0084C\2"+
		"\u01b4\u01bc\5\u00a4S\2\u01b5\u01bc\5\u0086D\2\u01b6\u01bc\5\22\n\2\u01b7"+
		"\u01bc\5\u00a2R\2\u01b8\u01bc\5\32\16\2\u01b9\u01bc\5\u010e\u0088\2\u01ba"+
		"\u01bc\5\30\r\2\u01bb\u01ab\3\2\2\2\u01bb\u01ac\3\2\2\2\u01bb\u01ad\3"+
		"\2\2\2\u01bb\u01ae\3\2\2\2\u01bb\u01af\3\2\2\2\u01bb\u01b0\3\2\2\2\u01bb"+
		"\u01b1\3\2\2\2\u01bb\u01b2\3\2\2\2\u01bb\u01b3\3\2\2\2\u01bb\u01b4\3\2"+
		"\2\2\u01bb\u01b5\3\2\2\2\u01bb\u01b6\3\2\2\2\u01bb\u01b7\3\2\2\2\u01bb"+
		"\u01b8\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01ba\3\2\2\2\u01bc\27\3\2\2"+
		"\2\u01bd\u01be\t\2\2\2\u01be\31\3\2\2\2\u01bf\u01c0\7\u00c4\2\2\u01c0"+
		"\33\3\2\2\2\u01c1\u01c6\5 \21\2\u01c2\u01c3\7\u015e\2\2\u01c3\u01c5\5"+
		" \21\2\u01c4\u01c2\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\35\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ce\5\"\22"+
		"\2\u01ca\u01cb\7\u015e\2\2\u01cb\u01cd\5\"\22\2\u01cc\u01ca\3\2\2\2\u01cd"+
		"\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\37\3\2\2"+
		"\2\u01d0\u01ce\3\2\2\2\u01d1\u01d5\5$\23\2\u01d2\u01d5\5*\26\2\u01d3\u01d5"+
		"\5.\30\2\u01d4\u01d1\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5"+
		"!\3\2\2\2\u01d6\u01d9\5&\24\2\u01d7\u01d9\5,\27\2\u01d8\u01d6\3\2\2\2"+
		"\u01d8\u01d7\3\2\2\2\u01d9#\3\2\2\2\u01da\u01dc\5\u0138\u009d\2\u01db"+
		"\u01dd\7\u015d\2\2\u01dc\u01db\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de"+
		"\3\2\2\2\u01de\u01df\7\u0167\2\2\u01df\u01e0\5\u010e\u0088\2\u01e0\u01e1"+
		"\b\23\1\2\u01e1\u01ed\3\2\2\2\u01e2\u01e3\7\u0172\2\2\u01e3\u01e4\5\u0138"+
		"\u009d\2\u01e4\u01e6\7\u0176\2\2\u01e5\u01e7\7\u015d\2\2\u01e6\u01e5\3"+
		"\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\7\u0167\2\2"+
		"\u01e9\u01ea\5\u010e\u0088\2\u01ea\u01eb\b\23\1\2\u01eb\u01ed\3\2\2\2"+
		"\u01ec\u01da\3\2\2\2\u01ec\u01e2\3\2\2\2\u01ed%\3\2\2\2\u01ee\u01ef\5"+
		"\u0138\u009d\2\u01ef\u01f0\5\u0136\u009c\2\u01f0\u01f1\5\u010e\u0088\2"+
		"\u01f1\u01f2\b\24\1\2\u01f2\u01f5\3\2\2\2\u01f3\u01f5\5(\25\2\u01f4\u01ee"+
		"\3\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\'\3\2\2\2\u01f6\u01f7\5\u0138\u009d"+
		"\2\u01f7\u01f8\t\3\2\2\u01f8\u01fc\3\2\2\2\u01f9\u01fa\t\3\2\2\u01fa\u01fc"+
		"\5\u0138\u009d\2\u01fb\u01f6\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc)\3\2\2"+
		"\2\u01fd\u01fe\7\u0172\2\2\u01fe\u01ff\5\u0138\u009d\2\u01ff\u0206\b\26"+
		"\1\2\u0200\u0201\7\u015e\2\2\u0201\u0202\5\u0138\u009d\2\u0202\u0203\b"+
		"\26\1\2\u0203\u0205\3\2\2\2\u0204\u0200\3\2\2\2\u0205\u0208\3\2\2\2\u0206"+
		"\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\3\2\2\2\u0208\u0206\3\2"+
		"\2\2\u0209\u020b\7\u0176\2\2\u020a\u020c\7\u015d\2\2\u020b\u020a\3\2\2"+
		"\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\5\u0136\u009c\2"+
		"\u020e\u020f\7\u0172\2\2\u020f\u0214\5\u010e\u0088\2\u0210\u0211\7\u015e"+
		"\2\2\u0211\u0213\5\u010e\u0088\2\u0212\u0210\3\2\2\2\u0213\u0216\3\2\2"+
		"\2\u0214\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0214"+
		"\3\2\2\2\u0217\u0218\7\u0176\2\2\u0218+\3\2\2\2\u0219\u021a\7\u0172\2"+
		"\2\u021a\u021b\5\u0138\u009d\2\u021b\u0222\b\27\1\2\u021c\u021d\7\u015e"+
		"\2\2\u021d\u021e\5\u0138\u009d\2\u021e\u021f\b\27\1\2\u021f\u0221\3\2"+
		"\2\2\u0220\u021c\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0226\7\u0176"+
		"\2\2\u0226\u0227\7\u0167\2\2\u0227\u0228\7\u0172\2\2\u0228\u022d\5\u010e"+
		"\u0088\2\u0229\u022a\7\u015e\2\2\u022a\u022c\5\u010e\u0088\2\u022b\u0229"+
		"\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e"+
		"\u0230\3\2\2\2\u022f\u022d\3\2\2\2\u0230\u0231\7\u0176\2\2\u0231-\3\2"+
		"\2\2\u0232\u023f\5\u0138\u009d\2\u0233\u0234\7\u0172\2\2\u0234\u0239\5"+
		"\u0138\u009d\2\u0235\u0236\7\u015e\2\2\u0236\u0238\5\u0138\u009d\2\u0237"+
		"\u0235\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2"+
		"\2\2\u023a\u023c\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023d\7\u0176\2\2\u023d"+
		"\u023f\3\2\2\2\u023e\u0232\3\2\2\2\u023e\u0233\3\2\2\2\u023f\u0241\3\2"+
		"\2\2\u0240\u0242\7\u015d\2\2\u0241\u0240\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0244\7\u0167\2\2\u0244\u0245\7\u0172\2\2\u0245\u0246"+
		"\5\u00aeX\2\u0246\u0247\7\u0176\2\2\u0247/\3\2\2\2\u0248\u0249\7\36\2"+
		"\2\u0249\61\3\2\2\2\u024a\u024b\5\u0138\u009d\2\u024b\u024d\7\u0172\2"+
		"\2\u024c\u024e\5\u012c\u0097\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2"+
		"\u024e\u024f\3\2\2\2\u024f\u0250\7\u0176\2\2\u0250\63\3\2\2\2\u0251\u0252"+
		"\7K\2\2\u0252\u0257\5<\37\2\u0253\u0254\7\u015e\2\2\u0254\u0256\5<\37"+
		"\2\u0255\u0253\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258"+
		"\3\2\2\2\u0258\65\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025f\5<\37\2\u025b"+
		"\u025c\7\u015e\2\2\u025c\u025e\5<\37\2\u025d\u025b\3\2\2\2\u025e\u0261"+
		"\3\2\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0262\3\2\2\2\u0261"+
		"\u025f\3\2\2\2\u0262\u0263\b\34\1\2\u0263\67\3\2\2\2\u0264\u0265\7K\2"+
		"\2\u0265\u0266\5<\37\2\u0266\u026c\7\u0178\2\2\u0267\u0268\5<\37\2\u0268"+
		"\u0269\7\u0178\2\2\u0269\u026b\3\2\2\2\u026a\u0267\3\2\2\2\u026b\u026e"+
		"\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d9\3\2\2\2\u026e"+
		"\u026c\3\2\2\2\u026f\u0270\5<\37\2\u0270\u0276\7\u0178\2\2\u0271\u0272"+
		"\5<\37\2\u0272\u0273\7\u0178\2\2\u0273\u0275\3\2\2\2\u0274\u0271\3\2\2"+
		"\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277;"+
		"\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027a\5> \2\u027a=\3\2\2\2\u027b\u0280"+
		"\5\u0138\u009d\2\u027c\u027d\7\u015e\2\2\u027d\u027f\5\u0138\u009d\2\u027e"+
		"\u027c\3\2\2\2\u027f\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2"+
		"\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0283\u0285\7\17\2\2\u0284"+
		"\u0283\3\2\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\5l"+
		"\67\2\u0287\u0289\5n8\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289"+
		"\u028d\3\2\2\2\u028a\u028c\5p9\2\u028b\u028a\3\2\2\2\u028c\u028f\3\2\2"+
		"\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d"+
		"\3\2\2\2\u0290\u0292\5r:\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u029f\3\2\2\2\u0293\u0294\5\u0138\u009d\2\u0294\u0296\7\62\2\2\u0295"+
		"\u0297\7\17\2\2\u0296\u0295\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\3"+
		"\2\2\2\u0298\u029a\5l\67\2\u0299\u029b\5n8\2\u029a\u0299\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029d\5r:\2\u029d\u029f\3\2\2"+
		"\2\u029e\u027b\3\2\2\2\u029e\u0293\3\2\2\2\u029f?\3\2\2\2\u02a0\u02a1"+
		"\7<\2\2\u02a1\u02a5\7\u011c\2\2\u02a2\u02a3\7\u0087\2\2\u02a3\u02a4\7"+
		"\u00c2\2\2\u02a4\u02a6\7k\2\2\u02a5\u02a2\3\2\2\2\u02a5\u02a6\3\2\2\2"+
		"\u02a6\u02a7\3\2\2\2\u02a7\u02a8\5\u00e2r\2\u02a8\u02a9\5V,\2\u02a9\u02aa"+
		"\5H%\2\u02aaA\3\2\2\2\u02ab\u02af\5D#\2\u02ac\u02af\5\u009eP\2\u02ad\u02af"+
		"\5~@\2\u02ae\u02ab\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad\3\2\2\2\u02af"+
		"C\3\2\2\2\u02b0\u02b4\7<\2\2\u02b1\u02b2\7\u0087\2\2\u02b2\u02b3\7\u00c2"+
		"\2\2\u02b3\u02b5\7k\2\2\u02b4\u02b1\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5"+
		"\u02b6\3\2\2\2\u02b6\u02b8\5\u00e2r\2\u02b7\u02b9\5V,\2\u02b8\u02b7\3"+
		"\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\5H%\2\u02bb"+
		"\u02bc\b#\1\2\u02bcE\3\2\2\2\u02bd\u02c4\7<\2\2\u02be\u02bf\7\u00a7\2"+
		"\2\u02bf\u02c5\7\u011e\2\2\u02c0\u02c2\t\4\2\2\u02c1\u02c0\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\7\u0138\2\2\u02c4\u02be"+
		"\3\2\2\2\u02c4\u02c1\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\7\u011c\2"+
		"\2\u02c7\u02c9\5\u0138\u009d\2\u02c8\u02ca\5V,\2\u02c9\u02c8\3\2\2\2\u02c9"+
		"\u02ca\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\5H%\2\u02ccG\3\2\2\2\u02cd"+
		"\u02cf\7\17\2\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\3"+
		"\2\2\2\u02d0\u02d1\7\u0172\2\2\u02d1\u02d2\5\u00aeX\2\u02d2\u02d3\7\u0176"+
		"\2\2\u02d3\u02dd\3\2\2\2\u02d4\u02d6\7\17\2\2\u02d5\u02d4\3\2\2\2\u02d5"+
		"\u02d6\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02dd\5\u00aeX\2\u02d8\u02d9"+
		"\7\u0172\2\2\u02d9\u02da\5J&\2\u02da\u02db\7\u0176\2\2\u02db\u02dd\3\2"+
		"\2\2\u02dc\u02ce\3\2\2\2\u02dc\u02d5\3\2\2\2\u02dc\u02d8\3\2\2\2\u02dd"+
		"\u02df\3\2\2\2\u02de\u02e0\5Z.\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2"+
		"\2\u02e0I\3\2\2\2\u02e1\u02e6\5L\'\2\u02e2\u02e3\7\u015e\2\2\u02e3\u02e5"+
		"\5L\'\2\u02e4\u02e2\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7K\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9\u02eb\5l\67\2"+
		"\u02ea\u02ec\5n8\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02f0"+
		"\3\2\2\2\u02ed\u02ef\5p9\2\u02ee\u02ed\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0"+
		"\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02f0\3\2"+
		"\2\2\u02f3\u02f7\5N(\2\u02f4\u02f6\5P)\2\u02f5\u02f4\3\2\2\2\u02f6\u02f9"+
		"\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u0300\3\2\2\2\u02f9"+
		"\u02f7\3\2\2\2\u02fa\u02fb\7\67\2\2\u02fb\u02fd\5\u0138\u009d\2\u02fc"+
		"\u02fa\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0300\5R"+
		"*\2\u02ff\u02e9\3\2\2\2\u02ff\u02fc\3\2\2\2\u0300M\3\2\2\2\u0301\u0302"+
		"\5\u0138\u009d\2\u0302O\3\2\2\2\u0303\u0324\5r:\2\u0304\u0306\7\u00c2"+
		"\2\2\u0305\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"\u0324\7\u00c4\2\2\u0308\u0309\7\u00da\2\2\u0309\u0324\7\u009f\2\2\u030a"+
		"\u0324\7\u012c\2\2\u030b\u030c\7\u00e4\2\2\u030c\u030d\5\u00e2r\2\u030d"+
		"\u030e\7\u0172\2\2\u030e\u030f\5\u0138\u009d\2\u030f\u0313\7\u0176\2\2"+
		"\u0310\u0312\5T+\2\u0311\u0310\3\2\2\2\u0312\u0315\3\2\2\2\u0313\u0311"+
		"\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0324\3\2\2\2\u0315\u0313\3\2\2\2\u0316"+
		"\u0317\7\u0086\2\2\u0317\u0318\7\u0172\2\2\u0318\u031d\7\u017f\2\2\u0319"+
		"\u031a\7\u015e\2\2\u031a\u031c\7\u017f\2\2\u031b\u0319\3\2\2\2\u031c\u031f"+
		"\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0320\3\2\2\2\u031f"+
		"\u031d\3\2\2\2\u0320\u0324\7\u0176\2\2\u0321\u0324\7\23\2\2\u0322\u0324"+
		"\7b\2\2\u0323\u0303\3\2\2\2\u0323\u0305\3\2\2\2\u0323\u0308\3\2\2\2\u0323"+
		"\u030a\3\2\2\2\u0323\u030b\3\2\2\2\u0323\u0316\3\2\2\2\u0323\u0321\3\2"+
		"\2\2\u0323\u0322\3\2\2\2\u0324Q\3\2\2\2\u0325\u0326\7\u00da\2\2\u0326"+
		"\u0328\7\u009f\2\2\u0327\u0329\7,\2\2\u0328\u0327\3\2\2\2\u0328\u0329"+
		"\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032b\7\u0172\2\2\u032b\u032d\5\u0138"+
		"\u009d\2\u032c\u032e\t\5\2\2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e"+
		"\u0336\3\2\2\2\u032f\u0330\7\u015e\2\2\u0330\u0332\5\u0138\u009d\2\u0331"+
		"\u0333\t\5\2\2\u0332\u0331\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0335\3\2"+
		"\2\2\u0334\u032f\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2\2\2\u0336"+
		"\u0337\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u0336\3\2\2\2\u0339\u033b\7\u0176"+
		"\2\2\u033a\u033c\7b\2\2\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c"+
		"\u035c\3\2\2\2\u033d\u033e\7u\2\2\u033e\u033f\7\u009f\2\2\u033f\u0340"+
		"\7\u0172\2\2\u0340\u0345\5\u0138\u009d\2\u0341\u0342\7\u015e\2\2\u0342"+
		"\u0344\5\u0138\u009d\2\u0343\u0341\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0343"+
		"\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\3\2\2\2\u0347\u0345\3\2\2\2\u0348"+
		"\u0349\7\u0176\2\2\u0349\u034a\7\u00e4\2\2\u034a\u034b\5\u00e2r\2\u034b"+
		"\u034c\7\u0172\2\2\u034c\u0351\5\u0138\u009d\2\u034d\u034e\7\u015e\2\2"+
		"\u034e\u0350\5\u0138\u009d\2\u034f\u034d\3\2\2\2\u0350\u0353\3\2\2\2\u0351"+
		"\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0354\3\2\2\2\u0353\u0351\3\2"+
		"\2\2\u0354\u0358\7\u0176\2\2\u0355\u0357\5T+\2\u0356\u0355\3\2\2\2\u0357"+
		"\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035c\3\2"+
		"\2\2\u035a\u0358\3\2\2\2\u035b\u0325\3\2\2\2\u035b\u033d\3\2\2\2\u035c"+
		"S\3\2\2\2\u035d\u035e\7\u00c9\2\2\u035e\u0367\t\6\2\2\u035f\u0360\7\u00bd"+
		"\2\2\u0360\u0368\7\7\2\2\u0361\u0368\7\u00e8\2\2\u0362\u0363\7\u0101\2"+
		"\2\u0363\u0368\7\u00c4\2\2\u0364\u0365\7\u0101\2\2\u0365\u0368\7L\2\2"+
		"\u0366\u0368\7#\2\2\u0367\u035f\3\2\2\2\u0367\u0361\3\2\2\2\u0367\u0362"+
		"\3\2\2\2\u0367\u0364\3\2\2\2\u0367\u0366\3\2\2\2\u0368U\3\2\2\2\u0369"+
		"\u036a\5d\63\2\u036a\u036b\7\u00a8\2\2\u036b\u036c\5\u013a\u009e\2\u036c"+
		"W\3\2\2\2\u036d\u036f\7\u00bd\2\2\u036e\u036d\3\2\2\2\u036e\u036f\3\2"+
		"\2\2\u036f\u0370\3\2\2\2\u0370\u0371\t\7\2\2\u0371Y\3\2\2\2\u0372\u0374"+
		"\5\\/\2\u0373\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0373\3\2\2\2\u0375"+
		"\u0376\3\2\2\2\u0376[\3\2\2\2\u0377\u0378\7\u00c9\2\2\u0378\u0379\7\63"+
		"\2\2\u0379\u037a\t\b\2\2\u037a\u0382\7\u00f3\2\2\u037b\u0382\5^\60\2\u037c"+
		"\u0382\5`\61\2\u037d\u0382\5b\62\2\u037e\u0382\5d\63\2\u037f\u0382\5h"+
		"\65\2\u0380\u0382\5j\66\2\u0381\u0377\3\2\2\2\u0381\u037b\3\2\2\2\u0381"+
		"\u037c\3\2\2\2\u0381\u037d\3\2\2\2\u0381\u037e\3\2\2\2\u0381\u037f\3\2"+
		"\2\2\u0381\u0380\3\2\2\2\u0382]\3\2\2\2\u0383\u0384\7\u00fe\2\2\u0384"+
		"\u0385\7=\2\2\u0385\u0396\t\t\2\2\u0386\u0387\t\n\2\2\u0387\u0396\7\u017f"+
		"\2\2\u0388\u0396\7\u00bf\2\2\u0389\u0396\t\13\2\2\u038a\u038b\7\u0114"+
		"\2\2\u038b\u038e\7\u0172\2\2\u038c\u038f\5\u0138\u009d\2\u038d\u038f\7"+
		"\u017f\2\2\u038e\u038c\3\2\2\2\u038e\u038d\3\2\2\2\u038f\u0390\3\2\2\2"+
		"\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0396"+
		"\7\u0176\2\2\u0393\u0394\7\u011d\2\2\u0394\u0396\5\u0138\u009d\2\u0395"+
		"\u0383\3\2\2\2\u0395\u0386\3\2\2\2\u0395\u0388\3\2\2\2\u0395\u0389\3\2"+
		"\2\2\u0395\u038a\3\2\2\2\u0395\u0393\3\2\2\2\u0396_\3\2\2\2\u0397\u0399"+
		"\7\u008c\2\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039a\3\2\2"+
		"\2\u039a\u039b\7\u008a\2\2\u039b\u03b9\5\u0138\u009d\2\u039c\u039d\7\u013c"+
		"\2\2\u039d\u03b9\7\u00e6\2\2\u039e\u039f\7Z\2\2\u039f\u03a0\7\37\2\2\u03a0"+
		"\u03a1\7\u0081\2\2\u03a1\u03a2\7\u0172\2\2\u03a2\u03a7\5\u0138\u009d\2"+
		"\u03a3\u03a4\7\u015e\2\2\u03a4\u03a6\5\u0138\u009d\2\u03a5\u03a3\3\2\2"+
		"\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03aa"+
		"\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa\u03ab\7\u0176\2\2\u03ab\u03b9\3\2\2"+
		"\2\u03ac\u03ae\7\u00c2\2\2\u03ad\u03ac\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae"+
		"\u03af\3\2\2\2\u03af\u03b9\7\u00ad\2\2\u03b0\u03b1\7\64\2\2\u03b1\u03b9"+
		"\t\f\2\2\u03b2\u03b3\7P\2\2\u03b3\u03b9\7\u00ca\2\2\u03b4\u03b5\7\u013c"+
		"\2\2\u03b5\u03b6\7\u00e8\2\2\u03b6\u03b7\7\u00c9\2\2\u03b7\u03b9\7]\2"+
		"\2\u03b8\u0398\3\2\2\2\u03b8\u039c\3\2\2\2\u03b8\u039e\3\2\2\2\u03b8\u03ad"+
		"\3\2\2\2\u03b8\u03b0\3\2\2\2\u03b8\u03b2\3\2\2\2\u03b8\u03b4\3\2\2\2\u03b9"+
		"a\3\2\2\2\u03ba\u03bc\7\u012c\2\2\u03bb\u03ba\3\2\2\2\u03bb\u03bc\3\2"+
		"\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\7\u00da\2\2\u03be\u03bf\7\u008c\2"+
		"\2\u03bf\u03c0\7\u0172\2\2\u03c0\u03c5\5\u0138\u009d\2\u03c1\u03c2\7\u015e"+
		"\2\2\u03c2\u03c4\5\u0138\u009d\2\u03c3\u03c1\3\2\2\2\u03c4\u03c7\3\2\2"+
		"\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c8\3\2\2\2\u03c7\u03c5"+
		"\3\2\2\2\u03c8\u03c9\7\u0176\2\2\u03c9\u03cd\3\2\2\2\u03ca\u03cb\7\u013c"+
		"\2\2\u03cb\u03cd\7D\2\2\u03cc\u03bb\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cd"+
		"c\3\2\2\2\u03ce\u03d3\5f\64\2\u03cf\u03d0\7\u0115\2\2\u03d0\u03d1\7\17"+
		"\2\2\u03d1\u03d3\5\u0138\u009d\2\u03d2\u03ce\3\2\2\2\u03d2\u03cf\3\2\2"+
		"\2\u03d3e\3\2\2\2\u03d4\u03d5\7\u00f2\2\2\u03d5\u03d6\7v\2\2\u03d6\u03d7"+
		"\7R\2\2\u03d7\u03d8\7p\2\2\u03d8\u03d9\7\u011f\2\2\u03d9\u03da\7\37\2"+
		"\2\u03da\u03db\5\u013a\u009e\2\u03dbg\3\2\2\2\u03dc\u03dd\7\u00c9\2\2"+
		"\u03dd\u03e1\5\u0138\u009d\2\u03de\u03df\7\u0120\2\2\u03df\u03e1\5\u0138"+
		"\u009d\2\u03e0\u03dc\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1i\3\2\2\2\u03e2"+
		"\u03e4\7\23\2\2\u03e3\u03e5\7\u0167\2\2\u03e4\u03e3\3\2\2\2\u03e4\u03e5"+
		"\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03fe\5\u010e\u0088\2\u03e7\u03e9\7"+
		"\61\2\2\u03e8\u03ea\7\u0167\2\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea\3\2\2"+
		"\2\u03ea\u03eb\3\2\2\2\u03eb\u03fe\5\u010e\u0088\2\u03ec\u03ee\7L\2\2"+
		"\u03ed\u03ec\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03f2\3\2\2\2\u03ef\u03f0"+
		"\7(\2\2\u03f0\u03f3\7\u0101\2\2\u03f1\u03f3\7)\2\2\u03f2\u03ef\3\2\2\2"+
		"\u03f2\u03f1\3\2\2\2\u03f3\u03f5\3\2\2\2\u03f4\u03f6\7\u0167\2\2\u03f5"+
		"\u03f4\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03fe\5\u010e"+
		"\u0088\2\u03f8\u03fa\7d\2\2\u03f9\u03fb\7\u0167\2\2\u03fa\u03f9\3\2\2"+
		"\2\u03fa\u03fb\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fe\5\u010e\u0088\2"+
		"\u03fd\u03e2\3\2\2\2\u03fd\u03e7\3\2\2\2\u03fd\u03ed\3\2\2\2\u03fd\u03f8"+
		"\3\2\2\2\u03fek\3\2\2\2\u03ff\u042e\7\'\2\2\u0400\u042e\7\30\2\2\u0401"+
		"\u042e\7\31\2\2\u0402\u042e\7\32\2\2\u0403\u042e\7\33\2\2\u0404\u042e"+
		"\7\34\2\2\u0405\u042e\7E\2\2\u0406\u042e\7F\2\2\u0407\u042e\7I\2\2\u0408"+
		"\u042e\7J\2\2\u0409\u040b\7\\\2\2\u040a\u040c\7\u00d8\2\2\u040b\u040a"+
		"\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u042e\3\2\2\2\u040d\u042e\7s\2\2\u040e"+
		"\u042e\7\u0091\2\2\u040f\u042e\7\u0092\2\2\u0410\u042e\7\u0093\2\2\u0411"+
		"\u042e\7\u0094\2\2\u0412\u042e\7\u0095\2\2\u0413\u042e\7\u00ba\2\2\u0414"+
		"\u042e\7\u00bc\2\2\u0415\u042e\7\u00c6\2\2\u0416\u042e\7\u00c5\2\2\u0417"+
		"\u042e\7\u00d7\2\2\u0418\u042e\7\u00e3\2\2\u0419\u041a\7\u00ea\2\2\u041a"+
		"\u042e\7\u0136\2\2\u041b\u042e\7\u0108\2\2\u041c\u042e\7\u0107\2\2\u041d"+
		"\u042e\7\u0109\2\2\u041e\u042e\7\u010b\2\2\u041f\u042e\7\u010a\2\2\u0420"+
		"\u042e\7\u0116\2\2\u0421\u042e\7\u011b\2\2\u0422\u042e\7\u0122\2\2\u0423"+
		"\u042e\7\u0123\2\2\u0424\u042e\7\u0134\2\2\u0425\u042e\7\u0137\2\2\u0426"+
		"\u042e\7\u0135\2\2\u0427\u042e\7\u0140\2\2\u0428\u042b\5\u0138\u009d\2"+
		"\u0429\u042a\7\5\2\2\u042a\u042c\t\r\2\2\u042b\u0429\3\2\2\2\u042b\u042c"+
		"\3\2\2\2\u042c\u042e\3\2\2\2\u042d\u03ff\3\2\2\2\u042d\u0400\3\2\2\2\u042d"+
		"\u0401\3\2\2\2\u042d\u0402\3\2\2\2\u042d\u0403\3\2\2\2\u042d\u0404\3\2"+
		"\2\2\u042d\u0405\3\2\2\2\u042d\u0406\3\2\2\2\u042d\u0407\3\2\2\2\u042d"+
		"\u0408\3\2\2\2\u042d\u0409\3\2\2\2\u042d\u040d\3\2\2\2\u042d\u040e\3\2"+
		"\2\2\u042d\u040f\3\2\2\2\u042d\u0410\3\2\2\2\u042d\u0411\3\2\2\2\u042d"+
		"\u0412\3\2\2\2\u042d\u0413\3\2\2\2\u042d\u0414\3\2\2\2\u042d\u0415\3\2"+
		"\2\2\u042d\u0416\3\2\2\2\u042d\u0417\3\2\2\2\u042d\u0418\3\2\2\2\u042d"+
		"\u0419\3\2\2\2\u042d\u041b\3\2\2\2\u042d\u041c\3\2\2\2\u042d\u041d\3\2"+
		"\2\2\u042d\u041e\3\2\2\2\u042d\u041f\3\2\2\2\u042d\u0420\3\2\2\2\u042d"+
		"\u0421\3\2\2\2\u042d\u0422\3\2\2\2\u042d\u0423\3\2\2\2\u042d\u0424\3\2"+
		"\2\2\u042d\u0425\3\2\2\2\u042d\u0426\3\2\2\2\u042d\u0427\3\2\2\2\u042d"+
		"\u0428\3\2\2\2\u042em\3\2\2\2\u042f\u0430\7\u0172\2\2\u0430\u0432\t\16"+
		"\2\2\u0431\u0433\t\17\2\2\u0432\u0431\3\2\2\2\u0432\u0433\3\2\2\2\u0433"+
		"\u0436\3\2\2\2\u0434\u0435\7\u015e\2\2\u0435\u0437\7\u017f\2\2\u0436\u0434"+
		"\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0439\7\u0176\2"+
		"\2\u0439o\3\2\2\2\u043a\u043c\7\u00c2\2\2\u043b\u043a\3\2\2\2\u043b\u043c"+
		"\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u0446\7\u00c4\2\2\u043e\u043f\7(\2"+
		"\2\u043f\u0440\7\u0101\2\2\u0440\u0446\5\u0138\u009d\2\u0441\u0443\7\u00c2"+
		"\2\2\u0442\u0441\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0444\3\2\2\2\u0444"+
		"\u0446\t\20\2\2\u0445\u043b\3\2\2\2\u0445\u043e\3\2\2\2\u0445\u0442\3"+
		"\2\2\2\u0446q\3\2\2\2\u0447\u0449\7\u015d\2\2\u0448\u0447\3\2\2\2\u0448"+
		"\u0449\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044b\7\u0167\2\2\u044b\u0454"+
		"\5\u010e\u0088\2\u044c\u044e\7\u013c\2\2\u044d\u044c\3\2\2\2\u044d\u044e"+
		"\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0451\7L\2\2\u0450\u0452\5\u010e\u0088"+
		"\2\u0451\u0450\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0454\3\2\2\2\u0453\u0448"+
		"\3\2\2\2\u0453\u044d\3\2\2\2\u0454s\3\2\2\2\u0455\u0456\7<\2\2\u0456\u045a"+
		"\t\21\2\2\u0457\u0458\7\u0087\2\2\u0458\u0459\7\u00c2\2\2\u0459\u045b"+
		"\7k\2\2\u045a\u0457\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045c\3\2\2\2\u045c"+
		"\u0460\5\u010e\u0088\2\u045d\u045f\5v<\2\u045e\u045d\3\2\2\2\u045f\u0462"+
		"\3\2\2\2\u0460\u045e\3\2\2\2\u0460\u0461\3\2\2\2\u0461u\3\2\2\2\u0462"+
		"\u0460\3\2\2\2\u0463\u0464\7\61\2\2\u0464\u0468\5\u010e\u0088\2\u0465"+
		"\u0466\7\u00a8\2\2\u0466\u0468\5\u010e\u0088\2\u0467\u0463\3\2\2\2\u0467"+
		"\u0465\3\2\2\2\u0468w\3\2\2\2\u0469\u046a\5l\67\2\u046a\u046b\5\u0138"+
		"\u009d\2\u046b\u046d\7\u0172\2\2\u046c\u046e\5z>\2\u046d\u046c\3\2\2\2"+
		"\u046d\u046e\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\7\u0176\2\2\u0470"+
		"\u0471\5\24\13\2\u0471\u0472\b=\1\2\u0472y\3\2\2\2\u0473\u0478\5|?\2\u0474"+
		"\u0475\7\u015e\2\2\u0475\u0477\5|?\2\u0476\u0474\3\2\2\2\u0477\u047a\3"+
		"\2\2\2\u0478\u0476\3\2\2\2\u0478\u0479\3\2\2\2\u0479{\3\2\2\2\u047a\u0478"+
		"\3\2\2\2\u047b\u047c\5l\67\2\u047c\u047d\5\u0138\u009d\2\u047d}\3\2\2"+
		"\2\u047e\u0481\7<\2\2\u047f\u0480\7\u00cc\2\2\u0480\u0482\7\u00e6\2\2"+
		"\u0481\u047f\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0485\3\2\2\2\u0483\u0485"+
		"\7\u00e6\2\2\u0484\u047e\3\2\2\2\u0484\u0483\3\2\2\2\u0484\u0485\3\2\2"+
		"\2\u0485\u0486\3\2\2\2\u0486\u0488\t\22\2\2\u0487\u0489\5\u0080A\2\u0488"+
		"\u0487\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048b\3\2\2\2\u048a\u048c\t\23"+
		"\2\2\u048b\u048a\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048e\3\2\2\2\u048d"+
		"\u048f\5:\36\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\3\2"+
		"\2\2\u0490\u0494\5\20\t\2\u0491\u0492\5\u0138\u009d\2\u0492\u0493\7\u0178"+
		"\2\2\u0493\u0495\3\2\2\2\u0494\u0491\3\2\2\2\u0494\u0495\3\2\2\2\u0495"+
		"\177\3\2\2\2\u0496\u0497\7\u0172\2\2\u0497\u04ad\7\u0176\2\2\u0498\u0499"+
		"\7\u0172\2\2\u0499\u049e\5\u0082B\2\u049a\u049b\7\u015e\2\2\u049b\u049d"+
		"\5\u0082B\2\u049c\u049a\3\2\2\2\u049d\u04a0\3\2\2\2\u049e\u049c\3\2\2"+
		"\2\u049e\u049f\3\2\2\2\u049f\u04a1\3\2\2\2\u04a0\u049e\3\2\2\2\u04a1\u04a2"+
		"\7\u0176\2\2\u04a2\u04ad\3\2\2\2\u04a3\u04a4\6A\3\2\u04a4\u04a9\5\u0082"+
		"B\2\u04a5\u04a6\7\u015e\2\2\u04a6\u04a8\5\u0082B\2\u04a7\u04a5\3\2\2\2"+
		"\u04a8\u04ab\3\2\2\2\u04a9\u04a7\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ad"+
		"\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ac\u0496\3\2\2\2\u04ac\u0498\3\2\2\2\u04ac"+
		"\u04a3\3\2\2\2\u04ad\u0081\3\2\2\2\u04ae\u04b4\7\u008a\2\2\u04af\u04b4"+
		"\7\u00ce\2\2\u04b0\u04b4\7\u008f\2\2\u04b1\u04b2\7\u008a\2\2\u04b2\u04b4"+
		"\7\u00ce\2\2\u04b3\u04ae\3\2\2\2\u04b3\u04af\3\2\2\2\u04b3\u04b0\3\2\2"+
		"\2\u04b3\u04b1\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6"+
		"\5\u0138\u009d\2\u04b6\u04b8\5l\67\2\u04b7\u04b9\5n8\2\u04b8\u04b7\3\2"+
		"\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04bd\3\2\2\2\u04ba\u04bc\5p9\2\u04bb\u04ba"+
		"\3\2\2\2\u04bc\u04bf\3\2\2\2\u04bd\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"\u04c1\3\2\2\2\u04bf\u04bd\3\2\2\2\u04c0\u04c2\5r:\2\u04c1\u04c0\3\2\2"+
		"\2\u04c1\u04c2\3\2\2\2\u04c2\u04d9\3\2\2\2\u04c3\u04c9\5\u0138\u009d\2"+
		"\u04c4\u04ca\7\u008a\2\2\u04c5\u04ca\7\u00ce\2\2\u04c6\u04ca\7\u008f\2"+
		"\2\u04c7\u04c8\7\u008a\2\2\u04c8\u04ca\7\u00ce\2\2\u04c9\u04c4\3\2\2\2"+
		"\u04c9\u04c5\3\2\2\2\u04c9\u04c6\3\2\2\2\u04c9\u04c7\3\2\2\2\u04c9\u04ca"+
		"\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cd\5l\67\2\u04cc\u04ce\5n8\2\u04cd"+
		"\u04cc\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04d2\3\2\2\2\u04cf\u04d1\5p"+
		"9\2\u04d0\u04cf\3\2\2\2\u04d1\u04d4\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d2"+
		"\u04d3\3\2\2\2\u04d3\u04d6\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d5\u04d7\5r"+
		":\2\u04d6\u04d5\3\2\2\2\u04d6\u04d7\3\2\2\2\u04d7\u04d9\3\2\2\2\u04d8"+
		"\u04b3\3\2\2\2\u04d8\u04c3\3\2\2\2\u04d9\u0083\3\2\2\2\u04da\u04dc\t\24"+
		"\2\2\u04db\u04dd\7\u0089\2\2\u04dc\u04db\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd"+
		"\u04de\3\2\2\2\u04de\u04e4\5\u010e\u0088\2\u04df\u04e0\7\u0172\2\2\u04e0"+
		"\u04e1\5\u012c\u0097\2\u04e1\u04e2\7\u0176\2\2\u04e2\u04e5\3\2\2\2\u04e3"+
		"\u04e5\5\u012c\u0097\2\u04e4\u04df\3\2\2\2\u04e4\u04e3\3\2\2\2\u04e4\u04e5"+
		"\3\2\2\2\u04e5\u04ef\3\2\2\2\u04e6\u04e7\7\u0098\2\2\u04e7\u04ec\7\u017a"+
		"\2\2\u04e8\u04e9\7\u015e\2\2\u04e9\u04eb\7\u017a\2\2\u04ea\u04e8\3\2\2"+
		"\2\u04eb\u04ee\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04f0"+
		"\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ef\u04e6\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0"+
		"\u0085\3\2\2\2\u04f1\u04f5\5\u008cG\2\u04f2\u04f5\5\u0090I\2\u04f3\u04f5"+
		"\5\u0094K\2\u04f4\u04f1\3\2\2\2\u04f4\u04f2\3\2\2\2\u04f4\u04f3\3\2\2"+
		"\2\u04f5\u0087\3\2\2\2\u04f6\u04f7\7\u0087\2\2\u04f7\u04f8\7\u0172\2\2"+
		"\u04f8\u04f9\5\u00f2z\2\u04f9\u04fa\7\u0176\2\2\u04fa\u04fb\5\22\n\2\u04fb"+
		"\u0089\3\2\2\2\u04fc\u0500\5\u008eH\2\u04fd\u0500\5\u0092J\2\u04fe\u0500"+
		"\5\u0096L\2\u04ff\u04fc\3\2\2\2\u04ff\u04fd\3\2\2\2\u04ff\u04fe\3\2\2"+
		"\2\u0500\u008b\3\2\2\2\u0501\u0502\7\u0087\2\2\u0502\u0503\5\u00f2z\2"+
		"\u0503\u0504\7\u0121\2\2\u0504\u0508\5\4\3\2\u0505\u0507\5\u0098M\2\u0506"+
		"\u0505\3\2\2\2\u0507\u050a\3\2\2\2\u0508\u0506\3\2\2\2\u0508\u0509\3\2"+
		"\2\2\u0509\u050c\3\2\2\2\u050a\u0508\3\2\2\2\u050b\u050d\5\u009aN\2\u050c"+
		"\u050b\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\3\2\2\2\u050e\u050f\7c"+
		"\2\2\u050f\u0510\7\u0087\2\2\u0510\u008d\3\2\2\2\u0511\u0512\7\u0087\2"+
		"\2\u0512\u0513\7\u0121\2\2\u0513\u0517\5\4\3\2\u0514\u0516\5\u0098M\2"+
		"\u0515\u0514\3\2\2\2\u0516\u0519\3\2\2\2\u0517\u0515\3\2\2\2\u0517\u0518"+
		"\3\2\2\2\u0518\u051b\3\2\2\2\u0519\u0517\3\2\2\2\u051a\u051c\5\u009aN"+
		"\2\u051b\u051a\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051d\3\2\2\2\u051d\u051e"+
		"\7c\2\2\u051e\u051f\7\u0087\2\2\u051f\u0520\bH\1\2\u0520\u008f\3\2\2\2"+
		"\u0521\u0522\7\u0087\2\2\u0522\u0523\5\u00f2z\2\u0523\u0526\5\f\7\2\u0524"+
		"\u0525\7_\2\2\u0525\u0527\5\f\7\2\u0526\u0524\3\2\2\2\u0526\u0527\3\2"+
		"\2\2\u0527\u0091\3\2\2\2\u0528\u0529\7\u0087\2\2\u0529\u052c\5\f\7\2\u052a"+
		"\u052b\7_\2\2\u052b\u052d\5\f\7\2\u052c\u052a\3\2\2\2\u052c\u052d\3\2"+
		"\2\2\u052d\u052e\3\2\2\2\u052e\u052f\bJ\1\2\u052f\u0093\3\2\2\2\u0530"+
		"\u0531\7\6\2\2\u0531\u0532\7\u0087\2\2\u0532\u0533\5\u00f2z\2\u0533\u0534"+
		"\7\u0121\2\2\u0534\u0535\5\f\7\2\u0535\u0095\3\2\2\2\u0536\u0537\7\6\2"+
		"\2\u0537\u0538\7\u0087\2\2\u0538\u0539\7\u0121\2\2\u0539\u053a\5\f\7\2"+
		"\u053a\u053b\bL\1\2\u053b\u0097\3\2\2\2\u053c\u053d\t\25\2\2\u053d\u053e"+
		"\5\u00f2z\2\u053e\u053f\7\u0121\2\2\u053f\u0540\5\4\3\2\u0540\u0099\3"+
		"\2\2\2\u0541\u0542\7_\2\2\u0542\u0543\5\4\3\2\u0543\u009b\3\2\2\2\u0544"+
		"\u0546\7<\2\2\u0545\u0547\7\u012c\2\2\u0546\u0545\3\2\2\2\u0546\u0547"+
		"\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0549\7\u008c\2\2\u0549\u054a\5\u0138"+
		"\u009d\2\u054a\u054b\7\u00c9\2\2\u054b\u054c\5\u00e2r\2\u054c\u054d\7"+
		"\u0172\2\2\u054d\u0552\5\u00a0Q\2\u054e\u054f\7\u015e\2\2\u054f\u0551"+
		"\5\u00a0Q\2\u0550\u054e\3\2\2\2\u0551\u0554\3\2\2\2\u0552\u0550\3\2\2"+
		"\2\u0552\u0553\3\2\2\2\u0553\u0555\3\2\2\2\u0554\u0552\3\2\2\2\u0555\u0556"+
		"\7\u0176\2\2\u0556\u009d\3\2\2\2\u0557\u0559\7<\2\2\u0558\u055a\7\u012c"+
		"\2\2\u0559\u0558\3\2\2\2\u0559\u055a\3\2\2\2\u055a\u055b\3\2\2\2\u055b"+
		"\u055c\7\u0172\2\2\u055c\u0561\5\u00a0Q\2\u055d\u055e\7\u015e\2\2\u055e"+
		"\u0560\5\u00a0Q\2\u055f\u055d\3\2\2\2\u0560\u0563\3\2\2\2\u0561\u055f"+
		"\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0564\3\2\2\2\u0563\u0561\3\2\2\2\u0564"+
		"\u0565\7\u0176\2\2\u0565\u0566\bP\1\2\u0566\u009f\3\2\2\2\u0567\u0569"+
		"\5\u0138\u009d\2\u0568\u056a\t\5\2\2\u0569\u0568\3\2\2\2\u0569\u056a\3"+
		"\2\2\2\u056a\u00a1\3\2\2\2\u056b\u0570\7\u00eb\2\2\u056c\u056d\5\u010e"+
		"\u0088\2\u056d\u056e\bR\1\2\u056e\u0571\3\2\2\2\u056f\u0571\bR\1\2\u0570"+
		"\u056c\3\2\2\2\u0570\u056f\3\2\2\2\u0571\u00a3\3\2\2\2\u0572\u0573\7t"+
		"\2\2\u0573\u0574\7\u017a\2\2\u0574\u0576\7\u008a\2\2\u0575\u0577\7\u00ed"+
		"\2\2\u0576\u0575\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0578\3\2\2\2\u0578"+
		"\u0579\5\u010e\u0088\2\u0579\u057a\7\u0161\2\2\u057a\u057d\5\u010e\u0088"+
		"\2\u057b\u057c\t\26\2\2\u057c\u057e\5\u010e\u0088\2\u057d\u057b\3\2\2"+
		"\2\u057d\u057e\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0580\7\u00af\2\2\u0580"+
		"\u0581\5\4\3\2\u0581\u0582\7c\2\2\u0582\u0583\7\u00af\2\2\u0583\u00a5"+
		"\3\2\2\2\u0584\u0585\7t\2\2\u0585\u0587\7\u0172\2\2\u0586\u0588\5\u00aa"+
		"V\2\u0587\u0586\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0589\3\2\2\2\u0589"+
		"\u058b\7\u0178\2\2\u058a\u058c\5\u00f2z\2\u058b\u058a\3\2\2\2\u058b\u058c"+
		"\3\2\2\2\u058c\u058d\3\2\2\2\u058d\u058f\7\u0178\2\2\u058e\u0590\5\36"+
		"\20\2\u058f\u058e\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0591\3\2\2\2\u0591"+
		"\u0592\7\u0176\2\2\u0592\u0593\5\22\n\2\u0593\u00a7\3\2\2\2\u0594\u0595"+
		"\5l\67\2\u0595\u0596\5\u0138\u009d\2\u0596\u0597\bU\1\2\u0597\u059d\3"+
		"\2\2\2\u0598\u0599\7\u0133\2\2\u0599\u059a\5\u0138\u009d\2\u059a\u059b"+
		"\bU\1\2\u059b\u059d\3\2\2\2\u059c\u0594\3\2\2\2\u059c\u0598\3\2\2\2\u059d"+
		"\u05a1\3\2\2\2\u059e\u059f\7\u0167\2\2\u059f\u05a2\5\u010e\u0088\2\u05a0"+
		"\u05a2\bU\1\2\u05a1\u059e\3\2\2\2\u05a1\u05a0\3\2\2\2\u05a2\u05ac\3\2"+
		"\2\2\u05a3\u05a4\7\u015e\2\2\u05a4\u05a8\5\u0138\u009d\2\u05a5\u05a6\7"+
		"\u0167\2\2\u05a6\u05a9\5\u010e\u0088\2\u05a7\u05a9\bU\1\2\u05a8\u05a5"+
		"\3\2\2\2\u05a8\u05a7\3\2\2\2\u05a9\u05ab\3\2\2\2\u05aa\u05a3\3\2\2\2\u05ab"+
		"\u05ae\3\2\2\2\u05ac\u05aa\3\2\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05af\3\2"+
		"\2\2\u05ae\u05ac\3\2\2\2\u05af\u05b0\7\u0178\2\2\u05b0\u00a9\3\2\2\2\u05b1"+
		"\u05b3\5l\67\2\u05b2\u05b1\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b4\3\2"+
		"\2\2\u05b4\u05b5\5\u0138\u009d\2\u05b5\u05b6\7\u0167\2\2\u05b6\u05b7\5"+
		"\u010e\u0088\2\u05b7\u00ab\3\2\2\2\u05b8\u05b9\7t\2\2\u05b9\u05ba\7\u017a"+
		"\2\2\u05ba\u05bc\7\u008a\2\2\u05bb\u05bd\7\u00ed\2\2\u05bc\u05bb\3\2\2"+
		"\2\u05bc\u05bd\3\2\2\2\u05bd\u05be\3\2\2\2\u05be\u05bf\5\u010e\u0088\2"+
		"\u05bf\u05c0\7\u0161\2\2\u05c0\u05c3\5\u010e\u0088\2\u05c1\u05c2\t\26"+
		"\2\2\u05c2\u05c4\5\u010e\u0088\2\u05c3\u05c1\3\2\2\2\u05c3\u05c4\3\2\2"+
		"\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6\5\4\3\2\u05c6\u05c7\7c\2\2\u05c7\u05c8"+
		"\7\u00af\2\2\u05c8\u05c9\bW\1\2\u05c9\u05ee\3\2\2\2\u05ca\u05cb\7t\2\2"+
		"\u05cb\u05cc\7\u017a\2\2\u05cc\u05ce\7\u008a\2\2\u05cd\u05cf\7\u00ed\2"+
		"\2\u05ce\u05cd\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1"+
		"\5\u010e\u0088\2\u05d1\u05d2\7\u0161\2\2\u05d2\u05d5\5\u010e\u0088\2\u05d3"+
		"\u05d4\t\26\2\2\u05d4\u05d6\5\u010e\u0088\2\u05d5\u05d3\3\2\2\2\u05d5"+
		"\u05d6\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d8\7\u00af\2\2\u05d8\u05d9"+
		"\5\4\3\2\u05d9\u05da\bW\1\2\u05da\u05ee\3\2\2\2\u05db\u05dc\7t\2\2\u05dc"+
		"\u05dd\7\u017a\2\2\u05dd\u05df\7\u008a\2\2\u05de\u05e0\7\u00ed\2\2\u05df"+
		"\u05de\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2\5\u010e"+
		"\u0088\2\u05e2\u05e3\7\u0161\2\2\u05e3\u05e6\5\u010e\u0088\2\u05e4\u05e5"+
		"\t\26\2\2\u05e5\u05e7\5\u010e\u0088\2\u05e6\u05e4\3\2\2\2\u05e6\u05e7"+
		"\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05e9\7\u00af\2\2\u05e9\u05ea\7c\2"+
		"\2\u05ea\u05eb\7\u00af\2\2\u05eb\u05ec\bW\1\2\u05ec\u05ee\3\2\2\2\u05ed"+
		"\u05b8\3\2\2\2\u05ed\u05ca\3\2\2\2\u05ed\u05db\3\2\2\2\u05ee\u00ad\3\2"+
		"\2\2\u05ef\u05f1\5\u00b0Y\2\u05f0\u05ef\3\2\2\2\u05f0\u05f1\3\2\2\2\u05f1"+
		"\u05f2\3\2\2\2\u05f2\u05f3\5\u00b6\\\2\u05f3\u00af\3\2\2\2\u05f4\u05f5"+
		"\7\u013c\2\2\u05f5\u05fa\5\u00b2Z\2\u05f6\u05f7\7\u015e\2\2\u05f7\u05f9"+
		"\5\u00b2Z\2\u05f8\u05f6\3\2\2\2\u05f9\u05fc\3\2\2\2\u05fa\u05f8\3\2\2"+
		"\2\u05fa\u05fb\3\2\2\2\u05fb\u00b1\3\2\2\2\u05fc\u05fa\3\2\2\2\u05fd\u05ff"+
		"\5\u0138\u009d\2\u05fe\u0600\5\u00b4[\2\u05ff\u05fe\3\2\2\2\u05ff\u0600"+
		"\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0602\7\17\2\2\u0602\u0603\7\u0172"+
		"\2\2\u0603\u0604\5\u00b6\\\2\u0604\u0605\7\u0176\2\2\u0605\u00b3\3\2\2"+
		"\2\u0606\u0607\7\u0172\2\2\u0607\u060c\5\u0138\u009d\2\u0608\u0609\7\u015e"+
		"\2\2\u0609\u060b\5\u0138\u009d\2\u060a\u0608\3\2\2\2\u060b\u060e\3\2\2"+
		"\2\u060c\u060a\3\2\2\2\u060c\u060d\3\2\2\2\u060d\u060f\3\2\2\2\u060e\u060c"+
		"\3\2\2\2\u060f\u0610\7\u0176\2\2\u0610\u00b5\3\2\2\2\u0611\u0617\5\u00b8"+
		"]\2\u0612\u0613\5\u00ba^\2\u0613\u0614\5\u00b8]\2\u0614\u0616\3\2\2\2"+
		"\u0615\u0612\3\2\2\2\u0616\u0619\3\2\2\2\u0617\u0615\3\2\2\2\u0617\u0618"+
		"\3\2\2\2\u0618\u00b7\3\2\2\2\u0619\u0617\3\2\2\2\u061a\u0620\5\u00bc_"+
		"\2\u061b\u061c\7\u0172\2\2\u061c\u061d\5\u00b6\\\2\u061d\u061e\7\u0176"+
		"\2\2\u061e\u0620\3\2\2\2\u061f\u061a\3\2\2\2\u061f\u061b\3\2\2\2\u0620"+
		"\u00b9\3\2\2\2\u0621\u0623\7\u012b\2\2\u0622\u0624\7\t\2\2\u0623\u0622"+
		"\3\2\2\2\u0623\u0624\3\2\2\2\u0624\u062e\3\2\2\2\u0625\u0627\7f\2\2\u0626"+
		"\u0628\7\t\2\2\u0627\u0626\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u062e\3\2"+
		"\2\2\u0629\u062b\7\u0096\2\2\u062a\u062c\7\t\2\2\u062b\u062a\3\2\2\2\u062b"+
		"\u062c\3\2\2\2\u062c\u062e\3\2\2\2\u062d\u0621\3\2\2\2\u062d\u0625\3\2"+
		"\2\2\u062d\u0629\3\2\2\2\u062e\u00bb\3\2\2\2\u062f\u0630\t\27\2\2\u0630"+
		"\u0632\5\u00c0a\2\u0631\u0633\5\u00ccg\2\u0632\u0631\3\2\2\2\u0632\u0633"+
		"\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0636\5\u00ceh\2\u0635\u0637\5\u00e4"+
		"s\2\u0636\u0635\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u0639\3\2\2\2\u0638"+
		"\u063a\5\u00e8u\2\u0639\u0638\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063d"+
		"\3\2\2\2\u063b\u063e\5\u00eav\2\u063c\u063e\5\u00ecw\2\u063d\u063b\3\2"+
		"\2\2\u063d\u063c\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u0640\3\2\2\2\u063f"+
		"\u0641\5\u00eex\2\u0640\u063f\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u00bd"+
		"\3\2\2\2\u0642\u0643\t\27\2\2\u0643\u0645\5\u00c0a\2\u0644\u0646\5\u00cc"+
		"g\2\u0645\u0644\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0648\3\2\2\2\u0647"+
		"\u0649\5\u00e4s\2\u0648\u0647\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u064b"+
		"\3\2\2\2\u064a\u064c\5\u00e8u\2\u064b\u064a\3\2\2\2\u064b\u064c\3\2\2"+
		"\2\u064c\u064f\3\2\2\2\u064d\u0650\5\u00eav\2\u064e\u0650\5\u00ecw\2\u064f"+
		"\u064d\3\2\2\2\u064f\u064e\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0652\3\2"+
		"\2\2\u0651\u0653\5\u00eex\2\u0652\u0651\3\2\2\2\u0652\u0653\3\2\2\2\u0653"+
		"\u0658\3\2\2\2\u0654\u0655\5\u00d0i\2\u0655\u0656\b`\1\2\u0656\u0658\3"+
		"\2\2\2\u0657\u0642\3\2\2\2\u0657\u0654\3\2\2\2\u0658\u00bf\3\2\2\2\u0659"+
		"\u065b\5\u00c2b\2\u065a\u0659\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065d"+
		"\3\2\2\2\u065c\u065e\5\u00c4c\2\u065d\u065c\3\2\2\2\u065d\u065e\3\2\2"+
		"\2\u065e\u065f\3\2\2\2\u065f\u0664\5\u00c6d\2\u0660\u0661\7\u015e\2\2"+
		"\u0661\u0663\5\u00c6d\2\u0662\u0660\3\2\2\2\u0663\u0666\3\2\2\2\u0664"+
		"\u0662\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u00c1\3\2\2\2\u0666\u0664\3\2"+
		"\2\2\u0667\u066b\7\t\2\2\u0668\u0669\7Y\2\2\u0669\u066b\bb\1\2\u066a\u0667"+
		"\3\2\2\2\u066a\u0668\3\2\2\2\u066b\u00c3\3\2\2\2\u066c\u066d\7\u0126\2"+
		"\2\u066d\u066e\5\u010e\u0088\2\u066e\u00c5\3\2\2\2\u066f\u0670\5\u0138"+
		"\u009d\2\u0670\u0671\7\u0167\2\2\u0671\u0672\bd\1\2\u0672\u0674\3\2\2"+
		"\2\u0673\u066f\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0677"+
		"\5\u010e\u0088\2\u0676\u0678\5\u00c8e\2\u0677\u0676\3\2\2\2\u0677\u0678"+
		"\3\2\2\2\u0678\u067b\3\2\2\2\u0679\u067b\5\u00caf\2\u067a\u0673\3\2\2"+
		"\2\u067a\u0679\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067d\bd\1\2\u067d\u00c7"+
		"\3\2\2\2\u067e\u0680\6e\4\2\u067f\u0681\7\17\2\2\u0680\u067f\3\2\2\2\u0680"+
		"\u0681\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0688\5\u0138\u009d\2\u0683\u0684"+
		"\7\u0172\2\2\u0684\u0685\7\u0124\2\2\u0685\u0686\7\u017b\2\2\u0686\u0688"+
		"\7\u0176\2\2\u0687\u067e\3\2\2\2\u0687\u0683\3\2\2\2\u0688\u00c9\3\2\2"+
		"\2\u0689\u068a\7\u017a\2\2\u068a\u068c\7\6\2\2\u068b\u0689\3\2\2\2\u068b"+
		"\u068c\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u068e\7\u016f\2\2\u068e\u00cb"+
		"\3\2\2\2\u068f\u0690\7\u0098\2\2\u0690\u0695\5\u0138\u009d\2\u0691\u0692"+
		"\7\u015e\2\2\u0692\u0694\5\u0138\u009d\2\u0693\u0691\3\2\2\2\u0694\u0697"+
		"\3\2\2\2\u0695\u0693\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u00cd\3\2\2\2\u0697"+
		"\u0695\3\2\2\2\u0698\u0699\7x\2\2\u0699\u069d\5\u00d2j\2\u069a\u069c\5"+
		"\u00d8m\2\u069b\u069a\3\2\2\2\u069c\u069f\3\2\2\2\u069d\u069b\3\2\2\2"+
		"\u069d\u069e\3\2\2\2\u069e\u00cf\3\2\2\2\u069f\u069d\3\2\2\2\u06a0\u06a4"+
		"\7x\2\2\u06a1\u06a3\5\u00d8m\2\u06a2\u06a1\3\2\2\2\u06a3\u06a6\3\2\2\2"+
		"\u06a4\u06a2\3\2\2\2\u06a4\u06a5\3\2\2\2\u06a5\u00d1\3\2\2\2\u06a6\u06a4"+
		"\3\2\2\2\u06a7\u06ab\5\u00d4k\2\u06a8\u06ab\5\u00d6l\2\u06a9\u06ab\5\u00dc"+
		"o\2\u06aa\u06a7\3\2\2\2\u06aa\u06a8\3\2\2\2\u06aa\u06a9\3\2\2\2\u06ab"+
		"\u00d3\3\2\2\2\u06ac\u06ae\5\u00e2r\2\u06ad\u06af\5\u00e0q\2\u06ae\u06ad"+
		"\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b1\bk\1\2\u06b1"+
		"\u00d5\3\2\2\2\u06b2\u06b3\7\u0172\2\2\u06b3\u06b4\5\u00aeX\2\u06b4\u06b5"+
		"\7\u0176\2\2\u06b5\u06b6\5\u00e0q\2\u06b6\u06b7\bl\1\2\u06b7\u00d7\3\2"+
		"\2\2\u06b8\u06b9\7\u015e\2\2\u06b9\u06c1\5\u00d2j\2\u06ba\u06bb\5\u00da"+
		"n\2\u06bb\u06bc\5\u00d2j\2\u06bc\u06bd\7\u00c9\2\2\u06bd\u06be\5\u00f2"+
		"z\2\u06be\u06bf\bm\1\2\u06bf\u06c1\3\2\2\2\u06c0\u06b8\3\2\2\2\u06c0\u06ba"+
		"\3\2\2\2\u06c1\u00d9\3\2\2\2\u06c2\u06c4\7\u008e\2\2\u06c3\u06c2\3\2\2"+
		"\2\u06c3\u06c4\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5\u06cc\7\u009d\2\2\u06c6"+
		"\u06c8\t\30\2\2\u06c7\u06c9\7\u00cf\2\2\u06c8\u06c7\3\2\2\2\u06c8\u06c9"+
		"\3\2\2\2\u06c9\u06ca\3\2\2\2\u06ca\u06cc\7\u009d\2\2\u06cb\u06c3\3\2\2"+
		"\2\u06cb\u06c6\3\2\2\2\u06cc\u00db\3\2\2\2\u06cd\u06ce\7\u011c\2\2\u06ce"+
		"\u06cf\7\u0172\2\2\u06cf\u06d0\7\u0132\2\2\u06d0\u06d5\5\u00dep\2\u06d1"+
		"\u06d2\7\u015e\2\2\u06d2\u06d4\5\u00dep\2\u06d3\u06d1\3\2\2\2\u06d4\u06d7"+
		"\3\2\2\2\u06d5\u06d3\3\2\2\2\u06d5\u06d6\3\2\2\2\u06d6\u06d8\3\2\2\2\u06d7"+
		"\u06d5\3\2\2\2\u06d8\u06da\7\u0176\2\2\u06d9\u06db\5\u00e0q\2\u06da\u06d9"+
		"\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u00dd\3\2\2\2\u06dc\u06e9\5\u010e\u0088"+
		"\2\u06dd\u06de\7\u0172\2\2\u06de\u06e3\5\u010e\u0088\2\u06df\u06e0\7\u015e"+
		"\2\2\u06e0\u06e2\5\u010e\u0088\2\u06e1\u06df\3\2\2\2\u06e2\u06e5\3\2\2"+
		"\2\u06e3\u06e1\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u06e6\3\2\2\2\u06e5\u06e3"+
		"\3\2\2\2\u06e6\u06e7\7\u0176\2\2\u06e7\u06e9\3\2\2\2\u06e8\u06dc\3\2\2"+
		"\2\u06e8\u06dd\3\2\2\2\u06e9\u00df\3\2\2\2\u06ea\u06ec\6q\5\2\u06eb\u06ed"+
		"\7\17\2\2\u06ec\u06eb\3\2\2\2\u06ec\u06ed\3\2\2\2\u06ed\u06ee\3\2\2\2"+
		"\u06ee\u06f9\5\u0138\u009d\2\u06ef\u06f0\7\u0172\2\2\u06f0\u06f5\7\u017a"+
		"\2\2\u06f1\u06f2\7\u015e\2\2\u06f2\u06f4\7\u017a\2\2\u06f3\u06f1\3\2\2"+
		"\2\u06f4\u06f7\3\2\2\2\u06f5\u06f3\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6\u06f8"+
		"\3\2\2\2\u06f7\u06f5\3\2\2\2\u06f8\u06fa\7\u0176\2\2\u06f9\u06ef\3\2\2"+
		"\2\u06f9\u06fa\3\2\2\2\u06fa\u00e1\3\2\2\2\u06fb\u06fc\5\u0138\u009d\2"+
		"\u06fc\u00e3\3\2\2\2\u06fd\u06fe\7\u013a\2\2\u06fe\u06ff\5\u00f2z\2\u06ff"+
		"\u0700\bs\1\2\u0700\u00e5\3\2\2\2\u0701\u0702\7\u013a\2\2\u0702\u0703"+
		"\bt\1\2\u0703\u00e7\3\2\2\2\u0704\u0705\7\177\2\2\u0705\u0706\7\37\2\2"+
		"\u0706\u0707\5\u010c\u0087\2\u0707\u070e\bu\1\2\u0708\u0709\7\u015e\2"+
		"\2\u0709\u070a\5\u010c\u0087\2\u070a\u070b\bu\1\2\u070b\u070d\3\2\2\2"+
		"\u070c\u0708\3\2\2\2\u070d\u0710\3\2\2\2\u070e\u070c\3\2\2\2\u070e\u070f"+
		"\3\2\2\2\u070f\u00e9\3\2\2\2\u0710\u070e\3\2\2\2\u0711\u0712\7\u0082\2"+
		"\2\u0712\u0713\5\u00f4{\2\u0713\u00eb\3\2\2\2\u0714\u0715\7\u00de\2\2"+
		"\u0715\u0716\5\u00f2z\2\u0716\u00ed\3\2\2\2\u0717\u0718\7\u00cd\2\2\u0718"+
		"\u0719\7\37\2\2\u0719\u071a\5\u010e\u0088\2\u071a\u071b\5\u00f0y\2\u071b"+
		"\u0723\bx\1\2\u071c\u071d\7\u015e\2\2\u071d\u071e\5\u010e\u0088\2\u071e"+
		"\u071f\5\u00f0y\2\u071f\u0720\bx\1\2\u0720\u0722\3\2\2\2\u0721\u071c\3"+
		"\2\2\2\u0722\u0725\3\2\2\2\u0723\u0721\3\2\2\2\u0723\u0724\3\2\2\2\u0724"+
		"\u00ef\3\2\2\2\u0725\u0723\3\2\2\2\u0726\u072a\7\20\2\2\u0727\u072a\7"+
		"T\2\2\u0728\u072a\3\2\2\2\u0729\u0726\3\2\2\2\u0729\u0727\3\2\2\2\u0729"+
		"\u0728\3\2\2\2\u072a\u00f1\3\2\2\2\u072b\u072d\bz\1\2\u072c\u072e\7\u00c2"+
		"\2\2\u072d\u072c\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u072f\3\2\2\2\u072f"+
		"\u0730\7\u0172\2\2\u0730\u0731\5\u00f2z\2\u0731\u0732\7\u0176\2\2\u0732"+
		"\u0735\3\2\2\2\u0733\u0735\5\u00f8}\2\u0734\u072b\3\2\2\2\u0734\u0733"+
		"\3\2\2\2\u0735\u073c\3\2\2\2\u0736\u0737\f\4\2\2\u0737\u0738\5\u0104\u0083"+
		"\2\u0738\u0739\5\u00f2z\5\u0739\u073b\3\2\2\2\u073a\u0736\3\2\2\2\u073b"+
		"\u073e\3\2\2\2\u073c\u073a\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u00f3\3\2"+
		"\2\2\u073e\u073c\3\2\2\2\u073f\u0741\b{\1\2\u0740\u0742\7\u00c2\2\2\u0741"+
		"\u0740\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0744\7\u0172"+
		"\2\2\u0744\u0745\5\u00f4{\2\u0745\u0746\7\u0176\2\2\u0746\u0749\3\2\2"+
		"\2\u0747\u0749\5\u00f6|\2\u0748\u073f\3\2\2\2\u0748\u0747\3\2\2\2\u0749"+
		"\u0750\3\2\2\2\u074a\u074b\f\4\2\2\u074b\u074c\5\u0104\u0083\2\u074c\u074d"+
		"\5\u00f4{\5\u074d\u074f\3\2\2\2\u074e\u074a\3\2\2\2\u074f\u0752\3\2\2"+
		"\2\u0750\u074e\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u00f5\3\2\2\2\u0752\u0750"+
		"\3\2\2\2\u0753\u0756\5\u0102\u0082\2\u0754\u0756\5\u0142\u00a2\2\u0755"+
		"\u0753\3\2\2\2\u0755\u0754\3\2\2\2\u0756\u00f7\3\2\2\2\u0757\u075b\5\u00fa"+
		"~\2\u0758\u075b\5\u0100\u0081\2\u0759\u075b\5\u0142\u00a2\2\u075a\u0757"+
		"\3\2\2\2\u075a\u0758\3\2\2\2\u075a\u0759\3\2\2\2\u075b\u00f9\3\2\2\2\u075c"+
		"\u075d\5\u010e\u0088\2\u075d\u075f\7\u009a\2\2\u075e\u0760\7\u00c2\2\2"+
		"\u075f\u075e\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u0761\3\2\2\2\u0761\u0762"+
		"\t\31\2\2\u0762\u0774\3\2\2\2\u0763\u0764\5\u010e\u0088\2\u0764\u0765"+
		"\7\27\2\2\u0765\u0766\5\u010e\u0088\2\u0766\u0767\7\f\2\2\u0767\u0768"+
		"\5\u010e\u0088\2\u0768\u0774\3\2\2\2\u0769\u076b\7\u00c2\2\2\u076a\u0769"+
		"\3\2\2\2\u076a\u076b\3\2\2\2\u076b\u076c\3\2\2\2\u076c\u076d\7k\2\2\u076d"+
		"\u076e\7\u0172\2\2\u076e\u076f\5\u00aeX\2\u076f\u0770\7\u0176\2\2\u0770"+
		"\u0774\3\2\2\2\u0771\u0774\5\u00fc\177\2\u0772\u0774\5\u00fe\u0080\2\u0773"+
		"\u075c\3\2\2\2\u0773\u0763\3\2\2\2\u0773\u076a\3\2\2\2\u0773\u0771\3\2"+
		"\2\2\u0773\u0772\3\2\2\2\u0774\u00fb\3\2\2\2\u0775\u0777\5\u010e\u0088"+
		"\2\u0776\u0778\7\u00c2\2\2\u0777\u0776\3\2\2\2\u0777\u0778\3\2\2\2\u0778"+
		"\u0779\3\2\2\2\u0779\u077a\7\u008a\2\2\u077a\u0784\7\u0172\2\2\u077b\u0780"+
		"\5\u010e\u0088\2\u077c\u077d\7\u015e\2\2\u077d\u077f\5\u010e\u0088\2\u077e"+
		"\u077c\3\2\2\2\u077f\u0782\3\2\2\2\u0780\u077e\3\2\2\2\u0780\u0781\3\2"+
		"\2\2\u0781\u0785\3\2\2\2\u0782\u0780\3\2\2\2\u0783\u0785\5\u00aeX\2\u0784"+
		"\u077b\3\2\2\2\u0784\u0783\3\2\2\2\u0785\u0786\3\2\2\2\u0786\u0787\7\u0176"+
		"\2\2\u0787\u00fd\3\2\2\2\u0788\u0789\7\u0172\2\2\u0789\u078e\5\u010e\u0088"+
		"\2\u078a\u078b\7\u015e\2\2\u078b\u078d\5\u010e\u0088\2\u078c\u078a\3\2"+
		"\2\2\u078d\u0790\3\2\2\2\u078e\u078c\3\2\2\2\u078e\u078f\3\2\2\2\u078f"+
		"\u0791\3\2\2\2\u0790\u078e\3\2\2\2\u0791\u0793\7\u0176\2\2\u0792\u0794"+
		"\7\u00c2\2\2\u0793\u0792\3\2\2\2\u0793\u0794\3\2\2\2\u0794\u0795\3\2\2"+
		"\2\u0795\u0796\7\u008a\2\2\u0796\u0797\7\u0172\2\2\u0797\u0798\5\u00ae"+
		"X\2\u0798\u0799\7\u0176\2\2\u0799\u00ff\3\2\2\2\u079a\u079b\5\u010e\u0088"+
		"\2\u079b\u079c\5\u010a\u0086\2\u079c\u079d\5\u010e\u0088\2\u079d\u0101"+
		"\3\2\2\2\u079e\u079f\5\u010e\u0088\2\u079f\u07a0\5\u010a\u0086\2\u07a0"+
		"\u07a1\5\u0120\u0091\2\u07a1\u07a2\b\u0082\1\2\u07a2\u07a9\3\2\2\2\u07a3"+
		"\u07a4\5\u0120\u0091\2\u07a4\u07a5\5\u010a\u0086\2\u07a5\u07a6\5\u010e"+
		"\u0088\2\u07a6\u07a7\b\u0082\1\2\u07a7\u07a9\3\2\2\2\u07a8\u079e\3\2\2"+
		"\2\u07a8\u07a3\3\2\2\2\u07a9\u0103\3\2\2\2\u07aa\u07ad\5\u0106\u0084\2"+
		"\u07ab\u07ad\5\u0108\u0085\2\u07ac\u07aa\3\2\2\2\u07ac\u07ab\3\2\2\2\u07ad"+
		"\u0105\3\2\2\2\u07ae\u07af\7\u015c\2\2\u07af\u0107\3\2\2\2\u07b0\u07b1"+
		"\7\u015f\2\2\u07b1\u0109\3\2\2\2\u07b2\u07be\7\u0168\2\2\u07b3\u07be\7"+
		"\u0169\2\2\u07b4\u07be\7\u016a\2\2\u07b5\u07be\7\u016d\2\2\u07b6\u07be"+
		"\7\u016e\2\2\u07b7\u07be\7\u016b\2\2\u07b8\u07be\7\u016c\2\2\u07b9\u07bb"+
		"\7\u00c2\2\2\u07ba\u07b9\3\2\2\2\u07ba\u07bb\3\2\2\2\u07bb\u07bc\3\2\2"+
		"\2\u07bc\u07be\t\32\2\2\u07bd\u07b2\3\2\2\2\u07bd\u07b3\3\2\2\2\u07bd"+
		"\u07b4\3\2\2\2\u07bd\u07b5\3\2\2\2\u07bd\u07b6\3\2\2\2\u07bd\u07b7\3\2"+
		"\2\2\u07bd\u07b8\3\2\2\2\u07bd\u07ba\3\2\2\2\u07be\u010b\3\2\2\2\u07bf"+
		"\u07c0\b\u0087\1\2\u07c0\u07d0\5\u00aeX\2\u07c1\u07c2\7\u0172\2\2\u07c2"+
		"\u07c3\5\u00aeX\2\u07c3\u07c4\7\u0176\2\2\u07c4\u07d0\3\2\2\2\u07c5\u07c6"+
		"\7\u0172\2\2\u07c6\u07c7\5\u010c\u0087\2\u07c7\u07c8\7\u0176\2\2\u07c8"+
		"\u07d0\3\2\2\2\u07c9\u07d0\5\u0112\u008a\2\u07ca\u07d0\5\u0116\u008c\2"+
		"\u07cb\u07d0\5\u011a\u008e\2\u07cc\u07d0\5\u0128\u0095\2\u07cd\u07d0\5"+
		"\u012a\u0096\2\u07ce\u07d0\5\u0110\u0089\2\u07cf\u07bf\3\2\2\2\u07cf\u07c1"+
		"\3\2\2\2\u07cf\u07c5\3\2\2\2\u07cf\u07c9\3\2\2\2\u07cf\u07ca\3\2\2\2\u07cf"+
		"\u07cb\3\2\2\2\u07cf\u07cc\3\2\2\2\u07cf\u07cd\3\2\2\2\u07cf\u07ce\3\2"+
		"\2\2\u07d0\u07e6\3\2\2\2\u07d1\u07d2\f\17\2\2\u07d2\u07d3\7\u016f\2\2"+
		"\u07d3\u07e5\5\u010c\u0087\20\u07d4\u07d5\f\16\2\2\u07d5\u07d6\7\u0160"+
		"\2\2\u07d6\u07e5\5\u010c\u0087\17\u07d7\u07d8\f\r\2\2\u07d8\u07d9\7\u015b"+
		"\2\2\u07d9\u07e5\5\u010c\u0087\16\u07da\u07db\f\f\2\2\u07db\u07dc\7\u0179"+
		"\2\2\u07dc\u07e5\5\u010c\u0087\r\u07dd\u07de\f\21\2\2\u07de\u07e5\5\u0114"+
		"\u008b\2\u07df\u07e0\f\t\2\2\u07e0\u07e1\7\u0173\2\2\u07e1\u07e2\5\u010c"+
		"\u0087\2\u07e2\u07e3\7\u0177\2\2\u07e3\u07e5\3\2\2\2\u07e4\u07d1\3\2\2"+
		"\2\u07e4\u07d4\3\2\2\2\u07e4\u07d7\3\2\2\2\u07e4\u07da\3\2\2\2\u07e4\u07dd"+
		"\3\2\2\2\u07e4\u07df\3\2\2\2\u07e5\u07e8\3\2\2\2\u07e6\u07e4\3\2\2\2\u07e6"+
		"\u07e7\3\2\2\2\u07e7\u010d\3\2\2\2\u07e8\u07e6\3\2\2\2\u07e9\u07ea\b\u0088"+
		"\1\2\u07ea\u07fb\5\u00aeX\2\u07eb\u07ec\7\u0172\2\2\u07ec\u07ed\5\u00ae"+
		"X\2\u07ed\u07ee\7\u0176\2\2\u07ee\u07fb\3\2\2\2\u07ef\u07f0\7\u0172\2"+
		"\2\u07f0\u07f1\5\u010e\u0088\2\u07f1\u07f2\7\u0176\2\2\u07f2\u07fb\3\2"+
		"\2\2\u07f3\u07fb\5\u0112\u008a\2\u07f4\u07fb\5\u0116\u008c\2\u07f5\u07fb"+
		"\5\u011a\u008e\2\u07f6\u07fb\5\u0120\u0091\2\u07f7\u07fb\5\u0128\u0095"+
		"\2\u07f8\u07fb\5\u012a\u0096\2\u07f9\u07fb\5\u0110\u0089\2\u07fa\u07e9"+
		"\3\2\2\2\u07fa\u07eb\3\2\2\2\u07fa\u07ef\3\2\2\2\u07fa\u07f3\3\2\2\2\u07fa"+
		"\u07f4\3\2\2\2\u07fa\u07f5\3\2\2\2\u07fa\u07f6\3\2\2\2\u07fa\u07f7\3\2"+
		"\2\2\u07fa\u07f8\3\2\2\2\u07fa\u07f9\3\2\2\2\u07fb\u0811\3\2\2\2\u07fc"+
		"\u07fd\f\20\2\2\u07fd\u07fe\7\u016f\2\2\u07fe\u0810\5\u010e\u0088\21\u07ff"+
		"\u0800\f\17\2\2\u0800\u0801\7\u0160\2\2\u0801\u0810\5\u010e\u0088\20\u0802"+
		"\u0803\f\16\2\2\u0803\u0804\7\u015b\2\2\u0804\u0810\5\u010e\u0088\17\u0805"+
		"\u0806\f\r\2\2\u0806\u0807\7\u0179\2\2\u0807\u0810\5\u010e\u0088\16\u0808"+
		"\u0809\f\22\2\2\u0809\u0810\5\u0114\u008b\2\u080a\u080b\f\n\2\2\u080b"+
		"\u080c\7\u0173\2\2\u080c\u080d\5\u010e\u0088\2\u080d\u080e\7\u0177\2\2"+
		"\u080e\u0810\3\2\2\2\u080f\u07fc\3\2\2\2\u080f\u07ff\3\2\2\2\u080f\u0802"+
		"\3\2\2\2\u080f\u0805\3\2\2\2\u080f\u0808\3\2\2\2\u080f\u080a\3\2\2\2\u0810"+
		"\u0813\3\2\2\2\u0811\u080f\3\2\2\2\u0811\u0812\3\2\2\2\u0812\u010f\3\2"+
		"\2\2\u0813\u0811\3\2\2\2\u0814\u081d\5\u0132\u009a\2\u0815\u081d\5\u0134"+
		"\u009b\2\u0816\u081d\5\u0142\u00a2\2\u0817\u081d\5\u0138\u009d\2\u0818"+
		"\u081d\5\u013a\u009e\2\u0819\u081d\5\u0140\u00a1\2\u081a\u081d\5\u013e"+
		"\u00a0\2\u081b\u081d\5\u0144\u00a3\2\u081c\u0814\3\2\2\2\u081c\u0815\3"+
		"\2\2\2\u081c\u0816\3\2\2\2\u081c\u0817\3\2\2\2\u081c\u0818\3\2\2\2\u081c"+
		"\u0819\3\2\2\2\u081c\u081a\3\2\2\2\u081c\u081b\3\2\2\2\u081d\u0111\3\2"+
		"\2\2\u081e\u081f\7\u0097\2\2\u081f\u0820\5\u010e\u0088\2\u0820\u0821\5"+
		"\u0114\u008b\2\u0821\u0113\3\2\2\2\u0822\u0823\t\33\2\2\u0823\u0115\3"+
		"\2\2\2\u0824\u0825\5\u0118\u008d\2\u0825\u0826\7\65\2\2\u0826\u082b\5"+
		"\u0118\u008d\2\u0827\u0828\7\65\2\2\u0828\u082a\5\u0118\u008d\2\u0829"+
		"\u0827\3\2\2\2\u082a\u082d\3\2\2\2\u082b\u0829\3\2\2\2\u082b\u082c\3\2"+
		"\2\2\u082c\u0117\3\2\2\2\u082d\u082b\3\2\2\2\u082e\u082f\7\u0172\2\2\u082f"+
		"\u0830\5\u010e\u0088\2\u0830\u0831\7\u0176\2\2\u0831\u0838\3\2\2\2\u0832"+
		"\u0838\5\u011a\u008e\2\u0833\u0838\5\u0120\u0091\2\u0834\u0838\5\u0128"+
		"\u0095\2\u0835\u0838\5\u012a\u0096\2\u0836\u0838\5\u0110\u0089\2\u0837"+
		"\u082e\3\2\2\2\u0837\u0832\3\2\2\2\u0837\u0833\3\2\2\2\u0837\u0834\3\2"+
		"\2\2\u0837\u0835\3\2\2\2\u0837\u0836\3\2\2\2\u0838\u0119\3\2\2\2\u0839"+
		"\u083c\5\u011c\u008f\2\u083a\u083c\5\u011e\u0090\2\u083b\u0839\3\2\2\2"+
		"\u083b\u083a\3\2\2\2\u083c\u011b\3\2\2\2\u083d\u083e\7$\2\2\u083e\u0844"+
		"\5\u010e\u0088\2\u083f\u0840\7\u0139\2\2\u0840\u0841\5\u010e\u0088\2\u0841"+
		"\u0842\7\u0121\2\2\u0842\u0843\5\u010e\u0088\2\u0843\u0845\3\2\2\2\u0844"+
		"\u083f\3\2\2\2\u0845\u0846\3\2\2\2\u0846\u0844\3\2\2\2\u0846\u0847\3\2"+
		"\2\2\u0847\u084a\3\2\2\2\u0848\u0849\7_\2\2\u0849\u084b\5\u010e\u0088"+
		"\2\u084a\u0848\3\2\2\2\u084a\u084b\3\2\2\2\u084b\u084c\3\2\2\2\u084c\u084d"+
		"\7c\2\2\u084d\u011d\3\2\2\2\u084e\u0854\7$\2\2\u084f\u0850\7\u0139\2\2"+
		"\u0850\u0851\5\u00f2z\2\u0851\u0852\7\u0121\2\2\u0852\u0853\5\u010e\u0088"+
		"\2\u0853\u0855\3\2\2\2\u0854\u084f\3\2\2\2\u0855\u0856\3\2\2\2\u0856\u0854"+
		"\3\2\2\2\u0856\u0857\3\2\2\2\u0857\u085a\3\2\2\2\u0858\u0859\7_\2\2\u0859"+
		"\u085b\5\u010e\u0088\2\u085a\u0858\3\2\2\2\u085a\u085b\3\2\2\2\u085b\u085c"+
		"\3\2\2\2\u085c\u085d\7c\2\2\u085d\u011f\3\2\2\2\u085e\u085f\7\24\2\2\u085f"+
		"\u0860\7\u0172\2\2\u0860\u0861\5\u0122\u0092\2\u0861\u0862\5\u010e\u0088"+
		"\2\u0862\u0863\b\u0091\1\2\u0863\u0865\7\u0176\2\2\u0864\u0866\5\u0124"+
		"\u0093\2\u0865\u0864\3\2\2\2\u0865\u0866\3\2\2\2\u0866\u08ee\3\2\2\2\u0867"+
		"\u0868\7:\2\2\u0868\u086f\7\u0172\2\2\u0869\u086a\5\u0122\u0092\2\u086a"+
		"\u086b\5\u010e\u0088\2\u086b\u086c\b\u0091\1\2\u086c\u0870\3\2\2\2\u086d"+
		"\u086e\7\u016f\2\2\u086e\u0870\b\u0091\1\2\u086f\u0869\3\2\2\2\u086f\u086d"+
		"\3\2\2\2\u0870\u0871\3\2\2\2\u0871\u0873\7\u0176\2\2\u0872\u0874\5\u0124"+
		"\u0093\2\u0873\u0872\3\2\2\2\u0873\u0874\3\2\2\2\u0874\u08ee\3\2\2\2\u0875"+
		"\u0876\7;\2\2\u0876\u087c\7\u0172\2\2\u0877\u0878\5\u0122\u0092\2\u0878"+
		"\u0879\5\u010e\u0088\2\u0879\u087a\b\u0091\1\2\u087a\u087d\3\2\2\2\u087b"+
		"\u087d\7\u016f\2\2\u087c\u0877\3\2\2\2\u087c\u087b\3\2\2\2\u087d\u087e"+
		"\3\2\2\2\u087e\u0880\7\u0176\2\2\u087f\u0881\5\u0124\u0093\2\u0880\u087f"+
		"\3\2\2\2\u0880\u0881\3\2\2\2\u0881\u08ee\3\2\2\2\u0882\u0883\7\u0144\2"+
		"\2\u0883\u0884\7\u0172\2\2\u0884\u0885\7\u0176\2\2\u0885\u08ee\5\u0124"+
		"\u0093\2\u0886\u0887\7\u0148\2\2\u0887\u0888\7\u0172\2\2\u0888\u0889\7"+
		"\u0176\2\2\u0889\u08ee\5\u0124\u0093\2\u088a\u088b\7\u0149\2\2\u088b\u088c"+
		"\7\u0172\2\2\u088c\u088d\5\u010e\u0088\2\u088d\u088e\7\u0176\2\2\u088e"+
		"\u088f\5\u0124\u0093\2\u088f\u08ee\3\2\2\2\u0890\u0891\7\u014a\2\2\u0891"+
		"\u0892\7\u0172\2\2\u0892\u0899\5\u010e\u0088\2\u0893\u0894\7\u015e\2\2"+
		"\u0894\u0897\5\u010e\u0088\2\u0895\u0896\7\u015e\2\2\u0896\u0898\5\u010e"+
		"\u0088\2\u0897\u0895\3\2\2\2\u0897\u0898\3\2\2\2\u0898\u089a\3\2\2\2\u0899"+
		"\u0893\3\2\2\2\u0899\u089a\3\2\2\2\u089a\u089b\3\2\2\2\u089b\u089c\7\u0176"+
		"\2\2\u089c\u089d\5\u0124\u0093\2\u089d\u08ee\3\2\2\2\u089e\u089f\7\u014b"+
		"\2\2\u089f\u08a0\7\u0172\2\2\u08a0\u08a1\5\u010e\u0088\2\u08a1\u08a2\7"+
		"\u0176\2\2\u08a2\u08a3\5\u0124\u0093\2\u08a3\u08ee\3\2\2\2\u08a4\u08a5"+
		"\7\u014c\2\2\u08a5\u08a6\7\u0172\2\2\u08a6\u08ad\5\u010e\u0088\2\u08a7"+
		"\u08a8\7\u015e\2\2\u08a8\u08ab\5\u010e\u0088\2\u08a9\u08aa\7\u015e\2\2"+
		"\u08aa\u08ac\5\u010e\u0088\2\u08ab\u08a9\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac"+
		"\u08ae\3\2\2\2\u08ad\u08a7\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae\u08af\3\2"+
		"\2\2\u08af\u08b0\7\u0176\2\2\u08b0\u08b1\5\u0124\u0093\2\u08b1\u08ee\3"+
		"\2\2\2\u08b2\u08b3\7\u00b2\2\2\u08b3\u08b4\7\u0172\2\2\u08b4\u08b5\5\u0122"+
		"\u0092\2\u08b5\u08b6\5\u010e\u0088\2\u08b6\u08b7\b\u0091\1\2\u08b7\u08b9"+
		"\7\u0176\2\2\u08b8\u08ba\5\u0124\u0093\2\u08b9\u08b8\3\2\2\2\u08b9\u08ba"+
		"\3\2\2\2\u08ba\u08ee\3\2\2\2\u08bb\u08bc\7\u00b8\2\2\u08bc\u08bd\7\u0172"+
		"\2\2\u08bd\u08be\5\u0122\u0092\2\u08be\u08bf\5\u010e\u0088\2\u08bf\u08c0"+
		"\b\u0091\1\2\u08c0\u08c2\7\u0176\2\2\u08c1\u08c3\5\u0124\u0093\2\u08c2"+
		"\u08c1\3\2\2\2\u08c2\u08c3\3\2\2\2\u08c3\u08ee\3\2\2\2\u08c4\u08c5\7\u0155"+
		"\2\2\u08c5\u08c6\7\u0172\2\2\u08c6\u08c7\7\u0176\2\2\u08c7\u08ee\5\u0124"+
		"\u0093\2\u08c8\u08c9\7\u0156\2\2\u08c9\u08ca\7\u0172\2\2\u08ca\u08cb\7"+
		"\u0176\2\2\u08cb\u08ee\5\u0124\u0093\2\u08cc\u08cd\7\u0157\2\2\u08cd\u08ce"+
		"\7\u0172\2\2\u08ce\u08cf\5\u0122\u0092\2\u08cf\u08d0\5\u010e\u0088\2\u08d0"+
		"\u08d1\b\u0091\1\2\u08d1\u08d3\7\u0176\2\2\u08d2\u08d4\5\u0124\u0093\2"+
		"\u08d3\u08d2\3\2\2\2\u08d3\u08d4\3\2\2\2\u08d4\u08ee\3\2\2\2\u08d5\u08d6"+
		"\7\u0119\2\2\u08d6\u08d7\7\u0172\2\2\u08d7\u08d8\5\u0122\u0092\2\u08d8"+
		"\u08d9\5\u010e\u0088\2\u08d9\u08da\b\u0091\1\2\u08da\u08dc\7\u0176\2\2"+
		"\u08db\u08dd\5\u0124\u0093\2\u08dc\u08db\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd"+
		"\u08ee\3\2\2\2\u08de\u08df\7\u0159\2\2\u08df\u08e0\7\u0172\2\2\u08e0\u08e1"+
		"\5\u0122\u0092\2\u08e1\u08e2\5\u010e\u0088\2\u08e2\u08e3\b\u0091\1\2\u08e3"+
		"\u08e5\7\u0176\2\2\u08e4\u08e6\5\u0124\u0093\2\u08e5\u08e4\3\2\2\2\u08e5"+
		"\u08e6\3\2\2\2\u08e6\u08ee\3\2\2\2\u08e7\u08e8\7\u0142\2\2\u08e8\u08e9"+
		"\7\u0172\2\2\u08e9\u08ea\5\u010e\u0088\2\u08ea\u08eb\7\u0176\2\2\u08eb"+
		"\u08ec\b\u0091\1\2\u08ec\u08ee\3\2\2\2\u08ed\u085e\3\2\2\2\u08ed\u0867"+
		"\3\2\2\2\u08ed\u0875\3\2\2\2\u08ed\u0882\3\2\2\2\u08ed\u0886\3\2\2\2\u08ed"+
		"\u088a\3\2\2\2\u08ed\u0890\3\2\2\2\u08ed\u089e\3\2\2\2\u08ed\u08a4\3\2"+
		"\2\2\u08ed\u08b2\3\2\2\2\u08ed\u08bb\3\2\2\2\u08ed\u08c4\3\2\2\2\u08ed"+
		"\u08c8\3\2\2\2\u08ed\u08cc\3\2\2\2\u08ed\u08d5\3\2\2\2\u08ed\u08de\3\2"+
		"\2\2\u08ed\u08e7\3\2\2\2\u08ee\u0121\3\2\2\2\u08ef\u08f3\7\t\2\2\u08f0"+
		"\u08f3\7Y\2\2\u08f1\u08f3\3\2\2\2\u08f2\u08ef\3\2\2\2\u08f2\u08f0\3\2"+
		"\2\2\u08f2\u08f1\3\2\2\2\u08f3\u0123\3\2\2\2\u08f4\u08f5\7\u00d0\2\2\u08f5"+
		"\u08f7\7\u0172\2\2\u08f6\u08f8\5\u0126\u0094\2\u08f7\u08f6\3\2\2\2\u08f7"+
		"\u08f8\3\2\2\2\u08f8\u08fa\3\2\2\2\u08f9\u08fb\5\u00eex\2\u08fa\u08f9"+
		"\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u08fc\3\2\2\2\u08fc\u08fd\7\u0176\2"+
		"\2\u08fd\u0125\3\2\2\2\u08fe\u08ff\7\u00d4\2\2\u08ff\u0900\7\37\2\2\u0900"+
		"\u0905\5\u010e\u0088\2\u0901\u0902\7\u015e\2\2\u0902\u0904\5\u010e\u0088"+
		"\2\u0903\u0901\3\2\2\2\u0904\u0907\3\2\2\2\u0905\u0903\3\2\2\2\u0905\u0906"+
		"\3\2\2\2\u0906\u0127\3\2\2\2\u0907\u0905\3\2\2\2\u0908\u09d1\7\u0143\2"+
		"\2\u0909\u090a\7&\2\2\u090a\u090b\7\u0172\2\2\u090b\u090c\5\u010e\u0088"+
		"\2\u090c\u090d\7\17\2\2\u090d\u090f\5l\67\2\u090e\u0910\5n8\2\u090f\u090e"+
		"\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u0911\3\2\2\2\u0911\u0912\7\u0176\2"+
		"\2\u0912\u09d1\3\2\2\2\u0913\u0914\7:\2\2\u0914\u0917\7\u0172\2\2\u0915"+
		"\u0918\5\u010e\u0088\2\u0916\u0918\7\u016f\2\2\u0917\u0915\3\2\2\2\u0917"+
		"\u0916\3\2\2\2\u0918\u0919\3\2\2\2\u0919\u09d1\7\u0176\2\2\u091a\u09d1"+
		"\7\u0145\2\2\u091b\u091c\7@\2\2\u091c\u09d1\7E\2\2\u091d\u0921\7\u0146"+
		"\2\2\u091e\u091f\7@\2\2\u091f\u0921\7\u0122\2\2\u0920\u091d\3\2\2\2\u0920"+
		"\u091e\3\2\2\2\u0921\u0926\3\2\2\2\u0922\u0923\7\u0172\2\2\u0923\u0924"+
		"\5\u010e\u0088\2\u0924\u0925\7\u0176\2\2\u0925\u0927\3\2\2\2\u0926\u0922"+
		"\3\2\2\2\u0926\u0927\3\2\2\2\u0927\u09d1\3\2\2\2\u0928\u09d1\7\u0147\2"+
		"\2\u0929\u092a\7@\2\2\u092a\u09d1\7\u015a\2\2\u092b\u092c\7\u014d\2\2"+
		"\u092c\u092d\7\u0172\2\2\u092d\u093a\5\u010e\u0088\2\u092e\u092f\7\u015e"+
		"\2\2\u092f\u0937\5\u010e\u0088\2\u0930\u0931\7\u015e\2\2\u0931\u0932\5"+
		"\u010e\u0088\2\u0932\u0933\7\u0167\2\2\u0933\u0934\5\u010e\u0088\2\u0934"+
		"\u0936\3\2\2\2\u0935\u0930\3\2\2\2\u0936\u0939\3\2\2\2\u0937\u0935\3\2"+
		"\2\2\u0937\u0938\3\2\2\2\u0938\u093b\3\2\2\2\u0939\u0937\3\2\2\2\u093a"+
		"\u092e\3\2\2\2\u093a\u093b\3\2\2\2\u093b\u093c\3\2\2\2\u093c\u093d\7\u0176"+
		"\2\2\u093d\u09d1\3\2\2\2\u093e\u093f\7\u014e";
	private static final String _serializedATNSegment1 =
		"\2\2\u093f\u0940\7\u0172\2\2\u0940\u094d\5\u010e\u0088\2\u0941\u0942\7"+
		"\u015e\2\2\u0942\u094a\5\u010e\u0088\2\u0943\u0944\7\u015e\2\2\u0944\u0945"+
		"\5\u010e\u0088\2\u0945\u0946\7\u0167\2\2\u0946\u0947\5\u010e\u0088\2\u0947"+
		"\u0949\3\2\2\2\u0948\u0943\3\2\2\2\u0949\u094c\3\2\2\2\u094a\u0948\3\2"+
		"\2\2\u094a\u094b\3\2\2\2\u094b\u094e\3\2\2\2\u094c\u094a\3\2\2\2\u094d"+
		"\u0941\3\2\2\2\u094d\u094e\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0950\7\u0176"+
		"\2\2\u0950\u09d1\3\2\2\2\u0951\u0952\7\u014f\2\2\u0952\u0953\7\u0172\2"+
		"\2\u0953\u0960\5\u010e\u0088\2\u0954\u0955\7\u015e\2\2\u0955\u095d\5\u010e"+
		"\u0088\2\u0956\u0957\7\u015e\2\2\u0957\u0958\5\u010e\u0088\2\u0958\u0959"+
		"\7\u0167\2\2\u0959\u095a\5\u010e\u0088\2\u095a\u095c\3\2\2\2\u095b\u0956"+
		"\3\2\2\2\u095c\u095f\3\2\2\2\u095d\u095b\3\2\2\2\u095d\u095e\3\2\2\2\u095e"+
		"\u0961\3\2\2\2\u095f\u095d\3\2\2\2\u0960\u0954\3\2\2\2\u0960\u0961\3\2"+
		"\2\2\u0961\u0962\3\2\2\2\u0962\u0963\7\u0176\2\2\u0963\u09d1\3\2\2\2\u0964"+
		"\u0965\7\u0150\2\2\u0965\u0966\7\u0172\2\2\u0966\u0973\5\u010e\u0088\2"+
		"\u0967\u0968\7\u015e\2\2\u0968\u0970\5\u010e\u0088\2\u0969\u096a\7\u015e"+
		"\2\2\u096a\u096b\5\u010e\u0088\2\u096b\u096c\7\u0167\2\2\u096c\u096d\5"+
		"\u010e\u0088\2\u096d\u096f\3\2\2\2\u096e\u0969\3\2\2\2\u096f\u0972\3\2"+
		"\2\2\u0970\u096e\3\2\2\2\u0970\u0971\3\2\2\2\u0971\u0974\3\2\2\2\u0972"+
		"\u0970\3\2\2\2\u0973\u0967\3\2\2\2\u0973\u0974\3\2\2\2\u0974\u0975\3\2"+
		"\2\2\u0975\u0976\7\u0176\2\2\u0976\u09d1\3\2\2\2\u0977\u0978\7\u0151\2"+
		"\2\u0978\u0979\7\u0172\2\2\u0979\u0986\5\u010e\u0088\2\u097a\u097b\7\u015e"+
		"\2\2\u097b\u0983\5\u010e\u0088\2\u097c\u097d\7\u015e\2\2\u097d\u097e\5"+
		"\u010e\u0088\2\u097e\u097f\7\u0167\2\2\u097f\u0980\5\u010e\u0088\2\u0980"+
		"\u0982\3\2\2\2\u0981\u097c\3\2\2\2\u0982\u0985\3\2\2\2\u0983\u0981\3\2"+
		"\2\2\u0983\u0984\3\2\2\2\u0984\u0987\3\2\2\2\u0985\u0983\3\2\2\2\u0986"+
		"\u097a\3\2\2\2\u0986\u0987\3\2\2\2\u0987\u0988\3\2\2\2\u0988\u0989\7\u0176"+
		"\2\2\u0989\u09d1\3\2\2\2\u098a\u098b\7\u0152\2\2\u098b\u098c\7\u0172\2"+
		"\2\u098c\u0999\5\u010e\u0088\2\u098d\u098e\7\u015e\2\2\u098e\u0996\5\u010e"+
		"\u0088\2\u098f\u0990\7\u015e\2\2\u0990\u0991\5\u010e\u0088\2\u0991\u0992"+
		"\7\u0167\2\2\u0992\u0993\5\u010e\u0088\2\u0993\u0995\3\2\2\2\u0994\u098f"+
		"\3\2\2\2\u0995\u0998\3\2\2\2\u0996\u0994\3\2\2\2\u0996\u0997\3\2\2\2\u0997"+
		"\u099a\3\2\2\2\u0998\u0996\3\2\2\2\u0999\u098d\3\2\2\2\u0999\u099a\3\2"+
		"\2\2\u099a\u099b\3\2\2\2\u099b\u099c\7\u0176\2\2\u099c\u09d1\3\2\2\2\u099d"+
		"\u099e\7\u0153\2\2\u099e\u099f\7\u0172\2\2\u099f\u09a7\5\u010e\u0088\2"+
		"\u09a0\u09a1\7\u015e\2\2\u09a1\u09a2\5\u010e\u0088\2\u09a2\u09a3\7\u0167"+
		"\2\2\u09a3\u09a4\5\u010e\u0088\2\u09a4\u09a6\3\2\2\2\u09a5\u09a0\3\2\2"+
		"\2\u09a6\u09a9\3\2\2\2\u09a7\u09a5\3\2\2\2\u09a7\u09a8\3\2\2\2\u09a8\u09aa"+
		"\3\2\2\2\u09a9\u09a7\3\2\2\2\u09aa\u09ab\7\u0176\2\2\u09ab\u09d1\3\2\2"+
		"\2\u09ac\u09ad\7\u0154\2\2\u09ad\u09ae\7\u0172\2\2\u09ae\u09b4\5\u010e"+
		"\u0088\2\u09af\u09b0\7\u015e\2\2\u09b0\u09b1\5\u010e\u0088\2\u09b1\u09b2"+
		"\7\u0167\2\2\u09b2\u09b3\5\u010e\u0088\2\u09b3\u09b5\3\2\2\2\u09b4\u09af"+
		"\3\2\2\2\u09b5\u09b6\3\2\2\2\u09b6\u09b4\3\2\2\2\u09b6\u09b7\3\2\2\2\u09b7"+
		"\u09ba\3\2\2\2\u09b8\u09b9\7\u015e\2\2\u09b9\u09bb\5\u010e\u0088\2\u09ba"+
		"\u09b8\3\2\2\2\u09ba\u09bb\3\2\2\2\u09bb\u09bc\3\2\2\2\u09bc\u09bd\7\u0176"+
		"\2\2\u09bd\u09d1\3\2\2\2\u09be\u09bf\7\u00f9\2\2\u09bf\u09c0\7\u0172\2"+
		"\2\u09c0\u09c1\5\u010e\u0088\2\u09c1\u09c2\7\u0176\2\2\u09c2\u09d1\3\2"+
		"\2\2\u09c3\u09c4\7\u0118\2\2\u09c4\u09c5\7\u0172\2\2\u09c5\u09c6\5\u010e"+
		"\u0088\2\u09c6\u09c7\7x\2\2\u09c7\u09ca\5\u010e\u0088\2\u09c8\u09c9\7"+
		"t\2\2\u09c9\u09cb\5\u010e\u0088\2\u09ca\u09c8\3\2\2\2\u09ca\u09cb\3\2"+
		"\2\2\u09cb\u09cc\3\2\2\2\u09cc\u09cd\7\u0176\2\2\u09cd\u09d1\3\2\2\2\u09ce"+
		"\u09d1\7\u0158\2\2\u09cf\u09d1\7\u015a\2\2\u09d0\u0908\3\2\2\2\u09d0\u0909"+
		"\3\2\2\2\u09d0\u0913\3\2\2\2\u09d0\u091a\3\2\2\2\u09d0\u091b\3\2\2\2\u09d0"+
		"\u0920\3\2\2\2\u09d0\u0928\3\2\2\2\u09d0\u0929\3\2\2\2\u09d0\u092b\3\2"+
		"\2\2\u09d0\u093e\3\2\2\2\u09d0\u0951\3\2\2\2\u09d0\u0964\3\2\2\2\u09d0"+
		"\u0977\3\2\2\2\u09d0\u098a\3\2\2\2\u09d0\u099d\3\2\2\2\u09d0\u09ac\3\2"+
		"\2\2\u09d0\u09be\3\2\2\2\u09d0\u09c3\3\2\2\2\u09d0\u09ce\3\2\2\2\u09d0"+
		"\u09cf\3\2\2\2\u09d1\u0129\3\2\2\2\u09d2\u09d3\5\u0138\u009d\2\u09d3\u09d5"+
		"\7\u0172\2\2\u09d4\u09d6\5\u012c\u0097\2\u09d5\u09d4\3\2\2\2\u09d5\u09d6"+
		"\3\2\2\2\u09d6\u09d7\3\2\2\2\u09d7\u09d8\7\u0176\2\2\u09d8\u012b\3\2\2"+
		"\2\u09d9\u09de\5\u012e\u0098\2\u09da\u09db\7\u015e\2\2\u09db\u09dd\5\u012e"+
		"\u0098\2\u09dc\u09da\3\2\2\2\u09dd\u09e0\3\2\2\2\u09de\u09dc\3\2\2\2\u09de"+
		"\u09df\3\2\2\2\u09df\u012d\3\2\2\2\u09e0\u09de\3\2\2\2\u09e1\u09e7\6\u0098"+
		"\24\2\u09e2\u09e3\5\u0138\u009d\2\u09e3\u09e5\7\u0167\2\2\u09e4\u09e6"+
		"\7\u016b\2\2\u09e5\u09e4\3\2\2\2\u09e5\u09e6\3\2\2\2\u09e6\u09e8\3\2\2"+
		"\2\u09e7\u09e2\3\2\2\2\u09e7\u09e8\3\2\2\2\u09e8\u09e9\3\2\2\2\u09e9\u09ea"+
		"\5\u010e\u0088\2\u09ea\u012f\3\2\2\2\u09eb\u09ef\7\u0172\2\2\u09ec\u09ee"+
		"\n\34\2\2\u09ed\u09ec\3\2\2\2\u09ee\u09f1\3\2\2\2\u09ef\u09ed\3\2\2\2"+
		"\u09ef\u09f0\3\2\2\2\u09f0\u09f2\3\2\2\2\u09f1\u09ef\3\2\2\2\u09f2\u09f3"+
		"\b\u0099\1\2\u09f3\u0131\3\2\2\2\u09f4\u09f5\7E\2\2\u09f5\u09f6\5\u013a"+
		"\u009e\2\u09f6\u0133\3\2\2\2\u09f7\u09f8\7\u0122\2\2\u09f8\u09f9\5\u013a"+
		"\u009e\2\u09f9\u0135\3\2\2\2\u09fa\u09fb\t\35\2\2\u09fb\u0137\3\2\2\2"+
		"\u09fc\u0a01\7\u017a\2\2\u09fd\u09fe\7\6\2\2\u09fe\u0a00\7\u017a\2\2\u09ff"+
		"\u09fd\3\2\2\2\u0a00\u0a03\3\2\2\2\u0a01\u09ff\3\2\2\2\u0a01\u0a02\3\2"+
		"\2\2\u0a02\u0139\3\2\2\2\u0a03\u0a01\3\2\2\2\u0a04\u0a07\7\u017b\2\2\u0a05"+
		"\u0a07\7\u017d\2\2\u0a06\u0a04\3\2\2\2\u0a06\u0a05\3\2\2\2\u0a07\u013b"+
		"\3\2\2\2\u0a08\u0a09\7\u017c\2\2\u0a09\u0a0d\b\u009f\1\2\u0a0a\u0a0b\7"+
		"\u017e\2\2\u0a0b\u0a0d\b\u009f\1\2\u0a0c\u0a08\3\2\2\2\u0a0c\u0a0a\3\2"+
		"\2\2\u0a0d\u013d\3\2\2\2\u0a0e\u0a10\t\36\2\2\u0a0f\u0a0e\3\2\2\2\u0a0f"+
		"\u0a10\3\2\2\2\u0a10\u0a11\3\2\2\2\u0a11\u0a12\7\u017f\2\2\u0a12\u013f"+
		"\3\2\2\2\u0a13\u0a15\t\36\2\2\u0a14\u0a13\3\2\2\2\u0a14\u0a15\3\2\2\2"+
		"\u0a15\u0a16\3\2\2\2\u0a16\u0a17\7\u0180\2\2\u0a17\u0141\3\2\2\2\u0a18"+
		"\u0a19\t\37\2\2\u0a19\u0143\3\2\2\2\u0a1a\u0a1b\7\u00c4\2\2\u0a1b\u0145"+
		"\3\2\2\2\u0a1c\u0a1d\t \2\2\u0a1d\u0147\3\2\2\2\u0a1e\u0a1f\7\u0186\2"+
		"\2\u0a1f\u0a20\b\u00a5\1\2\u0a20\u0149\3\2\2\2\u0130\u014d\u0154\u0157"+
		"\u015b\u0167\u016a\u0171\u017d\u017f\u0188\u018b\u018d\u01a0\u01a6\u01bb"+
		"\u01c6\u01ce\u01d4\u01d8\u01dc\u01e6\u01ec\u01f4\u01fb\u0206\u020b\u0214"+
		"\u0222\u022d\u0239\u023e\u0241\u024d\u0257\u025f\u026c\u0276\u0280\u0284"+
		"\u0288\u028d\u0291\u0296\u029a\u029e\u02a5\u02ae\u02b4\u02b8\u02c1\u02c4"+
		"\u02c9\u02ce\u02d5\u02dc\u02df\u02e6\u02eb\u02f0\u02f7\u02fc\u02ff\u0305"+
		"\u0313\u031d\u0323\u0328\u032d\u0332\u0336\u033b\u0345\u0351\u0358\u035b"+
		"\u0367\u036e\u0375\u0381\u038e\u0390\u0395\u0398\u03a7\u03ad\u03b8\u03bb"+
		"\u03c5\u03cc\u03d2\u03e0\u03e4\u03e9\u03ed\u03f2\u03f5\u03fa\u03fd\u040b"+
		"\u042b\u042d\u0432\u0436\u043b\u0442\u0445\u0448\u044d\u0451\u0453\u045a"+
		"\u0460\u0467\u046d\u0478\u0481\u0484\u0488\u048b\u048e\u0494\u049e\u04a9"+
		"\u04ac\u04b3\u04b8\u04bd\u04c1\u04c9\u04cd\u04d2\u04d6\u04d8\u04dc\u04e4"+
		"\u04ec\u04ef\u04f4\u04ff\u0508\u050c\u0517\u051b\u0526\u052c\u0546\u0552"+
		"\u0559\u0561\u0569\u0570\u0576\u057d\u0587\u058b\u058f\u059c\u05a1\u05a8"+
		"\u05ac\u05b2\u05bc\u05c3\u05ce\u05d5\u05df\u05e6\u05ed\u05f0\u05fa\u05ff"+
		"\u060c\u0617\u061f\u0623\u0627\u062b\u062d\u0632\u0636\u0639\u063d\u0640"+
		"\u0645\u0648\u064b\u064f\u0652\u0657\u065a\u065d\u0664\u066a\u0673\u0677"+
		"\u067a\u0680\u0687\u068b\u0695\u069d\u06a4\u06aa\u06ae\u06c0\u06c3\u06c8"+
		"\u06cb\u06d5\u06da\u06e3\u06e8\u06ec\u06f5\u06f9\u070e\u0723\u0729\u072d"+
		"\u0734\u073c\u0741\u0748\u0750\u0755\u075a\u075f\u076a\u0773\u0777\u0780"+
		"\u0784\u078e\u0793\u07a8\u07ac\u07ba\u07bd\u07cf\u07e4\u07e6\u07fa\u080f"+
		"\u0811\u081c\u082b\u0837\u083b\u0846\u084a\u0856\u085a\u0865\u086f\u0873"+
		"\u087c\u0880\u0897\u0899\u08ab\u08ad\u08b9\u08c2\u08d3\u08dc\u08e5\u08ed"+
		"\u08f2\u08f7\u08fa\u0905\u090f\u0917\u0920\u0926\u0937\u093a\u094a\u094d"+
		"\u095d\u0960\u0970\u0973\u0983\u0986\u0996\u0999\u09a7\u09b6\u09ba\u09ca"+
		"\u09d0\u09d5\u09de\u09e5\u09e7\u09ef\u0a01\u0a06\u0a0c\u0a0f\u0a14";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}