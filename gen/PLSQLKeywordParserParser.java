// Generated from E:/Github/pl-sql-compiler/src\PLSQLKeywordParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PLSQLKeywordParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORD=1, SQL_KEYWORD=2, PL_KEYWORD=3, K_JOIN=4, K_ACCESS=5, K_ADD=6, 
		K_ALL=7, K_ALTER=8, K_AND=9, K_ANY=10, K_AS=11, K_ASC=12, K_AUDIT=13, 
		K_BETWEEN=14, K_BY=15, K_CHAR=16, K_CHECK=17, K_CLUSTER=18, K_COLUMN=19, 
		K_COLUMN_VALUE=20, K_COMMENT=21, K_COMPRESS=22, K_CONNECT=23, K_CREATE=24, 
		K_CURRENT=25, K_DATE=26, K_DECIMAL=27, K_DEFAULT=28, K_DELETE=29, K_DESC=30, 
		K_DISTINCT=31, K_DROP=32, K_ELSE=33, K_EXCLUSIVE=34, K_EXISTS=35, K_FILE=36, 
		K_FLOAT=37, K_FOR=38, K_FROM=39, K_GRANT=40, K_GROUP=41, K_HAVING=42, 
		K_IDENTIFIED=43, K_IMMEDIATE=44, K_IN=45, K_INCREMENT=46, K_INDEX=47, 
		K_INITIAL=48, K_INSERT=49, K_INTEGER=50, K_INTERSECT=51, K_INTO=52, K_IS=53, 
		K_LEVEL=54, K_LIKE=55, K_LOCK=56, K_LONG=57, K_MAXEXTENTS=58, K_MINUS=59, 
		K_MLSLABEL=60, K_MODE=61, K_MODIFY=62, K_NESTED_TABLE_ID=63, K_NOAUDIT=64, 
		K_NOCOMPRESS=65, K_NOT=66, K_NOWAIT=67, K_NULL=68, K_NUMBER=69, K_OF=70, 
		K_OFFLINE=71, K_ON=72, K_ONLINE=73, K_OPTION=74, K_OR=75, K_ORDER=76, 
		K_PCTFREE=77, K_PRIOR=78, K_PUBLIC=79, K_RAW=80, K_RENAME=81, K_RESOURCE=82, 
		K_REVOKE=83, K_ROW=84, K_ROWID=85, K_ROWNUM=86, K_ROWS=87, K_SELECT=88, 
		K_SESSION=89, K_SET=90, K_SHARE=91, K_SIZE=92, K_SMALLINT=93, K_START=94, 
		K_SUCCESSFUL=95, K_SYNONYM=96, K_SYSDATE=97, K_TABLE=98, K_THEN=99, K_TO=100, 
		K_TRIGGER=101, K_UID=102, K_UNION=103, K_UNIQUE=104, K_UPDATE=105, K_USER=106, 
		K_VALIDATE=107, K_VALUES=108, K_VARCHAR=109, K_VARCHAR2=110, K_VIEW=111, 
		K_WHENEVER=112, K_WHERE=113, K_WITH=114, PL_KEYWORDS_A=115, PL_KEYWORDS_B=116, 
		PL_KEYWORDS_C=117, PL_KEYWORDS_D=118, PL_KEYWORDS_E=119, PL_KEYWORDS_F=120, 
		PL_KEYWORDS_G=121, PL_KEYWORDS_H=122, PL_KEYWORDS_I=123, PL_KEYWORDS_L=124, 
		PL_KEYWORDS_M=125, PL_KEYWORDS_N=126, PL_KEYWORDS_O=127, PL_KEYWORDS_P=128, 
		PL_KEYWORDS_R=129, PL_KEYWORDS_S=130, PL_KEYWORDS_T=131, PL_KEYWORDS_U=132, 
		PL_KEYWORDS_V=133, PL_KEYWORDS_W=134, PL_KEYWORDS_Y=135, PL_KEYWORDS_Z=136, 
		PL_KEYWORDS_J=137, K_AT=138, K_A=139, K_ACCESSIBILE=140, K_AGENT=141, 
		K_AGGREGATE=142, K_ARRAY=143, K_ATTRIBUTE=144, K_AUTHID=145, K_AVG=146, 
		K_BEGIN=147, K_BFILE_BASE=148, K_BINARY=149, K_BLOB_BASE=150, K_BLOCK=151, 
		K_BODY=152, K_BOTH=153, K_BOUND=154, K_BULK=155, K_BYTE=156, K_CASE=157, 
		K_CLUSTERS=158, K_COLAUTH=159, K_COLUMNS=160, K_CRASH=161, K_CURSOR=162, 
		K_C=163, K_CALL=164, K_CALLING=165, K_CASCADE=166, K_CHAR_BASE=167, K_CHARACTER=168, 
		K_CHARSET=169, K_CHARSETFORM=170, K_CHARSETID=171, K_CLOB_BASE=172, K_CLONE=173, 
		K_CLOSE=174, K_COLLECT=175, K_COMMIT=176, K_COMMITTED=177, K_COMPILED=178, 
		K_CONSTANT=179, K_CONSTRUCTOR=180, K_CONTEXT=181, K_CONTINUE=182, K_CONVERT=183, 
		K_COUNT=184, K_CREDENTIAL=185, K_CUSTOMDATUM=186, K_DECLARE=187, K_DANGLING=188, 
		K_DATA=189, K_DATE_BASE=190, K_DAY=191, K_DEFINE=192, K_DETERMINISTIC=193, 
		K_DIRECTORY=194, K_DOUBLE=195, K_DURATION=196, K_END=197, K_EXCEPTION=198, 
		K_ELEMENT=199, K_ELSIF=200, K_EMPTY=201, K_ESCAPE=202, K_EXCEPT=203, K_EXCEPTIONS=204, 
		K_EXECUTE=205, K_EXIT=206, K_EXTERNAL=207, K_FETCH=208, K_FUNCTION=209, 
		K_FINAL=210, K_FIRST=211, K_FIXED=212, K_FORALL=213, K_FORCE=214, K_GOTO=215, 
		K_GENERAL=216, K_HASH=217, K_HEAP=218, K_HIDDEN=219, K_HOUR=220, K_INCLUDING=221, 
		K_INDICATOR=222, K_INDICES=223, K_INFINITE=224, K_INSTANTIABLE=225, K_INT=226, 
		K_INTERFACE=227, K_INTERVAL=228, K_INVALIDATE=229, K_ISOLATION=230, K_IF=231, 
		K_INDEXES=232, K_JAVA=233, K_LANGUAGE=234, K_LARGE=235, K_LEADING=236, 
		K_LENGTH=237, K_LIBRARY=238, K_LIKE2=239, K_LIKE4=240, K_LIKEC=241, K_LIMIT=242, 
		K_LIMITED=243, K_LOCAL=244, K_LOOP=245, K_MAP=246, K_MAX=247, K_MAXLEN=248, 
		K_MEMBER=249, K_MERGE=250, K_MIN=251, K_MINUTE=252, K_MOD=253, K_MONTH=254, 
		K_MULTISET=255, K_NAME=256, K_NAN=257, K_NATIONAL=258, K_NATIVE=259, K_NCHAR=260, 
		K_NEW=261, K_NOCOPY=262, K_NUMBER_BASE=263, K_OVERLAPS=264, K_OBJECT=265, 
		K_OCICOLL=266, K_OCIDATE=267, K_OCIDATETIME=268, K_OCIDURATION=269, K_OCIINTERVAL=270, 
		K_OCILOBLOCATOR=271, K_OCINUMBER=272, K_OCIRAW=273, K_OCIREF=274, K_OCIREFCURSOR=275, 
		K_OCIROWID=276, K_OCISTRING=277, K_OCITYPE=278, K_OLD=279, K_ONLY=280, 
		K_OPAQUE=281, K_OPEN=282, K_OPERATOR=283, K_ORACLE=284, K_ORADATA=285, 
		K_ORGANIZATION=286, K_ORLANY=287, K_ORLVARY=288, K_OTHERS=289, K_OUT=290, 
		K_OVERRIDING=291, K_PROCEDURE=292, K_PACKAGE=293, K_PARALLEL_ENABLE=294, 
		K_PARAMETER=295, K_PARAMETERS=296, K_PARENT=297, K_PARTITION=298, K_PASCAL=299, 
		K_PERSISTABLE=300, K_PIPE=301, K_PIPELINED=302, K_PLUGGABLE=303, K_POLYMORPHIC=304, 
		K_PRAGMA=305, K_PRECISION=306, K_PRIVATE=307, K_RAISE=308, K_RANGE=309, 
		K_READ=310, K_RECORD=311, K_REF=312, K_REFERENCE=313, K_RELIES_ON=314, 
		K_REM=315, K_REMAINDER=316, K_RESULT=317, K_RESULT_CACHE=318, K_RETURN=319, 
		K_RETURNING=320, K_REVERSE=321, K_ROLLBACK=322, K_SQL=323, K_SUBTYPE=324, 
		K_SAMPLE=325, K_SAVE=326, K_SAVEPOINT=327, K_SB1=328, K_SB2=329, K_SB4=330, 
		K_SECOND=331, K_SEGMENT=332, K_SELF=333, K_SEPARATE=334, K_SEQUENCE=335, 
		K_SERIALIZABLE=336, K_SHORT=337, K_SIZE_T=338, K_SOME=339, K_SPARSE=340, 
		K_SQLCODE=341, K_SQLDATA=342, K_SQLNAME=343, K_SQLSTATE=344, K_STANDARD=345, 
		K_STATIC=346, K_STDDEV=347, K_STORED=348, K_STRING=349, K_STRUCT=350, 
		K_STYLE=351, K_SUBMULTISET=352, K_SUBPARTITION=353, K_SUBSTITUTABLE=354, 
		K_SUM=355, K_TDO=356, K_THE=357, K_TIME=358, K_TIMESTAMP=359, K_TIMEZONE_ABBR=360, 
		K_TIMEZONE_HOUR=361, K_TIMEZONE_MINUTE=362, K_TIMEZONE_REGION=363, K_TRAILING=364, 
		K_TRANSACTION=365, K_TRANSACTIONAL=366, K_TRUSTED=367, K_TABAUTH=368, 
		K_TYPE=369, K_UB1=370, K_UB2=371, K_UB4=372, K_UNDER=373, K_UNPLUG=374, 
		K_UNSIGNED=375, K_UNTRUSTED=376, K_USE=377, K_USING=378, K_VIEWS=379, 
		K_VALIST=380, K_VALUE=381, K_VARIABLE=382, K_VARIANCE=383, K_VARRAY=384, 
		K_VARYING=385, K_VOID=386, K_WHEN=387, K_WHILE=388, K_WORK=389, K_WRAPPED=390, 
		K_WRITE=391, K_YEAR=392, K_ZONE=393, WHITESPACE=394, UNEXPECTED_CHAR=395;
	public static final int
		RULE_statement = 0, RULE_keyword = 1, RULE_error = 2;
	public static final String[] ruleNames = {
		"statement", "keyword", "error"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KEYWORD", "SQL_KEYWORD", "PL_KEYWORD", "K_JOIN", "K_ACCESS", "K_ADD", 
		"K_ALL", "K_ALTER", "K_AND", "K_ANY", "K_AS", "K_ASC", "K_AUDIT", "K_BETWEEN", 
		"K_BY", "K_CHAR", "K_CHECK", "K_CLUSTER", "K_COLUMN", "K_COLUMN_VALUE", 
		"K_COMMENT", "K_COMPRESS", "K_CONNECT", "K_CREATE", "K_CURRENT", "K_DATE", 
		"K_DECIMAL", "K_DEFAULT", "K_DELETE", "K_DESC", "K_DISTINCT", "K_DROP", 
		"K_ELSE", "K_EXCLUSIVE", "K_EXISTS", "K_FILE", "K_FLOAT", "K_FOR", "K_FROM", 
		"K_GRANT", "K_GROUP", "K_HAVING", "K_IDENTIFIED", "K_IMMEDIATE", "K_IN", 
		"K_INCREMENT", "K_INDEX", "K_INITIAL", "K_INSERT", "K_INTEGER", "K_INTERSECT", 
		"K_INTO", "K_IS", "K_LEVEL", "K_LIKE", "K_LOCK", "K_LONG", "K_MAXEXTENTS", 
		"K_MINUS", "K_MLSLABEL", "K_MODE", "K_MODIFY", "K_NESTED_TABLE_ID", "K_NOAUDIT", 
		"K_NOCOMPRESS", "K_NOT", "K_NOWAIT", "K_NULL", "K_NUMBER", "K_OF", "K_OFFLINE", 
		"K_ON", "K_ONLINE", "K_OPTION", "K_OR", "K_ORDER", "K_PCTFREE", "K_PRIOR", 
		"K_PUBLIC", "K_RAW", "K_RENAME", "K_RESOURCE", "K_REVOKE", "K_ROW", "K_ROWID", 
		"K_ROWNUM", "K_ROWS", "K_SELECT", "K_SESSION", "K_SET", "K_SHARE", "K_SIZE", 
		"K_SMALLINT", "K_START", "K_SUCCESSFUL", "K_SYNONYM", "K_SYSDATE", "K_TABLE", 
		"K_THEN", "K_TO", "K_TRIGGER", "K_UID", "K_UNION", "K_UNIQUE", "K_UPDATE", 
		"K_USER", "K_VALIDATE", "K_VALUES", "K_VARCHAR", "K_VARCHAR2", "K_VIEW", 
		"K_WHENEVER", "K_WHERE", "K_WITH", "PL_KEYWORDS_A", "PL_KEYWORDS_B", "PL_KEYWORDS_C", 
		"PL_KEYWORDS_D", "PL_KEYWORDS_E", "PL_KEYWORDS_F", "PL_KEYWORDS_G", "PL_KEYWORDS_H", 
		"PL_KEYWORDS_I", "PL_KEYWORDS_L", "PL_KEYWORDS_M", "PL_KEYWORDS_N", "PL_KEYWORDS_O", 
		"PL_KEYWORDS_P", "PL_KEYWORDS_R", "PL_KEYWORDS_S", "PL_KEYWORDS_T", "PL_KEYWORDS_U", 
		"PL_KEYWORDS_V", "PL_KEYWORDS_W", "PL_KEYWORDS_Y", "PL_KEYWORDS_Z", "PL_KEYWORDS_J", 
		"K_AT", "K_A", "K_ACCESSIBILE", "K_AGENT", "K_AGGREGATE", "K_ARRAY", "K_ATTRIBUTE", 
		"K_AUTHID", "K_AVG", "K_BEGIN", "K_BFILE_BASE", "K_BINARY", "K_BLOB_BASE", 
		"K_BLOCK", "K_BODY", "K_BOTH", "K_BOUND", "K_BULK", "K_BYTE", "K_CASE", 
		"K_CLUSTERS", "K_COLAUTH", "K_COLUMNS", "K_CRASH", "K_CURSOR", "K_C", 
		"K_CALL", "K_CALLING", "K_CASCADE", "K_CHAR_BASE", "K_CHARACTER", "K_CHARSET", 
		"K_CHARSETFORM", "K_CHARSETID", "K_CLOB_BASE", "K_CLONE", "K_CLOSE", "K_COLLECT", 
		"K_COMMIT", "K_COMMITTED", "K_COMPILED", "K_CONSTANT", "K_CONSTRUCTOR", 
		"K_CONTEXT", "K_CONTINUE", "K_CONVERT", "K_COUNT", "K_CREDENTIAL", "K_CUSTOMDATUM", 
		"K_DECLARE", "K_DANGLING", "K_DATA", "K_DATE_BASE", "K_DAY", "K_DEFINE", 
		"K_DETERMINISTIC", "K_DIRECTORY", "K_DOUBLE", "K_DURATION", "K_END", "K_EXCEPTION", 
		"K_ELEMENT", "K_ELSIF", "K_EMPTY", "K_ESCAPE", "K_EXCEPT", "K_EXCEPTIONS", 
		"K_EXECUTE", "K_EXIT", "K_EXTERNAL", "K_FETCH", "K_FUNCTION", "K_FINAL", 
		"K_FIRST", "K_FIXED", "K_FORALL", "K_FORCE", "K_GOTO", "K_GENERAL", "K_HASH", 
		"K_HEAP", "K_HIDDEN", "K_HOUR", "K_INCLUDING", "K_INDICATOR", "K_INDICES", 
		"K_INFINITE", "K_INSTANTIABLE", "K_INT", "K_INTERFACE", "K_INTERVAL", 
		"K_INVALIDATE", "K_ISOLATION", "K_IF", "K_INDEXES", "K_JAVA", "K_LANGUAGE", 
		"K_LARGE", "K_LEADING", "K_LENGTH", "K_LIBRARY", "K_LIKE2", "K_LIKE4", 
		"K_LIKEC", "K_LIMIT", "K_LIMITED", "K_LOCAL", "K_LOOP", "K_MAP", "K_MAX", 
		"K_MAXLEN", "K_MEMBER", "K_MERGE", "K_MIN", "K_MINUTE", "K_MOD", "K_MONTH", 
		"K_MULTISET", "K_NAME", "K_NAN", "K_NATIONAL", "K_NATIVE", "K_NCHAR", 
		"K_NEW", "K_NOCOPY", "K_NUMBER_BASE", "K_OVERLAPS", "K_OBJECT", "K_OCICOLL", 
		"K_OCIDATE", "K_OCIDATETIME", "K_OCIDURATION", "K_OCIINTERVAL", "K_OCILOBLOCATOR", 
		"K_OCINUMBER", "K_OCIRAW", "K_OCIREF", "K_OCIREFCURSOR", "K_OCIROWID", 
		"K_OCISTRING", "K_OCITYPE", "K_OLD", "K_ONLY", "K_OPAQUE", "K_OPEN", "K_OPERATOR", 
		"K_ORACLE", "K_ORADATA", "K_ORGANIZATION", "K_ORLANY", "K_ORLVARY", "K_OTHERS", 
		"K_OUT", "K_OVERRIDING", "K_PROCEDURE", "K_PACKAGE", "K_PARALLEL_ENABLE", 
		"K_PARAMETER", "K_PARAMETERS", "K_PARENT", "K_PARTITION", "K_PASCAL", 
		"K_PERSISTABLE", "K_PIPE", "K_PIPELINED", "K_PLUGGABLE", "K_POLYMORPHIC", 
		"K_PRAGMA", "K_PRECISION", "K_PRIVATE", "K_RAISE", "K_RANGE", "K_READ", 
		"K_RECORD", "K_REF", "K_REFERENCE", "K_RELIES_ON", "K_REM", "K_REMAINDER", 
		"K_RESULT", "K_RESULT_CACHE", "K_RETURN", "K_RETURNING", "K_REVERSE", 
		"K_ROLLBACK", "K_SQL", "K_SUBTYPE", "K_SAMPLE", "K_SAVE", "K_SAVEPOINT", 
		"K_SB1", "K_SB2", "K_SB4", "K_SECOND", "K_SEGMENT", "K_SELF", "K_SEPARATE", 
		"K_SEQUENCE", "K_SERIALIZABLE", "K_SHORT", "K_SIZE_T", "K_SOME", "K_SPARSE", 
		"K_SQLCODE", "K_SQLDATA", "K_SQLNAME", "K_SQLSTATE", "K_STANDARD", "K_STATIC", 
		"K_STDDEV", "K_STORED", "K_STRING", "K_STRUCT", "K_STYLE", "K_SUBMULTISET", 
		"K_SUBPARTITION", "K_SUBSTITUTABLE", "K_SUM", "K_TDO", "K_THE", "K_TIME", 
		"K_TIMESTAMP", "K_TIMEZONE_ABBR", "K_TIMEZONE_HOUR", "K_TIMEZONE_MINUTE", 
		"K_TIMEZONE_REGION", "K_TRAILING", "K_TRANSACTION", "K_TRANSACTIONAL", 
		"K_TRUSTED", "K_TABAUTH", "K_TYPE", "K_UB1", "K_UB2", "K_UB4", "K_UNDER", 
		"K_UNPLUG", "K_UNSIGNED", "K_UNTRUSTED", "K_USE", "K_USING", "K_VIEWS", 
		"K_VALIST", "K_VALUE", "K_VARIABLE", "K_VARIANCE", "K_VARRAY", "K_VARYING", 
		"K_VOID", "K_WHEN", "K_WHILE", "K_WORK", "K_WRAPPED", "K_WRITE", "K_YEAR", 
		"K_ZONE", "WHITESPACE", "UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "PLSQLKeywordParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PLSQLKeywordParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PLSQLKeywordParserParser.EOF, 0); }
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLKeywordParserListener ) ((PLSQLKeywordParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLKeywordParserListener ) ((PLSQLKeywordParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLKeywordParserVisitor ) return ((PLSQLKeywordParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KEYWORD || _la==UNEXPECTED_CHAR) {
				{
				setState(8);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case UNEXPECTED_CHAR:
					{
					setState(6);
					error();
					}
					break;
				case KEYWORD:
					{
					setState(7);
					keyword();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(13);
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode KEYWORD() { return getToken(PLSQLKeywordParserParser.KEYWORD, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLKeywordParserListener ) ((PLSQLKeywordParserListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLKeywordParserListener ) ((PLSQLKeywordParserListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLKeywordParserVisitor ) return ((PLSQLKeywordParserVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_keyword);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(KEYWORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public List<TerminalNode> UNEXPECTED_CHAR() { return getTokens(PLSQLKeywordParserParser.UNEXPECTED_CHAR); }
		public TerminalNode UNEXPECTED_CHAR(int i) {
			return getToken(PLSQLKeywordParserParser.UNEXPECTED_CHAR, i);
		}
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLKeywordParserListener ) ((PLSQLKeywordParserListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PLSQLKeywordParserListener ) ((PLSQLKeywordParserListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PLSQLKeywordParserVisitor ) return ((PLSQLKeywordParserVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_error);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(18); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(17);
					match(UNEXPECTED_CHAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(20); 
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u018d\31\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\3\2\3\2\3\3\3\3\3"+
		"\4\6\4\25\n\4\r\4\16\4\26\3\4\2\2\5\2\4\6\2\2\2\30\2\f\3\2\2\2\4\21\3"+
		"\2\2\2\6\24\3\2\2\2\b\13\5\6\4\2\t\13\5\4\3\2\n\b\3\2\2\2\n\t\3\2\2\2"+
		"\13\16\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\17\3\2\2\2\16\f\3\2\2\2\17\20"+
		"\7\2\2\3\20\3\3\2\2\2\21\22\7\3\2\2\22\5\3\2\2\2\23\25\7\u018d\2\2\24"+
		"\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\7\3\2\2\2\5\n"+
		"\f\26";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}