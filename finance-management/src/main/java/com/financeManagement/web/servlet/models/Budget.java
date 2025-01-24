package com.financeManagement.web.servlet.models;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Budget {
    private int id;
    private String category;
    private double amount;
    private int month; // e.g., January = 1
    private int year;
    private User user;

}
