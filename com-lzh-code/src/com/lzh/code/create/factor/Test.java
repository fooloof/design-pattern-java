package com.lzh.code.create.factor;

public class Test {
    public static void main(String[] args) {
        A a_1 = new A_Factor().getA("a_1");
        A a1_1 = new A1_Factor().getA("a1_1");
        System.out.println(a_1);
        System.out.println(a1_1);
    }
}
