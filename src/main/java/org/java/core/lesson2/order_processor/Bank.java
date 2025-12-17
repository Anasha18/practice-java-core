package org.java.core.lesson2.order_processor;

public class Bank {
    private OrderProcessor processor;

    public Bank(OrderProcessor processor) {
        this.processor = processor;
    }

    public void createOrder() {
        processor.createOrder();
    }
}
