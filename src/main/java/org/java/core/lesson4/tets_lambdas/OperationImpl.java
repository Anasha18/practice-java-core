package org.java.core.lesson4.tets_lambdas;

public class OperationImpl {
    public static Operation action(int choice) {
        return switch (choice) {
            case 1 -> (x, y) -> x + y;
            case 2 -> (x, y) -> x * y;
            case 3 -> (x, y) -> x / y;
            default -> throw new RuntimeException("Invalid choice");
        };
    }

    public static int action(
            Operation operation,
            int a,
            int b
    ) {
        return operation.execute(a, b);
    }
}
