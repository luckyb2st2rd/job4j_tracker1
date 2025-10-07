package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        Calculator first = new Calculator();
        int result = sum(10);
        System.out.println(result);
        System.out.println("---------");
        System.out.println(first.multiply(2));
        System.out.println("---------");
        int result1 = minus(10);
        System.out.println(result1);
        System.out.println("---------");
        System.out.println(first.divide(50));
        System.out.println("---------");
        System.out.println(first.sumAllOperation(5));
    }
}
