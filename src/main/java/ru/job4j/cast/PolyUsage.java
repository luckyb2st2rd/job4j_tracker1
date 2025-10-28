package ru.job4j.cast;

public class PolyUsage {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal domesticAnimal = new DomesticAnimal();
        Animal cow = new Cow();
        Animal goose = new Goose();
        Animal pet = new Pet();
        Animal dog = new Dog();
        Animal guineaPig = new GuineaPig();

        Animal[] animals = new Animal[]{animal, domesticAnimal, cow, goose, pet, dog, guineaPig};
        for (Animal object : animals) {
            object.sound();
        }
        System.out.println("=============");

        AnimalInterfaces cowFirst = new CowFirst();
        AnimalInterfaces gooseFirst = new GooseFirst();
        AnimalInterfaces dogFirst = new DogFirst();
        AnimalInterfaces guineaPigFirst = new GuineaPigFirst();

        AnimalInterfaces[] animalsfirst = new AnimalInterfaces[]{cowFirst, gooseFirst, dogFirst, guineaPigFirst};
        for (AnimalInterfaces object : animalsfirst) {
            object.sound();
        }
    }
}
