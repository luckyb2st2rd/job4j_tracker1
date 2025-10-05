package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return eng;
    }

    public static void main(String[] args) {
        DummyDic first = new DummyDic();
        String eng = first.engToRus("Life");
        System.out.println("Неизвестное слово. " + eng);
    }
}
