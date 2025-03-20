package com.test.designPattern.singleton;

public class LazySingletonExample {
    private static LazySingletonExample obj;
    private LazySingletonExample() {}

    public static LazySingletonExample getInstance() {
        if(obj == null) {
            synchronized (LazySingletonExample.class) {
                obj = new LazySingletonExample();
            }
        }
        return obj;
    }

    public void display() {
        System.out.println("This is Lazy singleton example");
    }
}
