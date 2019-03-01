package com.lzh.code.structure.bridge;

public class B2 extends A_B_Bridge{

    public B2(A a) {
        super(a);
    }

    @Override
    public String getB() {
        return a.getA();
    }
}
