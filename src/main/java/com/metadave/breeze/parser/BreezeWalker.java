package com.metadave.breeze.parser;

import com.metadave.breeze.ast.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.stringtemplate.v4.ST;

import java.util.ArrayList;
import java.util.List;

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
        if(ctx.CONID() != null) {
            this.setValue(ctx, ctx.CONID().getText());
        } else if(ctx.TYPEID() != null) {
            this.setValue(ctx, ctx.TYPEID().getText());
        }
    }

    @Override
    public void exitField(BreezeParser.FieldContext ctx) {
        BreezeField.FieldQualifier fq = BreezeField.FieldQualifier.NONE;
        if(ctx.QUESTION() != null) {
            fq = BreezeField.FieldQualifier.OPTIONAL;
        } else if(ctx.SPLAT() != null) {
            fq = BreezeField.FieldQualifier.SEQUENCE;
        }

        String id = "_";
        if(ctx.id() != null) {
            id = (String)getValue(ctx.id());
        }
        BreezeField f = new BreezeField(ctx.TYPEID().getText(),
                                        id,
                                        fq);
        System.out.println(f);
        setValue(ctx, f);
    }

    @Override
    public void exitDefinition(BreezeParser.DefinitionContext ctx) {
        String typeId = ctx.TYPEID().getText();
        BreezeType t = (BreezeType)getValue(ctx.type());
        BreezeDefinition bd = new BreezeDefinition(typeId, t);
        setValue(ctx, bd);
    }

    @Override
    public void exitAsd(BreezeParser.AsdContext ctx) {
        List<BreezeDefinition> defs = new ArrayList<BreezeDefinition>();
        for(BreezeParser.DefinitionContext dc : ctx.definition()) {
            BreezeDefinition bd = (BreezeDefinition)getValue(dc);
            defs.add(bd);
        }
        BreezeASD asd = new BreezeASD(defs);
        setValue(ctx, asd);
    }

    @Override
    public void exitProduct_type(BreezeParser.Product_typeContext ctx) {
        BreezeFields atts = (BreezeFields)getValue(ctx.fields());
        BreezeProductType pt = new BreezeProductType(atts);
        setValue(ctx, pt);
    }

    @Override
    public void exitSum_type(BreezeParser.Sum_typeContext ctx) {
        List<BreezeConstructor> ctors = new ArrayList<BreezeConstructor>();
        for(BreezeParser.ConstructorContext c : ctx.ctor) {
            BreezeConstructor ctor = (BreezeConstructor)getValue(c);
            ctors.add(ctor);
        }
        BreezeFields atts = (BreezeFields)getValue(ctx.atts());
        BreezeSumType st = new BreezeSumType(ctors, atts);
        setValue(ctx, st);
    }

    @Override
    public void exitType(BreezeParser.TypeContext ctx) {
        if(ctx.sum_type() != null) {
            setValue(ctx, getValue(ctx.sum_type()));
        } else if(ctx.product_type() != null) {
            setValue(ctx, getValue(ctx.product_type()));
        }
    }

    @Override
    public void exitFields(BreezeParser.FieldsContext ctx) {
        List<BreezeField> fields = new ArrayList<BreezeField>();
        for(BreezeParser.FieldContext f : ctx.fs) {
            fields.add((BreezeField)getValue(f));
        }
        setValue(ctx, new BreezeFields(fields));
    }

    @Override
    public void exitConstructor(BreezeParser.ConstructorContext ctx) {
        String id = ctx.CONID().getText();
        BreezeFields fields = (BreezeFields)getValue(ctx.fields());
        BreezeConstructor ctor = new BreezeConstructor(id, fields);
        setValue(ctx, ctor);
    }

}
