package com.lzh.code.structure.bridge;

public class Test {

    public static void main(String[] args) {
        A_B_Bridge a =   new B1(new A1());
        System.out.println(a.getB());

        A_B_Bridge a1 =   new B2(new A2());
        System.out.println(a1.getB());
    }
}
