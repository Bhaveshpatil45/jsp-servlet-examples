package com.financeManagement.web.servlet.models;

public class Entity {
    private int id;
    private String name;
    private Contact contact;
    private String type; // e.g., "User"
    private String state; // e.g., "Active" or "Inactive"

    public Entity(int id, String name, Contact contact, String type, String state) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.type = type;
        this.state = state;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
