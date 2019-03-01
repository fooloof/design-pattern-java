package com.lzh.code.structure.adapter_object;

public class A_adapter implements A {


    @Override
    public String getA() {
        return new B().getB();
    }

    @Override
    public String getA1() {
        return "A1";
    }
}
