package com.metadave.breeze.ast;

import java.util.List;

public class BreezeSumType implements BreezeASTBase {
    List<BreezeConstructor> ctors;
    BreezeFields attributes;

    public BreezeSumType(List<BreezeConstructor> ctors, BreezeFields fields) {
        this.ctors = ctors;
        this.attributes = fields;
    }

    @Override
    public void accept(BreezeASTVisitor visitor)  throws Exception{
        for(BreezeConstructor ctor: ctors) {
            ctor.accept(visitor);
        }
        if(attributes != null) {
            attributes.accept(visitor);
        }
        visitor.visit(this);
    }

    public List<BreezeConstructor> getCtors() {
        return ctors;
    }

    public BreezeFields getAttributes() {
        return attributes;
    }
}
