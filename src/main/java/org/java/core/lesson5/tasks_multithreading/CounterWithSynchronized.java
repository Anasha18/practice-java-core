package org.java.core.lesson5.tasks_multithreading;

public class CounterWithSynchronized {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int get() {
        return count;
    }
}
