package com.lzh.code.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class A {
    private String a;
    private List<A_B> a_bs;

    public A() {
        this.a = null;
        this.a_bs = new ArrayList<>();
    }

    public void add(A_B a_b){
        a_bs.add(a_b);
    }

    public void remove(A_B a_b){
        a_bs.remove(a_b);
    }
}
