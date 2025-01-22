package com.financeManagement.web.servlet.models;

public class User {
    private int id;
    private String username;
    private String password;
    private String type; // User, Admin
    private Contact contact;
    private String state; // Active, Inactive

    public User(int id, String username, String password, Contact contact, String type, String state) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.contact = contact;
        this.type = type;
        this.state = state;
    }

    // Getters and setters...
}
