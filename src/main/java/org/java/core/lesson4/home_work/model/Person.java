package org.java.core.lesson4.home_work.model;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private String city;
    private List<String> skills = List.of("skills");
}