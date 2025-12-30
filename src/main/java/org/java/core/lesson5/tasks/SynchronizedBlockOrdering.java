package org.java.core.lesson5.tasks;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedBlockOrdering {

    public synchronized static void addElem(
            List<Integer> list,
            int value
    ) {
        list.add(value);
    }

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Thread.ofPlatform()
                    .start(() -> {
                                addElem(list, 5);
                            }
                    )
                    .join();
        }

        System.out.println(list.size());
    }
}
