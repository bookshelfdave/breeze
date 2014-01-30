package com.metadave.breeze.ast;

import java.util.ArrayList;
import java.util.List;

public class BreezeFields implements BreezeASTBase {
    List<BreezeField> fields;

    public BreezeFields(List<BreezeField> fields) {
        this.fields = fields;
    }

    @Override
    public void accept(BreezeASTVisitor visitor) {
        visitor.visit(this);
    }
}
