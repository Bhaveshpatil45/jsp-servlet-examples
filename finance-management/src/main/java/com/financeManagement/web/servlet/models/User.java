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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
