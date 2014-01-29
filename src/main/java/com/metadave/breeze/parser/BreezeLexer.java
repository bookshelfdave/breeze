// Generated from ./src/main/java/com/metadave/breeze/parser/Breeze.g4 by ANTLR 4.0
package com.metadave.breeze.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BreezeLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LSQUARE=1, RSQUARE=2, LPAREN=3, RPAREN=4, COMMA=5, EQUALS=6, BAR=7, QUESTION=8, 
		SPLAT=9, ATTS=10, TYPEID=11, CONID=12, INT=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'['", "']'", "'('", "')'", "','", "'='", "'|'", "'?'", "'*'", "'attributes'", 
		"TYPEID", "CONID", "INT", "WS"
	};
	public static final String[] ruleNames = {
		"LSQUARE", "RSQUARE", "LPAREN", "RPAREN", "COMMA", "EQUALS", "BAR", "QUESTION", 
		"SPLAT", "ATTS", "TYPEID", "CONID", "INT", "DIGIT", "WS"
	};


	public BreezeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Breeze.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 14: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\2\4\20]\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\7\f"+
		"A\n\f\f\f\16\fD\13\f\3\r\3\r\7\rH\n\r\f\r\16\rK\13\r\3\16\5\16N\n\16\3"+
		"\16\6\16Q\n\16\r\16\16\16R\3\17\3\17\3\20\6\20X\n\20\r\20\16\20Y\3\20"+
		"\3\20\2\21\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1"+
		"\25\f\1\27\r\1\31\16\1\33\17\1\35\2\1\37\20\2\3\2\7\3c|\6\62;C\\aac|\3"+
		"C\\\6\62;C\\aac|\5\13\f\17\17\"\"`\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2"+
		"\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2"+
		"\17-\3\2\2\2\21/\3\2\2\2\23\61\3\2\2\2\25\63\3\2\2\2\27>\3\2\2\2\31E\3"+
		"\2\2\2\33M\3\2\2\2\35T\3\2\2\2\37W\3\2\2\2!\"\7]\2\2\"\4\3\2\2\2#$\7_"+
		"\2\2$\6\3\2\2\2%&\7*\2\2&\b\3\2\2\2\'(\7+\2\2(\n\3\2\2\2)*\7.\2\2*\f\3"+
		"\2\2\2+,\7?\2\2,\16\3\2\2\2-.\7~\2\2.\20\3\2\2\2/\60\7A\2\2\60\22\3\2"+
		"\2\2\61\62\7,\2\2\62\24\3\2\2\2\63\64\7c\2\2\64\65\7v\2\2\65\66\7v\2\2"+
		"\66\67\7t\2\2\678\7k\2\289\7d\2\29:\7w\2\2:;\7v\2\2;<\7g\2\2<=\7u\2\2"+
		"=\26\3\2\2\2>B\t\2\2\2?A\t\3\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2"+
		"\2C\30\3\2\2\2DB\3\2\2\2EI\t\4\2\2FH\t\5\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2"+
		"\2\2IJ\3\2\2\2J\32\3\2\2\2KI\3\2\2\2LN\7/\2\2ML\3\2\2\2MN\3\2\2\2NP\3"+
		"\2\2\2OQ\5\35\17\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\34\3\2\2\2"+
		"TU\4\62;\2U\36\3\2\2\2VX\t\6\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2"+
		"\2Z[\3\2\2\2[\\\b\20\2\2\\ \3\2\2\2\b\2BIMRY";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}