package com.lzh.code.create.abstractfactor;

public class AB_2_Factor implements AB_Factor{

    @Override
    public  A getA(){
        return  new A_2();
    }

    @Override
    public  B getB(){
        return  new B_2();
    }
}
