package com.company.Lab1;

import com.company.Lab1.Monitor;
import com.company.Lab1.Student;
import com.company.Lab1.University;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Monitor Asus = new Monitor("Blue", "21-inch", "1920x1080");
	    Monitor Acer = new Monitor("Black", "23-inch", "1920x1080");
        Student student1 = new Student("Dan Ursu", 19, 9);
        Student student2 = new Student("Maria Filipescu", 20, 10);
        Student student3 = new Student("Efrodisia Inglot", 17, 6);
        Student student4 = new Student("Nicolae Iorga", 21, 10);
        Student student5 = new Student("Marius Vanzari", 18, 7);
        Student student6 = new Student("Marian Popescu", 20, 8);

        List<Student> UTM_Students = new ArrayList<>();
        UTM_Students.add(student1);
        UTM_Students.add(student2);

        List<Student> ASEM_Students = new ArrayList<>();
        ASEM_Students.add(student3);
        ASEM_Students.add(student4);

        List<Student> USMF_Students = new ArrayList<>();
        USMF_Students.add(student5);
        USMF_Students.add(student6);

        University ASEM = new University("ASEM", 1974, ASEM_Students);
	    University TUM = new University("UTM", 1964, UTM_Students);
	    University USMF = new University("USMF", 1954, USMF_Students);

        System.out.println("Average media for " +TUM.getName()+" is "+ TUM.getAverage());
        System.out.println("Average media for " +USMF.getName()+" is "+ USMF.getAverage());
        System.out.println("Average media for " +ASEM.getName()+" is "+ ASEM.getAverage());
        double university_average = ( TUM.getAverage() + USMF.getAverage()+ ASEM.getAverage())/3;
        System.out.println("Average between universities is " + university_average);
    }

}
