package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Naruto", 720);
        Book second = new Book("One piece", 1147);
        Book third = new Book("Clean code", 1000);
        Book fourth = new Book("Tokyo Guhl", 1007);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getCountPage());
        }
        System.out.println("Reverse");
        books[0] = third;
        books[2] = first;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getCountPage());
        }
        System.out.println("Print if name = Clean code");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getCountPage());
            }
        }
    }
}
