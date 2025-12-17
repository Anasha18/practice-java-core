package org.java.core.lesson1.practice_lesson_1.model;

import org.java.core.lesson1.practice_lesson_1.utils.TeamValidator;

import java.util.Arrays;

public class Team {
    private String name;
    private Student[] members;
    private String description;
    private String projectTopic;
    private Program program;

    public Team(String name, Student[] members, String description, String projectTopic, Program program) {
        TeamValidator.checkCountMembersOfTeam(members,
                name);

        this.name = name;
        this.members = members;
        this.description = description;
        this.projectTopic = projectTopic;
        this.program = program;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getMembers() {
        return members;
    }

    public void setMembers(Student[] members) {
//        if (members.length > 10) {
//            throw new InvalidTeamMembersException(name);
//        }
        TeamValidator.checkCountMembersOfTeam(members, name);

        this.members = members;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProjectTopic() {
        return projectTopic;
    }

    public void setProjectTopic(String projectTopic) {
        this.projectTopic = projectTopic;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public String getTeamAndMembersInfo() {
        StringBuilder sb = new StringBuilder("TeamTitle = ");
        sb.append(name);
        sb.append("\n");
        for (int i = 0; i < members.length; i++) {
            sb.append(members[i].getName());
            sb.append(" ");
            sb.append(members[i].getAge());
            sb.append(" ");
            sb.append("Скиллы");
            sb.append(Arrays.toString(members[i].getSkills()));
            sb.append("\n");
        }

        sb.append("Program=");
        sb.append(program.getName());
        sb.append("\n");
        sb.append("ProjectTopic=");
        sb.append(projectTopic);

        return sb.toString();
    }
}
