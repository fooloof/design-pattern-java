package com.lzh.code.create.staticfactor;

public class A_Factor {

    public static A getA(String name){
        if("a_1".equals(name)){
           return  new A_1();
        }else if("a_2".equals(name)){
            return new A_2();
        }else {
            return null;
        }
    }
}
