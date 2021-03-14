package com.company.Builder;

public class Main_Builder {

    public static void main(String[] args) {
        Pizza pepperoni = new Pizza.PizzaMaker("Пепперони").diameter(3.14).filling("meat").slices(10).makePizza();
        System.out.println(pepperoni);
        System.out.println();
        Pizza margherita = new Pizza.PizzaMaker("Маргарита").diameter(2.99).filling("сыр").slices(12).makePizza();
        System.out.println(pepperoni);
    }
}
