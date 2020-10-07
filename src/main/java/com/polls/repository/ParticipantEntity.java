package com.polls.repository;

import java.util.Collection;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class ParticipantEntity {
    private Long id;
    private String name;
    private Collection<Boolean> preferences;
}
