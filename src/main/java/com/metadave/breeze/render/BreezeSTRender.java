package com.metadave.breeze.render;

import com.metadave.breeze.BreezeTypeMap;
import com.metadave.breeze.BreezeTypes;
import com.metadave.breeze.ast.*;
import com.metadave.breeze.backends.JavaTypeMap;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class BreezeSTRender extends DefaultBreezeASTVisitor {
    STGroup stg = null;

    public BreezeSTRender(String groupName) {
        stg = new STGroupFile(groupName);
    }


    @Override
    public void visit(BreezeDefinition def)  throws Exception{
        JavaRenderConfig cfg = new JavaRenderConfig();
        cfg.setBreezePackage("com.foo.bar");
        cfg.setBreezeClassPrefix("BZ");

        JavaTypeMap javaTypeMap = new JavaTypeMap();

        ST body = stg.getInstanceOf("breeze_body");
        body.add("RenderConfig", cfg);

        if(def.getT() instanceof BreezeSumType) {
            BreezeSumType st = (BreezeSumType)def.getT();
            if(st.getCtors() != null) {

            }

            BreezeFields atts = st.getAttributes();
            if(atts != null && atts.getFields() != null) {
                for(BreezeField f : atts.getFields()) {
//                    switch(f.getQ()) {
//                        case NONE: break;
//                        case OPTIONAL: break;
//                        case SEQUENCE: break;
//                    }

                    ST attdec = stg.getInstanceOf("breeze_attdef");
                    ST attaccess = stg.getInstanceOf("breeze_attaccess");

                    attdec.add("BreezeAttName", getNiceName(f.getId()));
                    attdec.add("BreezeAttType", javaTypeMap.getTypeForImpl(f.getTypeid()));
                    attdec.add("RenderConfig", cfg);

                    attaccess.add("BreezeAttName", getNiceName(f.getId()));
                    attaccess.add("BreezeAttType", javaTypeMap.getTypeForImpl(f.getTypeid()));
                    attaccess.add("RenderConfig", cfg);

                    body.add("BreezeAttDecls", attdec);
                    body.add("BreezeAttAccessors", attaccess);
                }
            }
        }

        ST cd = stg.getInstanceOf("breeze_classdef");
        cd.add("BreezeClassname", getNiceName(def.getTypeId()));
        cd.add("RenderConfig", cfg);
        cd.add("BreezeBody", body);
        if(def.isCollection()) {
            BreezeSumType st = (BreezeSumType)def.getT();
            BreezeConstructor ctor = st.getCtors().get(0);
            String prefix = "";
            if(cfg.getBreezeClassPrefix() != null) {
                prefix = cfg.getBreezeClassPrefix();
            }
            String ctorTypeId = prefix +  getNiceName(ctor.getFields().getFields().get(0).getTypeid());
            cd.add("BreezeCollectionType", ctorTypeId);
        }

        if(def.isEnumeration()) {
            BreezeSumType st = (BreezeSumType)def.getT();
            ST e = stg.getInstanceOf("breeze_enums");
            e.add("RenderConfig", cfg);
            //e.add("BreezeEnumName", def.getTypeId());
            for(BreezeConstructor ctor : st.getCtors()) {
                e.add("BreezeEnumValue", ctor.getId());
            }
            body.add("BreezeEnums", e);
        }
        System.out.println(cd.render());
    }

    private static String getNiceName(String id) {
        if(id == null || id.length() == 0) {
            return "";
        }
        return id.substring(0, 1).toUpperCase() + id.substring(1);
    }
}
