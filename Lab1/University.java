package com.company.Lab1;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private int foundationYear;
    List<Student> students = new ArrayList<>();

    public University(String name, int foundationYear, List<Student> students) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public List<Student> getStudents() {
        return students;
    }
     public double getAverage(){
        double sum = 0;
        int studentsNr = this.students.size();
        for(int i=0; i< studentsNr;i++){
            Student currentStudent = this.students.get(i);
            sum = sum + currentStudent.getMark();
        }
        double average = sum/ studentsNr;
        return average;
     }
}
