package org.java.core.lesson4.home_work;

import org.java.core.lesson4.home_work.model.*;
import org.jeasy.random.EasyRandom;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks {
    private static final EasyRandom generator = new EasyRandom();

    private static final List<Integer> NUMBERS = generator.objects(Integer.class, 5).toList();
    private static final List<String> STRINGS = generator.objects(String.class, 5).toList();
    private static final List<Person> PERSONS = generator.objects(Person.class, 5).toList();
    private static final List<Product> PRODUCTS = generator.objects(Product.class, 5).toList();

    public static List<Integer> firth() {
        return NUMBERS
                .stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .filter(x -> x > 10)
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    public static List<String> second() {
        return STRINGS
                .stream()
                .map(String::toLowerCase)
                .distinct()
                .sorted(
                        Comparator
//                                .naturalOrder()
                                .comparingInt(String::length)
                                .thenComparing(Comparator.naturalOrder())
                )
                .toList();
    }

    public static List<String> third() {
        return PERSONS
                .stream()
                .filter(person -> person.getAge() > 18)
                .map(Person::getName)
                .sorted(Comparator.naturalOrder())
                .toList();
    }

    public static double fourth() {
        return PERSONS
                .stream()
                .mapToInt(Person::getAge)
                .average()
                .orElseThrow(RuntimeException::new);
    }

    public static Map<String, List<Product>> fifth() {
        return PRODUCTS
                .stream()
                .collect(Collectors.groupingBy(Product::getCategory));
    }

    public static void sixth() {
        PRODUCTS
                .stream()
                .allMatch(p -> p.getPrice() > 100);

        PRODUCTS
                .stream()
                .anyMatch(p -> p.getPrice() < 100);

        PRODUCTS
                .stream()
                .noneMatch(p -> p.getPrice() == 100);
    }

    public static List<String> seven() {
        return STRINGS
                .stream()
                .map(s -> s
                        .toLowerCase()
                        .replace("[, !, @, #, $, %, ^, &, *]", " ")
                )
                .flatMap(Stream::of)
                .filter(s -> !s.isEmpty())
                .distinct()
                .sorted(Comparator.naturalOrder())
                .toList();
    }

    public static Map<Boolean, List<Person>> eight() {
        return PERSONS
                .stream()
                .collect(Collectors.partitioningBy(person -> person.getAge() > 18));
    }

    public static Map<String, Double> night() {
        return PRODUCTS
                .stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.summingDouble(Product::getPrice)));
    }

    public static String ten() {
        return PRODUCTS
                .stream()
                .sorted(Comparator.comparing(Product::getName))
                .limit(3)
                .map(Product::getName)
                .collect(
                        Collectors.joining(", ")
                );
    }
}

