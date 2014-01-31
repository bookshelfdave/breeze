package com.metadave.breeze.ast;

import java.util.List;

public class BreezeFields implements BreezeASTBase {
    List<BreezeField> fields;

    public BreezeFields(List<BreezeField> fields) {
        this.fields = fields;
    }

    @Override
    public void accept(BreezeASTVisitor visitor) throws Exception {
        for(BreezeField f: fields) {
            f.accept(visitor);
        }
        visitor.visit(this);
    }

    public List<BreezeField> getFields() {
        return fields;
    }
}
