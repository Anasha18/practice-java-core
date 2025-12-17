package org.java.core.lesson1.exception_inerfaces;

public class Dog extends AbstractAnimal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    void eat() {
        System.out.printf("lesson1.exception_inerfaces.Dog %s is eating", name);
        System.out.println();
    }
}
