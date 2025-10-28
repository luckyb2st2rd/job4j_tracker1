package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по дорогам общего пользования.");
    }

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " издает звук: Врум-врум.");
    }
}
