
// HPL/SQL Procedural SQL Extension Grammar
grammar PLHQLStatements;
import PLHQLStatementLexer;
@header{
import java.util.*;
import org.antlr.v4.runtime.misc.Pair;
import utils.listeners.*;
}

program locals[ArrayList<String> functions = new ArrayList()]: entry_point c_function* EOF;

block : ((begin_end_block | stmt|error_stmt) T_GO?)+ ;               // Multiple consecutive blocks/statements

error_stmt:
    error_subselect
    |error_missing_right_p
    |error_missing_end
    |error_string
    |error_missing_bool_expr
    |error_if_stmt
    |error_create_stmt
    |error_for_range_stmt
    |error_delcare_stmt
    |error_invalid_token
    ;


begin_end_block :
       declare_block? T_BEGIN block block_end
     ;

error_missing_end:
    declare_block? T_BEGIN block {notifyErrorListeners("Expected 'END' at the end of the block");}
    ;


single_block_stmt :                                      // Single BEGIN END block (but nested blocks are possible) or single statement
       T_BEGIN block  block_end
     | stmt T_SEMICOLON?
     ;

block_end :
       {!_input.LT(2).getText().equalsIgnoreCase("TRANSACTION")}? T_END
     ;


proc_block :
       begin_end_block
     | stmt+ T_GO?
     ;

c_stmt:
    assignment_c_stmt T_SEMICOLON
    |break_stmt T_SEMICOLON
    |if_c_stmt
    |for_c_stmt
    |c_function
    |return_stmt T_SEMICOLON
    |c_block
    |general_delcaration_c_stmt
    |call_stmt T_SEMICOLON
;

c_block:
    T_OPEN_B stmt* T_CLOSE_B
;

stmt :
       assignment_stmt
     | break_stmt
     | call_stmt
     | create_database_stmt
     | create_index_stmt
     | create_local_temp_table_stmt
     | create_table_stmt
     | declare_stmt
     | exec_stmt
     | for_range_stmt
     | if_stmt
     | c_stmt
     | return_stmt
     | null_stmt
     | expr
    | semicolon_stmt      // Placed here to allow null statements ;;...
     ;

semicolon_stmt:
    T_SEMICOLON
    |'@'
    |'#'
    |'/'

;

null_stmt :             // NULL statement (no operation)
       T_NULL
     ;

assignment_stmt :       // Assignment statement
      assignment_stmt_item (T_COMMA assignment_stmt_item)*
     ;

assignment_c_stmt :       // Assignment statement
      assignment_c_stmt_item (T_COMMA assignment_c_stmt_item)*
     ;

assignment_stmt_item :
       assignment_stmt_single_item
     | assignment_stmt_multiple_item
     | assignment_stmt_select_item
     ;

assignment_c_stmt_item :
     assignment_c_stmt_single_item
     | assignment_c_stmt_multiple_item
     ;

assignment_stmt_single_item :
       ident T_COLON? T_EQUAL expr {$c_function::unassignedVariables.remove($ident.text);}
     | T_OPEN_P ident T_CLOSE_P T_COLON? T_EQUAL expr {$c_function::unassignedVariables.remove($ident.text);}
     ;

assignment_c_stmt_single_item :
      ident assignment_operator expr {$c_function::unassignedVariables.remove($ident.text);}
      | increment_decrement_assignment
      ;

increment_decrement_assignment :
      ident (T_PLUS_PLUS | T_MINUS_MINUS)
      | (T_PLUS_PLUS | T_MINUS_MINUS) ident
     ;

assignment_stmt_multiple_item :
       T_OPEN_P ident {$c_function::unassignedVariables.remove($ident.text);} (T_COMMA ident {$c_function::unassignedVariables.remove($ident.text);} )* T_CLOSE_P T_COLON? assignment_operator T_OPEN_P expr (T_COMMA expr)* T_CLOSE_P
     ;

assignment_c_stmt_multiple_item :
        T_OPEN_P ident {$c_function::unassignedVariables.remove($ident.text);} (T_COMMA ident {$c_function::unassignedVariables.remove($ident.text);})* T_CLOSE_P T_EQUAL T_OPEN_P expr (T_COMMA expr)* T_CLOSE_P
      ;

assignment_stmt_select_item :
       (ident | (T_OPEN_P ident (T_COMMA ident)* T_CLOSE_P)) T_COLON? T_EQUAL T_OPEN_P select_stmt T_CLOSE_P
     ;
break_stmt :
       T_BREAK
     ;

call_stmt :
        ident (T_OPEN_P expr_func_params? T_CLOSE_P )
     ;

declare_stmt :          // Declaration statement
       T_DECLARE declare_stmt_item (T_COMMA declare_stmt_item)*
     ;

error_delcare_stmt:
    declare_stmt_item (T_COMMA declare_stmt_item)* {notifyErrorListeners("Expected 'DECLARE' keyword");}
    ;

declare_block :         // Declaration block
       T_DECLARE declare_stmt_item T_SEMICOLON (declare_stmt_item T_SEMICOLON)*
     ;

declare_block_inplace :
       declare_stmt_item T_SEMICOLON (declare_stmt_item T_SEMICOLON)*
     ;

declare_stmt_item :
      declare_var_item
     ;

declare_var_item :
       ident (T_COMMA ident)* T_AS? dtype dtype_len? dtype_attr* dtype_default?
     | ident T_CONSTANT T_AS? dtype dtype_len? dtype_default
     ;


create_table_stmt :
       T_CREATE T_TABLE (T_IF T_NOT T_EXISTS)? table_name create_table_preoptions create_table_definition
     ;

error_create_stmt:
    error_create_table_stmt
    |error_create_index_stmt
    |error_create_procedure_stmt
;

error_create_table_stmt :
       T_CREATE (T_IF T_NOT T_EXISTS)? table_name create_table_preoptions? create_table_definition {notifyErrorListeners("Expected 'TABLE' keyword");}
     ;
create_local_temp_table_stmt :
       T_CREATE (T_LOCAL T_TEMPORARY | (T_SET | T_MULTISET)? T_VOLATILE) T_TABLE ident create_table_preoptions? create_table_definition
     ;

