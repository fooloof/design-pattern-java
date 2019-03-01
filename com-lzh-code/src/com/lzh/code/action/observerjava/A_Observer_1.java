package com.lzh.code.action.observerjava;

public class A_Observer_1 extends A_Observer{

    @Override
    public void update(A a, String args) {
        System.out.println(a + " A_Observer_1");
        System.out.println(args + " A_Observer_1");
    }
}
