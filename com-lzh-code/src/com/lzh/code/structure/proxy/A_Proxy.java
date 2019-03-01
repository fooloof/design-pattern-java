package com.lzh.code.structure.proxy;

public class A_Proxy implements A {
    private A a = new A_1();
    @Override
    public String getA() {
        String a = this.a.getA();

        return "AAA"+a+"BBB";
    }
}
