package ru.job4j.inheritance;

public class HideExampleMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new CatAnimal();
        animal.instanceInvoke();
        cat.instanceInvoke();
        Animal.staticInvoke();
        CatAnimal.staticInvoke();
        cat.staticInvoke();
        Animal other = null;
        other.staticInvoke();
        CatAnimal kitty = new CatAnimal();
        kitty.staticInvoke();
    }
}