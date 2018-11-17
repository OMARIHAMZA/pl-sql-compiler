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
		RULE_exec_stmt = 70, RULE_if_stmt = 71, RULE_error_if_stmt = 72, RULE_if_plsql_stmt = 73, 
		RULE_error_if_plsql_stmt = 74, RULE_if_tsql_stmt = 75, RULE_error_if_tsql_stmt = 76, 
		RULE_if_bteq_stmt = 77, RULE_error_if_bteq_stmt = 78, RULE_elseif_block = 79, 
		RULE_else_block = 80, RULE_create_index_stmt = 81, RULE_error_create_index_stmt = 82, 
		RULE_create_index_col = 83, RULE_return_stmt = 84, RULE_for_range_stmt = 85, 
		RULE_error_for_range_stmt = 86, RULE_select_stmt = 87, RULE_cte_select_stmt = 88, 
		RULE_cte_select_stmt_item = 89, RULE_cte_select_cols = 90, RULE_fullselect_stmt = 91, 
		RULE_fullselect_stmt_item = 92, RULE_fullselect_set_clause = 93, RULE_subselect_stmt = 94, 
		RULE_error_subselect = 95, RULE_select_list = 96, RULE_select_list_set = 97, 
		RULE_select_list_limit = 98, RULE_select_list_item = 99, RULE_select_list_alias = 100, 
		RULE_select_list_asterisk = 101, RULE_into_clause = 102, RULE_from_clause = 103, 
		RULE_error_from_clause = 104, RULE_from_table_clause = 105, RULE_from_table_name_clause = 106, 
		RULE_from_subselect_clause = 107, RULE_from_join_clause = 108, RULE_from_join_type_clause = 109, 
		RULE_from_table_values_clause = 110, RULE_from_table_values_row = 111, 
		RULE_from_alias_clause = 112, RULE_table_name = 113, RULE_where_clause = 114, 
		RULE_error_missing_bool_expr = 115, RULE_group_by_clause = 116, RULE_having_clause = 117, 
		RULE_qualify_clause = 118, RULE_order_by_clause = 119, RULE_bool_expr = 120, 
		RULE_bool_expr_atom = 121, RULE_bool_expr_unary = 122, RULE_bool_expr_single_in = 123, 
		RULE_bool_expr_multi_in = 124, RULE_bool_expr_binary = 125, RULE_bool_expr_logical_operator = 126, 
		RULE_bool_expr_binary_operator = 127, RULE_expr = 128, RULE_expr_atom = 129, 
		RULE_expr_interval = 130, RULE_interval_item = 131, RULE_expr_concat = 132, 
		RULE_expr_concat_item = 133, RULE_expr_case = 134, RULE_expr_case_simple = 135, 
		RULE_expr_case_searched = 136, RULE_expr_agg_window_func = 137, RULE_expr_func_all_distinct = 138, 
		RULE_expr_func_over_clause = 139, RULE_expr_func_partition_by_clause = 140, 
		RULE_expr_spec_func = 141, RULE_expr_func = 142, RULE_expr_func_params = 143, 
		RULE_func_param = 144, RULE_error_missing_right_p = 145, RULE_date_literal = 146, 
		RULE_timestamp_literal = 147, RULE_ident = 148, RULE_string = 149, RULE_error_string = 150, 
		RULE_int_number = 151, RULE_dec_number = 152, RULE_bool_literal = 153, 
		RULE_null_const = 154, RULE_non_reserved_words = 155, RULE_error_invalid_token = 156;
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
		"exec_stmt", "if_stmt", "error_if_stmt", "if_plsql_stmt", "error_if_plsql_stmt", 
		"if_tsql_stmt", "error_if_tsql_stmt", "if_bteq_stmt", "error_if_bteq_stmt", 
		"elseif_block", "else_block", "create_index_stmt", "error_create_index_stmt", 
		"create_index_col", "return_stmt", "for_range_stmt", "error_for_range_stmt", 
		"select_stmt", "cte_select_stmt", "cte_select_stmt_item", "cte_select_cols", 
		"fullselect_stmt", "fullselect_stmt_item", "fullselect_set_clause", "subselect_stmt", 
		"error_subselect", "select_list", "select_list_set", "select_list_limit", 
		"select_list_item", "select_list_alias", "select_list_asterisk", "into_clause", 
		"from_clause", "error_from_clause", "from_table_clause", "from_table_name_clause", 
		"from_subselect_clause", "from_join_clause", "from_join_type_clause", 
		"from_table_values_clause", "from_table_values_row", "from_alias_clause", 
		"table_name", "where_clause", "error_missing_bool_expr", "group_by_clause", 
		"having_clause", "qualify_clause", "order_by_clause", "bool_expr", "bool_expr_atom", 
		"bool_expr_unary", "bool_expr_single_in", "bool_expr_multi_in", "bool_expr_binary", 
		"bool_expr_logical_operator", "bool_expr_binary_operator", "expr", "expr_atom", 
		"expr_interval", "interval_item", "expr_concat", "expr_concat_item", "expr_case", 
		"expr_case_simple", "expr_case_searched", "expr_agg_window_func", "expr_func_all_distinct", 
		"expr_func_over_clause", "expr_func_partition_by_clause", "expr_spec_func", 
		"expr_func", "expr_func_params", "func_param", "error_missing_right_p", 
		"date_literal", "timestamp_literal", "ident", "string", "error_string", 
		"int_number", "dec_number", "bool_literal", "null_const", "non_reserved_words", 
		"error_invalid_token"
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
			setState(314);
			block();
			setState(315);
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
			setState(325); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(320);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(317);
						begin_end_block();
						}
						break;
					case 2:
						{
						setState(318);
						stmt();
						}
						break;
					case 3:
						{
						setState(319);
						error_stmt();
						}
						break;
					}
					setState(323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(322);
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
				setState(327); 
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
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FROM:
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				error_subselect();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				error_missing_right_p();
				}
				break;
			case T_BEGIN:
			case T_DECLARE:
				enterOuterAlt(_localctx, 3);
				{
				setState(331);
				error_missing_end();
				}
				break;
			case L_S_STRING_MISSING_RIGHT:
			case L_D_STRING_MISSING_RIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(332);
				error_string();
				}
				break;
			case T_WHERE:
				enterOuterAlt(_localctx, 5);
				{
				setState(333);
				error_missing_bool_expr();
				}
				break;
			case T__3:
			case T_IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(334);
				error_if_stmt();
				}
				break;
			case T_CREATE:
			case T_PROC:
			case T_PROCEDURE:
			case T_REPLACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(335);
				error_create_stmt();
				}
				break;
			case T_FOR:
				enterOuterAlt(_localctx, 8);
				{
				setState(336);
				error_for_range_stmt();
				}
				break;
			case L_ID:
				enterOuterAlt(_localctx, 9);
				{
				setState(337);
				error_delcare_stmt();
				}
				break;
			case L_INVALID_TOKEN:
				enterOuterAlt(_localctx, 10);
				{
				setState(338);
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
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(341);
				declare_block();
				}
			}

			setState(344);
			match(T_BEGIN);
			setState(345);
			block();
			setState(346);
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
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_DECLARE) {
				{
				setState(348);
				declare_block();
				}
			}

			setState(351);
			match(T_BEGIN);
			setState(352);
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
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(354);
				match(T_BEGIN);
				setState(355);
				block();
				setState(356);
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
				setState(358);
				stmt();
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(359);
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
			setState(364);
			if (!(!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION"))) throw new FailedPredicateException(this, "!_input.LT(2).getText().equalsIgnoreCase(\"TRANSACTION\")");
			setState(365);
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
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				begin_end_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(369); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(368);
						stmt();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(371); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(373);
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
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				assignment_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				break_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				call_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
				create_database_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
				create_function_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(383);
				create_index_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(384);
				create_local_temp_table_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(385);
				create_package_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(386);
				create_package_body_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(387);
				create_procedure_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(388);
				create_table_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(389);
				declare_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(390);
				exec_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(391);
				for_range_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(392);
				if_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(393);
				return_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(394);
				select_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(395);
				null_stmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(396);
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
			setState(399);
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
			setState(401);
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
			setState(403);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("GO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"GO\")");
			setState(404);
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
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_SET) {
				{
				setState(406);
				match(T_SET);
				}
			}

			setState(409);
			assignment_stmt_item();
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(410);
					match(T_COMMA);
					setState(411);
					assignment_stmt_item();
					}
					} 
				}
				setState(416);
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
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				assignment_stmt_single_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				assignment_stmt_multiple_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
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
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				ident();
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(423);
					match(T_COLON);
					}
				}

				setState(426);
				match(T_EQUAL);
				setState(427);
				expr(0);
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				match(T_OPEN_P);
				setState(430);
				ident();
				setState(431);
				match(T_CLOSE_P);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(432);
					match(T_COLON);
					}
				}

				setState(435);
				match(T_EQUAL);
				setState(436);
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
			setState(440);
			match(T_OPEN_P);
			setState(441);
			ident();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(442);
				match(T_COMMA);
				setState(443);
				ident();
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
			match(T_CLOSE_P);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(450);
				match(T_COLON);
				}
			}

			setState(453);
			match(T_EQUAL);
			setState(454);
			match(T_OPEN_P);
			setState(455);
			expr(0);
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(456);
				match(T_COMMA);
				setState(457);
				expr(0);
				}
				}
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(463);
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
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				{
				setState(465);
				ident();
				}
				break;
			case T_OPEN_P:
				{
				{
				setState(466);
				match(T_OPEN_P);
				setState(467);
				ident();
				setState(472);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(468);
					match(T_COMMA);
					setState(469);
					ident();
					}
					}
					setState(474);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(475);
				match(T_CLOSE_P);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COLON) {
				{
				setState(479);
				match(T_COLON);
				}
			}

			setState(482);
			match(T_EQUAL);
			setState(483);
			match(T_OPEN_P);
			setState(484);
			select_stmt();
			setState(485);
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
			setState(487);
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
			setState(489);
			match(T_CALL);
			setState(490);
			ident();
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(491);
				match(T_OPEN_P);
				setState(493);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(492);
					expr_func_params();
					}
					break;
				}
				setState(495);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(496);
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
			setState(499);
			match(T_DECLARE);
			setState(500);
			declare_stmt_item();
			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(501);
					match(T_COMMA);
					setState(502);
					declare_stmt_item();
					}
					} 
				}
				setState(507);
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
			setState(508);
			declare_stmt_item();
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(509);
					match(T_COMMA);
					setState(510);
					declare_stmt_item();
					}
					} 
				}
				setState(515);
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
			setState(516);
			match(T_DECLARE);
			setState(517);
			declare_stmt_item();
			setState(518);
			match(T_SEMICOLON);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==L_ID) {
				{
				{
				setState(519);
				declare_stmt_item();
				setState(520);
				match(T_SEMICOLON);
				}
				}
				setState(526);
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
			setState(527);
			declare_stmt_item();
			setState(528);
			match(T_SEMICOLON);
			setState(534);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(529);
					declare_stmt_item();
					setState(530);
					match(T_SEMICOLON);
					}
					} 
				}
				setState(536);
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
			setState(537);
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
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				ident();
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(540);
					match(T_COMMA);
					setState(541);
					ident();
					}
					}
					setState(546);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(547);
					match(T_AS);
					}
				}

				setState(550);
				dtype();
				setState(552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(551);
					dtype_len();
					}
					break;
				}
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(554);
						dtype_attr();
						}
						} 
					}
					setState(559);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(560);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				ident();
				setState(564);
				match(T_CONSTANT);
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(565);
					match(T_AS);
					}
				}

				setState(568);
				dtype();
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(569);
					dtype_len();
					}
				}

				setState(572);
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
			setState(576);
			match(T_CREATE);
			setState(577);
			match(T_TABLE);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IF) {
				{
				setState(578);
				match(T_IF);
				setState(579);
				match(T_NOT);
				setState(580);
				match(T_EXISTS);
				}
			}

			setState(583);
			table_name();
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(584);
				create_table_preoptions();
				}
			}

			setState(587);
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
			setState(592);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				error_create_table_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				error_create_index_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
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
			setState(594);
			match(T_CREATE);
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IF) {
				{
				setState(595);
				match(T_IF);
				setState(596);
				match(T_NOT);
				setState(597);
				match(T_EXISTS);
				}
			}

			setState(600);
			table_name();
			setState(602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(601);
				create_table_preoptions();
				}
			}

			setState(604);
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
			setState(606);
			match(T_CREATE);
			setState(613);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_LOCAL:
				{
				setState(607);
				match(T_LOCAL);
				setState(608);
				match(T_TEMPORARY);
				}
				break;
			case T_MULTISET:
			case T_SET:
			case T_VOLATILE:
				{
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_MULTISET || _la==T_SET) {
					{
					setState(609);
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

				setState(612);
				match(T_VOLATILE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(615);
			match(T_TABLE);
			setState(616);
			ident();
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ROW || _la==T_STORED || _la==T_COMMA) {
				{
				setState(617);
				create_table_preoptions();
				}
			}

			setState(620);
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
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(622);
					match(T_AS);
					}
				}

				setState(625);
				match(T_OPEN_P);
				setState(626);
				select_stmt();
				setState(627);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(629);
					match(T_AS);
					}
				}

				setState(632);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(633);
				match(T_OPEN_P);
				setState(634);
				create_table_columns();
				setState(635);
				match(T_CLOSE_P);
				}
				break;
			}
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(639);
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
			setState(642);
			create_table_columns_item();
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(643);
				match(T_COMMA);
				setState(644);
				create_table_columns_item();
				}
				}
				setState(649);
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
			setState(672);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(650);
				column_name();
				setState(651);
				dtype();
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(652);
					dtype_len();
					}
				}

				setState(658);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(655);
						dtype_attr();
						}
						} 
					}
					setState(660);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_AUTO_INCREMENT || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T_DEFAULT - 74)) | (1L << (T_ENABLE - 74)) | (1L << (T_IDENTITY - 74)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T_NOT - 192)) | (1L << (T_NULL - 192)) | (1L << (T_PRIMARY - 192)) | (1L << (T_REFERENCES - 192)))) != 0) || ((((_la - 298)) & ~0x3f) == 0 && ((1L << (_la - 298)) & ((1L << (T_UNIQUE - 298)) | (1L << (T_WITH - 298)) | (1L << (T_COLON - 298)) | (1L << (T_EQUAL - 298)))) != 0)) {
					{
					{
					setState(661);
					create_table_column_inline_cons();
					}
					}
					setState(666);
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
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CONSTRAINT) {
					{
					setState(667);
					match(T_CONSTRAINT);
					setState(668);
					ident();
					}
				}

				setState(671);
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
			setState(674);
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
			setState(708);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_DEFAULT:
			case T_WITH:
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(676);
				dtype_default();
				}
				break;
			case T_NOT:
			case T_NULL:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(677);
					match(T_NOT);
					}
				}

				setState(680);
				match(T_NULL);
				}
				break;
			case T_PRIMARY:
				enterOuterAlt(_localctx, 3);
				{
				setState(681);
				match(T_PRIMARY);
				setState(682);
				match(T_KEY);
				}
				break;
			case T_UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(683);
				match(T_UNIQUE);
				}
				break;
			case T_REFERENCES:
				enterOuterAlt(_localctx, 5);
				{
				setState(684);
				match(T_REFERENCES);
				setState(685);
				table_name();
				setState(686);
				match(T_OPEN_P);
				setState(687);
				ident();
				setState(688);
				match(T_CLOSE_P);
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(689);
					create_table_fk_action();
					}
					}
					setState(694);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T_IDENTITY:
				enterOuterAlt(_localctx, 6);
				{
				setState(695);
				match(T_IDENTITY);
				setState(696);
				match(T_OPEN_P);
				setState(697);
				match(L_INT);
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(698);
					match(T_COMMA);
					setState(699);
					match(L_INT);
					}
					}
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(705);
				match(T_CLOSE_P);
				}
				break;
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(706);
				match(T_AUTO_INCREMENT);
				}
				break;
			case T_ENABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(707);
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
			setState(764);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				match(T_PRIMARY);
				setState(711);
				match(T_KEY);
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_CLUSTERED) {
					{
					setState(712);
					match(T_CLUSTERED);
					}
				}

				setState(715);
				match(T_OPEN_P);
				setState(716);
				ident();
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ASC || _la==T_DESC) {
					{
					setState(717);
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

				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(720);
					match(T_COMMA);
					setState(721);
					ident();
					setState(723);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ASC || _la==T_DESC) {
						{
						setState(722);
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
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(730);
				match(T_CLOSE_P);
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ENABLE) {
					{
					setState(731);
					match(T_ENABLE);
					}
				}

				}
				break;
			case T_FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				match(T_FOREIGN);
				setState(735);
				match(T_KEY);
				setState(736);
				match(T_OPEN_P);
				setState(737);
				ident();
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(738);
					match(T_COMMA);
					setState(739);
					ident();
					}
					}
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(745);
				match(T_CLOSE_P);
				setState(746);
				match(T_REFERENCES);
				setState(747);
				table_name();
				setState(748);
				match(T_OPEN_P);
				setState(749);
				ident();
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(750);
					match(T_COMMA);
					setState(751);
					ident();
					}
					}
					setState(756);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(757);
				match(T_CLOSE_P);
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_ON) {
					{
					{
					setState(758);
					create_table_fk_action();
					}
					}
					setState(763);
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
			setState(766);
			match(T_ON);
			setState(767);
			_la = _input.LA(1);
			if ( !(_la==T_DELETE || _la==T_UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(776);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(768);
				match(T_NO);
				setState(769);
				match(T_ACTION);
				}
				break;
			case 2:
				{
				setState(770);
				match(T_RESTRICT);
				}
				break;
			case 3:
				{
				setState(771);
				match(T_SET);
				setState(772);
				match(T_NULL);
				}
				break;
			case 4:
				{
				setState(773);
				match(T_SET);
				setState(774);
				match(T_DEFAULT);
				}
				break;
			case 5:
				{
				setState(775);
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
			setState(779); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(778);
				create_table_preoptions_item();
				}
				}
				setState(781); 
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
			setState(786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				match(T_COMMA);
				setState(784);
				create_table_preoptions_td_item();
				}
				break;
			case T_ROW:
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
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
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NO) {
				{
				setState(788);
				match(T_NO);
				}
			}

			setState(791);
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
			setState(794); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(793);
					create_table_options_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(796); 
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
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				match(T_ON);
				setState(799);
				match(T_COMMIT);
				setState(800);
				_la = _input.LA(1);
				if ( !(_la==T_DELETE || _la==T_PRESERVE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(801);
				match(T_ROWS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				create_table_options_ora_item();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(803);
				create_table_options_db2_item();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(804);
				create_table_options_td_item();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(805);
				create_table_options_hive_item();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(806);
				create_table_options_mssql_item();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(807);
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
			setState(828);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEGMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(810);
				match(T_SEGMENT);
				setState(811);
				match(T_CREATION);
				setState(812);
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
				setState(813);
				_la = _input.LA(1);
				if ( !(_la==T_INITRANS || _la==T_MAXTRANS || _la==T_PCTFREE || _la==T_PCTUSED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(814);
				match(L_INT);
				}
				break;
			case T_NOCOMPRESS:
				enterOuterAlt(_localctx, 3);
				{
				setState(815);
				match(T_NOCOMPRESS);
				}
				break;
			case T_LOGGING:
			case T_NOLOGGING:
				enterOuterAlt(_localctx, 4);
				{
				setState(816);
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
				setState(817);
				match(T_STORAGE);
				setState(818);
				match(T_OPEN_P);
				setState(821); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(821);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_ID:
						{
						setState(819);
						ident();
						}
						break;
					case L_INT:
						{
						setState(820);
						match(L_INT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(823); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==L_ID || _la==L_INT );
				setState(825);
				match(T_CLOSE_P);
				}
				break;
			case T_TABLESPACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(826);
				match(T_TABLESPACE);
				setState(827);
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
			setState(863);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INDEX) {
					{
					setState(830);
					match(T_INDEX);
					}
				}

				setState(833);
				match(T_IN);
				setState(834);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(835);
				match(T_WITH);
				setState(836);
				match(T_REPLACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(837);
				match(T_DISTRIBUTE);
				setState(838);
				match(T_BY);
				setState(839);
				match(T_HASH);
				setState(840);
				match(T_OPEN_P);
				setState(841);
				ident();
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(842);
					match(T_COMMA);
					setState(843);
					ident();
					}
					}
					setState(848);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(849);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(851);
					match(T_NOT);
					}
				}

				setState(854);
				match(T_LOGGED);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(855);
				match(T_COMPRESS);
				setState(856);
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
				setState(857);
				match(T_DEFINITION);
				setState(858);
				match(T_ONLY);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(859);
				match(T_WITH);
				setState(860);
				match(T_RESTRICT);
				setState(861);
				match(T_ON);
				setState(862);
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
			setState(883);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_PRIMARY:
			case T_UNIQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_UNIQUE) {
					{
					setState(865);
					match(T_UNIQUE);
					}
				}

				setState(868);
				match(T_PRIMARY);
				setState(869);
				match(T_INDEX);
				setState(870);
				match(T_OPEN_P);
				setState(871);
				ident();
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(872);
					match(T_COMMA);
					setState(873);
					ident();
					}
					}
					setState(878);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(879);
				match(T_CLOSE_P);
				}
				break;
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
				match(T_WITH);
				setState(882);
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
			setState(889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(885);
				create_table_hive_row_format();
				}
				break;
			case T_STORED:
				enterOuterAlt(_localctx, 2);
				{
				setState(886);
				match(T_STORED);
				setState(887);
				match(T_AS);
				setState(888);
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
			setState(891);
			match(T_ROW);
			setState(892);
			match(T_FORMAT);
			setState(893);
			match(T_DELIMITED);
			setState(897);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(894);
					create_table_hive_row_format_fields();
					}
					} 
				}
				setState(899);
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
			setState(927);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FIELDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				match(T_FIELDS);
				setState(901);
				match(T_TERMINATED);
				setState(902);
				match(T_BY);
				setState(903);
				expr(0);
				setState(907);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(904);
					match(T_ESCAPED);
					setState(905);
					match(T_BY);
					setState(906);
					expr(0);
					}
					break;
				}
				}
				break;
			case T_COLLECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(909);
				match(T_COLLECTION);
				setState(910);
				match(T_ITEMS);
				setState(911);
				match(T_TERMINATED);
				setState(912);
				match(T_BY);
				setState(913);
				expr(0);
				}
				break;
			case T_MAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(914);
				match(T_MAP);
				setState(915);
				match(T_KEYS);
				setState(916);
				match(T_TERMINATED);
				setState(917);
				match(T_BY);
				setState(918);
				expr(0);
				}
				break;
			case T_LINES:
				enterOuterAlt(_localctx, 4);
				{
				setState(919);
				match(T_LINES);
				setState(920);
				match(T_TERMINATED);
				setState(921);
				match(T_BY);
				setState(922);
				expr(0);
				}
				break;
			case T_NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(923);
				match(T_NULL);
				setState(924);
				match(T_DEFINED);
				setState(925);
				match(T_AS);
				setState(926);
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
			setState(933);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(929);
				match(T_ON);
				setState(930);
				ident();
				}
				break;
			case T_TEXTIMAGE_ON:
				enterOuterAlt(_localctx, 2);
				{
				setState(931);
				match(T_TEXTIMAGE_ON);
				setState(932);
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
			setState(962);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AUTO_INCREMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				match(T_AUTO_INCREMENT);
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(936);
					match(T_EQUAL);
					}
				}

				setState(939);
				expr(0);
				}
				break;
			case T_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(940);
				match(T_COMMENT);
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(941);
					match(T_EQUAL);
					}
				}

				setState(944);
				expr(0);
				}
				break;
			case T_CHARACTER:
			case T_CHARSET:
			case T_DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_DEFAULT) {
					{
					setState(945);
					match(T_DEFAULT);
					}
				}

				setState(951);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CHARACTER:
					{
					setState(948);
					match(T_CHARACTER);
					setState(949);
					match(T_SET);
					}
					break;
				case T_CHARSET:
					{
					setState(950);
					match(T_CHARSET);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(954);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(953);
					match(T_EQUAL);
					}
				}

				setState(956);
				expr(0);
				}
				break;
			case T_ENGINE:
				enterOuterAlt(_localctx, 4);
				{
				setState(957);
				match(T_ENGINE);
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_EQUAL) {
					{
					setState(958);
					match(T_EQUAL);
					}
				}

				setState(961);
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
		public TerminalNode T_VARCHAR2() { return getToken(PLHQLStatementsParser.T_VARCHAR2, 0); }
		public TerminalNode T_XML() { return getToken(PLHQLStatementsParser.T_XML, 0); }
		public TerminalNode T_VOID() { return getToken(PLHQLStatementsParser.T_VOID, 0); }
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
			setState(1010);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(964);
				match(T_CHAR);
				}
				break;
			case T_BIGINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				match(T_BIGINT);
				}
				break;
			case T_BINARY_DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(966);
				match(T_BINARY_DOUBLE);
				}
				break;
			case T_BINARY_FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(967);
				match(T_BINARY_FLOAT);
				}
				break;
			case T_BINARY_INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(968);
				match(T_BINARY_INTEGER);
				}
				break;
			case T_BIT:
				enterOuterAlt(_localctx, 6);
				{
				setState(969);
				match(T_BIT);
				}
				break;
			case T_DATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(970);
				match(T_DATE);
				}
				break;
			case T_DATETIME:
				enterOuterAlt(_localctx, 8);
				{
				setState(971);
				match(T_DATETIME);
				}
				break;
			case T_DEC:
				enterOuterAlt(_localctx, 9);
				{
				setState(972);
				match(T_DEC);
				}
				break;
			case T_DECIMAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(973);
				match(T_DECIMAL);
				}
				break;
			case T_DOUBLE:
				enterOuterAlt(_localctx, 11);
				{
				setState(974);
				match(T_DOUBLE);
				setState(976);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(975);
					match(T_PRECISION);
					}
					break;
				}
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 12);
				{
				setState(978);
				match(T_FLOAT);
				}
				break;
			case T_INT:
				enterOuterAlt(_localctx, 13);
				{
				setState(979);
				match(T_INT);
				}
				break;
			case T_INT2:
				enterOuterAlt(_localctx, 14);
				{
				setState(980);
				match(T_INT2);
				}
				break;
			case T_INT4:
				enterOuterAlt(_localctx, 15);
				{
				setState(981);
				match(T_INT4);
				}
				break;
			case T_INT8:
				enterOuterAlt(_localctx, 16);
				{
				setState(982);
				match(T_INT8);
				}
				break;
			case T_INTEGER:
				enterOuterAlt(_localctx, 17);
				{
				setState(983);
				match(T_INTEGER);
				}
				break;
			case T_NCHAR:
				enterOuterAlt(_localctx, 18);
				{
				setState(984);
				match(T_NCHAR);
				}
				break;
			case T_NVARCHAR:
				enterOuterAlt(_localctx, 19);
				{
				setState(985);
				match(T_NVARCHAR);
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 20);
				{
				setState(986);
				match(T_NUMBER);
				}
				break;
			case T_NUMERIC:
				enterOuterAlt(_localctx, 21);
				{
				setState(987);
				match(T_NUMERIC);
				}
				break;
			case T_PLS_INTEGER:
				enterOuterAlt(_localctx, 22);
				{
				setState(988);
				match(T_PLS_INTEGER);
				}
				break;
			case T_REAL:
				enterOuterAlt(_localctx, 23);
				{
				setState(989);
				match(T_REAL);
				}
				break;
			case T_RESULT_SET_LOCATOR:
				enterOuterAlt(_localctx, 24);
				{
				setState(990);
				match(T_RESULT_SET_LOCATOR);
				setState(991);
				match(T_VARYING);
				}
				break;
			case T_SIMPLE_FLOAT:
				enterOuterAlt(_localctx, 25);
				{
				setState(992);
				match(T_SIMPLE_FLOAT);
				}
				break;
			case T_SIMPLE_DOUBLE:
				enterOuterAlt(_localctx, 26);
				{
				setState(993);
				match(T_SIMPLE_DOUBLE);
				}
				break;
			case T_SIMPLE_INTEGER:
				enterOuterAlt(_localctx, 27);
				{
				setState(994);
				match(T_SIMPLE_INTEGER);
				}
				break;
			case T_SMALLINT:
				enterOuterAlt(_localctx, 28);
				{
				setState(995);
				match(T_SMALLINT);
				}
				break;
			case T_SMALLDATETIME:
				enterOuterAlt(_localctx, 29);
				{
				setState(996);
				match(T_SMALLDATETIME);
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 30);
				{
				setState(997);
				match(T_STRING);
				}
				break;
			case T_SYS_REFCURSOR:
				enterOuterAlt(_localctx, 31);
				{
				setState(998);
				match(T_SYS_REFCURSOR);
				}
				break;
			case T_TIMESTAMP:
				enterOuterAlt(_localctx, 32);
				{
				setState(999);
				match(T_TIMESTAMP);
				}
				break;
			case T_TINYINT:
				enterOuterAlt(_localctx, 33);
				{
				setState(1000);
				match(T_TINYINT);
				}
				break;
			case T_VARCHAR:
				enterOuterAlt(_localctx, 34);
				{
				setState(1001);
				match(T_VARCHAR);
				}
				break;
			case T_VARCHAR2:
				enterOuterAlt(_localctx, 35);
				{
				setState(1002);
				match(T_VARCHAR2);
				}
				break;
			case T_XML:
				enterOuterAlt(_localctx, 36);
				{
				setState(1003);
				match(T_XML);
				}
				break;
			case T_VOID:
				enterOuterAlt(_localctx, 37);
				{
				setState(1004);
				match(T_VOID);
				}
				break;
			case L_ID:
				enterOuterAlt(_localctx, 38);
				{
				setState(1005);
				ident();
				setState(1008);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(1006);
					match(T__2);
					setState(1007);
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
			setState(1012);
			match(T_OPEN_P);
			setState(1013);
			_la = _input.LA(1);
			if ( !(_la==T_MAX || _la==L_INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_BYTE || _la==T_CHAR) {
				{
				setState(1014);
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

			setState(1019);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_COMMA) {
				{
				setState(1017);
				match(T_COMMA);
				setState(1018);
				match(L_INT);
				}
			}

			setState(1021);
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
			setState(1034);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1023);
					match(T_NOT);
					}
				}

				setState(1026);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1027);
				match(T_CHARACTER);
				setState(1028);
				match(T_SET);
				setState(1029);
				ident();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1030);
					match(T_NOT);
					}
				}

				setState(1033);
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
			setState(1048);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COLON:
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COLON) {
					{
					setState(1036);
					match(T_COLON);
					}
				}

				setState(1039);
				match(T_EQUAL);
				setState(1040);
				expr(0);
				}
				break;
			case T_DEFAULT:
			case T_WITH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_WITH) {
					{
					setState(1041);
					match(T_WITH);
					}
				}

				setState(1044);
				match(T_DEFAULT);
				setState(1046);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1045);
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
			setState(1050);
			match(T_CREATE);
			setState(1051);
			_la = _input.LA(1);
			if ( !(_la==T_DATABASE || _la==T_SCHEMA) ) {
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
			if (_la==T_IF) {
				{
				setState(1052);
				match(T_IF);
				setState(1053);
				match(T_NOT);
				setState(1054);
				match(T_EXISTS);
				}
			}

			setState(1057);
			expr(0);
			setState(1061);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1058);
					create_database_option();
					}
					} 
				}
				setState(1063);
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
			setState(1068);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064);
				match(T_COMMENT);
				setState(1065);
				expr(0);
				}
				break;
			case T_LOCATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				match(T_LOCATION);
				setState(1067);
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
			setState(1070);
			dtype();
			setState(1071);
			ident();
			setState(1072);
			match(T_OPEN_P);
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (T_BIGINT - 22)) | (1L << (T_BINARY_DOUBLE - 22)) | (1L << (T_BINARY_FLOAT - 22)) | (1L << (T_BINARY_INTEGER - 22)) | (1L << (T_BIT - 22)) | (1L << (T_CHAR - 22)) | (1L << (T_DATE - 22)) | (1L << (T_DATETIME - 22)) | (1L << (T_DEC - 22)) | (1L << (T_DECIMAL - 22)))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (T_DOUBLE - 90)) | (1L << (T_FLOAT - 90)) | (1L << (T_INT - 90)) | (1L << (T_INT2 - 90)) | (1L << (T_INT4 - 90)) | (1L << (T_INT8 - 90)) | (1L << (T_INTEGER - 90)))) != 0) || ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (T_NCHAR - 184)) | (1L << (T_NVARCHAR - 184)) | (1L << (T_NUMERIC - 184)) | (1L << (T_NUMBER - 184)) | (1L << (T_PLS_INTEGER - 184)) | (1L << (T_REAL - 184)) | (1L << (T_RESULT_SET_LOCATOR - 184)))) != 0) || ((((_la - 261)) & ~0x3f) == 0 && ((1L << (_la - 261)) & ((1L << (T_SIMPLE_DOUBLE - 261)) | (1L << (T_SIMPLE_FLOAT - 261)) | (1L << (T_SIMPLE_INTEGER - 261)) | (1L << (T_SMALLDATETIME - 261)) | (1L << (T_SMALLINT - 261)) | (1L << (T_STRING - 261)) | (1L << (T_SYS_REFCURSOR - 261)) | (1L << (T_TIMESTAMP - 261)) | (1L << (T_TINYINT - 261)) | (1L << (T_VARCHAR - 261)) | (1L << (T_VARCHAR2 - 261)) | (1L << (T_VOID - 261)) | (1L << (T_XML - 261)))) != 0) || _la==L_ID) {
				{
				setState(1073);
				c_function_parameter_list();
				}
			}

			setState(1076);
			match(T_CLOSE_P);
			setState(1077);
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
			setState(1079);
			c_function_parameter_item();
			setState(1084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1080);
				match(T_COMMA);
				setState(1081);
				c_function_parameter_item();
				}
				}
				setState(1086);
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
			setState(1087);
			dtype();
			setState(1088);
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
			setState(1097);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1090);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1091);
				match(T_CREATE);
				setState(1094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1092);
					match(T_OR);
					setState(1093);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1096);
				match(T_REPLACE);
				}
				break;
			case T_FUNCTION:
				break;
			default:
				break;
			}
			setState(1099);
			match(T_FUNCTION);
			setState(1100);
			ident();
			setState(1102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1101);
				create_routine_params();
				}
				break;
			}
			setState(1104);
			create_function_return();
			setState(1106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS || _la==T_IS) {
				{
				setState(1105);
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

			setState(1109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1108);
				declare_block_inplace();
				}
				break;
			}
			setState(1111);
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
			setState(1113);
			_la = _input.LA(1);
			if ( !(_la==T_RETURN || _la==T_RETURNS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1114);
			dtype();
			setState(1116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1115);
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
			setState(1125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1118);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1119);
				match(T_CREATE);
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1120);
					match(T_OR);
					setState(1121);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1124);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1127);
			match(T_PACKAGE);
			setState(1128);
			ident();
			setState(1129);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1130);
			package_spec();
			setState(1131);
			match(T_END);
			setState(1135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1132);
				ident();
				setState(1133);
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
			setState(1137);
			package_spec_item();
			setState(1138);
			match(T_SEMICOLON);
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_FUNCTION || _la==T_PROC || _la==T_PROCEDURE || _la==L_ID) {
				{
				{
				setState(1139);
				package_spec_item();
				setState(1140);
				match(T_SEMICOLON);
				}
				}
				setState(1146);
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
			setState(1160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1147);
				declare_stmt_item();
				}
				break;
			case T_FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(1148);
				match(T_FUNCTION);
				setState(1149);
				ident();
				setState(1151);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1150);
					create_routine_params();
					}
					break;
				}
				setState(1153);
				create_function_return();
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1155);
				_la = _input.LA(1);
				if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1156);
				ident();
				setState(1158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1157);
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
			setState(1169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_ALTER:
				{
				setState(1162);
				match(T_ALTER);
				}
				break;
			case T_CREATE:
				{
				setState(1163);
				match(T_CREATE);
				setState(1166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1164);
					match(T_OR);
					setState(1165);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1168);
				match(T_REPLACE);
				}
				break;
			case T_PACKAGE:
				break;
			default:
				break;
			}
			setState(1171);
			match(T_PACKAGE);
			setState(1172);
			match(T_BODY);
			setState(1173);
			ident();
			setState(1174);
			_la = _input.LA(1);
			if ( !(_la==T_AS || _la==T_IS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1175);
			package_body();
			setState(1176);
			match(T_END);
			setState(1180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1177);
				ident();
				setState(1178);
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
			setState(1182);
			package_body_item();
			setState(1183);
			match(T_SEMICOLON);
			setState(1189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ALTER || _la==T_CREATE || _la==T_FUNCTION || ((((_la - 218)) & ~0x3f) == 0 && ((1L << (_la - 218)) & ((1L << (T_PROC - 218)) | (1L << (T_PROCEDURE - 218)) | (1L << (T_REPLACE - 218)))) != 0) || _la==L_ID) {
				{
				{
				setState(1184);
				package_body_item();
				setState(1185);
				match(T_SEMICOLON);
				}
				}
				setState(1191);
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
			setState(1195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1192);
				declare_stmt_item();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1193);
				create_function_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1194);
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
			setState(1203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CREATE:
				{
				setState(1197);
				match(T_CREATE);
				setState(1200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1198);
					match(T_OR);
					setState(1199);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1202);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
			}
			setState(1205);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1206);
			ident();
			setState(1208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1207);
				create_routine_params();
				}
				break;
			}
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS || _la==T_IS) {
				{
				setState(1210);
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

			setState(1214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1213);
				declare_block_inplace();
				}
				break;
			}
			setState(1216);
			proc_block();
			setState(1220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1217);
				ident();
				setState(1218);
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
			setState(1228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_CREATE:
				{
				setState(1222);
				match(T_CREATE);
				setState(1225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OR) {
					{
					setState(1223);
					match(T_OR);
					setState(1224);
					match(T_REPLACE);
					}
				}

				}
				break;
			case T_REPLACE:
				{
				setState(1227);
				match(T_REPLACE);
				}
				break;
			case T_PROC:
			case T_PROCEDURE:
				break;
			default:
				break;
			}
			setState(1230);
			_la = _input.LA(1);
			if ( !(_la==T_PROC || _la==T_PROCEDURE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1231);
				create_routine_params();
				}
				break;
			}
			setState(1235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS || _la==T_IS) {
				{
				setState(1234);
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

			setState(1238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1237);
				declare_block_inplace();
				}
				break;
			}
			setState(1240);
			proc_block();
			setState(1244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1241);
				ident();
				setState(1242);
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
			setState(1268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1246);
				match(T_OPEN_P);
				setState(1247);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
				match(T_OPEN_P);
				setState(1249);
				create_routine_param_item();
				setState(1254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1250);
					match(T_COMMA);
					setState(1251);
					create_routine_param_item();
					}
					}
					setState(1256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1257);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1259);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("IS") &&
				        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
				        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
				        )) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"IS\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"AS\") &&\r\n        !(_input.LT(1).getText().equalsIgnoreCase(\"DYNAMIC\") && _input.LT(2).getText().equalsIgnoreCase(\"RESULT\"))\r\n        ");
				setState(1260);
				create_routine_param_item();
				setState(1265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1261);
					match(T_COMMA);
					setState(1262);
					create_routine_param_item();
					}
					}
					setState(1267);
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
			setState(1312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1275);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
				case 1:
					{
					setState(1270);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1271);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1272);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1273);
					match(T_IN);
					setState(1274);
					match(T_OUT);
					}
					break;
				}
				setState(1277);
				ident();
				setState(1278);
				dtype();
				setState(1280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,148,_ctx) ) {
				case 1:
					{
					setState(1279);
					dtype_len();
					}
					break;
				}
				setState(1285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1282);
						dtype_attr();
						}
						} 
					}
					setState(1287);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				}
				setState(1289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
				case 1:
					{
					setState(1288);
					dtype_default();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1291);
				ident();
				setState(1297);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1292);
					match(T_IN);
					}
					break;
				case 2:
					{
					setState(1293);
					match(T_OUT);
					}
					break;
				case 3:
					{
					setState(1294);
					match(T_INOUT);
					}
					break;
				case 4:
					{
					setState(1295);
					match(T_IN);
					setState(1296);
					match(T_OUT);
					}
					break;
				}
				setState(1299);
				dtype();
				setState(1301);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1300);
					dtype_len();
					}
					break;
				}
				setState(1306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1303);
						dtype_attr();
						}
						} 
					}
					setState(1308);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				}
				setState(1310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
				case 1:
					{
					setState(1309);
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
			setState(1314);
			_la = _input.LA(1);
			if ( !(_la==T_EXEC || _la==T_EXECUTE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_IMMEDIATE) {
				{
				setState(1315);
				match(T_IMMEDIATE);
				}
			}

			setState(1318);
			expr(0);
			setState(1324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1319);
				match(T_OPEN_P);
				setState(1320);
				expr_func_params();
				setState(1321);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1323);
				expr_func_params();
				}
				break;
			}
			setState(1335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				{
				setState(1326);
				match(T_INTO);
				setState(1327);
				match(L_ID);
				setState(1332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,158,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1328);
						match(T_COMMA);
						setState(1329);
						match(L_ID);
						}
						} 
					}
					setState(1334);
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
			setState(1340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1337);
				if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1338);
				if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1339);
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
		enterRule(_localctx, 144, RULE_error_if_stmt);
		try {
			setState(1345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1342);
				error_if_plsql_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1343);
				error_if_tsql_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1344);
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
		enterRule(_localctx, 146, RULE_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1347);
			match(T_IF);
			setState(1348);
			bool_expr(0);
			setState(1349);
			match(T_THEN);
			setState(1350);
			block();
			setState(1354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1351);
				elseif_block();
				}
				}
				setState(1356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1357);
				else_block();
				}
			}

			setState(1360);
			match(T_END);
			setState(1361);
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
		enterRule(_localctx, 148, RULE_error_if_plsql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			match(T_IF);
			setState(1364);
			match(T_THEN);
			setState(1365);
			block();
			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_ELSEIF || _la==T_ELSIF) {
				{
				{
				setState(1366);
				elseif_block();
				}
				}
				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(1372);
				else_block();
				}
			}

			setState(1375);
			match(T_END);
			setState(1376);
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
		enterRule(_localctx, 150, RULE_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			match(T_IF);
			setState(1379);
			bool_expr(0);
			setState(1380);
			single_block_stmt();
			setState(1383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
			case 1:
				{
				setState(1381);
				match(T_ELSE);
				setState(1382);
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
		enterRule(_localctx, 152, RULE_error_if_tsql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1385);
			match(T_IF);
			setState(1386);
			single_block_stmt();
			setState(1389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
			case 1:
				{
				setState(1387);
				match(T_ELSE);
				setState(1388);
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
		enterRule(_localctx, 154, RULE_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			match(T__3);
			setState(1392);
			match(T_IF);
			setState(1393);
			bool_expr(0);
			setState(1394);
			match(T_THEN);
			setState(1395);
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
		enterRule(_localctx, 156, RULE_error_if_bteq_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1397);
			match(T__3);
			setState(1398);
			match(T_IF);
			setState(1399);
			match(T_THEN);
			setState(1400);
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
		enterRule(_localctx, 158, RULE_elseif_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			_la = _input.LA(1);
			if ( !(_la==T_ELSEIF || _la==T_ELSIF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1403);
			bool_expr(0);
			setState(1404);
			match(T_THEN);
			setState(1405);
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
		enterRule(_localctx, 160, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			match(T_ELSE);
			setState(1408);
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
		enterRule(_localctx, 162, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			match(T_CREATE);
			setState(1412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1411);
				match(T_UNIQUE);
				}
			}

			setState(1414);
			match(T_INDEX);
			setState(1415);
			ident();
			setState(1416);
			match(T_ON);
			setState(1417);
			table_name();
			setState(1418);
			match(T_OPEN_P);
			setState(1419);
			create_index_col();
			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1420);
				match(T_COMMA);
				setState(1421);
				create_index_col();
				}
				}
				setState(1426);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1427);
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
		enterRule(_localctx, 164, RULE_error_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			match(T_CREATE);
			setState(1431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_UNIQUE) {
				{
				setState(1430);
				match(T_UNIQUE);
				}
			}

			setState(1433);
			match(T_OPEN_P);
			setState(1434);
			create_index_col();
			setState(1439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1435);
				match(T_COMMA);
				setState(1436);
				create_index_col();
				}
				}
				setState(1441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1442);
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
		enterRule(_localctx, 166, RULE_create_index_col);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1444);
			ident();
			setState(1446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ASC || _la==T_DESC) {
				{
				setState(1445);
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
		enterRule(_localctx, 168, RULE_return_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448);
			match(T_RETURN);
			setState(1450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(1449);
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
		enterRule(_localctx, 170, RULE_for_range_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
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
			setState(1467);
			match(T_END);
			setState(1468);
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
		enterRule(_localctx, 172, RULE_error_for_range_stmt);
		int _la;
		try {
			setState(1520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1470);
				match(T_FOR);
				setState(1471);
				match(L_ID);
				setState(1472);
				match(T_IN);
				setState(1474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_REVERSE) {
					{
					setState(1473);
					match(T_REVERSE);
					}
				}

				setState(1476);
				expr(0);
				setState(1477);
				match(T_DOT2);
				setState(1478);
				expr(0);
				setState(1481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_BY || _la==T_STEP) {
					{
					setState(1479);
					_la = _input.LA(1);
					if ( !(_la==T_BY || _la==T_STEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1480);
					expr(0);
					}
				}

				setState(1483);
				block();
				setState(1484);
				match(T_END);
				setState(1485);
				match(T_LOOP);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1487);
				match(T_FOR);
				setState(1488);
				match(L_ID);
				setState(1489);
				match(T_IN);
				setState(1491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_REVERSE) {
					{
					setState(1490);
					match(T_REVERSE);
					}
				}

				setState(1493);
				expr(0);
				setState(1494);
				match(T_DOT2);
				setState(1495);
				expr(0);
				setState(1498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_BY || _la==T_STEP) {
					{
					setState(1496);
					_la = _input.LA(1);
					if ( !(_la==T_BY || _la==T_STEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1497);
					expr(0);
					}
				}

				setState(1500);
				match(T_LOOP);
				setState(1501);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1503);
				match(T_FOR);
				setState(1504);
				match(L_ID);
				setState(1505);
				match(T_IN);
				setState(1507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_REVERSE) {
					{
					setState(1506);
					match(T_REVERSE);
					}
				}

				setState(1509);
				expr(0);
				setState(1510);
				match(T_DOT2);
				setState(1511);
				expr(0);
				setState(1514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_BY || _la==T_STEP) {
					{
					setState(1512);
					_la = _input.LA(1);
					if ( !(_la==T_BY || _la==T_STEP) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1513);
					expr(0);
					}
				}

				setState(1516);
				match(T_LOOP);
				setState(1517);
				match(T_END);
				setState(1518);
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
		enterRule(_localctx, 174, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_WITH) {
				{
				setState(1522);
				cte_select_stmt();
				}
			}

			setState(1525);
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
		enterRule(_localctx, 176, RULE_cte_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			match(T_WITH);
			setState(1528);
			cte_select_stmt_item();
			setState(1533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1529);
				match(T_COMMA);
				setState(1530);
				cte_select_stmt_item();
				}
				}
				setState(1535);
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
		enterRule(_localctx, 178, RULE_cte_select_stmt_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1536);
			ident();
			setState(1538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_OPEN_P) {
				{
				setState(1537);
				cte_select_cols();
				}
			}

			setState(1540);
			match(T_AS);
			setState(1541);
			match(T_OPEN_P);
			setState(1542);
			fullselect_stmt();
			setState(1543);
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
		enterRule(_localctx, 180, RULE_cte_select_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			match(T_OPEN_P);
			setState(1546);
			ident();
			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1547);
				match(T_COMMA);
				setState(1548);
				ident();
				}
				}
				setState(1553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1554);
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
		enterRule(_localctx, 182, RULE_fullselect_stmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			fullselect_stmt_item();
			setState(1562);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1557);
					fullselect_set_clause();
					setState(1558);
					fullselect_stmt_item();
					}
					} 
				}
				setState(1564);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
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
		enterRule(_localctx, 184, RULE_fullselect_stmt_item);
		try {
			setState(1570);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1565);
				subselect_stmt();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1566);
				match(T_OPEN_P);
				setState(1567);
				fullselect_stmt();
				setState(1568);
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
		enterRule(_localctx, 186, RULE_fullselect_set_clause);
		int _la;
		try {
			setState(1584);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_UNION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1572);
				match(T_UNION);
				setState(1574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1573);
					match(T_ALL);
					}
				}

				}
				break;
			case T_EXCEPT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1576);
				match(T_EXCEPT);
				setState(1578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1577);
					match(T_ALL);
					}
				}

				}
				break;
			case T_INTERSECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1580);
				match(T_INTERSECT);
				setState(1582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL) {
					{
					setState(1581);
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
		enterRule(_localctx, 188, RULE_subselect_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			_la = _input.LA(1);
			if ( !(_la==T_SEL || _la==T_SELECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1587);
			select_list();
			setState(1589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_INTO) {
				{
				setState(1588);
				into_clause();
				}
			}

			setState(1591);
			from_clause();
			setState(1593);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				{
				setState(1592);
				where_clause();
				}
				break;
			}
			setState(1596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1595);
				group_by_clause();
				}
				break;
			}
			setState(1600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1598);
				having_clause();
				}
				break;
			case 2:
				{
				setState(1599);
				qualify_clause();
				}
				break;
			}
			setState(1603);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1602);
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
		enterRule(_localctx, 190, RULE_error_subselect);
		int _la;
		try {
			setState(1624);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_SEL:
			case T_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1605);
				_la = _input.LA(1);
				if ( !(_la==T_SEL || _la==T_SELECT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1606);
				select_list();
				setState(1608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1607);
					into_clause();
					}
					break;
				}
				setState(1611);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1610);
					where_clause();
					}
					break;
				}
				setState(1614);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1613);
					group_by_clause();
					}
					break;
				}
				setState(1618);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1616);
					having_clause();
					}
					break;
				case 2:
					{
					setState(1617);
					qualify_clause();
					}
					break;
				}
				setState(1621);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1620);
					order_by_clause();
					}
					break;
				}
				}
				break;
			case T_FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1623);
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
		enterRule(_localctx, 192, RULE_select_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ALL || _la==T_DISTINCT) {
				{
				setState(1626);
				select_list_set();
				}
			}

			setState(1630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_TOP) {
				{
				setState(1629);
				select_list_limit();
				}
			}

			setState(1632);
			select_list_item();
			setState(1637);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1633);
					match(T_COMMA);
					setState(1634);
					select_list_item();
					}
					} 
				}
				setState(1639);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,206,_ctx);
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
		enterRule(_localctx, 194, RULE_select_list_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
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
		enterRule(_localctx, 196, RULE_select_list_limit);
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
		enterRule(_localctx, 198, RULE_select_list_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
			case 1:
				{
				setState(1648);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1645);
					ident();
					setState(1646);
					match(T_EQUAL);
					}
					break;
				}
				setState(1650);
				expr(0);
				setState(1652);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1651);
					select_list_alias();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1654);
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
		enterRule(_localctx, 200, RULE_select_list_alias);
		int _la;
		try {
			setState(1666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1657);
				if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\") && !_input.LT(1).getText().equalsIgnoreCase(\"FROM\")");
				setState(1659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_AS) {
					{
					setState(1658);
					match(T_AS);
					}
				}

				setState(1661);
				ident();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1662);
				match(T_OPEN_P);
				setState(1663);
				match(T_TITLE);
				setState(1664);
				match(L_S_STRING);
				setState(1665);
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
		enterRule(_localctx, 202, RULE_select_list_asterisk);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_ID) {
				{
				setState(1668);
				match(L_ID);
				setState(1669);
				match(T__3);
				}
			}

			setState(1672);
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
		enterRule(_localctx, 204, RULE_into_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			match(T_INTO);
			setState(1675);
			ident();
			setState(1680);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1676);
					match(T_COMMA);
					setState(1677);
					ident();
					}
					} 
				}
				setState(1682);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
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
		enterRule(_localctx, 206, RULE_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1683);
			match(T_FROM);
			setState(1684);
			from_table_clause();
			setState(1688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1685);
					from_join_clause();
					}
					} 
				}
				setState(1690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
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
		enterRule(_localctx, 208, RULE_error_from_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			match(T_FROM);
			setState(1695);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,215,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1692);
					from_join_clause();
					}
					} 
				}
				setState(1697);
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
		enterRule(_localctx, 210, RULE_from_table_clause);
		try {
			setState(1701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1698);
				from_table_name_clause();
				}
				break;
			case T_OPEN_P:
				enterOuterAlt(_localctx, 2);
				{
				setState(1699);
				from_subselect_clause();
				}
				break;
			case T_TABLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1700);
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
		enterRule(_localctx, 212, RULE_from_table_name_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703);
			table_name();
			setState(1705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1704);
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
		enterRule(_localctx, 214, RULE_from_subselect_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1707);
			match(T_OPEN_P);
			setState(1708);
			select_stmt();
			setState(1709);
			match(T_CLOSE_P);
			setState(1711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1710);
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
		enterRule(_localctx, 216, RULE_from_join_clause);
		try {
			setState(1720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1713);
				match(T_COMMA);
				setState(1714);
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
				setState(1715);
				from_join_type_clause();
				setState(1716);
				from_table_clause();
				setState(1717);
				match(T_ON);
				setState(1718);
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
		enterRule(_localctx, 218, RULE_from_join_type_clause);
		int _la;
		try {
			setState(1731);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_INNER:
			case T_JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_INNER) {
					{
					setState(1722);
					match(T_INNER);
					}
				}

				setState(1725);
				match(T_JOIN);
				}
				break;
			case T_FULL:
			case T_LEFT:
			case T_RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1726);
				_la = _input.LA(1);
				if ( !(_la==T_FULL || _la==T_LEFT || _la==T_RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OUTER) {
					{
					setState(1727);
					match(T_OUTER);
					}
				}

				setState(1730);
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
		enterRule(_localctx, 220, RULE_from_table_values_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			match(T_TABLE);
			setState(1734);
			match(T_OPEN_P);
			setState(1735);
			match(T_VALUES);
			setState(1736);
			from_table_values_row();
			setState(1741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1737);
				match(T_COMMA);
				setState(1738);
				from_table_values_row();
				}
				}
				setState(1743);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1744);
			match(T_CLOSE_P);
			setState(1746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				{
				setState(1745);
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
		enterRule(_localctx, 222, RULE_from_table_values_row);
		int _la;
		try {
			setState(1760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1748);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1749);
				match(T_OPEN_P);
				setState(1750);
				expr(0);
				setState(1755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1751);
					match(T_COMMA);
					setState(1752);
					expr(0);
					}
					}
					setState(1757);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1758);
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
		enterRule(_localctx, 224, RULE_from_alias_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1762);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
			        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
			        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
			        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
			        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
			        !_input.LT(1).getText().equalsIgnoreCase("WITH"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"EXEC\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"EXECUTE\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"INNER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LEFT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"GROUP\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"ORDER\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"LIMIT\") &&\r\n        !_input.LT(1).getText().equalsIgnoreCase(\"WITH\")");
			setState(1764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_AS) {
				{
				setState(1763);
				match(T_AS);
				}
			}

			setState(1766);
			ident();
			setState(1777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1767);
				match(T_OPEN_P);
				setState(1768);
				match(L_ID);
				setState(1773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1769);
					match(T_COMMA);
					setState(1770);
					match(L_ID);
					}
					}
					setState(1775);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1776);
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
		enterRule(_localctx, 226, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
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
		enterRule(_localctx, 228, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			match(T_WHERE);
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
		enterRule(_localctx, 230, RULE_error_missing_bool_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
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
		enterRule(_localctx, 232, RULE_group_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1786);
			match(T_GROUP);
			setState(1787);
			match(T_BY);
			setState(1788);
			expr(0);
			setState(1793);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1789);
					match(T_COMMA);
					setState(1790);
					expr(0);
					}
					} 
				}
				setState(1795);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
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
		enterRule(_localctx, 234, RULE_having_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			match(T_HAVING);
			setState(1797);
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
		enterRule(_localctx, 236, RULE_qualify_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
			match(T_QUALIFY);
			setState(1800);
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
		enterRule(_localctx, 238, RULE_order_by_clause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			match(T_ORDER);
			setState(1803);
			match(T_BY);
			setState(1804);
			expr(0);
			setState(1806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1805);
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
			setState(1815);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1808);
					match(T_COMMA);
					setState(1809);
					expr(0);
					setState(1811);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
					case 1:
						{
						setState(1810);
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
				setState(1817);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,233,_ctx);
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
		int _startState = 240;
		enterRecursionRule(_localctx, 240, RULE_bool_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1827);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				{
				setState(1820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1819);
					match(T_NOT);
					}
				}

				setState(1822);
				match(T_OPEN_P);
				setState(1823);
				bool_expr(0);
				setState(1824);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1826);
				bool_expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1835);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,236,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Bool_exprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
					setState(1829);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1830);
					bool_expr_logical_operator();
					setState(1831);
					bool_expr(3);
					}
					} 
				}
				setState(1837);
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
		enterRule(_localctx, 242, RULE_bool_expr_atom);
		try {
			setState(1840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1838);
				bool_expr_unary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1839);
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
		enterRule(_localctx, 244, RULE_bool_expr_unary);
		int _la;
		try {
			setState(1865);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1842);
				expr(0);
				setState(1843);
				match(T_IS);
				setState(1845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1844);
					match(T_NOT);
					}
				}

				setState(1847);
				match(T_NULL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1849);
				expr(0);
				setState(1850);
				match(T_BETWEEN);
				setState(1851);
				expr(0);
				setState(1852);
				match(T_AND);
				setState(1853);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
				match(T_EXISTS);
				setState(1859);
				match(T_OPEN_P);
				setState(1860);
				select_stmt();
				setState(1861);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1863);
				bool_expr_single_in();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1864);
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
		enterRule(_localctx, 246, RULE_bool_expr_single_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			expr(0);
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
			match(T_IN);
			setState(1872);
			match(T_OPEN_P);
			setState(1882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				{
				{
				setState(1873);
				expr(0);
				setState(1878);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(1874);
					match(T_COMMA);
					setState(1875);
					expr(0);
					}
					}
					setState(1880);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				setState(1881);
				select_stmt();
				}
				break;
			}
			setState(1884);
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
		enterRule(_localctx, 248, RULE_bool_expr_multi_in);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			match(T_OPEN_P);
			setState(1887);
			expr(0);
			setState(1892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(1888);
				match(T_COMMA);
				setState(1889);
				expr(0);
				}
				}
				setState(1894);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1895);
			match(T_CLOSE_P);
			setState(1897);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_NOT) {
				{
				setState(1896);
				match(T_NOT);
				}
			}

			setState(1899);
			match(T_IN);
			setState(1900);
			match(T_OPEN_P);
			setState(1901);
			select_stmt();
			setState(1902);
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
		enterRule(_localctx, 250, RULE_bool_expr_binary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1904);
			expr(0);
			setState(1905);
			bool_expr_binary_operator();
			setState(1906);
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
		enterRule(_localctx, 252, RULE_bool_expr_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
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
		public TerminalNode T_EQUAL() { return getToken(PLHQLStatementsParser.T_EQUAL, 0); }
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
		enterRule(_localctx, 254, RULE_bool_expr_binary_operator);
		int _la;
		try {
			setState(1922);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1910);
				match(T_EQUAL);
				}
				break;
			case T_EQUAL2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1911);
				match(T_EQUAL2);
				}
				break;
			case T_NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1912);
				match(T_NOTEQUAL);
				}
				break;
			case T_NOTEQUAL2:
				enterOuterAlt(_localctx, 4);
				{
				setState(1913);
				match(T_NOTEQUAL2);
				}
				break;
			case T_LESS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1914);
				match(T_LESS);
				}
				break;
			case T_LESSEQUAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1915);
				match(T_LESSEQUAL);
				}
				break;
			case T_GREATER:
				enterOuterAlt(_localctx, 7);
				{
				setState(1916);
				match(T_GREATER);
				}
				break;
			case T_GREATEREQUAL:
				enterOuterAlt(_localctx, 8);
				{
				setState(1917);
				match(T_GREATEREQUAL);
				}
				break;
			case T_LIKE:
			case T_NOT:
			case T_REGEXP:
			case T_RLIKE:
				enterOuterAlt(_localctx, 9);
				{
				setState(1919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_NOT) {
					{
					setState(1918);
					match(T_NOT);
					}
				}

				setState(1921);
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
		int _startState = 256;
		enterRecursionRule(_localctx, 256, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1940);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(1925);
				match(T_OPEN_P);
				setState(1926);
				select_stmt();
				setState(1927);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				{
				setState(1929);
				match(T_OPEN_P);
				setState(1930);
				expr(0);
				setState(1931);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				{
				setState(1933);
				expr_interval();
				}
				break;
			case 4:
				{
				setState(1934);
				expr_concat();
				}
				break;
			case 5:
				{
				setState(1935);
				expr_case();
				}
				break;
			case 6:
				{
				setState(1936);
				expr_agg_window_func();
				}
				break;
			case 7:
				{
				setState(1937);
				expr_spec_func();
				}
				break;
			case 8:
				{
				setState(1938);
				expr_func();
				}
				break;
			case 9:
				{
				setState(1939);
				expr_atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1958);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1956);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,249,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1942);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1943);
						match(T_MUL);
						setState(1944);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1945);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1946);
						match(T_DIV);
						setState(1947);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1948);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1949);
						match(T_ADD);
						setState(1950);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1951);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1952);
						match(T_SUB);
						setState(1953);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1954);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1955);
						interval_item();
						}
						break;
					}
					} 
				}
				setState(1960);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,250,_ctx);
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
		enterRule(_localctx, 258, RULE_expr_atom);
		try {
			setState(1969);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1961);
				date_literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1962);
				timestamp_literal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1963);
				bool_literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1964);
				ident();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1965);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1966);
				dec_number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1967);
				int_number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1968);
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
		enterRule(_localctx, 260, RULE_expr_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			match(T_INTERVAL);
			setState(1972);
			expr(0);
			setState(1973);
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
		enterRule(_localctx, 262, RULE_interval_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1975);
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
		enterRule(_localctx, 264, RULE_expr_concat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			expr_concat_item();
			setState(1978);
			_la = _input.LA(1);
			if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1979);
			expr_concat_item();
			setState(1984);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1980);
					_la = _input.LA(1);
					if ( !(_la==T_CONCAT || _la==T_PIPE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1981);
					expr_concat_item();
					}
					} 
				}
				setState(1986);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
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
		enterRule(_localctx, 266, RULE_expr_concat_item);
		try {
			setState(1996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1987);
				match(T_OPEN_P);
				setState(1988);
				expr(0);
				setState(1989);
				match(T_CLOSE_P);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1991);
				expr_case();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1992);
				expr_agg_window_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1993);
				expr_spec_func();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1994);
				expr_func();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1995);
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
		enterRule(_localctx, 268, RULE_expr_case);
		try {
			setState(2000);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1998);
				expr_case_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1999);
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
		enterRule(_localctx, 270, RULE_expr_case_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2002);
			match(T_CASE);
			setState(2003);
			expr(0);
			setState(2009); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2004);
				match(T_WHEN);
				setState(2005);
				expr(0);
				setState(2006);
				match(T_THEN);
				setState(2007);
				expr(0);
				}
				}
				setState(2011); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2015);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2013);
				match(T_ELSE);
				setState(2014);
				expr(0);
				}
			}

			setState(2017);
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
		enterRule(_localctx, 272, RULE_expr_case_searched);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2019);
			match(T_CASE);
			setState(2025); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2020);
				match(T_WHEN);
				setState(2021);
				bool_expr(0);
				setState(2022);
				match(T_THEN);
				setState(2023);
				expr(0);
				}
				}
				setState(2027); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T_WHEN );
			setState(2031);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ELSE) {
				{
				setState(2029);
				match(T_ELSE);
				setState(2030);
				expr(0);
				}
			}

			setState(2033);
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
		enterRule(_localctx, 274, RULE_expr_agg_window_func);
		int _la;
		try {
			setState(2187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_AVG:
				enterOuterAlt(_localctx, 1);
				{
				setState(2035);
				match(T_AVG);
				setState(2036);
				match(T_OPEN_P);
				setState(2038);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2037);
					expr_func_all_distinct();
					}
				}

				setState(2040);
				expr(0);
				setState(2041);
				match(T_CLOSE_P);
				setState(2043);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
				case 1:
					{
					setState(2042);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2045);
				match(T_COUNT);
				setState(2046);
				match(T_OPEN_P);
				setState(2052);
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
					setState(2048);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ALL || _la==T_DISTINCT) {
						{
						setState(2047);
						expr_func_all_distinct();
						}
					}

					setState(2050);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2051);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2054);
				match(T_CLOSE_P);
				setState(2056);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(2055);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_COUNT_BIG:
				enterOuterAlt(_localctx, 3);
				{
				setState(2058);
				match(T_COUNT_BIG);
				setState(2059);
				match(T_OPEN_P);
				setState(2065);
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
					setState(2061);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_ALL || _la==T_DISTINCT) {
						{
						setState(2060);
						expr_func_all_distinct();
						}
					}

					setState(2063);
					expr(0);
					}
					}
					break;
				case T_MUL:
					{
					setState(2064);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2067);
				match(T_CLOSE_P);
				setState(2069);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(2068);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_CUME_DIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(2071);
				match(T_CUME_DIST);
				setState(2072);
				match(T_OPEN_P);
				setState(2073);
				match(T_CLOSE_P);
				setState(2074);
				expr_func_over_clause();
				}
				break;
			case T_DENSE_RANK:
				enterOuterAlt(_localctx, 5);
				{
				setState(2075);
				match(T_DENSE_RANK);
				setState(2076);
				match(T_OPEN_P);
				setState(2077);
				match(T_CLOSE_P);
				setState(2078);
				expr_func_over_clause();
				}
				break;
			case T_FIRST_VALUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(2079);
				match(T_FIRST_VALUE);
				setState(2080);
				match(T_OPEN_P);
				setState(2081);
				expr(0);
				setState(2082);
				match(T_CLOSE_P);
				setState(2083);
				expr_func_over_clause();
				}
				break;
			case T_LAG:
				enterOuterAlt(_localctx, 7);
				{
				setState(2085);
				match(T_LAG);
				setState(2086);
				match(T_OPEN_P);
				setState(2087);
				expr(0);
				setState(2094);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2088);
					match(T_COMMA);
					setState(2089);
					expr(0);
					setState(2092);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2090);
						match(T_COMMA);
						setState(2091);
						expr(0);
						}
					}

					}
				}

				setState(2096);
				match(T_CLOSE_P);
				setState(2097);
				expr_func_over_clause();
				}
				break;
			case T_LAST_VALUE:
				enterOuterAlt(_localctx, 8);
				{
				setState(2099);
				match(T_LAST_VALUE);
				setState(2100);
				match(T_OPEN_P);
				setState(2101);
				expr(0);
				setState(2102);
				match(T_CLOSE_P);
				setState(2103);
				expr_func_over_clause();
				}
				break;
			case T_LEAD:
				enterOuterAlt(_localctx, 9);
				{
				setState(2105);
				match(T_LEAD);
				setState(2106);
				match(T_OPEN_P);
				setState(2107);
				expr(0);
				setState(2114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2108);
					match(T_COMMA);
					setState(2109);
					expr(0);
					setState(2112);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T_COMMA) {
						{
						setState(2110);
						match(T_COMMA);
						setState(2111);
						expr(0);
						}
					}

					}
				}

				setState(2116);
				match(T_CLOSE_P);
				setState(2117);
				expr_func_over_clause();
				}
				break;
			case T_MAX:
				enterOuterAlt(_localctx, 10);
				{
				setState(2119);
				match(T_MAX);
				setState(2120);
				match(T_OPEN_P);
				setState(2122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2121);
					expr_func_all_distinct();
					}
				}

				setState(2124);
				expr(0);
				setState(2125);
				match(T_CLOSE_P);
				setState(2127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
				case 1:
					{
					setState(2126);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_MIN:
				enterOuterAlt(_localctx, 11);
				{
				setState(2129);
				match(T_MIN);
				setState(2130);
				match(T_OPEN_P);
				setState(2132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2131);
					expr_func_all_distinct();
					}
				}

				setState(2134);
				expr(0);
				setState(2135);
				match(T_CLOSE_P);
				setState(2137);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(2136);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_RANK:
				enterOuterAlt(_localctx, 12);
				{
				setState(2139);
				match(T_RANK);
				setState(2140);
				match(T_OPEN_P);
				setState(2141);
				match(T_CLOSE_P);
				setState(2142);
				expr_func_over_clause();
				}
				break;
			case T_ROW_NUMBER:
				enterOuterAlt(_localctx, 13);
				{
				setState(2143);
				match(T_ROW_NUMBER);
				setState(2144);
				match(T_OPEN_P);
				setState(2145);
				match(T_CLOSE_P);
				setState(2146);
				expr_func_over_clause();
				}
				break;
			case T_STDEV:
				enterOuterAlt(_localctx, 14);
				{
				setState(2147);
				match(T_STDEV);
				setState(2148);
				match(T_OPEN_P);
				setState(2150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2149);
					expr_func_all_distinct();
					}
				}

				setState(2152);
				expr(0);
				setState(2153);
				match(T_CLOSE_P);
				setState(2155);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(2154);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_SUM:
				enterOuterAlt(_localctx, 15);
				{
				setState(2157);
				match(T_SUM);
				setState(2158);
				match(T_OPEN_P);
				setState(2160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_ALL || _la==T_DISTINCT) {
					{
					setState(2159);
					expr_func_all_distinct();
					}
				}

				setState(2162);
				expr(0);
				setState(2163);
				match(T_CLOSE_P);
				setState(2165);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(2164);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VAR:
				enterOuterAlt(_localctx, 16);
				{
				setState(2167);
				match(T_VAR);
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
				switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
				case 1:
					{
					setState(2174);
					expr_func_over_clause();
					}
					break;
				}
				}
				break;
			case T_VARIANCE:
				enterOuterAlt(_localctx, 17);
				{
				setState(2177);
				match(T_VARIANCE);
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
				switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
				case 1:
					{
					setState(2184);
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
		enterRule(_localctx, 276, RULE_expr_func_all_distinct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2189);
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
		enterRule(_localctx, 278, RULE_expr_func_over_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2191);
			match(T_OVER);
			setState(2192);
			match(T_OPEN_P);
			setState(2194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_PARTITION) {
				{
				setState(2193);
				expr_func_partition_by_clause();
				}
			}

			setState(2197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ORDER) {
				{
				setState(2196);
				order_by_clause();
				}
			}

			setState(2199);
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
		enterRule(_localctx, 280, RULE_expr_func_partition_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			match(T_PARTITION);
			setState(2202);
			match(T_BY);
			setState(2203);
			expr(0);
			setState(2208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T_COMMA) {
				{
				{
				setState(2204);
				match(T_COMMA);
				setState(2205);
				expr(0);
				}
				}
				setState(2210);
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
		enterRule(_localctx, 282, RULE_expr_spec_func);
		int _la;
		try {
			int _alt;
			setState(2411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2211);
				match(T_ACTIVITY_COUNT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2212);
				match(T_CAST);
				setState(2213);
				match(T_OPEN_P);
				setState(2214);
				expr(0);
				setState(2215);
				match(T_AS);
				setState(2216);
				dtype();
				setState(2218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_OPEN_P) {
					{
					setState(2217);
					dtype_len();
					}
				}

				setState(2220);
				match(T_CLOSE_P);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2222);
				match(T_COUNT);
				setState(2223);
				match(T_OPEN_P);
				setState(2226);
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
					setState(2224);
					expr(0);
					}
					break;
				case T_MUL:
					{
					setState(2225);
					match(T_MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2228);
				match(T_CLOSE_P);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2229);
				match(T_CURRENT_DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2230);
				match(T_CURRENT);
				setState(2231);
				match(T_DATE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2235);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T_CURRENT_TIMESTAMP:
					{
					setState(2232);
					match(T_CURRENT_TIMESTAMP);
					}
					break;
				case T_CURRENT:
					{
					setState(2233);
					match(T_CURRENT);
					setState(2234);
					match(T_TIMESTAMP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,290,_ctx) ) {
				case 1:
					{
					setState(2237);
					match(T_OPEN_P);
					setState(2238);
					expr(0);
					setState(2239);
					match(T_CLOSE_P);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2243);
				match(T_CURRENT_USER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2244);
				match(T_CURRENT);
				setState(2245);
				match(T_USER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2246);
				match(T_MAX_PART_STRING);
				setState(2247);
				match(T_OPEN_P);
				setState(2248);
				expr(0);
				setState(2261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2249);
					match(T_COMMA);
					setState(2250);
					expr(0);
					setState(2258);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2251);
						match(T_COMMA);
						setState(2252);
						expr(0);
						setState(2253);
						match(T_EQUAL);
						setState(2254);
						expr(0);
						}
						}
						setState(2260);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2263);
				match(T_CLOSE_P);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2265);
				match(T_MIN_PART_STRING);
				setState(2266);
				match(T_OPEN_P);
				setState(2267);
				expr(0);
				setState(2280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2268);
					match(T_COMMA);
					setState(2269);
					expr(0);
					setState(2277);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2270);
						match(T_COMMA);
						setState(2271);
						expr(0);
						setState(2272);
						match(T_EQUAL);
						setState(2273);
						expr(0);
						}
						}
						setState(2279);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2282);
				match(T_CLOSE_P);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2284);
				match(T_MAX_PART_INT);
				setState(2285);
				match(T_OPEN_P);
				setState(2286);
				expr(0);
				setState(2299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2287);
					match(T_COMMA);
					setState(2288);
					expr(0);
					setState(2296);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2289);
						match(T_COMMA);
						setState(2290);
						expr(0);
						setState(2291);
						match(T_EQUAL);
						setState(2292);
						expr(0);
						}
						}
						setState(2298);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2301);
				match(T_CLOSE_P);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2303);
				match(T_MIN_PART_INT);
				setState(2304);
				match(T_OPEN_P);
				setState(2305);
				expr(0);
				setState(2318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2306);
					match(T_COMMA);
					setState(2307);
					expr(0);
					setState(2315);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2308);
						match(T_COMMA);
						setState(2309);
						expr(0);
						setState(2310);
						match(T_EQUAL);
						setState(2311);
						expr(0);
						}
						}
						setState(2317);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2320);
				match(T_CLOSE_P);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2322);
				match(T_MAX_PART_DATE);
				setState(2323);
				match(T_OPEN_P);
				setState(2324);
				expr(0);
				setState(2337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2325);
					match(T_COMMA);
					setState(2326);
					expr(0);
					setState(2334);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2327);
						match(T_COMMA);
						setState(2328);
						expr(0);
						setState(2329);
						match(T_EQUAL);
						setState(2330);
						expr(0);
						}
						}
						setState(2336);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2339);
				match(T_CLOSE_P);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2341);
				match(T_MIN_PART_DATE);
				setState(2342);
				match(T_OPEN_P);
				setState(2343);
				expr(0);
				setState(2356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2344);
					match(T_COMMA);
					setState(2345);
					expr(0);
					setState(2353);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T_COMMA) {
						{
						{
						setState(2346);
						match(T_COMMA);
						setState(2347);
						expr(0);
						setState(2348);
						match(T_EQUAL);
						setState(2349);
						expr(0);
						}
						}
						setState(2355);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2358);
				match(T_CLOSE_P);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2360);
				match(T_PART_COUNT);
				setState(2361);
				match(T_OPEN_P);
				setState(2362);
				expr(0);
				setState(2370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T_COMMA) {
					{
					{
					setState(2363);
					match(T_COMMA);
					setState(2364);
					expr(0);
					setState(2365);
					match(T_EQUAL);
					setState(2366);
					expr(0);
					}
					}
					setState(2372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2373);
				match(T_CLOSE_P);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2375);
				match(T_PART_LOC);
				setState(2376);
				match(T_OPEN_P);
				setState(2377);
				expr(0);
				setState(2383); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2378);
						match(T_COMMA);
						setState(2379);
						expr(0);
						setState(2380);
						match(T_EQUAL);
						setState(2381);
						expr(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2385); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,304,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_COMMA) {
					{
					setState(2387);
					match(T_COMMA);
					setState(2388);
					expr(0);
					}
				}

				setState(2391);
				match(T_CLOSE_P);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2393);
				match(T_TRIM);
				setState(2394);
				match(T_OPEN_P);
				setState(2395);
				expr(0);
				setState(2396);
				match(T_CLOSE_P);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2398);
				match(T_SUBSTRING);
				setState(2399);
				match(T_OPEN_P);
				setState(2400);
				expr(0);
				setState(2401);
				match(T_FROM);
				setState(2402);
				expr(0);
				setState(2405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_FOR) {
					{
					setState(2403);
					match(T_FOR);
					setState(2404);
					expr(0);
					}
				}

				setState(2407);
				match(T_CLOSE_P);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2409);
				match(T_SYSDATE);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2410);
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
		enterRule(_localctx, 284, RULE_expr_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2413);
			ident();
			setState(2414);
			match(T_OPEN_P);
			setState(2416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				{
				setState(2415);
				expr_func_params();
				}
				break;
			}
			setState(2418);
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
		enterRule(_localctx, 286, RULE_expr_func_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2420);
			func_param();
			setState(2425);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2421);
					match(T_COMMA);
					setState(2422);
					func_param();
					}
					} 
				}
				setState(2427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,309,_ctx);
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
		enterRule(_localctx, 288, RULE_func_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2428);
			if (!(!_input.LT(1).getText().equalsIgnoreCase("INTO"))) throw new FailedPredicateException(this, "!_input.LT(1).getText().equalsIgnoreCase(\"INTO\")");
			setState(2434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
			case 1:
				{
				setState(2429);
				ident();
				setState(2430);
				match(T_EQUAL);
				setState(2432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T_GREATER) {
					{
					setState(2431);
					match(T_GREATER);
					}
				}

				}
				break;
			}
			setState(2436);
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
		enterRule(_localctx, 290, RULE_error_missing_right_p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2438);
			match(T_OPEN_P);
			setState(2442);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2439);
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
				setState(2444);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,312,_ctx);
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
		enterRule(_localctx, 292, RULE_date_literal);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLHQLStatementsVisitor ) return ((PLHQLStatementsVisitor<? extends T>)visitor).visitTimestamp_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timestamp_literalContext timestamp_literal() throws RecognitionException {
		Timestamp_literalContext _localctx = new Timestamp_literalContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_timestamp_literal);
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
		enterRule(_localctx, 296, RULE_ident);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2451);
			match(L_ID);
			setState(2456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2452);
					match(T__3);
					setState(2453);
					match(L_ID);
					}
					} 
				}
				setState(2458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,313,_ctx);
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
		enterRule(_localctx, 298, RULE_string);
		try {
			setState(2461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_S_STRING:
				_localctx = new Single_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2459);
				match(L_S_STRING);
				}
				break;
			case L_D_STRING:
				_localctx = new Double_quotedStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2460);
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
		enterRule(_localctx, 300, RULE_error_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2463);
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
		enterRule(_localctx, 302, RULE_int_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2465);
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

			setState(2468);
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
		enterRule(_localctx, 304, RULE_dec_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T_ADD || _la==T_SUB) {
				{
				setState(2470);
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

			setState(2473);
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
		enterRule(_localctx, 306, RULE_bool_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2475);
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
		enterRule(_localctx, 308, RULE_null_const);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2477);
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
		enterRule(_localctx, 310, RULE_non_reserved_words);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2479);
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
		enterRule(_localctx, 312, RULE_error_invalid_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2481);
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
		case 100:
			return select_list_alias_sempred((Select_list_aliasContext)_localctx, predIndex);
		case 112:
			return from_alias_clause_sempred((From_alias_clauseContext)_localctx, predIndex);
		case 120:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 128:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 144:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u017d\u09b6\4\2\t"+
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
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\5\3\u0143\n\3\3\3\5\3\u0146\n\3\6\3\u0148\n\3\r\3\16\3\u0149\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0156\n\4\3\5\5\5\u0159\n\5\3\5"+
		"\3\5\3\5\3\5\3\6\5\6\u0160\n\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"\u016b\n\7\5\7\u016d\n\7\3\b\3\b\3\b\3\t\3\t\6\t\u0174\n\t\r\t\16\t\u0175"+
		"\3\t\5\t\u0179\n\t\5\t\u017b\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0190\n\n\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\5\16\u019a\n\16\3\16\3\16\3\16\7\16\u019f\n\16\f\16"+
		"\16\16\u01a2\13\16\3\17\3\17\3\17\5\17\u01a7\n\17\3\20\3\20\5\20\u01ab"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01b4\n\20\3\20\3\20\3\20"+
		"\5\20\u01b9\n\20\3\21\3\21\3\21\3\21\7\21\u01bf\n\21\f\21\16\21\u01c2"+
		"\13\21\3\21\3\21\5\21\u01c6\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u01cd\n"+
		"\21\f\21\16\21\u01d0\13\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u01d9"+
		"\n\22\f\22\16\22\u01dc\13\22\3\22\3\22\5\22\u01e0\n\22\3\22\5\22\u01e3"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u01f0"+
		"\n\24\3\24\3\24\5\24\u01f4\n\24\3\25\3\25\3\25\3\25\7\25\u01fa\n\25\f"+
		"\25\16\25\u01fd\13\25\3\26\3\26\3\26\7\26\u0202\n\26\f\26\16\26\u0205"+
		"\13\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u020d\n\27\f\27\16\27\u0210"+
		"\13\27\3\30\3\30\3\30\3\30\3\30\7\30\u0217\n\30\f\30\16\30\u021a\13\30"+
		"\3\31\3\31\3\32\3\32\3\32\7\32\u0221\n\32\f\32\16\32\u0224\13\32\3\32"+
		"\5\32\u0227\n\32\3\32\3\32\5\32\u022b\n\32\3\32\7\32\u022e\n\32\f\32\16"+
		"\32\u0231\13\32\3\32\5\32\u0234\n\32\3\32\3\32\3\32\5\32\u0239\n\32\3"+
		"\32\3\32\5\32\u023d\n\32\3\32\3\32\5\32\u0241\n\32\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0248\n\33\3\33\3\33\5\33\u024c\n\33\3\33\3\33\3\34\3\34\3"+
		"\34\5\34\u0253\n\34\3\35\3\35\3\35\3\35\5\35\u0259\n\35\3\35\3\35\5\35"+
		"\u025d\n\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0265\n\36\3\36\5\36\u0268"+
		"\n\36\3\36\3\36\3\36\5\36\u026d\n\36\3\36\3\36\3\37\5\37\u0272\n\37\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u0279\n\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u0280\n\37\3\37\5\37\u0283\n\37\3 \3 \3 \7 \u0288\n \f \16 \u028b\13"+
		" \3!\3!\3!\5!\u0290\n!\3!\7!\u0293\n!\f!\16!\u0296\13!\3!\7!\u0299\n!"+
		"\f!\16!\u029c\13!\3!\3!\5!\u02a0\n!\3!\5!\u02a3\n!\3\"\3\"\3#\3#\5#\u02a9"+
		"\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u02b5\n#\f#\16#\u02b8\13#\3#\3#\3"+
		"#\3#\3#\7#\u02bf\n#\f#\16#\u02c2\13#\3#\3#\3#\5#\u02c7\n#\3$\3$\3$\5$"+
		"\u02cc\n$\3$\3$\3$\5$\u02d1\n$\3$\3$\3$\5$\u02d6\n$\7$\u02d8\n$\f$\16"+
		"$\u02db\13$\3$\3$\5$\u02df\n$\3$\3$\3$\3$\3$\3$\7$\u02e7\n$\f$\16$\u02ea"+
		"\13$\3$\3$\3$\3$\3$\3$\3$\7$\u02f3\n$\f$\16$\u02f6\13$\3$\3$\7$\u02fa"+
		"\n$\f$\16$\u02fd\13$\5$\u02ff\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u030b"+
		"\n%\3&\6&\u030e\n&\r&\16&\u030f\3\'\3\'\3\'\5\'\u0315\n\'\3(\5(\u0318"+
		"\n(\3(\3(\3)\6)\u031d\n)\r)\16)\u031e\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5"+
		"*\u032b\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\6+\u0338\n+\r+\16+\u0339\3"+
		"+\3+\3+\5+\u033f\n+\3,\5,\u0342\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7"+
		",\u034f\n,\f,\16,\u0352\13,\3,\3,\3,\5,\u0357\n,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\5,\u0362\n,\3-\5-\u0365\n-\3-\3-\3-\3-\3-\3-\7-\u036d\n-\f-\16"+
		"-\u0370\13-\3-\3-\3-\3-\5-\u0376\n-\3.\3.\3.\3.\5.\u037c\n.\3/\3/\3/\3"+
		"/\7/\u0382\n/\f/\16/\u0385\13/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60"+
		"\u038e\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u03a2\n\60\3\61\3\61\3\61\3\61\5\61"+
		"\u03a8\n\61\3\62\3\62\5\62\u03ac\n\62\3\62\3\62\3\62\5\62\u03b1\n\62\3"+
		"\62\3\62\5\62\u03b5\n\62\3\62\3\62\3\62\5\62\u03ba\n\62\3\62\5\62\u03bd"+
		"\n\62\3\62\3\62\3\62\5\62\u03c2\n\62\3\62\5\62\u03c5\n\62\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u03d3\n\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\5\63\u03f3\n\63\5\63\u03f5\n\63\3\64\3\64\3\64\5\64\u03fa\n\64\3"+
		"\64\3\64\5\64\u03fe\n\64\3\64\3\64\3\65\5\65\u0403\n\65\3\65\3\65\3\65"+
		"\3\65\3\65\5\65\u040a\n\65\3\65\5\65\u040d\n\65\3\66\5\66\u0410\n\66\3"+
		"\66\3\66\3\66\5\66\u0415\n\66\3\66\3\66\5\66\u0419\n\66\5\66\u041b\n\66"+
		"\3\67\3\67\3\67\3\67\3\67\5\67\u0422\n\67\3\67\3\67\7\67\u0426\n\67\f"+
		"\67\16\67\u0429\13\67\38\38\38\38\58\u042f\n8\39\39\39\39\59\u0435\n9"+
		"\39\39\39\3:\3:\3:\7:\u043d\n:\f:\16:\u0440\13:\3;\3;\3;\3<\3<\3<\3<\5"+
		"<\u0449\n<\3<\5<\u044c\n<\3<\3<\3<\5<\u0451\n<\3<\3<\5<\u0455\n<\3<\5"+
		"<\u0458\n<\3<\3<\3=\3=\3=\5=\u045f\n=\3>\3>\3>\3>\5>\u0465\n>\3>\5>\u0468"+
		"\n>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0472\n>\3?\3?\3?\3?\3?\7?\u0479\n?\f?"+
		"\16?\u047c\13?\3@\3@\3@\3@\5@\u0482\n@\3@\3@\3@\3@\3@\5@\u0489\n@\5@\u048b"+
		"\n@\3A\3A\3A\3A\5A\u0491\nA\3A\5A\u0494\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\5A\u049f\nA\3B\3B\3B\3B\3B\7B\u04a6\nB\fB\16B\u04a9\13B\3C\3C\3C\5C\u04ae"+
		"\nC\3D\3D\3D\5D\u04b3\nD\3D\5D\u04b6\nD\3D\3D\3D\5D\u04bb\nD\3D\5D\u04be"+
		"\nD\3D\5D\u04c1\nD\3D\3D\3D\3D\5D\u04c7\nD\3E\3E\3E\5E\u04cc\nE\3E\5E"+
		"\u04cf\nE\3E\3E\5E\u04d3\nE\3E\5E\u04d6\nE\3E\5E\u04d9\nE\3E\3E\3E\3E"+
		"\5E\u04df\nE\3F\3F\3F\3F\3F\3F\7F\u04e7\nF\fF\16F\u04ea\13F\3F\3F\3F\3"+
		"F\3F\3F\7F\u04f2\nF\fF\16F\u04f5\13F\5F\u04f7\nF\3G\3G\3G\3G\3G\5G\u04fe"+
		"\nG\3G\3G\3G\5G\u0503\nG\3G\7G\u0506\nG\fG\16G\u0509\13G\3G\5G\u050c\n"+
		"G\3G\3G\3G\3G\3G\3G\5G\u0514\nG\3G\3G\5G\u0518\nG\3G\7G\u051b\nG\fG\16"+
		"G\u051e\13G\3G\5G\u0521\nG\5G\u0523\nG\3H\3H\5H\u0527\nH\3H\3H\3H\3H\3"+
		"H\3H\5H\u052f\nH\3H\3H\3H\3H\7H\u0535\nH\fH\16H\u0538\13H\5H\u053a\nH"+
		"\3I\3I\3I\5I\u053f\nI\3J\3J\3J\5J\u0544\nJ\3K\3K\3K\3K\3K\7K\u054b\nK"+
		"\fK\16K\u054e\13K\3K\5K\u0551\nK\3K\3K\3K\3L\3L\3L\3L\7L\u055a\nL\fL\16"+
		"L\u055d\13L\3L\5L\u0560\nL\3L\3L\3L\3M\3M\3M\3M\3M\5M\u056a\nM\3N\3N\3"+
		"N\3N\5N\u0570\nN\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3"+
		"R\3R\3S\3S\5S\u0587\nS\3S\3S\3S\3S\3S\3S\3S\3S\7S\u0591\nS\fS\16S\u0594"+
		"\13S\3S\3S\3T\3T\5T\u059a\nT\3T\3T\3T\3T\7T\u05a0\nT\fT\16T\u05a3\13T"+
		"\3T\3T\3U\3U\5U\u05a9\nU\3V\3V\5V\u05ad\nV\3W\3W\3W\3W\5W\u05b3\nW\3W"+
		"\3W\3W\3W\3W\5W\u05ba\nW\3W\3W\3W\3W\3W\3X\3X\3X\3X\5X\u05c5\nX\3X\3X"+
		"\3X\3X\3X\5X\u05cc\nX\3X\3X\3X\3X\3X\3X\3X\3X\5X\u05d6\nX\3X\3X\3X\3X"+
		"\3X\5X\u05dd\nX\3X\3X\3X\3X\3X\3X\3X\5X\u05e6\nX\3X\3X\3X\3X\3X\5X\u05ed"+
		"\nX\3X\3X\3X\3X\5X\u05f3\nX\3Y\5Y\u05f6\nY\3Y\3Y\3Z\3Z\3Z\3Z\7Z\u05fe"+
		"\nZ\fZ\16Z\u0601\13Z\3[\3[\5[\u0605\n[\3[\3[\3[\3[\3[\3\\\3\\\3\\\3\\"+
		"\7\\\u0610\n\\\f\\\16\\\u0613\13\\\3\\\3\\\3]\3]\3]\3]\7]\u061b\n]\f]"+
		"\16]\u061e\13]\3^\3^\3^\3^\3^\5^\u0625\n^\3_\3_\5_\u0629\n_\3_\3_\5_\u062d"+
		"\n_\3_\3_\5_\u0631\n_\5_\u0633\n_\3`\3`\3`\5`\u0638\n`\3`\3`\5`\u063c"+
		"\n`\3`\5`\u063f\n`\3`\3`\5`\u0643\n`\3`\5`\u0646\n`\3a\3a\3a\5a\u064b"+
		"\na\3a\5a\u064e\na\3a\5a\u0651\na\3a\3a\5a\u0655\na\3a\5a\u0658\na\3a"+
		"\5a\u065b\na\3b\5b\u065e\nb\3b\5b\u0661\nb\3b\3b\3b\7b\u0666\nb\fb\16"+
		"b\u0669\13b\3c\3c\3d\3d\3d\3e\3e\3e\5e\u0673\ne\3e\3e\5e\u0677\ne\3e\5"+
		"e\u067a\ne\3f\3f\5f\u067e\nf\3f\3f\3f\3f\3f\5f\u0685\nf\3g\3g\5g\u0689"+
		"\ng\3g\3g\3h\3h\3h\3h\7h\u0691\nh\fh\16h\u0694\13h\3i\3i\3i\7i\u0699\n"+
		"i\fi\16i\u069c\13i\3j\3j\7j\u06a0\nj\fj\16j\u06a3\13j\3k\3k\3k\5k\u06a8"+
		"\nk\3l\3l\5l\u06ac\nl\3m\3m\3m\3m\5m\u06b2\nm\3n\3n\3n\3n\3n\3n\3n\5n"+
		"\u06bb\nn\3o\5o\u06be\no\3o\3o\3o\5o\u06c3\no\3o\5o\u06c6\no\3p\3p\3p"+
		"\3p\3p\3p\7p\u06ce\np\fp\16p\u06d1\13p\3p\3p\5p\u06d5\np\3q\3q\3q\3q\3"+
		"q\7q\u06dc\nq\fq\16q\u06df\13q\3q\3q\5q\u06e3\nq\3r\3r\5r\u06e7\nr\3r"+
		"\3r\3r\3r\3r\7r\u06ee\nr\fr\16r\u06f1\13r\3r\5r\u06f4\nr\3s\3s\3t\3t\3"+
		"t\3u\3u\3v\3v\3v\3v\3v\7v\u0702\nv\fv\16v\u0705\13v\3w\3w\3w\3x\3x\3x"+
		"\3y\3y\3y\3y\5y\u0711\ny\3y\3y\3y\5y\u0716\ny\7y\u0718\ny\fy\16y\u071b"+
		"\13y\3z\3z\5z\u071f\nz\3z\3z\3z\3z\3z\5z\u0726\nz\3z\3z\3z\3z\7z\u072c"+
		"\nz\fz\16z\u072f\13z\3{\3{\5{\u0733\n{\3|\3|\3|\5|\u0738\n|\3|\3|\3|\3"+
		"|\3|\3|\3|\3|\3|\5|\u0743\n|\3|\3|\3|\3|\3|\3|\3|\5|\u074c\n|\3}\3}\5"+
		"}\u0750\n}\3}\3}\3}\3}\3}\7}\u0757\n}\f}\16}\u075a\13}\3}\5}\u075d\n}"+
		"\3}\3}\3~\3~\3~\3~\7~\u0765\n~\f~\16~\u0768\13~\3~\3~\5~\u076c\n~\3~\3"+
		"~\3~\3~\3~\3\177\3\177\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0782\n\u0081"+
		"\3\u0081\5\u0081\u0785\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\5\u0082\u0797\n\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\3\u0082\7\u0082\u07a7\n\u0082\f\u0082\16\u0082\u07aa\13\u0082\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u07b4"+
		"\n\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\7\u0086\u07c1\n\u0086\f\u0086\16\u0086\u07c4"+
		"\13\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\3\u0087\5\u0087\u07cf\n\u0087\3\u0088\3\u0088\5\u0088\u07d3\n\u0088\3"+
		"\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\6\u0089\u07dc\n"+
		"\u0089\r\u0089\16\u0089\u07dd\3\u0089\3\u0089\5\u0089\u07e2\n\u0089\3"+
		"\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\6\u008a"+
		"\u07ec\n\u008a\r\u008a\16\u008a\u07ed\3\u008a\3\u008a\5\u008a\u07f2\n"+
		"\u008a\3\u008a\3\u008a\3\u008b\3\u008b\3\u008b\5\u008b\u07f9\n\u008b\3"+
		"\u008b\3\u008b\3\u008b\5\u008b\u07fe\n\u008b\3\u008b\3\u008b\3\u008b\5"+
		"\u008b\u0803\n\u008b\3\u008b\3\u008b\5\u008b\u0807\n\u008b\3\u008b\3\u008b"+
		"\5\u008b\u080b\n\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0810\n\u008b\3"+
		"\u008b\3\u008b\5\u008b\u0814\n\u008b\3\u008b\3\u008b\5\u008b\u0818\n\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\5\u008b\u082f\n\u008b\5\u008b\u0831\n\u008b\3"+
		"\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0843"+
		"\n\u008b\5\u008b\u0845\n\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\5\u008b\u084d\n\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0852\n"+
		"\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0857\n\u008b\3\u008b\3\u008b\3"+
		"\u008b\5\u008b\u085c\n\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3"+
		"\u008b\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0869\n\u008b\3"+
		"\u008b\3\u008b\3\u008b\5\u008b\u086e\n\u008b\3\u008b\3\u008b\3\u008b\5"+
		"\u008b\u0873\n\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0878\n\u008b\3\u008b"+
		"\3\u008b\3\u008b\5\u008b\u087d\n\u008b\3\u008b\3\u008b\3\u008b\5\u008b"+
		"\u0882\n\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0887\n\u008b\3\u008b\3"+
		"\u008b\3\u008b\5\u008b\u088c\n\u008b\5\u008b\u088e\n\u008b\3\u008c\3\u008c"+
		"\3\u008d\3\u008d\3\u008d\5\u008d\u0895\n\u008d\3\u008d\5\u008d\u0898\n"+
		"\u008d\3\u008d\3\u008d\3\u008e\3\u008e\3\u008e\3\u008e\3\u008e\7\u008e"+
		"\u08a1\n\u008e\f\u008e\16\u008e\u08a4\13\u008e\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u08ad\n\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u08b5\n\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u08be\n\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\5\u008f\u08c4\n\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\7\u008f\u08d3\n\u008f\f\u008f\16\u008f\u08d6\13\u008f\5\u008f"+
		"\u08d8\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\7\u008f\u08e6\n\u008f\f\u008f"+
		"\16\u008f\u08e9\13\u008f\5\u008f\u08eb\n\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\7\u008f\u08f9\n\u008f\f\u008f\16\u008f\u08fc\13\u008f\5\u008f\u08fe\n"+
		"\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\7\u008f\u090c\n\u008f\f\u008f\16\u008f"+
		"\u090f\13\u008f\5\u008f\u0911\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\7\u008f"+
		"\u091f\n\u008f\f\u008f\16\u008f\u0922\13\u008f\5\u008f\u0924\n\u008f\3"+
		"\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\7\u008f\u0932\n\u008f\f\u008f\16\u008f\u0935"+
		"\13\u008f\5\u008f\u0937\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\7\u008f\u0943\n\u008f\f\u008f"+
		"\16\u008f\u0946\13\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\6\u008f\u0952\n\u008f\r\u008f\16\u008f"+
		"\u0953\3\u008f\3\u008f\5\u008f\u0958\n\u008f\3\u008f\3\u008f\3\u008f\3"+
		"\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\5\u008f\u0968\n\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\5\u008f\u096e\n\u008f\3\u0090\3\u0090\3\u0090\5\u0090\u0973\n\u0090\3"+
		"\u0090\3\u0090\3\u0091\3\u0091\3\u0091\7\u0091\u097a\n\u0091\f\u0091\16"+
		"\u0091\u097d\13\u0091\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0983\n"+
		"\u0092\5\u0092\u0985\n\u0092\3\u0092\3\u0092\3\u0093\3\u0093\7\u0093\u098b"+
		"\n\u0093\f\u0093\16\u0093\u098e\13\u0093\3\u0094\3\u0094\3\u0094\3\u0095"+
		"\3\u0095\3\u0095\3\u0096\3\u0096\3\u0096\7\u0096\u0999\n\u0096\f\u0096"+
		"\16\u0096\u099c\13\u0096\3\u0097\3\u0097\5\u0097\u09a0\n\u0097\3\u0098"+
		"\3\u0098\3\u0099\5\u0099\u09a5\n\u0099\3\u0099\3\u0099\3\u009a\5\u009a"+
		"\u09aa\n\u009a\3\u009a\3\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009d"+
		"\3\u009d\3\u009e\3\u009e\3\u009e\2\4\u00f2\u0102\u009f\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2"+
		"\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da"+
		"\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2"+
		"\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a"+
		"\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122"+
		"\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a"+
		"\2#\5\2\3\4\u015e\u015e\u016f\u016f\4\2\u00b9\u00b9\u0101\u0101\4\2\20"+
		"\20TT\4\2QQ\u012d\u012d\4\2mm\u00ac\u00ac\4\2QQ\u00d9\u00d9\4\2MM\u0089"+
		"\u0089\5\2\u008d\u008d\u00b3\u00b3\u00d5\u00d6\4\2\u00ae\u00ae\u00c0\u00c0"+
		"\4\2\u00bd\u00bd\u0141\u0141\4\2\u00f4\u00f4\u012a\u012a\4\2\u00b2\u00b2"+
		"\u0176\u0176\4\2  \'\'\4\2%%??\4\2CC\u00fa\u00fa\4\2\17\17\u009a\u009a"+
		"\3\2\u00eb\u00ec\3\2\u00dc\u00dd\3\2gh\3\2`a\4\2\37\37\u0113\u0113\3\2"+
		"\u00ff\u0100\4\2\t\tYY\5\2yy\u00a3\u00a3\u00ee\u00ee\4\2\f\f\u00cc\u00cc"+
		"\5\2\u00a4\u00a4\u00e5\u00e5\u00ef\u00ef\5\2GH\u00b6\u00b7\u00fb\u00fc"+
		"\4\2\65\65\u015d\u015d\3\2\u016d\u016d\4\2\u0173\u0173\u0175\u0175\4\2"+
		"\u015a\u015a\u0170\u0170\4\2nn\u0128\u0128\17\2\7\32\34^bbd\u00c3\u00c5"+
		"\u00d6\u00d8\u00f3\u00f5\u0108\u010a\u0122\u0124\u0129\u012c\u0136\u0138"+
		"\u0138\u013b\u014b\u0152\u0159\2\u0b0c\2\u013c\3\2\2\2\4\u0147\3\2\2\2"+
		"\6\u0155\3\2\2\2\b\u0158\3\2\2\2\n\u015f\3\2\2\2\f\u016c\3\2\2\2\16\u016e"+
		"\3\2\2\2\20\u017a\3\2\2\2\22\u018f\3\2\2\2\24\u0191\3\2\2\2\26\u0193\3"+
		"\2\2\2\30\u0195\3\2\2\2\32\u0199\3\2\2\2\34\u01a6\3\2\2\2\36\u01b8\3\2"+
		"\2\2 \u01ba\3\2\2\2\"\u01df\3\2\2\2$\u01e9\3\2\2\2&\u01eb\3\2\2\2(\u01f5"+
		"\3\2\2\2*\u01fe\3\2\2\2,\u0206\3\2\2\2.\u0211\3\2\2\2\60\u021b\3\2\2\2"+
		"\62\u0240\3\2\2\2\64\u0242\3\2\2\2\66\u0252\3\2\2\28\u0254\3\2\2\2:\u0260"+
		"\3\2\2\2<\u027f\3\2\2\2>\u0284\3\2\2\2@\u02a2\3\2\2\2B\u02a4\3\2\2\2D"+
		"\u02c6\3\2\2\2F\u02fe\3\2\2\2H\u0300\3\2\2\2J\u030d\3\2\2\2L\u0314\3\2"+
		"\2\2N\u0317\3\2\2\2P\u031c\3\2\2\2R\u032a\3\2\2\2T\u033e\3\2\2\2V\u0361"+
		"\3\2\2\2X\u0375\3\2\2\2Z\u037b\3\2\2\2\\\u037d\3\2\2\2^\u03a1\3\2\2\2"+
		"`\u03a7\3\2\2\2b\u03c4\3\2\2\2d\u03f4\3\2\2\2f\u03f6\3\2\2\2h\u040c\3"+
		"\2\2\2j\u041a\3\2\2\2l\u041c\3\2\2\2n\u042e\3\2\2\2p\u0430\3\2\2\2r\u0439"+
		"\3\2\2\2t\u0441\3\2\2\2v\u044b\3\2\2\2x\u045b\3\2\2\2z\u0467\3\2\2\2|"+
		"\u0473\3\2\2\2~\u048a\3\2\2\2\u0080\u0493\3\2\2\2\u0082\u04a0\3\2\2\2"+
		"\u0084\u04ad\3\2\2\2\u0086\u04b5\3\2\2\2\u0088\u04ce\3\2\2\2\u008a\u04f6"+
		"\3\2\2\2\u008c\u0522\3\2\2\2\u008e\u0524\3\2\2\2\u0090\u053e\3\2\2\2\u0092"+
		"\u0543\3\2\2\2\u0094\u0545\3\2\2\2\u0096\u0555\3\2\2\2\u0098\u0564\3\2"+
		"\2\2\u009a\u056b\3\2\2\2\u009c\u0571\3\2\2\2\u009e\u0577\3\2\2\2\u00a0"+
		"\u057c\3\2\2\2\u00a2\u0581\3\2\2\2\u00a4\u0584\3\2\2\2\u00a6\u0597\3\2"+
		"\2\2\u00a8\u05a6\3\2\2\2\u00aa\u05aa\3\2\2\2\u00ac\u05ae\3\2\2\2\u00ae"+
		"\u05f2\3\2\2\2\u00b0\u05f5\3\2\2\2\u00b2\u05f9\3\2\2\2\u00b4\u0602\3\2"+
		"\2\2\u00b6\u060b\3\2\2\2\u00b8\u0616\3\2\2\2\u00ba\u0624\3\2\2\2\u00bc"+
		"\u0632\3\2\2\2\u00be\u0634\3\2\2\2\u00c0\u065a\3\2\2\2\u00c2\u065d\3\2"+
		"\2\2\u00c4\u066a\3\2\2\2\u00c6\u066c\3\2\2\2\u00c8\u0679\3\2\2\2\u00ca"+
		"\u0684\3\2\2\2\u00cc\u0688\3\2\2\2\u00ce\u068c\3\2\2\2\u00d0\u0695\3\2"+
		"\2\2\u00d2\u069d\3\2\2\2\u00d4\u06a7\3\2\2\2\u00d6\u06a9\3\2\2\2\u00d8"+
		"\u06ad\3\2\2\2\u00da\u06ba\3\2\2\2\u00dc\u06c5\3\2\2\2\u00de\u06c7\3\2"+
		"\2\2\u00e0\u06e2\3\2\2\2\u00e2\u06e4\3\2\2\2\u00e4\u06f5\3\2\2\2\u00e6"+
		"\u06f7\3\2\2\2\u00e8\u06fa\3\2\2\2\u00ea\u06fc\3\2\2\2\u00ec\u0706\3\2"+
		"\2\2\u00ee\u0709\3\2\2\2\u00f0\u070c\3\2\2\2\u00f2\u0725\3\2\2\2\u00f4"+
		"\u0732\3\2\2\2\u00f6\u074b\3\2\2\2\u00f8\u074d\3\2\2\2\u00fa\u0760\3\2"+
		"\2\2\u00fc\u0772\3\2\2\2\u00fe\u0776\3\2\2\2\u0100\u0784\3\2\2\2\u0102"+
		"\u0796\3\2\2\2\u0104\u07b3\3\2\2\2\u0106\u07b5\3\2\2\2\u0108\u07b9\3\2"+
		"\2\2\u010a\u07bb\3\2\2\2\u010c\u07ce\3\2\2\2\u010e\u07d2\3\2\2\2\u0110"+
		"\u07d4\3\2\2\2\u0112\u07e5\3\2\2\2\u0114\u088d\3\2\2\2\u0116\u088f\3\2"+
		"\2\2\u0118\u0891\3\2\2\2\u011a\u089b\3\2\2\2\u011c\u096d\3\2\2\2\u011e"+
		"\u096f\3\2\2\2\u0120\u0976\3\2\2\2\u0122\u097e\3\2\2\2\u0124\u0988\3\2"+
		"\2\2\u0126\u098f\3\2\2\2\u0128\u0992\3\2\2\2\u012a\u0995\3\2\2\2\u012c"+
		"\u099f\3\2\2\2\u012e\u09a1\3\2\2\2\u0130\u09a4\3\2\2\2\u0132\u09a9\3\2"+
		"\2\2\u0134\u09ad\3\2\2\2\u0136\u09af\3\2\2\2\u0138\u09b1\3\2\2\2\u013a"+
		"\u09b3\3\2\2\2\u013c\u013d\5\4\3\2\u013d\u013e\7\2\2\3\u013e\3\3\2\2\2"+
		"\u013f\u0143\5\b\5\2\u0140\u0143\5\22\n\2\u0141\u0143\5\6\4\2\u0142\u013f"+
		"\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u0145\3\2\2\2\u0144"+
		"\u0146\7}\2\2\u0145\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2"+
		"\2\2\u0147\u0142\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149"+
		"\u014a\3\2\2\2\u014a\5\3\2\2\2\u014b\u0156\5\u00c0a\2\u014c\u0156\5\u0124"+
		"\u0093\2\u014d\u0156\5\n\6\2\u014e\u0156\5\u012e\u0098\2\u014f\u0156\5"+
		"\u00e8u\2\u0150\u0156\5\u0092J\2\u0151\u0156\5\66\34\2\u0152\u0156\5\u00ae"+
		"X\2\u0153\u0156\5*\26\2\u0154\u0156\5\u013a\u009e\2\u0155\u014b\3\2\2"+
		"\2\u0155\u014c\3\2\2\2\u0155\u014d\3\2\2\2\u0155\u014e\3\2\2\2\u0155\u014f"+
		"\3\2\2\2\u0155\u0150\3\2\2\2\u0155\u0151\3\2\2\2\u0155\u0152\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156\7\3\2\2\2\u0157\u0159\5,\27\2"+
		"\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b"+
		"\7\26\2\2\u015b\u015c\5\4\3\2\u015c\u015d\5\16\b\2\u015d\t\3\2\2\2\u015e"+
		"\u0160\5,\27\2\u015f\u015e\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0162\7\26\2\2\u0162\u0163\5\4\3\2\u0163\13\3\2\2\2\u0164\u0165"+
		"\7\26\2\2\u0165\u0166\5\4\3\2\u0166\u0167\5\16\b\2\u0167\u016d\3\2\2\2"+
		"\u0168\u016a\5\22\n\2\u0169\u016b\7\u016f\2\2\u016a\u0169\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u0164\3\2\2\2\u016c\u0168\3\2"+
		"\2\2\u016d\r\3\2\2\2\u016e\u016f\6\b\2\2\u016f\u0170\7c\2\2\u0170\17\3"+
		"\2\2\2\u0171\u017b\5\b\5\2\u0172\u0174\5\22\n\2\u0173\u0172\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2"+
		"\2\2\u0177\u0179\7}\2\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017b\3\2\2\2\u017a\u0171\3\2\2\2\u017a\u0173\3\2\2\2\u017b\21\3\2\2"+
		"\2\u017c\u0190\5\32\16\2\u017d\u0190\5$\23\2\u017e\u0190\5&\24\2\u017f"+
		"\u0190\5l\67\2\u0180\u0190\5v<\2\u0181\u0190\5\u00a4S\2\u0182\u0190\5"+
		":\36\2\u0183\u0190\5z>\2\u0184\u0190\5\u0080A\2\u0185\u0190\5\u0086D\2"+
		"\u0186\u0190\5\64\33\2\u0187\u0190\5(\25\2\u0188\u0190\5\u008eH\2\u0189"+
		"\u0190\5\u00acW\2\u018a\u0190\5\u0090I\2\u018b\u0190\5\u00aaV\2\u018c"+
		"\u0190\5\u00b0Y\2\u018d\u0190\5\26\f\2\u018e\u0190\5\24\13\2\u018f\u017c"+
		"\3\2\2\2\u018f\u017d\3\2\2\2\u018f\u017e\3\2\2\2\u018f\u017f\3\2\2\2\u018f"+
		"\u0180\3\2\2\2\u018f\u0181\3\2\2\2\u018f\u0182\3\2\2\2\u018f\u0183\3\2"+
		"\2\2\u018f\u0184\3\2\2\2\u018f\u0185\3\2\2\2\u018f\u0186\3\2\2\2\u018f"+
		"\u0187\3\2\2\2\u018f\u0188\3\2\2\2\u018f\u0189\3\2\2\2\u018f\u018a\3\2"+
		"\2\2\u018f\u018b\3\2\2\2\u018f\u018c\3\2\2\2\u018f\u018d\3\2\2\2\u018f"+
		"\u018e\3\2\2\2\u0190\23\3\2\2\2\u0191\u0192\t\2\2\2\u0192\25\3\2\2\2\u0193"+
		"\u0194\7\u00c4\2\2\u0194\27\3\2\2\2\u0195\u0196\6\r\3\2\u0196\u0197\5"+
		"\u0102\u0082\2\u0197\31\3\2\2\2\u0198\u019a\7\u0101\2\2\u0199\u0198\3"+
		"\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u01a0\5\34\17\2\u019c"+
		"\u019d\7\u015c\2\2\u019d\u019f\5\34\17\2\u019e\u019c\3\2\2\2\u019f\u01a2"+
		"\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\33\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a3\u01a7\5\36\20\2\u01a4\u01a7\5 \21\2\u01a5\u01a7\5"+
		"\"\22\2\u01a6\u01a3\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7"+
		"\35\3\2\2\2\u01a8\u01aa\5\u012a\u0096\2\u01a9\u01ab\7\u015b\2\2\u01aa"+
		"\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\7\u0160"+
		"\2\2\u01ad\u01ae\5\u0102\u0082\2\u01ae\u01b9\3\2\2\2\u01af\u01b0\7\u016a"+
		"\2\2\u01b0\u01b1\5\u012a\u0096\2\u01b1\u01b3\7\u016d\2\2\u01b2\u01b4\7"+
		"\u015b\2\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\3\2\2\2"+
		"\u01b5\u01b6\7\u0160\2\2\u01b6\u01b7\5\u0102\u0082\2\u01b7\u01b9\3\2\2"+
		"\2\u01b8\u01a8\3\2\2\2\u01b8\u01af\3\2\2\2\u01b9\37\3\2\2\2\u01ba\u01bb"+
		"\7\u016a\2\2\u01bb\u01c0\5\u012a\u0096\2\u01bc\u01bd\7\u015c\2\2\u01bd"+
		"\u01bf\5\u012a\u0096\2\u01be\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be"+
		"\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3"+
		"\u01c5\7\u016d\2\2\u01c4\u01c6\7\u015b\2\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6"+
		"\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7\u0160\2\2\u01c8\u01c9\7\u016a"+
		"\2\2\u01c9\u01ce\5\u0102\u0082\2\u01ca\u01cb\7\u015c\2\2\u01cb\u01cd\5"+
		"\u0102\u0082\2\u01cc\u01ca\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2"+
		"\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d1"+
		"\u01d2\7\u016d\2\2\u01d2!\3\2\2\2\u01d3\u01e0\5\u012a\u0096\2\u01d4\u01d5"+
		"\7\u016a\2\2\u01d5\u01da\5\u012a\u0096\2\u01d6\u01d7\7\u015c\2\2\u01d7"+
		"\u01d9\5\u012a\u0096\2\u01d8\u01d6\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8"+
		"\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd"+
		"\u01de\7\u016d\2\2\u01de\u01e0\3\2\2\2\u01df\u01d3\3\2\2\2\u01df\u01d4"+
		"\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01e3\7\u015b\2\2\u01e2\u01e1\3\2\2"+
		"\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5\7\u0160\2\2\u01e5"+
		"\u01e6\7\u016a\2\2\u01e6\u01e7\5\u00b0Y\2\u01e7\u01e8\7\u016d\2\2\u01e8"+
		"#\3\2\2\2\u01e9\u01ea\7\36\2\2\u01ea%\3\2\2\2\u01eb\u01ec\7!\2\2\u01ec"+
		"\u01f3\5\u012a\u0096\2\u01ed\u01ef\7\u016a\2\2\u01ee\u01f0\5\u0120\u0091"+
		"\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f4"+
		"\7\u016d\2\2\u01f2\u01f4\5\u0120\u0091\2\u01f3\u01ed\3\2\2\2\u01f3\u01f2"+
		"\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\'\3\2\2\2\u01f5\u01f6\7K\2\2\u01f6"+
		"\u01fb\5\60\31\2\u01f7\u01f8\7\u015c\2\2\u01f8\u01fa\5\60\31\2\u01f9\u01f7"+
		"\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc"+
		")\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0203\5\60\31\2\u01ff\u0200\7\u015c"+
		"\2\2\u0200\u0202\5\60\31\2\u0201\u01ff\3\2\2\2\u0202\u0205\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204+\3\2\2\2\u0205\u0203\3\2\2\2"+
		"\u0206\u0207\7K\2\2\u0207\u0208\5\60\31\2\u0208\u020e\7\u016f\2\2\u0209"+
		"\u020a\5\60\31\2\u020a\u020b\7\u016f\2\2\u020b\u020d\3\2\2\2\u020c\u0209"+
		"\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"-\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0212\5\60\31\2\u0212\u0218\7\u016f"+
		"\2\2\u0213\u0214\5\60\31\2\u0214\u0215\7\u016f\2\2\u0215\u0217\3\2\2\2"+
		"\u0216\u0213\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219"+
		"\3\2\2\2\u0219/\3\2\2\2\u021a\u0218\3\2\2\2\u021b\u021c\5\62\32\2\u021c"+
		"\61\3\2\2\2\u021d\u0222\5\u012a\u0096\2\u021e\u021f\7\u015c\2\2\u021f"+
		"\u0221\5\u012a\u0096\2\u0220\u021e\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220"+
		"\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0225"+
		"\u0227\7\17\2\2\u0226\u0225\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3"+
		"\2\2\2\u0228\u022a\5d\63\2\u0229\u022b\5f\64\2\u022a\u0229\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022f\3\2\2\2\u022c\u022e\5h\65\2\u022d\u022c\3\2"+
		"\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0233\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0234\5j\66\2\u0233\u0232\3\2"+
		"\2\2\u0233\u0234\3\2\2\2\u0234\u0241\3\2\2\2\u0235\u0236\5\u012a\u0096"+
		"\2\u0236\u0238\7\62\2\2\u0237\u0239\7\17\2\2\u0238\u0237\3\2\2\2\u0238"+
		"\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\5d\63\2\u023b\u023d\5f"+
		"\64\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\u023f\5j\66\2\u023f\u0241\3\2\2\2\u0240\u021d\3\2\2\2\u0240\u0235\3\2"+
		"\2\2\u0241\63\3\2\2\2\u0242\u0243\7<\2\2\u0243\u0247\7\u011c\2\2\u0244"+
		"\u0245\7\u0087\2\2\u0245\u0246\7\u00c2\2\2\u0246\u0248\7k\2\2\u0247\u0244"+
		"\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\5\u00e4s"+
		"\2\u024a\u024c\5J&\2\u024b\u024a\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d"+
		"\3\2\2\2\u024d\u024e\5<\37\2\u024e\65\3\2\2\2\u024f\u0253\58\35\2\u0250"+
		"\u0253\5\u00a6T\2\u0251\u0253\5\u0088E\2\u0252\u024f\3\2\2\2\u0252\u0250"+
		"\3\2\2\2\u0252\u0251\3\2\2\2\u0253\67\3\2\2\2\u0254\u0258\7<\2\2\u0255"+
		"\u0256\7\u0087\2\2\u0256\u0257\7\u00c2\2\2\u0257\u0259\7k\2\2\u0258\u0255"+
		"\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\5\u00e4s"+
		"\2\u025b\u025d\5J&\2\u025c\u025b\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u025f\5<\37\2\u025f9\3\2\2\2\u0260\u0267\7<\2\2\u0261\u0262"+
		"\7\u00a7\2\2\u0262\u0268\7\u011e\2\2\u0263\u0265\t\3\2\2\u0264\u0263\3"+
		"\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268\7\u0138\2\2"+
		"\u0267\u0261\3\2\2\2\u0267\u0264\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026a"+
		"\7\u011c\2\2\u026a\u026c\5\u012a\u0096\2\u026b\u026d\5J&\2\u026c\u026b"+
		"\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\5<\37\2\u026f"+
		";\3\2\2\2\u0270\u0272\7\17\2\2\u0271\u0270\3\2\2\2\u0271\u0272\3\2\2\2"+
		"\u0272\u0273\3\2\2\2\u0273\u0274\7\u016a\2\2\u0274\u0275\5\u00b0Y\2\u0275"+
		"\u0276\7\u016d\2\2\u0276\u0280\3\2\2\2\u0277\u0279\7\17\2\2\u0278\u0277"+
		"\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u0280\5\u00b0Y"+
		"\2\u027b\u027c\7\u016a\2\2\u027c\u027d\5> \2\u027d\u027e\7\u016d\2\2\u027e"+
		"\u0280\3\2\2\2\u027f\u0271\3\2\2\2\u027f\u0278\3\2\2\2\u027f\u027b\3\2"+
		"\2\2\u0280\u0282\3\2\2\2\u0281\u0283\5P)\2\u0282\u0281\3\2\2\2\u0282\u0283"+
		"\3\2\2\2\u0283=\3\2\2\2\u0284\u0289\5@!\2\u0285\u0286\7\u015c\2\2\u0286"+
		"\u0288\5@!\2\u0287\u0285\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2"+
		"\2\u0289\u028a\3\2\2\2\u028a?\3\2\2\2\u028b\u0289\3\2\2\2\u028c\u028d"+
		"\5B\"\2\u028d\u028f\5d\63\2\u028e\u0290\5f\64\2\u028f\u028e\3\2\2\2\u028f"+
		"\u0290\3\2\2\2\u0290\u0294\3\2\2\2\u0291\u0293\5h\65\2\u0292\u0291\3\2"+
		"\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295"+
		"\u029a\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u0299\5D#\2\u0298\u0297\3\2\2"+
		"\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u02a3"+
		"\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029e\7\67\2\2\u029e\u02a0\5\u012a"+
		"\u0096\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1"+
		"\u02a3\5F$\2\u02a2\u028c\3\2\2\2\u02a2\u029f\3\2\2\2\u02a3A\3\2\2\2\u02a4"+
		"\u02a5\5\u012a\u0096\2\u02a5C\3\2\2\2\u02a6\u02c7\5j\66\2\u02a7\u02a9"+
		"\7\u00c2\2\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02aa\3\2\2"+
		"\2\u02aa\u02c7\7\u00c4\2\2\u02ab\u02ac\7\u00da\2\2\u02ac\u02c7\7\u009f"+
		"\2\2\u02ad\u02c7\7\u012c\2\2\u02ae\u02af\7\u00e4\2\2\u02af\u02b0\5\u00e4"+
		"s\2\u02b0\u02b1\7\u016a\2\2\u02b1\u02b2\5\u012a\u0096\2\u02b2\u02b6\7"+
		"\u016d\2\2\u02b3\u02b5\5H%\2\u02b4\u02b3\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6"+
		"\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02c7\3\2\2\2\u02b8\u02b6\3\2"+
		"\2\2\u02b9\u02ba\7\u0086\2\2\u02ba\u02bb\7\u016a\2\2\u02bb\u02c0\7\u0176"+
		"\2\2\u02bc\u02bd\7\u015c\2\2\u02bd\u02bf\7\u0176\2\2\u02be\u02bc\3\2\2"+
		"\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c3"+
		"\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c7\7\u016d\2\2\u02c4\u02c7\7\23"+
		"\2\2\u02c5\u02c7\7b\2\2\u02c6\u02a6\3\2\2\2\u02c6\u02a8\3\2\2\2\u02c6"+
		"\u02ab\3\2\2\2\u02c6\u02ad\3\2\2\2\u02c6\u02ae\3\2\2\2\u02c6\u02b9\3\2"+
		"\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c5\3\2\2\2\u02c7E\3\2\2\2\u02c8\u02c9"+
		"\7\u00da\2\2\u02c9\u02cb\7\u009f\2\2\u02ca\u02cc\7,\2\2\u02cb\u02ca\3"+
		"\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02cd\3\2\2\2\u02cd\u02ce\7\u016a\2\2"+
		"\u02ce\u02d0\5\u012a\u0096\2\u02cf\u02d1\t\4\2\2\u02d0\u02cf\3\2\2\2\u02d0"+
		"\u02d1\3\2\2\2\u02d1\u02d9\3\2\2\2\u02d2\u02d3\7\u015c\2\2\u02d3\u02d5"+
		"\5\u012a\u0096\2\u02d4\u02d6\t\4\2\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3"+
		"\2\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d2\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9"+
		"\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02dc\3\2\2\2\u02db\u02d9\3\2"+
		"\2\2\u02dc\u02de\7\u016d\2\2\u02dd\u02df\7b\2\2\u02de\u02dd\3\2\2\2\u02de"+
		"\u02df\3\2\2\2\u02df\u02ff\3\2\2\2\u02e0\u02e1\7u\2\2\u02e1\u02e2\7\u009f"+
		"\2\2\u02e2\u02e3\7\u016a\2\2\u02e3\u02e8\5\u012a\u0096\2\u02e4\u02e5\7"+
		"\u015c\2\2\u02e5\u02e7\5\u012a\u0096\2\u02e6\u02e4\3\2\2\2\u02e7\u02ea"+
		"\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02eb\3\2\2\2\u02ea"+
		"\u02e8\3\2\2\2\u02eb\u02ec\7\u016d\2\2\u02ec\u02ed\7\u00e4\2\2\u02ed\u02ee"+
		"\5\u00e4s\2\u02ee\u02ef\7\u016a\2\2\u02ef\u02f4\5\u012a\u0096\2\u02f0"+
		"\u02f1\7\u015c\2\2\u02f1\u02f3\5\u012a\u0096\2\u02f2\u02f0\3\2\2\2\u02f3"+
		"\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f7\3\2"+
		"\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02fb\7\u016d\2\2\u02f8\u02fa\5H%\2\u02f9"+
		"\u02f8\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2"+
		"\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u02c8\3\2\2\2\u02fe"+
		"\u02e0\3\2\2\2\u02ffG\3\2\2\2\u0300\u0301\7\u00c9\2\2\u0301\u030a\t\5"+
		"\2\2\u0302\u0303\7\u00bd\2\2\u0303\u030b\7\7\2\2\u0304\u030b\7\u00e8\2"+
		"\2\u0305\u0306\7\u0101\2\2\u0306\u030b\7\u00c4\2\2\u0307\u0308\7\u0101"+
		"\2\2\u0308\u030b\7L\2\2\u0309\u030b\7#\2\2\u030a\u0302\3\2\2\2\u030a\u0304"+
		"\3\2\2\2\u030a\u0305\3\2\2\2\u030a\u0307\3\2\2\2\u030a\u0309\3\2\2\2\u030b"+
		"I\3\2\2\2\u030c\u030e\5L\'\2\u030d\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f"+
		"\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310K\3\2\2\2\u0311\u0312\7\u015c"+
		"\2\2\u0312\u0315\5N(\2\u0313\u0315\5Z.\2\u0314\u0311\3\2\2\2\u0314\u0313"+
		"\3\2\2\2\u0315M\3\2\2\2\u0316\u0318\7\u00bd\2\2\u0317\u0316\3\2\2\2\u0317"+
		"\u0318\3\2\2\2\u0318\u0319\3\2\2\2\u0319\u031a\t\6\2\2\u031aO\3\2\2\2"+
		"\u031b\u031d\5R*\2\u031c\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031c"+
		"\3\2\2\2\u031e\u031f\3\2\2\2\u031fQ\3\2\2\2\u0320\u0321\7\u00c9\2\2\u0321"+
		"\u0322\7\63\2\2\u0322\u0323\t\7\2\2\u0323\u032b\7\u00f3\2\2\u0324\u032b"+
		"\5T+\2\u0325\u032b\5V,\2\u0326\u032b\5X-\2\u0327\u032b\5Z.\2\u0328\u032b"+
		"\5`\61\2\u0329\u032b\5b\62\2\u032a\u0320\3\2\2\2\u032a\u0324\3\2\2\2\u032a"+
		"\u0325\3\2\2\2\u032a\u0326\3\2\2\2\u032a\u0327\3\2\2\2\u032a\u0328\3\2"+
		"\2\2\u032a\u0329\3\2\2\2\u032bS\3\2\2\2\u032c\u032d\7\u00fe\2\2\u032d"+
		"\u032e\7=\2\2\u032e\u033f\t\b\2\2\u032f\u0330\t\t\2\2\u0330\u033f\7\u0176"+
		"\2\2\u0331\u033f\7\u00bf\2\2\u0332\u033f\t\n\2\2\u0333\u0334\7\u0114\2"+
		"\2\u0334\u0337\7\u016a\2\2\u0335\u0338\5\u012a\u0096\2\u0336\u0338\7\u0176"+
		"\2\2\u0337\u0335\3\2\2\2\u0337\u0336\3\2\2\2\u0338\u0339\3\2\2\2\u0339"+
		"\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033f\7\u016d"+
		"\2\2\u033c\u033d\7\u011d\2\2\u033d\u033f\5\u012a\u0096\2\u033e\u032c\3"+
		"\2\2\2\u033e\u032f\3\2\2\2\u033e\u0331\3\2\2\2\u033e\u0332\3\2\2\2\u033e"+
		"\u0333\3\2\2\2\u033e\u033c\3\2\2\2\u033fU\3\2\2\2\u0340\u0342\7\u008c"+
		"\2\2\u0341\u0340\3\2\2\2\u0341\u0342\3\2\2\2\u0342\u0343\3\2\2\2\u0343"+
		"\u0344\7\u008a\2\2\u0344\u0362\5\u012a\u0096\2\u0345\u0346\7\u013c\2\2"+
		"\u0346\u0362\7\u00e6\2\2\u0347\u0348\7Z\2\2\u0348\u0349\7\37\2\2\u0349"+
		"\u034a\7\u0081\2\2\u034a\u034b\7\u016a\2\2\u034b\u0350\5\u012a\u0096\2"+
		"\u034c\u034d\7\u015c\2\2\u034d\u034f\5\u012a\u0096\2\u034e\u034c\3\2\2"+
		"\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0353"+
		"\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0354\7\u016d\2\2\u0354\u0362\3\2\2"+
		"\2\u0355\u0357\7\u00c2\2\2\u0356\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357"+
		"\u0358\3\2\2\2\u0358\u0362\7\u00ad\2\2\u0359\u035a\7\64\2\2\u035a\u0362"+
		"\t\13\2\2\u035b\u035c\7P\2\2\u035c\u0362\7\u00ca\2\2\u035d\u035e\7\u013c"+
		"\2\2\u035e\u035f\7\u00e8\2\2\u035f\u0360\7\u00c9\2\2\u0360\u0362\7]\2"+
		"\2\u0361\u0341\3\2\2\2\u0361\u0345\3\2\2\2\u0361\u0347\3\2\2\2\u0361\u0356"+
		"\3\2\2\2\u0361\u0359\3\2\2\2\u0361\u035b\3\2\2\2\u0361\u035d\3\2\2\2\u0362"+
		"W\3\2\2\2\u0363\u0365\7\u012c\2\2\u0364\u0363\3\2\2\2\u0364\u0365\3\2"+
		"\2\2\u0365\u0366\3\2\2\2\u0366\u0367\7\u00da\2\2\u0367\u0368\7\u008c\2"+
		"\2\u0368\u0369\7\u016a\2\2\u0369\u036e\5\u012a\u0096\2\u036a\u036b\7\u015c"+
		"\2\2\u036b\u036d\5\u012a\u0096\2\u036c\u036a\3\2\2\2\u036d\u0370\3\2\2"+
		"\2\u036e\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0371\3\2\2\2\u0370\u036e"+
		"\3\2\2\2\u0371\u0372\7\u016d\2\2\u0372\u0376\3\2\2\2\u0373\u0374\7\u013c"+
		"\2\2\u0374\u0376\7D\2\2\u0375\u0364\3\2\2\2\u0375\u0373\3\2\2\2\u0376"+
		"Y\3\2\2\2\u0377\u037c\5\\/\2\u0378\u0379\7\u0115\2\2\u0379\u037a\7\17"+
		"\2\2\u037a\u037c\5\u012a\u0096\2\u037b\u0377\3\2\2\2\u037b\u0378\3\2\2"+
		"\2\u037c[\3\2\2\2\u037d\u037e\7\u00f2\2\2\u037e\u037f\7v\2\2\u037f\u0383"+
		"\7R\2\2\u0380\u0382\5^\60\2\u0381\u0380\3\2\2\2\u0382\u0385\3\2\2\2\u0383"+
		"\u0381\3\2\2\2\u0383\u0384\3\2\2\2\u0384]\3\2\2\2\u0385\u0383\3\2\2\2"+
		"\u0386\u0387\7p\2\2\u0387\u0388\7\u011f\2\2\u0388\u0389\7\37\2\2\u0389"+
		"\u038d\5\u0102\u0082\2\u038a\u038b\7e\2\2\u038b\u038c\7\37\2\2\u038c\u038e"+
		"\5\u0102\u0082\2\u038d\u038a\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u03a2\3"+
		"\2\2\2\u038f\u0390\7/\2\2\u0390\u0391\7\u009c\2\2\u0391\u0392\7\u011f"+
		"\2\2\u0392\u0393\7\37\2\2\u0393\u03a2\5\u0102\u0082\2\u0394\u0395\7\u00b0"+
		"\2\2\u0395\u0396\7\u00a0\2\2\u0396\u0397\7\u011f\2\2\u0397\u0398\7\37"+
		"\2\2\u0398\u03a2\5\u0102\u0082\2\u0399\u039a\7\u00a6\2\2\u039a\u039b\7"+
		"\u011f\2\2\u039b\u039c\7\37\2\2\u039c\u03a2\5\u0102\u0082\2\u039d\u039e"+
		"\7\u00c4\2\2\u039e\u039f\7N\2\2\u039f\u03a0\7\17\2\2\u03a0\u03a2\5\u0102"+
		"\u0082\2\u03a1\u0386\3\2\2\2\u03a1\u038f\3\2\2\2\u03a1\u0394\3\2\2\2\u03a1"+
		"\u0399\3\2\2\2\u03a1\u039d\3\2\2\2\u03a2_\3\2\2\2\u03a3\u03a4\7\u00c9"+
		"\2\2\u03a4\u03a8\5\u012a\u0096\2\u03a5\u03a6\7\u0120\2\2\u03a6\u03a8\5"+
		"\u012a\u0096\2\u03a7\u03a3\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a8a\3\2\2\2"+
		"\u03a9\u03ab\7\23\2\2\u03aa\u03ac\7\u0160\2\2\u03ab\u03aa\3\2\2\2\u03ab"+
		"\u03ac\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03c5\5\u0102\u0082\2\u03ae\u03b0"+
		"\7\61\2\2\u03af\u03b1\7\u0160\2\2\u03b0\u03af\3\2\2\2\u03b0\u03b1\3\2"+
		"\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03c5\5\u0102\u0082\2\u03b3\u03b5\7L\2"+
		"\2\u03b4\u03b3\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b9\3\2\2\2\u03b6\u03b7"+
		"\7(\2\2\u03b7\u03ba\7\u0101\2\2\u03b8\u03ba\7)\2\2\u03b9\u03b6\3\2\2\2"+
		"\u03b9\u03b8\3\2\2\2\u03ba\u03bc\3\2\2\2\u03bb\u03bd\7\u0160\2\2\u03bc"+
		"\u03bb\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c5\5\u0102"+
		"\u0082\2\u03bf\u03c1\7d\2\2\u03c0\u03c2\7\u0160\2\2\u03c1\u03c0\3\2\2"+
		"\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c5\5\u0102\u0082\2"+
		"\u03c4\u03a9\3\2\2\2\u03c4\u03ae\3\2\2\2\u03c4\u03b4\3\2\2\2\u03c4\u03bf"+
		"\3\2\2\2\u03c5c\3\2\2\2\u03c6\u03f5\7\'\2\2\u03c7\u03f5\7\30\2\2\u03c8"+
		"\u03f5\7\31\2\2\u03c9\u03f5\7\32\2\2\u03ca\u03f5\7\33\2\2\u03cb\u03f5"+
		"\7\34\2\2\u03cc\u03f5\7E\2\2\u03cd\u03f5\7F\2\2\u03ce\u03f5\7I\2\2\u03cf"+
		"\u03f5\7J\2\2\u03d0\u03d2\7\\\2\2\u03d1\u03d3\7\u00d8\2\2\u03d2\u03d1"+
		"\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03f5\3\2\2\2\u03d4\u03f5\7s\2\2\u03d5"+
		"\u03f5\7\u0091\2\2\u03d6\u03f5\7\u0092\2\2\u03d7\u03f5\7\u0093\2\2\u03d8"+
		"\u03f5\7\u0094\2\2\u03d9\u03f5\7\u0095\2\2\u03da\u03f5\7\u00ba\2\2\u03db"+
		"\u03f5\7\u00bc\2\2\u03dc\u03f5\7\u00c6\2\2\u03dd\u03f5\7\u00c5\2\2\u03de"+
		"\u03f5\7\u00d7\2\2\u03df\u03f5\7\u00e3\2\2\u03e0\u03e1\7\u00ea\2\2\u03e1"+
		"\u03f5\7\u0136\2\2\u03e2\u03f5\7\u0108\2\2\u03e3\u03f5\7\u0107\2\2\u03e4"+
		"\u03f5\7\u0109\2\2\u03e5\u03f5\7\u010b\2\2\u03e6\u03f5\7\u010a\2\2\u03e7"+
		"\u03f5\7\u0116\2\2\u03e8\u03f5\7\u011b\2\2\u03e9\u03f5\7\u0122\2\2\u03ea"+
		"\u03f5\7\u0123\2\2\u03eb\u03f5\7\u0134\2\2\u03ec\u03f5\7\u0135\2\2\u03ed"+
		"\u03f5\7\u0140\2\2\u03ee\u03f5\7\u0137\2\2\u03ef\u03f2\5\u012a\u0096\2"+
		"\u03f0\u03f1\7\5\2\2\u03f1\u03f3\t\f\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3"+
		"\3\2\2\2\u03f3\u03f5\3\2\2\2\u03f4\u03c6\3\2\2\2\u03f4\u03c7\3\2\2\2\u03f4"+
		"\u03c8\3\2\2\2\u03f4\u03c9\3\2\2\2\u03f4\u03ca\3\2\2\2\u03f4\u03cb\3\2"+
		"\2\2\u03f4\u03cc\3\2\2\2\u03f4\u03cd\3\2\2\2\u03f4\u03ce\3\2\2\2\u03f4"+
		"\u03cf\3\2\2\2\u03f4\u03d0\3\2\2\2\u03f4\u03d4\3\2\2\2\u03f4\u03d5\3\2"+
		"\2\2\u03f4\u03d6\3\2\2\2\u03f4\u03d7\3\2\2\2\u03f4\u03d8\3\2\2\2\u03f4"+
		"\u03d9\3\2\2\2\u03f4\u03da\3\2\2\2\u03f4\u03db\3\2\2\2\u03f4\u03dc\3\2"+
		"\2\2\u03f4\u03dd\3\2\2\2\u03f4\u03de\3\2\2\2\u03f4\u03df\3\2\2\2\u03f4"+
		"\u03e0\3\2\2\2\u03f4\u03e2\3\2\2\2\u03f4\u03e3\3\2\2\2\u03f4\u03e4\3\2"+
		"\2\2\u03f4\u03e5\3\2\2\2\u03f4\u03e6\3\2\2\2\u03f4\u03e7\3\2\2\2\u03f4"+
		"\u03e8\3\2\2\2\u03f4\u03e9\3\2\2\2\u03f4\u03ea\3\2\2\2\u03f4\u03eb\3\2"+
		"\2\2\u03f4\u03ec\3\2\2\2\u03f4\u03ed\3\2\2\2\u03f4\u03ee\3\2\2\2\u03f4"+
		"\u03ef\3\2\2\2\u03f5e\3\2\2\2\u03f6\u03f7\7\u016a\2\2\u03f7\u03f9\t\r"+
		"\2\2\u03f8\u03fa\t\16\2\2\u03f9\u03f8\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa"+
		"\u03fd\3\2\2\2\u03fb\u03fc\7\u015c\2\2\u03fc\u03fe\7\u0176\2\2\u03fd\u03fb"+
		"\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\7\u016d\2"+
		"\2\u0400g\3\2\2\2\u0401\u0403\7\u00c2\2\2\u0402\u0401\3\2\2\2\u0402\u0403"+
		"\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u040d\7\u00c4\2\2\u0405\u0406\7(\2"+
		"\2\u0406\u0407\7\u0101\2\2\u0407\u040d\5\u012a\u0096\2\u0408\u040a\7\u00c2"+
		"\2\2\u0409\u0408\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040b\3\2\2\2\u040b"+
		"\u040d\t\17\2\2\u040c\u0402\3\2\2\2\u040c\u0405\3\2\2\2\u040c\u0409\3"+
		"\2\2\2\u040di\3\2\2\2\u040e\u0410\7\u015b\2\2\u040f\u040e\3\2\2\2\u040f"+
		"\u0410\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\7\u0160\2\2\u0412\u041b"+
		"\5\u0102\u0082\2\u0413\u0415\7\u013c\2\2\u0414\u0413\3\2\2\2\u0414\u0415"+
		"\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u0418\7L\2\2\u0417\u0419\5\u0102\u0082"+
		"\2\u0418\u0417\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041b\3\2\2\2\u041a\u040f"+
		"\3\2\2\2\u041a\u0414\3\2\2\2\u041bk\3\2\2\2\u041c\u041d\7<\2\2\u041d\u0421"+
		"\t\20\2\2\u041e\u041f\7\u0087\2\2\u041f\u0420\7\u00c2\2\2\u0420\u0422"+
		"\7k\2\2\u0421\u041e\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u0423\3\2\2\2\u0423"+
		"\u0427\5\u0102\u0082\2\u0424\u0426\5n8\2\u0425\u0424\3\2\2\2\u0426\u0429"+
		"\3\2\2\2\u0427\u0425\3\2\2\2\u0427\u0428\3\2\2\2\u0428m\3\2\2\2\u0429"+
		"\u0427\3\2\2\2\u042a\u042b\7\61\2\2\u042b\u042f\5\u0102\u0082\2\u042c"+
		"\u042d\7\u00a8\2\2\u042d\u042f\5\u0102\u0082\2\u042e\u042a\3\2\2\2\u042e"+
		"\u042c\3\2\2\2\u042fo\3\2\2\2\u0430\u0431\5d\63\2\u0431\u0432\5\u012a"+
		"\u0096\2\u0432\u0434\7\u016a\2\2\u0433\u0435\5r:\2\u0434\u0433\3\2\2\2"+
		"\u0434\u0435\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0437\7\u016d\2\2\u0437"+
		"\u0438\7\u016f\2\2\u0438q\3\2\2\2\u0439\u043e\5t;\2\u043a\u043b\7\u015c"+
		"\2\2\u043b\u043d\5t;\2\u043c\u043a\3\2\2\2\u043d\u0440\3\2\2\2\u043e\u043c"+
		"\3\2\2\2\u043e\u043f\3\2\2\2\u043fs\3\2\2\2\u0440\u043e\3\2\2\2\u0441"+
		"\u0442\5d\63\2\u0442\u0443\5\u012a\u0096\2\u0443u\3\2\2\2\u0444\u044c"+
		"\7\13\2\2\u0445\u0448\7<\2\2\u0446\u0447\7\u00cc\2\2\u0447\u0449\7\u00e6"+
		"\2\2\u0448\u0446\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044c\3\2\2\2\u044a"+
		"\u044c\7\u00e6\2\2\u044b\u0444\3\2\2\2\u044b\u0445\3\2\2\2\u044b\u044a"+
		"\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u044e\7z\2\2\u044e"+
		"\u0450\5\u012a\u0096\2\u044f\u0451\5\u008aF\2\u0450\u044f\3\2\2\2\u0450"+
		"\u0451\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0454\5x=\2\u0453\u0455\t\21"+
		"\2\2\u0454\u0453\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0457\3\2\2\2\u0456"+
		"\u0458\5.\30\2\u0457\u0456\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u0459\3\2"+
		"\2\2\u0459\u045a\5\f\7\2\u045aw\3\2\2\2\u045b\u045c\t\22\2\2\u045c\u045e"+
		"\5d\63\2\u045d\u045f\5f\64\2\u045e\u045d\3\2\2\2\u045e\u045f\3\2\2\2\u045f"+
		"y\3\2\2\2\u0460\u0468\7\13\2\2\u0461\u0464\7<\2\2\u0462\u0463\7\u00cc"+
		"\2\2\u0463\u0465\7\u00e6\2\2\u0464\u0462\3\2\2\2\u0464\u0465\3\2\2\2\u0465"+
		"\u0468\3\2\2\2\u0466\u0468\7\u00e6\2\2\u0467\u0460\3\2\2\2\u0467\u0461"+
		"\3\2\2\2\u0467\u0466\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\3\2\2\2\u0469"+
		"\u046a\7\u00d3\2\2\u046a\u046b\5\u012a\u0096\2\u046b\u046c\t\21\2\2\u046c"+
		"\u046d\5|?\2\u046d\u0471\7c\2\2\u046e\u046f\5\u012a\u0096\2\u046f\u0470"+
		"\7\u016f\2\2\u0470\u0472\3\2\2\2\u0471\u046e\3\2\2\2\u0471\u0472\3\2\2"+
		"\2\u0472{\3\2\2\2\u0473\u0474\5~@\2\u0474\u047a\7\u016f\2\2\u0475\u0476"+
		"\5~@\2\u0476\u0477\7\u016f\2\2\u0477\u0479\3\2\2\2\u0478\u0475\3\2\2\2"+
		"\u0479\u047c\3\2\2\2\u047a\u0478\3\2\2\2\u047a\u047b\3\2\2\2\u047b}\3"+
		"\2\2\2\u047c\u047a\3\2\2\2\u047d\u048b\5\60\31\2\u047e\u047f\7z\2\2\u047f"+
		"\u0481\5\u012a\u0096\2\u0480\u0482\5\u008aF\2\u0481\u0480\3\2\2\2\u0481"+
		"\u0482\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0484\5x=\2\u0484\u048b\3\2\2"+
		"\2\u0485\u0486\t\23\2\2\u0486\u0488\5\u012a\u0096\2\u0487\u0489\5\u008a"+
		"F\2\u0488\u0487\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048b\3\2\2\2\u048a"+
		"\u047d\3\2\2\2\u048a\u047e\3\2\2\2\u048a\u0485\3\2\2\2\u048b\177\3\2\2"+
		"\2\u048c\u0494\7\13\2\2\u048d\u0490\7<\2\2\u048e\u048f\7\u00cc\2\2\u048f"+
		"\u0491\7\u00e6\2\2\u0490\u048e\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u0494"+
		"\3\2\2\2\u0492\u0494\7\u00e6\2\2\u0493\u048c\3\2\2\2\u0493\u048d\3\2\2"+
		"\2\u0493\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496"+
		"\7\u00d3\2\2\u0496\u0497\7\35\2\2\u0497\u0498\5\u012a\u0096\2\u0498\u0499"+
		"\t\21\2\2\u0499\u049a\5\u0082B\2\u049a\u049e\7c\2\2\u049b\u049c\5\u012a"+
		"\u0096\2\u049c\u049d\7\u016f\2\2\u049d\u049f\3\2\2\2\u049e\u049b\3\2\2"+
		"\2\u049e\u049f\3\2\2\2\u049f\u0081\3\2\2\2\u04a0\u04a1\5\u0084C\2\u04a1"+
		"\u04a7\7\u016f\2\2\u04a2\u04a3\5\u0084C\2\u04a3\u04a4\7\u016f\2\2\u04a4"+
		"\u04a6\3\2\2\2\u04a5\u04a2\3\2\2\2\u04a6\u04a9\3\2\2\2\u04a7\u04a5\3\2"+
		"\2\2\u04a7\u04a8\3\2\2\2\u04a8\u0083\3\2\2\2\u04a9\u04a7\3\2\2\2\u04aa"+
		"\u04ae\5\60\31\2\u04ab\u04ae\5v<\2\u04ac\u04ae\5\u0086D\2\u04ad\u04aa"+
		"\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ad\u04ac\3\2\2\2\u04ae\u0085\3\2\2\2\u04af"+
		"\u04b2\7<\2\2\u04b0\u04b1\7\u00cc\2\2\u04b1\u04b3\7\u00e6\2\2\u04b2\u04b0"+
		"\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b6\3\2\2\2\u04b4\u04b6\7\u00e6\2"+
		"\2\u04b5\u04af\3\2\2\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7"+
		"\3\2\2\2\u04b7\u04b8\t\23\2\2\u04b8\u04ba\5\u012a\u0096\2\u04b9\u04bb"+
		"\5\u008aF\2\u04ba\u04b9\3\2\2\2\u04ba\u04bb\3\2\2\2\u04bb\u04bd\3\2\2"+
		"\2\u04bc\u04be\t\21\2\2\u04bd\u04bc\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"\u04c0\3\2\2\2\u04bf\u04c1\5.\30\2\u04c0\u04bf\3\2\2\2\u04c0\u04c1\3\2"+
		"\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c6\5\20\t\2\u04c3\u04c4\5\u012a\u0096"+
		"\2\u04c4\u04c5\7\u016f\2\2\u04c5\u04c7\3\2\2\2\u04c6\u04c3\3\2\2\2\u04c6"+
		"\u04c7\3\2\2\2\u04c7\u0087\3\2\2\2\u04c8\u04cb\7<\2\2\u04c9\u04ca\7\u00cc"+
		"\2\2\u04ca\u04cc\7\u00e6\2\2\u04cb\u04c9\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc"+
		"\u04cf\3\2\2\2\u04cd\u04cf\7\u00e6\2\2\u04ce\u04c8\3\2\2\2\u04ce\u04cd"+
		"\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04d2\t\23\2\2"+
		"\u04d1\u04d3\5\u008aF\2\u04d2\u04d1\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3"+
		"\u04d5\3\2\2\2\u04d4\u04d6\t\21\2\2\u04d5\u04d4\3\2\2\2\u04d5\u04d6\3"+
		"\2\2\2\u04d6\u04d8\3\2\2\2\u04d7\u04d9\5.\30\2\u04d8\u04d7\3\2\2\2\u04d8"+
		"\u04d9\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04de\5\20\t\2\u04db\u04dc\5"+
		"\u012a\u0096\2\u04dc\u04dd\7\u016f\2\2\u04dd\u04df\3\2\2\2\u04de\u04db"+
		"\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u0089\3\2\2\2\u04e0\u04e1\7\u016a\2"+
		"\2\u04e1\u04f7\7\u016d\2\2\u04e2\u04e3\7\u016a\2\2\u04e3\u04e8\5\u008c"+
		"G\2\u04e4\u04e5\7\u015c\2\2\u04e5\u04e7\5\u008cG\2\u04e6\u04e4\3\2\2\2"+
		"\u04e7\u04ea\3\2\2\2\u04e8\u04e6\3\2\2\2\u04e8\u04e9\3\2\2\2\u04e9\u04eb"+
		"\3\2\2\2\u04ea\u04e8\3\2\2\2\u04eb\u04ec\7\u016d\2\2\u04ec\u04f7\3\2\2"+
		"\2\u04ed\u04ee\6F\4\2\u04ee\u04f3\5\u008cG\2\u04ef\u04f0\7\u015c\2\2\u04f0"+
		"\u04f2\5\u008cG\2\u04f1\u04ef\3\2\2\2\u04f2\u04f5\3\2\2\2\u04f3\u04f1"+
		"\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f7\3\2\2\2\u04f5\u04f3\3\2\2\2\u04f6"+
		"\u04e0\3\2\2\2\u04f6\u04e2\3\2\2\2\u04f6\u04ed\3\2\2\2\u04f7\u008b\3\2"+
		"\2\2\u04f8\u04fe\7\u008a\2\2\u04f9\u04fe\7\u00ce\2\2\u04fa\u04fe\7\u008f"+
		"\2\2\u04fb\u04fc\7\u008a\2\2\u04fc\u04fe\7\u00ce\2\2\u04fd\u04f8\3\2\2"+
		"\2\u04fd\u04f9\3\2\2\2\u04fd\u04fa\3\2\2\2\u04fd\u04fb\3\2\2\2\u04fd\u04fe"+
		"\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0500\5\u012a\u0096\2\u0500\u0502\5"+
		"d\63\2\u0501\u0503\5f\64\2\u0502\u0501\3\2\2\2\u0502\u0503\3\2\2\2\u0503"+
		"\u0507\3\2\2\2\u0504\u0506\5h\65\2\u0505\u0504\3\2\2\2\u0506\u0509\3\2"+
		"\2\2\u0507\u0505\3\2\2\2\u0507\u0508\3\2\2\2\u0508\u050b\3\2\2\2\u0509"+
		"\u0507\3\2\2\2\u050a\u050c\5j\66\2\u050b\u050a\3\2\2\2\u050b\u050c\3\2"+
		"\2\2\u050c\u0523\3\2\2\2\u050d\u0513\5\u012a\u0096\2\u050e\u0514\7\u008a"+
		"\2\2\u050f\u0514\7\u00ce\2\2\u0510\u0514\7\u008f\2\2\u0511\u0512\7\u008a"+
		"\2\2\u0512\u0514\7\u00ce\2\2\u0513\u050e\3\2\2\2\u0513\u050f\3\2\2\2\u0513"+
		"\u0510\3\2\2\2\u0513\u0511\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0515\3\2"+
		"\2\2\u0515\u0517\5d\63\2\u0516\u0518\5f\64\2\u0517\u0516\3\2\2\2\u0517"+
		"\u0518\3\2\2\2\u0518\u051c\3\2\2\2\u0519\u051b\5h\65\2\u051a\u0519\3\2"+
		"\2\2\u051b\u051e\3\2\2\2\u051c\u051a\3\2\2\2\u051c\u051d\3\2\2\2\u051d"+
		"\u0520\3\2\2\2\u051e\u051c\3\2\2\2\u051f\u0521\5j\66\2\u0520\u051f\3\2"+
		"\2\2\u0520\u0521\3\2\2\2\u0521\u0523\3\2\2\2\u0522\u04fd\3\2\2\2\u0522"+
		"\u050d\3\2\2\2\u0523\u008d\3\2\2\2\u0524\u0526\t\24\2\2\u0525\u0527\7"+
		"\u0089\2\2\u0526\u0525\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528\3\2\2\2"+
		"\u0528\u052e\5\u0102\u0082\2\u0529\u052a\7\u016a\2\2\u052a\u052b\5\u0120"+
		"\u0091\2\u052b\u052c\7\u016d\2\2\u052c\u052f\3\2\2\2\u052d\u052f\5\u0120"+
		"\u0091\2\u052e\u0529\3\2\2\2\u052e\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f"+
		"\u0539\3\2\2\2\u0530\u0531\7\u0098\2\2\u0531\u0536\7\u0171\2\2\u0532\u0533"+
		"\7\u015c\2\2\u0533\u0535\7\u0171\2\2\u0534\u0532\3\2\2\2\u0535\u0538\3"+
		"\2\2\2\u0536\u0534\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u053a\3\2\2\2\u0538"+
		"\u0536\3\2\2\2\u0539\u0530\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u008f\3\2"+
		"\2\2\u053b\u053f\5\u0094K\2\u053c\u053f\5\u0098M\2\u053d\u053f\5\u009c"+
		"O\2\u053e\u053b\3\2\2\2\u053e\u053c\3\2\2\2\u053e\u053d\3\2\2\2\u053f"+
		"\u0091\3\2\2\2\u0540\u0544\5\u0096L\2\u0541\u0544\5\u009aN\2\u0542\u0544"+
		"\5\u009eP\2\u0543\u0540\3\2\2\2\u0543\u0541\3\2\2\2\u0543\u0542\3\2\2"+
		"\2\u0544\u0093\3\2\2\2\u0545\u0546\7\u0087\2\2\u0546\u0547\5\u00f2z\2"+
		"\u0547\u0548\7\u0121\2\2\u0548\u054c\5\4\3\2\u0549\u054b\5\u00a0Q\2\u054a"+
		"\u0549\3\2\2\2\u054b\u054e\3\2\2\2\u054c\u054a\3\2\2\2\u054c\u054d\3\2"+
		"\2\2\u054d\u0550\3\2\2\2\u054e\u054c\3\2\2\2\u054f\u0551\5\u00a2R\2\u0550"+
		"\u054f\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0553\7c"+
		"\2\2\u0553\u0554\7\u0087\2\2\u0554\u0095\3\2\2\2\u0555\u0556\7\u0087\2"+
		"\2\u0556\u0557\7\u0121\2\2\u0557\u055b\5\4\3\2\u0558\u055a\5\u00a0Q\2"+
		"\u0559\u0558\3\2\2\2\u055a\u055d\3\2\2\2\u055b\u0559\3\2\2\2\u055b\u055c"+
		"\3\2\2\2\u055c\u055f\3\2\2\2\u055d\u055b\3\2\2\2\u055e\u0560\5\u00a2R"+
		"\2\u055f\u055e\3\2\2\2\u055f\u0560\3\2\2\2\u0560\u0561\3\2\2\2\u0561\u0562"+
		"\7c\2\2\u0562\u0563\7\u0087\2\2\u0563\u0097\3\2\2\2\u0564\u0565\7\u0087"+
		"\2\2\u0565\u0566\5\u00f2z\2\u0566\u0569\5\f\7\2\u0567\u0568\7_\2\2\u0568"+
		"\u056a\5\f\7\2\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u0099\3\2"+
		"\2\2\u056b\u056c\7\u0087\2\2\u056c\u056f\5\f\7\2\u056d\u056e\7_\2\2\u056e"+
		"\u0570\5\f\7\2\u056f\u056d\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u009b\3\2"+
		"\2\2\u0571\u0572\7\6\2\2\u0572\u0573\7\u0087\2\2\u0573\u0574\5\u00f2z"+
		"\2\u0574\u0575\7\u0121\2\2\u0575\u0576\5\f\7\2\u0576\u009d\3\2\2\2\u0577"+
		"\u0578\7\6\2\2\u0578\u0579\7\u0087\2\2\u0579\u057a\7\u0121\2\2\u057a\u057b"+
		"\5\f\7\2\u057b\u009f\3\2\2\2\u057c\u057d\t\25\2\2\u057d\u057e\5\u00f2"+
		"z\2\u057e\u057f\7\u0121\2\2\u057f\u0580\5\4\3\2\u0580\u00a1\3\2\2\2\u0581"+
		"\u0582\7_\2\2\u0582\u0583\5\4\3\2\u0583\u00a3\3\2\2\2\u0584\u0586\7<\2"+
		"\2\u0585\u0587\7\u012c\2\2\u0586\u0585\3\2\2\2\u0586\u0587\3\2\2\2\u0587"+
		"\u0588\3\2\2\2\u0588\u0589\7\u008c\2\2\u0589\u058a\5\u012a\u0096\2\u058a"+
		"\u058b\7\u00c9\2\2\u058b\u058c\5\u00e4s\2\u058c\u058d\7\u016a\2\2\u058d"+
		"\u0592\5\u00a8U\2\u058e\u058f\7\u015c\2\2\u058f\u0591\5\u00a8U\2\u0590"+
		"\u058e\3\2\2\2\u0591\u0594\3\2\2\2\u0592\u0590\3\2\2\2\u0592\u0593\3\2"+
		"\2\2\u0593\u0595\3\2\2\2\u0594\u0592\3\2\2\2\u0595\u0596\7\u016d\2\2\u0596"+
		"\u00a5\3\2\2\2\u0597\u0599\7<\2\2\u0598\u059a\7\u012c\2\2\u0599\u0598"+
		"\3\2\2\2\u0599\u059a\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059c\7\u016a\2"+
		"\2\u059c\u05a1\5\u00a8U\2\u059d\u059e\7\u015c\2\2\u059e\u05a0\5\u00a8"+
		"U\2\u059f\u059d\3\2\2\2\u05a0\u05a3\3\2\2\2\u05a1\u059f\3\2\2\2\u05a1"+
		"\u05a2\3\2\2\2\u05a2\u05a4\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a4\u05a5\7\u016d"+
		"\2\2\u05a5\u00a7\3\2\2\2\u05a6\u05a8\5\u012a\u0096\2\u05a7\u05a9\t\4\2"+
		"\2\u05a8\u05a7\3\2\2\2\u05a8\u05a9\3\2\2\2\u05a9\u00a9\3\2\2\2\u05aa\u05ac"+
		"\7\u00eb\2\2\u05ab\u05ad\5\u0102\u0082\2\u05ac\u05ab\3\2\2\2\u05ac\u05ad"+
		"\3\2\2\2\u05ad\u00ab\3\2\2\2\u05ae\u05af\7t\2\2\u05af\u05b0\7\u0171\2"+
		"\2\u05b0\u05b2\7\u008a\2\2\u05b1\u05b3\7\u00ed\2\2\u05b2\u05b1\3\2\2\2"+
		"\u05b2\u05b3\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b5\5\u0102\u0082\2\u05b5"+
		"\u05b6\7\u015f\2\2\u05b6\u05b9\5\u0102\u0082\2\u05b7\u05b8\t\26\2\2\u05b8"+
		"\u05ba\5\u0102\u0082\2\u05b9\u05b7\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bb"+
		"\3\2\2\2\u05bb\u05bc\7\u00af\2\2\u05bc\u05bd\5\4\3\2\u05bd\u05be\7c\2"+
		"\2\u05be\u05bf\7\u00af\2\2\u05bf\u00ad\3\2\2\2\u05c0\u05c1\7t\2\2\u05c1"+
		"\u05c2\7\u0171\2\2\u05c2\u05c4\7\u008a\2\2\u05c3\u05c5\7\u00ed\2\2\u05c4"+
		"\u05c3\3\2\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c7\5\u0102"+
		"\u0082\2\u05c7\u05c8\7\u015f\2\2\u05c8\u05cb\5\u0102\u0082\2\u05c9\u05ca"+
		"\t\26\2\2\u05ca\u05cc\5\u0102\u0082\2\u05cb\u05c9\3\2\2\2\u05cb\u05cc"+
		"\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05ce\5\4\3\2\u05ce\u05cf\7c\2\2\u05cf"+
		"\u05d0\7\u00af\2\2\u05d0\u05f3\3\2\2\2\u05d1\u05d2\7t\2\2\u05d2\u05d3"+
		"\7\u0171\2\2\u05d3\u05d5\7\u008a\2\2\u05d4\u05d6\7\u00ed\2\2\u05d5\u05d4"+
		"\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d8\5\u0102\u0082"+
		"\2\u05d8\u05d9\7\u015f\2\2\u05d9\u05dc\5\u0102\u0082\2\u05da\u05db\t\26"+
		"\2\2\u05db\u05dd\5\u0102\u0082\2\u05dc\u05da\3\2\2\2\u05dc\u05dd\3\2\2"+
		"\2\u05dd\u05de\3\2\2\2\u05de\u05df\7\u00af\2\2\u05df\u05e0\5\4\3\2\u05e0"+
		"\u05f3\3\2\2\2\u05e1\u05e2\7t\2\2\u05e2\u05e3\7\u0171\2\2\u05e3\u05e5"+
		"\7\u008a\2\2\u05e4\u05e6\7\u00ed\2\2\u05e5\u05e4\3\2\2\2\u05e5\u05e6\3"+
		"\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e8\5\u0102\u0082\2\u05e8\u05e9\7\u015f"+
		"\2\2\u05e9\u05ec\5\u0102\u0082\2\u05ea\u05eb\t\26\2\2\u05eb\u05ed\5\u0102"+
		"\u0082\2\u05ec\u05ea\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee"+
		"\u05ef\7\u00af\2\2\u05ef\u05f0\7c\2\2\u05f0\u05f1\7\u00af\2\2\u05f1\u05f3"+
		"\3\2\2\2\u05f2\u05c0\3\2\2\2\u05f2\u05d1\3\2\2\2\u05f2\u05e1\3\2\2\2\u05f3"+
		"\u00af\3\2\2\2\u05f4\u05f6\5\u00b2Z\2\u05f5\u05f4\3\2\2\2\u05f5\u05f6"+
		"\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\5\u00b8]\2\u05f8\u00b1\3\2\2"+
		"\2\u05f9\u05fa\7\u013c\2\2\u05fa\u05ff\5\u00b4[\2\u05fb\u05fc\7\u015c"+
		"\2\2\u05fc\u05fe\5\u00b4[\2\u05fd\u05fb\3\2\2\2\u05fe\u0601\3\2\2\2\u05ff"+
		"\u05fd\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u00b3\3\2\2\2\u0601\u05ff\3\2"+
		"\2\2\u0602\u0604\5\u012a\u0096\2\u0603\u0605\5\u00b6\\\2\u0604\u0603\3"+
		"\2\2\2\u0604\u0605\3\2\2\2\u0605\u0606\3\2\2\2\u0606\u0607\7\17\2\2\u0607"+
		"\u0608\7\u016a\2\2\u0608\u0609\5\u00b8]\2\u0609\u060a\7\u016d\2\2\u060a"+
		"\u00b5\3\2\2\2\u060b\u060c\7\u016a\2\2\u060c\u0611\5\u012a\u0096\2\u060d"+
		"\u060e\7\u015c\2\2\u060e\u0610\5\u012a\u0096\2\u060f\u060d\3\2\2\2\u0610"+
		"\u0613\3\2\2\2\u0611\u060f\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0614\3\2"+
		"\2\2\u0613\u0611\3\2\2\2\u0614\u0615\7\u016d\2\2\u0615\u00b7\3\2\2\2\u0616"+
		"\u061c\5\u00ba^\2\u0617\u0618\5\u00bc_\2\u0618\u0619\5\u00ba^\2\u0619"+
		"\u061b\3\2\2\2\u061a\u0617\3\2\2\2\u061b\u061e\3\2\2\2\u061c\u061a\3\2"+
		"\2\2\u061c\u061d\3\2\2\2\u061d\u00b9\3\2\2\2\u061e\u061c\3\2\2\2\u061f"+
		"\u0625\5\u00be`\2\u0620\u0621\7\u016a\2\2\u0621\u0622\5\u00b8]\2\u0622"+
		"\u0623\7\u016d\2\2\u0623\u0625\3\2\2\2\u0624\u061f\3\2\2\2\u0624\u0620"+
		"\3\2\2\2\u0625\u00bb\3\2\2\2\u0626\u0628\7\u012b\2\2\u0627\u0629\7\t\2"+
		"\2\u0628\u0627\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u0633\3\2\2\2\u062a\u062c"+
		"\7f\2\2\u062b\u062d\7\t\2\2\u062c\u062b\3\2\2\2\u062c\u062d\3\2\2\2\u062d"+
		"\u0633\3\2\2\2\u062e\u0630\7\u0096\2\2\u062f\u0631\7\t\2\2\u0630\u062f"+
		"\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0633\3\2\2\2\u0632\u0626\3\2\2\2\u0632"+
		"\u062a\3\2\2\2\u0632\u062e\3\2\2\2\u0633\u00bd\3\2\2\2\u0634\u0635\t\27"+
		"\2\2\u0635\u0637\5\u00c2b\2\u0636\u0638\5\u00ceh\2\u0637\u0636\3\2\2\2"+
		"\u0637\u0638\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063b\5\u00d0i\2\u063a"+
		"\u063c\5\u00e6t\2\u063b\u063a\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063e"+
		"\3\2\2\2\u063d\u063f\5\u00eav\2\u063e\u063d\3\2\2\2\u063e\u063f\3\2\2"+
		"\2\u063f\u0642\3\2\2\2\u0640\u0643\5\u00ecw\2\u0641\u0643\5\u00eex\2\u0642"+
		"\u0640\3\2\2\2\u0642\u0641\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0645\3\2"+
		"\2\2\u0644\u0646\5\u00f0y\2\u0645\u0644\3\2\2\2\u0645\u0646\3\2\2\2\u0646"+
		"\u00bf\3\2\2\2\u0647\u0648\t\27\2\2\u0648\u064a\5\u00c2b\2\u0649\u064b"+
		"\5\u00ceh\2\u064a\u0649\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u064d\3\2\2"+
		"\2\u064c\u064e\5\u00e6t\2\u064d\u064c\3\2\2\2\u064d\u064e\3\2\2\2\u064e"+
		"\u0650\3\2\2\2\u064f\u0651\5\u00eav\2\u0650\u064f\3\2\2\2\u0650\u0651"+
		"\3\2\2\2\u0651\u0654\3\2\2\2\u0652\u0655\5\u00ecw\2\u0653\u0655\5\u00ee"+
		"x\2\u0654\u0652\3\2\2\2\u0654\u0653\3\2\2\2\u0654\u0655\3\2\2\2\u0655"+
		"\u0657\3\2\2\2\u0656\u0658\5\u00f0y\2\u0657\u0656\3\2\2\2\u0657\u0658"+
		"\3\2\2\2\u0658\u065b\3\2\2\2\u0659\u065b\5\u00d2j\2\u065a\u0647\3\2\2"+
		"\2\u065a\u0659\3\2\2\2\u065b\u00c1\3\2\2\2\u065c\u065e\5\u00c4c\2\u065d"+
		"\u065c\3\2\2\2\u065d\u065e\3\2\2\2\u065e\u0660\3\2\2\2\u065f\u0661\5\u00c6"+
		"d\2\u0660\u065f\3\2\2\2\u0660\u0661\3\2\2\2\u0661\u0662\3\2\2\2\u0662"+
		"\u0667\5\u00c8e\2\u0663\u0664\7\u015c\2\2\u0664\u0666\5\u00c8e\2\u0665"+
		"\u0663\3\2\2\2\u0666\u0669\3\2\2\2\u0667\u0665\3\2\2\2\u0667\u0668\3\2"+
		"\2\2\u0668\u00c3\3\2\2\2\u0669\u0667\3\2\2\2\u066a\u066b\t\30\2\2\u066b"+
		"\u00c5\3\2\2\2\u066c\u066d\7\u0126\2\2\u066d\u066e\5\u0102\u0082\2\u066e"+
		"\u00c7\3\2\2\2\u066f\u0670\5\u012a\u0096\2\u0670\u0671\7\u0160\2\2\u0671"+
		"\u0673\3\2\2\2\u0672\u066f\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0674\3\2"+
		"\2\2\u0674\u0676\5\u0102\u0082\2\u0675\u0677\5\u00caf\2\u0676\u0675\3"+
		"\2\2\2\u0676\u0677\3\2\2\2\u0677\u067a\3\2\2\2\u0678\u067a\5\u00ccg\2"+
		"\u0679\u0672\3\2\2\2\u0679\u0678\3\2\2\2\u067a\u00c9\3\2\2\2\u067b\u067d"+
		"\6f\5\2\u067c\u067e\7\17\2\2\u067d\u067c\3\2\2\2\u067d\u067e\3\2\2\2\u067e"+
		"\u067f\3\2\2\2\u067f\u0685\5\u012a\u0096\2\u0680\u0681\7\u016a\2\2\u0681"+
		"\u0682\7\u0124\2\2\u0682\u0683\7\u0172\2\2\u0683\u0685\7\u016d\2\2\u0684"+
		"\u067b\3\2\2\2\u0684\u0680\3\2\2\2\u0685\u00cb\3\2\2\2\u0686\u0687\7\u0171"+
		"\2\2\u0687\u0689\7\6\2\2\u0688\u0686\3\2\2\2\u0688\u0689\3\2\2\2\u0689"+
		"\u068a\3\2\2\2\u068a\u068b\7\u0168\2\2\u068b\u00cd\3\2\2\2\u068c\u068d"+
		"\7\u0098\2\2\u068d\u0692\5\u012a\u0096\2\u068e\u068f\7\u015c\2\2\u068f"+
		"\u0691\5\u012a\u0096\2\u0690\u068e\3\2\2\2\u0691\u0694\3\2\2\2\u0692\u0690"+
		"\3\2\2\2\u0692\u0693\3\2\2\2\u0693\u00cf\3\2\2\2\u0694\u0692\3\2\2\2\u0695"+
		"\u0696\7x\2\2\u0696\u069a\5\u00d4k\2\u0697\u0699\5\u00dan\2\u0698\u0697"+
		"\3\2\2\2\u0699\u069c\3\2\2\2\u069a\u0698\3\2\2\2\u069a\u069b\3\2\2\2\u069b"+
		"\u00d1\3\2\2\2\u069c\u069a\3\2\2\2\u069d\u06a1\7x\2\2\u069e\u06a0\5\u00da"+
		"n\2\u069f\u069e\3\2\2\2\u06a0\u06a3\3\2\2\2\u06a1\u069f\3\2\2\2\u06a1"+
		"\u06a2\3\2\2\2\u06a2\u00d3\3\2\2\2\u06a3\u06a1\3\2\2\2\u06a4\u06a8\5\u00d6"+
		"l\2\u06a5\u06a8\5\u00d8m\2\u06a6\u06a8\5\u00dep\2\u06a7\u06a4\3\2\2\2"+
		"\u06a7\u06a5\3\2\2\2\u06a7\u06a6\3\2\2\2\u06a8\u00d5\3\2\2\2\u06a9\u06ab"+
		"\5\u00e4s\2\u06aa\u06ac\5\u00e2r\2\u06ab\u06aa\3\2\2\2\u06ab\u06ac\3\2"+
		"\2\2\u06ac\u00d7\3\2\2\2\u06ad\u06ae\7\u016a\2\2\u06ae\u06af\5\u00b0Y"+
		"\2\u06af\u06b1\7\u016d\2\2\u06b0\u06b2\5\u00e2r\2\u06b1\u06b0\3\2\2\2"+
		"\u06b1\u06b2\3\2\2\2\u06b2\u00d9\3\2\2\2\u06b3\u06b4\7\u015c\2\2\u06b4"+
		"\u06bb\5\u00d4k\2\u06b5\u06b6\5\u00dco\2\u06b6\u06b7\5\u00d4k\2\u06b7"+
		"\u06b8\7\u00c9\2\2\u06b8\u06b9\5\u00f2z\2\u06b9\u06bb\3\2\2\2\u06ba\u06b3"+
		"\3\2\2\2\u06ba\u06b5\3\2\2\2\u06bb\u00db\3\2\2\2\u06bc\u06be\7\u008e\2"+
		"\2\u06bd\u06bc\3\2\2\2\u06bd\u06be\3\2\2\2\u06be\u06bf\3\2\2\2\u06bf\u06c6"+
		"\7\u009d\2\2\u06c0\u06c2\t\31\2\2\u06c1\u06c3\7\u00cf\2\2\u06c2\u06c1"+
		"\3\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c6\7\u009d\2"+
		"\2\u06c5\u06bd\3\2\2\2\u06c5\u06c0\3\2\2\2\u06c6\u00dd\3\2\2\2\u06c7\u06c8"+
		"\7\u011c\2\2\u06c8\u06c9\7\u016a\2\2\u06c9\u06ca\7\u0132\2\2\u06ca\u06cf"+
		"\5\u00e0q\2\u06cb\u06cc\7\u015c\2\2\u06cc\u06ce\5\u00e0q\2\u06cd\u06cb"+
		"\3\2\2\2\u06ce\u06d1\3\2\2\2\u06cf\u06cd\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0"+
		"\u06d2\3\2\2\2\u06d1\u06cf\3\2\2\2\u06d2\u06d4\7\u016d\2\2\u06d3\u06d5"+
		"\5\u00e2r\2\u06d4\u06d3\3\2\2\2\u06d4\u06d5\3\2\2\2\u06d5\u00df\3\2\2"+
		"\2\u06d6\u06e3\5\u0102\u0082\2\u06d7\u06d8\7\u016a\2\2\u06d8\u06dd\5\u0102"+
		"\u0082\2\u06d9\u06da\7\u015c\2\2\u06da\u06dc\5\u0102\u0082\2\u06db\u06d9"+
		"\3\2\2\2\u06dc\u06df\3\2\2\2\u06dd\u06db\3\2\2\2\u06dd\u06de\3\2\2\2\u06de"+
		"\u06e0\3\2\2\2\u06df\u06dd\3\2\2\2\u06e0\u06e1\7\u016d\2\2\u06e1\u06e3"+
		"\3\2\2\2\u06e2\u06d6\3\2\2\2\u06e2\u06d7\3\2\2\2\u06e3\u00e1\3\2\2\2\u06e4"+
		"\u06e6\6r\6\2\u06e5\u06e7\7\17\2\2\u06e6\u06e5\3\2\2\2\u06e6\u06e7\3\2"+
		"\2\2\u06e7\u06e8\3\2\2\2\u06e8\u06f3\5\u012a\u0096\2\u06e9\u06ea\7\u016a"+
		"\2\2\u06ea\u06ef\7\u0171\2\2\u06eb\u06ec\7\u015c\2\2\u06ec\u06ee\7\u0171"+
		"\2\2\u06ed\u06eb\3\2\2\2\u06ee\u06f1\3\2\2\2\u06ef\u06ed\3\2\2\2\u06ef"+
		"\u06f0\3\2\2\2\u06f0\u06f2\3\2\2\2\u06f1\u06ef\3\2\2\2\u06f2\u06f4\7\u016d"+
		"\2\2\u06f3\u06e9\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u00e3\3\2\2\2\u06f5"+
		"\u06f6\5\u012a\u0096\2\u06f6\u00e5\3\2\2\2\u06f7\u06f8\7\u013a\2\2\u06f8"+
		"\u06f9\5\u00f2z\2\u06f9\u00e7\3\2\2\2\u06fa\u06fb\7\u013a\2\2\u06fb\u00e9"+
		"\3\2\2\2\u06fc\u06fd\7\177\2\2\u06fd\u06fe\7\37\2\2\u06fe\u0703\5\u0102"+
		"\u0082\2\u06ff\u0700\7\u015c\2\2\u0700\u0702\5\u0102\u0082\2\u0701\u06ff"+
		"\3\2\2\2\u0702\u0705\3\2\2\2\u0703\u0701\3\2\2\2\u0703\u0704\3\2\2\2\u0704"+
		"\u00eb\3\2\2\2\u0705\u0703\3\2\2\2\u0706\u0707\7\u0082\2\2\u0707\u0708"+
		"\5\u00f2z\2\u0708\u00ed\3\2\2\2\u0709\u070a\7\u00de\2\2\u070a\u070b\5"+
		"\u00f2z\2\u070b\u00ef\3\2\2\2\u070c\u070d\7\u00cd\2\2\u070d\u070e\7\37"+
		"\2\2\u070e\u0710\5\u0102\u0082\2\u070f\u0711\t\4\2\2\u0710\u070f\3\2\2"+
		"\2\u0710\u0711\3\2\2\2\u0711\u0719\3\2\2\2\u0712\u0713\7\u015c\2\2\u0713"+
		"\u0715\5\u0102\u0082\2\u0714\u0716\t\4\2\2\u0715\u0714\3\2\2\2\u0715\u0716"+
		"\3\2\2\2\u0716\u0718\3\2\2\2\u0717\u0712\3\2\2\2\u0718\u071b\3\2\2\2\u0719"+
		"\u0717\3\2\2\2\u0719\u071a\3\2\2\2\u071a\u00f1\3\2\2\2\u071b\u0719\3\2"+
		"\2\2\u071c\u071e\bz\1\2\u071d\u071f\7\u00c2\2\2\u071e\u071d\3\2\2\2\u071e"+
		"\u071f\3\2\2\2\u071f\u0720\3\2\2\2\u0720\u0721\7\u016a\2\2\u0721\u0722"+
		"\5\u00f2z\2\u0722\u0723\7\u016d\2\2\u0723\u0726\3\2\2\2\u0724\u0726\5"+
		"\u00f4{\2\u0725\u071c\3\2\2\2\u0725\u0724\3\2\2\2\u0726\u072d\3\2\2\2"+
		"\u0727\u0728\f\4\2\2\u0728\u0729\5\u00fe\u0080\2\u0729\u072a\5\u00f2z"+
		"\5\u072a\u072c\3\2\2\2\u072b\u0727\3\2\2\2\u072c\u072f\3\2\2\2\u072d\u072b"+
		"\3\2\2\2\u072d\u072e\3\2\2\2\u072e\u00f3\3\2\2\2\u072f\u072d\3\2\2\2\u0730"+
		"\u0733\5\u00f6|\2\u0731\u0733\5\u00fc\177\2\u0732\u0730\3\2\2\2\u0732"+
		"\u0731\3\2\2\2\u0733\u00f5\3\2\2\2\u0734\u0735\5\u0102\u0082\2\u0735\u0737"+
		"\7\u009a\2\2\u0736\u0738\7\u00c2\2\2\u0737\u0736\3\2\2\2\u0737\u0738\3"+
		"\2\2\2\u0738\u0739\3\2\2\2\u0739\u073a\7\u00c4\2\2\u073a\u074c\3\2\2\2"+
		"\u073b\u073c\5\u0102\u0082\2\u073c\u073d\7\27\2\2\u073d\u073e\5\u0102"+
		"\u0082\2\u073e\u073f\7\f\2\2\u073f\u0740\5\u0102\u0082\2\u0740\u074c\3"+
		"\2\2\2\u0741\u0743\7\u00c2\2\2\u0742\u0741\3\2\2\2\u0742\u0743\3\2\2\2"+
		"\u0743\u0744\3\2\2\2\u0744\u0745\7k\2\2\u0745\u0746\7\u016a\2\2\u0746"+
		"\u0747\5\u00b0Y\2\u0747\u0748\7\u016d\2\2\u0748\u074c\3\2\2\2\u0749\u074c"+
		"\5\u00f8}\2\u074a\u074c\5\u00fa~\2\u074b\u0734\3\2\2\2\u074b\u073b\3\2"+
		"\2\2\u074b\u0742\3\2\2\2\u074b\u0749\3\2\2\2\u074b\u074a\3\2\2\2\u074c"+
		"\u00f7\3\2\2\2\u074d\u074f\5\u0102\u0082\2\u074e\u0750\7\u00c2\2\2\u074f"+
		"\u074e\3\2\2\2\u074f\u0750\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0752\7\u008a"+
		"\2\2\u0752\u075c\7\u016a\2\2\u0753\u0758\5\u0102\u0082\2\u0754\u0755\7"+
		"\u015c\2\2\u0755\u0757\5\u0102\u0082\2\u0756\u0754\3\2\2\2\u0757\u075a"+
		"\3\2\2\2\u0758\u0756\3\2\2\2\u0758\u0759\3\2\2\2\u0759\u075d\3\2\2\2\u075a"+
		"\u0758\3\2\2\2\u075b\u075d\5\u00b0Y\2\u075c\u0753\3\2\2\2\u075c\u075b"+
		"\3\2\2\2\u075d\u075e\3\2\2\2\u075e\u075f\7\u016d\2\2\u075f\u00f9\3\2\2"+
		"\2\u0760\u0761\7\u016a\2\2\u0761\u0766\5\u0102\u0082\2\u0762\u0763\7\u015c"+
		"\2\2\u0763\u0765\5\u0102\u0082\2\u0764\u0762\3\2\2\2\u0765\u0768\3\2\2"+
		"\2\u0766\u0764\3\2\2\2\u0766\u0767\3\2\2\2\u0767\u0769\3\2\2\2\u0768\u0766"+
		"\3\2\2\2\u0769\u076b\7\u016d\2\2\u076a\u076c\7\u00c2\2\2\u076b\u076a\3"+
		"\2\2\2\u076b\u076c\3\2\2\2\u076c\u076d\3\2\2\2\u076d\u076e\7\u008a\2\2"+
		"\u076e\u076f\7\u016a\2\2\u076f\u0770\5\u00b0Y\2\u0770\u0771\7\u016d\2"+
		"\2\u0771\u00fb\3\2\2\2\u0772\u0773\5\u0102\u0082\2\u0773\u0774\5\u0100"+
		"\u0081\2\u0774\u0775\5\u0102\u0082\2\u0775\u00fd\3\2\2\2\u0776\u0777\t"+
		"\32\2\2\u0777\u00ff\3\2\2\2\u0778\u0785\7\u0160\2\2\u0779\u0785\7\u0161"+
		"\2\2\u077a\u0785\7\u0162\2\2\u077b\u0785\7\u0163\2\2\u077c\u0785\7\u0166"+
		"\2\2\u077d\u0785\7\u0167\2\2\u077e\u0785\7\u0164\2\2\u077f\u0785\7\u0165"+
		"\2\2\u0780\u0782\7\u00c2\2\2\u0781\u0780\3\2\2\2\u0781\u0782\3\2\2\2\u0782"+
		"\u0783\3\2\2\2\u0783\u0785\t\33\2\2\u0784\u0778\3\2\2\2\u0784\u0779\3"+
		"\2\2\2\u0784\u077a\3\2\2\2\u0784\u077b\3\2\2\2\u0784\u077c\3\2\2\2\u0784"+
		"\u077d\3\2\2\2\u0784\u077e\3\2\2\2\u0784\u077f\3\2\2\2\u0784\u0781\3\2"+
		"\2\2\u0785\u0101\3\2\2\2\u0786\u0787\b\u0082\1\2\u0787\u0788\7\u016a\2"+
		"\2\u0788\u0789\5\u00b0Y\2\u0789\u078a\7\u016d\2\2\u078a\u0797\3\2\2\2"+
		"\u078b\u078c\7\u016a\2\2\u078c\u078d\5\u0102\u0082\2\u078d\u078e\7\u016d"+
		"\2\2\u078e\u0797\3\2\2\2\u078f\u0797\5\u0106\u0084\2\u0790\u0797\5\u010a"+
		"\u0086\2\u0791\u0797\5\u010e\u0088\2\u0792\u0797\5\u0114\u008b\2\u0793"+
		"\u0797\5\u011c\u008f\2\u0794\u0797\5\u011e\u0090\2\u0795\u0797\5\u0104"+
		"\u0083\2\u0796\u0786\3\2\2\2\u0796\u078b\3\2\2\2\u0796\u078f\3\2\2\2\u0796"+
		"\u0790\3\2\2\2\u0796\u0791\3\2\2\2\u0796\u0792\3\2\2\2\u0796\u0793\3\2"+
		"\2\2\u0796\u0794\3\2\2\2\u0796\u0795\3\2\2\2\u0797\u07a8\3\2\2\2\u0798"+
		"\u0799\f\17\2\2\u0799\u079a\7\u0168\2\2\u079a\u07a7\5\u0102\u0082\20\u079b"+
		"\u079c\f\16\2\2\u079c\u079d\7\u015e\2\2\u079d\u07a7\5\u0102\u0082\17\u079e"+
		"\u079f\f\r\2\2\u079f\u07a0\7\u015a\2\2\u07a0\u07a7\5\u0102\u0082\16\u07a1"+
		"\u07a2\f\f\2\2\u07a2\u07a3\7\u0170\2\2\u07a3\u07a7\5\u0102\u0082\r\u07a4"+
		"\u07a5\f\20\2\2\u07a5\u07a7\5\u0108\u0085\2\u07a6\u0798\3\2\2\2\u07a6"+
		"\u079b\3\2\2\2\u07a6\u079e\3\2\2\2\u07a6\u07a1\3\2\2\2\u07a6\u07a4\3\2"+
		"\2\2\u07a7\u07aa\3\2\2\2\u07a8\u07a6\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9"+
		"\u0103\3\2\2\2\u07aa\u07a8\3\2\2\2\u07ab\u07b4\5\u0126\u0094\2\u07ac\u07b4"+
		"\5\u0128\u0095\2\u07ad\u07b4\5\u0134\u009b\2\u07ae\u07b4\5\u012a\u0096"+
		"\2\u07af\u07b4\5\u012c\u0097\2\u07b0\u07b4\5\u0132\u009a\2\u07b1\u07b4"+
		"\5\u0130\u0099\2\u07b2\u07b4\5\u0136\u009c\2\u07b3\u07ab\3\2\2\2\u07b3"+
		"\u07ac\3\2\2\2\u07b3\u07ad\3\2\2\2\u07b3\u07ae\3\2\2\2\u07b3\u07af\3\2"+
		"\2\2\u07b3\u07b0\3\2\2\2\u07b3\u07b1\3\2\2\2\u07b3\u07b2\3\2\2\2\u07b4"+
		"\u0105\3\2\2\2\u07b5\u07b6\7\u0097\2\2\u07b6\u07b7\5\u0102\u0082\2\u07b7"+
		"\u07b8\5\u0108\u0085\2\u07b8\u0107\3\2\2\2\u07b9\u07ba\t\34\2\2\u07ba"+
		"\u0109\3\2\2\2\u07bb\u07bc\5\u010c\u0087\2\u07bc\u07bd\t\35\2\2\u07bd"+
		"\u07c2\5\u010c\u0087\2\u07be\u07bf\t\35\2\2\u07bf\u07c1\5\u010c\u0087"+
		"\2\u07c0\u07be\3\2\2\2\u07c1\u07c4\3\2\2\2\u07c2\u07c0\3\2\2\2\u07c2\u07c3"+
		"\3\2\2\2\u07c3\u010b\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c5\u07c6\7\u016a\2"+
		"\2\u07c6\u07c7\5\u0102\u0082\2\u07c7\u07c8\7\u016d\2\2\u07c8\u07cf\3\2"+
		"\2\2\u07c9\u07cf\5\u010e\u0088\2\u07ca\u07cf\5\u0114\u008b\2\u07cb\u07cf"+
		"\5\u011c\u008f\2\u07cc\u07cf\5\u011e\u0090\2\u07cd\u07cf\5\u0104\u0083"+
		"\2\u07ce\u07c5\3\2\2\2\u07ce\u07c9\3\2\2\2\u07ce\u07ca\3\2\2\2\u07ce\u07cb"+
		"\3\2\2\2\u07ce\u07cc\3\2\2\2\u07ce\u07cd\3\2\2\2\u07cf\u010d\3\2\2\2\u07d0"+
		"\u07d3\5\u0110\u0089\2\u07d1\u07d3\5\u0112\u008a\2\u07d2\u07d0\3\2\2\2"+
		"\u07d2\u07d1\3\2\2\2\u07d3\u010f\3\2\2\2\u07d4\u07d5\7$\2\2\u07d5\u07db"+
		"\5\u0102\u0082\2\u07d6\u07d7\7\u0139\2\2\u07d7\u07d8\5\u0102\u0082\2\u07d8"+
		"\u07d9\7\u0121\2\2\u07d9\u07da\5\u0102\u0082\2\u07da\u07dc\3\2\2\2\u07db"+
		"\u07d6\3\2\2\2\u07dc\u07dd\3\2\2\2\u07dd\u07db\3\2\2\2\u07dd\u07de\3\2"+
		"\2\2\u07de\u07e1\3\2\2\2\u07df\u07e0\7_\2\2\u07e0\u07e2\5\u0102\u0082"+
		"\2\u07e1\u07df\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e3\3\2\2\2\u07e3\u07e4"+
		"\7c\2\2\u07e4\u0111\3\2\2\2\u07e5\u07eb\7$\2\2\u07e6\u07e7\7\u0139\2\2"+
		"\u07e7\u07e8\5\u00f2z\2\u07e8\u07e9\7\u0121\2\2\u07e9\u07ea\5\u0102\u0082"+
		"\2\u07ea\u07ec\3\2\2\2\u07eb\u07e6\3\2\2\2\u07ec\u07ed\3\2\2\2\u07ed\u07eb"+
		"\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee\u07f1\3\2\2\2\u07ef\u07f0\7_\2\2\u07f0"+
		"\u07f2\5\u0102\u0082\2\u07f1\u07ef\3\2\2\2\u07f1\u07f2\3\2\2\2\u07f2\u07f3"+
		"\3\2\2\2\u07f3\u07f4\7c\2\2\u07f4\u0113\3\2\2\2\u07f5\u07f6\7\24\2\2\u07f6"+
		"\u07f8\7\u016a\2\2\u07f7\u07f9\5\u0116\u008c\2\u07f8\u07f7\3\2\2\2\u07f8"+
		"\u07f9\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fb\5\u0102\u0082\2\u07fb\u07fd"+
		"\7\u016d\2\2\u07fc\u07fe\5\u0118\u008d\2\u07fd\u07fc\3\2\2\2\u07fd\u07fe"+
		"\3\2\2\2\u07fe\u088e\3\2\2\2\u07ff\u0800\7:\2\2\u0800\u0806\7\u016a\2"+
		"\2\u0801\u0803\5\u0116\u008c\2\u0802\u0801\3\2\2\2\u0802\u0803\3\2\2\2"+
		"\u0803\u0804\3\2\2\2\u0804\u0807\5\u0102\u0082\2\u0805\u0807\7\u0168\2"+
		"\2\u0806\u0802\3\2\2\2\u0806\u0805\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u080a"+
		"\7\u016d\2\2\u0809\u080b\5\u0118\u008d\2\u080a\u0809\3\2\2\2\u080a\u080b"+
		"\3\2\2\2\u080b\u088e\3\2\2\2\u080c\u080d\7;\2\2\u080d\u0813\7\u016a\2"+
		"\2\u080e\u0810\5\u0116\u008c\2\u080f\u080e\3\2\2\2\u080f\u0810\3\2\2\2"+
		"\u0810\u0811\3\2\2\2\u0811\u0814\5\u0102\u0082\2\u0812\u0814\7\u0168\2"+
		"\2\u0813\u080f\3\2\2\2\u0813\u0812\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u0817"+
		"\7\u016d\2\2\u0816\u0818\5\u0118\u008d\2\u0817\u0816\3\2\2\2\u0817\u0818"+
		"\3\2\2\2\u0818\u088e\3\2\2\2\u0819\u081a\7\u0143\2\2\u081a\u081b\7\u016a"+
		"\2\2\u081b\u081c\7\u016d\2\2\u081c\u088e\5\u0118\u008d\2\u081d\u081e\7"+
		"\u0147\2\2\u081e\u081f\7\u016a\2\2\u081f\u0820\7\u016d\2\2\u0820\u088e"+
		"\5\u0118\u008d\2\u0821\u0822\7\u0148\2\2\u0822\u0823\7\u016a\2\2\u0823"+
		"\u0824\5\u0102\u0082\2\u0824\u0825\7\u016d\2\2\u0825\u0826\5\u0118\u008d"+
		"\2\u0826\u088e\3\2\2\2\u0827\u0828\7\u0149\2\2\u0828\u0829\7\u016a\2\2"+
		"\u0829\u0830\5\u0102\u0082\2\u082a\u082b\7\u015c\2\2\u082b\u082e\5\u0102"+
		"\u0082\2\u082c\u082d\7\u015c\2\2\u082d\u082f\5\u0102\u0082\2\u082e\u082c"+
		"\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0831\3\2\2\2\u0830\u082a\3\2\2\2\u0830"+
		"\u0831\3\2\2\2\u0831\u0832\3\2\2\2\u0832\u0833\7\u016d\2\2\u0833\u0834"+
		"\5\u0118\u008d\2\u0834\u088e\3\2\2\2\u0835\u0836\7\u014a\2\2\u0836\u0837"+
		"\7\u016a\2\2\u0837\u0838\5\u0102\u0082\2\u0838\u0839\7\u016d\2\2\u0839"+
		"\u083a\5\u0118\u008d\2\u083a\u088e\3\2\2\2\u083b\u083c\7\u014b\2\2\u083c"+
		"\u083d\7\u016a\2\2\u083d\u0844\5\u0102\u0082\2\u083e\u083f\7\u015c\2\2"+
		"\u083f\u0842\5\u0102\u0082\2\u0840\u0841\7\u015c\2\2\u0841\u0843\5\u0102"+
		"\u0082\2\u0842\u0840\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0845\3\2\2\2\u0844"+
		"\u083e\3\2\2\2\u0844\u0845\3\2\2\2\u0845\u0846\3\2\2\2\u0846\u0847\7\u016d"+
		"\2\2\u0847\u0848\5\u0118\u008d\2\u0848\u088e\3\2\2\2\u0849\u084a\7\u00b2"+
		"\2\2\u084a\u084c\7\u016a\2\2\u084b\u084d\5\u0116\u008c\2\u084c\u084b\3"+
		"\2\2\2\u084c\u084d\3\2\2\2\u084d\u084e\3\2\2\2\u084e\u084f\5\u0102\u0082"+
		"\2\u084f\u0851\7\u016d\2\2\u0850\u0852\5\u0118\u008d\2\u0851\u0850\3\2"+
		"\2\2\u0851\u0852\3\2\2\2\u0852\u088e\3\2\2\2\u0853\u0854\7\u00b8\2\2\u0854"+
		"\u0856\7\u016a\2\2\u0855\u0857\5\u0116\u008c\2\u0856\u0855\3\2\2\2\u0856"+
		"\u0857\3\2\2\2\u0857\u0858\3\2\2\2\u0858\u0859\5\u0102\u0082\2\u0859\u085b"+
		"\7\u016d\2\2\u085a\u085c\5\u0118\u008d\2\u085b\u085a\3\2\2\2\u085b\u085c"+
		"\3\2\2\2\u085c\u088e\3\2\2\2\u085d\u085e\7\u0154\2\2\u085e\u085f\7\u016a"+
		"\2\2\u085f\u0860\7\u016d\2\2\u0860\u088e\5\u0118\u008d\2\u0861\u0862\7"+
		"\u0155\2\2\u0862\u0863\7\u016a\2\2\u0863\u0864\7\u016d\2\2\u0864\u088e"+
		"\5\u0118\u008d\2\u0865\u0866\7\u0156\2\2\u0866\u0868\7\u016a\2\2\u0867"+
		"\u0869\5\u0116\u008c\2\u0868\u0867\3\2\2\2\u0868\u0869\3\2\2\2\u0869\u086a"+
		"\3\2\2\2\u086a\u086b\5\u0102\u0082\2\u086b\u086d\7\u016d\2\2\u086c\u086e"+
		"\5\u0118\u008d\2\u086d\u086c\3\2\2\2\u086d\u086e\3\2\2\2\u086e\u088e\3"+
		"\2\2\2\u086f\u0870\7\u0119\2\2\u0870\u0872\7\u016a\2\2\u0871\u0873\5\u0116"+
		"\u008c\2\u0872\u0871\3\2\2\2\u0872\u0873\3\2\2\2\u0873\u0874\3\2\2\2\u0874"+
		"\u0875\5\u0102\u0082\2\u0875\u0877\7\u016d\2\2\u0876\u0878\5\u0118\u008d"+
		"\2\u0877\u0876\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u088e\3\2\2\2\u0879\u087a"+
		"\7\u0133\2\2\u087a\u087c\7\u016a\2\2\u087b\u087d\5\u0116\u008c\2\u087c"+
		"\u087b\3\2\2\2\u087c\u087d\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u087f\5\u0102"+
		"\u0082\2\u087f\u0881\7\u016d\2\2\u0880\u0882\5\u0118\u008d\2\u0881\u0880"+
		"\3\2\2\2\u0881\u0882\3\2\2\2\u0882\u088e\3\2\2\2\u0883\u0884\7\u0158\2"+
		"\2\u0884\u0886\7\u016a\2\2\u0885\u0887\5\u0116\u008c\2\u0886\u0885\3\2"+
		"\2\2\u0886\u0887\3\2\2\2\u0887\u0888\3\2\2\2\u0888\u0889\5\u0102\u0082"+
		"\2\u0889\u088b\7\u016d\2\2\u088a\u088c\5\u0118\u008d\2\u088b\u088a\3\2"+
		"\2\2\u088b\u088c\3\2\2\2\u088c\u088e\3\2\2\2\u088d\u07f5\3\2\2\2\u088d"+
		"\u07ff\3\2\2\2\u088d\u080c\3\2\2\2\u088d\u0819\3\2\2\2\u088d\u081d\3\2"+
		"\2\2\u088d\u0821\3\2\2\2\u088d\u0827\3\2\2\2\u088d\u0835\3\2\2\2\u088d"+
		"\u083b\3\2\2\2\u088d\u0849\3\2\2\2\u088d\u0853\3\2\2\2\u088d\u085d\3\2"+
		"\2\2\u088d\u0861\3\2\2\2\u088d\u0865\3\2\2\2\u088d\u086f\3\2\2\2\u088d"+
		"\u0879\3\2\2\2\u088d\u0883\3\2\2\2\u088e\u0115\3\2\2\2\u088f\u0890\t\30"+
		"\2\2\u0890\u0117\3\2\2\2\u0891\u0892\7\u00d0\2\2\u0892\u0894\7\u016a\2"+
		"\2\u0893\u0895\5\u011a\u008e\2\u0894\u0893\3\2\2\2\u0894\u0895\3\2\2\2"+
		"\u0895\u0897\3\2\2\2\u0896\u0898\5\u00f0y\2\u0897\u0896\3\2\2\2\u0897"+
		"\u0898\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u089a\7\u016d\2\2\u089a\u0119"+
		"\3\2\2\2\u089b\u089c\7\u00d4\2\2\u089c\u089d\7\37\2\2\u089d\u08a2\5\u0102"+
		"\u0082\2\u089e\u089f\7\u015c\2\2\u089f\u08a1\5\u0102\u0082\2\u08a0\u089e"+
		"\3\2\2\2\u08a1\u08a4\3\2\2\2\u08a2\u08a0\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3"+
		"\u011b\3\2\2\2\u08a4\u08a2\3\2\2\2\u08a5\u096e\7\u0142\2\2\u08a6\u08a7"+
		"\7&\2\2\u08a7\u08a8\7\u016a\2\2\u08a8\u08a9\5\u0102\u0082\2\u08a9\u08aa"+
		"\7\17\2\2\u08aa\u08ac\5d\63\2\u08ab\u08ad\5f\64\2\u08ac\u08ab\3\2\2\2"+
		"\u08ac\u08ad\3\2\2\2\u08ad\u08ae\3\2\2\2\u08ae\u08af\7\u016d\2\2\u08af"+
		"\u096e\3\2\2\2\u08b0\u08b1\7:\2\2\u08b1\u08b4\7\u016a\2\2\u08b2\u08b5"+
		"\5\u0102\u0082\2\u08b3\u08b5\7\u0168\2\2\u08b4\u08b2\3\2\2\2\u08b4\u08b3"+
		"\3\2\2\2\u08b5\u08b6\3\2\2\2\u08b6\u096e\7\u016d\2\2\u08b7\u096e\7\u0144"+
		"\2\2\u08b8\u08b9\7@\2\2\u08b9\u096e\7E\2\2\u08ba\u08be\7\u0145\2\2\u08bb"+
		"\u08bc\7@\2\2\u08bc\u08be\7\u0122\2\2\u08bd\u08ba\3\2\2\2\u08bd\u08bb"+
		"\3\2\2\2\u08be\u08c3\3\2\2\2\u08bf\u08c0\7\u016a\2\2\u08c0\u08c1\5\u0102"+
		"\u0082\2\u08c1\u08c2\7\u016d\2\2\u08c2\u08c4\3\2\2\2\u08c3\u08bf\3\2\2"+
		"\2\u08c3\u08c4\3\2\2\2\u08c4\u096e\3\2\2\2\u08c5\u096e\7\u0146\2\2\u08c6"+
		"\u08c7\7@\2\2\u08c7\u096e\7\u0159\2\2\u08c8\u08c9\7\u014c\2\2\u08c9\u08ca"+
		"\7\u016a\2\2\u08ca\u08d7\5\u0102\u0082\2\u08cb\u08cc\7\u015c\2\2\u08cc"+
		"\u08d4\5\u0102\u0082\2\u08cd\u08ce\7\u015c\2\2\u08ce\u08cf\5\u0102\u0082"+
		"\2\u08cf\u08d0\7\u0160\2\2\u08d0\u08d1\5\u0102\u0082\2\u08d1\u08d3\3\2"+
		"\2\2\u08d2\u08cd\3\2\2\2\u08d3\u08d6\3\2\2\2\u08d4\u08d2\3\2\2\2\u08d4"+
		"\u08d5\3\2\2\2\u08d5\u08d8\3\2\2\2\u08d6\u08d4\3\2\2\2\u08d7\u08cb\3\2"+
		"\2\2\u08d7\u08d8\3\2\2\2\u08d8\u08d9\3\2\2\2\u08d9\u08da\7\u016d\2\2\u08da"+
		"\u096e\3\2\2\2\u08db\u08dc\7\u014d\2\2\u08dc\u08dd\7\u016a\2\2\u08dd\u08ea"+
		"\5\u0102\u0082\2\u08de\u08df\7\u015c\2\2\u08df\u08e7\5\u0102\u0082\2\u08e0"+
		"\u08e1\7\u015c\2\2\u08e1\u08e2\5\u0102\u0082\2\u08e2\u08e3\7\u0160\2\2"+
		"\u08e3\u08e4\5\u0102\u0082\2\u08e4\u08e6\3\2\2\2\u08e5\u08e0\3\2\2\2\u08e6"+
		"\u08e9\3\2\2\2\u08e7\u08e5\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u08eb\3\2"+
		"\2\2\u08e9\u08e7\3\2\2\2\u08ea\u08de\3\2\2\2\u08ea\u08eb\3\2\2\2\u08eb"+
		"\u08ec\3\2\2\2\u08ec\u08ed\7\u016d\2\2\u08ed\u096e\3\2\2\2\u08ee\u08ef"+
		"\7\u014e\2\2\u08ef\u08f0\7\u016a\2\2\u08f0\u08fd\5\u0102\u0082\2\u08f1"+
		"\u08f2\7\u015c\2\2\u08f2\u08fa\5\u0102\u0082\2\u08f3\u08f4\7\u015c\2\2"+
		"\u08f4\u08f5\5\u0102\u0082\2\u08f5\u08f6\7\u0160\2\2\u08f6\u08f7\5\u0102"+
		"\u0082\2\u08f7\u08f9\3\2\2\2\u08f8\u08f3\3\2\2\2\u08f9\u08fc\3\2\2\2\u08fa"+
		"\u08f8\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u08fe\3\2\2\2\u08fc\u08fa\3\2"+
		"\2\2\u08fd\u08f1\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff"+
		"\u0900\7\u016d\2\2\u0900\u096e\3\2\2\2\u0901\u0902\7\u014f\2\2\u0902\u0903"+
		"\7\u016a\2\2\u0903\u0910\5\u0102\u0082\2\u0904\u0905\7\u015c\2\2\u0905"+
		"\u090d\5\u0102\u0082\2\u0906\u0907\7\u015c\2\2\u0907\u0908\5\u0102\u0082"+
		"\2\u0908\u0909\7\u0160\2\2\u0909\u090a\5\u0102\u0082\2\u090a\u090c\3\2"+
		"\2\2\u090b\u0906\3\2\2\2\u090c\u090f\3\2\2\2\u090d\u090b\3\2\2\2\u090d"+
		"\u090e\3\2\2\2\u090e\u0911\3\2\2\2\u090f\u090d\3\2\2\2\u0910\u0904\3\2"+
		"\2\2\u0910\u0911\3\2\2\2\u0911\u0912\3\2\2\2\u0912\u0913\7\u016d\2\2\u0913"+
		"\u096e\3\2\2\2\u0914\u0915\7\u0150\2\2\u0915\u0916\7\u016a\2\2\u0916\u0923"+
		"\5\u0102\u0082\2\u0917\u0918\7\u015c\2\2\u0918\u0920\5\u0102\u0082\2\u0919"+
		"\u091a\7\u015c\2\2\u091a\u091b\5\u0102\u0082\2\u091b\u091c\7\u0160\2\2"+
		"\u091c\u091d\5\u0102\u0082\2\u091d\u091f\3\2\2\2\u091e\u0919\3\2\2\2\u091f"+
		"\u0922\3\2\2\2\u0920\u091e\3\2\2\2\u0920\u0921\3\2\2\2\u0921\u0924\3\2"+
		"\2\2\u0922\u0920\3\2\2\2\u0923\u0917\3\2\2\2\u0923\u0924\3\2\2\2\u0924"+
		"\u0925\3\2\2\2\u0925\u0926\7\u016d\2\2\u0926\u096e\3\2\2\2\u0927\u0928"+
		"\7\u0151\2\2\u0928\u0929\7\u016a\2\2\u0929\u0936\5\u0102\u0082\2\u092a"+
		"\u092b\7\u015c\2\2\u092b\u0933\5\u0102\u0082\2\u092c\u092d\7\u015c\2\2"+
		"\u092d\u092e\5\u0102\u0082\2\u092e\u092f\7\u0160\2\2\u092f\u0930\5\u0102"+
		"\u0082\2\u0930\u0932\3\2\2\2\u0931\u092c\3\2\2\2\u0932\u0935\3\2\2\2\u0933"+
		"\u0931\3\2\2\2\u0933\u0934\3\2\2\2\u0934\u0937\3\2\2\2\u0935\u0933\3\2"+
		"\2\2\u0936\u092a\3\2\2\2\u0936\u0937\3\2\2\2\u0937\u0938\3\2\2\2\u0938"+
		"\u0939\7\u016d\2\2\u0939\u096e\3\2\2\2\u093a\u093b\7\u0152\2\2\u093b\u093c"+
		"\7\u016a\2\2\u093c\u0944\5\u0102\u0082\2\u093d\u093e\7\u015c\2\2\u093e"+
		"\u093f\5\u0102\u0082\2\u093f\u0940\7\u0160\2\2\u0940\u0941\5\u0102\u0082"+
		"\2\u0941\u0943\3\2\2\2\u0942\u093d\3\2\2\2\u0943\u0946\3\2\2\2\u0944\u0942"+
		"\3\2\2\2\u0944\u0945\3";
	private static final String _serializedATNSegment1 =
		"\2\2\2\u0945\u0947\3\2\2\2\u0946\u0944\3\2\2\2\u0947\u0948\7\u016d\2\2"+
		"\u0948\u096e\3\2\2\2\u0949\u094a\7\u0153\2\2\u094a\u094b\7\u016a\2\2\u094b"+
		"\u0951\5\u0102\u0082\2\u094c\u094d\7\u015c\2\2\u094d\u094e\5\u0102\u0082"+
		"\2\u094e\u094f\7\u0160\2\2\u094f\u0950\5\u0102\u0082\2\u0950\u0952\3\2"+
		"\2\2\u0951\u094c\3\2\2\2\u0952\u0953\3\2\2\2\u0953\u0951\3\2\2\2\u0953"+
		"\u0954\3\2\2\2\u0954\u0957\3\2\2\2\u0955\u0956\7\u015c\2\2\u0956\u0958"+
		"\5\u0102\u0082\2\u0957\u0955\3\2\2\2\u0957\u0958\3\2\2\2\u0958\u0959\3"+
		"\2\2\2\u0959\u095a\7\u016d\2\2\u095a\u096e\3\2\2\2\u095b\u095c\7\u00f9"+
		"\2\2\u095c\u095d\7\u016a\2\2\u095d\u095e\5\u0102\u0082\2\u095e\u095f\7"+
		"\u016d\2\2\u095f\u096e\3\2\2\2\u0960\u0961\7\u0118\2\2\u0961\u0962\7\u016a"+
		"\2\2\u0962\u0963\5\u0102\u0082\2\u0963\u0964\7x\2\2\u0964\u0967\5\u0102"+
		"\u0082\2\u0965\u0966\7t\2\2\u0966\u0968\5\u0102\u0082\2\u0967\u0965\3"+
		"\2\2\2\u0967\u0968\3\2\2\2\u0968\u0969\3\2\2\2\u0969\u096a\7\u016d\2\2"+
		"\u096a\u096e\3\2\2\2\u096b\u096e\7\u0157\2\2\u096c\u096e\7\u0159\2\2\u096d"+
		"\u08a5\3\2\2\2\u096d\u08a6\3\2\2\2\u096d\u08b0\3\2\2\2\u096d\u08b7\3\2"+
		"\2\2\u096d\u08b8\3\2\2\2\u096d\u08bd\3\2\2\2\u096d\u08c5\3\2\2\2\u096d"+
		"\u08c6\3\2\2\2\u096d\u08c8\3\2\2\2\u096d\u08db\3\2\2\2\u096d\u08ee\3\2"+
		"\2\2\u096d\u0901\3\2\2\2\u096d\u0914\3\2\2\2\u096d\u0927\3\2\2\2\u096d"+
		"\u093a\3\2\2\2\u096d\u0949\3\2\2\2\u096d\u095b\3\2\2\2\u096d\u0960\3\2"+
		"\2\2\u096d\u096b\3\2\2\2\u096d\u096c\3\2\2\2\u096e\u011d\3\2\2\2\u096f"+
		"\u0970\5\u012a\u0096\2\u0970\u0972\7\u016a\2\2\u0971\u0973\5\u0120\u0091"+
		"\2\u0972\u0971\3\2\2\2\u0972\u0973\3\2\2\2\u0973\u0974\3\2\2\2\u0974\u0975"+
		"\7\u016d\2\2\u0975\u011f\3\2\2\2\u0976\u097b\5\u0122\u0092\2\u0977\u0978"+
		"\7\u015c\2\2\u0978\u097a\5\u0122\u0092\2\u0979\u0977\3\2\2\2\u097a\u097d"+
		"\3\2\2\2\u097b\u0979\3\2\2\2\u097b\u097c\3\2\2\2\u097c\u0121\3\2\2\2\u097d"+
		"\u097b\3\2\2\2\u097e\u0984\6\u0092\r\2\u097f\u0980\5\u012a\u0096\2\u0980"+
		"\u0982\7\u0160\2\2\u0981\u0983\7\u0164\2\2\u0982\u0981\3\2\2\2\u0982\u0983"+
		"\3\2\2\2\u0983\u0985\3\2\2\2\u0984\u097f\3\2\2\2\u0984\u0985\3\2\2\2\u0985"+
		"\u0986\3\2\2\2\u0986\u0987\5\u0102\u0082\2\u0987\u0123\3\2\2\2\u0988\u098c"+
		"\7\u016a\2\2\u0989\u098b\n\36\2\2\u098a\u0989\3\2\2\2\u098b\u098e\3\2"+
		"\2\2\u098c\u098a\3\2\2\2\u098c\u098d\3\2\2\2\u098d\u0125\3\2\2\2\u098e"+
		"\u098c\3\2\2\2\u098f\u0990\7E\2\2\u0990\u0991\5\u012c\u0097\2\u0991\u0127"+
		"\3\2\2\2\u0992\u0993\7\u0122\2\2\u0993\u0994\5\u012c\u0097\2\u0994\u0129"+
		"\3\2\2\2\u0995\u099a\7\u0171\2\2\u0996\u0997\7\6\2\2\u0997\u0999\7\u0171"+
		"\2\2\u0998\u0996\3\2\2\2\u0999\u099c\3\2\2\2\u099a\u0998\3\2\2\2\u099a"+
		"\u099b\3\2\2\2\u099b\u012b\3\2\2\2\u099c\u099a\3\2\2\2\u099d\u09a0\7\u0172"+
		"\2\2\u099e\u09a0\7\u0174\2\2\u099f\u099d\3\2\2\2\u099f\u099e\3\2\2\2\u09a0"+
		"\u012d\3\2\2\2\u09a1\u09a2\t\37\2\2\u09a2\u012f\3\2\2\2\u09a3\u09a5\t"+
		" \2\2\u09a4\u09a3\3\2\2\2\u09a4\u09a5\3\2\2\2\u09a5\u09a6\3\2\2\2\u09a6"+
		"\u09a7\7\u0176\2\2\u09a7\u0131\3\2\2\2\u09a8\u09aa\t \2\2\u09a9\u09a8"+
		"\3\2\2\2\u09a9\u09aa\3\2\2\2\u09aa\u09ab\3\2\2\2\u09ab\u09ac\7\u0177\2"+
		"\2\u09ac\u0133\3\2\2\2\u09ad\u09ae\t!\2\2\u09ae\u0135\3\2\2\2\u09af\u09b0"+
		"\7\u00c4\2\2\u09b0\u0137\3\2\2\2\u09b1\u09b2\t\"\2\2\u09b2\u0139\3\2\2"+
		"\2\u09b3\u09b4\7\u017d\2\2\u09b4\u013b\3\2\2\2\u013f\u0142\u0145\u0149"+
		"\u0155\u0158\u015f\u016a\u016c\u0175\u0178\u017a\u018f\u0199\u01a0\u01a6"+
		"\u01aa\u01b3\u01b8\u01c0\u01c5\u01ce\u01da\u01df\u01e2\u01ef\u01f3\u01fb"+
		"\u0203\u020e\u0218\u0222\u0226\u022a\u022f\u0233\u0238\u023c\u0240\u0247"+
		"\u024b\u0252\u0258\u025c\u0264\u0267\u026c\u0271\u0278\u027f\u0282\u0289"+
		"\u028f\u0294\u029a\u029f\u02a2\u02a8\u02b6\u02c0\u02c6\u02cb\u02d0\u02d5"+
		"\u02d9\u02de\u02e8\u02f4\u02fb\u02fe\u030a\u030f\u0314\u0317\u031e\u032a"+
		"\u0337\u0339\u033e\u0341\u0350\u0356\u0361\u0364\u036e\u0375\u037b\u0383"+
		"\u038d\u03a1\u03a7\u03ab\u03b0\u03b4\u03b9\u03bc\u03c1\u03c4\u03d2\u03f2"+
		"\u03f4\u03f9\u03fd\u0402\u0409\u040c\u040f\u0414\u0418\u041a\u0421\u0427"+
		"\u042e\u0434\u043e\u0448\u044b\u0450\u0454\u0457\u045e\u0464\u0467\u0471"+
		"\u047a\u0481\u0488\u048a\u0490\u0493\u049e\u04a7\u04ad\u04b2\u04b5\u04ba"+
		"\u04bd\u04c0\u04c6\u04cb\u04ce\u04d2\u04d5\u04d8\u04de\u04e8\u04f3\u04f6"+
		"\u04fd\u0502\u0507\u050b\u0513\u0517\u051c\u0520\u0522\u0526\u052e\u0536"+
		"\u0539\u053e\u0543\u054c\u0550\u055b\u055f\u0569\u056f\u0586\u0592\u0599"+
		"\u05a1\u05a8\u05ac\u05b2\u05b9\u05c4\u05cb\u05d5\u05dc\u05e5\u05ec\u05f2"+
		"\u05f5\u05ff\u0604\u0611\u061c\u0624\u0628\u062c\u0630\u0632\u0637\u063b"+
		"\u063e\u0642\u0645\u064a\u064d\u0650\u0654\u0657\u065a\u065d\u0660\u0667"+
		"\u0672\u0676\u0679\u067d\u0684\u0688\u0692\u069a\u06a1\u06a7\u06ab\u06b1"+
		"\u06ba\u06bd\u06c2\u06c5\u06cf\u06d4\u06dd\u06e2\u06e6\u06ef\u06f3\u0703"+
		"\u0710\u0715\u0719\u071e\u0725\u072d\u0732\u0737\u0742\u074b\u074f\u0758"+
		"\u075c\u0766\u076b\u0781\u0784\u0796\u07a6\u07a8\u07b3\u07c2\u07ce\u07d2"+
		"\u07dd\u07e1\u07ed\u07f1\u07f8\u07fd\u0802\u0806\u080a\u080f\u0813\u0817"+
		"\u082e\u0830\u0842\u0844\u084c\u0851\u0856\u085b\u0868\u086d\u0872\u0877"+
		"\u087c\u0881\u0886\u088b\u088d\u0894\u0897\u08a2\u08ac\u08b4\u08bd\u08c3"+
		"\u08d4\u08d7\u08e7\u08ea\u08fa\u08fd\u090d\u0910\u0920\u0923\u0933\u0936"+
		"\u0944\u0953\u0957\u0967\u096d\u0972\u097b\u0982\u0984\u098c\u099a\u099f"+
		"\u09a4\u09a9";
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