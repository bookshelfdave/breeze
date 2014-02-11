package com.metadave.breeze.render;

import com.metadave.breeze.ast.*;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class BreezeSTRender implements BreezeASTVisitor {
    STGroup stg = null;

    public BreezeSTRender(String groupName) {
        stg = new STGroupFile(groupName);
    }

    @Override
    public void visit(BreezeASD asd)  throws Exception{

    }

    @Override
    public void visit(BreezeConstructor ctor)  throws Exception{
    }

    @Override
    public void visit(BreezeDefinition def)  throws Exception{
        JavaRenderConfig cfg = new JavaRenderConfig();
        cfg.setBreezeBase("MyBreezeBase");
        cfg.setBreezePackage("com.foo.bar");
        cfg.setBreezeBase("MyBase");
        cfg.setBreezeClassPrefix("My_");
        ST cd = stg.getInstanceOf("classdef");
        cd.add("BreezeClassname",def.getTypeId());
        cd.add("RenderConfig", cfg);
        System.out.println(cd.render());
    }

    @Override
    public void visit(BreezeField field)  throws Exception{

    }

    @Override
    public void visit(BreezeFields fields)  throws Exception{

    }

    @Override
    public void visit(BreezeProductType pt)  throws Exception{

    }

    @Override
    public void visit(BreezeSumType st)  throws Exception{

    }

}
