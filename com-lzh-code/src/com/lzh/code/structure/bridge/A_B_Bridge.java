package com.lzh.code.structure.bridge;

public abstract class A_B_Bridge {
    public A a;

    public A_B_Bridge(A a){
        this.a = a;
    }
    public abstract String getB();
}
