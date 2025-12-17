package org.java.core.lesson3.file_work;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        var path = Path.of("students_list.txt");

//        List<String> list = Files.readAllLines(path);
//        System.out.println(list);

//        Files.createFile(Path.of("list.txt"));

        try (
                FileWriter fw =
                        new FileWriter("/Users/nikit/IdeaProjects/test-practice/src/lesson3/file_work/list.txt")
        ) {
            fw.write("Hello World");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
