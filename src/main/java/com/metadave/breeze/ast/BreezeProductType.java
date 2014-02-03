package com.metadave.breeze.ast;

public class BreezeProductType implements BreezeASTBase {
    BreezeFields fields;

    public BreezeProductType(BreezeFields fields) {
        this.fields = fields;
    }

    @Override
    public void accept(BreezeASTVisitor visitor)  throws Exception {
        fields.accept(visitor);
        visitor.visit(this);
    }

    public BreezeFields getFields() {
        return fields;
    }
}
