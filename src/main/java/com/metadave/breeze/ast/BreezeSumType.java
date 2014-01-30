package com.metadave.breeze.ast;

import java.util.ArrayList;
import java.util.List;

public class BreezeSumType extends BreezeType implements BreezeASTBase {
    List<BreezeConstructor> ctors;
    BreezeFields attributes;

    public BreezeSumType(List<BreezeConstructor> ctors, BreezeFields fields) {
        this.ctors = ctors;
        this.attributes = fields;
    }

    @Override
    public void accept(BreezeASTVisitor visitor) {
        for(BreezeConstructor ctor: ctors) {
            ctor.accept(visitor);
        }
        attributes.accept(visitor);
        visitor.visit(this);
    }
}
