package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Артем Александрович Чигаров");
        student.setGroup("ДИФ-41");
        student.setStartEducation(new Date());

        System.out.println("Студент: " + student.getFullName() + " поступил в группу "
                + student.getGroup() + " в " + student.getStartEducation());
    }
}