create_table_definition :
      (T_AS? T_OPEN_P select_stmt T_CLOSE_P | T_AS? select_stmt | T_OPEN_P create_table_columns T_CLOSE_P) create_table_options?
     ;

create_table_columns :
       create_table_columns_item (T_COMMA create_table_columns_item)*
     ;

create_table_columns_item :
       dtype dtype_len? dtype_attr* column_name create_table_column_inline_cons*
     | (T_CONSTRAINT ident)? create_table_column_cons
     ;

column_name :
       ident
     ;

create_table_column_inline_cons :
       dtype_default
     | T_NOT? T_NULL
     | T_PRIMARY T_KEY
     | T_UNIQUE
     | T_REFERENCES table_name T_OPEN_P ident T_CLOSE_P create_table_fk_action*
     | T_IDENTITY T_OPEN_P L_INT (T_COMMA L_INT)* T_CLOSE_P
     | T_AUTO_INCREMENT
     | T_ENABLE
     ;

create_table_column_cons :
       T_PRIMARY T_KEY T_CLUSTERED? T_OPEN_P ident (T_ASC | T_DESC)? (T_COMMA ident (T_ASC | T_DESC)?)* T_CLOSE_P T_ENABLE?
     | T_FOREIGN T_KEY T_OPEN_P ident (T_COMMA ident)* T_CLOSE_P T_REFERENCES table_name T_OPEN_P ident (T_COMMA ident)* T_CLOSE_P create_table_fk_action*
    ;

create_table_fk_action :
       T_ON (T_UPDATE | T_DELETE) (T_NO T_ACTION | T_RESTRICT | T_SET T_NULL | T_SET T_DEFAULT | T_CASCADE)
     ;

create_table_preoptions :
       create_table_options_hive_item T_LOCATION string
     ;


create_table_preoptions_td_item :
       T_NO? (T_LOG | T_FALLBACK)
     ;

create_table_options :
       create_table_options_item+
     ;

create_table_options_item :
       T_ON T_COMMIT (T_DELETE | T_PRESERVE) T_ROWS
     | create_table_options_ora_item
     | create_table_options_db2_item
     | create_table_options_td_item
     | create_table_options_hive_item
     | create_table_options_mssql_item
     | create_table_options_mysql_item
     ;

create_table_options_ora_item :
       T_SEGMENT T_CREATION (T_IMMEDIATE | T_DEFERRED)
     | (T_PCTFREE | T_PCTUSED | T_INITRANS | T_MAXTRANS) L_INT
     | T_NOCOMPRESS
     | (T_LOGGING | T_NOLOGGING)
     | T_STORAGE T_OPEN_P (ident | L_INT)+ T_CLOSE_P
     | T_TABLESPACE ident
     ;

create_table_options_db2_item :
       T_INDEX? T_IN ident
     | T_WITH T_REPLACE
     | T_DISTRIBUTE T_BY T_HASH T_OPEN_P ident (T_COMMA ident)* T_CLOSE_P
     | T_NOT? T_LOGGED
     | T_COMPRESS (T_YES | T_NO)
     | T_DEFINITION T_ONLY
     | T_WITH T_RESTRICT T_ON T_DROP
     ;

create_table_options_td_item :
       T_UNIQUE? T_PRIMARY T_INDEX T_OPEN_P ident (T_COMMA ident)* T_CLOSE_P
     | T_WITH T_DATA
     ;

create_table_options_hive_item :
       create_table_hive_row_format
     | T_STORED T_AS ident
     ;

create_table_hive_row_format :
       T_ROW T_FORMAT T_DELIMITED  T_FIELDS T_TERMINATED T_BY string
       ;


create_table_options_mssql_item :
       T_ON ident
     | T_TEXTIMAGE_ON ident
     ;

create_table_options_mysql_item :
       T_AUTO_INCREMENT T_EQUAL? expr
     | T_COMMENT T_EQUAL? expr
     | T_DEFAULT? (T_CHARACTER T_SET | T_CHARSET) T_EQUAL? expr
     | T_ENGINE T_EQUAL? expr
     ;

dtype :                  // Data types
       T_CHAR
     | T_BIGINT
     | T_BINARY_DOUBLE
     | T_BINARY_FLOAT
     | T_BINARY_INTEGER
     | T_BIT
     | T_DATE
     | T_DATETIME
     | T_DEC
     | T_DECIMAL
     | T_DOUBLE T_PRECISION?
     | T_FLOAT
     | T_INT
     | T_INT2
     | T_INT4
     | T_INT8
     | T_INTEGER
     | T_NCHAR
     | T_NVARCHAR
     | T_NUMBER
     | T_NUMERIC
     | T_PLS_INTEGER
     | T_REAL
     | T_RESULT_SET_LOCATOR T_VARYING
     | T_SIMPLE_FLOAT
     | T_SIMPLE_DOUBLE
     | T_SIMPLE_INTEGER
     | T_SMALLINT
     | T_SMALLDATETIME
     | T_STRING
     | T_SYS_REFCURSOR
     | T_TIMESTAMP
     | T_TINYINT
     | T_VARCHAR
     | T_VOID
     | T_VARCHAR2
     | T_XML
     | ident ( ('%') (T_TYPE | T_ROWTYPE))?             // User-defined or derived data type
     ;

dtype_len :             // Data type length or size specification
       T_OPEN_P (L_INT | T_MAX) (T_CHAR | T_BYTE)? (T_COMMA L_INT)? T_CLOSE_P
     ;

dtype_attr :
       T_NOT? T_NULL
     | T_CHARACTER T_SET ident
     | T_NOT? (T_CASESPECIFIC | T_CS)
     ;

dtype_default :
       T_COLON? T_EQUAL expr
     | T_WITH? T_DEFAULT expr?
     ;

create_database_stmt :
      T_CREATE (T_DATABASE | T_SCHEMA) (T_IF T_NOT T_EXISTS)? expr create_database_option*
    ;

create_database_option :
      T_COMMENT expr
    | T_LOCATION expr
    ;

