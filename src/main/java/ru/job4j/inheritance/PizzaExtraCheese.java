package ru.job4j.inheritance;

public class PizzaExtraCheese extends Pizza {
    private static final String CHEEASE = "extra cheese";

    public PizzaExtraCheese(String filling) {
        super(filling);
    }

    @Override
    public String name() {
        return super.name() + " + " + CHEEASE;
    }
}
