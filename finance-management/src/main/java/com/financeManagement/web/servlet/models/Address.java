package com.financeManagement.web.servlet.models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private int id;
    private String street;
    private String city;
    private String state;
    private String pin;

}

