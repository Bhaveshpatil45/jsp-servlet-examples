package com.financeManagement.web.servlet.models;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Entity {
    private int id;
    private String name;
    private Contact contact;
    private String type; // e.g., "User"
    private String state; // e.g., "Active" or "Inactive"

}
