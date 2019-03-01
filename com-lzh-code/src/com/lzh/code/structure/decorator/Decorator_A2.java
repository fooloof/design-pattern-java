package com.lzh.code.structure.decorator;

public class Decorator_A2 extends Decorator_A {
    private A a;

    public Decorator_A2(A a) {
        this.a = a;
    }

    @Override
    String getA_1() {
        return a.getA_1()+"Decorator_A2 getA_1: ";
    }

    @Override
    String getA_2() {
        return a.getA_1()+"Decorator_A2 getA_2: ";
    }
}
