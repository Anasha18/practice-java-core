package org.java.core.lesson5.tasks_multithreading;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // task 1
        /*var count = new CounterWithSynchronized();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.increment();
            }
        });

        t1.start();
        t2.start();
        t2.join();
        t2.join();

        System.out.println(count.get());*/

        // task 2
        /*var counter = new CounterWithoutRace();
        var threads = new Thread[10];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.incrementAtomic();
                }
            });
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println(counter.getAtomic());*/

        // task 3
        /*        var flag = new VolatileFlag();

                Thread t1 = new Thread(flag::runLoop);

                t1.start();
                Thread.sleep(1000);
                flag.stop();
                t1.join();*/

        // task 4
        /*var visibility = new VisibilityProblem();

        Thread t = new Thread(() -> {
            visibility.set(50);
        });

        t.start();
        t.join();

        System.out.println(visibility.get());*/

        // task 6
        /*var ordering = new SynchronizedBlockOrdering();

        Thread t1 = new Thread(() -> ordering.add(1));
        Thread t2 = new Thread(() -> ordering.add(2));

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(ordering.get());*/

        
    }
}
