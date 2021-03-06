package com.company;

import java.util.Random;

public class GenNames implements Runnable {
    private String[] names = {"David", "Maria", "Patrick", "John", "Kent", "Jessica", "Agnessa", "Robert", "Jefrey", "Samantha", "Elizabeth"};
    private Random random = new Random();

    @Override
    public void run() {
        try {
            System.out.println(names[random.nextInt(names.length)]);
            Thread.sleep(random.nextInt(150) + 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("We run it!");
    }
}
