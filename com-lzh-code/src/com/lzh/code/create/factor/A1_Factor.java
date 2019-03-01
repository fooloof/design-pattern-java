package com.lzh.code.create.factor;

public class A1_Factor implements Factor {

    @Override
    public  A getA(String name){
        if("a1_1".equals(name)){
           return  new A1_1();
        }else if("a1_2".equals(name)){
            return new A1_2();
        }else {
            return null;
        }
    }
}
