package com.lzh.code.action.observerjava;

import java.util.ArrayList;
import java.util.List;


public class A {
    public static String name = "A";
    private List<A_Observer> a_observers = new ArrayList<>();

    public void addObserver(A_Observer a_observer){
        a_observers.add(a_observer);
    }

    public void remove(A_Observer a_observer){
        a_observers.add(a_observer);
    }

    public void notifyAllObservers(){
        a_observers.forEach(a_observer -> {
            a_observer.update(this,name);});
    }


}
