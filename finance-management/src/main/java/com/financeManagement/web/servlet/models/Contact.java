package com.financeManagement.web.servlet.models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Contact {
    private int id;
    private Address address;
    private String email;
    private String mobileNo;

}

