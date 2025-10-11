package ru.job4j.oop;

public class CalculatorStaticInclude {
    public static class Multiple {

        private final int result;

        public Multiple(int number) {
            result = number;
        }

        public int getResult() {
            return result;
        }
    }

    public static Multiple getMultiple(int value) {
        int result = value * value;
        return new Multiple(result);
    }

    public static void main(String[] args) {
        CalculatorStaticInclude.Multiple multiple = CalculatorStaticInclude.getMultiple(4);
        System.out.println("Квадрат числа равен " + multiple.getResult());
    }
}
