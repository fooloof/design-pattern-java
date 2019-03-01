package com.lzh.code.create.prototype;

public class Test {
    public static void main(String[] args) {
        try {
            A a = new A();
            a.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
