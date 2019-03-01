package com.lzh.code.structure.bridge;

public class B1 extends A_B_Bridge {


    public B1(A a) {
        super(a);
    }

    @Override
    public String getB() {
        return a.getA();
    }
}
