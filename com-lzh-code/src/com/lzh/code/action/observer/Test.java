package com.lzh.code.action.observer;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        new A_Observer_1(a);
        new A_Observer_2(a);
        a.setState("Test");
    }
}
