package ru.job4j.cast;

public class GuineaPigFirst implements AnimalInterfaces {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " громко пищит для привлечения внимания.");
    }
}
