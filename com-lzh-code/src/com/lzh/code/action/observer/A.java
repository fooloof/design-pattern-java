package com.lzh.code.action.observer;

import java.util.ArrayList;
import java.util.List;

public class A {
    private String state;

    public String getState() {
        return state;
    }

    private List<A_Observer> a_observers = new ArrayList<>();


    public void addObserver(A_Observer a_observer){
        a_observers.add(a_observer);
    }



    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        a_observers.forEach(a_observer -> {
            a_observer.update();});
    }
}
