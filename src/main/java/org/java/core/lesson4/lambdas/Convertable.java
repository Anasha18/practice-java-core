package org.java.core.lesson4.lambdas;

@FunctionalInterface
public interface Convertable<A, B> {
    B convert(A a);
}
