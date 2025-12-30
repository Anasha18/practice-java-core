package org.java.core.lesson5.tasks;

public class VisibilityProblem {
    private static int atomic;

    public synchronized static void setAtomic(int value) {
        atomic = value;
    }

    public synchronized static int getAtomic() {
        return atomic;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread.ofPlatform()
                .start(() -> {
                    for (int i = 0; i < 42; i++) {
                        setAtomic(i);
                    }
                })
                .join();

        System.out.println(getAtomic());

    }
}
