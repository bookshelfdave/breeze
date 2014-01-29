// Generated from ./src/main/java/com/metadave/breeze/parser/com.metadave.breeze.Breeze.g4 by ANTLR 4.0
package com.metadave.breeze.parser;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface BreezeListener extends ParseTreeListener {
	void enterId(BreezeParser.IdContext ctx);
	void exitId(BreezeParser.IdContext ctx);

	void enterField(BreezeParser.FieldContext ctx);
	void exitField(BreezeParser.FieldContext ctx);

	void enterDefinition(BreezeParser.DefinitionContext ctx);
	void exitDefinition(BreezeParser.DefinitionContext ctx);

	void enterAsd(BreezeParser.AsdContext ctx);
	void exitAsd(BreezeParser.AsdContext ctx);

	void enterProduct_type(BreezeParser.Product_typeContext ctx);
	void exitProduct_type(BreezeParser.Product_typeContext ctx);

	void enterSum_type(BreezeParser.Sum_typeContext ctx);
	void exitSum_type(BreezeParser.Sum_typeContext ctx);

	void enterType(BreezeParser.TypeContext ctx);
	void exitType(BreezeParser.TypeContext ctx);

	void enterFields(BreezeParser.FieldsContext ctx);
	void exitFields(BreezeParser.FieldsContext ctx);

	void enterConstructor(BreezeParser.ConstructorContext ctx);
	void exitConstructor(BreezeParser.ConstructorContext ctx);
}