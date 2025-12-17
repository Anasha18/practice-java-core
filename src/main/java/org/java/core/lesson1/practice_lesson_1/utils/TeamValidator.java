package org.java.core.lesson1.practice_lesson_1.utils;

import org.java.core.lesson1.practice_lesson_1.exception.InvalidTeamMembersException;
import org.java.core.lesson1.practice_lesson_1.model.Student;

public class TeamValidator {

    public static void checkCountMembersOfTeam(Student[] students, String teamName) throws InvalidTeamMembersException {
//        if (students.length > 10) {
//            throw new InvalidTeamMembersException(teamName);
//        }

        int counter = 0;
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];

            if (student != null) {
                counter++;
            }
        }

        if (counter > 10) {
            throw new InvalidTeamMembersException(teamName);
        }
    }
}