entry_point:

    c_function {

    if(!$c_function.ctx.ident.getText().equalsIgnoreCase("main")){
        SyntaxSemanticErrorListener.INSTANCE.semanticError($c_function.ctx.start.getLine(), "Entery point function must be main");
    }

    }

;
c_function locals[ArrayList<Pair<String, String>> functionVariables = new ArrayList<>(), ArrayList<String> unassignedVariables = new ArrayList<>(), ArrayList<String> returnStatements = new ArrayList<>()]:
   dtype ident T_OPEN_P c_function_parameter_list? T_CLOSE_P  c_block {$program::functions.add($ident.text);}
   ;
 c_function_parameter_list:
    c_function_parameter_item (T_COMMA c_function_parameter_item)*
    ;
 c_function_parameter_item:
    dtype ident
    ;

error_create_procedure_stmt :
      ( T_CREATE (T_OR T_REPLACE)? | T_REPLACE)? (T_PROCEDURE | T_PROC)  create_routine_params?  (T_AS | T_IS)? declare_block_inplace?  proc_block (ident T_SEMICOLON)?
    ;

create_routine_params :
       T_OPEN_P T_CLOSE_P
     | T_OPEN_P create_routine_param_item (T_COMMA create_routine_param_item)* T_CLOSE_P
     | {!_input.LT(1).getText().equalsIgnoreCase("IS") &&
        !_input.LT(1).getText().equalsIgnoreCase("AS") &&
        !(_input.LT(1).getText().equalsIgnoreCase("DYNAMIC") && _input.LT(2).getText().equalsIgnoreCase("RESULT"))
        }?
       create_routine_param_item (T_COMMA create_routine_param_item)*
     ;

create_routine_param_item :
       (T_IN | T_OUT | T_INOUT | T_IN T_OUT)? ident dtype dtype_len? dtype_attr* dtype_default?
     | ident (T_IN | T_OUT | T_INOUT | T_IN T_OUT)? dtype dtype_len? dtype_attr* dtype_default?
     ;



exec_stmt :             // EXEC, EXECUTE IMMEDIATE statement
       (T_EXEC | T_EXECUTE) T_IMMEDIATE? expr (T_OPEN_P expr_func_params T_CLOSE_P | expr_func_params)? (T_INTO L_ID (T_COMMA L_ID)*)? 
     ;

if_stmt:
         if_plsql_stmt
         | if_tsql_stmt
         | if_bteq_stmt;

if_c_stmt:
     T_IF T_OPEN_P bool_expr T_CLOSE_P c_stmt
     ;


error_if_stmt :               // IF statement
       error_if_plsql_stmt
     | error_if_tsql_stmt
     | error_if_bteq_stmt
     ;
if_plsql_stmt :
       T_IF bool_expr T_THEN block elseif_block* else_block? T_END T_IF
     ;
error_if_plsql_stmt :
       T_IF  T_THEN block elseif_block* else_block? T_END T_IF {notifyErrorListeners("Missing if block");}
     ;
if_tsql_stmt :
       T_IF bool_expr single_block_stmt (T_ELSE single_block_stmt)?
     ;
error_if_tsql_stmt :
       T_IF  single_block_stmt (T_ELSE single_block_stmt)? {notifyErrorListeners("Expected boolean expression");}
     ;
if_bteq_stmt :
       '.' T_IF bool_expr T_THEN single_block_stmt
     ;
error_if_bteq_stmt :
       '.' T_IF  T_THEN single_block_stmt {notifyErrorListeners("Expected boolean expression");}
     ;
elseif_block :
       (T_ELSIF | T_ELSEIF) bool_expr T_THEN block
     ;

else_block :
       T_ELSE block
     ;

create_index_stmt :     // CREATE INDEX statement
       T_CREATE T_UNIQUE? T_INDEX ident T_ON table_name T_OPEN_P create_index_col (T_COMMA create_index_col)* T_CLOSE_P
     ;
error_create_index_stmt :     // CREATE INDEX statement
       T_CREATE T_UNIQUE?  T_OPEN_P create_index_col (T_COMMA create_index_col)* T_CLOSE_P {notifyErrorListeners("Expected 'INDEX' keyword");}
     ;
create_index_col :
       ident (T_ASC | T_DESC)?
     ;


return_stmt :           // RETURN statement
       T_RETURN (expr{$c_function::returnStatements.add($expr.text);}|{$c_function::returnStatements.add("void");})
     ;


for_range_stmt :        // FOR (Integer range) statement
       T_FOR L_ID T_IN T_REVERSE? expr T_DOT2 expr ((T_BY | T_STEP) expr)? T_LOOP block T_END T_LOOP
     ;
/*for_function_stmt :        // FOR (Integer range) statement
       T_FOR T_OPEN_P  expr T_EQUAL  expr T_SEMICOLON expr T_LESSEQUAL?T_LESS ?T_GREATEREQUAL?T_GREATER ? expr T_SEMICOLON expr T_ADD T_ADD  T_CLOSE_P T_OPEN_B stmt (stmt)*  T_CLOSE_B
     ;*/
for_c_stmt :
      T_FOR T_OPEN_P for_delcaration_c_stmt? T_SEMICOLON bool_expr? T_SEMICOLON assignment_c_stmt? T_CLOSE_P c_stmt
      ;

general_delcaration_c_stmt:
(dtype ident {$c_function::functionVariables.add(new Pair($dtype.text, $ident.text));}| T_VAR ident {$c_function::functionVariables.add(new Pair("VAR", $ident.text));}) (T_EQUAL expr|{$c_function::unassignedVariables.add($ident.text);}) (T_COMMA ident (T_EQUAL expr|{$c_function::unassignedVariables.add($ident.text);}))* T_SEMICOLON
;




for_delcaration_c_stmt:
dtype? ident T_EQUAL expr
;



error_for_range_stmt :        // FOR (Integer range) statement
       T_FOR L_ID T_IN T_REVERSE? expr T_DOT2 expr ((T_BY | T_STEP) expr)?  block T_END T_LOOP {notifyErrorListeners("Expected 'LOOP' keyword");}
       |T_FOR L_ID T_IN T_REVERSE? expr T_DOT2 expr ((T_BY | T_STEP) expr)? T_LOOP block {notifyErrorListeners("Expected 'END LOOP' keywords");}
       |T_FOR L_ID T_IN T_REVERSE? expr T_DOT2 expr ((T_BY | T_STEP) expr)? T_LOOP  T_END T_LOOP {notifyErrorListeners("Expected block clause");}
     ;


