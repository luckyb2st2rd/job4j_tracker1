package ru.job4j.cast;

public class GooseFirst implements AnimalInterfaces {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Га-га.");
    }
}
