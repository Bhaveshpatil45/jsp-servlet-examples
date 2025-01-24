package com.financeManagement.web.servlet.models;

import lombok.Data;

import java.util.Date;

@Data
public class Transaction {
    private int id;
    private double amount;
    private String type;
    private String category;
    private Date date;
    private String description;
    private User user;

}
