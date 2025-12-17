package org.java.core.lesson3.array_list_generics;

public class Main {
    public static void main(String[] args) {
//        Integer[] elements = new Integer[10];

//        ArrayList<Integer> list = new ArrayList<>(elements, 0, 10);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        var num = list.get(0);
        System.out.println(num);

        list.remove(2);
        System.out.println(list);
    }
}
