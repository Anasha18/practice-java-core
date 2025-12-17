package org.java.core.lesson1.practice_lesson_1.utils;

import org.java.core.lesson1.practice_lesson_1.exception.InvalidStudentInfoParamsException;

public class StudentValidator {

    public static void validateCourseNumber(int courseNumber,
                                            String nameOfStudent) {
        if (courseNumber <= 0 || courseNumber > 4) {
            throw new InvalidStudentInfoParamsException(nameOfStudent);
        }
    }

    public static void validateAge(int age,
                                   String nameOfStudent) {
        if (age < 17) {
            throw new InvalidStudentInfoParamsException(nameOfStudent);
        }
    }

    public static void validateParams(int courseNumber,
                                      int age,
                                      String nameOfStudent) {
        validateCourseNumber(courseNumber, nameOfStudent);
        validateAge(age, nameOfStudent);
    }
}
