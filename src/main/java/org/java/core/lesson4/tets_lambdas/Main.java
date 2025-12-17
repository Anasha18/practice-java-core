package org.java.core.lesson4.tets_lambdas;

import java.util.Scanner;

public class Main {
    private final static String INFO = """
            Выберите действие:\s
            1. Сумма двух значений.
            2. Умножение двух значений.
            3. Деление двух значений.""";

    private final static String INFO_CHOICE = """
            Введите значение:""";

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Привет, это умный калькулятор");
        System.out.println(INFO);

        int choice = scanner.nextInt();

        System.out.println(INFO_CHOICE);
        int number1 = scanner.nextInt();

        System.out.println(INFO_CHOICE);
        int number2 = scanner.nextInt();


        System.out.println("Результат операции: " +
                OperationImpl.
                        action(choice));

    }
}
