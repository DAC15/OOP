package com.company.Lab1;

public class Student {
    private String name;
    private int age;
    private int mark;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMark() {
        return mark;
    }

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }
}
