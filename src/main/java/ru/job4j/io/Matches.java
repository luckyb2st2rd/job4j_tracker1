package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Game 11");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn
                    ? "Первый игрок"
                    : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int select = Integer.parseInt(input.nextLine());
            if (select < 1 && select > 3) {
                System.out.println("Введите число от 1 до 3");
                continue;
            }
            if (select > count) {
                System.out.println("На столе осталось следующее количество спичек: " + count);
                continue;
            }
            if (select >= 1 && select <= 3) {
                count -= select;
                System.out.println("Спичек осталось: " + count);
            }
            if (count == 0) {
                System.out.println("Выиграл" + player + "игрок");
                break;
            }
            turn = !turn;
        }
    }
}
