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
		T_ACTIVITY_COUNT=320, T_CUME_DIST=321, T_CURRENT_DATE=322, T_CURRENT_TIMESTAMP=323, 
		T_CURRENT_USER=324, T_DENSE_RANK=325, T_FIRST_VALUE=326, T_LAG=327, T_LAST_VALUE=328, 
		T_LEAD=329, T_MAX_PART_STRING=330, T_MIN_PART_STRING=331, T_MAX_PART_INT=332, 
		T_MIN_PART_INT=333, T_MAX_PART_DATE=334, T_MIN_PART_DATE=335, T_PART_COUNT=336, 
		T_PART_LOC=337, T_RANK=338, T_ROW_NUMBER=339, T_STDEV=340, T_SYSDATE=341, 
		T_VARIANCE=342, T_USER=343, T_ADD=344, T_AND_AND=345, T_COLON=346, T_COMMA=347, 
		T_PIPE=348, T_DIV=349, T_DOT2=350, T_PLUS_EQUAL=351, T_MINUS_EQUAL=352, 
		T_TIMES_EQUAL=353, T_DIVIDE_EQUAL=354, T_MOD_EQUAL=355, T_EQUAL=356, T_EQUAL2=357, 
		T_NOTEQUAL=358, T_NOTEQUAL2=359, T_GREATER=360, T_GREATEREQUAL=361, T_LESS=362, 
		T_LESSEQUAL=363, T_MUL=364, T_MINUS_MINUS=365, T_OPEN_B=366, T_OPEN_P=367, 
		T_OPEN_SB=368, T_PLUS_PLUS=369, T_CLOSE_B=370, T_CLOSE_P=371, T_CLOSE_SB=372, 
		T_SEMICOLON=373, T_SUB=374, L_ID=375, L_S_STRING=376, L_S_STRING_MISSING_RIGHT=377, 
		L_D_STRING=378, L_D_STRING_MISSING_RIGHT=379, L_INT=380, L_DEC=381, L_WS=382, 
		L_M_COMMENT=383, L_S_COMMENT=384, L_FILE=385, L_LABEL=386, L_INVALID_TOKEN=387;
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
		RULE_bool_expr = 120, RULE_bool_expr_atom = 121, RULE_bool_expr_unary = 122, 
		RULE_bool_expr_single_in = 123, RULE_bool_expr_multi_in = 124, RULE_bool_expr_binary = 125, 
		RULE_bool_expr_logical_operator = 126, RULE_bool_and = 127, RULE_bool_or = 128, 
		RULE_bool_expr_binary_operator = 129, RULE_expr = 130, RULE_expr_atom = 131, 
		RULE_expr_interval = 132, RULE_interval_item = 133, RULE_expr_concat = 134, 
		RULE_expr_concat_item = 135, RULE_expr_case = 136, RULE_expr_case_simple = 137, 
		RULE_expr_case_searched = 138, RULE_expr_agg_window_func = 139, RULE_expr_func_all_distinct = 140, 
		RULE_expr_func_over_clause = 141, RULE_expr_func_partition_by_clause = 142, 
		RULE_expr_spec_func = 143, RULE_expr_func = 144, RULE_expr_func_params = 145, 
		RULE_func_param = 146, RULE_error_missing_right_p = 147, RULE_date_literal = 148, 
		RULE_timestamp_literal = 149, RULE_assignment_operator = 150, RULE_ident = 151, 
		RULE_string = 152, RULE_error_string = 153, RULE_int_number = 154, RULE_dec_number = 155, 
		RULE_bool_literal = 156, RULE_null_const = 157, RULE_non_reserved_words = 158, 
		RULE_error_invalid_token = 159;
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
			"order_by_clause", "sort_type", "bool_expr", "bool_expr_atom", "bool_expr_unary", 
			"bool_expr_single_in", "bool_expr_multi_in", "bool_expr_binary", "bool_expr_logical_operator", 
			"bool_and", "bool_or", "bool_expr_binary_operator", "expr", "expr_atom", 
			"expr_interval", "interval_item", "expr_concat", "expr_concat_item", 
			"expr_case", "expr_case_simple", "expr_case_searched", "expr_agg_window_func", 
			"expr_func_all_distinct", "expr_func_over_clause", "expr_func_partition_by_clause", 
			"expr_spec_func", "expr_func", "expr_func_params", "func_param", "error_missing_right_p", 
			"date_literal", "timestamp_literal", "assignment_operator", "ident", 
			"string", "error_string", "int_number", "dec_number", "bool_literal", 
			"null_const", "non_reserved_words", "error_invalid_token"
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
			null, null, null, null, null, null, null, null, null, "'+'", "'&&'", 
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
			"T_WORK", "T_XACT_ABORT", "T_XML", "T_YES", "T_ACTIVITY_COUNT", "T_CUME_DIST", 
			"T_CURRENT_DATE", "T_CURRENT_TIMESTAMP", "T_CURRENT_USER", "T_DENSE_RANK", 
			"T_FIRST_VALUE", "T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", 
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
			setState(321); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(320);
				c_function();
				}
				}
				setState(323); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (T_BIGINT - 22)) | (1L << (T_BINARY_DOUBLE - 22)) | (1L << (T_BINARY_FLOAT - 22)) | (1L << (T_BINARY_INTEGER - 22)) | (1L << (T_BIT - 22)) | (1L << (T_CHAR - 22)) | (1L << (T_DATE - 22)) | (1L << (T_DATETIME - 22)) | (1L << (T_DEC - 22)) | (1L << (T_DECIMAL - 22)))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (T_DOUBLE - 90)) | (1L << (T_FLOAT - 90)) | (1L << (T_INT - 90)) | (1L << (T_INT2 - 90)) | (1L << (T_INT4 - 90)) | (1L << (T_INT8 - 90)) | (1L << (T_INTEGER - 90)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (T_NCHAR - 184)) | (1L << (T_NVARCHAR - 184)) | (1L << (T_NUMERIC - 184)) | (1L << (T_NUMBER - 184)) | (1L << (T_PLS_INTEGER - 184)) | (1L << (T_REAL - 184)) | (1L << (T_RESULT_SET_LOCATOR - 184)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (T_SIMPLE_DOUBLE - 261)) | (1L << (T_SIMPLE_FLOAT - 261)) | (1L << (T_SIMPLE_INTEGER - 261)) | (1L << (T_SMALLDATETIME - 261)) | (1L << (T_SMALLINT - 261)) | (1L << (T_STRING - 261)) | (1L << (T_SYS_REFCURSOR - 261)) | (1L << (T_TIMESTAMP - 261)) | (1L << (T_TINYINT - 261)) | (1L << (T_VARCHAR - 261)) | (1L << (T_VARCHAR2 - 261)) | (1L << (T_VOID - 261)) | (1L << (T_XML - 261)))) != 0) || _la==L_ID );
			setState(325);
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
			setState(335); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(330);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(327);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(328);
						stmt();
						}
						break;
					case 3:
						{
						setState(329);
						error_stmt();
						}
						break;
					}
					setState(333);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(332);
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
				setState(337); 
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
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FROM:
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				error_subselect();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				error_missing_right_p();
				}
				break;
			case T_BEGIN:
			case T_DECLARE:
				enterOuterAlt(_localctx, 3);
				{
				setState(341);
				error_missing_end();
				}
				break;
			case L_S_STRING_MISSING_RIGHT:
			case L_D_STRING_MISSING_RIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(342);
				error_string();
				}
				break;
			case T_WHERE:
				enterOuterAlt(_localctx, 5);
				{
				setState(343);
				error_missing_bool_expr();
				}
				break;
			case T__3:
			case T_IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(344);
				error_if_stmt();
				}
				break;
			case T_CREATE:
			case T_PROC:
			case T_PROCEDURE:
			case T_REPLACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(345);
				error_create_stmt();
				}
				break;
			case T_FOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(346);
				error_for_range_stmt();
				}
				break;
			case L_ID:
				enterOuterAlt(_localctx, 9);
				{
				setState(347);
				error_delcare_stmt();
				}
				break;
			case L_INVALID_TOKEN:
				enterOuterAlt(_localctx, 10);
				{
				setState(348);
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
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(351);
				declare_block();
				}
			}

			setState(354);
			match(T_BEGIN);
			setState(355);
			block();
			setState(356);
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
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(358);
				declare_block();
				}
			}

			setState(361);
			match(T_BEGIN);
			setState(362);
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
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(T_BEGIN);
				setState(366);
				block();
				setState(367);
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
				setState(369);
				stmt();
				setState(371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(370);
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
			setState(375);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(376);
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
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(379);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(382); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(384);
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
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				assignment_c_stmt();
				setState(390);
				match(T_SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				break_stmt();
				setState(393);
				match(T_SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				if_c_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				for_c_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(397);
				c_function();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(398);
				return_stmt();
				setState(399);
				match(T_SEMICOLON);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(401);
				c_block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(402);
				general_delcaration_c_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(403);
				call_stmt();
				setState(404);
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
			setState(408);
			match(T_OPEN_B);
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T_AVG) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BINARY_INTEGER) | (1L << T_BIT) | (1L << T_BREAK) | (1L << T_CASE) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CURRENT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T_DATE - 67)) | (1L << (T_DATETIME - 67)) | (1L << (T_DEC - 67)) | (1L << (T_DECIMAL - 67)) | (1L << (T_DECLARE - 67)) | (1L << (T_DOUBLE - 67)) | (1L << (T_EXEC - 67)) | (1L << (T_EXECUTE - 67)) | (1L << (T_FALSE - 67)) | (1L << (T_FLOAT - 67)) | (1L << (T_FOR - 67)))) != 0) || ((((_la - 133)) & ~0x3f) == 0 && ((1L << (_la - 133)) & ((1L << (T_IF - 133)) | (1L << (T_INT - 133)) | (1L << (T_INT2 - 133)) | (1L << (T_INT4 - 133)) | (1L << (T_INT8 - 133)) | (1L << (T_INTEGER - 133)) | (1L << (T_INTERVAL - 133)) | (1L << (T_MAX - 133)) | (1L << (T_MIN - 133)) | (1L << (T_NCHAR - 133)) | (1L << (T_NVARCHAR - 133)) | (1L << (T_NULL - 133)) | (1L << (T_NUMERIC - 133)) | (1L << (T_NUMBER - 133)))) != 0) || ((((_la - 213)) & ~0x3f) == 0 && ((1L << (_la - 213)) & ((1L << (T_PLS_INTEGER - 213)) | (1L << (T_REAL - 213)) | (1L << (T_RESULT_SET_LOCATOR - 213)) | (1L << (T_RETURN - 213)) | (1L << (T_TRIM - 213)) | (1L << (T_SEL - 213)) | (1L << (T_SELECT - 213)) | (1L << (T_SIMPLE_DOUBLE - 213)) | (1L << (T_SIMPLE_FLOAT - 213)) | (1L << (T_SIMPLE_INTEGER - 213)) | (1L << (T_SMALLDATETIME - 213)) | (1L << (T_SMALLINT - 213)) | (1L << (T_STRING - 213)))) != 0) || ((((_la - 278)) & ~0x3f) == 0 && ((1L << (_la - 278)) & ((1L << (T_SUBSTRING - 278)) | (1L << (T_SUM - 278)) | (1L << (T_SYS_REFCURSOR - 278)) | (1L << (T_TIMESTAMP - 278)) | (1L << (T_TINYINT - 278)) | (1L << (T_TRUE - 278)) | (1L << (T_VAR - 278)) | (1L << (T_VARCHAR - 278)) | (1L << (T_VARCHAR2 - 278)) | (1L << (T_VOID - 278)) | (1L << (T_WITH - 278)) | (1L << (T_XML - 278)) | (1L << (T_ACTIVITY_COUNT - 278)) | (1L << (T_CUME_DIST - 278)) | (1L << (T_CURRENT_DATE - 278)) | (1L << (T_CURRENT_TIMESTAMP - 278)) | (1L << (T_CURRENT_USER - 278)) | (1L << (T_DENSE_RANK - 278)) | (1L << (T_FIRST_VALUE - 278)) | (1L << (T_LAG - 278)) | (1L << (T_LAST_VALUE - 278)) | (1L << (T_LEAD - 278)) | (1L << (T_MAX_PART_STRING - 278)) | (1L << (T_MIN_PART_STRING - 278)) | (1L << (T_MAX_PART_INT - 278)) | (1L << (T_MIN_PART_INT - 278)) | (1L << (T_MAX_PART_DATE - 278)) | (1L << (T_MIN_PART_DATE - 278)) | (1L << (T_PART_COUNT - 278)) | (1L << (T_PART_LOC - 278)) | (1L << (T_RANK - 278)) | (1L << (T_ROW_NUMBER - 278)) | (1L << (T_STDEV - 278)) | (1L << (T_SYSDATE - 278)))) != 0) || ((((_la - 342)) & ~0x3f) == 0 && ((1L << (_la - 342)) & ((1L << (T_VARIANCE - 342)) | (1L << (T_USER - 342)) | (1L << (T_ADD - 342)) | (1L << (T_DIV - 342)) | (1L << (T_MINUS_MINUS - 342)) | (1L << (T_OPEN_B - 342)) | (1L << (T_OPEN_P - 342)) | (1L << (T_PLUS_PLUS - 342)) | (1L << (T_SEMICOLON - 342)) | (1L << (T_SUB - 342)) | (1L << (L_ID - 342)) | (1L << (L_S_STRING - 342)) | (1L << (L_D_STRING - 342)) | (1L << (L_INT - 342)) | (1L << (L_DEC - 342)))) != 0)) {
				{
				{
				setState(409);
				stmt();
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415);
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
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				break_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				call_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(420);
				create_database_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(421);
				create_index_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(422);
				create_local_temp_table_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(423);
				create_table_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(424);
				declare_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(425);
				exec_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(426);
				for_range_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(427);
				if_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(428);
				c_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(429);
				return_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(430);
				null_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(431);
				expr(0);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(432);
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
			setState(435);
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
			setState(437);
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
			setState(439);
			assignment_stmt_item();
			setState(444);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(440);
					match(T_COMMA);
					setState(441);
					assignment_stmt_item();
					}
					} 
				}
				setState(446);
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
			setState(447);
			assignment_c_stmt_item();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(448);
				match(T_COMMA);
				setState(449);
				assignment_c_stmt_item();
				}
				}
				setState(454);
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
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(455);
				assignment_stmt_single_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456);
				assignment_stmt_multiple_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
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
			setState(462);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_MINUS_MINUS:
			case T_PLUS_PLUS:
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				assignment_c_stmt_single_item();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
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
			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				ident();
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(465);
					match(T_COLON);
					}
				}

				setState(468);
				match(T_EQUAL);
				setState(469);
				expr(0);
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				match(T_OPEN_P);
				setState(472);
				ident();
				setState(473);
				match(T_CLOSE_P);
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(474);
					match(T_COLON);
					}
				}

				setState(477);
				match(T_EQUAL);
				setState(478);
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

	public static class Assignment_c_stmt_single_itemContext extends ParserRuleContext {
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
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				ident();
				setState(483);
				assignment_operator();
				setState(484);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
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
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				ident();
				setState(490);
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
				setState(492);
				_la = _input.LA(1);
				if ( !(_la==T_MINUS_MINUS || _la==T_PLUS_PLUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(493);
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
			setState(496);
			match(T_OPEN_P);
			setState(497);
			ident();
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(498);
				match(T_COMMA);
				setState(499);
				ident();
				}
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(505);
			match(T_CLOSE_P);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(506);
				match(T_COLON);
				}
			}

			setState(509);
			assignment_operator();
			setState(510);
			match(T_OPEN_P);
			setState(511);
			expr(0);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(512);
				match(T_COMMA);
				setState(513);
				expr(0);
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(519);
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
			setState(521);
			match(T_OPEN_P);
			setState(522);
			ident();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(523);
				match(T_COMMA);
				setState(524);
				ident();
				}
				}
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(530);
			match(T_CLOSE_P);
			setState(531);
			match(T_EQUAL);
			setState(532);
			match(T_OPEN_P);
			setState(533);
			expr(0);
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(534);
				match(T_COMMA);
				setState(535);
				expr(0);
				}
				}
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(541);
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
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(543);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(544);
				match(T_OPEN_P);
				setState(545);
				ident();
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(546);
					match(T_COMMA);
					setState(547);
					ident();
					}
					}
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(553);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(557);
				match(T_COLON);
				}
			}

			setState(560);
			match(T_EQUAL);
			setState(561);
			match(T_OPEN_P);
			setState(562);
			select_stmt();
			setState(563);
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
			setState(565);
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
			setState(567);
			ident();
			{
			setState(568);
			match(T_OPEN_P);
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(569);
				expr_func_params();
				}
				break;
			}
			setState(572);
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
			setState(574);
			match(T_DECLARE);
			setState(575);
			declare_stmt_item();
			setState(580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(576);
					match(T_COMMA);
					setState(577);
					declare_stmt_item();
					}
					} 
				}
				setState(582);
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
			setState(583);
			declare_stmt_item();
			setState(588);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(584);
					match(T_COMMA);
					setState(585);
					declare_stmt_item();
					}
					} 
				}
				setState(590);
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
			setState(593);
			match(T_DECLARE);
			setState(594);
			declare_stmt_item();
			setState(595);
			match(T_SEMICOLON);
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==L_ID) {
				{
				{
				setState(596);
				declare_stmt_item();
				setState(597);
				match(T_SEMICOLON);
				}
				}
				setState(603);
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
			setState(604);
			declare_stmt_item();
			setState(605);
			match(T_SEMICOLON);
			setState(611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(606);
					declare_stmt_item();
					setState(607);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(613);
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
			setState(614);
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
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(616);
				ident();
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(617);
					match(T_COMMA);
					setState(618);
					ident();
					}
					}
					setState(623);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(624);
					match(T_AS);
					}
				}

				setState(627);
				dtype();
				setState(629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(628);
					dtype_len();
					}
					break;
				}
				setState(634);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(631);
						dtype_attr();
						}
						} 
					}
					setState(636);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				setState(638);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(637);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640);
				ident();
				setState(641);
				match(T_CONSTANT);
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(642);
					match(T_AS);
					}
				}

				setState(645);
				dtype();
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(646);
					dtype_len();
					}
				}

				setState(649);
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
			setState(653);
			match(T_CREATE);
			setState(654);
			match(T_TABLE);
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IF) {
				{
				setState(655);
				match(T_IF);
				setState(656);
				match(T_NOT);
				setState(657);
				match(T_EXISTS);
				}
			}

			setState(660);
			table_name();
			setState(661);
			create_table_preoptions();
			setState(662);
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
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				error_create_table_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				error_create_index_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(666);
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
			setState(669);
			match(T_CREATE);
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IF) {
				{
				setState(670);
				match(T_IF);
				setState(671);
				match(T_NOT);
				setState(672);
				match(T_EXISTS);
				}
			}

			setState(675);
			table_name();
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED) {
				{
				setState(676);
				create_table_preoptions();
				}
			}

			setState(679);
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
			setState(682);
			match(T_CREATE);
			setState(689);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(683);
				match(T_LOCAL);
				setState(684);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(685);
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

				setState(688);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(691);
			match(T_TABLE);
			setState(692);
			ident();
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
			setState(713);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(698);
					match(T_AS);
					}
				}

				setState(701);
				match(T_OPEN_P);
				setState(702);
				select_stmt();
				setState(703);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(705);
					match(T_AS);
					}
				}

				setState(708);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(709);
				match(T_OPEN_P);
				setState(710);
				create_table_columns();
				setState(711);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(715);
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
			setState(718);
			create_table_columns_item();
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(719);
				match(T_COMMA);
				setState(720);
				create_table_columns_item();
				}
				}
				setState(725);
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
			setState(748);
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
				setState(726);
				dtype();
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(727);
					dtype_len();
					}
				}

				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_CASESPECIFIC) | (1L << T_CHARACTER) | (1L << T_CS))) != 0) || _la==T_NOT || _la==T_NULL) {
					{
					{
					setState(730);
					dtype_attr();
					}
					}
					setState(735);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(736);
				column_name();
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T_DEFAULT - 74)) | (1L << (T_ENABLE - 74)) | (1L << (T_IDENTITY - 74)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOT - 192)) | (1L << (T_NULL - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_REFERENCES - 192)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (T_UNIQUE - 298)) | (1L << (T_WITH - 298)) | (1L << (T_COLON - 298)) | (1L << (T_EQUAL - 298)))) != 0)) {
					{
					{
					setState(737);
					create_table_column_inline_cons();
					}
					}
					setState(742);
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
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(743);
					match(T_CONSTRAINT);
					setState(744);
					ident();
					}
				}

				setState(747);
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
			setState(750);
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
			setState(784);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(753);
					match(T_NOT);
					}
				}

				setState(756);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(757);
				match(T_PRIMARY);
				setState(758);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(759);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(760);
				match(T_REFERENCES);
				setState(761);
				table_name();
				setState(762);
				match(T_OPEN_P);
				setState(763);
				ident();
				setState(764);
				match(T_CLOSE_P);
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(765);
					create_table_fk_action();
					}
					}
					setState(770);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(771);
				match(T_IDENTITY);
				setState(772);
				match(T_OPEN_P);
				setState(773);
				match(L_INT);
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(774);
					match(T_COMMA);
					setState(775);
					match(L_INT);
					}
					}
					setState(780);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(781);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(782);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(783);
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
			setState(840);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(786);
				match(T_PRIMARY);
				setState(787);
				match(T_KEY);
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(788);
					match(T_CLUSTERED);
					}
				}

				setState(791);
				match(T_OPEN_P);
				setState(792);
				ident();
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(793);
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

				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(796);
					match(T_COMMA);
					setState(797);
					ident();
					setState(799);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(798);
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
					setState(805);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(806);
				match(T_CLOSE_P);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(807);
					match(T_ENABLE);
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(810);
				match(T_FOREIGN);
				setState(811);
				match(T_KEY);
				setState(812);
				match(T_OPEN_P);
				setState(813);
				ident();
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(814);
					match(T_COMMA);
					setState(815);
					ident();
					}
					}
					setState(820);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(821);
				match(T_CLOSE_P);
				setState(822);
				match(T_REFERENCES);
				setState(823);
				table_name();
				setState(824);
				match(T_OPEN_P);
				setState(825);
				ident();
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(826);
					match(T_COMMA);
					setState(827);
					ident();
					}
					}
					setState(832);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(833);
				match(T_CLOSE_P);
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(834);
					create_table_fk_action();
					}
					}
					setState(839);
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
			setState(842);
			match(T_ON);
			setState(843);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(844);
				match(T_NO);
				setState(845);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(846);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(847);
				match(T_SET);
				setState(848);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(849);
				match(T_SET);
				setState(850);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(851);
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
			setState(854);
			create_table_options_hive_item();
			setState(855);
			match(T_LOCATION);
			setState(856);
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
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(858);
				match(T_NO);
				}
			}

			setState(861);
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
			setState(864); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(863);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(866); 
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
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(868);
				match(T_ON);
				setState(869);
				match(T_COMMIT);
				setState(870);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(871);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(872);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(873);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(874);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(875);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(876);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(877);
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
			setState(898);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				match(T_SEGMENT);
				setState(881);
				match(T_CREATION);
				setState(882);
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
				setState(883);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(884);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(885);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(886);
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
				setState(887);
				match(T_STORAGE);
				setState(888);
				match(T_OPEN_P);
				setState(891); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(891);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(889);
						ident();
						}
						break;
					case L_INT:
						{
						setState(890);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(893); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==L_ID || _la==L_INT );
				setState(895);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(896);
				match(T_TABLESPACE);
				setState(897);
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
			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(900);
					match(T_INDEX);
					}
				}

				setState(903);
				match(T_IN);
				setState(904);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				match(T_WITH);
				setState(906);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(907);
				match(T_DISTRIBUTE);
				setState(908);
				match(T_BY);
				setState(909);
				match(T_HASH);
				setState(910);
				match(T_OPEN_P);
				setState(911);
				ident();
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(912);
					match(T_COMMA);
					setState(913);
					ident();
					}
					}
					setState(918);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(919);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(921);
					match(T_NOT);
					}
				}

				setState(924);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(925);
				match(T_COMPRESS);
				setState(926);
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
				setState(927);
				match(T_DEFINITION);
				setState(928);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(929);
				match(T_WITH);
				setState(930);
				match(T_RESTRICT);
				setState(931);
				match(T_ON);
				setState(932);
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
			setState(953);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(935);
					match(T_UNIQUE);
					}
				}

				setState(938);
				match(T_PRIMARY);
				setState(939);
				match(T_INDEX);
				setState(940);
				match(T_OPEN_P);
				setState(941);
				ident();
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(942);
					match(T_COMMA);
					setState(943);
					ident();
					}
					}
					setState(948);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(949);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
				match(T_WITH);
				setState(952);
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
			setState(959);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				match(T_STORED);
				setState(957);
				match(T_AS);
				setState(958);
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
			setState(961);
			match(T_ROW);
			setState(962);
			match(T_FORMAT);
			setState(963);
			match(T_DELIMITED);
			setState(964);
			match(T_FIELDS);
			setState(965);
			match(T_TERMINATED);
			setState(966);
			match(T_BY);
			setState(967);
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
			setState(973);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(969);
				match(T_ON);
				setState(970);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(971);
				match(T_TEXTIMAGE_ON);
				setState(972);
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
			setState(1002);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(975);
				match(T_AUTO_INCREMENT);
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(976);
					match(T_EQUAL);
					}
				}

				setState(979);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(980);
				match(T_COMMENT);
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(981);
					match(T_EQUAL);
					}
				}

				setState(984);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(985);
					match(T_DEFAULT);
					}
				}

				setState(991);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(988);
					match(T_CHARACTER);
					setState(989);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(990);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(997);
				match(T_ENGINE);
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
			setState(1050);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				match(T_CHAR);
				}
				break;
			case T_BIGINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005);
				match(T_BIGINT);
				}
				break;
			case T_BINARY_DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1006);
				match(T_BINARY_DOUBLE);
				}
				break;
			case T_BINARY_FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1007);
				match(T_BINARY_FLOAT);
				}
				break;
			case T_BINARY_INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1008);
				match(T_BINARY_INTEGER);
				}
				break;
			case T_BIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1009);
				match(T_BIT);
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1010);
				match(T_DATE);
				}
				break;
			case T_DATETIME:
				enterOuterAlt(_localctx, 8);
				{
				setState(1011);
				match(T_DATETIME);
				}
				break;
			case T_DEC:
				enterOuterAlt(_localctx, 9);
				{
				setState(1012);
				match(T_DEC);
				}
				break;
			case T_DECIMAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(1013);
				match(T_DECIMAL);
				}
				break;
			case T_DOUBLE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1014);
				match(T_DOUBLE);
				setState(1016);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(1015);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 12);
				{
				setState(1018);
				match(T_FLOAT);
				}
				break;
			case T_INT:
				enterOuterAlt(_localctx, 13);
				{
				setState(1019);
				match(T_INT);
				}
				break;
			case T_INT2:
				enterOuterAlt(_localctx, 14);
				{
				setState(1020);
				match(T_INT2);
				}
				break;
			case T_INT4:
				enterOuterAlt(_localctx, 15);
				{
				setState(1021);
				match(T_INT4);
				}
				break;
			case T_INT8:
				enterOuterAlt(_localctx, 16);
				{
				setState(1022);
				match(T_INT8);
				}
				break;
			case T_INTEGER:
				enterOuterAlt(_localctx, 17);
				{
				setState(1023);
				match(T_INTEGER);
				}
				break;
			case T_NCHAR:
				enterOuterAlt(_localctx, 18);
				{
				setState(1024);
				match(T_NCHAR);
				}
				break;
			case T_NVARCHAR:
				enterOuterAlt(_localctx, 19);
				{
				setState(1025);
				match(T_NVARCHAR);
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 20);
				{
				setState(1026);
				match(T_NUMBER);
				}
				break;
			case T_NUMERIC:
				enterOuterAlt(_localctx, 21);
				{
				setState(1027);
				match(T_NUMERIC);
				}
				break;
			case T_PLS_INTEGER:
				enterOuterAlt(_localctx, 22);
				{
				setState(1028);
				match(T_PLS_INTEGER);
				}
				break;
			case T_REAL:
				enterOuterAlt(_localctx, 23);
				{
				setState(1029);
				match(T_REAL);
				}
				break;
			case T_RESULT_SET_LOCATOR:
				enterOuterAlt(_localctx, 24);
				{
				setState(1030);
				match(T_RESULT_SET_LOCATOR);
				setState(1031);
				match(T_VARYING);
				}
				break;
			case T_SIMPLE_FLOAT:
				enterOuterAlt(_localctx, 25);
				{
				setState(1032);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case T_SIMPLE_DOUBLE:
				enterOuterAlt(_localctx, 26);
				{
				setState(1033);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case T_SIMPLE_INTEGER:
				enterOuterAlt(_localctx, 27);
				{
				setState(1034);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case T_SMALLINT:
				enterOuterAlt(_localctx, 28);
				{
				setState(1035);
				match(T_SMALLINT);
				}
				break;
			case T_SMALLDATETIME:
				enterOuterAlt(_localctx, 29);
				{
				setState(1036);
				match(T_SMALLDATETIME);
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 30);
				{
				setState(1037);
				match(T_STRING);
				}
				break;
			case T_SYS_REFCURSOR:
				enterOuterAlt(_localctx, 31);
				{
				setState(1038);
				match(T_SYS_REFCURSOR);
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 32);
				{
				setState(1039);
				match(T_TIMESTAMP);
				}
				break;
			case T_TINYINT:
				enterOuterAlt(_localctx, 33);
				{
				setState(1040);
				match(T_TINYINT);
				}
				break;
			case T_VARCHAR:
				enterOuterAlt(_localctx, 34);
				{
				setState(1041);
				match(T_VARCHAR);
				}
				break;
			case T_VOID:
				enterOuterAlt(_localctx, 35);
				{
				setState(1042);
				match(T_VOID);
				}
				break;
			case T_VARCHAR2:
				enterOuterAlt(_localctx, 36);
				{
				setState(1043);
				match(T_VARCHAR2);
				}
				break;
			case T_XML:
				enterOuterAlt(_localctx, 37);
				{
				setState(1044);
				match(T_XML);
				}
				break;
			case L_ID:
				enterOuterAlt(_localctx, 38);
				{
				setState(1045);
				ident();
				setState(1048);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					{
					setState(1046);
					match(T__2);
					}
					setState(1047);
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
			setState(1052);
			match(T_OPEN_P);
			setState(1053);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1054);
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

			setState(1059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1057);
				match(T_COMMA);
				setState(1058);
				match(L_INT);
				}
			}

			setState(1061);
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
			setState(1074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1063);
					match(T_NOT);
					}
				}

				setState(1066);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1067);
				match(T_CHARACTER);
				setState(1068);
				match(T_SET);
				setState(1069);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1070);
					match(T_NOT);
					}
				}

				setState(1073);
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
			setState(1088);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1076);
					match(T_COLON);
					}
				}

				setState(1079);
				match(T_EQUAL);
				setState(1080);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1082);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1081);
					match(T_WITH);
					}
				}

				setState(1084);
				match(T_DEFAULT);
				setState(1086);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1085);
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
			setState(1090);
			match(T_CREATE);
			setState(1091);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IF) {
				{
				setState(1092);
				match(T_IF);
				setState(1093);
				match(T_NOT);
				setState(1094);
				match(T_EXISTS);
				}
			}

			setState(1097);
			expr(0);
			setState(1101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1098);
					create_database_option();
					}
					} 
				}
				setState(1103);
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
			setState(1108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1104);
				match(T_COMMENT);
				setState(1105);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				match(T_LOCATION);
				setState(1107);
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
			setState(1110);
			dtype();
			setState(1111);
			ident();
			setState(1112);
			match(T_OPEN_P);
			setState(1114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (T_BIGINT - 22)) | (1L << (T_BINARY_DOUBLE - 22)) | (1L << (T_BINARY_FLOAT - 22)) | (1L << (T_BINARY_INTEGER - 22)) | (1L << (T_BIT - 22)) | (1L << (T_CHAR - 22)) | (1L << (T_DATE - 22)) | (1L << (T_DATETIME - 22)) | (1L << (T_DEC - 22)) | (1L << (T_DECIMAL - 22)))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (T_DOUBLE - 90)) | (1L << (T_FLOAT - 90)) | (1L << (T_INT - 90)) | (1L << (T_INT2 - 90)) | (1L << (T_INT4 - 90)) | (1L << (T_INT8 - 90)) | (1L << (T_INTEGER - 90)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (T_NCHAR - 184)) | (1L << (T_NVARCHAR - 184)) | (1L << (T_NUMERIC - 184)) | (1L << (T_NUMBER - 184)) | (1L << (T_PLS_INTEGER - 184)) | (1L << (T_REAL - 184)) | (1L << (T_RESULT_SET_LOCATOR - 184)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (T_SIMPLE_DOUBLE - 261)) | (1L << (T_SIMPLE_FLOAT - 261)) | (1L << (T_SIMPLE_INTEGER - 261)) | (1L << (T_SMALLDATETIME - 261)) | (1L << (T_SMALLINT - 261)) | (1L << (T_STRING - 261)) | (1L << (T_SYS_REFCURSOR - 261)) | (1L << (T_TIMESTAMP - 261)) | (1L << (T_TINYINT - 261)) | (1L << (T_VARCHAR - 261)) | (1L << (T_VARCHAR2 - 261)) | (1L << (T_VOID - 261)) | (1L << (T_XML - 261)))) != 0) || _la==L_ID) {
				{
				setState(1113);
				c_function_parameter_list();
				}
			}

			setState(1116);
			match(T_CLOSE_P);
			setState(1117);
			c_block();
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
			setState(1119);
			c_function_parameter_item();
			setState(1124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1120);
				match(T_COMMA);
				setState(1121);
				c_function_parameter_item();
				}
				}
				setState(1126);
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
			setState(1127);
			dtype();
			setState(1128);
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
			setState(1136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CREATE:
				{
				setState(1130);
				match(T_CREATE);
				setState(1133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1131);
					match(T_OR);
					setState(1132);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1135);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
			}
			setState(1138);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1139);
				create_routine_params();
				}
				break;
			}
			setState(1143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS || _la==T_IS) {
				{
				setState(1142);
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

			setState(1146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1145);
				declare_block_inplace();
				}
				break;
			}
			setState(1148);
			proc_block();
			setState(1152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1149);
				ident();
				setState(1150);
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
			setState(1176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1154);
				match(T_OPEN_P);
				setState(1155);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1156);
				match(T_OPEN_P);
				setState(1157);
				create_routine_param_item();
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1158);
					match(T_COMMA);
					setState(1159);
					create_routine_param_item();
					}
					}
					setState(1164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1165);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1167);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
				setState(1168);
				create_routine_param_item();
				setState(1173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1169);
					match(T_COMMA);
					setState(1170);
					create_routine_param_item();
					}
					}
					setState(1175);
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
			setState(1220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1178);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1179);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1180);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1181);
					match(T_IN);
					setState(1182);
					match(T_OUT);
					}
					break;
				}
				setState(1185);
				ident();
				setState(1186);
				dtype();
				setState(1188);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1187);
					dtype_len();
					}
					break;
				}
				setState(1193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1190);
						dtype_attr();
						}
						} 
					}
					setState(1195);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
				}
				setState(1197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
				case 1:
					{
					setState(1196);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199);
				ident();
				setState(1205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1200);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1201);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1202);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1203);
					match(T_IN);
					setState(1204);
					match(T_OUT);
					}
					break;
				}
				setState(1207);
				dtype();
				setState(1209);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
				case 1:
					{
					setState(1208);
					dtype_len();
					}
					break;
				}
				setState(1214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1211);
						dtype_attr();
						}
						} 
					}
					setState(1216);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				}
				setState(1218);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1217);
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
			setState(1222);
			_la = _input.LA(1);
			if ( !(_la==T_EXEC || _la==T_EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IMMEDIATE) {
				{
				setState(1223);
				match(T_IMMEDIATE);
				}
			}

			setState(1226);
			expr(0);
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1227);
				match(T_OPEN_P);
				setState(1228);
				expr_func_params();
				setState(1229);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1231);
				expr_func_params();
				}
				break;
			}
			setState(1243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1234);
				match(T_INTO);
				setState(1235);
				match(L_ID);
				setState(1240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1236);
						match(T_COMMA);
						setState(1237);
						match(L_ID);
						}
						} 
					}
					setState(1242);
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
			setState(1248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1245);
				if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1246);
				if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1247);
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
			setState(1250);
			match(T_IF);
			setState(1251);
			match(T_OPEN_P);
			setState(1252);
			bool_expr(0);
			setState(1253);
			match(T_CLOSE_P);
			setState(1254);
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
			setState(1259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				error_if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1257);
				error_if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1258);
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
			setState(1261);
			match(T_IF);
			setState(1262);
			bool_expr(0);
			setState(1263);
			match(T_THEN);
			setState(1264);
			block();
			setState(1268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1265);
				elseif_block();
				}
				}
				setState(1270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1271);
				else_block();
				}
			}

			setState(1274);
			match(T_END);
			setState(1275);
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
			setState(1277);
			match(T_IF);
			setState(1278);
			match(T_THEN);
			setState(1279);
			block();
			setState(1283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1280);
				elseif_block();
				}
				}
				setState(1285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1286);
				else_block();
				}
			}

			setState(1289);
			match(T_END);
			setState(1290);
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
			setState(1293);
			match(T_IF);
			setState(1294);
			bool_expr(0);
			setState(1295);
			single_block_stmt();
			setState(1298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1296);
				match(T_ELSE);
				setState(1297);
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
			setState(1300);
			match(T_IF);
			setState(1301);
			single_block_stmt();
			setState(1304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1302);
				match(T_ELSE);
				setState(1303);
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
			setState(1308);
			match(T__3);
			setState(1309);
			match(T_IF);
			setState(1310);
			bool_expr(0);
			setState(1311);
			match(T_THEN);
			setState(1312);
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
			setState(1314);
			match(T__3);
			setState(1315);
			match(T_IF);
			setState(1316);
			match(T_THEN);
			setState(1317);
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
			setState(1320);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1321);
			bool_expr(0);
			setState(1322);
			match(T_THEN);
			setState(1323);
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
			setState(1325);
			match(T_ELSE);
			setState(1326);
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
			setState(1328);
			match(T_CREATE);
			setState(1330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1329);
				match(T_UNIQUE);
				}
			}

			setState(1332);
			match(T_INDEX);
			setState(1333);
			ident();
			setState(1334);
			match(T_ON);
			setState(1335);
			table_name();
			setState(1336);
			match(T_OPEN_P);
			setState(1337);
			create_index_col();
			setState(1342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1338);
				match(T_COMMA);
				setState(1339);
				create_index_col();
				}
				}
				setState(1344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1345);
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
			setState(1347);
			match(T_CREATE);
			setState(1349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1348);
				match(T_UNIQUE);
				}
			}

			setState(1351);
			match(T_OPEN_P);
			setState(1352);
			create_index_col();
			setState(1357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1353);
				match(T_COMMA);
				setState(1354);
				create_index_col();
				}
				}
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1360);
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
			setState(1363);
			ident();
			setState(1365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(1364);
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
			setState(1367);
			match(T_RETURN);
			setState(1369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1368);
				expr(0);
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
			setState(1371);
			match(T_FOR);
			setState(1372);
			match(L_ID);
			setState(1373);
			match(T_IN);
			setState(1375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_REVERSE) {
				{
				setState(1374);
				match(T_REVERSE);
				}
			}

			setState(1377);
			expr(0);
			setState(1378);
			match(T_DOT2);
			setState(1379);
			expr(0);
			setState(1382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
				{
				setState(1380);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1381);
				expr(0);
				}
			}

			setState(1384);
			match(T_LOOP);
			setState(1385);
			block();
			setState(1386);
			match(T_END);
			setState(1387);
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
			setState(1389);
			match(T_FOR);
			setState(1390);
			match(T_OPEN_P);
			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (T_BIGINT - 22)) | (1L << (T_BINARY_DOUBLE - 22)) | (1L << (T_BINARY_FLOAT - 22)) | (1L << (T_BINARY_INTEGER - 22)) | (1L << (T_BIT - 22)) | (1L << (T_CHAR - 22)) | (1L << (T_DATE - 22)) | (1L << (T_DATETIME - 22)) | (1L << (T_DEC - 22)) | (1L << (T_DECIMAL - 22)))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (T_DOUBLE - 90)) | (1L << (T_FLOAT - 90)) | (1L << (T_INT - 90)) | (1L << (T_INT2 - 90)) | (1L << (T_INT4 - 90)) | (1L << (T_INT8 - 90)) | (1L << (T_INTEGER - 90)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (T_NCHAR - 184)) | (1L << (T_NVARCHAR - 184)) | (1L << (T_NUMERIC - 184)) | (1L << (T_NUMBER - 184)) | (1L << (T_PLS_INTEGER - 184)) | (1L << (T_REAL - 184)) | (1L << (T_RESULT_SET_LOCATOR - 184)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (T_SIMPLE_DOUBLE - 261)) | (1L << (T_SIMPLE_FLOAT - 261)) | (1L << (T_SIMPLE_INTEGER - 261)) | (1L << (T_SMALLDATETIME - 261)) | (1L << (T_SMALLINT - 261)) | (1L << (T_STRING - 261)) | (1L << (T_SYS_REFCURSOR - 261)) | (1L << (T_TIMESTAMP - 261)) | (1L << (T_TINYINT - 261)) | (1L << (T_VARCHAR - 261)) | (1L << (T_VARCHAR2 - 261)) | (1L << (T_VOID - 261)) | (1L << (T_XML - 261)))) != 0) || _la==L_ID) {
				{
				setState(1391);
				for_delcaration_c_stmt();
				}
			}

			setState(1394);
			match(T_SEMICOLON);
			setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_AVG) | (1L << T_CASE) | (1L << T_CAST) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CURRENT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (T_DATE - 67)) | (1L << (T_EXISTS - 67)) | (1L << (T_FALSE - 67)))) != 0) || ((((_la - 149)) & ~0x3f) == 0 && ((1L << (_la - 149)) & ((1L << (T_INTERVAL - 149)) | (1L << (T_MAX - 149)) | (1L << (T_MIN - 149)) | (1L << (T_NOT - 149)) | (1L << (T_NULL - 149)))) != 0) || ((((_la - 247)) & ~0x3f) == 0 && ((1L << (_la - 247)) & ((1L << (T_TRIM - 247)) | (1L << (T_SEL - 247)) | (1L << (T_SELECT - 247)) | (1L << (T_SUBSTRING - 247)) | (1L << (T_SUM - 247)) | (1L << (T_TIMESTAMP - 247)) | (1L << (T_TRUE - 247)))) != 0) || ((((_la - 314)) & ~0x3f) == 0 && ((1L << (_la - 314)) & ((1L << (T_WITH - 314)) | (1L << (T_ACTIVITY_COUNT - 314)) | (1L << (T_CUME_DIST - 314)) | (1L << (T_CURRENT_DATE - 314)) | (1L << (T_CURRENT_TIMESTAMP - 314)) | (1L << (T_CURRENT_USER - 314)) | (1L << (T_DENSE_RANK - 314)) | (1L << (T_FIRST_VALUE - 314)) | (1L << (T_LAG - 314)) | (1L << (T_LAST_VALUE - 314)) | (1L << (T_LEAD - 314)) | (1L << (T_MAX_PART_STRING - 314)) | (1L << (T_MIN_PART_STRING - 314)) | (1L << (T_MAX_PART_INT - 314)) | (1L << (T_MIN_PART_INT - 314)) | (1L << (T_MAX_PART_DATE - 314)) | (1L << (T_MIN_PART_DATE - 314)) | (1L << (T_PART_COUNT - 314)) | (1L << (T_PART_LOC - 314)) | (1L << (T_RANK - 314)) | (1L << (T_ROW_NUMBER - 314)) | (1L << (T_STDEV - 314)) | (1L << (T_SYSDATE - 314)) | (1L << (T_VARIANCE - 314)) | (1L << (T_USER - 314)) | (1L << (T_ADD - 314)) | (1L << (T_OPEN_P - 314)) | (1L << (T_SUB - 314)) | (1L << (L_ID - 314)) | (1L << (L_S_STRING - 314)))) != 0) || ((((_la - 378)) & ~0x3f) == 0 && ((1L << (_la - 378)) & ((1L << (L_D_STRING - 378)) | (1L << (L_INT - 378)) | (1L << (L_DEC - 378)))) != 0)) {
				{
				setState(1395);
				bool_expr(0);
				}
			}

			setState(1398);
			match(T_SEMICOLON);
			setState(1400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 365)) & ~0x3f) == 0 && ((1L << (_la - 365)) & ((1L << (T_MINUS_MINUS - 365)) | (1L << (T_OPEN_P - 365)) | (1L << (T_PLUS_PLUS - 365)) | (1L << (L_ID - 365)))) != 0)) {
				{
				setState(1399);
				assignment_c_stmt();
				}
			}

			setState(1402);
			match(T_CLOSE_P);
			setState(1403);
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
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode T_SEMICOLON() { return getToken(PLHQLStatementsParser.T_SEMICOLON, 0); }
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
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
			setState(1407);
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
				setState(1405);
				dtype();
				}
				break;
			case T_VAR:
				{
				setState(1406);
				match(T_VAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1409);
			ident();
			setState(1412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_EQUAL) {
				{
				setState(1410);
				match(T_EQUAL);
				setState(1411);
				expr(0);
				}
			}

			setState(1422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1414);
				match(T_COMMA);
				setState(1415);
				ident();
				setState(1418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(1416);
					match(T_EQUAL);
					setState(1417);
					expr(0);
					}
				}

				}
				}
				setState(1424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1425);
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
			setState(1428);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1427);
				dtype();
				}
				break;
			}
			setState(1430);
			ident();
			setState(1431);
			match(T_EQUAL);
			setState(1432);
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
			setState(1487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1434);
				match(T_FOR);
				setState(1435);
				match(L_ID);
				setState(1436);
				match(T_IN);
				setState(1438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_REVERSE) {
					{
					setState(1437);
					match(T_REVERSE);
					}
				}

				setState(1440);
				expr(0);
				setState(1441);
				match(T_DOT2);
				setState(1442);
				expr(0);
				setState(1445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_BY || _la==T_STEP) {
					{
					setState(1443);
					_la = _input.LA(1);
					if ( !(_la==T_BY || _la==T_STEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1444);
					expr(0);
					}
				}

				setState(1447);
				block();
				setState(1448);
				match(T_END);
				setState(1449);
				match(T_LOOP);
				notifyErrorListeners("Expected 'LOOP' keyword");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1452);
				match(T_FOR);
				setState(1453);
				match(L_ID);
				setState(1454);
				match(T_IN);
				setState(1456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_REVERSE) {
					{
					setState(1455);
					match(T_REVERSE);
					}
				}

				setState(1458);
				expr(0);
				setState(1459);
				match(T_DOT2);
				setState(1460);
				expr(0);
				setState(1463);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_BY || _la==T_STEP) {
					{
					setState(1461);
					_la = _input.LA(1);
					if ( !(_la==T_BY || _la==T_STEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1462);
					expr(0);
					}
				}

				setState(1465);
				match(T_LOOP);
				setState(1466);
				block();
				notifyErrorListeners("Expected 'END LOOP' keywords");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1469);
				match(T_FOR);
				setState(1470);
				match(L_ID);
				setState(1471);
				match(T_IN);
				setState(1473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_REVERSE) {
					{
					setState(1472);
					match(T_REVERSE);
					}
				}

				setState(1475);
				expr(0);
				setState(1476);
				match(T_DOT2);
				setState(1477);
				expr(0);
				setState(1480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_BY || _la==T_STEP) {
					{
					setState(1478);
					_la = _input.LA(1);
					if ( !(_la==T_BY || _la==T_STEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1479);
					expr(0);
					}
				}

				setState(1482);
				match(T_LOOP);
				setState(1483);
				match(T_END);
				setState(1484);
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
			setState(1490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(1489);
				cte_select_stmt();
				}
			}

			setState(1492);
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
			setState(1494);
			match(T_WITH);
			setState(1495);
			cte_select_stmt_item();
			setState(1500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1496);
				match(T_COMMA);
				setState(1497);
				cte_select_stmt_item();
				}
				}
				setState(1502);
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
			setState(1503);
			ident();
			setState(1505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1504);
				cte_select_cols();
				}
			}

			setState(1507);
			match(T_AS);
			setState(1508);
			match(T_OPEN_P);
			setState(1509);
			fullselect_stmt();
			setState(1510);
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
			setState(1512);
			match(T_OPEN_P);
			setState(1513);
			ident();
			setState(1518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1514);
				match(T_COMMA);
				setState(1515);
				ident();
				}
				}
				setState(1520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1521);
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
			setState(1523);
			fullselect_stmt_item();
			setState(1529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,172,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1524);
					fullselect_set_clause();
					setState(1525);
					fullselect_stmt_item();
					}
					} 
				}
				setState(1531);
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
			setState(1537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1532);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1533);
				match(T_OPEN_P);
				setState(1534);
				fullselect_stmt();
				setState(1535);
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
			setState(1551);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1539);
				match(T_UNION);
				setState(1541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1540);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1543);
				match(T_EXCEPT);
				setState(1545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1544);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1547);
				match(T_INTERSECT);
				setState(1549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1548);
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
		public ArrayList<Pair<String,String>> aggregateFunctionColumns = new ArrayList();
		public ArrayList<String> groupByColumns = new ArrayList<>();
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
			setState(1553);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1554);
			select_list();
			setState(1556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_INTO) {
				{
				setState(1555);
				into_clause();
				}
			}

			setState(1558);
			from_clause();
			setState(1560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1559);
				where_clause();
				}
				break;
			}
			setState(1563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1562);
				group_by_clause();
				}
				break;
			}
			setState(1567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(1565);
				having_clause();
				}
				break;
			case 2:
				{
				setState(1566);
				qualify_clause();
				}
				break;
			}
			setState(1570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1569);
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
			setState(1593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1572);
				_la = _input.LA(1);
				if ( !(_la==T_SEL || _la==T_SELECT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1573);
				select_list();
				setState(1575);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1574);
					into_clause();
					}
					break;
				}
				setState(1578);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1577);
					where_clause();
					}
					break;
				}
				setState(1581);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1580);
					group_by_clause();
					}
					break;
				}
				setState(1585);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1583);
					having_clause();
					}
					break;
				case 2:
					{
					setState(1584);
					qualify_clause();
					}
					break;
				}
				setState(1588);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1587);
					order_by_clause();
					}
					break;
				}
				}
				break;
			case T_FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1590);
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
			setState(1596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ALL || _la==T_DISTINCT) {
				{
				setState(1595);
				select_list_set();
				}
			}

			setState(1599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TOP) {
				{
				setState(1598);
				select_list_limit();
				}
			}

			setState(1601);
			select_list_item();
			setState(1606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1602);
					match(T_COMMA);
					setState(1603);
					select_list_item();
					}
					} 
				}
				setState(1608);
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
			setState(1612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1609);
				match(T_ALL);
				}
				break;
			case T_DISTINCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1610);
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
			setState(1614);
			match(T_TOP);
			setState(1615);
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
			setState(1627);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1620);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1617);
					ident();
					setState(1618);
					match(T_EQUAL);
					}
					break;
				}
				setState(1622);
				expr(0);
				setState(1624);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1623);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1626);
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
			setState(1640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1631);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(1633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1632);
					match(T_AS);
					}
				}

				setState(1635);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1636);
				match(T_OPEN_P);
				setState(1637);
				match(T_TITLE);
				setState(1638);
				match(L_S_STRING);
				setState(1639);
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
			setState(1644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(1642);
				match(L_ID);
				setState(1643);
				match(T__3);
				}
			}

			setState(1646);
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
			setState(1648);
			match(T_INTO);
			setState(1649);
			ident();
			setState(1654);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1650);
					match(T_COMMA);
					setState(1651);
					ident();
					}
					} 
				}
				setState(1656);
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
			setState(1657);
			match(T_FROM);
			setState(1658);
			from_table_clause();
			setState(1662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1659);
					from_join_clause();
					}
					} 
				}
				setState(1664);
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
			setState(1665);
			match(T_FROM);
			setState(1669);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,201,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1666);
					from_join_clause();
					}
					} 
				}
				setState(1671);
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
			setState(1675);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1672);
				from_table_name_clause();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1673);
				from_subselect_clause();
				}
				break;
			case T_TABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1674);
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
			setState(1677);
			((From_table_name_clauseContext)_localctx).table_name = table_name();
			setState(1679);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(1678);
				from_alias_clause();
				}
				break;
			}

			       ((From_clauseContext)getInvokingContext(102)).tables.push((((From_table_name_clauseContext)_localctx).table_name!=null?_input.getText(((From_table_name_clauseContext)_localctx).table_name.start,((From_table_name_clauseContext)_localctx).table_name.stop):null));
			       ((From_clauseContext)getInvokingContext(102)).tablesCount+=1;
			       
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
			setState(1683);
			match(T_OPEN_P);
			setState(1684);
			select_stmt();
			setState(1685);
			match(T_CLOSE_P);
			setState(1687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(1686);
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
			setState(1697);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1689);
				match(T_COMMA);
				setState(1690);
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
				setState(1691);
				((From_join_clauseContext)_localctx).from_join_type_clause = from_join_type_clause();
				setState(1692);
				from_table_clause();
				setState(1693);
				match(T_ON);
				setState(1694);
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
			setState(1708);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1699);
					match(T_INNER);
					}
				}

				setState(1702);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1703);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(1704);
					match(T_OUTER);
					}
				}

				setState(1707);
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
			setState(1710);
			match(T_TABLE);
			setState(1711);
			match(T_OPEN_P);
			setState(1712);
			match(T_VALUES);
			setState(1713);
			from_table_values_row();
			setState(1718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1714);
				match(T_COMMA);
				setState(1715);
				from_table_values_row();
				}
				}
				setState(1720);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1721);
			match(T_CLOSE_P);
			setState(1723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1722);
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
			setState(1737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1725);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1726);
				match(T_OPEN_P);
				setState(1727);
				expr(0);
				setState(1732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1728);
					match(T_COMMA);
					setState(1729);
					expr(0);
					}
					}
					setState(1734);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1735);
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
			setState(1739);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(1741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS) {
				{
				setState(1740);
				match(T_AS);
				}
			}

			setState(1743);
			ident();
			setState(1754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1744);
				match(T_OPEN_P);
				setState(1745);
				match(L_ID);
				setState(1750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1746);
					match(T_COMMA);
					setState(1747);
					match(L_ID);
					}
					}
					setState(1752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1753);
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
			setState(1756);
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
			setState(1758);
			match(T_WHERE);
			setState(1759);
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
			setState(1762);
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
		public ExprContext expr;
		public TerminalNode T_GROUP() { return getToken(PLHQLStatementsParser.T_GROUP, 0); }
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
			setState(1765);
			match(T_GROUP);
			setState(1766);
			match(T_BY);
			setState(1767);
			((Group_by_clauseContext)_localctx).expr = expr(0);
			 ((Subselect_stmtContext)getInvokingContext(93)).groupByColumns.add((((Group_by_clauseContext)_localctx).expr!=null?_input.getText(((Group_by_clauseContext)_localctx).expr.start,((Group_by_clauseContext)_localctx).expr.stop):null)); 
			setState(1775);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,216,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1769);
					match(T_COMMA);
					setState(1770);
					((Group_by_clauseContext)_localctx).expr = expr(0);
					 ((Subselect_stmtContext)getInvokingContext(93)).groupByColumns.add((((Group_by_clauseContext)_localctx).expr!=null?_input.getText(((Group_by_clauseContext)_localctx).expr.start,((Group_by_clauseContext)_localctx).expr.stop):null)); 
					}
					} 
				}
				setState(1777);
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

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode T_HAVING() { return getToken(PLHQLStatementsParser.T_HAVING, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
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
			setState(1778);
			match(T_HAVING);
			setState(1779);
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
			setState(1781);
			match(T_QUALIFY);
			setState(1782);
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
			setState(1784);
			match(T_ORDER);
			setState(1785);
			match(T_BY);
			setState(1786);
			((Order_by_clauseContext)_localctx).expr = expr(0);
			setState(1787);
			((Order_by_clauseContext)_localctx).sort_type = sort_type();
			 ((Subselect_stmtContext)getInvokingContext(93)).orderingColumnsMap.put((((Order_by_clauseContext)_localctx).expr!=null?_input.getText(((Order_by_clauseContext)_localctx).expr.start,((Order_by_clauseContext)_localctx).expr.stop):null),(((Order_by_clauseContext)_localctx).sort_type!=null?_input.getText(((Order_by_clauseContext)_localctx).sort_type.start,((Order_by_clauseContext)_localctx).sort_type.stop):null)); 
			setState(1796);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1789);
					match(T_COMMA);
					setState(1790);
					((Order_by_clauseContext)_localctx).expr = expr(0);
					setState(1791);
					((Order_by_clauseContext)_localctx).sort_type = sort_type();
					 ((Subselect_stmtContext)getInvokingContext(93)).orderingColumnsMap.put((((Order_by_clauseContext)_localctx).expr!=null?_input.getText(((Order_by_clauseContext)_localctx).expr.start,((Order_by_clauseContext)_localctx).expr.stop):null),(((Order_by_clauseContext)_localctx).sort_type!=null?_input.getText(((Order_by_clauseContext)_localctx).sort_type.start,((Order_by_clauseContext)_localctx).sort_type.stop):null)); 
					}
					} 
				}
				setState(1798);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,217,_ctx);
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
			setState(1802);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1799);
				match(T_ASC);
				}
				break;
			case 2:
				{
				setState(1800);
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
			setState(1813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1805);
					match(T_NOT);
					}
				}

				setState(1808);
				match(T_OPEN_P);
				setState(1809);
				bool_expr(0);
				setState(1810);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1812);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1821);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(1815);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1816);
					bool_expr_logical_operator();
					setState(1817);
					bool_expr(3);
					}
					} 
				}
				setState(1823);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,221,_ctx);
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
		enterRule(_localctx, 242, RULE_bool_expr_atom);
		try {
			setState(1827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1824);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1825);
				bool_expr_binary();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1826);
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
		enterRule(_localctx, 244, RULE_bool_expr_unary);
		int _la;
		try {
			setState(1852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1829);
				expr(0);
				setState(1830);
				match(T_IS);
				setState(1832);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1831);
					match(T_NOT);
					}
				}

				setState(1834);
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
				setState(1836);
				expr(0);
				setState(1837);
				match(T_BETWEEN);
				setState(1838);
				expr(0);
				setState(1839);
				match(T_AND);
				setState(1840);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1842);
					match(T_NOT);
					}
				}

				setState(1845);
				match(T_EXISTS);
				setState(1846);
				match(T_OPEN_P);
				setState(1847);
				select_stmt();
				setState(1848);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1850);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1851);
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
		enterRule(_localctx, 246, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1854);
			expr(0);
			setState(1856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(1855);
				match(T_NOT);
				}
			}

			setState(1858);
			match(T_IN);
			setState(1859);
			match(T_OPEN_P);
			setState(1869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				{
				setState(1860);
				expr(0);
				setState(1865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1861);
					match(T_COMMA);
					setState(1862);
					expr(0);
					}
					}
					setState(1867);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(1868);
				select_stmt();
				}
				break;
			}
			setState(1871);
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
		enterRule(_localctx, 248, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1873);
			match(T_OPEN_P);
			setState(1874);
			expr(0);
			setState(1879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1875);
				match(T_COMMA);
				setState(1876);
				expr(0);
				}
				}
				setState(1881);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1882);
			match(T_CLOSE_P);
			setState(1884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(1883);
				match(T_NOT);
				}
			}

			setState(1886);
			match(T_IN);
			setState(1887);
			match(T_OPEN_P);
			setState(1888);
			select_stmt();
			setState(1889);
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
		enterRule(_localctx, 250, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			expr(0);
			setState(1892);
			bool_expr_binary_operator();
			setState(1893);
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
		enterRule(_localctx, 252, RULE_bool_expr_logical_operator);
		try {
			setState(1897);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AND_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(1895);
				bool_and();
				}
				break;
			case T_PIPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1896);
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
		enterRule(_localctx, 254, RULE_bool_and);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1899);
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
		enterRule(_localctx, 256, RULE_bool_or);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901);
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
		enterRule(_localctx, 258, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(1914);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL2:
				enterOuterAlt(_localctx, 1);
				{
				setState(1903);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1904);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 3);
				{
				setState(1905);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 4);
				{
				setState(1906);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1907);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 6);
				{
				setState(1908);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1909);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1911);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1910);
					match(T_NOT);
					}
				}

				setState(1913);
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
		int _startState = 260;
		enterRecursionRule(_localctx, 260, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1917);
				select_stmt();
				}
				break;
			case 2:
				{
				setState(1918);
				match(T_OPEN_P);
				setState(1919);
				select_stmt();
				setState(1920);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(1922);
				match(T_OPEN_P);
				setState(1923);
				expr(0);
				setState(1924);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				{
				setState(1926);
				expr_interval();
				}
				break;
			case 5:
				{
				setState(1927);
				expr_concat();
				}
				break;
			case 6:
				{
				setState(1928);
				expr_case();
				}
				break;
			case 7:
				{
				setState(1929);
				expr_agg_window_func();
				}
				break;
			case 8:
				{
				setState(1930);
				expr_spec_func();
				}
				break;
			case 9:
				{
				setState(1931);
				expr_func();
				}
				break;
			case 10:
				{
				setState(1932);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1956);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1954);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1935);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1936);
						match(T_MUL);
						setState(1937);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1938);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1939);
						match(T_DIV);
						setState(1940);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1941);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1942);
						match(T_ADD);
						setState(1943);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1944);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1945);
						match(T_SUB);
						setState(1946);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1947);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1948);
						interval_item();
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1949);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1950);
						match(T_OPEN_SB);
						setState(1951);
						expr(0);
						setState(1952);
						match(T_CLOSE_SB);
						}
						break;
					}
					} 
				}
				setState(1958);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
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
		enterRule(_localctx, 262, RULE_expr_atom);
		try {
			setState(1967);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1959);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1960);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1961);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1962);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1963);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1964);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1965);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1966);
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
		enterRule(_localctx, 264, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			match(T_INTERVAL);
			setState(1970);
			expr(0);
			setState(1971);
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
		enterRule(_localctx, 266, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1973);
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
		enterRule(_localctx, 268, RULE_expr_concat);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1975);
			expr_concat_item();
			{
			setState(1976);
			match(T_CONCAT);
			}
			setState(1977);
			expr_concat_item();
			setState(1982);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					{
					setState(1978);
					match(T_CONCAT);
					}
					setState(1979);
					expr_concat_item();
					}
					} 
				}
				setState(1984);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
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
		enterRule(_localctx, 270, RULE_expr_concat_item);
		try {
			setState(1994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1985);
				match(T_OPEN_P);
				setState(1986);
				expr(0);
				setState(1987);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1989);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1990);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1991);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1992);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1993);
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
		enterRule(_localctx, 272, RULE_expr_case);
		try {
			setState(1998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1996);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1997);
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
		enterRule(_localctx, 274, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2000);
			match(T_CASE);
			setState(2001);
			expr(0);
			setState(2007); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2002);
				match(T_WHEN);
				setState(2003);
				expr(0);
				setState(2004);
				match(T_THEN);
				setState(2005);
				expr(0);
				}
				}
				setState(2009); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2011);
				match(T_ELSE);
				setState(2012);
				expr(0);
				}
			}

			setState(2015);
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
		enterRule(_localctx, 276, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2017);
			match(T_CASE);
			setState(2023); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2018);
				match(T_WHEN);
				setState(2019);
				bool_expr(0);
				setState(2020);
				match(T_THEN);
				setState(2021);
				expr(0);
				}
				}
				setState(2025); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2027);
				match(T_ELSE);
				setState(2028);
				expr(0);
				}
			}

			setState(2031);
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
		public ExprContext expr;
		public TerminalNode T_AVG() { return getToken(PLHQLStatementsParser.T_AVG, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public Expr_func_all_distinctContext expr_func_all_distinct() {
			return getRuleContext(Expr_func_all_distinctContext.class,0);
		}
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
		enterRule(_localctx, 278, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(2185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2033);
				match(T_AVG);
				setState(2034);
				match(T_OPEN_P);
				setState(2036);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2035);
					expr_func_all_distinct();
					}
				}

				setState(2038);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				 ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("AVG", (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null))); 
				setState(2040);
				match(T_CLOSE_P);
				setState(2042);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(2041);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2044);
				match(T_COUNT);
				setState(2045);
				match(T_OPEN_P);
				setState(2053);
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
					setState(2047);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ALL || _la==T_DISTINCT) {
						{
						setState(2046);
						expr_func_all_distinct();
						}
					}

					setState(2049);
					((Expr_agg_window_funcContext)_localctx).expr = expr(0);
					 ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("COUNT", (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null))); 
					}
					}
					break;
				case T_MUL:
					{
					setState(2052);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2055);
				match(T_CLOSE_P);
				setState(2057);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
				case 1:
					{
					setState(2056);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2059);
				match(T_COUNT_BIG);
				setState(2060);
				match(T_OPEN_P);
				setState(2068);
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
					setState(2062);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ALL || _la==T_DISTINCT) {
						{
						setState(2061);
						expr_func_all_distinct();
						}
					}

					setState(2064);
					((Expr_agg_window_funcContext)_localctx).expr = expr(0);
					 ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("COUNTBIG", (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null))); 
					}
					}
					break;
				case T_MUL:
					{
					setState(2067);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2070);
				match(T_CLOSE_P);
				setState(2072);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2071);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2074);
				match(T_CUME_DIST);
				setState(2075);
				match(T_OPEN_P);
				setState(2076);
				match(T_CLOSE_P);
				setState(2077);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2078);
				match(T_DENSE_RANK);
				setState(2079);
				match(T_OPEN_P);
				setState(2080);
				match(T_CLOSE_P);
				setState(2081);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2082);
				match(T_FIRST_VALUE);
				setState(2083);
				match(T_OPEN_P);
				setState(2084);
				expr(0);
				setState(2085);
				match(T_CLOSE_P);
				setState(2086);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2088);
				match(T_LAG);
				setState(2089);
				match(T_OPEN_P);
				setState(2090);
				expr(0);
				setState(2097);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2091);
					match(T_COMMA);
					setState(2092);
					expr(0);
					setState(2095);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2093);
						match(T_COMMA);
						setState(2094);
						expr(0);
						}
					}

					}
				}

				setState(2099);
				match(T_CLOSE_P);
				setState(2100);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2102);
				match(T_LAST_VALUE);
				setState(2103);
				match(T_OPEN_P);
				setState(2104);
				expr(0);
				setState(2105);
				match(T_CLOSE_P);
				setState(2106);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(2108);
				match(T_LEAD);
				setState(2109);
				match(T_OPEN_P);
				setState(2110);
				expr(0);
				setState(2117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2111);
					match(T_COMMA);
					setState(2112);
					expr(0);
					setState(2115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2113);
						match(T_COMMA);
						setState(2114);
						expr(0);
						}
					}

					}
				}

				setState(2119);
				match(T_CLOSE_P);
				setState(2120);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(2122);
				match(T_MAX);
				setState(2123);
				match(T_OPEN_P);
				setState(2125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2124);
					expr_func_all_distinct();
					}
				}

				setState(2127);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				 ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("MAX", (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null))); 
				setState(2129);
				match(T_CLOSE_P);
				setState(2131);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
				case 1:
					{
					setState(2130);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(2133);
				match(T_MIN);
				setState(2134);
				match(T_OPEN_P);
				setState(2136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2135);
					expr_func_all_distinct();
					}
				}

				setState(2138);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				 ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("MIN", (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null))); 
				setState(2140);
				match(T_CLOSE_P);
				setState(2142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(2141);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(2144);
				match(T_RANK);
				setState(2145);
				match(T_OPEN_P);
				setState(2146);
				match(T_CLOSE_P);
				setState(2147);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(2148);
				match(T_ROW_NUMBER);
				setState(2149);
				match(T_OPEN_P);
				setState(2150);
				match(T_CLOSE_P);
				setState(2151);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(2152);
				match(T_STDEV);
				setState(2153);
				match(T_OPEN_P);
				setState(2155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2154);
					expr_func_all_distinct();
					}
				}

				setState(2157);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				 ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("STDEV", (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null))); 
				setState(2159);
				match(T_CLOSE_P);
				setState(2161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(2160);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(2163);
				match(T_SUM);
				setState(2164);
				match(T_OPEN_P);
				setState(2166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2165);
					expr_func_all_distinct();
					}
				}

				setState(2168);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				 ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("SUM", (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null))); 
				setState(2170);
				match(T_CLOSE_P);
				setState(2172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(2171);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 16);
				{
				setState(2174);
				match(T_VARIANCE);
				setState(2175);
				match(T_OPEN_P);
				setState(2177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2176);
					expr_func_all_distinct();
					}
				}

				setState(2179);
				((Expr_agg_window_funcContext)_localctx).expr = expr(0);
				 ((Subselect_stmtContext)getInvokingContext(93)).aggregateFunctionColumns.add(new Pair<>("VARIANCE", (((Expr_agg_window_funcContext)_localctx).expr!=null?_input.getText(((Expr_agg_window_funcContext)_localctx).expr.start,((Expr_agg_window_funcContext)_localctx).expr.stop):null))); 
				setState(2181);
				match(T_CLOSE_P);
				setState(2183);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(2182);
					expr_func_over_clause();
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
		enterRule(_localctx, 280, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2187);
			_la = _input.LA(1);
			if ( !(_la==T_ALL || _la==T_DISTINCT) ) {
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
		enterRule(_localctx, 282, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2189);
			match(T_OVER);
			setState(2190);
			match(T_OPEN_P);
			setState(2192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(2191);
				expr_func_partition_by_clause();
				}
			}

			setState(2195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(2194);
				order_by_clause();
				}
			}

			setState(2197);
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
		enterRule(_localctx, 284, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2199);
			match(T_PARTITION);
			setState(2200);
			match(T_BY);
			setState(2201);
			expr(0);
			setState(2206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2202);
				match(T_COMMA);
				setState(2203);
				expr(0);
				}
				}
				setState(2208);
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
		enterRule(_localctx, 286, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(2409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2209);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2210);
				match(T_CAST);
				setState(2211);
				match(T_OPEN_P);
				setState(2212);
				expr(0);
				setState(2213);
				match(T_AS);
				setState(2214);
				dtype();
				setState(2216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2215);
					dtype_len();
					}
				}

				setState(2218);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2220);
				match(T_COUNT);
				setState(2221);
				match(T_OPEN_P);
				setState(2224);
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
					setState(2222);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(2223);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2226);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2227);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2228);
				match(T_CURRENT);
				setState(2229);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2233);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(2230);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(2231);
					match(T_CURRENT);
					setState(2232);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2239);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(2235);
					match(T_OPEN_P);
					setState(2236);
					expr(0);
					setState(2237);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2241);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2242);
				match(T_CURRENT);
				setState(2243);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2244);
				match(T_MAX_PART_STRING);
				setState(2245);
				match(T_OPEN_P);
				setState(2246);
				expr(0);
				setState(2259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2247);
					match(T_COMMA);
					setState(2248);
					expr(0);
					setState(2256);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2249);
						match(T_COMMA);
						setState(2250);
						expr(0);
						setState(2251);
						match(T_EQUAL);
						setState(2252);
						expr(0);
						}
						}
						setState(2258);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2261);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2263);
				match(T_MIN_PART_STRING);
				setState(2264);
				match(T_OPEN_P);
				setState(2265);
				expr(0);
				setState(2278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2266);
					match(T_COMMA);
					setState(2267);
					expr(0);
					setState(2275);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2268);
						match(T_COMMA);
						setState(2269);
						expr(0);
						setState(2270);
						match(T_EQUAL);
						setState(2271);
						expr(0);
						}
						}
						setState(2277);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2280);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2282);
				match(T_MAX_PART_INT);
				setState(2283);
				match(T_OPEN_P);
				setState(2284);
				expr(0);
				setState(2297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2285);
					match(T_COMMA);
					setState(2286);
					expr(0);
					setState(2294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2287);
						match(T_COMMA);
						setState(2288);
						expr(0);
						setState(2289);
						match(T_EQUAL);
						setState(2290);
						expr(0);
						}
						}
						setState(2296);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2299);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2301);
				match(T_MIN_PART_INT);
				setState(2302);
				match(T_OPEN_P);
				setState(2303);
				expr(0);
				setState(2316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2304);
					match(T_COMMA);
					setState(2305);
					expr(0);
					setState(2313);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2306);
						match(T_COMMA);
						setState(2307);
						expr(0);
						setState(2308);
						match(T_EQUAL);
						setState(2309);
						expr(0);
						}
						}
						setState(2315);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2318);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2320);
				match(T_MAX_PART_DATE);
				setState(2321);
				match(T_OPEN_P);
				setState(2322);
				expr(0);
				setState(2335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2323);
					match(T_COMMA);
					setState(2324);
					expr(0);
					setState(2332);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2325);
						match(T_COMMA);
						setState(2326);
						expr(0);
						setState(2327);
						match(T_EQUAL);
						setState(2328);
						expr(0);
						}
						}
						setState(2334);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2337);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2339);
				match(T_MIN_PART_DATE);
				setState(2340);
				match(T_OPEN_P);
				setState(2341);
				expr(0);
				setState(2354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2342);
					match(T_COMMA);
					setState(2343);
					expr(0);
					setState(2351);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2344);
						match(T_COMMA);
						setState(2345);
						expr(0);
						setState(2346);
						match(T_EQUAL);
						setState(2347);
						expr(0);
						}
						}
						setState(2353);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2356);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2358);
				match(T_PART_COUNT);
				setState(2359);
				match(T_OPEN_P);
				setState(2360);
				expr(0);
				setState(2368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2361);
					match(T_COMMA);
					setState(2362);
					expr(0);
					setState(2363);
					match(T_EQUAL);
					setState(2364);
					expr(0);
					}
					}
					setState(2370);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2371);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2373);
				match(T_PART_LOC);
				setState(2374);
				match(T_OPEN_P);
				setState(2375);
				expr(0);
				setState(2381); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2376);
						match(T_COMMA);
						setState(2377);
						expr(0);
						setState(2378);
						match(T_EQUAL);
						setState(2379);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2383); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,288,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2385);
					match(T_COMMA);
					setState(2386);
					expr(0);
					}
				}

				setState(2389);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2391);
				match(T_TRIM);
				setState(2392);
				match(T_OPEN_P);
				setState(2393);
				expr(0);
				setState(2394);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2396);
				match(T_SUBSTRING);
				setState(2397);
				match(T_OPEN_P);
				setState(2398);
				expr(0);
				setState(2399);
				match(T_FROM);
				setState(2400);
				expr(0);
				setState(2403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(2401);
					match(T_FOR);
					setState(2402);
					expr(0);
					}
				}

				setState(2405);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2407);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2408);
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
		enterRule(_localctx, 288, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2411);
			ident();
			setState(2412);
			match(T_OPEN_P);
			setState(2414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,292,_ctx) ) {
			case 1:
				{
				setState(2413);
				expr_func_params();
				}
				break;
			}
			setState(2416);
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
		enterRule(_localctx, 290, RULE_expr_func_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2418);
			func_param();
			setState(2423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,293,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2419);
					match(T_COMMA);
					setState(2420);
					func_param();
					}
					} 
				}
				setState(2425);
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
		enterRule(_localctx, 292, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2426);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(2432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
			case 1:
				{
				setState(2427);
				ident();
				setState(2428);
				match(T_EQUAL);
				setState(2430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
					{
					setState(2429);
					match(T_GREATER);
					}
				}

				}
				break;
			}
			setState(2434);
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
		enterRule(_localctx, 294, RULE_error_missing_right_p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2436);
			match(T_OPEN_P);
			setState(2440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,296,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2437);
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
				setState(2442);
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
		enterRule(_localctx, 296, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2445);
			match(T_DATE);
			setState(2446);
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
		enterRule(_localctx, 298, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2448);
			match(T_TIMESTAMP);
			setState(2449);
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
		enterRule(_localctx, 300, RULE_assignment_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2451);
			_la = _input.LA(1);
			if ( !(((((_la - 351)) & ~0x3f) == 0 && ((1L << (_la - 351)) & ((1L << (T_PLUS_EQUAL - 351)) | (1L << (T_MINUS_EQUAL - 351)) | (1L << (T_TIMES_EQUAL - 351)) | (1L << (T_DIVIDE_EQUAL - 351)) | (1L << (T_MOD_EQUAL - 351)) | (1L << (T_EQUAL - 351)))) != 0)) ) {
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
		enterRule(_localctx, 302, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2453);
			match(L_ID);
			}
			setState(2458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2454);
					match(T__3);
					{
					setState(2455);
					match(L_ID);
					}
					}
					} 
				}
				setState(2460);
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
		enterRule(_localctx, 304, RULE_string);
		try {
			setState(2463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2461);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2462);
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
		enterRule(_localctx, 306, RULE_error_string);
		try {
			setState(2469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING_MISSING_RIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2465);
				match(L_S_STRING_MISSING_RIGHT);
				notifyErrorListeners("Expected right quote");
				}
				break;
			case L_D_STRING_MISSING_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2467);
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
		enterRule(_localctx, 308, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2471);
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

			setState(2474);
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
		enterRule(_localctx, 310, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2476);
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

			setState(2479);
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
		enterRule(_localctx, 312, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2481);
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
		enterRule(_localctx, 314, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2483);
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
		enterRule(_localctx, 316, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2485);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ACTION) | (1L << T_ADD2) | (1L << T_ALL) | (1L << T_ALLOCATE) | (1L << T_ALTER) | (1L << T_AND) | (1L << T_ANSI_NULLS) | (1L << T_ANSI_PADDING) | (1L << T_AS) | (1L << T_ASC) | (1L << T_ASSOCIATE) | (1L << T_AT) | (1L << T_AUTO_INCREMENT) | (1L << T_AVG) | (1L << T_BATCHSIZE) | (1L << T_BEGIN) | (1L << T_BETWEEN) | (1L << T_BIGINT) | (1L << T_BINARY_DOUBLE) | (1L << T_BINARY_FLOAT) | (1L << T_BIT) | (1L << T_BODY) | (1L << T_BREAK) | (1L << T_BY) | (1L << T_BYTE) | (1L << T_CALL) | (1L << T_CALLER) | (1L << T_CASCADE) | (1L << T_CASE) | (1L << T_CASESPECIFIC) | (1L << T_CAST) | (1L << T_CHAR) | (1L << T_CHARACTER) | (1L << T_CHARSET) | (1L << T_CLIENT) | (1L << T_CLOSE) | (1L << T_CLUSTERED) | (1L << T_CMP) | (1L << T_COLLECT) | (1L << T_COLLECTION) | (1L << T_COLUMN) | (1L << T_COMMENT) | (1L << T_CONSTANT) | (1L << T_COMMIT) | (1L << T_COMPRESS) | (1L << T_CONCAT) | (1L << T_CONDITION) | (1L << T_CONSTRAINT) | (1L << T_CONTINUE) | (1L << T_COPY) | (1L << T_COUNT) | (1L << T_COUNT_BIG) | (1L << T_CREATE) | (1L << T_CREATION) | (1L << T_CREATOR) | (1L << T_CS) | (1L << T_CURRENT) | (1L << T_CURRENT_SCHEMA))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T_CURSOR - 64)) | (1L << (T_DATABASE - 64)) | (1L << (T_DATA - 64)) | (1L << (T_DATE - 64)) | (1L << (T_DATETIME - 64)) | (1L << (T_DAY - 64)) | (1L << (T_DAYS - 64)) | (1L << (T_DEC - 64)) | (1L << (T_DECIMAL - 64)) | (1L << (T_DECLARE - 64)) | (1L << (T_DEFAULT - 64)) | (1L << (T_DEFERRED - 64)) | (1L << (T_DEFINED - 64)) | (1L << (T_DEFINER - 64)) | (1L << (T_DEFINITION - 64)) | (1L << (T_DELETE - 64)) | (1L << (T_DELIMITED - 64)) | (1L << (T_DELIMITER - 64)) | (1L << (T_DESC - 64)) | (1L << (T_DESCRIBE - 64)) | (1L << (T_DIAGNOSTICS - 64)) | (1L << (T_DIR - 64)) | (1L << (T_DIRECTORY - 64)) | (1L << (T_DISTINCT - 64)) | (1L << (T_DISTRIBUTE - 64)) | (1L << (T_DO - 64)) | (1L << (T_DOUBLE - 64)) | (1L << (T_DROP - 64)) | (1L << (T_DYNAMIC - 64)) | (1L << (T_ENABLE - 64)) | (1L << (T_ENGINE - 64)) | (1L << (T_ESCAPED - 64)) | (1L << (T_EXCEPT - 64)) | (1L << (T_EXEC - 64)) | (1L << (T_EXECUTE - 64)) | (1L << (T_EXCEPTION - 64)) | (1L << (T_EXCLUSIVE - 64)) | (1L << (T_EXISTS - 64)) | (1L << (T_EXIT - 64)) | (1L << (T_FALLBACK - 64)) | (1L << (T_FALSE - 64)) | (1L << (T_FETCH - 64)) | (1L << (T_FIELDS - 64)) | (1L << (T_FILE - 64)) | (1L << (T_FILES - 64)) | (1L << (T_FLOAT - 64)) | (1L << (T_FOR - 64)) | (1L << (T_FOREIGN - 64)) | (1L << (T_FORMAT - 64)) | (1L << (T_FOUND - 64)) | (1L << (T_FROM - 64)) | (1L << (T_FULL - 64)) | (1L << (T_FUNCTION - 64)) | (1L << (T_GET - 64)) | (1L << (T_GLOBAL - 64)) | (1L << (T_GO - 64)) | (1L << (T_GRANT - 64)) | (1L << (T_GROUP - 64)) | (1L << (T_HANDLER - 64)) | (1L << (T_HASH - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T_HAVING - 128)) | (1L << (T_HDFS - 128)) | (1L << (T_HIVE - 128)) | (1L << (T_HOST - 128)) | (1L << (T_IDENTITY - 128)) | (1L << (T_IF - 128)) | (1L << (T_IGNORE - 128)) | (1L << (T_IMMEDIATE - 128)) | (1L << (T_IN - 128)) | (1L << (T_INCLUDE - 128)) | (1L << (T_INDEX - 128)) | (1L << (T_INITRANS - 128)) | (1L << (T_INNER - 128)) | (1L << (T_INOUT - 128)) | (1L << (T_INSERT - 128)) | (1L << (T_INT - 128)) | (1L << (T_INT2 - 128)) | (1L << (T_INT4 - 128)) | (1L << (T_INT8 - 128)) | (1L << (T_INTEGER - 128)) | (1L << (T_INTERSECT - 128)) | (1L << (T_INTERVAL - 128)) | (1L << (T_INTO - 128)) | (1L << (T_INVOKER - 128)) | (1L << (T_IS - 128)) | (1L << (T_ISOPEN - 128)) | (1L << (T_ITEMS - 128)) | (1L << (T_JOIN - 128)) | (1L << (T_KEEP - 128)) | (1L << (T_KEY - 128)) | (1L << (T_KEYS - 128)) | (1L << (T_LANGUAGE - 128)) | (1L << (T_LEAVE - 128)) | (1L << (T_LEFT - 128)) | (1L << (T_LIKE - 128)) | (1L << (T_LIMIT - 128)) | (1L << (T_LINES - 128)) | (1L << (T_LOCAL - 128)) | (1L << (T_LOCATION - 128)) | (1L << (T_LOCATOR - 128)) | (1L << (T_LOCATORS - 128)) | (1L << (T_LOCKS - 128)) | (1L << (T_LOG - 128)) | (1L << (T_LOGGED - 128)) | (1L << (T_LOGGING - 128)) | (1L << (T_LOOP - 128)) | (1L << (T_MAP - 128)) | (1L << (T_MATCHED - 128)) | (1L << (T_MAX - 128)) | (1L << (T_MAXTRANS - 128)) | (1L << (T_MERGE - 128)) | (1L << (T_MESSAGE_TEXT - 128)) | (1L << (T_MICROSECOND - 128)) | (1L << (T_MICROSECONDS - 128)) | (1L << (T_MIN - 128)) | (1L << (T_MULTISET - 128)) | (1L << (T_NCHAR - 128)) | (1L << (T_NEW - 128)) | (1L << (T_NVARCHAR - 128)) | (1L << (T_NO - 128)) | (1L << (T_NOCOUNT - 128)) | (1L << (T_NOCOMPRESS - 128)) | (1L << (T_NOLOGGING - 128)) | (1L << (T_NONE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOT - 192)) | (1L << (T_NOTFOUND - 192)) | (1L << (T_NUMERIC - 192)) | (1L << (T_NUMBER - 192)) | (1L << (T_OBJECT - 192)) | (1L << (T_OFF - 192)) | (1L << (T_ON - 192)) | (1L << (T_ONLY - 192)) | (1L << (T_OPEN - 192)) | (1L << (T_OR - 192)) | (1L << (T_ORDER - 192)) | (1L << (T_OUT - 192)) | (1L << (T_OUTER - 192)) | (1L << (T_OVER - 192)) | (1L << (T_OVERWRITE - 192)) | (1L << (T_OWNER - 192)) | (1L << (T_PACKAGE - 192)) | (1L << (T_PARTITION - 192)) | (1L << (T_PCTFREE - 192)) | (1L << (T_PCTUSED - 192)) | (1L << (T_PRECISION - 192)) | (1L << (T_PRESERVE - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_PRINT - 192)) | (1L << (T_PROC - 192)) | (1L << (T_PROCEDURE - 192)) | (1L << (T_QUALIFY - 192)) | (1L << (T_QUERY_BAND - 192)) | (1L << (T_QUIT - 192)) | (1L << (T_QUOTED_IDENTIFIER - 192)) | (1L << (T_RAISE - 192)) | (1L << (T_REAL - 192)) | (1L << (T_REFERENCES - 192)) | (1L << (T_REGEXP - 192)) | (1L << (T_REPLACE - 192)) | (1L << (T_RESIGNAL - 192)) | (1L << (T_RESTRICT - 192)) | (1L << (T_RESULT - 192)) | (1L << (T_RESULT_SET_LOCATOR - 192)) | (1L << (T_RETURN - 192)) | (1L << (T_RETURNS - 192)) | (1L << (T_REVERSE - 192)) | (1L << (T_RIGHT - 192)) | (1L << (T_RLIKE - 192)) | (1L << (T_ROLE - 192)) | (1L << (T_ROLLBACK - 192)) | (1L << (T_ROW - 192)) | (1L << (T_ROWS - 192)) | (1L << (T_ROW_COUNT - 192)) | (1L << (T_RR - 192)) | (1L << (T_RS - 192)) | (1L << (T_PWD - 192)) | (1L << (T_TRIM - 192)) | (1L << (T_SCHEMA - 192)) | (1L << (T_SECOND - 192)) | (1L << (T_SECONDS - 192)) | (1L << (T_SECURITY - 192)) | (1L << (T_SEGMENT - 192)) | (1L << (T_SEL - 192)) | (1L << (T_SELECT - 192)) | (1L << (T_SET - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (T_SESSION - 256)) | (1L << (T_SESSIONS - 256)) | (1L << (T_SETS - 256)) | (1L << (T_SHARE - 256)) | (1L << (T_SIGNAL - 256)) | (1L << (T_SIMPLE_DOUBLE - 256)) | (1L << (T_SIMPLE_FLOAT - 256)) | (1L << (T_SMALLDATETIME - 256)) | (1L << (T_SMALLINT - 256)) | (1L << (T_SQL - 256)) | (1L << (T_SQLEXCEPTION - 256)) | (1L << (T_SQLINSERT - 256)) | (1L << (T_SQLSTATE - 256)) | (1L << (T_SQLWARNING - 256)) | (1L << (T_STATS - 256)) | (1L << (T_STATISTICS - 256)) | (1L << (T_STEP - 256)) | (1L << (T_STORAGE - 256)) | (1L << (T_STORED - 256)) | (1L << (T_STRING - 256)) | (1L << (T_SUBDIR - 256)) | (1L << (T_SUBSTRING - 256)) | (1L << (T_SUM - 256)) | (1L << (T_SUMMARY - 256)) | (1L << (T_SYS_REFCURSOR - 256)) | (1L << (T_TABLE - 256)) | (1L << (T_TABLESPACE - 256)) | (1L << (T_TEMPORARY - 256)) | (1L << (T_TERMINATED - 256)) | (1L << (T_TEXTIMAGE_ON - 256)) | (1L << (T_THEN - 256)) | (1L << (T_TIMESTAMP - 256)) | (1L << (T_TITLE - 256)) | (1L << (T_TO - 256)) | (1L << (T_TOP - 256)) | (1L << (T_TRANSACTION - 256)) | (1L << (T_TRUE - 256)) | (1L << (T_TRUNCATE - 256)) | (1L << (T_UNIQUE - 256)) | (1L << (T_UPDATE - 256)) | (1L << (T_UR - 256)) | (1L << (T_USE - 256)) | (1L << (T_USING - 256)) | (1L << (T_VALUE - 256)) | (1L << (T_VALUES - 256)) | (1L << (T_VAR - 256)) | (1L << (T_VARCHAR - 256)) | (1L << (T_VARCHAR2 - 256)) | (1L << (T_VARYING - 256)) | (1L << (T_VOLATILE - 256)) | (1L << (T_WHILE - 256)) | (1L << (T_WITH - 256)) | (1L << (T_WITHOUT - 256)) | (1L << (T_WORK - 256)) | (1L << (T_XACT_ABORT - 256)) | (1L << (T_XML - 256)) | (1L << (T_YES - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (T_ACTIVITY_COUNT - 320)) | (1L << (T_CUME_DIST - 320)) | (1L << (T_CURRENT_DATE - 320)) | (1L << (T_CURRENT_TIMESTAMP - 320)) | (1L << (T_CURRENT_USER - 320)) | (1L << (T_DENSE_RANK - 320)) | (1L << (T_FIRST_VALUE - 320)) | (1L << (T_LAG - 320)) | (1L << (T_LAST_VALUE - 320)) | (1L << (T_LEAD - 320)) | (1L << (T_PART_COUNT - 320)) | (1L << (T_PART_LOC - 320)) | (1L << (T_RANK - 320)) | (1L << (T_ROW_NUMBER - 320)) | (1L << (T_STDEV - 320)) | (1L << (T_SYSDATE - 320)) | (1L << (T_VARIANCE - 320)) | (1L << (T_USER - 320)))) != 0)) ) {
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
		enterRule(_localctx, 318, RULE_error_invalid_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2487);
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
		case 130:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 146:
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
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 16);
		case 10:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean func_param_sempred(Func_paramContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO");
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0185\u09bd\4\2\t"+
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
		"\t\u00a0\4\u00a1\t\u00a1\3\2\6\2\u0144\n\2\r\2\16\2\u0145\3\2\3\2\3\3"+
		"\3\3\3\3\5\3\u014d\n\3\3\3\5\3\u0150\n\3\6\3\u0152\n\3\r\3\16\3\u0153"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0160\n\4\3\5\5\5\u0163\n"+
		"\5\3\5\3\5\3\5\3\5\3\6\5\6\u016a\n\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u0176\n\7\5\7\u0178\n\7\3\b\3\b\3\b\3\t\3\t\6\t\u017f\n\t\r"+
		"\t\16\t\u0180\3\t\5\t\u0184\n\t\5\t\u0186\n\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0199\n\n\3\13\3\13\7"+
		"\13\u019d\n\13\f\13\16\13\u01a0\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01b4\n\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\7\17\u01bd\n\17\f\17\16\17\u01c0\13\17\3\20\3\20"+
		"\3\20\7\20\u01c5\n\20\f\20\16\20\u01c8\13\20\3\21\3\21\3\21\5\21\u01cd"+
		"\n\21\3\22\3\22\5\22\u01d1\n\22\3\23\3\23\5\23\u01d5\n\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\5\23\u01de\n\23\3\23\3\23\3\23\5\23\u01e3\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u01ea\n\24\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u01f1\n\25\3\26\3\26\3\26\3\26\7\26\u01f7\n\26\f\26\16\26\u01fa\13\26"+
		"\3\26\3\26\5\26\u01fe\n\26\3\26\3\26\3\26\3\26\3\26\7\26\u0205\n\26\f"+
		"\26\16\26\u0208\13\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0210\n\27\f"+
		"\27\16\27\u0213\13\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u021b\n\27\f"+
		"\27\16\27\u021e\13\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\7\30\u0227\n"+
		"\30\f\30\16\30\u022a\13\30\3\30\3\30\5\30\u022e\n\30\3\30\5\30\u0231\n"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\32\5\32\u023d\n\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\7\33\u0245\n\33\f\33\16\33\u0248\13\33"+
		"\3\34\3\34\3\34\7\34\u024d\n\34\f\34\16\34\u0250\13\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\7\35\u025a\n\35\f\35\16\35\u025d\13\35\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u0264\n\36\f\36\16\36\u0267\13\36\3\37\3\37"+
		"\3 \3 \3 \7 \u026e\n \f \16 \u0271\13 \3 \5 \u0274\n \3 \3 \5 \u0278\n"+
		" \3 \7 \u027b\n \f \16 \u027e\13 \3 \5 \u0281\n \3 \3 \3 \5 \u0286\n "+
		"\3 \3 \5 \u028a\n \3 \3 \5 \u028e\n \3!\3!\3!\3!\3!\5!\u0295\n!\3!\3!"+
		"\3!\3!\3\"\3\"\3\"\5\"\u029e\n\"\3#\3#\3#\3#\5#\u02a4\n#\3#\3#\5#\u02a8"+
		"\n#\3#\3#\3#\3$\3$\3$\3$\5$\u02b1\n$\3$\5$\u02b4\n$\3$\3$\3$\5$\u02b9"+
		"\n$\3$\3$\3%\5%\u02be\n%\3%\3%\3%\3%\3%\5%\u02c5\n%\3%\3%\3%\3%\3%\5%"+
		"\u02cc\n%\3%\5%\u02cf\n%\3&\3&\3&\7&\u02d4\n&\f&\16&\u02d7\13&\3\'\3\'"+
		"\5\'\u02db\n\'\3\'\7\'\u02de\n\'\f\'\16\'\u02e1\13\'\3\'\3\'\7\'\u02e5"+
		"\n\'\f\'\16\'\u02e8\13\'\3\'\3\'\5\'\u02ec\n\'\3\'\5\'\u02ef\n\'\3(\3"+
		"(\3)\3)\5)\u02f5\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0301\n)\f)\16)\u0304"+
		"\13)\3)\3)\3)\3)\3)\7)\u030b\n)\f)\16)\u030e\13)\3)\3)\3)\5)\u0313\n)"+
		"\3*\3*\3*\5*\u0318\n*\3*\3*\3*\5*\u031d\n*\3*\3*\3*\5*\u0322\n*\7*\u0324"+
		"\n*\f*\16*\u0327\13*\3*\3*\5*\u032b\n*\3*\3*\3*\3*\3*\3*\7*\u0333\n*\f"+
		"*\16*\u0336\13*\3*\3*\3*\3*\3*\3*\3*\7*\u033f\n*\f*\16*\u0342\13*\3*\3"+
		"*\7*\u0346\n*\f*\16*\u0349\13*\5*\u034b\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\5+\u0357\n+\3,\3,\3,\3,\3-\5-\u035e\n-\3-\3-\3.\6.\u0363\n.\r.\16"+
		".\u0364\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0371\n/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\6\60\u037e\n\60\r\60\16\60\u037f\3"+
		"\60\3\60\3\60\5\60\u0385\n\60\3\61\5\61\u0388\n\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u0395\n\61\f\61\16\61\u0398\13"+
		"\61\3\61\3\61\3\61\5\61\u039d\n\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\5\61\u03a8\n\61\3\62\5\62\u03ab\n\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\7\62\u03b3\n\62\f\62\16\62\u03b6\13\62\3\62\3\62\3\62\3\62\5"+
		"\62\u03bc\n\62\3\63\3\63\3\63\3\63\5\63\u03c2\n\63\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u03d0\n\65\3\66\3\66\5\66"+
		"\u03d4\n\66\3\66\3\66\3\66\5\66\u03d9\n\66\3\66\3\66\5\66\u03dd\n\66\3"+
		"\66\3\66\3\66\5\66\u03e2\n\66\3\66\5\66\u03e5\n\66\3\66\3\66\3\66\5\66"+
		"\u03ea\n\66\3\66\5\66\u03ed\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\5\67\u03fb\n\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u041b\n\67\5\67"+
		"\u041d\n\67\38\38\38\58\u0422\n8\38\38\58\u0426\n8\38\38\39\59\u042b\n"+
		"9\39\39\39\39\39\59\u0432\n9\39\59\u0435\n9\3:\5:\u0438\n:\3:\3:\3:\5"+
		":\u043d\n:\3:\3:\5:\u0441\n:\5:\u0443\n:\3;\3;\3;\3;\3;\5;\u044a\n;\3"+
		";\3;\7;\u044e\n;\f;\16;\u0451\13;\3<\3<\3<\3<\5<\u0457\n<\3=\3=\3=\3="+
		"\5=\u045d\n=\3=\3=\3=\3>\3>\3>\7>\u0465\n>\f>\16>\u0468\13>\3?\3?\3?\3"+
		"@\3@\3@\5@\u0470\n@\3@\5@\u0473\n@\3@\3@\5@\u0477\n@\3@\5@\u047a\n@\3"+
		"@\5@\u047d\n@\3@\3@\3@\3@\5@\u0483\n@\3A\3A\3A\3A\3A\3A\7A\u048b\nA\f"+
		"A\16A\u048e\13A\3A\3A\3A\3A\3A\3A\7A\u0496\nA\fA\16A\u0499\13A\5A\u049b"+
		"\nA\3B\3B\3B\3B\3B\5B\u04a2\nB\3B\3B\3B\5B\u04a7\nB\3B\7B\u04aa\nB\fB"+
		"\16B\u04ad\13B\3B\5B\u04b0\nB\3B\3B\3B\3B\3B\3B\5B\u04b8\nB\3B\3B\5B\u04bc"+
		"\nB\3B\7B\u04bf\nB\fB\16B\u04c2\13B\3B\5B\u04c5\nB\5B\u04c7\nB\3C\3C\5"+
		"C\u04cb\nC\3C\3C\3C\3C\3C\3C\5C\u04d3\nC\3C\3C\3C\3C\7C\u04d9\nC\fC\16"+
		"C\u04dc\13C\5C\u04de\nC\3D\3D\3D\5D\u04e3\nD\3E\3E\3E\3E\3E\3E\3F\3F\3"+
		"F\5F\u04ee\nF\3G\3G\3G\3G\3G\7G\u04f5\nG\fG\16G\u04f8\13G\3G\5G\u04fb"+
		"\nG\3G\3G\3G\3H\3H\3H\3H\7H\u0504\nH\fH\16H\u0507\13H\3H\5H\u050a\nH\3"+
		"H\3H\3H\3H\3I\3I\3I\3I\3I\5I\u0515\nI\3J\3J\3J\3J\5J\u051b\nJ\3J\3J\3"+
		"K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N\3O\3O\5O\u0535"+
		"\nO\3O\3O\3O\3O\3O\3O\3O\3O\7O\u053f\nO\fO\16O\u0542\13O\3O\3O\3P\3P\5"+
		"P\u0548\nP\3P\3P\3P\3P\7P\u054e\nP\fP\16P\u0551\13P\3P\3P\3P\3Q\3Q\5Q"+
		"\u0558\nQ\3R\3R\5R\u055c\nR\3S\3S\3S\3S\5S\u0562\nS\3S\3S\3S\3S\3S\5S"+
		"\u0569\nS\3S\3S\3S\3S\3S\3T\3T\3T\5T\u0573\nT\3T\3T\5T\u0577\nT\3T\3T"+
		"\5T\u057b\nT\3T\3T\3T\3U\3U\5U\u0582\nU\3U\3U\3U\5U\u0587\nU\3U\3U\3U"+
		"\3U\5U\u058d\nU\7U\u058f\nU\fU\16U\u0592\13U\3U\3U\3V\5V\u0597\nV\3V\3"+
		"V\3V\3V\3W\3W\3W\3W\5W\u05a1\nW\3W\3W\3W\3W\3W\5W\u05a8\nW\3W\3W\3W\3"+
		"W\3W\3W\3W\3W\3W\5W\u05b3\nW\3W\3W\3W\3W\3W\5W\u05ba\nW\3W\3W\3W\3W\3"+
		"W\3W\3W\3W\5W\u05c4\nW\3W\3W\3W\3W\3W\5W\u05cb\nW\3W\3W\3W\3W\3W\5W\u05d2"+
		"\nW\3X\5X\u05d5\nX\3X\3X\3Y\3Y\3Y\3Y\7Y\u05dd\nY\fY\16Y\u05e0\13Y\3Z\3"+
		"Z\5Z\u05e4\nZ\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\7[\u05ef\n[\f[\16[\u05f2\13["+
		"\3[\3[\3\\\3\\\3\\\3\\\7\\\u05fa\n\\\f\\\16\\\u05fd\13\\\3]\3]\3]\3]\3"+
		"]\5]\u0604\n]\3^\3^\5^\u0608\n^\3^\3^\5^\u060c\n^\3^\3^\5^\u0610\n^\5"+
		"^\u0612\n^\3_\3_\3_\5_\u0617\n_\3_\3_\5_\u061b\n_\3_\5_\u061e\n_\3_\3"+
		"_\5_\u0622\n_\3_\5_\u0625\n_\3`\3`\3`\5`\u062a\n`\3`\5`\u062d\n`\3`\5"+
		"`\u0630\n`\3`\3`\5`\u0634\n`\3`\5`\u0637\n`\3`\3`\3`\5`\u063c\n`\3a\5"+
		"a\u063f\na\3a\5a\u0642\na\3a\3a\3a\7a\u0647\na\fa\16a\u064a\13a\3b\3b"+
		"\3b\5b\u064f\nb\3c\3c\3c\3d\3d\3d\5d\u0657\nd\3d\3d\5d\u065b\nd\3d\5d"+
		"\u065e\nd\3d\3d\3e\3e\5e\u0664\ne\3e\3e\3e\3e\3e\5e\u066b\ne\3f\3f\5f"+
		"\u066f\nf\3f\3f\3g\3g\3g\3g\7g\u0677\ng\fg\16g\u067a\13g\3h\3h\3h\7h\u067f"+
		"\nh\fh\16h\u0682\13h\3i\3i\7i\u0686\ni\fi\16i\u0689\13i\3j\3j\3j\5j\u068e"+
		"\nj\3k\3k\5k\u0692\nk\3k\3k\3l\3l\3l\3l\5l\u069a\nl\3m\3m\3m\3m\3m\3m"+
		"\3m\3m\5m\u06a4\nm\3n\5n\u06a7\nn\3n\3n\3n\5n\u06ac\nn\3n\5n\u06af\nn"+
		"\3o\3o\3o\3o\3o\3o\7o\u06b7\no\fo\16o\u06ba\13o\3o\3o\5o\u06be\no\3p\3"+
		"p\3p\3p\3p\7p\u06c5\np\fp\16p\u06c8\13p\3p\3p\5p\u06cc\np\3q\3q\5q\u06d0"+
		"\nq\3q\3q\3q\3q\3q\7q\u06d7\nq\fq\16q\u06da\13q\3q\5q\u06dd\nq\3r\3r\3"+
		"s\3s\3s\3s\3t\3t\3t\3u\3u\3u\3u\3u\3u\3u\3u\7u\u06f0\nu\fu\16u\u06f3\13"+
		"u\3v\3v\3v\3w\3w\3w\3x\3x\3x\3x\3x\3x\3x\3x\3x\3x\7x\u0705\nx\fx\16x\u0708"+
		"\13x\3y\3y\3y\5y\u070d\ny\3z\3z\5z\u0711\nz\3z\3z\3z\3z\3z\5z\u0718\n"+
		"z\3z\3z\3z\3z\7z\u071e\nz\fz\16z\u0721\13z\3{\3{\3{\5{\u0726\n{\3|\3|"+
		"\3|\5|\u072b\n|\3|\3|\3|\3|\3|\3|\3|\3|\3|\5|\u0736\n|\3|\3|\3|\3|\3|"+
		"\3|\3|\5|\u073f\n|\3}\3}\5}\u0743\n}\3}\3}\3}\3}\3}\7}\u074a\n}\f}\16"+
		"}\u074d\13}\3}\5}\u0750\n}\3}\3}\3~\3~\3~\3~\7~\u0758\n~\f~\16~\u075b"+
		"\13~\3~\3~\5~\u075f\n~\3~\3~\3~\3~\3~\3\177\3\177\3\177\3\177\3\u0080"+
		"\3\u0080\5\u0080\u076c\n\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u077a"+
		"\n\u0083\3\u0083\5\u0083\u077d\n\u0083\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\5\u0084\u0790\n\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\7\u0084"+
		"\u07a5\n\u0084\f\u0084\16\u0084\u07a8\13\u0084\3\u0085\3\u0085\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u07b2\n\u0085\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\7\u0088\u07bf\n\u0088\f\u0088\16\u0088\u07c2\13\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089"+
		"\u07cd\n\u0089\3\u008a\3\u008a\5\u008a\u07d1\n\u008a\3\u008b\3\u008b\3"+
		"\u008b\3\u008b\3\u008b\3\u008b\3\u008b\6\u008b\u07da\n\u008b\r\u008b\16"+
		"\u008b\u07db\3\u008b\3\u008b\5\u008b\u07e0\n\u008b\3\u008b\3\u008b\3\u008c"+
		"\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\6\u008c\u07ea\n\u008c\r\u008c"+
		"\16\u008c\u07eb\3\u008c\3\u008c\5\u008c\u07f0\n\u008c\3\u008c\3\u008c"+
		"\3\u008d\3\u008d\3\u008d\5\u008d\u07f7\n\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\5\u008d\u07fd\n\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0802\n"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0808\n\u008d\3\u008d\3"+
		"\u008d\5\u008d\u080c\n\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0811\n\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0817\n\u008d\3\u008d\3\u008d"+
		"\5\u008d\u081b\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0832\n\u008d"+
		"\5\u008d\u0834\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\5\u008d\u0846\n\u008d\5\u008d\u0848\n\u008d\3\u008d\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0850\n\u008d\3\u008d\3\u008d\3"+
		"\u008d\3\u008d\5\u008d\u0856\n\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u085b"+
		"\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0861\n\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\5\u008d\u086e\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d"+
		"\u0874\n\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0879\n\u008d\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\5\u008d\u087f\n\u008d\3\u008d\3\u008d\3\u008d\5"+
		"\u008d\u0884\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u088a\n\u008d"+
		"\5\u008d\u088c\n\u008d\3\u008e\3\u008e\3\u008f\3\u008f\3\u008f\5\u008f"+
		"\u0893\n\u008f\3\u008f\5\u008f\u0896\n\u008f\3\u008f\3\u008f\3\u0090\3"+
		"\u0090\3\u0090\3\u0090\3\u0090\7\u0090\u089f\n\u0090\f\u0090\16\u0090"+
		"\u08a2\13\u0090\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\5\u0091\u08ab\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\5\u0091\u08b3\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\5\u0091\u08bc\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091"+
		"\u08c2\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u08d1\n\u0091"+
		"\f\u0091\16\u0091\u08d4\13\u0091\5\u0091\u08d6\n\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\7\u0091\u08e4\n\u0091\f\u0091\16\u0091\u08e7\13\u0091\5\u0091"+
		"\u08e9\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u08f7\n\u0091\f\u0091"+
		"\16\u0091\u08fa\13\u0091\5\u0091\u08fc\n\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\7\u0091\u090a\n\u0091\f\u0091\16\u0091\u090d\13\u0091\5\u0091\u090f\n"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u091d\n\u0091\f\u0091\16\u0091"+
		"\u0920\13\u0091\5\u0091\u0922\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091"+
		"\u0930\n\u0091\f\u0091\16\u0091\u0933\13\u0091\5\u0091\u0935\n\u0091\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\7\u0091\u0941\n\u0091\f\u0091\16\u0091\u0944\13\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\6\u0091\u0950\n\u0091\r\u0091\16\u0091\u0951\3\u0091\3\u0091\5\u0091"+
		"\u0956\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u0966"+
		"\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u096c\n\u0091\3\u0092"+
		"\3\u0092\3\u0092\5\u0092\u0971\n\u0092\3\u0092\3\u0092\3\u0093\3\u0093"+
		"\3\u0093\7\u0093\u0978\n\u0093\f\u0093\16\u0093\u097b\13\u0093\3\u0094"+
		"\3\u0094\3\u0094\3\u0094\5\u0094\u0981\n\u0094\5\u0094\u0983\n\u0094\3"+
		"\u0094\3\u0094\3\u0095\3\u0095\7\u0095\u0989\n\u0095\f\u0095\16\u0095"+
		"\u098c\13\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\3\u0097\3\u0097"+
		"\3\u0097\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\7\u0099\u099b\n\u0099"+
		"\f\u0099\16\u0099\u099e\13\u0099\3\u009a\3\u009a\5\u009a\u09a2\n\u009a"+
		"\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u09a8\n\u009b\3\u009c\5\u009c"+
		"\u09ab\n\u009c\3\u009c\3\u009c\3\u009d\5\u009d\u09b0\n\u009d\3\u009d\3"+
		"\u009d\3\u009e\3\u009e\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1"+
		"\3\u00a1\3\u00a1\2\4\u00f2\u0106\u00a2\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\2\"\5\2\3\4\u015f\u015f\u0177\u0177\4\2\u016f\u016f\u0173\u0173\4\2\u00b9"+
		"\u00b9\u0101\u0101\4\2\20\20TT\4\2QQ\u012d\u012d\4\2mm\u00ac\u00ac\4\2"+
		"QQ\u00d9\u00d9\4\2MM\u0089\u0089\5\2\u008d\u008d\u00b3\u00b3\u00d5\u00d6"+
		"\4\2\u00ae\u00ae\u00c0\u00c0\4\2\u00bd\u00bd\u0141\u0141\4\2\u00f4\u00f4"+
		"\u012a\u012a\4\2\u00b2\u00b2\u017e\u017e\4\2  \'\'\4\2%%??\4\2CC\u00fa"+
		"\u00fa\3\2\u00dc\u00dd\4\2\17\17\u009a\u009a\3\2gh\3\2`a\4\2\37\37\u0113"+
		"\u0113\3\2\u00ff\u0100\5\2yy\u00a3\u00a3\u00ee\u00ee\5\2nn\u00c4\u00c4"+
		"\u0128\u0128\5\2\u00a4\u00a4\u00e5\u00e5\u00ef\u00ef\5\2GH\u00b6\u00b7"+
		"\u00fb\u00fc\4\2\t\tYY\3\2\u0175\u0175\3\2\u0161\u0166\4\2\u015a\u015a"+
		"\u0178\u0178\4\2nn\u0128\u0128\17\2\7\32\34^bbd\u00c3\u00c5\u00d6\u00d8"+
		"\u00f3\u00f5\u0108\u010a\u0122\u0124\u0129\u012c\u0136\u0138\u0138\u013b"+
		"\u014b\u0152\u0159\2\u0afa\2\u0143\3\2\2\2\4\u0151\3\2\2\2\6\u015f\3\2"+
		"\2\2\b\u0162\3\2\2\2\n\u0169\3\2\2\2\f\u0177\3\2\2\2\16\u0179\3\2\2\2"+
		"\20\u0185\3\2\2\2\22\u0198\3\2\2\2\24\u019a\3\2\2\2\26\u01b3\3\2\2\2\30"+
		"\u01b5\3\2\2\2\32\u01b7\3\2\2\2\34\u01b9\3\2\2\2\36\u01c1\3\2\2\2 \u01cc"+
		"\3\2\2\2\"\u01d0\3\2\2\2$\u01e2\3\2\2\2&\u01e9\3\2\2\2(\u01f0\3\2\2\2"+
		"*\u01f2\3\2\2\2,\u020b\3\2\2\2.\u022d\3\2\2\2\60\u0237\3\2\2\2\62\u0239"+
		"\3\2\2\2\64\u0240\3\2\2\2\66\u0249\3\2\2\28\u0253\3\2\2\2:\u025e\3\2\2"+
		"\2<\u0268\3\2\2\2>\u028d\3\2\2\2@\u028f\3\2\2\2B\u029d\3\2\2\2D\u029f"+
		"\3\2\2\2F\u02ac\3\2\2\2H\u02cb\3\2\2\2J\u02d0\3\2\2\2L\u02ee\3\2\2\2N"+
		"\u02f0\3\2\2\2P\u0312\3\2\2\2R\u034a\3\2\2\2T\u034c\3\2\2\2V\u0358\3\2"+
		"\2\2X\u035d\3\2\2\2Z\u0362\3\2\2\2\\\u0370\3\2\2\2^\u0384\3\2\2\2`\u03a7"+
		"\3\2\2\2b\u03bb\3\2\2\2d\u03c1\3\2\2\2f\u03c3\3\2\2\2h\u03cf\3\2\2\2j"+
		"\u03ec\3\2\2\2l\u041c\3\2\2\2n\u041e\3\2\2\2p\u0434\3\2\2\2r\u0442\3\2"+
		"\2\2t\u0444\3\2\2\2v\u0456\3\2\2\2x\u0458\3\2\2\2z\u0461\3\2\2\2|\u0469"+
		"\3\2\2\2~\u0472\3\2\2\2\u0080\u049a\3\2\2\2\u0082\u04c6\3\2\2\2\u0084"+
		"\u04c8\3\2\2\2\u0086\u04e2\3\2\2\2\u0088\u04e4\3\2\2\2\u008a\u04ed\3\2"+
		"\2\2\u008c\u04ef\3\2\2\2\u008e\u04ff\3\2\2\2\u0090\u050f\3\2\2\2\u0092"+
		"\u0516\3\2\2\2\u0094\u051e\3\2\2\2\u0096\u0524\3\2\2\2\u0098\u052a\3\2"+
		"\2\2\u009a\u052f\3\2\2\2\u009c\u0532\3\2\2\2\u009e\u0545\3\2\2\2\u00a0"+
		"\u0555\3\2\2\2\u00a2\u0559\3\2\2\2\u00a4\u055d\3\2\2\2\u00a6\u056f\3\2"+
		"\2\2\u00a8\u0581\3\2\2\2\u00aa\u0596\3\2\2\2\u00ac\u05d1\3\2\2\2\u00ae"+
		"\u05d4\3\2\2\2\u00b0\u05d8\3\2\2\2\u00b2\u05e1\3\2\2\2\u00b4\u05ea\3\2"+
		"\2\2\u00b6\u05f5\3\2\2\2\u00b8\u0603\3\2\2\2\u00ba\u0611\3\2\2\2\u00bc"+
		"\u0613\3\2\2\2\u00be\u063b\3\2\2\2\u00c0\u063e\3\2\2\2\u00c2\u064e\3\2"+
		"\2\2\u00c4\u0650\3\2\2\2\u00c6\u065d\3\2\2\2\u00c8\u066a\3\2\2\2\u00ca"+
		"\u066e\3\2\2\2\u00cc\u0672\3\2\2\2\u00ce\u067b\3\2\2\2\u00d0\u0683\3\2"+
		"\2\2\u00d2\u068d\3\2\2\2\u00d4\u068f\3\2\2\2\u00d6\u0695\3\2\2\2\u00d8"+
		"\u06a3\3\2\2\2\u00da\u06ae\3\2\2\2\u00dc\u06b0\3\2\2\2\u00de\u06cb\3\2"+
		"\2\2\u00e0\u06cd\3\2\2\2\u00e2\u06de\3\2\2\2\u00e4\u06e0\3\2\2\2\u00e6"+
		"\u06e4\3\2\2\2\u00e8\u06e7\3\2\2\2\u00ea\u06f4\3\2\2\2\u00ec\u06f7\3\2"+
		"\2\2\u00ee\u06fa\3\2\2\2\u00f0\u070c\3\2\2\2\u00f2\u0717\3\2\2\2\u00f4"+
		"\u0725\3\2\2\2\u00f6\u073e\3\2\2\2\u00f8\u0740\3\2\2\2\u00fa\u0753\3\2"+
		"\2\2\u00fc\u0765\3\2\2\2\u00fe\u076b\3\2\2\2\u0100\u076d\3\2\2\2\u0102"+
		"\u076f\3\2\2\2\u0104\u077c\3\2\2\2\u0106\u078f\3\2\2\2\u0108\u07b1\3\2"+
		"\2\2\u010a\u07b3\3\2\2\2\u010c\u07b7\3\2\2\2\u010e\u07b9\3\2\2\2\u0110"+
		"\u07cc\3\2\2\2\u0112\u07d0\3\2\2\2\u0114\u07d2\3\2\2\2\u0116\u07e3\3\2"+
		"\2\2\u0118\u088b\3\2\2\2\u011a\u088d\3\2\2\2\u011c\u088f\3\2\2\2\u011e"+
		"\u0899\3\2\2\2\u0120\u096b\3\2\2\2\u0122\u096d\3\2\2\2\u0124\u0974\3\2"+
		"\2\2\u0126\u097c\3\2\2\2\u0128\u0986\3\2\2\2\u012a\u098f\3\2\2\2\u012c"+
		"\u0992\3\2\2\2\u012e\u0995\3\2\2\2\u0130\u0997\3\2\2\2\u0132\u09a1\3\2"+
		"\2\2\u0134\u09a7\3\2\2\2\u0136\u09aa\3\2\2\2\u0138\u09af\3\2\2\2\u013a"+
		"\u09b3\3\2\2\2\u013c\u09b5\3\2\2\2\u013e\u09b7\3\2\2\2\u0140\u09b9\3\2"+
		"\2\2\u0142\u0144\5x=\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7\2\2\3\u0148"+
		"\3\3\2\2\2\u0149\u014d\5\b\5\2\u014a\u014d\5\26\f\2\u014b\u014d\5\6\4"+
		"\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014d\u014f"+
		"\3\2\2\2\u014e\u0150\7}\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u014c\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154\5\3\2\2\2\u0155\u0160\5\u00be`\2\u0156"+
		"\u0160\5\u0128\u0095\2\u0157\u0160\5\n\6\2\u0158\u0160\5\u0134\u009b\2"+
		"\u0159\u0160\5\u00e6t\2\u015a\u0160\5\u008aF\2\u015b\u0160\5B\"\2\u015c"+
		"\u0160\5\u00acW\2\u015d\u0160\5\66\34\2\u015e\u0160\5\u0140\u00a1\2\u015f"+
		"\u0155\3\2\2\2\u015f\u0156\3\2\2\2\u015f\u0157\3\2\2\2\u015f\u0158\3\2"+
		"\2\2\u015f\u0159\3\2\2\2\u015f\u015a\3\2\2\2\u015f\u015b\3\2\2\2\u015f"+
		"\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160\7\3\2\2\2"+
		"\u0161\u0163\58\35\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\u0165\7\26\2\2\u0165\u0166\5\4\3\2\u0166\u0167\5\16\b\2"+
		"\u0167\t\3\2\2\2\u0168\u016a\58\35\2\u0169\u0168\3\2\2\2\u0169\u016a\3"+
		"\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\7\26\2\2\u016c\u016d\5\4\3\2\u016d"+
		"\u016e\b\6\1\2\u016e\13\3\2\2\2\u016f\u0170\7\26\2\2\u0170\u0171\5\4\3"+
		"\2\u0171\u0172\5\16\b\2\u0172\u0178\3\2\2\2\u0173\u0175\5\26\f\2\u0174"+
		"\u0176\7\u0177\2\2\u0175\u0174\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178"+
		"\3\2\2\2\u0177\u016f\3\2\2\2\u0177\u0173\3\2\2\2\u0178\r\3\2\2\2\u0179"+
		"\u017a\6\b\2\2\u017a\u017b\7c\2\2\u017b\17\3\2\2\2\u017c\u0186\5\b\5\2"+
		"\u017d\u017f\5\26\f\2\u017e\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e"+
		"\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0184\7}\2\2\u0183"+
		"\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2\2\2\u0185\u017c\3\2"+
		"\2\2\u0185\u017e\3\2\2\2\u0186\21\3\2\2\2\u0187\u0188\5\36\20\2\u0188"+
		"\u0189\7\u0177\2\2\u0189\u0199\3\2\2\2\u018a\u018b\5\60\31\2\u018b\u018c"+
		"\7\u0177\2\2\u018c\u0199\3\2\2\2\u018d\u0199\5\u0088E\2\u018e\u0199\5"+
		"\u00a6T\2\u018f\u0199\5x=\2\u0190\u0191\5\u00a2R\2\u0191\u0192\7\u0177"+
		"\2\2\u0192\u0199\3\2\2\2\u0193\u0199\5\24\13\2\u0194\u0199\5\u00a8U\2"+
		"\u0195\u0196\5\62\32\2\u0196\u0197\7\u0177\2\2\u0197\u0199\3\2\2\2\u0198"+
		"\u0187\3\2\2\2\u0198\u018a\3\2\2\2\u0198\u018d\3\2\2\2\u0198\u018e\3\2"+
		"\2\2\u0198\u018f\3\2\2\2\u0198\u0190\3\2\2\2\u0198\u0193\3\2\2\2\u0198"+
		"\u0194\3\2\2\2\u0198\u0195\3\2\2\2\u0199\23\3\2\2\2\u019a\u019e\7\u0170"+
		"\2\2\u019b\u019d\5\26\f\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e\3\2"+
		"\2\2\u01a1\u01a2\7\u0174\2\2\u01a2\25\3\2\2\2\u01a3\u01b4\5\34\17\2\u01a4"+
		"\u01b4\5\60\31\2\u01a5\u01b4\5\62\32\2\u01a6\u01b4\5t;\2\u01a7\u01b4\5"+
		"\u009cO\2\u01a8\u01b4\5F$\2\u01a9\u01b4\5@!\2\u01aa\u01b4\5\64\33\2\u01ab"+
		"\u01b4\5\u0084C\2\u01ac\u01b4\5\u00a4S\2\u01ad\u01b4\5\u0086D\2\u01ae"+
		"\u01b4\5\22\n\2\u01af\u01b4\5\u00a2R\2\u01b0\u01b4\5\32\16\2\u01b1\u01b4"+
		"\5\u0106\u0084\2\u01b2\u01b4\5\30\r\2\u01b3\u01a3\3\2\2\2\u01b3\u01a4"+
		"\3\2\2\2\u01b3\u01a5\3\2\2\2\u01b3\u01a6\3\2\2\2\u01b3\u01a7\3\2\2\2\u01b3"+
		"\u01a8\3\2\2\2\u01b3\u01a9\3\2\2\2\u01b3\u01aa\3\2\2\2\u01b3\u01ab\3\2"+
		"\2\2\u01b3\u01ac\3\2\2\2\u01b3\u01ad\3\2\2\2\u01b3\u01ae\3\2\2\2\u01b3"+
		"\u01af\3\2\2\2\u01b3\u01b0\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b2\3\2"+
		"\2\2\u01b4\27\3\2\2\2\u01b5\u01b6\t\2\2\2\u01b6\31\3\2\2\2\u01b7\u01b8"+
		"\7\u00c4\2\2\u01b8\33\3\2\2\2\u01b9\u01be\5 \21\2\u01ba\u01bb\7\u015d"+
		"\2\2\u01bb\u01bd\5 \21\2\u01bc\u01ba\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\35\3\2\2\2\u01c0\u01be\3\2\2"+
		"\2\u01c1\u01c6\5\"\22\2\u01c2\u01c3\7\u015d\2\2\u01c3\u01c5\5\"\22\2\u01c4"+
		"\u01c2\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2"+
		"\2\2\u01c7\37\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01cd\5$\23\2\u01ca\u01cd"+
		"\5*\26\2\u01cb\u01cd\5.\30\2\u01cc\u01c9\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc"+
		"\u01cb\3\2\2\2\u01cd!\3\2\2\2\u01ce\u01d1\5&\24\2\u01cf\u01d1\5,\27\2"+
		"\u01d0\u01ce\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1#\3\2\2\2\u01d2\u01d4\5"+
		"\u0130\u0099\2\u01d3\u01d5\7\u015c\2\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5"+
		"\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\7\u0166\2\2\u01d7\u01d8\5\u0106"+
		"\u0084\2\u01d8\u01e3\3\2\2\2\u01d9\u01da\7\u0171\2\2\u01da\u01db\5\u0130"+
		"\u0099\2\u01db\u01dd\7\u0175\2\2\u01dc\u01de\7\u015c\2\2\u01dd\u01dc\3"+
		"\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e0\7\u0166\2\2"+
		"\u01e0\u01e1\5\u0106\u0084\2\u01e1\u01e3\3\2\2\2\u01e2\u01d2\3\2\2\2\u01e2"+
		"\u01d9\3\2\2\2\u01e3%\3\2\2\2\u01e4\u01e5\5\u0130\u0099\2\u01e5\u01e6"+
		"\5\u012e\u0098\2\u01e6\u01e7\5\u0106\u0084\2\u01e7\u01ea\3\2\2\2\u01e8"+
		"\u01ea\5(\25\2\u01e9\u01e4\3\2\2\2\u01e9\u01e8\3\2\2\2\u01ea\'\3\2\2\2"+
		"\u01eb\u01ec\5\u0130\u0099\2\u01ec\u01ed\t\3\2\2\u01ed\u01f1\3\2\2\2\u01ee"+
		"\u01ef\t\3\2\2\u01ef\u01f1\5\u0130\u0099\2\u01f0\u01eb\3\2\2\2\u01f0\u01ee"+
		"\3\2\2\2\u01f1)\3\2\2\2\u01f2\u01f3\7\u0171\2\2\u01f3\u01f8\5\u0130\u0099"+
		"\2\u01f4\u01f5\7\u015d\2\2\u01f5\u01f7\5\u0130\u0099\2\u01f6\u01f4\3\2"+
		"\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fb\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fd\7\u0175\2\2\u01fc\u01fe"+
		"\7\u015c\2\2\u01fd\u01fc\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2"+
		"\2\u01ff\u0200\5\u012e\u0098\2\u0200\u0201\7\u0171\2\2\u0201\u0206\5\u0106"+
		"\u0084\2\u0202\u0203\7\u015d\2\2\u0203\u0205\5\u0106\u0084\2\u0204\u0202"+
		"\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a\7\u0175\2\2\u020a+\3\2"+
		"\2\2\u020b\u020c\7\u0171\2\2\u020c\u0211\5\u0130\u0099\2\u020d\u020e\7"+
		"\u015d\2\2\u020e\u0210\5\u0130\u0099\2\u020f\u020d\3\2\2\2\u0210\u0213"+
		"\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213"+
		"\u0211\3\2\2\2\u0214\u0215\7\u0175\2\2\u0215\u0216\7\u0166\2\2\u0216\u0217"+
		"\7\u0171\2\2\u0217\u021c\5\u0106\u0084\2\u0218\u0219\7\u015d\2\2\u0219"+
		"\u021b\5\u0106\u0084\2\u021a\u0218\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a"+
		"\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f"+
		"\u0220\7\u0175\2\2\u0220-\3\2\2\2\u0221\u022e\5\u0130\u0099\2\u0222\u0223"+
		"\7\u0171\2\2\u0223\u0228\5\u0130\u0099\2\u0224\u0225\7\u015d\2\2\u0225"+
		"\u0227\5\u0130\u0099\2\u0226\u0224\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226"+
		"\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2\2\2\u022a\u0228\3\2\2\2\u022b"+
		"\u022c\7\u0175\2\2\u022c\u022e\3\2\2\2\u022d\u0221\3\2\2\2\u022d\u0222"+
		"\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u0231\7\u015c\2\2\u0230\u022f\3\2\2"+
		"\2\u0230\u0231\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\7\u0166\2\2\u0233"+
		"\u0234\7\u0171\2\2\u0234\u0235\5\u00aeX\2\u0235\u0236\7\u0175\2\2\u0236"+
		"/\3\2\2\2\u0237\u0238\7\36\2\2\u0238\61\3\2\2\2\u0239\u023a\5\u0130\u0099"+
		"\2\u023a\u023c\7\u0171\2\2\u023b\u023d\5\u0124\u0093\2\u023c\u023b\3\2"+
		"\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\7\u0175\2\2\u023f"+
		"\63\3\2\2\2\u0240\u0241\7K\2\2\u0241\u0246\5<\37\2\u0242\u0243\7\u015d"+
		"\2\2\u0243\u0245\5<\37\2\u0244\u0242\3\2\2\2\u0245\u0248\3\2\2\2\u0246"+
		"\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\65\3\2\2\2\u0248\u0246\3\2\2"+
		"\2\u0249\u024e\5<\37\2\u024a\u024b\7\u015d\2\2\u024b\u024d\5<\37\2\u024c"+
		"\u024a\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2"+
		"\2\2\u024f\u0251\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0252\b\34\1\2\u0252"+
		"\67\3\2\2\2\u0253\u0254\7K\2\2\u0254\u0255\5<\37\2\u0255\u025b\7\u0177"+
		"\2\2\u0256\u0257\5<\37\2\u0257\u0258\7\u0177\2\2\u0258\u025a\3\2\2\2\u0259"+
		"\u0256\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2"+
		"\2\2\u025c9\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u025f\5<\37\2\u025f\u0265"+
		"\7\u0177\2\2\u0260\u0261\5<\37\2\u0261\u0262\7\u0177\2\2\u0262\u0264\3"+
		"\2\2\2\u0263\u0260\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265"+
		"\u0266\3\2\2\2\u0266;\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u0269\5> \2\u0269"+
		"=\3\2\2\2\u026a\u026f\5\u0130\u0099\2\u026b\u026c\7\u015d\2\2\u026c\u026e"+
		"\5\u0130\u0099\2\u026d\u026b\3\2\2\2\u026e\u0271\3\2\2\2\u026f\u026d\3"+
		"\2\2\2\u026f\u0270\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2\2\2\u0272"+
		"\u0274\7\17\2\2\u0273\u0272\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3"+
		"\2\2\2\u0275\u0277\5l\67\2\u0276\u0278\5n8\2\u0277\u0276\3\2\2\2\u0277"+
		"\u0278\3\2\2\2\u0278\u027c\3\2\2\2\u0279\u027b\5p9\2\u027a\u0279\3\2\2"+
		"\2\u027b\u027e\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0280"+
		"\3\2\2\2\u027e\u027c\3\2\2\2\u027f\u0281\5r:\2\u0280\u027f\3\2\2\2\u0280"+
		"\u0281\3\2\2\2\u0281\u028e\3\2\2\2\u0282\u0283\5\u0130\u0099\2\u0283\u0285"+
		"\7\62\2\2\u0284\u0286\7\17\2\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2"+
		"\u0286\u0287\3\2\2\2\u0287\u0289\5l\67\2\u0288\u028a\5n8\2\u0289\u0288"+
		"\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\5r:\2\u028c"+
		"\u028e\3\2\2\2\u028d\u026a\3\2\2\2\u028d\u0282\3\2\2\2\u028e?\3\2\2\2"+
		"\u028f\u0290\7<\2\2\u0290\u0294\7\u011c\2\2\u0291\u0292\7\u0087\2\2\u0292"+
		"\u0293\7\u00c2\2\2\u0293\u0295\7k\2\2\u0294\u0291\3\2\2\2\u0294\u0295"+
		"\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\5\u00e2r\2\u0297\u0298\5V,\2"+
		"\u0298\u0299\5H%\2\u0299A\3\2\2\2\u029a\u029e\5D#\2\u029b\u029e\5\u009e"+
		"P\2\u029c\u029e\5~@\2\u029d\u029a\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029c"+
		"\3\2\2\2\u029eC\3\2\2\2\u029f\u02a3\7<\2\2\u02a0\u02a1\7\u0087\2\2\u02a1"+
		"\u02a2\7\u00c2\2\2\u02a2\u02a4\7k\2\2\u02a3\u02a0\3\2\2\2\u02a3\u02a4"+
		"\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a7\5\u00e2r\2\u02a6\u02a8\5V,\2"+
		"\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa"+
		"\5H%\2\u02aa\u02ab\b#\1\2\u02abE\3\2\2\2\u02ac\u02b3\7<\2\2\u02ad\u02ae"+
		"\7\u00a7\2\2\u02ae\u02b4\7\u011e\2\2\u02af\u02b1\t\4\2\2\u02b0\u02af\3"+
		"\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b4\7\u0138\2\2"+
		"\u02b3\u02ad\3\2\2\2\u02b3\u02b0\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6"+
		"\7\u011c\2\2\u02b6\u02b8\5\u0130\u0099\2\u02b7\u02b9\5V,\2\u02b8\u02b7"+
		"\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\5H%\2\u02bb"+
		"G\3\2\2\2\u02bc\u02be\7\17\2\2\u02bd\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2"+
		"\u02be\u02bf\3\2\2\2\u02bf\u02c0\7\u0171\2\2\u02c0\u02c1\5\u00aeX\2\u02c1"+
		"\u02c2\7\u0175\2\2\u02c2\u02cc\3\2\2\2\u02c3\u02c5\7\17\2\2\u02c4\u02c3"+
		"\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02cc\5\u00aeX"+
		"\2\u02c7\u02c8\7\u0171\2\2\u02c8\u02c9\5J&\2\u02c9\u02ca\7\u0175\2\2\u02ca"+
		"\u02cc\3\2\2\2\u02cb\u02bd\3\2\2\2\u02cb\u02c4\3\2\2\2\u02cb\u02c7\3\2"+
		"\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02cf\5Z.\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf"+
		"\3\2\2\2\u02cfI\3\2\2\2\u02d0\u02d5\5L\'\2\u02d1\u02d2\7\u015d\2\2\u02d2"+
		"\u02d4\5L\'\2\u02d3\u02d1\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2"+
		"\2\2\u02d5\u02d6\3\2\2\2\u02d6K\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02da"+
		"\5l\67\2\u02d9\u02db\5n8\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"\u02df\3\2\2\2\u02dc\u02de\5p9\2\u02dd\u02dc\3\2\2\2\u02de\u02e1\3\2\2"+
		"\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02df"+
		"\3\2\2\2\u02e2\u02e6\5N(\2\u02e3\u02e5\5P)\2\u02e4\u02e3\3\2\2\2\u02e5"+
		"\u02e8\3\2\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02ef\3\2"+
		"\2\2\u02e8\u02e6\3\2\2\2\u02e9\u02ea\7\67\2\2\u02ea\u02ec\5\u0130\u0099"+
		"\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef"+
		"\5R*\2\u02ee\u02d8\3\2\2\2\u02ee\u02eb\3\2\2\2\u02efM\3\2\2\2\u02f0\u02f1"+
		"\5\u0130\u0099\2\u02f1O\3\2\2\2\u02f2\u0313\5r:\2\u02f3\u02f5\7\u00c2"+
		"\2\2\u02f4\u02f3\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6"+
		"\u0313\7\u00c4\2\2\u02f7\u02f8\7\u00da\2\2\u02f8\u0313\7\u009f\2\2\u02f9"+
		"\u0313\7\u012c\2\2\u02fa\u02fb\7\u00e4\2\2\u02fb\u02fc\5\u00e2r\2\u02fc"+
		"\u02fd\7\u0171\2\2\u02fd\u02fe\5\u0130\u0099\2\u02fe\u0302\7\u0175\2\2"+
		"\u02ff\u0301\5T+\2\u0300\u02ff\3\2\2\2\u0301\u0304\3\2\2\2\u0302\u0300"+
		"\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0313\3\2\2\2\u0304\u0302\3\2\2\2\u0305"+
		"\u0306\7\u0086\2\2\u0306\u0307\7\u0171\2\2\u0307\u030c\7\u017e\2\2\u0308"+
		"\u0309\7\u015d\2\2\u0309\u030b\7\u017e\2\2\u030a\u0308\3\2\2\2\u030b\u030e"+
		"\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030f\3\2\2\2\u030e"+
		"\u030c\3\2\2\2\u030f\u0313\7\u0175\2\2\u0310\u0313\7\23\2\2\u0311\u0313"+
		"\7b\2\2\u0312\u02f2\3\2\2\2\u0312\u02f4\3\2\2\2\u0312\u02f7\3\2\2\2\u0312"+
		"\u02f9\3\2\2\2\u0312\u02fa\3\2\2\2\u0312\u0305\3\2\2\2\u0312\u0310\3\2"+
		"\2\2\u0312\u0311\3\2\2\2\u0313Q\3\2\2\2\u0314\u0315\7\u00da\2\2\u0315"+
		"\u0317\7\u009f\2\2\u0316\u0318\7,\2\2\u0317\u0316\3\2\2\2\u0317\u0318"+
		"\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\7\u0171\2\2\u031a\u031c\5\u0130"+
		"\u0099\2\u031b\u031d\t\5\2\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2\2\2\u031d"+
		"\u0325\3\2\2\2\u031e\u031f\7\u015d\2\2\u031f\u0321\5\u0130\u0099\2\u0320"+
		"\u0322\t\5\2\2\u0321\u0320\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0324\3\2"+
		"\2\2\u0323\u031e\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325"+
		"\u0326\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u032a\7\u0175"+
		"\2\2\u0329\u032b\7b\2\2\u032a\u0329\3\2\2\2\u032a\u032b\3\2\2\2\u032b"+
		"\u034b\3\2\2\2\u032c\u032d\7u\2\2\u032d\u032e\7\u009f\2\2\u032e\u032f"+
		"\7\u0171\2\2\u032f\u0334\5\u0130\u0099\2\u0330\u0331\7\u015d\2\2\u0331"+
		"\u0333\5\u0130\u0099\2\u0332\u0330\3\2\2\2\u0333\u0336\3\2\2\2\u0334\u0332"+
		"\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0337\3\2\2\2\u0336\u0334\3\2\2\2\u0337"+
		"\u0338\7\u0175\2\2\u0338\u0339\7\u00e4\2\2\u0339\u033a\5\u00e2r\2\u033a"+
		"\u033b\7\u0171\2\2\u033b\u0340\5\u0130\u0099\2\u033c\u033d\7\u015d\2\2"+
		"\u033d\u033f\5\u0130\u0099\2\u033e\u033c\3\2\2\2\u033f\u0342\3\2\2\2\u0340"+
		"\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0343\3\2\2\2\u0342\u0340\3\2"+
		"\2\2\u0343\u0347\7\u0175\2\2\u0344\u0346\5T+\2\u0345\u0344\3\2\2\2\u0346"+
		"\u0349\3\2\2\2\u0347\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u034b\3\2"+
		"\2\2\u0349\u0347\3\2\2\2\u034a\u0314\3\2\2\2\u034a\u032c\3\2\2\2\u034b"+
		"S\3\2\2\2\u034c\u034d\7\u00c9\2\2\u034d\u0356\t\6\2\2\u034e\u034f\7\u00bd"+
		"\2\2\u034f\u0357\7\7\2\2\u0350\u0357\7\u00e8\2\2\u0351\u0352\7\u0101\2"+
		"\2\u0352\u0357\7\u00c4\2\2\u0353\u0354\7\u0101\2\2\u0354\u0357\7L\2\2"+
		"\u0355\u0357\7#\2\2\u0356\u034e\3\2\2\2\u0356\u0350\3\2\2\2\u0356\u0351"+
		"\3\2\2\2\u0356\u0353\3\2\2\2\u0356\u0355\3\2\2\2\u0357U\3\2\2\2\u0358"+
		"\u0359\5d\63\2\u0359\u035a\7\u00a8\2\2\u035a\u035b\5\u0132\u009a\2\u035b"+
		"W\3\2\2\2\u035c\u035e\7\u00bd\2\2\u035d\u035c\3\2\2\2\u035d\u035e\3\2"+
		"\2\2\u035e\u035f\3\2\2\2\u035f\u0360\t\7\2\2\u0360Y\3\2\2\2\u0361\u0363"+
		"\5\\/\2\u0362\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0362\3\2\2\2\u0364"+
		"\u0365\3\2\2\2\u0365[\3\2\2\2\u0366\u0367\7\u00c9\2\2\u0367\u0368\7\63"+
		"\2\2\u0368\u0369\t\b\2\2\u0369\u0371\7\u00f3\2\2\u036a\u0371\5^\60\2\u036b"+
		"\u0371\5`\61\2\u036c\u0371\5b\62\2\u036d\u0371\5d\63\2\u036e\u0371\5h"+
		"\65\2\u036f\u0371\5j\66\2\u0370\u0366\3\2\2\2\u0370\u036a\3\2\2\2\u0370"+
		"\u036b\3\2\2\2\u0370\u036c\3\2\2\2\u0370\u036d\3\2\2\2\u0370\u036e\3\2"+
		"\2\2\u0370\u036f\3\2\2\2\u0371]\3\2\2\2\u0372\u0373\7\u00fe\2\2\u0373"+
		"\u0374\7=\2\2\u0374\u0385\t\t\2\2\u0375\u0376\t\n\2\2\u0376\u0385\7\u017e"+
		"\2\2\u0377\u0385\7\u00bf\2\2\u0378\u0385\t\13\2\2\u0379\u037a\7\u0114"+
		"\2\2\u037a\u037d\7\u0171\2\2\u037b\u037e\5\u0130\u0099\2\u037c\u037e\7"+
		"\u017e\2\2\u037d\u037b\3\2\2\2\u037d\u037c\3\2\2\2\u037e\u037f\3\2\2\2"+
		"\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0385"+
		"\7\u0175\2\2\u0382\u0383\7\u011d\2\2\u0383\u0385\5\u0130\u0099\2\u0384"+
		"\u0372\3\2\2\2\u0384\u0375\3\2\2\2\u0384\u0377\3\2\2\2\u0384\u0378\3\2"+
		"\2\2\u0384\u0379\3\2\2\2\u0384\u0382\3\2\2\2\u0385_\3\2\2\2\u0386\u0388"+
		"\7\u008c\2\2\u0387\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0389\3\2\2"+
		"\2\u0389\u038a\7\u008a\2\2\u038a\u03a8\5\u0130\u0099\2\u038b\u038c\7\u013c"+
		"\2\2\u038c\u03a8\7\u00e6\2\2\u038d\u038e\7Z\2\2\u038e\u038f\7\37\2\2\u038f"+
		"\u0390\7\u0081\2\2\u0390\u0391\7\u0171\2\2\u0391\u0396\5\u0130\u0099\2"+
		"\u0392\u0393\7\u015d\2\2\u0393\u0395\5\u0130\u0099\2\u0394\u0392\3\2\2"+
		"\2\u0395\u0398\3\2\2\2\u0396\u0394\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0399"+
		"\3\2\2\2\u0398\u0396\3\2\2\2\u0399\u039a\7\u0175\2\2\u039a\u03a8\3\2\2"+
		"\2\u039b\u039d\7\u00c2\2\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d"+
		"\u039e\3\2\2\2\u039e\u03a8\7\u00ad\2\2\u039f\u03a0\7\64\2\2\u03a0\u03a8"+
		"\t\f\2\2\u03a1\u03a2\7P\2\2\u03a2\u03a8\7\u00ca\2\2\u03a3\u03a4\7\u013c"+
		"\2\2\u03a4\u03a5\7\u00e8\2\2\u03a5\u03a6\7\u00c9\2\2\u03a6\u03a8\7]\2"+
		"\2\u03a7\u0387\3\2\2\2\u03a7\u038b\3\2\2\2\u03a7\u038d\3\2\2\2\u03a7\u039c"+
		"\3\2\2\2\u03a7\u039f\3\2\2\2\u03a7\u03a1\3\2\2\2\u03a7\u03a3\3\2\2\2\u03a8"+
		"a\3\2\2\2\u03a9\u03ab\7\u012c\2\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab\3\2"+
		"\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ad\7\u00da\2\2\u03ad\u03ae\7\u008c\2"+
		"\2\u03ae\u03af\7\u0171\2\2\u03af\u03b4\5\u0130\u0099\2\u03b0\u03b1\7\u015d"+
		"\2\2\u03b1\u03b3\5\u0130\u0099\2\u03b2\u03b0\3\2\2\2\u03b3\u03b6\3\2\2"+
		"\2\u03b4\u03b2\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b7\3\2\2\2\u03b6\u03b4"+
		"\3\2\2\2\u03b7\u03b8\7\u0175\2\2\u03b8\u03bc\3\2\2\2\u03b9\u03ba\7\u013c"+
		"\2\2\u03ba\u03bc\7D\2\2\u03bb\u03aa\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc"+
		"c\3\2\2\2\u03bd\u03c2\5f\64\2\u03be\u03bf\7\u0115\2\2\u03bf\u03c0\7\17"+
		"\2\2\u03c0\u03c2\5\u0130\u0099\2\u03c1\u03bd\3\2\2\2\u03c1\u03be\3\2\2"+
		"\2\u03c2e\3\2\2\2\u03c3\u03c4\7\u00f2\2\2\u03c4\u03c5\7v\2\2\u03c5\u03c6"+
		"\7R\2\2\u03c6\u03c7\7p\2\2\u03c7\u03c8\7\u011f\2\2\u03c8\u03c9\7\37\2"+
		"\2\u03c9\u03ca\5\u0132\u009a\2\u03cag\3\2\2\2\u03cb\u03cc\7\u00c9\2\2"+
		"\u03cc\u03d0\5\u0130\u0099\2\u03cd\u03ce\7\u0120\2\2\u03ce\u03d0\5\u0130"+
		"\u0099\2\u03cf\u03cb\3\2\2\2\u03cf\u03cd\3\2\2\2\u03d0i\3\2\2\2\u03d1"+
		"\u03d3\7\23\2\2\u03d2\u03d4\7\u0166\2\2\u03d3\u03d2\3\2\2\2\u03d3\u03d4"+
		"\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03ed\5\u0106\u0084\2\u03d6\u03d8\7"+
		"\61\2\2\u03d7\u03d9\7\u0166\2\2\u03d8\u03d7\3\2\2\2\u03d8\u03d9\3\2\2"+
		"\2\u03d9\u03da\3\2\2\2\u03da\u03ed\5\u0106\u0084\2\u03db\u03dd\7L\2\2"+
		"\u03dc\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03e1\3\2\2\2\u03de\u03df"+
		"\7(\2\2\u03df\u03e2\7\u0101\2\2\u03e0\u03e2\7)\2\2\u03e1\u03de\3\2\2\2"+
		"\u03e1\u03e0\3\2\2\2\u03e2\u03e4\3\2\2\2\u03e3\u03e5\7\u0166\2\2\u03e4"+
		"\u03e3\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03ed\5\u0106"+
		"\u0084\2\u03e7\u03e9\7d\2\2\u03e8\u03ea\7\u0166\2\2\u03e9\u03e8\3\2\2"+
		"\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ed\5\u0106\u0084\2"+
		"\u03ec\u03d1\3\2\2\2\u03ec\u03d6\3\2\2\2\u03ec\u03dc\3\2\2\2\u03ec\u03e7"+
		"\3\2\2\2\u03edk\3\2\2\2\u03ee\u041d\7\'\2\2\u03ef\u041d\7\30\2\2\u03f0"+
		"\u041d\7\31\2\2\u03f1\u041d\7\32\2\2\u03f2\u041d\7\33\2\2\u03f3\u041d"+
		"\7\34\2\2\u03f4\u041d\7E\2\2\u03f5\u041d\7F\2\2\u03f6\u041d\7I\2\2\u03f7"+
		"\u041d\7J\2\2\u03f8\u03fa\7\\\2\2\u03f9\u03fb\7\u00d8\2\2\u03fa\u03f9"+
		"\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u041d\3\2\2\2\u03fc\u041d\7s\2\2\u03fd"+
		"\u041d\7\u0091\2\2\u03fe\u041d\7\u0092\2\2\u03ff\u041d\7\u0093\2\2\u0400"+
		"\u041d\7\u0094\2\2\u0401\u041d\7\u0095\2\2\u0402\u041d\7\u00ba\2\2\u0403"+
		"\u041d\7\u00bc\2\2\u0404\u041d\7\u00c6\2\2\u0405\u041d\7\u00c5\2\2\u0406"+
		"\u041d\7\u00d7\2\2\u0407\u041d\7\u00e3\2\2\u0408\u0409\7\u00ea\2\2\u0409"+
		"\u041d\7\u0136\2\2\u040a\u041d\7\u0108\2\2\u040b\u041d\7\u0107\2\2\u040c"+
		"\u041d\7\u0109\2\2\u040d\u041d\7\u010b\2\2\u040e\u041d\7\u010a\2\2\u040f"+
		"\u041d\7\u0116\2\2\u0410\u041d\7\u011b\2\2\u0411\u041d\7\u0122\2\2\u0412"+
		"\u041d\7\u0123\2\2\u0413\u041d\7\u0134\2\2\u0414\u041d\7\u0137\2\2\u0415"+
		"\u041d\7\u0135\2\2\u0416\u041d\7\u0140\2\2\u0417\u041a\5\u0130\u0099\2"+
		"\u0418\u0419\7\5\2\2\u0419\u041b\t\r\2\2\u041a\u0418\3\2\2\2\u041a\u041b"+
		"\3\2\2\2\u041b\u041d\3\2\2\2\u041c\u03ee\3\2\2\2\u041c\u03ef\3\2\2\2\u041c"+
		"\u03f0\3\2\2\2\u041c\u03f1\3\2\2\2\u041c\u03f2\3\2\2\2\u041c\u03f3\3\2"+
		"\2\2\u041c\u03f4\3\2\2\2\u041c\u03f5\3\2\2\2\u041c\u03f6\3\2\2\2\u041c"+
		"\u03f7\3\2\2\2\u041c\u03f8\3\2\2\2\u041c\u03fc\3\2\2\2\u041c\u03fd\3\2"+
		"\2\2\u041c\u03fe\3\2\2\2\u041c\u03ff\3\2\2\2\u041c\u0400\3\2\2\2\u041c"+
		"\u0401\3\2\2\2\u041c\u0402\3\2\2\2\u041c\u0403\3\2\2\2\u041c\u0404\3\2"+
		"\2\2\u041c\u0405\3\2\2\2\u041c\u0406\3\2\2\2\u041c\u0407\3\2\2\2\u041c"+
		"\u0408\3\2\2\2\u041c\u040a\3\2\2\2\u041c\u040b\3\2\2\2\u041c\u040c\3\2"+
		"\2\2\u041c\u040d\3\2\2\2\u041c\u040e\3\2\2\2\u041c\u040f\3\2\2\2\u041c"+
		"\u0410\3\2\2\2\u041c\u0411\3\2\2\2\u041c\u0412\3\2\2\2\u041c\u0413\3\2"+
		"\2\2\u041c\u0414\3\2\2\2\u041c\u0415\3\2\2\2\u041c\u0416\3\2\2\2\u041c"+
		"\u0417\3\2\2\2\u041dm\3\2\2\2\u041e\u041f\7\u0171\2\2\u041f\u0421\t\16"+
		"\2\2\u0420\u0422\t\17\2\2\u0421\u0420\3\2\2\2\u0421\u0422\3\2\2\2\u0422"+
		"\u0425\3\2\2\2\u0423\u0424\7\u015d\2\2\u0424\u0426\7\u017e\2\2\u0425\u0423"+
		"\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\7\u0175\2"+
		"\2\u0428o\3\2\2\2\u0429\u042b\7\u00c2\2\2\u042a\u0429\3\2\2\2\u042a\u042b"+
		"\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u0435\7\u00c4\2\2\u042d\u042e\7(\2"+
		"\2\u042e\u042f\7\u0101\2\2\u042f\u0435\5\u0130\u0099\2\u0430\u0432\7\u00c2"+
		"\2\2\u0431\u0430\3\2\2\2\u0431\u0432\3\2\2\2\u0432\u0433\3\2\2\2\u0433"+
		"\u0435\t\20\2\2\u0434\u042a\3\2\2\2\u0434\u042d\3\2\2\2\u0434\u0431\3"+
		"\2\2\2\u0435q\3\2\2\2\u0436\u0438\7\u015c\2\2\u0437\u0436\3\2\2\2\u0437"+
		"\u0438\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\7\u0166\2\2\u043a\u0443"+
		"\5\u0106\u0084\2\u043b\u043d\7\u013c\2\2\u043c\u043b\3\2\2\2\u043c\u043d"+
		"\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u0440\7L\2\2\u043f\u0441\5\u0106\u0084"+
		"\2\u0440\u043f\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0443\3\2\2\2\u0442\u0437"+
		"\3\2\2\2\u0442\u043c\3\2\2\2\u0443s\3\2\2\2\u0444\u0445\7<\2\2\u0445\u0449"+
		"\t\21\2\2\u0446\u0447\7\u0087\2\2\u0447\u0448\7\u00c2\2\2\u0448\u044a"+
		"\7k\2\2\u0449\u0446\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044b\3\2\2\2\u044b"+
		"\u044f\5\u0106\u0084\2\u044c\u044e\5v<\2\u044d\u044c\3\2\2\2\u044e\u0451"+
		"\3\2\2\2\u044f\u044d\3\2\2\2\u044f\u0450\3\2\2\2\u0450u\3\2\2\2\u0451"+
		"\u044f\3\2\2\2\u0452\u0453\7\61\2\2\u0453\u0457\5\u0106\u0084\2\u0454"+
		"\u0455\7\u00a8\2\2\u0455\u0457\5\u0106\u0084\2\u0456\u0452\3\2\2\2\u0456"+
		"\u0454\3\2\2\2\u0457w\3\2\2\2\u0458\u0459\5l\67\2\u0459\u045a\5\u0130"+
		"\u0099\2\u045a\u045c\7\u0171\2\2\u045b\u045d\5z>\2\u045c\u045b\3\2\2\2"+
		"\u045c\u045d\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u045f\7\u0175\2\2\u045f"+
		"\u0460\5\24\13\2\u0460y\3\2\2\2\u0461\u0466\5|?\2\u0462\u0463\7\u015d"+
		"\2\2\u0463\u0465\5|?\2\u0464\u0462\3\2\2\2\u0465\u0468\3\2\2\2\u0466\u0464"+
		"\3\2\2\2\u0466\u0467\3\2\2\2\u0467{\3\2\2\2\u0468\u0466\3\2\2\2\u0469"+
		"\u046a\5l\67\2\u046a\u046b\5\u0130\u0099\2\u046b}\3\2\2\2\u046c\u046f"+
		"\7<\2\2\u046d\u046e\7\u00cc\2\2\u046e\u0470\7\u00e6\2\2\u046f\u046d\3"+
		"\2\2\2\u046f\u0470\3\2\2\2\u0470\u0473\3\2\2\2\u0471\u0473\7\u00e6\2\2"+
		"\u0472\u046c\3\2\2\2\u0472\u0471\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0474"+
		"\3\2\2\2\u0474\u0476\t\22\2\2\u0475\u0477\5\u0080A\2\u0476\u0475\3\2\2"+
		"\2\u0476\u0477\3\2\2\2\u0477\u0479\3\2\2\2\u0478\u047a\t\23\2\2\u0479"+
		"\u0478\3\2\2\2\u0479\u047a\3\2\2\2\u047a\u047c\3\2\2\2\u047b\u047d\5:"+
		"\36\2\u047c\u047b\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\3\2\2\2\u047e"+
		"\u0482\5\20\t\2\u047f\u0480\5\u0130\u0099\2\u0480\u0481\7\u0177\2\2\u0481"+
		"\u0483\3\2\2\2\u0482\u047f\3\2\2\2\u0482\u0483\3\2\2\2\u0483\177\3\2\2"+
		"\2\u0484\u0485\7\u0171\2\2\u0485\u049b\7\u0175\2\2\u0486\u0487\7\u0171"+
		"\2\2\u0487\u048c\5\u0082B\2\u0488\u0489\7\u015d\2\2\u0489\u048b\5\u0082"+
		"B\2\u048a\u0488\3\2\2\2\u048b\u048e\3\2\2\2\u048c\u048a\3\2\2\2\u048c"+
		"\u048d\3\2\2\2\u048d\u048f\3\2\2\2\u048e\u048c\3\2\2\2\u048f\u0490\7\u0175"+
		"\2\2\u0490\u049b\3\2\2\2\u0491\u0492\6A\3\2\u0492\u0497\5\u0082B\2\u0493"+
		"\u0494\7\u015d\2\2\u0494\u0496\5\u0082B\2\u0495\u0493\3\2\2\2\u0496\u0499"+
		"\3\2\2\2\u0497\u0495\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u049b\3\2\2\2\u0499"+
		"\u0497\3\2\2\2\u049a\u0484\3\2\2\2\u049a\u0486\3\2\2\2\u049a\u0491\3\2"+
		"\2\2\u049b\u0081\3\2\2\2\u049c\u04a2\7\u008a\2\2\u049d\u04a2\7\u00ce\2"+
		"\2\u049e\u04a2\7\u008f\2\2\u049f\u04a0\7\u008a\2\2\u04a0\u04a2\7\u00ce"+
		"\2\2\u04a1\u049c\3\2\2\2\u04a1\u049d\3\2\2\2\u04a1\u049e\3\2\2\2\u04a1"+
		"\u049f\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4\5\u0130"+
		"\u0099\2\u04a4\u04a6\5l\67\2\u04a5\u04a7\5n8\2\u04a6\u04a5\3\2\2\2\u04a6"+
		"\u04a7\3\2\2\2\u04a7\u04ab\3\2\2\2\u04a8\u04aa\5p9\2\u04a9\u04a8\3\2\2"+
		"\2\u04aa\u04ad\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ab\u04ac\3\2\2\2\u04ac\u04af"+
		"\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ae\u04b0\5r:\2\u04af\u04ae\3\2\2\2\u04af"+
		"\u04b0\3\2\2\2\u04b0\u04c7\3\2\2\2\u04b1\u04b7\5\u0130\u0099\2\u04b2\u04b8"+
		"\7\u008a\2\2\u04b3\u04b8\7\u00ce\2\2\u04b4\u04b8\7\u008f\2\2\u04b5\u04b6"+
		"\7\u008a\2\2\u04b6\u04b8\7\u00ce\2\2\u04b7\u04b2\3\2\2\2\u04b7\u04b3\3"+
		"\2\2\2\u04b7\u04b4\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8"+
		"\u04b9\3\2\2\2\u04b9\u04bb\5l\67\2\u04ba\u04bc\5n8\2\u04bb\u04ba\3\2\2"+
		"\2\u04bb\u04bc\3\2\2\2\u04bc\u04c0\3\2\2\2\u04bd\u04bf\5p9\2\u04be\u04bd"+
		"\3\2\2\2\u04bf\u04c2\3\2\2\2\u04c0\u04be\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1"+
		"\u04c4\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c3\u04c5\5r:\2\u04c4\u04c3\3\2\2"+
		"\2\u04c4\u04c5\3\2\2\2\u04c5\u04c7\3\2\2\2\u04c6\u04a1\3\2\2\2\u04c6\u04b1"+
		"\3\2\2\2\u04c7\u0083\3\2\2\2\u04c8\u04ca\t\24\2\2\u04c9\u04cb\7\u0089"+
		"\2\2\u04ca\u04c9\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc"+
		"\u04d2\5\u0106\u0084\2\u04cd\u04ce\7\u0171\2\2\u04ce\u04cf\5\u0124\u0093"+
		"\2\u04cf\u04d0\7\u0175\2\2\u04d0\u04d3\3\2\2\2\u04d1\u04d3\5\u0124\u0093"+
		"\2\u04d2\u04cd\3\2\2\2\u04d2\u04d1\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04dd"+
		"\3\2\2\2\u04d4\u04d5\7\u0098\2\2\u04d5\u04da\7\u0179\2\2\u04d6\u04d7\7"+
		"\u015d\2\2\u04d7\u04d9\7\u0179\2\2\u04d8\u04d6\3\2\2\2\u04d9\u04dc\3\2"+
		"\2\2\u04da\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04de\3\2\2\2\u04dc"+
		"\u04da\3\2\2\2\u04dd\u04d4\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u0085\3\2"+
		"\2\2\u04df\u04e3\5\u008cG\2\u04e0\u04e3\5\u0090I\2\u04e1\u04e3\5\u0094"+
		"K\2\u04e2\u04df\3\2\2\2\u04e2\u04e0\3\2\2\2\u04e2\u04e1\3\2\2\2\u04e3"+
		"\u0087\3\2\2\2\u04e4\u04e5\7\u0087\2\2\u04e5\u04e6\7\u0171\2\2\u04e6\u04e7"+
		"\5\u00f2z\2\u04e7\u04e8\7\u0175\2\2\u04e8\u04e9\5\22\n\2\u04e9\u0089\3"+
		"\2\2\2\u04ea\u04ee\5\u008eH\2\u04eb\u04ee\5\u0092J\2\u04ec\u04ee\5\u0096"+
		"L\2\u04ed\u04ea\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ed\u04ec\3\2\2\2\u04ee"+
		"\u008b\3\2\2\2\u04ef\u04f0\7\u0087\2\2\u04f0\u04f1\5\u00f2z\2\u04f1\u04f2"+
		"\7\u0121\2\2\u04f2\u04f6\5\4\3\2\u04f3\u04f5\5\u0098M\2\u04f4\u04f3\3"+
		"\2\2\2\u04f5\u04f8\3\2\2\2\u04f6\u04f4\3\2\2\2\u04f6\u04f7\3\2\2\2\u04f7"+
		"\u04fa\3\2\2\2\u04f8\u04f6\3\2\2\2\u04f9\u04fb\5\u009aN\2\u04fa\u04f9"+
		"\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\3\2\2\2\u04fc\u04fd\7c\2\2\u04fd"+
		"\u04fe\7\u0087\2\2\u04fe\u008d\3\2\2\2\u04ff\u0500\7\u0087\2\2\u0500\u0501"+
		"\7\u0121\2\2\u0501\u0505\5\4\3\2\u0502\u0504\5\u0098M\2\u0503\u0502\3"+
		"\2\2\2\u0504\u0507\3\2\2\2\u0505\u0503\3\2\2\2\u0505\u0506\3\2\2\2\u0506"+
		"\u0509\3\2\2\2\u0507\u0505\3\2\2\2\u0508\u050a\5\u009aN\2\u0509\u0508"+
		"\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c\7c\2\2\u050c"+
		"\u050d\7\u0087\2\2\u050d\u050e\bH\1\2\u050e\u008f\3\2\2\2\u050f\u0510"+
		"\7\u0087\2\2\u0510\u0511\5\u00f2z\2\u0511\u0514\5\f\7\2\u0512\u0513\7"+
		"_\2\2\u0513\u0515\5\f\7\2\u0514\u0512\3\2\2\2\u0514\u0515\3\2\2\2\u0515"+
		"\u0091\3\2\2\2\u0516\u0517\7\u0087\2\2\u0517\u051a\5\f\7\2\u0518\u0519"+
		"\7_\2\2\u0519\u051b\5\f\7\2\u051a\u0518\3\2\2\2\u051a\u051b\3\2\2\2\u051b"+
		"\u051c\3\2\2\2\u051c\u051d\bJ\1\2\u051d\u0093\3\2\2\2\u051e\u051f\7\6"+
		"\2\2\u051f\u0520\7\u0087\2\2\u0520\u0521\5\u00f2z\2\u0521\u0522\7\u0121"+
		"\2\2\u0522\u0523\5\f\7\2\u0523\u0095\3\2\2\2\u0524\u0525\7\6\2\2\u0525"+
		"\u0526\7\u0087\2\2\u0526\u0527\7\u0121\2\2\u0527\u0528\5\f\7\2\u0528\u0529"+
		"\bL\1\2\u0529\u0097\3\2\2\2\u052a\u052b\t\25\2\2\u052b\u052c\5\u00f2z"+
		"\2\u052c\u052d\7\u0121\2\2\u052d\u052e\5\4\3\2\u052e\u0099\3\2\2\2\u052f"+
		"\u0530\7_\2\2\u0530\u0531\5\4\3\2\u0531\u009b\3\2\2\2\u0532\u0534\7<\2"+
		"\2\u0533\u0535\7\u012c\2\2\u0534\u0533\3\2\2\2\u0534\u0535\3\2\2\2\u0535"+
		"\u0536\3\2\2\2\u0536\u0537\7\u008c\2\2\u0537\u0538\5\u0130\u0099\2\u0538"+
		"\u0539\7\u00c9\2\2\u0539\u053a\5\u00e2r\2\u053a\u053b\7\u0171\2\2\u053b"+
		"\u0540\5\u00a0Q\2\u053c\u053d\7\u015d\2\2\u053d\u053f\5\u00a0Q\2\u053e"+
		"\u053c\3\2\2\2\u053f\u0542\3\2\2\2\u0540\u053e\3\2\2\2\u0540\u0541\3\2"+
		"\2\2\u0541\u0543\3\2\2\2\u0542\u0540\3\2\2\2\u0543\u0544\7\u0175\2\2\u0544"+
		"\u009d\3\2\2\2\u0545\u0547\7<\2\2\u0546\u0548\7\u012c\2\2\u0547\u0546"+
		"\3\2\2\2\u0547\u0548\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054a\7\u0171\2"+
		"\2\u054a\u054f\5\u00a0Q\2\u054b\u054c\7\u015d\2\2\u054c\u054e\5\u00a0"+
		"Q\2\u054d\u054b\3\2\2\2\u054e\u0551\3\2\2\2\u054f\u054d\3\2\2\2\u054f"+
		"\u0550\3\2\2\2\u0550\u0552\3\2\2\2\u0551\u054f\3\2\2\2\u0552\u0553\7\u0175"+
		"\2\2\u0553\u0554\bP\1\2\u0554\u009f\3\2\2\2\u0555\u0557\5\u0130\u0099"+
		"\2\u0556\u0558\t\5\2\2\u0557\u0556\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u00a1"+
		"\3\2\2\2\u0559\u055b\7\u00eb\2\2\u055a\u055c\5\u0106\u0084\2\u055b\u055a"+
		"\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u00a3\3\2\2\2\u055d\u055e\7t\2\2\u055e"+
		"\u055f\7\u0179\2\2\u055f\u0561\7\u008a\2\2\u0560\u0562\7\u00ed\2\2\u0561"+
		"\u0560\3\2\2\2\u0561\u0562\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0564\5\u0106"+
		"\u0084\2\u0564\u0565\7\u0160\2\2\u0565\u0568\5\u0106\u0084\2\u0566\u0567"+
		"\t\26\2\2\u0567\u0569\5\u0106\u0084\2\u0568\u0566\3\2\2\2\u0568\u0569"+
		"\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\7\u00af\2\2\u056b\u056c\5\4\3"+
		"\2\u056c\u056d\7c\2\2\u056d\u056e\7\u00af\2\2\u056e\u00a5\3\2\2\2\u056f"+
		"\u0570\7t\2\2\u0570\u0572\7\u0171\2\2\u0571\u0573\5\u00aaV\2\u0572\u0571"+
		"\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0576\7\u0177\2"+
		"\2\u0575\u0577\5\u00f2z\2\u0576\u0575\3\2\2\2\u0576\u0577\3\2\2\2\u0577"+
		"\u0578\3\2\2\2\u0578\u057a\7\u0177\2\2\u0579\u057b\5\36\20\2\u057a\u0579"+
		"\3\2\2\2\u057a\u057b\3\2\2\2\u057b\u057c\3\2\2\2\u057c\u057d\7\u0175\2"+
		"\2\u057d\u057e\5\22\n\2\u057e\u00a7\3\2\2\2\u057f\u0582\5l\67\2\u0580"+
		"\u0582\7\u0133\2\2\u0581\u057f\3\2\2\2\u0581\u0580\3\2\2\2\u0582\u0583"+
		"\3\2\2\2\u0583\u0586\5\u0130\u0099\2\u0584\u0585\7\u0166\2\2\u0585\u0587"+
		"\5\u0106\u0084\2\u0586\u0584\3\2\2\2\u0586\u0587\3\2\2\2\u0587\u0590\3"+
		"\2\2\2\u0588\u0589\7\u015d\2\2\u0589\u058c\5\u0130\u0099\2\u058a\u058b"+
		"\7\u0166\2\2\u058b\u058d\5\u0106\u0084\2\u058c\u058a\3\2\2\2\u058c\u058d"+
		"\3\2\2\2\u058d\u058f\3\2\2\2\u058e\u0588\3\2\2\2\u058f\u0592\3\2\2\2\u0590"+
		"\u058e\3\2\2\2\u0590\u0591\3\2\2\2\u0591\u0593\3\2\2\2\u0592\u0590\3\2"+
		"\2\2\u0593\u0594\7\u0177\2\2\u0594\u00a9\3\2\2\2\u0595\u0597\5l\67\2\u0596"+
		"\u0595\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\5\u0130"+
		"\u0099\2\u0599\u059a\7\u0166\2\2\u059a\u059b\5\u0106\u0084\2\u059b\u00ab"+
		"\3\2\2\2\u059c\u059d\7t\2\2\u059d\u059e\7\u0179\2\2\u059e\u05a0\7\u008a"+
		"\2\2\u059f\u05a1\7\u00ed\2\2\u05a0\u059f\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1"+
		"\u05a2\3\2\2\2\u05a2\u05a3\5\u0106\u0084\2\u05a3\u05a4\7\u0160\2\2\u05a4"+
		"\u05a7\5\u0106\u0084\2\u05a5\u05a6\t\26\2\2\u05a6\u05a8\5\u0106\u0084"+
		"\2\u05a7\u05a5\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u05aa"+
		"\5\4\3\2\u05aa\u05ab\7c\2\2\u05ab\u05ac\7\u00af\2\2\u05ac\u05ad\bW\1\2"+
		"\u05ad\u05d2\3\2\2\2\u05ae\u05af\7t\2\2\u05af\u05b0\7\u0179\2\2\u05b0"+
		"\u05b2\7\u008a\2\2\u05b1\u05b3\7\u00ed\2\2\u05b2\u05b1\3\2\2\2\u05b2\u05b3"+
		"\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b5\5\u0106\u0084\2\u05b5\u05b6\7"+
		"\u0160\2\2\u05b6\u05b9\5\u0106\u0084\2\u05b7\u05b8\t\26\2\2\u05b8\u05ba"+
		"\5\u0106\u0084\2\u05b9\u05b7\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bb\3"+
		"\2\2\2\u05bb\u05bc\7\u00af\2\2\u05bc\u05bd\5\4\3\2\u05bd\u05be\bW\1\2"+
		"\u05be\u05d2\3\2\2\2\u05bf\u05c0\7t\2\2\u05c0\u05c1\7\u0179\2\2\u05c1"+
		"\u05c3\7\u008a\2\2\u05c2\u05c4\7\u00ed\2\2\u05c3\u05c2\3\2\2\2\u05c3\u05c4"+
		"\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6\5\u0106\u0084\2\u05c6\u05c7\7"+
		"\u0160\2\2\u05c7\u05ca\5\u0106\u0084\2\u05c8\u05c9\t\26\2\2\u05c9\u05cb"+
		"\5\u0106\u0084\2\u05ca\u05c8\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cc\3"+
		"\2\2\2\u05cc\u05cd\7\u00af\2\2\u05cd\u05ce\7c\2\2\u05ce\u05cf\7\u00af"+
		"\2\2\u05cf\u05d0\bW\1\2\u05d0\u05d2\3\2\2\2\u05d1\u059c\3\2\2\2\u05d1"+
		"\u05ae\3\2\2\2\u05d1\u05bf\3\2\2\2\u05d2\u00ad\3\2\2\2\u05d3\u05d5\5\u00b0"+
		"Y\2\u05d4\u05d3\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6"+
		"\u05d7\5\u00b6\\\2\u05d7\u00af\3\2\2\2\u05d8\u05d9\7\u013c\2\2\u05d9\u05de"+
		"\5\u00b2Z\2\u05da\u05db\7\u015d\2\2\u05db\u05dd\5\u00b2Z\2\u05dc\u05da"+
		"\3\2\2\2\u05dd\u05e0\3\2\2\2\u05de\u05dc\3\2\2\2\u05de\u05df\3\2\2\2\u05df"+
		"\u00b1\3\2\2\2\u05e0\u05de\3\2\2\2\u05e1\u05e3\5\u0130\u0099\2\u05e2\u05e4"+
		"\5\u00b4[\2\u05e3\u05e2\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e5\3\2\2"+
		"\2\u05e5\u05e6\7\17\2\2\u05e6\u05e7\7\u0171\2\2\u05e7\u05e8\5\u00b6\\"+
		"\2\u05e8\u05e9\7\u0175\2\2\u05e9\u00b3\3\2\2\2\u05ea\u05eb\7\u0171\2\2"+
		"\u05eb\u05f0\5\u0130\u0099\2\u05ec\u05ed\7\u015d\2\2\u05ed\u05ef\5\u0130"+
		"\u0099\2\u05ee\u05ec\3\2\2\2\u05ef\u05f2\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f0"+
		"\u05f1\3\2\2\2\u05f1\u05f3\3\2\2\2\u05f2\u05f0\3\2\2\2\u05f3\u05f4\7\u0175"+
		"\2\2\u05f4\u00b5\3\2\2\2\u05f5\u05fb\5\u00b8]\2\u05f6\u05f7\5\u00ba^\2"+
		"\u05f7\u05f8\5\u00b8]\2\u05f8\u05fa\3\2\2\2\u05f9\u05f6\3\2\2\2\u05fa"+
		"\u05fd\3\2\2\2\u05fb\u05f9\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u00b7\3\2"+
		"\2\2\u05fd\u05fb\3\2\2\2\u05fe\u0604\5\u00bc_\2\u05ff\u0600\7\u0171\2"+
		"\2\u0600\u0601\5\u00b6\\\2\u0601\u0602\7\u0175\2\2\u0602\u0604\3\2\2\2"+
		"\u0603\u05fe\3\2\2\2\u0603\u05ff\3\2\2\2\u0604\u00b9\3\2\2\2\u0605\u0607"+
		"\7\u012b\2\2\u0606\u0608\7\t\2\2\u0607\u0606\3\2\2\2\u0607\u0608\3\2\2"+
		"\2\u0608\u0612\3\2\2\2\u0609\u060b\7f\2\2\u060a\u060c\7\t\2\2\u060b\u060a"+
		"\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u0612\3\2\2\2\u060d\u060f\7\u0096\2"+
		"\2\u060e\u0610\7\t\2\2\u060f\u060e\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0612"+
		"\3\2\2\2\u0611\u0605\3\2\2\2\u0611\u0609\3\2\2\2\u0611\u060d\3\2\2\2\u0612"+
		"\u00bb\3\2\2\2\u0613\u0614\t\27\2\2\u0614\u0616\5\u00c0a\2\u0615\u0617"+
		"\5\u00ccg\2\u0616\u0615\3\2\2\2\u0616\u0617\3\2\2\2\u0617\u0618\3\2\2"+
		"\2\u0618\u061a\5\u00ceh\2\u0619\u061b\5\u00e4s\2\u061a\u0619\3\2\2\2\u061a"+
		"\u061b\3\2\2\2\u061b\u061d\3\2\2\2\u061c\u061e\5\u00e8u\2\u061d\u061c"+
		"\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u0621\3\2\2\2\u061f\u0622\5\u00eav"+
		"\2\u0620\u0622\5\u00ecw\2\u0621\u061f\3\2\2\2\u0621\u0620\3\2\2\2\u0621"+
		"\u0622\3\2\2\2\u0622\u0624\3\2\2\2\u0623\u0625\5\u00eex\2\u0624\u0623"+
		"\3\2\2\2\u0624\u0625\3\2\2\2\u0625\u00bd\3\2\2\2\u0626\u0627\t\27\2\2"+
		"\u0627\u0629\5\u00c0a\2\u0628\u062a\5\u00ccg\2\u0629\u0628\3\2\2\2\u0629"+
		"\u062a\3\2\2\2\u062a\u062c\3\2\2\2\u062b\u062d\5\u00e4s\2\u062c\u062b"+
		"\3\2\2\2\u062c\u062d\3\2\2\2\u062d\u062f\3\2\2\2\u062e\u0630\5\u00e8u"+
		"\2\u062f\u062e\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0633\3\2\2\2\u0631\u0634"+
		"\5\u00eav\2\u0632\u0634\5\u00ecw\2\u0633\u0631\3\2\2\2\u0633\u0632\3\2"+
		"\2\2\u0633\u0634\3\2\2\2\u0634\u0636\3\2\2\2\u0635\u0637\5\u00eex\2\u0636"+
		"\u0635\3\2\2\2\u0636\u0637\3\2\2\2\u0637\u063c\3\2\2\2\u0638\u0639\5\u00d0"+
		"i\2\u0639\u063a\b`\1\2\u063a\u063c\3\2\2\2\u063b\u0626\3\2\2\2\u063b\u0638"+
		"\3\2\2\2\u063c\u00bf\3\2\2\2\u063d\u063f\5\u00c2b\2\u063e\u063d\3\2\2"+
		"\2\u063e\u063f\3\2\2\2\u063f\u0641\3\2\2\2\u0640\u0642\5\u00c4c\2\u0641"+
		"\u0640\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0648\5\u00c6"+
		"d\2\u0644\u0645\7\u015d\2\2\u0645\u0647\5\u00c6d\2\u0646\u0644\3\2\2\2"+
		"\u0647\u064a\3\2\2\2\u0648\u0646\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u00c1"+
		"\3\2\2\2\u064a\u0648\3\2\2\2\u064b\u064f\7\t\2\2\u064c\u064d\7Y\2\2\u064d"+
		"\u064f\bb\1\2\u064e\u064b\3\2\2\2\u064e\u064c\3\2\2\2\u064f\u00c3\3\2"+
		"\2\2\u0650\u0651\7\u0126\2\2\u0651\u0652\5\u0106\u0084\2\u0652\u00c5\3"+
		"\2\2\2\u0653\u0654\5\u0130\u0099\2\u0654\u0655\7\u0166\2\2\u0655\u0657"+
		"\3\2\2\2\u0656\u0653\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0658\3\2\2\2\u0658"+
		"\u065a\5\u0106\u0084\2\u0659\u065b\5\u00c8e\2\u065a\u0659\3\2\2\2\u065a"+
		"\u065b\3\2\2\2\u065b\u065e\3\2\2\2\u065c\u065e\5\u00caf\2\u065d\u0656"+
		"\3\2\2\2\u065d\u065c\3\2\2\2\u065e\u065f\3\2\2\2\u065f\u0660\bd\1\2\u0660"+
		"\u00c7\3\2\2\2\u0661\u0663\6e\4\2\u0662\u0664\7\17\2\2\u0663\u0662\3\2"+
		"\2\2\u0663\u0664\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u066b\5\u0130\u0099"+
		"\2\u0666\u0667\7\u0171\2\2\u0667\u0668\7\u0124\2\2\u0668\u0669\7\u017a"+
		"\2\2\u0669\u066b\7\u0175\2\2\u066a\u0661\3\2\2\2\u066a\u0666\3\2\2\2\u066b"+
		"\u00c9\3\2\2\2\u066c\u066d\7\u0179\2\2\u066d\u066f\7\6\2\2\u066e\u066c"+
		"\3\2\2\2\u066e\u066f\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0671\7\u016e\2"+
		"\2\u0671\u00cb\3\2\2\2\u0672\u0673\7\u0098\2\2\u0673\u0678\5\u0130\u0099"+
		"\2\u0674\u0675\7\u015d\2\2\u0675\u0677\5\u0130\u0099\2\u0676\u0674\3\2"+
		"\2\2\u0677\u067a\3\2\2\2\u0678\u0676\3\2\2\2\u0678\u0679\3\2\2\2\u0679"+
		"\u00cd\3\2\2\2\u067a\u0678\3\2\2\2\u067b\u067c\7x\2\2\u067c\u0680\5\u00d2"+
		"j\2\u067d\u067f\5\u00d8m\2\u067e\u067d\3\2\2\2\u067f\u0682\3\2\2\2\u0680"+
		"\u067e\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u00cf\3\2\2\2\u0682\u0680\3\2"+
		"\2\2\u0683\u0687\7x\2\2\u0684\u0686\5\u00d8m\2\u0685\u0684\3\2\2\2\u0686"+
		"\u0689\3\2\2\2\u0687\u0685\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u00d1\3\2"+
		"\2\2\u0689\u0687\3\2\2\2\u068a\u068e\5\u00d4k\2\u068b\u068e\5\u00d6l\2"+
		"\u068c\u068e\5\u00dco\2\u068d\u068a\3\2\2\2\u068d\u068b\3\2\2\2\u068d"+
		"\u068c\3\2\2\2\u068e\u00d3\3\2\2\2\u068f\u0691\5\u00e2r\2\u0690\u0692"+
		"\5\u00e0q\2\u0691\u0690\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u0693\3\2\2"+
		"\2\u0693\u0694\bk\1\2\u0694\u00d5\3\2\2\2\u0695\u0696\7\u0171\2\2\u0696"+
		"\u0697\5\u00aeX\2\u0697\u0699\7\u0175\2\2\u0698\u069a\5\u00e0q\2\u0699"+
		"\u0698\3\2\2\2\u0699\u069a\3\2\2\2\u069a\u00d7\3\2\2\2\u069b\u069c\7\u015d"+
		"\2\2\u069c\u06a4\5\u00d2j\2\u069d\u069e\5\u00dan\2\u069e\u069f\5\u00d2"+
		"j\2\u069f\u06a0\7\u00c9\2\2\u06a0\u06a1\5\u00f2z\2\u06a1\u06a2\bm\1\2"+
		"\u06a2\u06a4\3\2\2\2\u06a3\u069b\3\2\2\2\u06a3\u069d\3\2\2\2\u06a4\u00d9"+
		"\3\2\2\2\u06a5\u06a7\7\u008e\2\2\u06a6\u06a5\3\2\2\2\u06a6\u06a7\3\2\2"+
		"\2\u06a7\u06a8\3\2\2\2\u06a8\u06af\7\u009d\2\2\u06a9\u06ab\t\30\2\2\u06aa"+
		"\u06ac\7\u00cf\2\2\u06ab\u06aa\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ad"+
		"\3\2\2\2\u06ad\u06af\7\u009d\2\2\u06ae\u06a6\3\2\2\2\u06ae\u06a9\3\2\2"+
		"\2\u06af\u00db\3\2\2\2\u06b0\u06b1\7\u011c\2\2\u06b1\u06b2\7\u0171\2\2"+
		"\u06b2\u06b3\7\u0132\2\2\u06b3\u06b8\5\u00dep\2\u06b4\u06b5\7\u015d\2"+
		"\2\u06b5\u06b7\5\u00dep\2\u06b6\u06b4\3\2\2\2\u06b7\u06ba\3\2\2\2\u06b8"+
		"\u06b6\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06bb\3\2\2\2\u06ba\u06b8\3\2"+
		"\2\2\u06bb\u06bd\7\u0175\2\2\u06bc\u06be\5\u00e0q\2\u06bd\u06bc\3\2\2"+
		"\2\u06bd\u06be\3\2\2\2\u06be\u00dd\3\2\2\2\u06bf\u06cc\5\u0106\u0084\2"+
		"\u06c0\u06c1\7\u0171\2\2\u06c1\u06c6\5\u0106\u0084\2\u06c2\u06c3\7\u015d"+
		"\2\2\u06c3\u06c5\5\u0106\u0084\2\u06c4\u06c2\3\2\2\2\u06c5\u06c8\3\2\2"+
		"\2\u06c6\u06c4\3\2\2\2\u06c6\u06c7\3\2\2\2\u06c7\u06c9\3\2\2\2\u06c8\u06c6"+
		"\3\2\2\2\u06c9\u06ca\7\u0175\2\2\u06ca\u06cc\3\2\2\2\u06cb\u06bf\3\2\2"+
		"\2\u06cb\u06c0\3\2\2\2\u06cc\u00df\3\2\2\2\u06cd\u06cf\6q\5\2\u06ce\u06d0"+
		"\7\17\2\2\u06cf\u06ce\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d1\3\2\2\2"+
		"\u06d1\u06dc\5\u0130\u0099\2\u06d2\u06d3\7\u0171\2\2\u06d3\u06d8\7\u0179"+
		"\2\2\u06d4\u06d5\7\u015d\2\2\u06d5\u06d7\7\u0179\2\2\u06d6\u06d4\3\2\2"+
		"\2\u06d7\u06da\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9\u06db"+
		"\3\2\2\2\u06da\u06d8\3\2\2\2\u06db\u06dd\7\u0175\2\2\u06dc\u06d2\3\2\2"+
		"\2\u06dc\u06dd\3\2\2\2\u06dd\u00e1\3\2\2\2\u06de\u06df\5\u0130\u0099\2"+
		"\u06df\u00e3\3\2\2\2\u06e0\u06e1\7\u013a\2\2\u06e1\u06e2\5\u00f2z\2\u06e2"+
		"\u06e3\bs\1\2\u06e3\u00e5\3\2\2\2\u06e4\u06e5\7\u013a\2\2\u06e5\u06e6"+
		"\bt\1\2\u06e6\u00e7\3\2\2\2\u06e7\u06e8\7\177\2\2\u06e8\u06e9\7\37\2\2"+
		"\u06e9\u06ea\5\u0106\u0084\2\u06ea\u06f1\bu\1\2\u06eb\u06ec\7\u015d\2"+
		"\2\u06ec\u06ed\5\u0106\u0084\2\u06ed\u06ee\bu\1\2\u06ee\u06f0\3\2\2\2"+
		"\u06ef\u06eb\3\2\2\2\u06f0\u06f3\3\2\2\2\u06f1\u06ef\3\2\2\2\u06f1\u06f2"+
		"\3\2\2\2\u06f2\u00e9\3\2\2\2\u06f3\u06f1\3\2\2\2\u06f4\u06f5\7\u0082\2"+
		"\2\u06f5\u06f6\5\u00f2z\2\u06f6\u00eb\3\2\2\2\u06f7\u06f8\7\u00de\2\2"+
		"\u06f8\u06f9\5\u00f2z\2\u06f9\u00ed\3\2\2\2\u06fa\u06fb\7\u00cd\2\2\u06fb"+
		"\u06fc\7\37\2\2\u06fc\u06fd\5\u0106\u0084\2\u06fd\u06fe\5\u00f0y\2\u06fe"+
		"\u0706\bx\1\2\u06ff\u0700\7\u015d\2\2\u0700\u0701\5\u0106\u0084\2\u0701"+
		"\u0702\5\u00f0y\2\u0702\u0703\bx\1\2\u0703\u0705\3\2\2\2\u0704\u06ff\3"+
		"\2\2\2\u0705\u0708\3\2\2\2\u0706\u0704\3\2\2\2\u0706\u0707\3\2\2\2\u0707"+
		"\u00ef\3\2\2\2\u0708\u0706\3\2\2\2\u0709\u070d\7\20\2\2\u070a\u070d\7"+
		"T\2\2\u070b\u070d\3\2\2\2\u070c\u0709\3\2\2\2\u070c\u070a\3\2\2\2\u070c"+
		"\u070b\3\2\2\2\u070d\u00f1\3\2\2\2\u070e\u0710\bz\1\2\u070f\u0711\7\u00c2"+
		"\2\2\u0710\u070f\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0712\3\2\2\2\u0712"+
		"\u0713\7\u0171\2\2\u0713\u0714\5\u00f2z\2\u0714\u0715\7\u0175\2\2\u0715"+
		"\u0718\3\2\2\2\u0716\u0718\5\u00f4{\2\u0717\u070e\3\2\2\2\u0717\u0716"+
		"\3\2\2\2\u0718\u071f\3\2\2\2\u0719\u071a\f\4\2\2\u071a\u071b\5\u00fe\u0080"+
		"\2\u071b\u071c\5\u00f2z\5\u071c\u071e\3\2\2\2\u071d\u0719\3\2\2\2\u071e"+
		"\u0721\3\2\2\2\u071f\u071d\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u00f3\3\2"+
		"\2\2\u0721\u071f\3\2\2\2\u0722\u0726\5\u00f6|\2\u0723\u0726\5\u00fc\177"+
		"\2\u0724\u0726\5\u013a\u009e\2\u0725\u0722\3\2\2\2\u0725\u0723\3\2\2\2"+
		"\u0725\u0724\3\2\2\2\u0726\u00f5\3\2\2\2\u0727\u0728\5\u0106\u0084\2\u0728"+
		"\u072a\7\u009a\2\2\u0729\u072b\7\u00c2\2\2\u072a\u0729\3\2\2\2\u072a\u072b"+
		"\3\2\2\2\u072b\u072c\3\2\2\2\u072c\u072d\t\31\2\2\u072d\u073f\3\2\2\2"+
		"\u072e\u072f\5\u0106\u0084\2\u072f\u0730\7\27\2\2\u0730\u0731\5\u0106"+
		"\u0084\2\u0731\u0732\7\f\2\2\u0732\u0733\5\u0106\u0084\2\u0733\u073f\3"+
		"\2\2\2\u0734\u0736\7\u00c2\2\2\u0735\u0734\3\2\2\2\u0735\u0736\3\2\2\2"+
		"\u0736\u0737\3\2\2\2\u0737\u0738\7k\2\2\u0738\u0739\7\u0171\2\2\u0739"+
		"\u073a\5\u00aeX\2\u073a\u073b\7\u0175\2\2\u073b\u073f\3\2\2\2\u073c\u073f"+
		"\5\u00f8}\2\u073d\u073f\5\u00fa~\2\u073e\u0727\3\2\2\2\u073e\u072e\3\2"+
		"\2\2\u073e\u0735\3\2\2\2\u073e\u073c\3\2\2\2\u073e\u073d\3\2\2\2\u073f"+
		"\u00f7\3\2\2\2\u0740\u0742\5\u0106\u0084\2\u0741\u0743\7\u00c2\2\2\u0742"+
		"\u0741\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0744\3\2\2\2\u0744\u0745\7\u008a"+
		"\2\2\u0745\u074f\7\u0171\2\2\u0746\u074b\5\u0106\u0084\2\u0747\u0748\7"+
		"\u015d\2\2\u0748\u074a\5\u0106\u0084\2\u0749\u0747\3\2\2\2\u074a\u074d"+
		"\3\2\2\2\u074b\u0749\3\2\2\2\u074b\u074c\3\2\2\2\u074c\u0750\3\2\2\2\u074d"+
		"\u074b\3\2\2\2\u074e\u0750\5\u00aeX\2\u074f\u0746\3\2\2\2\u074f\u074e"+
		"\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0752\7\u0175\2\2\u0752\u00f9\3\2\2"+
		"\2\u0753\u0754\7\u0171\2\2\u0754\u0759\5\u0106\u0084\2\u0755\u0756\7\u015d"+
		"\2\2\u0756\u0758\5\u0106\u0084\2\u0757\u0755\3\2\2\2\u0758\u075b\3\2\2"+
		"\2\u0759\u0757\3\2\2\2\u0759\u075a\3\2\2\2\u075a\u075c\3\2\2\2\u075b\u0759"+
		"\3\2\2\2\u075c\u075e\7\u0175\2\2\u075d\u075f\7\u00c2\2\2\u075e\u075d\3"+
		"\2\2\2\u075e\u075f\3\2\2\2\u075f\u0760\3\2\2\2\u0760\u0761\7\u008a\2\2"+
		"\u0761\u0762\7\u0171\2\2\u0762\u0763\5\u00aeX\2\u0763\u0764\7\u0175\2"+
		"\2\u0764\u00fb\3\2\2\2\u0765\u0766\5\u0106\u0084\2\u0766\u0767\5\u0104"+
		"\u0083\2\u0767\u0768\5\u0106\u0084\2\u0768\u00fd\3\2\2\2\u0769\u076c\5"+
		"\u0100\u0081\2\u076a\u076c\5\u0102\u0082\2\u076b\u0769\3\2\2\2\u076b\u076a"+
		"\3\2\2\2\u076c\u00ff\3\2\2\2\u076d\u076e\7\u015b\2\2\u076e\u0101\3\2\2"+
		"\2\u076f\u0770\7\u015e\2\2\u0770\u0103\3\2\2\2\u0771\u077d\7\u0167\2\2"+
		"\u0772\u077d\7\u0168\2\2\u0773\u077d\7\u0169\2\2\u0774\u077d\7\u016c\2"+
		"\2\u0775\u077d\7\u016d\2\2\u0776\u077d\7\u016a\2\2\u0777\u077d\7\u016b"+
		"\2\2\u0778\u077a\7\u00c2\2\2\u0779\u0778\3\2\2\2\u0779\u077a\3\2\2\2\u077a"+
		"\u077b\3\2\2\2\u077b\u077d\t\32\2\2\u077c\u0771\3\2\2\2\u077c\u0772\3"+
		"\2\2\2\u077c\u0773\3\2\2\2\u077c\u0774\3\2\2\2\u077c\u0775\3\2\2\2\u077c"+
		"\u0776\3\2\2\2\u077c\u0777\3\2\2\2\u077c\u0779\3\2\2\2\u077d\u0105\3\2"+
		"\2\2\u077e\u077f\b\u0084\1\2\u077f\u0790\5\u00aeX\2\u0780\u0781\7\u0171"+
		"\2\2\u0781\u0782\5\u00aeX\2\u0782\u0783\7\u0175\2\2\u0783\u0790\3\2\2"+
		"\2\u0784\u0785\7\u0171\2\2\u0785\u0786\5\u0106\u0084\2\u0786\u0787\7\u0175"+
		"\2\2\u0787\u0790\3\2\2\2\u0788\u0790\5\u010a\u0086\2\u0789\u0790\5\u010e"+
		"\u0088\2\u078a\u0790\5\u0112\u008a\2\u078b\u0790\5\u0118\u008d\2\u078c"+
		"\u0790\5\u0120\u0091\2\u078d\u0790\5\u0122\u0092\2\u078e\u0790\5\u0108"+
		"\u0085\2\u078f\u077e\3\2\2\2\u078f\u0780\3\2\2\2\u078f\u0784\3\2\2\2\u078f"+
		"\u0788\3\2\2\2\u078f\u0789\3\2\2\2\u078f\u078a\3\2\2\2\u078f\u078b\3\2"+
		"\2\2\u078f\u078c\3\2\2\2\u078f\u078d\3\2\2\2\u078f\u078e\3\2\2\2\u0790"+
		"\u07a6\3\2\2\2\u0791\u0792\f\20\2\2\u0792\u0793\7\u016e\2\2\u0793\u07a5"+
		"\5\u0106\u0084\21\u0794\u0795\f\17\2\2\u0795\u0796\7\u015f\2\2\u0796\u07a5"+
		"\5\u0106\u0084\20\u0797\u0798\f\16\2\2\u0798\u0799\7\u015a\2\2\u0799\u07a5"+
		"\5\u0106\u0084\17\u079a\u079b\f\r\2\2\u079b\u079c\7\u0178\2\2\u079c\u07a5"+
		"\5\u0106\u0084\16\u079d\u079e\f\22\2\2\u079e\u07a5\5\u010c\u0087\2\u079f"+
		"\u07a0\f\n\2\2\u07a0\u07a1\7\u0172\2\2\u07a1\u07a2\5\u0106\u0084\2\u07a2"+
		"\u07a3\7\u0176\2\2\u07a3\u07a5\3\2\2\2\u07a4\u0791\3\2\2\2\u07a4\u0794"+
		"\3\2\2\2\u07a4\u0797\3\2\2\2\u07a4\u079a\3\2\2\2\u07a4\u079d\3\2\2\2\u07a4"+
		"\u079f\3\2\2\2\u07a5\u07a8\3\2\2\2\u07a6\u07a4\3\2\2\2\u07a6\u07a7\3\2"+
		"\2\2\u07a7\u0107\3\2\2\2\u07a8\u07a6\3\2\2\2\u07a9\u07b2\5\u012a\u0096"+
		"\2\u07aa\u07b2\5\u012c\u0097\2\u07ab\u07b2\5\u013a\u009e\2\u07ac\u07b2"+
		"\5\u0130\u0099\2\u07ad\u07b2\5\u0132\u009a\2\u07ae\u07b2\5\u0138\u009d"+
		"\2\u07af\u07b2\5\u0136\u009c\2\u07b0\u07b2\5\u013c\u009f\2\u07b1\u07a9"+
		"\3\2\2\2\u07b1\u07aa\3\2\2\2\u07b1\u07ab\3\2\2\2\u07b1\u07ac\3\2\2\2\u07b1"+
		"\u07ad\3\2\2\2\u07b1\u07ae\3\2\2\2\u07b1\u07af\3\2\2\2\u07b1\u07b0\3\2"+
		"\2\2\u07b2\u0109\3\2\2\2\u07b3\u07b4\7\u0097\2\2\u07b4\u07b5\5\u0106\u0084"+
		"\2\u07b5\u07b6\5\u010c\u0087\2\u07b6\u010b\3\2\2\2\u07b7\u07b8\t\33\2"+
		"\2\u07b8\u010d\3\2\2\2\u07b9\u07ba\5\u0110\u0089\2\u07ba\u07bb\7\65\2"+
		"\2\u07bb\u07c0\5\u0110\u0089\2\u07bc\u07bd\7\65\2\2\u07bd\u07bf\5\u0110"+
		"\u0089\2\u07be\u07bc\3\2\2\2\u07bf\u07c2\3\2\2\2\u07c0\u07be\3\2\2\2\u07c0"+
		"\u07c1\3\2\2\2\u07c1\u010f\3\2\2\2\u07c2\u07c0\3\2\2\2\u07c3\u07c4\7\u0171"+
		"\2\2\u07c4\u07c5\5\u0106\u0084\2\u07c5\u07c6\7\u0175\2\2\u07c6\u07cd\3"+
		"\2\2\2\u07c7\u07cd\5\u0112\u008a\2\u07c8\u07cd\5\u0118\u008d\2\u07c9\u07cd"+
		"\5\u0120\u0091\2\u07ca\u07cd\5\u0122\u0092\2\u07cb\u07cd\5\u0108\u0085"+
		"\2\u07cc\u07c3\3\2\2\2\u07cc\u07c7\3\2\2\2\u07cc\u07c8\3\2\2\2\u07cc\u07c9"+
		"\3\2\2\2\u07cc\u07ca\3\2\2\2\u07cc\u07cb\3\2\2\2\u07cd\u0111\3\2\2\2\u07ce"+
		"\u07d1\5\u0114\u008b\2\u07cf\u07d1\5\u0116\u008c\2\u07d0\u07ce\3\2\2\2"+
		"\u07d0\u07cf\3\2\2\2\u07d1\u0113\3\2\2\2\u07d2\u07d3\7$\2\2\u07d3\u07d9"+
		"\5\u0106\u0084\2\u07d4\u07d5\7\u0139\2\2\u07d5\u07d6\5\u0106\u0084\2\u07d6"+
		"\u07d7\7\u0121\2\2\u07d7\u07d8\5\u0106\u0084\2\u07d8\u07da\3\2\2\2\u07d9"+
		"\u07d4\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u07d9\3\2\2\2\u07db\u07dc\3\2"+
		"\2\2\u07dc\u07df\3\2\2\2\u07dd\u07de\7_\2\2\u07de\u07e0\5\u0106\u0084"+
		"\2\u07df\u07dd\3\2\2\2\u07df\u07e0\3\2\2\2\u07e0\u07e1\3\2\2\2\u07e1\u07e2"+
		"\7c\2\2\u07e2\u0115\3\2\2\2\u07e3\u07e9\7$\2\2\u07e4\u07e5\7\u0139\2\2"+
		"\u07e5\u07e6\5\u00f2z\2\u07e6\u07e7\7\u0121\2\2\u07e7\u07e8\5\u0106\u0084"+
		"\2\u07e8\u07ea\3\2\2\2\u07e9\u07e4\3\2\2\2\u07ea\u07eb\3\2\2\2\u07eb\u07e9"+
		"\3\2\2\2\u07eb\u07ec\3\2\2\2\u07ec\u07ef\3\2\2\2\u07ed\u07ee\7_\2\2\u07ee"+
		"\u07f0\5\u0106\u0084\2\u07ef\u07ed\3\2\2\2\u07ef\u07f0\3\2\2\2\u07f0\u07f1"+
		"\3\2\2\2\u07f1\u07f2\7c\2\2\u07f2\u0117\3\2\2\2\u07f3\u07f4\7\24\2\2\u07f4"+
		"\u07f6\7\u0171\2\2\u07f5\u07f7\5\u011a\u008e\2\u07f6\u07f5\3\2\2\2\u07f6"+
		"\u07f7\3\2\2\2\u07f7\u07f8\3\2\2\2\u07f8\u07f9\5\u0106\u0084\2\u07f9\u07fa"+
		"\b\u008d\1\2\u07fa\u07fc\7\u0175\2\2\u07fb\u07fd\5\u011c\u008f\2\u07fc"+
		"\u07fb\3\2\2\2\u07fc\u07fd\3\2\2\2\u07fd\u088c\3\2\2\2\u07fe\u07ff\7:"+
		"\2\2\u07ff\u0807\7\u0171\2\2\u0800\u0802\5\u011a\u008e\2\u0801\u0800\3"+
		"\2\2\2\u0801\u0802\3\2\2\2\u0802\u0803\3\2\2\2\u0803\u0804\5\u0106\u0084"+
		"\2\u0804\u0805\b\u008d\1\2\u0805\u0808\3\2\2\2\u0806\u0808\7\u016e\2\2"+
		"\u0807\u0801\3\2\2\2\u0807\u0806\3\2\2\2\u0808\u0809\3\2\2\2\u0809\u080b"+
		"\7\u0175\2\2\u080a\u080c\5\u011c\u008f\2\u080b\u080a\3\2\2\2\u080b\u080c"+
		"\3\2\2\2\u080c\u088c\3\2\2\2\u080d\u080e\7;\2\2\u080e\u0816\7\u0171\2"+
		"\2\u080f\u0811\5\u011a\u008e\2\u0810\u080f\3\2\2\2\u0810\u0811\3\2\2\2"+
		"\u0811\u0812\3\2\2\2\u0812\u0813\5\u0106\u0084\2\u0813\u0814\b\u008d\1"+
		"\2\u0814\u0817\3\2\2\2\u0815\u0817\7\u016e\2\2\u0816\u0810\3\2\2\2\u0816"+
		"\u0815\3\2\2\2\u0817\u0818\3\2\2\2\u0818\u081a\7\u0175\2\2\u0819\u081b"+
		"\5\u011c\u008f\2\u081a\u0819\3\2\2\2\u081a\u081b\3\2\2\2\u081b\u088c\3"+
		"\2\2\2\u081c\u081d\7\u0143\2\2\u081d\u081e\7\u0171\2\2\u081e\u081f\7\u0175"+
		"\2\2\u081f\u088c\5\u011c\u008f\2\u0820\u0821\7\u0147\2\2\u0821\u0822\7"+
		"\u0171\2\2\u0822\u0823\7\u0175\2\2\u0823\u088c\5\u011c\u008f\2\u0824\u0825"+
		"\7\u0148\2\2\u0825\u0826\7\u0171\2\2\u0826\u0827\5\u0106\u0084\2\u0827"+
		"\u0828\7\u0175\2\2\u0828\u0829\5\u011c\u008f\2\u0829\u088c\3\2\2\2\u082a"+
		"\u082b\7\u0149\2\2\u082b\u082c\7\u0171\2\2\u082c\u0833\5\u0106\u0084\2"+
		"\u082d\u082e\7\u015d\2\2\u082e\u0831\5\u0106\u0084\2\u082f\u0830\7\u015d"+
		"\2\2\u0830\u0832\5\u0106\u0084\2\u0831\u082f\3\2\2\2\u0831\u0832\3\2\2"+
		"\2\u0832\u0834\3\2\2\2\u0833\u082d\3\2\2\2\u0833\u0834\3\2\2\2\u0834\u0835"+
		"\3\2\2\2\u0835\u0836\7\u0175\2\2\u0836\u0837\5\u011c\u008f\2\u0837\u088c"+
		"\3\2\2\2\u0838\u0839\7\u014a\2\2\u0839\u083a\7\u0171\2\2\u083a\u083b\5"+
		"\u0106\u0084\2\u083b\u083c\7\u0175\2\2\u083c\u083d\5\u011c\u008f\2\u083d"+
		"\u088c\3\2\2\2\u083e\u083f\7\u014b\2\2\u083f\u0840\7\u0171\2\2\u0840\u0847"+
		"\5\u0106\u0084\2\u0841\u0842\7\u015d\2\2\u0842\u0845\5\u0106\u0084\2\u0843"+
		"\u0844\7\u015d\2\2\u0844\u0846\5\u0106\u0084\2\u0845\u0843\3\2\2\2\u0845"+
		"\u0846\3\2\2\2\u0846\u0848\3\2\2\2\u0847\u0841\3\2\2\2\u0847\u0848\3\2"+
		"\2\2\u0848\u0849\3\2\2\2\u0849\u084a\7\u0175\2\2\u084a\u084b\5\u011c\u008f"+
		"\2\u084b\u088c\3\2\2\2\u084c\u084d\7\u00b2\2\2\u084d\u084f\7\u0171\2\2"+
		"\u084e\u0850\5\u011a\u008e\2\u084f\u084e\3\2\2\2\u084f\u0850\3\2\2\2\u0850"+
		"\u0851\3\2\2\2\u0851\u0852\5\u0106\u0084\2\u0852\u0853\b\u008d\1\2\u0853"+
		"\u0855\7\u0175\2\2\u0854\u0856\5\u011c\u008f\2\u0855\u0854\3\2\2\2\u0855"+
		"\u0856\3\2\2\2\u0856\u088c\3\2\2\2\u0857\u0858\7\u00b8\2\2\u0858\u085a"+
		"\7\u0171\2\2\u0859\u085b\5\u011a\u008e\2\u085a\u0859\3\2\2\2\u085a\u085b"+
		"\3\2\2\2\u085b\u085c\3\2\2\2\u085c\u085d\5\u0106\u0084\2\u085d\u085e\b"+
		"\u008d\1\2\u085e\u0860\7\u0175\2\2\u085f\u0861\5\u011c\u008f\2\u0860\u085f"+
		"\3\2\2\2\u0860\u0861\3\2\2\2\u0861\u088c\3\2\2\2\u0862\u0863\7\u0154\2"+
		"\2\u0863\u0864\7\u0171\2\2\u0864\u0865\7\u0175\2\2\u0865\u088c\5\u011c"+
		"\u008f\2\u0866\u0867\7\u0155\2\2\u0867\u0868\7\u0171\2\2\u0868\u0869\7"+
		"\u0175\2\2\u0869\u088c\5\u011c\u008f\2\u086a\u086b\7\u0156\2\2\u086b\u086d"+
		"\7\u0171\2\2\u086c\u086e\5\u011a\u008e\2\u086d\u086c\3\2\2\2\u086d\u086e"+
		"\3\2\2\2\u086e\u086f\3\2\2\2\u086f\u0870\5\u0106\u0084\2\u0870\u0871\b"+
		"\u008d\1\2\u0871\u0873\7\u0175\2\2\u0872\u0874\5\u011c\u008f\2\u0873\u0872"+
		"\3\2\2\2\u0873\u0874\3\2\2\2\u0874\u088c\3\2\2\2\u0875\u0876\7\u0119\2"+
		"\2\u0876\u0878\7\u0171\2\2\u0877\u0879\5\u011a\u008e\2\u0878\u0877\3\2"+
		"\2\2\u0878\u0879\3\2\2\2\u0879\u087a\3\2\2\2\u087a\u087b\5\u0106\u0084"+
		"\2\u087b\u087c\b\u008d\1\2\u087c\u087e\7\u0175\2\2\u087d\u087f\5\u011c"+
		"\u008f\2\u087e\u087d\3\2\2\2\u087e\u087f\3\2\2\2\u087f\u088c\3\2\2\2\u0880"+
		"\u0881\7\u0158\2\2\u0881\u0883\7\u0171\2\2\u0882\u0884\5\u011a\u008e\2"+
		"\u0883\u0882\3\2\2\2\u0883\u0884\3\2\2\2\u0884\u0885\3\2\2\2\u0885\u0886"+
		"\5\u0106\u0084\2\u0886\u0887\b\u008d\1\2\u0887\u0889\7\u0175\2\2\u0888"+
		"\u088a\5\u011c\u008f\2\u0889\u0888\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u088c"+
		"\3\2\2\2\u088b\u07f3\3\2\2\2\u088b\u07fe\3\2\2\2\u088b\u080d\3\2\2\2\u088b"+
		"\u081c\3\2\2\2\u088b\u0820\3\2\2\2\u088b\u0824\3\2\2\2\u088b\u082a\3\2"+
		"\2\2\u088b\u0838\3\2\2\2\u088b\u083e\3\2\2\2\u088b\u084c\3\2\2\2\u088b"+
		"\u0857\3\2\2\2\u088b\u0862\3\2\2\2\u088b\u0866\3\2\2\2\u088b\u086a\3\2"+
		"\2\2\u088b\u0875\3\2\2\2\u088b\u0880\3\2\2\2\u088c\u0119\3\2\2\2\u088d"+
		"\u088e\t\34\2\2\u088e\u011b\3\2\2\2\u088f\u0890\7\u00d0\2\2\u0890\u0892"+
		"\7\u0171\2\2\u0891\u0893\5\u011e\u0090\2\u0892\u0891\3\2\2\2\u0892\u0893"+
		"\3\2\2\2\u0893\u0895\3\2\2\2\u0894\u0896\5\u00eex\2\u0895\u0894\3\2\2"+
		"\2\u0895\u0896\3\2\2\2\u0896\u0897\3\2\2\2\u0897\u0898\7\u0175\2\2\u0898"+
		"\u011d\3\2\2\2\u0899\u089a\7\u00d4\2\2\u089a\u089b\7\37\2\2\u089b\u08a0"+
		"\5\u0106\u0084\2\u089c\u089d\7\u015d\2\2\u089d\u089f\5\u0106\u0084\2\u089e"+
		"\u089c\3\2\2\2\u089f\u08a2\3\2\2\2\u08a0\u089e\3\2\2\2\u08a0\u08a1\3\2"+
		"\2\2\u08a1\u011f\3\2\2\2\u08a2\u08a0\3\2\2\2\u08a3\u096c\7\u0142\2\2\u08a4"+
		"\u08a5\7&\2\2\u08a5\u08a6\7\u0171\2\2\u08a6\u08a7\5\u0106\u0084\2\u08a7"+
		"\u08a8\7\17\2\2\u08a8\u08aa\5l\67\2\u08a9\u08ab\5n8\2\u08aa\u08a9\3\2"+
		"\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac\u08ad\7\u0175\2\2\u08ad"+
		"\u096c\3\2\2\2\u08ae\u08af\7:\2\2\u08af\u08b2\7\u0171\2\2\u08b0\u08b3"+
		"\5\u0106\u0084\2\u08b1\u08b3\7\u016e\2\2\u08b2\u08b0\3\2\2\2\u08b2\u08b1"+
		"\3\2\2\2\u08b3\u08b4\3\2\2\2\u08b4\u096c\7\u0175\2\2\u08b5\u096c\7\u0144"+
		"\2\2\u08b6\u08b7\7@\2\2\u08b7\u096c\7E\2\2\u08b8\u08bc\7\u0145\2\2\u08b9"+
		"\u08ba\7@\2\2\u08ba\u08bc\7\u0122\2\2\u08bb\u08b8\3\2\2\2\u08bb\u08b9"+
		"\3\2\2\2\u08bc\u08c1\3\2\2\2\u08bd\u08be\7\u0171\2\2\u08be\u08bf\5\u0106"+
		"\u0084\2\u08bf\u08c0\7\u0175\2\2\u08c0\u08c2\3\2\2\2\u08c1\u08bd\3\2\2"+
		"\2\u08c1\u08c2\3\2\2\2\u08c2\u096c\3\2\2\2\u08c3\u096c\7\u0146\2\2\u08c4"+
		"\u08c5\7@\2\2\u08c5\u096c\7\u0159\2\2\u08c6\u08c7\7\u014c\2\2\u08c7\u08c8"+
		"\7\u0171\2\2\u08c8\u08d5\5\u0106\u0084\2\u08c9\u08ca\7\u015d\2\2\u08ca"+
		"\u08d2\5\u0106\u0084\2\u08cb\u08cc\7\u015d\2\2\u08cc\u08cd\5\u0106\u0084"+
		"\2\u08cd\u08ce\7\u0166\2\2\u08ce\u08cf\5\u0106\u0084\2\u08cf\u08d1\3\2"+
		"\2\2\u08d0\u08cb\3\2\2\2\u08d1\u08d4\3\2\2\2\u08d2\u08d0\3\2\2\2\u08d2"+
		"\u08d3\3\2\2\2\u08d3\u08d6\3\2\2\2\u08d4\u08d2\3\2\2\2\u08d5\u08c9\3\2"+
		"\2\2\u08d5\u08d6\3\2\2\2\u08d6\u08d7\3\2\2\2\u08d7\u08d8\7\u0175\2\2\u08d8"+
		"\u096c\3\2\2\2\u08d9\u08da\7\u014d\2\2\u08da\u08db\7\u0171\2\2\u08db\u08e8"+
		"\5\u0106\u0084\2\u08dc\u08dd\7\u015d\2\2\u08dd\u08e5\5\u0106\u0084\2\u08de"+
		"\u08df\7\u015d\2\2\u08df\u08e0\5\u0106\u0084\2\u08e0\u08e1\7\u0166\2\2"+
		"\u08e1\u08e2\5\u0106\u0084\2\u08e2\u08e4\3\2\2\2\u08e3\u08de\3\2\2\2\u08e4"+
		"\u08e7\3\2\2\2\u08e5\u08e3\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08e9\3\2"+
		"\2\2\u08e7\u08e5\3\2\2\2\u08e8\u08dc\3\2\2\2\u08e8\u08e9\3\2\2\2\u08e9"+
		"\u08ea\3\2\2\2\u08ea\u08eb\7\u0175\2\2\u08eb\u096c\3\2\2\2\u08ec\u08ed"+
		"\7\u014e\2\2\u08ed\u08ee\7\u0171\2\2\u08ee\u08fb\5\u0106\u0084\2\u08ef"+
		"\u08f0\7\u015d\2\2\u08f0\u08f8\5\u0106\u0084\2\u08f1\u08f2\7\u015d\2\2"+
		"\u08f2\u08f3\5\u0106\u0084\2\u08f3\u08f4\7\u0166\2\2\u08f4\u08f5\5\u0106"+
		"\u0084\2\u08f5\u08f7\3\2\2\2\u08f6\u08f1\3\2\2\2\u08f7\u08fa\3\2\2\2\u08f8"+
		"\u08f6\3\2\2\2\u08f8\u08f9\3\2\2\2\u08f9\u08fc\3\2\2\2\u08fa\u08f8\3\2"+
		"\2\2\u08fb\u08ef\3\2\2\2\u08fb\u08fc\3\2\2\2\u08fc\u08fd\3\2\2\2\u08fd"+
		"\u08fe\7\u0175\2\2\u08fe\u096c\3\2\2\2\u08ff\u0900\7\u014f\2\2\u0900\u0901"+
		"\7\u0171\2\2\u0901\u090e\5\u0106\u0084\2\u0902\u0903\7\u015d\2\2\u0903"+
		"\u090b\5\u0106\u0084\2\u0904\u0905\7\u015d\2\2\u0905\u0906\5\u0106\u0084"+
		"\2\u0906\u0907\7\u0166\2\2\u0907\u0908\5\u0106\u0084\2\u0908\u090a\3\2"+
		"\2\2\u0909\u0904\3\2\2\2\u090a\u090d\3\2\2\2\u090b\u0909\3\2\2\2\u090b"+
		"\u090c\3\2\2\2\u090c\u090f\3\2\2\2\u090d\u090b\3\2\2\2\u090e\u0902\3\2"+
		"\2\2\u090e\u090f\3\2\2\2\u090f\u0910\3\2\2\2\u0910\u0911\7\u0175\2\2\u0911"+
		"\u096c\3\2\2\2\u0912\u0913\7\u0150\2\2\u0913\u0914\7\u0171\2\2\u0914\u0921"+
		"\5\u0106\u0084\2\u0915\u0916\7\u015d\2\2\u0916\u091e\5\u0106\u0084\2\u0917"+
		"\u0918\7\u015d\2\2\u0918\u0919\5\u0106\u0084\2\u0919\u091a\7\u0166\2\2"+
		"\u091a\u091b\5\u0106\u0084\2\u091b\u091d\3\2\2\2\u091c\u0917\3\2\2\2\u091d"+
		"\u0920\3\2\2\2\u091e\u091c\3\2\2\2\u091e\u091f\3\2\2\2\u091f\u0922\3\2"+
		"\2\2\u0920\u091e\3\2\2\2\u0921\u0915\3\2\2\2\u0921\u0922\3\2\2\2\u0922"+
		"\u0923\3\2\2\2\u0923\u0924\7\u0175\2\2\u0924\u096c\3\2\2\2\u0925\u0926"+
		"\7\u0151\2\2\u0926\u0927\7\u0171\2\2\u0927\u0934\5\u0106\u0084\2\u0928"+
		"\u0929\7\u015d\2\2\u0929\u0931\5\u0106\u0084\2\u092a\u092b\7\u015d\2\2"+
		"\u092b\u092c\5\u0106\u0084\2\u092c\u092d\7\u0166\2\2\u092d\u092e\5\u0106"+
		"\u0084\2\u092e\u0930\3\2\2\2\u092f\u092a\3\2\2\2\u0930\u0933\3\2\2\2\u0931"+
		"\u092f\3\2\2\2\u0931\u0932\3\2\2\2\u0932\u0935\3\2\2\2\u0933\u0931\3\2"+
		"\2\2\u0934\u0928\3\2\2\2\u0934\u0935\3\2\2\2\u0935\u0936\3\2\2\2\u0936"+
		"\u0937\7\u0175\2\2\u0937\u096c\3\2\2\2\u0938\u0939\7\u0152\2\2\u0939\u093a"+
		"\7\u0171\2\2\u093a\u0942\5\u0106\u0084\2\u093b\u093c\7\u015d\2\2\u093c"+
		"\u093d\5\u0106\u0084\2\u093d\u093e\7\u0166\2\2\u093e\u093f\5\u0106\u0084"+
		"\2\u093f\u0941\3\2\2\2\u0940\u093b\3\2\2\2\u0941\u0944\3\2\2\2\u0942\u0940"+
		"\3\2\2\2\u0942\u0943\3\2\2\2\u0943\u0945\3\2\2\2\u0944\u0942\3\2\2\2\u0945"+
		"\u0946\7\u0175\2\2\u0946\u096c\3\2\2\2\u0947\u0948\7\u0153\2\2\u0948\u0949"+
		"\7\u0171\2\2\u0949\u094f\5\u0106\u0084\2\u094a\u094b\7\u015d\2\2\u094b"+
		"\u094c\5\u0106\u0084\2\u094c\u094d\7\u0166\2\2\u094d\u094e\5\u0106\u0084"+
		"\2\u094e\u0950\3\2\2\2\u094f\u094a\3\2\2\2\u0950\u0951\3\2\2\2\u0951\u094f"+
		"\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u0955\3\2\2\2\u0953\u0954\7\u015d\2"+
		"\2\u0954\u0956\5\u0106\u0084\2\u0955\u0953\3\2\2\2\u0955\u0956\3\2\2\2"+
		"\u0956\u0957\3\2\2\2\u0957\u0958\7\u0175\2\2\u0958\u096c\3\2\2\2\u0959"+
		"\u095a\7\u00f9\2\2\u095a\u095b\7\u0171\2\2\u095b\u095c\5\u0106\u0084\2"+
		"\u095c\u095d\7";
	private static final String _serializedATNSegment1 =
		"\u0175\2\2\u095d\u096c\3\2\2\2\u095e\u095f\7\u0118\2\2\u095f\u0960\7\u0171"+
		"\2\2\u0960\u0961\5\u0106\u0084\2\u0961\u0962\7x\2\2\u0962\u0965\5\u0106"+
		"\u0084\2\u0963\u0964\7t\2\2\u0964\u0966\5\u0106\u0084\2\u0965\u0963\3"+
		"\2\2\2\u0965\u0966\3\2\2\2\u0966\u0967\3\2\2\2\u0967\u0968\7\u0175\2\2"+
		"\u0968\u096c\3\2\2\2\u0969\u096c\7\u0157\2\2\u096a\u096c\7\u0159\2\2\u096b"+
		"\u08a3\3\2\2\2\u096b\u08a4\3\2\2\2\u096b\u08ae\3\2\2\2\u096b\u08b5\3\2"+
		"\2\2\u096b\u08b6\3\2\2\2\u096b\u08bb\3\2\2\2\u096b\u08c3\3\2\2\2\u096b"+
		"\u08c4\3\2\2\2\u096b\u08c6\3\2\2\2\u096b\u08d9\3\2\2\2\u096b\u08ec\3\2"+
		"\2\2\u096b\u08ff\3\2\2\2\u096b\u0912\3\2\2\2\u096b\u0925\3\2\2\2\u096b"+
		"\u0938\3\2\2\2\u096b\u0947\3\2\2\2\u096b\u0959\3\2\2\2\u096b\u095e\3\2"+
		"\2\2\u096b\u0969\3\2\2\2\u096b\u096a\3\2\2\2\u096c\u0121\3\2\2\2\u096d"+
		"\u096e\5\u0130\u0099\2\u096e\u0970\7\u0171\2\2\u096f\u0971\5\u0124\u0093"+
		"\2\u0970\u096f\3\2\2\2\u0970\u0971\3\2\2\2\u0971\u0972\3\2\2\2\u0972\u0973"+
		"\7\u0175\2\2\u0973\u0123\3\2\2\2\u0974\u0979\5\u0126\u0094\2\u0975\u0976"+
		"\7\u015d\2\2\u0976\u0978\5\u0126\u0094\2\u0977\u0975\3\2\2\2\u0978\u097b"+
		"\3\2\2\2\u0979\u0977\3\2\2\2\u0979\u097a\3\2\2\2\u097a\u0125\3\2\2\2\u097b"+
		"\u0979\3\2\2\2\u097c\u0982\6\u0094\r\2\u097d\u097e\5\u0130\u0099\2\u097e"+
		"\u0980\7\u0166\2\2\u097f\u0981\7\u016a\2\2\u0980\u097f\3\2\2\2\u0980\u0981"+
		"\3\2\2\2\u0981\u0983\3\2\2\2\u0982\u097d\3\2\2\2\u0982\u0983\3\2\2\2\u0983"+
		"\u0984\3\2\2\2\u0984\u0985\5\u0106\u0084\2\u0985\u0127\3\2\2\2\u0986\u098a"+
		"\7\u0171\2\2\u0987\u0989\n\35\2\2\u0988\u0987\3\2\2\2\u0989\u098c\3\2"+
		"\2\2\u098a\u0988\3\2\2\2\u098a\u098b\3\2\2\2\u098b\u098d\3\2\2\2\u098c"+
		"\u098a\3\2\2\2\u098d\u098e\b\u0095\1\2\u098e\u0129\3\2\2\2\u098f\u0990"+
		"\7E\2\2\u0990\u0991\5\u0132\u009a\2\u0991\u012b\3\2\2\2\u0992\u0993\7"+
		"\u0122\2\2\u0993\u0994\5\u0132\u009a\2\u0994\u012d\3\2\2\2\u0995\u0996"+
		"\t\36\2\2\u0996\u012f\3\2\2\2\u0997\u099c\7\u0179\2\2\u0998\u0999\7\6"+
		"\2\2\u0999\u099b\7\u0179\2\2\u099a\u0998\3\2\2\2\u099b\u099e\3\2\2\2\u099c"+
		"\u099a\3\2\2\2\u099c\u099d\3\2\2\2\u099d\u0131\3\2\2\2\u099e\u099c\3\2"+
		"\2\2\u099f\u09a2\7\u017a\2\2\u09a0\u09a2\7\u017c\2\2\u09a1\u099f\3\2\2"+
		"\2\u09a1\u09a0\3\2\2\2\u09a2\u0133\3\2\2\2\u09a3\u09a4\7\u017b\2\2\u09a4"+
		"\u09a8\b\u009b\1\2\u09a5\u09a6\7\u017d\2\2\u09a6\u09a8\b\u009b\1\2\u09a7"+
		"\u09a3\3\2\2\2\u09a7\u09a5\3\2\2\2\u09a8\u0135\3\2\2\2\u09a9\u09ab\t\37"+
		"\2\2\u09aa\u09a9\3\2\2\2\u09aa\u09ab\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac"+
		"\u09ad\7\u017e\2\2\u09ad\u0137\3\2\2\2\u09ae\u09b0\t\37\2\2\u09af\u09ae"+
		"\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0\u09b1\3\2\2\2\u09b1\u09b2\7\u017f\2"+
		"\2\u09b2\u0139\3\2\2\2\u09b3\u09b4\t \2\2\u09b4\u013b\3\2\2\2\u09b5\u09b6"+
		"\7\u00c4\2\2\u09b6\u013d\3\2\2\2\u09b7\u09b8\t!\2\2\u09b8\u013f\3\2\2"+
		"\2\u09b9\u09ba\7\u0185\2\2\u09ba\u09bb\b\u00a1\1\2\u09bb\u0141\3\2\2\2"+
		"\u0130\u0145\u014c\u014f\u0153\u015f\u0162\u0169\u0175\u0177\u0180\u0183"+
		"\u0185\u0198\u019e\u01b3\u01be\u01c6\u01cc\u01d0\u01d4\u01dd\u01e2\u01e9"+
		"\u01f0\u01f8\u01fd\u0206\u0211\u021c\u0228\u022d\u0230\u023c\u0246\u024e"+
		"\u025b\u0265\u026f\u0273\u0277\u027c\u0280\u0285\u0289\u028d\u0294\u029d"+
		"\u02a3\u02a7\u02b0\u02b3\u02b8\u02bd\u02c4\u02cb\u02ce\u02d5\u02da\u02df"+
		"\u02e6\u02eb\u02ee\u02f4\u0302\u030c\u0312\u0317\u031c\u0321\u0325\u032a"+
		"\u0334\u0340\u0347\u034a\u0356\u035d\u0364\u0370\u037d\u037f\u0384\u0387"+
		"\u0396\u039c\u03a7\u03aa\u03b4\u03bb\u03c1\u03cf\u03d3\u03d8\u03dc\u03e1"+
		"\u03e4\u03e9\u03ec\u03fa\u041a\u041c\u0421\u0425\u042a\u0431\u0434\u0437"+
		"\u043c\u0440\u0442\u0449\u044f\u0456\u045c\u0466\u046f\u0472\u0476\u0479"+
		"\u047c\u0482\u048c\u0497\u049a\u04a1\u04a6\u04ab\u04af\u04b7\u04bb\u04c0"+
		"\u04c4\u04c6\u04ca\u04d2\u04da\u04dd\u04e2\u04ed\u04f6\u04fa\u0505\u0509"+
		"\u0514\u051a\u0534\u0540\u0547\u054f\u0557\u055b\u0561\u0568\u0572\u0576"+
		"\u057a\u0581\u0586\u058c\u0590\u0596\u05a0\u05a7\u05b2\u05b9\u05c3\u05ca"+
		"\u05d1\u05d4\u05de\u05e3\u05f0\u05fb\u0603\u0607\u060b\u060f\u0611\u0616"+
		"\u061a\u061d\u0621\u0624\u0629\u062c\u062f\u0633\u0636\u063b\u063e\u0641"+
		"\u0648\u064e\u0656\u065a\u065d\u0663\u066a\u066e\u0678\u0680\u0687\u068d"+
		"\u0691\u0699\u06a3\u06a6\u06ab\u06ae\u06b8\u06bd\u06c6\u06cb\u06cf\u06d8"+
		"\u06dc\u06f1\u0706\u070c\u0710\u0717\u071f\u0725\u072a\u0735\u073e\u0742"+
		"\u074b\u074f\u0759\u075e\u076b\u0779\u077c\u078f\u07a4\u07a6\u07b1\u07c0"+
		"\u07cc\u07d0\u07db\u07df\u07eb\u07ef\u07f6\u07fc\u0801\u0807\u080b\u0810"+
		"\u0816\u081a\u0831\u0833\u0845\u0847\u084f\u0855\u085a\u0860\u086d\u0873"+
		"\u0878\u087e\u0883\u0889\u088b\u0892\u0895\u08a0\u08aa\u08b2\u08bb\u08c1"+
		"\u08d2\u08d5\u08e5\u08e8\u08f8\u08fb\u090b\u090e\u091e\u0921\u0931\u0934"+
		"\u0942\u0951\u0955\u0965\u096b\u0970\u0979\u0980\u0982\u098a\u099c\u09a1"+
		"\u09a7\u09aa\u09af";
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