select_stmt locals[ArrayList<String> tempTables = new ArrayList<>()]:            // SELECT statement
       cte_select_stmt? fullselect_stmt
     ;

cte_select_stmt :
       T_WITH cte_select_stmt_item (T_COMMA cte_select_stmt_item)*
     ;

cte_select_stmt_item :
       ident cte_select_cols? T_AS T_OPEN_P fullselect_stmt T_CLOSE_P
     ;

cte_select_cols :
       T_OPEN_P ident (T_COMMA ident)* T_CLOSE_P
     ;

fullselect_stmt :
       fullselect_stmt_item (fullselect_set_clause fullselect_stmt_item)*
     ;

fullselect_stmt_item :
       subselect_stmt
     | T_OPEN_P fullselect_stmt T_CLOSE_P
     ;

fullselect_set_clause :
       T_UNION T_ALL?
     | T_EXCEPT T_ALL?
     | T_INTERSECT T_ALL?
     ;

subselect_stmt locals[
    String whereCondition = "",
    ArrayList<String> selectionColumns = new ArrayList(),
    HashMap<String, String> orderingColumnsMap = new HashMap<>(),
    boolean isDistinct = false,
    Set<Pair<String, String>> aggregateFunctionColumns = new LinkedHashSet<>(),
    HashMap<Pair<String, String>, ParserRuleContext> analyticalFunctions = new HashMap<>(),
    ArrayList<String> groupByColumns = new ArrayList<>(),
    ArrayList<String> tables = new ArrayList<>(),
    HashMap<String, Integer> tablesOffset = new HashMap<>();
    ] :
       (T_SELECT | T_SEL) select_list into_clause? from_clause where_clause? group_by_clause? (having_clause | qualify_clause)? order_by_clause?
     ;

error_subselect :
       (T_SELECT | T_SEL) select_list into_clause? where_clause? group_by_clause? (having_clause | qualify_clause)? order_by_clause?
       | error_from_clause {notifyErrorListeners("Missing 'FROM' clause");}
;


select_list :
       select_list_set? select_list_limit? select_list_item (T_COMMA select_list_item)*
     ;

select_list_set :
       T_ALL
     | T_DISTINCT {$subselect_stmt::isDistinct=true;}
     ;

select_list_limit :
       T_TOP expr
     ;

select_list_item :
       ((ident T_EQUAL {$subselect_stmt::selectionColumns.add($ident.text);})? expr select_list_alias? | select_list_asterisk){$subselect_stmt::selectionColumns.add($text);}
     ;

select_list_alias :
       {!_input.LT(1).getText().equalsIgnoreCase("INTO") && !_input.LT(1).getText().equalsIgnoreCase("FROM")}? T_AS? ident
     | T_OPEN_P T_TITLE L_S_STRING T_CLOSE_P
     ;

select_list_asterisk :
       (L_ID '.')? '*'
     ;

into_clause :
       T_INTO ident (T_COMMA ident)*
     ;

from_clause locals[
java.util.Stack<String> tables = new java.util.Stack<>(), String joinType, int tablesCount = 0
]:
       T_FROM from_table_clause (from_join_clause)*
     ;

error_from_clause:
            T_FROM (from_join_clause)*
;

from_table_clause :
       from_table_name_clause
     | from_subselect_clause
     | from_table_values_clause
     ;

from_table_name_clause :
       table_name from_alias_clause? {
       $from_clause::tables.push($table_name.text);
       $from_clause::tablesCount+=1;
       $subselect_stmt::tables.add($table_name.text);
       }
     ;

from_subselect_clause :
       T_OPEN_P select_stmt T_CLOSE_P from_alias_clause {
       $from_clause::tables.push($from_alias_clause.text);
       $from_clause::tablesCount+=1;
       $select_stmt::tempTables.add($from_alias_clause.text);
       }
     ;

from_join_clause :
      T_COMMA from_table_clause
     | from_join_type_clause from_table_clause T_ON bool_expr {
       $from_clause::tables.push($bool_expr.text);
       $from_clause::joinType=$from_join_type_clause.text;
     }
     ;

from_join_type_clause :
       T_INNER? T_JOIN
     | (T_LEFT | T_RIGHT | T_FULL) T_OUTER? T_JOIN
     ;

from_table_values_clause:
       T_TABLE T_OPEN_P T_VALUES from_table_values_row (T_COMMA from_table_values_row)* T_CLOSE_P from_alias_clause?
     ;

from_table_values_row:
       expr
     | T_OPEN_P expr (T_COMMA expr)* T_CLOSE_P
     ;

from_alias_clause :
       {!_input.LT(1).getText().equalsIgnoreCase("EXEC") &&
        !_input.LT(1).getText().equalsIgnoreCase("EXECUTE") &&
        !_input.LT(1).getText().equalsIgnoreCase("INNER") &&
        !_input.LT(1).getText().equalsIgnoreCase("LEFT") &&
        !_input.LT(1).getText().equalsIgnoreCase("GROUP") &&
        !_input.LT(1).getText().equalsIgnoreCase("ORDER") &&
        !_input.LT(1).getText().equalsIgnoreCase("LIMIT") &&
        !_input.LT(1).getText().equalsIgnoreCase("WITH")}?
       T_AS? ident (T_OPEN_P L_ID (T_COMMA L_ID)* T_CLOSE_P)?
     ;

table_name :
       ident
     ;

where_clause :
       T_WHERE bool_expr {
       $subselect_stmt::whereCondition=$bool_expr.text;
       }
     ;

error_missing_bool_expr :
       T_WHERE {notifyErrorListeners("Expected boolean expression");}
     ;

group_by_clause :
       T_GROUP T_BY group_by_expr { $subselect_stmt::groupByColumns.add($group_by_expr.text); } (T_COMMA group_by_expr { $subselect_stmt::groupByColumns.add($group_by_expr.text); })*
     ;

