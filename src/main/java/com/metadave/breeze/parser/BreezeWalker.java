package com.metadave.breeze.parser;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

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
        super.exitId(ctx);    
    }

    @Override
    public void exitField(BreezeParser.FieldContext ctx) {
        super.exitField(ctx);    
    }

    @Override
    public void exitDefinition(BreezeParser.DefinitionContext ctx) {
        super.exitDefinition(ctx);    
    }

    @Override
    public void exitAsd(BreezeParser.AsdContext ctx) {
        super.exitAsd(ctx);    
    }

    @Override
    public void exitProduct_type(BreezeParser.Product_typeContext ctx) {
        super.exitProduct_type(ctx);    
    }

    @Override
    public void exitSum_type(BreezeParser.Sum_typeContext ctx) {
        super.exitSum_type(ctx);    
    }

    @Override
    public void exitType(BreezeParser.TypeContext ctx) {
        super.exitType(ctx);    
    }

    @Override
    public void exitFields(BreezeParser.FieldsContext ctx) {
        super.exitFields(ctx);    
    }

    @Override
    public void exitConstructor(BreezeParser.ConstructorContext ctx) {
        super.exitConstructor(ctx);    
    }

}
