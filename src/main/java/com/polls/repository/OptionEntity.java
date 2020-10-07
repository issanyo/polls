package com.polls.repository;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class OptionEntity {
    @Id
    private String text;
    private Long start;
    private Long end;
    private Long startDateTime;
    private Long endDateTime;
    private boolean available;
}
