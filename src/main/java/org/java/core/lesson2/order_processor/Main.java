package org.java.core.lesson2.order_processor;

public class Main {
    public static void main(String[] args) {
        OrderProcessor processor = new LentaOrderProcessor();

        Bank bank = new Bank(processor);
        bank.createOrder();

    }
}
