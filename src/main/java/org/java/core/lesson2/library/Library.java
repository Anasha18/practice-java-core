package org.java.core.lesson2.library;


import java.util.Arrays;

public class Library {
    private Rack[] racks;

    public Library(Rack[] racks) {
        this.racks = racks;
    }

    public int racksCount() {
        return racks.length;
    }

    public Rack getRack(int index) {
        if (index < 0 || index >= racks.length) return null;

        return racks[index];
    }

    public int totalBooks() {
        int total = 0;
        for (Rack rack : racks) {
            total += rack.totalBooks();
        }

        return total;
    }

    public Book findByTitle(String title) {
        for (Rack rack : racks) {
            for (Shelf shelf : rack.getShelves()) {
                var book = shelf.findBookByTitle(title);

                if (book != null) return book;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Library{" +
                "racks=" + Arrays.toString(racks) +
                '}';
    }
}
