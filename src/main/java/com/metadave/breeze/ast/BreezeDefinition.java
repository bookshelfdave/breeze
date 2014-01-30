package com.metadave.breeze.ast;

public class BreezeDefinition implements BreezeASTBase {
    BreezeType t;
    public BreezeDefinition(BreezeType t) {
        this.t = t;
    }

    @Override
    public void accept(BreezeASTVisitor visitor) {
        t.accept(visitor);
        visitor.visit(this);
    }
}