having_clause locals[LinkedList<Pair<String, String>> aggregateFunctionColumns = new LinkedList<>(), LinkedList<Pair<String, String>> conditions = new LinkedList<>()]:
       T_HAVING having_bool_expr
     ;

qualify_clause :
       T_QUALIFY bool_expr
     ;

order_by_clause :
       T_ORDER T_BY expr sort_type  { $subselect_stmt::orderingColumnsMap.put($expr.text,$sort_type.text); }
       (T_COMMA expr sort_type { $subselect_stmt::orderingColumnsMap.put($expr.text,$sort_type.text); })*
     ;

sort_type :
       (T_ASC | T_DESC | )
    ;


bool_expr :                               // Boolean condition
       T_NOT? T_OPEN_P bool_expr T_CLOSE_P
     | bool_expr bool_expr_logical_operator bool_expr
     | bool_expr_atom
     ;

having_bool_expr :                               // Boolean condition
        T_NOT? T_OPEN_P having_bool_expr T_CLOSE_P
      | having_bool_expr bool_expr_logical_operator having_bool_expr
      | having_expr_atom
      ;


having_expr_atom:
      having_bool_expr_binary
    | bool_literal
;
bool_expr_atom :
      bool_expr_unary
    | bool_expr_binary
    | bool_literal
    ;

bool_expr_unary :
      expr T_IS T_NOT? (T_NULL | T_FALSE | T_TRUE)
    | expr T_BETWEEN expr T_AND expr
    | T_NOT? T_EXISTS T_OPEN_P select_stmt T_CLOSE_P
    | bool_expr_single_in
    | bool_expr_multi_in
    ;

bool_expr_single_in :
      expr T_NOT? T_IN T_OPEN_P ((expr (T_COMMA expr)*) | select_stmt) T_CLOSE_P
    ;

bool_expr_multi_in :
      T_OPEN_P expr (T_COMMA expr)* T_CLOSE_P T_NOT? T_IN T_OPEN_P select_stmt T_CLOSE_P
    ;

bool_expr_binary :
       expr bool_expr_binary_operator expr
     ;
having_bool_expr_binary:
         expr bool_expr_binary_operator expr_agg_window_func {$having_clause::conditions.add(new Pair<>("AFTER", $expr.text + $bool_expr_binary_operator.text));}
       | expr_agg_window_func bool_expr_binary_operator expr {$having_clause::conditions.add(new Pair<>("BEFORE", $bool_expr_binary_operator.text + $expr.text ));}
;

bool_expr_logical_operator :
      bool_and
      | bool_or
     ;

bool_and :
     T_AND_AND
     ;

bool_or:
     T_PIPE
     ;

bool_expr_binary_operator :
        T_EQUAL2
     | T_NOTEQUAL
     | T_NOTEQUAL2
     | T_LESS
     | T_LESSEQUAL
     | T_GREATER
     | T_GREATEREQUAL
     | T_NOT? (T_LIKE | T_RLIKE | T_REGEXP)
     ;

group_by_expr:
     group_by_expr interval_item
         | select_stmt
         | group_by_expr T_MUL group_by_expr
         | group_by_expr T_DIV group_by_expr
         | group_by_expr T_ADD group_by_expr
         | group_by_expr T_SUB group_by_expr
         | T_OPEN_P select_stmt T_CLOSE_P
         | T_OPEN_P group_by_expr T_CLOSE_P
         | group_by_expr T_OPEN_SB group_by_expr T_CLOSE_SB
         | expr_interval
         | expr_concat
         | expr_case
         | expr_spec_func
         | expr_func
         | expr_atom
         ;

expr :
       expr interval_item
     | select_stmt
     | expr T_MUL expr
     | expr T_DIV expr
     | expr T_ADD expr
     | expr T_SUB expr
     | T_OPEN_P select_stmt T_CLOSE_P
     | T_OPEN_P expr T_CLOSE_P
     | expr T_OPEN_SB expr T_CLOSE_SB
     | expr_interval
     | expr_concat
     | expr_case
     | expr_agg_window_func
     | expr_spec_func
     | expr_func
     | expr_atom
     ;


expr_atom :
       date_literal
     | timestamp_literal
     | bool_literal
     | ident
     | string
     | dec_number
     | int_number
     | null_const
     ;

expr_interval :
       T_INTERVAL expr interval_item
     ;
interval_item :
       T_DAY
     | T_DAYS
     | T_MICROSECOND
     | T_MICROSECONDS
     | T_SECOND
     | T_SECONDS
     ;

expr_concat :                  // String concatenation operator
       expr_concat_item (T_CONCAT) expr_concat_item ((T_CONCAT) expr_concat_item)*
     ;

expr_concat_item :
       T_OPEN_P expr T_CLOSE_P
     | expr_case
     | expr_agg_window_func
     | expr_spec_func
     | expr_func
     | expr_atom
     ;

expr_case :                    // CASE expression
       expr_case_simple
     | expr_case_searched
     ;

expr_case_simple :
       T_CASE expr (T_WHEN expr T_THEN expr)+ (T_ELSE expr)? T_END
     ;

expr_case_searched :
       T_CASE (T_WHEN bool_expr T_THEN expr)+ (T_ELSE expr)? T_END
     ;

