// Generated from ./src/main/java/com/metadave/breeze/parser/com.metadave.breeze.Breeze.g4 by ANTLR 4.0
package com.metadave.breeze.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BreezeParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LSQUARE=1, RSQUARE=2, LPAREN=3, RPAREN=4, COMMA=5, EQUALS=6, BAR=7, QUESTION=8, 
		SPLAT=9, ATTS=10, TYPEID=11, CONID=12, INT=13, WS=14;
	public static final String[] tokenNames = {
		"<INVALID>", "'['", "']'", "'('", "')'", "','", "'='", "'|'", "'?'", "'*'", 
		"'attributes'", "TYPEID", "CONID", "INT", "WS"
	};
	public static final int
		RULE_asd = 0, RULE_definition = 1, RULE_type = 2, RULE_product_type = 3, 
		RULE_sum_type = 4, RULE_constructor = 5, RULE_fields = 6, RULE_field = 7, 
		RULE_id = 8;
	public static final String[] ruleNames = {
		"asd", "definition", "type", "product_type", "sum_type", "constructor", 
		"fields", "field", "id"
	};

	@Override
	public String getGrammarFileName() { return "com.metadave.breeze.Breeze.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public BreezeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AsdContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public AsdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).enterAsd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).exitAsd(this);
		}
	}

	public final AsdContext asd() throws RecognitionException {
		AsdContext _localctx = new AsdContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_asd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18); definition();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TYPEID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(BreezeParser.EQUALS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TYPEID() { return getToken(BreezeParser.TYPEID, 0); }
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); match(TYPEID);
			setState(24); match(EQUALS);
			setState(25); type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Product_typeContext product_type() {
			return getRuleContext(Product_typeContext.class,0);
		}
		public Sum_typeContext sum_type() {
			return getRuleContext(Sum_typeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(29);
			switch (_input.LA(1)) {
			case CONID:
				enterOuterAlt(_localctx, 1);
				{
				setState(27); sum_type();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(28); product_type();
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

	public static class Product_typeContext extends ParserRuleContext {
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public Product_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).enterProduct_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).exitProduct_type(this);
		}
	}

	public final Product_typeContext product_type() throws RecognitionException {
		Product_typeContext _localctx = new Product_typeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_product_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); fields();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sum_typeContext extends ParserRuleContext {
		public ConstructorContext constructor(int i) {
			return getRuleContext(ConstructorContext.class,i);
		}
		public TerminalNode LSQUARE() { return getToken(BreezeParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(BreezeParser.RSQUARE, 0); }
		public TerminalNode BAR(int i) {
			return getToken(BreezeParser.BAR, i);
		}
		public List<TerminalNode> BAR() { return getTokens(BreezeParser.BAR); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public TerminalNode ATTS() { return getToken(BreezeParser.ATTS, 0); }
		public List<ConstructorContext> constructor() {
			return getRuleContexts(ConstructorContext.class);
		}
		public Sum_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).enterSum_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).exitSum_type(this);
		}
	}

	public final Sum_typeContext sum_type() throws RecognitionException {
		Sum_typeContext _localctx = new Sum_typeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sum_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); constructor();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(34); match(BAR);
				setState(35); constructor();
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41); match(LSQUARE);
			setState(42); match(ATTS);
			setState(44);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(43); fields();
				}
			}

			setState(46); match(RSQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode CONID() { return getToken(BreezeParser.CONID, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).exitConstructor(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(CONID);
			setState(50);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(49); fields();
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

	public static class FieldsContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public TerminalNode RPAREN() { return getToken(BreezeParser.RPAREN, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(BreezeParser.COMMA, i);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BreezeParser.COMMA); }
		public TerminalNode LPAREN() { return getToken(BreezeParser.LPAREN, 0); }
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).exitFields(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(LPAREN);
			setState(53); field();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(54); match(COMMA);
				setState(55); field();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61); match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(BreezeParser.QUESTION, 0); }
		public TerminalNode SPLAT() { return getToken(BreezeParser.SPLAT, 0); }
		public TerminalNode TYPEID() { return getToken(BreezeParser.TYPEID, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(TYPEID);
			setState(65);
			_la = _input.LA(1);
			if (_la==QUESTION || _la==SPLAT) {
				{
				setState(64);
				_la = _input.LA(1);
				if ( !(_la==QUESTION || _la==SPLAT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(67); id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode CONID() { return getToken(BreezeParser.CONID, 0); }
		public TerminalNode TYPEID() { return getToken(BreezeParser.TYPEID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BreezeListener ) ((BreezeListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==TYPEID || _la==CONID) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
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
		"\2\3\20J\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t"+
		"\t\4\n\t\n\3\2\6\2\26\n\2\r\2\16\2\27\3\3\3\3\3\3\3\3\3\4\3\4\5\4 \n\4"+
		"\3\5\3\5\3\6\3\6\3\6\7\6\'\n\6\f\6\16\6*\13\6\3\6\3\6\3\6\5\6/\n\6\3\6"+
		"\3\6\3\7\3\7\5\7\65\n\7\3\b\3\b\3\b\3\b\7\b;\n\b\f\b\16\b>\13\b\3\b\3"+
		"\b\3\t\3\t\5\tD\n\t\3\t\3\t\3\n\3\n\3\n\2\13\2\4\6\b\n\f\16\20\22\2\4"+
		"\3\n\13\3\r\16G\2\25\3\2\2\2\4\31\3\2\2\2\6\37\3\2\2\2\b!\3\2\2\2\n#\3"+
		"\2\2\2\f\62\3\2\2\2\16\66\3\2\2\2\20A\3\2\2\2\22G\3\2\2\2\24\26\5\4\3"+
		"\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2"+
		"\2\31\32\7\r\2\2\32\33\7\b\2\2\33\34\5\6\4\2\34\5\3\2\2\2\35 \5\n\6\2"+
		"\36 \5\b\5\2\37\35\3\2\2\2\37\36\3\2\2\2 \7\3\2\2\2!\"\5\16\b\2\"\t\3"+
		"\2\2\2#(\5\f\7\2$%\7\t\2\2%\'\5\f\7\2&$\3\2\2\2\'*\3\2\2\2(&\3\2\2\2("+
		")\3\2\2\2)+\3\2\2\2*(\3\2\2\2+,\7\3\2\2,.\7\f\2\2-/\5\16\b\2.-\3\2\2\2"+
		"./\3\2\2\2/\60\3\2\2\2\60\61\7\4\2\2\61\13\3\2\2\2\62\64\7\16\2\2\63\65"+
		"\5\16\b\2\64\63\3\2\2\2\64\65\3\2\2\2\65\r\3\2\2\2\66\67\7\5\2\2\67<\5"+
		"\20\t\289\7\7\2\29;\5\20\t\2:8\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2="+
		"?\3\2\2\2><\3\2\2\2?@\7\6\2\2@\17\3\2\2\2AC\7\r\2\2BD\t\2\2\2CB\3\2\2"+
		"\2CD\3\2\2\2DE\3\2\2\2EF\5\22\n\2F\21\3\2\2\2GH\t\3\2\2H\23\3\2\2\2\t"+
		"\27\37(.\64<C";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}