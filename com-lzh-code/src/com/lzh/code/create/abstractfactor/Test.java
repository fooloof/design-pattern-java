package com.lzh.code.create.abstractfactor;

public class Test {
    public static void main(String[] args) {
        AB_Factor ab_factor1 = new AB_1_Factor();
        A a1 = ab_factor1.getA();
        B b1 = ab_factor1.getB();
        System.out.println(a1);
        System.out.println(b1);

        AB_Factor ab_factor2 = new AB_2_Factor();
        A a2 = ab_factor2.getA();
        B b2 = ab_factor2.getB();
        System.out.println(a2);
        System.out.println(b2);


    }
}
