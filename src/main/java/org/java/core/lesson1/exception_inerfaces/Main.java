package org.java.core.lesson1.exception_inerfaces;

public class Main {
    public static void main(String[] args) {
//        lesson1.exception_inerfaces.Dog dog = new lesson1.exception_inerfaces.Dog("Michael", 1, "African Man");
//        dog.eat();
//
//        lesson1.exception_inerfaces.JobRunnable run = new lesson1.exception_inerfaces.Runner();
//        run.run();

//        try {
//            b();
//        } catch (Exception e) {
//            System.out.printf("%s в классе и строке %s", e.getMessage(), Arrays.toString(e.getStackTrace()));
//        }
//        b();

    }

    public static void b() {
//        throw new Exception("Ошибка");
        throw new RuntimeException("Ошибка");
    }
}