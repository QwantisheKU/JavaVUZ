package com.company;

public class Singleton2 {
    private static Singleton2 instance = new Singleton2();
    private Singleton2() {
        System.out.println("Singleton 2");
    }
    public static Singleton2 getInstance(){
        return instance;
    }
}
