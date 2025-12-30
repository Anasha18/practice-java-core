package org.java.core.lesson5.multithreading;

public class VolatileExample {
    volatile static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (flag) {
                // do work
                System.out.println("working hard");
            }

            System.out.println("stopped");
        }).start();

        Thread.sleep(1000);
        flag = false;
    }
}
