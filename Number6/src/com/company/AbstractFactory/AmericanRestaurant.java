package com.company.AbstractFactory;

public class AmericanRestaurant implements Restaurant{
    public AmericanRestaurant() {
        System.out.println("American restaurant");
    }

    @Override
    public Pizza makePizza() {
        return new Pepperoni();
    }

    @Override
    public Cocktail makeCocktail() {
        return new Sazerac();
    }
}
