package org.java.core.lesson5.tasks;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterWithoutRace {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.ofPlatform()
                    .start(CounterWithoutRace::increment)
                    .join();
        }

        System.out.println(getValue());
    }

    private static AtomicInteger value = new AtomicInteger(0);

    public static void increment() {
        value.incrementAndGet();
    }

    public static AtomicInteger getValue() {
        return value;
    }
}
