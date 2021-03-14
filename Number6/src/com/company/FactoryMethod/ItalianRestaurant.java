package com.company.FactoryMethod;

public class ItalianRestaurant extends Restaurant {
    @Override
    protected Pizza makePizza(PizzaType type) {
        Pizza pizza = null;

        switch (type) {
            case PEPPERONI:
                pizza = new ItalianPepperoni();
                break;
            case MARGHERITA:
                pizza = new ItalianMargherita();
                break;
            case HAWAIIAN:
                pizza = new ItalianHawaiian();
                break;
            case SUPREME:
                pizza = new ItalianSupreme();
                break;
        }
        return pizza;
    }
}
