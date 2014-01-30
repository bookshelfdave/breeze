package com.metadave.breeze.ast;

public class BreezeType implements BreezeASTBase {
    @Override
    public void accept(BreezeASTVisitor visitor) {
        visitor.visit(this);
    }
}
