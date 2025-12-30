package org.java.core.lesson5.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static AtomicInteger atomicCount = new AtomicInteger(0);
    static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(Main::syncIncrement);
        Thread t2 = new Thread(Main::syncIncrement);

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        // 13137
        // 15330
        // 14188

//        System.out.println(atomicCount.get());
        System.out.println(count);
    }

    static void atomicIncrement() {
        for (int i = 0; i < 10_000; i++) {
            atomicCount.incrementAndGet();
        }
    }

    static synchronized void syncIncrement() {
        for (int i = 0; i < 10_000; i++) {
            count++;
        }
    }
}
