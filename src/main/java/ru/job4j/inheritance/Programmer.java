package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programLanguage;

    public Programmer(String programLanguage, int experiance, boolean degree) {
        super(experiance, degree);
        this.programLanguage = programLanguage;
    }
}
