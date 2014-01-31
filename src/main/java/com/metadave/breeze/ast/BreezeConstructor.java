package com.metadave.breeze.ast;

public class BreezeConstructor implements BreezeASTBase {
    String id;
    BreezeFields fields;

    public BreezeConstructor(String id, BreezeFields fields) {
        this.id = id;
        this.fields = fields;
    }

    @Override
    public void accept(BreezeASTVisitor visitor)  throws Exception{
        if(fields != null) {
            fields.accept(visitor);
        }
        visitor.visit(this);
    }

    public String getId() {
        return id;
    }

    public BreezeFields getFields() {
        return fields;
    }
}
