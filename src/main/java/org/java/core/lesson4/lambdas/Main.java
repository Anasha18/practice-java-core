package org.java.core.lesson4.lambdas;

import org.java.core.lesson4.lambdas.model.User;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        /*Runnable r = (x) -> System.out.println("println " + x);

        r.run(10);*/

        /// принимает T возвращает Boolean
        /// проверят, что число соответсвует некоторому условию
        Predicate<Integer> predicate = x -> x % 2 == 0;
        System.out.println(predicate.test(2));

        /// принимает два значнения и конвертирует из T(type) в R(result)
        /// Function<Integer, String> converter = x -> String.valueOf(x); // длинная запись лямбды
        Function<Integer, String> converter = String::valueOf; // упрощенная запись лямбды
        System.out.println(converter.apply(2).getClass());

        /// принимает T(type), делает действие, но ничего не возвращает
        ///  Consumer<String> consumer = x -> System.out.println(x); - длинная запись лямбды
        Consumer<String> consumer = System.out::println; // - упрощенная запись лямбды
        consumer.accept("Hello");

        System.out.println(canSellAlcohol(19, x -> x >= 18));

//        withoutStreams();
//        withStreams();
//        exampleStreams();

        Converter.run();

//        Runnable res = Runnable::run;
    }


    static void withoutStreams() {
        List<User> users = List.of(
                new User(18, BigDecimal.valueOf(100)),
                new User(15, BigDecimal.valueOf(1000)),
                new User(22, BigDecimal.valueOf(50_000))
        );

        List<User> filteredUsers = new ArrayList<>();
        for (User value : users) {
            if (value.getAge() >= 18) {
                filteredUsers.add(value);
            }
        }

        for (User user : filteredUsers) {
            user.setBalance(
                    user
                            .getBalance()
                            .subtract(BigDecimal.valueOf(-100))
            );
        }

        for (User user : filteredUsers) {
            System.out.println(user);
        }
    }

    static void withStreams() {
        List.of(
                        new User(18, BigDecimal.valueOf(100)),
                        new User(15, BigDecimal.valueOf(1000)),
                        new User(22, BigDecimal.valueOf(50_000))
                )
                .stream()
                .filter(user -> user.getAge() >= 18)
                .map(user -> {
                            user.setBalance(
                                    user.getBalance().subtract(BigDecimal.valueOf(-100))
                            );
                            return user;
                        }
                )
                .forEach(System.out::println);
//                .collect(Collectors
//                        .toMap(User::getAge, User::getBalance)
//                );

//        map.forEach((k, v) -> System.out.println(k + " " + v));
    }

    static void exampleStreams() {
        List.of(1, 2, 3, 4, 5, 6)
                .stream()
                .filter(
                        x -> {
                            System.out.println("Filter: " + x);
                            return x > 2;
                        }
                )
                .map(x ->
                        {
                            System.out.println("Map: " + x);
                            return x * x;
                        }
                )
                .forEach(x -> {
                    System.out.println("ForEach " + x);
                    System.out.println(x);
                });
    }

    // тест в методе функционаьный интерфейс
    static boolean canSellAlcohol(
            int age,
            Predicate<Integer> p
    ) {
        return p.test(age);
    }

}