expr_agg_window_func :
       T_AVG T_OPEN_P expr_func_all_distinct expr T_CLOSE_P (expr_func_over_clause{
       //Analytical Function
       $subselect_stmt::analyticalFunctions.put(new Pair<>("AVG",$expr_func_all_distinct.text + ":" + $expr.text), $expr_func_over_clause.ctx);

       }|{
       //Group Function
       {

              $subselect_stmt::aggregateFunctionColumns.add(new Pair<>("AVG", $expr_func_all_distinct.text + ":" + $expr.text));

              try{

              $having_clause::aggregateFunctionColumns.add(new Pair<>("AVG", $expr_func_all_distinct.text + ":" + $expr.text));

              }catch(NullPointerException ignored){

              }

              }
       })
     | T_COUNT T_OPEN_P (((expr_func_all_distinct expr) {
     //Group Function
         $subselect_stmt::aggregateFunctionColumns.add(new Pair<>("COUNT", $expr_func_all_distinct.text + ":" + $expr.text));

         try{

         $having_clause::aggregateFunctionColumns.add(new Pair<>("COUNT", $expr_func_all_distinct.text + ":" + $expr.text));

         }catch(NullPointerException ignored){

         }

     }| '*'{

    //Group Function
     $subselect_stmt::aggregateFunctionColumns.add(new Pair<>("COUNT",  ":" + "*"));

             try{

             $having_clause::aggregateFunctionColumns.add(new Pair<>("COUNT",  ":" + "*"));

             }catch(NullPointerException ignored){

             }


     }) T_CLOSE_P
        | ((expr_func_all_distinct expr) T_CLOSE_P expr_func_over_clause{
        //Analytical Function
        $subselect_stmt::analyticalFunctions.put(new Pair<>("COUNT",$expr_func_all_distinct.text + ":" + $expr.text), $expr_func_over_clause.ctx);
         }
         | '*' T_CLOSE_P expr_func_over_clause{
        //Analytical Function
        $subselect_stmt::analyticalFunctions.put(new Pair<>("COUNT",":*"), $expr_func_over_clause.ctx);
        }))


     | T_CUME_DIST T_OPEN_P T_CLOSE_P expr_func_over_clause
     | T_DENSE_RANK T_OPEN_P T_CLOSE_P expr_func_over_clause
     | T_FIRST_VALUE T_OPEN_P expr T_CLOSE_P expr_func_over_clause
     | T_LAG T_OPEN_P expr (T_COMMA expr (T_COMMA expr)?)? T_CLOSE_P expr_func_over_clause
     | T_LAST_VALUE T_OPEN_P expr T_CLOSE_P expr_func_over_clause
     | T_LEAD T_OPEN_P expr (T_COMMA expr (T_COMMA expr)?)? T_CLOSE_P expr_func_over_clause
     | T_MAX T_OPEN_P expr_func_all_distinct expr T_CLOSE_P (expr_func_over_clause{
     //Analytical Function
     $subselect_stmt::analyticalFunctions.put(new Pair<>("MAX",$expr_func_all_distinct.text + ":" + $expr.text), $expr_func_over_clause.ctx);

     }|{
     //Group Function
     {

          $subselect_stmt::aggregateFunctionColumns.add(new Pair<>("MAX", $expr_func_all_distinct.text + ":" +$expr.text));

          try{

          $having_clause::aggregateFunctionColumns.add(new Pair<>("MAX", $expr_func_all_distinct.text + ":" +$expr.text));

          }catch(NullPointerException ignored){

          }

          }
     })
     | T_MIN T_OPEN_P expr_func_all_distinct expr T_CLOSE_P (expr_func_over_clause{
     //Analytical Function
     $subselect_stmt::analyticalFunctions.put(new Pair<>("MIN",$expr_func_all_distinct.text + ":" + $expr.text), $expr_func_over_clause.ctx);

     }|{
     //Group Function
     {

          $subselect_stmt::aggregateFunctionColumns.add(new Pair<>("MIN", $expr_func_all_distinct.text + ":" + $expr.text));

          try{

          $having_clause::aggregateFunctionColumns.add(new Pair<>("MIN", $expr_func_all_distinct.text + ":" + $expr.text));

          }catch(NullPointerException ignored){

          }

          }
     })
     | T_RANK T_OPEN_P T_CLOSE_P expr_func_over_clause{

     $subselect_stmt::analyticalFunctions.put(new Pair<>("RANK",""), $expr_func_over_clause.ctx);

     }
     | T_ROW_NUMBER T_OPEN_P T_CLOSE_P expr_func_over_clause{

     $subselect_stmt::analyticalFunctions.put(new Pair<>("ROW_NUMBER",""), $expr_func_over_clause.ctx);

     }
     | T_STDEV T_OPEN_P expr_func_all_distinct expr T_CLOSE_P (expr_func_over_clause{
     //Analytical Function
          $subselect_stmt::analyticalFunctions.put(new Pair<>("STDEV",$expr_func_all_distinct.text + ":" + $expr.text), $expr_func_over_clause.ctx);
     }|{
     //Group Function
     {

          $subselect_stmt::aggregateFunctionColumns.add(new Pair<>("STDEV", $expr_func_all_distinct.text + ":" + $expr.text));

          try{

          $having_clause::aggregateFunctionColumns.add(new Pair<>("STDEV", $expr_func_all_distinct.text + ":" + $expr.text));

          }catch(NullPointerException ignored){

          }


          }
     })
     | T_SUM T_OPEN_P expr_func_all_distinct expr T_CLOSE_P (expr_func_over_clause{

     //Analytical Function
     {$subselect_stmt::analyticalFunctions.put(new Pair<>("SUM",$expr_func_all_distinct.text + ":" + $expr.text), $expr_func_over_clause.ctx);}
     }
     |{

     //Group Function
     {

          try{

          $having_clause::aggregateFunctionColumns.add(new Pair<>("SUM", $expr_func_all_distinct.text + ":" + $expr.text));

          }catch(NullPointerException ignored){

          }

          $subselect_stmt::aggregateFunctionColumns.add(new Pair<>("SUM", $expr_func_all_distinct.text + ":" + $expr.text));


          }

     })

     | T_VARIANCE T_OPEN_P expr_func_all_distinct expr T_CLOSE_P (expr_func_over_clause{

     //Analytical Function

          {$subselect_stmt::analyticalFunctions.put(new Pair<>("VARIANCE",$expr_func_all_distinct.text + ":" + $expr.text), $expr_func_over_clause.ctx);}


     }|{

     //Group Function
     {

          $subselect_stmt::aggregateFunctionColumns.add(new Pair<>("VARIANCE", $expr_func_all_distinct.text + ":" + $expr.text));

          try{

          $having_clause::aggregateFunctionColumns.add(new Pair<>("VARIANCE", $expr_func_all_distinct.text + ":" + $expr.text));

          }catch(NullPointerException ignored){

          }


          }

     })

     | T_SUMMARIZE T_OPEN_P expr T_CLOSE_P{

      $subselect_stmt::aggregateFunctionColumns.add(new Pair<>("SUMMARIZE", ":" + $expr.text));

     }

     ;

