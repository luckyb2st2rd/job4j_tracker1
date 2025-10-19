package ru.job4j;

public class EscapeExample {
    public static void main(String[] args) {
        String string = "Я изучаю на \"Job4j\" экраннирование символов";
        String string1 = "Я изучаю на 'Job4j' экраннирование символов";
        String string2 = "C:\\projects\\job4j\\File.java";
        char escape = '\"';
        System.out.println(string);
        System.out.println(string1);
        System.out.println(string2);
        System.out.println(escape);
        System.out.println('\'');
        //Стирает строку, возвращает курсор в начало строки
        System.out.print("Старый длинный текст\r");
        System.out.println("Новый текст");
        //Перенос строки
        System.out.println("Первая строка\nВторая строка");
        //Табуляция
        System.out.println("Без отступа");
        System.out.println("\tОдин отступ");
        System.out.println("\t\tДва отступа");
        //Возвращает курсор на позицию назад, удаляет один символ с конца
        System.out.println("Job4jjj\b\b");
    }
}
