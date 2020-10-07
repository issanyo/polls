package com.polls.repository;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class ParticipantEntity {
    @Id
    private Long id;
    private String name;
    @OneToMany
    private List<OptionEntity> preferences;
}
