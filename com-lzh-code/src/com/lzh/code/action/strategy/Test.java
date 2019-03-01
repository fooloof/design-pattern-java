package com.lzh.code.action.strategy;

public class Test {
    public static void main(String[] args) {
        A_Strategy a_strategy = new A_Strategy(new A1());
        a_strategy.getA();

    }
}
