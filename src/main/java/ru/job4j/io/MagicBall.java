package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ich bin ein grosses Orakel. Was willst du wissen? ");
        String frage = input.nextLine();
        int answer = new Random().nextInt(3);
        switch (answer) {
            case 0:
                System.out.println("Ja");
            case 1:
                System.out.println("Nein");
            default:
                System.out.println("Kann sein");
        }
    }
}
