package com.company.AbstractFactory;

import com.company.Builder.Pizza;

public class Main_Abstract {

    public static void main(String[] args) {
        ItalianRestaurant ir = new ItalianRestaurant();
        ir.makePizza();
        ir.makeCocktail();
        System.out.println();
        AmericanRestaurant ar = new AmericanRestaurant();
        ar.makePizza();
        ar.makeCocktail();
    }
}
