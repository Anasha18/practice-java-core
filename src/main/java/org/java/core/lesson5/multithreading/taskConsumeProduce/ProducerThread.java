package org.java.core.lesson5.multithreading.taskConsumeProduce;

import lombok.SneakyThrows;

import java.util.Queue;

public class ProducerThread implements Runnable {

    private final Queue<Integer> list;

    public ProducerThread(Queue<Integer> list) {
        this.list = list;
    }

    @SneakyThrows
    @Override
    public void run() {
        synchronized (list) {
            while (true) {
                if (list.size() <= 10){
                    int randomValue = RandomUtil.getRandom();
                    list.add(randomValue);
                    System.out.println("producer add value: " + randomValue + ". Size: " + list.size());
                }else {
                    System.out.println("producer does nothing ");
                }
                list.notifyAll();

                int randomWait = RandomUtil.getRandom(5);
                System.out.println("producer wait: " + randomWait);
                list.wait(randomWait);
            }
        }
    }
}
