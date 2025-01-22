package com.financeManagement.web.servlet.models;


public class Contact {
    private int id;
    private Address address;
    private String email;
    private String mobileNo;

    public Contact(int id, Address address, String email, String mobileNo) {
        this.id = id;
        this.address = address;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    // Getters and setters...
}

