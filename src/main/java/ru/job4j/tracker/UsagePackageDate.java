package ru.job4j.tracker;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UsagePackageDate {
    public static void main(String[] args) {
        LocalDate currentData = LocalDate.now();
        System.out.println("Текущая дата: " + currentData);
        System.out.println("--------");
        LocalTime currentTime = LocalTime.now();
        System.out.println("Текущее время: " + currentTime);
        System.out.println("--------");
        LocalDateTime currentDareTime = LocalDateTime.now();
        System.out.println("Текущие дата и время до форматирования: " + currentDareTime);
        System.out.println("--------");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDareTime.format(formatter);
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
    }
}
