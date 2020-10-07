package com.polls.dto;

import lombok.Data;

@Data
public class Option {
    private Long start;
    private Long end;
    private Long startDateTime;
    private Long endDateTime;
    private Long date;
    private String text;
    private boolean available;
    private boolean allday;
}
