package org.java.core.lesson1.practice_lesson_1.model;

import org.java.core.lesson1.practice_lesson_1.utils.ProgramValidator;

public class Program {
    private String name;
    private String[] teams;

    public Program(String name, String[] teams) {
        ProgramValidator.validateGroups(teams);

        this.name = name;
        this.teams = teams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        ProgramValidator.validateGroups(teams);

        this.teams = teams;
    }
}
