package com.company.FactoryMethod;

public class FrenchRestaurant extends Restaurant {
    @Override
    protected Pizza makePizza(PizzaType type) {
        Pizza pizza = null;

        switch (type) {
            case PEPPERONI:
                pizza = new FrenchPepperoni();
                break;
            case MARGHERITA:
                pizza = new FrenchMargherita();
                break;
            case HAWAIIAN:
                pizza = new FrenchHawaiian();
                break;
            case SUPREME:
                pizza = new FrenchSupreme();
                break;
        }
        return pizza;
    }
}
