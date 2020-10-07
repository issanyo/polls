package com.polls.repository;

import java.util.Collection;

import lombok.Data;

@Data
public class ParticipantEntity {
    private Long id;
    private String name;
    private Collection<Boolean> preferences;
}
