package com.lzh.code.action.status;

public class A_State_1 implements A_State {
    @Override
    public void getA(A a) {
        System.out.println("A_State_1");
        a.setA_state(this);
    }
}
