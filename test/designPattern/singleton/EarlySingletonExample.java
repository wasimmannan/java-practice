package com.test.designPattern.singleton;

public class EarlySingletonExample {
    //Early singleton
    private final static EarlySingletonExample _INSTANCE = new EarlySingletonExample();

    private EarlySingletonExample(){}

    public static EarlySingletonExample getInstance() {
        return _INSTANCE;
    }

    public void display() {
        System.out.println("This is Early singleton example");
    }
}
