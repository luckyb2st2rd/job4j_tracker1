package ru.job4j.cast;

public class Airplane implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летит по небу.");
    }

    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " издает звук: Вжуууууууух.");
    }

}
