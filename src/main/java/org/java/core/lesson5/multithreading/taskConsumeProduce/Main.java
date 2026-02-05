package org.java.core.lesson5.multithreading.taskConsumeProduce;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> list = new LinkedList<>();

        Thread producerThread = new Thread(new ProducerThread(list));
        Thread consumerThread = new Thread(new ConsumerThread(list));

        producerThread.start();
        consumerThread.start();
        producerThread.join();
        consumerThread.join();


    }
}
