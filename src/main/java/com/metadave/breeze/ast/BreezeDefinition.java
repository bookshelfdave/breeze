package com.metadave.breeze.ast;

public class BreezeDefinition implements BreezeASTBase {
    String typeId;
    BreezeType t;

    public BreezeDefinition(String typeId, BreezeType t) {
        this.typeId = typeId;
        this.t = t;
    }

    @Override
    public void accept(BreezeASTVisitor visitor) {
        t.accept(visitor);
        visitor.visit(this);
    }
}
