package org.java.core.lesson5.tasks;

public class CounterWithSynchronized {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 2000; i++) {
            Thread.ofPlatform()
                    .start(CounterWithSynchronized::increment)
                    .join();
        }

        System.out.println(getValue());
    }

    private static int value;

    public static synchronized void increment() {
        value++;
    }

    public static synchronized int getValue() {
        return value;
    }
}
