package com.company.FactoryMethod;

public class Main_Factory {

    public static void main(String[] args) {
        System.out.println("Italy restaurant makes pizza");
        Restaurant rest1 = new ItalianRestaurant();
        rest1.orderPizza(PizzaType.PEPPERONI);
        rest1.orderPizza(PizzaType.MARGHERITA);
        rest1.orderPizza(PizzaType.HAWAIIAN);
        rest1.orderPizza(PizzaType.SUPREME);
        System.out.println();
        System.out.println("France restaurant makes pizza");
        Restaurant rest2 = new FrenchRestaurant();
        rest2.orderPizza(PizzaType.PEPPERONI);
        rest2.orderPizza(PizzaType.MARGHERITA);
        rest2.orderPizza(PizzaType.HAWAIIAN);
        rest2.orderPizza(PizzaType.SUPREME);
    }
}
