package org.java.core.lesson1.practice_lesson_1.exception;

public class InvalidStudentInfoParamsException extends RuntimeException {

    public InvalidStudentInfoParamsException(String nameOfStudent) {
        super("Передана некоректная информация о студенте " + nameOfStudent);
    }
}
