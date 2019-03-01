package com.lzh.code.structure.decorator;

public class Decorator_A1 extends Decorator_A {
    private A a;

    public Decorator_A1(A a) {
        this.a = a;
    }

    @Override
    String getA_1() {
        return a.getA_1()+"Decorator_A1 getA_1: ";
    }

    @Override
    String getA_2() {
        return a.getA_2()+"Decorator_A1 getA_2: ";
    }
}
