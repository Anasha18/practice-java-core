package org.java.core.lesson2.extending;

public class Dog extends Animal {
    private boolean gender;

    public Dog(String name, int age, String breed, boolean gender) {
        super(name, age, breed);
        this.gender = gender;
    }

    @Override
    public void introduce() {
        System.out.println("Hello am dog and my gender is " + gender);
        super.introduce();
    }
}
