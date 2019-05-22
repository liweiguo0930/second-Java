package com.soft1841.Proxy;

public class Proxy implements Subject {
    @Override
    public void buyMac() {
        RealSubject realSubject= new RealSubject();
        realSubject.buyMac();
        this.WrapMac();
    }

    private void WrapMac() {
        System.out.println("用盒子包装好Mac");
    }
}
