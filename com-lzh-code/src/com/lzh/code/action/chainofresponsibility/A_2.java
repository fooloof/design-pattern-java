package com.lzh.code.action.chainofresponsibility;

public class A_2 extends A {

    @Override
    public void getA() {
        System.out.println("A_2");
        super.getA();
    }
}
