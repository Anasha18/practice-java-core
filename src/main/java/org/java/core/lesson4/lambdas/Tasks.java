package org.java.core.lesson4.lambdas;


import org.java.core.lesson4.lambdas.model.Employee;
import org.java.core.lesson4.lambdas.model.Product;
import org.java.core.lesson4.lambdas.model.User;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks {
//    static EasyRandom easyRandom = new EasyRandom();
//    private List<User> TEST_USERS = easyRandom.nextObject(User.class);

    private final static List<Integer> NUMBERS = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    private final static List<String> STRINGS = List.of("aaa", "bbb", "ccc", "ddd", "eee", "fff");

    private final static List<String> CHARS = List.of("a", "b", "c", "d", "e", "f", "g", "z", "o", "v");

    private final static List<User> USERS = List.of(
            new User(18, BigDecimal.valueOf(100)),
            new User(18, BigDecimal.valueOf(1000)),
            new User(22, BigDecimal.valueOf(50_000))
    );

    private final static Stream<Product> PRODUCTS = Stream.of(
            new Product("вилка", "планшет", 1000),
            new Product("телефон", "Electronics", 10_000),
            new Product("арбуз", "Electronics", 10_000)
    );

    private final static List<Employee> EMPLOYEES = List.of(
            new Employee(BigDecimal.valueOf(10000)),
            new Employee(BigDecimal.valueOf(15000)),
            new Employee(BigDecimal.valueOf(100))
    );

    public static void main(String[] args) {
        firstTask();
        System.out.println();
        secondTask();
        System.out.println();
        thirdTask();
        fourthTask();
        System.out.println();
        fifthTask();
        System.out.println();
        sixthTask();
        System.out.println();
        seventhTask();
        eighthTask();
        ninthTask();
    }

    // Дана коллекция целых чисел, отфильтруйте и вывидите только четные числы.
    static void firstTask() {
        NUMBERS
                .stream()
                .filter(x -> x % 2 == 0)
                .forEach(System.out::print);
    }

    // Имеется список строк, преобразуйте все строки в верхний регистер и вывидети результат.
    static void secondTask() {
        STRINGS
                .stream()
                .map(String::toUpperCase)
                .forEach(System.out::print);
    }

    // Дана коллекция чисел. Используя Stream API, вычислите и выведите сумму всех элементов.
    static void thirdTask() {
        int filtered = NUMBERS
                .stream()
                .mapToInt(x -> x)
                .sum();
        System.out.println(filtered);

        // .reduce(0, (a, b) -> a + b);
        // шаг 1: a = 0, b = numbers[0].
        // шаг 2: a = результат работы 1 шага(0 + numbers[0]), b = numbers[1].
        // шаг 3: a = результат работы 2 шага(1 + numbers[0] + numbers[1]), b = numbers[2].
    }

    // Имеется список с повторяющимися элементами. Используя Stream API, найдите и выведите уникальные элементы списка.
    static void fourthTask() {
        NUMBERS
                .stream()
                .distinct()
                .forEach(System.out::print);
    }

    //    Дана коллекция строк. Используя Stream API, отсортируйте строки по алфавиту и выведите первые 5 элементов.
    static void fifthTask() {
        CHARS
                .stream()
                .sorted()
                .limit(5)
                .forEach(System.out::print);
    }

    //    Имеется список объектов класса Users с полями age и balance. С помощью Stream API сгруппируйте людей по возрасту и выведите результат.
    static void sixthTask() {
        Map<Integer, List<User>> map = USERS
                .stream()
                .collect(Collectors.groupingBy(User::getAge));

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    //    Дана коллекция объектов класса Employee с полем salary. Используя Stream API, вычислите среднюю зарплату сотрудников.
    static void seventhTask() {
        var avg = EMPLOYEES
                .stream()
                .collect(Collectors
                        .averagingDouble(emp ->
                                emp.salary().doubleValue()
                        )
                );
//                .mapToDouble(BigDecimal.valueOf(Employee::salary))
//                .mapToDouble()
//                .average()
//                .getAsDouble();

        System.out.println(avg);
    }

    //    Имеется список списков целых чисел. Используя Stream API, "разверните" вложенные списки в один поток и найдите максимальное число.
    static void eighthTask() {
        int max = Stream.of(
                        List.of(1, 123, 4, 123, 5, 123, 6),
                        NUMBERS,
                        List.of(-123, -12, 1234)
                )
                .flatMap(List::stream) // приобразование [1, 123, 4, 123, 5, 123, 6, numbers_elems, -123, -12, 1234]
//                .forEach(System.out::print);
                .mapToInt(Integer::intValue)
                .max()
                .orElse(-1);
        System.out.println(max);
    }

    //    Дана коллекция объектов класса Product с полями name, category и price. Используя Stream API, выберите продукты из категории "Electronics" с ценой выше 1000, преобразуйте их названия в верхний регистр и соберите в список.
    static void ninthTask() {
        PRODUCTS
                .filter(product -> product.category().equals("Electronics"))
                .filter(product -> product.price() > 1000)
                .map(product -> product.name().toUpperCase())
                .toList()
                .forEach(System.out::println);
    }
}


