package com.practice.creational.singleton;

public class Singleton {

    private Singleton() {}

    private static final class InstanceHolder {
        static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return InstanceHolder.instance;
    }
}

