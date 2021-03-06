package com.company;

public class Main {

    public static void main(String[] args) {
        Singleton1.getInstance();
        System.out.println("------------------");
        Singleton2.getInstance();
        System.out.println("------------------");
        Singleton3.getInstance();
    }
}
