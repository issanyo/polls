package com.polls.repository;

import lombok.Data;

@Data
public class OptionEntity {
    private Long start;
    private Long end;
    private Long startDateTime;
    private Long endDateTime;
    private String text;
    private boolean available;
}
