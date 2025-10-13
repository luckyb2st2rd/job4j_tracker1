package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String TOMATO = "extra tomato";

    public PizzaExtraCheeseExtraTomato(String filling) {
        super(filling);
    }

    @Override
    public String name() {
        return super.name() + " + " + TOMATO;
    }
}
