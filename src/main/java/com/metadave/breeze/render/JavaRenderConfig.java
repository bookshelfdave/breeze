package com.metadave.breeze.render;

public class JavaRenderConfig {

    private String breezePackage = null;
    private String breezeClassname = null;
    private String breezeBody = null;
    private String breezeBase = null;
    private String breezeClassPrefix = null;

    public String getBreezeClassPrefix() {
        return breezeClassPrefix;
    }

    public void setBreezeClassPrefix(String breezeClassPrefix) {
        this.breezeClassPrefix = breezeClassPrefix;
    }

    public String getBreezePackage() {
        return breezePackage;
    }

    public void setBreezePackage(String breezePackage) {
        this.breezePackage = breezePackage;
    }

    public String getBreezeClassname() {
        return breezeClassname;
    }

    public void setBreezeClassname(String breezeClassname) {
        this.breezeClassname = breezeClassname;
    }

    public String getBreezeBody() {
        return breezeBody;
    }

    public void setBreezeBody(String breezeBody) {
        this.breezeBody = breezeBody;
    }

    public String getBreezeBase() {
        return breezeBase;
    }

    public void setBreezeBase(String breezeBase) {
        this.breezeBase = breezeBase;
    }
}
