// Generated from C:/Users/ALIENWARE/IdeaProjects/pl-sql-compiler/antlr\PLHQLStatements.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

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
		T_VARIANCE=342, T_USER=343, T_ADD=344, T_COLON=345, T_COMMA=346, T_PIPE=347, 
		T_DIV=348, T_DOT2=349, T_EQUAL=350, T_EQUAL2=351, T_NOTEQUAL=352, T_NOTEQUAL2=353, 
		T_GREATER=354, T_GREATEREQUAL=355, T_LESS=356, T_LESSEQUAL=357, T_MUL=358, 
		T_OPEN_B=359, T_OPEN_P=360, T_OPEN_SB=361, T_CLOSE_B=362, T_CLOSE_P=363, 
		T_CLOSE_SB=364, T_SEMICOLON=365, T_SUB=366, L_ID=367, L_S_STRING=368, 
		L_S_STRING_MISSING_RIGHT=369, L_D_STRING=370, L_D_STRING_MISSING_RIGHT=371, 
		L_INT=372, L_DEC=373, L_WS=374, L_M_COMMENT=375, L_S_COMMENT=376, L_FILE=377, 
		L_LABEL=378, L_INVALID_TOKEN=379;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_error_stmt = 2, RULE_begin_end_block = 3, 
		RULE_error_missing_end = 4, RULE_single_block_stmt = 5, RULE_block_end = 6, 
		RULE_proc_block = 7, RULE_stmt = 8, RULE_semicolon_stmt = 9, RULE_null_stmt = 10, 
		RULE_expr_stmt = 11, RULE_assignment_stmt = 12, RULE_assignment_stmt_item = 13, 
		RULE_assignment_stmt_single_item = 14, RULE_assignment_stmt_multiple_item = 15, 
		RULE_assignment_stmt_select_item = 16, RULE_break_stmt = 17, RULE_call_stmt = 18, 
		RULE_declare_stmt = 19, RULE_error_delcare_stmt = 20, RULE_declare_block = 21, 
		RULE_declare_block_inplace = 22, RULE_declare_stmt_item = 23, RULE_declare_var_item = 24, 
		RULE_create_table_stmt = 25, RULE_error_create_stmt = 26, RULE_error_create_table_stmt = 27, 
		RULE_create_local_temp_table_stmt = 28, RULE_create_table_definition = 29, 
		RULE_create_table_columns = 30, RULE_create_table_columns_item = 31, RULE_column_name = 32, 
		RULE_create_table_column_inline_cons = 33, RULE_create_table_column_cons = 34, 
		RULE_create_table_fk_action = 35, RULE_create_table_preoptions = 36, RULE_create_table_preoptions_item = 37, 
		RULE_create_table_preoptions_td_item = 38, RULE_create_table_options = 39, 
		RULE_create_table_options_item = 40, RULE_create_table_options_ora_item = 41, 
		RULE_create_table_options_db2_item = 42, RULE_create_table_options_td_item = 43, 
		RULE_create_table_options_hive_item = 44, RULE_create_table_hive_row_format = 45, 
		RULE_create_table_hive_row_format_fields = 46, RULE_create_table_options_mssql_item = 47, 
		RULE_create_table_options_mysql_item = 48, RULE_dtype = 49, RULE_dtype_len = 50, 
		RULE_dtype_attr = 51, RULE_dtype_default = 52, RULE_create_database_stmt = 53, 
		RULE_create_database_option = 54, RULE_c_function_header = 55, RULE_c_function_parameter_list = 56, 
		RULE_c_function_parameter_item = 57, RULE_create_function_stmt = 58, RULE_create_function_return = 59, 
		RULE_create_package_stmt = 60, RULE_package_spec = 61, RULE_package_spec_item = 62, 
		RULE_create_package_body_stmt = 63, RULE_package_body = 64, RULE_package_body_item = 65, 
		RULE_create_procedure_stmt = 66, RULE_error_create_procedure_stmt = 67, 
		RULE_create_routine_params = 68, RULE_create_routine_param_item = 69, 
		RULE_exec_stmt = 70, RULE_if_stmt = 71, RULE_if_function_stmt = 72, RULE_error_if_stmt = 73, 
		RULE_if_plsql_stmt = 74, RULE_error_if_plsql_stmt = 75, RULE_if_tsql_stmt = 76, 
		RULE_error_if_tsql_stmt = 77, RULE_if_bteq_stmt = 78, RULE_error_if_bteq_stmt = 79, 
		RULE_elseif_block = 80, RULE_else_block = 81, RULE_create_index_stmt = 82, 
		RULE_error_create_index_stmt = 83, RULE_create_index_col = 84, RULE_return_stmt = 85, 
		RULE_for_range_stmt = 86, RULE_for_function_stmt = 87, RULE_error_for_range_stmt = 88, 
		RULE_select_stmt = 89, RULE_cte_select_stmt = 90, RULE_cte_select_stmt_item = 91, 
		RULE_cte_select_cols = 92, RULE_fullselect_stmt = 93, RULE_fullselect_stmt_item = 94, 
		RULE_fullselect_set_clause = 95, RULE_subselect_stmt = 96, RULE_error_subselect = 97, 
		RULE_select_list = 98, RULE_select_list_set = 99, RULE_select_list_limit = 100, 
		RULE_select_list_item = 101, RULE_select_list_alias = 102, RULE_select_list_asterisk = 103, 
		RULE_into_clause = 104, RULE_from_clause = 105, RULE_error_from_clause = 106, 
		RULE_from_table_clause = 107, RULE_from_table_name_clause = 108, RULE_from_subselect_clause = 109, 
		RULE_from_join_clause = 110, RULE_from_join_type_clause = 111, RULE_from_table_values_clause = 112, 
		RULE_from_table_values_row = 113, RULE_from_alias_clause = 114, RULE_table_name = 115, 
		RULE_where_clause = 116, RULE_error_missing_bool_expr = 117, RULE_group_by_clause = 118, 
		RULE_having_clause = 119, RULE_qualify_clause = 120, RULE_order_by_clause = 121, 
		RULE_bool_expr = 122, RULE_bool_expr_atom = 123, RULE_bool_expr_unary = 124, 
		RULE_bool_expr_single_in = 125, RULE_bool_expr_multi_in = 126, RULE_bool_expr_binary = 127, 
		RULE_bool_expr_logical_operator = 128, RULE_bool_expr_binary_operator = 129, 
		RULE_expr = 130, RULE_expr_atom = 131, RULE_expr_interval = 132, RULE_interval_item = 133, 
		RULE_expr_concat = 134, RULE_expr_concat_item = 135, RULE_expr_case = 136, 
		RULE_expr_case_simple = 137, RULE_expr_case_searched = 138, RULE_expr_agg_window_func = 139, 
		RULE_expr_func_all_distinct = 140, RULE_expr_func_over_clause = 141, RULE_expr_func_partition_by_clause = 142, 
		RULE_expr_spec_func = 143, RULE_expr_func = 144, RULE_expr_func_params = 145, 
		RULE_func_param = 146, RULE_error_missing_right_p = 147, RULE_date_literal = 148, 
		RULE_timestamp_literal = 149, RULE_ident = 150, RULE_string = 151, RULE_error_string = 152, 
		RULE_int_number = 153, RULE_dec_number = 154, RULE_bool_literal = 155, 
		RULE_null_const = 156, RULE_non_reserved_words = 157, RULE_error_invalid_token = 158;
	public static final String[] ruleNames = {
		"program", "block", "error_stmt", "begin_end_block", "error_missing_end", 
		"single_block_stmt", "block_end", "proc_block", "stmt", "semicolon_stmt", 
		"null_stmt", "expr_stmt", "assignment_stmt", "assignment_stmt_item", "assignment_stmt_single_item", 
		"assignment_stmt_multiple_item", "assignment_stmt_select_item", "break_stmt", 
		"call_stmt", "declare_stmt", "error_delcare_stmt", "declare_block", "declare_block_inplace", 
		"declare_stmt_item", "declare_var_item", "create_table_stmt", "error_create_stmt", 
		"error_create_table_stmt", "create_local_temp_table_stmt", "create_table_definition", 
		"create_table_columns", "create_table_columns_item", "column_name", "create_table_column_inline_cons", 
		"create_table_column_cons", "create_table_fk_action", "create_table_preoptions", 
		"create_table_preoptions_item", "create_table_preoptions_td_item", "create_table_options", 
		"create_table_options_item", "create_table_options_ora_item", "create_table_options_db2_item", 
		"create_table_options_td_item", "create_table_options_hive_item", "create_table_hive_row_format", 
		"create_table_hive_row_format_fields", "create_table_options_mssql_item", 
		"create_table_options_mysql_item", "dtype", "dtype_len", "dtype_attr", 
		"dtype_default", "create_database_stmt", "create_database_option", "c_function_header", 
		"c_function_parameter_list", "c_function_parameter_item", "create_function_stmt", 
		"create_function_return", "create_package_stmt", "package_spec", "package_spec_item", 
		"create_package_body_stmt", "package_body", "package_body_item", "create_procedure_stmt", 
		"error_create_procedure_stmt", "create_routine_params", "create_routine_param_item", 
		"exec_stmt", "if_stmt", "if_function_stmt", "error_if_stmt", "if_plsql_stmt", 
		"error_if_plsql_stmt", "if_tsql_stmt", "error_if_tsql_stmt", "if_bteq_stmt", 
		"error_if_bteq_stmt", "elseif_block", "else_block", "create_index_stmt", 
		"error_create_index_stmt", "create_index_col", "return_stmt", "for_range_stmt", 
		"for_function_stmt", "error_for_range_stmt", "select_stmt", "cte_select_stmt", 
		"cte_select_stmt_item", "cte_select_cols", "fullselect_stmt", "fullselect_stmt_item", 
		"fullselect_set_clause", "subselect_stmt", "error_subselect", "select_list", 
		"select_list_set", "select_list_limit", "select_list_item", "select_list_alias", 
		"select_list_asterisk", "into_clause", "from_clause", "error_from_clause", 
		"from_table_clause", "from_table_name_clause", "from_subselect_clause", 
		"from_join_clause", "from_join_type_clause", "from_table_values_clause", 
		"from_table_values_row", "from_alias_clause", "table_name", "where_clause", 
		"error_missing_bool_expr", "group_by_clause", "having_clause", "qualify_clause", 
		"order_by_clause", "bool_expr", "bool_expr_atom", "bool_expr_unary", "bool_expr_single_in", 
		"bool_expr_multi_in", "bool_expr_binary", "bool_expr_logical_operator", 
		"bool_expr_binary_operator", "expr", "expr_atom", "expr_interval", "interval_item", 
		"expr_concat", "expr_concat_item", "expr_case", "expr_case_simple", "expr_case_searched", 
		"expr_agg_window_func", "expr_func_all_distinct", "expr_func_over_clause", 
		"expr_func_partition_by_clause", "expr_spec_func", "expr_func", "expr_func_params", 
		"func_param", "error_missing_right_p", "date_literal", "timestamp_literal", 
		"ident", "string", "error_string", "int_number", "dec_number", "bool_literal", 
		"null_const", "non_reserved_words", "error_invalid_token"
	};

	private static final String[] _LITERAL_NAMES = {
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
		null, null, null, null, null, null, null, null, null, "'+'", "':'", "','", 
		"'||'", "'/'", "'..'", "'='", "'=='", "'<>'", "'!='", "'>'", "'>='", "'<'", 
		"'<='", "'*'", "'{'", "'('", "'['", "'}'", "')'", "']'", "';'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
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
		"T_DEFINED", "T_DEFINER", "T_DEFINITION", "T_DELETE", "T_DELIMITED", "T_DELIMITER", 
		"T_DESC", "T_DESCRIBE", "T_DIAGNOSTICS", "T_DIR", "T_DIRECTORY", "T_DISTINCT", 
		"T_DISTRIBUTE", "T_DO", "T_DOUBLE", "T_DROP", "T_DYNAMIC", "T_ELSE", "T_ELSEIF", 
		"T_ELSIF", "T_ENABLE", "T_END", "T_ENGINE", "T_ESCAPED", "T_EXCEPT", "T_EXEC", 
		"T_EXECUTE", "T_EXCEPTION", "T_EXCLUSIVE", "T_EXISTS", "T_EXIT", "T_FALLBACK", 
		"T_FALSE", "T_FETCH", "T_FIELDS", "T_FILE", "T_FILES", "T_FLOAT", "T_FOR", 
		"T_FOREIGN", "T_FORMAT", "T_FOUND", "T_FROM", "T_FULL", "T_FUNCTION", 
		"T_GET", "T_GLOBAL", "T_GO", "T_GRANT", "T_GROUP", "T_HANDLER", "T_HASH", 
		"T_HAVING", "T_HDFS", "T_HIVE", "T_HOST", "T_IDENTITY", "T_IF", "T_IGNORE", 
		"T_IMMEDIATE", "T_IN", "T_INCLUDE", "T_INDEX", "T_INITRANS", "T_INNER", 
		"T_INOUT", "T_INSERT", "T_INT", "T_INT2", "T_INT4", "T_INT8", "T_INTEGER", 
		"T_INTERSECT", "T_INTERVAL", "T_INTO", "T_INVOKER", "T_IS", "T_ISOPEN", 
		"T_ITEMS", "T_JOIN", "T_KEEP", "T_KEY", "T_KEYS", "T_LANGUAGE", "T_LEAVE", 
		"T_LEFT", "T_LIKE", "T_LIMIT", "T_LINES", "T_LOCAL", "T_LOCATION", "T_LOCATOR", 
		"T_LOCATORS", "T_LOCKS", "T_LOG", "T_LOGGED", "T_LOGGING", "T_LOOP", "T_MAP", 
		"T_MATCHED", "T_MAX", "T_MAXTRANS", "T_MERGE", "T_MESSAGE_TEXT", "T_MICROSECOND", 
		"T_MICROSECONDS", "T_MIN", "T_MULTISET", "T_NCHAR", "T_NEW", "T_NVARCHAR", 
		"T_NO", "T_NOCOUNT", "T_NOCOMPRESS", "T_NOLOGGING", "T_NONE", "T_NOT", 
		"T_NOTFOUND", "T_NULL", "T_NUMERIC", "T_NUMBER", "T_OBJECT", "T_OFF", 
		"T_ON", "T_ONLY", "T_OPEN", "T_OR", "T_ORDER", "T_OUT", "T_OUTER", "T_OVER", 
		"T_OVERWRITE", "T_OWNER", "T_PACKAGE", "T_PARTITION", "T_PCTFREE", "T_PCTUSED", 
		"T_PLS_INTEGER", "T_PRECISION", "T_PRESERVE", "T_PRIMARY", "T_PRINT", 
		"T_PROC", "T_PROCEDURE", "T_QUALIFY", "T_QUERY_BAND", "T_QUIT", "T_QUOTED_IDENTIFIER", 
		"T_RAISE", "T_REAL", "T_REFERENCES", "T_REGEXP", "T_REPLACE", "T_RESIGNAL", 
		"T_RESTRICT", "T_RESULT", "T_RESULT_SET_LOCATOR", "T_RETURN", "T_RETURNS", 
		"T_REVERSE", "T_RIGHT", "T_RLIKE", "T_ROLE", "T_ROLLBACK", "T_ROW", "T_ROWS", 
		"T_ROWTYPE", "T_ROW_COUNT", "T_RR", "T_RS", "T_PWD", "T_TRIM", "T_SCHEMA", 
		"T_SECOND", "T_SECONDS", "T_SECURITY", "T_SEGMENT", "T_SEL", "T_SELECT", 
		"T_SET", "T_SESSION", "T_SESSIONS", "T_SETS", "T_SHARE", "T_SIGNAL", "T_SIMPLE_DOUBLE", 
		"T_SIMPLE_FLOAT", "T_SIMPLE_INTEGER", "T_SMALLDATETIME", "T_SMALLINT", 
		"T_SQL", "T_SQLEXCEPTION", "T_SQLINSERT", "T_SQLSTATE", "T_SQLWARNING", 
		"T_STATS", "T_STATISTICS", "T_STEP", "T_STORAGE", "T_STORED", "T_STRING", 
		"T_SUBDIR", "T_SUBSTRING", "T_SUM", "T_SUMMARY", "T_SYS_REFCURSOR", "T_TABLE", 
		"T_TABLESPACE", "T_TEMPORARY", "T_TERMINATED", "T_TEXTIMAGE_ON", "T_THEN", 
		"T_TIMESTAMP", "T_TINYINT", "T_TITLE", "T_TO", "T_TOP", "T_TRANSACTION", 
		"T_TRUE", "T_TRUNCATE", "T_TYPE", "T_UNION", "T_UNIQUE", "T_UPDATE", "T_UR", 
		"T_USE", "T_USING", "T_VALUE", "T_VALUES", "T_VAR", "T_VARCHAR", "T_VARCHAR2", 
		"T_VARYING", "T_VOID", "T_VOLATILE", "T_WHEN", "T_WHERE", "T_WHILE", "T_WITH", 
		"T_WITHOUT", "T_WORK", "T_XACT_ABORT", "T_XML", "T_YES", "T_ACTIVITY_COUNT", 
		"T_CUME_DIST", "T_CURRENT_DATE", "T_CURRENT_TIMESTAMP", "T_CURRENT_USER", 
		"T_DENSE_RANK", "T_FIRST_VALUE", "T_LAG", "T_LAST_VALUE", "T_LEAD", "T_MAX_PART_STRING", 
		"T_MIN_PART_STRING", "T_MAX_PART_INT", "T_MIN_PART_INT", "T_MAX_PART_DATE", 
		"T_MIN_PART_DATE", "T_PART_COUNT", "T_PART_LOC", "T_RANK", "T_ROW_NUMBER", 
		"T_STDEV", "T_SYSDATE", "T_VARIANCE", "T_USER", "T_ADD", "T_COLON", "T_COMMA", 
		"T_PIPE", "T_DIV", "T_DOT2", "T_EQUAL", "T_EQUAL2", "T_NOTEQUAL", "T_NOTEQUAL2", 
		"T_GREATER", "T_GREATEREQUAL", "T_LESS", "T_LESSEQUAL", "T_MUL", "T_OPEN_B", 
		"T_OPEN_P", "T_OPEN_SB", "T_CLOSE_B", "T_CLOSE_P", "T_CLOSE_SB", "T_SEMICOLON", 
		"T_SUB", "L_ID", "L_S_STRING", "L_S_STRING_MISSING_RIGHT", "L_D_STRING", 
		"L_D_STRING_MISSING_RIGHT", "L_INT", "L_DEC", "L_WS", "L_M_COMMENT", "L_S_COMMENT", 
		"L_FILE", "L_LABEL", "L_INVALID_TOKEN"
	};
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
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PLHQLStatementsParser.EOF, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			block();
			setState(319);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(324);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(321);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(322);
						stmt();
						}
						break;
					case 3:
						{
						setState(323);
						error_stmt();
						}
						break;
					}
					setState(327);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(326);
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
				setState(331); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_stmtContext error_stmt() throws RecognitionException {
		Error_stmtContext _localctx = new Error_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_error_stmt);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FROM:
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				error_subselect();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				error_missing_right_p();
				}
				break;
			case T_BEGIN:
			case T_DECLARE:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				error_missing_end();
				}
				break;
			case L_S_STRING_MISSING_RIGHT:
			case L_D_STRING_MISSING_RIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				error_string();
				}
				break;
			case T_WHERE:
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				error_missing_bool_expr();
				}
				break;
			case T__3:
			case T_IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				error_if_stmt();
				}
				break;
			case T_CREATE:
			case T_PROC:
			case T_PROCEDURE:
			case T_REPLACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(339);
				error_create_stmt();
				}
				break;
			case T_FOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(340);
				error_for_range_stmt();
				}
				break;
			case L_ID:
				enterOuterAlt(_localctx, 9);
				{
				setState(341);
				error_delcare_stmt();
				}
				break;
			case L_INVALID_TOKEN:
				enterOuterAlt(_localctx, 10);
				{
				setState(342);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitBegin_end_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_end_blockContext begin_end_block() throws RecognitionException {
		Begin_end_blockContext _localctx = new Begin_end_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_begin_end_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(345);
				declare_block();
				}
			}

			setState(348);
			match(T_BEGIN);
			setState(349);
			block();
			setState(350);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_missing_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_missing_endContext error_missing_end() throws RecognitionException {
		Error_missing_endContext _localctx = new Error_missing_endContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_error_missing_end);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(352);
				declare_block();
				}
			}

			setState(355);
			match(T_BEGIN);
			setState(356);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitSingle_block_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Single_block_stmtContext single_block_stmt() throws RecognitionException {
		Single_block_stmtContext _localctx = new Single_block_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_single_block_stmt);
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(T_BEGIN);
				setState(359);
				block();
				setState(360);
				block_end();
				}
				break;
			case T__0:
			case T__1:
			case T__3:
			case T_ALTER:
			case T_BREAK:
			case T_CALL:
			case T_CREATE:
			case T_DECLARE:
			case T_EXEC:
			case T_EXECUTE:
			case T_FOR:
			case T_FUNCTION:
			case T_IF:
			case T_NULL:
			case T_PACKAGE:
			case T_PROC:
			case T_PROCEDURE:
			case T_REPLACE:
			case T_RETURN:
			case T_SEL:
			case T_SELECT:
			case T_SET:
			case T_WITH:
			case T_DIV:
			case T_OPEN_P:
			case T_SEMICOLON:
			case L_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				stmt();
				setState(364);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(363);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitBlock_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_endContext block_end() throws RecognitionException {
		Block_endContext _localctx = new Block_endContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(369);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitProc_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Proc_blockContext proc_block() throws RecognitionException {
		Proc_blockContext _localctx = new Proc_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_proc_block);
		try {
			int _alt;
			setState(380);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(372);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(375); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(378);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(377);
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
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_local_temp_table_stmtContext create_local_temp_table_stmt() {
			return getRuleContext(Create_local_temp_table_stmtContext.class,0);
		}
		public Create_package_stmtContext create_package_stmt() {
			return getRuleContext(Create_package_stmtContext.class,0);
		}
		public Create_package_body_stmtContext create_package_body_stmt() {
			return getRuleContext(Create_package_body_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
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
		public If_function_stmtContext if_function_stmt() {
			return getRuleContext(If_function_stmtContext.class,0);
		}
		public For_function_stmtContext for_function_stmt() {
			return getRuleContext(For_function_stmtContext.class,0);
		}
		public Return_stmtContext return_stmt() {
			return getRuleContext(Return_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Null_stmtContext null_stmt() {
			return getRuleContext(Null_stmtContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				break_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(384);
				call_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				create_database_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(386);
				create_function_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(387);
				create_index_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(388);
				create_local_temp_table_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(389);
				create_package_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(390);
				create_package_body_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(391);
				create_procedure_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(392);
				create_table_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(393);
				declare_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(394);
				exec_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(395);
				for_range_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(396);
				if_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(397);
				if_function_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(398);
				for_function_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(399);
				return_stmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(400);
				select_stmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(401);
				null_stmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(402);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitSemicolon_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Semicolon_stmtContext semicolon_stmt() throws RecognitionException {
		Semicolon_stmtContext _localctx = new Semicolon_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_semicolon_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitNull_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_stmtContext null_stmt() throws RecognitionException {
		Null_stmtContext _localctx = new Null_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_null_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
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

	public static class Expr_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterExpr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitExpr_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitExpr_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("GO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"GO\")");
			setState(410);
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

	public static class Assignment_stmtContext extends ParserRuleContext {
		public List<Assignment_stmt_itemContext> assignment_stmt_item() {
			return getRuleContexts(Assignment_stmt_itemContext.class);
		}
		public Assignment_stmt_itemContext assignment_stmt_item(int i) {
			return getRuleContext(Assignment_stmt_itemContext.class,i);
		}
		public TerminalNode T_SET() { return getToken(PLHQLStatementsParser.T_SET, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitAssignment_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmtContext assignment_stmt() throws RecognitionException {
		Assignment_stmtContext _localctx = new Assignment_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_SET) {
				{
				setState(412);
				match(T_SET);
				}
			}

			setState(415);
			assignment_stmt_item();
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(416);
					match(T_COMMA);
					setState(417);
					assignment_stmt_item();
					}
					} 
				}
				setState(422);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitAssignment_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_itemContext assignment_stmt_item() throws RecognitionException {
		Assignment_stmt_itemContext _localctx = new Assignment_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment_stmt_item);
		try {
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(423);
				assignment_stmt_single_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				assignment_stmt_multiple_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitAssignment_stmt_single_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_single_itemContext assignment_stmt_single_item() throws RecognitionException {
		Assignment_stmt_single_itemContext _localctx = new Assignment_stmt_single_itemContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment_stmt_single_item);
		int _la;
		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				ident();
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(429);
					match(T_COLON);
					}
				}

				setState(432);
				match(T_EQUAL);
				setState(433);
				expr(0);
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(435);
				match(T_OPEN_P);
				setState(436);
				ident();
				setState(437);
				match(T_CLOSE_P);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(438);
					match(T_COLON);
					}
				}

				setState(441);
				match(T_EQUAL);
				setState(442);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitAssignment_stmt_multiple_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_multiple_itemContext assignment_stmt_multiple_item() throws RecognitionException {
		Assignment_stmt_multiple_itemContext _localctx = new Assignment_stmt_multiple_itemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment_stmt_multiple_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(T_OPEN_P);
			setState(447);
			ident();
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(448);
				match(T_COMMA);
				setState(449);
				ident();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
			match(T_CLOSE_P);
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(456);
				match(T_COLON);
				}
			}

			setState(459);
			match(T_EQUAL);
			setState(460);
			match(T_OPEN_P);
			setState(461);
			expr(0);
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(462);
				match(T_COMMA);
				setState(463);
				expr(0);
				}
				}
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(469);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitAssignment_stmt_select_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_stmt_select_itemContext assignment_stmt_select_item() throws RecognitionException {
		Assignment_stmt_select_itemContext _localctx = new Assignment_stmt_select_itemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assignment_stmt_select_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(471);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(472);
				match(T_OPEN_P);
				setState(473);
				ident();
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(474);
					match(T_COMMA);
					setState(475);
					ident();
					}
					}
					setState(480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(481);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(485);
				match(T_COLON);
				}
			}

			setState(488);
			match(T_EQUAL);
			setState(489);
			match(T_OPEN_P);
			setState(490);
			select_stmt();
			setState(491);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Break_stmtContext break_stmt() throws RecognitionException {
		Break_stmtContext _localctx = new Break_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_break_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
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
		public TerminalNode T_CALL() { return getToken(PLHQLStatementsParser.T_CALL, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCall_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_stmtContext call_stmt() throws RecognitionException {
		Call_stmtContext _localctx = new Call_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_call_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(T_CALL);
			setState(496);
			ident();
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(497);
				match(T_OPEN_P);
				setState(499);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(498);
					expr_func_params();
					}
					break;
				}
				setState(501);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(502);
				expr_func_params();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitDeclare_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmtContext declare_stmt() throws RecognitionException {
		Declare_stmtContext _localctx = new Declare_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_declare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(T_DECLARE);
			setState(506);
			declare_stmt_item();
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(507);
					match(T_COMMA);
					setState(508);
					declare_stmt_item();
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_delcare_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_delcare_stmtContext error_delcare_stmt() throws RecognitionException {
		Error_delcare_stmtContext _localctx = new Error_delcare_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_error_delcare_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			declare_stmt_item();
			setState(519);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(515);
					match(T_COMMA);
					setState(516);
					declare_stmt_item();
					}
					} 
				}
				setState(521);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitDeclare_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_blockContext declare_block() throws RecognitionException {
		Declare_blockContext _localctx = new Declare_blockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_declare_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(T_DECLARE);
			setState(523);
			declare_stmt_item();
			setState(524);
			match(T_SEMICOLON);
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==L_ID) {
				{
				{
				setState(525);
				declare_stmt_item();
				setState(526);
				match(T_SEMICOLON);
				}
				}
				setState(532);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitDeclare_block_inplace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_block_inplaceContext declare_block_inplace() throws RecognitionException {
		Declare_block_inplaceContext _localctx = new Declare_block_inplaceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_declare_block_inplace);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			declare_stmt_item();
			setState(534);
			match(T_SEMICOLON);
			setState(540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(535);
					declare_stmt_item();
					setState(536);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitDeclare_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_stmt_itemContext declare_stmt_item() throws RecognitionException {
		Declare_stmt_itemContext _localctx = new Declare_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declare_stmt_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitDeclare_var_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declare_var_itemContext declare_var_item() throws RecognitionException {
		Declare_var_itemContext _localctx = new Declare_var_itemContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_declare_var_item);
		int _la;
		try {
			int _alt;
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
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
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(553);
					match(T_AS);
					}
				}

				setState(556);
				dtype();
				setState(558);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(557);
					dtype_len();
					}
					break;
				}
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(560);
						dtype_attr();
						}
						} 
					}
					setState(565);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(567);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(566);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(569);
				ident();
				setState(570);
				match(T_CONSTANT);
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(571);
					match(T_AS);
					}
				}

				setState(574);
				dtype();
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(575);
					dtype_len();
					}
				}

				setState(578);
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
		public Create_table_definitionContext create_table_definition() {
			return getRuleContext(Create_table_definitionContext.class,0);
		}
		public TerminalNode T_IF() { return getToken(PLHQLStatementsParser.T_IF, 0); }
		public TerminalNode T_NOT() { return getToken(PLHQLStatementsParser.T_NOT, 0); }
		public TerminalNode T_EXISTS() { return getToken(PLHQLStatementsParser.T_EXISTS, 0); }
		public Create_table_preoptionsContext create_table_preoptions() {
			return getRuleContext(Create_table_preoptionsContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(T_CREATE);
			setState(583);
			match(T_TABLE);
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IF) {
				{
				setState(584);
				match(T_IF);
				setState(585);
				match(T_NOT);
				setState(586);
				match(T_EXISTS);
				}
			}

			setState(589);
			table_name();
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(590);
				create_table_preoptions();
				}
			}

			setState(593);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_create_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_create_stmtContext error_create_stmt() throws RecognitionException {
		Error_create_stmtContext _localctx = new Error_create_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_error_create_stmt);
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				error_create_table_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				error_create_index_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(597);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_create_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_create_table_stmtContext error_create_table_stmt() throws RecognitionException {
		Error_create_table_stmtContext _localctx = new Error_create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_error_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(T_CREATE);
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IF) {
				{
				setState(601);
				match(T_IF);
				setState(602);
				match(T_NOT);
				setState(603);
				match(T_EXISTS);
				}
			}

			setState(606);
			table_name();
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(607);
				create_table_preoptions();
				}
			}

			setState(610);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_local_temp_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_local_temp_table_stmtContext create_local_temp_table_stmt() throws RecognitionException {
		Create_local_temp_table_stmtContext _localctx = new Create_local_temp_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_create_local_temp_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(T_CREATE);
			setState(619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(613);
				match(T_LOCAL);
				setState(614);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(615);
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

				setState(618);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(621);
			match(T_TABLE);
			setState(622);
			ident();
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(623);
				create_table_preoptions();
				}
			}

			setState(626);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_definitionContext create_table_definition() throws RecognitionException {
		Create_table_definitionContext _localctx = new Create_table_definitionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_create_table_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(628);
					match(T_AS);
					}
				}

				setState(631);
				match(T_OPEN_P);
				setState(632);
				select_stmt();
				setState(633);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(636);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(635);
					match(T_AS);
					}
				}

				setState(638);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(639);
				match(T_OPEN_P);
				setState(640);
				create_table_columns();
				setState(641);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(645);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_columns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columnsContext create_table_columns() throws RecognitionException {
		Create_table_columnsContext _localctx = new Create_table_columnsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_create_table_columns);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			create_table_columns_item();
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(649);
				match(T_COMMA);
				setState(650);
				create_table_columns_item();
				}
				}
				setState(655);
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
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_columns_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_columns_itemContext create_table_columns_item() throws RecognitionException {
		Create_table_columns_itemContext _localctx = new Create_table_columns_itemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_create_table_columns_item);
		int _la;
		try {
			int _alt;
			setState(678);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				column_name();
				setState(657);
				dtype();
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(658);
					dtype_len();
					}
				}

				setState(664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(661);
						dtype_attr();
						}
						} 
					}
					setState(666);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T_DEFAULT - 74)) | (1L << (T_ENABLE - 74)) | (1L << (T_IDENTITY - 74)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOT - 192)) | (1L << (T_NULL - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_REFERENCES - 192)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (T_UNIQUE - 298)) | (1L << (T_WITH - 298)) | (1L << (T_COLON - 298)) | (1L << (T_EQUAL - 298)))) != 0)) {
					{
					{
					setState(667);
					create_table_column_inline_cons();
					}
					}
					setState(672);
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
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(673);
					match(T_CONSTRAINT);
					setState(674);
					ident();
					}
				}

				setState(677);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_column_inline_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_inline_consContext create_table_column_inline_cons() throws RecognitionException {
		Create_table_column_inline_consContext _localctx = new Create_table_column_inline_consContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_create_table_column_inline_cons);
		int _la;
		try {
			setState(714);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(682);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(683);
					match(T_NOT);
					}
				}

				setState(686);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(687);
				match(T_PRIMARY);
				setState(688);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(689);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(690);
				match(T_REFERENCES);
				setState(691);
				table_name();
				setState(692);
				match(T_OPEN_P);
				setState(693);
				ident();
				setState(694);
				match(T_CLOSE_P);
				setState(698);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(695);
					create_table_fk_action();
					}
					}
					setState(700);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(701);
				match(T_IDENTITY);
				setState(702);
				match(T_OPEN_P);
				setState(703);
				match(L_INT);
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(704);
					match(T_COMMA);
					setState(705);
					match(L_INT);
					}
					}
					setState(710);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(711);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(712);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(713);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_column_cons(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_column_consContext create_table_column_cons() throws RecognitionException {
		Create_table_column_consContext _localctx = new Create_table_column_consContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_create_table_column_cons);
		int _la;
		try {
			setState(770);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(716);
				match(T_PRIMARY);
				setState(717);
				match(T_KEY);
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(718);
					match(T_CLUSTERED);
					}
				}

				setState(721);
				match(T_OPEN_P);
				setState(722);
				ident();
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(723);
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

				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(726);
					match(T_COMMA);
					setState(727);
					ident();
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(728);
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
					setState(735);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(736);
				match(T_CLOSE_P);
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(737);
					match(T_ENABLE);
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				match(T_FOREIGN);
				setState(741);
				match(T_KEY);
				setState(742);
				match(T_OPEN_P);
				setState(743);
				ident();
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(744);
					match(T_COMMA);
					setState(745);
					ident();
					}
					}
					setState(750);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(751);
				match(T_CLOSE_P);
				setState(752);
				match(T_REFERENCES);
				setState(753);
				table_name();
				setState(754);
				match(T_OPEN_P);
				setState(755);
				ident();
				setState(760);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(756);
					match(T_COMMA);
					setState(757);
					ident();
					}
					}
					setState(762);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(763);
				match(T_CLOSE_P);
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(764);
					create_table_fk_action();
					}
					}
					setState(769);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_fk_action(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_fk_actionContext create_table_fk_action() throws RecognitionException {
		Create_table_fk_actionContext _localctx = new Create_table_fk_actionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_create_table_fk_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(T_ON);
			setState(773);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(782);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(774);
				match(T_NO);
				setState(775);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(776);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(777);
				match(T_SET);
				setState(778);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(779);
				match(T_SET);
				setState(780);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(781);
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
		public List<Create_table_preoptions_itemContext> create_table_preoptions_item() {
			return getRuleContexts(Create_table_preoptions_itemContext.class);
		}
		public Create_table_preoptions_itemContext create_table_preoptions_item(int i) {
			return getRuleContext(Create_table_preoptions_itemContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_preoptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptionsContext create_table_preoptions() throws RecognitionException {
		Create_table_preoptionsContext _localctx = new Create_table_preoptionsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_create_table_preoptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(784);
				create_table_preoptions_item();
				}
				}
				setState(787); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_ROW || _la==T_STORED || _la==T_COMMA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_preoptions_itemContext extends ParserRuleContext {
		public TerminalNode T_COMMA() { return getToken(PLHQLStatementsParser.T_COMMA, 0); }
		public Create_table_preoptions_td_itemContext create_table_preoptions_td_item() {
			return getRuleContext(Create_table_preoptions_td_itemContext.class,0);
		}
		public Create_table_options_hive_itemContext create_table_options_hive_item() {
			return getRuleContext(Create_table_options_hive_itemContext.class,0);
		}
		public Create_table_preoptions_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_preoptions_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_preoptions_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_preoptions_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_preoptions_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_itemContext create_table_preoptions_item() throws RecognitionException {
		Create_table_preoptions_itemContext _localctx = new Create_table_preoptions_itemContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_create_table_preoptions_item);
		try {
			setState(792);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				match(T_COMMA);
				setState(790);
				create_table_preoptions_td_item();
				}
				break;
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(791);
				create_table_options_hive_item();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_preoptions_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_preoptions_td_itemContext create_table_preoptions_td_item() throws RecognitionException {
		Create_table_preoptions_td_itemContext _localctx = new Create_table_preoptions_td_itemContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_create_table_preoptions_td_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(794);
				match(T_NO);
				}
			}

			setState(797);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_optionsContext create_table_options() throws RecognitionException {
		Create_table_optionsContext _localctx = new Create_table_optionsContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_create_table_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(800); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(799);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(802); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_options_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_itemContext create_table_options_item() throws RecognitionException {
		Create_table_options_itemContext _localctx = new Create_table_options_itemContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_create_table_options_item);
		int _la;
		try {
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(804);
				match(T_ON);
				setState(805);
				match(T_COMMIT);
				setState(806);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(807);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(809);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(810);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(811);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(812);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(813);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_options_ora_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_ora_itemContext create_table_options_ora_item() throws RecognitionException {
		Create_table_options_ora_itemContext _localctx = new Create_table_options_ora_itemContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_create_table_options_ora_item);
		int _la;
		try {
			setState(834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				match(T_SEGMENT);
				setState(817);
				match(T_CREATION);
				setState(818);
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
				setState(819);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(820);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(821);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(822);
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
				setState(823);
				match(T_STORAGE);
				setState(824);
				match(T_OPEN_P);
				setState(827); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(827);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(825);
						ident();
						}
						break;
					case L_INT:
						{
						setState(826);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(829); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==L_ID || _la==L_INT );
				setState(831);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(832);
				match(T_TABLESPACE);
				setState(833);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_options_db2_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_db2_itemContext create_table_options_db2_item() throws RecognitionException {
		Create_table_options_db2_itemContext _localctx = new Create_table_options_db2_itemContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_create_table_options_db2_item);
		int _la;
		try {
			setState(869);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(836);
					match(T_INDEX);
					}
				}

				setState(839);
				match(T_IN);
				setState(840);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				match(T_WITH);
				setState(842);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(843);
				match(T_DISTRIBUTE);
				setState(844);
				match(T_BY);
				setState(845);
				match(T_HASH);
				setState(846);
				match(T_OPEN_P);
				setState(847);
				ident();
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(848);
					match(T_COMMA);
					setState(849);
					ident();
					}
					}
					setState(854);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(855);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(857);
					match(T_NOT);
					}
				}

				setState(860);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(861);
				match(T_COMPRESS);
				setState(862);
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
				setState(863);
				match(T_DEFINITION);
				setState(864);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(865);
				match(T_WITH);
				setState(866);
				match(T_RESTRICT);
				setState(867);
				match(T_ON);
				setState(868);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_options_td_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_td_itemContext create_table_options_td_item() throws RecognitionException {
		Create_table_options_td_itemContext _localctx = new Create_table_options_td_itemContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_create_table_options_td_item);
		int _la;
		try {
			setState(889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(871);
					match(T_UNIQUE);
					}
				}

				setState(874);
				match(T_PRIMARY);
				setState(875);
				match(T_INDEX);
				setState(876);
				match(T_OPEN_P);
				setState(877);
				ident();
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(878);
					match(T_COMMA);
					setState(879);
					ident();
					}
					}
					setState(884);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(885);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				match(T_WITH);
				setState(888);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_options_hive_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_hive_itemContext create_table_options_hive_item() throws RecognitionException {
		Create_table_options_hive_itemContext _localctx = new Create_table_options_hive_itemContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_create_table_options_hive_item);
		try {
			setState(895);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(891);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(892);
				match(T_STORED);
				setState(893);
				match(T_AS);
				setState(894);
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
		public List<Create_table_hive_row_format_fieldsContext> create_table_hive_row_format_fields() {
			return getRuleContexts(Create_table_hive_row_format_fieldsContext.class);
		}
		public Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields(int i) {
			return getRuleContext(Create_table_hive_row_format_fieldsContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_hive_row_format(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_formatContext create_table_hive_row_format() throws RecognitionException {
		Create_table_hive_row_formatContext _localctx = new Create_table_hive_row_formatContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_create_table_hive_row_format);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(897);
			match(T_ROW);
			setState(898);
			match(T_FORMAT);
			setState(899);
			match(T_DELIMITED);
			setState(903);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(900);
					create_table_hive_row_format_fields();
					}
					} 
				}
				setState(905);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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

	public static class Create_table_hive_row_format_fieldsContext extends ParserRuleContext {
		public TerminalNode T_FIELDS() { return getToken(PLHQLStatementsParser.T_FIELDS, 0); }
		public TerminalNode T_TERMINATED() { return getToken(PLHQLStatementsParser.T_TERMINATED, 0); }
		public List<TerminalNode> T_BY() { return getTokens(PLHQLStatementsParser.T_BY); }
		public TerminalNode T_BY(int i) {
			return getToken(PLHQLStatementsParser.T_BY, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_ESCAPED() { return getToken(PLHQLStatementsParser.T_ESCAPED, 0); }
		public TerminalNode T_COLLECTION() { return getToken(PLHQLStatementsParser.T_COLLECTION, 0); }
		public TerminalNode T_ITEMS() { return getToken(PLHQLStatementsParser.T_ITEMS, 0); }
		public TerminalNode T_MAP() { return getToken(PLHQLStatementsParser.T_MAP, 0); }
		public TerminalNode T_KEYS() { return getToken(PLHQLStatementsParser.T_KEYS, 0); }
		public TerminalNode T_LINES() { return getToken(PLHQLStatementsParser.T_LINES, 0); }
		public TerminalNode T_NULL() { return getToken(PLHQLStatementsParser.T_NULL, 0); }
		public TerminalNode T_DEFINED() { return getToken(PLHQLStatementsParser.T_DEFINED, 0); }
		public TerminalNode T_AS() { return getToken(PLHQLStatementsParser.T_AS, 0); }
		public Create_table_hive_row_format_fieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_hive_row_format_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_table_hive_row_format_fields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_table_hive_row_format_fields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_hive_row_format_fields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_hive_row_format_fieldsContext create_table_hive_row_format_fields() throws RecognitionException {
		Create_table_hive_row_format_fieldsContext _localctx = new Create_table_hive_row_format_fieldsContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_create_table_hive_row_format_fields);
		try {
			setState(933);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				match(T_FIELDS);
				setState(907);
				match(T_TERMINATED);
				setState(908);
				match(T_BY);
				setState(909);
				expr(0);
				setState(913);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(910);
					match(T_ESCAPED);
					setState(911);
					match(T_BY);
					setState(912);
					expr(0);
					}
					break;
				}
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(915);
				match(T_COLLECTION);
				setState(916);
				match(T_ITEMS);
				setState(917);
				match(T_TERMINATED);
				setState(918);
				match(T_BY);
				setState(919);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(920);
				match(T_MAP);
				setState(921);
				match(T_KEYS);
				setState(922);
				match(T_TERMINATED);
				setState(923);
				match(T_BY);
				setState(924);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
				{
				setState(925);
				match(T_LINES);
				setState(926);
				match(T_TERMINATED);
				setState(927);
				match(T_BY);
				setState(928);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(929);
				match(T_NULL);
				setState(930);
				match(T_DEFINED);
				setState(931);
				match(T_AS);
				setState(932);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_options_mssql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mssql_itemContext create_table_options_mssql_item() throws RecognitionException {
		Create_table_options_mssql_itemContext _localctx = new Create_table_options_mssql_itemContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_create_table_options_mssql_item);
		try {
			setState(939);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				match(T_ON);
				setState(936);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(937);
				match(T_TEXTIMAGE_ON);
				setState(938);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_table_options_mysql_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_options_mysql_itemContext create_table_options_mysql_item() throws RecognitionException {
		Create_table_options_mysql_itemContext _localctx = new Create_table_options_mysql_itemContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_create_table_options_mysql_item);
		int _la;
		try {
			setState(968);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				match(T_AUTO_INCREMENT);
				setState(943);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(942);
					match(T_EQUAL);
					}
				}

				setState(945);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(946);
				match(T_COMMENT);
				setState(948);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(947);
					match(T_EQUAL);
					}
				}

				setState(950);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(951);
					match(T_DEFAULT);
					}
				}

				setState(957);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(954);
					match(T_CHARACTER);
					setState(955);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(956);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(959);
					match(T_EQUAL);
					}
				}

				setState(962);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(963);
				match(T_ENGINE);
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(964);
					match(T_EQUAL);
					}
				}

				setState(967);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitDtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dtype);
		int _la;
		try {
			setState(1016);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(970);
				match(T_CHAR);
				}
				break;
			case T_BIGINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(971);
				match(T_BIGINT);
				}
				break;
			case T_BINARY_DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(972);
				match(T_BINARY_DOUBLE);
				}
				break;
			case T_BINARY_FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(973);
				match(T_BINARY_FLOAT);
				}
				break;
			case T_BINARY_INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(974);
				match(T_BINARY_INTEGER);
				}
				break;
			case T_BIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(975);
				match(T_BIT);
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(976);
				match(T_DATE);
				}
				break;
			case T_DATETIME:
				enterOuterAlt(_localctx, 8);
				{
				setState(977);
				match(T_DATETIME);
				}
				break;
			case T_DEC:
				enterOuterAlt(_localctx, 9);
				{
				setState(978);
				match(T_DEC);
				}
				break;
			case T_DECIMAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(979);
				match(T_DECIMAL);
				}
				break;
			case T_DOUBLE:
				enterOuterAlt(_localctx, 11);
				{
				setState(980);
				match(T_DOUBLE);
				setState(982);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(981);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 12);
				{
				setState(984);
				match(T_FLOAT);
				}
				break;
			case T_INT:
				enterOuterAlt(_localctx, 13);
				{
				setState(985);
				match(T_INT);
				}
				break;
			case T_INT2:
				enterOuterAlt(_localctx, 14);
				{
				setState(986);
				match(T_INT2);
				}
				break;
			case T_INT4:
				enterOuterAlt(_localctx, 15);
				{
				setState(987);
				match(T_INT4);
				}
				break;
			case T_INT8:
				enterOuterAlt(_localctx, 16);
				{
				setState(988);
				match(T_INT8);
				}
				break;
			case T_INTEGER:
				enterOuterAlt(_localctx, 17);
				{
				setState(989);
				match(T_INTEGER);
				}
				break;
			case T_NCHAR:
				enterOuterAlt(_localctx, 18);
				{
				setState(990);
				match(T_NCHAR);
				}
				break;
			case T_NVARCHAR:
				enterOuterAlt(_localctx, 19);
				{
				setState(991);
				match(T_NVARCHAR);
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 20);
				{
				setState(992);
				match(T_NUMBER);
				}
				break;
			case T_NUMERIC:
				enterOuterAlt(_localctx, 21);
				{
				setState(993);
				match(T_NUMERIC);
				}
				break;
			case T_PLS_INTEGER:
				enterOuterAlt(_localctx, 22);
				{
				setState(994);
				match(T_PLS_INTEGER);
				}
				break;
			case T_REAL:
				enterOuterAlt(_localctx, 23);
				{
				setState(995);
				match(T_REAL);
				}
				break;
			case T_RESULT_SET_LOCATOR:
				enterOuterAlt(_localctx, 24);
				{
				setState(996);
				match(T_RESULT_SET_LOCATOR);
				setState(997);
				match(T_VARYING);
				}
				break;
			case T_SIMPLE_FLOAT:
				enterOuterAlt(_localctx, 25);
				{
				setState(998);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case T_SIMPLE_DOUBLE:
				enterOuterAlt(_localctx, 26);
				{
				setState(999);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case T_SIMPLE_INTEGER:
				enterOuterAlt(_localctx, 27);
				{
				setState(1000);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case T_SMALLINT:
				enterOuterAlt(_localctx, 28);
				{
				setState(1001);
				match(T_SMALLINT);
				}
				break;
			case T_SMALLDATETIME:
				enterOuterAlt(_localctx, 29);
				{
				setState(1002);
				match(T_SMALLDATETIME);
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 30);
				{
				setState(1003);
				match(T_STRING);
				}
				break;
			case T_SYS_REFCURSOR:
				enterOuterAlt(_localctx, 31);
				{
				setState(1004);
				match(T_SYS_REFCURSOR);
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 32);
				{
				setState(1005);
				match(T_TIMESTAMP);
				}
				break;
			case T_TINYINT:
				enterOuterAlt(_localctx, 33);
				{
				setState(1006);
				match(T_TINYINT);
				}
				break;
			case T_VARCHAR:
				enterOuterAlt(_localctx, 34);
				{
				setState(1007);
				match(T_VARCHAR);
				}
				break;
			case T_VOID:
				enterOuterAlt(_localctx, 35);
				{
				setState(1008);
				match(T_VOID);
				}
				break;
			case T_VARCHAR2:
				enterOuterAlt(_localctx, 36);
				{
				setState(1009);
				match(T_VARCHAR2);
				}
				break;
			case T_XML:
				enterOuterAlt(_localctx, 37);
				{
				setState(1010);
				match(T_XML);
				}
				break;
			case L_ID:
				enterOuterAlt(_localctx, 38);
				{
				setState(1011);
				ident();
				setState(1014);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					{
					setState(1012);
					match(T__2);
					}
					setState(1013);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitDtype_len(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_lenContext dtype_len() throws RecognitionException {
		Dtype_lenContext _localctx = new Dtype_lenContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_dtype_len);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			match(T_OPEN_P);
			setState(1019);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1020);
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

			setState(1025);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1023);
				match(T_COMMA);
				setState(1024);
				match(L_INT);
				}
			}

			setState(1027);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitDtype_attr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_attrContext dtype_attr() throws RecognitionException {
		Dtype_attrContext _localctx = new Dtype_attrContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_dtype_attr);
		int _la;
		try {
			setState(1040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1029);
					match(T_NOT);
					}
				}

				setState(1032);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1033);
				match(T_CHARACTER);
				setState(1034);
				match(T_SET);
				setState(1035);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1036);
					match(T_NOT);
					}
				}

				setState(1039);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitDtype_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dtype_defaultContext dtype_default() throws RecognitionException {
		Dtype_defaultContext _localctx = new Dtype_defaultContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_dtype_default);
		int _la;
		try {
			setState(1054);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1042);
					match(T_COLON);
					}
				}

				setState(1045);
				match(T_EQUAL);
				setState(1046);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1047);
					match(T_WITH);
					}
				}

				setState(1050);
				match(T_DEFAULT);
				setState(1052);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1051);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_database_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_create_database_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(T_CREATE);
			setState(1057);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IF) {
				{
				setState(1058);
				match(T_IF);
				setState(1059);
				match(T_NOT);
				setState(1060);
				match(T_EXISTS);
				}
			}

			setState(1063);
			expr(0);
			setState(1067);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1064);
					create_database_option();
					}
					} 
				}
				setState(1069);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_database_option(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_optionContext create_database_option() throws RecognitionException {
		Create_database_optionContext _localctx = new Create_database_optionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_create_database_option);
		try {
			setState(1074);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				match(T_COMMENT);
				setState(1071);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1072);
				match(T_LOCATION);
				setState(1073);
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

	public static class C_function_headerContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(PLHQLStatementsParser.T_SEMICOLON, 0); }
		public C_function_parameter_listContext c_function_parameter_list() {
			return getRuleContext(C_function_parameter_listContext.class,0);
		}
		public C_function_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c_function_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterC_function_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitC_function_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitC_function_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_function_headerContext c_function_header() throws RecognitionException {
		C_function_headerContext _localctx = new C_function_headerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_c_function_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			dtype();
			setState(1077);
			ident();
			setState(1078);
			match(T_OPEN_P);
			setState(1080);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (T_BIGINT - 22)) | (1L << (T_BINARY_DOUBLE - 22)) | (1L << (T_BINARY_FLOAT - 22)) | (1L << (T_BINARY_INTEGER - 22)) | (1L << (T_BIT - 22)) | (1L << (T_CHAR - 22)) | (1L << (T_DATE - 22)) | (1L << (T_DATETIME - 22)) | (1L << (T_DEC - 22)) | (1L << (T_DECIMAL - 22)))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (T_DOUBLE - 90)) | (1L << (T_FLOAT - 90)) | (1L << (T_INT - 90)) | (1L << (T_INT2 - 90)) | (1L << (T_INT4 - 90)) | (1L << (T_INT8 - 90)) | (1L << (T_INTEGER - 90)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (T_NCHAR - 184)) | (1L << (T_NVARCHAR - 184)) | (1L << (T_NUMERIC - 184)) | (1L << (T_NUMBER - 184)) | (1L << (T_PLS_INTEGER - 184)) | (1L << (T_REAL - 184)) | (1L << (T_RESULT_SET_LOCATOR - 184)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (T_SIMPLE_DOUBLE - 261)) | (1L << (T_SIMPLE_FLOAT - 261)) | (1L << (T_SIMPLE_INTEGER - 261)) | (1L << (T_SMALLDATETIME - 261)) | (1L << (T_SMALLINT - 261)) | (1L << (T_STRING - 261)) | (1L << (T_SYS_REFCURSOR - 261)) | (1L << (T_TIMESTAMP - 261)) | (1L << (T_TINYINT - 261)) | (1L << (T_VARCHAR - 261)) | (1L << (T_VARCHAR2 - 261)) | (1L << (T_VOID - 261)) | (1L << (T_XML - 261)))) != 0) || _la==L_ID) {
				{
				setState(1079);
				c_function_parameter_list();
				}
			}

			setState(1082);
			match(T_CLOSE_P);
			setState(1083);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitC_function_parameter_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_function_parameter_listContext c_function_parameter_list() throws RecognitionException {
		C_function_parameter_listContext _localctx = new C_function_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_c_function_parameter_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			c_function_parameter_item();
			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1086);
				match(T_COMMA);
				setState(1087);
				c_function_parameter_item();
				}
				}
				setState(1092);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitC_function_parameter_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final C_function_parameter_itemContext c_function_parameter_item() throws RecognitionException {
		C_function_parameter_itemContext _localctx = new C_function_parameter_itemContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_c_function_parameter_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			dtype();
			setState(1094);
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

	public static class Create_function_stmtContext extends ParserRuleContext {
		public TerminalNode T_FUNCTION() { return getToken(PLHQLStatementsParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Single_block_stmtContext single_block_stmt() {
			return getRuleContext(Single_block_stmtContext.class,0);
		}
		public TerminalNode T_ALTER() { return getToken(PLHQLStatementsParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(PLHQLStatementsParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(PLHQLStatementsParser.T_REPLACE, 0); }
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public Declare_block_inplaceContext declare_block_inplace() {
			return getRuleContext(Declare_block_inplaceContext.class,0);
		}
		public TerminalNode T_AS() { return getToken(PLHQLStatementsParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(PLHQLStatementsParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(PLHQLStatementsParser.T_OR, 0); }
		public Create_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_function_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_function_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_stmtContext create_function_stmt() throws RecognitionException {
		Create_function_stmtContext _localctx = new Create_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1096);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1097);
				match(T_CREATE);
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1098);
					match(T_OR);
					setState(1099);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1102);
				match(T_REPLACE);
				}
				break;
			case T_FUNCTION:
				break;
			default:
				break;
			}
			setState(1105);
			match(T_FUNCTION);
			setState(1106);
			ident();
			setState(1108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1107);
				create_routine_params();
				}
				break;
			}
			setState(1110);
			create_function_return();
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS || _la==T_IS) {
				{
				setState(1111);
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

			setState(1115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1114);
				declare_block_inplace();
				}
				break;
			}
			setState(1117);
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

	public static class Create_function_returnContext extends ParserRuleContext {
		public DtypeContext dtype() {
			return getRuleContext(DtypeContext.class,0);
		}
		public TerminalNode T_RETURN() { return getToken(PLHQLStatementsParser.T_RETURN, 0); }
		public TerminalNode T_RETURNS() { return getToken(PLHQLStatementsParser.T_RETURNS, 0); }
		public Dtype_lenContext dtype_len() {
			return getRuleContext(Dtype_lenContext.class,0);
		}
		public Create_function_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_function_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_function_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_function_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_function_returnContext create_function_return() throws RecognitionException {
		Create_function_returnContext _localctx = new Create_function_returnContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_create_function_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1120);
			dtype();
			setState(1122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1121);
				dtype_len();
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

	public static class Create_package_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(PLHQLStatementsParser.T_PACKAGE, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_specContext package_spec() {
			return getRuleContext(Package_specContext.class,0);
		}
		public TerminalNode T_END() { return getToken(PLHQLStatementsParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(PLHQLStatementsParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(PLHQLStatementsParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(PLHQLStatementsParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(PLHQLStatementsParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(PLHQLStatementsParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(PLHQLStatementsParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(PLHQLStatementsParser.T_OR, 0); }
		public Create_package_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_package_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_package_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_package_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_stmtContext create_package_stmt() throws RecognitionException {
		Create_package_stmtContext _localctx = new Create_package_stmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_create_package_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1124);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1125);
				match(T_CREATE);
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1126);
					match(T_OR);
					setState(1127);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1130);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1133);
			match(T_PACKAGE);
			setState(1134);
			ident();
			setState(1135);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1136);
			package_spec();
			setState(1137);
			match(T_END);
			setState(1141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1138);
				ident();
				setState(1139);
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

	public static class Package_specContext extends ParserRuleContext {
		public List<Package_spec_itemContext> package_spec_item() {
			return getRuleContexts(Package_spec_itemContext.class);
		}
		public Package_spec_itemContext package_spec_item(int i) {
			return getRuleContext(Package_spec_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(PLHQLStatementsParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(PLHQLStatementsParser.T_SEMICOLON, i);
		}
		public Package_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterPackage_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitPackage_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitPackage_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_specContext package_spec() throws RecognitionException {
		Package_specContext _localctx = new Package_specContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_package_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			package_spec_item();
			setState(1144);
			match(T_SEMICOLON);
			setState(1150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_FUNCTION || _la==T_PROC || _la==T_PROCEDURE || _la==L_ID) {
				{
				{
				setState(1145);
				package_spec_item();
				setState(1146);
				match(T_SEMICOLON);
				}
				}
				setState(1152);
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

	public static class Package_spec_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public TerminalNode T_FUNCTION() { return getToken(PLHQLStatementsParser.T_FUNCTION, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Create_function_returnContext create_function_return() {
			return getRuleContext(Create_function_returnContext.class,0);
		}
		public Create_routine_paramsContext create_routine_params() {
			return getRuleContext(Create_routine_paramsContext.class,0);
		}
		public TerminalNode T_PROCEDURE() { return getToken(PLHQLStatementsParser.T_PROCEDURE, 0); }
		public TerminalNode T_PROC() { return getToken(PLHQLStatementsParser.T_PROC, 0); }
		public Package_spec_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_spec_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterPackage_spec_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitPackage_spec_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitPackage_spec_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_spec_itemContext package_spec_item() throws RecognitionException {
		Package_spec_itemContext _localctx = new Package_spec_itemContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_package_spec_item);
		int _la;
		try {
			setState(1166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1153);
				declare_stmt_item();
				}
				break;
			case T_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154);
				match(T_FUNCTION);
				setState(1155);
				ident();
				setState(1157);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1156);
					create_routine_params();
					}
					break;
				}
				setState(1159);
				create_function_return();
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1161);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1162);
				ident();
				setState(1164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1163);
					create_routine_params();
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

	public static class Create_package_body_stmtContext extends ParserRuleContext {
		public TerminalNode T_PACKAGE() { return getToken(PLHQLStatementsParser.T_PACKAGE, 0); }
		public TerminalNode T_BODY() { return getToken(PLHQLStatementsParser.T_BODY, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public Package_bodyContext package_body() {
			return getRuleContext(Package_bodyContext.class,0);
		}
		public TerminalNode T_END() { return getToken(PLHQLStatementsParser.T_END, 0); }
		public TerminalNode T_AS() { return getToken(PLHQLStatementsParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(PLHQLStatementsParser.T_IS, 0); }
		public TerminalNode T_ALTER() { return getToken(PLHQLStatementsParser.T_ALTER, 0); }
		public TerminalNode T_CREATE() { return getToken(PLHQLStatementsParser.T_CREATE, 0); }
		public TerminalNode T_REPLACE() { return getToken(PLHQLStatementsParser.T_REPLACE, 0); }
		public TerminalNode T_SEMICOLON() { return getToken(PLHQLStatementsParser.T_SEMICOLON, 0); }
		public TerminalNode T_OR() { return getToken(PLHQLStatementsParser.T_OR, 0); }
		public Create_package_body_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_package_body_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_package_body_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_package_body_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_package_body_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_package_body_stmtContext create_package_body_stmt() throws RecognitionException {
		Create_package_body_stmtContext _localctx = new Create_package_body_stmtContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_create_package_body_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1168);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1169);
				match(T_CREATE);
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1170);
					match(T_OR);
					setState(1171);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1174);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1177);
			match(T_PACKAGE);
			setState(1178);
			match(T_BODY);
			setState(1179);
			ident();
			setState(1180);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1181);
			package_body();
			setState(1182);
			match(T_END);
			setState(1186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1183);
				ident();
				setState(1184);
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

	public static class Package_bodyContext extends ParserRuleContext {
		public List<Package_body_itemContext> package_body_item() {
			return getRuleContexts(Package_body_itemContext.class);
		}
		public Package_body_itemContext package_body_item(int i) {
			return getRuleContext(Package_body_itemContext.class,i);
		}
		public List<TerminalNode> T_SEMICOLON() { return getTokens(PLHQLStatementsParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(PLHQLStatementsParser.T_SEMICOLON, i);
		}
		public Package_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterPackage_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitPackage_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitPackage_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_bodyContext package_body() throws RecognitionException {
		Package_bodyContext _localctx = new Package_bodyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_package_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			package_body_item();
			setState(1189);
			match(T_SEMICOLON);
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ALTER || _la==T_CREATE || _la==T_FUNCTION || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (T_PROC - 218)) | (1L << (T_PROCEDURE - 218)) | (1L << (T_REPLACE - 218)))) != 0) || _la==L_ID) {
				{
				{
				setState(1190);
				package_body_item();
				setState(1191);
				match(T_SEMICOLON);
				}
				}
				setState(1197);
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

	public static class Package_body_itemContext extends ParserRuleContext {
		public Declare_stmt_itemContext declare_stmt_item() {
			return getRuleContext(Declare_stmt_itemContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_procedure_stmtContext create_procedure_stmt() {
			return getRuleContext(Create_procedure_stmtContext.class,0);
		}
		public Package_body_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_package_body_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterPackage_body_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitPackage_body_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitPackage_body_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Package_body_itemContext package_body_item() throws RecognitionException {
		Package_body_itemContext _localctx = new Package_body_itemContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_package_body_item);
		try {
			setState(1201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1198);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1200);
				create_procedure_stmt();
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

	public static class Create_procedure_stmtContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
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
		public TerminalNode T_SEMICOLON() { return getToken(PLHQLStatementsParser.T_SEMICOLON, 0); }
		public TerminalNode T_AS() { return getToken(PLHQLStatementsParser.T_AS, 0); }
		public TerminalNode T_IS() { return getToken(PLHQLStatementsParser.T_IS, 0); }
		public TerminalNode T_OR() { return getToken(PLHQLStatementsParser.T_OR, 0); }
		public Create_procedure_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_procedure_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterCreate_procedure_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitCreate_procedure_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_procedure_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_procedure_stmtContext create_procedure_stmt() throws RecognitionException {
		Create_procedure_stmtContext _localctx = new Create_procedure_stmtContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CREATE:
				{
				setState(1203);
				match(T_CREATE);
				setState(1206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1204);
					match(T_OR);
					setState(1205);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1208);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
			}
			setState(1211);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1212);
			ident();
			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1213);
				create_routine_params();
				}
				break;
			}
			setState(1217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS || _la==T_IS) {
				{
				setState(1216);
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

			setState(1220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1219);
				declare_block_inplace();
				}
				break;
			}
			setState(1222);
			proc_block();
			setState(1226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1223);
				ident();
				setState(1224);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_create_procedure_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_create_procedure_stmtContext error_create_procedure_stmt() throws RecognitionException {
		Error_create_procedure_stmtContext _localctx = new Error_create_procedure_stmtContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_error_create_procedure_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CREATE:
				{
				setState(1228);
				match(T_CREATE);
				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1229);
					match(T_OR);
					setState(1230);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1233);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
			}
			setState(1236);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1237);
				create_routine_params();
				}
				break;
			}
			setState(1241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS || _la==T_IS) {
				{
				setState(1240);
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

			setState(1244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1243);
				declare_block_inplace();
				}
				break;
			}
			setState(1246);
			proc_block();
			setState(1250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1247);
				ident();
				setState(1248);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_routine_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_paramsContext create_routine_params() throws RecognitionException {
		Create_routine_paramsContext _localctx = new Create_routine_paramsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_create_routine_params);
		int _la;
		try {
			setState(1274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1252);
				match(T_OPEN_P);
				setState(1253);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1254);
				match(T_OPEN_P);
				setState(1255);
				create_routine_param_item();
				setState(1260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1256);
					match(T_COMMA);
					setState(1257);
					create_routine_param_item();
					}
					}
					setState(1262);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1263);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1265);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
				setState(1266);
				create_routine_param_item();
				setState(1271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1267);
					match(T_COMMA);
					setState(1268);
					create_routine_param_item();
					}
					}
					setState(1273);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_routine_param_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_routine_param_itemContext create_routine_param_item() throws RecognitionException {
		Create_routine_param_itemContext _localctx = new Create_routine_param_itemContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_create_routine_param_item);
		try {
			int _alt;
			setState(1318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1276);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1277);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1278);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1279);
					match(T_IN);
					setState(1280);
					match(T_OUT);
					}
					break;
				}
				setState(1283);
				ident();
				setState(1284);
				dtype();
				setState(1286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1285);
					dtype_len();
					}
					break;
				}
				setState(1291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1288);
						dtype_attr();
						}
						} 
					}
					setState(1293);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				}
				setState(1295);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1294);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1297);
				ident();
				setState(1303);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1298);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1299);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1300);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1301);
					match(T_IN);
					setState(1302);
					match(T_OUT);
					}
					break;
				}
				setState(1305);
				dtype();
				setState(1307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1306);
					dtype_len();
					}
					break;
				}
				setState(1312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1309);
						dtype_attr();
						}
						} 
					}
					setState(1314);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				}
				setState(1316);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1315);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitExec_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exec_stmtContext exec_stmt() throws RecognitionException {
		Exec_stmtContext _localctx = new Exec_stmtContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_exec_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1320);
			_la = _input.LA(1);
			if ( !(_la==T_EXEC || _la==T_EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IMMEDIATE) {
				{
				setState(1321);
				match(T_IMMEDIATE);
				}
			}

			setState(1324);
			expr(0);
			setState(1330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1325);
				match(T_OPEN_P);
				setState(1326);
				expr_func_params();
				setState(1327);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1329);
				expr_func_params();
				}
				break;
			}
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1332);
				match(T_INTO);
				setState(1333);
				match(L_ID);
				setState(1338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1334);
						match(T_COMMA);
						setState(1335);
						match(L_ID);
						}
						} 
					}
					setState(1340);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_if_stmt);
		try {
			setState(1346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1343);
				if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1344);
				if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1345);
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

	public static class If_function_stmtContext extends ParserRuleContext {
		public TerminalNode T_IF() { return getToken(PLHQLStatementsParser.T_IF, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public TerminalNode T_OPEN_B() { return getToken(PLHQLStatementsParser.T_OPEN_B, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode T_CLOSE_B() { return getToken(PLHQLStatementsParser.T_CLOSE_B, 0); }
		public If_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterIf_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitIf_function_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitIf_function_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_function_stmtContext if_function_stmt() throws RecognitionException {
		If_function_stmtContext _localctx = new If_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_if_function_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			match(T_IF);
			setState(1349);
			match(T_OPEN_P);
			setState(1350);
			bool_expr(0);
			setState(1351);
			match(T_CLOSE_P);
			setState(1352);
			match(T_OPEN_B);
			setState(1353);
			block();
			setState(1354);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_if_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_if_stmtContext error_if_stmt() throws RecognitionException {
		Error_if_stmtContext _localctx = new Error_if_stmtContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_error_if_stmt);
		try {
			setState(1359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1356);
				error_if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1357);
				error_if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1358);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitIf_plsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_plsql_stmtContext if_plsql_stmt() throws RecognitionException {
		If_plsql_stmtContext _localctx = new If_plsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			match(T_IF);
			setState(1362);
			bool_expr(0);
			setState(1363);
			match(T_THEN);
			setState(1364);
			block();
			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1365);
				elseif_block();
				}
				}
				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1371);
				else_block();
				}
			}

			setState(1374);
			match(T_END);
			setState(1375);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_if_plsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_if_plsql_stmtContext error_if_plsql_stmt() throws RecognitionException {
		Error_if_plsql_stmtContext _localctx = new Error_if_plsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_error_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			match(T_IF);
			setState(1378);
			match(T_THEN);
			setState(1379);
			block();
			setState(1383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1380);
				elseif_block();
				}
				}
				setState(1385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1386);
				else_block();
				}
			}

			setState(1389);
			match(T_END);
			setState(1390);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitIf_tsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_tsql_stmtContext if_tsql_stmt() throws RecognitionException {
		If_tsql_stmtContext _localctx = new If_tsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			match(T_IF);
			setState(1393);
			bool_expr(0);
			setState(1394);
			single_block_stmt();
			setState(1397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1395);
				match(T_ELSE);
				setState(1396);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_if_tsql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_if_tsql_stmtContext error_if_tsql_stmt() throws RecognitionException {
		Error_if_tsql_stmtContext _localctx = new Error_if_tsql_stmtContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_error_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1399);
			match(T_IF);
			setState(1400);
			single_block_stmt();
			setState(1403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1401);
				match(T_ELSE);
				setState(1402);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitIf_bteq_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_bteq_stmtContext if_bteq_stmt() throws RecognitionException {
		If_bteq_stmtContext _localctx = new If_bteq_stmtContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			match(T__3);
			setState(1406);
			match(T_IF);
			setState(1407);
			bool_expr(0);
			setState(1408);
			match(T_THEN);
			setState(1409);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_if_bteq_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_if_bteq_stmtContext error_if_bteq_stmt() throws RecognitionException {
		Error_if_bteq_stmtContext _localctx = new Error_if_bteq_stmtContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_error_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1411);
			match(T__3);
			setState(1412);
			match(T_IF);
			setState(1413);
			match(T_THEN);
			setState(1414);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitElseif_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elseif_blockContext elseif_block() throws RecognitionException {
		Elseif_blockContext _localctx = new Elseif_blockContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1417);
			bool_expr(0);
			setState(1418);
			match(T_THEN);
			setState(1419);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			match(T_ELSE);
			setState(1422);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1424);
			match(T_CREATE);
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1425);
				match(T_UNIQUE);
				}
			}

			setState(1428);
			match(T_INDEX);
			setState(1429);
			ident();
			setState(1430);
			match(T_ON);
			setState(1431);
			table_name();
			setState(1432);
			match(T_OPEN_P);
			setState(1433);
			create_index_col();
			setState(1438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1434);
				match(T_COMMA);
				setState(1435);
				create_index_col();
				}
				}
				setState(1440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1441);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_create_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_create_index_stmtContext error_create_index_stmt() throws RecognitionException {
		Error_create_index_stmtContext _localctx = new Error_create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_error_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			match(T_CREATE);
			setState(1445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1444);
				match(T_UNIQUE);
				}
			}

			setState(1447);
			match(T_OPEN_P);
			setState(1448);
			create_index_col();
			setState(1453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1449);
				match(T_COMMA);
				setState(1450);
				create_index_col();
				}
				}
				setState(1455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1456);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCreate_index_col(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_colContext create_index_col() throws RecognitionException {
		Create_index_colContext _localctx = new Create_index_colContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			ident();
			setState(1460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(1459);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitReturn_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stmtContext return_stmt() throws RecognitionException {
		Return_stmtContext _localctx = new Return_stmtContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1462);
			match(T_RETURN);
			setState(1464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1463);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitFor_range_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_range_stmtContext for_range_stmt() throws RecognitionException {
		For_range_stmtContext _localctx = new For_range_stmtContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1466);
			match(T_FOR);
			setState(1467);
			match(L_ID);
			setState(1468);
			match(T_IN);
			setState(1470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_REVERSE) {
				{
				setState(1469);
				match(T_REVERSE);
				}
			}

			setState(1472);
			expr(0);
			setState(1473);
			match(T_DOT2);
			setState(1474);
			expr(0);
			setState(1477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BY || _la==T_STEP) {
				{
				setState(1475);
				_la = _input.LA(1);
				if ( !(_la==T_BY || _la==T_STEP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1476);
				expr(0);
				}
			}

			setState(1479);
			match(T_LOOP);
			setState(1480);
			block();
			setState(1481);
			match(T_END);
			setState(1482);
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

	public static class For_function_stmtContext extends ParserRuleContext {
		public TerminalNode T_FOR() { return getToken(PLHQLStatementsParser.T_FOR, 0); }
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode T_EQUAL() { return getToken(PLHQLStatementsParser.T_EQUAL, 0); }
		public List<TerminalNode> T_SEMICOLON() { return getTokens(PLHQLStatementsParser.T_SEMICOLON); }
		public TerminalNode T_SEMICOLON(int i) {
			return getToken(PLHQLStatementsParser.T_SEMICOLON, i);
		}
		public List<TerminalNode> T_ADD() { return getTokens(PLHQLStatementsParser.T_ADD); }
		public TerminalNode T_ADD(int i) {
			return getToken(PLHQLStatementsParser.T_ADD, i);
		}
		public TerminalNode T_CLOSE_P() { return getToken(PLHQLStatementsParser.T_CLOSE_P, 0); }
		public TerminalNode T_OPEN_B() { return getToken(PLHQLStatementsParser.T_OPEN_B, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode T_CLOSE_B() { return getToken(PLHQLStatementsParser.T_CLOSE_B, 0); }
		public TerminalNode T_LESSEQUAL() { return getToken(PLHQLStatementsParser.T_LESSEQUAL, 0); }
		public TerminalNode T_LESS() { return getToken(PLHQLStatementsParser.T_LESS, 0); }
		public TerminalNode T_GREATEREQUAL() { return getToken(PLHQLStatementsParser.T_GREATEREQUAL, 0); }
		public TerminalNode T_GREATER() { return getToken(PLHQLStatementsParser.T_GREATER, 0); }
		public For_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).enterFor_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLHQLStatementsListener ) ((PLHQLStatementsListener)listener).exitFor_function_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitFor_function_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_function_stmtContext for_function_stmt() throws RecognitionException {
		For_function_stmtContext _localctx = new For_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_for_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			match(T_FOR);
			setState(1485);
			match(T_OPEN_P);
			setState(1486);
			expr(0);
			setState(1487);
			match(T_EQUAL);
			setState(1488);
			expr(0);
			setState(1489);
			match(T_SEMICOLON);
			setState(1490);
			expr(0);
			setState(1492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_LESSEQUAL) {
				{
				setState(1491);
				match(T_LESSEQUAL);
				}
			}

			setState(1495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_LESS) {
				{
				setState(1494);
				match(T_LESS);
				}
			}

			setState(1498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GREATEREQUAL) {
				{
				setState(1497);
				match(T_GREATEREQUAL);
				}
			}

			setState(1501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_GREATER) {
				{
				setState(1500);
				match(T_GREATER);
				}
			}

			setState(1503);
			expr(0);
			setState(1504);
			match(T_SEMICOLON);
			setState(1505);
			expr(0);
			setState(1506);
			match(T_ADD);
			setState(1507);
			match(T_ADD);
			setState(1508);
			match(T_CLOSE_P);
			setState(1509);
			match(T_OPEN_B);
			setState(1510);
			stmt();
			setState(1514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T_ALTER) | (1L << T_BREAK) | (1L << T_CALL) | (1L << T_CREATE))) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T_DECLARE - 73)) | (1L << (T_EXEC - 73)) | (1L << (T_EXECUTE - 73)) | (1L << (T_FOR - 73)) | (1L << (T_FUNCTION - 73)) | (1L << (T_IF - 73)))) != 0) || ((((_la - 194)) & ~0x3f) == 0 && ((1L << (_la - 194)) & ((1L << (T_NULL - 194)) | (1L << (T_PACKAGE - 194)) | (1L << (T_PROC - 194)) | (1L << (T_PROCEDURE - 194)) | (1L << (T_REPLACE - 194)) | (1L << (T_RETURN - 194)) | (1L << (T_SEL - 194)) | (1L << (T_SELECT - 194)) | (1L << (T_SET - 194)))) != 0) || ((((_la - 314)) & ~0x3f) == 0 && ((1L << (_la - 314)) & ((1L << (T_WITH - 314)) | (1L << (T_DIV - 314)) | (1L << (T_OPEN_P - 314)) | (1L << (T_SEMICOLON - 314)) | (1L << (L_ID - 314)))) != 0)) {
				{
				{
				setState(1511);
				stmt();
				}
				}
				setState(1516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1517);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_for_range_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_for_range_stmtContext error_for_range_stmt() throws RecognitionException {
		Error_for_range_stmtContext _localctx = new Error_for_range_stmtContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_error_for_range_stmt);
		int _la;
		try {
			setState(1569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1519);
				match(T_FOR);
				setState(1520);
				match(L_ID);
				setState(1521);
				match(T_IN);
				setState(1523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_REVERSE) {
					{
					setState(1522);
					match(T_REVERSE);
					}
				}

				setState(1525);
				expr(0);
				setState(1526);
				match(T_DOT2);
				setState(1527);
				expr(0);
				setState(1530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_BY || _la==T_STEP) {
					{
					setState(1528);
					_la = _input.LA(1);
					if ( !(_la==T_BY || _la==T_STEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1529);
					expr(0);
					}
				}

				setState(1532);
				block();
				setState(1533);
				match(T_END);
				setState(1534);
				match(T_LOOP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1536);
				match(T_FOR);
				setState(1537);
				match(L_ID);
				setState(1538);
				match(T_IN);
				setState(1540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_REVERSE) {
					{
					setState(1539);
					match(T_REVERSE);
					}
				}

				setState(1542);
				expr(0);
				setState(1543);
				match(T_DOT2);
				setState(1544);
				expr(0);
				setState(1547);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_BY || _la==T_STEP) {
					{
					setState(1545);
					_la = _input.LA(1);
					if ( !(_la==T_BY || _la==T_STEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1546);
					expr(0);
					}
				}

				setState(1549);
				match(T_LOOP);
				setState(1550);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1552);
				match(T_FOR);
				setState(1553);
				match(L_ID);
				setState(1554);
				match(T_IN);
				setState(1556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_REVERSE) {
					{
					setState(1555);
					match(T_REVERSE);
					}
				}

				setState(1558);
				expr(0);
				setState(1559);
				match(T_DOT2);
				setState(1560);
				expr(0);
				setState(1563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_BY || _la==T_STEP) {
					{
					setState(1561);
					_la = _input.LA(1);
					if ( !(_la==T_BY || _la==T_STEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1562);
					expr(0);
					}
				}

				setState(1565);
				match(T_LOOP);
				setState(1566);
				match(T_END);
				setState(1567);
				match(T_LOOP);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(1571);
				cte_select_stmt();
				}
			}

			setState(1574);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCte_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmtContext cte_select_stmt() throws RecognitionException {
		Cte_select_stmtContext _localctx = new Cte_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_cte_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1576);
			match(T_WITH);
			setState(1577);
			cte_select_stmt_item();
			setState(1582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1578);
				match(T_COMMA);
				setState(1579);
				cte_select_stmt_item();
				}
				}
				setState(1584);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCte_select_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_stmt_itemContext cte_select_stmt_item() throws RecognitionException {
		Cte_select_stmt_itemContext _localctx = new Cte_select_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_cte_select_stmt_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			ident();
			setState(1587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1586);
				cte_select_cols();
				}
			}

			setState(1589);
			match(T_AS);
			setState(1590);
			match(T_OPEN_P);
			setState(1591);
			fullselect_stmt();
			setState(1592);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitCte_select_cols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_select_colsContext cte_select_cols() throws RecognitionException {
		Cte_select_colsContext _localctx = new Cte_select_colsContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_cte_select_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1594);
			match(T_OPEN_P);
			setState(1595);
			ident();
			setState(1600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1596);
				match(T_COMMA);
				setState(1597);
				ident();
				}
				}
				setState(1602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1603);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitFullselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmtContext fullselect_stmt() throws RecognitionException {
		Fullselect_stmtContext _localctx = new Fullselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1605);
			fullselect_stmt_item();
			setState(1611);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1606);
					fullselect_set_clause();
					setState(1607);
					fullselect_stmt_item();
					}
					} 
				}
				setState(1613);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,192,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitFullselect_stmt_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_stmt_itemContext fullselect_stmt_item() throws RecognitionException {
		Fullselect_stmt_itemContext _localctx = new Fullselect_stmt_itemContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_fullselect_stmt_item);
		try {
			setState(1619);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1614);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1615);
				match(T_OPEN_P);
				setState(1616);
				fullselect_stmt();
				setState(1617);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitFullselect_set_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fullselect_set_clauseContext fullselect_set_clause() throws RecognitionException {
		Fullselect_set_clauseContext _localctx = new Fullselect_set_clauseContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(1633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1621);
				match(T_UNION);
				setState(1623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1622);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1625);
				match(T_EXCEPT);
				setState(1627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1626);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1629);
				match(T_INTERSECT);
				setState(1631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1630);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitSubselect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subselect_stmtContext subselect_stmt() throws RecognitionException {
		Subselect_stmtContext _localctx = new Subselect_stmtContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1636);
			select_list();
			setState(1638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_INTO) {
				{
				setState(1637);
				into_clause();
				}
			}

			setState(1640);
			from_clause();
			setState(1642);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1641);
				where_clause();
				}
				break;
			}
			setState(1645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				{
				setState(1644);
				group_by_clause();
				}
				break;
			}
			setState(1649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1647);
				having_clause();
				}
				break;
			case 2:
				{
				setState(1648);
				qualify_clause();
				}
				break;
			}
			setState(1652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				{
				setState(1651);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_subselect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_subselectContext error_subselect() throws RecognitionException {
		Error_subselectContext _localctx = new Error_subselectContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_error_subselect);
		int _la;
		try {
			setState(1673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1654);
				_la = _input.LA(1);
				if ( !(_la==T_SEL || _la==T_SELECT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1655);
				select_list();
				setState(1657);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1656);
					into_clause();
					}
					break;
				}
				setState(1660);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1659);
					where_clause();
					}
					break;
				}
				setState(1663);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1662);
					group_by_clause();
					}
					break;
				}
				setState(1667);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1665);
					having_clause();
					}
					break;
				case 2:
					{
					setState(1666);
					qualify_clause();
					}
					break;
				}
				setState(1670);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1669);
					order_by_clause();
					}
					break;
				}
				}
				break;
			case T_FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1672);
				error_from_clause();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitSelect_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_listContext select_list() throws RecognitionException {
		Select_listContext _localctx = new Select_listContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_select_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ALL || _la==T_DISTINCT) {
				{
				setState(1675);
				select_list_set();
				}
			}

			setState(1679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TOP) {
				{
				setState(1678);
				select_list_limit();
				}
			}

			setState(1681);
			select_list_item();
			setState(1686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1682);
					match(T_COMMA);
					setState(1683);
					select_list_item();
					}
					} 
				}
				setState(1688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitSelect_list_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_setContext select_list_set() throws RecognitionException {
		Select_list_setContext _localctx = new Select_list_setContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitSelect_list_limit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_limitContext select_list_limit() throws RecognitionException {
		Select_list_limitContext _localctx = new Select_list_limitContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_select_list_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			match(T_TOP);
			setState(1692);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitSelect_list_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_itemContext select_list_item() throws RecognitionException {
		Select_list_itemContext _localctx = new Select_list_itemContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
			case 1:
				{
				setState(1697);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1694);
					ident();
					setState(1695);
					match(T_EQUAL);
					}
					break;
				}
				setState(1699);
				expr(0);
				setState(1701);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1700);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1703);
				select_list_asterisk();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitSelect_list_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_aliasContext select_list_alias() throws RecognitionException {
		Select_list_aliasContext _localctx = new Select_list_aliasContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_select_list_alias);
		int _la;
		try {
			setState(1715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1706);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(1708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1707);
					match(T_AS);
					}
				}

				setState(1710);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1711);
				match(T_OPEN_P);
				setState(1712);
				match(T_TITLE);
				setState(1713);
				match(L_S_STRING);
				setState(1714);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitSelect_list_asterisk(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_list_asteriskContext select_list_asterisk() throws RecognitionException {
		Select_list_asteriskContext _localctx = new Select_list_asteriskContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(1717);
				match(L_ID);
				setState(1718);
				match(T__3);
				}
			}

			setState(1721);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitInto_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Into_clauseContext into_clause() throws RecognitionException {
		Into_clauseContext _localctx = new Into_clauseContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			match(T_INTO);
			setState(1724);
			ident();
			setState(1729);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1725);
					match(T_COMMA);
					setState(1726);
					ident();
					}
					} 
				}
				setState(1731);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,218,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitFrom_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
			match(T_FROM);
			setState(1733);
			from_table_clause();
			setState(1737);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1734);
					from_join_clause();
					}
					} 
				}
				setState(1739);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,219,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_from_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_from_clauseContext error_from_clause() throws RecognitionException {
		Error_from_clauseContext _localctx = new Error_from_clauseContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_error_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			match(T_FROM);
			setState(1744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,220,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1741);
					from_join_clause();
					}
					} 
				}
				setState(1746);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitFrom_table_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_clauseContext from_table_clause() throws RecognitionException {
		From_table_clauseContext _localctx = new From_table_clauseContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_from_table_clause);
		try {
			setState(1750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1747);
				from_table_name_clause();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1748);
				from_subselect_clause();
				}
				break;
			case T_TABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1749);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitFrom_table_name_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_name_clauseContext from_table_name_clause() throws RecognitionException {
		From_table_name_clauseContext _localctx = new From_table_name_clauseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			table_name();
			setState(1754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
			case 1:
				{
				setState(1753);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitFrom_subselect_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_subselect_clauseContext from_subselect_clause() throws RecognitionException {
		From_subselect_clauseContext _localctx = new From_subselect_clauseContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
			match(T_OPEN_P);
			setState(1757);
			select_stmt();
			setState(1758);
			match(T_CLOSE_P);
			setState(1760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,223,_ctx) ) {
			case 1:
				{
				setState(1759);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitFrom_join_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_clauseContext from_join_clause() throws RecognitionException {
		From_join_clauseContext _localctx = new From_join_clauseContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_from_join_clause);
		try {
			setState(1769);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1762);
				match(T_COMMA);
				setState(1763);
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
				setState(1764);
				from_join_type_clause();
				setState(1765);
				from_table_clause();
				setState(1766);
				match(T_ON);
				setState(1767);
				bool_expr(0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitFrom_join_type_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_join_type_clauseContext from_join_type_clause() throws RecognitionException {
		From_join_type_clauseContext _localctx = new From_join_type_clauseContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_from_join_type_clause);
		int _la;
		try {
			setState(1780);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1771);
					match(T_INNER);
					}
				}

				setState(1774);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1775);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(1776);
					match(T_OUTER);
					}
				}

				setState(1779);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitFrom_table_values_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_clauseContext from_table_values_clause() throws RecognitionException {
		From_table_values_clauseContext _localctx = new From_table_values_clauseContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			match(T_TABLE);
			setState(1783);
			match(T_OPEN_P);
			setState(1784);
			match(T_VALUES);
			setState(1785);
			from_table_values_row();
			setState(1790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1786);
				match(T_COMMA);
				setState(1787);
				from_table_values_row();
				}
				}
				setState(1792);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1793);
			match(T_CLOSE_P);
			setState(1795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1794);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitFrom_table_values_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_table_values_rowContext from_table_values_row() throws RecognitionException {
		From_table_values_rowContext _localctx = new From_table_values_rowContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_from_table_values_row);
		int _la;
		try {
			setState(1809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1797);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1798);
				match(T_OPEN_P);
				setState(1799);
				expr(0);
				setState(1804);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1800);
					match(T_COMMA);
					setState(1801);
					expr(0);
					}
					}
					setState(1806);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1807);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitFrom_alias_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final From_alias_clauseContext from_alias_clause() throws RecognitionException {
		From_alias_clauseContext _localctx = new From_alias_clauseContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1811);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(1813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS) {
				{
				setState(1812);
				match(T_AS);
				}
			}

			setState(1815);
			ident();
			setState(1826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1816);
				match(T_OPEN_P);
				setState(1817);
				match(L_ID);
				setState(1822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1818);
					match(T_COMMA);
					setState(1819);
					match(L_ID);
					}
					}
					setState(1824);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1825);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1828);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			match(T_WHERE);
			setState(1831);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_missing_bool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_missing_bool_exprContext error_missing_bool_expr() throws RecognitionException {
		Error_missing_bool_exprContext _localctx = new Error_missing_bool_exprContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_error_missing_bool_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1833);
			match(T_WHERE);
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitGroup_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1835);
			match(T_GROUP);
			setState(1836);
			match(T_BY);
			setState(1837);
			expr(0);
			setState(1842);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1838);
					match(T_COMMA);
					setState(1839);
					expr(0);
					}
					} 
				}
				setState(1844);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,235,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitHaving_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			match(T_HAVING);
			setState(1846);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitQualify_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualify_clauseContext qualify_clause() throws RecognitionException {
		Qualify_clauseContext _localctx = new Qualify_clauseContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1848);
			match(T_QUALIFY);
			setState(1849);
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
		public TerminalNode T_ORDER() { return getToken(PLHQLStatementsParser.T_ORDER, 0); }
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
		public List<TerminalNode> T_ASC() { return getTokens(PLHQLStatementsParser.T_ASC); }
		public TerminalNode T_ASC(int i) {
			return getToken(PLHQLStatementsParser.T_ASC, i);
		}
		public List<TerminalNode> T_DESC() { return getTokens(PLHQLStatementsParser.T_DESC); }
		public TerminalNode T_DESC(int i) {
			return getToken(PLHQLStatementsParser.T_DESC, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitOrder_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			match(T_ORDER);
			setState(1852);
			match(T_BY);
			setState(1853);
			expr(0);
			setState(1855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				{
				setState(1854);
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
				break;
			}
			setState(1864);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,238,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1857);
					match(T_COMMA);
					setState(1858);
					expr(0);
					setState(1860);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
					case 1:
						{
						setState(1859);
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
						break;
					}
					}
					} 
				}
				setState(1866);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 244;
		enterRecursionRule(_localctx, 244, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				{
				setState(1869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1868);
					match(T_NOT);
					}
				}

				setState(1871);
				match(T_OPEN_P);
				setState(1872);
				bool_expr(0);
				setState(1873);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1875);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1884);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(1878);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1879);
					bool_expr_logical_operator();
					setState(1880);
					bool_expr(3);
					}
					} 
				}
				setState(1886);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitBool_expr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_atomContext bool_expr_atom() throws RecognitionException {
		Bool_expr_atomContext _localctx = new Bool_expr_atomContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_bool_expr_atom);
		try {
			setState(1889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1887);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1888);
				bool_expr_binary();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitBool_expr_unary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_unaryContext bool_expr_unary() throws RecognitionException {
		Bool_expr_unaryContext _localctx = new Bool_expr_unaryContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_bool_expr_unary);
		int _la;
		try {
			setState(1914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1891);
				expr(0);
				setState(1892);
				match(T_IS);
				setState(1894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1893);
					match(T_NOT);
					}
				}

				setState(1896);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1898);
				expr(0);
				setState(1899);
				match(T_BETWEEN);
				setState(1900);
				expr(0);
				setState(1901);
				match(T_AND);
				setState(1902);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1904);
					match(T_NOT);
					}
				}

				setState(1907);
				match(T_EXISTS);
				setState(1908);
				match(T_OPEN_P);
				setState(1909);
				select_stmt();
				setState(1910);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1912);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1913);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitBool_expr_single_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_single_inContext bool_expr_single_in() throws RecognitionException {
		Bool_expr_single_inContext _localctx = new Bool_expr_single_inContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1916);
			expr(0);
			setState(1918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(1917);
				match(T_NOT);
				}
			}

			setState(1920);
			match(T_IN);
			setState(1921);
			match(T_OPEN_P);
			setState(1931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				{
				setState(1922);
				expr(0);
				setState(1927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1923);
					match(T_COMMA);
					setState(1924);
					expr(0);
					}
					}
					setState(1929);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(1930);
				select_stmt();
				}
				break;
			}
			setState(1933);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitBool_expr_multi_in(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_multi_inContext bool_expr_multi_in() throws RecognitionException {
		Bool_expr_multi_inContext _localctx = new Bool_expr_multi_inContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1935);
			match(T_OPEN_P);
			setState(1936);
			expr(0);
			setState(1941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1937);
				match(T_COMMA);
				setState(1938);
				expr(0);
				}
				}
				setState(1943);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1944);
			match(T_CLOSE_P);
			setState(1946);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(1945);
				match(T_NOT);
				}
			}

			setState(1948);
			match(T_IN);
			setState(1949);
			match(T_OPEN_P);
			setState(1950);
			select_stmt();
			setState(1951);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitBool_expr_binary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binaryContext bool_expr_binary() throws RecognitionException {
		Bool_expr_binaryContext _localctx = new Bool_expr_binaryContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1953);
			expr(0);
			setState(1954);
			bool_expr_binary_operator();
			setState(1955);
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
		public TerminalNode T_AND() { return getToken(PLHQLStatementsParser.T_AND, 0); }
		public TerminalNode T_OR() { return getToken(PLHQLStatementsParser.T_OR, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitBool_expr_logical_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_logical_operatorContext bool_expr_logical_operator() throws RecognitionException {
		Bool_expr_logical_operatorContext _localctx = new Bool_expr_logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			_la = _input.LA(1);
			if ( !(_la==T_AND || _la==T_OR) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitBool_expr_binary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_expr_binary_operatorContext bool_expr_binary_operator() throws RecognitionException {
		Bool_expr_binary_operatorContext _localctx = new Bool_expr_binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(1970);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL2:
				enterOuterAlt(_localctx, 1);
				{
				setState(1959);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1960);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 3);
				{
				setState(1961);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 4);
				{
				setState(1962);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(1963);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 6);
				{
				setState(1964);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 7);
				{
				setState(1965);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1967);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1966);
					match(T_NOT);
					}
				}

				setState(1969);
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
		public TerminalNode T_OPEN_P() { return getToken(PLHQLStatementsParser.T_OPEN_P, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
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
			setState(1988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				{
				setState(1973);
				match(T_OPEN_P);
				setState(1974);
				select_stmt();
				setState(1975);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1977);
				match(T_OPEN_P);
				setState(1978);
				expr(0);
				setState(1979);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(1981);
				expr_interval();
				}
				break;
			case 4:
				{
				setState(1982);
				expr_concat();
				}
				break;
			case 5:
				{
				setState(1983);
				expr_case();
				}
				break;
			case 6:
				{
				setState(1984);
				expr_agg_window_func();
				}
				break;
			case 7:
				{
				setState(1985);
				expr_spec_func();
				}
				break;
			case 8:
				{
				setState(1986);
				expr_func();
				}
				break;
			case 9:
				{
				setState(1987);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2006);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2004);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1990);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1991);
						match(T_MUL);
						setState(1992);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1993);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1994);
						match(T_DIV);
						setState(1995);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1996);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1997);
						match(T_ADD);
						setState(1998);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1999);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2000);
						match(T_SUB);
						setState(2001);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2002);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2003);
						interval_item();
						}
						break;
					}
					} 
				}
				setState(2008);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitExpr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_atomContext expr_atom() throws RecognitionException {
		Expr_atomContext _localctx = new Expr_atomContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_expr_atom);
		try {
			setState(2017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2009);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2010);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2011);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2012);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2013);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2014);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2015);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2016);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitExpr_interval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_intervalContext expr_interval() throws RecognitionException {
		Expr_intervalContext _localctx = new Expr_intervalContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2019);
			match(T_INTERVAL);
			setState(2020);
			expr(0);
			setState(2021);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitInterval_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interval_itemContext interval_item() throws RecognitionException {
		Interval_itemContext _localctx = new Interval_itemContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023);
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
		public List<TerminalNode> T_PIPE() { return getTokens(PLHQLStatementsParser.T_PIPE); }
		public TerminalNode T_PIPE(int i) {
			return getToken(PLHQLStatementsParser.T_PIPE, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitExpr_concat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concatContext expr_concat() throws RecognitionException {
		Expr_concatContext _localctx = new Expr_concatContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2025);
			expr_concat_item();
			setState(2026);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2027);
			expr_concat_item();
			setState(2032);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2028);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2029);
					expr_concat_item();
					}
					} 
				}
				setState(2034);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,257,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitExpr_concat_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_concat_itemContext expr_concat_item() throws RecognitionException {
		Expr_concat_itemContext _localctx = new Expr_concat_itemContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_expr_concat_item);
		try {
			setState(2044);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2035);
				match(T_OPEN_P);
				setState(2036);
				expr(0);
				setState(2037);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2039);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2040);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2041);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2042);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2043);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitExpr_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_caseContext expr_case() throws RecognitionException {
		Expr_caseContext _localctx = new Expr_caseContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_expr_case);
		try {
			setState(2048);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2046);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2047);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitExpr_case_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_simpleContext expr_case_simple() throws RecognitionException {
		Expr_case_simpleContext _localctx = new Expr_case_simpleContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2050);
			match(T_CASE);
			setState(2051);
			expr(0);
			setState(2057); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2052);
				match(T_WHEN);
				setState(2053);
				expr(0);
				setState(2054);
				match(T_THEN);
				setState(2055);
				expr(0);
				}
				}
				setState(2059); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2063);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2061);
				match(T_ELSE);
				setState(2062);
				expr(0);
				}
			}

			setState(2065);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitExpr_case_searched(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_case_searchedContext expr_case_searched() throws RecognitionException {
		Expr_case_searchedContext _localctx = new Expr_case_searchedContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067);
			match(T_CASE);
			setState(2073); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2068);
				match(T_WHEN);
				setState(2069);
				bool_expr(0);
				setState(2070);
				match(T_THEN);
				setState(2071);
				expr(0);
				}
				}
				setState(2075); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2077);
				match(T_ELSE);
				setState(2078);
				expr(0);
				}
			}

			setState(2081);
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
		public TerminalNode T_VAR() { return getToken(PLHQLStatementsParser.T_VAR, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitExpr_agg_window_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_agg_window_funcContext expr_agg_window_func() throws RecognitionException {
		Expr_agg_window_funcContext _localctx = new Expr_agg_window_funcContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(2235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2083);
				match(T_AVG);
				setState(2084);
				match(T_OPEN_P);
				setState(2086);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2085);
					expr_func_all_distinct();
					}
				}

				setState(2088);
				expr(0);
				setState(2089);
				match(T_CLOSE_P);
				setState(2091);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
				case 1:
					{
					setState(2090);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2093);
				match(T_COUNT);
				setState(2094);
				match(T_OPEN_P);
				setState(2100);
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
				case T_SUBSTRING:
				case T_SUM:
				case T_TIMESTAMP:
				case T_TRUE:
				case T_VAR:
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
					setState(2096);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ALL || _la==T_DISTINCT) {
						{
						setState(2095);
						expr_func_all_distinct();
						}
					}

					setState(2098);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2099);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2102);
				match(T_CLOSE_P);
				setState(2104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
				case 1:
					{
					setState(2103);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2106);
				match(T_COUNT_BIG);
				setState(2107);
				match(T_OPEN_P);
				setState(2113);
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
				case T_SUBSTRING:
				case T_SUM:
				case T_TIMESTAMP:
				case T_TRUE:
				case T_VAR:
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
					setState(2109);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ALL || _la==T_DISTINCT) {
						{
						setState(2108);
						expr_func_all_distinct();
						}
					}

					setState(2111);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2112);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2115);
				match(T_CLOSE_P);
				setState(2117);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
				case 1:
					{
					setState(2116);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2119);
				match(T_CUME_DIST);
				setState(2120);
				match(T_OPEN_P);
				setState(2121);
				match(T_CLOSE_P);
				setState(2122);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2123);
				match(T_DENSE_RANK);
				setState(2124);
				match(T_OPEN_P);
				setState(2125);
				match(T_CLOSE_P);
				setState(2126);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2127);
				match(T_FIRST_VALUE);
				setState(2128);
				match(T_OPEN_P);
				setState(2129);
				expr(0);
				setState(2130);
				match(T_CLOSE_P);
				setState(2131);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2133);
				match(T_LAG);
				setState(2134);
				match(T_OPEN_P);
				setState(2135);
				expr(0);
				setState(2142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2136);
					match(T_COMMA);
					setState(2137);
					expr(0);
					setState(2140);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2138);
						match(T_COMMA);
						setState(2139);
						expr(0);
						}
					}

					}
				}

				setState(2144);
				match(T_CLOSE_P);
				setState(2145);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2147);
				match(T_LAST_VALUE);
				setState(2148);
				match(T_OPEN_P);
				setState(2149);
				expr(0);
				setState(2150);
				match(T_CLOSE_P);
				setState(2151);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(2153);
				match(T_LEAD);
				setState(2154);
				match(T_OPEN_P);
				setState(2155);
				expr(0);
				setState(2162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2156);
					match(T_COMMA);
					setState(2157);
					expr(0);
					setState(2160);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2158);
						match(T_COMMA);
						setState(2159);
						expr(0);
						}
					}

					}
				}

				setState(2164);
				match(T_CLOSE_P);
				setState(2165);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(2167);
				match(T_MAX);
				setState(2168);
				match(T_OPEN_P);
				setState(2170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2169);
					expr_func_all_distinct();
					}
				}

				setState(2172);
				expr(0);
				setState(2173);
				match(T_CLOSE_P);
				setState(2175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
				case 1:
					{
					setState(2174);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(2177);
				match(T_MIN);
				setState(2178);
				match(T_OPEN_P);
				setState(2180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2179);
					expr_func_all_distinct();
					}
				}

				setState(2182);
				expr(0);
				setState(2183);
				match(T_CLOSE_P);
				setState(2185);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
				case 1:
					{
					setState(2184);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(2187);
				match(T_RANK);
				setState(2188);
				match(T_OPEN_P);
				setState(2189);
				match(T_CLOSE_P);
				setState(2190);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(2191);
				match(T_ROW_NUMBER);
				setState(2192);
				match(T_OPEN_P);
				setState(2193);
				match(T_CLOSE_P);
				setState(2194);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(2195);
				match(T_STDEV);
				setState(2196);
				match(T_OPEN_P);
				setState(2198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2197);
					expr_func_all_distinct();
					}
				}

				setState(2200);
				expr(0);
				setState(2201);
				match(T_CLOSE_P);
				setState(2203);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
				case 1:
					{
					setState(2202);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(2205);
				match(T_SUM);
				setState(2206);
				match(T_OPEN_P);
				setState(2208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2207);
					expr_func_all_distinct();
					}
				}

				setState(2210);
				expr(0);
				setState(2211);
				match(T_CLOSE_P);
				setState(2213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,283,_ctx) ) {
				case 1:
					{
					setState(2212);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(2215);
				match(T_VAR);
				setState(2216);
				match(T_OPEN_P);
				setState(2218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2217);
					expr_func_all_distinct();
					}
				}

				setState(2220);
				expr(0);
				setState(2221);
				match(T_CLOSE_P);
				setState(2223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
				case 1:
					{
					setState(2222);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(2225);
				match(T_VARIANCE);
				setState(2226);
				match(T_OPEN_P);
				setState(2228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2227);
					expr_func_all_distinct();
					}
				}

				setState(2230);
				expr(0);
				setState(2231);
				match(T_CLOSE_P);
				setState(2233);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
				case 1:
					{
					setState(2232);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitExpr_func_all_distinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_all_distinctContext expr_func_all_distinct() throws RecognitionException {
		Expr_func_all_distinctContext _localctx = new Expr_func_all_distinctContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2237);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitExpr_func_over_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_over_clauseContext expr_func_over_clause() throws RecognitionException {
		Expr_func_over_clauseContext _localctx = new Expr_func_over_clauseContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2239);
			match(T_OVER);
			setState(2240);
			match(T_OPEN_P);
			setState(2242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(2241);
				expr_func_partition_by_clause();
				}
			}

			setState(2245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(2244);
				order_by_clause();
				}
			}

			setState(2247);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitExpr_func_partition_by_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_partition_by_clauseContext expr_func_partition_by_clause() throws RecognitionException {
		Expr_func_partition_by_clauseContext _localctx = new Expr_func_partition_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2249);
			match(T_PARTITION);
			setState(2250);
			match(T_BY);
			setState(2251);
			expr(0);
			setState(2256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2252);
				match(T_COMMA);
				setState(2253);
				expr(0);
				}
				}
				setState(2258);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitExpr_spec_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_spec_funcContext expr_spec_func() throws RecognitionException {
		Expr_spec_funcContext _localctx = new Expr_spec_funcContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(2459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2259);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2260);
				match(T_CAST);
				setState(2261);
				match(T_OPEN_P);
				setState(2262);
				expr(0);
				setState(2263);
				match(T_AS);
				setState(2264);
				dtype();
				setState(2266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2265);
					dtype_len();
					}
				}

				setState(2268);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2270);
				match(T_COUNT);
				setState(2271);
				match(T_OPEN_P);
				setState(2274);
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
				case T_SUBSTRING:
				case T_SUM:
				case T_TIMESTAMP:
				case T_TRUE:
				case T_VAR:
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
					setState(2272);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(2273);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2276);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2277);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2278);
				match(T_CURRENT);
				setState(2279);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2283);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(2280);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(2281);
					match(T_CURRENT);
					setState(2282);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2285);
					match(T_OPEN_P);
					setState(2286);
					expr(0);
					setState(2287);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2291);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2292);
				match(T_CURRENT);
				setState(2293);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2294);
				match(T_MAX_PART_STRING);
				setState(2295);
				match(T_OPEN_P);
				setState(2296);
				expr(0);
				setState(2309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2297);
					match(T_COMMA);
					setState(2298);
					expr(0);
					setState(2306);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2299);
						match(T_COMMA);
						setState(2300);
						expr(0);
						setState(2301);
						match(T_EQUAL);
						setState(2302);
						expr(0);
						}
						}
						setState(2308);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2311);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2313);
				match(T_MIN_PART_STRING);
				setState(2314);
				match(T_OPEN_P);
				setState(2315);
				expr(0);
				setState(2328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2316);
					match(T_COMMA);
					setState(2317);
					expr(0);
					setState(2325);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2318);
						match(T_COMMA);
						setState(2319);
						expr(0);
						setState(2320);
						match(T_EQUAL);
						setState(2321);
						expr(0);
						}
						}
						setState(2327);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2330);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2332);
				match(T_MAX_PART_INT);
				setState(2333);
				match(T_OPEN_P);
				setState(2334);
				expr(0);
				setState(2347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2335);
					match(T_COMMA);
					setState(2336);
					expr(0);
					setState(2344);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2337);
						match(T_COMMA);
						setState(2338);
						expr(0);
						setState(2339);
						match(T_EQUAL);
						setState(2340);
						expr(0);
						}
						}
						setState(2346);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2349);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2351);
				match(T_MIN_PART_INT);
				setState(2352);
				match(T_OPEN_P);
				setState(2353);
				expr(0);
				setState(2366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2354);
					match(T_COMMA);
					setState(2355);
					expr(0);
					setState(2363);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2356);
						match(T_COMMA);
						setState(2357);
						expr(0);
						setState(2358);
						match(T_EQUAL);
						setState(2359);
						expr(0);
						}
						}
						setState(2365);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2368);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2370);
				match(T_MAX_PART_DATE);
				setState(2371);
				match(T_OPEN_P);
				setState(2372);
				expr(0);
				setState(2385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2373);
					match(T_COMMA);
					setState(2374);
					expr(0);
					setState(2382);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2375);
						match(T_COMMA);
						setState(2376);
						expr(0);
						setState(2377);
						match(T_EQUAL);
						setState(2378);
						expr(0);
						}
						}
						setState(2384);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2387);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2389);
				match(T_MIN_PART_DATE);
				setState(2390);
				match(T_OPEN_P);
				setState(2391);
				expr(0);
				setState(2404);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2392);
					match(T_COMMA);
					setState(2393);
					expr(0);
					setState(2401);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2394);
						match(T_COMMA);
						setState(2395);
						expr(0);
						setState(2396);
						match(T_EQUAL);
						setState(2397);
						expr(0);
						}
						}
						setState(2403);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2406);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2408);
				match(T_PART_COUNT);
				setState(2409);
				match(T_OPEN_P);
				setState(2410);
				expr(0);
				setState(2418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2411);
					match(T_COMMA);
					setState(2412);
					expr(0);
					setState(2413);
					match(T_EQUAL);
					setState(2414);
					expr(0);
					}
					}
					setState(2420);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2421);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2423);
				match(T_PART_LOC);
				setState(2424);
				match(T_OPEN_P);
				setState(2425);
				expr(0);
				setState(2431); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
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
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2433); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2435);
					match(T_COMMA);
					setState(2436);
					expr(0);
					}
				}

				setState(2439);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2441);
				match(T_TRIM);
				setState(2442);
				match(T_OPEN_P);
				setState(2443);
				expr(0);
				setState(2444);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2446);
				match(T_SUBSTRING);
				setState(2447);
				match(T_OPEN_P);
				setState(2448);
				expr(0);
				setState(2449);
				match(T_FROM);
				setState(2450);
				expr(0);
				setState(2453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(2451);
					match(T_FOR);
					setState(2452);
					expr(0);
					}
				}

				setState(2455);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2457);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2458);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitExpr_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_funcContext expr_func() throws RecognitionException {
		Expr_funcContext _localctx = new Expr_funcContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2461);
			ident();
			setState(2462);
			match(T_OPEN_P);
			setState(2464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
			case 1:
				{
				setState(2463);
				expr_func_params();
				}
				break;
			}
			setState(2466);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitExpr_func_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_func_paramsContext expr_func_params() throws RecognitionException {
		Expr_func_paramsContext _localctx = new Expr_func_paramsContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_expr_func_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2468);
			func_param();
			setState(2473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2469);
					match(T_COMMA);
					setState(2470);
					func_param();
					}
					} 
				}
				setState(2475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,314,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitFunc_param(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_paramContext func_param() throws RecognitionException {
		Func_paramContext _localctx = new Func_paramContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2476);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(2482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				{
				setState(2477);
				ident();
				setState(2478);
				match(T_EQUAL);
				setState(2480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
					{
					setState(2479);
					match(T_GREATER);
					}
				}

				}
				break;
			}
			setState(2484);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_missing_right_p(this);
			else return visitor.visitChildren(this);
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
			setState(2486);
			match(T_OPEN_P);
			setState(2490);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2487);
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
				setState(2492);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitDate_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_literalContext date_literal() throws RecognitionException {
		Date_literalContext _localctx = new Date_literalContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_date_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2493);
			match(T_DATE);
			setState(2494);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitTimestamp_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_timestamp_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2496);
			match(T_TIMESTAMP);
			setState(2497);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2499);
			match(L_ID);
			setState(2504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2500);
					match(T__3);
					setState(2501);
					match(L_ID);
					}
					} 
				}
				setState(2506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,318,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitDouble_quotedString(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitSingle_quotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_string);
		try {
			setState(2509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2507);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2508);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_stringContext error_string() throws RecognitionException {
		Error_stringContext _localctx = new Error_stringContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_error_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2511);
			_la = _input.LA(1);
			if ( !(_la==L_S_STRING_MISSING_RIGHT || _la==L_D_STRING_MISSING_RIGHT) ) {
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

	public static class Int_numberContext extends ParserRuleContext {
		public TerminalNode L_INT() { return getToken(PLHQLStatementsParser.L_INT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitInt_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_numberContext int_number() throws RecognitionException {
		Int_numberContext _localctx = new Int_numberContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2513);
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

			setState(2516);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitDec_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dec_numberContext dec_number() throws RecognitionException {
		Dec_numberContext _localctx = new Dec_numberContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2518);
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

			setState(2521);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitBool_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2523);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitNull_const(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_constContext null_const() throws RecognitionException {
		Null_constContext _localctx = new Null_constContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2525);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitNon_reserved_words(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Non_reserved_wordsContext non_reserved_words() throws RecognitionException {
		Non_reserved_wordsContext _localctx = new Non_reserved_wordsContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2527);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitError_invalid_token(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_invalid_tokenContext error_invalid_token() throws RecognitionException {
		Error_invalid_tokenContext _localctx = new Error_invalid_tokenContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_error_invalid_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2529);
			match(L_INVALID_TOKEN);
			}
		}
		catch (RecognitionException re) {
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
		case 11:
			return expr_stmt_sempred((Expr_stmtContext)_localctx, predIndex);
		case 68:
			return create_routine_params_sempred((Create_routine_paramsContext)_localctx, predIndex);
		case 102:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 114:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 122:
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
	private boolean expr_stmt_sempred(Expr_stmtContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return !_input.LT(1).getText().equalsIgnoreCase("GO");
		}
		return true;
	}
	private boolean create_routine_params_sempred(Create_routine_paramsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return !_input.LT(1).getText().equalsIgnoreCase("IS") &&
		        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
		        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
		        ;
		}
		return true;
	}
	private boolean select_list_alias_sempred(Select_list_aliasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return !_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM");
		}
		return true;
	}
	private boolean from_alias_clause_sempred(From_alias_clauseContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
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
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
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
			return precpred(_ctx, 14);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u017d\u09e6\4\2\t"+
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
		"\t\u00a0\3\2\3\2\3\2\3\3\3\3\3\3\5\3\u0147\n\3\3\3\5\3\u014a\n\3\6\3\u014c"+
		"\n\3\r\3\16\3\u014d\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u015a"+
		"\n\4\3\5\5\5\u015d\n\5\3\5\3\5\3\5\3\5\3\6\5\6\u0164\n\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u016f\n\7\5\7\u0171\n\7\3\b\3\b\3\b\3\t\3\t"+
		"\6\t\u0178\n\t\r\t\16\t\u0179\3\t\5\t\u017d\n\t\5\t\u017f\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0196\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\5\16\u01a0\n\16"+
		"\3\16\3\16\3\16\7\16\u01a5\n\16\f\16\16\16\u01a8\13\16\3\17\3\17\3\17"+
		"\5\17\u01ad\n\17\3\20\3\20\5\20\u01b1\n\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u01ba\n\20\3\20\3\20\3\20\5\20\u01bf\n\20\3\21\3\21\3\21"+
		"\3\21\7\21\u01c5\n\21\f\21\16\21\u01c8\13\21\3\21\3\21\5\21\u01cc\n\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u01d3\n\21\f\21\16\21\u01d6\13\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u01df\n\22\f\22\16\22\u01e2\13\22"+
		"\3\22\3\22\5\22\u01e6\n\22\3\22\5\22\u01e9\n\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u01f6\n\24\3\24\3\24\5\24\u01fa"+
		"\n\24\3\25\3\25\3\25\3\25\7\25\u0200\n\25\f\25\16\25\u0203\13\25\3\26"+
		"\3\26\3\26\7\26\u0208\n\26\f\26\16\26\u020b\13\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u0213\n\27\f\27\16\27\u0216\13\27\3\30\3\30\3\30\3\30"+
		"\3\30\7\30\u021d\n\30\f\30\16\30\u0220\13\30\3\31\3\31\3\32\3\32\3\32"+
		"\7\32\u0227\n\32\f\32\16\32\u022a\13\32\3\32\5\32\u022d\n\32\3\32\3\32"+
		"\5\32\u0231\n\32\3\32\7\32\u0234\n\32\f\32\16\32\u0237\13\32\3\32\5\32"+
		"\u023a\n\32\3\32\3\32\3\32\5\32\u023f\n\32\3\32\3\32\5\32\u0243\n\32\3"+
		"\32\3\32\5\32\u0247\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u024e\n\33\3\33"+
		"\3\33\5\33\u0252\n\33\3\33\3\33\3\34\3\34\3\34\5\34\u0259\n\34\3\35\3"+
		"\35\3\35\3\35\5\35\u025f\n\35\3\35\3\35\5\35\u0263\n\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\5\36\u026b\n\36\3\36\5\36\u026e\n\36\3\36\3\36\3\36\5"+
		"\36\u0273\n\36\3\36\3\36\3\37\5\37\u0278\n\37\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u027f\n\37\3\37\3\37\3\37\3\37\3\37\5\37\u0286\n\37\3\37\5\37\u0289"+
		"\n\37\3 \3 \3 \7 \u028e\n \f \16 \u0291\13 \3!\3!\3!\5!\u0296\n!\3!\7"+
		"!\u0299\n!\f!\16!\u029c\13!\3!\7!\u029f\n!\f!\16!\u02a2\13!\3!\3!\5!\u02a6"+
		"\n!\3!\5!\u02a9\n!\3\"\3\"\3#\3#\5#\u02af\n#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\7#\u02bb\n#\f#\16#\u02be\13#\3#\3#\3#\3#\3#\7#\u02c5\n#\f#\16#\u02c8"+
		"\13#\3#\3#\3#\5#\u02cd\n#\3$\3$\3$\5$\u02d2\n$\3$\3$\3$\5$\u02d7\n$\3"+
		"$\3$\3$\5$\u02dc\n$\7$\u02de\n$\f$\16$\u02e1\13$\3$\3$\5$\u02e5\n$\3$"+
		"\3$\3$\3$\3$\3$\7$\u02ed\n$\f$\16$\u02f0\13$\3$\3$\3$\3$\3$\3$\3$\7$\u02f9"+
		"\n$\f$\16$\u02fc\13$\3$\3$\7$\u0300\n$\f$\16$\u0303\13$\5$\u0305\n$\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0311\n%\3&\6&\u0314\n&\r&\16&\u0315\3"+
		"\'\3\'\3\'\5\'\u031b\n\'\3(\5(\u031e\n(\3(\3(\3)\6)\u0323\n)\r)\16)\u0324"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0331\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\6+\u033e\n+\r+\16+\u033f\3+\3+\3+\5+\u0345\n+\3,\5,\u0348\n,\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u0355\n,\f,\16,\u0358\13,\3,\3,\3,"+
		"\5,\u035d\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0368\n,\3-\5-\u036b\n-\3-"+
		"\3-\3-\3-\3-\3-\7-\u0373\n-\f-\16-\u0376\13-\3-\3-\3-\3-\5-\u037c\n-\3"+
		".\3.\3.\3.\5.\u0382\n.\3/\3/\3/\3/\7/\u0388\n/\f/\16/\u038b\13/\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\5\60\u0394\n\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u03a8\n\60\3\61\3\61\3\61\3\61\5\61\u03ae\n\61\3\62\3\62\5\62\u03b2\n"+
		"\62\3\62\3\62\3\62\5\62\u03b7\n\62\3\62\3\62\5\62\u03bb\n\62\3\62\3\62"+
		"\3\62\5\62\u03c0\n\62\3\62\5\62\u03c3\n\62\3\62\3\62\3\62\5\62\u03c8\n"+
		"\62\3\62\5\62\u03cb\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\5\63\u03d9\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u03f9\n\63\5\63\u03fb\n"+
		"\63\3\64\3\64\3\64\5\64\u0400\n\64\3\64\3\64\5\64\u0404\n\64\3\64\3\64"+
		"\3\65\5\65\u0409\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u0410\n\65\3\65\5"+
		"\65\u0413\n\65\3\66\5\66\u0416\n\66\3\66\3\66\3\66\5\66\u041b\n\66\3\66"+
		"\3\66\5\66\u041f\n\66\5\66\u0421\n\66\3\67\3\67\3\67\3\67\3\67\5\67\u0428"+
		"\n\67\3\67\3\67\7\67\u042c\n\67\f\67\16\67\u042f\13\67\38\38\38\38\58"+
		"\u0435\n8\39\39\39\39\59\u043b\n9\39\39\39\3:\3:\3:\7:\u0443\n:\f:\16"+
		":\u0446\13:\3;\3;\3;\3<\3<\3<\3<\5<\u044f\n<\3<\5<\u0452\n<\3<\3<\3<\5"+
		"<\u0457\n<\3<\3<\5<\u045b\n<\3<\5<\u045e\n<\3<\3<\3=\3=\3=\5=\u0465\n"+
		"=\3>\3>\3>\3>\5>\u046b\n>\3>\5>\u046e\n>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0478"+
		"\n>\3?\3?\3?\3?\3?\7?\u047f\n?\f?\16?\u0482\13?\3@\3@\3@\3@\5@\u0488\n"+
		"@\3@\3@\3@\3@\3@\5@\u048f\n@\5@\u0491\n@\3A\3A\3A\3A\5A\u0497\nA\3A\5"+
		"A\u049a\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u04a5\nA\3B\3B\3B\3B\3B\7B\u04ac"+
		"\nB\fB\16B\u04af\13B\3C\3C\3C\5C\u04b4\nC\3D\3D\3D\5D\u04b9\nD\3D\5D\u04bc"+
		"\nD\3D\3D\3D\5D\u04c1\nD\3D\5D\u04c4\nD\3D\5D\u04c7\nD\3D\3D\3D\3D\5D"+
		"\u04cd\nD\3E\3E\3E\5E\u04d2\nE\3E\5E\u04d5\nE\3E\3E\5E\u04d9\nE\3E\5E"+
		"\u04dc\nE\3E\5E\u04df\nE\3E\3E\3E\3E\5E\u04e5\nE\3F\3F\3F\3F\3F\3F\7F"+
		"\u04ed\nF\fF\16F\u04f0\13F\3F\3F\3F\3F\3F\3F\7F\u04f8\nF\fF\16F\u04fb"+
		"\13F\5F\u04fd\nF\3G\3G\3G\3G\3G\5G\u0504\nG\3G\3G\3G\5G\u0509\nG\3G\7"+
		"G\u050c\nG\fG\16G\u050f\13G\3G\5G\u0512\nG\3G\3G\3G\3G\3G\3G\5G\u051a"+
		"\nG\3G\3G\5G\u051e\nG\3G\7G\u0521\nG\fG\16G\u0524\13G\3G\5G\u0527\nG\5"+
		"G\u0529\nG\3H\3H\5H\u052d\nH\3H\3H\3H\3H\3H\3H\5H\u0535\nH\3H\3H\3H\3"+
		"H\7H\u053b\nH\fH\16H\u053e\13H\5H\u0540\nH\3I\3I\3I\5I\u0545\nI\3J\3J"+
		"\3J\3J\3J\3J\3J\3J\3K\3K\3K\5K\u0552\nK\3L\3L\3L\3L\3L\7L\u0559\nL\fL"+
		"\16L\u055c\13L\3L\5L\u055f\nL\3L\3L\3L\3M\3M\3M\3M\7M\u0568\nM\fM\16M"+
		"\u056b\13M\3M\5M\u056e\nM\3M\3M\3M\3N\3N\3N\3N\3N\5N\u0578\nN\3O\3O\3"+
		"O\3O\5O\u057e\nO\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3S\3"+
		"S\3S\3T\3T\5T\u0595\nT\3T\3T\3T\3T\3T\3T\3T\3T\7T\u059f\nT\fT\16T\u05a2"+
		"\13T\3T\3T\3U\3U\5U\u05a8\nU\3U\3U\3U\3U\7U\u05ae\nU\fU\16U\u05b1\13U"+
		"\3U\3U\3V\3V\5V\u05b7\nV\3W\3W\5W\u05bb\nW\3X\3X\3X\3X\5X\u05c1\nX\3X"+
		"\3X\3X\3X\3X\5X\u05c8\nX\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u05d7"+
		"\nY\3Y\5Y\u05da\nY\3Y\5Y\u05dd\nY\3Y\5Y\u05e0\nY\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\7Y\u05eb\nY\fY\16Y\u05ee\13Y\3Y\3Y\3Z\3Z\3Z\3Z\5Z\u05f6\nZ\3Z\3"+
		"Z\3Z\3Z\3Z\5Z\u05fd\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0607\nZ\3Z\3Z\3Z\3"+
		"Z\3Z\5Z\u060e\nZ\3Z\3Z\3Z\3Z\3Z\3Z\3Z\5Z\u0617\nZ\3Z\3Z\3Z\3Z\3Z\5Z\u061e"+
		"\nZ\3Z\3Z\3Z\3Z\5Z\u0624\nZ\3[\5[\u0627\n[\3[\3[\3\\\3\\\3\\\3\\\7\\\u062f"+
		"\n\\\f\\\16\\\u0632\13\\\3]\3]\5]\u0636\n]\3]\3]\3]\3]\3]\3^\3^\3^\3^"+
		"\7^\u0641\n^\f^\16^\u0644\13^\3^\3^\3_\3_\3_\3_\7_\u064c\n_\f_\16_\u064f"+
		"\13_\3`\3`\3`\3`\3`\5`\u0656\n`\3a\3a\5a\u065a\na\3a\3a\5a\u065e\na\3"+
		"a\3a\5a\u0662\na\5a\u0664\na\3b\3b\3b\5b\u0669\nb\3b\3b\5b\u066d\nb\3"+
		"b\5b\u0670\nb\3b\3b\5b\u0674\nb\3b\5b\u0677\nb\3c\3c\3c\5c\u067c\nc\3"+
		"c\5c\u067f\nc\3c\5c\u0682\nc\3c\3c\5c\u0686\nc\3c\5c\u0689\nc\3c\5c\u068c"+
		"\nc\3d\5d\u068f\nd\3d\5d\u0692\nd\3d\3d\3d\7d\u0697\nd\fd\16d\u069a\13"+
		"d\3e\3e\3f\3f\3f\3g\3g\3g\5g\u06a4\ng\3g\3g\5g\u06a8\ng\3g\5g\u06ab\n"+
		"g\3h\3h\5h\u06af\nh\3h\3h\3h\3h\3h\5h\u06b6\nh\3i\3i\5i\u06ba\ni\3i\3"+
		"i\3j\3j\3j\3j\7j\u06c2\nj\fj\16j\u06c5\13j\3k\3k\3k\7k\u06ca\nk\fk\16"+
		"k\u06cd\13k\3l\3l\7l\u06d1\nl\fl\16l\u06d4\13l\3m\3m\3m\5m\u06d9\nm\3"+
		"n\3n\5n\u06dd\nn\3o\3o\3o\3o\5o\u06e3\no\3p\3p\3p\3p\3p\3p\3p\5p\u06ec"+
		"\np\3q\5q\u06ef\nq\3q\3q\3q\5q\u06f4\nq\3q\5q\u06f7\nq\3r\3r\3r\3r\3r"+
		"\3r\7r\u06ff\nr\fr\16r\u0702\13r\3r\3r\5r\u0706\nr\3s\3s\3s\3s\3s\7s\u070d"+
		"\ns\fs\16s\u0710\13s\3s\3s\5s\u0714\ns\3t\3t\5t\u0718\nt\3t\3t\3t\3t\3"+
		"t\7t\u071f\nt\ft\16t\u0722\13t\3t\5t\u0725\nt\3u\3u\3v\3v\3v\3w\3w\3x"+
		"\3x\3x\3x\3x\7x\u0733\nx\fx\16x\u0736\13x\3y\3y\3y\3z\3z\3z\3{\3{\3{\3"+
		"{\5{\u0742\n{\3{\3{\3{\5{\u0747\n{\7{\u0749\n{\f{\16{\u074c\13{\3|\3|"+
		"\5|\u0750\n|\3|\3|\3|\3|\3|\5|\u0757\n|\3|\3|\3|\3|\7|\u075d\n|\f|\16"+
		"|\u0760\13|\3}\3}\5}\u0764\n}\3~\3~\3~\5~\u0769\n~\3~\3~\3~\3~\3~\3~\3"+
		"~\3~\3~\5~\u0774\n~\3~\3~\3~\3~\3~\3~\3~\5~\u077d\n~\3\177\3\177\5\177"+
		"\u0781\n\177\3\177\3\177\3\177\3\177\3\177\7\177\u0788\n\177\f\177\16"+
		"\177\u078b\13\177\3\177\5\177\u078e\n\177\3\177\3\177\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\7\u0080\u0796\n\u0080\f\u0080\16\u0080\u0799\13\u0080"+
		"\3\u0080\3\u0080\5\u0080\u079d\n\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u07b2\n\u0083"+
		"\3\u0083\5\u0083\u07b5\n\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\5\u0084\u07c7\n\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\7\u0084\u07d7\n\u0084\f\u0084\16\u0084\u07da\13\u0084\3\u0085"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u07e4"+
		"\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\7\u0088\u07f1\n\u0088\f\u0088\16\u0088\u07f4"+
		"\13\u0088\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\5\u0089\u07ff\n\u0089\3\u008a\3\u008a\5\u008a\u0803\n\u008a\3"+
		"\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\6\u008b\u080c\n"+
		"\u008b\r\u008b\16\u008b\u080d\3\u008b\3\u008b\5\u008b\u0812\n\u008b\3"+
		"\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\3\u008c\6\u008c"+
		"\u081c\n\u008c\r\u008c\16\u008c\u081d\3\u008c\3\u008c\5\u008c\u0822\n"+
		"\u008c\3\u008c\3\u008c\3\u008d\3\u008d\3\u008d\5\u008d\u0829\n\u008d\3"+
		"\u008d\3\u008d\3\u008d\5\u008d\u082e\n\u008d\3\u008d\3\u008d\3\u008d\5"+
		"\u008d\u0833\n\u008d\3\u008d\3\u008d\5\u008d\u0837\n\u008d\3\u008d\3\u008d"+
		"\5\u008d\u083b\n\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0840\n\u008d\3"+
		"\u008d\3\u008d\5\u008d\u0844\n\u008d\3\u008d\3\u008d\5\u008d\u0848\n\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\5\u008d\u085f\n\u008d\5\u008d\u0861\n\u008d\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0873"+
		"\n\u008d\5\u008d\u0875\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\5\u008d\u087d\n\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0882\n"+
		"\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0887\n\u008d\3\u008d\3\u008d\3"+
		"\u008d\5\u008d\u088c\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0899\n\u008d\3"+
		"\u008d\3\u008d\3\u008d\5\u008d\u089e\n\u008d\3\u008d\3\u008d\3\u008d\5"+
		"\u008d\u08a3\n\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u08a8\n\u008d\3\u008d"+
		"\3\u008d\3\u008d\5\u008d\u08ad\n\u008d\3\u008d\3\u008d\3\u008d\5\u008d"+
		"\u08b2\n\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u08b7\n\u008d\3\u008d\3"+
		"\u008d\3\u008d\5\u008d\u08bc\n\u008d\5\u008d\u08be\n\u008d\3\u008e\3\u008e"+
		"\3\u008f\3\u008f\3\u008f\5\u008f\u08c5\n\u008f\3\u008f\5\u008f\u08c8\n"+
		"\u008f\3\u008f\3\u008f\3\u0090\3\u0090\3\u0090\3\u0090\3\u0090\7\u0090"+
		"\u08d1\n\u0090\f\u0090\16\u0090\u08d4\13\u0090\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u08dd\n\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u08e5\n\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u08ee\n\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\5\u0091\u08f4\n\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\7\u0091\u0903\n\u0091\f\u0091\16\u0091\u0906\13\u0091\5\u0091"+
		"\u0908\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u0916\n\u0091\f\u0091"+
		"\16\u0091\u0919\13\u0091\5\u0091\u091b\n\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\7\u0091\u0929\n\u0091\f\u0091\16\u0091\u092c\13\u0091\5\u0091\u092e\n"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u093c\n\u0091\f\u0091\16\u0091"+
		"\u093f\13\u0091\5\u0091\u0941\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091"+
		"\u094f\n\u0091\f\u0091\16\u0091\u0952\13\u0091\5\u0091\u0954\n\u0091\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\7\u0091\u0962\n\u0091\f\u0091\16\u0091\u0965"+
		"\13\u0091\5\u0091\u0967\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\7\u0091\u0973\n\u0091\f\u0091"+
		"\16\u0091\u0976\13\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\3\u0091\6\u0091\u0982\n\u0091\r\u0091\16\u0091"+
		"\u0983\3\u0091\3\u0091\5\u0091\u0988\n\u0091\3\u0091\3\u0091\3\u0091\3"+
		"\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\3\u0091\3\u0091\5\u0091\u0998\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091"+
		"\5\u0091\u099e\n\u0091\3\u0092\3\u0092\3\u0092\5\u0092\u09a3\n\u0092\3"+
		"\u0092\3\u0092\3\u0093\3\u0093\3\u0093\7\u0093\u09aa\n\u0093\f\u0093\16"+
		"\u0093\u09ad\13\u0093\3\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u09b3\n"+
		"\u0094\5\u0094\u09b5\n\u0094\3\u0094\3\u0094\3\u0095\3\u0095\7\u0095\u09bb"+
		"\n\u0095\f\u0095\16\u0095\u09be\13\u0095\3\u0096\3\u0096\3\u0096\3\u0097"+
		"\3\u0097\3\u0097\3\u0098\3\u0098\3\u0098\7\u0098\u09c9\n\u0098\f\u0098"+
		"\16\u0098\u09cc\13\u0098\3\u0099\3\u0099\5\u0099\u09d0\n\u0099\3\u009a"+
		"\3\u009a\3\u009b\5\u009b\u09d5\n\u009b\3\u009b\3\u009b\3\u009c\5\u009c"+
		"\u09da\n\u009c\3\u009c\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e\3\u009f"+
		"\3\u009f\3\u00a0\3\u00a0\3\u00a0\2\4\u00f6\u0106\u00a1\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a"+
		"\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122"+
		"\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a"+
		"\u013c\u013e\2#\5\2\3\4\u015e\u015e\u016f\u016f\4\2\u00b9\u00b9\u0101"+
		"\u0101\4\2\20\20TT\4\2QQ\u012d\u012d\4\2mm\u00ac\u00ac\4\2QQ\u00d9\u00d9"+
		"\4\2MM\u0089\u0089\5\2\u008d\u008d\u00b3\u00b3\u00d5\u00d6\4\2\u00ae\u00ae"+
		"\u00c0\u00c0\4\2\u00bd\u00bd\u0141\u0141\4\2\u00f4\u00f4\u012a\u012a\4"+
		"\2\u00b2\u00b2\u0176\u0176\4\2  \'\'\4\2%%??\4\2CC\u00fa\u00fa\4\2\17"+
		"\17\u009a\u009a\3\2\u00eb\u00ec\3\2\u00dc\u00dd\3\2gh\3\2`a\4\2\37\37"+
		"\u0113\u0113\3\2\u00ff\u0100\4\2\t\tYY\5\2yy\u00a3\u00a3\u00ee\u00ee\4"+
		"\2\f\f\u00cc\u00cc\5\2\u00a4\u00a4\u00e5\u00e5\u00ef\u00ef\5\2GH\u00b6"+
		"\u00b7\u00fb\u00fc\4\2\65\65\u015d\u015d\3\2\u016d\u016d\4\2\u0173\u0173"+
		"\u0175\u0175\4\2\u015a\u015a\u0170\u0170\4\2nn\u0128\u0128\17\2\7\32\34"+
		"^bbd\u00c3\u00c5\u00d6\u00d8\u00f3\u00f5\u0108\u010a\u0122\u0124\u0129"+
		"\u012c\u0136\u0138\u0138\u013b\u014b\u0152\u0159\2\u0b40\2\u0140\3\2\2"+
		"\2\4\u014b\3\2\2\2\6\u0159\3\2\2\2\b\u015c\3\2\2\2\n\u0163\3\2\2\2\f\u0170"+
		"\3\2\2\2\16\u0172\3\2\2\2\20\u017e\3\2\2\2\22\u0195\3\2\2\2\24\u0197\3"+
		"\2\2\2\26\u0199\3\2\2\2\30\u019b\3\2\2\2\32\u019f\3\2\2\2\34\u01ac\3\2"+
		"\2\2\36\u01be\3\2\2\2 \u01c0\3\2\2\2\"\u01e5\3\2\2\2$\u01ef\3\2\2\2&\u01f1"+
		"\3\2\2\2(\u01fb\3\2\2\2*\u0204\3\2\2\2,\u020c\3\2\2\2.\u0217\3\2\2\2\60"+
		"\u0221\3\2\2\2\62\u0246\3\2\2\2\64\u0248\3\2\2\2\66\u0258\3\2\2\28\u025a"+
		"\3\2\2\2:\u0266\3\2\2\2<\u0285\3\2\2\2>\u028a\3\2\2\2@\u02a8\3\2\2\2B"+
		"\u02aa\3\2\2\2D\u02cc\3\2\2\2F\u0304\3\2\2\2H\u0306\3\2\2\2J\u0313\3\2"+
		"\2\2L\u031a\3\2\2\2N\u031d\3\2\2\2P\u0322\3\2\2\2R\u0330\3\2\2\2T\u0344"+
		"\3\2\2\2V\u0367\3\2\2\2X\u037b\3\2\2\2Z\u0381\3\2\2\2\\\u0383\3\2\2\2"+
		"^\u03a7\3\2\2\2`\u03ad\3\2\2\2b\u03ca\3\2\2\2d\u03fa\3\2\2\2f\u03fc\3"+
		"\2\2\2h\u0412\3\2\2\2j\u0420\3\2\2\2l\u0422\3\2\2\2n\u0434\3\2\2\2p\u0436"+
		"\3\2\2\2r\u043f\3\2\2\2t\u0447\3\2\2\2v\u0451\3\2\2\2x\u0461\3\2\2\2z"+
		"\u046d\3\2\2\2|\u0479\3\2\2\2~\u0490\3\2\2\2\u0080\u0499\3\2\2\2\u0082"+
		"\u04a6\3\2\2\2\u0084\u04b3\3\2\2\2\u0086\u04bb\3\2\2\2\u0088\u04d4\3\2"+
		"\2\2\u008a\u04fc\3\2\2\2\u008c\u0528\3\2\2\2\u008e\u052a\3\2\2\2\u0090"+
		"\u0544\3\2\2\2\u0092\u0546\3\2\2\2\u0094\u0551\3\2\2\2\u0096\u0553\3\2"+
		"\2\2\u0098\u0563\3\2\2\2\u009a\u0572\3\2\2\2\u009c\u0579\3\2\2\2\u009e"+
		"\u057f\3\2\2\2\u00a0\u0585\3\2\2\2\u00a2\u058a\3\2\2\2\u00a4\u058f\3\2"+
		"\2\2\u00a6\u0592\3\2\2\2\u00a8\u05a5\3\2\2\2\u00aa\u05b4\3\2\2\2\u00ac"+
		"\u05b8\3\2\2\2\u00ae\u05bc\3\2\2\2\u00b0\u05ce\3\2\2\2\u00b2\u0623\3\2"+
		"\2\2\u00b4\u0626\3\2\2\2\u00b6\u062a\3\2\2\2\u00b8\u0633\3\2\2\2\u00ba"+
		"\u063c\3\2\2\2\u00bc\u0647\3\2\2\2\u00be\u0655\3\2\2\2\u00c0\u0663\3\2"+
		"\2\2\u00c2\u0665\3\2\2\2\u00c4\u068b\3\2\2\2\u00c6\u068e\3\2\2\2\u00c8"+
		"\u069b\3\2\2\2\u00ca\u069d\3\2\2\2\u00cc\u06aa\3\2\2\2\u00ce\u06b5\3\2"+
		"\2\2\u00d0\u06b9\3\2\2\2\u00d2\u06bd\3\2\2\2\u00d4\u06c6\3\2\2\2\u00d6"+
		"\u06ce\3\2\2\2\u00d8\u06d8\3\2\2\2\u00da\u06da\3\2\2\2\u00dc\u06de\3\2"+
		"\2\2\u00de\u06eb\3\2\2\2\u00e0\u06f6\3\2\2\2\u00e2\u06f8\3\2\2\2\u00e4"+
		"\u0713\3\2\2\2\u00e6\u0715\3\2\2\2\u00e8\u0726\3\2\2\2\u00ea\u0728\3\2"+
		"\2\2\u00ec\u072b\3\2\2\2\u00ee\u072d\3\2\2\2\u00f0\u0737\3\2\2\2\u00f2"+
		"\u073a\3\2\2\2\u00f4\u073d\3\2\2\2\u00f6\u0756\3\2\2\2\u00f8\u0763\3\2"+
		"\2\2\u00fa\u077c\3\2\2\2\u00fc\u077e\3\2\2\2\u00fe\u0791\3\2\2\2\u0100"+
		"\u07a3\3\2\2\2\u0102\u07a7\3\2\2\2\u0104\u07b4\3\2\2\2\u0106\u07c6\3\2"+
		"\2\2\u0108\u07e3\3\2\2\2\u010a\u07e5\3\2\2\2\u010c\u07e9\3\2\2\2\u010e"+
		"\u07eb\3\2\2\2\u0110\u07fe\3\2\2\2\u0112\u0802\3\2\2\2\u0114\u0804\3\2"+
		"\2\2\u0116\u0815\3\2\2\2\u0118\u08bd\3\2\2\2\u011a\u08bf\3\2\2\2\u011c"+
		"\u08c1\3\2\2\2\u011e\u08cb\3\2\2\2\u0120\u099d\3\2\2\2\u0122\u099f\3\2"+
		"\2\2\u0124\u09a6\3\2\2\2\u0126\u09ae\3\2\2\2\u0128\u09b8\3\2\2\2\u012a"+
		"\u09bf\3\2\2\2\u012c\u09c2\3\2\2\2\u012e\u09c5\3\2\2\2\u0130\u09cf\3\2"+
		"\2\2\u0132\u09d1\3\2\2\2\u0134\u09d4\3\2\2\2\u0136\u09d9\3\2\2\2\u0138"+
		"\u09dd\3\2\2\2\u013a\u09df\3\2\2\2\u013c\u09e1\3\2\2\2\u013e\u09e3\3\2"+
		"\2\2\u0140\u0141\5\4\3\2\u0141\u0142\7\2\2\3\u0142\3\3\2\2\2\u0143\u0147"+
		"\5\b\5\2\u0144\u0147\5\22\n\2\u0145\u0147\5\6\4\2\u0146\u0143\3\2\2\2"+
		"\u0146\u0144\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u0149\3\2\2\2\u0148\u014a"+
		"\7}\2\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b"+
		"\u0146\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\5\3\2\2\2\u014f\u015a\5\u00c4c\2\u0150\u015a\5\u0128\u0095"+
		"\2\u0151\u015a\5\n\6\2\u0152\u015a\5\u0132\u009a\2\u0153\u015a\5\u00ec"+
		"w\2\u0154\u015a\5\u0094K\2\u0155\u015a\5\66\34\2\u0156\u015a\5\u00b2Z"+
		"\2\u0157\u015a\5*\26\2\u0158\u015a\5\u013e\u00a0\2\u0159\u014f\3\2\2\2"+
		"\u0159\u0150\3\2\2\2\u0159\u0151\3\2\2\2\u0159\u0152\3\2\2\2\u0159\u0153"+
		"\3\2\2\2\u0159\u0154\3\2\2\2\u0159\u0155\3\2\2\2\u0159\u0156\3\2\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u0158\3\2\2\2\u015a\7\3\2\2\2\u015b\u015d\5,\27\2"+
		"\u015c\u015b\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f"+
		"\7\26\2\2\u015f\u0160\5\4\3\2\u0160\u0161\5\16\b\2\u0161\t\3\2\2\2\u0162"+
		"\u0164\5,\27\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0166\7\26\2\2\u0166\u0167\5\4\3\2\u0167\13\3\2\2\2\u0168\u0169"+
		"\7\26\2\2\u0169\u016a\5\4\3\2\u016a\u016b\5\16\b\2\u016b\u0171\3\2\2\2"+
		"\u016c\u016e\5\22\n\2\u016d\u016f\7\u016f\2\2\u016e\u016d\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u0168\3\2\2\2\u0170\u016c\3\2"+
		"\2\2\u0171\r\3\2\2\2\u0172\u0173\6\b\2\2\u0173\u0174\7c\2\2\u0174\17\3"+
		"\2\2\2\u0175\u017f\5\b\5\2\u0176\u0178\5\22\n\2\u0177\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2"+
		"\2\2\u017b\u017d\7}\2\2\u017c\u017b\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017f\3\2\2\2\u017e\u0175\3\2\2\2\u017e\u0177\3\2\2\2\u017f\21\3\2\2"+
		"\2\u0180\u0196\5\32\16\2\u0181\u0196\5$\23\2\u0182\u0196\5&\24\2\u0183"+
		"\u0196\5l\67\2\u0184\u0196\5v<\2\u0185\u0196\5\u00a6T\2\u0186\u0196\5"+
		":\36\2\u0187\u0196\5z>\2\u0188\u0196\5\u0080A\2\u0189\u0196\5\u0086D\2"+
		"\u018a\u0196\5\64\33\2\u018b\u0196\5(\25\2\u018c\u0196\5\u008eH\2\u018d"+
		"\u0196\5\u00aeX\2\u018e\u0196\5\u0090I\2\u018f\u0196\5\u0092J\2\u0190"+
		"\u0196\5\u00b0Y\2\u0191\u0196\5\u00acW\2\u0192\u0196\5\u00b4[\2\u0193"+
		"\u0196\5\26\f\2\u0194\u0196\5\24\13\2\u0195\u0180\3\2\2\2\u0195\u0181"+
		"\3\2\2\2\u0195\u0182\3\2\2\2\u0195\u0183\3\2\2\2\u0195\u0184\3\2\2\2\u0195"+
		"\u0185\3\2\2\2\u0195\u0186\3\2\2\2\u0195\u0187\3\2\2\2\u0195\u0188\3\2"+
		"\2\2\u0195\u0189\3\2\2\2\u0195\u018a\3\2\2\2\u0195\u018b\3\2\2\2\u0195"+
		"\u018c\3\2\2\2\u0195\u018d\3\2\2\2\u0195\u018e\3\2\2\2\u0195\u018f\3\2"+
		"\2\2\u0195\u0190\3\2\2\2\u0195\u0191\3\2\2\2\u0195\u0192\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0195\u0194\3\2\2\2\u0196\23\3\2\2\2\u0197\u0198\t\2\2"+
		"\2\u0198\25\3\2\2\2\u0199\u019a\7\u00c4\2\2\u019a\27\3\2\2\2\u019b\u019c"+
		"\6\r\3\2\u019c\u019d\5\u0106\u0084\2\u019d\31\3\2\2\2\u019e\u01a0\7\u0101"+
		"\2\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1"+
		"\u01a6\5\34\17\2\u01a2\u01a3\7\u015c\2\2\u01a3\u01a5\5\34\17\2\u01a4\u01a2"+
		"\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7"+
		"\33\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ad\5\36\20\2\u01aa\u01ad\5 \21"+
		"\2\u01ab\u01ad\5\"\22\2\u01ac\u01a9\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac"+
		"\u01ab\3\2\2\2\u01ad\35\3\2\2\2\u01ae\u01b0\5\u012e\u0098\2\u01af\u01b1"+
		"\7\u015b\2\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\3\2\2"+
		"\2\u01b2\u01b3\7\u0160\2\2\u01b3\u01b4\5\u0106\u0084\2\u01b4\u01bf\3\2"+
		"\2\2\u01b5\u01b6\7\u016a\2\2\u01b6\u01b7\5\u012e\u0098\2\u01b7\u01b9\7"+
		"\u016d\2\2\u01b8\u01ba\7\u015b\2\2\u01b9\u01b8\3\2\2\2\u01b9\u01ba\3\2"+
		"\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\7\u0160\2\2\u01bc\u01bd\5\u0106\u0084"+
		"\2\u01bd\u01bf\3\2\2\2\u01be\u01ae\3\2\2\2\u01be\u01b5\3\2\2\2\u01bf\37"+
		"\3\2\2\2\u01c0\u01c1\7\u016a\2\2\u01c1\u01c6\5\u012e\u0098\2\u01c2\u01c3"+
		"\7\u015c\2\2\u01c3\u01c5\5\u012e\u0098\2\u01c4\u01c2\3\2\2\2\u01c5\u01c8"+
		"\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c9\u01cb\7\u016d\2\2\u01ca\u01cc\7\u015b\2\2\u01cb\u01ca"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\7\u0160\2"+
		"\2\u01ce\u01cf\7\u016a\2\2\u01cf\u01d4\5\u0106\u0084\2\u01d0\u01d1\7\u015c"+
		"\2\2\u01d1\u01d3\5\u0106\u0084\2\u01d2\u01d0\3\2\2\2\u01d3\u01d6\3\2\2"+
		"\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01d4"+
		"\3\2\2\2\u01d7\u01d8\7\u016d\2\2\u01d8!\3\2\2\2\u01d9\u01e6\5\u012e\u0098"+
		"\2\u01da\u01db\7\u016a\2\2\u01db\u01e0\5\u012e\u0098\2\u01dc\u01dd\7\u015c"+
		"\2\2\u01dd\u01df\5\u012e\u0098\2\u01de\u01dc\3\2\2\2\u01df\u01e2\3\2\2"+
		"\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2\u01e0"+
		"\3\2\2\2\u01e3\u01e4\7\u016d\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01d9\3\2\2"+
		"\2\u01e5\u01da\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e9\7\u015b\2\2\u01e8"+
		"\u01e7\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\7\u0160"+
		"\2\2\u01eb\u01ec\7\u016a\2\2\u01ec\u01ed\5\u00b4[\2\u01ed\u01ee\7\u016d"+
		"\2\2\u01ee#\3\2\2\2\u01ef\u01f0\7\36\2\2\u01f0%\3\2\2\2\u01f1\u01f2\7"+
		"!\2\2\u01f2\u01f9\5\u012e\u0098\2\u01f3\u01f5\7\u016a\2\2\u01f4\u01f6"+
		"\5\u0124\u0093\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\3"+
		"\2\2\2\u01f7\u01fa\7\u016d\2\2\u01f8\u01fa\5\u0124\u0093\2\u01f9\u01f3"+
		"\3\2\2\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\'\3\2\2\2\u01fb"+
		"\u01fc\7K\2\2\u01fc\u0201\5\60\31\2\u01fd\u01fe\7\u015c\2\2\u01fe\u0200"+
		"\5\60\31\2\u01ff\u01fd\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2"+
		"\u0201\u0202\3\2\2\2\u0202)\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0209\5"+
		"\60\31\2\u0205\u0206\7\u015c\2\2\u0206\u0208\5\60\31\2\u0207\u0205\3\2"+
		"\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"+\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\7K\2\2\u020d\u020e\5\60\31\2"+
		"\u020e\u0214\7\u016f\2\2\u020f\u0210\5\60\31\2\u0210\u0211\7\u016f\2\2"+
		"\u0211\u0213\3\2\2\2\u0212\u020f\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212"+
		"\3\2\2\2\u0214\u0215\3\2\2\2\u0215-\3\2\2\2\u0216\u0214\3\2\2\2\u0217"+
		"\u0218\5\60\31\2\u0218\u021e\7\u016f\2\2\u0219\u021a\5\60\31\2\u021a\u021b"+
		"\7\u016f\2\2\u021b\u021d\3\2\2\2\u021c\u0219\3\2\2\2\u021d\u0220\3\2\2"+
		"\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f/\3\2\2\2\u0220\u021e"+
		"\3\2\2\2\u0221\u0222\5\62\32\2\u0222\61\3\2\2\2\u0223\u0228\5\u012e\u0098"+
		"\2\u0224\u0225\7\u015c\2\2\u0225\u0227\5\u012e\u0098\2\u0226\u0224\3\2"+
		"\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022c\3\2\2\2\u022a\u0228\3\2\2\2\u022b\u022d\7\17\2\2\u022c\u022b\3"+
		"\2\2\2\u022c\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\5d\63\2\u022f"+
		"\u0231\5f\64\2\u0230\u022f\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0235\3\2"+
		"\2\2\u0232\u0234\5h\65\2\u0233\u0232\3\2\2\2\u0234\u0237\3\2\2\2\u0235"+
		"\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0235\3\2"+
		"\2\2\u0238\u023a\5j\66\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a"+
		"\u0247\3\2\2\2\u023b\u023c\5\u012e\u0098\2\u023c\u023e\7\62\2\2\u023d"+
		"\u023f\7\17\2\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3"+
		"\2\2\2\u0240\u0242\5d\63\2\u0241\u0243\5f\64\2\u0242\u0241\3\2\2\2\u0242"+
		"\u0243\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\5j\66\2\u0245\u0247\3\2"+
		"\2\2\u0246\u0223\3\2\2\2\u0246\u023b\3\2\2\2\u0247\63\3\2\2\2\u0248\u0249"+
		"\7<\2\2\u0249\u024d\7\u011c\2\2\u024a\u024b\7\u0087\2\2\u024b\u024c\7"+
		"\u00c2\2\2\u024c\u024e\7k\2\2\u024d\u024a\3\2\2\2\u024d\u024e\3\2\2\2"+
		"\u024e\u024f\3\2\2\2\u024f\u0251\5\u00e8u\2\u0250\u0252\5J&\2\u0251\u0250"+
		"\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\5<\37\2\u0254"+
		"\65\3\2\2\2\u0255\u0259\58\35\2\u0256\u0259\5\u00a8U\2\u0257\u0259\5\u0088"+
		"E\2\u0258\u0255\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0257\3\2\2\2\u0259"+
		"\67\3\2\2\2\u025a\u025e\7<\2\2\u025b\u025c\7\u0087\2\2\u025c\u025d\7\u00c2"+
		"\2\2\u025d\u025f\7k\2\2\u025e\u025b\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"\u0260\3\2\2\2\u0260\u0262\5\u00e8u\2\u0261\u0263\5J&\2\u0262\u0261\3"+
		"\2\2\2\u0262\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\5<\37\2\u0265"+
		"9\3\2\2\2\u0266\u026d\7<\2\2\u0267\u0268\7\u00a7\2\2\u0268\u026e\7\u011e"+
		"\2\2\u0269\u026b\t\3\2\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026e\7\u0138\2\2\u026d\u0267\3\2\2\2\u026d\u026a"+
		"\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\7\u011c\2\2\u0270\u0272\5\u012e"+
		"\u0098\2\u0271\u0273\5J&\2\u0272\u0271\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0275\5<\37\2\u0275;\3\2\2\2\u0276\u0278\7\17\2\2"+
		"\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a"+
		"\7\u016a\2\2\u027a\u027b\5\u00b4[\2\u027b\u027c\7\u016d\2\2\u027c\u0286"+
		"\3\2\2\2\u027d\u027f\7\17\2\2\u027e\u027d\3\2\2\2\u027e\u027f\3\2\2\2"+
		"\u027f\u0280\3\2\2\2\u0280\u0286\5\u00b4[\2\u0281\u0282\7\u016a\2\2\u0282"+
		"\u0283\5> \2\u0283\u0284\7\u016d\2\2\u0284\u0286\3\2\2\2\u0285\u0277\3"+
		"\2\2\2\u0285\u027e\3\2\2\2\u0285\u0281\3\2\2\2\u0286\u0288\3\2\2\2\u0287"+
		"\u0289\5P)\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289=\3\2\2\2\u028a"+
		"\u028f\5@!\2\u028b\u028c\7\u015c\2\2\u028c\u028e\5@!\2\u028d\u028b\3\2"+
		"\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"?\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0293\5B\"\2\u0293\u0295\5d\63\2\u0294"+
		"\u0296\5f\64\2\u0295\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u029a\3\2"+
		"\2\2\u0297\u0299\5h\65\2\u0298\u0297\3\2\2\2\u0299\u029c\3\2\2\2\u029a"+
		"\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u02a0\3\2\2\2\u029c\u029a\3\2"+
		"\2\2\u029d\u029f\5D#\2\u029e\u029d\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e"+
		"\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a9\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3"+
		"\u02a4\7\67\2\2\u02a4\u02a6\5\u012e\u0098\2\u02a5\u02a3\3\2\2\2\u02a5"+
		"\u02a6\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\5F$\2\u02a8\u0292\3\2\2"+
		"\2\u02a8\u02a5\3\2\2\2\u02a9A\3\2\2\2\u02aa\u02ab\5\u012e\u0098\2\u02ab"+
		"C\3\2\2\2\u02ac\u02cd\5j\66\2\u02ad\u02af\7\u00c2\2\2\u02ae\u02ad\3\2"+
		"\2\2\u02ae\u02af\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02cd\7\u00c4\2\2\u02b1"+
		"\u02b2\7\u00da\2\2\u02b2\u02cd\7\u009f\2\2\u02b3\u02cd\7\u012c\2\2\u02b4"+
		"\u02b5\7\u00e4\2\2\u02b5\u02b6\5\u00e8u\2\u02b6\u02b7\7\u016a\2\2\u02b7"+
		"\u02b8\5\u012e\u0098\2\u02b8\u02bc\7\u016d\2\2\u02b9\u02bb\5H%\2\u02ba"+
		"\u02b9\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2"+
		"\2\2\u02bd\u02cd\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c0\7\u0086\2\2\u02c0"+
		"\u02c1\7\u016a\2\2\u02c1\u02c6\7\u0176\2\2\u02c2\u02c3\7\u015c\2\2\u02c3"+
		"\u02c5\7\u0176\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4"+
		"\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9"+
		"\u02cd\7\u016d\2\2\u02ca\u02cd\7\23\2\2\u02cb\u02cd\7b\2\2\u02cc\u02ac"+
		"\3\2\2\2\u02cc\u02ae\3\2\2\2\u02cc\u02b1\3\2\2\2\u02cc\u02b3\3\2\2\2\u02cc"+
		"\u02b4\3\2\2\2\u02cc\u02bf\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cb\3\2"+
		"\2\2\u02cdE\3\2\2\2\u02ce\u02cf\7\u00da\2\2\u02cf\u02d1\7\u009f\2\2\u02d0"+
		"\u02d2\7,\2\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\3\2"+
		"\2\2\u02d3\u02d4\7\u016a\2\2\u02d4\u02d6\5\u012e\u0098\2\u02d5\u02d7\t"+
		"\4\2\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02df\3\2\2\2\u02d8"+
		"\u02d9\7\u015c\2\2\u02d9\u02db\5\u012e\u0098\2\u02da\u02dc\t\4\2\2\u02db"+
		"\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02de\3\2\2\2\u02dd\u02d8\3\2"+
		"\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0"+
		"\u02e2\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e4\7\u016d\2\2\u02e3\u02e5"+
		"\7b\2\2\u02e4\u02e3\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u0305\3\2\2\2\u02e6"+
		"\u02e7\7u\2\2\u02e7\u02e8\7\u009f\2\2\u02e8\u02e9\7\u016a\2\2\u02e9\u02ee"+
		"\5\u012e\u0098\2\u02ea\u02eb\7\u015c\2\2\u02eb\u02ed\5\u012e\u0098\2\u02ec"+
		"\u02ea\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2"+
		"\2\2\u02ef\u02f1\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f2\7\u016d\2\2\u02f2"+
		"\u02f3\7\u00e4\2\2\u02f3\u02f4\5\u00e8u\2\u02f4\u02f5\7\u016a\2\2\u02f5"+
		"\u02fa\5\u012e\u0098\2\u02f6\u02f7\7\u015c\2\2\u02f7\u02f9\5\u012e\u0098"+
		"\2\u02f8\u02f6\3\2\2\2\u02f9\u02fc\3\2\2\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb"+
		"\3\2\2\2\u02fb\u02fd\3\2\2\2\u02fc\u02fa\3\2\2\2\u02fd\u0301\7\u016d\2"+
		"\2\u02fe\u0300\5H%\2\u02ff\u02fe\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff"+
		"\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0304"+
		"\u02ce\3\2\2\2\u0304\u02e6\3\2\2\2\u0305G\3\2\2\2\u0306\u0307\7\u00c9"+
		"\2\2\u0307\u0310\t\5\2\2\u0308\u0309\7\u00bd\2\2\u0309\u0311\7\7\2\2\u030a"+
		"\u0311\7\u00e8\2\2\u030b\u030c\7\u0101\2\2\u030c\u0311\7\u00c4\2\2\u030d"+
		"\u030e\7\u0101\2\2\u030e\u0311\7L\2\2\u030f\u0311\7#\2\2\u0310\u0308\3"+
		"\2\2\2\u0310\u030a\3\2\2\2\u0310\u030b\3\2\2\2\u0310\u030d\3\2\2\2\u0310"+
		"\u030f\3\2\2\2\u0311I\3\2\2\2\u0312\u0314\5L\'\2\u0313\u0312\3\2\2\2\u0314"+
		"\u0315\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316K\3\2\2\2"+
		"\u0317\u0318\7\u015c\2\2\u0318\u031b\5N(\2\u0319\u031b\5Z.\2\u031a\u0317"+
		"\3\2\2\2\u031a\u0319\3\2\2\2\u031bM\3\2\2\2\u031c\u031e\7\u00bd\2\2\u031d"+
		"\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\t\6"+
		"\2\2\u0320O\3\2\2\2\u0321\u0323\5R*\2\u0322\u0321\3\2\2\2\u0323\u0324"+
		"\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325Q\3\2\2\2\u0326"+
		"\u0327\7\u00c9\2\2\u0327\u0328\7\63\2\2\u0328\u0329\t\7\2\2\u0329\u0331"+
		"\7\u00f3\2\2\u032a\u0331\5T+\2\u032b\u0331\5V,\2\u032c\u0331\5X-\2\u032d"+
		"\u0331\5Z.\2\u032e\u0331\5`\61\2\u032f\u0331\5b\62\2\u0330\u0326\3\2\2"+
		"\2\u0330\u032a\3\2\2\2\u0330\u032b\3\2\2\2\u0330\u032c\3\2\2\2\u0330\u032d"+
		"\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u032f\3\2\2\2\u0331S\3\2\2\2\u0332"+
		"\u0333\7\u00fe\2\2\u0333\u0334\7=\2\2\u0334\u0345\t\b\2\2\u0335\u0336"+
		"\t\t\2\2\u0336\u0345\7\u0176\2\2\u0337\u0345\7\u00bf\2\2\u0338\u0345\t"+
		"\n\2\2\u0339\u033a\7\u0114\2\2\u033a\u033d\7\u016a\2\2\u033b\u033e\5\u012e"+
		"\u0098\2\u033c\u033e\7\u0176\2\2\u033d\u033b\3\2\2\2\u033d\u033c\3\2\2"+
		"\2\u033e\u033f\3\2\2\2\u033f\u033d\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341"+
		"\3\2\2\2\u0341\u0345\7\u016d\2\2\u0342\u0343\7\u011d\2\2\u0343\u0345\5"+
		"\u012e\u0098\2\u0344\u0332\3\2\2\2\u0344\u0335\3\2\2\2\u0344\u0337\3\2"+
		"\2\2\u0344\u0338\3\2\2\2\u0344\u0339\3\2\2\2\u0344\u0342\3\2\2\2\u0345"+
		"U\3\2\2\2\u0346\u0348\7\u008c\2\2\u0347\u0346\3\2\2\2\u0347\u0348\3\2"+
		"\2\2\u0348\u0349\3\2\2\2\u0349\u034a\7\u008a\2\2\u034a\u0368\5\u012e\u0098"+
		"\2\u034b\u034c\7\u013c\2\2\u034c\u0368\7\u00e6\2\2\u034d\u034e\7Z\2\2"+
		"\u034e\u034f\7\37\2\2\u034f\u0350\7\u0081\2\2\u0350\u0351\7\u016a\2\2"+
		"\u0351\u0356\5\u012e\u0098\2\u0352\u0353\7\u015c\2\2\u0353\u0355\5\u012e"+
		"\u0098\2\u0354\u0352\3\2\2\2\u0355\u0358\3\2\2\2\u0356\u0354\3\2\2\2\u0356"+
		"\u0357\3\2\2\2\u0357\u0359\3\2\2\2\u0358\u0356\3\2\2\2\u0359\u035a\7\u016d"+
		"\2\2\u035a\u0368\3\2\2\2\u035b\u035d\7\u00c2\2\2\u035c\u035b\3\2\2\2\u035c"+
		"\u035d\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0368\7\u00ad\2\2\u035f\u0360"+
		"\7\64\2\2\u0360\u0368\t\13\2\2\u0361\u0362\7P\2\2\u0362\u0368\7\u00ca"+
		"\2\2\u0363\u0364\7\u013c\2\2\u0364\u0365\7\u00e8\2\2\u0365\u0366\7\u00c9"+
		"\2\2\u0366\u0368\7]\2\2\u0367\u0347\3\2\2\2\u0367\u034b\3\2\2\2\u0367"+
		"\u034d\3\2\2\2\u0367\u035c\3\2\2\2\u0367\u035f\3\2\2\2\u0367\u0361\3\2"+
		"\2\2\u0367\u0363\3\2\2\2\u0368W\3\2\2\2\u0369\u036b\7\u012c\2\2\u036a"+
		"\u0369\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\7\u00da"+
		"\2\2\u036d\u036e\7\u008c\2\2\u036e\u036f\7\u016a\2\2\u036f\u0374\5\u012e"+
		"\u0098\2\u0370\u0371\7\u015c\2\2\u0371\u0373\5\u012e\u0098\2\u0372\u0370"+
		"\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2\2\2\u0375"+
		"\u0377\3\2\2\2\u0376\u0374\3\2\2\2\u0377\u0378\7\u016d\2\2\u0378\u037c"+
		"\3\2\2\2\u0379\u037a\7\u013c\2\2\u037a\u037c\7D\2\2\u037b\u036a\3\2\2"+
		"\2\u037b\u0379\3\2\2\2\u037cY\3\2\2\2\u037d\u0382\5\\/\2\u037e\u037f\7"+
		"\u0115\2\2\u037f\u0380\7\17\2\2\u0380\u0382\5\u012e\u0098\2\u0381\u037d"+
		"\3\2\2\2\u0381\u037e\3\2\2\2\u0382[\3\2\2\2\u0383\u0384\7\u00f2\2\2\u0384"+
		"\u0385\7v\2\2\u0385\u0389\7R\2\2\u0386\u0388\5^\60\2\u0387\u0386\3\2\2"+
		"\2\u0388\u038b\3\2\2\2\u0389\u0387\3\2\2\2\u0389\u038a\3\2\2\2\u038a]"+
		"\3\2\2\2\u038b\u0389\3\2\2\2\u038c\u038d\7p\2\2\u038d\u038e\7\u011f\2"+
		"\2\u038e\u038f\7\37\2\2\u038f\u0393\5\u0106\u0084\2\u0390\u0391\7e\2\2"+
		"\u0391\u0392\7\37\2\2\u0392\u0394\5\u0106\u0084\2\u0393\u0390\3\2\2\2"+
		"\u0393\u0394\3\2\2\2\u0394\u03a8\3\2\2\2\u0395\u0396\7/\2\2\u0396\u0397"+
		"\7\u009c\2\2\u0397\u0398\7\u011f\2\2\u0398\u0399\7\37\2\2\u0399\u03a8"+
		"\5\u0106\u0084\2\u039a\u039b\7\u00b0\2\2\u039b\u039c\7\u00a0\2\2\u039c"+
		"\u039d\7\u011f\2\2\u039d\u039e\7\37\2\2\u039e\u03a8\5\u0106\u0084\2\u039f"+
		"\u03a0\7\u00a6\2\2\u03a0\u03a1\7\u011f\2\2\u03a1\u03a2\7\37\2\2\u03a2"+
		"\u03a8\5\u0106\u0084\2\u03a3\u03a4\7\u00c4\2\2\u03a4\u03a5\7N\2\2\u03a5"+
		"\u03a6\7\17\2\2\u03a6\u03a8\5\u0106\u0084\2\u03a7\u038c\3\2\2\2\u03a7"+
		"\u0395\3\2\2\2\u03a7\u039a\3\2\2\2\u03a7\u039f\3\2\2\2\u03a7\u03a3\3\2"+
		"\2\2\u03a8_\3\2\2\2\u03a9\u03aa\7\u00c9\2\2\u03aa\u03ae\5\u012e\u0098"+
		"\2\u03ab\u03ac\7\u0120\2\2\u03ac\u03ae\5\u012e\u0098\2\u03ad\u03a9\3\2"+
		"\2\2\u03ad\u03ab\3\2\2\2\u03aea\3\2\2\2\u03af\u03b1\7\23\2\2\u03b0\u03b2"+
		"\7\u0160\2\2\u03b1\u03b0\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\3\2\2"+
		"\2\u03b3\u03cb\5\u0106\u0084\2\u03b4\u03b6\7\61\2\2\u03b5\u03b7\7\u0160"+
		"\2\2\u03b6\u03b5\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b8\3\2\2\2\u03b8"+
		"\u03cb\5\u0106\u0084\2\u03b9\u03bb\7L\2\2\u03ba\u03b9\3\2\2\2\u03ba\u03bb"+
		"\3\2\2\2\u03bb\u03bf\3\2\2\2\u03bc\u03bd\7(\2\2\u03bd\u03c0\7\u0101\2"+
		"\2\u03be\u03c0\7)\2\2\u03bf\u03bc\3\2\2\2\u03bf\u03be\3\2\2\2\u03c0\u03c2"+
		"\3\2\2\2\u03c1\u03c3\7\u0160\2\2\u03c2\u03c1\3\2\2\2\u03c2\u03c3\3\2\2"+
		"\2\u03c3\u03c4\3\2\2\2\u03c4\u03cb\5\u0106\u0084\2\u03c5\u03c7\7d\2\2"+
		"\u03c6\u03c8\7\u0160\2\2\u03c7\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8"+
		"\u03c9\3\2\2\2\u03c9\u03cb\5\u0106\u0084\2\u03ca\u03af\3\2\2\2\u03ca\u03b4"+
		"\3\2\2\2\u03ca\u03ba\3\2\2\2\u03ca\u03c5\3\2\2\2\u03cbc\3\2\2\2\u03cc"+
		"\u03fb\7\'\2\2\u03cd\u03fb\7\30\2\2\u03ce\u03fb\7\31\2\2\u03cf\u03fb\7"+
		"\32\2\2\u03d0\u03fb\7\33\2\2\u03d1\u03fb\7\34\2\2\u03d2\u03fb\7E\2\2\u03d3"+
		"\u03fb\7F\2\2\u03d4\u03fb\7I\2\2\u03d5\u03fb\7J\2\2\u03d6\u03d8\7\\\2"+
		"\2\u03d7\u03d9\7\u00d8\2\2\u03d8\u03d7\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9"+
		"\u03fb\3\2\2\2\u03da\u03fb\7s\2\2\u03db\u03fb\7\u0091\2\2\u03dc\u03fb"+
		"\7\u0092\2\2\u03dd\u03fb\7\u0093\2\2\u03de\u03fb\7\u0094\2\2\u03df\u03fb"+
		"\7\u0095\2\2\u03e0\u03fb\7\u00ba\2\2\u03e1\u03fb\7\u00bc\2\2\u03e2\u03fb"+
		"\7\u00c6\2\2\u03e3\u03fb\7\u00c5\2\2\u03e4\u03fb\7\u00d7\2\2\u03e5\u03fb"+
		"\7\u00e3\2\2\u03e6\u03e7\7\u00ea\2\2\u03e7\u03fb\7\u0136\2\2\u03e8\u03fb"+
		"\7\u0108\2\2\u03e9\u03fb\7\u0107\2\2\u03ea\u03fb\7\u0109\2\2\u03eb\u03fb"+
		"\7\u010b\2\2\u03ec\u03fb\7\u010a\2\2\u03ed\u03fb\7\u0116\2\2\u03ee\u03fb"+
		"\7\u011b\2\2\u03ef\u03fb\7\u0122\2\2\u03f0\u03fb\7\u0123\2\2\u03f1\u03fb"+
		"\7\u0134\2\2\u03f2\u03fb\7\u0137\2\2\u03f3\u03fb\7\u0135\2\2\u03f4\u03fb"+
		"\7\u0140\2\2\u03f5\u03f8\5\u012e\u0098\2\u03f6\u03f7\7\5\2\2\u03f7\u03f9"+
		"\t\f\2\2\u03f8\u03f6\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb\3\2\2\2\u03fa"+
		"\u03cc\3\2\2\2\u03fa\u03cd\3\2\2\2\u03fa\u03ce\3\2\2\2\u03fa\u03cf\3\2"+
		"\2\2\u03fa\u03d0\3\2\2\2\u03fa\u03d1\3\2\2\2\u03fa\u03d2\3\2\2\2\u03fa"+
		"\u03d3\3\2\2\2\u03fa\u03d4\3\2\2\2\u03fa\u03d5\3\2\2\2\u03fa\u03d6\3\2"+
		"\2\2\u03fa\u03da\3\2\2\2\u03fa\u03db\3\2\2\2\u03fa\u03dc\3\2\2\2\u03fa"+
		"\u03dd\3\2\2\2\u03fa\u03de\3\2\2\2\u03fa\u03df\3\2\2\2\u03fa\u03e0\3\2"+
		"\2\2\u03fa\u03e1\3\2\2\2\u03fa\u03e2\3\2\2\2\u03fa\u03e3\3\2\2\2\u03fa"+
		"\u03e4\3\2\2\2\u03fa\u03e5\3\2\2\2\u03fa\u03e6\3\2\2\2\u03fa\u03e8\3\2"+
		"\2\2\u03fa\u03e9\3\2\2\2\u03fa\u03ea\3\2\2\2\u03fa\u03eb\3\2\2\2\u03fa"+
		"\u03ec\3\2\2\2\u03fa\u03ed\3\2\2\2\u03fa\u03ee\3\2\2\2\u03fa\u03ef\3\2"+
		"\2\2\u03fa\u03f0\3\2\2\2\u03fa\u03f1\3\2\2\2\u03fa\u03f2\3\2\2\2\u03fa"+
		"\u03f3\3\2\2\2\u03fa\u03f4\3\2\2\2\u03fa\u03f5\3\2\2\2\u03fbe\3\2\2\2"+
		"\u03fc\u03fd\7\u016a\2\2\u03fd\u03ff\t\r\2\2\u03fe\u0400\t\16\2\2\u03ff"+
		"\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0403\3\2\2\2\u0401\u0402\7\u015c"+
		"\2\2\u0402\u0404\7\u0176\2\2\u0403\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404"+
		"\u0405\3\2\2\2\u0405\u0406\7\u016d\2\2\u0406g\3\2\2\2\u0407\u0409\7\u00c2"+
		"\2\2\u0408\u0407\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a\3\2\2\2\u040a"+
		"\u0413\7\u00c4\2\2\u040b\u040c\7(\2\2\u040c\u040d\7\u0101\2\2\u040d\u0413"+
		"\5\u012e\u0098\2\u040e\u0410\7\u00c2\2\2\u040f\u040e\3\2\2\2\u040f\u0410"+
		"\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0413\t\17\2\2\u0412\u0408\3\2\2\2"+
		"\u0412\u040b\3\2\2\2\u0412\u040f\3\2\2\2\u0413i\3\2\2\2\u0414\u0416\7"+
		"\u015b\2\2\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0417\3\2\2\2"+
		"\u0417\u0418\7\u0160\2\2\u0418\u0421\5\u0106\u0084\2\u0419\u041b\7\u013c"+
		"\2\2\u041a\u0419\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041c\3\2\2\2\u041c"+
		"\u041e\7L\2\2\u041d\u041f\5\u0106\u0084\2\u041e\u041d\3\2\2\2\u041e\u041f"+
		"\3\2\2\2\u041f\u0421\3\2\2\2\u0420\u0415\3\2\2\2\u0420\u041a\3\2\2\2\u0421"+
		"k\3\2\2\2\u0422\u0423\7<\2\2\u0423\u0427\t\20\2\2\u0424\u0425\7\u0087"+
		"\2\2\u0425\u0426\7\u00c2\2\2\u0426\u0428\7k\2\2\u0427\u0424\3\2\2\2\u0427"+
		"\u0428\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042d\5\u0106\u0084\2\u042a\u042c"+
		"\5n8\2\u042b\u042a\3\2\2\2\u042c\u042f\3\2\2\2\u042d\u042b\3\2\2\2\u042d"+
		"\u042e\3\2\2\2\u042em\3\2\2\2\u042f\u042d\3\2\2\2\u0430\u0431\7\61\2\2"+
		"\u0431\u0435\5\u0106\u0084\2\u0432\u0433\7\u00a8\2\2\u0433\u0435\5\u0106"+
		"\u0084\2\u0434\u0430\3\2\2\2\u0434\u0432\3\2\2\2\u0435o\3\2\2\2\u0436"+
		"\u0437\5d\63\2\u0437\u0438\5\u012e\u0098\2\u0438\u043a\7\u016a\2\2\u0439"+
		"\u043b\5r:\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043c\3\2\2"+
		"\2\u043c\u043d\7\u016d\2\2\u043d\u043e\7\u016f\2\2\u043eq\3\2\2\2\u043f"+
		"\u0444\5t;\2\u0440\u0441\7\u015c\2\2\u0441\u0443\5t;\2\u0442\u0440\3\2"+
		"\2\2\u0443\u0446\3\2\2\2\u0444\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445"+
		"s\3\2\2\2\u0446\u0444\3\2\2\2\u0447\u0448\5d\63\2\u0448\u0449\5\u012e"+
		"\u0098\2\u0449u\3\2\2\2\u044a\u0452\7\13\2\2\u044b\u044e\7<\2\2\u044c"+
		"\u044d\7\u00cc\2\2\u044d\u044f\7\u00e6\2\2\u044e\u044c\3\2\2\2\u044e\u044f"+
		"\3\2\2\2\u044f\u0452\3\2\2\2\u0450\u0452\7\u00e6\2\2\u0451\u044a\3\2\2"+
		"\2\u0451\u044b\3\2\2\2\u0451\u0450\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0453"+
		"\3\2\2\2\u0453\u0454\7z\2\2\u0454\u0456\5\u012e\u0098\2\u0455\u0457\5"+
		"\u008aF\2\u0456\u0455\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u0458\3\2\2\2"+
		"\u0458\u045a\5x=\2\u0459\u045b\t\21\2\2\u045a\u0459\3\2\2\2\u045a\u045b"+
		"\3\2\2\2\u045b\u045d\3\2\2\2\u045c\u045e\5.\30\2\u045d\u045c\3\2\2\2\u045d"+
		"\u045e\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0460\5\f\7\2\u0460w\3\2\2\2"+
		"\u0461\u0462\t\22\2\2\u0462\u0464\5d\63\2\u0463\u0465\5f\64\2\u0464\u0463"+
		"\3\2\2\2\u0464\u0465\3\2\2\2\u0465y\3\2\2\2\u0466\u046e\7\13\2\2\u0467"+
		"\u046a\7<\2\2\u0468\u0469\7\u00cc\2\2\u0469\u046b\7\u00e6\2\2\u046a\u0468"+
		"\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046e\3\2\2\2\u046c\u046e\7\u00e6\2"+
		"\2\u046d\u0466\3\2\2\2\u046d\u0467\3\2\2\2\u046d\u046c\3\2\2\2\u046d\u046e"+
		"\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\7\u00d3\2\2\u0470\u0471\5\u012e"+
		"\u0098\2\u0471\u0472\t\21\2\2\u0472\u0473\5|?\2\u0473\u0477\7c\2\2\u0474"+
		"\u0475\5\u012e\u0098\2\u0475\u0476\7\u016f\2\2\u0476\u0478\3\2\2\2\u0477"+
		"\u0474\3\2\2\2\u0477\u0478\3\2\2\2\u0478{\3\2\2\2\u0479\u047a\5~@\2\u047a"+
		"\u0480\7\u016f\2\2\u047b\u047c\5~@\2\u047c\u047d\7\u016f\2\2\u047d\u047f"+
		"\3\2\2\2\u047e\u047b\3\2\2\2\u047f\u0482\3\2\2\2\u0480\u047e\3\2\2\2\u0480"+
		"\u0481\3\2\2\2\u0481}\3\2\2\2\u0482\u0480\3\2\2\2\u0483\u0491\5\60\31"+
		"\2\u0484\u0485\7z\2\2\u0485\u0487\5\u012e\u0098\2\u0486\u0488\5\u008a"+
		"F\2\u0487\u0486\3\2\2\2\u0487\u0488\3\2\2\2\u0488\u0489\3\2\2\2\u0489"+
		"\u048a\5x=\2\u048a\u0491\3\2\2\2\u048b\u048c\t\23\2\2\u048c\u048e\5\u012e"+
		"\u0098\2\u048d\u048f\5\u008aF\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2\2"+
		"\2\u048f\u0491\3\2\2\2\u0490\u0483\3\2\2\2\u0490\u0484\3\2\2\2\u0490\u048b"+
		"\3\2\2\2\u0491\177\3\2\2\2\u0492\u049a\7\13\2\2\u0493\u0496\7<\2\2\u0494"+
		"\u0495\7\u00cc\2\2\u0495\u0497\7\u00e6\2\2\u0496\u0494\3\2\2\2\u0496\u0497"+
		"\3\2\2\2\u0497\u049a\3\2\2\2\u0498\u049a\7\u00e6\2\2\u0499\u0492\3\2\2"+
		"\2\u0499\u0493\3\2\2\2\u0499\u0498\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049b"+
		"\3\2\2\2\u049b\u049c\7\u00d3\2\2\u049c\u049d\7\35\2\2\u049d\u049e\5\u012e"+
		"\u0098\2\u049e\u049f\t\21\2\2\u049f\u04a0\5\u0082B\2\u04a0\u04a4\7c\2"+
		"\2\u04a1\u04a2\5\u012e\u0098\2\u04a2\u04a3\7\u016f\2\2\u04a3\u04a5\3\2"+
		"\2\2\u04a4\u04a1\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u0081\3\2\2\2\u04a6"+
		"\u04a7\5\u0084C\2\u04a7\u04ad\7\u016f\2\2\u04a8\u04a9\5\u0084C\2\u04a9"+
		"\u04aa\7\u016f\2\2\u04aa\u04ac\3\2\2\2\u04ab\u04a8\3\2\2\2\u04ac\u04af"+
		"\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u0083\3\2\2\2\u04af"+
		"\u04ad\3\2\2\2\u04b0\u04b4\5\60\31\2\u04b1\u04b4\5v<\2\u04b2\u04b4\5\u0086"+
		"D\2\u04b3\u04b0\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b3\u04b2\3\2\2\2\u04b4"+
		"\u0085\3\2\2\2\u04b5\u04b8\7<\2\2\u04b6\u04b7\7\u00cc\2\2\u04b7\u04b9"+
		"\7\u00e6\2\2\u04b8\u04b6\3\2\2\2\u04b8\u04b9\3\2\2\2\u04b9\u04bc\3\2\2"+
		"\2\u04ba\u04bc\7\u00e6\2\2\u04bb\u04b5\3\2\2\2\u04bb\u04ba\3\2\2\2\u04bb"+
		"\u04bc\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\t\23\2\2\u04be\u04c0\5"+
		"\u012e\u0098\2\u04bf\u04c1\5\u008aF\2\u04c0\u04bf\3\2\2\2\u04c0\u04c1"+
		"\3\2\2\2\u04c1\u04c3\3\2\2\2\u04c2\u04c4\t\21\2\2\u04c3\u04c2\3\2\2\2"+
		"\u04c3\u04c4\3\2\2\2\u04c4\u04c6\3\2\2\2\u04c5\u04c7\5.\30\2\u04c6\u04c5"+
		"\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04cc\5\20\t\2"+
		"\u04c9\u04ca\5\u012e\u0098\2\u04ca\u04cb\7\u016f\2\2\u04cb\u04cd\3\2\2"+
		"\2\u04cc\u04c9\3\2\2\2\u04cc\u04cd\3\2\2\2\u04cd\u0087\3\2\2\2\u04ce\u04d1"+
		"\7<\2\2\u04cf\u04d0\7\u00cc\2\2\u04d0\u04d2\7\u00e6\2\2\u04d1\u04cf\3"+
		"\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d5\3\2\2\2\u04d3\u04d5\7\u00e6\2\2"+
		"\u04d4\u04ce\3\2\2\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6"+
		"\3\2\2\2\u04d6\u04d8\t\23\2\2\u04d7\u04d9\5\u008aF\2\u04d8\u04d7\3\2\2"+
		"\2\u04d8\u04d9\3\2\2\2\u04d9\u04db\3\2\2\2\u04da\u04dc\t\21\2\2\u04db"+
		"\u04da\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u04de\3\2\2\2\u04dd\u04df\5."+
		"\30\2\u04de\u04dd\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0"+
		"\u04e4\5\20\t\2\u04e1\u04e2\5\u012e\u0098\2\u04e2\u04e3\7\u016f\2\2\u04e3"+
		"\u04e5\3\2\2\2\u04e4\u04e1\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5\u0089\3\2"+
		"\2\2\u04e6\u04e7\7\u016a\2\2\u04e7\u04fd\7\u016d\2\2\u04e8\u04e9\7\u016a"+
		"\2\2\u04e9\u04ee\5\u008cG\2\u04ea\u04eb\7\u015c\2\2\u04eb\u04ed\5\u008c"+
		"G\2\u04ec\u04ea\3\2\2\2\u04ed\u04f0\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ee"+
		"\u04ef\3\2\2\2\u04ef\u04f1\3\2\2\2\u04f0\u04ee\3\2\2\2\u04f1\u04f2\7\u016d"+
		"\2\2\u04f2\u04fd\3\2\2\2\u04f3\u04f4\6F\4\2\u04f4\u04f9\5\u008cG\2\u04f5"+
		"\u04f6\7\u015c\2\2\u04f6\u04f8\5\u008cG\2\u04f7\u04f5\3\2\2\2\u04f8\u04fb"+
		"\3\2\2\2\u04f9\u04f7\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fd\3\2\2\2\u04fb"+
		"\u04f9\3\2\2\2\u04fc\u04e6\3\2\2\2\u04fc\u04e8\3\2\2\2\u04fc\u04f3\3\2"+
		"\2\2\u04fd\u008b\3\2\2\2\u04fe\u0504\7\u008a\2\2\u04ff\u0504\7\u00ce\2"+
		"\2\u0500\u0504\7\u008f\2\2\u0501\u0502\7\u008a\2\2\u0502\u0504\7\u00ce"+
		"\2\2\u0503\u04fe\3\2\2\2\u0503\u04ff\3\2\2\2\u0503\u0500\3\2\2\2\u0503"+
		"\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0505\3\2\2\2\u0505\u0506\5\u012e"+
		"\u0098\2\u0506\u0508\5d\63\2\u0507\u0509\5f\64\2\u0508\u0507\3\2\2\2\u0508"+
		"\u0509\3\2\2\2\u0509\u050d\3\2\2\2\u050a\u050c\5h\65\2\u050b\u050a\3\2"+
		"\2\2\u050c\u050f\3\2\2\2\u050d\u050b\3\2\2\2\u050d\u050e\3\2\2\2\u050e"+
		"\u0511\3\2\2\2\u050f\u050d\3\2\2\2\u0510\u0512\5j\66\2\u0511\u0510\3\2"+
		"\2\2\u0511\u0512\3\2\2\2\u0512\u0529\3\2\2\2\u0513\u0519\5\u012e\u0098"+
		"\2\u0514\u051a\7\u008a\2\2\u0515\u051a\7\u00ce\2\2\u0516\u051a\7\u008f"+
		"\2\2\u0517\u0518\7\u008a\2\2\u0518\u051a\7\u00ce\2\2\u0519\u0514\3\2\2"+
		"\2\u0519\u0515\3\2\2\2\u0519\u0516\3\2\2\2\u0519\u0517\3\2\2\2\u0519\u051a"+
		"\3\2\2\2\u051a\u051b\3\2\2\2\u051b\u051d\5d\63\2\u051c\u051e\5f\64\2\u051d"+
		"\u051c\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u0522\3\2\2\2\u051f\u0521\5h"+
		"\65\2\u0520\u051f\3\2\2\2\u0521\u0524\3\2\2\2\u0522\u0520\3\2\2\2\u0522"+
		"\u0523\3\2\2\2\u0523\u0526\3\2\2\2\u0524\u0522\3\2\2\2\u0525\u0527\5j"+
		"\66\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0529\3\2\2\2\u0528"+
		"\u0503\3\2\2\2\u0528\u0513\3\2\2\2\u0529\u008d\3\2\2\2\u052a\u052c\t\24"+
		"\2\2\u052b\u052d\7\u0089\2\2\u052c\u052b\3\2\2\2\u052c\u052d\3\2\2\2\u052d"+
		"\u052e\3\2\2\2\u052e\u0534\5\u0106\u0084\2\u052f\u0530\7\u016a\2\2\u0530"+
		"\u0531\5\u0124\u0093\2\u0531\u0532\7\u016d\2\2\u0532\u0535\3\2\2\2\u0533"+
		"\u0535\5\u0124\u0093\2\u0534\u052f\3\2\2\2\u0534\u0533\3\2\2\2\u0534\u0535"+
		"\3\2\2\2\u0535\u053f\3\2\2\2\u0536\u0537\7\u0098\2\2\u0537\u053c\7\u0171"+
		"\2\2\u0538\u0539\7\u015c\2\2\u0539\u053b\7\u0171\2\2\u053a\u0538\3\2\2"+
		"\2\u053b\u053e\3\2\2\2\u053c\u053a\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u0540"+
		"\3\2\2\2\u053e\u053c\3\2\2\2\u053f\u0536\3\2\2\2\u053f\u0540\3\2\2\2\u0540"+
		"\u008f\3\2\2\2\u0541\u0545\5\u0096L\2\u0542\u0545\5\u009aN\2\u0543\u0545"+
		"\5\u009eP\2\u0544\u0541\3\2\2\2\u0544\u0542\3\2\2\2\u0544\u0543\3\2\2"+
		"\2\u0545\u0091\3\2\2\2\u0546\u0547\7\u0087\2\2\u0547\u0548\7\u016a\2\2"+
		"\u0548\u0549\5\u00f6|\2\u0549\u054a\7\u016d\2\2\u054a\u054b\7\u0169\2"+
		"\2\u054b\u054c\5\4\3\2\u054c\u054d\7\u016c\2\2\u054d\u0093\3\2\2\2\u054e"+
		"\u0552\5\u0098M\2\u054f\u0552\5\u009cO\2\u0550\u0552\5\u00a0Q\2\u0551"+
		"\u054e\3\2\2\2\u0551\u054f\3\2\2\2\u0551\u0550\3\2\2\2\u0552\u0095\3\2"+
		"\2\2\u0553\u0554\7\u0087\2\2\u0554\u0555\5\u00f6|\2\u0555\u0556\7\u0121"+
		"\2\2\u0556\u055a\5\4\3\2\u0557\u0559\5\u00a2R\2\u0558\u0557\3\2\2\2\u0559"+
		"\u055c\3\2\2\2\u055a\u0558\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055e\3\2"+
		"\2\2\u055c\u055a\3\2\2\2\u055d\u055f\5\u00a4S\2\u055e\u055d\3\2\2\2\u055e"+
		"\u055f\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0561\7c\2\2\u0561\u0562\7\u0087"+
		"\2\2\u0562\u0097\3\2\2\2\u0563\u0564\7\u0087\2\2\u0564\u0565\7\u0121\2"+
		"\2\u0565\u0569\5\4\3\2\u0566\u0568\5\u00a2R\2\u0567\u0566\3\2\2\2\u0568"+
		"\u056b\3\2\2\2\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056d\3\2"+
		"\2\2\u056b\u0569\3\2\2\2\u056c\u056e\5\u00a4S\2\u056d\u056c\3\2\2\2\u056d"+
		"\u056e\3\2\2\2\u056e\u056f\3\2\2\2\u056f\u0570\7c\2\2\u0570\u0571\7\u0087"+
		"\2\2\u0571\u0099\3\2\2\2\u0572\u0573\7\u0087\2\2\u0573\u0574\5\u00f6|"+
		"\2\u0574\u0577\5\f\7\2\u0575\u0576\7_\2\2\u0576\u0578\5\f\7\2\u0577\u0575"+
		"\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u009b\3\2\2\2\u0579\u057a\7\u0087\2"+
		"\2\u057a\u057d\5\f\7\2\u057b\u057c\7_\2\2\u057c\u057e\5\f\7\2\u057d\u057b"+
		"\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u009d\3\2\2\2\u057f\u0580\7\6\2\2\u0580"+
		"\u0581\7\u0087\2\2\u0581\u0582\5\u00f6|\2\u0582\u0583\7\u0121\2\2\u0583"+
		"\u0584\5\f\7\2\u0584\u009f\3\2\2\2\u0585\u0586\7\6\2\2\u0586\u0587\7\u0087"+
		"\2\2\u0587\u0588\7\u0121\2\2\u0588\u0589\5\f\7\2\u0589\u00a1\3\2\2\2\u058a"+
		"\u058b\t\25\2\2\u058b\u058c\5\u00f6|\2\u058c\u058d\7\u0121\2\2\u058d\u058e"+
		"\5\4\3\2\u058e\u00a3\3\2\2\2\u058f\u0590\7_\2\2\u0590\u0591\5\4\3\2\u0591"+
		"\u00a5\3\2\2\2\u0592\u0594\7<\2\2\u0593\u0595\7\u012c\2\2\u0594\u0593"+
		"\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0596\3\2\2\2\u0596\u0597\7\u008c\2"+
		"\2\u0597\u0598\5\u012e\u0098\2\u0598\u0599\7\u00c9\2\2\u0599\u059a\5\u00e8"+
		"u\2\u059a\u059b\7\u016a\2\2\u059b\u05a0\5\u00aaV\2\u059c\u059d\7\u015c"+
		"\2\2\u059d\u059f\5\u00aaV\2\u059e\u059c\3\2\2\2\u059f\u05a2\3\2\2\2\u05a0"+
		"\u059e\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a3\3\2\2\2\u05a2\u05a0\3\2"+
		"\2\2\u05a3\u05a4\7\u016d\2\2\u05a4\u00a7\3\2\2\2\u05a5\u05a7\7<\2\2\u05a6"+
		"\u05a8\7\u012c\2\2\u05a7\u05a6\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05a9"+
		"\3\2\2\2\u05a9\u05aa\7\u016a\2\2\u05aa\u05af\5\u00aaV\2\u05ab\u05ac\7"+
		"\u015c\2\2\u05ac\u05ae\5\u00aaV\2\u05ad\u05ab\3\2\2\2\u05ae\u05b1\3\2"+
		"\2\2\u05af\u05ad\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b2\3\2\2\2\u05b1"+
		"\u05af\3\2\2\2\u05b2\u05b3\7\u016d\2\2\u05b3\u00a9\3\2\2\2\u05b4\u05b6"+
		"\5\u012e\u0098\2\u05b5\u05b7\t\4\2\2\u05b6\u05b5\3\2\2\2\u05b6\u05b7\3"+
		"\2\2\2\u05b7\u00ab\3\2\2\2\u05b8\u05ba\7\u00eb\2\2\u05b9\u05bb\5\u0106"+
		"\u0084\2\u05ba\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u00ad\3\2\2\2\u05bc"+
		"\u05bd\7t\2\2\u05bd\u05be\7\u0171\2\2\u05be\u05c0\7\u008a\2\2\u05bf\u05c1"+
		"\7\u00ed\2\2\u05c0\u05bf\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1\u05c2\3\2\2"+
		"\2\u05c2\u05c3\5\u0106\u0084\2\u05c3\u05c4\7\u015f\2\2\u05c4\u05c7\5\u0106"+
		"\u0084\2\u05c5\u05c6\t\26\2\2\u05c6\u05c8\5\u0106\u0084\2\u05c7\u05c5"+
		"\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca\7\u00af\2"+
		"\2\u05ca\u05cb\5\4\3\2\u05cb\u05cc\7c\2\2\u05cc\u05cd\7\u00af\2\2\u05cd"+
		"\u00af\3\2\2\2\u05ce\u05cf\7t\2\2\u05cf\u05d0\7\u016a\2\2\u05d0\u05d1"+
		"\5\u0106\u0084\2\u05d1\u05d2\7\u0160\2\2\u05d2\u05d3\5\u0106\u0084\2\u05d3"+
		"\u05d4\7\u016f\2\2\u05d4\u05d6\5\u0106\u0084\2\u05d5\u05d7\7\u0167\2\2"+
		"\u05d6\u05d5\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d9\3\2\2\2\u05d8\u05da"+
		"\7\u0166\2\2\u05d9\u05d8\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05dc\3\2\2"+
		"\2\u05db\u05dd\7\u0165\2\2\u05dc\u05db\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd"+
		"\u05df\3\2\2\2\u05de\u05e0\7\u0164\2\2\u05df\u05de\3\2\2\2\u05df\u05e0"+
		"\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e2\5\u0106\u0084\2\u05e2\u05e3\7"+
		"\u016f\2\2\u05e3\u05e4\5\u0106\u0084\2\u05e4\u05e5\7\u015a\2\2\u05e5\u05e6"+
		"\7\u015a\2\2\u05e6\u05e7\7\u016d\2\2\u05e7\u05e8\7\u0169\2\2\u05e8\u05ec"+
		"\5\22\n\2\u05e9\u05eb\5\22\n\2\u05ea\u05e9\3\2\2\2\u05eb\u05ee\3\2\2\2"+
		"\u05ec\u05ea\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ef\3\2\2\2\u05ee\u05ec"+
		"\3\2\2\2\u05ef\u05f0\7\u016c\2\2\u05f0\u00b1\3\2\2\2\u05f1\u05f2\7t\2"+
		"\2\u05f2\u05f3\7\u0171\2\2\u05f3\u05f5\7\u008a\2\2\u05f4\u05f6\7\u00ed"+
		"\2\2\u05f5\u05f4\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7"+
		"\u05f8\5\u0106\u0084\2\u05f8\u05f9\7\u015f\2\2\u05f9\u05fc\5\u0106\u0084"+
		"\2\u05fa\u05fb\t\26\2\2\u05fb\u05fd\5\u0106\u0084\2\u05fc\u05fa\3\2\2"+
		"\2\u05fc\u05fd\3\2\2\2\u05fd\u05fe\3\2\2\2\u05fe\u05ff\5\4\3\2\u05ff\u0600"+
		"\7c\2\2\u0600\u0601\7\u00af\2\2\u0601\u0624\3\2\2\2\u0602\u0603\7t\2\2"+
		"\u0603\u0604\7\u0171\2\2\u0604\u0606\7\u008a\2\2\u0605\u0607\7\u00ed\2"+
		"\2\u0606\u0605\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u0609"+
		"\5\u0106\u0084\2\u0609\u060a\7\u015f\2\2\u060a\u060d\5\u0106\u0084\2\u060b"+
		"\u060c\t\26\2\2\u060c\u060e\5\u0106\u0084\2\u060d\u060b\3\2\2\2\u060d"+
		"\u060e\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u0610\7\u00af\2\2\u0610\u0611"+
		"\5\4\3\2\u0611\u0624\3\2\2\2\u0612\u0613\7t\2\2\u0613\u0614\7\u0171\2"+
		"\2\u0614\u0616\7\u008a\2\2\u0615\u0617\7\u00ed\2\2\u0616\u0615\3\2\2\2"+
		"\u0616\u0617\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u0619\5\u0106\u0084\2\u0619"+
		"\u061a\7\u015f\2\2\u061a\u061d\5\u0106\u0084\2\u061b\u061c\t\26\2\2\u061c"+
		"\u061e\5\u0106\u0084\2\u061d\u061b\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u061f"+
		"\3\2\2\2\u061f\u0620\7\u00af\2\2\u0620\u0621\7c\2\2\u0621\u0622\7\u00af"+
		"\2\2\u0622\u0624\3\2\2\2\u0623\u05f1\3\2\2\2\u0623\u0602\3\2\2\2\u0623"+
		"\u0612\3\2\2\2\u0624\u00b3\3\2\2\2\u0625\u0627\5\u00b6\\\2\u0626\u0625"+
		"\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u0628\3\2\2\2\u0628\u0629\5\u00bc_"+
		"\2\u0629\u00b5\3\2\2\2\u062a\u062b\7\u013c\2\2\u062b\u0630\5\u00b8]\2"+
		"\u062c\u062d\7\u015c\2\2\u062d\u062f\5\u00b8]\2\u062e\u062c\3\2\2\2\u062f"+
		"\u0632\3\2\2\2\u0630\u062e\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u00b7\3\2"+
		"\2\2\u0632\u0630\3\2\2\2\u0633\u0635\5\u012e\u0098\2\u0634\u0636\5\u00ba"+
		"^\2\u0635\u0634\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0637\3\2\2\2\u0637"+
		"\u0638\7\17\2\2\u0638\u0639\7\u016a\2\2\u0639\u063a\5\u00bc_\2\u063a\u063b"+
		"\7\u016d\2\2\u063b\u00b9\3\2\2\2\u063c\u063d\7\u016a\2\2\u063d\u0642\5"+
		"\u012e\u0098\2\u063e\u063f\7\u015c\2\2\u063f\u0641\5\u012e\u0098\2\u0640"+
		"\u063e\3\2\2\2\u0641\u0644\3\2\2\2\u0642\u0640\3\2\2\2\u0642\u0643\3\2"+
		"\2\2\u0643\u0645\3\2\2\2\u0644\u0642\3\2\2\2\u0645\u0646\7\u016d\2\2\u0646"+
		"\u00bb\3\2\2\2\u0647\u064d\5\u00be`\2\u0648\u0649\5\u00c0a\2\u0649\u064a"+
		"\5\u00be`\2\u064a\u064c\3\2\2\2\u064b\u0648\3\2\2\2\u064c\u064f\3\2\2"+
		"\2\u064d\u064b\3\2\2\2\u064d\u064e\3\2\2\2\u064e\u00bd\3\2\2\2\u064f\u064d"+
		"\3\2\2\2\u0650\u0656\5\u00c2b\2\u0651\u0652\7\u016a\2\2\u0652\u0653\5"+
		"\u00bc_\2\u0653\u0654\7\u016d\2\2\u0654\u0656\3\2\2\2\u0655\u0650\3\2"+
		"\2\2\u0655\u0651\3\2\2\2\u0656\u00bf\3\2\2\2\u0657\u0659\7\u012b\2\2\u0658"+
		"\u065a\7\t\2\2\u0659\u0658\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u0664\3\2"+
		"\2\2\u065b\u065d\7f\2\2\u065c\u065e\7\t\2\2\u065d\u065c\3\2\2\2\u065d"+
		"\u065e\3\2\2\2\u065e\u0664\3\2\2\2\u065f\u0661\7\u0096\2\2\u0660\u0662"+
		"\7\t\2\2\u0661\u0660\3\2\2\2\u0661\u0662\3\2\2\2\u0662\u0664\3\2\2\2\u0663"+
		"\u0657\3\2\2\2\u0663\u065b\3\2\2\2\u0663\u065f\3\2\2\2\u0664\u00c1\3\2"+
		"\2\2\u0665\u0666\t\27\2\2\u0666\u0668\5\u00c6d\2\u0667\u0669\5\u00d2j"+
		"\2\u0668\u0667\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a\3\2\2\2\u066a\u066c"+
		"\5\u00d4k\2\u066b\u066d\5\u00eav\2\u066c\u066b\3\2\2\2\u066c\u066d\3\2"+
		"\2\2\u066d\u066f\3\2\2\2\u066e\u0670\5\u00eex\2\u066f\u066e\3\2\2\2\u066f"+
		"\u0670\3\2\2\2\u0670\u0673\3\2\2\2\u0671\u0674\5\u00f0y\2\u0672\u0674"+
		"\5\u00f2z\2\u0673\u0671\3\2\2\2\u0673\u0672\3\2\2\2\u0673\u0674\3\2\2"+
		"\2\u0674\u0676\3\2\2\2\u0675\u0677\5\u00f4{\2\u0676\u0675\3\2\2\2\u0676"+
		"\u0677\3\2\2\2\u0677\u00c3\3\2\2\2\u0678\u0679\t\27\2\2\u0679\u067b\5"+
		"\u00c6d\2\u067a\u067c\5\u00d2j\2\u067b\u067a\3\2\2\2\u067b\u067c\3\2\2"+
		"\2\u067c\u067e\3\2\2\2\u067d\u067f\5\u00eav\2\u067e\u067d\3\2\2\2\u067e"+
		"\u067f\3\2\2\2\u067f\u0681\3\2\2\2\u0680\u0682\5\u00eex\2\u0681\u0680"+
		"\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0685\3\2\2\2\u0683\u0686\5\u00f0y"+
		"\2\u0684\u0686\5\u00f2z\2\u0685\u0683\3\2\2\2\u0685\u0684\3\2\2\2\u0685"+
		"\u0686\3\2\2\2\u0686\u0688\3\2\2\2\u0687\u0689\5\u00f4{\2\u0688\u0687"+
		"\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068c\3\2\2\2\u068a\u068c\5\u00d6l"+
		"\2\u068b\u0678\3\2\2\2\u068b\u068a\3\2\2\2\u068c\u00c5\3\2\2\2\u068d\u068f"+
		"\5\u00c8e\2\u068e\u068d\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0691\3\2\2"+
		"\2\u0690\u0692\5\u00caf\2\u0691\u0690\3\2\2\2\u0691\u0692\3\2\2\2\u0692"+
		"\u0693\3\2\2\2\u0693\u0698\5\u00ccg\2\u0694\u0695\7\u015c\2\2\u0695\u0697"+
		"\5\u00ccg\2\u0696\u0694\3\2\2\2\u0697\u069a\3\2\2\2\u0698\u0696\3\2\2"+
		"\2\u0698\u0699\3\2\2\2\u0699\u00c7\3\2\2\2\u069a\u0698\3\2\2\2\u069b\u069c"+
		"\t\30\2\2\u069c\u00c9\3\2\2\2\u069d\u069e\7\u0126\2\2\u069e\u069f\5\u0106"+
		"\u0084\2\u069f\u00cb\3\2\2\2\u06a0\u06a1\5\u012e\u0098\2\u06a1\u06a2\7"+
		"\u0160\2\2\u06a2\u06a4\3\2\2\2\u06a3\u06a0\3\2\2\2\u06a3\u06a4\3\2\2\2"+
		"\u06a4\u06a5\3\2\2\2\u06a5\u06a7\5\u0106\u0084\2\u06a6\u06a8\5\u00ceh"+
		"\2\u06a7\u06a6\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06ab\3\2\2\2\u06a9\u06ab"+
		"\5\u00d0i\2\u06aa\u06a3\3\2\2\2\u06aa\u06a9\3\2\2\2\u06ab\u00cd\3\2\2"+
		"\2\u06ac\u06ae\6h\5\2\u06ad\u06af\7\17\2\2\u06ae\u06ad\3\2\2\2\u06ae\u06af"+
		"\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0\u06b6\5\u012e\u0098\2\u06b1\u06b2\7"+
		"\u016a\2\2\u06b2\u06b3\7\u0124\2\2\u06b3\u06b4\7\u0172\2\2\u06b4\u06b6"+
		"\7\u016d\2\2\u06b5\u06ac\3\2\2\2\u06b5\u06b1\3\2\2\2\u06b6\u00cf\3\2\2"+
		"\2\u06b7\u06b8\7\u0171\2\2\u06b8\u06ba\7\6\2\2\u06b9\u06b7\3\2\2\2\u06b9"+
		"\u06ba\3\2\2\2\u06ba\u06bb\3\2\2\2\u06bb\u06bc\7\u0168\2\2\u06bc\u00d1"+
		"\3\2\2\2\u06bd\u06be\7\u0098\2\2\u06be\u06c3\5\u012e\u0098\2\u06bf\u06c0"+
		"\7\u015c\2\2\u06c0\u06c2\5\u012e\u0098\2\u06c1\u06bf\3\2\2\2\u06c2\u06c5"+
		"\3\2\2\2\u06c3\u06c1\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u00d3\3\2\2\2\u06c5"+
		"\u06c3\3\2\2\2\u06c6\u06c7\7x\2\2\u06c7\u06cb\5\u00d8m\2\u06c8\u06ca\5"+
		"\u00dep\2\u06c9\u06c8\3\2\2\2\u06ca\u06cd\3\2\2\2\u06cb\u06c9\3\2\2\2"+
		"\u06cb\u06cc\3\2\2\2\u06cc\u00d5\3\2\2\2\u06cd\u06cb\3\2\2\2\u06ce\u06d2"+
		"\7x\2\2\u06cf\u06d1\5\u00dep\2\u06d0\u06cf\3\2\2\2\u06d1\u06d4\3\2\2\2"+
		"\u06d2\u06d0\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u00d7\3\2\2\2\u06d4\u06d2"+
		"\3\2\2\2\u06d5\u06d9\5\u00dan\2\u06d6\u06d9\5\u00dco\2\u06d7\u06d9\5\u00e2"+
		"r\2\u06d8\u06d5\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d8\u06d7\3\2\2\2\u06d9"+
		"\u00d9\3\2\2\2\u06da\u06dc\5\u00e8u\2\u06db\u06dd\5\u00e6t\2\u06dc\u06db"+
		"\3\2\2\2\u06dc\u06dd\3\2\2\2\u06dd\u00db\3\2\2\2\u06de\u06df\7\u016a\2"+
		"\2\u06df\u06e0\5\u00b4[\2\u06e0\u06e2\7\u016d\2\2\u06e1\u06e3\5\u00e6"+
		"t\2\u06e2\u06e1\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u00dd\3\2\2\2\u06e4"+
		"\u06e5\7\u015c\2\2\u06e5\u06ec\5\u00d8m\2\u06e6\u06e7\5\u00e0q\2\u06e7"+
		"\u06e8\5\u00d8m\2\u06e8\u06e9\7\u00c9\2\2\u06e9\u06ea\5\u00f6|\2\u06ea"+
		"\u06ec\3\2\2\2\u06eb\u06e4\3\2\2\2\u06eb\u06e6\3\2\2\2\u06ec\u00df\3\2"+
		"\2\2\u06ed\u06ef\7\u008e\2\2\u06ee\u06ed\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef"+
		"\u06f0\3\2\2\2\u06f0\u06f7\7\u009d\2\2\u06f1\u06f3\t\31\2\2\u06f2\u06f4"+
		"\7\u00cf\2\2\u06f3\u06f2\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06f5\3\2\2"+
		"\2\u06f5\u06f7\7\u009d\2\2\u06f6\u06ee\3\2\2\2\u06f6\u06f1\3\2\2\2\u06f7"+
		"\u00e1\3\2\2\2\u06f8\u06f9\7\u011c\2\2\u06f9\u06fa\7\u016a\2\2\u06fa\u06fb"+
		"\7\u0132\2\2\u06fb\u0700\5\u00e4s\2\u06fc\u06fd\7\u015c\2\2\u06fd\u06ff"+
		"\5\u00e4s\2\u06fe\u06fc\3\2\2\2\u06ff\u0702\3\2\2\2\u0700\u06fe\3\2\2"+
		"\2\u0700\u0701\3\2\2\2\u0701\u0703\3\2\2\2\u0702\u0700\3\2\2\2\u0703\u0705"+
		"\7\u016d\2\2\u0704\u0706\5\u00e6t\2\u0705\u0704\3\2\2\2\u0705\u0706\3"+
		"\2\2\2\u0706\u00e3\3\2\2\2\u0707\u0714\5\u0106\u0084\2\u0708\u0709\7\u016a"+
		"\2\2\u0709\u070e\5\u0106\u0084\2\u070a\u070b\7\u015c\2\2\u070b\u070d\5"+
		"\u0106\u0084\2\u070c\u070a\3\2\2\2\u070d\u0710\3\2\2\2\u070e\u070c\3\2"+
		"\2\2\u070e\u070f\3\2\2\2\u070f\u0711\3\2\2\2\u0710\u070e\3\2\2\2\u0711"+
		"\u0712\7\u016d\2\2\u0712\u0714\3\2\2\2\u0713\u0707\3\2\2\2\u0713\u0708"+
		"\3\2\2\2\u0714\u00e5\3\2\2\2\u0715\u0717\6t\6\2\u0716\u0718\7\17\2\2\u0717"+
		"\u0716\3\2\2\2\u0717\u0718\3\2\2\2\u0718\u0719\3\2\2\2\u0719\u0724\5\u012e"+
		"\u0098\2\u071a\u071b\7\u016a\2\2\u071b\u0720\7\u0171\2\2\u071c\u071d\7"+
		"\u015c\2\2\u071d\u071f\7\u0171\2\2\u071e\u071c\3\2\2\2\u071f\u0722\3\2"+
		"\2\2\u0720\u071e\3\2\2\2\u0720\u0721\3\2\2\2\u0721\u0723\3\2\2\2\u0722"+
		"\u0720\3\2\2\2\u0723\u0725\7\u016d\2\2\u0724\u071a\3\2\2\2\u0724\u0725"+
		"\3\2\2\2\u0725\u00e7\3\2\2\2\u0726\u0727\5\u012e\u0098\2\u0727\u00e9\3"+
		"\2\2\2\u0728\u0729\7\u013a\2\2\u0729\u072a\5\u00f6|\2\u072a\u00eb\3\2"+
		"\2\2\u072b\u072c\7\u013a\2\2\u072c\u00ed\3\2\2\2\u072d\u072e\7\177\2\2"+
		"\u072e\u072f\7\37\2\2\u072f\u0734\5\u0106\u0084\2\u0730\u0731\7\u015c"+
		"\2\2\u0731\u0733\5\u0106\u0084\2\u0732\u0730\3\2\2\2\u0733\u0736\3\2\2"+
		"\2\u0734\u0732\3\2\2\2\u0734\u0735\3\2\2\2\u0735\u00ef\3\2\2\2\u0736\u0734"+
		"\3\2\2\2\u0737\u0738\7\u0082\2\2\u0738\u0739\5\u00f6|\2\u0739\u00f1\3"+
		"\2\2\2\u073a\u073b\7\u00de\2\2\u073b\u073c\5\u00f6|\2\u073c\u00f3\3\2"+
		"\2\2\u073d\u073e\7\u00cd\2\2\u073e\u073f\7\37\2\2\u073f\u0741\5\u0106"+
		"\u0084\2\u0740\u0742\t\4\2\2\u0741\u0740\3\2\2\2\u0741\u0742\3\2\2\2\u0742"+
		"\u074a\3\2\2\2\u0743\u0744\7\u015c\2\2\u0744\u0746\5\u0106\u0084\2\u0745"+
		"\u0747\t\4\2\2\u0746\u0745\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u0749\3\2"+
		"\2\2\u0748\u0743\3\2\2\2\u0749\u074c\3\2\2\2\u074a\u0748\3\2\2\2\u074a"+
		"\u074b\3\2\2\2\u074b\u00f5\3\2\2\2\u074c\u074a\3\2\2\2\u074d\u074f\b|"+
		"\1\2\u074e\u0750\7\u00c2\2\2\u074f\u074e\3\2\2\2\u074f\u0750\3\2\2\2\u0750"+
		"\u0751\3\2\2\2\u0751\u0752\7\u016a\2\2\u0752\u0753\5\u00f6|\2\u0753\u0754"+
		"\7\u016d\2\2\u0754\u0757\3\2\2\2\u0755\u0757\5\u00f8}\2\u0756\u074d\3"+
		"\2\2\2\u0756\u0755\3\2\2\2\u0757\u075e\3\2\2\2\u0758\u0759\f\4\2\2\u0759"+
		"\u075a\5\u0102\u0082\2\u075a\u075b\5\u00f6|\5\u075b\u075d\3\2\2\2\u075c"+
		"\u0758\3\2\2\2\u075d\u0760\3\2\2\2\u075e\u075c\3\2\2\2\u075e\u075f\3\2"+
		"\2\2\u075f\u00f7\3\2\2\2\u0760\u075e\3\2\2\2\u0761\u0764\5\u00fa~\2\u0762"+
		"\u0764\5\u0100\u0081\2\u0763\u0761\3\2\2\2\u0763\u0762\3\2\2\2\u0764\u00f9"+
		"\3\2\2\2\u0765\u0766\5\u0106\u0084\2\u0766\u0768\7\u009a\2\2\u0767\u0769"+
		"\7\u00c2\2\2\u0768\u0767\3\2\2\2\u0768\u0769\3\2\2\2\u0769\u076a\3\2\2"+
		"\2\u076a\u076b\7\u00c4\2\2\u076b\u077d\3\2\2\2\u076c\u076d\5\u0106\u0084"+
		"\2\u076d\u076e\7\27\2\2\u076e\u076f\5\u0106\u0084\2\u076f\u0770\7\f\2"+
		"\2\u0770\u0771\5\u0106\u0084\2\u0771\u077d\3\2\2\2\u0772\u0774\7\u00c2"+
		"\2\2\u0773\u0772\3\2\2\2\u0773\u0774\3\2\2\2\u0774\u0775\3\2\2\2\u0775"+
		"\u0776\7k\2\2\u0776\u0777\7\u016a\2\2\u0777\u0778\5\u00b4[\2\u0778\u0779"+
		"\7\u016d\2\2\u0779\u077d\3\2\2\2\u077a\u077d\5\u00fc\177\2\u077b\u077d"+
		"\5\u00fe\u0080\2\u077c\u0765\3\2\2\2\u077c\u076c\3\2\2\2\u077c\u0773\3"+
		"\2\2\2\u077c\u077a\3\2\2\2\u077c\u077b\3\2\2\2\u077d\u00fb\3\2\2\2\u077e"+
		"\u0780\5\u0106\u0084\2\u077f\u0781\7\u00c2\2\2\u0780\u077f\3\2\2\2\u0780"+
		"\u0781\3\2\2\2\u0781\u0782\3\2\2\2\u0782\u0783\7\u008a\2\2\u0783\u078d"+
		"\7\u016a\2\2\u0784\u0789\5\u0106\u0084\2\u0785\u0786\7\u015c\2\2\u0786"+
		"\u0788\5\u0106\u0084\2\u0787\u0785\3\2\2\2\u0788\u078b\3\2\2\2\u0789\u0787"+
		"\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u078e\3\2\2\2\u078b\u0789\3\2\2\2\u078c"+
		"\u078e\5\u00b4[\2\u078d\u0784\3\2\2\2\u078d\u078c\3\2\2\2\u078e\u078f"+
		"\3\2\2\2\u078f\u0790\7\u016d\2\2\u0790\u00fd\3\2\2\2\u0791\u0792\7\u016a"+
		"\2\2\u0792\u0797\5\u0106\u0084\2\u0793\u0794\7\u015c\2\2\u0794\u0796\5"+
		"\u0106\u0084\2\u0795\u0793\3\2\2\2\u0796\u0799\3\2\2\2\u0797\u0795\3\2"+
		"\2\2\u0797\u0798\3\2\2\2\u0798\u079a\3\2\2\2\u0799\u0797\3\2\2\2\u079a"+
		"\u079c\7\u016d\2\2\u079b\u079d\7\u00c2\2\2\u079c\u079b\3\2\2\2\u079c\u079d"+
		"\3\2\2\2\u079d\u079e\3\2\2\2\u079e\u079f\7\u008a\2\2\u079f\u07a0\7\u016a"+
		"\2\2\u07a0\u07a1\5\u00b4[\2\u07a1\u07a2\7\u016d\2\2\u07a2\u00ff\3\2\2"+
		"\2\u07a3\u07a4\5\u0106\u0084\2\u07a4\u07a5\5\u0104\u0083\2\u07a5\u07a6"+
		"\5\u0106\u0084\2\u07a6\u0101\3\2\2\2\u07a7\u07a8\t\32\2\2\u07a8\u0103"+
		"\3\2\2\2\u07a9\u07b5\7\u0161\2\2\u07aa\u07b5\7\u0162\2\2\u07ab\u07b5\7"+
		"\u0163\2\2\u07ac\u07b5\7\u0166\2\2\u07ad\u07b5\7\u0167\2\2\u07ae\u07b5"+
		"\7\u0164\2\2\u07af\u07b5\7\u0165\2\2\u07b0\u07b2\7\u00c2\2\2\u07b1\u07b0"+
		"\3\2\2\2\u07b1\u07b2\3\2\2\2\u07b2\u07b3\3\2\2\2\u07b3\u07b5\t\33\2\2"+
		"\u07b4\u07a9\3\2\2\2\u07b4\u07aa\3\2\2\2\u07b4\u07ab\3\2\2\2\u07b4\u07ac"+
		"\3\2\2\2\u07b4\u07ad\3\2\2\2\u07b4\u07ae\3\2\2\2\u07b4\u07af\3\2\2\2\u07b4"+
		"\u07b1\3\2\2\2\u07b5\u0105\3\2\2\2\u07b6\u07b7\b\u0084\1\2\u07b7\u07b8"+
		"\7\u016a\2\2\u07b8\u07b9\5\u00b4[\2\u07b9\u07ba\7\u016d\2\2\u07ba\u07c7"+
		"\3\2\2\2\u07bb\u07bc\7\u016a\2\2\u07bc\u07bd\5\u0106\u0084\2\u07bd\u07be"+
		"\7\u016d\2\2\u07be\u07c7\3\2\2\2\u07bf\u07c7\5\u010a\u0086\2\u07c0\u07c7"+
		"\5\u010e\u0088\2\u07c1\u07c7\5\u0112\u008a\2\u07c2\u07c7\5\u0118\u008d"+
		"\2\u07c3\u07c7\5\u0120\u0091\2\u07c4\u07c7\5\u0122\u0092\2\u07c5\u07c7"+
		"\5\u0108\u0085\2\u07c6\u07b6\3\2\2\2\u07c6\u07bb\3\2\2\2\u07c6\u07bf\3"+
		"\2\2\2\u07c6\u07c0\3\2\2\2\u07c6\u07c1\3\2\2\2\u07c6\u07c2\3\2\2\2\u07c6"+
		"\u07c3\3\2\2\2\u07c6\u07c4\3\2\2\2\u07c6\u07c5\3\2\2\2\u07c7\u07d8\3\2"+
		"\2\2\u07c8\u07c9\f\17\2\2\u07c9\u07ca\7\u0168\2\2\u07ca\u07d7\5\u0106"+
		"\u0084\20\u07cb\u07cc\f\16\2\2\u07cc\u07cd\7\u015e\2\2\u07cd\u07d7\5\u0106"+
		"\u0084\17\u07ce\u07cf\f\r\2\2\u07cf\u07d0\7\u015a\2\2\u07d0\u07d7\5\u0106"+
		"\u0084\16\u07d1\u07d2\f\f\2\2\u07d2\u07d3\7\u0170\2\2\u07d3\u07d7\5\u0106"+
		"\u0084\r\u07d4\u07d5\f\20\2\2\u07d5\u07d7\5\u010c\u0087\2\u07d6\u07c8"+
		"\3\2\2\2\u07d6\u07cb\3\2\2\2\u07d6\u07ce\3\2\2\2\u07d6\u07d1\3\2\2\2\u07d6"+
		"\u07d4\3\2\2\2\u07d7\u07da\3\2\2\2\u07d8\u07d6\3\2\2\2\u07d8\u07d9\3\2"+
		"\2\2\u07d9\u0107\3\2\2\2\u07da\u07d8\3\2\2\2\u07db\u07e4\5\u012a\u0096"+
		"\2\u07dc\u07e4\5\u012c\u0097\2\u07dd\u07e4\5\u0138\u009d\2\u07de\u07e4"+
		"\5\u012e\u0098\2\u07df\u07e4\5\u0130\u0099\2\u07e0\u07e4\5\u0136\u009c"+
		"\2\u07e1\u07e4\5\u0134\u009b\2\u07e2\u07e4\5\u013a\u009e\2\u07e3\u07db"+
		"\3\2\2\2\u07e3\u07dc\3\2\2\2\u07e3\u07dd\3\2\2\2\u07e3\u07de\3\2\2\2\u07e3"+
		"\u07df\3\2\2\2\u07e3\u07e0\3\2\2\2\u07e3\u07e1\3\2\2\2\u07e3\u07e2\3\2"+
		"\2\2\u07e4\u0109\3\2\2\2\u07e5\u07e6\7\u0097\2\2\u07e6\u07e7\5\u0106\u0084"+
		"\2\u07e7\u07e8\5\u010c\u0087\2\u07e8\u010b\3\2\2\2\u07e9\u07ea\t\34\2"+
		"\2\u07ea\u010d\3\2\2\2\u07eb\u07ec\5\u0110\u0089\2\u07ec\u07ed\t\35\2"+
		"\2\u07ed\u07f2\5\u0110\u0089\2\u07ee\u07ef\t\35\2\2\u07ef\u07f1\5\u0110"+
		"\u0089\2\u07f0\u07ee\3\2\2\2\u07f1\u07f4\3\2\2\2\u07f2\u07f0\3\2\2\2\u07f2"+
		"\u07f3\3\2\2\2\u07f3\u010f\3\2\2\2\u07f4\u07f2\3\2\2\2\u07f5\u07f6\7\u016a"+
		"\2\2\u07f6\u07f7\5\u0106\u0084\2\u07f7\u07f8\7\u016d\2\2\u07f8\u07ff\3"+
		"\2\2\2\u07f9\u07ff\5\u0112\u008a\2\u07fa\u07ff\5\u0118\u008d\2\u07fb\u07ff"+
		"\5\u0120\u0091\2\u07fc\u07ff\5\u0122\u0092\2\u07fd\u07ff\5\u0108\u0085"+
		"\2\u07fe\u07f5\3\2\2\2\u07fe\u07f9\3\2\2\2\u07fe\u07fa\3\2\2\2\u07fe\u07fb"+
		"\3\2\2\2\u07fe\u07fc\3\2\2\2\u07fe\u07fd\3\2\2\2\u07ff\u0111\3\2\2\2\u0800"+
		"\u0803\5\u0114\u008b\2\u0801\u0803\5\u0116\u008c\2\u0802\u0800\3\2\2\2"+
		"\u0802\u0801\3\2\2\2\u0803\u0113\3\2\2\2\u0804\u0805\7$\2\2\u0805\u080b"+
		"\5\u0106\u0084\2\u0806\u0807\7\u0139\2\2\u0807\u0808\5\u0106\u0084\2\u0808"+
		"\u0809\7\u0121\2\2\u0809\u080a\5\u0106\u0084\2\u080a\u080c\3\2\2\2\u080b"+
		"\u0806\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u080b\3\2\2\2\u080d\u080e\3\2"+
		"\2\2\u080e\u0811\3\2\2\2\u080f\u0810\7_\2\2\u0810\u0812\5\u0106\u0084"+
		"\2\u0811\u080f\3\2\2\2\u0811\u0812\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0814"+
		"\7c\2\2\u0814\u0115\3\2\2\2\u0815\u081b\7$\2\2\u0816\u0817\7\u0139\2\2"+
		"\u0817\u0818\5\u00f6|\2\u0818\u0819\7\u0121\2\2\u0819\u081a\5\u0106\u0084"+
		"\2\u081a\u081c\3\2\2\2\u081b\u0816\3\2\2\2\u081c\u081d\3\2\2\2\u081d\u081b"+
		"\3\2\2\2\u081d\u081e\3\2\2\2\u081e\u0821\3\2\2\2\u081f\u0820\7_\2\2\u0820"+
		"\u0822\5\u0106\u0084\2\u0821\u081f\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0823"+
		"\3\2\2\2\u0823\u0824\7c\2\2\u0824\u0117\3\2\2\2\u0825\u0826\7\24\2\2\u0826"+
		"\u0828\7\u016a\2\2\u0827\u0829\5\u011a\u008e\2\u0828\u0827\3\2\2\2\u0828"+
		"\u0829\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u082b\5\u0106\u0084\2\u082b\u082d"+
		"\7\u016d\2\2\u082c\u082e\5\u011c\u008f\2\u082d\u082c\3\2\2\2\u082d\u082e"+
		"\3\2\2\2\u082e\u08be\3\2\2\2\u082f\u0830\7:\2\2\u0830\u0836\7\u016a\2"+
		"\2\u0831\u0833\5\u011a\u008e\2\u0832\u0831\3\2\2\2\u0832\u0833\3\2\2\2"+
		"\u0833\u0834\3\2\2\2\u0834\u0837\5\u0106\u0084\2\u0835\u0837\7\u0168\2"+
		"\2\u0836\u0832\3\2\2\2\u0836\u0835\3\2\2\2\u0837\u0838\3\2\2\2\u0838\u083a"+
		"\7\u016d\2\2\u0839\u083b\5\u011c\u008f\2\u083a\u0839\3\2\2\2\u083a\u083b"+
		"\3\2\2\2\u083b\u08be\3\2\2\2\u083c\u083d\7;\2\2\u083d\u0843\7\u016a\2"+
		"\2\u083e\u0840\5\u011a\u008e\2\u083f\u083e\3\2\2\2\u083f\u0840\3\2\2\2"+
		"\u0840\u0841\3\2\2\2\u0841\u0844\5\u0106\u0084\2\u0842\u0844\7\u0168\2"+
		"\2\u0843\u083f\3\2\2\2\u0843\u0842\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u0847"+
		"\7\u016d\2\2\u0846\u0848\5\u011c\u008f\2\u0847\u0846\3\2\2\2\u0847\u0848"+
		"\3\2\2\2\u0848\u08be\3\2\2\2\u0849\u084a\7\u0143\2\2\u084a\u084b\7\u016a"+
		"\2\2\u084b\u084c\7\u016d\2\2\u084c\u08be\5\u011c\u008f\2\u084d\u084e\7"+
		"\u0147\2\2\u084e\u084f\7\u016a\2\2\u084f\u0850\7\u016d\2\2\u0850\u08be"+
		"\5\u011c\u008f\2\u0851\u0852\7\u0148\2\2\u0852\u0853\7\u016a\2\2\u0853"+
		"\u0854\5\u0106\u0084\2\u0854\u0855\7\u016d\2\2\u0855\u0856\5\u011c\u008f"+
		"\2\u0856\u08be\3\2\2\2\u0857\u0858\7\u0149\2\2\u0858\u0859\7\u016a\2\2"+
		"\u0859\u0860\5\u0106\u0084\2\u085a\u085b\7\u015c\2\2\u085b\u085e\5\u0106"+
		"\u0084\2\u085c\u085d\7\u015c\2\2\u085d\u085f\5\u0106\u0084\2\u085e\u085c"+
		"\3\2\2\2\u085e\u085f\3\2\2\2\u085f\u0861\3\2\2\2\u0860\u085a\3\2\2\2\u0860"+
		"\u0861\3\2\2\2\u0861\u0862\3\2\2\2\u0862\u0863\7\u016d\2\2\u0863\u0864"+
		"\5\u011c\u008f\2\u0864\u08be\3\2\2\2\u0865\u0866\7\u014a\2\2\u0866\u0867"+
		"\7\u016a\2\2\u0867\u0868\5\u0106\u0084\2\u0868\u0869\7\u016d\2\2\u0869"+
		"\u086a\5\u011c\u008f\2\u086a\u08be\3\2\2\2\u086b\u086c\7\u014b\2\2\u086c"+
		"\u086d\7\u016a\2\2\u086d\u0874\5\u0106\u0084\2\u086e\u086f\7\u015c\2\2"+
		"\u086f\u0872\5\u0106\u0084\2\u0870\u0871\7\u015c\2\2\u0871\u0873\5\u0106"+
		"\u0084\2\u0872\u0870\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0875\3\2\2\2\u0874"+
		"\u086e\3\2\2\2\u0874\u0875\3\2\2\2\u0875\u0876\3\2\2\2\u0876\u0877\7\u016d"+
		"\2\2\u0877\u0878\5\u011c\u008f\2\u0878\u08be\3\2\2\2\u0879\u087a\7\u00b2"+
		"\2\2\u087a\u087c\7\u016a\2\2\u087b\u087d\5\u011a\u008e\2\u087c\u087b\3"+
		"\2\2\2\u087c\u087d\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u087f\5\u0106\u0084"+
		"\2\u087f\u0881\7\u016d\2\2\u0880\u0882\5\u011c\u008f\2\u0881\u0880\3\2"+
		"\2\2\u0881\u0882\3\2\2\2\u0882\u08be\3\2\2\2\u0883\u0884\7\u00b8\2\2\u0884"+
		"\u0886\7\u016a\2\2\u0885\u0887\5\u011a\u008e\2\u0886\u0885\3\2\2\2\u0886"+
		"\u0887\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u0889\5\u0106\u0084\2\u0889\u088b"+
		"\7\u016d\2\2\u088a\u088c\5\u011c\u008f\2\u088b\u088a\3\2\2\2\u088b\u088c"+
		"\3\2\2\2\u088c\u08be\3\2\2\2\u088d\u088e\7\u0154\2\2\u088e\u088f\7\u016a"+
		"\2\2\u088f\u0890\7\u016d\2\2\u0890\u08be\5\u011c\u008f\2\u0891\u0892\7"+
		"\u0155\2\2\u0892\u0893\7\u016a\2\2\u0893\u0894\7\u016d\2\2\u0894\u08be"+
		"\5\u011c\u008f\2\u0895\u0896\7\u0156\2\2\u0896\u0898\7\u016a\2\2\u0897"+
		"\u0899\5\u011a\u008e\2\u0898\u0897\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u089a"+
		"\3\2\2\2\u089a\u089b\5\u0106\u0084\2\u089b\u089d\7\u016d\2\2\u089c\u089e"+
		"\5\u011c\u008f\2\u089d\u089c\3\2\2\2\u089d\u089e\3\2\2\2\u089e\u08be\3"+
		"\2\2\2\u089f\u08a0\7\u0119\2\2\u08a0\u08a2\7\u016a\2\2\u08a1\u08a3\5\u011a"+
		"\u008e\2\u08a2\u08a1\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3\u08a4\3\2\2\2\u08a4"+
		"\u08a5\5\u0106\u0084\2\u08a5\u08a7\7\u016d\2\2\u08a6\u08a8\5\u011c\u008f"+
		"\2\u08a7\u08a6\3\2\2\2\u08a7\u08a8\3\2\2\2\u08a8\u08be\3\2\2\2\u08a9\u08aa"+
		"\7\u0133\2\2\u08aa\u08ac\7\u016a\2\2\u08ab\u08ad\5\u011a\u008e\2\u08ac"+
		"\u08ab\3\2\2\2\u08ac\u08ad\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae\u08af\5\u0106"+
		"\u0084\2\u08af\u08b1\7\u016d\2\2\u08b0\u08b2\5\u011c\u008f\2\u08b1\u08b0"+
		"\3\2\2\2\u08b1\u08b2\3\2\2\2\u08b2\u08be\3\2\2\2\u08b3\u08b4\7\u0158\2"+
		"\2\u08b4\u08b6\7\u016a\2\2\u08b5\u08b7\5\u011a\u008e\2\u08b6\u08b5\3\2"+
		"\2\2\u08b6\u08b7\3\2\2\2\u08b7\u08b8\3\2\2\2\u08b8\u08b9\5\u0106\u0084"+
		"\2\u08b9\u08bb\7\u016d\2\2\u08ba\u08bc\5\u011c\u008f\2\u08bb\u08ba\3\2"+
		"\2\2\u08bb\u08bc\3\2\2\2\u08bc\u08be\3\2\2\2\u08bd\u0825\3\2\2\2\u08bd"+
		"\u082f\3\2\2\2\u08bd\u083c\3\2\2\2\u08bd\u0849\3\2\2\2\u08bd\u084d\3\2"+
		"\2\2\u08bd\u0851\3\2\2\2\u08bd\u0857\3\2\2\2\u08bd\u0865\3\2\2\2\u08bd"+
		"\u086b\3\2\2\2\u08bd\u0879\3\2\2\2\u08bd\u0883\3\2\2\2\u08bd\u088d\3\2"+
		"\2\2\u08bd\u0891\3\2\2\2\u08bd\u0895\3\2\2\2\u08bd\u089f\3\2\2\2\u08bd"+
		"\u08a9\3\2\2\2\u08bd\u08b3\3\2\2\2\u08be\u0119\3\2\2\2\u08bf\u08c0\t\30"+
		"\2\2\u08c0\u011b\3\2\2\2\u08c1\u08c2\7\u00d0\2\2\u08c2\u08c4\7\u016a\2"+
		"\2\u08c3\u08c5\5\u011e\u0090\2\u08c4\u08c3\3\2\2\2\u08c4\u08c5\3\2\2\2"+
		"\u08c5\u08c7\3\2\2\2\u08c6\u08c8\5\u00f4{\2\u08c7\u08c6\3\2\2\2\u08c7"+
		"\u08c8\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u08ca\7\u016d\2\2\u08ca\u011d"+
		"\3\2\2\2\u08cb\u08cc\7\u00d4\2\2\u08cc\u08cd\7\37\2\2\u08cd\u08d2\5\u0106"+
		"\u0084\2\u08ce\u08cf\7\u015c\2\2\u08cf\u08d1\5\u0106\u0084\2\u08d0\u08ce"+
		"\3\2\2\2\u08d1\u08d4\3\2\2\2\u08d2\u08d0\3\2\2\2\u08d2\u08d3\3\2\2\2\u08d3"+
		"\u011f\3\2\2\2\u08d4\u08d2\3\2\2\2\u08d5\u099e\7\u0142\2\2\u08d6\u08d7"+
		"\7&\2\2\u08d7\u08d8\7\u016a\2\2\u08d8\u08d9\5\u0106\u0084\2\u08d9\u08da"+
		"\7\17\2\2\u08da\u08dc\5d\63\2\u08db\u08dd\5f\64\2\u08dc\u08db\3\2\2\2"+
		"\u08dc\u08dd\3\2\2\2\u08dd\u08de\3\2\2\2\u08de\u08df\7\u016d\2\2\u08df"+
		"\u099e\3\2\2\2\u08e0\u08e1\7:\2\2\u08e1\u08e4\7\u016a\2\2\u08e2\u08e5"+
		"\5\u0106\u0084\2\u08e3\u08e5\7\u0168\2\2\u08e4\u08e2\3\2\2\2\u08e4\u08e3"+
		"\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u099e\7\u016d\2\2\u08e7\u099e\7\u0144"+
		"\2\2\u08e8\u08e9\7@\2\2\u08e9\u099e\7E\2\2\u08ea\u08ee\7\u0145\2\2\u08eb"+
		"\u08ec\7@\2\2\u08ec\u08ee\7\u0122\2\2\u08ed\u08ea\3\2\2\2\u08ed\u08eb"+
		"\3\2\2\2\u08ee\u08f3\3\2\2\2\u08ef\u08f0\7\u016a\2\2\u08f0\u08f1\5\u0106"+
		"\u0084\2\u08f1\u08f2\7\u016d\2\2\u08f2\u08f4\3\2\2\2\u08f3\u08ef\3\2\2"+
		"\2\u08f3\u08f4\3\2\2\2\u08f4\u099e\3\2\2\2\u08f5\u099e\7\u0146\2\2\u08f6"+
		"\u08f7\7@\2\2\u08f7\u099e\7\u0159\2\2\u08f8\u08f9\7\u014c\2\2\u08f9\u08fa"+
		"\7\u016a\2\2\u08fa\u0907\5\u0106\u0084\2\u08fb\u08fc\7\u015c\2\2\u08fc"+
		"\u0904\5\u0106\u0084\2\u08fd\u08fe\7\u015c\2\2\u08fe\u08ff\5\u0106\u0084"+
		"\2\u08ff\u0900\7\u0160\2\2\u0900\u0901\5\u0106\u0084\2\u0901\u0903\3\2"+
		"\2\2\u0902\u08fd\3\2\2\2\u0903\u0906\3\2\2\2\u0904\u0902\3\2\2\2\u0904"+
		"\u0905\3\2\2\2\u0905\u0908\3\2\2\2\u0906\u0904\3\2\2\2\u0907\u08fb\3\2"+
		"\2\2\u0907\u0908\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u090a\7\u016d\2\2\u090a"+
		"\u099e\3\2\2\2\u090b\u090c\7\u014d\2\2\u090c\u090d\7\u016a\2\2\u090d\u091a"+
		"\5\u0106\u0084\2\u090e\u090f\7\u015c\2\2\u090f\u0917\5\u0106\u0084\2\u0910"+
		"\u0911\7\u015c\2\2\u0911\u0912\5\u0106\u0084\2\u0912\u0913\7\u0160\2\2"+
		"\u0913\u0914\5\u0106\u0084\2\u0914\u0916\3\2\2\2\u0915\u0910\3\2\2\2\u0916"+
		"\u0919\3\2\2\2\u0917\u0915\3\2\2\2\u0917\u0918\3\2\2\2\u0918\u091b\3\2"+
		"\2\2\u0919\u0917\3\2\2\2\u091a\u090e\3\2\2\2\u091a\u091b\3\2\2\2\u091b"+
		"\u091c\3\2\2\2\u091c\u091d\7\u016d\2\2\u091d\u099e\3\2\2\2\u091e\u091f"+
		"\7\u014e\2\2\u091f\u0920\7\u016a\2\2\u0920\u092d\5\u0106\u0084\2\u0921"+
		"\u0922\7\u015c\2\2\u0922\u092a\5\u0106\u0084\2\u0923\u0924\7\u015c\2\2"+
		"\u0924\u0925\5\u0106\u0084\2\u0925\u0926\7\u0160\2\2\u0926\u0927\5\u0106"+
		"\u0084\2\u0927\u0929\3\2\2\2\u0928\u0923\3\2\2\2\u0929\u092c\3\2\2\2\u092a"+
		"\u0928\3\2\2\2\u092a\u092b\3\2\2\2\u092b\u092e\3\2\2\2\u092c\u092a\3\2"+
		"\2\2\u092d\u0921\3\2\2\2\u092d\u092e\3\2\2\2\u092e\u092f\3\2\2\2\u092f"+
		"\u0930\7\u016d\2\2\u0930\u099e\3\2\2\2\u0931\u0932\7\u014f\2\2\u0932\u0933"+
		"\7\u016a\2\2\u0933\u0940\5\u0106\u0084\2\u0934\u0935\7\u015c\2\2\u0935"+
		"\u093d\5\u0106\u0084\2\u0936";
	private static final String _serializedATNSegment1 =
		"\u0937\7\u015c\2\2\u0937\u0938\5\u0106\u0084\2\u0938\u0939\7\u0160\2\2"+
		"\u0939\u093a\5\u0106\u0084\2\u093a\u093c\3\2\2\2\u093b\u0936\3\2\2\2\u093c"+
		"\u093f\3\2\2\2\u093d\u093b\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u0941\3\2"+
		"\2\2\u093f\u093d\3\2\2\2\u0940\u0934\3\2\2\2\u0940\u0941\3\2\2\2\u0941"+
		"\u0942\3\2\2\2\u0942\u0943\7\u016d\2\2\u0943\u099e\3\2\2\2\u0944\u0945"+
		"\7\u0150\2\2\u0945\u0946\7\u016a\2\2\u0946\u0953\5\u0106\u0084\2\u0947"+
		"\u0948\7\u015c\2\2\u0948\u0950\5\u0106\u0084\2\u0949\u094a\7\u015c\2\2"+
		"\u094a\u094b\5\u0106\u0084\2\u094b\u094c\7\u0160\2\2\u094c\u094d\5\u0106"+
		"\u0084\2\u094d\u094f\3\2\2\2\u094e\u0949\3\2\2\2\u094f\u0952\3\2\2\2\u0950"+
		"\u094e\3\2\2\2\u0950\u0951\3\2\2\2\u0951\u0954\3\2\2\2\u0952\u0950\3\2"+
		"\2\2\u0953\u0947\3\2\2\2\u0953\u0954\3\2\2\2\u0954\u0955\3\2\2\2\u0955"+
		"\u0956\7\u016d\2\2\u0956\u099e\3\2\2\2\u0957\u0958\7\u0151\2\2\u0958\u0959"+
		"\7\u016a\2\2\u0959\u0966\5\u0106\u0084\2\u095a\u095b\7\u015c\2\2\u095b"+
		"\u0963\5\u0106\u0084\2\u095c\u095d\7\u015c\2\2\u095d\u095e\5\u0106\u0084"+
		"\2\u095e\u095f\7\u0160\2\2\u095f\u0960\5\u0106\u0084\2\u0960\u0962\3\2"+
		"\2\2\u0961\u095c\3\2\2\2\u0962\u0965\3\2\2\2\u0963\u0961\3\2\2\2\u0963"+
		"\u0964\3\2\2\2\u0964\u0967\3\2\2\2\u0965\u0963\3\2\2\2\u0966\u095a\3\2"+
		"\2\2\u0966\u0967\3\2\2\2\u0967\u0968\3\2\2\2\u0968\u0969\7\u016d\2\2\u0969"+
		"\u099e\3\2\2\2\u096a\u096b\7\u0152\2\2\u096b\u096c\7\u016a\2\2\u096c\u0974"+
		"\5\u0106\u0084\2\u096d\u096e\7\u015c\2\2\u096e\u096f\5\u0106\u0084\2\u096f"+
		"\u0970\7\u0160\2\2\u0970\u0971\5\u0106\u0084\2\u0971\u0973\3\2\2\2\u0972"+
		"\u096d\3\2\2\2\u0973\u0976\3\2\2\2\u0974\u0972\3\2\2\2\u0974\u0975\3\2"+
		"\2\2\u0975\u0977\3\2\2\2\u0976\u0974\3\2\2\2\u0977\u0978\7\u016d\2\2\u0978"+
		"\u099e\3\2\2\2\u0979\u097a\7\u0153\2\2\u097a\u097b\7\u016a\2\2\u097b\u0981"+
		"\5\u0106\u0084\2\u097c\u097d\7\u015c\2\2\u097d\u097e\5\u0106\u0084\2\u097e"+
		"\u097f\7\u0160\2\2\u097f\u0980\5\u0106\u0084\2\u0980\u0982\3\2\2\2\u0981"+
		"\u097c\3\2\2\2\u0982\u0983\3\2\2\2\u0983\u0981\3\2\2\2\u0983\u0984\3\2"+
		"\2\2\u0984\u0987\3\2\2\2\u0985\u0986\7\u015c\2\2\u0986\u0988\5\u0106\u0084"+
		"\2\u0987\u0985\3\2\2\2\u0987\u0988\3\2\2\2\u0988\u0989\3\2\2\2\u0989\u098a"+
		"\7\u016d\2\2\u098a\u099e\3\2\2\2\u098b\u098c\7\u00f9\2\2\u098c\u098d\7"+
		"\u016a\2\2\u098d\u098e\5\u0106\u0084\2\u098e\u098f\7\u016d\2\2\u098f\u099e"+
		"\3\2\2\2\u0990\u0991\7\u0118\2\2\u0991\u0992\7\u016a\2\2\u0992\u0993\5"+
		"\u0106\u0084\2\u0993\u0994\7x\2\2\u0994\u0997\5\u0106\u0084\2\u0995\u0996"+
		"\7t\2\2\u0996\u0998\5\u0106\u0084\2\u0997\u0995\3\2\2\2\u0997\u0998\3"+
		"\2\2\2\u0998\u0999\3\2\2\2\u0999\u099a\7\u016d\2\2\u099a\u099e\3\2\2\2"+
		"\u099b\u099e\7\u0157\2\2\u099c\u099e\7\u0159\2\2\u099d\u08d5\3\2\2\2\u099d"+
		"\u08d6\3\2\2\2\u099d\u08e0\3\2\2\2\u099d\u08e7\3\2\2\2\u099d\u08e8\3\2"+
		"\2\2\u099d\u08ed\3\2\2\2\u099d\u08f5\3\2\2\2\u099d\u08f6\3\2\2\2\u099d"+
		"\u08f8\3\2\2\2\u099d\u090b\3\2\2\2\u099d\u091e\3\2\2\2\u099d\u0931\3\2"+
		"\2\2\u099d\u0944\3\2\2\2\u099d\u0957\3\2\2\2\u099d\u096a\3\2\2\2\u099d"+
		"\u0979\3\2\2\2\u099d\u098b\3\2\2\2\u099d\u0990\3\2\2\2\u099d\u099b\3\2"+
		"\2\2\u099d\u099c\3\2\2\2\u099e\u0121\3\2\2\2\u099f\u09a0\5\u012e\u0098"+
		"\2\u09a0\u09a2\7\u016a\2\2\u09a1\u09a3\5\u0124\u0093\2\u09a2\u09a1\3\2"+
		"\2\2\u09a2\u09a3\3\2\2\2\u09a3\u09a4\3\2\2\2\u09a4\u09a5\7\u016d\2\2\u09a5"+
		"\u0123\3\2\2\2\u09a6\u09ab\5\u0126\u0094\2\u09a7\u09a8\7\u015c\2\2\u09a8"+
		"\u09aa\5\u0126\u0094\2\u09a9\u09a7\3\2\2\2\u09aa\u09ad\3\2\2\2\u09ab\u09a9"+
		"\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac\u0125\3\2\2\2\u09ad\u09ab\3\2\2\2\u09ae"+
		"\u09b4\6\u0094\r\2\u09af\u09b0\5\u012e\u0098\2\u09b0\u09b2\7\u0160\2\2"+
		"\u09b1\u09b3\7\u0164\2\2\u09b2\u09b1\3\2\2\2\u09b2\u09b3\3\2\2\2\u09b3"+
		"\u09b5\3\2\2\2\u09b4\u09af\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09b6\3\2"+
		"\2\2\u09b6\u09b7\5\u0106\u0084\2\u09b7\u0127\3\2\2\2\u09b8\u09bc\7\u016a"+
		"\2\2\u09b9\u09bb\n\36\2\2\u09ba\u09b9\3\2\2\2\u09bb\u09be\3\2\2\2\u09bc"+
		"\u09ba\3\2\2\2\u09bc\u09bd\3\2\2\2\u09bd\u0129\3\2\2\2\u09be\u09bc\3\2"+
		"\2\2\u09bf\u09c0\7E\2\2\u09c0\u09c1\5\u0130\u0099\2\u09c1\u012b\3\2\2"+
		"\2\u09c2\u09c3\7\u0122\2\2\u09c3\u09c4\5\u0130\u0099\2\u09c4\u012d\3\2"+
		"\2\2\u09c5\u09ca\7\u0171\2\2\u09c6\u09c7\7\6\2\2\u09c7\u09c9\7\u0171\2"+
		"\2\u09c8\u09c6\3\2\2\2\u09c9\u09cc\3\2\2\2\u09ca\u09c8\3\2\2\2\u09ca\u09cb"+
		"\3\2\2\2\u09cb\u012f\3\2\2\2\u09cc\u09ca\3\2\2\2\u09cd\u09d0\7\u0172\2"+
		"\2\u09ce\u09d0\7\u0174\2\2\u09cf\u09cd\3\2\2\2\u09cf\u09ce\3\2\2\2\u09d0"+
		"\u0131\3\2\2\2\u09d1\u09d2\t\37\2\2\u09d2\u0133\3\2\2\2\u09d3\u09d5\t"+
		" \2\2\u09d4\u09d3\3\2\2\2\u09d4\u09d5\3\2\2\2\u09d5\u09d6\3\2\2\2\u09d6"+
		"\u09d7\7\u0176\2\2\u09d7\u0135\3\2\2\2\u09d8\u09da\t \2\2\u09d9\u09d8"+
		"\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09db\3\2\2\2\u09db\u09dc\7\u0177\2"+
		"\2\u09dc\u0137\3\2\2\2\u09dd\u09de\t!\2\2\u09de\u0139\3\2\2\2\u09df\u09e0"+
		"\7\u00c4\2\2\u09e0\u013b\3\2\2\2\u09e1\u09e2\t\"\2\2\u09e2\u013d\3\2\2"+
		"\2\u09e3\u09e4\7\u017d\2\2\u09e4\u013f\3\2\2\2\u0144\u0146\u0149\u014d"+
		"\u0159\u015c\u0163\u016e\u0170\u0179\u017c\u017e\u0195\u019f\u01a6\u01ac"+
		"\u01b0\u01b9\u01be\u01c6\u01cb\u01d4\u01e0\u01e5\u01e8\u01f5\u01f9\u0201"+
		"\u0209\u0214\u021e\u0228\u022c\u0230\u0235\u0239\u023e\u0242\u0246\u024d"+
		"\u0251\u0258\u025e\u0262\u026a\u026d\u0272\u0277\u027e\u0285\u0288\u028f"+
		"\u0295\u029a\u02a0\u02a5\u02a8\u02ae\u02bc\u02c6\u02cc\u02d1\u02d6\u02db"+
		"\u02df\u02e4\u02ee\u02fa\u0301\u0304\u0310\u0315\u031a\u031d\u0324\u0330"+
		"\u033d\u033f\u0344\u0347\u0356\u035c\u0367\u036a\u0374\u037b\u0381\u0389"+
		"\u0393\u03a7\u03ad\u03b1\u03b6\u03ba\u03bf\u03c2\u03c7\u03ca\u03d8\u03f8"+
		"\u03fa\u03ff\u0403\u0408\u040f\u0412\u0415\u041a\u041e\u0420\u0427\u042d"+
		"\u0434\u043a\u0444\u044e\u0451\u0456\u045a\u045d\u0464\u046a\u046d\u0477"+
		"\u0480\u0487\u048e\u0490\u0496\u0499\u04a4\u04ad\u04b3\u04b8\u04bb\u04c0"+
		"\u04c3\u04c6\u04cc\u04d1\u04d4\u04d8\u04db\u04de\u04e4\u04ee\u04f9\u04fc"+
		"\u0503\u0508\u050d\u0511\u0519\u051d\u0522\u0526\u0528\u052c\u0534\u053c"+
		"\u053f\u0544\u0551\u055a\u055e\u0569\u056d\u0577\u057d\u0594\u05a0\u05a7"+
		"\u05af\u05b6\u05ba\u05c0\u05c7\u05d6\u05d9\u05dc\u05df\u05ec\u05f5\u05fc"+
		"\u0606\u060d\u0616\u061d\u0623\u0626\u0630\u0635\u0642\u064d\u0655\u0659"+
		"\u065d\u0661\u0663\u0668\u066c\u066f\u0673\u0676\u067b\u067e\u0681\u0685"+
		"\u0688\u068b\u068e\u0691\u0698\u06a3\u06a7\u06aa\u06ae\u06b5\u06b9\u06c3"+
		"\u06cb\u06d2\u06d8\u06dc\u06e2\u06eb\u06ee\u06f3\u06f6\u0700\u0705\u070e"+
		"\u0713\u0717\u0720\u0724\u0734\u0741\u0746\u074a\u074f\u0756\u075e\u0763"+
		"\u0768\u0773\u077c\u0780\u0789\u078d\u0797\u079c\u07b1\u07b4\u07c6\u07d6"+
		"\u07d8\u07e3\u07f2\u07fe\u0802\u080d\u0811\u081d\u0821\u0828\u082d\u0832"+
		"\u0836\u083a\u083f\u0843\u0847\u085e\u0860\u0872\u0874\u087c\u0881\u0886"+
		"\u088b\u0898\u089d\u08a2\u08a7\u08ac\u08b1\u08b6\u08bb\u08bd\u08c4\u08c7"+
		"\u08d2\u08dc\u08e4\u08ed\u08f3\u0904\u0907\u0917\u091a\u092a\u092d\u093d"+
		"\u0940\u0950\u0953\u0963\u0966\u0974\u0983\u0987\u0997\u099d\u09a2\u09ab"+
		"\u09b2\u09b4\u09bc\u09ca\u09cf\u09d4\u09d9";
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