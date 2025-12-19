package org.java.core.lesson4.home_work.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String name;
    private String category;
    private double price;
}