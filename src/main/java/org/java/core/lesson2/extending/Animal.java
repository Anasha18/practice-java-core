package org.java.core.lesson2.extending;

public class Animal {
    protected String name;
    protected int age;
    protected String breed;

    public Animal(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public void introduce() {
        System.out.printf("Animal: %s, %d, %s", name, age, breed);
    }
}
