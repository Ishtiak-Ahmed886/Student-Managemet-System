package com.mycompany.studentmanagementsystem;

public class AdminLogin {
    private final String adminUsername = "admin";
    private final String adminPassword = "password";

    public boolean login(String username, String password) {
        return username.equals(adminUsername) && password.equals(adminPassword);
    }
}


