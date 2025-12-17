package org.java.core.lesson1.practice_lesson_1.utils;

public class ProgramValidator {
    private static String[] AVAILABLE = {
            "test1"
    };

    public static void validateGroups(String[] groups) {
        for (int i = 0; i < groups.length; i++) {
            boolean found = false;
            for (int j = 0; j < AVAILABLE.length; j++) {
                if (AVAILABLE[j].equals(groups[i])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                throw new IllegalArgumentException("Group " + groups[i] + " not found");
            }
        }
    }

}
