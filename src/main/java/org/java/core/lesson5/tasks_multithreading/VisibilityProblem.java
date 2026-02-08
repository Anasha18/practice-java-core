package org.java.core.lesson5.tasks_multithreading;

public class VisibilityProblem {

    private int value;

    public synchronized void set(int v) {
        value = v;
    }

    public synchronized int get() {
        return value;
    }
}
