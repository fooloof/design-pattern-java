package com.lzh.code.create.singleton;

/*
*饱汉模式
* */
public class A1 {

    private A1(){};

    private volatile static A1 a = null;

    public static A1 getA(){
        if(null == a){
            synchronized (A1.class){
                if(null == a){
                    a = new A1();
                }
            }
        }
        return a;
    }
}
