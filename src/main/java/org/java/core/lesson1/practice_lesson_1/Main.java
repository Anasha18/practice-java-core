package org.java.core.lesson1.practice_lesson_1;

import org.java.core.lesson1.practice_lesson_1.model.Program;
import org.java.core.lesson1.practice_lesson_1.model.Student;
import org.java.core.lesson1.practice_lesson_1.model.Team;

public class Main {
    public static void main(String[] args) {
        String[] teams = {
                "test1",
//                "team1",
//                "team2",
        };

        String[] skils = {
                "web",
                "ai"
        };

        Program pr = new Program("Back-edn", teams);

//        System.out.println(pr.getName());

        Student[] students = {
                new Student("Max", "qwe", 1, 19, skils),
                new  Student("Michael", "qaz", 2, 21, skils),
        };

        Team t1 = new Team("test1", students, "разработка web приложений", "WEB", pr);

        var res = t1.getTeamAndMembersInfo();
        System.out.println(res);
    }
}
