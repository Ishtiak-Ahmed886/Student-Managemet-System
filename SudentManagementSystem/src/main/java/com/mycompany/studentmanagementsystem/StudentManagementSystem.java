package com.mycompany.studentmanagementsystem;

import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdminLogin adminLogin = new AdminLogin();
        StudentDatabase studentDatabase = new StudentDatabase();

        System.out.println("Welcome to the Student Management System");
        System.out.print("Enter Admin Username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Admin Password: ");
        String password = scanner.nextLine();

        if (adminLogin.login(username, password)) {
            System.out.println("Login Successful!");
            boolean exit = false;

            while (!exit) {
                System.out.println("\nMenu:");
                System.out.println("1. Add Student");
                System.out.println("2. View Students");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter Student Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Student ID: ");
                        String id = scanner.nextLine();
                        System.out.print("Enter Student Department: ");
                        String department = scanner.nextLine();
                        studentDatabase.addStudent(name, id, department);
                        break;

                    case 2:
                        studentDatabase.viewStudents();
                        break;

                    case 3:
                        exit = true;
                        System.out.println("Exiting the system. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid login credentials. Access denied.");
        }
    }
}


