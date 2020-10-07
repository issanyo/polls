package com.polls.repository;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class OptionEntity {
    private Long start;
    private Long end;
    private Long startDateTime;
    private Long endDateTime;
    private String text;
    private boolean available;
}
