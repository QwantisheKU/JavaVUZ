package com.company.Prototype;

public class Pizza {
    private PizzaType type;

    public Pizza() {
    }

    public Pizza(PizzaType type) {
        this.type = type;
    }

    public PizzaType getType() {
        return type;
    }

    public void setType(PizzaType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type of your pizza is "+type;
    }
}
