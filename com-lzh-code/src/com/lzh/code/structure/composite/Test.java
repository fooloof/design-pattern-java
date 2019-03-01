package com.lzh.code.structure.composite;


public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.add(new A_B());
        a.remove(new A_B());
    }
}
