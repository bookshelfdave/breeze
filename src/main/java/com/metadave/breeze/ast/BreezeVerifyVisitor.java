package com.metadave.breeze.ast;


import java.util.*;

public class BreezeVerifyVisitor implements BreezeASTVisitor {
    private Set<String> ctors = new HashSet<String>();
    private Set<String> defs  = new HashSet<String>();
    private Set<String> referencedDefs = new HashSet<String>();

    /*

    section 2.1
     */

    static String[] keyword_strings = {
            "abstract",
            "assert",
            "boolean",
            "break",
            "byte",
            "case",
            "catch",
            "char",
            "class",
            "const",
            "continue",
            "default",
            "do",
            "double",
            "else",
            "enum",
            "extends",
            "final",
            "finally",
            "float",
            "for",
            "if",
            "goto",
            "implements",
            "import",
            "instanceof",
            "int",
            "interface",
            "long",
            "native",
            "new",
            "package",
            "private",
            "protected",
            "public",
            "return",
            "short",
            "static",
            "strictfp",
            "super",
            "switch",
            "synchronized",
            "this",
            "throw",
            "throws",
            "transient",
            "try",
            "void",
            "volatile",
            "while"
    };

    static Set<String> keywords = new HashSet<String>(Arrays.asList(keyword_strings));

    @Override
    public void visit(BreezeASD asd) {

    }

    @Override
    public void visit(BreezeConstructor ctor)  throws Exception{
        if(!ctors.contains(ctor.getId())) {
            ctors.add(ctor.getId());
        } else {
            throw new Exception("Duplicate constructor found:" + ctor.getId());
        }
    }

    @Override
    public void visit(BreezeDefinition def)  throws Exception{
        if(!defs.contains(def.getTypeId())) {
            defs.add(def.getTypeId());
        } else {
            throw new Exception("Duplicate definition found:" + def.getTypeId());
        }
        //checkKeyword(def.getTypeId());
        identifyList(def);
        identifyEnum(def);
    }

    private void identifyEnum(BreezeDefinition def) {
        if(def.getT() instanceof BreezeSumType) {
            BreezeSumType st = (BreezeSumType)def.getT();
            int fieldCount = 0;
            if(st.getCtors().size() > 0) {
                for(BreezeConstructor ctor : st.getCtors()) {
                    if(ctor.getFields() != null) {
                        fieldCount += ctor.getFields().getFields().size();
                    } // otherwise, 0
                }
                if(fieldCount == 0) {
                    def.setEnumeration(true);
                }
            }
        }
    }

    private void identifyList(BreezeDefinition def) {
        if(def.getT() instanceof BreezeSumType) {
            BreezeSumType st = (BreezeSumType)def.getT();
            if(st.getCtors().size() == 1) {
                BreezeConstructor ctor = st.getCtors().get(0);
                if(ctor.getFields().getFields().size() == 2) {
                        String ctorTypeId = ctor.getFields().getFields().get(1).getTypeid();
                    if(ctorTypeId.equals(def.getTypeId())) {
                        System.out.println("Found a list constructor: " + ctorTypeId);
                        def.setCollection(true);
                    }
                }
            }
        }
    }

    @Override
    public void visit(BreezeField field)  throws Exception{
        //checkKeyword(field.getTypeid());
        //checkKeyword(field.getId());
    }

    @Override
    public void visit(BreezeFields fields)  throws Exception{

    }

    @Override
    public void visit(BreezeProductType pt)  throws Exception{

    }

    @Override
    public void visit(BreezeSumType st)  throws Exception{

    }

    private void checkKeyword(String def) throws Exception {
        if(keywords.contains(def)) {
            throw new Exception("Definition id is already a keyword:" + def);
        }

    }
}
