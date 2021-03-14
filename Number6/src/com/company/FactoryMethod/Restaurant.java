package com.company.FactoryMethod;

public abstract class Restaurant {
    public void orderPizza(PizzaType type){
        Pizza pizza = makePizza(type);
        System.out.println("You have ordered "+pizza.getPizza());
    }
    protected abstract Pizza makePizza(PizzaType type);
}
