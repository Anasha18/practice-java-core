package org.java.core.lesson5.tasks;

public class VolatileFlag {
    private static volatile boolean flag = true;

    public static void stop() {
        flag = false;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.ofPlatform()
                .start(() -> {
                    while (flag) {
                        System.out.println("Worked");

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }).join();

        Thread.sleep(3000);
        stop();
    }

}
