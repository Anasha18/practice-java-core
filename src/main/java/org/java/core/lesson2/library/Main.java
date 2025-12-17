package org.java.core.lesson2.library;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book("Война и мир", "Толсой", 4000),
            new Book("Капитанская дочка", "Пушкин", 300),
        };

        Shelf[] shelves = {
                new Shelf(books)
        };

        Rack[] racks = {
                new Rack(shelves)
        };

        Library library = new Library(racks);

        System.out.println(library.findByTitle("Война и мир"));
        System.out.println(library.totalBooks());
        System.out.println(library.getRack(1));

    }
}
