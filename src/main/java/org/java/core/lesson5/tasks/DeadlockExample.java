package org.java.core.lesson5.tasks;

public class DeadlockExample {
    private static Object value = new Object();

    public static void methodA() {
        synchronized (value) {
        }
    }

    public static void methodB() {
        synchronized (value) {
            methodA();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            new Thread(DeadlockExample::methodB).join();
        }
    }

}
