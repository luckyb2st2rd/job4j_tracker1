package ru.job4j.factory;

public class Circle implements Shape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String draw() {
        String ln = System.lineSeparator();
        return "  ****  " + ln
                + " *    * " + ln
                + "*      *" + ln
                + "*      *" + ln
                + " *    * " + ln
                + "  ****  ";
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }
}
