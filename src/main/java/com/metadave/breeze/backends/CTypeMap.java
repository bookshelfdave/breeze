package com.metadave.breeze.backends;

import com.metadave.breeze.BreezeTypeMap;

public class CTypeMap implements BreezeTypeMap {
    @Override
    public String typeForBoolean() {
        return "int";
    }

    @Override
    public String typeForFloat() {
        return "float";
    }

    @Override
    public String typeForDouble() {
        return "double";
    }

    @Override
    public String typeForInt8() {
        return "signed char";
    }

    @Override
    public String typeForInt16() {
        return "int";
    }

    @Override
    public String typeForInt32() {
        return "long";
    }

    @Override
    public String typeForInt64() {
        return "long long";
    }

    @Override
    public String typeForUInt8() {
        return "char";
    }

    @Override
    public String typeForUInt16() {
        return "unsigned int";
    }

    @Override
    public String typeForUInt32() {
        return "unsigned long";
    }

    @Override
    public String typeForUInt64() {
        return "unsigned long long";
    }

    @Override
    public String typeForString() {
        return "char*";
    }

    @Override
    public String typeForChar() {
        return "char";
    }
}
