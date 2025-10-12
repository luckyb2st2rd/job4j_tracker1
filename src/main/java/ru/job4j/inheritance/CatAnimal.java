package ru.job4j.inheritance;

public class CatAnimal extends Animal {
    @Override
    public void instanceInvoke() {
        System.out.println("Вызов метода экзмепляра Cat");
    }

    public static void staticInvoke() {
        System.out.println("Вызов статистического метода Cat");
    }
}
