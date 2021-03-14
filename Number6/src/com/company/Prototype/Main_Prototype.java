package com.company.Prototype;

public class Main_Prototype {

    public static void main(String[] args) {
        Pizza hawaiian = new Pizza(PizzaType.HAWAIIAN);
        Pizza supreme = new Pizza(PizzaType.SUPREME);
        hawaiian.setType(PizzaType.PEPPERONI);

        System.out.println(hawaiian);
        System.out.println(supreme);
    }
}
