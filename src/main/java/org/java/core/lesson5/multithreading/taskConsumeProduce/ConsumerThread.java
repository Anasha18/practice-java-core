package org.java.core.lesson5.multithreading.taskConsumeProduce;

import lombok.SneakyThrows;

import java.util.Queue;

public class ConsumerThread implements Runnable {

    private final Queue<Integer> list;

    public ConsumerThread(Queue<Integer> list) {
        this.list = list;
    }

    @SneakyThrows
    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (!list.isEmpty()) {
                    Integer removedValue = list.remove();
                    System.out.println("consumer get value: " + removedValue + ". Size: " + list.size());
                } else {
                    System.out.println("list is empty");
                }

                int random = RandomUtil.getRandom();
                System.out.println("consumer wait: " + random);
                list.notifyAll();
                list.wait(random);
            }
        }
    }
}
