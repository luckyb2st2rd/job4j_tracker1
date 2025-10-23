package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Автобус едет по 1 маршруту");
    }

    @Override
    public void passengers(int count) {
        count = 13;
        System.out.println("Максимальное число пассавжиров: " + count);
    }

    @Override
    public int refuel(int fuel) {
        int price = 79;
        fuel = 20;
        return fuel * price;
    }
}
