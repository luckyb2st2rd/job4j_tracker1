package ru.job4j.cast;

public class DogFirst implements AnimalInterfaces {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Гав-гав.");
    }
}
