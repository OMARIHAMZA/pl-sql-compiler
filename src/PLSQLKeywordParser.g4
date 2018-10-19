parser grammar PLSQLKeywordParser;

statement: (error|keyword)* EOF;
keyword: KEYWORD;
error: UNEXPECTED_CHAR+;