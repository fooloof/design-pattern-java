package com.lzh.code.action.chainofresponsibility;

public abstract class A {
    private A next;

    public A getNext() {
        return next;
    }

    public void setNext(A next) {
        this.next = next;
    }


    public  void getA(){
        if(this.getNext() !=null){
            this.getNext().getA();
        }
    };
}
