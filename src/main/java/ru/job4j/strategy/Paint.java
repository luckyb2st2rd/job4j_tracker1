package ru.job4j.strategy;

public class Paint {
    public void drawFigure(Shape shape) {
        System.out.println(shape.draw());
    }

    public static void main(String[] args) {
        Paint context = new Paint();
        context.drawFigure(new Triangle());
        context.drawFigure(new Square());
    }
}
