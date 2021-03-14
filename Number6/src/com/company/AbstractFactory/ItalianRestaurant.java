package com.company.AbstractFactory;

public class ItalianRestaurant implements Restaurant{
    public ItalianRestaurant() {
        System.out.println("Italian restaurant");
    }

    @Override
    public Pizza makePizza() {
        return new Margherita();
    }

    @Override
    public Cocktail makeCocktail() {
        return new Bellini();
    }
}
