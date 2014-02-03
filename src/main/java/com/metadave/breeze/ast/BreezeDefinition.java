package com.metadave.breeze.ast;

public class BreezeDefinition implements BreezeASTBase {
    String typeId;
    BreezeASTBase t;

    public BreezeDefinition(String typeId, BreezeASTBase t) {
        this.typeId = typeId;
        this.t = t;
    }

    @Override
    public void accept(BreezeASTVisitor visitor)  throws Exception{
        t.accept(visitor);
        visitor.visit(this);
    }

    public String getTypeId() {
        return typeId;
    }

    public BreezeASTBase getT() {
        return t;
    }
}
