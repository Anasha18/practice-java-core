package org.java.core.lesson1.practice_lesson_1.exception;

public class InvalidTeamMembersException extends RuntimeException {
    public InvalidTeamMembersException(String teamName) {
        super("Количество студентов в группе не должно превышать 10 участников, группа: " + teamName);
    }
}
