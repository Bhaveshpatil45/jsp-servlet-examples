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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}

