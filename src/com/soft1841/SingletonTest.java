package com.soft1841;
/**
 * 测试程序
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton object = Singleton.getInstance();
        object.showMessage();
    }
}


