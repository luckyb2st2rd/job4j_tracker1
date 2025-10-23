package ru.job4j.polymorphism;

public class Main {
    public static void main(String[] args) {
        Vehicle townCar = new TownCar();
        townCar.accelerate();
        townCar.brake();
        townCar.steer();
        townCar.changeGear();
        Vehicle sportCar = new SportCar();
        sportCar.accelerate();
        sportCar.brake();
        sportCar.changeGear();
        sportCar.steer();
        sportCar.refill();
        Vehicle.getDragCoefficient();
    }
}
