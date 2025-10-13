package ru.job4j.inheritance;

public class Pizza {
    private String filling;

    public Pizza(String filling) {
        this.filling = filling;
    }

    public String name() {
        return filling;
    }
}
