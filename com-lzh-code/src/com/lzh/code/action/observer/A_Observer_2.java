package com.lzh.code.action.observer;



public class A_Observer_2 extends A_Observer {

    public A_Observer_2(A a) {
        this.a = a;
        this.a.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println(a.getState()+" A_Observer_2");
    }
}
