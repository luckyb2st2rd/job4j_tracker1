package ru.job4j.polymorphism;

import java.io.File;

public class Service {
    private Store store;

    public Service(Store store) {
        this.store = store;
    }

    public void add() {
        store.save("Artem Chigarov");
    }

    public static void main(String[] args) {
        //MemoryStore store = new MemoryStore();
        FileStore store = new FileStore();
        Service service = new Service(store);
        service.add();
    }
}
