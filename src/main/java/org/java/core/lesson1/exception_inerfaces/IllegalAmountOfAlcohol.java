package org.java.core.lesson1.exception_inerfaces;

public class IllegalAmountOfAlcohol extends RuntimeException {
    public IllegalAmountOfAlcohol(String message) {
        super(message);
    }
}
