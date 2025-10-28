package ru.job4j.cast;

public class CowFirst implements AnimalInterfaces {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Му-му.");
    }
}