expr_func_all_distinct :
       T_ALL
     | T_DISTINCT
     |
     ;

expr_func_over_clause :
       T_OVER T_OPEN_P expr_func_partition_by_clause? order_by_clause? T_CLOSE_P
     ;

expr_func_partition_by_clause :
       T_PARTITION T_BY expr (T_COMMA expr)*
     ;

expr_spec_func :
       T_ACTIVITY_COUNT
     | T_CAST T_OPEN_P expr T_AS  dtype dtype_len? T_CLOSE_P
     | T_COUNT T_OPEN_P (expr | '*') T_CLOSE_P
     | T_CURRENT_DATE | T_CURRENT T_DATE
     | (T_CURRENT_TIMESTAMP | T_CURRENT T_TIMESTAMP) (T_OPEN_P expr T_CLOSE_P)?
     | T_CURRENT_USER | T_CURRENT T_USER
     | T_MAX_PART_STRING T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P
     | T_MIN_PART_STRING T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P
     | T_MAX_PART_INT T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P
     | T_MIN_PART_INT T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P
     | T_MAX_PART_DATE T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P
     | T_MIN_PART_DATE T_OPEN_P expr (T_COMMA expr (T_COMMA expr T_EQUAL expr)*)? T_CLOSE_P
     | T_PART_COUNT T_OPEN_P expr (T_COMMA expr T_EQUAL expr)* T_CLOSE_P
     | T_PART_LOC T_OPEN_P expr (T_COMMA expr T_EQUAL expr)+ (T_COMMA expr)? T_CLOSE_P
     | T_TRIM T_OPEN_P expr T_CLOSE_P
     | T_SUBSTRING T_OPEN_P expr T_FROM expr (T_FOR expr)? T_CLOSE_P
     | T_SYSDATE
     | T_USER
     ;

expr_func :
       ident T_OPEN_P expr_func_params? T_CLOSE_P
     ;

expr_func_params :
       func_param (T_COMMA func_param)*
     ;

func_param :
       {!_input.LT(1).getText().equalsIgnoreCase("INTO")}? (ident T_EQUAL T_GREATER?)? expr
     ;

error_missing_right_p:
    T_OPEN_P (~T_CLOSE_P)* {notifyErrorListeners("Missing right parentheses");}
;

date_literal :                             // DATE 'YYYY-MM-DD' literal
       T_DATE string
     ;

timestamp_literal :                       // TIMESTAMP 'YYYY-MM-DD HH:MI:SS.FFF' literal
       T_TIMESTAMP string
     ;

assignment_operator:
    T_EQUAL
    |T_MOD_EQUAL
    |T_DIVIDE_EQUAL
    |T_TIMES_EQUAL
    |T_MINUS_EQUAL
    |T_PLUS_EQUAL
;

ident :
       (L_ID)  ('.' (L_ID))*
     ;

string :                                   // String literal (single or double quoted)
       L_S_STRING                          # single_quotedString
     | L_D_STRING                          # double_quotedString
     ;

error_string:
    L_S_STRING_MISSING_RIGHT {notifyErrorListeners("Expected right quote");}
    |L_D_STRING_MISSING_RIGHT {notifyErrorListeners("Expected right quotes");}
;

int_number :                               // Integer (positive or negative)
     ('-' | '+')? L_INT
     ;

dec_number :                               // Decimal number (positive or negative)
     ('-' | '+')? L_DEC
     ;

bool_literal :                            // Boolean literal
       T_TRUE
     | T_FALSE
     ;

null_const :                              // NULL constant
       T_NULL
     ;

