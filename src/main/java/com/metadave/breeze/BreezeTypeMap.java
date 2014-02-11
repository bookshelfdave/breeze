package com.metadave.breeze;

import java.util.Map;

public abstract class BreezeTypeMap {
    public enum BreezeType {
        BOOLEAN,
        STRING, CHAR,
        FLOAT, DOUBLE,
        INT8, INT16, INT32, INT64,
        UINT8, UINT16, UINT32, UINT64
    }
    public abstract String typeForBoolean();
    public abstract String typeForFloat();
    public abstract String typeForDouble();
    public abstract String typeForInt8();
    public abstract String typeForInt16();
    public abstract String typeForInt32();
    public abstract String typeForInt64();
    public abstract String typeForUInt8();
    public abstract String typeForUInt16();
    public abstract String typeForUInt32();
    public abstract String typeForUInt64();
    public abstract String typeForString();
    public abstract String typeForChar();

    public String getTypeForImpl(String t) {
        BreezeType bt = BreezeType.valueOf(t.toUpperCase());
        switch(bt) {
            case BOOLEAN: return typeForBoolean();
            case STRING:  return typeForString();
            case CHAR:    return typeForChar();
            case FLOAT:   return typeForFloat();
            case DOUBLE:  return typeForDouble();
            case INT8:    return typeForInt8();
            case INT16:   return typeForInt16();
            case INT32:   return typeForInt32();
            case INT64:   return typeForInt64();
            case UINT8:   return typeForUInt8();
            case UINT16:  return typeForUInt16();
            case UINT32:  return typeForUInt32();
            case UINT64:  return typeForUInt64();
        }
        return "ERROR";
    }
}
