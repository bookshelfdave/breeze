package com.metadave.breeze.ast;

public interface BreezeASTVisitor {
    void visit(BreezeASD asd);
    void visit(BreezeConstructor ctor);
    void visit(BreezeDefinition def);
    void visit(BreezeField field);
    void visit(BreezeFields fields);
    void visit(BreezeProductType pt);
    void visit(BreezeSumType st);
    void visit(BreezeType t);
}
