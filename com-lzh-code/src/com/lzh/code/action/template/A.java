package com.lzh.code.action.template;


public abstract class A {
    public A() {
        getA();
        getA1();
        getA2();
    }

   public void getA(){
       System.out.println("A");
   }

    public abstract void getA1();

    public void getA2(){

    }
}
