package ru.job4j.cast;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по рельсам.");
    }

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " издает звук: Чу-чу-чу-чух.");
    }
}
