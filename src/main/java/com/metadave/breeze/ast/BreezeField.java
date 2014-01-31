package com.metadave.breeze.ast;

public class BreezeField implements BreezeASTBase {

    public enum FieldQualifier {
        NONE,
        SEQUENCE,
        OPTIONAL
    }

    String typeid; // no AST node for ID
    String id;
    FieldQualifier q;

    public BreezeField(String typeid, String id, FieldQualifier q) {
        this.typeid = typeid;
        this.id = id;
        this.q = q;
    }

    @Override
    public void accept(BreezeASTVisitor visitor)  throws Exception{
        visitor.visit(this);
    }


    public String getTypeid() {
        return typeid;
    }

    public String getId() {
        return id;
    }

    public FieldQualifier getQ() {
        return q;
    }

    @Override
    public String toString() {
        return "<" + id + ":" + typeid + " (" + q + ")>";
    }
}
