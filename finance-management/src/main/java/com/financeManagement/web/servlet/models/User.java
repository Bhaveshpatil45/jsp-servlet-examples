package com.financeManagement.web.servlet.models;


import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String type; // User, Admin
    private Contact contact;
    private String state; // Active, Inactive
}
