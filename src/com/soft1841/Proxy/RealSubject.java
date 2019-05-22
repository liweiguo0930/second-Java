package com.soft1841.Proxy;

public class RealSubject implements Subject {
    @Override
    public void buyMac() {
        System.out.println("买一台Mac");
    }
}
