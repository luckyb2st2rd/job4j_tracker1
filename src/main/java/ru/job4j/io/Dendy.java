package ru.job4j.io;

import java.util.Scanner;

public class Dendy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Игры.");
            System.out.println("1. Танчики");
            System.out.println("2. Супер Марио");
            System.out.println("3. Выйти");
            System.out.print("Введите пункт меню, чтобы начать игру: ");
            int select = Integer.parseInt(input.nextLine());
            if (select == 3) {
                System.out.println("Game over.");
                run = false;
            } else if (select == 1) {
                System.out.println("Tanks loading...");
            } else if (select == 2) {
                System.out.println("Super Mario loading...");
            } else {
                System.out.println("Такой игры нет");
            }
            System.out.println();
        }
    }
}
