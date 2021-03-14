package com.company.AbstractFactory;

import com.company.AbstractFactory.Pizza;

public interface Restaurant {
    Pizza makePizza();
    Cocktail makeCocktail();
}