non_reserved_words :                      // Tokens that are not reserved words and can be used as identifiers
       T_ACTION
     | T_ACTIVITY_COUNT
     | T_ADD2
     | T_ALL
     | T_ALLOCATE
     | T_ALTER
     | T_AND
     | T_ANSI_NULLS
     | T_ANSI_PADDING
     | T_AS
     | T_ASC
     | T_ASSOCIATE
     | T_AT
     | T_AUTO_INCREMENT
     | T_AVG
     | T_BATCHSIZE
     | T_BEGIN
     | T_BETWEEN
     | T_BIGINT
     | T_BINARY_DOUBLE
     | T_BINARY_FLOAT
     | T_BIT
     | T_BODY
     | T_BREAK
     | T_BY
     | T_BYTE
     | T_CALL
     | T_CALLER
     | T_CASCADE
     | T_CASE
     | T_CASESPECIFIC
     | T_CAST
     | T_CHAR
     | T_CHARACTER
     | T_CHARSET
     | T_CLIENT
     | T_CLOSE
     | T_CLUSTERED
     | T_CMP
     | T_COLLECT
     | T_COLLECTION
     | T_COLUMN
     | T_COMMENT
     | T_COMPRESS
     | T_CONSTANT
     | T_COPY
     | T_COMMIT
     | T_CONCAT
     | T_CONDITION
     | T_CONSTRAINT
     | T_CONTINUE
     | T_COUNT
     | T_COUNT_BIG
     | T_CREATE
     | T_CREATION
     | T_CREATOR
     | T_CS
     | T_CUME_DIST
     | T_CURRENT
     | T_CURRENT_DATE
     | T_CURRENT_SCHEMA
     | T_CURRENT_TIMESTAMP
     | T_CURRENT_USER
     | T_CURSOR
     | T_DATA
     | T_DATABASE
     | T_DATE
     | T_DATETIME
     | T_DAY
     | T_DAYS
     | T_DEC
     | T_DECIMAL
     | T_DECLARE
     | T_DEFAULT
     | T_DEFERRED
     | T_DEFINED
     | T_DEFINER
     | T_DEFINITION
     | T_DELETE
     | T_DELIMITED
     | T_DELIMITER
     | T_DENSE_RANK
     | T_DESC
     | T_DESCRIBE
     | T_DIAGNOSTICS
     | T_DIR
     | T_DIRECTORY
     | T_DISTINCT
     | T_DISTRIBUTE
     | T_DO
     | T_DOUBLE
     | T_DROP
     | T_DYNAMIC
     // T_ELSE reserved word
     // T_ELSEIF reserved word
     // T_ELSIF reserved word
     // T_END reserved word
     | T_ENABLE
     | T_ENGINE
     | T_ESCAPED
     | T_EXCEPT
     | T_EXEC
     | T_EXECUTE
     | T_EXCEPTION
     | T_EXCLUSIVE
     | T_EXISTS
     | T_EXIT
     | T_FALLBACK
     | T_FALSE
     | T_FETCH
     | T_FIELDS
     | T_FILE
     | T_FILES
     | T_FIRST_VALUE
     | T_FLOAT
     | T_FOR
     | T_FOREIGN
     | T_FORMAT
     | T_FOUND
     | T_FROM
     | T_FULL
     | T_FUNCTION
     | T_GET
     | T_GLOBAL
     | T_GO
     | T_GRANT
     | T_GROUP
     | T_HANDLER
     | T_HASH
     | T_HAVING
     | T_HDFS
     | T_HIVE
     | T_HOST
     | T_IDENTITY
     | T_IF
     | T_IGNORE
     | T_IMMEDIATE
     | T_IN
     | T_INCLUDE
     | T_INDEX
     | T_INITRANS
     | T_INNER
     | T_INOUT
     | T_INSERT
     | T_INT
     | T_INT2
     | T_INT4
     | T_INT8
     | T_INTEGER
     | T_INTERSECT
     | T_INTERVAL
     | T_INTO
     | T_INVOKER
     | T_ITEMS
     | T_IS
     | T_ISOPEN
     | T_JOIN
     | T_KEEP
     | T_KEY
     | T_KEYS
     | T_LAG
     | T_LANGUAGE
     | T_LAST_VALUE
     | T_LEAD
     | T_LEAVE
     | T_LEFT
     | T_LIKE
     | T_LIMIT
     | T_LINES
     | T_LOCAL
     | T_LOCATION
     | T_LOCATOR
     | T_LOCATORS
     | T_LOCKS
     | T_LOG
     | T_LOGGED
     | T_LOGGING
     | T_LOOP
     | T_MAP
     | T_MATCHED
     | T_MAX
     | T_MAXTRANS
     | T_MERGE
     | T_MESSAGE_TEXT
     | T_MICROSECOND
     | T_MICROSECONDS
     | T_MIN
     | T_MULTISET
     | T_NCHAR
     | T_NEW
     | T_NVARCHAR
     | T_NO
     | T_NOCOMPRESS
     | T_NOCOUNT
     | T_NOLOGGING
     | T_NONE
     | T_NOT
     | T_NOTFOUND
     // T_NULL reserved word
     | T_NUMERIC
     | T_NUMBER
     | T_OBJECT
     | T_OFF
     | T_ON
     | T_ONLY
     | T_OPEN
     | T_OR
     | T_ORDER
     | T_OUT
     | T_OUTER
     | T_OVER
     | T_OVERWRITE
     | T_OWNER
     | T_PACKAGE
     | T_PART_COUNT
     | T_PART_LOC
     | T_PARTITION
     | T_PCTFREE
     | T_PCTUSED
     | T_PRECISION
     | T_PRESERVE
     | T_PRIMARY
     | T_PRINT
     | T_PROC
     | T_PROCEDURE
     | T_PWD
     | T_QUALIFY
     | T_QUERY_BAND
     | T_QUIT
     | T_QUOTED_IDENTIFIER
     | T_RAISE
     | T_RANK
     | T_REAL
     | T_REFERENCES
     | T_REGEXP
     | T_RR
     | T_REPLACE
     | T_RESIGNAL
     | T_RESTRICT
     | T_RESULT
     | T_RESULT_SET_LOCATOR
     | T_RETURN
     | T_RETURNS
     | T_REVERSE
     | T_RIGHT
     | T_RLIKE
     | T_RS
     | T_ROLE
     | T_ROLLBACK
     | T_ROW
     | T_ROWS
     | T_ROW_COUNT
     | T_ROW_NUMBER
     | T_SCHEMA
     | T_SECOND
     | T_SECONDS
     | T_SECURITY
     | T_SEGMENT
     | T_SEL
     | T_SELECT
     | T_SESSION
     | T_SESSIONS
     | T_SET
     | T_SETS
     | T_SHARE
     | T_SIGNAL
     | T_SIMPLE_DOUBLE
     | T_SIMPLE_FLOAT
     | T_SMALLDATETIME
     | T_SMALLINT
     | T_SQL
     | T_SQLEXCEPTION
     | T_SQLINSERT
     | T_SQLSTATE
     | T_SQLWARNING
     | T_STATS
     | T_STATISTICS
     | T_STEP
     | T_STDEV
     | T_STORAGE
     | T_STORED
     | T_STRING
     | T_SUBDIR
     | T_SUBSTRING
     | T_SUM
     | T_SUMMARY
     | T_SYSDATE
     | T_SYS_REFCURSOR
     | T_TABLE
     | T_TABLESPACE
     | T_TEMPORARY
     | T_TERMINATED
     | T_TEXTIMAGE_ON
     | T_THEN
     | T_TIMESTAMP
     | T_TITLE
     | T_TO
     | T_TOP
     | T_TRANSACTION
     | T_TRIM
     | T_TRUE
     | T_TRUNCATE
     // T_UNION reserved word
     | T_UNIQUE
     | T_UPDATE
     | T_UR
     | T_USE
     | T_USER
     | T_USING
     | T_VALUE
     | T_VALUES
     | T_VAR
     | T_VARCHAR
     | T_VARCHAR2
     | T_VARYING
     | T_VARIANCE
     | T_VOLATILE
     // T_WHEN reserved word
     // T_WHERE reserved word
     | T_WHILE
     | T_WITH
     | T_WITHOUT
     | T_WORK
     | T_XACT_ABORT
     | T_XML
     | T_YES
     | T_SUMMARIZE
     ;

error_invalid_token:
    L_INVALID_TOKEN {notifyErrorListeners("Unexpected Token");}
    ;