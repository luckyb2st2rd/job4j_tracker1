package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
//      Создаем объект класса Car
        Car car = new Car();
//      Делаем приведение к типу родителя Transport
        Transport transport = car;
//      Делаем приведение к типу родителя Object
        Object object = car;
//      Приведение типа при создании объекта
        Object objectCar = new Car();
//      Приведение типа за счет понижения по иерархии
        Car carFromObject = (Car) objectCar;

//      Ошибка в приведении типа
        Object bicycle = new Bicycle();
        Car carBicycle = (Car) bicycle; // код завершится с ошибкой приведения типов ClassCastException
        System.out.println(new Car());
        System.out.println(new Bicycle());
        System.out.println(new Object());
    }
}
