package com.lzh.code.create.abstractfactor;

public class AB_1_Factor implements AB_Factor{

    @Override
    public  A getA(){
        return  new A_1();
    }

    @Override
    public  B getB(){
        return  new B_1();
    }
}
