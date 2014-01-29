package com.metadave.breeze.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.stringtemplate.v4.ST;

public class BreezeWalker extends BreezeBaseListener {
    ParseTreeProperty<Object> values = new ParseTreeProperty<Object>();

    public void setValue(ParseTree node, Object value) {
        values.put(node, value);
    }

    public Object getValue(ParseTree node) {
        return values.get(node);
    }

    @Override
    public void exitId(BreezeParser.IdContext ctx) {
    }

    @Override
    public void exitField(BreezeParser.FieldContext ctx) {
    }

    @Override
    public void exitDefinition(BreezeParser.DefinitionContext ctx) {
    }

    @Override
    public void exitAsd(BreezeParser.AsdContext ctx) {
    }

    @Override
    public void exitProduct_type(BreezeParser.Product_typeContext ctx) {
    }

    @Override
    public void exitSum_type(BreezeParser.Sum_typeContext ctx) {
    }

    @Override
    public void exitType(BreezeParser.TypeContext ctx) {
    }

    @Override
    public void exitFields(BreezeParser.FieldsContext ctx) {
    }

    @Override
    public void exitConstructor(BreezeParser.ConstructorContext ctx) {
    }

}
