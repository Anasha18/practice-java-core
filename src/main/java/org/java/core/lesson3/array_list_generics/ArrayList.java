package org.java.core.lesson3.array_list_generics;

import java.util.Arrays;

public class ArrayList<T> {
    private T[] elements;
    // кол-во элементов массива, которые != 0
    private int size = 0;
    // размер массива
    private int capacity = 10;

    public ArrayList(
            T[] elements,
            int size,
            int capacity
    ) {
        this.elements = elements;
        this.size = size;
        this.capacity = capacity;
    }

    public ArrayList() {
        elements = (T[]) new Object[capacity];
    }

    public ArrayList(int capacity) {
        this.capacity = capacity;
        elements = (T[]) new Object[capacity];
    }

    public ArrayList(T[] elements) {
        this.elements = elements;
        capacity = elements.length;

        for (T element : elements) {
            if (element == null) size++;
        }
    }

    public void add(T element) {
        if (element == null) return;

        if (size + 1 == capacity) {
            resize();
        }

        elements[size] = element;
        size++;
    }

    private void resize() {
        T[] newElements = (T[]) new Object[capacity * 2];

        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }

        elements = newElements;
    }

    public T get(int index) {
        if (index < 0 || index > capacity) throw new IndexOutOfBoundsException("Индекс за пределами массива");

        return elements[index];
    }

    public void remove(int index) {
        if (index < 0 || index > capacity) throw new IndexOutOfBoundsException("Индекс за пределами массива");

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
    }

    @Override
    public String toString() {
        return "elements = " + Arrays.toString(elements);
    }
}
