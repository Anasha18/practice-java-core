package org.java.core.lesson4.tets_lambdas;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                1. Сумма двух значений.
                2. Умножение двух значений.
                3. Деление двух значений.
                Выберите действие:
                """);

        System.out.println("Результат операции: " +
                OperationImpl.
                        action(
                                scanner.nextInt()
                        )
                        .execute(
                                scanner.nextInt(),
                                scanner.nextInt()
                        )
        );

    }
}
