package com.lzh.code.structure.decorator;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        A a = new A1();
        a = new Decorator_A1(a);
        a = new Decorator_A2(a);
        System.out.println(a.getA_1());
    }
}
