package com.lzh.code.action.observerjava;


public class A_Observer_2 extends A_Observer {
    @Override
    void update(A a, String args) {
        System.out.println(a + " A_Observer_2");
        System.out.println(args + " A_Observer_2");
    }
}
