package com.financeManagement.web.servlet.models;

public class Budget {
    private int id;
    private String category;
    private double amount;
    private int month; // e.g., January = 1
    private int year;
    private User user;

    public Budget(int id, String category, double amount, int month, int year, User user) {
        this.id = id;
        this.category = category;
        this.amount = amount;
        this.month = month;
        this.year = year;
        this.user = user;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
