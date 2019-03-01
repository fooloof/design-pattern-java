package com.lzh.code.action.chainofresponsibility;

public class Test {
    public static void main(String[] args) {
        A a = new A_1();
        A a1 = new A_2();
        A a2 = new A_3();
        a1.setNext(a);
        a.setNext(a2);
        a1.getA();
    }
}
