package com.metadave.breeze.ast;

public class BreezeAtts implements BreezeASTBase {
    @Override
    public void accept(BreezeASTVisitor visitor) {
         visitor.visit(this);
    }
}
