package com.polls.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class ParticipantEntity {
    @Id
    private Long id;
    private String name;
    @Embedded
    private List<Boolean> preferences = new ArrayList<>();
}
