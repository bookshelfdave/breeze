package com.metadave.breeze.ast;

public interface BreezeASTVisitor {
    void visit(BreezeASD asd) throws Exception;
    void visit(BreezeConstructor ctor) throws Exception;
    void visit(BreezeDefinition def) throws Exception;
    void visit(BreezeField field) throws Exception;
    void visit(BreezeFields fields) throws Exception;
    void visit(BreezeProductType pt) throws Exception;
    void visit(BreezeSumType st) throws Exception;
    void visit(BreezeType t) throws Exception;
}
