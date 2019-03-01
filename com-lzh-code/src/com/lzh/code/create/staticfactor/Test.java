package com.lzh.code.create.staticfactor;

public class Test {
    public static void main(String[] args) {
        A v_1 = A_Factor.getA("a_1");
        A v_2 = A_Factor.getA("a_2");
        System.out.println(v_1);
        System.out.println(v_2);
    }
}
