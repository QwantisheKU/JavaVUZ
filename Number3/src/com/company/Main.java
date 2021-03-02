package com.company;

import java.util.Collections;

public class Main {
    static class thread1 extends Thread {
        @Override
        public void run() {
            SetSemaphore<Integer> ss = new SetSemaphore<>();

            ss.add(13);
            ss.add(47);
            ss.add(182);
            ss.add(-3);

            System.out.println(ss);
            System.out.println(ss.containsAll(Collections.singleton(5)));
            ss.remove(15);
            System.out.println(ss.size());
            System.out.println(ss.isEmpty());


        }
    }
    static class thread2 extends Thread {
        @Override
        public void run() {
            ListSync<Integer> ls = new ListSync<>();
            //trying different methods
            ls.add(2);
            ls.add(6);
            ls.add(1, 17);
            ls.add(93);
            System.out.println("For ListSync {"+ls+"}");
            System.out.println(ls.size());
            System.out.println(ls.contains(6));
            ls.remove(3);
            System.out.println(ls.indexOf(6));
        }
    }
    public static void main(String[] args) {

        thread1 ss = new thread1();
        ss.start();
        thread2 ls = new thread2();
        ls.start();

    }

}