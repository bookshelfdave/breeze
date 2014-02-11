package com.metadave.breeze.backends;


import com.metadave.breeze.BreezeTypeMap;

import java.math.BigInteger;

public class JavaTypeMap implements BreezeTypeMap {
    @Override
    public String typeForBoolean() {
        return java.lang.Boolean.class.getName();
    }

    @Override
    public String typeForFloat() {
        return java.lang.Float.class.getName();
    }

    @Override
    public String typeForDouble() {
        return java.lang.Double.class.getName();
    }

    @Override
    public String typeForInt8() {
        return java.lang.Byte.class.getName();
    }

    @Override
    public String typeForInt16() {
        return java.lang.Short.class.getName();
    }

    @Override
    public String typeForInt32() {
        return java.lang.Integer.class.getName();
    }

    @Override
    public String typeForInt64() {
        return java.lang.Long.class.getName();
    }

    @Override
    public String typeForUInt8() {
        // bumped up to the next largest type
        return java.lang.Short.class.getName();
    }

    @Override
    public String typeForUInt16() {
        return java.lang.Integer.class.getName();
    }

    @Override
    public String typeForUInt32() {
        return java.lang.Long.class.getName();
    }

    @Override
    public String typeForUInt64() {
        return BigInteger.class.getName();
    }

    @Override
    public String typeForString() {
        return java.lang.String.class.getName();
    }

    @Override
    public String typeForChar() {
        return java.lang.Character.class.getName();
    }
}
