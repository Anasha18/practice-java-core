package org.java.core.lesson1.practice_lesson_1.model;

import org.java.core.lesson1.practice_lesson_1.utils.StudentValidator;

public class Student {
    private String name;
    private String group;
    private int courseNumber;
    private int age;
    private String[] skills;

    public Student(String name, String group, int courseNumber, int age, String[] skills) {
        StudentValidator.validateParams(courseNumber,
                age,
                name);

        this.name = name;
        this.group = group;
        this.courseNumber = courseNumber;
        this.age = age;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
//        if (courseNumber <= 0 || courseNumber > 4) {
//            throw new InvalidStudentInfoParamsException(name);
//        }

        StudentValidator.validateCourseNumber(courseNumber, name);

        this.courseNumber = courseNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        if (age < 17) {
//            throw new InvalidStudentInfoParamsException(name);
//        }

        StudentValidator.validateAge(age, name);

        this.age = age;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
}
