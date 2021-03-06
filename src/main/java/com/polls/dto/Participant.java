package com.polls.dto;

import java.util.Collection;

import lombok.Data;

@Data
public class Participant {
    private Long id;
    private String name;
    private Collection<Boolean> preferences;
}
