grammar PLSQLKeywordParser;
import PLSQLKeywordLexer;
statement: (error|keyword)* EOF;
keyword: KEYWORD;
error: UNEXPECTED_CHAR+;
