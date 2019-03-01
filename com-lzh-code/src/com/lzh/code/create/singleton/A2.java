package com.lzh.code.create.singleton;

/*
*嵌套类模式
* */
public class A2 {

    private A2() {};

    private static class A3 {
        private static A2 a = new A2();
    }

    public static A2 getA() {
        return A3.a;
    }
}