package com.lzh.code.action.observerjava;



public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.addObserver(new A_Observer_1());
        a.addObserver(new A_Observer_2());
        a.notifyAllObservers();
    }
}
