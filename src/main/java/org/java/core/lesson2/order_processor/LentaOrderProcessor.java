package org.java.core.lesson2.order_processor;

public class LentaOrderProcessor implements OrderProcessor {
    @Override
    public void createOrder() {
        System.out.println("Lenta Create Order");
    }
}
