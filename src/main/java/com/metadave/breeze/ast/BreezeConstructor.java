package com.metadave.breeze.ast;

public class BreezeConstructor implements BreezeASTBase {
    String id;
    BreezeFields fields;

    public BreezeConstructor(String id, BreezeFields fields) {
        this.id = id;
        this.fields = fields;
    }

    @Override
    public void accept(BreezeASTVisitor visitor) {
        visitor.visit(this);
    }
}
