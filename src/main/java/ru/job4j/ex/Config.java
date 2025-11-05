package ru.job4j.ex;

public class Config {
    public static void load(String path) {
        if (path == null) {
            throw new IllegalStateException("Path could not be null");
        }

        System.out.println("Load config by " + path);
    }

    public static void main(String[] args) {
        Config.load("jdbc://localhost:8080");
    }
}
