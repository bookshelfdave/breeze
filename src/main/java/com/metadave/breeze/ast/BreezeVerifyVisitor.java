package com.metadave.breeze.ast;


import java.util.HashSet;
import java.util.Set;

public class BreezeVerifyVisitor implements BreezeASTVisitor {
    private Set<String> ctors = new HashSet<String>();
    private Set<String> defs  = new HashSet<String>();

    @Override
    public void visit(BreezeASD asd) {

    }

    @Override
    public void visit(BreezeConstructor ctor)  throws Exception{
        if(!ctors.contains(ctor.getId())) {
            ctors.add(ctor.getId());
        } else {
            throw new Exception("Duplicate constructor found:" + ctor.getId());
        }
    }

    @Override
    public void visit(BreezeDefinition def)  throws Exception{
        if(!defs.contains(def.getTypeId())) {
            defs.add(def.getTypeId());
        } else {
            throw new Exception("Duplicate definition found:" + def.getTypeId());
        }
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
