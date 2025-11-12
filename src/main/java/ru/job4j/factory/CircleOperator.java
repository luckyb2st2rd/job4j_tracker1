package ru.job4j.factory;

import java.util.Scanner;

public class CircleOperator extends ShapeOperator {

    private Scanner input = new Scanner(System.in);

    @Override
    public Shape createShape() {
        System.out.println("Введите радиус окружности: ");
        int radius = Integer.parseInt(input.nextLine());
        return new Circle(radius);
    }
}
