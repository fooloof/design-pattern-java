package com.lzh.code.create.singleton;

/*
*饿汉模式
* */
public class A {

    private A(){};

    private static A a = new A();

    public static  A getA(){
        return a;
    }
}
