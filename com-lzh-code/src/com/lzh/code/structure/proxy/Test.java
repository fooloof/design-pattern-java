package com.lzh.code.structure.proxy;

public class Test {
    public static void main(String[] args) {
        A a = new A_Proxy();
        System.out.println(a.getA());
    }
}
