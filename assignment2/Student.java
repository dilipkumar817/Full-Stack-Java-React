package com.hcl.assignment2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 22, 85.5));
        studentList.add(new Student("Bob", 20, 75.0));
        studentList.add(new Student("Charlie", 21, 90.2));

        // Sort by age in descending order
        Collections.sort(studentList, Comparator.comparingInt(Student::getAge).reversed());

        // Print sorted list by age
        System.out.println("Sorted by Age:");
        studentList.forEach(System.out::println);

        // Sort by name and grade
        Collections.sort(studentList, Comparator
                .comparing(Student::getName)
                .thenComparingDouble(Student::getGrade));

        // Print sorted list by name and grade
        System.out.println("\nSorted by Name and Grade:");
        studentList.forEach(System.out::println);
    }
}