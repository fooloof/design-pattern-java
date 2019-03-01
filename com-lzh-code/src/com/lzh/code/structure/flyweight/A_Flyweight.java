package com.lzh.code.structure.flyweight;

public class A_Flyweight {
    private A a_1 = new A_1();
    private A a_2 = new A_2();

    public String getA_Flyweight(String name) {
        if("a_1".equals(name)){
           return a_1.getA();
        }else if("a_2".equals(name)){
            return a_2.getA();
        }else{
            return "";
        }
    }
}
