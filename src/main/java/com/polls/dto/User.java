package com.polls.dto;

import lombok.Data;

@Data
public class User {
    private String name;
    private String email;
    private boolean notify;
    private String timeZone;
}
