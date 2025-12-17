package org.java.core.lesson1.exception_inerfaces;

public abstract class AbstractAnimal {
    String name;
    int age;

    public AbstractAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void eat();
}
