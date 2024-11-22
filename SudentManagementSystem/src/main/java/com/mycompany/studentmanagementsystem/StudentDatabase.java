package com.mycompany.studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
    private final List<Student> students = new ArrayList<>();

    public void addStudent(String name, String id, String department) {
        students.add(new Student(name, id, department));
        System.out.println("Student added successfully.");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the database.");
        } else {
            System.out.println("List of Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}

// Inner Student Class
class Student {
    private String name;
    private String id;
    private String department;

    public Student(String name, String id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Department: " + department;
    }
}


