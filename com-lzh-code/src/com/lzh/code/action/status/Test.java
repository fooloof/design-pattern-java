package com.lzh.code.action.status;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        A_State a_state_1 = new A_State_1();
        A_State a_state_2 = new A_State_2();
        a_state_1.getA(a);
        System.out.println(a.getA_state());
    }
}
