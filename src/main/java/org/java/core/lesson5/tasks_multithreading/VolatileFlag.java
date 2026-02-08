package org.java.core.lesson5.tasks_multithreading;

public class VolatileFlag {

    private volatile boolean flag = true;

    public void stop() {
        flag = false;
    }

    public void runLoop() {
        while (flag) {
            System.out.println("work");
        }
    }
}
