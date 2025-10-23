package ru.job4j.tracker;

import java.util.Scanner;

public class MockInput implements Input {

    @Override
    public String askStr(String question) {
        Scanner scanner = new Scanner(System.in);
        question = scanner.nextLine();
        return question;
    }

    @Override
    public int askInt(String question) {
        return 0;
    }
}
