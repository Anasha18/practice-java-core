package org.java.core.lesson4.lambdas;

import java.util.function.Supplier;

public class MyOptional<T> {
    private T value;

    public MyOptional(T value) {
        this.value = value;
    }

    public T getValue() {
        if (value == null) throw new NullPointerException("Value is null");

        return value;
    }

    public void of(T value) {
        if (value == null) throw new NullPointerException("Value is null");

        this.value = value;
    }

    public Object orElse(Object defaultValue) {
        return value == null ? defaultValue : value;
    }

    public <X extends Throwable> T orElseThrow(Supplier<X> exceptionSupplier) throws X {
        if (value != null) {
            return value;
        } else {
            throw exceptionSupplier.get();
        }

    }
}
