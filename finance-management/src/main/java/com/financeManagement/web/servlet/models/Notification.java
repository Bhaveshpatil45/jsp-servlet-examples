package com.financeManagement.web.servlet.models;

import lombok.*;

import java.util.Date;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    private int id;
    private String message;
    private String type; // e.g., "Reminder" or "Alert"
    private Date date;
    private User user;

}
