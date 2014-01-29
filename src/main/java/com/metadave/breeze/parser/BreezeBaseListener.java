// Generated from ./src/main/java/com/metadave/breeze/parser/com.metadave.breeze.Breeze.g4 by ANTLR 4.0
package com.metadave.breeze.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class BreezeBaseListener implements BreezeListener {
	@Override public void enterId(BreezeParser.IdContext ctx) { }
	@Override public void exitId(BreezeParser.IdContext ctx) { }

	@Override public void enterField(BreezeParser.FieldContext ctx) { }
	@Override public void exitField(BreezeParser.FieldContext ctx) { }

	@Override public void enterDefinition(BreezeParser.DefinitionContext ctx) { }
	@Override public void exitDefinition(BreezeParser.DefinitionContext ctx) { }

	@Override public void enterAsd(BreezeParser.AsdContext ctx) { }
	@Override public void exitAsd(BreezeParser.AsdContext ctx) { }

	@Override public void enterProduct_type(BreezeParser.Product_typeContext ctx) { }
	@Override public void exitProduct_type(BreezeParser.Product_typeContext ctx) { }

	@Override public void enterSum_type(BreezeParser.Sum_typeContext ctx) { }
	@Override public void exitSum_type(BreezeParser.Sum_typeContext ctx) { }

	@Override public void enterType(BreezeParser.TypeContext ctx) { }
	@Override public void exitType(BreezeParser.TypeContext ctx) { }

	@Override public void enterFields(BreezeParser.FieldsContext ctx) { }
	@Override public void exitFields(BreezeParser.FieldsContext ctx) { }

	@Override public void enterConstructor(BreezeParser.ConstructorContext ctx) { }
	@Override public void exitConstructor(BreezeParser.ConstructorContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}