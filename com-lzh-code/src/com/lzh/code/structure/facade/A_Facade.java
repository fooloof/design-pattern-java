package com.lzh.code.structure.facade;

public class A_Facade {

    private A a1;

    private A a2;

    public A_Facade() {
        a1 = new A1();
        a2 = new A2();
    }

    public String getA1(){
        return  a1.getA();
    }

    public String getA2(){
        return  a2.getA();
    }

}
