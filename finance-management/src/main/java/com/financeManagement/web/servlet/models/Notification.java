package com.financeManagement.web.servlet.models;

import java.util.Date;

public class Notification {
    private int id;
    private String message;
    private String type; // e.g., "Reminder" or "Alert"
    private Date date;
    private User user;

    public Notification(int id, String message, String type, Date date, User user) {
        this.id = id;
        this.message = message;
        this.type = type;
        this.date = date;
        this.user = user;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
