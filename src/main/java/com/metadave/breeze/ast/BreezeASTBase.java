package com.metadave.breeze.ast;

public interface BreezeASTBase {
    void accept(BreezeASTVisitor visitor) throws Exception;
}
