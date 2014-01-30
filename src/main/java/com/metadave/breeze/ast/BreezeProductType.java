package com.metadave.breeze.ast;

public class BreezeProductType extends BreezeType implements BreezeASTBase  {
    BreezeFields fields;

    public BreezeProductType(BreezeFields fields) {
        this.fields = fields;
    }

    @Override
    public void accept(BreezeASTVisitor visitor) {
        visitor.visit(this);
    }
}
