package com.lzh.code.create.builder;

public class A {
    private int a;
    private int b;

    private A(int a,int b){
        this.a = a;
        this.b = b;
    }

    public static A_Builder builder(){
        return new A_Builder();
    }


    public static class A_Builder{
        private int a;
        private int b;

        public A_Builder setA(int a){
            this.a = a;
            return this;
        }

        public A_Builder setB(int b){
            this.b = b;
            return this;
        }

        public A build(){
            //构建前逻辑
           return new A(a,b);
        }


    }

}
