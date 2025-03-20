package com.test.designPattern.singleton;

public class RunSingleton {
    public static void main(String[] args) {
        EarlySingletonExample early = EarlySingletonExample.getInstance();
        early.display();

        LazySingletonExample lazy = LazySingletonExample.getInstance();
        lazy.display();
    }
}
