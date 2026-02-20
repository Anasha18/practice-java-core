package org.java.core.lesson4.lambdas;

public class Converter {

    public static void run() {
        doConvert(x -> String.valueOf(x * x), 5);
    }

    private static void doConvert(
            Convertable<Integer, String> con,
            int num
    ) {
        System.out.println(
                con.convert(num)
        );
    }

}
