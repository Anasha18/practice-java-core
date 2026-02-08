package org.java.core.lesson5.tasks_multithreading;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterWithoutRace {

    private final Lock lock = new ReentrantLock();
    private final AtomicInteger valueAtomic = new AtomicInteger(0);

    private int value;

    public synchronized void increment() {
        value++;
    }

    public void incrementLock() {
        lock.lock();
        value++;
        lock.unlock();
    }

    public void incrementAtomic() {
        valueAtomic.incrementAndGet();
    }

    public int get() {
        return value;
    }

    public int getAtomic() {
        return valueAtomic.get();
    }
}
