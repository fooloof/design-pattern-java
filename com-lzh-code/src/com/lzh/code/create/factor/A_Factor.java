package com.lzh.code.create.factor;

public class A_Factor implements Factor{

    @Override
    public  A getA(String name){
        if("a_1".equals(name)){
           return  new A_1();
        }else if("a_2".equals(name)){
            return new A_2();
        }else {
            return null;
        }
    }
}
