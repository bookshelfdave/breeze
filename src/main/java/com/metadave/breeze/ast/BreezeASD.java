package com.metadave.breeze.ast;


import java.util.ArrayList;
import java.util.List;

public class BreezeASD implements BreezeASTBase {
    List<BreezeDefinition> definitions = new ArrayList<BreezeDefinition>();

    public BreezeASD(List<BreezeDefinition> definitions) {
        this.definitions = definitions;
    }

    @Override
    public void accept(BreezeASTVisitor visitor) {
        for(BreezeDefinition d: definitions) {
            d.accept(visitor);
        }
        visitor.visit(this);
    }
}