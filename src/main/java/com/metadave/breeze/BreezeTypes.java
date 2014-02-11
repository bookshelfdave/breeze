package com.metadave.breeze;


import java.util.HashMap;
import java.util.Map;

public class BreezeTypes {
    private Map<String, BreezeTypeMap> typeMap = new HashMap<String, BreezeTypeMap>();

    public BreezeTypeMap getTypeMapForTargetLanguage(String targetLang) {
        return typeMap.get(targetLang);
    }
}
