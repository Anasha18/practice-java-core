package org.java.core.lesson5.tasks_multithreading;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedBlockOrdering {

    private final List<Integer> list = new ArrayList<>();

    public synchronized void add(int v) {
        list.add(v);
    }

    public List<Integer> get() {
        return list;
    }
}
