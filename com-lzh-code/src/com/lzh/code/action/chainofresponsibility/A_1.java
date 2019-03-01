package com.lzh.code.action.chainofresponsibility;

public class A_1 extends A {

    @Override
    public void getA() {
        System.out.println("A_1");
        super.getA();
    }
}
