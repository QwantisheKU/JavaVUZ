package com.company.Builder;

public class Pizza {
    private final String kind;
    private final double diameter;
    private final String filling;
    private final int slices;

    public static class PizzaMaker {
        private String kind = "";
        private double diameter;
        private String filling = "";
        private int slices = 0;

        public PizzaMaker(String kind) {
            this.kind = kind;
        }

        public PizzaMaker diameter(double diameter) {
            this.diameter = diameter;
            return this;
        }

        public PizzaMaker filling(String filling) {
            this.filling = filling;
            return this;
        }

        public PizzaMaker slices(int slices) {
            this.slices = slices;
            return this;
        }

        public Pizza makePizza() {
            return new Pizza(this);
        }
    }

    private Pizza(PizzaMaker type) {
        kind = type.kind;
        diameter = type.diameter;
        filling = type.filling;
        slices = type.slices;
    }

    @Override
    public String toString() {
        return "Pizza stats: diameter - "+diameter+", filling - "+filling+", slices - "+slices;
    }
}
