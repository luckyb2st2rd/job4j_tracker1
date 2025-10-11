package ru.job4j.oop;

public class SportsmanMain {
    public static void main(String[] args) {
        FootballPlayer foot = new FootballPlayer();
        foot.footKick();
        foot.run();
        Athlete atlet = new Athlete();
        atlet.run();
        atlet.sprint();
    }
}
